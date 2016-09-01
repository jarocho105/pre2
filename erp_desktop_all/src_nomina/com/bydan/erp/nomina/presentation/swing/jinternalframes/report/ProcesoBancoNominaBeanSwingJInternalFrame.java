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

//import com.bydan.erp.nomina.util.ProcesoBancoNominaConstantesFunciones;
import com.bydan.erp.nomina.util.report.ProcesoBancoNominaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.report.ProcesoBancoNominaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.report.ProcesoBancoNominaBean;
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

import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProcesoBancoNominaBeanSwingJInternalFrame extends ProcesoBancoNominaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoBancoNominaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoBancoNomina> procesobanconominaValidator = new ClassValidator<ProcesoBancoNomina>(ProcesoBancoNomina.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoBancoNomina procesobanconomina;	
	public ProcesoBancoNomina procesobanconominaAux;
	public ProcesoBancoNomina procesobanconominaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoBancoNomina procesobanconominaTotales;
	public Long idProcesoBancoNominaActual;
	public Long iIdNuevoProcesoBancoNomina=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboBanco="";

	public List<Banco> bancosForeignKey;

	public List<Banco> getbancosForeignKey() {
		return bancosForeignKey;
	}

	public void setbancosForeignKey(List<Banco> bancosForeignKey) {
		this.bancosForeignKey = bancosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Banco bancoForeignKey;

	public Banco getbancoForeignKey() {
		return bancoForeignKey;
	}

	public void setbancoForeignKey(Banco bancoForeignKey) {
		this.bancoForeignKey = bancoForeignKey;
	}

	public String sFinalQueryComboCuentaBanco="";

	public List<CuentaBanco> cuentabancosForeignKey;

	public List<CuentaBanco> getcuentabancosForeignKey() {
		return cuentabancosForeignKey;
	}

	public void setcuentabancosForeignKey(List<CuentaBanco> cuentabancosForeignKey) {
		this.cuentabancosForeignKey = cuentabancosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaBanco cuentabancoForeignKey;

	public CuentaBanco getcuentabancoForeignKey() {
		return cuentabancoForeignKey;
	}

	public void setcuentabancoForeignKey(CuentaBanco cuentabancoForeignKey) {
		this.cuentabancoForeignKey = cuentabancoForeignKey;
	}

	public String sFinalQueryComboTipoContrato="";

	public List<TipoContrato> tipocontratosForeignKey;

	public List<TipoContrato> gettipocontratosForeignKey() {
		return tipocontratosForeignKey;
	}

	public void settipocontratosForeignKey(List<TipoContrato> tipocontratosForeignKey) {
		this.tipocontratosForeignKey = tipocontratosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoContrato tipocontratoForeignKey;

	public TipoContrato gettipocontratoForeignKey() {
		return tipocontratoForeignKey;
	}

	public void settipocontratoForeignKey(TipoContrato tipocontratoForeignKey) {
		this.tipocontratoForeignKey = tipocontratoForeignKey;
	}

	public String sFinalQueryComboTipoBancoDisco="";

	public List<TipoBancoDisco> tipobancodiscosForeignKey;

	public List<TipoBancoDisco> gettipobancodiscosForeignKey() {
		return tipobancodiscosForeignKey;
	}

	public void settipobancodiscosForeignKey(List<TipoBancoDisco> tipobancodiscosForeignKey) {
		this.tipobancodiscosForeignKey = tipobancodiscosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoBancoDisco tipobancodiscoForeignKey;

	public TipoBancoDisco gettipobancodiscoForeignKey() {
		return tipobancodiscoForeignKey;
	}

	public void settipobancodiscoForeignKey(TipoBancoDisco tipobancodiscoForeignKey) {
		this.tipobancodiscoForeignKey = tipobancodiscoForeignKey;
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
	
	public Boolean isPermisoTodoProcesoBancoNomina;
	public Boolean isPermisoNuevoProcesoBancoNomina;
	public Boolean isPermisoActualizarProcesoBancoNomina;
	public Boolean isPermisoActualizarOriginalProcesoBancoNomina;
	public Boolean isPermisoEliminarProcesoBancoNomina;
	public Boolean isPermisoGuardarCambiosProcesoBancoNomina;
	public Boolean isPermisoConsultaProcesoBancoNomina;
	public Boolean isPermisoBusquedaProcesoBancoNomina;
	public Boolean isPermisoReporteProcesoBancoNomina;
	public Boolean isPermisoPaginacionMedioProcesoBancoNomina;
	public Boolean isPermisoPaginacionAltoProcesoBancoNomina;
	public Boolean isPermisoPaginacionTodoProcesoBancoNomina;
	public Boolean isPermisoCopiarProcesoBancoNomina;
	public Boolean isPermisoVerFormProcesoBancoNomina;
	public Boolean isPermisoDuplicarProcesoBancoNomina;
	public Boolean isPermisoOrdenProcesoBancoNomina;
	
	
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
	
	public ProcesoBancoNominaParameterReturnGeneral procesobanconominaReturnGeneral;
	public ProcesoBancoNominaParameterReturnGeneral procesobanconominaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoBancoNomina=false;
	public Boolean esParaAccionDesdeFormularioProcesoBancoNomina=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoBancoNominaSessionBeanAdditional procesobanconominaSessionBeanAdditional=null;
	
	public ProcesoBancoNominaSessionBeanAdditional getProcesoBancoNominaSessionBeanAdditional() {
		return this.procesobanconominaSessionBeanAdditional;
	}
	
	public void setProcesoBancoNominaSessionBeanAdditional(ProcesoBancoNominaSessionBeanAdditional procesobanconominaSessionBeanAdditional) {
		try {
			this.procesobanconominaSessionBeanAdditional=procesobanconominaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoBancoNominaBeanSwingJInternalFrameAdditional procesobanconominaBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoBancoNominaBeanSwingJInternalFrame
	
	public ProcesoBancoNominaBeanSwingJInternalFrameAdditional getProcesoBancoNominaBeanSwingJInternalFrameAdditional() {
		return this.procesobanconominaBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoBancoNominaBeanSwingJInternalFrameAdditional(ProcesoBancoNominaBeanSwingJInternalFrameAdditional procesobanconominaBeanSwingJInternalFrameAdditional) {
		try {
			this.procesobanconominaBeanSwingJInternalFrameAdditional=procesobanconominaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoBancoNominaLogic procesobanconominaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoBancoNomina procesobanconominaBean;
	public ProcesoBancoNominaConstantesFunciones procesobanconominaConstantesFunciones;
	//public ProcesoBancoNominaParameterReturnGeneral procesobanconominaReturnGeneral;
	
	//FK
	
	public BancoLogic bancoLogic;
	public CuentaBancoLogic cuentabancoLogic;
	public TipoContratoLogic tipocontratoLogic;
	public TipoBancoDiscoLogic tipobancodiscoLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoBancoNomina> procesobanconominas;	
	//public List<ProcesoBancoNomina> procesobanconominasEliminados;
	//public List<ProcesoBancoNomina> procesobanconominasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoBancoNomina=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoBancoNomina=true;
	public Boolean isVisibilidadCeldaCopiarProcesoBancoNomina=true;
	public Boolean isVisibilidadCeldaVerFormProcesoBancoNomina=true;
	public Boolean isVisibilidadCeldaOrdenProcesoBancoNomina=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina=false;
	public Boolean isVisibilidadCeldaModificarProcesoBancoNomina=false;
	public Boolean isVisibilidadCeldaActualizarProcesoBancoNomina=false;
	public Boolean isVisibilidadCeldaEliminarProcesoBancoNomina=false;
	public Boolean isVisibilidadCeldaCancelarProcesoBancoNomina=false;
	public Boolean isVisibilidadCeldaGuardarProcesoBancoNomina=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoBancoNomina=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoBancoNomina=false;
	public Boolean isVisibilidadFK_IdBanco=false;
	public Boolean isVisibilidadFK_IdCuentaBanco=false;
	public Boolean isVisibilidadFK_IdTipoBancoDisco=false;
	public Boolean isVisibilidadFK_IdTipoContrato=false;
	
	public Long getiIdNuevoProcesoBancoNomina() {
		return this.iIdNuevoProcesoBancoNomina;
	}

	public void setiIdNuevoProcesoBancoNomina(Long iIdNuevoProcesoBancoNomina) {
		this.iIdNuevoProcesoBancoNomina = iIdNuevoProcesoBancoNomina;
	}
	
	public Long getidProcesoBancoNominaActual() {
		return this.idProcesoBancoNominaActual;
	}

	public void setidProcesoBancoNominaActual(Long idProcesoBancoNominaActual) {
		this.idProcesoBancoNominaActual = idProcesoBancoNominaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoBancoNomina getprocesobanconomina() {
		return this.procesobanconomina;
	}

	public void setprocesobanconomina(ProcesoBancoNomina procesobanconomina) {
		this.procesobanconomina = procesobanconomina;
	}
	
	public ProcesoBancoNomina getprocesobanconominaAux() {
		return this.procesobanconominaAux;
	}

	public void setprocesobanconominaAux(ProcesoBancoNomina procesobanconominaAux) {
		this.procesobanconominaAux = procesobanconominaAux;
	}				
	
	public ProcesoBancoNomina getprocesobanconominaAnterior() {
		return this.procesobanconominaAnterior;
	}

	public void setprocesobanconominaAnterior(ProcesoBancoNomina procesobanconominaAnterior) {
		this.procesobanconominaAnterior = procesobanconominaAnterior;
	}	
	
	public ProcesoBancoNomina getprocesobanconominaTotales() {
		return this.procesobanconominaTotales;
	}

	public void setprocesobanconominaTotales(ProcesoBancoNomina procesobanconominaTotales) {
		this.procesobanconominaTotales = procesobanconominaTotales;
	}	
	
	public ProcesoBancoNomina getprocesobanconominaBean() {
		return this.procesobanconominaBean;
	}

	public void setprocesobanconominaBean(ProcesoBancoNomina procesobanconominaBean) {
		this.procesobanconominaBean = procesobanconominaBean;
	}	
	
	public ProcesoBancoNominaParameterReturnGeneral getprocesobanconominaReturnGeneral() {
		return this.procesobanconominaReturnGeneral;
	}

	public void setprocesobanconominaReturnGeneral(ProcesoBancoNominaParameterReturnGeneral procesobanconominaReturnGeneral) {
		this.procesobanconominaReturnGeneral = procesobanconominaReturnGeneral;
	}	
	
	
	public Long id_bancoBusquedaProcesoBancoNomina=-1L;

	public Long getid_bancoBusquedaProcesoBancoNomina() {
		return this.id_bancoBusquedaProcesoBancoNomina;
	}

	public void setid_bancoBusquedaProcesoBancoNomina(Long id_bancoBusquedaProcesoBancoNomina) {
		this.id_bancoBusquedaProcesoBancoNomina = id_bancoBusquedaProcesoBancoNomina;
	}

;
	public Long id_cuenta_bancoBusquedaProcesoBancoNomina=-1L;

	public Long getid_cuenta_bancoBusquedaProcesoBancoNomina() {
		return this.id_cuenta_bancoBusquedaProcesoBancoNomina;
	}

	public void setid_cuenta_bancoBusquedaProcesoBancoNomina(Long id_cuenta_bancoBusquedaProcesoBancoNomina) {
		this.id_cuenta_bancoBusquedaProcesoBancoNomina = id_cuenta_bancoBusquedaProcesoBancoNomina;
	}

;
	public Long id_tipo_contratoBusquedaProcesoBancoNomina=-1L;

	public Long getid_tipo_contratoBusquedaProcesoBancoNomina() {
		return this.id_tipo_contratoBusquedaProcesoBancoNomina;
	}

	public void setid_tipo_contratoBusquedaProcesoBancoNomina(Long id_tipo_contratoBusquedaProcesoBancoNomina) {
		this.id_tipo_contratoBusquedaProcesoBancoNomina = id_tipo_contratoBusquedaProcesoBancoNomina;
	}

;
	public Long id_tipo_banco_discoBusquedaProcesoBancoNomina=-1L;

	public Long getid_tipo_banco_discoBusquedaProcesoBancoNomina() {
		return this.id_tipo_banco_discoBusquedaProcesoBancoNomina;
	}

	public void setid_tipo_banco_discoBusquedaProcesoBancoNomina(Long id_tipo_banco_discoBusquedaProcesoBancoNomina) {
		this.id_tipo_banco_discoBusquedaProcesoBancoNomina = id_tipo_banco_discoBusquedaProcesoBancoNomina;
	}

;
	public Boolean con_otrosBusquedaProcesoBancoNomina=false;

	public Boolean getcon_otrosBusquedaProcesoBancoNomina() {
		return this.con_otrosBusquedaProcesoBancoNomina;
	}

	public void setcon_otrosBusquedaProcesoBancoNomina(Boolean con_otrosBusquedaProcesoBancoNomina) {
		this.con_otrosBusquedaProcesoBancoNomina = con_otrosBusquedaProcesoBancoNomina;
	}

;
	public Boolean con_internetBusquedaProcesoBancoNomina=false;

	public Boolean getcon_internetBusquedaProcesoBancoNomina() {
		return this.con_internetBusquedaProcesoBancoNomina;
	}

	public void setcon_internetBusquedaProcesoBancoNomina(Boolean con_internetBusquedaProcesoBancoNomina) {
		this.con_internetBusquedaProcesoBancoNomina = con_internetBusquedaProcesoBancoNomina;
	}

;
	public Date fechaBusquedaProcesoBancoNomina=new Date();

	public Date getfechaBusquedaProcesoBancoNomina() {
		return this.fechaBusquedaProcesoBancoNomina;
	}

	public void setfechaBusquedaProcesoBancoNomina(Date fechaBusquedaProcesoBancoNomina) {
		this.fechaBusquedaProcesoBancoNomina = fechaBusquedaProcesoBancoNomina;
	}

;
	public Integer numero_secuencialesBusquedaProcesoBancoNomina=0;

	public Integer getnumero_secuencialesBusquedaProcesoBancoNomina() {
		return this.numero_secuencialesBusquedaProcesoBancoNomina;
	}

	public void setnumero_secuencialesBusquedaProcesoBancoNomina(Integer numero_secuencialesBusquedaProcesoBancoNomina) {
		this.numero_secuencialesBusquedaProcesoBancoNomina = numero_secuencialesBusquedaProcesoBancoNomina;
	}

;
	public Boolean genera_textoBusquedaProcesoBancoNomina=false;

	public Boolean getgenera_textoBusquedaProcesoBancoNomina() {
		return this.genera_textoBusquedaProcesoBancoNomina;
	}

	public void setgenera_textoBusquedaProcesoBancoNomina(Boolean genera_textoBusquedaProcesoBancoNomina) {
		this.genera_textoBusquedaProcesoBancoNomina = genera_textoBusquedaProcesoBancoNomina;
	}

;
	public Boolean genera_excelBusquedaProcesoBancoNomina=false;

	public Boolean getgenera_excelBusquedaProcesoBancoNomina() {
		return this.genera_excelBusquedaProcesoBancoNomina;
	}

	public void setgenera_excelBusquedaProcesoBancoNomina(Boolean genera_excelBusquedaProcesoBancoNomina) {
		this.genera_excelBusquedaProcesoBancoNomina = genera_excelBusquedaProcesoBancoNomina;
	}

	public Long id_bancoFK_IdBanco=-1L;

	public Long getid_bancoFK_IdBanco() {
		return this.id_bancoFK_IdBanco;
	}

	public void setid_bancoFK_IdBanco(Long id_bancoFK_IdBanco) {
		this.id_bancoFK_IdBanco = id_bancoFK_IdBanco;
	}

	public Long id_cuenta_bancoFK_IdCuentaBanco=-1L;

	public Long getid_cuenta_bancoFK_IdCuentaBanco() {
		return this.id_cuenta_bancoFK_IdCuentaBanco;
	}

	public void setid_cuenta_bancoFK_IdCuentaBanco(Long id_cuenta_bancoFK_IdCuentaBanco) {
		this.id_cuenta_bancoFK_IdCuentaBanco = id_cuenta_bancoFK_IdCuentaBanco;
	}

	public Long id_tipo_banco_discoFK_IdTipoBancoDisco=-1L;

	public Long getid_tipo_banco_discoFK_IdTipoBancoDisco() {
		return this.id_tipo_banco_discoFK_IdTipoBancoDisco;
	}

	public void setid_tipo_banco_discoFK_IdTipoBancoDisco(Long id_tipo_banco_discoFK_IdTipoBancoDisco) {
		this.id_tipo_banco_discoFK_IdTipoBancoDisco = id_tipo_banco_discoFK_IdTipoBancoDisco;
	}

	public Long id_tipo_contratoFK_IdTipoContrato=-1L;

	public Long getid_tipo_contratoFK_IdTipoContrato() {
		return this.id_tipo_contratoFK_IdTipoContrato;
	}

	public void setid_tipo_contratoFK_IdTipoContrato(Long id_tipo_contratoFK_IdTipoContrato) {
		this.id_tipo_contratoFK_IdTipoContrato = id_tipo_contratoFK_IdTipoContrato;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesoBancoNominaLogic getProcesoBancoNominaLogic()	{		
		return procesobanconominaLogic;
	}

	public void setProcesoBancoNominaLogic(ProcesoBancoNominaLogic procesobanconominaLogic) {
		this.procesobanconominaLogic = procesobanconominaLogic;
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
	
	public Boolean getIsEsNuevoProcesoBancoNomina() {
		return isEsNuevoProcesoBancoNomina;
	}

	public void setIsEsNuevoProcesoBancoNomina(Boolean isEsNuevoProcesoBancoNomina) {
		this.isEsNuevoProcesoBancoNomina = isEsNuevoProcesoBancoNomina;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoBancoNomina() {
		return esParaAccionDesdeFormularioProcesoBancoNomina;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoBancoNomina(Boolean esParaAccionDesdeFormularioProcesoBancoNomina) {
		this.esParaAccionDesdeFormularioProcesoBancoNomina = esParaAccionDesdeFormularioProcesoBancoNomina;
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
	
	
	public void cargarCombosBancosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.bancosForeignKey=new ArrayList<Banco>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			BancoLogic bancoLogic=new BancoLogic();

			bancoLogic.getBancoDataAccess().setIsForForeingKeyData(true);

			if(this.procesobanconominaSessionBean==null) {
				this.procesobanconominaSessionBean=new ProcesoBancoNominaSessionBean();
			}

			if(!this.procesobanconominaSessionBean.getisBusquedaDesdeForeignKeySesionBanco()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoLogic.getBancoDataAccess().setIsForForeingKeyData(true);

					bancoLogic.getTodosBancosWithConnection(sFinalQuery,new Pagination());

					this.bancosForeignKey=bancoLogic.getBancos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaBanco(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					bancoLogic.getEntityWithConnection(procesobanconominaSessionBean.getlidBancoActual());
					this.bancosForeignKey.add(bancoLogic.getBanco());
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

	public void cargarCombosCuentaBancosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentabancosForeignKey=new ArrayList<CuentaBanco>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaBancoLogic cuentabancoLogic=new CuentaBancoLogic();

			cuentabancoLogic.getCuentaBancoDataAccess().setIsForForeingKeyData(true);

			if(this.procesobanconominaSessionBean==null) {
				this.procesobanconominaSessionBean=new ProcesoBancoNominaSessionBean();
			}

			if(!this.procesobanconominaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaBanco()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentabancoLogic.getCuentaBancoDataAccess().setIsForForeingKeyData(true);

					cuentabancoLogic.getTodosCuentaBancosWithConnection(sFinalQuery,new Pagination());

					this.cuentabancosForeignKey=cuentabancoLogic.getCuentaBancos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaBanco(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentabancoLogic.getEntityWithConnection(procesobanconominaSessionBean.getlidCuentaBancoActual());
					this.cuentabancosForeignKey.add(cuentabancoLogic.getCuentaBanco());
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

	public void cargarCombosTipoContratosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipocontratosForeignKey=new ArrayList<TipoContrato>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoContratoLogic tipocontratoLogic=new TipoContratoLogic();

			tipocontratoLogic.getTipoContratoDataAccess().setIsForForeingKeyData(true);

			if(this.procesobanconominaSessionBean==null) {
				this.procesobanconominaSessionBean=new ProcesoBancoNominaSessionBean();
			}

			if(!this.procesobanconominaSessionBean.getisBusquedaDesdeForeignKeySesionTipoContrato()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocontratoLogic.getTipoContratoDataAccess().setIsForForeingKeyData(true);

					tipocontratoLogic.getTodosTipoContratosWithConnection(sFinalQuery,new Pagination());

					this.tipocontratosForeignKey=tipocontratoLogic.getTipoContratos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoContrato(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocontratoLogic.getEntityWithConnection(procesobanconominaSessionBean.getlidTipoContratoActual());
					this.tipocontratosForeignKey.add(tipocontratoLogic.getTipoContrato());
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

	public void cargarCombosTipoBancoDiscosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipobancodiscosForeignKey=new ArrayList<TipoBancoDisco>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoBancoDiscoLogic tipobancodiscoLogic=new TipoBancoDiscoLogic();

			tipobancodiscoLogic.getTipoBancoDiscoDataAccess().setIsForForeingKeyData(true);

			if(this.procesobanconominaSessionBean==null) {
				this.procesobanconominaSessionBean=new ProcesoBancoNominaSessionBean();
			}

			if(!this.procesobanconominaSessionBean.getisBusquedaDesdeForeignKeySesionTipoBancoDisco()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipobancodiscoLogic.getTipoBancoDiscoDataAccess().setIsForForeingKeyData(true);

					tipobancodiscoLogic.getTodosTipoBancoDiscosWithConnection(sFinalQuery,new Pagination());

					this.tipobancodiscosForeignKey=tipobancodiscoLogic.getTipoBancoDiscos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoBancoDisco(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipobancodiscoLogic.getEntityWithConnection(procesobanconominaSessionBean.getlidTipoBancoDiscoActual());
					this.tipobancodiscosForeignKey.add(tipobancodiscoLogic.getTipoBancoDisco());
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

	
	
	public void setActualBancoForeignKey(Long idBancoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Banco  bancoTemp=null;

			for(Banco bancoAux:bancosForeignKey) {
				if(bancoAux.getId()!=null && bancoAux.getId().equals(idBancoSeleccionado)) {
					bancoTemp=bancoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(bancoTemp!=null) {

					if(this.procesobanconomina!=null) {
						this.procesobanconomina.setBanco(bancoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
						this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_bancoProcesoBancoNomina.setSelectedItem(bancoTemp);
					}
				} else {
					//jComboBoxid_bancoProcesoBancoNomina.setSelectedItem(bancoTemp);
					if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
						if(this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_bancoProcesoBancoNomina.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_bancoProcesoBancoNomina.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoBancoNomina") || sFormularioTipoBusqueda.equals("Todos")){
					if(bancoTemp!=null && jComboBoxid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina!=null) {
						jComboBoxid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setSelectedItem(bancoTemp);
					} else {
						if(jComboBoxid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina!=null) {
							//jComboBoxid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setSelectedItem(bancoTemp);
							if(jComboBoxid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.getItemCount()>0) {
								jComboBoxid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setSelectedIndex(0);
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

	public String getActualBancoForeignKeyDescripcion(Long idBancoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Banco  bancoTemp=null;

			for(Banco bancoAux:bancosForeignKey) {
				if(bancoAux.getId()!=null && bancoAux.getId().equals(idBancoSeleccionado)) {
					bancoTemp=bancoAux;
					break;
				}
			}


			sDescripcion=BancoConstantesFunciones.getBancoDescripcion(bancoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualBancoForeignKeyGenerico(Long idBancoSeleccionado,JComboBox jComboBoxid_bancoProcesoBancoNominaGenerico)throws Exception
	{
		try
		{
			Banco  bancoTemp=null;

			for(Banco bancoAux:bancosForeignKey) {
				if(bancoAux.getId()!=null && bancoAux.getId().equals(idBancoSeleccionado)) {
					bancoTemp=bancoAux;
					break;
				}
			}

			if(bancoTemp!=null) {
				jComboBoxid_bancoProcesoBancoNominaGenerico.setSelectedItem(bancoTemp);
			} else {
				if(jComboBoxid_bancoProcesoBancoNominaGenerico!=null && jComboBoxid_bancoProcesoBancoNominaGenerico.getItemCount()>0) {
					jComboBoxid_bancoProcesoBancoNominaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaBancoForeignKey(Long idCuentaBancoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaBanco  cuentabancoTemp=null;

			for(CuentaBanco cuentabancoAux:cuentabancosForeignKey) {
				if(cuentabancoAux.getId()!=null && cuentabancoAux.getId().equals(idCuentaBancoSeleccionado)) {
					cuentabancoTemp=cuentabancoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentabancoTemp!=null) {

					if(this.procesobanconomina!=null) {
						this.procesobanconomina.setCuentaBanco(cuentabancoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
						this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_cuenta_bancoProcesoBancoNomina.setSelectedItem(cuentabancoTemp);
					}
				} else {
					//jComboBoxid_cuenta_bancoProcesoBancoNomina.setSelectedItem(cuentabancoTemp);
					if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
						if(this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_cuenta_bancoProcesoBancoNomina.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_cuenta_bancoProcesoBancoNomina.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoBancoNomina") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentabancoTemp!=null && jComboBoxid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina!=null) {
						jComboBoxid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setSelectedItem(cuentabancoTemp);
					} else {
						if(jComboBoxid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina!=null) {
							//jComboBoxid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setSelectedItem(cuentabancoTemp);
							if(jComboBoxid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.getItemCount()>0) {
								jComboBoxid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setSelectedIndex(0);
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

	public String getActualCuentaBancoForeignKeyDescripcion(Long idCuentaBancoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaBanco  cuentabancoTemp=null;

			for(CuentaBanco cuentabancoAux:cuentabancosForeignKey) {
				if(cuentabancoAux.getId()!=null && cuentabancoAux.getId().equals(idCuentaBancoSeleccionado)) {
					cuentabancoTemp=cuentabancoAux;
					break;
				}
			}


			sDescripcion=CuentaBancoConstantesFunciones.getCuentaBancoDescripcion(cuentabancoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaBancoForeignKeyGenerico(Long idCuentaBancoSeleccionado,JComboBox jComboBoxid_cuenta_bancoProcesoBancoNominaGenerico)throws Exception
	{
		try
		{
			CuentaBanco  cuentabancoTemp=null;

			for(CuentaBanco cuentabancoAux:cuentabancosForeignKey) {
				if(cuentabancoAux.getId()!=null && cuentabancoAux.getId().equals(idCuentaBancoSeleccionado)) {
					cuentabancoTemp=cuentabancoAux;
					break;
				}
			}

			if(cuentabancoTemp!=null) {
				jComboBoxid_cuenta_bancoProcesoBancoNominaGenerico.setSelectedItem(cuentabancoTemp);
			} else {
				if(jComboBoxid_cuenta_bancoProcesoBancoNominaGenerico!=null && jComboBoxid_cuenta_bancoProcesoBancoNominaGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_bancoProcesoBancoNominaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoContratoForeignKey(Long idTipoContratoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoContrato  tipocontratoTemp=null;

			for(TipoContrato tipocontratoAux:tipocontratosForeignKey) {
				if(tipocontratoAux.getId()!=null && tipocontratoAux.getId().equals(idTipoContratoSeleccionado)) {
					tipocontratoTemp=tipocontratoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipocontratoTemp!=null) {

					if(this.procesobanconomina!=null) {
						this.procesobanconomina.setTipoContrato(tipocontratoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
						this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_contratoProcesoBancoNomina.setSelectedItem(tipocontratoTemp);
					}
				} else {
					//jComboBoxid_tipo_contratoProcesoBancoNomina.setSelectedItem(tipocontratoTemp);
					if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
						if(this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_contratoProcesoBancoNomina.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_contratoProcesoBancoNomina.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoBancoNomina") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocontratoTemp!=null && jComboBoxid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina!=null) {
						jComboBoxid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina.setSelectedItem(tipocontratoTemp);
					} else {
						if(jComboBoxid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina!=null) {
							//jComboBoxid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina.setSelectedItem(tipocontratoTemp);
							if(jComboBoxid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina.getItemCount()>0) {
								jComboBoxid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina.setSelectedIndex(0);
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

	public String getActualTipoContratoForeignKeyDescripcion(Long idTipoContratoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoContrato  tipocontratoTemp=null;

			for(TipoContrato tipocontratoAux:tipocontratosForeignKey) {
				if(tipocontratoAux.getId()!=null && tipocontratoAux.getId().equals(idTipoContratoSeleccionado)) {
					tipocontratoTemp=tipocontratoAux;
					break;
				}
			}


			sDescripcion=TipoContratoConstantesFunciones.getTipoContratoDescripcion(tipocontratoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoContratoForeignKeyGenerico(Long idTipoContratoSeleccionado,JComboBox jComboBoxid_tipo_contratoProcesoBancoNominaGenerico)throws Exception
	{
		try
		{
			TipoContrato  tipocontratoTemp=null;

			for(TipoContrato tipocontratoAux:tipocontratosForeignKey) {
				if(tipocontratoAux.getId()!=null && tipocontratoAux.getId().equals(idTipoContratoSeleccionado)) {
					tipocontratoTemp=tipocontratoAux;
					break;
				}
			}

			if(tipocontratoTemp!=null) {
				jComboBoxid_tipo_contratoProcesoBancoNominaGenerico.setSelectedItem(tipocontratoTemp);
			} else {
				if(jComboBoxid_tipo_contratoProcesoBancoNominaGenerico!=null && jComboBoxid_tipo_contratoProcesoBancoNominaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_contratoProcesoBancoNominaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoBancoDiscoForeignKey(Long idTipoBancoDiscoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoBancoDisco  tipobancodiscoTemp=null;

			for(TipoBancoDisco tipobancodiscoAux:tipobancodiscosForeignKey) {
				if(tipobancodiscoAux.getId()!=null && tipobancodiscoAux.getId().equals(idTipoBancoDiscoSeleccionado)) {
					tipobancodiscoTemp=tipobancodiscoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipobancodiscoTemp!=null) {

					if(this.procesobanconomina!=null) {
						this.procesobanconomina.setTipoBancoDisco(tipobancodiscoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
						this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_banco_discoProcesoBancoNomina.setSelectedItem(tipobancodiscoTemp);
					}
				} else {
					//jComboBoxid_tipo_banco_discoProcesoBancoNomina.setSelectedItem(tipobancodiscoTemp);
					if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
						if(this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_banco_discoProcesoBancoNomina.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_banco_discoProcesoBancoNomina.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoBancoNomina") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipobancodiscoTemp!=null && jComboBoxid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina!=null) {
						jComboBoxid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina.setSelectedItem(tipobancodiscoTemp);
					} else {
						if(jComboBoxid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina!=null) {
							//jComboBoxid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina.setSelectedItem(tipobancodiscoTemp);
							if(jComboBoxid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina.getItemCount()>0) {
								jComboBoxid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina.setSelectedIndex(0);
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

	public String getActualTipoBancoDiscoForeignKeyDescripcion(Long idTipoBancoDiscoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoBancoDisco  tipobancodiscoTemp=null;

			for(TipoBancoDisco tipobancodiscoAux:tipobancodiscosForeignKey) {
				if(tipobancodiscoAux.getId()!=null && tipobancodiscoAux.getId().equals(idTipoBancoDiscoSeleccionado)) {
					tipobancodiscoTemp=tipobancodiscoAux;
					break;
				}
			}


			sDescripcion=TipoBancoDiscoConstantesFunciones.getTipoBancoDiscoDescripcion(tipobancodiscoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoBancoDiscoForeignKeyGenerico(Long idTipoBancoDiscoSeleccionado,JComboBox jComboBoxid_tipo_banco_discoProcesoBancoNominaGenerico)throws Exception
	{
		try
		{
			TipoBancoDisco  tipobancodiscoTemp=null;

			for(TipoBancoDisco tipobancodiscoAux:tipobancodiscosForeignKey) {
				if(tipobancodiscoAux.getId()!=null && tipobancodiscoAux.getId().equals(idTipoBancoDiscoSeleccionado)) {
					tipobancodiscoTemp=tipobancodiscoAux;
					break;
				}
			}

			if(tipobancodiscoTemp!=null) {
				jComboBoxid_tipo_banco_discoProcesoBancoNominaGenerico.setSelectedItem(tipobancodiscoTemp);
			} else {
				if(jComboBoxid_tipo_banco_discoProcesoBancoNominaGenerico!=null && jComboBoxid_tipo_banco_discoProcesoBancoNominaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_banco_discoProcesoBancoNominaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBancoForeignKey(ProcesoBancoNomina procesobanconomina,JComboBox jComboBoxid_bancoProcesoBancoNominaGenerico)throws Exception
	{
		try
		{
			Banco  bancoAux=new Banco();

			if(jComboBoxid_bancoProcesoBancoNominaGenerico==null) {
				bancoAux=(Banco)this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_bancoProcesoBancoNomina.getSelectedItem();
			} else {
				bancoAux=(Banco)jComboBoxid_bancoProcesoBancoNominaGenerico.getSelectedItem();
			}

			if(bancoAux!=null && bancoAux.getId()!=null) {
				procesobanconomina.setid_banco(bancoAux.getId());
				procesobanconomina.setbanco_descripcion(ProcesoBancoNominaConstantesFunciones.getBancoDescripcion(bancoAux));
				procesobanconomina.setBanco(bancoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaBancoForeignKey(ProcesoBancoNomina procesobanconomina,JComboBox jComboBoxid_cuenta_bancoProcesoBancoNominaGenerico)throws Exception
	{
		try
		{
			CuentaBanco  cuentabancoAux=new CuentaBanco();

			if(jComboBoxid_cuenta_bancoProcesoBancoNominaGenerico==null) {
				cuentabancoAux=(CuentaBanco)this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_cuenta_bancoProcesoBancoNomina.getSelectedItem();
			} else {
				cuentabancoAux=(CuentaBanco)jComboBoxid_cuenta_bancoProcesoBancoNominaGenerico.getSelectedItem();
			}

			if(cuentabancoAux!=null && cuentabancoAux.getId()!=null) {
				procesobanconomina.setid_cuenta_banco(cuentabancoAux.getId());
				procesobanconomina.setcuentabanco_descripcion(ProcesoBancoNominaConstantesFunciones.getCuentaBancoDescripcion(cuentabancoAux));
				procesobanconomina.setCuentaBanco(cuentabancoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoContratoForeignKey(ProcesoBancoNomina procesobanconomina,JComboBox jComboBoxid_tipo_contratoProcesoBancoNominaGenerico)throws Exception
	{
		try
		{
			TipoContrato  tipocontratoAux=new TipoContrato();

			if(jComboBoxid_tipo_contratoProcesoBancoNominaGenerico==null) {
				tipocontratoAux=(TipoContrato)this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_contratoProcesoBancoNomina.getSelectedItem();
			} else {
				tipocontratoAux=(TipoContrato)jComboBoxid_tipo_contratoProcesoBancoNominaGenerico.getSelectedItem();
			}

			if(tipocontratoAux!=null && tipocontratoAux.getId()!=null) {
				procesobanconomina.setid_tipo_contrato(tipocontratoAux.getId());
				procesobanconomina.settipocontrato_descripcion(ProcesoBancoNominaConstantesFunciones.getTipoContratoDescripcion(tipocontratoAux));
				procesobanconomina.setTipoContrato(tipocontratoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoBancoDiscoForeignKey(ProcesoBancoNomina procesobanconomina,JComboBox jComboBoxid_tipo_banco_discoProcesoBancoNominaGenerico)throws Exception
	{
		try
		{
			TipoBancoDisco  tipobancodiscoAux=new TipoBancoDisco();

			if(jComboBoxid_tipo_banco_discoProcesoBancoNominaGenerico==null) {
				tipobancodiscoAux=(TipoBancoDisco)this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_banco_discoProcesoBancoNomina.getSelectedItem();
			} else {
				tipobancodiscoAux=(TipoBancoDisco)jComboBoxid_tipo_banco_discoProcesoBancoNominaGenerico.getSelectedItem();
			}

			if(tipobancodiscoAux!=null && tipobancodiscoAux.getId()!=null) {
				procesobanconomina.setid_tipo_banco_disco(tipobancodiscoAux.getId());
				procesobanconomina.settipobancodisco_descripcion(ProcesoBancoNominaConstantesFunciones.getTipoBancoDiscoDescripcion(tipobancodiscoAux));
				procesobanconomina.setTipoBancoDisco(tipobancodiscoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBancosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBanco=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { 
							this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_bancoProcesoBancoNomina.removeAllItems();

							for(Banco banco:this.bancosForeignKey) {
								this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_bancoProcesoBancoNomina.addItem(banco);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { 
					}

					if(!ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoBancoNomina") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.removeAllItems();

							for(Banco banco:this.bancosForeignKey) {
								this.jComboBoxid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.addItem(banco);
							}
						}

						if(!ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaBancosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaBanco=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { 
							this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_cuenta_bancoProcesoBancoNomina.removeAllItems();

							for(CuentaBanco cuentabanco:this.cuentabancosForeignKey) {
								this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_cuenta_bancoProcesoBancoNomina.addItem(cuentabanco);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { 
					}

					if(!ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoBancoNomina") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.removeAllItems();

							for(CuentaBanco cuentabanco:this.cuentabancosForeignKey) {
								this.jComboBoxid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.addItem(cuentabanco);
							}
						}

						if(!ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoContratosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoContrato=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { 
							this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_contratoProcesoBancoNomina.removeAllItems();

							for(TipoContrato tipocontrato:this.tipocontratosForeignKey) {
								this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_contratoProcesoBancoNomina.addItem(tipocontrato);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { 
					}

					if(!ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoBancoNomina") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina.removeAllItems();

							for(TipoContrato tipocontrato:this.tipocontratosForeignKey) {
								this.jComboBoxid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina.addItem(tipocontrato);
							}
						}

						if(!ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoBancoDiscosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoBancoDisco=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { 
							this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_banco_discoProcesoBancoNomina.removeAllItems();

							for(TipoBancoDisco tipobancodisco:this.tipobancodiscosForeignKey) {
								this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_banco_discoProcesoBancoNomina.addItem(tipobancodisco);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { 
					}

					if(!ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoBancoNomina") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina.removeAllItems();

							for(TipoBancoDisco tipobancodisco:this.tipobancodiscosForeignKey) {
								this.jComboBoxid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina.addItem(tipobancodisco);
							}
						}

						if(!ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameBancoForeignKey(Banco banco,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
							this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_bancoProcesoBancoNomina.setSelectedItem(banco);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
							this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_bancoProcesoBancoNomina.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setSelectedItem(banco);
						} else {
							this.jComboBoxid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaBancoForeignKey(CuentaBanco cuentabanco,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
							this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_cuenta_bancoProcesoBancoNomina.setSelectedItem(cuentabanco);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
							this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_cuenta_bancoProcesoBancoNomina.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setSelectedItem(cuentabanco);
						} else {
							this.jComboBoxid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoContratoForeignKey(TipoContrato tipocontrato,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
							this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_contratoProcesoBancoNomina.setSelectedItem(tipocontrato);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
							this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_contratoProcesoBancoNomina.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina.setSelectedItem(tipocontrato);
						} else {
							this.jComboBoxid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoBancoDiscoForeignKey(TipoBancoDisco tipobancodisco,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
							this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_banco_discoProcesoBancoNomina.setSelectedItem(tipobancodisco);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
							this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_banco_discoProcesoBancoNomina.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina.setSelectedItem(tipobancodisco);
						} else {
							this.jComboBoxid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoBancoNomina() throws Exception {
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
		
	public ProcesoBancoNominaParameterReturnGeneral getProcesoBancoNominaParameterGeneral() {
		return this.procesobanconominaParameterGeneral;
	}
	
	public void setProcesoBancoNominaParameterGeneral(ProcesoBancoNominaParameterReturnGeneral procesobanconominaParameterGeneral) {
		this.procesobanconominaParameterGeneral = procesobanconominaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoBancoNomina() {
		return isPermisoTodoProcesoBancoNomina;
	}

	public void setIsPermisoTodoProcesoBancoNomina(Boolean isPermisoTodoProcesoBancoNomina) {
		this.isPermisoTodoProcesoBancoNomina = isPermisoTodoProcesoBancoNomina;
	}

	public Boolean getIsPermisoNuevoProcesoBancoNomina() {
		return isPermisoNuevoProcesoBancoNomina;
	}

	public void setIsPermisoNuevoProcesoBancoNomina(Boolean isPermisoNuevoProcesoBancoNomina) {
		this.isPermisoNuevoProcesoBancoNomina = isPermisoNuevoProcesoBancoNomina;
	}

	public Boolean getIsPermisoActualizarProcesoBancoNomina() {
		return isPermisoActualizarProcesoBancoNomina;
	}

	public void setIsPermisoActualizarProcesoBancoNomina(Boolean isPermisoActualizarProcesoBancoNomina) {
		this.isPermisoActualizarProcesoBancoNomina = isPermisoActualizarProcesoBancoNomina;
	}

	public Boolean getIsPermisoEliminarProcesoBancoNomina() {
		return isPermisoEliminarProcesoBancoNomina;
	}

	public void setIsPermisoEliminarProcesoBancoNomina(Boolean isPermisoEliminarProcesoBancoNomina) {
		this.isPermisoEliminarProcesoBancoNomina = isPermisoEliminarProcesoBancoNomina;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoBancoNomina() {
		return isPermisoGuardarCambiosProcesoBancoNomina;
	}

	public void setIsPermisoGuardarCambiosProcesoBancoNomina(Boolean isPermisoGuardarCambiosProcesoBancoNomina) {
		this.isPermisoGuardarCambiosProcesoBancoNomina = isPermisoGuardarCambiosProcesoBancoNomina;
	}
	
	public Boolean getIsPermisoConsultaProcesoBancoNomina() {
		return isPermisoConsultaProcesoBancoNomina;
	}

	public void setIsPermisoConsultaProcesoBancoNomina(Boolean isPermisoConsultaProcesoBancoNomina) {
		this.isPermisoConsultaProcesoBancoNomina = isPermisoConsultaProcesoBancoNomina;
	}

	public Boolean getIsPermisoBusquedaProcesoBancoNomina() {
		return isPermisoBusquedaProcesoBancoNomina;
	}

	public void setIsPermisoBusquedaProcesoBancoNomina(Boolean isPermisoBusquedaProcesoBancoNomina) {
		this.isPermisoBusquedaProcesoBancoNomina = isPermisoBusquedaProcesoBancoNomina;
	}

	public Boolean getIsPermisoReporteProcesoBancoNomina() {
		return isPermisoReporteProcesoBancoNomina;
	}

	public void setIsPermisoReporteProcesoBancoNomina(Boolean isPermisoReporteProcesoBancoNomina) {
		this.isPermisoReporteProcesoBancoNomina = isPermisoReporteProcesoBancoNomina;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoBancoNomina() {
		return isPermisoPaginacionMedioProcesoBancoNomina;
	}

	public void setIsPermisoPaginacionMedioProcesoBancoNomina(Boolean isPermisoPaginacionMedioProcesoBancoNomina) {
		this.isPermisoPaginacionMedioProcesoBancoNomina = isPermisoPaginacionMedioProcesoBancoNomina;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoBancoNomina() {
		return isPermisoPaginacionTodoProcesoBancoNomina;
	}

	public void setIsPermisoPaginacionTodoProcesoBancoNomina(Boolean isPermisoPaginacionTodoProcesoBancoNomina) {
		this.isPermisoPaginacionTodoProcesoBancoNomina = isPermisoPaginacionTodoProcesoBancoNomina;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoBancoNomina() {
		return isPermisoPaginacionAltoProcesoBancoNomina;
	}

	public void setIsPermisoPaginacionAltoProcesoBancoNomina(Boolean isPermisoPaginacionAltoProcesoBancoNomina) {
		this.isPermisoPaginacionAltoProcesoBancoNomina = isPermisoPaginacionAltoProcesoBancoNomina;
	}
	
	public Boolean getIsPermisoCopiarProcesoBancoNomina() {
		return isPermisoCopiarProcesoBancoNomina;
	}

	public void setIsPermisoCopiarProcesoBancoNomina(Boolean isPermisoCopiarProcesoBancoNomina) {
		this.isPermisoCopiarProcesoBancoNomina = isPermisoCopiarProcesoBancoNomina;
	}
	
	public Boolean getIsPermisoVerFormProcesoBancoNomina() {
		return isPermisoVerFormProcesoBancoNomina;
	}

	public void setIsPermisoVerFormProcesoBancoNomina(Boolean isPermisoVerFormProcesoBancoNomina) {
		this.isPermisoVerFormProcesoBancoNomina = isPermisoVerFormProcesoBancoNomina;
	}
	
	public Boolean getIsPermisoDuplicarProcesoBancoNomina() {
		return isPermisoDuplicarProcesoBancoNomina;
	}

	public void setIsPermisoDuplicarProcesoBancoNomina(Boolean isPermisoDuplicarProcesoBancoNomina) {
		this.isPermisoDuplicarProcesoBancoNomina = isPermisoDuplicarProcesoBancoNomina;
	}
	
	public Boolean getIsPermisoOrdenProcesoBancoNomina() {
		return isPermisoOrdenProcesoBancoNomina;
	}

	public void setIsPermisoOrdenProcesoBancoNomina(Boolean isPermisoOrdenProcesoBancoNomina) {
		this.isPermisoOrdenProcesoBancoNomina = isPermisoOrdenProcesoBancoNomina;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoBancoNomina() {
		return isVisibilidadCeldaNuevoProcesoBancoNomina;
	}

	public void setIsVisibilidadCeldaNuevoProcesoBancoNomina(Boolean isVisibilidadCeldaNuevoProcesoBancoNomina) {
		this.isVisibilidadCeldaNuevoProcesoBancoNomina = isVisibilidadCeldaNuevoProcesoBancoNomina;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoBancoNomina() {
		return isVisibilidadCeldaDuplicarProcesoBancoNomina;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoBancoNomina(Boolean isVisibilidadCeldaDuplicarProcesoBancoNomina) {
		this.isVisibilidadCeldaDuplicarProcesoBancoNomina = isVisibilidadCeldaDuplicarProcesoBancoNomina;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoBancoNomina() {
		return isVisibilidadCeldaCopiarProcesoBancoNomina;
	}

	public void setIsVisibilidadCeldaCopiarProcesoBancoNomina(Boolean isVisibilidadCeldaCopiarProcesoBancoNomina) {
		this.isVisibilidadCeldaCopiarProcesoBancoNomina = isVisibilidadCeldaCopiarProcesoBancoNomina;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoBancoNomina() {
		return isVisibilidadCeldaVerFormProcesoBancoNomina;
	}

	public void setIsVisibilidadCeldaVerFormProcesoBancoNomina(Boolean isVisibilidadCeldaVerFormProcesoBancoNomina) {
		this.isVisibilidadCeldaVerFormProcesoBancoNomina = isVisibilidadCeldaVerFormProcesoBancoNomina;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoBancoNomina() {
		return isVisibilidadCeldaOrdenProcesoBancoNomina;
	}

	public void setIsVisibilidadCeldaOrdenProcesoBancoNomina(Boolean isVisibilidadCeldaOrdenProcesoBancoNomina) {
		this.isVisibilidadCeldaOrdenProcesoBancoNomina = isVisibilidadCeldaOrdenProcesoBancoNomina;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoBancoNomina() {
		return isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoBancoNomina(Boolean isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina = isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoBancoNomina() {
		return isVisibilidadCeldaModificarProcesoBancoNomina;
	}

	public void setIsVisibilidadCeldaModificarProcesoBancoNomina(Boolean isVisibilidadCeldaModificarProcesoBancoNomina) {
		this.isVisibilidadCeldaModificarProcesoBancoNomina = isVisibilidadCeldaModificarProcesoBancoNomina;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoBancoNomina() {
		return isVisibilidadCeldaActualizarProcesoBancoNomina;
	}

	public void setIsVisibilidadCeldaActualizarProcesoBancoNomina(Boolean isVisibilidadCeldaActualizarProcesoBancoNomina) {
		this.isVisibilidadCeldaActualizarProcesoBancoNomina = isVisibilidadCeldaActualizarProcesoBancoNomina;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoBancoNomina() {
		return isVisibilidadCeldaEliminarProcesoBancoNomina;
	}

	public void setIsVisibilidadCeldaEliminarProcesoBancoNomina(Boolean isVisibilidadCeldaEliminarProcesoBancoNomina) {
		this.isVisibilidadCeldaEliminarProcesoBancoNomina = isVisibilidadCeldaEliminarProcesoBancoNomina;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoBancoNomina() {
		return isVisibilidadCeldaCancelarProcesoBancoNomina;
	}

	public void setIsVisibilidadCeldaCancelarProcesoBancoNomina(Boolean isVisibilidadCeldaCancelarProcesoBancoNomina) {
		this.isVisibilidadCeldaCancelarProcesoBancoNomina = isVisibilidadCeldaCancelarProcesoBancoNomina;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoBancoNomina() {
		return isVisibilidadCeldaGuardarProcesoBancoNomina;
	}

	public void setIsVisibilidadCeldaGuardarProcesoBancoNomina(Boolean isVisibilidadCeldaGuardarProcesoBancoNomina) {
		this.isVisibilidadCeldaGuardarProcesoBancoNomina = isVisibilidadCeldaGuardarProcesoBancoNomina;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoBancoNomina() {
		return isVisibilidadCeldaGuardarCambiosProcesoBancoNomina;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoBancoNomina(Boolean isVisibilidadCeldaGuardarCambiosProcesoBancoNomina) {
		this.isVisibilidadCeldaGuardarCambiosProcesoBancoNomina = isVisibilidadCeldaGuardarCambiosProcesoBancoNomina;
	}
		
	public ProcesoBancoNominaSessionBean getprocesobanconominaSessionBean() {
		return this.procesobanconominaSessionBean;
	}
	
	public void setprocesobanconominaSessionBean(ProcesoBancoNominaSessionBean procesobanconominaSessionBean) {
		this.procesobanconominaSessionBean=procesobanconominaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoBancoNomina() {
		return this.isVisibilidadBusquedaProcesoBancoNomina;
	}

	public void setisVisibilidadBusquedaProcesoBancoNomina(Boolean isVisibilidadBusquedaProcesoBancoNomina) {
		this.isVisibilidadBusquedaProcesoBancoNomina=isVisibilidadBusquedaProcesoBancoNomina;
	}

	public Boolean getisVisibilidadFK_IdBanco() {
		return this.isVisibilidadFK_IdBanco;
	}

	public void setisVisibilidadFK_IdBanco(Boolean isVisibilidadFK_IdBanco) {
		this.isVisibilidadFK_IdBanco=isVisibilidadFK_IdBanco;
	}

	public Boolean getisVisibilidadFK_IdCuentaBanco() {
		return this.isVisibilidadFK_IdCuentaBanco;
	}

	public void setisVisibilidadFK_IdCuentaBanco(Boolean isVisibilidadFK_IdCuentaBanco) {
		this.isVisibilidadFK_IdCuentaBanco=isVisibilidadFK_IdCuentaBanco;
	}

	public Boolean getisVisibilidadFK_IdTipoBancoDisco() {
		return this.isVisibilidadFK_IdTipoBancoDisco;
	}

	public void setisVisibilidadFK_IdTipoBancoDisco(Boolean isVisibilidadFK_IdTipoBancoDisco) {
		this.isVisibilidadFK_IdTipoBancoDisco=isVisibilidadFK_IdTipoBancoDisco;
	}

	public Boolean getisVisibilidadFK_IdTipoContrato() {
		return this.isVisibilidadFK_IdTipoContrato;
	}

	public void setisVisibilidadFK_IdTipoContrato(Boolean isVisibilidadFK_IdTipoContrato) {
		this.isVisibilidadFK_IdTipoContrato=isVisibilidadFK_IdTipoContrato;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(ProcesoBancoNomina procesobanconomina)throws Exception {
		try {
			
				this.setActualParaGuardarBancoForeignKey(procesobanconomina,null);
				this.setActualParaGuardarCuentaBancoForeignKey(procesobanconomina,null);
				this.setActualParaGuardarTipoContratoForeignKey(procesobanconomina,null);
				this.setActualParaGuardarTipoBancoDiscoForeignKey(procesobanconomina,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoBancoNomina procesobanconomina,ProcesoBancoNomina procesobanconominaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoBancoNomina(procesobanconomina);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesobanconominaAux.setId(procesobanconomina.getId());
		procesobanconominaAux.setVersionRow(procesobanconomina.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoBancoNomina procesobanconominaLocal) throws Exception {
		
		if(this.procesobanconominaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoBancoNomina procesobanconominaLocal) throws Exception {	
		if(this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(BancoDetalleFormJInternalFrame.class)) {
				BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrameLocal=(BancoBeanSwingJInternalFrame) ((BancoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bancoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBanco(bancoBeanSwingJInternalFrameLocal.getbanco(),true);
				bancoBeanSwingJInternalFrameLocal.actualizarLista(bancoBeanSwingJInternalFrameLocal.banco,this.bancosForeignKey);

				bancoBeanSwingJInternalFrameLocal.actualizarRelaciones(bancoBeanSwingJInternalFrameLocal.banco);

				procesobanconominaLocal.setBanco(bancoBeanSwingJInternalFrameLocal.banco);

				this.addItemDefectoCombosForeignKeyBanco();
				this.cargarCombosFrameBancosForeignKey("Formulario");
				this.setActualBancoForeignKey(bancoBeanSwingJInternalFrameLocal.banco.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaBancoDetalleFormJInternalFrame.class)) {
				CuentaBancoBeanSwingJInternalFrame cuentabancoBeanSwingJInternalFrameLocal=(CuentaBancoBeanSwingJInternalFrame) ((CuentaBancoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentabancoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaBanco(cuentabancoBeanSwingJInternalFrameLocal.getcuentabanco(),true);
				cuentabancoBeanSwingJInternalFrameLocal.actualizarLista(cuentabancoBeanSwingJInternalFrameLocal.cuentabanco,this.cuentabancosForeignKey);

				cuentabancoBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentabancoBeanSwingJInternalFrameLocal.cuentabanco);

				procesobanconominaLocal.setCuentaBanco(cuentabancoBeanSwingJInternalFrameLocal.cuentabanco);

				this.addItemDefectoCombosForeignKeyCuentaBanco();
				this.cargarCombosFrameCuentaBancosForeignKey("Formulario");
				this.setActualCuentaBancoForeignKey(cuentabancoBeanSwingJInternalFrameLocal.cuentabanco.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoContratoDetalleFormJInternalFrame.class)) {
				TipoContratoBeanSwingJInternalFrame tipocontratoBeanSwingJInternalFrameLocal=(TipoContratoBeanSwingJInternalFrame) ((TipoContratoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocontratoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoContrato(tipocontratoBeanSwingJInternalFrameLocal.gettipocontrato(),true);
				tipocontratoBeanSwingJInternalFrameLocal.actualizarLista(tipocontratoBeanSwingJInternalFrameLocal.tipocontrato,this.tipocontratosForeignKey);

				tipocontratoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocontratoBeanSwingJInternalFrameLocal.tipocontrato);

				procesobanconominaLocal.setTipoContrato(tipocontratoBeanSwingJInternalFrameLocal.tipocontrato);

				this.addItemDefectoCombosForeignKeyTipoContrato();
				this.cargarCombosFrameTipoContratosForeignKey("Formulario");
				this.setActualTipoContratoForeignKey(tipocontratoBeanSwingJInternalFrameLocal.tipocontrato.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoBancoDiscoDetalleFormJInternalFrame.class)) {
				TipoBancoDiscoBeanSwingJInternalFrame tipobancodiscoBeanSwingJInternalFrameLocal=(TipoBancoDiscoBeanSwingJInternalFrame) ((TipoBancoDiscoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipobancodiscoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoBancoDisco(tipobancodiscoBeanSwingJInternalFrameLocal.gettipobancodisco(),true);
				tipobancodiscoBeanSwingJInternalFrameLocal.actualizarLista(tipobancodiscoBeanSwingJInternalFrameLocal.tipobancodisco,this.tipobancodiscosForeignKey);

				tipobancodiscoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipobancodiscoBeanSwingJInternalFrameLocal.tipobancodisco);

				procesobanconominaLocal.setTipoBancoDisco(tipobancodiscoBeanSwingJInternalFrameLocal.tipobancodisco);

				this.addItemDefectoCombosForeignKeyTipoBancoDisco();
				this.cargarCombosFrameTipoBancoDiscosForeignKey("Formulario");
				this.setActualTipoBancoDiscoForeignKey(tipobancodiscoBeanSwingJInternalFrameLocal.tipobancodisco.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoBancoNominaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesobanconominaValidator.getInvalidValues(this.procesobanconomina);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoBancoNomina procesobanconomina,List<ProcesoBancoNomina> procesobanconominas) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoBancoNomina procesobanconomina,List<ProcesoBancoNomina> procesobanconominas) throws Exception {
		try	{			
			ProcesoBancoNominaConstantesFunciones.actualizarSelectedLista(procesobanconomina,procesobanconominas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoBancoNomina> procesobanconominasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesobanconominasLocal=this.procesobanconominaLogic.getProcesoBancoNominas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesobanconominasLocal=this.procesobanconominas;
			}
			//ARCHITECTURE
		
			for(ProcesoBancoNomina procesobanconominaLocal:procesobanconominasLocal) {
				if(this.permiteMantenimiento(procesobanconominaLocal) && procesobanconominaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoBancoNominaConstantesFunciones.getProcesoBancoNominaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoBancoNominaConstantesFunciones.IDBANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelid_bancoProcesoBancoNomina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoBancoNominaConstantesFunciones.IDCUENTABANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelid_cuenta_bancoProcesoBancoNomina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoBancoNominaConstantesFunciones.IDTIPOCONTRATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelid_tipo_contratoProcesoBancoNomina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoBancoNominaConstantesFunciones.IDTIPOBANCODISCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelid_tipo_banco_discoProcesoBancoNomina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoBancoNominaConstantesFunciones.CONOTROS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelcon_otrosProcesoBancoNomina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoBancoNominaConstantesFunciones.CONINTERNET)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelcon_internetProcesoBancoNomina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoBancoNominaConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelfechaProcesoBancoNomina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoBancoNominaConstantesFunciones.NUMEROSECUENCIALES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelnumero_secuencialesProcesoBancoNomina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoBancoNominaConstantesFunciones.GENERATEXTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelgenera_textoProcesoBancoNomina,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoBancoNominaConstantesFunciones.GENERAEXCEL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelgenera_excelProcesoBancoNomina,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelid_bancoProcesoBancoNomina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelid_cuenta_bancoProcesoBancoNomina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelid_tipo_contratoProcesoBancoNomina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelid_tipo_banco_discoProcesoBancoNomina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelcon_otrosProcesoBancoNomina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelcon_internetProcesoBancoNomina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelfechaProcesoBancoNomina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelnumero_secuencialesProcesoBancoNomina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelgenera_textoProcesoBancoNomina,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelgenera_excelProcesoBancoNomina,"");
		
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
		this.iIdNuevoProcesoBancoNomina--;	
		
		
		this.procesobanconominaAux=new ProcesoBancoNomina();
		
		this.procesobanconominaAux.setId(this.iIdNuevoProcesoBancoNomina);
		this.procesobanconominaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesobanconominaLogic.getProcesoBancoNominas().add(this.procesobanconominaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesobanconominas.add(this.procesobanconominaAux);
		}
		//ARCHITECTURE
		
		this.procesobanconomina=this.procesobanconominaAux;
		
		if(ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoBancoNomina(this.procesobanconomina);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoBancoNomina(this.procesobanconomina);
		}
				
		//this.setDefaultControlesProcesoBancoNomina();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoBancoNomina();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoBancoNomina();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoBancoNomina();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoBancoNomina(this.procesobanconominaBean,this.procesobanconomina,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoBancoNomina(this.procesobanconominaReturnGeneral,this.procesobanconominaBean,false);
		
		if(this.procesobanconominaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoBancoNomina(this.procesobanconominaReturnGeneral.getProcesoBancoNomina());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoBancoNomina(this.procesobanconominaReturnGeneral.getProcesoBancoNomina());
		}
		
		if(this.procesobanconominaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoBancoNomina(this.procesobanconominaReturnGeneral.getProcesoBancoNomina(),classes);//this.procesobanconominaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.procesobanconomina,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoBancoNomina();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoBancoNomina();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoBancoNominaBeanSwingJInternalFrameAdditional.RecargarFormProcesoBancoNomina(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoBancoNomina(false);
						
			if(procesobanconominaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoBancoNomina();
			}
			
			this.actualizarVisualTableDatosProcesoBancoNomina();
			
			this.jTableDatosProcesoBancoNomina.setRowSelectionInterval(this.getIndiceNuevoProcesoBancoNomina(), this.getIndiceNuevoProcesoBancoNomina());
			
			this.seleccionarFilaTablaProcesoBancoNominaActual();
						
			this.actualizarEstadoCeldasBotonesProcesoBancoNomina("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoBancoNomina(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxcon_otrosProcesoBancoNomina.setEnabled(isHabilitar && this.procesobanconominaConstantesFunciones.activarcon_otrosProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxcon_internetProcesoBancoNomina.setEnabled(isHabilitar && this.procesobanconominaConstantesFunciones.activarcon_internetProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jDateChooserfechaProcesoBancoNomina.setEnabled(isHabilitar && this.procesobanconominaConstantesFunciones.activarfechaProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jTextFieldnumero_secuencialesProcesoBancoNomina.setEnabled(isHabilitar && this.procesobanconominaConstantesFunciones.activarnumero_secuencialesProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxgenera_textoProcesoBancoNomina.setEnabled(isHabilitar && this.procesobanconominaConstantesFunciones.activargenera_textoProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxgenera_excelProcesoBancoNomina.setEnabled(isHabilitar && this.procesobanconominaConstantesFunciones.activargenera_excelProcesoBancoNomina);	
		
		this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_bancoProcesoBancoNomina.setEnabled(isHabilitar && this.procesobanconominaConstantesFunciones.activarid_bancoProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_cuenta_bancoProcesoBancoNomina.setEnabled(isHabilitar && this.procesobanconominaConstantesFunciones.activarid_cuenta_bancoProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_contratoProcesoBancoNomina.setEnabled(isHabilitar && this.procesobanconominaConstantesFunciones.activarid_tipo_contratoProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_banco_discoProcesoBancoNomina.setEnabled(isHabilitar && this.procesobanconominaConstantesFunciones.activarid_tipo_banco_discoProcesoBancoNomina);
	};
	
	public void setDefaultControlesProcesoBancoNomina() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoBancoNomina(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesobanconominaSessionBean.setConGuardarRelaciones(true);			
			this.procesobanconominaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoBancoNomina.jTabbedPaneRelacionesProcesoBancoNomina.setVisible(true);
			
					
		} else {
			//this.procesobanconominaSessionBean.setConGuardarRelaciones(false);			
			this.procesobanconominaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoBancoNomina.jTabbedPaneRelacionesProcesoBancoNomina.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoBancoNomina() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoBancoNomina procesobanconominaAux:this.procesobanconominaLogic.getProcesoBancoNominas()) {
				if(procesobanconominaAux.getId().equals(this.iIdNuevoProcesoBancoNomina)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoBancoNomina procesobanconominaAux:this.procesobanconominas) {
				if(procesobanconominaAux.getId().equals(this.iIdNuevoProcesoBancoNomina)) {
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
	
	public int getIndiceActualProcesoBancoNomina(ProcesoBancoNomina procesobanconomina,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoBancoNomina procesobanconominaAux:this.procesobanconominaLogic.getProcesoBancoNominas()) {
				if(procesobanconominaAux.getId().equals(procesobanconomina.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoBancoNomina procesobanconominaAux:this.procesobanconominas) {
				if(procesobanconominaAux.getId().equals(procesobanconomina.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoBancoNomina(ProcesoBancoNomina procesobanconominaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoBancoNomina procesobanconominaAux:this.procesobanconominaLogic.getProcesoBancoNominas()) {
				if(procesobanconominaAux.getProcesoBancoNominaOriginal().getId().equals(procesobanconominaOriginal.getId())) {
					existe=true;
					procesobanconominaOriginal.setId(procesobanconominaAux.getId());
					procesobanconominaOriginal.setVersionRow(procesobanconominaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoBancoNomina procesobanconominaAux:this.procesobanconominas) {
				if(procesobanconominaAux.getProcesoBancoNominaOriginal().getId().equals(procesobanconominaOriginal.getId())) {
					existe=true;
					procesobanconominaOriginal.setId(procesobanconominaAux.getId());
					procesobanconominaOriginal.setVersionRow(procesobanconominaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoBancoNomina(Boolean esParaCancelar) throws Exception {
		procesobanconominasAux=new ArrayList<ProcesoBancoNomina>();
		procesobanconominaAux=new ProcesoBancoNomina();
		
		if(!this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoBancoNomina procesobanconominaAux:this.procesobanconominaLogic.getProcesoBancoNominas()) {
					if(procesobanconominaAux.getId()<0) {
						procesobanconominasAux.add(procesobanconominaAux);
					}		
				}
				this.iIdNuevoProcesoBancoNomina=0L;
				this.procesobanconominaLogic.getProcesoBancoNominas().removeAll(procesobanconominasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoBancoNomina procesobanconominaAux:this.procesobanconominas) {
					if(procesobanconominaAux.getId()<0) {
						procesobanconominasAux.add(procesobanconominaAux);
					}		
				}
				this.iIdNuevoProcesoBancoNomina=0L;
				this.procesobanconominas.removeAll(procesobanconominasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoBancoNomina 
					&& this.procesobanconominaLogic.getProcesoBancoNominas().size()>0
					) {
					procesobanconominaAux=this.procesobanconominaLogic.getProcesoBancoNominas().get(this.procesobanconominaLogic.getProcesoBancoNominas().size() - 1);
				
					if(procesobanconominaAux.getId()<0) {
						this.procesobanconominaLogic.getProcesoBancoNominas().remove(procesobanconominaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoBancoNomina && this.procesobanconominas.size()>0) {
					procesobanconominaAux=this.procesobanconominas.get(this.procesobanconominas.size() - 1);
				
					if(procesobanconominaAux.getId()<0) {
						this.procesobanconominas.remove(procesobanconominaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoBancoNomina(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesobanconomina.getId()<0) {
				this.procesobanconominaLogic.getProcesoBancoNominas().remove(this.procesobanconomina);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesobanconomina.getId()<0) {
				this.procesobanconominas.remove(this.procesobanconomina);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoBancoNomina(List<ProcesoBancoNomina> procesobanconominasAux) throws Exception {
		ProcesoBancoNominaConstantesFunciones.setEstadosInicialesProcesoBancoNomina(procesobanconominasAux);
	}
	
	public void setEstadosInicialesProcesoBancoNomina(ProcesoBancoNomina procesobanconominaAux) throws Exception {
		ProcesoBancoNominaConstantesFunciones.setEstadosInicialesProcesoBancoNomina(procesobanconominaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoBancoNominaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoBancoNomina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoBancoNominaActual()) {
				if(!this.isEsNuevoProcesoBancoNomina) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoBancoNomina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoBancoNomina=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoBancoNominaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Banco Nomina ?", "MANTENIMIENTO DE Proceso Banco Nomina", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoBancoNomina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoBancoNomina procesobanconomina) throws Exception {
		ProcesoBancoNominaConstantesFunciones.seleccionarAsignar(this.procesobanconomina,procesobanconomina);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoBancoNomina=this.isPermisoActualizarOriginalProcesoBancoNomina;
			
			
			this.seleccionarAsignar(procesobanconomina);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoBancoNomina("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesobanconominaSessionBean.setsFuncionBusquedaRapida(this.procesobanconominaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoBancoNomina) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoBancoNomina(esParaCancelar);				
				this.cancelarNuevoProcesoBancoNomina(esParaCancelar);								
			}
			
			this.procesobanconomina=new ProcesoBancoNomina();
			
			this.inicializarProcesoBancoNomina();
			
			this.actualizarEstadoCeldasBotonesProcesoBancoNomina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoBancoNomina() throws Exception {
		try {
			ProcesoBancoNominaConstantesFunciones.inicializarProcesoBancoNomina(this.procesobanconomina);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesobanconominaLogic.getProcesoBancoNominas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoBancoNominas(String sAccionBusqueda,List<ProcesoBancoNomina> procesobanconominasParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoBancoNomina"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoBancoNominaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoBancoNominaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoBancoNomina"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Banco Nominas");		
		parameters.put("busquedapor", ProcesoBancoNominaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoBancoNomina=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
		} else {
		}
		
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoBancoNomina);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoBancoNominaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoBancoNominaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoBancoNominaBean.TraerProcesoBancoNominaBeans(procesobanconominasParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoBancoNominas(sAccionBusqueda,sTipoArchivoReporte,procesobanconominasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoBancoNominas(sAccionBusqueda,sTipoArchivoReporte,procesobanconominasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoBancoNominaActionPerformed(null);
					//this.generarExcelReporteProcesoBancoNominas(sAccionBusqueda,sTipoArchivoReporte,procesobanconominasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoBancoNominas(sAccionBusqueda,sTipoArchivoReporte,procesobanconominasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoBancoNominas(sAccionBusqueda,sTipoArchivoReporte,procesobanconominasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoBancoNominas(sAccionBusqueda,sTipoArchivoReporte,procesobanconominasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoBancoNominas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoBancoNomina> procesobanconominasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesobanconomina";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoBancoNominas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoBancoNomina("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoBancoNomina procesobanconomina : procesobanconominasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoBancoNominaConstantesFunciones.generarExcelReporteDataProcesoBancoNomina("NORMAL",row,workbook,procesobanconomina,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Banco Nomina",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoBancoNomina(String sTipo,Row row,Workbook workbook) {
		
		ProcesoBancoNominaConstantesFunciones.generarExcelReporteHeaderProcesoBancoNomina(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoBancoNominas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoBancoNomina> procesobanconominasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesobanconomina_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoBancoNominas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoBancoNomina procesobanconomina : procesobanconominasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoBancoNominaConstantesFunciones.getProcesoBancoNominaDescripcion(procesobanconomina));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoBancoNominaConstantesFunciones.LABEL_IDBANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_IDBANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesobanconomina.getbanco_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoBancoNominaConstantesFunciones.LABEL_IDCUENTABANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_IDCUENTABANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesobanconomina.getcuentabanco_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOCONTRATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOCONTRATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesobanconomina.gettipocontrato_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOBANCODISCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOBANCODISCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesobanconomina.gettipobancodisco_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoBancoNominaConstantesFunciones.LABEL_CONOTROS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_CONOTROS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(procesobanconomina.getcon_otros()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoBancoNominaConstantesFunciones.LABEL_CONINTERNET))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_CONINTERNET);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(procesobanconomina.getcon_internet()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoBancoNominaConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesobanconomina.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoBancoNominaConstantesFunciones.LABEL_NUMEROSECUENCIALES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_NUMEROSECUENCIALES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesobanconomina.getnumero_secuenciales());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoBancoNominaConstantesFunciones.LABEL_GENERATEXTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_GENERATEXTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(procesobanconomina.getgenera_texto()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoBancoNominaConstantesFunciones.LABEL_GENERAEXCEL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_GENERAEXCEL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(procesobanconomina.getgenera_excel()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Banco Nomina",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoBancoNominas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoBancoNomina> procesobanconominasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoBancoNomina> procesobanconominasRespaldo=null;
		
		classes=ProcesoBancoNominaConstantesFunciones.getClassesRelationshipsOfProcesoBancoNomina(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesobanconominaLogic.setDatosCliente(this.datosCliente);
		this.procesobanconominaLogic.setDatosDeep(this.datosDeep);
		this.procesobanconominaLogic.setIsConDeep(true);
		
		procesobanconominasRespaldo=this.procesobanconominaLogic.getProcesoBancoNominas();
		
		this.procesobanconominaLogic.setProcesoBancoNominas(procesobanconominasParaReportes);	
		this.procesobanconominaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesobanconominasParaReportes=this.procesobanconominaLogic.getProcesoBancoNominas();
		this.procesobanconominaLogic.setProcesoBancoNominas(procesobanconominasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesobanconomina_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoBancoNominas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoBancoNomina("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoBancoNomina procesobanconomina : procesobanconominasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoBancoNomina("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoBancoNominaConstantesFunciones.generarExcelReporteDataProcesoBancoNomina("NORMAL",row,workbook,procesobanconomina,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoBancoNominaConstantesFunciones.getProcesoBancoNominaDescripcion(procesobanconomina));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Banco Nomina",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoBancoNomina() throws Exception {		
		this.startProcessProcesoBancoNomina(true);
	}
	
	public void startProcessProcesoBancoNomina(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoBancoNomina ,this.jPanelParametrosReportesProcesoBancoNomina, this.jScrollPanelDatosProcesoBancoNomina,this.jPanelPaginacionProcesoBancoNomina, this.jScrollPanelDatosEdicionProcesoBancoNomina, this.jPanelAccionesProcesoBancoNomina,this.jPanelAccionesFormularioProcesoBancoNomina,this.jmenuBarProcesoBancoNomina,this.jmenuBarDetalleProcesoBancoNomina,this.jTtoolBarProcesoBancoNomina,this.jTtoolBarDetalleProcesoBancoNomina);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoBancoNomina=this.jTabbedPaneBusquedasProcesoBancoNomina; 
		
		final JPanel jPanelParametrosReportesProcesoBancoNomina=this.jPanelParametrosReportesProcesoBancoNomina;
		//final JScrollPane jScrollPanelDatosProcesoBancoNomina=this.jScrollPanelDatosProcesoBancoNomina;
		final JTable jTableDatosProcesoBancoNomina=this.jTableDatosProcesoBancoNomina;		
		final JPanel jPanelPaginacionProcesoBancoNomina=this.jPanelPaginacionProcesoBancoNomina;
		//final JScrollPane jScrollPanelDatosEdicionProcesoBancoNomina=this.jScrollPanelDatosEdicionProcesoBancoNomina;
		final JPanel jPanelAccionesProcesoBancoNomina=this.jPanelAccionesProcesoBancoNomina;
		
		JPanel jPanelCamposAuxiliarProcesoBancoNomina=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoBancoNomina=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
			jPanelCamposAuxiliarProcesoBancoNomina=this.jInternalFrameDetalleFormProcesoBancoNomina.jPanelCamposProcesoBancoNomina;
			jPanelAccionesFormularioAuxiliarProcesoBancoNomina=this.jInternalFrameDetalleFormProcesoBancoNomina.jPanelAccionesFormularioProcesoBancoNomina;
		}
		
		final JPanel jPanelCamposProcesoBancoNomina=jPanelCamposAuxiliarProcesoBancoNomina;
		final JPanel jPanelAccionesFormularioProcesoBancoNomina=jPanelAccionesFormularioAuxiliarProcesoBancoNomina;
		
		
		final JMenuBar jmenuBarProcesoBancoNomina=this.jmenuBarProcesoBancoNomina;
		final JToolBar jTtoolBarProcesoBancoNomina=this.jTtoolBarProcesoBancoNomina;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoBancoNomina=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoBancoNomina=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
			jmenuBarDetalleAuxiliarProcesoBancoNomina=this.jInternalFrameDetalleFormProcesoBancoNomina.jmenuBarDetalleProcesoBancoNomina;
			jTtoolBarDetalleAuxiliarProcesoBancoNomina=this.jInternalFrameDetalleFormProcesoBancoNomina.jTtoolBarDetalleProcesoBancoNomina;
		}
		
		final JMenuBar jmenuBarDetalleProcesoBancoNomina=jmenuBarDetalleAuxiliarProcesoBancoNomina;
		final JToolBar jTtoolBarDetalleProcesoBancoNomina=jTtoolBarDetalleAuxiliarProcesoBancoNomina;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoBancoNomina;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoBancoNomina;
			processRunnable.jTableDatos=jTableDatosProcesoBancoNomina;
			processRunnable.jPanelCampos=jPanelCamposProcesoBancoNomina;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoBancoNomina;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoBancoNomina;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoBancoNomina;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoBancoNomina;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoBancoNomina;
			processRunnable.jTtoolBar=jTtoolBarProcesoBancoNomina;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoBancoNomina;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoBancoNomina ,jPanelParametrosReportesProcesoBancoNomina,jTableDatosProcesoBancoNomina, /*jScrollPanelDatosProcesoBancoNomina,*/jPanelCamposProcesoBancoNomina,jPanelPaginacionProcesoBancoNomina, /*jScrollPanelDatosEdicionProcesoBancoNomina,*/ jPanelAccionesProcesoBancoNomina,jPanelAccionesFormularioProcesoBancoNomina,jmenuBarProcesoBancoNomina,jmenuBarDetalleProcesoBancoNomina,jTtoolBarProcesoBancoNomina,jTtoolBarDetalleProcesoBancoNomina);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoBancoNomina ,jPanelParametrosReportesProcesoBancoNomina, jScrollPanelDatosProcesoBancoNomina,jPanelPaginacionProcesoBancoNomina, jScrollPanelDatosEdicionProcesoBancoNomina, jPanelAccionesProcesoBancoNomina,jPanelAccionesFormularioProcesoBancoNomina,jmenuBarProcesoBancoNomina,jmenuBarDetalleProcesoBancoNomina,jTtoolBarProcesoBancoNomina,jTtoolBarDetalleProcesoBancoNomina);
						
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
	
	public void finishProcessProcesoBancoNomina() {// throws Exception 
		this.finishProcessProcesoBancoNomina(true);
	}
	
	public void finishProcessProcesoBancoNomina(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoBancoNomina ,this.jPanelParametrosReportesProcesoBancoNomina, this.jScrollPanelDatosProcesoBancoNomina,this.jPanelPaginacionProcesoBancoNomina, this.jScrollPanelDatosEdicionProcesoBancoNomina, this.jPanelAccionesProcesoBancoNomina,this.jPanelAccionesFormularioProcesoBancoNomina,this.jmenuBarProcesoBancoNomina,this.jmenuBarDetalleProcesoBancoNomina,this.jTtoolBarProcesoBancoNomina,this.jTtoolBarDetalleProcesoBancoNomina);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoBancoNomina=this.jTabbedPaneBusquedasProcesoBancoNomina; 
		
		final JPanel jPanelParametrosReportesProcesoBancoNomina=this.jPanelParametrosReportesProcesoBancoNomina;
		//final JScrollPane jScrollPanelDatosProcesoBancoNomina=this.jScrollPanelDatosProcesoBancoNomina;
		final JTable jTableDatosProcesoBancoNomina=this.jTableDatosProcesoBancoNomina;		
		final JPanel jPanelPaginacionProcesoBancoNomina=this.jPanelPaginacionProcesoBancoNomina;
		//final JScrollPane jScrollPanelDatosEdicionProcesoBancoNomina=this.jScrollPanelDatosEdicionProcesoBancoNomina;
		final JPanel jPanelAccionesProcesoBancoNomina=this.jPanelAccionesProcesoBancoNomina;
		
		JPanel jPanelCamposAuxiliarProcesoBancoNomina=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoBancoNomina=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
			jPanelCamposAuxiliarProcesoBancoNomina=this.jInternalFrameDetalleFormProcesoBancoNomina.jPanelCamposProcesoBancoNomina;
			jPanelAccionesFormularioAuxiliarProcesoBancoNomina=this.jInternalFrameDetalleFormProcesoBancoNomina.jPanelAccionesFormularioProcesoBancoNomina;
		}
		
		final JPanel jPanelCamposProcesoBancoNomina=jPanelCamposAuxiliarProcesoBancoNomina;
		final JPanel jPanelAccionesFormularioProcesoBancoNomina=jPanelAccionesFormularioAuxiliarProcesoBancoNomina;
		
		
		final JMenuBar jmenuBarProcesoBancoNomina=this.jmenuBarProcesoBancoNomina;		
		final JToolBar jTtoolBarProcesoBancoNomina=this.jTtoolBarProcesoBancoNomina;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoBancoNomina=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoBancoNomina=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
			jmenuBarDetalleAuxiliarProcesoBancoNomina=this.jInternalFrameDetalleFormProcesoBancoNomina.jmenuBarDetalleProcesoBancoNomina;
			jTtoolBarDetalleAuxiliarProcesoBancoNomina=this.jInternalFrameDetalleFormProcesoBancoNomina.jTtoolBarDetalleProcesoBancoNomina;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoBancoNomina=jmenuBarDetalleAuxiliarProcesoBancoNomina;
		final JToolBar jTtoolBarDetalleProcesoBancoNomina=jTtoolBarDetalleAuxiliarProcesoBancoNomina;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoBancoNomina;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoBancoNomina;
			processRunnable.jTableDatos=jTableDatosProcesoBancoNomina;
			processRunnable.jPanelCampos=jPanelCamposProcesoBancoNomina;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoBancoNomina;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoBancoNomina;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoBancoNomina;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoBancoNomina;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoBancoNomina;
			processRunnable.jTtoolBar=jTtoolBarProcesoBancoNomina;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoBancoNomina;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoBancoNomina ,jPanelParametrosReportesProcesoBancoNomina, jTableDatosProcesoBancoNomina,/*jScrollPanelDatosProcesoBancoNomina,*/jPanelCamposProcesoBancoNomina,jPanelPaginacionProcesoBancoNomina, /*jScrollPanelDatosEdicionProcesoBancoNomina,*/ jPanelAccionesProcesoBancoNomina,jPanelAccionesFormularioProcesoBancoNomina,jmenuBarProcesoBancoNomina,jmenuBarDetalleProcesoBancoNomina,jTtoolBarProcesoBancoNomina,jTtoolBarDetalleProcesoBancoNomina));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoBancoNomina(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoBancoNomina(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoBancoNomina(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoBancoNomina(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoBancoNomina,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoBancoNomina,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoBancoNomina(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoBancoNomina,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoBancoNomina,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesobanconominaConstantesFunciones.getsFinalQueryProcesoBancoNomina();
		String  finalQueryPaginacionTodos=this.procesobanconominaConstantesFunciones.getsFinalQueryProcesoBancoNomina();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoBancoNominaConstantesFunciones.getArrayColumnasGlobalesNoProcesoBancoNomina(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoBancoNominaConstantesFunciones.getArrayColumnasGlobalesProcesoBancoNomina(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoBancoNominaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesobanconominasEliminados= new ArrayList<ProcesoBancoNomina>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoBancoNomina();
		
				///*ProcesoBancoNominaSessionBean*/this.procesobanconominaSessionBean=new ProcesoBancoNominaSessionBean();
			
			if(this.procesobanconominaSessionBean==null) {
				this.procesobanconominaSessionBean=new ProcesoBancoNominaSessionBean();
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
					this.iNumeroPaginacion=ProcesoBancoNominaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoBancoNominaConstantesFunciones.getClassesForeignKeysOfProcesoBancoNomina(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesobanconomina."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesobanconominasAux= new ArrayList<ProcesoBancoNomina>();
			
				
			procesobanconominaLogic.setDatosCliente(this.datosCliente);
			procesobanconominaLogic.setDatosDeep(this.datosDeep);
			procesobanconominaLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoBancoNomina")) {
				this.sDetalleReporte=ProcesoBancoNominaConstantesFunciones.getDetalleIndiceBusquedaProcesoBancoNomina(id_bancoBusquedaProcesoBancoNomina,id_cuenta_bancoBusquedaProcesoBancoNomina,id_tipo_contratoBusquedaProcesoBancoNomina,id_tipo_banco_discoBusquedaProcesoBancoNomina,con_otrosBusquedaProcesoBancoNomina,con_internetBusquedaProcesoBancoNomina,fechaBusquedaProcesoBancoNomina,numero_secuencialesBusquedaProcesoBancoNomina,genera_textoBusquedaProcesoBancoNomina,genera_excelBusquedaProcesoBancoNomina);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesobanconominaLogic.getProcesoBancoNominasBusquedaProcesoBancoNomina(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bancoBusquedaProcesoBancoNomina,id_cuenta_bancoBusquedaProcesoBancoNomina,id_tipo_contratoBusquedaProcesoBancoNomina,id_tipo_banco_discoBusquedaProcesoBancoNomina,con_otrosBusquedaProcesoBancoNomina,con_internetBusquedaProcesoBancoNomina,fechaBusquedaProcesoBancoNomina,numero_secuencialesBusquedaProcesoBancoNomina,genera_textoBusquedaProcesoBancoNomina,genera_excelBusquedaProcesoBancoNomina);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoBancoNominaConstantesFunciones.getDetalleIndiceBusquedaProcesoBancoNomina(id_bancoBusquedaProcesoBancoNomina,id_cuenta_bancoBusquedaProcesoBancoNomina,id_tipo_contratoBusquedaProcesoBancoNomina,id_tipo_banco_discoBusquedaProcesoBancoNomina,con_otrosBusquedaProcesoBancoNomina,con_internetBusquedaProcesoBancoNomina,fechaBusquedaProcesoBancoNomina,numero_secuencialesBusquedaProcesoBancoNomina,genera_textoBusquedaProcesoBancoNomina,genera_excelBusquedaProcesoBancoNomina);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoBancoNominaConstantesFunciones.getDetalleIndiceBusquedaProcesoBancoNomina(id_bancoBusquedaProcesoBancoNomina,id_cuenta_bancoBusquedaProcesoBancoNomina,id_tipo_contratoBusquedaProcesoBancoNomina,id_tipo_banco_discoBusquedaProcesoBancoNomina,con_otrosBusquedaProcesoBancoNomina,con_internetBusquedaProcesoBancoNomina,fechaBusquedaProcesoBancoNomina,numero_secuencialesBusquedaProcesoBancoNomina,genera_textoBusquedaProcesoBancoNomina,genera_excelBusquedaProcesoBancoNomina);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesobanconominaLogic.getProcesoBancoNominas()==null||procesobanconominaLogic.getProcesoBancoNominas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesobanconominas==null|| procesobanconominas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesobanconominasAux=new ArrayList<ProcesoBancoNomina>();
						procesobanconominasAux.addAll(procesobanconominaLogic.getProcesoBancoNominas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesobanconominasAux=new ArrayList<ProcesoBancoNomina>();
							procesobanconominasAux.addAll(procesobanconominas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesobanconominaLogic.getProcesoBancoNominasBusquedaProcesoBancoNomina(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bancoBusquedaProcesoBancoNomina,id_cuenta_bancoBusquedaProcesoBancoNomina,id_tipo_contratoBusquedaProcesoBancoNomina,id_tipo_banco_discoBusquedaProcesoBancoNomina,con_otrosBusquedaProcesoBancoNomina,con_internetBusquedaProcesoBancoNomina,fechaBusquedaProcesoBancoNomina,numero_secuencialesBusquedaProcesoBancoNomina,genera_textoBusquedaProcesoBancoNomina,genera_excelBusquedaProcesoBancoNomina);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoBancoNominaConstantesFunciones.getDetalleIndiceBusquedaProcesoBancoNomina(id_bancoBusquedaProcesoBancoNomina,id_cuenta_bancoBusquedaProcesoBancoNomina,id_tipo_contratoBusquedaProcesoBancoNomina,id_tipo_banco_discoBusquedaProcesoBancoNomina,con_otrosBusquedaProcesoBancoNomina,con_internetBusquedaProcesoBancoNomina,fechaBusquedaProcesoBancoNomina,numero_secuencialesBusquedaProcesoBancoNomina,genera_textoBusquedaProcesoBancoNomina,genera_excelBusquedaProcesoBancoNomina);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoBancoNominaConstantesFunciones.getDetalleIndiceBusquedaProcesoBancoNomina(id_bancoBusquedaProcesoBancoNomina,id_cuenta_bancoBusquedaProcesoBancoNomina,id_tipo_contratoBusquedaProcesoBancoNomina,id_tipo_banco_discoBusquedaProcesoBancoNomina,con_otrosBusquedaProcesoBancoNomina,con_internetBusquedaProcesoBancoNomina,fechaBusquedaProcesoBancoNomina,numero_secuencialesBusquedaProcesoBancoNomina,genera_textoBusquedaProcesoBancoNomina,genera_excelBusquedaProcesoBancoNomina);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoBancoNominas("BusquedaProcesoBancoNomina",procesobanconominaLogic.getProcesoBancoNominas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoBancoNominas("BusquedaProcesoBancoNomina",procesobanconominas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesobanconominaLogic.setProcesoBancoNominas(new ArrayList<ProcesoBancoNomina>());
						procesobanconominaLogic.getProcesoBancoNominas().addAll(procesobanconominasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesobanconominas=new ArrayList<ProcesoBancoNomina>();
							procesobanconominas.addAll(procesobanconominasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoBancoNomina();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","PROCESOS",JOptionPane.INFORMATION_MESSAGE);
		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoBancoNomina();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesobanconominaLogic.getProcesoBancoNominas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesobanconominas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesobanconominaLogic.getProcesoBancoNominas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesobanconominas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoBancoNomina procesobanconomina) {
		Boolean permite=true;
		
		if(this.procesobanconomina.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoBancoNominaConstantesFunciones.getOrderByListaProcesoBancoNomina();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoBancoNominaConstantesFunciones.getOrderByListaProcesoBancoNomina();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoBancoNomina procesobanconomina:procesobanconominaLogic.getProcesoBancoNominas()) {
				if(procesobanconomina.getsType().equals(Constantes2.S_TOTALES)) {
					procesobanconominaTotales=procesobanconomina;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoBancoNomina procesobanconomina:this.procesobanconominas) {
				if(procesobanconomina.getsType().equals(Constantes2.S_TOTALES)) {
					procesobanconominaTotales=procesobanconomina;
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
			this.procesobanconominaAux=new ProcesoBancoNomina();
			this.procesobanconominaAux.setsType(Constantes2.S_TOTALES);
			this.procesobanconominaAux.setIsNew(false);
			this.procesobanconominaAux.setIsChanged(false);
			this.procesobanconominaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoBancoNominaConstantesFunciones.TotalizarValoresFilaProcesoBancoNomina(this.procesobanconominaLogic.getProcesoBancoNominas(),this.procesobanconominaAux);
				
				//this.procesobanconominaLogic.getProcesoBancoNominas().add(this.procesobanconominaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoBancoNominaConstantesFunciones.TotalizarValoresFilaProcesoBancoNomina(this.procesobanconominas,this.procesobanconominaAux);
				
				this.procesobanconominas.add(this.procesobanconominaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesobanconominaTotales=new ProcesoBancoNomina();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesobanconominaLogic.getProcesoBancoNominas().remove(procesobanconominaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesobanconominas.remove(procesobanconominaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesobanconominaTotales=new ProcesoBancoNomina();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoBancoNomina procesobanconomina:procesobanconominaLogic.getProcesoBancoNominas()) {
				if(procesobanconomina.getsType().equals(Constantes2.S_TOTALES)) {
					procesobanconominaTotales=procesobanconomina;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoBancoNominaConstantesFunciones.TotalizarValoresFilaProcesoBancoNomina(this.procesobanconominaLogic.getProcesoBancoNominas(),procesobanconominaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoBancoNomina procesobanconomina:this.procesobanconominas) {
				if(procesobanconomina.getsType().equals(Constantes2.S_TOTALES)) {
					procesobanconominaTotales=procesobanconomina;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoBancoNominaConstantesFunciones.TotalizarValoresFilaProcesoBancoNomina(this.procesobanconominas,procesobanconominaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoBancoNominasBusquedaProcesoBancoNomina()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoBancoNomina";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoBancoNominasFK_IdBanco()throws Exception {
		try {
			sAccionBusqueda="FK_IdBanco";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoBancoNominasFK_IdCuentaBanco()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaBanco";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoBancoNominasFK_IdTipoBancoDisco()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoBancoDisco";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoBancoNominasFK_IdTipoContrato()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoContrato";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoBancoNominasBusquedaProcesoBancoNomina(String sFinalQuery,Long id_banco,Long id_cuenta_banco,Long id_tipo_contrato,Long id_tipo_banco_disco,Boolean con_otros,Boolean con_internet,Date fecha,Integer numero_secuenciales,Boolean genera_texto,Boolean genera_excel)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesobanconominaLogic.getProcesoBancoNominasBusquedaProcesoBancoNomina(sFinalQuery,this.pagination,id_banco,id_cuenta_banco,id_tipo_contrato,id_tipo_banco_disco,con_otros,con_internet,fecha,numero_secuenciales,genera_texto,genera_excel);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoBancoNominasFK_IdBanco(String sFinalQuery,Long id_banco)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesobanconominaLogic.getProcesoBancoNominasFK_IdBanco(sFinalQuery,this.pagination,id_banco);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoBancoNominasFK_IdCuentaBanco(String sFinalQuery,Long id_cuenta_banco)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesobanconominaLogic.getProcesoBancoNominasFK_IdCuentaBanco(sFinalQuery,this.pagination,id_cuenta_banco);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoBancoNominasFK_IdTipoBancoDisco(String sFinalQuery,Long id_tipo_banco_disco)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesobanconominaLogic.getProcesoBancoNominasFK_IdTipoBancoDisco(sFinalQuery,this.pagination,id_tipo_banco_disco);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoBancoNominasFK_IdTipoContrato(String sFinalQuery,Long id_tipo_contrato)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesobanconominaLogic.getProcesoBancoNominasFK_IdTipoContrato(sFinalQuery,this.pagination,id_tipo_contrato);
				
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
	
	public void inicializarPermisosProcesoBancoNomina() {
		this.isPermisoTodoProcesoBancoNomina=false;
		this.isPermisoNuevoProcesoBancoNomina=false;
		this.isPermisoActualizarProcesoBancoNomina=false;
		this.isPermisoActualizarOriginalProcesoBancoNomina=false;
		this.isPermisoEliminarProcesoBancoNomina=false;
		this.isPermisoGuardarCambiosProcesoBancoNomina=false;
		this.isPermisoConsultaProcesoBancoNomina=true;
		this.isPermisoBusquedaProcesoBancoNomina=true;
		this.isPermisoReporteProcesoBancoNomina=true;
		this.isPermisoOrdenProcesoBancoNomina=false;		
		this.isPermisoPaginacionMedioProcesoBancoNomina=false;		
		this.isPermisoPaginacionAltoProcesoBancoNomina=false;		
		this.isPermisoPaginacionTodoProcesoBancoNomina=false;		
		this.isPermisoCopiarProcesoBancoNomina=false;		
		this.isPermisoVerFormProcesoBancoNomina=false;		
		this.isPermisoDuplicarProcesoBancoNomina=false;
		this.isPermisoOrdenProcesoBancoNomina=false;
	}
	
	public void setPermisosUsuarioProcesoBancoNomina(Boolean isPermiso) {
		this.isPermisoTodoProcesoBancoNomina=isPermiso;
		this.isPermisoNuevoProcesoBancoNomina=isPermiso;
		this.isPermisoActualizarProcesoBancoNomina=isPermiso;
		this.isPermisoActualizarOriginalProcesoBancoNomina=isPermiso;
		this.isPermisoEliminarProcesoBancoNomina=isPermiso;
		this.isPermisoGuardarCambiosProcesoBancoNomina=isPermiso;
		this.isPermisoConsultaProcesoBancoNomina=isPermiso;
		this.isPermisoBusquedaProcesoBancoNomina=isPermiso;
		this.isPermisoReporteProcesoBancoNomina=isPermiso;
		this.isPermisoOrdenProcesoBancoNomina=isPermiso;		
		this.isPermisoPaginacionMedioProcesoBancoNomina=isPermiso;		
		this.isPermisoPaginacionAltoProcesoBancoNomina=isPermiso;		
		this.isPermisoPaginacionTodoProcesoBancoNomina=isPermiso;		
		this.isPermisoCopiarProcesoBancoNomina=isPermiso;		
		this.isPermisoVerFormProcesoBancoNomina=isPermiso;		
		this.isPermisoDuplicarProcesoBancoNomina=isPermiso;
		this.isPermisoOrdenProcesoBancoNomina=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoBancoNomina(Boolean isPermiso) {
		//this.isPermisoTodoProcesoBancoNomina=isPermiso;
		this.isPermisoNuevoProcesoBancoNomina=isPermiso;
		this.isPermisoActualizarProcesoBancoNomina=isPermiso;
		this.isPermisoActualizarOriginalProcesoBancoNomina=isPermiso;
		this.isPermisoEliminarProcesoBancoNomina=isPermiso;
		this.isPermisoGuardarCambiosProcesoBancoNomina=isPermiso;
		//this.isPermisoConsultaProcesoBancoNomina=isPermiso;
		//this.isPermisoBusquedaProcesoBancoNomina=isPermiso;
		//this.isPermisoReporteProcesoBancoNomina=isPermiso;
		//this.isPermisoOrdenProcesoBancoNomina=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoBancoNomina=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoBancoNomina=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoBancoNomina=isPermiso;		
		//this.isPermisoCopiarProcesoBancoNomina=isPermiso;		
		//this.isPermisoDuplicarProcesoBancoNomina=isPermiso;
		//this.isPermisoOrdenProcesoBancoNomina=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoBancoNominaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoBancoNominaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoBancoNomina(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoBancoNominaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoBancoNominaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoBancoNominaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoBancoNominaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoBancoNomina() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoBancoNominaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoBancoNominaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoBancoNomina=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoBancoNomina=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoBancoNomina=this.isPermisoActualizarProcesoBancoNomina;
			this.isPermisoEliminarProcesoBancoNomina=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoBancoNomina=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoBancoNomina=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoBancoNomina=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoBancoNomina=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoBancoNomina=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoBancoNomina=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoBancoNomina=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoBancoNomina=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoBancoNomina=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoBancoNomina=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoBancoNomina=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoBancoNomina=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoBancoNomina=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoBancoNomina.setToolTipText(this.jTableDatosProcesoBancoNomina.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoBancoNomina(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoBancoNomina(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoBancoNominaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoBancoNominaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoBancoNomina() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoBancoNominaListas()throws Exception {
		try	{						
			
				this.bancosForeignKey=new ArrayList();
				this.cuentabancosForeignKey=new ArrayList();
				this.tipocontratosForeignKey=new ArrayList();
				this.tipobancodiscosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoBancoNominaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoBancoNominaJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyBancoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaBancoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoContratoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoBancoDiscoListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyBancoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.bancosForeignKey==null||this.bancosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=BancoConstantesFunciones.getArrayColumnasGlobalesBanco(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BancoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=BancoConstantesFunciones.SFINALQUERY;

				this.cargarCombosBancosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaBancoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentabancosForeignKey==null||this.cuentabancosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaBancoConstantesFunciones.getArrayColumnasGlobalesCuentaBanco(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaBancoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaBancoConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaBancosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoContratoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipocontratosForeignKey==null||this.tipocontratosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoContratoConstantesFunciones.getArrayColumnasGlobalesTipoContrato(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoContratoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoContratoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoContratosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoBancoDiscoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipobancodiscosForeignKey==null||this.tipobancodiscosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoBancoDiscoConstantesFunciones.getArrayColumnasGlobalesTipoBancoDisco(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoBancoDiscoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoBancoDiscoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoBancoDiscosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoBancoNomina()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyBanco();
			this.addItemDefectoCombosForeignKeyCuentaBanco();
			this.addItemDefectoCombosForeignKeyTipoContrato();
			this.addItemDefectoCombosForeignKeyTipoBancoDisco();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyBanco()throws Exception {
		try {
			if(this.procesobanconominaSessionBean==null) {
				this.procesobanconominaSessionBean=new ProcesoBancoNominaSessionBean();
			}

			if(!this.procesobanconominaSessionBean.getisBusquedaDesdeForeignKeySesionBanco()) {
				Banco banco=new Banco();
				BancoConstantesFunciones.setBancoDescripcion(banco,Constantes.SMENSAJE_ESCOJA_OPCION);
				banco.setId(null);

				if(!BancoConstantesFunciones.ExisteEnLista(this.bancosForeignKey,banco,true)) {

					this.bancosForeignKey.add(0,banco);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaBanco()throws Exception {
		try {

			if(!this.procesobanconominaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaBanco()) {
				CuentaBanco cuentabanco=new CuentaBanco();
				CuentaBancoConstantesFunciones.setCuentaBancoDescripcion(cuentabanco,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentabanco.setId(null);

				if(!CuentaBancoConstantesFunciones.ExisteEnLista(this.cuentabancosForeignKey,cuentabanco,true)) {

					this.cuentabancosForeignKey.add(0,cuentabanco);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoContrato()throws Exception {
		try {

			if(!this.procesobanconominaSessionBean.getisBusquedaDesdeForeignKeySesionTipoContrato()) {
				TipoContrato tipocontrato=new TipoContrato();
				TipoContratoConstantesFunciones.setTipoContratoDescripcion(tipocontrato,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipocontrato.setId(null);

				if(!TipoContratoConstantesFunciones.ExisteEnLista(this.tipocontratosForeignKey,tipocontrato,true)) {

					this.tipocontratosForeignKey.add(0,tipocontrato);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoBancoDisco()throws Exception {
		try {

			if(!this.procesobanconominaSessionBean.getisBusquedaDesdeForeignKeySesionTipoBancoDisco()) {
				TipoBancoDisco tipobancodisco=new TipoBancoDisco();
				TipoBancoDiscoConstantesFunciones.setTipoBancoDiscoDescripcion(tipobancodisco,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipobancodisco.setId(null);

				if(!TipoBancoDiscoConstantesFunciones.ExisteEnLista(this.tipobancodiscosForeignKey,tipobancodisco,true)) {

					this.tipobancodiscosForeignKey.add(0,tipobancodisco);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProcesoBancoNomina()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoBancoNomina(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoBancoNomina()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoBancoNomina();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoBancoNomina(ProcesoBancoNomina procesobanconomina)throws Exception {	
		try {
			
			this.setActualBancoForeignKey(procesobanconomina.getid_banco(),false,"Formulario");
			this.setActualCuentaBancoForeignKey(procesobanconomina.getid_cuenta_banco(),false,"Formulario");
			this.setActualTipoContratoForeignKey(procesobanconomina.getid_tipo_contrato(),false,"Formulario");
			this.setActualTipoBancoDiscoForeignKey(procesobanconomina.getid_tipo_banco_disco(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoBancoNomina(ProcesoBancoNomina procesobanconomina,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoBancoNomina()throws Exception {	
		try {
			
			this.setActualBancoForeignKey(this.procesobanconominaConstantesFunciones.getid_banco(),false,"Formulario");
			this.setActualCuentaBancoForeignKey(this.procesobanconominaConstantesFunciones.getid_cuenta_banco(),false,"Formulario");
			this.setActualTipoContratoForeignKey(this.procesobanconominaConstantesFunciones.getid_tipo_contrato(),false,"Formulario");
			this.setActualTipoBancoDiscoForeignKey(this.procesobanconominaConstantesFunciones.getid_tipo_banco_disco(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoBancoNomina()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoBancoNomina()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoBancoNomina()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoBancoNomina()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoBancoNomina()throws Exception {
		try {
			

			this.cargarCombosFrameBancosForeignKey("Todos");
			this.cargarCombosFrameCuentaBancosForeignKey("Todos");
			this.cargarCombosFrameTipoContratosForeignKey("Todos");
			this.cargarCombosFrameTipoBancoDiscosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoBancoNomina(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameBancosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaBancosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoContratosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoBancoDiscosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoBancoNomina()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_bancoProcesoBancoNomina!=null && this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_bancoProcesoBancoNomina.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_bancoProcesoBancoNomina.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_cuenta_bancoProcesoBancoNomina!=null && this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_cuenta_bancoProcesoBancoNomina.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_cuenta_bancoProcesoBancoNomina.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_contratoProcesoBancoNomina!=null && this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_contratoProcesoBancoNomina.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_contratoProcesoBancoNomina.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_banco_discoProcesoBancoNomina!=null && this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_banco_discoProcesoBancoNomina.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_banco_discoProcesoBancoNomina.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public ProcesoBancoNominaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoBancoNominaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoBancoNominaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesobanconominaSessionBean=new ProcesoBancoNominaSessionBean(); 
		this.procesobanconominaConstantesFunciones=new ProcesoBancoNominaConstantesFunciones(); 
		this.procesobanconominaBean=new ProcesoBancoNomina();//(this.procesobanconominaConstantesFunciones); 		
		this.procesobanconominaReturnGeneral=new ProcesoBancoNominaParameterReturnGeneral(); 
		
		this.procesobanconominaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesobanconominaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoBancoNominaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoBancoNominaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoBancoNominaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoBancoNomina(true);
			
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
			
			this.procesobanconominaConstantesFunciones=new ProcesoBancoNominaConstantesFunciones(); 
			this.procesobanconominaBean=new ProcesoBancoNomina();//this.procesobanconominaConstantesFunciones); 			
			this.procesobanconominaReturnGeneral=new ProcesoBancoNominaParameterReturnGeneral(); 
		
			ProcesoBancoNominaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Banco Nomina Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.procesobanconomina=new ProcesoBancoNomina();
			this.procesobanconominas = new ArrayList<ProcesoBancoNomina>();
			this.procesobanconominasAux = new ArrayList<ProcesoBancoNomina>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic=new ProcesoBancoNominaLogic();
				this.procesobanconominaLogic.getNewConnexionToDeep("");
			}
			
			//this.procesobanconominaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesobanconominaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoBancoNomina);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoBancoNomina!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoBancoNomina);	
					}
					
					if(this.jInternalFrameImportacionProcesoBancoNomina!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoBancoNomina);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoBancoNomina!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoBancoNomina);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoBancoNomina);
				this.jInternalFrameDetalleFormProcesoBancoNomina.setVisible(false);
				this.jInternalFrameDetalleFormProcesoBancoNomina.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoBancoNomina!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoBancoNomina);
					this.jInternalFrameReporteDinamicoProcesoBancoNomina.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoBancoNomina.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoBancoNomina!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoBancoNomina);
					this.jInternalFrameImportacionProcesoBancoNomina.setVisible(false);
					this.jInternalFrameImportacionProcesoBancoNomina.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoBancoNomina!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoBancoNomina);
					this.jInternalFrameOrderByProcesoBancoNomina.setVisible(false);
					this.jInternalFrameOrderByProcesoBancoNomina.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoBancoNominaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoBancoNominaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesobanconominaReturnGeneral=new ProcesoBancoNominaParameterReturnGeneral();
			
			this.procesobanconominaParameterGeneral=new ProcesoBancoNominaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesobanconominaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoBancoNominaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoBancoNominaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesobanconominaSessionBean.getEsGuardarRelacionado(),this.procesobanconominaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoBancoNominaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesobanconominaSessionBean.getEsGuardarRelacionado(),this.procesobanconominaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoBancoNomina=false;
			this.isVisibilidadCeldaDuplicarProcesoBancoNomina=true;
			this.isVisibilidadCeldaCopiarProcesoBancoNomina=true;
			this.isVisibilidadCeldaVerFormProcesoBancoNomina=true;
			this.isVisibilidadCeldaOrdenProcesoBancoNomina=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina=false;
			this.isVisibilidadCeldaModificarProcesoBancoNomina=false;
			this.isVisibilidadCeldaActualizarProcesoBancoNomina=false;
			this.isVisibilidadCeldaEliminarProcesoBancoNomina=false;
			this.isVisibilidadCeldaCancelarProcesoBancoNomina=false;
			this.isVisibilidadCeldaGuardarProcesoBancoNomina=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoBancoNomina=false;
			
			
			this.isVisibilidadBusquedaProcesoBancoNomina=true;
			this.isVisibilidadFK_IdBanco=true;
			this.isVisibilidadFK_IdCuentaBanco=true;
			this.isVisibilidadFK_IdTipoBancoDisco=true;
			this.isVisibilidadFK_IdTipoContrato=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoBancoNomina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoBancoNomina();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoBancoNomina(false);
			
			this.setPermisosUsuarioProcesoBancoNomina();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesobanconominaSessionBean.getEsGuardarRelacionado() 
				|| (this.procesobanconominaSessionBean.getEsGuardarRelacionado() && this.procesobanconominaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoBancoNominaClasesRelacionadas();
			}
			
			if(this.procesobanconominaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoBancoNominaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoBancoNomina();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoBancoNomina();
			}
			
			if(!this.isPermisoBusquedaProcesoBancoNomina) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoBancoNomina.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoBancoNominaConstantesFunciones.getTiposSeleccionarProcesoBancoNomina());
				
				this.tiposColumnasSelect=ProcesoBancoNominaConstantesFunciones.getTiposSeleccionarProcesoBancoNomina(true);
				
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
			//if(!this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoBancoNomina();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioProcesoBancoNomina(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioProcesoBancoNomina(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoBancoNomina() ;
			
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
			
			this.bancoLogic=new BancoLogic();
			this.cuentabancoLogic=new CuentaBancoLogic();
			this.tipocontratoLogic=new TipoContratoLogic();
			this.tipobancodiscoLogic=new TipoBancoDiscoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesobanconominaImplementable= (ProcesoBancoNominaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoBancoNominaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesobanconominaImplementableHome= (ProcesoBancoNominaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoBancoNominaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesobanconominas= new ArrayList<ProcesoBancoNomina>();
			this.procesobanconominasEliminados= new ArrayList<ProcesoBancoNomina>();
						
			this.isEsNuevoProcesoBancoNomina=false;
			this.esParaAccionDesdeFormularioProcesoBancoNomina=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.bancosForeignKey=new ArrayList<Banco>() ;
			this.cuentabancosForeignKey=new ArrayList<CuentaBanco>() ;
			this.tipocontratosForeignKey=new ArrayList<TipoContrato>() ;
			this.tipobancodiscosForeignKey=new ArrayList<TipoBancoDisco>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoBancoNomina(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoBancoNomina();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoBancoNominaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoBancoNominaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoBancoNomina("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoBancoNomina(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoBancoNomina();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoBancoNomina();
			}
			
			ProcesoBancoNominaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoBancoNomina.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoBancoNomina.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoBancoNomina.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoBancoNomina(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoBancoNomina: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoBancoNomina() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoBancoNomina")) {
				iIndex=this.jInternalFrameDetalleFormProcesoBancoNomina.jTabbedPaneRelacionesProcesoBancoNomina.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoBancoNomina.jTabbedPaneRelacionesProcesoBancoNomina.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoBancoNomina();	
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
	
	public void cargarCombosForeignKeyProcesoBancoNomina(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoBancoNomina(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoBancoNomina(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoBancoNominaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoBancoNomina();
		
		this.cargarCombosFrameForeignKeyProcesoBancoNomina();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoBancoNomina();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoBancoNomina();
		}
	}
	
	

	public void cargarCombosForeignKeyBanco(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBancoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBanco();
				this.cargarCombosFrameBancosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaBanco(this.bancosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaBanco(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaBancoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaBanco();
				this.cargarCombosFrameCuentaBancosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaBanco(this.cuentabancosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoContrato(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoContratoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoContrato();
				this.cargarCombosFrameTipoContratosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoContrato(this.tipocontratosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoBancoDisco(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoBancoDiscoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoBancoDisco();
				this.cargarCombosFrameTipoBancoDiscosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoBancoDisco(this.tipobancodiscosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProcesoBancoNominaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesobanconominaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoBancoNomina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
			
			
			if(jTableDatosProcesoBancoNomina.getRowCount()>=1) {
				jTableDatosProcesoBancoNomina.removeRowSelectionInterval(0, jTableDatosProcesoBancoNomina.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoBancoNomina=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoBancoNomina(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoBancoNomina(true);			
			//this.procesobanconomina=new ProcesoBancoNomina();
			//this.procesobanconomina.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoBancoNomina(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoBancoNomina() ;
			
			if(ProcesoBancoNominaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoBancoNomina(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesobanconomina);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesobanconomina);				
			
			ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
			
			if(this.procesobanconominaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoBancoNomina: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoBancoNominaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoBancoNomina> procesobanconominasSeleccionados=new ArrayList<ProcesoBancoNomina>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoBancoNomina.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoBancoNomina.getSelectedRows().length;			
			}
			
			procesobanconominasSeleccionados=this.getProcesoBancoNominasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoBancoNomina--;			
				//ProcesoBancoNomina procesobanconominaAux= new ProcesoBancoNomina();			
				//procesobanconominaAux.setId(this.iIdNuevoProcesoBancoNomina);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoBancoNomina procesobanconominaOrigen=new ProcesoBancoNomina();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoBancoNomina procesobanconominaOrigen : procesobanconominasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesobanconominaOrigen =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesobanconominaOrigen =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoBancoNomina();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesobanconomina.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoBancoNomina(procesobanconominaOrigen,this.procesobanconomina,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesobanconominaLogic.getProcesoBancoNominas().add(this.procesobanconominaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesobanconominas.add(this.procesobanconominaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoBancoNomina(false);
				
				this.jTableDatosProcesoBancoNomina.setRowSelectionInterval(this.getIndiceNuevoProcesoBancoNomina(), this.getIndiceNuevoProcesoBancoNomina());
				
				int iLastRow =  this.jTableDatosProcesoBancoNomina.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoBancoNomina.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoBancoNomina.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoBancoNomina(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoBancoNomina> procesobanconominasSeleccionados=new ArrayList<ProcesoBancoNomina>();									
		
			ProcesoBancoNomina procesobanconominaOrigen=new ProcesoBancoNomina();
			ProcesoBancoNomina procesobanconominaDestino=new ProcesoBancoNomina();
				
			procesobanconominasSeleccionados=this.getProcesoBancoNominasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoBancoNomina.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesobanconominasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoBancoNomina.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesobanconominaOrigen =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesobanconominaOrigen =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesobanconominaDestino =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesobanconominaDestino =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesobanconominaOrigen =procesobanconominasSeleccionados.get(0);
				procesobanconominaDestino =procesobanconominasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoBancoNomina(procesobanconominaOrigen,procesobanconominaDestino,true,false);
				
				procesobanconominaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesobanconominaDestino,procesobanconominaLogic.getProcesoBancoNominas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesobanconominaDestino,procesobanconominas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoBancoNomina(false);
				
				//this.jTableDatosProcesoBancoNomina.setRowSelectionInterval(this.getIndiceNuevoProcesoBancoNomina(), this.getIndiceNuevoProcesoBancoNomina());
				
				int iLastRow =  this.jTableDatosProcesoBancoNomina.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoBancoNomina.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoBancoNomina.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoBancoNomina(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoBancoNomina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoBancoNomina.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoBancoNomina.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoBancoNomina.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoBancoNomina.setVisible(!isVisible);
			this.jPanelPaginacionProcesoBancoNomina.setVisible(!isVisible);
			this.jPanelAccionesProcesoBancoNomina.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoBancoNomina();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoBancoNomina();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoBancoNomina();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoBancoNomina();
			
			this.abrirFrameOrderByProcesoBancoNomina();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoBancoNomina();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoBancoNomina(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoBancoNomina);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoBancoNomina.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoBancoNomina.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoBancoNomina.setSize(this.jInternalFrameDetalleFormProcesoBancoNomina.iWidthFormulario,this.jInternalFrameDetalleFormProcesoBancoNomina.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoBancoNomina.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoBancoNomina.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoBancoNomina.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoBancoNomina.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoBancoNomina.jContentPaneDetalleProcesoBancoNomina.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoBancoNomina.jTabbedPaneRelacionesProcesoBancoNomina.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoBancoNomina.jContentPaneDetalleProcesoBancoNomina.getWidth(),ProcesoBancoNominaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoBancoNomina.jTabbedPaneRelacionesProcesoBancoNomina.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoBancoNomina.jContentPaneDetalleProcesoBancoNomina.getWidth(),ProcesoBancoNominaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoBancoNomina.jTabbedPaneRelacionesProcesoBancoNomina.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoBancoNomina.jContentPaneDetalleProcesoBancoNomina.getWidth(),ProcesoBancoNominaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoBancoNomina.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoBancoNomina.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoBancoNomina() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoBancoNomina==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoBancoNomina=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoBancoNomina,false,this);
				} else {
					this.jInternalFrameOrderByProcesoBancoNomina=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoBancoNomina,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoBancoNomina);
				this.jInternalFrameOrderByProcesoBancoNomina.setVisible(false);
				this.jInternalFrameOrderByProcesoBancoNomina.setSelected(false);
				
				this.jInternalFrameOrderByProcesoBancoNomina.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoBancoNomina"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoBancoNomina();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoBancoNomina() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoBancoNomina==null) {
				
				this.jInternalFrameImportacionProcesoBancoNomina=new ImportacionJInternalFrame(ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoBancoNomina);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoBancoNomina);
				this.jInternalFrameImportacionProcesoBancoNomina.setVisible(false);
				this.jInternalFrameImportacionProcesoBancoNomina.setSelected(false);


				this.jInternalFrameImportacionProcesoBancoNomina.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoBancoNomina"));
				this.jInternalFrameImportacionProcesoBancoNomina.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoBancoNomina"));
				this.jInternalFrameImportacionProcesoBancoNomina.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoBancoNomina"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoBancoNomina() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoBancoNomina==null) {
				this.jInternalFrameReporteDinamicoProcesoBancoNomina=new ReporteDinamicoJInternalFrame(ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoBancoNomina);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoBancoNomina);
				this.jInternalFrameReporteDinamicoProcesoBancoNomina.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoBancoNomina.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoBancoNomina"));
				this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoBancoNomina"));
				this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoBancoNomina"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoBancoNomina();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoBancoNomina() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoBancoNomina);
			
	       	this.jInternalFrameDetalleFormProcesoBancoNomina.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoBancoNomina.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoBancoNomina.dispose();
			//this.jInternalFrameDetalleFormProcesoBancoNomina=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoBancoNomina() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoBancoNomina.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoBancoNomina.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoBancoNomina() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoBancoNomina.setVisible(true);
	        this.jInternalFrameImportacionProcesoBancoNomina.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoBancoNomina() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoBancoNomina.setVisible(true);
	        this.jInternalFrameOrderByProcesoBancoNomina.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoBancoNomina() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoBancoNomina.setVisible(false);
	        this.jInternalFrameOrderByProcesoBancoNomina.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoBancoNomina() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoBancoNomina.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoBancoNomina.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoBancoNomina() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoBancoNomina.setVisible(false);
	        this.jInternalFrameImportacionProcesoBancoNomina.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoBancoNomina(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoBancoNomina(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoBancoNomina(true);
			//this.isEsNuevoProcesoBancoNomina=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoBancoNomina("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoBancoNomina(false) ;
			
			if(procesobanconominaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoBancoNominaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoBancoNomina(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoBancoNomina(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoBancoNominaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoBancoNomina(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoBancoNomina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoBancoNomina(true);
			//this.isEsNuevoProcesoBancoNomina=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesobanconomina.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoBancoNomina("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoBancoNomina(false) ;
			
			if(ProcesoBancoNominaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoBancoNomina(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoBancoNomina(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaBanco(List<Banco> bancosForeignKey)throws Exception{
		TableColumn tableColumnBanco=this.jTableDatosProcesoBancoNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoBancoNomina,ProcesoBancoNominaConstantesFunciones.LABEL_IDBANCO));
		TableCellEditor tableCellEditorBanco =tableColumnBanco.getCellEditor();

		BancoTableCell bancoTableCellFk=(BancoTableCell)tableCellEditorBanco;

		if(bancoTableCellFk!=null) {
			bancoTableCellFk.setbancosForeignKey(bancosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoBancoNomina.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bancoTableCellFk.setRowActual(intSelectedRow);
			//bancoTableCellFk.setbancosForeignKeyActual(bancosForeignKey);
		//}


		if(bancoTableCellFk!=null) {
			bancoTableCellFk.RecargarBancosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaBanco(List<CuentaBanco> cuentabancosForeignKey)throws Exception{
		TableColumn tableColumnCuentaBanco=this.jTableDatosProcesoBancoNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoBancoNomina,ProcesoBancoNominaConstantesFunciones.LABEL_IDCUENTABANCO));
		TableCellEditor tableCellEditorCuentaBanco =tableColumnCuentaBanco.getCellEditor();

		CuentaBancoTableCell cuentabancoTableCellFk=(CuentaBancoTableCell)tableCellEditorCuentaBanco;

		if(cuentabancoTableCellFk!=null) {
			cuentabancoTableCellFk.setcuentabancosForeignKey(cuentabancosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoBancoNomina.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentabancoTableCellFk.setRowActual(intSelectedRow);
			//cuentabancoTableCellFk.setcuentabancosForeignKeyActual(cuentabancosForeignKey);
		//}


		if(cuentabancoTableCellFk!=null) {
			cuentabancoTableCellFk.RecargarCuentaBancosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoContrato(List<TipoContrato> tipocontratosForeignKey)throws Exception{
		TableColumn tableColumnTipoContrato=this.jTableDatosProcesoBancoNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoBancoNomina,ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOCONTRATO));
		TableCellEditor tableCellEditorTipoContrato =tableColumnTipoContrato.getCellEditor();

		TipoContratoTableCell tipocontratoTableCellFk=(TipoContratoTableCell)tableCellEditorTipoContrato;

		if(tipocontratoTableCellFk!=null) {
			tipocontratoTableCellFk.settipocontratosForeignKey(tipocontratosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoBancoNomina.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipocontratoTableCellFk.setRowActual(intSelectedRow);
			//tipocontratoTableCellFk.settipocontratosForeignKeyActual(tipocontratosForeignKey);
		//}


		if(tipocontratoTableCellFk!=null) {
			tipocontratoTableCellFk.RecargarTipoContratosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoBancoDisco(List<TipoBancoDisco> tipobancodiscosForeignKey)throws Exception{
		TableColumn tableColumnTipoBancoDisco=this.jTableDatosProcesoBancoNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoBancoNomina,ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOBANCODISCO));
		TableCellEditor tableCellEditorTipoBancoDisco =tableColumnTipoBancoDisco.getCellEditor();

		TipoBancoDiscoTableCell tipobancodiscoTableCellFk=(TipoBancoDiscoTableCell)tableCellEditorTipoBancoDisco;

		if(tipobancodiscoTableCellFk!=null) {
			tipobancodiscoTableCellFk.settipobancodiscosForeignKey(tipobancodiscosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoBancoNomina.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipobancodiscoTableCellFk.setRowActual(intSelectedRow);
			//tipobancodiscoTableCellFk.settipobancodiscosForeignKeyActual(tipobancodiscosForeignKey);
		//}


		if(tipobancodiscoTableCellFk!=null) {
			tipobancodiscoTableCellFk.RecargarTipoBancoDiscosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoBancoNomina(false);
			
			//if(!this.isEsNuevoProcesoBancoNomina) {								
				int intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.procesobanconomina,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
				
			}
			
			if(this.permiteMantenimiento(this.procesobanconomina)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoBancoNomina=true;
					this.inicializarActualizarBindingTablaProcesoBancoNomina(false);
					this.isEsNuevoProcesoBancoNomina=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoBancoNomina=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoBancoNomina=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoBancoNomina(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoBancoNomina(false);
				
				this.habilitarDeshabilitarControlesProcesoBancoNomina(false);
			
												
				
				if(ProcesoBancoNominaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoBancoNomina();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoBancoNominaActionPerformed(evt,procesobanconominaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoBancoNomina(this.procesobanconomina,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoBancoNomina.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesobanconominaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesobanconomina.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoBancoNomina.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoBancoNomina.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				this.procesobanconomina.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				this.procesobanconomina.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesobanconomina)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoBancoNominaModel) this.jTableDatosProcesoBancoNomina.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoBancoNomina=true;
				this.inicializarActualizarBindingTablaProcesoBancoNomina(false);
				this.isEsNuevoProcesoBancoNomina=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoBancoNomina(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoBancoNomina(false);
				
				this.habilitarDeshabilitarControlesProcesoBancoNomina(false);
				
				
				
				if(ProcesoBancoNominaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoBancoNomina();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoBancoNomina.getRowCount()>=1) {
				jTableDatosProcesoBancoNomina.removeRowSelectionInterval(0, jTableDatosProcesoBancoNomina.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoBancoNomina(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoBancoNomina(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoBancoNomina(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoBancoNomina(false) ;
			
			this.isEsNuevoProcesoBancoNomina=false;
			
			if(ProcesoBancoNominaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoBancoNomina();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoBancoNomina(false);
				
				//SI ES MANUAL
				if(ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoBancoNomina();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoBancoNomina--;			
			//ProcesoBancoNomina procesobanconominaAux= new ProcesoBancoNomina();			
			//procesobanconominaAux.setId(this.iIdNuevoProcesoBancoNomina);
			
			if(this.jInternalFrameDetalleFormProcesoBancoNomina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoBancoNomina();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
			
			this.procesobanconomina.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesobanconominaLogic.getProcesoBancoNominas().add(this.procesobanconominaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesobanconominas.add(this.procesobanconominaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoBancoNomina(false);
			
			this.jTableDatosProcesoBancoNomina.setRowSelectionInterval(this.getIndiceNuevoProcesoBancoNomina(), this.getIndiceNuevoProcesoBancoNomina());
			
			int iLastRow =  this.jTableDatosProcesoBancoNomina.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoBancoNomina.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoBancoNomina.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoBancoNomina(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoBancoNomina(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoBancoNomina(false);
			
			//SI ES MANUAL
			if(ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoBancoNomina();
			}
			
			//this.abrirFrameTreeProcesoBancoNomina();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoBancoNomina.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoBancoNomina.setFileImportacion(this.jInternalFrameImportacionProcesoBancoNomina.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoBancoNomina.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoBancoNomina.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoBancoNomina.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoBancoNomina.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoBancoNomina> procesobanconominasSeleccionados=new ArrayList<ProcesoBancoNomina>();		

		procesobanconominasSeleccionados=this.getProcesoBancoNominasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoBancoNominaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoBancoNominaBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoBancoNominas("Todos",procesobanconominasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Banco Nomina",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoBancoNominaConstantesFunciones.LABEL_IDBANCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Banco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Banco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Banco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Banco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_IDCUENTABANCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaBanco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaBanco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaBanco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaBanco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOCONTRATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoContrato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoContrato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoContrato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoContrato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOBANCODISCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoBancoDisco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoBancoDisco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoBancoDisco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoBancoDisco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_CONOTROS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nOtros_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nOtros_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nOtros_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nOtros_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_CONINTERNET:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nInternet_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nInternet_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nInternet_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nInternet_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_NUMEROSECUENCIALES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroSecuenciales_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroSecuenciales_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroSecuenciales_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroSecuenciales_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_GENERATEXTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_neraTexto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_neraTexto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_neraTexto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_neraTexto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_GENERAEXCEL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_neraExcel_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_neraExcel_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_neraExcel_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_neraExcel_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoBancoNominaConstantesFunciones.LABEL_IDBANCO:
					sNombreCampoCategoria="id_banco";
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_IDCUENTABANCO:
					sNombreCampoCategoria="id_cuenta_banco";
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOCONTRATO:
					sNombreCampoCategoria="id_tipo_contrato";
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOBANCODISCO:
					sNombreCampoCategoria="id_tipo_banco_disco";
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_CONOTROS:
					sNombreCampoCategoria="con_otros";
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_CONINTERNET:
					sNombreCampoCategoria="con_internet";
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_NUMEROSECUENCIALES:
					sNombreCampoCategoria="numero_secuenciales";
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_GENERATEXTO:
					sNombreCampoCategoria="genera_texto";
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_GENERAEXCEL:
					sNombreCampoCategoria="genera_excel";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoBancoNominaConstantesFunciones.LABEL_IDBANCO:
					sNombreCampoCategoriaValor="id_banco";
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_IDCUENTABANCO:
					sNombreCampoCategoriaValor="id_cuenta_banco";
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOCONTRATO:
					sNombreCampoCategoriaValor="id_tipo_contrato";
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOBANCODISCO:
					sNombreCampoCategoriaValor="id_tipo_banco_disco";
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_CONOTROS:
					sNombreCampoCategoriaValor="con_otros";
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_CONINTERNET:
					sNombreCampoCategoriaValor="con_internet";
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_NUMEROSECUENCIALES:
					sNombreCampoCategoriaValor="numero_secuenciales";
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_GENERATEXTO:
					sNombreCampoCategoriaValor="genera_texto";
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_GENERAEXCEL:
					sNombreCampoCategoriaValor="genera_excel";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoBancoNominaConstantesFunciones.LABEL_IDBANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Banco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_banco");
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_IDCUENTABANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Banco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_banco");
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOCONTRATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Contrato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_contrato");
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOBANCODISCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Banco Disco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_banco_disco");
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_CONOTROS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Otros",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_otros");
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_CONINTERNET:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Internet",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_internet");
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_NUMEROSECUENCIALES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Secuenciales",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_secuenciales");
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_GENERATEXTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Genera Texto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"genera_texto");
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_GENERAEXCEL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Genera Excel",sNombreCampoCategoria,sNombreCampoCategoriaValor,"genera_excel");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoBancoNomina> procesobanconominasSeleccionados=new ArrayList<ProcesoBancoNomina>();		
		
		procesobanconominasSeleccionados=this.getProcesoBancoNominasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesobanconomina";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoBancoNominas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoBancoNominaConstantesFunciones.LABEL_IDBANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_IDBANCO);
					iRow++;

					for(ProcesoBancoNomina procesobanconomina:procesobanconominasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesobanconomina.getbanco_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_IDCUENTABANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_IDCUENTABANCO);
					iRow++;

					for(ProcesoBancoNomina procesobanconomina:procesobanconominasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesobanconomina.getcuentabanco_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOCONTRATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOCONTRATO);
					iRow++;

					for(ProcesoBancoNomina procesobanconomina:procesobanconominasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesobanconomina.gettipocontrato_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOBANCODISCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOBANCODISCO);
					iRow++;

					for(ProcesoBancoNomina procesobanconomina:procesobanconominasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesobanconomina.gettipobancodisco_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_CONOTROS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_CONOTROS);
					iRow++;

					for(ProcesoBancoNomina procesobanconomina:procesobanconominasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesobanconomina.getcon_otros());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_CONINTERNET:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_CONINTERNET);
					iRow++;

					for(ProcesoBancoNomina procesobanconomina:procesobanconominasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesobanconomina.getcon_internet());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(ProcesoBancoNomina procesobanconomina:procesobanconominasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesobanconomina.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_NUMEROSECUENCIALES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_NUMEROSECUENCIALES);
					iRow++;

					for(ProcesoBancoNomina procesobanconomina:procesobanconominasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesobanconomina.getnumero_secuenciales());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_GENERATEXTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_GENERATEXTO);
					iRow++;

					for(ProcesoBancoNomina procesobanconomina:procesobanconominasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesobanconomina.getgenera_texto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoBancoNominaConstantesFunciones.LABEL_GENERAEXCEL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_GENERAEXCEL);
					iRow++;

					for(ProcesoBancoNomina procesobanconomina:procesobanconominasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesobanconomina.getgenera_excel());
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
			//	this.getFilaCabeceraExportarExcelProcesoBancoNomina(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoBancoNomina procesobanconominaAux:procesobanconominasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoBancoNomina(procesobanconominaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Banco Nomina",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoBancoNominaBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoBancoNomina(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoBancoNomina(false);
			
			//SI ES MANUAL
			if(ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoBancoNomina();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoBancoNomina(false);
			
			//SI ES MANUAL
			if(ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoBancoNomina();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoBancoNomina(false);
			
			//SI ES MANUAL
			if(ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoBancoNomina();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoBancoNomina() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoBancoNomina.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoBancoNomina.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoBancoNomina.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoBancoNomina.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoBancoNomina.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoBancoNomina.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoBancoNomina.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoBancoNomina(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoBancoNomina(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoBancoNomina(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoBancoNomina(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoBancoNomina(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoBancoNomina(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoBancoNomina(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoBancoNomina(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoBancoNomina() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoBancoNomina();
		
		this.inicializarActualizarBindingBotonesManualProcesoBancoNomina(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoBancoNomina();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoBancoNomina() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoBancoNomina(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoBancoNomina(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoBancoNomina.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoBancoNomina.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoBancoNomina.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxPostAccionNuevoProcesoBancoNomina.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxPostAccionSinCerrarProcesoBancoNomina.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxPostAccionSinMensajeProcesoBancoNomina.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoBancoNomina.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoBancoNomina.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoBancoNomina.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
				this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxPostAccionNuevoProcesoBancoNomina.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxPostAccionSinCerrarProcesoBancoNomina.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxPostAccionSinMensajeProcesoBancoNomina.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoBancoNomina.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoBancoNomina.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxTiposAccionesFormularioProcesoBancoNomina.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoBancoNomina.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoBancoNomina!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoBancoNomina.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoBancoNomina.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoBancoNomina.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoBancoNomina.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoBancoNomina!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoBancoNomina.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoBancoNomina.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoBancoNomina(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoBancoNomina(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoBancoNomina() throws Exception {
		try	{
			if(ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoBancoNomina();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoBancoNomina() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxTiposAccionesFormularioProcesoBancoNomina.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxTiposAccionesFormularioProcesoBancoNomina.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoBancoNomina() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoBancoNomina.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoBancoNomina.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoBancoNomina.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoBancoNomina.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoBancoNomina.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoBancoNomina.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoBancoNomina.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoBancoNomina.addItem(reporte);
			}
			
			
			if(!this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoBancoNomina.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoBancoNomina.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoBancoNomina.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoBancoNomina.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoBancoNomina.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoBancoNomina.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxTiposAccionesFormularioProcesoBancoNomina.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxTiposAccionesFormularioProcesoBancoNomina.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoBancoNomina.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoBancoNomina.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoBancoNomina.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoBancoNomina();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoBancoNomina() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoBancoNomina!=null) {
				this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoBancoNomina!=null) {
				this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoBancoNomina!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoBancoNomina()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.getSelectedItem()!=null){this.id_bancoBusquedaProcesoBancoNomina=((Banco)this.jComboBoxid_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.getSelectedItem()!=null){this.id_cuenta_bancoBusquedaProcesoBancoNomina=((CuentaBanco)this.jComboBoxid_cuenta_bancoBusquedaProcesoBancoNominaProcesoBancoNomina.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina.getSelectedItem()!=null){this.id_tipo_contratoBusquedaProcesoBancoNomina=((TipoContrato)this.jComboBoxid_tipo_contratoBusquedaProcesoBancoNominaProcesoBancoNomina.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina.getSelectedItem()!=null){this.id_tipo_banco_discoBusquedaProcesoBancoNomina=((TipoBancoDisco)this.jComboBoxid_tipo_banco_discoBusquedaProcesoBancoNominaProcesoBancoNomina.getSelectedItem()).getId();}
		this.con_otrosBusquedaProcesoBancoNomina=this.jCheckBoxcon_otrosBusquedaProcesoBancoNominaProcesoBancoNomina.isSelected();
		this.con_internetBusquedaProcesoBancoNomina=this.jCheckBoxcon_internetBusquedaProcesoBancoNominaProcesoBancoNomina.isSelected();
		this.fechaBusquedaProcesoBancoNomina=new Date(this.jDateChooserfechaBusquedaProcesoBancoNominaProcesoBancoNomina.getDate().getTime());
		this.numero_secuencialesBusquedaProcesoBancoNomina=Integer.parseInt(this.jTextFieldnumero_secuencialesBusquedaProcesoBancoNominaProcesoBancoNomina.getText());
		this.genera_textoBusquedaProcesoBancoNomina=this.jCheckBoxgenera_textoBusquedaProcesoBancoNominaProcesoBancoNomina.isSelected();
		this.genera_excelBusquedaProcesoBancoNomina=this.jCheckBoxgenera_excelBusquedaProcesoBancoNominaProcesoBancoNomina.isSelected();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoBancoNomina(Boolean esInicializar) throws Exception {				
		if(ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoBancoNomina();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoBancoNomina() throws Exception {
		this.inicializarActualizarBindingTablaProcesoBancoNomina(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoBancoNomina() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoBancoNomina.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoBancoNomina.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoBancoNomina.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoBancoNominaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoBancoNomina.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoBancoNomina.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoBancoNominaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoBancoNominaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoBancoNominaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoBancoNominaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoBancoNomina.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoBancoNomina.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoBancoNominaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoBancoNomina.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoBancoNomina(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesobanconominaLogic.getProcesoBancoNominas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesobanconominas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoBancoNomina.setModel(new ProcesoBancoNominaModel(this.procesobanconominaLogic.getProcesoBancoNominas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoBancoNomina.setModel(new ProcesoBancoNominaModel(this.procesobanconominas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoBancoNomina!=null && this.jInternalFrameOrderByProcesoBancoNomina.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoBancoNomina();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoBancoNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoBancoNomina,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoBancoNominaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO,procesobanconominaConstantesFunciones.resaltarSeleccionarProcesoBancoNomina,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO,procesobanconominaConstantesFunciones.resaltarSeleccionarProcesoBancoNomina,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoBancoNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoBancoNomina,ProcesoBancoNominaConstantesFunciones.LABEL_ID));

		if(this.procesobanconominaConstantesFunciones.mostraridProcesoBancoNomina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoBancoNominaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesobanconominaConstantesFunciones.resaltaridProcesoBancoNomina,this.procesobanconominaConstantesFunciones.activaridProcesoBancoNomina,this,true,"idProcesoBancoNomina","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesobanconominaConstantesFunciones.resaltaridProcesoBancoNomina,this.procesobanconominaConstantesFunciones.activaridProcesoBancoNomina,this,true,"idProcesoBancoNomina","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoBancoNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoBancoNomina,ProcesoBancoNominaConstantesFunciones.LABEL_IDBANCO));

		if(this.procesobanconominaConstantesFunciones.mostrarid_bancoProcesoBancoNomina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoBancoNominaConstantesFunciones.LABEL_IDBANCO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BancoTableCell(this.bancosForeignKey,this.procesobanconominaConstantesFunciones.resaltarid_bancoProcesoBancoNomina,this,this.procesobanconominaConstantesFunciones.activarid_bancoProcesoBancoNomina));
			tableColumn.setCellEditor(new BancoTableCell(this.bancosForeignKey,this.procesobanconominaConstantesFunciones.resaltarid_bancoProcesoBancoNomina,this,this.procesobanconominaConstantesFunciones.activarid_bancoProcesoBancoNomina,true,"id_bancoProcesoBancoNomina","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoBancoNominaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoBancoNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoBancoNomina,ProcesoBancoNominaConstantesFunciones.LABEL_IDCUENTABANCO));

		if(this.procesobanconominaConstantesFunciones.mostrarid_cuenta_bancoProcesoBancoNomina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoBancoNominaConstantesFunciones.LABEL_IDCUENTABANCO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaBancoTableCell(this.cuentabancosForeignKey,this.procesobanconominaConstantesFunciones.resaltarid_cuenta_bancoProcesoBancoNomina,this,this.procesobanconominaConstantesFunciones.activarid_cuenta_bancoProcesoBancoNomina));
			tableColumn.setCellEditor(new CuentaBancoTableCell(this.cuentabancosForeignKey,this.procesobanconominaConstantesFunciones.resaltarid_cuenta_bancoProcesoBancoNomina,this,this.procesobanconominaConstantesFunciones.activarid_cuenta_bancoProcesoBancoNomina,true,"id_cuenta_bancoProcesoBancoNomina","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoBancoNominaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoBancoNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoBancoNomina,ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOCONTRATO));

		if(this.procesobanconominaConstantesFunciones.mostrarid_tipo_contratoProcesoBancoNomina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOCONTRATO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoContratoTableCell(this.tipocontratosForeignKey,this.procesobanconominaConstantesFunciones.resaltarid_tipo_contratoProcesoBancoNomina,this,this.procesobanconominaConstantesFunciones.activarid_tipo_contratoProcesoBancoNomina));
			tableColumn.setCellEditor(new TipoContratoTableCell(this.tipocontratosForeignKey,this.procesobanconominaConstantesFunciones.resaltarid_tipo_contratoProcesoBancoNomina,this,this.procesobanconominaConstantesFunciones.activarid_tipo_contratoProcesoBancoNomina,true,"id_tipo_contratoProcesoBancoNomina","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoBancoNominaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoBancoNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoBancoNomina,ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOBANCODISCO));

		if(this.procesobanconominaConstantesFunciones.mostrarid_tipo_banco_discoProcesoBancoNomina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOBANCODISCO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoBancoDiscoTableCell(this.tipobancodiscosForeignKey,this.procesobanconominaConstantesFunciones.resaltarid_tipo_banco_discoProcesoBancoNomina,this,this.procesobanconominaConstantesFunciones.activarid_tipo_banco_discoProcesoBancoNomina));
			tableColumn.setCellEditor(new TipoBancoDiscoTableCell(this.tipobancodiscosForeignKey,this.procesobanconominaConstantesFunciones.resaltarid_tipo_banco_discoProcesoBancoNomina,this,this.procesobanconominaConstantesFunciones.activarid_tipo_banco_discoProcesoBancoNomina,true,"id_tipo_banco_discoProcesoBancoNomina","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoBancoNominaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoBancoNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoBancoNomina,ProcesoBancoNominaConstantesFunciones.LABEL_CONOTROS));

		if(this.procesobanconominaConstantesFunciones.mostrarcon_otrosProcesoBancoNomina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoBancoNominaConstantesFunciones.LABEL_CONOTROS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.procesobanconominaConstantesFunciones.resaltarcon_otrosProcesoBancoNomina,this.procesobanconominaConstantesFunciones.activarcon_otrosProcesoBancoNomina));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.procesobanconominaConstantesFunciones.resaltarcon_otrosProcesoBancoNomina,this.procesobanconominaConstantesFunciones.activarcon_otrosProcesoBancoNomina,this,true,"con_otrosProcesoBancoNomina","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoBancoNominaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoBancoNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoBancoNomina,ProcesoBancoNominaConstantesFunciones.LABEL_CONINTERNET));

		if(this.procesobanconominaConstantesFunciones.mostrarcon_internetProcesoBancoNomina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoBancoNominaConstantesFunciones.LABEL_CONINTERNET,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.procesobanconominaConstantesFunciones.resaltarcon_internetProcesoBancoNomina,this.procesobanconominaConstantesFunciones.activarcon_internetProcesoBancoNomina));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.procesobanconominaConstantesFunciones.resaltarcon_internetProcesoBancoNomina,this.procesobanconominaConstantesFunciones.activarcon_internetProcesoBancoNomina,this,true,"con_internetProcesoBancoNomina","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoBancoNominaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoBancoNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoBancoNomina,ProcesoBancoNominaConstantesFunciones.LABEL_FECHA));

		if(this.procesobanconominaConstantesFunciones.mostrarfechaProcesoBancoNomina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoBancoNominaConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.procesobanconominaConstantesFunciones.resaltarfechaProcesoBancoNomina,this.procesobanconominaConstantesFunciones.activarfechaProcesoBancoNomina,this,true,"fechaProcesoBancoNomina","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.procesobanconominaConstantesFunciones.resaltarfechaProcesoBancoNomina,this.procesobanconominaConstantesFunciones.activarfechaProcesoBancoNomina,this,true,"fechaProcesoBancoNomina","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ProcesoBancoNominaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoBancoNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoBancoNomina,ProcesoBancoNominaConstantesFunciones.LABEL_NUMEROSECUENCIALES));

		if(this.procesobanconominaConstantesFunciones.mostrarnumero_secuencialesProcesoBancoNomina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoBancoNominaConstantesFunciones.LABEL_NUMEROSECUENCIALES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesobanconominaConstantesFunciones.resaltarnumero_secuencialesProcesoBancoNomina,this.procesobanconominaConstantesFunciones.activarnumero_secuencialesProcesoBancoNomina,this,true,"numero_secuencialesProcesoBancoNomina","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesobanconominaConstantesFunciones.resaltarnumero_secuencialesProcesoBancoNomina,this.procesobanconominaConstantesFunciones.activarnumero_secuencialesProcesoBancoNomina,this,true,"numero_secuencialesProcesoBancoNomina","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoBancoNominaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoBancoNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoBancoNomina,ProcesoBancoNominaConstantesFunciones.LABEL_GENERATEXTO));

		if(this.procesobanconominaConstantesFunciones.mostrargenera_textoProcesoBancoNomina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoBancoNominaConstantesFunciones.LABEL_GENERATEXTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.procesobanconominaConstantesFunciones.resaltargenera_textoProcesoBancoNomina,this.procesobanconominaConstantesFunciones.activargenera_textoProcesoBancoNomina));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.procesobanconominaConstantesFunciones.resaltargenera_textoProcesoBancoNomina,this.procesobanconominaConstantesFunciones.activargenera_textoProcesoBancoNomina,this,true,"genera_textoProcesoBancoNomina","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoBancoNominaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoBancoNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoBancoNomina,ProcesoBancoNominaConstantesFunciones.LABEL_GENERAEXCEL));

		if(this.procesobanconominaConstantesFunciones.mostrargenera_excelProcesoBancoNomina && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoBancoNominaConstantesFunciones.LABEL_GENERAEXCEL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.procesobanconominaConstantesFunciones.resaltargenera_excelProcesoBancoNomina,this.procesobanconominaConstantesFunciones.activargenera_excelProcesoBancoNomina));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.procesobanconominaConstantesFunciones.resaltargenera_excelProcesoBancoNomina,this.procesobanconominaConstantesFunciones.activargenera_excelProcesoBancoNomina,this,true,"genera_excelProcesoBancoNomina","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoBancoNominaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesobanconominaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesobanconominaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesobanconominaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoBancoNomina.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesobanconominaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesobanconominaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoBancoNomina.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoBancoNomina && this.isPermisoGuardarCambiosProcesoBancoNomina) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesobanconominaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesobanconominaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoBancoNomina.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoBancoNomina.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoBancoNomina && this.isPermisoGuardarCambiosProcesoBancoNomina) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoBancoNomina && this.isPermisoGuardarCambiosProcesoBancoNomina) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoBancoNomina.moveColumn(this.jTableDatosProcesoBancoNomina.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoBancoNomina.moveColumn(this.jTableDatosProcesoBancoNomina.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoBancoNomina.moveColumn(this.jTableDatosProcesoBancoNomina.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoBancoNomina.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoBancoNomina.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoBancoNomina,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoBancoNomina.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoBancoNomina.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoBancoNomina.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoBancoNomina.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoBancoNomina.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesobanconominaLogic.getProcesoBancoNominas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesobanconominas.size()-1;
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
		//this.jTableDatosProcesoBancoNomina.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoBancoNomina.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoBancoNomina();
			
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
				
				//this.isEsNuevoProcesoBancoNomina=false;
					
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
			
				if(this.procesobanconominaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoBancoNomina==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoBancoNomina.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoBancoNomina.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesobanconomina.getsType().equals("DUPLICADO")
				   || this.procesobanconomina.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoBancoNomina=true;
				
				} else {
					this.isEsNuevoProcesoBancoNomina=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {
					if(this.procesobanconomina.getId()>=0 && !this.procesobanconomina.getIsNew()) {						
						this.isEsNuevoProcesoBancoNomina=false;
						
					} else {
						this.isEsNuevoProcesoBancoNomina=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoBancoNomina(esRelaciones);						
				
				this.seleccionarProcesoBancoNomina(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesobanconomina.getId()<0) {
					this.isEsNuevoProcesoBancoNomina=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoBancoNomina(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoBancoNomina(evt,rowIndex);
				}	
				
				if(this.procesobanconominaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoBancoNomina: " + this.dDif); 
					}
				}								
				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoBancoNomina(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesobanconomina)) {
					if(this.procesobanconomina.getId()>0) {
						this.procesobanconomina.setIsDeleted(true);
						
						this.procesobanconominasEliminados.add(this.procesobanconomina);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesobanconominaLogic.getProcesoBancoNominas().remove(this.procesobanconomina);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesobanconominas.remove(this.procesobanconomina);				
					}
					
					
					((ProcesoBancoNominaModel) this.jTableDatosProcesoBancoNomina.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoBancoNomina(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoBancoNomina(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoBancoNomina) {
			
			if(this.jInternalFrameDetalleFormProcesoBancoNomina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoBancoNomina.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoBancoNomina.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoBancoNomina(this.procesobanconomina);
				}
				
				//ARCHITECTURE
				try {
					

					//Banco
					if(!this.procesobanconominaConstantesFunciones.cargarid_bancoProcesoBancoNomina || this.procesobanconominaConstantesFunciones.event_dependid_bancoProcesoBancoNomina) {
						//this.cargarCombosBancosForeignKeyLista(" where id="+this.procesobanconomina.getid_banco());
									//this.inicializarActualizarBindingProcesoBancoNomina(false,false);
						this.bancosForeignKey=new ArrayList<Banco>();

						if(procesobanconomina.getBanco()!=null) {
							this.bancosForeignKey.add(procesobanconomina.getBanco());
						}

						this.addItemDefectoCombosForeignKeyBanco();
						this.cargarCombosFrameBancosForeignKey("Todos");
					}
					this.setActualBancoForeignKey(this.procesobanconomina.getid_banco(),false,"Formulario");

					//CuentaBanco
					if(!this.procesobanconominaConstantesFunciones.cargarid_cuenta_bancoProcesoBancoNomina || this.procesobanconominaConstantesFunciones.event_dependid_cuenta_bancoProcesoBancoNomina) {
						//this.cargarCombosCuentaBancosForeignKeyLista(" where id="+this.procesobanconomina.getid_cuenta_banco());
									//this.inicializarActualizarBindingProcesoBancoNomina(false,false);
						this.cuentabancosForeignKey=new ArrayList<CuentaBanco>();

						if(procesobanconomina.getCuentaBanco()!=null) {
							this.cuentabancosForeignKey.add(procesobanconomina.getCuentaBanco());
						}

						this.addItemDefectoCombosForeignKeyCuentaBanco();
						this.cargarCombosFrameCuentaBancosForeignKey("Todos");
					}
					this.setActualCuentaBancoForeignKey(this.procesobanconomina.getid_cuenta_banco(),false,"Formulario");

					//TipoContrato
					if(!this.procesobanconominaConstantesFunciones.cargarid_tipo_contratoProcesoBancoNomina || this.procesobanconominaConstantesFunciones.event_dependid_tipo_contratoProcesoBancoNomina) {
						//this.cargarCombosTipoContratosForeignKeyLista(" where id="+this.procesobanconomina.getid_tipo_contrato());
									//this.inicializarActualizarBindingProcesoBancoNomina(false,false);
						this.tipocontratosForeignKey=new ArrayList<TipoContrato>();

						if(procesobanconomina.getTipoContrato()!=null) {
							this.tipocontratosForeignKey.add(procesobanconomina.getTipoContrato());
						}

						this.addItemDefectoCombosForeignKeyTipoContrato();
						this.cargarCombosFrameTipoContratosForeignKey("Todos");
					}
					this.setActualTipoContratoForeignKey(this.procesobanconomina.getid_tipo_contrato(),false,"Formulario");

					//TipoBancoDisco
					if(!this.procesobanconominaConstantesFunciones.cargarid_tipo_banco_discoProcesoBancoNomina || this.procesobanconominaConstantesFunciones.event_dependid_tipo_banco_discoProcesoBancoNomina) {
						//this.cargarCombosTipoBancoDiscosForeignKeyLista(" where id="+this.procesobanconomina.getid_tipo_banco_disco());
									//this.inicializarActualizarBindingProcesoBancoNomina(false,false);
						this.tipobancodiscosForeignKey=new ArrayList<TipoBancoDisco>();

						if(procesobanconomina.getTipoBancoDisco()!=null) {
							this.tipobancodiscosForeignKey.add(procesobanconomina.getTipoBancoDisco());
						}

						this.addItemDefectoCombosForeignKeyTipoBancoDisco();
						this.cargarCombosFrameTipoBancoDiscosForeignKey("Todos");
					}
					this.setActualTipoBancoDiscoForeignKey(this.procesobanconomina.getid_tipo_banco_disco(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoBancoNomina("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoBancoNomina(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoBancoNomina() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoBancoNomina(ProcesoBancoNomina procesobanconomina) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoBancoNomina(procesobanconomina,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoBancoNomina(ProcesoBancoNomina procesobanconomina,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoBancoNomina(procesobanconomina);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoBancoNomina(procesobanconomina,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoBancoNomina(procesobanconomina);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoBancoNomina(ProcesoBancoNomina procesobanconomina) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoBancoNomina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoBancoNomina.jTextFieldidProcesoBancoNomina.setText(procesobanconomina.getId().toString());
			this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxcon_otrosProcesoBancoNomina.setSelected(procesobanconomina.getcon_otros());
			this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxcon_internetProcesoBancoNomina.setSelected(procesobanconomina.getcon_internet());
			this.jInternalFrameDetalleFormProcesoBancoNomina.jDateChooserfechaProcesoBancoNomina.setDate(procesobanconomina.getfecha());
			this.jInternalFrameDetalleFormProcesoBancoNomina.jTextFieldnumero_secuencialesProcesoBancoNomina.setText(procesobanconomina.getnumero_secuenciales().toString());
			this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxgenera_textoProcesoBancoNomina.setSelected(procesobanconomina.getgenera_texto());
			this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxgenera_excelProcesoBancoNomina.setSelected(procesobanconomina.getgenera_excel());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoBancoNomina procesobanconominaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesobanconominaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoBancoNomina procesobanconominaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesobanconominaLocal=this.procesobanconomina;
			} else {
				procesobanconominaLocal=this.procesobanconominaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesobanconominaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoBancoNomina(procesobanconominaLocal,true);
					
					if(procesobanconominaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesobanconominaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesobanconominaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoBancoNomina(ProcesoBancoNomina procesobanconomina,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoBancoNomina(procesobanconomina,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(procesobanconomina);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoBancoNomina(ProcesoBancoNomina procesobanconomina,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoBancoNomina(procesobanconomina,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoBancoNomina(ProcesoBancoNomina procesobanconomina,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoBancoNomina==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoBancoNomina.jTextFieldidProcesoBancoNomina.getText()==null || this.jInternalFrameDetalleFormProcesoBancoNomina.jTextFieldidProcesoBancoNomina.getText()=="" || this.jInternalFrameDetalleFormProcesoBancoNomina.jTextFieldidProcesoBancoNomina.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoBancoNomina.jTextFieldidProcesoBancoNomina.setText("0");
			}

			if(conColumnasBase) {procesobanconomina.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoBancoNomina.jTextFieldidProcesoBancoNomina.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoBancoNominaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelIdProcesoBancoNomina,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesobanconomina.setcon_otros(this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxcon_otrosProcesoBancoNomina.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoBancoNominaConstantesFunciones.LABEL_CONOTROS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelcon_otrosProcesoBancoNomina,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesobanconomina.setcon_internet(this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxcon_internetProcesoBancoNomina.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoBancoNominaConstantesFunciones.LABEL_CONINTERNET+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelcon_internetProcesoBancoNomina,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesobanconomina.setfecha(this.jInternalFrameDetalleFormProcesoBancoNomina.jDateChooserfechaProcesoBancoNomina.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoBancoNominaConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelfechaProcesoBancoNomina,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesobanconomina.setnumero_secuenciales(Integer.parseInt(this.jInternalFrameDetalleFormProcesoBancoNomina.jTextFieldnumero_secuencialesProcesoBancoNomina.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoBancoNominaConstantesFunciones.LABEL_NUMEROSECUENCIALES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelnumero_secuencialesProcesoBancoNomina,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesobanconomina.setgenera_texto(this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxgenera_textoProcesoBancoNomina.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoBancoNominaConstantesFunciones.LABEL_GENERATEXTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelgenera_textoProcesoBancoNomina,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesobanconomina.setgenera_excel(this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxgenera_excelProcesoBancoNomina.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoBancoNominaConstantesFunciones.LABEL_GENERAEXCEL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoBancoNomina.jLabelgenera_excelProcesoBancoNomina,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoBancoNomina(ProcesoBancoNomina procesobanconominaBean,ProcesoBancoNomina procesobanconomina,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && procesobanconominaBean.getid_banco()!=null && !procesobanconominaBean.getid_banco().equals(-1L))) {procesobanconomina.setid_banco(procesobanconominaBean.getid_banco());}
			if(conDefault || (!conDefault && procesobanconominaBean.getid_cuenta_banco()!=null && !procesobanconominaBean.getid_cuenta_banco().equals(-1L))) {procesobanconomina.setid_cuenta_banco(procesobanconominaBean.getid_cuenta_banco());}
			if(conDefault || (!conDefault && procesobanconominaBean.getid_tipo_contrato()!=null && !procesobanconominaBean.getid_tipo_contrato().equals(-1L))) {procesobanconomina.setid_tipo_contrato(procesobanconominaBean.getid_tipo_contrato());}
			if(conDefault || (!conDefault && procesobanconominaBean.getid_tipo_banco_disco()!=null && !procesobanconominaBean.getid_tipo_banco_disco().equals(-1L))) {procesobanconomina.setid_tipo_banco_disco(procesobanconominaBean.getid_tipo_banco_disco());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoBancoNomina(ProcesoBancoNomina procesobanconominaOrigen,ProcesoBancoNomina procesobanconomina,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesobanconominaOrigen.getId()!=null && !procesobanconominaOrigen.getId().equals(0L))) {procesobanconomina.setId(procesobanconominaOrigen.getId());}}
			if(conDefault || (!conDefault && procesobanconominaOrigen.getid_banco()!=null && !procesobanconominaOrigen.getid_banco().equals(-1L))) {procesobanconomina.setid_banco(procesobanconominaOrigen.getid_banco());}
			if(conDefault || (!conDefault && procesobanconominaOrigen.getid_cuenta_banco()!=null && !procesobanconominaOrigen.getid_cuenta_banco().equals(-1L))) {procesobanconomina.setid_cuenta_banco(procesobanconominaOrigen.getid_cuenta_banco());}
			if(conDefault || (!conDefault && procesobanconominaOrigen.getid_tipo_contrato()!=null && !procesobanconominaOrigen.getid_tipo_contrato().equals(-1L))) {procesobanconomina.setid_tipo_contrato(procesobanconominaOrigen.getid_tipo_contrato());}
			if(conDefault || (!conDefault && procesobanconominaOrigen.getid_tipo_banco_disco()!=null && !procesobanconominaOrigen.getid_tipo_banco_disco().equals(-1L))) {procesobanconomina.setid_tipo_banco_disco(procesobanconominaOrigen.getid_tipo_banco_disco());}
			if(conDefault || (!conDefault && procesobanconominaOrigen.getcon_otros()!=null && !procesobanconominaOrigen.getcon_otros().equals(false))) {procesobanconomina.setcon_otros(procesobanconominaOrigen.getcon_otros());}
			if(conDefault || (!conDefault && procesobanconominaOrigen.getcon_internet()!=null && !procesobanconominaOrigen.getcon_internet().equals(false))) {procesobanconomina.setcon_internet(procesobanconominaOrigen.getcon_internet());}
			if(conDefault || (!conDefault && procesobanconominaOrigen.getfecha()!=null && !procesobanconominaOrigen.getfecha().equals(new Date()))) {procesobanconomina.setfecha(procesobanconominaOrigen.getfecha());}
			if(conDefault || (!conDefault && procesobanconominaOrigen.getnumero_secuenciales()!=null && !procesobanconominaOrigen.getnumero_secuenciales().equals(0))) {procesobanconomina.setnumero_secuenciales(procesobanconominaOrigen.getnumero_secuenciales());}
			if(conDefault || (!conDefault && procesobanconominaOrigen.getgenera_texto()!=null && !procesobanconominaOrigen.getgenera_texto().equals(false))) {procesobanconomina.setgenera_texto(procesobanconominaOrigen.getgenera_texto());}
			if(conDefault || (!conDefault && procesobanconominaOrigen.getgenera_excel()!=null && !procesobanconominaOrigen.getgenera_excel().equals(false))) {procesobanconomina.setgenera_excel(procesobanconominaOrigen.getgenera_excel());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoBancoNomina(ProcesoBancoNomina procesobanconomina) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoBancoNomina.jTextFieldidProcesoBancoNomina.setText(procesobanconomina.getId().toString());
			this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxcon_otrosProcesoBancoNomina.setSelected(procesobanconomina.getcon_otros());
			this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxcon_internetProcesoBancoNomina.setSelected(procesobanconomina.getcon_internet());
			this.jInternalFrameDetalleFormProcesoBancoNomina.jDateChooserfechaProcesoBancoNomina.setDate(procesobanconomina.getfecha());
			this.jInternalFrameDetalleFormProcesoBancoNomina.jTextFieldnumero_secuencialesProcesoBancoNomina.setText(procesobanconomina.getnumero_secuenciales().toString());
			this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxgenera_textoProcesoBancoNomina.setSelected(procesobanconomina.getgenera_texto());
			this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxgenera_excelProcesoBancoNomina.setSelected(procesobanconomina.getgenera_excel());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoBancoNomina(ProcesoBancoNominaBean procesobanconominaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoBancoNomina.jTextFieldidProcesoBancoNomina.setText(procesobanconominaBean.getId().toString());
			this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxcon_otrosProcesoBancoNomina.setSelected(procesobanconominaBean.getcon_otros());
			this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxcon_internetProcesoBancoNomina.setSelected(procesobanconominaBean.getcon_internet());
			this.jInternalFrameDetalleFormProcesoBancoNomina.jDateChooserfechaProcesoBancoNomina.setDate(procesobanconominaBean.getfecha());
			this.jInternalFrameDetalleFormProcesoBancoNomina.jTextFieldnumero_secuencialesProcesoBancoNomina.setText(procesobanconominaBean.getnumero_secuenciales().toString());
			this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxgenera_textoProcesoBancoNomina.setSelected(procesobanconominaBean.getgenera_texto());
			this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxgenera_excelProcesoBancoNomina.setSelected(procesobanconominaBean.getgenera_excel());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoBancoNomina(ProcesoBancoNominaParameterReturnGeneral procesobanconominaReturnGeneral,ProcesoBancoNominaBean procesobanconominaBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoBancoNomina procesobanconominaLocal=new ProcesoBancoNomina();
			
			procesobanconominaLocal=procesobanconominaReturnGeneral.getProcesoBancoNomina();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesobanconominaLocal.getId()!=null && !procesobanconominaLocal.getId().equals(0L))) {procesobanconominaBean.setId(procesobanconominaLocal.getId());}}
			if(conDefault || (!conDefault && procesobanconominaLocal.getid_banco()!=null && !procesobanconominaLocal.getid_banco().equals(-1L))) {procesobanconominaBean.setid_banco(procesobanconominaLocal.getid_banco());}
			if(conDefault || (!conDefault && procesobanconominaLocal.getid_cuenta_banco()!=null && !procesobanconominaLocal.getid_cuenta_banco().equals(-1L))) {procesobanconominaBean.setid_cuenta_banco(procesobanconominaLocal.getid_cuenta_banco());}
			if(conDefault || (!conDefault && procesobanconominaLocal.getid_tipo_contrato()!=null && !procesobanconominaLocal.getid_tipo_contrato().equals(-1L))) {procesobanconominaBean.setid_tipo_contrato(procesobanconominaLocal.getid_tipo_contrato());}
			if(conDefault || (!conDefault && procesobanconominaLocal.getid_tipo_banco_disco()!=null && !procesobanconominaLocal.getid_tipo_banco_disco().equals(-1L))) {procesobanconominaBean.setid_tipo_banco_disco(procesobanconominaLocal.getid_tipo_banco_disco());}
			if(conDefault || (!conDefault && procesobanconominaLocal.getcon_otros()!=null && !procesobanconominaLocal.getcon_otros().equals(false))) {procesobanconominaBean.setcon_otros(procesobanconominaLocal.getcon_otros());}
			if(conDefault || (!conDefault && procesobanconominaLocal.getcon_internet()!=null && !procesobanconominaLocal.getcon_internet().equals(false))) {procesobanconominaBean.setcon_internet(procesobanconominaLocal.getcon_internet());}
			if(conDefault || (!conDefault && procesobanconominaLocal.getfecha()!=null && !procesobanconominaLocal.getfecha().equals(new Date()))) {procesobanconominaBean.setfecha(procesobanconominaLocal.getfecha());}
			if(conDefault || (!conDefault && procesobanconominaLocal.getnumero_secuenciales()!=null && !procesobanconominaLocal.getnumero_secuenciales().equals(0))) {procesobanconominaBean.setnumero_secuenciales(procesobanconominaLocal.getnumero_secuenciales());}
			if(conDefault || (!conDefault && procesobanconominaLocal.getgenera_texto()!=null && !procesobanconominaLocal.getgenera_texto().equals(false))) {procesobanconominaBean.setgenera_texto(procesobanconominaLocal.getgenera_texto());}
			if(conDefault || (!conDefault && procesobanconominaLocal.getgenera_excel()!=null && !procesobanconominaLocal.getgenera_excel().equals(false))) {procesobanconominaBean.setgenera_excel(procesobanconominaLocal.getgenera_excel());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoBancoNominaGenerico(Long idProcesoBancoNominaSeleccionado,JComboBox jComboBoxProcesoBancoNomina,List<ProcesoBancoNomina> procesobanconominasLocal)throws Exception {
		try {
			ProcesoBancoNomina  procesobanconominaTemp=null;

			for(ProcesoBancoNomina procesobanconominaAux:procesobanconominasLocal) {
				if(procesobanconominaAux.getId()!=null && procesobanconominaAux.getId().equals(idProcesoBancoNominaSeleccionado)) {
					procesobanconominaTemp=procesobanconominaAux;
					break;
				}
			}

			jComboBoxProcesoBancoNomina.setSelectedItem(procesobanconominaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoBancoNominaGenerico(JComboBox jComboBoxProcesoBancoNomina,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoBancoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoBancoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoBancoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoBancoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoBancoNomina.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoBancoNomina.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoBancoNomina.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoBancoNomina.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoBancoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoBancoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesobanconomina=(ProcesoBancoNomina) procesobanconominaLogic.getProcesoBancoNominas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesobanconomina =(ProcesoBancoNomina) procesobanconominas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Banco")) {
			//sDescripcion=this.getActualBancoForeignKeyDescripcion((Long)value);
			if(!procesobanconomina.getIsNew() && !procesobanconomina.getIsChanged() && !procesobanconomina.getIsDeleted()) {
				sDescripcion=procesobanconomina.getbanco_descripcion();
			} else {
				//sDescripcion=this.getActualBancoForeignKeyDescripcion((Long)value);
				sDescripcion=procesobanconomina.getbanco_descripcion();
			}
		}

		if(sTipo.equals("CuentaBanco")) {
			//sDescripcion=this.getActualCuentaBancoForeignKeyDescripcion((Long)value);
			if(!procesobanconomina.getIsNew() && !procesobanconomina.getIsChanged() && !procesobanconomina.getIsDeleted()) {
				sDescripcion=procesobanconomina.getcuentabanco_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaBancoForeignKeyDescripcion((Long)value);
				sDescripcion=procesobanconomina.getcuentabanco_descripcion();
			}
		}

		if(sTipo.equals("TipoContrato")) {
			//sDescripcion=this.getActualTipoContratoForeignKeyDescripcion((Long)value);
			if(!procesobanconomina.getIsNew() && !procesobanconomina.getIsChanged() && !procesobanconomina.getIsDeleted()) {
				sDescripcion=procesobanconomina.gettipocontrato_descripcion();
			} else {
				//sDescripcion=this.getActualTipoContratoForeignKeyDescripcion((Long)value);
				sDescripcion=procesobanconomina.gettipocontrato_descripcion();
			}
		}

		if(sTipo.equals("TipoBancoDisco")) {
			//sDescripcion=this.getActualTipoBancoDiscoForeignKeyDescripcion((Long)value);
			if(!procesobanconomina.getIsNew() && !procesobanconomina.getIsChanged() && !procesobanconomina.getIsDeleted()) {
				sDescripcion=procesobanconomina.gettipobancodisco_descripcion();
			} else {
				//sDescripcion=this.getActualTipoBancoDiscoForeignKeyDescripcion((Long)value);
				sDescripcion=procesobanconomina.gettipobancodisco_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoBancoNomina procesobanconominaRow=new ProcesoBancoNomina();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesobanconominaRow=(ProcesoBancoNomina) procesobanconominaLogic.getProcesoBancoNominas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesobanconominaRow=(ProcesoBancoNomina) procesobanconominas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoBancoNomina(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoBancoNomina.setVisible((this.isVisibilidadCeldaNuevoProcesoBancoNomina && this.isPermisoNuevoProcesoBancoNomina));			
			this.jButtonDuplicarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaDuplicarProcesoBancoNomina && this.isPermisoDuplicarProcesoBancoNomina));			
			this.jButtonCopiarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaCopiarProcesoBancoNomina && this.isPermisoCopiarProcesoBancoNomina));
			this.jButtonVerFormProcesoBancoNomina.setVisible((this.isVisibilidadCeldaVerFormProcesoBancoNomina && this.isPermisoVerFormProcesoBancoNomina));
			
			this.jButtonAbrirOrderByProcesoBancoNomina.setVisible((this.isVisibilidadCeldaOrdenProcesoBancoNomina && this.isPermisoOrdenProcesoBancoNomina));			
			
			this.jButtonNuevoRelacionesProcesoBancoNomina.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina && this.isPermisoNuevoProcesoBancoNomina));			
			this.jButtonNuevoGuardarCambiosProcesoBancoNomina.setVisible((this.isVisibilidadCeldaNuevoProcesoBancoNomina && this.isPermisoNuevoProcesoBancoNomina && this.isPermisoGuardarCambiosProcesoBancoNomina));
			
			if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonModificarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaModificarProcesoBancoNomina && this.isPermisoActualizarProcesoBancoNomina));	
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonActualizarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaActualizarProcesoBancoNomina && this.isPermisoActualizarProcesoBancoNomina));	
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonEliminarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaEliminarProcesoBancoNomina && this.isPermisoEliminarProcesoBancoNomina));
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonCancelarProcesoBancoNomina.setVisible(this.isVisibilidadCeldaCancelarProcesoBancoNomina);							
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonGuardarCambiosProcesoBancoNomina.setVisible((this.isVisibilidadCeldaGuardarProcesoBancoNomina && this.isPermisoGuardarCambiosProcesoBancoNomina));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoBancoNomina.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoBancoNomina && this.isPermisoGuardarCambiosProcesoBancoNomina));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaNuevoProcesoBancoNomina && this.isPermisoNuevoProcesoBancoNomina));						
			this.jButtonDuplicarToolBarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaDuplicarProcesoBancoNomina && this.isPermisoDuplicarProcesoBancoNomina));						
			this.jButtonCopiarToolBarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaCopiarProcesoBancoNomina && this.isPermisoCopiarProcesoBancoNomina));			
			this.jButtonVerFormToolBarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaVerFormProcesoBancoNomina && this.isPermisoVerFormProcesoBancoNomina));			
			this.jButtonAbrirOrderByToolBarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaOrdenProcesoBancoNomina && this.isPermisoOrdenProcesoBancoNomina));
			this.jButtonNuevoRelacionesToolBarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina && this.isPermisoNuevoProcesoBancoNomina));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaNuevoProcesoBancoNomina && this.isPermisoNuevoProcesoBancoNomina && this.isPermisoGuardarCambiosProcesoBancoNomina));			
			
			if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonModificarToolBarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaModificarProcesoBancoNomina && this.isPermisoActualizarProcesoBancoNomina));	
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonActualizarToolBarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaActualizarProcesoBancoNomina  && this.isPermisoActualizarProcesoBancoNomina));	
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonEliminarToolBarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaEliminarProcesoBancoNomina && this.isPermisoEliminarProcesoBancoNomina));
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonCancelarToolBarProcesoBancoNomina.setVisible(this.isVisibilidadCeldaCancelarProcesoBancoNomina);				
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonGuardarCambiosToolBarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaGuardarProcesoBancoNomina && this.isPermisoGuardarCambiosProcesoBancoNomina));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoBancoNomina && this.isPermisoGuardarCambiosProcesoBancoNomina));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoBancoNomina.setVisible((this.isVisibilidadCeldaNuevoProcesoBancoNomina && this.isPermisoNuevoProcesoBancoNomina));			
			this.jMenuItemDuplicarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaDuplicarProcesoBancoNomina && this.isPermisoDuplicarProcesoBancoNomina));			
			this.jMenuItemCopiarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaCopiarProcesoBancoNomina && this.isPermisoCopiarProcesoBancoNomina));			
			this.jMenuItemVerFormProcesoBancoNomina.setVisible((this.isVisibilidadCeldaVerFormProcesoBancoNomina && this.isPermisoVerFormProcesoBancoNomina));			
			this.jMenuItemAbrirOrderByProcesoBancoNomina.setVisible((this.isVisibilidadCeldaOrdenProcesoBancoNomina && this.isPermisoOrdenProcesoBancoNomina));			
			//this.jMenuItemMostrarOcultarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaOrdenProcesoBancoNomina && this.isPermisoOrdenProcesoBancoNomina));
			this.jMenuItemDetalleAbrirOrderByProcesoBancoNomina.setVisible((this.isVisibilidadCeldaOrdenProcesoBancoNomina && this.isPermisoOrdenProcesoBancoNomina));			
			//this.jMenuItemDetalleMostrarOcultarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaOrdenProcesoBancoNomina && this.isPermisoOrdenProcesoBancoNomina));			
			this.jMenuItemNuevoRelacionesProcesoBancoNomina.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina && this.isPermisoNuevoProcesoBancoNomina));			
			this.jMenuItemNuevoGuardarCambiosProcesoBancoNomina.setVisible((this.isVisibilidadCeldaNuevoProcesoBancoNomina && this.isPermisoNuevoProcesoBancoNomina && this.isPermisoGuardarCambiosProcesoBancoNomina));									
			
			if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
			this.jInternalFrameDetalleFormProcesoBancoNomina.jMenuItemModificarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaModificarProcesoBancoNomina && this.isPermisoActualizarProcesoBancoNomina));	
			this.jInternalFrameDetalleFormProcesoBancoNomina.jMenuItemActualizarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaActualizarProcesoBancoNomina && this.isPermisoActualizarProcesoBancoNomina));	
			this.jInternalFrameDetalleFormProcesoBancoNomina.jMenuItemEliminarProcesoBancoNomina.setVisible((this.isVisibilidadCeldaEliminarProcesoBancoNomina && this.isPermisoEliminarProcesoBancoNomina));
			this.jInternalFrameDetalleFormProcesoBancoNomina.jMenuItemCancelarProcesoBancoNomina.setVisible(this.isVisibilidadCeldaCancelarProcesoBancoNomina);				
			}
			
			this.jMenuItemGuardarCambiosProcesoBancoNomina.setVisible((this.isVisibilidadCeldaGuardarProcesoBancoNomina && this.isPermisoGuardarCambiosProcesoBancoNomina));						
			this.jMenuItemGuardarCambiosTablaProcesoBancoNomina.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoBancoNomina && this.isPermisoGuardarCambiosProcesoBancoNomina));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoBancoNomina=this.jButtonNuevoProcesoBancoNomina.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoBancoNomina=this.jButtonDuplicarProcesoBancoNomina.isVisible();
			this.isVisibilidadCeldaCopiarProcesoBancoNomina=this.jButtonCopiarProcesoBancoNomina.isVisible();
			this.isVisibilidadCeldaVerFormProcesoBancoNomina=this.jButtonVerFormProcesoBancoNomina.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoBancoNomina=this.jButtonAbrirOrderByProcesoBancoNomina.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina=this.jButtonNuevoRelacionesProcesoBancoNomina.isVisible();
			this.isVisibilidadCeldaModificarProcesoBancoNomina=this.jButtonModificarProcesoBancoNomina.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
			this.isVisibilidadCeldaActualizarProcesoBancoNomina=this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonActualizarProcesoBancoNomina.isVisible();
			this.isVisibilidadCeldaEliminarProcesoBancoNomina=this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonEliminarProcesoBancoNomina.isVisible();
			this.isVisibilidadCeldaCancelarProcesoBancoNomina=this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonCancelarProcesoBancoNomina.isVisible();
			this.isVisibilidadCeldaGuardarProcesoBancoNomina=this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonGuardarCambiosProcesoBancoNomina.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoBancoNomina=this.jButtonGuardarCambiosTablaProcesoBancoNomina.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoBancoNomina=this.jButtonNuevoToolBarProcesoBancoNomina.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina=this.jButtonNuevoRelacionesToolBarProcesoBancoNomina.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
			this.isVisibilidadCeldaModificarProcesoBancoNomina=this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonModificarToolBarProcesoBancoNomina.isVisible();
			this.isVisibilidadCeldaActualizarProcesoBancoNomina=this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonActualizarToolBarProcesoBancoNomina.isVisible();
			this.isVisibilidadCeldaEliminarProcesoBancoNomina=this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonEliminarToolBarProcesoBancoNomina.isVisible();
			this.isVisibilidadCeldaCancelarProcesoBancoNomina=this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonCancelarToolBarProcesoBancoNomina.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoBancoNomina=this.jButtonGuardarCambiosToolBarProcesoBancoNomina.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoBancoNomina=this.jButtonGuardarCambiosTablaToolBarProcesoBancoNomina.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoBancoNomina=this.jMenuItemNuevoProcesoBancoNomina.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina=this.jMenuItemNuevoRelacionesProcesoBancoNomina.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
			this.isVisibilidadCeldaModificarProcesoBancoNomina=this.jInternalFrameDetalleFormProcesoBancoNomina.jMenuItemModificarProcesoBancoNomina.isVisible();
			this.isVisibilidadCeldaActualizarProcesoBancoNomina=this.jInternalFrameDetalleFormProcesoBancoNomina.jMenuItemActualizarProcesoBancoNomina.isVisible();
			this.isVisibilidadCeldaEliminarProcesoBancoNomina=this.jInternalFrameDetalleFormProcesoBancoNomina.jMenuItemEliminarProcesoBancoNomina.isVisible();
			this.isVisibilidadCeldaCancelarProcesoBancoNomina=this.jInternalFrameDetalleFormProcesoBancoNomina.jMenuItemCancelarProcesoBancoNomina.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoBancoNomina=this.jMenuItemGuardarCambiosProcesoBancoNomina.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoBancoNomina=this.jMenuItemGuardarCambiosTablaProcesoBancoNomina.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoBancoNomina(Boolean esInicializar) {
		if(ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesobanconominaSessionBean.getConGuardarRelaciones()) {
				//if(this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoBancoNomina();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoBancoNomina(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoBancoNomina() {
		this.jButtonNuevoProcesoBancoNomina.setVisible(this.isPermisoNuevoProcesoBancoNomina);			
		this.jButtonDuplicarProcesoBancoNomina.setVisible(this.isPermisoDuplicarProcesoBancoNomina);			
		this.jButtonCopiarProcesoBancoNomina.setVisible(this.isPermisoCopiarProcesoBancoNomina);			
		this.jButtonVerFormProcesoBancoNomina.setVisible(this.isPermisoVerFormProcesoBancoNomina);			
		
		this.jButtonAbrirOrderByProcesoBancoNomina.setVisible(this.isPermisoOrdenProcesoBancoNomina);					
		
		this.jButtonNuevoRelacionesProcesoBancoNomina.setVisible(this.isPermisoNuevoProcesoBancoNomina);			
		
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonModificarProcesoBancoNomina.setVisible(this.isPermisoActualizarProcesoBancoNomina);	
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonActualizarProcesoBancoNomina.setVisible(this.isPermisoActualizarProcesoBancoNomina);	
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonEliminarProcesoBancoNomina.setVisible(this.isPermisoEliminarProcesoBancoNomina);
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonCancelarProcesoBancoNomina.setVisible(this.isVisibilidadCeldaCancelarProcesoBancoNomina);						
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonGuardarCambiosProcesoBancoNomina.setVisible(this.isPermisoGuardarCambiosProcesoBancoNomina);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoBancoNomina.setVisible(this.isPermisoActualizarProcesoBancoNomina);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoBancoNomina() {
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonModificarProcesoBancoNomina.setVisible(this.isPermisoActualizarProcesoBancoNomina);	
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonActualizarProcesoBancoNomina.setVisible(this.isPermisoActualizarProcesoBancoNomina);	
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonEliminarProcesoBancoNomina.setVisible(this.isPermisoEliminarProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonCancelarProcesoBancoNomina.setVisible(this.isVisibilidadCeldaCancelarProcesoBancoNomina);							
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonGuardarCambiosProcesoBancoNomina.setVisible((this.isVisibilidadCeldaGuardarProcesoBancoNomina && this.isPermisoGuardarCambiosProcesoBancoNomina));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoBancoNomina() {
		if(ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoBancoNomina();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoBancoNomina() {
	}
	
	public void jTableDatosProcesoBancoNominaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoBancoNomina(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoBancoNominaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.getprocesobanconomina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesobanconomina==null) {
						this.procesobanconomina = new ProcesoBancoNomina();
					}

					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.procesobanconomina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
				}

				if(this.procesobanconomina.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesobanconomina.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoBancoNomina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bancoProcesoBancoNominaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobanco=true;

			idTienePermisobanco=this.tienePermisosUsuarioEnPaginaWebProcesoBancoNomina(BancoConstantesFunciones.CLASSNAME);

			if(idTienePermisobanco) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoBancoNomina.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoBancoNomina.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.getprocesobanconomina(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);

				this.bancoBeanSwingJInternalFrame=new BancoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bancoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bancoBeanSwingJInternalFrame.getBancoLogic().setConnexion(this.procesobanconominaLogic.getConnexion());

				if(this.procesobanconomina.getid_banco()!=null) {
					this.bancoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bancoBeanSwingJInternalFrame.setIdActual(this.procesobanconomina.getid_banco());
					this.bancoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bancoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaBanco();
				}

				JInternalFrameBase jinternalFrame =this.bancoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoBancoNomina=(TitledBorder)this.jScrollPanelDatosProcesoBancoNomina.getBorder();
				TitledBorder titledBorderbanco=(TitledBorder)this.bancoBeanSwingJInternalFrame.jScrollPanelDatosBanco.getBorder();

				titledBorderbanco.setTitle(titledBorderProcesoBancoNomina.getTitle() + " -> Banco");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bancoProcesoBancoNominaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.getprocesobanconomina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesobanconomina==null) {
						this.procesobanconomina = new ProcesoBancoNomina();
					}

					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.procesobanconomina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
				}

				if(this.procesobanconomina.getid_banco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_banco = "+this.procesobanconomina.getid_banco().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoBancoNomina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_bancoProcesoBancoNominaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentabanco=true;

			idTienePermisocuentabanco=this.tienePermisosUsuarioEnPaginaWebProcesoBancoNomina(CuentaBancoConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentabanco) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoBancoNomina.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoBancoNomina.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.getprocesobanconomina(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);

				this.cuentabancoBeanSwingJInternalFrame=new CuentaBancoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentabancoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentabancoBeanSwingJInternalFrame.getCuentaBancoLogic().setConnexion(this.procesobanconominaLogic.getConnexion());

				if(this.procesobanconomina.getid_cuenta_banco()!=null) {
					this.cuentabancoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentabancoBeanSwingJInternalFrame.setIdActual(this.procesobanconomina.getid_cuenta_banco());
					this.cuentabancoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentabancoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentabancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaBanco();
				}

				JInternalFrameBase jinternalFrame =this.cuentabancoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoBancoNomina=(TitledBorder)this.jScrollPanelDatosProcesoBancoNomina.getBorder();
				TitledBorder titledBordercuentabanco=(TitledBorder)this.cuentabancoBeanSwingJInternalFrame.jScrollPanelDatosCuentaBanco.getBorder();

				titledBordercuentabanco.setTitle(titledBorderProcesoBancoNomina.getTitle() + " -> Cuenta Banco");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_bancoProcesoBancoNominaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.getprocesobanconomina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesobanconomina==null) {
						this.procesobanconomina = new ProcesoBancoNomina();
					}

					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.procesobanconomina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
				}

				if(this.procesobanconomina.getid_cuenta_banco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_banco = "+this.procesobanconomina.getid_cuenta_banco().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoBancoNomina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_contratoProcesoBancoNominaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocontrato=true;

			idTienePermisotipocontrato=this.tienePermisosUsuarioEnPaginaWebProcesoBancoNomina(TipoContratoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocontrato) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoBancoNomina.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoBancoNomina.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.getprocesobanconomina(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);

				this.tipocontratoBeanSwingJInternalFrame=new TipoContratoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocontratoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocontratoBeanSwingJInternalFrame.getTipoContratoLogic().setConnexion(this.procesobanconominaLogic.getConnexion());

				if(this.procesobanconomina.getid_tipo_contrato()!=null) {
					this.tipocontratoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocontratoBeanSwingJInternalFrame.setIdActual(this.procesobanconomina.getid_tipo_contrato());
					this.tipocontratoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocontratoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocontratoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoContrato();
				}

				JInternalFrameBase jinternalFrame =this.tipocontratoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoBancoNomina=(TitledBorder)this.jScrollPanelDatosProcesoBancoNomina.getBorder();
				TitledBorder titledBordertipocontrato=(TitledBorder)this.tipocontratoBeanSwingJInternalFrame.jScrollPanelDatosTipoContrato.getBorder();

				titledBordertipocontrato.setTitle(titledBorderProcesoBancoNomina.getTitle() + " -> Tipo Contrato");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_contratoProcesoBancoNominaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.getprocesobanconomina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesobanconomina==null) {
						this.procesobanconomina = new ProcesoBancoNomina();
					}

					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.procesobanconomina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
				}

				if(this.procesobanconomina.getid_tipo_contrato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_contrato = "+this.procesobanconomina.getid_tipo_contrato().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoBancoNomina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_banco_discoProcesoBancoNominaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipobancodisco=true;

			idTienePermisotipobancodisco=this.tienePermisosUsuarioEnPaginaWebProcesoBancoNomina(TipoBancoDiscoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipobancodisco) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoBancoNomina.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoBancoNomina.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.getprocesobanconomina(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);

				this.tipobancodiscoBeanSwingJInternalFrame=new TipoBancoDiscoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipobancodiscoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipobancodiscoBeanSwingJInternalFrame.getTipoBancoDiscoLogic().setConnexion(this.procesobanconominaLogic.getConnexion());

				if(this.procesobanconomina.getid_tipo_banco_disco()!=null) {
					this.tipobancodiscoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipobancodiscoBeanSwingJInternalFrame.setIdActual(this.procesobanconomina.getid_tipo_banco_disco());
					this.tipobancodiscoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipobancodiscoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipobancodiscoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoBancoDisco();
				}

				JInternalFrameBase jinternalFrame =this.tipobancodiscoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoBancoNomina=(TitledBorder)this.jScrollPanelDatosProcesoBancoNomina.getBorder();
				TitledBorder titledBordertipobancodisco=(TitledBorder)this.tipobancodiscoBeanSwingJInternalFrame.jScrollPanelDatosTipoBancoDisco.getBorder();

				titledBordertipobancodisco.setTitle(titledBorderProcesoBancoNomina.getTitle() + " -> Tipo Banco Disco");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_banco_discoProcesoBancoNominaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.getprocesobanconomina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesobanconomina==null) {
						this.procesobanconomina = new ProcesoBancoNomina();
					}

					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.procesobanconomina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
				}

				if(this.procesobanconomina.getid_tipo_banco_disco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_banco_disco = "+this.procesobanconomina.getid_tipo_banco_disco().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoBancoNomina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_otrosProcesoBancoNominaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.getprocesobanconomina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesobanconomina==null) {
						this.procesobanconomina = new ProcesoBancoNomina();
					}

					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.procesobanconomina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
				}

				if(this.procesobanconomina.getcon_otros()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_otros = "+this.procesobanconomina.getcon_otros().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoBancoNomina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_internetProcesoBancoNominaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.getprocesobanconomina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesobanconomina==null) {
						this.procesobanconomina = new ProcesoBancoNomina();
					}

					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.procesobanconomina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
				}

				if(this.procesobanconomina.getcon_internet()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_internet = "+this.procesobanconomina.getcon_internet().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoBancoNomina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaProcesoBancoNominaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.getprocesobanconomina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesobanconomina==null) {
						this.procesobanconomina = new ProcesoBancoNomina();
					}

					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.procesobanconomina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
				}

				if(this.procesobanconomina.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.procesobanconomina.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoBancoNomina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_secuencialesProcesoBancoNominaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.getprocesobanconomina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesobanconomina==null) {
						this.procesobanconomina = new ProcesoBancoNomina();
					}

					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.procesobanconomina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
				}

				if(this.procesobanconomina.getnumero_secuenciales()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_secuenciales = "+this.procesobanconomina.getnumero_secuenciales().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoBancoNomina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtongenera_textoProcesoBancoNominaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.getprocesobanconomina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesobanconomina==null) {
						this.procesobanconomina = new ProcesoBancoNomina();
					}

					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.procesobanconomina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
				}

				if(this.procesobanconomina.getgenera_texto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where genera_texto = "+this.procesobanconomina.getgenera_texto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoBancoNomina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtongenera_excelProcesoBancoNominaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.getprocesobanconomina(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesobanconomina==null) {
						this.procesobanconomina = new ProcesoBancoNomina();
					}

					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.procesobanconomina,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);
				}

				if(this.procesobanconomina.getgenera_excel()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where genera_excel = "+this.procesobanconomina.getgenera_excel().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoBancoNomina(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoBancoNominaProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoBancoNomina(false,false);

			this.getProcesoBancoNominasBusquedaProcesoBancoNomina();

			this.inicializarActualizarBindingProcesoBancoNomina(false);

			//if(ProcesoBancoNominaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoBancoNomina(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBancoProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoBancoNomina(false,false);

			this.getProcesoBancoNominasFK_IdBanco();

			this.inicializarActualizarBindingProcesoBancoNomina(false);

			//if(ProcesoBancoNominaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoBancoNomina(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaBancoProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoBancoNomina(false,false);

			this.getProcesoBancoNominasFK_IdCuentaBanco();

			this.inicializarActualizarBindingProcesoBancoNomina(false);

			//if(ProcesoBancoNominaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoBancoNomina(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoBancoDiscoProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoBancoNomina(false,false);

			this.getProcesoBancoNominasFK_IdTipoBancoDisco();

			this.inicializarActualizarBindingProcesoBancoNomina(false);

			//if(ProcesoBancoNominaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoBancoNomina(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoContratoProcesoBancoNominaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoBancoNomina(false,false);

			this.getProcesoBancoNominasFK_IdTipoContrato();

			this.inicializarActualizarBindingProcesoBancoNomina(false);

			//if(ProcesoBancoNominaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoBancoNomina(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesobanconominaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoBancoNomina() {
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
			this.jInternalFrameDetalleFormProcesoBancoNomina.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoBancoNomina.dispose();
			this.jInternalFrameDetalleFormProcesoBancoNomina=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoBancoNomina!=null) {
			this.jInternalFrameReporteDinamicoProcesoBancoNomina.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoBancoNomina.dispose();
			this.jInternalFrameReporteDinamicoProcesoBancoNomina=null;
		}
		
		if(this.jInternalFrameImportacionProcesoBancoNomina!=null) {
			this.jInternalFrameImportacionProcesoBancoNomina.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoBancoNomina.dispose();
			this.jInternalFrameImportacionProcesoBancoNomina=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoBancoNomina();
			
			ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoBancoNomina")) {
				jButtonNuevoProcesoBancoNominaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoBancoNomina")) {
				jButtonDuplicarProcesoBancoNominaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoBancoNomina")) {
				jButtonCopiarProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoBancoNomina")) {
				jButtonVerFormProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoBancoNomina")) {
				jButtonNuevoProcesoBancoNominaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoBancoNomina")) {
				jButtonDuplicarProcesoBancoNominaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoBancoNomina")) {
				jButtonNuevoProcesoBancoNominaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoBancoNomina")) {
				jButtonDuplicarProcesoBancoNominaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoBancoNomina")) {
				jButtonNuevoProcesoBancoNominaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoBancoNomina")) {
				jButtonNuevoProcesoBancoNominaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoBancoNomina")) {
				jButtonNuevoProcesoBancoNominaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoBancoNomina")) {
				jButtonModificarProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoBancoNomina")) {
				jButtonModificarProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoBancoNomina")) {
				jButtonModificarProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoBancoNomina")) {
				jButtonActualizarProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoBancoNomina")) {
				jButtonActualizarProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoBancoNomina")) {
				jButtonActualizarProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoBancoNomina")) {
				jButtonEliminarProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoBancoNomina")) {
				jButtonEliminarProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoBancoNomina")) {
				jButtonEliminarProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoBancoNomina")) {
				jButtonCancelarProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoBancoNomina")) {
				jButtonCancelarProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoBancoNomina")) {
				jButtonCancelarProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoBancoNomina")) {
				jButtonCerrarProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoBancoNomina")) {
				jButtonCerrarProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoBancoNomina")) {
				jButtonCerrarProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoBancoNomina")) {
				jButtonMostrarOcultarProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoBancoNomina")) {
				jButtonCancelarProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoBancoNomina")) {
				jButtonGuardarCambiosProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoBancoNomina")) {
				jButtonGuardarCambiosProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoBancoNomina")) {
				jButtonCopiarProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoBancoNomina")) {
				jButtonVerFormProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoBancoNomina")) {
				jButtonGuardarCambiosProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoBancoNomina")) {
				jButtonCopiarProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoBancoNomina")) {
				jButtonVerFormProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoBancoNomina")) {
				jButtonGuardarCambiosProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoBancoNomina")) {
				jButtonGuardarCambiosProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoBancoNomina")) {
				jButtonGuardarCambiosProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoBancoNomina")) {
				jButtonRecargarInformacionProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoBancoNomina")) {
				jButtonRecargarInformacionProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoBancoNomina")) {
				jButtonRecargarInformacionProcesoBancoNominaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoBancoNomina")) {
				jButtonAnterioresProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoBancoNomina")) {
				jButtonAnterioresProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoBancoNomina")) {
				jButtonAnterioresProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoBancoNomina")) {
				jButtonSiguientesProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoBancoNomina")) {
				jButtonSiguientesProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoBancoNomina")) {
				jButtonSiguientesProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoBancoNomina") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoBancoNomina")) {
				jButtonAbrirOrderByProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoBancoNomina") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoBancoNomina")) {
				jButtonMostrarOcultarProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoBancoNomina")) {
				jButtonNuevoGuardarCambiosProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoBancoNomina")) {
				jButtonNuevoGuardarCambiosProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoBancoNomina")) {
				jButtonNuevoGuardarCambiosProcesoBancoNominaActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoBancoNomina")) {
				jButtonProcesarInformacionProcesoBancoNominaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoBancoNomina")) {
				jButtonCerrarReporteDinamicoProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoBancoNomina")) {
				jButtonGenerarReporteDinamicoProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoBancoNomina")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoBancoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoBancoNomina")) {
				jButtonCerrarImportacionProcesoBancoNominaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoBancoNomina")) {
				
				jButtonGenerarImportacionProcesoBancoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoBancoNomina")) {
				
				jButtonAbrirImportacionProcesoBancoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoBancoNomina")) {
				jComboBoxTiposAccionesProcesoBancoNominaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoBancoNomina")) {
				jComboBoxTiposRelacionesProcesoBancoNominaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoBancoNomina")) {
				jComboBoxTiposAccionesProcesoBancoNominaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoBancoNomina")) {
				
				jComboBoxTiposSeleccionarProcesoBancoNominaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoBancoNomina")) {
				jTextFieldValorCampoGeneralProcesoBancoNominaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoBancoNomina")) {
				jButtonAbrirOrderByProcesoBancoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoBancoNomina")) {
				jButtonAbrirOrderByProcesoBancoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoBancoNomina")) {
				jButtonCerrarOrderByProcesoBancoNominaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoBancoNominaBusqueda")) {
				this.jButtonidProcesoBancoNominaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bancoProcesoBancoNominaUpdate")) {
				this.jButtonid_bancoProcesoBancoNominaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bancoProcesoBancoNominaBusqueda")) {
				this.jButtonid_bancoProcesoBancoNominaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_bancoProcesoBancoNominaUpdate")) {
				this.jButtonid_cuenta_bancoProcesoBancoNominaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_bancoProcesoBancoNominaBusqueda")) {
				this.jButtonid_cuenta_bancoProcesoBancoNominaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_contratoProcesoBancoNominaUpdate")) {
				this.jButtonid_tipo_contratoProcesoBancoNominaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_contratoProcesoBancoNominaBusqueda")) {
				this.jButtonid_tipo_contratoProcesoBancoNominaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_banco_discoProcesoBancoNominaUpdate")) {
				this.jButtonid_tipo_banco_discoProcesoBancoNominaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_banco_discoProcesoBancoNominaBusqueda")) {
				this.jButtonid_tipo_banco_discoProcesoBancoNominaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_otrosProcesoBancoNominaBusqueda")) {
				this.jButtoncon_otrosProcesoBancoNominaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_internetProcesoBancoNominaBusqueda")) {
				this.jButtoncon_internetProcesoBancoNominaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaProcesoBancoNominaBusqueda")) {
				this.jButtonfechaProcesoBancoNominaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_secuencialesProcesoBancoNominaBusqueda")) {
				this.jButtonnumero_secuencialesProcesoBancoNominaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("genera_textoProcesoBancoNominaBusqueda")) {
				this.jButtongenera_textoProcesoBancoNominaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("genera_excelProcesoBancoNominaBusqueda")) {
				this.jButtongenera_excelProcesoBancoNominaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoBancoNominaProcesoBancoNomina")) {
				this.jButtonBusquedaProcesoBancoNominaProcesoBancoNominaActionPerformed(evt);
			}
			
			;
			
			
			ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoBancoNomina();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoBancoNominaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesobanconomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesobanconomina);
				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
				
				


				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoBancoNomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoBancoNomina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoBancoNomina procesobanconominaLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesobanconominaLocal=this.procesobanconomina;
			} else {
				procesobanconominaLocal=this.procesobanconominaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesobanconomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesobanconomina);
				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
							
				
				


				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoBancoNomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoBancoNomina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoBancoNominaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaAnterior =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesobanconominaAnterior =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
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
			
			ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
			
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
			
			


			
			ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoBancoNominaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesobanconomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesobanconomina);
				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
								
						
				


				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoBancoNomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoBancoNomina.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesobanconomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesobanconomina);
				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
								
				
				


				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoBancoNomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoBancoNomina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoBancoNominaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaAnterior =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesobanconominaAnterior =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesobanconomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesobanconomina);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoBancoNominaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaAnterior =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesobanconominaAnterior =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoBancoNominaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesobanconomina);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesobanconomina);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesobanconomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesobanconomina);
				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
							
				
				


				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoBancoNomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoBancoNomina.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoBancoNominaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesobanconominaAnterior =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesobanconominaAnterior =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
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
			
			ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
			
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
			
			


			
			ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoBancoNominaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesobanconomina);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesobanconomina);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesobanconomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesobanconomina);
				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
								
				
				


				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoBancoNomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoBancoNomina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoBancoNominaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaAnterior =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesobanconominaAnterior =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoBancoNominaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesobanconomina);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesobanconomina);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoBancoNominaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesobanconomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesobanconomina);
				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoBancoNomina")) {
					jCheckBoxSeleccionarTodosProcesoBancoNominaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoBancoNomina")) {
					jCheckBoxSeleccionadosProcesoBancoNominaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoBancoNomina")) {
					
				}
				
				


				
				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoBancoNomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoBancoNomina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesobanconomina);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesobanconomina);
				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
												
				
				


				
				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoBancoNomina.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoBancoNomina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoBancoNominaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesobanconominaAnterior =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesobanconominaAnterior =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoBancoNominaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesobanconomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesobanconomina);
				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
				
				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
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
			
			ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
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
			
			


			
			ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoBancoNominaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesobanconomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesobanconomina);
				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoBancoNomina.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoBancoNomina.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesobanconomina);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesobanconomina);
				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
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
				
				


				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoBancoNomina.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoBancoNomina.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoBancoNominaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesobanconominaAnterior =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesobanconominaAnterior =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoBancoNomina")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoBancoNominaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoBancoNomina.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesobanconomina =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesobanconomina);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoBancoNomina")) {
				
				}
				
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoBancoNomina")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoBancoNomina.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoBancoNomina")) {
			
			}
			
			ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoBancoNomina();
			
			ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoBancoNomina")) {
				jButtonNuevoProcesoBancoNominaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoBancoNomina")) {
				jButtonDuplicarProcesoBancoNominaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoBancoNomina")) {
				jButtonCopiarProcesoBancoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoBancoNomina")) {
				jButtonVerFormProcesoBancoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoBancoNomina")) {
				jButtonNuevoProcesoBancoNominaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoBancoNomina")) {
				jButtonModificarProcesoBancoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoBancoNomina")) {
				jButtonActualizarProcesoBancoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoBancoNomina")) {
				jButtonEliminarProcesoBancoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoBancoNomina")) {
				jButtonGuardarCambiosProcesoBancoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoBancoNomina")) {
				jButtonCancelarProcesoBancoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoBancoNomina")) {
				jButtonCerrarProcesoBancoNominaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoBancoNomina")) {
				jButtonGuardarCambiosProcesoBancoNominaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoBancoNomina")) {
				jButtonNuevoGuardarCambiosProcesoBancoNominaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoBancoNomina")) {
				jButtonAbrirOrderByProcesoBancoNominaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoBancoNomina")) {
				jButtonRecargarInformacionProcesoBancoNominaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoBancoNomina")) {
				jButtonAnterioresProcesoBancoNominaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoBancoNomina")) {
				jButtonSiguientesProcesoBancoNominaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoBancoNominaBusqueda")) {
				this.jButtonidProcesoBancoNominaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bancoProcesoBancoNominaUpdate")) {
				this.jButtonid_bancoProcesoBancoNominaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bancoProcesoBancoNominaBusqueda")) {
				this.jButtonid_bancoProcesoBancoNominaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_bancoProcesoBancoNominaUpdate")) {
				this.jButtonid_cuenta_bancoProcesoBancoNominaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_bancoProcesoBancoNominaBusqueda")) {
				this.jButtonid_cuenta_bancoProcesoBancoNominaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_contratoProcesoBancoNominaUpdate")) {
				this.jButtonid_tipo_contratoProcesoBancoNominaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_contratoProcesoBancoNominaBusqueda")) {
				this.jButtonid_tipo_contratoProcesoBancoNominaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_banco_discoProcesoBancoNominaUpdate")) {
				this.jButtonid_tipo_banco_discoProcesoBancoNominaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_banco_discoProcesoBancoNominaBusqueda")) {
				this.jButtonid_tipo_banco_discoProcesoBancoNominaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_otrosProcesoBancoNominaBusqueda")) {
				this.jButtoncon_otrosProcesoBancoNominaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_internetProcesoBancoNominaBusqueda")) {
				this.jButtoncon_internetProcesoBancoNominaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaProcesoBancoNominaBusqueda")) {
				this.jButtonfechaProcesoBancoNominaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_secuencialesProcesoBancoNominaBusqueda")) {
				this.jButtonnumero_secuencialesProcesoBancoNominaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("genera_textoProcesoBancoNominaBusqueda")) {
				this.jButtongenera_textoProcesoBancoNominaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("genera_excelProcesoBancoNominaBusqueda")) {
				this.jButtongenera_excelProcesoBancoNominaBusquedaActionPerformed(evt);
			}
			
			ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoBancoNomina();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoBancoNomina")) {
				closingInternalFrameProcesoBancoNomina();
				
			} else if(sTipo.equals("jButtonCancelarProcesoBancoNomina")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoBancoNomina = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoBancoNominaBeanSwingJInternalFrame jInternalFrameParent=(ProcesoBancoNominaBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoBancoNomina.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoBancoNominaActionPerformed(null);
			}
			
			ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesobanconomina,new Object(),this.procesobanconominaParameterGeneral,this.procesobanconominaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoBancoNomina(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoBancoNomina(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoBancoNomina(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesobanconomina)) {
			if(!esControlTabla) {
				if(ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.procesobanconomina,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);			
				}
				
				if(this.procesobanconominaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoBancoNomina(this.procesobanconomina,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoBancoNomina(this.procesobanconominaReturnGeneral,this.procesobanconominaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesobanconominaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoBancoNomina(classes,this.procesobanconominaReturnGeneral,this.procesobanconominaBean,false);
					}
						
					if(this.procesobanconominaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoBancoNomina(this.procesobanconominaReturnGeneral.getProcesoBancoNomina());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoBancoNomina(this.procesobanconominaReturnGeneral.getProcesoBancoNomina());	
					}
						
					if(this.procesobanconominaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoBancoNomina(this.procesobanconominaReturnGeneral.getProcesoBancoNomina(),classes);//this.procesobanconominaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoBancoNomina(this.procesobanconomina,classes);//this.procesobanconominaBean);									
				}
			
				if(ProcesoBancoNominaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoBancoNomina(this.procesobanconomina,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoBancoNomina(this.procesobanconomina);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesobanconominaAnterior!=null) {
						this.procesobanconomina=this.procesobanconominaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesobanconominaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesobanconominaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesobanconominaReturnGeneral.getProcesoBancoNomina(),procesobanconominaLogic.getProcesoBancoNominas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesobanconominaReturnGeneral.getProcesoBancoNomina(),this.procesobanconominas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoBancoNomina.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoBancoNomina.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoBancoNomina();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoBancoNomina() throws Exception {
		
		ProcesoBancoNominaModel procesobanconominaModel=(ProcesoBancoNominaModel)this.jTableDatosProcesoBancoNomina.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesobanconominaModel.procesobanconominas=this.procesobanconominaLogic.getProcesoBancoNominas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesobanconominaModel.procesobanconominas=this.procesobanconominas;
		}
		
		
		((ProcesoBancoNominaModel) this.jTableDatosProcesoBancoNomina.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoBancoNomina() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesobanconominaAnterior(),this.procesobanconominaLogic.getProcesoBancoNominas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesobanconominaAnterior(),this.procesobanconominas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoBancoNomina();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoBancoNomina(ProcesoBancoNomina procesobanconomina,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
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
										
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesobanconomina,new Object(),generalEntityParameterGeneral,this.procesobanconominaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesobanconominaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoBancoNominaConstantesFunciones.getClassesRelationshipsOfProcesoBancoNomina(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoBancoNominaConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoBancoNomina(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoBancoNomina(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoBancoNominaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesobanconomina,new Object(),generalEntityParameterGeneral,this.procesobanconominaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoBancoNomina(ProcesoBancoNominaBean procesobanconominaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoBancoNomina(ArrayList<Classe> classes,ProcesoBancoNominaReturnGeneral procesobanconominaReturnGeneral,ProcesoBancoNominaBean procesobanconominaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoBancoNomina(ProcesoBancoNomina procesobanconomina,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesobanconomina)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoBancoNomina = new ProcesoBancoNominaDetalleFormJInternalFrame(jDesktopPane,this.procesobanconominaSessionBean.getConGuardarRelaciones(),this.procesobanconominaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.setVisible(false);
		this.jInternalFrameDetalleFormProcesoBancoNomina.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoBancoNomina.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoBancoNomina.procesobanconominaLogic=this.procesobanconominaLogic;
		
		this.cargarCombosFrameForeignKeyProcesoBancoNomina("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoBancoNomina();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoBancoNomina();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoBancoNomina("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoBancoNomina();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoBancoNomina.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoBancoNomina"));
		
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonModificarProcesoBancoNomina.addActionListener(new ButtonActionListener(this,"ModificarProcesoBancoNomina"));

		
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonModificarToolBarProcesoBancoNomina.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoBancoNomina"));
					
		this.jInternalFrameDetalleFormProcesoBancoNomina.jMenuItemModificarProcesoBancoNomina.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoBancoNomina"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonActualizarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"ActualizarProcesoBancoNomina"));
		
		
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonActualizarToolBarProcesoBancoNomina.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoBancoNomina"));
						
		this.jInternalFrameDetalleFormProcesoBancoNomina.jMenuItemActualizarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoBancoNomina"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonEliminarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"EliminarProcesoBancoNomina"));
		
		
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonEliminarToolBarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoBancoNomina"));
								
		this.jInternalFrameDetalleFormProcesoBancoNomina.jMenuItemEliminarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoBancoNomina"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonCancelarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"CancelarProcesoBancoNomina"));
		
		
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonCancelarToolBarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoBancoNomina"));
					
		this.jInternalFrameDetalleFormProcesoBancoNomina.jMenuItemCancelarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoBancoNomina"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoBancoNomina.jMenuItemDetalleCerrarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoBancoNomina"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonGuardarCambiosToolBarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoBancoNomina"));
		
		
		
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonGuardarCambiosToolBarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoBancoNomina"));
		
		
		
		this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxTiposAccionesFormularioProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoBancoNomina"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonidProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoBancoNominaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_bancoProcesoBancoNominaUpdate.addActionListener(new ButtonActionListener(this,"id_bancoProcesoBancoNominaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_bancoProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"id_bancoProcesoBancoNominaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_cuenta_bancoProcesoBancoNominaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_bancoProcesoBancoNominaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_cuenta_bancoProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_bancoProcesoBancoNominaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_tipo_contratoProcesoBancoNominaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_contratoProcesoBancoNominaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_tipo_contratoProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_contratoProcesoBancoNominaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_tipo_banco_discoProcesoBancoNominaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_banco_discoProcesoBancoNominaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_tipo_banco_discoProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_banco_discoProcesoBancoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtoncon_otrosProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"con_otrosProcesoBancoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtoncon_internetProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"con_internetProcesoBancoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonfechaProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"fechaProcesoBancoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonnumero_secuencialesProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"numero_secuencialesProcesoBancoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtongenera_textoProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"genera_textoProcesoBancoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtongenera_excelProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"genera_excelProcesoBancoNominaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoBancoNomina.jTabbedPaneRelacionesProcesoBancoNomina.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoBancoNomina"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoBancoNomina"));
		
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoBancoNomina.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoBancoNomina"));
		}
		
		this.jTableDatosProcesoBancoNomina.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoBancoNomina"));
		
		this.jTableDatosProcesoBancoNomina.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoBancoNomina"));
		
		this.jButtonNuevoProcesoBancoNomina.addActionListener(new ButtonActionListener(this,"NuevoProcesoBancoNomina"));
		
		this.jButtonDuplicarProcesoBancoNomina.addActionListener(new ButtonActionListener(this,"DuplicarProcesoBancoNomina"));
		
		this.jButtonCopiarProcesoBancoNomina.addActionListener(new ButtonActionListener(this,"CopiarProcesoBancoNomina"));
		
		this.jButtonVerFormProcesoBancoNomina.addActionListener(new ButtonActionListener(this,"VerFormProcesoBancoNomina"));
		
		
		this.jButtonNuevoToolBarProcesoBancoNomina.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoBancoNomina"));
			
		this.jButtonDuplicarToolBarProcesoBancoNomina.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoBancoNomina"));
			
		this.jMenuItemNuevoProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoBancoNomina"));
			
		this.jMenuItemDuplicarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoBancoNomina"));		
		
		
		this.jButtonNuevoRelacionesProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoBancoNomina"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoBancoNomina.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoBancoNomina"));
			
		this.jMenuItemNuevoRelacionesProcesoBancoNomina.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoBancoNomina"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonModificarProcesoBancoNomina.addActionListener(new ButtonActionListener(this,"ModificarProcesoBancoNomina"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonModificarToolBarProcesoBancoNomina.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoBancoNomina"));
			
			this.jInternalFrameDetalleFormProcesoBancoNomina.jMenuItemModificarProcesoBancoNomina.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoBancoNomina"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonActualizarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"ActualizarProcesoBancoNomina"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonActualizarToolBarProcesoBancoNomina.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoBancoNomina"));
				
			this.jInternalFrameDetalleFormProcesoBancoNomina.jMenuItemActualizarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoBancoNomina"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonEliminarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"EliminarProcesoBancoNomina"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonEliminarToolBarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoBancoNomina"));
						
			this.jInternalFrameDetalleFormProcesoBancoNomina.jMenuItemEliminarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoBancoNomina"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonCancelarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"CancelarProcesoBancoNomina"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonCancelarToolBarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoBancoNomina"));
			
			this.jInternalFrameDetalleFormProcesoBancoNomina.jMenuItemCancelarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoBancoNomina"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoBancoNomina"));		
		
		
		this.jButtonCerrarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"CerrarProcesoBancoNomina"));
		
		
		this.jButtonCerrarToolBarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoBancoNomina"));
			
		this.jMenuItemCerrarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoBancoNomina"));
			
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoBancoNomina.jMenuItemDetalleCerrarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoBancoNomina"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonGuardarCambiosProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoBancoNomina"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonGuardarCambiosToolBarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoBancoNomina"));
		}
		
		this.jButtonCopiarToolBarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoBancoNomina"));
			
		this.jButtonVerFormToolBarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoBancoNomina"));
		
		this.jMenuItemGuardarCambiosProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoBancoNomina"));
			
		this.jMenuItemCopiarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoBancoNomina"));		
		
		this.jMenuItemVerFormProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoBancoNomina"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoBancoNomina"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoBancoNomina"));
			
		this.jMenuItemGuardarCambiosTablaProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoBancoNomina"));		
		
		
		
		this.jButtonRecargarInformacionProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoBancoNomina"));
					
		this.jButtonRecargarInformacionToolBarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoBancoNomina"));
		
		this.jMenuItemRecargarInformacionProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoBancoNomina"));		
		
		
		
		this.jButtonAnterioresProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"AnterioresProcesoBancoNomina"));
		
		
		this.jButtonAnterioresToolBarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoBancoNomina"));
		
		this.jMenuItemAnterioresProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoBancoNomina"));		
		
		
		this.jButtonSiguientesProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"SiguientesProcesoBancoNomina"));
		
		
		this.jButtonSiguientesToolBarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoBancoNomina"));
			
		this.jMenuItemSiguientesProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoBancoNomina"));
			
		this.jMenuItemAbrirOrderByProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoBancoNomina"));
			
		this.jMenuItemMostrarOcultarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoBancoNomina"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoBancoNomina"));
			
		this.jMenuItemDetalleMostarOcultarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoBancoNomina"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoBancoNomina"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoBancoNomina"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoBancoNomina"));		
		
		
		this.jButtonProcesarInformacionProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoBancoNomina"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoBancoNomina.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoBancoNomina"));

		this.jCheckBoxSeleccionadosProcesoBancoNomina.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoBancoNomina"));
		
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxTiposAccionesFormularioProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoBancoNomina"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoBancoNomina"));
			
		this.jComboBoxTiposAccionesProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoBancoNomina"));
					
		this.jComboBoxTiposSeleccionarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoBancoNomina"));
			
		this.jTextFieldValorCampoGeneralProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoBancoNomina"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonidProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoBancoNominaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_bancoProcesoBancoNominaUpdate.addActionListener(new ButtonActionListener(this,"id_bancoProcesoBancoNominaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_bancoProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"id_bancoProcesoBancoNominaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_cuenta_bancoProcesoBancoNominaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_bancoProcesoBancoNominaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_cuenta_bancoProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_bancoProcesoBancoNominaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_tipo_contratoProcesoBancoNominaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_contratoProcesoBancoNominaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_tipo_contratoProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_contratoProcesoBancoNominaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_tipo_banco_discoProcesoBancoNominaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_banco_discoProcesoBancoNominaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_tipo_banco_discoProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_banco_discoProcesoBancoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtoncon_otrosProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"con_otrosProcesoBancoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtoncon_internetProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"con_internetProcesoBancoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonfechaProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"fechaProcesoBancoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonnumero_secuencialesProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"numero_secuencialesProcesoBancoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtongenera_textoProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"genera_textoProcesoBancoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtongenera_excelProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"genera_excelProcesoBancoNominaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoBancoNominaProcesoBancoNomina.addActionListener(new ButtonActionListener(this,"BusquedaProcesoBancoNominaProcesoBancoNomina"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoBancoNomina!=null) {
				this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoBancoNomina"));
				this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoBancoNomina"));
				this.jInternalFrameReporteDinamicoProcesoBancoNomina.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoBancoNomina"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoBancoNomina"));				
			//this.jButtonGenerarReporteDinamicoProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoBancoNomina"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoBancoNomina"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoBancoNomina!=null) {
				this.jInternalFrameImportacionProcesoBancoNomina.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoBancoNomina"));
				this.jInternalFrameImportacionProcesoBancoNomina.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoBancoNomina"));
				this.jInternalFrameImportacionProcesoBancoNomina.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoBancoNomina"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoBancoNomina"));
			
			this.jButtonAbrirOrderByToolBarProcesoBancoNomina.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoBancoNomina"));			
			
			if(this.jInternalFrameOrderByProcesoBancoNomina!=null) {
				this.jInternalFrameOrderByProcesoBancoNomina.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoBancoNomina"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoBancoNomina.jTabbedPaneRelacionesProcesoBancoNomina.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoBancoNomina"));
		
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
            		closingInternalFrameProcesoBancoNomina();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoBancoNomina.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoBancoNomina = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoBancoNominaBeanSwingJInternalFrame jInternalFrameParent=(ProcesoBancoNominaBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoBancoNomina.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoBancoNominaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoBancoNomina.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoBancoNominaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoBancoNomina.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoBancoNomina.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoBancoNominaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoBancoNominaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoBancoNominaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoBancoNomina";
		inputMap = this.jButtonNuevoProcesoBancoNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoBancoNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoBancoNominaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoBancoNominaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoBancoNominaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoBancoNominaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoBancoNomina";
		inputMap = this.jButtonNuevoRelacionesProcesoBancoNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoBancoNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoBancoNominaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoBancoNomina";
		inputMap = this.jButtonModificarProcesoBancoNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoBancoNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoBancoNominaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoBancoNomina";
		inputMap = this.jButtonActualizarProcesoBancoNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoBancoNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoBancoNominaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoBancoNomina";
		inputMap = this.jButtonEliminarProcesoBancoNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoBancoNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoBancoNominaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoBancoNomina";
		inputMap = this.jButtonCancelarProcesoBancoNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoBancoNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoBancoNominaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoBancoNomina";
		inputMap = this.jButtonCerrarProcesoBancoNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoBancoNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoBancoNominaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonGuardarCambiosProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoBancoNomina";
		inputMap = this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonGuardarCambiosProcesoBancoNomina.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonGuardarCambiosProcesoBancoNomina.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoBancoNominaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoBancoNomina.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoBancoNominaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoBancoNomina.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoBancoNominaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoBancoNomina.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoBancoNominaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoBancoNomina.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoBancoNominaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonidProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoBancoNominaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_bancoProcesoBancoNominaUpdate.addActionListener(new ButtonActionListener(this,"id_bancoProcesoBancoNominaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_bancoProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"id_bancoProcesoBancoNominaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_cuenta_bancoProcesoBancoNominaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_bancoProcesoBancoNominaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_cuenta_bancoProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_bancoProcesoBancoNominaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_tipo_contratoProcesoBancoNominaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_contratoProcesoBancoNominaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_tipo_contratoProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_contratoProcesoBancoNominaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_tipo_banco_discoProcesoBancoNominaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_banco_discoProcesoBancoNominaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonid_tipo_banco_discoProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_banco_discoProcesoBancoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtoncon_otrosProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"con_otrosProcesoBancoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtoncon_internetProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"con_internetProcesoBancoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonfechaProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"fechaProcesoBancoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtonnumero_secuencialesProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"numero_secuencialesProcesoBancoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtongenera_textoProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"genera_textoProcesoBancoNominaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoBancoNomina.jButtongenera_excelProcesoBancoNominaBusqueda.addActionListener(new ButtonActionListener(this,"genera_excelProcesoBancoNominaBusqueda"));
		
		
		this.jButtonBusquedaProcesoBancoNominaProcesoBancoNomina.addActionListener(new ButtonActionListener(this,"BusquedaProcesoBancoNominaProcesoBancoNomina"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoBancoNomina.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoBancoNominaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoBancoNominaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoBancoNomina.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoBancoNomina(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoBancoNomina procesobanconominaAux:this.procesobanconominaLogic.getProcesoBancoNominas()) {
					procesobanconominaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoBancoNomina procesobanconominaAux:procesobanconominas) {
					procesobanconominaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoBancoNominaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoBancoNomina(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoBancoNomina procesobanconominaAux:this.procesobanconominaLogic.getProcesoBancoNominas()) {
						procesobanconominaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoBancoNomina procesobanconominaAux:procesobanconominas) {
						procesobanconominaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoBancoNomina procesobanconominaAux:this.procesobanconominaLogic.getProcesoBancoNominas()) {
					
						if(sTipoSeleccionar.equals(ProcesoBancoNominaConstantesFunciones.LABEL_CONOTROS)) {
							existe=true;
							procesobanconominaAux.setcon_otros(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ProcesoBancoNominaConstantesFunciones.LABEL_CONINTERNET)) {
							existe=true;
							procesobanconominaAux.setcon_internet(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ProcesoBancoNominaConstantesFunciones.LABEL_GENERATEXTO)) {
							existe=true;
							procesobanconominaAux.setgenera_texto(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ProcesoBancoNominaConstantesFunciones.LABEL_GENERAEXCEL)) {
							existe=true;
							procesobanconominaAux.setgenera_excel(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoBancoNomina procesobanconominaAux:procesobanconominas) {
						
						if(sTipoSeleccionar.equals(ProcesoBancoNominaConstantesFunciones.LABEL_CONOTROS)) {
							existe=true;
							procesobanconominaAux.setcon_otros(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ProcesoBancoNominaConstantesFunciones.LABEL_CONINTERNET)) {
							existe=true;
							procesobanconominaAux.setcon_internet(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ProcesoBancoNominaConstantesFunciones.LABEL_GENERATEXTO)) {
							existe=true;
							procesobanconominaAux.setgenera_texto(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ProcesoBancoNominaConstantesFunciones.LABEL_GENERAEXCEL)) {
							existe=true;
							procesobanconominaAux.setgenera_excel(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoBancoNomina(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoBancoNomina.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoBancoNomina.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoBancoNomina,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoBancoNominaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoBancoNomina(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoBancoNomina.getSelectedRows();
			
			ProcesoBancoNomina procesobanconominaLocal=new ProcesoBancoNomina();
			
			//this.seleccionarTodosProcesoBancoNomina(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesobanconominaLocal =(ProcesoBancoNomina) this.procesobanconominaLogic.getProcesoBancoNominas().toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesobanconominaLocal =(ProcesoBancoNomina) this.procesobanconominas.toArray()[this.jTableDatosProcesoBancoNomina.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesobanconominaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoBancoNomina procesobanconominaAux:this.procesobanconominaLogic.getProcesoBancoNominas()) {
						procesobanconominaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoBancoNomina procesobanconominaAux:procesobanconominas) {
						procesobanconominaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoBancoNomina(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoBancoNomina.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoBancoNomina.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoBancoNomina,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoBancoNominaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoBancoNominaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoBancoNominaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoBancoNomina(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoBancoNomina.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoBancoNomina procesobanconominaAux:this.procesobanconominaLogic.getProcesoBancoNominas()) {
				
						if(sTipoSeleccionar.equals(ProcesoBancoNominaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							procesobanconominaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoBancoNominaConstantesFunciones.LABEL_NUMEROSECUENCIALES)) {
							existe=true;
							procesobanconominaAux.setnumero_secuenciales(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoBancoNomina procesobanconominaAux:procesobanconominas) {
					
						if(sTipoSeleccionar.equals(ProcesoBancoNominaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							procesobanconominaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoBancoNominaConstantesFunciones.LABEL_NUMEROSECUENCIALES)) {
							existe=true;
							procesobanconominaAux.setnumero_secuenciales(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoBancoNomina(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoBancoNominaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoBancoNomina(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoBancoNomina=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoBancoNomina.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxTiposAccionesFormularioProcesoBancoNomina.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoBancoNomina) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoBancoNomina(conSplash);
				
					this.generarReporteProcesoBancoNominasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoBancoNomina.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxTiposAccionesFormularioProcesoBancoNomina.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoBancoNominasSeleccionados();
				//this.jComboBoxTiposAccionesProcesoBancoNomina.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoBancoNominasSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoBancoNomina.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoBancoNominasSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoBancoNomina.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoBancoNomina();
				
				this.exportarProcesoBancoNominasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoBancoNomina.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxTiposAccionesFormularioProcesoBancoNomina.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoBancoNominas();
				//this.importarProcesoBancoNominas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoBancoNomina.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxTiposAccionesFormularioProcesoBancoNomina.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoBancoNomina();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoBancoNominasSeleccionados();
				//this.jComboBoxTiposAccionesProcesoBancoNomina.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Banco Nomina", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoBancoNomina();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoBancoNomina)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoBancoNomina(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Banco Nomina",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoBancoNomina.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxTiposAccionesFormularioProcesoBancoNomina.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoBancoNominaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoBancoNomina) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoBancoNomina(conSplash);
					
						//this.actualizarParametrosGeneralProcesoBancoNomina();
						
						this.generarReporteProcesoAccionProcesoBancoNominasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoBancoNomina.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxTiposAccionesFormularioProcesoBancoNomina.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoBancoNominaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Banco NominaS SELECCIONADOS?", "MANTENIMIENTO DE Proceso Banco Nomina", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoBancoNomina();
				
						this.actualizarParametrosGeneralProcesoBancoNomina();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesobanconominaReturnGeneral=procesobanconominaLogic.procesarAccionProcesoBancoNominasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesobanconominaLogic.getProcesoBancoNominas(),this.procesobanconominaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoBancoNominaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoBancoNomina.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxTiposAccionesFormularioProcesoBancoNomina.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoBancoNomina();
					
					ProcesoBancoNominaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoBancoNominaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoBancoNomina.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxTiposAccionesFormularioProcesoBancoNomina.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoBancoNomina(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoBancoNominaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoBancoNomina();
			
			if(this.jInternalFrameDetalleFormProcesoBancoNomina==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoBancoNomina> procesobanconominasSeleccionados=new ArrayList<ProcesoBancoNomina>();		
			ProcesoBancoNomina procesobanconomina=new ProcesoBancoNomina();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoBancoNomina(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoBancoNomina.getSelectedItem();
			
			
			
			
			procesobanconominasSeleccionados=this.getProcesoBancoNominasSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesobanconominasSeleccionados.size()==1) {
				for(ProcesoBancoNomina procesobanconominaAux:procesobanconominasSeleccionados) {
					procesobanconomina=procesobanconominaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoBancoNomina();
			
      		//this.finishProcessProcesoBancoNomina(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoBancoNominaReturnGeneral() throws Exception {
		if(this.procesobanconominaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesobanconominaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesobanconominaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesobanconominaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesobanconominaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesobanconominaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoBancoNomina(false);
		}
		
		if(this.procesobanconominaReturnGeneral.getConRetornoLista() || this.procesobanconominaReturnGeneral.getConRetornoObjeto()) {
			if(this.procesobanconominaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesobanconominaLogic.setProcesoBancoNominas(this.procesobanconominaReturnGeneral.getProcesoBancoNominas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoBancoNomina(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoBancoNomina() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoBancoNomina> getProcesoBancoNominasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoBancoNomina> procesobanconominasSeleccionados=new ArrayList<ProcesoBancoNomina>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoBancoNomina) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoBancoNomina procesobanconominaAux:procesobanconominaLogic.getProcesoBancoNominas()) {
					if(procesobanconominaAux.getIsSelected()) {
						procesobanconominasSeleccionados.add(procesobanconominaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoBancoNomina procesobanconominaAux:this.procesobanconominas) {
					if(procesobanconominaAux.getIsSelected()) {
						procesobanconominasSeleccionados.add(procesobanconominaAux);				
					}
				}
			}
			
			if(procesobanconominasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesobanconominasSeleccionados.addAll(this.procesobanconominaLogic.getProcesoBancoNominas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesobanconominasSeleccionados.addAll(this.procesobanconominas);				
					}
				}
			}
		} else {
			procesobanconominasSeleccionados.add(this.procesobanconomina);
		}
		
		return procesobanconominasSeleccionados;
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
	
	public void generarReporteProcesoBancoNominasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoBancoNominasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoBancoNominasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoBancoNominasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoBancoNominasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Banco Nomina",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoBancoNominasSeleccionados() throws Exception {
		ArrayList<ProcesoBancoNomina> procesobanconominasSeleccionados=new ArrayList<ProcesoBancoNomina>();		
		
		procesobanconominasSeleccionados=this.getProcesoBancoNominasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoBancoNominas("Todos",procesobanconominasSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoBancoNominasSeleccionados() throws Exception {
		ArrayList<ProcesoBancoNomina> procesobanconominasSeleccionados=new ArrayList<ProcesoBancoNomina>();		
		
		procesobanconominasSeleccionados=this.getProcesoBancoNominasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoBancoNominas("Todos",procesobanconominasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoBancoNominasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoBancoNomina> procesobanconominasSeleccionados=new ArrayList<ProcesoBancoNomina>();
		
		procesobanconominasSeleccionados=this.getProcesoBancoNominasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoBancoNominas("Todos",procesobanconominasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoBancoNominasSeleccionados() throws Exception {
		ArrayList<ProcesoBancoNomina> procesobanconominasSeleccionados=new ArrayList<ProcesoBancoNomina>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoBancoNomina();
		
		
		procesobanconominasSeleccionados=this.getProcesoBancoNominasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoBancoNomina();
		
		
		//this.generarReporteProcesoBancoNominas("Todos",procesobanconominasSeleccionados ,procesobanconominaImplementable,procesobanconominaImplementableHome);
	}
	
	public void mostrarImportacionProcesoBancoNominas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoBancoNomina();
		
		this.abrirFrameImportacionProcesoBancoNomina();		
		
			
		//this.generarReporteProcesoBancoNominas("Todos",procesobanconominasSeleccionados ,procesobanconominaImplementable,procesobanconominaImplementableHome);
	}
	
	public void importarProcesoBancoNominas() throws Exception {		
	
	}
	
	public void exportarProcesoBancoNominasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoBancoNominasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoBancoNominasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoBancoNominasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Banco Nomina",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoBancoNominasSeleccionados() throws Exception {
		ArrayList<ProcesoBancoNomina> procesobanconominasSeleccionados=new ArrayList<ProcesoBancoNomina>();		
		
		procesobanconominasSeleccionados=this.getProcesoBancoNominasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesobanconomina."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoBancoNomina(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoBancoNomina procesobanconominaAux:procesobanconominasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoBancoNomina(procesobanconominaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesobanconominaAux.setsDetalleGeneralEntityReporte(procesobanconominaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Banco Nomina",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoBancoNomina(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoBancoNominaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoBancoNominaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoBancoNominaConstantesFunciones.LABEL_IDBANCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoBancoNominaConstantesFunciones.LABEL_IDCUENTABANCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOCONTRATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOBANCODISCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoBancoNominaConstantesFunciones.LABEL_CONOTROS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoBancoNominaConstantesFunciones.LABEL_CONINTERNET;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoBancoNominaConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoBancoNominaConstantesFunciones.LABEL_NUMEROSECUENCIALES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoBancoNominaConstantesFunciones.LABEL_GENERATEXTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoBancoNominaConstantesFunciones.LABEL_GENERAEXCEL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoBancoNomina(ProcesoBancoNomina procesobanconomina,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesobanconomina.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesobanconomina.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesobanconomina.getbanco_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesobanconomina.getcuentabanco_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesobanconomina.gettipocontrato_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesobanconomina.gettipobancodisco_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesobanconomina.getcon_otros().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesobanconomina.getcon_internet().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesobanconomina.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesobanconomina.getnumero_secuenciales().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesobanconomina.getgenera_texto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesobanconomina.getgenera_excel().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoBancoNominasSeleccionados() throws Exception {
		ArrayList<ProcesoBancoNomina> procesobanconominasSeleccionados=new ArrayList<ProcesoBancoNomina>();		
		
		procesobanconominasSeleccionados=this.getProcesoBancoNominasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesobanconomina.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoBancoNominas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoBancoNomina(row);				
				iRow++;
			}				
			
			for(ProcesoBancoNomina procesobanconominaAux:procesobanconominasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoBancoNomina(procesobanconominaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Banco Nomina",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoBancoNominasSeleccionados() throws Exception {
		ArrayList<ProcesoBancoNomina> procesobanconominasSeleccionados=new ArrayList<ProcesoBancoNomina>();		
		
		procesobanconominasSeleccionados=this.getProcesoBancoNominasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesobanconomina.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesobanconominas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesobanconomina");
			//elementRoot.appendChild(element);
		
			for(ProcesoBancoNomina procesobanconominaAux:procesobanconominasSeleccionados) {
				element = document.createElement("procesobanconomina");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoBancoNomina(procesobanconominaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Banco Nomina",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoBancoNomina(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_IDBANCO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_IDCUENTABANCO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOCONTRATO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOBANCODISCO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_CONOTROS);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_CONINTERNET);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_NUMEROSECUENCIALES);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_GENERATEXTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoBancoNominaConstantesFunciones.LABEL_GENERAEXCEL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoBancoNomina(ProcesoBancoNomina procesobanconomina,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesobanconomina.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesobanconomina.getbanco_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesobanconomina.getcuentabanco_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesobanconomina.gettipocontrato_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesobanconomina.gettipobancodisco_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesobanconomina.getcon_otros());
		cell = row.createCell(iColumn++);cell.setCellValue(procesobanconomina.getcon_internet());
		cell = row.createCell(iColumn++);cell.setCellValue(procesobanconomina.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(procesobanconomina.getnumero_secuenciales());
		cell = row.createCell(iColumn++);cell.setCellValue(procesobanconomina.getgenera_texto());
		cell = row.createCell(iColumn++);cell.setCellValue(procesobanconomina.getgenera_excel());				
	}
	
	public void setFilaDatosExportarXmlProcesoBancoNomina(ProcesoBancoNomina procesobanconomina,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoBancoNominaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesobanconomina.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoBancoNominaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesobanconomina.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementbanco_descripcion = document.createElement(ProcesoBancoNominaConstantesFunciones.IDBANCO);
		elementbanco_descripcion.appendChild(document.createTextNode(procesobanconomina.getbanco_descripcion()));
		element.appendChild(elementbanco_descripcion);

		Element elementcuentabanco_descripcion = document.createElement(ProcesoBancoNominaConstantesFunciones.IDCUENTABANCO);
		elementcuentabanco_descripcion.appendChild(document.createTextNode(procesobanconomina.getcuentabanco_descripcion()));
		element.appendChild(elementcuentabanco_descripcion);

		Element elementtipocontrato_descripcion = document.createElement(ProcesoBancoNominaConstantesFunciones.IDTIPOCONTRATO);
		elementtipocontrato_descripcion.appendChild(document.createTextNode(procesobanconomina.gettipocontrato_descripcion()));
		element.appendChild(elementtipocontrato_descripcion);

		Element elementtipobancodisco_descripcion = document.createElement(ProcesoBancoNominaConstantesFunciones.IDTIPOBANCODISCO);
		elementtipobancodisco_descripcion.appendChild(document.createTextNode(procesobanconomina.gettipobancodisco_descripcion()));
		element.appendChild(elementtipobancodisco_descripcion);

		Element elementcon_otros = document.createElement(ProcesoBancoNominaConstantesFunciones.CONOTROS);
		elementcon_otros.appendChild(document.createTextNode(procesobanconomina.getcon_otros().toString().trim()));
		element.appendChild(elementcon_otros);

		Element elementcon_internet = document.createElement(ProcesoBancoNominaConstantesFunciones.CONINTERNET);
		elementcon_internet.appendChild(document.createTextNode(procesobanconomina.getcon_internet().toString().trim()));
		element.appendChild(elementcon_internet);

		Element elementfecha = document.createElement(ProcesoBancoNominaConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(procesobanconomina.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementnumero_secuenciales = document.createElement(ProcesoBancoNominaConstantesFunciones.NUMEROSECUENCIALES);
		elementnumero_secuenciales.appendChild(document.createTextNode(procesobanconomina.getnumero_secuenciales().toString().trim()));
		element.appendChild(elementnumero_secuenciales);

		Element elementgenera_texto = document.createElement(ProcesoBancoNominaConstantesFunciones.GENERATEXTO);
		elementgenera_texto.appendChild(document.createTextNode(procesobanconomina.getgenera_texto().toString().trim()));
		element.appendChild(elementgenera_texto);

		Element elementgenera_excel = document.createElement(ProcesoBancoNominaConstantesFunciones.GENERAEXCEL);
		elementgenera_excel.appendChild(document.createTextNode(procesobanconomina.getgenera_excel().toString().trim()));
		element.appendChild(elementgenera_excel);
	}
	
	public void generarReporteGroupGenericoProcesoBancoNominasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoBancoNomina> procesobanconominasSeleccionados=new ArrayList<ProcesoBancoNomina>();
		
		procesobanconominasSeleccionados=this.getProcesoBancoNominasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoBancoNomina(procesobanconominasSeleccionados);
		
		this.generarReporteProcesoBancoNominas("Todos",procesobanconominasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoBancoNomina(ArrayList<ProcesoBancoNomina> procesobanconominasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoBancoNomina procesobanconominaAux:procesobanconominasSeleccionados) {
				procesobanconominaAux.setsDetalleGeneralEntityReporte(procesobanconominaAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoBancoNominaConstantesFunciones.LABEL_IDBANCO)) {
					existe=true;
					procesobanconominaAux.setsDescripcionGeneralEntityReporte1(procesobanconominaAux.getbanco_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoBancoNominaConstantesFunciones.LABEL_IDCUENTABANCO)) {
					existe=true;
					procesobanconominaAux.setsDescripcionGeneralEntityReporte1(procesobanconominaAux.getcuentabanco_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOCONTRATO)) {
					existe=true;
					procesobanconominaAux.setsDescripcionGeneralEntityReporte1(procesobanconominaAux.gettipocontrato_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOBANCODISCO)) {
					existe=true;
					procesobanconominaAux.setsDescripcionGeneralEntityReporte1(procesobanconominaAux.gettipobancodisco_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoBancoNominaConstantesFunciones.LABEL_CONOTROS)) {
					existe=true;
					procesobanconominaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(procesobanconominaAux.getcon_otros()));
				}
				 else if(sTipoSeleccionar.equals(ProcesoBancoNominaConstantesFunciones.LABEL_CONINTERNET)) {
					existe=true;
					procesobanconominaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(procesobanconominaAux.getcon_internet()));
				}
				 else if(sTipoSeleccionar.equals(ProcesoBancoNominaConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					procesobanconominaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(procesobanconominaAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(ProcesoBancoNominaConstantesFunciones.LABEL_NUMEROSECUENCIALES)) {
					existe=true;
					procesobanconominaAux.setsDescripcionGeneralEntityReporte1(procesobanconominaAux.getnumero_secuenciales().toString());
				}
				 else if(sTipoSeleccionar.equals(ProcesoBancoNominaConstantesFunciones.LABEL_GENERATEXTO)) {
					existe=true;
					procesobanconominaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(procesobanconominaAux.getgenera_texto()));
				}
				 else if(sTipoSeleccionar.equals(ProcesoBancoNominaConstantesFunciones.LABEL_GENERAEXCEL)) {
					existe=true;
					procesobanconominaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(procesobanconominaAux.getgenera_excel()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoBancoNominaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoBancoNomina(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoBancoNomina=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoBancoNomina=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoBancoNomina=false;
			this.isVisibilidadCeldaActualizarProcesoBancoNomina=false;
			this.isVisibilidadCeldaEliminarProcesoBancoNomina=false;
			this.isVisibilidadCeldaCancelarProcesoBancoNomina=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoBancoNomina=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoBancoNomina=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoBancoNomina=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoBancoNomina=false;
			this.isVisibilidadCeldaModificarProcesoBancoNomina=false;
			this.isVisibilidadCeldaActualizarProcesoBancoNomina=true;
			this.isVisibilidadCeldaEliminarProcesoBancoNomina=false;
			this.isVisibilidadCeldaCancelarProcesoBancoNomina=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoBancoNomina=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoBancoNomina=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoBancoNomina=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoBancoNomina=false;
			this.isVisibilidadCeldaModificarProcesoBancoNomina=false;
			this.isVisibilidadCeldaActualizarProcesoBancoNomina=true;
			this.isVisibilidadCeldaEliminarProcesoBancoNomina=true;
			this.isVisibilidadCeldaCancelarProcesoBancoNomina=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoBancoNomina=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoBancoNomina=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoBancoNomina=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoBancoNomina=false;
			this.isVisibilidadCeldaModificarProcesoBancoNomina=false;
			this.isVisibilidadCeldaActualizarProcesoBancoNomina=true;
			this.isVisibilidadCeldaEliminarProcesoBancoNomina=false;
			this.isVisibilidadCeldaCancelarProcesoBancoNomina=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoBancoNomina=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoBancoNomina=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoBancoNomina=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoBancoNomina=true;
			this.isVisibilidadCeldaModificarProcesoBancoNomina=false;
			this.isVisibilidadCeldaActualizarProcesoBancoNomina=false;
			this.isVisibilidadCeldaEliminarProcesoBancoNomina=false;
			this.isVisibilidadCeldaCancelarProcesoBancoNomina=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoBancoNomina=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoBancoNomina=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoBancoNomina=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoBancoNomina=false;
			this.isVisibilidadCeldaActualizarProcesoBancoNomina=false;
			this.isVisibilidadCeldaEliminarProcesoBancoNomina=false;
			this.isVisibilidadCeldaCancelarProcesoBancoNomina=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoBancoNomina=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoBancoNomina=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoBancoNomina=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoBancoNomina=false;
			this.isVisibilidadCeldaModificarProcesoBancoNomina=true;
			this.isVisibilidadCeldaActualizarProcesoBancoNomina=false;
			this.isVisibilidadCeldaEliminarProcesoBancoNomina=false;
			this.isVisibilidadCeldaCancelarProcesoBancoNomina=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoBancoNomina=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoBancoNomina=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoBancoNominaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoBancoNomina=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoBancoNomina=true;
		} else {
			this.actualizarEstadoPanelsProcesoBancoNomina(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoBancoNomina=false;
			//this.isVisibilidadCeldaVerFormProcesoBancoNomina=false;
			this.isVisibilidadCeldaDuplicarProcesoBancoNomina=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesobanconominaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoBancoNomina=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoBancoNomina=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesobanconominaSessionBean.getEsGuardarRelacionado()) {
			if(!procesobanconominaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina=false;												
			}
			
			this.jButtonCerrarProcesoBancoNomina.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina=false;
		}
		
		if(!this.permiteMantenimiento(this.procesobanconomina)) {
			this.isVisibilidadCeldaActualizarProcesoBancoNomina=false;
			this.isVisibilidadCeldaEliminarProcesoBancoNomina=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoBancoNomina=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoBancoNomina=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoBancoNomina=false;
		//this.isVisibilidadCeldaModificarProcesoBancoNomina=true;
		this.isVisibilidadCeldaActualizarProcesoBancoNomina=false;
		this.isVisibilidadCeldaEliminarProcesoBancoNomina=false;
		//this.isVisibilidadCeldaCancelarProcesoBancoNomina=true;			
		this.isVisibilidadCeldaGuardarProcesoBancoNomina=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoBancoNomina() {
	}
	
	public void actualizarEstadoPanelsProcesoBancoNomina(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoBancoNomina!=null) {
				this.jScrollPanelDatosEdicionProcesoBancoNomina.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoBancoNomina!=null) {
				this.jTabbedPaneBusquedasProcesoBancoNomina.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoBancoNomina!=null) {
				this.jScrollPanelDatosProcesoBancoNomina.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoBancoNomina!=null) {
				this.jPanelPaginacionProcesoBancoNomina.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoBancoNomina!=null) {
				this.jPanelParametrosReportesProcesoBancoNomina.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoBancoNomina!=null) {
				this.jScrollPanelDatosEdicionProcesoBancoNomina.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoBancoNomina!=null) {
				this.jTabbedPaneBusquedasProcesoBancoNomina.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoBancoNomina!=null) {
				this.jScrollPanelDatosProcesoBancoNomina.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoBancoNomina!=null) {
				this.jPanelPaginacionProcesoBancoNomina.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoBancoNomina!=null) {
				this.jPanelParametrosReportesProcesoBancoNomina.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoBancoNomina!=null) {
				this.jScrollPanelDatosEdicionProcesoBancoNomina.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoBancoNomina!=null) {
				this.jTabbedPaneBusquedasProcesoBancoNomina.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoBancoNomina!=null) {
				this.jScrollPanelDatosProcesoBancoNomina.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoBancoNomina!=null) {
				this.jPanelPaginacionProcesoBancoNomina.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoBancoNomina!=null) {
				this.jPanelParametrosReportesProcesoBancoNomina.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoBancoNomina!=null) {
				this.jScrollPanelDatosEdicionProcesoBancoNomina.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoBancoNomina!=null) {
				this.jTabbedPaneBusquedasProcesoBancoNomina.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoBancoNomina!=null) {
				this.jScrollPanelDatosProcesoBancoNomina.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoBancoNomina!=null) {
				this.jPanelPaginacionProcesoBancoNomina.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoBancoNomina!=null) {
				this.jPanelParametrosReportesProcesoBancoNomina.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoBancoNomina!=null) {
				this.jScrollPanelDatosEdicionProcesoBancoNomina.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoBancoNomina!=null) {
				this.jTabbedPaneBusquedasProcesoBancoNomina.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoBancoNomina!=null) {
				this.jScrollPanelDatosProcesoBancoNomina.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoBancoNomina!=null) {
				this.jPanelPaginacionProcesoBancoNomina.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoBancoNomina!=null) {
				this.jPanelParametrosReportesProcesoBancoNomina.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoBancoNomina!=null) {
				this.jScrollPanelDatosEdicionProcesoBancoNomina.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoBancoNomina!=null) {
				this.jTabbedPaneBusquedasProcesoBancoNomina.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoBancoNomina!=null) {
				this.jScrollPanelDatosProcesoBancoNomina.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoBancoNomina!=null) {
				this.jPanelPaginacionProcesoBancoNomina.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoBancoNomina!=null) {
				this.jPanelParametrosReportesProcesoBancoNomina.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoBancoNomina!=null) {
				this.jScrollPanelDatosEdicionProcesoBancoNomina.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoBancoNomina!=null) {
				this.jTabbedPaneBusquedasProcesoBancoNomina.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoBancoNomina!=null) {
				this.jScrollPanelDatosProcesoBancoNomina.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoBancoNomina!=null) {
				this.jPanelPaginacionProcesoBancoNomina.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoBancoNomina!=null) {
				this.jPanelParametrosReportesProcesoBancoNomina.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoBancoNomina!=null) {
					this.jTabbedPaneBusquedasProcesoBancoNomina.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoBancoNomina!=null) {
				this.jPanelParametrosReportesProcesoBancoNomina.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoBancoNomina!=null) {
				this.jTabbedPaneBusquedasProcesoBancoNomina.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoBancoNomina!=null) {
				this.jPanelParametrosReportesProcesoBancoNomina.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaBanco(Boolean isParaBanco){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBancoNegation=!isParaBanco;

			this.isVisibilidadBusquedaProcesoBancoNomina=isParaBanco;
			if(!this.isVisibilidadBusquedaProcesoBancoNomina) {this.jTabbedPaneBusquedasProcesoBancoNomina.remove(jPanelBusquedaProcesoBancoNominaProcesoBancoNomina);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaBanco(Boolean isParaCuentaBanco){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaBancoNegation=!isParaCuentaBanco;

			this.isVisibilidadBusquedaProcesoBancoNomina=isParaCuentaBanco;
			if(!this.isVisibilidadBusquedaProcesoBancoNomina) {this.jTabbedPaneBusquedasProcesoBancoNomina.remove(jPanelBusquedaProcesoBancoNominaProcesoBancoNomina);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoContrato(Boolean isParaTipoContrato){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoContratoNegation=!isParaTipoContrato;

			this.isVisibilidadBusquedaProcesoBancoNomina=isParaTipoContrato;
			if(!this.isVisibilidadBusquedaProcesoBancoNomina) {this.jTabbedPaneBusquedasProcesoBancoNomina.remove(jPanelBusquedaProcesoBancoNominaProcesoBancoNomina);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoBancoDisco(Boolean isParaTipoBancoDisco){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoBancoDiscoNegation=!isParaTipoBancoDisco;

			this.isVisibilidadBusquedaProcesoBancoNomina=isParaTipoBancoDisco;
			if(!this.isVisibilidadBusquedaProcesoBancoNomina) {this.jTabbedPaneBusquedasProcesoBancoNomina.remove(jPanelBusquedaProcesoBancoNominaProcesoBancoNomina);}
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
			
			this.inicializarActualizarBindingTablaProcesoBancoNomina(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoBancoNomina() {
		this.updateBorderResaltarBusquedasFormularioProcesoBancoNomina();
		this.updateVisibilidadBusquedasFormularioProcesoBancoNomina();
		this.updateHabilitarBusquedasFormularioProcesoBancoNomina();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoBancoNomina() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoBancoNomina.getComponents().length>0) {
	

		if(this.procesobanconominaConstantesFunciones.resaltarBusquedaProcesoBancoNominaProcesoBancoNomina!=null) {
			index= this.jTabbedPaneBusquedasProcesoBancoNomina.indexOfComponent(this.jPanelBusquedaProcesoBancoNominaProcesoBancoNomina);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoBancoNomina.getComponent(index);
				jPanel.setBorder(this.procesobanconominaConstantesFunciones.resaltarBusquedaProcesoBancoNominaProcesoBancoNomina);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoBancoNomina() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoBancoNomina.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoBancoNomina.indexOfComponent(this.jPanelBusquedaProcesoBancoNominaProcesoBancoNomina);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoBancoNomina.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesobanconominaConstantesFunciones.mostrarBusquedaProcesoBancoNominaProcesoBancoNomina);
			if(!this.procesobanconominaConstantesFunciones.mostrarBusquedaProcesoBancoNominaProcesoBancoNomina && index>-1) {
				this.jTabbedPaneBusquedasProcesoBancoNomina.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoBancoNomina() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoBancoNomina.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoBancoNomina.indexOfComponent(this.jPanelBusquedaProcesoBancoNominaProcesoBancoNomina);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoBancoNomina.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesobanconominaConstantesFunciones.activarBusquedaProcesoBancoNominaProcesoBancoNomina);
				this.jTabbedPaneBusquedasProcesoBancoNomina.setEnabledAt(index,this.procesobanconominaConstantesFunciones.activarBusquedaProcesoBancoNominaProcesoBancoNomina);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoBancoNomina(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoBancoNomina")) {
			index= this.jTabbedPaneBusquedasProcesoBancoNomina.indexOfComponent(this.jPanelBusquedaProcesoBancoNominaProcesoBancoNomina);

			this.jTabbedPaneBusquedasProcesoBancoNomina.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoBancoNomina.getComponent(index);

			this.procesobanconominaConstantesFunciones.setResaltarBusquedaProcesoBancoNominaProcesoBancoNomina(resaltar);

			jPanel.setBorder(this.procesobanconominaConstantesFunciones.resaltarBusquedaProcesoBancoNominaProcesoBancoNomina);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoBancoNomina.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoBancoNomina() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoBancoNomina==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoBancoNomina();
		this.updateVisibilidadResaltarControlesFormularioProcesoBancoNomina();
		this.updateHabilitarResaltarControlesFormularioProcesoBancoNomina();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoBancoNomina() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoBancoNomina==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesobanconominaConstantesFunciones.resaltaridProcesoBancoNomina!=null && this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {this.jInternalFrameDetalleFormProcesoBancoNomina.jTextFieldidProcesoBancoNomina.setBorder(this.procesobanconominaConstantesFunciones.resaltaridProcesoBancoNomina);}
		if(this.procesobanconominaConstantesFunciones.resaltarid_bancoProcesoBancoNomina!=null && this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_bancoProcesoBancoNomina.setBorder(this.procesobanconominaConstantesFunciones.resaltarid_bancoProcesoBancoNomina);}
		if(this.procesobanconominaConstantesFunciones.resaltarid_cuenta_bancoProcesoBancoNomina!=null && this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_cuenta_bancoProcesoBancoNomina.setBorder(this.procesobanconominaConstantesFunciones.resaltarid_cuenta_bancoProcesoBancoNomina);}
		if(this.procesobanconominaConstantesFunciones.resaltarid_tipo_contratoProcesoBancoNomina!=null && this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_contratoProcesoBancoNomina.setBorder(this.procesobanconominaConstantesFunciones.resaltarid_tipo_contratoProcesoBancoNomina);}
		if(this.procesobanconominaConstantesFunciones.resaltarid_tipo_banco_discoProcesoBancoNomina!=null && this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_banco_discoProcesoBancoNomina.setBorder(this.procesobanconominaConstantesFunciones.resaltarid_tipo_banco_discoProcesoBancoNomina);}
		if(this.procesobanconominaConstantesFunciones.resaltarcon_otrosProcesoBancoNomina!=null && this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxcon_otrosProcesoBancoNomina.setBorderPainted(true);this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxcon_otrosProcesoBancoNomina.setBorder(this.procesobanconominaConstantesFunciones.resaltarcon_otrosProcesoBancoNomina);}
		if(this.procesobanconominaConstantesFunciones.resaltarcon_internetProcesoBancoNomina!=null && this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxcon_internetProcesoBancoNomina.setBorderPainted(true);this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxcon_internetProcesoBancoNomina.setBorder(this.procesobanconominaConstantesFunciones.resaltarcon_internetProcesoBancoNomina);}
		if(this.procesobanconominaConstantesFunciones.resaltarfechaProcesoBancoNomina!=null && this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {this.jInternalFrameDetalleFormProcesoBancoNomina.jDateChooserfechaProcesoBancoNomina.setBorder(this.procesobanconominaConstantesFunciones.resaltarfechaProcesoBancoNomina);}
		if(this.procesobanconominaConstantesFunciones.resaltarnumero_secuencialesProcesoBancoNomina!=null && this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {this.jInternalFrameDetalleFormProcesoBancoNomina.jTextFieldnumero_secuencialesProcesoBancoNomina.setBorder(this.procesobanconominaConstantesFunciones.resaltarnumero_secuencialesProcesoBancoNomina);}
		if(this.procesobanconominaConstantesFunciones.resaltargenera_textoProcesoBancoNomina!=null && this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxgenera_textoProcesoBancoNomina.setBorderPainted(true);this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxgenera_textoProcesoBancoNomina.setBorder(this.procesobanconominaConstantesFunciones.resaltargenera_textoProcesoBancoNomina);}
		if(this.procesobanconominaConstantesFunciones.resaltargenera_excelProcesoBancoNomina!=null && this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxgenera_excelProcesoBancoNomina.setBorderPainted(true);this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxgenera_excelProcesoBancoNomina.setBorder(this.procesobanconominaConstantesFunciones.resaltargenera_excelProcesoBancoNomina);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoBancoNomina() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoBancoNomina==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
	
		//this.jInternalFrameDetalleFormProcesoBancoNomina.jTextFieldidProcesoBancoNomina.setVisible(this.procesobanconominaConstantesFunciones.mostraridProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jPanelidProcesoBancoNomina.setVisible(this.procesobanconominaConstantesFunciones.mostraridProcesoBancoNomina);
		//this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_bancoProcesoBancoNomina.setVisible(this.procesobanconominaConstantesFunciones.mostrarid_bancoProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jPanelid_bancoProcesoBancoNomina.setVisible(this.procesobanconominaConstantesFunciones.mostrarid_bancoProcesoBancoNomina);
		//this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_cuenta_bancoProcesoBancoNomina.setVisible(this.procesobanconominaConstantesFunciones.mostrarid_cuenta_bancoProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jPanelid_cuenta_bancoProcesoBancoNomina.setVisible(this.procesobanconominaConstantesFunciones.mostrarid_cuenta_bancoProcesoBancoNomina);
		//this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_contratoProcesoBancoNomina.setVisible(this.procesobanconominaConstantesFunciones.mostrarid_tipo_contratoProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jPanelid_tipo_contratoProcesoBancoNomina.setVisible(this.procesobanconominaConstantesFunciones.mostrarid_tipo_contratoProcesoBancoNomina);
		//this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_banco_discoProcesoBancoNomina.setVisible(this.procesobanconominaConstantesFunciones.mostrarid_tipo_banco_discoProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jPanelid_tipo_banco_discoProcesoBancoNomina.setVisible(this.procesobanconominaConstantesFunciones.mostrarid_tipo_banco_discoProcesoBancoNomina);
		//this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxcon_otrosProcesoBancoNomina.setVisible(this.procesobanconominaConstantesFunciones.mostrarcon_otrosProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jPanelcon_otrosProcesoBancoNomina.setVisible(this.procesobanconominaConstantesFunciones.mostrarcon_otrosProcesoBancoNomina);
		//this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxcon_internetProcesoBancoNomina.setVisible(this.procesobanconominaConstantesFunciones.mostrarcon_internetProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jPanelcon_internetProcesoBancoNomina.setVisible(this.procesobanconominaConstantesFunciones.mostrarcon_internetProcesoBancoNomina);
		//this.jInternalFrameDetalleFormProcesoBancoNomina.jDateChooserfechaProcesoBancoNomina.setVisible(this.procesobanconominaConstantesFunciones.mostrarfechaProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jPanelfechaProcesoBancoNomina.setVisible(this.procesobanconominaConstantesFunciones.mostrarfechaProcesoBancoNomina);
		//this.jInternalFrameDetalleFormProcesoBancoNomina.jTextFieldnumero_secuencialesProcesoBancoNomina.setVisible(this.procesobanconominaConstantesFunciones.mostrarnumero_secuencialesProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jPanelnumero_secuencialesProcesoBancoNomina.setVisible(this.procesobanconominaConstantesFunciones.mostrarnumero_secuencialesProcesoBancoNomina);
		//this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxgenera_textoProcesoBancoNomina.setVisible(this.procesobanconominaConstantesFunciones.mostrargenera_textoProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jPanelgenera_textoProcesoBancoNomina.setVisible(this.procesobanconominaConstantesFunciones.mostrargenera_textoProcesoBancoNomina);
		//this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxgenera_excelProcesoBancoNomina.setVisible(this.procesobanconominaConstantesFunciones.mostrargenera_excelProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jPanelgenera_excelProcesoBancoNomina.setVisible(this.procesobanconominaConstantesFunciones.mostrargenera_excelProcesoBancoNomina);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoBancoNomina() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoBancoNomina==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoBancoNomina!=null) {
	
		this.jInternalFrameDetalleFormProcesoBancoNomina.jTextFieldidProcesoBancoNomina.setEnabled(this.procesobanconominaConstantesFunciones.activaridProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_bancoProcesoBancoNomina.setEnabled(this.procesobanconominaConstantesFunciones.activarid_bancoProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_cuenta_bancoProcesoBancoNomina.setEnabled(this.procesobanconominaConstantesFunciones.activarid_cuenta_bancoProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_contratoProcesoBancoNomina.setEnabled(this.procesobanconominaConstantesFunciones.activarid_tipo_contratoProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jComboBoxid_tipo_banco_discoProcesoBancoNomina.setEnabled(this.procesobanconominaConstantesFunciones.activarid_tipo_banco_discoProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxcon_otrosProcesoBancoNomina.setEnabled(this.procesobanconominaConstantesFunciones.activarcon_otrosProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxcon_internetProcesoBancoNomina.setEnabled(this.procesobanconominaConstantesFunciones.activarcon_internetProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jDateChooserfechaProcesoBancoNomina.setEnabled(this.procesobanconominaConstantesFunciones.activarfechaProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jTextFieldnumero_secuencialesProcesoBancoNomina.setEnabled(this.procesobanconominaConstantesFunciones.activarnumero_secuencialesProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxgenera_textoProcesoBancoNomina.setEnabled(this.procesobanconominaConstantesFunciones.activargenera_textoProcesoBancoNomina);
		this.jInternalFrameDetalleFormProcesoBancoNomina.jCheckBoxgenera_excelProcesoBancoNomina.setEnabled(this.procesobanconominaConstantesFunciones.activargenera_excelProcesoBancoNomina);
		}
	}
	
		
}