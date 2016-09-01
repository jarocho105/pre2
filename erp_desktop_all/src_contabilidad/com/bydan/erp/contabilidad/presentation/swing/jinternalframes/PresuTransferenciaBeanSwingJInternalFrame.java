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

import com.bydan.erp.contabilidad.util.PresuTransferenciaConstantesFunciones;
import com.bydan.erp.contabilidad.util.PresuTransferenciaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.PresuTransferenciaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.PresuTransferenciaBean;
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

import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class PresuTransferenciaBeanSwingJInternalFrame extends PresuTransferenciaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PresuTransferenciaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PresuTransferencia> presutransferenciaValidator = new ClassValidator<PresuTransferencia>(PresuTransferencia.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PresuTransferencia presutransferencia;	
	public PresuTransferencia presutransferenciaAux;
	public PresuTransferencia presutransferenciaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PresuTransferencia presutransferenciaTotales;
	public Long idPresuTransferenciaActual;
	public Long iIdNuevoPresuTransferencia=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboPresuProyecto="";

	public List<PresuProyecto> presuproyectosForeignKey;

	public List<PresuProyecto> getpresuproyectosForeignKey() {
		return presuproyectosForeignKey;
	}

	public void setpresuproyectosForeignKey(List<PresuProyecto> presuproyectosForeignKey) {
		this.presuproyectosForeignKey = presuproyectosForeignKey;
	}

	//OBJETO FK ACTUAL
	public PresuProyecto presuproyectoForeignKey;

	public PresuProyecto getpresuproyectoForeignKey() {
		return presuproyectoForeignKey;
	}

	public void setpresuproyectoForeignKey(PresuProyecto presuproyectoForeignKey) {
		this.presuproyectoForeignKey = presuproyectoForeignKey;
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

	public String sFinalQueryComboCuentaContableDestino="";

	public List<CuentaContable> cuentacontabledestinosForeignKey;

	public List<CuentaContable> getcuentacontabledestinosForeignKey() {
		return cuentacontabledestinosForeignKey;
	}

	public void setcuentacontabledestinosForeignKey(List<CuentaContable> cuentacontabledestinosForeignKey) {
		this.cuentacontabledestinosForeignKey = cuentacontabledestinosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontabledestinoForeignKey;

	public CuentaContable getcuentacontabledestinoForeignKey() {
		return cuentacontabledestinoForeignKey;
	}

	public void setcuentacontabledestinoForeignKey(CuentaContable cuentacontabledestinoForeignKey) {
		this.cuentacontabledestinoForeignKey = cuentacontabledestinoForeignKey;
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
	public Long idCuentaContableActual=0L;

	public Long getidCuentaContableActual() {
		return idCuentaContableActual;
	}

	public void setidCuentaContableActual(Long idCuentaContableActual) {
		this.idCuentaContableActual= idCuentaContableActual;
	}
	public Long idCuentaContableDestinoActual=0L;

	public Long getidCuentaContableDestinoActual() {
		return idCuentaContableDestinoActual;
	}

	public void setidCuentaContableDestinoActual(Long idCuentaContableDestinoActual) {
		this.idCuentaContableDestinoActual= idCuentaContableDestinoActual;
	}
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
	
	public Boolean isPermisoTodoPresuTransferencia;
	public Boolean isPermisoNuevoPresuTransferencia;
	public Boolean isPermisoActualizarPresuTransferencia;
	public Boolean isPermisoActualizarOriginalPresuTransferencia;
	public Boolean isPermisoEliminarPresuTransferencia;
	public Boolean isPermisoGuardarCambiosPresuTransferencia;
	public Boolean isPermisoConsultaPresuTransferencia;
	public Boolean isPermisoBusquedaPresuTransferencia;
	public Boolean isPermisoReportePresuTransferencia;
	public Boolean isPermisoPaginacionMedioPresuTransferencia;
	public Boolean isPermisoPaginacionAltoPresuTransferencia;
	public Boolean isPermisoPaginacionTodoPresuTransferencia;
	public Boolean isPermisoCopiarPresuTransferencia;
	public Boolean isPermisoVerFormPresuTransferencia;
	public Boolean isPermisoDuplicarPresuTransferencia;
	public Boolean isPermisoOrdenPresuTransferencia;
	
	
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
	
	public PresuTransferenciaParameterReturnGeneral presutransferenciaReturnGeneral;
	public PresuTransferenciaParameterReturnGeneral presutransferenciaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPresuTransferencia=false;
	public Boolean esParaAccionDesdeFormularioPresuTransferencia=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PresuTransferenciaSessionBeanAdditional presutransferenciaSessionBeanAdditional=null;
	
	public PresuTransferenciaSessionBeanAdditional getPresuTransferenciaSessionBeanAdditional() {
		return this.presutransferenciaSessionBeanAdditional;
	}
	
	public void setPresuTransferenciaSessionBeanAdditional(PresuTransferenciaSessionBeanAdditional presutransferenciaSessionBeanAdditional) {
		try {
			this.presutransferenciaSessionBeanAdditional=presutransferenciaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PresuTransferenciaBeanSwingJInternalFrameAdditional presutransferenciaBeanSwingJInternalFrameAdditional=null;
	//public class PresuTransferenciaBeanSwingJInternalFrame
	
	public PresuTransferenciaBeanSwingJInternalFrameAdditional getPresuTransferenciaBeanSwingJInternalFrameAdditional() {
		return this.presutransferenciaBeanSwingJInternalFrameAdditional;
	}
	
	public void setPresuTransferenciaBeanSwingJInternalFrameAdditional(PresuTransferenciaBeanSwingJInternalFrameAdditional presutransferenciaBeanSwingJInternalFrameAdditional) {
		try {
			this.presutransferenciaBeanSwingJInternalFrameAdditional=presutransferenciaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PresuTransferenciaLogic presutransferenciaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PresuTransferencia presutransferenciaBean;
	public PresuTransferenciaConstantesFunciones presutransferenciaConstantesFunciones;
	//public PresuTransferenciaParameterReturnGeneral presutransferenciaReturnGeneral;
	
	//FK
	
	public PresuProyectoLogic presuproyectoLogic;
	public CuentaContableLogic cuentacontableLogic;
	public CuentaContableLogic cuentacontabledestinoLogic;
	public EmpleadoLogic empleadoLogic;
	
	//PARAMETROS
	
	
	//public List<PresuTransferencia> presutransferencias;	
	//public List<PresuTransferencia> presutransferenciasEliminados;
	//public List<PresuTransferencia> presutransferenciasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPresuTransferencia=false;
	public Boolean isVisibilidadCeldaDuplicarPresuTransferencia=true;
	public Boolean isVisibilidadCeldaCopiarPresuTransferencia=true;
	public Boolean isVisibilidadCeldaVerFormPresuTransferencia=true;
	public Boolean isVisibilidadCeldaOrdenPresuTransferencia=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPresuTransferencia=false;
	public Boolean isVisibilidadCeldaModificarPresuTransferencia=false;
	public Boolean isVisibilidadCeldaActualizarPresuTransferencia=false;
	public Boolean isVisibilidadCeldaEliminarPresuTransferencia=false;
	public Boolean isVisibilidadCeldaCancelarPresuTransferencia=false;
	public Boolean isVisibilidadCeldaGuardarPresuTransferencia=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPresuTransferencia=false;	
	
	
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdCuentaContableDestino=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdPresuProyecto=false;
	
	public Long getiIdNuevoPresuTransferencia() {
		return this.iIdNuevoPresuTransferencia;
	}

	public void setiIdNuevoPresuTransferencia(Long iIdNuevoPresuTransferencia) {
		this.iIdNuevoPresuTransferencia = iIdNuevoPresuTransferencia;
	}
	
	public Long getidPresuTransferenciaActual() {
		return this.idPresuTransferenciaActual;
	}

	public void setidPresuTransferenciaActual(Long idPresuTransferenciaActual) {
		this.idPresuTransferenciaActual = idPresuTransferenciaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PresuTransferencia getpresutransferencia() {
		return this.presutransferencia;
	}

	public void setpresutransferencia(PresuTransferencia presutransferencia) {
		this.presutransferencia = presutransferencia;
	}
	
	public PresuTransferencia getpresutransferenciaAux() {
		return this.presutransferenciaAux;
	}

	public void setpresutransferenciaAux(PresuTransferencia presutransferenciaAux) {
		this.presutransferenciaAux = presutransferenciaAux;
	}				
	
	public PresuTransferencia getpresutransferenciaAnterior() {
		return this.presutransferenciaAnterior;
	}

	public void setpresutransferenciaAnterior(PresuTransferencia presutransferenciaAnterior) {
		this.presutransferenciaAnterior = presutransferenciaAnterior;
	}	
	
	public PresuTransferencia getpresutransferenciaTotales() {
		return this.presutransferenciaTotales;
	}

	public void setpresutransferenciaTotales(PresuTransferencia presutransferenciaTotales) {
		this.presutransferenciaTotales = presutransferenciaTotales;
	}	
	
	public PresuTransferencia getpresutransferenciaBean() {
		return this.presutransferenciaBean;
	}

	public void setpresutransferenciaBean(PresuTransferencia presutransferenciaBean) {
		this.presutransferenciaBean = presutransferenciaBean;
	}	
	
	public PresuTransferenciaParameterReturnGeneral getpresutransferenciaReturnGeneral() {
		return this.presutransferenciaReturnGeneral;
	}

	public void setpresutransferenciaReturnGeneral(PresuTransferenciaParameterReturnGeneral presutransferenciaReturnGeneral) {
		this.presutransferenciaReturnGeneral = presutransferenciaReturnGeneral;
	}	
	
	
	public Long id_cuenta_contableFK_IdCuentaContable=-1L;

	public Long getid_cuenta_contableFK_IdCuentaContable() {
		return this.id_cuenta_contableFK_IdCuentaContable;
	}

	public void setid_cuenta_contableFK_IdCuentaContable(Long id_cuenta_contableFK_IdCuentaContable) {
		this.id_cuenta_contableFK_IdCuentaContable = id_cuenta_contableFK_IdCuentaContable;
	}

	public Long id_cuenta_contable_destinoFK_IdCuentaContableDestino=-1L;

	public Long getid_cuenta_contable_destinoFK_IdCuentaContableDestino() {
		return this.id_cuenta_contable_destinoFK_IdCuentaContableDestino;
	}

	public void setid_cuenta_contable_destinoFK_IdCuentaContableDestino(Long id_cuenta_contable_destinoFK_IdCuentaContableDestino) {
		this.id_cuenta_contable_destinoFK_IdCuentaContableDestino = id_cuenta_contable_destinoFK_IdCuentaContableDestino;
	}

	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
	}

	public Long id_presu_proyectoFK_IdPresuProyecto=-1L;

	public Long getid_presu_proyectoFK_IdPresuProyecto() {
		return this.id_presu_proyectoFK_IdPresuProyecto;
	}

	public void setid_presu_proyectoFK_IdPresuProyecto(Long id_presu_proyectoFK_IdPresuProyecto) {
		this.id_presu_proyectoFK_IdPresuProyecto = id_presu_proyectoFK_IdPresuProyecto;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PresuTransferenciaLogic getPresuTransferenciaLogic()	{		
		return presutransferenciaLogic;
	}

	public void setPresuTransferenciaLogic(PresuTransferenciaLogic presutransferenciaLogic) {
		this.presutransferenciaLogic = presutransferenciaLogic;
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
	
	public Boolean getIsEsNuevoPresuTransferencia() {
		return isEsNuevoPresuTransferencia;
	}

	public void setIsEsNuevoPresuTransferencia(Boolean isEsNuevoPresuTransferencia) {
		this.isEsNuevoPresuTransferencia = isEsNuevoPresuTransferencia;
	}

	public Boolean getEsParaAccionDesdeFormularioPresuTransferencia() {
		return esParaAccionDesdeFormularioPresuTransferencia;
	}
	
	public void setEsParaAccionDesdeFormularioPresuTransferencia(Boolean esParaAccionDesdeFormularioPresuTransferencia) {
		this.esParaAccionDesdeFormularioPresuTransferencia = esParaAccionDesdeFormularioPresuTransferencia;
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
	
	
	public void cargarCombosPresuProyectosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.presuproyectosForeignKey=new ArrayList<PresuProyecto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PresuProyectoLogic presuproyectoLogic=new PresuProyectoLogic();

			presuproyectoLogic.getPresuProyectoDataAccess().setIsForForeingKeyData(true);

			if(this.presutransferenciaSessionBean==null) {
				this.presutransferenciaSessionBean=new PresuTransferenciaSessionBean();
			}

			if(!this.presutransferenciaSessionBean.getisBusquedaDesdeForeignKeySesionPresuProyecto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectoLogic.getPresuProyectoDataAccess().setIsForForeingKeyData(true);

					presuproyectoLogic.getTodosPresuProyectosWithConnection(sFinalQuery,new Pagination());

					this.presuproyectosForeignKey=presuproyectoLogic.getPresuProyectos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPresuProyecto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuproyectoLogic.getEntityWithConnection(presutransferenciaSessionBean.getlidPresuProyectoActual());
					this.presuproyectosForeignKey.add(presuproyectoLogic.getPresuProyecto());
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

			cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.presutransferenciaSessionBean==null) {
				this.presutransferenciaSessionBean=new PresuTransferenciaSessionBean();
			}

			if(!this.presutransferenciaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

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
					cuentacontableLogic.getEntityWithConnection(presutransferenciaSessionBean.getlidCuentaContableActual());
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

	public void cargarCombosCuentaContableDestinosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontabledestinosForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.presutransferenciaSessionBean==null) {
				this.presutransferenciaSessionBean=new PresuTransferenciaSessionBean();
			}

			if(!this.presutransferenciaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDestino()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontabledestinoLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontabledestinosForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContableDestino(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(presutransferenciaSessionBean.getlidCuentaContableDestinoActual());
					this.cuentacontabledestinosForeignKey.add(cuentacontableLogic.getCuentaContable());
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

			empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.presutransferenciaSessionBean==null) {
				this.presutransferenciaSessionBean=new PresuTransferenciaSessionBean();
			}

			if(!this.presutransferenciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

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
					empleadoLogic.getEntityWithConnection(presutransferenciaSessionBean.getlidEmpleadoActual());
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

	
	
	public void setActualPresuProyectoForeignKey(Long idPresuProyectoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			PresuProyecto  presuproyectoTemp=null;

			for(PresuProyecto presuproyectoAux:presuproyectosForeignKey) {
				if(presuproyectoAux.getId()!=null && presuproyectoAux.getId().equals(idPresuProyectoSeleccionado)) {
					presuproyectoTemp=presuproyectoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(presuproyectoTemp!=null) {

					if(this.presutransferencia!=null) {
						this.presutransferencia.setPresuProyecto(presuproyectoTemp);
					}

					if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
						this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_presu_proyectoPresuTransferencia.setSelectedItem(presuproyectoTemp);
					}
				} else {
					//jComboBoxid_presu_proyectoPresuTransferencia.setSelectedItem(presuproyectoTemp);
					if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
						if(this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_presu_proyectoPresuTransferencia.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_presu_proyectoPresuTransferencia.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPresuProyecto") || sFormularioTipoBusqueda.equals("Todos")){
					if(presuproyectoTemp!=null && jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuTransferencia!=null) {
						jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuTransferencia.setSelectedItem(presuproyectoTemp);
					} else {
						if(jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuTransferencia!=null) {
							//jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuTransferencia.setSelectedItem(presuproyectoTemp);
							if(jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuTransferencia.getItemCount()>0) {
								jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuTransferencia.setSelectedIndex(0);
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

	public String getActualPresuProyectoForeignKeyDescripcion(Long idPresuProyectoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			PresuProyecto  presuproyectoTemp=null;

			for(PresuProyecto presuproyectoAux:presuproyectosForeignKey) {
				if(presuproyectoAux.getId()!=null && presuproyectoAux.getId().equals(idPresuProyectoSeleccionado)) {
					presuproyectoTemp=presuproyectoAux;
					break;
				}
			}


			sDescripcion=PresuProyectoConstantesFunciones.getPresuProyectoDescripcion(presuproyectoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPresuProyectoForeignKeyGenerico(Long idPresuProyectoSeleccionado,JComboBox jComboBoxid_presu_proyectoPresuTransferenciaGenerico)throws Exception
	{
		try
		{
			PresuProyecto  presuproyectoTemp=null;

			for(PresuProyecto presuproyectoAux:presuproyectosForeignKey) {
				if(presuproyectoAux.getId()!=null && presuproyectoAux.getId().equals(idPresuProyectoSeleccionado)) {
					presuproyectoTemp=presuproyectoAux;
					break;
				}
			}

			if(presuproyectoTemp!=null) {
				jComboBoxid_presu_proyectoPresuTransferenciaGenerico.setSelectedItem(presuproyectoTemp);
			} else {
				if(jComboBoxid_presu_proyectoPresuTransferenciaGenerico!=null && jComboBoxid_presu_proyectoPresuTransferenciaGenerico.getItemCount()>0) {
					jComboBoxid_presu_proyectoPresuTransferenciaGenerico.setSelectedIndex(0);
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

					if(this.presutransferencia!=null) {
						this.presutransferencia.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
						this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contablePresuTransferencia.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contablePresuTransferencia.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
						if(this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contablePresuTransferencia.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contablePresuTransferencia.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContablePresuTransferencia!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContablePresuTransferencia.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContablePresuTransferencia!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContablePresuTransferencia.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContablePresuTransferencia.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContablePresuTransferencia.setSelectedIndex(0);
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
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contablePresuTransferenciaGenerico)throws Exception
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
				jComboBoxid_cuenta_contablePresuTransferenciaGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contablePresuTransferenciaGenerico!=null && jComboBoxid_cuenta_contablePresuTransferenciaGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contablePresuTransferenciaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableDestinoForeignKey(Long idCuentaContableDestinoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontabledestinoTemp=null;

			for(CuentaContable cuentacontabledestinoAux:cuentacontabledestinosForeignKey) {
				if(cuentacontabledestinoAux.getId()!=null && cuentacontabledestinoAux.getId().equals(idCuentaContableDestinoSeleccionado)) {
					cuentacontabledestinoTemp=cuentacontabledestinoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontabledestinoTemp!=null) {

					if(this.presutransferencia!=null) {
						this.presutransferencia.setCuentaContableDestino(cuentacontabledestinoTemp);
					}

					if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
						this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contable_destinoPresuTransferencia.setSelectedItem(cuentacontabledestinoTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_destinoPresuTransferencia.setSelectedItem(cuentacontabledestinoTemp);
					if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
						if(this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contable_destinoPresuTransferencia.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contable_destinoPresuTransferencia.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableDestino") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontabledestinoTemp!=null && jComboBoxid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia!=null) {
						jComboBoxid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia.setSelectedItem(cuentacontabledestinoTemp);
					} else {
						if(jComboBoxid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia!=null) {
							//jComboBoxid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia.setSelectedItem(cuentacontabledestinoTemp);
							if(jComboBoxid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia.getItemCount()>0) {
								jComboBoxid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia.setSelectedIndex(0);
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

	public String getActualCuentaContableDestinoForeignKeyDescripcion(Long idCuentaContableDestinoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontabledestinoTemp=null;

			for(CuentaContable cuentacontabledestinoAux:cuentacontabledestinosForeignKey) {
				if(cuentacontabledestinoAux.getId()!=null && cuentacontabledestinoAux.getId().equals(idCuentaContableDestinoSeleccionado)) {
					cuentacontabledestinoTemp=cuentacontabledestinoAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontabledestinoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableDestinoForeignKeyGenerico(Long idCuentaContableDestinoSeleccionado,JComboBox jComboBoxid_cuenta_contable_destinoPresuTransferenciaGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontabledestinoTemp=null;

			for(CuentaContable cuentacontabledestinoAux:cuentacontabledestinosForeignKey) {
				if(cuentacontabledestinoAux.getId()!=null && cuentacontabledestinoAux.getId().equals(idCuentaContableDestinoSeleccionado)) {
					cuentacontabledestinoTemp=cuentacontabledestinoAux;
					break;
				}
			}

			if(cuentacontabledestinoTemp!=null) {
				jComboBoxid_cuenta_contable_destinoPresuTransferenciaGenerico.setSelectedItem(cuentacontabledestinoTemp);
			} else {
				if(jComboBoxid_cuenta_contable_destinoPresuTransferenciaGenerico!=null && jComboBoxid_cuenta_contable_destinoPresuTransferenciaGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_destinoPresuTransferenciaGenerico.setSelectedIndex(0);
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

					if(this.presutransferencia!=null) {
						this.presutransferencia.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
						this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_empleadoPresuTransferencia.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoPresuTransferencia.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
						if(this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_empleadoPresuTransferencia.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_empleadoPresuTransferencia.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoPresuTransferencia!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoPresuTransferencia.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoPresuTransferencia!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoPresuTransferencia.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoPresuTransferencia.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoPresuTransferencia.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoPresuTransferenciaGenerico)throws Exception
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
				jComboBoxid_empleadoPresuTransferenciaGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoPresuTransferenciaGenerico!=null && jComboBoxid_empleadoPresuTransferenciaGenerico.getItemCount()>0) {
					jComboBoxid_empleadoPresuTransferenciaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPresuProyectoForeignKey(PresuTransferencia presutransferencia,JComboBox jComboBoxid_presu_proyectoPresuTransferenciaGenerico)throws Exception
	{
		try
		{
			PresuProyecto  presuproyectoAux=new PresuProyecto();

			if(jComboBoxid_presu_proyectoPresuTransferenciaGenerico==null) {
				presuproyectoAux=(PresuProyecto)this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_presu_proyectoPresuTransferencia.getSelectedItem();
			} else {
				presuproyectoAux=(PresuProyecto)jComboBoxid_presu_proyectoPresuTransferenciaGenerico.getSelectedItem();
			}

			if(presuproyectoAux!=null && presuproyectoAux.getId()!=null) {
				presutransferencia.setid_presu_proyecto(presuproyectoAux.getId());
				presutransferencia.setpresuproyecto_descripcion(PresuTransferenciaConstantesFunciones.getPresuProyectoDescripcion(presuproyectoAux));
				presutransferencia.setPresuProyecto(presuproyectoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(PresuTransferencia presutransferencia,JComboBox jComboBoxid_cuenta_contablePresuTransferenciaGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contablePresuTransferenciaGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contablePresuTransferencia.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contablePresuTransferenciaGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				presutransferencia.setid_cuenta_contable(cuentacontableAux.getId());
				presutransferencia.setcuentacontable_descripcion(PresuTransferenciaConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				presutransferencia.setCuentaContable(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableDestinoForeignKey(PresuTransferencia presutransferencia,JComboBox jComboBoxid_cuenta_contable_destinoPresuTransferenciaGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_destinoPresuTransferenciaGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contable_destinoPresuTransferencia.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_destinoPresuTransferenciaGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				presutransferencia.setid_cuenta_contable_destino(cuentacontableAux.getId());
				presutransferencia.setcuentacontabledestino_descripcion(PresuTransferenciaConstantesFunciones.getCuentaContableDestinoDescripcion(cuentacontableAux));
				presutransferencia.setCuentaContableDestino(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(PresuTransferencia presutransferencia,JComboBox jComboBoxid_empleadoPresuTransferenciaGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoPresuTransferenciaGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_empleadoPresuTransferencia.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoPresuTransferenciaGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				presutransferencia.setid_empleado(empleadoAux.getId());
				presutransferencia.setempleado_descripcion(PresuTransferenciaConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				presutransferencia.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePresuProyectosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPresuProyecto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { 
							this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_presu_proyectoPresuTransferencia.removeAllItems();

							for(PresuProyecto presuproyecto:this.presuproyectosForeignKey) {
								this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_presu_proyectoPresuTransferencia.addItem(presuproyecto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { 
					}

					if(!PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPresuProyecto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuTransferencia.removeAllItems();

							for(PresuProyecto presuproyecto:this.presuproyectosForeignKey) {
								this.jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuTransferencia.addItem(presuproyecto);
							}
						}

						if(!PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { 
							this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contablePresuTransferencia.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contablePresuTransferencia.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { 
					}

					if(!PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresuTransferencia.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresuTransferencia.addItem(cuentacontable);
							}
						}

						if(!PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContableDestinosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { 
							this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contable_destinoPresuTransferencia.removeAllItems();

							for(CuentaContable cuentacontabledestino:this.cuentacontabledestinosForeignKey) {
								this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contable_destinoPresuTransferencia.addItem(cuentacontabledestino);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { 
					}

					if(!PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableDestino") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia.removeAllItems();

							for(CuentaContable cuentacontabledestino:this.cuentacontabledestinosForeignKey) {
								this.jComboBoxid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia.addItem(cuentacontabledestino);
							}
						}

						if(!PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { 
							this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_empleadoPresuTransferencia.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_empleadoPresuTransferencia.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { 
					}

					if(!PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoPresuTransferencia.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoPresuTransferencia.addItem(empleado);
							}
						}

						if(!PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePresuProyectoForeignKey(PresuProyecto presuproyecto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
							this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_presu_proyectoPresuTransferencia.setSelectedItem(presuproyecto);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
							this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_presu_proyectoPresuTransferencia.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuTransferencia.setSelectedItem(presuproyecto);
						} else {
							this.jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuTransferencia.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
							this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contablePresuTransferencia.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
							this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contablePresuTransferencia.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresuTransferencia.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresuTransferencia.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaContableDestinoForeignKey(CuentaContable cuentacontabledestino,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
							this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contable_destinoPresuTransferencia.setSelectedItem(cuentacontabledestino);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
							this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contable_destinoPresuTransferencia.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia.setSelectedItem(cuentacontabledestino);
						} else {
							this.jComboBoxid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
							this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_empleadoPresuTransferencia.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
							this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_empleadoPresuTransferencia.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoPresuTransferencia.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoPresuTransferencia.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPresuTransferencia() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PresuTransferenciaConstantesFunciones.refrescarForeignKeysDescripcionesPresuTransferencia(this.presutransferenciaLogic.getPresuTransferencias());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PresuTransferenciaConstantesFunciones.refrescarForeignKeysDescripcionesPresuTransferencia(this.presutransferencias);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(PresuProyecto.class));
		classes.add(new Classe(CuentaContable.class));
		classes.add(new Classe(Empleado.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//presutransferenciaLogic.setPresuTransferencias(this.presutransferencias);
			presutransferenciaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PresuTransferenciaParameterReturnGeneral getPresuTransferenciaParameterGeneral() {
		return this.presutransferenciaParameterGeneral;
	}
	
	public void setPresuTransferenciaParameterGeneral(PresuTransferenciaParameterReturnGeneral presutransferenciaParameterGeneral) {
		this.presutransferenciaParameterGeneral = presutransferenciaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPresuTransferencia() {
		return isPermisoTodoPresuTransferencia;
	}

	public void setIsPermisoTodoPresuTransferencia(Boolean isPermisoTodoPresuTransferencia) {
		this.isPermisoTodoPresuTransferencia = isPermisoTodoPresuTransferencia;
	}

	public Boolean getIsPermisoNuevoPresuTransferencia() {
		return isPermisoNuevoPresuTransferencia;
	}

	public void setIsPermisoNuevoPresuTransferencia(Boolean isPermisoNuevoPresuTransferencia) {
		this.isPermisoNuevoPresuTransferencia = isPermisoNuevoPresuTransferencia;
	}

	public Boolean getIsPermisoActualizarPresuTransferencia() {
		return isPermisoActualizarPresuTransferencia;
	}

	public void setIsPermisoActualizarPresuTransferencia(Boolean isPermisoActualizarPresuTransferencia) {
		this.isPermisoActualizarPresuTransferencia = isPermisoActualizarPresuTransferencia;
	}

	public Boolean getIsPermisoEliminarPresuTransferencia() {
		return isPermisoEliminarPresuTransferencia;
	}

	public void setIsPermisoEliminarPresuTransferencia(Boolean isPermisoEliminarPresuTransferencia) {
		this.isPermisoEliminarPresuTransferencia = isPermisoEliminarPresuTransferencia;
	}

	public Boolean getIsPermisoGuardarCambiosPresuTransferencia() {
		return isPermisoGuardarCambiosPresuTransferencia;
	}

	public void setIsPermisoGuardarCambiosPresuTransferencia(Boolean isPermisoGuardarCambiosPresuTransferencia) {
		this.isPermisoGuardarCambiosPresuTransferencia = isPermisoGuardarCambiosPresuTransferencia;
	}
	
	public Boolean getIsPermisoConsultaPresuTransferencia() {
		return isPermisoConsultaPresuTransferencia;
	}

	public void setIsPermisoConsultaPresuTransferencia(Boolean isPermisoConsultaPresuTransferencia) {
		this.isPermisoConsultaPresuTransferencia = isPermisoConsultaPresuTransferencia;
	}

	public Boolean getIsPermisoBusquedaPresuTransferencia() {
		return isPermisoBusquedaPresuTransferencia;
	}

	public void setIsPermisoBusquedaPresuTransferencia(Boolean isPermisoBusquedaPresuTransferencia) {
		this.isPermisoBusquedaPresuTransferencia = isPermisoBusquedaPresuTransferencia;
	}

	public Boolean getIsPermisoReportePresuTransferencia() {
		return isPermisoReportePresuTransferencia;
	}

	public void setIsPermisoReportePresuTransferencia(Boolean isPermisoReportePresuTransferencia) {
		this.isPermisoReportePresuTransferencia = isPermisoReportePresuTransferencia;
	}
	
	public Boolean getIsPermisoPaginacionMedioPresuTransferencia() {
		return isPermisoPaginacionMedioPresuTransferencia;
	}

	public void setIsPermisoPaginacionMedioPresuTransferencia(Boolean isPermisoPaginacionMedioPresuTransferencia) {
		this.isPermisoPaginacionMedioPresuTransferencia = isPermisoPaginacionMedioPresuTransferencia;
	}
	
	public Boolean getIsPermisoPaginacionTodoPresuTransferencia() {
		return isPermisoPaginacionTodoPresuTransferencia;
	}

	public void setIsPermisoPaginacionTodoPresuTransferencia(Boolean isPermisoPaginacionTodoPresuTransferencia) {
		this.isPermisoPaginacionTodoPresuTransferencia = isPermisoPaginacionTodoPresuTransferencia;
	}
	
	public Boolean getIsPermisoPaginacionAltoPresuTransferencia() {
		return isPermisoPaginacionAltoPresuTransferencia;
	}

	public void setIsPermisoPaginacionAltoPresuTransferencia(Boolean isPermisoPaginacionAltoPresuTransferencia) {
		this.isPermisoPaginacionAltoPresuTransferencia = isPermisoPaginacionAltoPresuTransferencia;
	}
	
	public Boolean getIsPermisoCopiarPresuTransferencia() {
		return isPermisoCopiarPresuTransferencia;
	}

	public void setIsPermisoCopiarPresuTransferencia(Boolean isPermisoCopiarPresuTransferencia) {
		this.isPermisoCopiarPresuTransferencia = isPermisoCopiarPresuTransferencia;
	}
	
	public Boolean getIsPermisoVerFormPresuTransferencia() {
		return isPermisoVerFormPresuTransferencia;
	}

	public void setIsPermisoVerFormPresuTransferencia(Boolean isPermisoVerFormPresuTransferencia) {
		this.isPermisoVerFormPresuTransferencia = isPermisoVerFormPresuTransferencia;
	}
	
	public Boolean getIsPermisoDuplicarPresuTransferencia() {
		return isPermisoDuplicarPresuTransferencia;
	}

	public void setIsPermisoDuplicarPresuTransferencia(Boolean isPermisoDuplicarPresuTransferencia) {
		this.isPermisoDuplicarPresuTransferencia = isPermisoDuplicarPresuTransferencia;
	}
	
	public Boolean getIsPermisoOrdenPresuTransferencia() {
		return isPermisoOrdenPresuTransferencia;
	}

	public void setIsPermisoOrdenPresuTransferencia(Boolean isPermisoOrdenPresuTransferencia) {
		this.isPermisoOrdenPresuTransferencia = isPermisoOrdenPresuTransferencia;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPresuTransferencia() {
		return isVisibilidadCeldaNuevoPresuTransferencia;
	}

	public void setIsVisibilidadCeldaNuevoPresuTransferencia(Boolean isVisibilidadCeldaNuevoPresuTransferencia) {
		this.isVisibilidadCeldaNuevoPresuTransferencia = isVisibilidadCeldaNuevoPresuTransferencia;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPresuTransferencia() {
		return isVisibilidadCeldaDuplicarPresuTransferencia;
	}

	public void setIsVisibilidadCeldaDuplicarPresuTransferencia(Boolean isVisibilidadCeldaDuplicarPresuTransferencia) {
		this.isVisibilidadCeldaDuplicarPresuTransferencia = isVisibilidadCeldaDuplicarPresuTransferencia;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPresuTransferencia() {
		return isVisibilidadCeldaCopiarPresuTransferencia;
	}

	public void setIsVisibilidadCeldaCopiarPresuTransferencia(Boolean isVisibilidadCeldaCopiarPresuTransferencia) {
		this.isVisibilidadCeldaCopiarPresuTransferencia = isVisibilidadCeldaCopiarPresuTransferencia;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPresuTransferencia() {
		return isVisibilidadCeldaVerFormPresuTransferencia;
	}

	public void setIsVisibilidadCeldaVerFormPresuTransferencia(Boolean isVisibilidadCeldaVerFormPresuTransferencia) {
		this.isVisibilidadCeldaVerFormPresuTransferencia = isVisibilidadCeldaVerFormPresuTransferencia;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPresuTransferencia() {
		return isVisibilidadCeldaOrdenPresuTransferencia;
	}

	public void setIsVisibilidadCeldaOrdenPresuTransferencia(Boolean isVisibilidadCeldaOrdenPresuTransferencia) {
		this.isVisibilidadCeldaOrdenPresuTransferencia = isVisibilidadCeldaOrdenPresuTransferencia;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPresuTransferencia() {
		return isVisibilidadCeldaNuevoRelacionesPresuTransferencia;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPresuTransferencia(Boolean isVisibilidadCeldaNuevoRelacionesPresuTransferencia) {
		this.isVisibilidadCeldaNuevoRelacionesPresuTransferencia = isVisibilidadCeldaNuevoRelacionesPresuTransferencia;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPresuTransferencia() {
		return isVisibilidadCeldaModificarPresuTransferencia;
	}

	public void setIsVisibilidadCeldaModificarPresuTransferencia(Boolean isVisibilidadCeldaModificarPresuTransferencia) {
		this.isVisibilidadCeldaModificarPresuTransferencia = isVisibilidadCeldaModificarPresuTransferencia;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPresuTransferencia() {
		return isVisibilidadCeldaActualizarPresuTransferencia;
	}

	public void setIsVisibilidadCeldaActualizarPresuTransferencia(Boolean isVisibilidadCeldaActualizarPresuTransferencia) {
		this.isVisibilidadCeldaActualizarPresuTransferencia = isVisibilidadCeldaActualizarPresuTransferencia;
	}

	public Boolean getIsVisibilidadCeldaEliminarPresuTransferencia() {
		return isVisibilidadCeldaEliminarPresuTransferencia;
	}

	public void setIsVisibilidadCeldaEliminarPresuTransferencia(Boolean isVisibilidadCeldaEliminarPresuTransferencia) {
		this.isVisibilidadCeldaEliminarPresuTransferencia = isVisibilidadCeldaEliminarPresuTransferencia;
	}

	public Boolean getIsVisibilidadCeldaCancelarPresuTransferencia() {
		return isVisibilidadCeldaCancelarPresuTransferencia;
	}

	public void setIsVisibilidadCeldaCancelarPresuTransferencia(Boolean isVisibilidadCeldaCancelarPresuTransferencia) {
		this.isVisibilidadCeldaCancelarPresuTransferencia = isVisibilidadCeldaCancelarPresuTransferencia;
	}

	public Boolean getIsVisibilidadCeldaGuardarPresuTransferencia() {
		return isVisibilidadCeldaGuardarPresuTransferencia;
	}

	public void setIsVisibilidadCeldaGuardarPresuTransferencia(Boolean isVisibilidadCeldaGuardarPresuTransferencia) {
		this.isVisibilidadCeldaGuardarPresuTransferencia = isVisibilidadCeldaGuardarPresuTransferencia;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPresuTransferencia() {
		return isVisibilidadCeldaGuardarCambiosPresuTransferencia;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPresuTransferencia(Boolean isVisibilidadCeldaGuardarCambiosPresuTransferencia) {
		this.isVisibilidadCeldaGuardarCambiosPresuTransferencia = isVisibilidadCeldaGuardarCambiosPresuTransferencia;
	}
		
	public PresuTransferenciaSessionBean getpresutransferenciaSessionBean() {
		return this.presutransferenciaSessionBean;
	}
	
	public void setpresutransferenciaSessionBean(PresuTransferenciaSessionBean presutransferenciaSessionBean) {
		this.presutransferenciaSessionBean=presutransferenciaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCuentaContable() {
		return this.isVisibilidadFK_IdCuentaContable;
	}

	public void setisVisibilidadFK_IdCuentaContable(Boolean isVisibilidadFK_IdCuentaContable) {
		this.isVisibilidadFK_IdCuentaContable=isVisibilidadFK_IdCuentaContable;
	}

	public Boolean getisVisibilidadFK_IdCuentaContableDestino() {
		return this.isVisibilidadFK_IdCuentaContableDestino;
	}

	public void setisVisibilidadFK_IdCuentaContableDestino(Boolean isVisibilidadFK_IdCuentaContableDestino) {
		this.isVisibilidadFK_IdCuentaContableDestino=isVisibilidadFK_IdCuentaContableDestino;
	}

	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
	}

	public Boolean getisVisibilidadFK_IdPresuProyecto() {
		return this.isVisibilidadFK_IdPresuProyecto;
	}

	public void setisVisibilidadFK_IdPresuProyecto(Boolean isVisibilidadFK_IdPresuProyecto) {
		this.isVisibilidadFK_IdPresuProyecto=isVisibilidadFK_IdPresuProyecto;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(PresuTransferencia presutransferencia)throws Exception {
		try {
			
				this.setActualParaGuardarPresuProyectoForeignKey(presutransferencia,null);
				this.setActualParaGuardarCuentaContableForeignKey(presutransferencia,null);
				this.setActualParaGuardarCuentaContableDestinoForeignKey(presutransferencia,null);
				this.setActualParaGuardarEmpleadoForeignKey(presutransferencia,null);
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
	
	public void bugActualizarReferenciaActual(PresuTransferencia presutransferencia,PresuTransferencia presutransferenciaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPresuTransferencia(presutransferencia);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		presutransferenciaAux.setId(presutransferencia.getId());
		presutransferenciaAux.setVersionRow(presutransferencia.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPresuTransferencia();
		
			int intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferencia =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.presutransferencia =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PresuTransferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPresuTransferencia(this.presutransferencia,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = presutransferenciaValidator.getInvalidValues(this.presutransferencia);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			presutransferenciaLogic.setDatosCliente(datosCliente);
			presutransferenciaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				presutransferenciaAux=new  PresuTransferencia();
				
				presutransferenciaAux.setIsNew(true);
				presutransferenciaAux.setIsChanged(true);
				
				presutransferenciaAux.setPresuTransferenciaOriginal(this.presutransferencia);
				
				presutransferenciaAux.setId(this.presutransferencia.getId());	
				presutransferenciaAux.setVersionRow(this.presutransferencia.getVersionRow());	
				presutransferenciaAux.setid_presu_proyecto(this.presutransferencia.getid_presu_proyecto());	
				presutransferenciaAux.setid_cuenta_contable(this.presutransferencia.getid_cuenta_contable());	
				presutransferenciaAux.setid_cuenta_contable_destino(this.presutransferencia.getid_cuenta_contable_destino());	
				presutransferenciaAux.setid_empleado(this.presutransferencia.getid_empleado());	
				presutransferenciaAux.setfecha(this.presutransferencia.getfecha());	
				presutransferenciaAux.setvalor(this.presutransferencia.getvalor());	
				presutransferenciaAux.setdescripcion(this.presutransferencia.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presutransferenciaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presutransferenciaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(presutransferenciaAux,presutransferenciaLogic.getPresuTransferencias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presutransferenciaAux,presutransferencias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.presutransferenciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presutransferenciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presutransferenciaLogic.savePresuTransferencias();//WithConnection
						//presutransferenciaLogic.getSetVersionRowPresuTransferencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presutransferencia,presutransferenciaAux);
					
					this.refrescarForeignKeysDescripcionesPresuTransferencia();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presutransferenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presutransferenciaLogic.savePresuTransferenciaRelaciones(presutransferenciaAux);//WithConnection
								//presutransferenciaLogic.getSetVersionRowPresuTransferencias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.presutransferencia,presutransferenciaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.presutransferenciaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.presutransferenciaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(presutransferenciaAux,presutransferenciaLogic.getPresuTransferencias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(presutransferenciaAux,presutransferencias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.presutransferencia,presutransferenciaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				presutransferenciaAux=new  PresuTransferencia();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado() 
					|| (this.presutransferenciaSessionBean.getEsGuardarRelacionado() && this.presutransferencia.getId()>=0)) {
						
					presutransferenciaAux.setIsNew(false);
				}
				
				presutransferenciaAux.setIsDeleted(false);
			
				presutransferenciaAux.setId(this.presutransferencia.getId());	
				presutransferenciaAux.setVersionRow(this.presutransferencia.getVersionRow());	
				presutransferenciaAux.setid_presu_proyecto(this.presutransferencia.getid_presu_proyecto());	
				presutransferenciaAux.setid_cuenta_contable(this.presutransferencia.getid_cuenta_contable());	
				presutransferenciaAux.setid_cuenta_contable_destino(this.presutransferencia.getid_cuenta_contable_destino());	
				presutransferenciaAux.setid_empleado(this.presutransferencia.getid_empleado());	
				presutransferenciaAux.setfecha(this.presutransferencia.getfecha());	
				presutransferenciaAux.setvalor(this.presutransferencia.getvalor());	
				presutransferenciaAux.setdescripcion(this.presutransferencia.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presutransferenciaAux,presutransferenciaLogic.getPresuTransferencias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presutransferenciaAux,presutransferencias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.presutransferenciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presutransferenciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presutransferenciaLogic.savePresuTransferencias();//WithConnection
						//presutransferenciaLogic.getSetVersionRowPresuTransferencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presutransferencia,presutransferenciaAux);
					
					this.refrescarForeignKeysDescripcionesPresuTransferencia();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presutransferenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presutransferenciaLogic.savePresuTransferenciaRelaciones(presutransferenciaAux);//WithConnection
								//presutransferenciaLogic.getSetVersionRowPresuTransferencias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.presutransferencia,presutransferenciaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.presutransferenciaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.presutransferenciaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(presutransferenciaAux,presutransferenciaLogic.getPresuTransferencias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(presutransferenciaAux,presutransferencias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.presutransferencia,presutransferenciaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				presutransferenciaAux=new  PresuTransferencia();
				
				presutransferenciaAux.setIsNew(false);
				presutransferenciaAux.setIsChanged(false);
				
				presutransferenciaAux.setIsDeleted(true);
				
				presutransferenciaAux.setId(this.presutransferencia.getId());	
				presutransferenciaAux.setVersionRow(this.presutransferencia.getVersionRow());	
				presutransferenciaAux.setid_presu_proyecto(this.presutransferencia.getid_presu_proyecto());	
				presutransferenciaAux.setid_cuenta_contable(this.presutransferencia.getid_cuenta_contable());	
				presutransferenciaAux.setid_cuenta_contable_destino(this.presutransferencia.getid_cuenta_contable_destino());	
				presutransferenciaAux.setid_empleado(this.presutransferencia.getid_empleado());	
				presutransferenciaAux.setfecha(this.presutransferencia.getfecha());	
				presutransferenciaAux.setvalor(this.presutransferencia.getvalor());	
				presutransferenciaAux.setdescripcion(this.presutransferencia.getdescripcion());	
				
				if(this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.presutransferenciaAux.getId()>=0) {	
						this.presutransferenciasEliminados.add(presutransferenciaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(presutransferenciaAux,presutransferenciaLogic.getPresuTransferencias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presutransferenciaAux,presutransferencias);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.presutransferenciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presutransferenciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presutransferenciaLogic.savePresuTransferencias();//WithConnection
						//presutransferenciaLogic.getSetVersionRowPresuTransferencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presutransferenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presutransferenciaLogic.savePresuTransferenciaRelaciones(presutransferenciaAux);//WithConnection
								//presutransferenciaLogic.getSetVersionRowPresuTransferencias();//WithConnection
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
							if(this.presutransferenciaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.presutransferenciaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(presutransferenciaAux,presutransferenciaLogic.getPresuTransferencias());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(presutransferenciaAux,presutransferencias);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.getPresuTransferencias().addAll(this.presutransferenciasEliminados);
					
					presutransferenciaLogic.savePresuTransferencias();//WithConnection
					//presutransferenciaLogic.getSetVersionRowPresuTransferencias();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPresuTransferencia();
				
				this.presutransferenciasEliminados= new ArrayList<PresuTransferencia>();		
			}
			
			if(this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Transferencia GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Transferencia",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.presutransferencia=presutransferenciaAux;
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
      		//this.finishProcessPresuTransferencia();
      	}
		
	}	
	
	public void actualizarRelaciones(PresuTransferencia presutransferenciaLocal) throws Exception {
		
		if(this.presutransferenciaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PresuTransferencia presutransferenciaLocal) throws Exception {	
		if(this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PresuProyectoDetalleFormJInternalFrame.class)) {
				PresuProyectoBeanSwingJInternalFrame presuproyectoBeanSwingJInternalFrameLocal=(PresuProyectoBeanSwingJInternalFrame) ((PresuProyectoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				presuproyectoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPresuProyecto(presuproyectoBeanSwingJInternalFrameLocal.getpresuproyecto(),true);
				presuproyectoBeanSwingJInternalFrameLocal.actualizarLista(presuproyectoBeanSwingJInternalFrameLocal.presuproyecto,this.presuproyectosForeignKey);

				presuproyectoBeanSwingJInternalFrameLocal.actualizarRelaciones(presuproyectoBeanSwingJInternalFrameLocal.presuproyecto);

				presutransferenciaLocal.setPresuProyecto(presuproyectoBeanSwingJInternalFrameLocal.presuproyecto);

				this.addItemDefectoCombosForeignKeyPresuProyecto();
				this.cargarCombosFramePresuProyectosForeignKey("Formulario");
				this.setActualPresuProyectoForeignKey(presuproyectoBeanSwingJInternalFrameLocal.presuproyecto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				presutransferenciaLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontabledestinoBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontabledestinoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontabledestinoBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontabledestinoBeanSwingJInternalFrameLocal.actualizarLista(cuentacontabledestinoBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontabledestinosForeignKey);

				cuentacontabledestinoBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontabledestinoBeanSwingJInternalFrameLocal.cuentacontable);

				presutransferenciaLocal.setCuentaContableDestino(cuentacontabledestinoBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableDestino();
				this.cargarCombosFrameCuentaContableDestinosForeignKey("Formulario");
				this.setActualCuentaContableDestinoForeignKey(cuentacontabledestinoBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				presutransferenciaLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPresuTransferenciaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presutransferencia =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.presutransferencia =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = presutransferenciaValidator.getInvalidValues(this.presutransferencia);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PresuTransferencia presutransferencia,List<PresuTransferencia> presutransferencias) throws Exception {
		try	{		
			PresuTransferenciaConstantesFunciones.actualizarLista(presutransferencia,presutransferencias,this.presutransferenciaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PresuTransferencia presutransferencia,List<PresuTransferencia> presutransferencias) throws Exception {
		try	{			
			PresuTransferenciaConstantesFunciones.actualizarSelectedLista(presutransferencia,presutransferencias);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PresuTransferencia> presutransferenciasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				presutransferenciasLocal=this.presutransferenciaLogic.getPresuTransferencias();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				presutransferenciasLocal=this.presutransferencias;
			}
			//ARCHITECTURE
		
			for(PresuTransferencia presutransferenciaLocal:presutransferenciasLocal) {
				if(this.permiteMantenimiento(presutransferenciaLocal) && presutransferenciaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PresuTransferenciaConstantesFunciones.getPresuTransferenciaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PresuTransferenciaConstantesFunciones.IDPRESUPROYECTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuTransferencia.jLabelid_presu_proyectoPresuTransferencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuTransferenciaConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuTransferencia.jLabelid_cuenta_contablePresuTransferencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuTransferenciaConstantesFunciones.IDCUENTACONTABLEDESTINO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuTransferencia.jLabelid_cuenta_contable_destinoPresuTransferencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuTransferenciaConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuTransferencia.jLabelid_empleadoPresuTransferencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuTransferenciaConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuTransferencia.jLabelfechaPresuTransferencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuTransferenciaConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuTransferencia.jLabelvalorPresuTransferencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuTransferenciaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuTransferencia.jLabeldescripcionPresuTransferencia,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuTransferencia.jLabelid_presu_proyectoPresuTransferencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuTransferencia.jLabelid_cuenta_contablePresuTransferencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuTransferencia.jLabelid_cuenta_contable_destinoPresuTransferencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuTransferencia.jLabelid_empleadoPresuTransferencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuTransferencia.jLabelfechaPresuTransferencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuTransferencia.jLabelvalorPresuTransferencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuTransferencia.jLabeldescripcionPresuTransferencia,"");
		
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
		this.iIdNuevoPresuTransferencia--;	
		
		
		this.presutransferenciaAux=new PresuTransferencia();
		
		this.presutransferenciaAux.setId(this.iIdNuevoPresuTransferencia);
		this.presutransferenciaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presutransferenciaLogic.getPresuTransferencias().add(this.presutransferenciaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.presutransferencias.add(this.presutransferenciaAux);
		}
		//ARCHITECTURE
		
		this.presutransferencia=this.presutransferenciaAux;
		
		if(PresuTransferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPresuTransferencia(this.presutransferencia);
			this.setVariablesObjetoActualToFormularioForeignKeyPresuTransferencia(this.presutransferencia);
		}
				
		//this.setDefaultControlesPresuTransferencia();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPresuTransferencia();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPresuTransferencia();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresuTransferencia();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresuTransferencia(this.presutransferenciaBean,this.presutransferencia,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PresuTransferenciaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.presutransferenciaSessionBean.getConGuardarRelaciones()) {
			classes=PresuTransferenciaConstantesFunciones.getClassesRelationshipsOfPresuTransferencia(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.presutransferenciaReturnGeneral=presutransferenciaLogic.procesarEventosPresuTransferenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presutransferenciaLogic.getPresuTransferencias(),this.presutransferencia,this.presutransferenciaParameterGeneral,this.isEsNuevoPresuTransferencia,classes);//this.presutransferenciaLogic.getPresuTransferencia()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPresuTransferencia(this.presutransferenciaReturnGeneral,this.presutransferenciaBean,false);
		
		if(this.presutransferenciaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPresuTransferencia(this.presutransferenciaReturnGeneral.getPresuTransferencia());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPresuTransferencia(this.presutransferenciaReturnGeneral.getPresuTransferencia());
		}
		
		if(this.presutransferenciaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPresuTransferencia(this.presutransferenciaReturnGeneral.getPresuTransferencia(),classes);//this.presutransferenciaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPresuTransferencia(this.presutransferencia,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPresuTransferencia();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPresuTransferencia();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresuTransferenciaBeanSwingJInternalFrameAdditional.RecargarFormPresuTransferencia(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPresuTransferencia(false);
						
			if(presutransferenciaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresuTransferencia();
			}
			
			this.actualizarVisualTableDatosPresuTransferencia();
			
			this.jTableDatosPresuTransferencia.setRowSelectionInterval(this.getIndiceNuevoPresuTransferencia(), this.getIndiceNuevoPresuTransferencia());
			
			this.seleccionarFilaTablaPresuTransferenciaActual();
						
			this.actualizarEstadoCeldasBotonesPresuTransferencia("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPresuTransferencia(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPresuTransferencia.jDateChooserfechaPresuTransferencia.setEnabled(isHabilitar && this.presutransferenciaConstantesFunciones.activarfechaPresuTransferencia);
		this.jInternalFrameDetalleFormPresuTransferencia.jTextFieldvalorPresuTransferencia.setEnabled(isHabilitar && this.presutransferenciaConstantesFunciones.activarvalorPresuTransferencia);
		this.jInternalFrameDetalleFormPresuTransferencia.jTextAreadescripcionPresuTransferencia.setEnabled(isHabilitar && this.presutransferenciaConstantesFunciones.activardescripcionPresuTransferencia);	
		
		this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_presu_proyectoPresuTransferencia.setEnabled(isHabilitar && this.presutransferenciaConstantesFunciones.activarid_presu_proyectoPresuTransferencia);
		this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contablePresuTransferencia.setEnabled(isHabilitar && this.presutransferenciaConstantesFunciones.activarid_cuenta_contablePresuTransferencia);
		this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contable_destinoPresuTransferencia.setEnabled(isHabilitar && this.presutransferenciaConstantesFunciones.activarid_cuenta_contable_destinoPresuTransferencia);
		this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_empleadoPresuTransferencia.setEnabled(isHabilitar && this.presutransferenciaConstantesFunciones.activarid_empleadoPresuTransferencia);
	};
	
	public void setDefaultControlesPresuTransferencia() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPresuTransferencia(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.presutransferenciaSessionBean.setConGuardarRelaciones(true);			
			this.presutransferenciaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPresuTransferencia.jTabbedPaneRelacionesPresuTransferencia.setVisible(true);
			
					
		} else {
			//this.presutransferenciaSessionBean.setConGuardarRelaciones(false);			
			this.presutransferenciaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPresuTransferencia.jTabbedPaneRelacionesPresuTransferencia.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPresuTransferencia() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuTransferencia presutransferenciaAux:this.presutransferenciaLogic.getPresuTransferencias()) {
				if(presutransferenciaAux.getId().equals(this.iIdNuevoPresuTransferencia)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuTransferencia presutransferenciaAux:this.presutransferencias) {
				if(presutransferenciaAux.getId().equals(this.iIdNuevoPresuTransferencia)) {
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
	
	public int getIndiceActualPresuTransferencia(PresuTransferencia presutransferencia,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuTransferencia presutransferenciaAux:this.presutransferenciaLogic.getPresuTransferencias()) {
				if(presutransferenciaAux.getId().equals(presutransferencia.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuTransferencia presutransferenciaAux:this.presutransferencias) {
				if(presutransferenciaAux.getId().equals(presutransferencia.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPresuTransferencia(PresuTransferencia presutransferenciaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuTransferencia presutransferenciaAux:this.presutransferenciaLogic.getPresuTransferencias()) {
				if(presutransferenciaAux.getPresuTransferenciaOriginal().getId().equals(presutransferenciaOriginal.getId())) {
					existe=true;
					presutransferenciaOriginal.setId(presutransferenciaAux.getId());
					presutransferenciaOriginal.setVersionRow(presutransferenciaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuTransferencia presutransferenciaAux:this.presutransferencias) {
				if(presutransferenciaAux.getPresuTransferenciaOriginal().getId().equals(presutransferenciaOriginal.getId())) {
					existe=true;
					presutransferenciaOriginal.setId(presutransferenciaAux.getId());
					presutransferenciaOriginal.setVersionRow(presutransferenciaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPresuTransferencia(Boolean esParaCancelar) throws Exception {
		presutransferenciasAux=new ArrayList<PresuTransferencia>();
		presutransferenciaAux=new PresuTransferencia();
		
		if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresuTransferencia presutransferenciaAux:this.presutransferenciaLogic.getPresuTransferencias()) {
					if(presutransferenciaAux.getId()<0) {
						presutransferenciasAux.add(presutransferenciaAux);
					}		
				}
				this.iIdNuevoPresuTransferencia=0L;
				this.presutransferenciaLogic.getPresuTransferencias().removeAll(presutransferenciasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuTransferencia presutransferenciaAux:this.presutransferencias) {
					if(presutransferenciaAux.getId()<0) {
						presutransferenciasAux.add(presutransferenciaAux);
					}		
				}
				this.iIdNuevoPresuTransferencia=0L;
				this.presutransferencias.removeAll(presutransferenciasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPresuTransferencia 
					&& this.presutransferenciaLogic.getPresuTransferencias().size()>0
					) {
					presutransferenciaAux=this.presutransferenciaLogic.getPresuTransferencias().get(this.presutransferenciaLogic.getPresuTransferencias().size() - 1);
				
					if(presutransferenciaAux.getId()<0) {
						this.presutransferenciaLogic.getPresuTransferencias().remove(presutransferenciaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPresuTransferencia && this.presutransferencias.size()>0) {
					presutransferenciaAux=this.presutransferencias.get(this.presutransferencias.size() - 1);
				
					if(presutransferenciaAux.getId()<0) {
						this.presutransferencias.remove(presutransferenciaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPresuTransferencia(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(presutransferencia.getId()<0) {
				this.presutransferenciaLogic.getPresuTransferencias().remove(this.presutransferencia);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(presutransferencia.getId()<0) {
				this.presutransferencias.remove(this.presutransferencia);
			}
		}			
	}
	
	public void setEstadosInicialesPresuTransferencia(List<PresuTransferencia> presutransferenciasAux) throws Exception {
		PresuTransferenciaConstantesFunciones.setEstadosInicialesPresuTransferencia(presutransferenciasAux);
	}
	
	public void setEstadosInicialesPresuTransferencia(PresuTransferencia presutransferenciaAux) throws Exception {
		PresuTransferenciaConstantesFunciones.setEstadosInicialesPresuTransferencia(presutransferenciaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPresuTransferenciaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPresuTransferencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPresuTransferenciaActual()) {
				if(!this.isEsNuevoPresuTransferencia) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPresuTransferencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPresuTransferencia=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPresuTransferenciaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Transferencia ?", "MANTENIMIENTO DE Transferencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPresuTransferencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PresuTransferencia presutransferencia) throws Exception {
		PresuTransferenciaConstantesFunciones.seleccionarAsignar(this.presutransferencia,presutransferencia);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPresuTransferencia=this.isPermisoActualizarOriginalPresuTransferencia;
			
			
			this.seleccionarAsignar(presutransferencia);
			
			

			idCuentaContableActual=presutransferencia.getid_cuenta_contable();
			this.seleccionarCuentaContableActual();

			idCuentaContableDestinoActual=presutransferencia.getid_cuenta_contable_destino();
			this.seleccionarCuentaContableDestinoActual();

			idEmpleadoActual=presutransferencia.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresuTransferenciaConstantesFunciones.quitarEspaciosPresuTransferencia(this.presutransferencia,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPresuTransferencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.presutransferenciaSessionBean.setsFuncionBusquedaRapida(this.presutransferenciaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarCuentaContableActual() throws Exception {
		try	{
			CuentaContable cuentacontableAux=new CuentaContable();

			if(this.idCuentaContableActual != null && this.idCuentaContableActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(this.idCuentaContableActual);
					cuentacontableAux= cuentacontableLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontablesForeignKey=new ArrayList<CuentaContable>();
				cuentacontablesForeignKey.add(cuentacontableAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	public void seleccionarCuentaContableDestinoActual() throws Exception {
		try	{
			CuentaContable cuentacontabledestinoAux=new CuentaContable();

			if(this.idCuentaContableDestinoActual != null && this.idCuentaContableDestinoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontabledestinoLogic.getEntityWithConnection(this.idCuentaContableDestinoActual);
					cuentacontabledestinoAux= cuentacontabledestinoLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontabledestinosForeignKey=new ArrayList<CuentaContable>();
				cuentacontabledestinosForeignKey.add(cuentacontabledestinoAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
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
			if(this.isEsNuevoPresuTransferencia) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPresuTransferencia(esParaCancelar);				
				this.cancelarNuevoPresuTransferencia(esParaCancelar);								
			}
			
			this.presutransferencia=new PresuTransferencia();
			
			this.inicializarPresuTransferencia();
			
			this.actualizarEstadoCeldasBotonesPresuTransferencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPresuTransferencia() throws Exception {
		try {
			PresuTransferenciaConstantesFunciones.inicializarPresuTransferencia(this.presutransferencia);
			
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
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.presutransferenciaLogic.getPresuTransferencias().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePresuTransferencias(String sAccionBusqueda,List<PresuTransferencia> presutransferenciasParaReportes) throws Exception {
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
					sPathReporteFinal="PresuTransferencia"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PresuTransferenciaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PresuTransferenciaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PresuTransferencia"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Transferenciaes");		
		parameters.put("busquedapor", PresuTransferenciaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePresuTransferencia=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PresuTransferenciaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PresuTransferenciaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePresuTransferencia=new JRBeanArrayDataSource(PresuTransferenciaJInternalFrame.TraerPresuTransferenciaBeans(presutransferenciasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePresuTransferencia);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PresuTransferenciaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PresuTransferenciaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PresuTransferenciaBean.TraerPresuTransferenciaBeans(presutransferenciasParaReportes).toArray()));
							
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
				this.generarExcelReportePresuTransferencias(sAccionBusqueda,sTipoArchivoReporte,presutransferenciasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPresuTransferencias(sAccionBusqueda,sTipoArchivoReporte,presutransferenciasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPresuTransferenciaActionPerformed(null);
					//this.generarExcelReportePresuTransferencias(sAccionBusqueda,sTipoArchivoReporte,presutransferenciasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPresuTransferencias(sAccionBusqueda,sTipoArchivoReporte,presutransferenciasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPresuTransferencias(sAccionBusqueda,sTipoArchivoReporte,presutransferenciasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPresuTransferencias(sAccionBusqueda,sTipoArchivoReporte,presutransferenciasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePresuTransferencias(String sAccionBusqueda,String sTipoArchivoReporte,List<PresuTransferencia> presutransferenciasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presutransferencia";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresuTransferencias");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresuTransferencia("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PresuTransferencia presutransferencia : presutransferenciasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PresuTransferenciaConstantesFunciones.generarExcelReporteDataPresuTransferencia("NORMAL",row,workbook,presutransferencia,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPresuTransferencia(String sTipo,Row row,Workbook workbook) {
		
		PresuTransferenciaConstantesFunciones.generarExcelReporteHeaderPresuTransferencia(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPresuTransferencias(String sAccionBusqueda,String sTipoArchivoReporte,List<PresuTransferencia> presutransferenciasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presutransferencia_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresuTransferencias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PresuTransferencia presutransferencia : presutransferenciasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PresuTransferenciaConstantesFunciones.getPresuTransferenciaDescripcion(presutransferencia));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuTransferenciaConstantesFunciones.LABEL_IDPRESUPROYECTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuTransferenciaConstantesFunciones.LABEL_IDPRESUPROYECTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presutransferencia.getpresuproyecto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presutransferencia.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLEDESTINO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLEDESTINO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presutransferencia.getcuentacontabledestino_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuTransferenciaConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuTransferenciaConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presutransferencia.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuTransferenciaConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuTransferenciaConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presutransferencia.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuTransferenciaConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuTransferenciaConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presutransferencia.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuTransferenciaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuTransferenciaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presutransferencia.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPresuTransferencias(String sAccionBusqueda,String sTipoArchivoReporte,List<PresuTransferencia> presutransferenciasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PresuTransferencia> presutransferenciasRespaldo=null;
		
		classes=PresuTransferenciaConstantesFunciones.getClassesRelationshipsOfPresuTransferencia(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.presutransferenciaLogic.setDatosCliente(this.datosCliente);
		this.presutransferenciaLogic.setDatosDeep(this.datosDeep);
		this.presutransferenciaLogic.setIsConDeep(true);
		
		presutransferenciasRespaldo=this.presutransferenciaLogic.getPresuTransferencias();
		
		this.presutransferenciaLogic.setPresuTransferencias(presutransferenciasParaReportes);	
		this.presutransferenciaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		presutransferenciasParaReportes=this.presutransferenciaLogic.getPresuTransferencias();
		this.presutransferenciaLogic.setPresuTransferencias(presutransferenciasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presutransferencia_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresuTransferencias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresuTransferencia("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PresuTransferencia presutransferencia : presutransferenciasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPresuTransferencia("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PresuTransferenciaConstantesFunciones.generarExcelReporteDataPresuTransferencia("NORMAL",row,workbook,presutransferencia,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PresuTransferenciaConstantesFunciones.getPresuTransferenciaDescripcion(presutransferencia));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresuTransferencia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuTransferencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresuTransferencia.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuTransferencia.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPresuTransferencia() throws Exception {		
		this.startProcessPresuTransferencia(true);
	}
	
	public void startProcessPresuTransferencia(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPresuTransferencia ,this.jPanelParametrosReportesPresuTransferencia, this.jScrollPanelDatosPresuTransferencia,this.jPanelPaginacionPresuTransferencia, this.jScrollPanelDatosEdicionPresuTransferencia, this.jPanelAccionesPresuTransferencia,this.jPanelAccionesFormularioPresuTransferencia,this.jmenuBarPresuTransferencia,this.jmenuBarDetallePresuTransferencia,this.jTtoolBarPresuTransferencia,this.jTtoolBarDetallePresuTransferencia);		
		
		final JTabbedPane jTabbedPaneBusquedasPresuTransferencia=this.jTabbedPaneBusquedasPresuTransferencia; 
		
		final JPanel jPanelParametrosReportesPresuTransferencia=this.jPanelParametrosReportesPresuTransferencia;
		//final JScrollPane jScrollPanelDatosPresuTransferencia=this.jScrollPanelDatosPresuTransferencia;
		final JTable jTableDatosPresuTransferencia=this.jTableDatosPresuTransferencia;		
		final JPanel jPanelPaginacionPresuTransferencia=this.jPanelPaginacionPresuTransferencia;
		//final JScrollPane jScrollPanelDatosEdicionPresuTransferencia=this.jScrollPanelDatosEdicionPresuTransferencia;
		final JPanel jPanelAccionesPresuTransferencia=this.jPanelAccionesPresuTransferencia;
		
		JPanel jPanelCamposAuxiliarPresuTransferencia=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPresuTransferencia=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
			jPanelCamposAuxiliarPresuTransferencia=this.jInternalFrameDetalleFormPresuTransferencia.jPanelCamposPresuTransferencia;
			jPanelAccionesFormularioAuxiliarPresuTransferencia=this.jInternalFrameDetalleFormPresuTransferencia.jPanelAccionesFormularioPresuTransferencia;
		}
		
		final JPanel jPanelCamposPresuTransferencia=jPanelCamposAuxiliarPresuTransferencia;
		final JPanel jPanelAccionesFormularioPresuTransferencia=jPanelAccionesFormularioAuxiliarPresuTransferencia;
		
		
		final JMenuBar jmenuBarPresuTransferencia=this.jmenuBarPresuTransferencia;
		final JToolBar jTtoolBarPresuTransferencia=this.jTtoolBarPresuTransferencia;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPresuTransferencia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresuTransferencia=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
			jmenuBarDetalleAuxiliarPresuTransferencia=this.jInternalFrameDetalleFormPresuTransferencia.jmenuBarDetallePresuTransferencia;
			jTtoolBarDetalleAuxiliarPresuTransferencia=this.jInternalFrameDetalleFormPresuTransferencia.jTtoolBarDetallePresuTransferencia;
		}
		
		final JMenuBar jmenuBarDetallePresuTransferencia=jmenuBarDetalleAuxiliarPresuTransferencia;
		final JToolBar jTtoolBarDetallePresuTransferencia=jTtoolBarDetalleAuxiliarPresuTransferencia;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresuTransferencia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresuTransferencia;
			processRunnable.jTableDatos=jTableDatosPresuTransferencia;
			processRunnable.jPanelCampos=jPanelCamposPresuTransferencia;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresuTransferencia;
			processRunnable.jPanelAcciones=jPanelAccionesPresuTransferencia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresuTransferencia;
			
			
			processRunnable.jmenuBar=jmenuBarPresuTransferencia;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresuTransferencia;
			processRunnable.jTtoolBar=jTtoolBarPresuTransferencia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresuTransferencia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresuTransferencia ,jPanelParametrosReportesPresuTransferencia,jTableDatosPresuTransferencia, /*jScrollPanelDatosPresuTransferencia,*/jPanelCamposPresuTransferencia,jPanelPaginacionPresuTransferencia, /*jScrollPanelDatosEdicionPresuTransferencia,*/ jPanelAccionesPresuTransferencia,jPanelAccionesFormularioPresuTransferencia,jmenuBarPresuTransferencia,jmenuBarDetallePresuTransferencia,jTtoolBarPresuTransferencia,jTtoolBarDetallePresuTransferencia);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresuTransferencia ,jPanelParametrosReportesPresuTransferencia, jScrollPanelDatosPresuTransferencia,jPanelPaginacionPresuTransferencia, jScrollPanelDatosEdicionPresuTransferencia, jPanelAccionesPresuTransferencia,jPanelAccionesFormularioPresuTransferencia,jmenuBarPresuTransferencia,jmenuBarDetallePresuTransferencia,jTtoolBarPresuTransferencia,jTtoolBarDetallePresuTransferencia);
						
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
	
	public void finishProcessPresuTransferencia() {// throws Exception 
		this.finishProcessPresuTransferencia(true);
	}
	
	public void finishProcessPresuTransferencia(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPresuTransferencia ,this.jPanelParametrosReportesPresuTransferencia, this.jScrollPanelDatosPresuTransferencia,this.jPanelPaginacionPresuTransferencia, this.jScrollPanelDatosEdicionPresuTransferencia, this.jPanelAccionesPresuTransferencia,this.jPanelAccionesFormularioPresuTransferencia,this.jmenuBarPresuTransferencia,this.jmenuBarDetallePresuTransferencia,this.jTtoolBarPresuTransferencia,this.jTtoolBarDetallePresuTransferencia);		
		
		final JTabbedPane jTabbedPaneBusquedasPresuTransferencia=this.jTabbedPaneBusquedasPresuTransferencia; 
		
		final JPanel jPanelParametrosReportesPresuTransferencia=this.jPanelParametrosReportesPresuTransferencia;
		//final JScrollPane jScrollPanelDatosPresuTransferencia=this.jScrollPanelDatosPresuTransferencia;
		final JTable jTableDatosPresuTransferencia=this.jTableDatosPresuTransferencia;		
		final JPanel jPanelPaginacionPresuTransferencia=this.jPanelPaginacionPresuTransferencia;
		//final JScrollPane jScrollPanelDatosEdicionPresuTransferencia=this.jScrollPanelDatosEdicionPresuTransferencia;
		final JPanel jPanelAccionesPresuTransferencia=this.jPanelAccionesPresuTransferencia;
		
		JPanel jPanelCamposAuxiliarPresuTransferencia=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPresuTransferencia=new JPanel();
		
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
			jPanelCamposAuxiliarPresuTransferencia=this.jInternalFrameDetalleFormPresuTransferencia.jPanelCamposPresuTransferencia;
			jPanelAccionesFormularioAuxiliarPresuTransferencia=this.jInternalFrameDetalleFormPresuTransferencia.jPanelAccionesFormularioPresuTransferencia;
		}
		
		final JPanel jPanelCamposPresuTransferencia=jPanelCamposAuxiliarPresuTransferencia;
		final JPanel jPanelAccionesFormularioPresuTransferencia=jPanelAccionesFormularioAuxiliarPresuTransferencia;
		
		
		final JMenuBar jmenuBarPresuTransferencia=this.jmenuBarPresuTransferencia;		
		final JToolBar jTtoolBarPresuTransferencia=this.jTtoolBarPresuTransferencia;
				
		JMenuBar jmenuBarDetalleAuxiliarPresuTransferencia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresuTransferencia=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
			jmenuBarDetalleAuxiliarPresuTransferencia=this.jInternalFrameDetalleFormPresuTransferencia.jmenuBarDetallePresuTransferencia;
			jTtoolBarDetalleAuxiliarPresuTransferencia=this.jInternalFrameDetalleFormPresuTransferencia.jTtoolBarDetallePresuTransferencia;		
		}
		
		final JMenuBar jmenuBarDetallePresuTransferencia=jmenuBarDetalleAuxiliarPresuTransferencia;
		final JToolBar jTtoolBarDetallePresuTransferencia=jTtoolBarDetalleAuxiliarPresuTransferencia;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresuTransferencia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresuTransferencia;
			processRunnable.jTableDatos=jTableDatosPresuTransferencia;
			processRunnable.jPanelCampos=jPanelCamposPresuTransferencia;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresuTransferencia;
			processRunnable.jPanelAcciones=jPanelAccionesPresuTransferencia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresuTransferencia;
			
			
			processRunnable.jmenuBar=jmenuBarPresuTransferencia;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresuTransferencia;
			processRunnable.jTtoolBar=jTtoolBarPresuTransferencia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresuTransferencia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPresuTransferencia ,jPanelParametrosReportesPresuTransferencia, jTableDatosPresuTransferencia,/*jScrollPanelDatosPresuTransferencia,*/jPanelCamposPresuTransferencia,jPanelPaginacionPresuTransferencia, /*jScrollPanelDatosEdicionPresuTransferencia,*/ jPanelAccionesPresuTransferencia,jPanelAccionesFormularioPresuTransferencia,jmenuBarPresuTransferencia,jmenuBarDetallePresuTransferencia,jTtoolBarPresuTransferencia,jTtoolBarDetallePresuTransferencia));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPresuTransferencia(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPresuTransferencia(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPresuTransferencia(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPresuTransferencia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPresuTransferencia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePresuTransferencia,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPresuTransferencia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPresuTransferencia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePresuTransferencia,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.presutransferenciaConstantesFunciones.getsFinalQueryPresuTransferencia();
		String  finalQueryPaginacionTodos=this.presutransferenciaConstantesFunciones.getsFinalQueryPresuTransferencia();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PresuTransferenciaConstantesFunciones.getArrayColumnasGlobalesNoPresuTransferencia(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PresuTransferenciaConstantesFunciones.getArrayColumnasGlobalesPresuTransferencia(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PresuTransferenciaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.presutransferenciasEliminados= new ArrayList<PresuTransferencia>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPresuTransferencia();
		
				///*PresuTransferenciaSessionBean*/this.presutransferenciaSessionBean=new PresuTransferenciaSessionBean();
			
			if(this.presutransferenciaSessionBean==null) {
				this.presutransferenciaSessionBean=new PresuTransferenciaSessionBean();
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
					this.iNumeroPaginacion=PresuTransferenciaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PresuTransferenciaConstantesFunciones.getClassesForeignKeysOfPresuTransferencia(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/presutransferencia."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			presutransferenciasAux= new ArrayList<PresuTransferencia>();
			
				
			presutransferenciaLogic.setDatosCliente(this.datosCliente);
			presutransferenciaLogic.setDatosDeep(this.datosDeep);
			presutransferenciaLogic.setIsConDeep(true);
			
			
			presutransferenciaLogic.getPresuTransferenciaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					presutransferenciaLogic.getTodosPresuTransferencias(finalQueryGlobal,pagination);
					
					//presutransferenciaLogic.getTodosPresuTransferenciasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(presutransferenciaLogic.getPresuTransferencias()==null|| presutransferenciaLogic.getPresuTransferencias().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presutransferenciasAux= new ArrayList<PresuTransferencia>();
							presutransferenciasAux.addAll(presutransferenciaLogic.getPresuTransferencias());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutransferenciasAux= new ArrayList<PresuTransferencia>();
							presutransferenciasAux.addAll(presutransferencias);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presutransferenciaLogic.getTodosPresuTransferencias(finalQueryGlobal+"",this.pagination);												
							
							//presutransferenciaLogic.getTodosPresuTransferenciasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePresuTransferencias("Todos",presutransferenciaLogic.getPresuTransferencias() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presutransferenciaLogic.setPresuTransferencias(new ArrayList<PresuTransferencia>());					
							presutransferenciaLogic.getPresuTransferencias().addAll(presutransferenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutransferencias=new ArrayList<PresuTransferencia>();
							presutransferencias.addAll(presutransferenciasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPresuTransferencia=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPresuTransferencia=this.idActual;
				
				} else if(this.idPresuTransferenciaActual!=null && this.idPresuTransferenciaActual!=0L) {
					idPresuTransferencia=idPresuTransferenciaActual;
				}
				
					
				this.sDetalleReporte=PresuTransferenciaConstantesFunciones.getDetalleIndicePorId(idPresuTransferencia);
				
				this.presutransferencias=new ArrayList<PresuTransferencia>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					presutransferenciaLogic.getEntity(idPresuTransferencia);
					
					//presutransferenciaLogic.getEntityWithConnection(idPresuTransferencia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presutransferenciaLogic.setPresuTransferencias(new ArrayList<PresuTransferencia>());
					presutransferenciaLogic.getPresuTransferencias().add(presutransferenciaLogic.getPresuTransferencia());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presutransferencias=new ArrayList<PresuTransferencia>();
					this.presutransferencias.add(presutransferencia);
				}
				
				if(presutransferenciaLogic.getPresuTransferencia()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=PresuTransferenciaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presutransferenciaLogic.getPresuTransferenciasFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuTransferenciaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuTransferenciaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presutransferenciaLogic.getPresuTransferencias()==null||presutransferenciaLogic.getPresuTransferencias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presutransferencias==null|| presutransferencias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presutransferenciasAux=new ArrayList<PresuTransferencia>();
						presutransferenciasAux.addAll(presutransferenciaLogic.getPresuTransferencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutransferenciasAux=new ArrayList<PresuTransferencia>();
							presutransferenciasAux.addAll(presutransferencias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presutransferenciaLogic.getPresuTransferenciasFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuTransferenciaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuTransferenciaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuTransferencias("FK_IdCuentaContable",presutransferenciaLogic.getPresuTransferencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuTransferencias("FK_IdCuentaContable",presutransferencias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presutransferenciaLogic.setPresuTransferencias(new ArrayList<PresuTransferencia>());
						presutransferenciaLogic.getPresuTransferencias().addAll(presutransferenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutransferencias=new ArrayList<PresuTransferencia>();
							presutransferencias.addAll(presutransferenciasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContableDestino")) {
				this.sDetalleReporte=PresuTransferenciaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDestino(id_cuenta_contable_destinoFK_IdCuentaContableDestino);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presutransferenciaLogic.getPresuTransferenciasFK_IdCuentaContableDestino(finalQueryGlobal,pagination,id_cuenta_contable_destinoFK_IdCuentaContableDestino);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuTransferenciaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDestino(id_cuenta_contable_destinoFK_IdCuentaContableDestino);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuTransferenciaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDestino(id_cuenta_contable_destinoFK_IdCuentaContableDestino);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presutransferenciaLogic.getPresuTransferencias()==null||presutransferenciaLogic.getPresuTransferencias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presutransferencias==null|| presutransferencias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presutransferenciasAux=new ArrayList<PresuTransferencia>();
						presutransferenciasAux.addAll(presutransferenciaLogic.getPresuTransferencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutransferenciasAux=new ArrayList<PresuTransferencia>();
							presutransferenciasAux.addAll(presutransferencias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presutransferenciaLogic.getPresuTransferenciasFK_IdCuentaContableDestino(finalQueryGlobal,pagination,id_cuenta_contable_destinoFK_IdCuentaContableDestino);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuTransferenciaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDestino(id_cuenta_contable_destinoFK_IdCuentaContableDestino);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuTransferenciaConstantesFunciones.getDetalleIndiceFK_IdCuentaContableDestino(id_cuenta_contable_destinoFK_IdCuentaContableDestino);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuTransferencias("FK_IdCuentaContableDestino",presutransferenciaLogic.getPresuTransferencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuTransferencias("FK_IdCuentaContableDestino",presutransferencias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presutransferenciaLogic.setPresuTransferencias(new ArrayList<PresuTransferencia>());
						presutransferenciaLogic.getPresuTransferencias().addAll(presutransferenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutransferencias=new ArrayList<PresuTransferencia>();
							presutransferencias.addAll(presutransferenciasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=PresuTransferenciaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presutransferenciaLogic.getPresuTransferenciasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuTransferenciaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuTransferenciaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presutransferenciaLogic.getPresuTransferencias()==null||presutransferenciaLogic.getPresuTransferencias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presutransferencias==null|| presutransferencias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presutransferenciasAux=new ArrayList<PresuTransferencia>();
						presutransferenciasAux.addAll(presutransferenciaLogic.getPresuTransferencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutransferenciasAux=new ArrayList<PresuTransferencia>();
							presutransferenciasAux.addAll(presutransferencias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presutransferenciaLogic.getPresuTransferenciasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuTransferenciaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuTransferenciaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuTransferencias("FK_IdEmpleado",presutransferenciaLogic.getPresuTransferencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuTransferencias("FK_IdEmpleado",presutransferencias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presutransferenciaLogic.setPresuTransferencias(new ArrayList<PresuTransferencia>());
						presutransferenciaLogic.getPresuTransferencias().addAll(presutransferenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutransferencias=new ArrayList<PresuTransferencia>();
							presutransferencias.addAll(presutransferenciasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPresuProyecto")) {
				this.sDetalleReporte=PresuTransferenciaConstantesFunciones.getDetalleIndiceFK_IdPresuProyecto(id_presu_proyectoFK_IdPresuProyecto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presutransferenciaLogic.getPresuTransferenciasFK_IdPresuProyecto(finalQueryGlobal,pagination,id_presu_proyectoFK_IdPresuProyecto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuTransferenciaConstantesFunciones.getDetalleIndiceFK_IdPresuProyecto(id_presu_proyectoFK_IdPresuProyecto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuTransferenciaConstantesFunciones.getDetalleIndiceFK_IdPresuProyecto(id_presu_proyectoFK_IdPresuProyecto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presutransferenciaLogic.getPresuTransferencias()==null||presutransferenciaLogic.getPresuTransferencias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presutransferencias==null|| presutransferencias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presutransferenciasAux=new ArrayList<PresuTransferencia>();
						presutransferenciasAux.addAll(presutransferenciaLogic.getPresuTransferencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutransferenciasAux=new ArrayList<PresuTransferencia>();
							presutransferenciasAux.addAll(presutransferencias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presutransferenciaLogic.getPresuTransferenciasFK_IdPresuProyecto(finalQueryGlobal,pagination,id_presu_proyectoFK_IdPresuProyecto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuTransferenciaConstantesFunciones.getDetalleIndiceFK_IdPresuProyecto(id_presu_proyectoFK_IdPresuProyecto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuTransferenciaConstantesFunciones.getDetalleIndiceFK_IdPresuProyecto(id_presu_proyectoFK_IdPresuProyecto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuTransferencias("FK_IdPresuProyecto",presutransferenciaLogic.getPresuTransferencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuTransferencias("FK_IdPresuProyecto",presutransferencias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presutransferenciaLogic.setPresuTransferencias(new ArrayList<PresuTransferencia>());
						presutransferenciaLogic.getPresuTransferencias().addAll(presutransferenciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutransferencias=new ArrayList<PresuTransferencia>();
							presutransferencias.addAll(presutransferenciasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPresuTransferencia();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPresuTransferencia();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presutransferenciaLogic.getPresuTransferencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presutransferencias.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presutransferenciaLogic.getPresuTransferencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presutransferencias.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PresuTransferencia presutransferencia) {
		Boolean permite=true;
		
		if(this.presutransferencia.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PresuTransferenciaConstantesFunciones.getOrderByListaPresuTransferencia();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PresuTransferenciaConstantesFunciones.getOrderByListaPresuTransferencia();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuTransferencia presutransferencia:presutransferenciaLogic.getPresuTransferencias()) {
				if(presutransferencia.getsType().equals(Constantes2.S_TOTALES)) {
					presutransferenciaTotales=presutransferencia;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuTransferencia presutransferencia:this.presutransferencias) {
				if(presutransferencia.getsType().equals(Constantes2.S_TOTALES)) {
					presutransferenciaTotales=presutransferencia;
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
			this.presutransferenciaAux=new PresuTransferencia();
			this.presutransferenciaAux.setsType(Constantes2.S_TOTALES);
			this.presutransferenciaAux.setIsNew(false);
			this.presutransferenciaAux.setIsChanged(false);
			this.presutransferenciaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PresuTransferenciaConstantesFunciones.TotalizarValoresFilaPresuTransferencia(this.presutransferenciaLogic.getPresuTransferencias(),this.presutransferenciaAux);
				
				this.presutransferenciaLogic.getPresuTransferencias().add(this.presutransferenciaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PresuTransferenciaConstantesFunciones.TotalizarValoresFilaPresuTransferencia(this.presutransferencias,this.presutransferenciaAux);
				
				this.presutransferencias.add(this.presutransferenciaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		presutransferenciaTotales=new PresuTransferencia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presutransferenciaLogic.getPresuTransferencias().remove(presutransferenciaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presutransferencias.remove(presutransferenciaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		presutransferenciaTotales=new PresuTransferencia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuTransferencia presutransferencia:presutransferenciaLogic.getPresuTransferencias()) {
				if(presutransferencia.getsType().equals(Constantes2.S_TOTALES)) {
					presutransferenciaTotales=presutransferencia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresuTransferenciaConstantesFunciones.TotalizarValoresFilaPresuTransferencia(this.presutransferenciaLogic.getPresuTransferencias(),presutransferenciaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuTransferencia presutransferencia:this.presutransferencias) {
				if(presutransferencia.getsType().equals(Constantes2.S_TOTALES)) {
					presutransferenciaTotales=presutransferencia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresuTransferenciaConstantesFunciones.TotalizarValoresFilaPresuTransferencia(this.presutransferencias,presutransferenciaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPresuTransferenciasFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresuTransferenciasFK_IdCuentaContableDestino()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableDestino";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresuTransferenciasFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresuTransferenciasFK_IdPresuProyecto()throws Exception {
		try {
			sAccionBusqueda="FK_IdPresuProyecto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPresuTransferenciasFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presutransferenciaLogic.getPresuTransferenciasFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresuTransferenciasFK_IdCuentaContableDestino(String sFinalQuery,Long id_cuenta_contable_destino)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presutransferenciaLogic.getPresuTransferenciasFK_IdCuentaContableDestino(sFinalQuery,this.pagination,id_cuenta_contable_destino);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresuTransferenciasFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presutransferenciaLogic.getPresuTransferenciasFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresuTransferenciasFK_IdPresuProyecto(String sFinalQuery,Long id_presu_proyecto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presutransferenciaLogic.getPresuTransferenciasFK_IdPresuProyecto(sFinalQuery,this.pagination,id_presu_proyecto);
				
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
	
	public void inicializarPermisosPresuTransferencia() {
		this.isPermisoTodoPresuTransferencia=false;
		this.isPermisoNuevoPresuTransferencia=false;
		this.isPermisoActualizarPresuTransferencia=false;
		this.isPermisoActualizarOriginalPresuTransferencia=false;
		this.isPermisoEliminarPresuTransferencia=false;
		this.isPermisoGuardarCambiosPresuTransferencia=false;
		this.isPermisoConsultaPresuTransferencia=false;
		this.isPermisoBusquedaPresuTransferencia=false;
		this.isPermisoReportePresuTransferencia=false;		
		this.isPermisoOrdenPresuTransferencia=false;		
		this.isPermisoPaginacionMedioPresuTransferencia=false;		
		this.isPermisoPaginacionAltoPresuTransferencia=false;
		this.isPermisoPaginacionTodoPresuTransferencia=false;
		this.isPermisoCopiarPresuTransferencia=false;		
		this.isPermisoVerFormPresuTransferencia=false;		
		this.isPermisoDuplicarPresuTransferencia=false;		
		this.isPermisoOrdenPresuTransferencia=false;		
	}
	
	public void setPermisosUsuarioPresuTransferencia(Boolean isPermiso) {
		this.isPermisoTodoPresuTransferencia=isPermiso;
		this.isPermisoNuevoPresuTransferencia=isPermiso;
		this.isPermisoActualizarPresuTransferencia=isPermiso;
		this.isPermisoActualizarOriginalPresuTransferencia=isPermiso;
		this.isPermisoEliminarPresuTransferencia=isPermiso;
		this.isPermisoGuardarCambiosPresuTransferencia=isPermiso;
		this.isPermisoConsultaPresuTransferencia=isPermiso;
		this.isPermisoBusquedaPresuTransferencia=isPermiso;
		this.isPermisoReportePresuTransferencia=isPermiso;
		this.isPermisoOrdenPresuTransferencia=isPermiso;		
		this.isPermisoPaginacionMedioPresuTransferencia=isPermiso;		
		this.isPermisoPaginacionAltoPresuTransferencia=isPermiso;		
		this.isPermisoPaginacionTodoPresuTransferencia=isPermiso;		
		this.isPermisoCopiarPresuTransferencia=isPermiso;		
		this.isPermisoVerFormPresuTransferencia=isPermiso;		
		this.isPermisoDuplicarPresuTransferencia=isPermiso;
		this.isPermisoOrdenPresuTransferencia=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPresuTransferencia(Boolean isPermiso) {
		//this.isPermisoTodoPresuTransferencia=isPermiso;
		this.isPermisoNuevoPresuTransferencia=isPermiso;
		this.isPermisoActualizarPresuTransferencia=isPermiso;
		this.isPermisoActualizarOriginalPresuTransferencia=isPermiso;
		this.isPermisoEliminarPresuTransferencia=isPermiso;
		this.isPermisoGuardarCambiosPresuTransferencia=isPermiso;
		//this.isPermisoConsultaPresuTransferencia=isPermiso;
		//this.isPermisoBusquedaPresuTransferencia=isPermiso;
		//this.isPermisoReportePresuTransferencia=isPermiso;
		//this.isPermisoOrdenPresuTransferencia=isPermiso;		
		//this.isPermisoPaginacionMedioPresuTransferencia=isPermiso;		
		//this.isPermisoPaginacionAltoPresuTransferencia=isPermiso;		
		//this.isPermisoPaginacionTodoPresuTransferencia=isPermiso;		
		//this.isPermisoCopiarPresuTransferencia=isPermiso;		
		//this.isPermisoDuplicarPresuTransferencia=isPermiso;
		//this.isPermisoOrdenPresuTransferencia=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPresuTransferenciaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PresuTransferenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPresuTransferencia(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPresuTransferenciaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPresuTransferenciaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPresuTransferenciaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPresuTransferenciaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPresuTransferencia() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PresuTransferenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PresuTransferenciaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPresuTransferencia=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPresuTransferencia=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPresuTransferencia=this.isPermisoActualizarPresuTransferencia;
			this.isPermisoEliminarPresuTransferencia=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPresuTransferencia=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPresuTransferencia=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPresuTransferencia=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPresuTransferencia=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePresuTransferencia=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresuTransferencia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPresuTransferencia=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPresuTransferencia=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPresuTransferencia=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPresuTransferencia=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPresuTransferencia=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPresuTransferencia=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresuTransferencia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPresuTransferencia.setToolTipText(this.jTableDatosPresuTransferencia.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPresuTransferencia(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPresuTransferencia(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PresuTransferenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PresuTransferenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPresuTransferencia() throws Exception {
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
	public void inicializarCombosForeignKeyPresuTransferenciaListas()throws Exception {
		try	{						
			
				this.presuproyectosForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
				this.cuentacontabledestinosForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPresuTransferenciaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PresuTransferenciaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPresuTransferenciaListas(false);
			} else {
			
				this.cargarCombosForeignKeyPresuProyectoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableDestinoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyPresuProyectoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.presuproyectosForeignKey==null||this.presuproyectosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PresuProyectoConstantesFunciones.getArrayColumnasGlobalesPresuProyecto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PresuProyectoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PresuProyectoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPresuProyectosForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyCuentaContableDestinoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontabledestinosForeignKey==null||this.cuentacontabledestinosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContableDestinosForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyPresuTransferenciaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PresuTransferenciaParameterReturnGeneral presutransferenciaReturnGeneral=new PresuTransferenciaParameterReturnGeneral();
						
			


				String finalQueryGlobalPresuProyecto="";

				if(((this.presuproyectosForeignKey==null||this.presuproyectosForeignKey.size()<=0) && this.presutransferenciaConstantesFunciones.cargarid_presu_proyectoPresuTransferencia)
					 || (this.esRecargarFks && this.presutransferenciaConstantesFunciones.cargarid_presu_proyectoPresuTransferencia)) {

					if(!this.presutransferenciaSessionBean.getisBusquedaDesdeForeignKeySesionPresuProyecto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PresuProyectoConstantesFunciones.getArrayColumnasGlobalesPresuProyecto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPresuProyecto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PresuProyectoConstantesFunciones.TABLENAME);

						finalQueryGlobalPresuProyecto=Funciones.GetFinalQueryAppend(finalQueryGlobalPresuProyecto, "");
						finalQueryGlobalPresuProyecto+=PresuProyectoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPresuProyectosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPresuProyecto=" WHERE " + ConstantesSql.ID + "="+presutransferenciaSessionBean.getlidPresuProyectoActual();
					}
				} else {
					finalQueryGlobalPresuProyecto="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.presutransferenciaConstantesFunciones.cargarid_cuenta_contablePresuTransferencia)
					 || (this.esRecargarFks && this.presutransferenciaConstantesFunciones.cargarid_cuenta_contablePresuTransferencia)) {

					if(!this.presutransferenciaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+presutransferenciaSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}


				String finalQueryGlobalCuentaContableDestino="";

				if(((this.cuentacontabledestinosForeignKey==null||this.cuentacontabledestinosForeignKey.size()<=0) && this.presutransferenciaConstantesFunciones.cargarid_cuenta_contable_destinoPresuTransferencia)
					 || (this.esRecargarFks && this.presutransferenciaConstantesFunciones.cargarid_cuenta_contable_destinoPresuTransferencia)) {

					if(!this.presutransferenciaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDestino()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableDestino=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableDestino=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableDestino, "");
						finalQueryGlobalCuentaContableDestino+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableDestinosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableDestino=" WHERE " + ConstantesSql.ID + "="+presutransferenciaSessionBean.getlidCuentaContableDestinoActual();
					}
				} else {
					finalQueryGlobalCuentaContableDestino="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.presutransferenciaConstantesFunciones.cargarid_empleadoPresuTransferencia)
					 || (this.esRecargarFks && this.presutransferenciaConstantesFunciones.cargarid_empleadoPresuTransferencia)) {

					if(!this.presutransferenciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+presutransferenciaSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				presutransferenciaReturnGeneral=presutransferenciaLogic.cargarCombosLoteForeignKeyPresuTransferencia(finalQueryGlobalPresuProyecto,finalQueryGlobalCuentaContable,finalQueryGlobalCuentaContableDestino,finalQueryGlobalEmpleado);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPresuProyecto.equals("NONE")) {
				this.presuproyectosForeignKey=presutransferenciaReturnGeneral.getpresuproyectosForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=presutransferenciaReturnGeneral.getcuentacontablesForeignKey();
			}

			if(!finalQueryGlobalCuentaContableDestino.equals("NONE")) {
				this.cuentacontabledestinosForeignKey=presutransferenciaReturnGeneral.getcuentacontabledestinosForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=presutransferenciaReturnGeneral.getempleadosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPresuTransferencia()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPresuProyecto();
			this.addItemDefectoCombosForeignKeyCuentaContable();
			this.addItemDefectoCombosForeignKeyCuentaContableDestino();
			this.addItemDefectoCombosForeignKeyEmpleado();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPresuProyecto()throws Exception {
		try {
			if(this.presutransferenciaSessionBean==null) {
				this.presutransferenciaSessionBean=new PresuTransferenciaSessionBean();
			}

			if(!this.presutransferenciaSessionBean.getisBusquedaDesdeForeignKeySesionPresuProyecto()) {
				PresuProyecto presuproyecto=new PresuProyecto();
				PresuProyectoConstantesFunciones.setPresuProyectoDescripcion(presuproyecto,Constantes.SMENSAJE_ESCOJA_OPCION);
				presuproyecto.setId(null);

				if(!PresuProyectoConstantesFunciones.ExisteEnLista(this.presuproyectosForeignKey,presuproyecto,true)) {

					this.presuproyectosForeignKey.add(0,presuproyecto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.presutransferenciaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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

	public void addItemDefectoCombosForeignKeyCuentaContableDestino()throws Exception {
		try {

			if(!this.presutransferenciaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableDestino()) {
				CuentaContable cuentacontabledestino=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontabledestino,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontabledestino.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontabledestinosForeignKey,cuentacontabledestino,true)) {

					this.cuentacontabledestinosForeignKey.add(0,cuentacontabledestino);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.presutransferenciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
	
	public void initActionsCombosTodosForeignKeyPresuTransferencia()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPresuTransferencia(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPresuTransferencia()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
				this.presutransferencia.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresuTransferencia();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPresuTransferencia(PresuTransferencia presutransferencia)throws Exception {	
		try {
			
			this.setActualPresuProyectoForeignKey(presutransferencia.getid_presu_proyecto(),false,"Formulario");
			this.setActualCuentaContableForeignKey(presutransferencia.getid_cuenta_contable(),false,"Formulario");
			this.setActualCuentaContableDestinoForeignKey(presutransferencia.getid_cuenta_contable_destino(),false,"Formulario");
			this.setActualEmpleadoForeignKey(presutransferencia.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPresuTransferencia(PresuTransferencia presutransferencia,String sTipoEvento)throws Exception {	
		try {
			
			

				if(presutransferencia.getCuentaContable()!=null && !sTipoEvento.equals("id_cuenta_contablePresuTransferencia")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablesForeignKey.add(presutransferencia.getCuentaContable());

					this.addItemDefectoCombosForeignKeyCuentaContable();
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				if(presutransferencia.getCuentaContableDestino()!=null && !sTipoEvento.equals("id_cuenta_contable_destinoPresuTransferencia")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontabledestinosForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontabledestinosForeignKey.add(presutransferencia.getCuentaContableDestino());

					this.addItemDefectoCombosForeignKeyCuentaContableDestino();
					this.cargarCombosFrameCuentaContableDestinosForeignKey("Todos");
				}

				if(presutransferencia.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoPresuTransferencia")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(presutransferencia.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPresuTransferencia()throws Exception {	
		try {
			
			this.setActualPresuProyectoForeignKey(this.presutransferenciaConstantesFunciones.getid_presu_proyecto(),false,"Formulario");
			this.setActualCuentaContableForeignKey(this.presutransferenciaConstantesFunciones.getid_cuenta_contable(),false,"Formulario");
			this.setActualCuentaContableDestinoForeignKey(this.presutransferenciaConstantesFunciones.getid_cuenta_contable_destino(),false,"Formulario");
			this.setActualEmpleadoForeignKey(this.presutransferenciaConstantesFunciones.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPresuTransferencia()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPresuTransferencia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPresuTransferencia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPresuTransferencia()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPresuTransferencia()throws Exception {
		try {
			

			this.cargarCombosFramePresuProyectosForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");
			this.cargarCombosFrameCuentaContableDestinosForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPresuTransferencia(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePresuProyectosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableDestinosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPresuTransferencia()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_presu_proyectoPresuTransferencia!=null && this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_presu_proyectoPresuTransferencia.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_presu_proyectoPresuTransferencia.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contablePresuTransferencia!=null && this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contablePresuTransferencia.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contablePresuTransferencia.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contable_destinoPresuTransferencia!=null && this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contable_destinoPresuTransferencia.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contable_destinoPresuTransferencia.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_empleadoPresuTransferencia!=null && this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_empleadoPresuTransferencia.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_empleadoPresuTransferencia.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public PresuTransferenciaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PresuTransferenciaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PresuTransferenciaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.presutransferenciaSessionBean=new PresuTransferenciaSessionBean(); 
		this.presutransferenciaConstantesFunciones=new PresuTransferenciaConstantesFunciones(); 
		this.presutransferenciaBean=new PresuTransferencia();//(this.presutransferenciaConstantesFunciones); 		
		this.presutransferenciaReturnGeneral=new PresuTransferenciaParameterReturnGeneral(); 
		
		this.presutransferenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presutransferenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PresuTransferenciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PresuTransferenciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PresuTransferenciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPresuTransferencia(true);
			
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
			
			this.presutransferenciaConstantesFunciones=new PresuTransferenciaConstantesFunciones(); 
			this.presutransferenciaBean=new PresuTransferencia();//this.presutransferenciaConstantesFunciones); 			
			this.presutransferenciaReturnGeneral=new PresuTransferenciaParameterReturnGeneral(); 
		
			PresuTransferenciaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Transferencia Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.presutransferencia=new PresuTransferencia();
			this.presutransferencias = new ArrayList<PresuTransferencia>();
			this.presutransferenciasAux = new ArrayList<PresuTransferencia>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic=new PresuTransferenciaLogic();
				this.presutransferenciaLogic.getNewConnexionToDeep("");
			}
			
			//this.presutransferenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.presutransferenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPresuTransferencia);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPresuTransferencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresuTransferencia);	
					}
					
					if(this.jInternalFrameImportacionPresuTransferencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresuTransferencia);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPresuTransferencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPresuTransferencia);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPresuTransferencia);
				this.jInternalFrameDetalleFormPresuTransferencia.setVisible(false);
				this.jInternalFrameDetalleFormPresuTransferencia.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPresuTransferencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresuTransferencia);
					this.jInternalFrameReporteDinamicoPresuTransferencia.setVisible(false);
					this.jInternalFrameReporteDinamicoPresuTransferencia.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPresuTransferencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPresuTransferencia);
					this.jInternalFrameImportacionPresuTransferencia.setVisible(false);
					this.jInternalFrameImportacionPresuTransferencia.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPresuTransferencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPresuTransferencia);
					this.jInternalFrameOrderByPresuTransferencia.setVisible(false);
					this.jInternalFrameOrderByPresuTransferencia.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPresuTransferenciaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PresuTransferenciaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.presutransferenciaReturnGeneral=new PresuTransferenciaParameterReturnGeneral();
			
			this.presutransferenciaParameterGeneral=new PresuTransferenciaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.presutransferenciaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PresuTransferenciaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresuTransferenciaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presutransferenciaSessionBean.getEsGuardarRelacionado(),this.presutransferenciaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresuTransferenciaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presutransferenciaSessionBean.getEsGuardarRelacionado(),this.presutransferenciaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPresuTransferencia=false;
			this.isVisibilidadCeldaDuplicarPresuTransferencia=true;
			this.isVisibilidadCeldaCopiarPresuTransferencia=true;
			this.isVisibilidadCeldaVerFormPresuTransferencia=true;
			this.isVisibilidadCeldaOrdenPresuTransferencia=true;
			this.isVisibilidadCeldaNuevoRelacionesPresuTransferencia=false;
			this.isVisibilidadCeldaModificarPresuTransferencia=false;
			this.isVisibilidadCeldaActualizarPresuTransferencia=false;
			this.isVisibilidadCeldaEliminarPresuTransferencia=false;
			this.isVisibilidadCeldaCancelarPresuTransferencia=false;
			this.isVisibilidadCeldaGuardarPresuTransferencia=false;
			this.isVisibilidadCeldaGuardarCambiosPresuTransferencia=false;
			
			
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdCuentaContableDestino=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdPresuProyecto=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPresuTransferencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPresuTransferencia();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPresuTransferencia(false);
			
			this.setPermisosUsuarioPresuTransferencia();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado() 
				|| (this.presutransferenciaSessionBean.getEsGuardarRelacionado() && this.presutransferenciaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPresuTransferenciaClasesRelacionadas();
			}
			
			if(this.presutransferenciaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPresuTransferenciaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPresuTransferencia();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPresuTransferencia();
			}
			
			if(!this.isPermisoBusquedaPresuTransferencia) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPresuTransferencia.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPresuTransferencia,this.isPermisoPaginacionMedioPresuTransferencia,this.isPermisoPaginacionTodoPresuTransferencia);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PresuTransferenciaConstantesFunciones.getTiposSeleccionarPresuTransferencia());
				
				this.tiposColumnasSelect=PresuTransferenciaConstantesFunciones.getTiposSeleccionarPresuTransferencia(true);
				
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
			//if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPresuTransferencia();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioPresuTransferencia(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioPresuTransferencia(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPresuTransferencia() ;
			
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
			
			this.presuproyectoLogic=new PresuProyectoLogic();
			this.cuentacontableLogic=new CuentaContableLogic();
			this.cuentacontabledestinoLogic=new CuentaContableLogic();
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
				presutransferenciaImplementable= (PresuTransferenciaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresuTransferenciaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				presutransferenciaImplementableHome= (PresuTransferenciaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresuTransferenciaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.presutransferencias= new ArrayList<PresuTransferencia>();
			this.presutransferenciasEliminados= new ArrayList<PresuTransferencia>();
						
			this.isEsNuevoPresuTransferencia=false;
			this.esParaAccionDesdeFormularioPresuTransferencia=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCuentaContableActual=0L;
			this.idCuentaContableDestinoActual=0L;
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.presuproyectosForeignKey=new ArrayList<PresuProyecto>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			this.cuentacontabledestinosForeignKey=new ArrayList<CuentaContable>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPresuTransferencia(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPresuTransferencia();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PresuTransferenciaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PresuTransferenciaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPresuTransferencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPresuTransferencia(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPresuTransferencia();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPresuTransferencia();
			}
			
			PresuTransferenciaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPresuTransferencia.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPresuTransferencia.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPresuTransferencia.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPresuTransferencia(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PresuTransferencia: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPresuTransferencia() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPresuTransferencia")) {
				iIndex=this.jInternalFrameDetalleFormPresuTransferencia.jTabbedPaneRelacionesPresuTransferencia.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPresuTransferencia.jTabbedPaneRelacionesPresuTransferencia.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPresuTransferencia();	
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
	
	public void cargarCombosForeignKeyPresuTransferencia(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPresuTransferencia(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPresuTransferencia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPresuTransferenciaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPresuTransferencia();
		
		this.cargarCombosFrameForeignKeyPresuTransferencia();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPresuTransferencia();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPresuTransferencia();
		}
	}
	
	

	public void cargarCombosForeignKeyPresuProyecto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPresuProyectoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPresuProyecto();
				this.cargarCombosFramePresuProyectosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPresuProyecto(this.presuproyectosForeignKey);

		} catch(Exception e) {
			throw e;
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

	public void cargarCombosForeignKeyCuentaContableDestino(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableDestinoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContableDestino();
				this.cargarCombosFrameCuentaContableDestinosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContableDestino(this.cuentacontabledestinosForeignKey);

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
	
	public void jButtonNuevoPresuTransferenciaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.presutransferenciaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPresuTransferencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
			
			
			if(jTableDatosPresuTransferencia.getRowCount()>=1) {
				jTableDatosPresuTransferencia.removeRowSelectionInterval(0, jTableDatosPresuTransferencia.getRowCount()-1);						
			}
			
			this.isEsNuevoPresuTransferencia=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPresuTransferencia(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPresuTransferencia(true);			
			//this.presutransferencia=new PresuTransferencia();
			//this.presutransferencia.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresuTransferencia(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuTransferencia() ;
			
			if(PresuTransferenciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresuTransferencia(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.presutransferencia);	
			this.actualizarInformacion("INFO_PADRE",false,this.presutransferencia);				
			
			PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
			
			if(this.presutransferenciaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PresuTransferencia: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPresuTransferenciaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PresuTransferencia> presutransferenciasSeleccionados=new ArrayList<PresuTransferencia>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPresuTransferencia.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPresuTransferencia.getSelectedRows().length;			
			}
			
			presutransferenciasSeleccionados=this.getPresuTransferenciasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPresuTransferencia--;			
				//PresuTransferencia presutransferenciaAux= new PresuTransferencia();			
				//presutransferenciaAux.setId(this.iIdNuevoPresuTransferencia);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PresuTransferencia presutransferenciaOrigen=new PresuTransferencia();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PresuTransferencia presutransferenciaOrigen : presutransferenciasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							presutransferenciaOrigen =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutransferenciaOrigen =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPresuTransferencia();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.presutransferencia.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPresuTransferencia(presutransferenciaOrigen,this.presutransferencia,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presutransferenciaLogic.getPresuTransferencias().add(this.presutransferenciaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presutransferencias.add(this.presutransferenciaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPresuTransferencia(false);
				
				this.jTableDatosPresuTransferencia.setRowSelectionInterval(this.getIndiceNuevoPresuTransferencia(), this.getIndiceNuevoPresuTransferencia());
				
				int iLastRow =  this.jTableDatosPresuTransferencia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresuTransferencia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresuTransferencia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresuTransferencia(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PresuTransferencia> presutransferenciasSeleccionados=new ArrayList<PresuTransferencia>();									
		
			PresuTransferencia presutransferenciaOrigen=new PresuTransferencia();
			PresuTransferencia presutransferenciaDestino=new PresuTransferencia();
				
			presutransferenciasSeleccionados=this.getPresuTransferenciasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPresuTransferencia.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || presutransferenciasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPresuTransferencia.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presutransferenciaOrigen =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presutransferenciaOrigen =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presutransferenciaDestino =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presutransferenciaDestino =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				presutransferenciaOrigen =presutransferenciasSeleccionados.get(0);
				presutransferenciaDestino =presutransferenciasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPresuTransferencia(presutransferenciaOrigen,presutransferenciaDestino,true,false);
				
				presutransferenciaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presutransferenciaDestino,presutransferenciaLogic.getPresuTransferencias());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presutransferenciaDestino,presutransferencias);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPresuTransferencia(false);
				
				//this.jTableDatosPresuTransferencia.setRowSelectionInterval(this.getIndiceNuevoPresuTransferencia(), this.getIndiceNuevoPresuTransferencia());
				
				int iLastRow =  this.jTableDatosPresuTransferencia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresuTransferencia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresuTransferencia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresuTransferencia(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresuTransferencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPresuTransferencia.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPresuTransferencia.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPresuTransferencia.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPresuTransferencia.setVisible(!isVisible);
			this.jPanelPaginacionPresuTransferencia.setVisible(!isVisible);
			this.jPanelAccionesPresuTransferencia.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePresuTransferencia();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPresuTransferencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPresuTransferencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPresuTransferencia();
			
			this.abrirFrameOrderByPresuTransferencia();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPresuTransferencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePresuTransferencia(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresuTransferencia);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPresuTransferencia.isMaximum()) {
					this.jInternalFrameDetalleFormPresuTransferencia.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPresuTransferencia.setSize(this.jInternalFrameDetalleFormPresuTransferencia.iWidthFormulario,this.jInternalFrameDetalleFormPresuTransferencia.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPresuTransferencia.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPresuTransferencia.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPresuTransferencia.isMaximum()) {
						this.jInternalFrameDetalleFormPresuTransferencia.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPresuTransferencia.jContentPaneDetallePresuTransferencia.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPresuTransferencia.jTabbedPaneRelacionesPresuTransferencia.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPresuTransferencia.jContentPaneDetallePresuTransferencia.getWidth(),PresuTransferenciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresuTransferencia.jTabbedPaneRelacionesPresuTransferencia.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPresuTransferencia.jContentPaneDetallePresuTransferencia.getWidth(),PresuTransferenciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresuTransferencia.jTabbedPaneRelacionesPresuTransferencia.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPresuTransferencia.jContentPaneDetallePresuTransferencia.getWidth(),PresuTransferenciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPresuTransferencia.setVisible(true);
	        this.jInternalFrameDetalleFormPresuTransferencia.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPresuTransferencia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPresuTransferencia==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPresuTransferencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuTransferencia,false,this);
				} else {
					this.jInternalFrameOrderByPresuTransferencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuTransferencia,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPresuTransferencia);
				this.jInternalFrameOrderByPresuTransferencia.setVisible(false);
				this.jInternalFrameOrderByPresuTransferencia.setSelected(false);
				
				this.jInternalFrameOrderByPresuTransferencia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresuTransferencia"));
				
				this.inicializarActualizarBindingTablaOrderByPresuTransferencia();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPresuTransferencia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPresuTransferencia==null) {
				
				this.jInternalFrameImportacionPresuTransferencia=new ImportacionJInternalFrame(PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresuTransferencia);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPresuTransferencia);
				this.jInternalFrameImportacionPresuTransferencia.setVisible(false);
				this.jInternalFrameImportacionPresuTransferencia.setSelected(false);


				this.jInternalFrameImportacionPresuTransferencia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresuTransferencia"));
				this.jInternalFrameImportacionPresuTransferencia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresuTransferencia"));
				this.jInternalFrameImportacionPresuTransferencia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresuTransferencia"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPresuTransferencia() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPresuTransferencia==null) {
				this.jInternalFrameReporteDinamicoPresuTransferencia=new ReporteDinamicoJInternalFrame(PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresuTransferencia);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresuTransferencia);
				this.jInternalFrameReporteDinamicoPresuTransferencia.setVisible(false);
				this.jInternalFrameReporteDinamicoPresuTransferencia.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPresuTransferencia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresuTransferencia"));
				this.jInternalFrameReporteDinamicoPresuTransferencia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresuTransferencia"));
				this.jInternalFrameReporteDinamicoPresuTransferencia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresuTransferencia"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresuTransferencia();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePresuTransferencia() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresuTransferencia);
			
	       	this.jInternalFrameDetalleFormPresuTransferencia.setVisible(false);
	        this.jInternalFrameDetalleFormPresuTransferencia.setSelected(false);
			
			//this.jInternalFrameDetalleFormPresuTransferencia.dispose();
			//this.jInternalFrameDetalleFormPresuTransferencia=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPresuTransferencia() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPresuTransferencia.setVisible(true);
	        this.jInternalFrameReporteDinamicoPresuTransferencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPresuTransferencia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPresuTransferencia.setVisible(true);
	        this.jInternalFrameImportacionPresuTransferencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPresuTransferencia() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPresuTransferencia.setVisible(true);
	        this.jInternalFrameOrderByPresuTransferencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPresuTransferencia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPresuTransferencia.setVisible(false);
	        this.jInternalFrameOrderByPresuTransferencia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPresuTransferencia() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPresuTransferencia.setVisible(false);
	        this.jInternalFrameReporteDinamicoPresuTransferencia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPresuTransferencia() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPresuTransferencia.setVisible(false);
	        this.jInternalFrameImportacionPresuTransferencia.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeCuentaContable(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContable";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderPresuTransferencia=(TitledBorder)this.jScrollPanelDatosPresuTransferencia.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderPresuTransferencia.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContable(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
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

				public void abrirFrameTreeCuentaContableDestino(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContableDestino";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderPresuTransferencia=(TitledBorder)this.jScrollPanelDatosPresuTransferencia.getBorder();
						TitledBorder titledBorderCuentaContableDestino=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableDestino.setTitle(titledBorderPresuTransferencia.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContableDestino(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
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
	
	public void jButtonModificarPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPresuTransferencia(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPresuTransferencia(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPresuTransferencia(true);
			//this.isEsNuevoPresuTransferencia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferencia =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presutransferencia =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPresuTransferencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresuTransferencia(false) ;
			
			if(presutransferenciaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PresuTransferenciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresuTransferencia(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuTransferencia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPresuTransferenciaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferencia =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutransferencia =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPresuTransferencia(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresuTransferencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPresuTransferencia(true);
			//this.isEsNuevoPresuTransferencia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferencia =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presutransferencia =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.presutransferencia.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPresuTransferencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPresuTransferencia(false) ;
			
			if(PresuTransferenciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresuTransferencia(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuTransferencia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CuentaContable")) {
				if(!this.presutransferenciaConstantesFunciones.cargarid_cuenta_contablePresuTransferencia) {
					this.cargarCombosCuentaContablesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingPresuTransferencia(false,false);
					this.cargarCombosFrameCuentaContablesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable (id);

				this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

			}
			
			if(sType.equals("CuentaContableDestino")) {
				if(!this.presutransferenciaConstantesFunciones.cargarid_cuenta_contable_destinoPresuTransferencia) {
					this.cargarCombosCuentaContableDestinosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingPresuTransferencia(false,false);
					this.cargarCombosFrameCuentaContableDestinosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable_destino (id);

				this.recargarComboTablaCuentaContableDestino(this.cuentacontabledestinosForeignKey);

			}
			
			if(sType.equals("Empleado")) {
				if(!this.presutransferenciaConstantesFunciones.cargarid_empleadoPresuTransferencia) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingPresuTransferencia(false,false);
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_empleado (id);

				this.recargarComboTablaEmpleado(this.empleadosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPresuProyecto(List<PresuProyecto> presuproyectosForeignKey)throws Exception{
		TableColumn tableColumnPresuProyecto=this.jTableDatosPresuTransferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTransferencia,PresuTransferenciaConstantesFunciones.LABEL_IDPRESUPROYECTO));
		TableCellEditor tableCellEditorPresuProyecto =tableColumnPresuProyecto.getCellEditor();

		PresuProyectoTableCell presuproyectoTableCellFk=(PresuProyectoTableCell)tableCellEditorPresuProyecto;

		if(presuproyectoTableCellFk!=null) {
			presuproyectoTableCellFk.setpresuproyectosForeignKey(presuproyectosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresuTransferencia.getSelectedRow();

		//if(intSelectedRow<=0) {
			//presuproyectoTableCellFk.setRowActual(intSelectedRow);
			//presuproyectoTableCellFk.setpresuproyectosForeignKeyActual(presuproyectosForeignKey);
		//}


		if(presuproyectoTableCellFk!=null) {
			presuproyectoTableCellFk.RecargarPresuProyectosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosPresuTransferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTransferencia,PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresuTransferencia.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContableDestino(List<CuentaContable> cuentacontabledestinosForeignKey)throws Exception{
		TableColumn tableColumnCuentaContableDestino=this.jTableDatosPresuTransferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTransferencia,PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLEDESTINO));
		TableCellEditor tableCellEditorCuentaContableDestino =tableColumnCuentaContableDestino.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableDestino;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontabledestinosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresuTransferencia.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontabledestinosForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosPresuTransferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTransferencia,PresuTransferenciaConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPresuTransferencia.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable (Long id) throws Exception {
		this.setActualCuentaContableForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable_destino (Long id) throws Exception {
		this.setActualCuentaContableDestinoForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPresuTransferencia(false);
			
			//if(!this.isEsNuevoPresuTransferencia) {								
				int intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferencia =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presutransferencia =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PresuTransferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPresuTransferencia(this.presutransferencia,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);
				
			}
			
			if(this.permiteMantenimiento(this.presutransferencia)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPresuTransferencia=true;
					this.inicializarActualizarBindingTablaPresuTransferencia(false);
					this.isEsNuevoPresuTransferencia=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPresuTransferencia=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPresuTransferencia=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresuTransferencia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresuTransferencia(false);
				
				this.habilitarDeshabilitarControlesPresuTransferencia(false);
			
												
				
				if(PresuTransferenciaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePresuTransferencia();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPresuTransferenciaActionPerformed(evt,presutransferenciaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPresuTransferencia(this.presutransferencia,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPresuTransferencia.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,presutransferenciaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.presutransferencia.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PresuTransferencia.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTransferencia.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferencia =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				this.presutransferencia.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presutransferencia =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				this.presutransferencia.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.presutransferencia)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PresuTransferenciaModel) this.jTableDatosPresuTransferencia.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPresuTransferencia=true;
				this.inicializarActualizarBindingTablaPresuTransferencia(false);
				this.isEsNuevoPresuTransferencia=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresuTransferencia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresuTransferencia(false);
				
				this.habilitarDeshabilitarControlesPresuTransferencia(false);
				
				
				
				if(PresuTransferenciaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePresuTransferencia();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPresuTransferencia.getRowCount()>=1) {
				jTableDatosPresuTransferencia.removeRowSelectionInterval(0, jTableDatosPresuTransferencia.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPresuTransferencia(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPresuTransferencia(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresuTransferencia(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuTransferencia(false) ;
			
			this.isEsNuevoPresuTransferencia=false;
			
			if(PresuTransferenciaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePresuTransferencia();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPresuTransferencia(false);
				
				//SI ES MANUAL
				if(PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPresuTransferencia();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPresuTransferencia--;			
			//PresuTransferencia presutransferenciaAux= new PresuTransferencia();			
			//presutransferenciaAux.setId(this.iIdNuevoPresuTransferencia);
			
			if(this.jInternalFrameDetalleFormPresuTransferencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPresuTransferencia();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);
			
			this.presutransferencia.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.presutransferenciaLogic.getPresuTransferencias().add(this.presutransferenciaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.presutransferencias.add(this.presutransferenciaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPresuTransferencia(false);
			
			this.jTableDatosPresuTransferencia.setRowSelectionInterval(this.getIndiceNuevoPresuTransferencia(), this.getIndiceNuevoPresuTransferencia());
			
			int iLastRow =  this.jTableDatosPresuTransferencia.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPresuTransferencia.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPresuTransferencia.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPresuTransferencia(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPresuTransferencia(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuTransferencia(false);
			
			//SI ES MANUAL
			if(PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresuTransferencia();
			}
			
			//this.abrirFrameTreePresuTransferencia();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE TransferenciaES ?", "MANTENIMIENTO DE Transferencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPresuTransferencia.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPresuTransferencia();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.presutransferenciaReturnGeneral=presutransferenciaLogic.procesarImportacionPresuTransferenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.presutransferenciaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPresuTransferenciaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPresuTransferencia.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPresuTransferencia.setFileImportacion(this.jInternalFrameImportacionPresuTransferencia.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPresuTransferencia.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPresuTransferencia.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPresuTransferencia.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPresuTransferencia.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PresuTransferencia> presutransferenciasSeleccionados=new ArrayList<PresuTransferencia>();		

		presutransferenciasSeleccionados=this.getPresuTransferenciasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuTransferencia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuTransferencia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PresuTransferenciaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PresuTransferenciaBaseDesign.jrxml";
			
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
			
			this.generarReportePresuTransferencias("Todos",presutransferenciasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencia",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPresuTransferencia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuTransferencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresuTransferenciaConstantesFunciones.LABEL_IDPRESUPROYECTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_PresuProyecto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_PresuProyecto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_PresuProyecto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_PresuProyecto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLEDESTINO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableDestino_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableDestino_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableDestino_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableDestino_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuTransferenciaConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuTransferenciaConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuTransferenciaConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuTransferenciaConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoPresuTransferencia.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPresuTransferencia.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPresuTransferencia.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PresuTransferenciaConstantesFunciones.LABEL_IDPRESUPROYECTO:
					sNombreCampoCategoria="id_presu_proyecto";
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLEDESTINO:
					sNombreCampoCategoria="id_cuenta_contable_destino";
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPresuTransferencia.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PresuTransferenciaConstantesFunciones.LABEL_IDPRESUPROYECTO:
					sNombreCampoCategoriaValor="id_presu_proyecto";
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLEDESTINO:
					sNombreCampoCategoriaValor="id_cuenta_contable_destino";
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPresuTransferencia.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuTransferencia.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresuTransferenciaConstantesFunciones.LABEL_IDPRESUPROYECTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Proyecto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_presu_proyecto");
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLEDESTINO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable Destino",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_destino");
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PresuTransferencia> presutransferenciasSeleccionados=new ArrayList<PresuTransferencia>();		
		
		presutransferenciasSeleccionados=this.getPresuTransferenciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presutransferencia";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PresuTransferencias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPresuTransferencia.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuTransferencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PresuTransferenciaConstantesFunciones.LABEL_IDPRESUPROYECTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuTransferenciaConstantesFunciones.LABEL_IDPRESUPROYECTO);
					iRow++;

					for(PresuTransferencia presutransferencia:presutransferenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presutransferencia.getpresuproyecto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(PresuTransferencia presutransferencia:presutransferenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presutransferencia.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLEDESTINO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLEDESTINO);
					iRow++;

					for(PresuTransferencia presutransferencia:presutransferenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presutransferencia.getcuentacontabledestino_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuTransferenciaConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(PresuTransferencia presutransferencia:presutransferenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presutransferencia.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuTransferenciaConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(PresuTransferencia presutransferencia:presutransferenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presutransferencia.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuTransferenciaConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(PresuTransferencia presutransferencia:presutransferenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presutransferencia.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuTransferenciaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuTransferenciaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(PresuTransferencia presutransferencia:presutransferenciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presutransferencia.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelPresuTransferencia(row);				
			//	iRow++;
			//}				
			
			//for(PresuTransferencia presutransferenciaAux:presutransferenciasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPresuTransferencia(presutransferenciaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencia",JOptionPane.INFORMATION_MESSAGE);
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
				this.presutransferenciaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuTransferencia(false);
			
			//SI ES MANUAL
			if(PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresuTransferencia();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuTransferencia(false);
			
			//SI ES MANUAL
			if(PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresuTransferencia();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuTransferencia(false);
			
			//SI ES MANUAL
			if(PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresuTransferencia();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPresuTransferencia() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPresuTransferencia.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPresuTransferencia.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPresuTransferencia.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPresuTransferencia.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPresuTransferencia.setMinimumSize(dimensionMinimum);
		this.jTableDatosPresuTransferencia.setMaximumSize(dimensionMaximum);
		this.jTableDatosPresuTransferencia.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPresuTransferencia(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPresuTransferencia(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPresuTransferencia(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPresuTransferencia(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPresuTransferencia(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPresuTransferencia(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresuTransferencia(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPresuTransferencia(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PresuTransferenciaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPresuTransferencia() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPresuTransferencia();
		
		this.inicializarActualizarBindingBotonesManualPresuTransferencia(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPresuTransferencia();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresuTransferencia() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPresuTransferencia(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPresuTransferencia(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPresuTransferencia.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPresuTransferencia.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePresuTransferencia.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPresuTransferencia.jCheckBoxPostAccionNuevoPresuTransferencia.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPresuTransferencia.jCheckBoxPostAccionSinCerrarPresuTransferencia.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPresuTransferencia.jCheckBoxPostAccionSinMensajePresuTransferencia.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPresuTransferencia.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPresuTransferencia.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePresuTransferencia.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
				this.jInternalFrameDetalleFormPresuTransferencia.jCheckBoxPostAccionNuevoPresuTransferencia.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPresuTransferencia.jCheckBoxPostAccionSinCerrarPresuTransferencia.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPresuTransferencia.jCheckBoxPostAccionSinMensajePresuTransferencia.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPresuTransferencia.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPresuTransferencia.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxTiposAccionesFormularioPresuTransferencia.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPresuTransferencia.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPresuTransferencia!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuTransferencia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPresuTransferencia.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPresuTransferencia.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPresuTransferencia.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPresuTransferencia.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPresuTransferencia!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuTransferencia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPresuTransferencia.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPresuTransferencia.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPresuTransferencia(Boolean esInicializar) throws Exception {
		try	{	
			if(PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPresuTransferencia(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPresuTransferencia() throws Exception {
		try	{
			if(PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPresuTransferencia();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresuTransferencia() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxTiposAccionesFormularioPresuTransferencia.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxTiposAccionesFormularioPresuTransferencia.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPresuTransferencia() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPresuTransferencia.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPresuTransferencia.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPresuTransferencia.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPresuTransferencia.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPresuTransferencia.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPresuTransferencia.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPresuTransferencia.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPresuTransferencia.addItem(reporte);
			}
			
			
			if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPresuTransferencia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPresuTransferencia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPresuTransferencia.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPresuTransferencia.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPresuTransferencia.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPresuTransferencia.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxTiposAccionesFormularioPresuTransferencia.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxTiposAccionesFormularioPresuTransferencia.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPresuTransferencia.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPresuTransferencia.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPresuTransferencia.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresuTransferencia();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresuTransferencia() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresuTransferencia!=null) {
				this.jInternalFrameReporteDinamicoPresuTransferencia.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresuTransferencia.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresuTransferencia!=null) {
				this.jInternalFrameReporteDinamicoPresuTransferencia.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresuTransferencia.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPresuTransferencia!=null) {
				
				if(this.jInternalFrameReporteDinamicoPresuTransferencia.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresuTransferencia.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresuTransferencia.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPresuTransferencia.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresuTransferencia.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresuTransferencia.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPresuTransferencia.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPresuTransferencia.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PresuTransferenciaConstantesFunciones.getTiposSeleccionarPresuTransferencia(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPresuTransferencia.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPresuTransferencia.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPresuTransferencia.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PresuTransferenciaConstantesFunciones.getTiposSeleccionarPresuTransferencia(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPresuTransferencia.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPresuTransferencia.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPresuTransferencia.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PresuTransferenciaConstantesFunciones.getTiposSeleccionarPresuTransferencia(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresuTransferencia.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPresuTransferencia.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPresuTransferencia.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPresuTransferencia.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPresuTransferencia()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresuTransferencia.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContablePresuTransferencia.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia.getSelectedItem()!=null){this.id_cuenta_contable_destinoFK_IdCuentaContableDestino=((CuentaContable)this.jComboBoxid_cuenta_contable_destinoFK_IdCuentaContableDestinoPresuTransferencia.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoFK_IdEmpleadoPresuTransferencia.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoPresuTransferencia.getSelectedItem()).getId();}
		if(this.jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuTransferencia.getSelectedItem()!=null){this.id_presu_proyectoFK_IdPresuProyecto=((PresuProyecto)this.jComboBoxid_presu_proyectoFK_IdPresuProyectoPresuTransferencia.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPresuTransferencia(Boolean esInicializar) throws Exception {				
		if(PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPresuTransferencia();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPresuTransferencia() throws Exception {
		this.inicializarActualizarBindingTablaPresuTransferencia(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPresuTransferencia() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPresuTransferencia.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPresuTransferencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresuTransferencia.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PresuTransferenciaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPresuTransferencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresuTransferencia.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PresuTransferenciaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPresuTransferenciaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTransferenciaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PresuTransferenciaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPresuTransferencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresuTransferencia.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PresuTransferenciaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPresuTransferencia.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPresuTransferencia(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=presutransferenciaLogic.getPresuTransferencias().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=presutransferencias.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PresuTransferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPresuTransferencia.setModel(new PresuTransferenciaModel(this.presutransferenciaLogic.getPresuTransferencias(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPresuTransferencia.setModel(new PresuTransferenciaModel(this.presutransferencias,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPresuTransferencia!=null && this.jInternalFrameOrderByPresuTransferencia.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPresuTransferencia();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPresuTransferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTransferencia,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PresuTransferenciaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO,presutransferenciaConstantesFunciones.resaltarSeleccionarPresuTransferencia,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO,presutransferenciaConstantesFunciones.resaltarSeleccionarPresuTransferencia,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPresuTransferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTransferencia,PresuTransferenciaConstantesFunciones.LABEL_ID));

		if(this.presutransferenciaConstantesFunciones.mostraridPresuTransferencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuTransferenciaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presutransferenciaConstantesFunciones.resaltaridPresuTransferencia,this.presutransferenciaConstantesFunciones.activaridPresuTransferencia,iSizeTabla,this,true,"idPresuTransferencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presutransferenciaConstantesFunciones.resaltaridPresuTransferencia,this.presutransferenciaConstantesFunciones.activaridPresuTransferencia,this,true,"idPresuTransferencia","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuTransferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTransferencia,PresuTransferenciaConstantesFunciones.LABEL_IDPRESUPROYECTO));

		if(this.presutransferenciaConstantesFunciones.mostrarid_presu_proyectoPresuTransferencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuTransferenciaConstantesFunciones.LABEL_IDPRESUPROYECTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PresuProyectoTableCell(this.presuproyectosForeignKey,this.presutransferenciaConstantesFunciones.resaltarid_presu_proyectoPresuTransferencia,this,this.presutransferenciaConstantesFunciones.activarid_presu_proyectoPresuTransferencia,iSizeTabla));
			tableColumn.setCellEditor(new PresuProyectoTableCell(this.presuproyectosForeignKey,this.presutransferenciaConstantesFunciones.resaltarid_presu_proyectoPresuTransferencia,this,this.presutransferenciaConstantesFunciones.activarid_presu_proyectoPresuTransferencia,true,"id_presu_proyectoPresuTransferencia","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuTransferenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuTransferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTransferencia,PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.presutransferenciaConstantesFunciones.mostrarid_cuenta_contablePresuTransferencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.presutransferenciaConstantesFunciones.resaltarid_cuenta_contablePresuTransferencia,this,this.presutransferenciaConstantesFunciones.activarid_cuenta_contablePresuTransferencia,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.presutransferenciaConstantesFunciones.resaltarid_cuenta_contablePresuTransferencia,this,this.presutransferenciaConstantesFunciones.activarid_cuenta_contablePresuTransferencia,true,"id_cuenta_contablePresuTransferencia","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new PresuTransferenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuTransferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTransferencia,PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLEDESTINO));

		if(this.presutransferenciaConstantesFunciones.mostrarid_cuenta_contable_destinoPresuTransferencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLEDESTINO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontabledestinosForeignKey,this.presutransferenciaConstantesFunciones.resaltarid_cuenta_contable_destinoPresuTransferencia,this,this.presutransferenciaConstantesFunciones.activarid_cuenta_contable_destinoPresuTransferencia,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontabledestinosForeignKey,this.presutransferenciaConstantesFunciones.resaltarid_cuenta_contable_destinoPresuTransferencia,this,this.presutransferenciaConstantesFunciones.activarid_cuenta_contable_destinoPresuTransferencia,true,"id_cuenta_contable_destinoPresuTransferencia","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new PresuTransferenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuTransferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTransferencia,PresuTransferenciaConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.presutransferenciaConstantesFunciones.mostrarid_empleadoPresuTransferencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuTransferenciaConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.presutransferenciaConstantesFunciones.resaltarid_empleadoPresuTransferencia,this,this.presutransferenciaConstantesFunciones.activarid_empleadoPresuTransferencia,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.presutransferenciaConstantesFunciones.resaltarid_empleadoPresuTransferencia,this,this.presutransferenciaConstantesFunciones.activarid_empleadoPresuTransferencia,true,"id_empleadoPresuTransferencia","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new PresuTransferenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuTransferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTransferencia,PresuTransferenciaConstantesFunciones.LABEL_FECHA));

		if(this.presutransferenciaConstantesFunciones.mostrarfechaPresuTransferencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuTransferenciaConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.presutransferenciaConstantesFunciones.resaltarfechaPresuTransferencia,this.presutransferenciaConstantesFunciones.activarfechaPresuTransferencia,iSizeTabla,this,true,"fechaPresuTransferencia","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.presutransferenciaConstantesFunciones.resaltarfechaPresuTransferencia,this.presutransferenciaConstantesFunciones.activarfechaPresuTransferencia,this,true,"fechaPresuTransferencia","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PresuTransferenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuTransferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTransferencia,PresuTransferenciaConstantesFunciones.LABEL_VALOR));

		if(this.presutransferenciaConstantesFunciones.mostrarvalorPresuTransferencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuTransferenciaConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presutransferenciaConstantesFunciones.resaltarvalorPresuTransferencia,this.presutransferenciaConstantesFunciones.activarvalorPresuTransferencia,iSizeTabla,this,true,"valorPresuTransferencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presutransferenciaConstantesFunciones.resaltarvalorPresuTransferencia,this.presutransferenciaConstantesFunciones.activarvalorPresuTransferencia,this,true,"valorPresuTransferencia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PresuTransferenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuTransferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTransferencia,PresuTransferenciaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.presutransferenciaConstantesFunciones.mostrardescripcionPresuTransferencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuTransferenciaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.presutransferenciaConstantesFunciones.resaltardescripcionPresuTransferencia,this.presutransferenciaConstantesFunciones.activardescripcionPresuTransferencia,iSizeTabla,this,true,"descripcionPresuTransferencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presutransferenciaConstantesFunciones.resaltardescripcionPresuTransferencia,this.presutransferenciaConstantesFunciones.activardescripcionPresuTransferencia,this,true,"descripcionPresuTransferencia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuTransferenciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presutransferenciaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presutransferenciaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresuTransferencia.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presutransferenciaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presutransferenciaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresuTransferencia.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPresuTransferencia && this.isPermisoGuardarCambiosPresuTransferencia) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.presutransferenciaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.presutransferenciaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPresuTransferencia.addColumn(tableColumn);
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
			
			this.jTableDatosPresuTransferencia.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresuTransferencia && this.isPermisoGuardarCambiosPresuTransferencia) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresuTransferencia && this.isPermisoGuardarCambiosPresuTransferencia) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPresuTransferencia.moveColumn(this.jTableDatosPresuTransferencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPresuTransferencia.moveColumn(this.jTableDatosPresuTransferencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPresuTransferencia.moveColumn(this.jTableDatosPresuTransferencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPresuTransferencia.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPresuTransferencia.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPresuTransferencia,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PresuTransferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPresuTransferencia.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPresuTransferencia.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PresuTransferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PresuTransferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPresuTransferencia.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPresuTransferencia.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPresuTransferencia.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=presutransferenciaLogic.getPresuTransferencias().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=presutransferencias.size()-1;
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
		//this.jTableDatosPresuTransferencia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPresuTransferencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPresuTransferencia();
			
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
				
				//this.isEsNuevoPresuTransferencia=false;
					
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
			
				if(this.presutransferenciaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPresuTransferencia==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresuTransferencia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresuTransferencia.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferencia =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutransferencia =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.presutransferencia.getsType().equals("DUPLICADO")
				   || this.presutransferencia.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPresuTransferencia=true;
				
				} else {
					this.isEsNuevoPresuTransferencia=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
					if(this.presutransferencia.getId()>=0 && !this.presutransferencia.getIsNew()) {						
						this.isEsNuevoPresuTransferencia=false;
						
					} else {
						this.isEsNuevoPresuTransferencia=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPresuTransferencia(esRelaciones);						
				
				this.seleccionarPresuTransferencia(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.presutransferencia.getId()<0) {
					this.isEsNuevoPresuTransferencia=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPresuTransferencia(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPresuTransferencia(evt,rowIndex);
				}	
				
				if(this.presutransferenciaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PresuTransferencia: " + this.dDif); 
					}
				}								
				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPresuTransferencia(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.presutransferencia)) {
					if(this.presutransferencia.getId()>0) {
						this.presutransferencia.setIsDeleted(true);
						
						this.presutransferenciasEliminados.add(this.presutransferencia);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presutransferenciaLogic.getPresuTransferencias().remove(this.presutransferencia);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presutransferencias.remove(this.presutransferencia);				
					}
					
					
					((PresuTransferenciaModel) this.jTableDatosPresuTransferencia.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPresuTransferencia(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPresuTransferencia(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPresuTransferencia) {
			
			if(this.jInternalFrameDetalleFormPresuTransferencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresuTransferencia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresuTransferencia.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferencia =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutransferencia =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PresuTransferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPresuTransferencia(this.presutransferencia);
				}
				
				//ARCHITECTURE
				try {
					

					//PresuProyecto
					if(!this.presutransferenciaConstantesFunciones.cargarid_presu_proyectoPresuTransferencia || this.presutransferenciaConstantesFunciones.event_dependid_presu_proyectoPresuTransferencia) {
						//this.cargarCombosPresuProyectosForeignKeyLista(" where id="+this.presutransferencia.getid_presu_proyecto());
									//this.inicializarActualizarBindingPresuTransferencia(false,false);
						this.presuproyectosForeignKey=new ArrayList<PresuProyecto>();

						if(presutransferencia.getPresuProyecto()!=null) {
							this.presuproyectosForeignKey.add(presutransferencia.getPresuProyecto());
						}

						this.addItemDefectoCombosForeignKeyPresuProyecto();
						this.cargarCombosFramePresuProyectosForeignKey("Todos");
					}
					this.setActualPresuProyectoForeignKey(this.presutransferencia.getid_presu_proyecto(),false,"Formulario");

					//CuentaContable
					if(!this.presutransferenciaConstantesFunciones.cargarid_cuenta_contablePresuTransferencia || this.presutransferenciaConstantesFunciones.event_dependid_cuenta_contablePresuTransferencia) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.presutransferencia.getid_cuenta_contable());
									//this.inicializarActualizarBindingPresuTransferencia(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(presutransferencia.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(presutransferencia.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.presutransferencia.getid_cuenta_contable(),false,"Formulario");

					//CuentaContableDestino
					if(!this.presutransferenciaConstantesFunciones.cargarid_cuenta_contable_destinoPresuTransferencia || this.presutransferenciaConstantesFunciones.event_dependid_cuenta_contable_destinoPresuTransferencia) {
						//this.cargarCombosCuentaContableDestinosForeignKeyLista(" where id="+this.presutransferencia.getid_cuenta_contable_destino());
									//this.inicializarActualizarBindingPresuTransferencia(false,false);
						this.cuentacontabledestinosForeignKey=new ArrayList<CuentaContable>();

						if(presutransferencia.getCuentaContableDestino()!=null) {
							this.cuentacontabledestinosForeignKey.add(presutransferencia.getCuentaContableDestino());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableDestino();
						this.cargarCombosFrameCuentaContableDestinosForeignKey("Todos");
					}
					this.setActualCuentaContableDestinoForeignKey(this.presutransferencia.getid_cuenta_contable_destino(),false,"Formulario");

					//Empleado
					if(!this.presutransferenciaConstantesFunciones.cargarid_empleadoPresuTransferencia || this.presutransferenciaConstantesFunciones.event_dependid_empleadoPresuTransferencia) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.presutransferencia.getid_empleado());
									//this.inicializarActualizarBindingPresuTransferencia(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(presutransferencia.getEmpleado()!=null) {
							this.empleadosForeignKey.add(presutransferencia.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.presutransferencia.getid_empleado(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPresuTransferencia("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPresuTransferencia(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresuTransferencia() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresuTransferencia(PresuTransferencia presutransferencia) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPresuTransferencia(presutransferencia,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresuTransferencia(PresuTransferencia presutransferencia,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPresuTransferencia(presutransferencia);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPresuTransferencia(presutransferencia,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPresuTransferencia(presutransferencia);
	}
	
	public void setVariablesObjetoActualToFormularioPresuTransferencia(PresuTransferencia presutransferencia) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPresuTransferencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPresuTransferencia.jLabelidPresuTransferencia.setText(presutransferencia.getId().toString());
			this.jInternalFrameDetalleFormPresuTransferencia.jDateChooserfechaPresuTransferencia.setDate(presutransferencia.getfecha());
			this.jInternalFrameDetalleFormPresuTransferencia.jTextFieldvalorPresuTransferencia.setText(presutransferencia.getvalor().toString());
			this.jInternalFrameDetalleFormPresuTransferencia.jTextAreadescripcionPresuTransferencia.setText(presutransferencia.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PresuTransferencia presutransferenciaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,presutransferenciaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PresuTransferencia presutransferenciaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				presutransferenciaLocal=this.presutransferencia;
			} else {
				presutransferenciaLocal=this.presutransferenciaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(presutransferenciaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPresuTransferencia(presutransferenciaLocal,true);
					
					if(presutransferenciaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(presutransferenciaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(presutransferenciaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPresuTransferencia(PresuTransferencia presutransferencia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresuTransferencia(presutransferencia,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(presutransferencia);
	}
	
	public void setVariablesFormularioToObjetoActualPresuTransferencia(PresuTransferencia presutransferencia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresuTransferencia(presutransferencia,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPresuTransferencia(PresuTransferencia presutransferencia,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPresuTransferencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPresuTransferencia.jLabelidPresuTransferencia.getText()==null || this.jInternalFrameDetalleFormPresuTransferencia.jLabelidPresuTransferencia.getText()=="" || this.jInternalFrameDetalleFormPresuTransferencia.jLabelidPresuTransferencia.getText()=="Id") {
				this.jInternalFrameDetalleFormPresuTransferencia.jLabelidPresuTransferencia.setText("0");
			}

			if(conColumnasBase) {presutransferencia.setId(Long.parseLong(this.jInternalFrameDetalleFormPresuTransferencia.jLabelidPresuTransferencia.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuTransferenciaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuTransferencia.jLabelIdPresuTransferencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presutransferencia.setfecha(this.jInternalFrameDetalleFormPresuTransferencia.jDateChooserfechaPresuTransferencia.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuTransferenciaConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuTransferencia.jLabelfechaPresuTransferencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presutransferencia.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormPresuTransferencia.jTextFieldvalorPresuTransferencia.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuTransferenciaConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuTransferencia.jLabelvalorPresuTransferencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presutransferencia.setdescripcion(this.jInternalFrameDetalleFormPresuTransferencia.jTextAreadescripcionPresuTransferencia.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuTransferenciaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuTransferencia.jLabeldescripcionPresuTransferencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresuTransferencia(PresuTransferencia presutransferenciaBean,PresuTransferencia presutransferencia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && presutransferenciaBean.getid_presu_proyecto()!=null && !presutransferenciaBean.getid_presu_proyecto().equals(-1L))) {presutransferencia.setid_presu_proyecto(presutransferenciaBean.getid_presu_proyecto());}
			if(conDefault || (!conDefault && presutransferenciaBean.getid_cuenta_contable()!=null && !presutransferenciaBean.getid_cuenta_contable().equals(-1L))) {presutransferencia.setid_cuenta_contable(presutransferenciaBean.getid_cuenta_contable());}
			if(conDefault || (!conDefault && presutransferenciaBean.getid_cuenta_contable_destino()!=null && !presutransferenciaBean.getid_cuenta_contable_destino().equals(-1L))) {presutransferencia.setid_cuenta_contable_destino(presutransferenciaBean.getid_cuenta_contable_destino());}
			if(conDefault || (!conDefault && presutransferenciaBean.getid_empleado()!=null && !presutransferenciaBean.getid_empleado().equals(-1L))) {presutransferencia.setid_empleado(presutransferenciaBean.getid_empleado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPresuTransferencia(PresuTransferencia presutransferenciaOrigen,PresuTransferencia presutransferencia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presutransferenciaOrigen.getId()!=null && !presutransferenciaOrigen.getId().equals(0L))) {presutransferencia.setId(presutransferenciaOrigen.getId());}}
			if(conDefault || (!conDefault && presutransferenciaOrigen.getid_presu_proyecto()!=null && !presutransferenciaOrigen.getid_presu_proyecto().equals(-1L))) {presutransferencia.setid_presu_proyecto(presutransferenciaOrigen.getid_presu_proyecto());}
			if(conDefault || (!conDefault && presutransferenciaOrigen.getid_cuenta_contable()!=null && !presutransferenciaOrigen.getid_cuenta_contable().equals(-1L))) {presutransferencia.setid_cuenta_contable(presutransferenciaOrigen.getid_cuenta_contable());}
			if(conDefault || (!conDefault && presutransferenciaOrigen.getid_cuenta_contable_destino()!=null && !presutransferenciaOrigen.getid_cuenta_contable_destino().equals(-1L))) {presutransferencia.setid_cuenta_contable_destino(presutransferenciaOrigen.getid_cuenta_contable_destino());}
			if(conDefault || (!conDefault && presutransferenciaOrigen.getid_empleado()!=null && !presutransferenciaOrigen.getid_empleado().equals(-1L))) {presutransferencia.setid_empleado(presutransferenciaOrigen.getid_empleado());}
			if(conDefault || (!conDefault && presutransferenciaOrigen.getfecha()!=null && !presutransferenciaOrigen.getfecha().equals(new Date()))) {presutransferencia.setfecha(presutransferenciaOrigen.getfecha());}
			if(conDefault || (!conDefault && presutransferenciaOrigen.getvalor()!=null && !presutransferenciaOrigen.getvalor().equals(0.0))) {presutransferencia.setvalor(presutransferenciaOrigen.getvalor());}
			if(conDefault || (!conDefault && presutransferenciaOrigen.getdescripcion()!=null && !presutransferenciaOrigen.getdescripcion().equals(""))) {presutransferencia.setdescripcion(presutransferenciaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresuTransferencia(PresuTransferencia presutransferencia) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresuTransferencia.jLabelidPresuTransferencia.setText(presutransferencia.getId().toString());
			this.jInternalFrameDetalleFormPresuTransferencia.jDateChooserfechaPresuTransferencia.setDate(presutransferencia.getfecha());
			this.jInternalFrameDetalleFormPresuTransferencia.jTextFieldvalorPresuTransferencia.setText(presutransferencia.getvalor().toString());
			this.jInternalFrameDetalleFormPresuTransferencia.jTextAreadescripcionPresuTransferencia.setText(presutransferencia.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresuTransferencia(PresuTransferenciaBean presutransferenciaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresuTransferencia.jLabelidPresuTransferencia.setText(presutransferenciaBean.getId().toString());
			this.jInternalFrameDetalleFormPresuTransferencia.jDateChooserfechaPresuTransferencia.setDate(presutransferenciaBean.getfecha());
			this.jInternalFrameDetalleFormPresuTransferencia.jTextFieldvalorPresuTransferencia.setText(presutransferenciaBean.getvalor().toString());
			this.jInternalFrameDetalleFormPresuTransferencia.jTextAreadescripcionPresuTransferencia.setText(presutransferenciaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPresuTransferencia(PresuTransferenciaParameterReturnGeneral presutransferenciaReturnGeneral,PresuTransferenciaBean presutransferenciaBean,Boolean conDefault) throws Exception { 
		try {
			PresuTransferencia presutransferenciaLocal=new PresuTransferencia();
			
			presutransferenciaLocal=presutransferenciaReturnGeneral.getPresuTransferencia();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presutransferenciaLocal.getId()!=null && !presutransferenciaLocal.getId().equals(0L))) {presutransferenciaBean.setId(presutransferenciaLocal.getId());}}
			if(conDefault || (!conDefault && presutransferenciaLocal.getid_presu_proyecto()!=null && !presutransferenciaLocal.getid_presu_proyecto().equals(-1L))) {presutransferenciaBean.setid_presu_proyecto(presutransferenciaLocal.getid_presu_proyecto());}
			if(conDefault || (!conDefault && presutransferenciaLocal.getid_cuenta_contable()!=null && !presutransferenciaLocal.getid_cuenta_contable().equals(-1L))) {presutransferenciaBean.setid_cuenta_contable(presutransferenciaLocal.getid_cuenta_contable());}
			if(conDefault || (!conDefault && presutransferenciaLocal.getid_cuenta_contable_destino()!=null && !presutransferenciaLocal.getid_cuenta_contable_destino().equals(-1L))) {presutransferenciaBean.setid_cuenta_contable_destino(presutransferenciaLocal.getid_cuenta_contable_destino());}
			if(conDefault || (!conDefault && presutransferenciaLocal.getid_empleado()!=null && !presutransferenciaLocal.getid_empleado().equals(-1L))) {presutransferenciaBean.setid_empleado(presutransferenciaLocal.getid_empleado());}
			if(conDefault || (!conDefault && presutransferenciaLocal.getfecha()!=null && !presutransferenciaLocal.getfecha().equals(new Date()))) {presutransferenciaBean.setfecha(presutransferenciaLocal.getfecha());}
			if(conDefault || (!conDefault && presutransferenciaLocal.getvalor()!=null && !presutransferenciaLocal.getvalor().equals(0.0))) {presutransferenciaBean.setvalor(presutransferenciaLocal.getvalor());}
			if(conDefault || (!conDefault && presutransferenciaLocal.getdescripcion()!=null && !presutransferenciaLocal.getdescripcion().equals(""))) {presutransferenciaBean.setdescripcion(presutransferenciaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPresuTransferenciaGenerico(Long idPresuTransferenciaSeleccionado,JComboBox jComboBoxPresuTransferencia,List<PresuTransferencia> presutransferenciasLocal)throws Exception {
		try {
			PresuTransferencia  presutransferenciaTemp=null;

			for(PresuTransferencia presutransferenciaAux:presutransferenciasLocal) {
				if(presutransferenciaAux.getId()!=null && presutransferenciaAux.getId().equals(idPresuTransferenciaSeleccionado)) {
					presutransferenciaTemp=presutransferenciaAux;
					break;
				}
			}

			jComboBoxPresuTransferencia.setSelectedItem(presutransferenciaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPresuTransferenciaGenerico(JComboBox jComboBoxPresuTransferencia,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPresuTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresuTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPresuTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresuTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresuTransferencia.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPresuTransferencia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresuTransferencia.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPresuTransferencia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPresuTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPresuTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presutransferencia=(PresuTransferencia) presutransferenciaLogic.getPresuTransferencias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presutransferencia =(PresuTransferencia) presutransferencias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("PresuProyecto")) {
			//sDescripcion=this.getActualPresuProyectoForeignKeyDescripcion((Long)value);
			if(!presutransferencia.getIsNew() && !presutransferencia.getIsChanged() && !presutransferencia.getIsDeleted()) {
				sDescripcion=presutransferencia.getpresuproyecto_descripcion();
			} else {
				//sDescripcion=this.getActualPresuProyectoForeignKeyDescripcion((Long)value);
				sDescripcion=presutransferencia.getpresuproyecto_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!presutransferencia.getIsNew() && !presutransferencia.getIsChanged() && !presutransferencia.getIsDeleted()) {
				sDescripcion=presutransferencia.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=presutransferencia.getcuentacontable_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableDestino")) {
			//sDescripcion=this.getActualCuentaContableDestinoForeignKeyDescripcion((Long)value);
			if(!presutransferencia.getIsNew() && !presutransferencia.getIsChanged() && !presutransferencia.getIsDeleted()) {
				sDescripcion=presutransferencia.getcuentacontabledestino_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableDestinoForeignKeyDescripcion((Long)value);
				sDescripcion=presutransferencia.getcuentacontabledestino_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!presutransferencia.getIsNew() && !presutransferencia.getIsChanged() && !presutransferencia.getIsDeleted()) {
				sDescripcion=presutransferencia.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=presutransferencia.getempleado_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PresuTransferencia presutransferenciaRow=new PresuTransferencia();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presutransferenciaRow=(PresuTransferencia) presutransferenciaLogic.getPresuTransferencias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presutransferenciaRow=(PresuTransferencia) presutransferencias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPresuTransferencia(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPresuTransferencia.setVisible((this.isVisibilidadCeldaNuevoPresuTransferencia && this.isPermisoNuevoPresuTransferencia));			
			this.jButtonDuplicarPresuTransferencia.setVisible((this.isVisibilidadCeldaDuplicarPresuTransferencia && this.isPermisoDuplicarPresuTransferencia));			
			this.jButtonCopiarPresuTransferencia.setVisible((this.isVisibilidadCeldaCopiarPresuTransferencia && this.isPermisoCopiarPresuTransferencia));
			this.jButtonVerFormPresuTransferencia.setVisible((this.isVisibilidadCeldaVerFormPresuTransferencia && this.isPermisoVerFormPresuTransferencia));
			
			this.jButtonAbrirOrderByPresuTransferencia.setVisible((this.isVisibilidadCeldaOrdenPresuTransferencia && this.isPermisoOrdenPresuTransferencia));			
			
			this.jButtonNuevoRelacionesPresuTransferencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresuTransferencia && this.isPermisoNuevoPresuTransferencia));			
			this.jButtonNuevoGuardarCambiosPresuTransferencia.setVisible((this.isVisibilidadCeldaNuevoPresuTransferencia && this.isPermisoNuevoPresuTransferencia && this.isPermisoGuardarCambiosPresuTransferencia));
			
			if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonModificarPresuTransferencia.setVisible((this.isVisibilidadCeldaModificarPresuTransferencia && this.isPermisoActualizarPresuTransferencia));	
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonActualizarPresuTransferencia.setVisible((this.isVisibilidadCeldaActualizarPresuTransferencia && this.isPermisoActualizarPresuTransferencia));	
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonEliminarPresuTransferencia.setVisible((this.isVisibilidadCeldaEliminarPresuTransferencia && this.isPermisoEliminarPresuTransferencia));
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonCancelarPresuTransferencia.setVisible(this.isVisibilidadCeldaCancelarPresuTransferencia);							
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonGuardarCambiosPresuTransferencia.setVisible((this.isVisibilidadCeldaGuardarPresuTransferencia && this.isPermisoGuardarCambiosPresuTransferencia));			
			
			}
						
			this.jButtonGuardarCambiosTablaPresuTransferencia.setVisible((this.isVisibilidadCeldaGuardarCambiosPresuTransferencia && this.isPermisoGuardarCambiosPresuTransferencia));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPresuTransferencia.setVisible((this.isVisibilidadCeldaNuevoPresuTransferencia && this.isPermisoNuevoPresuTransferencia));						
			this.jButtonDuplicarToolBarPresuTransferencia.setVisible((this.isVisibilidadCeldaDuplicarPresuTransferencia && this.isPermisoDuplicarPresuTransferencia));						
			this.jButtonCopiarToolBarPresuTransferencia.setVisible((this.isVisibilidadCeldaCopiarPresuTransferencia && this.isPermisoCopiarPresuTransferencia));			
			this.jButtonVerFormToolBarPresuTransferencia.setVisible((this.isVisibilidadCeldaVerFormPresuTransferencia && this.isPermisoVerFormPresuTransferencia));			
			this.jButtonAbrirOrderByToolBarPresuTransferencia.setVisible((this.isVisibilidadCeldaOrdenPresuTransferencia && this.isPermisoOrdenPresuTransferencia));
			this.jButtonNuevoRelacionesToolBarPresuTransferencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresuTransferencia && this.isPermisoNuevoPresuTransferencia));			
			this.jButtonNuevoGuardarCambiosToolBarPresuTransferencia.setVisible((this.isVisibilidadCeldaNuevoPresuTransferencia && this.isPermisoNuevoPresuTransferencia && this.isPermisoGuardarCambiosPresuTransferencia));			
			
			if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonModificarToolBarPresuTransferencia.setVisible((this.isVisibilidadCeldaModificarPresuTransferencia && this.isPermisoActualizarPresuTransferencia));	
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonActualizarToolBarPresuTransferencia.setVisible((this.isVisibilidadCeldaActualizarPresuTransferencia  && this.isPermisoActualizarPresuTransferencia));	
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonEliminarToolBarPresuTransferencia.setVisible((this.isVisibilidadCeldaEliminarPresuTransferencia && this.isPermisoEliminarPresuTransferencia));
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonCancelarToolBarPresuTransferencia.setVisible(this.isVisibilidadCeldaCancelarPresuTransferencia);				
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonGuardarCambiosToolBarPresuTransferencia.setVisible((this.isVisibilidadCeldaGuardarPresuTransferencia && this.isPermisoGuardarCambiosPresuTransferencia));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPresuTransferencia.setVisible((this.isVisibilidadCeldaGuardarCambiosPresuTransferencia && this.isPermisoGuardarCambiosPresuTransferencia));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPresuTransferencia.setVisible((this.isVisibilidadCeldaNuevoPresuTransferencia && this.isPermisoNuevoPresuTransferencia));			
			this.jMenuItemDuplicarPresuTransferencia.setVisible((this.isVisibilidadCeldaDuplicarPresuTransferencia && this.isPermisoDuplicarPresuTransferencia));			
			this.jMenuItemCopiarPresuTransferencia.setVisible((this.isVisibilidadCeldaCopiarPresuTransferencia && this.isPermisoCopiarPresuTransferencia));			
			this.jMenuItemVerFormPresuTransferencia.setVisible((this.isVisibilidadCeldaVerFormPresuTransferencia && this.isPermisoVerFormPresuTransferencia));			
			this.jMenuItemAbrirOrderByPresuTransferencia.setVisible((this.isVisibilidadCeldaOrdenPresuTransferencia && this.isPermisoOrdenPresuTransferencia));			
			//this.jMenuItemMostrarOcultarPresuTransferencia.setVisible((this.isVisibilidadCeldaOrdenPresuTransferencia && this.isPermisoOrdenPresuTransferencia));
			this.jMenuItemDetalleAbrirOrderByPresuTransferencia.setVisible((this.isVisibilidadCeldaOrdenPresuTransferencia && this.isPermisoOrdenPresuTransferencia));			
			//this.jMenuItemDetalleMostrarOcultarPresuTransferencia.setVisible((this.isVisibilidadCeldaOrdenPresuTransferencia && this.isPermisoOrdenPresuTransferencia));			
			this.jMenuItemNuevoRelacionesPresuTransferencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresuTransferencia && this.isPermisoNuevoPresuTransferencia));			
			this.jMenuItemNuevoGuardarCambiosPresuTransferencia.setVisible((this.isVisibilidadCeldaNuevoPresuTransferencia && this.isPermisoNuevoPresuTransferencia && this.isPermisoGuardarCambiosPresuTransferencia));									
			
			if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
			this.jInternalFrameDetalleFormPresuTransferencia.jMenuItemModificarPresuTransferencia.setVisible((this.isVisibilidadCeldaModificarPresuTransferencia && this.isPermisoActualizarPresuTransferencia));	
			this.jInternalFrameDetalleFormPresuTransferencia.jMenuItemActualizarPresuTransferencia.setVisible((this.isVisibilidadCeldaActualizarPresuTransferencia && this.isPermisoActualizarPresuTransferencia));	
			this.jInternalFrameDetalleFormPresuTransferencia.jMenuItemEliminarPresuTransferencia.setVisible((this.isVisibilidadCeldaEliminarPresuTransferencia && this.isPermisoEliminarPresuTransferencia));
			this.jInternalFrameDetalleFormPresuTransferencia.jMenuItemCancelarPresuTransferencia.setVisible(this.isVisibilidadCeldaCancelarPresuTransferencia);				
			}
			
			this.jMenuItemGuardarCambiosPresuTransferencia.setVisible((this.isVisibilidadCeldaGuardarPresuTransferencia && this.isPermisoGuardarCambiosPresuTransferencia));						
			this.jMenuItemGuardarCambiosTablaPresuTransferencia.setVisible((this.isVisibilidadCeldaGuardarCambiosPresuTransferencia && this.isPermisoGuardarCambiosPresuTransferencia));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPresuTransferencia=this.jButtonNuevoPresuTransferencia.isVisible();
			this.isVisibilidadCeldaDuplicarPresuTransferencia=this.jButtonDuplicarPresuTransferencia.isVisible();
			this.isVisibilidadCeldaCopiarPresuTransferencia=this.jButtonCopiarPresuTransferencia.isVisible();
			this.isVisibilidadCeldaVerFormPresuTransferencia=this.jButtonVerFormPresuTransferencia.isVisible();
			
			this.isVisibilidadCeldaOrdenPresuTransferencia=this.jButtonAbrirOrderByPresuTransferencia.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPresuTransferencia=this.jButtonNuevoRelacionesPresuTransferencia.isVisible();
			this.isVisibilidadCeldaModificarPresuTransferencia=this.jButtonModificarPresuTransferencia.isVisible();
			
			if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
			this.isVisibilidadCeldaActualizarPresuTransferencia=this.jInternalFrameDetalleFormPresuTransferencia.jButtonActualizarPresuTransferencia.isVisible();
			this.isVisibilidadCeldaEliminarPresuTransferencia=this.jInternalFrameDetalleFormPresuTransferencia.jButtonEliminarPresuTransferencia.isVisible();
			this.isVisibilidadCeldaCancelarPresuTransferencia=this.jInternalFrameDetalleFormPresuTransferencia.jButtonCancelarPresuTransferencia.isVisible();
			this.isVisibilidadCeldaGuardarPresuTransferencia=this.jInternalFrameDetalleFormPresuTransferencia.jButtonGuardarCambiosPresuTransferencia.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPresuTransferencia=this.jButtonGuardarCambiosTablaPresuTransferencia.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPresuTransferencia=this.jButtonNuevoToolBarPresuTransferencia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresuTransferencia=this.jButtonNuevoRelacionesToolBarPresuTransferencia.isVisible();
			
			if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
			this.isVisibilidadCeldaModificarPresuTransferencia=this.jInternalFrameDetalleFormPresuTransferencia.jButtonModificarToolBarPresuTransferencia.isVisible();
			this.isVisibilidadCeldaActualizarPresuTransferencia=this.jInternalFrameDetalleFormPresuTransferencia.jButtonActualizarToolBarPresuTransferencia.isVisible();
			this.isVisibilidadCeldaEliminarPresuTransferencia=this.jInternalFrameDetalleFormPresuTransferencia.jButtonEliminarToolBarPresuTransferencia.isVisible();
			this.isVisibilidadCeldaCancelarPresuTransferencia=this.jInternalFrameDetalleFormPresuTransferencia.jButtonCancelarToolBarPresuTransferencia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresuTransferencia=this.jButtonGuardarCambiosToolBarPresuTransferencia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresuTransferencia=this.jButtonGuardarCambiosTablaToolBarPresuTransferencia.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPresuTransferencia=this.jMenuItemNuevoPresuTransferencia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresuTransferencia=this.jMenuItemNuevoRelacionesPresuTransferencia.isVisible();
			
			if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
			this.isVisibilidadCeldaModificarPresuTransferencia=this.jInternalFrameDetalleFormPresuTransferencia.jMenuItemModificarPresuTransferencia.isVisible();
			this.isVisibilidadCeldaActualizarPresuTransferencia=this.jInternalFrameDetalleFormPresuTransferencia.jMenuItemActualizarPresuTransferencia.isVisible();
			this.isVisibilidadCeldaEliminarPresuTransferencia=this.jInternalFrameDetalleFormPresuTransferencia.jMenuItemEliminarPresuTransferencia.isVisible();
			this.isVisibilidadCeldaCancelarPresuTransferencia=this.jInternalFrameDetalleFormPresuTransferencia.jMenuItemCancelarPresuTransferencia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresuTransferencia=this.jMenuItemGuardarCambiosPresuTransferencia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresuTransferencia=this.jMenuItemGuardarCambiosTablaPresuTransferencia.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPresuTransferencia(Boolean esInicializar) {
		if(PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.presutransferenciaSessionBean.getConGuardarRelaciones()) {
				//if(this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPresuTransferencia();
			}
			
			this.inicializarActualizarBindingBotonesManualPresuTransferencia(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPresuTransferencia() {
		this.jButtonNuevoPresuTransferencia.setVisible(this.isPermisoNuevoPresuTransferencia);			
		this.jButtonDuplicarPresuTransferencia.setVisible(this.isPermisoDuplicarPresuTransferencia);			
		this.jButtonCopiarPresuTransferencia.setVisible(this.isPermisoCopiarPresuTransferencia);			
		this.jButtonVerFormPresuTransferencia.setVisible(this.isPermisoVerFormPresuTransferencia);			
		
		this.jButtonAbrirOrderByPresuTransferencia.setVisible(this.isPermisoOrdenPresuTransferencia);					
		
		this.jButtonNuevoRelacionesPresuTransferencia.setVisible(this.isPermisoNuevoPresuTransferencia);			
		
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonModificarPresuTransferencia.setVisible(this.isPermisoActualizarPresuTransferencia);	
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonActualizarPresuTransferencia.setVisible(this.isPermisoActualizarPresuTransferencia);	
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonEliminarPresuTransferencia.setVisible(this.isPermisoEliminarPresuTransferencia);
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonCancelarPresuTransferencia.setVisible(this.isVisibilidadCeldaCancelarPresuTransferencia);						
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonGuardarCambiosPresuTransferencia.setVisible(this.isPermisoGuardarCambiosPresuTransferencia);							
		}
		
		this.jButtonGuardarCambiosTablaPresuTransferencia.setVisible(this.isPermisoActualizarPresuTransferencia);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePresuTransferencia() {
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonModificarPresuTransferencia.setVisible(this.isPermisoActualizarPresuTransferencia);	
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonActualizarPresuTransferencia.setVisible(this.isPermisoActualizarPresuTransferencia);	
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonEliminarPresuTransferencia.setVisible(this.isPermisoEliminarPresuTransferencia);
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonCancelarPresuTransferencia.setVisible(this.isVisibilidadCeldaCancelarPresuTransferencia);							
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonGuardarCambiosPresuTransferencia.setVisible((this.isVisibilidadCeldaGuardarPresuTransferencia && this.isPermisoGuardarCambiosPresuTransferencia));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPresuTransferencia() {
		if(PresuTransferenciaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPresuTransferencia();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPresuTransferencia() {
	}
	
	public void jTableDatosPresuTransferenciaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPresuTransferencia(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPresuTransferenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuTransferencia(this.getpresutransferencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presutransferencia =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presutransferencia =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presutransferencia==null) {
						this.presutransferencia = new PresuTransferencia();
					}

					this.setVariablesFormularioToObjetoActualPresuTransferencia(this.presutransferencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);
				}

				if(this.presutransferencia.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.presutransferencia.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuTransferencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_presu_proyectoPresuTransferenciaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopresuproyecto=true;

			idTienePermisopresuproyecto=this.tienePermisosUsuarioEnPaginaWebPresuTransferencia(PresuProyectoConstantesFunciones.CLASSNAME);

			if(idTienePermisopresuproyecto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresuTransferencia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresuTransferencia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferencia =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presutransferencia =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresuTransferencia(this.getpresutransferencia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);

				this.presuproyectoBeanSwingJInternalFrame=new PresuProyectoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.presuproyectoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.presuproyectoBeanSwingJInternalFrame.getPresuProyectoLogic().setConnexion(this.presutransferenciaLogic.getConnexion());

				if(this.presutransferencia.getid_presu_proyecto()!=null) {
					this.presuproyectoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.presuproyectoBeanSwingJInternalFrame.setIdActual(this.presutransferencia.getid_presu_proyecto());
					this.presuproyectoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.presuproyectoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.presuproyectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresuProyecto();
				}

				JInternalFrameBase jinternalFrame =this.presuproyectoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresuTransferencia=(TitledBorder)this.jScrollPanelDatosPresuTransferencia.getBorder();
				TitledBorder titledBorderpresuproyecto=(TitledBorder)this.presuproyectoBeanSwingJInternalFrame.jScrollPanelDatosPresuProyecto.getBorder();

				titledBorderpresuproyecto.setTitle(titledBorderPresuTransferencia.getTitle() + " -> Proyecto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_presu_proyectoPresuTransferenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuTransferencia(this.getpresutransferencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presutransferencia =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presutransferencia =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presutransferencia==null) {
						this.presutransferencia = new PresuTransferencia();
					}

					this.setVariablesFormularioToObjetoActualPresuTransferencia(this.presutransferencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);
				}

				if(this.presutransferencia.getid_presu_proyecto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_presu_proyecto = "+this.presutransferencia.getid_presu_proyecto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuTransferencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contablePresuTransferenciaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="CuentaContable";

			if(!this.sFinalQueryGeneral_cuentacontable.equals("")) {
				this.cuentacontableBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontable);
				this.cuentacontableBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontableBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContable.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderPresuTransferencia=null;
			TitledBorder titledBordercuentacontable=null;

			if(!this.jScrollPanelDatosPresuTransferencia.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderPresuTransferencia=(TitledBorder)this.jScrollPanelDatosPresuTransferencia.getBorder();
				titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderPresuTransferencia.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contablePresuTransferenciaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebPresuTransferencia(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresuTransferencia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresuTransferencia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferencia =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presutransferencia =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresuTransferencia(this.getpresutransferencia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.presutransferenciaLogic.getConnexion());

				if(this.presutransferencia.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.presutransferencia.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresuTransferencia=(TitledBorder)this.jScrollPanelDatosPresuTransferencia.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderPresuTransferencia.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contablePresuTransferenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuTransferencia(this.getpresutransferencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presutransferencia =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presutransferencia =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presutransferencia==null) {
						this.presutransferencia = new PresuTransferencia();
					}

					this.setVariablesFormularioToObjetoActualPresuTransferencia(this.presutransferencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);
				}

				if(this.presutransferencia.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.presutransferencia.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuTransferencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_destinoPresuTransferenciaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontabledestinoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontabledestinoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontabledestinoBeanSwingJInternalFrame.sTipoBusqueda="CuentaContableDestino";

			if(!this.sFinalQueryGeneral_cuentacontabledestino.equals("")) {
				this.cuentacontabledestinoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontabledestino);
				this.cuentacontabledestinoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontabledestinoBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontabledestinoBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontabledestinoBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContableDestino.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontabledestinoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderPresuTransferencia=null;
			TitledBorder titledBordercuentacontabledestino=null;

			if(!this.jScrollPanelDatosPresuTransferencia.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderPresuTransferencia=(TitledBorder)this.jScrollPanelDatosPresuTransferencia.getBorder();
				titledBordercuentacontabledestino=(TitledBorder)this.cuentacontabledestinoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontabledestino.setTitle(titledBorderPresuTransferencia.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contable_destinoPresuTransferenciaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontabledestino=true;

			idTienePermisocuentacontabledestino=this.tienePermisosUsuarioEnPaginaWebPresuTransferencia(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontabledestino) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresuTransferencia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresuTransferencia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferencia =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presutransferencia =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresuTransferencia(this.getpresutransferencia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);

				this.cuentacontabledestinoBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontabledestinoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontabledestinoBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.presutransferenciaLogic.getConnexion());

				if(this.presutransferencia.getid_cuenta_contable_destino()!=null) {
					this.cuentacontabledestinoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontabledestinoBeanSwingJInternalFrame.setIdActual(this.presutransferencia.getid_cuenta_contable_destino());
					this.cuentacontabledestinoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontabledestinoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontabledestinoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontabledestinoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresuTransferencia=(TitledBorder)this.jScrollPanelDatosPresuTransferencia.getBorder();
				TitledBorder titledBordercuentacontabledestino=(TitledBorder)this.cuentacontabledestinoBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontabledestino.setTitle(titledBorderPresuTransferencia.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_destinoPresuTransferenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuTransferencia(this.getpresutransferencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presutransferencia =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presutransferencia =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presutransferencia==null) {
						this.presutransferencia = new PresuTransferencia();
					}

					this.setVariablesFormularioToObjetoActualPresuTransferencia(this.presutransferencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);
				}

				if(this.presutransferencia.getid_cuenta_contable_destino()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_destino = "+this.presutransferencia.getid_cuenta_contable_destino().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuTransferencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoPresuTransferenciaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderPresuTransferencia=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosPresuTransferencia.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderPresuTransferencia=(TitledBorder)this.jScrollPanelDatosPresuTransferencia.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderPresuTransferencia.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoPresuTransferenciaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebPresuTransferencia(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresuTransferencia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresuTransferencia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferencia =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presutransferencia =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresuTransferencia(this.getpresutransferencia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.presutransferenciaLogic.getConnexion());

				if(this.presutransferencia.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.presutransferencia.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresuTransferencia=(TitledBorder)this.jScrollPanelDatosPresuTransferencia.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderPresuTransferencia.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoPresuTransferenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuTransferencia(this.getpresutransferencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presutransferencia =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presutransferencia =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presutransferencia==null) {
						this.presutransferencia = new PresuTransferencia();
					}

					this.setVariablesFormularioToObjetoActualPresuTransferencia(this.presutransferencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);
				}

				if(this.presutransferencia.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.presutransferencia.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuTransferencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaPresuTransferenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuTransferencia(this.getpresutransferencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presutransferencia =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presutransferencia =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presutransferencia==null) {
						this.presutransferencia = new PresuTransferencia();
					}

					this.setVariablesFormularioToObjetoActualPresuTransferencia(this.presutransferencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);
				}

				if(this.presutransferencia.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.presutransferencia.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuTransferencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorPresuTransferenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuTransferencia(this.getpresutransferencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presutransferencia =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presutransferencia =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presutransferencia==null) {
						this.presutransferencia = new PresuTransferencia();
					}

					this.setVariablesFormularioToObjetoActualPresuTransferencia(this.presutransferencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);
				}

				if(this.presutransferencia.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.presutransferencia.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuTransferencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionPresuTransferenciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuTransferencia(this.getpresutransferencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presutransferencia =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presutransferencia =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presutransferencia==null) {
						this.presutransferencia = new PresuTransferencia();
					}

					this.setVariablesFormularioToObjetoActualPresuTransferencia(this.presutransferencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);
				}

				if(this.presutransferencia.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.presutransferencia.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuTransferencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCuentaContablePresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuTransferencia(false,false);

			this.getPresuTransferenciasFK_IdCuentaContable();

			this.inicializarActualizarBindingPresuTransferencia(false);

			//if(PresuTransferenciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuTransferencia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableDestinoPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuTransferencia(false,false);

			this.getPresuTransferenciasFK_IdCuentaContableDestino();

			this.inicializarActualizarBindingPresuTransferencia(false);

			//if(PresuTransferenciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuTransferencia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuTransferencia(false,false);

			this.getPresuTransferenciasFK_IdEmpleado();

			this.inicializarActualizarBindingPresuTransferencia(false);

			//if(PresuTransferenciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuTransferencia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPresuProyectoPresuTransferenciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuTransferencia(false,false);

			this.getPresuTransferenciasFK_IdPresuProyecto();

			this.inicializarActualizarBindingPresuTransferencia(false);

			//if(PresuTransferenciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuTransferencia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutransferenciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePresuTransferencia() {
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
			this.jInternalFrameDetalleFormPresuTransferencia.setVisible(false);	    			
			this.jInternalFrameDetalleFormPresuTransferencia.dispose();
			this.jInternalFrameDetalleFormPresuTransferencia=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPresuTransferencia!=null) {
			this.jInternalFrameReporteDinamicoPresuTransferencia.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPresuTransferencia.dispose();
			this.jInternalFrameReporteDinamicoPresuTransferencia=null;
		}
		
		if(this.jInternalFrameImportacionPresuTransferencia!=null) {
			this.jInternalFrameImportacionPresuTransferencia.setVisible(false);	    			
			this.jInternalFrameImportacionPresuTransferencia.dispose();
			this.jInternalFrameImportacionPresuTransferencia=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPresuTransferencia();
			
			PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
			
			
			if(sTipo.equals("NuevoPresuTransferencia")) {
				jButtonNuevoPresuTransferenciaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPresuTransferencia")) {
				jButtonDuplicarPresuTransferenciaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPresuTransferencia")) {
				jButtonCopiarPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("VerFormPresuTransferencia")) {
				jButtonVerFormPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPresuTransferencia")) {
				jButtonNuevoPresuTransferenciaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPresuTransferencia")) {
				jButtonDuplicarPresuTransferenciaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPresuTransferencia")) {
				jButtonNuevoPresuTransferenciaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPresuTransferencia")) {
				jButtonDuplicarPresuTransferenciaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPresuTransferencia")) {
				jButtonNuevoPresuTransferenciaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPresuTransferencia")) {
				jButtonNuevoPresuTransferenciaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPresuTransferencia")) {
				jButtonNuevoPresuTransferenciaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPresuTransferencia")) {
				jButtonModificarPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPresuTransferencia")) {
				jButtonModificarPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPresuTransferencia")) {
				jButtonModificarPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPresuTransferencia")) {
				jButtonActualizarPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPresuTransferencia")) {
				jButtonActualizarPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPresuTransferencia")) {
				jButtonActualizarPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("EliminarPresuTransferencia")) {
				jButtonEliminarPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPresuTransferencia")) {
				jButtonEliminarPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPresuTransferencia")) {
				jButtonEliminarPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("CancelarPresuTransferencia")) {
				jButtonCancelarPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPresuTransferencia")) {
				jButtonCancelarPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPresuTransferencia")) {
				jButtonCancelarPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("CerrarPresuTransferencia")) {
				jButtonCerrarPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPresuTransferencia")) {
				jButtonCerrarPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPresuTransferencia")) {
				jButtonCerrarPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPresuTransferencia")) {
				jButtonMostrarOcultarPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPresuTransferencia")) {
				jButtonCancelarPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPresuTransferencia")) {
				jButtonGuardarCambiosPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPresuTransferencia")) {
				jButtonGuardarCambiosPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPresuTransferencia")) {
				jButtonCopiarPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPresuTransferencia")) {
				jButtonVerFormPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPresuTransferencia")) {
				jButtonGuardarCambiosPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPresuTransferencia")) {
				jButtonCopiarPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPresuTransferencia")) {
				jButtonVerFormPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPresuTransferencia")) {
				jButtonGuardarCambiosPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPresuTransferencia")) {
				jButtonGuardarCambiosPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPresuTransferencia")) {
				jButtonGuardarCambiosPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPresuTransferencia")) {
				jButtonRecargarInformacionPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPresuTransferencia")) {
				jButtonRecargarInformacionPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPresuTransferencia")) {
				jButtonRecargarInformacionPresuTransferenciaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPresuTransferencia")) {
				jButtonAnterioresPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPresuTransferencia")) {
				jButtonAnterioresPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePresuTransferencia")) {
				jButtonAnterioresPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPresuTransferencia")) {
				jButtonSiguientesPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPresuTransferencia")) {
				jButtonSiguientesPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPresuTransferencia")) {
				jButtonSiguientesPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPresuTransferencia") || sTipo.equals("MenuItemDetalleAbrirOrderByPresuTransferencia")) {
				jButtonAbrirOrderByPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPresuTransferencia") || sTipo.equals("MenuItemDetalleMostrarOcultarPresuTransferencia")) {
				jButtonMostrarOcultarPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPresuTransferencia")) {
				jButtonNuevoGuardarCambiosPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPresuTransferencia")) {
				jButtonNuevoGuardarCambiosPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPresuTransferencia")) {
				jButtonNuevoGuardarCambiosPresuTransferenciaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPresuTransferencia")) {
				jButtonCerrarReporteDinamicoPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPresuTransferencia")) {
				jButtonGenerarReporteDinamicoPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPresuTransferencia")) {
				
				jButtonGenerarExcelReporteDinamicoPresuTransferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPresuTransferencia")) {
				jButtonCerrarImportacionPresuTransferenciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPresuTransferencia")) {
				
				jButtonGenerarImportacionPresuTransferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPresuTransferencia")) {
				
				jButtonAbrirImportacionPresuTransferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPresuTransferencia")) {
				jComboBoxTiposAccionesPresuTransferenciaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPresuTransferencia")) {
				jComboBoxTiposRelacionesPresuTransferenciaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPresuTransferencia")) {
				jComboBoxTiposAccionesPresuTransferenciaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPresuTransferencia")) {
				
				jComboBoxTiposSeleccionarPresuTransferenciaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPresuTransferencia")) {
				jTextFieldValorCampoGeneralPresuTransferenciaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPresuTransferencia")) {
				jButtonAbrirOrderByPresuTransferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPresuTransferencia")) {
				jButtonAbrirOrderByPresuTransferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPresuTransferencia")) {
				jButtonCerrarOrderByPresuTransferenciaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresuTransferenciaBusqueda")) {
				this.jButtonidPresuTransferenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_presu_proyectoPresuTransferenciaUpdate")) {
				this.jButtonid_presu_proyectoPresuTransferenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_presu_proyectoPresuTransferenciaBusqueda")) {
				this.jButtonid_presu_proyectoPresuTransferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contablePresuTransferencia")) {
				this.jButtonid_cuenta_contablePresuTransferenciaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contablePresuTransferenciaArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contablePresuTransferenciaUpdate")) {
				this.jButtonid_cuenta_contablePresuTransferenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contablePresuTransferenciaBusqueda")) {
				this.jButtonid_cuenta_contablePresuTransferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_destinoPresuTransferencia")) {
				this.jButtonid_cuenta_contable_destinoPresuTransferenciaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_destinoPresuTransferenciaArbol")) {
				this.abrirFrameTreeCuentaContableDestino("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_destinoPresuTransferenciaUpdate")) {
				this.jButtonid_cuenta_contable_destinoPresuTransferenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_destinoPresuTransferenciaBusqueda")) {
				this.jButtonid_cuenta_contable_destinoPresuTransferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoPresuTransferencia")) {
				this.jButtonid_empleadoPresuTransferenciaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoPresuTransferenciaUpdate")) {
				this.jButtonid_empleadoPresuTransferenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoPresuTransferenciaBusqueda")) {
				this.jButtonid_empleadoPresuTransferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaPresuTransferenciaBusqueda")) {
				this.jButtonfechaPresuTransferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorPresuTransferenciaBusqueda")) {
				this.jButtonvalorPresuTransferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPresuTransferenciaBusqueda")) {
				this.jButtondescripcionPresuTransferenciaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_cuenta_contablePresuTransferencia")) {
				this.jButtonid_cuenta_contablePresuTransferenciaActionPerformed(evt);
			}
			else if(sTipo.equals("id_cuenta_contable_destinoPresuTransferencia")) {
				this.jButtonid_cuenta_contable_destinoPresuTransferenciaActionPerformed(evt);
			}
			else if(sTipo.equals("id_empleadoPresuTransferencia")) {
				this.jButtonid_empleadoPresuTransferenciaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCuentaContablePresuTransferencia")) {
				this.jButtonFK_IdCuentaContablePresuTransferenciaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContableDestinoPresuTransferencia")) {
				this.jButtonFK_IdCuentaContableDestinoPresuTransferenciaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoPresuTransferencia")) {
				this.jButtonFK_IdEmpleadoPresuTransferenciaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPresuProyectoPresuTransferencia")) {
				this.jButtonFK_IdPresuProyectoPresuTransferenciaActionPerformed(evt);
			}
			
			;
			
			
			PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPresuTransferencia();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuTransferenciaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutransferencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutransferencia);
				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
				
				


				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTransferencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTransferencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PresuTransferencia presutransferenciaLocal=null;
			
			if(!this.getEsControlTabla()) {
				presutransferenciaLocal=this.presutransferencia;
			} else {
				presutransferenciaLocal=this.presutransferenciaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutransferencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutransferencia);
				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
							
				
				


				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTransferencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTransferencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTransferenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaAnterior =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutransferenciaAnterior =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
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
			
			PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
			
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
			
			


			
			PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuTransferenciaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutransferencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutransferencia);
				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
								
						
				


				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTransferencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTransferencia.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutransferencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutransferencia);
				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
								
				
				


				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTransferencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTransferencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTransferenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaAnterior =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutransferenciaAnterior =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutransferencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutransferencia);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTransferenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaAnterior =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutransferenciaAnterior =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTransferenciaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presutransferencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presutransferencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutransferencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutransferencia);
				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
							
				
				


				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTransferencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTransferencia.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuTransferenciaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presutransferenciaAnterior =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presutransferenciaAnterior =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
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
			
			PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
			
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
			
			


			
			PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTransferenciaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presutransferencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presutransferencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutransferencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutransferencia);
				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
								
				
				


				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTransferencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTransferencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTransferenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaAnterior =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutransferenciaAnterior =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTransferenciaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presutransferencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presutransferencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuTransferenciaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutransferencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutransferencia);
				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPresuTransferencia")) {
					jCheckBoxSeleccionarTodosPresuTransferenciaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPresuTransferencia")) {
					jCheckBoxSeleccionadosPresuTransferenciaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPresuTransferencia")) {
					
				}
				
				


				
				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTransferencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTransferencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.presutransferencia);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.presutransferencia);
				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
												
				
				


				
				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTransferencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTransferencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuTransferenciaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presutransferenciaAnterior =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presutransferenciaAnterior =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuTransferenciaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutransferencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutransferencia);
				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
				
				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
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
			
			PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
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
			
			


			
			PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuTransferenciaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutransferencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutransferencia);
				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTransferencia.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTransferencia.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutransferencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutransferencia);
				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
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
				
				


				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTransferencia.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTransferencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTransferenciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutransferenciaAnterior =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutransferenciaAnterior =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPresuTransferencia")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPresuTransferenciaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPresuTransferencia.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.presutransferencia =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.presutransferencia =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.presutransferencia);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPresuTransferencia")) {
				
				}
				
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPresuTransferencia")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPresuTransferencia.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPresuTransferencia")) {
			
			}
			
			PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPresuTransferencia();
			
			PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
			
			if(sTipo.equals("NuevoPresuTransferencia")) {
				jButtonNuevoPresuTransferenciaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPresuTransferencia")) {
				jButtonDuplicarPresuTransferenciaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPresuTransferencia")) {
				jButtonCopiarPresuTransferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPresuTransferencia")) {
				jButtonVerFormPresuTransferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPresuTransferencia")) {
				jButtonNuevoPresuTransferenciaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPresuTransferencia")) {
				jButtonModificarPresuTransferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPresuTransferencia")) {
				jButtonActualizarPresuTransferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPresuTransferencia")) {
				jButtonEliminarPresuTransferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPresuTransferencia")) {
				jButtonGuardarCambiosPresuTransferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPresuTransferencia")) {
				jButtonCancelarPresuTransferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPresuTransferencia")) {
				jButtonCerrarPresuTransferenciaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPresuTransferencia")) {
				jButtonGuardarCambiosPresuTransferenciaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPresuTransferencia")) {
				jButtonNuevoGuardarCambiosPresuTransferenciaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPresuTransferencia")) {
				jButtonAbrirOrderByPresuTransferenciaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPresuTransferencia")) {
				jButtonRecargarInformacionPresuTransferenciaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPresuTransferencia")) {
				jButtonAnterioresPresuTransferenciaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPresuTransferencia")) {
				jButtonSiguientesPresuTransferenciaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresuTransferenciaBusqueda")) {
				this.jButtonidPresuTransferenciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_presu_proyectoPresuTransferenciaUpdate")) {
				this.jButtonid_presu_proyectoPresuTransferenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_presu_proyectoPresuTransferenciaBusqueda")) {
				this.jButtonid_presu_proyectoPresuTransferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contablePresuTransferencia")) {
				this.jButtonid_cuenta_contablePresuTransferenciaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contablePresuTransferenciaArbol")) {
				this.abrirFrameTreeCuentaContable("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contablePresuTransferenciaUpdate")) {
				this.jButtonid_cuenta_contablePresuTransferenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contablePresuTransferenciaBusqueda")) {
				this.jButtonid_cuenta_contablePresuTransferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_destinoPresuTransferencia")) {
				this.jButtonid_cuenta_contable_destinoPresuTransferenciaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_destinoPresuTransferenciaArbol")) {
				this.abrirFrameTreeCuentaContableDestino("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_destinoPresuTransferenciaUpdate")) {
				this.jButtonid_cuenta_contable_destinoPresuTransferenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_destinoPresuTransferenciaBusqueda")) {
				this.jButtonid_cuenta_contable_destinoPresuTransferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoPresuTransferencia")) {
				this.jButtonid_empleadoPresuTransferenciaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoPresuTransferenciaUpdate")) {
				this.jButtonid_empleadoPresuTransferenciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoPresuTransferenciaBusqueda")) {
				this.jButtonid_empleadoPresuTransferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaPresuTransferenciaBusqueda")) {
				this.jButtonfechaPresuTransferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorPresuTransferenciaBusqueda")) {
				this.jButtonvalorPresuTransferenciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPresuTransferenciaBusqueda")) {
				this.jButtondescripcionPresuTransferenciaBusquedaActionPerformed(evt);
			}
			
			PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPresuTransferencia();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePresuTransferencia")) {
				closingInternalFramePresuTransferencia();
				
			} else if(sTipo.equals("jButtonCancelarPresuTransferencia")) {
				JInternalFrameBase jInternalFrameDetalleFormPresuTransferencia = (JInternalFrameBase)evt.getSource();
	            	
	            PresuTransferenciaBeanSwingJInternalFrame jInternalFrameParent=(PresuTransferenciaBeanSwingJInternalFrame)jInternalFrameDetalleFormPresuTransferencia.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPresuTransferenciaActionPerformed(null);
			}
			
			PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presutransferencia,new Object(),this.presutransferenciaParameterGeneral,this.presutransferenciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPresuTransferencia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPresuTransferencia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPresuTransferencia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.presutransferencia)) {
			if(!esControlTabla) {
				if(PresuTransferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPresuTransferencia(this.presutransferencia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);			
				}
				
				if(this.presutransferenciaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPresuTransferencia(this.presutransferencia,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presutransferenciaReturnGeneral=presutransferenciaLogic.procesarEventosPresuTransferenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presutransferenciaLogic.getPresuTransferencias(),this.presutransferencia,this.presutransferenciaParameterGeneral,this.isEsNuevoPresuTransferencia,classes);//this.presutransferenciaLogic.getPresuTransferencia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPresuTransferencia(this.presutransferenciaReturnGeneral,this.presutransferenciaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.presutransferenciaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPresuTransferencia(classes,this.presutransferenciaReturnGeneral,this.presutransferenciaBean,false);
					}
						
					if(this.presutransferenciaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPresuTransferencia(this.presutransferenciaReturnGeneral.getPresuTransferencia());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPresuTransferencia(this.presutransferenciaReturnGeneral.getPresuTransferencia());	
					}
						
					if(this.presutransferenciaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPresuTransferencia(this.presutransferenciaReturnGeneral.getPresuTransferencia(),classes);//this.presutransferenciaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPresuTransferencia(this.presutransferencia,classes);//this.presutransferenciaBean);									
				}
			
				if(PresuTransferenciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPresuTransferencia(this.presutransferencia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTransferencia(this.presutransferencia);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.presutransferenciaAnterior!=null) {
						this.presutransferencia=this.presutransferenciaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presutransferenciaReturnGeneral=presutransferenciaLogic.procesarEventosPresuTransferenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presutransferenciaLogic.getPresuTransferencias(),this.presutransferencia,this.presutransferenciaParameterGeneral,this.isEsNuevoPresuTransferencia,classes);//this.presutransferenciaLogic.getPresuTransferencia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presutransferenciaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presutransferenciaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.presutransferenciaReturnGeneral.getPresuTransferencia(),presutransferenciaLogic.getPresuTransferencias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.presutransferenciaReturnGeneral.getPresuTransferencia(),this.presutransferencias);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPresuTransferencia.repaint();
				
				//((AbstractTableModel) this.jTableDatosPresuTransferencia.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPresuTransferencia();
			}
		}
	}
	
	public void actualizarVisualTableDatosPresuTransferencia() throws Exception {
		
		PresuTransferenciaModel presutransferenciaModel=(PresuTransferenciaModel)this.jTableDatosPresuTransferencia.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presutransferenciaModel.presutransferencias=this.presutransferenciaLogic.getPresuTransferencias();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			presutransferenciaModel.presutransferencias=this.presutransferencias;
		}
		
		
		((PresuTransferenciaModel) this.jTableDatosPresuTransferencia.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPresuTransferencia() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpresutransferenciaAnterior(),this.presutransferenciaLogic.getPresuTransferencias());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpresutransferenciaAnterior(),this.presutransferencias);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPresuTransferencia();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPresuTransferencia(PresuTransferencia presutransferencia,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
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
										
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presutransferencia,new Object(),generalEntityParameterGeneral,this.presutransferenciaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.presutransferenciaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PresuTransferenciaConstantesFunciones.getClassesRelationshipsOfPresuTransferencia(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PresuTransferenciaConstantesFunciones.getClassesRelationshipsFromStringsOfPresuTransferencia(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPresuTransferencia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PresuTransferenciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presutransferencia,new Object(),generalEntityParameterGeneral,this.presutransferenciaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPresuTransferencia(PresuTransferenciaBean presutransferenciaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPresuTransferencia(ArrayList<Classe> classes,PresuTransferenciaReturnGeneral presutransferenciaReturnGeneral,PresuTransferenciaBean presutransferenciaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPresuTransferencia(PresuTransferencia presutransferencia,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.presutransferencia)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPresuTransferencia = new PresuTransferenciaDetalleFormJInternalFrame(jDesktopPane,this.presutransferenciaSessionBean.getConGuardarRelaciones(),this.presutransferenciaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPresuTransferencia);
		this.jInternalFrameDetalleFormPresuTransferencia.setVisible(false);
		this.jInternalFrameDetalleFormPresuTransferencia.setSelected(false);						
		
		this.jInternalFrameDetalleFormPresuTransferencia.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPresuTransferencia.presutransferenciaLogic=this.presutransferenciaLogic;
		
		this.cargarCombosFrameForeignKeyPresuTransferencia("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePresuTransferencia();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresuTransferencia();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPresuTransferencia("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPresuTransferencia();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPresuTransferencia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresuTransferencia"));
		
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonModificarPresuTransferencia.addActionListener(new ButtonActionListener(this,"ModificarPresuTransferencia"));

		
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonModificarToolBarPresuTransferencia.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresuTransferencia"));
					
		this.jInternalFrameDetalleFormPresuTransferencia.jMenuItemModificarPresuTransferencia.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresuTransferencia"));		
		
		
		
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonActualizarPresuTransferencia.addActionListener (new ButtonActionListener(this,"ActualizarPresuTransferencia"));
		
		
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonActualizarToolBarPresuTransferencia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresuTransferencia"));
						
		this.jInternalFrameDetalleFormPresuTransferencia.jMenuItemActualizarPresuTransferencia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresuTransferencia"));		
		
		
		
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonEliminarPresuTransferencia.addActionListener (new ButtonActionListener(this,"EliminarPresuTransferencia"));
		
		
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonEliminarToolBarPresuTransferencia.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresuTransferencia"));
								
		this.jInternalFrameDetalleFormPresuTransferencia.jMenuItemEliminarPresuTransferencia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresuTransferencia"));		
		
		
		
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonCancelarPresuTransferencia.addActionListener (new ButtonActionListener(this,"CancelarPresuTransferencia"));
		
		
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonCancelarToolBarPresuTransferencia.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresuTransferencia"));
					
		this.jInternalFrameDetalleFormPresuTransferencia.jMenuItemCancelarPresuTransferencia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresuTransferencia"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPresuTransferencia.jMenuItemDetalleCerrarPresuTransferencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresuTransferencia"));		
		
		
		
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonGuardarCambiosToolBarPresuTransferencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresuTransferencia"));
		
		
		
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonGuardarCambiosToolBarPresuTransferencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresuTransferencia"));
		
		
		
		this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxTiposAccionesFormularioPresuTransferencia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresuTransferencia"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonidPresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"idPresuTransferenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_presu_proyectoPresuTransferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_presu_proyectoPresuTransferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_presu_proyectoPresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_proyectoPresuTransferenciaBusqueda"));
		//jButtonid_cuenta_contablePresuTransferencia.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contablePresuTransferenciaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contablePresuTransferencia.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuTransferencia"));
		//jButtonid_cuenta_contablePresuTransferenciaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contablePresuTransferenciaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuTransferenciaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contablePresuTransferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuTransferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contablePresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuTransferenciaBusqueda"));
		//jButtonid_cuenta_contable_destinoPresuTransferencia.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_destinoPresuTransferenciaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contable_destinoPresuTransferencia.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_destinoPresuTransferencia"));
		//jButtonid_cuenta_contable_destinoPresuTransferenciaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableDestino("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contable_destinoPresuTransferenciaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_destinoPresuTransferenciaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contable_destinoPresuTransferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_destinoPresuTransferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contable_destinoPresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_destinoPresuTransferenciaBusqueda"));
		//jButtonid_empleadoPresuTransferencia.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoPresuTransferenciaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_empleadoPresuTransferencia.addActionListener(new ButtonActionListener(this,"id_empleadoPresuTransferencia"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_empleadoPresuTransferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoPresuTransferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_empleadoPresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoPresuTransferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonfechaPresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"fechaPresuTransferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonvalorPresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"valorPresuTransferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtondescripcionPresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPresuTransferenciaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPresuTransferencia.jTabbedPaneRelacionesPresuTransferencia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresuTransferencia"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePresuTransferencia"));
		
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTransferencia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresuTransferencia"));
		}
		
		this.jTableDatosPresuTransferencia.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPresuTransferencia"));
		
		this.jTableDatosPresuTransferencia.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPresuTransferencia"));
		
		this.jButtonNuevoPresuTransferencia.addActionListener(new ButtonActionListener(this,"NuevoPresuTransferencia"));
		
		this.jButtonDuplicarPresuTransferencia.addActionListener(new ButtonActionListener(this,"DuplicarPresuTransferencia"));
		
		this.jButtonCopiarPresuTransferencia.addActionListener(new ButtonActionListener(this,"CopiarPresuTransferencia"));
		
		this.jButtonVerFormPresuTransferencia.addActionListener(new ButtonActionListener(this,"VerFormPresuTransferencia"));
		
		
		this.jButtonNuevoToolBarPresuTransferencia.addActionListener(new ButtonActionListener(this,"NuevoToolBarPresuTransferencia"));
			
		this.jButtonDuplicarToolBarPresuTransferencia.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPresuTransferencia"));
			
		this.jMenuItemNuevoPresuTransferencia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPresuTransferencia"));
			
		this.jMenuItemDuplicarPresuTransferencia.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPresuTransferencia"));		
		
		
		this.jButtonNuevoRelacionesPresuTransferencia.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPresuTransferencia"));
		
		
		this.jButtonNuevoRelacionesToolBarPresuTransferencia.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPresuTransferencia"));
			
		this.jMenuItemNuevoRelacionesPresuTransferencia.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPresuTransferencia"));		
		
		
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonModificarPresuTransferencia.addActionListener(new ButtonActionListener(this,"ModificarPresuTransferencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonModificarToolBarPresuTransferencia.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresuTransferencia"));
			
			this.jInternalFrameDetalleFormPresuTransferencia.jMenuItemModificarPresuTransferencia.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresuTransferencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonActualizarPresuTransferencia.addActionListener (new ButtonActionListener(this,"ActualizarPresuTransferencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonActualizarToolBarPresuTransferencia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresuTransferencia"));
				
			this.jInternalFrameDetalleFormPresuTransferencia.jMenuItemActualizarPresuTransferencia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresuTransferencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonEliminarPresuTransferencia.addActionListener (new ButtonActionListener(this,"EliminarPresuTransferencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonEliminarToolBarPresuTransferencia.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresuTransferencia"));
						
			this.jInternalFrameDetalleFormPresuTransferencia.jMenuItemEliminarPresuTransferencia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresuTransferencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonCancelarPresuTransferencia.addActionListener (new ButtonActionListener(this,"CancelarPresuTransferencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonCancelarToolBarPresuTransferencia.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresuTransferencia"));
			
			this.jInternalFrameDetalleFormPresuTransferencia.jMenuItemCancelarPresuTransferencia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresuTransferencia"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPresuTransferencia.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPresuTransferencia"));		
		
		
		this.jButtonCerrarPresuTransferencia.addActionListener (new ButtonActionListener(this,"CerrarPresuTransferencia"));
		
		
		this.jButtonCerrarToolBarPresuTransferencia.addActionListener (new ButtonActionListener(this,"CerrarToolBarPresuTransferencia"));
			
		this.jMenuItemCerrarPresuTransferencia.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPresuTransferencia"));
			
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTransferencia.jMenuItemDetalleCerrarPresuTransferencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresuTransferencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonGuardarCambiosPresuTransferencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosPresuTransferencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonGuardarCambiosToolBarPresuTransferencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresuTransferencia"));
		}
		
		this.jButtonCopiarToolBarPresuTransferencia.addActionListener (new ButtonActionListener(this,"CopiarToolBarPresuTransferencia"));
			
		this.jButtonVerFormToolBarPresuTransferencia.addActionListener (new ButtonActionListener(this,"VerFormToolBarPresuTransferencia"));
		
		this.jMenuItemGuardarCambiosPresuTransferencia.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPresuTransferencia"));
			
		this.jMenuItemCopiarPresuTransferencia.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPresuTransferencia"));		
		
		this.jMenuItemVerFormPresuTransferencia.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPresuTransferencia"));		
		
		
		this.jButtonGuardarCambiosTablaPresuTransferencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresuTransferencia"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPresuTransferencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPresuTransferencia"));
			
		this.jMenuItemGuardarCambiosTablaPresuTransferencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresuTransferencia"));		
		
		
		
		this.jButtonRecargarInformacionPresuTransferencia.addActionListener (new ButtonActionListener(this,"RecargarInformacionPresuTransferencia"));
					
		this.jButtonRecargarInformacionToolBarPresuTransferencia.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPresuTransferencia"));
		
		this.jMenuItemRecargarInformacionPresuTransferencia.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPresuTransferencia"));		
		
		
		
		this.jButtonAnterioresPresuTransferencia.addActionListener (new ButtonActionListener(this,"AnterioresPresuTransferencia"));
		
		
		this.jButtonAnterioresToolBarPresuTransferencia.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPresuTransferencia"));
		
		this.jMenuItemAnterioresPresuTransferencia.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPresuTransferencia"));		
		
		
		this.jButtonSiguientesPresuTransferencia.addActionListener (new ButtonActionListener(this,"SiguientesPresuTransferencia"));
		
		
		this.jButtonSiguientesToolBarPresuTransferencia.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPresuTransferencia"));
			
		this.jMenuItemSiguientesPresuTransferencia.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPresuTransferencia"));
			
		this.jMenuItemAbrirOrderByPresuTransferencia.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPresuTransferencia"));
			
		this.jMenuItemMostrarOcultarPresuTransferencia.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPresuTransferencia"));
			
		this.jMenuItemDetalleAbrirOrderByPresuTransferencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPresuTransferencia"));
			
		this.jMenuItemDetalleMostarOcultarPresuTransferencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPresuTransferencia"));		
		
		
		this.jButtonNuevoGuardarCambiosPresuTransferencia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPresuTransferencia"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresuTransferencia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPresuTransferencia"));
			
		this.jMenuItemNuevoGuardarCambiosPresuTransferencia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPresuTransferencia"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPresuTransferencia.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPresuTransferencia"));

		this.jCheckBoxSeleccionadosPresuTransferencia.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPresuTransferencia"));
		
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxTiposAccionesFormularioPresuTransferencia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresuTransferencia"));
		}
		
		
		this.jComboBoxTiposRelacionesPresuTransferencia.addActionListener (new ButtonActionListener(this,"TiposRelacionesPresuTransferencia"));
			
		this.jComboBoxTiposAccionesPresuTransferencia.addActionListener (new ButtonActionListener(this,"TiposAccionesPresuTransferencia"));
					
		this.jComboBoxTiposSeleccionarPresuTransferencia.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPresuTransferencia"));
			
		this.jTextFieldValorCampoGeneralPresuTransferencia.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPresuTransferencia"));		
		
		
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonidPresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"idPresuTransferenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_presu_proyectoPresuTransferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_presu_proyectoPresuTransferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_presu_proyectoPresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_proyectoPresuTransferenciaBusqueda"));
		//jButtonid_cuenta_contablePresuTransferencia.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contablePresuTransferenciaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contablePresuTransferencia.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuTransferencia"));
		//jButtonid_cuenta_contablePresuTransferenciaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contablePresuTransferenciaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuTransferenciaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contablePresuTransferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuTransferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contablePresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuTransferenciaBusqueda"));
		//jButtonid_cuenta_contable_destinoPresuTransferencia.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_destinoPresuTransferenciaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contable_destinoPresuTransferencia.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_destinoPresuTransferencia"));
		//jButtonid_cuenta_contable_destinoPresuTransferenciaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableDestino("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contable_destinoPresuTransferenciaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_destinoPresuTransferenciaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contable_destinoPresuTransferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_destinoPresuTransferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contable_destinoPresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_destinoPresuTransferenciaBusqueda"));
		//jButtonid_empleadoPresuTransferencia.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoPresuTransferenciaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_empleadoPresuTransferencia.addActionListener(new ButtonActionListener(this,"id_empleadoPresuTransferencia"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_empleadoPresuTransferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoPresuTransferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_empleadoPresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoPresuTransferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonfechaPresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"fechaPresuTransferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonvalorPresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"valorPresuTransferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtondescripcionPresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPresuTransferenciaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCuentaContablePresuTransferencia.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContablePresuTransferencia"));

			this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresuTransferencia.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuTransferencia"));

			this.jButtonFK_IdCuentaContableDestinoPresuTransferencia.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableDestinoPresuTransferencia"));

			this.jButtonBuscarFK_IdCuentaContableDestinoid_cuenta_contable_destinoPresuTransferencia.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_destinoPresuTransferencia"));

			this.jButtonFK_IdEmpleadoPresuTransferencia.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoPresuTransferencia"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuTransferencia.addActionListener(new ButtonActionListener(this,"id_empleadoPresuTransferencia"));

			this.jButtonFK_IdPresuProyectoPresuTransferencia.addActionListener(new ButtonActionListener(this,"FK_IdPresuProyectoPresuTransferencia"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPresuTransferencia!=null) {
				this.jInternalFrameReporteDinamicoPresuTransferencia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresuTransferencia"));
				this.jInternalFrameReporteDinamicoPresuTransferencia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresuTransferencia"));
				this.jInternalFrameReporteDinamicoPresuTransferencia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresuTransferencia"));
			}
			
			//this.jButtonCerrarReporteDinamicoPresuTransferencia.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresuTransferencia"));				
			//this.jButtonGenerarReporteDinamicoPresuTransferencia.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresuTransferencia"));
			//this.jButtonGenerarExcelReporteDinamicoPresuTransferencia.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresuTransferencia"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPresuTransferencia!=null) {
				this.jInternalFrameImportacionPresuTransferencia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresuTransferencia"));
				this.jInternalFrameImportacionPresuTransferencia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresuTransferencia"));
				this.jInternalFrameImportacionPresuTransferencia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresuTransferencia"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPresuTransferencia.addActionListener (new ButtonActionListener(this,"AbrirOrderByPresuTransferencia"));
			
			this.jButtonAbrirOrderByToolBarPresuTransferencia.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPresuTransferencia"));			
			
			if(this.jInternalFrameOrderByPresuTransferencia!=null) {
				this.jInternalFrameOrderByPresuTransferencia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresuTransferencia"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTransferencia.jTabbedPaneRelacionesPresuTransferencia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresuTransferencia"));
		
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
            		closingInternalFramePresuTransferencia();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPresuTransferencia.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPresuTransferencia = (JInternalFrameBase)event.getSource();
	            	
	            PresuTransferenciaBeanSwingJInternalFrame jInternalFrameParent=(PresuTransferenciaBeanSwingJInternalFrame)jInternalFrameDetalleFormPresuTransferencia.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPresuTransferenciaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPresuTransferencia.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPresuTransferenciaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPresuTransferencia.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPresuTransferencia.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuTransferenciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuTransferenciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuTransferenciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPresuTransferencia";
		inputMap = this.jButtonNuevoPresuTransferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPresuTransferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresuTransferenciaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuTransferenciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuTransferenciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuTransferenciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPresuTransferencia";
		inputMap = this.jButtonNuevoRelacionesPresuTransferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPresuTransferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresuTransferenciaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPresuTransferencia";
		inputMap = this.jButtonModificarPresuTransferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPresuTransferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPresuTransferenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPresuTransferencia";
		inputMap = this.jButtonActualizarPresuTransferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPresuTransferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPresuTransferenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPresuTransferencia";
		inputMap = this.jButtonEliminarPresuTransferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPresuTransferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPresuTransferenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPresuTransferencia";
		inputMap = this.jButtonCancelarPresuTransferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPresuTransferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPresuTransferenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPresuTransferencia";
		inputMap = this.jButtonCerrarPresuTransferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPresuTransferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPresuTransferenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonGuardarCambiosPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPresuTransferencia";
		inputMap = this.jInternalFrameDetalleFormPresuTransferencia.jButtonGuardarCambiosPresuTransferencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonGuardarCambiosPresuTransferencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPresuTransferenciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPresuTransferencia.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPresuTransferenciaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPresuTransferencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPresuTransferenciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPresuTransferencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPresuTransferenciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPresuTransferencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPresuTransferenciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonidPresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"idPresuTransferenciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_presu_proyectoPresuTransferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_presu_proyectoPresuTransferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_presu_proyectoPresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_presu_proyectoPresuTransferenciaBusqueda"));
		//jButtonid_cuenta_contablePresuTransferencia.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contablePresuTransferenciaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contablePresuTransferencia.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuTransferencia"));
		//jButtonid_cuenta_contablePresuTransferenciaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContable("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contablePresuTransferenciaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuTransferenciaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contablePresuTransferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuTransferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contablePresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuTransferenciaBusqueda"));
		//jButtonid_cuenta_contable_destinoPresuTransferencia.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_destinoPresuTransferenciaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contable_destinoPresuTransferencia.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_destinoPresuTransferencia"));
		//jButtonid_cuenta_contable_destinoPresuTransferenciaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableDestino("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contable_destinoPresuTransferenciaArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_destinoPresuTransferenciaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contable_destinoPresuTransferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_destinoPresuTransferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contable_destinoPresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_destinoPresuTransferenciaBusqueda"));
		//jButtonid_empleadoPresuTransferencia.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoPresuTransferenciaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_empleadoPresuTransferencia.addActionListener(new ButtonActionListener(this,"id_empleadoPresuTransferencia"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_empleadoPresuTransferenciaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoPresuTransferenciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_empleadoPresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoPresuTransferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonfechaPresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"fechaPresuTransferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtonvalorPresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"valorPresuTransferenciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTransferencia.jButtondescripcionPresuTransferenciaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPresuTransferenciaBusqueda"));
		
		
		this.jButtonFK_IdCuentaContablePresuTransferencia.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContablePresuTransferencia"));

		this.jButtonBuscarFK_IdCuentaContableid_cuenta_contablePresuTransferencia.addActionListener(new ButtonActionListener(this,"id_cuenta_contablePresuTransferencia"));

		this.jButtonFK_IdCuentaContableDestinoPresuTransferencia.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableDestinoPresuTransferencia"));

		this.jButtonBuscarFK_IdCuentaContableDestinoid_cuenta_contable_destinoPresuTransferencia.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_destinoPresuTransferencia"));

		this.jButtonFK_IdEmpleadoPresuTransferencia.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoPresuTransferencia"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoPresuTransferencia.addActionListener(new ButtonActionListener(this,"id_empleadoPresuTransferencia"));

		this.jButtonFK_IdPresuProyectoPresuTransferencia.addActionListener(new ButtonActionListener(this,"FK_IdPresuProyectoPresuTransferencia"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPresuTransferencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPresuTransferenciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPresuTransferenciaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPresuTransferencia.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPresuTransferencia(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PresuTransferencia presutransferenciaAux:this.presutransferenciaLogic.getPresuTransferencias()) {
					presutransferenciaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuTransferencia presutransferenciaAux:presutransferencias) {
					presutransferenciaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPresuTransferenciaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresuTransferencia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresuTransferencia presutransferenciaAux:this.presutransferenciaLogic.getPresuTransferencias()) {
						presutransferenciaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresuTransferencia presutransferenciaAux:presutransferencias) {
						presutransferenciaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PresuTransferencia presutransferenciaAux:this.presutransferenciaLogic.getPresuTransferencias()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresuTransferencia presutransferenciaAux:presutransferencias) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPresuTransferencia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresuTransferencia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresuTransferencia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresuTransferencia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPresuTransferenciaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresuTransferencia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPresuTransferencia.getSelectedRows();
			
			PresuTransferencia presutransferenciaLocal=new PresuTransferencia();
			
			//this.seleccionarTodosPresuTransferencia(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presutransferenciaLocal =(PresuTransferencia) this.presutransferenciaLogic.getPresuTransferencias().toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					presutransferenciaLocal =(PresuTransferencia) this.presutransferencias.toArray()[this.jTableDatosPresuTransferencia.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				presutransferenciaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresuTransferencia presutransferenciaAux:this.presutransferenciaLogic.getPresuTransferencias()) {
						presutransferenciaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresuTransferencia presutransferenciaAux:presutransferencias) {
						presutransferenciaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPresuTransferencia(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresuTransferencia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresuTransferencia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresuTransferencia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPresuTransferenciaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPresuTransferenciaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPresuTransferenciaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPresuTransferencia(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPresuTransferencia.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresuTransferencia presutransferenciaAux:this.presutransferenciaLogic.getPresuTransferencias()) {
				
						if(sTipoSeleccionar.equals(PresuTransferenciaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							presutransferenciaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresuTransferenciaConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							presutransferenciaAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresuTransferenciaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							presutransferenciaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuTransferencia presutransferenciaAux:presutransferencias) {
					
						if(sTipoSeleccionar.equals(PresuTransferenciaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							presutransferenciaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresuTransferenciaConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							presutransferenciaAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PresuTransferenciaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							presutransferenciaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPresuTransferencia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPresuTransferenciaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPresuTransferencia(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPresuTransferencia=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPresuTransferencia.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxTiposAccionesFormularioPresuTransferencia.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePresuTransferencia) {				
					conSplash=true;//false;										
					
					//this.startProcessPresuTransferencia(conSplash);
				
					this.generarReportePresuTransferenciasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuTransferencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxTiposAccionesFormularioPresuTransferencia.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPresuTransferenciasSeleccionados();
				//this.jComboBoxTiposAccionesPresuTransferencia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresuTransferenciasSeleccionados(false);
				//this.jComboBoxTiposAccionesPresuTransferencia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresuTransferenciasSeleccionados(true);
				//this.jComboBoxTiposAccionesPresuTransferencia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresuTransferencia();
				
				this.exportarPresuTransferenciasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuTransferencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxTiposAccionesFormularioPresuTransferencia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPresuTransferencias();
				//this.importarPresuTransferencias();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuTransferencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxTiposAccionesFormularioPresuTransferencia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresuTransferencia();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPresuTransferenciasSeleccionados();
				//this.jComboBoxTiposAccionesPresuTransferencia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Transferencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPresuTransferencia();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPresuTransferencia)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPresuTransferencia(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Transferencia",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuTransferencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxTiposAccionesFormularioPresuTransferencia.setSelectedIndex(0);					
				}	
			} 			
			else if(PresuTransferenciaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePresuTransferencia) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPresuTransferencia(conSplash);
					
						//this.actualizarParametrosGeneralPresuTransferencia();
						
						this.generarReporteProcesoAccionPresuTransferenciasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPresuTransferencia.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxTiposAccionesFormularioPresuTransferencia.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PresuTransferenciaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO TransferenciaES SELECCIONADOS?", "MANTENIMIENTO DE Transferencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPresuTransferencia();
				
						this.actualizarParametrosGeneralPresuTransferencia();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.presutransferenciaReturnGeneral=presutransferenciaLogic.procesarAccionPresuTransferenciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.presutransferenciaLogic.getPresuTransferencias(),this.presutransferenciaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPresuTransferenciaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresuTransferencia.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxTiposAccionesFormularioPresuTransferencia.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPresuTransferencia();
					
					PresuTransferenciaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPresuTransferenciaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresuTransferencia.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxTiposAccionesFormularioPresuTransferencia.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPresuTransferencia(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPresuTransferenciaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPresuTransferencia();
			
			if(this.jInternalFrameDetalleFormPresuTransferencia==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PresuTransferencia> presutransferenciasSeleccionados=new ArrayList<PresuTransferencia>();		
			PresuTransferencia presutransferencia=new PresuTransferencia();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPresuTransferencia(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPresuTransferencia.getSelectedItem();
			
			
			
			
			presutransferenciasSeleccionados=this.getPresuTransferenciasSeleccionados(true);
			//this.sTipoAccion;
			
			if(presutransferenciasSeleccionados.size()==1) {
				for(PresuTransferencia presutransferenciaAux:presutransferenciasSeleccionados) {
					presutransferencia=presutransferenciaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPresuTransferencia();
			
      		//this.finishProcessPresuTransferencia(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPresuTransferenciaReturnGeneral() throws Exception {
		if(this.presutransferenciaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.presutransferenciaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.presutransferenciaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.presutransferenciaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.presutransferenciaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.presutransferenciaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPresuTransferencia(false);
		}
		
		if(this.presutransferenciaReturnGeneral.getConRetornoLista() || this.presutransferenciaReturnGeneral.getConRetornoObjeto()) {
			if(this.presutransferenciaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presutransferenciaLogic.setPresuTransferencias(this.presutransferenciaReturnGeneral.getPresuTransferencias());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.presutransferenciaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presutransferenciaLogic.setPresuTransferencia(this.presutransferenciaReturnGeneral.getPresuTransferencia());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPresuTransferencia(false);
		}
	}
	
	public void actualizarParametrosGeneralPresuTransferencia() throws Exception {
		
		
	}
	
	public ArrayList<PresuTransferencia> getPresuTransferenciasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PresuTransferencia> presutransferenciasSeleccionados=new ArrayList<PresuTransferencia>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPresuTransferencia) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PresuTransferencia presutransferenciaAux:presutransferenciaLogic.getPresuTransferencias()) {
					if(presutransferenciaAux.getIsSelected()) {
						presutransferenciasSeleccionados.add(presutransferenciaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuTransferencia presutransferenciaAux:this.presutransferencias) {
					if(presutransferenciaAux.getIsSelected()) {
						presutransferenciasSeleccionados.add(presutransferenciaAux);				
					}
				}
			}
			
			if(presutransferenciasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						presutransferenciasSeleccionados.addAll(this.presutransferenciaLogic.getPresuTransferencias());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						presutransferenciasSeleccionados.addAll(this.presutransferencias);				
					}
				}
			}
		} else {
			presutransferenciasSeleccionados.add(this.presutransferencia);
		}
		
		return presutransferenciasSeleccionados;
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
	
	public void generarReportePresuTransferenciasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPresuTransferenciasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPresuTransferenciasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresuTransferenciasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresuTransferenciasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Transferencia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPresuTransferenciasSeleccionados() throws Exception {
		ArrayList<PresuTransferencia> presutransferenciasSeleccionados=new ArrayList<PresuTransferencia>();		
		
		presutransferenciasSeleccionados=this.getPresuTransferenciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePresuTransferencias("Todos",presutransferenciasSeleccionados);
		
	}	
	
	public void generarReporteNormalPresuTransferenciasSeleccionados() throws Exception {
		ArrayList<PresuTransferencia> presutransferenciasSeleccionados=new ArrayList<PresuTransferencia>();		
		
		presutransferenciasSeleccionados=this.getPresuTransferenciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePresuTransferencias("Todos",presutransferenciasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPresuTransferenciasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PresuTransferencia> presutransferenciasSeleccionados=new ArrayList<PresuTransferencia>();
		
		presutransferenciasSeleccionados=this.getPresuTransferenciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePresuTransferencias("Todos",presutransferenciasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPresuTransferenciasSeleccionados() throws Exception {
		ArrayList<PresuTransferencia> presutransferenciasSeleccionados=new ArrayList<PresuTransferencia>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPresuTransferencia();
		
		
		presutransferenciasSeleccionados=this.getPresuTransferenciasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPresuTransferencia();
		
		
		//this.generarReportePresuTransferencias("Todos",presutransferenciasSeleccionados ,presutransferenciaImplementable,presutransferenciaImplementableHome);
	}
	
	public void mostrarImportacionPresuTransferencias() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPresuTransferencia();
		
		this.abrirFrameImportacionPresuTransferencia();		
		
			
		//this.generarReportePresuTransferencias("Todos",presutransferenciasSeleccionados ,presutransferenciaImplementable,presutransferenciaImplementableHome);
	}
	
	public void importarPresuTransferencias() throws Exception {		
	
	}
	
	public void exportarPresuTransferenciasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPresuTransferenciasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPresuTransferenciasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPresuTransferenciasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Transferencia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPresuTransferenciasSeleccionados() throws Exception {
		ArrayList<PresuTransferencia> presutransferenciasSeleccionados=new ArrayList<PresuTransferencia>();		
		
		presutransferenciasSeleccionados=this.getPresuTransferenciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presutransferencia."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPresuTransferencia(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PresuTransferencia presutransferenciaAux:presutransferenciasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPresuTransferencia(presutransferenciaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//presutransferenciaAux.setsDetalleGeneralEntityReporte(presutransferenciaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPresuTransferencia(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PresuTransferenciaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuTransferenciaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuTransferenciaConstantesFunciones.LABEL_IDPRESUPROYECTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLEDESTINO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuTransferenciaConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuTransferenciaConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuTransferenciaConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuTransferenciaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPresuTransferencia(PresuTransferencia presutransferencia,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=presutransferencia.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=presutransferencia.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=presutransferencia.getpresuproyecto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presutransferencia.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presutransferencia.getcuentacontabledestino_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presutransferencia.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presutransferencia.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presutransferencia.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presutransferencia.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPresuTransferenciasSeleccionados() throws Exception {
		ArrayList<PresuTransferencia> presutransferenciasSeleccionados=new ArrayList<PresuTransferencia>();		
		
		presutransferenciasSeleccionados=this.getPresuTransferenciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presutransferencia.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PresuTransferencias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPresuTransferencia(row);				
				iRow++;
			}				
			
			for(PresuTransferencia presutransferenciaAux:presutransferenciasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPresuTransferencia(presutransferenciaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPresuTransferenciasSeleccionados() throws Exception {
		ArrayList<PresuTransferencia> presutransferenciasSeleccionados=new ArrayList<PresuTransferencia>();		
		
		presutransferenciasSeleccionados=this.getPresuTransferenciasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presutransferencia.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("presutransferencias");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("presutransferencia");
			//elementRoot.appendChild(element);
		
			for(PresuTransferencia presutransferenciaAux:presutransferenciasSeleccionados) {
				element = document.createElement("presutransferencia");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPresuTransferencia(presutransferenciaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPresuTransferencia(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PresuTransferenciaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PresuTransferenciaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PresuTransferenciaConstantesFunciones.LABEL_IDPRESUPROYECTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLEDESTINO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuTransferenciaConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuTransferenciaConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuTransferenciaConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuTransferenciaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPresuTransferencia(PresuTransferencia presutransferencia,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(presutransferencia.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(presutransferencia.getpresuproyecto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presutransferencia.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presutransferencia.getcuentacontabledestino_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presutransferencia.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presutransferencia.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(presutransferencia.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(presutransferencia.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlPresuTransferencia(PresuTransferencia presutransferencia,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PresuTransferenciaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(presutransferencia.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PresuTransferenciaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(presutransferencia.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpresuproyecto_descripcion = document.createElement(PresuTransferenciaConstantesFunciones.IDPRESUPROYECTO);
		elementpresuproyecto_descripcion.appendChild(document.createTextNode(presutransferencia.getpresuproyecto_descripcion()));
		element.appendChild(elementpresuproyecto_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(PresuTransferenciaConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(presutransferencia.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementcuentacontabledestino_descripcion = document.createElement(PresuTransferenciaConstantesFunciones.IDCUENTACONTABLEDESTINO);
		elementcuentacontabledestino_descripcion.appendChild(document.createTextNode(presutransferencia.getcuentacontabledestino_descripcion()));
		element.appendChild(elementcuentacontabledestino_descripcion);

		Element elementempleado_descripcion = document.createElement(PresuTransferenciaConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(presutransferencia.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementfecha = document.createElement(PresuTransferenciaConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(presutransferencia.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementvalor = document.createElement(PresuTransferenciaConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(presutransferencia.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementdescripcion = document.createElement(PresuTransferenciaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(presutransferencia.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoPresuTransferenciasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PresuTransferencia> presutransferenciasSeleccionados=new ArrayList<PresuTransferencia>();
		
		presutransferenciasSeleccionados=this.getPresuTransferenciasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPresuTransferencia(presutransferenciasSeleccionados);
		
		this.generarReportePresuTransferencias("Todos",presutransferenciasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPresuTransferencia(ArrayList<PresuTransferencia> presutransferenciasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PresuTransferencia presutransferenciaAux:presutransferenciasSeleccionados) {
				presutransferenciaAux.setsDetalleGeneralEntityReporte(presutransferenciaAux.toString());
			
				if(sTipoSeleccionar.equals(PresuTransferenciaConstantesFunciones.LABEL_IDPRESUPROYECTO)) {
					existe=true;
					presutransferenciaAux.setsDescripcionGeneralEntityReporte1(presutransferenciaAux.getpresuproyecto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					presutransferenciaAux.setsDescripcionGeneralEntityReporte1(presutransferenciaAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLEDESTINO)) {
					existe=true;
					presutransferenciaAux.setsDescripcionGeneralEntityReporte1(presutransferenciaAux.getcuentacontabledestino_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresuTransferenciaConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					presutransferenciaAux.setsDescripcionGeneralEntityReporte1(presutransferenciaAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresuTransferenciaConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					presutransferenciaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(presutransferenciaAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(PresuTransferenciaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					presutransferenciaAux.setsDescripcionGeneralEntityReporte1(presutransferenciaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTransferenciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPresuTransferencia(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPresuTransferencia=true;
				this.isVisibilidadCeldaNuevoRelacionesPresuTransferencia=true;
				this.isVisibilidadCeldaGuardarCambiosPresuTransferencia=true;
			}
			
			this.isVisibilidadCeldaModificarPresuTransferencia=false;
			this.isVisibilidadCeldaActualizarPresuTransferencia=false;
			this.isVisibilidadCeldaEliminarPresuTransferencia=false;
			this.isVisibilidadCeldaCancelarPresuTransferencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuTransferencia=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuTransferencia=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPresuTransferencia=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuTransferencia=false;
			this.isVisibilidadCeldaGuardarCambiosPresuTransferencia=false;
			this.isVisibilidadCeldaModificarPresuTransferencia=false;
			this.isVisibilidadCeldaActualizarPresuTransferencia=true;
			this.isVisibilidadCeldaEliminarPresuTransferencia=false;
			this.isVisibilidadCeldaCancelarPresuTransferencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuTransferencia=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuTransferencia=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPresuTransferencia=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuTransferencia=false;
			this.isVisibilidadCeldaGuardarCambiosPresuTransferencia=false;
			this.isVisibilidadCeldaModificarPresuTransferencia=false;
			this.isVisibilidadCeldaActualizarPresuTransferencia=true;
			this.isVisibilidadCeldaEliminarPresuTransferencia=true;
			this.isVisibilidadCeldaCancelarPresuTransferencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuTransferencia=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuTransferencia=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPresuTransferencia=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuTransferencia=false;
			this.isVisibilidadCeldaGuardarCambiosPresuTransferencia=false;
			this.isVisibilidadCeldaModificarPresuTransferencia=false;
			this.isVisibilidadCeldaActualizarPresuTransferencia=true;
			this.isVisibilidadCeldaEliminarPresuTransferencia=false;
			this.isVisibilidadCeldaCancelarPresuTransferencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuTransferencia=false;
				} else {
					this.isVisibilidadCeldaGuardarPresuTransferencia=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPresuTransferencia=true;
			this.isVisibilidadCeldaNuevoRelacionesPresuTransferencia=true;
			this.isVisibilidadCeldaGuardarCambiosPresuTransferencia=true;
			this.isVisibilidadCeldaModificarPresuTransferencia=false;
			this.isVisibilidadCeldaActualizarPresuTransferencia=false;
			this.isVisibilidadCeldaEliminarPresuTransferencia=false;
			this.isVisibilidadCeldaCancelarPresuTransferencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuTransferencia=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuTransferencia=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPresuTransferencia=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuTransferencia=false;
			this.isVisibilidadCeldaGuardarCambiosPresuTransferencia=false;
			this.isVisibilidadCeldaActualizarPresuTransferencia=false;
			this.isVisibilidadCeldaEliminarPresuTransferencia=false;
			this.isVisibilidadCeldaCancelarPresuTransferencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuTransferencia=false;
				} else {
					this.isVisibilidadCeldaGuardarPresuTransferencia=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPresuTransferencia=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuTransferencia=false;
			this.isVisibilidadCeldaGuardarCambiosPresuTransferencia=false;
			this.isVisibilidadCeldaModificarPresuTransferencia=true;
			this.isVisibilidadCeldaActualizarPresuTransferencia=false;
			this.isVisibilidadCeldaEliminarPresuTransferencia=false;
			this.isVisibilidadCeldaCancelarPresuTransferencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuTransferencia=false;
				} else {
					this.isVisibilidadCeldaGuardarPresuTransferencia=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PresuTransferenciaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPresuTransferencia=true;
			this.isVisibilidadCeldaNuevoRelacionesPresuTransferencia=true;
			this.isVisibilidadCeldaGuardarCambiosPresuTransferencia=true;
		} else {
			this.actualizarEstadoPanelsPresuTransferencia(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPresuTransferencia=false;
			//this.isVisibilidadCeldaVerFormPresuTransferencia=false;
			this.isVisibilidadCeldaDuplicarPresuTransferencia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!presutransferenciaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPresuTransferencia=false;
		} else {
			this.isVisibilidadCeldaNuevoPresuTransferencia=false;
			this.isVisibilidadCeldaGuardarCambiosPresuTransferencia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(presutransferenciaSessionBean.getEsGuardarRelacionado()) {
			if(!presutransferenciaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPresuTransferencia=false;												
			}
			
			this.jButtonCerrarPresuTransferencia.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPresuTransferencia=false;
		}
		
		if(!this.permiteMantenimiento(this.presutransferencia)) {
			this.isVisibilidadCeldaActualizarPresuTransferencia=false;
			this.isVisibilidadCeldaEliminarPresuTransferencia=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPresuTransferencia() {
	}
	
	public void actualizarEstadoPanelsPresuTransferencia(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPresuTransferencia!=null) {
				this.jScrollPanelDatosEdicionPresuTransferencia.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTransferencia!=null) {
				this.jTabbedPaneBusquedasPresuTransferencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuTransferencia!=null) {
				this.jScrollPanelDatosPresuTransferencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuTransferencia!=null) {
				this.jPanelPaginacionPresuTransferencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuTransferencia!=null) {
				this.jPanelParametrosReportesPresuTransferencia.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPresuTransferencia!=null) {
				this.jScrollPanelDatosEdicionPresuTransferencia.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTransferencia!=null) {
				this.jTabbedPaneBusquedasPresuTransferencia.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPresuTransferencia!=null) {
				this.jScrollPanelDatosPresuTransferencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresuTransferencia!=null) {
				this.jPanelPaginacionPresuTransferencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresuTransferencia!=null) {
				this.jPanelParametrosReportesPresuTransferencia.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPresuTransferencia!=null) {
				this.jScrollPanelDatosEdicionPresuTransferencia.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTransferencia!=null) {
				this.jTabbedPaneBusquedasPresuTransferencia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresuTransferencia!=null) {
				this.jScrollPanelDatosPresuTransferencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresuTransferencia!=null) {
				this.jPanelPaginacionPresuTransferencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresuTransferencia!=null) {
				this.jPanelParametrosReportesPresuTransferencia.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPresuTransferencia!=null) {
				this.jScrollPanelDatosEdicionPresuTransferencia.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTransferencia!=null) {
				this.jTabbedPaneBusquedasPresuTransferencia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresuTransferencia!=null) {
				this.jScrollPanelDatosPresuTransferencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresuTransferencia!=null) {
				this.jPanelPaginacionPresuTransferencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresuTransferencia!=null) {
				this.jPanelParametrosReportesPresuTransferencia.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPresuTransferencia!=null) {
				this.jScrollPanelDatosEdicionPresuTransferencia.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTransferencia!=null) {
				this.jTabbedPaneBusquedasPresuTransferencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuTransferencia!=null) {
				this.jScrollPanelDatosPresuTransferencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuTransferencia!=null) {
				this.jPanelPaginacionPresuTransferencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuTransferencia!=null) {
				this.jPanelParametrosReportesPresuTransferencia.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPresuTransferencia!=null) {
				this.jScrollPanelDatosEdicionPresuTransferencia.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTransferencia!=null) {
				this.jTabbedPaneBusquedasPresuTransferencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuTransferencia!=null) {
				this.jScrollPanelDatosPresuTransferencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuTransferencia!=null) {
				this.jPanelPaginacionPresuTransferencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuTransferencia!=null) {
				this.jPanelParametrosReportesPresuTransferencia.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPresuTransferencia!=null) {
				this.jScrollPanelDatosEdicionPresuTransferencia.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTransferencia!=null) {
				this.jTabbedPaneBusquedasPresuTransferencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuTransferencia!=null) {
				this.jScrollPanelDatosPresuTransferencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuTransferencia!=null) {
				this.jPanelPaginacionPresuTransferencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuTransferencia!=null) {
				this.jPanelParametrosReportesPresuTransferencia.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPresuTransferencia!=null) {
					this.jTabbedPaneBusquedasPresuTransferencia.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPresuTransferencia!=null) {
				this.jPanelParametrosReportesPresuTransferencia.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTransferencia!=null) {
				this.jTabbedPaneBusquedasPresuTransferencia.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPresuTransferencia!=null) {
				this.jPanelParametrosReportesPresuTransferencia.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPresuProyecto(Boolean isParaPresuProyecto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPresuProyectoNegation=!isParaPresuProyecto;

			this.isVisibilidadFK_IdCuentaContable=isParaPresuProyectoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasPresuTransferencia.remove(jPanelFK_IdCuentaContablePresuTransferencia);}

			this.isVisibilidadFK_IdCuentaContableDestino=isParaPresuProyectoNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDestino) {this.jTabbedPaneBusquedasPresuTransferencia.remove(jPanelFK_IdCuentaContableDestinoPresuTransferencia);}

			this.isVisibilidadFK_IdEmpleado=isParaPresuProyectoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPresuTransferencia.remove(jPanelFK_IdEmpleadoPresuTransferencia);}

			this.isVisibilidadFK_IdPresuProyecto=isParaPresuProyecto;
			if(!this.isVisibilidadFK_IdPresuProyecto) {this.jTabbedPaneBusquedasPresuTransferencia.remove(jPanelFK_IdPresuProyectoPresuTransferencia);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasPresuTransferencia.remove(jPanelFK_IdCuentaContablePresuTransferencia);}

			this.isVisibilidadFK_IdCuentaContableDestino=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDestino) {this.jTabbedPaneBusquedasPresuTransferencia.remove(jPanelFK_IdCuentaContableDestinoPresuTransferencia);}

			this.isVisibilidadFK_IdEmpleado=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPresuTransferencia.remove(jPanelFK_IdEmpleadoPresuTransferencia);}

			this.isVisibilidadFK_IdPresuProyecto=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdPresuProyecto) {this.jTabbedPaneBusquedasPresuTransferencia.remove(jPanelFK_IdPresuProyectoPresuTransferencia);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableDestino(Boolean isParaCuentaContableDestino){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableDestinoNegation=!isParaCuentaContableDestino;

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContableDestinoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasPresuTransferencia.remove(jPanelFK_IdCuentaContablePresuTransferencia);}

			this.isVisibilidadFK_IdCuentaContableDestino=isParaCuentaContableDestino;
			if(!this.isVisibilidadFK_IdCuentaContableDestino) {this.jTabbedPaneBusquedasPresuTransferencia.remove(jPanelFK_IdCuentaContableDestinoPresuTransferencia);}

			this.isVisibilidadFK_IdEmpleado=isParaCuentaContableDestinoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPresuTransferencia.remove(jPanelFK_IdEmpleadoPresuTransferencia);}

			this.isVisibilidadFK_IdPresuProyecto=isParaCuentaContableDestinoNegation;
			if(!this.isVisibilidadFK_IdPresuProyecto) {this.jTabbedPaneBusquedasPresuTransferencia.remove(jPanelFK_IdPresuProyectoPresuTransferencia);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdCuentaContable=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasPresuTransferencia.remove(jPanelFK_IdCuentaContablePresuTransferencia);}

			this.isVisibilidadFK_IdCuentaContableDestino=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdCuentaContableDestino) {this.jTabbedPaneBusquedasPresuTransferencia.remove(jPanelFK_IdCuentaContableDestinoPresuTransferencia);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasPresuTransferencia.remove(jPanelFK_IdEmpleadoPresuTransferencia);}

			this.isVisibilidadFK_IdPresuProyecto=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdPresuProyecto) {this.jTabbedPaneBusquedasPresuTransferencia.remove(jPanelFK_IdPresuProyectoPresuTransferencia);}
		}
		
	}
	
	
	
	

	public String registrarSesionPresuTransferenciaParaBusquedaCuentaContables() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(presutransferenciaSessionBean==null) {
				presutransferenciaSessionBean=new PresuTransferenciaSessionBean();
			}

			if(cuentacontableSessionBean==null) {
				cuentacontableSessionBean=new CuentaContableSessionBean();
			}

			cuentacontableSessionBean.setsPathNavegacionActual(presutransferenciaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontableSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontableSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontableSessionBean.getisPaginaPopup();
			cuentacontableSessionBean.setisPaginaPopup(false);
			cuentacontableSessionBean.setEstaModoBusqueda(true);
			cuentacontableSessionBean.setsFuncionBusquedaRapida("window.opener.presutransferenciaFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable(TO_REPLACE);");
			cuentacontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(PresuTransferenciaConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionPresuTransferencia(true);
			//cuentacontableSessionBean.setlidPresuTransferenciaActual(this.idPresuTransferenciaActual);

			presutransferenciaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPresuTransferencia(true);
			presutransferenciaSessionBean.setlIdPresuTransferenciaActualForeignKey(this.idPresuTransferenciaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionPresuTransferenciaParaBusquedaCuentaContableDestinos() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(presutransferenciaSessionBean==null) {
				presutransferenciaSessionBean=new PresuTransferenciaSessionBean();
			}

			if(cuentacontabledestinoSessionBean==null) {
				cuentacontabledestinoSessionBean=new CuentaContableSessionBean();
			}

			cuentacontabledestinoSessionBean.setsPathNavegacionActual(presutransferenciaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontabledestinoSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontabledestinoSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontabledestinoSessionBean.getisPaginaPopup();
			cuentacontabledestinoSessionBean.setisPaginaPopup(false);
			cuentacontabledestinoSessionBean.setEstaModoBusqueda(true);
			cuentacontabledestinoSessionBean.setsFuncionBusquedaRapida("window.opener.presutransferenciaFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable_destino(TO_REPLACE);");
			cuentacontabledestinoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontabledestinoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(PresuTransferenciaConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionPresuTransferencia(true);
			//cuentacontableSessionBean.setlidPresuTransferenciaActual(this.idPresuTransferenciaActual);

			presutransferenciaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPresuTransferencia(true);
			presutransferenciaSessionBean.setlIdPresuTransferenciaActualForeignKey(this.idPresuTransferenciaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionPresuTransferenciaParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(presutransferenciaSessionBean==null) {
				presutransferenciaSessionBean=new PresuTransferenciaSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(presutransferenciaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.presutransferenciaFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(PresuTransferenciaConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionPresuTransferencia(true);
			//empleadoSessionBean.setlidPresuTransferenciaActual(this.idPresuTransferenciaActual);

			presutransferenciaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPresuTransferencia(true);
			presutransferenciaSessionBean.setlIdPresuTransferenciaActualForeignKey(this.idPresuTransferenciaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PresuTransferenciaSessionBean presutransferenciaSessionBean=new PresuTransferenciaSessionBean();
		
		if(this.presutransferenciaSessionBean==null) {
			this.presutransferenciaSessionBean=new PresuTransferenciaSessionBean();
		}
		
		this.presutransferenciaSessionBean.setsUltimaBusquedaPresuTransferencia(this.getsAccionBusqueda());
		this.presutransferenciaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.presutransferenciaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			presutransferenciaSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableDestino")) {
			presutransferenciaSessionBean.setid_cuenta_contable_destino(this.getid_cuenta_contable_destinoFK_IdCuentaContableDestino());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			presutransferenciaSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPresuProyecto")) {
			presutransferenciaSessionBean.setid_presu_proyecto(this.getid_presu_proyectoFK_IdPresuProyecto());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PresuTransferenciaSessionBean presutransferenciaSessionBean=new PresuTransferenciaSessionBean();
		
		if(this.presutransferenciaSessionBean==null) {
			this.presutransferenciaSessionBean=new PresuTransferenciaSessionBean();
		}
		
		if(this.presutransferenciaSessionBean.getsUltimaBusquedaPresuTransferencia()!=null&&!this.presutransferenciaSessionBean.getsUltimaBusquedaPresuTransferencia().equals("")) {
			this.setsAccionBusqueda(presutransferenciaSessionBean.getsUltimaBusquedaPresuTransferencia());
			this.setiNumeroPaginacion(presutransferenciaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(presutransferenciaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(presutransferenciaSessionBean.getid_cuenta_contable());
				presutransferenciaSessionBean.setid_cuenta_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableDestino")) {
				this.setid_cuenta_contable_destinoFK_IdCuentaContableDestino(presutransferenciaSessionBean.getid_cuenta_contable_destino());
				presutransferenciaSessionBean.setid_cuenta_contable_destino(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(presutransferenciaSessionBean.getid_empleado());
				presutransferenciaSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPresuProyecto")) {
				this.setid_presu_proyectoFK_IdPresuProyecto(presutransferenciaSessionBean.getid_presu_proyecto());
				presutransferenciaSessionBean.setid_presu_proyecto(-1L);
			}
		}
		
		this.presutransferenciaSessionBean.setsUltimaBusquedaPresuTransferencia("");
		this.presutransferenciaSessionBean.setiNumeroPaginacion(PresuTransferenciaConstantesFunciones.INUMEROPAGINACION);
		this.presutransferenciaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPresuTransferencia(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPresuTransferencia() {
		this.updateBorderResaltarBusquedasFormularioPresuTransferencia();
		this.updateVisibilidadBusquedasFormularioPresuTransferencia();
		this.updateHabilitarBusquedasFormularioPresuTransferencia();
	}
	
	public void updateBorderResaltarBusquedasFormularioPresuTransferencia() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPresuTransferencia.getComponents().length>0) {
	

		if(this.presutransferenciaConstantesFunciones.resaltarFK_IdCuentaContablePresuTransferencia!=null) {
			index= this.jTabbedPaneBusquedasPresuTransferencia.indexOfComponent(this.jPanelFK_IdCuentaContablePresuTransferencia);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTransferencia.getComponent(index);
				jPanel.setBorder(this.presutransferenciaConstantesFunciones.resaltarFK_IdCuentaContablePresuTransferencia);
			}
		}

		if(this.presutransferenciaConstantesFunciones.resaltarFK_IdCuentaContableDestinoPresuTransferencia!=null) {
			index= this.jTabbedPaneBusquedasPresuTransferencia.indexOfComponent(this.jPanelFK_IdCuentaContableDestinoPresuTransferencia);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTransferencia.getComponent(index);
				jPanel.setBorder(this.presutransferenciaConstantesFunciones.resaltarFK_IdCuentaContableDestinoPresuTransferencia);
			}
		}

		if(this.presutransferenciaConstantesFunciones.resaltarFK_IdEmpleadoPresuTransferencia!=null) {
			index= this.jTabbedPaneBusquedasPresuTransferencia.indexOfComponent(this.jPanelFK_IdEmpleadoPresuTransferencia);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTransferencia.getComponent(index);
				jPanel.setBorder(this.presutransferenciaConstantesFunciones.resaltarFK_IdEmpleadoPresuTransferencia);
			}
		}

		if(this.presutransferenciaConstantesFunciones.resaltarFK_IdPresuProyectoPresuTransferencia!=null) {
			index= this.jTabbedPaneBusquedasPresuTransferencia.indexOfComponent(this.jPanelFK_IdPresuProyectoPresuTransferencia);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTransferencia.getComponent(index);
				jPanel.setBorder(this.presutransferenciaConstantesFunciones.resaltarFK_IdPresuProyectoPresuTransferencia);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPresuTransferencia() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPresuTransferencia.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresuTransferencia.indexOfComponent(this.jPanelFK_IdCuentaContablePresuTransferencia);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTransferencia.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presutransferenciaConstantesFunciones.mostrarFK_IdCuentaContablePresuTransferencia);
			if(!this.presutransferenciaConstantesFunciones.mostrarFK_IdCuentaContablePresuTransferencia && index>-1) {
				this.jTabbedPaneBusquedasPresuTransferencia.remove(index);
			}

			index= this.jTabbedPaneBusquedasPresuTransferencia.indexOfComponent(this.jPanelFK_IdCuentaContableDestinoPresuTransferencia);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTransferencia.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presutransferenciaConstantesFunciones.mostrarFK_IdCuentaContableDestinoPresuTransferencia);
			if(!this.presutransferenciaConstantesFunciones.mostrarFK_IdCuentaContableDestinoPresuTransferencia && index>-1) {
				this.jTabbedPaneBusquedasPresuTransferencia.remove(index);
			}

			index= this.jTabbedPaneBusquedasPresuTransferencia.indexOfComponent(this.jPanelFK_IdEmpleadoPresuTransferencia);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTransferencia.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presutransferenciaConstantesFunciones.mostrarFK_IdEmpleadoPresuTransferencia);
			if(!this.presutransferenciaConstantesFunciones.mostrarFK_IdEmpleadoPresuTransferencia && index>-1) {
				this.jTabbedPaneBusquedasPresuTransferencia.remove(index);
			}

			index= this.jTabbedPaneBusquedasPresuTransferencia.indexOfComponent(this.jPanelFK_IdPresuProyectoPresuTransferencia);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTransferencia.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presutransferenciaConstantesFunciones.mostrarFK_IdPresuProyectoPresuTransferencia);
			if(!this.presutransferenciaConstantesFunciones.mostrarFK_IdPresuProyectoPresuTransferencia && index>-1) {
				this.jTabbedPaneBusquedasPresuTransferencia.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPresuTransferencia() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPresuTransferencia.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresuTransferencia.indexOfComponent(this.jPanelFK_IdCuentaContablePresuTransferencia);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTransferencia.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presutransferenciaConstantesFunciones.activarFK_IdCuentaContablePresuTransferencia);
				this.jTabbedPaneBusquedasPresuTransferencia.setEnabledAt(index,this.presutransferenciaConstantesFunciones.activarFK_IdCuentaContablePresuTransferencia);
			}

			index= this.jTabbedPaneBusquedasPresuTransferencia.indexOfComponent(this.jPanelFK_IdCuentaContableDestinoPresuTransferencia);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTransferencia.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presutransferenciaConstantesFunciones.activarFK_IdCuentaContableDestinoPresuTransferencia);
				this.jTabbedPaneBusquedasPresuTransferencia.setEnabledAt(index,this.presutransferenciaConstantesFunciones.activarFK_IdCuentaContableDestinoPresuTransferencia);
			}

			index= this.jTabbedPaneBusquedasPresuTransferencia.indexOfComponent(this.jPanelFK_IdEmpleadoPresuTransferencia);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTransferencia.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presutransferenciaConstantesFunciones.activarFK_IdEmpleadoPresuTransferencia);
				this.jTabbedPaneBusquedasPresuTransferencia.setEnabledAt(index,this.presutransferenciaConstantesFunciones.activarFK_IdEmpleadoPresuTransferencia);
			}

			index= this.jTabbedPaneBusquedasPresuTransferencia.indexOfComponent(this.jPanelFK_IdPresuProyectoPresuTransferencia);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTransferencia.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presutransferenciaConstantesFunciones.activarFK_IdPresuProyectoPresuTransferencia);
				this.jTabbedPaneBusquedasPresuTransferencia.setEnabledAt(index,this.presutransferenciaConstantesFunciones.activarFK_IdPresuProyectoPresuTransferencia);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPresuTransferencia(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasPresuTransferencia.indexOfComponent(this.jPanelFK_IdCuentaContablePresuTransferencia);

			this.jTabbedPaneBusquedasPresuTransferencia.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTransferencia.getComponent(index);

			this.presutransferenciaConstantesFunciones.setResaltarFK_IdCuentaContablePresuTransferencia(resaltar);

			jPanel.setBorder(this.presutransferenciaConstantesFunciones.resaltarFK_IdCuentaContablePresuTransferencia);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContableDestino")) {
			index= this.jTabbedPaneBusquedasPresuTransferencia.indexOfComponent(this.jPanelFK_IdCuentaContableDestinoPresuTransferencia);

			this.jTabbedPaneBusquedasPresuTransferencia.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTransferencia.getComponent(index);

			this.presutransferenciaConstantesFunciones.setResaltarFK_IdCuentaContableDestinoPresuTransferencia(resaltar);

			jPanel.setBorder(this.presutransferenciaConstantesFunciones.resaltarFK_IdCuentaContableDestinoPresuTransferencia);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasPresuTransferencia.indexOfComponent(this.jPanelFK_IdEmpleadoPresuTransferencia);

			this.jTabbedPaneBusquedasPresuTransferencia.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTransferencia.getComponent(index);

			this.presutransferenciaConstantesFunciones.setResaltarFK_IdEmpleadoPresuTransferencia(resaltar);

			jPanel.setBorder(this.presutransferenciaConstantesFunciones.resaltarFK_IdEmpleadoPresuTransferencia);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPresuProyecto")) {
			index= this.jTabbedPaneBusquedasPresuTransferencia.indexOfComponent(this.jPanelFK_IdPresuProyectoPresuTransferencia);

			this.jTabbedPaneBusquedasPresuTransferencia.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTransferencia.getComponent(index);

			this.presutransferenciaConstantesFunciones.setResaltarFK_IdPresuProyectoPresuTransferencia(resaltar);

			jPanel.setBorder(this.presutransferenciaConstantesFunciones.resaltarFK_IdPresuProyectoPresuTransferencia);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPresuTransferencia.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPresuTransferencia() throws Exception {

		if(this.jInternalFrameDetalleFormPresuTransferencia==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPresuTransferencia();
		this.updateVisibilidadResaltarControlesFormularioPresuTransferencia();
		this.updateHabilitarResaltarControlesFormularioPresuTransferencia();
		
	}
	
	public void updateBorderResaltarControlesFormularioPresuTransferencia() throws Exception {
		if(this.jInternalFrameDetalleFormPresuTransferencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.presutransferenciaConstantesFunciones.resaltaridPresuTransferencia!=null && this.jInternalFrameDetalleFormPresuTransferencia!=null) {this.jInternalFrameDetalleFormPresuTransferencia.jLabelidPresuTransferencia.setBorder(this.presutransferenciaConstantesFunciones.resaltaridPresuTransferencia);}
		if(this.presutransferenciaConstantesFunciones.resaltarid_presu_proyectoPresuTransferencia!=null && this.jInternalFrameDetalleFormPresuTransferencia!=null) {this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_presu_proyectoPresuTransferencia.setBorder(this.presutransferenciaConstantesFunciones.resaltarid_presu_proyectoPresuTransferencia);}
		if(this.presutransferenciaConstantesFunciones.resaltarid_cuenta_contablePresuTransferencia!=null && this.jInternalFrameDetalleFormPresuTransferencia!=null) {this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contablePresuTransferencia.setBorder(this.presutransferenciaConstantesFunciones.resaltarid_cuenta_contablePresuTransferencia);}
		if(this.presutransferenciaConstantesFunciones.resaltarid_cuenta_contable_destinoPresuTransferencia!=null && this.jInternalFrameDetalleFormPresuTransferencia!=null) {this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contable_destinoPresuTransferencia.setBorder(this.presutransferenciaConstantesFunciones.resaltarid_cuenta_contable_destinoPresuTransferencia);}
		if(this.presutransferenciaConstantesFunciones.resaltarid_empleadoPresuTransferencia!=null && this.jInternalFrameDetalleFormPresuTransferencia!=null) {this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_empleadoPresuTransferencia.setBorder(this.presutransferenciaConstantesFunciones.resaltarid_empleadoPresuTransferencia);}
		if(this.presutransferenciaConstantesFunciones.resaltarfechaPresuTransferencia!=null && this.jInternalFrameDetalleFormPresuTransferencia!=null) {this.jInternalFrameDetalleFormPresuTransferencia.jDateChooserfechaPresuTransferencia.setBorder(this.presutransferenciaConstantesFunciones.resaltarfechaPresuTransferencia);}
		if(this.presutransferenciaConstantesFunciones.resaltarvalorPresuTransferencia!=null && this.jInternalFrameDetalleFormPresuTransferencia!=null) {this.jInternalFrameDetalleFormPresuTransferencia.jTextFieldvalorPresuTransferencia.setBorder(this.presutransferenciaConstantesFunciones.resaltarvalorPresuTransferencia);}
		if(this.presutransferenciaConstantesFunciones.resaltardescripcionPresuTransferencia!=null && this.jInternalFrameDetalleFormPresuTransferencia!=null) {this.jInternalFrameDetalleFormPresuTransferencia.jTextAreadescripcionPresuTransferencia.setBorder(this.presutransferenciaConstantesFunciones.resaltardescripcionPresuTransferencia);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPresuTransferencia() throws Exception {		
		if(this.jInternalFrameDetalleFormPresuTransferencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
	
		//this.jInternalFrameDetalleFormPresuTransferencia.jLabelidPresuTransferencia.setVisible(this.presutransferenciaConstantesFunciones.mostraridPresuTransferencia);
		this.jInternalFrameDetalleFormPresuTransferencia.jPanelidPresuTransferencia.setVisible(this.presutransferenciaConstantesFunciones.mostraridPresuTransferencia);
		//this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_presu_proyectoPresuTransferencia.setVisible(this.presutransferenciaConstantesFunciones.mostrarid_presu_proyectoPresuTransferencia);
		this.jInternalFrameDetalleFormPresuTransferencia.jPanelid_presu_proyectoPresuTransferencia.setVisible(this.presutransferenciaConstantesFunciones.mostrarid_presu_proyectoPresuTransferencia);
		//this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contablePresuTransferencia.setVisible(this.presutransferenciaConstantesFunciones.mostrarid_cuenta_contablePresuTransferencia);
		this.jInternalFrameDetalleFormPresuTransferencia.jPanelid_cuenta_contablePresuTransferencia.setVisible(this.presutransferenciaConstantesFunciones.mostrarid_cuenta_contablePresuTransferencia);
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contablePresuTransferencia.setVisible(this.presutransferenciaConstantesFunciones.mostrarid_cuenta_contablePresuTransferencia);
		//this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contable_destinoPresuTransferencia.setVisible(this.presutransferenciaConstantesFunciones.mostrarid_cuenta_contable_destinoPresuTransferencia);
		this.jInternalFrameDetalleFormPresuTransferencia.jPanelid_cuenta_contable_destinoPresuTransferencia.setVisible(this.presutransferenciaConstantesFunciones.mostrarid_cuenta_contable_destinoPresuTransferencia);
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contable_destinoPresuTransferencia.setVisible(this.presutransferenciaConstantesFunciones.mostrarid_cuenta_contable_destinoPresuTransferencia);
		//this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_empleadoPresuTransferencia.setVisible(this.presutransferenciaConstantesFunciones.mostrarid_empleadoPresuTransferencia);
		this.jInternalFrameDetalleFormPresuTransferencia.jPanelid_empleadoPresuTransferencia.setVisible(this.presutransferenciaConstantesFunciones.mostrarid_empleadoPresuTransferencia);
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_empleadoPresuTransferencia.setVisible(this.presutransferenciaConstantesFunciones.mostrarid_empleadoPresuTransferencia);
		//this.jInternalFrameDetalleFormPresuTransferencia.jDateChooserfechaPresuTransferencia.setVisible(this.presutransferenciaConstantesFunciones.mostrarfechaPresuTransferencia);
		this.jInternalFrameDetalleFormPresuTransferencia.jPanelfechaPresuTransferencia.setVisible(this.presutransferenciaConstantesFunciones.mostrarfechaPresuTransferencia);
		//this.jInternalFrameDetalleFormPresuTransferencia.jTextFieldvalorPresuTransferencia.setVisible(this.presutransferenciaConstantesFunciones.mostrarvalorPresuTransferencia);
		this.jInternalFrameDetalleFormPresuTransferencia.jPanelvalorPresuTransferencia.setVisible(this.presutransferenciaConstantesFunciones.mostrarvalorPresuTransferencia);
		//this.jInternalFrameDetalleFormPresuTransferencia.jTextAreadescripcionPresuTransferencia.setVisible(this.presutransferenciaConstantesFunciones.mostrardescripcionPresuTransferencia);
		this.jInternalFrameDetalleFormPresuTransferencia.jPaneldescripcionPresuTransferencia.setVisible(this.presutransferenciaConstantesFunciones.mostrardescripcionPresuTransferencia);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPresuTransferencia() throws Exception {
		if(this.jInternalFrameDetalleFormPresuTransferencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresuTransferencia!=null) {
	
		this.jInternalFrameDetalleFormPresuTransferencia.jLabelidPresuTransferencia.setEnabled(this.presutransferenciaConstantesFunciones.activaridPresuTransferencia);
		this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_presu_proyectoPresuTransferencia.setEnabled(this.presutransferenciaConstantesFunciones.activarid_presu_proyectoPresuTransferencia);
		this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contablePresuTransferencia.setEnabled(this.presutransferenciaConstantesFunciones.activarid_cuenta_contablePresuTransferencia);
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contablePresuTransferencia.setEnabled(this.presutransferenciaConstantesFunciones.activarid_cuenta_contablePresuTransferencia);
		this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_cuenta_contable_destinoPresuTransferencia.setEnabled(this.presutransferenciaConstantesFunciones.activarid_cuenta_contable_destinoPresuTransferencia);
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_cuenta_contable_destinoPresuTransferencia.setEnabled(this.presutransferenciaConstantesFunciones.activarid_cuenta_contable_destinoPresuTransferencia);
		this.jInternalFrameDetalleFormPresuTransferencia.jComboBoxid_empleadoPresuTransferencia.setEnabled(this.presutransferenciaConstantesFunciones.activarid_empleadoPresuTransferencia);
			this.jInternalFrameDetalleFormPresuTransferencia.jButtonid_empleadoPresuTransferencia.setEnabled(this.presutransferenciaConstantesFunciones.activarid_empleadoPresuTransferencia);
		this.jInternalFrameDetalleFormPresuTransferencia.jDateChooserfechaPresuTransferencia.setEnabled(this.presutransferenciaConstantesFunciones.activarfechaPresuTransferencia);
		this.jInternalFrameDetalleFormPresuTransferencia.jTextFieldvalorPresuTransferencia.setEnabled(this.presutransferenciaConstantesFunciones.activarvalorPresuTransferencia);
		this.jInternalFrameDetalleFormPresuTransferencia.jTextAreadescripcionPresuTransferencia.setEnabled(this.presutransferenciaConstantesFunciones.activardescripcionPresuTransferencia);
		}
	}
	
		
}