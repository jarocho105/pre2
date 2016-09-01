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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.nomina.util.CreditosPendientesConstantesFunciones;
import com.bydan.erp.nomina.util.report.CreditosPendientesParameterReturnGeneral;
//import com.bydan.erp.nomina.util.report.CreditosPendientesParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.report.CreditosPendientesBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.nomina.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.nomina.util.*;

import com.bydan.erp.nomina.util.report.*;
import com.bydan.erp.nomina.business.logic.report.*;

import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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

//import org.hibernate.collection.PersistentBag;

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
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;

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


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CreditosPendientesBeanSwingJInternalFrame extends CreditosPendientesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CreditosPendientesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CreditosPendientes> creditospendientesValidator = new ClassValidator<CreditosPendientes>(CreditosPendientes.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CreditosPendientes creditospendientes;	
	public CreditosPendientes creditospendientesAux;
	public CreditosPendientes creditospendientesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CreditosPendientes creditospendientesTotales;
	public Long idCreditosPendientesActual;
	public Long iIdNuevoCreditosPendientes=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboCargo="";

	public List<Cargo> cargosForeignKey;

	public List<Cargo> getcargosForeignKey() {
		return cargosForeignKey;
	}

	public void setcargosForeignKey(List<Cargo> cargosForeignKey) {
		this.cargosForeignKey = cargosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cargo cargoForeignKey;

	public Cargo getcargoForeignKey() {
		return cargoForeignKey;
	}

	public void setcargoForeignKey(Cargo cargoForeignKey) {
		this.cargoForeignKey = cargoForeignKey;
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
	
	public Boolean isPermisoTodoCreditosPendientes;
	public Boolean isPermisoNuevoCreditosPendientes;
	public Boolean isPermisoActualizarCreditosPendientes;
	public Boolean isPermisoActualizarOriginalCreditosPendientes;
	public Boolean isPermisoEliminarCreditosPendientes;
	public Boolean isPermisoGuardarCambiosCreditosPendientes;
	public Boolean isPermisoConsultaCreditosPendientes;
	public Boolean isPermisoBusquedaCreditosPendientes;
	public Boolean isPermisoReporteCreditosPendientes;
	public Boolean isPermisoPaginacionMedioCreditosPendientes;
	public Boolean isPermisoPaginacionAltoCreditosPendientes;
	public Boolean isPermisoPaginacionTodoCreditosPendientes;
	public Boolean isPermisoCopiarCreditosPendientes;
	public Boolean isPermisoVerFormCreditosPendientes;
	public Boolean isPermisoDuplicarCreditosPendientes;
	public Boolean isPermisoOrdenCreditosPendientes;
	
	
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
	
	public CreditosPendientesParameterReturnGeneral creditospendientesReturnGeneral;
	public CreditosPendientesParameterReturnGeneral creditospendientesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCreditosPendientes=false;
	public Boolean esParaAccionDesdeFormularioCreditosPendientes=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CreditosPendientesSessionBeanAdditional creditospendientesSessionBeanAdditional=null;
	
	public CreditosPendientesSessionBeanAdditional getCreditosPendientesSessionBeanAdditional() {
		return this.creditospendientesSessionBeanAdditional;
	}
	
	public void setCreditosPendientesSessionBeanAdditional(CreditosPendientesSessionBeanAdditional creditospendientesSessionBeanAdditional) {
		try {
			this.creditospendientesSessionBeanAdditional=creditospendientesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CreditosPendientesBeanSwingJInternalFrameAdditional creditospendientesBeanSwingJInternalFrameAdditional=null;
	//public class CreditosPendientesBeanSwingJInternalFrame
	
	public CreditosPendientesBeanSwingJInternalFrameAdditional getCreditosPendientesBeanSwingJInternalFrameAdditional() {
		return this.creditospendientesBeanSwingJInternalFrameAdditional;
	}
	
	public void setCreditosPendientesBeanSwingJInternalFrameAdditional(CreditosPendientesBeanSwingJInternalFrameAdditional creditospendientesBeanSwingJInternalFrameAdditional) {
		try {
			this.creditospendientesBeanSwingJInternalFrameAdditional=creditospendientesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CreditosPendientesLogic creditospendientesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CreditosPendientes creditospendientesBean;
	public CreditosPendientesConstantesFunciones creditospendientesConstantesFunciones;
	//public CreditosPendientesParameterReturnGeneral creditospendientesReturnGeneral;
	
	//FK
	
	public CargoLogic cargoLogic;
	public EstructuraLogic estructuraLogic;
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	
	//PARAMETROS
	
	
	//public List<CreditosPendientes> creditospendientess;	
	//public List<CreditosPendientes> creditospendientessEliminados;
	//public List<CreditosPendientes> creditospendientessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCreditosPendientes=false;
	public Boolean isVisibilidadCeldaDuplicarCreditosPendientes=true;
	public Boolean isVisibilidadCeldaCopiarCreditosPendientes=true;
	public Boolean isVisibilidadCeldaVerFormCreditosPendientes=true;
	public Boolean isVisibilidadCeldaOrdenCreditosPendientes=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCreditosPendientes=false;
	public Boolean isVisibilidadCeldaModificarCreditosPendientes=false;
	public Boolean isVisibilidadCeldaActualizarCreditosPendientes=false;
	public Boolean isVisibilidadCeldaEliminarCreditosPendientes=false;
	public Boolean isVisibilidadCeldaCancelarCreditosPendientes=false;
	public Boolean isVisibilidadCeldaGuardarCreditosPendientes=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCreditosPendientes=false;	
	
	
	public Boolean isVisibilidadBusquedaCreditosPendientes=false;
	public Boolean isVisibilidadFK_IdCargo=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	
	public Long getiIdNuevoCreditosPendientes() {
		return this.iIdNuevoCreditosPendientes;
	}

	public void setiIdNuevoCreditosPendientes(Long iIdNuevoCreditosPendientes) {
		this.iIdNuevoCreditosPendientes = iIdNuevoCreditosPendientes;
	}
	
	public Long getidCreditosPendientesActual() {
		return this.idCreditosPendientesActual;
	}

	public void setidCreditosPendientesActual(Long idCreditosPendientesActual) {
		this.idCreditosPendientesActual = idCreditosPendientesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CreditosPendientes getcreditospendientes() {
		return this.creditospendientes;
	}

	public void setcreditospendientes(CreditosPendientes creditospendientes) {
		this.creditospendientes = creditospendientes;
	}
	
	public CreditosPendientes getcreditospendientesAux() {
		return this.creditospendientesAux;
	}

	public void setcreditospendientesAux(CreditosPendientes creditospendientesAux) {
		this.creditospendientesAux = creditospendientesAux;
	}				
	
	public CreditosPendientes getcreditospendientesAnterior() {
		return this.creditospendientesAnterior;
	}

	public void setcreditospendientesAnterior(CreditosPendientes creditospendientesAnterior) {
		this.creditospendientesAnterior = creditospendientesAnterior;
	}	
	
	public CreditosPendientes getcreditospendientesTotales() {
		return this.creditospendientesTotales;
	}

	public void setcreditospendientesTotales(CreditosPendientes creditospendientesTotales) {
		this.creditospendientesTotales = creditospendientesTotales;
	}	
	
	public CreditosPendientes getcreditospendientesBean() {
		return this.creditospendientesBean;
	}

	public void setcreditospendientesBean(CreditosPendientes creditospendientesBean) {
		this.creditospendientesBean = creditospendientesBean;
	}	
	
	public CreditosPendientesParameterReturnGeneral getcreditospendientesReturnGeneral() {
		return this.creditospendientesReturnGeneral;
	}

	public void setcreditospendientesReturnGeneral(CreditosPendientesParameterReturnGeneral creditospendientesReturnGeneral) {
		this.creditospendientesReturnGeneral = creditospendientesReturnGeneral;
	}	
	
	
	public Long id_cargoBusquedaCreditosPendientes=-1L;

	public Long getid_cargoBusquedaCreditosPendientes() {
		return this.id_cargoBusquedaCreditosPendientes;
	}

	public void setid_cargoBusquedaCreditosPendientes(Long id_cargoBusquedaCreditosPendientes) {
		this.id_cargoBusquedaCreditosPendientes = id_cargoBusquedaCreditosPendientes;
	}

;
	public Long id_estructuraBusquedaCreditosPendientes=-1L;

	public Long getid_estructuraBusquedaCreditosPendientes() {
		return this.id_estructuraBusquedaCreditosPendientes;
	}

	public void setid_estructuraBusquedaCreditosPendientes(Long id_estructuraBusquedaCreditosPendientes) {
		this.id_estructuraBusquedaCreditosPendientes = id_estructuraBusquedaCreditosPendientes;
	}

;
	public Long id_empleadoBusquedaCreditosPendientes=-1L;

	public Long getid_empleadoBusquedaCreditosPendientes() {
		return this.id_empleadoBusquedaCreditosPendientes;
	}

	public void setid_empleadoBusquedaCreditosPendientes(Long id_empleadoBusquedaCreditosPendientes) {
		this.id_empleadoBusquedaCreditosPendientes = id_empleadoBusquedaCreditosPendientes;
	}

;
	public Date fecha_vencimiento_desdeBusquedaCreditosPendientes=new Date();

	public Date getfecha_vencimiento_desdeBusquedaCreditosPendientes() {
		return this.fecha_vencimiento_desdeBusquedaCreditosPendientes;
	}

	public void setfecha_vencimiento_desdeBusquedaCreditosPendientes(Date fecha_vencimiento_desdeBusquedaCreditosPendientes) {
		this.fecha_vencimiento_desdeBusquedaCreditosPendientes = fecha_vencimiento_desdeBusquedaCreditosPendientes;
	}

;
	public Date fecha_vencimiento_hastaBusquedaCreditosPendientes=new Date();

	public Date getfecha_vencimiento_hastaBusquedaCreditosPendientes() {
		return this.fecha_vencimiento_hastaBusquedaCreditosPendientes;
	}

	public void setfecha_vencimiento_hastaBusquedaCreditosPendientes(Date fecha_vencimiento_hastaBusquedaCreditosPendientes) {
		this.fecha_vencimiento_hastaBusquedaCreditosPendientes = fecha_vencimiento_hastaBusquedaCreditosPendientes;
	}

	public Long id_cargoFK_IdCargo=-1L;

	public Long getid_cargoFK_IdCargo() {
		return this.id_cargoFK_IdCargo;
	}

	public void setid_cargoFK_IdCargo(Long id_cargoFK_IdCargo) {
		this.id_cargoFK_IdCargo = id_cargoFK_IdCargo;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CreditosPendientesLogic getCreditosPendientesLogic()	{		
		return creditospendientesLogic;
	}

	public void setCreditosPendientesLogic(CreditosPendientesLogic creditospendientesLogic) {
		this.creditospendientesLogic = creditospendientesLogic;
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
	
	public Boolean getIsEsNuevoCreditosPendientes() {
		return isEsNuevoCreditosPendientes;
	}

	public void setIsEsNuevoCreditosPendientes(Boolean isEsNuevoCreditosPendientes) {
		this.isEsNuevoCreditosPendientes = isEsNuevoCreditosPendientes;
	}

	public Boolean getEsParaAccionDesdeFormularioCreditosPendientes() {
		return esParaAccionDesdeFormularioCreditosPendientes;
	}
	
	public void setEsParaAccionDesdeFormularioCreditosPendientes(Boolean esParaAccionDesdeFormularioCreditosPendientes) {
		this.esParaAccionDesdeFormularioCreditosPendientes = esParaAccionDesdeFormularioCreditosPendientes;
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
	
	
	public void cargarCombosCargosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cargosForeignKey=new ArrayList<Cargo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CargoLogic cargoLogic=new CargoLogic();

			cargoLogic.getCargoDataAccess().setIsForForeingKeyData(true);

			if(this.creditospendientesSessionBean==null) {
				this.creditospendientesSessionBean=new CreditosPendientesSessionBean();
			}

			if(!this.creditospendientesSessionBean.getisBusquedaDesdeForeignKeySesionCargo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargoLogic.getCargoDataAccess().setIsForForeingKeyData(true);

					cargoLogic.getTodosCargosWithConnection(sFinalQuery,new Pagination());

					this.cargosForeignKey=cargoLogic.getCargos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCargo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargoLogic.getEntityWithConnection(creditospendientesSessionBean.getlidCargoActual());
					this.cargosForeignKey.add(cargoLogic.getCargo());
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

			estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

			if(this.creditospendientesSessionBean==null) {
				this.creditospendientesSessionBean=new CreditosPendientesSessionBean();
			}

			if(!this.creditospendientesSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

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
					estructuraLogic.getEntityWithConnection(creditospendientesSessionBean.getlidEstructuraActual());
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

			if(this.creditospendientesSessionBean==null) {
				this.creditospendientesSessionBean=new CreditosPendientesSessionBean();
			}

			if(!this.creditospendientesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(creditospendientesSessionBean.getlidEmpresaActual());
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

			if(this.creditospendientesSessionBean==null) {
				this.creditospendientesSessionBean=new CreditosPendientesSessionBean();
			}

			if(!this.creditospendientesSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(creditospendientesSessionBean.getlidEmpleadoActual());
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

	
	
	public void setActualCargoForeignKey(Long idCargoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cargo  cargoTemp=null;

			for(Cargo cargoAux:cargosForeignKey) {
				if(cargoAux.getId()!=null && cargoAux.getId().equals(idCargoSeleccionado)) {
					cargoTemp=cargoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cargoTemp!=null) {

					if(this.creditospendientes!=null) {
						this.creditospendientes.setCargo(cargoTemp);
					}

					if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
						this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_cargoCreditosPendientes.setSelectedItem(cargoTemp);
					}
				} else {
					//jComboBoxid_cargoCreditosPendientes.setSelectedItem(cargoTemp);
					if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
						if(this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_cargoCreditosPendientes.getItemCount()>0) {
							this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_cargoCreditosPendientes.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCreditosPendientes") || sFormularioTipoBusqueda.equals("Todos")){
					if(cargoTemp!=null && jComboBoxid_cargoBusquedaCreditosPendientesCreditosPendientes!=null) {
						jComboBoxid_cargoBusquedaCreditosPendientesCreditosPendientes.setSelectedItem(cargoTemp);
					} else {
						if(jComboBoxid_cargoBusquedaCreditosPendientesCreditosPendientes!=null) {
							//jComboBoxid_cargoBusquedaCreditosPendientesCreditosPendientes.setSelectedItem(cargoTemp);
							if(jComboBoxid_cargoBusquedaCreditosPendientesCreditosPendientes.getItemCount()>0) {
								jComboBoxid_cargoBusquedaCreditosPendientesCreditosPendientes.setSelectedIndex(0);
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

	public String getActualCargoForeignKeyDescripcion(Long idCargoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cargo  cargoTemp=null;

			for(Cargo cargoAux:cargosForeignKey) {
				if(cargoAux.getId()!=null && cargoAux.getId().equals(idCargoSeleccionado)) {
					cargoTemp=cargoAux;
					break;
				}
			}


			sDescripcion=CargoConstantesFunciones.getCargoDescripcion(cargoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCargoForeignKeyGenerico(Long idCargoSeleccionado,JComboBox jComboBoxid_cargoCreditosPendientesGenerico)throws Exception
	{
		try
		{
			Cargo  cargoTemp=null;

			for(Cargo cargoAux:cargosForeignKey) {
				if(cargoAux.getId()!=null && cargoAux.getId().equals(idCargoSeleccionado)) {
					cargoTemp=cargoAux;
					break;
				}
			}

			if(cargoTemp!=null) {
				jComboBoxid_cargoCreditosPendientesGenerico.setSelectedItem(cargoTemp);
			} else {
				if(jComboBoxid_cargoCreditosPendientesGenerico!=null && jComboBoxid_cargoCreditosPendientesGenerico.getItemCount()>0) {
					jComboBoxid_cargoCreditosPendientesGenerico.setSelectedIndex(0);
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

					if(this.creditospendientes!=null) {
						this.creditospendientes.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
						this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_estructuraCreditosPendientes.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraCreditosPendientes.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
						if(this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_estructuraCreditosPendientes.getItemCount()>0) {
							this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_estructuraCreditosPendientes.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCreditosPendientes") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraBusquedaCreditosPendientesCreditosPendientes!=null) {
						jComboBoxid_estructuraBusquedaCreditosPendientesCreditosPendientes.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraBusquedaCreditosPendientesCreditosPendientes!=null) {
							//jComboBoxid_estructuraBusquedaCreditosPendientesCreditosPendientes.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraBusquedaCreditosPendientesCreditosPendientes.getItemCount()>0) {
								jComboBoxid_estructuraBusquedaCreditosPendientesCreditosPendientes.setSelectedIndex(0);
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
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraCreditosPendientesGenerico)throws Exception
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
				jComboBoxid_estructuraCreditosPendientesGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraCreditosPendientesGenerico!=null && jComboBoxid_estructuraCreditosPendientesGenerico.getItemCount()>0) {
					jComboBoxid_estructuraCreditosPendientesGenerico.setSelectedIndex(0);
				}
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

					if(this.creditospendientes!=null) {
						this.creditospendientes.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
						this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empresaCreditosPendientes.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCreditosPendientes.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
						if(this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empresaCreditosPendientes.getItemCount()>0) {
							this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empresaCreditosPendientes.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCreditosPendientesGenerico)throws Exception
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
				jComboBoxid_empresaCreditosPendientesGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCreditosPendientesGenerico!=null && jComboBoxid_empresaCreditosPendientesGenerico.getItemCount()>0) {
					jComboBoxid_empresaCreditosPendientesGenerico.setSelectedIndex(0);
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

					if(this.creditospendientes!=null) {
						this.creditospendientes.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
						this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empleadoCreditosPendientes.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoCreditosPendientes.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
						if(this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empleadoCreditosPendientes.getItemCount()>0) {
							this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empleadoCreditosPendientes.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCreditosPendientes") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoBusquedaCreditosPendientesCreditosPendientes!=null) {
						jComboBoxid_empleadoBusquedaCreditosPendientesCreditosPendientes.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoBusquedaCreditosPendientesCreditosPendientes!=null) {
							//jComboBoxid_empleadoBusquedaCreditosPendientesCreditosPendientes.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoBusquedaCreditosPendientesCreditosPendientes.getItemCount()>0) {
								jComboBoxid_empleadoBusquedaCreditosPendientesCreditosPendientes.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoCreditosPendientesGenerico)throws Exception
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
				jComboBoxid_empleadoCreditosPendientesGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoCreditosPendientesGenerico!=null && jComboBoxid_empleadoCreditosPendientesGenerico.getItemCount()>0) {
					jComboBoxid_empleadoCreditosPendientesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCargoForeignKey(CreditosPendientes creditospendientes,JComboBox jComboBoxid_cargoCreditosPendientesGenerico)throws Exception
	{
		try
		{
			Cargo  cargoAux=new Cargo();

			if(jComboBoxid_cargoCreditosPendientesGenerico==null) {
				cargoAux=(Cargo)this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_cargoCreditosPendientes.getSelectedItem();
			} else {
				cargoAux=(Cargo)jComboBoxid_cargoCreditosPendientesGenerico.getSelectedItem();
			}

			if(cargoAux!=null && cargoAux.getId()!=null) {
				creditospendientes.setid_cargo(cargoAux.getId());
				creditospendientes.setcargo_descripcion(CreditosPendientesConstantesFunciones.getCargoDescripcion(cargoAux));
				creditospendientes.setCargo(cargoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(CreditosPendientes creditospendientes,JComboBox jComboBoxid_estructuraCreditosPendientesGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraCreditosPendientesGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_estructuraCreditosPendientes.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraCreditosPendientesGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				creditospendientes.setid_estructura(estructuraAux.getId());
				creditospendientes.setestructura_descripcion(CreditosPendientesConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				creditospendientes.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CreditosPendientes creditospendientes,JComboBox jComboBoxid_empresaCreditosPendientesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCreditosPendientesGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empresaCreditosPendientes.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCreditosPendientesGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				creditospendientes.setid_empresa(empresaAux.getId());
				creditospendientes.setempresa_descripcion(CreditosPendientesConstantesFunciones.getEmpresaDescripcion(empresaAux));
				creditospendientes.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(CreditosPendientes creditospendientes,JComboBox jComboBoxid_empleadoCreditosPendientesGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoCreditosPendientesGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empleadoCreditosPendientes.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoCreditosPendientesGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				creditospendientes.setid_empleado(empleadoAux.getId());
				creditospendientes.setempleado_descripcion(CreditosPendientesConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				creditospendientes.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCargosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCargo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { 
							this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_cargoCreditosPendientes.removeAllItems();

							for(Cargo cargo:this.cargosForeignKey) {
								this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_cargoCreditosPendientes.addItem(cargo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { 
					}

					if(!CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCreditosPendientes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cargoBusquedaCreditosPendientesCreditosPendientes.removeAllItems();

							for(Cargo cargo:this.cargosForeignKey) {
								this.jComboBoxid_cargoBusquedaCreditosPendientesCreditosPendientes.addItem(cargo);
							}
						}

						if(!CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { 
							this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_estructuraCreditosPendientes.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_estructuraCreditosPendientes.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { 
					}

					if(!CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCreditosPendientes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraBusquedaCreditosPendientesCreditosPendientes.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraBusquedaCreditosPendientesCreditosPendientes.addItem(estructura);
							}
						}

						if(!CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { 
							this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empresaCreditosPendientes.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empresaCreditosPendientes.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { 
					}

					if(!CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { 
							this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empleadoCreditosPendientes.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empleadoCreditosPendientes.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { 
					}

					if(!CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCreditosPendientes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoBusquedaCreditosPendientesCreditosPendientes.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoBusquedaCreditosPendientesCreditosPendientes.addItem(empleado);
							}
						}

						if(!CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameCargoForeignKey(Cargo cargo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
							this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_cargoCreditosPendientes.setSelectedItem(cargo);
						}
					} else {
						if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
							this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_cargoCreditosPendientes.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cargoBusquedaCreditosPendientesCreditosPendientes.setSelectedItem(cargo);
						} else {
							this.jComboBoxid_cargoBusquedaCreditosPendientesCreditosPendientes.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
							this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_estructuraCreditosPendientes.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
							this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_estructuraCreditosPendientes.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraBusquedaCreditosPendientesCreditosPendientes.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraBusquedaCreditosPendientesCreditosPendientes.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
							this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empresaCreditosPendientes.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
							this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empresaCreditosPendientes.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
							this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empleadoCreditosPendientes.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
							this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empleadoCreditosPendientes.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoBusquedaCreditosPendientesCreditosPendientes.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoBusquedaCreditosPendientesCreditosPendientes.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCreditosPendientes() throws Exception {
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
		
	public CreditosPendientesParameterReturnGeneral getCreditosPendientesParameterGeneral() {
		return this.creditospendientesParameterGeneral;
	}
	
	public void setCreditosPendientesParameterGeneral(CreditosPendientesParameterReturnGeneral creditospendientesParameterGeneral) {
		this.creditospendientesParameterGeneral = creditospendientesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCreditosPendientes() {
		return isPermisoTodoCreditosPendientes;
	}

	public void setIsPermisoTodoCreditosPendientes(Boolean isPermisoTodoCreditosPendientes) {
		this.isPermisoTodoCreditosPendientes = isPermisoTodoCreditosPendientes;
	}

	public Boolean getIsPermisoNuevoCreditosPendientes() {
		return isPermisoNuevoCreditosPendientes;
	}

	public void setIsPermisoNuevoCreditosPendientes(Boolean isPermisoNuevoCreditosPendientes) {
		this.isPermisoNuevoCreditosPendientes = isPermisoNuevoCreditosPendientes;
	}

	public Boolean getIsPermisoActualizarCreditosPendientes() {
		return isPermisoActualizarCreditosPendientes;
	}

	public void setIsPermisoActualizarCreditosPendientes(Boolean isPermisoActualizarCreditosPendientes) {
		this.isPermisoActualizarCreditosPendientes = isPermisoActualizarCreditosPendientes;
	}

	public Boolean getIsPermisoEliminarCreditosPendientes() {
		return isPermisoEliminarCreditosPendientes;
	}

	public void setIsPermisoEliminarCreditosPendientes(Boolean isPermisoEliminarCreditosPendientes) {
		this.isPermisoEliminarCreditosPendientes = isPermisoEliminarCreditosPendientes;
	}

	public Boolean getIsPermisoGuardarCambiosCreditosPendientes() {
		return isPermisoGuardarCambiosCreditosPendientes;
	}

	public void setIsPermisoGuardarCambiosCreditosPendientes(Boolean isPermisoGuardarCambiosCreditosPendientes) {
		this.isPermisoGuardarCambiosCreditosPendientes = isPermisoGuardarCambiosCreditosPendientes;
	}
	
	public Boolean getIsPermisoConsultaCreditosPendientes() {
		return isPermisoConsultaCreditosPendientes;
	}

	public void setIsPermisoConsultaCreditosPendientes(Boolean isPermisoConsultaCreditosPendientes) {
		this.isPermisoConsultaCreditosPendientes = isPermisoConsultaCreditosPendientes;
	}

	public Boolean getIsPermisoBusquedaCreditosPendientes() {
		return isPermisoBusquedaCreditosPendientes;
	}

	public void setIsPermisoBusquedaCreditosPendientes(Boolean isPermisoBusquedaCreditosPendientes) {
		this.isPermisoBusquedaCreditosPendientes = isPermisoBusquedaCreditosPendientes;
	}

	public Boolean getIsPermisoReporteCreditosPendientes() {
		return isPermisoReporteCreditosPendientes;
	}

	public void setIsPermisoReporteCreditosPendientes(Boolean isPermisoReporteCreditosPendientes) {
		this.isPermisoReporteCreditosPendientes = isPermisoReporteCreditosPendientes;
	}
	
	public Boolean getIsPermisoPaginacionMedioCreditosPendientes() {
		return isPermisoPaginacionMedioCreditosPendientes;
	}

	public void setIsPermisoPaginacionMedioCreditosPendientes(Boolean isPermisoPaginacionMedioCreditosPendientes) {
		this.isPermisoPaginacionMedioCreditosPendientes = isPermisoPaginacionMedioCreditosPendientes;
	}
	
	public Boolean getIsPermisoPaginacionTodoCreditosPendientes() {
		return isPermisoPaginacionTodoCreditosPendientes;
	}

	public void setIsPermisoPaginacionTodoCreditosPendientes(Boolean isPermisoPaginacionTodoCreditosPendientes) {
		this.isPermisoPaginacionTodoCreditosPendientes = isPermisoPaginacionTodoCreditosPendientes;
	}
	
	public Boolean getIsPermisoPaginacionAltoCreditosPendientes() {
		return isPermisoPaginacionAltoCreditosPendientes;
	}

	public void setIsPermisoPaginacionAltoCreditosPendientes(Boolean isPermisoPaginacionAltoCreditosPendientes) {
		this.isPermisoPaginacionAltoCreditosPendientes = isPermisoPaginacionAltoCreditosPendientes;
	}
	
	public Boolean getIsPermisoCopiarCreditosPendientes() {
		return isPermisoCopiarCreditosPendientes;
	}

	public void setIsPermisoCopiarCreditosPendientes(Boolean isPermisoCopiarCreditosPendientes) {
		this.isPermisoCopiarCreditosPendientes = isPermisoCopiarCreditosPendientes;
	}
	
	public Boolean getIsPermisoVerFormCreditosPendientes() {
		return isPermisoVerFormCreditosPendientes;
	}

	public void setIsPermisoVerFormCreditosPendientes(Boolean isPermisoVerFormCreditosPendientes) {
		this.isPermisoVerFormCreditosPendientes = isPermisoVerFormCreditosPendientes;
	}
	
	public Boolean getIsPermisoDuplicarCreditosPendientes() {
		return isPermisoDuplicarCreditosPendientes;
	}

	public void setIsPermisoDuplicarCreditosPendientes(Boolean isPermisoDuplicarCreditosPendientes) {
		this.isPermisoDuplicarCreditosPendientes = isPermisoDuplicarCreditosPendientes;
	}
	
	public Boolean getIsPermisoOrdenCreditosPendientes() {
		return isPermisoOrdenCreditosPendientes;
	}

	public void setIsPermisoOrdenCreditosPendientes(Boolean isPermisoOrdenCreditosPendientes) {
		this.isPermisoOrdenCreditosPendientes = isPermisoOrdenCreditosPendientes;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCreditosPendientes() {
		return isVisibilidadCeldaNuevoCreditosPendientes;
	}

	public void setIsVisibilidadCeldaNuevoCreditosPendientes(Boolean isVisibilidadCeldaNuevoCreditosPendientes) {
		this.isVisibilidadCeldaNuevoCreditosPendientes = isVisibilidadCeldaNuevoCreditosPendientes;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCreditosPendientes() {
		return isVisibilidadCeldaDuplicarCreditosPendientes;
	}

	public void setIsVisibilidadCeldaDuplicarCreditosPendientes(Boolean isVisibilidadCeldaDuplicarCreditosPendientes) {
		this.isVisibilidadCeldaDuplicarCreditosPendientes = isVisibilidadCeldaDuplicarCreditosPendientes;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCreditosPendientes() {
		return isVisibilidadCeldaCopiarCreditosPendientes;
	}

	public void setIsVisibilidadCeldaCopiarCreditosPendientes(Boolean isVisibilidadCeldaCopiarCreditosPendientes) {
		this.isVisibilidadCeldaCopiarCreditosPendientes = isVisibilidadCeldaCopiarCreditosPendientes;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCreditosPendientes() {
		return isVisibilidadCeldaVerFormCreditosPendientes;
	}

	public void setIsVisibilidadCeldaVerFormCreditosPendientes(Boolean isVisibilidadCeldaVerFormCreditosPendientes) {
		this.isVisibilidadCeldaVerFormCreditosPendientes = isVisibilidadCeldaVerFormCreditosPendientes;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCreditosPendientes() {
		return isVisibilidadCeldaOrdenCreditosPendientes;
	}

	public void setIsVisibilidadCeldaOrdenCreditosPendientes(Boolean isVisibilidadCeldaOrdenCreditosPendientes) {
		this.isVisibilidadCeldaOrdenCreditosPendientes = isVisibilidadCeldaOrdenCreditosPendientes;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCreditosPendientes() {
		return isVisibilidadCeldaNuevoRelacionesCreditosPendientes;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCreditosPendientes(Boolean isVisibilidadCeldaNuevoRelacionesCreditosPendientes) {
		this.isVisibilidadCeldaNuevoRelacionesCreditosPendientes = isVisibilidadCeldaNuevoRelacionesCreditosPendientes;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCreditosPendientes() {
		return isVisibilidadCeldaModificarCreditosPendientes;
	}

	public void setIsVisibilidadCeldaModificarCreditosPendientes(Boolean isVisibilidadCeldaModificarCreditosPendientes) {
		this.isVisibilidadCeldaModificarCreditosPendientes = isVisibilidadCeldaModificarCreditosPendientes;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCreditosPendientes() {
		return isVisibilidadCeldaActualizarCreditosPendientes;
	}

	public void setIsVisibilidadCeldaActualizarCreditosPendientes(Boolean isVisibilidadCeldaActualizarCreditosPendientes) {
		this.isVisibilidadCeldaActualizarCreditosPendientes = isVisibilidadCeldaActualizarCreditosPendientes;
	}

	public Boolean getIsVisibilidadCeldaEliminarCreditosPendientes() {
		return isVisibilidadCeldaEliminarCreditosPendientes;
	}

	public void setIsVisibilidadCeldaEliminarCreditosPendientes(Boolean isVisibilidadCeldaEliminarCreditosPendientes) {
		this.isVisibilidadCeldaEliminarCreditosPendientes = isVisibilidadCeldaEliminarCreditosPendientes;
	}

	public Boolean getIsVisibilidadCeldaCancelarCreditosPendientes() {
		return isVisibilidadCeldaCancelarCreditosPendientes;
	}

	public void setIsVisibilidadCeldaCancelarCreditosPendientes(Boolean isVisibilidadCeldaCancelarCreditosPendientes) {
		this.isVisibilidadCeldaCancelarCreditosPendientes = isVisibilidadCeldaCancelarCreditosPendientes;
	}

	public Boolean getIsVisibilidadCeldaGuardarCreditosPendientes() {
		return isVisibilidadCeldaGuardarCreditosPendientes;
	}

	public void setIsVisibilidadCeldaGuardarCreditosPendientes(Boolean isVisibilidadCeldaGuardarCreditosPendientes) {
		this.isVisibilidadCeldaGuardarCreditosPendientes = isVisibilidadCeldaGuardarCreditosPendientes;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCreditosPendientes() {
		return isVisibilidadCeldaGuardarCambiosCreditosPendientes;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCreditosPendientes(Boolean isVisibilidadCeldaGuardarCambiosCreditosPendientes) {
		this.isVisibilidadCeldaGuardarCambiosCreditosPendientes = isVisibilidadCeldaGuardarCambiosCreditosPendientes;
	}
		
	public CreditosPendientesSessionBean getcreditospendientesSessionBean() {
		return this.creditospendientesSessionBean;
	}
	
	public void setcreditospendientesSessionBean(CreditosPendientesSessionBean creditospendientesSessionBean) {
		this.creditospendientesSessionBean=creditospendientesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaCreditosPendientes() {
		return this.isVisibilidadBusquedaCreditosPendientes;
	}

	public void setisVisibilidadBusquedaCreditosPendientes(Boolean isVisibilidadBusquedaCreditosPendientes) {
		this.isVisibilidadBusquedaCreditosPendientes=isVisibilidadBusquedaCreditosPendientes;
	}

	public Boolean getisVisibilidadFK_IdCargo() {
		return this.isVisibilidadFK_IdCargo;
	}

	public void setisVisibilidadFK_IdCargo(Boolean isVisibilidadFK_IdCargo) {
		this.isVisibilidadFK_IdCargo=isVisibilidadFK_IdCargo;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(CreditosPendientes creditospendientes)throws Exception {
		try {
			
				this.setActualParaGuardarCargoForeignKey(creditospendientes,null);
				this.setActualParaGuardarEstructuraForeignKey(creditospendientes,null);
				this.setActualParaGuardarEmpresaForeignKey(creditospendientes,null);
				this.setActualParaGuardarEmpleadoForeignKey(creditospendientes,null);
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
	
	public void bugActualizarReferenciaActual(CreditosPendientes creditospendientes,CreditosPendientes creditospendientesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCreditosPendientes(creditospendientes);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		creditospendientesAux.setId(creditospendientes.getId());
		creditospendientesAux.setVersionRow(creditospendientes.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(CreditosPendientes creditospendientesLocal) throws Exception {
		
		if(this.creditospendientesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CreditosPendientes creditospendientesLocal) throws Exception {	
		if(this.creditospendientesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(CargoDetalleFormJInternalFrame.class)) {
				CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrameLocal=(CargoBeanSwingJInternalFrame) ((CargoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cargoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCargo(cargoBeanSwingJInternalFrameLocal.getcargo(),true);
				cargoBeanSwingJInternalFrameLocal.actualizarLista(cargoBeanSwingJInternalFrameLocal.cargo,this.cargosForeignKey);

				cargoBeanSwingJInternalFrameLocal.actualizarRelaciones(cargoBeanSwingJInternalFrameLocal.cargo);

				creditospendientesLocal.setCargo(cargoBeanSwingJInternalFrameLocal.cargo);

				this.addItemDefectoCombosForeignKeyCargo();
				this.cargarCombosFrameCargosForeignKey("Formulario");
				this.setActualCargoForeignKey(cargoBeanSwingJInternalFrameLocal.cargo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				creditospendientesLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				creditospendientesLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				creditospendientesLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCreditosPendientesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = creditospendientesValidator.getInvalidValues(this.creditospendientes);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CreditosPendientes creditospendientes,List<CreditosPendientes> creditospendientess) throws Exception {
	}		
	
	public void actualizarSelectedLista(CreditosPendientes creditospendientes,List<CreditosPendientes> creditospendientess) throws Exception {
		try	{			
			CreditosPendientesConstantesFunciones.actualizarSelectedLista(creditospendientes,creditospendientess);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CreditosPendientes> creditospendientessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				creditospendientessLocal=this.creditospendientesLogic.getCreditosPendientess();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				creditospendientessLocal=this.creditospendientess;
			}
			//ARCHITECTURE
		
			for(CreditosPendientes creditospendientesLocal:creditospendientessLocal) {
				if(this.permiteMantenimiento(creditospendientesLocal) && creditospendientesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CreditosPendientesConstantesFunciones.getCreditosPendientesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CreditosPendientesConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosPendientes.jLabelcodigoCreditosPendientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CreditosPendientesConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosPendientes.jLabelnombre_completoCreditosPendientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CreditosPendientesConstantesFunciones.CODIGOTIPOPRESTAMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosPendientes.jLabelcodigo_tipo_prestamoCreditosPendientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CreditosPendientesConstantesFunciones.CODIGOPRESTAMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosPendientes.jLabelcodigo_prestamoCreditosPendientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CreditosPendientesConstantesFunciones.NUMERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosPendientes.jLabelnumeroCreditosPendientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CreditosPendientesConstantesFunciones.MONTOCAPITAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosPendientes.jLabelmonto_capitalCreditosPendientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CreditosPendientesConstantesFunciones.MONTOINTERES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosPendientes.jLabelmonto_interesCreditosPendientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CreditosPendientesConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosPendientes.jLabelvalorCreditosPendientes,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CreditosPendientesConstantesFunciones.SALDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosPendientes.jLabelsaldoCreditosPendientes,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCreditosPendientes.jLabelcodigoCreditosPendientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCreditosPendientes.jLabelnombre_completoCreditosPendientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCreditosPendientes.jLabelcodigo_tipo_prestamoCreditosPendientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCreditosPendientes.jLabelcodigo_prestamoCreditosPendientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCreditosPendientes.jLabelnumeroCreditosPendientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCreditosPendientes.jLabelmonto_capitalCreditosPendientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCreditosPendientes.jLabelmonto_interesCreditosPendientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCreditosPendientes.jLabelvalorCreditosPendientes,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCreditosPendientes.jLabelsaldoCreditosPendientes,"");
		
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
		this.iIdNuevoCreditosPendientes--;	
		
		
		this.creditospendientesAux=new CreditosPendientes();
		
		this.creditospendientesAux.setId(this.iIdNuevoCreditosPendientes);
		this.creditospendientesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.creditospendientesLogic.getCreditosPendientess().add(this.creditospendientesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.creditospendientess.add(this.creditospendientesAux);
		}
		//ARCHITECTURE
		
		this.creditospendientes=this.creditospendientesAux;
		
		if(CreditosPendientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCreditosPendientes(this.creditospendientes);
			this.setVariablesObjetoActualToFormularioForeignKeyCreditosPendientes(this.creditospendientes);
		}
				
		//this.setDefaultControlesCreditosPendientes();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCreditosPendientes();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCreditosPendientes();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCreditosPendientes();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCreditosPendientes(this.creditospendientesBean,this.creditospendientes,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCreditosPendientes(this.creditospendientesReturnGeneral,this.creditospendientesBean,false);
		
		if(this.creditospendientesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCreditosPendientes(this.creditospendientesReturnGeneral.getCreditosPendientes());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCreditosPendientes(this.creditospendientesReturnGeneral.getCreditosPendientes());
		}
		
		if(this.creditospendientesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCreditosPendientes(this.creditospendientesReturnGeneral.getCreditosPendientes(),classes);//this.creditospendientesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCreditosPendientes(this.creditospendientes,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCreditosPendientes();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCreditosPendientes();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CreditosPendientesBeanSwingJInternalFrameAdditional.RecargarFormCreditosPendientes(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCreditosPendientes(false);
						
			if(creditospendientesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCreditosPendientes();
			}
			
			this.actualizarVisualTableDatosCreditosPendientes();
			
			this.jTableDatosCreditosPendientes.setRowSelectionInterval(this.getIndiceNuevoCreditosPendientes(), this.getIndiceNuevoCreditosPendientes());
			
			this.seleccionarFilaTablaCreditosPendientesActual();
						
			this.actualizarEstadoCeldasBotonesCreditosPendientes("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCreditosPendientes(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCreditosPendientes.jDateChooserfecha_vencimiento_desdeCreditosPendientes.setEnabled(isHabilitar && this.creditospendientesConstantesFunciones.activarfecha_vencimiento_desdeCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jDateChooserfecha_vencimiento_hastaCreditosPendientes.setEnabled(isHabilitar && this.creditospendientesConstantesFunciones.activarfecha_vencimiento_hastaCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigoCreditosPendientes.setEnabled(isHabilitar && this.creditospendientesConstantesFunciones.activarcodigoCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jTextAreanombre_completoCreditosPendientes.setEnabled(isHabilitar && this.creditospendientesConstantesFunciones.activarnombre_completoCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigo_tipo_prestamoCreditosPendientes.setEnabled(isHabilitar && this.creditospendientesConstantesFunciones.activarcodigo_tipo_prestamoCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigo_prestamoCreditosPendientes.setEnabled(isHabilitar && this.creditospendientesConstantesFunciones.activarcodigo_prestamoCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldnumeroCreditosPendientes.setEnabled(isHabilitar && this.creditospendientesConstantesFunciones.activarnumeroCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldmonto_capitalCreditosPendientes.setEnabled(isHabilitar && this.creditospendientesConstantesFunciones.activarmonto_capitalCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldmonto_interesCreditosPendientes.setEnabled(isHabilitar && this.creditospendientesConstantesFunciones.activarmonto_interesCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldvalorCreditosPendientes.setEnabled(isHabilitar && this.creditospendientesConstantesFunciones.activarvalorCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldsaldoCreditosPendientes.setEnabled(isHabilitar && this.creditospendientesConstantesFunciones.activarsaldoCreditosPendientes);	
		
		this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_cargoCreditosPendientes.setEnabled(isHabilitar && this.creditospendientesConstantesFunciones.activarid_cargoCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_estructuraCreditosPendientes.setEnabled(isHabilitar && this.creditospendientesConstantesFunciones.activarid_estructuraCreditosPendientes);//
		this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empresaCreditosPendientes.setEnabled(isHabilitar && this.creditospendientesConstantesFunciones.activarid_empresaCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empleadoCreditosPendientes.setEnabled(isHabilitar && this.creditospendientesConstantesFunciones.activarid_empleadoCreditosPendientes);
	};
	
	public void setDefaultControlesCreditosPendientes() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCreditosPendientes(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.creditospendientesSessionBean.setConGuardarRelaciones(true);			
			this.creditospendientesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCreditosPendientes.jTabbedPaneRelacionesCreditosPendientes.setVisible(true);
			
					
		} else {
			//this.creditospendientesSessionBean.setConGuardarRelaciones(false);			
			this.creditospendientesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCreditosPendientes.jTabbedPaneRelacionesCreditosPendientes.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCreditosPendientes() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CreditosPendientes creditospendientesAux:this.creditospendientesLogic.getCreditosPendientess()) {
				if(creditospendientesAux.getId().equals(this.iIdNuevoCreditosPendientes)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CreditosPendientes creditospendientesAux:this.creditospendientess) {
				if(creditospendientesAux.getId().equals(this.iIdNuevoCreditosPendientes)) {
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
	
	public int getIndiceActualCreditosPendientes(CreditosPendientes creditospendientes,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CreditosPendientes creditospendientesAux:this.creditospendientesLogic.getCreditosPendientess()) {
				if(creditospendientesAux.getId().equals(creditospendientes.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CreditosPendientes creditospendientesAux:this.creditospendientess) {
				if(creditospendientesAux.getId().equals(creditospendientes.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCreditosPendientes(CreditosPendientes creditospendientesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CreditosPendientes creditospendientesAux:this.creditospendientesLogic.getCreditosPendientess()) {
				if(creditospendientesAux.getCreditosPendientesOriginal().getId().equals(creditospendientesOriginal.getId())) {
					existe=true;
					creditospendientesOriginal.setId(creditospendientesAux.getId());
					creditospendientesOriginal.setVersionRow(creditospendientesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CreditosPendientes creditospendientesAux:this.creditospendientess) {
				if(creditospendientesAux.getCreditosPendientesOriginal().getId().equals(creditospendientesOriginal.getId())) {
					existe=true;
					creditospendientesOriginal.setId(creditospendientesAux.getId());
					creditospendientesOriginal.setVersionRow(creditospendientesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCreditosPendientes(Boolean esParaCancelar) throws Exception {
		creditospendientessAux=new ArrayList<CreditosPendientes>();
		creditospendientesAux=new CreditosPendientes();
		
		if(!this.creditospendientesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CreditosPendientes creditospendientesAux:this.creditospendientesLogic.getCreditosPendientess()) {
					if(creditospendientesAux.getId()<0) {
						creditospendientessAux.add(creditospendientesAux);
					}		
				}
				this.iIdNuevoCreditosPendientes=0L;
				this.creditospendientesLogic.getCreditosPendientess().removeAll(creditospendientessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CreditosPendientes creditospendientesAux:this.creditospendientess) {
					if(creditospendientesAux.getId()<0) {
						creditospendientessAux.add(creditospendientesAux);
					}		
				}
				this.iIdNuevoCreditosPendientes=0L;
				this.creditospendientess.removeAll(creditospendientessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCreditosPendientes 
					&& this.creditospendientesLogic.getCreditosPendientess().size()>0
					) {
					creditospendientesAux=this.creditospendientesLogic.getCreditosPendientess().get(this.creditospendientesLogic.getCreditosPendientess().size() - 1);
				
					if(creditospendientesAux.getId()<0) {
						this.creditospendientesLogic.getCreditosPendientess().remove(creditospendientesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCreditosPendientes && this.creditospendientess.size()>0) {
					creditospendientesAux=this.creditospendientess.get(this.creditospendientess.size() - 1);
				
					if(creditospendientesAux.getId()<0) {
						this.creditospendientess.remove(creditospendientesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCreditosPendientes(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(creditospendientes.getId()<0) {
				this.creditospendientesLogic.getCreditosPendientess().remove(this.creditospendientes);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(creditospendientes.getId()<0) {
				this.creditospendientess.remove(this.creditospendientes);
			}
		}			
	}
	
	public void setEstadosInicialesCreditosPendientes(List<CreditosPendientes> creditospendientessAux) throws Exception {
		CreditosPendientesConstantesFunciones.setEstadosInicialesCreditosPendientes(creditospendientessAux);
	}
	
	public void setEstadosInicialesCreditosPendientes(CreditosPendientes creditospendientesAux) throws Exception {
		CreditosPendientesConstantesFunciones.setEstadosInicialesCreditosPendientes(creditospendientesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCreditosPendientesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCreditosPendientes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCreditosPendientesActual()) {
				if(!this.isEsNuevoCreditosPendientes) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCreditosPendientes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCreditosPendientes=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCreditosPendientesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Creditos Pendientes ?", "MANTENIMIENTO DE Creditos Pendientes", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCreditosPendientes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CreditosPendientes creditospendientes) throws Exception {
		CreditosPendientesConstantesFunciones.seleccionarAsignar(this.creditospendientes,creditospendientes);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCreditosPendientes=this.isPermisoActualizarOriginalCreditosPendientes;
			
			
			this.seleccionarAsignar(creditospendientes);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesCreditosPendientes("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.creditospendientesSessionBean.setsFuncionBusquedaRapida(this.creditospendientesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCreditosPendientes) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCreditosPendientes(esParaCancelar);				
				this.cancelarNuevoCreditosPendientes(esParaCancelar);								
			}
			
			this.creditospendientes=new CreditosPendientes();
			
			this.inicializarCreditosPendientes();
			
			this.actualizarEstadoCeldasBotonesCreditosPendientes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCreditosPendientes() throws Exception {
		try {
			CreditosPendientesConstantesFunciones.inicializarCreditosPendientes(this.creditospendientes);
			
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
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.creditospendientesLogic.getCreditosPendientess().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCreditosPendientess(String sAccionBusqueda,List<CreditosPendientes> creditospendientessParaReportes) throws Exception {
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
					sPathReporteFinal="CreditosPendientes"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CreditosPendientesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CreditosPendientesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CreditosPendientes"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Creditos Pendienteses");		
		parameters.put("busquedapor", CreditosPendientesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCreditosPendientes=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CreditosPendientesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CreditosPendientesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCreditosPendientes=new JRBeanArrayDataSource(CreditosPendientesJInternalFrame.TraerCreditosPendientesBeans(creditospendientessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCreditosPendientes);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CreditosPendientesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CreditosPendientesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CreditosPendientesBean.TraerCreditosPendientesBeans(creditospendientessParaReportes).toArray()));
							
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
				this.generarExcelReporteCreditosPendientess(sAccionBusqueda,sTipoArchivoReporte,creditospendientessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCreditosPendientess(sAccionBusqueda,sTipoArchivoReporte,creditospendientessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCreditosPendientesActionPerformed(null);
					//this.generarExcelReporteCreditosPendientess(sAccionBusqueda,sTipoArchivoReporte,creditospendientessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCreditosPendientess(sAccionBusqueda,sTipoArchivoReporte,creditospendientessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCreditosPendientess(sAccionBusqueda,sTipoArchivoReporte,creditospendientessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCreditosPendientess(sAccionBusqueda,sTipoArchivoReporte,creditospendientessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCreditosPendientess(String sAccionBusqueda,String sTipoArchivoReporte,List<CreditosPendientes> creditospendientessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"creditospendientes";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CreditosPendientess");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCreditosPendientes("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CreditosPendientes creditospendientes : creditospendientessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CreditosPendientesConstantesFunciones.generarExcelReporteDataCreditosPendientes("NORMAL",row,workbook,creditospendientes,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.creditospendientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Creditos Pendientes",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCreditosPendientes(String sTipo,Row row,Workbook workbook) {
		
		CreditosPendientesConstantesFunciones.generarExcelReporteHeaderCreditosPendientes(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCreditosPendientess(String sAccionBusqueda,String sTipoArchivoReporte,List<CreditosPendientes> creditospendientessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"creditospendientes_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CreditosPendientess");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CreditosPendientes creditospendientes : creditospendientessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CreditosPendientesConstantesFunciones.getCreditosPendientesDescripcion(creditospendientes));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosPendientesConstantesFunciones.LABEL_IDCARGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_IDCARGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditospendientes.getcargo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosPendientesConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditospendientes.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosPendientesConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditospendientes.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosPendientesConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditospendientes.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosPendientesConstantesFunciones.LABEL_FECHAVENCIMIENTODESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_FECHAVENCIMIENTODESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditospendientes.getfecha_vencimiento_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosPendientesConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditospendientes.getfecha_vencimiento_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosPendientesConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditospendientes.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosPendientesConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditospendientes.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosPendientesConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditospendientes.getcodigo_tipo_prestamo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosPendientesConstantesFunciones.LABEL_CODIGOPRESTAMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_CODIGOPRESTAMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditospendientes.getcodigo_prestamo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosPendientesConstantesFunciones.LABEL_NUMERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_NUMERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditospendientes.getnumero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosPendientesConstantesFunciones.LABEL_MONTOCAPITAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_MONTOCAPITAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditospendientes.getmonto_capital());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosPendientesConstantesFunciones.LABEL_MONTOINTERES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_MONTOINTERES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditospendientes.getmonto_interes());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosPendientesConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditospendientes.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CreditosPendientesConstantesFunciones.LABEL_SALDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_SALDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(creditospendientes.getsaldo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.creditospendientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Creditos Pendientes",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCreditosPendientess(String sAccionBusqueda,String sTipoArchivoReporte,List<CreditosPendientes> creditospendientessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CreditosPendientes> creditospendientessRespaldo=null;
		
		classes=CreditosPendientesConstantesFunciones.getClassesRelationshipsOfCreditosPendientes(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.creditospendientesLogic.setDatosCliente(this.datosCliente);
		this.creditospendientesLogic.setDatosDeep(this.datosDeep);
		this.creditospendientesLogic.setIsConDeep(true);
		
		creditospendientessRespaldo=this.creditospendientesLogic.getCreditosPendientess();
		
		this.creditospendientesLogic.setCreditosPendientess(creditospendientessParaReportes);	
		this.creditospendientesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		creditospendientessParaReportes=this.creditospendientesLogic.getCreditosPendientess();
		this.creditospendientesLogic.setCreditosPendientess(creditospendientessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"creditospendientes_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CreditosPendientess");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCreditosPendientes("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CreditosPendientes creditospendientes : creditospendientessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCreditosPendientes("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CreditosPendientesConstantesFunciones.generarExcelReporteDataCreditosPendientes("NORMAL",row,workbook,creditospendientes,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CreditosPendientesConstantesFunciones.getCreditosPendientesDescripcion(creditospendientes));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.creditospendientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Creditos Pendientes",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCreditosPendientes.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCreditosPendientes.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCreditosPendientes.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCreditosPendientes.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCreditosPendientes() throws Exception {		
		this.startProcessCreditosPendientes(true);
	}
	
	public void startProcessCreditosPendientes(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCreditosPendientes ,this.jPanelParametrosReportesCreditosPendientes, this.jScrollPanelDatosCreditosPendientes,this.jPanelPaginacionCreditosPendientes, this.jScrollPanelDatosEdicionCreditosPendientes, this.jPanelAccionesCreditosPendientes,this.jPanelAccionesFormularioCreditosPendientes,this.jmenuBarCreditosPendientes,this.jmenuBarDetalleCreditosPendientes,this.jTtoolBarCreditosPendientes,this.jTtoolBarDetalleCreditosPendientes);		
		
		final JTabbedPane jTabbedPaneBusquedasCreditosPendientes=this.jTabbedPaneBusquedasCreditosPendientes; 
		
		final JPanel jPanelParametrosReportesCreditosPendientes=this.jPanelParametrosReportesCreditosPendientes;
		//final JScrollPane jScrollPanelDatosCreditosPendientes=this.jScrollPanelDatosCreditosPendientes;
		final JTable jTableDatosCreditosPendientes=this.jTableDatosCreditosPendientes;		
		final JPanel jPanelPaginacionCreditosPendientes=this.jPanelPaginacionCreditosPendientes;
		//final JScrollPane jScrollPanelDatosEdicionCreditosPendientes=this.jScrollPanelDatosEdicionCreditosPendientes;
		final JPanel jPanelAccionesCreditosPendientes=this.jPanelAccionesCreditosPendientes;
		
		JPanel jPanelCamposAuxiliarCreditosPendientes=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCreditosPendientes=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
			jPanelCamposAuxiliarCreditosPendientes=this.jInternalFrameDetalleFormCreditosPendientes.jPanelCamposCreditosPendientes;
			jPanelAccionesFormularioAuxiliarCreditosPendientes=this.jInternalFrameDetalleFormCreditosPendientes.jPanelAccionesFormularioCreditosPendientes;
		}
		
		final JPanel jPanelCamposCreditosPendientes=jPanelCamposAuxiliarCreditosPendientes;
		final JPanel jPanelAccionesFormularioCreditosPendientes=jPanelAccionesFormularioAuxiliarCreditosPendientes;
		
		
		final JMenuBar jmenuBarCreditosPendientes=this.jmenuBarCreditosPendientes;
		final JToolBar jTtoolBarCreditosPendientes=this.jTtoolBarCreditosPendientes;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCreditosPendientes=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCreditosPendientes=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
			jmenuBarDetalleAuxiliarCreditosPendientes=this.jInternalFrameDetalleFormCreditosPendientes.jmenuBarDetalleCreditosPendientes;
			jTtoolBarDetalleAuxiliarCreditosPendientes=this.jInternalFrameDetalleFormCreditosPendientes.jTtoolBarDetalleCreditosPendientes;
		}
		
		final JMenuBar jmenuBarDetalleCreditosPendientes=jmenuBarDetalleAuxiliarCreditosPendientes;
		final JToolBar jTtoolBarDetalleCreditosPendientes=jTtoolBarDetalleAuxiliarCreditosPendientes;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCreditosPendientes;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCreditosPendientes;
			processRunnable.jTableDatos=jTableDatosCreditosPendientes;
			processRunnable.jPanelCampos=jPanelCamposCreditosPendientes;
			processRunnable.jPanelPaginacion=jPanelPaginacionCreditosPendientes;
			processRunnable.jPanelAcciones=jPanelAccionesCreditosPendientes;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCreditosPendientes;
			
			
			processRunnable.jmenuBar=jmenuBarCreditosPendientes;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCreditosPendientes;
			processRunnable.jTtoolBar=jTtoolBarCreditosPendientes;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCreditosPendientes;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCreditosPendientes ,jPanelParametrosReportesCreditosPendientes,jTableDatosCreditosPendientes, /*jScrollPanelDatosCreditosPendientes,*/jPanelCamposCreditosPendientes,jPanelPaginacionCreditosPendientes, /*jScrollPanelDatosEdicionCreditosPendientes,*/ jPanelAccionesCreditosPendientes,jPanelAccionesFormularioCreditosPendientes,jmenuBarCreditosPendientes,jmenuBarDetalleCreditosPendientes,jTtoolBarCreditosPendientes,jTtoolBarDetalleCreditosPendientes);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCreditosPendientes ,jPanelParametrosReportesCreditosPendientes, jScrollPanelDatosCreditosPendientes,jPanelPaginacionCreditosPendientes, jScrollPanelDatosEdicionCreditosPendientes, jPanelAccionesCreditosPendientes,jPanelAccionesFormularioCreditosPendientes,jmenuBarCreditosPendientes,jmenuBarDetalleCreditosPendientes,jTtoolBarCreditosPendientes,jTtoolBarDetalleCreditosPendientes);
						
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
	
	public void finishProcessCreditosPendientes() {// throws Exception 
		this.finishProcessCreditosPendientes(true);
	}
	
	public void finishProcessCreditosPendientes(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCreditosPendientes ,this.jPanelParametrosReportesCreditosPendientes, this.jScrollPanelDatosCreditosPendientes,this.jPanelPaginacionCreditosPendientes, this.jScrollPanelDatosEdicionCreditosPendientes, this.jPanelAccionesCreditosPendientes,this.jPanelAccionesFormularioCreditosPendientes,this.jmenuBarCreditosPendientes,this.jmenuBarDetalleCreditosPendientes,this.jTtoolBarCreditosPendientes,this.jTtoolBarDetalleCreditosPendientes);		
		
		final JTabbedPane jTabbedPaneBusquedasCreditosPendientes=this.jTabbedPaneBusquedasCreditosPendientes; 
		
		final JPanel jPanelParametrosReportesCreditosPendientes=this.jPanelParametrosReportesCreditosPendientes;
		//final JScrollPane jScrollPanelDatosCreditosPendientes=this.jScrollPanelDatosCreditosPendientes;
		final JTable jTableDatosCreditosPendientes=this.jTableDatosCreditosPendientes;		
		final JPanel jPanelPaginacionCreditosPendientes=this.jPanelPaginacionCreditosPendientes;
		//final JScrollPane jScrollPanelDatosEdicionCreditosPendientes=this.jScrollPanelDatosEdicionCreditosPendientes;
		final JPanel jPanelAccionesCreditosPendientes=this.jPanelAccionesCreditosPendientes;
		
		JPanel jPanelCamposAuxiliarCreditosPendientes=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCreditosPendientes=new JPanel();
		
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
			jPanelCamposAuxiliarCreditosPendientes=this.jInternalFrameDetalleFormCreditosPendientes.jPanelCamposCreditosPendientes;
			jPanelAccionesFormularioAuxiliarCreditosPendientes=this.jInternalFrameDetalleFormCreditosPendientes.jPanelAccionesFormularioCreditosPendientes;
		}
		
		final JPanel jPanelCamposCreditosPendientes=jPanelCamposAuxiliarCreditosPendientes;
		final JPanel jPanelAccionesFormularioCreditosPendientes=jPanelAccionesFormularioAuxiliarCreditosPendientes;
		
		
		final JMenuBar jmenuBarCreditosPendientes=this.jmenuBarCreditosPendientes;		
		final JToolBar jTtoolBarCreditosPendientes=this.jTtoolBarCreditosPendientes;
				
		JMenuBar jmenuBarDetalleAuxiliarCreditosPendientes=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCreditosPendientes=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
			jmenuBarDetalleAuxiliarCreditosPendientes=this.jInternalFrameDetalleFormCreditosPendientes.jmenuBarDetalleCreditosPendientes;
			jTtoolBarDetalleAuxiliarCreditosPendientes=this.jInternalFrameDetalleFormCreditosPendientes.jTtoolBarDetalleCreditosPendientes;		
		}
		
		final JMenuBar jmenuBarDetalleCreditosPendientes=jmenuBarDetalleAuxiliarCreditosPendientes;
		final JToolBar jTtoolBarDetalleCreditosPendientes=jTtoolBarDetalleAuxiliarCreditosPendientes;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCreditosPendientes;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCreditosPendientes;
			processRunnable.jTableDatos=jTableDatosCreditosPendientes;
			processRunnable.jPanelCampos=jPanelCamposCreditosPendientes;
			processRunnable.jPanelPaginacion=jPanelPaginacionCreditosPendientes;
			processRunnable.jPanelAcciones=jPanelAccionesCreditosPendientes;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCreditosPendientes;
			
			
			processRunnable.jmenuBar=jmenuBarCreditosPendientes;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCreditosPendientes;
			processRunnable.jTtoolBar=jTtoolBarCreditosPendientes;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCreditosPendientes;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCreditosPendientes ,jPanelParametrosReportesCreditosPendientes, jTableDatosCreditosPendientes,/*jScrollPanelDatosCreditosPendientes,*/jPanelCamposCreditosPendientes,jPanelPaginacionCreditosPendientes, /*jScrollPanelDatosEdicionCreditosPendientes,*/ jPanelAccionesCreditosPendientes,jPanelAccionesFormularioCreditosPendientes,jmenuBarCreditosPendientes,jmenuBarDetalleCreditosPendientes,jTtoolBarCreditosPendientes,jTtoolBarDetalleCreditosPendientes));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCreditosPendientes(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCreditosPendientes(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCreditosPendientes(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCreditosPendientes(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCreditosPendientes,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCreditosPendientes,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCreditosPendientes(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCreditosPendientes,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCreditosPendientes,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.creditospendientesConstantesFunciones.getsFinalQueryCreditosPendientes();
		String  finalQueryPaginacionTodos=this.creditospendientesConstantesFunciones.getsFinalQueryCreditosPendientes();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CreditosPendientesConstantesFunciones.getArrayColumnasGlobalesNoCreditosPendientes(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CreditosPendientesConstantesFunciones.getArrayColumnasGlobalesCreditosPendientes(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CreditosPendientesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.creditospendientessEliminados= new ArrayList<CreditosPendientes>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCreditosPendientes();
		
				///*CreditosPendientesSessionBean*/this.creditospendientesSessionBean=new CreditosPendientesSessionBean();
			
			if(this.creditospendientesSessionBean==null) {
				this.creditospendientesSessionBean=new CreditosPendientesSessionBean();
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
					this.iNumeroPaginacion=CreditosPendientesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CreditosPendientesConstantesFunciones.getClassesForeignKeysOfCreditosPendientes(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/creditospendientes."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			creditospendientessAux= new ArrayList<CreditosPendientes>();
			
				
			creditospendientesLogic.setDatosCliente(this.datosCliente);
			creditospendientesLogic.setDatosDeep(this.datosDeep);
			creditospendientesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaCreditosPendientes")) {
				this.sDetalleReporte=CreditosPendientesConstantesFunciones.getDetalleIndiceBusquedaCreditosPendientes(id_cargoBusquedaCreditosPendientes,id_estructuraBusquedaCreditosPendientes,id_empleadoBusquedaCreditosPendientes,fecha_vencimiento_desdeBusquedaCreditosPendientes,fecha_vencimiento_hastaBusquedaCreditosPendientes);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					creditospendientesLogic.getCreditosPendientessBusquedaCreditosPendientes(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_cargoBusquedaCreditosPendientes,id_estructuraBusquedaCreditosPendientes,id_empleadoBusquedaCreditosPendientes,fecha_vencimiento_desdeBusquedaCreditosPendientes,fecha_vencimiento_hastaBusquedaCreditosPendientes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CreditosPendientesConstantesFunciones.getDetalleIndiceBusquedaCreditosPendientes(id_cargoBusquedaCreditosPendientes,id_estructuraBusquedaCreditosPendientes,id_empleadoBusquedaCreditosPendientes,fecha_vencimiento_desdeBusquedaCreditosPendientes,fecha_vencimiento_hastaBusquedaCreditosPendientes);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CreditosPendientesConstantesFunciones.getDetalleIndiceBusquedaCreditosPendientes(id_cargoBusquedaCreditosPendientes,id_estructuraBusquedaCreditosPendientes,id_empleadoBusquedaCreditosPendientes,fecha_vencimiento_desdeBusquedaCreditosPendientes,fecha_vencimiento_hastaBusquedaCreditosPendientes);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=creditospendientesLogic.getCreditosPendientess()==null||creditospendientesLogic.getCreditosPendientess().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=creditospendientess==null|| creditospendientess.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						creditospendientessAux=new ArrayList<CreditosPendientes>();
						creditospendientessAux.addAll(creditospendientesLogic.getCreditosPendientess());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							creditospendientessAux=new ArrayList<CreditosPendientes>();
							creditospendientessAux.addAll(creditospendientess);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							creditospendientesLogic.getCreditosPendientessBusquedaCreditosPendientes(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_cargoBusquedaCreditosPendientes,id_estructuraBusquedaCreditosPendientes,id_empleadoBusquedaCreditosPendientes,fecha_vencimiento_desdeBusquedaCreditosPendientes,fecha_vencimiento_hastaBusquedaCreditosPendientes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CreditosPendientesConstantesFunciones.getDetalleIndiceBusquedaCreditosPendientes(id_cargoBusquedaCreditosPendientes,id_estructuraBusquedaCreditosPendientes,id_empleadoBusquedaCreditosPendientes,fecha_vencimiento_desdeBusquedaCreditosPendientes,fecha_vencimiento_hastaBusquedaCreditosPendientes);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CreditosPendientesConstantesFunciones.getDetalleIndiceBusquedaCreditosPendientes(id_cargoBusquedaCreditosPendientes,id_estructuraBusquedaCreditosPendientes,id_empleadoBusquedaCreditosPendientes,fecha_vencimiento_desdeBusquedaCreditosPendientes,fecha_vencimiento_hastaBusquedaCreditosPendientes);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCreditosPendientess("BusquedaCreditosPendientes",creditospendientesLogic.getCreditosPendientess());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCreditosPendientess("BusquedaCreditosPendientes",creditospendientess);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						creditospendientesLogic.setCreditosPendientess(new ArrayList<CreditosPendientes>());
						creditospendientesLogic.getCreditosPendientess().addAll(creditospendientessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							creditospendientess=new ArrayList<CreditosPendientes>();
							creditospendientess.addAll(creditospendientessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCreditosPendientes();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCreditosPendientes();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=creditospendientesLogic.getCreditosPendientess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=creditospendientess.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=creditospendientesLogic.getCreditosPendientess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=creditospendientess.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CreditosPendientes creditospendientes) {
		Boolean permite=true;
		
		if(this.creditospendientes.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CreditosPendientesConstantesFunciones.getOrderByListaCreditosPendientes();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CreditosPendientesConstantesFunciones.getOrderByListaCreditosPendientes();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CreditosPendientes creditospendientes:creditospendientesLogic.getCreditosPendientess()) {
				if(creditospendientes.getsType().equals(Constantes2.S_TOTALES)) {
					creditospendientesTotales=creditospendientes;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CreditosPendientes creditospendientes:this.creditospendientess) {
				if(creditospendientes.getsType().equals(Constantes2.S_TOTALES)) {
					creditospendientesTotales=creditospendientes;
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
			this.creditospendientesAux=new CreditosPendientes();
			this.creditospendientesAux.setsType(Constantes2.S_TOTALES);
			this.creditospendientesAux.setIsNew(false);
			this.creditospendientesAux.setIsChanged(false);
			this.creditospendientesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//CreditosPendientesConstantesFunciones.TotalizarValoresFilaCreditosPendientes(this.creditospendientesLogic.getCreditosPendientess(),this.creditospendientesAux);
				
				//this.creditospendientesLogic.getCreditosPendientess().add(this.creditospendientesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CreditosPendientesConstantesFunciones.TotalizarValoresFilaCreditosPendientes(this.creditospendientess,this.creditospendientesAux);
				
				this.creditospendientess.add(this.creditospendientesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		creditospendientesTotales=new CreditosPendientes();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.creditospendientesLogic.getCreditosPendientess().remove(creditospendientesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.creditospendientess.remove(creditospendientesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		creditospendientesTotales=new CreditosPendientes();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CreditosPendientes creditospendientes:creditospendientesLogic.getCreditosPendientess()) {
				if(creditospendientes.getsType().equals(Constantes2.S_TOTALES)) {
					creditospendientesTotales=creditospendientes;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CreditosPendientesConstantesFunciones.TotalizarValoresFilaCreditosPendientes(this.creditospendientesLogic.getCreditosPendientess(),creditospendientesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CreditosPendientes creditospendientes:this.creditospendientess) {
				if(creditospendientes.getsType().equals(Constantes2.S_TOTALES)) {
					creditospendientesTotales=creditospendientes;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CreditosPendientesConstantesFunciones.TotalizarValoresFilaCreditosPendientes(this.creditospendientess,creditospendientesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCreditosPendientessBusquedaCreditosPendientes()throws Exception {
		try {
			sAccionBusqueda="BusquedaCreditosPendientes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCreditosPendientessFK_IdCargo()throws Exception {
		try {
			sAccionBusqueda="FK_IdCargo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCreditosPendientessFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCreditosPendientessFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCreditosPendientessFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCreditosPendientessBusquedaCreditosPendientes(String sFinalQuery,Long id_cargo,Long id_estructura,Long id_empleado,Date fecha_vencimiento_desde,Date fecha_vencimiento_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//creditospendientesLogic.getCreditosPendientessBusquedaCreditosPendientes(sFinalQuery,this.pagination,id_cargo,id_estructura,id_empleado,fecha_vencimiento_desde,fecha_vencimiento_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCreditosPendientessFK_IdCargo(String sFinalQuery,Long id_cargo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//creditospendientesLogic.getCreditosPendientessFK_IdCargo(sFinalQuery,this.pagination,id_cargo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCreditosPendientessFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//creditospendientesLogic.getCreditosPendientessFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCreditosPendientessFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//creditospendientesLogic.getCreditosPendientessFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCreditosPendientessFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//creditospendientesLogic.getCreditosPendientessFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosCreditosPendientes() {
		this.isPermisoTodoCreditosPendientes=false;
		this.isPermisoNuevoCreditosPendientes=false;
		this.isPermisoActualizarCreditosPendientes=false;
		this.isPermisoActualizarOriginalCreditosPendientes=false;
		this.isPermisoEliminarCreditosPendientes=false;
		this.isPermisoGuardarCambiosCreditosPendientes=false;
		this.isPermisoConsultaCreditosPendientes=true;
		this.isPermisoBusquedaCreditosPendientes=true;
		this.isPermisoReporteCreditosPendientes=true;
		this.isPermisoOrdenCreditosPendientes=false;		
		this.isPermisoPaginacionMedioCreditosPendientes=false;		
		this.isPermisoPaginacionAltoCreditosPendientes=false;		
		this.isPermisoPaginacionTodoCreditosPendientes=false;		
		this.isPermisoCopiarCreditosPendientes=false;		
		this.isPermisoVerFormCreditosPendientes=false;		
		this.isPermisoDuplicarCreditosPendientes=false;
		this.isPermisoOrdenCreditosPendientes=false;
	}
	
	public void setPermisosUsuarioCreditosPendientes(Boolean isPermiso) {
		this.isPermisoTodoCreditosPendientes=isPermiso;
		this.isPermisoNuevoCreditosPendientes=isPermiso;
		this.isPermisoActualizarCreditosPendientes=isPermiso;
		this.isPermisoActualizarOriginalCreditosPendientes=isPermiso;
		this.isPermisoEliminarCreditosPendientes=isPermiso;
		this.isPermisoGuardarCambiosCreditosPendientes=isPermiso;
		this.isPermisoConsultaCreditosPendientes=isPermiso;
		this.isPermisoBusquedaCreditosPendientes=isPermiso;
		this.isPermisoReporteCreditosPendientes=isPermiso;
		this.isPermisoOrdenCreditosPendientes=isPermiso;		
		this.isPermisoPaginacionMedioCreditosPendientes=isPermiso;		
		this.isPermisoPaginacionAltoCreditosPendientes=isPermiso;		
		this.isPermisoPaginacionTodoCreditosPendientes=isPermiso;		
		this.isPermisoCopiarCreditosPendientes=isPermiso;		
		this.isPermisoVerFormCreditosPendientes=isPermiso;		
		this.isPermisoDuplicarCreditosPendientes=isPermiso;
		this.isPermisoOrdenCreditosPendientes=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCreditosPendientes(Boolean isPermiso) {
		//this.isPermisoTodoCreditosPendientes=isPermiso;
		this.isPermisoNuevoCreditosPendientes=isPermiso;
		this.isPermisoActualizarCreditosPendientes=isPermiso;
		this.isPermisoActualizarOriginalCreditosPendientes=isPermiso;
		this.isPermisoEliminarCreditosPendientes=isPermiso;
		this.isPermisoGuardarCambiosCreditosPendientes=isPermiso;
		//this.isPermisoConsultaCreditosPendientes=isPermiso;
		//this.isPermisoBusquedaCreditosPendientes=isPermiso;
		//this.isPermisoReporteCreditosPendientes=isPermiso;
		//this.isPermisoOrdenCreditosPendientes=isPermiso;		
		//this.isPermisoPaginacionMedioCreditosPendientes=isPermiso;		
		//this.isPermisoPaginacionAltoCreditosPendientes=isPermiso;		
		//this.isPermisoPaginacionTodoCreditosPendientes=isPermiso;		
		//this.isPermisoCopiarCreditosPendientes=isPermiso;		
		//this.isPermisoDuplicarCreditosPendientes=isPermiso;
		//this.isPermisoOrdenCreditosPendientes=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCreditosPendientesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CreditosPendientesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCreditosPendientes(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCreditosPendientesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCreditosPendientesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCreditosPendientesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCreditosPendientesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCreditosPendientes() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CreditosPendientesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.creditospendientesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CreditosPendientesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCreditosPendientes=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCreditosPendientes=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCreditosPendientes=this.isPermisoActualizarCreditosPendientes;
			this.isPermisoEliminarCreditosPendientes=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCreditosPendientes=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCreditosPendientes=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCreditosPendientes=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCreditosPendientes=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCreditosPendientes=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCreditosPendientes=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCreditosPendientes=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCreditosPendientes=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCreditosPendientes=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCreditosPendientes=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCreditosPendientes=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCreditosPendientes=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCreditosPendientes=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.creditospendientesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCreditosPendientes.setToolTipText(this.jTableDatosCreditosPendientes.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCreditosPendientes(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCreditosPendientes(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CreditosPendientesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CreditosPendientesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCreditosPendientes() throws Exception {
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
	public void inicializarCombosForeignKeyCreditosPendientesListas()throws Exception {
		try	{						
			
				this.cargosForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCreditosPendientesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CreditosPendientesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyCargoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyCargoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cargosForeignKey==null||this.cargosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CargoConstantesFunciones.getArrayColumnasGlobalesCargo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CargoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CargoConstantesFunciones.SFINALQUERY;

				this.cargarCombosCargosForeignKeyLista(finalQueryGlobal);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyCreditosPendientes()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyCargo();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyCargo()throws Exception {
		try {
			if(this.creditospendientesSessionBean==null) {
				this.creditospendientesSessionBean=new CreditosPendientesSessionBean();
			}

			if(!this.creditospendientesSessionBean.getisBusquedaDesdeForeignKeySesionCargo()) {
				Cargo cargo=new Cargo();
				CargoConstantesFunciones.setCargoDescripcion(cargo,Constantes.SMENSAJE_ESCOJA_OPCION);
				cargo.setId(null);

				if(!CargoConstantesFunciones.ExisteEnLista(this.cargosForeignKey,cargo,true)) {

					this.cargosForeignKey.add(0,cargo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstructura()throws Exception {
		try {

			if(!this.creditospendientesSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.creditospendientesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.creditospendientesSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
	
	public void initActionsCombosTodosForeignKeyCreditosPendientes()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCreditosPendientes(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCreditosPendientes()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCreditosPendientes();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCreditosPendientes(CreditosPendientes creditospendientes)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCreditosPendientes(CreditosPendientes creditospendientes,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCreditosPendientes()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCreditosPendientes()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCreditosPendientes()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCreditosPendientes()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCreditosPendientes()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCreditosPendientes()throws Exception {
		try {
			

			this.cargarCombosFrameCargosForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCreditosPendientes(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameCargosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCreditosPendientes()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_cargoCreditosPendientes!=null && this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_cargoCreditosPendientes.getItemCount()>0) {
				this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_cargoCreditosPendientes.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_estructuraCreditosPendientes!=null && this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_estructuraCreditosPendientes.getItemCount()>0) {
				this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_estructuraCreditosPendientes.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empresaCreditosPendientes!=null && this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empresaCreditosPendientes.getItemCount()>0) {
				this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empresaCreditosPendientes.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empleadoCreditosPendientes!=null && this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empleadoCreditosPendientes.getItemCount()>0) {
				this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empleadoCreditosPendientes.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public CreditosPendientesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CreditosPendientesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CreditosPendientesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.creditospendientesSessionBean=new CreditosPendientesSessionBean(); 
		this.creditospendientesConstantesFunciones=new CreditosPendientesConstantesFunciones(); 
		this.creditospendientesBean=new CreditosPendientes();//(this.creditospendientesConstantesFunciones); 		
		this.creditospendientesReturnGeneral=new CreditosPendientesParameterReturnGeneral(); 
		
		this.creditospendientesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.creditospendientesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CreditosPendientesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CreditosPendientesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CreditosPendientesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCreditosPendientes(true);
			
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
			
			this.creditospendientesConstantesFunciones=new CreditosPendientesConstantesFunciones(); 
			this.creditospendientesBean=new CreditosPendientes();//this.creditospendientesConstantesFunciones); 			
			this.creditospendientesReturnGeneral=new CreditosPendientesParameterReturnGeneral(); 
		
			CreditosPendientesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Creditos Pendientes Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.creditospendientes=new CreditosPendientes();
			this.creditospendientess = new ArrayList<CreditosPendientes>();
			this.creditospendientessAux = new ArrayList<CreditosPendientes>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic=new CreditosPendientesLogic();
				this.creditospendientesLogic.getNewConnexionToDeep("");
			}
			
			//this.creditospendientesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.creditospendientesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCreditosPendientes);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCreditosPendientes!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCreditosPendientes);	
					}
					
					if(this.jInternalFrameImportacionCreditosPendientes!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCreditosPendientes);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCreditosPendientes!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCreditosPendientes);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCreditosPendientes);
				this.jInternalFrameDetalleFormCreditosPendientes.setVisible(false);
				this.jInternalFrameDetalleFormCreditosPendientes.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCreditosPendientes!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCreditosPendientes);
					this.jInternalFrameReporteDinamicoCreditosPendientes.setVisible(false);
					this.jInternalFrameReporteDinamicoCreditosPendientes.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCreditosPendientes!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCreditosPendientes);
					this.jInternalFrameImportacionCreditosPendientes.setVisible(false);
					this.jInternalFrameImportacionCreditosPendientes.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCreditosPendientes!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCreditosPendientes);
					this.jInternalFrameOrderByCreditosPendientes.setVisible(false);
					this.jInternalFrameOrderByCreditosPendientes.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCreditosPendientesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CreditosPendientesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.creditospendientesReturnGeneral=new CreditosPendientesParameterReturnGeneral();
			
			this.creditospendientesParameterGeneral=new CreditosPendientesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.creditospendientesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.creditospendientesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CreditosPendientesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.creditospendientesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CreditosPendientesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.creditospendientesSessionBean.getEsGuardarRelacionado(),this.creditospendientesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CreditosPendientesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.creditospendientesSessionBean.getEsGuardarRelacionado(),this.creditospendientesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCreditosPendientes=false;
			this.isVisibilidadCeldaDuplicarCreditosPendientes=true;
			this.isVisibilidadCeldaCopiarCreditosPendientes=true;
			this.isVisibilidadCeldaVerFormCreditosPendientes=true;
			this.isVisibilidadCeldaOrdenCreditosPendientes=true;
			this.isVisibilidadCeldaNuevoRelacionesCreditosPendientes=false;
			this.isVisibilidadCeldaModificarCreditosPendientes=false;
			this.isVisibilidadCeldaActualizarCreditosPendientes=false;
			this.isVisibilidadCeldaEliminarCreditosPendientes=false;
			this.isVisibilidadCeldaCancelarCreditosPendientes=false;
			this.isVisibilidadCeldaGuardarCreditosPendientes=false;
			this.isVisibilidadCeldaGuardarCambiosCreditosPendientes=false;
			
			
			this.isVisibilidadBusquedaCreditosPendientes=true;
			this.isVisibilidadFK_IdCargo=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstructura=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCreditosPendientes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCreditosPendientes();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCreditosPendientes(false);
			
			this.setPermisosUsuarioCreditosPendientes();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.creditospendientesSessionBean.getEsGuardarRelacionado() 
				|| (this.creditospendientesSessionBean.getEsGuardarRelacionado() && this.creditospendientesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCreditosPendientesClasesRelacionadas();
			}
			
			if(this.creditospendientesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCreditosPendientesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCreditosPendientes();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCreditosPendientes();
			}
			
			if(!this.isPermisoBusquedaCreditosPendientes) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCreditosPendientes.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.creditospendientesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CreditosPendientesConstantesFunciones.getTiposSeleccionarCreditosPendientes());
				
				this.tiposColumnasSelect=CreditosPendientesConstantesFunciones.getTiposSeleccionarCreditosPendientes(true);
				
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
			//if(!this.creditospendientesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCreditosPendientes();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioCreditosPendientes(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioCreditosPendientes(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCreditosPendientes() ;
			
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
			
			this.cargoLogic=new CargoLogic();
			this.estructuraLogic=new EstructuraLogic();
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
				creditospendientesImplementable= (CreditosPendientesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CreditosPendientesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				creditospendientesImplementableHome= (CreditosPendientesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CreditosPendientesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.creditospendientess= new ArrayList<CreditosPendientes>();
			this.creditospendientessEliminados= new ArrayList<CreditosPendientes>();
						
			this.isEsNuevoCreditosPendientes=false;
			this.esParaAccionDesdeFormularioCreditosPendientes=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.cargosForeignKey=new ArrayList<Cargo>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCreditosPendientes(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCreditosPendientes();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.creditospendientesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CreditosPendientesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CreditosPendientesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCreditosPendientes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCreditosPendientes(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCreditosPendientes();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCreditosPendientes();
			}
			
			CreditosPendientesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCreditosPendientes.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCreditosPendientes.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCreditosPendientes.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCreditosPendientes(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CreditosPendientes: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCreditosPendientes() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCreditosPendientes")) {
				iIndex=this.jInternalFrameDetalleFormCreditosPendientes.jTabbedPaneRelacionesCreditosPendientes.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCreditosPendientes.jTabbedPaneRelacionesCreditosPendientes.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCreditosPendientes();	
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
	
	public void cargarCombosForeignKeyCreditosPendientes(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCreditosPendientes(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCreditosPendientes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCreditosPendientesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCreditosPendientes();
		
		this.cargarCombosFrameForeignKeyCreditosPendientes();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCreditosPendientes();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCreditosPendientes();
		}
	}
	
	

	public void cargarCombosForeignKeyCargo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCargoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCargo();
				this.cargarCombosFrameCargosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCargo(this.cargosForeignKey);

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
	
	public void jButtonNuevoCreditosPendientesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.creditospendientesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCreditosPendientes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
			
			
			if(jTableDatosCreditosPendientes.getRowCount()>=1) {
				jTableDatosCreditosPendientes.removeRowSelectionInterval(0, jTableDatosCreditosPendientes.getRowCount()-1);						
			}
			
			this.isEsNuevoCreditosPendientes=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCreditosPendientes(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCreditosPendientes(true);			
			//this.creditospendientes=new CreditosPendientes();
			//this.creditospendientes.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCreditosPendientes(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCreditosPendientes() ;
			
			if(CreditosPendientesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCreditosPendientes(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.creditospendientes);	
			this.actualizarInformacion("INFO_PADRE",false,this.creditospendientes);				
			
			CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
			
			if(this.creditospendientesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CreditosPendientes: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCreditosPendientesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CreditosPendientes> creditospendientessSeleccionados=new ArrayList<CreditosPendientes>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCreditosPendientes.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCreditosPendientes.getSelectedRows().length;			
			}
			
			creditospendientessSeleccionados=this.getCreditosPendientessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCreditosPendientes--;			
				//CreditosPendientes creditospendientesAux= new CreditosPendientes();			
				//creditospendientesAux.setId(this.iIdNuevoCreditosPendientes);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CreditosPendientes creditospendientesOrigen=new CreditosPendientes();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CreditosPendientes creditospendientesOrigen : creditospendientessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							creditospendientesOrigen =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							creditospendientesOrigen =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCreditosPendientes();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.creditospendientes.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCreditosPendientes(creditospendientesOrigen,this.creditospendientes,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.creditospendientesLogic.getCreditosPendientess().add(this.creditospendientesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.creditospendientess.add(this.creditospendientesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCreditosPendientes(false);
				
				this.jTableDatosCreditosPendientes.setRowSelectionInterval(this.getIndiceNuevoCreditosPendientes(), this.getIndiceNuevoCreditosPendientes());
				
				int iLastRow =  this.jTableDatosCreditosPendientes.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCreditosPendientes.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCreditosPendientes.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCreditosPendientes(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CreditosPendientes> creditospendientessSeleccionados=new ArrayList<CreditosPendientes>();									
		
			CreditosPendientes creditospendientesOrigen=new CreditosPendientes();
			CreditosPendientes creditospendientesDestino=new CreditosPendientes();
				
			creditospendientessSeleccionados=this.getCreditosPendientessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCreditosPendientes.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || creditospendientessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCreditosPendientes.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						creditospendientesOrigen =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						creditospendientesOrigen =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						creditospendientesDestino =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						creditospendientesDestino =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				creditospendientesOrigen =creditospendientessSeleccionados.get(0);
				creditospendientesDestino =creditospendientessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCreditosPendientes(creditospendientesOrigen,creditospendientesDestino,true,false);
				
				creditospendientesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(creditospendientesDestino,creditospendientesLogic.getCreditosPendientess());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(creditospendientesDestino,creditospendientess);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCreditosPendientes(false);
				
				//this.jTableDatosCreditosPendientes.setRowSelectionInterval(this.getIndiceNuevoCreditosPendientes(), this.getIndiceNuevoCreditosPendientes());
				
				int iLastRow =  this.jTableDatosCreditosPendientes.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCreditosPendientes.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCreditosPendientes.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCreditosPendientes(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCreditosPendientes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCreditosPendientes.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCreditosPendientes.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCreditosPendientes.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCreditosPendientes.setVisible(!isVisible);
			this.jPanelPaginacionCreditosPendientes.setVisible(!isVisible);
			this.jPanelAccionesCreditosPendientes.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCreditosPendientes();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCreditosPendientes();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCreditosPendientes();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCreditosPendientes();
			
			this.abrirFrameOrderByCreditosPendientes();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCreditosPendientes();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCreditosPendientes(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCreditosPendientes);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCreditosPendientes.isMaximum()) {
					this.jInternalFrameDetalleFormCreditosPendientes.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCreditosPendientes.setSize(this.jInternalFrameDetalleFormCreditosPendientes.iWidthFormulario,this.jInternalFrameDetalleFormCreditosPendientes.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCreditosPendientes.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCreditosPendientes.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCreditosPendientes.isMaximum()) {
						this.jInternalFrameDetalleFormCreditosPendientes.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCreditosPendientes.jContentPaneDetalleCreditosPendientes.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCreditosPendientes.jTabbedPaneRelacionesCreditosPendientes.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCreditosPendientes.jContentPaneDetalleCreditosPendientes.getWidth(),CreditosPendientesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCreditosPendientes.jTabbedPaneRelacionesCreditosPendientes.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCreditosPendientes.jContentPaneDetalleCreditosPendientes.getWidth(),CreditosPendientesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCreditosPendientes.jTabbedPaneRelacionesCreditosPendientes.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCreditosPendientes.jContentPaneDetalleCreditosPendientes.getWidth(),CreditosPendientesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCreditosPendientes.setVisible(true);
	        this.jInternalFrameDetalleFormCreditosPendientes.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCreditosPendientes() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCreditosPendientes==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCreditosPendientes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCreditosPendientes,false,this);
				} else {
					this.jInternalFrameOrderByCreditosPendientes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCreditosPendientes,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCreditosPendientes);
				this.jInternalFrameOrderByCreditosPendientes.setVisible(false);
				this.jInternalFrameOrderByCreditosPendientes.setSelected(false);
				
				this.jInternalFrameOrderByCreditosPendientes.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCreditosPendientes"));
				
				this.inicializarActualizarBindingTablaOrderByCreditosPendientes();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCreditosPendientes() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCreditosPendientes==null) {
				
				this.jInternalFrameImportacionCreditosPendientes=new ImportacionJInternalFrame(CreditosPendientesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCreditosPendientes);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCreditosPendientes);
				this.jInternalFrameImportacionCreditosPendientes.setVisible(false);
				this.jInternalFrameImportacionCreditosPendientes.setSelected(false);


				this.jInternalFrameImportacionCreditosPendientes.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCreditosPendientes"));
				this.jInternalFrameImportacionCreditosPendientes.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCreditosPendientes"));
				this.jInternalFrameImportacionCreditosPendientes.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCreditosPendientes"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCreditosPendientes() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCreditosPendientes==null) {
				this.jInternalFrameReporteDinamicoCreditosPendientes=new ReporteDinamicoJInternalFrame(CreditosPendientesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCreditosPendientes);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCreditosPendientes);
				this.jInternalFrameReporteDinamicoCreditosPendientes.setVisible(false);
				this.jInternalFrameReporteDinamicoCreditosPendientes.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCreditosPendientes.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCreditosPendientes"));
				this.jInternalFrameReporteDinamicoCreditosPendientes.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCreditosPendientes"));
				this.jInternalFrameReporteDinamicoCreditosPendientes.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCreditosPendientes"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCreditosPendientes();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCreditosPendientes() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCreditosPendientes);
			
	       	this.jInternalFrameDetalleFormCreditosPendientes.setVisible(false);
	        this.jInternalFrameDetalleFormCreditosPendientes.setSelected(false);
			
			//this.jInternalFrameDetalleFormCreditosPendientes.dispose();
			//this.jInternalFrameDetalleFormCreditosPendientes=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCreditosPendientes() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCreditosPendientes.setVisible(true);
	        this.jInternalFrameReporteDinamicoCreditosPendientes.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCreditosPendientes() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCreditosPendientes.setVisible(true);
	        this.jInternalFrameImportacionCreditosPendientes.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCreditosPendientes() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCreditosPendientes.setVisible(true);
	        this.jInternalFrameOrderByCreditosPendientes.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCreditosPendientes() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCreditosPendientes.setVisible(false);
	        this.jInternalFrameOrderByCreditosPendientes.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCreditosPendientes() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCreditosPendientes.setVisible(false);
	        this.jInternalFrameReporteDinamicoCreditosPendientes.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCreditosPendientes() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCreditosPendientes.setVisible(false);
	        this.jInternalFrameImportacionCreditosPendientes.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCreditosPendientes(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCreditosPendientes(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCreditosPendientes(true);
			//this.isEsNuevoCreditosPendientes=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCreditosPendientes("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCreditosPendientes(false) ;
			
			if(creditospendientesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CreditosPendientesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCreditosPendientes(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCreditosPendientes(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCreditosPendientesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCreditosPendientes(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCreditosPendientes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCreditosPendientes(true);
			//this.isEsNuevoCreditosPendientes=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.creditospendientes.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCreditosPendientes("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCreditosPendientes(false) ;
			
			if(CreditosPendientesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCreditosPendientes(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCreditosPendientes(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaCargo(List<Cargo> cargosForeignKey)throws Exception{
		TableColumn tableColumnCargo=this.jTableDatosCreditosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosPendientes,CreditosPendientesConstantesFunciones.LABEL_IDCARGO));
		TableCellEditor tableCellEditorCargo =tableColumnCargo.getCellEditor();

		CargoTableCell cargoTableCellFk=(CargoTableCell)tableCellEditorCargo;

		if(cargoTableCellFk!=null) {
			cargoTableCellFk.setcargosForeignKey(cargosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCreditosPendientes.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cargoTableCellFk.setRowActual(intSelectedRow);
			//cargoTableCellFk.setcargosForeignKeyActual(cargosForeignKey);
		//}


		if(cargoTableCellFk!=null) {
			cargoTableCellFk.RecargarCargosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosCreditosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosPendientes,CreditosPendientesConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCreditosPendientes.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
		
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosCreditosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosPendientes,CreditosPendientesConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCreditosPendientes.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCreditosPendientes(false);
			
			//if(!this.isEsNuevoCreditosPendientes) {								
				int intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CreditosPendientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCreditosPendientes(this.creditospendientes,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
				
			}
			
			if(this.permiteMantenimiento(this.creditospendientes)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.creditospendientesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCreditosPendientes=true;
					this.inicializarActualizarBindingTablaCreditosPendientes(false);
					this.isEsNuevoCreditosPendientes=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCreditosPendientes=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCreditosPendientes=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCreditosPendientes(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCreditosPendientes(false);
				
				this.habilitarDeshabilitarControlesCreditosPendientes(false);
			
												
				
				if(CreditosPendientesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCreditosPendientes();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCreditosPendientesActionPerformed(evt,creditospendientesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCreditosPendientes(this.creditospendientes,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCreditosPendientes.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,creditospendientesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.creditospendientes.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CreditosPendientes.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CreditosPendientes.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				this.creditospendientes.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				this.creditospendientes.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.creditospendientes)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.creditospendientesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CreditosPendientesModel) this.jTableDatosCreditosPendientes.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCreditosPendientes=true;
				this.inicializarActualizarBindingTablaCreditosPendientes(false);
				this.isEsNuevoCreditosPendientes=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCreditosPendientes(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCreditosPendientes(false);
				
				this.habilitarDeshabilitarControlesCreditosPendientes(false);
				
				
				
				if(CreditosPendientesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCreditosPendientes();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCreditosPendientes.getRowCount()>=1) {
				jTableDatosCreditosPendientes.removeRowSelectionInterval(0, jTableDatosCreditosPendientes.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCreditosPendientes(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCreditosPendientes(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCreditosPendientes(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCreditosPendientes(false) ;
			
			this.isEsNuevoCreditosPendientes=false;
			
			if(CreditosPendientesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCreditosPendientes();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCreditosPendientes(false);
				
				//SI ES MANUAL
				if(CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCreditosPendientes();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCreditosPendientes--;			
			//CreditosPendientes creditospendientesAux= new CreditosPendientes();			
			//creditospendientesAux.setId(this.iIdNuevoCreditosPendientes);
			
			if(this.jInternalFrameDetalleFormCreditosPendientes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCreditosPendientes();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
			
			this.creditospendientes.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.creditospendientesLogic.getCreditosPendientess().add(this.creditospendientesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.creditospendientess.add(this.creditospendientesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCreditosPendientes(false);
			
			this.jTableDatosCreditosPendientes.setRowSelectionInterval(this.getIndiceNuevoCreditosPendientes(), this.getIndiceNuevoCreditosPendientes());
			
			int iLastRow =  this.jTableDatosCreditosPendientes.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCreditosPendientes.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCreditosPendientes.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCreditosPendientes(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCreditosPendientes(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCreditosPendientes(false);
			
			//SI ES MANUAL
			if(CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCreditosPendientes();
			}
			
			//this.abrirFrameTreeCreditosPendientes();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCreditosPendientes.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCreditosPendientes.setFileImportacion(this.jInternalFrameImportacionCreditosPendientes.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCreditosPendientes.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCreditosPendientes.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCreditosPendientes.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCreditosPendientes.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CreditosPendientes> creditospendientessSeleccionados=new ArrayList<CreditosPendientes>();		

		creditospendientessSeleccionados=this.getCreditosPendientessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCreditosPendientes.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCreditosPendientes.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CreditosPendientesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CreditosPendientesBaseDesign.jrxml";
			
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
			
			this.generarReporteCreditosPendientess("Todos",creditospendientessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.creditospendientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Creditos Pendientes",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCreditosPendientes.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCreditosPendientes.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CreditosPendientesConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CreditosPendientesConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CreditosPendientesConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoTipoPrestamo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoTipoPrestamo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoTipoPrestamo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoTipoPrestamo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CreditosPendientesConstantesFunciones.LABEL_CODIGOPRESTAMO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoPrestamo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoPrestamo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoPrestamo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoPrestamo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CreditosPendientesConstantesFunciones.LABEL_NUMERO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CreditosPendientesConstantesFunciones.LABEL_MONTOCAPITAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntoCapital_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntoCapital_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntoCapital_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntoCapital_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CreditosPendientesConstantesFunciones.LABEL_MONTOINTERES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntoInteres_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntoInteres_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntoInteres_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntoInteres_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CreditosPendientesConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CreditosPendientesConstantesFunciones.LABEL_SALDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCreditosPendientes.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCreditosPendientes.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCreditosPendientes.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CreditosPendientesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CreditosPendientesConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case CreditosPendientesConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO:
					sNombreCampoCategoria="codigo_tipo_prestamo";
					break;

				case CreditosPendientesConstantesFunciones.LABEL_CODIGOPRESTAMO:
					sNombreCampoCategoria="codigo_prestamo";
					break;

				case CreditosPendientesConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoria="numero";
					break;

				case CreditosPendientesConstantesFunciones.LABEL_MONTOCAPITAL:
					sNombreCampoCategoria="monto_capital";
					break;

				case CreditosPendientesConstantesFunciones.LABEL_MONTOINTERES:
					sNombreCampoCategoria="monto_interes";
					break;

				case CreditosPendientesConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case CreditosPendientesConstantesFunciones.LABEL_SALDO:
					sNombreCampoCategoria="saldo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCreditosPendientes.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CreditosPendientesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CreditosPendientesConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case CreditosPendientesConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO:
					sNombreCampoCategoriaValor="codigo_tipo_prestamo";
					break;

				case CreditosPendientesConstantesFunciones.LABEL_CODIGOPRESTAMO:
					sNombreCampoCategoriaValor="codigo_prestamo";
					break;

				case CreditosPendientesConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoriaValor="numero";
					break;

				case CreditosPendientesConstantesFunciones.LABEL_MONTOCAPITAL:
					sNombreCampoCategoriaValor="monto_capital";
					break;

				case CreditosPendientesConstantesFunciones.LABEL_MONTOINTERES:
					sNombreCampoCategoriaValor="monto_interes";
					break;

				case CreditosPendientesConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case CreditosPendientesConstantesFunciones.LABEL_SALDO:
					sNombreCampoCategoriaValor="saldo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCreditosPendientes.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCreditosPendientes.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CreditosPendientesConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CreditosPendientesConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case CreditosPendientesConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Tipo Prestamo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_tipo_prestamo");
					break;

				case CreditosPendientesConstantesFunciones.LABEL_CODIGOPRESTAMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Prestamo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_prestamo");
					break;

				case CreditosPendientesConstantesFunciones.LABEL_NUMERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero");
					break;

				case CreditosPendientesConstantesFunciones.LABEL_MONTOCAPITAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto Capital",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto_capital");
					break;

				case CreditosPendientesConstantesFunciones.LABEL_MONTOINTERES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto Interes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto_interes");
					break;

				case CreditosPendientesConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case CreditosPendientesConstantesFunciones.LABEL_SALDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo");
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
	
	public void jButtonGenerarExcelReporteDinamicoCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CreditosPendientes> creditospendientessSeleccionados=new ArrayList<CreditosPendientes>();		
		
		creditospendientessSeleccionados=this.getCreditosPendientessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"creditospendientes";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CreditosPendientess");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCreditosPendientes.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCreditosPendientes.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CreditosPendientesConstantesFunciones.LABEL_IDCARGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_IDCARGO);
					iRow++;

					for(CreditosPendientes creditospendientes:creditospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditospendientes.getcargo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosPendientesConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(CreditosPendientes creditospendientes:creditospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditospendientes.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosPendientesConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CreditosPendientes creditospendientes:creditospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditospendientes.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosPendientesConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(CreditosPendientes creditospendientes:creditospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditospendientes.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosPendientesConstantesFunciones.LABEL_FECHAVENCIMIENTODESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_FECHAVENCIMIENTODESDE);
					iRow++;

					for(CreditosPendientes creditospendientes:creditospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditospendientes.getfecha_vencimiento_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosPendientesConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA);
					iRow++;

					for(CreditosPendientes creditospendientes:creditospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditospendientes.getfecha_vencimiento_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosPendientesConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(CreditosPendientes creditospendientes:creditospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditospendientes.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosPendientesConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(CreditosPendientes creditospendientes:creditospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditospendientes.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosPendientesConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO);
					iRow++;

					for(CreditosPendientes creditospendientes:creditospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditospendientes.getcodigo_tipo_prestamo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosPendientesConstantesFunciones.LABEL_CODIGOPRESTAMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_CODIGOPRESTAMO);
					iRow++;

					for(CreditosPendientes creditospendientes:creditospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditospendientes.getcodigo_prestamo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosPendientesConstantesFunciones.LABEL_NUMERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_NUMERO);
					iRow++;

					for(CreditosPendientes creditospendientes:creditospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditospendientes.getnumero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosPendientesConstantesFunciones.LABEL_MONTOCAPITAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_MONTOCAPITAL);
					iRow++;

					for(CreditosPendientes creditospendientes:creditospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditospendientes.getmonto_capital());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosPendientesConstantesFunciones.LABEL_MONTOINTERES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_MONTOINTERES);
					iRow++;

					for(CreditosPendientes creditospendientes:creditospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditospendientes.getmonto_interes());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosPendientesConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(CreditosPendientes creditospendientes:creditospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditospendientes.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CreditosPendientesConstantesFunciones.LABEL_SALDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_SALDO);
					iRow++;

					for(CreditosPendientes creditospendientes:creditospendientessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(creditospendientes.getsaldo());
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
			//	this.getFilaCabeceraExportarExcelCreditosPendientes(row);				
			//	iRow++;
			//}				
			
			//for(CreditosPendientes creditospendientesAux:creditospendientessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCreditosPendientes(creditospendientesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.creditospendientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Creditos Pendientes",JOptionPane.INFORMATION_MESSAGE);
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
				this.creditospendientesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCreditosPendientes(false);
			
			//SI ES MANUAL
			if(CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCreditosPendientes();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCreditosPendientes(false);
			
			//SI ES MANUAL
			if(CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCreditosPendientes();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCreditosPendientes(false);
			
			//SI ES MANUAL
			if(CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCreditosPendientes();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCreditosPendientes() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCreditosPendientes.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCreditosPendientes.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCreditosPendientes.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCreditosPendientes.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCreditosPendientes.setMinimumSize(dimensionMinimum);
		this.jTableDatosCreditosPendientes.setMaximumSize(dimensionMaximum);
		this.jTableDatosCreditosPendientes.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCreditosPendientes(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCreditosPendientes(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCreditosPendientes(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCreditosPendientes(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCreditosPendientes(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.creditospendientesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCreditosPendientes(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCreditosPendientes(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCreditosPendientes(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CreditosPendientesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCreditosPendientes() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCreditosPendientes();
		
		this.inicializarActualizarBindingBotonesManualCreditosPendientes(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.creditospendientesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCreditosPendientes();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCreditosPendientes() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCreditosPendientes(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCreditosPendientes(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCreditosPendientes.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCreditosPendientes.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCreditosPendientes.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCreditosPendientes.jCheckBoxPostAccionNuevoCreditosPendientes.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCreditosPendientes.jCheckBoxPostAccionSinCerrarCreditosPendientes.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCreditosPendientes.jCheckBoxPostAccionSinMensajeCreditosPendientes.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCreditosPendientes.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCreditosPendientes.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCreditosPendientes.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
				this.jInternalFrameDetalleFormCreditosPendientes.jCheckBoxPostAccionNuevoCreditosPendientes.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCreditosPendientes.jCheckBoxPostAccionSinCerrarCreditosPendientes.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCreditosPendientes.jCheckBoxPostAccionSinMensajeCreditosPendientes.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCreditosPendientes.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCreditosPendientes.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxTiposAccionesFormularioCreditosPendientes.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCreditosPendientes.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCreditosPendientes!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCreditosPendientes.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCreditosPendientes.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCreditosPendientes.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCreditosPendientes.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCreditosPendientes.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCreditosPendientes!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCreditosPendientes.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCreditosPendientes.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCreditosPendientes.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCreditosPendientes(Boolean esInicializar) throws Exception {
		try	{	
			if(CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCreditosPendientes(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCreditosPendientes() throws Exception {
		try	{
			if(CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCreditosPendientes();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCreditosPendientes() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxTiposAccionesFormularioCreditosPendientes.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxTiposAccionesFormularioCreditosPendientes.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCreditosPendientes() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCreditosPendientes.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCreditosPendientes.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCreditosPendientes.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCreditosPendientes.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCreditosPendientes.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCreditosPendientes.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCreditosPendientes.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCreditosPendientes.addItem(reporte);
			}
			
			
			if(!this.creditospendientesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCreditosPendientes.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCreditosPendientes.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCreditosPendientes.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCreditosPendientes.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCreditosPendientes.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCreditosPendientes.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxTiposAccionesFormularioCreditosPendientes.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxTiposAccionesFormularioCreditosPendientes.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCreditosPendientes.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCreditosPendientes.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCreditosPendientes.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCreditosPendientes();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCreditosPendientes() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCreditosPendientes!=null) {
				this.jInternalFrameReporteDinamicoCreditosPendientes.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCreditosPendientes.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCreditosPendientes!=null) {
				this.jInternalFrameReporteDinamicoCreditosPendientes.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCreditosPendientes.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCreditosPendientes!=null) {
				
				if(this.jInternalFrameReporteDinamicoCreditosPendientes.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCreditosPendientes.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCreditosPendientes.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCreditosPendientes.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCreditosPendientes.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCreditosPendientes.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCreditosPendientes.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCreditosPendientes.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CreditosPendientesConstantesFunciones.getTiposSeleccionarCreditosPendientes(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCreditosPendientes.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCreditosPendientes.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCreditosPendientes.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CreditosPendientesConstantesFunciones.getTiposSeleccionarCreditosPendientes(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCreditosPendientes.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCreditosPendientes.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCreditosPendientes.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CreditosPendientesConstantesFunciones.getTiposSeleccionarCreditosPendientes(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCreditosPendientes.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCreditosPendientes.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCreditosPendientes.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCreditosPendientes.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCreditosPendientes()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cargoBusquedaCreditosPendientesCreditosPendientes.getSelectedItem()!=null){this.id_cargoBusquedaCreditosPendientes=((Cargo)this.jComboBoxid_cargoBusquedaCreditosPendientesCreditosPendientes.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructuraBusquedaCreditosPendientesCreditosPendientes.getSelectedItem()!=null){this.id_estructuraBusquedaCreditosPendientes=((Estructura)this.jComboBoxid_estructuraBusquedaCreditosPendientesCreditosPendientes.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoBusquedaCreditosPendientesCreditosPendientes.getSelectedItem()!=null){this.id_empleadoBusquedaCreditosPendientes=((Empleado)this.jComboBoxid_empleadoBusquedaCreditosPendientesCreditosPendientes.getSelectedItem()).getId();}
		this.fecha_vencimiento_desdeBusquedaCreditosPendientes=new Date(this.jDateChooserfecha_vencimiento_desdeBusquedaCreditosPendientesCreditosPendientes.getDate().getTime());
		this.fecha_vencimiento_hastaBusquedaCreditosPendientes=new Date(this.jDateChooserfecha_vencimiento_hastaBusquedaCreditosPendientesCreditosPendientes.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCreditosPendientes(Boolean esInicializar) throws Exception {				
		if(CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCreditosPendientes();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCreditosPendientes() throws Exception {
		this.inicializarActualizarBindingTablaCreditosPendientes(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCreditosPendientes() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCreditosPendientes.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCreditosPendientes.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCreditosPendientes.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CreditosPendientesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCreditosPendientes.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCreditosPendientes.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CreditosPendientesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCreditosPendientesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosPendientesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CreditosPendientesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCreditosPendientes.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCreditosPendientes.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CreditosPendientesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCreditosPendientes.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCreditosPendientes(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=creditospendientesLogic.getCreditosPendientess().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=creditospendientess.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CreditosPendientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCreditosPendientes.setModel(new CreditosPendientesModel(this.creditospendientesLogic.getCreditosPendientess(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCreditosPendientes.setModel(new CreditosPendientesModel(this.creditospendientess,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCreditosPendientes!=null && this.jInternalFrameOrderByCreditosPendientes.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCreditosPendientes();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCreditosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosPendientes,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CreditosPendientesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO,creditospendientesConstantesFunciones.resaltarSeleccionarCreditosPendientes,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CreditosPendientesConstantesFunciones.SCLASSWEBTITULO,creditospendientesConstantesFunciones.resaltarSeleccionarCreditosPendientes,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCreditosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosPendientes,CreditosPendientesConstantesFunciones.LABEL_ID));

		if(this.creditospendientesConstantesFunciones.mostraridCreditosPendientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CreditosPendientesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.creditospendientesConstantesFunciones.resaltaridCreditosPendientes,this.creditospendientesConstantesFunciones.activaridCreditosPendientes,iSizeTabla,this,true,"idCreditosPendientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.creditospendientesConstantesFunciones.resaltaridCreditosPendientes,this.creditospendientesConstantesFunciones.activaridCreditosPendientes,this,true,"idCreditosPendientes","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCreditosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosPendientes,CreditosPendientesConstantesFunciones.LABEL_CODIGO));

		if(this.creditospendientesConstantesFunciones.mostrarcodigoCreditosPendientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CreditosPendientesConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.creditospendientesConstantesFunciones.resaltarcodigoCreditosPendientes,this.creditospendientesConstantesFunciones.activarcodigoCreditosPendientes,iSizeTabla,this,true,"codigoCreditosPendientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.creditospendientesConstantesFunciones.resaltarcodigoCreditosPendientes,this.creditospendientesConstantesFunciones.activarcodigoCreditosPendientes,this,true,"codigoCreditosPendientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CreditosPendientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCreditosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosPendientes,CreditosPendientesConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.creditospendientesConstantesFunciones.mostrarnombre_completoCreditosPendientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CreditosPendientesConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.creditospendientesConstantesFunciones.resaltarnombre_completoCreditosPendientes,this.creditospendientesConstantesFunciones.activarnombre_completoCreditosPendientes,iSizeTabla,this,true,"nombre_completoCreditosPendientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.creditospendientesConstantesFunciones.resaltarnombre_completoCreditosPendientes,this.creditospendientesConstantesFunciones.activarnombre_completoCreditosPendientes,this,true,"nombre_completoCreditosPendientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CreditosPendientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCreditosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosPendientes,CreditosPendientesConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO));

		if(this.creditospendientesConstantesFunciones.mostrarcodigo_tipo_prestamoCreditosPendientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CreditosPendientesConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.creditospendientesConstantesFunciones.resaltarcodigo_tipo_prestamoCreditosPendientes,this.creditospendientesConstantesFunciones.activarcodigo_tipo_prestamoCreditosPendientes,iSizeTabla,this,true,"codigo_tipo_prestamoCreditosPendientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.creditospendientesConstantesFunciones.resaltarcodigo_tipo_prestamoCreditosPendientes,this.creditospendientesConstantesFunciones.activarcodigo_tipo_prestamoCreditosPendientes,this,true,"codigo_tipo_prestamoCreditosPendientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CreditosPendientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCreditosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosPendientes,CreditosPendientesConstantesFunciones.LABEL_CODIGOPRESTAMO));

		if(this.creditospendientesConstantesFunciones.mostrarcodigo_prestamoCreditosPendientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CreditosPendientesConstantesFunciones.LABEL_CODIGOPRESTAMO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.creditospendientesConstantesFunciones.resaltarcodigo_prestamoCreditosPendientes,this.creditospendientesConstantesFunciones.activarcodigo_prestamoCreditosPendientes,iSizeTabla,this,true,"codigo_prestamoCreditosPendientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.creditospendientesConstantesFunciones.resaltarcodigo_prestamoCreditosPendientes,this.creditospendientesConstantesFunciones.activarcodigo_prestamoCreditosPendientes,this,true,"codigo_prestamoCreditosPendientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CreditosPendientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCreditosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosPendientes,CreditosPendientesConstantesFunciones.LABEL_NUMERO));

		if(this.creditospendientesConstantesFunciones.mostrarnumeroCreditosPendientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CreditosPendientesConstantesFunciones.LABEL_NUMERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.creditospendientesConstantesFunciones.resaltarnumeroCreditosPendientes,this.creditospendientesConstantesFunciones.activarnumeroCreditosPendientes,iSizeTabla,this,true,"numeroCreditosPendientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.creditospendientesConstantesFunciones.resaltarnumeroCreditosPendientes,this.creditospendientesConstantesFunciones.activarnumeroCreditosPendientes,this,true,"numeroCreditosPendientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CreditosPendientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCreditosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosPendientes,CreditosPendientesConstantesFunciones.LABEL_MONTOCAPITAL));

		if(this.creditospendientesConstantesFunciones.mostrarmonto_capitalCreditosPendientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CreditosPendientesConstantesFunciones.LABEL_MONTOCAPITAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.creditospendientesConstantesFunciones.resaltarmonto_capitalCreditosPendientes,this.creditospendientesConstantesFunciones.activarmonto_capitalCreditosPendientes,iSizeTabla,this,true,"monto_capitalCreditosPendientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.creditospendientesConstantesFunciones.resaltarmonto_capitalCreditosPendientes,this.creditospendientesConstantesFunciones.activarmonto_capitalCreditosPendientes,this,true,"monto_capitalCreditosPendientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CreditosPendientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCreditosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosPendientes,CreditosPendientesConstantesFunciones.LABEL_MONTOINTERES));

		if(this.creditospendientesConstantesFunciones.mostrarmonto_interesCreditosPendientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CreditosPendientesConstantesFunciones.LABEL_MONTOINTERES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.creditospendientesConstantesFunciones.resaltarmonto_interesCreditosPendientes,this.creditospendientesConstantesFunciones.activarmonto_interesCreditosPendientes,iSizeTabla,this,true,"monto_interesCreditosPendientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.creditospendientesConstantesFunciones.resaltarmonto_interesCreditosPendientes,this.creditospendientesConstantesFunciones.activarmonto_interesCreditosPendientes,this,true,"monto_interesCreditosPendientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CreditosPendientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCreditosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosPendientes,CreditosPendientesConstantesFunciones.LABEL_VALOR));

		if(this.creditospendientesConstantesFunciones.mostrarvalorCreditosPendientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CreditosPendientesConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.creditospendientesConstantesFunciones.resaltarvalorCreditosPendientes,this.creditospendientesConstantesFunciones.activarvalorCreditosPendientes,iSizeTabla,this,true,"valorCreditosPendientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.creditospendientesConstantesFunciones.resaltarvalorCreditosPendientes,this.creditospendientesConstantesFunciones.activarvalorCreditosPendientes,this,true,"valorCreditosPendientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CreditosPendientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCreditosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCreditosPendientes,CreditosPendientesConstantesFunciones.LABEL_SALDO));

		if(this.creditospendientesConstantesFunciones.mostrarsaldoCreditosPendientes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CreditosPendientesConstantesFunciones.LABEL_SALDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.creditospendientesConstantesFunciones.resaltarsaldoCreditosPendientes,this.creditospendientesConstantesFunciones.activarsaldoCreditosPendientes,iSizeTabla,this,true,"saldoCreditosPendientes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.creditospendientesConstantesFunciones.resaltarsaldoCreditosPendientes,this.creditospendientesConstantesFunciones.activarsaldoCreditosPendientes,this,true,"saldoCreditosPendientes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CreditosPendientesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.creditospendientesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.creditospendientesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.creditospendientesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCreditosPendientes.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.creditospendientesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.creditospendientesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCreditosPendientes.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCreditosPendientes && this.isPermisoGuardarCambiosCreditosPendientes) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.creditospendientesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.creditospendientesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCreditosPendientes.addColumn(tableColumn);
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
			
			this.jTableDatosCreditosPendientes.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCreditosPendientes && this.isPermisoGuardarCambiosCreditosPendientes) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCreditosPendientes && this.isPermisoGuardarCambiosCreditosPendientes) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCreditosPendientes.moveColumn(this.jTableDatosCreditosPendientes.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCreditosPendientes.moveColumn(this.jTableDatosCreditosPendientes.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCreditosPendientes.moveColumn(this.jTableDatosCreditosPendientes.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCreditosPendientes.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCreditosPendientes.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCreditosPendientes,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CreditosPendientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCreditosPendientes.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCreditosPendientes.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CreditosPendientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CreditosPendientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCreditosPendientes.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCreditosPendientes.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCreditosPendientes.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=creditospendientesLogic.getCreditosPendientess().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=creditospendientess.size()-1;
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
		//this.jTableDatosCreditosPendientes.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCreditosPendientes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCreditosPendientes();
			
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
				
				//this.isEsNuevoCreditosPendientes=false;
					
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
			
				if(this.creditospendientesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCreditosPendientes==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCreditosPendientes.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCreditosPendientes.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.creditospendientes.getsType().equals("DUPLICADO")
				   || this.creditospendientes.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCreditosPendientes=true;
				
				} else {
					this.isEsNuevoCreditosPendientes=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.creditospendientesSessionBean.getEsGuardarRelacionado()) {
					if(this.creditospendientes.getId()>=0 && !this.creditospendientes.getIsNew()) {						
						this.isEsNuevoCreditosPendientes=false;
						
					} else {
						this.isEsNuevoCreditosPendientes=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCreditosPendientes(esRelaciones);						
				
				this.seleccionarCreditosPendientes(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.creditospendientes.getId()<0) {
					this.isEsNuevoCreditosPendientes=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCreditosPendientes(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCreditosPendientes(evt,rowIndex);
				}	
				
				if(this.creditospendientesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CreditosPendientes: " + this.dDif); 
					}
				}								
				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCreditosPendientes(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.creditospendientes)) {
					if(this.creditospendientes.getId()>0) {
						this.creditospendientes.setIsDeleted(true);
						
						this.creditospendientessEliminados.add(this.creditospendientes);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.creditospendientesLogic.getCreditosPendientess().remove(this.creditospendientes);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.creditospendientess.remove(this.creditospendientes);				
					}
					
					
					((CreditosPendientesModel) this.jTableDatosCreditosPendientes.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCreditosPendientes(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCreditosPendientes(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCreditosPendientes) {
			
			if(this.jInternalFrameDetalleFormCreditosPendientes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCreditosPendientes.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCreditosPendientes.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CreditosPendientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCreditosPendientes(this.creditospendientes);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCreditosPendientes("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCreditosPendientes(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCreditosPendientes() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCreditosPendientes(CreditosPendientes creditospendientes) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCreditosPendientes(creditospendientes,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCreditosPendientes(CreditosPendientes creditospendientes,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCreditosPendientes(creditospendientes);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCreditosPendientes(creditospendientes,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCreditosPendientes(creditospendientes);
	}
	
	public void setVariablesObjetoActualToFormularioCreditosPendientes(CreditosPendientes creditospendientes) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCreditosPendientes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCreditosPendientes.jLabelidCreditosPendientes.setText(creditospendientes.getId().toString());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigoCreditosPendientes.setText(creditospendientes.getcodigo());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextAreanombre_completoCreditosPendientes.setText(creditospendientes.getnombre_completo());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigo_tipo_prestamoCreditosPendientes.setText(creditospendientes.getcodigo_tipo_prestamo());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigo_prestamoCreditosPendientes.setText(creditospendientes.getcodigo_prestamo());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldnumeroCreditosPendientes.setText(creditospendientes.getnumero().toString());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldmonto_capitalCreditosPendientes.setText(creditospendientes.getmonto_capital().toString());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldmonto_interesCreditosPendientes.setText(creditospendientes.getmonto_interes().toString());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldvalorCreditosPendientes.setText(creditospendientes.getvalor().toString());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldsaldoCreditosPendientes.setText(creditospendientes.getsaldo().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CreditosPendientes creditospendientesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,creditospendientesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CreditosPendientes creditospendientesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				creditospendientesLocal=this.creditospendientes;
			} else {
				creditospendientesLocal=this.creditospendientesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(creditospendientesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCreditosPendientes(creditospendientesLocal,true);
					
					if(creditospendientesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(creditospendientesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.creditospendientesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(creditospendientesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCreditosPendientes(CreditosPendientes creditospendientes,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCreditosPendientes(creditospendientes,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(creditospendientes);
	}
	
	public void setVariablesFormularioToObjetoActualCreditosPendientes(CreditosPendientes creditospendientes,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCreditosPendientes(creditospendientes,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCreditosPendientes(CreditosPendientes creditospendientes,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCreditosPendientes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCreditosPendientes.jLabelidCreditosPendientes.getText()==null || this.jInternalFrameDetalleFormCreditosPendientes.jLabelidCreditosPendientes.getText()=="" || this.jInternalFrameDetalleFormCreditosPendientes.jLabelidCreditosPendientes.getText()=="Id") {
				this.jInternalFrameDetalleFormCreditosPendientes.jLabelidCreditosPendientes.setText("0");
			}

			if(conColumnasBase) {creditospendientes.setId(Long.parseLong(this.jInternalFrameDetalleFormCreditosPendientes.jLabelidCreditosPendientes.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CreditosPendientesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosPendientes.jLabelIdCreditosPendientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			creditospendientes.setcodigo(this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigoCreditosPendientes.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CreditosPendientesConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosPendientes.jLabelcodigoCreditosPendientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			creditospendientes.setnombre_completo(this.jInternalFrameDetalleFormCreditosPendientes.jTextAreanombre_completoCreditosPendientes.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CreditosPendientesConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosPendientes.jLabelnombre_completoCreditosPendientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			creditospendientes.setcodigo_tipo_prestamo(this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigo_tipo_prestamoCreditosPendientes.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CreditosPendientesConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosPendientes.jLabelcodigo_tipo_prestamoCreditosPendientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			creditospendientes.setcodigo_prestamo(this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigo_prestamoCreditosPendientes.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CreditosPendientesConstantesFunciones.LABEL_CODIGOPRESTAMO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosPendientes.jLabelcodigo_prestamoCreditosPendientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			creditospendientes.setnumero(Integer.parseInt(this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldnumeroCreditosPendientes.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CreditosPendientesConstantesFunciones.LABEL_NUMERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosPendientes.jLabelnumeroCreditosPendientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			creditospendientes.setmonto_capital(Double.parseDouble(this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldmonto_capitalCreditosPendientes.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CreditosPendientesConstantesFunciones.LABEL_MONTOCAPITAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosPendientes.jLabelmonto_capitalCreditosPendientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			creditospendientes.setmonto_interes(Double.parseDouble(this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldmonto_interesCreditosPendientes.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CreditosPendientesConstantesFunciones.LABEL_MONTOINTERES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosPendientes.jLabelmonto_interesCreditosPendientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			creditospendientes.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldvalorCreditosPendientes.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CreditosPendientesConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosPendientes.jLabelvalorCreditosPendientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			creditospendientes.setsaldo(Double.parseDouble(this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldsaldoCreditosPendientes.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CreditosPendientesConstantesFunciones.LABEL_SALDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCreditosPendientes.jLabelsaldoCreditosPendientes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCreditosPendientes(CreditosPendientes creditospendientesBean,CreditosPendientes creditospendientes,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCreditosPendientes(CreditosPendientes creditospendientesOrigen,CreditosPendientes creditospendientes,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && creditospendientesOrigen.getId()!=null && !creditospendientesOrigen.getId().equals(0L))) {creditospendientes.setId(creditospendientesOrigen.getId());}}
			if(conDefault || (!conDefault && creditospendientesOrigen.getfecha_vencimiento_desde()!=null && !creditospendientesOrigen.getfecha_vencimiento_desde().equals(new Date()))) {creditospendientes.setfecha_vencimiento_desde(creditospendientesOrigen.getfecha_vencimiento_desde());}
			if(conDefault || (!conDefault && creditospendientesOrigen.getfecha_vencimiento_hasta()!=null && !creditospendientesOrigen.getfecha_vencimiento_hasta().equals(new Date()))) {creditospendientes.setfecha_vencimiento_hasta(creditospendientesOrigen.getfecha_vencimiento_hasta());}
			if(conDefault || (!conDefault && creditospendientesOrigen.getcodigo()!=null && !creditospendientesOrigen.getcodigo().equals(""))) {creditospendientes.setcodigo(creditospendientesOrigen.getcodigo());}
			if(conDefault || (!conDefault && creditospendientesOrigen.getnombre_completo()!=null && !creditospendientesOrigen.getnombre_completo().equals(""))) {creditospendientes.setnombre_completo(creditospendientesOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && creditospendientesOrigen.getcodigo_tipo_prestamo()!=null && !creditospendientesOrigen.getcodigo_tipo_prestamo().equals(""))) {creditospendientes.setcodigo_tipo_prestamo(creditospendientesOrigen.getcodigo_tipo_prestamo());}
			if(conDefault || (!conDefault && creditospendientesOrigen.getcodigo_prestamo()!=null && !creditospendientesOrigen.getcodigo_prestamo().equals(""))) {creditospendientes.setcodigo_prestamo(creditospendientesOrigen.getcodigo_prestamo());}
			if(conDefault || (!conDefault && creditospendientesOrigen.getnumero()!=null && !creditospendientesOrigen.getnumero().equals(0))) {creditospendientes.setnumero(creditospendientesOrigen.getnumero());}
			if(conDefault || (!conDefault && creditospendientesOrigen.getmonto_capital()!=null && !creditospendientesOrigen.getmonto_capital().equals(0.0))) {creditospendientes.setmonto_capital(creditospendientesOrigen.getmonto_capital());}
			if(conDefault || (!conDefault && creditospendientesOrigen.getmonto_interes()!=null && !creditospendientesOrigen.getmonto_interes().equals(0.0))) {creditospendientes.setmonto_interes(creditospendientesOrigen.getmonto_interes());}
			if(conDefault || (!conDefault && creditospendientesOrigen.getvalor()!=null && !creditospendientesOrigen.getvalor().equals(0.0))) {creditospendientes.setvalor(creditospendientesOrigen.getvalor());}
			if(conDefault || (!conDefault && creditospendientesOrigen.getsaldo()!=null && !creditospendientesOrigen.getsaldo().equals(0.0))) {creditospendientes.setsaldo(creditospendientesOrigen.getsaldo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCreditosPendientes(CreditosPendientes creditospendientes) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCreditosPendientes.jLabelidCreditosPendientes.setText(creditospendientes.getId().toString());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigoCreditosPendientes.setText(creditospendientes.getcodigo());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextAreanombre_completoCreditosPendientes.setText(creditospendientes.getnombre_completo());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigo_tipo_prestamoCreditosPendientes.setText(creditospendientes.getcodigo_tipo_prestamo());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigo_prestamoCreditosPendientes.setText(creditospendientes.getcodigo_prestamo());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldnumeroCreditosPendientes.setText(creditospendientes.getnumero().toString());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldmonto_capitalCreditosPendientes.setText(creditospendientes.getmonto_capital().toString());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldmonto_interesCreditosPendientes.setText(creditospendientes.getmonto_interes().toString());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldvalorCreditosPendientes.setText(creditospendientes.getvalor().toString());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldsaldoCreditosPendientes.setText(creditospendientes.getsaldo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCreditosPendientes(CreditosPendientesBean creditospendientesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCreditosPendientes.jLabelidCreditosPendientes.setText(creditospendientesBean.getId().toString());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigoCreditosPendientes.setText(creditospendientesBean.getcodigo());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextAreanombre_completoCreditosPendientes.setText(creditospendientesBean.getnombre_completo());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigo_tipo_prestamoCreditosPendientes.setText(creditospendientesBean.getcodigo_tipo_prestamo());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigo_prestamoCreditosPendientes.setText(creditospendientesBean.getcodigo_prestamo());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldnumeroCreditosPendientes.setText(creditospendientesBean.getnumero().toString());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldmonto_capitalCreditosPendientes.setText(creditospendientesBean.getmonto_capital().toString());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldmonto_interesCreditosPendientes.setText(creditospendientesBean.getmonto_interes().toString());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldvalorCreditosPendientes.setText(creditospendientesBean.getvalor().toString());
			this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldsaldoCreditosPendientes.setText(creditospendientesBean.getsaldo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCreditosPendientes(CreditosPendientesParameterReturnGeneral creditospendientesReturnGeneral,CreditosPendientesBean creditospendientesBean,Boolean conDefault) throws Exception { 
		try {
			CreditosPendientes creditospendientesLocal=new CreditosPendientes();
			
			creditospendientesLocal=creditospendientesReturnGeneral.getCreditosPendientes();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && creditospendientesLocal.getId()!=null && !creditospendientesLocal.getId().equals(0L))) {creditospendientesBean.setId(creditospendientesLocal.getId());}}
			if(conDefault || (!conDefault && creditospendientesLocal.getcodigo()!=null && !creditospendientesLocal.getcodigo().equals(""))) {creditospendientesBean.setcodigo(creditospendientesLocal.getcodigo());}
			if(conDefault || (!conDefault && creditospendientesLocal.getnombre_completo()!=null && !creditospendientesLocal.getnombre_completo().equals(""))) {creditospendientesBean.setnombre_completo(creditospendientesLocal.getnombre_completo());}
			if(conDefault || (!conDefault && creditospendientesLocal.getcodigo_tipo_prestamo()!=null && !creditospendientesLocal.getcodigo_tipo_prestamo().equals(""))) {creditospendientesBean.setcodigo_tipo_prestamo(creditospendientesLocal.getcodigo_tipo_prestamo());}
			if(conDefault || (!conDefault && creditospendientesLocal.getcodigo_prestamo()!=null && !creditospendientesLocal.getcodigo_prestamo().equals(""))) {creditospendientesBean.setcodigo_prestamo(creditospendientesLocal.getcodigo_prestamo());}
			if(conDefault || (!conDefault && creditospendientesLocal.getnumero()!=null && !creditospendientesLocal.getnumero().equals(0))) {creditospendientesBean.setnumero(creditospendientesLocal.getnumero());}
			if(conDefault || (!conDefault && creditospendientesLocal.getmonto_capital()!=null && !creditospendientesLocal.getmonto_capital().equals(0.0))) {creditospendientesBean.setmonto_capital(creditospendientesLocal.getmonto_capital());}
			if(conDefault || (!conDefault && creditospendientesLocal.getmonto_interes()!=null && !creditospendientesLocal.getmonto_interes().equals(0.0))) {creditospendientesBean.setmonto_interes(creditospendientesLocal.getmonto_interes());}
			if(conDefault || (!conDefault && creditospendientesLocal.getvalor()!=null && !creditospendientesLocal.getvalor().equals(0.0))) {creditospendientesBean.setvalor(creditospendientesLocal.getvalor());}
			if(conDefault || (!conDefault && creditospendientesLocal.getsaldo()!=null && !creditospendientesLocal.getsaldo().equals(0.0))) {creditospendientesBean.setsaldo(creditospendientesLocal.getsaldo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCreditosPendientesGenerico(Long idCreditosPendientesSeleccionado,JComboBox jComboBoxCreditosPendientes,List<CreditosPendientes> creditospendientessLocal)throws Exception {
		try {
			CreditosPendientes  creditospendientesTemp=null;

			for(CreditosPendientes creditospendientesAux:creditospendientessLocal) {
				if(creditospendientesAux.getId()!=null && creditospendientesAux.getId().equals(idCreditosPendientesSeleccionado)) {
					creditospendientesTemp=creditospendientesAux;
					break;
				}
			}

			jComboBoxCreditosPendientes.setSelectedItem(creditospendientesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCreditosPendientesGenerico(JComboBox jComboBoxCreditosPendientes,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCreditosPendientes.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCreditosPendientes.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCreditosPendientes.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCreditosPendientes.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCreditosPendientes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCreditosPendientes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			creditospendientes=(CreditosPendientes) creditospendientesLogic.getCreditosPendientess().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			creditospendientes =(CreditosPendientes) creditospendientess.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Cargo")) {
			//sDescripcion=this.getActualCargoForeignKeyDescripcion((Long)value);
			if(!creditospendientes.getIsNew() && !creditospendientes.getIsChanged() && !creditospendientes.getIsDeleted()) {
				sDescripcion=creditospendientes.getcargo_descripcion();
			} else {
				//sDescripcion=this.getActualCargoForeignKeyDescripcion((Long)value);
				sDescripcion=creditospendientes.getcargo_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!creditospendientes.getIsNew() && !creditospendientes.getIsChanged() && !creditospendientes.getIsDeleted()) {
				sDescripcion=creditospendientes.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=creditospendientes.getestructura_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!creditospendientes.getIsNew() && !creditospendientes.getIsChanged() && !creditospendientes.getIsDeleted()) {
				sDescripcion=creditospendientes.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=creditospendientes.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!creditospendientes.getIsNew() && !creditospendientes.getIsChanged() && !creditospendientes.getIsDeleted()) {
				sDescripcion=creditospendientes.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=creditospendientes.getempleado_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CreditosPendientes creditospendientesRow=new CreditosPendientes();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			creditospendientesRow=(CreditosPendientes) creditospendientesLogic.getCreditosPendientess().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			creditospendientesRow=(CreditosPendientes) creditospendientess.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCreditosPendientes(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCreditosPendientes.setVisible((this.isVisibilidadCeldaNuevoCreditosPendientes && this.isPermisoNuevoCreditosPendientes));			
			this.jButtonDuplicarCreditosPendientes.setVisible((this.isVisibilidadCeldaDuplicarCreditosPendientes && this.isPermisoDuplicarCreditosPendientes));			
			this.jButtonCopiarCreditosPendientes.setVisible((this.isVisibilidadCeldaCopiarCreditosPendientes && this.isPermisoCopiarCreditosPendientes));
			this.jButtonVerFormCreditosPendientes.setVisible((this.isVisibilidadCeldaVerFormCreditosPendientes && this.isPermisoVerFormCreditosPendientes));
			
			this.jButtonAbrirOrderByCreditosPendientes.setVisible((this.isVisibilidadCeldaOrdenCreditosPendientes && this.isPermisoOrdenCreditosPendientes));			
			
			this.jButtonNuevoRelacionesCreditosPendientes.setVisible((this.isVisibilidadCeldaNuevoRelacionesCreditosPendientes && this.isPermisoNuevoCreditosPendientes));			
			this.jButtonNuevoGuardarCambiosCreditosPendientes.setVisible((this.isVisibilidadCeldaNuevoCreditosPendientes && this.isPermisoNuevoCreditosPendientes && this.isPermisoGuardarCambiosCreditosPendientes));
			
			if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonModificarCreditosPendientes.setVisible((this.isVisibilidadCeldaModificarCreditosPendientes && this.isPermisoActualizarCreditosPendientes));	
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonActualizarCreditosPendientes.setVisible((this.isVisibilidadCeldaActualizarCreditosPendientes && this.isPermisoActualizarCreditosPendientes));	
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonEliminarCreditosPendientes.setVisible((this.isVisibilidadCeldaEliminarCreditosPendientes && this.isPermisoEliminarCreditosPendientes));
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonCancelarCreditosPendientes.setVisible(this.isVisibilidadCeldaCancelarCreditosPendientes);							
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonGuardarCambiosCreditosPendientes.setVisible((this.isVisibilidadCeldaGuardarCreditosPendientes && this.isPermisoGuardarCambiosCreditosPendientes));			
			
			}
						
			this.jButtonGuardarCambiosTablaCreditosPendientes.setVisible((this.isVisibilidadCeldaGuardarCambiosCreditosPendientes && this.isPermisoGuardarCambiosCreditosPendientes));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCreditosPendientes.setVisible((this.isVisibilidadCeldaNuevoCreditosPendientes && this.isPermisoNuevoCreditosPendientes));						
			this.jButtonDuplicarToolBarCreditosPendientes.setVisible((this.isVisibilidadCeldaDuplicarCreditosPendientes && this.isPermisoDuplicarCreditosPendientes));						
			this.jButtonCopiarToolBarCreditosPendientes.setVisible((this.isVisibilidadCeldaCopiarCreditosPendientes && this.isPermisoCopiarCreditosPendientes));			
			this.jButtonVerFormToolBarCreditosPendientes.setVisible((this.isVisibilidadCeldaVerFormCreditosPendientes && this.isPermisoVerFormCreditosPendientes));			
			this.jButtonAbrirOrderByToolBarCreditosPendientes.setVisible((this.isVisibilidadCeldaOrdenCreditosPendientes && this.isPermisoOrdenCreditosPendientes));
			this.jButtonNuevoRelacionesToolBarCreditosPendientes.setVisible((this.isVisibilidadCeldaNuevoRelacionesCreditosPendientes && this.isPermisoNuevoCreditosPendientes));			
			this.jButtonNuevoGuardarCambiosToolBarCreditosPendientes.setVisible((this.isVisibilidadCeldaNuevoCreditosPendientes && this.isPermisoNuevoCreditosPendientes && this.isPermisoGuardarCambiosCreditosPendientes));			
			
			if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonModificarToolBarCreditosPendientes.setVisible((this.isVisibilidadCeldaModificarCreditosPendientes && this.isPermisoActualizarCreditosPendientes));	
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonActualizarToolBarCreditosPendientes.setVisible((this.isVisibilidadCeldaActualizarCreditosPendientes  && this.isPermisoActualizarCreditosPendientes));	
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonEliminarToolBarCreditosPendientes.setVisible((this.isVisibilidadCeldaEliminarCreditosPendientes && this.isPermisoEliminarCreditosPendientes));
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonCancelarToolBarCreditosPendientes.setVisible(this.isVisibilidadCeldaCancelarCreditosPendientes);				
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonGuardarCambiosToolBarCreditosPendientes.setVisible((this.isVisibilidadCeldaGuardarCreditosPendientes && this.isPermisoGuardarCambiosCreditosPendientes));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCreditosPendientes.setVisible((this.isVisibilidadCeldaGuardarCambiosCreditosPendientes && this.isPermisoGuardarCambiosCreditosPendientes));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCreditosPendientes.setVisible((this.isVisibilidadCeldaNuevoCreditosPendientes && this.isPermisoNuevoCreditosPendientes));			
			this.jMenuItemDuplicarCreditosPendientes.setVisible((this.isVisibilidadCeldaDuplicarCreditosPendientes && this.isPermisoDuplicarCreditosPendientes));			
			this.jMenuItemCopiarCreditosPendientes.setVisible((this.isVisibilidadCeldaCopiarCreditosPendientes && this.isPermisoCopiarCreditosPendientes));			
			this.jMenuItemVerFormCreditosPendientes.setVisible((this.isVisibilidadCeldaVerFormCreditosPendientes && this.isPermisoVerFormCreditosPendientes));			
			this.jMenuItemAbrirOrderByCreditosPendientes.setVisible((this.isVisibilidadCeldaOrdenCreditosPendientes && this.isPermisoOrdenCreditosPendientes));			
			//this.jMenuItemMostrarOcultarCreditosPendientes.setVisible((this.isVisibilidadCeldaOrdenCreditosPendientes && this.isPermisoOrdenCreditosPendientes));
			this.jMenuItemDetalleAbrirOrderByCreditosPendientes.setVisible((this.isVisibilidadCeldaOrdenCreditosPendientes && this.isPermisoOrdenCreditosPendientes));			
			//this.jMenuItemDetalleMostrarOcultarCreditosPendientes.setVisible((this.isVisibilidadCeldaOrdenCreditosPendientes && this.isPermisoOrdenCreditosPendientes));			
			this.jMenuItemNuevoRelacionesCreditosPendientes.setVisible((this.isVisibilidadCeldaNuevoRelacionesCreditosPendientes && this.isPermisoNuevoCreditosPendientes));			
			this.jMenuItemNuevoGuardarCambiosCreditosPendientes.setVisible((this.isVisibilidadCeldaNuevoCreditosPendientes && this.isPermisoNuevoCreditosPendientes && this.isPermisoGuardarCambiosCreditosPendientes));									
			
			if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
			this.jInternalFrameDetalleFormCreditosPendientes.jMenuItemModificarCreditosPendientes.setVisible((this.isVisibilidadCeldaModificarCreditosPendientes && this.isPermisoActualizarCreditosPendientes));	
			this.jInternalFrameDetalleFormCreditosPendientes.jMenuItemActualizarCreditosPendientes.setVisible((this.isVisibilidadCeldaActualizarCreditosPendientes && this.isPermisoActualizarCreditosPendientes));	
			this.jInternalFrameDetalleFormCreditosPendientes.jMenuItemEliminarCreditosPendientes.setVisible((this.isVisibilidadCeldaEliminarCreditosPendientes && this.isPermisoEliminarCreditosPendientes));
			this.jInternalFrameDetalleFormCreditosPendientes.jMenuItemCancelarCreditosPendientes.setVisible(this.isVisibilidadCeldaCancelarCreditosPendientes);				
			}
			
			this.jMenuItemGuardarCambiosCreditosPendientes.setVisible((this.isVisibilidadCeldaGuardarCreditosPendientes && this.isPermisoGuardarCambiosCreditosPendientes));						
			this.jMenuItemGuardarCambiosTablaCreditosPendientes.setVisible((this.isVisibilidadCeldaGuardarCambiosCreditosPendientes && this.isPermisoGuardarCambiosCreditosPendientes));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCreditosPendientes=this.jButtonNuevoCreditosPendientes.isVisible();
			this.isVisibilidadCeldaDuplicarCreditosPendientes=this.jButtonDuplicarCreditosPendientes.isVisible();
			this.isVisibilidadCeldaCopiarCreditosPendientes=this.jButtonCopiarCreditosPendientes.isVisible();
			this.isVisibilidadCeldaVerFormCreditosPendientes=this.jButtonVerFormCreditosPendientes.isVisible();
			
			this.isVisibilidadCeldaOrdenCreditosPendientes=this.jButtonAbrirOrderByCreditosPendientes.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCreditosPendientes=this.jButtonNuevoRelacionesCreditosPendientes.isVisible();
			this.isVisibilidadCeldaModificarCreditosPendientes=this.jButtonModificarCreditosPendientes.isVisible();
			
			if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
			this.isVisibilidadCeldaActualizarCreditosPendientes=this.jInternalFrameDetalleFormCreditosPendientes.jButtonActualizarCreditosPendientes.isVisible();
			this.isVisibilidadCeldaEliminarCreditosPendientes=this.jInternalFrameDetalleFormCreditosPendientes.jButtonEliminarCreditosPendientes.isVisible();
			this.isVisibilidadCeldaCancelarCreditosPendientes=this.jInternalFrameDetalleFormCreditosPendientes.jButtonCancelarCreditosPendientes.isVisible();
			this.isVisibilidadCeldaGuardarCreditosPendientes=this.jInternalFrameDetalleFormCreditosPendientes.jButtonGuardarCambiosCreditosPendientes.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCreditosPendientes=this.jButtonGuardarCambiosTablaCreditosPendientes.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCreditosPendientes=this.jButtonNuevoToolBarCreditosPendientes.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCreditosPendientes=this.jButtonNuevoRelacionesToolBarCreditosPendientes.isVisible();
			
			if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
			this.isVisibilidadCeldaModificarCreditosPendientes=this.jInternalFrameDetalleFormCreditosPendientes.jButtonModificarToolBarCreditosPendientes.isVisible();
			this.isVisibilidadCeldaActualizarCreditosPendientes=this.jInternalFrameDetalleFormCreditosPendientes.jButtonActualizarToolBarCreditosPendientes.isVisible();
			this.isVisibilidadCeldaEliminarCreditosPendientes=this.jInternalFrameDetalleFormCreditosPendientes.jButtonEliminarToolBarCreditosPendientes.isVisible();
			this.isVisibilidadCeldaCancelarCreditosPendientes=this.jInternalFrameDetalleFormCreditosPendientes.jButtonCancelarToolBarCreditosPendientes.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCreditosPendientes=this.jButtonGuardarCambiosToolBarCreditosPendientes.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCreditosPendientes=this.jButtonGuardarCambiosTablaToolBarCreditosPendientes.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCreditosPendientes=this.jMenuItemNuevoCreditosPendientes.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCreditosPendientes=this.jMenuItemNuevoRelacionesCreditosPendientes.isVisible();
			
			if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
			this.isVisibilidadCeldaModificarCreditosPendientes=this.jInternalFrameDetalleFormCreditosPendientes.jMenuItemModificarCreditosPendientes.isVisible();
			this.isVisibilidadCeldaActualizarCreditosPendientes=this.jInternalFrameDetalleFormCreditosPendientes.jMenuItemActualizarCreditosPendientes.isVisible();
			this.isVisibilidadCeldaEliminarCreditosPendientes=this.jInternalFrameDetalleFormCreditosPendientes.jMenuItemEliminarCreditosPendientes.isVisible();
			this.isVisibilidadCeldaCancelarCreditosPendientes=this.jInternalFrameDetalleFormCreditosPendientes.jMenuItemCancelarCreditosPendientes.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCreditosPendientes=this.jMenuItemGuardarCambiosCreditosPendientes.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCreditosPendientes=this.jMenuItemGuardarCambiosTablaCreditosPendientes.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCreditosPendientes(Boolean esInicializar) {
		if(CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.creditospendientesSessionBean.getConGuardarRelaciones()) {
				//if(this.creditospendientesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCreditosPendientes();
			}
			
			this.inicializarActualizarBindingBotonesManualCreditosPendientes(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCreditosPendientes() {
		this.jButtonNuevoCreditosPendientes.setVisible(this.isPermisoNuevoCreditosPendientes);			
		this.jButtonDuplicarCreditosPendientes.setVisible(this.isPermisoDuplicarCreditosPendientes);			
		this.jButtonCopiarCreditosPendientes.setVisible(this.isPermisoCopiarCreditosPendientes);			
		this.jButtonVerFormCreditosPendientes.setVisible(this.isPermisoVerFormCreditosPendientes);			
		
		this.jButtonAbrirOrderByCreditosPendientes.setVisible(this.isPermisoOrdenCreditosPendientes);					
		
		this.jButtonNuevoRelacionesCreditosPendientes.setVisible(this.isPermisoNuevoCreditosPendientes);			
		
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonModificarCreditosPendientes.setVisible(this.isPermisoActualizarCreditosPendientes);	
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonActualizarCreditosPendientes.setVisible(this.isPermisoActualizarCreditosPendientes);	
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonEliminarCreditosPendientes.setVisible(this.isPermisoEliminarCreditosPendientes);
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonCancelarCreditosPendientes.setVisible(this.isVisibilidadCeldaCancelarCreditosPendientes);						
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonGuardarCambiosCreditosPendientes.setVisible(this.isPermisoGuardarCambiosCreditosPendientes);							
		}
		
		this.jButtonGuardarCambiosTablaCreditosPendientes.setVisible(this.isPermisoActualizarCreditosPendientes);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCreditosPendientes() {
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonModificarCreditosPendientes.setVisible(this.isPermisoActualizarCreditosPendientes);	
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonActualizarCreditosPendientes.setVisible(this.isPermisoActualizarCreditosPendientes);	
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonEliminarCreditosPendientes.setVisible(this.isPermisoEliminarCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonCancelarCreditosPendientes.setVisible(this.isVisibilidadCeldaCancelarCreditosPendientes);							
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonGuardarCambiosCreditosPendientes.setVisible((this.isVisibilidadCeldaGuardarCreditosPendientes && this.isPermisoGuardarCambiosCreditosPendientes));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCreditosPendientes() {
		if(CreditosPendientesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCreditosPendientes();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCreditosPendientes() {
	}
	
	public void jTableDatosCreditosPendientesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCreditosPendientes(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCreditosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.getcreditospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditospendientes==null) {
						this.creditospendientes = new CreditosPendientes();
					}

					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.creditospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
				}

				if(this.creditospendientes.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.creditospendientes.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cargoCreditosPendientesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocargo=true;

			idTienePermisocargo=this.tienePermisosUsuarioEnPaginaWebCreditosPendientes(CargoConstantesFunciones.CLASSNAME);

			if(idTienePermisocargo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCreditosPendientes.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCreditosPendientes.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCreditosPendientes(this.getcreditospendientes(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);

				this.cargoBeanSwingJInternalFrame=new CargoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cargoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cargoBeanSwingJInternalFrame.getCargoLogic().setConnexion(this.creditospendientesLogic.getConnexion());

				if(this.creditospendientes.getid_cargo()!=null) {
					this.cargoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cargoBeanSwingJInternalFrame.setIdActual(this.creditospendientes.getid_cargo());
					this.cargoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cargoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cargoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargo();
				}

				JInternalFrameBase jinternalFrame =this.cargoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCreditosPendientes=(TitledBorder)this.jScrollPanelDatosCreditosPendientes.getBorder();
				TitledBorder titledBordercargo=(TitledBorder)this.cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.getBorder();

				titledBordercargo.setTitle(titledBorderCreditosPendientes.getTitle() + " -> Cargo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cargoCreditosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.getcreditospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditospendientes==null) {
						this.creditospendientes = new CreditosPendientes();
					}

					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.creditospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
				}

				if(this.creditospendientes.getid_cargo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cargo = "+this.creditospendientes.getid_cargo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraCreditosPendientesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebCreditosPendientes(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCreditosPendientes.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCreditosPendientes.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCreditosPendientes(this.getcreditospendientes(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.creditospendientesLogic.getConnexion());

				if(this.creditospendientes.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.creditospendientes.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCreditosPendientes=(TitledBorder)this.jScrollPanelDatosCreditosPendientes.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderCreditosPendientes.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraCreditosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.getcreditospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditospendientes==null) {
						this.creditospendientes = new CreditosPendientes();
					}

					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.creditospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
				}

				if(this.creditospendientes.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.creditospendientes.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCreditosPendientesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCreditosPendientes(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCreditosPendientes.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCreditosPendientes.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCreditosPendientes(this.getcreditospendientes(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.creditospendientesLogic.getConnexion());

				if(this.creditospendientes.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.creditospendientes.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCreditosPendientes=(TitledBorder)this.jScrollPanelDatosCreditosPendientes.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCreditosPendientes.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCreditosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.getcreditospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditospendientes==null) {
						this.creditospendientes = new CreditosPendientes();
					}

					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.creditospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
				}

				if(this.creditospendientes.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.creditospendientes.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoCreditosPendientesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebCreditosPendientes(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCreditosPendientes.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCreditosPendientes.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCreditosPendientes(this.getcreditospendientes(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.creditospendientesLogic.getConnexion());

				if(this.creditospendientes.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.creditospendientes.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCreditosPendientes=(TitledBorder)this.jScrollPanelDatosCreditosPendientes.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderCreditosPendientes.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoCreditosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.getcreditospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditospendientes==null) {
						this.creditospendientes = new CreditosPendientes();
					}

					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.creditospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
				}

				if(this.creditospendientes.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.creditospendientes.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimiento_desdeCreditosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.getcreditospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditospendientes==null) {
						this.creditospendientes = new CreditosPendientes();
					}

					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.creditospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
				}

				if(this.creditospendientes.getfecha_vencimiento_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento_desde = '"+Funciones2.getStringPostgresDate(this.creditospendientes.getfecha_vencimiento_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimiento_hastaCreditosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.getcreditospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditospendientes==null) {
						this.creditospendientes = new CreditosPendientes();
					}

					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.creditospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
				}

				if(this.creditospendientes.getfecha_vencimiento_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento_hasta = '"+Funciones2.getStringPostgresDate(this.creditospendientes.getfecha_vencimiento_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCreditosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.getcreditospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditospendientes==null) {
						this.creditospendientes = new CreditosPendientes();
					}

					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.creditospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
				}

				if(this.creditospendientes.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.creditospendientes.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoCreditosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.getcreditospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditospendientes==null) {
						this.creditospendientes = new CreditosPendientes();
					}

					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.creditospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
				}

				if(this.creditospendientes.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.creditospendientes.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_tipo_prestamoCreditosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.getcreditospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditospendientes==null) {
						this.creditospendientes = new CreditosPendientes();
					}

					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.creditospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
				}

				if(this.creditospendientes.getcodigo_tipo_prestamo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_tipo_prestamo like '%"+this.creditospendientes.getcodigo_tipo_prestamo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_prestamoCreditosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.getcreditospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditospendientes==null) {
						this.creditospendientes = new CreditosPendientes();
					}

					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.creditospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
				}

				if(this.creditospendientes.getcodigo_prestamo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_prestamo like '%"+this.creditospendientes.getcodigo_prestamo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeroCreditosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.getcreditospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditospendientes==null) {
						this.creditospendientes = new CreditosPendientes();
					}

					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.creditospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
				}

				if(this.creditospendientes.getnumero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero = "+this.creditospendientes.getnumero().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmonto_capitalCreditosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.getcreditospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditospendientes==null) {
						this.creditospendientes = new CreditosPendientes();
					}

					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.creditospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
				}

				if(this.creditospendientes.getmonto_capital()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto_capital = "+this.creditospendientes.getmonto_capital().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmonto_interesCreditosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.getcreditospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditospendientes==null) {
						this.creditospendientes = new CreditosPendientes();
					}

					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.creditospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
				}

				if(this.creditospendientes.getmonto_interes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto_interes = "+this.creditospendientes.getmonto_interes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorCreditosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.getcreditospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditospendientes==null) {
						this.creditospendientes = new CreditosPendientes();
					}

					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.creditospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
				}

				if(this.creditospendientes.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.creditospendientes.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldoCreditosPendientesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.getcreditospendientes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.creditospendientes==null) {
						this.creditospendientes = new CreditosPendientes();
					}

					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.creditospendientes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);
				}

				if(this.creditospendientes.getsaldo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo = "+this.creditospendientes.getsaldo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCreditosPendientes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaCreditosPendientesCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCreditosPendientes(false,false);

			this.getCreditosPendientessBusquedaCreditosPendientes();

			this.inicializarActualizarBindingCreditosPendientes(false);

			//if(CreditosPendientesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCreditosPendientes(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCargoCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCreditosPendientes(false,false);

			this.getCreditosPendientessFK_IdCargo();

			this.inicializarActualizarBindingCreditosPendientes(false);

			//if(CreditosPendientesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCreditosPendientes(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCreditosPendientes(false,false);

			this.getCreditosPendientessFK_IdEmpleado();

			this.inicializarActualizarBindingCreditosPendientes(false);

			//if(CreditosPendientesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCreditosPendientes(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCreditosPendientes(false,false);

			this.getCreditosPendientessFK_IdEmpresa();

			this.inicializarActualizarBindingCreditosPendientes(false);

			//if(CreditosPendientesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCreditosPendientes(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraCreditosPendientesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCreditosPendientes(false,false);

			this.getCreditosPendientessFK_IdEstructura();

			this.inicializarActualizarBindingCreditosPendientes(false);

			//if(CreditosPendientesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCreditosPendientes(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.creditospendientesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCreditosPendientes() {
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
			this.jInternalFrameDetalleFormCreditosPendientes.setVisible(false);	    			
			this.jInternalFrameDetalleFormCreditosPendientes.dispose();
			this.jInternalFrameDetalleFormCreditosPendientes=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCreditosPendientes!=null) {
			this.jInternalFrameReporteDinamicoCreditosPendientes.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCreditosPendientes.dispose();
			this.jInternalFrameReporteDinamicoCreditosPendientes=null;
		}
		
		if(this.jInternalFrameImportacionCreditosPendientes!=null) {
			this.jInternalFrameImportacionCreditosPendientes.setVisible(false);	    			
			this.jInternalFrameImportacionCreditosPendientes.dispose();
			this.jInternalFrameImportacionCreditosPendientes=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCreditosPendientes();
			
			CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
			
			
			if(sTipo.equals("NuevoCreditosPendientes")) {
				jButtonNuevoCreditosPendientesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCreditosPendientes")) {
				jButtonDuplicarCreditosPendientesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCreditosPendientes")) {
				jButtonCopiarCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("VerFormCreditosPendientes")) {
				jButtonVerFormCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCreditosPendientes")) {
				jButtonNuevoCreditosPendientesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCreditosPendientes")) {
				jButtonDuplicarCreditosPendientesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCreditosPendientes")) {
				jButtonNuevoCreditosPendientesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCreditosPendientes")) {
				jButtonDuplicarCreditosPendientesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCreditosPendientes")) {
				jButtonNuevoCreditosPendientesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCreditosPendientes")) {
				jButtonNuevoCreditosPendientesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCreditosPendientes")) {
				jButtonNuevoCreditosPendientesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCreditosPendientes")) {
				jButtonModificarCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCreditosPendientes")) {
				jButtonModificarCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCreditosPendientes")) {
				jButtonModificarCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCreditosPendientes")) {
				jButtonActualizarCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCreditosPendientes")) {
				jButtonActualizarCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCreditosPendientes")) {
				jButtonActualizarCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("EliminarCreditosPendientes")) {
				jButtonEliminarCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCreditosPendientes")) {
				jButtonEliminarCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCreditosPendientes")) {
				jButtonEliminarCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("CancelarCreditosPendientes")) {
				jButtonCancelarCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCreditosPendientes")) {
				jButtonCancelarCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCreditosPendientes")) {
				jButtonCancelarCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("CerrarCreditosPendientes")) {
				jButtonCerrarCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCreditosPendientes")) {
				jButtonCerrarCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCreditosPendientes")) {
				jButtonCerrarCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCreditosPendientes")) {
				jButtonMostrarOcultarCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCreditosPendientes")) {
				jButtonCancelarCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCreditosPendientes")) {
				jButtonGuardarCambiosCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCreditosPendientes")) {
				jButtonGuardarCambiosCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCreditosPendientes")) {
				jButtonCopiarCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCreditosPendientes")) {
				jButtonVerFormCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCreditosPendientes")) {
				jButtonGuardarCambiosCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCreditosPendientes")) {
				jButtonCopiarCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCreditosPendientes")) {
				jButtonVerFormCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCreditosPendientes")) {
				jButtonGuardarCambiosCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCreditosPendientes")) {
				jButtonGuardarCambiosCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCreditosPendientes")) {
				jButtonGuardarCambiosCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCreditosPendientes")) {
				jButtonRecargarInformacionCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCreditosPendientes")) {
				jButtonRecargarInformacionCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCreditosPendientes")) {
				jButtonRecargarInformacionCreditosPendientesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCreditosPendientes")) {
				jButtonAnterioresCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCreditosPendientes")) {
				jButtonAnterioresCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCreditosPendientes")) {
				jButtonAnterioresCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCreditosPendientes")) {
				jButtonSiguientesCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCreditosPendientes")) {
				jButtonSiguientesCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCreditosPendientes")) {
				jButtonSiguientesCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCreditosPendientes") || sTipo.equals("MenuItemDetalleAbrirOrderByCreditosPendientes")) {
				jButtonAbrirOrderByCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCreditosPendientes") || sTipo.equals("MenuItemDetalleMostrarOcultarCreditosPendientes")) {
				jButtonMostrarOcultarCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCreditosPendientes")) {
				jButtonNuevoGuardarCambiosCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCreditosPendientes")) {
				jButtonNuevoGuardarCambiosCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCreditosPendientes")) {
				jButtonNuevoGuardarCambiosCreditosPendientesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCreditosPendientes")) {
				jButtonCerrarReporteDinamicoCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCreditosPendientes")) {
				jButtonGenerarReporteDinamicoCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCreditosPendientes")) {
				
				jButtonGenerarExcelReporteDinamicoCreditosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCreditosPendientes")) {
				jButtonCerrarImportacionCreditosPendientesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCreditosPendientes")) {
				
				jButtonGenerarImportacionCreditosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCreditosPendientes")) {
				
				jButtonAbrirImportacionCreditosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCreditosPendientes")) {
				jComboBoxTiposAccionesCreditosPendientesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCreditosPendientes")) {
				jComboBoxTiposRelacionesCreditosPendientesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCreditosPendientes")) {
				jComboBoxTiposAccionesCreditosPendientesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCreditosPendientes")) {
				
				jComboBoxTiposSeleccionarCreditosPendientesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCreditosPendientes")) {
				jTextFieldValorCampoGeneralCreditosPendientesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCreditosPendientes")) {
				jButtonAbrirOrderByCreditosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCreditosPendientes")) {
				jButtonAbrirOrderByCreditosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCreditosPendientes")) {
				jButtonCerrarOrderByCreditosPendientesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCreditosPendientesBusqueda")) {
				this.jButtonidCreditosPendientesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cargoCreditosPendientesUpdate")) {
				this.jButtonid_cargoCreditosPendientesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cargoCreditosPendientesBusqueda")) {
				this.jButtonid_cargoCreditosPendientesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraCreditosPendientesUpdate")) {
				this.jButtonid_estructuraCreditosPendientesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraCreditosPendientesBusqueda")) {
				this.jButtonid_estructuraCreditosPendientesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCreditosPendientesUpdate")) {
				this.jButtonid_empresaCreditosPendientesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCreditosPendientesBusqueda")) {
				this.jButtonid_empresaCreditosPendientesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoCreditosPendientesUpdate")) {
				this.jButtonid_empleadoCreditosPendientesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoCreditosPendientesBusqueda")) {
				this.jButtonid_empleadoCreditosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimiento_desdeCreditosPendientesBusqueda")) {
				this.jButtonfecha_vencimiento_desdeCreditosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimiento_hastaCreditosPendientesBusqueda")) {
				this.jButtonfecha_vencimiento_hastaCreditosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCreditosPendientesBusqueda")) {
				this.jButtoncodigoCreditosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoCreditosPendientesBusqueda")) {
				this.jButtonnombre_completoCreditosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_tipo_prestamoCreditosPendientesBusqueda")) {
				this.jButtoncodigo_tipo_prestamoCreditosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_prestamoCreditosPendientesBusqueda")) {
				this.jButtoncodigo_prestamoCreditosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroCreditosPendientesBusqueda")) {
				this.jButtonnumeroCreditosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_capitalCreditosPendientesBusqueda")) {
				this.jButtonmonto_capitalCreditosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_interesCreditosPendientesBusqueda")) {
				this.jButtonmonto_interesCreditosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorCreditosPendientesBusqueda")) {
				this.jButtonvalorCreditosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldoCreditosPendientesBusqueda")) {
				this.jButtonsaldoCreditosPendientesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaCreditosPendientesCreditosPendientes")) {
				this.jButtonBusquedaCreditosPendientesCreditosPendientesActionPerformed(evt);
			}
			
			;
			
			
			CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCreditosPendientes();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCreditosPendientesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.creditospendientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.creditospendientes);
				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
				
				


				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CreditosPendientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CreditosPendientes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CreditosPendientes creditospendientesLocal=null;
			
			if(!this.getEsControlTabla()) {
				creditospendientesLocal=this.creditospendientes;
			} else {
				creditospendientesLocal=this.creditospendientesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.creditospendientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.creditospendientes);
				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
							
				
				


				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CreditosPendientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CreditosPendientes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCreditosPendientesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesAnterior =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.creditospendientesAnterior =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
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
			
			CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
			
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
			
			


			
			CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCreditosPendientesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.creditospendientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.creditospendientes);
				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
								
						
				


				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CreditosPendientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CreditosPendientes.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.creditospendientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.creditospendientes);
				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
								
				
				


				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CreditosPendientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CreditosPendientes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCreditosPendientesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesAnterior =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.creditospendientesAnterior =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.creditospendientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.creditospendientes);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCreditosPendientesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesAnterior =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.creditospendientesAnterior =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCreditosPendientesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.creditospendientes);
			
			this.actualizarInformacion("INFO_PADRE",false,this.creditospendientes);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.creditospendientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.creditospendientes);
				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
							
				
				


				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CreditosPendientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CreditosPendientes.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCreditosPendientesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditospendientesAnterior =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.creditospendientesAnterior =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
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
			
			CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
			
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
			
			


			
			CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCreditosPendientesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.creditospendientes);
			
			this.actualizarInformacion("INFO_PADRE",false,this.creditospendientes);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.creditospendientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.creditospendientes);
				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
								
				
				


				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CreditosPendientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CreditosPendientes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCreditosPendientesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesAnterior =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.creditospendientesAnterior =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCreditosPendientesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.creditospendientes);
			
			this.actualizarInformacion("INFO_PADRE",false,this.creditospendientes);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCreditosPendientesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.creditospendientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.creditospendientes);
				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCreditosPendientes")) {
					jCheckBoxSeleccionarTodosCreditosPendientesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCreditosPendientes")) {
					jCheckBoxSeleccionadosCreditosPendientesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCreditosPendientes")) {
					
				}
				
				


				
				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CreditosPendientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CreditosPendientes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.creditospendientes);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.creditospendientes);
				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
												
				
				


				
				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CreditosPendientes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CreditosPendientes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCreditosPendientesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.creditospendientesAnterior =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.creditospendientesAnterior =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCreditosPendientesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.creditospendientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.creditospendientes);
				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
				
				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
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
			
			CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
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
			
			


			
			CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCreditosPendientesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.creditospendientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.creditospendientes);
				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CreditosPendientes.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CreditosPendientes.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.creditospendientes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.creditospendientes);
				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
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
				
				


				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CreditosPendientes.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CreditosPendientes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCreditosPendientesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.creditospendientesAnterior =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.creditospendientesAnterior =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCreditosPendientes")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCreditosPendientesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCreditosPendientes.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.creditospendientes =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.creditospendientes =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.creditospendientes);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCreditosPendientes")) {
				
				}
				
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCreditosPendientes")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCreditosPendientes.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCreditosPendientes")) {
			
			}
			
			CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCreditosPendientes();
			
			CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
			
			if(sTipo.equals("NuevoCreditosPendientes")) {
				jButtonNuevoCreditosPendientesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCreditosPendientes")) {
				jButtonDuplicarCreditosPendientesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCreditosPendientes")) {
				jButtonCopiarCreditosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCreditosPendientes")) {
				jButtonVerFormCreditosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCreditosPendientes")) {
				jButtonNuevoCreditosPendientesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCreditosPendientes")) {
				jButtonModificarCreditosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCreditosPendientes")) {
				jButtonActualizarCreditosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCreditosPendientes")) {
				jButtonEliminarCreditosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCreditosPendientes")) {
				jButtonGuardarCambiosCreditosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCreditosPendientes")) {
				jButtonCancelarCreditosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCreditosPendientes")) {
				jButtonCerrarCreditosPendientesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCreditosPendientes")) {
				jButtonGuardarCambiosCreditosPendientesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCreditosPendientes")) {
				jButtonNuevoGuardarCambiosCreditosPendientesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCreditosPendientes")) {
				jButtonAbrirOrderByCreditosPendientesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCreditosPendientes")) {
				jButtonRecargarInformacionCreditosPendientesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCreditosPendientes")) {
				jButtonAnterioresCreditosPendientesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCreditosPendientes")) {
				jButtonSiguientesCreditosPendientesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCreditosPendientesBusqueda")) {
				this.jButtonidCreditosPendientesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cargoCreditosPendientesUpdate")) {
				this.jButtonid_cargoCreditosPendientesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cargoCreditosPendientesBusqueda")) {
				this.jButtonid_cargoCreditosPendientesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraCreditosPendientesUpdate")) {
				this.jButtonid_estructuraCreditosPendientesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraCreditosPendientesBusqueda")) {
				this.jButtonid_estructuraCreditosPendientesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCreditosPendientesUpdate")) {
				this.jButtonid_empresaCreditosPendientesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCreditosPendientesBusqueda")) {
				this.jButtonid_empresaCreditosPendientesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoCreditosPendientesUpdate")) {
				this.jButtonid_empleadoCreditosPendientesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoCreditosPendientesBusqueda")) {
				this.jButtonid_empleadoCreditosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimiento_desdeCreditosPendientesBusqueda")) {
				this.jButtonfecha_vencimiento_desdeCreditosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimiento_hastaCreditosPendientesBusqueda")) {
				this.jButtonfecha_vencimiento_hastaCreditosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCreditosPendientesBusqueda")) {
				this.jButtoncodigoCreditosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoCreditosPendientesBusqueda")) {
				this.jButtonnombre_completoCreditosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_tipo_prestamoCreditosPendientesBusqueda")) {
				this.jButtoncodigo_tipo_prestamoCreditosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_prestamoCreditosPendientesBusqueda")) {
				this.jButtoncodigo_prestamoCreditosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroCreditosPendientesBusqueda")) {
				this.jButtonnumeroCreditosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_capitalCreditosPendientesBusqueda")) {
				this.jButtonmonto_capitalCreditosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_interesCreditosPendientesBusqueda")) {
				this.jButtonmonto_interesCreditosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorCreditosPendientesBusqueda")) {
				this.jButtonvalorCreditosPendientesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldoCreditosPendientesBusqueda")) {
				this.jButtonsaldoCreditosPendientesBusquedaActionPerformed(evt);
			}
			
			CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCreditosPendientes();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCreditosPendientes")) {
				closingInternalFrameCreditosPendientes();
				
			} else if(sTipo.equals("jButtonCancelarCreditosPendientes")) {
				JInternalFrameBase jInternalFrameDetalleFormCreditosPendientes = (JInternalFrameBase)evt.getSource();
	            	
	            CreditosPendientesBeanSwingJInternalFrame jInternalFrameParent=(CreditosPendientesBeanSwingJInternalFrame)jInternalFrameDetalleFormCreditosPendientes.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCreditosPendientesActionPerformed(null);
			}
			
			CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.creditospendientes,new Object(),this.creditospendientesParameterGeneral,this.creditospendientesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCreditosPendientes(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCreditosPendientes(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCreditosPendientes(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.creditospendientes)) {
			if(!esControlTabla) {
				if(CreditosPendientesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.creditospendientes,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);			
				}
				
				if(this.creditospendientesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCreditosPendientes(this.creditospendientes,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCreditosPendientes(this.creditospendientesReturnGeneral,this.creditospendientesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.creditospendientesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCreditosPendientes(classes,this.creditospendientesReturnGeneral,this.creditospendientesBean,false);
					}
						
					if(this.creditospendientesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCreditosPendientes(this.creditospendientesReturnGeneral.getCreditosPendientes());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCreditosPendientes(this.creditospendientesReturnGeneral.getCreditosPendientes());	
					}
						
					if(this.creditospendientesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCreditosPendientes(this.creditospendientesReturnGeneral.getCreditosPendientes(),classes);//this.creditospendientesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCreditosPendientes(this.creditospendientes,classes);//this.creditospendientesBean);									
				}
			
				if(CreditosPendientesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCreditosPendientes(this.creditospendientes,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCreditosPendientes(this.creditospendientes);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.creditospendientesAnterior!=null) {
						this.creditospendientes=this.creditospendientesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.creditospendientesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.creditospendientesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.creditospendientesReturnGeneral.getCreditosPendientes(),creditospendientesLogic.getCreditosPendientess());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.creditospendientesReturnGeneral.getCreditosPendientes(),this.creditospendientess);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCreditosPendientes.repaint();
				
				//((AbstractTableModel) this.jTableDatosCreditosPendientes.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCreditosPendientes();
			}
		}
	}
	
	public void actualizarVisualTableDatosCreditosPendientes() throws Exception {
		
		CreditosPendientesModel creditospendientesModel=(CreditosPendientesModel)this.jTableDatosCreditosPendientes.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			creditospendientesModel.creditospendientess=this.creditospendientesLogic.getCreditosPendientess();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			creditospendientesModel.creditospendientess=this.creditospendientess;
		}
		
		
		((CreditosPendientesModel) this.jTableDatosCreditosPendientes.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCreditosPendientes() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcreditospendientesAnterior(),this.creditospendientesLogic.getCreditosPendientess());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcreditospendientesAnterior(),this.creditospendientess);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCreditosPendientes();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCreditosPendientes(CreditosPendientes creditospendientes,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
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
										
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.creditospendientes,new Object(),generalEntityParameterGeneral,this.creditospendientesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.creditospendientesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CreditosPendientesConstantesFunciones.getClassesRelationshipsOfCreditosPendientes(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CreditosPendientesConstantesFunciones.getClassesRelationshipsFromStringsOfCreditosPendientes(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCreditosPendientes(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CreditosPendientesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.creditospendientes,new Object(),generalEntityParameterGeneral,this.creditospendientesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCreditosPendientes(CreditosPendientesBean creditospendientesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCreditosPendientes(ArrayList<Classe> classes,CreditosPendientesReturnGeneral creditospendientesReturnGeneral,CreditosPendientesBean creditospendientesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCreditosPendientes(CreditosPendientes creditospendientes,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.creditospendientes)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCreditosPendientes = new CreditosPendientesDetalleFormJInternalFrame(jDesktopPane,this.creditospendientesSessionBean.getConGuardarRelaciones(),this.creditospendientesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.setVisible(false);
		this.jInternalFrameDetalleFormCreditosPendientes.setSelected(false);						
		
		this.jInternalFrameDetalleFormCreditosPendientes.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCreditosPendientes.creditospendientesLogic=this.creditospendientesLogic;
		
		this.cargarCombosFrameForeignKeyCreditosPendientes("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCreditosPendientes();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCreditosPendientes();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCreditosPendientes("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCreditosPendientes();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCreditosPendientes.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCreditosPendientes"));
		
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonModificarCreditosPendientes.addActionListener(new ButtonActionListener(this,"ModificarCreditosPendientes"));

		
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonModificarToolBarCreditosPendientes.addActionListener(new ButtonActionListener(this,"ModificarToolBarCreditosPendientes"));
					
		this.jInternalFrameDetalleFormCreditosPendientes.jMenuItemModificarCreditosPendientes.addActionListener(new ButtonActionListener(this,"MenuItemModificarCreditosPendientes"));		
		
		
		
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonActualizarCreditosPendientes.addActionListener (new ButtonActionListener(this,"ActualizarCreditosPendientes"));
		
		
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonActualizarToolBarCreditosPendientes.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCreditosPendientes"));
						
		this.jInternalFrameDetalleFormCreditosPendientes.jMenuItemActualizarCreditosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCreditosPendientes"));		
		
		
		
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonEliminarCreditosPendientes.addActionListener (new ButtonActionListener(this,"EliminarCreditosPendientes"));
		
		
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonEliminarToolBarCreditosPendientes.addActionListener (new ButtonActionListener(this,"EliminarToolBarCreditosPendientes"));
								
		this.jInternalFrameDetalleFormCreditosPendientes.jMenuItemEliminarCreditosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCreditosPendientes"));		
		
		
		
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonCancelarCreditosPendientes.addActionListener (new ButtonActionListener(this,"CancelarCreditosPendientes"));
		
		
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonCancelarToolBarCreditosPendientes.addActionListener (new ButtonActionListener(this,"CancelarToolBarCreditosPendientes"));
					
		this.jInternalFrameDetalleFormCreditosPendientes.jMenuItemCancelarCreditosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCreditosPendientes"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCreditosPendientes.jMenuItemDetalleCerrarCreditosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCreditosPendientes"));		
		
		
		
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonGuardarCambiosToolBarCreditosPendientes.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCreditosPendientes"));
		
		
		
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonGuardarCambiosToolBarCreditosPendientes.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCreditosPendientes"));
		
		
		
		this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxTiposAccionesFormularioCreditosPendientes.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCreditosPendientes"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonidCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"idCreditosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_cargoCreditosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_cargoCreditosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_cargoCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_cargoCreditosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_estructuraCreditosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraCreditosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_estructuraCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraCreditosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_empresaCreditosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCreditosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_empresaCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCreditosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_empleadoCreditosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoCreditosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_empleadoCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonfecha_vencimiento_desdeCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimiento_desdeCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonfecha_vencimiento_hastaCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimiento_hastaCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtoncodigoCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"codigoCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonnombre_completoCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtoncodigo_tipo_prestamoCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_prestamoCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtoncodigo_prestamoCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_prestamoCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonnumeroCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"numeroCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonmonto_capitalCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"monto_capitalCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonmonto_interesCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"monto_interesCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonvalorCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"valorCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonsaldoCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"saldoCreditosPendientesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCreditosPendientes.jTabbedPaneRelacionesCreditosPendientes.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCreditosPendientes"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCreditosPendientes"));
		
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosPendientes.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCreditosPendientes"));
		}
		
		this.jTableDatosCreditosPendientes.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCreditosPendientes"));
		
		this.jTableDatosCreditosPendientes.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCreditosPendientes"));
		
		this.jButtonNuevoCreditosPendientes.addActionListener(new ButtonActionListener(this,"NuevoCreditosPendientes"));
		
		this.jButtonDuplicarCreditosPendientes.addActionListener(new ButtonActionListener(this,"DuplicarCreditosPendientes"));
		
		this.jButtonCopiarCreditosPendientes.addActionListener(new ButtonActionListener(this,"CopiarCreditosPendientes"));
		
		this.jButtonVerFormCreditosPendientes.addActionListener(new ButtonActionListener(this,"VerFormCreditosPendientes"));
		
		
		this.jButtonNuevoToolBarCreditosPendientes.addActionListener(new ButtonActionListener(this,"NuevoToolBarCreditosPendientes"));
			
		this.jButtonDuplicarToolBarCreditosPendientes.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCreditosPendientes"));
			
		this.jMenuItemNuevoCreditosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCreditosPendientes"));
			
		this.jMenuItemDuplicarCreditosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCreditosPendientes"));		
		
		
		this.jButtonNuevoRelacionesCreditosPendientes.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCreditosPendientes"));
		
		
		this.jButtonNuevoRelacionesToolBarCreditosPendientes.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCreditosPendientes"));
			
		this.jMenuItemNuevoRelacionesCreditosPendientes.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCreditosPendientes"));		
		
		
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonModificarCreditosPendientes.addActionListener(new ButtonActionListener(this,"ModificarCreditosPendientes"));
		}
		
		
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonModificarToolBarCreditosPendientes.addActionListener(new ButtonActionListener(this,"ModificarToolBarCreditosPendientes"));
			
			this.jInternalFrameDetalleFormCreditosPendientes.jMenuItemModificarCreditosPendientes.addActionListener(new ButtonActionListener(this,"MenuItemModificarCreditosPendientes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonActualizarCreditosPendientes.addActionListener (new ButtonActionListener(this,"ActualizarCreditosPendientes"));
		}
		
		
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonActualizarToolBarCreditosPendientes.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCreditosPendientes"));
				
			this.jInternalFrameDetalleFormCreditosPendientes.jMenuItemActualizarCreditosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCreditosPendientes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonEliminarCreditosPendientes.addActionListener (new ButtonActionListener(this,"EliminarCreditosPendientes"));
		}
		
		
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonEliminarToolBarCreditosPendientes.addActionListener (new ButtonActionListener(this,"EliminarToolBarCreditosPendientes"));
						
			this.jInternalFrameDetalleFormCreditosPendientes.jMenuItemEliminarCreditosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCreditosPendientes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonCancelarCreditosPendientes.addActionListener (new ButtonActionListener(this,"CancelarCreditosPendientes"));
		}
		
		
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonCancelarToolBarCreditosPendientes.addActionListener (new ButtonActionListener(this,"CancelarToolBarCreditosPendientes"));
			
			this.jInternalFrameDetalleFormCreditosPendientes.jMenuItemCancelarCreditosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCreditosPendientes"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCreditosPendientes.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCreditosPendientes"));		
		
		
		this.jButtonCerrarCreditosPendientes.addActionListener (new ButtonActionListener(this,"CerrarCreditosPendientes"));
		
		
		this.jButtonCerrarToolBarCreditosPendientes.addActionListener (new ButtonActionListener(this,"CerrarToolBarCreditosPendientes"));
			
		this.jMenuItemCerrarCreditosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCreditosPendientes"));
			
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosPendientes.jMenuItemDetalleCerrarCreditosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCreditosPendientes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonGuardarCambiosCreditosPendientes.addActionListener (new ButtonActionListener(this,"GuardarCambiosCreditosPendientes"));
		}
		
		
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosPendientes.jButtonGuardarCambiosToolBarCreditosPendientes.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCreditosPendientes"));
		}
		
		this.jButtonCopiarToolBarCreditosPendientes.addActionListener (new ButtonActionListener(this,"CopiarToolBarCreditosPendientes"));
			
		this.jButtonVerFormToolBarCreditosPendientes.addActionListener (new ButtonActionListener(this,"VerFormToolBarCreditosPendientes"));
		
		this.jMenuItemGuardarCambiosCreditosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCreditosPendientes"));
			
		this.jMenuItemCopiarCreditosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCreditosPendientes"));		
		
		this.jMenuItemVerFormCreditosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCreditosPendientes"));		
		
		
		this.jButtonGuardarCambiosTablaCreditosPendientes.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCreditosPendientes"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCreditosPendientes.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCreditosPendientes"));
			
		this.jMenuItemGuardarCambiosTablaCreditosPendientes.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCreditosPendientes"));		
		
		
		
		this.jButtonRecargarInformacionCreditosPendientes.addActionListener (new ButtonActionListener(this,"RecargarInformacionCreditosPendientes"));
					
		this.jButtonRecargarInformacionToolBarCreditosPendientes.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCreditosPendientes"));
		
		this.jMenuItemRecargarInformacionCreditosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCreditosPendientes"));		
		
		
		
		this.jButtonAnterioresCreditosPendientes.addActionListener (new ButtonActionListener(this,"AnterioresCreditosPendientes"));
		
		
		this.jButtonAnterioresToolBarCreditosPendientes.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCreditosPendientes"));
		
		this.jMenuItemAnterioresCreditosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCreditosPendientes"));		
		
		
		this.jButtonSiguientesCreditosPendientes.addActionListener (new ButtonActionListener(this,"SiguientesCreditosPendientes"));
		
		
		this.jButtonSiguientesToolBarCreditosPendientes.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCreditosPendientes"));
			
		this.jMenuItemSiguientesCreditosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCreditosPendientes"));
			
		this.jMenuItemAbrirOrderByCreditosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCreditosPendientes"));
			
		this.jMenuItemMostrarOcultarCreditosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCreditosPendientes"));
			
		this.jMenuItemDetalleAbrirOrderByCreditosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCreditosPendientes"));
			
		this.jMenuItemDetalleMostarOcultarCreditosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCreditosPendientes"));		
		
		
		this.jButtonNuevoGuardarCambiosCreditosPendientes.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCreditosPendientes"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCreditosPendientes.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCreditosPendientes"));
			
		this.jMenuItemNuevoGuardarCambiosCreditosPendientes.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCreditosPendientes"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCreditosPendientes.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCreditosPendientes"));

		this.jCheckBoxSeleccionadosCreditosPendientes.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCreditosPendientes"));
		
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxTiposAccionesFormularioCreditosPendientes.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCreditosPendientes"));
		}
		
		
		this.jComboBoxTiposRelacionesCreditosPendientes.addActionListener (new ButtonActionListener(this,"TiposRelacionesCreditosPendientes"));
			
		this.jComboBoxTiposAccionesCreditosPendientes.addActionListener (new ButtonActionListener(this,"TiposAccionesCreditosPendientes"));
					
		this.jComboBoxTiposSeleccionarCreditosPendientes.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCreditosPendientes"));
			
		this.jTextFieldValorCampoGeneralCreditosPendientes.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCreditosPendientes"));		
		
		
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonidCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"idCreditosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_cargoCreditosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_cargoCreditosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_cargoCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_cargoCreditosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_estructuraCreditosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraCreditosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_estructuraCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraCreditosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_empresaCreditosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCreditosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_empresaCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCreditosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_empleadoCreditosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoCreditosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_empleadoCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonfecha_vencimiento_desdeCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimiento_desdeCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonfecha_vencimiento_hastaCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimiento_hastaCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtoncodigoCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"codigoCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonnombre_completoCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtoncodigo_tipo_prestamoCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_prestamoCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtoncodigo_prestamoCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_prestamoCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonnumeroCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"numeroCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonmonto_capitalCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"monto_capitalCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonmonto_interesCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"monto_interesCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonvalorCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"valorCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonsaldoCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"saldoCreditosPendientesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaCreditosPendientesCreditosPendientes.addActionListener(new ButtonActionListener(this,"BusquedaCreditosPendientesCreditosPendientes"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCreditosPendientes!=null) {
				this.jInternalFrameReporteDinamicoCreditosPendientes.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCreditosPendientes"));
				this.jInternalFrameReporteDinamicoCreditosPendientes.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCreditosPendientes"));
				this.jInternalFrameReporteDinamicoCreditosPendientes.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCreditosPendientes"));
			}
			
			//this.jButtonCerrarReporteDinamicoCreditosPendientes.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCreditosPendientes"));				
			//this.jButtonGenerarReporteDinamicoCreditosPendientes.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCreditosPendientes"));
			//this.jButtonGenerarExcelReporteDinamicoCreditosPendientes.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCreditosPendientes"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCreditosPendientes!=null) {
				this.jInternalFrameImportacionCreditosPendientes.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCreditosPendientes"));
				this.jInternalFrameImportacionCreditosPendientes.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCreditosPendientes"));
				this.jInternalFrameImportacionCreditosPendientes.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCreditosPendientes"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCreditosPendientes.addActionListener (new ButtonActionListener(this,"AbrirOrderByCreditosPendientes"));
			
			this.jButtonAbrirOrderByToolBarCreditosPendientes.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCreditosPendientes"));			
			
			if(this.jInternalFrameOrderByCreditosPendientes!=null) {
				this.jInternalFrameOrderByCreditosPendientes.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCreditosPendientes"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCreditosPendientes.jTabbedPaneRelacionesCreditosPendientes.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCreditosPendientes"));
		
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
            		closingInternalFrameCreditosPendientes();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCreditosPendientes.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCreditosPendientes = (JInternalFrameBase)event.getSource();
	            	
	            CreditosPendientesBeanSwingJInternalFrame jInternalFrameParent=(CreditosPendientesBeanSwingJInternalFrame)jInternalFrameDetalleFormCreditosPendientes.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCreditosPendientesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCreditosPendientes.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCreditosPendientesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCreditosPendientes.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCreditosPendientes.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCreditosPendientesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCreditosPendientesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCreditosPendientesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCreditosPendientes";
		inputMap = this.jButtonNuevoCreditosPendientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCreditosPendientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCreditosPendientesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCreditosPendientesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCreditosPendientesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCreditosPendientesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCreditosPendientes";
		inputMap = this.jButtonNuevoRelacionesCreditosPendientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCreditosPendientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCreditosPendientesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCreditosPendientes";
		inputMap = this.jButtonModificarCreditosPendientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCreditosPendientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCreditosPendientesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCreditosPendientes";
		inputMap = this.jButtonActualizarCreditosPendientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCreditosPendientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCreditosPendientesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCreditosPendientes";
		inputMap = this.jButtonEliminarCreditosPendientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCreditosPendientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCreditosPendientesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCreditosPendientes";
		inputMap = this.jButtonCancelarCreditosPendientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCreditosPendientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCreditosPendientesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCreditosPendientes";
		inputMap = this.jButtonCerrarCreditosPendientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCreditosPendientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCreditosPendientesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonGuardarCambiosCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCreditosPendientes";
		inputMap = this.jInternalFrameDetalleFormCreditosPendientes.jButtonGuardarCambiosCreditosPendientes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonGuardarCambiosCreditosPendientes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCreditosPendientesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCreditosPendientes.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCreditosPendientesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCreditosPendientes.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCreditosPendientesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCreditosPendientes.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCreditosPendientesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCreditosPendientes.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCreditosPendientesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonidCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"idCreditosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_cargoCreditosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_cargoCreditosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_cargoCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_cargoCreditosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_estructuraCreditosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraCreditosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_estructuraCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraCreditosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_empresaCreditosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCreditosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_empresaCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCreditosPendientesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_empleadoCreditosPendientesUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoCreditosPendientesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonid_empleadoCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonfecha_vencimiento_desdeCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimiento_desdeCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonfecha_vencimiento_hastaCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimiento_hastaCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtoncodigoCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"codigoCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonnombre_completoCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtoncodigo_tipo_prestamoCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_prestamoCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtoncodigo_prestamoCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_prestamoCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonnumeroCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"numeroCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonmonto_capitalCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"monto_capitalCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonmonto_interesCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"monto_interesCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonvalorCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"valorCreditosPendientesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCreditosPendientes.jButtonsaldoCreditosPendientesBusqueda.addActionListener(new ButtonActionListener(this,"saldoCreditosPendientesBusqueda"));
		
		
		this.jButtonBusquedaCreditosPendientesCreditosPendientes.addActionListener(new ButtonActionListener(this,"BusquedaCreditosPendientesCreditosPendientes"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCreditosPendientes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCreditosPendientesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCreditosPendientesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCreditosPendientes.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCreditosPendientes(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CreditosPendientes creditospendientesAux:this.creditospendientesLogic.getCreditosPendientess()) {
					creditospendientesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CreditosPendientes creditospendientesAux:creditospendientess) {
					creditospendientesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCreditosPendientesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCreditosPendientes(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CreditosPendientes creditospendientesAux:this.creditospendientesLogic.getCreditosPendientess()) {
						creditospendientesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CreditosPendientes creditospendientesAux:creditospendientess) {
						creditospendientesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CreditosPendientes creditospendientesAux:this.creditospendientesLogic.getCreditosPendientess()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CreditosPendientes creditospendientesAux:creditospendientess) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCreditosPendientes(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCreditosPendientes.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCreditosPendientes.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCreditosPendientes,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCreditosPendientesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCreditosPendientes(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCreditosPendientes.getSelectedRows();
			
			CreditosPendientes creditospendientesLocal=new CreditosPendientes();
			
			//this.seleccionarTodosCreditosPendientes(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					creditospendientesLocal =(CreditosPendientes) this.creditospendientesLogic.getCreditosPendientess().toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					creditospendientesLocal =(CreditosPendientes) this.creditospendientess.toArray()[this.jTableDatosCreditosPendientes.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				creditospendientesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CreditosPendientes creditospendientesAux:this.creditospendientesLogic.getCreditosPendientess()) {
						creditospendientesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CreditosPendientes creditospendientesAux:creditospendientess) {
						creditospendientesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCreditosPendientes(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCreditosPendientes.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCreditosPendientes.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCreditosPendientes,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCreditosPendientesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCreditosPendientesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCreditosPendientesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCreditosPendientes(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCreditosPendientes.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CreditosPendientes creditospendientesAux:this.creditospendientesLogic.getCreditosPendientess()) {
				
						if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_FECHAVENCIMIENTODESDE)) {
							existe=true;
							creditospendientesAux.setfecha_vencimiento_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA)) {
							existe=true;
							creditospendientesAux.setfecha_vencimiento_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							creditospendientesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							creditospendientesAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO)) {
							existe=true;
							creditospendientesAux.setcodigo_tipo_prestamo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_CODIGOPRESTAMO)) {
							existe=true;
							creditospendientesAux.setcodigo_prestamo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							creditospendientesAux.setnumero(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_MONTOCAPITAL)) {
							existe=true;
							creditospendientesAux.setmonto_capital(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_MONTOINTERES)) {
							existe=true;
							creditospendientesAux.setmonto_interes(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							creditospendientesAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_SALDO)) {
							existe=true;
							creditospendientesAux.setsaldo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CreditosPendientes creditospendientesAux:creditospendientess) {
					
						if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_FECHAVENCIMIENTODESDE)) {
							existe=true;
							creditospendientesAux.setfecha_vencimiento_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA)) {
							existe=true;
							creditospendientesAux.setfecha_vencimiento_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							creditospendientesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							creditospendientesAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO)) {
							existe=true;
							creditospendientesAux.setcodigo_tipo_prestamo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_CODIGOPRESTAMO)) {
							existe=true;
							creditospendientesAux.setcodigo_prestamo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							creditospendientesAux.setnumero(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_MONTOCAPITAL)) {
							existe=true;
							creditospendientesAux.setmonto_capital(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_MONTOINTERES)) {
							existe=true;
							creditospendientesAux.setmonto_interes(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							creditospendientesAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_SALDO)) {
							existe=true;
							creditospendientesAux.setsaldo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCreditosPendientes(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCreditosPendientesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCreditosPendientes(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCreditosPendientes=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCreditosPendientes.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxTiposAccionesFormularioCreditosPendientes.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCreditosPendientes) {				
					conSplash=true;//false;										
					
					//this.startProcessCreditosPendientes(conSplash);
				
					this.generarReporteCreditosPendientessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCreditosPendientes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxTiposAccionesFormularioCreditosPendientes.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCreditosPendientessSeleccionados();
				//this.jComboBoxTiposAccionesCreditosPendientes.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCreditosPendientessSeleccionados(false);
				//this.jComboBoxTiposAccionesCreditosPendientes.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCreditosPendientessSeleccionados(true);
				//this.jComboBoxTiposAccionesCreditosPendientes.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCreditosPendientes();
				
				this.exportarCreditosPendientessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCreditosPendientes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxTiposAccionesFormularioCreditosPendientes.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCreditosPendientess();
				//this.importarCreditosPendientess();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCreditosPendientes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxTiposAccionesFormularioCreditosPendientes.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCreditosPendientes();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCreditosPendientessSeleccionados();
				//this.jComboBoxTiposAccionesCreditosPendientes.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Creditos Pendientes", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCreditosPendientes();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCreditosPendientes)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCreditosPendientes(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Creditos Pendientes",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCreditosPendientes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxTiposAccionesFormularioCreditosPendientes.setSelectedIndex(0);					
				}	
			} 			
			else if(CreditosPendientesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCreditosPendientes) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCreditosPendientes(conSplash);
					
						//this.actualizarParametrosGeneralCreditosPendientes();
						
						this.generarReporteProcesoAccionCreditosPendientessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCreditosPendientes.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxTiposAccionesFormularioCreditosPendientes.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CreditosPendientesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Creditos PendientesES SELECCIONADOS?", "MANTENIMIENTO DE Creditos Pendientes", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCreditosPendientes();
				
						this.actualizarParametrosGeneralCreditosPendientes();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.creditospendientesReturnGeneral=creditospendientesLogic.procesarAccionCreditosPendientessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.creditospendientesLogic.getCreditosPendientess(),this.creditospendientesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCreditosPendientesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCreditosPendientes.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxTiposAccionesFormularioCreditosPendientes.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCreditosPendientes();
					
					CreditosPendientesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCreditosPendientesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCreditosPendientes.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxTiposAccionesFormularioCreditosPendientes.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCreditosPendientes(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCreditosPendientesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCreditosPendientes();
			
			if(this.jInternalFrameDetalleFormCreditosPendientes==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CreditosPendientes> creditospendientessSeleccionados=new ArrayList<CreditosPendientes>();		
			CreditosPendientes creditospendientes=new CreditosPendientes();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCreditosPendientes(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCreditosPendientes.getSelectedItem();
			
			
			
			
			creditospendientessSeleccionados=this.getCreditosPendientessSeleccionados(true);
			//this.sTipoAccion;
			
			if(creditospendientessSeleccionados.size()==1) {
				for(CreditosPendientes creditospendientesAux:creditospendientessSeleccionados) {
					creditospendientes=creditospendientesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCreditosPendientes();
			
      		//this.finishProcessCreditosPendientes(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCreditosPendientesReturnGeneral() throws Exception {
		if(this.creditospendientesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.creditospendientesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.creditospendientesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.creditospendientesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.creditospendientesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.creditospendientesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCreditosPendientes(false);
		}
		
		if(this.creditospendientesReturnGeneral.getConRetornoLista() || this.creditospendientesReturnGeneral.getConRetornoObjeto()) {
			if(this.creditospendientesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.creditospendientesLogic.setCreditosPendientess(this.creditospendientesReturnGeneral.getCreditosPendientess());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingCreditosPendientes(false);
		}
	}
	
	public void actualizarParametrosGeneralCreditosPendientes() throws Exception {
		
		
	}
	
	public ArrayList<CreditosPendientes> getCreditosPendientessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CreditosPendientes> creditospendientessSeleccionados=new ArrayList<CreditosPendientes>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCreditosPendientes) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CreditosPendientes creditospendientesAux:creditospendientesLogic.getCreditosPendientess()) {
					if(creditospendientesAux.getIsSelected()) {
						creditospendientessSeleccionados.add(creditospendientesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CreditosPendientes creditospendientesAux:this.creditospendientess) {
					if(creditospendientesAux.getIsSelected()) {
						creditospendientessSeleccionados.add(creditospendientesAux);				
					}
				}
			}
			
			if(creditospendientessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						creditospendientessSeleccionados.addAll(this.creditospendientesLogic.getCreditosPendientess());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						creditospendientessSeleccionados.addAll(this.creditospendientess);				
					}
				}
			}
		} else {
			creditospendientessSeleccionados.add(this.creditospendientes);
		}
		
		return creditospendientessSeleccionados;
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
	
	public void generarReporteCreditosPendientessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCreditosPendientessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCreditosPendientessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCreditosPendientessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCreditosPendientessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Creditos Pendientes",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCreditosPendientessSeleccionados() throws Exception {
		ArrayList<CreditosPendientes> creditospendientessSeleccionados=new ArrayList<CreditosPendientes>();		
		
		creditospendientessSeleccionados=this.getCreditosPendientessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCreditosPendientess("Todos",creditospendientessSeleccionados);
		
	}	
	
	public void generarReporteNormalCreditosPendientessSeleccionados() throws Exception {
		ArrayList<CreditosPendientes> creditospendientessSeleccionados=new ArrayList<CreditosPendientes>();		
		
		creditospendientessSeleccionados=this.getCreditosPendientessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCreditosPendientess("Todos",creditospendientessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCreditosPendientessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CreditosPendientes> creditospendientessSeleccionados=new ArrayList<CreditosPendientes>();
		
		creditospendientessSeleccionados=this.getCreditosPendientessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCreditosPendientess("Todos",creditospendientessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCreditosPendientessSeleccionados() throws Exception {
		ArrayList<CreditosPendientes> creditospendientessSeleccionados=new ArrayList<CreditosPendientes>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCreditosPendientes();
		
		
		creditospendientessSeleccionados=this.getCreditosPendientessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCreditosPendientes();
		
		
		//this.generarReporteCreditosPendientess("Todos",creditospendientessSeleccionados ,creditospendientesImplementable,creditospendientesImplementableHome);
	}
	
	public void mostrarImportacionCreditosPendientess() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCreditosPendientes();
		
		this.abrirFrameImportacionCreditosPendientes();		
		
			
		//this.generarReporteCreditosPendientess("Todos",creditospendientessSeleccionados ,creditospendientesImplementable,creditospendientesImplementableHome);
	}
	
	public void importarCreditosPendientess() throws Exception {		
	
	}
	
	public void exportarCreditosPendientessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCreditosPendientessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCreditosPendientessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCreditosPendientessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Creditos Pendientes",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCreditosPendientessSeleccionados() throws Exception {
		ArrayList<CreditosPendientes> creditospendientessSeleccionados=new ArrayList<CreditosPendientes>();		
		
		creditospendientessSeleccionados=this.getCreditosPendientessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"creditospendientes."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCreditosPendientes(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CreditosPendientes creditospendientesAux:creditospendientessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCreditosPendientes(creditospendientesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//creditospendientesAux.setsDetalleGeneralEntityReporte(creditospendientesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.creditospendientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Creditos Pendientes",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCreditosPendientes(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CreditosPendientesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosPendientesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosPendientesConstantesFunciones.LABEL_IDCARGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosPendientesConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosPendientesConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosPendientesConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosPendientesConstantesFunciones.LABEL_FECHAVENCIMIENTODESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosPendientesConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosPendientesConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosPendientesConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosPendientesConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosPendientesConstantesFunciones.LABEL_CODIGOPRESTAMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosPendientesConstantesFunciones.LABEL_NUMERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosPendientesConstantesFunciones.LABEL_MONTOCAPITAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosPendientesConstantesFunciones.LABEL_MONTOINTERES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosPendientesConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CreditosPendientesConstantesFunciones.LABEL_SALDO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCreditosPendientes(CreditosPendientes creditospendientes,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=creditospendientes.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=creditospendientes.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditospendientes.getcargo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditospendientes.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditospendientes.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditospendientes.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditospendientes.getfecha_vencimiento_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditospendientes.getfecha_vencimiento_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditospendientes.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditospendientes.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditospendientes.getcodigo_tipo_prestamo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditospendientes.getcodigo_prestamo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditospendientes.getnumero().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditospendientes.getmonto_capital().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditospendientes.getmonto_interes().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditospendientes.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=creditospendientes.getsaldo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCreditosPendientessSeleccionados() throws Exception {
		ArrayList<CreditosPendientes> creditospendientessSeleccionados=new ArrayList<CreditosPendientes>();		
		
		creditospendientessSeleccionados=this.getCreditosPendientessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"creditospendientes.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CreditosPendientess");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCreditosPendientes(row);				
				iRow++;
			}				
			
			for(CreditosPendientes creditospendientesAux:creditospendientessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCreditosPendientes(creditospendientesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.creditospendientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Creditos Pendientes",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCreditosPendientessSeleccionados() throws Exception {
		ArrayList<CreditosPendientes> creditospendientessSeleccionados=new ArrayList<CreditosPendientes>();		
		
		creditospendientessSeleccionados=this.getCreditosPendientessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"creditospendientes.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("creditospendientess");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("creditospendientes");
			//elementRoot.appendChild(element);
		
			for(CreditosPendientes creditospendientesAux:creditospendientessSeleccionados) {
				element = document.createElement("creditospendientes");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCreditosPendientes(creditospendientesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.creditospendientesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Creditos Pendientes",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCreditosPendientes(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_IDCARGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_FECHAVENCIMIENTODESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_CODIGOPRESTAMO);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_NUMERO);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_MONTOCAPITAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_MONTOINTERES);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(CreditosPendientesConstantesFunciones.LABEL_SALDO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCreditosPendientes(CreditosPendientes creditospendientes,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(creditospendientes.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(creditospendientes.getcargo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(creditospendientes.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(creditospendientes.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(creditospendientes.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(creditospendientes.getfecha_vencimiento_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(creditospendientes.getfecha_vencimiento_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(creditospendientes.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(creditospendientes.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(creditospendientes.getcodigo_tipo_prestamo());
		cell = row.createCell(iColumn++);cell.setCellValue(creditospendientes.getcodigo_prestamo());
		cell = row.createCell(iColumn++);cell.setCellValue(creditospendientes.getnumero());
		cell = row.createCell(iColumn++);cell.setCellValue(creditospendientes.getmonto_capital());
		cell = row.createCell(iColumn++);cell.setCellValue(creditospendientes.getmonto_interes());
		cell = row.createCell(iColumn++);cell.setCellValue(creditospendientes.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(creditospendientes.getsaldo());				
	}
	
	public void setFilaDatosExportarXmlCreditosPendientes(CreditosPendientes creditospendientes,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CreditosPendientesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(creditospendientes.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CreditosPendientesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(creditospendientes.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcargo_descripcion = document.createElement(CreditosPendientesConstantesFunciones.IDCARGO);
		elementcargo_descripcion.appendChild(document.createTextNode(creditospendientes.getcargo_descripcion()));
		element.appendChild(elementcargo_descripcion);

		Element elementestructura_descripcion = document.createElement(CreditosPendientesConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(creditospendientes.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementempresa_descripcion = document.createElement(CreditosPendientesConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(creditospendientes.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(CreditosPendientesConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(creditospendientes.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementfecha_vencimiento_desde = document.createElement(CreditosPendientesConstantesFunciones.FECHAVENCIMIENTODESDE);
		elementfecha_vencimiento_desde.appendChild(document.createTextNode(creditospendientes.getfecha_vencimiento_desde().toString().trim()));
		element.appendChild(elementfecha_vencimiento_desde);

		Element elementfecha_vencimiento_hasta = document.createElement(CreditosPendientesConstantesFunciones.FECHAVENCIMIENTOHASTA);
		elementfecha_vencimiento_hasta.appendChild(document.createTextNode(creditospendientes.getfecha_vencimiento_hasta().toString().trim()));
		element.appendChild(elementfecha_vencimiento_hasta);

		Element elementcodigo = document.createElement(CreditosPendientesConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(creditospendientes.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_completo = document.createElement(CreditosPendientesConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(creditospendientes.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementcodigo_tipo_prestamo = document.createElement(CreditosPendientesConstantesFunciones.CODIGOTIPOPRESTAMO);
		elementcodigo_tipo_prestamo.appendChild(document.createTextNode(creditospendientes.getcodigo_tipo_prestamo().trim()));
		element.appendChild(elementcodigo_tipo_prestamo);

		Element elementcodigo_prestamo = document.createElement(CreditosPendientesConstantesFunciones.CODIGOPRESTAMO);
		elementcodigo_prestamo.appendChild(document.createTextNode(creditospendientes.getcodigo_prestamo().trim()));
		element.appendChild(elementcodigo_prestamo);

		Element elementnumero = document.createElement(CreditosPendientesConstantesFunciones.NUMERO);
		elementnumero.appendChild(document.createTextNode(creditospendientes.getnumero().toString().trim()));
		element.appendChild(elementnumero);

		Element elementmonto_capital = document.createElement(CreditosPendientesConstantesFunciones.MONTOCAPITAL);
		elementmonto_capital.appendChild(document.createTextNode(creditospendientes.getmonto_capital().toString().trim()));
		element.appendChild(elementmonto_capital);

		Element elementmonto_interes = document.createElement(CreditosPendientesConstantesFunciones.MONTOINTERES);
		elementmonto_interes.appendChild(document.createTextNode(creditospendientes.getmonto_interes().toString().trim()));
		element.appendChild(elementmonto_interes);

		Element elementvalor = document.createElement(CreditosPendientesConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(creditospendientes.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementsaldo = document.createElement(CreditosPendientesConstantesFunciones.SALDO);
		elementsaldo.appendChild(document.createTextNode(creditospendientes.getsaldo().toString().trim()));
		element.appendChild(elementsaldo);
	}
	
	public void generarReporteGroupGenericoCreditosPendientessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CreditosPendientes> creditospendientessSeleccionados=new ArrayList<CreditosPendientes>();
		
		creditospendientessSeleccionados=this.getCreditosPendientessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCreditosPendientes(creditospendientessSeleccionados);
		
		this.generarReporteCreditosPendientess("Todos",creditospendientessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCreditosPendientes(ArrayList<CreditosPendientes> creditospendientessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CreditosPendientes creditospendientesAux:creditospendientessSeleccionados) {
				creditospendientesAux.setsDetalleGeneralEntityReporte(creditospendientesAux.toString());
			
				if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_IDCARGO)) {
					existe=true;
					creditospendientesAux.setsDescripcionGeneralEntityReporte1(creditospendientesAux.getcargo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					creditospendientesAux.setsDescripcionGeneralEntityReporte1(creditospendientesAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					creditospendientesAux.setsDescripcionGeneralEntityReporte1(creditospendientesAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					creditospendientesAux.setsDescripcionGeneralEntityReporte1(creditospendientesAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_FECHAVENCIMIENTODESDE)) {
					existe=true;
					creditospendientesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(creditospendientesAux.getfecha_vencimiento_desde()));
				}
				 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_FECHAVENCIMIENTOHASTA)) {
					existe=true;
					creditospendientesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(creditospendientesAux.getfecha_vencimiento_hasta()));
				}
				 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					creditospendientesAux.setsDescripcionGeneralEntityReporte1(creditospendientesAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					creditospendientesAux.setsDescripcionGeneralEntityReporte1(creditospendientesAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_CODIGOTIPOPRESTAMO)) {
					existe=true;
					creditospendientesAux.setsDescripcionGeneralEntityReporte1(creditospendientesAux.getcodigo_tipo_prestamo());
				}
				 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_CODIGOPRESTAMO)) {
					existe=true;
					creditospendientesAux.setsDescripcionGeneralEntityReporte1(creditospendientesAux.getcodigo_prestamo());
				}
				 else if(sTipoSeleccionar.equals(CreditosPendientesConstantesFunciones.LABEL_NUMERO)) {
					existe=true;
					creditospendientesAux.setsDescripcionGeneralEntityReporte1(creditospendientesAux.getnumero().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CreditosPendientesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCreditosPendientes(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCreditosPendientes=true;
				this.isVisibilidadCeldaNuevoRelacionesCreditosPendientes=true;
				this.isVisibilidadCeldaGuardarCambiosCreditosPendientes=true;
			}
			
			this.isVisibilidadCeldaModificarCreditosPendientes=false;
			this.isVisibilidadCeldaActualizarCreditosPendientes=false;
			this.isVisibilidadCeldaEliminarCreditosPendientes=false;
			this.isVisibilidadCeldaCancelarCreditosPendientes=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCreditosPendientes=true;
				} else {
					this.isVisibilidadCeldaGuardarCreditosPendientes=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCreditosPendientes=false;
			this.isVisibilidadCeldaNuevoRelacionesCreditosPendientes=false;
			this.isVisibilidadCeldaGuardarCambiosCreditosPendientes=false;
			this.isVisibilidadCeldaModificarCreditosPendientes=false;
			this.isVisibilidadCeldaActualizarCreditosPendientes=true;
			this.isVisibilidadCeldaEliminarCreditosPendientes=false;
			this.isVisibilidadCeldaCancelarCreditosPendientes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCreditosPendientes=true;
				} else {
					this.isVisibilidadCeldaGuardarCreditosPendientes=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCreditosPendientes=false;
			this.isVisibilidadCeldaNuevoRelacionesCreditosPendientes=false;
			this.isVisibilidadCeldaGuardarCambiosCreditosPendientes=false;
			this.isVisibilidadCeldaModificarCreditosPendientes=false;
			this.isVisibilidadCeldaActualizarCreditosPendientes=true;
			this.isVisibilidadCeldaEliminarCreditosPendientes=true;
			this.isVisibilidadCeldaCancelarCreditosPendientes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCreditosPendientes=true;
				} else {
					this.isVisibilidadCeldaGuardarCreditosPendientes=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCreditosPendientes=false;
			this.isVisibilidadCeldaNuevoRelacionesCreditosPendientes=false;
			this.isVisibilidadCeldaGuardarCambiosCreditosPendientes=false;
			this.isVisibilidadCeldaModificarCreditosPendientes=false;
			this.isVisibilidadCeldaActualizarCreditosPendientes=true;
			this.isVisibilidadCeldaEliminarCreditosPendientes=false;
			this.isVisibilidadCeldaCancelarCreditosPendientes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCreditosPendientes=false;
				} else {
					this.isVisibilidadCeldaGuardarCreditosPendientes=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCreditosPendientes=true;
			this.isVisibilidadCeldaNuevoRelacionesCreditosPendientes=true;
			this.isVisibilidadCeldaGuardarCambiosCreditosPendientes=true;
			this.isVisibilidadCeldaModificarCreditosPendientes=false;
			this.isVisibilidadCeldaActualizarCreditosPendientes=false;
			this.isVisibilidadCeldaEliminarCreditosPendientes=false;
			this.isVisibilidadCeldaCancelarCreditosPendientes=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCreditosPendientes=true;
				} else {
					this.isVisibilidadCeldaGuardarCreditosPendientes=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCreditosPendientes=false;
			this.isVisibilidadCeldaNuevoRelacionesCreditosPendientes=false;
			this.isVisibilidadCeldaGuardarCambiosCreditosPendientes=false;
			this.isVisibilidadCeldaActualizarCreditosPendientes=false;
			this.isVisibilidadCeldaEliminarCreditosPendientes=false;
			this.isVisibilidadCeldaCancelarCreditosPendientes=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCreditosPendientes=false;
				} else {
					this.isVisibilidadCeldaGuardarCreditosPendientes=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCreditosPendientes=false;
			this.isVisibilidadCeldaNuevoRelacionesCreditosPendientes=false;
			this.isVisibilidadCeldaGuardarCambiosCreditosPendientes=false;
			this.isVisibilidadCeldaModificarCreditosPendientes=true;
			this.isVisibilidadCeldaActualizarCreditosPendientes=false;
			this.isVisibilidadCeldaEliminarCreditosPendientes=false;
			this.isVisibilidadCeldaCancelarCreditosPendientes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCreditosPendientes=false;
				} else {
					this.isVisibilidadCeldaGuardarCreditosPendientes=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CreditosPendientesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCreditosPendientes=true;
			this.isVisibilidadCeldaNuevoRelacionesCreditosPendientes=true;
			this.isVisibilidadCeldaGuardarCambiosCreditosPendientes=true;
		} else {
			this.actualizarEstadoPanelsCreditosPendientes(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCreditosPendientes=false;
			//this.isVisibilidadCeldaVerFormCreditosPendientes=false;
			this.isVisibilidadCeldaDuplicarCreditosPendientes=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!creditospendientesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCreditosPendientes=false;
		} else {
			this.isVisibilidadCeldaNuevoCreditosPendientes=false;
			this.isVisibilidadCeldaGuardarCambiosCreditosPendientes=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(creditospendientesSessionBean.getEsGuardarRelacionado()) {
			if(!creditospendientesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCreditosPendientes=false;												
			}
			
			this.jButtonCerrarCreditosPendientes.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCreditosPendientes=false;
		}
		
		if(!this.permiteMantenimiento(this.creditospendientes)) {
			this.isVisibilidadCeldaActualizarCreditosPendientes=false;
			this.isVisibilidadCeldaEliminarCreditosPendientes=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoCreditosPendientes=false;
		this.isVisibilidadCeldaNuevoRelacionesCreditosPendientes=false;
		this.isVisibilidadCeldaGuardarCambiosCreditosPendientes=false;
		//this.isVisibilidadCeldaModificarCreditosPendientes=true;
		this.isVisibilidadCeldaActualizarCreditosPendientes=false;
		this.isVisibilidadCeldaEliminarCreditosPendientes=false;
		//this.isVisibilidadCeldaCancelarCreditosPendientes=true;			
		this.isVisibilidadCeldaGuardarCreditosPendientes=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCreditosPendientes() {
	}
	
	public void actualizarEstadoPanelsCreditosPendientes(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCreditosPendientes!=null) {
				this.jScrollPanelDatosEdicionCreditosPendientes.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCreditosPendientes!=null) {
				this.jTabbedPaneBusquedasCreditosPendientes.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCreditosPendientes!=null) {
				this.jScrollPanelDatosCreditosPendientes.setVisible(true);
			}
			
			if(this.jPanelPaginacionCreditosPendientes!=null) {
				this.jPanelPaginacionCreditosPendientes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCreditosPendientes!=null) {
				this.jPanelParametrosReportesCreditosPendientes.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCreditosPendientes!=null) {
				this.jScrollPanelDatosEdicionCreditosPendientes.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCreditosPendientes!=null) {
				this.jTabbedPaneBusquedasCreditosPendientes.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCreditosPendientes!=null) {
				this.jScrollPanelDatosCreditosPendientes.setVisible(false);
			}
			
			if(this.jPanelPaginacionCreditosPendientes!=null) {
				this.jPanelPaginacionCreditosPendientes.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCreditosPendientes!=null) {
				this.jPanelParametrosReportesCreditosPendientes.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCreditosPendientes!=null) {
				this.jScrollPanelDatosEdicionCreditosPendientes.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCreditosPendientes!=null) {
				this.jTabbedPaneBusquedasCreditosPendientes.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCreditosPendientes!=null) {
				this.jScrollPanelDatosCreditosPendientes.setVisible(false);
			}
			
			if(this.jPanelPaginacionCreditosPendientes!=null) {
				this.jPanelPaginacionCreditosPendientes.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCreditosPendientes!=null) {
				this.jPanelParametrosReportesCreditosPendientes.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCreditosPendientes!=null) {
				this.jScrollPanelDatosEdicionCreditosPendientes.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCreditosPendientes!=null) {
				this.jTabbedPaneBusquedasCreditosPendientes.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCreditosPendientes!=null) {
				this.jScrollPanelDatosCreditosPendientes.setVisible(false);
			}
			
			if(this.jPanelPaginacionCreditosPendientes!=null) {
				this.jPanelPaginacionCreditosPendientes.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCreditosPendientes!=null) {
				this.jPanelParametrosReportesCreditosPendientes.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCreditosPendientes!=null) {
				this.jScrollPanelDatosEdicionCreditosPendientes.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCreditosPendientes!=null) {
				this.jTabbedPaneBusquedasCreditosPendientes.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCreditosPendientes!=null) {
				this.jScrollPanelDatosCreditosPendientes.setVisible(true);
			}
			
			if(this.jPanelPaginacionCreditosPendientes!=null) {
				this.jPanelPaginacionCreditosPendientes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCreditosPendientes!=null) {
				this.jPanelParametrosReportesCreditosPendientes.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCreditosPendientes!=null) {
				this.jScrollPanelDatosEdicionCreditosPendientes.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCreditosPendientes!=null) {
				this.jTabbedPaneBusquedasCreditosPendientes.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCreditosPendientes!=null) {
				this.jScrollPanelDatosCreditosPendientes.setVisible(true);
			}
			
			if(this.jPanelPaginacionCreditosPendientes!=null) {
				this.jPanelPaginacionCreditosPendientes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCreditosPendientes!=null) {
				this.jPanelParametrosReportesCreditosPendientes.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCreditosPendientes!=null) {
				this.jScrollPanelDatosEdicionCreditosPendientes.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCreditosPendientes!=null) {
				this.jTabbedPaneBusquedasCreditosPendientes.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCreditosPendientes!=null) {
				this.jScrollPanelDatosCreditosPendientes.setVisible(true);
			}
			
			if(this.jPanelPaginacionCreditosPendientes!=null) {
				this.jPanelPaginacionCreditosPendientes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCreditosPendientes!=null) {
				this.jPanelParametrosReportesCreditosPendientes.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.creditospendientesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCreditosPendientes!=null) {
					this.jTabbedPaneBusquedasCreditosPendientes.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCreditosPendientes!=null) {
				this.jPanelParametrosReportesCreditosPendientes.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.creditospendientesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCreditosPendientes!=null) {
				this.jTabbedPaneBusquedasCreditosPendientes.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCreditosPendientes!=null) {
				this.jPanelParametrosReportesCreditosPendientes.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaCargo(Boolean isParaCargo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCargoNegation=!isParaCargo;

			this.isVisibilidadBusquedaCreditosPendientes=isParaCargo;
			if(!this.isVisibilidadBusquedaCreditosPendientes) {this.jTabbedPaneBusquedasCreditosPendientes.remove(jPanelBusquedaCreditosPendientesCreditosPendientes);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadBusquedaCreditosPendientes=isParaEstructura;
			if(!this.isVisibilidadBusquedaCreditosPendientes) {this.jTabbedPaneBusquedasCreditosPendientes.remove(jPanelBusquedaCreditosPendientesCreditosPendientes);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaCreditosPendientes=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaCreditosPendientes) {this.jTabbedPaneBusquedasCreditosPendientes.remove(jPanelBusquedaCreditosPendientesCreditosPendientes);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadBusquedaCreditosPendientes=isParaEmpleado;
			if(!this.isVisibilidadBusquedaCreditosPendientes) {this.jTabbedPaneBusquedasCreditosPendientes.remove(jPanelBusquedaCreditosPendientesCreditosPendientes);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCreditosPendientes(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCreditosPendientes() {
		this.updateBorderResaltarBusquedasFormularioCreditosPendientes();
		this.updateVisibilidadBusquedasFormularioCreditosPendientes();
		this.updateHabilitarBusquedasFormularioCreditosPendientes();
	}
	
	public void updateBorderResaltarBusquedasFormularioCreditosPendientes() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCreditosPendientes.getComponents().length>0) {
	

		if(this.creditospendientesConstantesFunciones.resaltarBusquedaCreditosPendientesCreditosPendientes!=null) {
			index= this.jTabbedPaneBusquedasCreditosPendientes.indexOfComponent(this.jPanelBusquedaCreditosPendientesCreditosPendientes);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCreditosPendientes.getComponent(index);
				jPanel.setBorder(this.creditospendientesConstantesFunciones.resaltarBusquedaCreditosPendientesCreditosPendientes);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCreditosPendientes() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCreditosPendientes.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCreditosPendientes.indexOfComponent(this.jPanelBusquedaCreditosPendientesCreditosPendientes);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCreditosPendientes.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.creditospendientesConstantesFunciones.mostrarBusquedaCreditosPendientesCreditosPendientes);
			if(!this.creditospendientesConstantesFunciones.mostrarBusquedaCreditosPendientesCreditosPendientes && index>-1) {
				this.jTabbedPaneBusquedasCreditosPendientes.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCreditosPendientes() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCreditosPendientes.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCreditosPendientes.indexOfComponent(this.jPanelBusquedaCreditosPendientesCreditosPendientes);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCreditosPendientes.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.creditospendientesConstantesFunciones.activarBusquedaCreditosPendientesCreditosPendientes);
				this.jTabbedPaneBusquedasCreditosPendientes.setEnabledAt(index,this.creditospendientesConstantesFunciones.activarBusquedaCreditosPendientesCreditosPendientes);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCreditosPendientes(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaCreditosPendientes")) {
			index= this.jTabbedPaneBusquedasCreditosPendientes.indexOfComponent(this.jPanelBusquedaCreditosPendientesCreditosPendientes);

			this.jTabbedPaneBusquedasCreditosPendientes.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCreditosPendientes.getComponent(index);

			this.creditospendientesConstantesFunciones.setResaltarBusquedaCreditosPendientesCreditosPendientes(resaltar);

			jPanel.setBorder(this.creditospendientesConstantesFunciones.resaltarBusquedaCreditosPendientesCreditosPendientes);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCreditosPendientes.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCreditosPendientes() throws Exception {

		if(this.jInternalFrameDetalleFormCreditosPendientes==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCreditosPendientes();
		this.updateVisibilidadResaltarControlesFormularioCreditosPendientes();
		this.updateHabilitarResaltarControlesFormularioCreditosPendientes();
		
	}
	
	public void updateBorderResaltarControlesFormularioCreditosPendientes() throws Exception {
		if(this.jInternalFrameDetalleFormCreditosPendientes==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.creditospendientesConstantesFunciones.resaltaridCreditosPendientes!=null && this.jInternalFrameDetalleFormCreditosPendientes!=null) {this.jInternalFrameDetalleFormCreditosPendientes.jLabelidCreditosPendientes.setBorder(this.creditospendientesConstantesFunciones.resaltaridCreditosPendientes);}
		if(this.creditospendientesConstantesFunciones.resaltarid_cargoCreditosPendientes!=null && this.jInternalFrameDetalleFormCreditosPendientes!=null) {this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_cargoCreditosPendientes.setBorder(this.creditospendientesConstantesFunciones.resaltarid_cargoCreditosPendientes);}
		if(this.creditospendientesConstantesFunciones.resaltarid_estructuraCreditosPendientes!=null && this.jInternalFrameDetalleFormCreditosPendientes!=null) {this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_estructuraCreditosPendientes.setBorder(this.creditospendientesConstantesFunciones.resaltarid_estructuraCreditosPendientes);}
		if(this.creditospendientesConstantesFunciones.resaltarid_empresaCreditosPendientes!=null && this.jInternalFrameDetalleFormCreditosPendientes!=null) {this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empresaCreditosPendientes.setBorder(this.creditospendientesConstantesFunciones.resaltarid_empresaCreditosPendientes);}
		if(this.creditospendientesConstantesFunciones.resaltarid_empleadoCreditosPendientes!=null && this.jInternalFrameDetalleFormCreditosPendientes!=null) {this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empleadoCreditosPendientes.setBorder(this.creditospendientesConstantesFunciones.resaltarid_empleadoCreditosPendientes);}
		if(this.creditospendientesConstantesFunciones.resaltarfecha_vencimiento_desdeCreditosPendientes!=null && this.jInternalFrameDetalleFormCreditosPendientes!=null) {this.jInternalFrameDetalleFormCreditosPendientes.jDateChooserfecha_vencimiento_desdeCreditosPendientes.setBorder(this.creditospendientesConstantesFunciones.resaltarfecha_vencimiento_desdeCreditosPendientes);}
		if(this.creditospendientesConstantesFunciones.resaltarfecha_vencimiento_hastaCreditosPendientes!=null && this.jInternalFrameDetalleFormCreditosPendientes!=null) {this.jInternalFrameDetalleFormCreditosPendientes.jDateChooserfecha_vencimiento_hastaCreditosPendientes.setBorder(this.creditospendientesConstantesFunciones.resaltarfecha_vencimiento_hastaCreditosPendientes);}
		if(this.creditospendientesConstantesFunciones.resaltarcodigoCreditosPendientes!=null && this.jInternalFrameDetalleFormCreditosPendientes!=null) {this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigoCreditosPendientes.setBorder(this.creditospendientesConstantesFunciones.resaltarcodigoCreditosPendientes);}
		if(this.creditospendientesConstantesFunciones.resaltarnombre_completoCreditosPendientes!=null && this.jInternalFrameDetalleFormCreditosPendientes!=null) {this.jInternalFrameDetalleFormCreditosPendientes.jTextAreanombre_completoCreditosPendientes.setBorder(this.creditospendientesConstantesFunciones.resaltarnombre_completoCreditosPendientes);}
		if(this.creditospendientesConstantesFunciones.resaltarcodigo_tipo_prestamoCreditosPendientes!=null && this.jInternalFrameDetalleFormCreditosPendientes!=null) {this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigo_tipo_prestamoCreditosPendientes.setBorder(this.creditospendientesConstantesFunciones.resaltarcodigo_tipo_prestamoCreditosPendientes);}
		if(this.creditospendientesConstantesFunciones.resaltarcodigo_prestamoCreditosPendientes!=null && this.jInternalFrameDetalleFormCreditosPendientes!=null) {this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigo_prestamoCreditosPendientes.setBorder(this.creditospendientesConstantesFunciones.resaltarcodigo_prestamoCreditosPendientes);}
		if(this.creditospendientesConstantesFunciones.resaltarnumeroCreditosPendientes!=null && this.jInternalFrameDetalleFormCreditosPendientes!=null) {this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldnumeroCreditosPendientes.setBorder(this.creditospendientesConstantesFunciones.resaltarnumeroCreditosPendientes);}
		if(this.creditospendientesConstantesFunciones.resaltarmonto_capitalCreditosPendientes!=null && this.jInternalFrameDetalleFormCreditosPendientes!=null) {this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldmonto_capitalCreditosPendientes.setBorder(this.creditospendientesConstantesFunciones.resaltarmonto_capitalCreditosPendientes);}
		if(this.creditospendientesConstantesFunciones.resaltarmonto_interesCreditosPendientes!=null && this.jInternalFrameDetalleFormCreditosPendientes!=null) {this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldmonto_interesCreditosPendientes.setBorder(this.creditospendientesConstantesFunciones.resaltarmonto_interesCreditosPendientes);}
		if(this.creditospendientesConstantesFunciones.resaltarvalorCreditosPendientes!=null && this.jInternalFrameDetalleFormCreditosPendientes!=null) {this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldvalorCreditosPendientes.setBorder(this.creditospendientesConstantesFunciones.resaltarvalorCreditosPendientes);}
		if(this.creditospendientesConstantesFunciones.resaltarsaldoCreditosPendientes!=null && this.jInternalFrameDetalleFormCreditosPendientes!=null) {this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldsaldoCreditosPendientes.setBorder(this.creditospendientesConstantesFunciones.resaltarsaldoCreditosPendientes);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCreditosPendientes() throws Exception {		
		if(this.jInternalFrameDetalleFormCreditosPendientes==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
	
		//this.jInternalFrameDetalleFormCreditosPendientes.jLabelidCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostraridCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jPanelidCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostraridCreditosPendientes);
		//this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_cargoCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarid_cargoCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jPanelid_cargoCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarid_cargoCreditosPendientes);
		//this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_estructuraCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarid_estructuraCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jPanelid_estructuraCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarid_estructuraCreditosPendientes);
		//this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empresaCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarid_empresaCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jPanelid_empresaCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarid_empresaCreditosPendientes);
		//this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empleadoCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarid_empleadoCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jPanelid_empleadoCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarid_empleadoCreditosPendientes);
		//this.jInternalFrameDetalleFormCreditosPendientes.jDateChooserfecha_vencimiento_desdeCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarfecha_vencimiento_desdeCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jPanelfecha_vencimiento_desdeCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarfecha_vencimiento_desdeCreditosPendientes);
		//this.jInternalFrameDetalleFormCreditosPendientes.jDateChooserfecha_vencimiento_hastaCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarfecha_vencimiento_hastaCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jPanelfecha_vencimiento_hastaCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarfecha_vencimiento_hastaCreditosPendientes);
		//this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigoCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarcodigoCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jPanelcodigoCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarcodigoCreditosPendientes);
		//this.jInternalFrameDetalleFormCreditosPendientes.jTextAreanombre_completoCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarnombre_completoCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jPanelnombre_completoCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarnombre_completoCreditosPendientes);
		//this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigo_tipo_prestamoCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarcodigo_tipo_prestamoCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jPanelcodigo_tipo_prestamoCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarcodigo_tipo_prestamoCreditosPendientes);
		//this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigo_prestamoCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarcodigo_prestamoCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jPanelcodigo_prestamoCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarcodigo_prestamoCreditosPendientes);
		//this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldnumeroCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarnumeroCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jPanelnumeroCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarnumeroCreditosPendientes);
		//this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldmonto_capitalCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarmonto_capitalCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jPanelmonto_capitalCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarmonto_capitalCreditosPendientes);
		//this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldmonto_interesCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarmonto_interesCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jPanelmonto_interesCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarmonto_interesCreditosPendientes);
		//this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldvalorCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarvalorCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jPanelvalorCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarvalorCreditosPendientes);
		//this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldsaldoCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarsaldoCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jPanelsaldoCreditosPendientes.setVisible(this.creditospendientesConstantesFunciones.mostrarsaldoCreditosPendientes);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCreditosPendientes() throws Exception {
		if(this.jInternalFrameDetalleFormCreditosPendientes==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCreditosPendientes!=null) {
	
		this.jInternalFrameDetalleFormCreditosPendientes.jLabelidCreditosPendientes.setEnabled(this.creditospendientesConstantesFunciones.activaridCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_cargoCreditosPendientes.setEnabled(this.creditospendientesConstantesFunciones.activarid_cargoCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_estructuraCreditosPendientes.setEnabled(this.creditospendientesConstantesFunciones.activarid_estructuraCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empresaCreditosPendientes.setEnabled(this.creditospendientesConstantesFunciones.activarid_empresaCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jComboBoxid_empleadoCreditosPendientes.setEnabled(this.creditospendientesConstantesFunciones.activarid_empleadoCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jDateChooserfecha_vencimiento_desdeCreditosPendientes.setEnabled(this.creditospendientesConstantesFunciones.activarfecha_vencimiento_desdeCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jDateChooserfecha_vencimiento_hastaCreditosPendientes.setEnabled(this.creditospendientesConstantesFunciones.activarfecha_vencimiento_hastaCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigoCreditosPendientes.setEnabled(this.creditospendientesConstantesFunciones.activarcodigoCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jTextAreanombre_completoCreditosPendientes.setEnabled(this.creditospendientesConstantesFunciones.activarnombre_completoCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigo_tipo_prestamoCreditosPendientes.setEnabled(this.creditospendientesConstantesFunciones.activarcodigo_tipo_prestamoCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldcodigo_prestamoCreditosPendientes.setEnabled(this.creditospendientesConstantesFunciones.activarcodigo_prestamoCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldnumeroCreditosPendientes.setEnabled(this.creditospendientesConstantesFunciones.activarnumeroCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldmonto_capitalCreditosPendientes.setEnabled(this.creditospendientesConstantesFunciones.activarmonto_capitalCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldmonto_interesCreditosPendientes.setEnabled(this.creditospendientesConstantesFunciones.activarmonto_interesCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldvalorCreditosPendientes.setEnabled(this.creditospendientesConstantesFunciones.activarvalorCreditosPendientes);
		this.jInternalFrameDetalleFormCreditosPendientes.jTextFieldsaldoCreditosPendientes.setEnabled(this.creditospendientesConstantesFunciones.activarsaldoCreditosPendientes);
		}
	}
	
		
}