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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;




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

import com.bydan.erp.contabilidad.util.ParametroPlanillaConstantesFunciones;
import com.bydan.erp.contabilidad.util.ParametroPlanillaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.ParametroPlanillaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.ParametroPlanillaBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
public class ParametroPlanillaBeanSwingJInternalFrame extends ParametroPlanillaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ParametroPlanillaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ParametroPlanilla> parametroplanillaValidator = new ClassValidator<ParametroPlanilla>(ParametroPlanilla.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ParametroPlanilla parametroplanilla;	
	public ParametroPlanilla parametroplanillaAux;
	public ParametroPlanilla parametroplanillaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ParametroPlanilla parametroplanillaTotales;
	public Long idParametroPlanillaActual;
	public Long iIdNuevoParametroPlanilla=0L;
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

	public String sFinalQueryComboCuentaContableInicial="";

	public List<CuentaContable> cuentacontableinicialsForeignKey;

	public List<CuentaContable> getcuentacontableinicialsForeignKey() {
		return cuentacontableinicialsForeignKey;
	}

	public void setcuentacontableinicialsForeignKey(List<CuentaContable> cuentacontableinicialsForeignKey) {
		this.cuentacontableinicialsForeignKey = cuentacontableinicialsForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontableinicialForeignKey;

	public CuentaContable getcuentacontableinicialForeignKey() {
		return cuentacontableinicialForeignKey;
	}

	public void setcuentacontableinicialForeignKey(CuentaContable cuentacontableinicialForeignKey) {
		this.cuentacontableinicialForeignKey = cuentacontableinicialForeignKey;
	}

	public String sFinalQueryComboCuentaContableFinal="";

	public List<CuentaContable> cuentacontablefinalsForeignKey;

	public List<CuentaContable> getcuentacontablefinalsForeignKey() {
		return cuentacontablefinalsForeignKey;
	}

	public void setcuentacontablefinalsForeignKey(List<CuentaContable> cuentacontablefinalsForeignKey) {
		this.cuentacontablefinalsForeignKey = cuentacontablefinalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontablefinalForeignKey;

	public CuentaContable getcuentacontablefinalForeignKey() {
		return cuentacontablefinalForeignKey;
	}

	public void setcuentacontablefinalForeignKey(CuentaContable cuentacontablefinalForeignKey) {
		this.cuentacontablefinalForeignKey = cuentacontablefinalForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idCuentaContableInicialActual=0L;

	public Long getidCuentaContableInicialActual() {
		return idCuentaContableInicialActual;
	}

	public void setidCuentaContableInicialActual(Long idCuentaContableInicialActual) {
		this.idCuentaContableInicialActual= idCuentaContableInicialActual;
	}
	public Long idCuentaContableFinalActual=0L;

	public Long getidCuentaContableFinalActual() {
		return idCuentaContableFinalActual;
	}

	public void setidCuentaContableFinalActual(Long idCuentaContableFinalActual) {
		this.idCuentaContableFinalActual= idCuentaContableFinalActual;
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
	
	public Boolean isPermisoTodoParametroPlanilla;
	public Boolean isPermisoNuevoParametroPlanilla;
	public Boolean isPermisoActualizarParametroPlanilla;
	public Boolean isPermisoActualizarOriginalParametroPlanilla;
	public Boolean isPermisoEliminarParametroPlanilla;
	public Boolean isPermisoGuardarCambiosParametroPlanilla;
	public Boolean isPermisoConsultaParametroPlanilla;
	public Boolean isPermisoBusquedaParametroPlanilla;
	public Boolean isPermisoReporteParametroPlanilla;
	public Boolean isPermisoPaginacionMedioParametroPlanilla;
	public Boolean isPermisoPaginacionAltoParametroPlanilla;
	public Boolean isPermisoPaginacionTodoParametroPlanilla;
	public Boolean isPermisoCopiarParametroPlanilla;
	public Boolean isPermisoVerFormParametroPlanilla;
	public Boolean isPermisoDuplicarParametroPlanilla;
	public Boolean isPermisoOrdenParametroPlanilla;
	
	
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
	
	public ParametroPlanillaParameterReturnGeneral parametroplanillaReturnGeneral;
	public ParametroPlanillaParameterReturnGeneral parametroplanillaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoParametroPlanilla=false;
	public Boolean esParaAccionDesdeFormularioParametroPlanilla=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ParametroPlanillaSessionBeanAdditional parametroplanillaSessionBeanAdditional=null;
	
	public ParametroPlanillaSessionBeanAdditional getParametroPlanillaSessionBeanAdditional() {
		return this.parametroplanillaSessionBeanAdditional;
	}
	
	public void setParametroPlanillaSessionBeanAdditional(ParametroPlanillaSessionBeanAdditional parametroplanillaSessionBeanAdditional) {
		try {
			this.parametroplanillaSessionBeanAdditional=parametroplanillaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ParametroPlanillaBeanSwingJInternalFrameAdditional parametroplanillaBeanSwingJInternalFrameAdditional=null;
	//public class ParametroPlanillaBeanSwingJInternalFrame
	
	public ParametroPlanillaBeanSwingJInternalFrameAdditional getParametroPlanillaBeanSwingJInternalFrameAdditional() {
		return this.parametroplanillaBeanSwingJInternalFrameAdditional;
	}
	
	public void setParametroPlanillaBeanSwingJInternalFrameAdditional(ParametroPlanillaBeanSwingJInternalFrameAdditional parametroplanillaBeanSwingJInternalFrameAdditional) {
		try {
			this.parametroplanillaBeanSwingJInternalFrameAdditional=parametroplanillaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ParametroPlanillaLogic parametroplanillaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ParametroPlanilla parametroplanillaBean;
	public ParametroPlanillaConstantesFunciones parametroplanillaConstantesFunciones;
	//public ParametroPlanillaParameterReturnGeneral parametroplanillaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public CuentaContableLogic cuentacontableinicialLogic;
	public CuentaContableLogic cuentacontablefinalLogic;
	
	//PARAMETROS
	
	
	//public List<ParametroPlanilla> parametroplanillas;	
	//public List<ParametroPlanilla> parametroplanillasEliminados;
	//public List<ParametroPlanilla> parametroplanillasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoParametroPlanilla=false;
	public Boolean isVisibilidadCeldaDuplicarParametroPlanilla=true;
	public Boolean isVisibilidadCeldaCopiarParametroPlanilla=true;
	public Boolean isVisibilidadCeldaVerFormParametroPlanilla=true;
	public Boolean isVisibilidadCeldaOrdenParametroPlanilla=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesParametroPlanilla=false;
	public Boolean isVisibilidadCeldaModificarParametroPlanilla=false;
	public Boolean isVisibilidadCeldaActualizarParametroPlanilla=false;
	public Boolean isVisibilidadCeldaEliminarParametroPlanilla=false;
	public Boolean isVisibilidadCeldaCancelarParametroPlanilla=false;
	public Boolean isVisibilidadCeldaGuardarParametroPlanilla=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosParametroPlanilla=false;	
	
	
	public Boolean isVisibilidadFK_IdCuentaContableFinal=false;
	public Boolean isVisibilidadFK_IdCuentaContableInicial=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoParametroPlanilla() {
		return this.iIdNuevoParametroPlanilla;
	}

	public void setiIdNuevoParametroPlanilla(Long iIdNuevoParametroPlanilla) {
		this.iIdNuevoParametroPlanilla = iIdNuevoParametroPlanilla;
	}
	
	public Long getidParametroPlanillaActual() {
		return this.idParametroPlanillaActual;
	}

	public void setidParametroPlanillaActual(Long idParametroPlanillaActual) {
		this.idParametroPlanillaActual = idParametroPlanillaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ParametroPlanilla getparametroplanilla() {
		return this.parametroplanilla;
	}

	public void setparametroplanilla(ParametroPlanilla parametroplanilla) {
		this.parametroplanilla = parametroplanilla;
	}
	
	public ParametroPlanilla getparametroplanillaAux() {
		return this.parametroplanillaAux;
	}

	public void setparametroplanillaAux(ParametroPlanilla parametroplanillaAux) {
		this.parametroplanillaAux = parametroplanillaAux;
	}				
	
	public ParametroPlanilla getparametroplanillaAnterior() {
		return this.parametroplanillaAnterior;
	}

	public void setparametroplanillaAnterior(ParametroPlanilla parametroplanillaAnterior) {
		this.parametroplanillaAnterior = parametroplanillaAnterior;
	}	
	
	public ParametroPlanilla getparametroplanillaTotales() {
		return this.parametroplanillaTotales;
	}

	public void setparametroplanillaTotales(ParametroPlanilla parametroplanillaTotales) {
		this.parametroplanillaTotales = parametroplanillaTotales;
	}	
	
	public ParametroPlanilla getparametroplanillaBean() {
		return this.parametroplanillaBean;
	}

	public void setparametroplanillaBean(ParametroPlanilla parametroplanillaBean) {
		this.parametroplanillaBean = parametroplanillaBean;
	}	
	
	public ParametroPlanillaParameterReturnGeneral getparametroplanillaReturnGeneral() {
		return this.parametroplanillaReturnGeneral;
	}

	public void setparametroplanillaReturnGeneral(ParametroPlanillaParameterReturnGeneral parametroplanillaReturnGeneral) {
		this.parametroplanillaReturnGeneral = parametroplanillaReturnGeneral;
	}	
	
	
	public Long id_cuenta_contable_finalFK_IdCuentaContableFinal=-1L;

	public Long getid_cuenta_contable_finalFK_IdCuentaContableFinal() {
		return this.id_cuenta_contable_finalFK_IdCuentaContableFinal;
	}

	public void setid_cuenta_contable_finalFK_IdCuentaContableFinal(Long id_cuenta_contable_finalFK_IdCuentaContableFinal) {
		this.id_cuenta_contable_finalFK_IdCuentaContableFinal = id_cuenta_contable_finalFK_IdCuentaContableFinal;
	}

	public Long id_cuenta_contable_inicialFK_IdCuentaContableInicial=-1L;

	public Long getid_cuenta_contable_inicialFK_IdCuentaContableInicial() {
		return this.id_cuenta_contable_inicialFK_IdCuentaContableInicial;
	}

	public void setid_cuenta_contable_inicialFK_IdCuentaContableInicial(Long id_cuenta_contable_inicialFK_IdCuentaContableInicial) {
		this.id_cuenta_contable_inicialFK_IdCuentaContableInicial = id_cuenta_contable_inicialFK_IdCuentaContableInicial;
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
	
	
	public ParametroPlanillaLogic getParametroPlanillaLogic()	{		
		return parametroplanillaLogic;
	}

	public void setParametroPlanillaLogic(ParametroPlanillaLogic parametroplanillaLogic) {
		this.parametroplanillaLogic = parametroplanillaLogic;
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
	
	public Boolean getIsEsNuevoParametroPlanilla() {
		return isEsNuevoParametroPlanilla;
	}

	public void setIsEsNuevoParametroPlanilla(Boolean isEsNuevoParametroPlanilla) {
		this.isEsNuevoParametroPlanilla = isEsNuevoParametroPlanilla;
	}

	public Boolean getEsParaAccionDesdeFormularioParametroPlanilla() {
		return esParaAccionDesdeFormularioParametroPlanilla;
	}
	
	public void setEsParaAccionDesdeFormularioParametroPlanilla(Boolean esParaAccionDesdeFormularioParametroPlanilla) {
		this.esParaAccionDesdeFormularioParametroPlanilla = esParaAccionDesdeFormularioParametroPlanilla;
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

			if(this.parametroplanillaSessionBean==null) {
				this.parametroplanillaSessionBean=new ParametroPlanillaSessionBean();
			}

			if(!this.parametroplanillaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(parametroplanillaSessionBean.getlidEmpresaActual());
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

	public void cargarCombosCuentaContableInicialsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontableinicialsForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.parametroplanillaSessionBean==null) {
				this.parametroplanillaSessionBean=new ParametroPlanillaSessionBean();
			}

			if(!this.parametroplanillaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableInicial()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontableinicialLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontableinicialsForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContableInicial(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(parametroplanillaSessionBean.getlidCuentaContableInicialActual());
					this.cuentacontableinicialsForeignKey.add(cuentacontableLogic.getCuentaContable());
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

	public void cargarCombosCuentaContableFinalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontablefinalsForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.parametroplanillaSessionBean==null) {
				this.parametroplanillaSessionBean=new ParametroPlanillaSessionBean();
			}

			if(!this.parametroplanillaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableFinal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontablefinalLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontablefinalsForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContableFinal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(parametroplanillaSessionBean.getlidCuentaContableFinalActual());
					this.cuentacontablefinalsForeignKey.add(cuentacontableLogic.getCuentaContable());
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

					if(this.parametroplanilla!=null) {
						this.parametroplanilla.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
						this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_empresaParametroPlanilla.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaParametroPlanilla.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
						if(this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_empresaParametroPlanilla.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_empresaParametroPlanilla.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaParametroPlanillaGenerico)throws Exception
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
				jComboBoxid_empresaParametroPlanillaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaParametroPlanillaGenerico!=null && jComboBoxid_empresaParametroPlanillaGenerico.getItemCount()>0) {
					jComboBoxid_empresaParametroPlanillaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableInicialForeignKey(Long idCuentaContableInicialSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableinicialTemp=null;

			for(CuentaContable cuentacontableinicialAux:cuentacontableinicialsForeignKey) {
				if(cuentacontableinicialAux.getId()!=null && cuentacontableinicialAux.getId().equals(idCuentaContableInicialSeleccionado)) {
					cuentacontableinicialTemp=cuentacontableinicialAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontableinicialTemp!=null) {

					if(this.parametroplanilla!=null) {
						this.parametroplanilla.setCuentaContableInicial(cuentacontableinicialTemp);
					}

					if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
						this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_inicialParametroPlanilla.setSelectedItem(cuentacontableinicialTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_inicialParametroPlanilla.setSelectedItem(cuentacontableinicialTemp);
					if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
						if(this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_inicialParametroPlanilla.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_inicialParametroPlanilla.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableInicial") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableinicialTemp!=null && jComboBoxid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla!=null) {
						jComboBoxid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla.setSelectedItem(cuentacontableinicialTemp);
					} else {
						if(jComboBoxid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla!=null) {
							//jComboBoxid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla.setSelectedItem(cuentacontableinicialTemp);
							if(jComboBoxid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla.getItemCount()>0) {
								jComboBoxid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla.setSelectedIndex(0);
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

	public String getActualCuentaContableInicialForeignKeyDescripcion(Long idCuentaContableInicialSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontableinicialTemp=null;

			for(CuentaContable cuentacontableinicialAux:cuentacontableinicialsForeignKey) {
				if(cuentacontableinicialAux.getId()!=null && cuentacontableinicialAux.getId().equals(idCuentaContableInicialSeleccionado)) {
					cuentacontableinicialTemp=cuentacontableinicialAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontableinicialTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableInicialForeignKeyGenerico(Long idCuentaContableInicialSeleccionado,JComboBox jComboBoxid_cuenta_contable_inicialParametroPlanillaGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableinicialTemp=null;

			for(CuentaContable cuentacontableinicialAux:cuentacontableinicialsForeignKey) {
				if(cuentacontableinicialAux.getId()!=null && cuentacontableinicialAux.getId().equals(idCuentaContableInicialSeleccionado)) {
					cuentacontableinicialTemp=cuentacontableinicialAux;
					break;
				}
			}

			if(cuentacontableinicialTemp!=null) {
				jComboBoxid_cuenta_contable_inicialParametroPlanillaGenerico.setSelectedItem(cuentacontableinicialTemp);
			} else {
				if(jComboBoxid_cuenta_contable_inicialParametroPlanillaGenerico!=null && jComboBoxid_cuenta_contable_inicialParametroPlanillaGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_inicialParametroPlanillaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableFinalForeignKey(Long idCuentaContableFinalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontablefinalTemp=null;

			for(CuentaContable cuentacontablefinalAux:cuentacontablefinalsForeignKey) {
				if(cuentacontablefinalAux.getId()!=null && cuentacontablefinalAux.getId().equals(idCuentaContableFinalSeleccionado)) {
					cuentacontablefinalTemp=cuentacontablefinalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontablefinalTemp!=null) {

					if(this.parametroplanilla!=null) {
						this.parametroplanilla.setCuentaContableFinal(cuentacontablefinalTemp);
					}

					if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
						this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_finalParametroPlanilla.setSelectedItem(cuentacontablefinalTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_finalParametroPlanilla.setSelectedItem(cuentacontablefinalTemp);
					if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
						if(this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_finalParametroPlanilla.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_finalParametroPlanilla.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableFinal") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontablefinalTemp!=null && jComboBoxid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla!=null) {
						jComboBoxid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla.setSelectedItem(cuentacontablefinalTemp);
					} else {
						if(jComboBoxid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla!=null) {
							//jComboBoxid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla.setSelectedItem(cuentacontablefinalTemp);
							if(jComboBoxid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla.getItemCount()>0) {
								jComboBoxid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla.setSelectedIndex(0);
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

	public String getActualCuentaContableFinalForeignKeyDescripcion(Long idCuentaContableFinalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontablefinalTemp=null;

			for(CuentaContable cuentacontablefinalAux:cuentacontablefinalsForeignKey) {
				if(cuentacontablefinalAux.getId()!=null && cuentacontablefinalAux.getId().equals(idCuentaContableFinalSeleccionado)) {
					cuentacontablefinalTemp=cuentacontablefinalAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontablefinalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableFinalForeignKeyGenerico(Long idCuentaContableFinalSeleccionado,JComboBox jComboBoxid_cuenta_contable_finalParametroPlanillaGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontablefinalTemp=null;

			for(CuentaContable cuentacontablefinalAux:cuentacontablefinalsForeignKey) {
				if(cuentacontablefinalAux.getId()!=null && cuentacontablefinalAux.getId().equals(idCuentaContableFinalSeleccionado)) {
					cuentacontablefinalTemp=cuentacontablefinalAux;
					break;
				}
			}

			if(cuentacontablefinalTemp!=null) {
				jComboBoxid_cuenta_contable_finalParametroPlanillaGenerico.setSelectedItem(cuentacontablefinalTemp);
			} else {
				if(jComboBoxid_cuenta_contable_finalParametroPlanillaGenerico!=null && jComboBoxid_cuenta_contable_finalParametroPlanillaGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_finalParametroPlanillaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ParametroPlanilla parametroplanilla,JComboBox jComboBoxid_empresaParametroPlanillaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaParametroPlanillaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_empresaParametroPlanilla.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaParametroPlanillaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				parametroplanilla.setid_empresa(empresaAux.getId());
				parametroplanilla.setempresa_descripcion(ParametroPlanillaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				parametroplanilla.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableInicialForeignKey(ParametroPlanilla parametroplanilla,JComboBox jComboBoxid_cuenta_contable_inicialParametroPlanillaGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_inicialParametroPlanillaGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_inicialParametroPlanilla.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_inicialParametroPlanillaGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				parametroplanilla.setid_cuenta_contable_inicial(cuentacontableAux.getId());
				parametroplanilla.setcuentacontableinicial_descripcion(ParametroPlanillaConstantesFunciones.getCuentaContableInicialDescripcion(cuentacontableAux));
				parametroplanilla.setCuentaContableInicial(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableFinalForeignKey(ParametroPlanilla parametroplanilla,JComboBox jComboBoxid_cuenta_contable_finalParametroPlanillaGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_finalParametroPlanillaGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_finalParametroPlanilla.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_finalParametroPlanillaGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				parametroplanilla.setid_cuenta_contable_final(cuentacontableAux.getId());
				parametroplanilla.setcuentacontablefinal_descripcion(ParametroPlanillaConstantesFunciones.getCuentaContableFinalDescripcion(cuentacontableAux));
				parametroplanilla.setCuentaContableFinal(cuentacontableAux);			}
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

					if(!ParametroPlanillaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { 
							this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_empresaParametroPlanilla.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_empresaParametroPlanilla.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { 
					}

					if(!ParametroPlanillaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContableInicialsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroPlanillaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { 
							this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_inicialParametroPlanilla.removeAllItems();

							for(CuentaContable cuentacontableinicial:this.cuentacontableinicialsForeignKey) {
								this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_inicialParametroPlanilla.addItem(cuentacontableinicial);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { 
					}

					if(!ParametroPlanillaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableInicial") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroPlanillaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla.removeAllItems();

							for(CuentaContable cuentacontableinicial:this.cuentacontableinicialsForeignKey) {
								this.jComboBoxid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla.addItem(cuentacontableinicial);
							}
						}

						if(!ParametroPlanillaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContableFinalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroPlanillaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { 
							this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_finalParametroPlanilla.removeAllItems();

							for(CuentaContable cuentacontablefinal:this.cuentacontablefinalsForeignKey) {
								this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_finalParametroPlanilla.addItem(cuentacontablefinal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { 
					}

					if(!ParametroPlanillaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableFinal") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroPlanillaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla.removeAllItems();

							for(CuentaContable cuentacontablefinal:this.cuentacontablefinalsForeignKey) {
								this.jComboBoxid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla.addItem(cuentacontablefinal);
							}
						}

						if(!ParametroPlanillaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
							this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_empresaParametroPlanilla.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
							this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_empresaParametroPlanilla.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCuentaContableInicialForeignKey(CuentaContable cuentacontableinicial,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
							this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_inicialParametroPlanilla.setSelectedItem(cuentacontableinicial);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
							this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_inicialParametroPlanilla.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla.setSelectedItem(cuentacontableinicial);
						} else {
							this.jComboBoxid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaContableFinalForeignKey(CuentaContable cuentacontablefinal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
							this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_finalParametroPlanilla.setSelectedItem(cuentacontablefinal);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
							this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_finalParametroPlanilla.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla.setSelectedItem(cuentacontablefinal);
						} else {
							this.jComboBoxid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesParametroPlanilla() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ParametroPlanillaConstantesFunciones.refrescarForeignKeysDescripcionesParametroPlanilla(this.parametroplanillaLogic.getParametroPlanillas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ParametroPlanillaConstantesFunciones.refrescarForeignKeysDescripcionesParametroPlanilla(this.parametroplanillas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(CuentaContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//parametroplanillaLogic.setParametroPlanillas(this.parametroplanillas);
			parametroplanillaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ParametroPlanillaParameterReturnGeneral getParametroPlanillaParameterGeneral() {
		return this.parametroplanillaParameterGeneral;
	}
	
	public void setParametroPlanillaParameterGeneral(ParametroPlanillaParameterReturnGeneral parametroplanillaParameterGeneral) {
		this.parametroplanillaParameterGeneral = parametroplanillaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoParametroPlanilla() {
		return isPermisoTodoParametroPlanilla;
	}

	public void setIsPermisoTodoParametroPlanilla(Boolean isPermisoTodoParametroPlanilla) {
		this.isPermisoTodoParametroPlanilla = isPermisoTodoParametroPlanilla;
	}

	public Boolean getIsPermisoNuevoParametroPlanilla() {
		return isPermisoNuevoParametroPlanilla;
	}

	public void setIsPermisoNuevoParametroPlanilla(Boolean isPermisoNuevoParametroPlanilla) {
		this.isPermisoNuevoParametroPlanilla = isPermisoNuevoParametroPlanilla;
	}

	public Boolean getIsPermisoActualizarParametroPlanilla() {
		return isPermisoActualizarParametroPlanilla;
	}

	public void setIsPermisoActualizarParametroPlanilla(Boolean isPermisoActualizarParametroPlanilla) {
		this.isPermisoActualizarParametroPlanilla = isPermisoActualizarParametroPlanilla;
	}

	public Boolean getIsPermisoEliminarParametroPlanilla() {
		return isPermisoEliminarParametroPlanilla;
	}

	public void setIsPermisoEliminarParametroPlanilla(Boolean isPermisoEliminarParametroPlanilla) {
		this.isPermisoEliminarParametroPlanilla = isPermisoEliminarParametroPlanilla;
	}

	public Boolean getIsPermisoGuardarCambiosParametroPlanilla() {
		return isPermisoGuardarCambiosParametroPlanilla;
	}

	public void setIsPermisoGuardarCambiosParametroPlanilla(Boolean isPermisoGuardarCambiosParametroPlanilla) {
		this.isPermisoGuardarCambiosParametroPlanilla = isPermisoGuardarCambiosParametroPlanilla;
	}
	
	public Boolean getIsPermisoConsultaParametroPlanilla() {
		return isPermisoConsultaParametroPlanilla;
	}

	public void setIsPermisoConsultaParametroPlanilla(Boolean isPermisoConsultaParametroPlanilla) {
		this.isPermisoConsultaParametroPlanilla = isPermisoConsultaParametroPlanilla;
	}

	public Boolean getIsPermisoBusquedaParametroPlanilla() {
		return isPermisoBusquedaParametroPlanilla;
	}

	public void setIsPermisoBusquedaParametroPlanilla(Boolean isPermisoBusquedaParametroPlanilla) {
		this.isPermisoBusquedaParametroPlanilla = isPermisoBusquedaParametroPlanilla;
	}

	public Boolean getIsPermisoReporteParametroPlanilla() {
		return isPermisoReporteParametroPlanilla;
	}

	public void setIsPermisoReporteParametroPlanilla(Boolean isPermisoReporteParametroPlanilla) {
		this.isPermisoReporteParametroPlanilla = isPermisoReporteParametroPlanilla;
	}
	
	public Boolean getIsPermisoPaginacionMedioParametroPlanilla() {
		return isPermisoPaginacionMedioParametroPlanilla;
	}

	public void setIsPermisoPaginacionMedioParametroPlanilla(Boolean isPermisoPaginacionMedioParametroPlanilla) {
		this.isPermisoPaginacionMedioParametroPlanilla = isPermisoPaginacionMedioParametroPlanilla;
	}
	
	public Boolean getIsPermisoPaginacionTodoParametroPlanilla() {
		return isPermisoPaginacionTodoParametroPlanilla;
	}

	public void setIsPermisoPaginacionTodoParametroPlanilla(Boolean isPermisoPaginacionTodoParametroPlanilla) {
		this.isPermisoPaginacionTodoParametroPlanilla = isPermisoPaginacionTodoParametroPlanilla;
	}
	
	public Boolean getIsPermisoPaginacionAltoParametroPlanilla() {
		return isPermisoPaginacionAltoParametroPlanilla;
	}

	public void setIsPermisoPaginacionAltoParametroPlanilla(Boolean isPermisoPaginacionAltoParametroPlanilla) {
		this.isPermisoPaginacionAltoParametroPlanilla = isPermisoPaginacionAltoParametroPlanilla;
	}
	
	public Boolean getIsPermisoCopiarParametroPlanilla() {
		return isPermisoCopiarParametroPlanilla;
	}

	public void setIsPermisoCopiarParametroPlanilla(Boolean isPermisoCopiarParametroPlanilla) {
		this.isPermisoCopiarParametroPlanilla = isPermisoCopiarParametroPlanilla;
	}
	
	public Boolean getIsPermisoVerFormParametroPlanilla() {
		return isPermisoVerFormParametroPlanilla;
	}

	public void setIsPermisoVerFormParametroPlanilla(Boolean isPermisoVerFormParametroPlanilla) {
		this.isPermisoVerFormParametroPlanilla = isPermisoVerFormParametroPlanilla;
	}
	
	public Boolean getIsPermisoDuplicarParametroPlanilla() {
		return isPermisoDuplicarParametroPlanilla;
	}

	public void setIsPermisoDuplicarParametroPlanilla(Boolean isPermisoDuplicarParametroPlanilla) {
		this.isPermisoDuplicarParametroPlanilla = isPermisoDuplicarParametroPlanilla;
	}
	
	public Boolean getIsPermisoOrdenParametroPlanilla() {
		return isPermisoOrdenParametroPlanilla;
	}

	public void setIsPermisoOrdenParametroPlanilla(Boolean isPermisoOrdenParametroPlanilla) {
		this.isPermisoOrdenParametroPlanilla = isPermisoOrdenParametroPlanilla;
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
	
	public Boolean getIsVisibilidadCeldaNuevoParametroPlanilla() {
		return isVisibilidadCeldaNuevoParametroPlanilla;
	}

	public void setIsVisibilidadCeldaNuevoParametroPlanilla(Boolean isVisibilidadCeldaNuevoParametroPlanilla) {
		this.isVisibilidadCeldaNuevoParametroPlanilla = isVisibilidadCeldaNuevoParametroPlanilla;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarParametroPlanilla() {
		return isVisibilidadCeldaDuplicarParametroPlanilla;
	}

	public void setIsVisibilidadCeldaDuplicarParametroPlanilla(Boolean isVisibilidadCeldaDuplicarParametroPlanilla) {
		this.isVisibilidadCeldaDuplicarParametroPlanilla = isVisibilidadCeldaDuplicarParametroPlanilla;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarParametroPlanilla() {
		return isVisibilidadCeldaCopiarParametroPlanilla;
	}

	public void setIsVisibilidadCeldaCopiarParametroPlanilla(Boolean isVisibilidadCeldaCopiarParametroPlanilla) {
		this.isVisibilidadCeldaCopiarParametroPlanilla = isVisibilidadCeldaCopiarParametroPlanilla;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormParametroPlanilla() {
		return isVisibilidadCeldaVerFormParametroPlanilla;
	}

	public void setIsVisibilidadCeldaVerFormParametroPlanilla(Boolean isVisibilidadCeldaVerFormParametroPlanilla) {
		this.isVisibilidadCeldaVerFormParametroPlanilla = isVisibilidadCeldaVerFormParametroPlanilla;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenParametroPlanilla() {
		return isVisibilidadCeldaOrdenParametroPlanilla;
	}

	public void setIsVisibilidadCeldaOrdenParametroPlanilla(Boolean isVisibilidadCeldaOrdenParametroPlanilla) {
		this.isVisibilidadCeldaOrdenParametroPlanilla = isVisibilidadCeldaOrdenParametroPlanilla;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesParametroPlanilla() {
		return isVisibilidadCeldaNuevoRelacionesParametroPlanilla;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesParametroPlanilla(Boolean isVisibilidadCeldaNuevoRelacionesParametroPlanilla) {
		this.isVisibilidadCeldaNuevoRelacionesParametroPlanilla = isVisibilidadCeldaNuevoRelacionesParametroPlanilla;
	}
	
	public Boolean getIsVisibilidadCeldaModificarParametroPlanilla() {
		return isVisibilidadCeldaModificarParametroPlanilla;
	}

	public void setIsVisibilidadCeldaModificarParametroPlanilla(Boolean isVisibilidadCeldaModificarParametroPlanilla) {
		this.isVisibilidadCeldaModificarParametroPlanilla = isVisibilidadCeldaModificarParametroPlanilla;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarParametroPlanilla() {
		return isVisibilidadCeldaActualizarParametroPlanilla;
	}

	public void setIsVisibilidadCeldaActualizarParametroPlanilla(Boolean isVisibilidadCeldaActualizarParametroPlanilla) {
		this.isVisibilidadCeldaActualizarParametroPlanilla = isVisibilidadCeldaActualizarParametroPlanilla;
	}

	public Boolean getIsVisibilidadCeldaEliminarParametroPlanilla() {
		return isVisibilidadCeldaEliminarParametroPlanilla;
	}

	public void setIsVisibilidadCeldaEliminarParametroPlanilla(Boolean isVisibilidadCeldaEliminarParametroPlanilla) {
		this.isVisibilidadCeldaEliminarParametroPlanilla = isVisibilidadCeldaEliminarParametroPlanilla;
	}

	public Boolean getIsVisibilidadCeldaCancelarParametroPlanilla() {
		return isVisibilidadCeldaCancelarParametroPlanilla;
	}

	public void setIsVisibilidadCeldaCancelarParametroPlanilla(Boolean isVisibilidadCeldaCancelarParametroPlanilla) {
		this.isVisibilidadCeldaCancelarParametroPlanilla = isVisibilidadCeldaCancelarParametroPlanilla;
	}

	public Boolean getIsVisibilidadCeldaGuardarParametroPlanilla() {
		return isVisibilidadCeldaGuardarParametroPlanilla;
	}

	public void setIsVisibilidadCeldaGuardarParametroPlanilla(Boolean isVisibilidadCeldaGuardarParametroPlanilla) {
		this.isVisibilidadCeldaGuardarParametroPlanilla = isVisibilidadCeldaGuardarParametroPlanilla;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosParametroPlanilla() {
		return isVisibilidadCeldaGuardarCambiosParametroPlanilla;
	}

	public void setIsVisibilidadCeldaGuardarCambiosParametroPlanilla(Boolean isVisibilidadCeldaGuardarCambiosParametroPlanilla) {
		this.isVisibilidadCeldaGuardarCambiosParametroPlanilla = isVisibilidadCeldaGuardarCambiosParametroPlanilla;
	}
		
	public ParametroPlanillaSessionBean getparametroplanillaSessionBean() {
		return this.parametroplanillaSessionBean;
	}
	
	public void setparametroplanillaSessionBean(ParametroPlanillaSessionBean parametroplanillaSessionBean) {
		this.parametroplanillaSessionBean=parametroplanillaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCuentaContableFinal() {
		return this.isVisibilidadFK_IdCuentaContableFinal;
	}

	public void setisVisibilidadFK_IdCuentaContableFinal(Boolean isVisibilidadFK_IdCuentaContableFinal) {
		this.isVisibilidadFK_IdCuentaContableFinal=isVisibilidadFK_IdCuentaContableFinal;
	}

	public Boolean getisVisibilidadFK_IdCuentaContableInicial() {
		return this.isVisibilidadFK_IdCuentaContableInicial;
	}

	public void setisVisibilidadFK_IdCuentaContableInicial(Boolean isVisibilidadFK_IdCuentaContableInicial) {
		this.isVisibilidadFK_IdCuentaContableInicial=isVisibilidadFK_IdCuentaContableInicial;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysParametroPlanilla(ParametroPlanilla parametroplanilla)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(parametroplanilla,null);
				this.setActualParaGuardarCuentaContableInicialForeignKey(parametroplanilla,null);
				this.setActualParaGuardarCuentaContableFinalForeignKey(parametroplanilla,null);
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
	
	public void bugActualizarReferenciaActual(ParametroPlanilla parametroplanilla,ParametroPlanilla parametroplanillaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalParametroPlanilla(parametroplanilla);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		parametroplanillaAux.setId(parametroplanilla.getId());
		parametroplanillaAux.setVersionRow(parametroplanilla.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessParametroPlanilla();
		
			int intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanilla =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.parametroplanilla =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ParametroPlanillaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualParametroPlanilla(this.parametroplanilla,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysParametroPlanilla(this.parametroplanilla);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = parametroplanillaValidator.getInvalidValues(this.parametroplanilla);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			parametroplanillaLogic.setDatosCliente(datosCliente);
			parametroplanillaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				parametroplanillaAux=new  ParametroPlanilla();
				
				parametroplanillaAux.setIsNew(true);
				parametroplanillaAux.setIsChanged(true);
				
				parametroplanillaAux.setParametroPlanillaOriginal(this.parametroplanilla);
				
				parametroplanillaAux.setId(this.parametroplanilla.getId());	
				parametroplanillaAux.setVersionRow(this.parametroplanilla.getVersionRow());	
				parametroplanillaAux.setid_empresa(this.parametroplanilla.getid_empresa());	
				parametroplanillaAux.setid_cuenta_contable_inicial(this.parametroplanilla.getid_cuenta_contable_inicial());	
				parametroplanillaAux.setid_cuenta_contable_final(this.parametroplanilla.getid_cuenta_contable_final());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametroplanillaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametroplanillaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(parametroplanillaAux,parametroplanillaLogic.getParametroPlanillas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametroplanillaAux,parametroplanillas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.parametroplanillaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametroplanillaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroplanillaLogic.saveParametroPlanillas();//WithConnection
						//parametroplanillaLogic.getSetVersionRowParametroPlanillas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametroplanilla,parametroplanillaAux);
					
					this.refrescarForeignKeysDescripcionesParametroPlanilla();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametroplanillaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametroplanillaLogic.saveParametroPlanillaRelaciones(parametroplanillaAux);//WithConnection
								//parametroplanillaLogic.getSetVersionRowParametroPlanillas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametroplanilla,parametroplanillaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametroplanillaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametroplanillaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametroplanillaAux,parametroplanillaLogic.getParametroPlanillas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametroplanillaAux,parametroplanillas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametroplanilla,parametroplanillaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				parametroplanillaAux=new  ParametroPlanilla();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado() 
					|| (this.parametroplanillaSessionBean.getEsGuardarRelacionado() && this.parametroplanilla.getId()>=0)) {
						
					parametroplanillaAux.setIsNew(false);
				}
				
				parametroplanillaAux.setIsDeleted(false);
			
				parametroplanillaAux.setId(this.parametroplanilla.getId());	
				parametroplanillaAux.setVersionRow(this.parametroplanilla.getVersionRow());	
				parametroplanillaAux.setid_empresa(this.parametroplanilla.getid_empresa());	
				parametroplanillaAux.setid_cuenta_contable_inicial(this.parametroplanilla.getid_cuenta_contable_inicial());	
				parametroplanillaAux.setid_cuenta_contable_final(this.parametroplanilla.getid_cuenta_contable_final());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametroplanillaAux,parametroplanillaLogic.getParametroPlanillas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametroplanillaAux,parametroplanillas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.parametroplanillaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametroplanillaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroplanillaLogic.saveParametroPlanillas();//WithConnection
						//parametroplanillaLogic.getSetVersionRowParametroPlanillas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametroplanilla,parametroplanillaAux);
					
					this.refrescarForeignKeysDescripcionesParametroPlanilla();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametroplanillaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametroplanillaLogic.saveParametroPlanillaRelaciones(parametroplanillaAux);//WithConnection
								//parametroplanillaLogic.getSetVersionRowParametroPlanillas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametroplanilla,parametroplanillaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametroplanillaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametroplanillaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametroplanillaAux,parametroplanillaLogic.getParametroPlanillas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametroplanillaAux,parametroplanillas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametroplanilla,parametroplanillaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				parametroplanillaAux=new  ParametroPlanilla();
				
				parametroplanillaAux.setIsNew(false);
				parametroplanillaAux.setIsChanged(false);
				
				parametroplanillaAux.setIsDeleted(true);
				
				parametroplanillaAux.setId(this.parametroplanilla.getId());	
				parametroplanillaAux.setVersionRow(this.parametroplanilla.getVersionRow());	
				parametroplanillaAux.setid_empresa(this.parametroplanilla.getid_empresa());	
				parametroplanillaAux.setid_cuenta_contable_inicial(this.parametroplanilla.getid_cuenta_contable_inicial());	
				parametroplanillaAux.setid_cuenta_contable_final(this.parametroplanilla.getid_cuenta_contable_final());	
				
				if(this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.parametroplanillaAux.getId()>=0) {	
						this.parametroplanillasEliminados.add(parametroplanillaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(parametroplanillaAux,parametroplanillaLogic.getParametroPlanillas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametroplanillaAux,parametroplanillas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.parametroplanillaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametroplanillaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroplanillaLogic.saveParametroPlanillas();//WithConnection
						//parametroplanillaLogic.getSetVersionRowParametroPlanillas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametroplanillaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametroplanillaLogic.saveParametroPlanillaRelaciones(parametroplanillaAux);//WithConnection
								//parametroplanillaLogic.getSetVersionRowParametroPlanillas();//WithConnection
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
							if(this.parametroplanillaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.parametroplanillaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(parametroplanillaAux,parametroplanillaLogic.getParametroPlanillas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(parametroplanillaAux,parametroplanillas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanillaLogic.getParametroPlanillas().addAll(this.parametroplanillasEliminados);
					
					parametroplanillaLogic.saveParametroPlanillas();//WithConnection
					//parametroplanillaLogic.getSetVersionRowParametroPlanillas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesParametroPlanilla();
				
				this.parametroplanillasEliminados= new ArrayList<ParametroPlanilla>();		
			}
			
			if(this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Parametro Planilla GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Planilla",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.parametroplanilla=parametroplanillaAux;
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
      		//this.finishProcessParametroPlanilla();
      	}
		
	}	
	
	public void actualizarRelaciones(ParametroPlanilla parametroplanillaLocal) throws Exception {
		
		if(this.parametroplanillaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ParametroPlanilla parametroplanillaLocal) throws Exception {	
		if(this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				parametroplanillaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableinicialBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableinicialBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableinicialBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableinicialBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableinicialBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontableinicialsForeignKey);

				cuentacontableinicialBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableinicialBeanSwingJInternalFrameLocal.cuentacontable);

				parametroplanillaLocal.setCuentaContableInicial(cuentacontableinicialBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableInicial();
				this.cargarCombosFrameCuentaContableInicialsForeignKey("Formulario");
				this.setActualCuentaContableInicialForeignKey(cuentacontableinicialBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontablefinalBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontablefinalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontablefinalBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontablefinalBeanSwingJInternalFrameLocal.actualizarLista(cuentacontablefinalBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablefinalsForeignKey);

				cuentacontablefinalBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontablefinalBeanSwingJInternalFrameLocal.cuentacontable);

				parametroplanillaLocal.setCuentaContableFinal(cuentacontablefinalBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableFinal();
				this.cargarCombosFrameCuentaContableFinalsForeignKey("Formulario");
				this.setActualCuentaContableFinalForeignKey(cuentacontablefinalBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarParametroPlanillaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametroplanilla =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.parametroplanilla =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = parametroplanillaValidator.getInvalidValues(this.parametroplanilla);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ParametroPlanilla parametroplanilla,List<ParametroPlanilla> parametroplanillas) throws Exception {
		try	{		
			ParametroPlanillaConstantesFunciones.actualizarLista(parametroplanilla,parametroplanillas,this.parametroplanillaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ParametroPlanilla parametroplanilla,List<ParametroPlanilla> parametroplanillas) throws Exception {
		try	{			
			ParametroPlanillaConstantesFunciones.actualizarSelectedLista(parametroplanilla,parametroplanillas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ParametroPlanilla> parametroplanillasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				parametroplanillasLocal=this.parametroplanillaLogic.getParametroPlanillas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				parametroplanillasLocal=this.parametroplanillas;
			}
			//ARCHITECTURE
		
			for(ParametroPlanilla parametroplanillaLocal:parametroplanillasLocal) {
				if(this.permiteMantenimiento(parametroplanillaLocal) && parametroplanillaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ParametroPlanillaConstantesFunciones.getParametroPlanillaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ParametroPlanillaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroPlanilla.jLabelid_empresaParametroPlanilla,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroPlanillaConstantesFunciones.IDCUENTACONTABLEINICIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroPlanilla.jLabelid_cuenta_contable_inicialParametroPlanilla,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroPlanillaConstantesFunciones.IDCUENTACONTABLEFINAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroPlanilla.jLabelid_cuenta_contable_finalParametroPlanilla,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroPlanilla.jLabelid_empresaParametroPlanilla,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroPlanilla.jLabelid_cuenta_contable_inicialParametroPlanilla,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroPlanilla.jLabelid_cuenta_contable_finalParametroPlanilla,"");
		
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
		this.iIdNuevoParametroPlanilla--;	
		
		
		this.parametroplanillaAux=new ParametroPlanilla();
		
		this.parametroplanillaAux.setId(this.iIdNuevoParametroPlanilla);
		this.parametroplanillaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametroplanillaLogic.getParametroPlanillas().add(this.parametroplanillaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.parametroplanillas.add(this.parametroplanillaAux);
		}
		//ARCHITECTURE
		
		this.parametroplanilla=this.parametroplanillaAux;
		
		if(ParametroPlanillaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioParametroPlanilla(this.parametroplanilla);
			this.setVariablesObjetoActualToFormularioForeignKeyParametroPlanilla(this.parametroplanilla);
		}
				
		//this.setDefaultControlesParametroPlanilla();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyParametroPlanilla();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyParametroPlanilla();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroPlanilla();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroPlanilla(this.parametroplanillaBean,this.parametroplanilla,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysParametroPlanilla(this.parametroplanilla);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ParametroPlanillaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.parametroplanillaSessionBean.getConGuardarRelaciones()) {
			classes=ParametroPlanillaConstantesFunciones.getClassesRelationshipsOfParametroPlanilla(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.parametroplanillaReturnGeneral=parametroplanillaLogic.procesarEventosParametroPlanillasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametroplanillaLogic.getParametroPlanillas(),this.parametroplanilla,this.parametroplanillaParameterGeneral,this.isEsNuevoParametroPlanilla,classes);//this.parametroplanillaLogic.getParametroPlanilla()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanParametroPlanilla(this.parametroplanillaReturnGeneral,this.parametroplanillaBean,false);
		
		if(this.parametroplanillaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyParametroPlanilla(this.parametroplanillaReturnGeneral.getParametroPlanilla());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioParametroPlanilla(this.parametroplanillaReturnGeneral.getParametroPlanilla());
		}
		
		if(this.parametroplanillaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioParametroPlanilla(this.parametroplanillaReturnGeneral.getParametroPlanilla(),classes);//this.parametroplanillaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualParametroPlanilla(this.parametroplanilla,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyParametroPlanilla();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyParametroPlanilla();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroPlanillaBeanSwingJInternalFrameAdditional.RecargarFormParametroPlanilla(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingParametroPlanilla(false);
						
			if(parametroplanillaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ParametroPlanillaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroPlanilla();
			}
			
			this.actualizarVisualTableDatosParametroPlanilla();
			
			this.jTableDatosParametroPlanilla.setRowSelectionInterval(this.getIndiceNuevoParametroPlanilla(), this.getIndiceNuevoParametroPlanilla());
			
			this.seleccionarFilaTablaParametroPlanillaActual();
						
			this.actualizarEstadoCeldasBotonesParametroPlanilla("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesParametroPlanilla(Boolean isHabilitar) throws Exception {
			
		//
		this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_empresaParametroPlanilla.setEnabled(isHabilitar && this.parametroplanillaConstantesFunciones.activarid_empresaParametroPlanilla);
		this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_inicialParametroPlanilla.setEnabled(isHabilitar && this.parametroplanillaConstantesFunciones.activarid_cuenta_contable_inicialParametroPlanilla);
		this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_finalParametroPlanilla.setEnabled(isHabilitar && this.parametroplanillaConstantesFunciones.activarid_cuenta_contable_finalParametroPlanilla);
	};
	
	public void setDefaultControlesParametroPlanilla() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoParametroPlanilla(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.parametroplanillaSessionBean.setConGuardarRelaciones(true);			
			this.parametroplanillaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormParametroPlanilla.jTabbedPaneRelacionesParametroPlanilla.setVisible(true);
			
					
		} else {
			//this.parametroplanillaSessionBean.setConGuardarRelaciones(false);			
			this.parametroplanillaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormParametroPlanilla.jTabbedPaneRelacionesParametroPlanilla.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoParametroPlanilla() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroPlanilla parametroplanillaAux:this.parametroplanillaLogic.getParametroPlanillas()) {
				if(parametroplanillaAux.getId().equals(this.iIdNuevoParametroPlanilla)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroPlanilla parametroplanillaAux:this.parametroplanillas) {
				if(parametroplanillaAux.getId().equals(this.iIdNuevoParametroPlanilla)) {
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
	
	public int getIndiceActualParametroPlanilla(ParametroPlanilla parametroplanilla,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroPlanilla parametroplanillaAux:this.parametroplanillaLogic.getParametroPlanillas()) {
				if(parametroplanillaAux.getId().equals(parametroplanilla.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroPlanilla parametroplanillaAux:this.parametroplanillas) {
				if(parametroplanillaAux.getId().equals(parametroplanilla.getId())) {
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
	
	public void setCamposBaseDesdeOriginalParametroPlanilla(ParametroPlanilla parametroplanillaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroPlanilla parametroplanillaAux:this.parametroplanillaLogic.getParametroPlanillas()) {
				if(parametroplanillaAux.getParametroPlanillaOriginal().getId().equals(parametroplanillaOriginal.getId())) {
					existe=true;
					parametroplanillaOriginal.setId(parametroplanillaAux.getId());
					parametroplanillaOriginal.setVersionRow(parametroplanillaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroPlanilla parametroplanillaAux:this.parametroplanillas) {
				if(parametroplanillaAux.getParametroPlanillaOriginal().getId().equals(parametroplanillaOriginal.getId())) {
					existe=true;
					parametroplanillaOriginal.setId(parametroplanillaAux.getId());
					parametroplanillaOriginal.setVersionRow(parametroplanillaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosParametroPlanilla(Boolean esParaCancelar) throws Exception {
		parametroplanillasAux=new ArrayList<ParametroPlanilla>();
		parametroplanillaAux=new ParametroPlanilla();
		
		if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroPlanilla parametroplanillaAux:this.parametroplanillaLogic.getParametroPlanillas()) {
					if(parametroplanillaAux.getId()<0) {
						parametroplanillasAux.add(parametroplanillaAux);
					}		
				}
				this.iIdNuevoParametroPlanilla=0L;
				this.parametroplanillaLogic.getParametroPlanillas().removeAll(parametroplanillasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroPlanilla parametroplanillaAux:this.parametroplanillas) {
					if(parametroplanillaAux.getId()<0) {
						parametroplanillasAux.add(parametroplanillaAux);
					}		
				}
				this.iIdNuevoParametroPlanilla=0L;
				this.parametroplanillas.removeAll(parametroplanillasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoParametroPlanilla 
					&& this.parametroplanillaLogic.getParametroPlanillas().size()>0
					) {
					parametroplanillaAux=this.parametroplanillaLogic.getParametroPlanillas().get(this.parametroplanillaLogic.getParametroPlanillas().size() - 1);
				
					if(parametroplanillaAux.getId()<0) {
						this.parametroplanillaLogic.getParametroPlanillas().remove(parametroplanillaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoParametroPlanilla && this.parametroplanillas.size()>0) {
					parametroplanillaAux=this.parametroplanillas.get(this.parametroplanillas.size() - 1);
				
					if(parametroplanillaAux.getId()<0) {
						this.parametroplanillas.remove(parametroplanillaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoParametroPlanilla(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(parametroplanilla.getId()<0) {
				this.parametroplanillaLogic.getParametroPlanillas().remove(this.parametroplanilla);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(parametroplanilla.getId()<0) {
				this.parametroplanillas.remove(this.parametroplanilla);
			}
		}			
	}
	
	public void setEstadosInicialesParametroPlanilla(List<ParametroPlanilla> parametroplanillasAux) throws Exception {
		ParametroPlanillaConstantesFunciones.setEstadosInicialesParametroPlanilla(parametroplanillasAux);
	}
	
	public void setEstadosInicialesParametroPlanilla(ParametroPlanilla parametroplanillaAux) throws Exception {
		ParametroPlanillaConstantesFunciones.setEstadosInicialesParametroPlanilla(parametroplanillaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarParametroPlanillaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesParametroPlanilla("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarParametroPlanillaActual()) {
				if(!this.isEsNuevoParametroPlanilla) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesParametroPlanilla("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoParametroPlanilla=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarParametroPlanillaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Parametro Planilla ?", "MANTENIMIENTO DE Parametro Planilla", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesParametroPlanilla("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ParametroPlanilla parametroplanilla) throws Exception {
		ParametroPlanillaConstantesFunciones.seleccionarAsignar(this.parametroplanilla,parametroplanilla);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarParametroPlanilla=this.isPermisoActualizarOriginalParametroPlanilla;
			
			
			this.seleccionarAsignar(parametroplanilla);
			
			

			idCuentaContableInicialActual=parametroplanilla.getid_cuenta_contable_inicial();
			this.seleccionarCuentaContableInicialActual();

			idCuentaContableFinalActual=parametroplanilla.getid_cuenta_contable_final();
			this.seleccionarCuentaContableFinalActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroPlanillaConstantesFunciones.quitarEspaciosParametroPlanilla(this.parametroplanilla,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesParametroPlanilla("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.parametroplanillaSessionBean.setsFuncionBusquedaRapida(this.parametroplanillaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarCuentaContableInicialActual() throws Exception {
		try	{
			CuentaContable cuentacontableinicialAux=new CuentaContable();

			if(this.idCuentaContableInicialActual != null && this.idCuentaContableInicialActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableinicialLogic.getEntityWithConnection(this.idCuentaContableInicialActual);
					cuentacontableinicialAux= cuentacontableinicialLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontableinicialsForeignKey=new ArrayList<CuentaContable>();
				cuentacontableinicialsForeignKey.add(cuentacontableinicialAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	public void seleccionarCuentaContableFinalActual() throws Exception {
		try	{
			CuentaContable cuentacontablefinalAux=new CuentaContable();

			if(this.idCuentaContableFinalActual != null && this.idCuentaContableFinalActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontablefinalLogic.getEntityWithConnection(this.idCuentaContableFinalActual);
					cuentacontablefinalAux= cuentacontablefinalLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontablefinalsForeignKey=new ArrayList<CuentaContable>();
				cuentacontablefinalsForeignKey.add(cuentacontablefinalAux);
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
			if(this.isEsNuevoParametroPlanilla) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosParametroPlanilla(esParaCancelar);				
				this.cancelarNuevoParametroPlanilla(esParaCancelar);								
			}
			
			this.parametroplanilla=new ParametroPlanilla();
			
			this.inicializarParametroPlanilla();
			
			this.actualizarEstadoCeldasBotonesParametroPlanilla("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarParametroPlanilla() throws Exception {
		try {
			ParametroPlanillaConstantesFunciones.inicializarParametroPlanilla(this.parametroplanilla);
			
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
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.parametroplanillaLogic.getParametroPlanillas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteParametroPlanillas(String sAccionBusqueda,List<ParametroPlanilla> parametroplanillasParaReportes) throws Exception {
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
					sPathReporteFinal="ParametroPlanilla"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ParametroPlanillaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ParametroPlanillaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ParametroPlanilla"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Parametro Planillas");		
		parameters.put("busquedapor", ParametroPlanillaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceParametroPlanilla=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ParametroPlanillaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ParametroPlanillaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceParametroPlanilla=new JRBeanArrayDataSource(ParametroPlanillaJInternalFrame.TraerParametroPlanillaBeans(parametroplanillasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceParametroPlanilla);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ParametroPlanillaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ParametroPlanillaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ParametroPlanillaBean.TraerParametroPlanillaBeans(parametroplanillasParaReportes).toArray()));
							
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
				this.generarExcelReporteParametroPlanillas(sAccionBusqueda,sTipoArchivoReporte,parametroplanillasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalParametroPlanillas(sAccionBusqueda,sTipoArchivoReporte,parametroplanillasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoParametroPlanillaActionPerformed(null);
					//this.generarExcelReporteParametroPlanillas(sAccionBusqueda,sTipoArchivoReporte,parametroplanillasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalParametroPlanillas(sAccionBusqueda,sTipoArchivoReporte,parametroplanillasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesParametroPlanillas(sAccionBusqueda,sTipoArchivoReporte,parametroplanillasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesParametroPlanillas(sAccionBusqueda,sTipoArchivoReporte,parametroplanillasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteParametroPlanillas(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroPlanilla> parametroplanillasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroplanilla";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroPlanillas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroPlanilla("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ParametroPlanilla parametroplanilla : parametroplanillasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ParametroPlanillaConstantesFunciones.generarExcelReporteDataParametroPlanilla("NORMAL",row,workbook,parametroplanilla,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Planilla",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderParametroPlanilla(String sTipo,Row row,Workbook workbook) {
		
		ParametroPlanillaConstantesFunciones.generarExcelReporteHeaderParametroPlanilla(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalParametroPlanillas(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroPlanilla> parametroplanillasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroplanilla_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroPlanillas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ParametroPlanilla parametroplanilla : parametroplanillasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ParametroPlanillaConstantesFunciones.getParametroPlanillaDescripcion(parametroplanilla));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroPlanillaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroPlanillaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroplanilla.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEINICIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEINICIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroplanilla.getcuentacontableinicial_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEFINAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEFINAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroplanilla.getcuentacontablefinal_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Planilla",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesParametroPlanillas(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroPlanilla> parametroplanillasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ParametroPlanilla> parametroplanillasRespaldo=null;
		
		classes=ParametroPlanillaConstantesFunciones.getClassesRelationshipsOfParametroPlanilla(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.parametroplanillaLogic.setDatosCliente(this.datosCliente);
		this.parametroplanillaLogic.setDatosDeep(this.datosDeep);
		this.parametroplanillaLogic.setIsConDeep(true);
		
		parametroplanillasRespaldo=this.parametroplanillaLogic.getParametroPlanillas();
		
		this.parametroplanillaLogic.setParametroPlanillas(parametroplanillasParaReportes);	
		this.parametroplanillaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		parametroplanillasParaReportes=this.parametroplanillaLogic.getParametroPlanillas();
		this.parametroplanillaLogic.setParametroPlanillas(parametroplanillasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroplanilla_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroPlanillas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroPlanilla("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ParametroPlanilla parametroplanilla : parametroplanillasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderParametroPlanilla("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ParametroPlanillaConstantesFunciones.generarExcelReporteDataParametroPlanilla("NORMAL",row,workbook,parametroplanilla,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ParametroPlanillaConstantesFunciones.getParametroPlanillaDescripcion(parametroplanilla));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Planilla",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroPlanilla.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroPlanilla.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroPlanilla.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroPlanilla.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessParametroPlanilla() throws Exception {		
		this.startProcessParametroPlanilla(true);
	}
	
	public void startProcessParametroPlanilla(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasParametroPlanilla ,this.jPanelParametrosReportesParametroPlanilla, this.jScrollPanelDatosParametroPlanilla,this.jPanelPaginacionParametroPlanilla, this.jScrollPanelDatosEdicionParametroPlanilla, this.jPanelAccionesParametroPlanilla,this.jPanelAccionesFormularioParametroPlanilla,this.jmenuBarParametroPlanilla,this.jmenuBarDetalleParametroPlanilla,this.jTtoolBarParametroPlanilla,this.jTtoolBarDetalleParametroPlanilla);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroPlanilla=this.jTabbedPaneBusquedasParametroPlanilla; 
		
		final JPanel jPanelParametrosReportesParametroPlanilla=this.jPanelParametrosReportesParametroPlanilla;
		//final JScrollPane jScrollPanelDatosParametroPlanilla=this.jScrollPanelDatosParametroPlanilla;
		final JTable jTableDatosParametroPlanilla=this.jTableDatosParametroPlanilla;		
		final JPanel jPanelPaginacionParametroPlanilla=this.jPanelPaginacionParametroPlanilla;
		//final JScrollPane jScrollPanelDatosEdicionParametroPlanilla=this.jScrollPanelDatosEdicionParametroPlanilla;
		final JPanel jPanelAccionesParametroPlanilla=this.jPanelAccionesParametroPlanilla;
		
		JPanel jPanelCamposAuxiliarParametroPlanilla=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarParametroPlanilla=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
			jPanelCamposAuxiliarParametroPlanilla=this.jInternalFrameDetalleFormParametroPlanilla.jPanelCamposParametroPlanilla;
			jPanelAccionesFormularioAuxiliarParametroPlanilla=this.jInternalFrameDetalleFormParametroPlanilla.jPanelAccionesFormularioParametroPlanilla;
		}
		
		final JPanel jPanelCamposParametroPlanilla=jPanelCamposAuxiliarParametroPlanilla;
		final JPanel jPanelAccionesFormularioParametroPlanilla=jPanelAccionesFormularioAuxiliarParametroPlanilla;
		
		
		final JMenuBar jmenuBarParametroPlanilla=this.jmenuBarParametroPlanilla;
		final JToolBar jTtoolBarParametroPlanilla=this.jTtoolBarParametroPlanilla;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarParametroPlanilla=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroPlanilla=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
			jmenuBarDetalleAuxiliarParametroPlanilla=this.jInternalFrameDetalleFormParametroPlanilla.jmenuBarDetalleParametroPlanilla;
			jTtoolBarDetalleAuxiliarParametroPlanilla=this.jInternalFrameDetalleFormParametroPlanilla.jTtoolBarDetalleParametroPlanilla;
		}
		
		final JMenuBar jmenuBarDetalleParametroPlanilla=jmenuBarDetalleAuxiliarParametroPlanilla;
		final JToolBar jTtoolBarDetalleParametroPlanilla=jTtoolBarDetalleAuxiliarParametroPlanilla;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroPlanilla;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroPlanilla;
			processRunnable.jTableDatos=jTableDatosParametroPlanilla;
			processRunnable.jPanelCampos=jPanelCamposParametroPlanilla;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroPlanilla;
			processRunnable.jPanelAcciones=jPanelAccionesParametroPlanilla;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroPlanilla;
			
			
			processRunnable.jmenuBar=jmenuBarParametroPlanilla;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroPlanilla;
			processRunnable.jTtoolBar=jTtoolBarParametroPlanilla;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroPlanilla;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroPlanilla ,jPanelParametrosReportesParametroPlanilla,jTableDatosParametroPlanilla, /*jScrollPanelDatosParametroPlanilla,*/jPanelCamposParametroPlanilla,jPanelPaginacionParametroPlanilla, /*jScrollPanelDatosEdicionParametroPlanilla,*/ jPanelAccionesParametroPlanilla,jPanelAccionesFormularioParametroPlanilla,jmenuBarParametroPlanilla,jmenuBarDetalleParametroPlanilla,jTtoolBarParametroPlanilla,jTtoolBarDetalleParametroPlanilla);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroPlanilla ,jPanelParametrosReportesParametroPlanilla, jScrollPanelDatosParametroPlanilla,jPanelPaginacionParametroPlanilla, jScrollPanelDatosEdicionParametroPlanilla, jPanelAccionesParametroPlanilla,jPanelAccionesFormularioParametroPlanilla,jmenuBarParametroPlanilla,jmenuBarDetalleParametroPlanilla,jTtoolBarParametroPlanilla,jTtoolBarDetalleParametroPlanilla);
						
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
	
	public void finishProcessParametroPlanilla() {// throws Exception 
		this.finishProcessParametroPlanilla(true);
	}
	
	public void finishProcessParametroPlanilla(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasParametroPlanilla ,this.jPanelParametrosReportesParametroPlanilla, this.jScrollPanelDatosParametroPlanilla,this.jPanelPaginacionParametroPlanilla, this.jScrollPanelDatosEdicionParametroPlanilla, this.jPanelAccionesParametroPlanilla,this.jPanelAccionesFormularioParametroPlanilla,this.jmenuBarParametroPlanilla,this.jmenuBarDetalleParametroPlanilla,this.jTtoolBarParametroPlanilla,this.jTtoolBarDetalleParametroPlanilla);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroPlanilla=this.jTabbedPaneBusquedasParametroPlanilla; 
		
		final JPanel jPanelParametrosReportesParametroPlanilla=this.jPanelParametrosReportesParametroPlanilla;
		//final JScrollPane jScrollPanelDatosParametroPlanilla=this.jScrollPanelDatosParametroPlanilla;
		final JTable jTableDatosParametroPlanilla=this.jTableDatosParametroPlanilla;		
		final JPanel jPanelPaginacionParametroPlanilla=this.jPanelPaginacionParametroPlanilla;
		//final JScrollPane jScrollPanelDatosEdicionParametroPlanilla=this.jScrollPanelDatosEdicionParametroPlanilla;
		final JPanel jPanelAccionesParametroPlanilla=this.jPanelAccionesParametroPlanilla;
		
		JPanel jPanelCamposAuxiliarParametroPlanilla=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarParametroPlanilla=new JPanel();
		
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
			jPanelCamposAuxiliarParametroPlanilla=this.jInternalFrameDetalleFormParametroPlanilla.jPanelCamposParametroPlanilla;
			jPanelAccionesFormularioAuxiliarParametroPlanilla=this.jInternalFrameDetalleFormParametroPlanilla.jPanelAccionesFormularioParametroPlanilla;
		}
		
		final JPanel jPanelCamposParametroPlanilla=jPanelCamposAuxiliarParametroPlanilla;
		final JPanel jPanelAccionesFormularioParametroPlanilla=jPanelAccionesFormularioAuxiliarParametroPlanilla;
		
		
		final JMenuBar jmenuBarParametroPlanilla=this.jmenuBarParametroPlanilla;		
		final JToolBar jTtoolBarParametroPlanilla=this.jTtoolBarParametroPlanilla;
				
		JMenuBar jmenuBarDetalleAuxiliarParametroPlanilla=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroPlanilla=new JToolBar();
		
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
			jmenuBarDetalleAuxiliarParametroPlanilla=this.jInternalFrameDetalleFormParametroPlanilla.jmenuBarDetalleParametroPlanilla;
			jTtoolBarDetalleAuxiliarParametroPlanilla=this.jInternalFrameDetalleFormParametroPlanilla.jTtoolBarDetalleParametroPlanilla;		
		}
		
		final JMenuBar jmenuBarDetalleParametroPlanilla=jmenuBarDetalleAuxiliarParametroPlanilla;
		final JToolBar jTtoolBarDetalleParametroPlanilla=jTtoolBarDetalleAuxiliarParametroPlanilla;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroPlanilla;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroPlanilla;
			processRunnable.jTableDatos=jTableDatosParametroPlanilla;
			processRunnable.jPanelCampos=jPanelCamposParametroPlanilla;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroPlanilla;
			processRunnable.jPanelAcciones=jPanelAccionesParametroPlanilla;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroPlanilla;
			
			
			processRunnable.jmenuBar=jmenuBarParametroPlanilla;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroPlanilla;
			processRunnable.jTtoolBar=jTtoolBarParametroPlanilla;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroPlanilla;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasParametroPlanilla ,jPanelParametrosReportesParametroPlanilla, jTableDatosParametroPlanilla,/*jScrollPanelDatosParametroPlanilla,*/jPanelCamposParametroPlanilla,jPanelPaginacionParametroPlanilla, /*jScrollPanelDatosEdicionParametroPlanilla,*/ jPanelAccionesParametroPlanilla,jPanelAccionesFormularioParametroPlanilla,jmenuBarParametroPlanilla,jmenuBarDetalleParametroPlanilla,jTtoolBarParametroPlanilla,jTtoolBarDetalleParametroPlanilla));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesParametroPlanilla(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarParametroPlanilla(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuParametroPlanilla(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarParametroPlanilla(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarParametroPlanilla,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleParametroPlanilla,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuParametroPlanilla(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarParametroPlanilla,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleParametroPlanilla,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.parametroplanillaConstantesFunciones.getsFinalQueryParametroPlanilla();
		String  finalQueryPaginacionTodos=this.parametroplanillaConstantesFunciones.getsFinalQueryParametroPlanilla();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ParametroPlanillaConstantesFunciones.getArrayColumnasGlobalesNoParametroPlanilla(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ParametroPlanillaConstantesFunciones.getArrayColumnasGlobalesParametroPlanilla(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ParametroPlanillaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.parametroplanillasEliminados= new ArrayList<ParametroPlanilla>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessParametroPlanilla();
		
				///*ParametroPlanillaSessionBean*/this.parametroplanillaSessionBean=new ParametroPlanillaSessionBean();
			
			if(this.parametroplanillaSessionBean==null) {
				this.parametroplanillaSessionBean=new ParametroPlanillaSessionBean();
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
					this.iNumeroPaginacion=ParametroPlanillaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ParametroPlanillaConstantesFunciones.getClassesForeignKeysOfParametroPlanilla(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/parametroplanilla."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			parametroplanillasAux= new ArrayList<ParametroPlanilla>();
			
				
			parametroplanillaLogic.setDatosCliente(this.datosCliente);
			parametroplanillaLogic.setDatosDeep(this.datosDeep);
			parametroplanillaLogic.setIsConDeep(true);
			
			
			parametroplanillaLogic.getParametroPlanillaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					parametroplanillaLogic.getTodosParametroPlanillas(finalQueryGlobal,pagination);
					
					//parametroplanillaLogic.getTodosParametroPlanillasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(parametroplanillaLogic.getParametroPlanillas()==null|| parametroplanillaLogic.getParametroPlanillas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametroplanillasAux= new ArrayList<ParametroPlanilla>();
							parametroplanillasAux.addAll(parametroplanillaLogic.getParametroPlanillas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroplanillasAux= new ArrayList<ParametroPlanilla>();
							parametroplanillasAux.addAll(parametroplanillas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametroplanillaLogic.getTodosParametroPlanillas(finalQueryGlobal+"",this.pagination);												
							
							//parametroplanillaLogic.getTodosParametroPlanillasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteParametroPlanillas("Todos",parametroplanillaLogic.getParametroPlanillas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametroplanillaLogic.setParametroPlanillas(new ArrayList<ParametroPlanilla>());					
							parametroplanillaLogic.getParametroPlanillas().addAll(parametroplanillasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroplanillas=new ArrayList<ParametroPlanilla>();
							parametroplanillas.addAll(parametroplanillasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idParametroPlanilla=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idParametroPlanilla=this.idActual;
				
				} else if(this.idParametroPlanillaActual!=null && this.idParametroPlanillaActual!=0L) {
					idParametroPlanilla=idParametroPlanillaActual;
				}
				
					
				this.sDetalleReporte=ParametroPlanillaConstantesFunciones.getDetalleIndicePorId(idParametroPlanilla);
				
				this.parametroplanillas=new ArrayList<ParametroPlanilla>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					parametroplanillaLogic.getEntity(idParametroPlanilla);
					
					//parametroplanillaLogic.getEntityWithConnection(idParametroPlanilla);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroplanillaLogic.setParametroPlanillas(new ArrayList<ParametroPlanilla>());
					parametroplanillaLogic.getParametroPlanillas().add(parametroplanillaLogic.getParametroPlanilla());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroplanillas=new ArrayList<ParametroPlanilla>();
					this.parametroplanillas.add(parametroplanilla);
				}
				
				if(parametroplanillaLogic.getParametroPlanilla()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCuentaContableFinal")) {
				this.sDetalleReporte=ParametroPlanillaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableFinal(id_cuenta_contable_finalFK_IdCuentaContableFinal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametroplanillaLogic.getParametroPlanillasFK_IdCuentaContableFinal(finalQueryGlobal,pagination,id_cuenta_contable_finalFK_IdCuentaContableFinal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroPlanillaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableFinal(id_cuenta_contable_finalFK_IdCuentaContableFinal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroPlanillaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableFinal(id_cuenta_contable_finalFK_IdCuentaContableFinal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametroplanillaLogic.getParametroPlanillas()==null||parametroplanillaLogic.getParametroPlanillas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametroplanillas==null|| parametroplanillas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroplanillasAux=new ArrayList<ParametroPlanilla>();
						parametroplanillasAux.addAll(parametroplanillaLogic.getParametroPlanillas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroplanillasAux=new ArrayList<ParametroPlanilla>();
							parametroplanillasAux.addAll(parametroplanillas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametroplanillaLogic.getParametroPlanillasFK_IdCuentaContableFinal(finalQueryGlobal,pagination,id_cuenta_contable_finalFK_IdCuentaContableFinal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroPlanillaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableFinal(id_cuenta_contable_finalFK_IdCuentaContableFinal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroPlanillaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableFinal(id_cuenta_contable_finalFK_IdCuentaContableFinal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroPlanillas("FK_IdCuentaContableFinal",parametroplanillaLogic.getParametroPlanillas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroPlanillas("FK_IdCuentaContableFinal",parametroplanillas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroplanillaLogic.setParametroPlanillas(new ArrayList<ParametroPlanilla>());
						parametroplanillaLogic.getParametroPlanillas().addAll(parametroplanillasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroplanillas=new ArrayList<ParametroPlanilla>();
							parametroplanillas.addAll(parametroplanillasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContableInicial")) {
				this.sDetalleReporte=ParametroPlanillaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableInicial(id_cuenta_contable_inicialFK_IdCuentaContableInicial);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametroplanillaLogic.getParametroPlanillasFK_IdCuentaContableInicial(finalQueryGlobal,pagination,id_cuenta_contable_inicialFK_IdCuentaContableInicial);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroPlanillaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableInicial(id_cuenta_contable_inicialFK_IdCuentaContableInicial);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroPlanillaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableInicial(id_cuenta_contable_inicialFK_IdCuentaContableInicial);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametroplanillaLogic.getParametroPlanillas()==null||parametroplanillaLogic.getParametroPlanillas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametroplanillas==null|| parametroplanillas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroplanillasAux=new ArrayList<ParametroPlanilla>();
						parametroplanillasAux.addAll(parametroplanillaLogic.getParametroPlanillas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroplanillasAux=new ArrayList<ParametroPlanilla>();
							parametroplanillasAux.addAll(parametroplanillas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametroplanillaLogic.getParametroPlanillasFK_IdCuentaContableInicial(finalQueryGlobal,pagination,id_cuenta_contable_inicialFK_IdCuentaContableInicial);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroPlanillaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableInicial(id_cuenta_contable_inicialFK_IdCuentaContableInicial);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroPlanillaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableInicial(id_cuenta_contable_inicialFK_IdCuentaContableInicial);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroPlanillas("FK_IdCuentaContableInicial",parametroplanillaLogic.getParametroPlanillas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroPlanillas("FK_IdCuentaContableInicial",parametroplanillas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroplanillaLogic.setParametroPlanillas(new ArrayList<ParametroPlanilla>());
						parametroplanillaLogic.getParametroPlanillas().addAll(parametroplanillasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroplanillas=new ArrayList<ParametroPlanilla>();
							parametroplanillas.addAll(parametroplanillasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ParametroPlanillaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametroplanillaLogic.getParametroPlanillasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroPlanillaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroPlanillaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametroplanillaLogic.getParametroPlanillas()==null||parametroplanillaLogic.getParametroPlanillas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametroplanillas==null|| parametroplanillas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroplanillasAux=new ArrayList<ParametroPlanilla>();
						parametroplanillasAux.addAll(parametroplanillaLogic.getParametroPlanillas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroplanillasAux=new ArrayList<ParametroPlanilla>();
							parametroplanillasAux.addAll(parametroplanillas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametroplanillaLogic.getParametroPlanillasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroPlanillaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroPlanillaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroPlanillas("FK_IdEmpresa",parametroplanillaLogic.getParametroPlanillas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroPlanillas("FK_IdEmpresa",parametroplanillas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroplanillaLogic.setParametroPlanillas(new ArrayList<ParametroPlanilla>());
						parametroplanillaLogic.getParametroPlanillas().addAll(parametroplanillasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroplanillas=new ArrayList<ParametroPlanilla>();
							parametroplanillas.addAll(parametroplanillasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesParametroPlanilla();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessParametroPlanilla();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametroplanillaLogic.getParametroPlanillas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametroplanillas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametroplanillaLogic.getParametroPlanillas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametroplanillas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ParametroPlanilla parametroplanilla) {
		Boolean permite=true;
		
		if(this.parametroplanilla.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ParametroPlanillaConstantesFunciones.getOrderByListaParametroPlanilla();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ParametroPlanillaConstantesFunciones.getOrderByListaParametroPlanilla();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroPlanilla parametroplanilla:parametroplanillaLogic.getParametroPlanillas()) {
				if(parametroplanilla.getsType().equals(Constantes2.S_TOTALES)) {
					parametroplanillaTotales=parametroplanilla;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroPlanilla parametroplanilla:this.parametroplanillas) {
				if(parametroplanilla.getsType().equals(Constantes2.S_TOTALES)) {
					parametroplanillaTotales=parametroplanilla;
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
			this.parametroplanillaAux=new ParametroPlanilla();
			this.parametroplanillaAux.setsType(Constantes2.S_TOTALES);
			this.parametroplanillaAux.setIsNew(false);
			this.parametroplanillaAux.setIsChanged(false);
			this.parametroplanillaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ParametroPlanillaConstantesFunciones.TotalizarValoresFilaParametroPlanilla(this.parametroplanillaLogic.getParametroPlanillas(),this.parametroplanillaAux);
				
				this.parametroplanillaLogic.getParametroPlanillas().add(this.parametroplanillaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ParametroPlanillaConstantesFunciones.TotalizarValoresFilaParametroPlanilla(this.parametroplanillas,this.parametroplanillaAux);
				
				this.parametroplanillas.add(this.parametroplanillaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		parametroplanillaTotales=new ParametroPlanilla();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametroplanillaLogic.getParametroPlanillas().remove(parametroplanillaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametroplanillas.remove(parametroplanillaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		parametroplanillaTotales=new ParametroPlanilla();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroPlanilla parametroplanilla:parametroplanillaLogic.getParametroPlanillas()) {
				if(parametroplanilla.getsType().equals(Constantes2.S_TOTALES)) {
					parametroplanillaTotales=parametroplanilla;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroPlanillaConstantesFunciones.TotalizarValoresFilaParametroPlanilla(this.parametroplanillaLogic.getParametroPlanillas(),parametroplanillaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroPlanilla parametroplanilla:this.parametroplanillas) {
				if(parametroplanilla.getsType().equals(Constantes2.S_TOTALES)) {
					parametroplanillaTotales=parametroplanilla;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroPlanillaConstantesFunciones.TotalizarValoresFilaParametroPlanilla(this.parametroplanillas,parametroplanillaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getParametroPlanillasFK_IdCuentaContableFinal()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableFinal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroPlanillasFK_IdCuentaContableInicial()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableInicial";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroPlanillasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getParametroPlanillasFK_IdCuentaContableFinal(String sFinalQuery,Long id_cuenta_contable_final)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroplanillaLogic.getParametroPlanillasFK_IdCuentaContableFinal(sFinalQuery,this.pagination,id_cuenta_contable_final);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroPlanillasFK_IdCuentaContableInicial(String sFinalQuery,Long id_cuenta_contable_inicial)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroplanillaLogic.getParametroPlanillasFK_IdCuentaContableInicial(sFinalQuery,this.pagination,id_cuenta_contable_inicial);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroPlanillasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroplanillaLogic.getParametroPlanillasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosParametroPlanilla() {
		this.isPermisoTodoParametroPlanilla=false;
		this.isPermisoNuevoParametroPlanilla=false;
		this.isPermisoActualizarParametroPlanilla=false;
		this.isPermisoActualizarOriginalParametroPlanilla=false;
		this.isPermisoEliminarParametroPlanilla=false;
		this.isPermisoGuardarCambiosParametroPlanilla=false;
		this.isPermisoConsultaParametroPlanilla=false;
		this.isPermisoBusquedaParametroPlanilla=false;
		this.isPermisoReporteParametroPlanilla=false;		
		this.isPermisoOrdenParametroPlanilla=false;		
		this.isPermisoPaginacionMedioParametroPlanilla=false;		
		this.isPermisoPaginacionAltoParametroPlanilla=false;
		this.isPermisoPaginacionTodoParametroPlanilla=false;
		this.isPermisoCopiarParametroPlanilla=false;		
		this.isPermisoVerFormParametroPlanilla=false;		
		this.isPermisoDuplicarParametroPlanilla=false;		
		this.isPermisoOrdenParametroPlanilla=false;		
	}
	
	public void setPermisosUsuarioParametroPlanilla(Boolean isPermiso) {
		this.isPermisoTodoParametroPlanilla=isPermiso;
		this.isPermisoNuevoParametroPlanilla=isPermiso;
		this.isPermisoActualizarParametroPlanilla=isPermiso;
		this.isPermisoActualizarOriginalParametroPlanilla=isPermiso;
		this.isPermisoEliminarParametroPlanilla=isPermiso;
		this.isPermisoGuardarCambiosParametroPlanilla=isPermiso;
		this.isPermisoConsultaParametroPlanilla=isPermiso;
		this.isPermisoBusquedaParametroPlanilla=isPermiso;
		this.isPermisoReporteParametroPlanilla=isPermiso;
		this.isPermisoOrdenParametroPlanilla=isPermiso;		
		this.isPermisoPaginacionMedioParametroPlanilla=isPermiso;		
		this.isPermisoPaginacionAltoParametroPlanilla=isPermiso;		
		this.isPermisoPaginacionTodoParametroPlanilla=isPermiso;		
		this.isPermisoCopiarParametroPlanilla=isPermiso;		
		this.isPermisoVerFormParametroPlanilla=isPermiso;		
		this.isPermisoDuplicarParametroPlanilla=isPermiso;
		this.isPermisoOrdenParametroPlanilla=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioParametroPlanilla(Boolean isPermiso) {
		//this.isPermisoTodoParametroPlanilla=isPermiso;
		this.isPermisoNuevoParametroPlanilla=isPermiso;
		this.isPermisoActualizarParametroPlanilla=isPermiso;
		this.isPermisoActualizarOriginalParametroPlanilla=isPermiso;
		this.isPermisoEliminarParametroPlanilla=isPermiso;
		this.isPermisoGuardarCambiosParametroPlanilla=isPermiso;
		//this.isPermisoConsultaParametroPlanilla=isPermiso;
		//this.isPermisoBusquedaParametroPlanilla=isPermiso;
		//this.isPermisoReporteParametroPlanilla=isPermiso;
		//this.isPermisoOrdenParametroPlanilla=isPermiso;		
		//this.isPermisoPaginacionMedioParametroPlanilla=isPermiso;		
		//this.isPermisoPaginacionAltoParametroPlanilla=isPermiso;		
		//this.isPermisoPaginacionTodoParametroPlanilla=isPermiso;		
		//this.isPermisoCopiarParametroPlanilla=isPermiso;		
		//this.isPermisoDuplicarParametroPlanilla=isPermiso;
		//this.isPermisoOrdenParametroPlanilla=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioParametroPlanillaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ParametroPlanillaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebParametroPlanilla(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioParametroPlanillaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioParametroPlanillaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionParametroPlanillaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioParametroPlanillaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioParametroPlanilla() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ParametroPlanillaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ParametroPlanillaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoParametroPlanilla=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarParametroPlanilla=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalParametroPlanilla=this.isPermisoActualizarParametroPlanilla;
			this.isPermisoEliminarParametroPlanilla=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosParametroPlanilla=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaParametroPlanilla=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaParametroPlanilla=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoParametroPlanilla=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteParametroPlanilla=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroPlanilla=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioParametroPlanilla=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoParametroPlanilla=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoParametroPlanilla=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarParametroPlanilla=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormParametroPlanilla=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarParametroPlanilla=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroPlanilla=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosParametroPlanilla.setToolTipText(this.jTableDatosParametroPlanilla.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioParametroPlanilla(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioParametroPlanilla(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ParametroPlanillaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ParametroPlanillaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioParametroPlanilla() throws Exception {
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
	public void inicializarCombosForeignKeyParametroPlanillaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.cuentacontableinicialsForeignKey=new ArrayList();
				this.cuentacontablefinalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyParametroPlanillaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ParametroPlanillaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyParametroPlanillaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableInicialListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableFinalListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyCuentaContableInicialListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontableinicialsForeignKey==null||this.cuentacontableinicialsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContableInicialsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableFinalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontablefinalsForeignKey==null||this.cuentacontablefinalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContableFinalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyParametroPlanillaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ParametroPlanillaParameterReturnGeneral parametroplanillaReturnGeneral=new ParametroPlanillaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.parametroplanillaConstantesFunciones.cargarid_empresaParametroPlanilla)
					 || (this.esRecargarFks && this.parametroplanillaConstantesFunciones.cargarid_empresaParametroPlanilla)) {

					if(!this.parametroplanillaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+parametroplanillaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCuentaContableInicial="";

				if(((this.cuentacontableinicialsForeignKey==null||this.cuentacontableinicialsForeignKey.size()<=0) && this.parametroplanillaConstantesFunciones.cargarid_cuenta_contable_inicialParametroPlanilla)
					 || (this.esRecargarFks && this.parametroplanillaConstantesFunciones.cargarid_cuenta_contable_inicialParametroPlanilla)) {

					if(!this.parametroplanillaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableInicial()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableInicial=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableInicial=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableInicial, "");
						finalQueryGlobalCuentaContableInicial+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableInicialsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableInicial=" WHERE " + ConstantesSql.ID + "="+parametroplanillaSessionBean.getlidCuentaContableInicialActual();
					}
				} else {
					finalQueryGlobalCuentaContableInicial="NONE";
				}


				String finalQueryGlobalCuentaContableFinal="";

				if(((this.cuentacontablefinalsForeignKey==null||this.cuentacontablefinalsForeignKey.size()<=0) && this.parametroplanillaConstantesFunciones.cargarid_cuenta_contable_finalParametroPlanilla)
					 || (this.esRecargarFks && this.parametroplanillaConstantesFunciones.cargarid_cuenta_contable_finalParametroPlanilla)) {

					if(!this.parametroplanillaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableFinal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableFinal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableFinal=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableFinal, "");
						finalQueryGlobalCuentaContableFinal+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableFinalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableFinal=" WHERE " + ConstantesSql.ID + "="+parametroplanillaSessionBean.getlidCuentaContableFinalActual();
					}
				} else {
					finalQueryGlobalCuentaContableFinal="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				parametroplanillaReturnGeneral=parametroplanillaLogic.cargarCombosLoteForeignKeyParametroPlanilla(finalQueryGlobalEmpresa,finalQueryGlobalCuentaContableInicial,finalQueryGlobalCuentaContableFinal);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=parametroplanillaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCuentaContableInicial.equals("NONE")) {
				this.cuentacontableinicialsForeignKey=parametroplanillaReturnGeneral.getcuentacontableinicialsForeignKey();
			}

			if(!finalQueryGlobalCuentaContableFinal.equals("NONE")) {
				this.cuentacontablefinalsForeignKey=parametroplanillaReturnGeneral.getcuentacontablefinalsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyParametroPlanilla()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCuentaContableInicial();
			this.addItemDefectoCombosForeignKeyCuentaContableFinal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.parametroplanillaSessionBean==null) {
				this.parametroplanillaSessionBean=new ParametroPlanillaSessionBean();
			}

			if(!this.parametroplanillaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyCuentaContableInicial()throws Exception {
		try {

			if(!this.parametroplanillaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableInicial()) {
				CuentaContable cuentacontableinicial=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontableinicial,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontableinicial.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontableinicialsForeignKey,cuentacontableinicial,true)) {

					this.cuentacontableinicialsForeignKey.add(0,cuentacontableinicial);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContableFinal()throws Exception {
		try {

			if(!this.parametroplanillaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableFinal()) {
				CuentaContable cuentacontablefinal=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontablefinal,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontablefinal.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontablefinalsForeignKey,cuentacontablefinal,true)) {

					this.cuentacontablefinalsForeignKey.add(0,cuentacontablefinal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyParametroPlanilla()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyParametroPlanilla(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyParametroPlanilla()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroPlanilla();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyParametroPlanilla(ParametroPlanilla parametroplanilla)throws Exception {	
		try {
			
			this.setActualCuentaContableInicialForeignKey(parametroplanilla.getid_cuenta_contable_inicial(),false,"Formulario");
			this.setActualCuentaContableFinalForeignKey(parametroplanilla.getid_cuenta_contable_final(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyParametroPlanilla(ParametroPlanilla parametroplanilla,String sTipoEvento)throws Exception {	
		try {
			
			

				if(parametroplanilla.getCuentaContableInicial()!=null && !sTipoEvento.equals("id_cuenta_contable_inicialParametroPlanilla")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontableinicialsForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontableinicialsForeignKey.add(parametroplanilla.getCuentaContableInicial());

					this.addItemDefectoCombosForeignKeyCuentaContableInicial();
					this.cargarCombosFrameCuentaContableInicialsForeignKey("Todos");
				}

				if(parametroplanilla.getCuentaContableFinal()!=null && !sTipoEvento.equals("id_cuenta_contable_finalParametroPlanilla")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablefinalsForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablefinalsForeignKey.add(parametroplanilla.getCuentaContableFinal());

					this.addItemDefectoCombosForeignKeyCuentaContableFinal();
					this.cargarCombosFrameCuentaContableFinalsForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyParametroPlanilla()throws Exception {	
		try {
			
			this.setActualCuentaContableInicialForeignKey(this.parametroplanillaConstantesFunciones.getid_cuenta_contable_inicial(),false,"Formulario");
			this.setActualCuentaContableFinalForeignKey(this.parametroplanillaConstantesFunciones.getid_cuenta_contable_final(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyParametroPlanilla()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyParametroPlanilla()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyParametroPlanilla()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroParametroPlanilla()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyParametroPlanilla()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameCuentaContableInicialsForeignKey("Todos");
			this.cargarCombosFrameCuentaContableFinalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyParametroPlanilla(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableInicialsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableFinalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyParametroPlanilla()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_empresaParametroPlanilla!=null && this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_empresaParametroPlanilla.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_empresaParametroPlanilla.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_inicialParametroPlanilla!=null && this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_inicialParametroPlanilla.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_inicialParametroPlanilla.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_finalParametroPlanilla!=null && this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_finalParametroPlanilla.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_finalParametroPlanilla.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ParametroPlanillaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ParametroPlanillaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ParametroPlanillaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.parametroplanillaSessionBean=new ParametroPlanillaSessionBean(); 
		this.parametroplanillaConstantesFunciones=new ParametroPlanillaConstantesFunciones(); 
		this.parametroplanillaBean=new ParametroPlanilla();//(this.parametroplanillaConstantesFunciones); 		
		this.parametroplanillaReturnGeneral=new ParametroPlanillaParameterReturnGeneral(); 
		
		this.parametroplanillaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametroplanillaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ParametroPlanillaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ParametroPlanillaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ParametroPlanillaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessParametroPlanilla(true);
			
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
			
			this.parametroplanillaConstantesFunciones=new ParametroPlanillaConstantesFunciones(); 
			this.parametroplanillaBean=new ParametroPlanilla();//this.parametroplanillaConstantesFunciones); 			
			this.parametroplanillaReturnGeneral=new ParametroPlanillaParameterReturnGeneral(); 
		
			ParametroPlanillaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Planilla Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.parametroplanilla=new ParametroPlanilla();
			this.parametroplanillas = new ArrayList<ParametroPlanilla>();
			this.parametroplanillasAux = new ArrayList<ParametroPlanilla>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic=new ParametroPlanillaLogic();
				this.parametroplanillaLogic.getNewConnexionToDeep("");
			}
			
			//this.parametroplanillaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.parametroplanillaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormParametroPlanilla);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoParametroPlanilla!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroPlanilla);	
					}
					
					if(this.jInternalFrameImportacionParametroPlanilla!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroPlanilla);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByParametroPlanilla!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByParametroPlanilla);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroPlanilla);
				this.jInternalFrameDetalleFormParametroPlanilla.setVisible(false);
				this.jInternalFrameDetalleFormParametroPlanilla.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoParametroPlanilla!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroPlanilla);
					this.jInternalFrameReporteDinamicoParametroPlanilla.setVisible(false);
					this.jInternalFrameReporteDinamicoParametroPlanilla.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionParametroPlanilla!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionParametroPlanilla);
					this.jInternalFrameImportacionParametroPlanilla.setVisible(false);
					this.jInternalFrameImportacionParametroPlanilla.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByParametroPlanilla!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByParametroPlanilla);
					this.jInternalFrameOrderByParametroPlanilla.setVisible(false);
					this.jInternalFrameOrderByParametroPlanilla.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idParametroPlanillaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ParametroPlanillaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.parametroplanillaReturnGeneral=new ParametroPlanillaParameterReturnGeneral();
			
			this.parametroplanillaParameterGeneral=new ParametroPlanillaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.parametroplanillaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ParametroPlanillaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroPlanillaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametroplanillaSessionBean.getEsGuardarRelacionado(),this.parametroplanillaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroPlanillaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametroplanillaSessionBean.getEsGuardarRelacionado(),this.parametroplanillaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoParametroPlanilla=false;
			this.isVisibilidadCeldaDuplicarParametroPlanilla=true;
			this.isVisibilidadCeldaCopiarParametroPlanilla=true;
			this.isVisibilidadCeldaVerFormParametroPlanilla=true;
			this.isVisibilidadCeldaOrdenParametroPlanilla=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroPlanilla=false;
			this.isVisibilidadCeldaModificarParametroPlanilla=false;
			this.isVisibilidadCeldaActualizarParametroPlanilla=false;
			this.isVisibilidadCeldaEliminarParametroPlanilla=false;
			this.isVisibilidadCeldaCancelarParametroPlanilla=false;
			this.isVisibilidadCeldaGuardarParametroPlanilla=false;
			this.isVisibilidadCeldaGuardarCambiosParametroPlanilla=false;
			
			
			this.isVisibilidadFK_IdCuentaContableFinal=true;
			this.isVisibilidadFK_IdCuentaContableInicial=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesParametroPlanilla("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosParametroPlanilla();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioParametroPlanilla(false);
			
			this.setPermisosUsuarioParametroPlanilla();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado() 
				|| (this.parametroplanillaSessionBean.getEsGuardarRelacionado() && this.parametroplanillaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioParametroPlanillaClasesRelacionadas();
			}
			
			if(this.parametroplanillaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioParametroPlanillaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ParametroPlanillaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosParametroPlanilla();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualParametroPlanilla();
			}
			
			if(!this.isPermisoBusquedaParametroPlanilla) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasParametroPlanilla.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioParametroPlanilla,this.isPermisoPaginacionMedioParametroPlanilla,this.isPermisoPaginacionTodoParametroPlanilla);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ParametroPlanillaConstantesFunciones.getTiposSeleccionarParametroPlanilla());
				
				this.tiposColumnasSelect=ParametroPlanillaConstantesFunciones.getTiposSeleccionarParametroPlanilla(true);
				
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
			//if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioParametroPlanilla();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioParametroPlanilla(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioParametroPlanilla(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroPlanilla() ;
			
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
			this.cuentacontableinicialLogic=new CuentaContableLogic();
			this.cuentacontablefinalLogic=new CuentaContableLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				parametroplanillaImplementable= (ParametroPlanillaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroPlanillaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				parametroplanillaImplementableHome= (ParametroPlanillaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroPlanillaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.parametroplanillas= new ArrayList<ParametroPlanilla>();
			this.parametroplanillasEliminados= new ArrayList<ParametroPlanilla>();
						
			this.isEsNuevoParametroPlanilla=false;
			this.esParaAccionDesdeFormularioParametroPlanilla=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCuentaContableInicialActual=0L;
			this.idCuentaContableFinalActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.cuentacontableinicialsForeignKey=new ArrayList<CuentaContable>() ;
			this.cuentacontablefinalsForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyParametroPlanilla(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroParametroPlanilla();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ParametroPlanillaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ParametroPlanillaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesParametroPlanilla("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingParametroPlanilla(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioParametroPlanilla();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioParametroPlanilla();
			}
			
			ParametroPlanillaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasParametroPlanilla.getTabCount(); i++) {
					this.jTabbedPaneBusquedasParametroPlanilla.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasParametroPlanilla.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessParametroPlanilla(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ParametroPlanilla: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectParametroPlanilla() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesParametroPlanilla")) {
				iIndex=this.jInternalFrameDetalleFormParametroPlanilla.jTabbedPaneRelacionesParametroPlanilla.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormParametroPlanilla.jTabbedPaneRelacionesParametroPlanilla.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessParametroPlanilla();	
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
	
	public void cargarCombosForeignKeyParametroPlanilla(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyParametroPlanilla(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyParametroPlanilla(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyParametroPlanillaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyParametroPlanilla();
		
		this.cargarCombosFrameForeignKeyParametroPlanilla();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyParametroPlanilla();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyParametroPlanilla();
		}
	}
	
	

	public void cargarCombosForeignKeyCuentaContableInicial(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableInicialListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContableInicial();
				this.cargarCombosFrameCuentaContableInicialsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContableInicial(this.cuentacontableinicialsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableFinal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableFinalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContableFinal();
				this.cargarCombosFrameCuentaContableFinalsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContableFinal(this.cuentacontablefinalsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoParametroPlanillaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.parametroplanillaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormParametroPlanilla==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
			
			
			if(jTableDatosParametroPlanilla.getRowCount()>=1) {
				jTableDatosParametroPlanilla.removeRowSelectionInterval(0, jTableDatosParametroPlanilla.getRowCount()-1);						
			}
			
			this.isEsNuevoParametroPlanilla=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoParametroPlanilla(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesParametroPlanilla(true);			
			//this.parametroplanilla=new ParametroPlanilla();
			//this.parametroplanilla.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroPlanilla(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroPlanilla() ;
			
			if(ParametroPlanillaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroPlanilla(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.parametroplanilla);	
			this.actualizarInformacion("INFO_PADRE",false,this.parametroplanilla);				
			
			ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
			
			if(this.parametroplanillaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ParametroPlanilla: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarParametroPlanillaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ParametroPlanilla> parametroplanillasSeleccionados=new ArrayList<ParametroPlanilla>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosParametroPlanilla.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosParametroPlanilla.getSelectedRows().length;			
			}
			
			parametroplanillasSeleccionados=this.getParametroPlanillasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoParametroPlanilla--;			
				//ParametroPlanilla parametroplanillaAux= new ParametroPlanilla();			
				//parametroplanillaAux.setId(this.iIdNuevoParametroPlanilla);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ParametroPlanilla parametroplanillaOrigen=new ParametroPlanilla();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ParametroPlanilla parametroplanillaOrigen : parametroplanillasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							parametroplanillaOrigen =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroplanillaOrigen =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaParametroPlanilla();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.parametroplanilla.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosParametroPlanilla(parametroplanillaOrigen,this.parametroplanilla,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysParametroPlanilla(this.parametroplanilla);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametroplanillaLogic.getParametroPlanillas().add(this.parametroplanillaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametroplanillas.add(this.parametroplanillaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaParametroPlanilla(false);
				
				this.jTableDatosParametroPlanilla.setRowSelectionInterval(this.getIndiceNuevoParametroPlanilla(), this.getIndiceNuevoParametroPlanilla());
				
				int iLastRow =  this.jTableDatosParametroPlanilla.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroPlanilla.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroPlanilla.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroPlanilla(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ParametroPlanilla> parametroplanillasSeleccionados=new ArrayList<ParametroPlanilla>();									
		
			ParametroPlanilla parametroplanillaOrigen=new ParametroPlanilla();
			ParametroPlanilla parametroplanillaDestino=new ParametroPlanilla();
				
			parametroplanillasSeleccionados=this.getParametroPlanillasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosParametroPlanilla.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || parametroplanillasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosParametroPlanilla.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroplanillaOrigen =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametroplanillaOrigen =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroplanillaDestino =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametroplanillaDestino =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				parametroplanillaOrigen =parametroplanillasSeleccionados.get(0);
				parametroplanillaDestino =parametroplanillasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosParametroPlanilla(parametroplanillaOrigen,parametroplanillaDestino,true,false);
				
				parametroplanillaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametroplanillaDestino,parametroplanillaLogic.getParametroPlanillas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametroplanillaDestino,parametroplanillas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaParametroPlanilla(false);
				
				//this.jTableDatosParametroPlanilla.setRowSelectionInterval(this.getIndiceNuevoParametroPlanilla(), this.getIndiceNuevoParametroPlanilla());
				
				int iLastRow =  this.jTableDatosParametroPlanilla.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroPlanilla.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroPlanilla.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroPlanilla(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroPlanilla==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormParametroPlanilla.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesParametroPlanilla.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasParametroPlanilla.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesParametroPlanilla.setVisible(!isVisible);
			this.jPanelPaginacionParametroPlanilla.setVisible(!isVisible);
			this.jPanelAccionesParametroPlanilla.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameParametroPlanilla();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoParametroPlanilla();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionParametroPlanilla();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByParametroPlanilla();
			
			this.abrirFrameOrderByParametroPlanilla();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByParametroPlanilla();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleParametroPlanilla(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroPlanilla);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormParametroPlanilla.isMaximum()) {
					this.jInternalFrameDetalleFormParametroPlanilla.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormParametroPlanilla.setSize(this.jInternalFrameDetalleFormParametroPlanilla.iWidthFormulario,this.jInternalFrameDetalleFormParametroPlanilla.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormParametroPlanilla.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormParametroPlanilla.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormParametroPlanilla.isMaximum()) {
						this.jInternalFrameDetalleFormParametroPlanilla.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormParametroPlanilla.jContentPaneDetalleParametroPlanilla.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormParametroPlanilla.jTabbedPaneRelacionesParametroPlanilla.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormParametroPlanilla.jContentPaneDetalleParametroPlanilla.getWidth(),ParametroPlanillaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroPlanilla.jTabbedPaneRelacionesParametroPlanilla.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormParametroPlanilla.jContentPaneDetalleParametroPlanilla.getWidth(),ParametroPlanillaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroPlanilla.jTabbedPaneRelacionesParametroPlanilla.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormParametroPlanilla.jContentPaneDetalleParametroPlanilla.getWidth(),ParametroPlanillaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormParametroPlanilla.setVisible(true);
	        this.jInternalFrameDetalleFormParametroPlanilla.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByParametroPlanilla() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByParametroPlanilla==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByParametroPlanilla=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroPlanilla,false,this);
				} else {
					this.jInternalFrameOrderByParametroPlanilla=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroPlanilla,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByParametroPlanilla);
				this.jInternalFrameOrderByParametroPlanilla.setVisible(false);
				this.jInternalFrameOrderByParametroPlanilla.setSelected(false);
				
				this.jInternalFrameOrderByParametroPlanilla.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroPlanilla"));
				
				this.inicializarActualizarBindingTablaOrderByParametroPlanilla();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionParametroPlanilla() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionParametroPlanilla==null) {
				
				this.jInternalFrameImportacionParametroPlanilla=new ImportacionJInternalFrame(ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroPlanilla);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionParametroPlanilla);
				this.jInternalFrameImportacionParametroPlanilla.setVisible(false);
				this.jInternalFrameImportacionParametroPlanilla.setSelected(false);


				this.jInternalFrameImportacionParametroPlanilla.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroPlanilla"));
				this.jInternalFrameImportacionParametroPlanilla.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroPlanilla"));
				this.jInternalFrameImportacionParametroPlanilla.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroPlanilla"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoParametroPlanilla() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoParametroPlanilla==null) {
				this.jInternalFrameReporteDinamicoParametroPlanilla=new ReporteDinamicoJInternalFrame(ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroPlanilla);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroPlanilla);
				this.jInternalFrameReporteDinamicoParametroPlanilla.setVisible(false);
				this.jInternalFrameReporteDinamicoParametroPlanilla.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoParametroPlanilla.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroPlanilla"));
				this.jInternalFrameReporteDinamicoParametroPlanilla.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroPlanilla"));
				this.jInternalFrameReporteDinamicoParametroPlanilla.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroPlanilla"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroPlanilla();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleParametroPlanilla() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroPlanilla);
			
	       	this.jInternalFrameDetalleFormParametroPlanilla.setVisible(false);
	        this.jInternalFrameDetalleFormParametroPlanilla.setSelected(false);
			
			//this.jInternalFrameDetalleFormParametroPlanilla.dispose();
			//this.jInternalFrameDetalleFormParametroPlanilla=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoParametroPlanilla() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoParametroPlanilla.setVisible(true);
	        this.jInternalFrameReporteDinamicoParametroPlanilla.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionParametroPlanilla() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionParametroPlanilla.setVisible(true);
	        this.jInternalFrameImportacionParametroPlanilla.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByParametroPlanilla() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByParametroPlanilla.setVisible(true);
	        this.jInternalFrameOrderByParametroPlanilla.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByParametroPlanilla() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByParametroPlanilla.setVisible(false);
	        this.jInternalFrameOrderByParametroPlanilla.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoParametroPlanilla() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoParametroPlanilla.setVisible(false);
	        this.jInternalFrameReporteDinamicoParametroPlanilla.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionParametroPlanilla() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionParametroPlanilla.setVisible(false);
	        this.jInternalFrameImportacionParametroPlanilla.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeCuentaContableInicial(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContableInicial";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderParametroPlanilla=(TitledBorder)this.jScrollPanelDatosParametroPlanilla.getBorder();
						TitledBorder titledBorderCuentaContableInicial=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableInicial.setTitle(titledBorderParametroPlanilla.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContableInicial(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCuentaContable);
						jInternalFrameTreeCuentaContable.setVisible(false);
						jInternalFrameTreeCuentaContable.setSelected(false);
						//jInternalFrameTreeCuentaContable.dispose();
						//jInternalFrameTreeCuentaContable=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}

				public void abrirFrameTreeCuentaContableFinal(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContableFinal";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderParametroPlanilla=(TitledBorder)this.jScrollPanelDatosParametroPlanilla.getBorder();
						TitledBorder titledBorderCuentaContableFinal=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableFinal.setTitle(titledBorderParametroPlanilla.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContableFinal(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCuentaContable);
						jInternalFrameTreeCuentaContable.setVisible(false);
						jInternalFrameTreeCuentaContable.setSelected(false);
						//jInternalFrameTreeCuentaContable.dispose();
						//jInternalFrameTreeCuentaContable=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarParametroPlanilla(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarParametroPlanilla(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesParametroPlanilla(true);
			//this.isEsNuevoParametroPlanilla=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanilla =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametroplanilla =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesParametroPlanilla("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroPlanilla(false) ;
			
			if(parametroplanillaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ParametroPlanillaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroPlanilla(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroPlanilla(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaParametroPlanillaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanilla =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroplanilla =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarParametroPlanilla(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroPlanilla==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesParametroPlanilla(true);
			//this.isEsNuevoParametroPlanilla=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanilla =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametroplanilla =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.parametroplanilla.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesParametroPlanilla("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesParametroPlanilla(false) ;
			
			if(ParametroPlanillaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroPlanilla(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroPlanilla(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CuentaContableInicial")) {
				if(!this.parametroplanillaConstantesFunciones.cargarid_cuenta_contable_inicialParametroPlanilla) {
					this.cargarCombosCuentaContableInicialsForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingParametroPlanilla(false,false);
					this.cargarCombosFrameCuentaContableInicialsForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable_inicial (id);

				this.recargarComboTablaCuentaContableInicial(this.cuentacontableinicialsForeignKey);

			}
			
			if(sType.equals("CuentaContableFinal")) {
				if(!this.parametroplanillaConstantesFunciones.cargarid_cuenta_contable_finalParametroPlanilla) {
					this.cargarCombosCuentaContableFinalsForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingParametroPlanilla(false,false);
					this.cargarCombosFrameCuentaContableFinalsForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable_final (id);

				this.recargarComboTablaCuentaContableFinal(this.cuentacontablefinalsForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCuentaContableInicial(List<CuentaContable> cuentacontableinicialsForeignKey)throws Exception{
		TableColumn tableColumnCuentaContableInicial=this.jTableDatosParametroPlanilla.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroPlanilla,ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEINICIAL));
		TableCellEditor tableCellEditorCuentaContableInicial =tableColumnCuentaContableInicial.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableInicial;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontableinicialsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroPlanilla.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontableinicialsForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContableFinal(List<CuentaContable> cuentacontablefinalsForeignKey)throws Exception{
		TableColumn tableColumnCuentaContableFinal=this.jTableDatosParametroPlanilla.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroPlanilla,ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEFINAL));
		TableCellEditor tableCellEditorCuentaContableFinal =tableColumnCuentaContableFinal.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableFinal;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablefinalsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroPlanilla.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablefinalsForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable_inicial (Long id) throws Exception {
		this.setActualCuentaContableInicialForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable_final (Long id) throws Exception {
		this.setActualCuentaContableFinalForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesParametroPlanilla(false);
			
			//if(!this.isEsNuevoParametroPlanilla) {								
				int intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanilla =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroplanilla =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ParametroPlanillaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualParametroPlanilla(this.parametroplanilla,true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroPlanilla(this.parametroplanilla);
				
			}
			
			if(this.permiteMantenimiento(this.parametroplanilla)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoParametroPlanilla=true;
					this.inicializarActualizarBindingTablaParametroPlanilla(false);
					this.isEsNuevoParametroPlanilla=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoParametroPlanilla=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoParametroPlanilla=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroPlanilla(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroPlanilla(false);
				
				this.habilitarDeshabilitarControlesParametroPlanilla(false);
			
												
				
				if(ParametroPlanillaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleParametroPlanilla();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoParametroPlanillaActionPerformed(evt,parametroplanillaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualParametroPlanilla(this.parametroplanilla,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosParametroPlanilla.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,parametroplanillaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.parametroplanilla.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ParametroPlanilla.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroPlanilla.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanilla =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				this.parametroplanilla.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametroplanilla =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				this.parametroplanilla.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.parametroplanilla)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ParametroPlanillaModel) this.jTableDatosParametroPlanilla.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoParametroPlanilla=true;
				this.inicializarActualizarBindingTablaParametroPlanilla(false);
				this.isEsNuevoParametroPlanilla=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroPlanilla(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroPlanilla(false);
				
				this.habilitarDeshabilitarControlesParametroPlanilla(false);
				
				
				
				if(ParametroPlanillaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleParametroPlanilla();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosParametroPlanilla.getRowCount()>=1) {
				jTableDatosParametroPlanilla.removeRowSelectionInterval(0, jTableDatosParametroPlanilla.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesParametroPlanilla(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaParametroPlanilla(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroPlanilla(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroPlanilla(false) ;
			
			this.isEsNuevoParametroPlanilla=false;
			
			if(ParametroPlanillaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleParametroPlanilla();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingParametroPlanilla(false);
				
				//SI ES MANUAL
				if(ParametroPlanillaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualParametroPlanilla();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoParametroPlanilla--;			
			//ParametroPlanilla parametroplanillaAux= new ParametroPlanilla();			
			//parametroplanillaAux.setId(this.iIdNuevoParametroPlanilla);
			
			if(this.jInternalFrameDetalleFormParametroPlanilla==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaParametroPlanilla();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysParametroPlanilla(this.parametroplanilla);
			
			this.parametroplanilla.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.parametroplanillaLogic.getParametroPlanillas().add(this.parametroplanillaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.parametroplanillas.add(this.parametroplanillaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaParametroPlanilla(false);
			
			this.jTableDatosParametroPlanilla.setRowSelectionInterval(this.getIndiceNuevoParametroPlanilla(), this.getIndiceNuevoParametroPlanilla());
			
			int iLastRow =  this.jTableDatosParametroPlanilla.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosParametroPlanilla.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosParametroPlanilla.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaParametroPlanilla(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametroPlanilla(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroPlanilla(false);
			
			//SI ES MANUAL
			if(ParametroPlanillaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroPlanilla();
			}
			
			//this.abrirFrameTreeParametroPlanilla();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Parametro PlanillaS ?", "MANTENIMIENTO DE Parametro Planilla", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionParametroPlanilla.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralParametroPlanilla();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.parametroplanillaReturnGeneral=parametroplanillaLogic.procesarImportacionParametroPlanillasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.parametroplanillaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarParametroPlanillaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionParametroPlanilla.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionParametroPlanilla.setFileImportacion(this.jInternalFrameImportacionParametroPlanilla.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionParametroPlanilla.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionParametroPlanilla.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionParametroPlanilla.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionParametroPlanilla.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ParametroPlanilla> parametroplanillasSeleccionados=new ArrayList<ParametroPlanilla>();		

		parametroplanillasSeleccionados=this.getParametroPlanillasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroPlanilla.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroPlanilla.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ParametroPlanillaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ParametroPlanillaBaseDesign.jrxml";
			
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
			
			this.generarReporteParametroPlanillas("Todos",parametroplanillasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Planilla",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoParametroPlanilla.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroPlanilla.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroPlanillaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEINICIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableInicial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableInicial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableInicial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableInicial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEFINAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableFinal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableFinal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableFinal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableFinal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoParametroPlanilla.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoParametroPlanilla.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoParametroPlanilla.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ParametroPlanillaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEINICIAL:
					sNombreCampoCategoria="id_cuenta_contable_inicial";
					break;

				case ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEFINAL:
					sNombreCampoCategoria="id_cuenta_contable_final";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoParametroPlanilla.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ParametroPlanillaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEINICIAL:
					sNombreCampoCategoriaValor="id_cuenta_contable_inicial";
					break;

				case ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEFINAL:
					sNombreCampoCategoriaValor="id_cuenta_contable_final";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoParametroPlanilla.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroPlanilla.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroPlanillaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEINICIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta C. Inicial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_inicial");
					break;

				case ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEFINAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta C. Final",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_final");
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
	
	public void jButtonGenerarExcelReporteDinamicoParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ParametroPlanilla> parametroplanillasSeleccionados=new ArrayList<ParametroPlanilla>();		
		
		parametroplanillasSeleccionados=this.getParametroPlanillasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroplanilla";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ParametroPlanillas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoParametroPlanilla.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroPlanilla.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ParametroPlanillaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroPlanillaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ParametroPlanilla parametroplanilla:parametroplanillasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroplanilla.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEINICIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEINICIAL);
					iRow++;

					for(ParametroPlanilla parametroplanilla:parametroplanillasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroplanilla.getcuentacontableinicial_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEFINAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEFINAL);
					iRow++;

					for(ParametroPlanilla parametroplanilla:parametroplanillasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroplanilla.getcuentacontablefinal_descripcion());
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
			//	this.getFilaCabeceraExportarExcelParametroPlanilla(row);				
			//	iRow++;
			//}				
			
			//for(ParametroPlanilla parametroplanillaAux:parametroplanillasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelParametroPlanilla(parametroplanillaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Planilla",JOptionPane.INFORMATION_MESSAGE);
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
				this.parametroplanillaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroPlanilla(false);
			
			//SI ES MANUAL
			if(ParametroPlanillaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroPlanilla();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroPlanilla(false);
			
			//SI ES MANUAL
			if(ParametroPlanillaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroPlanilla();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroPlanilla(false);
			
			//SI ES MANUAL
			if(ParametroPlanillaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroPlanilla();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaParametroPlanilla() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosParametroPlanilla.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosParametroPlanilla.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosParametroPlanilla.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosParametroPlanilla.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosParametroPlanilla.setMinimumSize(dimensionMinimum);
		this.jTableDatosParametroPlanilla.setMaximumSize(dimensionMaximum);
		this.jTableDatosParametroPlanilla.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingParametroPlanilla(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingParametroPlanilla(esInicializar,true);
	}
	
	public void inicializarActualizarBindingParametroPlanilla(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaParametroPlanilla(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesParametroPlanilla(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasParametroPlanilla(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroPlanilla(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesParametroPlanilla(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ParametroPlanillaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ParametroPlanillaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualParametroPlanilla() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaParametroPlanilla();
		
		this.inicializarActualizarBindingBotonesManualParametroPlanilla(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualParametroPlanilla();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroPlanilla() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualParametroPlanilla(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualParametroPlanilla(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosParametroPlanilla.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosParametroPlanilla.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteParametroPlanilla.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormParametroPlanilla.jCheckBoxPostAccionNuevoParametroPlanilla.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormParametroPlanilla.jCheckBoxPostAccionSinCerrarParametroPlanilla.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormParametroPlanilla.jCheckBoxPostAccionSinMensajeParametroPlanilla.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosParametroPlanilla.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosParametroPlanilla.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteParametroPlanilla.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
				this.jInternalFrameDetalleFormParametroPlanilla.jCheckBoxPostAccionNuevoParametroPlanilla.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormParametroPlanilla.jCheckBoxPostAccionSinCerrarParametroPlanilla.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormParametroPlanilla.jCheckBoxPostAccionSinMensajeParametroPlanilla.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionParametroPlanilla.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionParametroPlanilla.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxTiposAccionesFormularioParametroPlanilla.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesParametroPlanilla.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoParametroPlanilla!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroPlanilla.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesParametroPlanilla.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesParametroPlanilla.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarParametroPlanilla.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesParametroPlanilla.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoParametroPlanilla!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroPlanilla.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesParametroPlanilla.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralParametroPlanilla.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesParametroPlanilla(Boolean esInicializar) throws Exception {
		try	{	
			if(ParametroPlanillaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualParametroPlanilla(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesParametroPlanilla() throws Exception {
		try	{
			if(ParametroPlanillaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroPlanilla();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroPlanilla() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxTiposAccionesFormularioParametroPlanilla.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxTiposAccionesFormularioParametroPlanilla.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroPlanilla() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesParametroPlanilla.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesParametroPlanilla.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesParametroPlanilla.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesParametroPlanilla.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesParametroPlanilla.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesParametroPlanilla.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionParametroPlanilla.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionParametroPlanilla.addItem(reporte);
			}
			
			
			if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionParametroPlanilla.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionParametroPlanilla.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesParametroPlanilla.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesParametroPlanilla.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesParametroPlanilla.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesParametroPlanilla.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxTiposAccionesFormularioParametroPlanilla.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxTiposAccionesFormularioParametroPlanilla.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarParametroPlanilla.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarParametroPlanilla.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarParametroPlanilla.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroPlanilla();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroPlanilla() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroPlanilla!=null) {
				this.jInternalFrameReporteDinamicoParametroPlanilla.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroPlanilla.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroPlanilla!=null) {
				this.jInternalFrameReporteDinamicoParametroPlanilla.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroPlanilla.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoParametroPlanilla!=null) {
				
				if(this.jInternalFrameReporteDinamicoParametroPlanilla.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroPlanilla.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroPlanilla.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoParametroPlanilla.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroPlanilla.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroPlanilla.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualParametroPlanilla()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla.getSelectedItem()!=null){this.id_cuenta_contable_finalFK_IdCuentaContableFinal=((CuentaContable)this.jComboBoxid_cuenta_contable_finalFK_IdCuentaContableFinalParametroPlanilla.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla.getSelectedItem()!=null){this.id_cuenta_contable_inicialFK_IdCuentaContableInicial=((CuentaContable)this.jComboBoxid_cuenta_contable_inicialFK_IdCuentaContableInicialParametroPlanilla.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasParametroPlanilla(Boolean esInicializar) throws Exception {				
		if(ParametroPlanillaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualParametroPlanilla();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaParametroPlanilla() throws Exception {
		this.inicializarActualizarBindingTablaParametroPlanilla(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByParametroPlanilla() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByParametroPlanilla.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByParametroPlanilla.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroPlanilla.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ParametroPlanillaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByParametroPlanilla.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroPlanilla.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ParametroPlanillaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosParametroPlanillaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroPlanillaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ParametroPlanillaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByParametroPlanilla.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroPlanilla.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ParametroPlanillaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByParametroPlanilla.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaParametroPlanilla(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=parametroplanillaLogic.getParametroPlanillas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=parametroplanillas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ParametroPlanillaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosParametroPlanilla.setModel(new ParametroPlanillaModel(this.parametroplanillaLogic.getParametroPlanillas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosParametroPlanilla.setModel(new ParametroPlanillaModel(this.parametroplanillas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByParametroPlanilla!=null && this.jInternalFrameOrderByParametroPlanilla.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByParametroPlanilla();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosParametroPlanilla.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroPlanilla,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ParametroPlanillaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO,parametroplanillaConstantesFunciones.resaltarSeleccionarParametroPlanilla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ParametroPlanillaConstantesFunciones.SCLASSWEBTITULO,parametroplanillaConstantesFunciones.resaltarSeleccionarParametroPlanilla,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosParametroPlanilla.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroPlanilla,ParametroPlanillaConstantesFunciones.LABEL_ID));

		if(this.parametroplanillaConstantesFunciones.mostraridParametroPlanilla && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroPlanillaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametroplanillaConstantesFunciones.resaltaridParametroPlanilla,this.parametroplanillaConstantesFunciones.activaridParametroPlanilla,this,true,"idParametroPlanilla","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametroplanillaConstantesFunciones.resaltaridParametroPlanilla,this.parametroplanillaConstantesFunciones.activaridParametroPlanilla,this,true,"idParametroPlanilla","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroPlanilla.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroPlanilla,ParametroPlanillaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.parametroplanillaConstantesFunciones.mostrarid_empresaParametroPlanilla && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroPlanillaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.parametroplanillaConstantesFunciones.resaltarid_empresaParametroPlanilla,this,this.parametroplanillaConstantesFunciones.activarid_empresaParametroPlanilla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.parametroplanillaConstantesFunciones.resaltarid_empresaParametroPlanilla,this,this.parametroplanillaConstantesFunciones.activarid_empresaParametroPlanilla,false,"id_empresaParametroPlanilla","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroPlanillaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroPlanilla.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroPlanilla,ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEINICIAL));

		if(this.parametroplanillaConstantesFunciones.mostrarid_cuenta_contable_inicialParametroPlanilla && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEINICIAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontableinicialsForeignKey,this.parametroplanillaConstantesFunciones.resaltarid_cuenta_contable_inicialParametroPlanilla,this,this.parametroplanillaConstantesFunciones.activarid_cuenta_contable_inicialParametroPlanilla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontableinicialsForeignKey,this.parametroplanillaConstantesFunciones.resaltarid_cuenta_contable_inicialParametroPlanilla,this,this.parametroplanillaConstantesFunciones.activarid_cuenta_contable_inicialParametroPlanilla,true,"id_cuenta_contable_inicialParametroPlanilla","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new ParametroPlanillaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroPlanilla.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroPlanilla,ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEFINAL));

		if(this.parametroplanillaConstantesFunciones.mostrarid_cuenta_contable_finalParametroPlanilla && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEFINAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablefinalsForeignKey,this.parametroplanillaConstantesFunciones.resaltarid_cuenta_contable_finalParametroPlanilla,this,this.parametroplanillaConstantesFunciones.activarid_cuenta_contable_finalParametroPlanilla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablefinalsForeignKey,this.parametroplanillaConstantesFunciones.resaltarid_cuenta_contable_finalParametroPlanilla,this,this.parametroplanillaConstantesFunciones.activarid_cuenta_contable_finalParametroPlanilla,true,"id_cuenta_contable_finalParametroPlanilla","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new ParametroPlanillaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametroplanillaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametroplanillaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroPlanilla.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametroplanillaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametroplanillaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroPlanilla.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarParametroPlanilla && this.isPermisoGuardarCambiosParametroPlanilla) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.parametroplanillaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.parametroplanillaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosParametroPlanilla.addColumn(tableColumn);
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
			
			this.jTableDatosParametroPlanilla.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroPlanilla && this.isPermisoGuardarCambiosParametroPlanilla) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroPlanilla && this.isPermisoGuardarCambiosParametroPlanilla) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosParametroPlanilla.moveColumn(this.jTableDatosParametroPlanilla.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosParametroPlanilla.moveColumn(this.jTableDatosParametroPlanilla.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosParametroPlanilla.moveColumn(this.jTableDatosParametroPlanilla.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosParametroPlanilla.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosParametroPlanilla.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosParametroPlanilla,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ParametroPlanillaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosParametroPlanilla.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosParametroPlanilla.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ParametroPlanillaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ParametroPlanillaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosParametroPlanilla.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosParametroPlanilla.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosParametroPlanilla.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=parametroplanillaLogic.getParametroPlanillas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=parametroplanillas.size()-1;
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
		//this.jTableDatosParametroPlanilla.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosParametroPlanilla.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosParametroPlanilla();
			
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
				
				//this.isEsNuevoParametroPlanilla=false;
					
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
			
				if(this.parametroplanillaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormParametroPlanilla==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroPlanilla.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroPlanilla.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanilla =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroplanilla =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.parametroplanilla.getsType().equals("DUPLICADO")
				   || this.parametroplanilla.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoParametroPlanilla=true;
				
				} else {
					this.isEsNuevoParametroPlanilla=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
					if(this.parametroplanilla.getId()>=0 && !this.parametroplanilla.getIsNew()) {						
						this.isEsNuevoParametroPlanilla=false;
						
					} else {
						this.isEsNuevoParametroPlanilla=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoParametroPlanilla(esRelaciones);						
				
				this.seleccionarParametroPlanilla(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.parametroplanilla.getId()<0) {
					this.isEsNuevoParametroPlanilla=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarParametroPlanilla(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarParametroPlanilla(evt,rowIndex);
				}	
				
				if(this.parametroplanillaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ParametroPlanilla: " + this.dDif); 
					}
				}								
				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarParametroPlanilla(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.parametroplanilla)) {
					if(this.parametroplanilla.getId()>0) {
						this.parametroplanilla.setIsDeleted(true);
						
						this.parametroplanillasEliminados.add(this.parametroplanilla);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametroplanillaLogic.getParametroPlanillas().remove(this.parametroplanilla);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametroplanillas.remove(this.parametroplanilla);				
					}
					
					
					((ParametroPlanillaModel) this.jTableDatosParametroPlanilla.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroPlanilla(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarParametroPlanilla(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoParametroPlanilla) {
			
			if(this.jInternalFrameDetalleFormParametroPlanilla==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroPlanilla.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroPlanilla.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanilla =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroplanilla =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ParametroPlanillaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioParametroPlanilla(this.parametroplanilla);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.parametroplanillaConstantesFunciones.cargarid_empresaParametroPlanilla || this.parametroplanillaConstantesFunciones.event_dependid_empresaParametroPlanilla) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.parametroplanilla.getid_empresa());
									//this.inicializarActualizarBindingParametroPlanilla(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(parametroplanilla.getEmpresa()!=null) {
							this.empresasForeignKey.add(parametroplanilla.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.parametroplanilla.getid_empresa(),false,"Formulario");

					//CuentaContableInicial
					if(!this.parametroplanillaConstantesFunciones.cargarid_cuenta_contable_inicialParametroPlanilla || this.parametroplanillaConstantesFunciones.event_dependid_cuenta_contable_inicialParametroPlanilla) {
						//this.cargarCombosCuentaContableInicialsForeignKeyLista(" where id="+this.parametroplanilla.getid_cuenta_contable_inicial());
									//this.inicializarActualizarBindingParametroPlanilla(false,false);
						this.cuentacontableinicialsForeignKey=new ArrayList<CuentaContable>();

						if(parametroplanilla.getCuentaContableInicial()!=null) {
							this.cuentacontableinicialsForeignKey.add(parametroplanilla.getCuentaContableInicial());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableInicial();
						this.cargarCombosFrameCuentaContableInicialsForeignKey("Todos");
					}
					this.setActualCuentaContableInicialForeignKey(this.parametroplanilla.getid_cuenta_contable_inicial(),false,"Formulario");

					//CuentaContableFinal
					if(!this.parametroplanillaConstantesFunciones.cargarid_cuenta_contable_finalParametroPlanilla || this.parametroplanillaConstantesFunciones.event_dependid_cuenta_contable_finalParametroPlanilla) {
						//this.cargarCombosCuentaContableFinalsForeignKeyLista(" where id="+this.parametroplanilla.getid_cuenta_contable_final());
									//this.inicializarActualizarBindingParametroPlanilla(false,false);
						this.cuentacontablefinalsForeignKey=new ArrayList<CuentaContable>();

						if(parametroplanilla.getCuentaContableFinal()!=null) {
							this.cuentacontablefinalsForeignKey.add(parametroplanilla.getCuentaContableFinal());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableFinal();
						this.cargarCombosFrameCuentaContableFinalsForeignKey("Todos");
					}
					this.setActualCuentaContableFinalForeignKey(this.parametroplanilla.getid_cuenta_contable_final(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesParametroPlanilla("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesParametroPlanilla(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroPlanilla() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroPlanilla(ParametroPlanilla parametroplanilla) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoParametroPlanilla(parametroplanilla,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroPlanilla(ParametroPlanilla parametroplanilla,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioParametroPlanilla(parametroplanilla);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyParametroPlanilla(parametroplanilla,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyParametroPlanilla(parametroplanilla);
	}
	
	public void setVariablesObjetoActualToFormularioParametroPlanilla(ParametroPlanilla parametroplanilla) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormParametroPlanilla==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormParametroPlanilla.jLabelidParametroPlanilla.setText(parametroplanilla.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ParametroPlanilla parametroplanillaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,parametroplanillaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ParametroPlanilla parametroplanillaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				parametroplanillaLocal=this.parametroplanilla;
			} else {
				parametroplanillaLocal=this.parametroplanillaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(parametroplanillaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoParametroPlanilla(parametroplanillaLocal,true);
					
					if(parametroplanillaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(parametroplanillaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(parametroplanillaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoParametroPlanilla(ParametroPlanilla parametroplanilla,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroPlanilla(parametroplanilla,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysParametroPlanilla(parametroplanilla);
	}
	
	public void setVariablesFormularioToObjetoActualParametroPlanilla(ParametroPlanilla parametroplanilla,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroPlanilla(parametroplanilla,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualParametroPlanilla(ParametroPlanilla parametroplanilla,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormParametroPlanilla==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormParametroPlanilla.jLabelidParametroPlanilla.getText()==null || this.jInternalFrameDetalleFormParametroPlanilla.jLabelidParametroPlanilla.getText()=="" || this.jInternalFrameDetalleFormParametroPlanilla.jLabelidParametroPlanilla.getText()=="Id") {
				this.jInternalFrameDetalleFormParametroPlanilla.jLabelidParametroPlanilla.setText("0");
			}

			if(conColumnasBase) {parametroplanilla.setId(Long.parseLong(this.jInternalFrameDetalleFormParametroPlanilla.jLabelidParametroPlanilla.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroPlanillaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroPlanilla.jLabelIdParametroPlanilla,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroPlanilla(ParametroPlanilla parametroplanillaBean,ParametroPlanilla parametroplanilla,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && parametroplanillaBean.getid_cuenta_contable_inicial()!=null && !parametroplanillaBean.getid_cuenta_contable_inicial().equals(-1L))) {parametroplanilla.setid_cuenta_contable_inicial(parametroplanillaBean.getid_cuenta_contable_inicial());}
			if(conDefault || (!conDefault && parametroplanillaBean.getid_cuenta_contable_final()!=null && !parametroplanillaBean.getid_cuenta_contable_final().equals(-1L))) {parametroplanilla.setid_cuenta_contable_final(parametroplanillaBean.getid_cuenta_contable_final());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosParametroPlanilla(ParametroPlanilla parametroplanillaOrigen,ParametroPlanilla parametroplanilla,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametroplanillaOrigen.getId()!=null && !parametroplanillaOrigen.getId().equals(0L))) {parametroplanilla.setId(parametroplanillaOrigen.getId());}}
			if(conDefault || (!conDefault && parametroplanillaOrigen.getid_cuenta_contable_inicial()!=null && !parametroplanillaOrigen.getid_cuenta_contable_inicial().equals(-1L))) {parametroplanilla.setid_cuenta_contable_inicial(parametroplanillaOrigen.getid_cuenta_contable_inicial());}
			if(conDefault || (!conDefault && parametroplanillaOrigen.getid_cuenta_contable_final()!=null && !parametroplanillaOrigen.getid_cuenta_contable_final().equals(-1L))) {parametroplanilla.setid_cuenta_contable_final(parametroplanillaOrigen.getid_cuenta_contable_final());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroPlanilla(ParametroPlanilla parametroplanilla) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroPlanilla.jLabelidParametroPlanilla.setText(parametroplanilla.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroPlanilla(ParametroPlanillaBean parametroplanillaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroPlanilla.jLabelidParametroPlanilla.setText(parametroplanillaBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanParametroPlanilla(ParametroPlanillaParameterReturnGeneral parametroplanillaReturnGeneral,ParametroPlanillaBean parametroplanillaBean,Boolean conDefault) throws Exception { 
		try {
			ParametroPlanilla parametroplanillaLocal=new ParametroPlanilla();
			
			parametroplanillaLocal=parametroplanillaReturnGeneral.getParametroPlanilla();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametroplanillaLocal.getId()!=null && !parametroplanillaLocal.getId().equals(0L))) {parametroplanillaBean.setId(parametroplanillaLocal.getId());}}
			if(conDefault || (!conDefault && parametroplanillaLocal.getid_cuenta_contable_inicial()!=null && !parametroplanillaLocal.getid_cuenta_contable_inicial().equals(-1L))) {parametroplanillaBean.setid_cuenta_contable_inicial(parametroplanillaLocal.getid_cuenta_contable_inicial());}
			if(conDefault || (!conDefault && parametroplanillaLocal.getid_cuenta_contable_final()!=null && !parametroplanillaLocal.getid_cuenta_contable_final().equals(-1L))) {parametroplanillaBean.setid_cuenta_contable_final(parametroplanillaLocal.getid_cuenta_contable_final());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxParametroPlanillaGenerico(Long idParametroPlanillaSeleccionado,JComboBox jComboBoxParametroPlanilla,List<ParametroPlanilla> parametroplanillasLocal)throws Exception {
		try {
			ParametroPlanilla  parametroplanillaTemp=null;

			for(ParametroPlanilla parametroplanillaAux:parametroplanillasLocal) {
				if(parametroplanillaAux.getId()!=null && parametroplanillaAux.getId().equals(idParametroPlanillaSeleccionado)) {
					parametroplanillaTemp=parametroplanillaAux;
					break;
				}
			}

			jComboBoxParametroPlanilla.setSelectedItem(parametroplanillaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxParametroPlanillaGenerico(JComboBox jComboBoxParametroPlanilla,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxParametroPlanilla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroPlanilla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxParametroPlanilla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroPlanilla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroPlanilla.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxParametroPlanilla.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroPlanilla.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxParametroPlanilla.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxParametroPlanilla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxParametroPlanilla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametroplanilla=(ParametroPlanilla) parametroplanillaLogic.getParametroPlanillas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametroplanilla =(ParametroPlanilla) parametroplanillas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!parametroplanilla.getIsNew() && !parametroplanilla.getIsChanged() && !parametroplanilla.getIsDeleted()) {
				sDescripcion=parametroplanilla.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=parametroplanilla.getempresa_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableInicial")) {
			//sDescripcion=this.getActualCuentaContableInicialForeignKeyDescripcion((Long)value);
			if(!parametroplanilla.getIsNew() && !parametroplanilla.getIsChanged() && !parametroplanilla.getIsDeleted()) {
				sDescripcion=parametroplanilla.getcuentacontableinicial_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableInicialForeignKeyDescripcion((Long)value);
				sDescripcion=parametroplanilla.getcuentacontableinicial_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableFinal")) {
			//sDescripcion=this.getActualCuentaContableFinalForeignKeyDescripcion((Long)value);
			if(!parametroplanilla.getIsNew() && !parametroplanilla.getIsChanged() && !parametroplanilla.getIsDeleted()) {
				sDescripcion=parametroplanilla.getcuentacontablefinal_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableFinalForeignKeyDescripcion((Long)value);
				sDescripcion=parametroplanilla.getcuentacontablefinal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ParametroPlanilla parametroplanillaRow=new ParametroPlanilla();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametroplanillaRow=(ParametroPlanilla) parametroplanillaLogic.getParametroPlanillas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametroplanillaRow=(ParametroPlanilla) parametroplanillas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualParametroPlanilla(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoParametroPlanilla.setVisible((this.isVisibilidadCeldaNuevoParametroPlanilla && this.isPermisoNuevoParametroPlanilla));			
			this.jButtonDuplicarParametroPlanilla.setVisible((this.isVisibilidadCeldaDuplicarParametroPlanilla && this.isPermisoDuplicarParametroPlanilla));			
			this.jButtonCopiarParametroPlanilla.setVisible((this.isVisibilidadCeldaCopiarParametroPlanilla && this.isPermisoCopiarParametroPlanilla));
			this.jButtonVerFormParametroPlanilla.setVisible((this.isVisibilidadCeldaVerFormParametroPlanilla && this.isPermisoVerFormParametroPlanilla));
			
			this.jButtonAbrirOrderByParametroPlanilla.setVisible((this.isVisibilidadCeldaOrdenParametroPlanilla && this.isPermisoOrdenParametroPlanilla));			
			
			this.jButtonNuevoRelacionesParametroPlanilla.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroPlanilla && this.isPermisoNuevoParametroPlanilla));			
			this.jButtonNuevoGuardarCambiosParametroPlanilla.setVisible((this.isVisibilidadCeldaNuevoParametroPlanilla && this.isPermisoNuevoParametroPlanilla && this.isPermisoGuardarCambiosParametroPlanilla));
			
			if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonModificarParametroPlanilla.setVisible((this.isVisibilidadCeldaModificarParametroPlanilla && this.isPermisoActualizarParametroPlanilla));	
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonActualizarParametroPlanilla.setVisible((this.isVisibilidadCeldaActualizarParametroPlanilla && this.isPermisoActualizarParametroPlanilla));	
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonEliminarParametroPlanilla.setVisible((this.isVisibilidadCeldaEliminarParametroPlanilla && this.isPermisoEliminarParametroPlanilla));
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonCancelarParametroPlanilla.setVisible(this.isVisibilidadCeldaCancelarParametroPlanilla);							
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonGuardarCambiosParametroPlanilla.setVisible((this.isVisibilidadCeldaGuardarParametroPlanilla && this.isPermisoGuardarCambiosParametroPlanilla));			
			
			}
						
			this.jButtonGuardarCambiosTablaParametroPlanilla.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroPlanilla && this.isPermisoGuardarCambiosParametroPlanilla));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarParametroPlanilla.setVisible((this.isVisibilidadCeldaNuevoParametroPlanilla && this.isPermisoNuevoParametroPlanilla));						
			this.jButtonDuplicarToolBarParametroPlanilla.setVisible((this.isVisibilidadCeldaDuplicarParametroPlanilla && this.isPermisoDuplicarParametroPlanilla));						
			this.jButtonCopiarToolBarParametroPlanilla.setVisible((this.isVisibilidadCeldaCopiarParametroPlanilla && this.isPermisoCopiarParametroPlanilla));			
			this.jButtonVerFormToolBarParametroPlanilla.setVisible((this.isVisibilidadCeldaVerFormParametroPlanilla && this.isPermisoVerFormParametroPlanilla));			
			this.jButtonAbrirOrderByToolBarParametroPlanilla.setVisible((this.isVisibilidadCeldaOrdenParametroPlanilla && this.isPermisoOrdenParametroPlanilla));
			this.jButtonNuevoRelacionesToolBarParametroPlanilla.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroPlanilla && this.isPermisoNuevoParametroPlanilla));			
			this.jButtonNuevoGuardarCambiosToolBarParametroPlanilla.setVisible((this.isVisibilidadCeldaNuevoParametroPlanilla && this.isPermisoNuevoParametroPlanilla && this.isPermisoGuardarCambiosParametroPlanilla));			
			
			if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonModificarToolBarParametroPlanilla.setVisible((this.isVisibilidadCeldaModificarParametroPlanilla && this.isPermisoActualizarParametroPlanilla));	
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonActualizarToolBarParametroPlanilla.setVisible((this.isVisibilidadCeldaActualizarParametroPlanilla  && this.isPermisoActualizarParametroPlanilla));	
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonEliminarToolBarParametroPlanilla.setVisible((this.isVisibilidadCeldaEliminarParametroPlanilla && this.isPermisoEliminarParametroPlanilla));
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonCancelarToolBarParametroPlanilla.setVisible(this.isVisibilidadCeldaCancelarParametroPlanilla);				
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonGuardarCambiosToolBarParametroPlanilla.setVisible((this.isVisibilidadCeldaGuardarParametroPlanilla && this.isPermisoGuardarCambiosParametroPlanilla));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarParametroPlanilla.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroPlanilla && this.isPermisoGuardarCambiosParametroPlanilla));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoParametroPlanilla.setVisible((this.isVisibilidadCeldaNuevoParametroPlanilla && this.isPermisoNuevoParametroPlanilla));			
			this.jMenuItemDuplicarParametroPlanilla.setVisible((this.isVisibilidadCeldaDuplicarParametroPlanilla && this.isPermisoDuplicarParametroPlanilla));			
			this.jMenuItemCopiarParametroPlanilla.setVisible((this.isVisibilidadCeldaCopiarParametroPlanilla && this.isPermisoCopiarParametroPlanilla));			
			this.jMenuItemVerFormParametroPlanilla.setVisible((this.isVisibilidadCeldaVerFormParametroPlanilla && this.isPermisoVerFormParametroPlanilla));			
			this.jMenuItemAbrirOrderByParametroPlanilla.setVisible((this.isVisibilidadCeldaOrdenParametroPlanilla && this.isPermisoOrdenParametroPlanilla));			
			//this.jMenuItemMostrarOcultarParametroPlanilla.setVisible((this.isVisibilidadCeldaOrdenParametroPlanilla && this.isPermisoOrdenParametroPlanilla));
			this.jMenuItemDetalleAbrirOrderByParametroPlanilla.setVisible((this.isVisibilidadCeldaOrdenParametroPlanilla && this.isPermisoOrdenParametroPlanilla));			
			//this.jMenuItemDetalleMostrarOcultarParametroPlanilla.setVisible((this.isVisibilidadCeldaOrdenParametroPlanilla && this.isPermisoOrdenParametroPlanilla));			
			this.jMenuItemNuevoRelacionesParametroPlanilla.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroPlanilla && this.isPermisoNuevoParametroPlanilla));			
			this.jMenuItemNuevoGuardarCambiosParametroPlanilla.setVisible((this.isVisibilidadCeldaNuevoParametroPlanilla && this.isPermisoNuevoParametroPlanilla && this.isPermisoGuardarCambiosParametroPlanilla));									
			
			if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
			this.jInternalFrameDetalleFormParametroPlanilla.jMenuItemModificarParametroPlanilla.setVisible((this.isVisibilidadCeldaModificarParametroPlanilla && this.isPermisoActualizarParametroPlanilla));	
			this.jInternalFrameDetalleFormParametroPlanilla.jMenuItemActualizarParametroPlanilla.setVisible((this.isVisibilidadCeldaActualizarParametroPlanilla && this.isPermisoActualizarParametroPlanilla));	
			this.jInternalFrameDetalleFormParametroPlanilla.jMenuItemEliminarParametroPlanilla.setVisible((this.isVisibilidadCeldaEliminarParametroPlanilla && this.isPermisoEliminarParametroPlanilla));
			this.jInternalFrameDetalleFormParametroPlanilla.jMenuItemCancelarParametroPlanilla.setVisible(this.isVisibilidadCeldaCancelarParametroPlanilla);				
			}
			
			this.jMenuItemGuardarCambiosParametroPlanilla.setVisible((this.isVisibilidadCeldaGuardarParametroPlanilla && this.isPermisoGuardarCambiosParametroPlanilla));						
			this.jMenuItemGuardarCambiosTablaParametroPlanilla.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroPlanilla && this.isPermisoGuardarCambiosParametroPlanilla));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoParametroPlanilla=this.jButtonNuevoParametroPlanilla.isVisible();
			this.isVisibilidadCeldaDuplicarParametroPlanilla=this.jButtonDuplicarParametroPlanilla.isVisible();
			this.isVisibilidadCeldaCopiarParametroPlanilla=this.jButtonCopiarParametroPlanilla.isVisible();
			this.isVisibilidadCeldaVerFormParametroPlanilla=this.jButtonVerFormParametroPlanilla.isVisible();
			
			this.isVisibilidadCeldaOrdenParametroPlanilla=this.jButtonAbrirOrderByParametroPlanilla.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesParametroPlanilla=this.jButtonNuevoRelacionesParametroPlanilla.isVisible();
			this.isVisibilidadCeldaModificarParametroPlanilla=this.jButtonModificarParametroPlanilla.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
			this.isVisibilidadCeldaActualizarParametroPlanilla=this.jInternalFrameDetalleFormParametroPlanilla.jButtonActualizarParametroPlanilla.isVisible();
			this.isVisibilidadCeldaEliminarParametroPlanilla=this.jInternalFrameDetalleFormParametroPlanilla.jButtonEliminarParametroPlanilla.isVisible();
			this.isVisibilidadCeldaCancelarParametroPlanilla=this.jInternalFrameDetalleFormParametroPlanilla.jButtonCancelarParametroPlanilla.isVisible();
			this.isVisibilidadCeldaGuardarParametroPlanilla=this.jInternalFrameDetalleFormParametroPlanilla.jButtonGuardarCambiosParametroPlanilla.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosParametroPlanilla=this.jButtonGuardarCambiosTablaParametroPlanilla.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoParametroPlanilla=this.jButtonNuevoToolBarParametroPlanilla.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroPlanilla=this.jButtonNuevoRelacionesToolBarParametroPlanilla.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
			this.isVisibilidadCeldaModificarParametroPlanilla=this.jInternalFrameDetalleFormParametroPlanilla.jButtonModificarToolBarParametroPlanilla.isVisible();
			this.isVisibilidadCeldaActualizarParametroPlanilla=this.jInternalFrameDetalleFormParametroPlanilla.jButtonActualizarToolBarParametroPlanilla.isVisible();
			this.isVisibilidadCeldaEliminarParametroPlanilla=this.jInternalFrameDetalleFormParametroPlanilla.jButtonEliminarToolBarParametroPlanilla.isVisible();
			this.isVisibilidadCeldaCancelarParametroPlanilla=this.jInternalFrameDetalleFormParametroPlanilla.jButtonCancelarToolBarParametroPlanilla.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroPlanilla=this.jButtonGuardarCambiosToolBarParametroPlanilla.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroPlanilla=this.jButtonGuardarCambiosTablaToolBarParametroPlanilla.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoParametroPlanilla=this.jMenuItemNuevoParametroPlanilla.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroPlanilla=this.jMenuItemNuevoRelacionesParametroPlanilla.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
			this.isVisibilidadCeldaModificarParametroPlanilla=this.jInternalFrameDetalleFormParametroPlanilla.jMenuItemModificarParametroPlanilla.isVisible();
			this.isVisibilidadCeldaActualizarParametroPlanilla=this.jInternalFrameDetalleFormParametroPlanilla.jMenuItemActualizarParametroPlanilla.isVisible();
			this.isVisibilidadCeldaEliminarParametroPlanilla=this.jInternalFrameDetalleFormParametroPlanilla.jMenuItemEliminarParametroPlanilla.isVisible();
			this.isVisibilidadCeldaCancelarParametroPlanilla=this.jInternalFrameDetalleFormParametroPlanilla.jMenuItemCancelarParametroPlanilla.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroPlanilla=this.jMenuItemGuardarCambiosParametroPlanilla.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroPlanilla=this.jMenuItemGuardarCambiosTablaParametroPlanilla.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesParametroPlanilla(Boolean esInicializar) {
		if(ParametroPlanillaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.parametroplanillaSessionBean.getConGuardarRelaciones()) {
				//if(this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesParametroPlanilla();
			}
			
			this.inicializarActualizarBindingBotonesManualParametroPlanilla(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualParametroPlanilla() {
		this.jButtonNuevoParametroPlanilla.setVisible(this.isPermisoNuevoParametroPlanilla);			
		this.jButtonDuplicarParametroPlanilla.setVisible(this.isPermisoDuplicarParametroPlanilla);			
		this.jButtonCopiarParametroPlanilla.setVisible(this.isPermisoCopiarParametroPlanilla);			
		this.jButtonVerFormParametroPlanilla.setVisible(this.isPermisoVerFormParametroPlanilla);			
		
		this.jButtonAbrirOrderByParametroPlanilla.setVisible(this.isPermisoOrdenParametroPlanilla);					
		
		this.jButtonNuevoRelacionesParametroPlanilla.setVisible(this.isPermisoNuevoParametroPlanilla);			
		
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonModificarParametroPlanilla.setVisible(this.isPermisoActualizarParametroPlanilla);	
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonActualizarParametroPlanilla.setVisible(this.isPermisoActualizarParametroPlanilla);	
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonEliminarParametroPlanilla.setVisible(this.isPermisoEliminarParametroPlanilla);
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonCancelarParametroPlanilla.setVisible(this.isVisibilidadCeldaCancelarParametroPlanilla);						
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonGuardarCambiosParametroPlanilla.setVisible(this.isPermisoGuardarCambiosParametroPlanilla);							
		}
		
		this.jButtonGuardarCambiosTablaParametroPlanilla.setVisible(this.isPermisoActualizarParametroPlanilla);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroPlanilla() {
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonModificarParametroPlanilla.setVisible(this.isPermisoActualizarParametroPlanilla);	
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonActualizarParametroPlanilla.setVisible(this.isPermisoActualizarParametroPlanilla);	
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonEliminarParametroPlanilla.setVisible(this.isPermisoEliminarParametroPlanilla);
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonCancelarParametroPlanilla.setVisible(this.isVisibilidadCeldaCancelarParametroPlanilla);							
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonGuardarCambiosParametroPlanilla.setVisible((this.isVisibilidadCeldaGuardarParametroPlanilla && this.isPermisoGuardarCambiosParametroPlanilla));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosParametroPlanilla() {
		if(ParametroPlanillaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualParametroPlanilla();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesParametroPlanilla() {
	}
	
	public void jTableDatosParametroPlanillaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarParametroPlanilla(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidParametroPlanillaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanillaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroPlanilla(this.getparametroplanilla(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroPlanilla(this.parametroplanilla);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroplanilla =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroplanilla =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroplanilla==null) {
						this.parametroplanilla = new ParametroPlanilla();
					}

					this.setVariablesFormularioToObjetoActualParametroPlanilla(this.parametroplanilla,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroPlanilla(this.parametroplanilla);
				}

				if(this.parametroplanilla.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.parametroplanilla.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroPlanilla(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanillaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanillaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanillaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaParametroPlanillaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebParametroPlanilla(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroPlanilla.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroPlanilla.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanilla =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroplanilla =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroPlanilla(this.getparametroplanilla(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroPlanilla(this.parametroplanilla);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.parametroplanillaLogic.getConnexion());

				if(this.parametroplanilla.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.parametroplanilla.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroPlanilla=(TitledBorder)this.jScrollPanelDatosParametroPlanilla.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderParametroPlanilla.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaParametroPlanillaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanillaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroPlanilla(this.getparametroplanilla(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroPlanilla(this.parametroplanilla);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroplanilla =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroplanilla =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroplanilla==null) {
						this.parametroplanilla = new ParametroPlanilla();
					}

					this.setVariablesFormularioToObjetoActualParametroPlanilla(this.parametroplanilla,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroPlanilla(this.parametroplanilla);
				}

				if(this.parametroplanilla.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.parametroplanilla.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroPlanilla(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanillaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanillaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanillaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_inicialParametroPlanillaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontableinicialBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontableinicialBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontableinicialBeanSwingJInternalFrame.sTipoBusqueda="CuentaContableInicial";

			if(!this.sFinalQueryGeneral_cuentacontableinicial.equals("")) {
				this.cuentacontableinicialBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontableinicial);
				this.cuentacontableinicialBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontableinicialBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontableinicialBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontableinicialBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContableInicial.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontableinicialBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderParametroPlanilla=null;
			TitledBorder titledBordercuentacontableinicial=null;

			if(!this.jScrollPanelDatosParametroPlanilla.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderParametroPlanilla=(TitledBorder)this.jScrollPanelDatosParametroPlanilla.getBorder();
				titledBordercuentacontableinicial=(TitledBorder)this.cuentacontableinicialBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontableinicial.setTitle(titledBorderParametroPlanilla.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contable_inicialParametroPlanillaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontableinicial=true;

			idTienePermisocuentacontableinicial=this.tienePermisosUsuarioEnPaginaWebParametroPlanilla(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontableinicial) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroPlanilla.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroPlanilla.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanilla =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroplanilla =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroPlanilla(this.getparametroplanilla(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroPlanilla(this.parametroplanilla);

				this.cuentacontableinicialBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableinicialBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableinicialBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.parametroplanillaLogic.getConnexion());

				if(this.parametroplanilla.getid_cuenta_contable_inicial()!=null) {
					this.cuentacontableinicialBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableinicialBeanSwingJInternalFrame.setIdActual(this.parametroplanilla.getid_cuenta_contable_inicial());
					this.cuentacontableinicialBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableinicialBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableinicialBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableinicialBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroPlanilla=(TitledBorder)this.jScrollPanelDatosParametroPlanilla.getBorder();
				TitledBorder titledBordercuentacontableinicial=(TitledBorder)this.cuentacontableinicialBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontableinicial.setTitle(titledBorderParametroPlanilla.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_inicialParametroPlanillaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanillaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroPlanilla(this.getparametroplanilla(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroPlanilla(this.parametroplanilla);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroplanilla =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroplanilla =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroplanilla==null) {
						this.parametroplanilla = new ParametroPlanilla();
					}

					this.setVariablesFormularioToObjetoActualParametroPlanilla(this.parametroplanilla,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroPlanilla(this.parametroplanilla);
				}

				if(this.parametroplanilla.getid_cuenta_contable_inicial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_inicial = "+this.parametroplanilla.getid_cuenta_contable_inicial().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroPlanilla(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanillaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanillaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanillaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_finalParametroPlanillaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontablefinalBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontablefinalBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontablefinalBeanSwingJInternalFrame.sTipoBusqueda="CuentaContableFinal";

			if(!this.sFinalQueryGeneral_cuentacontablefinal.equals("")) {
				this.cuentacontablefinalBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontablefinal);
				this.cuentacontablefinalBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontablefinalBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontablefinalBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontablefinalBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContableFinal.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontablefinalBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderParametroPlanilla=null;
			TitledBorder titledBordercuentacontablefinal=null;

			if(!this.jScrollPanelDatosParametroPlanilla.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderParametroPlanilla=(TitledBorder)this.jScrollPanelDatosParametroPlanilla.getBorder();
				titledBordercuentacontablefinal=(TitledBorder)this.cuentacontablefinalBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablefinal.setTitle(titledBorderParametroPlanilla.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contable_finalParametroPlanillaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontablefinal=true;

			idTienePermisocuentacontablefinal=this.tienePermisosUsuarioEnPaginaWebParametroPlanilla(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontablefinal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroPlanilla.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroPlanilla.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanilla =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroplanilla =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroPlanilla(this.getparametroplanilla(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroPlanilla(this.parametroplanilla);

				this.cuentacontablefinalBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontablefinalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontablefinalBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.parametroplanillaLogic.getConnexion());

				if(this.parametroplanilla.getid_cuenta_contable_final()!=null) {
					this.cuentacontablefinalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontablefinalBeanSwingJInternalFrame.setIdActual(this.parametroplanilla.getid_cuenta_contable_final());
					this.cuentacontablefinalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontablefinalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontablefinalBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontablefinalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroPlanilla=(TitledBorder)this.jScrollPanelDatosParametroPlanilla.getBorder();
				TitledBorder titledBordercuentacontablefinal=(TitledBorder)this.cuentacontablefinalBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablefinal.setTitle(titledBorderParametroPlanilla.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_finalParametroPlanillaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanillaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroPlanilla(this.getparametroplanilla(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroPlanilla(this.parametroplanilla);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroplanilla =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroplanilla =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroplanilla==null) {
						this.parametroplanilla = new ParametroPlanilla();
					}

					this.setVariablesFormularioToObjetoActualParametroPlanilla(this.parametroplanilla,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroPlanilla(this.parametroplanilla);
				}

				if(this.parametroplanilla.getid_cuenta_contable_final()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_final = "+this.parametroplanilla.getid_cuenta_contable_final().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroPlanilla(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanillaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanillaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanillaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCuentaContableFinalParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroPlanilla(false,false);

			this.getParametroPlanillasFK_IdCuentaContableFinal();

			this.inicializarActualizarBindingParametroPlanilla(false);

			//if(ParametroPlanillaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroPlanilla(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableInicialParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroPlanilla(false,false);

			this.getParametroPlanillasFK_IdCuentaContableInicial();

			this.inicializarActualizarBindingParametroPlanilla(false);

			//if(ParametroPlanillaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroPlanilla(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaParametroPlanillaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroPlanilla(false,false);

			this.getParametroPlanillasFK_IdEmpresa();

			this.inicializarActualizarBindingParametroPlanilla(false);

			//if(ParametroPlanillaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroPlanilla(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroplanillaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameParametroPlanilla() {
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
			this.jInternalFrameDetalleFormParametroPlanilla.setVisible(false);	    			
			this.jInternalFrameDetalleFormParametroPlanilla.dispose();
			this.jInternalFrameDetalleFormParametroPlanilla=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoParametroPlanilla!=null) {
			this.jInternalFrameReporteDinamicoParametroPlanilla.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoParametroPlanilla.dispose();
			this.jInternalFrameReporteDinamicoParametroPlanilla=null;
		}
		
		if(this.jInternalFrameImportacionParametroPlanilla!=null) {
			this.jInternalFrameImportacionParametroPlanilla.setVisible(false);	    			
			this.jInternalFrameImportacionParametroPlanilla.dispose();
			this.jInternalFrameImportacionParametroPlanilla=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessParametroPlanilla();
			
			ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
			
			
			if(sTipo.equals("NuevoParametroPlanilla")) {
				jButtonNuevoParametroPlanillaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarParametroPlanilla")) {
				jButtonDuplicarParametroPlanillaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarParametroPlanilla")) {
				jButtonCopiarParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("VerFormParametroPlanilla")) {
				jButtonVerFormParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarParametroPlanilla")) {
				jButtonNuevoParametroPlanillaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarParametroPlanilla")) {
				jButtonDuplicarParametroPlanillaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoParametroPlanilla")) {
				jButtonNuevoParametroPlanillaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarParametroPlanilla")) {
				jButtonDuplicarParametroPlanillaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesParametroPlanilla")) {
				jButtonNuevoParametroPlanillaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarParametroPlanilla")) {
				jButtonNuevoParametroPlanillaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesParametroPlanilla")) {
				jButtonNuevoParametroPlanillaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarParametroPlanilla")) {
				jButtonModificarParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarParametroPlanilla")) {
				jButtonModificarParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarParametroPlanilla")) {
				jButtonModificarParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarParametroPlanilla")) {
				jButtonActualizarParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarParametroPlanilla")) {
				jButtonActualizarParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarParametroPlanilla")) {
				jButtonActualizarParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("EliminarParametroPlanilla")) {
				jButtonEliminarParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarParametroPlanilla")) {
				jButtonEliminarParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarParametroPlanilla")) {
				jButtonEliminarParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("CancelarParametroPlanilla")) {
				jButtonCancelarParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarParametroPlanilla")) {
				jButtonCancelarParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarParametroPlanilla")) {
				jButtonCancelarParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("CerrarParametroPlanilla")) {
				jButtonCerrarParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarParametroPlanilla")) {
				jButtonCerrarParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarParametroPlanilla")) {
				jButtonCerrarParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarParametroPlanilla")) {
				jButtonMostrarOcultarParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarParametroPlanilla")) {
				jButtonCancelarParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosParametroPlanilla")) {
				jButtonGuardarCambiosParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarParametroPlanilla")) {
				jButtonGuardarCambiosParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarParametroPlanilla")) {
				jButtonCopiarParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarParametroPlanilla")) {
				jButtonVerFormParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosParametroPlanilla")) {
				jButtonGuardarCambiosParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarParametroPlanilla")) {
				jButtonCopiarParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormParametroPlanilla")) {
				jButtonVerFormParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaParametroPlanilla")) {
				jButtonGuardarCambiosParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarParametroPlanilla")) {
				jButtonGuardarCambiosParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaParametroPlanilla")) {
				jButtonGuardarCambiosParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionParametroPlanilla")) {
				jButtonRecargarInformacionParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarParametroPlanilla")) {
				jButtonRecargarInformacionParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionParametroPlanilla")) {
				jButtonRecargarInformacionParametroPlanillaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresParametroPlanilla")) {
				jButtonAnterioresParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarParametroPlanilla")) {
				jButtonAnterioresParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreParametroPlanilla")) {
				jButtonAnterioresParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesParametroPlanilla")) {
				jButtonSiguientesParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarParametroPlanilla")) {
				jButtonSiguientesParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesParametroPlanilla")) {
				jButtonSiguientesParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByParametroPlanilla") || sTipo.equals("MenuItemDetalleAbrirOrderByParametroPlanilla")) {
				jButtonAbrirOrderByParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarParametroPlanilla") || sTipo.equals("MenuItemDetalleMostrarOcultarParametroPlanilla")) {
				jButtonMostrarOcultarParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosParametroPlanilla")) {
				jButtonNuevoGuardarCambiosParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarParametroPlanilla")) {
				jButtonNuevoGuardarCambiosParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosParametroPlanilla")) {
				jButtonNuevoGuardarCambiosParametroPlanillaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoParametroPlanilla")) {
				jButtonCerrarReporteDinamicoParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoParametroPlanilla")) {
				jButtonGenerarReporteDinamicoParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoParametroPlanilla")) {
				
				jButtonGenerarExcelReporteDinamicoParametroPlanillaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionParametroPlanilla")) {
				jButtonCerrarImportacionParametroPlanillaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionParametroPlanilla")) {
				
				jButtonGenerarImportacionParametroPlanillaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionParametroPlanilla")) {
				
				jButtonAbrirImportacionParametroPlanillaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesParametroPlanilla")) {
				jComboBoxTiposAccionesParametroPlanillaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesParametroPlanilla")) {
				jComboBoxTiposRelacionesParametroPlanillaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioParametroPlanilla")) {
				jComboBoxTiposAccionesParametroPlanillaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarParametroPlanilla")) {
				
				jComboBoxTiposSeleccionarParametroPlanillaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralParametroPlanilla")) {
				jTextFieldValorCampoGeneralParametroPlanillaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByParametroPlanilla")) {
				jButtonAbrirOrderByParametroPlanillaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarParametroPlanilla")) {
				jButtonAbrirOrderByParametroPlanillaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByParametroPlanilla")) {
				jButtonCerrarOrderByParametroPlanillaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroPlanillaBusqueda")) {
				this.jButtonidParametroPlanillaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroPlanillaUpdate")) {
				this.jButtonid_empresaParametroPlanillaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroPlanillaBusqueda")) {
				this.jButtonid_empresaParametroPlanillaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_inicialParametroPlanilla")) {
				this.jButtonid_cuenta_contable_inicialParametroPlanillaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_inicialParametroPlanillaArbol")) {
				this.abrirFrameTreeCuentaContableInicial("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_inicialParametroPlanillaUpdate")) {
				this.jButtonid_cuenta_contable_inicialParametroPlanillaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_inicialParametroPlanillaBusqueda")) {
				this.jButtonid_cuenta_contable_inicialParametroPlanillaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_finalParametroPlanilla")) {
				this.jButtonid_cuenta_contable_finalParametroPlanillaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_finalParametroPlanillaArbol")) {
				this.abrirFrameTreeCuentaContableFinal("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_finalParametroPlanillaUpdate")) {
				this.jButtonid_cuenta_contable_finalParametroPlanillaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_finalParametroPlanillaBusqueda")) {
				this.jButtonid_cuenta_contable_finalParametroPlanillaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_cuenta_contable_finalParametroPlanilla")) {
				this.jButtonid_cuenta_contable_finalParametroPlanillaActionPerformed(evt);
			}
			else if(sTipo.equals("id_cuenta_contable_inicialParametroPlanilla")) {
				this.jButtonid_cuenta_contable_inicialParametroPlanillaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCuentaContableFinalParametroPlanilla")) {
				this.jButtonFK_IdCuentaContableFinalParametroPlanillaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContableInicialParametroPlanilla")) {
				this.jButtonFK_IdCuentaContableInicialParametroPlanillaActionPerformed(evt);
			}
			
			;
			
			
			ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessParametroPlanilla();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroPlanillaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroplanilla);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroplanilla);
				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
				
				


				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroPlanilla.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroPlanilla.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ParametroPlanilla parametroplanillaLocal=null;
			
			if(!this.getEsControlTabla()) {
				parametroplanillaLocal=this.parametroplanilla;
			} else {
				parametroplanillaLocal=this.parametroplanillaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroplanilla);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroplanilla);
				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
							
				
				


				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroPlanilla.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroPlanilla.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroPlanillaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanillaAnterior =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroplanillaAnterior =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
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
			
			ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
			
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
			
			


			
			ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroPlanillaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroplanilla);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroplanilla);
				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
								
						
				


				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroPlanilla.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroPlanilla.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroplanilla);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroplanilla);
				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
								
				
				


				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroPlanilla.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroPlanilla.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroPlanillaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanillaAnterior =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroplanillaAnterior =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroplanilla);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroplanilla);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroPlanillaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanillaAnterior =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroplanillaAnterior =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroPlanillaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroplanilla);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametroplanilla);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroplanilla);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroplanilla);
				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
							
				
				


				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroPlanilla.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroPlanilla.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroPlanillaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroplanillaAnterior =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametroplanillaAnterior =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
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
			
			ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
			
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
			
			


			
			ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroPlanillaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroplanilla);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametroplanilla);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroplanilla);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroplanilla);
				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
								
				
				


				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroPlanilla.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroPlanilla.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroPlanillaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanillaAnterior =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroplanillaAnterior =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroPlanillaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroplanilla);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametroplanilla);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroPlanillaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroplanilla);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroplanilla);
				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosParametroPlanilla")) {
					jCheckBoxSeleccionarTodosParametroPlanillaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosParametroPlanilla")) {
					jCheckBoxSeleccionadosParametroPlanillaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarParametroPlanilla")) {
					
				}
				
				


				
				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroPlanilla.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroPlanilla.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroplanilla);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.parametroplanilla);
				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
												
				
				


				
				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroPlanilla.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroPlanilla.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroPlanillaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroplanillaAnterior =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametroplanillaAnterior =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroPlanillaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroplanilla);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroplanilla);
				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
				
				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
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
			
			ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
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
			
			


			
			ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroPlanillaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroplanilla);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroplanilla);
				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroPlanilla.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroPlanilla.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroplanilla);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroplanilla);
				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
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
				
				


				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroPlanilla.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroPlanilla.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroPlanillaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroplanillaAnterior =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroplanillaAnterior =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarParametroPlanilla")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosParametroPlanillaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosParametroPlanilla.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.parametroplanilla =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.parametroplanilla =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.parametroplanilla);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarParametroPlanilla")) {
				
				}
				
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarParametroPlanilla")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosParametroPlanilla.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarParametroPlanilla")) {
			
			}
			
			ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessParametroPlanilla();
			
			ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
			
			if(sTipo.equals("NuevoParametroPlanilla")) {
				jButtonNuevoParametroPlanillaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarParametroPlanilla")) {
				jButtonDuplicarParametroPlanillaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarParametroPlanilla")) {
				jButtonCopiarParametroPlanillaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormParametroPlanilla")) {
				jButtonVerFormParametroPlanillaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesParametroPlanilla")) {
				jButtonNuevoParametroPlanillaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarParametroPlanilla")) {
				jButtonModificarParametroPlanillaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarParametroPlanilla")) {
				jButtonActualizarParametroPlanillaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarParametroPlanilla")) {
				jButtonEliminarParametroPlanillaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaParametroPlanilla")) {
				jButtonGuardarCambiosParametroPlanillaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarParametroPlanilla")) {
				jButtonCancelarParametroPlanillaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarParametroPlanilla")) {
				jButtonCerrarParametroPlanillaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosParametroPlanilla")) {
				jButtonGuardarCambiosParametroPlanillaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosParametroPlanilla")) {
				jButtonNuevoGuardarCambiosParametroPlanillaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByParametroPlanilla")) {
				jButtonAbrirOrderByParametroPlanillaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionParametroPlanilla")) {
				jButtonRecargarInformacionParametroPlanillaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresParametroPlanilla")) {
				jButtonAnterioresParametroPlanillaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesParametroPlanilla")) {
				jButtonSiguientesParametroPlanillaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroPlanillaBusqueda")) {
				this.jButtonidParametroPlanillaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroPlanillaUpdate")) {
				this.jButtonid_empresaParametroPlanillaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroPlanillaBusqueda")) {
				this.jButtonid_empresaParametroPlanillaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_inicialParametroPlanilla")) {
				this.jButtonid_cuenta_contable_inicialParametroPlanillaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_inicialParametroPlanillaArbol")) {
				this.abrirFrameTreeCuentaContableInicial("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_inicialParametroPlanillaUpdate")) {
				this.jButtonid_cuenta_contable_inicialParametroPlanillaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_inicialParametroPlanillaBusqueda")) {
				this.jButtonid_cuenta_contable_inicialParametroPlanillaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_finalParametroPlanilla")) {
				this.jButtonid_cuenta_contable_finalParametroPlanillaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_finalParametroPlanillaArbol")) {
				this.abrirFrameTreeCuentaContableFinal("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_finalParametroPlanillaUpdate")) {
				this.jButtonid_cuenta_contable_finalParametroPlanillaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_finalParametroPlanillaBusqueda")) {
				this.jButtonid_cuenta_contable_finalParametroPlanillaBusquedaActionPerformed(evt);
			}
			
			ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessParametroPlanilla();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameParametroPlanilla")) {
				closingInternalFrameParametroPlanilla();
				
			} else if(sTipo.equals("jButtonCancelarParametroPlanilla")) {
				JInternalFrameBase jInternalFrameDetalleFormParametroPlanilla = (JInternalFrameBase)evt.getSource();
	            	
	            ParametroPlanillaBeanSwingJInternalFrame jInternalFrameParent=(ParametroPlanillaBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroPlanilla.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarParametroPlanillaActionPerformed(null);
			}
			
			ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametroplanilla,new Object(),this.parametroplanillaParameterGeneral,this.parametroplanillaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormParametroPlanilla(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormParametroPlanilla(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormParametroPlanilla(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.parametroplanilla)) {
			if(!esControlTabla) {
				if(ParametroPlanillaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualParametroPlanilla(this.parametroplanilla,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroPlanilla(this.parametroplanilla);			
				}
				
				if(this.parametroplanillaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualParametroPlanilla(this.parametroplanilla,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametroplanillaReturnGeneral=parametroplanillaLogic.procesarEventosParametroPlanillasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametroplanillaLogic.getParametroPlanillas(),this.parametroplanilla,this.parametroplanillaParameterGeneral,this.isEsNuevoParametroPlanilla,classes);//this.parametroplanillaLogic.getParametroPlanilla()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanParametroPlanilla(this.parametroplanillaReturnGeneral,this.parametroplanillaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.parametroplanillaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanParametroPlanilla(classes,this.parametroplanillaReturnGeneral,this.parametroplanillaBean,false);
					}
						
					if(this.parametroplanillaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyParametroPlanilla(this.parametroplanillaReturnGeneral.getParametroPlanilla());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioParametroPlanilla(this.parametroplanillaReturnGeneral.getParametroPlanilla());	
					}
						
					if(this.parametroplanillaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioParametroPlanilla(this.parametroplanillaReturnGeneral.getParametroPlanilla(),classes);//this.parametroplanillaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioParametroPlanilla(this.parametroplanilla,classes);//this.parametroplanillaBean);									
				}
			
				if(ParametroPlanillaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualParametroPlanilla(this.parametroplanilla,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroPlanilla(this.parametroplanilla);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.parametroplanillaAnterior!=null) {
						this.parametroplanilla=this.parametroplanillaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametroplanillaReturnGeneral=parametroplanillaLogic.procesarEventosParametroPlanillasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametroplanillaLogic.getParametroPlanillas(),this.parametroplanilla,this.parametroplanillaParameterGeneral,this.isEsNuevoParametroPlanilla,classes);//this.parametroplanillaLogic.getParametroPlanilla()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametroplanillaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametroplanillaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.parametroplanillaReturnGeneral.getParametroPlanilla(),parametroplanillaLogic.getParametroPlanillas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.parametroplanillaReturnGeneral.getParametroPlanilla(),this.parametroplanillas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosParametroPlanilla.repaint();
				
				//((AbstractTableModel) this.jTableDatosParametroPlanilla.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosParametroPlanilla();
			}
		}
	}
	
	public void actualizarVisualTableDatosParametroPlanilla() throws Exception {
		
		ParametroPlanillaModel parametroplanillaModel=(ParametroPlanillaModel)this.jTableDatosParametroPlanilla.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametroplanillaModel.parametroplanillas=this.parametroplanillaLogic.getParametroPlanillas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			parametroplanillaModel.parametroplanillas=this.parametroplanillas;
		}
		
		
		((ParametroPlanillaModel) this.jTableDatosParametroPlanilla.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaParametroPlanilla() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getparametroplanillaAnterior(),this.parametroplanillaLogic.getParametroPlanillas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getparametroplanillaAnterior(),this.parametroplanillas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosParametroPlanilla();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioParametroPlanilla(ParametroPlanilla parametroplanilla,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
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
										
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametroplanilla,new Object(),generalEntityParameterGeneral,this.parametroplanillaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.parametroplanillaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ParametroPlanillaConstantesFunciones.getClassesRelationshipsOfParametroPlanilla(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ParametroPlanillaConstantesFunciones.getClassesRelationshipsFromStringsOfParametroPlanilla(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormParametroPlanilla(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ParametroPlanillaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametroplanilla,new Object(),generalEntityParameterGeneral,this.parametroplanillaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioParametroPlanilla(ParametroPlanillaBean parametroplanillaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanParametroPlanilla(ArrayList<Classe> classes,ParametroPlanillaReturnGeneral parametroplanillaReturnGeneral,ParametroPlanillaBean parametroplanillaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualParametroPlanilla(ParametroPlanilla parametroplanilla,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.parametroplanilla)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormParametroPlanilla = new ParametroPlanillaDetalleFormJInternalFrame(jDesktopPane,this.parametroplanillaSessionBean.getConGuardarRelaciones(),this.parametroplanillaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroPlanilla);
		this.jInternalFrameDetalleFormParametroPlanilla.setVisible(false);
		this.jInternalFrameDetalleFormParametroPlanilla.setSelected(false);						
		
		this.jInternalFrameDetalleFormParametroPlanilla.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormParametroPlanilla.parametroplanillaLogic=this.parametroplanillaLogic;
		
		this.cargarCombosFrameForeignKeyParametroPlanilla("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroPlanilla();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroPlanilla();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyParametroPlanilla("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyParametroPlanilla();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormParametroPlanilla.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroPlanilla"));
		
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonModificarParametroPlanilla.addActionListener(new ButtonActionListener(this,"ModificarParametroPlanilla"));

		
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonModificarToolBarParametroPlanilla.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroPlanilla"));
					
		this.jInternalFrameDetalleFormParametroPlanilla.jMenuItemModificarParametroPlanilla.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroPlanilla"));		
		
		
		
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonActualizarParametroPlanilla.addActionListener (new ButtonActionListener(this,"ActualizarParametroPlanilla"));
		
		
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonActualizarToolBarParametroPlanilla.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroPlanilla"));
						
		this.jInternalFrameDetalleFormParametroPlanilla.jMenuItemActualizarParametroPlanilla.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroPlanilla"));		
		
		
		
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonEliminarParametroPlanilla.addActionListener (new ButtonActionListener(this,"EliminarParametroPlanilla"));
		
		
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonEliminarToolBarParametroPlanilla.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroPlanilla"));
								
		this.jInternalFrameDetalleFormParametroPlanilla.jMenuItemEliminarParametroPlanilla.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroPlanilla"));		
		
		
		
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonCancelarParametroPlanilla.addActionListener (new ButtonActionListener(this,"CancelarParametroPlanilla"));
		
		
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonCancelarToolBarParametroPlanilla.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroPlanilla"));
					
		this.jInternalFrameDetalleFormParametroPlanilla.jMenuItemCancelarParametroPlanilla.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroPlanilla"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormParametroPlanilla.jMenuItemDetalleCerrarParametroPlanilla.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroPlanilla"));		
		
		
		
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonGuardarCambiosToolBarParametroPlanilla.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroPlanilla"));
		
		
		
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonGuardarCambiosToolBarParametroPlanilla.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroPlanilla"));
		
		
		
		this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxTiposAccionesFormularioParametroPlanilla.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroPlanilla"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonidParametroPlanillaBusqueda.addActionListener(new ButtonActionListener(this,"idParametroPlanillaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_empresaParametroPlanillaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroPlanillaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_empresaParametroPlanillaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroPlanillaBusqueda"));
		//jButtonid_cuenta_contable_inicialParametroPlanilla.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_inicialParametroPlanillaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_inicialParametroPlanilla.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_inicialParametroPlanilla"));
		//jButtonid_cuenta_contable_inicialParametroPlanillaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableInicial("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_inicialParametroPlanillaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_inicialParametroPlanillaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_inicialParametroPlanillaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_inicialParametroPlanillaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_inicialParametroPlanillaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_inicialParametroPlanillaBusqueda"));
		//jButtonid_cuenta_contable_finalParametroPlanilla.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_finalParametroPlanillaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_finalParametroPlanilla.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_finalParametroPlanilla"));
		//jButtonid_cuenta_contable_finalParametroPlanillaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableFinal("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_finalParametroPlanillaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_finalParametroPlanillaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_finalParametroPlanillaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_finalParametroPlanillaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_finalParametroPlanillaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_finalParametroPlanillaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormParametroPlanilla.jTabbedPaneRelacionesParametroPlanilla.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroPlanilla"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameParametroPlanilla"));
		
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroPlanilla.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroPlanilla"));
		}
		
		this.jTableDatosParametroPlanilla.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarParametroPlanilla"));
		
		this.jTableDatosParametroPlanilla.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarParametroPlanilla"));
		
		this.jButtonNuevoParametroPlanilla.addActionListener(new ButtonActionListener(this,"NuevoParametroPlanilla"));
		
		this.jButtonDuplicarParametroPlanilla.addActionListener(new ButtonActionListener(this,"DuplicarParametroPlanilla"));
		
		this.jButtonCopiarParametroPlanilla.addActionListener(new ButtonActionListener(this,"CopiarParametroPlanilla"));
		
		this.jButtonVerFormParametroPlanilla.addActionListener(new ButtonActionListener(this,"VerFormParametroPlanilla"));
		
		
		this.jButtonNuevoToolBarParametroPlanilla.addActionListener(new ButtonActionListener(this,"NuevoToolBarParametroPlanilla"));
			
		this.jButtonDuplicarToolBarParametroPlanilla.addActionListener(new ButtonActionListener(this,"DuplicarToolBarParametroPlanilla"));
			
		this.jMenuItemNuevoParametroPlanilla.addActionListener (new ButtonActionListener(this,"MenuItemNuevoParametroPlanilla"));
			
		this.jMenuItemDuplicarParametroPlanilla.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarParametroPlanilla"));		
		
		
		this.jButtonNuevoRelacionesParametroPlanilla.addActionListener (new ButtonActionListener(this,"NuevoRelacionesParametroPlanilla"));
		
		
		this.jButtonNuevoRelacionesToolBarParametroPlanilla.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarParametroPlanilla"));
			
		this.jMenuItemNuevoRelacionesParametroPlanilla.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesParametroPlanilla"));		
		
		
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonModificarParametroPlanilla.addActionListener(new ButtonActionListener(this,"ModificarParametroPlanilla"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonModificarToolBarParametroPlanilla.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroPlanilla"));
			
			this.jInternalFrameDetalleFormParametroPlanilla.jMenuItemModificarParametroPlanilla.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroPlanilla"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonActualizarParametroPlanilla.addActionListener (new ButtonActionListener(this,"ActualizarParametroPlanilla"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonActualizarToolBarParametroPlanilla.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroPlanilla"));
				
			this.jInternalFrameDetalleFormParametroPlanilla.jMenuItemActualizarParametroPlanilla.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroPlanilla"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonEliminarParametroPlanilla.addActionListener (new ButtonActionListener(this,"EliminarParametroPlanilla"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonEliminarToolBarParametroPlanilla.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroPlanilla"));
						
			this.jInternalFrameDetalleFormParametroPlanilla.jMenuItemEliminarParametroPlanilla.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroPlanilla"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonCancelarParametroPlanilla.addActionListener (new ButtonActionListener(this,"CancelarParametroPlanilla"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonCancelarToolBarParametroPlanilla.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroPlanilla"));
			
			this.jInternalFrameDetalleFormParametroPlanilla.jMenuItemCancelarParametroPlanilla.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroPlanilla"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarParametroPlanilla.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarParametroPlanilla"));		
		
		
		this.jButtonCerrarParametroPlanilla.addActionListener (new ButtonActionListener(this,"CerrarParametroPlanilla"));
		
		
		this.jButtonCerrarToolBarParametroPlanilla.addActionListener (new ButtonActionListener(this,"CerrarToolBarParametroPlanilla"));
			
		this.jMenuItemCerrarParametroPlanilla.addActionListener (new ButtonActionListener(this,"MenuItemCerrarParametroPlanilla"));
			
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroPlanilla.jMenuItemDetalleCerrarParametroPlanilla.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroPlanilla"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonGuardarCambiosParametroPlanilla.addActionListener (new ButtonActionListener(this,"GuardarCambiosParametroPlanilla"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonGuardarCambiosToolBarParametroPlanilla.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroPlanilla"));
		}
		
		this.jButtonCopiarToolBarParametroPlanilla.addActionListener (new ButtonActionListener(this,"CopiarToolBarParametroPlanilla"));
			
		this.jButtonVerFormToolBarParametroPlanilla.addActionListener (new ButtonActionListener(this,"VerFormToolBarParametroPlanilla"));
		
		this.jMenuItemGuardarCambiosParametroPlanilla.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosParametroPlanilla"));
			
		this.jMenuItemCopiarParametroPlanilla.addActionListener (new ButtonActionListener(this,"MenuItemCopiarParametroPlanilla"));		
		
		this.jMenuItemVerFormParametroPlanilla.addActionListener (new ButtonActionListener(this,"MenuItemVerFormParametroPlanilla"));		
		
		
		this.jButtonGuardarCambiosTablaParametroPlanilla.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroPlanilla"));
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroPlanilla.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarParametroPlanilla"));
			
		this.jMenuItemGuardarCambiosTablaParametroPlanilla.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroPlanilla"));		
		
		
		
		this.jButtonRecargarInformacionParametroPlanilla.addActionListener (new ButtonActionListener(this,"RecargarInformacionParametroPlanilla"));
					
		this.jButtonRecargarInformacionToolBarParametroPlanilla.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarParametroPlanilla"));
		
		this.jMenuItemRecargarInformacionParametroPlanilla.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionParametroPlanilla"));		
		
		
		
		this.jButtonAnterioresParametroPlanilla.addActionListener (new ButtonActionListener(this,"AnterioresParametroPlanilla"));
		
		
		this.jButtonAnterioresToolBarParametroPlanilla.addActionListener (new ButtonActionListener(this,"AnterioresToolBarParametroPlanilla"));
		
		this.jMenuItemAnterioresParametroPlanilla.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresParametroPlanilla"));		
		
		
		this.jButtonSiguientesParametroPlanilla.addActionListener (new ButtonActionListener(this,"SiguientesParametroPlanilla"));
		
		
		this.jButtonSiguientesToolBarParametroPlanilla.addActionListener (new ButtonActionListener(this,"SiguientesToolBarParametroPlanilla"));
			
		this.jMenuItemSiguientesParametroPlanilla.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesParametroPlanilla"));
			
		this.jMenuItemAbrirOrderByParametroPlanilla.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByParametroPlanilla"));
			
		this.jMenuItemMostrarOcultarParametroPlanilla.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarParametroPlanilla"));
			
		this.jMenuItemDetalleAbrirOrderByParametroPlanilla.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByParametroPlanilla"));
			
		this.jMenuItemDetalleMostarOcultarParametroPlanilla.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarParametroPlanilla"));		
		
		
		this.jButtonNuevoGuardarCambiosParametroPlanilla.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosParametroPlanilla"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroPlanilla.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarParametroPlanilla"));
			
		this.jMenuItemNuevoGuardarCambiosParametroPlanilla.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosParametroPlanilla"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosParametroPlanilla.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosParametroPlanilla"));

		this.jCheckBoxSeleccionadosParametroPlanilla.addItemListener(new CheckBoxItemListener(this,"SeleccionadosParametroPlanilla"));
		
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxTiposAccionesFormularioParametroPlanilla.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroPlanilla"));
		}
		
		
		this.jComboBoxTiposRelacionesParametroPlanilla.addActionListener (new ButtonActionListener(this,"TiposRelacionesParametroPlanilla"));
			
		this.jComboBoxTiposAccionesParametroPlanilla.addActionListener (new ButtonActionListener(this,"TiposAccionesParametroPlanilla"));
					
		this.jComboBoxTiposSeleccionarParametroPlanilla.addActionListener (new ButtonActionListener(this,"TiposSeleccionarParametroPlanilla"));
			
		this.jTextFieldValorCampoGeneralParametroPlanilla.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralParametroPlanilla"));		
		
		
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonidParametroPlanillaBusqueda.addActionListener(new ButtonActionListener(this,"idParametroPlanillaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_empresaParametroPlanillaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroPlanillaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_empresaParametroPlanillaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroPlanillaBusqueda"));
		//jButtonid_cuenta_contable_inicialParametroPlanilla.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_inicialParametroPlanillaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_inicialParametroPlanilla.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_inicialParametroPlanilla"));
		//jButtonid_cuenta_contable_inicialParametroPlanillaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableInicial("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_inicialParametroPlanillaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_inicialParametroPlanillaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_inicialParametroPlanillaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_inicialParametroPlanillaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_inicialParametroPlanillaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_inicialParametroPlanillaBusqueda"));
		//jButtonid_cuenta_contable_finalParametroPlanilla.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_finalParametroPlanillaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_finalParametroPlanilla.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_finalParametroPlanilla"));
		//jButtonid_cuenta_contable_finalParametroPlanillaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableFinal("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_finalParametroPlanillaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_finalParametroPlanillaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_finalParametroPlanillaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_finalParametroPlanillaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_finalParametroPlanillaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_finalParametroPlanillaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCuentaContableFinalParametroPlanilla.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableFinalParametroPlanilla"));

			this.jButtonBuscarFK_IdCuentaContableFinalid_cuenta_contable_finalParametroPlanilla.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_finalParametroPlanilla"));

			this.jButtonFK_IdCuentaContableInicialParametroPlanilla.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableInicialParametroPlanilla"));

			this.jButtonBuscarFK_IdCuentaContableInicialid_cuenta_contable_inicialParametroPlanilla.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_inicialParametroPlanilla"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoParametroPlanilla!=null) {
				this.jInternalFrameReporteDinamicoParametroPlanilla.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroPlanilla"));
				this.jInternalFrameReporteDinamicoParametroPlanilla.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroPlanilla"));
				this.jInternalFrameReporteDinamicoParametroPlanilla.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroPlanilla"));
			}
			
			//this.jButtonCerrarReporteDinamicoParametroPlanilla.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroPlanilla"));				
			//this.jButtonGenerarReporteDinamicoParametroPlanilla.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroPlanilla"));
			//this.jButtonGenerarExcelReporteDinamicoParametroPlanilla.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroPlanilla"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionParametroPlanilla!=null) {
				this.jInternalFrameImportacionParametroPlanilla.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroPlanilla"));
				this.jInternalFrameImportacionParametroPlanilla.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroPlanilla"));
				this.jInternalFrameImportacionParametroPlanilla.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroPlanilla"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByParametroPlanilla.addActionListener (new ButtonActionListener(this,"AbrirOrderByParametroPlanilla"));
			
			this.jButtonAbrirOrderByToolBarParametroPlanilla.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarParametroPlanilla"));			
			
			if(this.jInternalFrameOrderByParametroPlanilla!=null) {
				this.jInternalFrameOrderByParametroPlanilla.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroPlanilla"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroPlanilla.jTabbedPaneRelacionesParametroPlanilla.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroPlanilla"));
		
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
            		closingInternalFrameParametroPlanilla();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormParametroPlanilla.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormParametroPlanilla = (JInternalFrameBase)event.getSource();
	            	
	            ParametroPlanillaBeanSwingJInternalFrame jInternalFrameParent=(ParametroPlanillaBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroPlanilla.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarParametroPlanillaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosParametroPlanilla.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosParametroPlanillaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosParametroPlanilla.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosParametroPlanilla.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroPlanillaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroPlanillaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroPlanillaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoParametroPlanilla";
		inputMap = this.jButtonNuevoParametroPlanilla.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoParametroPlanilla.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroPlanillaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroPlanillaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroPlanillaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroPlanillaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesParametroPlanilla";
		inputMap = this.jButtonNuevoRelacionesParametroPlanilla.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesParametroPlanilla.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroPlanillaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarParametroPlanilla";
		inputMap = this.jButtonModificarParametroPlanilla.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarParametroPlanilla.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarParametroPlanillaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarParametroPlanilla";
		inputMap = this.jButtonActualizarParametroPlanilla.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarParametroPlanilla.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarParametroPlanillaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarParametroPlanilla";
		inputMap = this.jButtonEliminarParametroPlanilla.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarParametroPlanilla.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarParametroPlanillaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarParametroPlanilla";
		inputMap = this.jButtonCancelarParametroPlanilla.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarParametroPlanilla.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarParametroPlanillaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarParametroPlanilla";
		inputMap = this.jButtonCerrarParametroPlanilla.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarParametroPlanilla.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarParametroPlanillaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonGuardarCambiosParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosParametroPlanilla";
		inputMap = this.jInternalFrameDetalleFormParametroPlanilla.jButtonGuardarCambiosParametroPlanilla.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonGuardarCambiosParametroPlanilla.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosParametroPlanillaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosParametroPlanilla.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosParametroPlanillaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesParametroPlanilla.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesParametroPlanillaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarParametroPlanilla.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarParametroPlanillaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralParametroPlanilla.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralParametroPlanillaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonidParametroPlanillaBusqueda.addActionListener(new ButtonActionListener(this,"idParametroPlanillaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_empresaParametroPlanillaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroPlanillaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_empresaParametroPlanillaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroPlanillaBusqueda"));
		//jButtonid_cuenta_contable_inicialParametroPlanilla.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_inicialParametroPlanillaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_inicialParametroPlanilla.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_inicialParametroPlanilla"));
		//jButtonid_cuenta_contable_inicialParametroPlanillaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableInicial("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_inicialParametroPlanillaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_inicialParametroPlanillaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_inicialParametroPlanillaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_inicialParametroPlanillaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_inicialParametroPlanillaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_inicialParametroPlanillaBusqueda"));
		//jButtonid_cuenta_contable_finalParametroPlanilla.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_finalParametroPlanillaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_finalParametroPlanilla.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_finalParametroPlanilla"));
		//jButtonid_cuenta_contable_finalParametroPlanillaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableFinal("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_finalParametroPlanillaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_finalParametroPlanillaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_finalParametroPlanillaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_finalParametroPlanillaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_finalParametroPlanillaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_finalParametroPlanillaBusqueda"));
		
		
		this.jButtonFK_IdCuentaContableFinalParametroPlanilla.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableFinalParametroPlanilla"));

		this.jButtonBuscarFK_IdCuentaContableFinalid_cuenta_contable_finalParametroPlanilla.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_finalParametroPlanilla"));

		this.jButtonFK_IdCuentaContableInicialParametroPlanilla.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableInicialParametroPlanilla"));

		this.jButtonBuscarFK_IdCuentaContableInicialid_cuenta_contable_inicialParametroPlanilla.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_inicialParametroPlanilla"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionParametroPlanilla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionParametroPlanillaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarParametroPlanillaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarParametroPlanilla.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosParametroPlanilla(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ParametroPlanilla parametroplanillaAux:this.parametroplanillaLogic.getParametroPlanillas()) {
					parametroplanillaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroPlanilla parametroplanillaAux:parametroplanillas) {
					parametroplanillaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosParametroPlanillaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroPlanilla(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroPlanilla parametroplanillaAux:this.parametroplanillaLogic.getParametroPlanillas()) {
						parametroplanillaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroPlanilla parametroplanillaAux:parametroplanillas) {
						parametroplanillaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ParametroPlanilla parametroplanillaAux:this.parametroplanillaLogic.getParametroPlanillas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroPlanilla parametroplanillaAux:parametroplanillas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaParametroPlanilla(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroPlanilla.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroPlanilla.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroPlanilla,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosParametroPlanillaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroPlanilla(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosParametroPlanilla.getSelectedRows();
			
			ParametroPlanilla parametroplanillaLocal=new ParametroPlanilla();
			
			//this.seleccionarTodosParametroPlanilla(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroplanillaLocal =(ParametroPlanilla) this.parametroplanillaLogic.getParametroPlanillas().toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					parametroplanillaLocal =(ParametroPlanilla) this.parametroplanillas.toArray()[this.jTableDatosParametroPlanilla.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				parametroplanillaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroPlanilla parametroplanillaAux:this.parametroplanillaLogic.getParametroPlanillas()) {
						parametroplanillaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroPlanilla parametroplanillaAux:parametroplanillas) {
						parametroplanillaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaParametroPlanilla(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroPlanilla.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroPlanilla.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroPlanilla,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualParametroPlanillaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarParametroPlanillaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralParametroPlanillaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingParametroPlanilla(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralParametroPlanilla.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroPlanilla parametroplanillaAux:this.parametroplanillaLogic.getParametroPlanillas()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroPlanilla parametroplanillaAux:parametroplanillas) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaParametroPlanilla(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesParametroPlanillaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingParametroPlanilla(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioParametroPlanilla=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesParametroPlanilla.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxTiposAccionesFormularioParametroPlanilla.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteParametroPlanilla) {				
					conSplash=true;//false;										
					
					//this.startProcessParametroPlanilla(conSplash);
				
					this.generarReporteParametroPlanillasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroPlanilla.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxTiposAccionesFormularioParametroPlanilla.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoParametroPlanillasSeleccionados();
				//this.jComboBoxTiposAccionesParametroPlanilla.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroPlanillasSeleccionados(false);
				//this.jComboBoxTiposAccionesParametroPlanilla.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroPlanillasSeleccionados(true);
				//this.jComboBoxTiposAccionesParametroPlanilla.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroPlanilla();
				
				this.exportarParametroPlanillasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroPlanilla.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxTiposAccionesFormularioParametroPlanilla.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionParametroPlanillas();
				//this.importarParametroPlanillas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroPlanilla.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxTiposAccionesFormularioParametroPlanilla.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroPlanilla();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelParametroPlanillasSeleccionados();
				//this.jComboBoxTiposAccionesParametroPlanilla.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Parametro Planilla", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessParametroPlanilla();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoParametroPlanilla)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyParametroPlanilla(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Planilla",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroPlanilla.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxTiposAccionesFormularioParametroPlanilla.setSelectedIndex(0);					
				}	
			} 			
			else if(ParametroPlanillaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteParametroPlanilla) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessParametroPlanilla(conSplash);
					
						//this.actualizarParametrosGeneralParametroPlanilla();
						
						this.generarReporteProcesoAccionParametroPlanillasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesParametroPlanilla.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxTiposAccionesFormularioParametroPlanilla.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ParametroPlanillaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Parametro PlanillaS SELECCIONADOS?", "MANTENIMIENTO DE Parametro Planilla", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessParametroPlanilla();
				
						this.actualizarParametrosGeneralParametroPlanilla();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.parametroplanillaReturnGeneral=parametroplanillaLogic.procesarAccionParametroPlanillasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.parametroplanillaLogic.getParametroPlanillas(),this.parametroplanillaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarParametroPlanillaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroPlanilla.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxTiposAccionesFormularioParametroPlanilla.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralParametroPlanilla();
					
					ParametroPlanillaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarParametroPlanillaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroPlanilla.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxTiposAccionesFormularioParametroPlanilla.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessParametroPlanilla(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesParametroPlanillaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessParametroPlanilla();
			
			if(this.jInternalFrameDetalleFormParametroPlanilla==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ParametroPlanilla> parametroplanillasSeleccionados=new ArrayList<ParametroPlanilla>();		
			ParametroPlanilla parametroplanilla=new ParametroPlanilla();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingParametroPlanilla(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesParametroPlanilla.getSelectedItem();
			
			
			
			
			parametroplanillasSeleccionados=this.getParametroPlanillasSeleccionados(true);
			//this.sTipoAccion;
			
			if(parametroplanillasSeleccionados.size()==1) {
				for(ParametroPlanilla parametroplanillaAux:parametroplanillasSeleccionados) {
					parametroplanilla=parametroplanillaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessParametroPlanilla();
			
      		//this.finishProcessParametroPlanilla(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarParametroPlanillaReturnGeneral() throws Exception {
		if(this.parametroplanillaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.parametroplanillaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.parametroplanillaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.parametroplanillaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.parametroplanillaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.parametroplanillaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingParametroPlanilla(false);
		}
		
		if(this.parametroplanillaReturnGeneral.getConRetornoLista() || this.parametroplanillaReturnGeneral.getConRetornoObjeto()) {
			if(this.parametroplanillaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametroplanillaLogic.setParametroPlanillas(this.parametroplanillaReturnGeneral.getParametroPlanillas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.parametroplanillaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametroplanillaLogic.setParametroPlanilla(this.parametroplanillaReturnGeneral.getParametroPlanilla());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingParametroPlanilla(false);
		}
	}
	
	public void actualizarParametrosGeneralParametroPlanilla() throws Exception {
		
		
	}
	
	public ArrayList<ParametroPlanilla> getParametroPlanillasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ParametroPlanilla> parametroplanillasSeleccionados=new ArrayList<ParametroPlanilla>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioParametroPlanilla) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ParametroPlanilla parametroplanillaAux:parametroplanillaLogic.getParametroPlanillas()) {
					if(parametroplanillaAux.getIsSelected()) {
						parametroplanillasSeleccionados.add(parametroplanillaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroPlanilla parametroplanillaAux:this.parametroplanillas) {
					if(parametroplanillaAux.getIsSelected()) {
						parametroplanillasSeleccionados.add(parametroplanillaAux);				
					}
				}
			}
			
			if(parametroplanillasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						parametroplanillasSeleccionados.addAll(this.parametroplanillaLogic.getParametroPlanillas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						parametroplanillasSeleccionados.addAll(this.parametroplanillas);				
					}
				}
			}
		} else {
			parametroplanillasSeleccionados.add(this.parametroplanilla);
		}
		
		return parametroplanillasSeleccionados;
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
	
	public void generarReporteParametroPlanillasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalParametroPlanillasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoParametroPlanillasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroPlanillasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroPlanillasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Parametro Planilla",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesParametroPlanillasSeleccionados() throws Exception {
		ArrayList<ParametroPlanilla> parametroplanillasSeleccionados=new ArrayList<ParametroPlanilla>();		
		
		parametroplanillasSeleccionados=this.getParametroPlanillasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteParametroPlanillas("Todos",parametroplanillasSeleccionados);
		
	}	
	
	public void generarReporteNormalParametroPlanillasSeleccionados() throws Exception {
		ArrayList<ParametroPlanilla> parametroplanillasSeleccionados=new ArrayList<ParametroPlanilla>();		
		
		parametroplanillasSeleccionados=this.getParametroPlanillasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteParametroPlanillas("Todos",parametroplanillasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionParametroPlanillasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ParametroPlanilla> parametroplanillasSeleccionados=new ArrayList<ParametroPlanilla>();
		
		parametroplanillasSeleccionados=this.getParametroPlanillasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteParametroPlanillas("Todos",parametroplanillasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoParametroPlanillasSeleccionados() throws Exception {
		ArrayList<ParametroPlanilla> parametroplanillasSeleccionados=new ArrayList<ParametroPlanilla>();		
		
		
		this.abrirInicializarFrameReporteDinamicoParametroPlanilla();
		
		
		parametroplanillasSeleccionados=this.getParametroPlanillasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoParametroPlanilla();
		
		
		//this.generarReporteParametroPlanillas("Todos",parametroplanillasSeleccionados ,parametroplanillaImplementable,parametroplanillaImplementableHome);
	}
	
	public void mostrarImportacionParametroPlanillas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionParametroPlanilla();
		
		this.abrirFrameImportacionParametroPlanilla();		
		
			
		//this.generarReporteParametroPlanillas("Todos",parametroplanillasSeleccionados ,parametroplanillaImplementable,parametroplanillaImplementableHome);
	}
	
	public void importarParametroPlanillas() throws Exception {		
	
	}
	
	public void exportarParametroPlanillasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelParametroPlanillasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoParametroPlanillasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlParametroPlanillasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Parametro Planilla",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoParametroPlanillasSeleccionados() throws Exception {
		ArrayList<ParametroPlanilla> parametroplanillasSeleccionados=new ArrayList<ParametroPlanilla>();		
		
		parametroplanillasSeleccionados=this.getParametroPlanillasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroplanilla."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarParametroPlanilla(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ParametroPlanilla parametroplanillaAux:parametroplanillasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarParametroPlanilla(parametroplanillaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//parametroplanillaAux.setsDetalleGeneralEntityReporte(parametroplanillaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Planilla",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarParametroPlanilla(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ParametroPlanillaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroPlanillaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroPlanillaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEINICIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEFINAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarParametroPlanilla(ParametroPlanilla parametroplanilla,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=parametroplanilla.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroplanilla.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroplanilla.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroplanilla.getcuentacontableinicial_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroplanilla.getcuentacontablefinal_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelParametroPlanillasSeleccionados() throws Exception {
		ArrayList<ParametroPlanilla> parametroplanillasSeleccionados=new ArrayList<ParametroPlanilla>();		
		
		parametroplanillasSeleccionados=this.getParametroPlanillasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroplanilla.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ParametroPlanillas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelParametroPlanilla(row);				
				iRow++;
			}				
			
			for(ParametroPlanilla parametroplanillaAux:parametroplanillasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelParametroPlanilla(parametroplanillaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Planilla",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlParametroPlanillasSeleccionados() throws Exception {
		ArrayList<ParametroPlanilla> parametroplanillasSeleccionados=new ArrayList<ParametroPlanilla>();		
		
		parametroplanillasSeleccionados=this.getParametroPlanillasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroplanilla.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("parametroplanillas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("parametroplanilla");
			//elementRoot.appendChild(element);
		
			for(ParametroPlanilla parametroplanillaAux:parametroplanillasSeleccionados) {
				element = document.createElement("parametroplanilla");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlParametroPlanilla(parametroplanillaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Planilla",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelParametroPlanilla(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroPlanillaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroPlanillaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ParametroPlanillaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEINICIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEFINAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelParametroPlanilla(ParametroPlanilla parametroplanilla,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(parametroplanilla.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroplanilla.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroplanilla.getcuentacontableinicial_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroplanilla.getcuentacontablefinal_descripcion());				
	}
	
	public void setFilaDatosExportarXmlParametroPlanilla(ParametroPlanilla parametroplanilla,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ParametroPlanillaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(parametroplanilla.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ParametroPlanillaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(parametroplanilla.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ParametroPlanillaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(parametroplanilla.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcuentacontableinicial_descripcion = document.createElement(ParametroPlanillaConstantesFunciones.IDCUENTACONTABLEINICIAL);
		elementcuentacontableinicial_descripcion.appendChild(document.createTextNode(parametroplanilla.getcuentacontableinicial_descripcion()));
		element.appendChild(elementcuentacontableinicial_descripcion);

		Element elementcuentacontablefinal_descripcion = document.createElement(ParametroPlanillaConstantesFunciones.IDCUENTACONTABLEFINAL);
		elementcuentacontablefinal_descripcion.appendChild(document.createTextNode(parametroplanilla.getcuentacontablefinal_descripcion()));
		element.appendChild(elementcuentacontablefinal_descripcion);
	}
	
	public void generarReporteGroupGenericoParametroPlanillasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ParametroPlanilla> parametroplanillasSeleccionados=new ArrayList<ParametroPlanilla>();
		
		parametroplanillasSeleccionados=this.getParametroPlanillasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoParametroPlanilla(parametroplanillasSeleccionados);
		
		this.generarReporteParametroPlanillas("Todos",parametroplanillasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoParametroPlanilla(ArrayList<ParametroPlanilla> parametroplanillasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ParametroPlanilla parametroplanillaAux:parametroplanillasSeleccionados) {
				parametroplanillaAux.setsDetalleGeneralEntityReporte(parametroplanillaAux.toString());
			
				if(sTipoSeleccionar.equals(ParametroPlanillaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					parametroplanillaAux.setsDescripcionGeneralEntityReporte1(parametroplanillaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEINICIAL)) {
					existe=true;
					parametroplanillaAux.setsDescripcionGeneralEntityReporte1(parametroplanillaAux.getcuentacontableinicial_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroPlanillaConstantesFunciones.LABEL_IDCUENTACONTABLEFINAL)) {
					existe=true;
					parametroplanillaAux.setsDescripcionGeneralEntityReporte1(parametroplanillaAux.getcuentacontablefinal_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroPlanillaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesParametroPlanilla(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoParametroPlanilla=true;
				this.isVisibilidadCeldaNuevoRelacionesParametroPlanilla=true;
				this.isVisibilidadCeldaGuardarCambiosParametroPlanilla=true;
			}
			
			this.isVisibilidadCeldaModificarParametroPlanilla=false;
			this.isVisibilidadCeldaActualizarParametroPlanilla=false;
			this.isVisibilidadCeldaEliminarParametroPlanilla=false;
			this.isVisibilidadCeldaCancelarParametroPlanilla=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroPlanilla=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroPlanilla=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoParametroPlanilla=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroPlanilla=false;
			this.isVisibilidadCeldaGuardarCambiosParametroPlanilla=false;
			this.isVisibilidadCeldaModificarParametroPlanilla=false;
			this.isVisibilidadCeldaActualizarParametroPlanilla=true;
			this.isVisibilidadCeldaEliminarParametroPlanilla=false;
			this.isVisibilidadCeldaCancelarParametroPlanilla=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroPlanilla=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroPlanilla=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoParametroPlanilla=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroPlanilla=false;
			this.isVisibilidadCeldaGuardarCambiosParametroPlanilla=false;
			this.isVisibilidadCeldaModificarParametroPlanilla=false;
			this.isVisibilidadCeldaActualizarParametroPlanilla=true;
			this.isVisibilidadCeldaEliminarParametroPlanilla=true;
			this.isVisibilidadCeldaCancelarParametroPlanilla=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroPlanilla=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroPlanilla=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoParametroPlanilla=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroPlanilla=false;
			this.isVisibilidadCeldaGuardarCambiosParametroPlanilla=false;
			this.isVisibilidadCeldaModificarParametroPlanilla=false;
			this.isVisibilidadCeldaActualizarParametroPlanilla=true;
			this.isVisibilidadCeldaEliminarParametroPlanilla=false;
			this.isVisibilidadCeldaCancelarParametroPlanilla=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroPlanilla=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroPlanilla=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoParametroPlanilla=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroPlanilla=true;
			this.isVisibilidadCeldaGuardarCambiosParametroPlanilla=true;
			this.isVisibilidadCeldaModificarParametroPlanilla=false;
			this.isVisibilidadCeldaActualizarParametroPlanilla=false;
			this.isVisibilidadCeldaEliminarParametroPlanilla=false;
			this.isVisibilidadCeldaCancelarParametroPlanilla=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroPlanilla=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroPlanilla=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoParametroPlanilla=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroPlanilla=false;
			this.isVisibilidadCeldaGuardarCambiosParametroPlanilla=false;
			this.isVisibilidadCeldaActualizarParametroPlanilla=false;
			this.isVisibilidadCeldaEliminarParametroPlanilla=false;
			this.isVisibilidadCeldaCancelarParametroPlanilla=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroPlanilla=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroPlanilla=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoParametroPlanilla=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroPlanilla=false;
			this.isVisibilidadCeldaGuardarCambiosParametroPlanilla=false;
			this.isVisibilidadCeldaModificarParametroPlanilla=true;
			this.isVisibilidadCeldaActualizarParametroPlanilla=false;
			this.isVisibilidadCeldaEliminarParametroPlanilla=false;
			this.isVisibilidadCeldaCancelarParametroPlanilla=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroPlanilla=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroPlanilla=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ParametroPlanillaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoParametroPlanilla=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroPlanilla=true;
			this.isVisibilidadCeldaGuardarCambiosParametroPlanilla=true;
		} else {
			this.actualizarEstadoPanelsParametroPlanilla(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarParametroPlanilla=false;
			//this.isVisibilidadCeldaVerFormParametroPlanilla=false;
			this.isVisibilidadCeldaDuplicarParametroPlanilla=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!parametroplanillaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesParametroPlanilla=false;
		} else {
			this.isVisibilidadCeldaNuevoParametroPlanilla=false;
			this.isVisibilidadCeldaGuardarCambiosParametroPlanilla=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(parametroplanillaSessionBean.getEsGuardarRelacionado()) {
			if(!parametroplanillaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesParametroPlanilla=false;												
			}
			
			this.jButtonCerrarParametroPlanilla.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesParametroPlanilla=false;
		}
		
		if(!this.permiteMantenimiento(this.parametroplanilla)) {
			this.isVisibilidadCeldaActualizarParametroPlanilla=false;
			this.isVisibilidadCeldaEliminarParametroPlanilla=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesParametroPlanilla() {
	}
	
	public void actualizarEstadoPanelsParametroPlanilla(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionParametroPlanilla!=null) {
				this.jScrollPanelDatosEdicionParametroPlanilla.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroPlanilla!=null) {
				this.jTabbedPaneBusquedasParametroPlanilla.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroPlanilla!=null) {
				this.jScrollPanelDatosParametroPlanilla.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroPlanilla!=null) {
				this.jPanelPaginacionParametroPlanilla.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroPlanilla!=null) {
				this.jPanelParametrosReportesParametroPlanilla.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionParametroPlanilla!=null) {
				this.jScrollPanelDatosEdicionParametroPlanilla.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroPlanilla!=null) {
				this.jTabbedPaneBusquedasParametroPlanilla.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosParametroPlanilla!=null) {
				this.jScrollPanelDatosParametroPlanilla.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroPlanilla!=null) {
				this.jPanelPaginacionParametroPlanilla.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroPlanilla!=null) {
				this.jPanelParametrosReportesParametroPlanilla.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionParametroPlanilla!=null) {
				this.jScrollPanelDatosEdicionParametroPlanilla.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroPlanilla!=null) {
				this.jTabbedPaneBusquedasParametroPlanilla.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroPlanilla!=null) {
				this.jScrollPanelDatosParametroPlanilla.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroPlanilla!=null) {
				this.jPanelPaginacionParametroPlanilla.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroPlanilla!=null) {
				this.jPanelParametrosReportesParametroPlanilla.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionParametroPlanilla!=null) {
				this.jScrollPanelDatosEdicionParametroPlanilla.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroPlanilla!=null) {
				this.jTabbedPaneBusquedasParametroPlanilla.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroPlanilla!=null) {
				this.jScrollPanelDatosParametroPlanilla.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroPlanilla!=null) {
				this.jPanelPaginacionParametroPlanilla.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroPlanilla!=null) {
				this.jPanelParametrosReportesParametroPlanilla.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionParametroPlanilla!=null) {
				this.jScrollPanelDatosEdicionParametroPlanilla.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroPlanilla!=null) {
				this.jTabbedPaneBusquedasParametroPlanilla.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroPlanilla!=null) {
				this.jScrollPanelDatosParametroPlanilla.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroPlanilla!=null) {
				this.jPanelPaginacionParametroPlanilla.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroPlanilla!=null) {
				this.jPanelParametrosReportesParametroPlanilla.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionParametroPlanilla!=null) {
				this.jScrollPanelDatosEdicionParametroPlanilla.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroPlanilla!=null) {
				this.jTabbedPaneBusquedasParametroPlanilla.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroPlanilla!=null) {
				this.jScrollPanelDatosParametroPlanilla.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroPlanilla!=null) {
				this.jPanelPaginacionParametroPlanilla.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroPlanilla!=null) {
				this.jPanelParametrosReportesParametroPlanilla.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionParametroPlanilla!=null) {
				this.jScrollPanelDatosEdicionParametroPlanilla.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroPlanilla!=null) {
				this.jTabbedPaneBusquedasParametroPlanilla.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroPlanilla!=null) {
				this.jScrollPanelDatosParametroPlanilla.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroPlanilla!=null) {
				this.jPanelPaginacionParametroPlanilla.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroPlanilla!=null) {
				this.jPanelParametrosReportesParametroPlanilla.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasParametroPlanilla!=null) {
					this.jTabbedPaneBusquedasParametroPlanilla.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesParametroPlanilla!=null) {
				this.jPanelParametrosReportesParametroPlanilla.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.parametroplanillaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroPlanilla!=null) {
				this.jTabbedPaneBusquedasParametroPlanilla.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesParametroPlanilla!=null) {
				this.jPanelParametrosReportesParametroPlanilla.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCuentaContableFinal=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableFinal) {this.jTabbedPaneBusquedasParametroPlanilla.remove(jPanelFK_IdCuentaContableFinalParametroPlanilla);}

			this.isVisibilidadFK_IdCuentaContableInicial=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableInicial) {this.jTabbedPaneBusquedasParametroPlanilla.remove(jPanelFK_IdCuentaContableInicialParametroPlanilla);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableInicial(Boolean isParaCuentaContableInicial){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableInicialNegation=!isParaCuentaContableInicial;

			this.isVisibilidadFK_IdCuentaContableFinal=isParaCuentaContableInicialNegation;
			if(!this.isVisibilidadFK_IdCuentaContableFinal) {this.jTabbedPaneBusquedasParametroPlanilla.remove(jPanelFK_IdCuentaContableFinalParametroPlanilla);}

			this.isVisibilidadFK_IdCuentaContableInicial=isParaCuentaContableInicial;
			if(!this.isVisibilidadFK_IdCuentaContableInicial) {this.jTabbedPaneBusquedasParametroPlanilla.remove(jPanelFK_IdCuentaContableInicialParametroPlanilla);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableFinal(Boolean isParaCuentaContableFinal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableFinalNegation=!isParaCuentaContableFinal;

			this.isVisibilidadFK_IdCuentaContableFinal=isParaCuentaContableFinal;
			if(!this.isVisibilidadFK_IdCuentaContableFinal) {this.jTabbedPaneBusquedasParametroPlanilla.remove(jPanelFK_IdCuentaContableFinalParametroPlanilla);}

			this.isVisibilidadFK_IdCuentaContableInicial=isParaCuentaContableFinalNegation;
			if(!this.isVisibilidadFK_IdCuentaContableInicial) {this.jTabbedPaneBusquedasParametroPlanilla.remove(jPanelFK_IdCuentaContableInicialParametroPlanilla);}
		}
		
	}
	
	
	
	

	public String registrarSesionParametroPlanillaParaBusquedaCuentaContableInicials() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(parametroplanillaSessionBean==null) {
				parametroplanillaSessionBean=new ParametroPlanillaSessionBean();
			}

			if(cuentacontableinicialSessionBean==null) {
				cuentacontableinicialSessionBean=new CuentaContableSessionBean();
			}

			cuentacontableinicialSessionBean.setsPathNavegacionActual(parametroplanillaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontableinicialSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontableinicialSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontableinicialSessionBean.getisPaginaPopup();
			cuentacontableinicialSessionBean.setisPaginaPopup(false);
			cuentacontableinicialSessionBean.setEstaModoBusqueda(true);
			cuentacontableinicialSessionBean.setsFuncionBusquedaRapida("window.opener.parametroplanillaFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable_inicial(TO_REPLACE);");
			cuentacontableinicialSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontableinicialSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(ParametroPlanillaConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionParametroPlanilla(true);
			//cuentacontableSessionBean.setlidParametroPlanillaActual(this.idParametroPlanillaActual);

			parametroplanillaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyParametroPlanilla(true);
			parametroplanillaSessionBean.setlIdParametroPlanillaActualForeignKey(this.idParametroPlanillaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionParametroPlanillaParaBusquedaCuentaContableFinals() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(parametroplanillaSessionBean==null) {
				parametroplanillaSessionBean=new ParametroPlanillaSessionBean();
			}

			if(cuentacontablefinalSessionBean==null) {
				cuentacontablefinalSessionBean=new CuentaContableSessionBean();
			}

			cuentacontablefinalSessionBean.setsPathNavegacionActual(parametroplanillaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontablefinalSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontablefinalSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontablefinalSessionBean.getisPaginaPopup();
			cuentacontablefinalSessionBean.setisPaginaPopup(false);
			cuentacontablefinalSessionBean.setEstaModoBusqueda(true);
			cuentacontablefinalSessionBean.setsFuncionBusquedaRapida("window.opener.parametroplanillaFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable_final(TO_REPLACE);");
			cuentacontablefinalSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontablefinalSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(ParametroPlanillaConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionParametroPlanilla(true);
			//cuentacontableSessionBean.setlidParametroPlanillaActual(this.idParametroPlanillaActual);

			parametroplanillaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyParametroPlanilla(true);
			parametroplanillaSessionBean.setlIdParametroPlanillaActualForeignKey(this.idParametroPlanillaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ParametroPlanillaSessionBean parametroplanillaSessionBean=new ParametroPlanillaSessionBean();
		
		if(this.parametroplanillaSessionBean==null) {
			this.parametroplanillaSessionBean=new ParametroPlanillaSessionBean();
		}
		
		this.parametroplanillaSessionBean.setsUltimaBusquedaParametroPlanilla(this.getsAccionBusqueda());
		this.parametroplanillaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.parametroplanillaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableFinal")) {
			parametroplanillaSessionBean.setid_cuenta_contable_final(this.getid_cuenta_contable_finalFK_IdCuentaContableFinal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableInicial")) {
			parametroplanillaSessionBean.setid_cuenta_contable_inicial(this.getid_cuenta_contable_inicialFK_IdCuentaContableInicial());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			parametroplanillaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ParametroPlanillaSessionBean parametroplanillaSessionBean=new ParametroPlanillaSessionBean();
		
		if(this.parametroplanillaSessionBean==null) {
			this.parametroplanillaSessionBean=new ParametroPlanillaSessionBean();
		}
		
		if(this.parametroplanillaSessionBean.getsUltimaBusquedaParametroPlanilla()!=null&&!this.parametroplanillaSessionBean.getsUltimaBusquedaParametroPlanilla().equals("")) {
			this.setsAccionBusqueda(parametroplanillaSessionBean.getsUltimaBusquedaParametroPlanilla());
			this.setiNumeroPaginacion(parametroplanillaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(parametroplanillaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableFinal")) {
				this.setid_cuenta_contable_finalFK_IdCuentaContableFinal(parametroplanillaSessionBean.getid_cuenta_contable_final());
				parametroplanillaSessionBean.setid_cuenta_contable_final(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableInicial")) {
				this.setid_cuenta_contable_inicialFK_IdCuentaContableInicial(parametroplanillaSessionBean.getid_cuenta_contable_inicial());
				parametroplanillaSessionBean.setid_cuenta_contable_inicial(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(parametroplanillaSessionBean.getid_empresa());
				parametroplanillaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.parametroplanillaSessionBean.setsUltimaBusquedaParametroPlanilla("");
		this.parametroplanillaSessionBean.setiNumeroPaginacion(ParametroPlanillaConstantesFunciones.INUMEROPAGINACION);
		this.parametroplanillaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaParametroPlanilla(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioParametroPlanilla() {
		this.updateBorderResaltarBusquedasFormularioParametroPlanilla();
		this.updateVisibilidadBusquedasFormularioParametroPlanilla();
		this.updateHabilitarBusquedasFormularioParametroPlanilla();
	}
	
	public void updateBorderResaltarBusquedasFormularioParametroPlanilla() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasParametroPlanilla.getComponents().length>0) {
	

		if(this.parametroplanillaConstantesFunciones.resaltarFK_IdCuentaContableFinalParametroPlanilla!=null) {
			index= this.jTabbedPaneBusquedasParametroPlanilla.indexOfComponent(this.jPanelFK_IdCuentaContableFinalParametroPlanilla);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroPlanilla.getComponent(index);
				jPanel.setBorder(this.parametroplanillaConstantesFunciones.resaltarFK_IdCuentaContableFinalParametroPlanilla);
			}
		}

		if(this.parametroplanillaConstantesFunciones.resaltarFK_IdCuentaContableInicialParametroPlanilla!=null) {
			index= this.jTabbedPaneBusquedasParametroPlanilla.indexOfComponent(this.jPanelFK_IdCuentaContableInicialParametroPlanilla);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroPlanilla.getComponent(index);
				jPanel.setBorder(this.parametroplanillaConstantesFunciones.resaltarFK_IdCuentaContableInicialParametroPlanilla);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioParametroPlanilla() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasParametroPlanilla.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParametroPlanilla.indexOfComponent(this.jPanelFK_IdCuentaContableFinalParametroPlanilla);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroPlanilla.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametroplanillaConstantesFunciones.mostrarFK_IdCuentaContableFinalParametroPlanilla);
			if(!this.parametroplanillaConstantesFunciones.mostrarFK_IdCuentaContableFinalParametroPlanilla && index>-1) {
				this.jTabbedPaneBusquedasParametroPlanilla.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroPlanilla.indexOfComponent(this.jPanelFK_IdCuentaContableInicialParametroPlanilla);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroPlanilla.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametroplanillaConstantesFunciones.mostrarFK_IdCuentaContableInicialParametroPlanilla);
			if(!this.parametroplanillaConstantesFunciones.mostrarFK_IdCuentaContableInicialParametroPlanilla && index>-1) {
				this.jTabbedPaneBusquedasParametroPlanilla.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioParametroPlanilla() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasParametroPlanilla.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParametroPlanilla.indexOfComponent(this.jPanelFK_IdCuentaContableFinalParametroPlanilla);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroPlanilla.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametroplanillaConstantesFunciones.activarFK_IdCuentaContableFinalParametroPlanilla);
				this.jTabbedPaneBusquedasParametroPlanilla.setEnabledAt(index,this.parametroplanillaConstantesFunciones.activarFK_IdCuentaContableFinalParametroPlanilla);
			}

			index= this.jTabbedPaneBusquedasParametroPlanilla.indexOfComponent(this.jPanelFK_IdCuentaContableInicialParametroPlanilla);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroPlanilla.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametroplanillaConstantesFunciones.activarFK_IdCuentaContableInicialParametroPlanilla);
				this.jTabbedPaneBusquedasParametroPlanilla.setEnabledAt(index,this.parametroplanillaConstantesFunciones.activarFK_IdCuentaContableInicialParametroPlanilla);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaParametroPlanilla(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCuentaContableFinal")) {
			index= this.jTabbedPaneBusquedasParametroPlanilla.indexOfComponent(this.jPanelFK_IdCuentaContableFinalParametroPlanilla);

			this.jTabbedPaneBusquedasParametroPlanilla.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroPlanilla.getComponent(index);

			this.parametroplanillaConstantesFunciones.setResaltarFK_IdCuentaContableFinalParametroPlanilla(resaltar);

			jPanel.setBorder(this.parametroplanillaConstantesFunciones.resaltarFK_IdCuentaContableFinalParametroPlanilla);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContableInicial")) {
			index= this.jTabbedPaneBusquedasParametroPlanilla.indexOfComponent(this.jPanelFK_IdCuentaContableInicialParametroPlanilla);

			this.jTabbedPaneBusquedasParametroPlanilla.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroPlanilla.getComponent(index);

			this.parametroplanillaConstantesFunciones.setResaltarFK_IdCuentaContableInicialParametroPlanilla(resaltar);

			jPanel.setBorder(this.parametroplanillaConstantesFunciones.resaltarFK_IdCuentaContableInicialParametroPlanilla);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarParametroPlanilla.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioParametroPlanilla() throws Exception {

		if(this.jInternalFrameDetalleFormParametroPlanilla==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioParametroPlanilla();
		this.updateVisibilidadResaltarControlesFormularioParametroPlanilla();
		this.updateHabilitarResaltarControlesFormularioParametroPlanilla();
		
	}
	
	public void updateBorderResaltarControlesFormularioParametroPlanilla() throws Exception {
		if(this.jInternalFrameDetalleFormParametroPlanilla==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.parametroplanillaConstantesFunciones.resaltaridParametroPlanilla!=null && this.jInternalFrameDetalleFormParametroPlanilla!=null) {this.jInternalFrameDetalleFormParametroPlanilla.jLabelidParametroPlanilla.setBorder(this.parametroplanillaConstantesFunciones.resaltaridParametroPlanilla);}
		if(this.parametroplanillaConstantesFunciones.resaltarid_empresaParametroPlanilla!=null && this.jInternalFrameDetalleFormParametroPlanilla!=null) {this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_empresaParametroPlanilla.setBorder(this.parametroplanillaConstantesFunciones.resaltarid_empresaParametroPlanilla);}
		if(this.parametroplanillaConstantesFunciones.resaltarid_cuenta_contable_inicialParametroPlanilla!=null && this.jInternalFrameDetalleFormParametroPlanilla!=null) {this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_inicialParametroPlanilla.setBorder(this.parametroplanillaConstantesFunciones.resaltarid_cuenta_contable_inicialParametroPlanilla);}
		if(this.parametroplanillaConstantesFunciones.resaltarid_cuenta_contable_finalParametroPlanilla!=null && this.jInternalFrameDetalleFormParametroPlanilla!=null) {this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_finalParametroPlanilla.setBorder(this.parametroplanillaConstantesFunciones.resaltarid_cuenta_contable_finalParametroPlanilla);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioParametroPlanilla() throws Exception {		
		if(this.jInternalFrameDetalleFormParametroPlanilla==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
	
		//this.jInternalFrameDetalleFormParametroPlanilla.jLabelidParametroPlanilla.setVisible(this.parametroplanillaConstantesFunciones.mostraridParametroPlanilla);
		this.jInternalFrameDetalleFormParametroPlanilla.jPanelidParametroPlanilla.setVisible(this.parametroplanillaConstantesFunciones.mostraridParametroPlanilla);
		//this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_empresaParametroPlanilla.setVisible(this.parametroplanillaConstantesFunciones.mostrarid_empresaParametroPlanilla);
		this.jInternalFrameDetalleFormParametroPlanilla.jPanelid_empresaParametroPlanilla.setVisible(this.parametroplanillaConstantesFunciones.mostrarid_empresaParametroPlanilla);
		//this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_inicialParametroPlanilla.setVisible(this.parametroplanillaConstantesFunciones.mostrarid_cuenta_contable_inicialParametroPlanilla);
		this.jInternalFrameDetalleFormParametroPlanilla.jPanelid_cuenta_contable_inicialParametroPlanilla.setVisible(this.parametroplanillaConstantesFunciones.mostrarid_cuenta_contable_inicialParametroPlanilla);
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_inicialParametroPlanilla.setVisible(this.parametroplanillaConstantesFunciones.mostrarid_cuenta_contable_inicialParametroPlanilla);
		//this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_finalParametroPlanilla.setVisible(this.parametroplanillaConstantesFunciones.mostrarid_cuenta_contable_finalParametroPlanilla);
		this.jInternalFrameDetalleFormParametroPlanilla.jPanelid_cuenta_contable_finalParametroPlanilla.setVisible(this.parametroplanillaConstantesFunciones.mostrarid_cuenta_contable_finalParametroPlanilla);
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_finalParametroPlanilla.setVisible(this.parametroplanillaConstantesFunciones.mostrarid_cuenta_contable_finalParametroPlanilla);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioParametroPlanilla() throws Exception {
		if(this.jInternalFrameDetalleFormParametroPlanilla==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroPlanilla!=null) {
	
		this.jInternalFrameDetalleFormParametroPlanilla.jLabelidParametroPlanilla.setEnabled(this.parametroplanillaConstantesFunciones.activaridParametroPlanilla);
		this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_empresaParametroPlanilla.setEnabled(this.parametroplanillaConstantesFunciones.activarid_empresaParametroPlanilla);
		this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_inicialParametroPlanilla.setEnabled(this.parametroplanillaConstantesFunciones.activarid_cuenta_contable_inicialParametroPlanilla);
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_inicialParametroPlanilla.setEnabled(this.parametroplanillaConstantesFunciones.activarid_cuenta_contable_inicialParametroPlanilla);
		this.jInternalFrameDetalleFormParametroPlanilla.jComboBoxid_cuenta_contable_finalParametroPlanilla.setEnabled(this.parametroplanillaConstantesFunciones.activarid_cuenta_contable_finalParametroPlanilla);
			this.jInternalFrameDetalleFormParametroPlanilla.jButtonid_cuenta_contable_finalParametroPlanilla.setEnabled(this.parametroplanillaConstantesFunciones.activarid_cuenta_contable_finalParametroPlanilla);
		}
	}
	
		
}