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

import com.bydan.erp.nomina.util.RasgoPersonalConstantesFunciones;
import com.bydan.erp.nomina.util.RasgoPersonalParameterReturnGeneral;
//import com.bydan.erp.nomina.util.RasgoPersonalParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.RasgoPersonalBean;
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
public class RasgoPersonalBeanSwingJInternalFrame extends RasgoPersonalJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(RasgoPersonalBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<RasgoPersonal> rasgopersonalValidator = new ClassValidator<RasgoPersonal>(RasgoPersonal.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public RasgoPersonal rasgopersonal;	
	public RasgoPersonal rasgopersonalAux;
	public RasgoPersonal rasgopersonalAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public RasgoPersonal rasgopersonalTotales;
	public Long idRasgoPersonalActual;
	public Long iIdNuevoRasgoPersonal=0L;
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

	public String sFinalQueryComboTipoRasgoPersonal="";

	public List<TipoRasgoPersonal> tiporasgopersonalsForeignKey;

	public List<TipoRasgoPersonal> gettiporasgopersonalsForeignKey() {
		return tiporasgopersonalsForeignKey;
	}

	public void settiporasgopersonalsForeignKey(List<TipoRasgoPersonal> tiporasgopersonalsForeignKey) {
		this.tiporasgopersonalsForeignKey = tiporasgopersonalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoRasgoPersonal tiporasgopersonalForeignKey;

	public TipoRasgoPersonal gettiporasgopersonalForeignKey() {
		return tiporasgopersonalForeignKey;
	}

	public void settiporasgopersonalForeignKey(TipoRasgoPersonal tiporasgopersonalForeignKey) {
		this.tiporasgopersonalForeignKey = tiporasgopersonalForeignKey;
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
	
	public Boolean isPermisoTodoRasgoPersonal;
	public Boolean isPermisoNuevoRasgoPersonal;
	public Boolean isPermisoActualizarRasgoPersonal;
	public Boolean isPermisoActualizarOriginalRasgoPersonal;
	public Boolean isPermisoEliminarRasgoPersonal;
	public Boolean isPermisoGuardarCambiosRasgoPersonal;
	public Boolean isPermisoConsultaRasgoPersonal;
	public Boolean isPermisoBusquedaRasgoPersonal;
	public Boolean isPermisoReporteRasgoPersonal;
	public Boolean isPermisoPaginacionMedioRasgoPersonal;
	public Boolean isPermisoPaginacionAltoRasgoPersonal;
	public Boolean isPermisoPaginacionTodoRasgoPersonal;
	public Boolean isPermisoCopiarRasgoPersonal;
	public Boolean isPermisoVerFormRasgoPersonal;
	public Boolean isPermisoDuplicarRasgoPersonal;
	public Boolean isPermisoOrdenRasgoPersonal;
	
	
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
	
	public RasgoPersonalParameterReturnGeneral rasgopersonalReturnGeneral;
	public RasgoPersonalParameterReturnGeneral rasgopersonalParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoRasgoPersonal=false;
	public Boolean esParaAccionDesdeFormularioRasgoPersonal=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected RasgoPersonalSessionBeanAdditional rasgopersonalSessionBeanAdditional=null;
	
	public RasgoPersonalSessionBeanAdditional getRasgoPersonalSessionBeanAdditional() {
		return this.rasgopersonalSessionBeanAdditional;
	}
	
	public void setRasgoPersonalSessionBeanAdditional(RasgoPersonalSessionBeanAdditional rasgopersonalSessionBeanAdditional) {
		try {
			this.rasgopersonalSessionBeanAdditional=rasgopersonalSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected RasgoPersonalBeanSwingJInternalFrameAdditional rasgopersonalBeanSwingJInternalFrameAdditional=null;
	//public class RasgoPersonalBeanSwingJInternalFrame
	
	public RasgoPersonalBeanSwingJInternalFrameAdditional getRasgoPersonalBeanSwingJInternalFrameAdditional() {
		return this.rasgopersonalBeanSwingJInternalFrameAdditional;
	}
	
	public void setRasgoPersonalBeanSwingJInternalFrameAdditional(RasgoPersonalBeanSwingJInternalFrameAdditional rasgopersonalBeanSwingJInternalFrameAdditional) {
		try {
			this.rasgopersonalBeanSwingJInternalFrameAdditional=rasgopersonalBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public RasgoPersonalLogic rasgopersonalLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public RasgoPersonal rasgopersonalBean;
	public RasgoPersonalConstantesFunciones rasgopersonalConstantesFunciones;
	//public RasgoPersonalParameterReturnGeneral rasgopersonalReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public TipoRasgoPersonalLogic tiporasgopersonalLogic;
	
	//PARAMETROS
	
	
	//public List<RasgoPersonal> rasgopersonals;	
	//public List<RasgoPersonal> rasgopersonalsEliminados;
	//public List<RasgoPersonal> rasgopersonalsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoRasgoPersonal=false;
	public Boolean isVisibilidadCeldaDuplicarRasgoPersonal=true;
	public Boolean isVisibilidadCeldaCopiarRasgoPersonal=true;
	public Boolean isVisibilidadCeldaVerFormRasgoPersonal=true;
	public Boolean isVisibilidadCeldaOrdenRasgoPersonal=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesRasgoPersonal=false;
	public Boolean isVisibilidadCeldaModificarRasgoPersonal=false;
	public Boolean isVisibilidadCeldaActualizarRasgoPersonal=false;
	public Boolean isVisibilidadCeldaEliminarRasgoPersonal=false;
	public Boolean isVisibilidadCeldaCancelarRasgoPersonal=false;
	public Boolean isVisibilidadCeldaGuardarRasgoPersonal=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosRasgoPersonal=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoRasgoPersonal=false;
	
	public Long getiIdNuevoRasgoPersonal() {
		return this.iIdNuevoRasgoPersonal;
	}

	public void setiIdNuevoRasgoPersonal(Long iIdNuevoRasgoPersonal) {
		this.iIdNuevoRasgoPersonal = iIdNuevoRasgoPersonal;
	}
	
	public Long getidRasgoPersonalActual() {
		return this.idRasgoPersonalActual;
	}

	public void setidRasgoPersonalActual(Long idRasgoPersonalActual) {
		this.idRasgoPersonalActual = idRasgoPersonalActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public RasgoPersonal getrasgopersonal() {
		return this.rasgopersonal;
	}

	public void setrasgopersonal(RasgoPersonal rasgopersonal) {
		this.rasgopersonal = rasgopersonal;
	}
	
	public RasgoPersonal getrasgopersonalAux() {
		return this.rasgopersonalAux;
	}

	public void setrasgopersonalAux(RasgoPersonal rasgopersonalAux) {
		this.rasgopersonalAux = rasgopersonalAux;
	}				
	
	public RasgoPersonal getrasgopersonalAnterior() {
		return this.rasgopersonalAnterior;
	}

	public void setrasgopersonalAnterior(RasgoPersonal rasgopersonalAnterior) {
		this.rasgopersonalAnterior = rasgopersonalAnterior;
	}	
	
	public RasgoPersonal getrasgopersonalTotales() {
		return this.rasgopersonalTotales;
	}

	public void setrasgopersonalTotales(RasgoPersonal rasgopersonalTotales) {
		this.rasgopersonalTotales = rasgopersonalTotales;
	}	
	
	public RasgoPersonal getrasgopersonalBean() {
		return this.rasgopersonalBean;
	}

	public void setrasgopersonalBean(RasgoPersonal rasgopersonalBean) {
		this.rasgopersonalBean = rasgopersonalBean;
	}	
	
	public RasgoPersonalParameterReturnGeneral getrasgopersonalReturnGeneral() {
		return this.rasgopersonalReturnGeneral;
	}

	public void setrasgopersonalReturnGeneral(RasgoPersonalParameterReturnGeneral rasgopersonalReturnGeneral) {
		this.rasgopersonalReturnGeneral = rasgopersonalReturnGeneral;
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

	public Long id_tipo_rasgo_personalFK_IdTipoRasgoPersonal=-1L;

	public Long getid_tipo_rasgo_personalFK_IdTipoRasgoPersonal() {
		return this.id_tipo_rasgo_personalFK_IdTipoRasgoPersonal;
	}

	public void setid_tipo_rasgo_personalFK_IdTipoRasgoPersonal(Long id_tipo_rasgo_personalFK_IdTipoRasgoPersonal) {
		this.id_tipo_rasgo_personalFK_IdTipoRasgoPersonal = id_tipo_rasgo_personalFK_IdTipoRasgoPersonal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public RasgoPersonalLogic getRasgoPersonalLogic()	{		
		return rasgopersonalLogic;
	}

	public void setRasgoPersonalLogic(RasgoPersonalLogic rasgopersonalLogic) {
		this.rasgopersonalLogic = rasgopersonalLogic;
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
	
	public Boolean getIsEsNuevoRasgoPersonal() {
		return isEsNuevoRasgoPersonal;
	}

	public void setIsEsNuevoRasgoPersonal(Boolean isEsNuevoRasgoPersonal) {
		this.isEsNuevoRasgoPersonal = isEsNuevoRasgoPersonal;
	}

	public Boolean getEsParaAccionDesdeFormularioRasgoPersonal() {
		return esParaAccionDesdeFormularioRasgoPersonal;
	}
	
	public void setEsParaAccionDesdeFormularioRasgoPersonal(Boolean esParaAccionDesdeFormularioRasgoPersonal) {
		this.esParaAccionDesdeFormularioRasgoPersonal = esParaAccionDesdeFormularioRasgoPersonal;
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

			if(this.rasgopersonalSessionBean==null) {
				this.rasgopersonalSessionBean=new RasgoPersonalSessionBean();
			}

			if(!this.rasgopersonalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(rasgopersonalSessionBean.getlidEmpresaActual());
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

			if(this.rasgopersonalSessionBean==null) {
				this.rasgopersonalSessionBean=new RasgoPersonalSessionBean();
			}

			if(!this.rasgopersonalSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(rasgopersonalSessionBean.getlidEmpleadoActual());
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

	public void cargarCombosTipoRasgoPersonalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tiporasgopersonalsForeignKey=new ArrayList<TipoRasgoPersonal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoRasgoPersonalLogic tiporasgopersonalLogic=new TipoRasgoPersonalLogic();

			//tiporasgopersonalLogic.getTipoRasgoPersonalDataAccess().setIsForForeingKeyData(true);

			if(this.rasgopersonalSessionBean==null) {
				this.rasgopersonalSessionBean=new RasgoPersonalSessionBean();
			}

			if(!this.rasgopersonalSessionBean.getisBusquedaDesdeForeignKeySesionTipoRasgoPersonal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tiporasgopersonalLogic.getTipoRasgoPersonalDataAccess().setIsForForeingKeyData(true);

					tiporasgopersonalLogic.getTodosTipoRasgoPersonalsWithConnection(sFinalQuery,new Pagination());

					this.tiporasgopersonalsForeignKey=tiporasgopersonalLogic.getTipoRasgoPersonals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoRasgoPersonal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporasgopersonalLogic.getEntityWithConnection(rasgopersonalSessionBean.getlidTipoRasgoPersonalActual());
					this.tiporasgopersonalsForeignKey.add(tiporasgopersonalLogic.getTipoRasgoPersonal());
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

					if(this.rasgopersonal!=null) {
						this.rasgopersonal.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
						this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empresaRasgoPersonal.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaRasgoPersonal.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
						if(this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empresaRasgoPersonal.getItemCount()>0) {
							this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empresaRasgoPersonal.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaRasgoPersonalGenerico)throws Exception
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
				jComboBoxid_empresaRasgoPersonalGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaRasgoPersonalGenerico!=null && jComboBoxid_empresaRasgoPersonalGenerico.getItemCount()>0) {
					jComboBoxid_empresaRasgoPersonalGenerico.setSelectedIndex(0);
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

					if(this.rasgopersonal!=null) {
						this.rasgopersonal.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
						this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empleadoRasgoPersonal.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoRasgoPersonal.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
						if(this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empleadoRasgoPersonal.getItemCount()>0) {
							this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empleadoRasgoPersonal.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoRasgoPersonal!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoRasgoPersonal.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoRasgoPersonal!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoRasgoPersonal.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoRasgoPersonal.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoRasgoPersonal.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoRasgoPersonalGenerico)throws Exception
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
				jComboBoxid_empleadoRasgoPersonalGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoRasgoPersonalGenerico!=null && jComboBoxid_empleadoRasgoPersonalGenerico.getItemCount()>0) {
					jComboBoxid_empleadoRasgoPersonalGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoRasgoPersonalForeignKey(Long idTipoRasgoPersonalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoRasgoPersonal  tiporasgopersonalTemp=null;

			for(TipoRasgoPersonal tiporasgopersonalAux:tiporasgopersonalsForeignKey) {
				if(tiporasgopersonalAux.getId()!=null && tiporasgopersonalAux.getId().equals(idTipoRasgoPersonalSeleccionado)) {
					tiporasgopersonalTemp=tiporasgopersonalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tiporasgopersonalTemp!=null) {

					if(this.rasgopersonal!=null) {
						this.rasgopersonal.setTipoRasgoPersonal(tiporasgopersonalTemp);
					}

					if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
						this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_tipo_rasgo_personalRasgoPersonal.setSelectedItem(tiporasgopersonalTemp);
					}
				} else {
					//jComboBoxid_tipo_rasgo_personalRasgoPersonal.setSelectedItem(tiporasgopersonalTemp);
					if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
						if(this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_tipo_rasgo_personalRasgoPersonal.getItemCount()>0) {
							this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_tipo_rasgo_personalRasgoPersonal.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoRasgoPersonal") || sFormularioTipoBusqueda.equals("Todos")){
					if(tiporasgopersonalTemp!=null && jComboBoxid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal!=null) {
						jComboBoxid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal.setSelectedItem(tiporasgopersonalTemp);
					} else {
						if(jComboBoxid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal!=null) {
							//jComboBoxid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal.setSelectedItem(tiporasgopersonalTemp);
							if(jComboBoxid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal.getItemCount()>0) {
								jComboBoxid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal.setSelectedIndex(0);
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

	public String getActualTipoRasgoPersonalForeignKeyDescripcion(Long idTipoRasgoPersonalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoRasgoPersonal  tiporasgopersonalTemp=null;

			for(TipoRasgoPersonal tiporasgopersonalAux:tiporasgopersonalsForeignKey) {
				if(tiporasgopersonalAux.getId()!=null && tiporasgopersonalAux.getId().equals(idTipoRasgoPersonalSeleccionado)) {
					tiporasgopersonalTemp=tiporasgopersonalAux;
					break;
				}
			}


			sDescripcion=TipoRasgoPersonalConstantesFunciones.getTipoRasgoPersonalDescripcion(tiporasgopersonalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoRasgoPersonalForeignKeyGenerico(Long idTipoRasgoPersonalSeleccionado,JComboBox jComboBoxid_tipo_rasgo_personalRasgoPersonalGenerico)throws Exception
	{
		try
		{
			TipoRasgoPersonal  tiporasgopersonalTemp=null;

			for(TipoRasgoPersonal tiporasgopersonalAux:tiporasgopersonalsForeignKey) {
				if(tiporasgopersonalAux.getId()!=null && tiporasgopersonalAux.getId().equals(idTipoRasgoPersonalSeleccionado)) {
					tiporasgopersonalTemp=tiporasgopersonalAux;
					break;
				}
			}

			if(tiporasgopersonalTemp!=null) {
				jComboBoxid_tipo_rasgo_personalRasgoPersonalGenerico.setSelectedItem(tiporasgopersonalTemp);
			} else {
				if(jComboBoxid_tipo_rasgo_personalRasgoPersonalGenerico!=null && jComboBoxid_tipo_rasgo_personalRasgoPersonalGenerico.getItemCount()>0) {
					jComboBoxid_tipo_rasgo_personalRasgoPersonalGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(RasgoPersonal rasgopersonal,JComboBox jComboBoxid_empresaRasgoPersonalGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaRasgoPersonalGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empresaRasgoPersonal.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaRasgoPersonalGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				rasgopersonal.setid_empresa(empresaAux.getId());
				rasgopersonal.setempresa_descripcion(RasgoPersonalConstantesFunciones.getEmpresaDescripcion(empresaAux));
				rasgopersonal.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(RasgoPersonal rasgopersonal,JComboBox jComboBoxid_empleadoRasgoPersonalGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoRasgoPersonalGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empleadoRasgoPersonal.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoRasgoPersonalGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				rasgopersonal.setid_empleado(empleadoAux.getId());
				rasgopersonal.setempleado_descripcion(RasgoPersonalConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				rasgopersonal.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoRasgoPersonalForeignKey(RasgoPersonal rasgopersonal,JComboBox jComboBoxid_tipo_rasgo_personalRasgoPersonalGenerico)throws Exception
	{
		try
		{
			TipoRasgoPersonal  tiporasgopersonalAux=new TipoRasgoPersonal();

			if(jComboBoxid_tipo_rasgo_personalRasgoPersonalGenerico==null) {
				tiporasgopersonalAux=(TipoRasgoPersonal)this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_tipo_rasgo_personalRasgoPersonal.getSelectedItem();
			} else {
				tiporasgopersonalAux=(TipoRasgoPersonal)jComboBoxid_tipo_rasgo_personalRasgoPersonalGenerico.getSelectedItem();
			}

			if(tiporasgopersonalAux!=null && tiporasgopersonalAux.getId()!=null) {
				rasgopersonal.setid_tipo_rasgo_personal(tiporasgopersonalAux.getId());
				rasgopersonal.settiporasgopersonal_descripcion(RasgoPersonalConstantesFunciones.getTipoRasgoPersonalDescripcion(tiporasgopersonalAux));
				rasgopersonal.setTipoRasgoPersonal(tiporasgopersonalAux);			}
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

					if(!RasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { 
							this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empresaRasgoPersonal.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empresaRasgoPersonal.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { 
					}

					if(!RasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
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

					if(!RasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { 
							this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empleadoRasgoPersonal.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empleadoRasgoPersonal.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { 
					}

					if(!RasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoRasgoPersonal.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoRasgoPersonal.addItem(empleado);
							}
						}

						if(!RasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoRasgoPersonalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoRasgoPersonal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { 
							this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_tipo_rasgo_personalRasgoPersonal.removeAllItems();

							for(TipoRasgoPersonal tiporasgopersonal:this.tiporasgopersonalsForeignKey) {
								this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_tipo_rasgo_personalRasgoPersonal.addItem(tiporasgopersonal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { 
					}

					if(!RasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoRasgoPersonal") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal.removeAllItems();

							for(TipoRasgoPersonal tiporasgopersonal:this.tiporasgopersonalsForeignKey) {
								this.jComboBoxid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal.addItem(tiporasgopersonal);
							}
						}

						if(!RasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
							this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empresaRasgoPersonal.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
							this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empresaRasgoPersonal.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
							this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empleadoRasgoPersonal.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
							this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empleadoRasgoPersonal.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoRasgoPersonal.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoRasgoPersonal.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoRasgoPersonalForeignKey(TipoRasgoPersonal tiporasgopersonal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
							this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_tipo_rasgo_personalRasgoPersonal.setSelectedItem(tiporasgopersonal);
						}
					} else {
						if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
							this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_tipo_rasgo_personalRasgoPersonal.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal.setSelectedItem(tiporasgopersonal);
						} else {
							this.jComboBoxid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesRasgoPersonal() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			RasgoPersonalConstantesFunciones.refrescarForeignKeysDescripcionesRasgoPersonal(this.rasgopersonalLogic.getRasgoPersonals());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			RasgoPersonalConstantesFunciones.refrescarForeignKeysDescripcionesRasgoPersonal(this.rasgopersonals);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(TipoRasgoPersonal.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//rasgopersonalLogic.setRasgoPersonals(this.rasgopersonals);
			rasgopersonalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public RasgoPersonalParameterReturnGeneral getRasgoPersonalParameterGeneral() {
		return this.rasgopersonalParameterGeneral;
	}
	
	public void setRasgoPersonalParameterGeneral(RasgoPersonalParameterReturnGeneral rasgopersonalParameterGeneral) {
		this.rasgopersonalParameterGeneral = rasgopersonalParameterGeneral;
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
	
	public Boolean getIsPermisoTodoRasgoPersonal() {
		return isPermisoTodoRasgoPersonal;
	}

	public void setIsPermisoTodoRasgoPersonal(Boolean isPermisoTodoRasgoPersonal) {
		this.isPermisoTodoRasgoPersonal = isPermisoTodoRasgoPersonal;
	}

	public Boolean getIsPermisoNuevoRasgoPersonal() {
		return isPermisoNuevoRasgoPersonal;
	}

	public void setIsPermisoNuevoRasgoPersonal(Boolean isPermisoNuevoRasgoPersonal) {
		this.isPermisoNuevoRasgoPersonal = isPermisoNuevoRasgoPersonal;
	}

	public Boolean getIsPermisoActualizarRasgoPersonal() {
		return isPermisoActualizarRasgoPersonal;
	}

	public void setIsPermisoActualizarRasgoPersonal(Boolean isPermisoActualizarRasgoPersonal) {
		this.isPermisoActualizarRasgoPersonal = isPermisoActualizarRasgoPersonal;
	}

	public Boolean getIsPermisoEliminarRasgoPersonal() {
		return isPermisoEliminarRasgoPersonal;
	}

	public void setIsPermisoEliminarRasgoPersonal(Boolean isPermisoEliminarRasgoPersonal) {
		this.isPermisoEliminarRasgoPersonal = isPermisoEliminarRasgoPersonal;
	}

	public Boolean getIsPermisoGuardarCambiosRasgoPersonal() {
		return isPermisoGuardarCambiosRasgoPersonal;
	}

	public void setIsPermisoGuardarCambiosRasgoPersonal(Boolean isPermisoGuardarCambiosRasgoPersonal) {
		this.isPermisoGuardarCambiosRasgoPersonal = isPermisoGuardarCambiosRasgoPersonal;
	}
	
	public Boolean getIsPermisoConsultaRasgoPersonal() {
		return isPermisoConsultaRasgoPersonal;
	}

	public void setIsPermisoConsultaRasgoPersonal(Boolean isPermisoConsultaRasgoPersonal) {
		this.isPermisoConsultaRasgoPersonal = isPermisoConsultaRasgoPersonal;
	}

	public Boolean getIsPermisoBusquedaRasgoPersonal() {
		return isPermisoBusquedaRasgoPersonal;
	}

	public void setIsPermisoBusquedaRasgoPersonal(Boolean isPermisoBusquedaRasgoPersonal) {
		this.isPermisoBusquedaRasgoPersonal = isPermisoBusquedaRasgoPersonal;
	}

	public Boolean getIsPermisoReporteRasgoPersonal() {
		return isPermisoReporteRasgoPersonal;
	}

	public void setIsPermisoReporteRasgoPersonal(Boolean isPermisoReporteRasgoPersonal) {
		this.isPermisoReporteRasgoPersonal = isPermisoReporteRasgoPersonal;
	}
	
	public Boolean getIsPermisoPaginacionMedioRasgoPersonal() {
		return isPermisoPaginacionMedioRasgoPersonal;
	}

	public void setIsPermisoPaginacionMedioRasgoPersonal(Boolean isPermisoPaginacionMedioRasgoPersonal) {
		this.isPermisoPaginacionMedioRasgoPersonal = isPermisoPaginacionMedioRasgoPersonal;
	}
	
	public Boolean getIsPermisoPaginacionTodoRasgoPersonal() {
		return isPermisoPaginacionTodoRasgoPersonal;
	}

	public void setIsPermisoPaginacionTodoRasgoPersonal(Boolean isPermisoPaginacionTodoRasgoPersonal) {
		this.isPermisoPaginacionTodoRasgoPersonal = isPermisoPaginacionTodoRasgoPersonal;
	}
	
	public Boolean getIsPermisoPaginacionAltoRasgoPersonal() {
		return isPermisoPaginacionAltoRasgoPersonal;
	}

	public void setIsPermisoPaginacionAltoRasgoPersonal(Boolean isPermisoPaginacionAltoRasgoPersonal) {
		this.isPermisoPaginacionAltoRasgoPersonal = isPermisoPaginacionAltoRasgoPersonal;
	}
	
	public Boolean getIsPermisoCopiarRasgoPersonal() {
		return isPermisoCopiarRasgoPersonal;
	}

	public void setIsPermisoCopiarRasgoPersonal(Boolean isPermisoCopiarRasgoPersonal) {
		this.isPermisoCopiarRasgoPersonal = isPermisoCopiarRasgoPersonal;
	}
	
	public Boolean getIsPermisoVerFormRasgoPersonal() {
		return isPermisoVerFormRasgoPersonal;
	}

	public void setIsPermisoVerFormRasgoPersonal(Boolean isPermisoVerFormRasgoPersonal) {
		this.isPermisoVerFormRasgoPersonal = isPermisoVerFormRasgoPersonal;
	}
	
	public Boolean getIsPermisoDuplicarRasgoPersonal() {
		return isPermisoDuplicarRasgoPersonal;
	}

	public void setIsPermisoDuplicarRasgoPersonal(Boolean isPermisoDuplicarRasgoPersonal) {
		this.isPermisoDuplicarRasgoPersonal = isPermisoDuplicarRasgoPersonal;
	}
	
	public Boolean getIsPermisoOrdenRasgoPersonal() {
		return isPermisoOrdenRasgoPersonal;
	}

	public void setIsPermisoOrdenRasgoPersonal(Boolean isPermisoOrdenRasgoPersonal) {
		this.isPermisoOrdenRasgoPersonal = isPermisoOrdenRasgoPersonal;
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
	
	public Boolean getIsVisibilidadCeldaNuevoRasgoPersonal() {
		return isVisibilidadCeldaNuevoRasgoPersonal;
	}

	public void setIsVisibilidadCeldaNuevoRasgoPersonal(Boolean isVisibilidadCeldaNuevoRasgoPersonal) {
		this.isVisibilidadCeldaNuevoRasgoPersonal = isVisibilidadCeldaNuevoRasgoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarRasgoPersonal() {
		return isVisibilidadCeldaDuplicarRasgoPersonal;
	}

	public void setIsVisibilidadCeldaDuplicarRasgoPersonal(Boolean isVisibilidadCeldaDuplicarRasgoPersonal) {
		this.isVisibilidadCeldaDuplicarRasgoPersonal = isVisibilidadCeldaDuplicarRasgoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarRasgoPersonal() {
		return isVisibilidadCeldaCopiarRasgoPersonal;
	}

	public void setIsVisibilidadCeldaCopiarRasgoPersonal(Boolean isVisibilidadCeldaCopiarRasgoPersonal) {
		this.isVisibilidadCeldaCopiarRasgoPersonal = isVisibilidadCeldaCopiarRasgoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormRasgoPersonal() {
		return isVisibilidadCeldaVerFormRasgoPersonal;
	}

	public void setIsVisibilidadCeldaVerFormRasgoPersonal(Boolean isVisibilidadCeldaVerFormRasgoPersonal) {
		this.isVisibilidadCeldaVerFormRasgoPersonal = isVisibilidadCeldaVerFormRasgoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenRasgoPersonal() {
		return isVisibilidadCeldaOrdenRasgoPersonal;
	}

	public void setIsVisibilidadCeldaOrdenRasgoPersonal(Boolean isVisibilidadCeldaOrdenRasgoPersonal) {
		this.isVisibilidadCeldaOrdenRasgoPersonal = isVisibilidadCeldaOrdenRasgoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesRasgoPersonal() {
		return isVisibilidadCeldaNuevoRelacionesRasgoPersonal;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesRasgoPersonal(Boolean isVisibilidadCeldaNuevoRelacionesRasgoPersonal) {
		this.isVisibilidadCeldaNuevoRelacionesRasgoPersonal = isVisibilidadCeldaNuevoRelacionesRasgoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaModificarRasgoPersonal() {
		return isVisibilidadCeldaModificarRasgoPersonal;
	}

	public void setIsVisibilidadCeldaModificarRasgoPersonal(Boolean isVisibilidadCeldaModificarRasgoPersonal) {
		this.isVisibilidadCeldaModificarRasgoPersonal = isVisibilidadCeldaModificarRasgoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarRasgoPersonal() {
		return isVisibilidadCeldaActualizarRasgoPersonal;
	}

	public void setIsVisibilidadCeldaActualizarRasgoPersonal(Boolean isVisibilidadCeldaActualizarRasgoPersonal) {
		this.isVisibilidadCeldaActualizarRasgoPersonal = isVisibilidadCeldaActualizarRasgoPersonal;
	}

	public Boolean getIsVisibilidadCeldaEliminarRasgoPersonal() {
		return isVisibilidadCeldaEliminarRasgoPersonal;
	}

	public void setIsVisibilidadCeldaEliminarRasgoPersonal(Boolean isVisibilidadCeldaEliminarRasgoPersonal) {
		this.isVisibilidadCeldaEliminarRasgoPersonal = isVisibilidadCeldaEliminarRasgoPersonal;
	}

	public Boolean getIsVisibilidadCeldaCancelarRasgoPersonal() {
		return isVisibilidadCeldaCancelarRasgoPersonal;
	}

	public void setIsVisibilidadCeldaCancelarRasgoPersonal(Boolean isVisibilidadCeldaCancelarRasgoPersonal) {
		this.isVisibilidadCeldaCancelarRasgoPersonal = isVisibilidadCeldaCancelarRasgoPersonal;
	}

	public Boolean getIsVisibilidadCeldaGuardarRasgoPersonal() {
		return isVisibilidadCeldaGuardarRasgoPersonal;
	}

	public void setIsVisibilidadCeldaGuardarRasgoPersonal(Boolean isVisibilidadCeldaGuardarRasgoPersonal) {
		this.isVisibilidadCeldaGuardarRasgoPersonal = isVisibilidadCeldaGuardarRasgoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosRasgoPersonal() {
		return isVisibilidadCeldaGuardarCambiosRasgoPersonal;
	}

	public void setIsVisibilidadCeldaGuardarCambiosRasgoPersonal(Boolean isVisibilidadCeldaGuardarCambiosRasgoPersonal) {
		this.isVisibilidadCeldaGuardarCambiosRasgoPersonal = isVisibilidadCeldaGuardarCambiosRasgoPersonal;
	}
		
	public RasgoPersonalSessionBean getrasgopersonalSessionBean() {
		return this.rasgopersonalSessionBean;
	}
	
	public void setrasgopersonalSessionBean(RasgoPersonalSessionBean rasgopersonalSessionBean) {
		this.rasgopersonalSessionBean=rasgopersonalSessionBean;
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

	public Boolean getisVisibilidadFK_IdTipoRasgoPersonal() {
		return this.isVisibilidadFK_IdTipoRasgoPersonal;
	}

	public void setisVisibilidadFK_IdTipoRasgoPersonal(Boolean isVisibilidadFK_IdTipoRasgoPersonal) {
		this.isVisibilidadFK_IdTipoRasgoPersonal=isVisibilidadFK_IdTipoRasgoPersonal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysRasgoPersonal(RasgoPersonal rasgopersonal)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(rasgopersonal,null);
				this.setActualParaGuardarEmpleadoForeignKey(rasgopersonal,null);
				this.setActualParaGuardarTipoRasgoPersonalForeignKey(rasgopersonal,null);
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
	
	public void bugActualizarReferenciaActual(RasgoPersonal rasgopersonal,RasgoPersonal rasgopersonalAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalRasgoPersonal(rasgopersonal);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		rasgopersonalAux.setId(rasgopersonal.getId());
		rasgopersonalAux.setVersionRow(rasgopersonal.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessRasgoPersonal();
		
			int intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonal =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.rasgopersonal =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(RasgoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualRasgoPersonal(this.rasgopersonal,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysRasgoPersonal(this.rasgopersonal);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = rasgopersonalValidator.getInvalidValues(this.rasgopersonal);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			rasgopersonalLogic.setDatosCliente(datosCliente);
			rasgopersonalLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				rasgopersonalAux=new  RasgoPersonal();
				
				rasgopersonalAux.setIsNew(true);
				rasgopersonalAux.setIsChanged(true);
				
				rasgopersonalAux.setRasgoPersonalOriginal(this.rasgopersonal);
				
				rasgopersonalAux.setId(this.rasgopersonal.getId());	
				rasgopersonalAux.setVersionRow(this.rasgopersonal.getVersionRow());	
				rasgopersonalAux.setid_empresa(this.rasgopersonal.getid_empresa());	
				rasgopersonalAux.setid_empleado(this.rasgopersonal.getid_empleado());	
				rasgopersonalAux.setid_tipo_rasgo_personal(this.rasgopersonal.getid_tipo_rasgo_personal());	
				rasgopersonalAux.setdescripcion(this.rasgopersonal.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.rasgopersonalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.rasgopersonalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(rasgopersonalAux,rasgopersonalLogic.getRasgoPersonals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rasgopersonalAux,rasgopersonals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.rasgopersonalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rasgopersonalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rasgopersonalLogic.saveRasgoPersonals();//WithConnection
						//rasgopersonalLogic.getSetVersionRowRasgoPersonals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.rasgopersonal,rasgopersonalAux);
					
					this.refrescarForeignKeysDescripcionesRasgoPersonal();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rasgopersonalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rasgopersonalLogic.saveRasgoPersonalRelaciones(rasgopersonalAux);//WithConnection
								//rasgopersonalLogic.getSetVersionRowRasgoPersonals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.rasgopersonal,rasgopersonalAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.rasgopersonalSessionBean.getEstaModoGuardarRelaciones() 
									|| this.rasgopersonalSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(rasgopersonalAux,rasgopersonalLogic.getRasgoPersonals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(rasgopersonalAux,rasgopersonals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.rasgopersonal,rasgopersonalAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				rasgopersonalAux=new  RasgoPersonal();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado() 
					|| (this.rasgopersonalSessionBean.getEsGuardarRelacionado() && this.rasgopersonal.getId()>=0)) {
						
					rasgopersonalAux.setIsNew(false);
				}
				
				rasgopersonalAux.setIsDeleted(false);
			
				rasgopersonalAux.setId(this.rasgopersonal.getId());	
				rasgopersonalAux.setVersionRow(this.rasgopersonal.getVersionRow());	
				rasgopersonalAux.setid_empresa(this.rasgopersonal.getid_empresa());	
				rasgopersonalAux.setid_empleado(this.rasgopersonal.getid_empleado());	
				rasgopersonalAux.setid_tipo_rasgo_personal(this.rasgopersonal.getid_tipo_rasgo_personal());	
				rasgopersonalAux.setdescripcion(this.rasgopersonal.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(rasgopersonalAux,rasgopersonalLogic.getRasgoPersonals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rasgopersonalAux,rasgopersonals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.rasgopersonalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rasgopersonalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rasgopersonalLogic.saveRasgoPersonals();//WithConnection
						//rasgopersonalLogic.getSetVersionRowRasgoPersonals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.rasgopersonal,rasgopersonalAux);
					
					this.refrescarForeignKeysDescripcionesRasgoPersonal();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rasgopersonalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rasgopersonalLogic.saveRasgoPersonalRelaciones(rasgopersonalAux);//WithConnection
								//rasgopersonalLogic.getSetVersionRowRasgoPersonals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.rasgopersonal,rasgopersonalAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.rasgopersonalSessionBean.getEstaModoGuardarRelaciones() 
									|| this.rasgopersonalSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(rasgopersonalAux,rasgopersonalLogic.getRasgoPersonals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(rasgopersonalAux,rasgopersonals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.rasgopersonal,rasgopersonalAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				rasgopersonalAux=new  RasgoPersonal();
				
				rasgopersonalAux.setIsNew(false);
				rasgopersonalAux.setIsChanged(false);
				
				rasgopersonalAux.setIsDeleted(true);
				
				rasgopersonalAux.setId(this.rasgopersonal.getId());	
				rasgopersonalAux.setVersionRow(this.rasgopersonal.getVersionRow());	
				rasgopersonalAux.setid_empresa(this.rasgopersonal.getid_empresa());	
				rasgopersonalAux.setid_empleado(this.rasgopersonal.getid_empleado());	
				rasgopersonalAux.setid_tipo_rasgo_personal(this.rasgopersonal.getid_tipo_rasgo_personal());	
				rasgopersonalAux.setdescripcion(this.rasgopersonal.getdescripcion());	
				
				if(this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.rasgopersonalAux.getId()>=0) {	
						this.rasgopersonalsEliminados.add(rasgopersonalAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(rasgopersonalAux,rasgopersonalLogic.getRasgoPersonals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rasgopersonalAux,rasgopersonals);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.rasgopersonalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rasgopersonalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rasgopersonalLogic.saveRasgoPersonals();//WithConnection
						//rasgopersonalLogic.getSetVersionRowRasgoPersonals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rasgopersonalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rasgopersonalLogic.saveRasgoPersonalRelaciones(rasgopersonalAux);//WithConnection
								//rasgopersonalLogic.getSetVersionRowRasgoPersonals();//WithConnection
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
							if(this.rasgopersonalSessionBean.getEstaModoGuardarRelaciones() 
								|| this.rasgopersonalSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(rasgopersonalAux,rasgopersonalLogic.getRasgoPersonals());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(rasgopersonalAux,rasgopersonals);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalLogic.getRasgoPersonals().addAll(this.rasgopersonalsEliminados);
					
					rasgopersonalLogic.saveRasgoPersonals();//WithConnection
					//rasgopersonalLogic.getSetVersionRowRasgoPersonals();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesRasgoPersonal();
				
				this.rasgopersonalsEliminados= new ArrayList<RasgoPersonal>();		
			}
			
			if(this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Rasgo Personal GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Rasgo Personal",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.rasgopersonal=rasgopersonalAux;
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
      		//this.finishProcessRasgoPersonal();
      	}
		
	}	
	
	public void actualizarRelaciones(RasgoPersonal rasgopersonalLocal) throws Exception {
		
		if(this.rasgopersonalSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(RasgoPersonal rasgopersonalLocal) throws Exception {	
		if(this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				rasgopersonalLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				rasgopersonalLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoRasgoPersonalDetalleFormJInternalFrame.class)) {
				TipoRasgoPersonalBeanSwingJInternalFrame tiporasgopersonalBeanSwingJInternalFrameLocal=(TipoRasgoPersonalBeanSwingJInternalFrame) ((TipoRasgoPersonalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tiporasgopersonalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoRasgoPersonal(tiporasgopersonalBeanSwingJInternalFrameLocal.gettiporasgopersonal(),true);
				tiporasgopersonalBeanSwingJInternalFrameLocal.actualizarLista(tiporasgopersonalBeanSwingJInternalFrameLocal.tiporasgopersonal,this.tiporasgopersonalsForeignKey);

				tiporasgopersonalBeanSwingJInternalFrameLocal.actualizarRelaciones(tiporasgopersonalBeanSwingJInternalFrameLocal.tiporasgopersonal);

				rasgopersonalLocal.setTipoRasgoPersonal(tiporasgopersonalBeanSwingJInternalFrameLocal.tiporasgopersonal);

				this.addItemDefectoCombosForeignKeyTipoRasgoPersonal();
				this.cargarCombosFrameTipoRasgoPersonalsForeignKey("Formulario");
				this.setActualTipoRasgoPersonalForeignKey(tiporasgopersonalBeanSwingJInternalFrameLocal.tiporasgopersonal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarRasgoPersonalActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.rasgopersonal =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.rasgopersonal =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = rasgopersonalValidator.getInvalidValues(this.rasgopersonal);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(RasgoPersonal rasgopersonal,List<RasgoPersonal> rasgopersonals) throws Exception {
		try	{		
			RasgoPersonalConstantesFunciones.actualizarLista(rasgopersonal,rasgopersonals,this.rasgopersonalSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(RasgoPersonal rasgopersonal,List<RasgoPersonal> rasgopersonals) throws Exception {
		try	{			
			RasgoPersonalConstantesFunciones.actualizarSelectedLista(rasgopersonal,rasgopersonals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<RasgoPersonal> rasgopersonalsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				rasgopersonalsLocal=this.rasgopersonalLogic.getRasgoPersonals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				rasgopersonalsLocal=this.rasgopersonals;
			}
			//ARCHITECTURE
		
			for(RasgoPersonal rasgopersonalLocal:rasgopersonalsLocal) {
				if(this.permiteMantenimiento(rasgopersonalLocal) && rasgopersonalLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+RasgoPersonalConstantesFunciones.getRasgoPersonalLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(RasgoPersonalConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRasgoPersonal.jLabelid_empresaRasgoPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RasgoPersonalConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRasgoPersonal.jLabelid_empleadoRasgoPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RasgoPersonalConstantesFunciones.IDTIPORASGOPERSONAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRasgoPersonal.jLabelid_tipo_rasgo_personalRasgoPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RasgoPersonalConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRasgoPersonal.jLabeldescripcionRasgoPersonal,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRasgoPersonal.jLabelid_empresaRasgoPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRasgoPersonal.jLabelid_empleadoRasgoPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRasgoPersonal.jLabelid_tipo_rasgo_personalRasgoPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRasgoPersonal.jLabeldescripcionRasgoPersonal,"");
		
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
		this.iIdNuevoRasgoPersonal--;	
		
		
		this.rasgopersonalAux=new RasgoPersonal();
		
		this.rasgopersonalAux.setId(this.iIdNuevoRasgoPersonal);
		this.rasgopersonalAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.rasgopersonalLogic.getRasgoPersonals().add(this.rasgopersonalAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.rasgopersonals.add(this.rasgopersonalAux);
		}
		//ARCHITECTURE
		
		this.rasgopersonal=this.rasgopersonalAux;
		
		if(RasgoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioRasgoPersonal(this.rasgopersonal);
			this.setVariablesObjetoActualToFormularioForeignKeyRasgoPersonal(this.rasgopersonal);
		}
				
		//this.setDefaultControlesRasgoPersonal();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyRasgoPersonal();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyRasgoPersonal();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyRasgoPersonal();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRasgoPersonal(this.rasgopersonalBean,this.rasgopersonal,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysRasgoPersonal(this.rasgopersonal);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(RasgoPersonalConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.rasgopersonalSessionBean.getConGuardarRelaciones()) {
			classes=RasgoPersonalConstantesFunciones.getClassesRelationshipsOfRasgoPersonal(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.rasgopersonalReturnGeneral=rasgopersonalLogic.procesarEventosRasgoPersonalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rasgopersonalLogic.getRasgoPersonals(),this.rasgopersonal,this.rasgopersonalParameterGeneral,this.isEsNuevoRasgoPersonal,classes);//this.rasgopersonalLogic.getRasgoPersonal()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanRasgoPersonal(this.rasgopersonalReturnGeneral,this.rasgopersonalBean,false);
		
		if(this.rasgopersonalReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyRasgoPersonal(this.rasgopersonalReturnGeneral.getRasgoPersonal());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioRasgoPersonal(this.rasgopersonalReturnGeneral.getRasgoPersonal());
		}
		
		if(this.rasgopersonalReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioRasgoPersonal(this.rasgopersonalReturnGeneral.getRasgoPersonal(),classes);//this.rasgopersonalBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualRasgoPersonal(this.rasgopersonal,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyRasgoPersonal();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyRasgoPersonal();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RasgoPersonalBeanSwingJInternalFrameAdditional.RecargarFormRasgoPersonal(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingRasgoPersonal(false);
						
			if(rasgopersonalSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(RasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRasgoPersonal();
			}
			
			this.actualizarVisualTableDatosRasgoPersonal();
			
			this.jTableDatosRasgoPersonal.setRowSelectionInterval(this.getIndiceNuevoRasgoPersonal(), this.getIndiceNuevoRasgoPersonal());
			
			this.seleccionarFilaTablaRasgoPersonalActual();
						
			this.actualizarEstadoCeldasBotonesRasgoPersonal("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesRasgoPersonal(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormRasgoPersonal.jTextAreadescripcionRasgoPersonal.setEnabled(isHabilitar && this.rasgopersonalConstantesFunciones.activardescripcionRasgoPersonal);	
		//
		this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empresaRasgoPersonal.setEnabled(isHabilitar && this.rasgopersonalConstantesFunciones.activarid_empresaRasgoPersonal);
		this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empleadoRasgoPersonal.setEnabled(isHabilitar && this.rasgopersonalConstantesFunciones.activarid_empleadoRasgoPersonal);
		this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_tipo_rasgo_personalRasgoPersonal.setEnabled(isHabilitar && this.rasgopersonalConstantesFunciones.activarid_tipo_rasgo_personalRasgoPersonal);
	};
	
	public void setDefaultControlesRasgoPersonal() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoRasgoPersonal(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.rasgopersonalSessionBean.setConGuardarRelaciones(true);			
			this.rasgopersonalSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormRasgoPersonal.jTabbedPaneRelacionesRasgoPersonal.setVisible(true);
			
					
		} else {
			//this.rasgopersonalSessionBean.setConGuardarRelaciones(false);			
			this.rasgopersonalSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormRasgoPersonal.jTabbedPaneRelacionesRasgoPersonal.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoRasgoPersonal() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RasgoPersonal rasgopersonalAux:this.rasgopersonalLogic.getRasgoPersonals()) {
				if(rasgopersonalAux.getId().equals(this.iIdNuevoRasgoPersonal)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RasgoPersonal rasgopersonalAux:this.rasgopersonals) {
				if(rasgopersonalAux.getId().equals(this.iIdNuevoRasgoPersonal)) {
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
	
	public int getIndiceActualRasgoPersonal(RasgoPersonal rasgopersonal,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RasgoPersonal rasgopersonalAux:this.rasgopersonalLogic.getRasgoPersonals()) {
				if(rasgopersonalAux.getId().equals(rasgopersonal.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RasgoPersonal rasgopersonalAux:this.rasgopersonals) {
				if(rasgopersonalAux.getId().equals(rasgopersonal.getId())) {
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
	
	public void setCamposBaseDesdeOriginalRasgoPersonal(RasgoPersonal rasgopersonalOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RasgoPersonal rasgopersonalAux:this.rasgopersonalLogic.getRasgoPersonals()) {
				if(rasgopersonalAux.getRasgoPersonalOriginal().getId().equals(rasgopersonalOriginal.getId())) {
					existe=true;
					rasgopersonalOriginal.setId(rasgopersonalAux.getId());
					rasgopersonalOriginal.setVersionRow(rasgopersonalAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RasgoPersonal rasgopersonalAux:this.rasgopersonals) {
				if(rasgopersonalAux.getRasgoPersonalOriginal().getId().equals(rasgopersonalOriginal.getId())) {
					existe=true;
					rasgopersonalOriginal.setId(rasgopersonalAux.getId());
					rasgopersonalOriginal.setVersionRow(rasgopersonalAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosRasgoPersonal(Boolean esParaCancelar) throws Exception {
		rasgopersonalsAux=new ArrayList<RasgoPersonal>();
		rasgopersonalAux=new RasgoPersonal();
		
		if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RasgoPersonal rasgopersonalAux:this.rasgopersonalLogic.getRasgoPersonals()) {
					if(rasgopersonalAux.getId()<0) {
						rasgopersonalsAux.add(rasgopersonalAux);
					}		
				}
				this.iIdNuevoRasgoPersonal=0L;
				this.rasgopersonalLogic.getRasgoPersonals().removeAll(rasgopersonalsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RasgoPersonal rasgopersonalAux:this.rasgopersonals) {
					if(rasgopersonalAux.getId()<0) {
						rasgopersonalsAux.add(rasgopersonalAux);
					}		
				}
				this.iIdNuevoRasgoPersonal=0L;
				this.rasgopersonals.removeAll(rasgopersonalsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoRasgoPersonal 
					&& this.rasgopersonalLogic.getRasgoPersonals().size()>0
					) {
					rasgopersonalAux=this.rasgopersonalLogic.getRasgoPersonals().get(this.rasgopersonalLogic.getRasgoPersonals().size() - 1);
				
					if(rasgopersonalAux.getId()<0) {
						this.rasgopersonalLogic.getRasgoPersonals().remove(rasgopersonalAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoRasgoPersonal && this.rasgopersonals.size()>0) {
					rasgopersonalAux=this.rasgopersonals.get(this.rasgopersonals.size() - 1);
				
					if(rasgopersonalAux.getId()<0) {
						this.rasgopersonals.remove(rasgopersonalAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoRasgoPersonal(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(rasgopersonal.getId()<0) {
				this.rasgopersonalLogic.getRasgoPersonals().remove(this.rasgopersonal);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(rasgopersonal.getId()<0) {
				this.rasgopersonals.remove(this.rasgopersonal);
			}
		}			
	}
	
	public void setEstadosInicialesRasgoPersonal(List<RasgoPersonal> rasgopersonalsAux) throws Exception {
		RasgoPersonalConstantesFunciones.setEstadosInicialesRasgoPersonal(rasgopersonalsAux);
	}
	
	public void setEstadosInicialesRasgoPersonal(RasgoPersonal rasgopersonalAux) throws Exception {
		RasgoPersonalConstantesFunciones.setEstadosInicialesRasgoPersonal(rasgopersonalAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarRasgoPersonalActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesRasgoPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarRasgoPersonalActual()) {
				if(!this.isEsNuevoRasgoPersonal) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesRasgoPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoRasgoPersonal=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarRasgoPersonalActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Rasgo Personal ?", "MANTENIMIENTO DE Rasgo Personal", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesRasgoPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(RasgoPersonal rasgopersonal) throws Exception {
		RasgoPersonalConstantesFunciones.seleccionarAsignar(this.rasgopersonal,rasgopersonal);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarRasgoPersonal=this.isPermisoActualizarOriginalRasgoPersonal;
			
			
			this.seleccionarAsignar(rasgopersonal);
			
			

			idEmpleadoActual=rasgopersonal.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RasgoPersonalConstantesFunciones.quitarEspaciosRasgoPersonal(this.rasgopersonal,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesRasgoPersonal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.rasgopersonalSessionBean.setsFuncionBusquedaRapida(this.rasgopersonalSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoRasgoPersonal) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosRasgoPersonal(esParaCancelar);				
				this.cancelarNuevoRasgoPersonal(esParaCancelar);								
			}
			
			this.rasgopersonal=new RasgoPersonal();
			
			this.inicializarRasgoPersonal();
			
			this.actualizarEstadoCeldasBotonesRasgoPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarRasgoPersonal() throws Exception {
		try {
			RasgoPersonalConstantesFunciones.inicializarRasgoPersonal(this.rasgopersonal);
			
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
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.rasgopersonalLogic.getRasgoPersonals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteRasgoPersonals(String sAccionBusqueda,List<RasgoPersonal> rasgopersonalsParaReportes) throws Exception {
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
					sPathReporteFinal="RasgoPersonal"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="RasgoPersonalMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("RasgoPersonalMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="RasgoPersonal"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Rasgo Personales");		
		parameters.put("busquedapor", RasgoPersonalConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceRasgoPersonal=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			RasgoPersonalConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			RasgoPersonalConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceRasgoPersonal=new JRBeanArrayDataSource(RasgoPersonalJInternalFrame.TraerRasgoPersonalBeans(rasgopersonalsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceRasgoPersonal);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+RasgoPersonalConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+RasgoPersonalConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(RasgoPersonalBean.TraerRasgoPersonalBeans(rasgopersonalsParaReportes).toArray()));
							
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
				this.generarExcelReporteRasgoPersonals(sAccionBusqueda,sTipoArchivoReporte,rasgopersonalsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalRasgoPersonals(sAccionBusqueda,sTipoArchivoReporte,rasgopersonalsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoRasgoPersonalActionPerformed(null);
					//this.generarExcelReporteRasgoPersonals(sAccionBusqueda,sTipoArchivoReporte,rasgopersonalsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalRasgoPersonals(sAccionBusqueda,sTipoArchivoReporte,rasgopersonalsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesRasgoPersonals(sAccionBusqueda,sTipoArchivoReporte,rasgopersonalsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesRasgoPersonals(sAccionBusqueda,sTipoArchivoReporte,rasgopersonalsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRasgoPersonals(String sAccionBusqueda,String sTipoArchivoReporte,List<RasgoPersonal> rasgopersonalsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rasgopersonal";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RasgoPersonals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRasgoPersonal("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(RasgoPersonal rasgopersonal : rasgopersonalsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			RasgoPersonalConstantesFunciones.generarExcelReporteDataRasgoPersonal("NORMAL",row,workbook,rasgopersonal,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rasgo Personal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderRasgoPersonal(String sTipo,Row row,Workbook workbook) {
		
		RasgoPersonalConstantesFunciones.generarExcelReporteHeaderRasgoPersonal(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalRasgoPersonals(String sAccionBusqueda,String sTipoArchivoReporte,List<RasgoPersonal> rasgopersonalsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rasgopersonal_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RasgoPersonals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(RasgoPersonal rasgopersonal : rasgopersonalsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(RasgoPersonalConstantesFunciones.getRasgoPersonalDescripcion(rasgopersonal));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RasgoPersonalConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RasgoPersonalConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rasgopersonal.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RasgoPersonalConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RasgoPersonalConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rasgopersonal.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RasgoPersonalConstantesFunciones.LABEL_IDTIPORASGOPERSONAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RasgoPersonalConstantesFunciones.LABEL_IDTIPORASGOPERSONAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rasgopersonal.gettiporasgopersonal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RasgoPersonalConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RasgoPersonalConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rasgopersonal.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rasgo Personal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesRasgoPersonals(String sAccionBusqueda,String sTipoArchivoReporte,List<RasgoPersonal> rasgopersonalsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<RasgoPersonal> rasgopersonalsRespaldo=null;
		
		classes=RasgoPersonalConstantesFunciones.getClassesRelationshipsOfRasgoPersonal(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.rasgopersonalLogic.setDatosCliente(this.datosCliente);
		this.rasgopersonalLogic.setDatosDeep(this.datosDeep);
		this.rasgopersonalLogic.setIsConDeep(true);
		
		rasgopersonalsRespaldo=this.rasgopersonalLogic.getRasgoPersonals();
		
		this.rasgopersonalLogic.setRasgoPersonals(rasgopersonalsParaReportes);	
		this.rasgopersonalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		rasgopersonalsParaReportes=this.rasgopersonalLogic.getRasgoPersonals();
		this.rasgopersonalLogic.setRasgoPersonals(rasgopersonalsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rasgopersonal_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RasgoPersonals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRasgoPersonal("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(RasgoPersonal rasgopersonal : rasgopersonalsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderRasgoPersonal("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			RasgoPersonalConstantesFunciones.generarExcelReporteDataRasgoPersonal("NORMAL",row,workbook,rasgopersonal,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(RasgoPersonalConstantesFunciones.getRasgoPersonalDescripcion(rasgopersonal));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rasgo Personal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoRasgoPersonal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRasgoPersonal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoRasgoPersonal.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRasgoPersonal.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessRasgoPersonal() throws Exception {		
		this.startProcessRasgoPersonal(true);
	}
	
	public void startProcessRasgoPersonal(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasRasgoPersonal ,this.jPanelParametrosReportesRasgoPersonal, this.jScrollPanelDatosRasgoPersonal,this.jPanelPaginacionRasgoPersonal, this.jScrollPanelDatosEdicionRasgoPersonal, this.jPanelAccionesRasgoPersonal,this.jPanelAccionesFormularioRasgoPersonal,this.jmenuBarRasgoPersonal,this.jmenuBarDetalleRasgoPersonal,this.jTtoolBarRasgoPersonal,this.jTtoolBarDetalleRasgoPersonal);		
		
		final JTabbedPane jTabbedPaneBusquedasRasgoPersonal=this.jTabbedPaneBusquedasRasgoPersonal; 
		
		final JPanel jPanelParametrosReportesRasgoPersonal=this.jPanelParametrosReportesRasgoPersonal;
		//final JScrollPane jScrollPanelDatosRasgoPersonal=this.jScrollPanelDatosRasgoPersonal;
		final JTable jTableDatosRasgoPersonal=this.jTableDatosRasgoPersonal;		
		final JPanel jPanelPaginacionRasgoPersonal=this.jPanelPaginacionRasgoPersonal;
		//final JScrollPane jScrollPanelDatosEdicionRasgoPersonal=this.jScrollPanelDatosEdicionRasgoPersonal;
		final JPanel jPanelAccionesRasgoPersonal=this.jPanelAccionesRasgoPersonal;
		
		JPanel jPanelCamposAuxiliarRasgoPersonal=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarRasgoPersonal=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
			jPanelCamposAuxiliarRasgoPersonal=this.jInternalFrameDetalleFormRasgoPersonal.jPanelCamposRasgoPersonal;
			jPanelAccionesFormularioAuxiliarRasgoPersonal=this.jInternalFrameDetalleFormRasgoPersonal.jPanelAccionesFormularioRasgoPersonal;
		}
		
		final JPanel jPanelCamposRasgoPersonal=jPanelCamposAuxiliarRasgoPersonal;
		final JPanel jPanelAccionesFormularioRasgoPersonal=jPanelAccionesFormularioAuxiliarRasgoPersonal;
		
		
		final JMenuBar jmenuBarRasgoPersonal=this.jmenuBarRasgoPersonal;
		final JToolBar jTtoolBarRasgoPersonal=this.jTtoolBarRasgoPersonal;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarRasgoPersonal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRasgoPersonal=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
			jmenuBarDetalleAuxiliarRasgoPersonal=this.jInternalFrameDetalleFormRasgoPersonal.jmenuBarDetalleRasgoPersonal;
			jTtoolBarDetalleAuxiliarRasgoPersonal=this.jInternalFrameDetalleFormRasgoPersonal.jTtoolBarDetalleRasgoPersonal;
		}
		
		final JMenuBar jmenuBarDetalleRasgoPersonal=jmenuBarDetalleAuxiliarRasgoPersonal;
		final JToolBar jTtoolBarDetalleRasgoPersonal=jTtoolBarDetalleAuxiliarRasgoPersonal;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRasgoPersonal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRasgoPersonal;
			processRunnable.jTableDatos=jTableDatosRasgoPersonal;
			processRunnable.jPanelCampos=jPanelCamposRasgoPersonal;
			processRunnable.jPanelPaginacion=jPanelPaginacionRasgoPersonal;
			processRunnable.jPanelAcciones=jPanelAccionesRasgoPersonal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRasgoPersonal;
			
			
			processRunnable.jmenuBar=jmenuBarRasgoPersonal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRasgoPersonal;
			processRunnable.jTtoolBar=jTtoolBarRasgoPersonal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRasgoPersonal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRasgoPersonal ,jPanelParametrosReportesRasgoPersonal,jTableDatosRasgoPersonal, /*jScrollPanelDatosRasgoPersonal,*/jPanelCamposRasgoPersonal,jPanelPaginacionRasgoPersonal, /*jScrollPanelDatosEdicionRasgoPersonal,*/ jPanelAccionesRasgoPersonal,jPanelAccionesFormularioRasgoPersonal,jmenuBarRasgoPersonal,jmenuBarDetalleRasgoPersonal,jTtoolBarRasgoPersonal,jTtoolBarDetalleRasgoPersonal);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRasgoPersonal ,jPanelParametrosReportesRasgoPersonal, jScrollPanelDatosRasgoPersonal,jPanelPaginacionRasgoPersonal, jScrollPanelDatosEdicionRasgoPersonal, jPanelAccionesRasgoPersonal,jPanelAccionesFormularioRasgoPersonal,jmenuBarRasgoPersonal,jmenuBarDetalleRasgoPersonal,jTtoolBarRasgoPersonal,jTtoolBarDetalleRasgoPersonal);
						
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
	
	public void finishProcessRasgoPersonal() {// throws Exception 
		this.finishProcessRasgoPersonal(true);
	}
	
	public void finishProcessRasgoPersonal(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasRasgoPersonal ,this.jPanelParametrosReportesRasgoPersonal, this.jScrollPanelDatosRasgoPersonal,this.jPanelPaginacionRasgoPersonal, this.jScrollPanelDatosEdicionRasgoPersonal, this.jPanelAccionesRasgoPersonal,this.jPanelAccionesFormularioRasgoPersonal,this.jmenuBarRasgoPersonal,this.jmenuBarDetalleRasgoPersonal,this.jTtoolBarRasgoPersonal,this.jTtoolBarDetalleRasgoPersonal);		
		
		final JTabbedPane jTabbedPaneBusquedasRasgoPersonal=this.jTabbedPaneBusquedasRasgoPersonal; 
		
		final JPanel jPanelParametrosReportesRasgoPersonal=this.jPanelParametrosReportesRasgoPersonal;
		//final JScrollPane jScrollPanelDatosRasgoPersonal=this.jScrollPanelDatosRasgoPersonal;
		final JTable jTableDatosRasgoPersonal=this.jTableDatosRasgoPersonal;		
		final JPanel jPanelPaginacionRasgoPersonal=this.jPanelPaginacionRasgoPersonal;
		//final JScrollPane jScrollPanelDatosEdicionRasgoPersonal=this.jScrollPanelDatosEdicionRasgoPersonal;
		final JPanel jPanelAccionesRasgoPersonal=this.jPanelAccionesRasgoPersonal;
		
		JPanel jPanelCamposAuxiliarRasgoPersonal=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarRasgoPersonal=new JPanel();
		
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
			jPanelCamposAuxiliarRasgoPersonal=this.jInternalFrameDetalleFormRasgoPersonal.jPanelCamposRasgoPersonal;
			jPanelAccionesFormularioAuxiliarRasgoPersonal=this.jInternalFrameDetalleFormRasgoPersonal.jPanelAccionesFormularioRasgoPersonal;
		}
		
		final JPanel jPanelCamposRasgoPersonal=jPanelCamposAuxiliarRasgoPersonal;
		final JPanel jPanelAccionesFormularioRasgoPersonal=jPanelAccionesFormularioAuxiliarRasgoPersonal;
		
		
		final JMenuBar jmenuBarRasgoPersonal=this.jmenuBarRasgoPersonal;		
		final JToolBar jTtoolBarRasgoPersonal=this.jTtoolBarRasgoPersonal;
				
		JMenuBar jmenuBarDetalleAuxiliarRasgoPersonal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRasgoPersonal=new JToolBar();
		
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
			jmenuBarDetalleAuxiliarRasgoPersonal=this.jInternalFrameDetalleFormRasgoPersonal.jmenuBarDetalleRasgoPersonal;
			jTtoolBarDetalleAuxiliarRasgoPersonal=this.jInternalFrameDetalleFormRasgoPersonal.jTtoolBarDetalleRasgoPersonal;		
		}
		
		final JMenuBar jmenuBarDetalleRasgoPersonal=jmenuBarDetalleAuxiliarRasgoPersonal;
		final JToolBar jTtoolBarDetalleRasgoPersonal=jTtoolBarDetalleAuxiliarRasgoPersonal;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRasgoPersonal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRasgoPersonal;
			processRunnable.jTableDatos=jTableDatosRasgoPersonal;
			processRunnable.jPanelCampos=jPanelCamposRasgoPersonal;
			processRunnable.jPanelPaginacion=jPanelPaginacionRasgoPersonal;
			processRunnable.jPanelAcciones=jPanelAccionesRasgoPersonal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRasgoPersonal;
			
			
			processRunnable.jmenuBar=jmenuBarRasgoPersonal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRasgoPersonal;
			processRunnable.jTtoolBar=jTtoolBarRasgoPersonal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRasgoPersonal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasRasgoPersonal ,jPanelParametrosReportesRasgoPersonal, jTableDatosRasgoPersonal,/*jScrollPanelDatosRasgoPersonal,*/jPanelCamposRasgoPersonal,jPanelPaginacionRasgoPersonal, /*jScrollPanelDatosEdicionRasgoPersonal,*/ jPanelAccionesRasgoPersonal,jPanelAccionesFormularioRasgoPersonal,jmenuBarRasgoPersonal,jmenuBarDetalleRasgoPersonal,jTtoolBarRasgoPersonal,jTtoolBarDetalleRasgoPersonal));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesRasgoPersonal(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarRasgoPersonal(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuRasgoPersonal(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarRasgoPersonal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarRasgoPersonal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRasgoPersonal,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuRasgoPersonal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarRasgoPersonal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRasgoPersonal,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.rasgopersonalConstantesFunciones.getsFinalQueryRasgoPersonal();
		String  finalQueryPaginacionTodos=this.rasgopersonalConstantesFunciones.getsFinalQueryRasgoPersonal();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=RasgoPersonalConstantesFunciones.getArrayColumnasGlobalesNoRasgoPersonal(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=RasgoPersonalConstantesFunciones.getArrayColumnasGlobalesRasgoPersonal(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,RasgoPersonalConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.rasgopersonalsEliminados= new ArrayList<RasgoPersonal>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessRasgoPersonal();
		
				///*RasgoPersonalSessionBean*/this.rasgopersonalSessionBean=new RasgoPersonalSessionBean();
			
			if(this.rasgopersonalSessionBean==null) {
				this.rasgopersonalSessionBean=new RasgoPersonalSessionBean();
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
					this.iNumeroPaginacion=RasgoPersonalConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=RasgoPersonalConstantesFunciones.getClassesForeignKeysOfRasgoPersonal(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/rasgopersonal."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			rasgopersonalsAux= new ArrayList<RasgoPersonal>();
			
				
			rasgopersonalLogic.setDatosCliente(this.datosCliente);
			rasgopersonalLogic.setDatosDeep(this.datosDeep);
			rasgopersonalLogic.setIsConDeep(true);
			
			
			rasgopersonalLogic.getRasgoPersonalDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					rasgopersonalLogic.getTodosRasgoPersonals(finalQueryGlobal,pagination);
					
					//rasgopersonalLogic.getTodosRasgoPersonalsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(rasgopersonalLogic.getRasgoPersonals()==null|| rasgopersonalLogic.getRasgoPersonals().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rasgopersonalsAux= new ArrayList<RasgoPersonal>();
							rasgopersonalsAux.addAll(rasgopersonalLogic.getRasgoPersonals());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rasgopersonalsAux= new ArrayList<RasgoPersonal>();
							rasgopersonalsAux.addAll(rasgopersonals);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rasgopersonalLogic.getTodosRasgoPersonals(finalQueryGlobal+"",this.pagination);												
							
							//rasgopersonalLogic.getTodosRasgoPersonalsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteRasgoPersonals("Todos",rasgopersonalLogic.getRasgoPersonals() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rasgopersonalLogic.setRasgoPersonals(new ArrayList<RasgoPersonal>());					
							rasgopersonalLogic.getRasgoPersonals().addAll(rasgopersonalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rasgopersonals=new ArrayList<RasgoPersonal>();
							rasgopersonals.addAll(rasgopersonalsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idRasgoPersonal=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idRasgoPersonal=this.idActual;
				
				} else if(this.idRasgoPersonalActual!=null && this.idRasgoPersonalActual!=0L) {
					idRasgoPersonal=idRasgoPersonalActual;
				}
				
					
				this.sDetalleReporte=RasgoPersonalConstantesFunciones.getDetalleIndicePorId(idRasgoPersonal);
				
				this.rasgopersonals=new ArrayList<RasgoPersonal>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					rasgopersonalLogic.getEntity(idRasgoPersonal);
					
					//rasgopersonalLogic.getEntityWithConnection(idRasgoPersonal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rasgopersonalLogic.setRasgoPersonals(new ArrayList<RasgoPersonal>());
					rasgopersonalLogic.getRasgoPersonals().add(rasgopersonalLogic.getRasgoPersonal());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rasgopersonals=new ArrayList<RasgoPersonal>();
					this.rasgopersonals.add(rasgopersonal);
				}
				
				if(rasgopersonalLogic.getRasgoPersonal()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=RasgoPersonalConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rasgopersonalLogic.getRasgoPersonalsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RasgoPersonalConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RasgoPersonalConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rasgopersonalLogic.getRasgoPersonals()==null||rasgopersonalLogic.getRasgoPersonals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rasgopersonals==null|| rasgopersonals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rasgopersonalsAux=new ArrayList<RasgoPersonal>();
						rasgopersonalsAux.addAll(rasgopersonalLogic.getRasgoPersonals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rasgopersonalsAux=new ArrayList<RasgoPersonal>();
							rasgopersonalsAux.addAll(rasgopersonals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rasgopersonalLogic.getRasgoPersonalsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RasgoPersonalConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RasgoPersonalConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRasgoPersonals("FK_IdEmpleado",rasgopersonalLogic.getRasgoPersonals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRasgoPersonals("FK_IdEmpleado",rasgopersonals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rasgopersonalLogic.setRasgoPersonals(new ArrayList<RasgoPersonal>());
						rasgopersonalLogic.getRasgoPersonals().addAll(rasgopersonalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rasgopersonals=new ArrayList<RasgoPersonal>();
							rasgopersonals.addAll(rasgopersonalsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=RasgoPersonalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rasgopersonalLogic.getRasgoPersonalsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RasgoPersonalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RasgoPersonalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rasgopersonalLogic.getRasgoPersonals()==null||rasgopersonalLogic.getRasgoPersonals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rasgopersonals==null|| rasgopersonals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rasgopersonalsAux=new ArrayList<RasgoPersonal>();
						rasgopersonalsAux.addAll(rasgopersonalLogic.getRasgoPersonals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rasgopersonalsAux=new ArrayList<RasgoPersonal>();
							rasgopersonalsAux.addAll(rasgopersonals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rasgopersonalLogic.getRasgoPersonalsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RasgoPersonalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RasgoPersonalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRasgoPersonals("FK_IdEmpresa",rasgopersonalLogic.getRasgoPersonals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRasgoPersonals("FK_IdEmpresa",rasgopersonals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rasgopersonalLogic.setRasgoPersonals(new ArrayList<RasgoPersonal>());
						rasgopersonalLogic.getRasgoPersonals().addAll(rasgopersonalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rasgopersonals=new ArrayList<RasgoPersonal>();
							rasgopersonals.addAll(rasgopersonalsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoRasgoPersonal")) {
				this.sDetalleReporte=RasgoPersonalConstantesFunciones.getDetalleIndiceFK_IdTipoRasgoPersonal(id_tipo_rasgo_personalFK_IdTipoRasgoPersonal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rasgopersonalLogic.getRasgoPersonalsFK_IdTipoRasgoPersonal(finalQueryGlobal,pagination,id_tipo_rasgo_personalFK_IdTipoRasgoPersonal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RasgoPersonalConstantesFunciones.getDetalleIndiceFK_IdTipoRasgoPersonal(id_tipo_rasgo_personalFK_IdTipoRasgoPersonal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RasgoPersonalConstantesFunciones.getDetalleIndiceFK_IdTipoRasgoPersonal(id_tipo_rasgo_personalFK_IdTipoRasgoPersonal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rasgopersonalLogic.getRasgoPersonals()==null||rasgopersonalLogic.getRasgoPersonals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rasgopersonals==null|| rasgopersonals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rasgopersonalsAux=new ArrayList<RasgoPersonal>();
						rasgopersonalsAux.addAll(rasgopersonalLogic.getRasgoPersonals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rasgopersonalsAux=new ArrayList<RasgoPersonal>();
							rasgopersonalsAux.addAll(rasgopersonals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rasgopersonalLogic.getRasgoPersonalsFK_IdTipoRasgoPersonal(finalQueryGlobal,pagination,id_tipo_rasgo_personalFK_IdTipoRasgoPersonal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RasgoPersonalConstantesFunciones.getDetalleIndiceFK_IdTipoRasgoPersonal(id_tipo_rasgo_personalFK_IdTipoRasgoPersonal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RasgoPersonalConstantesFunciones.getDetalleIndiceFK_IdTipoRasgoPersonal(id_tipo_rasgo_personalFK_IdTipoRasgoPersonal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRasgoPersonals("FK_IdTipoRasgoPersonal",rasgopersonalLogic.getRasgoPersonals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRasgoPersonals("FK_IdTipoRasgoPersonal",rasgopersonals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rasgopersonalLogic.setRasgoPersonals(new ArrayList<RasgoPersonal>());
						rasgopersonalLogic.getRasgoPersonals().addAll(rasgopersonalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rasgopersonals=new ArrayList<RasgoPersonal>();
							rasgopersonals.addAll(rasgopersonalsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesRasgoPersonal();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessRasgoPersonal();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=rasgopersonalLogic.getRasgoPersonals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rasgopersonals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=rasgopersonalLogic.getRasgoPersonals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rasgopersonals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(RasgoPersonal rasgopersonal) {
		Boolean permite=true;
		
		if(this.rasgopersonal.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=RasgoPersonalConstantesFunciones.getOrderByListaRasgoPersonal();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=RasgoPersonalConstantesFunciones.getOrderByListaRasgoPersonal();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RasgoPersonal rasgopersonal:rasgopersonalLogic.getRasgoPersonals()) {
				if(rasgopersonal.getsType().equals(Constantes2.S_TOTALES)) {
					rasgopersonalTotales=rasgopersonal;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RasgoPersonal rasgopersonal:this.rasgopersonals) {
				if(rasgopersonal.getsType().equals(Constantes2.S_TOTALES)) {
					rasgopersonalTotales=rasgopersonal;
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
			this.rasgopersonalAux=new RasgoPersonal();
			this.rasgopersonalAux.setsType(Constantes2.S_TOTALES);
			this.rasgopersonalAux.setIsNew(false);
			this.rasgopersonalAux.setIsChanged(false);
			this.rasgopersonalAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				RasgoPersonalConstantesFunciones.TotalizarValoresFilaRasgoPersonal(this.rasgopersonalLogic.getRasgoPersonals(),this.rasgopersonalAux);
				
				this.rasgopersonalLogic.getRasgoPersonals().add(this.rasgopersonalAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				RasgoPersonalConstantesFunciones.TotalizarValoresFilaRasgoPersonal(this.rasgopersonals,this.rasgopersonalAux);
				
				this.rasgopersonals.add(this.rasgopersonalAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		rasgopersonalTotales=new RasgoPersonal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.rasgopersonalLogic.getRasgoPersonals().remove(rasgopersonalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.rasgopersonals.remove(rasgopersonalTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		rasgopersonalTotales=new RasgoPersonal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RasgoPersonal rasgopersonal:rasgopersonalLogic.getRasgoPersonals()) {
				if(rasgopersonal.getsType().equals(Constantes2.S_TOTALES)) {
					rasgopersonalTotales=rasgopersonal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RasgoPersonalConstantesFunciones.TotalizarValoresFilaRasgoPersonal(this.rasgopersonalLogic.getRasgoPersonals(),rasgopersonalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RasgoPersonal rasgopersonal:this.rasgopersonals) {
				if(rasgopersonal.getsType().equals(Constantes2.S_TOTALES)) {
					rasgopersonalTotales=rasgopersonal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RasgoPersonalConstantesFunciones.TotalizarValoresFilaRasgoPersonal(this.rasgopersonals,rasgopersonalTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getRasgoPersonalsFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRasgoPersonalsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRasgoPersonalsFK_IdTipoRasgoPersonal()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoRasgoPersonal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getRasgoPersonalsFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rasgopersonalLogic.getRasgoPersonalsFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRasgoPersonalsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rasgopersonalLogic.getRasgoPersonalsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRasgoPersonalsFK_IdTipoRasgoPersonal(String sFinalQuery,Long id_tipo_rasgo_personal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rasgopersonalLogic.getRasgoPersonalsFK_IdTipoRasgoPersonal(sFinalQuery,this.pagination,id_tipo_rasgo_personal);
				
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
	
	public void inicializarPermisosRasgoPersonal() {
		this.isPermisoTodoRasgoPersonal=false;
		this.isPermisoNuevoRasgoPersonal=false;
		this.isPermisoActualizarRasgoPersonal=false;
		this.isPermisoActualizarOriginalRasgoPersonal=false;
		this.isPermisoEliminarRasgoPersonal=false;
		this.isPermisoGuardarCambiosRasgoPersonal=false;
		this.isPermisoConsultaRasgoPersonal=false;
		this.isPermisoBusquedaRasgoPersonal=false;
		this.isPermisoReporteRasgoPersonal=false;		
		this.isPermisoOrdenRasgoPersonal=false;		
		this.isPermisoPaginacionMedioRasgoPersonal=false;		
		this.isPermisoPaginacionAltoRasgoPersonal=false;
		this.isPermisoPaginacionTodoRasgoPersonal=false;
		this.isPermisoCopiarRasgoPersonal=false;		
		this.isPermisoVerFormRasgoPersonal=false;		
		this.isPermisoDuplicarRasgoPersonal=false;		
		this.isPermisoOrdenRasgoPersonal=false;		
	}
	
	public void setPermisosUsuarioRasgoPersonal(Boolean isPermiso) {
		this.isPermisoTodoRasgoPersonal=isPermiso;
		this.isPermisoNuevoRasgoPersonal=isPermiso;
		this.isPermisoActualizarRasgoPersonal=isPermiso;
		this.isPermisoActualizarOriginalRasgoPersonal=isPermiso;
		this.isPermisoEliminarRasgoPersonal=isPermiso;
		this.isPermisoGuardarCambiosRasgoPersonal=isPermiso;
		this.isPermisoConsultaRasgoPersonal=isPermiso;
		this.isPermisoBusquedaRasgoPersonal=isPermiso;
		this.isPermisoReporteRasgoPersonal=isPermiso;
		this.isPermisoOrdenRasgoPersonal=isPermiso;		
		this.isPermisoPaginacionMedioRasgoPersonal=isPermiso;		
		this.isPermisoPaginacionAltoRasgoPersonal=isPermiso;		
		this.isPermisoPaginacionTodoRasgoPersonal=isPermiso;		
		this.isPermisoCopiarRasgoPersonal=isPermiso;		
		this.isPermisoVerFormRasgoPersonal=isPermiso;		
		this.isPermisoDuplicarRasgoPersonal=isPermiso;
		this.isPermisoOrdenRasgoPersonal=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioRasgoPersonal(Boolean isPermiso) {
		//this.isPermisoTodoRasgoPersonal=isPermiso;
		this.isPermisoNuevoRasgoPersonal=isPermiso;
		this.isPermisoActualizarRasgoPersonal=isPermiso;
		this.isPermisoActualizarOriginalRasgoPersonal=isPermiso;
		this.isPermisoEliminarRasgoPersonal=isPermiso;
		this.isPermisoGuardarCambiosRasgoPersonal=isPermiso;
		//this.isPermisoConsultaRasgoPersonal=isPermiso;
		//this.isPermisoBusquedaRasgoPersonal=isPermiso;
		//this.isPermisoReporteRasgoPersonal=isPermiso;
		//this.isPermisoOrdenRasgoPersonal=isPermiso;		
		//this.isPermisoPaginacionMedioRasgoPersonal=isPermiso;		
		//this.isPermisoPaginacionAltoRasgoPersonal=isPermiso;		
		//this.isPermisoPaginacionTodoRasgoPersonal=isPermiso;		
		//this.isPermisoCopiarRasgoPersonal=isPermiso;		
		//this.isPermisoDuplicarRasgoPersonal=isPermiso;
		//this.isPermisoOrdenRasgoPersonal=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioRasgoPersonalClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(RasgoPersonalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebRasgoPersonal(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioRasgoPersonalClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioRasgoPersonalClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionRasgoPersonalClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioRasgoPersonalClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioRasgoPersonal() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(RasgoPersonalJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, RasgoPersonalConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoRasgoPersonal=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarRasgoPersonal=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalRasgoPersonal=this.isPermisoActualizarRasgoPersonal;
			this.isPermisoEliminarRasgoPersonal=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosRasgoPersonal=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaRasgoPersonal=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaRasgoPersonal=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoRasgoPersonal=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteRasgoPersonal=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRasgoPersonal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioRasgoPersonal=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoRasgoPersonal=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoRasgoPersonal=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarRasgoPersonal=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormRasgoPersonal=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarRasgoPersonal=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRasgoPersonal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosRasgoPersonal.setToolTipText(this.jTableDatosRasgoPersonal.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioRasgoPersonal(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioRasgoPersonal(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(RasgoPersonalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(RasgoPersonalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioRasgoPersonal() throws Exception {
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
	public void inicializarCombosForeignKeyRasgoPersonalListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.tiporasgopersonalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyRasgoPersonalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(RasgoPersonalJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyRasgoPersonalListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoRasgoPersonalListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoRasgoPersonalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tiporasgopersonalsForeignKey==null||this.tiporasgopersonalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoRasgoPersonalConstantesFunciones.getArrayColumnasGlobalesTipoRasgoPersonal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRasgoPersonalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoRasgoPersonalConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoRasgoPersonalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyRasgoPersonalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			RasgoPersonalParameterReturnGeneral rasgopersonalReturnGeneral=new RasgoPersonalParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.rasgopersonalConstantesFunciones.cargarid_empresaRasgoPersonal)
					 || (this.esRecargarFks && this.rasgopersonalConstantesFunciones.cargarid_empresaRasgoPersonal)) {

					if(!this.rasgopersonalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+rasgopersonalSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.rasgopersonalConstantesFunciones.cargarid_empleadoRasgoPersonal)
					 || (this.esRecargarFks && this.rasgopersonalConstantesFunciones.cargarid_empleadoRasgoPersonal)) {

					if(!this.rasgopersonalSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+rasgopersonalSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalTipoRasgoPersonal="";

				if(((this.tiporasgopersonalsForeignKey==null||this.tiporasgopersonalsForeignKey.size()<=0) && this.rasgopersonalConstantesFunciones.cargarid_tipo_rasgo_personalRasgoPersonal)
					 || (this.esRecargarFks && this.rasgopersonalConstantesFunciones.cargarid_tipo_rasgo_personalRasgoPersonal)) {

					if(!this.rasgopersonalSessionBean.getisBusquedaDesdeForeignKeySesionTipoRasgoPersonal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoRasgoPersonalConstantesFunciones.getArrayColumnasGlobalesTipoRasgoPersonal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoRasgoPersonal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRasgoPersonalConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoRasgoPersonal=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoRasgoPersonal, "");
						finalQueryGlobalTipoRasgoPersonal+=TipoRasgoPersonalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoRasgoPersonalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoRasgoPersonal=" WHERE " + ConstantesSql.ID + "="+rasgopersonalSessionBean.getlidTipoRasgoPersonalActual();
					}
				} else {
					finalQueryGlobalTipoRasgoPersonal="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				rasgopersonalReturnGeneral=rasgopersonalLogic.cargarCombosLoteForeignKeyRasgoPersonal(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalTipoRasgoPersonal);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=rasgopersonalReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=rasgopersonalReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalTipoRasgoPersonal.equals("NONE")) {
				this.tiporasgopersonalsForeignKey=rasgopersonalReturnGeneral.gettiporasgopersonalsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyRasgoPersonal()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyTipoRasgoPersonal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.rasgopersonalSessionBean==null) {
				this.rasgopersonalSessionBean=new RasgoPersonalSessionBean();
			}

			if(!this.rasgopersonalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.rasgopersonalSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyTipoRasgoPersonal()throws Exception {
		try {

			if(!this.rasgopersonalSessionBean.getisBusquedaDesdeForeignKeySesionTipoRasgoPersonal()) {
				TipoRasgoPersonal tiporasgopersonal=new TipoRasgoPersonal();
				TipoRasgoPersonalConstantesFunciones.setTipoRasgoPersonalDescripcion(tiporasgopersonal,Constantes.SMENSAJE_ESCOJA_OPCION);
				tiporasgopersonal.setId(null);

				if(!TipoRasgoPersonalConstantesFunciones.ExisteEnLista(this.tiporasgopersonalsForeignKey,tiporasgopersonal,true)) {

					this.tiporasgopersonalsForeignKey.add(0,tiporasgopersonal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyRasgoPersonal()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyRasgoPersonal(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyRasgoPersonal()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyRasgoPersonal();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyRasgoPersonal(RasgoPersonal rasgopersonal)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(rasgopersonal.getid_empleado(),false,"Formulario");
			this.setActualTipoRasgoPersonalForeignKey(rasgopersonal.getid_tipo_rasgo_personal(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyRasgoPersonal(RasgoPersonal rasgopersonal,String sTipoEvento)throws Exception {	
		try {
			
			

				if(rasgopersonal.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoRasgoPersonal")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(rasgopersonal.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyRasgoPersonal()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.rasgopersonalConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualTipoRasgoPersonalForeignKey(this.rasgopersonalConstantesFunciones.getid_tipo_rasgo_personal(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyRasgoPersonal()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyRasgoPersonal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyRasgoPersonal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroRasgoPersonal()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyRasgoPersonal()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameTipoRasgoPersonalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyRasgoPersonal(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoRasgoPersonalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyRasgoPersonal()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empresaRasgoPersonal!=null && this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empresaRasgoPersonal.getItemCount()>0) {
				this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empresaRasgoPersonal.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empleadoRasgoPersonal!=null && this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empleadoRasgoPersonal.getItemCount()>0) {
				this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empleadoRasgoPersonal.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_tipo_rasgo_personalRasgoPersonal!=null && this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_tipo_rasgo_personalRasgoPersonal.getItemCount()>0) {
				this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_tipo_rasgo_personalRasgoPersonal.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public RasgoPersonalBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public RasgoPersonalBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public RasgoPersonalBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.rasgopersonalSessionBean=new RasgoPersonalSessionBean(); 
		this.rasgopersonalConstantesFunciones=new RasgoPersonalConstantesFunciones(); 
		this.rasgopersonalBean=new RasgoPersonal();//(this.rasgopersonalConstantesFunciones); 		
		this.rasgopersonalReturnGeneral=new RasgoPersonalParameterReturnGeneral(); 
		
		this.rasgopersonalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rasgopersonalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public RasgoPersonalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public RasgoPersonalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public RasgoPersonalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessRasgoPersonal(true);
			
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
			
			this.rasgopersonalConstantesFunciones=new RasgoPersonalConstantesFunciones(); 
			this.rasgopersonalBean=new RasgoPersonal();//this.rasgopersonalConstantesFunciones); 			
			this.rasgopersonalReturnGeneral=new RasgoPersonalParameterReturnGeneral(); 
		
			RasgoPersonalBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Rasgo Personal Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.rasgopersonal=new RasgoPersonal();
			this.rasgopersonals = new ArrayList<RasgoPersonal>();
			this.rasgopersonalsAux = new ArrayList<RasgoPersonal>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic=new RasgoPersonalLogic();
				this.rasgopersonalLogic.getNewConnexionToDeep("");
			}
			
			//this.rasgopersonalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.rasgopersonalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormRasgoPersonal);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoRasgoPersonal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRasgoPersonal);	
					}
					
					if(this.jInternalFrameImportacionRasgoPersonal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRasgoPersonal);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByRasgoPersonal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByRasgoPersonal);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormRasgoPersonal);
				this.jInternalFrameDetalleFormRasgoPersonal.setVisible(false);
				this.jInternalFrameDetalleFormRasgoPersonal.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoRasgoPersonal!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRasgoPersonal);
					this.jInternalFrameReporteDinamicoRasgoPersonal.setVisible(false);
					this.jInternalFrameReporteDinamicoRasgoPersonal.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionRasgoPersonal!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionRasgoPersonal);
					this.jInternalFrameImportacionRasgoPersonal.setVisible(false);
					this.jInternalFrameImportacionRasgoPersonal.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByRasgoPersonal!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByRasgoPersonal);
					this.jInternalFrameOrderByRasgoPersonal.setVisible(false);
					this.jInternalFrameOrderByRasgoPersonal.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idRasgoPersonalActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=RasgoPersonalConstantesFunciones.INUMEROPAGINACION;
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
			
			this.rasgopersonalReturnGeneral=new RasgoPersonalParameterReturnGeneral();
			
			this.rasgopersonalParameterGeneral=new RasgoPersonalParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.rasgopersonalLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
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
			
			if(RasgoPersonalJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RasgoPersonalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.rasgopersonalSessionBean.getEsGuardarRelacionado(),this.rasgopersonalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RasgoPersonalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.rasgopersonalSessionBean.getEsGuardarRelacionado(),this.rasgopersonalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoRasgoPersonal=false;
			this.isVisibilidadCeldaDuplicarRasgoPersonal=true;
			this.isVisibilidadCeldaCopiarRasgoPersonal=true;
			this.isVisibilidadCeldaVerFormRasgoPersonal=true;
			this.isVisibilidadCeldaOrdenRasgoPersonal=true;
			this.isVisibilidadCeldaNuevoRelacionesRasgoPersonal=false;
			this.isVisibilidadCeldaModificarRasgoPersonal=false;
			this.isVisibilidadCeldaActualizarRasgoPersonal=false;
			this.isVisibilidadCeldaEliminarRasgoPersonal=false;
			this.isVisibilidadCeldaCancelarRasgoPersonal=false;
			this.isVisibilidadCeldaGuardarRasgoPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosRasgoPersonal=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoRasgoPersonal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesRasgoPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosRasgoPersonal();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioRasgoPersonal(false);
			
			this.setPermisosUsuarioRasgoPersonal();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado() 
				|| (this.rasgopersonalSessionBean.getEsGuardarRelacionado() && this.rasgopersonalSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioRasgoPersonalClasesRelacionadas();
			}
			
			if(this.rasgopersonalSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioRasgoPersonalClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!RasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosRasgoPersonal();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualRasgoPersonal();
			}
			
			if(!this.isPermisoBusquedaRasgoPersonal) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasRasgoPersonal.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioRasgoPersonal,this.isPermisoPaginacionMedioRasgoPersonal,this.isPermisoPaginacionTodoRasgoPersonal);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(RasgoPersonalConstantesFunciones.getTiposSeleccionarRasgoPersonal());
				
				this.tiposColumnasSelect=RasgoPersonalConstantesFunciones.getTiposSeleccionarRasgoPersonal(true);
				
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
			//if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioRasgoPersonal();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioRasgoPersonal(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioRasgoPersonal(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesRasgoPersonal() ;
			
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
			this.tiporasgopersonalLogic=new TipoRasgoPersonalLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				rasgopersonalImplementable= (RasgoPersonalImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RasgoPersonalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				rasgopersonalImplementableHome= (RasgoPersonalImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RasgoPersonalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.rasgopersonals= new ArrayList<RasgoPersonal>();
			this.rasgopersonalsEliminados= new ArrayList<RasgoPersonal>();
						
			this.isEsNuevoRasgoPersonal=false;
			this.esParaAccionDesdeFormularioRasgoPersonal=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.tiporasgopersonalsForeignKey=new ArrayList<TipoRasgoPersonal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyRasgoPersonal(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroRasgoPersonal();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			RasgoPersonalBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=RasgoPersonalConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesRasgoPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingRasgoPersonal(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioRasgoPersonal();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioRasgoPersonal();
			}
			
			RasgoPersonalBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasRasgoPersonal.getTabCount(); i++) {
					this.jTabbedPaneBusquedasRasgoPersonal.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasRasgoPersonal.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessRasgoPersonal(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga RasgoPersonal: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectRasgoPersonal() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesRasgoPersonal")) {
				iIndex=this.jInternalFrameDetalleFormRasgoPersonal.jTabbedPaneRelacionesRasgoPersonal.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormRasgoPersonal.jTabbedPaneRelacionesRasgoPersonal.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessRasgoPersonal();	
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
	
	public void cargarCombosForeignKeyRasgoPersonal(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyRasgoPersonal(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyRasgoPersonal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyRasgoPersonalListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyRasgoPersonal();
		
		this.cargarCombosFrameForeignKeyRasgoPersonal();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyRasgoPersonal();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyRasgoPersonal();
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

	public void cargarCombosForeignKeyTipoRasgoPersonal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoRasgoPersonalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoRasgoPersonal();
				this.cargarCombosFrameTipoRasgoPersonalsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoRasgoPersonal(this.tiporasgopersonalsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoRasgoPersonalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.rasgopersonalSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
			
			
			if(jTableDatosRasgoPersonal.getRowCount()>=1) {
				jTableDatosRasgoPersonal.removeRowSelectionInterval(0, jTableDatosRasgoPersonal.getRowCount()-1);						
			}
			
			this.isEsNuevoRasgoPersonal=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoRasgoPersonal(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesRasgoPersonal(true);			
			//this.rasgopersonal=new RasgoPersonal();
			//this.rasgopersonal.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRasgoPersonal(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRasgoPersonal() ;
			
			if(RasgoPersonalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRasgoPersonal(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.rasgopersonal);	
			this.actualizarInformacion("INFO_PADRE",false,this.rasgopersonal);				
			
			RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
			
			if(this.rasgopersonalSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar RasgoPersonal: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarRasgoPersonalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<RasgoPersonal> rasgopersonalsSeleccionados=new ArrayList<RasgoPersonal>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosRasgoPersonal.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosRasgoPersonal.getSelectedRows().length;			
			}
			
			rasgopersonalsSeleccionados=this.getRasgoPersonalsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoRasgoPersonal--;			
				//RasgoPersonal rasgopersonalAux= new RasgoPersonal();			
				//rasgopersonalAux.setId(this.iIdNuevoRasgoPersonal);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//RasgoPersonal rasgopersonalOrigen=new RasgoPersonal();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(RasgoPersonal rasgopersonalOrigen : rasgopersonalsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							rasgopersonalOrigen =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rasgopersonalOrigen =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaRasgoPersonal();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.rasgopersonal.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosRasgoPersonal(rasgopersonalOrigen,this.rasgopersonal,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysRasgoPersonal(this.rasgopersonal);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.rasgopersonalLogic.getRasgoPersonals().add(this.rasgopersonalAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.rasgopersonals.add(this.rasgopersonalAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaRasgoPersonal(false);
				
				this.jTableDatosRasgoPersonal.setRowSelectionInterval(this.getIndiceNuevoRasgoPersonal(), this.getIndiceNuevoRasgoPersonal());
				
				int iLastRow =  this.jTableDatosRasgoPersonal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRasgoPersonal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRasgoPersonal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRasgoPersonal(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<RasgoPersonal> rasgopersonalsSeleccionados=new ArrayList<RasgoPersonal>();									
		
			RasgoPersonal rasgopersonalOrigen=new RasgoPersonal();
			RasgoPersonal rasgopersonalDestino=new RasgoPersonal();
				
			rasgopersonalsSeleccionados=this.getRasgoPersonalsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosRasgoPersonal.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || rasgopersonalsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosRasgoPersonal.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rasgopersonalOrigen =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						rasgopersonalOrigen =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rasgopersonalDestino =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						rasgopersonalDestino =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				rasgopersonalOrigen =rasgopersonalsSeleccionados.get(0);
				rasgopersonalDestino =rasgopersonalsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosRasgoPersonal(rasgopersonalOrigen,rasgopersonalDestino,true,false);
				
				rasgopersonalDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(rasgopersonalDestino,rasgopersonalLogic.getRasgoPersonals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rasgopersonalDestino,rasgopersonals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaRasgoPersonal(false);
				
				//this.jTableDatosRasgoPersonal.setRowSelectionInterval(this.getIndiceNuevoRasgoPersonal(), this.getIndiceNuevoRasgoPersonal());
				
				int iLastRow =  this.jTableDatosRasgoPersonal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRasgoPersonal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRasgoPersonal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRasgoPersonal(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormRasgoPersonal.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesRasgoPersonal.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasRasgoPersonal.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesRasgoPersonal.setVisible(!isVisible);
			this.jPanelPaginacionRasgoPersonal.setVisible(!isVisible);
			this.jPanelAccionesRasgoPersonal.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameRasgoPersonal();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoRasgoPersonal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionRasgoPersonal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByRasgoPersonal();
			
			this.abrirFrameOrderByRasgoPersonal();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByRasgoPersonal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleRasgoPersonal(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormRasgoPersonal);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormRasgoPersonal.isMaximum()) {
					this.jInternalFrameDetalleFormRasgoPersonal.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormRasgoPersonal.setSize(this.jInternalFrameDetalleFormRasgoPersonal.iWidthFormulario,this.jInternalFrameDetalleFormRasgoPersonal.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormRasgoPersonal.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormRasgoPersonal.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormRasgoPersonal.isMaximum()) {
						this.jInternalFrameDetalleFormRasgoPersonal.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormRasgoPersonal.jContentPaneDetalleRasgoPersonal.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormRasgoPersonal.jTabbedPaneRelacionesRasgoPersonal.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormRasgoPersonal.jContentPaneDetalleRasgoPersonal.getWidth(),RasgoPersonalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRasgoPersonal.jTabbedPaneRelacionesRasgoPersonal.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormRasgoPersonal.jContentPaneDetalleRasgoPersonal.getWidth(),RasgoPersonalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRasgoPersonal.jTabbedPaneRelacionesRasgoPersonal.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormRasgoPersonal.jContentPaneDetalleRasgoPersonal.getWidth(),RasgoPersonalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormRasgoPersonal.setVisible(true);
	        this.jInternalFrameDetalleFormRasgoPersonal.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByRasgoPersonal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByRasgoPersonal==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByRasgoPersonal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRasgoPersonal,false,this);
				} else {
					this.jInternalFrameOrderByRasgoPersonal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRasgoPersonal,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByRasgoPersonal);
				this.jInternalFrameOrderByRasgoPersonal.setVisible(false);
				this.jInternalFrameOrderByRasgoPersonal.setSelected(false);
				
				this.jInternalFrameOrderByRasgoPersonal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRasgoPersonal"));
				
				this.inicializarActualizarBindingTablaOrderByRasgoPersonal();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionRasgoPersonal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionRasgoPersonal==null) {
				
				this.jInternalFrameImportacionRasgoPersonal=new ImportacionJInternalFrame(RasgoPersonalConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRasgoPersonal);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionRasgoPersonal);
				this.jInternalFrameImportacionRasgoPersonal.setVisible(false);
				this.jInternalFrameImportacionRasgoPersonal.setSelected(false);


				this.jInternalFrameImportacionRasgoPersonal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRasgoPersonal"));
				this.jInternalFrameImportacionRasgoPersonal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRasgoPersonal"));
				this.jInternalFrameImportacionRasgoPersonal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRasgoPersonal"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoRasgoPersonal() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoRasgoPersonal==null) {
				this.jInternalFrameReporteDinamicoRasgoPersonal=new ReporteDinamicoJInternalFrame(RasgoPersonalConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRasgoPersonal);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRasgoPersonal);
				this.jInternalFrameReporteDinamicoRasgoPersonal.setVisible(false);
				this.jInternalFrameReporteDinamicoRasgoPersonal.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoRasgoPersonal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRasgoPersonal"));
				this.jInternalFrameReporteDinamicoRasgoPersonal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRasgoPersonal"));
				this.jInternalFrameReporteDinamicoRasgoPersonal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRasgoPersonal"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRasgoPersonal();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleRasgoPersonal() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormRasgoPersonal);
			
	       	this.jInternalFrameDetalleFormRasgoPersonal.setVisible(false);
	        this.jInternalFrameDetalleFormRasgoPersonal.setSelected(false);
			
			//this.jInternalFrameDetalleFormRasgoPersonal.dispose();
			//this.jInternalFrameDetalleFormRasgoPersonal=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoRasgoPersonal() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoRasgoPersonal.setVisible(true);
	        this.jInternalFrameReporteDinamicoRasgoPersonal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionRasgoPersonal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionRasgoPersonal.setVisible(true);
	        this.jInternalFrameImportacionRasgoPersonal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByRasgoPersonal() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByRasgoPersonal.setVisible(true);
	        this.jInternalFrameOrderByRasgoPersonal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByRasgoPersonal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByRasgoPersonal.setVisible(false);
	        this.jInternalFrameOrderByRasgoPersonal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoRasgoPersonal() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoRasgoPersonal.setVisible(false);
	        this.jInternalFrameReporteDinamicoRasgoPersonal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionRasgoPersonal() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionRasgoPersonal.setVisible(false);
	        this.jInternalFrameImportacionRasgoPersonal.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarRasgoPersonal(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarRasgoPersonal(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesRasgoPersonal(true);
			//this.isEsNuevoRasgoPersonal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonal =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rasgopersonal =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesRasgoPersonal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRasgoPersonal(false) ;
			
			if(rasgopersonalSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(RasgoPersonalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRasgoPersonal(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRasgoPersonal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaRasgoPersonalActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonal =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rasgopersonal =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarRasgoPersonal(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesRasgoPersonal(true);
			//this.isEsNuevoRasgoPersonal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonal =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rasgopersonal =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.rasgopersonal.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesRasgoPersonal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesRasgoPersonal(false) ;
			
			if(RasgoPersonalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRasgoPersonal(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRasgoPersonal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.rasgopersonalConstantesFunciones.cargarid_empleadoRasgoPersonal) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingRasgoPersonal(false,false);
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
		TableColumn tableColumnEmpleado=this.jTableDatosRasgoPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRasgoPersonal,RasgoPersonalConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRasgoPersonal.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoRasgoPersonal(List<TipoRasgoPersonal> tiporasgopersonalsForeignKey)throws Exception{
		TableColumn tableColumnTipoRasgoPersonal=this.jTableDatosRasgoPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRasgoPersonal,RasgoPersonalConstantesFunciones.LABEL_IDTIPORASGOPERSONAL));
		TableCellEditor tableCellEditorTipoRasgoPersonal =tableColumnTipoRasgoPersonal.getCellEditor();

		TipoRasgoPersonalTableCell tiporasgopersonalTableCellFk=(TipoRasgoPersonalTableCell)tableCellEditorTipoRasgoPersonal;

		if(tiporasgopersonalTableCellFk!=null) {
			tiporasgopersonalTableCellFk.settiporasgopersonalsForeignKey(tiporasgopersonalsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRasgoPersonal.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tiporasgopersonalTableCellFk.setRowActual(intSelectedRow);
			//tiporasgopersonalTableCellFk.settiporasgopersonalsForeignKeyActual(tiporasgopersonalsForeignKey);
		//}


		if(tiporasgopersonalTableCellFk!=null) {
			tiporasgopersonalTableCellFk.RecargarTipoRasgoPersonalsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesRasgoPersonal(false);
			
			//if(!this.isEsNuevoRasgoPersonal) {								
				int intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonal =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rasgopersonal =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(RasgoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualRasgoPersonal(this.rasgopersonal,true);
				this.setVariablesFormularioToObjetoActualForeignKeysRasgoPersonal(this.rasgopersonal);
				
			}
			
			if(this.permiteMantenimiento(this.rasgopersonal)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoRasgoPersonal=true;
					this.inicializarActualizarBindingTablaRasgoPersonal(false);
					this.isEsNuevoRasgoPersonal=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoRasgoPersonal=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoRasgoPersonal=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRasgoPersonal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRasgoPersonal(false);
				
				this.habilitarDeshabilitarControlesRasgoPersonal(false);
			
												
				
				if(RasgoPersonalJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleRasgoPersonal();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoRasgoPersonalActionPerformed(evt,rasgopersonalSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualRasgoPersonal(this.rasgopersonal,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosRasgoPersonal.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,rasgopersonalSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.rasgopersonal.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(RasgoPersonal.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RasgoPersonal.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonal =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				this.rasgopersonal.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rasgopersonal =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				this.rasgopersonal.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.rasgopersonal)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((RasgoPersonalModel) this.jTableDatosRasgoPersonal.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoRasgoPersonal=true;
				this.inicializarActualizarBindingTablaRasgoPersonal(false);
				this.isEsNuevoRasgoPersonal=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRasgoPersonal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRasgoPersonal(false);
				
				this.habilitarDeshabilitarControlesRasgoPersonal(false);
				
				
				
				if(RasgoPersonalJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleRasgoPersonal();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosRasgoPersonal.getRowCount()>=1) {
				jTableDatosRasgoPersonal.removeRowSelectionInterval(0, jTableDatosRasgoPersonal.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesRasgoPersonal(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaRasgoPersonal(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRasgoPersonal(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRasgoPersonal(false) ;
			
			this.isEsNuevoRasgoPersonal=false;
			
			if(RasgoPersonalJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleRasgoPersonal();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingRasgoPersonal(false);
				
				//SI ES MANUAL
				if(RasgoPersonalJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualRasgoPersonal();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoRasgoPersonal--;			
			//RasgoPersonal rasgopersonalAux= new RasgoPersonal();			
			//rasgopersonalAux.setId(this.iIdNuevoRasgoPersonal);
			
			if(this.jInternalFrameDetalleFormRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaRasgoPersonal();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysRasgoPersonal(this.rasgopersonal);
			
			this.rasgopersonal.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.rasgopersonalLogic.getRasgoPersonals().add(this.rasgopersonalAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.rasgopersonals.add(this.rasgopersonalAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaRasgoPersonal(false);
			
			this.jTableDatosRasgoPersonal.setRowSelectionInterval(this.getIndiceNuevoRasgoPersonal(), this.getIndiceNuevoRasgoPersonal());
			
			int iLastRow =  this.jTableDatosRasgoPersonal.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosRasgoPersonal.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosRasgoPersonal.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaRasgoPersonal(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingRasgoPersonal(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRasgoPersonal(false);
			
			//SI ES MANUAL
			if(RasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRasgoPersonal();
			}
			
			//this.abrirFrameTreeRasgoPersonal();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Rasgo PersonalES ?", "MANTENIMIENTO DE Rasgo Personal", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionRasgoPersonal.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralRasgoPersonal();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.rasgopersonalReturnGeneral=rasgopersonalLogic.procesarImportacionRasgoPersonalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.rasgopersonalParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarRasgoPersonalReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionRasgoPersonal.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionRasgoPersonal.setFileImportacion(this.jInternalFrameImportacionRasgoPersonal.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionRasgoPersonal.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionRasgoPersonal.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionRasgoPersonal.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionRasgoPersonal.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<RasgoPersonal> rasgopersonalsSeleccionados=new ArrayList<RasgoPersonal>();		

		rasgopersonalsSeleccionados=this.getRasgoPersonalsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRasgoPersonal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRasgoPersonal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("RasgoPersonalBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"RasgoPersonalBaseDesign.jrxml";
			
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
			
			this.generarReporteRasgoPersonals("Todos",rasgopersonalsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rasgo Personal",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoRasgoPersonal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRasgoPersonal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RasgoPersonalConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RasgoPersonalConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RasgoPersonalConstantesFunciones.LABEL_IDTIPORASGOPERSONAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoRasgoPersonal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoRasgoPersonal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoRasgoPersonal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoRasgoPersonal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RasgoPersonalConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoRasgoPersonal.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoRasgoPersonal.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoRasgoPersonal.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case RasgoPersonalConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case RasgoPersonalConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case RasgoPersonalConstantesFunciones.LABEL_IDTIPORASGOPERSONAL:
					sNombreCampoCategoria="id_tipo_rasgo_personal";
					break;

				case RasgoPersonalConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoRasgoPersonal.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case RasgoPersonalConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case RasgoPersonalConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case RasgoPersonalConstantesFunciones.LABEL_IDTIPORASGOPERSONAL:
					sNombreCampoCategoriaValor="id_tipo_rasgo_personal";
					break;

				case RasgoPersonalConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoRasgoPersonal.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRasgoPersonal.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RasgoPersonalConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case RasgoPersonalConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case RasgoPersonalConstantesFunciones.LABEL_IDTIPORASGOPERSONAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Rasgo Personal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_rasgo_personal");
					break;

				case RasgoPersonalConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<RasgoPersonal> rasgopersonalsSeleccionados=new ArrayList<RasgoPersonal>();		
		
		rasgopersonalsSeleccionados=this.getRasgoPersonalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rasgopersonal";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("RasgoPersonals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoRasgoPersonal.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoRasgoPersonal.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case RasgoPersonalConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RasgoPersonalConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(RasgoPersonal rasgopersonal:rasgopersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rasgopersonal.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RasgoPersonalConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RasgoPersonalConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(RasgoPersonal rasgopersonal:rasgopersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rasgopersonal.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RasgoPersonalConstantesFunciones.LABEL_IDTIPORASGOPERSONAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RasgoPersonalConstantesFunciones.LABEL_IDTIPORASGOPERSONAL);
					iRow++;

					for(RasgoPersonal rasgopersonal:rasgopersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rasgopersonal.gettiporasgopersonal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RasgoPersonalConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RasgoPersonalConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(RasgoPersonal rasgopersonal:rasgopersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rasgopersonal.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelRasgoPersonal(row);				
			//	iRow++;
			//}				
			
			//for(RasgoPersonal rasgopersonalAux:rasgopersonalsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelRasgoPersonal(rasgopersonalAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rasgo Personal",JOptionPane.INFORMATION_MESSAGE);
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
				this.rasgopersonalLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRasgoPersonal(false);
			
			//SI ES MANUAL
			if(RasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRasgoPersonal();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRasgoPersonal(false);
			
			//SI ES MANUAL
			if(RasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRasgoPersonal();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRasgoPersonal(false);
			
			//SI ES MANUAL
			if(RasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRasgoPersonal();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaRasgoPersonal() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosRasgoPersonal.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosRasgoPersonal.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosRasgoPersonal.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosRasgoPersonal.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosRasgoPersonal.setMinimumSize(dimensionMinimum);
		this.jTableDatosRasgoPersonal.setMaximumSize(dimensionMaximum);
		this.jTableDatosRasgoPersonal.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingRasgoPersonal(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingRasgoPersonal(esInicializar,true);
	}
	
	public void inicializarActualizarBindingRasgoPersonal(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaRasgoPersonal(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesRasgoPersonal(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasRasgoPersonal(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRasgoPersonal(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesRasgoPersonal(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !RasgoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!RasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualRasgoPersonal() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaRasgoPersonal();
		
		this.inicializarActualizarBindingBotonesManualRasgoPersonal(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualRasgoPersonal();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRasgoPersonal() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualRasgoPersonal(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualRasgoPersonal(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosRasgoPersonal.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosRasgoPersonal.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteRasgoPersonal.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormRasgoPersonal.jCheckBoxPostAccionNuevoRasgoPersonal.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormRasgoPersonal.jCheckBoxPostAccionSinCerrarRasgoPersonal.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormRasgoPersonal.jCheckBoxPostAccionSinMensajeRasgoPersonal.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosRasgoPersonal.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosRasgoPersonal.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteRasgoPersonal.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
				this.jInternalFrameDetalleFormRasgoPersonal.jCheckBoxPostAccionNuevoRasgoPersonal.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormRasgoPersonal.jCheckBoxPostAccionSinCerrarRasgoPersonal.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormRasgoPersonal.jCheckBoxPostAccionSinMensajeRasgoPersonal.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionRasgoPersonal.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionRasgoPersonal.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxTiposAccionesFormularioRasgoPersonal.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesRasgoPersonal.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoRasgoPersonal!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRasgoPersonal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesRasgoPersonal.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesRasgoPersonal.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarRasgoPersonal.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesRasgoPersonal.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoRasgoPersonal!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRasgoPersonal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesRasgoPersonal.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralRasgoPersonal.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesRasgoPersonal(Boolean esInicializar) throws Exception {
		try	{	
			if(RasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualRasgoPersonal(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesRasgoPersonal() throws Exception {
		try	{
			if(RasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualRasgoPersonal();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRasgoPersonal() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxTiposAccionesFormularioRasgoPersonal.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxTiposAccionesFormularioRasgoPersonal.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualRasgoPersonal() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesRasgoPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesRasgoPersonal.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesRasgoPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesRasgoPersonal.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesRasgoPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesRasgoPersonal.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionRasgoPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionRasgoPersonal.addItem(reporte);
			}
			
			
			if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionRasgoPersonal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionRasgoPersonal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesRasgoPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesRasgoPersonal.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesRasgoPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesRasgoPersonal.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxTiposAccionesFormularioRasgoPersonal.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxTiposAccionesFormularioRasgoPersonal.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarRasgoPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarRasgoPersonal.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarRasgoPersonal.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRasgoPersonal();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRasgoPersonal() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRasgoPersonal!=null) {
				this.jInternalFrameReporteDinamicoRasgoPersonal.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoRasgoPersonal.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRasgoPersonal!=null) {
				this.jInternalFrameReporteDinamicoRasgoPersonal.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoRasgoPersonal.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoRasgoPersonal!=null) {
				
				if(this.jInternalFrameReporteDinamicoRasgoPersonal.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRasgoPersonal.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRasgoPersonal.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoRasgoPersonal.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRasgoPersonal.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRasgoPersonal.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualRasgoPersonal()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoRasgoPersonal.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoRasgoPersonal.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal.getSelectedItem()!=null){this.id_tipo_rasgo_personalFK_IdTipoRasgoPersonal=((TipoRasgoPersonal)this.jComboBoxid_tipo_rasgo_personalFK_IdTipoRasgoPersonalRasgoPersonal.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasRasgoPersonal(Boolean esInicializar) throws Exception {				
		if(RasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualRasgoPersonal();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaRasgoPersonal() throws Exception {
		this.inicializarActualizarBindingTablaRasgoPersonal(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByRasgoPersonal() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByRasgoPersonal.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByRasgoPersonal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRasgoPersonal.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new RasgoPersonalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByRasgoPersonal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRasgoPersonal.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new RasgoPersonalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosRasgoPersonalOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRasgoPersonalOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new RasgoPersonalPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByRasgoPersonal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRasgoPersonal.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new RasgoPersonalPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByRasgoPersonal.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaRasgoPersonal(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=rasgopersonalLogic.getRasgoPersonals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=rasgopersonals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(RasgoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosRasgoPersonal.setModel(new RasgoPersonalModel(this.rasgopersonalLogic.getRasgoPersonals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosRasgoPersonal.setModel(new RasgoPersonalModel(this.rasgopersonals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByRasgoPersonal!=null && this.jInternalFrameOrderByRasgoPersonal.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByRasgoPersonal();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosRasgoPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRasgoPersonal,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new RasgoPersonalPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO,rasgopersonalConstantesFunciones.resaltarSeleccionarRasgoPersonal,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO,rasgopersonalConstantesFunciones.resaltarSeleccionarRasgoPersonal,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosRasgoPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRasgoPersonal,RasgoPersonalConstantesFunciones.LABEL_ID));

		if(this.rasgopersonalConstantesFunciones.mostraridRasgoPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RasgoPersonalConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.rasgopersonalConstantesFunciones.resaltaridRasgoPersonal,this.rasgopersonalConstantesFunciones.activaridRasgoPersonal,this,true,"idRasgoPersonal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rasgopersonalConstantesFunciones.resaltaridRasgoPersonal,this.rasgopersonalConstantesFunciones.activaridRasgoPersonal,this,true,"idRasgoPersonal","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRasgoPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRasgoPersonal,RasgoPersonalConstantesFunciones.LABEL_IDEMPRESA));

		if(this.rasgopersonalConstantesFunciones.mostrarid_empresaRasgoPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RasgoPersonalConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.rasgopersonalConstantesFunciones.resaltarid_empresaRasgoPersonal,this,this.rasgopersonalConstantesFunciones.activarid_empresaRasgoPersonal));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.rasgopersonalConstantesFunciones.resaltarid_empresaRasgoPersonal,this,this.rasgopersonalConstantesFunciones.activarid_empresaRasgoPersonal,false,"id_empresaRasgoPersonal","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RasgoPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRasgoPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRasgoPersonal,RasgoPersonalConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.rasgopersonalConstantesFunciones.mostrarid_empleadoRasgoPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RasgoPersonalConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.rasgopersonalConstantesFunciones.resaltarid_empleadoRasgoPersonal,this,this.rasgopersonalConstantesFunciones.activarid_empleadoRasgoPersonal));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.rasgopersonalConstantesFunciones.resaltarid_empleadoRasgoPersonal,this,this.rasgopersonalConstantesFunciones.activarid_empleadoRasgoPersonal,true,"id_empleadoRasgoPersonal","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new RasgoPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRasgoPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRasgoPersonal,RasgoPersonalConstantesFunciones.LABEL_IDTIPORASGOPERSONAL));

		if(this.rasgopersonalConstantesFunciones.mostrarid_tipo_rasgo_personalRasgoPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RasgoPersonalConstantesFunciones.LABEL_IDTIPORASGOPERSONAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoRasgoPersonalTableCell(this.tiporasgopersonalsForeignKey,this.rasgopersonalConstantesFunciones.resaltarid_tipo_rasgo_personalRasgoPersonal,this,this.rasgopersonalConstantesFunciones.activarid_tipo_rasgo_personalRasgoPersonal));
			tableColumn.setCellEditor(new TipoRasgoPersonalTableCell(this.tiporasgopersonalsForeignKey,this.rasgopersonalConstantesFunciones.resaltarid_tipo_rasgo_personalRasgoPersonal,this,this.rasgopersonalConstantesFunciones.activarid_tipo_rasgo_personalRasgoPersonal,true,"id_tipo_rasgo_personalRasgoPersonal","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RasgoPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRasgoPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRasgoPersonal,RasgoPersonalConstantesFunciones.LABEL_DESCRIPCION));

		if(this.rasgopersonalConstantesFunciones.mostrardescripcionRasgoPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RasgoPersonalConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.rasgopersonalConstantesFunciones.resaltardescripcionRasgoPersonal,this.rasgopersonalConstantesFunciones.activardescripcionRasgoPersonal,this,true,"descripcionRasgoPersonal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rasgopersonalConstantesFunciones.resaltardescripcionRasgoPersonal,this.rasgopersonalConstantesFunciones.activardescripcionRasgoPersonal,this,true,"descripcionRasgoPersonal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RasgoPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.rasgopersonalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.rasgopersonalSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRasgoPersonal.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.rasgopersonalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.rasgopersonalSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRasgoPersonal.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarRasgoPersonal && this.isPermisoGuardarCambiosRasgoPersonal) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.rasgopersonalSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.rasgopersonalSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosRasgoPersonal.addColumn(tableColumn);
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
			
			this.jTableDatosRasgoPersonal.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRasgoPersonal && this.isPermisoGuardarCambiosRasgoPersonal) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRasgoPersonal && this.isPermisoGuardarCambiosRasgoPersonal) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosRasgoPersonal.moveColumn(this.jTableDatosRasgoPersonal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosRasgoPersonal.moveColumn(this.jTableDatosRasgoPersonal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosRasgoPersonal.moveColumn(this.jTableDatosRasgoPersonal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosRasgoPersonal.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosRasgoPersonal.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosRasgoPersonal,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!RasgoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosRasgoPersonal.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosRasgoPersonal.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!RasgoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!RasgoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosRasgoPersonal.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosRasgoPersonal.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosRasgoPersonal.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=rasgopersonalLogic.getRasgoPersonals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=rasgopersonals.size()-1;
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
		//this.jTableDatosRasgoPersonal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosRasgoPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosRasgoPersonal();
			
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
				
				//this.isEsNuevoRasgoPersonal=false;
					
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
			
				if(this.rasgopersonalSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormRasgoPersonal==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRasgoPersonal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRasgoPersonal.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonal =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rasgopersonal =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.rasgopersonal.getsType().equals("DUPLICADO")
				   || this.rasgopersonal.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoRasgoPersonal=true;
				
				} else {
					this.isEsNuevoRasgoPersonal=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
					if(this.rasgopersonal.getId()>=0 && !this.rasgopersonal.getIsNew()) {						
						this.isEsNuevoRasgoPersonal=false;
						
					} else {
						this.isEsNuevoRasgoPersonal=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoRasgoPersonal(esRelaciones);						
				
				this.seleccionarRasgoPersonal(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.rasgopersonal.getId()<0) {
					this.isEsNuevoRasgoPersonal=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarRasgoPersonal(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarRasgoPersonal(evt,rowIndex);
				}	
				
				if(this.rasgopersonalSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion RasgoPersonal: " + this.dDif); 
					}
				}								
				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarRasgoPersonal(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.rasgopersonal)) {
					if(this.rasgopersonal.getId()>0) {
						this.rasgopersonal.setIsDeleted(true);
						
						this.rasgopersonalsEliminados.add(this.rasgopersonal);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.rasgopersonalLogic.getRasgoPersonals().remove(this.rasgopersonal);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.rasgopersonals.remove(this.rasgopersonal);				
					}
					
					
					((RasgoPersonalModel) this.jTableDatosRasgoPersonal.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaRasgoPersonal(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarRasgoPersonal(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoRasgoPersonal) {
			
			if(this.jInternalFrameDetalleFormRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRasgoPersonal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRasgoPersonal.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonal =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rasgopersonal =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(RasgoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioRasgoPersonal(this.rasgopersonal);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.rasgopersonalConstantesFunciones.cargarid_empresaRasgoPersonal || this.rasgopersonalConstantesFunciones.event_dependid_empresaRasgoPersonal) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.rasgopersonal.getid_empresa());
									//this.inicializarActualizarBindingRasgoPersonal(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(rasgopersonal.getEmpresa()!=null) {
							this.empresasForeignKey.add(rasgopersonal.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.rasgopersonal.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.rasgopersonalConstantesFunciones.cargarid_empleadoRasgoPersonal || this.rasgopersonalConstantesFunciones.event_dependid_empleadoRasgoPersonal) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.rasgopersonal.getid_empleado());
									//this.inicializarActualizarBindingRasgoPersonal(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(rasgopersonal.getEmpleado()!=null) {
							this.empleadosForeignKey.add(rasgopersonal.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.rasgopersonal.getid_empleado(),false,"Formulario");

					//TipoRasgoPersonal
					if(!this.rasgopersonalConstantesFunciones.cargarid_tipo_rasgo_personalRasgoPersonal || this.rasgopersonalConstantesFunciones.event_dependid_tipo_rasgo_personalRasgoPersonal) {
						//this.cargarCombosTipoRasgoPersonalsForeignKeyLista(" where id="+this.rasgopersonal.getid_tipo_rasgo_personal());
									//this.inicializarActualizarBindingRasgoPersonal(false,false);
						this.tiporasgopersonalsForeignKey=new ArrayList<TipoRasgoPersonal>();

						if(rasgopersonal.getTipoRasgoPersonal()!=null) {
							this.tiporasgopersonalsForeignKey.add(rasgopersonal.getTipoRasgoPersonal());
						}

						this.addItemDefectoCombosForeignKeyTipoRasgoPersonal();
						this.cargarCombosFrameTipoRasgoPersonalsForeignKey("Todos");
					}
					this.setActualTipoRasgoPersonalForeignKey(this.rasgopersonal.getid_tipo_rasgo_personal(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesRasgoPersonal("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesRasgoPersonal(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRasgoPersonal() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoRasgoPersonal(RasgoPersonal rasgopersonal) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoRasgoPersonal(rasgopersonal,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoRasgoPersonal(RasgoPersonal rasgopersonal,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioRasgoPersonal(rasgopersonal);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyRasgoPersonal(rasgopersonal,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyRasgoPersonal(rasgopersonal);
	}
	
	public void setVariablesObjetoActualToFormularioRasgoPersonal(RasgoPersonal rasgopersonal) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormRasgoPersonal.jLabelidRasgoPersonal.setText(rasgopersonal.getId().toString());
			this.jInternalFrameDetalleFormRasgoPersonal.jTextAreadescripcionRasgoPersonal.setText(rasgopersonal.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,RasgoPersonal rasgopersonalLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,rasgopersonalLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,RasgoPersonal rasgopersonalLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				rasgopersonalLocal=this.rasgopersonal;
			} else {
				rasgopersonalLocal=this.rasgopersonalAnterior;
			}
		}
		
		if(this.permiteMantenimiento(rasgopersonalLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoRasgoPersonal(rasgopersonalLocal,true);
					
					if(rasgopersonalSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(rasgopersonalLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(rasgopersonalLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoRasgoPersonal(RasgoPersonal rasgopersonal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRasgoPersonal(rasgopersonal,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysRasgoPersonal(rasgopersonal);
	}
	
	public void setVariablesFormularioToObjetoActualRasgoPersonal(RasgoPersonal rasgopersonal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRasgoPersonal(rasgopersonal,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualRasgoPersonal(RasgoPersonal rasgopersonal,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormRasgoPersonal.jLabelidRasgoPersonal.getText()==null || this.jInternalFrameDetalleFormRasgoPersonal.jLabelidRasgoPersonal.getText()=="" || this.jInternalFrameDetalleFormRasgoPersonal.jLabelidRasgoPersonal.getText()=="Id") {
				this.jInternalFrameDetalleFormRasgoPersonal.jLabelidRasgoPersonal.setText("0");
			}

			if(conColumnasBase) {rasgopersonal.setId(Long.parseLong(this.jInternalFrameDetalleFormRasgoPersonal.jLabelidRasgoPersonal.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RasgoPersonalConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRasgoPersonal.jLabelIdRasgoPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			rasgopersonal.setdescripcion(this.jInternalFrameDetalleFormRasgoPersonal.jTextAreadescripcionRasgoPersonal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RasgoPersonalConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRasgoPersonal.jLabeldescripcionRasgoPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRasgoPersonal(RasgoPersonal rasgopersonalBean,RasgoPersonal rasgopersonal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && rasgopersonalBean.getid_empleado()!=null && !rasgopersonalBean.getid_empleado().equals(-1L))) {rasgopersonal.setid_empleado(rasgopersonalBean.getid_empleado());}
			if(conDefault || (!conDefault && rasgopersonalBean.getid_tipo_rasgo_personal()!=null && !rasgopersonalBean.getid_tipo_rasgo_personal().equals(-1L))) {rasgopersonal.setid_tipo_rasgo_personal(rasgopersonalBean.getid_tipo_rasgo_personal());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosRasgoPersonal(RasgoPersonal rasgopersonalOrigen,RasgoPersonal rasgopersonal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && rasgopersonalOrigen.getId()!=null && !rasgopersonalOrigen.getId().equals(0L))) {rasgopersonal.setId(rasgopersonalOrigen.getId());}}
			if(conDefault || (!conDefault && rasgopersonalOrigen.getid_empleado()!=null && !rasgopersonalOrigen.getid_empleado().equals(-1L))) {rasgopersonal.setid_empleado(rasgopersonalOrigen.getid_empleado());}
			if(conDefault || (!conDefault && rasgopersonalOrigen.getid_tipo_rasgo_personal()!=null && !rasgopersonalOrigen.getid_tipo_rasgo_personal().equals(-1L))) {rasgopersonal.setid_tipo_rasgo_personal(rasgopersonalOrigen.getid_tipo_rasgo_personal());}
			if(conDefault || (!conDefault && rasgopersonalOrigen.getdescripcion()!=null && !rasgopersonalOrigen.getdescripcion().equals(""))) {rasgopersonal.setdescripcion(rasgopersonalOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRasgoPersonal(RasgoPersonal rasgopersonal) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRasgoPersonal.jLabelidRasgoPersonal.setText(rasgopersonal.getId().toString());
			this.jInternalFrameDetalleFormRasgoPersonal.jTextAreadescripcionRasgoPersonal.setText(rasgopersonal.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRasgoPersonal(RasgoPersonalBean rasgopersonalBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRasgoPersonal.jLabelidRasgoPersonal.setText(rasgopersonalBean.getId().toString());
			this.jInternalFrameDetalleFormRasgoPersonal.jTextAreadescripcionRasgoPersonal.setText(rasgopersonalBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanRasgoPersonal(RasgoPersonalParameterReturnGeneral rasgopersonalReturnGeneral,RasgoPersonalBean rasgopersonalBean,Boolean conDefault) throws Exception { 
		try {
			RasgoPersonal rasgopersonalLocal=new RasgoPersonal();
			
			rasgopersonalLocal=rasgopersonalReturnGeneral.getRasgoPersonal();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && rasgopersonalLocal.getId()!=null && !rasgopersonalLocal.getId().equals(0L))) {rasgopersonalBean.setId(rasgopersonalLocal.getId());}}
			if(conDefault || (!conDefault && rasgopersonalLocal.getid_empleado()!=null && !rasgopersonalLocal.getid_empleado().equals(-1L))) {rasgopersonalBean.setid_empleado(rasgopersonalLocal.getid_empleado());}
			if(conDefault || (!conDefault && rasgopersonalLocal.getid_tipo_rasgo_personal()!=null && !rasgopersonalLocal.getid_tipo_rasgo_personal().equals(-1L))) {rasgopersonalBean.setid_tipo_rasgo_personal(rasgopersonalLocal.getid_tipo_rasgo_personal());}
			if(conDefault || (!conDefault && rasgopersonalLocal.getdescripcion()!=null && !rasgopersonalLocal.getdescripcion().equals(""))) {rasgopersonalBean.setdescripcion(rasgopersonalLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxRasgoPersonalGenerico(Long idRasgoPersonalSeleccionado,JComboBox jComboBoxRasgoPersonal,List<RasgoPersonal> rasgopersonalsLocal)throws Exception {
		try {
			RasgoPersonal  rasgopersonalTemp=null;

			for(RasgoPersonal rasgopersonalAux:rasgopersonalsLocal) {
				if(rasgopersonalAux.getId()!=null && rasgopersonalAux.getId().equals(idRasgoPersonalSeleccionado)) {
					rasgopersonalTemp=rasgopersonalAux;
					break;
				}
			}

			jComboBoxRasgoPersonal.setSelectedItem(rasgopersonalTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxRasgoPersonalGenerico(JComboBox jComboBoxRasgoPersonal,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxRasgoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRasgoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxRasgoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRasgoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRasgoPersonal.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxRasgoPersonal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRasgoPersonal.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxRasgoPersonal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxRasgoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxRasgoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rasgopersonal=(RasgoPersonal) rasgopersonalLogic.getRasgoPersonals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			rasgopersonal =(RasgoPersonal) rasgopersonals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!rasgopersonal.getIsNew() && !rasgopersonal.getIsChanged() && !rasgopersonal.getIsDeleted()) {
				sDescripcion=rasgopersonal.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=rasgopersonal.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!rasgopersonal.getIsNew() && !rasgopersonal.getIsChanged() && !rasgopersonal.getIsDeleted()) {
				sDescripcion=rasgopersonal.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=rasgopersonal.getempleado_descripcion();
			}
		}

		if(sTipo.equals("TipoRasgoPersonal")) {
			//sDescripcion=this.getActualTipoRasgoPersonalForeignKeyDescripcion((Long)value);
			if(!rasgopersonal.getIsNew() && !rasgopersonal.getIsChanged() && !rasgopersonal.getIsDeleted()) {
				sDescripcion=rasgopersonal.gettiporasgopersonal_descripcion();
			} else {
				//sDescripcion=this.getActualTipoRasgoPersonalForeignKeyDescripcion((Long)value);
				sDescripcion=rasgopersonal.gettiporasgopersonal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		RasgoPersonal rasgopersonalRow=new RasgoPersonal();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rasgopersonalRow=(RasgoPersonal) rasgopersonalLogic.getRasgoPersonals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			rasgopersonalRow=(RasgoPersonal) rasgopersonals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualRasgoPersonal(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoRasgoPersonal.setVisible((this.isVisibilidadCeldaNuevoRasgoPersonal && this.isPermisoNuevoRasgoPersonal));			
			this.jButtonDuplicarRasgoPersonal.setVisible((this.isVisibilidadCeldaDuplicarRasgoPersonal && this.isPermisoDuplicarRasgoPersonal));			
			this.jButtonCopiarRasgoPersonal.setVisible((this.isVisibilidadCeldaCopiarRasgoPersonal && this.isPermisoCopiarRasgoPersonal));
			this.jButtonVerFormRasgoPersonal.setVisible((this.isVisibilidadCeldaVerFormRasgoPersonal && this.isPermisoVerFormRasgoPersonal));
			
			this.jButtonAbrirOrderByRasgoPersonal.setVisible((this.isVisibilidadCeldaOrdenRasgoPersonal && this.isPermisoOrdenRasgoPersonal));			
			
			this.jButtonNuevoRelacionesRasgoPersonal.setVisible((this.isVisibilidadCeldaNuevoRelacionesRasgoPersonal && this.isPermisoNuevoRasgoPersonal));			
			this.jButtonNuevoGuardarCambiosRasgoPersonal.setVisible((this.isVisibilidadCeldaNuevoRasgoPersonal && this.isPermisoNuevoRasgoPersonal && this.isPermisoGuardarCambiosRasgoPersonal));
			
			if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonModificarRasgoPersonal.setVisible((this.isVisibilidadCeldaModificarRasgoPersonal && this.isPermisoActualizarRasgoPersonal));	
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonActualizarRasgoPersonal.setVisible((this.isVisibilidadCeldaActualizarRasgoPersonal && this.isPermisoActualizarRasgoPersonal));	
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonEliminarRasgoPersonal.setVisible((this.isVisibilidadCeldaEliminarRasgoPersonal && this.isPermisoEliminarRasgoPersonal));
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonCancelarRasgoPersonal.setVisible(this.isVisibilidadCeldaCancelarRasgoPersonal);							
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonGuardarCambiosRasgoPersonal.setVisible((this.isVisibilidadCeldaGuardarRasgoPersonal && this.isPermisoGuardarCambiosRasgoPersonal));			
			
			}
						
			this.jButtonGuardarCambiosTablaRasgoPersonal.setVisible((this.isVisibilidadCeldaGuardarCambiosRasgoPersonal && this.isPermisoGuardarCambiosRasgoPersonal));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarRasgoPersonal.setVisible((this.isVisibilidadCeldaNuevoRasgoPersonal && this.isPermisoNuevoRasgoPersonal));						
			this.jButtonDuplicarToolBarRasgoPersonal.setVisible((this.isVisibilidadCeldaDuplicarRasgoPersonal && this.isPermisoDuplicarRasgoPersonal));						
			this.jButtonCopiarToolBarRasgoPersonal.setVisible((this.isVisibilidadCeldaCopiarRasgoPersonal && this.isPermisoCopiarRasgoPersonal));			
			this.jButtonVerFormToolBarRasgoPersonal.setVisible((this.isVisibilidadCeldaVerFormRasgoPersonal && this.isPermisoVerFormRasgoPersonal));			
			this.jButtonAbrirOrderByToolBarRasgoPersonal.setVisible((this.isVisibilidadCeldaOrdenRasgoPersonal && this.isPermisoOrdenRasgoPersonal));
			this.jButtonNuevoRelacionesToolBarRasgoPersonal.setVisible((this.isVisibilidadCeldaNuevoRelacionesRasgoPersonal && this.isPermisoNuevoRasgoPersonal));			
			this.jButtonNuevoGuardarCambiosToolBarRasgoPersonal.setVisible((this.isVisibilidadCeldaNuevoRasgoPersonal && this.isPermisoNuevoRasgoPersonal && this.isPermisoGuardarCambiosRasgoPersonal));			
			
			if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonModificarToolBarRasgoPersonal.setVisible((this.isVisibilidadCeldaModificarRasgoPersonal && this.isPermisoActualizarRasgoPersonal));	
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonActualizarToolBarRasgoPersonal.setVisible((this.isVisibilidadCeldaActualizarRasgoPersonal  && this.isPermisoActualizarRasgoPersonal));	
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonEliminarToolBarRasgoPersonal.setVisible((this.isVisibilidadCeldaEliminarRasgoPersonal && this.isPermisoEliminarRasgoPersonal));
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonCancelarToolBarRasgoPersonal.setVisible(this.isVisibilidadCeldaCancelarRasgoPersonal);				
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonGuardarCambiosToolBarRasgoPersonal.setVisible((this.isVisibilidadCeldaGuardarRasgoPersonal && this.isPermisoGuardarCambiosRasgoPersonal));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarRasgoPersonal.setVisible((this.isVisibilidadCeldaGuardarCambiosRasgoPersonal && this.isPermisoGuardarCambiosRasgoPersonal));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoRasgoPersonal.setVisible((this.isVisibilidadCeldaNuevoRasgoPersonal && this.isPermisoNuevoRasgoPersonal));			
			this.jMenuItemDuplicarRasgoPersonal.setVisible((this.isVisibilidadCeldaDuplicarRasgoPersonal && this.isPermisoDuplicarRasgoPersonal));			
			this.jMenuItemCopiarRasgoPersonal.setVisible((this.isVisibilidadCeldaCopiarRasgoPersonal && this.isPermisoCopiarRasgoPersonal));			
			this.jMenuItemVerFormRasgoPersonal.setVisible((this.isVisibilidadCeldaVerFormRasgoPersonal && this.isPermisoVerFormRasgoPersonal));			
			this.jMenuItemAbrirOrderByRasgoPersonal.setVisible((this.isVisibilidadCeldaOrdenRasgoPersonal && this.isPermisoOrdenRasgoPersonal));			
			//this.jMenuItemMostrarOcultarRasgoPersonal.setVisible((this.isVisibilidadCeldaOrdenRasgoPersonal && this.isPermisoOrdenRasgoPersonal));
			this.jMenuItemDetalleAbrirOrderByRasgoPersonal.setVisible((this.isVisibilidadCeldaOrdenRasgoPersonal && this.isPermisoOrdenRasgoPersonal));			
			//this.jMenuItemDetalleMostrarOcultarRasgoPersonal.setVisible((this.isVisibilidadCeldaOrdenRasgoPersonal && this.isPermisoOrdenRasgoPersonal));			
			this.jMenuItemNuevoRelacionesRasgoPersonal.setVisible((this.isVisibilidadCeldaNuevoRelacionesRasgoPersonal && this.isPermisoNuevoRasgoPersonal));			
			this.jMenuItemNuevoGuardarCambiosRasgoPersonal.setVisible((this.isVisibilidadCeldaNuevoRasgoPersonal && this.isPermisoNuevoRasgoPersonal && this.isPermisoGuardarCambiosRasgoPersonal));									
			
			if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
			this.jInternalFrameDetalleFormRasgoPersonal.jMenuItemModificarRasgoPersonal.setVisible((this.isVisibilidadCeldaModificarRasgoPersonal && this.isPermisoActualizarRasgoPersonal));	
			this.jInternalFrameDetalleFormRasgoPersonal.jMenuItemActualizarRasgoPersonal.setVisible((this.isVisibilidadCeldaActualizarRasgoPersonal && this.isPermisoActualizarRasgoPersonal));	
			this.jInternalFrameDetalleFormRasgoPersonal.jMenuItemEliminarRasgoPersonal.setVisible((this.isVisibilidadCeldaEliminarRasgoPersonal && this.isPermisoEliminarRasgoPersonal));
			this.jInternalFrameDetalleFormRasgoPersonal.jMenuItemCancelarRasgoPersonal.setVisible(this.isVisibilidadCeldaCancelarRasgoPersonal);				
			}
			
			this.jMenuItemGuardarCambiosRasgoPersonal.setVisible((this.isVisibilidadCeldaGuardarRasgoPersonal && this.isPermisoGuardarCambiosRasgoPersonal));						
			this.jMenuItemGuardarCambiosTablaRasgoPersonal.setVisible((this.isVisibilidadCeldaGuardarCambiosRasgoPersonal && this.isPermisoGuardarCambiosRasgoPersonal));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoRasgoPersonal=this.jButtonNuevoRasgoPersonal.isVisible();
			this.isVisibilidadCeldaDuplicarRasgoPersonal=this.jButtonDuplicarRasgoPersonal.isVisible();
			this.isVisibilidadCeldaCopiarRasgoPersonal=this.jButtonCopiarRasgoPersonal.isVisible();
			this.isVisibilidadCeldaVerFormRasgoPersonal=this.jButtonVerFormRasgoPersonal.isVisible();
			
			this.isVisibilidadCeldaOrdenRasgoPersonal=this.jButtonAbrirOrderByRasgoPersonal.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesRasgoPersonal=this.jButtonNuevoRelacionesRasgoPersonal.isVisible();
			this.isVisibilidadCeldaModificarRasgoPersonal=this.jButtonModificarRasgoPersonal.isVisible();
			
			if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
			this.isVisibilidadCeldaActualizarRasgoPersonal=this.jInternalFrameDetalleFormRasgoPersonal.jButtonActualizarRasgoPersonal.isVisible();
			this.isVisibilidadCeldaEliminarRasgoPersonal=this.jInternalFrameDetalleFormRasgoPersonal.jButtonEliminarRasgoPersonal.isVisible();
			this.isVisibilidadCeldaCancelarRasgoPersonal=this.jInternalFrameDetalleFormRasgoPersonal.jButtonCancelarRasgoPersonal.isVisible();
			this.isVisibilidadCeldaGuardarRasgoPersonal=this.jInternalFrameDetalleFormRasgoPersonal.jButtonGuardarCambiosRasgoPersonal.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosRasgoPersonal=this.jButtonGuardarCambiosTablaRasgoPersonal.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoRasgoPersonal=this.jButtonNuevoToolBarRasgoPersonal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRasgoPersonal=this.jButtonNuevoRelacionesToolBarRasgoPersonal.isVisible();
			
			if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
			this.isVisibilidadCeldaModificarRasgoPersonal=this.jInternalFrameDetalleFormRasgoPersonal.jButtonModificarToolBarRasgoPersonal.isVisible();
			this.isVisibilidadCeldaActualizarRasgoPersonal=this.jInternalFrameDetalleFormRasgoPersonal.jButtonActualizarToolBarRasgoPersonal.isVisible();
			this.isVisibilidadCeldaEliminarRasgoPersonal=this.jInternalFrameDetalleFormRasgoPersonal.jButtonEliminarToolBarRasgoPersonal.isVisible();
			this.isVisibilidadCeldaCancelarRasgoPersonal=this.jInternalFrameDetalleFormRasgoPersonal.jButtonCancelarToolBarRasgoPersonal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRasgoPersonal=this.jButtonGuardarCambiosToolBarRasgoPersonal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRasgoPersonal=this.jButtonGuardarCambiosTablaToolBarRasgoPersonal.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoRasgoPersonal=this.jMenuItemNuevoRasgoPersonal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRasgoPersonal=this.jMenuItemNuevoRelacionesRasgoPersonal.isVisible();
			
			if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
			this.isVisibilidadCeldaModificarRasgoPersonal=this.jInternalFrameDetalleFormRasgoPersonal.jMenuItemModificarRasgoPersonal.isVisible();
			this.isVisibilidadCeldaActualizarRasgoPersonal=this.jInternalFrameDetalleFormRasgoPersonal.jMenuItemActualizarRasgoPersonal.isVisible();
			this.isVisibilidadCeldaEliminarRasgoPersonal=this.jInternalFrameDetalleFormRasgoPersonal.jMenuItemEliminarRasgoPersonal.isVisible();
			this.isVisibilidadCeldaCancelarRasgoPersonal=this.jInternalFrameDetalleFormRasgoPersonal.jMenuItemCancelarRasgoPersonal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRasgoPersonal=this.jMenuItemGuardarCambiosRasgoPersonal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRasgoPersonal=this.jMenuItemGuardarCambiosTablaRasgoPersonal.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesRasgoPersonal(Boolean esInicializar) {
		if(RasgoPersonalJInternalFrame.ISBINDING_MANUAL) {			
			if(this.rasgopersonalSessionBean.getConGuardarRelaciones()) {
				//if(this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesRasgoPersonal();
			}
			
			this.inicializarActualizarBindingBotonesManualRasgoPersonal(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualRasgoPersonal() {
		this.jButtonNuevoRasgoPersonal.setVisible(this.isPermisoNuevoRasgoPersonal);			
		this.jButtonDuplicarRasgoPersonal.setVisible(this.isPermisoDuplicarRasgoPersonal);			
		this.jButtonCopiarRasgoPersonal.setVisible(this.isPermisoCopiarRasgoPersonal);			
		this.jButtonVerFormRasgoPersonal.setVisible(this.isPermisoVerFormRasgoPersonal);			
		
		this.jButtonAbrirOrderByRasgoPersonal.setVisible(this.isPermisoOrdenRasgoPersonal);					
		
		this.jButtonNuevoRelacionesRasgoPersonal.setVisible(this.isPermisoNuevoRasgoPersonal);			
		
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonModificarRasgoPersonal.setVisible(this.isPermisoActualizarRasgoPersonal);	
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonActualizarRasgoPersonal.setVisible(this.isPermisoActualizarRasgoPersonal);	
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonEliminarRasgoPersonal.setVisible(this.isPermisoEliminarRasgoPersonal);
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonCancelarRasgoPersonal.setVisible(this.isVisibilidadCeldaCancelarRasgoPersonal);						
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonGuardarCambiosRasgoPersonal.setVisible(this.isPermisoGuardarCambiosRasgoPersonal);							
		}
		
		this.jButtonGuardarCambiosTablaRasgoPersonal.setVisible(this.isPermisoActualizarRasgoPersonal);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleRasgoPersonal() {
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonModificarRasgoPersonal.setVisible(this.isPermisoActualizarRasgoPersonal);	
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonActualizarRasgoPersonal.setVisible(this.isPermisoActualizarRasgoPersonal);	
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonEliminarRasgoPersonal.setVisible(this.isPermisoEliminarRasgoPersonal);
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonCancelarRasgoPersonal.setVisible(this.isVisibilidadCeldaCancelarRasgoPersonal);							
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonGuardarCambiosRasgoPersonal.setVisible((this.isVisibilidadCeldaGuardarRasgoPersonal && this.isPermisoGuardarCambiosRasgoPersonal));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosRasgoPersonal() {
		if(RasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualRasgoPersonal();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesRasgoPersonal() {
	}
	
	public void jTableDatosRasgoPersonalListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarRasgoPersonal(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidRasgoPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRasgoPersonal(this.getrasgopersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRasgoPersonal(this.rasgopersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rasgopersonal =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rasgopersonal =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rasgopersonal==null) {
						this.rasgopersonal = new RasgoPersonal();
					}

					this.setVariablesFormularioToObjetoActualRasgoPersonal(this.rasgopersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRasgoPersonal(this.rasgopersonal);
				}

				if(this.rasgopersonal.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.rasgopersonal.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRasgoPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaRasgoPersonalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebRasgoPersonal(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRasgoPersonal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRasgoPersonal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonal =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rasgopersonal =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRasgoPersonal(this.getrasgopersonal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRasgoPersonal(this.rasgopersonal);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.rasgopersonalLogic.getConnexion());

				if(this.rasgopersonal.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.rasgopersonal.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRasgoPersonal=(TitledBorder)this.jScrollPanelDatosRasgoPersonal.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderRasgoPersonal.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaRasgoPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRasgoPersonal(this.getrasgopersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRasgoPersonal(this.rasgopersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rasgopersonal =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rasgopersonal =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rasgopersonal==null) {
						this.rasgopersonal = new RasgoPersonal();
					}

					this.setVariablesFormularioToObjetoActualRasgoPersonal(this.rasgopersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRasgoPersonal(this.rasgopersonal);
				}

				if(this.rasgopersonal.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.rasgopersonal.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRasgoPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoRasgoPersonalActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderRasgoPersonal=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosRasgoPersonal.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderRasgoPersonal=(TitledBorder)this.jScrollPanelDatosRasgoPersonal.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderRasgoPersonal.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoRasgoPersonalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebRasgoPersonal(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRasgoPersonal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRasgoPersonal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonal =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rasgopersonal =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRasgoPersonal(this.getrasgopersonal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRasgoPersonal(this.rasgopersonal);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.rasgopersonalLogic.getConnexion());

				if(this.rasgopersonal.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.rasgopersonal.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRasgoPersonal=(TitledBorder)this.jScrollPanelDatosRasgoPersonal.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderRasgoPersonal.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoRasgoPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRasgoPersonal(this.getrasgopersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRasgoPersonal(this.rasgopersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rasgopersonal =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rasgopersonal =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rasgopersonal==null) {
						this.rasgopersonal = new RasgoPersonal();
					}

					this.setVariablesFormularioToObjetoActualRasgoPersonal(this.rasgopersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRasgoPersonal(this.rasgopersonal);
				}

				if(this.rasgopersonal.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.rasgopersonal.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRasgoPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_rasgo_personalRasgoPersonalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotiporasgopersonal=true;

			idTienePermisotiporasgopersonal=this.tienePermisosUsuarioEnPaginaWebRasgoPersonal(TipoRasgoPersonalConstantesFunciones.CLASSNAME);

			if(idTienePermisotiporasgopersonal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRasgoPersonal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRasgoPersonal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonal =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rasgopersonal =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRasgoPersonal(this.getrasgopersonal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRasgoPersonal(this.rasgopersonal);

				this.tiporasgopersonalBeanSwingJInternalFrame=new TipoRasgoPersonalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tiporasgopersonalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tiporasgopersonalBeanSwingJInternalFrame.getTipoRasgoPersonalLogic().setConnexion(this.rasgopersonalLogic.getConnexion());

				if(this.rasgopersonal.getid_tipo_rasgo_personal()!=null) {
					this.tiporasgopersonalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tiporasgopersonalBeanSwingJInternalFrame.setIdActual(this.rasgopersonal.getid_tipo_rasgo_personal());
					this.tiporasgopersonalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tiporasgopersonalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tiporasgopersonalBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoRasgoPersonal();
				}

				JInternalFrameBase jinternalFrame =this.tiporasgopersonalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRasgoPersonal=(TitledBorder)this.jScrollPanelDatosRasgoPersonal.getBorder();
				TitledBorder titledBordertiporasgopersonal=(TitledBorder)this.tiporasgopersonalBeanSwingJInternalFrame.jScrollPanelDatosTipoRasgoPersonal.getBorder();

				titledBordertiporasgopersonal.setTitle(titledBorderRasgoPersonal.getTitle() + " -> Tipo Rasgo Personal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_rasgo_personalRasgoPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRasgoPersonal(this.getrasgopersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRasgoPersonal(this.rasgopersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rasgopersonal =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rasgopersonal =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rasgopersonal==null) {
						this.rasgopersonal = new RasgoPersonal();
					}

					this.setVariablesFormularioToObjetoActualRasgoPersonal(this.rasgopersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRasgoPersonal(this.rasgopersonal);
				}

				if(this.rasgopersonal.getid_tipo_rasgo_personal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_rasgo_personal = "+this.rasgopersonal.getid_tipo_rasgo_personal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRasgoPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionRasgoPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRasgoPersonal(this.getrasgopersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRasgoPersonal(this.rasgopersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rasgopersonal =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rasgopersonal =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rasgopersonal==null) {
						this.rasgopersonal = new RasgoPersonal();
					}

					this.setVariablesFormularioToObjetoActualRasgoPersonal(this.rasgopersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRasgoPersonal(this.rasgopersonal);
				}

				if(this.rasgopersonal.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.rasgopersonal.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRasgoPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRasgoPersonal(false,false);

			this.getRasgoPersonalsFK_IdEmpleado();

			this.inicializarActualizarBindingRasgoPersonal(false);

			//if(RasgoPersonalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRasgoPersonal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRasgoPersonal(false,false);

			this.getRasgoPersonalsFK_IdEmpresa();

			this.inicializarActualizarBindingRasgoPersonal(false);

			//if(RasgoPersonalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRasgoPersonal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoRasgoPersonalRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRasgoPersonal(false,false);

			this.getRasgoPersonalsFK_IdTipoRasgoPersonal();

			this.inicializarActualizarBindingRasgoPersonal(false);

			//if(RasgoPersonalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRasgoPersonal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rasgopersonalLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameRasgoPersonal() {
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
			this.jInternalFrameDetalleFormRasgoPersonal.setVisible(false);	    			
			this.jInternalFrameDetalleFormRasgoPersonal.dispose();
			this.jInternalFrameDetalleFormRasgoPersonal=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoRasgoPersonal!=null) {
			this.jInternalFrameReporteDinamicoRasgoPersonal.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoRasgoPersonal.dispose();
			this.jInternalFrameReporteDinamicoRasgoPersonal=null;
		}
		
		if(this.jInternalFrameImportacionRasgoPersonal!=null) {
			this.jInternalFrameImportacionRasgoPersonal.setVisible(false);	    			
			this.jInternalFrameImportacionRasgoPersonal.dispose();
			this.jInternalFrameImportacionRasgoPersonal=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessRasgoPersonal();
			
			RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
			
			
			if(sTipo.equals("NuevoRasgoPersonal")) {
				jButtonNuevoRasgoPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarRasgoPersonal")) {
				jButtonDuplicarRasgoPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarRasgoPersonal")) {
				jButtonCopiarRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("VerFormRasgoPersonal")) {
				jButtonVerFormRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarRasgoPersonal")) {
				jButtonNuevoRasgoPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarRasgoPersonal")) {
				jButtonDuplicarRasgoPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoRasgoPersonal")) {
				jButtonNuevoRasgoPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarRasgoPersonal")) {
				jButtonDuplicarRasgoPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesRasgoPersonal")) {
				jButtonNuevoRasgoPersonalActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarRasgoPersonal")) {
				jButtonNuevoRasgoPersonalActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesRasgoPersonal")) {
				jButtonNuevoRasgoPersonalActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarRasgoPersonal")) {
				jButtonModificarRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarRasgoPersonal")) {
				jButtonModificarRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarRasgoPersonal")) {
				jButtonModificarRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarRasgoPersonal")) {
				jButtonActualizarRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarRasgoPersonal")) {
				jButtonActualizarRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarRasgoPersonal")) {
				jButtonActualizarRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("EliminarRasgoPersonal")) {
				jButtonEliminarRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarRasgoPersonal")) {
				jButtonEliminarRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarRasgoPersonal")) {
				jButtonEliminarRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("CancelarRasgoPersonal")) {
				jButtonCancelarRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarRasgoPersonal")) {
				jButtonCancelarRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarRasgoPersonal")) {
				jButtonCancelarRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("CerrarRasgoPersonal")) {
				jButtonCerrarRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarRasgoPersonal")) {
				jButtonCerrarRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarRasgoPersonal")) {
				jButtonCerrarRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarRasgoPersonal")) {
				jButtonMostrarOcultarRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarRasgoPersonal")) {
				jButtonCancelarRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosRasgoPersonal")) {
				jButtonGuardarCambiosRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarRasgoPersonal")) {
				jButtonGuardarCambiosRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarRasgoPersonal")) {
				jButtonCopiarRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarRasgoPersonal")) {
				jButtonVerFormRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosRasgoPersonal")) {
				jButtonGuardarCambiosRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarRasgoPersonal")) {
				jButtonCopiarRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormRasgoPersonal")) {
				jButtonVerFormRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaRasgoPersonal")) {
				jButtonGuardarCambiosRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarRasgoPersonal")) {
				jButtonGuardarCambiosRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaRasgoPersonal")) {
				jButtonGuardarCambiosRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionRasgoPersonal")) {
				jButtonRecargarInformacionRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarRasgoPersonal")) {
				jButtonRecargarInformacionRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionRasgoPersonal")) {
				jButtonRecargarInformacionRasgoPersonalActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresRasgoPersonal")) {
				jButtonAnterioresRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarRasgoPersonal")) {
				jButtonAnterioresRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreRasgoPersonal")) {
				jButtonAnterioresRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesRasgoPersonal")) {
				jButtonSiguientesRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarRasgoPersonal")) {
				jButtonSiguientesRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesRasgoPersonal")) {
				jButtonSiguientesRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByRasgoPersonal") || sTipo.equals("MenuItemDetalleAbrirOrderByRasgoPersonal")) {
				jButtonAbrirOrderByRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarRasgoPersonal") || sTipo.equals("MenuItemDetalleMostrarOcultarRasgoPersonal")) {
				jButtonMostrarOcultarRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosRasgoPersonal")) {
				jButtonNuevoGuardarCambiosRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarRasgoPersonal")) {
				jButtonNuevoGuardarCambiosRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosRasgoPersonal")) {
				jButtonNuevoGuardarCambiosRasgoPersonalActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoRasgoPersonal")) {
				jButtonCerrarReporteDinamicoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoRasgoPersonal")) {
				jButtonGenerarReporteDinamicoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoRasgoPersonal")) {
				
				jButtonGenerarExcelReporteDinamicoRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionRasgoPersonal")) {
				jButtonCerrarImportacionRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionRasgoPersonal")) {
				
				jButtonGenerarImportacionRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionRasgoPersonal")) {
				
				jButtonAbrirImportacionRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesRasgoPersonal")) {
				jComboBoxTiposAccionesRasgoPersonalActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesRasgoPersonal")) {
				jComboBoxTiposRelacionesRasgoPersonalActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioRasgoPersonal")) {
				jComboBoxTiposAccionesRasgoPersonalActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarRasgoPersonal")) {
				
				jComboBoxTiposSeleccionarRasgoPersonalActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralRasgoPersonal")) {
				jTextFieldValorCampoGeneralRasgoPersonalActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByRasgoPersonal")) {
				jButtonAbrirOrderByRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarRasgoPersonal")) {
				jButtonAbrirOrderByRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByRasgoPersonal")) {
				jButtonCerrarOrderByRasgoPersonalActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRasgoPersonalBusqueda")) {
				this.jButtonidRasgoPersonalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRasgoPersonalUpdate")) {
				this.jButtonid_empresaRasgoPersonalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRasgoPersonalBusqueda")) {
				this.jButtonid_empresaRasgoPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoRasgoPersonal")) {
				this.jButtonid_empleadoRasgoPersonalActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoRasgoPersonalUpdate")) {
				this.jButtonid_empleadoRasgoPersonalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoRasgoPersonalBusqueda")) {
				this.jButtonid_empleadoRasgoPersonalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_rasgo_personalRasgoPersonalUpdate")) {
				this.jButtonid_tipo_rasgo_personalRasgoPersonalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_rasgo_personalRasgoPersonalBusqueda")) {
				this.jButtonid_tipo_rasgo_personalRasgoPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionRasgoPersonalBusqueda")) {
				this.jButtondescripcionRasgoPersonalBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_empleadoRasgoPersonal")) {
				this.jButtonid_empleadoRasgoPersonalActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdEmpleadoRasgoPersonal")) {
				this.jButtonFK_IdEmpleadoRasgoPersonalActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoRasgoPersonalRasgoPersonal")) {
				this.jButtonFK_IdTipoRasgoPersonalRasgoPersonalActionPerformed(evt);
			}
			
			;
			
			
			RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessRasgoPersonal();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRasgoPersonalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rasgopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rasgopersonal);
				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
				
				


				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RasgoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RasgoPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			RasgoPersonal rasgopersonalLocal=null;
			
			if(!this.getEsControlTabla()) {
				rasgopersonalLocal=this.rasgopersonal;
			} else {
				rasgopersonalLocal=this.rasgopersonalAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rasgopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rasgopersonal);
				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
							
				
				


				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RasgoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RasgoPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRasgoPersonalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalAnterior =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rasgopersonalAnterior =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
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
			
			RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
			
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
			
			


			
			RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRasgoPersonalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rasgopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rasgopersonal);
				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
								
						
				


				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RasgoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RasgoPersonal.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rasgopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rasgopersonal);
				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
								
				
				


				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RasgoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RasgoPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRasgoPersonalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalAnterior =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rasgopersonalAnterior =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rasgopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rasgopersonal);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRasgoPersonalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalAnterior =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rasgopersonalAnterior =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRasgoPersonalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rasgopersonal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rasgopersonal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rasgopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rasgopersonal);
				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
							
				
				


				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RasgoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RasgoPersonal.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRasgoPersonalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rasgopersonalAnterior =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.rasgopersonalAnterior =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
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
			
			RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
			
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
			
			


			
			RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRasgoPersonalActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rasgopersonal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rasgopersonal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rasgopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rasgopersonal);
				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
								
				
				


				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RasgoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RasgoPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRasgoPersonalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalAnterior =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rasgopersonalAnterior =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRasgoPersonalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rasgopersonal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rasgopersonal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRasgoPersonalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rasgopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rasgopersonal);
				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosRasgoPersonal")) {
					jCheckBoxSeleccionarTodosRasgoPersonalItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosRasgoPersonal")) {
					jCheckBoxSeleccionadosRasgoPersonalItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarRasgoPersonal")) {
					
				}
				
				


				
				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RasgoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RasgoPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.rasgopersonal);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.rasgopersonal);
				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
												
				
				


				
				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RasgoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RasgoPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRasgoPersonalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rasgopersonalAnterior =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.rasgopersonalAnterior =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRasgoPersonalActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rasgopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rasgopersonal);
				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
				
				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
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
			
			RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
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
			
			


			
			RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRasgoPersonalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rasgopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rasgopersonal);
				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RasgoPersonal.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RasgoPersonal.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rasgopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rasgopersonal);
				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
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
				
				


				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RasgoPersonal.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RasgoPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRasgoPersonalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rasgopersonalAnterior =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rasgopersonalAnterior =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarRasgoPersonal")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosRasgoPersonalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosRasgoPersonal.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.rasgopersonal =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.rasgopersonal =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.rasgopersonal);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarRasgoPersonal")) {
				
				}
				
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarRasgoPersonal")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosRasgoPersonal.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarRasgoPersonal")) {
			
			}
			
			RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessRasgoPersonal();
			
			RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
			
			if(sTipo.equals("NuevoRasgoPersonal")) {
				jButtonNuevoRasgoPersonalActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarRasgoPersonal")) {
				jButtonDuplicarRasgoPersonalActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarRasgoPersonal")) {
				jButtonCopiarRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormRasgoPersonal")) {
				jButtonVerFormRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesRasgoPersonal")) {
				jButtonNuevoRasgoPersonalActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarRasgoPersonal")) {
				jButtonModificarRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarRasgoPersonal")) {
				jButtonActualizarRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarRasgoPersonal")) {
				jButtonEliminarRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaRasgoPersonal")) {
				jButtonGuardarCambiosRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarRasgoPersonal")) {
				jButtonCancelarRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarRasgoPersonal")) {
				jButtonCerrarRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosRasgoPersonal")) {
				jButtonGuardarCambiosRasgoPersonalActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosRasgoPersonal")) {
				jButtonNuevoGuardarCambiosRasgoPersonalActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByRasgoPersonal")) {
				jButtonAbrirOrderByRasgoPersonalActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionRasgoPersonal")) {
				jButtonRecargarInformacionRasgoPersonalActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresRasgoPersonal")) {
				jButtonAnterioresRasgoPersonalActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesRasgoPersonal")) {
				jButtonSiguientesRasgoPersonalActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRasgoPersonalBusqueda")) {
				this.jButtonidRasgoPersonalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRasgoPersonalUpdate")) {
				this.jButtonid_empresaRasgoPersonalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRasgoPersonalBusqueda")) {
				this.jButtonid_empresaRasgoPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoRasgoPersonal")) {
				this.jButtonid_empleadoRasgoPersonalActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoRasgoPersonalUpdate")) {
				this.jButtonid_empleadoRasgoPersonalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoRasgoPersonalBusqueda")) {
				this.jButtonid_empleadoRasgoPersonalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_rasgo_personalRasgoPersonalUpdate")) {
				this.jButtonid_tipo_rasgo_personalRasgoPersonalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_rasgo_personalRasgoPersonalBusqueda")) {
				this.jButtonid_tipo_rasgo_personalRasgoPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionRasgoPersonalBusqueda")) {
				this.jButtondescripcionRasgoPersonalBusquedaActionPerformed(evt);
			}
			
			RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessRasgoPersonal();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameRasgoPersonal")) {
				closingInternalFrameRasgoPersonal();
				
			} else if(sTipo.equals("jButtonCancelarRasgoPersonal")) {
				JInternalFrameBase jInternalFrameDetalleFormRasgoPersonal = (JInternalFrameBase)evt.getSource();
	            	
	            RasgoPersonalBeanSwingJInternalFrame jInternalFrameParent=(RasgoPersonalBeanSwingJInternalFrame)jInternalFrameDetalleFormRasgoPersonal.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarRasgoPersonalActionPerformed(null);
			}
			
			RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.rasgopersonal,new Object(),this.rasgopersonalParameterGeneral,this.rasgopersonalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormRasgoPersonal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormRasgoPersonal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormRasgoPersonal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.rasgopersonal)) {
			if(!esControlTabla) {
				if(RasgoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualRasgoPersonal(this.rasgopersonal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRasgoPersonal(this.rasgopersonal);			
				}
				
				if(this.rasgopersonalSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualRasgoPersonal(this.rasgopersonal,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.rasgopersonalReturnGeneral=rasgopersonalLogic.procesarEventosRasgoPersonalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rasgopersonalLogic.getRasgoPersonals(),this.rasgopersonal,this.rasgopersonalParameterGeneral,this.isEsNuevoRasgoPersonal,classes);//this.rasgopersonalLogic.getRasgoPersonal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanRasgoPersonal(this.rasgopersonalReturnGeneral,this.rasgopersonalBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.rasgopersonalSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanRasgoPersonal(classes,this.rasgopersonalReturnGeneral,this.rasgopersonalBean,false);
					}
						
					if(this.rasgopersonalReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyRasgoPersonal(this.rasgopersonalReturnGeneral.getRasgoPersonal());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioRasgoPersonal(this.rasgopersonalReturnGeneral.getRasgoPersonal());	
					}
						
					if(this.rasgopersonalReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioRasgoPersonal(this.rasgopersonalReturnGeneral.getRasgoPersonal(),classes);//this.rasgopersonalBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioRasgoPersonal(this.rasgopersonal,classes);//this.rasgopersonalBean);									
				}
			
				if(RasgoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualRasgoPersonal(this.rasgopersonal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRasgoPersonal(this.rasgopersonal);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.rasgopersonalAnterior!=null) {
						this.rasgopersonal=this.rasgopersonalAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.rasgopersonalReturnGeneral=rasgopersonalLogic.procesarEventosRasgoPersonalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rasgopersonalLogic.getRasgoPersonals(),this.rasgopersonal,this.rasgopersonalParameterGeneral,this.isEsNuevoRasgoPersonal,classes);//this.rasgopersonalLogic.getRasgoPersonal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.rasgopersonalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.rasgopersonalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.rasgopersonalReturnGeneral.getRasgoPersonal(),rasgopersonalLogic.getRasgoPersonals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.rasgopersonalReturnGeneral.getRasgoPersonal(),this.rasgopersonals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosRasgoPersonal.repaint();
				
				//((AbstractTableModel) this.jTableDatosRasgoPersonal.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosRasgoPersonal();
			}
		}
	}
	
	public void actualizarVisualTableDatosRasgoPersonal() throws Exception {
		
		RasgoPersonalModel rasgopersonalModel=(RasgoPersonalModel)this.jTableDatosRasgoPersonal.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rasgopersonalModel.rasgopersonals=this.rasgopersonalLogic.getRasgoPersonals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			rasgopersonalModel.rasgopersonals=this.rasgopersonals;
		}
		
		
		((RasgoPersonalModel) this.jTableDatosRasgoPersonal.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaRasgoPersonal() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getrasgopersonalAnterior(),this.rasgopersonalLogic.getRasgoPersonals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getrasgopersonalAnterior(),this.rasgopersonals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosRasgoPersonal();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioRasgoPersonal(RasgoPersonal rasgopersonal,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
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
										
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rasgopersonal,new Object(),generalEntityParameterGeneral,this.rasgopersonalReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.rasgopersonalSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=RasgoPersonalConstantesFunciones.getClassesRelationshipsOfRasgoPersonal(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=RasgoPersonalConstantesFunciones.getClassesRelationshipsFromStringsOfRasgoPersonal(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormRasgoPersonal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				RasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rasgopersonal,new Object(),generalEntityParameterGeneral,this.rasgopersonalReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioRasgoPersonal(RasgoPersonalBean rasgopersonalBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanRasgoPersonal(ArrayList<Classe> classes,RasgoPersonalReturnGeneral rasgopersonalReturnGeneral,RasgoPersonalBean rasgopersonalBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualRasgoPersonal(RasgoPersonal rasgopersonal,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.rasgopersonal)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormRasgoPersonal = new RasgoPersonalDetalleFormJInternalFrame(jDesktopPane,this.rasgopersonalSessionBean.getConGuardarRelaciones(),this.rasgopersonalSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormRasgoPersonal);
		this.jInternalFrameDetalleFormRasgoPersonal.setVisible(false);
		this.jInternalFrameDetalleFormRasgoPersonal.setSelected(false);						
		
		this.jInternalFrameDetalleFormRasgoPersonal.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormRasgoPersonal.rasgopersonalLogic=this.rasgopersonalLogic;
		
		this.cargarCombosFrameForeignKeyRasgoPersonal("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleRasgoPersonal();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRasgoPersonal();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyRasgoPersonal("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyRasgoPersonal();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormRasgoPersonal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRasgoPersonal"));
		
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonModificarRasgoPersonal.addActionListener(new ButtonActionListener(this,"ModificarRasgoPersonal"));

		
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonModificarToolBarRasgoPersonal.addActionListener(new ButtonActionListener(this,"ModificarToolBarRasgoPersonal"));
					
		this.jInternalFrameDetalleFormRasgoPersonal.jMenuItemModificarRasgoPersonal.addActionListener(new ButtonActionListener(this,"MenuItemModificarRasgoPersonal"));		
		
		
		
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonActualizarRasgoPersonal.addActionListener (new ButtonActionListener(this,"ActualizarRasgoPersonal"));
		
		
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonActualizarToolBarRasgoPersonal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRasgoPersonal"));
						
		this.jInternalFrameDetalleFormRasgoPersonal.jMenuItemActualizarRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRasgoPersonal"));		
		
		
		
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonEliminarRasgoPersonal.addActionListener (new ButtonActionListener(this,"EliminarRasgoPersonal"));
		
		
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonEliminarToolBarRasgoPersonal.addActionListener (new ButtonActionListener(this,"EliminarToolBarRasgoPersonal"));
								
		this.jInternalFrameDetalleFormRasgoPersonal.jMenuItemEliminarRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRasgoPersonal"));		
		
		
		
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonCancelarRasgoPersonal.addActionListener (new ButtonActionListener(this,"CancelarRasgoPersonal"));
		
		
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonCancelarToolBarRasgoPersonal.addActionListener (new ButtonActionListener(this,"CancelarToolBarRasgoPersonal"));
					
		this.jInternalFrameDetalleFormRasgoPersonal.jMenuItemCancelarRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRasgoPersonal"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormRasgoPersonal.jMenuItemDetalleCerrarRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRasgoPersonal"));		
		
		
		
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonGuardarCambiosToolBarRasgoPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRasgoPersonal"));
		
		
		
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonGuardarCambiosToolBarRasgoPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRasgoPersonal"));
		
		
		
		this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxTiposAccionesFormularioRasgoPersonal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRasgoPersonal"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonidRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"idRasgoPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonid_empresaRasgoPersonalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRasgoPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonid_empresaRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRasgoPersonalBusqueda"));
		//jButtonid_empleadoRasgoPersonal.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoRasgoPersonalActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonid_empleadoRasgoPersonal.addActionListener(new ButtonActionListener(this,"id_empleadoRasgoPersonal"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonid_empleadoRasgoPersonalUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoRasgoPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonid_empleadoRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoRasgoPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonid_tipo_rasgo_personalRasgoPersonalUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_rasgo_personalRasgoPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonid_tipo_rasgo_personalRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_rasgo_personalRasgoPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRasgoPersonal.jButtondescripcionRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"descripcionRasgoPersonalBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormRasgoPersonal.jTabbedPaneRelacionesRasgoPersonal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRasgoPersonal"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameRasgoPersonal"));
		
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRasgoPersonal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRasgoPersonal"));
		}
		
		this.jTableDatosRasgoPersonal.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarRasgoPersonal"));
		
		this.jTableDatosRasgoPersonal.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarRasgoPersonal"));
		
		this.jButtonNuevoRasgoPersonal.addActionListener(new ButtonActionListener(this,"NuevoRasgoPersonal"));
		
		this.jButtonDuplicarRasgoPersonal.addActionListener(new ButtonActionListener(this,"DuplicarRasgoPersonal"));
		
		this.jButtonCopiarRasgoPersonal.addActionListener(new ButtonActionListener(this,"CopiarRasgoPersonal"));
		
		this.jButtonVerFormRasgoPersonal.addActionListener(new ButtonActionListener(this,"VerFormRasgoPersonal"));
		
		
		this.jButtonNuevoToolBarRasgoPersonal.addActionListener(new ButtonActionListener(this,"NuevoToolBarRasgoPersonal"));
			
		this.jButtonDuplicarToolBarRasgoPersonal.addActionListener(new ButtonActionListener(this,"DuplicarToolBarRasgoPersonal"));
			
		this.jMenuItemNuevoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoRasgoPersonal"));
			
		this.jMenuItemDuplicarRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarRasgoPersonal"));		
		
		
		this.jButtonNuevoRelacionesRasgoPersonal.addActionListener (new ButtonActionListener(this,"NuevoRelacionesRasgoPersonal"));
		
		
		this.jButtonNuevoRelacionesToolBarRasgoPersonal.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarRasgoPersonal"));
			
		this.jMenuItemNuevoRelacionesRasgoPersonal.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesRasgoPersonal"));		
		
		
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonModificarRasgoPersonal.addActionListener(new ButtonActionListener(this,"ModificarRasgoPersonal"));
		}
		
		
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonModificarToolBarRasgoPersonal.addActionListener(new ButtonActionListener(this,"ModificarToolBarRasgoPersonal"));
			
			this.jInternalFrameDetalleFormRasgoPersonal.jMenuItemModificarRasgoPersonal.addActionListener(new ButtonActionListener(this,"MenuItemModificarRasgoPersonal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonActualizarRasgoPersonal.addActionListener (new ButtonActionListener(this,"ActualizarRasgoPersonal"));
		}
		
		
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonActualizarToolBarRasgoPersonal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRasgoPersonal"));
				
			this.jInternalFrameDetalleFormRasgoPersonal.jMenuItemActualizarRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRasgoPersonal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonEliminarRasgoPersonal.addActionListener (new ButtonActionListener(this,"EliminarRasgoPersonal"));
		}
		
		
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonEliminarToolBarRasgoPersonal.addActionListener (new ButtonActionListener(this,"EliminarToolBarRasgoPersonal"));
						
			this.jInternalFrameDetalleFormRasgoPersonal.jMenuItemEliminarRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRasgoPersonal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonCancelarRasgoPersonal.addActionListener (new ButtonActionListener(this,"CancelarRasgoPersonal"));
		}
		
		
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonCancelarToolBarRasgoPersonal.addActionListener (new ButtonActionListener(this,"CancelarToolBarRasgoPersonal"));
			
			this.jInternalFrameDetalleFormRasgoPersonal.jMenuItemCancelarRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRasgoPersonal"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarRasgoPersonal.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarRasgoPersonal"));		
		
		
		this.jButtonCerrarRasgoPersonal.addActionListener (new ButtonActionListener(this,"CerrarRasgoPersonal"));
		
		
		this.jButtonCerrarToolBarRasgoPersonal.addActionListener (new ButtonActionListener(this,"CerrarToolBarRasgoPersonal"));
			
		this.jMenuItemCerrarRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemCerrarRasgoPersonal"));
			
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRasgoPersonal.jMenuItemDetalleCerrarRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRasgoPersonal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonGuardarCambiosRasgoPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosRasgoPersonal"));
		}
		
		
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonGuardarCambiosToolBarRasgoPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRasgoPersonal"));
		}
		
		this.jButtonCopiarToolBarRasgoPersonal.addActionListener (new ButtonActionListener(this,"CopiarToolBarRasgoPersonal"));
			
		this.jButtonVerFormToolBarRasgoPersonal.addActionListener (new ButtonActionListener(this,"VerFormToolBarRasgoPersonal"));
		
		this.jMenuItemGuardarCambiosRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosRasgoPersonal"));
			
		this.jMenuItemCopiarRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemCopiarRasgoPersonal"));		
		
		this.jMenuItemVerFormRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemVerFormRasgoPersonal"));		
		
		
		this.jButtonGuardarCambiosTablaRasgoPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRasgoPersonal"));
		
		
		this.jButtonGuardarCambiosTablaToolBarRasgoPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarRasgoPersonal"));
			
		this.jMenuItemGuardarCambiosTablaRasgoPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRasgoPersonal"));		
		
		
		
		this.jButtonRecargarInformacionRasgoPersonal.addActionListener (new ButtonActionListener(this,"RecargarInformacionRasgoPersonal"));
					
		this.jButtonRecargarInformacionToolBarRasgoPersonal.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarRasgoPersonal"));
		
		this.jMenuItemRecargarInformacionRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionRasgoPersonal"));		
		
		
		
		this.jButtonAnterioresRasgoPersonal.addActionListener (new ButtonActionListener(this,"AnterioresRasgoPersonal"));
		
		
		this.jButtonAnterioresToolBarRasgoPersonal.addActionListener (new ButtonActionListener(this,"AnterioresToolBarRasgoPersonal"));
		
		this.jMenuItemAnterioresRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresRasgoPersonal"));		
		
		
		this.jButtonSiguientesRasgoPersonal.addActionListener (new ButtonActionListener(this,"SiguientesRasgoPersonal"));
		
		
		this.jButtonSiguientesToolBarRasgoPersonal.addActionListener (new ButtonActionListener(this,"SiguientesToolBarRasgoPersonal"));
			
		this.jMenuItemSiguientesRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesRasgoPersonal"));
			
		this.jMenuItemAbrirOrderByRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByRasgoPersonal"));
			
		this.jMenuItemMostrarOcultarRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarRasgoPersonal"));
			
		this.jMenuItemDetalleAbrirOrderByRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByRasgoPersonal"));
			
		this.jMenuItemDetalleMostarOcultarRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarRasgoPersonal"));		
		
		
		this.jButtonNuevoGuardarCambiosRasgoPersonal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosRasgoPersonal"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarRasgoPersonal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarRasgoPersonal"));
			
		this.jMenuItemNuevoGuardarCambiosRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosRasgoPersonal"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosRasgoPersonal.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosRasgoPersonal"));

		this.jCheckBoxSeleccionadosRasgoPersonal.addItemListener(new CheckBoxItemListener(this,"SeleccionadosRasgoPersonal"));
		
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxTiposAccionesFormularioRasgoPersonal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRasgoPersonal"));
		}
		
		
		this.jComboBoxTiposRelacionesRasgoPersonal.addActionListener (new ButtonActionListener(this,"TiposRelacionesRasgoPersonal"));
			
		this.jComboBoxTiposAccionesRasgoPersonal.addActionListener (new ButtonActionListener(this,"TiposAccionesRasgoPersonal"));
					
		this.jComboBoxTiposSeleccionarRasgoPersonal.addActionListener (new ButtonActionListener(this,"TiposSeleccionarRasgoPersonal"));
			
		this.jTextFieldValorCampoGeneralRasgoPersonal.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralRasgoPersonal"));		
		
		
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonidRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"idRasgoPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonid_empresaRasgoPersonalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRasgoPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonid_empresaRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRasgoPersonalBusqueda"));
		//jButtonid_empleadoRasgoPersonal.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoRasgoPersonalActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonid_empleadoRasgoPersonal.addActionListener(new ButtonActionListener(this,"id_empleadoRasgoPersonal"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonid_empleadoRasgoPersonalUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoRasgoPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonid_empleadoRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoRasgoPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonid_tipo_rasgo_personalRasgoPersonalUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_rasgo_personalRasgoPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonid_tipo_rasgo_personalRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_rasgo_personalRasgoPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRasgoPersonal.jButtondescripcionRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"descripcionRasgoPersonalBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoRasgoPersonal.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoRasgoPersonal"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoRasgoPersonal.addActionListener(new ButtonActionListener(this,"id_empleadoRasgoPersonal"));

			this.jButtonFK_IdTipoRasgoPersonalRasgoPersonal.addActionListener(new ButtonActionListener(this,"FK_IdTipoRasgoPersonalRasgoPersonal"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoRasgoPersonal!=null) {
				this.jInternalFrameReporteDinamicoRasgoPersonal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRasgoPersonal"));
				this.jInternalFrameReporteDinamicoRasgoPersonal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRasgoPersonal"));
				this.jInternalFrameReporteDinamicoRasgoPersonal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRasgoPersonal"));
			}
			
			//this.jButtonCerrarReporteDinamicoRasgoPersonal.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRasgoPersonal"));				
			//this.jButtonGenerarReporteDinamicoRasgoPersonal.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRasgoPersonal"));
			//this.jButtonGenerarExcelReporteDinamicoRasgoPersonal.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRasgoPersonal"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionRasgoPersonal!=null) {
				this.jInternalFrameImportacionRasgoPersonal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRasgoPersonal"));
				this.jInternalFrameImportacionRasgoPersonal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRasgoPersonal"));
				this.jInternalFrameImportacionRasgoPersonal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRasgoPersonal"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByRasgoPersonal.addActionListener (new ButtonActionListener(this,"AbrirOrderByRasgoPersonal"));
			
			this.jButtonAbrirOrderByToolBarRasgoPersonal.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarRasgoPersonal"));			
			
			if(this.jInternalFrameOrderByRasgoPersonal!=null) {
				this.jInternalFrameOrderByRasgoPersonal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRasgoPersonal"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRasgoPersonal.jTabbedPaneRelacionesRasgoPersonal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRasgoPersonal"));
		
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
            		closingInternalFrameRasgoPersonal();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormRasgoPersonal.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormRasgoPersonal = (JInternalFrameBase)event.getSource();
	            	
	            RasgoPersonalBeanSwingJInternalFrame jInternalFrameParent=(RasgoPersonalBeanSwingJInternalFrame)jInternalFrameDetalleFormRasgoPersonal.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarRasgoPersonalActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosRasgoPersonal.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosRasgoPersonalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosRasgoPersonal.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosRasgoPersonal.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRasgoPersonalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRasgoPersonalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRasgoPersonalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRasgoPersonal";
		inputMap = this.jButtonNuevoRasgoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRasgoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRasgoPersonalActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRasgoPersonalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRasgoPersonalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRasgoPersonalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesRasgoPersonal";
		inputMap = this.jButtonNuevoRelacionesRasgoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesRasgoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRasgoPersonalActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarRasgoPersonal";
		inputMap = this.jButtonModificarRasgoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarRasgoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarRasgoPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarRasgoPersonal";
		inputMap = this.jButtonActualizarRasgoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarRasgoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarRasgoPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarRasgoPersonal";
		inputMap = this.jButtonEliminarRasgoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarRasgoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarRasgoPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarRasgoPersonal";
		inputMap = this.jButtonCancelarRasgoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarRasgoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarRasgoPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarRasgoPersonal";
		inputMap = this.jButtonCerrarRasgoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarRasgoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarRasgoPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonGuardarCambiosRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosRasgoPersonal";
		inputMap = this.jInternalFrameDetalleFormRasgoPersonal.jButtonGuardarCambiosRasgoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonGuardarCambiosRasgoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosRasgoPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosRasgoPersonal.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosRasgoPersonalItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesRasgoPersonal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesRasgoPersonalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarRasgoPersonal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarRasgoPersonalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralRasgoPersonal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralRasgoPersonalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonidRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"idRasgoPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonid_empresaRasgoPersonalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRasgoPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonid_empresaRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRasgoPersonalBusqueda"));
		//jButtonid_empleadoRasgoPersonal.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoRasgoPersonalActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonid_empleadoRasgoPersonal.addActionListener(new ButtonActionListener(this,"id_empleadoRasgoPersonal"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonid_empleadoRasgoPersonalUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoRasgoPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonid_empleadoRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoRasgoPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonid_tipo_rasgo_personalRasgoPersonalUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_rasgo_personalRasgoPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRasgoPersonal.jButtonid_tipo_rasgo_personalRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_rasgo_personalRasgoPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRasgoPersonal.jButtondescripcionRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"descripcionRasgoPersonalBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoRasgoPersonal.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoRasgoPersonal"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoRasgoPersonal.addActionListener(new ButtonActionListener(this,"id_empleadoRasgoPersonal"));

		this.jButtonFK_IdTipoRasgoPersonalRasgoPersonal.addActionListener(new ButtonActionListener(this,"FK_IdTipoRasgoPersonalRasgoPersonal"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarRasgoPersonalActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarRasgoPersonal.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosRasgoPersonal(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(RasgoPersonal rasgopersonalAux:this.rasgopersonalLogic.getRasgoPersonals()) {
					rasgopersonalAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RasgoPersonal rasgopersonalAux:rasgopersonals) {
					rasgopersonalAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosRasgoPersonalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRasgoPersonal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RasgoPersonal rasgopersonalAux:this.rasgopersonalLogic.getRasgoPersonals()) {
						rasgopersonalAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RasgoPersonal rasgopersonalAux:rasgopersonals) {
						rasgopersonalAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(RasgoPersonal rasgopersonalAux:this.rasgopersonalLogic.getRasgoPersonals()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RasgoPersonal rasgopersonalAux:rasgopersonals) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaRasgoPersonal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRasgoPersonal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRasgoPersonal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRasgoPersonal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosRasgoPersonalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRasgoPersonal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosRasgoPersonal.getSelectedRows();
			
			RasgoPersonal rasgopersonalLocal=new RasgoPersonal();
			
			//this.seleccionarTodosRasgoPersonal(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rasgopersonalLocal =(RasgoPersonal) this.rasgopersonalLogic.getRasgoPersonals().toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					rasgopersonalLocal =(RasgoPersonal) this.rasgopersonals.toArray()[this.jTableDatosRasgoPersonal.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				rasgopersonalLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RasgoPersonal rasgopersonalAux:this.rasgopersonalLogic.getRasgoPersonals()) {
						rasgopersonalAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RasgoPersonal rasgopersonalAux:rasgopersonals) {
						rasgopersonalAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaRasgoPersonal(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRasgoPersonal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRasgoPersonal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRasgoPersonal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualRasgoPersonalItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarRasgoPersonalParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralRasgoPersonalActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingRasgoPersonal(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralRasgoPersonal.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RasgoPersonal rasgopersonalAux:this.rasgopersonalLogic.getRasgoPersonals()) {
				
						if(sTipoSeleccionar.equals(RasgoPersonalConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							rasgopersonalAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RasgoPersonal rasgopersonalAux:rasgopersonals) {
					
						if(sTipoSeleccionar.equals(RasgoPersonalConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							rasgopersonalAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaRasgoPersonal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesRasgoPersonalActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingRasgoPersonal(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioRasgoPersonal=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesRasgoPersonal.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxTiposAccionesFormularioRasgoPersonal.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteRasgoPersonal) {				
					conSplash=true;//false;										
					
					//this.startProcessRasgoPersonal(conSplash);
				
					this.generarReporteRasgoPersonalsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRasgoPersonal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxTiposAccionesFormularioRasgoPersonal.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoRasgoPersonalsSeleccionados();
				//this.jComboBoxTiposAccionesRasgoPersonal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRasgoPersonalsSeleccionados(false);
				//this.jComboBoxTiposAccionesRasgoPersonal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRasgoPersonalsSeleccionados(true);
				//this.jComboBoxTiposAccionesRasgoPersonal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRasgoPersonal();
				
				this.exportarRasgoPersonalsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRasgoPersonal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxTiposAccionesFormularioRasgoPersonal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionRasgoPersonals();
				//this.importarRasgoPersonals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRasgoPersonal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxTiposAccionesFormularioRasgoPersonal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRasgoPersonal();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelRasgoPersonalsSeleccionados();
				//this.jComboBoxTiposAccionesRasgoPersonal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Rasgo Personal", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessRasgoPersonal();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoRasgoPersonal)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyRasgoPersonal(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Rasgo Personal",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRasgoPersonal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxTiposAccionesFormularioRasgoPersonal.setSelectedIndex(0);					
				}	
			} 			
			else if(RasgoPersonalBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteRasgoPersonal) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessRasgoPersonal(conSplash);
					
						//this.actualizarParametrosGeneralRasgoPersonal();
						
						this.generarReporteProcesoAccionRasgoPersonalsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesRasgoPersonal.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxTiposAccionesFormularioRasgoPersonal.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(RasgoPersonalBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Rasgo PersonalES SELECCIONADOS?", "MANTENIMIENTO DE Rasgo Personal", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessRasgoPersonal();
				
						this.actualizarParametrosGeneralRasgoPersonal();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.rasgopersonalReturnGeneral=rasgopersonalLogic.procesarAccionRasgoPersonalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.rasgopersonalLogic.getRasgoPersonals(),this.rasgopersonalParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarRasgoPersonalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRasgoPersonal.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxTiposAccionesFormularioRasgoPersonal.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralRasgoPersonal();
					
					RasgoPersonalBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarRasgoPersonalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRasgoPersonal.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxTiposAccionesFormularioRasgoPersonal.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessRasgoPersonal(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesRasgoPersonalActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessRasgoPersonal();
			
			if(this.jInternalFrameDetalleFormRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<RasgoPersonal> rasgopersonalsSeleccionados=new ArrayList<RasgoPersonal>();		
			RasgoPersonal rasgopersonal=new RasgoPersonal();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingRasgoPersonal(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesRasgoPersonal.getSelectedItem();
			
			
			
			
			rasgopersonalsSeleccionados=this.getRasgoPersonalsSeleccionados(true);
			//this.sTipoAccion;
			
			if(rasgopersonalsSeleccionados.size()==1) {
				for(RasgoPersonal rasgopersonalAux:rasgopersonalsSeleccionados) {
					rasgopersonal=rasgopersonalAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessRasgoPersonal();
			
      		//this.finishProcessRasgoPersonal(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarRasgoPersonalReturnGeneral() throws Exception {
		if(this.rasgopersonalReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.rasgopersonalReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.rasgopersonalReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.rasgopersonalReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.rasgopersonalReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.rasgopersonalReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingRasgoPersonal(false);
		}
		
		if(this.rasgopersonalReturnGeneral.getConRetornoLista() || this.rasgopersonalReturnGeneral.getConRetornoObjeto()) {
			if(this.rasgopersonalReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.rasgopersonalLogic.setRasgoPersonals(this.rasgopersonalReturnGeneral.getRasgoPersonals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.rasgopersonalReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.rasgopersonalLogic.setRasgoPersonal(this.rasgopersonalReturnGeneral.getRasgoPersonal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingRasgoPersonal(false);
		}
	}
	
	public void actualizarParametrosGeneralRasgoPersonal() throws Exception {
		
		
	}
	
	public ArrayList<RasgoPersonal> getRasgoPersonalsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<RasgoPersonal> rasgopersonalsSeleccionados=new ArrayList<RasgoPersonal>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioRasgoPersonal) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(RasgoPersonal rasgopersonalAux:rasgopersonalLogic.getRasgoPersonals()) {
					if(rasgopersonalAux.getIsSelected()) {
						rasgopersonalsSeleccionados.add(rasgopersonalAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RasgoPersonal rasgopersonalAux:this.rasgopersonals) {
					if(rasgopersonalAux.getIsSelected()) {
						rasgopersonalsSeleccionados.add(rasgopersonalAux);				
					}
				}
			}
			
			if(rasgopersonalsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						rasgopersonalsSeleccionados.addAll(this.rasgopersonalLogic.getRasgoPersonals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						rasgopersonalsSeleccionados.addAll(this.rasgopersonals);				
					}
				}
			}
		} else {
			rasgopersonalsSeleccionados.add(this.rasgopersonal);
		}
		
		return rasgopersonalsSeleccionados;
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
	
	public void generarReporteRasgoPersonalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalRasgoPersonalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoRasgoPersonalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRasgoPersonalsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRasgoPersonalsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Rasgo Personal",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesRasgoPersonalsSeleccionados() throws Exception {
		ArrayList<RasgoPersonal> rasgopersonalsSeleccionados=new ArrayList<RasgoPersonal>();		
		
		rasgopersonalsSeleccionados=this.getRasgoPersonalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteRasgoPersonals("Todos",rasgopersonalsSeleccionados);
		
	}	
	
	public void generarReporteNormalRasgoPersonalsSeleccionados() throws Exception {
		ArrayList<RasgoPersonal> rasgopersonalsSeleccionados=new ArrayList<RasgoPersonal>();		
		
		rasgopersonalsSeleccionados=this.getRasgoPersonalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteRasgoPersonals("Todos",rasgopersonalsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionRasgoPersonalsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<RasgoPersonal> rasgopersonalsSeleccionados=new ArrayList<RasgoPersonal>();
		
		rasgopersonalsSeleccionados=this.getRasgoPersonalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteRasgoPersonals("Todos",rasgopersonalsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoRasgoPersonalsSeleccionados() throws Exception {
		ArrayList<RasgoPersonal> rasgopersonalsSeleccionados=new ArrayList<RasgoPersonal>();		
		
		
		this.abrirInicializarFrameReporteDinamicoRasgoPersonal();
		
		
		rasgopersonalsSeleccionados=this.getRasgoPersonalsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoRasgoPersonal();
		
		
		//this.generarReporteRasgoPersonals("Todos",rasgopersonalsSeleccionados ,rasgopersonalImplementable,rasgopersonalImplementableHome);
	}
	
	public void mostrarImportacionRasgoPersonals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionRasgoPersonal();
		
		this.abrirFrameImportacionRasgoPersonal();		
		
			
		//this.generarReporteRasgoPersonals("Todos",rasgopersonalsSeleccionados ,rasgopersonalImplementable,rasgopersonalImplementableHome);
	}
	
	public void importarRasgoPersonals() throws Exception {		
	
	}
	
	public void exportarRasgoPersonalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelRasgoPersonalsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoRasgoPersonalsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlRasgoPersonalsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Rasgo Personal",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoRasgoPersonalsSeleccionados() throws Exception {
		ArrayList<RasgoPersonal> rasgopersonalsSeleccionados=new ArrayList<RasgoPersonal>();		
		
		rasgopersonalsSeleccionados=this.getRasgoPersonalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rasgopersonal."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarRasgoPersonal(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(RasgoPersonal rasgopersonalAux:rasgopersonalsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarRasgoPersonal(rasgopersonalAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//rasgopersonalAux.setsDetalleGeneralEntityReporte(rasgopersonalAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rasgo Personal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarRasgoPersonal(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=RasgoPersonalConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RasgoPersonalConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RasgoPersonalConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RasgoPersonalConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RasgoPersonalConstantesFunciones.LABEL_IDTIPORASGOPERSONAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RasgoPersonalConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarRasgoPersonal(RasgoPersonal rasgopersonal,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=rasgopersonal.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=rasgopersonal.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=rasgopersonal.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rasgopersonal.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rasgopersonal.gettiporasgopersonal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rasgopersonal.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelRasgoPersonalsSeleccionados() throws Exception {
		ArrayList<RasgoPersonal> rasgopersonalsSeleccionados=new ArrayList<RasgoPersonal>();		
		
		rasgopersonalsSeleccionados=this.getRasgoPersonalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rasgopersonal.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("RasgoPersonals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelRasgoPersonal(row);				
				iRow++;
			}				
			
			for(RasgoPersonal rasgopersonalAux:rasgopersonalsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelRasgoPersonal(rasgopersonalAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rasgo Personal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlRasgoPersonalsSeleccionados() throws Exception {
		ArrayList<RasgoPersonal> rasgopersonalsSeleccionados=new ArrayList<RasgoPersonal>();		
		
		rasgopersonalsSeleccionados=this.getRasgoPersonalsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rasgopersonal.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("rasgopersonals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("rasgopersonal");
			//elementRoot.appendChild(element);
		
			for(RasgoPersonal rasgopersonalAux:rasgopersonalsSeleccionados) {
				element = document.createElement("rasgopersonal");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlRasgoPersonal(rasgopersonalAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rasgo Personal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelRasgoPersonal(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(RasgoPersonalConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(RasgoPersonalConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(RasgoPersonalConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(RasgoPersonalConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(RasgoPersonalConstantesFunciones.LABEL_IDTIPORASGOPERSONAL);
		cell = row.createCell(iColumn++);cell.setCellValue(RasgoPersonalConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelRasgoPersonal(RasgoPersonal rasgopersonal,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(rasgopersonal.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(rasgopersonal.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(rasgopersonal.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(rasgopersonal.gettiporasgopersonal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(rasgopersonal.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlRasgoPersonal(RasgoPersonal rasgopersonal,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(RasgoPersonalConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(rasgopersonal.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(RasgoPersonalConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(rasgopersonal.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(RasgoPersonalConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(rasgopersonal.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(RasgoPersonalConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(rasgopersonal.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementtiporasgopersonal_descripcion = document.createElement(RasgoPersonalConstantesFunciones.IDTIPORASGOPERSONAL);
		elementtiporasgopersonal_descripcion.appendChild(document.createTextNode(rasgopersonal.gettiporasgopersonal_descripcion()));
		element.appendChild(elementtiporasgopersonal_descripcion);

		Element elementdescripcion = document.createElement(RasgoPersonalConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(rasgopersonal.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoRasgoPersonalsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<RasgoPersonal> rasgopersonalsSeleccionados=new ArrayList<RasgoPersonal>();
		
		rasgopersonalsSeleccionados=this.getRasgoPersonalsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoRasgoPersonal(rasgopersonalsSeleccionados);
		
		this.generarReporteRasgoPersonals("Todos",rasgopersonalsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoRasgoPersonal(ArrayList<RasgoPersonal> rasgopersonalsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(RasgoPersonal rasgopersonalAux:rasgopersonalsSeleccionados) {
				rasgopersonalAux.setsDetalleGeneralEntityReporte(rasgopersonalAux.toString());
			
				if(sTipoSeleccionar.equals(RasgoPersonalConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					rasgopersonalAux.setsDescripcionGeneralEntityReporte1(rasgopersonalAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RasgoPersonalConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					rasgopersonalAux.setsDescripcionGeneralEntityReporte1(rasgopersonalAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RasgoPersonalConstantesFunciones.LABEL_IDTIPORASGOPERSONAL)) {
					existe=true;
					rasgopersonalAux.setsDescripcionGeneralEntityReporte1(rasgopersonalAux.gettiporasgopersonal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RasgoPersonalConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					rasgopersonalAux.setsDescripcionGeneralEntityReporte1(rasgopersonalAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesRasgoPersonal(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoRasgoPersonal=true;
				this.isVisibilidadCeldaNuevoRelacionesRasgoPersonal=true;
				this.isVisibilidadCeldaGuardarCambiosRasgoPersonal=true;
			}
			
			this.isVisibilidadCeldaModificarRasgoPersonal=false;
			this.isVisibilidadCeldaActualizarRasgoPersonal=false;
			this.isVisibilidadCeldaEliminarRasgoPersonal=false;
			this.isVisibilidadCeldaCancelarRasgoPersonal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRasgoPersonal=true;
				} else {
					this.isVisibilidadCeldaGuardarRasgoPersonal=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoRasgoPersonal=false;
			this.isVisibilidadCeldaNuevoRelacionesRasgoPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosRasgoPersonal=false;
			this.isVisibilidadCeldaModificarRasgoPersonal=false;
			this.isVisibilidadCeldaActualizarRasgoPersonal=true;
			this.isVisibilidadCeldaEliminarRasgoPersonal=false;
			this.isVisibilidadCeldaCancelarRasgoPersonal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRasgoPersonal=true;
				} else {
					this.isVisibilidadCeldaGuardarRasgoPersonal=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoRasgoPersonal=false;
			this.isVisibilidadCeldaNuevoRelacionesRasgoPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosRasgoPersonal=false;
			this.isVisibilidadCeldaModificarRasgoPersonal=false;
			this.isVisibilidadCeldaActualizarRasgoPersonal=true;
			this.isVisibilidadCeldaEliminarRasgoPersonal=true;
			this.isVisibilidadCeldaCancelarRasgoPersonal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRasgoPersonal=true;
				} else {
					this.isVisibilidadCeldaGuardarRasgoPersonal=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoRasgoPersonal=false;
			this.isVisibilidadCeldaNuevoRelacionesRasgoPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosRasgoPersonal=false;
			this.isVisibilidadCeldaModificarRasgoPersonal=false;
			this.isVisibilidadCeldaActualizarRasgoPersonal=true;
			this.isVisibilidadCeldaEliminarRasgoPersonal=false;
			this.isVisibilidadCeldaCancelarRasgoPersonal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRasgoPersonal=false;
				} else {
					this.isVisibilidadCeldaGuardarRasgoPersonal=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoRasgoPersonal=true;
			this.isVisibilidadCeldaNuevoRelacionesRasgoPersonal=true;
			this.isVisibilidadCeldaGuardarCambiosRasgoPersonal=true;
			this.isVisibilidadCeldaModificarRasgoPersonal=false;
			this.isVisibilidadCeldaActualizarRasgoPersonal=false;
			this.isVisibilidadCeldaEliminarRasgoPersonal=false;
			this.isVisibilidadCeldaCancelarRasgoPersonal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRasgoPersonal=true;
				} else {
					this.isVisibilidadCeldaGuardarRasgoPersonal=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoRasgoPersonal=false;
			this.isVisibilidadCeldaNuevoRelacionesRasgoPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosRasgoPersonal=false;
			this.isVisibilidadCeldaActualizarRasgoPersonal=false;
			this.isVisibilidadCeldaEliminarRasgoPersonal=false;
			this.isVisibilidadCeldaCancelarRasgoPersonal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRasgoPersonal=false;
				} else {
					this.isVisibilidadCeldaGuardarRasgoPersonal=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoRasgoPersonal=false;
			this.isVisibilidadCeldaNuevoRelacionesRasgoPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosRasgoPersonal=false;
			this.isVisibilidadCeldaModificarRasgoPersonal=true;
			this.isVisibilidadCeldaActualizarRasgoPersonal=false;
			this.isVisibilidadCeldaEliminarRasgoPersonal=false;
			this.isVisibilidadCeldaCancelarRasgoPersonal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRasgoPersonal=false;
				} else {
					this.isVisibilidadCeldaGuardarRasgoPersonal=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(RasgoPersonalJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoRasgoPersonal=true;
			this.isVisibilidadCeldaNuevoRelacionesRasgoPersonal=true;
			this.isVisibilidadCeldaGuardarCambiosRasgoPersonal=true;
		} else {
			this.actualizarEstadoPanelsRasgoPersonal(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarRasgoPersonal=false;
			//this.isVisibilidadCeldaVerFormRasgoPersonal=false;
			this.isVisibilidadCeldaDuplicarRasgoPersonal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!rasgopersonalSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesRasgoPersonal=false;
		} else {
			this.isVisibilidadCeldaNuevoRasgoPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosRasgoPersonal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(rasgopersonalSessionBean.getEsGuardarRelacionado()) {
			if(!rasgopersonalSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesRasgoPersonal=false;												
			}
			
			this.jButtonCerrarRasgoPersonal.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesRasgoPersonal=false;
		}
		
		if(!this.permiteMantenimiento(this.rasgopersonal)) {
			this.isVisibilidadCeldaActualizarRasgoPersonal=false;
			this.isVisibilidadCeldaEliminarRasgoPersonal=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesRasgoPersonal() {
	}
	
	public void actualizarEstadoPanelsRasgoPersonal(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionRasgoPersonal!=null) {
				this.jScrollPanelDatosEdicionRasgoPersonal.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRasgoPersonal!=null) {
				this.jTabbedPaneBusquedasRasgoPersonal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRasgoPersonal!=null) {
				this.jScrollPanelDatosRasgoPersonal.setVisible(true);
			}
			
			if(this.jPanelPaginacionRasgoPersonal!=null) {
				this.jPanelPaginacionRasgoPersonal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRasgoPersonal!=null) {
				this.jPanelParametrosReportesRasgoPersonal.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionRasgoPersonal!=null) {
				this.jScrollPanelDatosEdicionRasgoPersonal.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRasgoPersonal!=null) {
				this.jTabbedPaneBusquedasRasgoPersonal.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosRasgoPersonal!=null) {
				this.jScrollPanelDatosRasgoPersonal.setVisible(false);
			}
			
			if(this.jPanelPaginacionRasgoPersonal!=null) {
				this.jPanelPaginacionRasgoPersonal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRasgoPersonal!=null) {
				this.jPanelParametrosReportesRasgoPersonal.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionRasgoPersonal!=null) {
				this.jScrollPanelDatosEdicionRasgoPersonal.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRasgoPersonal!=null) {
				this.jTabbedPaneBusquedasRasgoPersonal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRasgoPersonal!=null) {
				this.jScrollPanelDatosRasgoPersonal.setVisible(false);
			}
			
			if(this.jPanelPaginacionRasgoPersonal!=null) {
				this.jPanelPaginacionRasgoPersonal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRasgoPersonal!=null) {
				this.jPanelParametrosReportesRasgoPersonal.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionRasgoPersonal!=null) {
				this.jScrollPanelDatosEdicionRasgoPersonal.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRasgoPersonal!=null) {
				this.jTabbedPaneBusquedasRasgoPersonal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRasgoPersonal!=null) {
				this.jScrollPanelDatosRasgoPersonal.setVisible(false);
			}
			
			if(this.jPanelPaginacionRasgoPersonal!=null) {
				this.jPanelPaginacionRasgoPersonal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRasgoPersonal!=null) {
				this.jPanelParametrosReportesRasgoPersonal.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionRasgoPersonal!=null) {
				this.jScrollPanelDatosEdicionRasgoPersonal.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRasgoPersonal!=null) {
				this.jTabbedPaneBusquedasRasgoPersonal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRasgoPersonal!=null) {
				this.jScrollPanelDatosRasgoPersonal.setVisible(true);
			}
			
			if(this.jPanelPaginacionRasgoPersonal!=null) {
				this.jPanelPaginacionRasgoPersonal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRasgoPersonal!=null) {
				this.jPanelParametrosReportesRasgoPersonal.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionRasgoPersonal!=null) {
				this.jScrollPanelDatosEdicionRasgoPersonal.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRasgoPersonal!=null) {
				this.jTabbedPaneBusquedasRasgoPersonal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRasgoPersonal!=null) {
				this.jScrollPanelDatosRasgoPersonal.setVisible(true);
			}
			
			if(this.jPanelPaginacionRasgoPersonal!=null) {
				this.jPanelPaginacionRasgoPersonal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRasgoPersonal!=null) {
				this.jPanelParametrosReportesRasgoPersonal.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionRasgoPersonal!=null) {
				this.jScrollPanelDatosEdicionRasgoPersonal.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRasgoPersonal!=null) {
				this.jTabbedPaneBusquedasRasgoPersonal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRasgoPersonal!=null) {
				this.jScrollPanelDatosRasgoPersonal.setVisible(true);
			}
			
			if(this.jPanelPaginacionRasgoPersonal!=null) {
				this.jPanelPaginacionRasgoPersonal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRasgoPersonal!=null) {
				this.jPanelParametrosReportesRasgoPersonal.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasRasgoPersonal!=null) {
					this.jTabbedPaneBusquedasRasgoPersonal.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesRasgoPersonal!=null) {
				this.jPanelParametrosReportesRasgoPersonal.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.rasgopersonalSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRasgoPersonal!=null) {
				this.jTabbedPaneBusquedasRasgoPersonal.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesRasgoPersonal!=null) {
				this.jPanelParametrosReportesRasgoPersonal.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasRasgoPersonal.remove(jPanelFK_IdEmpleadoRasgoPersonal);}

			this.isVisibilidadFK_IdTipoRasgoPersonal=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoRasgoPersonal) {this.jTabbedPaneBusquedasRasgoPersonal.remove(jPanelFK_IdTipoRasgoPersonalRasgoPersonal);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasRasgoPersonal.remove(jPanelFK_IdEmpleadoRasgoPersonal);}

			this.isVisibilidadFK_IdTipoRasgoPersonal=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdTipoRasgoPersonal) {this.jTabbedPaneBusquedasRasgoPersonal.remove(jPanelFK_IdTipoRasgoPersonalRasgoPersonal);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoRasgoPersonal(Boolean isParaTipoRasgoPersonal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoRasgoPersonalNegation=!isParaTipoRasgoPersonal;

			this.isVisibilidadFK_IdEmpleado=isParaTipoRasgoPersonalNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasRasgoPersonal.remove(jPanelFK_IdEmpleadoRasgoPersonal);}

			this.isVisibilidadFK_IdTipoRasgoPersonal=isParaTipoRasgoPersonal;
			if(!this.isVisibilidadFK_IdTipoRasgoPersonal) {this.jTabbedPaneBusquedasRasgoPersonal.remove(jPanelFK_IdTipoRasgoPersonalRasgoPersonal);}
		}
		
	}
	
	
	
	

	public String registrarSesionRasgoPersonalParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(rasgopersonalSessionBean==null) {
				rasgopersonalSessionBean=new RasgoPersonalSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(rasgopersonalSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.rasgopersonalFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(RasgoPersonalConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionRasgoPersonal(true);
			//empleadoSessionBean.setlidRasgoPersonalActual(this.idRasgoPersonalActual);

			rasgopersonalSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyRasgoPersonal(true);
			rasgopersonalSessionBean.setlIdRasgoPersonalActualForeignKey(this.idRasgoPersonalActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//RasgoPersonalSessionBean rasgopersonalSessionBean=new RasgoPersonalSessionBean();
		
		if(this.rasgopersonalSessionBean==null) {
			this.rasgopersonalSessionBean=new RasgoPersonalSessionBean();
		}
		
		this.rasgopersonalSessionBean.setsUltimaBusquedaRasgoPersonal(this.getsAccionBusqueda());
		this.rasgopersonalSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.rasgopersonalSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			rasgopersonalSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			rasgopersonalSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoRasgoPersonal")) {
			rasgopersonalSessionBean.setid_tipo_rasgo_personal(this.getid_tipo_rasgo_personalFK_IdTipoRasgoPersonal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//RasgoPersonalSessionBean rasgopersonalSessionBean=new RasgoPersonalSessionBean();
		
		if(this.rasgopersonalSessionBean==null) {
			this.rasgopersonalSessionBean=new RasgoPersonalSessionBean();
		}
		
		if(this.rasgopersonalSessionBean.getsUltimaBusquedaRasgoPersonal()!=null&&!this.rasgopersonalSessionBean.getsUltimaBusquedaRasgoPersonal().equals("")) {
			this.setsAccionBusqueda(rasgopersonalSessionBean.getsUltimaBusquedaRasgoPersonal());
			this.setiNumeroPaginacion(rasgopersonalSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(rasgopersonalSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(rasgopersonalSessionBean.getid_empleado());
				rasgopersonalSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(rasgopersonalSessionBean.getid_empresa());
				rasgopersonalSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoRasgoPersonal")) {
				this.setid_tipo_rasgo_personalFK_IdTipoRasgoPersonal(rasgopersonalSessionBean.getid_tipo_rasgo_personal());
				rasgopersonalSessionBean.setid_tipo_rasgo_personal(-1L);
			}
		}
		
		this.rasgopersonalSessionBean.setsUltimaBusquedaRasgoPersonal("");
		this.rasgopersonalSessionBean.setiNumeroPaginacion(RasgoPersonalConstantesFunciones.INUMEROPAGINACION);
		this.rasgopersonalSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaRasgoPersonal(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioRasgoPersonal() {
		this.updateBorderResaltarBusquedasFormularioRasgoPersonal();
		this.updateVisibilidadBusquedasFormularioRasgoPersonal();
		this.updateHabilitarBusquedasFormularioRasgoPersonal();
	}
	
	public void updateBorderResaltarBusquedasFormularioRasgoPersonal() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasRasgoPersonal.getComponents().length>0) {
	

		if(this.rasgopersonalConstantesFunciones.resaltarFK_IdEmpleadoRasgoPersonal!=null) {
			index= this.jTabbedPaneBusquedasRasgoPersonal.indexOfComponent(this.jPanelFK_IdEmpleadoRasgoPersonal);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRasgoPersonal.getComponent(index);
				jPanel.setBorder(this.rasgopersonalConstantesFunciones.resaltarFK_IdEmpleadoRasgoPersonal);
			}
		}

		if(this.rasgopersonalConstantesFunciones.resaltarFK_IdTipoRasgoPersonalRasgoPersonal!=null) {
			index= this.jTabbedPaneBusquedasRasgoPersonal.indexOfComponent(this.jPanelFK_IdTipoRasgoPersonalRasgoPersonal);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRasgoPersonal.getComponent(index);
				jPanel.setBorder(this.rasgopersonalConstantesFunciones.resaltarFK_IdTipoRasgoPersonalRasgoPersonal);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioRasgoPersonal() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasRasgoPersonal.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRasgoPersonal.indexOfComponent(this.jPanelFK_IdEmpleadoRasgoPersonal);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRasgoPersonal.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.rasgopersonalConstantesFunciones.mostrarFK_IdEmpleadoRasgoPersonal);
			if(!this.rasgopersonalConstantesFunciones.mostrarFK_IdEmpleadoRasgoPersonal && index>-1) {
				this.jTabbedPaneBusquedasRasgoPersonal.remove(index);
			}

			index= this.jTabbedPaneBusquedasRasgoPersonal.indexOfComponent(this.jPanelFK_IdTipoRasgoPersonalRasgoPersonal);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRasgoPersonal.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.rasgopersonalConstantesFunciones.mostrarFK_IdTipoRasgoPersonalRasgoPersonal);
			if(!this.rasgopersonalConstantesFunciones.mostrarFK_IdTipoRasgoPersonalRasgoPersonal && index>-1) {
				this.jTabbedPaneBusquedasRasgoPersonal.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioRasgoPersonal() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasRasgoPersonal.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRasgoPersonal.indexOfComponent(this.jPanelFK_IdEmpleadoRasgoPersonal);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRasgoPersonal.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.rasgopersonalConstantesFunciones.activarFK_IdEmpleadoRasgoPersonal);
				this.jTabbedPaneBusquedasRasgoPersonal.setEnabledAt(index,this.rasgopersonalConstantesFunciones.activarFK_IdEmpleadoRasgoPersonal);
			}

			index= this.jTabbedPaneBusquedasRasgoPersonal.indexOfComponent(this.jPanelFK_IdTipoRasgoPersonalRasgoPersonal);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRasgoPersonal.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.rasgopersonalConstantesFunciones.activarFK_IdTipoRasgoPersonalRasgoPersonal);
				this.jTabbedPaneBusquedasRasgoPersonal.setEnabledAt(index,this.rasgopersonalConstantesFunciones.activarFK_IdTipoRasgoPersonalRasgoPersonal);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaRasgoPersonal(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasRasgoPersonal.indexOfComponent(this.jPanelFK_IdEmpleadoRasgoPersonal);

			this.jTabbedPaneBusquedasRasgoPersonal.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRasgoPersonal.getComponent(index);

			this.rasgopersonalConstantesFunciones.setResaltarFK_IdEmpleadoRasgoPersonal(resaltar);

			jPanel.setBorder(this.rasgopersonalConstantesFunciones.resaltarFK_IdEmpleadoRasgoPersonal);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoRasgoPersonal")) {
			index= this.jTabbedPaneBusquedasRasgoPersonal.indexOfComponent(this.jPanelFK_IdTipoRasgoPersonalRasgoPersonal);

			this.jTabbedPaneBusquedasRasgoPersonal.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRasgoPersonal.getComponent(index);

			this.rasgopersonalConstantesFunciones.setResaltarFK_IdTipoRasgoPersonalRasgoPersonal(resaltar);

			jPanel.setBorder(this.rasgopersonalConstantesFunciones.resaltarFK_IdTipoRasgoPersonalRasgoPersonal);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarRasgoPersonal.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioRasgoPersonal() throws Exception {

		if(this.jInternalFrameDetalleFormRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioRasgoPersonal();
		this.updateVisibilidadResaltarControlesFormularioRasgoPersonal();
		this.updateHabilitarResaltarControlesFormularioRasgoPersonal();
		
	}
	
	public void updateBorderResaltarControlesFormularioRasgoPersonal() throws Exception {
		if(this.jInternalFrameDetalleFormRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.rasgopersonalConstantesFunciones.resaltaridRasgoPersonal!=null && this.jInternalFrameDetalleFormRasgoPersonal!=null) {this.jInternalFrameDetalleFormRasgoPersonal.jLabelidRasgoPersonal.setBorder(this.rasgopersonalConstantesFunciones.resaltaridRasgoPersonal);}
		if(this.rasgopersonalConstantesFunciones.resaltarid_empresaRasgoPersonal!=null && this.jInternalFrameDetalleFormRasgoPersonal!=null) {this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empresaRasgoPersonal.setBorder(this.rasgopersonalConstantesFunciones.resaltarid_empresaRasgoPersonal);}
		if(this.rasgopersonalConstantesFunciones.resaltarid_empleadoRasgoPersonal!=null && this.jInternalFrameDetalleFormRasgoPersonal!=null) {this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empleadoRasgoPersonal.setBorder(this.rasgopersonalConstantesFunciones.resaltarid_empleadoRasgoPersonal);}
		if(this.rasgopersonalConstantesFunciones.resaltarid_tipo_rasgo_personalRasgoPersonal!=null && this.jInternalFrameDetalleFormRasgoPersonal!=null) {this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_tipo_rasgo_personalRasgoPersonal.setBorder(this.rasgopersonalConstantesFunciones.resaltarid_tipo_rasgo_personalRasgoPersonal);}
		if(this.rasgopersonalConstantesFunciones.resaltardescripcionRasgoPersonal!=null && this.jInternalFrameDetalleFormRasgoPersonal!=null) {this.jInternalFrameDetalleFormRasgoPersonal.jTextAreadescripcionRasgoPersonal.setBorder(this.rasgopersonalConstantesFunciones.resaltardescripcionRasgoPersonal);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioRasgoPersonal() throws Exception {		
		if(this.jInternalFrameDetalleFormRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
	
		//this.jInternalFrameDetalleFormRasgoPersonal.jLabelidRasgoPersonal.setVisible(this.rasgopersonalConstantesFunciones.mostraridRasgoPersonal);
		this.jInternalFrameDetalleFormRasgoPersonal.jPanelidRasgoPersonal.setVisible(this.rasgopersonalConstantesFunciones.mostraridRasgoPersonal);
		//this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empresaRasgoPersonal.setVisible(this.rasgopersonalConstantesFunciones.mostrarid_empresaRasgoPersonal);
		this.jInternalFrameDetalleFormRasgoPersonal.jPanelid_empresaRasgoPersonal.setVisible(this.rasgopersonalConstantesFunciones.mostrarid_empresaRasgoPersonal);
		//this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empleadoRasgoPersonal.setVisible(this.rasgopersonalConstantesFunciones.mostrarid_empleadoRasgoPersonal);
		this.jInternalFrameDetalleFormRasgoPersonal.jPanelid_empleadoRasgoPersonal.setVisible(this.rasgopersonalConstantesFunciones.mostrarid_empleadoRasgoPersonal);
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonid_empleadoRasgoPersonal.setVisible(this.rasgopersonalConstantesFunciones.mostrarid_empleadoRasgoPersonal);
		//this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_tipo_rasgo_personalRasgoPersonal.setVisible(this.rasgopersonalConstantesFunciones.mostrarid_tipo_rasgo_personalRasgoPersonal);
		this.jInternalFrameDetalleFormRasgoPersonal.jPanelid_tipo_rasgo_personalRasgoPersonal.setVisible(this.rasgopersonalConstantesFunciones.mostrarid_tipo_rasgo_personalRasgoPersonal);
		//this.jInternalFrameDetalleFormRasgoPersonal.jTextAreadescripcionRasgoPersonal.setVisible(this.rasgopersonalConstantesFunciones.mostrardescripcionRasgoPersonal);
		this.jInternalFrameDetalleFormRasgoPersonal.jPaneldescripcionRasgoPersonal.setVisible(this.rasgopersonalConstantesFunciones.mostrardescripcionRasgoPersonal);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioRasgoPersonal() throws Exception {
		if(this.jInternalFrameDetalleFormRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRasgoPersonal!=null) {
	
		this.jInternalFrameDetalleFormRasgoPersonal.jLabelidRasgoPersonal.setEnabled(this.rasgopersonalConstantesFunciones.activaridRasgoPersonal);
		this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empresaRasgoPersonal.setEnabled(this.rasgopersonalConstantesFunciones.activarid_empresaRasgoPersonal);
		this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_empleadoRasgoPersonal.setEnabled(this.rasgopersonalConstantesFunciones.activarid_empleadoRasgoPersonal);
			this.jInternalFrameDetalleFormRasgoPersonal.jButtonid_empleadoRasgoPersonal.setEnabled(this.rasgopersonalConstantesFunciones.activarid_empleadoRasgoPersonal);
		this.jInternalFrameDetalleFormRasgoPersonal.jComboBoxid_tipo_rasgo_personalRasgoPersonal.setEnabled(this.rasgopersonalConstantesFunciones.activarid_tipo_rasgo_personalRasgoPersonal);
		this.jInternalFrameDetalleFormRasgoPersonal.jTextAreadescripcionRasgoPersonal.setEnabled(this.rasgopersonalConstantesFunciones.activardescripcionRasgoPersonal);
		}
	}
	
		
}