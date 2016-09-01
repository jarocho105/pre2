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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.tesoreria.util.ConciliacionesBancariasConstantesFunciones;
import com.bydan.erp.tesoreria.util.report.ConciliacionesBancariasParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.report.ConciliacionesBancariasParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.report.ConciliacionesBancariasBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.tesoreria.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.tesoreria.util.*;

import com.bydan.erp.tesoreria.util.report.*;
import com.bydan.erp.tesoreria.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.report.*;
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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;

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
public class ConciliacionesBancariasBeanSwingJInternalFrame extends ConciliacionesBancariasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ConciliacionesBancariasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ConciliacionesBancarias> conciliacionesbancariasValidator = new ClassValidator<ConciliacionesBancarias>(ConciliacionesBancarias.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ConciliacionesBancarias conciliacionesbancarias;	
	public ConciliacionesBancarias conciliacionesbancariasAux;
	public ConciliacionesBancarias conciliacionesbancariasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ConciliacionesBancarias conciliacionesbancariasTotales;
	public Long idConciliacionesBancariasActual;
	public Long iIdNuevoConciliacionesBancarias=0L;
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

	public String sFinalQueryComboCuentaContable="";

	public List<CuentaContable> cuentacontablesForeignKey;

	public List<CuentaContable> getcuentacontablesForeignKey() {
		return cuentacontablesForeignKey;
	}

	public void setcuentacontablesForeignKey(List<CuentaContable> cuentacontablesForeignKey) {
		this.cuentacontablesForeignKey = cuentacontablesForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontableForeignKey;

	public CuentaContable getcuentacontableForeignKey() {
		return cuentacontableForeignKey;
	}

	public void setcuentacontableForeignKey(CuentaContable cuentacontableForeignKey) {
		this.cuentacontableForeignKey = cuentacontableForeignKey;
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
	
	public Boolean isPermisoTodoConciliacionesBancarias;
	public Boolean isPermisoNuevoConciliacionesBancarias;
	public Boolean isPermisoActualizarConciliacionesBancarias;
	public Boolean isPermisoActualizarOriginalConciliacionesBancarias;
	public Boolean isPermisoEliminarConciliacionesBancarias;
	public Boolean isPermisoGuardarCambiosConciliacionesBancarias;
	public Boolean isPermisoConsultaConciliacionesBancarias;
	public Boolean isPermisoBusquedaConciliacionesBancarias;
	public Boolean isPermisoReporteConciliacionesBancarias;
	public Boolean isPermisoPaginacionMedioConciliacionesBancarias;
	public Boolean isPermisoPaginacionAltoConciliacionesBancarias;
	public Boolean isPermisoPaginacionTodoConciliacionesBancarias;
	public Boolean isPermisoCopiarConciliacionesBancarias;
	public Boolean isPermisoVerFormConciliacionesBancarias;
	public Boolean isPermisoDuplicarConciliacionesBancarias;
	public Boolean isPermisoOrdenConciliacionesBancarias;
	
	
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
	
	public ConciliacionesBancariasParameterReturnGeneral conciliacionesbancariasReturnGeneral;
	public ConciliacionesBancariasParameterReturnGeneral conciliacionesbancariasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoConciliacionesBancarias=false;
	public Boolean esParaAccionDesdeFormularioConciliacionesBancarias=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ConciliacionesBancariasSessionBeanAdditional conciliacionesbancariasSessionBeanAdditional=null;
	
	public ConciliacionesBancariasSessionBeanAdditional getConciliacionesBancariasSessionBeanAdditional() {
		return this.conciliacionesbancariasSessionBeanAdditional;
	}
	
	public void setConciliacionesBancariasSessionBeanAdditional(ConciliacionesBancariasSessionBeanAdditional conciliacionesbancariasSessionBeanAdditional) {
		try {
			this.conciliacionesbancariasSessionBeanAdditional=conciliacionesbancariasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ConciliacionesBancariasBeanSwingJInternalFrameAdditional conciliacionesbancariasBeanSwingJInternalFrameAdditional=null;
	//public class ConciliacionesBancariasBeanSwingJInternalFrame
	
	public ConciliacionesBancariasBeanSwingJInternalFrameAdditional getConciliacionesBancariasBeanSwingJInternalFrameAdditional() {
		return this.conciliacionesbancariasBeanSwingJInternalFrameAdditional;
	}
	
	public void setConciliacionesBancariasBeanSwingJInternalFrameAdditional(ConciliacionesBancariasBeanSwingJInternalFrameAdditional conciliacionesbancariasBeanSwingJInternalFrameAdditional) {
		try {
			this.conciliacionesbancariasBeanSwingJInternalFrameAdditional=conciliacionesbancariasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ConciliacionesBancariasLogic conciliacionesbancariasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ConciliacionesBancarias conciliacionesbancariasBean;
	public ConciliacionesBancariasConstantesFunciones conciliacionesbancariasConstantesFunciones;
	//public ConciliacionesBancariasParameterReturnGeneral conciliacionesbancariasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public CuentaContableLogic cuentacontableLogic;
	
	//PARAMETROS
	
	
	//public List<ConciliacionesBancarias> conciliacionesbancariass;	
	//public List<ConciliacionesBancarias> conciliacionesbancariassEliminados;
	//public List<ConciliacionesBancarias> conciliacionesbancariassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoConciliacionesBancarias=false;
	public Boolean isVisibilidadCeldaDuplicarConciliacionesBancarias=true;
	public Boolean isVisibilidadCeldaCopiarConciliacionesBancarias=true;
	public Boolean isVisibilidadCeldaVerFormConciliacionesBancarias=true;
	public Boolean isVisibilidadCeldaOrdenConciliacionesBancarias=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias=false;
	public Boolean isVisibilidadCeldaModificarConciliacionesBancarias=false;
	public Boolean isVisibilidadCeldaActualizarConciliacionesBancarias=false;
	public Boolean isVisibilidadCeldaEliminarConciliacionesBancarias=false;
	public Boolean isVisibilidadCeldaCancelarConciliacionesBancarias=false;
	public Boolean isVisibilidadCeldaGuardarConciliacionesBancarias=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosConciliacionesBancarias=false;	
	
	
	public Boolean isVisibilidadBusquedaConciliacionesBancarias=false;
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoConciliacionesBancarias() {
		return this.iIdNuevoConciliacionesBancarias;
	}

	public void setiIdNuevoConciliacionesBancarias(Long iIdNuevoConciliacionesBancarias) {
		this.iIdNuevoConciliacionesBancarias = iIdNuevoConciliacionesBancarias;
	}
	
	public Long getidConciliacionesBancariasActual() {
		return this.idConciliacionesBancariasActual;
	}

	public void setidConciliacionesBancariasActual(Long idConciliacionesBancariasActual) {
		this.idConciliacionesBancariasActual = idConciliacionesBancariasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ConciliacionesBancarias getconciliacionesbancarias() {
		return this.conciliacionesbancarias;
	}

	public void setconciliacionesbancarias(ConciliacionesBancarias conciliacionesbancarias) {
		this.conciliacionesbancarias = conciliacionesbancarias;
	}
	
	public ConciliacionesBancarias getconciliacionesbancariasAux() {
		return this.conciliacionesbancariasAux;
	}

	public void setconciliacionesbancariasAux(ConciliacionesBancarias conciliacionesbancariasAux) {
		this.conciliacionesbancariasAux = conciliacionesbancariasAux;
	}				
	
	public ConciliacionesBancarias getconciliacionesbancariasAnterior() {
		return this.conciliacionesbancariasAnterior;
	}

	public void setconciliacionesbancariasAnterior(ConciliacionesBancarias conciliacionesbancariasAnterior) {
		this.conciliacionesbancariasAnterior = conciliacionesbancariasAnterior;
	}	
	
	public ConciliacionesBancarias getconciliacionesbancariasTotales() {
		return this.conciliacionesbancariasTotales;
	}

	public void setconciliacionesbancariasTotales(ConciliacionesBancarias conciliacionesbancariasTotales) {
		this.conciliacionesbancariasTotales = conciliacionesbancariasTotales;
	}	
	
	public ConciliacionesBancarias getconciliacionesbancariasBean() {
		return this.conciliacionesbancariasBean;
	}

	public void setconciliacionesbancariasBean(ConciliacionesBancarias conciliacionesbancariasBean) {
		this.conciliacionesbancariasBean = conciliacionesbancariasBean;
	}	
	
	public ConciliacionesBancariasParameterReturnGeneral getconciliacionesbancariasReturnGeneral() {
		return this.conciliacionesbancariasReturnGeneral;
	}

	public void setconciliacionesbancariasReturnGeneral(ConciliacionesBancariasParameterReturnGeneral conciliacionesbancariasReturnGeneral) {
		this.conciliacionesbancariasReturnGeneral = conciliacionesbancariasReturnGeneral;
	}	
	
	
	public Long id_cuenta_contableBusquedaConciliacionesBancarias=-1L;

	public Long getid_cuenta_contableBusquedaConciliacionesBancarias() {
		return this.id_cuenta_contableBusquedaConciliacionesBancarias;
	}

	public void setid_cuenta_contableBusquedaConciliacionesBancarias(Long id_cuenta_contableBusquedaConciliacionesBancarias) {
		this.id_cuenta_contableBusquedaConciliacionesBancarias = id_cuenta_contableBusquedaConciliacionesBancarias;
	}

;
	public Date fecha_desdeBusquedaConciliacionesBancarias=new Date();

	public Date getfecha_desdeBusquedaConciliacionesBancarias() {
		return this.fecha_desdeBusquedaConciliacionesBancarias;
	}

	public void setfecha_desdeBusquedaConciliacionesBancarias(Date fecha_desdeBusquedaConciliacionesBancarias) {
		this.fecha_desdeBusquedaConciliacionesBancarias = fecha_desdeBusquedaConciliacionesBancarias;
	}

;
	public Date fecha_hastaBusquedaConciliacionesBancarias=new Date();

	public Date getfecha_hastaBusquedaConciliacionesBancarias() {
		return this.fecha_hastaBusquedaConciliacionesBancarias;
	}

	public void setfecha_hastaBusquedaConciliacionesBancarias(Date fecha_hastaBusquedaConciliacionesBancarias) {
		this.fecha_hastaBusquedaConciliacionesBancarias = fecha_hastaBusquedaConciliacionesBancarias;
	}

	public Long id_cuenta_contableFK_IdCuentaContable=-1L;

	public Long getid_cuenta_contableFK_IdCuentaContable() {
		return this.id_cuenta_contableFK_IdCuentaContable;
	}

	public void setid_cuenta_contableFK_IdCuentaContable(Long id_cuenta_contableFK_IdCuentaContable) {
		this.id_cuenta_contableFK_IdCuentaContable = id_cuenta_contableFK_IdCuentaContable;
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
	
	
	public ConciliacionesBancariasLogic getConciliacionesBancariasLogic()	{		
		return conciliacionesbancariasLogic;
	}

	public void setConciliacionesBancariasLogic(ConciliacionesBancariasLogic conciliacionesbancariasLogic) {
		this.conciliacionesbancariasLogic = conciliacionesbancariasLogic;
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
	
	public Boolean getIsEsNuevoConciliacionesBancarias() {
		return isEsNuevoConciliacionesBancarias;
	}

	public void setIsEsNuevoConciliacionesBancarias(Boolean isEsNuevoConciliacionesBancarias) {
		this.isEsNuevoConciliacionesBancarias = isEsNuevoConciliacionesBancarias;
	}

	public Boolean getEsParaAccionDesdeFormularioConciliacionesBancarias() {
		return esParaAccionDesdeFormularioConciliacionesBancarias;
	}
	
	public void setEsParaAccionDesdeFormularioConciliacionesBancarias(Boolean esParaAccionDesdeFormularioConciliacionesBancarias) {
		this.esParaAccionDesdeFormularioConciliacionesBancarias = esParaAccionDesdeFormularioConciliacionesBancarias;
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

			if(this.conciliacionesbancariasSessionBean==null) {
				this.conciliacionesbancariasSessionBean=new ConciliacionesBancariasSessionBean();
			}

			if(!this.conciliacionesbancariasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(conciliacionesbancariasSessionBean.getlidEmpresaActual());
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

	public void cargarCombosCuentaContablesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.conciliacionesbancariasSessionBean==null) {
				this.conciliacionesbancariasSessionBean=new ConciliacionesBancariasSessionBean();
			}

			if(!this.conciliacionesbancariasSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontablesForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContable(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(conciliacionesbancariasSessionBean.getlidCuentaContableActual());
					this.cuentacontablesForeignKey.add(cuentacontableLogic.getCuentaContable());
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

					if(this.conciliacionesbancarias!=null) {
						this.conciliacionesbancarias.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
						this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_empresaConciliacionesBancarias.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaConciliacionesBancarias.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
						if(this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_empresaConciliacionesBancarias.getItemCount()>0) {
							this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_empresaConciliacionesBancarias.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaConciliacionesBancariasGenerico)throws Exception
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
				jComboBoxid_empresaConciliacionesBancariasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaConciliacionesBancariasGenerico!=null && jComboBoxid_empresaConciliacionesBancariasGenerico.getItemCount()>0) {
					jComboBoxid_empresaConciliacionesBancariasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableForeignKey(Long idCuentaContableSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontableTemp!=null) {

					if(this.conciliacionesbancarias!=null) {
						this.conciliacionesbancarias.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
						this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_cuenta_contableConciliacionesBancarias.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableConciliacionesBancarias.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
						if(this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_cuenta_contableConciliacionesBancarias.getItemCount()>0) {
							this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_cuenta_contableConciliacionesBancarias.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaConciliacionesBancarias") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias!=null) {
						jComboBoxid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias!=null) {
							//jComboBoxid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias.getItemCount()>0) {
								jComboBoxid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias.setSelectedIndex(0);
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

	public String getActualCuentaContableForeignKeyDescripcion(Long idCuentaContableSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontableTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableConciliacionesBancariasGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}

			if(cuentacontableTemp!=null) {
				jComboBoxid_cuenta_contableConciliacionesBancariasGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableConciliacionesBancariasGenerico!=null && jComboBoxid_cuenta_contableConciliacionesBancariasGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableConciliacionesBancariasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ConciliacionesBancarias conciliacionesbancarias,JComboBox jComboBoxid_empresaConciliacionesBancariasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaConciliacionesBancariasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_empresaConciliacionesBancarias.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaConciliacionesBancariasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				conciliacionesbancarias.setid_empresa(empresaAux.getId());
				conciliacionesbancarias.setempresa_descripcion(ConciliacionesBancariasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				conciliacionesbancarias.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(ConciliacionesBancarias conciliacionesbancarias,JComboBox jComboBoxid_cuenta_contableConciliacionesBancariasGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableConciliacionesBancariasGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_cuenta_contableConciliacionesBancarias.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableConciliacionesBancariasGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				conciliacionesbancarias.setid_cuenta_contable(cuentacontableAux.getId());
				conciliacionesbancarias.setcuentacontable_descripcion(ConciliacionesBancariasConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				conciliacionesbancarias.setCuentaContable(cuentacontableAux);			}
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

					if(!ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) { 
							this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_empresaConciliacionesBancarias.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_empresaConciliacionesBancarias.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) { 
					}

					if(!ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContablesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) { 
							this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_cuenta_contableConciliacionesBancarias.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_cuenta_contableConciliacionesBancarias.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) { 
					}

					if(!ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaConciliacionesBancarias") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias.addItem(cuentacontable);
							}
						}

						if(!ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
							this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_empresaConciliacionesBancarias.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
							this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_empresaConciliacionesBancarias.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCuentaContableForeignKey(CuentaContable cuentacontable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
							this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_cuenta_contableConciliacionesBancarias.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
							this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_cuenta_contableConciliacionesBancarias.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesConciliacionesBancarias() throws Exception {
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
		
	public ConciliacionesBancariasParameterReturnGeneral getConciliacionesBancariasParameterGeneral() {
		return this.conciliacionesbancariasParameterGeneral;
	}
	
	public void setConciliacionesBancariasParameterGeneral(ConciliacionesBancariasParameterReturnGeneral conciliacionesbancariasParameterGeneral) {
		this.conciliacionesbancariasParameterGeneral = conciliacionesbancariasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoConciliacionesBancarias() {
		return isPermisoTodoConciliacionesBancarias;
	}

	public void setIsPermisoTodoConciliacionesBancarias(Boolean isPermisoTodoConciliacionesBancarias) {
		this.isPermisoTodoConciliacionesBancarias = isPermisoTodoConciliacionesBancarias;
	}

	public Boolean getIsPermisoNuevoConciliacionesBancarias() {
		return isPermisoNuevoConciliacionesBancarias;
	}

	public void setIsPermisoNuevoConciliacionesBancarias(Boolean isPermisoNuevoConciliacionesBancarias) {
		this.isPermisoNuevoConciliacionesBancarias = isPermisoNuevoConciliacionesBancarias;
	}

	public Boolean getIsPermisoActualizarConciliacionesBancarias() {
		return isPermisoActualizarConciliacionesBancarias;
	}

	public void setIsPermisoActualizarConciliacionesBancarias(Boolean isPermisoActualizarConciliacionesBancarias) {
		this.isPermisoActualizarConciliacionesBancarias = isPermisoActualizarConciliacionesBancarias;
	}

	public Boolean getIsPermisoEliminarConciliacionesBancarias() {
		return isPermisoEliminarConciliacionesBancarias;
	}

	public void setIsPermisoEliminarConciliacionesBancarias(Boolean isPermisoEliminarConciliacionesBancarias) {
		this.isPermisoEliminarConciliacionesBancarias = isPermisoEliminarConciliacionesBancarias;
	}

	public Boolean getIsPermisoGuardarCambiosConciliacionesBancarias() {
		return isPermisoGuardarCambiosConciliacionesBancarias;
	}

	public void setIsPermisoGuardarCambiosConciliacionesBancarias(Boolean isPermisoGuardarCambiosConciliacionesBancarias) {
		this.isPermisoGuardarCambiosConciliacionesBancarias = isPermisoGuardarCambiosConciliacionesBancarias;
	}
	
	public Boolean getIsPermisoConsultaConciliacionesBancarias() {
		return isPermisoConsultaConciliacionesBancarias;
	}

	public void setIsPermisoConsultaConciliacionesBancarias(Boolean isPermisoConsultaConciliacionesBancarias) {
		this.isPermisoConsultaConciliacionesBancarias = isPermisoConsultaConciliacionesBancarias;
	}

	public Boolean getIsPermisoBusquedaConciliacionesBancarias() {
		return isPermisoBusquedaConciliacionesBancarias;
	}

	public void setIsPermisoBusquedaConciliacionesBancarias(Boolean isPermisoBusquedaConciliacionesBancarias) {
		this.isPermisoBusquedaConciliacionesBancarias = isPermisoBusquedaConciliacionesBancarias;
	}

	public Boolean getIsPermisoReporteConciliacionesBancarias() {
		return isPermisoReporteConciliacionesBancarias;
	}

	public void setIsPermisoReporteConciliacionesBancarias(Boolean isPermisoReporteConciliacionesBancarias) {
		this.isPermisoReporteConciliacionesBancarias = isPermisoReporteConciliacionesBancarias;
	}
	
	public Boolean getIsPermisoPaginacionMedioConciliacionesBancarias() {
		return isPermisoPaginacionMedioConciliacionesBancarias;
	}

	public void setIsPermisoPaginacionMedioConciliacionesBancarias(Boolean isPermisoPaginacionMedioConciliacionesBancarias) {
		this.isPermisoPaginacionMedioConciliacionesBancarias = isPermisoPaginacionMedioConciliacionesBancarias;
	}
	
	public Boolean getIsPermisoPaginacionTodoConciliacionesBancarias() {
		return isPermisoPaginacionTodoConciliacionesBancarias;
	}

	public void setIsPermisoPaginacionTodoConciliacionesBancarias(Boolean isPermisoPaginacionTodoConciliacionesBancarias) {
		this.isPermisoPaginacionTodoConciliacionesBancarias = isPermisoPaginacionTodoConciliacionesBancarias;
	}
	
	public Boolean getIsPermisoPaginacionAltoConciliacionesBancarias() {
		return isPermisoPaginacionAltoConciliacionesBancarias;
	}

	public void setIsPermisoPaginacionAltoConciliacionesBancarias(Boolean isPermisoPaginacionAltoConciliacionesBancarias) {
		this.isPermisoPaginacionAltoConciliacionesBancarias = isPermisoPaginacionAltoConciliacionesBancarias;
	}
	
	public Boolean getIsPermisoCopiarConciliacionesBancarias() {
		return isPermisoCopiarConciliacionesBancarias;
	}

	public void setIsPermisoCopiarConciliacionesBancarias(Boolean isPermisoCopiarConciliacionesBancarias) {
		this.isPermisoCopiarConciliacionesBancarias = isPermisoCopiarConciliacionesBancarias;
	}
	
	public Boolean getIsPermisoVerFormConciliacionesBancarias() {
		return isPermisoVerFormConciliacionesBancarias;
	}

	public void setIsPermisoVerFormConciliacionesBancarias(Boolean isPermisoVerFormConciliacionesBancarias) {
		this.isPermisoVerFormConciliacionesBancarias = isPermisoVerFormConciliacionesBancarias;
	}
	
	public Boolean getIsPermisoDuplicarConciliacionesBancarias() {
		return isPermisoDuplicarConciliacionesBancarias;
	}

	public void setIsPermisoDuplicarConciliacionesBancarias(Boolean isPermisoDuplicarConciliacionesBancarias) {
		this.isPermisoDuplicarConciliacionesBancarias = isPermisoDuplicarConciliacionesBancarias;
	}
	
	public Boolean getIsPermisoOrdenConciliacionesBancarias() {
		return isPermisoOrdenConciliacionesBancarias;
	}

	public void setIsPermisoOrdenConciliacionesBancarias(Boolean isPermisoOrdenConciliacionesBancarias) {
		this.isPermisoOrdenConciliacionesBancarias = isPermisoOrdenConciliacionesBancarias;
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
	
	public Boolean getIsVisibilidadCeldaNuevoConciliacionesBancarias() {
		return isVisibilidadCeldaNuevoConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaNuevoConciliacionesBancarias(Boolean isVisibilidadCeldaNuevoConciliacionesBancarias) {
		this.isVisibilidadCeldaNuevoConciliacionesBancarias = isVisibilidadCeldaNuevoConciliacionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarConciliacionesBancarias() {
		return isVisibilidadCeldaDuplicarConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaDuplicarConciliacionesBancarias(Boolean isVisibilidadCeldaDuplicarConciliacionesBancarias) {
		this.isVisibilidadCeldaDuplicarConciliacionesBancarias = isVisibilidadCeldaDuplicarConciliacionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarConciliacionesBancarias() {
		return isVisibilidadCeldaCopiarConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaCopiarConciliacionesBancarias(Boolean isVisibilidadCeldaCopiarConciliacionesBancarias) {
		this.isVisibilidadCeldaCopiarConciliacionesBancarias = isVisibilidadCeldaCopiarConciliacionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormConciliacionesBancarias() {
		return isVisibilidadCeldaVerFormConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaVerFormConciliacionesBancarias(Boolean isVisibilidadCeldaVerFormConciliacionesBancarias) {
		this.isVisibilidadCeldaVerFormConciliacionesBancarias = isVisibilidadCeldaVerFormConciliacionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenConciliacionesBancarias() {
		return isVisibilidadCeldaOrdenConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaOrdenConciliacionesBancarias(Boolean isVisibilidadCeldaOrdenConciliacionesBancarias) {
		this.isVisibilidadCeldaOrdenConciliacionesBancarias = isVisibilidadCeldaOrdenConciliacionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesConciliacionesBancarias() {
		return isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesConciliacionesBancarias(Boolean isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias) {
		this.isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias = isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaModificarConciliacionesBancarias() {
		return isVisibilidadCeldaModificarConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaModificarConciliacionesBancarias(Boolean isVisibilidadCeldaModificarConciliacionesBancarias) {
		this.isVisibilidadCeldaModificarConciliacionesBancarias = isVisibilidadCeldaModificarConciliacionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarConciliacionesBancarias() {
		return isVisibilidadCeldaActualizarConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaActualizarConciliacionesBancarias(Boolean isVisibilidadCeldaActualizarConciliacionesBancarias) {
		this.isVisibilidadCeldaActualizarConciliacionesBancarias = isVisibilidadCeldaActualizarConciliacionesBancarias;
	}

	public Boolean getIsVisibilidadCeldaEliminarConciliacionesBancarias() {
		return isVisibilidadCeldaEliminarConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaEliminarConciliacionesBancarias(Boolean isVisibilidadCeldaEliminarConciliacionesBancarias) {
		this.isVisibilidadCeldaEliminarConciliacionesBancarias = isVisibilidadCeldaEliminarConciliacionesBancarias;
	}

	public Boolean getIsVisibilidadCeldaCancelarConciliacionesBancarias() {
		return isVisibilidadCeldaCancelarConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaCancelarConciliacionesBancarias(Boolean isVisibilidadCeldaCancelarConciliacionesBancarias) {
		this.isVisibilidadCeldaCancelarConciliacionesBancarias = isVisibilidadCeldaCancelarConciliacionesBancarias;
	}

	public Boolean getIsVisibilidadCeldaGuardarConciliacionesBancarias() {
		return isVisibilidadCeldaGuardarConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaGuardarConciliacionesBancarias(Boolean isVisibilidadCeldaGuardarConciliacionesBancarias) {
		this.isVisibilidadCeldaGuardarConciliacionesBancarias = isVisibilidadCeldaGuardarConciliacionesBancarias;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosConciliacionesBancarias() {
		return isVisibilidadCeldaGuardarCambiosConciliacionesBancarias;
	}

	public void setIsVisibilidadCeldaGuardarCambiosConciliacionesBancarias(Boolean isVisibilidadCeldaGuardarCambiosConciliacionesBancarias) {
		this.isVisibilidadCeldaGuardarCambiosConciliacionesBancarias = isVisibilidadCeldaGuardarCambiosConciliacionesBancarias;
	}
		
	public ConciliacionesBancariasSessionBean getconciliacionesbancariasSessionBean() {
		return this.conciliacionesbancariasSessionBean;
	}
	
	public void setconciliacionesbancariasSessionBean(ConciliacionesBancariasSessionBean conciliacionesbancariasSessionBean) {
		this.conciliacionesbancariasSessionBean=conciliacionesbancariasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaConciliacionesBancarias() {
		return this.isVisibilidadBusquedaConciliacionesBancarias;
	}

	public void setisVisibilidadBusquedaConciliacionesBancarias(Boolean isVisibilidadBusquedaConciliacionesBancarias) {
		this.isVisibilidadBusquedaConciliacionesBancarias=isVisibilidadBusquedaConciliacionesBancarias;
	}

	public Boolean getisVisibilidadFK_IdCuentaContable() {
		return this.isVisibilidadFK_IdCuentaContable;
	}

	public void setisVisibilidadFK_IdCuentaContable(Boolean isVisibilidadFK_IdCuentaContable) {
		this.isVisibilidadFK_IdCuentaContable=isVisibilidadFK_IdCuentaContable;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(ConciliacionesBancarias conciliacionesbancarias)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(conciliacionesbancarias,null);
				this.setActualParaGuardarCuentaContableForeignKey(conciliacionesbancarias,null);
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
	
	public void bugActualizarReferenciaActual(ConciliacionesBancarias conciliacionesbancarias,ConciliacionesBancarias conciliacionesbancariasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalConciliacionesBancarias(conciliacionesbancarias);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		conciliacionesbancariasAux.setId(conciliacionesbancarias.getId());
		conciliacionesbancariasAux.setVersionRow(conciliacionesbancarias.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ConciliacionesBancarias conciliacionesbancariasLocal) throws Exception {
		
		if(this.conciliacionesbancariasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ConciliacionesBancarias conciliacionesbancariasLocal) throws Exception {	
		if(this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				conciliacionesbancariasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				conciliacionesbancariasLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarConciliacionesBancariasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = conciliacionesbancariasValidator.getInvalidValues(this.conciliacionesbancarias);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ConciliacionesBancarias conciliacionesbancarias,List<ConciliacionesBancarias> conciliacionesbancariass) throws Exception {
	}		
	
	public void actualizarSelectedLista(ConciliacionesBancarias conciliacionesbancarias,List<ConciliacionesBancarias> conciliacionesbancariass) throws Exception {
		try	{			
			ConciliacionesBancariasConstantesFunciones.actualizarSelectedLista(conciliacionesbancarias,conciliacionesbancariass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ConciliacionesBancarias> conciliacionesbancariassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				conciliacionesbancariassLocal=this.conciliacionesbancariasLogic.getConciliacionesBancariass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				conciliacionesbancariassLocal=this.conciliacionesbancariass;
			}
			//ARCHITECTURE
		
			for(ConciliacionesBancarias conciliacionesbancariasLocal:conciliacionesbancariassLocal) {
				if(this.permiteMantenimiento(conciliacionesbancariasLocal) && conciliacionesbancariasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ConciliacionesBancariasConstantesFunciones.getConciliacionesBancariasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ConciliacionesBancariasConstantesFunciones.NUMEROMAYOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelnumero_mayorConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConciliacionesBancariasConstantesFunciones.CODIGOCUENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelcodigo_cuentaConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConciliacionesBancariasConstantesFunciones.NOMBRECUENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelnombre_cuentaConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConciliacionesBancariasConstantesFunciones.DEBITOLOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabeldebito_localConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConciliacionesBancariasConstantesFunciones.CREDITOLOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelcredito_localConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConciliacionesBancariasConstantesFunciones.NUMERODEPOSITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelnumero_depositoConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConciliacionesBancariasConstantesFunciones.DEBITOEXTRAN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabeldebito_extranConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConciliacionesBancariasConstantesFunciones.CREDITOEXTRAN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelcredito_extranConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConciliacionesBancariasConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelfechaConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConciliacionesBancariasConstantesFunciones.DETALLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabeldetalleConciliacionesBancarias,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConciliacionesBancariasConstantesFunciones.BENEFICIARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelbeneficiarioConciliacionesBancarias,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelnumero_mayorConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelcodigo_cuentaConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelnombre_cuentaConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabeldebito_localConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelcredito_localConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelnumero_depositoConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabeldebito_extranConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelcredito_extranConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelfechaConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabeldetalleConciliacionesBancarias,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelbeneficiarioConciliacionesBancarias,"");
		
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
		this.iIdNuevoConciliacionesBancarias--;	
		
		
		this.conciliacionesbancariasAux=new ConciliacionesBancarias();
		
		this.conciliacionesbancariasAux.setId(this.iIdNuevoConciliacionesBancarias);
		this.conciliacionesbancariasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.conciliacionesbancariasLogic.getConciliacionesBancariass().add(this.conciliacionesbancariasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.conciliacionesbancariass.add(this.conciliacionesbancariasAux);
		}
		//ARCHITECTURE
		
		this.conciliacionesbancarias=this.conciliacionesbancariasAux;
		
		if(ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioConciliacionesBancarias(this.conciliacionesbancarias);
			this.setVariablesObjetoActualToFormularioForeignKeyConciliacionesBancarias(this.conciliacionesbancarias);
		}
				
		//this.setDefaultControlesConciliacionesBancarias();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyConciliacionesBancarias();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyConciliacionesBancarias();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyConciliacionesBancarias();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConciliacionesBancarias(this.conciliacionesbancariasBean,this.conciliacionesbancarias,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanConciliacionesBancarias(this.conciliacionesbancariasReturnGeneral,this.conciliacionesbancariasBean,false);
		
		if(this.conciliacionesbancariasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyConciliacionesBancarias(this.conciliacionesbancariasReturnGeneral.getConciliacionesBancarias());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioConciliacionesBancarias(this.conciliacionesbancariasReturnGeneral.getConciliacionesBancarias());
		}
		
		if(this.conciliacionesbancariasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioConciliacionesBancarias(this.conciliacionesbancariasReturnGeneral.getConciliacionesBancarias(),classes);//this.conciliacionesbancariasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.conciliacionesbancarias,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyConciliacionesBancarias();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyConciliacionesBancarias();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ConciliacionesBancariasBeanSwingJInternalFrameAdditional.RecargarFormConciliacionesBancarias(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingConciliacionesBancarias(false);
						
			if(conciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConciliacionesBancarias();
			}
			
			this.actualizarVisualTableDatosConciliacionesBancarias();
			
			this.jTableDatosConciliacionesBancarias.setRowSelectionInterval(this.getIndiceNuevoConciliacionesBancarias(), this.getIndiceNuevoConciliacionesBancarias());
			
			this.seleccionarFilaTablaConciliacionesBancariasActual();
						
			this.actualizarEstadoCeldasBotonesConciliacionesBancarias("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesConciliacionesBancarias(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormConciliacionesBancarias.jDateChooserfecha_desdeConciliacionesBancarias.setEnabled(isHabilitar && this.conciliacionesbancariasConstantesFunciones.activarfecha_desdeConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jDateChooserfecha_hastaConciliacionesBancarias.setEnabled(isHabilitar && this.conciliacionesbancariasConstantesFunciones.activarfecha_hastaConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreanumero_mayorConciliacionesBancarias.setEnabled(isHabilitar && this.conciliacionesbancariasConstantesFunciones.activarnumero_mayorConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcodigo_cuentaConciliacionesBancarias.setEnabled(isHabilitar && this.conciliacionesbancariasConstantesFunciones.activarcodigo_cuentaConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreanombre_cuentaConciliacionesBancarias.setEnabled(isHabilitar && this.conciliacionesbancariasConstantesFunciones.activarnombre_cuentaConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFielddebito_localConciliacionesBancarias.setEnabled(isHabilitar && this.conciliacionesbancariasConstantesFunciones.activardebito_localConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcredito_localConciliacionesBancarias.setEnabled(isHabilitar && this.conciliacionesbancariasConstantesFunciones.activarcredito_localConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldnumero_depositoConciliacionesBancarias.setEnabled(isHabilitar && this.conciliacionesbancariasConstantesFunciones.activarnumero_depositoConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFielddebito_extranConciliacionesBancarias.setEnabled(isHabilitar && this.conciliacionesbancariasConstantesFunciones.activardebito_extranConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcredito_extranConciliacionesBancarias.setEnabled(isHabilitar && this.conciliacionesbancariasConstantesFunciones.activarcredito_extranConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jDateChooserfechaConciliacionesBancarias.setEnabled(isHabilitar && this.conciliacionesbancariasConstantesFunciones.activarfechaConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreadetalleConciliacionesBancarias.setEnabled(isHabilitar && this.conciliacionesbancariasConstantesFunciones.activardetalleConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreabeneficiarioConciliacionesBancarias.setEnabled(isHabilitar && this.conciliacionesbancariasConstantesFunciones.activarbeneficiarioConciliacionesBancarias);	
		//
		this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_empresaConciliacionesBancarias.setEnabled(isHabilitar && this.conciliacionesbancariasConstantesFunciones.activarid_empresaConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_cuenta_contableConciliacionesBancarias.setEnabled(isHabilitar && this.conciliacionesbancariasConstantesFunciones.activarid_cuenta_contableConciliacionesBancarias);
	};
	
	public void setDefaultControlesConciliacionesBancarias() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoConciliacionesBancarias(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.conciliacionesbancariasSessionBean.setConGuardarRelaciones(true);			
			this.conciliacionesbancariasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTabbedPaneRelacionesConciliacionesBancarias.setVisible(true);
			
					
		} else {
			//this.conciliacionesbancariasSessionBean.setConGuardarRelaciones(false);			
			this.conciliacionesbancariasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTabbedPaneRelacionesConciliacionesBancarias.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoConciliacionesBancarias() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConciliacionesBancarias conciliacionesbancariasAux:this.conciliacionesbancariasLogic.getConciliacionesBancariass()) {
				if(conciliacionesbancariasAux.getId().equals(this.iIdNuevoConciliacionesBancarias)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConciliacionesBancarias conciliacionesbancariasAux:this.conciliacionesbancariass) {
				if(conciliacionesbancariasAux.getId().equals(this.iIdNuevoConciliacionesBancarias)) {
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
	
	public int getIndiceActualConciliacionesBancarias(ConciliacionesBancarias conciliacionesbancarias,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConciliacionesBancarias conciliacionesbancariasAux:this.conciliacionesbancariasLogic.getConciliacionesBancariass()) {
				if(conciliacionesbancariasAux.getId().equals(conciliacionesbancarias.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConciliacionesBancarias conciliacionesbancariasAux:this.conciliacionesbancariass) {
				if(conciliacionesbancariasAux.getId().equals(conciliacionesbancarias.getId())) {
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
	
	public void setCamposBaseDesdeOriginalConciliacionesBancarias(ConciliacionesBancarias conciliacionesbancariasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConciliacionesBancarias conciliacionesbancariasAux:this.conciliacionesbancariasLogic.getConciliacionesBancariass()) {
				if(conciliacionesbancariasAux.getConciliacionesBancariasOriginal().getId().equals(conciliacionesbancariasOriginal.getId())) {
					existe=true;
					conciliacionesbancariasOriginal.setId(conciliacionesbancariasAux.getId());
					conciliacionesbancariasOriginal.setVersionRow(conciliacionesbancariasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConciliacionesBancarias conciliacionesbancariasAux:this.conciliacionesbancariass) {
				if(conciliacionesbancariasAux.getConciliacionesBancariasOriginal().getId().equals(conciliacionesbancariasOriginal.getId())) {
					existe=true;
					conciliacionesbancariasOriginal.setId(conciliacionesbancariasAux.getId());
					conciliacionesbancariasOriginal.setVersionRow(conciliacionesbancariasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosConciliacionesBancarias(Boolean esParaCancelar) throws Exception {
		conciliacionesbancariassAux=new ArrayList<ConciliacionesBancarias>();
		conciliacionesbancariasAux=new ConciliacionesBancarias();
		
		if(!this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ConciliacionesBancarias conciliacionesbancariasAux:this.conciliacionesbancariasLogic.getConciliacionesBancariass()) {
					if(conciliacionesbancariasAux.getId()<0) {
						conciliacionesbancariassAux.add(conciliacionesbancariasAux);
					}		
				}
				this.iIdNuevoConciliacionesBancarias=0L;
				this.conciliacionesbancariasLogic.getConciliacionesBancariass().removeAll(conciliacionesbancariassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConciliacionesBancarias conciliacionesbancariasAux:this.conciliacionesbancariass) {
					if(conciliacionesbancariasAux.getId()<0) {
						conciliacionesbancariassAux.add(conciliacionesbancariasAux);
					}		
				}
				this.iIdNuevoConciliacionesBancarias=0L;
				this.conciliacionesbancariass.removeAll(conciliacionesbancariassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoConciliacionesBancarias 
					&& this.conciliacionesbancariasLogic.getConciliacionesBancariass().size()>0
					) {
					conciliacionesbancariasAux=this.conciliacionesbancariasLogic.getConciliacionesBancariass().get(this.conciliacionesbancariasLogic.getConciliacionesBancariass().size() - 1);
				
					if(conciliacionesbancariasAux.getId()<0) {
						this.conciliacionesbancariasLogic.getConciliacionesBancariass().remove(conciliacionesbancariasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoConciliacionesBancarias && this.conciliacionesbancariass.size()>0) {
					conciliacionesbancariasAux=this.conciliacionesbancariass.get(this.conciliacionesbancariass.size() - 1);
				
					if(conciliacionesbancariasAux.getId()<0) {
						this.conciliacionesbancariass.remove(conciliacionesbancariasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoConciliacionesBancarias(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(conciliacionesbancarias.getId()<0) {
				this.conciliacionesbancariasLogic.getConciliacionesBancariass().remove(this.conciliacionesbancarias);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(conciliacionesbancarias.getId()<0) {
				this.conciliacionesbancariass.remove(this.conciliacionesbancarias);
			}
		}			
	}
	
	public void setEstadosInicialesConciliacionesBancarias(List<ConciliacionesBancarias> conciliacionesbancariassAux) throws Exception {
		ConciliacionesBancariasConstantesFunciones.setEstadosInicialesConciliacionesBancarias(conciliacionesbancariassAux);
	}
	
	public void setEstadosInicialesConciliacionesBancarias(ConciliacionesBancarias conciliacionesbancariasAux) throws Exception {
		ConciliacionesBancariasConstantesFunciones.setEstadosInicialesConciliacionesBancarias(conciliacionesbancariasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarConciliacionesBancariasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesConciliacionesBancarias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarConciliacionesBancariasActual()) {
				if(!this.isEsNuevoConciliacionesBancarias) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesConciliacionesBancarias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoConciliacionesBancarias=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarConciliacionesBancariasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Conciliaciones Bancarias ?", "MANTENIMIENTO DE Conciliaciones Bancarias", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesConciliacionesBancarias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ConciliacionesBancarias conciliacionesbancarias) throws Exception {
		ConciliacionesBancariasConstantesFunciones.seleccionarAsignar(this.conciliacionesbancarias,conciliacionesbancarias);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarConciliacionesBancarias=this.isPermisoActualizarOriginalConciliacionesBancarias;
			
			
			this.seleccionarAsignar(conciliacionesbancarias);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesConciliacionesBancarias("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.conciliacionesbancariasSessionBean.setsFuncionBusquedaRapida(this.conciliacionesbancariasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoConciliacionesBancarias) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosConciliacionesBancarias(esParaCancelar);				
				this.cancelarNuevoConciliacionesBancarias(esParaCancelar);								
			}
			
			this.conciliacionesbancarias=new ConciliacionesBancarias();
			
			this.inicializarConciliacionesBancarias();
			
			this.actualizarEstadoCeldasBotonesConciliacionesBancarias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarConciliacionesBancarias() throws Exception {
		try {
			ConciliacionesBancariasConstantesFunciones.inicializarConciliacionesBancarias(this.conciliacionesbancarias);
			
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
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.conciliacionesbancariasLogic.getConciliacionesBancariass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteConciliacionesBancariass(String sAccionBusqueda,List<ConciliacionesBancarias> conciliacionesbancariassParaReportes) throws Exception {
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
					sPathReporteFinal="ConciliacionesBancarias"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ConciliacionesBancariasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ConciliacionesBancariasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ConciliacionesBancarias"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Conciliaciones Bancariases");		
		parameters.put("busquedapor", ConciliacionesBancariasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceConciliacionesBancarias=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ConciliacionesBancariasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ConciliacionesBancariasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceConciliacionesBancarias=new JRBeanArrayDataSource(ConciliacionesBancariasJInternalFrame.TraerConciliacionesBancariasBeans(conciliacionesbancariassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceConciliacionesBancarias);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ConciliacionesBancariasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ConciliacionesBancariasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ConciliacionesBancariasBean.TraerConciliacionesBancariasBeans(conciliacionesbancariassParaReportes).toArray()));
							
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
				this.generarExcelReporteConciliacionesBancariass(sAccionBusqueda,sTipoArchivoReporte,conciliacionesbancariassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalConciliacionesBancariass(sAccionBusqueda,sTipoArchivoReporte,conciliacionesbancariassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoConciliacionesBancariasActionPerformed(null);
					//this.generarExcelReporteConciliacionesBancariass(sAccionBusqueda,sTipoArchivoReporte,conciliacionesbancariassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalConciliacionesBancariass(sAccionBusqueda,sTipoArchivoReporte,conciliacionesbancariassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesConciliacionesBancariass(sAccionBusqueda,sTipoArchivoReporte,conciliacionesbancariassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesConciliacionesBancariass(sAccionBusqueda,sTipoArchivoReporte,conciliacionesbancariassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteConciliacionesBancariass(String sAccionBusqueda,String sTipoArchivoReporte,List<ConciliacionesBancarias> conciliacionesbancariassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conciliacionesbancarias";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConciliacionesBancariass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConciliacionesBancarias("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ConciliacionesBancarias conciliacionesbancarias : conciliacionesbancariassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ConciliacionesBancariasConstantesFunciones.generarExcelReporteDataConciliacionesBancarias("NORMAL",row,workbook,conciliacionesbancarias,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conciliaciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderConciliacionesBancarias(String sTipo,Row row,Workbook workbook) {
		
		ConciliacionesBancariasConstantesFunciones.generarExcelReporteHeaderConciliacionesBancarias(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalConciliacionesBancariass(String sAccionBusqueda,String sTipoArchivoReporte,List<ConciliacionesBancarias> conciliacionesbancariassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conciliacionesbancarias_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConciliacionesBancariass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ConciliacionesBancarias conciliacionesbancarias : conciliacionesbancariassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ConciliacionesBancariasConstantesFunciones.getConciliacionesBancariasDescripcion(conciliacionesbancarias));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConciliacionesBancariasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conciliacionesbancarias.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConciliacionesBancariasConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conciliacionesbancarias.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConciliacionesBancariasConstantesFunciones.LABEL_FECHADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_FECHADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conciliacionesbancarias.getfecha_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConciliacionesBancariasConstantesFunciones.LABEL_FECHAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_FECHAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conciliacionesbancarias.getfecha_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conciliacionesbancarias.getnumero_mayor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConciliacionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conciliacionesbancarias.getcodigo_cuenta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conciliacionesbancarias.getnombre_cuenta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conciliacionesbancarias.getdebito_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conciliacionesbancarias.getcredito_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConciliacionesBancariasConstantesFunciones.LABEL_NUMERODEPOSITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_NUMERODEPOSITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conciliacionesbancarias.getnumero_deposito());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOEXTRAN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOEXTRAN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conciliacionesbancarias.getdebito_extran());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOEXTRAN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOEXTRAN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conciliacionesbancarias.getcredito_extran());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConciliacionesBancariasConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conciliacionesbancarias.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConciliacionesBancariasConstantesFunciones.LABEL_DETALLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_DETALLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conciliacionesbancarias.getdetalle());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conciliacionesbancarias.getbeneficiario());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conciliaciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesConciliacionesBancariass(String sAccionBusqueda,String sTipoArchivoReporte,List<ConciliacionesBancarias> conciliacionesbancariassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ConciliacionesBancarias> conciliacionesbancariassRespaldo=null;
		
		classes=ConciliacionesBancariasConstantesFunciones.getClassesRelationshipsOfConciliacionesBancarias(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.conciliacionesbancariasLogic.setDatosCliente(this.datosCliente);
		this.conciliacionesbancariasLogic.setDatosDeep(this.datosDeep);
		this.conciliacionesbancariasLogic.setIsConDeep(true);
		
		conciliacionesbancariassRespaldo=this.conciliacionesbancariasLogic.getConciliacionesBancariass();
		
		this.conciliacionesbancariasLogic.setConciliacionesBancariass(conciliacionesbancariassParaReportes);	
		this.conciliacionesbancariasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		conciliacionesbancariassParaReportes=this.conciliacionesbancariasLogic.getConciliacionesBancariass();
		this.conciliacionesbancariasLogic.setConciliacionesBancariass(conciliacionesbancariassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conciliacionesbancarias_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConciliacionesBancariass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConciliacionesBancarias("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ConciliacionesBancarias conciliacionesbancarias : conciliacionesbancariassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderConciliacionesBancarias("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ConciliacionesBancariasConstantesFunciones.generarExcelReporteDataConciliacionesBancarias("NORMAL",row,workbook,conciliacionesbancarias,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ConciliacionesBancariasConstantesFunciones.getConciliacionesBancariasDescripcion(conciliacionesbancarias));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conciliaciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessConciliacionesBancarias() throws Exception {		
		this.startProcessConciliacionesBancarias(true);
	}
	
	public void startProcessConciliacionesBancarias(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasConciliacionesBancarias ,this.jPanelParametrosReportesConciliacionesBancarias, this.jScrollPanelDatosConciliacionesBancarias,this.jPanelPaginacionConciliacionesBancarias, this.jScrollPanelDatosEdicionConciliacionesBancarias, this.jPanelAccionesConciliacionesBancarias,this.jPanelAccionesFormularioConciliacionesBancarias,this.jmenuBarConciliacionesBancarias,this.jmenuBarDetalleConciliacionesBancarias,this.jTtoolBarConciliacionesBancarias,this.jTtoolBarDetalleConciliacionesBancarias);		
		
		final JTabbedPane jTabbedPaneBusquedasConciliacionesBancarias=this.jTabbedPaneBusquedasConciliacionesBancarias; 
		
		final JPanel jPanelParametrosReportesConciliacionesBancarias=this.jPanelParametrosReportesConciliacionesBancarias;
		//final JScrollPane jScrollPanelDatosConciliacionesBancarias=this.jScrollPanelDatosConciliacionesBancarias;
		final JTable jTableDatosConciliacionesBancarias=this.jTableDatosConciliacionesBancarias;		
		final JPanel jPanelPaginacionConciliacionesBancarias=this.jPanelPaginacionConciliacionesBancarias;
		//final JScrollPane jScrollPanelDatosEdicionConciliacionesBancarias=this.jScrollPanelDatosEdicionConciliacionesBancarias;
		final JPanel jPanelAccionesConciliacionesBancarias=this.jPanelAccionesConciliacionesBancarias;
		
		JPanel jPanelCamposAuxiliarConciliacionesBancarias=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarConciliacionesBancarias=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
			jPanelCamposAuxiliarConciliacionesBancarias=this.jInternalFrameDetalleFormConciliacionesBancarias.jPanelCamposConciliacionesBancarias;
			jPanelAccionesFormularioAuxiliarConciliacionesBancarias=this.jInternalFrameDetalleFormConciliacionesBancarias.jPanelAccionesFormularioConciliacionesBancarias;
		}
		
		final JPanel jPanelCamposConciliacionesBancarias=jPanelCamposAuxiliarConciliacionesBancarias;
		final JPanel jPanelAccionesFormularioConciliacionesBancarias=jPanelAccionesFormularioAuxiliarConciliacionesBancarias;
		
		
		final JMenuBar jmenuBarConciliacionesBancarias=this.jmenuBarConciliacionesBancarias;
		final JToolBar jTtoolBarConciliacionesBancarias=this.jTtoolBarConciliacionesBancarias;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarConciliacionesBancarias=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConciliacionesBancarias=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
			jmenuBarDetalleAuxiliarConciliacionesBancarias=this.jInternalFrameDetalleFormConciliacionesBancarias.jmenuBarDetalleConciliacionesBancarias;
			jTtoolBarDetalleAuxiliarConciliacionesBancarias=this.jInternalFrameDetalleFormConciliacionesBancarias.jTtoolBarDetalleConciliacionesBancarias;
		}
		
		final JMenuBar jmenuBarDetalleConciliacionesBancarias=jmenuBarDetalleAuxiliarConciliacionesBancarias;
		final JToolBar jTtoolBarDetalleConciliacionesBancarias=jTtoolBarDetalleAuxiliarConciliacionesBancarias;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConciliacionesBancarias;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConciliacionesBancarias;
			processRunnable.jTableDatos=jTableDatosConciliacionesBancarias;
			processRunnable.jPanelCampos=jPanelCamposConciliacionesBancarias;
			processRunnable.jPanelPaginacion=jPanelPaginacionConciliacionesBancarias;
			processRunnable.jPanelAcciones=jPanelAccionesConciliacionesBancarias;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConciliacionesBancarias;
			
			
			processRunnable.jmenuBar=jmenuBarConciliacionesBancarias;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConciliacionesBancarias;
			processRunnable.jTtoolBar=jTtoolBarConciliacionesBancarias;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConciliacionesBancarias;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConciliacionesBancarias ,jPanelParametrosReportesConciliacionesBancarias,jTableDatosConciliacionesBancarias, /*jScrollPanelDatosConciliacionesBancarias,*/jPanelCamposConciliacionesBancarias,jPanelPaginacionConciliacionesBancarias, /*jScrollPanelDatosEdicionConciliacionesBancarias,*/ jPanelAccionesConciliacionesBancarias,jPanelAccionesFormularioConciliacionesBancarias,jmenuBarConciliacionesBancarias,jmenuBarDetalleConciliacionesBancarias,jTtoolBarConciliacionesBancarias,jTtoolBarDetalleConciliacionesBancarias);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConciliacionesBancarias ,jPanelParametrosReportesConciliacionesBancarias, jScrollPanelDatosConciliacionesBancarias,jPanelPaginacionConciliacionesBancarias, jScrollPanelDatosEdicionConciliacionesBancarias, jPanelAccionesConciliacionesBancarias,jPanelAccionesFormularioConciliacionesBancarias,jmenuBarConciliacionesBancarias,jmenuBarDetalleConciliacionesBancarias,jTtoolBarConciliacionesBancarias,jTtoolBarDetalleConciliacionesBancarias);
						
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
	
	public void finishProcessConciliacionesBancarias() {// throws Exception 
		this.finishProcessConciliacionesBancarias(true);
	}
	
	public void finishProcessConciliacionesBancarias(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasConciliacionesBancarias ,this.jPanelParametrosReportesConciliacionesBancarias, this.jScrollPanelDatosConciliacionesBancarias,this.jPanelPaginacionConciliacionesBancarias, this.jScrollPanelDatosEdicionConciliacionesBancarias, this.jPanelAccionesConciliacionesBancarias,this.jPanelAccionesFormularioConciliacionesBancarias,this.jmenuBarConciliacionesBancarias,this.jmenuBarDetalleConciliacionesBancarias,this.jTtoolBarConciliacionesBancarias,this.jTtoolBarDetalleConciliacionesBancarias);		
		
		final JTabbedPane jTabbedPaneBusquedasConciliacionesBancarias=this.jTabbedPaneBusquedasConciliacionesBancarias; 
		
		final JPanel jPanelParametrosReportesConciliacionesBancarias=this.jPanelParametrosReportesConciliacionesBancarias;
		//final JScrollPane jScrollPanelDatosConciliacionesBancarias=this.jScrollPanelDatosConciliacionesBancarias;
		final JTable jTableDatosConciliacionesBancarias=this.jTableDatosConciliacionesBancarias;		
		final JPanel jPanelPaginacionConciliacionesBancarias=this.jPanelPaginacionConciliacionesBancarias;
		//final JScrollPane jScrollPanelDatosEdicionConciliacionesBancarias=this.jScrollPanelDatosEdicionConciliacionesBancarias;
		final JPanel jPanelAccionesConciliacionesBancarias=this.jPanelAccionesConciliacionesBancarias;
		
		JPanel jPanelCamposAuxiliarConciliacionesBancarias=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarConciliacionesBancarias=new JPanel();
		
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
			jPanelCamposAuxiliarConciliacionesBancarias=this.jInternalFrameDetalleFormConciliacionesBancarias.jPanelCamposConciliacionesBancarias;
			jPanelAccionesFormularioAuxiliarConciliacionesBancarias=this.jInternalFrameDetalleFormConciliacionesBancarias.jPanelAccionesFormularioConciliacionesBancarias;
		}
		
		final JPanel jPanelCamposConciliacionesBancarias=jPanelCamposAuxiliarConciliacionesBancarias;
		final JPanel jPanelAccionesFormularioConciliacionesBancarias=jPanelAccionesFormularioAuxiliarConciliacionesBancarias;
		
		
		final JMenuBar jmenuBarConciliacionesBancarias=this.jmenuBarConciliacionesBancarias;		
		final JToolBar jTtoolBarConciliacionesBancarias=this.jTtoolBarConciliacionesBancarias;
				
		JMenuBar jmenuBarDetalleAuxiliarConciliacionesBancarias=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConciliacionesBancarias=new JToolBar();
		
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
			jmenuBarDetalleAuxiliarConciliacionesBancarias=this.jInternalFrameDetalleFormConciliacionesBancarias.jmenuBarDetalleConciliacionesBancarias;
			jTtoolBarDetalleAuxiliarConciliacionesBancarias=this.jInternalFrameDetalleFormConciliacionesBancarias.jTtoolBarDetalleConciliacionesBancarias;		
		}
		
		final JMenuBar jmenuBarDetalleConciliacionesBancarias=jmenuBarDetalleAuxiliarConciliacionesBancarias;
		final JToolBar jTtoolBarDetalleConciliacionesBancarias=jTtoolBarDetalleAuxiliarConciliacionesBancarias;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConciliacionesBancarias;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConciliacionesBancarias;
			processRunnable.jTableDatos=jTableDatosConciliacionesBancarias;
			processRunnable.jPanelCampos=jPanelCamposConciliacionesBancarias;
			processRunnable.jPanelPaginacion=jPanelPaginacionConciliacionesBancarias;
			processRunnable.jPanelAcciones=jPanelAccionesConciliacionesBancarias;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConciliacionesBancarias;
			
			
			processRunnable.jmenuBar=jmenuBarConciliacionesBancarias;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConciliacionesBancarias;
			processRunnable.jTtoolBar=jTtoolBarConciliacionesBancarias;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConciliacionesBancarias;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasConciliacionesBancarias ,jPanelParametrosReportesConciliacionesBancarias, jTableDatosConciliacionesBancarias,/*jScrollPanelDatosConciliacionesBancarias,*/jPanelCamposConciliacionesBancarias,jPanelPaginacionConciliacionesBancarias, /*jScrollPanelDatosEdicionConciliacionesBancarias,*/ jPanelAccionesConciliacionesBancarias,jPanelAccionesFormularioConciliacionesBancarias,jmenuBarConciliacionesBancarias,jmenuBarDetalleConciliacionesBancarias,jTtoolBarConciliacionesBancarias,jTtoolBarDetalleConciliacionesBancarias));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesConciliacionesBancarias(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarConciliacionesBancarias(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuConciliacionesBancarias(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarConciliacionesBancarias(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarConciliacionesBancarias,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleConciliacionesBancarias,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuConciliacionesBancarias(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarConciliacionesBancarias,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleConciliacionesBancarias,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.conciliacionesbancariasConstantesFunciones.getsFinalQueryConciliacionesBancarias();
		String  finalQueryPaginacionTodos=this.conciliacionesbancariasConstantesFunciones.getsFinalQueryConciliacionesBancarias();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ConciliacionesBancariasConstantesFunciones.getArrayColumnasGlobalesNoConciliacionesBancarias(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ConciliacionesBancariasConstantesFunciones.getArrayColumnasGlobalesConciliacionesBancarias(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ConciliacionesBancariasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.conciliacionesbancariassEliminados= new ArrayList<ConciliacionesBancarias>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessConciliacionesBancarias();
		
				///*ConciliacionesBancariasSessionBean*/this.conciliacionesbancariasSessionBean=new ConciliacionesBancariasSessionBean();
			
			if(this.conciliacionesbancariasSessionBean==null) {
				this.conciliacionesbancariasSessionBean=new ConciliacionesBancariasSessionBean();
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
					this.iNumeroPaginacion=ConciliacionesBancariasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ConciliacionesBancariasConstantesFunciones.getClassesForeignKeysOfConciliacionesBancarias(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/conciliacionesbancarias."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			conciliacionesbancariassAux= new ArrayList<ConciliacionesBancarias>();
			
				
			conciliacionesbancariasLogic.setDatosCliente(this.datosCliente);
			conciliacionesbancariasLogic.setDatosDeep(this.datosDeep);
			conciliacionesbancariasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaConciliacionesBancarias")) {
				this.sDetalleReporte=ConciliacionesBancariasConstantesFunciones.getDetalleIndiceBusquedaConciliacionesBancarias(id_cuenta_contableBusquedaConciliacionesBancarias,fecha_desdeBusquedaConciliacionesBancarias,fecha_hastaBusquedaConciliacionesBancarias);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					conciliacionesbancariasLogic.getConciliacionesBancariassBusquedaConciliacionesBancarias(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_cuenta_contableBusquedaConciliacionesBancarias,fecha_desdeBusquedaConciliacionesBancarias,fecha_hastaBusquedaConciliacionesBancarias);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConciliacionesBancariasConstantesFunciones.getDetalleIndiceBusquedaConciliacionesBancarias(id_cuenta_contableBusquedaConciliacionesBancarias,fecha_desdeBusquedaConciliacionesBancarias,fecha_hastaBusquedaConciliacionesBancarias);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConciliacionesBancariasConstantesFunciones.getDetalleIndiceBusquedaConciliacionesBancarias(id_cuenta_contableBusquedaConciliacionesBancarias,fecha_desdeBusquedaConciliacionesBancarias,fecha_hastaBusquedaConciliacionesBancarias);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=conciliacionesbancariasLogic.getConciliacionesBancariass()==null||conciliacionesbancariasLogic.getConciliacionesBancariass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=conciliacionesbancariass==null|| conciliacionesbancariass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						conciliacionesbancariassAux=new ArrayList<ConciliacionesBancarias>();
						conciliacionesbancariassAux.addAll(conciliacionesbancariasLogic.getConciliacionesBancariass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conciliacionesbancariassAux=new ArrayList<ConciliacionesBancarias>();
							conciliacionesbancariassAux.addAll(conciliacionesbancariass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							conciliacionesbancariasLogic.getConciliacionesBancariassBusquedaConciliacionesBancarias(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_cuenta_contableBusquedaConciliacionesBancarias,fecha_desdeBusquedaConciliacionesBancarias,fecha_hastaBusquedaConciliacionesBancarias);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConciliacionesBancariasConstantesFunciones.getDetalleIndiceBusquedaConciliacionesBancarias(id_cuenta_contableBusquedaConciliacionesBancarias,fecha_desdeBusquedaConciliacionesBancarias,fecha_hastaBusquedaConciliacionesBancarias);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConciliacionesBancariasConstantesFunciones.getDetalleIndiceBusquedaConciliacionesBancarias(id_cuenta_contableBusquedaConciliacionesBancarias,fecha_desdeBusquedaConciliacionesBancarias,fecha_hastaBusquedaConciliacionesBancarias);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteConciliacionesBancariass("BusquedaConciliacionesBancarias",conciliacionesbancariasLogic.getConciliacionesBancariass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteConciliacionesBancariass("BusquedaConciliacionesBancarias",conciliacionesbancariass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						conciliacionesbancariasLogic.setConciliacionesBancariass(new ArrayList<ConciliacionesBancarias>());
						conciliacionesbancariasLogic.getConciliacionesBancariass().addAll(conciliacionesbancariassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conciliacionesbancariass=new ArrayList<ConciliacionesBancarias>();
							conciliacionesbancariass.addAll(conciliacionesbancariassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesConciliacionesBancarias();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessConciliacionesBancarias();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=conciliacionesbancariasLogic.getConciliacionesBancariass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=conciliacionesbancariass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=conciliacionesbancariasLogic.getConciliacionesBancariass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=conciliacionesbancariass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ConciliacionesBancarias conciliacionesbancarias) {
		Boolean permite=true;
		
		if(this.conciliacionesbancarias.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ConciliacionesBancariasConstantesFunciones.getOrderByListaConciliacionesBancarias();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ConciliacionesBancariasConstantesFunciones.getOrderByListaConciliacionesBancarias();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConciliacionesBancarias conciliacionesbancarias:conciliacionesbancariasLogic.getConciliacionesBancariass()) {
				if(conciliacionesbancarias.getsType().equals(Constantes2.S_TOTALES)) {
					conciliacionesbancariasTotales=conciliacionesbancarias;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConciliacionesBancarias conciliacionesbancarias:this.conciliacionesbancariass) {
				if(conciliacionesbancarias.getsType().equals(Constantes2.S_TOTALES)) {
					conciliacionesbancariasTotales=conciliacionesbancarias;
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
			this.conciliacionesbancariasAux=new ConciliacionesBancarias();
			this.conciliacionesbancariasAux.setsType(Constantes2.S_TOTALES);
			this.conciliacionesbancariasAux.setIsNew(false);
			this.conciliacionesbancariasAux.setIsChanged(false);
			this.conciliacionesbancariasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ConciliacionesBancariasConstantesFunciones.TotalizarValoresFilaConciliacionesBancarias(this.conciliacionesbancariasLogic.getConciliacionesBancariass(),this.conciliacionesbancariasAux);
				
				//this.conciliacionesbancariasLogic.getConciliacionesBancariass().add(this.conciliacionesbancariasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ConciliacionesBancariasConstantesFunciones.TotalizarValoresFilaConciliacionesBancarias(this.conciliacionesbancariass,this.conciliacionesbancariasAux);
				
				this.conciliacionesbancariass.add(this.conciliacionesbancariasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		conciliacionesbancariasTotales=new ConciliacionesBancarias();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.conciliacionesbancariasLogic.getConciliacionesBancariass().remove(conciliacionesbancariasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.conciliacionesbancariass.remove(conciliacionesbancariasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		conciliacionesbancariasTotales=new ConciliacionesBancarias();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConciliacionesBancarias conciliacionesbancarias:conciliacionesbancariasLogic.getConciliacionesBancariass()) {
				if(conciliacionesbancarias.getsType().equals(Constantes2.S_TOTALES)) {
					conciliacionesbancariasTotales=conciliacionesbancarias;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConciliacionesBancariasConstantesFunciones.TotalizarValoresFilaConciliacionesBancarias(this.conciliacionesbancariasLogic.getConciliacionesBancariass(),conciliacionesbancariasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConciliacionesBancarias conciliacionesbancarias:this.conciliacionesbancariass) {
				if(conciliacionesbancarias.getsType().equals(Constantes2.S_TOTALES)) {
					conciliacionesbancariasTotales=conciliacionesbancarias;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConciliacionesBancariasConstantesFunciones.TotalizarValoresFilaConciliacionesBancarias(this.conciliacionesbancariass,conciliacionesbancariasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getConciliacionesBancariassBusquedaConciliacionesBancarias()throws Exception {
		try {
			sAccionBusqueda="BusquedaConciliacionesBancarias";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConciliacionesBancariassFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConciliacionesBancariassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getConciliacionesBancariassBusquedaConciliacionesBancarias(String sFinalQuery,Long id_cuenta_contable,Date fecha_desde,Date fecha_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//conciliacionesbancariasLogic.getConciliacionesBancariassBusquedaConciliacionesBancarias(sFinalQuery,this.pagination,id_cuenta_contable,fecha_desde,fecha_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConciliacionesBancariassFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//conciliacionesbancariasLogic.getConciliacionesBancariassFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConciliacionesBancariassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//conciliacionesbancariasLogic.getConciliacionesBancariassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosConciliacionesBancarias() {
		this.isPermisoTodoConciliacionesBancarias=false;
		this.isPermisoNuevoConciliacionesBancarias=false;
		this.isPermisoActualizarConciliacionesBancarias=false;
		this.isPermisoActualizarOriginalConciliacionesBancarias=false;
		this.isPermisoEliminarConciliacionesBancarias=false;
		this.isPermisoGuardarCambiosConciliacionesBancarias=false;
		this.isPermisoConsultaConciliacionesBancarias=true;
		this.isPermisoBusquedaConciliacionesBancarias=true;
		this.isPermisoReporteConciliacionesBancarias=true;
		this.isPermisoOrdenConciliacionesBancarias=false;		
		this.isPermisoPaginacionMedioConciliacionesBancarias=false;		
		this.isPermisoPaginacionAltoConciliacionesBancarias=false;		
		this.isPermisoPaginacionTodoConciliacionesBancarias=false;		
		this.isPermisoCopiarConciliacionesBancarias=false;		
		this.isPermisoVerFormConciliacionesBancarias=false;		
		this.isPermisoDuplicarConciliacionesBancarias=false;
		this.isPermisoOrdenConciliacionesBancarias=false;
	}
	
	public void setPermisosUsuarioConciliacionesBancarias(Boolean isPermiso) {
		this.isPermisoTodoConciliacionesBancarias=isPermiso;
		this.isPermisoNuevoConciliacionesBancarias=isPermiso;
		this.isPermisoActualizarConciliacionesBancarias=isPermiso;
		this.isPermisoActualizarOriginalConciliacionesBancarias=isPermiso;
		this.isPermisoEliminarConciliacionesBancarias=isPermiso;
		this.isPermisoGuardarCambiosConciliacionesBancarias=isPermiso;
		this.isPermisoConsultaConciliacionesBancarias=isPermiso;
		this.isPermisoBusquedaConciliacionesBancarias=isPermiso;
		this.isPermisoReporteConciliacionesBancarias=isPermiso;
		this.isPermisoOrdenConciliacionesBancarias=isPermiso;		
		this.isPermisoPaginacionMedioConciliacionesBancarias=isPermiso;		
		this.isPermisoPaginacionAltoConciliacionesBancarias=isPermiso;		
		this.isPermisoPaginacionTodoConciliacionesBancarias=isPermiso;		
		this.isPermisoCopiarConciliacionesBancarias=isPermiso;		
		this.isPermisoVerFormConciliacionesBancarias=isPermiso;		
		this.isPermisoDuplicarConciliacionesBancarias=isPermiso;
		this.isPermisoOrdenConciliacionesBancarias=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioConciliacionesBancarias(Boolean isPermiso) {
		//this.isPermisoTodoConciliacionesBancarias=isPermiso;
		this.isPermisoNuevoConciliacionesBancarias=isPermiso;
		this.isPermisoActualizarConciliacionesBancarias=isPermiso;
		this.isPermisoActualizarOriginalConciliacionesBancarias=isPermiso;
		this.isPermisoEliminarConciliacionesBancarias=isPermiso;
		this.isPermisoGuardarCambiosConciliacionesBancarias=isPermiso;
		//this.isPermisoConsultaConciliacionesBancarias=isPermiso;
		//this.isPermisoBusquedaConciliacionesBancarias=isPermiso;
		//this.isPermisoReporteConciliacionesBancarias=isPermiso;
		//this.isPermisoOrdenConciliacionesBancarias=isPermiso;		
		//this.isPermisoPaginacionMedioConciliacionesBancarias=isPermiso;		
		//this.isPermisoPaginacionAltoConciliacionesBancarias=isPermiso;		
		//this.isPermisoPaginacionTodoConciliacionesBancarias=isPermiso;		
		//this.isPermisoCopiarConciliacionesBancarias=isPermiso;		
		//this.isPermisoDuplicarConciliacionesBancarias=isPermiso;
		//this.isPermisoOrdenConciliacionesBancarias=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioConciliacionesBancariasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ConciliacionesBancariasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebConciliacionesBancarias(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioConciliacionesBancariasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioConciliacionesBancariasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionConciliacionesBancariasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioConciliacionesBancariasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioConciliacionesBancarias() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ConciliacionesBancariasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ConciliacionesBancariasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoConciliacionesBancarias=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarConciliacionesBancarias=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalConciliacionesBancarias=this.isPermisoActualizarConciliacionesBancarias;
			this.isPermisoEliminarConciliacionesBancarias=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosConciliacionesBancarias=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaConciliacionesBancarias=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaConciliacionesBancarias=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoConciliacionesBancarias=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteConciliacionesBancarias=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConciliacionesBancarias=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioConciliacionesBancarias=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoConciliacionesBancarias=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoConciliacionesBancarias=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarConciliacionesBancarias=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormConciliacionesBancarias=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarConciliacionesBancarias=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConciliacionesBancarias=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosConciliacionesBancarias.setToolTipText(this.jTableDatosConciliacionesBancarias.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioConciliacionesBancarias(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioConciliacionesBancarias(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ConciliacionesBancariasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ConciliacionesBancariasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioConciliacionesBancarias() throws Exception {
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
	public void inicializarCombosForeignKeyConciliacionesBancariasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyConciliacionesBancariasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ConciliacionesBancariasJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyCuentaContableListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyConciliacionesBancarias()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCuentaContable();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.conciliacionesbancariasSessionBean==null) {
				this.conciliacionesbancariasSessionBean=new ConciliacionesBancariasSessionBean();
			}

			if(!this.conciliacionesbancariasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.conciliacionesbancariasSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				CuentaContable cuentacontable=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontable,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontable.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontablesForeignKey,cuentacontable,true)) {

					this.cuentacontablesForeignKey.add(0,cuentacontable);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyConciliacionesBancarias()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyConciliacionesBancarias(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyConciliacionesBancarias()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyConciliacionesBancarias();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyConciliacionesBancarias(ConciliacionesBancarias conciliacionesbancarias)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyConciliacionesBancarias(ConciliacionesBancarias conciliacionesbancarias,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyConciliacionesBancarias()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyConciliacionesBancarias()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyConciliacionesBancarias()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyConciliacionesBancarias()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroConciliacionesBancarias()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyConciliacionesBancarias()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyConciliacionesBancarias(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyConciliacionesBancarias()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_empresaConciliacionesBancarias!=null && this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_empresaConciliacionesBancarias.getItemCount()>0) {
				this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_empresaConciliacionesBancarias.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_cuenta_contableConciliacionesBancarias!=null && this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_cuenta_contableConciliacionesBancarias.getItemCount()>0) {
				this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_cuenta_contableConciliacionesBancarias.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public ConciliacionesBancariasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ConciliacionesBancariasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ConciliacionesBancariasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.conciliacionesbancariasSessionBean=new ConciliacionesBancariasSessionBean(); 
		this.conciliacionesbancariasConstantesFunciones=new ConciliacionesBancariasConstantesFunciones(); 
		this.conciliacionesbancariasBean=new ConciliacionesBancarias();//(this.conciliacionesbancariasConstantesFunciones); 		
		this.conciliacionesbancariasReturnGeneral=new ConciliacionesBancariasParameterReturnGeneral(); 
		
		this.conciliacionesbancariasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.conciliacionesbancariasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ConciliacionesBancariasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ConciliacionesBancariasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ConciliacionesBancariasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessConciliacionesBancarias(true);
			
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
			
			this.conciliacionesbancariasConstantesFunciones=new ConciliacionesBancariasConstantesFunciones(); 
			this.conciliacionesbancariasBean=new ConciliacionesBancarias();//this.conciliacionesbancariasConstantesFunciones); 			
			this.conciliacionesbancariasReturnGeneral=new ConciliacionesBancariasParameterReturnGeneral(); 
		
			ConciliacionesBancariasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Conciliaciones Bancarias Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.conciliacionesbancarias=new ConciliacionesBancarias();
			this.conciliacionesbancariass = new ArrayList<ConciliacionesBancarias>();
			this.conciliacionesbancariassAux = new ArrayList<ConciliacionesBancarias>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic=new ConciliacionesBancariasLogic();
				this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			//this.conciliacionesbancariasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.conciliacionesbancariasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormConciliacionesBancarias);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoConciliacionesBancarias!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConciliacionesBancarias);	
					}
					
					if(this.jInternalFrameImportacionConciliacionesBancarias!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConciliacionesBancarias);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByConciliacionesBancarias!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByConciliacionesBancarias);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormConciliacionesBancarias);
				this.jInternalFrameDetalleFormConciliacionesBancarias.setVisible(false);
				this.jInternalFrameDetalleFormConciliacionesBancarias.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoConciliacionesBancarias!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConciliacionesBancarias);
					this.jInternalFrameReporteDinamicoConciliacionesBancarias.setVisible(false);
					this.jInternalFrameReporteDinamicoConciliacionesBancarias.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionConciliacionesBancarias!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionConciliacionesBancarias);
					this.jInternalFrameImportacionConciliacionesBancarias.setVisible(false);
					this.jInternalFrameImportacionConciliacionesBancarias.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByConciliacionesBancarias!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByConciliacionesBancarias);
					this.jInternalFrameOrderByConciliacionesBancarias.setVisible(false);
					this.jInternalFrameOrderByConciliacionesBancarias.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idConciliacionesBancariasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ConciliacionesBancariasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.conciliacionesbancariasReturnGeneral=new ConciliacionesBancariasParameterReturnGeneral();
			
			this.conciliacionesbancariasParameterGeneral=new ConciliacionesBancariasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.conciliacionesbancariasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ConciliacionesBancariasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConciliacionesBancariasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado(),this.conciliacionesbancariasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConciliacionesBancariasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado(),this.conciliacionesbancariasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoConciliacionesBancarias=false;
			this.isVisibilidadCeldaDuplicarConciliacionesBancarias=true;
			this.isVisibilidadCeldaCopiarConciliacionesBancarias=true;
			this.isVisibilidadCeldaVerFormConciliacionesBancarias=true;
			this.isVisibilidadCeldaOrdenConciliacionesBancarias=true;
			this.isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias=false;
			this.isVisibilidadCeldaModificarConciliacionesBancarias=false;
			this.isVisibilidadCeldaActualizarConciliacionesBancarias=false;
			this.isVisibilidadCeldaEliminarConciliacionesBancarias=false;
			this.isVisibilidadCeldaCancelarConciliacionesBancarias=false;
			this.isVisibilidadCeldaGuardarConciliacionesBancarias=false;
			this.isVisibilidadCeldaGuardarCambiosConciliacionesBancarias=false;
			
			
			this.isVisibilidadBusquedaConciliacionesBancarias=true;
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesConciliacionesBancarias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosConciliacionesBancarias();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioConciliacionesBancarias(false);
			
			this.setPermisosUsuarioConciliacionesBancarias();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado() 
				|| (this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado() && this.conciliacionesbancariasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioConciliacionesBancariasClasesRelacionadas();
			}
			
			if(this.conciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioConciliacionesBancariasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosConciliacionesBancarias();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualConciliacionesBancarias();
			}
			
			if(!this.isPermisoBusquedaConciliacionesBancarias) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasConciliacionesBancarias.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ConciliacionesBancariasConstantesFunciones.getTiposSeleccionarConciliacionesBancarias());
				
				this.tiposColumnasSelect=ConciliacionesBancariasConstantesFunciones.getTiposSeleccionarConciliacionesBancarias(true);
				
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
			//if(!this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioConciliacionesBancarias();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioConciliacionesBancarias(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioConciliacionesBancarias(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesConciliacionesBancarias() ;
			
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
			this.cuentacontableLogic=new CuentaContableLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				conciliacionesbancariasImplementable= (ConciliacionesBancariasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConciliacionesBancariasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				conciliacionesbancariasImplementableHome= (ConciliacionesBancariasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConciliacionesBancariasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.conciliacionesbancariass= new ArrayList<ConciliacionesBancarias>();
			this.conciliacionesbancariassEliminados= new ArrayList<ConciliacionesBancarias>();
						
			this.isEsNuevoConciliacionesBancarias=false;
			this.esParaAccionDesdeFormularioConciliacionesBancarias=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyConciliacionesBancarias(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroConciliacionesBancarias();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ConciliacionesBancariasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ConciliacionesBancariasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesConciliacionesBancarias("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingConciliacionesBancarias(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioConciliacionesBancarias();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioConciliacionesBancarias();
			}
			
			ConciliacionesBancariasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasConciliacionesBancarias.getTabCount(); i++) {
					this.jTabbedPaneBusquedasConciliacionesBancarias.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasConciliacionesBancarias.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessConciliacionesBancarias(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ConciliacionesBancarias: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectConciliacionesBancarias() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesConciliacionesBancarias")) {
				iIndex=this.jInternalFrameDetalleFormConciliacionesBancarias.jTabbedPaneRelacionesConciliacionesBancarias.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormConciliacionesBancarias.jTabbedPaneRelacionesConciliacionesBancarias.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessConciliacionesBancarias();	
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
	
	public void cargarCombosForeignKeyConciliacionesBancarias(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyConciliacionesBancarias(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyConciliacionesBancarias(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyConciliacionesBancariasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyConciliacionesBancarias();
		
		this.cargarCombosFrameForeignKeyConciliacionesBancarias();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyConciliacionesBancarias();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyConciliacionesBancarias();
		}
	}
	
	

	public void cargarCombosForeignKeyCuentaContable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoConciliacionesBancariasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.conciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
			
			
			if(jTableDatosConciliacionesBancarias.getRowCount()>=1) {
				jTableDatosConciliacionesBancarias.removeRowSelectionInterval(0, jTableDatosConciliacionesBancarias.getRowCount()-1);						
			}
			
			this.isEsNuevoConciliacionesBancarias=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoConciliacionesBancarias(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesConciliacionesBancarias(true);			
			//this.conciliacionesbancarias=new ConciliacionesBancarias();
			//this.conciliacionesbancarias.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConciliacionesBancarias(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConciliacionesBancarias() ;
			
			if(ConciliacionesBancariasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConciliacionesBancarias(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.conciliacionesbancarias);	
			this.actualizarInformacion("INFO_PADRE",false,this.conciliacionesbancarias);				
			
			ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
			
			if(this.conciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ConciliacionesBancarias: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarConciliacionesBancariasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ConciliacionesBancarias> conciliacionesbancariassSeleccionados=new ArrayList<ConciliacionesBancarias>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosConciliacionesBancarias.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosConciliacionesBancarias.getSelectedRows().length;			
			}
			
			conciliacionesbancariassSeleccionados=this.getConciliacionesBancariassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoConciliacionesBancarias--;			
				//ConciliacionesBancarias conciliacionesbancariasAux= new ConciliacionesBancarias();			
				//conciliacionesbancariasAux.setId(this.iIdNuevoConciliacionesBancarias);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ConciliacionesBancarias conciliacionesbancariasOrigen=new ConciliacionesBancarias();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ConciliacionesBancarias conciliacionesbancariasOrigen : conciliacionesbancariassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							conciliacionesbancariasOrigen =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conciliacionesbancariasOrigen =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaConciliacionesBancarias();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.conciliacionesbancarias.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosConciliacionesBancarias(conciliacionesbancariasOrigen,this.conciliacionesbancarias,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.conciliacionesbancariasLogic.getConciliacionesBancariass().add(this.conciliacionesbancariasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.conciliacionesbancariass.add(this.conciliacionesbancariasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaConciliacionesBancarias(false);
				
				this.jTableDatosConciliacionesBancarias.setRowSelectionInterval(this.getIndiceNuevoConciliacionesBancarias(), this.getIndiceNuevoConciliacionesBancarias());
				
				int iLastRow =  this.jTableDatosConciliacionesBancarias.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConciliacionesBancarias.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConciliacionesBancarias.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConciliacionesBancarias(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ConciliacionesBancarias> conciliacionesbancariassSeleccionados=new ArrayList<ConciliacionesBancarias>();									
		
			ConciliacionesBancarias conciliacionesbancariasOrigen=new ConciliacionesBancarias();
			ConciliacionesBancarias conciliacionesbancariasDestino=new ConciliacionesBancarias();
				
			conciliacionesbancariassSeleccionados=this.getConciliacionesBancariassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosConciliacionesBancarias.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || conciliacionesbancariassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosConciliacionesBancarias.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conciliacionesbancariasOrigen =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						conciliacionesbancariasOrigen =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conciliacionesbancariasDestino =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						conciliacionesbancariasDestino =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				conciliacionesbancariasOrigen =conciliacionesbancariassSeleccionados.get(0);
				conciliacionesbancariasDestino =conciliacionesbancariassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosConciliacionesBancarias(conciliacionesbancariasOrigen,conciliacionesbancariasDestino,true,false);
				
				conciliacionesbancariasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(conciliacionesbancariasDestino,conciliacionesbancariasLogic.getConciliacionesBancariass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(conciliacionesbancariasDestino,conciliacionesbancariass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaConciliacionesBancarias(false);
				
				//this.jTableDatosConciliacionesBancarias.setRowSelectionInterval(this.getIndiceNuevoConciliacionesBancarias(), this.getIndiceNuevoConciliacionesBancarias());
				
				int iLastRow =  this.jTableDatosConciliacionesBancarias.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConciliacionesBancarias.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConciliacionesBancarias.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConciliacionesBancarias(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormConciliacionesBancarias.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesConciliacionesBancarias.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasConciliacionesBancarias.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesConciliacionesBancarias.setVisible(!isVisible);
			this.jPanelPaginacionConciliacionesBancarias.setVisible(!isVisible);
			this.jPanelAccionesConciliacionesBancarias.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameConciliacionesBancarias();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoConciliacionesBancarias();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionConciliacionesBancarias();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByConciliacionesBancarias();
			
			this.abrirFrameOrderByConciliacionesBancarias();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByConciliacionesBancarias();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleConciliacionesBancarias(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormConciliacionesBancarias);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormConciliacionesBancarias.isMaximum()) {
					this.jInternalFrameDetalleFormConciliacionesBancarias.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormConciliacionesBancarias.setSize(this.jInternalFrameDetalleFormConciliacionesBancarias.iWidthFormulario,this.jInternalFrameDetalleFormConciliacionesBancarias.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormConciliacionesBancarias.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormConciliacionesBancarias.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormConciliacionesBancarias.isMaximum()) {
						this.jInternalFrameDetalleFormConciliacionesBancarias.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormConciliacionesBancarias.jContentPaneDetalleConciliacionesBancarias.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormConciliacionesBancarias.jTabbedPaneRelacionesConciliacionesBancarias.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormConciliacionesBancarias.jContentPaneDetalleConciliacionesBancarias.getWidth(),ConciliacionesBancariasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConciliacionesBancarias.jTabbedPaneRelacionesConciliacionesBancarias.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormConciliacionesBancarias.jContentPaneDetalleConciliacionesBancarias.getWidth(),ConciliacionesBancariasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConciliacionesBancarias.jTabbedPaneRelacionesConciliacionesBancarias.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormConciliacionesBancarias.jContentPaneDetalleConciliacionesBancarias.getWidth(),ConciliacionesBancariasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormConciliacionesBancarias.setVisible(true);
	        this.jInternalFrameDetalleFormConciliacionesBancarias.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByConciliacionesBancarias() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByConciliacionesBancarias==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByConciliacionesBancarias=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConciliacionesBancarias,false,this);
				} else {
					this.jInternalFrameOrderByConciliacionesBancarias=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConciliacionesBancarias,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByConciliacionesBancarias);
				this.jInternalFrameOrderByConciliacionesBancarias.setVisible(false);
				this.jInternalFrameOrderByConciliacionesBancarias.setSelected(false);
				
				this.jInternalFrameOrderByConciliacionesBancarias.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConciliacionesBancarias"));
				
				this.inicializarActualizarBindingTablaOrderByConciliacionesBancarias();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionConciliacionesBancarias() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionConciliacionesBancarias==null) {
				
				this.jInternalFrameImportacionConciliacionesBancarias=new ImportacionJInternalFrame(ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConciliacionesBancarias);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionConciliacionesBancarias);
				this.jInternalFrameImportacionConciliacionesBancarias.setVisible(false);
				this.jInternalFrameImportacionConciliacionesBancarias.setSelected(false);


				this.jInternalFrameImportacionConciliacionesBancarias.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConciliacionesBancarias"));
				this.jInternalFrameImportacionConciliacionesBancarias.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConciliacionesBancarias"));
				this.jInternalFrameImportacionConciliacionesBancarias.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConciliacionesBancarias"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoConciliacionesBancarias() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoConciliacionesBancarias==null) {
				this.jInternalFrameReporteDinamicoConciliacionesBancarias=new ReporteDinamicoJInternalFrame(ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConciliacionesBancarias);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConciliacionesBancarias);
				this.jInternalFrameReporteDinamicoConciliacionesBancarias.setVisible(false);
				this.jInternalFrameReporteDinamicoConciliacionesBancarias.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConciliacionesBancarias"));
				this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConciliacionesBancarias"));
				this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConciliacionesBancarias"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConciliacionesBancarias();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleConciliacionesBancarias() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormConciliacionesBancarias);
			
	       	this.jInternalFrameDetalleFormConciliacionesBancarias.setVisible(false);
	        this.jInternalFrameDetalleFormConciliacionesBancarias.setSelected(false);
			
			//this.jInternalFrameDetalleFormConciliacionesBancarias.dispose();
			//this.jInternalFrameDetalleFormConciliacionesBancarias=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoConciliacionesBancarias() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoConciliacionesBancarias.setVisible(true);
	        this.jInternalFrameReporteDinamicoConciliacionesBancarias.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionConciliacionesBancarias() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionConciliacionesBancarias.setVisible(true);
	        this.jInternalFrameImportacionConciliacionesBancarias.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByConciliacionesBancarias() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByConciliacionesBancarias.setVisible(true);
	        this.jInternalFrameOrderByConciliacionesBancarias.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByConciliacionesBancarias() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByConciliacionesBancarias.setVisible(false);
	        this.jInternalFrameOrderByConciliacionesBancarias.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoConciliacionesBancarias() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoConciliacionesBancarias.setVisible(false);
	        this.jInternalFrameReporteDinamicoConciliacionesBancarias.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionConciliacionesBancarias() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionConciliacionesBancarias.setVisible(false);
	        this.jInternalFrameImportacionConciliacionesBancarias.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarConciliacionesBancarias(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarConciliacionesBancarias(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesConciliacionesBancarias(true);
			//this.isEsNuevoConciliacionesBancarias=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesConciliacionesBancarias("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConciliacionesBancarias(false) ;
			
			if(conciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ConciliacionesBancariasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConciliacionesBancarias(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConciliacionesBancarias(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaConciliacionesBancariasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarConciliacionesBancarias(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesConciliacionesBancarias(true);
			//this.isEsNuevoConciliacionesBancarias=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.conciliacionesbancarias.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesConciliacionesBancarias("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesConciliacionesBancarias(false) ;
			
			if(ConciliacionesBancariasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConciliacionesBancarias(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConciliacionesBancarias(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConciliacionesBancarias,ConciliacionesBancariasConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConciliacionesBancarias.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesConciliacionesBancarias(false);
			
			//if(!this.isEsNuevoConciliacionesBancarias) {								
				int intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.conciliacionesbancarias,true);
				this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
				
			}
			
			if(this.permiteMantenimiento(this.conciliacionesbancarias)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoConciliacionesBancarias=true;
					this.inicializarActualizarBindingTablaConciliacionesBancarias(false);
					this.isEsNuevoConciliacionesBancarias=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoConciliacionesBancarias=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoConciliacionesBancarias=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConciliacionesBancarias(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConciliacionesBancarias(false);
				
				this.habilitarDeshabilitarControlesConciliacionesBancarias(false);
			
												
				
				if(ConciliacionesBancariasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleConciliacionesBancarias();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoConciliacionesBancariasActionPerformed(evt,conciliacionesbancariasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualConciliacionesBancarias(this.conciliacionesbancarias,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosConciliacionesBancarias.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,conciliacionesbancariasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.conciliacionesbancarias.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ConciliacionesBancarias.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConciliacionesBancarias.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				this.conciliacionesbancarias.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				this.conciliacionesbancarias.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.conciliacionesbancarias)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ConciliacionesBancariasModel) this.jTableDatosConciliacionesBancarias.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoConciliacionesBancarias=true;
				this.inicializarActualizarBindingTablaConciliacionesBancarias(false);
				this.isEsNuevoConciliacionesBancarias=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConciliacionesBancarias(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConciliacionesBancarias(false);
				
				this.habilitarDeshabilitarControlesConciliacionesBancarias(false);
				
				
				
				if(ConciliacionesBancariasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleConciliacionesBancarias();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosConciliacionesBancarias.getRowCount()>=1) {
				jTableDatosConciliacionesBancarias.removeRowSelectionInterval(0, jTableDatosConciliacionesBancarias.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesConciliacionesBancarias(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaConciliacionesBancarias(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConciliacionesBancarias(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConciliacionesBancarias(false) ;
			
			this.isEsNuevoConciliacionesBancarias=false;
			
			if(ConciliacionesBancariasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleConciliacionesBancarias();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingConciliacionesBancarias(false);
				
				//SI ES MANUAL
				if(ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualConciliacionesBancarias();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoConciliacionesBancarias--;			
			//ConciliacionesBancarias conciliacionesbancariasAux= new ConciliacionesBancarias();			
			//conciliacionesbancariasAux.setId(this.iIdNuevoConciliacionesBancarias);
			
			if(this.jInternalFrameDetalleFormConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaConciliacionesBancarias();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
			
			this.conciliacionesbancarias.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.conciliacionesbancariasLogic.getConciliacionesBancariass().add(this.conciliacionesbancariasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.conciliacionesbancariass.add(this.conciliacionesbancariasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaConciliacionesBancarias(false);
			
			this.jTableDatosConciliacionesBancarias.setRowSelectionInterval(this.getIndiceNuevoConciliacionesBancarias(), this.getIndiceNuevoConciliacionesBancarias());
			
			int iLastRow =  this.jTableDatosConciliacionesBancarias.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosConciliacionesBancarias.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosConciliacionesBancarias.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaConciliacionesBancarias(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingConciliacionesBancarias(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConciliacionesBancarias(false);
			
			//SI ES MANUAL
			if(ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConciliacionesBancarias();
			}
			
			//this.abrirFrameTreeConciliacionesBancarias();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionConciliacionesBancarias.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionConciliacionesBancarias.setFileImportacion(this.jInternalFrameImportacionConciliacionesBancarias.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionConciliacionesBancarias.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionConciliacionesBancarias.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionConciliacionesBancarias.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionConciliacionesBancarias.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ConciliacionesBancarias> conciliacionesbancariassSeleccionados=new ArrayList<ConciliacionesBancarias>();		

		conciliacionesbancariassSeleccionados=this.getConciliacionesBancariassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ConciliacionesBancariasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ConciliacionesBancariasBaseDesign.jrxml";
			
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
			
			this.generarReporteConciliacionesBancariass("Todos",conciliacionesbancariassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conciliaciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMayor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMayor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMayor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMayor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoCuenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoCuenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoCuenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoCuenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCuenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCuenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCuenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCuenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_NUMERODEPOSITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDeposito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDeposito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDeposito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDeposito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOEXTRAN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoExtran_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoExtran_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoExtran_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoExtran_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOEXTRAN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoExtran_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoExtran_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoExtran_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoExtran_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_DETALLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talle_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talle_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talle_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talle_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_neficiario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_neficiario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_neficiario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_neficiario_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoria="numero_mayor";
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA:
					sNombreCampoCategoria="codigo_cuenta";
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA:
					sNombreCampoCategoria="nombre_cuenta";
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL:
					sNombreCampoCategoria="debito_local";
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL:
					sNombreCampoCategoria="credito_local";
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_NUMERODEPOSITO:
					sNombreCampoCategoria="numero_deposito";
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOEXTRAN:
					sNombreCampoCategoria="debito_extran";
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOEXTRAN:
					sNombreCampoCategoria="credito_extran";
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoria="detalle";
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO:
					sNombreCampoCategoria="beneficiario";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoriaValor="numero_mayor";
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA:
					sNombreCampoCategoriaValor="codigo_cuenta";
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA:
					sNombreCampoCategoriaValor="nombre_cuenta";
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL:
					sNombreCampoCategoriaValor="debito_local";
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL:
					sNombreCampoCategoriaValor="credito_local";
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_NUMERODEPOSITO:
					sNombreCampoCategoriaValor="numero_deposito";
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOEXTRAN:
					sNombreCampoCategoriaValor="debito_extran";
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOEXTRAN:
					sNombreCampoCategoriaValor="credito_extran";
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoriaValor="detalle";
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO:
					sNombreCampoCategoriaValor="beneficiario";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Mayor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_mayor");
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Cuenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_cuenta");
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cuenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cuenta");
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_local");
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_local");
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_NUMERODEPOSITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Deposito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_deposito");
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOEXTRAN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Extran",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_extran");
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOEXTRAN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito Extran",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_extran");
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_DETALLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle",sNombreCampoCategoria,sNombreCampoCategoriaValor,"detalle");
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Beneficiario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"beneficiario");
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
	
	public void jButtonGenerarExcelReporteDinamicoConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ConciliacionesBancarias> conciliacionesbancariassSeleccionados=new ArrayList<ConciliacionesBancarias>();		
		
		conciliacionesbancariassSeleccionados=this.getConciliacionesBancariassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conciliacionesbancarias";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ConciliacionesBancariass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ConciliacionesBancariasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ConciliacionesBancarias conciliacionesbancarias:conciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conciliacionesbancarias.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(ConciliacionesBancarias conciliacionesbancarias:conciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conciliacionesbancarias.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_FECHADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_FECHADESDE);
					iRow++;

					for(ConciliacionesBancarias conciliacionesbancarias:conciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conciliacionesbancarias.getfecha_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_FECHAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_FECHAHASTA);
					iRow++;

					for(ConciliacionesBancarias conciliacionesbancarias:conciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conciliacionesbancarias.getfecha_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR);
					iRow++;

					for(ConciliacionesBancarias conciliacionesbancarias:conciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conciliacionesbancarias.getnumero_mayor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA);
					iRow++;

					for(ConciliacionesBancarias conciliacionesbancarias:conciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conciliacionesbancarias.getcodigo_cuenta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA);
					iRow++;

					for(ConciliacionesBancarias conciliacionesbancarias:conciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conciliacionesbancarias.getnombre_cuenta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL);
					iRow++;

					for(ConciliacionesBancarias conciliacionesbancarias:conciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conciliacionesbancarias.getdebito_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL);
					iRow++;

					for(ConciliacionesBancarias conciliacionesbancarias:conciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conciliacionesbancarias.getcredito_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_NUMERODEPOSITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_NUMERODEPOSITO);
					iRow++;

					for(ConciliacionesBancarias conciliacionesbancarias:conciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conciliacionesbancarias.getnumero_deposito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOEXTRAN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOEXTRAN);
					iRow++;

					for(ConciliacionesBancarias conciliacionesbancarias:conciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conciliacionesbancarias.getdebito_extran());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOEXTRAN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOEXTRAN);
					iRow++;

					for(ConciliacionesBancarias conciliacionesbancarias:conciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conciliacionesbancarias.getcredito_extran());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(ConciliacionesBancarias conciliacionesbancarias:conciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conciliacionesbancarias.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_DETALLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_DETALLE);
					iRow++;

					for(ConciliacionesBancarias conciliacionesbancarias:conciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conciliacionesbancarias.getdetalle());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO);
					iRow++;

					for(ConciliacionesBancarias conciliacionesbancarias:conciliacionesbancariassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conciliacionesbancarias.getbeneficiario());
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
			//	this.getFilaCabeceraExportarExcelConciliacionesBancarias(row);				
			//	iRow++;
			//}				
			
			//for(ConciliacionesBancarias conciliacionesbancariasAux:conciliacionesbancariassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelConciliacionesBancarias(conciliacionesbancariasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conciliaciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
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
				this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConciliacionesBancarias(false);
			
			//SI ES MANUAL
			if(ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConciliacionesBancarias();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConciliacionesBancarias(false);
			
			//SI ES MANUAL
			if(ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConciliacionesBancarias();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConciliacionesBancarias(false);
			
			//SI ES MANUAL
			if(ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConciliacionesBancarias();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaConciliacionesBancarias() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosConciliacionesBancarias.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosConciliacionesBancarias.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosConciliacionesBancarias.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosConciliacionesBancarias.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosConciliacionesBancarias.setMinimumSize(dimensionMinimum);
		this.jTableDatosConciliacionesBancarias.setMaximumSize(dimensionMaximum);
		this.jTableDatosConciliacionesBancarias.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingConciliacionesBancarias(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingConciliacionesBancarias(esInicializar,true);
	}
	
	public void inicializarActualizarBindingConciliacionesBancarias(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaConciliacionesBancarias(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesConciliacionesBancarias(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasConciliacionesBancarias(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConciliacionesBancarias(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesConciliacionesBancarias(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualConciliacionesBancarias() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaConciliacionesBancarias();
		
		this.inicializarActualizarBindingBotonesManualConciliacionesBancarias(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualConciliacionesBancarias();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConciliacionesBancarias() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualConciliacionesBancarias(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualConciliacionesBancarias(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosConciliacionesBancarias.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosConciliacionesBancarias.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteConciliacionesBancarias.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormConciliacionesBancarias.jCheckBoxPostAccionNuevoConciliacionesBancarias.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormConciliacionesBancarias.jCheckBoxPostAccionSinCerrarConciliacionesBancarias.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormConciliacionesBancarias.jCheckBoxPostAccionSinMensajeConciliacionesBancarias.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosConciliacionesBancarias.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosConciliacionesBancarias.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteConciliacionesBancarias.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
				this.jInternalFrameDetalleFormConciliacionesBancarias.jCheckBoxPostAccionNuevoConciliacionesBancarias.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormConciliacionesBancarias.jCheckBoxPostAccionSinCerrarConciliacionesBancarias.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormConciliacionesBancarias.jCheckBoxPostAccionSinMensajeConciliacionesBancarias.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionConciliacionesBancarias.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionConciliacionesBancarias.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxTiposAccionesFormularioConciliacionesBancarias.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesConciliacionesBancarias.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoConciliacionesBancarias!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesConciliacionesBancarias.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesConciliacionesBancarias.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarConciliacionesBancarias.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesConciliacionesBancarias.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoConciliacionesBancarias!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesConciliacionesBancarias.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralConciliacionesBancarias.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesConciliacionesBancarias(Boolean esInicializar) throws Exception {
		try	{	
			if(ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualConciliacionesBancarias(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesConciliacionesBancarias() throws Exception {
		try	{
			if(ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualConciliacionesBancarias();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConciliacionesBancarias() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxTiposAccionesFormularioConciliacionesBancarias.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxTiposAccionesFormularioConciliacionesBancarias.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualConciliacionesBancarias() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesConciliacionesBancarias.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesConciliacionesBancarias.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesConciliacionesBancarias.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesConciliacionesBancarias.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesConciliacionesBancarias.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesConciliacionesBancarias.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionConciliacionesBancarias.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionConciliacionesBancarias.addItem(reporte);
			}
			
			
			if(!this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionConciliacionesBancarias.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionConciliacionesBancarias.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesConciliacionesBancarias.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesConciliacionesBancarias.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesConciliacionesBancarias.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesConciliacionesBancarias.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxTiposAccionesFormularioConciliacionesBancarias.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxTiposAccionesFormularioConciliacionesBancarias.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarConciliacionesBancarias.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarConciliacionesBancarias.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarConciliacionesBancarias.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConciliacionesBancarias();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConciliacionesBancarias() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConciliacionesBancarias!=null) {
				this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConciliacionesBancarias!=null) {
				this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoConciliacionesBancarias!=null) {
				
				if(this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ConciliacionesBancariasConstantesFunciones.getTiposSeleccionarConciliacionesBancarias(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ConciliacionesBancariasConstantesFunciones.getTiposSeleccionarConciliacionesBancarias(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ConciliacionesBancariasConstantesFunciones.getTiposSeleccionarConciliacionesBancarias(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualConciliacionesBancarias()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias.getSelectedItem()!=null){this.id_cuenta_contableBusquedaConciliacionesBancarias=((CuentaContable)this.jComboBoxid_cuenta_contableBusquedaConciliacionesBancariasConciliacionesBancarias.getSelectedItem()).getId();}
		this.fecha_desdeBusquedaConciliacionesBancarias=new Date(this.jDateChooserfecha_desdeBusquedaConciliacionesBancariasConciliacionesBancarias.getDate().getTime());
		this.fecha_hastaBusquedaConciliacionesBancarias=new Date(this.jDateChooserfecha_hastaBusquedaConciliacionesBancariasConciliacionesBancarias.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasConciliacionesBancarias(Boolean esInicializar) throws Exception {				
		if(ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualConciliacionesBancarias();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaConciliacionesBancarias() throws Exception {
		this.inicializarActualizarBindingTablaConciliacionesBancarias(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByConciliacionesBancarias() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByConciliacionesBancarias.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByConciliacionesBancarias.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConciliacionesBancarias.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ConciliacionesBancariasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByConciliacionesBancarias.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConciliacionesBancarias.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ConciliacionesBancariasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosConciliacionesBancariasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConciliacionesBancariasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ConciliacionesBancariasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByConciliacionesBancarias.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConciliacionesBancarias.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ConciliacionesBancariasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByConciliacionesBancarias.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaConciliacionesBancarias(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=conciliacionesbancariasLogic.getConciliacionesBancariass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=conciliacionesbancariass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosConciliacionesBancarias.setModel(new ConciliacionesBancariasModel(this.conciliacionesbancariasLogic.getConciliacionesBancariass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosConciliacionesBancarias.setModel(new ConciliacionesBancariasModel(this.conciliacionesbancariass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByConciliacionesBancarias!=null && this.jInternalFrameOrderByConciliacionesBancarias.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByConciliacionesBancarias();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConciliacionesBancarias,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ConciliacionesBancariasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO,conciliacionesbancariasConstantesFunciones.resaltarSeleccionarConciliacionesBancarias,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO,conciliacionesbancariasConstantesFunciones.resaltarSeleccionarConciliacionesBancarias,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConciliacionesBancarias,ConciliacionesBancariasConstantesFunciones.LABEL_ID));

		if(this.conciliacionesbancariasConstantesFunciones.mostraridConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConciliacionesBancariasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.conciliacionesbancariasConstantesFunciones.resaltaridConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activaridConciliacionesBancarias,iSizeTabla,this,true,"idConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conciliacionesbancariasConstantesFunciones.resaltaridConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activaridConciliacionesBancarias,this,true,"idConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConciliacionesBancarias,ConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR));

		if(this.conciliacionesbancariasConstantesFunciones.mostrarnumero_mayorConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.conciliacionesbancariasConstantesFunciones.resaltarnumero_mayorConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activarnumero_mayorConciliacionesBancarias,iSizeTabla,this,true,"numero_mayorConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conciliacionesbancariasConstantesFunciones.resaltarnumero_mayorConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activarnumero_mayorConciliacionesBancarias,this,true,"numero_mayorConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConciliacionesBancarias,ConciliacionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA));

		if(this.conciliacionesbancariasConstantesFunciones.mostrarcodigo_cuentaConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConciliacionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.conciliacionesbancariasConstantesFunciones.resaltarcodigo_cuentaConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activarcodigo_cuentaConciliacionesBancarias,iSizeTabla,this,true,"codigo_cuentaConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conciliacionesbancariasConstantesFunciones.resaltarcodigo_cuentaConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activarcodigo_cuentaConciliacionesBancarias,this,true,"codigo_cuentaConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConciliacionesBancarias,ConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA));

		if(this.conciliacionesbancariasConstantesFunciones.mostrarnombre_cuentaConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.conciliacionesbancariasConstantesFunciones.resaltarnombre_cuentaConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activarnombre_cuentaConciliacionesBancarias,iSizeTabla,this,true,"nombre_cuentaConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conciliacionesbancariasConstantesFunciones.resaltarnombre_cuentaConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activarnombre_cuentaConciliacionesBancarias,this,true,"nombre_cuentaConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConciliacionesBancarias,ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL));

		if(this.conciliacionesbancariasConstantesFunciones.mostrardebito_localConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.conciliacionesbancariasConstantesFunciones.resaltardebito_localConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activardebito_localConciliacionesBancarias,iSizeTabla,this,true,"debito_localConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conciliacionesbancariasConstantesFunciones.resaltardebito_localConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activardebito_localConciliacionesBancarias,this,true,"debito_localConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConciliacionesBancarias,ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL));

		if(this.conciliacionesbancariasConstantesFunciones.mostrarcredito_localConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.conciliacionesbancariasConstantesFunciones.resaltarcredito_localConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activarcredito_localConciliacionesBancarias,iSizeTabla,this,true,"credito_localConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conciliacionesbancariasConstantesFunciones.resaltarcredito_localConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activarcredito_localConciliacionesBancarias,this,true,"credito_localConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConciliacionesBancarias,ConciliacionesBancariasConstantesFunciones.LABEL_NUMERODEPOSITO));

		if(this.conciliacionesbancariasConstantesFunciones.mostrarnumero_depositoConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConciliacionesBancariasConstantesFunciones.LABEL_NUMERODEPOSITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.conciliacionesbancariasConstantesFunciones.resaltarnumero_depositoConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activarnumero_depositoConciliacionesBancarias,iSizeTabla,this,true,"numero_depositoConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conciliacionesbancariasConstantesFunciones.resaltarnumero_depositoConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activarnumero_depositoConciliacionesBancarias,this,true,"numero_depositoConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConciliacionesBancarias,ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOEXTRAN));

		if(this.conciliacionesbancariasConstantesFunciones.mostrardebito_extranConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOEXTRAN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.conciliacionesbancariasConstantesFunciones.resaltardebito_extranConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activardebito_extranConciliacionesBancarias,iSizeTabla,this,true,"debito_extranConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conciliacionesbancariasConstantesFunciones.resaltardebito_extranConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activardebito_extranConciliacionesBancarias,this,true,"debito_extranConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConciliacionesBancarias,ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOEXTRAN));

		if(this.conciliacionesbancariasConstantesFunciones.mostrarcredito_extranConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOEXTRAN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.conciliacionesbancariasConstantesFunciones.resaltarcredito_extranConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activarcredito_extranConciliacionesBancarias,iSizeTabla,this,true,"credito_extranConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conciliacionesbancariasConstantesFunciones.resaltarcredito_extranConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activarcredito_extranConciliacionesBancarias,this,true,"credito_extranConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConciliacionesBancarias,ConciliacionesBancariasConstantesFunciones.LABEL_FECHA));

		if(this.conciliacionesbancariasConstantesFunciones.mostrarfechaConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConciliacionesBancariasConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.conciliacionesbancariasConstantesFunciones.resaltarfechaConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activarfechaConciliacionesBancarias,iSizeTabla,this,true,"fechaConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.conciliacionesbancariasConstantesFunciones.resaltarfechaConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activarfechaConciliacionesBancarias,this,true,"fechaConciliacionesBancarias","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConciliacionesBancarias,ConciliacionesBancariasConstantesFunciones.LABEL_DETALLE));

		if(this.conciliacionesbancariasConstantesFunciones.mostrardetalleConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConciliacionesBancariasConstantesFunciones.LABEL_DETALLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.conciliacionesbancariasConstantesFunciones.resaltardetalleConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activardetalleConciliacionesBancarias,iSizeTabla,this,true,"detalleConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conciliacionesbancariasConstantesFunciones.resaltardetalleConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activardetalleConciliacionesBancarias,this,true,"detalleConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConciliacionesBancarias,ConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO));

		if(this.conciliacionesbancariasConstantesFunciones.mostrarbeneficiarioConciliacionesBancarias && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.conciliacionesbancariasConstantesFunciones.resaltarbeneficiarioConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activarbeneficiarioConciliacionesBancarias,iSizeTabla,this,true,"beneficiarioConciliacionesBancarias","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conciliacionesbancariasConstantesFunciones.resaltarbeneficiarioConciliacionesBancarias,this.conciliacionesbancariasConstantesFunciones.activarbeneficiarioConciliacionesBancarias,this,true,"beneficiarioConciliacionesBancarias","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConciliacionesBancariasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConciliacionesBancarias.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConciliacionesBancarias.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarConciliacionesBancarias && this.isPermisoGuardarCambiosConciliacionesBancarias) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosConciliacionesBancarias.addColumn(tableColumn);
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
			
			this.jTableDatosConciliacionesBancarias.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConciliacionesBancarias && this.isPermisoGuardarCambiosConciliacionesBancarias) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConciliacionesBancarias && this.isPermisoGuardarCambiosConciliacionesBancarias) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosConciliacionesBancarias.moveColumn(this.jTableDatosConciliacionesBancarias.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosConciliacionesBancarias.moveColumn(this.jTableDatosConciliacionesBancarias.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosConciliacionesBancarias.moveColumn(this.jTableDatosConciliacionesBancarias.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosConciliacionesBancarias.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosConciliacionesBancarias.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosConciliacionesBancarias,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosConciliacionesBancarias.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosConciliacionesBancarias.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosConciliacionesBancarias.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosConciliacionesBancarias.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosConciliacionesBancarias.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=conciliacionesbancariasLogic.getConciliacionesBancariass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=conciliacionesbancariass.size()-1;
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
		//this.jTableDatosConciliacionesBancarias.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosConciliacionesBancarias.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosConciliacionesBancarias();
			
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
				
				//this.isEsNuevoConciliacionesBancarias=false;
					
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
			
				if(this.conciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormConciliacionesBancarias==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConciliacionesBancarias.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConciliacionesBancarias.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.conciliacionesbancarias.getsType().equals("DUPLICADO")
				   || this.conciliacionesbancarias.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoConciliacionesBancarias=true;
				
				} else {
					this.isEsNuevoConciliacionesBancarias=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
					if(this.conciliacionesbancarias.getId()>=0 && !this.conciliacionesbancarias.getIsNew()) {						
						this.isEsNuevoConciliacionesBancarias=false;
						
					} else {
						this.isEsNuevoConciliacionesBancarias=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoConciliacionesBancarias(esRelaciones);						
				
				this.seleccionarConciliacionesBancarias(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.conciliacionesbancarias.getId()<0) {
					this.isEsNuevoConciliacionesBancarias=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarConciliacionesBancarias(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarConciliacionesBancarias(evt,rowIndex);
				}	
				
				if(this.conciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ConciliacionesBancarias: " + this.dDif); 
					}
				}								
				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarConciliacionesBancarias(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.conciliacionesbancarias)) {
					if(this.conciliacionesbancarias.getId()>0) {
						this.conciliacionesbancarias.setIsDeleted(true);
						
						this.conciliacionesbancariassEliminados.add(this.conciliacionesbancarias);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.conciliacionesbancariasLogic.getConciliacionesBancariass().remove(this.conciliacionesbancarias);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.conciliacionesbancariass.remove(this.conciliacionesbancarias);				
					}
					
					
					((ConciliacionesBancariasModel) this.jTableDatosConciliacionesBancarias.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaConciliacionesBancarias(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarConciliacionesBancarias(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoConciliacionesBancarias) {
			
			if(this.jInternalFrameDetalleFormConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConciliacionesBancarias.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConciliacionesBancarias.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioConciliacionesBancarias(this.conciliacionesbancarias);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesConciliacionesBancarias("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesConciliacionesBancarias(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConciliacionesBancarias() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoConciliacionesBancarias(ConciliacionesBancarias conciliacionesbancarias) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoConciliacionesBancarias(conciliacionesbancarias,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoConciliacionesBancarias(ConciliacionesBancarias conciliacionesbancarias,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioConciliacionesBancarias(conciliacionesbancarias);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyConciliacionesBancarias(conciliacionesbancarias,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyConciliacionesBancarias(conciliacionesbancarias);
	}
	
	public void setVariablesObjetoActualToFormularioConciliacionesBancarias(ConciliacionesBancarias conciliacionesbancarias) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelidConciliacionesBancarias.setText(conciliacionesbancarias.getId().toString());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreanumero_mayorConciliacionesBancarias.setText(conciliacionesbancarias.getnumero_mayor());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcodigo_cuentaConciliacionesBancarias.setText(conciliacionesbancarias.getcodigo_cuenta());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreanombre_cuentaConciliacionesBancarias.setText(conciliacionesbancarias.getnombre_cuenta());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFielddebito_localConciliacionesBancarias.setText(conciliacionesbancarias.getdebito_local().toString());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcredito_localConciliacionesBancarias.setText(conciliacionesbancarias.getcredito_local().toString());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldnumero_depositoConciliacionesBancarias.setText(conciliacionesbancarias.getnumero_deposito());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFielddebito_extranConciliacionesBancarias.setText(conciliacionesbancarias.getdebito_extran().toString());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcredito_extranConciliacionesBancarias.setText(conciliacionesbancarias.getcredito_extran().toString());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jDateChooserfechaConciliacionesBancarias.setDate(conciliacionesbancarias.getfecha());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreadetalleConciliacionesBancarias.setText(conciliacionesbancarias.getdetalle());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreabeneficiarioConciliacionesBancarias.setText(conciliacionesbancarias.getbeneficiario());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ConciliacionesBancarias conciliacionesbancariasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,conciliacionesbancariasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ConciliacionesBancarias conciliacionesbancariasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				conciliacionesbancariasLocal=this.conciliacionesbancarias;
			} else {
				conciliacionesbancariasLocal=this.conciliacionesbancariasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(conciliacionesbancariasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoConciliacionesBancarias(conciliacionesbancariasLocal,true);
					
					if(conciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(conciliacionesbancariasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(conciliacionesbancariasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoConciliacionesBancarias(ConciliacionesBancarias conciliacionesbancarias,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConciliacionesBancarias(conciliacionesbancarias,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(conciliacionesbancarias);
	}
	
	public void setVariablesFormularioToObjetoActualConciliacionesBancarias(ConciliacionesBancarias conciliacionesbancarias,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConciliacionesBancarias(conciliacionesbancarias,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualConciliacionesBancarias(ConciliacionesBancarias conciliacionesbancarias,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelidConciliacionesBancarias.getText()==null || this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelidConciliacionesBancarias.getText()=="" || this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelidConciliacionesBancarias.getText()=="Id") {
				this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelidConciliacionesBancarias.setText("0");
			}

			if(conColumnasBase) {conciliacionesbancarias.setId(Long.parseLong(this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelidConciliacionesBancarias.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConciliacionesBancariasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelIdConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conciliacionesbancarias.setnumero_mayor(this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreanumero_mayorConciliacionesBancarias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelnumero_mayorConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conciliacionesbancarias.setcodigo_cuenta(this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcodigo_cuentaConciliacionesBancarias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConciliacionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelcodigo_cuentaConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conciliacionesbancarias.setnombre_cuenta(this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreanombre_cuentaConciliacionesBancarias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelnombre_cuentaConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conciliacionesbancarias.setdebito_local(Double.parseDouble(this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFielddebito_localConciliacionesBancarias.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabeldebito_localConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conciliacionesbancarias.setcredito_local(Double.parseDouble(this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcredito_localConciliacionesBancarias.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelcredito_localConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conciliacionesbancarias.setnumero_deposito(this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldnumero_depositoConciliacionesBancarias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConciliacionesBancariasConstantesFunciones.LABEL_NUMERODEPOSITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelnumero_depositoConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conciliacionesbancarias.setdebito_extran(Double.parseDouble(this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFielddebito_extranConciliacionesBancarias.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOEXTRAN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabeldebito_extranConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conciliacionesbancarias.setcredito_extran(Double.parseDouble(this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcredito_extranConciliacionesBancarias.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOEXTRAN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelcredito_extranConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conciliacionesbancarias.setfecha(this.jInternalFrameDetalleFormConciliacionesBancarias.jDateChooserfechaConciliacionesBancarias.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConciliacionesBancariasConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelfechaConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conciliacionesbancarias.setdetalle(this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreadetalleConciliacionesBancarias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConciliacionesBancariasConstantesFunciones.LABEL_DETALLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabeldetalleConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conciliacionesbancarias.setbeneficiario(this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreabeneficiarioConciliacionesBancarias.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelbeneficiarioConciliacionesBancarias,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConciliacionesBancarias(ConciliacionesBancarias conciliacionesbancariasBean,ConciliacionesBancarias conciliacionesbancarias,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosConciliacionesBancarias(ConciliacionesBancarias conciliacionesbancariasOrigen,ConciliacionesBancarias conciliacionesbancarias,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && conciliacionesbancariasOrigen.getId()!=null && !conciliacionesbancariasOrigen.getId().equals(0L))) {conciliacionesbancarias.setId(conciliacionesbancariasOrigen.getId());}}
			if(conDefault || (!conDefault && conciliacionesbancariasOrigen.getfecha_desde()!=null && !conciliacionesbancariasOrigen.getfecha_desde().equals(new Date()))) {conciliacionesbancarias.setfecha_desde(conciliacionesbancariasOrigen.getfecha_desde());}
			if(conDefault || (!conDefault && conciliacionesbancariasOrigen.getfecha_hasta()!=null && !conciliacionesbancariasOrigen.getfecha_hasta().equals(new Date()))) {conciliacionesbancarias.setfecha_hasta(conciliacionesbancariasOrigen.getfecha_hasta());}
			if(conDefault || (!conDefault && conciliacionesbancariasOrigen.getnumero_mayor()!=null && !conciliacionesbancariasOrigen.getnumero_mayor().equals(""))) {conciliacionesbancarias.setnumero_mayor(conciliacionesbancariasOrigen.getnumero_mayor());}
			if(conDefault || (!conDefault && conciliacionesbancariasOrigen.getcodigo_cuenta()!=null && !conciliacionesbancariasOrigen.getcodigo_cuenta().equals(""))) {conciliacionesbancarias.setcodigo_cuenta(conciliacionesbancariasOrigen.getcodigo_cuenta());}
			if(conDefault || (!conDefault && conciliacionesbancariasOrigen.getnombre_cuenta()!=null && !conciliacionesbancariasOrigen.getnombre_cuenta().equals(""))) {conciliacionesbancarias.setnombre_cuenta(conciliacionesbancariasOrigen.getnombre_cuenta());}
			if(conDefault || (!conDefault && conciliacionesbancariasOrigen.getdebito_local()!=null && !conciliacionesbancariasOrigen.getdebito_local().equals(0.0))) {conciliacionesbancarias.setdebito_local(conciliacionesbancariasOrigen.getdebito_local());}
			if(conDefault || (!conDefault && conciliacionesbancariasOrigen.getcredito_local()!=null && !conciliacionesbancariasOrigen.getcredito_local().equals(0.0))) {conciliacionesbancarias.setcredito_local(conciliacionesbancariasOrigen.getcredito_local());}
			if(conDefault || (!conDefault && conciliacionesbancariasOrigen.getnumero_deposito()!=null && !conciliacionesbancariasOrigen.getnumero_deposito().equals(""))) {conciliacionesbancarias.setnumero_deposito(conciliacionesbancariasOrigen.getnumero_deposito());}
			if(conDefault || (!conDefault && conciliacionesbancariasOrigen.getdebito_extran()!=null && !conciliacionesbancariasOrigen.getdebito_extran().equals(0.0))) {conciliacionesbancarias.setdebito_extran(conciliacionesbancariasOrigen.getdebito_extran());}
			if(conDefault || (!conDefault && conciliacionesbancariasOrigen.getcredito_extran()!=null && !conciliacionesbancariasOrigen.getcredito_extran().equals(0.0))) {conciliacionesbancarias.setcredito_extran(conciliacionesbancariasOrigen.getcredito_extran());}
			if(conDefault || (!conDefault && conciliacionesbancariasOrigen.getfecha()!=null && !conciliacionesbancariasOrigen.getfecha().equals(new Date()))) {conciliacionesbancarias.setfecha(conciliacionesbancariasOrigen.getfecha());}
			if(conDefault || (!conDefault && conciliacionesbancariasOrigen.getdetalle()!=null && !conciliacionesbancariasOrigen.getdetalle().equals(""))) {conciliacionesbancarias.setdetalle(conciliacionesbancariasOrigen.getdetalle());}
			if(conDefault || (!conDefault && conciliacionesbancariasOrigen.getbeneficiario()!=null && !conciliacionesbancariasOrigen.getbeneficiario().equals(""))) {conciliacionesbancarias.setbeneficiario(conciliacionesbancariasOrigen.getbeneficiario());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConciliacionesBancarias(ConciliacionesBancarias conciliacionesbancarias) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelidConciliacionesBancarias.setText(conciliacionesbancarias.getId().toString());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreanumero_mayorConciliacionesBancarias.setText(conciliacionesbancarias.getnumero_mayor());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcodigo_cuentaConciliacionesBancarias.setText(conciliacionesbancarias.getcodigo_cuenta());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreanombre_cuentaConciliacionesBancarias.setText(conciliacionesbancarias.getnombre_cuenta());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFielddebito_localConciliacionesBancarias.setText(conciliacionesbancarias.getdebito_local().toString());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcredito_localConciliacionesBancarias.setText(conciliacionesbancarias.getcredito_local().toString());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldnumero_depositoConciliacionesBancarias.setText(conciliacionesbancarias.getnumero_deposito());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFielddebito_extranConciliacionesBancarias.setText(conciliacionesbancarias.getdebito_extran().toString());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcredito_extranConciliacionesBancarias.setText(conciliacionesbancarias.getcredito_extran().toString());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jDateChooserfechaConciliacionesBancarias.setDate(conciliacionesbancarias.getfecha());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreadetalleConciliacionesBancarias.setText(conciliacionesbancarias.getdetalle());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreabeneficiarioConciliacionesBancarias.setText(conciliacionesbancarias.getbeneficiario());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConciliacionesBancarias(ConciliacionesBancariasBean conciliacionesbancariasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelidConciliacionesBancarias.setText(conciliacionesbancariasBean.getId().toString());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreanumero_mayorConciliacionesBancarias.setText(conciliacionesbancariasBean.getnumero_mayor());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcodigo_cuentaConciliacionesBancarias.setText(conciliacionesbancariasBean.getcodigo_cuenta());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreanombre_cuentaConciliacionesBancarias.setText(conciliacionesbancariasBean.getnombre_cuenta());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFielddebito_localConciliacionesBancarias.setText(conciliacionesbancariasBean.getdebito_local().toString());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcredito_localConciliacionesBancarias.setText(conciliacionesbancariasBean.getcredito_local().toString());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldnumero_depositoConciliacionesBancarias.setText(conciliacionesbancariasBean.getnumero_deposito());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFielddebito_extranConciliacionesBancarias.setText(conciliacionesbancariasBean.getdebito_extran().toString());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcredito_extranConciliacionesBancarias.setText(conciliacionesbancariasBean.getcredito_extran().toString());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jDateChooserfechaConciliacionesBancarias.setDate(conciliacionesbancariasBean.getfecha());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreadetalleConciliacionesBancarias.setText(conciliacionesbancariasBean.getdetalle());
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreabeneficiarioConciliacionesBancarias.setText(conciliacionesbancariasBean.getbeneficiario());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanConciliacionesBancarias(ConciliacionesBancariasParameterReturnGeneral conciliacionesbancariasReturnGeneral,ConciliacionesBancariasBean conciliacionesbancariasBean,Boolean conDefault) throws Exception { 
		try {
			ConciliacionesBancarias conciliacionesbancariasLocal=new ConciliacionesBancarias();
			
			conciliacionesbancariasLocal=conciliacionesbancariasReturnGeneral.getConciliacionesBancarias();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && conciliacionesbancariasLocal.getId()!=null && !conciliacionesbancariasLocal.getId().equals(0L))) {conciliacionesbancariasBean.setId(conciliacionesbancariasLocal.getId());}}
			if(conDefault || (!conDefault && conciliacionesbancariasLocal.getnumero_mayor()!=null && !conciliacionesbancariasLocal.getnumero_mayor().equals(""))) {conciliacionesbancariasBean.setnumero_mayor(conciliacionesbancariasLocal.getnumero_mayor());}
			if(conDefault || (!conDefault && conciliacionesbancariasLocal.getcodigo_cuenta()!=null && !conciliacionesbancariasLocal.getcodigo_cuenta().equals(""))) {conciliacionesbancariasBean.setcodigo_cuenta(conciliacionesbancariasLocal.getcodigo_cuenta());}
			if(conDefault || (!conDefault && conciliacionesbancariasLocal.getnombre_cuenta()!=null && !conciliacionesbancariasLocal.getnombre_cuenta().equals(""))) {conciliacionesbancariasBean.setnombre_cuenta(conciliacionesbancariasLocal.getnombre_cuenta());}
			if(conDefault || (!conDefault && conciliacionesbancariasLocal.getdebito_local()!=null && !conciliacionesbancariasLocal.getdebito_local().equals(0.0))) {conciliacionesbancariasBean.setdebito_local(conciliacionesbancariasLocal.getdebito_local());}
			if(conDefault || (!conDefault && conciliacionesbancariasLocal.getcredito_local()!=null && !conciliacionesbancariasLocal.getcredito_local().equals(0.0))) {conciliacionesbancariasBean.setcredito_local(conciliacionesbancariasLocal.getcredito_local());}
			if(conDefault || (!conDefault && conciliacionesbancariasLocal.getnumero_deposito()!=null && !conciliacionesbancariasLocal.getnumero_deposito().equals(""))) {conciliacionesbancariasBean.setnumero_deposito(conciliacionesbancariasLocal.getnumero_deposito());}
			if(conDefault || (!conDefault && conciliacionesbancariasLocal.getdebito_extran()!=null && !conciliacionesbancariasLocal.getdebito_extran().equals(0.0))) {conciliacionesbancariasBean.setdebito_extran(conciliacionesbancariasLocal.getdebito_extran());}
			if(conDefault || (!conDefault && conciliacionesbancariasLocal.getcredito_extran()!=null && !conciliacionesbancariasLocal.getcredito_extran().equals(0.0))) {conciliacionesbancariasBean.setcredito_extran(conciliacionesbancariasLocal.getcredito_extran());}
			if(conDefault || (!conDefault && conciliacionesbancariasLocal.getfecha()!=null && !conciliacionesbancariasLocal.getfecha().equals(new Date()))) {conciliacionesbancariasBean.setfecha(conciliacionesbancariasLocal.getfecha());}
			if(conDefault || (!conDefault && conciliacionesbancariasLocal.getdetalle()!=null && !conciliacionesbancariasLocal.getdetalle().equals(""))) {conciliacionesbancariasBean.setdetalle(conciliacionesbancariasLocal.getdetalle());}
			if(conDefault || (!conDefault && conciliacionesbancariasLocal.getbeneficiario()!=null && !conciliacionesbancariasLocal.getbeneficiario().equals(""))) {conciliacionesbancariasBean.setbeneficiario(conciliacionesbancariasLocal.getbeneficiario());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxConciliacionesBancariasGenerico(Long idConciliacionesBancariasSeleccionado,JComboBox jComboBoxConciliacionesBancarias,List<ConciliacionesBancarias> conciliacionesbancariassLocal)throws Exception {
		try {
			ConciliacionesBancarias  conciliacionesbancariasTemp=null;

			for(ConciliacionesBancarias conciliacionesbancariasAux:conciliacionesbancariassLocal) {
				if(conciliacionesbancariasAux.getId()!=null && conciliacionesbancariasAux.getId().equals(idConciliacionesBancariasSeleccionado)) {
					conciliacionesbancariasTemp=conciliacionesbancariasAux;
					break;
				}
			}

			jComboBoxConciliacionesBancarias.setSelectedItem(conciliacionesbancariasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxConciliacionesBancariasGenerico(JComboBox jComboBoxConciliacionesBancarias,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConciliacionesBancarias.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxConciliacionesBancarias.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConciliacionesBancarias.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxConciliacionesBancarias.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			conciliacionesbancarias=(ConciliacionesBancarias) conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			conciliacionesbancarias =(ConciliacionesBancarias) conciliacionesbancariass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!conciliacionesbancarias.getIsNew() && !conciliacionesbancarias.getIsChanged() && !conciliacionesbancarias.getIsDeleted()) {
				sDescripcion=conciliacionesbancarias.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=conciliacionesbancarias.getempresa_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!conciliacionesbancarias.getIsNew() && !conciliacionesbancarias.getIsChanged() && !conciliacionesbancarias.getIsDeleted()) {
				sDescripcion=conciliacionesbancarias.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=conciliacionesbancarias.getcuentacontable_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ConciliacionesBancarias conciliacionesbancariasRow=new ConciliacionesBancarias();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			conciliacionesbancariasRow=(ConciliacionesBancarias) conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			conciliacionesbancariasRow=(ConciliacionesBancarias) conciliacionesbancariass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualConciliacionesBancarias(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoConciliacionesBancarias.setVisible((this.isVisibilidadCeldaNuevoConciliacionesBancarias && this.isPermisoNuevoConciliacionesBancarias));			
			this.jButtonDuplicarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaDuplicarConciliacionesBancarias && this.isPermisoDuplicarConciliacionesBancarias));			
			this.jButtonCopiarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaCopiarConciliacionesBancarias && this.isPermisoCopiarConciliacionesBancarias));
			this.jButtonVerFormConciliacionesBancarias.setVisible((this.isVisibilidadCeldaVerFormConciliacionesBancarias && this.isPermisoVerFormConciliacionesBancarias));
			
			this.jButtonAbrirOrderByConciliacionesBancarias.setVisible((this.isVisibilidadCeldaOrdenConciliacionesBancarias && this.isPermisoOrdenConciliacionesBancarias));			
			
			this.jButtonNuevoRelacionesConciliacionesBancarias.setVisible((this.isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias && this.isPermisoNuevoConciliacionesBancarias));			
			this.jButtonNuevoGuardarCambiosConciliacionesBancarias.setVisible((this.isVisibilidadCeldaNuevoConciliacionesBancarias && this.isPermisoNuevoConciliacionesBancarias && this.isPermisoGuardarCambiosConciliacionesBancarias));
			
			if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonModificarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaModificarConciliacionesBancarias && this.isPermisoActualizarConciliacionesBancarias));	
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonActualizarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaActualizarConciliacionesBancarias && this.isPermisoActualizarConciliacionesBancarias));	
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonEliminarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaEliminarConciliacionesBancarias && this.isPermisoEliminarConciliacionesBancarias));
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonCancelarConciliacionesBancarias.setVisible(this.isVisibilidadCeldaCancelarConciliacionesBancarias);							
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonGuardarCambiosConciliacionesBancarias.setVisible((this.isVisibilidadCeldaGuardarConciliacionesBancarias && this.isPermisoGuardarCambiosConciliacionesBancarias));			
			
			}
						
			this.jButtonGuardarCambiosTablaConciliacionesBancarias.setVisible((this.isVisibilidadCeldaGuardarCambiosConciliacionesBancarias && this.isPermisoGuardarCambiosConciliacionesBancarias));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaNuevoConciliacionesBancarias && this.isPermisoNuevoConciliacionesBancarias));						
			this.jButtonDuplicarToolBarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaDuplicarConciliacionesBancarias && this.isPermisoDuplicarConciliacionesBancarias));						
			this.jButtonCopiarToolBarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaCopiarConciliacionesBancarias && this.isPermisoCopiarConciliacionesBancarias));			
			this.jButtonVerFormToolBarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaVerFormConciliacionesBancarias && this.isPermisoVerFormConciliacionesBancarias));			
			this.jButtonAbrirOrderByToolBarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaOrdenConciliacionesBancarias && this.isPermisoOrdenConciliacionesBancarias));
			this.jButtonNuevoRelacionesToolBarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias && this.isPermisoNuevoConciliacionesBancarias));			
			this.jButtonNuevoGuardarCambiosToolBarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaNuevoConciliacionesBancarias && this.isPermisoNuevoConciliacionesBancarias && this.isPermisoGuardarCambiosConciliacionesBancarias));			
			
			if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonModificarToolBarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaModificarConciliacionesBancarias && this.isPermisoActualizarConciliacionesBancarias));	
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonActualizarToolBarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaActualizarConciliacionesBancarias  && this.isPermisoActualizarConciliacionesBancarias));	
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonEliminarToolBarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaEliminarConciliacionesBancarias && this.isPermisoEliminarConciliacionesBancarias));
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonCancelarToolBarConciliacionesBancarias.setVisible(this.isVisibilidadCeldaCancelarConciliacionesBancarias);				
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonGuardarCambiosToolBarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaGuardarConciliacionesBancarias && this.isPermisoGuardarCambiosConciliacionesBancarias));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaGuardarCambiosConciliacionesBancarias && this.isPermisoGuardarCambiosConciliacionesBancarias));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoConciliacionesBancarias.setVisible((this.isVisibilidadCeldaNuevoConciliacionesBancarias && this.isPermisoNuevoConciliacionesBancarias));			
			this.jMenuItemDuplicarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaDuplicarConciliacionesBancarias && this.isPermisoDuplicarConciliacionesBancarias));			
			this.jMenuItemCopiarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaCopiarConciliacionesBancarias && this.isPermisoCopiarConciliacionesBancarias));			
			this.jMenuItemVerFormConciliacionesBancarias.setVisible((this.isVisibilidadCeldaVerFormConciliacionesBancarias && this.isPermisoVerFormConciliacionesBancarias));			
			this.jMenuItemAbrirOrderByConciliacionesBancarias.setVisible((this.isVisibilidadCeldaOrdenConciliacionesBancarias && this.isPermisoOrdenConciliacionesBancarias));			
			//this.jMenuItemMostrarOcultarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaOrdenConciliacionesBancarias && this.isPermisoOrdenConciliacionesBancarias));
			this.jMenuItemDetalleAbrirOrderByConciliacionesBancarias.setVisible((this.isVisibilidadCeldaOrdenConciliacionesBancarias && this.isPermisoOrdenConciliacionesBancarias));			
			//this.jMenuItemDetalleMostrarOcultarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaOrdenConciliacionesBancarias && this.isPermisoOrdenConciliacionesBancarias));			
			this.jMenuItemNuevoRelacionesConciliacionesBancarias.setVisible((this.isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias && this.isPermisoNuevoConciliacionesBancarias));			
			this.jMenuItemNuevoGuardarCambiosConciliacionesBancarias.setVisible((this.isVisibilidadCeldaNuevoConciliacionesBancarias && this.isPermisoNuevoConciliacionesBancarias && this.isPermisoGuardarCambiosConciliacionesBancarias));									
			
			if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
			this.jInternalFrameDetalleFormConciliacionesBancarias.jMenuItemModificarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaModificarConciliacionesBancarias && this.isPermisoActualizarConciliacionesBancarias));	
			this.jInternalFrameDetalleFormConciliacionesBancarias.jMenuItemActualizarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaActualizarConciliacionesBancarias && this.isPermisoActualizarConciliacionesBancarias));	
			this.jInternalFrameDetalleFormConciliacionesBancarias.jMenuItemEliminarConciliacionesBancarias.setVisible((this.isVisibilidadCeldaEliminarConciliacionesBancarias && this.isPermisoEliminarConciliacionesBancarias));
			this.jInternalFrameDetalleFormConciliacionesBancarias.jMenuItemCancelarConciliacionesBancarias.setVisible(this.isVisibilidadCeldaCancelarConciliacionesBancarias);				
			}
			
			this.jMenuItemGuardarCambiosConciliacionesBancarias.setVisible((this.isVisibilidadCeldaGuardarConciliacionesBancarias && this.isPermisoGuardarCambiosConciliacionesBancarias));						
			this.jMenuItemGuardarCambiosTablaConciliacionesBancarias.setVisible((this.isVisibilidadCeldaGuardarCambiosConciliacionesBancarias && this.isPermisoGuardarCambiosConciliacionesBancarias));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoConciliacionesBancarias=this.jButtonNuevoConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaDuplicarConciliacionesBancarias=this.jButtonDuplicarConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaCopiarConciliacionesBancarias=this.jButtonCopiarConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaVerFormConciliacionesBancarias=this.jButtonVerFormConciliacionesBancarias.isVisible();
			
			this.isVisibilidadCeldaOrdenConciliacionesBancarias=this.jButtonAbrirOrderByConciliacionesBancarias.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias=this.jButtonNuevoRelacionesConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaModificarConciliacionesBancarias=this.jButtonModificarConciliacionesBancarias.isVisible();
			
			if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
			this.isVisibilidadCeldaActualizarConciliacionesBancarias=this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonActualizarConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaEliminarConciliacionesBancarias=this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonEliminarConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaCancelarConciliacionesBancarias=this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonCancelarConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaGuardarConciliacionesBancarias=this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonGuardarCambiosConciliacionesBancarias.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosConciliacionesBancarias=this.jButtonGuardarCambiosTablaConciliacionesBancarias.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoConciliacionesBancarias=this.jButtonNuevoToolBarConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias=this.jButtonNuevoRelacionesToolBarConciliacionesBancarias.isVisible();
			
			if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
			this.isVisibilidadCeldaModificarConciliacionesBancarias=this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonModificarToolBarConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaActualizarConciliacionesBancarias=this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonActualizarToolBarConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaEliminarConciliacionesBancarias=this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonEliminarToolBarConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaCancelarConciliacionesBancarias=this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonCancelarToolBarConciliacionesBancarias.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConciliacionesBancarias=this.jButtonGuardarCambiosToolBarConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConciliacionesBancarias=this.jButtonGuardarCambiosTablaToolBarConciliacionesBancarias.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoConciliacionesBancarias=this.jMenuItemNuevoConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias=this.jMenuItemNuevoRelacionesConciliacionesBancarias.isVisible();
			
			if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
			this.isVisibilidadCeldaModificarConciliacionesBancarias=this.jInternalFrameDetalleFormConciliacionesBancarias.jMenuItemModificarConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaActualizarConciliacionesBancarias=this.jInternalFrameDetalleFormConciliacionesBancarias.jMenuItemActualizarConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaEliminarConciliacionesBancarias=this.jInternalFrameDetalleFormConciliacionesBancarias.jMenuItemEliminarConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaCancelarConciliacionesBancarias=this.jInternalFrameDetalleFormConciliacionesBancarias.jMenuItemCancelarConciliacionesBancarias.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConciliacionesBancarias=this.jMenuItemGuardarCambiosConciliacionesBancarias.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConciliacionesBancarias=this.jMenuItemGuardarCambiosTablaConciliacionesBancarias.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesConciliacionesBancarias(Boolean esInicializar) {
		if(ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.conciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
				//if(this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesConciliacionesBancarias();
			}
			
			this.inicializarActualizarBindingBotonesManualConciliacionesBancarias(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualConciliacionesBancarias() {
		this.jButtonNuevoConciliacionesBancarias.setVisible(this.isPermisoNuevoConciliacionesBancarias);			
		this.jButtonDuplicarConciliacionesBancarias.setVisible(this.isPermisoDuplicarConciliacionesBancarias);			
		this.jButtonCopiarConciliacionesBancarias.setVisible(this.isPermisoCopiarConciliacionesBancarias);			
		this.jButtonVerFormConciliacionesBancarias.setVisible(this.isPermisoVerFormConciliacionesBancarias);			
		
		this.jButtonAbrirOrderByConciliacionesBancarias.setVisible(this.isPermisoOrdenConciliacionesBancarias);					
		
		this.jButtonNuevoRelacionesConciliacionesBancarias.setVisible(this.isPermisoNuevoConciliacionesBancarias);			
		
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonModificarConciliacionesBancarias.setVisible(this.isPermisoActualizarConciliacionesBancarias);	
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonActualizarConciliacionesBancarias.setVisible(this.isPermisoActualizarConciliacionesBancarias);	
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonEliminarConciliacionesBancarias.setVisible(this.isPermisoEliminarConciliacionesBancarias);
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonCancelarConciliacionesBancarias.setVisible(this.isVisibilidadCeldaCancelarConciliacionesBancarias);						
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonGuardarCambiosConciliacionesBancarias.setVisible(this.isPermisoGuardarCambiosConciliacionesBancarias);							
		}
		
		this.jButtonGuardarCambiosTablaConciliacionesBancarias.setVisible(this.isPermisoActualizarConciliacionesBancarias);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleConciliacionesBancarias() {
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonModificarConciliacionesBancarias.setVisible(this.isPermisoActualizarConciliacionesBancarias);	
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonActualizarConciliacionesBancarias.setVisible(this.isPermisoActualizarConciliacionesBancarias);	
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonEliminarConciliacionesBancarias.setVisible(this.isPermisoEliminarConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonCancelarConciliacionesBancarias.setVisible(this.isVisibilidadCeldaCancelarConciliacionesBancarias);							
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonGuardarCambiosConciliacionesBancarias.setVisible((this.isVisibilidadCeldaGuardarConciliacionesBancarias && this.isPermisoGuardarCambiosConciliacionesBancarias));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosConciliacionesBancarias() {
		if(ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualConciliacionesBancarias();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesConciliacionesBancarias() {
	}
	
	public void jTableDatosConciliacionesBancariasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarConciliacionesBancarias(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.getconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conciliacionesbancarias==null) {
						this.conciliacionesbancarias = new ConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.conciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
				}

				if(this.conciliacionesbancarias.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.conciliacionesbancarias.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaConciliacionesBancariasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebConciliacionesBancarias(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConciliacionesBancarias.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConciliacionesBancarias.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.getconciliacionesbancarias(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.conciliacionesbancariasLogic.getConnexion());

				if(this.conciliacionesbancarias.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.conciliacionesbancarias.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConciliacionesBancarias=(TitledBorder)this.jScrollPanelDatosConciliacionesBancarias.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderConciliacionesBancarias.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.getconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conciliacionesbancarias==null) {
						this.conciliacionesbancarias = new ConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.conciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
				}

				if(this.conciliacionesbancarias.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.conciliacionesbancarias.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableConciliacionesBancariasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebConciliacionesBancarias(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConciliacionesBancarias.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConciliacionesBancarias.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.getconciliacionesbancarias(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.conciliacionesbancariasLogic.getConnexion());

				if(this.conciliacionesbancarias.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.conciliacionesbancarias.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConciliacionesBancarias=(TitledBorder)this.jScrollPanelDatosConciliacionesBancarias.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderConciliacionesBancarias.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.getconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conciliacionesbancarias==null) {
						this.conciliacionesbancarias = new ConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.conciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
				}

				if(this.conciliacionesbancarias.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.conciliacionesbancarias.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_desdeConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.getconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conciliacionesbancarias==null) {
						this.conciliacionesbancarias = new ConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.conciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
				}

				if(this.conciliacionesbancarias.getfecha_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_desde = '"+Funciones2.getStringPostgresDate(this.conciliacionesbancarias.getfecha_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_hastaConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.getconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conciliacionesbancarias==null) {
						this.conciliacionesbancarias = new ConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.conciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
				}

				if(this.conciliacionesbancarias.getfecha_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hasta = '"+Funciones2.getStringPostgresDate(this.conciliacionesbancarias.getfecha_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_mayorConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.getconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conciliacionesbancarias==null) {
						this.conciliacionesbancarias = new ConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.conciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
				}

				if(this.conciliacionesbancarias.getnumero_mayor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_mayor like '%"+this.conciliacionesbancarias.getnumero_mayor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_cuentaConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.getconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conciliacionesbancarias==null) {
						this.conciliacionesbancarias = new ConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.conciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
				}

				if(this.conciliacionesbancarias.getcodigo_cuenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_cuenta like '%"+this.conciliacionesbancarias.getcodigo_cuenta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_cuentaConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.getconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conciliacionesbancarias==null) {
						this.conciliacionesbancarias = new ConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.conciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
				}

				if(this.conciliacionesbancarias.getnombre_cuenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cuenta like '%"+this.conciliacionesbancarias.getnombre_cuenta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_localConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.getconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conciliacionesbancarias==null) {
						this.conciliacionesbancarias = new ConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.conciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
				}

				if(this.conciliacionesbancarias.getdebito_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_local = "+this.conciliacionesbancarias.getdebito_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_localConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.getconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conciliacionesbancarias==null) {
						this.conciliacionesbancarias = new ConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.conciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
				}

				if(this.conciliacionesbancarias.getcredito_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_local = "+this.conciliacionesbancarias.getcredito_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_depositoConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.getconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conciliacionesbancarias==null) {
						this.conciliacionesbancarias = new ConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.conciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
				}

				if(this.conciliacionesbancarias.getnumero_deposito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_deposito like '%"+this.conciliacionesbancarias.getnumero_deposito()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_extranConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.getconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conciliacionesbancarias==null) {
						this.conciliacionesbancarias = new ConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.conciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
				}

				if(this.conciliacionesbancarias.getdebito_extran()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_extran = "+this.conciliacionesbancarias.getdebito_extran().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_extranConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.getconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conciliacionesbancarias==null) {
						this.conciliacionesbancarias = new ConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.conciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
				}

				if(this.conciliacionesbancarias.getcredito_extran()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_extran = "+this.conciliacionesbancarias.getcredito_extran().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.getconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conciliacionesbancarias==null) {
						this.conciliacionesbancarias = new ConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.conciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
				}

				if(this.conciliacionesbancarias.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.conciliacionesbancarias.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondetalleConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.getconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conciliacionesbancarias==null) {
						this.conciliacionesbancarias = new ConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.conciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
				}

				if(this.conciliacionesbancarias.getdetalle()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where detalle like '%"+this.conciliacionesbancarias.getdetalle()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbeneficiarioConciliacionesBancariasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.getconciliacionesbancarias(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conciliacionesbancarias==null) {
						this.conciliacionesbancarias = new ConciliacionesBancarias();
					}

					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.conciliacionesbancarias,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);
				}

				if(this.conciliacionesbancarias.getbeneficiario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where beneficiario like '%"+this.conciliacionesbancarias.getbeneficiario()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConciliacionesBancarias(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaConciliacionesBancariasConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConciliacionesBancarias(false,false);

			this.getConciliacionesBancariassBusquedaConciliacionesBancarias();

			this.inicializarActualizarBindingConciliacionesBancarias(false);

			//if(ConciliacionesBancariasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConciliacionesBancarias(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConciliacionesBancarias(false,false);

			this.getConciliacionesBancariassFK_IdCuentaContable();

			this.inicializarActualizarBindingConciliacionesBancarias(false);

			//if(ConciliacionesBancariasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConciliacionesBancarias(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaConciliacionesBancariasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConciliacionesBancarias(false,false);

			this.getConciliacionesBancariassFK_IdEmpresa();

			this.inicializarActualizarBindingConciliacionesBancarias(false);

			//if(ConciliacionesBancariasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConciliacionesBancarias(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conciliacionesbancariasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameConciliacionesBancarias() {
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
			this.jInternalFrameDetalleFormConciliacionesBancarias.setVisible(false);	    			
			this.jInternalFrameDetalleFormConciliacionesBancarias.dispose();
			this.jInternalFrameDetalleFormConciliacionesBancarias=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoConciliacionesBancarias!=null) {
			this.jInternalFrameReporteDinamicoConciliacionesBancarias.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoConciliacionesBancarias.dispose();
			this.jInternalFrameReporteDinamicoConciliacionesBancarias=null;
		}
		
		if(this.jInternalFrameImportacionConciliacionesBancarias!=null) {
			this.jInternalFrameImportacionConciliacionesBancarias.setVisible(false);	    			
			this.jInternalFrameImportacionConciliacionesBancarias.dispose();
			this.jInternalFrameImportacionConciliacionesBancarias=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessConciliacionesBancarias();
			
			ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
			
			
			if(sTipo.equals("NuevoConciliacionesBancarias")) {
				jButtonNuevoConciliacionesBancariasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarConciliacionesBancarias")) {
				jButtonDuplicarConciliacionesBancariasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarConciliacionesBancarias")) {
				jButtonCopiarConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("VerFormConciliacionesBancarias")) {
				jButtonVerFormConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarConciliacionesBancarias")) {
				jButtonNuevoConciliacionesBancariasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarConciliacionesBancarias")) {
				jButtonDuplicarConciliacionesBancariasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoConciliacionesBancarias")) {
				jButtonNuevoConciliacionesBancariasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarConciliacionesBancarias")) {
				jButtonDuplicarConciliacionesBancariasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesConciliacionesBancarias")) {
				jButtonNuevoConciliacionesBancariasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarConciliacionesBancarias")) {
				jButtonNuevoConciliacionesBancariasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesConciliacionesBancarias")) {
				jButtonNuevoConciliacionesBancariasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarConciliacionesBancarias")) {
				jButtonModificarConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarConciliacionesBancarias")) {
				jButtonModificarConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarConciliacionesBancarias")) {
				jButtonModificarConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarConciliacionesBancarias")) {
				jButtonActualizarConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarConciliacionesBancarias")) {
				jButtonActualizarConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarConciliacionesBancarias")) {
				jButtonActualizarConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("EliminarConciliacionesBancarias")) {
				jButtonEliminarConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarConciliacionesBancarias")) {
				jButtonEliminarConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarConciliacionesBancarias")) {
				jButtonEliminarConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("CancelarConciliacionesBancarias")) {
				jButtonCancelarConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarConciliacionesBancarias")) {
				jButtonCancelarConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarConciliacionesBancarias")) {
				jButtonCancelarConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("CerrarConciliacionesBancarias")) {
				jButtonCerrarConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarConciliacionesBancarias")) {
				jButtonCerrarConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarConciliacionesBancarias")) {
				jButtonCerrarConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarConciliacionesBancarias")) {
				jButtonMostrarOcultarConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarConciliacionesBancarias")) {
				jButtonCancelarConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosConciliacionesBancarias")) {
				jButtonGuardarCambiosConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarConciliacionesBancarias")) {
				jButtonGuardarCambiosConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarConciliacionesBancarias")) {
				jButtonCopiarConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarConciliacionesBancarias")) {
				jButtonVerFormConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosConciliacionesBancarias")) {
				jButtonGuardarCambiosConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarConciliacionesBancarias")) {
				jButtonCopiarConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormConciliacionesBancarias")) {
				jButtonVerFormConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaConciliacionesBancarias")) {
				jButtonGuardarCambiosConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarConciliacionesBancarias")) {
				jButtonGuardarCambiosConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaConciliacionesBancarias")) {
				jButtonGuardarCambiosConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionConciliacionesBancarias")) {
				jButtonRecargarInformacionConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarConciliacionesBancarias")) {
				jButtonRecargarInformacionConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionConciliacionesBancarias")) {
				jButtonRecargarInformacionConciliacionesBancariasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresConciliacionesBancarias")) {
				jButtonAnterioresConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarConciliacionesBancarias")) {
				jButtonAnterioresConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreConciliacionesBancarias")) {
				jButtonAnterioresConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesConciliacionesBancarias")) {
				jButtonSiguientesConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarConciliacionesBancarias")) {
				jButtonSiguientesConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesConciliacionesBancarias")) {
				jButtonSiguientesConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByConciliacionesBancarias") || sTipo.equals("MenuItemDetalleAbrirOrderByConciliacionesBancarias")) {
				jButtonAbrirOrderByConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarConciliacionesBancarias") || sTipo.equals("MenuItemDetalleMostrarOcultarConciliacionesBancarias")) {
				jButtonMostrarOcultarConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosConciliacionesBancarias")) {
				jButtonNuevoGuardarCambiosConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarConciliacionesBancarias")) {
				jButtonNuevoGuardarCambiosConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosConciliacionesBancarias")) {
				jButtonNuevoGuardarCambiosConciliacionesBancariasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoConciliacionesBancarias")) {
				jButtonCerrarReporteDinamicoConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoConciliacionesBancarias")) {
				jButtonGenerarReporteDinamicoConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoConciliacionesBancarias")) {
				
				jButtonGenerarExcelReporteDinamicoConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionConciliacionesBancarias")) {
				jButtonCerrarImportacionConciliacionesBancariasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionConciliacionesBancarias")) {
				
				jButtonGenerarImportacionConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionConciliacionesBancarias")) {
				
				jButtonAbrirImportacionConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesConciliacionesBancarias")) {
				jComboBoxTiposAccionesConciliacionesBancariasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesConciliacionesBancarias")) {
				jComboBoxTiposRelacionesConciliacionesBancariasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioConciliacionesBancarias")) {
				jComboBoxTiposAccionesConciliacionesBancariasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarConciliacionesBancarias")) {
				
				jComboBoxTiposSeleccionarConciliacionesBancariasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralConciliacionesBancarias")) {
				jTextFieldValorCampoGeneralConciliacionesBancariasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByConciliacionesBancarias")) {
				jButtonAbrirOrderByConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarConciliacionesBancarias")) {
				jButtonAbrirOrderByConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByConciliacionesBancarias")) {
				jButtonCerrarOrderByConciliacionesBancariasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConciliacionesBancariasBusqueda")) {
				this.jButtonidConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaConciliacionesBancariasUpdate")) {
				this.jButtonid_empresaConciliacionesBancariasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaConciliacionesBancariasBusqueda")) {
				this.jButtonid_empresaConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableConciliacionesBancariasUpdate")) {
				this.jButtonid_cuenta_contableConciliacionesBancariasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableConciliacionesBancariasBusqueda")) {
				this.jButtonid_cuenta_contableConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeConciliacionesBancariasBusqueda")) {
				this.jButtonfecha_desdeConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaConciliacionesBancariasBusqueda")) {
				this.jButtonfecha_hastaConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorConciliacionesBancariasBusqueda")) {
				this.jButtonnumero_mayorConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuentaConciliacionesBancariasBusqueda")) {
				this.jButtoncodigo_cuentaConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuentaConciliacionesBancariasBusqueda")) {
				this.jButtonnombre_cuentaConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_localConciliacionesBancariasBusqueda")) {
				this.jButtondebito_localConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_localConciliacionesBancariasBusqueda")) {
				this.jButtoncredito_localConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_depositoConciliacionesBancariasBusqueda")) {
				this.jButtonnumero_depositoConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_extranConciliacionesBancariasBusqueda")) {
				this.jButtondebito_extranConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_extranConciliacionesBancariasBusqueda")) {
				this.jButtoncredito_extranConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaConciliacionesBancariasBusqueda")) {
				this.jButtonfechaConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalleConciliacionesBancariasBusqueda")) {
				this.jButtondetalleConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiarioConciliacionesBancariasBusqueda")) {
				this.jButtonbeneficiarioConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaConciliacionesBancariasConciliacionesBancarias")) {
				this.jButtonBusquedaConciliacionesBancariasConciliacionesBancariasActionPerformed(evt);
			}
			
			;
			
			
			ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessConciliacionesBancarias();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConciliacionesBancariasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conciliacionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conciliacionesbancarias);
				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
				
				


				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConciliacionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConciliacionesBancarias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ConciliacionesBancarias conciliacionesbancariasLocal=null;
			
			if(!this.getEsControlTabla()) {
				conciliacionesbancariasLocal=this.conciliacionesbancarias;
			} else {
				conciliacionesbancariasLocal=this.conciliacionesbancariasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conciliacionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conciliacionesbancarias);
				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
							
				
				


				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConciliacionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConciliacionesBancarias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConciliacionesBancariasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasAnterior =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conciliacionesbancariasAnterior =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
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
			
			ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
			
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
			
			


			
			ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConciliacionesBancariasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conciliacionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conciliacionesbancarias);
				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
								
						
				


				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConciliacionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConciliacionesBancarias.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conciliacionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conciliacionesbancarias);
				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
								
				
				


				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConciliacionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConciliacionesBancarias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConciliacionesBancariasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasAnterior =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conciliacionesbancariasAnterior =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conciliacionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conciliacionesbancarias);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConciliacionesBancariasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasAnterior =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conciliacionesbancariasAnterior =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConciliacionesBancariasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.conciliacionesbancarias);
			
			this.actualizarInformacion("INFO_PADRE",false,this.conciliacionesbancarias);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conciliacionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conciliacionesbancarias);
				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
							
				
				


				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConciliacionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConciliacionesBancarias.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConciliacionesBancariasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conciliacionesbancariasAnterior =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.conciliacionesbancariasAnterior =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
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
			
			ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
			
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
			
			


			
			ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConciliacionesBancariasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.conciliacionesbancarias);
			
			this.actualizarInformacion("INFO_PADRE",false,this.conciliacionesbancarias);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conciliacionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conciliacionesbancarias);
				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
								
				
				


				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConciliacionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConciliacionesBancarias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConciliacionesBancariasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasAnterior =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conciliacionesbancariasAnterior =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConciliacionesBancariasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.conciliacionesbancarias);
			
			this.actualizarInformacion("INFO_PADRE",false,this.conciliacionesbancarias);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConciliacionesBancariasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conciliacionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conciliacionesbancarias);
				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosConciliacionesBancarias")) {
					jCheckBoxSeleccionarTodosConciliacionesBancariasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosConciliacionesBancarias")) {
					jCheckBoxSeleccionadosConciliacionesBancariasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarConciliacionesBancarias")) {
					
				}
				
				


				
				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConciliacionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConciliacionesBancarias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.conciliacionesbancarias);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.conciliacionesbancarias);
				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
												
				
				


				
				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConciliacionesBancarias.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConciliacionesBancarias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConciliacionesBancariasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conciliacionesbancariasAnterior =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.conciliacionesbancariasAnterior =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConciliacionesBancariasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conciliacionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conciliacionesbancarias);
				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
				
				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
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
			
			ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
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
			
			


			
			ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConciliacionesBancariasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conciliacionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conciliacionesbancarias);
				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConciliacionesBancarias.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConciliacionesBancarias.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conciliacionesbancarias);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conciliacionesbancarias);
				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
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
				
				


				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConciliacionesBancarias.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConciliacionesBancarias.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConciliacionesBancariasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conciliacionesbancariasAnterior =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conciliacionesbancariasAnterior =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarConciliacionesBancarias")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosConciliacionesBancariasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosConciliacionesBancarias.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.conciliacionesbancarias =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.conciliacionesbancarias);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarConciliacionesBancarias")) {
				
				}
				
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarConciliacionesBancarias")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosConciliacionesBancarias.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarConciliacionesBancarias")) {
			
			}
			
			ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessConciliacionesBancarias();
			
			ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
			
			if(sTipo.equals("NuevoConciliacionesBancarias")) {
				jButtonNuevoConciliacionesBancariasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarConciliacionesBancarias")) {
				jButtonDuplicarConciliacionesBancariasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarConciliacionesBancarias")) {
				jButtonCopiarConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormConciliacionesBancarias")) {
				jButtonVerFormConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesConciliacionesBancarias")) {
				jButtonNuevoConciliacionesBancariasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarConciliacionesBancarias")) {
				jButtonModificarConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarConciliacionesBancarias")) {
				jButtonActualizarConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarConciliacionesBancarias")) {
				jButtonEliminarConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaConciliacionesBancarias")) {
				jButtonGuardarCambiosConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarConciliacionesBancarias")) {
				jButtonCancelarConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarConciliacionesBancarias")) {
				jButtonCerrarConciliacionesBancariasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosConciliacionesBancarias")) {
				jButtonGuardarCambiosConciliacionesBancariasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosConciliacionesBancarias")) {
				jButtonNuevoGuardarCambiosConciliacionesBancariasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByConciliacionesBancarias")) {
				jButtonAbrirOrderByConciliacionesBancariasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionConciliacionesBancarias")) {
				jButtonRecargarInformacionConciliacionesBancariasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresConciliacionesBancarias")) {
				jButtonAnterioresConciliacionesBancariasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesConciliacionesBancarias")) {
				jButtonSiguientesConciliacionesBancariasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConciliacionesBancariasBusqueda")) {
				this.jButtonidConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaConciliacionesBancariasUpdate")) {
				this.jButtonid_empresaConciliacionesBancariasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaConciliacionesBancariasBusqueda")) {
				this.jButtonid_empresaConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableConciliacionesBancariasUpdate")) {
				this.jButtonid_cuenta_contableConciliacionesBancariasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableConciliacionesBancariasBusqueda")) {
				this.jButtonid_cuenta_contableConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeConciliacionesBancariasBusqueda")) {
				this.jButtonfecha_desdeConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaConciliacionesBancariasBusqueda")) {
				this.jButtonfecha_hastaConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorConciliacionesBancariasBusqueda")) {
				this.jButtonnumero_mayorConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuentaConciliacionesBancariasBusqueda")) {
				this.jButtoncodigo_cuentaConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuentaConciliacionesBancariasBusqueda")) {
				this.jButtonnombre_cuentaConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_localConciliacionesBancariasBusqueda")) {
				this.jButtondebito_localConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_localConciliacionesBancariasBusqueda")) {
				this.jButtoncredito_localConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_depositoConciliacionesBancariasBusqueda")) {
				this.jButtonnumero_depositoConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_extranConciliacionesBancariasBusqueda")) {
				this.jButtondebito_extranConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_extranConciliacionesBancariasBusqueda")) {
				this.jButtoncredito_extranConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaConciliacionesBancariasBusqueda")) {
				this.jButtonfechaConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalleConciliacionesBancariasBusqueda")) {
				this.jButtondetalleConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiarioConciliacionesBancariasBusqueda")) {
				this.jButtonbeneficiarioConciliacionesBancariasBusquedaActionPerformed(evt);
			}
			
			ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessConciliacionesBancarias();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameConciliacionesBancarias")) {
				closingInternalFrameConciliacionesBancarias();
				
			} else if(sTipo.equals("jButtonCancelarConciliacionesBancarias")) {
				JInternalFrameBase jInternalFrameDetalleFormConciliacionesBancarias = (JInternalFrameBase)evt.getSource();
	            	
	            ConciliacionesBancariasBeanSwingJInternalFrame jInternalFrameParent=(ConciliacionesBancariasBeanSwingJInternalFrame)jInternalFrameDetalleFormConciliacionesBancarias.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarConciliacionesBancariasActionPerformed(null);
			}
			
			ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.conciliacionesbancarias,new Object(),this.conciliacionesbancariasParameterGeneral,this.conciliacionesbancariasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormConciliacionesBancarias(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormConciliacionesBancarias(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormConciliacionesBancarias(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.conciliacionesbancarias)) {
			if(!esControlTabla) {
				if(ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.conciliacionesbancarias,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);			
				}
				
				if(this.conciliacionesbancariasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualConciliacionesBancarias(this.conciliacionesbancarias,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanConciliacionesBancarias(this.conciliacionesbancariasReturnGeneral,this.conciliacionesbancariasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.conciliacionesbancariasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanConciliacionesBancarias(classes,this.conciliacionesbancariasReturnGeneral,this.conciliacionesbancariasBean,false);
					}
						
					if(this.conciliacionesbancariasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyConciliacionesBancarias(this.conciliacionesbancariasReturnGeneral.getConciliacionesBancarias());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioConciliacionesBancarias(this.conciliacionesbancariasReturnGeneral.getConciliacionesBancarias());	
					}
						
					if(this.conciliacionesbancariasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioConciliacionesBancarias(this.conciliacionesbancariasReturnGeneral.getConciliacionesBancarias(),classes);//this.conciliacionesbancariasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioConciliacionesBancarias(this.conciliacionesbancarias,classes);//this.conciliacionesbancariasBean);									
				}
			
				if(ConciliacionesBancariasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualConciliacionesBancarias(this.conciliacionesbancarias,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConciliacionesBancarias(this.conciliacionesbancarias);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.conciliacionesbancariasAnterior!=null) {
						this.conciliacionesbancarias=this.conciliacionesbancariasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.conciliacionesbancariasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.conciliacionesbancariasReturnGeneral.getConciliacionesBancarias(),conciliacionesbancariasLogic.getConciliacionesBancariass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.conciliacionesbancariasReturnGeneral.getConciliacionesBancarias(),this.conciliacionesbancariass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosConciliacionesBancarias.repaint();
				
				//((AbstractTableModel) this.jTableDatosConciliacionesBancarias.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosConciliacionesBancarias();
			}
		}
	}
	
	public void actualizarVisualTableDatosConciliacionesBancarias() throws Exception {
		
		ConciliacionesBancariasModel conciliacionesbancariasModel=(ConciliacionesBancariasModel)this.jTableDatosConciliacionesBancarias.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			conciliacionesbancariasModel.conciliacionesbancariass=this.conciliacionesbancariasLogic.getConciliacionesBancariass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			conciliacionesbancariasModel.conciliacionesbancariass=this.conciliacionesbancariass;
		}
		
		
		((ConciliacionesBancariasModel) this.jTableDatosConciliacionesBancarias.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaConciliacionesBancarias() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getconciliacionesbancariasAnterior(),this.conciliacionesbancariasLogic.getConciliacionesBancariass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getconciliacionesbancariasAnterior(),this.conciliacionesbancariass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosConciliacionesBancarias();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioConciliacionesBancarias(ConciliacionesBancarias conciliacionesbancarias,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
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
										
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.conciliacionesbancarias,new Object(),generalEntityParameterGeneral,this.conciliacionesbancariasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.conciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ConciliacionesBancariasConstantesFunciones.getClassesRelationshipsOfConciliacionesBancarias(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ConciliacionesBancariasConstantesFunciones.getClassesRelationshipsFromStringsOfConciliacionesBancarias(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormConciliacionesBancarias(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ConciliacionesBancariasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.conciliacionesbancarias,new Object(),generalEntityParameterGeneral,this.conciliacionesbancariasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioConciliacionesBancarias(ConciliacionesBancariasBean conciliacionesbancariasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanConciliacionesBancarias(ArrayList<Classe> classes,ConciliacionesBancariasReturnGeneral conciliacionesbancariasReturnGeneral,ConciliacionesBancariasBean conciliacionesbancariasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualConciliacionesBancarias(ConciliacionesBancarias conciliacionesbancarias,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.conciliacionesbancarias)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormConciliacionesBancarias = new ConciliacionesBancariasDetalleFormJInternalFrame(jDesktopPane,this.conciliacionesbancariasSessionBean.getConGuardarRelaciones(),this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.setVisible(false);
		this.jInternalFrameDetalleFormConciliacionesBancarias.setSelected(false);						
		
		this.jInternalFrameDetalleFormConciliacionesBancarias.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormConciliacionesBancarias.conciliacionesbancariasLogic=this.conciliacionesbancariasLogic;
		
		this.cargarCombosFrameForeignKeyConciliacionesBancarias("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleConciliacionesBancarias();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConciliacionesBancarias();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyConciliacionesBancarias("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyConciliacionesBancarias();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormConciliacionesBancarias.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConciliacionesBancarias"));
		
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonModificarConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"ModificarConciliacionesBancarias"));

		
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonModificarToolBarConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"ModificarToolBarConciliacionesBancarias"));
					
		this.jInternalFrameDetalleFormConciliacionesBancarias.jMenuItemModificarConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"MenuItemModificarConciliacionesBancarias"));		
		
		
		
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonActualizarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"ActualizarConciliacionesBancarias"));
		
		
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonActualizarToolBarConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConciliacionesBancarias"));
						
		this.jInternalFrameDetalleFormConciliacionesBancarias.jMenuItemActualizarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConciliacionesBancarias"));		
		
		
		
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonEliminarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"EliminarConciliacionesBancarias"));
		
		
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonEliminarToolBarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"EliminarToolBarConciliacionesBancarias"));
								
		this.jInternalFrameDetalleFormConciliacionesBancarias.jMenuItemEliminarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConciliacionesBancarias"));		
		
		
		
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonCancelarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"CancelarConciliacionesBancarias"));
		
		
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonCancelarToolBarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"CancelarToolBarConciliacionesBancarias"));
					
		this.jInternalFrameDetalleFormConciliacionesBancarias.jMenuItemCancelarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConciliacionesBancarias"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormConciliacionesBancarias.jMenuItemDetalleCerrarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConciliacionesBancarias"));		
		
		
		
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonGuardarCambiosToolBarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConciliacionesBancarias"));
		
		
		
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonGuardarCambiosToolBarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConciliacionesBancarias"));
		
		
		
		this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxTiposAccionesFormularioConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConciliacionesBancarias"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonidConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"idConciliacionesBancariasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonid_empresaConciliacionesBancariasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConciliacionesBancariasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonid_empresaConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConciliacionesBancariasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonid_cuenta_contableConciliacionesBancariasUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableConciliacionesBancariasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonid_cuenta_contableConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonfecha_desdeConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonfecha_hastaConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonnumero_mayorConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtoncodigo_cuentaConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuentaConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonnombre_cuentaConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuentaConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtondebito_localConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"debito_localConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtoncredito_localConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"credito_localConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonnumero_depositoConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"numero_depositoConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtondebito_extranConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"debito_extranConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtoncredito_extranConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"credito_extranConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonfechaConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fechaConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtondetalleConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"detalleConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonbeneficiarioConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioConciliacionesBancariasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormConciliacionesBancarias.jTabbedPaneRelacionesConciliacionesBancarias.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConciliacionesBancarias"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameConciliacionesBancarias"));
		
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConciliacionesBancarias.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConciliacionesBancarias"));
		}
		
		this.jTableDatosConciliacionesBancarias.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarConciliacionesBancarias"));
		
		this.jTableDatosConciliacionesBancarias.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarConciliacionesBancarias"));
		
		this.jButtonNuevoConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"NuevoConciliacionesBancarias"));
		
		this.jButtonDuplicarConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"DuplicarConciliacionesBancarias"));
		
		this.jButtonCopiarConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"CopiarConciliacionesBancarias"));
		
		this.jButtonVerFormConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"VerFormConciliacionesBancarias"));
		
		
		this.jButtonNuevoToolBarConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"NuevoToolBarConciliacionesBancarias"));
			
		this.jButtonDuplicarToolBarConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"DuplicarToolBarConciliacionesBancarias"));
			
		this.jMenuItemNuevoConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemNuevoConciliacionesBancarias"));
			
		this.jMenuItemDuplicarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarConciliacionesBancarias"));		
		
		
		this.jButtonNuevoRelacionesConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"NuevoRelacionesConciliacionesBancarias"));
		
		
		this.jButtonNuevoRelacionesToolBarConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarConciliacionesBancarias"));
			
		this.jMenuItemNuevoRelacionesConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesConciliacionesBancarias"));		
		
		
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonModificarConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"ModificarConciliacionesBancarias"));
		}
		
		
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonModificarToolBarConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"ModificarToolBarConciliacionesBancarias"));
			
			this.jInternalFrameDetalleFormConciliacionesBancarias.jMenuItemModificarConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"MenuItemModificarConciliacionesBancarias"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonActualizarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"ActualizarConciliacionesBancarias"));
		}
		
		
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonActualizarToolBarConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConciliacionesBancarias"));
				
			this.jInternalFrameDetalleFormConciliacionesBancarias.jMenuItemActualizarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConciliacionesBancarias"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonEliminarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"EliminarConciliacionesBancarias"));
		}
		
		
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonEliminarToolBarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"EliminarToolBarConciliacionesBancarias"));
						
			this.jInternalFrameDetalleFormConciliacionesBancarias.jMenuItemEliminarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConciliacionesBancarias"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonCancelarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"CancelarConciliacionesBancarias"));
		}
		
		
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonCancelarToolBarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"CancelarToolBarConciliacionesBancarias"));
			
			this.jInternalFrameDetalleFormConciliacionesBancarias.jMenuItemCancelarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConciliacionesBancarias"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarConciliacionesBancarias"));		
		
		
		this.jButtonCerrarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"CerrarConciliacionesBancarias"));
		
		
		this.jButtonCerrarToolBarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"CerrarToolBarConciliacionesBancarias"));
			
		this.jMenuItemCerrarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemCerrarConciliacionesBancarias"));
			
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConciliacionesBancarias.jMenuItemDetalleCerrarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConciliacionesBancarias"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonGuardarCambiosConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"GuardarCambiosConciliacionesBancarias"));
		}
		
		
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonGuardarCambiosToolBarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConciliacionesBancarias"));
		}
		
		this.jButtonCopiarToolBarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"CopiarToolBarConciliacionesBancarias"));
			
		this.jButtonVerFormToolBarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"VerFormToolBarConciliacionesBancarias"));
		
		this.jMenuItemGuardarCambiosConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosConciliacionesBancarias"));
			
		this.jMenuItemCopiarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemCopiarConciliacionesBancarias"));		
		
		this.jMenuItemVerFormConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemVerFormConciliacionesBancarias"));		
		
		
		this.jButtonGuardarCambiosTablaConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConciliacionesBancarias"));
		
		
		this.jButtonGuardarCambiosTablaToolBarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarConciliacionesBancarias"));
			
		this.jMenuItemGuardarCambiosTablaConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConciliacionesBancarias"));		
		
		
		
		this.jButtonRecargarInformacionConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"RecargarInformacionConciliacionesBancarias"));
					
		this.jButtonRecargarInformacionToolBarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarConciliacionesBancarias"));
		
		this.jMenuItemRecargarInformacionConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionConciliacionesBancarias"));		
		
		
		
		this.jButtonAnterioresConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"AnterioresConciliacionesBancarias"));
		
		
		this.jButtonAnterioresToolBarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"AnterioresToolBarConciliacionesBancarias"));
		
		this.jMenuItemAnterioresConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresConciliacionesBancarias"));		
		
		
		this.jButtonSiguientesConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"SiguientesConciliacionesBancarias"));
		
		
		this.jButtonSiguientesToolBarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"SiguientesToolBarConciliacionesBancarias"));
			
		this.jMenuItemSiguientesConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesConciliacionesBancarias"));
			
		this.jMenuItemAbrirOrderByConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByConciliacionesBancarias"));
			
		this.jMenuItemMostrarOcultarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarConciliacionesBancarias"));
			
		this.jMenuItemDetalleAbrirOrderByConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByConciliacionesBancarias"));
			
		this.jMenuItemDetalleMostarOcultarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarConciliacionesBancarias"));		
		
		
		this.jButtonNuevoGuardarCambiosConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosConciliacionesBancarias"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarConciliacionesBancarias"));
			
		this.jMenuItemNuevoGuardarCambiosConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosConciliacionesBancarias"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosConciliacionesBancarias.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosConciliacionesBancarias"));

		this.jCheckBoxSeleccionadosConciliacionesBancarias.addItemListener(new CheckBoxItemListener(this,"SeleccionadosConciliacionesBancarias"));
		
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxTiposAccionesFormularioConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConciliacionesBancarias"));
		}
		
		
		this.jComboBoxTiposRelacionesConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"TiposRelacionesConciliacionesBancarias"));
			
		this.jComboBoxTiposAccionesConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"TiposAccionesConciliacionesBancarias"));
					
		this.jComboBoxTiposSeleccionarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"TiposSeleccionarConciliacionesBancarias"));
			
		this.jTextFieldValorCampoGeneralConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralConciliacionesBancarias"));		
		
		
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonidConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"idConciliacionesBancariasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonid_empresaConciliacionesBancariasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConciliacionesBancariasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonid_empresaConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConciliacionesBancariasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonid_cuenta_contableConciliacionesBancariasUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableConciliacionesBancariasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonid_cuenta_contableConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonfecha_desdeConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonfecha_hastaConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonnumero_mayorConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtoncodigo_cuentaConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuentaConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonnombre_cuentaConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuentaConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtondebito_localConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"debito_localConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtoncredito_localConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"credito_localConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonnumero_depositoConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"numero_depositoConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtondebito_extranConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"debito_extranConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtoncredito_extranConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"credito_extranConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonfechaConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fechaConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtondetalleConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"detalleConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonbeneficiarioConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioConciliacionesBancariasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaConciliacionesBancariasConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"BusquedaConciliacionesBancariasConciliacionesBancarias"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoConciliacionesBancarias!=null) {
				this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConciliacionesBancarias"));
				this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConciliacionesBancarias"));
				this.jInternalFrameReporteDinamicoConciliacionesBancarias.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConciliacionesBancarias"));
			}
			
			//this.jButtonCerrarReporteDinamicoConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConciliacionesBancarias"));				
			//this.jButtonGenerarReporteDinamicoConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConciliacionesBancarias"));
			//this.jButtonGenerarExcelReporteDinamicoConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConciliacionesBancarias"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionConciliacionesBancarias!=null) {
				this.jInternalFrameImportacionConciliacionesBancarias.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConciliacionesBancarias"));
				this.jInternalFrameImportacionConciliacionesBancarias.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConciliacionesBancarias"));
				this.jInternalFrameImportacionConciliacionesBancarias.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConciliacionesBancarias"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"AbrirOrderByConciliacionesBancarias"));
			
			this.jButtonAbrirOrderByToolBarConciliacionesBancarias.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarConciliacionesBancarias"));			
			
			if(this.jInternalFrameOrderByConciliacionesBancarias!=null) {
				this.jInternalFrameOrderByConciliacionesBancarias.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConciliacionesBancarias"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConciliacionesBancarias.jTabbedPaneRelacionesConciliacionesBancarias.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConciliacionesBancarias"));
		
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
            		closingInternalFrameConciliacionesBancarias();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormConciliacionesBancarias.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormConciliacionesBancarias = (JInternalFrameBase)event.getSource();
	            	
	            ConciliacionesBancariasBeanSwingJInternalFrame jInternalFrameParent=(ConciliacionesBancariasBeanSwingJInternalFrame)jInternalFrameDetalleFormConciliacionesBancarias.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarConciliacionesBancariasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosConciliacionesBancarias.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosConciliacionesBancariasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosConciliacionesBancarias.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosConciliacionesBancarias.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConciliacionesBancariasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConciliacionesBancariasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConciliacionesBancariasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoConciliacionesBancarias";
		inputMap = this.jButtonNuevoConciliacionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoConciliacionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConciliacionesBancariasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConciliacionesBancariasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConciliacionesBancariasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConciliacionesBancariasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesConciliacionesBancarias";
		inputMap = this.jButtonNuevoRelacionesConciliacionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesConciliacionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConciliacionesBancariasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarConciliacionesBancarias";
		inputMap = this.jButtonModificarConciliacionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarConciliacionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarConciliacionesBancariasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarConciliacionesBancarias";
		inputMap = this.jButtonActualizarConciliacionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarConciliacionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarConciliacionesBancariasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarConciliacionesBancarias";
		inputMap = this.jButtonEliminarConciliacionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarConciliacionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarConciliacionesBancariasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarConciliacionesBancarias";
		inputMap = this.jButtonCancelarConciliacionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarConciliacionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarConciliacionesBancariasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarConciliacionesBancarias";
		inputMap = this.jButtonCerrarConciliacionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarConciliacionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarConciliacionesBancariasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonGuardarCambiosConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosConciliacionesBancarias";
		inputMap = this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonGuardarCambiosConciliacionesBancarias.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonGuardarCambiosConciliacionesBancarias.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosConciliacionesBancariasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosConciliacionesBancarias.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosConciliacionesBancariasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesConciliacionesBancarias.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesConciliacionesBancariasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarConciliacionesBancarias.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarConciliacionesBancariasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralConciliacionesBancarias.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralConciliacionesBancariasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonidConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"idConciliacionesBancariasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonid_empresaConciliacionesBancariasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConciliacionesBancariasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonid_empresaConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConciliacionesBancariasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonid_cuenta_contableConciliacionesBancariasUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableConciliacionesBancariasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonid_cuenta_contableConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonfecha_desdeConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonfecha_hastaConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonnumero_mayorConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtoncodigo_cuentaConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuentaConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonnombre_cuentaConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuentaConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtondebito_localConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"debito_localConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtoncredito_localConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"credito_localConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonnumero_depositoConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"numero_depositoConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtondebito_extranConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"debito_extranConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtoncredito_extranConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"credito_extranConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonfechaConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"fechaConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtondetalleConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"detalleConciliacionesBancariasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConciliacionesBancarias.jButtonbeneficiarioConciliacionesBancariasBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioConciliacionesBancariasBusqueda"));
		
		
		this.jButtonBusquedaConciliacionesBancariasConciliacionesBancarias.addActionListener(new ButtonActionListener(this,"BusquedaConciliacionesBancariasConciliacionesBancarias"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionConciliacionesBancarias.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionConciliacionesBancariasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarConciliacionesBancariasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarConciliacionesBancarias.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosConciliacionesBancarias(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ConciliacionesBancarias conciliacionesbancariasAux:this.conciliacionesbancariasLogic.getConciliacionesBancariass()) {
					conciliacionesbancariasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConciliacionesBancarias conciliacionesbancariasAux:conciliacionesbancariass) {
					conciliacionesbancariasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosConciliacionesBancariasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConciliacionesBancarias(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ConciliacionesBancarias conciliacionesbancariasAux:this.conciliacionesbancariasLogic.getConciliacionesBancariass()) {
						conciliacionesbancariasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConciliacionesBancarias conciliacionesbancariasAux:conciliacionesbancariass) {
						conciliacionesbancariasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ConciliacionesBancarias conciliacionesbancariasAux:this.conciliacionesbancariasLogic.getConciliacionesBancariass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConciliacionesBancarias conciliacionesbancariasAux:conciliacionesbancariass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaConciliacionesBancarias(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConciliacionesBancarias.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConciliacionesBancarias.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConciliacionesBancarias,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosConciliacionesBancariasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConciliacionesBancarias(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosConciliacionesBancarias.getSelectedRows();
			
			ConciliacionesBancarias conciliacionesbancariasLocal=new ConciliacionesBancarias();
			
			//this.seleccionarTodosConciliacionesBancarias(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					conciliacionesbancariasLocal =(ConciliacionesBancarias) this.conciliacionesbancariasLogic.getConciliacionesBancariass().toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					conciliacionesbancariasLocal =(ConciliacionesBancarias) this.conciliacionesbancariass.toArray()[this.jTableDatosConciliacionesBancarias.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				conciliacionesbancariasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ConciliacionesBancarias conciliacionesbancariasAux:this.conciliacionesbancariasLogic.getConciliacionesBancariass()) {
						conciliacionesbancariasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConciliacionesBancarias conciliacionesbancariasAux:conciliacionesbancariass) {
						conciliacionesbancariasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaConciliacionesBancarias(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConciliacionesBancarias.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConciliacionesBancarias.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConciliacionesBancarias,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualConciliacionesBancariasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarConciliacionesBancariasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralConciliacionesBancariasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingConciliacionesBancarias(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralConciliacionesBancarias.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ConciliacionesBancarias conciliacionesbancariasAux:this.conciliacionesbancariasLogic.getConciliacionesBancariass()) {
				
						if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							conciliacionesbancariasAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							conciliacionesbancariasAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							conciliacionesbancariasAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA)) {
							existe=true;
							conciliacionesbancariasAux.setcodigo_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA)) {
							existe=true;
							conciliacionesbancariasAux.setnombre_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL)) {
							existe=true;
							conciliacionesbancariasAux.setdebito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL)) {
							existe=true;
							conciliacionesbancariasAux.setcredito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_NUMERODEPOSITO)) {
							existe=true;
							conciliacionesbancariasAux.setnumero_deposito(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOEXTRAN)) {
							existe=true;
							conciliacionesbancariasAux.setdebito_extran(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOEXTRAN)) {
							existe=true;
							conciliacionesbancariasAux.setcredito_extran(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							conciliacionesbancariasAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							conciliacionesbancariasAux.setdetalle(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO)) {
							existe=true;
							conciliacionesbancariasAux.setbeneficiario(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConciliacionesBancarias conciliacionesbancariasAux:conciliacionesbancariass) {
					
						if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							conciliacionesbancariasAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							conciliacionesbancariasAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							conciliacionesbancariasAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA)) {
							existe=true;
							conciliacionesbancariasAux.setcodigo_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA)) {
							existe=true;
							conciliacionesbancariasAux.setnombre_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL)) {
							existe=true;
							conciliacionesbancariasAux.setdebito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL)) {
							existe=true;
							conciliacionesbancariasAux.setcredito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_NUMERODEPOSITO)) {
							existe=true;
							conciliacionesbancariasAux.setnumero_deposito(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOEXTRAN)) {
							existe=true;
							conciliacionesbancariasAux.setdebito_extran(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOEXTRAN)) {
							existe=true;
							conciliacionesbancariasAux.setcredito_extran(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							conciliacionesbancariasAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							conciliacionesbancariasAux.setdetalle(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO)) {
							existe=true;
							conciliacionesbancariasAux.setbeneficiario(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaConciliacionesBancarias(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesConciliacionesBancariasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingConciliacionesBancarias(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioConciliacionesBancarias=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesConciliacionesBancarias.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxTiposAccionesFormularioConciliacionesBancarias.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteConciliacionesBancarias) {				
					conSplash=true;//false;										
					
					//this.startProcessConciliacionesBancarias(conSplash);
				
					this.generarReporteConciliacionesBancariassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConciliacionesBancarias.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxTiposAccionesFormularioConciliacionesBancarias.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoConciliacionesBancariassSeleccionados();
				//this.jComboBoxTiposAccionesConciliacionesBancarias.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConciliacionesBancariassSeleccionados(false);
				//this.jComboBoxTiposAccionesConciliacionesBancarias.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConciliacionesBancariassSeleccionados(true);
				//this.jComboBoxTiposAccionesConciliacionesBancarias.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConciliacionesBancarias();
				
				this.exportarConciliacionesBancariassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConciliacionesBancarias.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxTiposAccionesFormularioConciliacionesBancarias.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionConciliacionesBancariass();
				//this.importarConciliacionesBancariass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConciliacionesBancarias.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxTiposAccionesFormularioConciliacionesBancarias.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConciliacionesBancarias();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelConciliacionesBancariassSeleccionados();
				//this.jComboBoxTiposAccionesConciliacionesBancarias.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Conciliaciones Bancarias", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessConciliacionesBancarias();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoConciliacionesBancarias)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyConciliacionesBancarias(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Conciliaciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConciliacionesBancarias.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxTiposAccionesFormularioConciliacionesBancarias.setSelectedIndex(0);					
				}	
			} 			
			else if(ConciliacionesBancariasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteConciliacionesBancarias) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessConciliacionesBancarias(conSplash);
					
						//this.actualizarParametrosGeneralConciliacionesBancarias();
						
						this.generarReporteProcesoAccionConciliacionesBancariassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesConciliacionesBancarias.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxTiposAccionesFormularioConciliacionesBancarias.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ConciliacionesBancariasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Conciliaciones BancariasES SELECCIONADOS?", "MANTENIMIENTO DE Conciliaciones Bancarias", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessConciliacionesBancarias();
				
						this.actualizarParametrosGeneralConciliacionesBancarias();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.conciliacionesbancariasReturnGeneral=conciliacionesbancariasLogic.procesarAccionConciliacionesBancariassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.conciliacionesbancariasLogic.getConciliacionesBancariass(),this.conciliacionesbancariasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarConciliacionesBancariasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConciliacionesBancarias.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxTiposAccionesFormularioConciliacionesBancarias.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralConciliacionesBancarias();
					
					ConciliacionesBancariasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarConciliacionesBancariasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConciliacionesBancarias.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxTiposAccionesFormularioConciliacionesBancarias.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessConciliacionesBancarias(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesConciliacionesBancariasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessConciliacionesBancarias();
			
			if(this.jInternalFrameDetalleFormConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ConciliacionesBancarias> conciliacionesbancariassSeleccionados=new ArrayList<ConciliacionesBancarias>();		
			ConciliacionesBancarias conciliacionesbancarias=new ConciliacionesBancarias();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingConciliacionesBancarias(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesConciliacionesBancarias.getSelectedItem();
			
			
			
			
			conciliacionesbancariassSeleccionados=this.getConciliacionesBancariassSeleccionados(true);
			//this.sTipoAccion;
			
			if(conciliacionesbancariassSeleccionados.size()==1) {
				for(ConciliacionesBancarias conciliacionesbancariasAux:conciliacionesbancariassSeleccionados) {
					conciliacionesbancarias=conciliacionesbancariasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessConciliacionesBancarias();
			
      		//this.finishProcessConciliacionesBancarias(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarConciliacionesBancariasReturnGeneral() throws Exception {
		if(this.conciliacionesbancariasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.conciliacionesbancariasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.conciliacionesbancariasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.conciliacionesbancariasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.conciliacionesbancariasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.conciliacionesbancariasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingConciliacionesBancarias(false);
		}
		
		if(this.conciliacionesbancariasReturnGeneral.getConRetornoLista() || this.conciliacionesbancariasReturnGeneral.getConRetornoObjeto()) {
			if(this.conciliacionesbancariasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.conciliacionesbancariasLogic.setConciliacionesBancariass(this.conciliacionesbancariasReturnGeneral.getConciliacionesBancariass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingConciliacionesBancarias(false);
		}
	}
	
	public void actualizarParametrosGeneralConciliacionesBancarias() throws Exception {
		
		
	}
	
	public ArrayList<ConciliacionesBancarias> getConciliacionesBancariassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ConciliacionesBancarias> conciliacionesbancariassSeleccionados=new ArrayList<ConciliacionesBancarias>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioConciliacionesBancarias) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ConciliacionesBancarias conciliacionesbancariasAux:conciliacionesbancariasLogic.getConciliacionesBancariass()) {
					if(conciliacionesbancariasAux.getIsSelected()) {
						conciliacionesbancariassSeleccionados.add(conciliacionesbancariasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConciliacionesBancarias conciliacionesbancariasAux:this.conciliacionesbancariass) {
					if(conciliacionesbancariasAux.getIsSelected()) {
						conciliacionesbancariassSeleccionados.add(conciliacionesbancariasAux);				
					}
				}
			}
			
			if(conciliacionesbancariassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						conciliacionesbancariassSeleccionados.addAll(this.conciliacionesbancariasLogic.getConciliacionesBancariass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						conciliacionesbancariassSeleccionados.addAll(this.conciliacionesbancariass);				
					}
				}
			}
		} else {
			conciliacionesbancariassSeleccionados.add(this.conciliacionesbancarias);
		}
		
		return conciliacionesbancariassSeleccionados;
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
	
	public void generarReporteConciliacionesBancariassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalConciliacionesBancariassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoConciliacionesBancariassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConciliacionesBancariassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConciliacionesBancariassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Conciliaciones Bancarias",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesConciliacionesBancariassSeleccionados() throws Exception {
		ArrayList<ConciliacionesBancarias> conciliacionesbancariassSeleccionados=new ArrayList<ConciliacionesBancarias>();		
		
		conciliacionesbancariassSeleccionados=this.getConciliacionesBancariassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteConciliacionesBancariass("Todos",conciliacionesbancariassSeleccionados);
		
	}	
	
	public void generarReporteNormalConciliacionesBancariassSeleccionados() throws Exception {
		ArrayList<ConciliacionesBancarias> conciliacionesbancariassSeleccionados=new ArrayList<ConciliacionesBancarias>();		
		
		conciliacionesbancariassSeleccionados=this.getConciliacionesBancariassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteConciliacionesBancariass("Todos",conciliacionesbancariassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionConciliacionesBancariassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ConciliacionesBancarias> conciliacionesbancariassSeleccionados=new ArrayList<ConciliacionesBancarias>();
		
		conciliacionesbancariassSeleccionados=this.getConciliacionesBancariassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteConciliacionesBancariass("Todos",conciliacionesbancariassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoConciliacionesBancariassSeleccionados() throws Exception {
		ArrayList<ConciliacionesBancarias> conciliacionesbancariassSeleccionados=new ArrayList<ConciliacionesBancarias>();		
		
		
		this.abrirInicializarFrameReporteDinamicoConciliacionesBancarias();
		
		
		conciliacionesbancariassSeleccionados=this.getConciliacionesBancariassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoConciliacionesBancarias();
		
		
		//this.generarReporteConciliacionesBancariass("Todos",conciliacionesbancariassSeleccionados ,conciliacionesbancariasImplementable,conciliacionesbancariasImplementableHome);
	}
	
	public void mostrarImportacionConciliacionesBancariass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionConciliacionesBancarias();
		
		this.abrirFrameImportacionConciliacionesBancarias();		
		
			
		//this.generarReporteConciliacionesBancariass("Todos",conciliacionesbancariassSeleccionados ,conciliacionesbancariasImplementable,conciliacionesbancariasImplementableHome);
	}
	
	public void importarConciliacionesBancariass() throws Exception {		
	
	}
	
	public void exportarConciliacionesBancariassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelConciliacionesBancariassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoConciliacionesBancariassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlConciliacionesBancariassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Conciliaciones Bancarias",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoConciliacionesBancariassSeleccionados() throws Exception {
		ArrayList<ConciliacionesBancarias> conciliacionesbancariassSeleccionados=new ArrayList<ConciliacionesBancarias>();		
		
		conciliacionesbancariassSeleccionados=this.getConciliacionesBancariassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conciliacionesbancarias."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarConciliacionesBancarias(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ConciliacionesBancarias conciliacionesbancariasAux:conciliacionesbancariassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarConciliacionesBancarias(conciliacionesbancariasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//conciliacionesbancariasAux.setsDetalleGeneralEntityReporte(conciliacionesbancariasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conciliaciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarConciliacionesBancarias(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ConciliacionesBancariasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConciliacionesBancariasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConciliacionesBancariasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConciliacionesBancariasConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConciliacionesBancariasConstantesFunciones.LABEL_FECHADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConciliacionesBancariasConstantesFunciones.LABEL_FECHAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConciliacionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConciliacionesBancariasConstantesFunciones.LABEL_NUMERODEPOSITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOEXTRAN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOEXTRAN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConciliacionesBancariasConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConciliacionesBancariasConstantesFunciones.LABEL_DETALLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarConciliacionesBancarias(ConciliacionesBancarias conciliacionesbancarias,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=conciliacionesbancarias.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=conciliacionesbancarias.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=conciliacionesbancarias.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conciliacionesbancarias.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conciliacionesbancarias.getfecha_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conciliacionesbancarias.getfecha_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conciliacionesbancarias.getnumero_mayor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conciliacionesbancarias.getcodigo_cuenta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conciliacionesbancarias.getnombre_cuenta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conciliacionesbancarias.getdebito_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conciliacionesbancarias.getcredito_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conciliacionesbancarias.getnumero_deposito();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conciliacionesbancarias.getdebito_extran().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conciliacionesbancarias.getcredito_extran().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conciliacionesbancarias.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conciliacionesbancarias.getdetalle();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conciliacionesbancarias.getbeneficiario();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelConciliacionesBancariassSeleccionados() throws Exception {
		ArrayList<ConciliacionesBancarias> conciliacionesbancariassSeleccionados=new ArrayList<ConciliacionesBancarias>();		
		
		conciliacionesbancariassSeleccionados=this.getConciliacionesBancariassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conciliacionesbancarias.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ConciliacionesBancariass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelConciliacionesBancarias(row);				
				iRow++;
			}				
			
			for(ConciliacionesBancarias conciliacionesbancariasAux:conciliacionesbancariassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelConciliacionesBancarias(conciliacionesbancariasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conciliaciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlConciliacionesBancariassSeleccionados() throws Exception {
		ArrayList<ConciliacionesBancarias> conciliacionesbancariassSeleccionados=new ArrayList<ConciliacionesBancarias>();		
		
		conciliacionesbancariassSeleccionados=this.getConciliacionesBancariassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conciliacionesbancarias.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("conciliacionesbancariass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("conciliacionesbancarias");
			//elementRoot.appendChild(element);
		
			for(ConciliacionesBancarias conciliacionesbancariasAux:conciliacionesbancariassSeleccionados) {
				element = document.createElement("conciliacionesbancarias");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlConciliacionesBancarias(conciliacionesbancariasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conciliaciones Bancarias",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelConciliacionesBancarias(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_FECHADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_FECHAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_NUMERODEPOSITO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOEXTRAN);
		cell = row.createCell(iColumn++);cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOEXTRAN);
		cell = row.createCell(iColumn++);cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_DETALLE);
		cell = row.createCell(iColumn++);cell.setCellValue(ConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelConciliacionesBancarias(ConciliacionesBancarias conciliacionesbancarias,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(conciliacionesbancarias.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(conciliacionesbancarias.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(conciliacionesbancarias.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(conciliacionesbancarias.getfecha_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(conciliacionesbancarias.getfecha_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(conciliacionesbancarias.getnumero_mayor());
		cell = row.createCell(iColumn++);cell.setCellValue(conciliacionesbancarias.getcodigo_cuenta());
		cell = row.createCell(iColumn++);cell.setCellValue(conciliacionesbancarias.getnombre_cuenta());
		cell = row.createCell(iColumn++);cell.setCellValue(conciliacionesbancarias.getdebito_local());
		cell = row.createCell(iColumn++);cell.setCellValue(conciliacionesbancarias.getcredito_local());
		cell = row.createCell(iColumn++);cell.setCellValue(conciliacionesbancarias.getnumero_deposito());
		cell = row.createCell(iColumn++);cell.setCellValue(conciliacionesbancarias.getdebito_extran());
		cell = row.createCell(iColumn++);cell.setCellValue(conciliacionesbancarias.getcredito_extran());
		cell = row.createCell(iColumn++);cell.setCellValue(conciliacionesbancarias.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(conciliacionesbancarias.getdetalle());
		cell = row.createCell(iColumn++);cell.setCellValue(conciliacionesbancarias.getbeneficiario());				
	}
	
	public void setFilaDatosExportarXmlConciliacionesBancarias(ConciliacionesBancarias conciliacionesbancarias,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ConciliacionesBancariasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(conciliacionesbancarias.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ConciliacionesBancariasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(conciliacionesbancarias.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ConciliacionesBancariasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(conciliacionesbancarias.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(ConciliacionesBancariasConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(conciliacionesbancarias.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementfecha_desde = document.createElement(ConciliacionesBancariasConstantesFunciones.FECHADESDE);
		elementfecha_desde.appendChild(document.createTextNode(conciliacionesbancarias.getfecha_desde().toString().trim()));
		element.appendChild(elementfecha_desde);

		Element elementfecha_hasta = document.createElement(ConciliacionesBancariasConstantesFunciones.FECHAHASTA);
		elementfecha_hasta.appendChild(document.createTextNode(conciliacionesbancarias.getfecha_hasta().toString().trim()));
		element.appendChild(elementfecha_hasta);

		Element elementnumero_mayor = document.createElement(ConciliacionesBancariasConstantesFunciones.NUMEROMAYOR);
		elementnumero_mayor.appendChild(document.createTextNode(conciliacionesbancarias.getnumero_mayor().trim()));
		element.appendChild(elementnumero_mayor);

		Element elementcodigo_cuenta = document.createElement(ConciliacionesBancariasConstantesFunciones.CODIGOCUENTA);
		elementcodigo_cuenta.appendChild(document.createTextNode(conciliacionesbancarias.getcodigo_cuenta().trim()));
		element.appendChild(elementcodigo_cuenta);

		Element elementnombre_cuenta = document.createElement(ConciliacionesBancariasConstantesFunciones.NOMBRECUENTA);
		elementnombre_cuenta.appendChild(document.createTextNode(conciliacionesbancarias.getnombre_cuenta().trim()));
		element.appendChild(elementnombre_cuenta);

		Element elementdebito_local = document.createElement(ConciliacionesBancariasConstantesFunciones.DEBITOLOCAL);
		elementdebito_local.appendChild(document.createTextNode(conciliacionesbancarias.getdebito_local().toString().trim()));
		element.appendChild(elementdebito_local);

		Element elementcredito_local = document.createElement(ConciliacionesBancariasConstantesFunciones.CREDITOLOCAL);
		elementcredito_local.appendChild(document.createTextNode(conciliacionesbancarias.getcredito_local().toString().trim()));
		element.appendChild(elementcredito_local);

		Element elementnumero_deposito = document.createElement(ConciliacionesBancariasConstantesFunciones.NUMERODEPOSITO);
		elementnumero_deposito.appendChild(document.createTextNode(conciliacionesbancarias.getnumero_deposito().trim()));
		element.appendChild(elementnumero_deposito);

		Element elementdebito_extran = document.createElement(ConciliacionesBancariasConstantesFunciones.DEBITOEXTRAN);
		elementdebito_extran.appendChild(document.createTextNode(conciliacionesbancarias.getdebito_extran().toString().trim()));
		element.appendChild(elementdebito_extran);

		Element elementcredito_extran = document.createElement(ConciliacionesBancariasConstantesFunciones.CREDITOEXTRAN);
		elementcredito_extran.appendChild(document.createTextNode(conciliacionesbancarias.getcredito_extran().toString().trim()));
		element.appendChild(elementcredito_extran);

		Element elementfecha = document.createElement(ConciliacionesBancariasConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(conciliacionesbancarias.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementdetalle = document.createElement(ConciliacionesBancariasConstantesFunciones.DETALLE);
		elementdetalle.appendChild(document.createTextNode(conciliacionesbancarias.getdetalle().trim()));
		element.appendChild(elementdetalle);

		Element elementbeneficiario = document.createElement(ConciliacionesBancariasConstantesFunciones.BENEFICIARIO);
		elementbeneficiario.appendChild(document.createTextNode(conciliacionesbancarias.getbeneficiario().trim()));
		element.appendChild(elementbeneficiario);
	}
	
	public void generarReporteGroupGenericoConciliacionesBancariassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ConciliacionesBancarias> conciliacionesbancariassSeleccionados=new ArrayList<ConciliacionesBancarias>();
		
		conciliacionesbancariassSeleccionados=this.getConciliacionesBancariassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoConciliacionesBancarias(conciliacionesbancariassSeleccionados);
		
		this.generarReporteConciliacionesBancariass("Todos",conciliacionesbancariassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoConciliacionesBancarias(ArrayList<ConciliacionesBancarias> conciliacionesbancariassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ConciliacionesBancarias conciliacionesbancariasAux:conciliacionesbancariassSeleccionados) {
				conciliacionesbancariasAux.setsDetalleGeneralEntityReporte(conciliacionesbancariasAux.toString());
			
				if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					conciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(conciliacionesbancariasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					conciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(conciliacionesbancariasAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_FECHADESDE)) {
					existe=true;
					conciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(conciliacionesbancariasAux.getfecha_desde()));
				}
				 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_FECHAHASTA)) {
					existe=true;
					conciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(conciliacionesbancariasAux.getfecha_hasta()));
				}
				 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR)) {
					existe=true;
					conciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(conciliacionesbancariasAux.getnumero_mayor());
				}
				 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA)) {
					existe=true;
					conciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(conciliacionesbancariasAux.getcodigo_cuenta());
				}
				 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA)) {
					existe=true;
					conciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(conciliacionesbancariasAux.getnombre_cuenta());
				}
				 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_NUMERODEPOSITO)) {
					existe=true;
					conciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(conciliacionesbancariasAux.getnumero_deposito());
				}
				 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					conciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(conciliacionesbancariasAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_DETALLE)) {
					existe=true;
					conciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(conciliacionesbancariasAux.getdetalle());
				}
				 else if(sTipoSeleccionar.equals(ConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO)) {
					existe=true;
					conciliacionesbancariasAux.setsDescripcionGeneralEntityReporte1(conciliacionesbancariasAux.getbeneficiario());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConciliacionesBancariasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesConciliacionesBancarias(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoConciliacionesBancarias=true;
				this.isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias=true;
				this.isVisibilidadCeldaGuardarCambiosConciliacionesBancarias=true;
			}
			
			this.isVisibilidadCeldaModificarConciliacionesBancarias=false;
			this.isVisibilidadCeldaActualizarConciliacionesBancarias=false;
			this.isVisibilidadCeldaEliminarConciliacionesBancarias=false;
			this.isVisibilidadCeldaCancelarConciliacionesBancarias=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConciliacionesBancarias=true;
				} else {
					this.isVisibilidadCeldaGuardarConciliacionesBancarias=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoConciliacionesBancarias=false;
			this.isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias=false;
			this.isVisibilidadCeldaGuardarCambiosConciliacionesBancarias=false;
			this.isVisibilidadCeldaModificarConciliacionesBancarias=false;
			this.isVisibilidadCeldaActualizarConciliacionesBancarias=true;
			this.isVisibilidadCeldaEliminarConciliacionesBancarias=false;
			this.isVisibilidadCeldaCancelarConciliacionesBancarias=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConciliacionesBancarias=true;
				} else {
					this.isVisibilidadCeldaGuardarConciliacionesBancarias=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoConciliacionesBancarias=false;
			this.isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias=false;
			this.isVisibilidadCeldaGuardarCambiosConciliacionesBancarias=false;
			this.isVisibilidadCeldaModificarConciliacionesBancarias=false;
			this.isVisibilidadCeldaActualizarConciliacionesBancarias=true;
			this.isVisibilidadCeldaEliminarConciliacionesBancarias=true;
			this.isVisibilidadCeldaCancelarConciliacionesBancarias=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConciliacionesBancarias=true;
				} else {
					this.isVisibilidadCeldaGuardarConciliacionesBancarias=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoConciliacionesBancarias=false;
			this.isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias=false;
			this.isVisibilidadCeldaGuardarCambiosConciliacionesBancarias=false;
			this.isVisibilidadCeldaModificarConciliacionesBancarias=false;
			this.isVisibilidadCeldaActualizarConciliacionesBancarias=true;
			this.isVisibilidadCeldaEliminarConciliacionesBancarias=false;
			this.isVisibilidadCeldaCancelarConciliacionesBancarias=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConciliacionesBancarias=false;
				} else {
					this.isVisibilidadCeldaGuardarConciliacionesBancarias=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoConciliacionesBancarias=true;
			this.isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias=true;
			this.isVisibilidadCeldaGuardarCambiosConciliacionesBancarias=true;
			this.isVisibilidadCeldaModificarConciliacionesBancarias=false;
			this.isVisibilidadCeldaActualizarConciliacionesBancarias=false;
			this.isVisibilidadCeldaEliminarConciliacionesBancarias=false;
			this.isVisibilidadCeldaCancelarConciliacionesBancarias=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConciliacionesBancarias=true;
				} else {
					this.isVisibilidadCeldaGuardarConciliacionesBancarias=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoConciliacionesBancarias=false;
			this.isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias=false;
			this.isVisibilidadCeldaGuardarCambiosConciliacionesBancarias=false;
			this.isVisibilidadCeldaActualizarConciliacionesBancarias=false;
			this.isVisibilidadCeldaEliminarConciliacionesBancarias=false;
			this.isVisibilidadCeldaCancelarConciliacionesBancarias=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConciliacionesBancarias=false;
				} else {
					this.isVisibilidadCeldaGuardarConciliacionesBancarias=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoConciliacionesBancarias=false;
			this.isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias=false;
			this.isVisibilidadCeldaGuardarCambiosConciliacionesBancarias=false;
			this.isVisibilidadCeldaModificarConciliacionesBancarias=true;
			this.isVisibilidadCeldaActualizarConciliacionesBancarias=false;
			this.isVisibilidadCeldaEliminarConciliacionesBancarias=false;
			this.isVisibilidadCeldaCancelarConciliacionesBancarias=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConciliacionesBancarias=false;
				} else {
					this.isVisibilidadCeldaGuardarConciliacionesBancarias=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ConciliacionesBancariasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoConciliacionesBancarias=true;
			this.isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias=true;
			this.isVisibilidadCeldaGuardarCambiosConciliacionesBancarias=true;
		} else {
			this.actualizarEstadoPanelsConciliacionesBancarias(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarConciliacionesBancarias=false;
			//this.isVisibilidadCeldaVerFormConciliacionesBancarias=false;
			this.isVisibilidadCeldaDuplicarConciliacionesBancarias=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!conciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias=false;
		} else {
			this.isVisibilidadCeldaNuevoConciliacionesBancarias=false;
			this.isVisibilidadCeldaGuardarCambiosConciliacionesBancarias=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
			if(!conciliacionesbancariasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias=false;												
			}
			
			this.jButtonCerrarConciliacionesBancarias.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias=false;
		}
		
		if(!this.permiteMantenimiento(this.conciliacionesbancarias)) {
			this.isVisibilidadCeldaActualizarConciliacionesBancarias=false;
			this.isVisibilidadCeldaEliminarConciliacionesBancarias=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoConciliacionesBancarias=false;
		this.isVisibilidadCeldaNuevoRelacionesConciliacionesBancarias=false;
		this.isVisibilidadCeldaGuardarCambiosConciliacionesBancarias=false;
		//this.isVisibilidadCeldaModificarConciliacionesBancarias=true;
		this.isVisibilidadCeldaActualizarConciliacionesBancarias=false;
		this.isVisibilidadCeldaEliminarConciliacionesBancarias=false;
		//this.isVisibilidadCeldaCancelarConciliacionesBancarias=true;			
		this.isVisibilidadCeldaGuardarConciliacionesBancarias=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesConciliacionesBancarias() {
	}
	
	public void actualizarEstadoPanelsConciliacionesBancarias(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionConciliacionesBancarias!=null) {
				this.jScrollPanelDatosEdicionConciliacionesBancarias.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConciliacionesBancarias!=null) {
				this.jTabbedPaneBusquedasConciliacionesBancarias.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConciliacionesBancarias!=null) {
				this.jScrollPanelDatosConciliacionesBancarias.setVisible(true);
			}
			
			if(this.jPanelPaginacionConciliacionesBancarias!=null) {
				this.jPanelPaginacionConciliacionesBancarias.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConciliacionesBancarias!=null) {
				this.jPanelParametrosReportesConciliacionesBancarias.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionConciliacionesBancarias!=null) {
				this.jScrollPanelDatosEdicionConciliacionesBancarias.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConciliacionesBancarias!=null) {
				this.jTabbedPaneBusquedasConciliacionesBancarias.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosConciliacionesBancarias!=null) {
				this.jScrollPanelDatosConciliacionesBancarias.setVisible(false);
			}
			
			if(this.jPanelPaginacionConciliacionesBancarias!=null) {
				this.jPanelPaginacionConciliacionesBancarias.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConciliacionesBancarias!=null) {
				this.jPanelParametrosReportesConciliacionesBancarias.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionConciliacionesBancarias!=null) {
				this.jScrollPanelDatosEdicionConciliacionesBancarias.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConciliacionesBancarias!=null) {
				this.jTabbedPaneBusquedasConciliacionesBancarias.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConciliacionesBancarias!=null) {
				this.jScrollPanelDatosConciliacionesBancarias.setVisible(false);
			}
			
			if(this.jPanelPaginacionConciliacionesBancarias!=null) {
				this.jPanelPaginacionConciliacionesBancarias.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConciliacionesBancarias!=null) {
				this.jPanelParametrosReportesConciliacionesBancarias.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionConciliacionesBancarias!=null) {
				this.jScrollPanelDatosEdicionConciliacionesBancarias.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConciliacionesBancarias!=null) {
				this.jTabbedPaneBusquedasConciliacionesBancarias.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConciliacionesBancarias!=null) {
				this.jScrollPanelDatosConciliacionesBancarias.setVisible(false);
			}
			
			if(this.jPanelPaginacionConciliacionesBancarias!=null) {
				this.jPanelPaginacionConciliacionesBancarias.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConciliacionesBancarias!=null) {
				this.jPanelParametrosReportesConciliacionesBancarias.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionConciliacionesBancarias!=null) {
				this.jScrollPanelDatosEdicionConciliacionesBancarias.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConciliacionesBancarias!=null) {
				this.jTabbedPaneBusquedasConciliacionesBancarias.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConciliacionesBancarias!=null) {
				this.jScrollPanelDatosConciliacionesBancarias.setVisible(true);
			}
			
			if(this.jPanelPaginacionConciliacionesBancarias!=null) {
				this.jPanelPaginacionConciliacionesBancarias.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConciliacionesBancarias!=null) {
				this.jPanelParametrosReportesConciliacionesBancarias.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionConciliacionesBancarias!=null) {
				this.jScrollPanelDatosEdicionConciliacionesBancarias.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConciliacionesBancarias!=null) {
				this.jTabbedPaneBusquedasConciliacionesBancarias.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConciliacionesBancarias!=null) {
				this.jScrollPanelDatosConciliacionesBancarias.setVisible(true);
			}
			
			if(this.jPanelPaginacionConciliacionesBancarias!=null) {
				this.jPanelPaginacionConciliacionesBancarias.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConciliacionesBancarias!=null) {
				this.jPanelParametrosReportesConciliacionesBancarias.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionConciliacionesBancarias!=null) {
				this.jScrollPanelDatosEdicionConciliacionesBancarias.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConciliacionesBancarias!=null) {
				this.jTabbedPaneBusquedasConciliacionesBancarias.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConciliacionesBancarias!=null) {
				this.jScrollPanelDatosConciliacionesBancarias.setVisible(true);
			}
			
			if(this.jPanelPaginacionConciliacionesBancarias!=null) {
				this.jPanelPaginacionConciliacionesBancarias.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConciliacionesBancarias!=null) {
				this.jPanelParametrosReportesConciliacionesBancarias.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasConciliacionesBancarias!=null) {
					this.jTabbedPaneBusquedasConciliacionesBancarias.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesConciliacionesBancarias!=null) {
				this.jPanelParametrosReportesConciliacionesBancarias.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConciliacionesBancarias!=null) {
				this.jTabbedPaneBusquedasConciliacionesBancarias.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesConciliacionesBancarias!=null) {
				this.jPanelParametrosReportesConciliacionesBancarias.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaConciliacionesBancarias=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaConciliacionesBancarias) {this.jTabbedPaneBusquedasConciliacionesBancarias.remove(jPanelBusquedaConciliacionesBancariasConciliacionesBancarias);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadBusquedaConciliacionesBancarias=isParaCuentaContable;
			if(!this.isVisibilidadBusquedaConciliacionesBancarias) {this.jTabbedPaneBusquedasConciliacionesBancarias.remove(jPanelBusquedaConciliacionesBancariasConciliacionesBancarias);}
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
			
			this.inicializarActualizarBindingTablaConciliacionesBancarias(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioConciliacionesBancarias() {
		this.updateBorderResaltarBusquedasFormularioConciliacionesBancarias();
		this.updateVisibilidadBusquedasFormularioConciliacionesBancarias();
		this.updateHabilitarBusquedasFormularioConciliacionesBancarias();
	}
	
	public void updateBorderResaltarBusquedasFormularioConciliacionesBancarias() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasConciliacionesBancarias.getComponents().length>0) {
	

		if(this.conciliacionesbancariasConstantesFunciones.resaltarBusquedaConciliacionesBancariasConciliacionesBancarias!=null) {
			index= this.jTabbedPaneBusquedasConciliacionesBancarias.indexOfComponent(this.jPanelBusquedaConciliacionesBancariasConciliacionesBancarias);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConciliacionesBancarias.getComponent(index);
				jPanel.setBorder(this.conciliacionesbancariasConstantesFunciones.resaltarBusquedaConciliacionesBancariasConciliacionesBancarias);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioConciliacionesBancarias() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasConciliacionesBancarias.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConciliacionesBancarias.indexOfComponent(this.jPanelBusquedaConciliacionesBancariasConciliacionesBancarias);
			jPanel=(JPanel)this.jTabbedPaneBusquedasConciliacionesBancarias.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarBusquedaConciliacionesBancariasConciliacionesBancarias);
			if(!this.conciliacionesbancariasConstantesFunciones.mostrarBusquedaConciliacionesBancariasConciliacionesBancarias && index>-1) {
				this.jTabbedPaneBusquedasConciliacionesBancarias.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioConciliacionesBancarias() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasConciliacionesBancarias.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConciliacionesBancarias.indexOfComponent(this.jPanelBusquedaConciliacionesBancariasConciliacionesBancarias);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasConciliacionesBancarias.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.conciliacionesbancariasConstantesFunciones.activarBusquedaConciliacionesBancariasConciliacionesBancarias);
				this.jTabbedPaneBusquedasConciliacionesBancarias.setEnabledAt(index,this.conciliacionesbancariasConstantesFunciones.activarBusquedaConciliacionesBancariasConciliacionesBancarias);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaConciliacionesBancarias(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaConciliacionesBancarias")) {
			index= this.jTabbedPaneBusquedasConciliacionesBancarias.indexOfComponent(this.jPanelBusquedaConciliacionesBancariasConciliacionesBancarias);

			this.jTabbedPaneBusquedasConciliacionesBancarias.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConciliacionesBancarias.getComponent(index);

			this.conciliacionesbancariasConstantesFunciones.setResaltarBusquedaConciliacionesBancariasConciliacionesBancarias(resaltar);

			jPanel.setBorder(this.conciliacionesbancariasConstantesFunciones.resaltarBusquedaConciliacionesBancariasConciliacionesBancarias);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarConciliacionesBancarias.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioConciliacionesBancarias() throws Exception {

		if(this.jInternalFrameDetalleFormConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioConciliacionesBancarias();
		this.updateVisibilidadResaltarControlesFormularioConciliacionesBancarias();
		this.updateHabilitarResaltarControlesFormularioConciliacionesBancarias();
		
	}
	
	public void updateBorderResaltarControlesFormularioConciliacionesBancarias() throws Exception {
		if(this.jInternalFrameDetalleFormConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.conciliacionesbancariasConstantesFunciones.resaltaridConciliacionesBancarias!=null && this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelidConciliacionesBancarias.setBorder(this.conciliacionesbancariasConstantesFunciones.resaltaridConciliacionesBancarias);}
		if(this.conciliacionesbancariasConstantesFunciones.resaltarid_empresaConciliacionesBancarias!=null && this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_empresaConciliacionesBancarias.setBorder(this.conciliacionesbancariasConstantesFunciones.resaltarid_empresaConciliacionesBancarias);}
		if(this.conciliacionesbancariasConstantesFunciones.resaltarid_cuenta_contableConciliacionesBancarias!=null && this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_cuenta_contableConciliacionesBancarias.setBorder(this.conciliacionesbancariasConstantesFunciones.resaltarid_cuenta_contableConciliacionesBancarias);}
		if(this.conciliacionesbancariasConstantesFunciones.resaltarfecha_desdeConciliacionesBancarias!=null && this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormConciliacionesBancarias.jDateChooserfecha_desdeConciliacionesBancarias.setBorder(this.conciliacionesbancariasConstantesFunciones.resaltarfecha_desdeConciliacionesBancarias);}
		if(this.conciliacionesbancariasConstantesFunciones.resaltarfecha_hastaConciliacionesBancarias!=null && this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormConciliacionesBancarias.jDateChooserfecha_hastaConciliacionesBancarias.setBorder(this.conciliacionesbancariasConstantesFunciones.resaltarfecha_hastaConciliacionesBancarias);}
		if(this.conciliacionesbancariasConstantesFunciones.resaltarnumero_mayorConciliacionesBancarias!=null && this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreanumero_mayorConciliacionesBancarias.setBorder(this.conciliacionesbancariasConstantesFunciones.resaltarnumero_mayorConciliacionesBancarias);}
		if(this.conciliacionesbancariasConstantesFunciones.resaltarcodigo_cuentaConciliacionesBancarias!=null && this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcodigo_cuentaConciliacionesBancarias.setBorder(this.conciliacionesbancariasConstantesFunciones.resaltarcodigo_cuentaConciliacionesBancarias);}
		if(this.conciliacionesbancariasConstantesFunciones.resaltarnombre_cuentaConciliacionesBancarias!=null && this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreanombre_cuentaConciliacionesBancarias.setBorder(this.conciliacionesbancariasConstantesFunciones.resaltarnombre_cuentaConciliacionesBancarias);}
		if(this.conciliacionesbancariasConstantesFunciones.resaltardebito_localConciliacionesBancarias!=null && this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFielddebito_localConciliacionesBancarias.setBorder(this.conciliacionesbancariasConstantesFunciones.resaltardebito_localConciliacionesBancarias);}
		if(this.conciliacionesbancariasConstantesFunciones.resaltarcredito_localConciliacionesBancarias!=null && this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcredito_localConciliacionesBancarias.setBorder(this.conciliacionesbancariasConstantesFunciones.resaltarcredito_localConciliacionesBancarias);}
		if(this.conciliacionesbancariasConstantesFunciones.resaltarnumero_depositoConciliacionesBancarias!=null && this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldnumero_depositoConciliacionesBancarias.setBorder(this.conciliacionesbancariasConstantesFunciones.resaltarnumero_depositoConciliacionesBancarias);}
		if(this.conciliacionesbancariasConstantesFunciones.resaltardebito_extranConciliacionesBancarias!=null && this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFielddebito_extranConciliacionesBancarias.setBorder(this.conciliacionesbancariasConstantesFunciones.resaltardebito_extranConciliacionesBancarias);}
		if(this.conciliacionesbancariasConstantesFunciones.resaltarcredito_extranConciliacionesBancarias!=null && this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcredito_extranConciliacionesBancarias.setBorder(this.conciliacionesbancariasConstantesFunciones.resaltarcredito_extranConciliacionesBancarias);}
		if(this.conciliacionesbancariasConstantesFunciones.resaltarfechaConciliacionesBancarias!=null && this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormConciliacionesBancarias.jDateChooserfechaConciliacionesBancarias.setBorder(this.conciliacionesbancariasConstantesFunciones.resaltarfechaConciliacionesBancarias);}
		if(this.conciliacionesbancariasConstantesFunciones.resaltardetalleConciliacionesBancarias!=null && this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreadetalleConciliacionesBancarias.setBorder(this.conciliacionesbancariasConstantesFunciones.resaltardetalleConciliacionesBancarias);}
		if(this.conciliacionesbancariasConstantesFunciones.resaltarbeneficiarioConciliacionesBancarias!=null && this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreabeneficiarioConciliacionesBancarias.setBorder(this.conciliacionesbancariasConstantesFunciones.resaltarbeneficiarioConciliacionesBancarias);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioConciliacionesBancarias() throws Exception {		
		if(this.jInternalFrameDetalleFormConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
	
		//this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelidConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostraridConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jPanelidConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostraridConciliacionesBancarias);
		//this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_empresaConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarid_empresaConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jPanelid_empresaConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarid_empresaConciliacionesBancarias);
		//this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_cuenta_contableConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarid_cuenta_contableConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jPanelid_cuenta_contableConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarid_cuenta_contableConciliacionesBancarias);
		//this.jInternalFrameDetalleFormConciliacionesBancarias.jDateChooserfecha_desdeConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarfecha_desdeConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jPanelfecha_desdeConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarfecha_desdeConciliacionesBancarias);
		//this.jInternalFrameDetalleFormConciliacionesBancarias.jDateChooserfecha_hastaConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarfecha_hastaConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jPanelfecha_hastaConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarfecha_hastaConciliacionesBancarias);
		//this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreanumero_mayorConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarnumero_mayorConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jPanelnumero_mayorConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarnumero_mayorConciliacionesBancarias);
		//this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcodigo_cuentaConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarcodigo_cuentaConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jPanelcodigo_cuentaConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarcodigo_cuentaConciliacionesBancarias);
		//this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreanombre_cuentaConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarnombre_cuentaConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jPanelnombre_cuentaConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarnombre_cuentaConciliacionesBancarias);
		//this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFielddebito_localConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrardebito_localConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jPaneldebito_localConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrardebito_localConciliacionesBancarias);
		//this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcredito_localConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarcredito_localConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jPanelcredito_localConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarcredito_localConciliacionesBancarias);
		//this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldnumero_depositoConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarnumero_depositoConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jPanelnumero_depositoConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarnumero_depositoConciliacionesBancarias);
		//this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFielddebito_extranConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrardebito_extranConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jPaneldebito_extranConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrardebito_extranConciliacionesBancarias);
		//this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcredito_extranConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarcredito_extranConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jPanelcredito_extranConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarcredito_extranConciliacionesBancarias);
		//this.jInternalFrameDetalleFormConciliacionesBancarias.jDateChooserfechaConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarfechaConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jPanelfechaConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarfechaConciliacionesBancarias);
		//this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreadetalleConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrardetalleConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jPaneldetalleConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrardetalleConciliacionesBancarias);
		//this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreabeneficiarioConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarbeneficiarioConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jPanelbeneficiarioConciliacionesBancarias.setVisible(this.conciliacionesbancariasConstantesFunciones.mostrarbeneficiarioConciliacionesBancarias);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioConciliacionesBancarias() throws Exception {
		if(this.jInternalFrameDetalleFormConciliacionesBancarias==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConciliacionesBancarias!=null) {
	
		this.jInternalFrameDetalleFormConciliacionesBancarias.jLabelidConciliacionesBancarias.setEnabled(this.conciliacionesbancariasConstantesFunciones.activaridConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_empresaConciliacionesBancarias.setEnabled(this.conciliacionesbancariasConstantesFunciones.activarid_empresaConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jComboBoxid_cuenta_contableConciliacionesBancarias.setEnabled(this.conciliacionesbancariasConstantesFunciones.activarid_cuenta_contableConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jDateChooserfecha_desdeConciliacionesBancarias.setEnabled(this.conciliacionesbancariasConstantesFunciones.activarfecha_desdeConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jDateChooserfecha_hastaConciliacionesBancarias.setEnabled(this.conciliacionesbancariasConstantesFunciones.activarfecha_hastaConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreanumero_mayorConciliacionesBancarias.setEnabled(this.conciliacionesbancariasConstantesFunciones.activarnumero_mayorConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcodigo_cuentaConciliacionesBancarias.setEnabled(this.conciliacionesbancariasConstantesFunciones.activarcodigo_cuentaConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreanombre_cuentaConciliacionesBancarias.setEnabled(this.conciliacionesbancariasConstantesFunciones.activarnombre_cuentaConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFielddebito_localConciliacionesBancarias.setEnabled(this.conciliacionesbancariasConstantesFunciones.activardebito_localConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcredito_localConciliacionesBancarias.setEnabled(this.conciliacionesbancariasConstantesFunciones.activarcredito_localConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldnumero_depositoConciliacionesBancarias.setEnabled(this.conciliacionesbancariasConstantesFunciones.activarnumero_depositoConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFielddebito_extranConciliacionesBancarias.setEnabled(this.conciliacionesbancariasConstantesFunciones.activardebito_extranConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jTextFieldcredito_extranConciliacionesBancarias.setEnabled(this.conciliacionesbancariasConstantesFunciones.activarcredito_extranConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jDateChooserfechaConciliacionesBancarias.setEnabled(this.conciliacionesbancariasConstantesFunciones.activarfechaConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreadetalleConciliacionesBancarias.setEnabled(this.conciliacionesbancariasConstantesFunciones.activardetalleConciliacionesBancarias);
		this.jInternalFrameDetalleFormConciliacionesBancarias.jTextAreabeneficiarioConciliacionesBancarias.setEnabled(this.conciliacionesbancariasConstantesFunciones.activarbeneficiarioConciliacionesBancarias);
		}
	}
	
		
}