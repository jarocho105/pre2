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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;




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

import com.bydan.erp.tesoreria.util.TablaRetencionConstantesFunciones;
import com.bydan.erp.tesoreria.util.TablaRetencionParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.TablaRetencionParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.TablaRetencionBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.tesoreria.resources.reportes.AuxiliarReportes;


import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
public class TablaRetencionBeanSwingJInternalFrame extends TablaRetencionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TablaRetencionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TablaRetencion> tablaretencionValidator = new ClassValidator<TablaRetencion>(TablaRetencion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TablaRetencion tablaretencion;	
	public TablaRetencion tablaretencionAux;
	public TablaRetencion tablaretencionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TablaRetencion tablaretencionTotales;
	public Long idTablaRetencionActual;
	public Long iIdNuevoTablaRetencion=0L;
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

	public String sFinalQueryComboTipoRetencion="";

	public List<TipoRetencion> tiporetencionsForeignKey;

	public List<TipoRetencion> gettiporetencionsForeignKey() {
		return tiporetencionsForeignKey;
	}

	public void settiporetencionsForeignKey(List<TipoRetencion> tiporetencionsForeignKey) {
		this.tiporetencionsForeignKey = tiporetencionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoRetencion tiporetencionForeignKey;

	public TipoRetencion gettiporetencionForeignKey() {
		return tiporetencionForeignKey;
	}

	public void settiporetencionForeignKey(TipoRetencion tiporetencionForeignKey) {
		this.tiporetencionForeignKey = tiporetencionForeignKey;
	}

	public String sFinalQueryComboCuentaContableDebito="";

	public List<CuentaContable> cuentacontabledebitosForeignKey;

	public List<CuentaContable> getcuentacontabledebitosForeignKey() {
		return cuentacontabledebitosForeignKey;
	}

	public void setcuentacontabledebitosForeignKey(List<CuentaContable> cuentacontabledebitosForeignKey) {
		this.cuentacontabledebitosForeignKey = cuentacontabledebitosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontabledebitoForeignKey;

	public CuentaContable getcuentacontabledebitoForeignKey() {
		return cuentacontabledebitoForeignKey;
	}

	public void setcuentacontabledebitoForeignKey(CuentaContable cuentacontabledebitoForeignKey) {
		this.cuentacontabledebitoForeignKey = cuentacontabledebitoForeignKey;
	}

	public String sFinalQueryComboCuentaContableCredito="";

	public List<CuentaContable> cuentacontablecreditosForeignKey;

	public List<CuentaContable> getcuentacontablecreditosForeignKey() {
		return cuentacontablecreditosForeignKey;
	}

	public void setcuentacontablecreditosForeignKey(List<CuentaContable> cuentacontablecreditosForeignKey) {
		this.cuentacontablecreditosForeignKey = cuentacontablecreditosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontablecreditoForeignKey;

	public CuentaContable getcuentacontablecreditoForeignKey() {
		return cuentacontablecreditoForeignKey;
	}

	public void setcuentacontablecreditoForeignKey(CuentaContable cuentacontablecreditoForeignKey) {
		this.cuentacontablecreditoForeignKey = cuentacontablecreditoForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idCuentaContableDebitoActual=0L;

	public Long getidCuentaContableDebitoActual() {
		return idCuentaContableDebitoActual;
	}

	public void setidCuentaContableDebitoActual(Long idCuentaContableDebitoActual) {
		this.idCuentaContableDebitoActual= idCuentaContableDebitoActual;
	}
	public Long idCuentaContableCreditoActual=0L;

	public Long getidCuentaContableCreditoActual() {
		return idCuentaContableCreditoActual;
	}

	public void setidCuentaContableCreditoActual(Long idCuentaContableCreditoActual) {
		this.idCuentaContableCreditoActual= idCuentaContableCreditoActual;
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
	
	public Boolean isPermisoTodoTablaRetencion;
	public Boolean isPermisoNuevoTablaRetencion;
	public Boolean isPermisoActualizarTablaRetencion;
	public Boolean isPermisoActualizarOriginalTablaRetencion;
	public Boolean isPermisoEliminarTablaRetencion;
	public Boolean isPermisoGuardarCambiosTablaRetencion;
	public Boolean isPermisoConsultaTablaRetencion;
	public Boolean isPermisoBusquedaTablaRetencion;
	public Boolean isPermisoReporteTablaRetencion;
	public Boolean isPermisoPaginacionMedioTablaRetencion;
	public Boolean isPermisoPaginacionAltoTablaRetencion;
	public Boolean isPermisoPaginacionTodoTablaRetencion;
	public Boolean isPermisoCopiarTablaRetencion;
	public Boolean isPermisoVerFormTablaRetencion;
	public Boolean isPermisoDuplicarTablaRetencion;
	public Boolean isPermisoOrdenTablaRetencion;
	
	
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
	
	public TablaRetencionParameterReturnGeneral tablaretencionReturnGeneral;
	public TablaRetencionParameterReturnGeneral tablaretencionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTablaRetencion=false;
	public Boolean esParaAccionDesdeFormularioTablaRetencion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TablaRetencionSessionBeanAdditional tablaretencionSessionBeanAdditional=null;
	
	public TablaRetencionSessionBeanAdditional getTablaRetencionSessionBeanAdditional() {
		return this.tablaretencionSessionBeanAdditional;
	}
	
	public void setTablaRetencionSessionBeanAdditional(TablaRetencionSessionBeanAdditional tablaretencionSessionBeanAdditional) {
		try {
			this.tablaretencionSessionBeanAdditional=tablaretencionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TablaRetencionBeanSwingJInternalFrameAdditional tablaretencionBeanSwingJInternalFrameAdditional=null;
	//public class TablaRetencionBeanSwingJInternalFrame
	
	public TablaRetencionBeanSwingJInternalFrameAdditional getTablaRetencionBeanSwingJInternalFrameAdditional() {
		return this.tablaretencionBeanSwingJInternalFrameAdditional;
	}
	
	public void setTablaRetencionBeanSwingJInternalFrameAdditional(TablaRetencionBeanSwingJInternalFrameAdditional tablaretencionBeanSwingJInternalFrameAdditional) {
		try {
			this.tablaretencionBeanSwingJInternalFrameAdditional=tablaretencionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TablaRetencionLogic tablaretencionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TablaRetencion tablaretencionBean;
	public TablaRetencionConstantesFunciones tablaretencionConstantesFunciones;
	//public TablaRetencionParameterReturnGeneral tablaretencionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoRetencionLogic tiporetencionLogic;
	public CuentaContableLogic cuentacontabledebitoLogic;
	public CuentaContableLogic cuentacontablecreditoLogic;
	
	//PARAMETROS
	
	
	//public List<TablaRetencion> tablaretencions;	
	//public List<TablaRetencion> tablaretencionsEliminados;
	//public List<TablaRetencion> tablaretencionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTablaRetencion=false;
	public Boolean isVisibilidadCeldaDuplicarTablaRetencion=true;
	public Boolean isVisibilidadCeldaCopiarTablaRetencion=true;
	public Boolean isVisibilidadCeldaVerFormTablaRetencion=true;
	public Boolean isVisibilidadCeldaOrdenTablaRetencion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTablaRetencion=false;
	public Boolean isVisibilidadCeldaModificarTablaRetencion=false;
	public Boolean isVisibilidadCeldaActualizarTablaRetencion=false;
	public Boolean isVisibilidadCeldaEliminarTablaRetencion=false;
	public Boolean isVisibilidadCeldaCancelarTablaRetencion=false;
	public Boolean isVisibilidadCeldaGuardarTablaRetencion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTablaRetencion=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdCuentaContableCredito=false;
	public Boolean isVisibilidadFK_IdCuentaContableDebito=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoRetencion=false;
	
	public Long getiIdNuevoTablaRetencion() {
		return this.iIdNuevoTablaRetencion;
	}

	public void setiIdNuevoTablaRetencion(Long iIdNuevoTablaRetencion) {
		this.iIdNuevoTablaRetencion = iIdNuevoTablaRetencion;
	}
	
	public Long getidTablaRetencionActual() {
		return this.idTablaRetencionActual;
	}

	public void setidTablaRetencionActual(Long idTablaRetencionActual) {
		this.idTablaRetencionActual = idTablaRetencionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TablaRetencion gettablaretencion() {
		return this.tablaretencion;
	}

	public void settablaretencion(TablaRetencion tablaretencion) {
		this.tablaretencion = tablaretencion;
	}
	
	public TablaRetencion gettablaretencionAux() {
		return this.tablaretencionAux;
	}

	public void settablaretencionAux(TablaRetencion tablaretencionAux) {
		this.tablaretencionAux = tablaretencionAux;
	}				
	
	public TablaRetencion gettablaretencionAnterior() {
		return this.tablaretencionAnterior;
	}

	public void settablaretencionAnterior(TablaRetencion tablaretencionAnterior) {
		this.tablaretencionAnterior = tablaretencionAnterior;
	}	
	
	public TablaRetencion gettablaretencionTotales() {
		return this.tablaretencionTotales;
	}

	public void settablaretencionTotales(TablaRetencion tablaretencionTotales) {
		this.tablaretencionTotales = tablaretencionTotales;
	}	
	
	public TablaRetencion gettablaretencionBean() {
		return this.tablaretencionBean;
	}

	public void settablaretencionBean(TablaRetencion tablaretencionBean) {
		this.tablaretencionBean = tablaretencionBean;
	}	
	
	public TablaRetencionParameterReturnGeneral gettablaretencionReturnGeneral() {
		return this.tablaretencionReturnGeneral;
	}

	public void settablaretencionReturnGeneral(TablaRetencionParameterReturnGeneral tablaretencionReturnGeneral) {
		this.tablaretencionReturnGeneral = tablaretencionReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_cuenta_contable_creditoFK_IdCuentaContableCredito=null;

	public Long getid_cuenta_contable_creditoFK_IdCuentaContableCredito() {
		return this.id_cuenta_contable_creditoFK_IdCuentaContableCredito;
	}

	public void setid_cuenta_contable_creditoFK_IdCuentaContableCredito(Long id_cuenta_contable_creditoFK_IdCuentaContableCredito) {
		this.id_cuenta_contable_creditoFK_IdCuentaContableCredito = id_cuenta_contable_creditoFK_IdCuentaContableCredito;
	}

	public Long id_cuenta_contable_debitoFK_IdCuentaContableDebito=-1L;

	public Long getid_cuenta_contable_debitoFK_IdCuentaContableDebito() {
		return this.id_cuenta_contable_debitoFK_IdCuentaContableDebito;
	}

	public void setid_cuenta_contable_debitoFK_IdCuentaContableDebito(Long id_cuenta_contable_debitoFK_IdCuentaContableDebito) {
		this.id_cuenta_contable_debitoFK_IdCuentaContableDebito = id_cuenta_contable_debitoFK_IdCuentaContableDebito;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_tipo_retencionFK_IdTipoRetencion=-1L;

	public Long getid_tipo_retencionFK_IdTipoRetencion() {
		return this.id_tipo_retencionFK_IdTipoRetencion;
	}

	public void setid_tipo_retencionFK_IdTipoRetencion(Long id_tipo_retencionFK_IdTipoRetencion) {
		this.id_tipo_retencionFK_IdTipoRetencion = id_tipo_retencionFK_IdTipoRetencion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TablaRetencionLogic getTablaRetencionLogic()	{		
		return tablaretencionLogic;
	}

	public void setTablaRetencionLogic(TablaRetencionLogic tablaretencionLogic) {
		this.tablaretencionLogic = tablaretencionLogic;
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
	
	public Boolean getIsEsNuevoTablaRetencion() {
		return isEsNuevoTablaRetencion;
	}

	public void setIsEsNuevoTablaRetencion(Boolean isEsNuevoTablaRetencion) {
		this.isEsNuevoTablaRetencion = isEsNuevoTablaRetencion;
	}

	public Boolean getEsParaAccionDesdeFormularioTablaRetencion() {
		return esParaAccionDesdeFormularioTablaRetencion;
	}
	
	public void setEsParaAccionDesdeFormularioTablaRetencion(Boolean esParaAccionDesdeFormularioTablaRetencion) {
		this.esParaAccionDesdeFormularioTablaRetencion = esParaAccionDesdeFormularioTablaRetencion;
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

			if(this.tablaretencionSessionBean==null) {
				this.tablaretencionSessionBean=new TablaRetencionSessionBean();
			}

			if(!this.tablaretencionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tablaretencionSessionBean.getlidEmpresaActual());
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

	public void cargarCombosTipoRetencionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tiporetencionsForeignKey=new ArrayList<TipoRetencion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoRetencionLogic tiporetencionLogic=new TipoRetencionLogic();

			//tiporetencionLogic.getTipoRetencionDataAccess().setIsForForeingKeyData(true);

			if(this.tablaretencionSessionBean==null) {
				this.tablaretencionSessionBean=new TablaRetencionSessionBean();
			}

			if(!this.tablaretencionSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tiporetencionLogic.getTipoRetencionDataAccess().setIsForForeingKeyData(true);

					tiporetencionLogic.getTodosTipoRetencionsWithConnection(sFinalQuery,new Pagination());

					this.tiporetencionsForeignKey=tiporetencionLogic.getTipoRetencions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoRetencion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporetencionLogic.getEntityWithConnection(tablaretencionSessionBean.getlidTipoRetencionActual());
					this.tiporetencionsForeignKey.add(tiporetencionLogic.getTipoRetencion());
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

	public void cargarCombosCuentaContableDebitosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontabledebitosForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.tablaretencionSessionBean==null) {
				this.tablaretencionSessionBean=new TablaRetencionSessionBean();
			}

			if(!this.tablaretencionSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDebito()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontabledebitoLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontabledebitosForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContableDebito(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(tablaretencionSessionBean.getlidCuentaContableDebitoActual());
					this.cuentacontabledebitosForeignKey.add(cuentacontableLogic.getCuentaContable());
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

	public void cargarCombosCuentaContableCreditosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContable cuentacontablecreditoNulo = new CuentaContable();

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.tablaretencionSessionBean==null) {
				this.tablaretencionSessionBean=new TablaRetencionSessionBean();
			}

			if(!this.tablaretencionSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontablecreditoLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontablecreditosForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.cuentacontablecreditosForeignKey.add(0, cuentacontablecreditoNulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContableCredito(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(tablaretencionSessionBean.getlidCuentaContableCreditoActual());
					this.cuentacontablecreditosForeignKey.add(cuentacontableLogic.getCuentaContable());
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

					if(this.tablaretencion!=null) {
						this.tablaretencion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
						this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_empresaTablaRetencion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTablaRetencion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
						if(this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_empresaTablaRetencion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_empresaTablaRetencion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTablaRetencionGenerico)throws Exception
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
				jComboBoxid_empresaTablaRetencionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTablaRetencionGenerico!=null && jComboBoxid_empresaTablaRetencionGenerico.getItemCount()>0) {
					jComboBoxid_empresaTablaRetencionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoRetencionForeignKey(Long idTipoRetencionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionTemp=null;

			for(TipoRetencion tiporetencionAux:tiporetencionsForeignKey) {
				if(tiporetencionAux.getId()!=null && tiporetencionAux.getId().equals(idTipoRetencionSeleccionado)) {
					tiporetencionTemp=tiporetencionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tiporetencionTemp!=null) {

					if(this.tablaretencion!=null) {
						this.tablaretencion.setTipoRetencion(tiporetencionTemp);
					}

					if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
						this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_tipo_retencionTablaRetencion.setSelectedItem(tiporetencionTemp);
					}
				} else {
					//jComboBoxid_tipo_retencionTablaRetencion.setSelectedItem(tiporetencionTemp);
					if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
						if(this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_tipo_retencionTablaRetencion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_tipo_retencionTablaRetencion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoRetencion") || sFormularioTipoBusqueda.equals("Todos")){
					if(tiporetencionTemp!=null && jComboBoxid_tipo_retencionFK_IdTipoRetencionTablaRetencion!=null) {
						jComboBoxid_tipo_retencionFK_IdTipoRetencionTablaRetencion.setSelectedItem(tiporetencionTemp);
					} else {
						if(jComboBoxid_tipo_retencionFK_IdTipoRetencionTablaRetencion!=null) {
							//jComboBoxid_tipo_retencionFK_IdTipoRetencionTablaRetencion.setSelectedItem(tiporetencionTemp);
							if(jComboBoxid_tipo_retencionFK_IdTipoRetencionTablaRetencion.getItemCount()>0) {
								jComboBoxid_tipo_retencionFK_IdTipoRetencionTablaRetencion.setSelectedIndex(0);
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

	public String getActualTipoRetencionForeignKeyDescripcion(Long idTipoRetencionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoRetencion  tiporetencionTemp=null;

			for(TipoRetencion tiporetencionAux:tiporetencionsForeignKey) {
				if(tiporetencionAux.getId()!=null && tiporetencionAux.getId().equals(idTipoRetencionSeleccionado)) {
					tiporetencionTemp=tiporetencionAux;
					break;
				}
			}


			sDescripcion=TipoRetencionConstantesFunciones.getTipoRetencionDescripcion(tiporetencionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoRetencionForeignKeyGenerico(Long idTipoRetencionSeleccionado,JComboBox jComboBoxid_tipo_retencionTablaRetencionGenerico)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionTemp=null;

			for(TipoRetencion tiporetencionAux:tiporetencionsForeignKey) {
				if(tiporetencionAux.getId()!=null && tiporetencionAux.getId().equals(idTipoRetencionSeleccionado)) {
					tiporetencionTemp=tiporetencionAux;
					break;
				}
			}

			if(tiporetencionTemp!=null) {
				jComboBoxid_tipo_retencionTablaRetencionGenerico.setSelectedItem(tiporetencionTemp);
			} else {
				if(jComboBoxid_tipo_retencionTablaRetencionGenerico!=null && jComboBoxid_tipo_retencionTablaRetencionGenerico.getItemCount()>0) {
					jComboBoxid_tipo_retencionTablaRetencionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableDebitoForeignKey(Long idCuentaContableDebitoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontabledebitoTemp=null;

			for(CuentaContable cuentacontabledebitoAux:cuentacontabledebitosForeignKey) {
				if(cuentacontabledebitoAux.getId()!=null && cuentacontabledebitoAux.getId().equals(idCuentaContableDebitoSeleccionado)) {
					cuentacontabledebitoTemp=cuentacontabledebitoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontabledebitoTemp!=null) {

					if(this.tablaretencion!=null) {
						this.tablaretencion.setCuentaContableDebito(cuentacontabledebitoTemp);
					}

					if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
						this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_debitoTablaRetencion.setSelectedItem(cuentacontabledebitoTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_debitoTablaRetencion.setSelectedItem(cuentacontabledebitoTemp);
					if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
						if(this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_debitoTablaRetencion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_debitoTablaRetencion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableDebito") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontabledebitoTemp!=null && jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion!=null) {
						jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion.setSelectedItem(cuentacontabledebitoTemp);
					} else {
						if(jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion!=null) {
							//jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion.setSelectedItem(cuentacontabledebitoTemp);
							if(jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion.getItemCount()>0) {
								jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion.setSelectedIndex(0);
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

	public String getActualCuentaContableDebitoForeignKeyDescripcion(Long idCuentaContableDebitoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontabledebitoTemp=null;

			for(CuentaContable cuentacontabledebitoAux:cuentacontabledebitosForeignKey) {
				if(cuentacontabledebitoAux.getId()!=null && cuentacontabledebitoAux.getId().equals(idCuentaContableDebitoSeleccionado)) {
					cuentacontabledebitoTemp=cuentacontabledebitoAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontabledebitoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableDebitoForeignKeyGenerico(Long idCuentaContableDebitoSeleccionado,JComboBox jComboBoxid_cuenta_contable_debitoTablaRetencionGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontabledebitoTemp=null;

			for(CuentaContable cuentacontabledebitoAux:cuentacontabledebitosForeignKey) {
				if(cuentacontabledebitoAux.getId()!=null && cuentacontabledebitoAux.getId().equals(idCuentaContableDebitoSeleccionado)) {
					cuentacontabledebitoTemp=cuentacontabledebitoAux;
					break;
				}
			}

			if(cuentacontabledebitoTemp!=null) {
				jComboBoxid_cuenta_contable_debitoTablaRetencionGenerico.setSelectedItem(cuentacontabledebitoTemp);
			} else {
				if(jComboBoxid_cuenta_contable_debitoTablaRetencionGenerico!=null && jComboBoxid_cuenta_contable_debitoTablaRetencionGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_debitoTablaRetencionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableCreditoForeignKey(Long idCuentaContableCreditoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontablecreditoTemp=null;

			for(CuentaContable cuentacontablecreditoAux:cuentacontablecreditosForeignKey) {
				if(cuentacontablecreditoAux.getId()!=null && cuentacontablecreditoAux.getId().equals(idCuentaContableCreditoSeleccionado)) {
					cuentacontablecreditoTemp=cuentacontablecreditoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontablecreditoTemp!=null) {

					if(this.tablaretencion!=null) {
						this.tablaretencion.setCuentaContableCredito(cuentacontablecreditoTemp);
					}

					if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
						this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_creditoTablaRetencion.setSelectedItem(cuentacontablecreditoTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_creditoTablaRetencion.setSelectedItem(cuentacontablecreditoTemp);
					if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
						if(this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_creditoTablaRetencion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_creditoTablaRetencion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableCredito") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontablecreditoTemp!=null && jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion!=null) {
						jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion.setSelectedItem(cuentacontablecreditoTemp);
					} else {
						if(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion!=null) {
							//jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion.setSelectedItem(cuentacontablecreditoTemp);
							if(jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion.getItemCount()>0) {
								jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion.setSelectedIndex(0);
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

	public String getActualCuentaContableCreditoForeignKeyDescripcion(Long idCuentaContableCreditoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontablecreditoTemp=null;

			for(CuentaContable cuentacontablecreditoAux:cuentacontablecreditosForeignKey) {
				if(cuentacontablecreditoAux.getId()!=null && cuentacontablecreditoAux.getId().equals(idCuentaContableCreditoSeleccionado)) {
					cuentacontablecreditoTemp=cuentacontablecreditoAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontablecreditoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableCreditoForeignKeyGenerico(Long idCuentaContableCreditoSeleccionado,JComboBox jComboBoxid_cuenta_contable_creditoTablaRetencionGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontablecreditoTemp=null;

			for(CuentaContable cuentacontablecreditoAux:cuentacontablecreditosForeignKey) {
				if(cuentacontablecreditoAux.getId()!=null && cuentacontablecreditoAux.getId().equals(idCuentaContableCreditoSeleccionado)) {
					cuentacontablecreditoTemp=cuentacontablecreditoAux;
					break;
				}
			}

			if(cuentacontablecreditoTemp!=null) {
				jComboBoxid_cuenta_contable_creditoTablaRetencionGenerico.setSelectedItem(cuentacontablecreditoTemp);
			} else {
				if(jComboBoxid_cuenta_contable_creditoTablaRetencionGenerico!=null && jComboBoxid_cuenta_contable_creditoTablaRetencionGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_creditoTablaRetencionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TablaRetencion tablaretencion,JComboBox jComboBoxid_empresaTablaRetencionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTablaRetencionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_empresaTablaRetencion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTablaRetencionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tablaretencion.setid_empresa(empresaAux.getId());
				tablaretencion.setempresa_descripcion(TablaRetencionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tablaretencion.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoRetencionForeignKey(TablaRetencion tablaretencion,JComboBox jComboBoxid_tipo_retencionTablaRetencionGenerico)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionAux=new TipoRetencion();

			if(jComboBoxid_tipo_retencionTablaRetencionGenerico==null) {
				tiporetencionAux=(TipoRetencion)this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_tipo_retencionTablaRetencion.getSelectedItem();
			} else {
				tiporetencionAux=(TipoRetencion)jComboBoxid_tipo_retencionTablaRetencionGenerico.getSelectedItem();
			}

			if(tiporetencionAux!=null && tiporetencionAux.getId()!=null) {
				tablaretencion.setid_tipo_retencion(tiporetencionAux.getId());
				tablaretencion.settiporetencion_descripcion(TablaRetencionConstantesFunciones.getTipoRetencionDescripcion(tiporetencionAux));
				tablaretencion.setTipoRetencion(tiporetencionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableDebitoForeignKey(TablaRetencion tablaretencion,JComboBox jComboBoxid_cuenta_contable_debitoTablaRetencionGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_debitoTablaRetencionGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_debitoTablaRetencion.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_debitoTablaRetencionGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				tablaretencion.setid_cuenta_contable_debito(cuentacontableAux.getId());
				tablaretencion.setcuentacontabledebito_descripcion(TablaRetencionConstantesFunciones.getCuentaContableDebitoDescripcion(cuentacontableAux));
				tablaretencion.setCuentaContableDebito(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableCreditoForeignKey(TablaRetencion tablaretencion,JComboBox jComboBoxid_cuenta_contable_creditoTablaRetencionGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_creditoTablaRetencionGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_creditoTablaRetencion.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_creditoTablaRetencionGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null) {
				tablaretencion.setid_cuenta_contable_credito(cuentacontableAux.getId());
				tablaretencion.setcuentacontablecredito_descripcion(TablaRetencionConstantesFunciones.getCuentaContableCreditoDescripcion(cuentacontableAux));
				tablaretencion.setCuentaContableCredito(cuentacontableAux);			}
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

					if(!TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTablaRetencion!=null) { 
							this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_empresaTablaRetencion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_empresaTablaRetencion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTablaRetencion!=null) { 
					}

					if(!TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoRetencionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoRetencion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTablaRetencion!=null) { 
							this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_tipo_retencionTablaRetencion.removeAllItems();

							for(TipoRetencion tiporetencion:this.tiporetencionsForeignKey) {
								this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_tipo_retencionTablaRetencion.addItem(tiporetencion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTablaRetencion!=null) { 
					}

					if(!TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoRetencion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_retencionFK_IdTipoRetencionTablaRetencion.removeAllItems();

							for(TipoRetencion tiporetencion:this.tiporetencionsForeignKey) {
								this.jComboBoxid_tipo_retencionFK_IdTipoRetencionTablaRetencion.addItem(tiporetencion);
							}
						}

						if(!TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContableDebitosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTablaRetencion!=null) { 
							this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_debitoTablaRetencion.removeAllItems();

							for(CuentaContable cuentacontabledebito:this.cuentacontabledebitosForeignKey) {
								this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_debitoTablaRetencion.addItem(cuentacontabledebito);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTablaRetencion!=null) { 
					}

					if(!TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableDebito") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion.removeAllItems();

							for(CuentaContable cuentacontabledebito:this.cuentacontabledebitosForeignKey) {
								this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion.addItem(cuentacontabledebito);
							}
						}

						if(!TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContableCreditosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTablaRetencion!=null) { 
							this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_creditoTablaRetencion.removeAllItems();

							for(CuentaContable cuentacontablecredito:this.cuentacontablecreditosForeignKey) {
								this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_creditoTablaRetencion.addItem(cuentacontablecredito);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTablaRetencion!=null) { 
					}

					if(!TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableCredito") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion.removeAllItems();

							for(CuentaContable cuentacontablecredito:this.cuentacontablecreditosForeignKey) {
								this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion.addItem(cuentacontablecredito);
							}
						}

						if(!TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
							this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_empresaTablaRetencion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
							this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_empresaTablaRetencion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoRetencionForeignKey(TipoRetencion tiporetencion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
							this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_tipo_retencionTablaRetencion.setSelectedItem(tiporetencion);
						}
					} else {
						if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
							this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_tipo_retencionTablaRetencion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_retencionFK_IdTipoRetencionTablaRetencion.setSelectedItem(tiporetencion);
						} else {
							this.jComboBoxid_tipo_retencionFK_IdTipoRetencionTablaRetencion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaContableDebitoForeignKey(CuentaContable cuentacontabledebito,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
							this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_debitoTablaRetencion.setSelectedItem(cuentacontabledebito);
						}
					} else {
						if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
							this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_debitoTablaRetencion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion.setSelectedItem(cuentacontabledebito);
						} else {
							this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaContableCreditoForeignKey(CuentaContable cuentacontablecredito,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
							this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_creditoTablaRetencion.setSelectedItem(cuentacontablecredito);
						}
					} else {
						if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
							this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_creditoTablaRetencion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion.setSelectedItem(cuentacontablecredito);
						} else {
							this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTablaRetencion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TablaRetencionConstantesFunciones.refrescarForeignKeysDescripcionesTablaRetencion(this.tablaretencionLogic.getTablaRetencions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TablaRetencionConstantesFunciones.refrescarForeignKeysDescripcionesTablaRetencion(this.tablaretencions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoRetencion.class));
		classes.add(new Classe(CuentaContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tablaretencionLogic.setTablaRetencions(this.tablaretencions);
			tablaretencionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TablaRetencionParameterReturnGeneral getTablaRetencionParameterGeneral() {
		return this.tablaretencionParameterGeneral;
	}
	
	public void setTablaRetencionParameterGeneral(TablaRetencionParameterReturnGeneral tablaretencionParameterGeneral) {
		this.tablaretencionParameterGeneral = tablaretencionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTablaRetencion() {
		return isPermisoTodoTablaRetencion;
	}

	public void setIsPermisoTodoTablaRetencion(Boolean isPermisoTodoTablaRetencion) {
		this.isPermisoTodoTablaRetencion = isPermisoTodoTablaRetencion;
	}

	public Boolean getIsPermisoNuevoTablaRetencion() {
		return isPermisoNuevoTablaRetencion;
	}

	public void setIsPermisoNuevoTablaRetencion(Boolean isPermisoNuevoTablaRetencion) {
		this.isPermisoNuevoTablaRetencion = isPermisoNuevoTablaRetencion;
	}

	public Boolean getIsPermisoActualizarTablaRetencion() {
		return isPermisoActualizarTablaRetencion;
	}

	public void setIsPermisoActualizarTablaRetencion(Boolean isPermisoActualizarTablaRetencion) {
		this.isPermisoActualizarTablaRetencion = isPermisoActualizarTablaRetencion;
	}

	public Boolean getIsPermisoEliminarTablaRetencion() {
		return isPermisoEliminarTablaRetencion;
	}

	public void setIsPermisoEliminarTablaRetencion(Boolean isPermisoEliminarTablaRetencion) {
		this.isPermisoEliminarTablaRetencion = isPermisoEliminarTablaRetencion;
	}

	public Boolean getIsPermisoGuardarCambiosTablaRetencion() {
		return isPermisoGuardarCambiosTablaRetencion;
	}

	public void setIsPermisoGuardarCambiosTablaRetencion(Boolean isPermisoGuardarCambiosTablaRetencion) {
		this.isPermisoGuardarCambiosTablaRetencion = isPermisoGuardarCambiosTablaRetencion;
	}
	
	public Boolean getIsPermisoConsultaTablaRetencion() {
		return isPermisoConsultaTablaRetencion;
	}

	public void setIsPermisoConsultaTablaRetencion(Boolean isPermisoConsultaTablaRetencion) {
		this.isPermisoConsultaTablaRetencion = isPermisoConsultaTablaRetencion;
	}

	public Boolean getIsPermisoBusquedaTablaRetencion() {
		return isPermisoBusquedaTablaRetencion;
	}

	public void setIsPermisoBusquedaTablaRetencion(Boolean isPermisoBusquedaTablaRetencion) {
		this.isPermisoBusquedaTablaRetencion = isPermisoBusquedaTablaRetencion;
	}

	public Boolean getIsPermisoReporteTablaRetencion() {
		return isPermisoReporteTablaRetencion;
	}

	public void setIsPermisoReporteTablaRetencion(Boolean isPermisoReporteTablaRetencion) {
		this.isPermisoReporteTablaRetencion = isPermisoReporteTablaRetencion;
	}
	
	public Boolean getIsPermisoPaginacionMedioTablaRetencion() {
		return isPermisoPaginacionMedioTablaRetencion;
	}

	public void setIsPermisoPaginacionMedioTablaRetencion(Boolean isPermisoPaginacionMedioTablaRetencion) {
		this.isPermisoPaginacionMedioTablaRetencion = isPermisoPaginacionMedioTablaRetencion;
	}
	
	public Boolean getIsPermisoPaginacionTodoTablaRetencion() {
		return isPermisoPaginacionTodoTablaRetencion;
	}

	public void setIsPermisoPaginacionTodoTablaRetencion(Boolean isPermisoPaginacionTodoTablaRetencion) {
		this.isPermisoPaginacionTodoTablaRetencion = isPermisoPaginacionTodoTablaRetencion;
	}
	
	public Boolean getIsPermisoPaginacionAltoTablaRetencion() {
		return isPermisoPaginacionAltoTablaRetencion;
	}

	public void setIsPermisoPaginacionAltoTablaRetencion(Boolean isPermisoPaginacionAltoTablaRetencion) {
		this.isPermisoPaginacionAltoTablaRetencion = isPermisoPaginacionAltoTablaRetencion;
	}
	
	public Boolean getIsPermisoCopiarTablaRetencion() {
		return isPermisoCopiarTablaRetencion;
	}

	public void setIsPermisoCopiarTablaRetencion(Boolean isPermisoCopiarTablaRetencion) {
		this.isPermisoCopiarTablaRetencion = isPermisoCopiarTablaRetencion;
	}
	
	public Boolean getIsPermisoVerFormTablaRetencion() {
		return isPermisoVerFormTablaRetencion;
	}

	public void setIsPermisoVerFormTablaRetencion(Boolean isPermisoVerFormTablaRetencion) {
		this.isPermisoVerFormTablaRetencion = isPermisoVerFormTablaRetencion;
	}
	
	public Boolean getIsPermisoDuplicarTablaRetencion() {
		return isPermisoDuplicarTablaRetencion;
	}

	public void setIsPermisoDuplicarTablaRetencion(Boolean isPermisoDuplicarTablaRetencion) {
		this.isPermisoDuplicarTablaRetencion = isPermisoDuplicarTablaRetencion;
	}
	
	public Boolean getIsPermisoOrdenTablaRetencion() {
		return isPermisoOrdenTablaRetencion;
	}

	public void setIsPermisoOrdenTablaRetencion(Boolean isPermisoOrdenTablaRetencion) {
		this.isPermisoOrdenTablaRetencion = isPermisoOrdenTablaRetencion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTablaRetencion() {
		return isVisibilidadCeldaNuevoTablaRetencion;
	}

	public void setIsVisibilidadCeldaNuevoTablaRetencion(Boolean isVisibilidadCeldaNuevoTablaRetencion) {
		this.isVisibilidadCeldaNuevoTablaRetencion = isVisibilidadCeldaNuevoTablaRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTablaRetencion() {
		return isVisibilidadCeldaDuplicarTablaRetencion;
	}

	public void setIsVisibilidadCeldaDuplicarTablaRetencion(Boolean isVisibilidadCeldaDuplicarTablaRetencion) {
		this.isVisibilidadCeldaDuplicarTablaRetencion = isVisibilidadCeldaDuplicarTablaRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTablaRetencion() {
		return isVisibilidadCeldaCopiarTablaRetencion;
	}

	public void setIsVisibilidadCeldaCopiarTablaRetencion(Boolean isVisibilidadCeldaCopiarTablaRetencion) {
		this.isVisibilidadCeldaCopiarTablaRetencion = isVisibilidadCeldaCopiarTablaRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTablaRetencion() {
		return isVisibilidadCeldaVerFormTablaRetencion;
	}

	public void setIsVisibilidadCeldaVerFormTablaRetencion(Boolean isVisibilidadCeldaVerFormTablaRetencion) {
		this.isVisibilidadCeldaVerFormTablaRetencion = isVisibilidadCeldaVerFormTablaRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTablaRetencion() {
		return isVisibilidadCeldaOrdenTablaRetencion;
	}

	public void setIsVisibilidadCeldaOrdenTablaRetencion(Boolean isVisibilidadCeldaOrdenTablaRetencion) {
		this.isVisibilidadCeldaOrdenTablaRetencion = isVisibilidadCeldaOrdenTablaRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTablaRetencion() {
		return isVisibilidadCeldaNuevoRelacionesTablaRetencion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTablaRetencion(Boolean isVisibilidadCeldaNuevoRelacionesTablaRetencion) {
		this.isVisibilidadCeldaNuevoRelacionesTablaRetencion = isVisibilidadCeldaNuevoRelacionesTablaRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTablaRetencion() {
		return isVisibilidadCeldaModificarTablaRetencion;
	}

	public void setIsVisibilidadCeldaModificarTablaRetencion(Boolean isVisibilidadCeldaModificarTablaRetencion) {
		this.isVisibilidadCeldaModificarTablaRetencion = isVisibilidadCeldaModificarTablaRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTablaRetencion() {
		return isVisibilidadCeldaActualizarTablaRetencion;
	}

	public void setIsVisibilidadCeldaActualizarTablaRetencion(Boolean isVisibilidadCeldaActualizarTablaRetencion) {
		this.isVisibilidadCeldaActualizarTablaRetencion = isVisibilidadCeldaActualizarTablaRetencion;
	}

	public Boolean getIsVisibilidadCeldaEliminarTablaRetencion() {
		return isVisibilidadCeldaEliminarTablaRetencion;
	}

	public void setIsVisibilidadCeldaEliminarTablaRetencion(Boolean isVisibilidadCeldaEliminarTablaRetencion) {
		this.isVisibilidadCeldaEliminarTablaRetencion = isVisibilidadCeldaEliminarTablaRetencion;
	}

	public Boolean getIsVisibilidadCeldaCancelarTablaRetencion() {
		return isVisibilidadCeldaCancelarTablaRetencion;
	}

	public void setIsVisibilidadCeldaCancelarTablaRetencion(Boolean isVisibilidadCeldaCancelarTablaRetencion) {
		this.isVisibilidadCeldaCancelarTablaRetencion = isVisibilidadCeldaCancelarTablaRetencion;
	}

	public Boolean getIsVisibilidadCeldaGuardarTablaRetencion() {
		return isVisibilidadCeldaGuardarTablaRetencion;
	}

	public void setIsVisibilidadCeldaGuardarTablaRetencion(Boolean isVisibilidadCeldaGuardarTablaRetencion) {
		this.isVisibilidadCeldaGuardarTablaRetencion = isVisibilidadCeldaGuardarTablaRetencion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTablaRetencion() {
		return isVisibilidadCeldaGuardarCambiosTablaRetencion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTablaRetencion(Boolean isVisibilidadCeldaGuardarCambiosTablaRetencion) {
		this.isVisibilidadCeldaGuardarCambiosTablaRetencion = isVisibilidadCeldaGuardarCambiosTablaRetencion;
	}
		
	public TablaRetencionSessionBean gettablaretencionSessionBean() {
		return this.tablaretencionSessionBean;
	}
	
	public void settablaretencionSessionBean(TablaRetencionSessionBean tablaretencionSessionBean) {
		this.tablaretencionSessionBean=tablaretencionSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdCuentaContableCredito() {
		return this.isVisibilidadFK_IdCuentaContableCredito;
	}

	public void setisVisibilidadFK_IdCuentaContableCredito(Boolean isVisibilidadFK_IdCuentaContableCredito) {
		this.isVisibilidadFK_IdCuentaContableCredito=isVisibilidadFK_IdCuentaContableCredito;
	}

	public Boolean getisVisibilidadFK_IdCuentaContableDebito() {
		return this.isVisibilidadFK_IdCuentaContableDebito;
	}

	public void setisVisibilidadFK_IdCuentaContableDebito(Boolean isVisibilidadFK_IdCuentaContableDebito) {
		this.isVisibilidadFK_IdCuentaContableDebito=isVisibilidadFK_IdCuentaContableDebito;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdTipoRetencion() {
		return this.isVisibilidadFK_IdTipoRetencion;
	}

	public void setisVisibilidadFK_IdTipoRetencion(Boolean isVisibilidadFK_IdTipoRetencion) {
		this.isVisibilidadFK_IdTipoRetencion=isVisibilidadFK_IdTipoRetencion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(TablaRetencion tablaretencion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tablaretencion,null);
				this.setActualParaGuardarTipoRetencionForeignKey(tablaretencion,null);
				this.setActualParaGuardarCuentaContableDebitoForeignKey(tablaretencion,null);
				this.setActualParaGuardarCuentaContableCreditoForeignKey(tablaretencion,null);
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
	
	public void bugActualizarReferenciaActual(TablaRetencion tablaretencion,TablaRetencion tablaretencionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTablaRetencion(tablaretencion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tablaretencionAux.setId(tablaretencion.getId());
		tablaretencionAux.setVersionRow(tablaretencion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTablaRetencion();
		
			int intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TablaRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTablaRetencion(this.tablaretencion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tablaretencionValidator.getInvalidValues(this.tablaretencion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tablaretencionLogic.setDatosCliente(datosCliente);
			tablaretencionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tablaretencionAux=new  TablaRetencion();
				
				tablaretencionAux.setIsNew(true);
				tablaretencionAux.setIsChanged(true);
				
				tablaretencionAux.setTablaRetencionOriginal(this.tablaretencion);
				
				tablaretencionAux.setId(this.tablaretencion.getId());	
				tablaretencionAux.setVersionRow(this.tablaretencion.getVersionRow());	
				tablaretencionAux.setid_empresa(this.tablaretencion.getid_empresa());	
				tablaretencionAux.setcodigo(this.tablaretencion.getcodigo());	
				tablaretencionAux.setnombre(this.tablaretencion.getnombre());	
				tablaretencionAux.setporcentaje(this.tablaretencion.getporcentaje());	
				tablaretencionAux.setmonto_minimo(this.tablaretencion.getmonto_minimo());	
				tablaretencionAux.setid_tipo_retencion(this.tablaretencion.getid_tipo_retencion());	
				tablaretencionAux.setid_cuenta_contable_debito(this.tablaretencion.getid_cuenta_contable_debito());	
				
				if(this.tablaretencion.getid_cuenta_contable_credito()!=null && this.tablaretencion.getid_cuenta_contable_credito()>0L) {
					tablaretencionAux.setid_cuenta_contable_credito(this.tablaretencion.getid_cuenta_contable_credito());
				} else {
					tablaretencionAux.setid_cuenta_contable_credito(null);
				}	
				tablaretencionAux.setes_debito(this.tablaretencion.getes_debito());	
				tablaretencionAux.setes_retencion_fuente(this.tablaretencion.getes_retencion_fuente());	
				tablaretencionAux.setcon_secuencial(this.tablaretencion.getcon_secuencial());	
				tablaretencionAux.setcon_sub_total_factura(this.tablaretencion.getcon_sub_total_factura());	
				tablaretencionAux.setcon_iva_factura(this.tablaretencion.getcon_iva_factura());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tablaretencionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tablaretencionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tablaretencionAux,tablaretencionLogic.getTablaRetencions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tablaretencionAux,tablaretencions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tablaretencionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tablaretencionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaretencionLogic.saveTablaRetencions();//WithConnection
						//tablaretencionLogic.getSetVersionRowTablaRetencions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tablaretencion,tablaretencionAux);
					
					this.refrescarForeignKeysDescripcionesTablaRetencion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tablaretencionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tablaretencionLogic.saveTablaRetencionRelaciones(tablaretencionAux);//WithConnection
								//tablaretencionLogic.getSetVersionRowTablaRetencions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tablaretencion,tablaretencionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tablaretencionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tablaretencionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tablaretencionAux,tablaretencionLogic.getTablaRetencions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tablaretencionAux,tablaretencions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tablaretencion,tablaretencionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tablaretencionAux=new  TablaRetencion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tablaretencionSessionBean.getEsGuardarRelacionado() 
					|| (this.tablaretencionSessionBean.getEsGuardarRelacionado() && this.tablaretencion.getId()>=0)) {
						
					tablaretencionAux.setIsNew(false);
				}
				
				tablaretencionAux.setIsDeleted(false);
			
				tablaretencionAux.setId(this.tablaretencion.getId());	
				tablaretencionAux.setVersionRow(this.tablaretencion.getVersionRow());	
				tablaretencionAux.setid_empresa(this.tablaretencion.getid_empresa());	
				tablaretencionAux.setcodigo(this.tablaretencion.getcodigo());	
				tablaretencionAux.setnombre(this.tablaretencion.getnombre());	
				tablaretencionAux.setporcentaje(this.tablaretencion.getporcentaje());	
				tablaretencionAux.setmonto_minimo(this.tablaretencion.getmonto_minimo());	
				tablaretencionAux.setid_tipo_retencion(this.tablaretencion.getid_tipo_retencion());	
				tablaretencionAux.setid_cuenta_contable_debito(this.tablaretencion.getid_cuenta_contable_debito());	
				
				if(this.tablaretencion.getid_cuenta_contable_credito()!=null && this.tablaretencion.getid_cuenta_contable_credito()>0L) {
					tablaretencionAux.setid_cuenta_contable_credito(this.tablaretencion.getid_cuenta_contable_credito());
				} else {
					tablaretencionAux.setid_cuenta_contable_credito(null);
				}	
				tablaretencionAux.setes_debito(this.tablaretencion.getes_debito());	
				tablaretencionAux.setes_retencion_fuente(this.tablaretencion.getes_retencion_fuente());	
				tablaretencionAux.setcon_secuencial(this.tablaretencion.getcon_secuencial());	
				tablaretencionAux.setcon_sub_total_factura(this.tablaretencion.getcon_sub_total_factura());	
				tablaretencionAux.setcon_iva_factura(this.tablaretencion.getcon_iva_factura());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tablaretencionAux,tablaretencionLogic.getTablaRetencions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tablaretencionAux,tablaretencions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tablaretencionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tablaretencionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaretencionLogic.saveTablaRetencions();//WithConnection
						//tablaretencionLogic.getSetVersionRowTablaRetencions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tablaretencion,tablaretencionAux);
					
					this.refrescarForeignKeysDescripcionesTablaRetencion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tablaretencionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tablaretencionLogic.saveTablaRetencionRelaciones(tablaretencionAux);//WithConnection
								//tablaretencionLogic.getSetVersionRowTablaRetencions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tablaretencion,tablaretencionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tablaretencionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tablaretencionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tablaretencionAux,tablaretencionLogic.getTablaRetencions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tablaretencionAux,tablaretencions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tablaretencion,tablaretencionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tablaretencionAux=new  TablaRetencion();
				
				tablaretencionAux.setIsNew(false);
				tablaretencionAux.setIsChanged(false);
				
				tablaretencionAux.setIsDeleted(true);
				
				tablaretencionAux.setId(this.tablaretencion.getId());	
				tablaretencionAux.setVersionRow(this.tablaretencion.getVersionRow());	
				tablaretencionAux.setid_empresa(this.tablaretencion.getid_empresa());	
				tablaretencionAux.setcodigo(this.tablaretencion.getcodigo());	
				tablaretencionAux.setnombre(this.tablaretencion.getnombre());	
				tablaretencionAux.setporcentaje(this.tablaretencion.getporcentaje());	
				tablaretencionAux.setmonto_minimo(this.tablaretencion.getmonto_minimo());	
				tablaretencionAux.setid_tipo_retencion(this.tablaretencion.getid_tipo_retencion());	
				tablaretencionAux.setid_cuenta_contable_debito(this.tablaretencion.getid_cuenta_contable_debito());	
				
				if(this.tablaretencion.getid_cuenta_contable_credito()!=null && this.tablaretencion.getid_cuenta_contable_credito()>0L) {
					tablaretencionAux.setid_cuenta_contable_credito(this.tablaretencion.getid_cuenta_contable_credito());
				} else {
					tablaretencionAux.setid_cuenta_contable_credito(null);
				}	
				tablaretencionAux.setes_debito(this.tablaretencion.getes_debito());	
				tablaretencionAux.setes_retencion_fuente(this.tablaretencion.getes_retencion_fuente());	
				tablaretencionAux.setcon_secuencial(this.tablaretencion.getcon_secuencial());	
				tablaretencionAux.setcon_sub_total_factura(this.tablaretencion.getcon_sub_total_factura());	
				tablaretencionAux.setcon_iva_factura(this.tablaretencion.getcon_iva_factura());	
				
				if(this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tablaretencionAux.getId()>=0) {	
						this.tablaretencionsEliminados.add(tablaretencionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tablaretencionAux,tablaretencionLogic.getTablaRetencions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tablaretencionAux,tablaretencions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tablaretencionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tablaretencionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaretencionLogic.saveTablaRetencions();//WithConnection
						//tablaretencionLogic.getSetVersionRowTablaRetencions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tablaretencionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tablaretencionLogic.saveTablaRetencionRelaciones(tablaretencionAux);//WithConnection
								//tablaretencionLogic.getSetVersionRowTablaRetencions();//WithConnection
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
							if(this.tablaretencionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tablaretencionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tablaretencionAux,tablaretencionLogic.getTablaRetencions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tablaretencionAux,tablaretencions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.getTablaRetencions().addAll(this.tablaretencionsEliminados);
					
					tablaretencionLogic.saveTablaRetencions();//WithConnection
					//tablaretencionLogic.getSetVersionRowTablaRetencions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTablaRetencion();
				
				this.tablaretencionsEliminados= new ArrayList<TablaRetencion>();		
			}
			
			if(this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tabla Retencion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tabla Retencion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tablaretencion=tablaretencionAux;
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
      		//this.finishProcessTablaRetencion();
      	}
		
	}	
	
	public void actualizarRelaciones(TablaRetencion tablaretencionLocal) throws Exception {
		
		if(this.tablaretencionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TablaRetencion tablaretencionLocal) throws Exception {	
		if(this.tablaretencionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tablaretencionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoRetencionDetalleFormJInternalFrame.class)) {
				TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrameLocal=(TipoRetencionBeanSwingJInternalFrame) ((TipoRetencionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tiporetencionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoRetencion(tiporetencionBeanSwingJInternalFrameLocal.gettiporetencion(),true);
				tiporetencionBeanSwingJInternalFrameLocal.actualizarLista(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion,this.tiporetencionsForeignKey);

				tiporetencionBeanSwingJInternalFrameLocal.actualizarRelaciones(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion);

				tablaretencionLocal.setTipoRetencion(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion);

				this.addItemDefectoCombosForeignKeyTipoRetencion();
				this.cargarCombosFrameTipoRetencionsForeignKey("Formulario");
				this.setActualTipoRetencionForeignKey(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontabledebitoBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontabledebitoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontabledebitoBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontabledebitoBeanSwingJInternalFrameLocal.actualizarLista(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontabledebitosForeignKey);

				cuentacontabledebitoBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable);

				tablaretencionLocal.setCuentaContableDebito(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableDebito();
				this.cargarCombosFrameCuentaContableDebitosForeignKey("Formulario");
				this.setActualCuentaContableDebitoForeignKey(cuentacontabledebitoBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontablecreditoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontablecreditoBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontablecreditoBeanSwingJInternalFrameLocal.actualizarLista(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablecreditosForeignKey);

				cuentacontablecreditoBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable);

				tablaretencionLocal.setCuentaContableCredito(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableCredito();
				this.cargarCombosFrameCuentaContableCreditosForeignKey("Formulario");
				this.setActualCuentaContableCreditoForeignKey(cuentacontablecreditoBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTablaRetencionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tablaretencionValidator.getInvalidValues(this.tablaretencion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TablaRetencion tablaretencion,List<TablaRetencion> tablaretencions) throws Exception {
		try	{		
			TablaRetencionConstantesFunciones.actualizarLista(tablaretencion,tablaretencions,this.tablaretencionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TablaRetencion tablaretencion,List<TablaRetencion> tablaretencions) throws Exception {
		try	{			
			TablaRetencionConstantesFunciones.actualizarSelectedLista(tablaretencion,tablaretencions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TablaRetencion> tablaretencionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tablaretencionsLocal=this.tablaretencionLogic.getTablaRetencions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tablaretencionsLocal=this.tablaretencions;
			}
			//ARCHITECTURE
		
			for(TablaRetencion tablaretencionLocal:tablaretencionsLocal) {
				if(this.permiteMantenimiento(tablaretencionLocal) && tablaretencionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TablaRetencionConstantesFunciones.getTablaRetencionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TablaRetencionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaRetencion.jLabelid_empresaTablaRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaRetencionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaRetencion.jLabelcodigoTablaRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaRetencionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaRetencion.jLabelnombreTablaRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaRetencionConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaRetencion.jLabelporcentajeTablaRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaRetencionConstantesFunciones.MONTOMINIMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaRetencion.jLabelmonto_minimoTablaRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaRetencionConstantesFunciones.IDTIPORETENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaRetencion.jLabelid_tipo_retencionTablaRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaRetencionConstantesFunciones.IDCUENTACONTABLEDEBITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaRetencion.jLabelid_cuenta_contable_debitoTablaRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaRetencionConstantesFunciones.IDCUENTACONTABLECREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaRetencion.jLabelid_cuenta_contable_creditoTablaRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaRetencionConstantesFunciones.ESDEBITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaRetencion.jLabeles_debitoTablaRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaRetencionConstantesFunciones.ESRETENCIONFUENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaRetencion.jLabeles_retencion_fuenteTablaRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaRetencionConstantesFunciones.CONSECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaRetencion.jLabelcon_secuencialTablaRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaRetencionConstantesFunciones.CONSUBTOTALFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaRetencion.jLabelcon_sub_total_facturaTablaRetencion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaRetencionConstantesFunciones.CONIVAFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaRetencion.jLabelcon_iva_facturaTablaRetencion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaRetencion.jLabelid_empresaTablaRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaRetencion.jLabelcodigoTablaRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaRetencion.jLabelnombreTablaRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaRetencion.jLabelporcentajeTablaRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaRetencion.jLabelmonto_minimoTablaRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaRetencion.jLabelid_tipo_retencionTablaRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaRetencion.jLabelid_cuenta_contable_debitoTablaRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaRetencion.jLabelid_cuenta_contable_creditoTablaRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaRetencion.jLabeles_debitoTablaRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaRetencion.jLabeles_retencion_fuenteTablaRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaRetencion.jLabelcon_secuencialTablaRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaRetencion.jLabelcon_sub_total_facturaTablaRetencion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaRetencion.jLabelcon_iva_facturaTablaRetencion,"");
		
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
		this.iIdNuevoTablaRetencion--;	
		
		
		this.tablaretencionAux=new TablaRetencion();
		
		this.tablaretencionAux.setId(this.iIdNuevoTablaRetencion);
		this.tablaretencionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tablaretencionLogic.getTablaRetencions().add(this.tablaretencionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tablaretencions.add(this.tablaretencionAux);
		}
		//ARCHITECTURE
		
		this.tablaretencion=this.tablaretencionAux;
		
		if(TablaRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTablaRetencion(this.tablaretencion);
			this.setVariablesObjetoActualToFormularioForeignKeyTablaRetencion(this.tablaretencion);
		}
				
		//this.setDefaultControlesTablaRetencion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTablaRetencion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTablaRetencion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTablaRetencion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTablaRetencion(this.tablaretencionBean,this.tablaretencion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TablaRetencionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tablaretencionSessionBean.getConGuardarRelaciones()) {
			classes=TablaRetencionConstantesFunciones.getClassesRelationshipsOfTablaRetencion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tablaretencionReturnGeneral=tablaretencionLogic.procesarEventosTablaRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tablaretencionLogic.getTablaRetencions(),this.tablaretencion,this.tablaretencionParameterGeneral,this.isEsNuevoTablaRetencion,classes);//this.tablaretencionLogic.getTablaRetencion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTablaRetencion(this.tablaretencionReturnGeneral,this.tablaretencionBean,false);
		
		if(this.tablaretencionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTablaRetencion(this.tablaretencionReturnGeneral.getTablaRetencion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTablaRetencion(this.tablaretencionReturnGeneral.getTablaRetencion());
		}
		
		if(this.tablaretencionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTablaRetencion(this.tablaretencionReturnGeneral.getTablaRetencion(),classes);//this.tablaretencionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTablaRetencion(this.tablaretencion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTablaRetencion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTablaRetencion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TablaRetencionBeanSwingJInternalFrameAdditional.RecargarFormTablaRetencion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTablaRetencion(false);
						
			if(tablaretencionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTablaRetencion();
			}
			
			this.actualizarVisualTableDatosTablaRetencion();
			
			this.jTableDatosTablaRetencion.setRowSelectionInterval(this.getIndiceNuevoTablaRetencion(), this.getIndiceNuevoTablaRetencion());
			
			this.seleccionarFilaTablaTablaRetencionActual();
						
			this.actualizarEstadoCeldasBotonesTablaRetencion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTablaRetencion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTablaRetencion.jTextFieldcodigoTablaRetencion.setEnabled(isHabilitar && this.tablaretencionConstantesFunciones.activarcodigoTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jTextAreanombreTablaRetencion.setEnabled(isHabilitar && this.tablaretencionConstantesFunciones.activarnombreTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jTextFieldporcentajeTablaRetencion.setEnabled(isHabilitar && this.tablaretencionConstantesFunciones.activarporcentajeTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jTextFieldmonto_minimoTablaRetencion.setEnabled(isHabilitar && this.tablaretencionConstantesFunciones.activarmonto_minimoTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxes_debitoTablaRetencion.setEnabled(isHabilitar && this.tablaretencionConstantesFunciones.activares_debitoTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxes_retencion_fuenteTablaRetencion.setEnabled(isHabilitar && this.tablaretencionConstantesFunciones.activares_retencion_fuenteTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_secuencialTablaRetencion.setEnabled(isHabilitar && this.tablaretencionConstantesFunciones.activarcon_secuencialTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_sub_total_facturaTablaRetencion.setEnabled(isHabilitar && this.tablaretencionConstantesFunciones.activarcon_sub_total_facturaTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_iva_facturaTablaRetencion.setEnabled(isHabilitar && this.tablaretencionConstantesFunciones.activarcon_iva_facturaTablaRetencion);	
		//
		this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_empresaTablaRetencion.setEnabled(isHabilitar && this.tablaretencionConstantesFunciones.activarid_empresaTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_tipo_retencionTablaRetencion.setEnabled(isHabilitar && this.tablaretencionConstantesFunciones.activarid_tipo_retencionTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_debitoTablaRetencion.setEnabled(isHabilitar && this.tablaretencionConstantesFunciones.activarid_cuenta_contable_debitoTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_creditoTablaRetencion.setEnabled(isHabilitar && this.tablaretencionConstantesFunciones.activarid_cuenta_contable_creditoTablaRetencion);
	};
	
	public void setDefaultControlesTablaRetencion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTablaRetencion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tablaretencionSessionBean.setConGuardarRelaciones(true);			
			this.tablaretencionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTablaRetencion.jTabbedPaneRelacionesTablaRetencion.setVisible(true);
			
					
		} else {
			//this.tablaretencionSessionBean.setConGuardarRelaciones(false);			
			this.tablaretencionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTablaRetencion.jTabbedPaneRelacionesTablaRetencion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTablaRetencion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TablaRetencion tablaretencionAux:this.tablaretencionLogic.getTablaRetencions()) {
				if(tablaretencionAux.getId().equals(this.iIdNuevoTablaRetencion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TablaRetencion tablaretencionAux:this.tablaretencions) {
				if(tablaretencionAux.getId().equals(this.iIdNuevoTablaRetencion)) {
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
	
	public int getIndiceActualTablaRetencion(TablaRetencion tablaretencion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TablaRetencion tablaretencionAux:this.tablaretencionLogic.getTablaRetencions()) {
				if(tablaretencionAux.getId().equals(tablaretencion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TablaRetencion tablaretencionAux:this.tablaretencions) {
				if(tablaretencionAux.getId().equals(tablaretencion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTablaRetencion(TablaRetencion tablaretencionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TablaRetencion tablaretencionAux:this.tablaretencionLogic.getTablaRetencions()) {
				if(tablaretencionAux.getTablaRetencionOriginal().getId().equals(tablaretencionOriginal.getId())) {
					existe=true;
					tablaretencionOriginal.setId(tablaretencionAux.getId());
					tablaretencionOriginal.setVersionRow(tablaretencionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TablaRetencion tablaretencionAux:this.tablaretencions) {
				if(tablaretencionAux.getTablaRetencionOriginal().getId().equals(tablaretencionOriginal.getId())) {
					existe=true;
					tablaretencionOriginal.setId(tablaretencionAux.getId());
					tablaretencionOriginal.setVersionRow(tablaretencionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTablaRetencion(Boolean esParaCancelar) throws Exception {
		tablaretencionsAux=new ArrayList<TablaRetencion>();
		tablaretencionAux=new TablaRetencion();
		
		if(!this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TablaRetencion tablaretencionAux:this.tablaretencionLogic.getTablaRetencions()) {
					if(tablaretencionAux.getId()<0) {
						tablaretencionsAux.add(tablaretencionAux);
					}		
				}
				this.iIdNuevoTablaRetencion=0L;
				this.tablaretencionLogic.getTablaRetencions().removeAll(tablaretencionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TablaRetencion tablaretencionAux:this.tablaretencions) {
					if(tablaretencionAux.getId()<0) {
						tablaretencionsAux.add(tablaretencionAux);
					}		
				}
				this.iIdNuevoTablaRetencion=0L;
				this.tablaretencions.removeAll(tablaretencionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTablaRetencion 
					&& this.tablaretencionLogic.getTablaRetencions().size()>0
					) {
					tablaretencionAux=this.tablaretencionLogic.getTablaRetencions().get(this.tablaretencionLogic.getTablaRetencions().size() - 1);
				
					if(tablaretencionAux.getId()<0) {
						this.tablaretencionLogic.getTablaRetencions().remove(tablaretencionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTablaRetencion && this.tablaretencions.size()>0) {
					tablaretencionAux=this.tablaretencions.get(this.tablaretencions.size() - 1);
				
					if(tablaretencionAux.getId()<0) {
						this.tablaretencions.remove(tablaretencionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTablaRetencion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tablaretencion.getId()<0) {
				this.tablaretencionLogic.getTablaRetencions().remove(this.tablaretencion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tablaretencion.getId()<0) {
				this.tablaretencions.remove(this.tablaretencion);
			}
		}			
	}
	
	public void setEstadosInicialesTablaRetencion(List<TablaRetencion> tablaretencionsAux) throws Exception {
		TablaRetencionConstantesFunciones.setEstadosInicialesTablaRetencion(tablaretencionsAux);
	}
	
	public void setEstadosInicialesTablaRetencion(TablaRetencion tablaretencionAux) throws Exception {
		TablaRetencionConstantesFunciones.setEstadosInicialesTablaRetencion(tablaretencionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTablaRetencionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTablaRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTablaRetencionActual()) {
				if(!this.isEsNuevoTablaRetencion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTablaRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTablaRetencion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTablaRetencionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tabla Retencion ?", "MANTENIMIENTO DE Tabla Retencion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTablaRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TablaRetencion tablaretencion) throws Exception {
		TablaRetencionConstantesFunciones.seleccionarAsignar(this.tablaretencion,tablaretencion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTablaRetencion=this.isPermisoActualizarOriginalTablaRetencion;
			
			
			this.seleccionarAsignar(tablaretencion);
			
			

			idCuentaContableDebitoActual=tablaretencion.getid_cuenta_contable_debito();
			this.seleccionarCuentaContableDebitoActual();

			idCuentaContableCreditoActual=tablaretencion.getid_cuenta_contable_credito();
			this.seleccionarCuentaContableCreditoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TablaRetencionConstantesFunciones.quitarEspaciosTablaRetencion(this.tablaretencion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTablaRetencion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tablaretencionSessionBean.setsFuncionBusquedaRapida(this.tablaretencionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarCuentaContableDebitoActual() throws Exception {
		try	{
			CuentaContable cuentacontabledebitoAux=new CuentaContable();

			if(this.idCuentaContableDebitoActual != null && this.idCuentaContableDebitoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontabledebitoLogic.getEntityWithConnection(this.idCuentaContableDebitoActual);
					cuentacontabledebitoAux= cuentacontabledebitoLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontabledebitosForeignKey=new ArrayList<CuentaContable>();
				cuentacontabledebitosForeignKey.add(cuentacontabledebitoAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	public void seleccionarCuentaContableCreditoActual() throws Exception {
		try	{
			CuentaContable cuentacontablecreditoAux=new CuentaContable();

			if(this.idCuentaContableCreditoActual != null && this.idCuentaContableCreditoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontablecreditoLogic.getEntityWithConnection(this.idCuentaContableCreditoActual);
					cuentacontablecreditoAux= cuentacontablecreditoLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();
				cuentacontablecreditosForeignKey.add(cuentacontablecreditoAux);
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
			if(this.isEsNuevoTablaRetencion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTablaRetencion(esParaCancelar);				
				this.cancelarNuevoTablaRetencion(esParaCancelar);								
			}
			
			this.tablaretencion=new TablaRetencion();
			
			this.inicializarTablaRetencion();
			
			this.actualizarEstadoCeldasBotonesTablaRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTablaRetencion() throws Exception {
		try {
			TablaRetencionConstantesFunciones.inicializarTablaRetencion(this.tablaretencion);
			
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
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tablaretencionLogic.getTablaRetencions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTablaRetencions(String sAccionBusqueda,List<TablaRetencion> tablaretencionsParaReportes) throws Exception {
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
					sPathReporteFinal="TablaRetencion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TablaRetencionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TablaRetencionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TablaRetencion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tabla Retencions");		
		parameters.put("busquedapor", TablaRetencionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTablaRetencion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TablaRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TablaRetencionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTablaRetencion=new JRBeanArrayDataSource(TablaRetencionJInternalFrame.TraerTablaRetencionBeans(tablaretencionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTablaRetencion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TablaRetencionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TablaRetencionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TablaRetencionBean.TraerTablaRetencionBeans(tablaretencionsParaReportes).toArray()));
							
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
				this.generarExcelReporteTablaRetencions(sAccionBusqueda,sTipoArchivoReporte,tablaretencionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTablaRetencions(sAccionBusqueda,sTipoArchivoReporte,tablaretencionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTablaRetencionActionPerformed(null);
					//this.generarExcelReporteTablaRetencions(sAccionBusqueda,sTipoArchivoReporte,tablaretencionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTablaRetencions(sAccionBusqueda,sTipoArchivoReporte,tablaretencionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTablaRetencions(sAccionBusqueda,sTipoArchivoReporte,tablaretencionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTablaRetencions(sAccionBusqueda,sTipoArchivoReporte,tablaretencionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTablaRetencions(String sAccionBusqueda,String sTipoArchivoReporte,List<TablaRetencion> tablaretencionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tablaretencion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TablaRetencions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTablaRetencion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TablaRetencion tablaretencion : tablaretencionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TablaRetencionConstantesFunciones.generarExcelReporteDataTablaRetencion("NORMAL",row,workbook,tablaretencion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Retencion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTablaRetencion(String sTipo,Row row,Workbook workbook) {
		
		TablaRetencionConstantesFunciones.generarExcelReporteHeaderTablaRetencion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTablaRetencions(String sAccionBusqueda,String sTipoArchivoReporte,List<TablaRetencion> tablaretencionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tablaretencion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TablaRetencions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TablaRetencion tablaretencion : tablaretencionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TablaRetencionConstantesFunciones.getTablaRetencionDescripcion(tablaretencion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaRetencionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaretencion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaRetencionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaretencion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaRetencionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaretencion.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaRetencionConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaretencion.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaRetencionConstantesFunciones.LABEL_MONTOMINIMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_MONTOMINIMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaretencion.getmonto_minimo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaRetencionConstantesFunciones.LABEL_IDTIPORETENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_IDTIPORETENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaretencion.gettiporetencion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaretencion.getcuentacontabledebito_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaretencion.getcuentacontablecredito_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaRetencionConstantesFunciones.LABEL_ESDEBITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_ESDEBITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tablaretencion.getes_debito()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaRetencionConstantesFunciones.LABEL_ESRETENCIONFUENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_ESRETENCIONFUENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tablaretencion.getes_retencion_fuente()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaRetencionConstantesFunciones.LABEL_CONSECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_CONSECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tablaretencion.getcon_secuencial()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaRetencionConstantesFunciones.LABEL_CONSUBTOTALFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_CONSUBTOTALFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tablaretencion.getcon_sub_total_factura()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaRetencionConstantesFunciones.LABEL_CONIVAFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_CONIVAFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tablaretencion.getcon_iva_factura()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Retencion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTablaRetencions(String sAccionBusqueda,String sTipoArchivoReporte,List<TablaRetencion> tablaretencionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TablaRetencion> tablaretencionsRespaldo=null;
		
		classes=TablaRetencionConstantesFunciones.getClassesRelationshipsOfTablaRetencion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tablaretencionLogic.setDatosCliente(this.datosCliente);
		this.tablaretencionLogic.setDatosDeep(this.datosDeep);
		this.tablaretencionLogic.setIsConDeep(true);
		
		tablaretencionsRespaldo=this.tablaretencionLogic.getTablaRetencions();
		
		this.tablaretencionLogic.setTablaRetencions(tablaretencionsParaReportes);	
		this.tablaretencionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tablaretencionsParaReportes=this.tablaretencionLogic.getTablaRetencions();
		this.tablaretencionLogic.setTablaRetencions(tablaretencionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tablaretencion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TablaRetencions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTablaRetencion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TablaRetencion tablaretencion : tablaretencionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTablaRetencion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TablaRetencionConstantesFunciones.generarExcelReporteDataTablaRetencion("NORMAL",row,workbook,tablaretencion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TablaRetencionConstantesFunciones.getTablaRetencionDescripcion(tablaretencion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Retencion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTablaRetencion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTablaRetencion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTablaRetencion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTablaRetencion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTablaRetencion() throws Exception {		
		this.startProcessTablaRetencion(true);
	}
	
	public void startProcessTablaRetencion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTablaRetencion ,this.jPanelParametrosReportesTablaRetencion, this.jScrollPanelDatosTablaRetencion,this.jPanelPaginacionTablaRetencion, this.jScrollPanelDatosEdicionTablaRetencion, this.jPanelAccionesTablaRetencion,this.jPanelAccionesFormularioTablaRetencion,this.jmenuBarTablaRetencion,this.jmenuBarDetalleTablaRetencion,this.jTtoolBarTablaRetencion,this.jTtoolBarDetalleTablaRetencion);		
		
		final JTabbedPane jTabbedPaneBusquedasTablaRetencion=this.jTabbedPaneBusquedasTablaRetencion; 
		
		final JPanel jPanelParametrosReportesTablaRetencion=this.jPanelParametrosReportesTablaRetencion;
		//final JScrollPane jScrollPanelDatosTablaRetencion=this.jScrollPanelDatosTablaRetencion;
		final JTable jTableDatosTablaRetencion=this.jTableDatosTablaRetencion;		
		final JPanel jPanelPaginacionTablaRetencion=this.jPanelPaginacionTablaRetencion;
		//final JScrollPane jScrollPanelDatosEdicionTablaRetencion=this.jScrollPanelDatosEdicionTablaRetencion;
		final JPanel jPanelAccionesTablaRetencion=this.jPanelAccionesTablaRetencion;
		
		JPanel jPanelCamposAuxiliarTablaRetencion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTablaRetencion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
			jPanelCamposAuxiliarTablaRetencion=this.jInternalFrameDetalleFormTablaRetencion.jPanelCamposTablaRetencion;
			jPanelAccionesFormularioAuxiliarTablaRetencion=this.jInternalFrameDetalleFormTablaRetencion.jPanelAccionesFormularioTablaRetencion;
		}
		
		final JPanel jPanelCamposTablaRetencion=jPanelCamposAuxiliarTablaRetencion;
		final JPanel jPanelAccionesFormularioTablaRetencion=jPanelAccionesFormularioAuxiliarTablaRetencion;
		
		
		final JMenuBar jmenuBarTablaRetencion=this.jmenuBarTablaRetencion;
		final JToolBar jTtoolBarTablaRetencion=this.jTtoolBarTablaRetencion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTablaRetencion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTablaRetencion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
			jmenuBarDetalleAuxiliarTablaRetencion=this.jInternalFrameDetalleFormTablaRetencion.jmenuBarDetalleTablaRetencion;
			jTtoolBarDetalleAuxiliarTablaRetencion=this.jInternalFrameDetalleFormTablaRetencion.jTtoolBarDetalleTablaRetencion;
		}
		
		final JMenuBar jmenuBarDetalleTablaRetencion=jmenuBarDetalleAuxiliarTablaRetencion;
		final JToolBar jTtoolBarDetalleTablaRetencion=jTtoolBarDetalleAuxiliarTablaRetencion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTablaRetencion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTablaRetencion;
			processRunnable.jTableDatos=jTableDatosTablaRetencion;
			processRunnable.jPanelCampos=jPanelCamposTablaRetencion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTablaRetencion;
			processRunnable.jPanelAcciones=jPanelAccionesTablaRetencion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTablaRetencion;
			
			
			processRunnable.jmenuBar=jmenuBarTablaRetencion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTablaRetencion;
			processRunnable.jTtoolBar=jTtoolBarTablaRetencion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTablaRetencion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTablaRetencion ,jPanelParametrosReportesTablaRetencion,jTableDatosTablaRetencion, /*jScrollPanelDatosTablaRetencion,*/jPanelCamposTablaRetencion,jPanelPaginacionTablaRetencion, /*jScrollPanelDatosEdicionTablaRetencion,*/ jPanelAccionesTablaRetencion,jPanelAccionesFormularioTablaRetencion,jmenuBarTablaRetencion,jmenuBarDetalleTablaRetencion,jTtoolBarTablaRetencion,jTtoolBarDetalleTablaRetencion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTablaRetencion ,jPanelParametrosReportesTablaRetencion, jScrollPanelDatosTablaRetencion,jPanelPaginacionTablaRetencion, jScrollPanelDatosEdicionTablaRetencion, jPanelAccionesTablaRetencion,jPanelAccionesFormularioTablaRetencion,jmenuBarTablaRetencion,jmenuBarDetalleTablaRetencion,jTtoolBarTablaRetencion,jTtoolBarDetalleTablaRetencion);
						
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
	
	public void finishProcessTablaRetencion() {// throws Exception 
		this.finishProcessTablaRetencion(true);
	}
	
	public void finishProcessTablaRetencion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTablaRetencion ,this.jPanelParametrosReportesTablaRetencion, this.jScrollPanelDatosTablaRetencion,this.jPanelPaginacionTablaRetencion, this.jScrollPanelDatosEdicionTablaRetencion, this.jPanelAccionesTablaRetencion,this.jPanelAccionesFormularioTablaRetencion,this.jmenuBarTablaRetencion,this.jmenuBarDetalleTablaRetencion,this.jTtoolBarTablaRetencion,this.jTtoolBarDetalleTablaRetencion);		
		
		final JTabbedPane jTabbedPaneBusquedasTablaRetencion=this.jTabbedPaneBusquedasTablaRetencion; 
		
		final JPanel jPanelParametrosReportesTablaRetencion=this.jPanelParametrosReportesTablaRetencion;
		//final JScrollPane jScrollPanelDatosTablaRetencion=this.jScrollPanelDatosTablaRetencion;
		final JTable jTableDatosTablaRetencion=this.jTableDatosTablaRetencion;		
		final JPanel jPanelPaginacionTablaRetencion=this.jPanelPaginacionTablaRetencion;
		//final JScrollPane jScrollPanelDatosEdicionTablaRetencion=this.jScrollPanelDatosEdicionTablaRetencion;
		final JPanel jPanelAccionesTablaRetencion=this.jPanelAccionesTablaRetencion;
		
		JPanel jPanelCamposAuxiliarTablaRetencion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTablaRetencion=new JPanel();
		
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
			jPanelCamposAuxiliarTablaRetencion=this.jInternalFrameDetalleFormTablaRetencion.jPanelCamposTablaRetencion;
			jPanelAccionesFormularioAuxiliarTablaRetencion=this.jInternalFrameDetalleFormTablaRetencion.jPanelAccionesFormularioTablaRetencion;
		}
		
		final JPanel jPanelCamposTablaRetencion=jPanelCamposAuxiliarTablaRetencion;
		final JPanel jPanelAccionesFormularioTablaRetencion=jPanelAccionesFormularioAuxiliarTablaRetencion;
		
		
		final JMenuBar jmenuBarTablaRetencion=this.jmenuBarTablaRetencion;		
		final JToolBar jTtoolBarTablaRetencion=this.jTtoolBarTablaRetencion;
				
		JMenuBar jmenuBarDetalleAuxiliarTablaRetencion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTablaRetencion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
			jmenuBarDetalleAuxiliarTablaRetencion=this.jInternalFrameDetalleFormTablaRetencion.jmenuBarDetalleTablaRetencion;
			jTtoolBarDetalleAuxiliarTablaRetencion=this.jInternalFrameDetalleFormTablaRetencion.jTtoolBarDetalleTablaRetencion;		
		}
		
		final JMenuBar jmenuBarDetalleTablaRetencion=jmenuBarDetalleAuxiliarTablaRetencion;
		final JToolBar jTtoolBarDetalleTablaRetencion=jTtoolBarDetalleAuxiliarTablaRetencion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTablaRetencion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTablaRetencion;
			processRunnable.jTableDatos=jTableDatosTablaRetencion;
			processRunnable.jPanelCampos=jPanelCamposTablaRetencion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTablaRetencion;
			processRunnable.jPanelAcciones=jPanelAccionesTablaRetencion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTablaRetencion;
			
			
			processRunnable.jmenuBar=jmenuBarTablaRetencion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTablaRetencion;
			processRunnable.jTtoolBar=jTtoolBarTablaRetencion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTablaRetencion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTablaRetencion ,jPanelParametrosReportesTablaRetencion, jTableDatosTablaRetencion,/*jScrollPanelDatosTablaRetencion,*/jPanelCamposTablaRetencion,jPanelPaginacionTablaRetencion, /*jScrollPanelDatosEdicionTablaRetencion,*/ jPanelAccionesTablaRetencion,jPanelAccionesFormularioTablaRetencion,jmenuBarTablaRetencion,jmenuBarDetalleTablaRetencion,jTtoolBarTablaRetencion,jTtoolBarDetalleTablaRetencion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTablaRetencion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTablaRetencion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTablaRetencion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTablaRetencion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTablaRetencion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTablaRetencion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTablaRetencion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTablaRetencion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTablaRetencion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tablaretencionConstantesFunciones.getsFinalQueryTablaRetencion();
		String  finalQueryPaginacionTodos=this.tablaretencionConstantesFunciones.getsFinalQueryTablaRetencion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TablaRetencionConstantesFunciones.getArrayColumnasGlobalesNoTablaRetencion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TablaRetencionConstantesFunciones.getArrayColumnasGlobalesTablaRetencion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TablaRetencionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tablaretencionsEliminados= new ArrayList<TablaRetencion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTablaRetencion();
		
				///*TablaRetencionSessionBean*/this.tablaretencionSessionBean=new TablaRetencionSessionBean();
			
			if(this.tablaretencionSessionBean==null) {
				this.tablaretencionSessionBean=new TablaRetencionSessionBean();
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
					this.iNumeroPaginacion=TablaRetencionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TablaRetencionConstantesFunciones.getClassesForeignKeysOfTablaRetencion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tablaretencion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tablaretencionsAux= new ArrayList<TablaRetencion>();
			
				
			tablaretencionLogic.setDatosCliente(this.datosCliente);
			tablaretencionLogic.setDatosDeep(this.datosDeep);
			tablaretencionLogic.setIsConDeep(true);
			
			
			tablaretencionLogic.getTablaRetencionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tablaretencionLogic.getTodosTablaRetencions(finalQueryGlobal,pagination);
					
					//tablaretencionLogic.getTodosTablaRetencionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tablaretencionLogic.getTablaRetencions()==null|| tablaretencionLogic.getTablaRetencions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tablaretencionsAux= new ArrayList<TablaRetencion>();
							tablaretencionsAux.addAll(tablaretencionLogic.getTablaRetencions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaretencionsAux= new ArrayList<TablaRetencion>();
							tablaretencionsAux.addAll(tablaretencions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tablaretencionLogic.getTodosTablaRetencions(finalQueryGlobal+"",this.pagination);												
							
							//tablaretencionLogic.getTodosTablaRetencionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTablaRetencions("Todos",tablaretencionLogic.getTablaRetencions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tablaretencionLogic.setTablaRetencions(new ArrayList<TablaRetencion>());					
							tablaretencionLogic.getTablaRetencions().addAll(tablaretencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaretencions=new ArrayList<TablaRetencion>();
							tablaretencions.addAll(tablaretencionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTablaRetencion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTablaRetencion=this.idActual;
				
				} else if(this.idTablaRetencionActual!=null && this.idTablaRetencionActual!=0L) {
					idTablaRetencion=idTablaRetencionActual;
				}
				
					
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndicePorId(idTablaRetencion);
				
				this.tablaretencions=new ArrayList<TablaRetencion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tablaretencionLogic.getEntity(idTablaRetencion);
					
					//tablaretencionLogic.getEntityWithConnection(idTablaRetencion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaretencionLogic.setTablaRetencions(new ArrayList<TablaRetencion>());
					tablaretencionLogic.getTablaRetencions().add(tablaretencionLogic.getTablaRetencion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaretencions=new ArrayList<TablaRetencion>();
					this.tablaretencions.add(tablaretencion);
				}
				
				if(tablaretencionLogic.getTablaRetencion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tablaretencionLogic.getTablaRetencionsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tablaretencionLogic.getTablaRetencions()==null||tablaretencionLogic.getTablaRetencions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tablaretencions==null|| tablaretencions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaretencionsAux=new ArrayList<TablaRetencion>();
						tablaretencionsAux.addAll(tablaretencionLogic.getTablaRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaretencionsAux=new ArrayList<TablaRetencion>();
							tablaretencionsAux.addAll(tablaretencions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tablaretencionLogic.getTablaRetencionsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTablaRetencions("BusquedaPorCodigo",tablaretencionLogic.getTablaRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTablaRetencions("BusquedaPorCodigo",tablaretencions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaretencionLogic.setTablaRetencions(new ArrayList<TablaRetencion>());
						tablaretencionLogic.getTablaRetencions().addAll(tablaretencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaretencions=new ArrayList<TablaRetencion>();
							tablaretencions.addAll(tablaretencionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tablaretencionLogic.getTablaRetencionsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tablaretencionLogic.getTablaRetencions()==null||tablaretencionLogic.getTablaRetencions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tablaretencions==null|| tablaretencions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaretencionsAux=new ArrayList<TablaRetencion>();
						tablaretencionsAux.addAll(tablaretencionLogic.getTablaRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaretencionsAux=new ArrayList<TablaRetencion>();
							tablaretencionsAux.addAll(tablaretencions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tablaretencionLogic.getTablaRetencionsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTablaRetencions("BusquedaPorNombre",tablaretencionLogic.getTablaRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTablaRetencions("BusquedaPorNombre",tablaretencions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaretencionLogic.setTablaRetencions(new ArrayList<TablaRetencion>());
						tablaretencionLogic.getTablaRetencions().addAll(tablaretencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaretencions=new ArrayList<TablaRetencion>();
							tablaretencions.addAll(tablaretencionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContableCredito")) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tablaretencionLogic.getTablaRetencionsFK_IdCuentaContableCredito(finalQueryGlobal,pagination,id_cuenta_contable_creditoFK_IdCuentaContableCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tablaretencionLogic.getTablaRetencions()==null||tablaretencionLogic.getTablaRetencions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tablaretencions==null|| tablaretencions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaretencionsAux=new ArrayList<TablaRetencion>();
						tablaretencionsAux.addAll(tablaretencionLogic.getTablaRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaretencionsAux=new ArrayList<TablaRetencion>();
							tablaretencionsAux.addAll(tablaretencions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tablaretencionLogic.getTablaRetencionsFK_IdCuentaContableCredito(finalQueryGlobal,pagination,id_cuenta_contable_creditoFK_IdCuentaContableCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCredito(id_cuenta_contable_creditoFK_IdCuentaContableCredito);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTablaRetencions("FK_IdCuentaContableCredito",tablaretencionLogic.getTablaRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTablaRetencions("FK_IdCuentaContableCredito",tablaretencions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaretencionLogic.setTablaRetencions(new ArrayList<TablaRetencion>());
						tablaretencionLogic.getTablaRetencions().addAll(tablaretencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaretencions=new ArrayList<TablaRetencion>();
							tablaretencions.addAll(tablaretencionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContableDebito")) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tablaretencionLogic.getTablaRetencionsFK_IdCuentaContableDebito(finalQueryGlobal,pagination,id_cuenta_contable_debitoFK_IdCuentaContableDebito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tablaretencionLogic.getTablaRetencions()==null||tablaretencionLogic.getTablaRetencions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tablaretencions==null|| tablaretencions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaretencionsAux=new ArrayList<TablaRetencion>();
						tablaretencionsAux.addAll(tablaretencionLogic.getTablaRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaretencionsAux=new ArrayList<TablaRetencion>();
							tablaretencionsAux.addAll(tablaretencions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tablaretencionLogic.getTablaRetencionsFK_IdCuentaContableDebito(finalQueryGlobal,pagination,id_cuenta_contable_debitoFK_IdCuentaContableDebito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDebito(id_cuenta_contable_debitoFK_IdCuentaContableDebito);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTablaRetencions("FK_IdCuentaContableDebito",tablaretencionLogic.getTablaRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTablaRetencions("FK_IdCuentaContableDebito",tablaretencions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaretencionLogic.setTablaRetencions(new ArrayList<TablaRetencion>());
						tablaretencionLogic.getTablaRetencions().addAll(tablaretencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaretencions=new ArrayList<TablaRetencion>();
							tablaretencions.addAll(tablaretencionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tablaretencionLogic.getTablaRetencionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tablaretencionLogic.getTablaRetencions()==null||tablaretencionLogic.getTablaRetencions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tablaretencions==null|| tablaretencions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaretencionsAux=new ArrayList<TablaRetencion>();
						tablaretencionsAux.addAll(tablaretencionLogic.getTablaRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaretencionsAux=new ArrayList<TablaRetencion>();
							tablaretencionsAux.addAll(tablaretencions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tablaretencionLogic.getTablaRetencionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTablaRetencions("FK_IdEmpresa",tablaretencionLogic.getTablaRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTablaRetencions("FK_IdEmpresa",tablaretencions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaretencionLogic.setTablaRetencions(new ArrayList<TablaRetencion>());
						tablaretencionLogic.getTablaRetencions().addAll(tablaretencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaretencions=new ArrayList<TablaRetencion>();
							tablaretencions.addAll(tablaretencionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoRetencion")) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tablaretencionLogic.getTablaRetencionsFK_IdTipoRetencion(finalQueryGlobal,pagination,id_tipo_retencionFK_IdTipoRetencion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tablaretencionLogic.getTablaRetencions()==null||tablaretencionLogic.getTablaRetencions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tablaretencions==null|| tablaretencions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaretencionsAux=new ArrayList<TablaRetencion>();
						tablaretencionsAux.addAll(tablaretencionLogic.getTablaRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaretencionsAux=new ArrayList<TablaRetencion>();
							tablaretencionsAux.addAll(tablaretencions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tablaretencionLogic.getTablaRetencionsFK_IdTipoRetencion(finalQueryGlobal,pagination,id_tipo_retencionFK_IdTipoRetencion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaRetencionConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTablaRetencions("FK_IdTipoRetencion",tablaretencionLogic.getTablaRetencions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTablaRetencions("FK_IdTipoRetencion",tablaretencions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaretencionLogic.setTablaRetencions(new ArrayList<TablaRetencion>());
						tablaretencionLogic.getTablaRetencions().addAll(tablaretencionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaretencions=new ArrayList<TablaRetencion>();
							tablaretencions.addAll(tablaretencionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTablaRetencion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTablaRetencion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tablaretencionLogic.getTablaRetencions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tablaretencions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tablaretencionLogic.getTablaRetencions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tablaretencions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TablaRetencion tablaretencion) {
		Boolean permite=true;
		
		if(this.tablaretencion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TablaRetencionConstantesFunciones.getOrderByListaTablaRetencion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TablaRetencionConstantesFunciones.getOrderByListaTablaRetencion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TablaRetencion tablaretencion:tablaretencionLogic.getTablaRetencions()) {
				if(tablaretencion.getsType().equals(Constantes2.S_TOTALES)) {
					tablaretencionTotales=tablaretencion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TablaRetencion tablaretencion:this.tablaretencions) {
				if(tablaretencion.getsType().equals(Constantes2.S_TOTALES)) {
					tablaretencionTotales=tablaretencion;
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
			this.tablaretencionAux=new TablaRetencion();
			this.tablaretencionAux.setsType(Constantes2.S_TOTALES);
			this.tablaretencionAux.setIsNew(false);
			this.tablaretencionAux.setIsChanged(false);
			this.tablaretencionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TablaRetencionConstantesFunciones.TotalizarValoresFilaTablaRetencion(this.tablaretencionLogic.getTablaRetencions(),this.tablaretencionAux);
				
				this.tablaretencionLogic.getTablaRetencions().add(this.tablaretencionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TablaRetencionConstantesFunciones.TotalizarValoresFilaTablaRetencion(this.tablaretencions,this.tablaretencionAux);
				
				this.tablaretencions.add(this.tablaretencionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tablaretencionTotales=new TablaRetencion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tablaretencionLogic.getTablaRetencions().remove(tablaretencionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tablaretencions.remove(tablaretencionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tablaretencionTotales=new TablaRetencion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TablaRetencion tablaretencion:tablaretencionLogic.getTablaRetencions()) {
				if(tablaretencion.getsType().equals(Constantes2.S_TOTALES)) {
					tablaretencionTotales=tablaretencion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TablaRetencionConstantesFunciones.TotalizarValoresFilaTablaRetencion(this.tablaretencionLogic.getTablaRetencions(),tablaretencionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TablaRetencion tablaretencion:this.tablaretencions) {
				if(tablaretencion.getsType().equals(Constantes2.S_TOTALES)) {
					tablaretencionTotales=tablaretencion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TablaRetencionConstantesFunciones.TotalizarValoresFilaTablaRetencion(this.tablaretencions,tablaretencionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTablaRetencionsBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTablaRetencionsBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTablaRetencionsFK_IdCuentaContableCredito()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableCredito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTablaRetencionsFK_IdCuentaContableDebito()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableDebito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTablaRetencionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTablaRetencionsFK_IdTipoRetencion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoRetencion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTablaRetencionsBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaretencionLogic.getTablaRetencionsBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTablaRetencionsBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaretencionLogic.getTablaRetencionsBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTablaRetencionsFK_IdCuentaContableCredito(String sFinalQuery,Long id_cuenta_contable_credito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaretencionLogic.getTablaRetencionsFK_IdCuentaContableCredito(sFinalQuery,this.pagination,id_cuenta_contable_credito);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTablaRetencionsFK_IdCuentaContableDebito(String sFinalQuery,Long id_cuenta_contable_debito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaretencionLogic.getTablaRetencionsFK_IdCuentaContableDebito(sFinalQuery,this.pagination,id_cuenta_contable_debito);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTablaRetencionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaretencionLogic.getTablaRetencionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTablaRetencionsFK_IdTipoRetencion(String sFinalQuery,Long id_tipo_retencion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaretencionLogic.getTablaRetencionsFK_IdTipoRetencion(sFinalQuery,this.pagination,id_tipo_retencion);
				
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
	
	public void inicializarPermisosTablaRetencion() {
		this.isPermisoTodoTablaRetencion=false;
		this.isPermisoNuevoTablaRetencion=false;
		this.isPermisoActualizarTablaRetencion=false;
		this.isPermisoActualizarOriginalTablaRetencion=false;
		this.isPermisoEliminarTablaRetencion=false;
		this.isPermisoGuardarCambiosTablaRetencion=false;
		this.isPermisoConsultaTablaRetencion=false;
		this.isPermisoBusquedaTablaRetencion=false;
		this.isPermisoReporteTablaRetencion=false;		
		this.isPermisoOrdenTablaRetencion=false;		
		this.isPermisoPaginacionMedioTablaRetencion=false;		
		this.isPermisoPaginacionAltoTablaRetencion=false;
		this.isPermisoPaginacionTodoTablaRetencion=false;
		this.isPermisoCopiarTablaRetencion=false;		
		this.isPermisoVerFormTablaRetencion=false;		
		this.isPermisoDuplicarTablaRetencion=false;		
		this.isPermisoOrdenTablaRetencion=false;		
	}
	
	public void setPermisosUsuarioTablaRetencion(Boolean isPermiso) {
		this.isPermisoTodoTablaRetencion=isPermiso;
		this.isPermisoNuevoTablaRetencion=isPermiso;
		this.isPermisoActualizarTablaRetencion=isPermiso;
		this.isPermisoActualizarOriginalTablaRetencion=isPermiso;
		this.isPermisoEliminarTablaRetencion=isPermiso;
		this.isPermisoGuardarCambiosTablaRetencion=isPermiso;
		this.isPermisoConsultaTablaRetencion=isPermiso;
		this.isPermisoBusquedaTablaRetencion=isPermiso;
		this.isPermisoReporteTablaRetencion=isPermiso;
		this.isPermisoOrdenTablaRetencion=isPermiso;		
		this.isPermisoPaginacionMedioTablaRetencion=isPermiso;		
		this.isPermisoPaginacionAltoTablaRetencion=isPermiso;		
		this.isPermisoPaginacionTodoTablaRetencion=isPermiso;		
		this.isPermisoCopiarTablaRetencion=isPermiso;		
		this.isPermisoVerFormTablaRetencion=isPermiso;		
		this.isPermisoDuplicarTablaRetencion=isPermiso;
		this.isPermisoOrdenTablaRetencion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTablaRetencion(Boolean isPermiso) {
		//this.isPermisoTodoTablaRetencion=isPermiso;
		this.isPermisoNuevoTablaRetencion=isPermiso;
		this.isPermisoActualizarTablaRetencion=isPermiso;
		this.isPermisoActualizarOriginalTablaRetencion=isPermiso;
		this.isPermisoEliminarTablaRetencion=isPermiso;
		this.isPermisoGuardarCambiosTablaRetencion=isPermiso;
		//this.isPermisoConsultaTablaRetencion=isPermiso;
		//this.isPermisoBusquedaTablaRetencion=isPermiso;
		//this.isPermisoReporteTablaRetencion=isPermiso;
		//this.isPermisoOrdenTablaRetencion=isPermiso;		
		//this.isPermisoPaginacionMedioTablaRetencion=isPermiso;		
		//this.isPermisoPaginacionAltoTablaRetencion=isPermiso;		
		//this.isPermisoPaginacionTodoTablaRetencion=isPermiso;		
		//this.isPermisoCopiarTablaRetencion=isPermiso;		
		//this.isPermisoDuplicarTablaRetencion=isPermiso;
		//this.isPermisoOrdenTablaRetencion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTablaRetencionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TablaRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTablaRetencion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTablaRetencionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTablaRetencionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTablaRetencionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTablaRetencionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTablaRetencion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TablaRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TablaRetencionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTablaRetencion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTablaRetencion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTablaRetencion=this.isPermisoActualizarTablaRetencion;
			this.isPermisoEliminarTablaRetencion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTablaRetencion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTablaRetencion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTablaRetencion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTablaRetencion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTablaRetencion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTablaRetencion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTablaRetencion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTablaRetencion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTablaRetencion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTablaRetencion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTablaRetencion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTablaRetencion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTablaRetencion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTablaRetencion.setToolTipText(this.jTableDatosTablaRetencion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTablaRetencion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTablaRetencion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TablaRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TablaRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTablaRetencion() throws Exception {
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
	public void inicializarCombosForeignKeyTablaRetencionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tiporetencionsForeignKey=new ArrayList();
				this.cuentacontabledebitosForeignKey=new ArrayList();
				this.cuentacontablecreditosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTablaRetencionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TablaRetencionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTablaRetencionListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoRetencionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableDebitoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoRetencionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tiporetencionsForeignKey==null||this.tiporetencionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoRetencionConstantesFunciones.getArrayColumnasGlobalesTipoRetencion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRetencionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoRetencionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoRetencionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableDebitoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontabledebitosForeignKey==null||this.cuentacontabledebitosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContableDebitosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableCreditoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontablecreditosForeignKey==null||this.cuentacontablecreditosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContableCreditosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTablaRetencionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TablaRetencionParameterReturnGeneral tablaretencionReturnGeneral=new TablaRetencionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tablaretencionConstantesFunciones.cargarid_empresaTablaRetencion)
					 || (this.esRecargarFks && this.tablaretencionConstantesFunciones.cargarid_empresaTablaRetencion)) {

					if(!this.tablaretencionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tablaretencionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoRetencion="";

				if(((this.tiporetencionsForeignKey==null||this.tiporetencionsForeignKey.size()<=0) && this.tablaretencionConstantesFunciones.cargarid_tipo_retencionTablaRetencion)
					 || (this.esRecargarFks && this.tablaretencionConstantesFunciones.cargarid_tipo_retencionTablaRetencion)) {

					if(!this.tablaretencionSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoRetencionConstantesFunciones.getArrayColumnasGlobalesTipoRetencion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoRetencion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRetencionConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoRetencion=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoRetencion, "");
						finalQueryGlobalTipoRetencion+=TipoRetencionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoRetencionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoRetencion=" WHERE " + ConstantesSql.ID + "="+tablaretencionSessionBean.getlidTipoRetencionActual();
					}
				} else {
					finalQueryGlobalTipoRetencion="NONE";
				}


				String finalQueryGlobalCuentaContableDebito="";

				if(((this.cuentacontabledebitosForeignKey==null||this.cuentacontabledebitosForeignKey.size()<=0) && this.tablaretencionConstantesFunciones.cargarid_cuenta_contable_debitoTablaRetencion)
					 || (this.esRecargarFks && this.tablaretencionConstantesFunciones.cargarid_cuenta_contable_debitoTablaRetencion)) {

					if(!this.tablaretencionSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDebito()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableDebito=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableDebito=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableDebito, "");
						finalQueryGlobalCuentaContableDebito+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableDebitosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableDebito=" WHERE " + ConstantesSql.ID + "="+tablaretencionSessionBean.getlidCuentaContableDebitoActual();
					}
				} else {
					finalQueryGlobalCuentaContableDebito="NONE";
				}


				String finalQueryGlobalCuentaContableCredito="";

				if(((this.cuentacontablecreditosForeignKey==null||this.cuentacontablecreditosForeignKey.size()<=0) && this.tablaretencionConstantesFunciones.cargarid_cuenta_contable_creditoTablaRetencion)
					 || (this.esRecargarFks && this.tablaretencionConstantesFunciones.cargarid_cuenta_contable_creditoTablaRetencion)) {

					if(!this.tablaretencionSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableCredito=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableCredito=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableCredito, "");
						finalQueryGlobalCuentaContableCredito+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableCreditosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableCredito=" WHERE " + ConstantesSql.ID + "="+tablaretencionSessionBean.getlidCuentaContableCreditoActual();
					}
				} else {
					finalQueryGlobalCuentaContableCredito="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tablaretencionReturnGeneral=tablaretencionLogic.cargarCombosLoteForeignKeyTablaRetencion(finalQueryGlobalEmpresa,finalQueryGlobalTipoRetencion,finalQueryGlobalCuentaContableDebito,finalQueryGlobalCuentaContableCredito);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tablaretencionReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoRetencion.equals("NONE")) {
				this.tiporetencionsForeignKey=tablaretencionReturnGeneral.gettiporetencionsForeignKey();
			}

			if(!finalQueryGlobalCuentaContableDebito.equals("NONE")) {
				this.cuentacontabledebitosForeignKey=tablaretencionReturnGeneral.getcuentacontabledebitosForeignKey();
			}

			if(!finalQueryGlobalCuentaContableCredito.equals("NONE")) {
				this.cuentacontablecreditosForeignKey=tablaretencionReturnGeneral.getcuentacontablecreditosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTablaRetencion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoRetencion();
			this.addItemDefectoCombosForeignKeyCuentaContableDebito();
			this.addItemDefectoCombosForeignKeyCuentaContableCredito();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tablaretencionSessionBean==null) {
				this.tablaretencionSessionBean=new TablaRetencionSessionBean();
			}

			if(!this.tablaretencionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyTipoRetencion()throws Exception {
		try {

			if(!this.tablaretencionSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencion()) {
				TipoRetencion tiporetencion=new TipoRetencion();
				TipoRetencionConstantesFunciones.setTipoRetencionDescripcion(tiporetencion,Constantes.SMENSAJE_ESCOJA_OPCION);
				tiporetencion.setId(null);

				if(!TipoRetencionConstantesFunciones.ExisteEnLista(this.tiporetencionsForeignKey,tiporetencion,true)) {

					this.tiporetencionsForeignKey.add(0,tiporetencion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContableDebito()throws Exception {
		try {

			if(!this.tablaretencionSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDebito()) {
				CuentaContable cuentacontabledebito=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontabledebito,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontabledebito.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontabledebitosForeignKey,cuentacontabledebito,true)) {

					this.cuentacontabledebitosForeignKey.add(0,cuentacontabledebito);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContableCredito()throws Exception {
		try {

			if(!this.tablaretencionSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCredito()) {
				CuentaContable cuentacontablecredito=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontablecredito,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontablecredito.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontablecreditosForeignKey,cuentacontablecredito,true)) {

					this.cuentacontablecreditosForeignKey.add(0,cuentacontablecredito);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTablaRetencion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTablaRetencion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTablaRetencion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTablaRetencion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTablaRetencion(TablaRetencion tablaretencion)throws Exception {	
		try {
			
			this.setActualTipoRetencionForeignKey(tablaretencion.getid_tipo_retencion(),false,"Formulario");
			this.setActualCuentaContableDebitoForeignKey(tablaretencion.getid_cuenta_contable_debito(),false,"Formulario");
			this.setActualCuentaContableCreditoForeignKey(tablaretencion.getid_cuenta_contable_credito(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTablaRetencion(TablaRetencion tablaretencion,String sTipoEvento)throws Exception {	
		try {
			
			

				if(tablaretencion.getCuentaContableDebito()!=null && !sTipoEvento.equals("id_cuenta_contable_debitoTablaRetencion")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontabledebitosForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontabledebitosForeignKey.add(tablaretencion.getCuentaContableDebito());

					this.addItemDefectoCombosForeignKeyCuentaContableDebito();
					this.cargarCombosFrameCuentaContableDebitosForeignKey("Todos");
				}

				if(tablaretencion.getCuentaContableCredito()!=null && !sTipoEvento.equals("id_cuenta_contable_creditoTablaRetencion")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablecreditosForeignKey.add(tablaretencion.getCuentaContableCredito());

					this.addItemDefectoCombosForeignKeyCuentaContableCredito();
					this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTablaRetencion()throws Exception {	
		try {
			
			this.setActualTipoRetencionForeignKey(this.tablaretencionConstantesFunciones.getid_tipo_retencion(),false,"Formulario");
			this.setActualCuentaContableDebitoForeignKey(this.tablaretencionConstantesFunciones.getid_cuenta_contable_debito(),false,"Formulario");
			this.setActualCuentaContableCreditoForeignKey(this.tablaretencionConstantesFunciones.getid_cuenta_contable_credito(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTablaRetencion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTablaRetencion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTablaRetencion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTablaRetencion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTablaRetencion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoRetencionsForeignKey("Todos");
			this.cargarCombosFrameCuentaContableDebitosForeignKey("Todos");
			this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTablaRetencion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoRetencionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableDebitosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableCreditosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTablaRetencion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_empresaTablaRetencion!=null && this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_empresaTablaRetencion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_empresaTablaRetencion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_tipo_retencionTablaRetencion!=null && this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_tipo_retencionTablaRetencion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_tipo_retencionTablaRetencion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_debitoTablaRetencion!=null && this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_debitoTablaRetencion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_debitoTablaRetencion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_creditoTablaRetencion!=null && this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_creditoTablaRetencion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_creditoTablaRetencion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public TablaRetencionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TablaRetencionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TablaRetencionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tablaretencionSessionBean=new TablaRetencionSessionBean(); 
		this.tablaretencionConstantesFunciones=new TablaRetencionConstantesFunciones(); 
		this.tablaretencionBean=new TablaRetencion();//(this.tablaretencionConstantesFunciones); 		
		this.tablaretencionReturnGeneral=new TablaRetencionParameterReturnGeneral(); 
		
		this.tablaretencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tablaretencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TablaRetencionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TablaRetencionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TablaRetencionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTablaRetencion(true);
			
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
			
			this.tablaretencionConstantesFunciones=new TablaRetencionConstantesFunciones(); 
			this.tablaretencionBean=new TablaRetencion();//this.tablaretencionConstantesFunciones); 			
			this.tablaretencionReturnGeneral=new TablaRetencionParameterReturnGeneral(); 
		
			TablaRetencionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tabla Retencion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.tablaretencion=new TablaRetencion();
			this.tablaretencions = new ArrayList<TablaRetencion>();
			this.tablaretencionsAux = new ArrayList<TablaRetencion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic=new TablaRetencionLogic();
				this.tablaretencionLogic.getNewConnexionToDeep("");
			}
			
			//this.tablaretencionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tablaretencionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTablaRetencion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTablaRetencion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTablaRetencion);	
					}
					
					if(this.jInternalFrameImportacionTablaRetencion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTablaRetencion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTablaRetencion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTablaRetencion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTablaRetencion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTablaRetencion);
				this.jInternalFrameDetalleFormTablaRetencion.setVisible(false);
				this.jInternalFrameDetalleFormTablaRetencion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTablaRetencion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTablaRetencion);
					this.jInternalFrameReporteDinamicoTablaRetencion.setVisible(false);
					this.jInternalFrameReporteDinamicoTablaRetencion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTablaRetencion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTablaRetencion);
					this.jInternalFrameImportacionTablaRetencion.setVisible(false);
					this.jInternalFrameImportacionTablaRetencion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTablaRetencion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTablaRetencion);
					this.jInternalFrameOrderByTablaRetencion.setVisible(false);
					this.jInternalFrameOrderByTablaRetencion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTablaRetencionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TablaRetencionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tablaretencionReturnGeneral=new TablaRetencionParameterReturnGeneral();
			
			this.tablaretencionParameterGeneral=new TablaRetencionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tablaretencionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TablaRetencionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TablaRetencionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tablaretencionSessionBean.getEsGuardarRelacionado(),this.tablaretencionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TablaRetencionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tablaretencionSessionBean.getEsGuardarRelacionado(),this.tablaretencionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTablaRetencion=false;
			this.isVisibilidadCeldaDuplicarTablaRetencion=true;
			this.isVisibilidadCeldaCopiarTablaRetencion=true;
			this.isVisibilidadCeldaVerFormTablaRetencion=true;
			this.isVisibilidadCeldaOrdenTablaRetencion=true;
			this.isVisibilidadCeldaNuevoRelacionesTablaRetencion=false;
			this.isVisibilidadCeldaModificarTablaRetencion=false;
			this.isVisibilidadCeldaActualizarTablaRetencion=false;
			this.isVisibilidadCeldaEliminarTablaRetencion=false;
			this.isVisibilidadCeldaCancelarTablaRetencion=false;
			this.isVisibilidadCeldaGuardarTablaRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosTablaRetencion=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdCuentaContableCredito=true;
			this.isVisibilidadFK_IdCuentaContableDebito=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoRetencion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTablaRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTablaRetencion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTablaRetencion(false);
			
			this.setPermisosUsuarioTablaRetencion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tablaretencionSessionBean.getEsGuardarRelacionado() 
				|| (this.tablaretencionSessionBean.getEsGuardarRelacionado() && this.tablaretencionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTablaRetencionClasesRelacionadas();
			}
			
			if(this.tablaretencionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTablaRetencionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTablaRetencion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTablaRetencion();
			}
			
			if(!this.isPermisoBusquedaTablaRetencion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTablaRetencion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tablaretencionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTablaRetencion,this.isPermisoPaginacionMedioTablaRetencion,this.isPermisoPaginacionTodoTablaRetencion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TablaRetencionConstantesFunciones.getTiposSeleccionarTablaRetencion());
				
				this.tiposColumnasSelect=TablaRetencionConstantesFunciones.getTiposSeleccionarTablaRetencion(true);
				
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
			//if(!this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTablaRetencion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioTablaRetencion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioTablaRetencion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTablaRetencion() ;
			
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
			this.tiporetencionLogic=new TipoRetencionLogic();
			this.cuentacontabledebitoLogic=new CuentaContableLogic();
			this.cuentacontablecreditoLogic=new CuentaContableLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tablaretencionImplementable= (TablaRetencionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TablaRetencionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tablaretencionImplementableHome= (TablaRetencionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TablaRetencionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tablaretencions= new ArrayList<TablaRetencion>();
			this.tablaretencionsEliminados= new ArrayList<TablaRetencion>();
						
			this.isEsNuevoTablaRetencion=false;
			this.esParaAccionDesdeFormularioTablaRetencion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCuentaContableDebitoActual=0L;
			this.idCuentaContableCreditoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tiporetencionsForeignKey=new ArrayList<TipoRetencion>() ;
			this.cuentacontabledebitosForeignKey=new ArrayList<CuentaContable>() ;
			this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTablaRetencion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTablaRetencion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TablaRetencionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TablaRetencionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTablaRetencion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTablaRetencion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTablaRetencion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTablaRetencion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTablaRetencion();
			}
			
			TablaRetencionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTablaRetencion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTablaRetencion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTablaRetencion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTablaRetencion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TablaRetencion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTablaRetencion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTablaRetencion")) {
				iIndex=this.jInternalFrameDetalleFormTablaRetencion.jTabbedPaneRelacionesTablaRetencion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTablaRetencion.jTabbedPaneRelacionesTablaRetencion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTablaRetencion();	
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
	
	public void cargarCombosForeignKeyTablaRetencion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTablaRetencion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTablaRetencion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTablaRetencionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTablaRetencion();
		
		this.cargarCombosFrameForeignKeyTablaRetencion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTablaRetencion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTablaRetencion();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoRetencion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoRetencionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoRetencion();
				this.cargarCombosFrameTipoRetencionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoRetencion(this.tiporetencionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableDebito(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableDebitoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContableDebito();
				this.cargarCombosFrameCuentaContableDebitosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContableDebito(this.cuentacontabledebitosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableCredito(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContableCredito();
				this.cargarCombosFrameCuentaContableCreditosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContableCredito(this.cuentacontablecreditosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTablaRetencionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tablaretencionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTablaRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
			
			
			if(jTableDatosTablaRetencion.getRowCount()>=1) {
				jTableDatosTablaRetencion.removeRowSelectionInterval(0, jTableDatosTablaRetencion.getRowCount()-1);						
			}
			
			this.isEsNuevoTablaRetencion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTablaRetencion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTablaRetencion(true);			
			//this.tablaretencion=new TablaRetencion();
			//this.tablaretencion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTablaRetencion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTablaRetencion() ;
			
			if(TablaRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTablaRetencion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tablaretencion);	
			this.actualizarInformacion("INFO_PADRE",false,this.tablaretencion);				
			
			TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
			
			if(this.tablaretencionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TablaRetencion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTablaRetencionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TablaRetencion> tablaretencionsSeleccionados=new ArrayList<TablaRetencion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTablaRetencion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTablaRetencion.getSelectedRows().length;			
			}
			
			tablaretencionsSeleccionados=this.getTablaRetencionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTablaRetencion--;			
				//TablaRetencion tablaretencionAux= new TablaRetencion();			
				//tablaretencionAux.setId(this.iIdNuevoTablaRetencion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TablaRetencion tablaretencionOrigen=new TablaRetencion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TablaRetencion tablaretencionOrigen : tablaretencionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tablaretencionOrigen =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaretencionOrigen =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTablaRetencion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tablaretencion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTablaRetencion(tablaretencionOrigen,this.tablaretencion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tablaretencionLogic.getTablaRetencions().add(this.tablaretencionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tablaretencions.add(this.tablaretencionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTablaRetencion(false);
				
				this.jTableDatosTablaRetencion.setRowSelectionInterval(this.getIndiceNuevoTablaRetencion(), this.getIndiceNuevoTablaRetencion());
				
				int iLastRow =  this.jTableDatosTablaRetencion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTablaRetencion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTablaRetencion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTablaRetencion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTablaRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TablaRetencion> tablaretencionsSeleccionados=new ArrayList<TablaRetencion>();									
		
			TablaRetencion tablaretencionOrigen=new TablaRetencion();
			TablaRetencion tablaretencionDestino=new TablaRetencion();
				
			tablaretencionsSeleccionados=this.getTablaRetencionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTablaRetencion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tablaretencionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTablaRetencion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaretencionOrigen =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tablaretencionOrigen =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaretencionDestino =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tablaretencionDestino =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tablaretencionOrigen =tablaretencionsSeleccionados.get(0);
				tablaretencionDestino =tablaretencionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTablaRetencion(tablaretencionOrigen,tablaretencionDestino,true,false);
				
				tablaretencionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tablaretencionDestino,tablaretencionLogic.getTablaRetencions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tablaretencionDestino,tablaretencions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTablaRetencion(false);
				
				//this.jTableDatosTablaRetencion.setRowSelectionInterval(this.getIndiceNuevoTablaRetencion(), this.getIndiceNuevoTablaRetencion());
				
				int iLastRow =  this.jTableDatosTablaRetencion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTablaRetencion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTablaRetencion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTablaRetencion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTablaRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTablaRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTablaRetencion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTablaRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTablaRetencion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTablaRetencion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTablaRetencion.setVisible(!isVisible);
			this.jPanelPaginacionTablaRetencion.setVisible(!isVisible);
			this.jPanelAccionesTablaRetencion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTablaRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTablaRetencion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTablaRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTablaRetencion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTablaRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTablaRetencion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTablaRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTablaRetencion();
			
			this.abrirFrameOrderByTablaRetencion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTablaRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTablaRetencion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTablaRetencion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTablaRetencion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTablaRetencion.isMaximum()) {
					this.jInternalFrameDetalleFormTablaRetencion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTablaRetencion.setSize(this.jInternalFrameDetalleFormTablaRetencion.iWidthFormulario,this.jInternalFrameDetalleFormTablaRetencion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTablaRetencion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTablaRetencion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTablaRetencion.isMaximum()) {
						this.jInternalFrameDetalleFormTablaRetencion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTablaRetencion.jContentPaneDetalleTablaRetencion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTablaRetencion.jTabbedPaneRelacionesTablaRetencion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTablaRetencion.jContentPaneDetalleTablaRetencion.getWidth(),TablaRetencionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTablaRetencion.jTabbedPaneRelacionesTablaRetencion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTablaRetencion.jContentPaneDetalleTablaRetencion.getWidth(),TablaRetencionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTablaRetencion.jTabbedPaneRelacionesTablaRetencion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTablaRetencion.jContentPaneDetalleTablaRetencion.getWidth(),TablaRetencionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTablaRetencion.setVisible(true);
	        this.jInternalFrameDetalleFormTablaRetencion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTablaRetencion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTablaRetencion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTablaRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTablaRetencion,false,this);
				} else {
					this.jInternalFrameOrderByTablaRetencion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTablaRetencion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTablaRetencion);
				this.jInternalFrameOrderByTablaRetencion.setVisible(false);
				this.jInternalFrameOrderByTablaRetencion.setSelected(false);
				
				this.jInternalFrameOrderByTablaRetencion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTablaRetencion"));
				
				this.inicializarActualizarBindingTablaOrderByTablaRetencion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTablaRetencion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTablaRetencion==null) {
				
				this.jInternalFrameImportacionTablaRetencion=new ImportacionJInternalFrame(TablaRetencionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTablaRetencion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTablaRetencion);
				this.jInternalFrameImportacionTablaRetencion.setVisible(false);
				this.jInternalFrameImportacionTablaRetencion.setSelected(false);


				this.jInternalFrameImportacionTablaRetencion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTablaRetencion"));
				this.jInternalFrameImportacionTablaRetencion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTablaRetencion"));
				this.jInternalFrameImportacionTablaRetencion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTablaRetencion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTablaRetencion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTablaRetencion==null) {
				this.jInternalFrameReporteDinamicoTablaRetencion=new ReporteDinamicoJInternalFrame(TablaRetencionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTablaRetencion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTablaRetencion);
				this.jInternalFrameReporteDinamicoTablaRetencion.setVisible(false);
				this.jInternalFrameReporteDinamicoTablaRetencion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTablaRetencion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTablaRetencion"));
				this.jInternalFrameReporteDinamicoTablaRetencion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTablaRetencion"));
				this.jInternalFrameReporteDinamicoTablaRetencion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTablaRetencion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTablaRetencion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTablaRetencion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTablaRetencion);
			
	       	this.jInternalFrameDetalleFormTablaRetencion.setVisible(false);
	        this.jInternalFrameDetalleFormTablaRetencion.setSelected(false);
			
			//this.jInternalFrameDetalleFormTablaRetencion.dispose();
			//this.jInternalFrameDetalleFormTablaRetencion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTablaRetencion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTablaRetencion.setVisible(true);
	        this.jInternalFrameReporteDinamicoTablaRetencion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTablaRetencion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTablaRetencion.setVisible(true);
	        this.jInternalFrameImportacionTablaRetencion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTablaRetencion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTablaRetencion.setVisible(true);
	        this.jInternalFrameOrderByTablaRetencion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTablaRetencion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTablaRetencion.setVisible(false);
	        this.jInternalFrameOrderByTablaRetencion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTablaRetencion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTablaRetencion.setVisible(false);
	        this.jInternalFrameReporteDinamicoTablaRetencion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTablaRetencion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTablaRetencion.setVisible(false);
	        this.jInternalFrameImportacionTablaRetencion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeCuentaContableDebito(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContableDebito";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderTablaRetencion=(TitledBorder)this.jScrollPanelDatosTablaRetencion.getBorder();
						TitledBorder titledBorderCuentaContableDebito=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableDebito.setTitle(titledBorderTablaRetencion.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContableDebito(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
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

				public void abrirFrameTreeCuentaContableCredito(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContableCredito";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderTablaRetencion=(TitledBorder)this.jScrollPanelDatosTablaRetencion.getBorder();
						TitledBorder titledBorderCuentaContableCredito=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableCredito.setTitle(titledBorderTablaRetencion.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContableCredito(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
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
	
	public void jButtonModificarTablaRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTablaRetencion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTablaRetencion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTablaRetencion(true);
			//this.isEsNuevoTablaRetencion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTablaRetencion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTablaRetencion(false) ;
			
			if(tablaretencionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TablaRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTablaRetencion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTablaRetencion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTablaRetencionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTablaRetencion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTablaRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTablaRetencion(true);
			//this.isEsNuevoTablaRetencion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tablaretencion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTablaRetencion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTablaRetencion(false) ;
			
			if(TablaRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTablaRetencion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTablaRetencion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CuentaContableDebito")) {
				if(!this.tablaretencionConstantesFunciones.cargarid_cuenta_contable_debitoTablaRetencion) {
					this.cargarCombosCuentaContableDebitosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingTablaRetencion(false,false);
					this.cargarCombosFrameCuentaContableDebitosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable_debito (id);

				this.recargarComboTablaCuentaContableDebito(this.cuentacontabledebitosForeignKey);

			}
			
			if(sType.equals("CuentaContableCredito")) {
				if(!this.tablaretencionConstantesFunciones.cargarid_cuenta_contable_creditoTablaRetencion) {
					this.cargarCombosCuentaContableCreditosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingTablaRetencion(false,false);
					this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable_credito (id);

				this.recargarComboTablaCuentaContableCredito(this.cuentacontablecreditosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoRetencion(List<TipoRetencion> tiporetencionsForeignKey)throws Exception{
		TableColumn tableColumnTipoRetencion=this.jTableDatosTablaRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaRetencion,TablaRetencionConstantesFunciones.LABEL_IDTIPORETENCION));
		TableCellEditor tableCellEditorTipoRetencion =tableColumnTipoRetencion.getCellEditor();

		TipoRetencionTableCell tiporetencionTableCellFk=(TipoRetencionTableCell)tableCellEditorTipoRetencion;

		if(tiporetencionTableCellFk!=null) {
			tiporetencionTableCellFk.settiporetencionsForeignKey(tiporetencionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTablaRetencion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tiporetencionTableCellFk.setRowActual(intSelectedRow);
			//tiporetencionTableCellFk.settiporetencionsForeignKeyActual(tiporetencionsForeignKey);
		//}


		if(tiporetencionTableCellFk!=null) {
			tiporetencionTableCellFk.RecargarTipoRetencionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContableDebito(List<CuentaContable> cuentacontabledebitosForeignKey)throws Exception{
		TableColumn tableColumnCuentaContableDebito=this.jTableDatosTablaRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaRetencion,TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO));
		TableCellEditor tableCellEditorCuentaContableDebito =tableColumnCuentaContableDebito.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableDebito;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontabledebitosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTablaRetencion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontabledebitosForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContableCredito(List<CuentaContable> cuentacontablecreditosForeignKey)throws Exception{
		TableColumn tableColumnCuentaContableCredito=this.jTableDatosTablaRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaRetencion,TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO));
		TableCellEditor tableCellEditorCuentaContableCredito =tableColumnCuentaContableCredito.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableCredito;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablecreditosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTablaRetencion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablecreditosForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable_debito (Long id) throws Exception {
		this.setActualCuentaContableDebitoForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable_credito (Long id) throws Exception {
		this.setActualCuentaContableCreditoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarTablaRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTablaRetencion(false);
			
			//if(!this.isEsNuevoTablaRetencion) {								
				int intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TablaRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTablaRetencion(this.tablaretencion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
				
			}
			
			if(this.permiteMantenimiento(this.tablaretencion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTablaRetencion=true;
					this.inicializarActualizarBindingTablaTablaRetencion(false);
					this.isEsNuevoTablaRetencion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTablaRetencion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTablaRetencion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTablaRetencion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTablaRetencion(false);
				
				this.habilitarDeshabilitarControlesTablaRetencion(false);
			
												
				
				if(TablaRetencionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTablaRetencion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTablaRetencionActionPerformed(evt,tablaretencionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTablaRetencion(this.tablaretencion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTablaRetencion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tablaretencionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tablaretencion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TablaRetencion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaRetencion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTablaRetencionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				this.tablaretencion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				this.tablaretencion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tablaretencion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TablaRetencionModel) this.jTableDatosTablaRetencion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTablaRetencion=true;
				this.inicializarActualizarBindingTablaTablaRetencion(false);
				this.isEsNuevoTablaRetencion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTablaRetencion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTablaRetencion(false);
				
				this.habilitarDeshabilitarControlesTablaRetencion(false);
				
				
				
				if(TablaRetencionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTablaRetencion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTablaRetencionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTablaRetencion.getRowCount()>=1) {
				jTableDatosTablaRetencion.removeRowSelectionInterval(0, jTableDatosTablaRetencion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTablaRetencion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTablaRetencion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTablaRetencion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTablaRetencion(false) ;
			
			this.isEsNuevoTablaRetencion=false;
			
			if(TablaRetencionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTablaRetencion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTablaRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTablaRetencion(false);
				
				//SI ES MANUAL
				if(TablaRetencionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTablaRetencion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTablaRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTablaRetencion--;			
			//TablaRetencion tablaretencionAux= new TablaRetencion();			
			//tablaretencionAux.setId(this.iIdNuevoTablaRetencion);
			
			if(this.jInternalFrameDetalleFormTablaRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTablaRetencion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
			
			this.tablaretencion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tablaretencionLogic.getTablaRetencions().add(this.tablaretencionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tablaretencions.add(this.tablaretencionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTablaRetencion(false);
			
			this.jTableDatosTablaRetencion.setRowSelectionInterval(this.getIndiceNuevoTablaRetencion(), this.getIndiceNuevoTablaRetencion());
			
			int iLastRow =  this.jTableDatosTablaRetencion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTablaRetencion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTablaRetencion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTablaRetencion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTablaRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTablaRetencion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTablaRetencion(false);
			
			//SI ES MANUAL
			if(TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTablaRetencion();
			}
			
			//this.abrirFrameTreeTablaRetencion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTablaRetencionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tabla RetencionS ?", "MANTENIMIENTO DE Tabla Retencion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTablaRetencion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTablaRetencion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tablaretencionReturnGeneral=tablaretencionLogic.procesarImportacionTablaRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tablaretencionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTablaRetencionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTablaRetencionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTablaRetencion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTablaRetencion.setFileImportacion(this.jInternalFrameImportacionTablaRetencion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTablaRetencion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTablaRetencion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTablaRetencion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTablaRetencion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTablaRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TablaRetencion> tablaretencionsSeleccionados=new ArrayList<TablaRetencion>();		

		tablaretencionsSeleccionados=this.getTablaRetencionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTablaRetencion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTablaRetencion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TablaRetencionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TablaRetencionBaseDesign.jrxml";
			
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
			
			this.generarReporteTablaRetencions("Todos",tablaretencionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTablaRetencion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTablaRetencion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TablaRetencionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaRetencionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaRetencionConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaRetencionConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaRetencionConstantesFunciones.LABEL_MONTOMINIMO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntoMinimo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntoMinimo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntoMinimo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntoMinimo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaRetencionConstantesFunciones.LABEL_IDTIPORETENCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoRetencion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoRetencion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoRetencion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoRetencion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableDebito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableDebito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableDebito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableDebito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaRetencionConstantesFunciones.LABEL_ESDEBITO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Debito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Debito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Debito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Debito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaRetencionConstantesFunciones.LABEL_ESRETENCIONFUENTE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_RetencionFuente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_RetencionFuente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_RetencionFuente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_RetencionFuente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaRetencionConstantesFunciones.LABEL_CONSECUENCIAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nSecuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nSecuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nSecuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nSecuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaRetencionConstantesFunciones.LABEL_CONSUBTOTALFACTURA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nSubTotalFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nSubTotalFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nSubTotalFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nSubTotalFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaRetencionConstantesFunciones.LABEL_CONIVAFACTURA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nIvaFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nIvaFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nIvaFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nIvaFactura_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTablaRetencion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTablaRetencion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTablaRetencion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TablaRetencionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TablaRetencionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TablaRetencionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TablaRetencionConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case TablaRetencionConstantesFunciones.LABEL_MONTOMINIMO:
					sNombreCampoCategoria="monto_minimo";
					break;

				case TablaRetencionConstantesFunciones.LABEL_IDTIPORETENCION:
					sNombreCampoCategoria="id_tipo_retencion";
					break;

				case TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					sNombreCampoCategoria="id_cuenta_contable_debito";
					break;

				case TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					sNombreCampoCategoria="id_cuenta_contable_credito";
					break;

				case TablaRetencionConstantesFunciones.LABEL_ESDEBITO:
					sNombreCampoCategoria="es_debito";
					break;

				case TablaRetencionConstantesFunciones.LABEL_ESRETENCIONFUENTE:
					sNombreCampoCategoria="es_retencion_fuente";
					break;

				case TablaRetencionConstantesFunciones.LABEL_CONSECUENCIAL:
					sNombreCampoCategoria="con_secuencial";
					break;

				case TablaRetencionConstantesFunciones.LABEL_CONSUBTOTALFACTURA:
					sNombreCampoCategoria="con_sub_total_factura";
					break;

				case TablaRetencionConstantesFunciones.LABEL_CONIVAFACTURA:
					sNombreCampoCategoria="con_iva_factura";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTablaRetencion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TablaRetencionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TablaRetencionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TablaRetencionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TablaRetencionConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case TablaRetencionConstantesFunciones.LABEL_MONTOMINIMO:
					sNombreCampoCategoriaValor="monto_minimo";
					break;

				case TablaRetencionConstantesFunciones.LABEL_IDTIPORETENCION:
					sNombreCampoCategoriaValor="id_tipo_retencion";
					break;

				case TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					sNombreCampoCategoriaValor="id_cuenta_contable_debito";
					break;

				case TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					sNombreCampoCategoriaValor="id_cuenta_contable_credito";
					break;

				case TablaRetencionConstantesFunciones.LABEL_ESDEBITO:
					sNombreCampoCategoriaValor="es_debito";
					break;

				case TablaRetencionConstantesFunciones.LABEL_ESRETENCIONFUENTE:
					sNombreCampoCategoriaValor="es_retencion_fuente";
					break;

				case TablaRetencionConstantesFunciones.LABEL_CONSECUENCIAL:
					sNombreCampoCategoriaValor="con_secuencial";
					break;

				case TablaRetencionConstantesFunciones.LABEL_CONSUBTOTALFACTURA:
					sNombreCampoCategoriaValor="con_sub_total_factura";
					break;

				case TablaRetencionConstantesFunciones.LABEL_CONIVAFACTURA:
					sNombreCampoCategoriaValor="con_iva_factura";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTablaRetencion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTablaRetencion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TablaRetencionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TablaRetencionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TablaRetencionConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TablaRetencionConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case TablaRetencionConstantesFunciones.LABEL_MONTOMINIMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto Minimo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto_minimo");
					break;

				case TablaRetencionConstantesFunciones.LABEL_IDTIPORETENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Retencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_retencion");
					break;

				case TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable Debito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_debito");
					break;

				case TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_credito");
					break;

				case TablaRetencionConstantesFunciones.LABEL_ESDEBITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Debito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_debito");
					break;

				case TablaRetencionConstantesFunciones.LABEL_ESRETENCIONFUENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Retencion Fuente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_retencion_fuente");
					break;

				case TablaRetencionConstantesFunciones.LABEL_CONSECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_secuencial");
					break;

				case TablaRetencionConstantesFunciones.LABEL_CONSUBTOTALFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Sub Total Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_sub_total_factura");
					break;

				case TablaRetencionConstantesFunciones.LABEL_CONIVAFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Iva Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_iva_factura");
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
	
	public void jButtonGenerarExcelReporteDinamicoTablaRetencionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TablaRetencion> tablaretencionsSeleccionados=new ArrayList<TablaRetencion>();		
		
		tablaretencionsSeleccionados=this.getTablaRetencionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tablaretencion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TablaRetencions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTablaRetencion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTablaRetencion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TablaRetencionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TablaRetencion tablaretencion:tablaretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaretencion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaRetencionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TablaRetencion tablaretencion:tablaretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaretencion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaRetencionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TablaRetencion tablaretencion:tablaretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaretencion.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaRetencionConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(TablaRetencion tablaretencion:tablaretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaretencion.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaRetencionConstantesFunciones.LABEL_MONTOMINIMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_MONTOMINIMO);
					iRow++;

					for(TablaRetencion tablaretencion:tablaretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaretencion.getmonto_minimo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaRetencionConstantesFunciones.LABEL_IDTIPORETENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_IDTIPORETENCION);
					iRow++;

					for(TablaRetencion tablaretencion:tablaretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaretencion.gettiporetencion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
					iRow++;

					for(TablaRetencion tablaretencion:tablaretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaretencion.getcuentacontabledebito_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
					iRow++;

					for(TablaRetencion tablaretencion:tablaretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaretencion.getcuentacontablecredito_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaRetencionConstantesFunciones.LABEL_ESDEBITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_ESDEBITO);
					iRow++;

					for(TablaRetencion tablaretencion:tablaretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaretencion.getes_debito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaRetencionConstantesFunciones.LABEL_ESRETENCIONFUENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_ESRETENCIONFUENTE);
					iRow++;

					for(TablaRetencion tablaretencion:tablaretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaretencion.getes_retencion_fuente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaRetencionConstantesFunciones.LABEL_CONSECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_CONSECUENCIAL);
					iRow++;

					for(TablaRetencion tablaretencion:tablaretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaretencion.getcon_secuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaRetencionConstantesFunciones.LABEL_CONSUBTOTALFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_CONSUBTOTALFACTURA);
					iRow++;

					for(TablaRetencion tablaretencion:tablaretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaretencion.getcon_sub_total_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaRetencionConstantesFunciones.LABEL_CONIVAFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_CONIVAFACTURA);
					iRow++;

					for(TablaRetencion tablaretencion:tablaretencionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaretencion.getcon_iva_factura());
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
			//	this.getFilaCabeceraExportarExcelTablaRetencion(row);				
			//	iRow++;
			//}				
			
			//for(TablaRetencion tablaretencionAux:tablaretencionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTablaRetencion(tablaretencionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Retencion",JOptionPane.INFORMATION_MESSAGE);
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
				this.tablaretencionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTablaRetencion(false);
			
			//SI ES MANUAL
			if(TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTablaRetencion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTablaRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTablaRetencion(false);
			
			//SI ES MANUAL
			if(TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTablaRetencion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTablaRetencionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTablaRetencion(false);
			
			//SI ES MANUAL
			if(TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTablaRetencion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTablaRetencion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTablaRetencion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTablaRetencion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTablaRetencion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTablaRetencion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTablaRetencion.setMinimumSize(dimensionMinimum);
		this.jTableDatosTablaRetencion.setMaximumSize(dimensionMaximum);
		this.jTableDatosTablaRetencion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTablaRetencion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTablaRetencion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTablaRetencion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTablaRetencion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTablaRetencion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTablaRetencion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTablaRetencion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTablaRetencion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TablaRetencionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTablaRetencion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTablaRetencion();
		
		this.inicializarActualizarBindingBotonesManualTablaRetencion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTablaRetencion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTablaRetencion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTablaRetencion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTablaRetencion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTablaRetencion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTablaRetencion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTablaRetencion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxPostAccionNuevoTablaRetencion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxPostAccionSinCerrarTablaRetencion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxPostAccionSinMensajeTablaRetencion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTablaRetencion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTablaRetencion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTablaRetencion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
				this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxPostAccionNuevoTablaRetencion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxPostAccionSinCerrarTablaRetencion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxPostAccionSinMensajeTablaRetencion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTablaRetencion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTablaRetencion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTablaRetencion.jComboBoxTiposAccionesFormularioTablaRetencion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTablaRetencion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTablaRetencion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTablaRetencion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTablaRetencion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTablaRetencion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTablaRetencion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTablaRetencion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTablaRetencion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTablaRetencion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTablaRetencion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTablaRetencion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTablaRetencion(Boolean esInicializar) throws Exception {
		try	{	
			if(TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTablaRetencion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTablaRetencion() throws Exception {
		try	{
			if(TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTablaRetencion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTablaRetencion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTablaRetencion.jComboBoxTiposAccionesFormularioTablaRetencion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTablaRetencion.jComboBoxTiposAccionesFormularioTablaRetencion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTablaRetencion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTablaRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTablaRetencion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTablaRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTablaRetencion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTablaRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTablaRetencion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTablaRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTablaRetencion.addItem(reporte);
			}
			
			
			if(!this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTablaRetencion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTablaRetencion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTablaRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTablaRetencion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTablaRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTablaRetencion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTablaRetencion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTablaRetencion.jComboBoxTiposAccionesFormularioTablaRetencion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTablaRetencion.jComboBoxTiposAccionesFormularioTablaRetencion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTablaRetencion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTablaRetencion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTablaRetencion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTablaRetencion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTablaRetencion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTablaRetencion!=null) {
				this.jInternalFrameReporteDinamicoTablaRetencion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTablaRetencion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTablaRetencion!=null) {
				this.jInternalFrameReporteDinamicoTablaRetencion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTablaRetencion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTablaRetencion!=null) {
				
				if(this.jInternalFrameReporteDinamicoTablaRetencion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTablaRetencion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTablaRetencion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTablaRetencion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTablaRetencion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTablaRetencion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoTablaRetencion.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTablaRetencion.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=TablaRetencionConstantesFunciones.getTiposSeleccionarTablaRetencion(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTablaRetencion.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoTablaRetencion.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoTablaRetencion.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=TablaRetencionConstantesFunciones.getTiposSeleccionarTablaRetencion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTablaRetencion.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoTablaRetencion.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTablaRetencion.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=TablaRetencionConstantesFunciones.getTiposSeleccionarTablaRetencion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTablaRetencion.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoTablaRetencion.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoTablaRetencion.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoTablaRetencion.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTablaRetencion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTablaRetencion.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTablaRetencion.getText();
		if(this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion.getSelectedItem()!=null){this.id_cuenta_contable_creditoFK_IdCuentaContableCredito=((CuentaContable)this.jComboBoxid_cuenta_contable_creditoFK_IdCuentaContableCreditoTablaRetencion.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion.getSelectedItem()!=null){this.id_cuenta_contable_debitoFK_IdCuentaContableDebito=((CuentaContable)this.jComboBoxid_cuenta_contable_debitoFK_IdCuentaContableDebitoTablaRetencion.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_retencionFK_IdTipoRetencionTablaRetencion.getSelectedItem()!=null){this.id_tipo_retencionFK_IdTipoRetencion=((TipoRetencion)this.jComboBoxid_tipo_retencionFK_IdTipoRetencionTablaRetencion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTablaRetencion(Boolean esInicializar) throws Exception {				
		if(TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTablaRetencion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTablaRetencion() throws Exception {
		this.inicializarActualizarBindingTablaTablaRetencion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTablaRetencion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTablaRetencion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTablaRetencion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTablaRetencion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TablaRetencionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTablaRetencion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTablaRetencion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TablaRetencionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTablaRetencionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaRetencionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TablaRetencionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTablaRetencion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTablaRetencion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TablaRetencionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTablaRetencion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTablaRetencion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tablaretencionLogic.getTablaRetencions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tablaretencions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TablaRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTablaRetencion.setModel(new TablaRetencionModel(this.tablaretencionLogic.getTablaRetencions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTablaRetencion.setModel(new TablaRetencionModel(this.tablaretencions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTablaRetencion!=null && this.jInternalFrameOrderByTablaRetencion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTablaRetencion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTablaRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaRetencion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TablaRetencionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO,tablaretencionConstantesFunciones.resaltarSeleccionarTablaRetencion,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TablaRetencionConstantesFunciones.SCLASSWEBTITULO,tablaretencionConstantesFunciones.resaltarSeleccionarTablaRetencion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTablaRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaRetencion,TablaRetencionConstantesFunciones.LABEL_ID));

		if(this.tablaretencionConstantesFunciones.mostraridTablaRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaRetencionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tablaretencionConstantesFunciones.resaltaridTablaRetencion,this.tablaretencionConstantesFunciones.activaridTablaRetencion,iSizeTabla,this,true,"idTablaRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tablaretencionConstantesFunciones.resaltaridTablaRetencion,this.tablaretencionConstantesFunciones.activaridTablaRetencion,this,true,"idTablaRetencion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaRetencion,TablaRetencionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tablaretencionConstantesFunciones.mostrarid_empresaTablaRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaRetencionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tablaretencionConstantesFunciones.resaltarid_empresaTablaRetencion,this,this.tablaretencionConstantesFunciones.activarid_empresaTablaRetencion,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tablaretencionConstantesFunciones.resaltarid_empresaTablaRetencion,this,this.tablaretencionConstantesFunciones.activarid_empresaTablaRetencion,false,"id_empresaTablaRetencion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TablaRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaRetencion,TablaRetencionConstantesFunciones.LABEL_CODIGO));

		if(this.tablaretencionConstantesFunciones.mostrarcodigoTablaRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaRetencionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tablaretencionConstantesFunciones.resaltarcodigoTablaRetencion,this.tablaretencionConstantesFunciones.activarcodigoTablaRetencion,iSizeTabla,this,true,"codigoTablaRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tablaretencionConstantesFunciones.resaltarcodigoTablaRetencion,this.tablaretencionConstantesFunciones.activarcodigoTablaRetencion,this,true,"codigoTablaRetencion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TablaRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaRetencion,TablaRetencionConstantesFunciones.LABEL_NOMBRE));

		if(this.tablaretencionConstantesFunciones.mostrarnombreTablaRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaRetencionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tablaretencionConstantesFunciones.resaltarnombreTablaRetencion,this.tablaretencionConstantesFunciones.activarnombreTablaRetencion,iSizeTabla,this,true,"nombreTablaRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tablaretencionConstantesFunciones.resaltarnombreTablaRetencion,this.tablaretencionConstantesFunciones.activarnombreTablaRetencion,this,true,"nombreTablaRetencion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TablaRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaRetencion,TablaRetencionConstantesFunciones.LABEL_PORCENTAJE));

		if(this.tablaretencionConstantesFunciones.mostrarporcentajeTablaRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaRetencionConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tablaretencionConstantesFunciones.resaltarporcentajeTablaRetencion,this.tablaretencionConstantesFunciones.activarporcentajeTablaRetencion,iSizeTabla,this,true,"porcentajeTablaRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tablaretencionConstantesFunciones.resaltarporcentajeTablaRetencion,this.tablaretencionConstantesFunciones.activarporcentajeTablaRetencion,this,true,"porcentajeTablaRetencion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TablaRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaRetencion,TablaRetencionConstantesFunciones.LABEL_MONTOMINIMO));

		if(this.tablaretencionConstantesFunciones.mostrarmonto_minimoTablaRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaRetencionConstantesFunciones.LABEL_MONTOMINIMO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tablaretencionConstantesFunciones.resaltarmonto_minimoTablaRetencion,this.tablaretencionConstantesFunciones.activarmonto_minimoTablaRetencion,iSizeTabla,this,true,"monto_minimoTablaRetencion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tablaretencionConstantesFunciones.resaltarmonto_minimoTablaRetencion,this.tablaretencionConstantesFunciones.activarmonto_minimoTablaRetencion,this,true,"monto_minimoTablaRetencion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TablaRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaRetencion,TablaRetencionConstantesFunciones.LABEL_IDTIPORETENCION));

		if(this.tablaretencionConstantesFunciones.mostrarid_tipo_retencionTablaRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaRetencionConstantesFunciones.LABEL_IDTIPORETENCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoRetencionTableCell(this.tiporetencionsForeignKey,this.tablaretencionConstantesFunciones.resaltarid_tipo_retencionTablaRetencion,this,this.tablaretencionConstantesFunciones.activarid_tipo_retencionTablaRetencion,iSizeTabla));
			tableColumn.setCellEditor(new TipoRetencionTableCell(this.tiporetencionsForeignKey,this.tablaretencionConstantesFunciones.resaltarid_tipo_retencionTablaRetencion,this,this.tablaretencionConstantesFunciones.activarid_tipo_retencionTablaRetencion,true,"id_tipo_retencionTablaRetencion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TablaRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaRetencion,TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO));

		if(this.tablaretencionConstantesFunciones.mostrarid_cuenta_contable_debitoTablaRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontabledebitosForeignKey,this.tablaretencionConstantesFunciones.resaltarid_cuenta_contable_debitoTablaRetencion,this,this.tablaretencionConstantesFunciones.activarid_cuenta_contable_debitoTablaRetencion,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontabledebitosForeignKey,this.tablaretencionConstantesFunciones.resaltarid_cuenta_contable_debitoTablaRetencion,this,this.tablaretencionConstantesFunciones.activarid_cuenta_contable_debitoTablaRetencion,true,"id_cuenta_contable_debitoTablaRetencion","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new TablaRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaRetencion,TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO));

		if(this.tablaretencionConstantesFunciones.mostrarid_cuenta_contable_creditoTablaRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablecreditosForeignKey,this.tablaretencionConstantesFunciones.resaltarid_cuenta_contable_creditoTablaRetencion,this,this.tablaretencionConstantesFunciones.activarid_cuenta_contable_creditoTablaRetencion,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablecreditosForeignKey,this.tablaretencionConstantesFunciones.resaltarid_cuenta_contable_creditoTablaRetencion,this,this.tablaretencionConstantesFunciones.activarid_cuenta_contable_creditoTablaRetencion,true,"id_cuenta_contable_creditoTablaRetencion","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new TablaRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaRetencion,TablaRetencionConstantesFunciones.LABEL_ESDEBITO));

		if(this.tablaretencionConstantesFunciones.mostrares_debitoTablaRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaRetencionConstantesFunciones.LABEL_ESDEBITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tablaretencionConstantesFunciones.resaltares_debitoTablaRetencion,this.tablaretencionConstantesFunciones.activares_debitoTablaRetencion,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tablaretencionConstantesFunciones.resaltares_debitoTablaRetencion,this.tablaretencionConstantesFunciones.activares_debitoTablaRetencion,this,true,"es_debitoTablaRetencion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TablaRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaRetencion,TablaRetencionConstantesFunciones.LABEL_ESRETENCIONFUENTE));

		if(this.tablaretencionConstantesFunciones.mostrares_retencion_fuenteTablaRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaRetencionConstantesFunciones.LABEL_ESRETENCIONFUENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tablaretencionConstantesFunciones.resaltares_retencion_fuenteTablaRetencion,this.tablaretencionConstantesFunciones.activares_retencion_fuenteTablaRetencion,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tablaretencionConstantesFunciones.resaltares_retencion_fuenteTablaRetencion,this.tablaretencionConstantesFunciones.activares_retencion_fuenteTablaRetencion,this,true,"es_retencion_fuenteTablaRetencion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TablaRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaRetencion,TablaRetencionConstantesFunciones.LABEL_CONSECUENCIAL));

		if(this.tablaretencionConstantesFunciones.mostrarcon_secuencialTablaRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaRetencionConstantesFunciones.LABEL_CONSECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tablaretencionConstantesFunciones.resaltarcon_secuencialTablaRetencion,this.tablaretencionConstantesFunciones.activarcon_secuencialTablaRetencion,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tablaretencionConstantesFunciones.resaltarcon_secuencialTablaRetencion,this.tablaretencionConstantesFunciones.activarcon_secuencialTablaRetencion,this,true,"con_secuencialTablaRetencion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TablaRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaRetencion,TablaRetencionConstantesFunciones.LABEL_CONSUBTOTALFACTURA));

		if(this.tablaretencionConstantesFunciones.mostrarcon_sub_total_facturaTablaRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaRetencionConstantesFunciones.LABEL_CONSUBTOTALFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tablaretencionConstantesFunciones.resaltarcon_sub_total_facturaTablaRetencion,this.tablaretencionConstantesFunciones.activarcon_sub_total_facturaTablaRetencion,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tablaretencionConstantesFunciones.resaltarcon_sub_total_facturaTablaRetencion,this.tablaretencionConstantesFunciones.activarcon_sub_total_facturaTablaRetencion,this,true,"con_sub_total_facturaTablaRetencion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TablaRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaRetencion,TablaRetencionConstantesFunciones.LABEL_CONIVAFACTURA));

		if(this.tablaretencionConstantesFunciones.mostrarcon_iva_facturaTablaRetencion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaRetencionConstantesFunciones.LABEL_CONIVAFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tablaretencionConstantesFunciones.resaltarcon_iva_facturaTablaRetencion,this.tablaretencionConstantesFunciones.activarcon_iva_facturaTablaRetencion,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tablaretencionConstantesFunciones.resaltarcon_iva_facturaTablaRetencion,this.tablaretencionConstantesFunciones.activarcon_iva_facturaTablaRetencion,this,true,"con_iva_facturaTablaRetencion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TablaRetencionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tablaretencionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tablaretencionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tablaretencionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTablaRetencion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tablaretencionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tablaretencionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTablaRetencion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTablaRetencion && this.isPermisoGuardarCambiosTablaRetencion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tablaretencionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tablaretencionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTablaRetencion.addColumn(tableColumn);
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
			
			this.jTableDatosTablaRetencion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTablaRetencion && this.isPermisoGuardarCambiosTablaRetencion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTablaRetencion && this.isPermisoGuardarCambiosTablaRetencion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTablaRetencion.moveColumn(this.jTableDatosTablaRetencion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTablaRetencion.moveColumn(this.jTableDatosTablaRetencion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTablaRetencion.moveColumn(this.jTableDatosTablaRetencion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTablaRetencion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTablaRetencion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTablaRetencion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TablaRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTablaRetencion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTablaRetencion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TablaRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TablaRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTablaRetencion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTablaRetencion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTablaRetencion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tablaretencionLogic.getTablaRetencions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tablaretencions.size()-1;
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
		//this.jTableDatosTablaRetencion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTablaRetencion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTablaRetencion();
			
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
				
				//this.isEsNuevoTablaRetencion=false;
					
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
			
				if(this.tablaretencionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTablaRetencion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTablaRetencion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTablaRetencion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tablaretencion.getsType().equals("DUPLICADO")
				   || this.tablaretencion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTablaRetencion=true;
				
				} else {
					this.isEsNuevoTablaRetencion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
					if(this.tablaretencion.getId()>=0 && !this.tablaretencion.getIsNew()) {						
						this.isEsNuevoTablaRetencion=false;
						
					} else {
						this.isEsNuevoTablaRetencion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTablaRetencion(esRelaciones);						
				
				this.seleccionarTablaRetencion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tablaretencion.getId()<0) {
					this.isEsNuevoTablaRetencion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTablaRetencion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTablaRetencion(evt,rowIndex);
				}	
				
				if(this.tablaretencionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TablaRetencion: " + this.dDif); 
					}
				}								
				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTablaRetencion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tablaretencion)) {
					if(this.tablaretencion.getId()>0) {
						this.tablaretencion.setIsDeleted(true);
						
						this.tablaretencionsEliminados.add(this.tablaretencion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tablaretencionLogic.getTablaRetencions().remove(this.tablaretencion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tablaretencions.remove(this.tablaretencion);				
					}
					
					
					((TablaRetencionModel) this.jTableDatosTablaRetencion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTablaRetencion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTablaRetencion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTablaRetencion) {
			
			if(this.jInternalFrameDetalleFormTablaRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTablaRetencion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTablaRetencion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TablaRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTablaRetencion(this.tablaretencion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tablaretencionConstantesFunciones.cargarid_empresaTablaRetencion || this.tablaretencionConstantesFunciones.event_dependid_empresaTablaRetencion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tablaretencion.getid_empresa());
									//this.inicializarActualizarBindingTablaRetencion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tablaretencion.getEmpresa()!=null) {
							this.empresasForeignKey.add(tablaretencion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tablaretencion.getid_empresa(),false,"Formulario");

					//TipoRetencion
					if(!this.tablaretencionConstantesFunciones.cargarid_tipo_retencionTablaRetencion || this.tablaretencionConstantesFunciones.event_dependid_tipo_retencionTablaRetencion) {
						//this.cargarCombosTipoRetencionsForeignKeyLista(" where id="+this.tablaretencion.getid_tipo_retencion());
									//this.inicializarActualizarBindingTablaRetencion(false,false);
						this.tiporetencionsForeignKey=new ArrayList<TipoRetencion>();

						if(tablaretencion.getTipoRetencion()!=null) {
							this.tiporetencionsForeignKey.add(tablaretencion.getTipoRetencion());
						}

						this.addItemDefectoCombosForeignKeyTipoRetencion();
						this.cargarCombosFrameTipoRetencionsForeignKey("Todos");
					}
					this.setActualTipoRetencionForeignKey(this.tablaretencion.getid_tipo_retencion(),false,"Formulario");

					//CuentaContableDebito
					if(!this.tablaretencionConstantesFunciones.cargarid_cuenta_contable_debitoTablaRetencion || this.tablaretencionConstantesFunciones.event_dependid_cuenta_contable_debitoTablaRetencion) {
						//this.cargarCombosCuentaContableDebitosForeignKeyLista(" where id="+this.tablaretencion.getid_cuenta_contable_debito());
									//this.inicializarActualizarBindingTablaRetencion(false,false);
						this.cuentacontabledebitosForeignKey=new ArrayList<CuentaContable>();

						if(tablaretencion.getCuentaContableDebito()!=null) {
							this.cuentacontabledebitosForeignKey.add(tablaretencion.getCuentaContableDebito());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableDebito();
						this.cargarCombosFrameCuentaContableDebitosForeignKey("Todos");
					}
					this.setActualCuentaContableDebitoForeignKey(this.tablaretencion.getid_cuenta_contable_debito(),false,"Formulario");

					//CuentaContableCredito
					if(!this.tablaretencionConstantesFunciones.cargarid_cuenta_contable_creditoTablaRetencion || this.tablaretencionConstantesFunciones.event_dependid_cuenta_contable_creditoTablaRetencion) {
						//this.cargarCombosCuentaContableCreditosForeignKeyLista(" where id="+this.tablaretencion.getid_cuenta_contable_credito());
									//this.inicializarActualizarBindingTablaRetencion(false,false);
						this.cuentacontablecreditosForeignKey=new ArrayList<CuentaContable>();

						if(tablaretencion.getCuentaContableCredito()!=null) {
							this.cuentacontablecreditosForeignKey.add(tablaretencion.getCuentaContableCredito());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableCredito();
						this.cargarCombosFrameCuentaContableCreditosForeignKey("Todos");
					}
					this.setActualCuentaContableCreditoForeignKey(this.tablaretencion.getid_cuenta_contable_credito(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTablaRetencion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTablaRetencion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTablaRetencion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTablaRetencion(TablaRetencion tablaretencion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTablaRetencion(tablaretencion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTablaRetencion(TablaRetencion tablaretencion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTablaRetencion(tablaretencion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTablaRetencion(tablaretencion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTablaRetencion(tablaretencion);
	}
	
	public void setVariablesObjetoActualToFormularioTablaRetencion(TablaRetencion tablaretencion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTablaRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTablaRetencion.jLabelidTablaRetencion.setText(tablaretencion.getId().toString());
			this.jInternalFrameDetalleFormTablaRetencion.jTextFieldcodigoTablaRetencion.setText(tablaretencion.getcodigo());
			this.jInternalFrameDetalleFormTablaRetencion.jTextAreanombreTablaRetencion.setText(tablaretencion.getnombre());
			this.jInternalFrameDetalleFormTablaRetencion.jTextFieldporcentajeTablaRetencion.setText(tablaretencion.getporcentaje().toString());
			this.jInternalFrameDetalleFormTablaRetencion.jTextFieldmonto_minimoTablaRetencion.setText(tablaretencion.getmonto_minimo().toString());
			this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxes_debitoTablaRetencion.setSelected(tablaretencion.getes_debito());
			this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxes_retencion_fuenteTablaRetencion.setSelected(tablaretencion.getes_retencion_fuente());
			this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_secuencialTablaRetencion.setSelected(tablaretencion.getcon_secuencial());
			this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_sub_total_facturaTablaRetencion.setSelected(tablaretencion.getcon_sub_total_factura());
			this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_iva_facturaTablaRetencion.setSelected(tablaretencion.getcon_iva_factura());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TablaRetencion tablaretencionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tablaretencionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TablaRetencion tablaretencionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tablaretencionLocal=this.tablaretencion;
			} else {
				tablaretencionLocal=this.tablaretencionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tablaretencionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTablaRetencion(tablaretencionLocal,true);
					
					if(tablaretencionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tablaretencionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tablaretencionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTablaRetencion(TablaRetencion tablaretencion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTablaRetencion(tablaretencion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(tablaretencion);
	}
	
	public void setVariablesFormularioToObjetoActualTablaRetencion(TablaRetencion tablaretencion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTablaRetencion(tablaretencion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTablaRetencion(TablaRetencion tablaretencion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTablaRetencion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTablaRetencion.jLabelidTablaRetencion.getText()==null || this.jInternalFrameDetalleFormTablaRetencion.jLabelidTablaRetencion.getText()=="" || this.jInternalFrameDetalleFormTablaRetencion.jLabelidTablaRetencion.getText()=="Id") {
				this.jInternalFrameDetalleFormTablaRetencion.jLabelidTablaRetencion.setText("0");
			}

			if(conColumnasBase) {tablaretencion.setId(Long.parseLong(this.jInternalFrameDetalleFormTablaRetencion.jLabelidTablaRetencion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaRetencionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaRetencion.jLabelIdTablaRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tablaretencion.setcodigo(this.jInternalFrameDetalleFormTablaRetencion.jTextFieldcodigoTablaRetencion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaRetencionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaRetencion.jLabelcodigoTablaRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tablaretencion.setnombre(this.jInternalFrameDetalleFormTablaRetencion.jTextAreanombreTablaRetencion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaRetencionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaRetencion.jLabelnombreTablaRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tablaretencion.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormTablaRetencion.jTextFieldporcentajeTablaRetencion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaRetencionConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaRetencion.jLabelporcentajeTablaRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tablaretencion.setmonto_minimo(Double.parseDouble(this.jInternalFrameDetalleFormTablaRetencion.jTextFieldmonto_minimoTablaRetencion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaRetencionConstantesFunciones.LABEL_MONTOMINIMO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaRetencion.jLabelmonto_minimoTablaRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tablaretencion.setes_debito(this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxes_debitoTablaRetencion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaRetencionConstantesFunciones.LABEL_ESDEBITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaRetencion.jLabeles_debitoTablaRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tablaretencion.setes_retencion_fuente(this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxes_retencion_fuenteTablaRetencion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaRetencionConstantesFunciones.LABEL_ESRETENCIONFUENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaRetencion.jLabeles_retencion_fuenteTablaRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tablaretencion.setcon_secuencial(this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_secuencialTablaRetencion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaRetencionConstantesFunciones.LABEL_CONSECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaRetencion.jLabelcon_secuencialTablaRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tablaretencion.setcon_sub_total_factura(this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_sub_total_facturaTablaRetencion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaRetencionConstantesFunciones.LABEL_CONSUBTOTALFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaRetencion.jLabelcon_sub_total_facturaTablaRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tablaretencion.setcon_iva_factura(this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_iva_facturaTablaRetencion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaRetencionConstantesFunciones.LABEL_CONIVAFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaRetencion.jLabelcon_iva_facturaTablaRetencion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTablaRetencion(TablaRetencion tablaretencionBean,TablaRetencion tablaretencion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tablaretencionBean.getid_tipo_retencion()!=null && !tablaretencionBean.getid_tipo_retencion().equals(-1L))) {tablaretencion.setid_tipo_retencion(tablaretencionBean.getid_tipo_retencion());}
			if(conDefault || (!conDefault && tablaretencionBean.getid_cuenta_contable_debito()!=null && !tablaretencionBean.getid_cuenta_contable_debito().equals(-1L))) {tablaretencion.setid_cuenta_contable_debito(tablaretencionBean.getid_cuenta_contable_debito());}
			if(conDefault || (!conDefault && tablaretencionBean.getid_cuenta_contable_credito()!=null && !tablaretencionBean.getid_cuenta_contable_credito().equals(null))) {tablaretencion.setid_cuenta_contable_credito(tablaretencionBean.getid_cuenta_contable_credito());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTablaRetencion(TablaRetencion tablaretencionOrigen,TablaRetencion tablaretencion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tablaretencionOrigen.getId()!=null && !tablaretencionOrigen.getId().equals(0L))) {tablaretencion.setId(tablaretencionOrigen.getId());}}
			if(conDefault || (!conDefault && tablaretencionOrigen.getcodigo()!=null && !tablaretencionOrigen.getcodigo().equals(""))) {tablaretencion.setcodigo(tablaretencionOrigen.getcodigo());}
			if(conDefault || (!conDefault && tablaretencionOrigen.getnombre()!=null && !tablaretencionOrigen.getnombre().equals(""))) {tablaretencion.setnombre(tablaretencionOrigen.getnombre());}
			if(conDefault || (!conDefault && tablaretencionOrigen.getporcentaje()!=null && !tablaretencionOrigen.getporcentaje().equals(0.0))) {tablaretencion.setporcentaje(tablaretencionOrigen.getporcentaje());}
			if(conDefault || (!conDefault && tablaretencionOrigen.getmonto_minimo()!=null && !tablaretencionOrigen.getmonto_minimo().equals(0.0))) {tablaretencion.setmonto_minimo(tablaretencionOrigen.getmonto_minimo());}
			if(conDefault || (!conDefault && tablaretencionOrigen.getid_tipo_retencion()!=null && !tablaretencionOrigen.getid_tipo_retencion().equals(-1L))) {tablaretencion.setid_tipo_retencion(tablaretencionOrigen.getid_tipo_retencion());}
			if(conDefault || (!conDefault && tablaretencionOrigen.getid_cuenta_contable_debito()!=null && !tablaretencionOrigen.getid_cuenta_contable_debito().equals(-1L))) {tablaretencion.setid_cuenta_contable_debito(tablaretencionOrigen.getid_cuenta_contable_debito());}
			if(conDefault || (!conDefault && tablaretencionOrigen.getid_cuenta_contable_credito()!=null && !tablaretencionOrigen.getid_cuenta_contable_credito().equals(null))) {tablaretencion.setid_cuenta_contable_credito(tablaretencionOrigen.getid_cuenta_contable_credito());}
			if(conDefault || (!conDefault && tablaretencionOrigen.getes_debito()!=null && !tablaretencionOrigen.getes_debito().equals(false))) {tablaretencion.setes_debito(tablaretencionOrigen.getes_debito());}
			if(conDefault || (!conDefault && tablaretencionOrigen.getes_retencion_fuente()!=null && !tablaretencionOrigen.getes_retencion_fuente().equals(false))) {tablaretencion.setes_retencion_fuente(tablaretencionOrigen.getes_retencion_fuente());}
			if(conDefault || (!conDefault && tablaretencionOrigen.getcon_secuencial()!=null && !tablaretencionOrigen.getcon_secuencial().equals(false))) {tablaretencion.setcon_secuencial(tablaretencionOrigen.getcon_secuencial());}
			if(conDefault || (!conDefault && tablaretencionOrigen.getcon_sub_total_factura()!=null && !tablaretencionOrigen.getcon_sub_total_factura().equals(false))) {tablaretencion.setcon_sub_total_factura(tablaretencionOrigen.getcon_sub_total_factura());}
			if(conDefault || (!conDefault && tablaretencionOrigen.getcon_iva_factura()!=null && !tablaretencionOrigen.getcon_iva_factura().equals(false))) {tablaretencion.setcon_iva_factura(tablaretencionOrigen.getcon_iva_factura());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTablaRetencion(TablaRetencion tablaretencion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTablaRetencion.jLabelidTablaRetencion.setText(tablaretencion.getId().toString());
			this.jInternalFrameDetalleFormTablaRetencion.jTextFieldcodigoTablaRetencion.setText(tablaretencion.getcodigo());
			this.jInternalFrameDetalleFormTablaRetencion.jTextAreanombreTablaRetencion.setText(tablaretencion.getnombre());
			this.jInternalFrameDetalleFormTablaRetencion.jTextFieldporcentajeTablaRetencion.setText(tablaretencion.getporcentaje().toString());
			this.jInternalFrameDetalleFormTablaRetencion.jTextFieldmonto_minimoTablaRetencion.setText(tablaretencion.getmonto_minimo().toString());
			this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxes_debitoTablaRetencion.setSelected(tablaretencion.getes_debito());
			this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxes_retencion_fuenteTablaRetencion.setSelected(tablaretencion.getes_retencion_fuente());
			this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_secuencialTablaRetencion.setSelected(tablaretencion.getcon_secuencial());
			this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_sub_total_facturaTablaRetencion.setSelected(tablaretencion.getcon_sub_total_factura());
			this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_iva_facturaTablaRetencion.setSelected(tablaretencion.getcon_iva_factura());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTablaRetencion(TablaRetencionBean tablaretencionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTablaRetencion.jLabelidTablaRetencion.setText(tablaretencionBean.getId().toString());
			this.jInternalFrameDetalleFormTablaRetencion.jTextFieldcodigoTablaRetencion.setText(tablaretencionBean.getcodigo());
			this.jInternalFrameDetalleFormTablaRetencion.jTextAreanombreTablaRetencion.setText(tablaretencionBean.getnombre());
			this.jInternalFrameDetalleFormTablaRetencion.jTextFieldporcentajeTablaRetencion.setText(tablaretencionBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormTablaRetencion.jTextFieldmonto_minimoTablaRetencion.setText(tablaretencionBean.getmonto_minimo().toString());
			this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxes_debitoTablaRetencion.setSelected(tablaretencionBean.getes_debito());
			this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxes_retencion_fuenteTablaRetencion.setSelected(tablaretencionBean.getes_retencion_fuente());
			this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_secuencialTablaRetencion.setSelected(tablaretencionBean.getcon_secuencial());
			this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_sub_total_facturaTablaRetencion.setSelected(tablaretencionBean.getcon_sub_total_factura());
			this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_iva_facturaTablaRetencion.setSelected(tablaretencionBean.getcon_iva_factura());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTablaRetencion(TablaRetencionParameterReturnGeneral tablaretencionReturnGeneral,TablaRetencionBean tablaretencionBean,Boolean conDefault) throws Exception { 
		try {
			TablaRetencion tablaretencionLocal=new TablaRetencion();
			
			tablaretencionLocal=tablaretencionReturnGeneral.getTablaRetencion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tablaretencionLocal.getId()!=null && !tablaretencionLocal.getId().equals(0L))) {tablaretencionBean.setId(tablaretencionLocal.getId());}}
			if(conDefault || (!conDefault && tablaretencionLocal.getcodigo()!=null && !tablaretencionLocal.getcodigo().equals(""))) {tablaretencionBean.setcodigo(tablaretencionLocal.getcodigo());}
			if(conDefault || (!conDefault && tablaretencionLocal.getnombre()!=null && !tablaretencionLocal.getnombre().equals(""))) {tablaretencionBean.setnombre(tablaretencionLocal.getnombre());}
			if(conDefault || (!conDefault && tablaretencionLocal.getporcentaje()!=null && !tablaretencionLocal.getporcentaje().equals(0.0))) {tablaretencionBean.setporcentaje(tablaretencionLocal.getporcentaje());}
			if(conDefault || (!conDefault && tablaretencionLocal.getmonto_minimo()!=null && !tablaretencionLocal.getmonto_minimo().equals(0.0))) {tablaretencionBean.setmonto_minimo(tablaretencionLocal.getmonto_minimo());}
			if(conDefault || (!conDefault && tablaretencionLocal.getid_tipo_retencion()!=null && !tablaretencionLocal.getid_tipo_retencion().equals(-1L))) {tablaretencionBean.setid_tipo_retencion(tablaretencionLocal.getid_tipo_retencion());}
			if(conDefault || (!conDefault && tablaretencionLocal.getid_cuenta_contable_debito()!=null && !tablaretencionLocal.getid_cuenta_contable_debito().equals(-1L))) {tablaretencionBean.setid_cuenta_contable_debito(tablaretencionLocal.getid_cuenta_contable_debito());}
			if(conDefault || (!conDefault && tablaretencionLocal.getid_cuenta_contable_credito()!=null && !tablaretencionLocal.getid_cuenta_contable_credito().equals(null))) {tablaretencionBean.setid_cuenta_contable_credito(tablaretencionLocal.getid_cuenta_contable_credito());}
			if(conDefault || (!conDefault && tablaretencionLocal.getes_debito()!=null && !tablaretencionLocal.getes_debito().equals(false))) {tablaretencionBean.setes_debito(tablaretencionLocal.getes_debito());}
			if(conDefault || (!conDefault && tablaretencionLocal.getes_retencion_fuente()!=null && !tablaretencionLocal.getes_retencion_fuente().equals(false))) {tablaretencionBean.setes_retencion_fuente(tablaretencionLocal.getes_retencion_fuente());}
			if(conDefault || (!conDefault && tablaretencionLocal.getcon_secuencial()!=null && !tablaretencionLocal.getcon_secuencial().equals(false))) {tablaretencionBean.setcon_secuencial(tablaretencionLocal.getcon_secuencial());}
			if(conDefault || (!conDefault && tablaretencionLocal.getcon_sub_total_factura()!=null && !tablaretencionLocal.getcon_sub_total_factura().equals(false))) {tablaretencionBean.setcon_sub_total_factura(tablaretencionLocal.getcon_sub_total_factura());}
			if(conDefault || (!conDefault && tablaretencionLocal.getcon_iva_factura()!=null && !tablaretencionLocal.getcon_iva_factura().equals(false))) {tablaretencionBean.setcon_iva_factura(tablaretencionLocal.getcon_iva_factura());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTablaRetencionGenerico(Long idTablaRetencionSeleccionado,JComboBox jComboBoxTablaRetencion,List<TablaRetencion> tablaretencionsLocal)throws Exception {
		try {
			TablaRetencion  tablaretencionTemp=null;

			for(TablaRetencion tablaretencionAux:tablaretencionsLocal) {
				if(tablaretencionAux.getId()!=null && tablaretencionAux.getId().equals(idTablaRetencionSeleccionado)) {
					tablaretencionTemp=tablaretencionAux;
					break;
				}
			}

			jComboBoxTablaRetencion.setSelectedItem(tablaretencionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTablaRetencionGenerico(JComboBox jComboBoxTablaRetencion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTablaRetencion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTablaRetencion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTablaRetencion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTablaRetencion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTablaRetencion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTablaRetencion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tablaretencion=(TablaRetencion) tablaretencionLogic.getTablaRetencions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tablaretencion =(TablaRetencion) tablaretencions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tablaretencion.getIsNew() && !tablaretencion.getIsChanged() && !tablaretencion.getIsDeleted()) {
				sDescripcion=tablaretencion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tablaretencion.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoRetencion")) {
			//sDescripcion=this.getActualTipoRetencionForeignKeyDescripcion((Long)value);
			if(!tablaretencion.getIsNew() && !tablaretencion.getIsChanged() && !tablaretencion.getIsDeleted()) {
				sDescripcion=tablaretencion.gettiporetencion_descripcion();
			} else {
				//sDescripcion=this.getActualTipoRetencionForeignKeyDescripcion((Long)value);
				sDescripcion=tablaretencion.gettiporetencion_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableDebito")) {
			//sDescripcion=this.getActualCuentaContableDebitoForeignKeyDescripcion((Long)value);
			if(!tablaretencion.getIsNew() && !tablaretencion.getIsChanged() && !tablaretencion.getIsDeleted()) {
				sDescripcion=tablaretencion.getcuentacontabledebito_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableDebitoForeignKeyDescripcion((Long)value);
				sDescripcion=tablaretencion.getcuentacontabledebito_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableCredito")) {
			//sDescripcion=this.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value);
			if(!tablaretencion.getIsNew() && !tablaretencion.getIsChanged() && !tablaretencion.getIsDeleted()) {
				sDescripcion=tablaretencion.getcuentacontablecredito_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableCreditoForeignKeyDescripcion((Long)value);
				sDescripcion=tablaretencion.getcuentacontablecredito_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TablaRetencion tablaretencionRow=new TablaRetencion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tablaretencionRow=(TablaRetencion) tablaretencionLogic.getTablaRetencions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tablaretencionRow=(TablaRetencion) tablaretencions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTablaRetencion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTablaRetencion.setVisible((this.isVisibilidadCeldaNuevoTablaRetencion && this.isPermisoNuevoTablaRetencion));			
			this.jButtonDuplicarTablaRetencion.setVisible((this.isVisibilidadCeldaDuplicarTablaRetencion && this.isPermisoDuplicarTablaRetencion));			
			this.jButtonCopiarTablaRetencion.setVisible((this.isVisibilidadCeldaCopiarTablaRetencion && this.isPermisoCopiarTablaRetencion));
			this.jButtonVerFormTablaRetencion.setVisible((this.isVisibilidadCeldaVerFormTablaRetencion && this.isPermisoVerFormTablaRetencion));
			
			this.jButtonAbrirOrderByTablaRetencion.setVisible((this.isVisibilidadCeldaOrdenTablaRetencion && this.isPermisoOrdenTablaRetencion));			
			
			this.jButtonNuevoRelacionesTablaRetencion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTablaRetencion && this.isPermisoNuevoTablaRetencion));			
			this.jButtonNuevoGuardarCambiosTablaRetencion.setVisible((this.isVisibilidadCeldaNuevoTablaRetencion && this.isPermisoNuevoTablaRetencion && this.isPermisoGuardarCambiosTablaRetencion));
			
			if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
			this.jInternalFrameDetalleFormTablaRetencion.jButtonModificarTablaRetencion.setVisible((this.isVisibilidadCeldaModificarTablaRetencion && this.isPermisoActualizarTablaRetencion));	
			this.jInternalFrameDetalleFormTablaRetencion.jButtonActualizarTablaRetencion.setVisible((this.isVisibilidadCeldaActualizarTablaRetencion && this.isPermisoActualizarTablaRetencion));	
			this.jInternalFrameDetalleFormTablaRetencion.jButtonEliminarTablaRetencion.setVisible((this.isVisibilidadCeldaEliminarTablaRetencion && this.isPermisoEliminarTablaRetencion));
			this.jInternalFrameDetalleFormTablaRetencion.jButtonCancelarTablaRetencion.setVisible(this.isVisibilidadCeldaCancelarTablaRetencion);							
			this.jInternalFrameDetalleFormTablaRetencion.jButtonGuardarCambiosTablaRetencion.setVisible((this.isVisibilidadCeldaGuardarTablaRetencion && this.isPermisoGuardarCambiosTablaRetencion));			
			
			}
						
			this.jButtonGuardarCambiosTablaTablaRetencion.setVisible((this.isVisibilidadCeldaGuardarCambiosTablaRetencion && this.isPermisoGuardarCambiosTablaRetencion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTablaRetencion.setVisible((this.isVisibilidadCeldaNuevoTablaRetencion && this.isPermisoNuevoTablaRetencion));						
			this.jButtonDuplicarToolBarTablaRetencion.setVisible((this.isVisibilidadCeldaDuplicarTablaRetencion && this.isPermisoDuplicarTablaRetencion));						
			this.jButtonCopiarToolBarTablaRetencion.setVisible((this.isVisibilidadCeldaCopiarTablaRetencion && this.isPermisoCopiarTablaRetencion));			
			this.jButtonVerFormToolBarTablaRetencion.setVisible((this.isVisibilidadCeldaVerFormTablaRetencion && this.isPermisoVerFormTablaRetencion));			
			this.jButtonAbrirOrderByToolBarTablaRetencion.setVisible((this.isVisibilidadCeldaOrdenTablaRetencion && this.isPermisoOrdenTablaRetencion));
			this.jButtonNuevoRelacionesToolBarTablaRetencion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTablaRetencion && this.isPermisoNuevoTablaRetencion));			
			this.jButtonNuevoGuardarCambiosToolBarTablaRetencion.setVisible((this.isVisibilidadCeldaNuevoTablaRetencion && this.isPermisoNuevoTablaRetencion && this.isPermisoGuardarCambiosTablaRetencion));			
			
			if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
			this.jInternalFrameDetalleFormTablaRetencion.jButtonModificarToolBarTablaRetencion.setVisible((this.isVisibilidadCeldaModificarTablaRetencion && this.isPermisoActualizarTablaRetencion));	
			this.jInternalFrameDetalleFormTablaRetencion.jButtonActualizarToolBarTablaRetencion.setVisible((this.isVisibilidadCeldaActualizarTablaRetencion  && this.isPermisoActualizarTablaRetencion));	
			this.jInternalFrameDetalleFormTablaRetencion.jButtonEliminarToolBarTablaRetencion.setVisible((this.isVisibilidadCeldaEliminarTablaRetencion && this.isPermisoEliminarTablaRetencion));
			this.jInternalFrameDetalleFormTablaRetencion.jButtonCancelarToolBarTablaRetencion.setVisible(this.isVisibilidadCeldaCancelarTablaRetencion);				
			this.jInternalFrameDetalleFormTablaRetencion.jButtonGuardarCambiosToolBarTablaRetencion.setVisible((this.isVisibilidadCeldaGuardarTablaRetencion && this.isPermisoGuardarCambiosTablaRetencion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTablaRetencion.setVisible((this.isVisibilidadCeldaGuardarCambiosTablaRetencion && this.isPermisoGuardarCambiosTablaRetencion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTablaRetencion.setVisible((this.isVisibilidadCeldaNuevoTablaRetencion && this.isPermisoNuevoTablaRetencion));			
			this.jMenuItemDuplicarTablaRetencion.setVisible((this.isVisibilidadCeldaDuplicarTablaRetencion && this.isPermisoDuplicarTablaRetencion));			
			this.jMenuItemCopiarTablaRetencion.setVisible((this.isVisibilidadCeldaCopiarTablaRetencion && this.isPermisoCopiarTablaRetencion));			
			this.jMenuItemVerFormTablaRetencion.setVisible((this.isVisibilidadCeldaVerFormTablaRetencion && this.isPermisoVerFormTablaRetencion));			
			this.jMenuItemAbrirOrderByTablaRetencion.setVisible((this.isVisibilidadCeldaOrdenTablaRetencion && this.isPermisoOrdenTablaRetencion));			
			//this.jMenuItemMostrarOcultarTablaRetencion.setVisible((this.isVisibilidadCeldaOrdenTablaRetencion && this.isPermisoOrdenTablaRetencion));
			this.jMenuItemDetalleAbrirOrderByTablaRetencion.setVisible((this.isVisibilidadCeldaOrdenTablaRetencion && this.isPermisoOrdenTablaRetencion));			
			//this.jMenuItemDetalleMostrarOcultarTablaRetencion.setVisible((this.isVisibilidadCeldaOrdenTablaRetencion && this.isPermisoOrdenTablaRetencion));			
			this.jMenuItemNuevoRelacionesTablaRetencion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTablaRetencion && this.isPermisoNuevoTablaRetencion));			
			this.jMenuItemNuevoGuardarCambiosTablaRetencion.setVisible((this.isVisibilidadCeldaNuevoTablaRetencion && this.isPermisoNuevoTablaRetencion && this.isPermisoGuardarCambiosTablaRetencion));									
			
			if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
			this.jInternalFrameDetalleFormTablaRetencion.jMenuItemModificarTablaRetencion.setVisible((this.isVisibilidadCeldaModificarTablaRetencion && this.isPermisoActualizarTablaRetencion));	
			this.jInternalFrameDetalleFormTablaRetencion.jMenuItemActualizarTablaRetencion.setVisible((this.isVisibilidadCeldaActualizarTablaRetencion && this.isPermisoActualizarTablaRetencion));	
			this.jInternalFrameDetalleFormTablaRetencion.jMenuItemEliminarTablaRetencion.setVisible((this.isVisibilidadCeldaEliminarTablaRetencion && this.isPermisoEliminarTablaRetencion));
			this.jInternalFrameDetalleFormTablaRetencion.jMenuItemCancelarTablaRetencion.setVisible(this.isVisibilidadCeldaCancelarTablaRetencion);				
			}
			
			this.jMenuItemGuardarCambiosTablaRetencion.setVisible((this.isVisibilidadCeldaGuardarTablaRetencion && this.isPermisoGuardarCambiosTablaRetencion));						
			this.jMenuItemGuardarCambiosTablaTablaRetencion.setVisible((this.isVisibilidadCeldaGuardarCambiosTablaRetencion && this.isPermisoGuardarCambiosTablaRetencion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTablaRetencion=this.jButtonNuevoTablaRetencion.isVisible();
			this.isVisibilidadCeldaDuplicarTablaRetencion=this.jButtonDuplicarTablaRetencion.isVisible();
			this.isVisibilidadCeldaCopiarTablaRetencion=this.jButtonCopiarTablaRetencion.isVisible();
			this.isVisibilidadCeldaVerFormTablaRetencion=this.jButtonVerFormTablaRetencion.isVisible();
			
			this.isVisibilidadCeldaOrdenTablaRetencion=this.jButtonAbrirOrderByTablaRetencion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTablaRetencion=this.jButtonNuevoRelacionesTablaRetencion.isVisible();
			this.isVisibilidadCeldaModificarTablaRetencion=this.jButtonModificarTablaRetencion.isVisible();
			
			if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
			this.isVisibilidadCeldaActualizarTablaRetencion=this.jInternalFrameDetalleFormTablaRetencion.jButtonActualizarTablaRetencion.isVisible();
			this.isVisibilidadCeldaEliminarTablaRetencion=this.jInternalFrameDetalleFormTablaRetencion.jButtonEliminarTablaRetencion.isVisible();
			this.isVisibilidadCeldaCancelarTablaRetencion=this.jInternalFrameDetalleFormTablaRetencion.jButtonCancelarTablaRetencion.isVisible();
			this.isVisibilidadCeldaGuardarTablaRetencion=this.jInternalFrameDetalleFormTablaRetencion.jButtonGuardarCambiosTablaRetencion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTablaRetencion=this.jButtonGuardarCambiosTablaTablaRetencion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTablaRetencion=this.jButtonNuevoToolBarTablaRetencion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTablaRetencion=this.jButtonNuevoRelacionesToolBarTablaRetencion.isVisible();
			
			if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
			this.isVisibilidadCeldaModificarTablaRetencion=this.jInternalFrameDetalleFormTablaRetencion.jButtonModificarToolBarTablaRetencion.isVisible();
			this.isVisibilidadCeldaActualizarTablaRetencion=this.jInternalFrameDetalleFormTablaRetencion.jButtonActualizarToolBarTablaRetencion.isVisible();
			this.isVisibilidadCeldaEliminarTablaRetencion=this.jInternalFrameDetalleFormTablaRetencion.jButtonEliminarToolBarTablaRetencion.isVisible();
			this.isVisibilidadCeldaCancelarTablaRetencion=this.jInternalFrameDetalleFormTablaRetencion.jButtonCancelarToolBarTablaRetencion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTablaRetencion=this.jButtonGuardarCambiosToolBarTablaRetencion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTablaRetencion=this.jButtonGuardarCambiosTablaToolBarTablaRetencion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTablaRetencion=this.jMenuItemNuevoTablaRetencion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTablaRetencion=this.jMenuItemNuevoRelacionesTablaRetencion.isVisible();
			
			if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
			this.isVisibilidadCeldaModificarTablaRetencion=this.jInternalFrameDetalleFormTablaRetencion.jMenuItemModificarTablaRetencion.isVisible();
			this.isVisibilidadCeldaActualizarTablaRetencion=this.jInternalFrameDetalleFormTablaRetencion.jMenuItemActualizarTablaRetencion.isVisible();
			this.isVisibilidadCeldaEliminarTablaRetencion=this.jInternalFrameDetalleFormTablaRetencion.jMenuItemEliminarTablaRetencion.isVisible();
			this.isVisibilidadCeldaCancelarTablaRetencion=this.jInternalFrameDetalleFormTablaRetencion.jMenuItemCancelarTablaRetencion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTablaRetencion=this.jMenuItemGuardarCambiosTablaRetencion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTablaRetencion=this.jMenuItemGuardarCambiosTablaTablaRetencion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTablaRetencion(Boolean esInicializar) {
		if(TablaRetencionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tablaretencionSessionBean.getConGuardarRelaciones()) {
				//if(this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTablaRetencion();
			}
			
			this.inicializarActualizarBindingBotonesManualTablaRetencion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTablaRetencion() {
		this.jButtonNuevoTablaRetencion.setVisible(this.isPermisoNuevoTablaRetencion);			
		this.jButtonDuplicarTablaRetencion.setVisible(this.isPermisoDuplicarTablaRetencion);			
		this.jButtonCopiarTablaRetencion.setVisible(this.isPermisoCopiarTablaRetencion);			
		this.jButtonVerFormTablaRetencion.setVisible(this.isPermisoVerFormTablaRetencion);			
		
		this.jButtonAbrirOrderByTablaRetencion.setVisible(this.isPermisoOrdenTablaRetencion);					
		
		this.jButtonNuevoRelacionesTablaRetencion.setVisible(this.isPermisoNuevoTablaRetencion);			
		
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaRetencion.jButtonModificarTablaRetencion.setVisible(this.isPermisoActualizarTablaRetencion);	
			this.jInternalFrameDetalleFormTablaRetencion.jButtonActualizarTablaRetencion.setVisible(this.isPermisoActualizarTablaRetencion);	
			this.jInternalFrameDetalleFormTablaRetencion.jButtonEliminarTablaRetencion.setVisible(this.isPermisoEliminarTablaRetencion);
			this.jInternalFrameDetalleFormTablaRetencion.jButtonCancelarTablaRetencion.setVisible(this.isVisibilidadCeldaCancelarTablaRetencion);						
			this.jInternalFrameDetalleFormTablaRetencion.jButtonGuardarCambiosTablaRetencion.setVisible(this.isPermisoGuardarCambiosTablaRetencion);							
		}
		
		this.jButtonGuardarCambiosTablaTablaRetencion.setVisible(this.isPermisoActualizarTablaRetencion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTablaRetencion() {
		this.jInternalFrameDetalleFormTablaRetencion.jButtonModificarTablaRetencion.setVisible(this.isPermisoActualizarTablaRetencion);	
		this.jInternalFrameDetalleFormTablaRetencion.jButtonActualizarTablaRetencion.setVisible(this.isPermisoActualizarTablaRetencion);	
		this.jInternalFrameDetalleFormTablaRetencion.jButtonEliminarTablaRetencion.setVisible(this.isPermisoEliminarTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jButtonCancelarTablaRetencion.setVisible(this.isVisibilidadCeldaCancelarTablaRetencion);							
		this.jInternalFrameDetalleFormTablaRetencion.jButtonGuardarCambiosTablaRetencion.setVisible((this.isVisibilidadCeldaGuardarTablaRetencion && this.isPermisoGuardarCambiosTablaRetencion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTablaRetencion() {
		if(TablaRetencionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTablaRetencion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTablaRetencion() {
	}
	
	public void jTableDatosTablaRetencionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTablaRetencion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTablaRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaRetencion(this.gettablaretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaretencion==null) {
						this.tablaretencion = new TablaRetencion();
					}

					this.setVariablesFormularioToObjetoActualTablaRetencion(this.tablaretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
				}

				if(this.tablaretencion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tablaretencion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTablaRetencionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTablaRetencion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTablaRetencion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTablaRetencion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTablaRetencion(this.gettablaretencion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tablaretencionLogic.getConnexion());

				if(this.tablaretencion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tablaretencion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTablaRetencion=(TitledBorder)this.jScrollPanelDatosTablaRetencion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTablaRetencion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTablaRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaRetencion(this.gettablaretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaretencion==null) {
						this.tablaretencion = new TablaRetencion();
					}

					this.setVariablesFormularioToObjetoActualTablaRetencion(this.tablaretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
				}

				if(this.tablaretencion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tablaretencion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTablaRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaRetencion(this.gettablaretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaretencion==null) {
						this.tablaretencion = new TablaRetencion();
					}

					this.setVariablesFormularioToObjetoActualTablaRetencion(this.tablaretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
				}

				if(this.tablaretencion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tablaretencion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTablaRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaRetencion(this.gettablaretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaretencion==null) {
						this.tablaretencion = new TablaRetencion();
					}

					this.setVariablesFormularioToObjetoActualTablaRetencion(this.tablaretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
				}

				if(this.tablaretencion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tablaretencion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeTablaRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaRetencion(this.gettablaretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaretencion==null) {
						this.tablaretencion = new TablaRetencion();
					}

					this.setVariablesFormularioToObjetoActualTablaRetencion(this.tablaretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
				}

				if(this.tablaretencion.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.tablaretencion.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmonto_minimoTablaRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaRetencion(this.gettablaretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaretencion==null) {
						this.tablaretencion = new TablaRetencion();
					}

					this.setVariablesFormularioToObjetoActualTablaRetencion(this.tablaretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
				}

				if(this.tablaretencion.getmonto_minimo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto_minimo = "+this.tablaretencion.getmonto_minimo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_retencionTablaRetencionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotiporetencion=true;

			idTienePermisotiporetencion=this.tienePermisosUsuarioEnPaginaWebTablaRetencion(TipoRetencionConstantesFunciones.CLASSNAME);

			if(idTienePermisotiporetencion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTablaRetencion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTablaRetencion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTablaRetencion(this.gettablaretencion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);

				this.tiporetencionBeanSwingJInternalFrame=new TipoRetencionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tiporetencionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tiporetencionBeanSwingJInternalFrame.getTipoRetencionLogic().setConnexion(this.tablaretencionLogic.getConnexion());

				if(this.tablaretencion.getid_tipo_retencion()!=null) {
					this.tiporetencionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tiporetencionBeanSwingJInternalFrame.setIdActual(this.tablaretencion.getid_tipo_retencion());
					this.tiporetencionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tiporetencionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tiporetencionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoRetencion();
				}

				JInternalFrameBase jinternalFrame =this.tiporetencionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTablaRetencion=(TitledBorder)this.jScrollPanelDatosTablaRetencion.getBorder();
				TitledBorder titledBordertiporetencion=(TitledBorder)this.tiporetencionBeanSwingJInternalFrame.jScrollPanelDatosTipoRetencion.getBorder();

				titledBordertiporetencion.setTitle(titledBorderTablaRetencion.getTitle() + " -> Tipo Retencion ");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_retencionTablaRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaRetencion(this.gettablaretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaretencion==null) {
						this.tablaretencion = new TablaRetencion();
					}

					this.setVariablesFormularioToObjetoActualTablaRetencion(this.tablaretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
				}

				if(this.tablaretencion.getid_tipo_retencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_retencion = "+this.tablaretencion.getid_tipo_retencion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_debitoTablaRetencionActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontabledebitoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontabledebitoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontabledebitoBeanSwingJInternalFrame.sTipoBusqueda="CuentaContableDebito";

			if(!this.sFinalQueryGeneral_cuentacontabledebito.equals("")) {
				this.cuentacontabledebitoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontabledebito);
				this.cuentacontabledebitoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontabledebitoBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontabledebitoBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontabledebitoBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContableDebito.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontabledebitoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderTablaRetencion=null;
			TitledBorder titledBordercuentacontabledebito=null;

			if(!this.jScrollPanelDatosTablaRetencion.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderTablaRetencion=(TitledBorder)this.jScrollPanelDatosTablaRetencion.getBorder();
				titledBordercuentacontabledebito=(TitledBorder)this.cuentacontabledebitoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontabledebito.setTitle(titledBorderTablaRetencion.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contable_debitoTablaRetencionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontabledebito=true;

			idTienePermisocuentacontabledebito=this.tienePermisosUsuarioEnPaginaWebTablaRetencion(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontabledebito) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTablaRetencion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTablaRetencion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTablaRetencion(this.gettablaretencion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);

				this.cuentacontabledebitoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontabledebitoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontabledebitoBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.tablaretencionLogic.getConnexion());

				if(this.tablaretencion.getid_cuenta_contable_debito()!=null) {
					this.cuentacontabledebitoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontabledebitoBeanSwingJInternalFrame.setIdActual(this.tablaretencion.getid_cuenta_contable_debito());
					this.cuentacontabledebitoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontabledebitoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontabledebitoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontabledebitoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTablaRetencion=(TitledBorder)this.jScrollPanelDatosTablaRetencion.getBorder();
				TitledBorder titledBordercuentacontabledebito=(TitledBorder)this.cuentacontabledebitoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontabledebito.setTitle(titledBorderTablaRetencion.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_debitoTablaRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaRetencion(this.gettablaretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaretencion==null) {
						this.tablaretencion = new TablaRetencion();
					}

					this.setVariablesFormularioToObjetoActualTablaRetencion(this.tablaretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
				}

				if(this.tablaretencion.getid_cuenta_contable_debito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_debito = "+this.tablaretencion.getid_cuenta_contable_debito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_creditoTablaRetencionActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontablecreditoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontablecreditoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontablecreditoBeanSwingJInternalFrame.sTipoBusqueda="CuentaContableCredito";

			if(!this.sFinalQueryGeneral_cuentacontablecredito.equals("")) {
				this.cuentacontablecreditoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontablecredito);
				this.cuentacontablecreditoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontablecreditoBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontablecreditoBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontablecreditoBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContableCredito.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontablecreditoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderTablaRetencion=null;
			TitledBorder titledBordercuentacontablecredito=null;

			if(!this.jScrollPanelDatosTablaRetencion.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderTablaRetencion=(TitledBorder)this.jScrollPanelDatosTablaRetencion.getBorder();
				titledBordercuentacontablecredito=(TitledBorder)this.cuentacontablecreditoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablecredito.setTitle(titledBorderTablaRetencion.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contable_creditoTablaRetencionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontablecredito=true;

			idTienePermisocuentacontablecredito=this.tienePermisosUsuarioEnPaginaWebTablaRetencion(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontablecredito) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTablaRetencion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTablaRetencion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTablaRetencion(this.gettablaretencion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);

				this.cuentacontablecreditoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontablecreditoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontablecreditoBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.tablaretencionLogic.getConnexion());

				if(this.tablaretencion.getid_cuenta_contable_credito()!=null) {
					this.cuentacontablecreditoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontablecreditoBeanSwingJInternalFrame.setIdActual(this.tablaretencion.getid_cuenta_contable_credito());
					this.cuentacontablecreditoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontablecreditoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontablecreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontablecreditoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTablaRetencion=(TitledBorder)this.jScrollPanelDatosTablaRetencion.getBorder();
				TitledBorder titledBordercuentacontablecredito=(TitledBorder)this.cuentacontablecreditoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablecredito.setTitle(titledBorderTablaRetencion.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_creditoTablaRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaRetencion(this.gettablaretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaretencion==null) {
						this.tablaretencion = new TablaRetencion();
					}

					this.setVariablesFormularioToObjetoActualTablaRetencion(this.tablaretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
				}

				if(this.tablaretencion.getid_cuenta_contable_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_credito = "+this.tablaretencion.getid_cuenta_contable_credito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_debitoTablaRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaRetencion(this.gettablaretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaretencion==null) {
						this.tablaretencion = new TablaRetencion();
					}

					this.setVariablesFormularioToObjetoActualTablaRetencion(this.tablaretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
				}

				if(this.tablaretencion.getes_debito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_debito = "+this.tablaretencion.getes_debito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_retencion_fuenteTablaRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaRetencion(this.gettablaretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaretencion==null) {
						this.tablaretencion = new TablaRetencion();
					}

					this.setVariablesFormularioToObjetoActualTablaRetencion(this.tablaretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
				}

				if(this.tablaretencion.getes_retencion_fuente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_retencion_fuente = "+this.tablaretencion.getes_retencion_fuente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_secuencialTablaRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaRetencion(this.gettablaretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaretencion==null) {
						this.tablaretencion = new TablaRetencion();
					}

					this.setVariablesFormularioToObjetoActualTablaRetencion(this.tablaretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
				}

				if(this.tablaretencion.getcon_secuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_secuencial = "+this.tablaretencion.getcon_secuencial().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_sub_total_facturaTablaRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaRetencion(this.gettablaretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaretencion==null) {
						this.tablaretencion = new TablaRetencion();
					}

					this.setVariablesFormularioToObjetoActualTablaRetencion(this.tablaretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
				}

				if(this.tablaretencion.getcon_sub_total_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_sub_total_factura = "+this.tablaretencion.getcon_sub_total_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_iva_facturaTablaRetencionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaRetencion(this.gettablaretencion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaretencion==null) {
						this.tablaretencion = new TablaRetencion();
					}

					this.setVariablesFormularioToObjetoActualTablaRetencion(this.tablaretencion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);
				}

				if(this.tablaretencion.getcon_iva_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_iva_factura = "+this.tablaretencion.getcon_iva_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaRetencion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTablaRetencionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTablaRetencion(false,false);

			this.getTablaRetencionsBusquedaPorCodigo();

			this.inicializarActualizarBindingTablaRetencion(false);

			//if(TablaRetencionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTablaRetencion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTablaRetencionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTablaRetencion(false,false);

			this.getTablaRetencionsBusquedaPorNombre();

			this.inicializarActualizarBindingTablaRetencion(false);

			//if(TablaRetencionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTablaRetencion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableCreditoTablaRetencionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTablaRetencion(false,false);

			this.getTablaRetencionsFK_IdCuentaContableCredito();

			this.inicializarActualizarBindingTablaRetencion(false);

			//if(TablaRetencionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTablaRetencion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableDebitoTablaRetencionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTablaRetencion(false,false);

			this.getTablaRetencionsFK_IdCuentaContableDebito();

			this.inicializarActualizarBindingTablaRetencion(false);

			//if(TablaRetencionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTablaRetencion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTablaRetencionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTablaRetencion(false,false);

			this.getTablaRetencionsFK_IdEmpresa();

			this.inicializarActualizarBindingTablaRetencion(false);

			//if(TablaRetencionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTablaRetencion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoRetencionTablaRetencionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTablaRetencion(false,false);

			this.getTablaRetencionsFK_IdTipoRetencion();

			this.inicializarActualizarBindingTablaRetencion(false);

			//if(TablaRetencionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTablaRetencion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaretencionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTablaRetencion() {
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
			this.jInternalFrameDetalleFormTablaRetencion.setVisible(false);	    			
			this.jInternalFrameDetalleFormTablaRetencion.dispose();
			this.jInternalFrameDetalleFormTablaRetencion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTablaRetencion!=null) {
			this.jInternalFrameReporteDinamicoTablaRetencion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTablaRetencion.dispose();
			this.jInternalFrameReporteDinamicoTablaRetencion=null;
		}
		
		if(this.jInternalFrameImportacionTablaRetencion!=null) {
			this.jInternalFrameImportacionTablaRetencion.setVisible(false);	    			
			this.jInternalFrameImportacionTablaRetencion.dispose();
			this.jInternalFrameImportacionTablaRetencion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTablaRetencion();
			
			TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
			
			
			if(sTipo.equals("NuevoTablaRetencion")) {
				jButtonNuevoTablaRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTablaRetencion")) {
				jButtonDuplicarTablaRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTablaRetencion")) {
				jButtonCopiarTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("VerFormTablaRetencion")) {
				jButtonVerFormTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTablaRetencion")) {
				jButtonNuevoTablaRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTablaRetencion")) {
				jButtonDuplicarTablaRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTablaRetencion")) {
				jButtonNuevoTablaRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTablaRetencion")) {
				jButtonDuplicarTablaRetencionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTablaRetencion")) {
				jButtonNuevoTablaRetencionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTablaRetencion")) {
				jButtonNuevoTablaRetencionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTablaRetencion")) {
				jButtonNuevoTablaRetencionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTablaRetencion")) {
				jButtonModificarTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTablaRetencion")) {
				jButtonModificarTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTablaRetencion")) {
				jButtonModificarTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTablaRetencion")) {
				jButtonActualizarTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTablaRetencion")) {
				jButtonActualizarTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTablaRetencion")) {
				jButtonActualizarTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("EliminarTablaRetencion")) {
				jButtonEliminarTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTablaRetencion")) {
				jButtonEliminarTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTablaRetencion")) {
				jButtonEliminarTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("CancelarTablaRetencion")) {
				jButtonCancelarTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTablaRetencion")) {
				jButtonCancelarTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTablaRetencion")) {
				jButtonCancelarTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("CerrarTablaRetencion")) {
				jButtonCerrarTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTablaRetencion")) {
				jButtonCerrarTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTablaRetencion")) {
				jButtonCerrarTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTablaRetencion")) {
				jButtonMostrarOcultarTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTablaRetencion")) {
				jButtonCancelarTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaRetencion")) {
				jButtonGuardarCambiosTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTablaRetencion")) {
				jButtonGuardarCambiosTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTablaRetencion")) {
				jButtonCopiarTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTablaRetencion")) {
				jButtonVerFormTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaRetencion")) {
				jButtonGuardarCambiosTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTablaRetencion")) {
				jButtonCopiarTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTablaRetencion")) {
				jButtonVerFormTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTablaRetencion")) {
				jButtonGuardarCambiosTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTablaRetencion")) {
				jButtonGuardarCambiosTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTablaRetencion")) {
				jButtonGuardarCambiosTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTablaRetencion")) {
				jButtonRecargarInformacionTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTablaRetencion")) {
				jButtonRecargarInformacionTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTablaRetencion")) {
				jButtonRecargarInformacionTablaRetencionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTablaRetencion")) {
				jButtonAnterioresTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTablaRetencion")) {
				jButtonAnterioresTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTablaRetencion")) {
				jButtonAnterioresTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTablaRetencion")) {
				jButtonSiguientesTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTablaRetencion")) {
				jButtonSiguientesTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTablaRetencion")) {
				jButtonSiguientesTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTablaRetencion") || sTipo.equals("MenuItemDetalleAbrirOrderByTablaRetencion")) {
				jButtonAbrirOrderByTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTablaRetencion") || sTipo.equals("MenuItemDetalleMostrarOcultarTablaRetencion")) {
				jButtonMostrarOcultarTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTablaRetencion")) {
				jButtonNuevoGuardarCambiosTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTablaRetencion")) {
				jButtonNuevoGuardarCambiosTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTablaRetencion")) {
				jButtonNuevoGuardarCambiosTablaRetencionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTablaRetencion")) {
				jButtonCerrarReporteDinamicoTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTablaRetencion")) {
				jButtonGenerarReporteDinamicoTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTablaRetencion")) {
				
				jButtonGenerarExcelReporteDinamicoTablaRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTablaRetencion")) {
				jButtonCerrarImportacionTablaRetencionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTablaRetencion")) {
				
				jButtonGenerarImportacionTablaRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTablaRetencion")) {
				
				jButtonAbrirImportacionTablaRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTablaRetencion")) {
				jComboBoxTiposAccionesTablaRetencionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTablaRetencion")) {
				jComboBoxTiposRelacionesTablaRetencionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTablaRetencion")) {
				jComboBoxTiposAccionesTablaRetencionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTablaRetencion")) {
				
				jComboBoxTiposSeleccionarTablaRetencionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTablaRetencion")) {
				jTextFieldValorCampoGeneralTablaRetencionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTablaRetencion")) {
				jButtonAbrirOrderByTablaRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTablaRetencion")) {
				jButtonAbrirOrderByTablaRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTablaRetencion")) {
				jButtonCerrarOrderByTablaRetencionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTablaRetencionBusqueda")) {
				this.jButtonidTablaRetencionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTablaRetencionUpdate")) {
				this.jButtonid_empresaTablaRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTablaRetencionBusqueda")) {
				this.jButtonid_empresaTablaRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTablaRetencionBusqueda")) {
				this.jButtoncodigoTablaRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTablaRetencionBusqueda")) {
				this.jButtonnombreTablaRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeTablaRetencionBusqueda")) {
				this.jButtonporcentajeTablaRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_minimoTablaRetencionBusqueda")) {
				this.jButtonmonto_minimoTablaRetencionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_retencionTablaRetencionUpdate")) {
				this.jButtonid_tipo_retencionTablaRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_retencionTablaRetencionBusqueda")) {
				this.jButtonid_tipo_retencionTablaRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoTablaRetencion")) {
				this.jButtonid_cuenta_contable_debitoTablaRetencionActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoTablaRetencionArbol")) {
				this.abrirFrameTreeCuentaContableDebito("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoTablaRetencionUpdate")) {
				this.jButtonid_cuenta_contable_debitoTablaRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoTablaRetencionBusqueda")) {
				this.jButtonid_cuenta_contable_debitoTablaRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTablaRetencion")) {
				this.jButtonid_cuenta_contable_creditoTablaRetencionActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTablaRetencionArbol")) {
				this.abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTablaRetencionUpdate")) {
				this.jButtonid_cuenta_contable_creditoTablaRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTablaRetencionBusqueda")) {
				this.jButtonid_cuenta_contable_creditoTablaRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_debitoTablaRetencionBusqueda")) {
				this.jButtones_debitoTablaRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_retencion_fuenteTablaRetencionBusqueda")) {
				this.jButtones_retencion_fuenteTablaRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_secuencialTablaRetencionBusqueda")) {
				this.jButtoncon_secuencialTablaRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_sub_total_facturaTablaRetencionBusqueda")) {
				this.jButtoncon_sub_total_facturaTablaRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_iva_facturaTablaRetencionBusqueda")) {
				this.jButtoncon_iva_facturaTablaRetencionBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_cuenta_contable_creditoTablaRetencion")) {
				this.jButtonid_cuenta_contable_creditoTablaRetencionActionPerformed(evt);
			}
			else if(sTipo.equals("id_cuenta_contable_debitoTablaRetencion")) {
				this.jButtonid_cuenta_contable_debitoTablaRetencionActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("BusquedaPorCodigoTablaRetencion")) {
				this.jButtonBusquedaPorCodigoTablaRetencionActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTablaRetencion")) {
				this.jButtonBusquedaPorNombreTablaRetencionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContableCreditoTablaRetencion")) {
				this.jButtonFK_IdCuentaContableCreditoTablaRetencionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContableDebitoTablaRetencion")) {
				this.jButtonFK_IdCuentaContableDebitoTablaRetencionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoRetencionTablaRetencion")) {
				this.jButtonFK_IdTipoRetencionTablaRetencionActionPerformed(evt);
			}
			
			;
			
			
			TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTablaRetencion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTablaRetencionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaretencion);
				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
				
				


				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TablaRetencion tablaretencionLocal=null;
			
			if(!this.getEsControlTabla()) {
				tablaretencionLocal=this.tablaretencion;
			} else {
				tablaretencionLocal=this.tablaretencionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaretencion);
				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
							
				
				


				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionAnterior =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaretencionAnterior =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
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
			
			TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
			
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
			
			


			
			TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTablaRetencionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaretencion);
				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
								
						
				


				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaRetencion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaretencion);
				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
								
				
				


				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionAnterior =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaretencionAnterior =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaretencion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionAnterior =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaretencionAnterior =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaRetencionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaretencion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tablaretencion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaretencion);
				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
							
				
				


				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaRetencion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTablaRetencionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaretencionAnterior =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tablaretencionAnterior =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
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
			
			TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
			
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
			
			


			
			TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaRetencionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaretencion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tablaretencion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaretencion);
				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
								
				
				


				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionAnterior =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaretencionAnterior =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaRetencionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaretencion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tablaretencion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTablaRetencionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaretencion);
				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTablaRetencion")) {
					jCheckBoxSeleccionarTodosTablaRetencionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTablaRetencion")) {
					jCheckBoxSeleccionadosTablaRetencionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTablaRetencion")) {
					
				}
				
				


				
				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaretencion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tablaretencion);
				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
												
				
				


				
				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaRetencion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTablaRetencionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaretencionAnterior =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tablaretencionAnterior =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTablaRetencionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaretencion);
				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
				
				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
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
			
			TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
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
			
			


			
			TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTablaRetencionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaretencion);
				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaRetencion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaRetencion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaretencion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaretencion);
				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
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
				
				


				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaRetencion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaRetencion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaRetencionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaretencionAnterior =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaretencionAnterior =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTablaRetencion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTablaRetencionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTablaRetencion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tablaretencion =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tablaretencion =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tablaretencion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTablaRetencion")) {
				
				}
				
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTablaRetencion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTablaRetencion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTablaRetencion")) {
			
			}
			
			TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTablaRetencion();
			
			TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
			
			if(sTipo.equals("NuevoTablaRetencion")) {
				jButtonNuevoTablaRetencionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTablaRetencion")) {
				jButtonDuplicarTablaRetencionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTablaRetencion")) {
				jButtonCopiarTablaRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTablaRetencion")) {
				jButtonVerFormTablaRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTablaRetencion")) {
				jButtonNuevoTablaRetencionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTablaRetencion")) {
				jButtonModificarTablaRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTablaRetencion")) {
				jButtonActualizarTablaRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTablaRetencion")) {
				jButtonEliminarTablaRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTablaRetencion")) {
				jButtonGuardarCambiosTablaRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTablaRetencion")) {
				jButtonCancelarTablaRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTablaRetencion")) {
				jButtonCerrarTablaRetencionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaRetencion")) {
				jButtonGuardarCambiosTablaRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTablaRetencion")) {
				jButtonNuevoGuardarCambiosTablaRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTablaRetencion")) {
				jButtonAbrirOrderByTablaRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTablaRetencion")) {
				jButtonRecargarInformacionTablaRetencionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTablaRetencion")) {
				jButtonAnterioresTablaRetencionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTablaRetencion")) {
				jButtonSiguientesTablaRetencionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTablaRetencionBusqueda")) {
				this.jButtonidTablaRetencionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTablaRetencionUpdate")) {
				this.jButtonid_empresaTablaRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTablaRetencionBusqueda")) {
				this.jButtonid_empresaTablaRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTablaRetencionBusqueda")) {
				this.jButtoncodigoTablaRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTablaRetencionBusqueda")) {
				this.jButtonnombreTablaRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeTablaRetencionBusqueda")) {
				this.jButtonporcentajeTablaRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_minimoTablaRetencionBusqueda")) {
				this.jButtonmonto_minimoTablaRetencionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_retencionTablaRetencionUpdate")) {
				this.jButtonid_tipo_retencionTablaRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_retencionTablaRetencionBusqueda")) {
				this.jButtonid_tipo_retencionTablaRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoTablaRetencion")) {
				this.jButtonid_cuenta_contable_debitoTablaRetencionActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoTablaRetencionArbol")) {
				this.abrirFrameTreeCuentaContableDebito("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoTablaRetencionUpdate")) {
				this.jButtonid_cuenta_contable_debitoTablaRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_debitoTablaRetencionBusqueda")) {
				this.jButtonid_cuenta_contable_debitoTablaRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTablaRetencion")) {
				this.jButtonid_cuenta_contable_creditoTablaRetencionActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTablaRetencionArbol")) {
				this.abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTablaRetencionUpdate")) {
				this.jButtonid_cuenta_contable_creditoTablaRetencionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_creditoTablaRetencionBusqueda")) {
				this.jButtonid_cuenta_contable_creditoTablaRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_debitoTablaRetencionBusqueda")) {
				this.jButtones_debitoTablaRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_retencion_fuenteTablaRetencionBusqueda")) {
				this.jButtones_retencion_fuenteTablaRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_secuencialTablaRetencionBusqueda")) {
				this.jButtoncon_secuencialTablaRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_sub_total_facturaTablaRetencionBusqueda")) {
				this.jButtoncon_sub_total_facturaTablaRetencionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_iva_facturaTablaRetencionBusqueda")) {
				this.jButtoncon_iva_facturaTablaRetencionBusquedaActionPerformed(evt);
			}
			
			TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTablaRetencion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTablaRetencion")) {
				closingInternalFrameTablaRetencion();
				
			} else if(sTipo.equals("jButtonCancelarTablaRetencion")) {
				JInternalFrameBase jInternalFrameDetalleFormTablaRetencion = (JInternalFrameBase)evt.getSource();
	            	
	            TablaRetencionBeanSwingJInternalFrame jInternalFrameParent=(TablaRetencionBeanSwingJInternalFrame)jInternalFrameDetalleFormTablaRetencion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTablaRetencionActionPerformed(null);
			}
			
			TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tablaretencion,new Object(),this.tablaretencionParameterGeneral,this.tablaretencionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTablaRetencion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTablaRetencion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTablaRetencion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tablaretencion)) {
			if(!esControlTabla) {
				if(TablaRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTablaRetencion(this.tablaretencion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);			
				}
				
				if(this.tablaretencionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTablaRetencion(this.tablaretencion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tablaretencionReturnGeneral=tablaretencionLogic.procesarEventosTablaRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tablaretencionLogic.getTablaRetencions(),this.tablaretencion,this.tablaretencionParameterGeneral,this.isEsNuevoTablaRetencion,classes);//this.tablaretencionLogic.getTablaRetencion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTablaRetencion(this.tablaretencionReturnGeneral,this.tablaretencionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tablaretencionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTablaRetencion(classes,this.tablaretencionReturnGeneral,this.tablaretencionBean,false);
					}
						
					if(this.tablaretencionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTablaRetencion(this.tablaretencionReturnGeneral.getTablaRetencion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTablaRetencion(this.tablaretencionReturnGeneral.getTablaRetencion());	
					}
						
					if(this.tablaretencionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTablaRetencion(this.tablaretencionReturnGeneral.getTablaRetencion(),classes);//this.tablaretencionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTablaRetencion(this.tablaretencion,classes);//this.tablaretencionBean);									
				}
			
				if(TablaRetencionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTablaRetencion(this.tablaretencion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaRetencion(this.tablaretencion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tablaretencionAnterior!=null) {
						this.tablaretencion=this.tablaretencionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tablaretencionReturnGeneral=tablaretencionLogic.procesarEventosTablaRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tablaretencionLogic.getTablaRetencions(),this.tablaretencion,this.tablaretencionParameterGeneral,this.isEsNuevoTablaRetencion,classes);//this.tablaretencionLogic.getTablaRetencion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tablaretencionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tablaretencionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tablaretencionReturnGeneral.getTablaRetencion(),tablaretencionLogic.getTablaRetencions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tablaretencionReturnGeneral.getTablaRetencion(),this.tablaretencions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTablaRetencion.repaint();
				
				//((AbstractTableModel) this.jTableDatosTablaRetencion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTablaRetencion();
			}
		}
	}
	
	public void actualizarVisualTableDatosTablaRetencion() throws Exception {
		
		TablaRetencionModel tablaretencionModel=(TablaRetencionModel)this.jTableDatosTablaRetencion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tablaretencionModel.tablaretencions=this.tablaretencionLogic.getTablaRetencions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tablaretencionModel.tablaretencions=this.tablaretencions;
		}
		
		
		((TablaRetencionModel) this.jTableDatosTablaRetencion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTablaRetencion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettablaretencionAnterior(),this.tablaretencionLogic.getTablaRetencions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettablaretencionAnterior(),this.tablaretencions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTablaRetencion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTablaRetencion(TablaRetencion tablaretencion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
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
										
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tablaretencion,new Object(),generalEntityParameterGeneral,this.tablaretencionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tablaretencionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TablaRetencionConstantesFunciones.getClassesRelationshipsOfTablaRetencion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TablaRetencionConstantesFunciones.getClassesRelationshipsFromStringsOfTablaRetencion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTablaRetencion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TablaRetencionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tablaretencion,new Object(),generalEntityParameterGeneral,this.tablaretencionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTablaRetencion(TablaRetencionBean tablaretencionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTablaRetencion(ArrayList<Classe> classes,TablaRetencionReturnGeneral tablaretencionReturnGeneral,TablaRetencionBean tablaretencionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTablaRetencion(TablaRetencion tablaretencion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tablaretencion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTablaRetencion = new TablaRetencionDetalleFormJInternalFrame(jDesktopPane,this.tablaretencionSessionBean.getConGuardarRelaciones(),this.tablaretencionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.setVisible(false);
		this.jInternalFrameDetalleFormTablaRetencion.setSelected(false);						
		
		this.jInternalFrameDetalleFormTablaRetencion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTablaRetencion.tablaretencionLogic=this.tablaretencionLogic;
		
		this.cargarCombosFrameForeignKeyTablaRetencion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTablaRetencion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTablaRetencion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTablaRetencion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTablaRetencion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTablaRetencion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTablaRetencion"));
		
		this.jInternalFrameDetalleFormTablaRetencion.jButtonModificarTablaRetencion.addActionListener(new ButtonActionListener(this,"ModificarTablaRetencion"));

		
		this.jInternalFrameDetalleFormTablaRetencion.jButtonModificarToolBarTablaRetencion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTablaRetencion"));
					
		this.jInternalFrameDetalleFormTablaRetencion.jMenuItemModificarTablaRetencion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTablaRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormTablaRetencion.jButtonActualizarTablaRetencion.addActionListener (new ButtonActionListener(this,"ActualizarTablaRetencion"));
		
		
		this.jInternalFrameDetalleFormTablaRetencion.jButtonActualizarToolBarTablaRetencion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTablaRetencion"));
						
		this.jInternalFrameDetalleFormTablaRetencion.jMenuItemActualizarTablaRetencion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTablaRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormTablaRetencion.jButtonEliminarTablaRetencion.addActionListener (new ButtonActionListener(this,"EliminarTablaRetencion"));
		
		
		this.jInternalFrameDetalleFormTablaRetencion.jButtonEliminarToolBarTablaRetencion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTablaRetencion"));
								
		this.jInternalFrameDetalleFormTablaRetencion.jMenuItemEliminarTablaRetencion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTablaRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormTablaRetencion.jButtonCancelarTablaRetencion.addActionListener (new ButtonActionListener(this,"CancelarTablaRetencion"));
		
		
		this.jInternalFrameDetalleFormTablaRetencion.jButtonCancelarToolBarTablaRetencion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTablaRetencion"));
					
		this.jInternalFrameDetalleFormTablaRetencion.jMenuItemCancelarTablaRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTablaRetencion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTablaRetencion.jMenuItemDetalleCerrarTablaRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTablaRetencion"));		
		
		
		
		this.jInternalFrameDetalleFormTablaRetencion.jButtonGuardarCambiosToolBarTablaRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTablaRetencion"));
		
		
		
		this.jInternalFrameDetalleFormTablaRetencion.jButtonGuardarCambiosToolBarTablaRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTablaRetencion"));
		
		
		
		this.jInternalFrameDetalleFormTablaRetencion.jComboBoxTiposAccionesFormularioTablaRetencion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTablaRetencion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonidTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"idTablaRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_empresaTablaRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTablaRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_empresaTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtoncodigoTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonnombreTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonporcentajeTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonmonto_minimoTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"monto_minimoTablaRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_tipo_retencionTablaRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencionTablaRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_tipo_retencionTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencionTablaRetencionBusqueda"));
		//jButtonid_cuenta_contable_debitoTablaRetencion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_debitoTablaRetencionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_debitoTablaRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoTablaRetencion"));
		//jButtonid_cuenta_contable_debitoTablaRetencionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableDebito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_debitoTablaRetencionArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoTablaRetencionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_debitoTablaRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoTablaRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_debitoTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoTablaRetencionBusqueda"));
		//jButtonid_cuenta_contable_creditoTablaRetencion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_creditoTablaRetencionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_creditoTablaRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTablaRetencion"));
		//jButtonid_cuenta_contable_creditoTablaRetencionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_creditoTablaRetencionArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTablaRetencionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_creditoTablaRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTablaRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_creditoTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtones_debitoTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"es_debitoTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtones_retencion_fuenteTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"es_retencion_fuenteTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtoncon_secuencialTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"con_secuencialTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtoncon_sub_total_facturaTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"con_sub_total_facturaTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtoncon_iva_facturaTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"con_iva_facturaTablaRetencionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTablaRetencion.jTabbedPaneRelacionesTablaRetencion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTablaRetencion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTablaRetencion"));
		
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaRetencion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTablaRetencion"));
		}
		
		this.jTableDatosTablaRetencion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTablaRetencion"));
		
		this.jTableDatosTablaRetencion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTablaRetencion"));
		
		this.jButtonNuevoTablaRetencion.addActionListener(new ButtonActionListener(this,"NuevoTablaRetencion"));
		
		this.jButtonDuplicarTablaRetencion.addActionListener(new ButtonActionListener(this,"DuplicarTablaRetencion"));
		
		this.jButtonCopiarTablaRetencion.addActionListener(new ButtonActionListener(this,"CopiarTablaRetencion"));
		
		this.jButtonVerFormTablaRetencion.addActionListener(new ButtonActionListener(this,"VerFormTablaRetencion"));
		
		
		this.jButtonNuevoToolBarTablaRetencion.addActionListener(new ButtonActionListener(this,"NuevoToolBarTablaRetencion"));
			
		this.jButtonDuplicarToolBarTablaRetencion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTablaRetencion"));
			
		this.jMenuItemNuevoTablaRetencion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTablaRetencion"));
			
		this.jMenuItemDuplicarTablaRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTablaRetencion"));		
		
		
		this.jButtonNuevoRelacionesTablaRetencion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTablaRetencion"));
		
		
		this.jButtonNuevoRelacionesToolBarTablaRetencion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTablaRetencion"));
			
		this.jMenuItemNuevoRelacionesTablaRetencion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTablaRetencion"));		
		
		
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaRetencion.jButtonModificarTablaRetencion.addActionListener(new ButtonActionListener(this,"ModificarTablaRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaRetencion.jButtonModificarToolBarTablaRetencion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTablaRetencion"));
			
			this.jInternalFrameDetalleFormTablaRetencion.jMenuItemModificarTablaRetencion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTablaRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTablaRetencion.jButtonActualizarTablaRetencion.addActionListener (new ButtonActionListener(this,"ActualizarTablaRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaRetencion.jButtonActualizarToolBarTablaRetencion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTablaRetencion"));
				
			this.jInternalFrameDetalleFormTablaRetencion.jMenuItemActualizarTablaRetencion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTablaRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaRetencion.jButtonEliminarTablaRetencion.addActionListener (new ButtonActionListener(this,"EliminarTablaRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaRetencion.jButtonEliminarToolBarTablaRetencion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTablaRetencion"));
						
			this.jInternalFrameDetalleFormTablaRetencion.jMenuItemEliminarTablaRetencion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTablaRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaRetencion.jButtonCancelarTablaRetencion.addActionListener (new ButtonActionListener(this,"CancelarTablaRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaRetencion.jButtonCancelarToolBarTablaRetencion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTablaRetencion"));
			
			this.jInternalFrameDetalleFormTablaRetencion.jMenuItemCancelarTablaRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTablaRetencion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTablaRetencion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTablaRetencion"));		
		
		
		this.jButtonCerrarTablaRetencion.addActionListener (new ButtonActionListener(this,"CerrarTablaRetencion"));
		
		
		this.jButtonCerrarToolBarTablaRetencion.addActionListener (new ButtonActionListener(this,"CerrarToolBarTablaRetencion"));
			
		this.jMenuItemCerrarTablaRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTablaRetencion"));
			
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaRetencion.jMenuItemDetalleCerrarTablaRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTablaRetencion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaRetencion.jButtonGuardarCambiosTablaRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRetencion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaRetencion.jButtonGuardarCambiosToolBarTablaRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTablaRetencion"));
		}
		
		this.jButtonCopiarToolBarTablaRetencion.addActionListener (new ButtonActionListener(this,"CopiarToolBarTablaRetencion"));
			
		this.jButtonVerFormToolBarTablaRetencion.addActionListener (new ButtonActionListener(this,"VerFormToolBarTablaRetencion"));
		
		this.jMenuItemGuardarCambiosTablaRetencion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTablaRetencion"));
			
		this.jMenuItemCopiarTablaRetencion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTablaRetencion"));		
		
		this.jMenuItemVerFormTablaRetencion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTablaRetencion"));		
		
		
		this.jButtonGuardarCambiosTablaTablaRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTablaRetencion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTablaRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTablaRetencion"));
			
		this.jMenuItemGuardarCambiosTablaTablaRetencion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTablaRetencion"));		
		
		
		
		this.jButtonRecargarInformacionTablaRetencion.addActionListener (new ButtonActionListener(this,"RecargarInformacionTablaRetencion"));
					
		this.jButtonRecargarInformacionToolBarTablaRetencion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTablaRetencion"));
		
		this.jMenuItemRecargarInformacionTablaRetencion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTablaRetencion"));		
		
		
		
		this.jButtonAnterioresTablaRetencion.addActionListener (new ButtonActionListener(this,"AnterioresTablaRetencion"));
		
		
		this.jButtonAnterioresToolBarTablaRetencion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTablaRetencion"));
		
		this.jMenuItemAnterioresTablaRetencion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTablaRetencion"));		
		
		
		this.jButtonSiguientesTablaRetencion.addActionListener (new ButtonActionListener(this,"SiguientesTablaRetencion"));
		
		
		this.jButtonSiguientesToolBarTablaRetencion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTablaRetencion"));
			
		this.jMenuItemSiguientesTablaRetencion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTablaRetencion"));
			
		this.jMenuItemAbrirOrderByTablaRetencion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTablaRetencion"));
			
		this.jMenuItemMostrarOcultarTablaRetencion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTablaRetencion"));
			
		this.jMenuItemDetalleAbrirOrderByTablaRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTablaRetencion"));
			
		this.jMenuItemDetalleMostarOcultarTablaRetencion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTablaRetencion"));		
		
		
		this.jButtonNuevoGuardarCambiosTablaRetencion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTablaRetencion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTablaRetencion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTablaRetencion"));
			
		this.jMenuItemNuevoGuardarCambiosTablaRetencion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTablaRetencion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTablaRetencion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTablaRetencion"));

		this.jCheckBoxSeleccionadosTablaRetencion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTablaRetencion"));
		
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaRetencion.jComboBoxTiposAccionesFormularioTablaRetencion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTablaRetencion"));
		}
		
		
		this.jComboBoxTiposRelacionesTablaRetencion.addActionListener (new ButtonActionListener(this,"TiposRelacionesTablaRetencion"));
			
		this.jComboBoxTiposAccionesTablaRetencion.addActionListener (new ButtonActionListener(this,"TiposAccionesTablaRetencion"));
					
		this.jComboBoxTiposSeleccionarTablaRetencion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTablaRetencion"));
			
		this.jTextFieldValorCampoGeneralTablaRetencion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTablaRetencion"));		
		
		
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonidTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"idTablaRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_empresaTablaRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTablaRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_empresaTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtoncodigoTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonnombreTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonporcentajeTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonmonto_minimoTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"monto_minimoTablaRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_tipo_retencionTablaRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencionTablaRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_tipo_retencionTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencionTablaRetencionBusqueda"));
		//jButtonid_cuenta_contable_debitoTablaRetencion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_debitoTablaRetencionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_debitoTablaRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoTablaRetencion"));
		//jButtonid_cuenta_contable_debitoTablaRetencionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableDebito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_debitoTablaRetencionArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoTablaRetencionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_debitoTablaRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoTablaRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_debitoTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoTablaRetencionBusqueda"));
		//jButtonid_cuenta_contable_creditoTablaRetencion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_creditoTablaRetencionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_creditoTablaRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTablaRetencion"));
		//jButtonid_cuenta_contable_creditoTablaRetencionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_creditoTablaRetencionArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTablaRetencionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_creditoTablaRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTablaRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_creditoTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtones_debitoTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"es_debitoTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtones_retencion_fuenteTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"es_retencion_fuenteTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtoncon_secuencialTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"con_secuencialTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtoncon_sub_total_facturaTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"con_sub_total_facturaTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtoncon_iva_facturaTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"con_iva_facturaTablaRetencionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTablaRetencion.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTablaRetencion"));

			this.jButtonBusquedaPorNombreTablaRetencion.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTablaRetencion"));

			this.jButtonFK_IdCuentaContableCreditoTablaRetencion.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCreditoTablaRetencion"));

			this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoTablaRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTablaRetencion"));

			this.jButtonFK_IdCuentaContableDebitoTablaRetencion.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableDebitoTablaRetencion"));

			this.jButtonBuscarFK_IdCuentaContableDebitoid_cuenta_contable_debitoTablaRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoTablaRetencion"));

			this.jButtonFK_IdTipoRetencionTablaRetencion.addActionListener(new ButtonActionListener(this,"FK_IdTipoRetencionTablaRetencion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTablaRetencion!=null) {
				this.jInternalFrameReporteDinamicoTablaRetencion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTablaRetencion"));
				this.jInternalFrameReporteDinamicoTablaRetencion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTablaRetencion"));
				this.jInternalFrameReporteDinamicoTablaRetencion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTablaRetencion"));
			}
			
			//this.jButtonCerrarReporteDinamicoTablaRetencion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTablaRetencion"));				
			//this.jButtonGenerarReporteDinamicoTablaRetencion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTablaRetencion"));
			//this.jButtonGenerarExcelReporteDinamicoTablaRetencion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTablaRetencion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTablaRetencion!=null) {
				this.jInternalFrameImportacionTablaRetencion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTablaRetencion"));
				this.jInternalFrameImportacionTablaRetencion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTablaRetencion"));
				this.jInternalFrameImportacionTablaRetencion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTablaRetencion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTablaRetencion.addActionListener (new ButtonActionListener(this,"AbrirOrderByTablaRetencion"));
			
			this.jButtonAbrirOrderByToolBarTablaRetencion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTablaRetencion"));			
			
			if(this.jInternalFrameOrderByTablaRetencion!=null) {
				this.jInternalFrameOrderByTablaRetencion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTablaRetencion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTablaRetencion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaRetencion.jTabbedPaneRelacionesTablaRetencion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTablaRetencion"));
		
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
            		closingInternalFrameTablaRetencion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTablaRetencion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTablaRetencion = (JInternalFrameBase)event.getSource();
	            	
	            TablaRetencionBeanSwingJInternalFrame jInternalFrameParent=(TablaRetencionBeanSwingJInternalFrame)jInternalFrameDetalleFormTablaRetencion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTablaRetencionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTablaRetencion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTablaRetencionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTablaRetencion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTablaRetencion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTablaRetencionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTablaRetencionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTablaRetencionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTablaRetencion";
		inputMap = this.jButtonNuevoTablaRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTablaRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTablaRetencionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTablaRetencionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTablaRetencionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTablaRetencionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTablaRetencion";
		inputMap = this.jButtonNuevoRelacionesTablaRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTablaRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTablaRetencionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTablaRetencion";
		inputMap = this.jButtonModificarTablaRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTablaRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTablaRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTablaRetencion";
		inputMap = this.jButtonActualizarTablaRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTablaRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTablaRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTablaRetencion";
		inputMap = this.jButtonEliminarTablaRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTablaRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTablaRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTablaRetencion";
		inputMap = this.jButtonCancelarTablaRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTablaRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTablaRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTablaRetencion";
		inputMap = this.jButtonCerrarTablaRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTablaRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTablaRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTablaRetencion.jButtonGuardarCambiosTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTablaRetencion";
		inputMap = this.jInternalFrameDetalleFormTablaRetencion.jButtonGuardarCambiosTablaRetencion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTablaRetencion.jButtonGuardarCambiosTablaRetencion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTablaRetencionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTablaRetencion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTablaRetencionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTablaRetencion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTablaRetencionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTablaRetencion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTablaRetencionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTablaRetencion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTablaRetencionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonidTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"idTablaRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_empresaTablaRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTablaRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_empresaTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtoncodigoTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonnombreTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonporcentajeTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonmonto_minimoTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"monto_minimoTablaRetencionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_tipo_retencionTablaRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencionTablaRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_tipo_retencionTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencionTablaRetencionBusqueda"));
		//jButtonid_cuenta_contable_debitoTablaRetencion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_debitoTablaRetencionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_debitoTablaRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoTablaRetencion"));
		//jButtonid_cuenta_contable_debitoTablaRetencionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableDebito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_debitoTablaRetencionArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoTablaRetencionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_debitoTablaRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoTablaRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_debitoTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoTablaRetencionBusqueda"));
		//jButtonid_cuenta_contable_creditoTablaRetencion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_creditoTablaRetencionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_creditoTablaRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTablaRetencion"));
		//jButtonid_cuenta_contable_creditoTablaRetencionArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCredito("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_creditoTablaRetencionArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTablaRetencionArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_creditoTablaRetencionUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTablaRetencionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_creditoTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtones_debitoTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"es_debitoTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtones_retencion_fuenteTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"es_retencion_fuenteTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtoncon_secuencialTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"con_secuencialTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtoncon_sub_total_facturaTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"con_sub_total_facturaTablaRetencionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaRetencion.jButtoncon_iva_facturaTablaRetencionBusqueda.addActionListener(new ButtonActionListener(this,"con_iva_facturaTablaRetencionBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTablaRetencion.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTablaRetencion"));

		this.jButtonBusquedaPorNombreTablaRetencion.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTablaRetencion"));

		this.jButtonFK_IdCuentaContableCreditoTablaRetencion.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCreditoTablaRetencion"));

		this.jButtonBuscarFK_IdCuentaContableCreditoid_cuenta_contable_creditoTablaRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_creditoTablaRetencion"));

		this.jButtonFK_IdCuentaContableDebitoTablaRetencion.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableDebitoTablaRetencion"));

		this.jButtonBuscarFK_IdCuentaContableDebitoid_cuenta_contable_debitoTablaRetencion.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_debitoTablaRetencion"));

		this.jButtonFK_IdTipoRetencionTablaRetencion.addActionListener(new ButtonActionListener(this,"FK_IdTipoRetencionTablaRetencion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTablaRetencion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTablaRetencionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTablaRetencionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTablaRetencion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTablaRetencion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TablaRetencion tablaretencionAux:this.tablaretencionLogic.getTablaRetencions()) {
					tablaretencionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TablaRetencion tablaretencionAux:tablaretencions) {
					tablaretencionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTablaRetencionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTablaRetencion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TablaRetencion tablaretencionAux:this.tablaretencionLogic.getTablaRetencions()) {
						tablaretencionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TablaRetencion tablaretencionAux:tablaretencions) {
						tablaretencionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TablaRetencion tablaretencionAux:this.tablaretencionLogic.getTablaRetencions()) {
					
						if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_ESDEBITO)) {
							existe=true;
							tablaretencionAux.setes_debito(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_ESRETENCIONFUENTE)) {
							existe=true;
							tablaretencionAux.setes_retencion_fuente(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_CONSECUENCIAL)) {
							existe=true;
							tablaretencionAux.setcon_secuencial(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_CONSUBTOTALFACTURA)) {
							existe=true;
							tablaretencionAux.setcon_sub_total_factura(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_CONIVAFACTURA)) {
							existe=true;
							tablaretencionAux.setcon_iva_factura(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TablaRetencion tablaretencionAux:tablaretencions) {
						
						if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_ESDEBITO)) {
							existe=true;
							tablaretencionAux.setes_debito(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_ESRETENCIONFUENTE)) {
							existe=true;
							tablaretencionAux.setes_retencion_fuente(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_CONSECUENCIAL)) {
							existe=true;
							tablaretencionAux.setcon_secuencial(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_CONSUBTOTALFACTURA)) {
							existe=true;
							tablaretencionAux.setcon_sub_total_factura(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_CONIVAFACTURA)) {
							existe=true;
							tablaretencionAux.setcon_iva_factura(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTablaRetencion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTablaRetencion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTablaRetencion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTablaRetencion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTablaRetencionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTablaRetencion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTablaRetencion.getSelectedRows();
			
			TablaRetencion tablaretencionLocal=new TablaRetencion();
			
			//this.seleccionarTodosTablaRetencion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaretencionLocal =(TablaRetencion) this.tablaretencionLogic.getTablaRetencions().toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tablaretencionLocal =(TablaRetencion) this.tablaretencions.toArray()[this.jTableDatosTablaRetencion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tablaretencionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TablaRetencion tablaretencionAux:this.tablaretencionLogic.getTablaRetencions()) {
						tablaretencionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TablaRetencion tablaretencionAux:tablaretencions) {
						tablaretencionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTablaRetencion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTablaRetencion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTablaRetencion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTablaRetencion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTablaRetencionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTablaRetencionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTablaRetencionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTablaRetencion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTablaRetencion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TablaRetencion tablaretencionAux:this.tablaretencionLogic.getTablaRetencions()) {
				
						if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tablaretencionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tablaretencionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							tablaretencionAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_MONTOMINIMO)) {
							existe=true;
							tablaretencionAux.setmonto_minimo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TablaRetencion tablaretencionAux:tablaretencions) {
					
						if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tablaretencionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tablaretencionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							tablaretencionAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_MONTOMINIMO)) {
							existe=true;
							tablaretencionAux.setmonto_minimo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTablaRetencion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTablaRetencionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTablaRetencion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTablaRetencion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTablaRetencion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTablaRetencion.jComboBoxTiposAccionesFormularioTablaRetencion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTablaRetencion) {				
					conSplash=true;//false;										
					
					//this.startProcessTablaRetencion(conSplash);
				
					this.generarReporteTablaRetencionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTablaRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTablaRetencion.jComboBoxTiposAccionesFormularioTablaRetencion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTablaRetencionsSeleccionados();
				//this.jComboBoxTiposAccionesTablaRetencion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTablaRetencionsSeleccionados(false);
				//this.jComboBoxTiposAccionesTablaRetencion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTablaRetencionsSeleccionados(true);
				//this.jComboBoxTiposAccionesTablaRetencion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTablaRetencion();
				
				this.exportarTablaRetencionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTablaRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTablaRetencion.jComboBoxTiposAccionesFormularioTablaRetencion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTablaRetencions();
				//this.importarTablaRetencions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTablaRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTablaRetencion.jComboBoxTiposAccionesFormularioTablaRetencion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTablaRetencion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTablaRetencionsSeleccionados();
				//this.jComboBoxTiposAccionesTablaRetencion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tabla Retencion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTablaRetencion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTablaRetencion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTablaRetencion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tabla Retencion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTablaRetencion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTablaRetencion.jComboBoxTiposAccionesFormularioTablaRetencion.setSelectedIndex(0);					
				}	
			} 			
			else if(TablaRetencionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTablaRetencion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTablaRetencion(conSplash);
					
						//this.actualizarParametrosGeneralTablaRetencion();
						
						this.generarReporteProcesoAccionTablaRetencionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTablaRetencion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTablaRetencion.jComboBoxTiposAccionesFormularioTablaRetencion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TablaRetencionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tabla RetencionS SELECCIONADOS?", "MANTENIMIENTO DE Tabla Retencion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTablaRetencion();
				
						this.actualizarParametrosGeneralTablaRetencion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tablaretencionReturnGeneral=tablaretencionLogic.procesarAccionTablaRetencionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tablaretencionLogic.getTablaRetencions(),this.tablaretencionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTablaRetencionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTablaRetencion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTablaRetencion.jComboBoxTiposAccionesFormularioTablaRetencion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTablaRetencion();
					
					TablaRetencionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTablaRetencionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTablaRetencion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTablaRetencion.jComboBoxTiposAccionesFormularioTablaRetencion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTablaRetencion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTablaRetencionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTablaRetencion();
			
			if(this.jInternalFrameDetalleFormTablaRetencion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TablaRetencion> tablaretencionsSeleccionados=new ArrayList<TablaRetencion>();		
			TablaRetencion tablaretencion=new TablaRetencion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTablaRetencion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTablaRetencion.getSelectedItem();
			
			
			
			
			tablaretencionsSeleccionados=this.getTablaRetencionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tablaretencionsSeleccionados.size()==1) {
				for(TablaRetencion tablaretencionAux:tablaretencionsSeleccionados) {
					tablaretencion=tablaretencionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTablaRetencion();
			
      		//this.finishProcessTablaRetencion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTablaRetencionReturnGeneral() throws Exception {
		if(this.tablaretencionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tablaretencionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tablaretencionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tablaretencionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tablaretencionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tablaretencionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTablaRetencion(false);
		}
		
		if(this.tablaretencionReturnGeneral.getConRetornoLista() || this.tablaretencionReturnGeneral.getConRetornoObjeto()) {
			if(this.tablaretencionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tablaretencionLogic.setTablaRetencions(this.tablaretencionReturnGeneral.getTablaRetencions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tablaretencionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tablaretencionLogic.setTablaRetencion(this.tablaretencionReturnGeneral.getTablaRetencion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTablaRetencion(false);
		}
	}
	
	public void actualizarParametrosGeneralTablaRetencion() throws Exception {
		
		
	}
	
	public ArrayList<TablaRetencion> getTablaRetencionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TablaRetencion> tablaretencionsSeleccionados=new ArrayList<TablaRetencion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTablaRetencion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TablaRetencion tablaretencionAux:tablaretencionLogic.getTablaRetencions()) {
					if(tablaretencionAux.getIsSelected()) {
						tablaretencionsSeleccionados.add(tablaretencionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TablaRetencion tablaretencionAux:this.tablaretencions) {
					if(tablaretencionAux.getIsSelected()) {
						tablaretencionsSeleccionados.add(tablaretencionAux);				
					}
				}
			}
			
			if(tablaretencionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tablaretencionsSeleccionados.addAll(this.tablaretencionLogic.getTablaRetencions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tablaretencionsSeleccionados.addAll(this.tablaretencions);				
					}
				}
			}
		} else {
			tablaretencionsSeleccionados.add(this.tablaretencion);
		}
		
		return tablaretencionsSeleccionados;
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
	
	public void generarReporteTablaRetencionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTablaRetencionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTablaRetencionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTablaRetencionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTablaRetencionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tabla Retencion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTablaRetencionsSeleccionados() throws Exception {
		ArrayList<TablaRetencion> tablaretencionsSeleccionados=new ArrayList<TablaRetencion>();		
		
		tablaretencionsSeleccionados=this.getTablaRetencionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTablaRetencions("Todos",tablaretencionsSeleccionados);
		
	}	
	
	public void generarReporteNormalTablaRetencionsSeleccionados() throws Exception {
		ArrayList<TablaRetencion> tablaretencionsSeleccionados=new ArrayList<TablaRetencion>();		
		
		tablaretencionsSeleccionados=this.getTablaRetencionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTablaRetencions("Todos",tablaretencionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTablaRetencionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TablaRetencion> tablaretencionsSeleccionados=new ArrayList<TablaRetencion>();
		
		tablaretencionsSeleccionados=this.getTablaRetencionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTablaRetencions("Todos",tablaretencionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTablaRetencionsSeleccionados() throws Exception {
		ArrayList<TablaRetencion> tablaretencionsSeleccionados=new ArrayList<TablaRetencion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTablaRetencion();
		
		
		tablaretencionsSeleccionados=this.getTablaRetencionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTablaRetencion();
		
		
		//this.generarReporteTablaRetencions("Todos",tablaretencionsSeleccionados ,tablaretencionImplementable,tablaretencionImplementableHome);
	}
	
	public void mostrarImportacionTablaRetencions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTablaRetencion();
		
		this.abrirFrameImportacionTablaRetencion();		
		
			
		//this.generarReporteTablaRetencions("Todos",tablaretencionsSeleccionados ,tablaretencionImplementable,tablaretencionImplementableHome);
	}
	
	public void importarTablaRetencions() throws Exception {		
	
	}
	
	public void exportarTablaRetencionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTablaRetencionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTablaRetencionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTablaRetencionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tabla Retencion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTablaRetencionsSeleccionados() throws Exception {
		ArrayList<TablaRetencion> tablaretencionsSeleccionados=new ArrayList<TablaRetencion>();		
		
		tablaretencionsSeleccionados=this.getTablaRetencionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tablaretencion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTablaRetencion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TablaRetencion tablaretencionAux:tablaretencionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTablaRetencion(tablaretencionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tablaretencionAux.setsDetalleGeneralEntityReporte(tablaretencionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTablaRetencion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TablaRetencionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaRetencionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaRetencionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaRetencionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaRetencionConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaRetencionConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaRetencionConstantesFunciones.LABEL_MONTOMINIMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaRetencionConstantesFunciones.LABEL_IDTIPORETENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaRetencionConstantesFunciones.LABEL_ESDEBITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaRetencionConstantesFunciones.LABEL_ESRETENCIONFUENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaRetencionConstantesFunciones.LABEL_CONSECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaRetencionConstantesFunciones.LABEL_CONSUBTOTALFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaRetencionConstantesFunciones.LABEL_CONIVAFACTURA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTablaRetencion(TablaRetencion tablaretencion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tablaretencion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaretencion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaretencion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaretencion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaretencion.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaretencion.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaretencion.getmonto_minimo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaretencion.gettiporetencion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaretencion.getcuentacontabledebito_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaretencion.getcuentacontablecredito_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaretencion.getes_debito().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaretencion.getes_retencion_fuente().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaretencion.getcon_secuencial().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaretencion.getcon_sub_total_factura().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaretencion.getcon_iva_factura().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTablaRetencionsSeleccionados() throws Exception {
		ArrayList<TablaRetencion> tablaretencionsSeleccionados=new ArrayList<TablaRetencion>();		
		
		tablaretencionsSeleccionados=this.getTablaRetencionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tablaretencion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TablaRetencions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTablaRetencion(row);				
				iRow++;
			}				
			
			for(TablaRetencion tablaretencionAux:tablaretencionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTablaRetencion(tablaretencionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTablaRetencionsSeleccionados() throws Exception {
		ArrayList<TablaRetencion> tablaretencionsSeleccionados=new ArrayList<TablaRetencion>();		
		
		tablaretencionsSeleccionados=this.getTablaRetencionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tablaretencion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tablaretencions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tablaretencion");
			//elementRoot.appendChild(element);
		
			for(TablaRetencion tablaretencionAux:tablaretencionsSeleccionados) {
				element = document.createElement("tablaretencion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTablaRetencion(tablaretencionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaretencionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Retencion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTablaRetencion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_MONTOMINIMO);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_IDTIPORETENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_ESDEBITO);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_ESRETENCIONFUENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_CONSECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_CONSUBTOTALFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaRetencionConstantesFunciones.LABEL_CONIVAFACTURA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTablaRetencion(TablaRetencion tablaretencion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tablaretencion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaretencion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaretencion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaretencion.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaretencion.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaretencion.getmonto_minimo());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaretencion.gettiporetencion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaretencion.getcuentacontabledebito_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaretencion.getcuentacontablecredito_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaretencion.getes_debito());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaretencion.getes_retencion_fuente());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaretencion.getcon_secuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaretencion.getcon_sub_total_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaretencion.getcon_iva_factura());				
	}
	
	public void setFilaDatosExportarXmlTablaRetencion(TablaRetencion tablaretencion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TablaRetencionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tablaretencion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TablaRetencionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tablaretencion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TablaRetencionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tablaretencion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TablaRetencionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tablaretencion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TablaRetencionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tablaretencion.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementporcentaje = document.createElement(TablaRetencionConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(tablaretencion.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementmonto_minimo = document.createElement(TablaRetencionConstantesFunciones.MONTOMINIMO);
		elementmonto_minimo.appendChild(document.createTextNode(tablaretencion.getmonto_minimo().toString().trim()));
		element.appendChild(elementmonto_minimo);

		Element elementtiporetencion_descripcion = document.createElement(TablaRetencionConstantesFunciones.IDTIPORETENCION);
		elementtiporetencion_descripcion.appendChild(document.createTextNode(tablaretencion.gettiporetencion_descripcion()));
		element.appendChild(elementtiporetencion_descripcion);

		Element elementcuentacontabledebito_descripcion = document.createElement(TablaRetencionConstantesFunciones.IDCUENTACONTABLEDEBITO);
		elementcuentacontabledebito_descripcion.appendChild(document.createTextNode(tablaretencion.getcuentacontabledebito_descripcion()));
		element.appendChild(elementcuentacontabledebito_descripcion);

		Element elementcuentacontablecredito_descripcion = document.createElement(TablaRetencionConstantesFunciones.IDCUENTACONTABLECREDITO);
		elementcuentacontablecredito_descripcion.appendChild(document.createTextNode(tablaretencion.getcuentacontablecredito_descripcion()));
		element.appendChild(elementcuentacontablecredito_descripcion);

		Element elementes_debito = document.createElement(TablaRetencionConstantesFunciones.ESDEBITO);
		elementes_debito.appendChild(document.createTextNode(tablaretencion.getes_debito().toString().trim()));
		element.appendChild(elementes_debito);

		Element elementes_retencion_fuente = document.createElement(TablaRetencionConstantesFunciones.ESRETENCIONFUENTE);
		elementes_retencion_fuente.appendChild(document.createTextNode(tablaretencion.getes_retencion_fuente().toString().trim()));
		element.appendChild(elementes_retencion_fuente);

		Element elementcon_secuencial = document.createElement(TablaRetencionConstantesFunciones.CONSECUENCIAL);
		elementcon_secuencial.appendChild(document.createTextNode(tablaretencion.getcon_secuencial().toString().trim()));
		element.appendChild(elementcon_secuencial);

		Element elementcon_sub_total_factura = document.createElement(TablaRetencionConstantesFunciones.CONSUBTOTALFACTURA);
		elementcon_sub_total_factura.appendChild(document.createTextNode(tablaretencion.getcon_sub_total_factura().toString().trim()));
		element.appendChild(elementcon_sub_total_factura);

		Element elementcon_iva_factura = document.createElement(TablaRetencionConstantesFunciones.CONIVAFACTURA);
		elementcon_iva_factura.appendChild(document.createTextNode(tablaretencion.getcon_iva_factura().toString().trim()));
		element.appendChild(elementcon_iva_factura);
	}
	
	public void generarReporteGroupGenericoTablaRetencionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TablaRetencion> tablaretencionsSeleccionados=new ArrayList<TablaRetencion>();
		
		tablaretencionsSeleccionados=this.getTablaRetencionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTablaRetencion(tablaretencionsSeleccionados);
		
		this.generarReporteTablaRetencions("Todos",tablaretencionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTablaRetencion(ArrayList<TablaRetencion> tablaretencionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TablaRetencion tablaretencionAux:tablaretencionsSeleccionados) {
				tablaretencionAux.setsDetalleGeneralEntityReporte(tablaretencionAux.toString());
			
				if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tablaretencionAux.setsDescripcionGeneralEntityReporte1(tablaretencionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tablaretencionAux.setsDescripcionGeneralEntityReporte1(tablaretencionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tablaretencionAux.setsDescripcionGeneralEntityReporte1(tablaretencionAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_IDTIPORETENCION)) {
					existe=true;
					tablaretencionAux.setsDescripcionGeneralEntityReporte1(tablaretencionAux.gettiporetencion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO)) {
					existe=true;
					tablaretencionAux.setsDescripcionGeneralEntityReporte1(tablaretencionAux.getcuentacontabledebito_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO)) {
					existe=true;
					tablaretencionAux.setsDescripcionGeneralEntityReporte1(tablaretencionAux.getcuentacontablecredito_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_ESDEBITO)) {
					existe=true;
					tablaretencionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tablaretencionAux.getes_debito()));
				}
				 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_ESRETENCIONFUENTE)) {
					existe=true;
					tablaretencionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tablaretencionAux.getes_retencion_fuente()));
				}
				 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_CONSECUENCIAL)) {
					existe=true;
					tablaretencionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tablaretencionAux.getcon_secuencial()));
				}
				 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_CONSUBTOTALFACTURA)) {
					existe=true;
					tablaretencionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tablaretencionAux.getcon_sub_total_factura()));
				}
				 else if(sTipoSeleccionar.equals(TablaRetencionConstantesFunciones.LABEL_CONIVAFACTURA)) {
					existe=true;
					tablaretencionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tablaretencionAux.getcon_iva_factura()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaRetencionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTablaRetencion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTablaRetencion=true;
				this.isVisibilidadCeldaNuevoRelacionesTablaRetencion=true;
				this.isVisibilidadCeldaGuardarCambiosTablaRetencion=true;
			}
			
			this.isVisibilidadCeldaModificarTablaRetencion=false;
			this.isVisibilidadCeldaActualizarTablaRetencion=false;
			this.isVisibilidadCeldaEliminarTablaRetencion=false;
			this.isVisibilidadCeldaCancelarTablaRetencion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTablaRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarTablaRetencion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTablaRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesTablaRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosTablaRetencion=false;
			this.isVisibilidadCeldaModificarTablaRetencion=false;
			this.isVisibilidadCeldaActualizarTablaRetencion=true;
			this.isVisibilidadCeldaEliminarTablaRetencion=false;
			this.isVisibilidadCeldaCancelarTablaRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTablaRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarTablaRetencion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTablaRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesTablaRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosTablaRetencion=false;
			this.isVisibilidadCeldaModificarTablaRetencion=false;
			this.isVisibilidadCeldaActualizarTablaRetencion=true;
			this.isVisibilidadCeldaEliminarTablaRetencion=true;
			this.isVisibilidadCeldaCancelarTablaRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTablaRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarTablaRetencion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTablaRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesTablaRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosTablaRetencion=false;
			this.isVisibilidadCeldaModificarTablaRetencion=false;
			this.isVisibilidadCeldaActualizarTablaRetencion=true;
			this.isVisibilidadCeldaEliminarTablaRetencion=false;
			this.isVisibilidadCeldaCancelarTablaRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTablaRetencion=false;
				} else {
					this.isVisibilidadCeldaGuardarTablaRetencion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTablaRetencion=true;
			this.isVisibilidadCeldaNuevoRelacionesTablaRetencion=true;
			this.isVisibilidadCeldaGuardarCambiosTablaRetencion=true;
			this.isVisibilidadCeldaModificarTablaRetencion=false;
			this.isVisibilidadCeldaActualizarTablaRetencion=false;
			this.isVisibilidadCeldaEliminarTablaRetencion=false;
			this.isVisibilidadCeldaCancelarTablaRetencion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTablaRetencion=true;
				} else {
					this.isVisibilidadCeldaGuardarTablaRetencion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTablaRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesTablaRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosTablaRetencion=false;
			this.isVisibilidadCeldaActualizarTablaRetencion=false;
			this.isVisibilidadCeldaEliminarTablaRetencion=false;
			this.isVisibilidadCeldaCancelarTablaRetencion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTablaRetencion=false;
				} else {
					this.isVisibilidadCeldaGuardarTablaRetencion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTablaRetencion=false;
			this.isVisibilidadCeldaNuevoRelacionesTablaRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosTablaRetencion=false;
			this.isVisibilidadCeldaModificarTablaRetencion=true;
			this.isVisibilidadCeldaActualizarTablaRetencion=false;
			this.isVisibilidadCeldaEliminarTablaRetencion=false;
			this.isVisibilidadCeldaCancelarTablaRetencion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTablaRetencion=false;
				} else {
					this.isVisibilidadCeldaGuardarTablaRetencion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TablaRetencionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTablaRetencion=true;
			this.isVisibilidadCeldaNuevoRelacionesTablaRetencion=true;
			this.isVisibilidadCeldaGuardarCambiosTablaRetencion=true;
		} else {
			this.actualizarEstadoPanelsTablaRetencion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTablaRetencion=false;
			//this.isVisibilidadCeldaVerFormTablaRetencion=false;
			this.isVisibilidadCeldaDuplicarTablaRetencion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tablaretencionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTablaRetencion=false;
		} else {
			this.isVisibilidadCeldaNuevoTablaRetencion=false;
			this.isVisibilidadCeldaGuardarCambiosTablaRetencion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tablaretencionSessionBean.getEsGuardarRelacionado()) {
			if(!tablaretencionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTablaRetencion=false;												
			}
			
			this.jButtonCerrarTablaRetencion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTablaRetencion=false;
		}
		
		if(!this.permiteMantenimiento(this.tablaretencion)) {
			this.isVisibilidadCeldaActualizarTablaRetencion=false;
			this.isVisibilidadCeldaEliminarTablaRetencion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTablaRetencion() {
	}
	
	public void actualizarEstadoPanelsTablaRetencion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTablaRetencion!=null) {
				this.jScrollPanelDatosEdicionTablaRetencion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaRetencion!=null) {
				this.jTabbedPaneBusquedasTablaRetencion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTablaRetencion!=null) {
				this.jScrollPanelDatosTablaRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTablaRetencion!=null) {
				this.jPanelPaginacionTablaRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTablaRetencion!=null) {
				this.jPanelParametrosReportesTablaRetencion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTablaRetencion!=null) {
				this.jScrollPanelDatosEdicionTablaRetencion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaRetencion!=null) {
				this.jTabbedPaneBusquedasTablaRetencion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTablaRetencion!=null) {
				this.jScrollPanelDatosTablaRetencion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTablaRetencion!=null) {
				this.jPanelPaginacionTablaRetencion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTablaRetencion!=null) {
				this.jPanelParametrosReportesTablaRetencion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTablaRetencion!=null) {
				this.jScrollPanelDatosEdicionTablaRetencion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaRetencion!=null) {
				this.jTabbedPaneBusquedasTablaRetencion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTablaRetencion!=null) {
				this.jScrollPanelDatosTablaRetencion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTablaRetencion!=null) {
				this.jPanelPaginacionTablaRetencion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTablaRetencion!=null) {
				this.jPanelParametrosReportesTablaRetencion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTablaRetencion!=null) {
				this.jScrollPanelDatosEdicionTablaRetencion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaRetencion!=null) {
				this.jTabbedPaneBusquedasTablaRetencion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTablaRetencion!=null) {
				this.jScrollPanelDatosTablaRetencion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTablaRetencion!=null) {
				this.jPanelPaginacionTablaRetencion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTablaRetencion!=null) {
				this.jPanelParametrosReportesTablaRetencion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTablaRetencion!=null) {
				this.jScrollPanelDatosEdicionTablaRetencion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaRetencion!=null) {
				this.jTabbedPaneBusquedasTablaRetencion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTablaRetencion!=null) {
				this.jScrollPanelDatosTablaRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTablaRetencion!=null) {
				this.jPanelPaginacionTablaRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTablaRetencion!=null) {
				this.jPanelParametrosReportesTablaRetencion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTablaRetencion!=null) {
				this.jScrollPanelDatosEdicionTablaRetencion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaRetencion!=null) {
				this.jTabbedPaneBusquedasTablaRetencion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTablaRetencion!=null) {
				this.jScrollPanelDatosTablaRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTablaRetencion!=null) {
				this.jPanelPaginacionTablaRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTablaRetencion!=null) {
				this.jPanelParametrosReportesTablaRetencion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTablaRetencion!=null) {
				this.jScrollPanelDatosEdicionTablaRetencion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaRetencion!=null) {
				this.jTabbedPaneBusquedasTablaRetencion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTablaRetencion!=null) {
				this.jScrollPanelDatosTablaRetencion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTablaRetencion!=null) {
				this.jPanelPaginacionTablaRetencion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTablaRetencion!=null) {
				this.jPanelParametrosReportesTablaRetencion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTablaRetencion!=null) {
					this.jTabbedPaneBusquedasTablaRetencion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTablaRetencion!=null) {
				this.jPanelParametrosReportesTablaRetencion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tablaretencionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaRetencion!=null) {
				this.jTabbedPaneBusquedasTablaRetencion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTablaRetencion!=null) {
				this.jPanelParametrosReportesTablaRetencion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTablaRetencion.remove(jPanelBusquedaPorCodigoTablaRetencion);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTablaRetencion.remove(jPanelBusquedaPorNombreTablaRetencion);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasTablaRetencion.remove(jPanelFK_IdCuentaContableCreditoTablaRetencion);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasTablaRetencion.remove(jPanelFK_IdCuentaContableDebitoTablaRetencion);}

			this.isVisibilidadFK_IdTipoRetencion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasTablaRetencion.remove(jPanelFK_IdTipoRetencionTablaRetencion);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoRetencion(Boolean isParaTipoRetencion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoRetencionNegation=!isParaTipoRetencion;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoRetencionNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTablaRetencion.remove(jPanelBusquedaPorCodigoTablaRetencion);}

			this.isVisibilidadBusquedaPorNombre=isParaTipoRetencionNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTablaRetencion.remove(jPanelBusquedaPorNombreTablaRetencion);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaTipoRetencionNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasTablaRetencion.remove(jPanelFK_IdCuentaContableCreditoTablaRetencion);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaTipoRetencionNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasTablaRetencion.remove(jPanelFK_IdCuentaContableDebitoTablaRetencion);}

			this.isVisibilidadFK_IdTipoRetencion=isParaTipoRetencion;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasTablaRetencion.remove(jPanelFK_IdTipoRetencionTablaRetencion);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableDebito(Boolean isParaCuentaContableDebito){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableDebitoNegation=!isParaCuentaContableDebito;

			this.isVisibilidadBusquedaPorCodigo=isParaCuentaContableDebitoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTablaRetencion.remove(jPanelBusquedaPorCodigoTablaRetencion);}

			this.isVisibilidadBusquedaPorNombre=isParaCuentaContableDebitoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTablaRetencion.remove(jPanelBusquedaPorNombreTablaRetencion);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaCuentaContableDebitoNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasTablaRetencion.remove(jPanelFK_IdCuentaContableCreditoTablaRetencion);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaCuentaContableDebito;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasTablaRetencion.remove(jPanelFK_IdCuentaContableDebitoTablaRetencion);}

			this.isVisibilidadFK_IdTipoRetencion=isParaCuentaContableDebitoNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasTablaRetencion.remove(jPanelFK_IdTipoRetencionTablaRetencion);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableCredito(Boolean isParaCuentaContableCredito){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableCreditoNegation=!isParaCuentaContableCredito;

			this.isVisibilidadBusquedaPorCodigo=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTablaRetencion.remove(jPanelBusquedaPorCodigoTablaRetencion);}

			this.isVisibilidadBusquedaPorNombre=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTablaRetencion.remove(jPanelBusquedaPorNombreTablaRetencion);}

			this.isVisibilidadFK_IdCuentaContableCredito=isParaCuentaContableCredito;
			if(!this.isVisibilidadFK_IdCuentaContableCredito) {this.jTabbedPaneBusquedasTablaRetencion.remove(jPanelFK_IdCuentaContableCreditoTablaRetencion);}

			this.isVisibilidadFK_IdCuentaContableDebito=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDebito) {this.jTabbedPaneBusquedasTablaRetencion.remove(jPanelFK_IdCuentaContableDebitoTablaRetencion);}

			this.isVisibilidadFK_IdTipoRetencion=isParaCuentaContableCreditoNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasTablaRetencion.remove(jPanelFK_IdTipoRetencionTablaRetencion);}
		}
		
	}
	
	
	
	

	public String registrarSesionTablaRetencionParaBusquedaCuentaContableDebitos() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(tablaretencionSessionBean==null) {
				tablaretencionSessionBean=new TablaRetencionSessionBean();
			}

			if(cuentacontabledebitoSessionBean==null) {
				cuentacontabledebitoSessionBean=new CuentaContableSessionBean();
			}

			cuentacontabledebitoSessionBean.setsPathNavegacionActual(tablaretencionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontabledebitoSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontabledebitoSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontabledebitoSessionBean.getisPaginaPopup();
			cuentacontabledebitoSessionBean.setisPaginaPopup(false);
			cuentacontabledebitoSessionBean.setEstaModoBusqueda(true);
			cuentacontabledebitoSessionBean.setsFuncionBusquedaRapida("window.opener.tablaretencionFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable_debito(TO_REPLACE);");
			cuentacontabledebitoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontabledebitoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(TablaRetencionConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionTablaRetencion(true);
			//cuentacontableSessionBean.setlidTablaRetencionActual(this.idTablaRetencionActual);

			tablaretencionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTablaRetencion(true);
			tablaretencionSessionBean.setlIdTablaRetencionActualForeignKey(this.idTablaRetencionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionTablaRetencionParaBusquedaCuentaContableCreditos() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(tablaretencionSessionBean==null) {
				tablaretencionSessionBean=new TablaRetencionSessionBean();
			}

			if(cuentacontablecreditoSessionBean==null) {
				cuentacontablecreditoSessionBean=new CuentaContableSessionBean();
			}

			cuentacontablecreditoSessionBean.setsPathNavegacionActual(tablaretencionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontablecreditoSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontablecreditoSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontablecreditoSessionBean.getisPaginaPopup();
			cuentacontablecreditoSessionBean.setisPaginaPopup(false);
			cuentacontablecreditoSessionBean.setEstaModoBusqueda(true);
			cuentacontablecreditoSessionBean.setsFuncionBusquedaRapida("window.opener.tablaretencionFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable_credito(TO_REPLACE);");
			cuentacontablecreditoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontablecreditoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(TablaRetencionConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionTablaRetencion(true);
			//cuentacontableSessionBean.setlidTablaRetencionActual(this.idTablaRetencionActual);

			tablaretencionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTablaRetencion(true);
			tablaretencionSessionBean.setlIdTablaRetencionActualForeignKey(this.idTablaRetencionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TablaRetencionSessionBean tablaretencionSessionBean=new TablaRetencionSessionBean();
		
		if(this.tablaretencionSessionBean==null) {
			this.tablaretencionSessionBean=new TablaRetencionSessionBean();
		}
		
		this.tablaretencionSessionBean.setsUltimaBusquedaTablaRetencion(this.getsAccionBusqueda());
		this.tablaretencionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tablaretencionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tablaretencionSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tablaretencionSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableCredito")) {
			tablaretencionSessionBean.setid_cuenta_contable_credito(this.getid_cuenta_contable_creditoFK_IdCuentaContableCredito());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableDebito")) {
			tablaretencionSessionBean.setid_cuenta_contable_debito(this.getid_cuenta_contable_debitoFK_IdCuentaContableDebito());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tablaretencionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoRetencion")) {
			tablaretencionSessionBean.setid_tipo_retencion(this.getid_tipo_retencionFK_IdTipoRetencion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TablaRetencionSessionBean tablaretencionSessionBean=new TablaRetencionSessionBean();
		
		if(this.tablaretencionSessionBean==null) {
			this.tablaretencionSessionBean=new TablaRetencionSessionBean();
		}
		
		if(this.tablaretencionSessionBean.getsUltimaBusquedaTablaRetencion()!=null&&!this.tablaretencionSessionBean.getsUltimaBusquedaTablaRetencion().equals("")) {
			this.setsAccionBusqueda(tablaretencionSessionBean.getsUltimaBusquedaTablaRetencion());
			this.setiNumeroPaginacion(tablaretencionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tablaretencionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tablaretencionSessionBean.getcodigo());
				tablaretencionSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tablaretencionSessionBean.getnombre());
				tablaretencionSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableCredito")) {
				this.setid_cuenta_contable_creditoFK_IdCuentaContableCredito(tablaretencionSessionBean.getid_cuenta_contable_credito());
				tablaretencionSessionBean.setid_cuenta_contable_credito(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableDebito")) {
				this.setid_cuenta_contable_debitoFK_IdCuentaContableDebito(tablaretencionSessionBean.getid_cuenta_contable_debito());
				tablaretencionSessionBean.setid_cuenta_contable_debito(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tablaretencionSessionBean.getid_empresa());
				tablaretencionSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoRetencion")) {
				this.setid_tipo_retencionFK_IdTipoRetencion(tablaretencionSessionBean.getid_tipo_retencion());
				tablaretencionSessionBean.setid_tipo_retencion(-1L);
			}
		}
		
		this.tablaretencionSessionBean.setsUltimaBusquedaTablaRetencion("");
		this.tablaretencionSessionBean.setiNumeroPaginacion(TablaRetencionConstantesFunciones.INUMEROPAGINACION);
		this.tablaretencionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTablaRetencion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTablaRetencion() {
		this.updateBorderResaltarBusquedasFormularioTablaRetencion();
		this.updateVisibilidadBusquedasFormularioTablaRetencion();
		this.updateHabilitarBusquedasFormularioTablaRetencion();
	}
	
	public void updateBorderResaltarBusquedasFormularioTablaRetencion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTablaRetencion.getComponents().length>0) {
	

		if(this.tablaretencionConstantesFunciones.resaltarBusquedaPorCodigoTablaRetencion!=null) {
			index= this.jTabbedPaneBusquedasTablaRetencion.indexOfComponent(this.jPanelBusquedaPorCodigoTablaRetencion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTablaRetencion.getComponent(index);
				jPanel.setBorder(this.tablaretencionConstantesFunciones.resaltarBusquedaPorCodigoTablaRetencion);
			}
		}

		if(this.tablaretencionConstantesFunciones.resaltarBusquedaPorNombreTablaRetencion!=null) {
			index= this.jTabbedPaneBusquedasTablaRetencion.indexOfComponent(this.jPanelBusquedaPorNombreTablaRetencion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTablaRetencion.getComponent(index);
				jPanel.setBorder(this.tablaretencionConstantesFunciones.resaltarBusquedaPorNombreTablaRetencion);
			}
		}

		if(this.tablaretencionConstantesFunciones.resaltarFK_IdCuentaContableCreditoTablaRetencion!=null) {
			index= this.jTabbedPaneBusquedasTablaRetencion.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoTablaRetencion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTablaRetencion.getComponent(index);
				jPanel.setBorder(this.tablaretencionConstantesFunciones.resaltarFK_IdCuentaContableCreditoTablaRetencion);
			}
		}

		if(this.tablaretencionConstantesFunciones.resaltarFK_IdCuentaContableDebitoTablaRetencion!=null) {
			index= this.jTabbedPaneBusquedasTablaRetencion.indexOfComponent(this.jPanelFK_IdCuentaContableDebitoTablaRetencion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTablaRetencion.getComponent(index);
				jPanel.setBorder(this.tablaretencionConstantesFunciones.resaltarFK_IdCuentaContableDebitoTablaRetencion);
			}
		}

		if(this.tablaretencionConstantesFunciones.resaltarFK_IdTipoRetencionTablaRetencion!=null) {
			index= this.jTabbedPaneBusquedasTablaRetencion.indexOfComponent(this.jPanelFK_IdTipoRetencionTablaRetencion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTablaRetencion.getComponent(index);
				jPanel.setBorder(this.tablaretencionConstantesFunciones.resaltarFK_IdTipoRetencionTablaRetencion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTablaRetencion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTablaRetencion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTablaRetencion.indexOfComponent(this.jPanelBusquedaPorCodigoTablaRetencion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTablaRetencion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tablaretencionConstantesFunciones.mostrarBusquedaPorCodigoTablaRetencion);
			if(!this.tablaretencionConstantesFunciones.mostrarBusquedaPorCodigoTablaRetencion && index>-1) {
				this.jTabbedPaneBusquedasTablaRetencion.remove(index);
			}

			index= this.jTabbedPaneBusquedasTablaRetencion.indexOfComponent(this.jPanelBusquedaPorNombreTablaRetencion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTablaRetencion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tablaretencionConstantesFunciones.mostrarBusquedaPorNombreTablaRetencion);
			if(!this.tablaretencionConstantesFunciones.mostrarBusquedaPorNombreTablaRetencion && index>-1) {
				this.jTabbedPaneBusquedasTablaRetencion.remove(index);
			}

			index= this.jTabbedPaneBusquedasTablaRetencion.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoTablaRetencion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTablaRetencion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tablaretencionConstantesFunciones.mostrarFK_IdCuentaContableCreditoTablaRetencion);
			if(!this.tablaretencionConstantesFunciones.mostrarFK_IdCuentaContableCreditoTablaRetencion && index>-1) {
				this.jTabbedPaneBusquedasTablaRetencion.remove(index);
			}

			index= this.jTabbedPaneBusquedasTablaRetencion.indexOfComponent(this.jPanelFK_IdCuentaContableDebitoTablaRetencion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTablaRetencion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tablaretencionConstantesFunciones.mostrarFK_IdCuentaContableDebitoTablaRetencion);
			if(!this.tablaretencionConstantesFunciones.mostrarFK_IdCuentaContableDebitoTablaRetencion && index>-1) {
				this.jTabbedPaneBusquedasTablaRetencion.remove(index);
			}

			index= this.jTabbedPaneBusquedasTablaRetencion.indexOfComponent(this.jPanelFK_IdTipoRetencionTablaRetencion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTablaRetencion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tablaretencionConstantesFunciones.mostrarFK_IdTipoRetencionTablaRetencion);
			if(!this.tablaretencionConstantesFunciones.mostrarFK_IdTipoRetencionTablaRetencion && index>-1) {
				this.jTabbedPaneBusquedasTablaRetencion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTablaRetencion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTablaRetencion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTablaRetencion.indexOfComponent(this.jPanelBusquedaPorCodigoTablaRetencion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTablaRetencion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tablaretencionConstantesFunciones.activarBusquedaPorCodigoTablaRetencion);
				this.jTabbedPaneBusquedasTablaRetencion.setEnabledAt(index,this.tablaretencionConstantesFunciones.activarBusquedaPorCodigoTablaRetencion);
			}

			index= this.jTabbedPaneBusquedasTablaRetencion.indexOfComponent(this.jPanelBusquedaPorNombreTablaRetencion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTablaRetencion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tablaretencionConstantesFunciones.activarBusquedaPorNombreTablaRetencion);
				this.jTabbedPaneBusquedasTablaRetencion.setEnabledAt(index,this.tablaretencionConstantesFunciones.activarBusquedaPorNombreTablaRetencion);
			}

			index= this.jTabbedPaneBusquedasTablaRetencion.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoTablaRetencion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTablaRetencion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tablaretencionConstantesFunciones.activarFK_IdCuentaContableCreditoTablaRetencion);
				this.jTabbedPaneBusquedasTablaRetencion.setEnabledAt(index,this.tablaretencionConstantesFunciones.activarFK_IdCuentaContableCreditoTablaRetencion);
			}

			index= this.jTabbedPaneBusquedasTablaRetencion.indexOfComponent(this.jPanelFK_IdCuentaContableDebitoTablaRetencion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTablaRetencion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tablaretencionConstantesFunciones.activarFK_IdCuentaContableDebitoTablaRetencion);
				this.jTabbedPaneBusquedasTablaRetencion.setEnabledAt(index,this.tablaretencionConstantesFunciones.activarFK_IdCuentaContableDebitoTablaRetencion);
			}

			index= this.jTabbedPaneBusquedasTablaRetencion.indexOfComponent(this.jPanelFK_IdTipoRetencionTablaRetencion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTablaRetencion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tablaretencionConstantesFunciones.activarFK_IdTipoRetencionTablaRetencion);
				this.jTabbedPaneBusquedasTablaRetencion.setEnabledAt(index,this.tablaretencionConstantesFunciones.activarFK_IdTipoRetencionTablaRetencion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTablaRetencion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTablaRetencion.indexOfComponent(this.jPanelBusquedaPorCodigoTablaRetencion);

			this.jTabbedPaneBusquedasTablaRetencion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTablaRetencion.getComponent(index);

			this.tablaretencionConstantesFunciones.setResaltarBusquedaPorCodigoTablaRetencion(resaltar);

			jPanel.setBorder(this.tablaretencionConstantesFunciones.resaltarBusquedaPorCodigoTablaRetencion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTablaRetencion.indexOfComponent(this.jPanelBusquedaPorNombreTablaRetencion);

			this.jTabbedPaneBusquedasTablaRetencion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTablaRetencion.getComponent(index);

			this.tablaretencionConstantesFunciones.setResaltarBusquedaPorNombreTablaRetencion(resaltar);

			jPanel.setBorder(this.tablaretencionConstantesFunciones.resaltarBusquedaPorNombreTablaRetencion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContableCredito")) {
			index= this.jTabbedPaneBusquedasTablaRetencion.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoTablaRetencion);

			this.jTabbedPaneBusquedasTablaRetencion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTablaRetencion.getComponent(index);

			this.tablaretencionConstantesFunciones.setResaltarFK_IdCuentaContableCreditoTablaRetencion(resaltar);

			jPanel.setBorder(this.tablaretencionConstantesFunciones.resaltarFK_IdCuentaContableCreditoTablaRetencion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContableDebito")) {
			index= this.jTabbedPaneBusquedasTablaRetencion.indexOfComponent(this.jPanelFK_IdCuentaContableDebitoTablaRetencion);

			this.jTabbedPaneBusquedasTablaRetencion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTablaRetencion.getComponent(index);

			this.tablaretencionConstantesFunciones.setResaltarFK_IdCuentaContableDebitoTablaRetencion(resaltar);

			jPanel.setBorder(this.tablaretencionConstantesFunciones.resaltarFK_IdCuentaContableDebitoTablaRetencion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoRetencion")) {
			index= this.jTabbedPaneBusquedasTablaRetencion.indexOfComponent(this.jPanelFK_IdTipoRetencionTablaRetencion);

			this.jTabbedPaneBusquedasTablaRetencion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTablaRetencion.getComponent(index);

			this.tablaretencionConstantesFunciones.setResaltarFK_IdTipoRetencionTablaRetencion(resaltar);

			jPanel.setBorder(this.tablaretencionConstantesFunciones.resaltarFK_IdTipoRetencionTablaRetencion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTablaRetencion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTablaRetencion() throws Exception {

		if(this.jInternalFrameDetalleFormTablaRetencion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTablaRetencion();
		this.updateVisibilidadResaltarControlesFormularioTablaRetencion();
		this.updateHabilitarResaltarControlesFormularioTablaRetencion();
		
	}
	
	public void updateBorderResaltarControlesFormularioTablaRetencion() throws Exception {
		if(this.jInternalFrameDetalleFormTablaRetencion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tablaretencionConstantesFunciones.resaltaridTablaRetencion!=null && this.jInternalFrameDetalleFormTablaRetencion!=null) {this.jInternalFrameDetalleFormTablaRetencion.jLabelidTablaRetencion.setBorder(this.tablaretencionConstantesFunciones.resaltaridTablaRetencion);}
		if(this.tablaretencionConstantesFunciones.resaltarid_empresaTablaRetencion!=null && this.jInternalFrameDetalleFormTablaRetencion!=null) {this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_empresaTablaRetencion.setBorder(this.tablaretencionConstantesFunciones.resaltarid_empresaTablaRetencion);}
		if(this.tablaretencionConstantesFunciones.resaltarcodigoTablaRetencion!=null && this.jInternalFrameDetalleFormTablaRetencion!=null) {this.jInternalFrameDetalleFormTablaRetencion.jTextFieldcodigoTablaRetencion.setBorder(this.tablaretencionConstantesFunciones.resaltarcodigoTablaRetencion);}
		if(this.tablaretencionConstantesFunciones.resaltarnombreTablaRetencion!=null && this.jInternalFrameDetalleFormTablaRetencion!=null) {this.jInternalFrameDetalleFormTablaRetencion.jTextAreanombreTablaRetencion.setBorder(this.tablaretencionConstantesFunciones.resaltarnombreTablaRetencion);}
		if(this.tablaretencionConstantesFunciones.resaltarporcentajeTablaRetencion!=null && this.jInternalFrameDetalleFormTablaRetencion!=null) {this.jInternalFrameDetalleFormTablaRetencion.jTextFieldporcentajeTablaRetencion.setBorder(this.tablaretencionConstantesFunciones.resaltarporcentajeTablaRetencion);}
		if(this.tablaretencionConstantesFunciones.resaltarmonto_minimoTablaRetencion!=null && this.jInternalFrameDetalleFormTablaRetencion!=null) {this.jInternalFrameDetalleFormTablaRetencion.jTextFieldmonto_minimoTablaRetencion.setBorder(this.tablaretencionConstantesFunciones.resaltarmonto_minimoTablaRetencion);}
		if(this.tablaretencionConstantesFunciones.resaltarid_tipo_retencionTablaRetencion!=null && this.jInternalFrameDetalleFormTablaRetencion!=null) {this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_tipo_retencionTablaRetencion.setBorder(this.tablaretencionConstantesFunciones.resaltarid_tipo_retencionTablaRetencion);}
		if(this.tablaretencionConstantesFunciones.resaltarid_cuenta_contable_debitoTablaRetencion!=null && this.jInternalFrameDetalleFormTablaRetencion!=null) {this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_debitoTablaRetencion.setBorder(this.tablaretencionConstantesFunciones.resaltarid_cuenta_contable_debitoTablaRetencion);}
		if(this.tablaretencionConstantesFunciones.resaltarid_cuenta_contable_creditoTablaRetencion!=null && this.jInternalFrameDetalleFormTablaRetencion!=null) {this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_creditoTablaRetencion.setBorder(this.tablaretencionConstantesFunciones.resaltarid_cuenta_contable_creditoTablaRetencion);}
		if(this.tablaretencionConstantesFunciones.resaltares_debitoTablaRetencion!=null && this.jInternalFrameDetalleFormTablaRetencion!=null) {this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxes_debitoTablaRetencion.setBorderPainted(true);this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxes_debitoTablaRetencion.setBorder(this.tablaretencionConstantesFunciones.resaltares_debitoTablaRetencion);}
		if(this.tablaretencionConstantesFunciones.resaltares_retencion_fuenteTablaRetencion!=null && this.jInternalFrameDetalleFormTablaRetencion!=null) {this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxes_retencion_fuenteTablaRetencion.setBorderPainted(true);this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxes_retencion_fuenteTablaRetencion.setBorder(this.tablaretencionConstantesFunciones.resaltares_retencion_fuenteTablaRetencion);}
		if(this.tablaretencionConstantesFunciones.resaltarcon_secuencialTablaRetencion!=null && this.jInternalFrameDetalleFormTablaRetencion!=null) {this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_secuencialTablaRetencion.setBorderPainted(true);this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_secuencialTablaRetencion.setBorder(this.tablaretencionConstantesFunciones.resaltarcon_secuencialTablaRetencion);}
		if(this.tablaretencionConstantesFunciones.resaltarcon_sub_total_facturaTablaRetencion!=null && this.jInternalFrameDetalleFormTablaRetencion!=null) {this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_sub_total_facturaTablaRetencion.setBorderPainted(true);this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_sub_total_facturaTablaRetencion.setBorder(this.tablaretencionConstantesFunciones.resaltarcon_sub_total_facturaTablaRetencion);}
		if(this.tablaretencionConstantesFunciones.resaltarcon_iva_facturaTablaRetencion!=null && this.jInternalFrameDetalleFormTablaRetencion!=null) {this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_iva_facturaTablaRetencion.setBorderPainted(true);this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_iva_facturaTablaRetencion.setBorder(this.tablaretencionConstantesFunciones.resaltarcon_iva_facturaTablaRetencion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTablaRetencion() throws Exception {		
		if(this.jInternalFrameDetalleFormTablaRetencion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
	
		//this.jInternalFrameDetalleFormTablaRetencion.jLabelidTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostraridTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jPanelidTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostraridTablaRetencion);
		//this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_empresaTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarid_empresaTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jPanelid_empresaTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarid_empresaTablaRetencion);
		//this.jInternalFrameDetalleFormTablaRetencion.jTextFieldcodigoTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarcodigoTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jPanelcodigoTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarcodigoTablaRetencion);
		//this.jInternalFrameDetalleFormTablaRetencion.jTextAreanombreTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarnombreTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jPanelnombreTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarnombreTablaRetencion);
		//this.jInternalFrameDetalleFormTablaRetencion.jTextFieldporcentajeTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarporcentajeTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jPanelporcentajeTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarporcentajeTablaRetencion);
		//this.jInternalFrameDetalleFormTablaRetencion.jTextFieldmonto_minimoTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarmonto_minimoTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jPanelmonto_minimoTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarmonto_minimoTablaRetencion);
		//this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_tipo_retencionTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarid_tipo_retencionTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jPanelid_tipo_retencionTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarid_tipo_retencionTablaRetencion);
		//this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_debitoTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarid_cuenta_contable_debitoTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jPanelid_cuenta_contable_debitoTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarid_cuenta_contable_debitoTablaRetencion);
			this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_debitoTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarid_cuenta_contable_debitoTablaRetencion);
		//this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_creditoTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarid_cuenta_contable_creditoTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jPanelid_cuenta_contable_creditoTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarid_cuenta_contable_creditoTablaRetencion);
			this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_creditoTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarid_cuenta_contable_creditoTablaRetencion);
		//this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxes_debitoTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrares_debitoTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jPaneles_debitoTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrares_debitoTablaRetencion);
		//this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxes_retencion_fuenteTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrares_retencion_fuenteTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jPaneles_retencion_fuenteTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrares_retencion_fuenteTablaRetencion);
		//this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_secuencialTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarcon_secuencialTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jPanelcon_secuencialTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarcon_secuencialTablaRetencion);
		//this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_sub_total_facturaTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarcon_sub_total_facturaTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jPanelcon_sub_total_facturaTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarcon_sub_total_facturaTablaRetencion);
		//this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_iva_facturaTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarcon_iva_facturaTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jPanelcon_iva_facturaTablaRetencion.setVisible(this.tablaretencionConstantesFunciones.mostrarcon_iva_facturaTablaRetencion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTablaRetencion() throws Exception {
		if(this.jInternalFrameDetalleFormTablaRetencion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTablaRetencion!=null) {
	
		this.jInternalFrameDetalleFormTablaRetencion.jLabelidTablaRetencion.setEnabled(this.tablaretencionConstantesFunciones.activaridTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_empresaTablaRetencion.setEnabled(this.tablaretencionConstantesFunciones.activarid_empresaTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jTextFieldcodigoTablaRetencion.setEnabled(this.tablaretencionConstantesFunciones.activarcodigoTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jTextAreanombreTablaRetencion.setEnabled(this.tablaretencionConstantesFunciones.activarnombreTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jTextFieldporcentajeTablaRetencion.setEnabled(this.tablaretencionConstantesFunciones.activarporcentajeTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jTextFieldmonto_minimoTablaRetencion.setEnabled(this.tablaretencionConstantesFunciones.activarmonto_minimoTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_tipo_retencionTablaRetencion.setEnabled(this.tablaretencionConstantesFunciones.activarid_tipo_retencionTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_debitoTablaRetencion.setEnabled(this.tablaretencionConstantesFunciones.activarid_cuenta_contable_debitoTablaRetencion);
			this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_debitoTablaRetencion.setEnabled(this.tablaretencionConstantesFunciones.activarid_cuenta_contable_debitoTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jComboBoxid_cuenta_contable_creditoTablaRetencion.setEnabled(this.tablaretencionConstantesFunciones.activarid_cuenta_contable_creditoTablaRetencion);
			this.jInternalFrameDetalleFormTablaRetencion.jButtonid_cuenta_contable_creditoTablaRetencion.setEnabled(this.tablaretencionConstantesFunciones.activarid_cuenta_contable_creditoTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxes_debitoTablaRetencion.setEnabled(this.tablaretencionConstantesFunciones.activares_debitoTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxes_retencion_fuenteTablaRetencion.setEnabled(this.tablaretencionConstantesFunciones.activares_retencion_fuenteTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_secuencialTablaRetencion.setEnabled(this.tablaretencionConstantesFunciones.activarcon_secuencialTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_sub_total_facturaTablaRetencion.setEnabled(this.tablaretencionConstantesFunciones.activarcon_sub_total_facturaTablaRetencion);
		this.jInternalFrameDetalleFormTablaRetencion.jCheckBoxcon_iva_facturaTablaRetencion.setEnabled(this.tablaretencionConstantesFunciones.activarcon_iva_facturaTablaRetencion);
		}
	}
	
		
}