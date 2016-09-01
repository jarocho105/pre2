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

import com.bydan.erp.nomina.util.EmpleadoDiscaConstantesFunciones;
import com.bydan.erp.nomina.util.EmpleadoDiscaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.EmpleadoDiscaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.EmpleadoDiscaBean;
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
public class EmpleadoDiscaBeanSwingJInternalFrame extends EmpleadoDiscaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EmpleadoDiscaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EmpleadoDisca> empleadodiscaValidator = new ClassValidator<EmpleadoDisca>(EmpleadoDisca.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EmpleadoDisca empleadodisca;	
	public EmpleadoDisca empleadodiscaAux;
	public EmpleadoDisca empleadodiscaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EmpleadoDisca empleadodiscaTotales;
	public Long idEmpleadoDiscaActual;
	public Long iIdNuevoEmpleadoDisca=0L;
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

	public String sFinalQueryComboTipoDiscapacidad="";

	public List<TipoDiscapacidad> tipodiscapacidadsForeignKey;

	public List<TipoDiscapacidad> gettipodiscapacidadsForeignKey() {
		return tipodiscapacidadsForeignKey;
	}

	public void settipodiscapacidadsForeignKey(List<TipoDiscapacidad> tipodiscapacidadsForeignKey) {
		this.tipodiscapacidadsForeignKey = tipodiscapacidadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoDiscapacidad tipodiscapacidadForeignKey;

	public TipoDiscapacidad gettipodiscapacidadForeignKey() {
		return tipodiscapacidadForeignKey;
	}

	public void settipodiscapacidadForeignKey(TipoDiscapacidad tipodiscapacidadForeignKey) {
		this.tipodiscapacidadForeignKey = tipodiscapacidadForeignKey;
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
	
	public Boolean isPermisoTodoEmpleadoDisca;
	public Boolean isPermisoNuevoEmpleadoDisca;
	public Boolean isPermisoActualizarEmpleadoDisca;
	public Boolean isPermisoActualizarOriginalEmpleadoDisca;
	public Boolean isPermisoEliminarEmpleadoDisca;
	public Boolean isPermisoGuardarCambiosEmpleadoDisca;
	public Boolean isPermisoConsultaEmpleadoDisca;
	public Boolean isPermisoBusquedaEmpleadoDisca;
	public Boolean isPermisoReporteEmpleadoDisca;
	public Boolean isPermisoPaginacionMedioEmpleadoDisca;
	public Boolean isPermisoPaginacionAltoEmpleadoDisca;
	public Boolean isPermisoPaginacionTodoEmpleadoDisca;
	public Boolean isPermisoCopiarEmpleadoDisca;
	public Boolean isPermisoVerFormEmpleadoDisca;
	public Boolean isPermisoDuplicarEmpleadoDisca;
	public Boolean isPermisoOrdenEmpleadoDisca;
	
	
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
	
	public EmpleadoDiscaParameterReturnGeneral empleadodiscaReturnGeneral;
	public EmpleadoDiscaParameterReturnGeneral empleadodiscaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEmpleadoDisca=false;
	public Boolean esParaAccionDesdeFormularioEmpleadoDisca=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EmpleadoDiscaSessionBeanAdditional empleadodiscaSessionBeanAdditional=null;
	
	public EmpleadoDiscaSessionBeanAdditional getEmpleadoDiscaSessionBeanAdditional() {
		return this.empleadodiscaSessionBeanAdditional;
	}
	
	public void setEmpleadoDiscaSessionBeanAdditional(EmpleadoDiscaSessionBeanAdditional empleadodiscaSessionBeanAdditional) {
		try {
			this.empleadodiscaSessionBeanAdditional=empleadodiscaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EmpleadoDiscaBeanSwingJInternalFrameAdditional empleadodiscaBeanSwingJInternalFrameAdditional=null;
	//public class EmpleadoDiscaBeanSwingJInternalFrame
	
	public EmpleadoDiscaBeanSwingJInternalFrameAdditional getEmpleadoDiscaBeanSwingJInternalFrameAdditional() {
		return this.empleadodiscaBeanSwingJInternalFrameAdditional;
	}
	
	public void setEmpleadoDiscaBeanSwingJInternalFrameAdditional(EmpleadoDiscaBeanSwingJInternalFrameAdditional empleadodiscaBeanSwingJInternalFrameAdditional) {
		try {
			this.empleadodiscaBeanSwingJInternalFrameAdditional=empleadodiscaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EmpleadoDiscaLogic empleadodiscaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EmpleadoDisca empleadodiscaBean;
	public EmpleadoDiscaConstantesFunciones empleadodiscaConstantesFunciones;
	//public EmpleadoDiscaParameterReturnGeneral empleadodiscaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public TipoDiscapacidadLogic tipodiscapacidadLogic;
	
	//PARAMETROS
	
	
	//public List<EmpleadoDisca> empleadodiscas;	
	//public List<EmpleadoDisca> empleadodiscasEliminados;
	//public List<EmpleadoDisca> empleadodiscasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEmpleadoDisca=false;
	public Boolean isVisibilidadCeldaDuplicarEmpleadoDisca=true;
	public Boolean isVisibilidadCeldaCopiarEmpleadoDisca=true;
	public Boolean isVisibilidadCeldaVerFormEmpleadoDisca=true;
	public Boolean isVisibilidadCeldaOrdenEmpleadoDisca=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEmpleadoDisca=false;
	public Boolean isVisibilidadCeldaModificarEmpleadoDisca=false;
	public Boolean isVisibilidadCeldaActualizarEmpleadoDisca=false;
	public Boolean isVisibilidadCeldaEliminarEmpleadoDisca=false;
	public Boolean isVisibilidadCeldaCancelarEmpleadoDisca=false;
	public Boolean isVisibilidadCeldaGuardarEmpleadoDisca=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEmpleadoDisca=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoDiscapacidad=false;
	
	public Long getiIdNuevoEmpleadoDisca() {
		return this.iIdNuevoEmpleadoDisca;
	}

	public void setiIdNuevoEmpleadoDisca(Long iIdNuevoEmpleadoDisca) {
		this.iIdNuevoEmpleadoDisca = iIdNuevoEmpleadoDisca;
	}
	
	public Long getidEmpleadoDiscaActual() {
		return this.idEmpleadoDiscaActual;
	}

	public void setidEmpleadoDiscaActual(Long idEmpleadoDiscaActual) {
		this.idEmpleadoDiscaActual = idEmpleadoDiscaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EmpleadoDisca getempleadodisca() {
		return this.empleadodisca;
	}

	public void setempleadodisca(EmpleadoDisca empleadodisca) {
		this.empleadodisca = empleadodisca;
	}
	
	public EmpleadoDisca getempleadodiscaAux() {
		return this.empleadodiscaAux;
	}

	public void setempleadodiscaAux(EmpleadoDisca empleadodiscaAux) {
		this.empleadodiscaAux = empleadodiscaAux;
	}				
	
	public EmpleadoDisca getempleadodiscaAnterior() {
		return this.empleadodiscaAnterior;
	}

	public void setempleadodiscaAnterior(EmpleadoDisca empleadodiscaAnterior) {
		this.empleadodiscaAnterior = empleadodiscaAnterior;
	}	
	
	public EmpleadoDisca getempleadodiscaTotales() {
		return this.empleadodiscaTotales;
	}

	public void setempleadodiscaTotales(EmpleadoDisca empleadodiscaTotales) {
		this.empleadodiscaTotales = empleadodiscaTotales;
	}	
	
	public EmpleadoDisca getempleadodiscaBean() {
		return this.empleadodiscaBean;
	}

	public void setempleadodiscaBean(EmpleadoDisca empleadodiscaBean) {
		this.empleadodiscaBean = empleadodiscaBean;
	}	
	
	public EmpleadoDiscaParameterReturnGeneral getempleadodiscaReturnGeneral() {
		return this.empleadodiscaReturnGeneral;
	}

	public void setempleadodiscaReturnGeneral(EmpleadoDiscaParameterReturnGeneral empleadodiscaReturnGeneral) {
		this.empleadodiscaReturnGeneral = empleadodiscaReturnGeneral;
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

	public Long id_tipo_discapacidadFK_IdTipoDiscapacidad=-1L;

	public Long getid_tipo_discapacidadFK_IdTipoDiscapacidad() {
		return this.id_tipo_discapacidadFK_IdTipoDiscapacidad;
	}

	public void setid_tipo_discapacidadFK_IdTipoDiscapacidad(Long id_tipo_discapacidadFK_IdTipoDiscapacidad) {
		this.id_tipo_discapacidadFK_IdTipoDiscapacidad = id_tipo_discapacidadFK_IdTipoDiscapacidad;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EmpleadoDiscaLogic getEmpleadoDiscaLogic()	{		
		return empleadodiscaLogic;
	}

	public void setEmpleadoDiscaLogic(EmpleadoDiscaLogic empleadodiscaLogic) {
		this.empleadodiscaLogic = empleadodiscaLogic;
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
	
	public Boolean getIsEsNuevoEmpleadoDisca() {
		return isEsNuevoEmpleadoDisca;
	}

	public void setIsEsNuevoEmpleadoDisca(Boolean isEsNuevoEmpleadoDisca) {
		this.isEsNuevoEmpleadoDisca = isEsNuevoEmpleadoDisca;
	}

	public Boolean getEsParaAccionDesdeFormularioEmpleadoDisca() {
		return esParaAccionDesdeFormularioEmpleadoDisca;
	}
	
	public void setEsParaAccionDesdeFormularioEmpleadoDisca(Boolean esParaAccionDesdeFormularioEmpleadoDisca) {
		this.esParaAccionDesdeFormularioEmpleadoDisca = esParaAccionDesdeFormularioEmpleadoDisca;
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

			if(this.empleadodiscaSessionBean==null) {
				this.empleadodiscaSessionBean=new EmpleadoDiscaSessionBean();
			}

			if(!this.empleadodiscaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(empleadodiscaSessionBean.getlidEmpresaActual());
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

			if(this.empleadodiscaSessionBean==null) {
				this.empleadodiscaSessionBean=new EmpleadoDiscaSessionBean();
			}

			if(!this.empleadodiscaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(empleadodiscaSessionBean.getlidEmpleadoActual());
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

	public void cargarCombosTipoDiscapacidadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipodiscapacidadsForeignKey=new ArrayList<TipoDiscapacidad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoDiscapacidadLogic tipodiscapacidadLogic=new TipoDiscapacidadLogic();

			//tipodiscapacidadLogic.getTipoDiscapacidadDataAccess().setIsForForeingKeyData(true);

			if(this.empleadodiscaSessionBean==null) {
				this.empleadodiscaSessionBean=new EmpleadoDiscaSessionBean();
			}

			if(!this.empleadodiscaSessionBean.getisBusquedaDesdeForeignKeySesionTipoDiscapacidad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipodiscapacidadLogic.getTipoDiscapacidadDataAccess().setIsForForeingKeyData(true);

					tipodiscapacidadLogic.getTodosTipoDiscapacidadsWithConnection(sFinalQuery,new Pagination());

					this.tipodiscapacidadsForeignKey=tipodiscapacidadLogic.getTipoDiscapacidads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoDiscapacidad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodiscapacidadLogic.getEntityWithConnection(empleadodiscaSessionBean.getlidTipoDiscapacidadActual());
					this.tipodiscapacidadsForeignKey.add(tipodiscapacidadLogic.getTipoDiscapacidad());
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

					if(this.empleadodisca!=null) {
						this.empleadodisca.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
						this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empresaEmpleadoDisca.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEmpleadoDisca.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empresaEmpleadoDisca.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empresaEmpleadoDisca.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEmpleadoDiscaGenerico)throws Exception
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
				jComboBoxid_empresaEmpleadoDiscaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEmpleadoDiscaGenerico!=null && jComboBoxid_empresaEmpleadoDiscaGenerico.getItemCount()>0) {
					jComboBoxid_empresaEmpleadoDiscaGenerico.setSelectedIndex(0);
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

					if(this.empleadodisca!=null) {
						this.empleadodisca.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
						this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empleadoEmpleadoDisca.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoEmpleadoDisca.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empleadoEmpleadoDisca.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empleadoEmpleadoDisca.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoEmpleadoDisca!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoEmpleadoDisca.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoDisca!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoEmpleadoDisca.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoDisca.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoEmpleadoDisca.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoEmpleadoDiscaGenerico)throws Exception
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
				jComboBoxid_empleadoEmpleadoDiscaGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoEmpleadoDiscaGenerico!=null && jComboBoxid_empleadoEmpleadoDiscaGenerico.getItemCount()>0) {
					jComboBoxid_empleadoEmpleadoDiscaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoDiscapacidadForeignKey(Long idTipoDiscapacidadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoDiscapacidad  tipodiscapacidadTemp=null;

			for(TipoDiscapacidad tipodiscapacidadAux:tipodiscapacidadsForeignKey) {
				if(tipodiscapacidadAux.getId()!=null && tipodiscapacidadAux.getId().equals(idTipoDiscapacidadSeleccionado)) {
					tipodiscapacidadTemp=tipodiscapacidadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipodiscapacidadTemp!=null) {

					if(this.empleadodisca!=null) {
						this.empleadodisca.setTipoDiscapacidad(tipodiscapacidadTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
						this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_tipo_discapacidadEmpleadoDisca.setSelectedItem(tipodiscapacidadTemp);
					}
				} else {
					//jComboBoxid_tipo_discapacidadEmpleadoDisca.setSelectedItem(tipodiscapacidadTemp);
					if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_tipo_discapacidadEmpleadoDisca.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_tipo_discapacidadEmpleadoDisca.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoDiscapacidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipodiscapacidadTemp!=null && jComboBoxid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca!=null) {
						jComboBoxid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca.setSelectedItem(tipodiscapacidadTemp);
					} else {
						if(jComboBoxid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca!=null) {
							//jComboBoxid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca.setSelectedItem(tipodiscapacidadTemp);
							if(jComboBoxid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca.getItemCount()>0) {
								jComboBoxid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca.setSelectedIndex(0);
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

	public String getActualTipoDiscapacidadForeignKeyDescripcion(Long idTipoDiscapacidadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoDiscapacidad  tipodiscapacidadTemp=null;

			for(TipoDiscapacidad tipodiscapacidadAux:tipodiscapacidadsForeignKey) {
				if(tipodiscapacidadAux.getId()!=null && tipodiscapacidadAux.getId().equals(idTipoDiscapacidadSeleccionado)) {
					tipodiscapacidadTemp=tipodiscapacidadAux;
					break;
				}
			}


			sDescripcion=TipoDiscapacidadConstantesFunciones.getTipoDiscapacidadDescripcion(tipodiscapacidadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoDiscapacidadForeignKeyGenerico(Long idTipoDiscapacidadSeleccionado,JComboBox jComboBoxid_tipo_discapacidadEmpleadoDiscaGenerico)throws Exception
	{
		try
		{
			TipoDiscapacidad  tipodiscapacidadTemp=null;

			for(TipoDiscapacidad tipodiscapacidadAux:tipodiscapacidadsForeignKey) {
				if(tipodiscapacidadAux.getId()!=null && tipodiscapacidadAux.getId().equals(idTipoDiscapacidadSeleccionado)) {
					tipodiscapacidadTemp=tipodiscapacidadAux;
					break;
				}
			}

			if(tipodiscapacidadTemp!=null) {
				jComboBoxid_tipo_discapacidadEmpleadoDiscaGenerico.setSelectedItem(tipodiscapacidadTemp);
			} else {
				if(jComboBoxid_tipo_discapacidadEmpleadoDiscaGenerico!=null && jComboBoxid_tipo_discapacidadEmpleadoDiscaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_discapacidadEmpleadoDiscaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EmpleadoDisca empleadodisca,JComboBox jComboBoxid_empresaEmpleadoDiscaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEmpleadoDiscaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empresaEmpleadoDisca.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEmpleadoDiscaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				empleadodisca.setid_empresa(empresaAux.getId());
				empleadodisca.setempresa_descripcion(EmpleadoDiscaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				empleadodisca.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(EmpleadoDisca empleadodisca,JComboBox jComboBoxid_empleadoEmpleadoDiscaGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoEmpleadoDiscaGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empleadoEmpleadoDisca.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoEmpleadoDiscaGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				empleadodisca.setid_empleado(empleadoAux.getId());
				empleadodisca.setempleado_descripcion(EmpleadoDiscaConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				empleadodisca.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoDiscapacidadForeignKey(EmpleadoDisca empleadodisca,JComboBox jComboBoxid_tipo_discapacidadEmpleadoDiscaGenerico)throws Exception
	{
		try
		{
			TipoDiscapacidad  tipodiscapacidadAux=new TipoDiscapacidad();

			if(jComboBoxid_tipo_discapacidadEmpleadoDiscaGenerico==null) {
				tipodiscapacidadAux=(TipoDiscapacidad)this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_tipo_discapacidadEmpleadoDisca.getSelectedItem();
			} else {
				tipodiscapacidadAux=(TipoDiscapacidad)jComboBoxid_tipo_discapacidadEmpleadoDiscaGenerico.getSelectedItem();
			}

			if(tipodiscapacidadAux!=null && tipodiscapacidadAux.getId()!=null) {
				empleadodisca.setid_tipo_discapacidad(tipodiscapacidadAux.getId());
				empleadodisca.settipodiscapacidad_descripcion(EmpleadoDiscaConstantesFunciones.getTipoDiscapacidadDescripcion(tipodiscapacidadAux));
				empleadodisca.setTipoDiscapacidad(tipodiscapacidadAux);			}
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

					if(!EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { 
							this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empresaEmpleadoDisca.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empresaEmpleadoDisca.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { 
					}

					if(!EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { 
							this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empleadoEmpleadoDisca.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empleadoEmpleadoDisca.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { 
					}

					if(!EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoDisca.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoDisca.addItem(empleado);
							}
						}

						if(!EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoDiscapacidadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoDiscapacidad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { 
							this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_tipo_discapacidadEmpleadoDisca.removeAllItems();

							for(TipoDiscapacidad tipodiscapacidad:this.tipodiscapacidadsForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_tipo_discapacidadEmpleadoDisca.addItem(tipodiscapacidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { 
					}

					if(!EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoDiscapacidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca.removeAllItems();

							for(TipoDiscapacidad tipodiscapacidad:this.tipodiscapacidadsForeignKey) {
								this.jComboBoxid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca.addItem(tipodiscapacidad);
							}
						}

						if(!EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
							this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empresaEmpleadoDisca.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
							this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empresaEmpleadoDisca.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
							this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empleadoEmpleadoDisca.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
							this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empleadoEmpleadoDisca.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoDisca.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoDisca.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoDiscapacidadForeignKey(TipoDiscapacidad tipodiscapacidad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
							this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_tipo_discapacidadEmpleadoDisca.setSelectedItem(tipodiscapacidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
							this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_tipo_discapacidadEmpleadoDisca.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca.setSelectedItem(tipodiscapacidad);
						} else {
							this.jComboBoxid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEmpleadoDisca() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EmpleadoDiscaConstantesFunciones.refrescarForeignKeysDescripcionesEmpleadoDisca(this.empleadodiscaLogic.getEmpleadoDiscas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EmpleadoDiscaConstantesFunciones.refrescarForeignKeysDescripcionesEmpleadoDisca(this.empleadodiscas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(TipoDiscapacidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//empleadodiscaLogic.setEmpleadoDiscas(this.empleadodiscas);
			empleadodiscaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EmpleadoDiscaParameterReturnGeneral getEmpleadoDiscaParameterGeneral() {
		return this.empleadodiscaParameterGeneral;
	}
	
	public void setEmpleadoDiscaParameterGeneral(EmpleadoDiscaParameterReturnGeneral empleadodiscaParameterGeneral) {
		this.empleadodiscaParameterGeneral = empleadodiscaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEmpleadoDisca() {
		return isPermisoTodoEmpleadoDisca;
	}

	public void setIsPermisoTodoEmpleadoDisca(Boolean isPermisoTodoEmpleadoDisca) {
		this.isPermisoTodoEmpleadoDisca = isPermisoTodoEmpleadoDisca;
	}

	public Boolean getIsPermisoNuevoEmpleadoDisca() {
		return isPermisoNuevoEmpleadoDisca;
	}

	public void setIsPermisoNuevoEmpleadoDisca(Boolean isPermisoNuevoEmpleadoDisca) {
		this.isPermisoNuevoEmpleadoDisca = isPermisoNuevoEmpleadoDisca;
	}

	public Boolean getIsPermisoActualizarEmpleadoDisca() {
		return isPermisoActualizarEmpleadoDisca;
	}

	public void setIsPermisoActualizarEmpleadoDisca(Boolean isPermisoActualizarEmpleadoDisca) {
		this.isPermisoActualizarEmpleadoDisca = isPermisoActualizarEmpleadoDisca;
	}

	public Boolean getIsPermisoEliminarEmpleadoDisca() {
		return isPermisoEliminarEmpleadoDisca;
	}

	public void setIsPermisoEliminarEmpleadoDisca(Boolean isPermisoEliminarEmpleadoDisca) {
		this.isPermisoEliminarEmpleadoDisca = isPermisoEliminarEmpleadoDisca;
	}

	public Boolean getIsPermisoGuardarCambiosEmpleadoDisca() {
		return isPermisoGuardarCambiosEmpleadoDisca;
	}

	public void setIsPermisoGuardarCambiosEmpleadoDisca(Boolean isPermisoGuardarCambiosEmpleadoDisca) {
		this.isPermisoGuardarCambiosEmpleadoDisca = isPermisoGuardarCambiosEmpleadoDisca;
	}
	
	public Boolean getIsPermisoConsultaEmpleadoDisca() {
		return isPermisoConsultaEmpleadoDisca;
	}

	public void setIsPermisoConsultaEmpleadoDisca(Boolean isPermisoConsultaEmpleadoDisca) {
		this.isPermisoConsultaEmpleadoDisca = isPermisoConsultaEmpleadoDisca;
	}

	public Boolean getIsPermisoBusquedaEmpleadoDisca() {
		return isPermisoBusquedaEmpleadoDisca;
	}

	public void setIsPermisoBusquedaEmpleadoDisca(Boolean isPermisoBusquedaEmpleadoDisca) {
		this.isPermisoBusquedaEmpleadoDisca = isPermisoBusquedaEmpleadoDisca;
	}

	public Boolean getIsPermisoReporteEmpleadoDisca() {
		return isPermisoReporteEmpleadoDisca;
	}

	public void setIsPermisoReporteEmpleadoDisca(Boolean isPermisoReporteEmpleadoDisca) {
		this.isPermisoReporteEmpleadoDisca = isPermisoReporteEmpleadoDisca;
	}
	
	public Boolean getIsPermisoPaginacionMedioEmpleadoDisca() {
		return isPermisoPaginacionMedioEmpleadoDisca;
	}

	public void setIsPermisoPaginacionMedioEmpleadoDisca(Boolean isPermisoPaginacionMedioEmpleadoDisca) {
		this.isPermisoPaginacionMedioEmpleadoDisca = isPermisoPaginacionMedioEmpleadoDisca;
	}
	
	public Boolean getIsPermisoPaginacionTodoEmpleadoDisca() {
		return isPermisoPaginacionTodoEmpleadoDisca;
	}

	public void setIsPermisoPaginacionTodoEmpleadoDisca(Boolean isPermisoPaginacionTodoEmpleadoDisca) {
		this.isPermisoPaginacionTodoEmpleadoDisca = isPermisoPaginacionTodoEmpleadoDisca;
	}
	
	public Boolean getIsPermisoPaginacionAltoEmpleadoDisca() {
		return isPermisoPaginacionAltoEmpleadoDisca;
	}

	public void setIsPermisoPaginacionAltoEmpleadoDisca(Boolean isPermisoPaginacionAltoEmpleadoDisca) {
		this.isPermisoPaginacionAltoEmpleadoDisca = isPermisoPaginacionAltoEmpleadoDisca;
	}
	
	public Boolean getIsPermisoCopiarEmpleadoDisca() {
		return isPermisoCopiarEmpleadoDisca;
	}

	public void setIsPermisoCopiarEmpleadoDisca(Boolean isPermisoCopiarEmpleadoDisca) {
		this.isPermisoCopiarEmpleadoDisca = isPermisoCopiarEmpleadoDisca;
	}
	
	public Boolean getIsPermisoVerFormEmpleadoDisca() {
		return isPermisoVerFormEmpleadoDisca;
	}

	public void setIsPermisoVerFormEmpleadoDisca(Boolean isPermisoVerFormEmpleadoDisca) {
		this.isPermisoVerFormEmpleadoDisca = isPermisoVerFormEmpleadoDisca;
	}
	
	public Boolean getIsPermisoDuplicarEmpleadoDisca() {
		return isPermisoDuplicarEmpleadoDisca;
	}

	public void setIsPermisoDuplicarEmpleadoDisca(Boolean isPermisoDuplicarEmpleadoDisca) {
		this.isPermisoDuplicarEmpleadoDisca = isPermisoDuplicarEmpleadoDisca;
	}
	
	public Boolean getIsPermisoOrdenEmpleadoDisca() {
		return isPermisoOrdenEmpleadoDisca;
	}

	public void setIsPermisoOrdenEmpleadoDisca(Boolean isPermisoOrdenEmpleadoDisca) {
		this.isPermisoOrdenEmpleadoDisca = isPermisoOrdenEmpleadoDisca;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEmpleadoDisca() {
		return isVisibilidadCeldaNuevoEmpleadoDisca;
	}

	public void setIsVisibilidadCeldaNuevoEmpleadoDisca(Boolean isVisibilidadCeldaNuevoEmpleadoDisca) {
		this.isVisibilidadCeldaNuevoEmpleadoDisca = isVisibilidadCeldaNuevoEmpleadoDisca;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEmpleadoDisca() {
		return isVisibilidadCeldaDuplicarEmpleadoDisca;
	}

	public void setIsVisibilidadCeldaDuplicarEmpleadoDisca(Boolean isVisibilidadCeldaDuplicarEmpleadoDisca) {
		this.isVisibilidadCeldaDuplicarEmpleadoDisca = isVisibilidadCeldaDuplicarEmpleadoDisca;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEmpleadoDisca() {
		return isVisibilidadCeldaCopiarEmpleadoDisca;
	}

	public void setIsVisibilidadCeldaCopiarEmpleadoDisca(Boolean isVisibilidadCeldaCopiarEmpleadoDisca) {
		this.isVisibilidadCeldaCopiarEmpleadoDisca = isVisibilidadCeldaCopiarEmpleadoDisca;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEmpleadoDisca() {
		return isVisibilidadCeldaVerFormEmpleadoDisca;
	}

	public void setIsVisibilidadCeldaVerFormEmpleadoDisca(Boolean isVisibilidadCeldaVerFormEmpleadoDisca) {
		this.isVisibilidadCeldaVerFormEmpleadoDisca = isVisibilidadCeldaVerFormEmpleadoDisca;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEmpleadoDisca() {
		return isVisibilidadCeldaOrdenEmpleadoDisca;
	}

	public void setIsVisibilidadCeldaOrdenEmpleadoDisca(Boolean isVisibilidadCeldaOrdenEmpleadoDisca) {
		this.isVisibilidadCeldaOrdenEmpleadoDisca = isVisibilidadCeldaOrdenEmpleadoDisca;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEmpleadoDisca() {
		return isVisibilidadCeldaNuevoRelacionesEmpleadoDisca;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEmpleadoDisca(Boolean isVisibilidadCeldaNuevoRelacionesEmpleadoDisca) {
		this.isVisibilidadCeldaNuevoRelacionesEmpleadoDisca = isVisibilidadCeldaNuevoRelacionesEmpleadoDisca;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEmpleadoDisca() {
		return isVisibilidadCeldaModificarEmpleadoDisca;
	}

	public void setIsVisibilidadCeldaModificarEmpleadoDisca(Boolean isVisibilidadCeldaModificarEmpleadoDisca) {
		this.isVisibilidadCeldaModificarEmpleadoDisca = isVisibilidadCeldaModificarEmpleadoDisca;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEmpleadoDisca() {
		return isVisibilidadCeldaActualizarEmpleadoDisca;
	}

	public void setIsVisibilidadCeldaActualizarEmpleadoDisca(Boolean isVisibilidadCeldaActualizarEmpleadoDisca) {
		this.isVisibilidadCeldaActualizarEmpleadoDisca = isVisibilidadCeldaActualizarEmpleadoDisca;
	}

	public Boolean getIsVisibilidadCeldaEliminarEmpleadoDisca() {
		return isVisibilidadCeldaEliminarEmpleadoDisca;
	}

	public void setIsVisibilidadCeldaEliminarEmpleadoDisca(Boolean isVisibilidadCeldaEliminarEmpleadoDisca) {
		this.isVisibilidadCeldaEliminarEmpleadoDisca = isVisibilidadCeldaEliminarEmpleadoDisca;
	}

	public Boolean getIsVisibilidadCeldaCancelarEmpleadoDisca() {
		return isVisibilidadCeldaCancelarEmpleadoDisca;
	}

	public void setIsVisibilidadCeldaCancelarEmpleadoDisca(Boolean isVisibilidadCeldaCancelarEmpleadoDisca) {
		this.isVisibilidadCeldaCancelarEmpleadoDisca = isVisibilidadCeldaCancelarEmpleadoDisca;
	}

	public Boolean getIsVisibilidadCeldaGuardarEmpleadoDisca() {
		return isVisibilidadCeldaGuardarEmpleadoDisca;
	}

	public void setIsVisibilidadCeldaGuardarEmpleadoDisca(Boolean isVisibilidadCeldaGuardarEmpleadoDisca) {
		this.isVisibilidadCeldaGuardarEmpleadoDisca = isVisibilidadCeldaGuardarEmpleadoDisca;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEmpleadoDisca() {
		return isVisibilidadCeldaGuardarCambiosEmpleadoDisca;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEmpleadoDisca(Boolean isVisibilidadCeldaGuardarCambiosEmpleadoDisca) {
		this.isVisibilidadCeldaGuardarCambiosEmpleadoDisca = isVisibilidadCeldaGuardarCambiosEmpleadoDisca;
	}
		
	public EmpleadoDiscaSessionBean getempleadodiscaSessionBean() {
		return this.empleadodiscaSessionBean;
	}
	
	public void setempleadodiscaSessionBean(EmpleadoDiscaSessionBean empleadodiscaSessionBean) {
		this.empleadodiscaSessionBean=empleadodiscaSessionBean;
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

	public Boolean getisVisibilidadFK_IdTipoDiscapacidad() {
		return this.isVisibilidadFK_IdTipoDiscapacidad;
	}

	public void setisVisibilidadFK_IdTipoDiscapacidad(Boolean isVisibilidadFK_IdTipoDiscapacidad) {
		this.isVisibilidadFK_IdTipoDiscapacidad=isVisibilidadFK_IdTipoDiscapacidad;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(EmpleadoDisca empleadodisca)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(empleadodisca,null);
				this.setActualParaGuardarEmpleadoForeignKey(empleadodisca,null);
				this.setActualParaGuardarTipoDiscapacidadForeignKey(empleadodisca,null);
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
	
	public void bugActualizarReferenciaActual(EmpleadoDisca empleadodisca,EmpleadoDisca empleadodiscaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEmpleadoDisca(empleadodisca);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		empleadodiscaAux.setId(empleadodisca.getId());
		empleadodiscaAux.setVersionRow(empleadodisca.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEmpleadoDisca();
		
			int intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodisca =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.empleadodisca =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEmpleadoDisca(this.empleadodisca,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = empleadodiscaValidator.getInvalidValues(this.empleadodisca);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			empleadodiscaLogic.setDatosCliente(datosCliente);
			empleadodiscaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				empleadodiscaAux=new  EmpleadoDisca();
				
				empleadodiscaAux.setIsNew(true);
				empleadodiscaAux.setIsChanged(true);
				
				empleadodiscaAux.setEmpleadoDiscaOriginal(this.empleadodisca);
				
				empleadodiscaAux.setId(this.empleadodisca.getId());	
				empleadodiscaAux.setVersionRow(this.empleadodisca.getVersionRow());	
				empleadodiscaAux.setid_empresa(this.empleadodisca.getid_empresa());	
				empleadodiscaAux.setid_empleado(this.empleadodisca.getid_empleado());	
				empleadodiscaAux.setid_tipo_discapacidad(this.empleadodisca.getid_tipo_discapacidad());	
				empleadodiscaAux.setporcentaje_inicial(this.empleadodisca.getporcentaje_inicial());	
				empleadodiscaAux.setporcentaje_final(this.empleadodisca.getporcentaje_final());	
				empleadodiscaAux.setdescripcion(this.empleadodisca.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empleadodiscaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empleadodiscaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(empleadodiscaAux,empleadodiscaLogic.getEmpleadoDiscas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadodiscaAux,empleadodiscas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.empleadodiscaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadodiscaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadodiscaLogic.saveEmpleadoDiscas();//WithConnection
						//empleadodiscaLogic.getSetVersionRowEmpleadoDiscas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empleadodisca,empleadodiscaAux);
					
					this.refrescarForeignKeysDescripcionesEmpleadoDisca();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadodiscaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadodiscaLogic.saveEmpleadoDiscaRelaciones(empleadodiscaAux);//WithConnection
								//empleadodiscaLogic.getSetVersionRowEmpleadoDiscas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empleadodisca,empleadodiscaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empleadodiscaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empleadodiscaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empleadodiscaAux,empleadodiscaLogic.getEmpleadoDiscas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empleadodiscaAux,empleadodiscas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empleadodisca,empleadodiscaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				empleadodiscaAux=new  EmpleadoDisca();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado() 
					|| (this.empleadodiscaSessionBean.getEsGuardarRelacionado() && this.empleadodisca.getId()>=0)) {
						
					empleadodiscaAux.setIsNew(false);
				}
				
				empleadodiscaAux.setIsDeleted(false);
			
				empleadodiscaAux.setId(this.empleadodisca.getId());	
				empleadodiscaAux.setVersionRow(this.empleadodisca.getVersionRow());	
				empleadodiscaAux.setid_empresa(this.empleadodisca.getid_empresa());	
				empleadodiscaAux.setid_empleado(this.empleadodisca.getid_empleado());	
				empleadodiscaAux.setid_tipo_discapacidad(this.empleadodisca.getid_tipo_discapacidad());	
				empleadodiscaAux.setporcentaje_inicial(this.empleadodisca.getporcentaje_inicial());	
				empleadodiscaAux.setporcentaje_final(this.empleadodisca.getporcentaje_final());	
				empleadodiscaAux.setdescripcion(this.empleadodisca.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empleadodiscaAux,empleadodiscaLogic.getEmpleadoDiscas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadodiscaAux,empleadodiscas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.empleadodiscaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadodiscaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadodiscaLogic.saveEmpleadoDiscas();//WithConnection
						//empleadodiscaLogic.getSetVersionRowEmpleadoDiscas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empleadodisca,empleadodiscaAux);
					
					this.refrescarForeignKeysDescripcionesEmpleadoDisca();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadodiscaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadodiscaLogic.saveEmpleadoDiscaRelaciones(empleadodiscaAux);//WithConnection
								//empleadodiscaLogic.getSetVersionRowEmpleadoDiscas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empleadodisca,empleadodiscaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empleadodiscaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empleadodiscaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empleadodiscaAux,empleadodiscaLogic.getEmpleadoDiscas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empleadodiscaAux,empleadodiscas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empleadodisca,empleadodiscaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				empleadodiscaAux=new  EmpleadoDisca();
				
				empleadodiscaAux.setIsNew(false);
				empleadodiscaAux.setIsChanged(false);
				
				empleadodiscaAux.setIsDeleted(true);
				
				empleadodiscaAux.setId(this.empleadodisca.getId());	
				empleadodiscaAux.setVersionRow(this.empleadodisca.getVersionRow());	
				empleadodiscaAux.setid_empresa(this.empleadodisca.getid_empresa());	
				empleadodiscaAux.setid_empleado(this.empleadodisca.getid_empleado());	
				empleadodiscaAux.setid_tipo_discapacidad(this.empleadodisca.getid_tipo_discapacidad());	
				empleadodiscaAux.setporcentaje_inicial(this.empleadodisca.getporcentaje_inicial());	
				empleadodiscaAux.setporcentaje_final(this.empleadodisca.getporcentaje_final());	
				empleadodiscaAux.setdescripcion(this.empleadodisca.getdescripcion());	
				
				if(this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.empleadodiscaAux.getId()>=0) {	
						this.empleadodiscasEliminados.add(empleadodiscaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(empleadodiscaAux,empleadodiscaLogic.getEmpleadoDiscas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadodiscaAux,empleadodiscas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.empleadodiscaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadodiscaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadodiscaLogic.saveEmpleadoDiscas();//WithConnection
						//empleadodiscaLogic.getSetVersionRowEmpleadoDiscas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadodiscaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadodiscaLogic.saveEmpleadoDiscaRelaciones(empleadodiscaAux);//WithConnection
								//empleadodiscaLogic.getSetVersionRowEmpleadoDiscas();//WithConnection
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
							if(this.empleadodiscaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.empleadodiscaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(empleadodiscaAux,empleadodiscaLogic.getEmpleadoDiscas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(empleadodiscaAux,empleadodiscas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.getEmpleadoDiscas().addAll(this.empleadodiscasEliminados);
					
					empleadodiscaLogic.saveEmpleadoDiscas();//WithConnection
					//empleadodiscaLogic.getSetVersionRowEmpleadoDiscas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEmpleadoDisca();
				
				this.empleadodiscasEliminados= new ArrayList<EmpleadoDisca>();		
			}
			
			if(this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Empleado Disca GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Empleado Disca",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.empleadodisca=empleadodiscaAux;
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
      		//this.finishProcessEmpleadoDisca();
      	}
		
	}	
	
	public void actualizarRelaciones(EmpleadoDisca empleadodiscaLocal) throws Exception {
		
		if(this.empleadodiscaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EmpleadoDisca empleadodiscaLocal) throws Exception {	
		if(this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				empleadodiscaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				empleadodiscaLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoDiscapacidadDetalleFormJInternalFrame.class)) {
				TipoDiscapacidadBeanSwingJInternalFrame tipodiscapacidadBeanSwingJInternalFrameLocal=(TipoDiscapacidadBeanSwingJInternalFrame) ((TipoDiscapacidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipodiscapacidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoDiscapacidad(tipodiscapacidadBeanSwingJInternalFrameLocal.gettipodiscapacidad(),true);
				tipodiscapacidadBeanSwingJInternalFrameLocal.actualizarLista(tipodiscapacidadBeanSwingJInternalFrameLocal.tipodiscapacidad,this.tipodiscapacidadsForeignKey);

				tipodiscapacidadBeanSwingJInternalFrameLocal.actualizarRelaciones(tipodiscapacidadBeanSwingJInternalFrameLocal.tipodiscapacidad);

				empleadodiscaLocal.setTipoDiscapacidad(tipodiscapacidadBeanSwingJInternalFrameLocal.tipodiscapacidad);

				this.addItemDefectoCombosForeignKeyTipoDiscapacidad();
				this.cargarCombosFrameTipoDiscapacidadsForeignKey("Formulario");
				this.setActualTipoDiscapacidadForeignKey(tipodiscapacidadBeanSwingJInternalFrameLocal.tipodiscapacidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEmpleadoDiscaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empleadodisca =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.empleadodisca =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = empleadodiscaValidator.getInvalidValues(this.empleadodisca);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EmpleadoDisca empleadodisca,List<EmpleadoDisca> empleadodiscas) throws Exception {
		try	{		
			EmpleadoDiscaConstantesFunciones.actualizarLista(empleadodisca,empleadodiscas,this.empleadodiscaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EmpleadoDisca empleadodisca,List<EmpleadoDisca> empleadodiscas) throws Exception {
		try	{			
			EmpleadoDiscaConstantesFunciones.actualizarSelectedLista(empleadodisca,empleadodiscas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EmpleadoDisca> empleadodiscasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				empleadodiscasLocal=this.empleadodiscaLogic.getEmpleadoDiscas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				empleadodiscasLocal=this.empleadodiscas;
			}
			//ARCHITECTURE
		
			for(EmpleadoDisca empleadodiscaLocal:empleadodiscasLocal) {
				if(this.permiteMantenimiento(empleadodiscaLocal) && empleadodiscaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EmpleadoDiscaConstantesFunciones.getEmpleadoDiscaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EmpleadoDiscaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoDisca.jLabelid_empresaEmpleadoDisca,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoDiscaConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoDisca.jLabelid_empleadoEmpleadoDisca,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoDiscaConstantesFunciones.IDTIPODISCAPACIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoDisca.jLabelid_tipo_discapacidadEmpleadoDisca,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoDiscaConstantesFunciones.PORCENTAJEINICIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoDisca.jLabelporcentaje_inicialEmpleadoDisca,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoDiscaConstantesFunciones.PORCENTAJEFINAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoDisca.jLabelporcentaje_finalEmpleadoDisca,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoDiscaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoDisca.jLabeldescripcionEmpleadoDisca,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoDisca.jLabelid_empresaEmpleadoDisca,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoDisca.jLabelid_empleadoEmpleadoDisca,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoDisca.jLabelid_tipo_discapacidadEmpleadoDisca,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoDisca.jLabelporcentaje_inicialEmpleadoDisca,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoDisca.jLabelporcentaje_finalEmpleadoDisca,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoDisca.jLabeldescripcionEmpleadoDisca,"");
		
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
		this.iIdNuevoEmpleadoDisca--;	
		
		
		this.empleadodiscaAux=new EmpleadoDisca();
		
		this.empleadodiscaAux.setId(this.iIdNuevoEmpleadoDisca);
		this.empleadodiscaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empleadodiscaLogic.getEmpleadoDiscas().add(this.empleadodiscaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.empleadodiscas.add(this.empleadodiscaAux);
		}
		//ARCHITECTURE
		
		this.empleadodisca=this.empleadodiscaAux;
		
		if(EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEmpleadoDisca(this.empleadodisca);
			this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoDisca(this.empleadodisca);
		}
				
		//this.setDefaultControlesEmpleadoDisca();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEmpleadoDisca();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEmpleadoDisca();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoDisca();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpleadoDisca(this.empleadodiscaBean,this.empleadodisca,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.empleadodiscaSessionBean.getConGuardarRelaciones()) {
			classes=EmpleadoDiscaConstantesFunciones.getClassesRelationshipsOfEmpleadoDisca(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.empleadodiscaReturnGeneral=empleadodiscaLogic.procesarEventosEmpleadoDiscasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadodiscaLogic.getEmpleadoDiscas(),this.empleadodisca,this.empleadodiscaParameterGeneral,this.isEsNuevoEmpleadoDisca,classes);//this.empleadodiscaLogic.getEmpleadoDisca()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEmpleadoDisca(this.empleadodiscaReturnGeneral,this.empleadodiscaBean,false);
		
		if(this.empleadodiscaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoDisca(this.empleadodiscaReturnGeneral.getEmpleadoDisca());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEmpleadoDisca(this.empleadodiscaReturnGeneral.getEmpleadoDisca());
		}
		
		if(this.empleadodiscaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEmpleadoDisca(this.empleadodiscaReturnGeneral.getEmpleadoDisca(),classes);//this.empleadodiscaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEmpleadoDisca(this.empleadodisca,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEmpleadoDisca();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEmpleadoDisca();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpleadoDiscaBeanSwingJInternalFrameAdditional.RecargarFormEmpleadoDisca(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEmpleadoDisca(false);
						
			if(empleadodiscaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoDisca();
			}
			
			this.actualizarVisualTableDatosEmpleadoDisca();
			
			this.jTableDatosEmpleadoDisca.setRowSelectionInterval(this.getIndiceNuevoEmpleadoDisca(), this.getIndiceNuevoEmpleadoDisca());
			
			this.seleccionarFilaTablaEmpleadoDiscaActual();
						
			this.actualizarEstadoCeldasBotonesEmpleadoDisca("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEmpleadoDisca(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEmpleadoDisca.jTextFieldporcentaje_inicialEmpleadoDisca.setEnabled(isHabilitar && this.empleadodiscaConstantesFunciones.activarporcentaje_inicialEmpleadoDisca);
		this.jInternalFrameDetalleFormEmpleadoDisca.jTextFieldporcentaje_finalEmpleadoDisca.setEnabled(isHabilitar && this.empleadodiscaConstantesFunciones.activarporcentaje_finalEmpleadoDisca);
		this.jInternalFrameDetalleFormEmpleadoDisca.jTextAreadescripcionEmpleadoDisca.setEnabled(isHabilitar && this.empleadodiscaConstantesFunciones.activardescripcionEmpleadoDisca);	
		//
		this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empresaEmpleadoDisca.setEnabled(isHabilitar && this.empleadodiscaConstantesFunciones.activarid_empresaEmpleadoDisca);
		this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empleadoEmpleadoDisca.setEnabled(isHabilitar && this.empleadodiscaConstantesFunciones.activarid_empleadoEmpleadoDisca);
		this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_tipo_discapacidadEmpleadoDisca.setEnabled(isHabilitar && this.empleadodiscaConstantesFunciones.activarid_tipo_discapacidadEmpleadoDisca);
	};
	
	public void setDefaultControlesEmpleadoDisca() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEmpleadoDisca(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.empleadodiscaSessionBean.setConGuardarRelaciones(true);			
			this.empleadodiscaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEmpleadoDisca.jTabbedPaneRelacionesEmpleadoDisca.setVisible(true);
			
					
		} else {
			//this.empleadodiscaSessionBean.setConGuardarRelaciones(false);			
			this.empleadodiscaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEmpleadoDisca.jTabbedPaneRelacionesEmpleadoDisca.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEmpleadoDisca() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoDisca empleadodiscaAux:this.empleadodiscaLogic.getEmpleadoDiscas()) {
				if(empleadodiscaAux.getId().equals(this.iIdNuevoEmpleadoDisca)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoDisca empleadodiscaAux:this.empleadodiscas) {
				if(empleadodiscaAux.getId().equals(this.iIdNuevoEmpleadoDisca)) {
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
	
	public int getIndiceActualEmpleadoDisca(EmpleadoDisca empleadodisca,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoDisca empleadodiscaAux:this.empleadodiscaLogic.getEmpleadoDiscas()) {
				if(empleadodiscaAux.getId().equals(empleadodisca.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoDisca empleadodiscaAux:this.empleadodiscas) {
				if(empleadodiscaAux.getId().equals(empleadodisca.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEmpleadoDisca(EmpleadoDisca empleadodiscaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoDisca empleadodiscaAux:this.empleadodiscaLogic.getEmpleadoDiscas()) {
				if(empleadodiscaAux.getEmpleadoDiscaOriginal().getId().equals(empleadodiscaOriginal.getId())) {
					existe=true;
					empleadodiscaOriginal.setId(empleadodiscaAux.getId());
					empleadodiscaOriginal.setVersionRow(empleadodiscaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoDisca empleadodiscaAux:this.empleadodiscas) {
				if(empleadodiscaAux.getEmpleadoDiscaOriginal().getId().equals(empleadodiscaOriginal.getId())) {
					existe=true;
					empleadodiscaOriginal.setId(empleadodiscaAux.getId());
					empleadodiscaOriginal.setVersionRow(empleadodiscaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEmpleadoDisca(Boolean esParaCancelar) throws Exception {
		empleadodiscasAux=new ArrayList<EmpleadoDisca>();
		empleadodiscaAux=new EmpleadoDisca();
		
		if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpleadoDisca empleadodiscaAux:this.empleadodiscaLogic.getEmpleadoDiscas()) {
					if(empleadodiscaAux.getId()<0) {
						empleadodiscasAux.add(empleadodiscaAux);
					}		
				}
				this.iIdNuevoEmpleadoDisca=0L;
				this.empleadodiscaLogic.getEmpleadoDiscas().removeAll(empleadodiscasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoDisca empleadodiscaAux:this.empleadodiscas) {
					if(empleadodiscaAux.getId()<0) {
						empleadodiscasAux.add(empleadodiscaAux);
					}		
				}
				this.iIdNuevoEmpleadoDisca=0L;
				this.empleadodiscas.removeAll(empleadodiscasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEmpleadoDisca 
					&& this.empleadodiscaLogic.getEmpleadoDiscas().size()>0
					) {
					empleadodiscaAux=this.empleadodiscaLogic.getEmpleadoDiscas().get(this.empleadodiscaLogic.getEmpleadoDiscas().size() - 1);
				
					if(empleadodiscaAux.getId()<0) {
						this.empleadodiscaLogic.getEmpleadoDiscas().remove(empleadodiscaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEmpleadoDisca && this.empleadodiscas.size()>0) {
					empleadodiscaAux=this.empleadodiscas.get(this.empleadodiscas.size() - 1);
				
					if(empleadodiscaAux.getId()<0) {
						this.empleadodiscas.remove(empleadodiscaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEmpleadoDisca(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(empleadodisca.getId()<0) {
				this.empleadodiscaLogic.getEmpleadoDiscas().remove(this.empleadodisca);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(empleadodisca.getId()<0) {
				this.empleadodiscas.remove(this.empleadodisca);
			}
		}			
	}
	
	public void setEstadosInicialesEmpleadoDisca(List<EmpleadoDisca> empleadodiscasAux) throws Exception {
		EmpleadoDiscaConstantesFunciones.setEstadosInicialesEmpleadoDisca(empleadodiscasAux);
	}
	
	public void setEstadosInicialesEmpleadoDisca(EmpleadoDisca empleadodiscaAux) throws Exception {
		EmpleadoDiscaConstantesFunciones.setEstadosInicialesEmpleadoDisca(empleadodiscaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEmpleadoDiscaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEmpleadoDisca("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEmpleadoDiscaActual()) {
				if(!this.isEsNuevoEmpleadoDisca) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEmpleadoDisca("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEmpleadoDisca=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEmpleadoDiscaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Empleado Disca ?", "MANTENIMIENTO DE Empleado Disca", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEmpleadoDisca("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EmpleadoDisca empleadodisca) throws Exception {
		EmpleadoDiscaConstantesFunciones.seleccionarAsignar(this.empleadodisca,empleadodisca);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEmpleadoDisca=this.isPermisoActualizarOriginalEmpleadoDisca;
			
			
			this.seleccionarAsignar(empleadodisca);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpleadoDiscaConstantesFunciones.quitarEspaciosEmpleadoDisca(this.empleadodisca,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEmpleadoDisca("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.empleadodiscaSessionBean.setsFuncionBusquedaRapida(this.empleadodiscaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEmpleadoDisca) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEmpleadoDisca(esParaCancelar);				
				this.cancelarNuevoEmpleadoDisca(esParaCancelar);								
			}
			
			this.empleadodisca=new EmpleadoDisca();
			
			this.inicializarEmpleadoDisca();
			
			this.actualizarEstadoCeldasBotonesEmpleadoDisca("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEmpleadoDisca() throws Exception {
		try {
			EmpleadoDiscaConstantesFunciones.inicializarEmpleadoDisca(this.empleadodisca);
			
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
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.empleadodiscaLogic.getEmpleadoDiscas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEmpleadoDiscas(String sAccionBusqueda,List<EmpleadoDisca> empleadodiscasParaReportes) throws Exception {
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
					sPathReporteFinal="EmpleadoDisca"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EmpleadoDiscaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EmpleadoDiscaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EmpleadoDisca"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Empleado Discas");		
		parameters.put("busquedapor", EmpleadoDiscaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEmpleadoDisca=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EmpleadoDiscaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EmpleadoDiscaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEmpleadoDisca=new JRBeanArrayDataSource(EmpleadoDiscaJInternalFrame.TraerEmpleadoDiscaBeans(empleadodiscasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEmpleadoDisca);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EmpleadoDiscaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EmpleadoDiscaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EmpleadoDiscaBean.TraerEmpleadoDiscaBeans(empleadodiscasParaReportes).toArray()));
							
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
				this.generarExcelReporteEmpleadoDiscas(sAccionBusqueda,sTipoArchivoReporte,empleadodiscasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEmpleadoDiscas(sAccionBusqueda,sTipoArchivoReporte,empleadodiscasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEmpleadoDiscaActionPerformed(null);
					//this.generarExcelReporteEmpleadoDiscas(sAccionBusqueda,sTipoArchivoReporte,empleadodiscasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEmpleadoDiscas(sAccionBusqueda,sTipoArchivoReporte,empleadodiscasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEmpleadoDiscas(sAccionBusqueda,sTipoArchivoReporte,empleadodiscasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEmpleadoDiscas(sAccionBusqueda,sTipoArchivoReporte,empleadodiscasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEmpleadoDiscas(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoDisca> empleadodiscasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadodisca";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoDiscas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpleadoDisca("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EmpleadoDisca empleadodisca : empleadodiscasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EmpleadoDiscaConstantesFunciones.generarExcelReporteDataEmpleadoDisca("NORMAL",row,workbook,empleadodisca,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Disca",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEmpleadoDisca(String sTipo,Row row,Workbook workbook) {
		
		EmpleadoDiscaConstantesFunciones.generarExcelReporteHeaderEmpleadoDisca(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEmpleadoDiscas(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoDisca> empleadodiscasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadodisca_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoDiscas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EmpleadoDisca empleadodisca : empleadodiscasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EmpleadoDiscaConstantesFunciones.getEmpleadoDiscaDescripcion(empleadodisca));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoDiscaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoDiscaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadodisca.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoDiscaConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoDiscaConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadodisca.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoDiscaConstantesFunciones.LABEL_IDTIPODISCAPACIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoDiscaConstantesFunciones.LABEL_IDTIPODISCAPACIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadodisca.gettipodiscapacidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEINICIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEINICIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadodisca.getporcentaje_inicial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEFINAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEFINAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadodisca.getporcentaje_final());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoDiscaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoDiscaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadodisca.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Disca",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEmpleadoDiscas(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoDisca> empleadodiscasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EmpleadoDisca> empleadodiscasRespaldo=null;
		
		classes=EmpleadoDiscaConstantesFunciones.getClassesRelationshipsOfEmpleadoDisca(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.empleadodiscaLogic.setDatosCliente(this.datosCliente);
		this.empleadodiscaLogic.setDatosDeep(this.datosDeep);
		this.empleadodiscaLogic.setIsConDeep(true);
		
		empleadodiscasRespaldo=this.empleadodiscaLogic.getEmpleadoDiscas();
		
		this.empleadodiscaLogic.setEmpleadoDiscas(empleadodiscasParaReportes);	
		this.empleadodiscaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		empleadodiscasParaReportes=this.empleadodiscaLogic.getEmpleadoDiscas();
		this.empleadodiscaLogic.setEmpleadoDiscas(empleadodiscasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadodisca_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoDiscas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpleadoDisca("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EmpleadoDisca empleadodisca : empleadodiscasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEmpleadoDisca("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EmpleadoDiscaConstantesFunciones.generarExcelReporteDataEmpleadoDisca("NORMAL",row,workbook,empleadodisca,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EmpleadoDiscaConstantesFunciones.getEmpleadoDiscaDescripcion(empleadodisca));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Disca",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoDisca.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoDisca.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoDisca.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoDisca.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEmpleadoDisca() throws Exception {		
		this.startProcessEmpleadoDisca(true);
	}
	
	public void startProcessEmpleadoDisca(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEmpleadoDisca ,this.jPanelParametrosReportesEmpleadoDisca, this.jScrollPanelDatosEmpleadoDisca,this.jPanelPaginacionEmpleadoDisca, this.jScrollPanelDatosEdicionEmpleadoDisca, this.jPanelAccionesEmpleadoDisca,this.jPanelAccionesFormularioEmpleadoDisca,this.jmenuBarEmpleadoDisca,this.jmenuBarDetalleEmpleadoDisca,this.jTtoolBarEmpleadoDisca,this.jTtoolBarDetalleEmpleadoDisca);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpleadoDisca=this.jTabbedPaneBusquedasEmpleadoDisca; 
		
		final JPanel jPanelParametrosReportesEmpleadoDisca=this.jPanelParametrosReportesEmpleadoDisca;
		//final JScrollPane jScrollPanelDatosEmpleadoDisca=this.jScrollPanelDatosEmpleadoDisca;
		final JTable jTableDatosEmpleadoDisca=this.jTableDatosEmpleadoDisca;		
		final JPanel jPanelPaginacionEmpleadoDisca=this.jPanelPaginacionEmpleadoDisca;
		//final JScrollPane jScrollPanelDatosEdicionEmpleadoDisca=this.jScrollPanelDatosEdicionEmpleadoDisca;
		final JPanel jPanelAccionesEmpleadoDisca=this.jPanelAccionesEmpleadoDisca;
		
		JPanel jPanelCamposAuxiliarEmpleadoDisca=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEmpleadoDisca=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
			jPanelCamposAuxiliarEmpleadoDisca=this.jInternalFrameDetalleFormEmpleadoDisca.jPanelCamposEmpleadoDisca;
			jPanelAccionesFormularioAuxiliarEmpleadoDisca=this.jInternalFrameDetalleFormEmpleadoDisca.jPanelAccionesFormularioEmpleadoDisca;
		}
		
		final JPanel jPanelCamposEmpleadoDisca=jPanelCamposAuxiliarEmpleadoDisca;
		final JPanel jPanelAccionesFormularioEmpleadoDisca=jPanelAccionesFormularioAuxiliarEmpleadoDisca;
		
		
		final JMenuBar jmenuBarEmpleadoDisca=this.jmenuBarEmpleadoDisca;
		final JToolBar jTtoolBarEmpleadoDisca=this.jTtoolBarEmpleadoDisca;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEmpleadoDisca=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpleadoDisca=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
			jmenuBarDetalleAuxiliarEmpleadoDisca=this.jInternalFrameDetalleFormEmpleadoDisca.jmenuBarDetalleEmpleadoDisca;
			jTtoolBarDetalleAuxiliarEmpleadoDisca=this.jInternalFrameDetalleFormEmpleadoDisca.jTtoolBarDetalleEmpleadoDisca;
		}
		
		final JMenuBar jmenuBarDetalleEmpleadoDisca=jmenuBarDetalleAuxiliarEmpleadoDisca;
		final JToolBar jTtoolBarDetalleEmpleadoDisca=jTtoolBarDetalleAuxiliarEmpleadoDisca;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpleadoDisca;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpleadoDisca;
			processRunnable.jTableDatos=jTableDatosEmpleadoDisca;
			processRunnable.jPanelCampos=jPanelCamposEmpleadoDisca;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpleadoDisca;
			processRunnable.jPanelAcciones=jPanelAccionesEmpleadoDisca;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpleadoDisca;
			
			
			processRunnable.jmenuBar=jmenuBarEmpleadoDisca;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpleadoDisca;
			processRunnable.jTtoolBar=jTtoolBarEmpleadoDisca;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpleadoDisca;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpleadoDisca ,jPanelParametrosReportesEmpleadoDisca,jTableDatosEmpleadoDisca, /*jScrollPanelDatosEmpleadoDisca,*/jPanelCamposEmpleadoDisca,jPanelPaginacionEmpleadoDisca, /*jScrollPanelDatosEdicionEmpleadoDisca,*/ jPanelAccionesEmpleadoDisca,jPanelAccionesFormularioEmpleadoDisca,jmenuBarEmpleadoDisca,jmenuBarDetalleEmpleadoDisca,jTtoolBarEmpleadoDisca,jTtoolBarDetalleEmpleadoDisca);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpleadoDisca ,jPanelParametrosReportesEmpleadoDisca, jScrollPanelDatosEmpleadoDisca,jPanelPaginacionEmpleadoDisca, jScrollPanelDatosEdicionEmpleadoDisca, jPanelAccionesEmpleadoDisca,jPanelAccionesFormularioEmpleadoDisca,jmenuBarEmpleadoDisca,jmenuBarDetalleEmpleadoDisca,jTtoolBarEmpleadoDisca,jTtoolBarDetalleEmpleadoDisca);
						
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
	
	public void finishProcessEmpleadoDisca() {// throws Exception 
		this.finishProcessEmpleadoDisca(true);
	}
	
	public void finishProcessEmpleadoDisca(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEmpleadoDisca ,this.jPanelParametrosReportesEmpleadoDisca, this.jScrollPanelDatosEmpleadoDisca,this.jPanelPaginacionEmpleadoDisca, this.jScrollPanelDatosEdicionEmpleadoDisca, this.jPanelAccionesEmpleadoDisca,this.jPanelAccionesFormularioEmpleadoDisca,this.jmenuBarEmpleadoDisca,this.jmenuBarDetalleEmpleadoDisca,this.jTtoolBarEmpleadoDisca,this.jTtoolBarDetalleEmpleadoDisca);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpleadoDisca=this.jTabbedPaneBusquedasEmpleadoDisca; 
		
		final JPanel jPanelParametrosReportesEmpleadoDisca=this.jPanelParametrosReportesEmpleadoDisca;
		//final JScrollPane jScrollPanelDatosEmpleadoDisca=this.jScrollPanelDatosEmpleadoDisca;
		final JTable jTableDatosEmpleadoDisca=this.jTableDatosEmpleadoDisca;		
		final JPanel jPanelPaginacionEmpleadoDisca=this.jPanelPaginacionEmpleadoDisca;
		//final JScrollPane jScrollPanelDatosEdicionEmpleadoDisca=this.jScrollPanelDatosEdicionEmpleadoDisca;
		final JPanel jPanelAccionesEmpleadoDisca=this.jPanelAccionesEmpleadoDisca;
		
		JPanel jPanelCamposAuxiliarEmpleadoDisca=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEmpleadoDisca=new JPanel();
		
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
			jPanelCamposAuxiliarEmpleadoDisca=this.jInternalFrameDetalleFormEmpleadoDisca.jPanelCamposEmpleadoDisca;
			jPanelAccionesFormularioAuxiliarEmpleadoDisca=this.jInternalFrameDetalleFormEmpleadoDisca.jPanelAccionesFormularioEmpleadoDisca;
		}
		
		final JPanel jPanelCamposEmpleadoDisca=jPanelCamposAuxiliarEmpleadoDisca;
		final JPanel jPanelAccionesFormularioEmpleadoDisca=jPanelAccionesFormularioAuxiliarEmpleadoDisca;
		
		
		final JMenuBar jmenuBarEmpleadoDisca=this.jmenuBarEmpleadoDisca;		
		final JToolBar jTtoolBarEmpleadoDisca=this.jTtoolBarEmpleadoDisca;
				
		JMenuBar jmenuBarDetalleAuxiliarEmpleadoDisca=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpleadoDisca=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
			jmenuBarDetalleAuxiliarEmpleadoDisca=this.jInternalFrameDetalleFormEmpleadoDisca.jmenuBarDetalleEmpleadoDisca;
			jTtoolBarDetalleAuxiliarEmpleadoDisca=this.jInternalFrameDetalleFormEmpleadoDisca.jTtoolBarDetalleEmpleadoDisca;		
		}
		
		final JMenuBar jmenuBarDetalleEmpleadoDisca=jmenuBarDetalleAuxiliarEmpleadoDisca;
		final JToolBar jTtoolBarDetalleEmpleadoDisca=jTtoolBarDetalleAuxiliarEmpleadoDisca;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpleadoDisca;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpleadoDisca;
			processRunnable.jTableDatos=jTableDatosEmpleadoDisca;
			processRunnable.jPanelCampos=jPanelCamposEmpleadoDisca;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpleadoDisca;
			processRunnable.jPanelAcciones=jPanelAccionesEmpleadoDisca;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpleadoDisca;
			
			
			processRunnable.jmenuBar=jmenuBarEmpleadoDisca;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpleadoDisca;
			processRunnable.jTtoolBar=jTtoolBarEmpleadoDisca;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpleadoDisca;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEmpleadoDisca ,jPanelParametrosReportesEmpleadoDisca, jTableDatosEmpleadoDisca,/*jScrollPanelDatosEmpleadoDisca,*/jPanelCamposEmpleadoDisca,jPanelPaginacionEmpleadoDisca, /*jScrollPanelDatosEdicionEmpleadoDisca,*/ jPanelAccionesEmpleadoDisca,jPanelAccionesFormularioEmpleadoDisca,jmenuBarEmpleadoDisca,jmenuBarDetalleEmpleadoDisca,jTtoolBarEmpleadoDisca,jTtoolBarDetalleEmpleadoDisca));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEmpleadoDisca(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEmpleadoDisca(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEmpleadoDisca(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEmpleadoDisca(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEmpleadoDisca,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEmpleadoDisca,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEmpleadoDisca(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEmpleadoDisca,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEmpleadoDisca,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.empleadodiscaConstantesFunciones.getsFinalQueryEmpleadoDisca();
		String  finalQueryPaginacionTodos=this.empleadodiscaConstantesFunciones.getsFinalQueryEmpleadoDisca();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EmpleadoDiscaConstantesFunciones.getArrayColumnasGlobalesNoEmpleadoDisca(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EmpleadoDiscaConstantesFunciones.getArrayColumnasGlobalesEmpleadoDisca(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EmpleadoDiscaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.empleadodiscasEliminados= new ArrayList<EmpleadoDisca>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEmpleadoDisca();
		
				///*EmpleadoDiscaSessionBean*/this.empleadodiscaSessionBean=new EmpleadoDiscaSessionBean();
			
			if(this.empleadodiscaSessionBean==null) {
				this.empleadodiscaSessionBean=new EmpleadoDiscaSessionBean();
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
					this.iNumeroPaginacion=EmpleadoDiscaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EmpleadoDiscaConstantesFunciones.getClassesForeignKeysOfEmpleadoDisca(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/empleadodisca."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			empleadodiscasAux= new ArrayList<EmpleadoDisca>();
			
				
			empleadodiscaLogic.setDatosCliente(this.datosCliente);
			empleadodiscaLogic.setDatosDeep(this.datosDeep);
			empleadodiscaLogic.setIsConDeep(true);
			
			
			empleadodiscaLogic.getEmpleadoDiscaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					empleadodiscaLogic.getTodosEmpleadoDiscas(finalQueryGlobal,pagination);
					
					//empleadodiscaLogic.getTodosEmpleadoDiscasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(empleadodiscaLogic.getEmpleadoDiscas()==null|| empleadodiscaLogic.getEmpleadoDiscas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadodiscasAux= new ArrayList<EmpleadoDisca>();
							empleadodiscasAux.addAll(empleadodiscaLogic.getEmpleadoDiscas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadodiscasAux= new ArrayList<EmpleadoDisca>();
							empleadodiscasAux.addAll(empleadodiscas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadodiscaLogic.getTodosEmpleadoDiscas(finalQueryGlobal+"",this.pagination);												
							
							//empleadodiscaLogic.getTodosEmpleadoDiscasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEmpleadoDiscas("Todos",empleadodiscaLogic.getEmpleadoDiscas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadodiscaLogic.setEmpleadoDiscas(new ArrayList<EmpleadoDisca>());					
							empleadodiscaLogic.getEmpleadoDiscas().addAll(empleadodiscasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadodiscas=new ArrayList<EmpleadoDisca>();
							empleadodiscas.addAll(empleadodiscasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEmpleadoDisca=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEmpleadoDisca=this.idActual;
				
				} else if(this.idEmpleadoDiscaActual!=null && this.idEmpleadoDiscaActual!=0L) {
					idEmpleadoDisca=idEmpleadoDiscaActual;
				}
				
					
				this.sDetalleReporte=EmpleadoDiscaConstantesFunciones.getDetalleIndicePorId(idEmpleadoDisca);
				
				this.empleadodiscas=new ArrayList<EmpleadoDisca>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					empleadodiscaLogic.getEntity(idEmpleadoDisca);
					
					//empleadodiscaLogic.getEntityWithConnection(idEmpleadoDisca);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadodiscaLogic.setEmpleadoDiscas(new ArrayList<EmpleadoDisca>());
					empleadodiscaLogic.getEmpleadoDiscas().add(empleadodiscaLogic.getEmpleadoDisca());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadodiscas=new ArrayList<EmpleadoDisca>();
					this.empleadodiscas.add(empleadodisca);
				}
				
				if(empleadodiscaLogic.getEmpleadoDisca()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=EmpleadoDiscaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadodiscaLogic.getEmpleadoDiscasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoDiscaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoDiscaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadodiscaLogic.getEmpleadoDiscas()==null||empleadodiscaLogic.getEmpleadoDiscas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadodiscas==null|| empleadodiscas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadodiscasAux=new ArrayList<EmpleadoDisca>();
						empleadodiscasAux.addAll(empleadodiscaLogic.getEmpleadoDiscas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadodiscasAux=new ArrayList<EmpleadoDisca>();
							empleadodiscasAux.addAll(empleadodiscas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadodiscaLogic.getEmpleadoDiscasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoDiscaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoDiscaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoDiscas("FK_IdEmpleado",empleadodiscaLogic.getEmpleadoDiscas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoDiscas("FK_IdEmpleado",empleadodiscas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadodiscaLogic.setEmpleadoDiscas(new ArrayList<EmpleadoDisca>());
						empleadodiscaLogic.getEmpleadoDiscas().addAll(empleadodiscasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadodiscas=new ArrayList<EmpleadoDisca>();
							empleadodiscas.addAll(empleadodiscasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=EmpleadoDiscaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadodiscaLogic.getEmpleadoDiscasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoDiscaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoDiscaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadodiscaLogic.getEmpleadoDiscas()==null||empleadodiscaLogic.getEmpleadoDiscas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadodiscas==null|| empleadodiscas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadodiscasAux=new ArrayList<EmpleadoDisca>();
						empleadodiscasAux.addAll(empleadodiscaLogic.getEmpleadoDiscas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadodiscasAux=new ArrayList<EmpleadoDisca>();
							empleadodiscasAux.addAll(empleadodiscas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadodiscaLogic.getEmpleadoDiscasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoDiscaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoDiscaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoDiscas("FK_IdEmpresa",empleadodiscaLogic.getEmpleadoDiscas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoDiscas("FK_IdEmpresa",empleadodiscas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadodiscaLogic.setEmpleadoDiscas(new ArrayList<EmpleadoDisca>());
						empleadodiscaLogic.getEmpleadoDiscas().addAll(empleadodiscasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadodiscas=new ArrayList<EmpleadoDisca>();
							empleadodiscas.addAll(empleadodiscasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoDiscapacidad")) {
				this.sDetalleReporte=EmpleadoDiscaConstantesFunciones.getDetalleIndiceFK_IdTipoDiscapacidad(id_tipo_discapacidadFK_IdTipoDiscapacidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadodiscaLogic.getEmpleadoDiscasFK_IdTipoDiscapacidad(finalQueryGlobal,pagination,id_tipo_discapacidadFK_IdTipoDiscapacidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoDiscaConstantesFunciones.getDetalleIndiceFK_IdTipoDiscapacidad(id_tipo_discapacidadFK_IdTipoDiscapacidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoDiscaConstantesFunciones.getDetalleIndiceFK_IdTipoDiscapacidad(id_tipo_discapacidadFK_IdTipoDiscapacidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadodiscaLogic.getEmpleadoDiscas()==null||empleadodiscaLogic.getEmpleadoDiscas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadodiscas==null|| empleadodiscas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadodiscasAux=new ArrayList<EmpleadoDisca>();
						empleadodiscasAux.addAll(empleadodiscaLogic.getEmpleadoDiscas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadodiscasAux=new ArrayList<EmpleadoDisca>();
							empleadodiscasAux.addAll(empleadodiscas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadodiscaLogic.getEmpleadoDiscasFK_IdTipoDiscapacidad(finalQueryGlobal,pagination,id_tipo_discapacidadFK_IdTipoDiscapacidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoDiscaConstantesFunciones.getDetalleIndiceFK_IdTipoDiscapacidad(id_tipo_discapacidadFK_IdTipoDiscapacidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoDiscaConstantesFunciones.getDetalleIndiceFK_IdTipoDiscapacidad(id_tipo_discapacidadFK_IdTipoDiscapacidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoDiscas("FK_IdTipoDiscapacidad",empleadodiscaLogic.getEmpleadoDiscas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoDiscas("FK_IdTipoDiscapacidad",empleadodiscas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadodiscaLogic.setEmpleadoDiscas(new ArrayList<EmpleadoDisca>());
						empleadodiscaLogic.getEmpleadoDiscas().addAll(empleadodiscasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadodiscas=new ArrayList<EmpleadoDisca>();
							empleadodiscas.addAll(empleadodiscasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEmpleadoDisca();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEmpleadoDisca();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empleadodiscaLogic.getEmpleadoDiscas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadodiscas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empleadodiscaLogic.getEmpleadoDiscas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadodiscas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EmpleadoDisca empleadodisca) {
		Boolean permite=true;
		
		if(this.empleadodisca.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EmpleadoDiscaConstantesFunciones.getOrderByListaEmpleadoDisca();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EmpleadoDiscaConstantesFunciones.getOrderByListaEmpleadoDisca();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoDisca empleadodisca:empleadodiscaLogic.getEmpleadoDiscas()) {
				if(empleadodisca.getsType().equals(Constantes2.S_TOTALES)) {
					empleadodiscaTotales=empleadodisca;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoDisca empleadodisca:this.empleadodiscas) {
				if(empleadodisca.getsType().equals(Constantes2.S_TOTALES)) {
					empleadodiscaTotales=empleadodisca;
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
			this.empleadodiscaAux=new EmpleadoDisca();
			this.empleadodiscaAux.setsType(Constantes2.S_TOTALES);
			this.empleadodiscaAux.setIsNew(false);
			this.empleadodiscaAux.setIsChanged(false);
			this.empleadodiscaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EmpleadoDiscaConstantesFunciones.TotalizarValoresFilaEmpleadoDisca(this.empleadodiscaLogic.getEmpleadoDiscas(),this.empleadodiscaAux);
				
				this.empleadodiscaLogic.getEmpleadoDiscas().add(this.empleadodiscaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EmpleadoDiscaConstantesFunciones.TotalizarValoresFilaEmpleadoDisca(this.empleadodiscas,this.empleadodiscaAux);
				
				this.empleadodiscas.add(this.empleadodiscaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		empleadodiscaTotales=new EmpleadoDisca();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empleadodiscaLogic.getEmpleadoDiscas().remove(empleadodiscaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empleadodiscas.remove(empleadodiscaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		empleadodiscaTotales=new EmpleadoDisca();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoDisca empleadodisca:empleadodiscaLogic.getEmpleadoDiscas()) {
				if(empleadodisca.getsType().equals(Constantes2.S_TOTALES)) {
					empleadodiscaTotales=empleadodisca;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpleadoDiscaConstantesFunciones.TotalizarValoresFilaEmpleadoDisca(this.empleadodiscaLogic.getEmpleadoDiscas(),empleadodiscaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoDisca empleadodisca:this.empleadodiscas) {
				if(empleadodisca.getsType().equals(Constantes2.S_TOTALES)) {
					empleadodiscaTotales=empleadodisca;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpleadoDiscaConstantesFunciones.TotalizarValoresFilaEmpleadoDisca(this.empleadodiscas,empleadodiscaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEmpleadoDiscasFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoDiscasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoDiscasFK_IdTipoDiscapacidad()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoDiscapacidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEmpleadoDiscasFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadodiscaLogic.getEmpleadoDiscasFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoDiscasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadodiscaLogic.getEmpleadoDiscasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoDiscasFK_IdTipoDiscapacidad(String sFinalQuery,Long id_tipo_discapacidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadodiscaLogic.getEmpleadoDiscasFK_IdTipoDiscapacidad(sFinalQuery,this.pagination,id_tipo_discapacidad);
				
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
	
	public void inicializarPermisosEmpleadoDisca() {
		this.isPermisoTodoEmpleadoDisca=false;
		this.isPermisoNuevoEmpleadoDisca=false;
		this.isPermisoActualizarEmpleadoDisca=false;
		this.isPermisoActualizarOriginalEmpleadoDisca=false;
		this.isPermisoEliminarEmpleadoDisca=false;
		this.isPermisoGuardarCambiosEmpleadoDisca=false;
		this.isPermisoConsultaEmpleadoDisca=false;
		this.isPermisoBusquedaEmpleadoDisca=false;
		this.isPermisoReporteEmpleadoDisca=false;		
		this.isPermisoOrdenEmpleadoDisca=false;		
		this.isPermisoPaginacionMedioEmpleadoDisca=false;		
		this.isPermisoPaginacionAltoEmpleadoDisca=false;
		this.isPermisoPaginacionTodoEmpleadoDisca=false;
		this.isPermisoCopiarEmpleadoDisca=false;		
		this.isPermisoVerFormEmpleadoDisca=false;		
		this.isPermisoDuplicarEmpleadoDisca=false;		
		this.isPermisoOrdenEmpleadoDisca=false;		
	}
	
	public void setPermisosUsuarioEmpleadoDisca(Boolean isPermiso) {
		this.isPermisoTodoEmpleadoDisca=isPermiso;
		this.isPermisoNuevoEmpleadoDisca=isPermiso;
		this.isPermisoActualizarEmpleadoDisca=isPermiso;
		this.isPermisoActualizarOriginalEmpleadoDisca=isPermiso;
		this.isPermisoEliminarEmpleadoDisca=isPermiso;
		this.isPermisoGuardarCambiosEmpleadoDisca=isPermiso;
		this.isPermisoConsultaEmpleadoDisca=isPermiso;
		this.isPermisoBusquedaEmpleadoDisca=isPermiso;
		this.isPermisoReporteEmpleadoDisca=isPermiso;
		this.isPermisoOrdenEmpleadoDisca=isPermiso;		
		this.isPermisoPaginacionMedioEmpleadoDisca=isPermiso;		
		this.isPermisoPaginacionAltoEmpleadoDisca=isPermiso;		
		this.isPermisoPaginacionTodoEmpleadoDisca=isPermiso;		
		this.isPermisoCopiarEmpleadoDisca=isPermiso;		
		this.isPermisoVerFormEmpleadoDisca=isPermiso;		
		this.isPermisoDuplicarEmpleadoDisca=isPermiso;
		this.isPermisoOrdenEmpleadoDisca=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEmpleadoDisca(Boolean isPermiso) {
		//this.isPermisoTodoEmpleadoDisca=isPermiso;
		this.isPermisoNuevoEmpleadoDisca=isPermiso;
		this.isPermisoActualizarEmpleadoDisca=isPermiso;
		this.isPermisoActualizarOriginalEmpleadoDisca=isPermiso;
		this.isPermisoEliminarEmpleadoDisca=isPermiso;
		this.isPermisoGuardarCambiosEmpleadoDisca=isPermiso;
		//this.isPermisoConsultaEmpleadoDisca=isPermiso;
		//this.isPermisoBusquedaEmpleadoDisca=isPermiso;
		//this.isPermisoReporteEmpleadoDisca=isPermiso;
		//this.isPermisoOrdenEmpleadoDisca=isPermiso;		
		//this.isPermisoPaginacionMedioEmpleadoDisca=isPermiso;		
		//this.isPermisoPaginacionAltoEmpleadoDisca=isPermiso;		
		//this.isPermisoPaginacionTodoEmpleadoDisca=isPermiso;		
		//this.isPermisoCopiarEmpleadoDisca=isPermiso;		
		//this.isPermisoDuplicarEmpleadoDisca=isPermiso;
		//this.isPermisoOrdenEmpleadoDisca=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEmpleadoDiscaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EmpleadoDiscaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEmpleadoDisca(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEmpleadoDiscaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEmpleadoDiscaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEmpleadoDiscaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEmpleadoDiscaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEmpleadoDisca() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EmpleadoDiscaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EmpleadoDiscaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEmpleadoDisca=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEmpleadoDisca=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEmpleadoDisca=this.isPermisoActualizarEmpleadoDisca;
			this.isPermisoEliminarEmpleadoDisca=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEmpleadoDisca=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEmpleadoDisca=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEmpleadoDisca=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEmpleadoDisca=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEmpleadoDisca=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpleadoDisca=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEmpleadoDisca=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEmpleadoDisca=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEmpleadoDisca=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEmpleadoDisca=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEmpleadoDisca=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEmpleadoDisca=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpleadoDisca=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEmpleadoDisca.setToolTipText(this.jTableDatosEmpleadoDisca.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEmpleadoDisca(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEmpleadoDisca(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EmpleadoDiscaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EmpleadoDiscaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEmpleadoDisca() throws Exception {
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
	public void inicializarCombosForeignKeyEmpleadoDiscaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.tipodiscapacidadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEmpleadoDiscaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EmpleadoDiscaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEmpleadoDiscaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoDiscapacidadListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoDiscapacidadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipodiscapacidadsForeignKey==null||this.tipodiscapacidadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoDiscapacidadConstantesFunciones.getArrayColumnasGlobalesTipoDiscapacidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoDiscapacidadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoDiscapacidadConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoDiscapacidadsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyEmpleadoDiscaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EmpleadoDiscaParameterReturnGeneral empleadodiscaReturnGeneral=new EmpleadoDiscaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.empleadodiscaConstantesFunciones.cargarid_empresaEmpleadoDisca)
					 || (this.esRecargarFks && this.empleadodiscaConstantesFunciones.cargarid_empresaEmpleadoDisca)) {

					if(!this.empleadodiscaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+empleadodiscaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.empleadodiscaConstantesFunciones.cargarid_empleadoEmpleadoDisca)
					 || (this.esRecargarFks && this.empleadodiscaConstantesFunciones.cargarid_empleadoEmpleadoDisca)) {

					if(!this.empleadodiscaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+empleadodiscaSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalTipoDiscapacidad="";

				if(((this.tipodiscapacidadsForeignKey==null||this.tipodiscapacidadsForeignKey.size()<=0) && this.empleadodiscaConstantesFunciones.cargarid_tipo_discapacidadEmpleadoDisca)
					 || (this.esRecargarFks && this.empleadodiscaConstantesFunciones.cargarid_tipo_discapacidadEmpleadoDisca)) {

					if(!this.empleadodiscaSessionBean.getisBusquedaDesdeForeignKeySesionTipoDiscapacidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoDiscapacidadConstantesFunciones.getArrayColumnasGlobalesTipoDiscapacidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoDiscapacidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoDiscapacidadConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoDiscapacidad=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoDiscapacidad, "");
						finalQueryGlobalTipoDiscapacidad+=TipoDiscapacidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoDiscapacidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoDiscapacidad=" WHERE " + ConstantesSql.ID + "="+empleadodiscaSessionBean.getlidTipoDiscapacidadActual();
					}
				} else {
					finalQueryGlobalTipoDiscapacidad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				empleadodiscaReturnGeneral=empleadodiscaLogic.cargarCombosLoteForeignKeyEmpleadoDisca(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalTipoDiscapacidad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=empleadodiscaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=empleadodiscaReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalTipoDiscapacidad.equals("NONE")) {
				this.tipodiscapacidadsForeignKey=empleadodiscaReturnGeneral.gettipodiscapacidadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEmpleadoDisca()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyTipoDiscapacidad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.empleadodiscaSessionBean==null) {
				this.empleadodiscaSessionBean=new EmpleadoDiscaSessionBean();
			}

			if(!this.empleadodiscaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.empleadodiscaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyTipoDiscapacidad()throws Exception {
		try {

			if(!this.empleadodiscaSessionBean.getisBusquedaDesdeForeignKeySesionTipoDiscapacidad()) {
				TipoDiscapacidad tipodiscapacidad=new TipoDiscapacidad();
				TipoDiscapacidadConstantesFunciones.setTipoDiscapacidadDescripcion(tipodiscapacidad,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipodiscapacidad.setId(null);

				if(!TipoDiscapacidadConstantesFunciones.ExisteEnLista(this.tipodiscapacidadsForeignKey,tipodiscapacidad,true)) {

					this.tipodiscapacidadsForeignKey.add(0,tipodiscapacidad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyEmpleadoDisca()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEmpleadoDisca(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEmpleadoDisca()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoDisca();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEmpleadoDisca(EmpleadoDisca empleadodisca)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(empleadodisca.getid_empleado(),false,"Formulario");
			this.setActualTipoDiscapacidadForeignKey(empleadodisca.getid_tipo_discapacidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEmpleadoDisca(EmpleadoDisca empleadodisca,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEmpleadoDisca()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.empleadodiscaConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualTipoDiscapacidadForeignKey(this.empleadodiscaConstantesFunciones.getid_tipo_discapacidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoDisca()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEmpleadoDisca()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEmpleadoDisca()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEmpleadoDisca()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEmpleadoDisca()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameTipoDiscapacidadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEmpleadoDisca(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoDiscapacidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEmpleadoDisca()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empresaEmpleadoDisca!=null && this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empresaEmpleadoDisca.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empresaEmpleadoDisca.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empleadoEmpleadoDisca!=null && this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empleadoEmpleadoDisca.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empleadoEmpleadoDisca.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_tipo_discapacidadEmpleadoDisca!=null && this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_tipo_discapacidadEmpleadoDisca.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_tipo_discapacidadEmpleadoDisca.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public EmpleadoDiscaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EmpleadoDiscaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EmpleadoDiscaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.empleadodiscaSessionBean=new EmpleadoDiscaSessionBean(); 
		this.empleadodiscaConstantesFunciones=new EmpleadoDiscaConstantesFunciones(); 
		this.empleadodiscaBean=new EmpleadoDisca();//(this.empleadodiscaConstantesFunciones); 		
		this.empleadodiscaReturnGeneral=new EmpleadoDiscaParameterReturnGeneral(); 
		
		this.empleadodiscaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadodiscaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EmpleadoDiscaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EmpleadoDiscaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EmpleadoDiscaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEmpleadoDisca(true);
			
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
			
			this.empleadodiscaConstantesFunciones=new EmpleadoDiscaConstantesFunciones(); 
			this.empleadodiscaBean=new EmpleadoDisca();//this.empleadodiscaConstantesFunciones); 			
			this.empleadodiscaReturnGeneral=new EmpleadoDiscaParameterReturnGeneral(); 
		
			EmpleadoDiscaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empleado Disca Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.empleadodisca=new EmpleadoDisca();
			this.empleadodiscas = new ArrayList<EmpleadoDisca>();
			this.empleadodiscasAux = new ArrayList<EmpleadoDisca>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic=new EmpleadoDiscaLogic();
				this.empleadodiscaLogic.getNewConnexionToDeep("");
			}
			
			//this.empleadodiscaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.empleadodiscaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEmpleadoDisca);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEmpleadoDisca!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpleadoDisca);	
					}
					
					if(this.jInternalFrameImportacionEmpleadoDisca!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpleadoDisca);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEmpleadoDisca!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEmpleadoDisca);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpleadoDisca);
				this.jInternalFrameDetalleFormEmpleadoDisca.setVisible(false);
				this.jInternalFrameDetalleFormEmpleadoDisca.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpleadoDisca!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpleadoDisca);
					this.jInternalFrameReporteDinamicoEmpleadoDisca.setVisible(false);
					this.jInternalFrameReporteDinamicoEmpleadoDisca.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEmpleadoDisca!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEmpleadoDisca);
					this.jInternalFrameImportacionEmpleadoDisca.setVisible(false);
					this.jInternalFrameImportacionEmpleadoDisca.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEmpleadoDisca!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEmpleadoDisca);
					this.jInternalFrameOrderByEmpleadoDisca.setVisible(false);
					this.jInternalFrameOrderByEmpleadoDisca.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEmpleadoDiscaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EmpleadoDiscaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.empleadodiscaReturnGeneral=new EmpleadoDiscaParameterReturnGeneral();
			
			this.empleadodiscaParameterGeneral=new EmpleadoDiscaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.empleadodiscaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EmpleadoDiscaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpleadoDiscaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empleadodiscaSessionBean.getEsGuardarRelacionado(),this.empleadodiscaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpleadoDiscaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empleadodiscaSessionBean.getEsGuardarRelacionado(),this.empleadodiscaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEmpleadoDisca=false;
			this.isVisibilidadCeldaDuplicarEmpleadoDisca=true;
			this.isVisibilidadCeldaCopiarEmpleadoDisca=true;
			this.isVisibilidadCeldaVerFormEmpleadoDisca=true;
			this.isVisibilidadCeldaOrdenEmpleadoDisca=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoDisca=false;
			this.isVisibilidadCeldaModificarEmpleadoDisca=false;
			this.isVisibilidadCeldaActualizarEmpleadoDisca=false;
			this.isVisibilidadCeldaEliminarEmpleadoDisca=false;
			this.isVisibilidadCeldaCancelarEmpleadoDisca=false;
			this.isVisibilidadCeldaGuardarEmpleadoDisca=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoDisca=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoDiscapacidad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEmpleadoDisca("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEmpleadoDisca();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEmpleadoDisca(false);
			
			this.setPermisosUsuarioEmpleadoDisca();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado() 
				|| (this.empleadodiscaSessionBean.getEsGuardarRelacionado() && this.empleadodiscaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEmpleadoDiscaClasesRelacionadas();
			}
			
			if(this.empleadodiscaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEmpleadoDiscaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEmpleadoDisca();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEmpleadoDisca();
			}
			
			if(!this.isPermisoBusquedaEmpleadoDisca) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEmpleadoDisca.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEmpleadoDisca,this.isPermisoPaginacionMedioEmpleadoDisca,this.isPermisoPaginacionTodoEmpleadoDisca);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EmpleadoDiscaConstantesFunciones.getTiposSeleccionarEmpleadoDisca());
				
				this.tiposColumnasSelect=EmpleadoDiscaConstantesFunciones.getTiposSeleccionarEmpleadoDisca(true);
				
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
			//if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEmpleadoDisca();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioEmpleadoDisca(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioEmpleadoDisca(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoDisca() ;
			
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
			this.tipodiscapacidadLogic=new TipoDiscapacidadLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				empleadodiscaImplementable= (EmpleadoDiscaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpleadoDiscaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				empleadodiscaImplementableHome= (EmpleadoDiscaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpleadoDiscaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.empleadodiscas= new ArrayList<EmpleadoDisca>();
			this.empleadodiscasEliminados= new ArrayList<EmpleadoDisca>();
						
			this.isEsNuevoEmpleadoDisca=false;
			this.esParaAccionDesdeFormularioEmpleadoDisca=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.tipodiscapacidadsForeignKey=new ArrayList<TipoDiscapacidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEmpleadoDisca(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEmpleadoDisca();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EmpleadoDiscaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EmpleadoDiscaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEmpleadoDisca("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEmpleadoDisca(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEmpleadoDisca();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEmpleadoDisca();
			}
			
			EmpleadoDiscaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEmpleadoDisca.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEmpleadoDisca.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEmpleadoDisca.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEmpleadoDisca(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EmpleadoDisca: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEmpleadoDisca() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEmpleadoDisca")) {
				iIndex=this.jInternalFrameDetalleFormEmpleadoDisca.jTabbedPaneRelacionesEmpleadoDisca.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEmpleadoDisca.jTabbedPaneRelacionesEmpleadoDisca.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEmpleadoDisca();	
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
	
	public void cargarCombosForeignKeyEmpleadoDisca(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEmpleadoDisca(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEmpleadoDisca(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEmpleadoDiscaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEmpleadoDisca();
		
		this.cargarCombosFrameForeignKeyEmpleadoDisca();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEmpleadoDisca();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEmpleadoDisca();
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

	public void cargarCombosForeignKeyTipoDiscapacidad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoDiscapacidadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoDiscapacidad();
				this.cargarCombosFrameTipoDiscapacidadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoDiscapacidad(this.tipodiscapacidadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoEmpleadoDiscaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.empleadodiscaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEmpleadoDisca==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
			
			
			if(jTableDatosEmpleadoDisca.getRowCount()>=1) {
				jTableDatosEmpleadoDisca.removeRowSelectionInterval(0, jTableDatosEmpleadoDisca.getRowCount()-1);						
			}
			
			this.isEsNuevoEmpleadoDisca=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEmpleadoDisca(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEmpleadoDisca(true);			
			//this.empleadodisca=new EmpleadoDisca();
			//this.empleadodisca.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoDisca(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoDisca() ;
			
			if(EmpleadoDiscaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoDisca(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.empleadodisca);	
			this.actualizarInformacion("INFO_PADRE",false,this.empleadodisca);				
			
			EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
			
			if(this.empleadodiscaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EmpleadoDisca: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEmpleadoDiscaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EmpleadoDisca> empleadodiscasSeleccionados=new ArrayList<EmpleadoDisca>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEmpleadoDisca.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEmpleadoDisca.getSelectedRows().length;			
			}
			
			empleadodiscasSeleccionados=this.getEmpleadoDiscasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEmpleadoDisca--;			
				//EmpleadoDisca empleadodiscaAux= new EmpleadoDisca();			
				//empleadodiscaAux.setId(this.iIdNuevoEmpleadoDisca);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EmpleadoDisca empleadodiscaOrigen=new EmpleadoDisca();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EmpleadoDisca empleadodiscaOrigen : empleadodiscasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							empleadodiscaOrigen =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadodiscaOrigen =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEmpleadoDisca();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.empleadodisca.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEmpleadoDisca(empleadodiscaOrigen,this.empleadodisca,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empleadodiscaLogic.getEmpleadoDiscas().add(this.empleadodiscaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empleadodiscas.add(this.empleadodiscaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEmpleadoDisca(false);
				
				this.jTableDatosEmpleadoDisca.setRowSelectionInterval(this.getIndiceNuevoEmpleadoDisca(), this.getIndiceNuevoEmpleadoDisca());
				
				int iLastRow =  this.jTableDatosEmpleadoDisca.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpleadoDisca.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpleadoDisca.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoDisca(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EmpleadoDisca> empleadodiscasSeleccionados=new ArrayList<EmpleadoDisca>();									
		
			EmpleadoDisca empleadodiscaOrigen=new EmpleadoDisca();
			EmpleadoDisca empleadodiscaDestino=new EmpleadoDisca();
				
			empleadodiscasSeleccionados=this.getEmpleadoDiscasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEmpleadoDisca.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || empleadodiscasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEmpleadoDisca.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadodiscaOrigen =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empleadodiscaOrigen =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadodiscaDestino =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empleadodiscaDestino =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				empleadodiscaOrigen =empleadodiscasSeleccionados.get(0);
				empleadodiscaDestino =empleadodiscasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEmpleadoDisca(empleadodiscaOrigen,empleadodiscaDestino,true,false);
				
				empleadodiscaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empleadodiscaDestino,empleadodiscaLogic.getEmpleadoDiscas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadodiscaDestino,empleadodiscas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEmpleadoDisca(false);
				
				//this.jTableDatosEmpleadoDisca.setRowSelectionInterval(this.getIndiceNuevoEmpleadoDisca(), this.getIndiceNuevoEmpleadoDisca());
				
				int iLastRow =  this.jTableDatosEmpleadoDisca.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpleadoDisca.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpleadoDisca.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoDisca(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoDisca==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEmpleadoDisca.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEmpleadoDisca.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEmpleadoDisca.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEmpleadoDisca.setVisible(!isVisible);
			this.jPanelPaginacionEmpleadoDisca.setVisible(!isVisible);
			this.jPanelAccionesEmpleadoDisca.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEmpleadoDisca();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEmpleadoDisca();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEmpleadoDisca();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEmpleadoDisca();
			
			this.abrirFrameOrderByEmpleadoDisca();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEmpleadoDisca();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEmpleadoDisca(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpleadoDisca);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEmpleadoDisca.isMaximum()) {
					this.jInternalFrameDetalleFormEmpleadoDisca.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEmpleadoDisca.setSize(this.jInternalFrameDetalleFormEmpleadoDisca.iWidthFormulario,this.jInternalFrameDetalleFormEmpleadoDisca.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEmpleadoDisca.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEmpleadoDisca.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEmpleadoDisca.isMaximum()) {
						this.jInternalFrameDetalleFormEmpleadoDisca.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEmpleadoDisca.jContentPaneDetalleEmpleadoDisca.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEmpleadoDisca.jTabbedPaneRelacionesEmpleadoDisca.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoDisca.jContentPaneDetalleEmpleadoDisca.getWidth(),EmpleadoDiscaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpleadoDisca.jTabbedPaneRelacionesEmpleadoDisca.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoDisca.jContentPaneDetalleEmpleadoDisca.getWidth(),EmpleadoDiscaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpleadoDisca.jTabbedPaneRelacionesEmpleadoDisca.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoDisca.jContentPaneDetalleEmpleadoDisca.getWidth(),EmpleadoDiscaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEmpleadoDisca.setVisible(true);
	        this.jInternalFrameDetalleFormEmpleadoDisca.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEmpleadoDisca() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEmpleadoDisca==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEmpleadoDisca=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoDisca,false,this);
				} else {
					this.jInternalFrameOrderByEmpleadoDisca=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoDisca,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEmpleadoDisca);
				this.jInternalFrameOrderByEmpleadoDisca.setVisible(false);
				this.jInternalFrameOrderByEmpleadoDisca.setSelected(false);
				
				this.jInternalFrameOrderByEmpleadoDisca.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpleadoDisca"));
				
				this.inicializarActualizarBindingTablaOrderByEmpleadoDisca();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEmpleadoDisca() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEmpleadoDisca==null) {
				
				this.jInternalFrameImportacionEmpleadoDisca=new ImportacionJInternalFrame(EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpleadoDisca);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEmpleadoDisca);
				this.jInternalFrameImportacionEmpleadoDisca.setVisible(false);
				this.jInternalFrameImportacionEmpleadoDisca.setSelected(false);


				this.jInternalFrameImportacionEmpleadoDisca.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpleadoDisca"));
				this.jInternalFrameImportacionEmpleadoDisca.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpleadoDisca"));
				this.jInternalFrameImportacionEmpleadoDisca.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpleadoDisca"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEmpleadoDisca() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEmpleadoDisca==null) {
				this.jInternalFrameReporteDinamicoEmpleadoDisca=new ReporteDinamicoJInternalFrame(EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpleadoDisca);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpleadoDisca);
				this.jInternalFrameReporteDinamicoEmpleadoDisca.setVisible(false);
				this.jInternalFrameReporteDinamicoEmpleadoDisca.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEmpleadoDisca.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoDisca"));
				this.jInternalFrameReporteDinamicoEmpleadoDisca.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoDisca"));
				this.jInternalFrameReporteDinamicoEmpleadoDisca.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoDisca"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoDisca();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEmpleadoDisca() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpleadoDisca);
			
	       	this.jInternalFrameDetalleFormEmpleadoDisca.setVisible(false);
	        this.jInternalFrameDetalleFormEmpleadoDisca.setSelected(false);
			
			//this.jInternalFrameDetalleFormEmpleadoDisca.dispose();
			//this.jInternalFrameDetalleFormEmpleadoDisca=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEmpleadoDisca() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEmpleadoDisca.setVisible(true);
	        this.jInternalFrameReporteDinamicoEmpleadoDisca.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEmpleadoDisca() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEmpleadoDisca.setVisible(true);
	        this.jInternalFrameImportacionEmpleadoDisca.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEmpleadoDisca() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEmpleadoDisca.setVisible(true);
	        this.jInternalFrameOrderByEmpleadoDisca.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEmpleadoDisca() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEmpleadoDisca.setVisible(false);
	        this.jInternalFrameOrderByEmpleadoDisca.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEmpleadoDisca() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEmpleadoDisca.setVisible(false);
	        this.jInternalFrameReporteDinamicoEmpleadoDisca.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEmpleadoDisca() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEmpleadoDisca.setVisible(false);
	        this.jInternalFrameImportacionEmpleadoDisca.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEmpleadoDisca(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEmpleadoDisca(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEmpleadoDisca(true);
			//this.isEsNuevoEmpleadoDisca=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodisca =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadodisca =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEmpleadoDisca("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoDisca(false) ;
			
			if(empleadodiscaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EmpleadoDiscaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoDisca(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoDisca(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEmpleadoDiscaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodisca =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadodisca =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEmpleadoDisca(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoDisca==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEmpleadoDisca(true);
			//this.isEsNuevoEmpleadoDisca=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodisca =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadodisca =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.empleadodisca.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEmpleadoDisca("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEmpleadoDisca(false) ;
			
			if(EmpleadoDiscaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoDisca(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoDisca(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosEmpleadoDisca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoDisca,EmpleadoDiscaConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoDisca.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoDiscapacidad(List<TipoDiscapacidad> tipodiscapacidadsForeignKey)throws Exception{
		TableColumn tableColumnTipoDiscapacidad=this.jTableDatosEmpleadoDisca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoDisca,EmpleadoDiscaConstantesFunciones.LABEL_IDTIPODISCAPACIDAD));
		TableCellEditor tableCellEditorTipoDiscapacidad =tableColumnTipoDiscapacidad.getCellEditor();

		TipoDiscapacidadTableCell tipodiscapacidadTableCellFk=(TipoDiscapacidadTableCell)tableCellEditorTipoDiscapacidad;

		if(tipodiscapacidadTableCellFk!=null) {
			tipodiscapacidadTableCellFk.settipodiscapacidadsForeignKey(tipodiscapacidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoDisca.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipodiscapacidadTableCellFk.setRowActual(intSelectedRow);
			//tipodiscapacidadTableCellFk.settipodiscapacidadsForeignKeyActual(tipodiscapacidadsForeignKey);
		//}


		if(tipodiscapacidadTableCellFk!=null) {
			tipodiscapacidadTableCellFk.RecargarTipoDiscapacidadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEmpleadoDisca(false);
			
			//if(!this.isEsNuevoEmpleadoDisca) {								
				int intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodisca =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadodisca =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEmpleadoDisca(this.empleadodisca,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);
				
			}
			
			if(this.permiteMantenimiento(this.empleadodisca)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEmpleadoDisca=true;
					this.inicializarActualizarBindingTablaEmpleadoDisca(false);
					this.isEsNuevoEmpleadoDisca=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEmpleadoDisca=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEmpleadoDisca=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpleadoDisca(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoDisca(false);
				
				this.habilitarDeshabilitarControlesEmpleadoDisca(false);
			
												
				
				if(EmpleadoDiscaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEmpleadoDisca();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEmpleadoDiscaActionPerformed(evt,empleadodiscaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEmpleadoDisca(this.empleadodisca,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEmpleadoDisca.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,empleadodiscaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.empleadodisca.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EmpleadoDisca.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoDisca.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodisca =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				this.empleadodisca.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadodisca =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				this.empleadodisca.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.empleadodisca)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EmpleadoDiscaModel) this.jTableDatosEmpleadoDisca.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEmpleadoDisca=true;
				this.inicializarActualizarBindingTablaEmpleadoDisca(false);
				this.isEsNuevoEmpleadoDisca=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpleadoDisca(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoDisca(false);
				
				this.habilitarDeshabilitarControlesEmpleadoDisca(false);
				
				
				
				if(EmpleadoDiscaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEmpleadoDisca();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEmpleadoDisca.getRowCount()>=1) {
				jTableDatosEmpleadoDisca.removeRowSelectionInterval(0, jTableDatosEmpleadoDisca.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEmpleadoDisca(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEmpleadoDisca(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoDisca(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoDisca(false) ;
			
			this.isEsNuevoEmpleadoDisca=false;
			
			if(EmpleadoDiscaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEmpleadoDisca();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEmpleadoDisca(false);
				
				//SI ES MANUAL
				if(EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEmpleadoDisca();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEmpleadoDisca--;			
			//EmpleadoDisca empleadodiscaAux= new EmpleadoDisca();			
			//empleadodiscaAux.setId(this.iIdNuevoEmpleadoDisca);
			
			if(this.jInternalFrameDetalleFormEmpleadoDisca==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEmpleadoDisca();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);
			
			this.empleadodisca.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.empleadodiscaLogic.getEmpleadoDiscas().add(this.empleadodiscaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.empleadodiscas.add(this.empleadodiscaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEmpleadoDisca(false);
			
			this.jTableDatosEmpleadoDisca.setRowSelectionInterval(this.getIndiceNuevoEmpleadoDisca(), this.getIndiceNuevoEmpleadoDisca());
			
			int iLastRow =  this.jTableDatosEmpleadoDisca.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEmpleadoDisca.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEmpleadoDisca.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEmpleadoDisca(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEmpleadoDisca(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoDisca(false);
			
			//SI ES MANUAL
			if(EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoDisca();
			}
			
			//this.abrirFrameTreeEmpleadoDisca();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Empleado DiscaS ?", "MANTENIMIENTO DE Empleado Disca", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEmpleadoDisca.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEmpleadoDisca();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.empleadodiscaReturnGeneral=empleadodiscaLogic.procesarImportacionEmpleadoDiscasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.empleadodiscaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEmpleadoDiscaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEmpleadoDisca.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEmpleadoDisca.setFileImportacion(this.jInternalFrameImportacionEmpleadoDisca.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEmpleadoDisca.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEmpleadoDisca.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEmpleadoDisca.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEmpleadoDisca.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EmpleadoDisca> empleadodiscasSeleccionados=new ArrayList<EmpleadoDisca>();		

		empleadodiscasSeleccionados=this.getEmpleadoDiscasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoDisca.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoDisca.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EmpleadoDiscaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EmpleadoDiscaBaseDesign.jrxml";
			
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
			
			this.generarReporteEmpleadoDiscas("Todos",empleadodiscasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Disca",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoDisca.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoDisca.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpleadoDiscaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_IDTIPODISCAPACIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoDiscapacidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoDiscapacidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoDiscapacidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoDiscapacidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEINICIAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentajeInicial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentajeInicial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentajeInicial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentajeInicial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEFINAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentajeFinal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentajeFinal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentajeFinal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentajeFinal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoEmpleadoDisca.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoDisca.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoDisca.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EmpleadoDiscaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_IDTIPODISCAPACIDAD:
					sNombreCampoCategoria="id_tipo_discapacidad";
					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEINICIAL:
					sNombreCampoCategoria="porcentaje_inicial";
					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEFINAL:
					sNombreCampoCategoria="porcentaje_final";
					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoDisca.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EmpleadoDiscaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_IDTIPODISCAPACIDAD:
					sNombreCampoCategoriaValor="id_tipo_discapacidad";
					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEINICIAL:
					sNombreCampoCategoriaValor="porcentaje_inicial";
					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEFINAL:
					sNombreCampoCategoriaValor="porcentaje_final";
					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoDisca.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoDisca.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpleadoDiscaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_IDTIPODISCAPACIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Discapacad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_discapacidad");
					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEINICIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje Inicial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje_inicial");
					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEFINAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje Final",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje_final");
					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EmpleadoDisca> empleadodiscasSeleccionados=new ArrayList<EmpleadoDisca>();		
		
		empleadodiscasSeleccionados=this.getEmpleadoDiscasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadodisca";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EmpleadoDiscas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEmpleadoDisca.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoDisca.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EmpleadoDiscaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoDiscaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EmpleadoDisca empleadodisca:empleadodiscasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadodisca.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoDiscaConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(EmpleadoDisca empleadodisca:empleadodiscasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadodisca.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_IDTIPODISCAPACIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoDiscaConstantesFunciones.LABEL_IDTIPODISCAPACIDAD);
					iRow++;

					for(EmpleadoDisca empleadodisca:empleadodiscasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadodisca.gettipodiscapacidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEINICIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEINICIAL);
					iRow++;

					for(EmpleadoDisca empleadodisca:empleadodiscasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadodisca.getporcentaje_inicial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEFINAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEFINAL);
					iRow++;

					for(EmpleadoDisca empleadodisca:empleadodiscasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadodisca.getporcentaje_final());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoDiscaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoDiscaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(EmpleadoDisca empleadodisca:empleadodiscasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadodisca.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelEmpleadoDisca(row);				
			//	iRow++;
			//}				
			
			//for(EmpleadoDisca empleadodiscaAux:empleadodiscasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEmpleadoDisca(empleadodiscaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Disca",JOptionPane.INFORMATION_MESSAGE);
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
				this.empleadodiscaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoDisca(false);
			
			//SI ES MANUAL
			if(EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoDisca();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoDisca(false);
			
			//SI ES MANUAL
			if(EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpleadoDisca();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoDisca(false);
			
			//SI ES MANUAL
			if(EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpleadoDisca();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEmpleadoDisca() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEmpleadoDisca.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEmpleadoDisca.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEmpleadoDisca.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEmpleadoDisca.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEmpleadoDisca.setMinimumSize(dimensionMinimum);
		this.jTableDatosEmpleadoDisca.setMaximumSize(dimensionMaximum);
		this.jTableDatosEmpleadoDisca.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEmpleadoDisca(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEmpleadoDisca(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEmpleadoDisca(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEmpleadoDisca(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEmpleadoDisca(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEmpleadoDisca(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoDisca(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEmpleadoDisca(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEmpleadoDisca() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEmpleadoDisca();
		
		this.inicializarActualizarBindingBotonesManualEmpleadoDisca(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEmpleadoDisca();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoDisca() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoDisca(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoDisca(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEmpleadoDisca.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEmpleadoDisca.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEmpleadoDisca.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEmpleadoDisca.jCheckBoxPostAccionNuevoEmpleadoDisca.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEmpleadoDisca.jCheckBoxPostAccionSinCerrarEmpleadoDisca.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEmpleadoDisca.jCheckBoxPostAccionSinMensajeEmpleadoDisca.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEmpleadoDisca.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEmpleadoDisca.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEmpleadoDisca.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
				this.jInternalFrameDetalleFormEmpleadoDisca.jCheckBoxPostAccionNuevoEmpleadoDisca.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEmpleadoDisca.jCheckBoxPostAccionSinCerrarEmpleadoDisca.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEmpleadoDisca.jCheckBoxPostAccionSinMensajeEmpleadoDisca.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEmpleadoDisca.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEmpleadoDisca.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxTiposAccionesFormularioEmpleadoDisca.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEmpleadoDisca.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEmpleadoDisca!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoDisca.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEmpleadoDisca.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEmpleadoDisca.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEmpleadoDisca.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEmpleadoDisca.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEmpleadoDisca!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoDisca.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEmpleadoDisca.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEmpleadoDisca.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEmpleadoDisca(Boolean esInicializar) throws Exception {
		try	{	
			if(EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoDisca(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoDisca() throws Exception {
		try	{
			if(EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpleadoDisca();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpleadoDisca() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxTiposAccionesFormularioEmpleadoDisca.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxTiposAccionesFormularioEmpleadoDisca.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpleadoDisca() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEmpleadoDisca.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEmpleadoDisca.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEmpleadoDisca.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEmpleadoDisca.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEmpleadoDisca.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEmpleadoDisca.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEmpleadoDisca.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEmpleadoDisca.addItem(reporte);
			}
			
			
			if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEmpleadoDisca.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEmpleadoDisca.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEmpleadoDisca.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEmpleadoDisca.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEmpleadoDisca.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEmpleadoDisca.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxTiposAccionesFormularioEmpleadoDisca.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxTiposAccionesFormularioEmpleadoDisca.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEmpleadoDisca.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEmpleadoDisca.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEmpleadoDisca.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoDisca();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoDisca() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpleadoDisca!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoDisca.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpleadoDisca.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpleadoDisca!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoDisca.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpleadoDisca.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEmpleadoDisca!=null) {
				
				if(this.jInternalFrameReporteDinamicoEmpleadoDisca.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoDisca.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoDisca.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEmpleadoDisca.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoDisca.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoDisca.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpleadoDisca.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoDisca.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=EmpleadoDiscaConstantesFunciones.getTiposSeleccionarEmpleadoDisca(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEmpleadoDisca.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpleadoDisca.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoDisca.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=EmpleadoDiscaConstantesFunciones.getTiposSeleccionarEmpleadoDisca(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEmpleadoDisca.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoEmpleadoDisca.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoDisca.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=EmpleadoDiscaConstantesFunciones.getTiposSeleccionarEmpleadoDisca(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoDisca.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoEmpleadoDisca.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoDisca.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoEmpleadoDisca.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEmpleadoDisca()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoDisca.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoDisca.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca.getSelectedItem()!=null){this.id_tipo_discapacidadFK_IdTipoDiscapacidad=((TipoDiscapacidad)this.jComboBoxid_tipo_discapacidadFK_IdTipoDiscapacidadEmpleadoDisca.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEmpleadoDisca(Boolean esInicializar) throws Exception {				
		if(EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEmpleadoDisca();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEmpleadoDisca() throws Exception {
		this.inicializarActualizarBindingTablaEmpleadoDisca(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEmpleadoDisca() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEmpleadoDisca.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEmpleadoDisca.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoDisca.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EmpleadoDiscaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEmpleadoDisca.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoDisca.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EmpleadoDiscaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEmpleadoDiscaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoDiscaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EmpleadoDiscaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEmpleadoDisca.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoDisca.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EmpleadoDiscaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEmpleadoDisca.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEmpleadoDisca(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=empleadodiscaLogic.getEmpleadoDiscas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=empleadodiscas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEmpleadoDisca.setModel(new EmpleadoDiscaModel(this.empleadodiscaLogic.getEmpleadoDiscas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEmpleadoDisca.setModel(new EmpleadoDiscaModel(this.empleadodiscas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEmpleadoDisca!=null && this.jInternalFrameOrderByEmpleadoDisca.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEmpleadoDisca();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEmpleadoDisca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoDisca,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EmpleadoDiscaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO,empleadodiscaConstantesFunciones.resaltarSeleccionarEmpleadoDisca,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EmpleadoDiscaConstantesFunciones.SCLASSWEBTITULO,empleadodiscaConstantesFunciones.resaltarSeleccionarEmpleadoDisca,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEmpleadoDisca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoDisca,EmpleadoDiscaConstantesFunciones.LABEL_ID));

		if(this.empleadodiscaConstantesFunciones.mostraridEmpleadoDisca && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoDiscaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadodiscaConstantesFunciones.resaltaridEmpleadoDisca,this.empleadodiscaConstantesFunciones.activaridEmpleadoDisca,iSizeTabla,this,true,"idEmpleadoDisca","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadodiscaConstantesFunciones.resaltaridEmpleadoDisca,this.empleadodiscaConstantesFunciones.activaridEmpleadoDisca,this,true,"idEmpleadoDisca","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoDisca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoDisca,EmpleadoDiscaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.empleadodiscaConstantesFunciones.mostrarid_empresaEmpleadoDisca && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoDiscaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.empleadodiscaConstantesFunciones.resaltarid_empresaEmpleadoDisca,this,this.empleadodiscaConstantesFunciones.activarid_empresaEmpleadoDisca,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.empleadodiscaConstantesFunciones.resaltarid_empresaEmpleadoDisca,this,this.empleadodiscaConstantesFunciones.activarid_empresaEmpleadoDisca,false,"id_empresaEmpleadoDisca","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoDiscaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoDisca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoDisca,EmpleadoDiscaConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.empleadodiscaConstantesFunciones.mostrarid_empleadoEmpleadoDisca && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoDiscaConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.empleadodiscaConstantesFunciones.resaltarid_empleadoEmpleadoDisca,this,this.empleadodiscaConstantesFunciones.activarid_empleadoEmpleadoDisca,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.empleadodiscaConstantesFunciones.resaltarid_empleadoEmpleadoDisca,this,this.empleadodiscaConstantesFunciones.activarid_empleadoEmpleadoDisca,true,"id_empleadoEmpleadoDisca","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new EmpleadoDiscaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoDisca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoDisca,EmpleadoDiscaConstantesFunciones.LABEL_IDTIPODISCAPACIDAD));

		if(this.empleadodiscaConstantesFunciones.mostrarid_tipo_discapacidadEmpleadoDisca && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoDiscaConstantesFunciones.LABEL_IDTIPODISCAPACIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoDiscapacidadTableCell(this.tipodiscapacidadsForeignKey,this.empleadodiscaConstantesFunciones.resaltarid_tipo_discapacidadEmpleadoDisca,this,this.empleadodiscaConstantesFunciones.activarid_tipo_discapacidadEmpleadoDisca,iSizeTabla));
			tableColumn.setCellEditor(new TipoDiscapacidadTableCell(this.tipodiscapacidadsForeignKey,this.empleadodiscaConstantesFunciones.resaltarid_tipo_discapacidadEmpleadoDisca,this,this.empleadodiscaConstantesFunciones.activarid_tipo_discapacidadEmpleadoDisca,true,"id_tipo_discapacidadEmpleadoDisca","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoDiscaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoDisca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoDisca,EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEINICIAL));

		if(this.empleadodiscaConstantesFunciones.mostrarporcentaje_inicialEmpleadoDisca && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEINICIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadodiscaConstantesFunciones.resaltarporcentaje_inicialEmpleadoDisca,this.empleadodiscaConstantesFunciones.activarporcentaje_inicialEmpleadoDisca,iSizeTabla,this,true,"porcentaje_inicialEmpleadoDisca","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadodiscaConstantesFunciones.resaltarporcentaje_inicialEmpleadoDisca,this.empleadodiscaConstantesFunciones.activarporcentaje_inicialEmpleadoDisca,this,true,"porcentaje_inicialEmpleadoDisca","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpleadoDiscaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoDisca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoDisca,EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEFINAL));

		if(this.empleadodiscaConstantesFunciones.mostrarporcentaje_finalEmpleadoDisca && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEFINAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadodiscaConstantesFunciones.resaltarporcentaje_finalEmpleadoDisca,this.empleadodiscaConstantesFunciones.activarporcentaje_finalEmpleadoDisca,iSizeTabla,this,true,"porcentaje_finalEmpleadoDisca","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadodiscaConstantesFunciones.resaltarporcentaje_finalEmpleadoDisca,this.empleadodiscaConstantesFunciones.activarporcentaje_finalEmpleadoDisca,this,true,"porcentaje_finalEmpleadoDisca","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpleadoDiscaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoDisca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoDisca,EmpleadoDiscaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.empleadodiscaConstantesFunciones.mostrardescripcionEmpleadoDisca && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoDiscaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.empleadodiscaConstantesFunciones.resaltardescripcionEmpleadoDisca,this.empleadodiscaConstantesFunciones.activardescripcionEmpleadoDisca,iSizeTabla,this,true,"descripcionEmpleadoDisca","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadodiscaConstantesFunciones.resaltardescripcionEmpleadoDisca,this.empleadodiscaConstantesFunciones.activardescripcionEmpleadoDisca,this,true,"descripcionEmpleadoDisca","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoDiscaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empleadodiscaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empleadodiscaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpleadoDisca.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empleadodiscaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empleadodiscaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpleadoDisca.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEmpleadoDisca && this.isPermisoGuardarCambiosEmpleadoDisca) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.empleadodiscaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.empleadodiscaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEmpleadoDisca.addColumn(tableColumn);
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
			
			this.jTableDatosEmpleadoDisca.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpleadoDisca && this.isPermisoGuardarCambiosEmpleadoDisca) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpleadoDisca && this.isPermisoGuardarCambiosEmpleadoDisca) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEmpleadoDisca.moveColumn(this.jTableDatosEmpleadoDisca.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEmpleadoDisca.moveColumn(this.jTableDatosEmpleadoDisca.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEmpleadoDisca.moveColumn(this.jTableDatosEmpleadoDisca.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEmpleadoDisca.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEmpleadoDisca.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEmpleadoDisca,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEmpleadoDisca.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEmpleadoDisca.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEmpleadoDisca.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEmpleadoDisca.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEmpleadoDisca.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=empleadodiscaLogic.getEmpleadoDiscas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=empleadodiscas.size()-1;
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
		//this.jTableDatosEmpleadoDisca.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEmpleadoDisca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEmpleadoDisca();
			
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
				
				//this.isEsNuevoEmpleadoDisca=false;
					
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
			
				if(this.empleadodiscaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEmpleadoDisca==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpleadoDisca.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpleadoDisca.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodisca =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadodisca =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.empleadodisca.getsType().equals("DUPLICADO")
				   || this.empleadodisca.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEmpleadoDisca=true;
				
				} else {
					this.isEsNuevoEmpleadoDisca=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
					if(this.empleadodisca.getId()>=0 && !this.empleadodisca.getIsNew()) {						
						this.isEsNuevoEmpleadoDisca=false;
						
					} else {
						this.isEsNuevoEmpleadoDisca=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEmpleadoDisca(esRelaciones);						
				
				this.seleccionarEmpleadoDisca(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.empleadodisca.getId()<0) {
					this.isEsNuevoEmpleadoDisca=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEmpleadoDisca(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEmpleadoDisca(evt,rowIndex);
				}	
				
				if(this.empleadodiscaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EmpleadoDisca: " + this.dDif); 
					}
				}								
				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEmpleadoDisca(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.empleadodisca)) {
					if(this.empleadodisca.getId()>0) {
						this.empleadodisca.setIsDeleted(true);
						
						this.empleadodiscasEliminados.add(this.empleadodisca);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empleadodiscaLogic.getEmpleadoDiscas().remove(this.empleadodisca);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empleadodiscas.remove(this.empleadodisca);				
					}
					
					
					((EmpleadoDiscaModel) this.jTableDatosEmpleadoDisca.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoDisca(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEmpleadoDisca(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEmpleadoDisca) {
			
			if(this.jInternalFrameDetalleFormEmpleadoDisca==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpleadoDisca.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpleadoDisca.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodisca =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadodisca =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEmpleadoDisca(this.empleadodisca);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.empleadodiscaConstantesFunciones.cargarid_empresaEmpleadoDisca || this.empleadodiscaConstantesFunciones.event_dependid_empresaEmpleadoDisca) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.empleadodisca.getid_empresa());
									//this.inicializarActualizarBindingEmpleadoDisca(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(empleadodisca.getEmpresa()!=null) {
							this.empresasForeignKey.add(empleadodisca.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.empleadodisca.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.empleadodiscaConstantesFunciones.cargarid_empleadoEmpleadoDisca || this.empleadodiscaConstantesFunciones.event_dependid_empleadoEmpleadoDisca) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.empleadodisca.getid_empleado());
									//this.inicializarActualizarBindingEmpleadoDisca(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(empleadodisca.getEmpleado()!=null) {
							this.empleadosForeignKey.add(empleadodisca.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.empleadodisca.getid_empleado(),false,"Formulario");

					//TipoDiscapacidad
					if(!this.empleadodiscaConstantesFunciones.cargarid_tipo_discapacidadEmpleadoDisca || this.empleadodiscaConstantesFunciones.event_dependid_tipo_discapacidadEmpleadoDisca) {
						//this.cargarCombosTipoDiscapacidadsForeignKeyLista(" where id="+this.empleadodisca.getid_tipo_discapacidad());
									//this.inicializarActualizarBindingEmpleadoDisca(false,false);
						this.tipodiscapacidadsForeignKey=new ArrayList<TipoDiscapacidad>();

						if(empleadodisca.getTipoDiscapacidad()!=null) {
							this.tipodiscapacidadsForeignKey.add(empleadodisca.getTipoDiscapacidad());
						}

						this.addItemDefectoCombosForeignKeyTipoDiscapacidad();
						this.cargarCombosFrameTipoDiscapacidadsForeignKey("Todos");
					}
					this.setActualTipoDiscapacidadForeignKey(this.empleadodisca.getid_tipo_discapacidad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEmpleadoDisca("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEmpleadoDisca(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoDisca() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpleadoDisca(EmpleadoDisca empleadodisca) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEmpleadoDisca(empleadodisca,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpleadoDisca(EmpleadoDisca empleadodisca,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEmpleadoDisca(empleadodisca);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEmpleadoDisca(empleadodisca,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoDisca(empleadodisca);
	}
	
	public void setVariablesObjetoActualToFormularioEmpleadoDisca(EmpleadoDisca empleadodisca) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEmpleadoDisca==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEmpleadoDisca.jLabelidEmpleadoDisca.setText(empleadodisca.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoDisca.jTextFieldporcentaje_inicialEmpleadoDisca.setText(empleadodisca.getporcentaje_inicial().toString());
			this.jInternalFrameDetalleFormEmpleadoDisca.jTextFieldporcentaje_finalEmpleadoDisca.setText(empleadodisca.getporcentaje_final().toString());
			this.jInternalFrameDetalleFormEmpleadoDisca.jTextAreadescripcionEmpleadoDisca.setText(empleadodisca.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EmpleadoDisca empleadodiscaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,empleadodiscaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EmpleadoDisca empleadodiscaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				empleadodiscaLocal=this.empleadodisca;
			} else {
				empleadodiscaLocal=this.empleadodiscaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(empleadodiscaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEmpleadoDisca(empleadodiscaLocal,true);
					
					if(empleadodiscaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(empleadodiscaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(empleadodiscaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEmpleadoDisca(EmpleadoDisca empleadodisca,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpleadoDisca(empleadodisca,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(empleadodisca);
	}
	
	public void setVariablesFormularioToObjetoActualEmpleadoDisca(EmpleadoDisca empleadodisca,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpleadoDisca(empleadodisca,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEmpleadoDisca(EmpleadoDisca empleadodisca,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoDisca==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEmpleadoDisca.jLabelidEmpleadoDisca.getText()==null || this.jInternalFrameDetalleFormEmpleadoDisca.jLabelidEmpleadoDisca.getText()=="" || this.jInternalFrameDetalleFormEmpleadoDisca.jLabelidEmpleadoDisca.getText()=="Id") {
				this.jInternalFrameDetalleFormEmpleadoDisca.jLabelidEmpleadoDisca.setText("0");
			}

			if(conColumnasBase) {empleadodisca.setId(Long.parseLong(this.jInternalFrameDetalleFormEmpleadoDisca.jLabelidEmpleadoDisca.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoDiscaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoDisca.jLabelIdEmpleadoDisca,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadodisca.setporcentaje_inicial(Double.parseDouble(this.jInternalFrameDetalleFormEmpleadoDisca.jTextFieldporcentaje_inicialEmpleadoDisca.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEINICIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoDisca.jLabelporcentaje_inicialEmpleadoDisca,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadodisca.setporcentaje_final(Double.parseDouble(this.jInternalFrameDetalleFormEmpleadoDisca.jTextFieldporcentaje_finalEmpleadoDisca.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEFINAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoDisca.jLabelporcentaje_finalEmpleadoDisca,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadodisca.setdescripcion(this.jInternalFrameDetalleFormEmpleadoDisca.jTextAreadescripcionEmpleadoDisca.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoDiscaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoDisca.jLabeldescripcionEmpleadoDisca,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpleadoDisca(EmpleadoDisca empleadodiscaBean,EmpleadoDisca empleadodisca,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && empleadodiscaBean.getid_empleado()!=null && !empleadodiscaBean.getid_empleado().equals(-1L))) {empleadodisca.setid_empleado(empleadodiscaBean.getid_empleado());}
			if(conDefault || (!conDefault && empleadodiscaBean.getid_tipo_discapacidad()!=null && !empleadodiscaBean.getid_tipo_discapacidad().equals(-1L))) {empleadodisca.setid_tipo_discapacidad(empleadodiscaBean.getid_tipo_discapacidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEmpleadoDisca(EmpleadoDisca empleadodiscaOrigen,EmpleadoDisca empleadodisca,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empleadodiscaOrigen.getId()!=null && !empleadodiscaOrigen.getId().equals(0L))) {empleadodisca.setId(empleadodiscaOrigen.getId());}}
			if(conDefault || (!conDefault && empleadodiscaOrigen.getid_empleado()!=null && !empleadodiscaOrigen.getid_empleado().equals(-1L))) {empleadodisca.setid_empleado(empleadodiscaOrigen.getid_empleado());}
			if(conDefault || (!conDefault && empleadodiscaOrigen.getid_tipo_discapacidad()!=null && !empleadodiscaOrigen.getid_tipo_discapacidad().equals(-1L))) {empleadodisca.setid_tipo_discapacidad(empleadodiscaOrigen.getid_tipo_discapacidad());}
			if(conDefault || (!conDefault && empleadodiscaOrigen.getporcentaje_inicial()!=null && !empleadodiscaOrigen.getporcentaje_inicial().equals(0.0))) {empleadodisca.setporcentaje_inicial(empleadodiscaOrigen.getporcentaje_inicial());}
			if(conDefault || (!conDefault && empleadodiscaOrigen.getporcentaje_final()!=null && !empleadodiscaOrigen.getporcentaje_final().equals(0.0))) {empleadodisca.setporcentaje_final(empleadodiscaOrigen.getporcentaje_final());}
			if(conDefault || (!conDefault && empleadodiscaOrigen.getdescripcion()!=null && !empleadodiscaOrigen.getdescripcion().equals(""))) {empleadodisca.setdescripcion(empleadodiscaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpleadoDisca(EmpleadoDisca empleadodisca) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpleadoDisca.jLabelidEmpleadoDisca.setText(empleadodisca.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoDisca.jTextFieldporcentaje_inicialEmpleadoDisca.setText(empleadodisca.getporcentaje_inicial().toString());
			this.jInternalFrameDetalleFormEmpleadoDisca.jTextFieldporcentaje_finalEmpleadoDisca.setText(empleadodisca.getporcentaje_final().toString());
			this.jInternalFrameDetalleFormEmpleadoDisca.jTextAreadescripcionEmpleadoDisca.setText(empleadodisca.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpleadoDisca(EmpleadoDiscaBean empleadodiscaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpleadoDisca.jLabelidEmpleadoDisca.setText(empleadodiscaBean.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoDisca.jTextFieldporcentaje_inicialEmpleadoDisca.setText(empleadodiscaBean.getporcentaje_inicial().toString());
			this.jInternalFrameDetalleFormEmpleadoDisca.jTextFieldporcentaje_finalEmpleadoDisca.setText(empleadodiscaBean.getporcentaje_final().toString());
			this.jInternalFrameDetalleFormEmpleadoDisca.jTextAreadescripcionEmpleadoDisca.setText(empleadodiscaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEmpleadoDisca(EmpleadoDiscaParameterReturnGeneral empleadodiscaReturnGeneral,EmpleadoDiscaBean empleadodiscaBean,Boolean conDefault) throws Exception { 
		try {
			EmpleadoDisca empleadodiscaLocal=new EmpleadoDisca();
			
			empleadodiscaLocal=empleadodiscaReturnGeneral.getEmpleadoDisca();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empleadodiscaLocal.getId()!=null && !empleadodiscaLocal.getId().equals(0L))) {empleadodiscaBean.setId(empleadodiscaLocal.getId());}}
			if(conDefault || (!conDefault && empleadodiscaLocal.getid_empleado()!=null && !empleadodiscaLocal.getid_empleado().equals(-1L))) {empleadodiscaBean.setid_empleado(empleadodiscaLocal.getid_empleado());}
			if(conDefault || (!conDefault && empleadodiscaLocal.getid_tipo_discapacidad()!=null && !empleadodiscaLocal.getid_tipo_discapacidad().equals(-1L))) {empleadodiscaBean.setid_tipo_discapacidad(empleadodiscaLocal.getid_tipo_discapacidad());}
			if(conDefault || (!conDefault && empleadodiscaLocal.getporcentaje_inicial()!=null && !empleadodiscaLocal.getporcentaje_inicial().equals(0.0))) {empleadodiscaBean.setporcentaje_inicial(empleadodiscaLocal.getporcentaje_inicial());}
			if(conDefault || (!conDefault && empleadodiscaLocal.getporcentaje_final()!=null && !empleadodiscaLocal.getporcentaje_final().equals(0.0))) {empleadodiscaBean.setporcentaje_final(empleadodiscaLocal.getporcentaje_final());}
			if(conDefault || (!conDefault && empleadodiscaLocal.getdescripcion()!=null && !empleadodiscaLocal.getdescripcion().equals(""))) {empleadodiscaBean.setdescripcion(empleadodiscaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEmpleadoDiscaGenerico(Long idEmpleadoDiscaSeleccionado,JComboBox jComboBoxEmpleadoDisca,List<EmpleadoDisca> empleadodiscasLocal)throws Exception {
		try {
			EmpleadoDisca  empleadodiscaTemp=null;

			for(EmpleadoDisca empleadodiscaAux:empleadodiscasLocal) {
				if(empleadodiscaAux.getId()!=null && empleadodiscaAux.getId().equals(idEmpleadoDiscaSeleccionado)) {
					empleadodiscaTemp=empleadodiscaAux;
					break;
				}
			}

			jComboBoxEmpleadoDisca.setSelectedItem(empleadodiscaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEmpleadoDiscaGenerico(JComboBox jComboBoxEmpleadoDisca,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEmpleadoDisca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpleadoDisca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEmpleadoDisca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpleadoDisca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpleadoDisca.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEmpleadoDisca.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpleadoDisca.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEmpleadoDisca.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEmpleadoDisca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEmpleadoDisca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadodisca=(EmpleadoDisca) empleadodiscaLogic.getEmpleadoDiscas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empleadodisca =(EmpleadoDisca) empleadodiscas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!empleadodisca.getIsNew() && !empleadodisca.getIsChanged() && !empleadodisca.getIsDeleted()) {
				sDescripcion=empleadodisca.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=empleadodisca.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!empleadodisca.getIsNew() && !empleadodisca.getIsChanged() && !empleadodisca.getIsDeleted()) {
				sDescripcion=empleadodisca.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=empleadodisca.getempleado_descripcion();
			}
		}

		if(sTipo.equals("TipoDiscapacidad")) {
			//sDescripcion=this.getActualTipoDiscapacidadForeignKeyDescripcion((Long)value);
			if(!empleadodisca.getIsNew() && !empleadodisca.getIsChanged() && !empleadodisca.getIsDeleted()) {
				sDescripcion=empleadodisca.gettipodiscapacidad_descripcion();
			} else {
				//sDescripcion=this.getActualTipoDiscapacidadForeignKeyDescripcion((Long)value);
				sDescripcion=empleadodisca.gettipodiscapacidad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EmpleadoDisca empleadodiscaRow=new EmpleadoDisca();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadodiscaRow=(EmpleadoDisca) empleadodiscaLogic.getEmpleadoDiscas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empleadodiscaRow=(EmpleadoDisca) empleadodiscas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEmpleadoDisca(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEmpleadoDisca.setVisible((this.isVisibilidadCeldaNuevoEmpleadoDisca && this.isPermisoNuevoEmpleadoDisca));			
			this.jButtonDuplicarEmpleadoDisca.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoDisca && this.isPermisoDuplicarEmpleadoDisca));			
			this.jButtonCopiarEmpleadoDisca.setVisible((this.isVisibilidadCeldaCopiarEmpleadoDisca && this.isPermisoCopiarEmpleadoDisca));
			this.jButtonVerFormEmpleadoDisca.setVisible((this.isVisibilidadCeldaVerFormEmpleadoDisca && this.isPermisoVerFormEmpleadoDisca));
			
			this.jButtonAbrirOrderByEmpleadoDisca.setVisible((this.isVisibilidadCeldaOrdenEmpleadoDisca && this.isPermisoOrdenEmpleadoDisca));			
			
			this.jButtonNuevoRelacionesEmpleadoDisca.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoDisca && this.isPermisoNuevoEmpleadoDisca));			
			this.jButtonNuevoGuardarCambiosEmpleadoDisca.setVisible((this.isVisibilidadCeldaNuevoEmpleadoDisca && this.isPermisoNuevoEmpleadoDisca && this.isPermisoGuardarCambiosEmpleadoDisca));
			
			if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonModificarEmpleadoDisca.setVisible((this.isVisibilidadCeldaModificarEmpleadoDisca && this.isPermisoActualizarEmpleadoDisca));	
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonActualizarEmpleadoDisca.setVisible((this.isVisibilidadCeldaActualizarEmpleadoDisca && this.isPermisoActualizarEmpleadoDisca));	
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonEliminarEmpleadoDisca.setVisible((this.isVisibilidadCeldaEliminarEmpleadoDisca && this.isPermisoEliminarEmpleadoDisca));
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonCancelarEmpleadoDisca.setVisible(this.isVisibilidadCeldaCancelarEmpleadoDisca);							
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonGuardarCambiosEmpleadoDisca.setVisible((this.isVisibilidadCeldaGuardarEmpleadoDisca && this.isPermisoGuardarCambiosEmpleadoDisca));			
			
			}
						
			this.jButtonGuardarCambiosTablaEmpleadoDisca.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoDisca && this.isPermisoGuardarCambiosEmpleadoDisca));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEmpleadoDisca.setVisible((this.isVisibilidadCeldaNuevoEmpleadoDisca && this.isPermisoNuevoEmpleadoDisca));						
			this.jButtonDuplicarToolBarEmpleadoDisca.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoDisca && this.isPermisoDuplicarEmpleadoDisca));						
			this.jButtonCopiarToolBarEmpleadoDisca.setVisible((this.isVisibilidadCeldaCopiarEmpleadoDisca && this.isPermisoCopiarEmpleadoDisca));			
			this.jButtonVerFormToolBarEmpleadoDisca.setVisible((this.isVisibilidadCeldaVerFormEmpleadoDisca && this.isPermisoVerFormEmpleadoDisca));			
			this.jButtonAbrirOrderByToolBarEmpleadoDisca.setVisible((this.isVisibilidadCeldaOrdenEmpleadoDisca && this.isPermisoOrdenEmpleadoDisca));
			this.jButtonNuevoRelacionesToolBarEmpleadoDisca.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoDisca && this.isPermisoNuevoEmpleadoDisca));			
			this.jButtonNuevoGuardarCambiosToolBarEmpleadoDisca.setVisible((this.isVisibilidadCeldaNuevoEmpleadoDisca && this.isPermisoNuevoEmpleadoDisca && this.isPermisoGuardarCambiosEmpleadoDisca));			
			
			if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonModificarToolBarEmpleadoDisca.setVisible((this.isVisibilidadCeldaModificarEmpleadoDisca && this.isPermisoActualizarEmpleadoDisca));	
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonActualizarToolBarEmpleadoDisca.setVisible((this.isVisibilidadCeldaActualizarEmpleadoDisca  && this.isPermisoActualizarEmpleadoDisca));	
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonEliminarToolBarEmpleadoDisca.setVisible((this.isVisibilidadCeldaEliminarEmpleadoDisca && this.isPermisoEliminarEmpleadoDisca));
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonCancelarToolBarEmpleadoDisca.setVisible(this.isVisibilidadCeldaCancelarEmpleadoDisca);				
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonGuardarCambiosToolBarEmpleadoDisca.setVisible((this.isVisibilidadCeldaGuardarEmpleadoDisca && this.isPermisoGuardarCambiosEmpleadoDisca));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEmpleadoDisca.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoDisca && this.isPermisoGuardarCambiosEmpleadoDisca));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEmpleadoDisca.setVisible((this.isVisibilidadCeldaNuevoEmpleadoDisca && this.isPermisoNuevoEmpleadoDisca));			
			this.jMenuItemDuplicarEmpleadoDisca.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoDisca && this.isPermisoDuplicarEmpleadoDisca));			
			this.jMenuItemCopiarEmpleadoDisca.setVisible((this.isVisibilidadCeldaCopiarEmpleadoDisca && this.isPermisoCopiarEmpleadoDisca));			
			this.jMenuItemVerFormEmpleadoDisca.setVisible((this.isVisibilidadCeldaVerFormEmpleadoDisca && this.isPermisoVerFormEmpleadoDisca));			
			this.jMenuItemAbrirOrderByEmpleadoDisca.setVisible((this.isVisibilidadCeldaOrdenEmpleadoDisca && this.isPermisoOrdenEmpleadoDisca));			
			//this.jMenuItemMostrarOcultarEmpleadoDisca.setVisible((this.isVisibilidadCeldaOrdenEmpleadoDisca && this.isPermisoOrdenEmpleadoDisca));
			this.jMenuItemDetalleAbrirOrderByEmpleadoDisca.setVisible((this.isVisibilidadCeldaOrdenEmpleadoDisca && this.isPermisoOrdenEmpleadoDisca));			
			//this.jMenuItemDetalleMostrarOcultarEmpleadoDisca.setVisible((this.isVisibilidadCeldaOrdenEmpleadoDisca && this.isPermisoOrdenEmpleadoDisca));			
			this.jMenuItemNuevoRelacionesEmpleadoDisca.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoDisca && this.isPermisoNuevoEmpleadoDisca));			
			this.jMenuItemNuevoGuardarCambiosEmpleadoDisca.setVisible((this.isVisibilidadCeldaNuevoEmpleadoDisca && this.isPermisoNuevoEmpleadoDisca && this.isPermisoGuardarCambiosEmpleadoDisca));									
			
			if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
			this.jInternalFrameDetalleFormEmpleadoDisca.jMenuItemModificarEmpleadoDisca.setVisible((this.isVisibilidadCeldaModificarEmpleadoDisca && this.isPermisoActualizarEmpleadoDisca));	
			this.jInternalFrameDetalleFormEmpleadoDisca.jMenuItemActualizarEmpleadoDisca.setVisible((this.isVisibilidadCeldaActualizarEmpleadoDisca && this.isPermisoActualizarEmpleadoDisca));	
			this.jInternalFrameDetalleFormEmpleadoDisca.jMenuItemEliminarEmpleadoDisca.setVisible((this.isVisibilidadCeldaEliminarEmpleadoDisca && this.isPermisoEliminarEmpleadoDisca));
			this.jInternalFrameDetalleFormEmpleadoDisca.jMenuItemCancelarEmpleadoDisca.setVisible(this.isVisibilidadCeldaCancelarEmpleadoDisca);				
			}
			
			this.jMenuItemGuardarCambiosEmpleadoDisca.setVisible((this.isVisibilidadCeldaGuardarEmpleadoDisca && this.isPermisoGuardarCambiosEmpleadoDisca));						
			this.jMenuItemGuardarCambiosTablaEmpleadoDisca.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoDisca && this.isPermisoGuardarCambiosEmpleadoDisca));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEmpleadoDisca=this.jButtonNuevoEmpleadoDisca.isVisible();
			this.isVisibilidadCeldaDuplicarEmpleadoDisca=this.jButtonDuplicarEmpleadoDisca.isVisible();
			this.isVisibilidadCeldaCopiarEmpleadoDisca=this.jButtonCopiarEmpleadoDisca.isVisible();
			this.isVisibilidadCeldaVerFormEmpleadoDisca=this.jButtonVerFormEmpleadoDisca.isVisible();
			
			this.isVisibilidadCeldaOrdenEmpleadoDisca=this.jButtonAbrirOrderByEmpleadoDisca.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoDisca=this.jButtonNuevoRelacionesEmpleadoDisca.isVisible();
			this.isVisibilidadCeldaModificarEmpleadoDisca=this.jButtonModificarEmpleadoDisca.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
			this.isVisibilidadCeldaActualizarEmpleadoDisca=this.jInternalFrameDetalleFormEmpleadoDisca.jButtonActualizarEmpleadoDisca.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoDisca=this.jInternalFrameDetalleFormEmpleadoDisca.jButtonEliminarEmpleadoDisca.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoDisca=this.jInternalFrameDetalleFormEmpleadoDisca.jButtonCancelarEmpleadoDisca.isVisible();
			this.isVisibilidadCeldaGuardarEmpleadoDisca=this.jInternalFrameDetalleFormEmpleadoDisca.jButtonGuardarCambiosEmpleadoDisca.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEmpleadoDisca=this.jButtonGuardarCambiosTablaEmpleadoDisca.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEmpleadoDisca=this.jButtonNuevoToolBarEmpleadoDisca.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoDisca=this.jButtonNuevoRelacionesToolBarEmpleadoDisca.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
			this.isVisibilidadCeldaModificarEmpleadoDisca=this.jInternalFrameDetalleFormEmpleadoDisca.jButtonModificarToolBarEmpleadoDisca.isVisible();
			this.isVisibilidadCeldaActualizarEmpleadoDisca=this.jInternalFrameDetalleFormEmpleadoDisca.jButtonActualizarToolBarEmpleadoDisca.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoDisca=this.jInternalFrameDetalleFormEmpleadoDisca.jButtonEliminarToolBarEmpleadoDisca.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoDisca=this.jInternalFrameDetalleFormEmpleadoDisca.jButtonCancelarToolBarEmpleadoDisca.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpleadoDisca=this.jButtonGuardarCambiosToolBarEmpleadoDisca.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpleadoDisca=this.jButtonGuardarCambiosTablaToolBarEmpleadoDisca.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEmpleadoDisca=this.jMenuItemNuevoEmpleadoDisca.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoDisca=this.jMenuItemNuevoRelacionesEmpleadoDisca.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
			this.isVisibilidadCeldaModificarEmpleadoDisca=this.jInternalFrameDetalleFormEmpleadoDisca.jMenuItemModificarEmpleadoDisca.isVisible();
			this.isVisibilidadCeldaActualizarEmpleadoDisca=this.jInternalFrameDetalleFormEmpleadoDisca.jMenuItemActualizarEmpleadoDisca.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoDisca=this.jInternalFrameDetalleFormEmpleadoDisca.jMenuItemEliminarEmpleadoDisca.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoDisca=this.jInternalFrameDetalleFormEmpleadoDisca.jMenuItemCancelarEmpleadoDisca.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpleadoDisca=this.jMenuItemGuardarCambiosEmpleadoDisca.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpleadoDisca=this.jMenuItemGuardarCambiosTablaEmpleadoDisca.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEmpleadoDisca(Boolean esInicializar) {
		if(EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.empleadodiscaSessionBean.getConGuardarRelaciones()) {
				//if(this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEmpleadoDisca();
			}
			
			this.inicializarActualizarBindingBotonesManualEmpleadoDisca(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEmpleadoDisca() {
		this.jButtonNuevoEmpleadoDisca.setVisible(this.isPermisoNuevoEmpleadoDisca);			
		this.jButtonDuplicarEmpleadoDisca.setVisible(this.isPermisoDuplicarEmpleadoDisca);			
		this.jButtonCopiarEmpleadoDisca.setVisible(this.isPermisoCopiarEmpleadoDisca);			
		this.jButtonVerFormEmpleadoDisca.setVisible(this.isPermisoVerFormEmpleadoDisca);			
		
		this.jButtonAbrirOrderByEmpleadoDisca.setVisible(this.isPermisoOrdenEmpleadoDisca);					
		
		this.jButtonNuevoRelacionesEmpleadoDisca.setVisible(this.isPermisoNuevoEmpleadoDisca);			
		
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonModificarEmpleadoDisca.setVisible(this.isPermisoActualizarEmpleadoDisca);	
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonActualizarEmpleadoDisca.setVisible(this.isPermisoActualizarEmpleadoDisca);	
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonEliminarEmpleadoDisca.setVisible(this.isPermisoEliminarEmpleadoDisca);
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonCancelarEmpleadoDisca.setVisible(this.isVisibilidadCeldaCancelarEmpleadoDisca);						
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonGuardarCambiosEmpleadoDisca.setVisible(this.isPermisoGuardarCambiosEmpleadoDisca);							
		}
		
		this.jButtonGuardarCambiosTablaEmpleadoDisca.setVisible(this.isPermisoActualizarEmpleadoDisca);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpleadoDisca() {
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonModificarEmpleadoDisca.setVisible(this.isPermisoActualizarEmpleadoDisca);	
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonActualizarEmpleadoDisca.setVisible(this.isPermisoActualizarEmpleadoDisca);	
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonEliminarEmpleadoDisca.setVisible(this.isPermisoEliminarEmpleadoDisca);
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonCancelarEmpleadoDisca.setVisible(this.isVisibilidadCeldaCancelarEmpleadoDisca);							
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonGuardarCambiosEmpleadoDisca.setVisible((this.isVisibilidadCeldaGuardarEmpleadoDisca && this.isPermisoGuardarCambiosEmpleadoDisca));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEmpleadoDisca() {
		if(EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEmpleadoDisca();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEmpleadoDisca() {
	}
	
	public void jTableDatosEmpleadoDiscaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEmpleadoDisca(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEmpleadoDiscaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoDisca(this.getempleadodisca(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadodisca =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadodisca =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadodisca==null) {
						this.empleadodisca = new EmpleadoDisca();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoDisca(this.empleadodisca,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);
				}

				if(this.empleadodisca.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.empleadodisca.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoDisca(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEmpleadoDiscaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEmpleadoDisca(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoDisca.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoDisca.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodisca =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadodisca =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoDisca(this.getempleadodisca(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.empleadodiscaLogic.getConnexion());

				if(this.empleadodisca.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.empleadodisca.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoDisca=(TitledBorder)this.jScrollPanelDatosEmpleadoDisca.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEmpleadoDisca.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEmpleadoDiscaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoDisca(this.getempleadodisca(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadodisca =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadodisca =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadodisca==null) {
						this.empleadodisca = new EmpleadoDisca();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoDisca(this.empleadodisca,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);
				}

				if(this.empleadodisca.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.empleadodisca.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoDisca(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoEmpleadoDiscaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebEmpleadoDisca(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoDisca.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoDisca.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodisca =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadodisca =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoDisca(this.getempleadodisca(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.empleadodiscaLogic.getConnexion());

				if(this.empleadodisca.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.empleadodisca.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoDisca=(TitledBorder)this.jScrollPanelDatosEmpleadoDisca.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderEmpleadoDisca.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoEmpleadoDiscaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoDisca(this.getempleadodisca(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadodisca =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadodisca =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadodisca==null) {
						this.empleadodisca = new EmpleadoDisca();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoDisca(this.empleadodisca,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);
				}

				if(this.empleadodisca.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.empleadodisca.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoDisca(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_discapacidadEmpleadoDiscaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipodiscapacidad=true;

			idTienePermisotipodiscapacidad=this.tienePermisosUsuarioEnPaginaWebEmpleadoDisca(TipoDiscapacidadConstantesFunciones.CLASSNAME);

			if(idTienePermisotipodiscapacidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoDisca.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoDisca.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodisca =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadodisca =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoDisca(this.getempleadodisca(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);

				this.tipodiscapacidadBeanSwingJInternalFrame=new TipoDiscapacidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipodiscapacidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipodiscapacidadBeanSwingJInternalFrame.getTipoDiscapacidadLogic().setConnexion(this.empleadodiscaLogic.getConnexion());

				if(this.empleadodisca.getid_tipo_discapacidad()!=null) {
					this.tipodiscapacidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipodiscapacidadBeanSwingJInternalFrame.setIdActual(this.empleadodisca.getid_tipo_discapacidad());
					this.tipodiscapacidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipodiscapacidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipodiscapacidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoDiscapacidad();
				}

				JInternalFrameBase jinternalFrame =this.tipodiscapacidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoDisca=(TitledBorder)this.jScrollPanelDatosEmpleadoDisca.getBorder();
				TitledBorder titledBordertipodiscapacidad=(TitledBorder)this.tipodiscapacidadBeanSwingJInternalFrame.jScrollPanelDatosTipoDiscapacidad.getBorder();

				titledBordertipodiscapacidad.setTitle(titledBorderEmpleadoDisca.getTitle() + " -> Tipo Discapacidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_discapacidadEmpleadoDiscaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoDisca(this.getempleadodisca(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadodisca =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadodisca =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadodisca==null) {
						this.empleadodisca = new EmpleadoDisca();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoDisca(this.empleadodisca,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);
				}

				if(this.empleadodisca.getid_tipo_discapacidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_discapacidad = "+this.empleadodisca.getid_tipo_discapacidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoDisca(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentaje_inicialEmpleadoDiscaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoDisca(this.getempleadodisca(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadodisca =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadodisca =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadodisca==null) {
						this.empleadodisca = new EmpleadoDisca();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoDisca(this.empleadodisca,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);
				}

				if(this.empleadodisca.getporcentaje_inicial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje_inicial = "+this.empleadodisca.getporcentaje_inicial().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoDisca(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentaje_finalEmpleadoDiscaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoDisca(this.getempleadodisca(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadodisca =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadodisca =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadodisca==null) {
						this.empleadodisca = new EmpleadoDisca();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoDisca(this.empleadodisca,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);
				}

				if(this.empleadodisca.getporcentaje_final()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje_final = "+this.empleadodisca.getporcentaje_final().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoDisca(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionEmpleadoDiscaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoDisca(this.getempleadodisca(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadodisca =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadodisca =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadodisca==null) {
						this.empleadodisca = new EmpleadoDisca();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoDisca(this.empleadodisca,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);
				}

				if(this.empleadodisca.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.empleadodisca.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoDisca(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoDisca(false,false);

			this.getEmpleadoDiscasFK_IdEmpleado();

			this.inicializarActualizarBindingEmpleadoDisca(false);

			//if(EmpleadoDiscaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoDisca(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoDisca(false,false);

			this.getEmpleadoDiscasFK_IdEmpresa();

			this.inicializarActualizarBindingEmpleadoDisca(false);

			//if(EmpleadoDiscaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoDisca(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoDiscapacidadEmpleadoDiscaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoDisca(false,false);

			this.getEmpleadoDiscasFK_IdTipoDiscapacidad();

			this.inicializarActualizarBindingEmpleadoDisca(false);

			//if(EmpleadoDiscaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoDisca(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadodiscaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEmpleadoDisca() {
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
			this.jInternalFrameDetalleFormEmpleadoDisca.setVisible(false);	    			
			this.jInternalFrameDetalleFormEmpleadoDisca.dispose();
			this.jInternalFrameDetalleFormEmpleadoDisca=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEmpleadoDisca!=null) {
			this.jInternalFrameReporteDinamicoEmpleadoDisca.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEmpleadoDisca.dispose();
			this.jInternalFrameReporteDinamicoEmpleadoDisca=null;
		}
		
		if(this.jInternalFrameImportacionEmpleadoDisca!=null) {
			this.jInternalFrameImportacionEmpleadoDisca.setVisible(false);	    			
			this.jInternalFrameImportacionEmpleadoDisca.dispose();
			this.jInternalFrameImportacionEmpleadoDisca=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEmpleadoDisca();
			
			EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
			
			
			if(sTipo.equals("NuevoEmpleadoDisca")) {
				jButtonNuevoEmpleadoDiscaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEmpleadoDisca")) {
				jButtonDuplicarEmpleadoDiscaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEmpleadoDisca")) {
				jButtonCopiarEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("VerFormEmpleadoDisca")) {
				jButtonVerFormEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEmpleadoDisca")) {
				jButtonNuevoEmpleadoDiscaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEmpleadoDisca")) {
				jButtonDuplicarEmpleadoDiscaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEmpleadoDisca")) {
				jButtonNuevoEmpleadoDiscaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEmpleadoDisca")) {
				jButtonDuplicarEmpleadoDiscaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEmpleadoDisca")) {
				jButtonNuevoEmpleadoDiscaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEmpleadoDisca")) {
				jButtonNuevoEmpleadoDiscaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEmpleadoDisca")) {
				jButtonNuevoEmpleadoDiscaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEmpleadoDisca")) {
				jButtonModificarEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEmpleadoDisca")) {
				jButtonModificarEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEmpleadoDisca")) {
				jButtonModificarEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEmpleadoDisca")) {
				jButtonActualizarEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEmpleadoDisca")) {
				jButtonActualizarEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEmpleadoDisca")) {
				jButtonActualizarEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("EliminarEmpleadoDisca")) {
				jButtonEliminarEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEmpleadoDisca")) {
				jButtonEliminarEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEmpleadoDisca")) {
				jButtonEliminarEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("CancelarEmpleadoDisca")) {
				jButtonCancelarEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEmpleadoDisca")) {
				jButtonCancelarEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEmpleadoDisca")) {
				jButtonCancelarEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("CerrarEmpleadoDisca")) {
				jButtonCerrarEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEmpleadoDisca")) {
				jButtonCerrarEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEmpleadoDisca")) {
				jButtonCerrarEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEmpleadoDisca")) {
				jButtonMostrarOcultarEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEmpleadoDisca")) {
				jButtonCancelarEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEmpleadoDisca")) {
				jButtonGuardarCambiosEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEmpleadoDisca")) {
				jButtonGuardarCambiosEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEmpleadoDisca")) {
				jButtonCopiarEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEmpleadoDisca")) {
				jButtonVerFormEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEmpleadoDisca")) {
				jButtonGuardarCambiosEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEmpleadoDisca")) {
				jButtonCopiarEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEmpleadoDisca")) {
				jButtonVerFormEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEmpleadoDisca")) {
				jButtonGuardarCambiosEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEmpleadoDisca")) {
				jButtonGuardarCambiosEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEmpleadoDisca")) {
				jButtonGuardarCambiosEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEmpleadoDisca")) {
				jButtonRecargarInformacionEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEmpleadoDisca")) {
				jButtonRecargarInformacionEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEmpleadoDisca")) {
				jButtonRecargarInformacionEmpleadoDiscaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEmpleadoDisca")) {
				jButtonAnterioresEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEmpleadoDisca")) {
				jButtonAnterioresEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEmpleadoDisca")) {
				jButtonAnterioresEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEmpleadoDisca")) {
				jButtonSiguientesEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEmpleadoDisca")) {
				jButtonSiguientesEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEmpleadoDisca")) {
				jButtonSiguientesEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEmpleadoDisca") || sTipo.equals("MenuItemDetalleAbrirOrderByEmpleadoDisca")) {
				jButtonAbrirOrderByEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEmpleadoDisca") || sTipo.equals("MenuItemDetalleMostrarOcultarEmpleadoDisca")) {
				jButtonMostrarOcultarEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEmpleadoDisca")) {
				jButtonNuevoGuardarCambiosEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEmpleadoDisca")) {
				jButtonNuevoGuardarCambiosEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEmpleadoDisca")) {
				jButtonNuevoGuardarCambiosEmpleadoDiscaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEmpleadoDisca")) {
				jButtonCerrarReporteDinamicoEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEmpleadoDisca")) {
				jButtonGenerarReporteDinamicoEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEmpleadoDisca")) {
				
				jButtonGenerarExcelReporteDinamicoEmpleadoDiscaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEmpleadoDisca")) {
				jButtonCerrarImportacionEmpleadoDiscaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEmpleadoDisca")) {
				
				jButtonGenerarImportacionEmpleadoDiscaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEmpleadoDisca")) {
				
				jButtonAbrirImportacionEmpleadoDiscaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEmpleadoDisca")) {
				jComboBoxTiposAccionesEmpleadoDiscaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEmpleadoDisca")) {
				jComboBoxTiposRelacionesEmpleadoDiscaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEmpleadoDisca")) {
				jComboBoxTiposAccionesEmpleadoDiscaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEmpleadoDisca")) {
				
				jComboBoxTiposSeleccionarEmpleadoDiscaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEmpleadoDisca")) {
				jTextFieldValorCampoGeneralEmpleadoDiscaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEmpleadoDisca")) {
				jButtonAbrirOrderByEmpleadoDiscaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEmpleadoDisca")) {
				jButtonAbrirOrderByEmpleadoDiscaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEmpleadoDisca")) {
				jButtonCerrarOrderByEmpleadoDiscaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpleadoDiscaBusqueda")) {
				this.jButtonidEmpleadoDiscaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpleadoDiscaUpdate")) {
				this.jButtonid_empresaEmpleadoDiscaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpleadoDiscaBusqueda")) {
				this.jButtonid_empresaEmpleadoDiscaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoDiscaUpdate")) {
				this.jButtonid_empleadoEmpleadoDiscaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoDiscaBusqueda")) {
				this.jButtonid_empleadoEmpleadoDiscaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_discapacidadEmpleadoDiscaUpdate")) {
				this.jButtonid_tipo_discapacidadEmpleadoDiscaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_discapacidadEmpleadoDiscaBusqueda")) {
				this.jButtonid_tipo_discapacidadEmpleadoDiscaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_inicialEmpleadoDiscaBusqueda")) {
				this.jButtonporcentaje_inicialEmpleadoDiscaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_finalEmpleadoDiscaBusqueda")) {
				this.jButtonporcentaje_finalEmpleadoDiscaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionEmpleadoDiscaBusqueda")) {
				this.jButtondescripcionEmpleadoDiscaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdEmpleadoEmpleadoDisca")) {
				this.jButtonFK_IdEmpleadoEmpleadoDiscaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoDiscapacidadEmpleadoDisca")) {
				this.jButtonFK_IdTipoDiscapacidadEmpleadoDiscaActionPerformed(evt);
			}
			
			;
			
			
			EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEmpleadoDisca();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoDiscaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadodisca);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadodisca);
				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
				
				


				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoDisca.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoDisca.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EmpleadoDisca empleadodiscaLocal=null;
			
			if(!this.getEsControlTabla()) {
				empleadodiscaLocal=this.empleadodisca;
			} else {
				empleadodiscaLocal=this.empleadodiscaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadodisca);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadodisca);
				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
							
				
				


				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoDisca.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoDisca.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoDiscaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaAnterior =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadodiscaAnterior =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
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
			
			EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
			
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
			
			


			
			EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoDiscaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadodisca);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadodisca);
				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
								
						
				


				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoDisca.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoDisca.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadodisca);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadodisca);
				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
								
				
				


				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoDisca.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoDisca.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoDiscaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaAnterior =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadodiscaAnterior =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadodisca);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadodisca);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoDiscaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaAnterior =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadodiscaAnterior =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoDiscaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadodisca);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadodisca);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadodisca);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadodisca);
				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
							
				
				


				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoDisca.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoDisca.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoDiscaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadodiscaAnterior =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empleadodiscaAnterior =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
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
			
			EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
			
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
			
			


			
			EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoDiscaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadodisca);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadodisca);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadodisca);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadodisca);
				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
								
				
				


				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoDisca.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoDisca.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoDiscaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaAnterior =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadodiscaAnterior =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoDiscaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadodisca);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadodisca);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoDiscaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadodisca);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadodisca);
				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEmpleadoDisca")) {
					jCheckBoxSeleccionarTodosEmpleadoDiscaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEmpleadoDisca")) {
					jCheckBoxSeleccionadosEmpleadoDiscaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEmpleadoDisca")) {
					
				}
				
				


				
				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoDisca.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoDisca.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadodisca);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.empleadodisca);
				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
												
				
				


				
				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoDisca.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoDisca.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoDiscaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadodiscaAnterior =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empleadodiscaAnterior =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoDiscaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadodisca);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadodisca);
				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
				
				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
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
			
			EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
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
			
			


			
			EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoDiscaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadodisca);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadodisca);
				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoDisca.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoDisca.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadodisca);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadodisca);
				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
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
				
				


				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoDisca.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoDisca.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoDiscaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadodiscaAnterior =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadodiscaAnterior =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEmpleadoDisca")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEmpleadoDiscaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEmpleadoDisca.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.empleadodisca =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.empleadodisca =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.empleadodisca);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEmpleadoDisca")) {
				
				}
				
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEmpleadoDisca")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEmpleadoDisca.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEmpleadoDisca")) {
			
			}
			
			EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEmpleadoDisca();
			
			EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
			
			if(sTipo.equals("NuevoEmpleadoDisca")) {
				jButtonNuevoEmpleadoDiscaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEmpleadoDisca")) {
				jButtonDuplicarEmpleadoDiscaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEmpleadoDisca")) {
				jButtonCopiarEmpleadoDiscaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEmpleadoDisca")) {
				jButtonVerFormEmpleadoDiscaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEmpleadoDisca")) {
				jButtonNuevoEmpleadoDiscaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEmpleadoDisca")) {
				jButtonModificarEmpleadoDiscaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEmpleadoDisca")) {
				jButtonActualizarEmpleadoDiscaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEmpleadoDisca")) {
				jButtonEliminarEmpleadoDiscaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEmpleadoDisca")) {
				jButtonGuardarCambiosEmpleadoDiscaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEmpleadoDisca")) {
				jButtonCancelarEmpleadoDiscaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEmpleadoDisca")) {
				jButtonCerrarEmpleadoDiscaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEmpleadoDisca")) {
				jButtonGuardarCambiosEmpleadoDiscaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEmpleadoDisca")) {
				jButtonNuevoGuardarCambiosEmpleadoDiscaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEmpleadoDisca")) {
				jButtonAbrirOrderByEmpleadoDiscaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEmpleadoDisca")) {
				jButtonRecargarInformacionEmpleadoDiscaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEmpleadoDisca")) {
				jButtonAnterioresEmpleadoDiscaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEmpleadoDisca")) {
				jButtonSiguientesEmpleadoDiscaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpleadoDiscaBusqueda")) {
				this.jButtonidEmpleadoDiscaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpleadoDiscaUpdate")) {
				this.jButtonid_empresaEmpleadoDiscaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpleadoDiscaBusqueda")) {
				this.jButtonid_empresaEmpleadoDiscaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoDiscaUpdate")) {
				this.jButtonid_empleadoEmpleadoDiscaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoDiscaBusqueda")) {
				this.jButtonid_empleadoEmpleadoDiscaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_discapacidadEmpleadoDiscaUpdate")) {
				this.jButtonid_tipo_discapacidadEmpleadoDiscaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_discapacidadEmpleadoDiscaBusqueda")) {
				this.jButtonid_tipo_discapacidadEmpleadoDiscaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_inicialEmpleadoDiscaBusqueda")) {
				this.jButtonporcentaje_inicialEmpleadoDiscaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_finalEmpleadoDiscaBusqueda")) {
				this.jButtonporcentaje_finalEmpleadoDiscaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionEmpleadoDiscaBusqueda")) {
				this.jButtondescripcionEmpleadoDiscaBusquedaActionPerformed(evt);
			}
			
			EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEmpleadoDisca();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEmpleadoDisca")) {
				closingInternalFrameEmpleadoDisca();
				
			} else if(sTipo.equals("jButtonCancelarEmpleadoDisca")) {
				JInternalFrameBase jInternalFrameDetalleFormEmpleadoDisca = (JInternalFrameBase)evt.getSource();
	            	
	            EmpleadoDiscaBeanSwingJInternalFrame jInternalFrameParent=(EmpleadoDiscaBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpleadoDisca.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEmpleadoDiscaActionPerformed(null);
			}
			
			EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empleadodisca,new Object(),this.empleadodiscaParameterGeneral,this.empleadodiscaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEmpleadoDisca(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEmpleadoDisca(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEmpleadoDisca(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.empleadodisca)) {
			if(!esControlTabla) {
				if(EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEmpleadoDisca(this.empleadodisca,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);			
				}
				
				if(this.empleadodiscaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEmpleadoDisca(this.empleadodisca,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empleadodiscaReturnGeneral=empleadodiscaLogic.procesarEventosEmpleadoDiscasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadodiscaLogic.getEmpleadoDiscas(),this.empleadodisca,this.empleadodiscaParameterGeneral,this.isEsNuevoEmpleadoDisca,classes);//this.empleadodiscaLogic.getEmpleadoDisca()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEmpleadoDisca(this.empleadodiscaReturnGeneral,this.empleadodiscaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.empleadodiscaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEmpleadoDisca(classes,this.empleadodiscaReturnGeneral,this.empleadodiscaBean,false);
					}
						
					if(this.empleadodiscaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoDisca(this.empleadodiscaReturnGeneral.getEmpleadoDisca());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEmpleadoDisca(this.empleadodiscaReturnGeneral.getEmpleadoDisca());	
					}
						
					if(this.empleadodiscaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEmpleadoDisca(this.empleadodiscaReturnGeneral.getEmpleadoDisca(),classes);//this.empleadodiscaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEmpleadoDisca(this.empleadodisca,classes);//this.empleadodiscaBean);									
				}
			
				if(EmpleadoDiscaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEmpleadoDisca(this.empleadodisca,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoDisca(this.empleadodisca);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.empleadodiscaAnterior!=null) {
						this.empleadodisca=this.empleadodiscaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empleadodiscaReturnGeneral=empleadodiscaLogic.procesarEventosEmpleadoDiscasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadodiscaLogic.getEmpleadoDiscas(),this.empleadodisca,this.empleadodiscaParameterGeneral,this.isEsNuevoEmpleadoDisca,classes);//this.empleadodiscaLogic.getEmpleadoDisca()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empleadodiscaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empleadodiscaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.empleadodiscaReturnGeneral.getEmpleadoDisca(),empleadodiscaLogic.getEmpleadoDiscas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.empleadodiscaReturnGeneral.getEmpleadoDisca(),this.empleadodiscas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEmpleadoDisca.repaint();
				
				//((AbstractTableModel) this.jTableDatosEmpleadoDisca.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEmpleadoDisca();
			}
		}
	}
	
	public void actualizarVisualTableDatosEmpleadoDisca() throws Exception {
		
		EmpleadoDiscaModel empleadodiscaModel=(EmpleadoDiscaModel)this.jTableDatosEmpleadoDisca.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadodiscaModel.empleadodiscas=this.empleadodiscaLogic.getEmpleadoDiscas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			empleadodiscaModel.empleadodiscas=this.empleadodiscas;
		}
		
		
		((EmpleadoDiscaModel) this.jTableDatosEmpleadoDisca.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEmpleadoDisca() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getempleadodiscaAnterior(),this.empleadodiscaLogic.getEmpleadoDiscas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getempleadodiscaAnterior(),this.empleadodiscas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEmpleadoDisca();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEmpleadoDisca(EmpleadoDisca empleadodisca,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
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
										
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadodisca,new Object(),generalEntityParameterGeneral,this.empleadodiscaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.empleadodiscaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EmpleadoDiscaConstantesFunciones.getClassesRelationshipsOfEmpleadoDisca(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EmpleadoDiscaConstantesFunciones.getClassesRelationshipsFromStringsOfEmpleadoDisca(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEmpleadoDisca(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EmpleadoDiscaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadodisca,new Object(),generalEntityParameterGeneral,this.empleadodiscaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEmpleadoDisca(EmpleadoDiscaBean empleadodiscaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEmpleadoDisca(ArrayList<Classe> classes,EmpleadoDiscaReturnGeneral empleadodiscaReturnGeneral,EmpleadoDiscaBean empleadodiscaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEmpleadoDisca(EmpleadoDisca empleadodisca,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.empleadodisca)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEmpleadoDisca = new EmpleadoDiscaDetalleFormJInternalFrame(jDesktopPane,this.empleadodiscaSessionBean.getConGuardarRelaciones(),this.empleadodiscaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpleadoDisca);
		this.jInternalFrameDetalleFormEmpleadoDisca.setVisible(false);
		this.jInternalFrameDetalleFormEmpleadoDisca.setSelected(false);						
		
		this.jInternalFrameDetalleFormEmpleadoDisca.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEmpleadoDisca.empleadodiscaLogic=this.empleadodiscaLogic;
		
		this.cargarCombosFrameForeignKeyEmpleadoDisca("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpleadoDisca();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpleadoDisca();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEmpleadoDisca("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEmpleadoDisca();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEmpleadoDisca.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpleadoDisca"));
		
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonModificarEmpleadoDisca.addActionListener(new ButtonActionListener(this,"ModificarEmpleadoDisca"));

		
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonModificarToolBarEmpleadoDisca.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpleadoDisca"));
					
		this.jInternalFrameDetalleFormEmpleadoDisca.jMenuItemModificarEmpleadoDisca.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpleadoDisca"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonActualizarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"ActualizarEmpleadoDisca"));
		
		
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonActualizarToolBarEmpleadoDisca.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpleadoDisca"));
						
		this.jInternalFrameDetalleFormEmpleadoDisca.jMenuItemActualizarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpleadoDisca"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonEliminarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"EliminarEmpleadoDisca"));
		
		
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonEliminarToolBarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpleadoDisca"));
								
		this.jInternalFrameDetalleFormEmpleadoDisca.jMenuItemEliminarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpleadoDisca"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonCancelarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"CancelarEmpleadoDisca"));
		
		
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonCancelarToolBarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpleadoDisca"));
					
		this.jInternalFrameDetalleFormEmpleadoDisca.jMenuItemCancelarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpleadoDisca"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoDisca.jMenuItemDetalleCerrarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpleadoDisca"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonGuardarCambiosToolBarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoDisca"));
		
		
		
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonGuardarCambiosToolBarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoDisca"));
		
		
		
		this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxTiposAccionesFormularioEmpleadoDisca.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpleadoDisca"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonidEmpleadoDiscaBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoDiscaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonid_empresaEmpleadoDiscaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoDiscaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonid_empresaEmpleadoDiscaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoDiscaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonid_empleadoEmpleadoDiscaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoDiscaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonid_empleadoEmpleadoDiscaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoDiscaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonid_tipo_discapacidadEmpleadoDiscaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_discapacidadEmpleadoDiscaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonid_tipo_discapacidadEmpleadoDiscaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_discapacidadEmpleadoDiscaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonporcentaje_inicialEmpleadoDiscaBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_inicialEmpleadoDiscaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonporcentaje_finalEmpleadoDiscaBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_finalEmpleadoDiscaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtondescripcionEmpleadoDiscaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEmpleadoDiscaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEmpleadoDisca.jTabbedPaneRelacionesEmpleadoDisca.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpleadoDisca"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEmpleadoDisca"));
		
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoDisca.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpleadoDisca"));
		}
		
		this.jTableDatosEmpleadoDisca.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEmpleadoDisca"));
		
		this.jTableDatosEmpleadoDisca.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEmpleadoDisca"));
		
		this.jButtonNuevoEmpleadoDisca.addActionListener(new ButtonActionListener(this,"NuevoEmpleadoDisca"));
		
		this.jButtonDuplicarEmpleadoDisca.addActionListener(new ButtonActionListener(this,"DuplicarEmpleadoDisca"));
		
		this.jButtonCopiarEmpleadoDisca.addActionListener(new ButtonActionListener(this,"CopiarEmpleadoDisca"));
		
		this.jButtonVerFormEmpleadoDisca.addActionListener(new ButtonActionListener(this,"VerFormEmpleadoDisca"));
		
		
		this.jButtonNuevoToolBarEmpleadoDisca.addActionListener(new ButtonActionListener(this,"NuevoToolBarEmpleadoDisca"));
			
		this.jButtonDuplicarToolBarEmpleadoDisca.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEmpleadoDisca"));
			
		this.jMenuItemNuevoEmpleadoDisca.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEmpleadoDisca"));
			
		this.jMenuItemDuplicarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEmpleadoDisca"));		
		
		
		this.jButtonNuevoRelacionesEmpleadoDisca.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEmpleadoDisca"));
		
		
		this.jButtonNuevoRelacionesToolBarEmpleadoDisca.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEmpleadoDisca"));
			
		this.jMenuItemNuevoRelacionesEmpleadoDisca.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEmpleadoDisca"));		
		
		
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonModificarEmpleadoDisca.addActionListener(new ButtonActionListener(this,"ModificarEmpleadoDisca"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonModificarToolBarEmpleadoDisca.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpleadoDisca"));
			
			this.jInternalFrameDetalleFormEmpleadoDisca.jMenuItemModificarEmpleadoDisca.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpleadoDisca"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonActualizarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"ActualizarEmpleadoDisca"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonActualizarToolBarEmpleadoDisca.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpleadoDisca"));
				
			this.jInternalFrameDetalleFormEmpleadoDisca.jMenuItemActualizarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpleadoDisca"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonEliminarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"EliminarEmpleadoDisca"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonEliminarToolBarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpleadoDisca"));
						
			this.jInternalFrameDetalleFormEmpleadoDisca.jMenuItemEliminarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpleadoDisca"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonCancelarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"CancelarEmpleadoDisca"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonCancelarToolBarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpleadoDisca"));
			
			this.jInternalFrameDetalleFormEmpleadoDisca.jMenuItemCancelarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpleadoDisca"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEmpleadoDisca"));		
		
		
		this.jButtonCerrarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"CerrarEmpleadoDisca"));
		
		
		this.jButtonCerrarToolBarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"CerrarToolBarEmpleadoDisca"));
			
		this.jMenuItemCerrarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEmpleadoDisca"));
			
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoDisca.jMenuItemDetalleCerrarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpleadoDisca"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonGuardarCambiosEmpleadoDisca.addActionListener (new ButtonActionListener(this,"GuardarCambiosEmpleadoDisca"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoDisca.jButtonGuardarCambiosToolBarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoDisca"));
		}
		
		this.jButtonCopiarToolBarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"CopiarToolBarEmpleadoDisca"));
			
		this.jButtonVerFormToolBarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"VerFormToolBarEmpleadoDisca"));
		
		this.jMenuItemGuardarCambiosEmpleadoDisca.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEmpleadoDisca"));
			
		this.jMenuItemCopiarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEmpleadoDisca"));		
		
		this.jMenuItemVerFormEmpleadoDisca.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEmpleadoDisca"));		
		
		
		this.jButtonGuardarCambiosTablaEmpleadoDisca.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpleadoDisca"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEmpleadoDisca"));
			
		this.jMenuItemGuardarCambiosTablaEmpleadoDisca.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpleadoDisca"));		
		
		
		
		this.jButtonRecargarInformacionEmpleadoDisca.addActionListener (new ButtonActionListener(this,"RecargarInformacionEmpleadoDisca"));
					
		this.jButtonRecargarInformacionToolBarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEmpleadoDisca"));
		
		this.jMenuItemRecargarInformacionEmpleadoDisca.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEmpleadoDisca"));		
		
		
		
		this.jButtonAnterioresEmpleadoDisca.addActionListener (new ButtonActionListener(this,"AnterioresEmpleadoDisca"));
		
		
		this.jButtonAnterioresToolBarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEmpleadoDisca"));
		
		this.jMenuItemAnterioresEmpleadoDisca.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEmpleadoDisca"));		
		
		
		this.jButtonSiguientesEmpleadoDisca.addActionListener (new ButtonActionListener(this,"SiguientesEmpleadoDisca"));
		
		
		this.jButtonSiguientesToolBarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEmpleadoDisca"));
			
		this.jMenuItemSiguientesEmpleadoDisca.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEmpleadoDisca"));
			
		this.jMenuItemAbrirOrderByEmpleadoDisca.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEmpleadoDisca"));
			
		this.jMenuItemMostrarOcultarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEmpleadoDisca"));
			
		this.jMenuItemDetalleAbrirOrderByEmpleadoDisca.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEmpleadoDisca"));
			
		this.jMenuItemDetalleMostarOcultarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEmpleadoDisca"));		
		
		
		this.jButtonNuevoGuardarCambiosEmpleadoDisca.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEmpleadoDisca"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEmpleadoDisca"));
			
		this.jMenuItemNuevoGuardarCambiosEmpleadoDisca.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEmpleadoDisca"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEmpleadoDisca.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEmpleadoDisca"));

		this.jCheckBoxSeleccionadosEmpleadoDisca.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEmpleadoDisca"));
		
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxTiposAccionesFormularioEmpleadoDisca.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpleadoDisca"));
		}
		
		
		this.jComboBoxTiposRelacionesEmpleadoDisca.addActionListener (new ButtonActionListener(this,"TiposRelacionesEmpleadoDisca"));
			
		this.jComboBoxTiposAccionesEmpleadoDisca.addActionListener (new ButtonActionListener(this,"TiposAccionesEmpleadoDisca"));
					
		this.jComboBoxTiposSeleccionarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEmpleadoDisca"));
			
		this.jTextFieldValorCampoGeneralEmpleadoDisca.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEmpleadoDisca"));		
		
		
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonidEmpleadoDiscaBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoDiscaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonid_empresaEmpleadoDiscaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoDiscaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonid_empresaEmpleadoDiscaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoDiscaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonid_empleadoEmpleadoDiscaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoDiscaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonid_empleadoEmpleadoDiscaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoDiscaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonid_tipo_discapacidadEmpleadoDiscaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_discapacidadEmpleadoDiscaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonid_tipo_discapacidadEmpleadoDiscaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_discapacidadEmpleadoDiscaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonporcentaje_inicialEmpleadoDiscaBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_inicialEmpleadoDiscaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonporcentaje_finalEmpleadoDiscaBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_finalEmpleadoDiscaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtondescripcionEmpleadoDiscaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEmpleadoDiscaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoEmpleadoDisca.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmpleadoDisca"));

			this.jButtonFK_IdTipoDiscapacidadEmpleadoDisca.addActionListener(new ButtonActionListener(this,"FK_IdTipoDiscapacidadEmpleadoDisca"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEmpleadoDisca!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoDisca.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoDisca"));
				this.jInternalFrameReporteDinamicoEmpleadoDisca.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoDisca"));
				this.jInternalFrameReporteDinamicoEmpleadoDisca.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoDisca"));
			}
			
			//this.jButtonCerrarReporteDinamicoEmpleadoDisca.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoDisca"));				
			//this.jButtonGenerarReporteDinamicoEmpleadoDisca.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoDisca"));
			//this.jButtonGenerarExcelReporteDinamicoEmpleadoDisca.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoDisca"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEmpleadoDisca!=null) {
				this.jInternalFrameImportacionEmpleadoDisca.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpleadoDisca"));
				this.jInternalFrameImportacionEmpleadoDisca.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpleadoDisca"));
				this.jInternalFrameImportacionEmpleadoDisca.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpleadoDisca"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEmpleadoDisca.addActionListener (new ButtonActionListener(this,"AbrirOrderByEmpleadoDisca"));
			
			this.jButtonAbrirOrderByToolBarEmpleadoDisca.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEmpleadoDisca"));			
			
			if(this.jInternalFrameOrderByEmpleadoDisca!=null) {
				this.jInternalFrameOrderByEmpleadoDisca.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpleadoDisca"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoDisca.jTabbedPaneRelacionesEmpleadoDisca.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpleadoDisca"));
		
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
            		closingInternalFrameEmpleadoDisca();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEmpleadoDisca.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEmpleadoDisca = (JInternalFrameBase)event.getSource();
	            	
	            EmpleadoDiscaBeanSwingJInternalFrame jInternalFrameParent=(EmpleadoDiscaBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpleadoDisca.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEmpleadoDiscaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEmpleadoDisca.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEmpleadoDiscaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEmpleadoDisca.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEmpleadoDisca.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoDiscaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoDiscaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoDiscaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEmpleadoDisca";
		inputMap = this.jButtonNuevoEmpleadoDisca.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEmpleadoDisca.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpleadoDiscaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoDiscaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoDiscaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoDiscaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEmpleadoDisca";
		inputMap = this.jButtonNuevoRelacionesEmpleadoDisca.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEmpleadoDisca.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpleadoDiscaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEmpleadoDisca";
		inputMap = this.jButtonModificarEmpleadoDisca.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEmpleadoDisca.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEmpleadoDiscaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEmpleadoDisca";
		inputMap = this.jButtonActualizarEmpleadoDisca.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEmpleadoDisca.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEmpleadoDiscaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEmpleadoDisca";
		inputMap = this.jButtonEliminarEmpleadoDisca.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEmpleadoDisca.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEmpleadoDiscaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEmpleadoDisca";
		inputMap = this.jButtonCancelarEmpleadoDisca.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEmpleadoDisca.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEmpleadoDiscaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEmpleadoDisca";
		inputMap = this.jButtonCerrarEmpleadoDisca.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEmpleadoDisca.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEmpleadoDiscaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonGuardarCambiosEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEmpleadoDisca";
		inputMap = this.jInternalFrameDetalleFormEmpleadoDisca.jButtonGuardarCambiosEmpleadoDisca.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonGuardarCambiosEmpleadoDisca.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEmpleadoDiscaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEmpleadoDisca.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEmpleadoDiscaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEmpleadoDisca.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEmpleadoDiscaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEmpleadoDisca.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEmpleadoDiscaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEmpleadoDisca.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEmpleadoDiscaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonidEmpleadoDiscaBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoDiscaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonid_empresaEmpleadoDiscaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoDiscaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonid_empresaEmpleadoDiscaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoDiscaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonid_empleadoEmpleadoDiscaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoDiscaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonid_empleadoEmpleadoDiscaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoDiscaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonid_tipo_discapacidadEmpleadoDiscaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_discapacidadEmpleadoDiscaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonid_tipo_discapacidadEmpleadoDiscaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_discapacidadEmpleadoDiscaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonporcentaje_inicialEmpleadoDiscaBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_inicialEmpleadoDiscaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtonporcentaje_finalEmpleadoDiscaBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_finalEmpleadoDiscaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoDisca.jButtondescripcionEmpleadoDiscaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEmpleadoDiscaBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoEmpleadoDisca.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmpleadoDisca"));

		this.jButtonFK_IdTipoDiscapacidadEmpleadoDisca.addActionListener(new ButtonActionListener(this,"FK_IdTipoDiscapacidadEmpleadoDisca"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEmpleadoDisca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEmpleadoDiscaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEmpleadoDiscaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEmpleadoDisca.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEmpleadoDisca(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EmpleadoDisca empleadodiscaAux:this.empleadodiscaLogic.getEmpleadoDiscas()) {
					empleadodiscaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoDisca empleadodiscaAux:empleadodiscas) {
					empleadodiscaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEmpleadoDiscaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpleadoDisca(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpleadoDisca empleadodiscaAux:this.empleadodiscaLogic.getEmpleadoDiscas()) {
						empleadodiscaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoDisca empleadodiscaAux:empleadodiscas) {
						empleadodiscaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EmpleadoDisca empleadodiscaAux:this.empleadodiscaLogic.getEmpleadoDiscas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoDisca empleadodiscaAux:empleadodiscas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoDisca(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpleadoDisca.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpleadoDisca.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoDisca,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEmpleadoDiscaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpleadoDisca(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEmpleadoDisca.getSelectedRows();
			
			EmpleadoDisca empleadodiscaLocal=new EmpleadoDisca();
			
			//this.seleccionarTodosEmpleadoDisca(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadodiscaLocal =(EmpleadoDisca) this.empleadodiscaLogic.getEmpleadoDiscas().toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					empleadodiscaLocal =(EmpleadoDisca) this.empleadodiscas.toArray()[this.jTableDatosEmpleadoDisca.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				empleadodiscaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpleadoDisca empleadodiscaAux:this.empleadodiscaLogic.getEmpleadoDiscas()) {
						empleadodiscaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoDisca empleadodiscaAux:empleadodiscas) {
						empleadodiscaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoDisca(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpleadoDisca.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpleadoDisca.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoDisca,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEmpleadoDiscaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEmpleadoDiscaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEmpleadoDiscaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEmpleadoDisca(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEmpleadoDisca.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpleadoDisca empleadodiscaAux:this.empleadodiscaLogic.getEmpleadoDiscas()) {
				
						if(sTipoSeleccionar.equals(EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEINICIAL)) {
							existe=true;
							empleadodiscaAux.setporcentaje_inicial(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEFINAL)) {
							existe=true;
							empleadodiscaAux.setporcentaje_final(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoDiscaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							empleadodiscaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoDisca empleadodiscaAux:empleadodiscas) {
					
						if(sTipoSeleccionar.equals(EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEINICIAL)) {
							existe=true;
							empleadodiscaAux.setporcentaje_inicial(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEFINAL)) {
							existe=true;
							empleadodiscaAux.setporcentaje_final(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoDiscaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							empleadodiscaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoDisca(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEmpleadoDiscaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEmpleadoDisca(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEmpleadoDisca=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEmpleadoDisca.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxTiposAccionesFormularioEmpleadoDisca.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEmpleadoDisca) {				
					conSplash=true;//false;										
					
					//this.startProcessEmpleadoDisca(conSplash);
				
					this.generarReporteEmpleadoDiscasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoDisca.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxTiposAccionesFormularioEmpleadoDisca.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEmpleadoDiscasSeleccionados();
				//this.jComboBoxTiposAccionesEmpleadoDisca.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpleadoDiscasSeleccionados(false);
				//this.jComboBoxTiposAccionesEmpleadoDisca.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpleadoDiscasSeleccionados(true);
				//this.jComboBoxTiposAccionesEmpleadoDisca.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpleadoDisca();
				
				this.exportarEmpleadoDiscasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoDisca.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxTiposAccionesFormularioEmpleadoDisca.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEmpleadoDiscas();
				//this.importarEmpleadoDiscas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoDisca.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxTiposAccionesFormularioEmpleadoDisca.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpleadoDisca();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEmpleadoDiscasSeleccionados();
				//this.jComboBoxTiposAccionesEmpleadoDisca.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Empleado Disca", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEmpleadoDisca();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEmpleadoDisca)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEmpleadoDisca(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Empleado Disca",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoDisca.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxTiposAccionesFormularioEmpleadoDisca.setSelectedIndex(0);					
				}	
			} 			
			else if(EmpleadoDiscaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEmpleadoDisca) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEmpleadoDisca(conSplash);
					
						//this.actualizarParametrosGeneralEmpleadoDisca();
						
						this.generarReporteProcesoAccionEmpleadoDiscasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEmpleadoDisca.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxTiposAccionesFormularioEmpleadoDisca.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EmpleadoDiscaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Empleado DiscaS SELECCIONADOS?", "MANTENIMIENTO DE Empleado Disca", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEmpleadoDisca();
				
						this.actualizarParametrosGeneralEmpleadoDisca();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.empleadodiscaReturnGeneral=empleadodiscaLogic.procesarAccionEmpleadoDiscasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.empleadodiscaLogic.getEmpleadoDiscas(),this.empleadodiscaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEmpleadoDiscaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpleadoDisca.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxTiposAccionesFormularioEmpleadoDisca.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEmpleadoDisca();
					
					EmpleadoDiscaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEmpleadoDiscaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpleadoDisca.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxTiposAccionesFormularioEmpleadoDisca.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEmpleadoDisca(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEmpleadoDiscaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEmpleadoDisca();
			
			if(this.jInternalFrameDetalleFormEmpleadoDisca==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EmpleadoDisca> empleadodiscasSeleccionados=new ArrayList<EmpleadoDisca>();		
			EmpleadoDisca empleadodisca=new EmpleadoDisca();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEmpleadoDisca(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEmpleadoDisca.getSelectedItem();
			
			
			
			
			empleadodiscasSeleccionados=this.getEmpleadoDiscasSeleccionados(true);
			//this.sTipoAccion;
			
			if(empleadodiscasSeleccionados.size()==1) {
				for(EmpleadoDisca empleadodiscaAux:empleadodiscasSeleccionados) {
					empleadodisca=empleadodiscaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEmpleadoDisca();
			
      		//this.finishProcessEmpleadoDisca(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEmpleadoDiscaReturnGeneral() throws Exception {
		if(this.empleadodiscaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.empleadodiscaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.empleadodiscaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.empleadodiscaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.empleadodiscaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.empleadodiscaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEmpleadoDisca(false);
		}
		
		if(this.empleadodiscaReturnGeneral.getConRetornoLista() || this.empleadodiscaReturnGeneral.getConRetornoObjeto()) {
			if(this.empleadodiscaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empleadodiscaLogic.setEmpleadoDiscas(this.empleadodiscaReturnGeneral.getEmpleadoDiscas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.empleadodiscaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empleadodiscaLogic.setEmpleadoDisca(this.empleadodiscaReturnGeneral.getEmpleadoDisca());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEmpleadoDisca(false);
		}
	}
	
	public void actualizarParametrosGeneralEmpleadoDisca() throws Exception {
		
		
	}
	
	public ArrayList<EmpleadoDisca> getEmpleadoDiscasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EmpleadoDisca> empleadodiscasSeleccionados=new ArrayList<EmpleadoDisca>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEmpleadoDisca) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EmpleadoDisca empleadodiscaAux:empleadodiscaLogic.getEmpleadoDiscas()) {
					if(empleadodiscaAux.getIsSelected()) {
						empleadodiscasSeleccionados.add(empleadodiscaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoDisca empleadodiscaAux:this.empleadodiscas) {
					if(empleadodiscaAux.getIsSelected()) {
						empleadodiscasSeleccionados.add(empleadodiscaAux);				
					}
				}
			}
			
			if(empleadodiscasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						empleadodiscasSeleccionados.addAll(this.empleadodiscaLogic.getEmpleadoDiscas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						empleadodiscasSeleccionados.addAll(this.empleadodiscas);				
					}
				}
			}
		} else {
			empleadodiscasSeleccionados.add(this.empleadodisca);
		}
		
		return empleadodiscasSeleccionados;
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
	
	public void generarReporteEmpleadoDiscasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEmpleadoDiscasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEmpleadoDiscasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpleadoDiscasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpleadoDiscasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Empleado Disca",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEmpleadoDiscasSeleccionados() throws Exception {
		ArrayList<EmpleadoDisca> empleadodiscasSeleccionados=new ArrayList<EmpleadoDisca>();		
		
		empleadodiscasSeleccionados=this.getEmpleadoDiscasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEmpleadoDiscas("Todos",empleadodiscasSeleccionados);
		
	}	
	
	public void generarReporteNormalEmpleadoDiscasSeleccionados() throws Exception {
		ArrayList<EmpleadoDisca> empleadodiscasSeleccionados=new ArrayList<EmpleadoDisca>();		
		
		empleadodiscasSeleccionados=this.getEmpleadoDiscasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEmpleadoDiscas("Todos",empleadodiscasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEmpleadoDiscasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EmpleadoDisca> empleadodiscasSeleccionados=new ArrayList<EmpleadoDisca>();
		
		empleadodiscasSeleccionados=this.getEmpleadoDiscasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEmpleadoDiscas("Todos",empleadodiscasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEmpleadoDiscasSeleccionados() throws Exception {
		ArrayList<EmpleadoDisca> empleadodiscasSeleccionados=new ArrayList<EmpleadoDisca>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEmpleadoDisca();
		
		
		empleadodiscasSeleccionados=this.getEmpleadoDiscasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEmpleadoDisca();
		
		
		//this.generarReporteEmpleadoDiscas("Todos",empleadodiscasSeleccionados ,empleadodiscaImplementable,empleadodiscaImplementableHome);
	}
	
	public void mostrarImportacionEmpleadoDiscas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEmpleadoDisca();
		
		this.abrirFrameImportacionEmpleadoDisca();		
		
			
		//this.generarReporteEmpleadoDiscas("Todos",empleadodiscasSeleccionados ,empleadodiscaImplementable,empleadodiscaImplementableHome);
	}
	
	public void importarEmpleadoDiscas() throws Exception {		
	
	}
	
	public void exportarEmpleadoDiscasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEmpleadoDiscasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEmpleadoDiscasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEmpleadoDiscasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Empleado Disca",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEmpleadoDiscasSeleccionados() throws Exception {
		ArrayList<EmpleadoDisca> empleadodiscasSeleccionados=new ArrayList<EmpleadoDisca>();		
		
		empleadodiscasSeleccionados=this.getEmpleadoDiscasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadodisca."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEmpleadoDisca(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EmpleadoDisca empleadodiscaAux:empleadodiscasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEmpleadoDisca(empleadodiscaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//empleadodiscaAux.setsDetalleGeneralEntityReporte(empleadodiscaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Disca",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEmpleadoDisca(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EmpleadoDiscaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoDiscaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoDiscaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoDiscaConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoDiscaConstantesFunciones.LABEL_IDTIPODISCAPACIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEINICIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEFINAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoDiscaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEmpleadoDisca(EmpleadoDisca empleadodisca,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=empleadodisca.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadodisca.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadodisca.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadodisca.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadodisca.gettipodiscapacidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadodisca.getporcentaje_inicial().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadodisca.getporcentaje_final().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadodisca.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEmpleadoDiscasSeleccionados() throws Exception {
		ArrayList<EmpleadoDisca> empleadodiscasSeleccionados=new ArrayList<EmpleadoDisca>();		
		
		empleadodiscasSeleccionados=this.getEmpleadoDiscasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadodisca.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EmpleadoDiscas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEmpleadoDisca(row);				
				iRow++;
			}				
			
			for(EmpleadoDisca empleadodiscaAux:empleadodiscasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEmpleadoDisca(empleadodiscaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Disca",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEmpleadoDiscasSeleccionados() throws Exception {
		ArrayList<EmpleadoDisca> empleadodiscasSeleccionados=new ArrayList<EmpleadoDisca>();		
		
		empleadodiscasSeleccionados=this.getEmpleadoDiscasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadodisca.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("empleadodiscas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("empleadodisca");
			//elementRoot.appendChild(element);
		
			for(EmpleadoDisca empleadodiscaAux:empleadodiscasSeleccionados) {
				element = document.createElement("empleadodisca");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEmpleadoDisca(empleadodiscaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Disca",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEmpleadoDisca(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoDiscaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoDiscaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoDiscaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoDiscaConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoDiscaConstantesFunciones.LABEL_IDTIPODISCAPACIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEINICIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoDiscaConstantesFunciones.LABEL_PORCENTAJEFINAL);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoDiscaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEmpleadoDisca(EmpleadoDisca empleadodisca,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(empleadodisca.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadodisca.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadodisca.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadodisca.gettipodiscapacidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadodisca.getporcentaje_inicial());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadodisca.getporcentaje_final());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadodisca.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlEmpleadoDisca(EmpleadoDisca empleadodisca,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EmpleadoDiscaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(empleadodisca.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EmpleadoDiscaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(empleadodisca.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EmpleadoDiscaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(empleadodisca.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(EmpleadoDiscaConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(empleadodisca.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementtipodiscapacidad_descripcion = document.createElement(EmpleadoDiscaConstantesFunciones.IDTIPODISCAPACIDAD);
		elementtipodiscapacidad_descripcion.appendChild(document.createTextNode(empleadodisca.gettipodiscapacidad_descripcion()));
		element.appendChild(elementtipodiscapacidad_descripcion);

		Element elementporcentaje_inicial = document.createElement(EmpleadoDiscaConstantesFunciones.PORCENTAJEINICIAL);
		elementporcentaje_inicial.appendChild(document.createTextNode(empleadodisca.getporcentaje_inicial().toString().trim()));
		element.appendChild(elementporcentaje_inicial);

		Element elementporcentaje_final = document.createElement(EmpleadoDiscaConstantesFunciones.PORCENTAJEFINAL);
		elementporcentaje_final.appendChild(document.createTextNode(empleadodisca.getporcentaje_final().toString().trim()));
		element.appendChild(elementporcentaje_final);

		Element elementdescripcion = document.createElement(EmpleadoDiscaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(empleadodisca.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoEmpleadoDiscasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EmpleadoDisca> empleadodiscasSeleccionados=new ArrayList<EmpleadoDisca>();
		
		empleadodiscasSeleccionados=this.getEmpleadoDiscasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEmpleadoDisca(empleadodiscasSeleccionados);
		
		this.generarReporteEmpleadoDiscas("Todos",empleadodiscasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEmpleadoDisca(ArrayList<EmpleadoDisca> empleadodiscasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EmpleadoDisca empleadodiscaAux:empleadodiscasSeleccionados) {
				empleadodiscaAux.setsDetalleGeneralEntityReporte(empleadodiscaAux.toString());
			
				if(sTipoSeleccionar.equals(EmpleadoDiscaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					empleadodiscaAux.setsDescripcionGeneralEntityReporte1(empleadodiscaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoDiscaConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					empleadodiscaAux.setsDescripcionGeneralEntityReporte1(empleadodiscaAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoDiscaConstantesFunciones.LABEL_IDTIPODISCAPACIDAD)) {
					existe=true;
					empleadodiscaAux.setsDescripcionGeneralEntityReporte1(empleadodiscaAux.gettipodiscapacidad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoDiscaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					empleadodiscaAux.setsDescripcionGeneralEntityReporte1(empleadodiscaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoDiscaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEmpleadoDisca(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEmpleadoDisca=true;
				this.isVisibilidadCeldaNuevoRelacionesEmpleadoDisca=true;
				this.isVisibilidadCeldaGuardarCambiosEmpleadoDisca=true;
			}
			
			this.isVisibilidadCeldaModificarEmpleadoDisca=false;
			this.isVisibilidadCeldaActualizarEmpleadoDisca=false;
			this.isVisibilidadCeldaEliminarEmpleadoDisca=false;
			this.isVisibilidadCeldaCancelarEmpleadoDisca=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoDisca=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoDisca=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEmpleadoDisca=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoDisca=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoDisca=false;
			this.isVisibilidadCeldaModificarEmpleadoDisca=false;
			this.isVisibilidadCeldaActualizarEmpleadoDisca=true;
			this.isVisibilidadCeldaEliminarEmpleadoDisca=false;
			this.isVisibilidadCeldaCancelarEmpleadoDisca=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoDisca=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoDisca=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEmpleadoDisca=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoDisca=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoDisca=false;
			this.isVisibilidadCeldaModificarEmpleadoDisca=false;
			this.isVisibilidadCeldaActualizarEmpleadoDisca=true;
			this.isVisibilidadCeldaEliminarEmpleadoDisca=true;
			this.isVisibilidadCeldaCancelarEmpleadoDisca=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoDisca=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoDisca=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEmpleadoDisca=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoDisca=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoDisca=false;
			this.isVisibilidadCeldaModificarEmpleadoDisca=false;
			this.isVisibilidadCeldaActualizarEmpleadoDisca=true;
			this.isVisibilidadCeldaEliminarEmpleadoDisca=false;
			this.isVisibilidadCeldaCancelarEmpleadoDisca=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoDisca=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoDisca=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEmpleadoDisca=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoDisca=true;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoDisca=true;
			this.isVisibilidadCeldaModificarEmpleadoDisca=false;
			this.isVisibilidadCeldaActualizarEmpleadoDisca=false;
			this.isVisibilidadCeldaEliminarEmpleadoDisca=false;
			this.isVisibilidadCeldaCancelarEmpleadoDisca=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoDisca=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoDisca=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEmpleadoDisca=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoDisca=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoDisca=false;
			this.isVisibilidadCeldaActualizarEmpleadoDisca=false;
			this.isVisibilidadCeldaEliminarEmpleadoDisca=false;
			this.isVisibilidadCeldaCancelarEmpleadoDisca=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoDisca=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoDisca=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEmpleadoDisca=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoDisca=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoDisca=false;
			this.isVisibilidadCeldaModificarEmpleadoDisca=true;
			this.isVisibilidadCeldaActualizarEmpleadoDisca=false;
			this.isVisibilidadCeldaEliminarEmpleadoDisca=false;
			this.isVisibilidadCeldaCancelarEmpleadoDisca=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoDisca=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoDisca=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EmpleadoDiscaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEmpleadoDisca=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoDisca=true;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoDisca=true;
		} else {
			this.actualizarEstadoPanelsEmpleadoDisca(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEmpleadoDisca=false;
			//this.isVisibilidadCeldaVerFormEmpleadoDisca=false;
			this.isVisibilidadCeldaDuplicarEmpleadoDisca=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!empleadodiscaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoDisca=false;
		} else {
			this.isVisibilidadCeldaNuevoEmpleadoDisca=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoDisca=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(empleadodiscaSessionBean.getEsGuardarRelacionado()) {
			if(!empleadodiscaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEmpleadoDisca=false;												
			}
			
			this.jButtonCerrarEmpleadoDisca.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoDisca=false;
		}
		
		if(!this.permiteMantenimiento(this.empleadodisca)) {
			this.isVisibilidadCeldaActualizarEmpleadoDisca=false;
			this.isVisibilidadCeldaEliminarEmpleadoDisca=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEmpleadoDisca() {
	}
	
	public void actualizarEstadoPanelsEmpleadoDisca(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEmpleadoDisca!=null) {
				this.jScrollPanelDatosEdicionEmpleadoDisca.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoDisca!=null) {
				this.jTabbedPaneBusquedasEmpleadoDisca.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoDisca!=null) {
				this.jScrollPanelDatosEmpleadoDisca.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoDisca!=null) {
				this.jPanelPaginacionEmpleadoDisca.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoDisca!=null) {
				this.jPanelParametrosReportesEmpleadoDisca.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEmpleadoDisca!=null) {
				this.jScrollPanelDatosEdicionEmpleadoDisca.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoDisca!=null) {
				this.jTabbedPaneBusquedasEmpleadoDisca.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEmpleadoDisca!=null) {
				this.jScrollPanelDatosEmpleadoDisca.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoDisca!=null) {
				this.jPanelPaginacionEmpleadoDisca.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoDisca!=null) {
				this.jPanelParametrosReportesEmpleadoDisca.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEmpleadoDisca!=null) {
				this.jScrollPanelDatosEdicionEmpleadoDisca.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoDisca!=null) {
				this.jTabbedPaneBusquedasEmpleadoDisca.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoDisca!=null) {
				this.jScrollPanelDatosEmpleadoDisca.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoDisca!=null) {
				this.jPanelPaginacionEmpleadoDisca.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoDisca!=null) {
				this.jPanelParametrosReportesEmpleadoDisca.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEmpleadoDisca!=null) {
				this.jScrollPanelDatosEdicionEmpleadoDisca.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoDisca!=null) {
				this.jTabbedPaneBusquedasEmpleadoDisca.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoDisca!=null) {
				this.jScrollPanelDatosEmpleadoDisca.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoDisca!=null) {
				this.jPanelPaginacionEmpleadoDisca.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoDisca!=null) {
				this.jPanelParametrosReportesEmpleadoDisca.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEmpleadoDisca!=null) {
				this.jScrollPanelDatosEdicionEmpleadoDisca.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoDisca!=null) {
				this.jTabbedPaneBusquedasEmpleadoDisca.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoDisca!=null) {
				this.jScrollPanelDatosEmpleadoDisca.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoDisca!=null) {
				this.jPanelPaginacionEmpleadoDisca.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoDisca!=null) {
				this.jPanelParametrosReportesEmpleadoDisca.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEmpleadoDisca!=null) {
				this.jScrollPanelDatosEdicionEmpleadoDisca.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoDisca!=null) {
				this.jTabbedPaneBusquedasEmpleadoDisca.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoDisca!=null) {
				this.jScrollPanelDatosEmpleadoDisca.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoDisca!=null) {
				this.jPanelPaginacionEmpleadoDisca.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoDisca!=null) {
				this.jPanelParametrosReportesEmpleadoDisca.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEmpleadoDisca!=null) {
				this.jScrollPanelDatosEdicionEmpleadoDisca.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoDisca!=null) {
				this.jTabbedPaneBusquedasEmpleadoDisca.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoDisca!=null) {
				this.jScrollPanelDatosEmpleadoDisca.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoDisca!=null) {
				this.jPanelPaginacionEmpleadoDisca.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoDisca!=null) {
				this.jPanelParametrosReportesEmpleadoDisca.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEmpleadoDisca!=null) {
					this.jTabbedPaneBusquedasEmpleadoDisca.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEmpleadoDisca!=null) {
				this.jPanelParametrosReportesEmpleadoDisca.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.empleadodiscaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoDisca!=null) {
				this.jTabbedPaneBusquedasEmpleadoDisca.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEmpleadoDisca!=null) {
				this.jPanelParametrosReportesEmpleadoDisca.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoDisca.remove(jPanelFK_IdEmpleadoEmpleadoDisca);}

			this.isVisibilidadFK_IdTipoDiscapacidad=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoDiscapacidad) {this.jTabbedPaneBusquedasEmpleadoDisca.remove(jPanelFK_IdTipoDiscapacidadEmpleadoDisca);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoDisca.remove(jPanelFK_IdEmpleadoEmpleadoDisca);}

			this.isVisibilidadFK_IdTipoDiscapacidad=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdTipoDiscapacidad) {this.jTabbedPaneBusquedasEmpleadoDisca.remove(jPanelFK_IdTipoDiscapacidadEmpleadoDisca);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoDiscapacidad(Boolean isParaTipoDiscapacidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoDiscapacidadNegation=!isParaTipoDiscapacidad;

			this.isVisibilidadFK_IdEmpleado=isParaTipoDiscapacidadNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoDisca.remove(jPanelFK_IdEmpleadoEmpleadoDisca);}

			this.isVisibilidadFK_IdTipoDiscapacidad=isParaTipoDiscapacidad;
			if(!this.isVisibilidadFK_IdTipoDiscapacidad) {this.jTabbedPaneBusquedasEmpleadoDisca.remove(jPanelFK_IdTipoDiscapacidadEmpleadoDisca);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EmpleadoDiscaSessionBean empleadodiscaSessionBean=new EmpleadoDiscaSessionBean();
		
		if(this.empleadodiscaSessionBean==null) {
			this.empleadodiscaSessionBean=new EmpleadoDiscaSessionBean();
		}
		
		this.empleadodiscaSessionBean.setsUltimaBusquedaEmpleadoDisca(this.getsAccionBusqueda());
		this.empleadodiscaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.empleadodiscaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			empleadodiscaSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			empleadodiscaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoDiscapacidad")) {
			empleadodiscaSessionBean.setid_tipo_discapacidad(this.getid_tipo_discapacidadFK_IdTipoDiscapacidad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EmpleadoDiscaSessionBean empleadodiscaSessionBean=new EmpleadoDiscaSessionBean();
		
		if(this.empleadodiscaSessionBean==null) {
			this.empleadodiscaSessionBean=new EmpleadoDiscaSessionBean();
		}
		
		if(this.empleadodiscaSessionBean.getsUltimaBusquedaEmpleadoDisca()!=null&&!this.empleadodiscaSessionBean.getsUltimaBusquedaEmpleadoDisca().equals("")) {
			this.setsAccionBusqueda(empleadodiscaSessionBean.getsUltimaBusquedaEmpleadoDisca());
			this.setiNumeroPaginacion(empleadodiscaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(empleadodiscaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(empleadodiscaSessionBean.getid_empleado());
				empleadodiscaSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(empleadodiscaSessionBean.getid_empresa());
				empleadodiscaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoDiscapacidad")) {
				this.setid_tipo_discapacidadFK_IdTipoDiscapacidad(empleadodiscaSessionBean.getid_tipo_discapacidad());
				empleadodiscaSessionBean.setid_tipo_discapacidad(-1L);
			}
		}
		
		this.empleadodiscaSessionBean.setsUltimaBusquedaEmpleadoDisca("");
		this.empleadodiscaSessionBean.setiNumeroPaginacion(EmpleadoDiscaConstantesFunciones.INUMEROPAGINACION);
		this.empleadodiscaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEmpleadoDisca(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEmpleadoDisca() {
		this.updateBorderResaltarBusquedasFormularioEmpleadoDisca();
		this.updateVisibilidadBusquedasFormularioEmpleadoDisca();
		this.updateHabilitarBusquedasFormularioEmpleadoDisca();
	}
	
	public void updateBorderResaltarBusquedasFormularioEmpleadoDisca() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEmpleadoDisca.getComponents().length>0) {
	

		if(this.empleadodiscaConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoDisca!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoDisca.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoDisca);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoDisca.getComponent(index);
				jPanel.setBorder(this.empleadodiscaConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoDisca);
			}
		}

		if(this.empleadodiscaConstantesFunciones.resaltarFK_IdTipoDiscapacidadEmpleadoDisca!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoDisca.indexOfComponent(this.jPanelFK_IdTipoDiscapacidadEmpleadoDisca);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoDisca.getComponent(index);
				jPanel.setBorder(this.empleadodiscaConstantesFunciones.resaltarFK_IdTipoDiscapacidadEmpleadoDisca);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEmpleadoDisca() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEmpleadoDisca.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpleadoDisca.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoDisca);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoDisca.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadodiscaConstantesFunciones.mostrarFK_IdEmpleadoEmpleadoDisca);
			if(!this.empleadodiscaConstantesFunciones.mostrarFK_IdEmpleadoEmpleadoDisca && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoDisca.remove(index);
			}

			index= this.jTabbedPaneBusquedasEmpleadoDisca.indexOfComponent(this.jPanelFK_IdTipoDiscapacidadEmpleadoDisca);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoDisca.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadodiscaConstantesFunciones.mostrarFK_IdTipoDiscapacidadEmpleadoDisca);
			if(!this.empleadodiscaConstantesFunciones.mostrarFK_IdTipoDiscapacidadEmpleadoDisca && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoDisca.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEmpleadoDisca() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEmpleadoDisca.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpleadoDisca.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoDisca);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoDisca.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadodiscaConstantesFunciones.activarFK_IdEmpleadoEmpleadoDisca);
				this.jTabbedPaneBusquedasEmpleadoDisca.setEnabledAt(index,this.empleadodiscaConstantesFunciones.activarFK_IdEmpleadoEmpleadoDisca);
			}

			index= this.jTabbedPaneBusquedasEmpleadoDisca.indexOfComponent(this.jPanelFK_IdTipoDiscapacidadEmpleadoDisca);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoDisca.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadodiscaConstantesFunciones.activarFK_IdTipoDiscapacidadEmpleadoDisca);
				this.jTabbedPaneBusquedasEmpleadoDisca.setEnabledAt(index,this.empleadodiscaConstantesFunciones.activarFK_IdTipoDiscapacidadEmpleadoDisca);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEmpleadoDisca(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasEmpleadoDisca.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoDisca);

			this.jTabbedPaneBusquedasEmpleadoDisca.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoDisca.getComponent(index);

			this.empleadodiscaConstantesFunciones.setResaltarFK_IdEmpleadoEmpleadoDisca(resaltar);

			jPanel.setBorder(this.empleadodiscaConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoDisca);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoDiscapacidad")) {
			index= this.jTabbedPaneBusquedasEmpleadoDisca.indexOfComponent(this.jPanelFK_IdTipoDiscapacidadEmpleadoDisca);

			this.jTabbedPaneBusquedasEmpleadoDisca.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoDisca.getComponent(index);

			this.empleadodiscaConstantesFunciones.setResaltarFK_IdTipoDiscapacidadEmpleadoDisca(resaltar);

			jPanel.setBorder(this.empleadodiscaConstantesFunciones.resaltarFK_IdTipoDiscapacidadEmpleadoDisca);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEmpleadoDisca.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEmpleadoDisca() throws Exception {

		if(this.jInternalFrameDetalleFormEmpleadoDisca==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEmpleadoDisca();
		this.updateVisibilidadResaltarControlesFormularioEmpleadoDisca();
		this.updateHabilitarResaltarControlesFormularioEmpleadoDisca();
		
	}
	
	public void updateBorderResaltarControlesFormularioEmpleadoDisca() throws Exception {
		if(this.jInternalFrameDetalleFormEmpleadoDisca==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.empleadodiscaConstantesFunciones.resaltaridEmpleadoDisca!=null && this.jInternalFrameDetalleFormEmpleadoDisca!=null) {this.jInternalFrameDetalleFormEmpleadoDisca.jLabelidEmpleadoDisca.setBorder(this.empleadodiscaConstantesFunciones.resaltaridEmpleadoDisca);}
		if(this.empleadodiscaConstantesFunciones.resaltarid_empresaEmpleadoDisca!=null && this.jInternalFrameDetalleFormEmpleadoDisca!=null) {this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empresaEmpleadoDisca.setBorder(this.empleadodiscaConstantesFunciones.resaltarid_empresaEmpleadoDisca);}
		if(this.empleadodiscaConstantesFunciones.resaltarid_empleadoEmpleadoDisca!=null && this.jInternalFrameDetalleFormEmpleadoDisca!=null) {this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empleadoEmpleadoDisca.setBorder(this.empleadodiscaConstantesFunciones.resaltarid_empleadoEmpleadoDisca);}
		if(this.empleadodiscaConstantesFunciones.resaltarid_tipo_discapacidadEmpleadoDisca!=null && this.jInternalFrameDetalleFormEmpleadoDisca!=null) {this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_tipo_discapacidadEmpleadoDisca.setBorder(this.empleadodiscaConstantesFunciones.resaltarid_tipo_discapacidadEmpleadoDisca);}
		if(this.empleadodiscaConstantesFunciones.resaltarporcentaje_inicialEmpleadoDisca!=null && this.jInternalFrameDetalleFormEmpleadoDisca!=null) {this.jInternalFrameDetalleFormEmpleadoDisca.jTextFieldporcentaje_inicialEmpleadoDisca.setBorder(this.empleadodiscaConstantesFunciones.resaltarporcentaje_inicialEmpleadoDisca);}
		if(this.empleadodiscaConstantesFunciones.resaltarporcentaje_finalEmpleadoDisca!=null && this.jInternalFrameDetalleFormEmpleadoDisca!=null) {this.jInternalFrameDetalleFormEmpleadoDisca.jTextFieldporcentaje_finalEmpleadoDisca.setBorder(this.empleadodiscaConstantesFunciones.resaltarporcentaje_finalEmpleadoDisca);}
		if(this.empleadodiscaConstantesFunciones.resaltardescripcionEmpleadoDisca!=null && this.jInternalFrameDetalleFormEmpleadoDisca!=null) {this.jInternalFrameDetalleFormEmpleadoDisca.jTextAreadescripcionEmpleadoDisca.setBorder(this.empleadodiscaConstantesFunciones.resaltardescripcionEmpleadoDisca);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEmpleadoDisca() throws Exception {		
		if(this.jInternalFrameDetalleFormEmpleadoDisca==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
	
		//this.jInternalFrameDetalleFormEmpleadoDisca.jLabelidEmpleadoDisca.setVisible(this.empleadodiscaConstantesFunciones.mostraridEmpleadoDisca);
		this.jInternalFrameDetalleFormEmpleadoDisca.jPanelidEmpleadoDisca.setVisible(this.empleadodiscaConstantesFunciones.mostraridEmpleadoDisca);
		//this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empresaEmpleadoDisca.setVisible(this.empleadodiscaConstantesFunciones.mostrarid_empresaEmpleadoDisca);
		this.jInternalFrameDetalleFormEmpleadoDisca.jPanelid_empresaEmpleadoDisca.setVisible(this.empleadodiscaConstantesFunciones.mostrarid_empresaEmpleadoDisca);
		//this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empleadoEmpleadoDisca.setVisible(this.empleadodiscaConstantesFunciones.mostrarid_empleadoEmpleadoDisca);
		this.jInternalFrameDetalleFormEmpleadoDisca.jPanelid_empleadoEmpleadoDisca.setVisible(this.empleadodiscaConstantesFunciones.mostrarid_empleadoEmpleadoDisca);
		//this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_tipo_discapacidadEmpleadoDisca.setVisible(this.empleadodiscaConstantesFunciones.mostrarid_tipo_discapacidadEmpleadoDisca);
		this.jInternalFrameDetalleFormEmpleadoDisca.jPanelid_tipo_discapacidadEmpleadoDisca.setVisible(this.empleadodiscaConstantesFunciones.mostrarid_tipo_discapacidadEmpleadoDisca);
		//this.jInternalFrameDetalleFormEmpleadoDisca.jTextFieldporcentaje_inicialEmpleadoDisca.setVisible(this.empleadodiscaConstantesFunciones.mostrarporcentaje_inicialEmpleadoDisca);
		this.jInternalFrameDetalleFormEmpleadoDisca.jPanelporcentaje_inicialEmpleadoDisca.setVisible(this.empleadodiscaConstantesFunciones.mostrarporcentaje_inicialEmpleadoDisca);
		//this.jInternalFrameDetalleFormEmpleadoDisca.jTextFieldporcentaje_finalEmpleadoDisca.setVisible(this.empleadodiscaConstantesFunciones.mostrarporcentaje_finalEmpleadoDisca);
		this.jInternalFrameDetalleFormEmpleadoDisca.jPanelporcentaje_finalEmpleadoDisca.setVisible(this.empleadodiscaConstantesFunciones.mostrarporcentaje_finalEmpleadoDisca);
		//this.jInternalFrameDetalleFormEmpleadoDisca.jTextAreadescripcionEmpleadoDisca.setVisible(this.empleadodiscaConstantesFunciones.mostrardescripcionEmpleadoDisca);
		this.jInternalFrameDetalleFormEmpleadoDisca.jPaneldescripcionEmpleadoDisca.setVisible(this.empleadodiscaConstantesFunciones.mostrardescripcionEmpleadoDisca);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEmpleadoDisca() throws Exception {
		if(this.jInternalFrameDetalleFormEmpleadoDisca==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoDisca!=null) {
	
		this.jInternalFrameDetalleFormEmpleadoDisca.jLabelidEmpleadoDisca.setEnabled(this.empleadodiscaConstantesFunciones.activaridEmpleadoDisca);
		this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empresaEmpleadoDisca.setEnabled(this.empleadodiscaConstantesFunciones.activarid_empresaEmpleadoDisca);
		this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_empleadoEmpleadoDisca.setEnabled(this.empleadodiscaConstantesFunciones.activarid_empleadoEmpleadoDisca);
		this.jInternalFrameDetalleFormEmpleadoDisca.jComboBoxid_tipo_discapacidadEmpleadoDisca.setEnabled(this.empleadodiscaConstantesFunciones.activarid_tipo_discapacidadEmpleadoDisca);
		this.jInternalFrameDetalleFormEmpleadoDisca.jTextFieldporcentaje_inicialEmpleadoDisca.setEnabled(this.empleadodiscaConstantesFunciones.activarporcentaje_inicialEmpleadoDisca);
		this.jInternalFrameDetalleFormEmpleadoDisca.jTextFieldporcentaje_finalEmpleadoDisca.setEnabled(this.empleadodiscaConstantesFunciones.activarporcentaje_finalEmpleadoDisca);
		this.jInternalFrameDetalleFormEmpleadoDisca.jTextAreadescripcionEmpleadoDisca.setEnabled(this.empleadodiscaConstantesFunciones.activardescripcionEmpleadoDisca);
		}
	}
	
		
}