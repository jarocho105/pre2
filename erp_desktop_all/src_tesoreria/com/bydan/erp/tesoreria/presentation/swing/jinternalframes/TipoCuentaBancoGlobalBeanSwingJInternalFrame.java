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

import com.bydan.erp.tesoreria.util.TipoCuentaBancoGlobalConstantesFunciones;
import com.bydan.erp.tesoreria.util.TipoCuentaBancoGlobalParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.TipoCuentaBancoGlobalParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.TipoCuentaBancoGlobalBean;
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

import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoCuentaBancoGlobalBeanSwingJInternalFrame extends TipoCuentaBancoGlobalJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoCuentaBancoGlobalBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoCuentaBancoGlobal> tipocuentabancoglobalValidator = new ClassValidator<TipoCuentaBancoGlobal>(TipoCuentaBancoGlobal.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoCuentaBancoGlobal tipocuentabancoglobal;	
	public TipoCuentaBancoGlobal tipocuentabancoglobalAux;
	public TipoCuentaBancoGlobal tipocuentabancoglobalAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoCuentaBancoGlobal tipocuentabancoglobalTotales;
	public Long idTipoCuentaBancoGlobalActual;
	public Long iIdNuevoTipoCuentaBancoGlobal=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosBancoTipoCuentaBancoGlobal=false;

	public Boolean getIsTienePermisosBancoTipoCuentaBancoGlobal() {
		return isTienePermisosBancoTipoCuentaBancoGlobal;
	}

	public void setIsTienePermisosBancoTipoCuentaBancoGlobal(Boolean isTienePermisosBancoTipoCuentaBancoGlobal) {
		this.isTienePermisosBancoTipoCuentaBancoGlobal= isTienePermisosBancoTipoCuentaBancoGlobal;
	}


	public Boolean isTienePermisosDatoGeneralEmpleado=false;

	public Boolean getIsTienePermisosDatoGeneralEmpleado() {
		return isTienePermisosDatoGeneralEmpleado;
	}

	public void setIsTienePermisosDatoGeneralEmpleado(Boolean isTienePermisosDatoGeneralEmpleado) {
		this.isTienePermisosDatoGeneralEmpleado= isTienePermisosDatoGeneralEmpleado;
	}


	public Boolean isTienePermisosPoliticasCliente=false;

	public Boolean getIsTienePermisosPoliticasCliente() {
		return isTienePermisosPoliticasCliente;
	}

	public void setIsTienePermisosPoliticasCliente(Boolean isTienePermisosPoliticasCliente) {
		this.isTienePermisosPoliticasCliente= isTienePermisosPoliticasCliente;
	}


	public Boolean isTienePermisosEmpleado=false;

	public Boolean getIsTienePermisosEmpleado() {
		return isTienePermisosEmpleado;
	}

	public void setIsTienePermisosEmpleado(Boolean isTienePermisosEmpleado) {
		this.isTienePermisosEmpleado= isTienePermisosEmpleado;
	}


	public Boolean isTienePermisosParametroTesoreriaDefecto=false;

	public Boolean getIsTienePermisosParametroTesoreriaDefecto() {
		return isTienePermisosParametroTesoreriaDefecto;
	}

	public void setIsTienePermisosParametroTesoreriaDefecto(Boolean isTienePermisosParametroTesoreriaDefecto) {
		this.isTienePermisosParametroTesoreriaDefecto= isTienePermisosParametroTesoreriaDefecto;
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
	
	public Boolean isPermisoTodoTipoCuentaBancoGlobal;
	public Boolean isPermisoNuevoTipoCuentaBancoGlobal;
	public Boolean isPermisoActualizarTipoCuentaBancoGlobal;
	public Boolean isPermisoActualizarOriginalTipoCuentaBancoGlobal;
	public Boolean isPermisoEliminarTipoCuentaBancoGlobal;
	public Boolean isPermisoGuardarCambiosTipoCuentaBancoGlobal;
	public Boolean isPermisoConsultaTipoCuentaBancoGlobal;
	public Boolean isPermisoBusquedaTipoCuentaBancoGlobal;
	public Boolean isPermisoReporteTipoCuentaBancoGlobal;
	public Boolean isPermisoPaginacionMedioTipoCuentaBancoGlobal;
	public Boolean isPermisoPaginacionAltoTipoCuentaBancoGlobal;
	public Boolean isPermisoPaginacionTodoTipoCuentaBancoGlobal;
	public Boolean isPermisoCopiarTipoCuentaBancoGlobal;
	public Boolean isPermisoVerFormTipoCuentaBancoGlobal;
	public Boolean isPermisoDuplicarTipoCuentaBancoGlobal;
	public Boolean isPermisoOrdenTipoCuentaBancoGlobal;
	
	
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
	
	public TipoCuentaBancoGlobalParameterReturnGeneral tipocuentabancoglobalReturnGeneral;
	public TipoCuentaBancoGlobalParameterReturnGeneral tipocuentabancoglobalParameterGeneral;
	
	

	public BancoTipoCuentaBancoGlobalLogic bancotipocuentabancoglobalLogic=null;

	public BancoTipoCuentaBancoGlobalLogic getBancoTipoCuentaBancoGlobalLogic() {
		return bancotipocuentabancoglobalLogic;
	}

	public void setBancoTipoCuentaBancoGlobalLogic(BancoTipoCuentaBancoGlobalLogic bancotipocuentabancoglobalLogic) {
		this.bancotipocuentabancoglobalLogic = bancotipocuentabancoglobalLogic;
	}


	public DatoGeneralEmpleadoLogic datogeneralempleadoLogic=null;

	public DatoGeneralEmpleadoLogic getDatoGeneralEmpleadoLogic() {
		return datogeneralempleadoLogic;
	}

	public void setDatoGeneralEmpleadoLogic(DatoGeneralEmpleadoLogic datogeneralempleadoLogic) {
		this.datogeneralempleadoLogic = datogeneralempleadoLogic;
	}


	public PoliticasClienteLogic politicasclienteLogic=null;

	public PoliticasClienteLogic getPoliticasClienteLogic() {
		return politicasclienteLogic;
	}

	public void setPoliticasClienteLogic(PoliticasClienteLogic politicasclienteLogic) {
		this.politicasclienteLogic = politicasclienteLogic;
	}


	public EmpleadoLogic empleadoLogic=null;

	public EmpleadoLogic getEmpleadoLogic() {
		return empleadoLogic;
	}

	public void setEmpleadoLogic(EmpleadoLogic empleadoLogic) {
		this.empleadoLogic = empleadoLogic;
	}


	public ParametroTesoreriaDefectoLogic parametrotesoreriadefectoLogic=null;

	public ParametroTesoreriaDefectoLogic getParametroTesoreriaDefectoLogic() {
		return parametrotesoreriadefectoLogic;
	}

	public void setParametroTesoreriaDefectoLogic(ParametroTesoreriaDefectoLogic parametrotesoreriadefectoLogic) {
		this.parametrotesoreriadefectoLogic = parametrotesoreriadefectoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoCuentaBancoGlobal=false;
	public Boolean esParaAccionDesdeFormularioTipoCuentaBancoGlobal=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoCuentaBancoGlobalLogic tipocuentabancoglobalLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoCuentaBancoGlobal tipocuentabancoglobalBean;
	public TipoCuentaBancoGlobalConstantesFunciones tipocuentabancoglobalConstantesFunciones;
	//public TipoCuentaBancoGlobalParameterReturnGeneral tipocuentabancoglobalReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoCuentaBancoGlobal> tipocuentabancoglobals;	
	//public List<TipoCuentaBancoGlobal> tipocuentabancoglobalsEliminados;
	//public List<TipoCuentaBancoGlobal> tipocuentabancoglobalsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoCuentaBancoGlobal=false;
	public Boolean isVisibilidadCeldaDuplicarTipoCuentaBancoGlobal=true;
	public Boolean isVisibilidadCeldaCopiarTipoCuentaBancoGlobal=true;
	public Boolean isVisibilidadCeldaVerFormTipoCuentaBancoGlobal=true;
	public Boolean isVisibilidadCeldaOrdenTipoCuentaBancoGlobal=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal=false;
	public Boolean isVisibilidadCeldaModificarTipoCuentaBancoGlobal=false;
	public Boolean isVisibilidadCeldaActualizarTipoCuentaBancoGlobal=false;
	public Boolean isVisibilidadCeldaEliminarTipoCuentaBancoGlobal=false;
	public Boolean isVisibilidadCeldaCancelarTipoCuentaBancoGlobal=false;
	public Boolean isVisibilidadCeldaGuardarTipoCuentaBancoGlobal=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal=false;	
	
	
	
	public Long getiIdNuevoTipoCuentaBancoGlobal() {
		return this.iIdNuevoTipoCuentaBancoGlobal;
	}

	public void setiIdNuevoTipoCuentaBancoGlobal(Long iIdNuevoTipoCuentaBancoGlobal) {
		this.iIdNuevoTipoCuentaBancoGlobal = iIdNuevoTipoCuentaBancoGlobal;
	}
	
	public Long getidTipoCuentaBancoGlobalActual() {
		return this.idTipoCuentaBancoGlobalActual;
	}

	public void setidTipoCuentaBancoGlobalActual(Long idTipoCuentaBancoGlobalActual) {
		this.idTipoCuentaBancoGlobalActual = idTipoCuentaBancoGlobalActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoCuentaBancoGlobal gettipocuentabancoglobal() {
		return this.tipocuentabancoglobal;
	}

	public void settipocuentabancoglobal(TipoCuentaBancoGlobal tipocuentabancoglobal) {
		this.tipocuentabancoglobal = tipocuentabancoglobal;
	}
	
	public TipoCuentaBancoGlobal gettipocuentabancoglobalAux() {
		return this.tipocuentabancoglobalAux;
	}

	public void settipocuentabancoglobalAux(TipoCuentaBancoGlobal tipocuentabancoglobalAux) {
		this.tipocuentabancoglobalAux = tipocuentabancoglobalAux;
	}				
	
	public TipoCuentaBancoGlobal gettipocuentabancoglobalAnterior() {
		return this.tipocuentabancoglobalAnterior;
	}

	public void settipocuentabancoglobalAnterior(TipoCuentaBancoGlobal tipocuentabancoglobalAnterior) {
		this.tipocuentabancoglobalAnterior = tipocuentabancoglobalAnterior;
	}	
	
	public TipoCuentaBancoGlobal gettipocuentabancoglobalTotales() {
		return this.tipocuentabancoglobalTotales;
	}

	public void settipocuentabancoglobalTotales(TipoCuentaBancoGlobal tipocuentabancoglobalTotales) {
		this.tipocuentabancoglobalTotales = tipocuentabancoglobalTotales;
	}	
	
	public TipoCuentaBancoGlobal gettipocuentabancoglobalBean() {
		return this.tipocuentabancoglobalBean;
	}

	public void settipocuentabancoglobalBean(TipoCuentaBancoGlobal tipocuentabancoglobalBean) {
		this.tipocuentabancoglobalBean = tipocuentabancoglobalBean;
	}	
	
	public TipoCuentaBancoGlobalParameterReturnGeneral gettipocuentabancoglobalReturnGeneral() {
		return this.tipocuentabancoglobalReturnGeneral;
	}

	public void settipocuentabancoglobalReturnGeneral(TipoCuentaBancoGlobalParameterReturnGeneral tipocuentabancoglobalReturnGeneral) {
		this.tipocuentabancoglobalReturnGeneral = tipocuentabancoglobalReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoCuentaBancoGlobalLogic getTipoCuentaBancoGlobalLogic()	{		
		return tipocuentabancoglobalLogic;
	}

	public void setTipoCuentaBancoGlobalLogic(TipoCuentaBancoGlobalLogic tipocuentabancoglobalLogic) {
		this.tipocuentabancoglobalLogic = tipocuentabancoglobalLogic;
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
	
	public Boolean getIsEsNuevoTipoCuentaBancoGlobal() {
		return isEsNuevoTipoCuentaBancoGlobal;
	}

	public void setIsEsNuevoTipoCuentaBancoGlobal(Boolean isEsNuevoTipoCuentaBancoGlobal) {
		this.isEsNuevoTipoCuentaBancoGlobal = isEsNuevoTipoCuentaBancoGlobal;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoCuentaBancoGlobal() {
		return esParaAccionDesdeFormularioTipoCuentaBancoGlobal;
	}
	
	public void setEsParaAccionDesdeFormularioTipoCuentaBancoGlobal(Boolean esParaAccionDesdeFormularioTipoCuentaBancoGlobal) {
		this.esParaAccionDesdeFormularioTipoCuentaBancoGlobal = esParaAccionDesdeFormularioTipoCuentaBancoGlobal;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoCuentaBancoGlobal() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoCuentaBancoGlobalConstantesFunciones.refrescarForeignKeysDescripcionesTipoCuentaBancoGlobal(this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoCuentaBancoGlobalConstantesFunciones.refrescarForeignKeysDescripcionesTipoCuentaBancoGlobal(this.tipocuentabancoglobals);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocuentabancoglobalLogic.setTipoCuentaBancoGlobals(this.tipocuentabancoglobals);
			tipocuentabancoglobalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoCuentaBancoGlobalParameterReturnGeneral getTipoCuentaBancoGlobalParameterGeneral() {
		return this.tipocuentabancoglobalParameterGeneral;
	}
	
	public void setTipoCuentaBancoGlobalParameterGeneral(TipoCuentaBancoGlobalParameterReturnGeneral tipocuentabancoglobalParameterGeneral) {
		this.tipocuentabancoglobalParameterGeneral = tipocuentabancoglobalParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoCuentaBancoGlobal() {
		return isPermisoTodoTipoCuentaBancoGlobal;
	}

	public void setIsPermisoTodoTipoCuentaBancoGlobal(Boolean isPermisoTodoTipoCuentaBancoGlobal) {
		this.isPermisoTodoTipoCuentaBancoGlobal = isPermisoTodoTipoCuentaBancoGlobal;
	}

	public Boolean getIsPermisoNuevoTipoCuentaBancoGlobal() {
		return isPermisoNuevoTipoCuentaBancoGlobal;
	}

	public void setIsPermisoNuevoTipoCuentaBancoGlobal(Boolean isPermisoNuevoTipoCuentaBancoGlobal) {
		this.isPermisoNuevoTipoCuentaBancoGlobal = isPermisoNuevoTipoCuentaBancoGlobal;
	}

	public Boolean getIsPermisoActualizarTipoCuentaBancoGlobal() {
		return isPermisoActualizarTipoCuentaBancoGlobal;
	}

	public void setIsPermisoActualizarTipoCuentaBancoGlobal(Boolean isPermisoActualizarTipoCuentaBancoGlobal) {
		this.isPermisoActualizarTipoCuentaBancoGlobal = isPermisoActualizarTipoCuentaBancoGlobal;
	}

	public Boolean getIsPermisoEliminarTipoCuentaBancoGlobal() {
		return isPermisoEliminarTipoCuentaBancoGlobal;
	}

	public void setIsPermisoEliminarTipoCuentaBancoGlobal(Boolean isPermisoEliminarTipoCuentaBancoGlobal) {
		this.isPermisoEliminarTipoCuentaBancoGlobal = isPermisoEliminarTipoCuentaBancoGlobal;
	}

	public Boolean getIsPermisoGuardarCambiosTipoCuentaBancoGlobal() {
		return isPermisoGuardarCambiosTipoCuentaBancoGlobal;
	}

	public void setIsPermisoGuardarCambiosTipoCuentaBancoGlobal(Boolean isPermisoGuardarCambiosTipoCuentaBancoGlobal) {
		this.isPermisoGuardarCambiosTipoCuentaBancoGlobal = isPermisoGuardarCambiosTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsPermisoConsultaTipoCuentaBancoGlobal() {
		return isPermisoConsultaTipoCuentaBancoGlobal;
	}

	public void setIsPermisoConsultaTipoCuentaBancoGlobal(Boolean isPermisoConsultaTipoCuentaBancoGlobal) {
		this.isPermisoConsultaTipoCuentaBancoGlobal = isPermisoConsultaTipoCuentaBancoGlobal;
	}

	public Boolean getIsPermisoBusquedaTipoCuentaBancoGlobal() {
		return isPermisoBusquedaTipoCuentaBancoGlobal;
	}

	public void setIsPermisoBusquedaTipoCuentaBancoGlobal(Boolean isPermisoBusquedaTipoCuentaBancoGlobal) {
		this.isPermisoBusquedaTipoCuentaBancoGlobal = isPermisoBusquedaTipoCuentaBancoGlobal;
	}

	public Boolean getIsPermisoReporteTipoCuentaBancoGlobal() {
		return isPermisoReporteTipoCuentaBancoGlobal;
	}

	public void setIsPermisoReporteTipoCuentaBancoGlobal(Boolean isPermisoReporteTipoCuentaBancoGlobal) {
		this.isPermisoReporteTipoCuentaBancoGlobal = isPermisoReporteTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoCuentaBancoGlobal() {
		return isPermisoPaginacionMedioTipoCuentaBancoGlobal;
	}

	public void setIsPermisoPaginacionMedioTipoCuentaBancoGlobal(Boolean isPermisoPaginacionMedioTipoCuentaBancoGlobal) {
		this.isPermisoPaginacionMedioTipoCuentaBancoGlobal = isPermisoPaginacionMedioTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoCuentaBancoGlobal() {
		return isPermisoPaginacionTodoTipoCuentaBancoGlobal;
	}

	public void setIsPermisoPaginacionTodoTipoCuentaBancoGlobal(Boolean isPermisoPaginacionTodoTipoCuentaBancoGlobal) {
		this.isPermisoPaginacionTodoTipoCuentaBancoGlobal = isPermisoPaginacionTodoTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoCuentaBancoGlobal() {
		return isPermisoPaginacionAltoTipoCuentaBancoGlobal;
	}

	public void setIsPermisoPaginacionAltoTipoCuentaBancoGlobal(Boolean isPermisoPaginacionAltoTipoCuentaBancoGlobal) {
		this.isPermisoPaginacionAltoTipoCuentaBancoGlobal = isPermisoPaginacionAltoTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsPermisoCopiarTipoCuentaBancoGlobal() {
		return isPermisoCopiarTipoCuentaBancoGlobal;
	}

	public void setIsPermisoCopiarTipoCuentaBancoGlobal(Boolean isPermisoCopiarTipoCuentaBancoGlobal) {
		this.isPermisoCopiarTipoCuentaBancoGlobal = isPermisoCopiarTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsPermisoVerFormTipoCuentaBancoGlobal() {
		return isPermisoVerFormTipoCuentaBancoGlobal;
	}

	public void setIsPermisoVerFormTipoCuentaBancoGlobal(Boolean isPermisoVerFormTipoCuentaBancoGlobal) {
		this.isPermisoVerFormTipoCuentaBancoGlobal = isPermisoVerFormTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsPermisoDuplicarTipoCuentaBancoGlobal() {
		return isPermisoDuplicarTipoCuentaBancoGlobal;
	}

	public void setIsPermisoDuplicarTipoCuentaBancoGlobal(Boolean isPermisoDuplicarTipoCuentaBancoGlobal) {
		this.isPermisoDuplicarTipoCuentaBancoGlobal = isPermisoDuplicarTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsPermisoOrdenTipoCuentaBancoGlobal() {
		return isPermisoOrdenTipoCuentaBancoGlobal;
	}

	public void setIsPermisoOrdenTipoCuentaBancoGlobal(Boolean isPermisoOrdenTipoCuentaBancoGlobal) {
		this.isPermisoOrdenTipoCuentaBancoGlobal = isPermisoOrdenTipoCuentaBancoGlobal;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaNuevoTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaNuevoTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaNuevoTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaNuevoTipoCuentaBancoGlobal = isVisibilidadCeldaNuevoTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaDuplicarTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaDuplicarTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaDuplicarTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaDuplicarTipoCuentaBancoGlobal = isVisibilidadCeldaDuplicarTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaCopiarTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaCopiarTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaCopiarTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaCopiarTipoCuentaBancoGlobal = isVisibilidadCeldaCopiarTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaVerFormTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaVerFormTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaVerFormTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaVerFormTipoCuentaBancoGlobal = isVisibilidadCeldaVerFormTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaOrdenTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaOrdenTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaOrdenTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaOrdenTipoCuentaBancoGlobal = isVisibilidadCeldaOrdenTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal = isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaModificarTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaModificarTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaModificarTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaModificarTipoCuentaBancoGlobal = isVisibilidadCeldaModificarTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaActualizarTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaActualizarTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaActualizarTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaActualizarTipoCuentaBancoGlobal = isVisibilidadCeldaActualizarTipoCuentaBancoGlobal;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaEliminarTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaEliminarTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaEliminarTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaEliminarTipoCuentaBancoGlobal = isVisibilidadCeldaEliminarTipoCuentaBancoGlobal;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaCancelarTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaCancelarTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaCancelarTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaCancelarTipoCuentaBancoGlobal = isVisibilidadCeldaCancelarTipoCuentaBancoGlobal;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaGuardarTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaGuardarTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaGuardarTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaGuardarTipoCuentaBancoGlobal = isVisibilidadCeldaGuardarTipoCuentaBancoGlobal;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal() {
		return isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal(Boolean isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal) {
		this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal = isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal;
	}
		
	public TipoCuentaBancoGlobalSessionBean gettipocuentabancoglobalSessionBean() {
		return this.tipocuentabancoglobalSessionBean;
	}
	
	public void settipocuentabancoglobalSessionBean(TipoCuentaBancoGlobalSessionBean tipocuentabancoglobalSessionBean) {
		this.tipocuentabancoglobalSessionBean=tipocuentabancoglobalSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGlobal(TipoCuentaBancoGlobal tipocuentabancoglobal)throws Exception {
		try {
			
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
	
	public void bugActualizarReferenciaActual(TipoCuentaBancoGlobal tipocuentabancoglobal,TipoCuentaBancoGlobal tipocuentabancoglobalAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoCuentaBancoGlobal(tipocuentabancoglobal);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocuentabancoglobalAux.setId(tipocuentabancoglobal.getId());
		tipocuentabancoglobalAux.setVersionRow(tipocuentabancoglobal.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoCuentaBancoGlobal();
		
			int intSelectedRow = this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoCuentaBancoGlobal(this.tipocuentabancoglobal,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGlobal(this.tipocuentabancoglobal);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocuentabancoglobalValidator.getInvalidValues(this.tipocuentabancoglobal);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocuentabancoglobalLogic.setDatosCliente(datosCliente);
			tipocuentabancoglobalLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocuentabancoglobalAux=new  TipoCuentaBancoGlobal();
				
				tipocuentabancoglobalAux.setIsNew(true);
				tipocuentabancoglobalAux.setIsChanged(true);
				
				tipocuentabancoglobalAux.setTipoCuentaBancoGlobalOriginal(this.tipocuentabancoglobal);
				
				tipocuentabancoglobalAux.setId(this.tipocuentabancoglobal.getId());	
				tipocuentabancoglobalAux.setVersionRow(this.tipocuentabancoglobal.getVersionRow());	
				tipocuentabancoglobalAux.setcodigo(this.tipocuentabancoglobal.getcodigo());	
				tipocuentabancoglobalAux.setnombre(this.tipocuentabancoglobal.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocuentabancoglobalAux,tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocuentabancoglobalAux,tipocuentabancoglobals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentabancoglobalLogic.saveTipoCuentaBancoGlobals();//WithConnection
						//tipocuentabancoglobalLogic.getSetVersionRowTipoCuentaBancoGlobals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocuentabancoglobal,tipocuentabancoglobalAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocuentabancoglobalAux=new  TipoCuentaBancoGlobal();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado() && this.tipocuentabancoglobal.getId()>=0)) {
						
					tipocuentabancoglobalAux.setIsNew(false);
				}
				
				tipocuentabancoglobalAux.setIsDeleted(false);
			
				tipocuentabancoglobalAux.setId(this.tipocuentabancoglobal.getId());	
				tipocuentabancoglobalAux.setVersionRow(this.tipocuentabancoglobal.getVersionRow());	
				tipocuentabancoglobalAux.setcodigo(this.tipocuentabancoglobal.getcodigo());	
				tipocuentabancoglobalAux.setnombre(this.tipocuentabancoglobal.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocuentabancoglobalAux,tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocuentabancoglobalAux,tipocuentabancoglobals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentabancoglobalLogic.saveTipoCuentaBancoGlobals();//WithConnection
						//tipocuentabancoglobalLogic.getSetVersionRowTipoCuentaBancoGlobals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocuentabancoglobal,tipocuentabancoglobalAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocuentabancoglobalAux=new  TipoCuentaBancoGlobal();
				
				tipocuentabancoglobalAux.setIsNew(false);
				tipocuentabancoglobalAux.setIsChanged(false);
				
				tipocuentabancoglobalAux.setIsDeleted(true);
				
				tipocuentabancoglobalAux.setId(this.tipocuentabancoglobal.getId());	
				tipocuentabancoglobalAux.setVersionRow(this.tipocuentabancoglobal.getVersionRow());	
				tipocuentabancoglobalAux.setcodigo(this.tipocuentabancoglobal.getcodigo());	
				tipocuentabancoglobalAux.setnombre(this.tipocuentabancoglobal.getnombre());	
				
				if(this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocuentabancoglobalAux.getId()>=0) {	
						this.tipocuentabancoglobalsEliminados.add(tipocuentabancoglobalAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocuentabancoglobalAux,tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocuentabancoglobalAux,tipocuentabancoglobals);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentabancoglobalLogic.saveTipoCuentaBancoGlobals();//WithConnection
						//tipocuentabancoglobalLogic.getSetVersionRowTipoCuentaBancoGlobals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocuentabancoglobalAux.setBancoTipoCuentaBancoGlobals(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals());

							if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocuentabancoglobalAux.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());

							if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocuentabancoglobalAux.setPoliticasClientes(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes());

							if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocuentabancoglobalAux.setEmpleados(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());

							if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocuentabancoglobalAux.setParametroTesoreriaDefectos(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipocuentabancoglobalAux,tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipocuentabancoglobalAux,tipocuentabancoglobals);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().addAll(this.tipocuentabancoglobalsEliminados);
					
					tipocuentabancoglobalLogic.saveTipoCuentaBancoGlobals();//WithConnection
					//tipocuentabancoglobalLogic.getSetVersionRowTipoCuentaBancoGlobals();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipocuentabancoglobalsEliminados= new ArrayList<TipoCuentaBancoGlobal>();		
			}
			
			if(this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Cuenta Banco Global GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Cuenta Banco Global",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocuentabancoglobal=tipocuentabancoglobalAux;
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
      		//this.finishProcessTipoCuentaBancoGlobal();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoCuentaBancoGlobal tipocuentabancoglobalLocal) throws Exception {
		
		if(this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipocuentabancoglobalLocal.setBancoTipoCuentaBancoGlobals(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals());
				tipocuentabancoglobalLocal.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
				tipocuentabancoglobalLocal.setPoliticasClientes(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes());
				tipocuentabancoglobalLocal.setEmpleados(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
				tipocuentabancoglobalLocal.setParametroTesoreriaDefectos(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos());
			
			} else {
			
				tipocuentabancoglobalLocal.setBancoTipoCuentaBancoGlobals(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.bancotipocuentabancoglobals);
				tipocuentabancoglobalLocal.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados);
				tipocuentabancoglobalLocal.setPoliticasClientes(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.politicasclientes);
				tipocuentabancoglobalLocal.setEmpleados(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.empleados);
				tipocuentabancoglobalLocal.setParametroTesoreriaDefectos(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.parametrotesoreriadefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoCuentaBancoGlobal tipocuentabancoglobalLocal) throws Exception {	
		if(this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoCuentaBancoGlobalActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocuentabancoglobalValidator.getInvalidValues(this.tipocuentabancoglobal);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoCuentaBancoGlobal tipocuentabancoglobal,List<TipoCuentaBancoGlobal> tipocuentabancoglobals) throws Exception {
		try	{		
			TipoCuentaBancoGlobalConstantesFunciones.actualizarLista(tipocuentabancoglobal,tipocuentabancoglobals,this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoCuentaBancoGlobal tipocuentabancoglobal,List<TipoCuentaBancoGlobal> tipocuentabancoglobals) throws Exception {
		try	{			
			TipoCuentaBancoGlobalConstantesFunciones.actualizarSelectedLista(tipocuentabancoglobal,tipocuentabancoglobals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoCuentaBancoGlobal> tipocuentabancoglobalsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocuentabancoglobalsLocal=this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocuentabancoglobalsLocal=this.tipocuentabancoglobals;
			}
			//ARCHITECTURE
		
			for(TipoCuentaBancoGlobal tipocuentabancoglobalLocal:tipocuentabancoglobalsLocal) {
				if(this.permiteMantenimiento(tipocuentabancoglobalLocal) && tipocuentabancoglobalLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoCuentaBancoGlobalConstantesFunciones.getTipoCuentaBancoGlobalLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoCuentaBancoGlobalConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jLabelcodigoTipoCuentaBancoGlobal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCuentaBancoGlobalConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jLabelnombreTipoCuentaBancoGlobal,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jLabelcodigoTipoCuentaBancoGlobal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jLabelnombreTipoCuentaBancoGlobal,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("BancoTipoCuentaBancoGlobal")) {
			if(this.tipocuentabancoglobal==null) {
				this.tipocuentabancoglobal= new TipoCuentaBancoGlobal();
			}

			if(this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoCuentaBancoGlobal
				this.setVariablesFormularioToObjetoActualTipoCuentaBancoGlobal(this.tipocuentabancoglobal,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGlobal(this.tipocuentabancoglobal);

				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.getbancotipocuentabancoglobal().setTipoCuentaBancoGlobal(this.tipocuentabancoglobal);
			}

			return;
		}
		 else  if(sTipo.equals("DatoGeneralEmpleado")) {
			if(this.tipocuentabancoglobal==null) {
				this.tipocuentabancoglobal= new TipoCuentaBancoGlobal();
			}

			if(this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoCuentaBancoGlobal
				this.setVariablesFormularioToObjetoActualTipoCuentaBancoGlobal(this.tipocuentabancoglobal,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGlobal(this.tipocuentabancoglobal);

				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.getdatogeneralempleado().setTipoCuentaBancoGlobal(this.tipocuentabancoglobal);
			}

			return;
		}
		 else  if(sTipo.equals("PoliticasCliente")) {
			if(this.tipocuentabancoglobal==null) {
				this.tipocuentabancoglobal= new TipoCuentaBancoGlobal();
			}

			if(this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoCuentaBancoGlobal
				this.setVariablesFormularioToObjetoActualTipoCuentaBancoGlobal(this.tipocuentabancoglobal,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGlobal(this.tipocuentabancoglobal);

				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.getpoliticascliente().setTipoCuentaBancoGlobal(this.tipocuentabancoglobal);
			}

			return;
		}
		 else  if(sTipo.equals("Empleado")) {
			if(this.tipocuentabancoglobal==null) {
				this.tipocuentabancoglobal= new TipoCuentaBancoGlobal();
			}

			if(this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoCuentaBancoGlobal
				this.setVariablesFormularioToObjetoActualTipoCuentaBancoGlobal(this.tipocuentabancoglobal,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGlobal(this.tipocuentabancoglobal);

				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.getempleado().setTipoCuentaBancoGlobal(this.tipocuentabancoglobal);
			}

			return;
		}
		 else  if(sTipo.equals("ParametroTesoreriaDefecto")) {
			if(this.tipocuentabancoglobal==null) {
				this.tipocuentabancoglobal= new TipoCuentaBancoGlobal();
			}

			if(this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoCuentaBancoGlobal
				this.setVariablesFormularioToObjetoActualTipoCuentaBancoGlobal(this.tipocuentabancoglobal,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGlobal(this.tipocuentabancoglobal);

				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.getparametrotesoreriadefecto().setTipoCuentaBancoGlobal(this.tipocuentabancoglobal);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoCuentaBancoGlobal--;	
		
		
		this.tipocuentabancoglobalAux=new TipoCuentaBancoGlobal();
		
		this.tipocuentabancoglobalAux.setId(this.iIdNuevoTipoCuentaBancoGlobal);
		this.tipocuentabancoglobalAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().add(this.tipocuentabancoglobalAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocuentabancoglobals.add(this.tipocuentabancoglobalAux);
		}
		//ARCHITECTURE
		
		this.tipocuentabancoglobal=this.tipocuentabancoglobalAux;
		
		if(TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoCuentaBancoGlobal(this.tipocuentabancoglobal);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCuentaBancoGlobal(this.tipocuentabancoglobal);
		}
				
		//this.setDefaultControlesTipoCuentaBancoGlobal();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoCuentaBancoGlobal();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoCuentaBancoGlobal();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCuentaBancoGlobal();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCuentaBancoGlobal(this.tipocuentabancoglobalBean,this.tipocuentabancoglobal,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGlobal(this.tipocuentabancoglobal);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
			classes=TipoCuentaBancoGlobalConstantesFunciones.getClassesRelationshipsOfTipoCuentaBancoGlobal(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocuentabancoglobalReturnGeneral=tipocuentabancoglobalLogic.procesarEventosTipoCuentaBancoGlobalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals(),this.tipocuentabancoglobal,this.tipocuentabancoglobalParameterGeneral,this.isEsNuevoTipoCuentaBancoGlobal,classes);//this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobal()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoCuentaBancoGlobal(this.tipocuentabancoglobalReturnGeneral,this.tipocuentabancoglobalBean,false);
		
		if(this.tipocuentabancoglobalReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCuentaBancoGlobal(this.tipocuentabancoglobalReturnGeneral.getTipoCuentaBancoGlobal());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoCuentaBancoGlobal(this.tipocuentabancoglobalReturnGeneral.getTipoCuentaBancoGlobal());
		}
		
		if(this.tipocuentabancoglobalReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoCuentaBancoGlobal(this.tipocuentabancoglobalReturnGeneral.getTipoCuentaBancoGlobal(),classes);//this.tipocuentabancoglobalBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoCuentaBancoGlobal(this.tipocuentabancoglobal,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoCuentaBancoGlobal();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoCuentaBancoGlobal();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoCuentaBancoGlobal(false);
						
			if(tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado() && BancoTipoCuentaBancoGlobalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonBancoTipoCuentaBancoGlobalActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado() && DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDatoGeneralEmpleadoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.getEsGuardarRelacionado() && PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPoliticasClienteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado() && EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado() && ParametroTesoreriaDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroTesoreriaDefectoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCuentaBancoGlobal();
			}
			
			this.actualizarVisualTableDatosTipoCuentaBancoGlobal();
			
			this.jTableDatosTipoCuentaBancoGlobal.setRowSelectionInterval(this.getIndiceNuevoTipoCuentaBancoGlobal(), this.getIndiceNuevoTipoCuentaBancoGlobal());
			
			this.seleccionarFilaTablaTipoCuentaBancoGlobalActual();
						
			this.actualizarEstadoCeldasBotonesTipoCuentaBancoGlobal("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoCuentaBancoGlobal(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextFieldcodigoTipoCuentaBancoGlobal.setEnabled(isHabilitar && this.tipocuentabancoglobalConstantesFunciones.activarcodigoTipoCuentaBancoGlobal);
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextAreanombreTipoCuentaBancoGlobal.setEnabled(isHabilitar && this.tipocuentabancoglobalConstantesFunciones.activarnombreTipoCuentaBancoGlobal);	
		
	};
	
	public void setDefaultControlesTipoCuentaBancoGlobal() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoCuentaBancoGlobal(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocuentabancoglobalSessionBean.setConGuardarRelaciones(true);			
			this.tipocuentabancoglobalSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTabbedPaneRelacionesTipoCuentaBancoGlobal.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.bancotipocuentabancoglobalSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.parametrotesoreriadefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipocuentabancoglobalSessionBean.setConGuardarRelaciones(false);			
			this.tipocuentabancoglobalSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTabbedPaneRelacionesTipoCuentaBancoGlobal.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.bancotipocuentabancoglobalSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.parametrotesoreriadefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoCuentaBancoGlobal() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals()) {
				if(tipocuentabancoglobalAux.getId().equals(this.iIdNuevoTipoCuentaBancoGlobal)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:this.tipocuentabancoglobals) {
				if(tipocuentabancoglobalAux.getId().equals(this.iIdNuevoTipoCuentaBancoGlobal)) {
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
	
	public int getIndiceActualTipoCuentaBancoGlobal(TipoCuentaBancoGlobal tipocuentabancoglobal,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals()) {
				if(tipocuentabancoglobalAux.getId().equals(tipocuentabancoglobal.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:this.tipocuentabancoglobals) {
				if(tipocuentabancoglobalAux.getId().equals(tipocuentabancoglobal.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoCuentaBancoGlobal(TipoCuentaBancoGlobal tipocuentabancoglobalOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals()) {
				if(tipocuentabancoglobalAux.getTipoCuentaBancoGlobalOriginal().getId().equals(tipocuentabancoglobalOriginal.getId())) {
					existe=true;
					tipocuentabancoglobalOriginal.setId(tipocuentabancoglobalAux.getId());
					tipocuentabancoglobalOriginal.setVersionRow(tipocuentabancoglobalAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:this.tipocuentabancoglobals) {
				if(tipocuentabancoglobalAux.getTipoCuentaBancoGlobalOriginal().getId().equals(tipocuentabancoglobalOriginal.getId())) {
					existe=true;
					tipocuentabancoglobalOriginal.setId(tipocuentabancoglobalAux.getId());
					tipocuentabancoglobalOriginal.setVersionRow(tipocuentabancoglobalAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoCuentaBancoGlobal(Boolean esParaCancelar) throws Exception {
		tipocuentabancoglobalsAux=new ArrayList<TipoCuentaBancoGlobal>();
		tipocuentabancoglobalAux=new TipoCuentaBancoGlobal();
		
		if(!this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals()) {
					if(tipocuentabancoglobalAux.getId()<0) {
						tipocuentabancoglobalsAux.add(tipocuentabancoglobalAux);
					}		
				}
				this.iIdNuevoTipoCuentaBancoGlobal=0L;
				this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().removeAll(tipocuentabancoglobalsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:this.tipocuentabancoglobals) {
					if(tipocuentabancoglobalAux.getId()<0) {
						tipocuentabancoglobalsAux.add(tipocuentabancoglobalAux);
					}		
				}
				this.iIdNuevoTipoCuentaBancoGlobal=0L;
				this.tipocuentabancoglobals.removeAll(tipocuentabancoglobalsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoCuentaBancoGlobal 
					&& this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().size()>0
					) {
					tipocuentabancoglobalAux=this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().get(this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().size() - 1);
				
					if(tipocuentabancoglobalAux.getId()<0) {
						this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().remove(tipocuentabancoglobalAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoCuentaBancoGlobal && this.tipocuentabancoglobals.size()>0) {
					tipocuentabancoglobalAux=this.tipocuentabancoglobals.get(this.tipocuentabancoglobals.size() - 1);
				
					if(tipocuentabancoglobalAux.getId()<0) {
						this.tipocuentabancoglobals.remove(tipocuentabancoglobalAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoCuentaBancoGlobal(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocuentabancoglobal.getId()<0) {
				this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().remove(this.tipocuentabancoglobal);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocuentabancoglobal.getId()<0) {
				this.tipocuentabancoglobals.remove(this.tipocuentabancoglobal);
			}
		}			
	}
	
	public void setEstadosInicialesTipoCuentaBancoGlobal(List<TipoCuentaBancoGlobal> tipocuentabancoglobalsAux) throws Exception {
		TipoCuentaBancoGlobalConstantesFunciones.setEstadosInicialesTipoCuentaBancoGlobal(tipocuentabancoglobalsAux);
	}
	
	public void setEstadosInicialesTipoCuentaBancoGlobal(TipoCuentaBancoGlobal tipocuentabancoglobalAux) throws Exception {
		TipoCuentaBancoGlobalConstantesFunciones.setEstadosInicialesTipoCuentaBancoGlobal(tipocuentabancoglobalAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoCuentaBancoGlobalActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoCuentaBancoGlobal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoCuentaBancoGlobalActual()) {
				if(!this.isEsNuevoTipoCuentaBancoGlobal) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoCuentaBancoGlobal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoCuentaBancoGlobal=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoCuentaBancoGlobalActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Cuenta Banco Global ?", "MANTENIMIENTO DE Tipo Cuenta Banco Global", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoCuentaBancoGlobal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoCuentaBancoGlobal tipocuentabancoglobal) throws Exception {
		TipoCuentaBancoGlobalConstantesFunciones.seleccionarAsignar(this.tipocuentabancoglobal,tipocuentabancoglobal);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoCuentaBancoGlobal=this.isPermisoActualizarOriginalTipoCuentaBancoGlobal;
			
			
			this.seleccionarAsignar(tipocuentabancoglobal);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCuentaBancoGlobalConstantesFunciones.quitarEspaciosTipoCuentaBancoGlobal(this.tipocuentabancoglobal,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoCuentaBancoGlobal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocuentabancoglobalSessionBean.setsFuncionBusquedaRapida(this.tipocuentabancoglobalSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoCuentaBancoGlobal) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoCuentaBancoGlobal(esParaCancelar);				
				this.cancelarNuevoTipoCuentaBancoGlobal(esParaCancelar);								
			}
			
			this.tipocuentabancoglobal=new TipoCuentaBancoGlobal();
			
			this.inicializarTipoCuentaBancoGlobal();
			
			this.actualizarEstadoCeldasBotonesTipoCuentaBancoGlobal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoCuentaBancoGlobal() throws Exception {
		try {
			TipoCuentaBancoGlobalConstantesFunciones.inicializarTipoCuentaBancoGlobal(this.tipocuentabancoglobal);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoCuentaBancoGlobals(String sAccionBusqueda,List<TipoCuentaBancoGlobal> tipocuentabancoglobalsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoCuentaBancoGlobal"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoCuentaBancoGlobalMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoCuentaBancoGlobalMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoCuentaBancoGlobal"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Cuenta Banco Globals");		
		parameters.put("busquedapor", TipoCuentaBancoGlobalConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(BancoTipoCuentaBancoGlobal.class));
			classes.add(new Classe(DatoGeneralEmpleado.class));
			classes.add(new Classe(PoliticasCliente.class));
			classes.add(new Classe(Empleado.class));
			classes.add(new Classe(ParametroTesoreriaDefecto.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoCuentaBancoGlobalLogic tipocuentabancoglobalLogicAuxiliar=new TipoCuentaBancoGlobalLogic();
					tipocuentabancoglobalLogicAuxiliar.setDatosCliente(tipocuentabancoglobalLogic.getDatosCliente());				
					tipocuentabancoglobalLogicAuxiliar.setTipoCuentaBancoGlobals(tipocuentabancoglobalsParaReportes);
					
					tipocuentabancoglobalLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoCuentaBancoGlobalWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipocuentabancoglobalsParaReportes=tipocuentabancoglobalLogicAuxiliar.getTipoCuentaBancoGlobals();
					
					//tipocuentabancoglobalLogic.getNewConnexionToDeep();
					
					//for (TipoCuentaBancoGlobal tipocuentabancoglobal:tipocuentabancoglobalsParaReportes) {
					//	tipocuentabancoglobalLogic.deepLoad(tipocuentabancoglobal, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipocuentabancoglobalLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipocuentabancoglobalLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileBancoTipoCuentaBancoGlobal = AuxiliarReportes.class.getResourceAsStream("BancoTipoCuentaBancoGlobalDetalleRelacionesDesign.jasper");
			parameters.put("subreport_bancotipocuentabancoglobal", reportFileBancoTipoCuentaBancoGlobal);

			InputStream reportFileDatoGeneralEmpleado = AuxiliarReportes.class.getResourceAsStream("DatoGeneralEmpleadoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_datogeneralempleado", reportFileDatoGeneralEmpleado);

			InputStream reportFilePoliticasCliente = AuxiliarReportes.class.getResourceAsStream("PoliticasClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_politicascliente", reportFilePoliticasCliente);

			InputStream reportFileEmpleado = AuxiliarReportes.class.getResourceAsStream("EmpleadoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_empleado", reportFileEmpleado);

			InputStream reportFileParametroTesoreriaDefecto = AuxiliarReportes.class.getResourceAsStream("ParametroTesoreriaDefectoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametrotesoreriadefecto", reportFileParametroTesoreriaDefecto);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoCuentaBancoGlobal=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoCuentaBancoGlobalConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoCuentaBancoGlobalConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoCuentaBancoGlobal=new JRBeanArrayDataSource(TipoCuentaBancoGlobalJInternalFrame.TraerTipoCuentaBancoGlobalBeans(tipocuentabancoglobalsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoCuentaBancoGlobal);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoCuentaBancoGlobalConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoCuentaBancoGlobalBean.TraerTipoCuentaBancoGlobalBeans(tipocuentabancoglobalsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoCuentaBancoGlobals(sAccionBusqueda,sTipoArchivoReporte,tipocuentabancoglobalsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoCuentaBancoGlobals(sAccionBusqueda,sTipoArchivoReporte,tipocuentabancoglobalsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGlobalActionPerformed(null);
					//this.generarExcelReporteTipoCuentaBancoGlobals(sAccionBusqueda,sTipoArchivoReporte,tipocuentabancoglobalsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoCuentaBancoGlobals(sAccionBusqueda,sTipoArchivoReporte,tipocuentabancoglobalsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoCuentaBancoGlobals(sAccionBusqueda,sTipoArchivoReporte,tipocuentabancoglobalsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoCuentaBancoGlobals(sAccionBusqueda,sTipoArchivoReporte,tipocuentabancoglobalsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoCuentaBancoGlobals(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCuentaBancoGlobal> tipocuentabancoglobalsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentabancoglobal";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCuentaBancoGlobals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCuentaBancoGlobal("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoCuentaBancoGlobal tipocuentabancoglobal : tipocuentabancoglobalsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoCuentaBancoGlobalConstantesFunciones.generarExcelReporteDataTipoCuentaBancoGlobal("NORMAL",row,workbook,tipocuentabancoglobal,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco Global",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoCuentaBancoGlobal(String sTipo,Row row,Workbook workbook) {
		
		TipoCuentaBancoGlobalConstantesFunciones.generarExcelReporteHeaderTipoCuentaBancoGlobal(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoCuentaBancoGlobals(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCuentaBancoGlobal> tipocuentabancoglobalsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentabancoglobal_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCuentaBancoGlobals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoCuentaBancoGlobal tipocuentabancoglobal : tipocuentabancoglobalsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoCuentaBancoGlobalConstantesFunciones.getTipoCuentaBancoGlobalDescripcion(tipocuentabancoglobal));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCuentaBancoGlobalConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCuentaBancoGlobalConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocuentabancoglobal.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCuentaBancoGlobalConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCuentaBancoGlobalConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocuentabancoglobal.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco Global",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoCuentaBancoGlobals(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCuentaBancoGlobal> tipocuentabancoglobalsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoCuentaBancoGlobal> tipocuentabancoglobalsRespaldo=null;
		
		classes=TipoCuentaBancoGlobalConstantesFunciones.getClassesRelationshipsOfTipoCuentaBancoGlobal(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocuentabancoglobalLogic.setDatosCliente(this.datosCliente);
		this.tipocuentabancoglobalLogic.setDatosDeep(this.datosDeep);
		this.tipocuentabancoglobalLogic.setIsConDeep(true);
		
		tipocuentabancoglobalsRespaldo=this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals();
		
		this.tipocuentabancoglobalLogic.setTipoCuentaBancoGlobals(tipocuentabancoglobalsParaReportes);	
		this.tipocuentabancoglobalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocuentabancoglobalsParaReportes=this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals();
		this.tipocuentabancoglobalLogic.setTipoCuentaBancoGlobals(tipocuentabancoglobalsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentabancoglobal_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCuentaBancoGlobals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCuentaBancoGlobal("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoCuentaBancoGlobal tipocuentabancoglobal : tipocuentabancoglobalsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoCuentaBancoGlobal("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoCuentaBancoGlobalConstantesFunciones.generarExcelReporteDataTipoCuentaBancoGlobal("NORMAL",row,workbook,tipocuentabancoglobal,cellStyleDataAux);
		
			
			


				//BancoTipoCuentaBancoGlobal
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocuentabancoglobal.getBancoTipoCuentaBancoGlobals()!=null && tipocuentabancoglobal.getBancoTipoCuentaBancoGlobals().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					BancoTipoCuentaBancoGlobalConstantesFunciones.generarExcelReporteHeaderBancoTipoCuentaBancoGlobal("RELACIONADO",row,workbook);
				}

				if(tipocuentabancoglobal.getBancoTipoCuentaBancoGlobals()!=null) {
					i2=0;
					for(BancoTipoCuentaBancoGlobal bancotipocuentabancoglobal : tipocuentabancoglobal.getBancoTipoCuentaBancoGlobals()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						BancoTipoCuentaBancoGlobalConstantesFunciones.generarExcelReporteDataBancoTipoCuentaBancoGlobal("RELACIONADO",row,workbook,bancotipocuentabancoglobal,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//DatoGeneralEmpleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocuentabancoglobal.getDatoGeneralEmpleados()!=null && tipocuentabancoglobal.getDatoGeneralEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DatoGeneralEmpleadoConstantesFunciones.generarExcelReporteHeaderDatoGeneralEmpleado("RELACIONADO",row,workbook);
				}

				if(tipocuentabancoglobal.getDatoGeneralEmpleados()!=null) {
					i2=0;
					for(DatoGeneralEmpleado datogeneralempleado : tipocuentabancoglobal.getDatoGeneralEmpleados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DatoGeneralEmpleadoConstantesFunciones.generarExcelReporteDataDatoGeneralEmpleado("RELACIONADO",row,workbook,datogeneralempleado,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//PoliticasCliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PoliticasClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocuentabancoglobal.getPoliticasClientes()!=null && tipocuentabancoglobal.getPoliticasClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PoliticasClienteConstantesFunciones.generarExcelReporteHeaderPoliticasCliente("RELACIONADO",row,workbook);
				}

				if(tipocuentabancoglobal.getPoliticasClientes()!=null) {
					i2=0;
					for(PoliticasCliente politicascliente : tipocuentabancoglobal.getPoliticasClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PoliticasClienteConstantesFunciones.generarExcelReporteDataPoliticasCliente("RELACIONADO",row,workbook,politicascliente,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Empleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocuentabancoglobal.getEmpleados()!=null && tipocuentabancoglobal.getEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EmpleadoConstantesFunciones.generarExcelReporteHeaderEmpleado("RELACIONADO",row,workbook);
				}

				if(tipocuentabancoglobal.getEmpleados()!=null) {
					i2=0;
					for(Empleado empleado : tipocuentabancoglobal.getEmpleados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EmpleadoConstantesFunciones.generarExcelReporteDataEmpleado("RELACIONADO",row,workbook,empleado,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ParametroTesoreriaDefecto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocuentabancoglobal.getParametroTesoreriaDefectos()!=null && tipocuentabancoglobal.getParametroTesoreriaDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroTesoreriaDefectoConstantesFunciones.generarExcelReporteHeaderParametroTesoreriaDefecto("RELACIONADO",row,workbook);
				}

				if(tipocuentabancoglobal.getParametroTesoreriaDefectos()!=null) {
					i2=0;
					for(ParametroTesoreriaDefecto parametrotesoreriadefecto : tipocuentabancoglobal.getParametroTesoreriaDefectos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParametroTesoreriaDefectoConstantesFunciones.generarExcelReporteDataParametroTesoreriaDefecto("RELACIONADO",row,workbook,parametrotesoreriadefecto,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoCuentaBancoGlobalConstantesFunciones.getTipoCuentaBancoGlobalDescripcion(tipocuentabancoglobal));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco Global",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoCuentaBancoGlobal() throws Exception {		
		this.startProcessTipoCuentaBancoGlobal(true);
	}
	
	public void startProcessTipoCuentaBancoGlobal(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoCuentaBancoGlobal, this.jScrollPanelDatosTipoCuentaBancoGlobal,this.jPanelPaginacionTipoCuentaBancoGlobal, this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal, this.jPanelAccionesTipoCuentaBancoGlobal,this.jPanelAccionesFormularioTipoCuentaBancoGlobal,this.jmenuBarTipoCuentaBancoGlobal,this.jmenuBarDetalleTipoCuentaBancoGlobal,this.jTtoolBarTipoCuentaBancoGlobal,this.jTtoolBarDetalleTipoCuentaBancoGlobal);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCuentaBancoGlobal=null; 
		
		final JPanel jPanelParametrosReportesTipoCuentaBancoGlobal=this.jPanelParametrosReportesTipoCuentaBancoGlobal;
		//final JScrollPane jScrollPanelDatosTipoCuentaBancoGlobal=this.jScrollPanelDatosTipoCuentaBancoGlobal;
		final JTable jTableDatosTipoCuentaBancoGlobal=this.jTableDatosTipoCuentaBancoGlobal;		
		final JPanel jPanelPaginacionTipoCuentaBancoGlobal=this.jPanelPaginacionTipoCuentaBancoGlobal;
		//final JScrollPane jScrollPanelDatosEdicionTipoCuentaBancoGlobal=this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal;
		final JPanel jPanelAccionesTipoCuentaBancoGlobal=this.jPanelAccionesTipoCuentaBancoGlobal;
		
		JPanel jPanelCamposAuxiliarTipoCuentaBancoGlobal=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoCuentaBancoGlobal=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) {
			jPanelCamposAuxiliarTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jPanelCamposTipoCuentaBancoGlobal;
			jPanelAccionesFormularioAuxiliarTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jPanelAccionesFormularioTipoCuentaBancoGlobal;
		}
		
		final JPanel jPanelCamposTipoCuentaBancoGlobal=jPanelCamposAuxiliarTipoCuentaBancoGlobal;
		final JPanel jPanelAccionesFormularioTipoCuentaBancoGlobal=jPanelAccionesFormularioAuxiliarTipoCuentaBancoGlobal;
		
		
		final JMenuBar jmenuBarTipoCuentaBancoGlobal=this.jmenuBarTipoCuentaBancoGlobal;
		final JToolBar jTtoolBarTipoCuentaBancoGlobal=this.jTtoolBarTipoCuentaBancoGlobal;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoCuentaBancoGlobal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCuentaBancoGlobal=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) {
			jmenuBarDetalleAuxiliarTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jmenuBarDetalleTipoCuentaBancoGlobal;
			jTtoolBarDetalleAuxiliarTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTtoolBarDetalleTipoCuentaBancoGlobal;
		}
		
		final JMenuBar jmenuBarDetalleTipoCuentaBancoGlobal=jmenuBarDetalleAuxiliarTipoCuentaBancoGlobal;
		final JToolBar jTtoolBarDetalleTipoCuentaBancoGlobal=jTtoolBarDetalleAuxiliarTipoCuentaBancoGlobal;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCuentaBancoGlobal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCuentaBancoGlobal;
			processRunnable.jTableDatos=jTableDatosTipoCuentaBancoGlobal;
			processRunnable.jPanelCampos=jPanelCamposTipoCuentaBancoGlobal;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCuentaBancoGlobal;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCuentaBancoGlobal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCuentaBancoGlobal;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCuentaBancoGlobal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCuentaBancoGlobal;
			processRunnable.jTtoolBar=jTtoolBarTipoCuentaBancoGlobal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCuentaBancoGlobal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCuentaBancoGlobal ,jPanelParametrosReportesTipoCuentaBancoGlobal,jTableDatosTipoCuentaBancoGlobal, /*jScrollPanelDatosTipoCuentaBancoGlobal,*/jPanelCamposTipoCuentaBancoGlobal,jPanelPaginacionTipoCuentaBancoGlobal, /*jScrollPanelDatosEdicionTipoCuentaBancoGlobal,*/ jPanelAccionesTipoCuentaBancoGlobal,jPanelAccionesFormularioTipoCuentaBancoGlobal,jmenuBarTipoCuentaBancoGlobal,jmenuBarDetalleTipoCuentaBancoGlobal,jTtoolBarTipoCuentaBancoGlobal,jTtoolBarDetalleTipoCuentaBancoGlobal);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoCuentaBancoGlobal, jScrollPanelDatosTipoCuentaBancoGlobal,jPanelPaginacionTipoCuentaBancoGlobal, jScrollPanelDatosEdicionTipoCuentaBancoGlobal, jPanelAccionesTipoCuentaBancoGlobal,jPanelAccionesFormularioTipoCuentaBancoGlobal,jmenuBarTipoCuentaBancoGlobal,jmenuBarDetalleTipoCuentaBancoGlobal,jTtoolBarTipoCuentaBancoGlobal,jTtoolBarDetalleTipoCuentaBancoGlobal);
						
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
	
	public void finishProcessTipoCuentaBancoGlobal() {// throws Exception 
		this.finishProcessTipoCuentaBancoGlobal(true);
	}
	
	public void finishProcessTipoCuentaBancoGlobal(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoCuentaBancoGlobal, this.jScrollPanelDatosTipoCuentaBancoGlobal,this.jPanelPaginacionTipoCuentaBancoGlobal, this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal, this.jPanelAccionesTipoCuentaBancoGlobal,this.jPanelAccionesFormularioTipoCuentaBancoGlobal,this.jmenuBarTipoCuentaBancoGlobal,this.jmenuBarDetalleTipoCuentaBancoGlobal,this.jTtoolBarTipoCuentaBancoGlobal,this.jTtoolBarDetalleTipoCuentaBancoGlobal);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCuentaBancoGlobal=null; 
		
		final JPanel jPanelParametrosReportesTipoCuentaBancoGlobal=this.jPanelParametrosReportesTipoCuentaBancoGlobal;
		//final JScrollPane jScrollPanelDatosTipoCuentaBancoGlobal=this.jScrollPanelDatosTipoCuentaBancoGlobal;
		final JTable jTableDatosTipoCuentaBancoGlobal=this.jTableDatosTipoCuentaBancoGlobal;		
		final JPanel jPanelPaginacionTipoCuentaBancoGlobal=this.jPanelPaginacionTipoCuentaBancoGlobal;
		//final JScrollPane jScrollPanelDatosEdicionTipoCuentaBancoGlobal=this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal;
		final JPanel jPanelAccionesTipoCuentaBancoGlobal=this.jPanelAccionesTipoCuentaBancoGlobal;
		
		JPanel jPanelCamposAuxiliarTipoCuentaBancoGlobal=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoCuentaBancoGlobal=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) {
			jPanelCamposAuxiliarTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jPanelCamposTipoCuentaBancoGlobal;
			jPanelAccionesFormularioAuxiliarTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jPanelAccionesFormularioTipoCuentaBancoGlobal;
		}
		
		final JPanel jPanelCamposTipoCuentaBancoGlobal=jPanelCamposAuxiliarTipoCuentaBancoGlobal;
		final JPanel jPanelAccionesFormularioTipoCuentaBancoGlobal=jPanelAccionesFormularioAuxiliarTipoCuentaBancoGlobal;
		
		
		final JMenuBar jmenuBarTipoCuentaBancoGlobal=this.jmenuBarTipoCuentaBancoGlobal;		
		final JToolBar jTtoolBarTipoCuentaBancoGlobal=this.jTtoolBarTipoCuentaBancoGlobal;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoCuentaBancoGlobal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCuentaBancoGlobal=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) {
			jmenuBarDetalleAuxiliarTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jmenuBarDetalleTipoCuentaBancoGlobal;
			jTtoolBarDetalleAuxiliarTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTtoolBarDetalleTipoCuentaBancoGlobal;		
		}
		
		final JMenuBar jmenuBarDetalleTipoCuentaBancoGlobal=jmenuBarDetalleAuxiliarTipoCuentaBancoGlobal;
		final JToolBar jTtoolBarDetalleTipoCuentaBancoGlobal=jTtoolBarDetalleAuxiliarTipoCuentaBancoGlobal;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCuentaBancoGlobal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCuentaBancoGlobal;
			processRunnable.jTableDatos=jTableDatosTipoCuentaBancoGlobal;
			processRunnable.jPanelCampos=jPanelCamposTipoCuentaBancoGlobal;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCuentaBancoGlobal;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCuentaBancoGlobal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCuentaBancoGlobal;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCuentaBancoGlobal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCuentaBancoGlobal;
			processRunnable.jTtoolBar=jTtoolBarTipoCuentaBancoGlobal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCuentaBancoGlobal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoCuentaBancoGlobal ,jPanelParametrosReportesTipoCuentaBancoGlobal, jTableDatosTipoCuentaBancoGlobal,/*jScrollPanelDatosTipoCuentaBancoGlobal,*/jPanelCamposTipoCuentaBancoGlobal,jPanelPaginacionTipoCuentaBancoGlobal, /*jScrollPanelDatosEdicionTipoCuentaBancoGlobal,*/ jPanelAccionesTipoCuentaBancoGlobal,jPanelAccionesFormularioTipoCuentaBancoGlobal,jmenuBarTipoCuentaBancoGlobal,jmenuBarDetalleTipoCuentaBancoGlobal,jTtoolBarTipoCuentaBancoGlobal,jTtoolBarDetalleTipoCuentaBancoGlobal));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoCuentaBancoGlobal(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoCuentaBancoGlobal(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoCuentaBancoGlobal(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoCuentaBancoGlobal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoCuentaBancoGlobal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoCuentaBancoGlobal,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoCuentaBancoGlobal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoCuentaBancoGlobal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoCuentaBancoGlobal,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocuentabancoglobalConstantesFunciones.getsFinalQueryTipoCuentaBancoGlobal();
		String  finalQueryPaginacionTodos=this.tipocuentabancoglobalConstantesFunciones.getsFinalQueryTipoCuentaBancoGlobal();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoCuentaBancoGlobalConstantesFunciones.getArrayColumnasGlobalesNoTipoCuentaBancoGlobal(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoCuentaBancoGlobalConstantesFunciones.getArrayColumnasGlobalesTipoCuentaBancoGlobal(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoCuentaBancoGlobalConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocuentabancoglobalsEliminados= new ArrayList<TipoCuentaBancoGlobal>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoCuentaBancoGlobal();
		
				///*TipoCuentaBancoGlobalSessionBean*/this.tipocuentabancoglobalSessionBean=new TipoCuentaBancoGlobalSessionBean();
			
			if(this.tipocuentabancoglobalSessionBean==null) {
				this.tipocuentabancoglobalSessionBean=new TipoCuentaBancoGlobalSessionBean();
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
					this.iNumeroPaginacion=TipoCuentaBancoGlobalConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoCuentaBancoGlobalConstantesFunciones.getClassesForeignKeysOfTipoCuentaBancoGlobal(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocuentabancoglobal."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocuentabancoglobalsAux= new ArrayList<TipoCuentaBancoGlobal>();
			
				
			tipocuentabancoglobalLogic.setDatosCliente(this.datosCliente);
			tipocuentabancoglobalLogic.setDatosDeep(this.datosDeep);
			tipocuentabancoglobalLogic.setIsConDeep(true);
			
			
			tipocuentabancoglobalLogic.getTipoCuentaBancoGlobalDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocuentabancoglobalLogic.getTodosTipoCuentaBancoGlobals(finalQueryGlobal,pagination);
					
					//tipocuentabancoglobalLogic.getTodosTipoCuentaBancoGlobalsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals()==null|| tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocuentabancoglobalsAux= new ArrayList<TipoCuentaBancoGlobal>();
							tipocuentabancoglobalsAux.addAll(tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentabancoglobalsAux= new ArrayList<TipoCuentaBancoGlobal>();
							tipocuentabancoglobalsAux.addAll(tipocuentabancoglobals);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocuentabancoglobalLogic.getTodosTipoCuentaBancoGlobals(finalQueryGlobal+"",this.pagination);												
							
							//tipocuentabancoglobalLogic.getTodosTipoCuentaBancoGlobalsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoCuentaBancoGlobals("Todos",tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocuentabancoglobalLogic.setTipoCuentaBancoGlobals(new ArrayList<TipoCuentaBancoGlobal>());					
							tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().addAll(tipocuentabancoglobalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentabancoglobals=new ArrayList<TipoCuentaBancoGlobal>();
							tipocuentabancoglobals.addAll(tipocuentabancoglobalsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoCuentaBancoGlobal=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoCuentaBancoGlobal=this.idActual;
				
				} else if(this.idTipoCuentaBancoGlobalActual!=null && this.idTipoCuentaBancoGlobalActual!=0L) {
					idTipoCuentaBancoGlobal=idTipoCuentaBancoGlobalActual;
				}
				
					
				this.sDetalleReporte=TipoCuentaBancoGlobalConstantesFunciones.getDetalleIndicePorId(idTipoCuentaBancoGlobal);
				
				this.tipocuentabancoglobals=new ArrayList<TipoCuentaBancoGlobal>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocuentabancoglobalLogic.getEntity(idTipoCuentaBancoGlobal);
					
					//tipocuentabancoglobalLogic.getEntityWithConnection(idTipoCuentaBancoGlobal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuentabancoglobalLogic.setTipoCuentaBancoGlobals(new ArrayList<TipoCuentaBancoGlobal>());
					tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().add(tipocuentabancoglobalLogic.getTipoCuentaBancoGlobal());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocuentabancoglobals=new ArrayList<TipoCuentaBancoGlobal>();
					this.tipocuentabancoglobals.add(tipocuentabancoglobal);
				}
				
				if(tipocuentabancoglobalLogic.getTipoCuentaBancoGlobal()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoCuentaBancoGlobal();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoCuentaBancoGlobal();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocuentabancoglobals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocuentabancoglobals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoCuentaBancoGlobal tipocuentabancoglobal) {
		Boolean permite=true;
		
		if(this.tipocuentabancoglobal.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoCuentaBancoGlobalConstantesFunciones.getOrderByListaTipoCuentaBancoGlobal();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoCuentaBancoGlobalConstantesFunciones.getOrderByListaTipoCuentaBancoGlobal();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuentaBancoGlobal tipocuentabancoglobal:tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals()) {
				if(tipocuentabancoglobal.getsType().equals(Constantes2.S_TOTALES)) {
					tipocuentabancoglobalTotales=tipocuentabancoglobal;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuentaBancoGlobal tipocuentabancoglobal:this.tipocuentabancoglobals) {
				if(tipocuentabancoglobal.getsType().equals(Constantes2.S_TOTALES)) {
					tipocuentabancoglobalTotales=tipocuentabancoglobal;
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
			this.tipocuentabancoglobalAux=new TipoCuentaBancoGlobal();
			this.tipocuentabancoglobalAux.setsType(Constantes2.S_TOTALES);
			this.tipocuentabancoglobalAux.setIsNew(false);
			this.tipocuentabancoglobalAux.setIsChanged(false);
			this.tipocuentabancoglobalAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoCuentaBancoGlobalConstantesFunciones.TotalizarValoresFilaTipoCuentaBancoGlobal(this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals(),this.tipocuentabancoglobalAux);
				
				this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().add(this.tipocuentabancoglobalAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoCuentaBancoGlobalConstantesFunciones.TotalizarValoresFilaTipoCuentaBancoGlobal(this.tipocuentabancoglobals,this.tipocuentabancoglobalAux);
				
				this.tipocuentabancoglobals.add(this.tipocuentabancoglobalAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocuentabancoglobalTotales=new TipoCuentaBancoGlobal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().remove(tipocuentabancoglobalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocuentabancoglobals.remove(tipocuentabancoglobalTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocuentabancoglobalTotales=new TipoCuentaBancoGlobal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCuentaBancoGlobal tipocuentabancoglobal:tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals()) {
				if(tipocuentabancoglobal.getsType().equals(Constantes2.S_TOTALES)) {
					tipocuentabancoglobalTotales=tipocuentabancoglobal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCuentaBancoGlobalConstantesFunciones.TotalizarValoresFilaTipoCuentaBancoGlobal(this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals(),tipocuentabancoglobalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCuentaBancoGlobal tipocuentabancoglobal:this.tipocuentabancoglobals) {
				if(tipocuentabancoglobal.getsType().equals(Constantes2.S_TOTALES)) {
					tipocuentabancoglobalTotales=tipocuentabancoglobal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCuentaBancoGlobalConstantesFunciones.TotalizarValoresFilaTipoCuentaBancoGlobal(this.tipocuentabancoglobals,tipocuentabancoglobalTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoCuentaBancoGlobal() {
		this.isPermisoTodoTipoCuentaBancoGlobal=false;
		this.isPermisoNuevoTipoCuentaBancoGlobal=false;
		this.isPermisoActualizarTipoCuentaBancoGlobal=false;
		this.isPermisoActualizarOriginalTipoCuentaBancoGlobal=false;
		this.isPermisoEliminarTipoCuentaBancoGlobal=false;
		this.isPermisoGuardarCambiosTipoCuentaBancoGlobal=false;
		this.isPermisoConsultaTipoCuentaBancoGlobal=false;
		this.isPermisoBusquedaTipoCuentaBancoGlobal=false;
		this.isPermisoReporteTipoCuentaBancoGlobal=false;		
		this.isPermisoOrdenTipoCuentaBancoGlobal=false;		
		this.isPermisoPaginacionMedioTipoCuentaBancoGlobal=false;		
		this.isPermisoPaginacionAltoTipoCuentaBancoGlobal=false;
		this.isPermisoPaginacionTodoTipoCuentaBancoGlobal=false;
		this.isPermisoCopiarTipoCuentaBancoGlobal=false;		
		this.isPermisoVerFormTipoCuentaBancoGlobal=false;		
		this.isPermisoDuplicarTipoCuentaBancoGlobal=false;		
		this.isPermisoOrdenTipoCuentaBancoGlobal=false;		
	}
	
	public void setPermisosUsuarioTipoCuentaBancoGlobal(Boolean isPermiso) {
		this.isPermisoTodoTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoNuevoTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoActualizarTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoActualizarOriginalTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoEliminarTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoGuardarCambiosTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoConsultaTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoBusquedaTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoReporteTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoOrdenTipoCuentaBancoGlobal=isPermiso;		
		this.isPermisoPaginacionMedioTipoCuentaBancoGlobal=isPermiso;		
		this.isPermisoPaginacionAltoTipoCuentaBancoGlobal=isPermiso;		
		this.isPermisoPaginacionTodoTipoCuentaBancoGlobal=isPermiso;		
		this.isPermisoCopiarTipoCuentaBancoGlobal=isPermiso;		
		this.isPermisoVerFormTipoCuentaBancoGlobal=isPermiso;		
		this.isPermisoDuplicarTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoOrdenTipoCuentaBancoGlobal=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoCuentaBancoGlobal(Boolean isPermiso) {
		//this.isPermisoTodoTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoNuevoTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoActualizarTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoActualizarOriginalTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoEliminarTipoCuentaBancoGlobal=isPermiso;
		this.isPermisoGuardarCambiosTipoCuentaBancoGlobal=isPermiso;
		//this.isPermisoConsultaTipoCuentaBancoGlobal=isPermiso;
		//this.isPermisoBusquedaTipoCuentaBancoGlobal=isPermiso;
		//this.isPermisoReporteTipoCuentaBancoGlobal=isPermiso;
		//this.isPermisoOrdenTipoCuentaBancoGlobal=isPermiso;		
		//this.isPermisoPaginacionMedioTipoCuentaBancoGlobal=isPermiso;		
		//this.isPermisoPaginacionAltoTipoCuentaBancoGlobal=isPermiso;		
		//this.isPermisoPaginacionTodoTipoCuentaBancoGlobal=isPermiso;		
		//this.isPermisoCopiarTipoCuentaBancoGlobal=isPermiso;		
		//this.isPermisoDuplicarTipoCuentaBancoGlobal=isPermiso;
		//this.isPermisoOrdenTipoCuentaBancoGlobal=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoCuentaBancoGlobalClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(BancoTipoCuentaBancoGlobalConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(PoliticasClienteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(EmpleadoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParametroTesoreriaDefectoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoCuentaBancoGlobalJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosBancoTipoCuentaBancoGlobal=false;
		this.isTienePermisosBancoTipoCuentaBancoGlobal=this.verificarGetPermisosUsuarioOpcionTipoCuentaBancoGlobalClaseRelacionada(this.opcionsRelacionadas,BancoTipoCuentaBancoGlobalConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosDatoGeneralEmpleado=false;
		this.isTienePermisosDatoGeneralEmpleado=this.verificarGetPermisosUsuarioOpcionTipoCuentaBancoGlobalClaseRelacionada(this.opcionsRelacionadas,DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosPoliticasCliente=false;
		this.isTienePermisosPoliticasCliente=this.verificarGetPermisosUsuarioOpcionTipoCuentaBancoGlobalClaseRelacionada(this.opcionsRelacionadas,PoliticasClienteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosEmpleado=false;
		this.isTienePermisosEmpleado=this.verificarGetPermisosUsuarioOpcionTipoCuentaBancoGlobalClaseRelacionada(this.opcionsRelacionadas,EmpleadoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParametroTesoreriaDefecto=false;
		this.isTienePermisosParametroTesoreriaDefecto=this.verificarGetPermisosUsuarioOpcionTipoCuentaBancoGlobalClaseRelacionada(this.opcionsRelacionadas,ParametroTesoreriaDefectoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoCuentaBancoGlobal(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoCuentaBancoGlobalClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosBancoTipoCuentaBancoGlobal=conPermiso;
		this.isTienePermisosDatoGeneralEmpleado=conPermiso;
		this.isTienePermisosPoliticasCliente=conPermiso;
		this.isTienePermisosEmpleado=conPermiso;
		this.isTienePermisosParametroTesoreriaDefecto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoCuentaBancoGlobalClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoCuentaBancoGlobalClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoCuentaBancoGlobalClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosBancoTipoCuentaBancoGlobal && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTabbedPaneRelacionesTipoCuentaBancoGlobal.remove(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosDatoGeneralEmpleado && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTabbedPaneRelacionesTipoCuentaBancoGlobal.remove(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosPoliticasCliente && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTabbedPaneRelacionesTipoCuentaBancoGlobal.remove(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosEmpleado && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTabbedPaneRelacionesTipoCuentaBancoGlobal.remove(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParametroTesoreriaDefecto && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTabbedPaneRelacionesTipoCuentaBancoGlobal.remove(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoCuentaBancoGlobal() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoCuentaBancoGlobalJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoCuentaBancoGlobalConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoCuentaBancoGlobal=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoCuentaBancoGlobal=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoCuentaBancoGlobal=this.isPermisoActualizarTipoCuentaBancoGlobal;
			this.isPermisoEliminarTipoCuentaBancoGlobal=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoCuentaBancoGlobal=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoCuentaBancoGlobal=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoCuentaBancoGlobal=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoCuentaBancoGlobal=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoCuentaBancoGlobal=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCuentaBancoGlobal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoCuentaBancoGlobal=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoCuentaBancoGlobal=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoCuentaBancoGlobal=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoCuentaBancoGlobal=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoCuentaBancoGlobal=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoCuentaBancoGlobal=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCuentaBancoGlobal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoCuentaBancoGlobal.setToolTipText(this.jTableDatosTipoCuentaBancoGlobal.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoCuentaBancoGlobal(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoCuentaBancoGlobal(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoCuentaBancoGlobalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoCuentaBancoGlobalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoCuentaBancoGlobal() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosBancoTipoCuentaBancoGlobal && this.tipocuentabancoglobalConstantesFunciones.mostrarBancoTipoCuentaBancoGlobalTipoCuentaBancoGlobal && !TipoCuentaBancoGlobalConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Banco Tipo Cuenta Banco Global");
			reporte.setsDescripcion("Banco Tipo Cuenta Banco Global");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosDatoGeneralEmpleado && this.tipocuentabancoglobalConstantesFunciones.mostrarDatoGeneralEmpleadoTipoCuentaBancoGlobal && !TipoCuentaBancoGlobalConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Dato General Empleado");
			reporte.setsDescripcion("Dato General Empleado");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosPoliticasCliente && this.tipocuentabancoglobalConstantesFunciones.mostrarPoliticasClienteTipoCuentaBancoGlobal && !TipoCuentaBancoGlobalConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Politicas Cliente");
			reporte.setsDescripcion("Politicas Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosEmpleado && this.tipocuentabancoglobalConstantesFunciones.mostrarEmpleadoTipoCuentaBancoGlobal && !TipoCuentaBancoGlobalConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Empleado");
			reporte.setsDescripcion("Empleado");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParametroTesoreriaDefecto && this.tipocuentabancoglobalConstantesFunciones.mostrarParametroTesoreriaDefectoTipoCuentaBancoGlobal && !TipoCuentaBancoGlobalConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Tesoreria Defecto");
			reporte.setsDescripcion("Parametro Tesoreria Defecto");
			this.tiposRelaciones.add(reporte);
		}
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	public void inicializarCombosForeignKeyTipoCuentaBancoGlobalListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoCuentaBancoGlobalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoCuentaBancoGlobalJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoCuentaBancoGlobalListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoCuentaBancoGlobalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoCuentaBancoGlobal()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoCuentaBancoGlobal()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoCuentaBancoGlobal(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoCuentaBancoGlobal()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCuentaBancoGlobal();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoCuentaBancoGlobal(TipoCuentaBancoGlobal tipocuentabancoglobal)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoCuentaBancoGlobal(TipoCuentaBancoGlobal tipocuentabancoglobal,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoCuentaBancoGlobal()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCuentaBancoGlobal()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoCuentaBancoGlobal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoCuentaBancoGlobal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoCuentaBancoGlobal()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoCuentaBancoGlobal()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoCuentaBancoGlobal(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoCuentaBancoGlobal()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoCuentaBancoGlobalBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoCuentaBancoGlobalBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoCuentaBancoGlobalBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocuentabancoglobalSessionBean=new TipoCuentaBancoGlobalSessionBean(); 
		this.tipocuentabancoglobalConstantesFunciones=new TipoCuentaBancoGlobalConstantesFunciones(); 
		this.tipocuentabancoglobalBean=new TipoCuentaBancoGlobal();//(this.tipocuentabancoglobalConstantesFunciones); 		
		this.tipocuentabancoglobalReturnGeneral=new TipoCuentaBancoGlobalParameterReturnGeneral(); 
		
		this.tipocuentabancoglobalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocuentabancoglobalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoCuentaBancoGlobalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoCuentaBancoGlobalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoCuentaBancoGlobalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoCuentaBancoGlobal(true);
			
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
			
			this.tipocuentabancoglobalConstantesFunciones=new TipoCuentaBancoGlobalConstantesFunciones(); 
			this.tipocuentabancoglobalBean=new TipoCuentaBancoGlobal();//this.tipocuentabancoglobalConstantesFunciones); 			
			this.tipocuentabancoglobalReturnGeneral=new TipoCuentaBancoGlobalParameterReturnGeneral(); 
		
			TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Cuenta Banco Global Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipocuentabancoglobal=new TipoCuentaBancoGlobal();
			this.tipocuentabancoglobals = new ArrayList<TipoCuentaBancoGlobal>();
			this.tipocuentabancoglobalsAux = new ArrayList<TipoCuentaBancoGlobal>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic=new TipoCuentaBancoGlobalLogic();
				this.tipocuentabancoglobalLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocuentabancoglobalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocuentabancoglobalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoCuentaBancoGlobal);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal);	
					}
					
					if(this.jInternalFrameImportacionTipoCuentaBancoGlobal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCuentaBancoGlobal);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoCuentaBancoGlobal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoCuentaBancoGlobal);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal);
				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.setVisible(false);
				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal);
					this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoCuentaBancoGlobal!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoCuentaBancoGlobal);
					this.jInternalFrameImportacionTipoCuentaBancoGlobal.setVisible(false);
					this.jInternalFrameImportacionTipoCuentaBancoGlobal.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoCuentaBancoGlobal!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoCuentaBancoGlobal);
					this.jInternalFrameOrderByTipoCuentaBancoGlobal.setVisible(false);
					this.jInternalFrameOrderByTipoCuentaBancoGlobal.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoCuentaBancoGlobalActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoCuentaBancoGlobalConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocuentabancoglobalReturnGeneral=new TipoCuentaBancoGlobalParameterReturnGeneral();
			
			this.tipocuentabancoglobalParameterGeneral=new TipoCuentaBancoGlobalParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocuentabancoglobalLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoCuentaBancoGlobalJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(BancoTipoCuentaBancoGlobalConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(PoliticasClienteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(EmpleadoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParametroTesoreriaDefectoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCuentaBancoGlobalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado(),this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCuentaBancoGlobalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado(),this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaDuplicarTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaCopiarTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaVerFormTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaOrdenTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaModificarTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaCancelarTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaGuardarTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoCuentaBancoGlobal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoCuentaBancoGlobal();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoCuentaBancoGlobal(false);
			
			this.setPermisosUsuarioTipoCuentaBancoGlobal();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado() && this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoCuentaBancoGlobalClasesRelacionadas();
			}
			
			if(this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoCuentaBancoGlobalClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoCuentaBancoGlobal();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoCuentaBancoGlobal();
			}
			
			if(!this.isPermisoBusquedaTipoCuentaBancoGlobal) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoCuentaBancoGlobal,this.isPermisoPaginacionMedioTipoCuentaBancoGlobal,this.isPermisoPaginacionTodoTipoCuentaBancoGlobal);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoCuentaBancoGlobalConstantesFunciones.getTiposSeleccionarTipoCuentaBancoGlobal());
				
				this.tiposColumnasSelect=TipoCuentaBancoGlobalConstantesFunciones.getTiposSeleccionarTipoCuentaBancoGlobal(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoCuentaBancoGlobal();				
				//this.tiposRelacionesSelect=TipoCuentaBancoGlobalConstantesFunciones.getTiposRelacionesTipoCuentaBancoGlobal(true);
				
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
			//if(!this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoCuentaBancoGlobal();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoCuentaBancoGlobal(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoCuentaBancoGlobal(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCuentaBancoGlobal() ;
			
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
			
			
			this.bancotipocuentabancoglobalLogic=new BancoTipoCuentaBancoGlobalLogic();
			this.datogeneralempleadoLogic=new DatoGeneralEmpleadoLogic();
			this.politicasclienteLogic=new PoliticasClienteLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.parametrotesoreriadefectoLogic=new ParametroTesoreriaDefectoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipocuentabancoglobalImplementable= (TipoCuentaBancoGlobalImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCuentaBancoGlobalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocuentabancoglobalImplementableHome= (TipoCuentaBancoGlobalImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCuentaBancoGlobalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocuentabancoglobals= new ArrayList<TipoCuentaBancoGlobal>();
			this.tipocuentabancoglobalsEliminados= new ArrayList<TipoCuentaBancoGlobal>();
						
			this.isEsNuevoTipoCuentaBancoGlobal=false;
			this.esParaAccionDesdeFormularioTipoCuentaBancoGlobal=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoCuentaBancoGlobal(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoCuentaBancoGlobal();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoCuentaBancoGlobalConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoCuentaBancoGlobal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoCuentaBancoGlobal(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoCuentaBancoGlobal();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoCuentaBancoGlobal();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoCuentaBancoGlobal(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoCuentaBancoGlobal: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoCuentaBancoGlobal() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoCuentaBancoGlobal")) {
				iIndex=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTabbedPaneRelacionesTipoCuentaBancoGlobal.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTabbedPaneRelacionesTipoCuentaBancoGlobal.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();	
				
				

				if(sTitle.equals("Banco Tipo Cuenta Banco Globales")) {
					if(!BancoTipoCuentaBancoGlobalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoCuentaBancoGlobal();

						this.cargarParteTabPanelRelacionadaBancoTipoCuentaBancoGlobal(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Dato General Empleados")) {
					if(!DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoCuentaBancoGlobal();

						this.cargarParteTabPanelRelacionadaDatoGeneralEmpleado(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Empleados")) {
					if(!EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoCuentaBancoGlobal();

						this.cargarParteTabPanelRelacionadaEmpleado(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Parametro Tesoreria Defectos")) {
					if(!ParametroTesoreriaDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoCuentaBancoGlobal();

						this.cargarParteTabPanelRelacionadaParametroTesoreriaDefecto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Politicas Clientes")) {
					if(!PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoCuentaBancoGlobal();

						this.cargarParteTabPanelRelacionadaPoliticasCliente(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoCuentaBancoGlobal();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaBancoTipoCuentaBancoGlobal(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.cargarSessionConBeanSwingJInternalFrameBancoTipoCuentaBancoGlobal(false,true,iIndex);
		this.jButtonBancoTipoCuentaBancoGlobalActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaBancoTipoCuentaBancoGlobal();

		//this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.updateUI();
		//this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaDatoGeneralEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(false,true,iIndex);
		this.jButtonDatoGeneralEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDatoGeneralEmpleado();

		//this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.updateUI();
		//this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.cargarSessionConBeanSwingJInternalFrameEmpleado(false,true,iIndex);
		this.jButtonEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEmpleado();

		//this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.updateUI();
		//this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaParametroTesoreriaDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.cargarSessionConBeanSwingJInternalFrameParametroTesoreriaDefecto(false,true,iIndex);
		this.jButtonParametroTesoreriaDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroTesoreriaDefecto();

		//this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.updateUI();
		//this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPoliticasCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.cargarSessionConBeanSwingJInternalFramePoliticasCliente(false,true,iIndex);
		this.jButtonPoliticasClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPoliticasCliente();

		//this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.updateUI();
		//this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoCuentaBancoGlobal.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("BancoTipoCuentaBancoGlobal")) {
				int row=this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();
				jButtonBancoTipoCuentaBancoGlobalActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("DatoGeneralEmpleado")) {
				int row=this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();
				jButtonDatoGeneralEmpleadoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("PoliticasCliente")) {
				int row=this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();
				jButtonPoliticasClienteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Empleado")) {
				int row=this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();
				jButtonEmpleadoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParametroTesoreriaDefecto")) {
				int row=this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();
				jButtonParametroTesoreriaDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Banco Tipo Cuenta Banco Global")) {

					if(this.isTienePermisosBancoTipoCuentaBancoGlobal && this.tipocuentabancoglobalConstantesFunciones.mostrarBancoTipoCuentaBancoGlobalTipoCuentaBancoGlobal && !TipoCuentaBancoGlobalConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Banco Tipo Cuenta Banco Globales"+"("+BancoTipoCuentaBancoGlobalConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Banco Tipo Cuenta Banco Globales");

						if(tipocuentabancoglobalConstantesFunciones.resaltarBancoTipoCuentaBancoGlobalTipoCuentaBancoGlobal!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocuentabancoglobalConstantesFunciones.resaltarBancoTipoCuentaBancoGlobalTipoCuentaBancoGlobal);
						}

						jmenuItem.setEnabled(this.tipocuentabancoglobalConstantesFunciones.activarBancoTipoCuentaBancoGlobalTipoCuentaBancoGlobal);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"BancoTipoCuentaBancoGlobal"));

						

						this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jmenuDetalleTipoCuentaBancoGlobal.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Dato General Empleado")) {

					if(this.isTienePermisosDatoGeneralEmpleado && this.tipocuentabancoglobalConstantesFunciones.mostrarDatoGeneralEmpleadoTipoCuentaBancoGlobal && !TipoCuentaBancoGlobalConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Dato General Empleados"+"("+DatoGeneralEmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Dato General Empleados");

						if(tipocuentabancoglobalConstantesFunciones.resaltarDatoGeneralEmpleadoTipoCuentaBancoGlobal!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocuentabancoglobalConstantesFunciones.resaltarDatoGeneralEmpleadoTipoCuentaBancoGlobal);
						}

						jmenuItem.setEnabled(this.tipocuentabancoglobalConstantesFunciones.activarDatoGeneralEmpleadoTipoCuentaBancoGlobal);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DatoGeneralEmpleado"));

						

						this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jmenuDetalleTipoCuentaBancoGlobal.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Politicas Cliente")) {

					if(this.isTienePermisosPoliticasCliente && this.tipocuentabancoglobalConstantesFunciones.mostrarPoliticasClienteTipoCuentaBancoGlobal && !TipoCuentaBancoGlobalConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Politicas Clientes"+"("+PoliticasClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Politicas Clientes");

						if(tipocuentabancoglobalConstantesFunciones.resaltarPoliticasClienteTipoCuentaBancoGlobal!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocuentabancoglobalConstantesFunciones.resaltarPoliticasClienteTipoCuentaBancoGlobal);
						}

						jmenuItem.setEnabled(this.tipocuentabancoglobalConstantesFunciones.activarPoliticasClienteTipoCuentaBancoGlobal);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PoliticasCliente"));

						

						this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jmenuDetalleTipoCuentaBancoGlobal.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Empleado")) {

					if(this.isTienePermisosEmpleado && this.tipocuentabancoglobalConstantesFunciones.mostrarEmpleadoTipoCuentaBancoGlobal && !TipoCuentaBancoGlobalConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Empleados"+"("+EmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Empleados");

						if(tipocuentabancoglobalConstantesFunciones.resaltarEmpleadoTipoCuentaBancoGlobal!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocuentabancoglobalConstantesFunciones.resaltarEmpleadoTipoCuentaBancoGlobal);
						}

						jmenuItem.setEnabled(this.tipocuentabancoglobalConstantesFunciones.activarEmpleadoTipoCuentaBancoGlobal);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Empleado"));

						

						this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jmenuDetalleTipoCuentaBancoGlobal.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parametro Tesoreria Defecto")) {

					if(this.isTienePermisosParametroTesoreriaDefecto && this.tipocuentabancoglobalConstantesFunciones.mostrarParametroTesoreriaDefectoTipoCuentaBancoGlobal && !TipoCuentaBancoGlobalConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Tesoreria Defectos"+"("+ParametroTesoreriaDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Tesoreria Defectos");

						if(tipocuentabancoglobalConstantesFunciones.resaltarParametroTesoreriaDefectoTipoCuentaBancoGlobal!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocuentabancoglobalConstantesFunciones.resaltarParametroTesoreriaDefectoTipoCuentaBancoGlobal);
						}

						jmenuItem.setEnabled(this.tipocuentabancoglobalConstantesFunciones.activarParametroTesoreriaDefectoTipoCuentaBancoGlobal);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroTesoreriaDefecto"));

						

						this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jmenuDetalleTipoCuentaBancoGlobal.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoCuentaBancoGlobal(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoCuentaBancoGlobal(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoCuentaBancoGlobal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoCuentaBancoGlobalListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoCuentaBancoGlobal();
		
		this.cargarCombosFrameForeignKeyTipoCuentaBancoGlobal();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoCuentaBancoGlobal();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoCuentaBancoGlobal();
		}
	}
	
	
	
	public void jButtonNuevoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
			
			
			if(jTableDatosTipoCuentaBancoGlobal.getRowCount()>=1) {
				jTableDatosTipoCuentaBancoGlobal.removeRowSelectionInterval(0, jTableDatosTipoCuentaBancoGlobal.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoCuentaBancoGlobal=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoCuentaBancoGlobal(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoCuentaBancoGlobal(true);			
			//this.tipocuentabancoglobal=new TipoCuentaBancoGlobal();
			//this.tipocuentabancoglobal.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCuentaBancoGlobal(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCuentaBancoGlobal() ;
			
			if(TipoCuentaBancoGlobalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCuentaBancoGlobal(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocuentabancoglobal);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancoglobal);				
			
			TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
			
			if(this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoCuentaBancoGlobal: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoCuentaBancoGlobalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoCuentaBancoGlobal> tipocuentabancoglobalsSeleccionados=new ArrayList<TipoCuentaBancoGlobal>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoCuentaBancoGlobal.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoCuentaBancoGlobal.getSelectedRows().length;			
			}
			
			tipocuentabancoglobalsSeleccionados=this.getTipoCuentaBancoGlobalsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoCuentaBancoGlobal--;			
				//TipoCuentaBancoGlobal tipocuentabancoglobalAux= new TipoCuentaBancoGlobal();			
				//tipocuentabancoglobalAux.setId(this.iIdNuevoTipoCuentaBancoGlobal);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoCuentaBancoGlobal tipocuentabancoglobalOrigen=new TipoCuentaBancoGlobal();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoCuentaBancoGlobal tipocuentabancoglobalOrigen : tipocuentabancoglobalsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocuentabancoglobalOrigen =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocuentabancoglobalOrigen =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoCuentaBancoGlobal();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocuentabancoglobal.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoCuentaBancoGlobal(tipocuentabancoglobalOrigen,this.tipocuentabancoglobal,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGlobal(this.tipocuentabancoglobal);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().add(this.tipocuentabancoglobalAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocuentabancoglobals.add(this.tipocuentabancoglobalAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoCuentaBancoGlobal(false);
				
				this.jTableDatosTipoCuentaBancoGlobal.setRowSelectionInterval(this.getIndiceNuevoTipoCuentaBancoGlobal(), this.getIndiceNuevoTipoCuentaBancoGlobal());
				
				int iLastRow =  this.jTableDatosTipoCuentaBancoGlobal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCuentaBancoGlobal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCuentaBancoGlobal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCuentaBancoGlobal(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoCuentaBancoGlobal> tipocuentabancoglobalsSeleccionados=new ArrayList<TipoCuentaBancoGlobal>();									
		
			TipoCuentaBancoGlobal tipocuentabancoglobalOrigen=new TipoCuentaBancoGlobal();
			TipoCuentaBancoGlobal tipocuentabancoglobalDestino=new TipoCuentaBancoGlobal();
				
			tipocuentabancoglobalsSeleccionados=this.getTipoCuentaBancoGlobalsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoCuentaBancoGlobal.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocuentabancoglobalsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoCuentaBancoGlobal.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentabancoglobalOrigen =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocuentabancoglobalOrigen =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocuentabancoglobalDestino =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocuentabancoglobalDestino =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocuentabancoglobalOrigen =tipocuentabancoglobalsSeleccionados.get(0);
				tipocuentabancoglobalDestino =tipocuentabancoglobalsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoCuentaBancoGlobal(tipocuentabancoglobalOrigen,tipocuentabancoglobalDestino,true,false);
				
				tipocuentabancoglobalDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocuentabancoglobalDestino,tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocuentabancoglobalDestino,tipocuentabancoglobals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoCuentaBancoGlobal(false);
				
				//this.jTableDatosTipoCuentaBancoGlobal.setRowSelectionInterval(this.getIndiceNuevoTipoCuentaBancoGlobal(), this.getIndiceNuevoTipoCuentaBancoGlobal());
				
				int iLastRow =  this.jTableDatosTipoCuentaBancoGlobal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCuentaBancoGlobal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCuentaBancoGlobal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCuentaBancoGlobal(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoCuentaBancoGlobal.isVisible();
			
			
			this.jPanelParametrosReportesTipoCuentaBancoGlobal.setVisible(!isVisible);
			this.jPanelPaginacionTipoCuentaBancoGlobal.setVisible(!isVisible);
			this.jPanelAccionesTipoCuentaBancoGlobal.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoCuentaBancoGlobal();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoCuentaBancoGlobal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoCuentaBancoGlobal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoCuentaBancoGlobal();
			
			this.abrirFrameOrderByTipoCuentaBancoGlobal();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoCuentaBancoGlobal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoCuentaBancoGlobal(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCuentaBancoGlobal);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.isMaximum()) {
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.setSize(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.iWidthFormulario,this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.isMaximum()) {
						this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jContentPaneDetalleTipoCuentaBancoGlobal.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTabbedPaneRelacionesTipoCuentaBancoGlobal.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jContentPaneDetalleTipoCuentaBancoGlobal.getWidth(),TipoCuentaBancoGlobalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTabbedPaneRelacionesTipoCuentaBancoGlobal.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jContentPaneDetalleTipoCuentaBancoGlobal.getWidth(),TipoCuentaBancoGlobalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTabbedPaneRelacionesTipoCuentaBancoGlobal.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jContentPaneDetalleTipoCuentaBancoGlobal.getWidth(),TipoCuentaBancoGlobalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(BancoTipoCuentaBancoGlobalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaBancoTipoCuentaBancoGlobal();
					}

					if(DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDatoGeneralEmpleado();
					}

					if(EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEmpleado();
					}

					if(ParametroTesoreriaDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroTesoreriaDefecto();
					}

					if(PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPoliticasCliente();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.setVisible(true);
	        this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoCuentaBancoGlobal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoCuentaBancoGlobal==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoCuentaBancoGlobal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCuentaBancoGlobal,false,this);
				} else {
					this.jInternalFrameOrderByTipoCuentaBancoGlobal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCuentaBancoGlobal,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoCuentaBancoGlobal);
				this.jInternalFrameOrderByTipoCuentaBancoGlobal.setVisible(false);
				this.jInternalFrameOrderByTipoCuentaBancoGlobal.setSelected(false);
				
				this.jInternalFrameOrderByTipoCuentaBancoGlobal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCuentaBancoGlobal"));
				
				this.inicializarActualizarBindingTablaOrderByTipoCuentaBancoGlobal();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoCuentaBancoGlobal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoCuentaBancoGlobal==null) {
				
				this.jInternalFrameImportacionTipoCuentaBancoGlobal=new ImportacionJInternalFrame(TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCuentaBancoGlobal);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoCuentaBancoGlobal);
				this.jInternalFrameImportacionTipoCuentaBancoGlobal.setVisible(false);
				this.jInternalFrameImportacionTipoCuentaBancoGlobal.setSelected(false);


				this.jInternalFrameImportacionTipoCuentaBancoGlobal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCuentaBancoGlobal"));
				this.jInternalFrameImportacionTipoCuentaBancoGlobal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCuentaBancoGlobal"));
				this.jInternalFrameImportacionTipoCuentaBancoGlobal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCuentaBancoGlobal"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoCuentaBancoGlobal() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal==null) {
				this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal=new ReporteDinamicoJInternalFrame(TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal);
				this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCuentaBancoGlobal"));
				this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCuentaBancoGlobal"));
				this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCuentaBancoGlobal"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCuentaBancoGlobal();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaBancoTipoCuentaBancoGlobal() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.jScrollPanelDatosBancoTipoCuentaBancoGlobal.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jContentPaneDetalleTipoCuentaBancoGlobal.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.jScrollPanelDatosBancoTipoCuentaBancoGlobal.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaDatoGeneralEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jContentPaneDetalleTipoCuentaBancoGlobal.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jContentPaneDetalleTipoCuentaBancoGlobal.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaParametroTesoreriaDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroTesoreriaDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jContentPaneDetalleTipoCuentaBancoGlobal.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroTesoreriaDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroTesoreriaDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroTesoreriaDefecto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPoliticasCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.jScrollPanelDatosPoliticasCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jContentPaneDetalleTipoCuentaBancoGlobal.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.jScrollPanelDatosPoliticasCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.jScrollPanelDatosPoliticasCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.jScrollPanelDatosPoliticasCliente.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoCuentaBancoGlobal() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCuentaBancoGlobal);
			
	       	this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.setVisible(false);
	        this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.dispose();
			//this.jInternalFrameDetalleFormTipoCuentaBancoGlobal=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoCuentaBancoGlobal() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoCuentaBancoGlobal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoCuentaBancoGlobal.setVisible(true);
	        this.jInternalFrameImportacionTipoCuentaBancoGlobal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoCuentaBancoGlobal() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoCuentaBancoGlobal.setVisible(true);
	        this.jInternalFrameOrderByTipoCuentaBancoGlobal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoCuentaBancoGlobal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoCuentaBancoGlobal.setVisible(false);
	        this.jInternalFrameOrderByTipoCuentaBancoGlobal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoCuentaBancoGlobal() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoCuentaBancoGlobal() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoCuentaBancoGlobal.setVisible(false);
	        this.jInternalFrameImportacionTipoCuentaBancoGlobal.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoCuentaBancoGlobal(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoCuentaBancoGlobal(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoCuentaBancoGlobal(true);
			//this.isEsNuevoTipoCuentaBancoGlobal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoCuentaBancoGlobal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCuentaBancoGlobal(false) ;
			
			if(tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado() && BancoTipoCuentaBancoGlobalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonBancoTipoCuentaBancoGlobalActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado() && DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDatoGeneralEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.getEsGuardarRelacionado() && PoliticasClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPoliticasClienteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado() && EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado() && ParametroTesoreriaDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroTesoreriaDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoCuentaBancoGlobalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCuentaBancoGlobal(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCuentaBancoGlobal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoCuentaBancoGlobalActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoCuentaBancoGlobal(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoCuentaBancoGlobal(true);
			//this.isEsNuevoTipoCuentaBancoGlobal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocuentabancoglobal.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoCuentaBancoGlobal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoCuentaBancoGlobal(false) ;
			
			if(TipoCuentaBancoGlobalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCuentaBancoGlobal(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCuentaBancoGlobal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoCuentaBancoGlobal(false);
			
			//if(!this.isEsNuevoTipoCuentaBancoGlobal) {								
				int intSelectedRow = this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoCuentaBancoGlobal(this.tipocuentabancoglobal,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGlobal(this.tipocuentabancoglobal);
				
			}
			
			if(this.permiteMantenimiento(this.tipocuentabancoglobal)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoCuentaBancoGlobal=true;
					this.inicializarActualizarBindingTablaTipoCuentaBancoGlobal(false);
					this.isEsNuevoTipoCuentaBancoGlobal=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoCuentaBancoGlobal=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoCuentaBancoGlobal=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCuentaBancoGlobal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCuentaBancoGlobal(false);
				
				this.habilitarDeshabilitarControlesTipoCuentaBancoGlobal(false);
			
												
				
				if(TipoCuentaBancoGlobalJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoCuentaBancoGlobal();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoCuentaBancoGlobalActionPerformed(evt,tipocuentabancoglobalSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoCuentaBancoGlobal(this.tipocuentabancoglobal,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoCuentaBancoGlobal.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocuentabancoglobalSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocuentabancoglobal.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBancoGlobal.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBancoGlobal.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				this.tipocuentabancoglobal.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				this.tipocuentabancoglobal.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocuentabancoglobal)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoCuentaBancoGlobalModel) this.jTableDatosTipoCuentaBancoGlobal.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoCuentaBancoGlobal=true;
				this.inicializarActualizarBindingTablaTipoCuentaBancoGlobal(false);
				this.isEsNuevoTipoCuentaBancoGlobal=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCuentaBancoGlobal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCuentaBancoGlobal(false);
				
				this.habilitarDeshabilitarControlesTipoCuentaBancoGlobal(false);
				
				
				
				if(TipoCuentaBancoGlobalJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoCuentaBancoGlobal();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoCuentaBancoGlobal.getRowCount()>=1) {
				jTableDatosTipoCuentaBancoGlobal.removeRowSelectionInterval(0, jTableDatosTipoCuentaBancoGlobal.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoCuentaBancoGlobal(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoCuentaBancoGlobal(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCuentaBancoGlobal(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCuentaBancoGlobal(false) ;
			
			this.isEsNuevoTipoCuentaBancoGlobal=false;
			
			if(TipoCuentaBancoGlobalJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoCuentaBancoGlobal();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoCuentaBancoGlobal(false);
				
				//SI ES MANUAL
				if(TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoCuentaBancoGlobal();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoCuentaBancoGlobal--;			
			//TipoCuentaBancoGlobal tipocuentabancoglobalAux= new TipoCuentaBancoGlobal();			
			//tipocuentabancoglobalAux.setId(this.iIdNuevoTipoCuentaBancoGlobal);
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoCuentaBancoGlobal();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGlobal(this.tipocuentabancoglobal);
			
			this.tipocuentabancoglobal.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().add(this.tipocuentabancoglobalAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocuentabancoglobals.add(this.tipocuentabancoglobalAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoCuentaBancoGlobal(false);
			
			this.jTableDatosTipoCuentaBancoGlobal.setRowSelectionInterval(this.getIndiceNuevoTipoCuentaBancoGlobal(), this.getIndiceNuevoTipoCuentaBancoGlobal());
			
			int iLastRow =  this.jTableDatosTipoCuentaBancoGlobal.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoCuentaBancoGlobal.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoCuentaBancoGlobal.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoCuentaBancoGlobal(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoCuentaBancoGlobal(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCuentaBancoGlobal(false);
			
			//SI ES MANUAL
			if(TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCuentaBancoGlobal();
			}
			
			//this.abrirFrameTreeTipoCuentaBancoGlobal();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Cuenta Banco GlobalS ?", "MANTENIMIENTO DE Tipo Cuenta Banco Global", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoCuentaBancoGlobal.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoCuentaBancoGlobal();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocuentabancoglobalReturnGeneral=tipocuentabancoglobalLogic.procesarImportacionTipoCuentaBancoGlobalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocuentabancoglobalParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoCuentaBancoGlobalReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoCuentaBancoGlobal.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoCuentaBancoGlobal.setFileImportacion(this.jInternalFrameImportacionTipoCuentaBancoGlobal.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoCuentaBancoGlobal.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoCuentaBancoGlobal.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoCuentaBancoGlobal.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoCuentaBancoGlobal.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoCuentaBancoGlobal> tipocuentabancoglobalsSeleccionados=new ArrayList<TipoCuentaBancoGlobal>();		

		tipocuentabancoglobalsSeleccionados=this.getTipoCuentaBancoGlobalsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoCuentaBancoGlobalBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoCuentaBancoGlobalBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoCuentaBancoGlobals("Todos",tipocuentabancoglobalsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco Global",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCuentaBancoGlobalConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCuentaBancoGlobalConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoCuentaBancoGlobalConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoCuentaBancoGlobalConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoCuentaBancoGlobalConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoCuentaBancoGlobalConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCuentaBancoGlobalConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoCuentaBancoGlobalConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoCuentaBancoGlobal> tipocuentabancoglobalsSeleccionados=new ArrayList<TipoCuentaBancoGlobal>();		
		
		tipocuentabancoglobalsSeleccionados=this.getTipoCuentaBancoGlobalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentabancoglobal";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoCuentaBancoGlobals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoCuentaBancoGlobalConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCuentaBancoGlobalConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoCuentaBancoGlobal tipocuentabancoglobal:tipocuentabancoglobalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocuentabancoglobal.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCuentaBancoGlobalConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCuentaBancoGlobalConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoCuentaBancoGlobal tipocuentabancoglobal:tipocuentabancoglobalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocuentabancoglobal.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoCuentaBancoGlobal(row);				
			//	iRow++;
			//}				
			
			//for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:tipocuentabancoglobalsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoCuentaBancoGlobal(tipocuentabancoglobalAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco Global",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocuentabancoglobalLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCuentaBancoGlobal(false);
			
			//SI ES MANUAL
			if(TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCuentaBancoGlobal();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCuentaBancoGlobal(false);
			
			//SI ES MANUAL
			if(TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCuentaBancoGlobal();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoCuentaBancoGlobalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCuentaBancoGlobal(false);
			
			//SI ES MANUAL
			if(TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCuentaBancoGlobal();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocuentabancoglobalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoCuentaBancoGlobal() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoCuentaBancoGlobal.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoCuentaBancoGlobal.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoCuentaBancoGlobal.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoCuentaBancoGlobal.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoCuentaBancoGlobal.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoCuentaBancoGlobal.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoCuentaBancoGlobal.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoCuentaBancoGlobal(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoCuentaBancoGlobal(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoCuentaBancoGlobal(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoCuentaBancoGlobal(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoCuentaBancoGlobal(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoCuentaBancoGlobal(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCuentaBancoGlobal(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoCuentaBancoGlobal(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoCuentaBancoGlobal() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoCuentaBancoGlobal();
		
		this.inicializarActualizarBindingBotonesManualTipoCuentaBancoGlobal(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCuentaBancoGlobal();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCuentaBancoGlobal() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCuentaBancoGlobal(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCuentaBancoGlobal(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoCuentaBancoGlobal.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoCuentaBancoGlobal.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoCuentaBancoGlobal.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jCheckBoxPostAccionNuevoTipoCuentaBancoGlobal.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jCheckBoxPostAccionSinCerrarTipoCuentaBancoGlobal.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jCheckBoxPostAccionSinMensajeTipoCuentaBancoGlobal.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoCuentaBancoGlobal.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoCuentaBancoGlobal.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoCuentaBancoGlobal.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) {
				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jCheckBoxPostAccionNuevoTipoCuentaBancoGlobal.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jCheckBoxPostAccionSinCerrarTipoCuentaBancoGlobal.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jCheckBoxPostAccionSinMensajeTipoCuentaBancoGlobal.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoCuentaBancoGlobal.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoCuentaBancoGlobal.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoCuentaBancoGlobal.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoCuentaBancoGlobal.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoCuentaBancoGlobal.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoCuentaBancoGlobal.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoCuentaBancoGlobal.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoCuentaBancoGlobal.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoCuentaBancoGlobal(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCuentaBancoGlobal(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoCuentaBancoGlobal() throws Exception {
		try	{
			if(TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCuentaBancoGlobal();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCuentaBancoGlobal() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCuentaBancoGlobal() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoCuentaBancoGlobal.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoCuentaBancoGlobal.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoCuentaBancoGlobal.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoCuentaBancoGlobal.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoCuentaBancoGlobal.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoCuentaBancoGlobal.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoCuentaBancoGlobal.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoCuentaBancoGlobal.addItem(reporte);
			}
			
			
			if(!this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoCuentaBancoGlobal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoCuentaBancoGlobal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoCuentaBancoGlobal.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoCuentaBancoGlobal.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoCuentaBancoGlobal.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoCuentaBancoGlobal.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoCuentaBancoGlobal.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCuentaBancoGlobal();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCuentaBancoGlobal() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal!=null) {
				this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal!=null) {
				this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoCuentaBancoGlobal()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoCuentaBancoGlobal(Boolean esInicializar) throws Exception {				
		if(TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCuentaBancoGlobal();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoCuentaBancoGlobal() throws Exception {
		this.inicializarActualizarBindingTablaTipoCuentaBancoGlobal(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoCuentaBancoGlobal() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoCuentaBancoGlobal.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoCuentaBancoGlobal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCuentaBancoGlobal.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoCuentaBancoGlobalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoCuentaBancoGlobal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCuentaBancoGlobal.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoCuentaBancoGlobalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoCuentaBancoGlobalOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBancoGlobalOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoCuentaBancoGlobalPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoCuentaBancoGlobal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCuentaBancoGlobal.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoCuentaBancoGlobalPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoCuentaBancoGlobal.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoCuentaBancoGlobal(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocuentabancoglobals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoCuentaBancoGlobal.setModel(new TipoCuentaBancoGlobalModel(this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoCuentaBancoGlobal.setModel(new TipoCuentaBancoGlobalModel(this.tipocuentabancoglobals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoCuentaBancoGlobal!=null && this.jInternalFrameOrderByTipoCuentaBancoGlobal.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoCuentaBancoGlobal();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoCuentaBancoGlobal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBancoGlobal,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoCuentaBancoGlobalPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO,tipocuentabancoglobalConstantesFunciones.resaltarSeleccionarTipoCuentaBancoGlobal,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO,tipocuentabancoglobalConstantesFunciones.resaltarSeleccionarTipoCuentaBancoGlobal,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoCuentaBancoGlobal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBancoGlobal,TipoCuentaBancoGlobalConstantesFunciones.LABEL_ID));

		if(this.tipocuentabancoglobalConstantesFunciones.mostraridTipoCuentaBancoGlobal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCuentaBancoGlobalConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocuentabancoglobalConstantesFunciones.resaltaridTipoCuentaBancoGlobal,this.tipocuentabancoglobalConstantesFunciones.activaridTipoCuentaBancoGlobal,this,true,"idTipoCuentaBancoGlobal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocuentabancoglobalConstantesFunciones.resaltaridTipoCuentaBancoGlobal,this.tipocuentabancoglobalConstantesFunciones.activaridTipoCuentaBancoGlobal,this,true,"idTipoCuentaBancoGlobal","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCuentaBancoGlobal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBancoGlobal,TipoCuentaBancoGlobalConstantesFunciones.LABEL_CODIGO));

		if(this.tipocuentabancoglobalConstantesFunciones.mostrarcodigoTipoCuentaBancoGlobal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCuentaBancoGlobalConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocuentabancoglobalConstantesFunciones.resaltarcodigoTipoCuentaBancoGlobal,this.tipocuentabancoglobalConstantesFunciones.activarcodigoTipoCuentaBancoGlobal,this,true,"codigoTipoCuentaBancoGlobal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocuentabancoglobalConstantesFunciones.resaltarcodigoTipoCuentaBancoGlobal,this.tipocuentabancoglobalConstantesFunciones.activarcodigoTipoCuentaBancoGlobal,this,true,"codigoTipoCuentaBancoGlobal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCuentaBancoGlobalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCuentaBancoGlobal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBancoGlobal,TipoCuentaBancoGlobalConstantesFunciones.LABEL_NOMBRE));

		if(this.tipocuentabancoglobalConstantesFunciones.mostrarnombreTipoCuentaBancoGlobal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCuentaBancoGlobalConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocuentabancoglobalConstantesFunciones.resaltarnombreTipoCuentaBancoGlobal,this.tipocuentabancoglobalConstantesFunciones.activarnombreTipoCuentaBancoGlobal,this,true,"nombreTipoCuentaBancoGlobal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocuentabancoglobalConstantesFunciones.resaltarnombreTipoCuentaBancoGlobal,this.tipocuentabancoglobalConstantesFunciones.activarnombreTipoCuentaBancoGlobal,this,true,"nombreTipoCuentaBancoGlobal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCuentaBancoGlobalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosBancoTipoCuentaBancoGlobal && this.tipocuentabancoglobalConstantesFunciones.mostrarBancoTipoCuentaBancoGlobalTipoCuentaBancoGlobal && !TipoCuentaBancoGlobalConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Banco Tipo Cuenta Banco Globales");
				tableColumn.setHeaderValue("Banco Tipo Cuenta Banco Globales");
				tableColumn.setCellRenderer(new BancoTipoCuentaBancoGlobalTableCell(tipocuentabancoglobalConstantesFunciones.resaltarBancoTipoCuentaBancoGlobalTipoCuentaBancoGlobal,this,this.tipocuentabancoglobalConstantesFunciones.activarBancoTipoCuentaBancoGlobalTipoCuentaBancoGlobal));
				tableColumn.setCellEditor(new BancoTipoCuentaBancoGlobalTableCell(tipocuentabancoglobalConstantesFunciones.resaltarBancoTipoCuentaBancoGlobalTipoCuentaBancoGlobal,this,this.tipocuentabancoglobalConstantesFunciones.activarBancoTipoCuentaBancoGlobalTipoCuentaBancoGlobal));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoCuentaBancoGlobal.addColumn(tableColumn);
			}

			if(this.isTienePermisosDatoGeneralEmpleado && this.tipocuentabancoglobalConstantesFunciones.mostrarDatoGeneralEmpleadoTipoCuentaBancoGlobal && !TipoCuentaBancoGlobalConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Dato General Empleados");
				tableColumn.setHeaderValue("Dato General Empleados");
				tableColumn.setCellRenderer(new DatoGeneralEmpleadoTableCell(tipocuentabancoglobalConstantesFunciones.resaltarDatoGeneralEmpleadoTipoCuentaBancoGlobal,this,this.tipocuentabancoglobalConstantesFunciones.activarDatoGeneralEmpleadoTipoCuentaBancoGlobal));
				tableColumn.setCellEditor(new DatoGeneralEmpleadoTableCell(tipocuentabancoglobalConstantesFunciones.resaltarDatoGeneralEmpleadoTipoCuentaBancoGlobal,this,this.tipocuentabancoglobalConstantesFunciones.activarDatoGeneralEmpleadoTipoCuentaBancoGlobal));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoCuentaBancoGlobal.addColumn(tableColumn);
			}

			if(this.isTienePermisosPoliticasCliente && this.tipocuentabancoglobalConstantesFunciones.mostrarPoliticasClienteTipoCuentaBancoGlobal && !TipoCuentaBancoGlobalConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Politicas Clientes");
				tableColumn.setHeaderValue("Politicas Clientes");
				tableColumn.setCellRenderer(new PoliticasClienteTableCell(tipocuentabancoglobalConstantesFunciones.resaltarPoliticasClienteTipoCuentaBancoGlobal,this,this.tipocuentabancoglobalConstantesFunciones.activarPoliticasClienteTipoCuentaBancoGlobal));
				tableColumn.setCellEditor(new PoliticasClienteTableCell(tipocuentabancoglobalConstantesFunciones.resaltarPoliticasClienteTipoCuentaBancoGlobal,this,this.tipocuentabancoglobalConstantesFunciones.activarPoliticasClienteTipoCuentaBancoGlobal));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoCuentaBancoGlobal.addColumn(tableColumn);
			}

			if(this.isTienePermisosEmpleado && this.tipocuentabancoglobalConstantesFunciones.mostrarEmpleadoTipoCuentaBancoGlobal && !TipoCuentaBancoGlobalConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Empleados");
				tableColumn.setHeaderValue("Empleados");
				tableColumn.setCellRenderer(new EmpleadoTableCell(tipocuentabancoglobalConstantesFunciones.resaltarEmpleadoTipoCuentaBancoGlobal,this,this.tipocuentabancoglobalConstantesFunciones.activarEmpleadoTipoCuentaBancoGlobal));
				tableColumn.setCellEditor(new EmpleadoTableCell(tipocuentabancoglobalConstantesFunciones.resaltarEmpleadoTipoCuentaBancoGlobal,this,this.tipocuentabancoglobalConstantesFunciones.activarEmpleadoTipoCuentaBancoGlobal));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoCuentaBancoGlobal.addColumn(tableColumn);
			}

			if(this.isTienePermisosParametroTesoreriaDefecto && this.tipocuentabancoglobalConstantesFunciones.mostrarParametroTesoreriaDefectoTipoCuentaBancoGlobal && !TipoCuentaBancoGlobalConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Tesoreria Defectos");
				tableColumn.setHeaderValue("Parametro Tesoreria Defectos");
				tableColumn.setCellRenderer(new ParametroTesoreriaDefectoTableCell(tipocuentabancoglobalConstantesFunciones.resaltarParametroTesoreriaDefectoTipoCuentaBancoGlobal,this,this.tipocuentabancoglobalConstantesFunciones.activarParametroTesoreriaDefectoTipoCuentaBancoGlobal));
				tableColumn.setCellEditor(new ParametroTesoreriaDefectoTableCell(tipocuentabancoglobalConstantesFunciones.resaltarParametroTesoreriaDefectoTipoCuentaBancoGlobal,this,this.tipocuentabancoglobalConstantesFunciones.activarParametroTesoreriaDefectoTipoCuentaBancoGlobal));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoCuentaBancoGlobal.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCuentaBancoGlobal.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCuentaBancoGlobal.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosTipoCuentaBancoGlobal) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoCuentaBancoGlobal.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTipoCuentaBancoGlobal.addColumn(tableColumn);
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
			
			this.jTableDatosTipoCuentaBancoGlobal.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosTipoCuentaBancoGlobal) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosTipoCuentaBancoGlobal) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoCuentaBancoGlobal.moveColumn(this.jTableDatosTipoCuentaBancoGlobal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoCuentaBancoGlobal.moveColumn(this.jTableDatosTipoCuentaBancoGlobal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoCuentaBancoGlobal.moveColumn(this.jTableDatosTipoCuentaBancoGlobal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoCuentaBancoGlobal.moveColumn(this.jTableDatosTipoCuentaBancoGlobal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoCuentaBancoGlobal.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoCuentaBancoGlobal.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoCuentaBancoGlobal,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoCuentaBancoGlobal.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoCuentaBancoGlobal.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoCuentaBancoGlobal.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoCuentaBancoGlobal.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoCuentaBancoGlobal.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocuentabancoglobals.size()-1;
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
		//this.jTableDatosTipoCuentaBancoGlobal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoCuentaBancoGlobal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoCuentaBancoGlobal();
			
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
				
				//this.isEsNuevoTipoCuentaBancoGlobal=false;
					
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
			
				if(this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCuentaBancoGlobal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocuentabancoglobal.getsType().equals("DUPLICADO")
				   || this.tipocuentabancoglobal.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoCuentaBancoGlobal=true;
				
				} else {
					this.isEsNuevoTipoCuentaBancoGlobal=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocuentabancoglobal.getId()>=0 && !this.tipocuentabancoglobal.getIsNew()) {						
						this.isEsNuevoTipoCuentaBancoGlobal=false;
						
					} else {
						this.isEsNuevoTipoCuentaBancoGlobal=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoCuentaBancoGlobal(esRelaciones);						
				
				this.seleccionarTipoCuentaBancoGlobal(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocuentabancoglobal.getId()<0) {
					this.isEsNuevoTipoCuentaBancoGlobal=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoCuentaBancoGlobal(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoCuentaBancoGlobal(evt,rowIndex);
				}	
				
				if(this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoCuentaBancoGlobal: " + this.dDif); 
					}
				}								
				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoCuentaBancoGlobal(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocuentabancoglobal)) {
					if(this.tipocuentabancoglobal.getId()>0) {
						this.tipocuentabancoglobal.setIsDeleted(true);
						
						this.tipocuentabancoglobalsEliminados.add(this.tipocuentabancoglobal);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().remove(this.tipocuentabancoglobal);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocuentabancoglobals.remove(this.tipocuentabancoglobal);				
					}
					
					
					((TipoCuentaBancoGlobalModel) this.jTableDatosTipoCuentaBancoGlobal.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCuentaBancoGlobal(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoCuentaBancoGlobal(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoCuentaBancoGlobal) {
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCuentaBancoGlobal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoCuentaBancoGlobal(this.tipocuentabancoglobal);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoCuentaBancoGlobal("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoCuentaBancoGlobal(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCuentaBancoGlobal() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCuentaBancoGlobal(TipoCuentaBancoGlobal tipocuentabancoglobal) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoCuentaBancoGlobal(tipocuentabancoglobal,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCuentaBancoGlobal(TipoCuentaBancoGlobal tipocuentabancoglobal,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoCuentaBancoGlobal(tipocuentabancoglobal);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoCuentaBancoGlobal(tipocuentabancoglobal,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoCuentaBancoGlobal(tipocuentabancoglobal);
	}
	
	public void setVariablesObjetoActualToFormularioTipoCuentaBancoGlobal(TipoCuentaBancoGlobal tipocuentabancoglobal) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextFieldidTipoCuentaBancoGlobal.setText(tipocuentabancoglobal.getId().toString());
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextFieldcodigoTipoCuentaBancoGlobal.setText(tipocuentabancoglobal.getcodigo());
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextAreanombreTipoCuentaBancoGlobal.setText(tipocuentabancoglobal.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoCuentaBancoGlobal tipocuentabancoglobalLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocuentabancoglobalLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoCuentaBancoGlobal tipocuentabancoglobalLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocuentabancoglobalLocal=this.tipocuentabancoglobal;
			} else {
				tipocuentabancoglobalLocal=this.tipocuentabancoglobalAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocuentabancoglobalLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoCuentaBancoGlobal(tipocuentabancoglobalLocal,true);
					
					if(tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocuentabancoglobalLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocuentabancoglobalLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoCuentaBancoGlobal(TipoCuentaBancoGlobal tipocuentabancoglobal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCuentaBancoGlobal(tipocuentabancoglobal,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGlobal(tipocuentabancoglobal);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCuentaBancoGlobal(TipoCuentaBancoGlobal tipocuentabancoglobal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCuentaBancoGlobal(tipocuentabancoglobal,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCuentaBancoGlobal(TipoCuentaBancoGlobal tipocuentabancoglobal,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextFieldidTipoCuentaBancoGlobal.getText()==null || this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextFieldidTipoCuentaBancoGlobal.getText()=="" || this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextFieldidTipoCuentaBancoGlobal.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextFieldidTipoCuentaBancoGlobal.setText("0");
			}

			if(conColumnasBase) {tipocuentabancoglobal.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextFieldidTipoCuentaBancoGlobal.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCuentaBancoGlobalConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jLabelIdTipoCuentaBancoGlobal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocuentabancoglobal.setcodigo(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextFieldcodigoTipoCuentaBancoGlobal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCuentaBancoGlobalConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jLabelcodigoTipoCuentaBancoGlobal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocuentabancoglobal.setnombre(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextAreanombreTipoCuentaBancoGlobal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCuentaBancoGlobalConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jLabelnombreTipoCuentaBancoGlobal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCuentaBancoGlobal(TipoCuentaBancoGlobal tipocuentabancoglobalBean,TipoCuentaBancoGlobal tipocuentabancoglobal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoCuentaBancoGlobal(TipoCuentaBancoGlobal tipocuentabancoglobalOrigen,TipoCuentaBancoGlobal tipocuentabancoglobal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocuentabancoglobalOrigen.getId()!=null && !tipocuentabancoglobalOrigen.getId().equals(0L))) {tipocuentabancoglobal.setId(tipocuentabancoglobalOrigen.getId());}}
			if(conDefault || (!conDefault && tipocuentabancoglobalOrigen.getcodigo()!=null && !tipocuentabancoglobalOrigen.getcodigo().equals(""))) {tipocuentabancoglobal.setcodigo(tipocuentabancoglobalOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipocuentabancoglobalOrigen.getnombre()!=null && !tipocuentabancoglobalOrigen.getnombre().equals(""))) {tipocuentabancoglobal.setnombre(tipocuentabancoglobalOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCuentaBancoGlobal(TipoCuentaBancoGlobal tipocuentabancoglobal) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextFieldidTipoCuentaBancoGlobal.setText(tipocuentabancoglobal.getId().toString());
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextFieldcodigoTipoCuentaBancoGlobal.setText(tipocuentabancoglobal.getcodigo());
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextAreanombreTipoCuentaBancoGlobal.setText(tipocuentabancoglobal.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCuentaBancoGlobal(TipoCuentaBancoGlobalBean tipocuentabancoglobalBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextFieldidTipoCuentaBancoGlobal.setText(tipocuentabancoglobalBean.getId().toString());
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextFieldcodigoTipoCuentaBancoGlobal.setText(tipocuentabancoglobalBean.getcodigo());
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextAreanombreTipoCuentaBancoGlobal.setText(tipocuentabancoglobalBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoCuentaBancoGlobal(TipoCuentaBancoGlobalParameterReturnGeneral tipocuentabancoglobalReturnGeneral,TipoCuentaBancoGlobalBean tipocuentabancoglobalBean,Boolean conDefault) throws Exception { 
		try {
			TipoCuentaBancoGlobal tipocuentabancoglobalLocal=new TipoCuentaBancoGlobal();
			
			tipocuentabancoglobalLocal=tipocuentabancoglobalReturnGeneral.getTipoCuentaBancoGlobal();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocuentabancoglobalLocal.getId()!=null && !tipocuentabancoglobalLocal.getId().equals(0L))) {tipocuentabancoglobalBean.setId(tipocuentabancoglobalLocal.getId());}}
			if(conDefault || (!conDefault && tipocuentabancoglobalLocal.getcodigo()!=null && !tipocuentabancoglobalLocal.getcodigo().equals(""))) {tipocuentabancoglobalBean.setcodigo(tipocuentabancoglobalLocal.getcodigo());}
			if(conDefault || (!conDefault && tipocuentabancoglobalLocal.getnombre()!=null && !tipocuentabancoglobalLocal.getnombre().equals(""))) {tipocuentabancoglobalBean.setnombre(tipocuentabancoglobalLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoCuentaBancoGlobalGenerico(Long idTipoCuentaBancoGlobalSeleccionado,JComboBox jComboBoxTipoCuentaBancoGlobal,List<TipoCuentaBancoGlobal> tipocuentabancoglobalsLocal)throws Exception {
		try {
			TipoCuentaBancoGlobal  tipocuentabancoglobalTemp=null;

			for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:tipocuentabancoglobalsLocal) {
				if(tipocuentabancoglobalAux.getId()!=null && tipocuentabancoglobalAux.getId().equals(idTipoCuentaBancoGlobalSeleccionado)) {
					tipocuentabancoglobalTemp=tipocuentabancoglobalAux;
					break;
				}
			}

			jComboBoxTipoCuentaBancoGlobal.setSelectedItem(tipocuentabancoglobalTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoCuentaBancoGlobalGenerico(JComboBox jComboBoxTipoCuentaBancoGlobal,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoCuentaBancoGlobal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCuentaBancoGlobal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoCuentaBancoGlobal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCuentaBancoGlobal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCuentaBancoGlobal.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoCuentaBancoGlobal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCuentaBancoGlobal.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoCuentaBancoGlobal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoCuentaBancoGlobal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoCuentaBancoGlobal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("BancoTipoCuentaBancoGlobal")) {
			jButtonBancoTipoCuentaBancoGlobalActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("DatoGeneralEmpleado")) {
			jButtonDatoGeneralEmpleadoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("PoliticasCliente")) {
			jButtonPoliticasClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Empleado")) {
			jButtonEmpleadoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ParametroTesoreriaDefecto")) {
			jButtonParametroTesoreriaDefectoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocuentabancoglobal=(TipoCuentaBancoGlobal) tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocuentabancoglobal =(TipoCuentaBancoGlobal) tipocuentabancoglobals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoCuentaBancoGlobal tipocuentabancoglobalRow=new TipoCuentaBancoGlobal();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocuentabancoglobalRow=(TipoCuentaBancoGlobal) tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocuentabancoglobalRow=(TipoCuentaBancoGlobal) tipocuentabancoglobals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonBancoTipoCuentaBancoGlobalActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoCuentaBancoGlobal tipocuentabancoglobal) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabancoglobal = (TipoCuentaBancoGlobal)this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocuentabancoglobal = (TipoCuentaBancoGlobal)this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocuentabancoglobal!=null) {
						this.tipocuentabancoglobal = tipocuentabancoglobal;
					} else {
						this.tipocuentabancoglobal = new TipoCuentaBancoGlobal();
					}
				}

				if(this.isTienePermisosBancoTipoCuentaBancoGlobal && this.permiteMantenimiento(this.tipocuentabancoglobal)) {
					BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame bancotipocuentabancoglobalBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFramePopup=new BancoTipoCuentaBancoGlobalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						bancotipocuentabancoglobalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFramePopup;
					} else {
						bancotipocuentabancoglobalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame;
					}

					List<TipoCuentaBancoGlobal> tipocuentabancoglobals=new ArrayList<TipoCuentaBancoGlobal>();
					tipocuentabancoglobals.add(this.tipocuentabancoglobal);
					if(!esRelacionado) {
						//bancotipocuentabancoglobalBeanSwingJInternalFrame.bancotipocuentabancoglobalSessionBean.setConGuardarRelaciones(false);
						//bancotipocuentabancoglobalBeanSwingJInternalFrame.bancotipocuentabancoglobalSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					bancotipocuentabancoglobalBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.cargarBancoTipoCuentaBancoGlobalBeanSwingJInternalFrame(tipocuentabancoglobals,this.tipocuentabancoglobal,bancotipocuentabancoglobalBeanSwingJInternalFrame,/*conInicializar,*/bancotipocuentabancoglobalBeanSwingJInternalFrame.bancotipocuentabancoglobalSessionBean.getConGuardarRelaciones(),bancotipocuentabancoglobalBeanSwingJInternalFrame.bancotipocuentabancoglobalSessionBean.getEsGuardarRelacionado());
					bancotipocuentabancoglobalBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						bancotipocuentabancoglobalBeanSwingJInternalFrame.actualizarEstadoPanelsBancoTipoCuentaBancoGlobal("no_relacionado");

						bancotipocuentabancoglobalBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(BancoTipoCuentaBancoGlobalConstantesFunciones.ITAMANIOFILATABLA + (BancoTipoCuentaBancoGlobalConstantesFunciones.ITAMANIOFILATABLA/2));

						bancotipocuentabancoglobalBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoCuentaBancoGlobal=(TitledBorder)this.jScrollPanelDatosTipoCuentaBancoGlobal.getBorder();
						TitledBorder titledBorderBancoTipoCuentaBancoGlobal=(TitledBorder)bancotipocuentabancoglobalBeanSwingJInternalFrame.jScrollPanelDatosBancoTipoCuentaBancoGlobal.getBorder();

						titledBorderBancoTipoCuentaBancoGlobal.setTitle(titledBorderTipoCuentaBancoGlobal.getTitle() + " -> Banco Tipo Cuenta Banco Global");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,bancotipocuentabancoglobalBeanSwingJInternalFrame);
						}

						bancotipocuentabancoglobalBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(bancotipocuentabancoglobalBeanSwingJInternalFrame);

						bancotipocuentabancoglobalBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Banco Tipo Cuenta Banco Global",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonDatoGeneralEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoCuentaBancoGlobal tipocuentabancoglobal) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabancoglobal = (TipoCuentaBancoGlobal)this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocuentabancoglobal = (TipoCuentaBancoGlobal)this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocuentabancoglobal!=null) {
						this.tipocuentabancoglobal = tipocuentabancoglobal;
					} else {
						this.tipocuentabancoglobal = new TipoCuentaBancoGlobal();
					}
				}

				if(this.isTienePermisosDatoGeneralEmpleado && this.permiteMantenimiento(this.tipocuentabancoglobal)) {
					DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFramePopup=new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						datogeneralempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFramePopup;
					} else {
						datogeneralempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame;
					}

					List<TipoCuentaBancoGlobal> tipocuentabancoglobals=new ArrayList<TipoCuentaBancoGlobal>();
					tipocuentabancoglobals.add(this.tipocuentabancoglobal);
					if(!esRelacionado) {
						//datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setConGuardarRelaciones(false);
						//datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					datogeneralempleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.cargarDatoGeneralEmpleadoBeanSwingJInternalFrame(tipocuentabancoglobals,this.tipocuentabancoglobal,datogeneralempleadoBeanSwingJInternalFrame,/*conInicializar,*/datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getConGuardarRelaciones(),datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
					datogeneralempleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralEmpleado("no_relacionado");

						datogeneralempleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DatoGeneralEmpleadoConstantesFunciones.ITAMANIOFILATABLA + (DatoGeneralEmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						datogeneralempleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoCuentaBancoGlobal=(TitledBorder)this.jScrollPanelDatosTipoCuentaBancoGlobal.getBorder();
						TitledBorder titledBorderDatoGeneralEmpleado=(TitledBorder)datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.getBorder();

						titledBorderDatoGeneralEmpleado.setTitle(titledBorderTipoCuentaBancoGlobal.getTitle() + " -> Dato General Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,datogeneralempleadoBeanSwingJInternalFrame);
						}

						datogeneralempleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(datogeneralempleadoBeanSwingJInternalFrame);

						datogeneralempleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Dato General Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonPoliticasClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoCuentaBancoGlobal tipocuentabancoglobal) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabancoglobal = (TipoCuentaBancoGlobal)this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocuentabancoglobal = (TipoCuentaBancoGlobal)this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocuentabancoglobal!=null) {
						this.tipocuentabancoglobal = tipocuentabancoglobal;
					} else {
						this.tipocuentabancoglobal = new TipoCuentaBancoGlobal();
					}
				}

				if(this.isTienePermisosPoliticasCliente && this.permiteMantenimiento(this.tipocuentabancoglobal)) {
					PoliticasClienteBeanSwingJInternalFrame politicasclienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFramePopup=new PoliticasClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						politicasclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFramePopup;
					} else {
						politicasclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame;
					}

					List<TipoCuentaBancoGlobal> tipocuentabancoglobals=new ArrayList<TipoCuentaBancoGlobal>();
					tipocuentabancoglobals.add(this.tipocuentabancoglobal);
					if(!esRelacionado) {
						//politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setConGuardarRelaciones(false);
						//politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					politicasclienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.cargarPoliticasClienteBeanSwingJInternalFrame(tipocuentabancoglobals,this.tipocuentabancoglobal,politicasclienteBeanSwingJInternalFrame,/*conInicializar,*/politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.getConGuardarRelaciones(),politicasclienteBeanSwingJInternalFrame.politicasclienteSessionBean.getEsGuardarRelacionado());
					politicasclienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						politicasclienteBeanSwingJInternalFrame.actualizarEstadoPanelsPoliticasCliente("no_relacionado");

						politicasclienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PoliticasClienteConstantesFunciones.ITAMANIOFILATABLA + (PoliticasClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						politicasclienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoCuentaBancoGlobal=(TitledBorder)this.jScrollPanelDatosTipoCuentaBancoGlobal.getBorder();
						TitledBorder titledBorderPoliticasCliente=(TitledBorder)politicasclienteBeanSwingJInternalFrame.jScrollPanelDatosPoliticasCliente.getBorder();

						titledBorderPoliticasCliente.setTitle(titledBorderTipoCuentaBancoGlobal.getTitle() + " -> Politicas Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,politicasclienteBeanSwingJInternalFrame);
						}

						politicasclienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(politicasclienteBeanSwingJInternalFrame);

						politicasclienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Politicas Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoCuentaBancoGlobal tipocuentabancoglobal) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabancoglobal = (TipoCuentaBancoGlobal)this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocuentabancoglobal = (TipoCuentaBancoGlobal)this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocuentabancoglobal!=null) {
						this.tipocuentabancoglobal = tipocuentabancoglobal;
					} else {
						this.tipocuentabancoglobal = new TipoCuentaBancoGlobal();
					}
				}

				if(this.isTienePermisosEmpleado && this.permiteMantenimiento(this.tipocuentabancoglobal)) {
					EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFramePopup=new EmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						empleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFramePopup;
					} else {
						empleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame;
					}

					List<TipoCuentaBancoGlobal> tipocuentabancoglobals=new ArrayList<TipoCuentaBancoGlobal>();
					tipocuentabancoglobals.add(this.tipocuentabancoglobal);
					if(!esRelacionado) {
						//empleadoBeanSwingJInternalFrame.empleadoSessionBean.setConGuardarRelaciones(false);
						//empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					empleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.cargarEmpleadoBeanSwingJInternalFrame(tipocuentabancoglobals,this.tipocuentabancoglobal,empleadoBeanSwingJInternalFrame,/*conInicializar,*/empleadoBeanSwingJInternalFrame.empleadoSessionBean.getConGuardarRelaciones(),empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado());
					empleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("no_relacionado");

						empleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EmpleadoConstantesFunciones.ITAMANIOFILATABLA + (EmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						empleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoCuentaBancoGlobal=(TitledBorder)this.jScrollPanelDatosTipoCuentaBancoGlobal.getBorder();
						TitledBorder titledBorderEmpleado=(TitledBorder)empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

						titledBorderEmpleado.setTitle(titledBorderTipoCuentaBancoGlobal.getTitle() + " -> Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,empleadoBeanSwingJInternalFrame);
						}

						empleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(empleadoBeanSwingJInternalFrame);

						empleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParametroTesoreriaDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoCuentaBancoGlobal tipocuentabancoglobal) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabancoglobal = (TipoCuentaBancoGlobal)this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocuentabancoglobal = (TipoCuentaBancoGlobal)this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocuentabancoglobal!=null) {
						this.tipocuentabancoglobal = tipocuentabancoglobal;
					} else {
						this.tipocuentabancoglobal = new TipoCuentaBancoGlobal();
					}
				}

				if(this.isTienePermisosParametroTesoreriaDefecto && this.permiteMantenimiento(this.tipocuentabancoglobal)) {
					ParametroTesoreriaDefectoBeanSwingJInternalFrame parametrotesoreriadefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFramePopup=new ParametroTesoreriaDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametrotesoreriadefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFramePopup;
					} else {
						parametrotesoreriadefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame;
					}

					List<TipoCuentaBancoGlobal> tipocuentabancoglobals=new ArrayList<TipoCuentaBancoGlobal>();
					tipocuentabancoglobals.add(this.tipocuentabancoglobal);
					if(!esRelacionado) {
						//parametrotesoreriadefectoBeanSwingJInternalFrame.parametrotesoreriadefectoSessionBean.setConGuardarRelaciones(false);
						//parametrotesoreriadefectoBeanSwingJInternalFrame.parametrotesoreriadefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametrotesoreriadefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.cargarParametroTesoreriaDefectoBeanSwingJInternalFrame(tipocuentabancoglobals,this.tipocuentabancoglobal,parametrotesoreriadefectoBeanSwingJInternalFrame,/*conInicializar,*/parametrotesoreriadefectoBeanSwingJInternalFrame.parametrotesoreriadefectoSessionBean.getConGuardarRelaciones(),parametrotesoreriadefectoBeanSwingJInternalFrame.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado());
					parametrotesoreriadefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametrotesoreriadefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroTesoreriaDefecto("no_relacionado");

						parametrotesoreriadefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroTesoreriaDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroTesoreriaDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametrotesoreriadefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoCuentaBancoGlobal=(TitledBorder)this.jScrollPanelDatosTipoCuentaBancoGlobal.getBorder();
						TitledBorder titledBorderParametroTesoreriaDefecto=(TitledBorder)parametrotesoreriadefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroTesoreriaDefecto.getBorder();

						titledBorderParametroTesoreriaDefecto.setTitle(titledBorderTipoCuentaBancoGlobal.getTitle() + " -> Parametro Tesoreria Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametrotesoreriadefectoBeanSwingJInternalFrame);
						}

						parametrotesoreriadefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametrotesoreriadefectoBeanSwingJInternalFrame);

						parametrotesoreriadefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Tesoreria Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoCuentaBancoGlobal(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaBancoGlobal && this.isPermisoNuevoTipoCuentaBancoGlobal));			
			this.jButtonDuplicarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaDuplicarTipoCuentaBancoGlobal && this.isPermisoDuplicarTipoCuentaBancoGlobal));			
			this.jButtonCopiarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaCopiarTipoCuentaBancoGlobal && this.isPermisoCopiarTipoCuentaBancoGlobal));
			this.jButtonVerFormTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaVerFormTipoCuentaBancoGlobal && this.isPermisoVerFormTipoCuentaBancoGlobal));
			
			this.jButtonAbrirOrderByTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaBancoGlobal && this.isPermisoOrdenTipoCuentaBancoGlobal));			
			
			this.jButtonNuevoRelacionesTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal && this.isPermisoNuevoTipoCuentaBancoGlobal));			
			this.jButtonNuevoGuardarCambiosTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaBancoGlobal && this.isPermisoNuevoTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosTipoCuentaBancoGlobal));
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonModificarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaModificarTipoCuentaBancoGlobal && this.isPermisoActualizarTipoCuentaBancoGlobal));	
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonActualizarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaActualizarTipoCuentaBancoGlobal && this.isPermisoActualizarTipoCuentaBancoGlobal));	
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonEliminarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaEliminarTipoCuentaBancoGlobal && this.isPermisoEliminarTipoCuentaBancoGlobal));
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonCancelarTipoCuentaBancoGlobal.setVisible(this.isVisibilidadCeldaCancelarTipoCuentaBancoGlobal);							
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonGuardarCambiosTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaGuardarTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosTipoCuentaBancoGlobal));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosTipoCuentaBancoGlobal));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaBancoGlobal && this.isPermisoNuevoTipoCuentaBancoGlobal));						
			this.jButtonDuplicarToolBarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaDuplicarTipoCuentaBancoGlobal && this.isPermisoDuplicarTipoCuentaBancoGlobal));						
			this.jButtonCopiarToolBarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaCopiarTipoCuentaBancoGlobal && this.isPermisoCopiarTipoCuentaBancoGlobal));			
			this.jButtonVerFormToolBarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaVerFormTipoCuentaBancoGlobal && this.isPermisoVerFormTipoCuentaBancoGlobal));			
			this.jButtonAbrirOrderByToolBarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaBancoGlobal && this.isPermisoOrdenTipoCuentaBancoGlobal));
			this.jButtonNuevoRelacionesToolBarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal && this.isPermisoNuevoTipoCuentaBancoGlobal));			
			this.jButtonNuevoGuardarCambiosToolBarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaBancoGlobal && this.isPermisoNuevoTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosTipoCuentaBancoGlobal));			
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonModificarToolBarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaModificarTipoCuentaBancoGlobal && this.isPermisoActualizarTipoCuentaBancoGlobal));	
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonActualizarToolBarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaActualizarTipoCuentaBancoGlobal  && this.isPermisoActualizarTipoCuentaBancoGlobal));	
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonEliminarToolBarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaEliminarTipoCuentaBancoGlobal && this.isPermisoEliminarTipoCuentaBancoGlobal));
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonCancelarToolBarTipoCuentaBancoGlobal.setVisible(this.isVisibilidadCeldaCancelarTipoCuentaBancoGlobal);				
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonGuardarCambiosToolBarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaGuardarTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosTipoCuentaBancoGlobal));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosTipoCuentaBancoGlobal));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaBancoGlobal && this.isPermisoNuevoTipoCuentaBancoGlobal));			
			this.jMenuItemDuplicarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaDuplicarTipoCuentaBancoGlobal && this.isPermisoDuplicarTipoCuentaBancoGlobal));			
			this.jMenuItemCopiarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaCopiarTipoCuentaBancoGlobal && this.isPermisoCopiarTipoCuentaBancoGlobal));			
			this.jMenuItemVerFormTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaVerFormTipoCuentaBancoGlobal && this.isPermisoVerFormTipoCuentaBancoGlobal));			
			this.jMenuItemAbrirOrderByTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaBancoGlobal && this.isPermisoOrdenTipoCuentaBancoGlobal));			
			//this.jMenuItemMostrarOcultarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaBancoGlobal && this.isPermisoOrdenTipoCuentaBancoGlobal));
			this.jMenuItemDetalleAbrirOrderByTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaBancoGlobal && this.isPermisoOrdenTipoCuentaBancoGlobal));			
			//this.jMenuItemDetalleMostrarOcultarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaOrdenTipoCuentaBancoGlobal && this.isPermisoOrdenTipoCuentaBancoGlobal));			
			this.jMenuItemNuevoRelacionesTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal && this.isPermisoNuevoTipoCuentaBancoGlobal));			
			this.jMenuItemNuevoGuardarCambiosTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaNuevoTipoCuentaBancoGlobal && this.isPermisoNuevoTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosTipoCuentaBancoGlobal));									
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jMenuItemModificarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaModificarTipoCuentaBancoGlobal && this.isPermisoActualizarTipoCuentaBancoGlobal));	
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jMenuItemActualizarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaActualizarTipoCuentaBancoGlobal && this.isPermisoActualizarTipoCuentaBancoGlobal));	
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jMenuItemEliminarTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaEliminarTipoCuentaBancoGlobal && this.isPermisoEliminarTipoCuentaBancoGlobal));
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jMenuItemCancelarTipoCuentaBancoGlobal.setVisible(this.isVisibilidadCeldaCancelarTipoCuentaBancoGlobal);				
			}
			
			this.jMenuItemGuardarCambiosTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaGuardarTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosTipoCuentaBancoGlobal));						
			this.jMenuItemGuardarCambiosTablaTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosTipoCuentaBancoGlobal));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGlobal=this.jButtonNuevoTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaDuplicarTipoCuentaBancoGlobal=this.jButtonDuplicarTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaCopiarTipoCuentaBancoGlobal=this.jButtonCopiarTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaVerFormTipoCuentaBancoGlobal=this.jButtonVerFormTipoCuentaBancoGlobal.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoCuentaBancoGlobal=this.jButtonAbrirOrderByTipoCuentaBancoGlobal.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal=this.jButtonNuevoRelacionesTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaModificarTipoCuentaBancoGlobal=this.jButtonModificarTipoCuentaBancoGlobal.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) {
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonActualizarTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonEliminarTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaCancelarTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonCancelarTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaGuardarTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonGuardarCambiosTipoCuentaBancoGlobal.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal=this.jButtonGuardarCambiosTablaTipoCuentaBancoGlobal.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGlobal=this.jButtonNuevoToolBarTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal=this.jButtonNuevoRelacionesToolBarTipoCuentaBancoGlobal.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) {
			this.isVisibilidadCeldaModificarTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonModificarToolBarTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonActualizarToolBarTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonEliminarToolBarTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaCancelarTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonCancelarToolBarTipoCuentaBancoGlobal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCuentaBancoGlobal=this.jButtonGuardarCambiosToolBarTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal=this.jButtonGuardarCambiosTablaToolBarTipoCuentaBancoGlobal.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGlobal=this.jMenuItemNuevoTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal=this.jMenuItemNuevoRelacionesTipoCuentaBancoGlobal.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) {
			this.isVisibilidadCeldaModificarTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jMenuItemModificarTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jMenuItemActualizarTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jMenuItemEliminarTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaCancelarTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jMenuItemCancelarTipoCuentaBancoGlobal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCuentaBancoGlobal=this.jMenuItemGuardarCambiosTipoCuentaBancoGlobal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal=this.jMenuItemGuardarCambiosTablaTipoCuentaBancoGlobal.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoCuentaBancoGlobal(Boolean esInicializar) {
		if(TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCuentaBancoGlobal();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoCuentaBancoGlobal(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoCuentaBancoGlobal() {
		this.jButtonNuevoTipoCuentaBancoGlobal.setVisible(this.isPermisoNuevoTipoCuentaBancoGlobal);			
		this.jButtonDuplicarTipoCuentaBancoGlobal.setVisible(this.isPermisoDuplicarTipoCuentaBancoGlobal);			
		this.jButtonCopiarTipoCuentaBancoGlobal.setVisible(this.isPermisoCopiarTipoCuentaBancoGlobal);			
		this.jButtonVerFormTipoCuentaBancoGlobal.setVisible(this.isPermisoVerFormTipoCuentaBancoGlobal);			
		
		this.jButtonAbrirOrderByTipoCuentaBancoGlobal.setVisible(this.isPermisoOrdenTipoCuentaBancoGlobal);					
		
		this.jButtonNuevoRelacionesTipoCuentaBancoGlobal.setVisible(this.isPermisoNuevoTipoCuentaBancoGlobal);			
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonModificarTipoCuentaBancoGlobal.setVisible(this.isPermisoActualizarTipoCuentaBancoGlobal);	
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonActualizarTipoCuentaBancoGlobal.setVisible(this.isPermisoActualizarTipoCuentaBancoGlobal);	
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonEliminarTipoCuentaBancoGlobal.setVisible(this.isPermisoEliminarTipoCuentaBancoGlobal);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonCancelarTipoCuentaBancoGlobal.setVisible(this.isVisibilidadCeldaCancelarTipoCuentaBancoGlobal);						
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonGuardarCambiosTipoCuentaBancoGlobal.setVisible(this.isPermisoGuardarCambiosTipoCuentaBancoGlobal);							
		}
		
		this.jButtonGuardarCambiosTablaTipoCuentaBancoGlobal.setVisible(this.isPermisoActualizarTipoCuentaBancoGlobal);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCuentaBancoGlobal() {
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonModificarTipoCuentaBancoGlobal.setVisible(this.isPermisoActualizarTipoCuentaBancoGlobal);	
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonActualizarTipoCuentaBancoGlobal.setVisible(this.isPermisoActualizarTipoCuentaBancoGlobal);	
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonEliminarTipoCuentaBancoGlobal.setVisible(this.isPermisoEliminarTipoCuentaBancoGlobal);
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonCancelarTipoCuentaBancoGlobal.setVisible(this.isVisibilidadCeldaCancelarTipoCuentaBancoGlobal);							
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonGuardarCambiosTipoCuentaBancoGlobal.setVisible((this.isVisibilidadCeldaGuardarTipoCuentaBancoGlobal && this.isPermisoGuardarCambiosTipoCuentaBancoGlobal));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoCuentaBancoGlobal() {
		if(TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoCuentaBancoGlobal();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoCuentaBancoGlobal() {
	}
	
	public void jTableDatosTipoCuentaBancoGlobalListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoCuentaBancoGlobal(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoCuentaBancoGlobalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCuentaBancoGlobal(this.gettipocuentabancoglobal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGlobal(this.tipocuentabancoglobal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocuentabancoglobal==null) {
						this.tipocuentabancoglobal = new TipoCuentaBancoGlobal();
					}

					this.setVariablesFormularioToObjetoActualTipoCuentaBancoGlobal(this.tipocuentabancoglobal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGlobal(this.tipocuentabancoglobal);
				}

				if(this.tipocuentabancoglobal.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocuentabancoglobal.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCuentaBancoGlobal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoCuentaBancoGlobalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCuentaBancoGlobal(this.gettipocuentabancoglobal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGlobal(this.tipocuentabancoglobal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocuentabancoglobal==null) {
						this.tipocuentabancoglobal = new TipoCuentaBancoGlobal();
					}

					this.setVariablesFormularioToObjetoActualTipoCuentaBancoGlobal(this.tipocuentabancoglobal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGlobal(this.tipocuentabancoglobal);
				}

				if(this.tipocuentabancoglobal.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipocuentabancoglobal.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCuentaBancoGlobal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoCuentaBancoGlobalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCuentaBancoGlobal(this.gettipocuentabancoglobal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGlobal(this.tipocuentabancoglobal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocuentabancoglobal==null) {
						this.tipocuentabancoglobal = new TipoCuentaBancoGlobal();
					}

					this.setVariablesFormularioToObjetoActualTipoCuentaBancoGlobal(this.tipocuentabancoglobal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGlobal(this.tipocuentabancoglobal);
				}

				if(this.tipocuentabancoglobal.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipocuentabancoglobal.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCuentaBancoGlobal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoCuentaBancoGlobal() {
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) {
		

		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.dispose();
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal!=null) {
			this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.dispose();
			this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal=null;
		}
		
		if(this.jInternalFrameImportacionTipoCuentaBancoGlobal!=null) {
			this.jInternalFrameImportacionTipoCuentaBancoGlobal.setVisible(false);	    			
			this.jInternalFrameImportacionTipoCuentaBancoGlobal.dispose();
			this.jInternalFrameImportacionTipoCuentaBancoGlobal=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoCuentaBancoGlobal();
			
			TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoCuentaBancoGlobal")) {
				jButtonNuevoTipoCuentaBancoGlobalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoCuentaBancoGlobal")) {
				jButtonDuplicarTipoCuentaBancoGlobalActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoCuentaBancoGlobal")) {
				jButtonCopiarTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoCuentaBancoGlobal")) {
				jButtonVerFormTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoCuentaBancoGlobal")) {
				jButtonNuevoTipoCuentaBancoGlobalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoCuentaBancoGlobal")) {
				jButtonDuplicarTipoCuentaBancoGlobalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoCuentaBancoGlobal")) {
				jButtonNuevoTipoCuentaBancoGlobalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoCuentaBancoGlobal")) {
				jButtonDuplicarTipoCuentaBancoGlobalActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoCuentaBancoGlobal")) {
				jButtonNuevoTipoCuentaBancoGlobalActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoCuentaBancoGlobal")) {
				jButtonNuevoTipoCuentaBancoGlobalActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoCuentaBancoGlobal")) {
				jButtonNuevoTipoCuentaBancoGlobalActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoCuentaBancoGlobal")) {
				jButtonModificarTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoCuentaBancoGlobal")) {
				jButtonModificarTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoCuentaBancoGlobal")) {
				jButtonModificarTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoCuentaBancoGlobal")) {
				jButtonActualizarTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoCuentaBancoGlobal")) {
				jButtonActualizarTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoCuentaBancoGlobal")) {
				jButtonActualizarTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoCuentaBancoGlobal")) {
				jButtonEliminarTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoCuentaBancoGlobal")) {
				jButtonEliminarTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoCuentaBancoGlobal")) {
				jButtonEliminarTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoCuentaBancoGlobal")) {
				jButtonCancelarTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoCuentaBancoGlobal")) {
				jButtonCancelarTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoCuentaBancoGlobal")) {
				jButtonCancelarTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoCuentaBancoGlobal")) {
				jButtonCerrarTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoCuentaBancoGlobal")) {
				jButtonCerrarTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoCuentaBancoGlobal")) {
				jButtonCerrarTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoCuentaBancoGlobal")) {
				jButtonMostrarOcultarTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoCuentaBancoGlobal")) {
				jButtonCancelarTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoCuentaBancoGlobal")) {
				jButtonGuardarCambiosTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoCuentaBancoGlobal")) {
				jButtonGuardarCambiosTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoCuentaBancoGlobal")) {
				jButtonCopiarTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoCuentaBancoGlobal")) {
				jButtonVerFormTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoCuentaBancoGlobal")) {
				jButtonGuardarCambiosTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoCuentaBancoGlobal")) {
				jButtonCopiarTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoCuentaBancoGlobal")) {
				jButtonVerFormTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoCuentaBancoGlobal")) {
				jButtonGuardarCambiosTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoCuentaBancoGlobal")) {
				jButtonGuardarCambiosTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoCuentaBancoGlobal")) {
				jButtonGuardarCambiosTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoCuentaBancoGlobal")) {
				jButtonRecargarInformacionTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoCuentaBancoGlobal")) {
				jButtonRecargarInformacionTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoCuentaBancoGlobal")) {
				jButtonRecargarInformacionTipoCuentaBancoGlobalActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoCuentaBancoGlobal")) {
				jButtonAnterioresTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoCuentaBancoGlobal")) {
				jButtonAnterioresTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoCuentaBancoGlobal")) {
				jButtonAnterioresTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoCuentaBancoGlobal")) {
				jButtonSiguientesTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoCuentaBancoGlobal")) {
				jButtonSiguientesTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoCuentaBancoGlobal")) {
				jButtonSiguientesTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoCuentaBancoGlobal") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoCuentaBancoGlobal")) {
				jButtonAbrirOrderByTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoCuentaBancoGlobal") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoCuentaBancoGlobal")) {
				jButtonMostrarOcultarTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCuentaBancoGlobal")) {
				jButtonNuevoGuardarCambiosTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoCuentaBancoGlobal")) {
				jButtonNuevoGuardarCambiosTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoCuentaBancoGlobal")) {
				jButtonNuevoGuardarCambiosTipoCuentaBancoGlobalActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoCuentaBancoGlobal")) {
				jButtonCerrarReporteDinamicoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoCuentaBancoGlobal")) {
				jButtonGenerarReporteDinamicoTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoCuentaBancoGlobal")) {
				
				jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoCuentaBancoGlobal")) {
				jButtonCerrarImportacionTipoCuentaBancoGlobalActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoCuentaBancoGlobal")) {
				
				jButtonGenerarImportacionTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoCuentaBancoGlobal")) {
				
				jButtonAbrirImportacionTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoCuentaBancoGlobal")) {
				jComboBoxTiposAccionesTipoCuentaBancoGlobalActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoCuentaBancoGlobal")) {
				jComboBoxTiposRelacionesTipoCuentaBancoGlobalActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoCuentaBancoGlobal")) {
				jComboBoxTiposAccionesTipoCuentaBancoGlobalActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoCuentaBancoGlobal")) {
				
				jComboBoxTiposSeleccionarTipoCuentaBancoGlobalActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoCuentaBancoGlobal")) {
				jTextFieldValorCampoGeneralTipoCuentaBancoGlobalActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoCuentaBancoGlobal")) {
				jButtonAbrirOrderByTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoCuentaBancoGlobal")) {
				jButtonAbrirOrderByTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoCuentaBancoGlobal")) {
				jButtonCerrarOrderByTipoCuentaBancoGlobalActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCuentaBancoGlobalBusqueda")) {
				this.jButtonidTipoCuentaBancoGlobalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCuentaBancoGlobalBusqueda")) {
				this.jButtoncodigoTipoCuentaBancoGlobalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCuentaBancoGlobalBusqueda")) {
				this.jButtonnombreTipoCuentaBancoGlobalBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoCuentaBancoGlobal();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaBancoGlobalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancoglobal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancoglobal);
				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
				
				


				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBancoGlobal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBancoGlobal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoCuentaBancoGlobal tipocuentabancoglobalLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocuentabancoglobalLocal=this.tipocuentabancoglobal;
			} else {
				tipocuentabancoglobalLocal=this.tipocuentabancoglobalAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancoglobal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancoglobal);
				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
							
				
				


				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBancoGlobal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBancoGlobal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoGlobalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalAnterior =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabancoglobalAnterior =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
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
			
			TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
			
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
			
			


			
			TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaBancoGlobalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancoglobal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancoglobal);
				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
								
						
				


				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBancoGlobal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBancoGlobal.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancoglobal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancoglobal);
				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
								
				
				


				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBancoGlobal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBancoGlobal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoGlobalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalAnterior =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabancoglobalAnterior =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancoglobal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancoglobal);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoGlobalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalAnterior =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabancoglobalAnterior =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoGlobalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancoglobal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancoglobal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancoglobal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancoglobal);
				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
							
				
				


				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBancoGlobal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBancoGlobal.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaBancoGlobalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabancoglobalAnterior =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocuentabancoglobalAnterior =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
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
			
			TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
			
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
			
			


			
			TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoGlobalActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancoglobal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancoglobal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancoglobal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancoglobal);
				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
								
				
				


				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBancoGlobal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBancoGlobal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoGlobalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalAnterior =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabancoglobalAnterior =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoGlobalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancoglobal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancoglobal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaBancoGlobalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancoglobal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancoglobal);
				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoCuentaBancoGlobal")) {
					jCheckBoxSeleccionarTodosTipoCuentaBancoGlobalItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoCuentaBancoGlobal")) {
					jCheckBoxSeleccionadosTipoCuentaBancoGlobalItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoCuentaBancoGlobal")) {
					
				}
				
				


				
				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBancoGlobal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBancoGlobal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancoglobal);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancoglobal);
				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
												
				
				


				
				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBancoGlobal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBancoGlobal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaBancoGlobalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocuentabancoglobalAnterior =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocuentabancoglobalAnterior =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaBancoGlobalActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancoglobal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancoglobal);
				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
				
				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
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
			
			TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
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
			
			


			
			TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCuentaBancoGlobalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancoglobal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancoglobal);
				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBancoGlobal.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBancoGlobal.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocuentabancoglobal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocuentabancoglobal);
				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
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
				
				


				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCuentaBancoGlobal.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCuentaBancoGlobal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCuentaBancoGlobalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocuentabancoglobalAnterior =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocuentabancoglobalAnterior =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoCuentaBancoGlobal")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoCuentaBancoGlobalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoCuentaBancoGlobal.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocuentabancoglobal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocuentabancoglobal);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoCuentaBancoGlobal")) {
				
				}
				
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoCuentaBancoGlobal")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoCuentaBancoGlobal.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoCuentaBancoGlobal")) {
			
			}
			
			TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoCuentaBancoGlobal();
			
			TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
			
			if(sTipo.equals("NuevoTipoCuentaBancoGlobal")) {
				jButtonNuevoTipoCuentaBancoGlobalActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoCuentaBancoGlobal")) {
				jButtonDuplicarTipoCuentaBancoGlobalActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoCuentaBancoGlobal")) {
				jButtonCopiarTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoCuentaBancoGlobal")) {
				jButtonVerFormTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoCuentaBancoGlobal")) {
				jButtonNuevoTipoCuentaBancoGlobalActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoCuentaBancoGlobal")) {
				jButtonModificarTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoCuentaBancoGlobal")) {
				jButtonActualizarTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoCuentaBancoGlobal")) {
				jButtonEliminarTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoCuentaBancoGlobal")) {
				jButtonGuardarCambiosTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoCuentaBancoGlobal")) {
				jButtonCancelarTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoCuentaBancoGlobal")) {
				jButtonCerrarTipoCuentaBancoGlobalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoCuentaBancoGlobal")) {
				jButtonGuardarCambiosTipoCuentaBancoGlobalActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCuentaBancoGlobal")) {
				jButtonNuevoGuardarCambiosTipoCuentaBancoGlobalActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoCuentaBancoGlobal")) {
				jButtonAbrirOrderByTipoCuentaBancoGlobalActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoCuentaBancoGlobal")) {
				jButtonRecargarInformacionTipoCuentaBancoGlobalActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoCuentaBancoGlobal")) {
				jButtonAnterioresTipoCuentaBancoGlobalActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoCuentaBancoGlobal")) {
				jButtonSiguientesTipoCuentaBancoGlobalActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCuentaBancoGlobalBusqueda")) {
				this.jButtonidTipoCuentaBancoGlobalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCuentaBancoGlobalBusqueda")) {
				this.jButtoncodigoTipoCuentaBancoGlobalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCuentaBancoGlobalBusqueda")) {
				this.jButtonnombreTipoCuentaBancoGlobalBusquedaActionPerformed(evt);
			}
			
			TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoCuentaBancoGlobal();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoCuentaBancoGlobal")) {
				closingInternalFrameTipoCuentaBancoGlobal();
				
			} else if(sTipo.equals("jButtonCancelarTipoCuentaBancoGlobal")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoCuentaBancoGlobal = (JInternalFrameBase)evt.getSource();
	            	
	            TipoCuentaBancoGlobalBeanSwingJInternalFrame jInternalFrameParent=(TipoCuentaBancoGlobalBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCuentaBancoGlobal.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoCuentaBancoGlobalActionPerformed(null);
			}
			
			TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocuentabancoglobal,new Object(),this.tipocuentabancoglobalParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoCuentaBancoGlobal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoCuentaBancoGlobal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoCuentaBancoGlobal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocuentabancoglobal)) {
			if(!esControlTabla) {
				if(TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoCuentaBancoGlobal(this.tipocuentabancoglobal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGlobal(this.tipocuentabancoglobal);			
				}
				
				if(this.tipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoCuentaBancoGlobal(this.tipocuentabancoglobal,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocuentabancoglobalReturnGeneral=tipocuentabancoglobalLogic.procesarEventosTipoCuentaBancoGlobalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals(),this.tipocuentabancoglobal,this.tipocuentabancoglobalParameterGeneral,this.isEsNuevoTipoCuentaBancoGlobal,classes);//this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoCuentaBancoGlobal(this.tipocuentabancoglobalReturnGeneral,this.tipocuentabancoglobalBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoCuentaBancoGlobal(classes,this.tipocuentabancoglobalReturnGeneral,this.tipocuentabancoglobalBean,false);
					}
						
					if(this.tipocuentabancoglobalReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoCuentaBancoGlobal(this.tipocuentabancoglobalReturnGeneral.getTipoCuentaBancoGlobal());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoCuentaBancoGlobal(this.tipocuentabancoglobalReturnGeneral.getTipoCuentaBancoGlobal());	
					}
						
					if(this.tipocuentabancoglobalReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoCuentaBancoGlobal(this.tipocuentabancoglobalReturnGeneral.getTipoCuentaBancoGlobal(),classes);//this.tipocuentabancoglobalBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoCuentaBancoGlobal(this.tipocuentabancoglobal,classes);//this.tipocuentabancoglobalBean);									
				}
			
				if(TipoCuentaBancoGlobalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoCuentaBancoGlobal(this.tipocuentabancoglobal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCuentaBancoGlobal(this.tipocuentabancoglobal);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocuentabancoglobalAnterior!=null) {
						this.tipocuentabancoglobal=this.tipocuentabancoglobalAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocuentabancoglobalReturnGeneral=tipocuentabancoglobalLogic.procesarEventosTipoCuentaBancoGlobalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals(),this.tipocuentabancoglobal,this.tipocuentabancoglobalParameterGeneral,this.isEsNuevoTipoCuentaBancoGlobal,classes);//this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocuentabancoglobalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocuentabancoglobalReturnGeneral.getTipoCuentaBancoGlobal(),tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocuentabancoglobalReturnGeneral.getTipoCuentaBancoGlobal(),this.tipocuentabancoglobals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoCuentaBancoGlobal.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoCuentaBancoGlobal.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoCuentaBancoGlobal();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoCuentaBancoGlobal() throws Exception {
		
		TipoCuentaBancoGlobalModel tipocuentabancoglobalModel=(TipoCuentaBancoGlobalModel)this.jTableDatosTipoCuentaBancoGlobal.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocuentabancoglobalModel.tipocuentabancoglobals=this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocuentabancoglobalModel.tipocuentabancoglobals=this.tipocuentabancoglobals;
		}
		
		
		((TipoCuentaBancoGlobalModel) this.jTableDatosTipoCuentaBancoGlobal.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoCuentaBancoGlobal() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocuentabancoglobalAnterior(),this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocuentabancoglobalAnterior(),this.tipocuentabancoglobals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoCuentaBancoGlobal();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoCuentaBancoGlobal(TipoCuentaBancoGlobal tipocuentabancoglobal,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(BancoTipoCuentaBancoGlobal.class)) {
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.bancotipocuentabancoglobalLogic.setBancoTipoCuentaBancoGlobals(tipocuentabancoglobal.getBancoTipoCuentaBancoGlobals());
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.inicializarActualizarBindingTablaBancoTipoCuentaBancoGlobal(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(tipocuentabancoglobal.getDatoGeneralEmpleados());
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PoliticasCliente.class)) {
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.setPoliticasClientes(tipocuentabancoglobal.getPoliticasClientes());
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaPoliticasCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(tipocuentabancoglobal.getEmpleados());
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroTesoreriaDefecto.class)) {
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.parametrotesoreriadefectoLogic.setParametroTesoreriaDefectos(tipocuentabancoglobal.getParametroTesoreriaDefectos());
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroTesoreriaDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
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
										
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocuentabancoglobal,new Object(),generalEntityParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoCuentaBancoGlobalConstantesFunciones.getClassesRelationshipsOfTipoCuentaBancoGlobal(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoCuentaBancoGlobalConstantesFunciones.getClassesRelationshipsFromStringsOfTipoCuentaBancoGlobal(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoCuentaBancoGlobal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoCuentaBancoGlobalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocuentabancoglobal,new Object(),generalEntityParameterGeneral,this.tipocuentabancoglobalReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoCuentaBancoGlobal(TipoCuentaBancoGlobalBean tipocuentabancoglobalBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(BancoTipoCuentaBancoGlobal.class)) {
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.bancotipocuentabancoglobalLogic.setBancoTipoCuentaBancoGlobals(tipocuentabancoglobal.getBancoTipoCuentaBancoGlobals());
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.inicializarActualizarBindingTablaBancoTipoCuentaBancoGlobal(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(tipocuentabancoglobal.getDatoGeneralEmpleados());
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PoliticasCliente.class)) {
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.setPoliticasClientes(tipocuentabancoglobal.getPoliticasClientes());
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaPoliticasCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(tipocuentabancoglobal.getEmpleados());
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroTesoreriaDefecto.class)) {
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.parametrotesoreriadefectoLogic.setParametroTesoreriaDefectos(tipocuentabancoglobal.getParametroTesoreriaDefectos());
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroTesoreriaDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoCuentaBancoGlobal(ArrayList<Classe> classes,TipoCuentaBancoGlobalReturnGeneral tipocuentabancoglobalReturnGeneral,TipoCuentaBancoGlobalBean tipocuentabancoglobalBean,Boolean conDefault) throws Exception {
		
			this.tipocuentabancoglobalBean.setBancoTipoCuentaBancoGlobals(tipocuentabancoglobalReturnGeneral.getTipoCuentaBancoGlobal().getBancoTipoCuentaBancoGlobals());
			this.tipocuentabancoglobalBean.setDatoGeneralEmpleados(tipocuentabancoglobalReturnGeneral.getTipoCuentaBancoGlobal().getDatoGeneralEmpleados());
			this.tipocuentabancoglobalBean.setPoliticasClientes(tipocuentabancoglobalReturnGeneral.getTipoCuentaBancoGlobal().getPoliticasClientes());
			this.tipocuentabancoglobalBean.setEmpleados(tipocuentabancoglobalReturnGeneral.getTipoCuentaBancoGlobal().getEmpleados());
			this.tipocuentabancoglobalBean.setParametroTesoreriaDefectos(tipocuentabancoglobalReturnGeneral.getTipoCuentaBancoGlobal().getParametroTesoreriaDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoCuentaBancoGlobal(TipoCuentaBancoGlobal tipocuentabancoglobal,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(BancoTipoCuentaBancoGlobal.class)) {
					tipocuentabancoglobal.setBancoTipoCuentaBancoGlobals(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalBeanSwingJInternalFrame.bancotipocuentabancoglobalLogic.getBancoTipoCuentaBancoGlobals());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					tipocuentabancoglobal.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(PoliticasCliente.class)) {
					tipocuentabancoglobal.setPoliticasClientes(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteBeanSwingJInternalFrame.politicasclienteLogic.getPoliticasClientes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					tipocuentabancoglobal.setEmpleados(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroTesoreriaDefecto.class)) {
					tipocuentabancoglobal.setParametroTesoreriaDefectos(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoBeanSwingJInternalFrame.parametrotesoreriadefectoLogic.getParametroTesoreriaDefectos());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipocuentabancoglobal)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal = new TipoCuentaBancoGlobalDetalleFormJInternalFrame(jDesktopPane,this.tipocuentabancoglobalSessionBean.getConGuardarRelaciones(),this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal);
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.setVisible(false);
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.tipocuentabancoglobalLogic=this.tipocuentabancoglobalLogic;
		
		this.cargarCombosFrameForeignKeyTipoCuentaBancoGlobal("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCuentaBancoGlobal();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCuentaBancoGlobal();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoCuentaBancoGlobal("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoCuentaBancoGlobal();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCuentaBancoGlobal"));
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonModificarTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"ModificarTipoCuentaBancoGlobal"));

		
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonModificarToolBarTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCuentaBancoGlobal"));
					
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jMenuItemModificarTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCuentaBancoGlobal"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonActualizarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"ActualizarTipoCuentaBancoGlobal"));
		
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonActualizarToolBarTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCuentaBancoGlobal"));
						
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jMenuItemActualizarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCuentaBancoGlobal"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonEliminarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"EliminarTipoCuentaBancoGlobal"));
		
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonEliminarToolBarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCuentaBancoGlobal"));
								
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jMenuItemEliminarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCuentaBancoGlobal"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonCancelarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"CancelarTipoCuentaBancoGlobal"));
		
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonCancelarToolBarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCuentaBancoGlobal"));
					
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jMenuItemCancelarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCuentaBancoGlobal"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jMenuItemDetalleCerrarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCuentaBancoGlobal"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonGuardarCambiosToolBarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCuentaBancoGlobal"));
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonGuardarCambiosToolBarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCuentaBancoGlobal"));
		
		
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCuentaBancoGlobal"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonidTipoCuentaBancoGlobalBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCuentaBancoGlobalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtoncodigoTipoCuentaBancoGlobalBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCuentaBancoGlobalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonnombreTipoCuentaBancoGlobalBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCuentaBancoGlobalBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTabbedPaneRelacionesTipoCuentaBancoGlobal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCuentaBancoGlobal"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoCuentaBancoGlobal"));
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCuentaBancoGlobal"));
		}
		
		this.jTableDatosTipoCuentaBancoGlobal.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoCuentaBancoGlobal"));
		
		this.jTableDatosTipoCuentaBancoGlobal.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoCuentaBancoGlobal"));
		
		this.jButtonNuevoTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"NuevoTipoCuentaBancoGlobal"));
		
		this.jButtonDuplicarTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"DuplicarTipoCuentaBancoGlobal"));
		
		this.jButtonCopiarTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"CopiarTipoCuentaBancoGlobal"));
		
		this.jButtonVerFormTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"VerFormTipoCuentaBancoGlobal"));
		
		
		this.jButtonNuevoToolBarTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoCuentaBancoGlobal"));
			
		this.jButtonDuplicarToolBarTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoCuentaBancoGlobal"));
			
		this.jMenuItemNuevoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoCuentaBancoGlobal"));
			
		this.jMenuItemDuplicarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoCuentaBancoGlobal"));		
		
		
		this.jButtonNuevoRelacionesTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoCuentaBancoGlobal"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoCuentaBancoGlobal"));
			
		this.jMenuItemNuevoRelacionesTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoCuentaBancoGlobal"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonModificarTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"ModificarTipoCuentaBancoGlobal"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonModificarToolBarTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCuentaBancoGlobal"));
			
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jMenuItemModificarTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCuentaBancoGlobal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonActualizarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"ActualizarTipoCuentaBancoGlobal"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonActualizarToolBarTipoCuentaBancoGlobal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCuentaBancoGlobal"));
				
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jMenuItemActualizarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCuentaBancoGlobal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonEliminarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"EliminarTipoCuentaBancoGlobal"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonEliminarToolBarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCuentaBancoGlobal"));
						
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jMenuItemEliminarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCuentaBancoGlobal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonCancelarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"CancelarTipoCuentaBancoGlobal"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonCancelarToolBarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCuentaBancoGlobal"));
			
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jMenuItemCancelarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCuentaBancoGlobal"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoCuentaBancoGlobal"));		
		
		
		this.jButtonCerrarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"CerrarTipoCuentaBancoGlobal"));
		
		
		this.jButtonCerrarToolBarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoCuentaBancoGlobal"));
			
		this.jMenuItemCerrarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoCuentaBancoGlobal"));
			
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jMenuItemDetalleCerrarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCuentaBancoGlobal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonGuardarCambiosTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoCuentaBancoGlobal"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonGuardarCambiosToolBarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCuentaBancoGlobal"));
		}
		
		this.jButtonCopiarToolBarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoCuentaBancoGlobal"));
			
		this.jButtonVerFormToolBarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoCuentaBancoGlobal"));
		
		this.jMenuItemGuardarCambiosTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoCuentaBancoGlobal"));
			
		this.jMenuItemCopiarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoCuentaBancoGlobal"));		
		
		this.jMenuItemVerFormTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoCuentaBancoGlobal"));		
		
		
		this.jButtonGuardarCambiosTablaTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCuentaBancoGlobal"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoCuentaBancoGlobal"));
			
		this.jMenuItemGuardarCambiosTablaTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCuentaBancoGlobal"));		
		
		
		
		this.jButtonRecargarInformacionTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoCuentaBancoGlobal"));
					
		this.jButtonRecargarInformacionToolBarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoCuentaBancoGlobal"));
		
		this.jMenuItemRecargarInformacionTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoCuentaBancoGlobal"));		
		
		
		
		this.jButtonAnterioresTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"AnterioresTipoCuentaBancoGlobal"));
		
		
		this.jButtonAnterioresToolBarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoCuentaBancoGlobal"));
		
		this.jMenuItemAnterioresTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoCuentaBancoGlobal"));		
		
		
		this.jButtonSiguientesTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"SiguientesTipoCuentaBancoGlobal"));
		
		
		this.jButtonSiguientesToolBarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoCuentaBancoGlobal"));
			
		this.jMenuItemSiguientesTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoCuentaBancoGlobal"));
			
		this.jMenuItemAbrirOrderByTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoCuentaBancoGlobal"));
			
		this.jMenuItemMostrarOcultarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoCuentaBancoGlobal"));
			
		this.jMenuItemDetalleAbrirOrderByTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoCuentaBancoGlobal"));
			
		this.jMenuItemDetalleMostarOcultarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoCuentaBancoGlobal"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoCuentaBancoGlobal"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoCuentaBancoGlobal"));
			
		this.jMenuItemNuevoGuardarCambiosTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoCuentaBancoGlobal"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoCuentaBancoGlobal.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoCuentaBancoGlobal"));

		this.jCheckBoxSeleccionadosTipoCuentaBancoGlobal.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoCuentaBancoGlobal"));
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCuentaBancoGlobal"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoCuentaBancoGlobal"));
			
		this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoCuentaBancoGlobal"));
					
		this.jComboBoxTiposSeleccionarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoCuentaBancoGlobal"));
			
		this.jTextFieldValorCampoGeneralTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoCuentaBancoGlobal"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonidTipoCuentaBancoGlobalBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCuentaBancoGlobalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtoncodigoTipoCuentaBancoGlobalBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCuentaBancoGlobalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonnombreTipoCuentaBancoGlobalBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCuentaBancoGlobalBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal!=null) {
				this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCuentaBancoGlobal"));
				this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCuentaBancoGlobal"));
				this.jInternalFrameReporteDinamicoTipoCuentaBancoGlobal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCuentaBancoGlobal"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCuentaBancoGlobal"));				
			//this.jButtonGenerarReporteDinamicoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCuentaBancoGlobal"));
			//this.jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCuentaBancoGlobal"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoCuentaBancoGlobal!=null) {
				this.jInternalFrameImportacionTipoCuentaBancoGlobal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCuentaBancoGlobal"));
				this.jInternalFrameImportacionTipoCuentaBancoGlobal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCuentaBancoGlobal"));
				this.jInternalFrameImportacionTipoCuentaBancoGlobal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCuentaBancoGlobal"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoCuentaBancoGlobal"));
			
			this.jButtonAbrirOrderByToolBarTipoCuentaBancoGlobal.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoCuentaBancoGlobal"));			
			
			if(this.jInternalFrameOrderByTipoCuentaBancoGlobal!=null) {
				this.jInternalFrameOrderByTipoCuentaBancoGlobal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCuentaBancoGlobal"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTabbedPaneRelacionesTipoCuentaBancoGlobal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCuentaBancoGlobal"));
		
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
            		closingInternalFrameTipoCuentaBancoGlobal();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoCuentaBancoGlobal = (JInternalFrameBase)event.getSource();
	            	
	            TipoCuentaBancoGlobalBeanSwingJInternalFrame jInternalFrameParent=(TipoCuentaBancoGlobalBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCuentaBancoGlobal.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoCuentaBancoGlobalActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoCuentaBancoGlobal.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoCuentaBancoGlobalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoCuentaBancoGlobal.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoCuentaBancoGlobal.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaBancoGlobalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaBancoGlobalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaBancoGlobalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoCuentaBancoGlobal";
		inputMap = this.jButtonNuevoTipoCuentaBancoGlobal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCuentaBancoGlobalActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaBancoGlobalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaBancoGlobalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCuentaBancoGlobalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoCuentaBancoGlobal";
		inputMap = this.jButtonNuevoRelacionesTipoCuentaBancoGlobal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCuentaBancoGlobalActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoCuentaBancoGlobal";
		inputMap = this.jButtonModificarTipoCuentaBancoGlobal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoCuentaBancoGlobalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoCuentaBancoGlobal";
		inputMap = this.jButtonActualizarTipoCuentaBancoGlobal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoCuentaBancoGlobalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoCuentaBancoGlobal";
		inputMap = this.jButtonEliminarTipoCuentaBancoGlobal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoCuentaBancoGlobalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoCuentaBancoGlobal";
		inputMap = this.jButtonCancelarTipoCuentaBancoGlobal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoCuentaBancoGlobalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoCuentaBancoGlobal";
		inputMap = this.jButtonCerrarTipoCuentaBancoGlobal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoCuentaBancoGlobalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonGuardarCambiosTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoCuentaBancoGlobal";
		inputMap = this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonGuardarCambiosTipoCuentaBancoGlobal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonGuardarCambiosTipoCuentaBancoGlobal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoCuentaBancoGlobalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoCuentaBancoGlobal.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoCuentaBancoGlobalItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoCuentaBancoGlobalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoCuentaBancoGlobal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoCuentaBancoGlobalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoCuentaBancoGlobal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoCuentaBancoGlobalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonidTipoCuentaBancoGlobalBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCuentaBancoGlobalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtoncodigoTipoCuentaBancoGlobalBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCuentaBancoGlobalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jButtonnombreTipoCuentaBancoGlobalBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCuentaBancoGlobalBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoCuentaBancoGlobal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoCuentaBancoGlobalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoCuentaBancoGlobalActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoCuentaBancoGlobal.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoCuentaBancoGlobal(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals()) {
					tipocuentabancoglobalAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:tipocuentabancoglobals) {
					tipocuentabancoglobalAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoCuentaBancoGlobalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCuentaBancoGlobal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals()) {
						tipocuentabancoglobalAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:tipocuentabancoglobals) {
						tipocuentabancoglobalAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:tipocuentabancoglobals) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCuentaBancoGlobal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCuentaBancoGlobal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCuentaBancoGlobal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBancoGlobal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoCuentaBancoGlobalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCuentaBancoGlobal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoCuentaBancoGlobal.getSelectedRows();
			
			TipoCuentaBancoGlobal tipocuentabancoglobalLocal=new TipoCuentaBancoGlobal();
			
			//this.seleccionarTodosTipoCuentaBancoGlobal(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocuentabancoglobalLocal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals().toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocuentabancoglobalLocal =(TipoCuentaBancoGlobal) this.tipocuentabancoglobals.toArray()[this.jTableDatosTipoCuentaBancoGlobal.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocuentabancoglobalLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals()) {
						tipocuentabancoglobalAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:tipocuentabancoglobals) {
						tipocuentabancoglobalAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoCuentaBancoGlobal(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCuentaBancoGlobal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCuentaBancoGlobal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCuentaBancoGlobal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoCuentaBancoGlobalItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoCuentaBancoGlobalParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoCuentaBancoGlobalActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoCuentaBancoGlobal(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoCuentaBancoGlobal.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals()) {
				
						if(sTipoSeleccionar.equals(TipoCuentaBancoGlobalConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocuentabancoglobalAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCuentaBancoGlobalConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocuentabancoglobalAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:tipocuentabancoglobals) {
					
						if(sTipoSeleccionar.equals(TipoCuentaBancoGlobalConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocuentabancoglobalAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCuentaBancoGlobalConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocuentabancoglobalAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCuentaBancoGlobal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoCuentaBancoGlobalActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoCuentaBancoGlobal(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoCuentaBancoGlobal=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoCuentaBancoGlobal) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoCuentaBancoGlobal(conSplash);
				
					this.generarReporteTipoCuentaBancoGlobalsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoCuentaBancoGlobalsSeleccionados();
				//this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCuentaBancoGlobalsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCuentaBancoGlobalsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCuentaBancoGlobal();
				
				this.exportarTipoCuentaBancoGlobalsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoCuentaBancoGlobals();
				//this.importarTipoCuentaBancoGlobals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCuentaBancoGlobal();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoCuentaBancoGlobalsSeleccionados();
				//this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Cuenta Banco Global", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoCuentaBancoGlobal();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoCuentaBancoGlobal)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoCuentaBancoGlobal(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Cuenta Banco Global",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCuentaBancoGlobal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jComboBoxTiposAccionesFormularioTipoCuentaBancoGlobal.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoCuentaBancoGlobal();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoCuentaBancoGlobal(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoCuentaBancoGlobalActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoCuentaBancoGlobal();
			
			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoCuentaBancoGlobal> tipocuentabancoglobalsSeleccionados=new ArrayList<TipoCuentaBancoGlobal>();		
			TipoCuentaBancoGlobal tipocuentabancoglobal=new TipoCuentaBancoGlobal();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoCuentaBancoGlobal(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoCuentaBancoGlobal.getSelectedItem();
			
			
			
			
			tipocuentabancoglobalsSeleccionados=this.getTipoCuentaBancoGlobalsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocuentabancoglobalsSeleccionados.size()==1) {
				for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:tipocuentabancoglobalsSeleccionados) {
					tipocuentabancoglobal=tipocuentabancoglobalAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Banco Tipo Cuenta Banco Global")) {
					jButtonBancoTipoCuentaBancoGlobalActionPerformed(null,rowIndex,true,false,tipocuentabancoglobal);
				}
				else if(this.sTipoRelacion.equals("Dato General Empleado")) {
					jButtonDatoGeneralEmpleadoActionPerformed(null,rowIndex,true,false,tipocuentabancoglobal);
				}
				else if(this.sTipoRelacion.equals("Politicas Cliente")) {
					jButtonPoliticasClienteActionPerformed(null,rowIndex,true,false,tipocuentabancoglobal);
				}
				else if(this.sTipoRelacion.equals("Empleado")) {
					jButtonEmpleadoActionPerformed(null,rowIndex,true,false,tipocuentabancoglobal);
				}
				else if(this.sTipoRelacion.equals("Parametro Tesoreria Defecto")) {
					jButtonParametroTesoreriaDefectoActionPerformed(null,rowIndex,true,false,tipocuentabancoglobal);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoCuentaBancoGlobal();
			
      		//this.finishProcessTipoCuentaBancoGlobal(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoCuentaBancoGlobalReturnGeneral() throws Exception {
		if(this.tipocuentabancoglobalReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocuentabancoglobalReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocuentabancoglobalReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocuentabancoglobalReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocuentabancoglobalReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocuentabancoglobalReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoCuentaBancoGlobal(false);
		}
		
		if(this.tipocuentabancoglobalReturnGeneral.getConRetornoLista() || this.tipocuentabancoglobalReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocuentabancoglobalReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocuentabancoglobalLogic.setTipoCuentaBancoGlobals(this.tipocuentabancoglobalReturnGeneral.getTipoCuentaBancoGlobals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocuentabancoglobalReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocuentabancoglobalLogic.setTipoCuentaBancoGlobal(this.tipocuentabancoglobalReturnGeneral.getTipoCuentaBancoGlobal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoCuentaBancoGlobal(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoCuentaBancoGlobal() throws Exception {
		
		
	}
	
	public ArrayList<TipoCuentaBancoGlobal> getTipoCuentaBancoGlobalsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoCuentaBancoGlobal> tipocuentabancoglobalsSeleccionados=new ArrayList<TipoCuentaBancoGlobal>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoCuentaBancoGlobal) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals()) {
					if(tipocuentabancoglobalAux.getIsSelected()) {
						tipocuentabancoglobalsSeleccionados.add(tipocuentabancoglobalAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:this.tipocuentabancoglobals) {
					if(tipocuentabancoglobalAux.getIsSelected()) {
						tipocuentabancoglobalsSeleccionados.add(tipocuentabancoglobalAux);				
					}
				}
			}
			
			if(tipocuentabancoglobalsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocuentabancoglobalsSeleccionados.addAll(this.tipocuentabancoglobalLogic.getTipoCuentaBancoGlobals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocuentabancoglobalsSeleccionados.addAll(this.tipocuentabancoglobals);				
					}
				}
			}
		} else {
			tipocuentabancoglobalsSeleccionados.add(this.tipocuentabancoglobal);
		}
		
		return tipocuentabancoglobalsSeleccionados;
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
	
	public void generarReporteTipoCuentaBancoGlobalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoCuentaBancoGlobalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoCuentaBancoGlobalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCuentaBancoGlobalsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCuentaBancoGlobalsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoCuentaBancoGlobalsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Cuenta Banco Global",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoCuentaBancoGlobalsSeleccionados() throws Exception {
		ArrayList<TipoCuentaBancoGlobal> tipocuentabancoglobalsSeleccionados=new ArrayList<TipoCuentaBancoGlobal>();		
		
		tipocuentabancoglobalsSeleccionados=this.getTipoCuentaBancoGlobalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoCuentaBancoGlobals("Todos",tipocuentabancoglobalsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoCuentaBancoGlobalsSeleccionados() throws Exception {
		ArrayList<TipoCuentaBancoGlobal> tipocuentabancoglobalsSeleccionados=new ArrayList<TipoCuentaBancoGlobal>();		
		
		tipocuentabancoglobalsSeleccionados=this.getTipoCuentaBancoGlobalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoCuentaBancoGlobals("Todos",tipocuentabancoglobalsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoCuentaBancoGlobalsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoCuentaBancoGlobal> tipocuentabancoglobalsSeleccionados=new ArrayList<TipoCuentaBancoGlobal>();
		
		tipocuentabancoglobalsSeleccionados=this.getTipoCuentaBancoGlobalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoCuentaBancoGlobals("Todos",tipocuentabancoglobalsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoCuentaBancoGlobalsSeleccionados() throws Exception {
		ArrayList<TipoCuentaBancoGlobal> tipocuentabancoglobalsSeleccionados=new ArrayList<TipoCuentaBancoGlobal>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoCuentaBancoGlobal();
		
		
		tipocuentabancoglobalsSeleccionados=this.getTipoCuentaBancoGlobalsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoCuentaBancoGlobal();
		
		
		//this.generarReporteTipoCuentaBancoGlobals("Todos",tipocuentabancoglobalsSeleccionados ,tipocuentabancoglobalImplementable,tipocuentabancoglobalImplementableHome);
	}
	
	public void mostrarImportacionTipoCuentaBancoGlobals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoCuentaBancoGlobal();
		
		this.abrirFrameImportacionTipoCuentaBancoGlobal();		
		
			
		//this.generarReporteTipoCuentaBancoGlobals("Todos",tipocuentabancoglobalsSeleccionados ,tipocuentabancoglobalImplementable,tipocuentabancoglobalImplementableHome);
	}
	
	public void importarTipoCuentaBancoGlobals() throws Exception {		
	
	}
	
	public void exportarTipoCuentaBancoGlobalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoCuentaBancoGlobalsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoCuentaBancoGlobalsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoCuentaBancoGlobalsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Cuenta Banco Global",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoCuentaBancoGlobalsSeleccionados() throws Exception {
		ArrayList<TipoCuentaBancoGlobal> tipocuentabancoglobalsSeleccionados=new ArrayList<TipoCuentaBancoGlobal>();		
		
		tipocuentabancoglobalsSeleccionados=this.getTipoCuentaBancoGlobalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentabancoglobal."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoCuentaBancoGlobal(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:tipocuentabancoglobalsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoCuentaBancoGlobal(tipocuentabancoglobalAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocuentabancoglobalAux.setsDetalleGeneralEntityReporte(tipocuentabancoglobalAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco Global",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoCuentaBancoGlobal(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoCuentaBancoGlobalConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCuentaBancoGlobalConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCuentaBancoGlobalConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCuentaBancoGlobalConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoCuentaBancoGlobal(TipoCuentaBancoGlobal tipocuentabancoglobal,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocuentabancoglobal.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocuentabancoglobal.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocuentabancoglobal.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocuentabancoglobal.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoCuentaBancoGlobalsSeleccionados() throws Exception {
		ArrayList<TipoCuentaBancoGlobal> tipocuentabancoglobalsSeleccionados=new ArrayList<TipoCuentaBancoGlobal>();		
		
		tipocuentabancoglobalsSeleccionados=this.getTipoCuentaBancoGlobalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentabancoglobal.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoCuentaBancoGlobals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoCuentaBancoGlobal(row);				
				iRow++;
			}				
			
			for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:tipocuentabancoglobalsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoCuentaBancoGlobal(tipocuentabancoglobalAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco Global",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoCuentaBancoGlobalsSeleccionados() throws Exception {
		ArrayList<TipoCuentaBancoGlobal> tipocuentabancoglobalsSeleccionados=new ArrayList<TipoCuentaBancoGlobal>();		
		
		tipocuentabancoglobalsSeleccionados=this.getTipoCuentaBancoGlobalsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocuentabancoglobal.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocuentabancoglobals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocuentabancoglobal");
			//elementRoot.appendChild(element);
		
			for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:tipocuentabancoglobalsSeleccionados) {
				element = document.createElement("tipocuentabancoglobal");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoCuentaBancoGlobal(tipocuentabancoglobalAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Banco Global",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoCuentaBancoGlobal(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuentaBancoGlobalConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuentaBancoGlobalConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuentaBancoGlobalConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCuentaBancoGlobalConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoCuentaBancoGlobal(TipoCuentaBancoGlobal tipocuentabancoglobal,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocuentabancoglobal.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocuentabancoglobal.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocuentabancoglobal.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoCuentaBancoGlobal(TipoCuentaBancoGlobal tipocuentabancoglobal,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoCuentaBancoGlobalConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocuentabancoglobal.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoCuentaBancoGlobalConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocuentabancoglobal.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoCuentaBancoGlobalConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipocuentabancoglobal.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoCuentaBancoGlobalConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipocuentabancoglobal.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoCuentaBancoGlobalsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoCuentaBancoGlobal> tipocuentabancoglobalsSeleccionados=new ArrayList<TipoCuentaBancoGlobal>();
		
		tipocuentabancoglobalsSeleccionados=this.getTipoCuentaBancoGlobalsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoCuentaBancoGlobal(tipocuentabancoglobalsSeleccionados);
		
		this.generarReporteTipoCuentaBancoGlobals("Todos",tipocuentabancoglobalsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoCuentaBancoGlobal(ArrayList<TipoCuentaBancoGlobal> tipocuentabancoglobalsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoCuentaBancoGlobal tipocuentabancoglobalAux:tipocuentabancoglobalsSeleccionados) {
				tipocuentabancoglobalAux.setsDetalleGeneralEntityReporte(tipocuentabancoglobalAux.toString());
			
				if(sTipoSeleccionar.equals(TipoCuentaBancoGlobalConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipocuentabancoglobalAux.setsDescripcionGeneralEntityReporte1(tipocuentabancoglobalAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoCuentaBancoGlobalConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipocuentabancoglobalAux.setsDescripcionGeneralEntityReporte1(tipocuentabancoglobalAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCuentaBancoGlobalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoCuentaBancoGlobal(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoCuentaBancoGlobal=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal=true;
				this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal=true;
			}
			
			this.isVisibilidadCeldaModificarTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaCancelarTipoCuentaBancoGlobal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGlobal=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGlobal=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaModificarTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaCancelarTipoCuentaBancoGlobal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGlobal=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGlobal=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaModificarTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaCancelarTipoCuentaBancoGlobal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGlobal=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGlobal=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaModificarTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaCancelarTipoCuentaBancoGlobal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGlobal=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGlobal=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaModificarTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaCancelarTipoCuentaBancoGlobal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGlobal=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGlobal=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaCancelarTipoCuentaBancoGlobal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGlobal=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGlobal=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaModificarTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaCancelarTipoCuentaBancoGlobal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGlobal=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCuentaBancoGlobal=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoCuentaBancoGlobalJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal=true;
		} else {
			this.actualizarEstadoPanelsTipoCuentaBancoGlobal(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoCuentaBancoGlobal=false;
			//this.isVisibilidadCeldaVerFormTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaDuplicarTipoCuentaBancoGlobal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
			if(!tipocuentabancoglobalSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal=false;												
			}
			
			this.jButtonCerrarTipoCuentaBancoGlobal.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCuentaBancoGlobal=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocuentabancoglobal)) {
			this.isVisibilidadCeldaActualizarTipoCuentaBancoGlobal=false;
			this.isVisibilidadCeldaEliminarTipoCuentaBancoGlobal=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCuentaBancoGlobal() {
		this.isVisibilidadCeldaNuevoTipoCuentaBancoGlobal=false;
		this.isVisibilidadCeldaGuardarCambiosTipoCuentaBancoGlobal=false;
	}
	
	public void actualizarEstadoPanelsTipoCuentaBancoGlobal(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosTipoCuentaBancoGlobal.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCuentaBancoGlobal!=null) {
				this.jPanelPaginacionTipoCuentaBancoGlobal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBancoGlobal!=null) {
				this.jPanelParametrosReportesTipoCuentaBancoGlobal.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosTipoCuentaBancoGlobal.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCuentaBancoGlobal!=null) {
				this.jPanelPaginacionTipoCuentaBancoGlobal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBancoGlobal!=null) {
				this.jPanelParametrosReportesTipoCuentaBancoGlobal.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosTipoCuentaBancoGlobal.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCuentaBancoGlobal!=null) {
				this.jPanelPaginacionTipoCuentaBancoGlobal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBancoGlobal!=null) {
				this.jPanelParametrosReportesTipoCuentaBancoGlobal.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosTipoCuentaBancoGlobal.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCuentaBancoGlobal!=null) {
				this.jPanelPaginacionTipoCuentaBancoGlobal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBancoGlobal!=null) {
				this.jPanelParametrosReportesTipoCuentaBancoGlobal.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosTipoCuentaBancoGlobal.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCuentaBancoGlobal!=null) {
				this.jPanelPaginacionTipoCuentaBancoGlobal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBancoGlobal!=null) {
				this.jPanelParametrosReportesTipoCuentaBancoGlobal.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosTipoCuentaBancoGlobal.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCuentaBancoGlobal!=null) {
				this.jPanelPaginacionTipoCuentaBancoGlobal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBancoGlobal!=null) {
				this.jPanelParametrosReportesTipoCuentaBancoGlobal.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosEdicionTipoCuentaBancoGlobal.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoCuentaBancoGlobal!=null) {
				this.jScrollPanelDatosTipoCuentaBancoGlobal.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCuentaBancoGlobal!=null) {
				this.jPanelPaginacionTipoCuentaBancoGlobal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCuentaBancoGlobal!=null) {
				this.jPanelParametrosReportesTipoCuentaBancoGlobal.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocuentabancoglobalSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoCuentaBancoGlobalParaBancoTipoCuentaBancoGlobales() throws Exception {
		Boolean isPaginaPopupBancoTipoCuentaBancoGlobal=false;

		try {

			if(this.tipocuentabancoglobalSessionBean==null) {
				this.tipocuentabancoglobalSessionBean=new TipoCuentaBancoGlobalSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalSessionBean==null) {
				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalSessionBean=new BancoTipoCuentaBancoGlobalSessionBean();
			}

			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalSessionBean.setsPathNavegacionActual(tipocuentabancoglobalSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+BancoTipoCuentaBancoGlobalConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupBancoTipoCuentaBancoGlobal=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeBancoTipoCuentaBancoGlobal(true);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeBancoTipoCuentaBancoGlobal(TipoCuentaBancoGlobalConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalSessionBean.setisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal(true);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.bancotipocuentabancoglobalSessionBean.setlidTipoCuentaBancoGlobalActual(this.idTipoCuentaBancoGlobalActual);

			tipocuentabancoglobalSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaBancoGlobal(true);
			tipocuentabancoglobalSessionBean.setlIdTipoCuentaBancoGlobalActualForeignKey(this.idTipoCuentaBancoGlobalActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoCuentaBancoGlobalParaDatoGeneralEmpleados() throws Exception {
		Boolean isPaginaPopupDatoGeneralEmpleado=false;

		try {

			if(this.tipocuentabancoglobalSessionBean==null) {
				this.tipocuentabancoglobalSessionBean=new TipoCuentaBancoGlobalSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoSessionBean.setsPathNavegacionActual(tipocuentabancoglobalSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDatoGeneralEmpleado=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado(true);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado(TipoCuentaBancoGlobalConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal(true);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.datogeneralempleadoSessionBean.setlidTipoCuentaBancoGlobalActual(this.idTipoCuentaBancoGlobalActual);

			tipocuentabancoglobalSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaBancoGlobal(true);
			tipocuentabancoglobalSessionBean.setlIdTipoCuentaBancoGlobalActualForeignKey(this.idTipoCuentaBancoGlobalActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoCuentaBancoGlobalParaPoliticasClientes() throws Exception {
		Boolean isPaginaPopupPoliticasCliente=false;

		try {

			if(this.tipocuentabancoglobalSessionBean==null) {
				this.tipocuentabancoglobalSessionBean=new TipoCuentaBancoGlobalSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteSessionBean==null) {
				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteSessionBean=new PoliticasClienteSessionBean();
			}

			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteSessionBean.setsPathNavegacionActual(tipocuentabancoglobalSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PoliticasClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPoliticasCliente=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePoliticasCliente(true);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePoliticasCliente(TipoCuentaBancoGlobalConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal(true);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.politicasclienteSessionBean.setlidTipoCuentaBancoGlobalActual(this.idTipoCuentaBancoGlobalActual);

			tipocuentabancoglobalSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaBancoGlobal(true);
			tipocuentabancoglobalSessionBean.setlIdTipoCuentaBancoGlobalActualForeignKey(this.idTipoCuentaBancoGlobalActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoCuentaBancoGlobalParaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(this.tipocuentabancoglobalSessionBean==null) {
				this.tipocuentabancoglobalSessionBean=new TipoCuentaBancoGlobalSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoSessionBean=new EmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoSessionBean.setsPathNavegacionActual(tipocuentabancoglobalSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEmpleado=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(TipoCuentaBancoGlobalConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal(true);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.empleadoSessionBean.setlidTipoCuentaBancoGlobalActual(this.idTipoCuentaBancoGlobalActual);

			tipocuentabancoglobalSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaBancoGlobal(true);
			tipocuentabancoglobalSessionBean.setlIdTipoCuentaBancoGlobalActualForeignKey(this.idTipoCuentaBancoGlobalActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoCuentaBancoGlobalParaParametroTesoreriaDefectos() throws Exception {
		Boolean isPaginaPopupParametroTesoreriaDefecto=false;

		try {

			if(this.tipocuentabancoglobalSessionBean==null) {
				this.tipocuentabancoglobalSessionBean=new TipoCuentaBancoGlobalSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoSessionBean=new ParametroTesoreriaDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoSessionBean.setsPathNavegacionActual(tipocuentabancoglobalSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroTesoreriaDefecto=this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroTesoreriaDefecto(true);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroTesoreriaDefecto(TipoCuentaBancoGlobalConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoCuentaBancoGlobal(true);
			this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.parametrotesoreriadefectoSessionBean.setlidTipoCuentaBancoGlobalActual(this.idTipoCuentaBancoGlobalActual);

			tipocuentabancoglobalSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoCuentaBancoGlobal(true);
			tipocuentabancoglobalSessionBean.setlIdTipoCuentaBancoGlobalActualForeignKey(this.idTipoCuentaBancoGlobalActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoCuentaBancoGlobalSessionBean tipocuentabancoglobalSessionBean=new TipoCuentaBancoGlobalSessionBean();
		
		if(this.tipocuentabancoglobalSessionBean==null) {
			this.tipocuentabancoglobalSessionBean=new TipoCuentaBancoGlobalSessionBean();
		}
		
		this.tipocuentabancoglobalSessionBean.setsUltimaBusquedaTipoCuentaBancoGlobal(this.getsAccionBusqueda());
		this.tipocuentabancoglobalSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocuentabancoglobalSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoCuentaBancoGlobalSessionBean tipocuentabancoglobalSessionBean=new TipoCuentaBancoGlobalSessionBean();
		
		if(this.tipocuentabancoglobalSessionBean==null) {
			this.tipocuentabancoglobalSessionBean=new TipoCuentaBancoGlobalSessionBean();
		}
		
		if(this.tipocuentabancoglobalSessionBean.getsUltimaBusquedaTipoCuentaBancoGlobal()!=null&&!this.tipocuentabancoglobalSessionBean.getsUltimaBusquedaTipoCuentaBancoGlobal().equals("")) {
			this.setsAccionBusqueda(tipocuentabancoglobalSessionBean.getsUltimaBusquedaTipoCuentaBancoGlobal());
			this.setiNumeroPaginacion(tipocuentabancoglobalSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocuentabancoglobalSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipocuentabancoglobalSessionBean.setsUltimaBusquedaTipoCuentaBancoGlobal("");
		this.tipocuentabancoglobalSessionBean.setiNumeroPaginacion(TipoCuentaBancoGlobalConstantesFunciones.INUMEROPAGINACION);
		this.tipocuentabancoglobalSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoCuentaBancoGlobal(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoCuentaBancoGlobal() {
		this.updateBorderResaltarBusquedasFormularioTipoCuentaBancoGlobal();
		this.updateVisibilidadBusquedasFormularioTipoCuentaBancoGlobal();
		this.updateHabilitarBusquedasFormularioTipoCuentaBancoGlobal();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoCuentaBancoGlobal() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoCuentaBancoGlobal() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoCuentaBancoGlobal() {
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
	
	public void updateControlesFormularioTipoCuentaBancoGlobal() throws Exception {

		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoCuentaBancoGlobal();
		this.updateVisibilidadResaltarControlesFormularioTipoCuentaBancoGlobal();
		this.updateHabilitarResaltarControlesFormularioTipoCuentaBancoGlobal();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoCuentaBancoGlobal() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocuentabancoglobalConstantesFunciones.resaltaridTipoCuentaBancoGlobal!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) {this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextFieldidTipoCuentaBancoGlobal.setBorder(this.tipocuentabancoglobalConstantesFunciones.resaltaridTipoCuentaBancoGlobal);}
		if(this.tipocuentabancoglobalConstantesFunciones.resaltarcodigoTipoCuentaBancoGlobal!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) {this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextFieldcodigoTipoCuentaBancoGlobal.setBorder(this.tipocuentabancoglobalConstantesFunciones.resaltarcodigoTipoCuentaBancoGlobal);}
		if(this.tipocuentabancoglobalConstantesFunciones.resaltarnombreTipoCuentaBancoGlobal!=null && this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) {this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextAreanombreTipoCuentaBancoGlobal.setBorder(this.tipocuentabancoglobalConstantesFunciones.resaltarnombreTipoCuentaBancoGlobal);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoCuentaBancoGlobal() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) {
	
		//this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextFieldidTipoCuentaBancoGlobal.setVisible(this.tipocuentabancoglobalConstantesFunciones.mostraridTipoCuentaBancoGlobal);
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jPanelidTipoCuentaBancoGlobal.setVisible(this.tipocuentabancoglobalConstantesFunciones.mostraridTipoCuentaBancoGlobal);
		//this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextFieldcodigoTipoCuentaBancoGlobal.setVisible(this.tipocuentabancoglobalConstantesFunciones.mostrarcodigoTipoCuentaBancoGlobal);
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jPanelcodigoTipoCuentaBancoGlobal.setVisible(this.tipocuentabancoglobalConstantesFunciones.mostrarcodigoTipoCuentaBancoGlobal);
		//this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextAreanombreTipoCuentaBancoGlobal.setVisible(this.tipocuentabancoglobalConstantesFunciones.mostrarnombreTipoCuentaBancoGlobal);
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jPanelnombreTipoCuentaBancoGlobal.setVisible(this.tipocuentabancoglobalConstantesFunciones.mostrarnombreTipoCuentaBancoGlobal);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoCuentaBancoGlobal() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCuentaBancoGlobal!=null) {
	
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextFieldidTipoCuentaBancoGlobal.setEnabled(this.tipocuentabancoglobalConstantesFunciones.activaridTipoCuentaBancoGlobal);
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextFieldcodigoTipoCuentaBancoGlobal.setEnabled(this.tipocuentabancoglobalConstantesFunciones.activarcodigoTipoCuentaBancoGlobal);
		this.jInternalFrameDetalleFormTipoCuentaBancoGlobal.jTextAreanombreTipoCuentaBancoGlobal.setEnabled(this.tipocuentabancoglobalConstantesFunciones.activarnombreTipoCuentaBancoGlobal);
		}
	}
	
		
}