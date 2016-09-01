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

import com.bydan.erp.nomina.util.TipoRubroEmpleaConstantesFunciones;
import com.bydan.erp.nomina.util.TipoRubroEmpleaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoRubroEmpleaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoRubroEmpleaBean;
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
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoRubroEmpleaBeanSwingJInternalFrame extends TipoRubroEmpleaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoRubroEmpleaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoRubroEmplea> tiporubroempleaValidator = new ClassValidator<TipoRubroEmplea>(TipoRubroEmplea.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoRubroEmplea tiporubroemplea;	
	public TipoRubroEmplea tiporubroempleaAux;
	public TipoRubroEmplea tiporubroempleaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoRubroEmplea tiporubroempleaTotales;
	public Long idTipoRubroEmpleaActual;
	public Long iIdNuevoTipoRubroEmplea=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosRubroEmplea=false;

	public Boolean getIsTienePermisosRubroEmplea() {
		return isTienePermisosRubroEmplea;
	}

	public void setIsTienePermisosRubroEmplea(Boolean isTienePermisosRubroEmplea) {
		this.isTienePermisosRubroEmplea= isTienePermisosRubroEmplea;
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
	
	public Boolean isPermisoTodoTipoRubroEmplea;
	public Boolean isPermisoNuevoTipoRubroEmplea;
	public Boolean isPermisoActualizarTipoRubroEmplea;
	public Boolean isPermisoActualizarOriginalTipoRubroEmplea;
	public Boolean isPermisoEliminarTipoRubroEmplea;
	public Boolean isPermisoGuardarCambiosTipoRubroEmplea;
	public Boolean isPermisoConsultaTipoRubroEmplea;
	public Boolean isPermisoBusquedaTipoRubroEmplea;
	public Boolean isPermisoReporteTipoRubroEmplea;
	public Boolean isPermisoPaginacionMedioTipoRubroEmplea;
	public Boolean isPermisoPaginacionAltoTipoRubroEmplea;
	public Boolean isPermisoPaginacionTodoTipoRubroEmplea;
	public Boolean isPermisoCopiarTipoRubroEmplea;
	public Boolean isPermisoVerFormTipoRubroEmplea;
	public Boolean isPermisoDuplicarTipoRubroEmplea;
	public Boolean isPermisoOrdenTipoRubroEmplea;
	
	
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
	
	public TipoRubroEmpleaParameterReturnGeneral tiporubroempleaReturnGeneral;
	public TipoRubroEmpleaParameterReturnGeneral tiporubroempleaParameterGeneral;
	
	

	public RubroEmpleaLogic rubroempleaLogic=null;

	public RubroEmpleaLogic getRubroEmpleaLogic() {
		return rubroempleaLogic;
	}

	public void setRubroEmpleaLogic(RubroEmpleaLogic rubroempleaLogic) {
		this.rubroempleaLogic = rubroempleaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoRubroEmplea=false;
	public Boolean esParaAccionDesdeFormularioTipoRubroEmplea=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoRubroEmpleaSessionBeanAdditional tiporubroempleaSessionBeanAdditional=null;
	
	public TipoRubroEmpleaSessionBeanAdditional getTipoRubroEmpleaSessionBeanAdditional() {
		return this.tiporubroempleaSessionBeanAdditional;
	}
	
	public void setTipoRubroEmpleaSessionBeanAdditional(TipoRubroEmpleaSessionBeanAdditional tiporubroempleaSessionBeanAdditional) {
		try {
			this.tiporubroempleaSessionBeanAdditional=tiporubroempleaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoRubroEmpleaBeanSwingJInternalFrameAdditional tiporubroempleaBeanSwingJInternalFrameAdditional=null;
	//public class TipoRubroEmpleaBeanSwingJInternalFrame
	
	public TipoRubroEmpleaBeanSwingJInternalFrameAdditional getTipoRubroEmpleaBeanSwingJInternalFrameAdditional() {
		return this.tiporubroempleaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoRubroEmpleaBeanSwingJInternalFrameAdditional(TipoRubroEmpleaBeanSwingJInternalFrameAdditional tiporubroempleaBeanSwingJInternalFrameAdditional) {
		try {
			this.tiporubroempleaBeanSwingJInternalFrameAdditional=tiporubroempleaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoRubroEmpleaLogic tiporubroempleaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoRubroEmplea tiporubroempleaBean;
	public TipoRubroEmpleaConstantesFunciones tiporubroempleaConstantesFunciones;
	//public TipoRubroEmpleaParameterReturnGeneral tiporubroempleaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoRubroEmplea> tiporubroempleas;	
	//public List<TipoRubroEmplea> tiporubroempleasEliminados;
	//public List<TipoRubroEmplea> tiporubroempleasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoRubroEmplea=false;
	public Boolean isVisibilidadCeldaDuplicarTipoRubroEmplea=true;
	public Boolean isVisibilidadCeldaCopiarTipoRubroEmplea=true;
	public Boolean isVisibilidadCeldaVerFormTipoRubroEmplea=true;
	public Boolean isVisibilidadCeldaOrdenTipoRubroEmplea=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoRubroEmplea=false;
	public Boolean isVisibilidadCeldaModificarTipoRubroEmplea=false;
	public Boolean isVisibilidadCeldaActualizarTipoRubroEmplea=false;
	public Boolean isVisibilidadCeldaEliminarTipoRubroEmplea=false;
	public Boolean isVisibilidadCeldaCancelarTipoRubroEmplea=false;
	public Boolean isVisibilidadCeldaGuardarTipoRubroEmplea=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoRubroEmplea=false;	
	
	
	
	public Long getiIdNuevoTipoRubroEmplea() {
		return this.iIdNuevoTipoRubroEmplea;
	}

	public void setiIdNuevoTipoRubroEmplea(Long iIdNuevoTipoRubroEmplea) {
		this.iIdNuevoTipoRubroEmplea = iIdNuevoTipoRubroEmplea;
	}
	
	public Long getidTipoRubroEmpleaActual() {
		return this.idTipoRubroEmpleaActual;
	}

	public void setidTipoRubroEmpleaActual(Long idTipoRubroEmpleaActual) {
		this.idTipoRubroEmpleaActual = idTipoRubroEmpleaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoRubroEmplea gettiporubroemplea() {
		return this.tiporubroemplea;
	}

	public void settiporubroemplea(TipoRubroEmplea tiporubroemplea) {
		this.tiporubroemplea = tiporubroemplea;
	}
	
	public TipoRubroEmplea gettiporubroempleaAux() {
		return this.tiporubroempleaAux;
	}

	public void settiporubroempleaAux(TipoRubroEmplea tiporubroempleaAux) {
		this.tiporubroempleaAux = tiporubroempleaAux;
	}				
	
	public TipoRubroEmplea gettiporubroempleaAnterior() {
		return this.tiporubroempleaAnterior;
	}

	public void settiporubroempleaAnterior(TipoRubroEmplea tiporubroempleaAnterior) {
		this.tiporubroempleaAnterior = tiporubroempleaAnterior;
	}	
	
	public TipoRubroEmplea gettiporubroempleaTotales() {
		return this.tiporubroempleaTotales;
	}

	public void settiporubroempleaTotales(TipoRubroEmplea tiporubroempleaTotales) {
		this.tiporubroempleaTotales = tiporubroempleaTotales;
	}	
	
	public TipoRubroEmplea gettiporubroempleaBean() {
		return this.tiporubroempleaBean;
	}

	public void settiporubroempleaBean(TipoRubroEmplea tiporubroempleaBean) {
		this.tiporubroempleaBean = tiporubroempleaBean;
	}	
	
	public TipoRubroEmpleaParameterReturnGeneral gettiporubroempleaReturnGeneral() {
		return this.tiporubroempleaReturnGeneral;
	}

	public void settiporubroempleaReturnGeneral(TipoRubroEmpleaParameterReturnGeneral tiporubroempleaReturnGeneral) {
		this.tiporubroempleaReturnGeneral = tiporubroempleaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoRubroEmpleaLogic getTipoRubroEmpleaLogic()	{		
		return tiporubroempleaLogic;
	}

	public void setTipoRubroEmpleaLogic(TipoRubroEmpleaLogic tiporubroempleaLogic) {
		this.tiporubroempleaLogic = tiporubroempleaLogic;
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
	
	public Boolean getIsEsNuevoTipoRubroEmplea() {
		return isEsNuevoTipoRubroEmplea;
	}

	public void setIsEsNuevoTipoRubroEmplea(Boolean isEsNuevoTipoRubroEmplea) {
		this.isEsNuevoTipoRubroEmplea = isEsNuevoTipoRubroEmplea;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoRubroEmplea() {
		return esParaAccionDesdeFormularioTipoRubroEmplea;
	}
	
	public void setEsParaAccionDesdeFormularioTipoRubroEmplea(Boolean esParaAccionDesdeFormularioTipoRubroEmplea) {
		this.esParaAccionDesdeFormularioTipoRubroEmplea = esParaAccionDesdeFormularioTipoRubroEmplea;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoRubroEmplea() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoRubroEmpleaConstantesFunciones.refrescarForeignKeysDescripcionesTipoRubroEmplea(this.tiporubroempleaLogic.getTipoRubroEmpleas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoRubroEmpleaConstantesFunciones.refrescarForeignKeysDescripcionesTipoRubroEmplea(this.tiporubroempleas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tiporubroempleaLogic.setTipoRubroEmpleas(this.tiporubroempleas);
			tiporubroempleaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoRubroEmpleaParameterReturnGeneral getTipoRubroEmpleaParameterGeneral() {
		return this.tiporubroempleaParameterGeneral;
	}
	
	public void setTipoRubroEmpleaParameterGeneral(TipoRubroEmpleaParameterReturnGeneral tiporubroempleaParameterGeneral) {
		this.tiporubroempleaParameterGeneral = tiporubroempleaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoRubroEmplea() {
		return isPermisoTodoTipoRubroEmplea;
	}

	public void setIsPermisoTodoTipoRubroEmplea(Boolean isPermisoTodoTipoRubroEmplea) {
		this.isPermisoTodoTipoRubroEmplea = isPermisoTodoTipoRubroEmplea;
	}

	public Boolean getIsPermisoNuevoTipoRubroEmplea() {
		return isPermisoNuevoTipoRubroEmplea;
	}

	public void setIsPermisoNuevoTipoRubroEmplea(Boolean isPermisoNuevoTipoRubroEmplea) {
		this.isPermisoNuevoTipoRubroEmplea = isPermisoNuevoTipoRubroEmplea;
	}

	public Boolean getIsPermisoActualizarTipoRubroEmplea() {
		return isPermisoActualizarTipoRubroEmplea;
	}

	public void setIsPermisoActualizarTipoRubroEmplea(Boolean isPermisoActualizarTipoRubroEmplea) {
		this.isPermisoActualizarTipoRubroEmplea = isPermisoActualizarTipoRubroEmplea;
	}

	public Boolean getIsPermisoEliminarTipoRubroEmplea() {
		return isPermisoEliminarTipoRubroEmplea;
	}

	public void setIsPermisoEliminarTipoRubroEmplea(Boolean isPermisoEliminarTipoRubroEmplea) {
		this.isPermisoEliminarTipoRubroEmplea = isPermisoEliminarTipoRubroEmplea;
	}

	public Boolean getIsPermisoGuardarCambiosTipoRubroEmplea() {
		return isPermisoGuardarCambiosTipoRubroEmplea;
	}

	public void setIsPermisoGuardarCambiosTipoRubroEmplea(Boolean isPermisoGuardarCambiosTipoRubroEmplea) {
		this.isPermisoGuardarCambiosTipoRubroEmplea = isPermisoGuardarCambiosTipoRubroEmplea;
	}
	
	public Boolean getIsPermisoConsultaTipoRubroEmplea() {
		return isPermisoConsultaTipoRubroEmplea;
	}

	public void setIsPermisoConsultaTipoRubroEmplea(Boolean isPermisoConsultaTipoRubroEmplea) {
		this.isPermisoConsultaTipoRubroEmplea = isPermisoConsultaTipoRubroEmplea;
	}

	public Boolean getIsPermisoBusquedaTipoRubroEmplea() {
		return isPermisoBusquedaTipoRubroEmplea;
	}

	public void setIsPermisoBusquedaTipoRubroEmplea(Boolean isPermisoBusquedaTipoRubroEmplea) {
		this.isPermisoBusquedaTipoRubroEmplea = isPermisoBusquedaTipoRubroEmplea;
	}

	public Boolean getIsPermisoReporteTipoRubroEmplea() {
		return isPermisoReporteTipoRubroEmplea;
	}

	public void setIsPermisoReporteTipoRubroEmplea(Boolean isPermisoReporteTipoRubroEmplea) {
		this.isPermisoReporteTipoRubroEmplea = isPermisoReporteTipoRubroEmplea;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoRubroEmplea() {
		return isPermisoPaginacionMedioTipoRubroEmplea;
	}

	public void setIsPermisoPaginacionMedioTipoRubroEmplea(Boolean isPermisoPaginacionMedioTipoRubroEmplea) {
		this.isPermisoPaginacionMedioTipoRubroEmplea = isPermisoPaginacionMedioTipoRubroEmplea;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoRubroEmplea() {
		return isPermisoPaginacionTodoTipoRubroEmplea;
	}

	public void setIsPermisoPaginacionTodoTipoRubroEmplea(Boolean isPermisoPaginacionTodoTipoRubroEmplea) {
		this.isPermisoPaginacionTodoTipoRubroEmplea = isPermisoPaginacionTodoTipoRubroEmplea;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoRubroEmplea() {
		return isPermisoPaginacionAltoTipoRubroEmplea;
	}

	public void setIsPermisoPaginacionAltoTipoRubroEmplea(Boolean isPermisoPaginacionAltoTipoRubroEmplea) {
		this.isPermisoPaginacionAltoTipoRubroEmplea = isPermisoPaginacionAltoTipoRubroEmplea;
	}
	
	public Boolean getIsPermisoCopiarTipoRubroEmplea() {
		return isPermisoCopiarTipoRubroEmplea;
	}

	public void setIsPermisoCopiarTipoRubroEmplea(Boolean isPermisoCopiarTipoRubroEmplea) {
		this.isPermisoCopiarTipoRubroEmplea = isPermisoCopiarTipoRubroEmplea;
	}
	
	public Boolean getIsPermisoVerFormTipoRubroEmplea() {
		return isPermisoVerFormTipoRubroEmplea;
	}

	public void setIsPermisoVerFormTipoRubroEmplea(Boolean isPermisoVerFormTipoRubroEmplea) {
		this.isPermisoVerFormTipoRubroEmplea = isPermisoVerFormTipoRubroEmplea;
	}
	
	public Boolean getIsPermisoDuplicarTipoRubroEmplea() {
		return isPermisoDuplicarTipoRubroEmplea;
	}

	public void setIsPermisoDuplicarTipoRubroEmplea(Boolean isPermisoDuplicarTipoRubroEmplea) {
		this.isPermisoDuplicarTipoRubroEmplea = isPermisoDuplicarTipoRubroEmplea;
	}
	
	public Boolean getIsPermisoOrdenTipoRubroEmplea() {
		return isPermisoOrdenTipoRubroEmplea;
	}

	public void setIsPermisoOrdenTipoRubroEmplea(Boolean isPermisoOrdenTipoRubroEmplea) {
		this.isPermisoOrdenTipoRubroEmplea = isPermisoOrdenTipoRubroEmplea;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoRubroEmplea() {
		return isVisibilidadCeldaNuevoTipoRubroEmplea;
	}

	public void setIsVisibilidadCeldaNuevoTipoRubroEmplea(Boolean isVisibilidadCeldaNuevoTipoRubroEmplea) {
		this.isVisibilidadCeldaNuevoTipoRubroEmplea = isVisibilidadCeldaNuevoTipoRubroEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoRubroEmplea() {
		return isVisibilidadCeldaDuplicarTipoRubroEmplea;
	}

	public void setIsVisibilidadCeldaDuplicarTipoRubroEmplea(Boolean isVisibilidadCeldaDuplicarTipoRubroEmplea) {
		this.isVisibilidadCeldaDuplicarTipoRubroEmplea = isVisibilidadCeldaDuplicarTipoRubroEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoRubroEmplea() {
		return isVisibilidadCeldaCopiarTipoRubroEmplea;
	}

	public void setIsVisibilidadCeldaCopiarTipoRubroEmplea(Boolean isVisibilidadCeldaCopiarTipoRubroEmplea) {
		this.isVisibilidadCeldaCopiarTipoRubroEmplea = isVisibilidadCeldaCopiarTipoRubroEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoRubroEmplea() {
		return isVisibilidadCeldaVerFormTipoRubroEmplea;
	}

	public void setIsVisibilidadCeldaVerFormTipoRubroEmplea(Boolean isVisibilidadCeldaVerFormTipoRubroEmplea) {
		this.isVisibilidadCeldaVerFormTipoRubroEmplea = isVisibilidadCeldaVerFormTipoRubroEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoRubroEmplea() {
		return isVisibilidadCeldaOrdenTipoRubroEmplea;
	}

	public void setIsVisibilidadCeldaOrdenTipoRubroEmplea(Boolean isVisibilidadCeldaOrdenTipoRubroEmplea) {
		this.isVisibilidadCeldaOrdenTipoRubroEmplea = isVisibilidadCeldaOrdenTipoRubroEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoRubroEmplea() {
		return isVisibilidadCeldaNuevoRelacionesTipoRubroEmplea;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoRubroEmplea(Boolean isVisibilidadCeldaNuevoRelacionesTipoRubroEmplea) {
		this.isVisibilidadCeldaNuevoRelacionesTipoRubroEmplea = isVisibilidadCeldaNuevoRelacionesTipoRubroEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoRubroEmplea() {
		return isVisibilidadCeldaModificarTipoRubroEmplea;
	}

	public void setIsVisibilidadCeldaModificarTipoRubroEmplea(Boolean isVisibilidadCeldaModificarTipoRubroEmplea) {
		this.isVisibilidadCeldaModificarTipoRubroEmplea = isVisibilidadCeldaModificarTipoRubroEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoRubroEmplea() {
		return isVisibilidadCeldaActualizarTipoRubroEmplea;
	}

	public void setIsVisibilidadCeldaActualizarTipoRubroEmplea(Boolean isVisibilidadCeldaActualizarTipoRubroEmplea) {
		this.isVisibilidadCeldaActualizarTipoRubroEmplea = isVisibilidadCeldaActualizarTipoRubroEmplea;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoRubroEmplea() {
		return isVisibilidadCeldaEliminarTipoRubroEmplea;
	}

	public void setIsVisibilidadCeldaEliminarTipoRubroEmplea(Boolean isVisibilidadCeldaEliminarTipoRubroEmplea) {
		this.isVisibilidadCeldaEliminarTipoRubroEmplea = isVisibilidadCeldaEliminarTipoRubroEmplea;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoRubroEmplea() {
		return isVisibilidadCeldaCancelarTipoRubroEmplea;
	}

	public void setIsVisibilidadCeldaCancelarTipoRubroEmplea(Boolean isVisibilidadCeldaCancelarTipoRubroEmplea) {
		this.isVisibilidadCeldaCancelarTipoRubroEmplea = isVisibilidadCeldaCancelarTipoRubroEmplea;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoRubroEmplea() {
		return isVisibilidadCeldaGuardarTipoRubroEmplea;
	}

	public void setIsVisibilidadCeldaGuardarTipoRubroEmplea(Boolean isVisibilidadCeldaGuardarTipoRubroEmplea) {
		this.isVisibilidadCeldaGuardarTipoRubroEmplea = isVisibilidadCeldaGuardarTipoRubroEmplea;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoRubroEmplea() {
		return isVisibilidadCeldaGuardarCambiosTipoRubroEmplea;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoRubroEmplea(Boolean isVisibilidadCeldaGuardarCambiosTipoRubroEmplea) {
		this.isVisibilidadCeldaGuardarCambiosTipoRubroEmplea = isVisibilidadCeldaGuardarCambiosTipoRubroEmplea;
	}
		
	public TipoRubroEmpleaSessionBean gettiporubroempleaSessionBean() {
		return this.tiporubroempleaSessionBean;
	}
	
	public void settiporubroempleaSessionBean(TipoRubroEmpleaSessionBean tiporubroempleaSessionBean) {
		this.tiporubroempleaSessionBean=tiporubroempleaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoRubroEmplea(TipoRubroEmplea tiporubroemplea)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoRubroEmplea tiporubroemplea,TipoRubroEmplea tiporubroempleaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoRubroEmplea(tiporubroemplea);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tiporubroempleaAux.setId(tiporubroemplea.getId());
		tiporubroempleaAux.setVersionRow(tiporubroemplea.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoRubroEmplea();
		
			int intSelectedRow = this.jTableDatosTipoRubroEmplea.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoRubroEmplea(this.tiporubroemplea,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRubroEmplea(this.tiporubroemplea);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tiporubroempleaValidator.getInvalidValues(this.tiporubroemplea);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tiporubroempleaLogic.setDatosCliente(datosCliente);
			tiporubroempleaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tiporubroempleaAux=new  TipoRubroEmplea();
				
				tiporubroempleaAux.setIsNew(true);
				tiporubroempleaAux.setIsChanged(true);
				
				tiporubroempleaAux.setTipoRubroEmpleaOriginal(this.tiporubroemplea);
				
				tiporubroempleaAux.setId(this.tiporubroemplea.getId());	
				tiporubroempleaAux.setVersionRow(this.tiporubroemplea.getVersionRow());	
				tiporubroempleaAux.setcodigo(this.tiporubroemplea.getcodigo());	
				tiporubroempleaAux.setnombre(this.tiporubroemplea.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporubroempleaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporubroempleaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tiporubroempleaAux,tiporubroempleaLogic.getTipoRubroEmpleas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporubroempleaAux,tiporubroempleas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tiporubroempleaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporubroempleaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporubroempleaLogic.saveTipoRubroEmpleas();//WithConnection
						//tiporubroempleaLogic.getSetVersionRowTipoRubroEmpleas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporubroemplea,tiporubroempleaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporubroempleaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleaLogic.getRubroEmpleas().addAll(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleas.addAll(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporubroempleaLogic.saveTipoRubroEmpleaRelaciones(tiporubroempleaAux,this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleaLogic.getRubroEmpleas());//WithConnection
								//tiporubroempleaLogic.getSetVersionRowTipoRubroEmpleas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiporubroemplea,tiporubroempleaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleaLogic.setRubroEmpleas(new ArrayList<RubroEmplea>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleas= new ArrayList<RubroEmplea>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.quitarFilaTotales();}
							tiporubroempleaAux.setRubroEmpleas(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleaLogic.getRubroEmpleas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiporubroempleaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiporubroempleaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiporubroempleaAux,tiporubroempleaLogic.getTipoRubroEmpleas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiporubroempleaAux,tiporubroempleas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiporubroemplea,tiporubroempleaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tiporubroempleaAux=new  TipoRubroEmplea();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado() 
					|| (this.tiporubroempleaSessionBean.getEsGuardarRelacionado() && this.tiporubroemplea.getId()>=0)) {
						
					tiporubroempleaAux.setIsNew(false);
				}
				
				tiporubroempleaAux.setIsDeleted(false);
			
				tiporubroempleaAux.setId(this.tiporubroemplea.getId());	
				tiporubroempleaAux.setVersionRow(this.tiporubroemplea.getVersionRow());	
				tiporubroempleaAux.setcodigo(this.tiporubroemplea.getcodigo());	
				tiporubroempleaAux.setnombre(this.tiporubroemplea.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporubroempleaAux,tiporubroempleaLogic.getTipoRubroEmpleas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporubroempleaAux,tiporubroempleas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tiporubroempleaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporubroempleaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporubroempleaLogic.saveTipoRubroEmpleas();//WithConnection
						//tiporubroempleaLogic.getSetVersionRowTipoRubroEmpleas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporubroemplea,tiporubroempleaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporubroempleaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleaLogic.getRubroEmpleas().addAll(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleas.addAll(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporubroempleaLogic.saveTipoRubroEmpleaRelaciones(tiporubroempleaAux,this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleaLogic.getRubroEmpleas());//WithConnection
								//tiporubroempleaLogic.getSetVersionRowTipoRubroEmpleas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiporubroemplea,tiporubroempleaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleaLogic.setRubroEmpleas(new ArrayList<RubroEmplea>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleas= new ArrayList<RubroEmplea>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.quitarFilaTotales();}
							tiporubroempleaAux.setRubroEmpleas(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleaLogic.getRubroEmpleas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiporubroempleaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiporubroempleaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiporubroempleaAux,tiporubroempleaLogic.getTipoRubroEmpleas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiporubroempleaAux,tiporubroempleas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiporubroemplea,tiporubroempleaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tiporubroempleaAux=new  TipoRubroEmplea();
				
				tiporubroempleaAux.setIsNew(false);
				tiporubroempleaAux.setIsChanged(false);
				
				tiporubroempleaAux.setIsDeleted(true);
				
				tiporubroempleaAux.setId(this.tiporubroemplea.getId());	
				tiporubroempleaAux.setVersionRow(this.tiporubroemplea.getVersionRow());	
				tiporubroempleaAux.setcodigo(this.tiporubroemplea.getcodigo());	
				tiporubroempleaAux.setnombre(this.tiporubroemplea.getnombre());	
				
				if(this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tiporubroempleaAux.getId()>=0) {	
						this.tiporubroempleasEliminados.add(tiporubroempleaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tiporubroempleaAux,tiporubroempleaLogic.getTipoRubroEmpleas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporubroempleaAux,tiporubroempleas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tiporubroempleaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporubroempleaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporubroempleaLogic.saveTipoRubroEmpleas();//WithConnection
						//tiporubroempleaLogic.getSetVersionRowTipoRubroEmpleas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporubroempleaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleaLogic.getRubroEmpleas().addAll(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleas.addAll(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporubroempleaLogic.saveTipoRubroEmpleaRelaciones(tiporubroempleaAux,this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleaLogic.getRubroEmpleas());//WithConnection
								//tiporubroempleaLogic.getSetVersionRowTipoRubroEmpleas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleaLogic.setRubroEmpleas(new ArrayList<RubroEmplea>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleas= new ArrayList<RubroEmplea>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.quitarFilaTotales();}
							tiporubroempleaAux.setRubroEmpleas(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleaLogic.getRubroEmpleas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tiporubroempleaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tiporubroempleaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tiporubroempleaAux,tiporubroempleaLogic.getTipoRubroEmpleas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tiporubroempleaAux,tiporubroempleas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroempleaLogic.getTipoRubroEmpleas().addAll(this.tiporubroempleasEliminados);
					
					tiporubroempleaLogic.saveTipoRubroEmpleas();//WithConnection
					//tiporubroempleaLogic.getSetVersionRowTipoRubroEmpleas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tiporubroempleasEliminados= new ArrayList<TipoRubroEmplea>();		
			}
			
			if(this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Rubro GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Rubro",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tiporubroemplea=tiporubroempleaAux;
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
      		//this.finishProcessTipoRubroEmplea();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoRubroEmplea tiporubroempleaLocal) throws Exception {
		
		if(this.tiporubroempleaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tiporubroempleaLocal.setRubroEmpleas(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleaLogic.getRubroEmpleas());
			
			} else {
			
				tiporubroempleaLocal.setRubroEmpleas(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoRubroEmplea tiporubroempleaLocal) throws Exception {	
		if(this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoRubroEmpleaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoRubroEmplea.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tiporubroempleaValidator.getInvalidValues(this.tiporubroemplea);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoRubroEmplea tiporubroemplea,List<TipoRubroEmplea> tiporubroempleas) throws Exception {
		try	{		
			TipoRubroEmpleaConstantesFunciones.actualizarLista(tiporubroemplea,tiporubroempleas,this.tiporubroempleaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoRubroEmplea tiporubroemplea,List<TipoRubroEmplea> tiporubroempleas) throws Exception {
		try	{			
			TipoRubroEmpleaConstantesFunciones.actualizarSelectedLista(tiporubroemplea,tiporubroempleas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoRubroEmplea> tiporubroempleasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tiporubroempleasLocal=this.tiporubroempleaLogic.getTipoRubroEmpleas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tiporubroempleasLocal=this.tiporubroempleas;
			}
			//ARCHITECTURE
		
			for(TipoRubroEmplea tiporubroempleaLocal:tiporubroempleasLocal) {
				if(this.permiteMantenimiento(tiporubroempleaLocal) && tiporubroempleaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoRubroEmpleaConstantesFunciones.getTipoRubroEmpleaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoRubroEmpleaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRubroEmplea.jLabelcodigoTipoRubroEmplea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRubroEmpleaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRubroEmplea.jLabelnombreTipoRubroEmplea,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRubroEmplea.jLabelcodigoTipoRubroEmplea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRubroEmplea.jLabelnombreTipoRubroEmplea,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("RubroEmplea")) {
			if(this.tiporubroemplea==null) {
				this.tiporubroemplea= new TipoRubroEmplea();
			}

			if(this.tiporubroempleaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoRubroEmplea
				this.setVariablesFormularioToObjetoActualTipoRubroEmplea(this.tiporubroemplea,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRubroEmplea(this.tiporubroemplea);

				this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.getrubroemplea().setTipoRubroEmplea(this.tiporubroemplea);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoRubroEmplea--;	
		
		
		this.tiporubroempleaAux=new TipoRubroEmplea();
		
		this.tiporubroempleaAux.setId(this.iIdNuevoTipoRubroEmplea);
		this.tiporubroempleaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporubroempleaLogic.getTipoRubroEmpleas().add(this.tiporubroempleaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tiporubroempleas.add(this.tiporubroempleaAux);
		}
		//ARCHITECTURE
		
		this.tiporubroemplea=this.tiporubroempleaAux;
		
		if(TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoRubroEmplea(this.tiporubroemplea);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRubroEmplea(this.tiporubroemplea);
		}
				
		//this.setDefaultControlesTipoRubroEmplea();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoRubroEmplea();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoRubroEmplea();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRubroEmplea();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRubroEmplea(this.tiporubroempleaBean,this.tiporubroemplea,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRubroEmplea(this.tiporubroemplea);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tiporubroempleaSessionBean.getConGuardarRelaciones()) {
			classes=TipoRubroEmpleaConstantesFunciones.getClassesRelationshipsOfTipoRubroEmplea(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tiporubroempleaReturnGeneral=tiporubroempleaLogic.procesarEventosTipoRubroEmpleasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporubroempleaLogic.getTipoRubroEmpleas(),this.tiporubroemplea,this.tiporubroempleaParameterGeneral,this.isEsNuevoTipoRubroEmplea,classes);//this.tiporubroempleaLogic.getTipoRubroEmplea()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoRubroEmplea(this.tiporubroempleaReturnGeneral,this.tiporubroempleaBean,false);
		
		if(this.tiporubroempleaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRubroEmplea(this.tiporubroempleaReturnGeneral.getTipoRubroEmplea());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoRubroEmplea(this.tiporubroempleaReturnGeneral.getTipoRubroEmplea());
		}
		
		if(this.tiporubroempleaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoRubroEmplea(this.tiporubroempleaReturnGeneral.getTipoRubroEmplea(),classes);//this.tiporubroempleaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoRubroEmplea(this.tiporubroemplea,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoRubroEmplea();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoRubroEmplea();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoRubroEmpleaBeanSwingJInternalFrameAdditional.RecargarFormTipoRubroEmplea(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoRubroEmplea(false);
						
			if(tiporubroempleaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleaSessionBean.getEsGuardarRelacionado() && RubroEmpleaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRubroEmpleaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRubroEmplea();
			}
			
			this.actualizarVisualTableDatosTipoRubroEmplea();
			
			this.jTableDatosTipoRubroEmplea.setRowSelectionInterval(this.getIndiceNuevoTipoRubroEmplea(), this.getIndiceNuevoTipoRubroEmplea());
			
			this.seleccionarFilaTablaTipoRubroEmpleaActual();
						
			this.actualizarEstadoCeldasBotonesTipoRubroEmplea("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoRubroEmplea(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldcodigoTipoRubroEmplea.setEnabled(isHabilitar && this.tiporubroempleaConstantesFunciones.activarcodigoTipoRubroEmplea);
		this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldnombreTipoRubroEmplea.setEnabled(isHabilitar && this.tiporubroempleaConstantesFunciones.activarnombreTipoRubroEmplea);	
		
	};
	
	public void setDefaultControlesTipoRubroEmplea() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoRubroEmplea(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tiporubroempleaSessionBean.setConGuardarRelaciones(true);			
			this.tiporubroempleaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoRubroEmplea.jTabbedPaneRelacionesTipoRubroEmplea.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tiporubroempleaSessionBean.setConGuardarRelaciones(false);			
			this.tiporubroempleaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoRubroEmplea.jTabbedPaneRelacionesTipoRubroEmplea.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoRubroEmplea() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRubroEmplea tiporubroempleaAux:this.tiporubroempleaLogic.getTipoRubroEmpleas()) {
				if(tiporubroempleaAux.getId().equals(this.iIdNuevoTipoRubroEmplea)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRubroEmplea tiporubroempleaAux:this.tiporubroempleas) {
				if(tiporubroempleaAux.getId().equals(this.iIdNuevoTipoRubroEmplea)) {
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
	
	public int getIndiceActualTipoRubroEmplea(TipoRubroEmplea tiporubroemplea,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRubroEmplea tiporubroempleaAux:this.tiporubroempleaLogic.getTipoRubroEmpleas()) {
				if(tiporubroempleaAux.getId().equals(tiporubroemplea.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRubroEmplea tiporubroempleaAux:this.tiporubroempleas) {
				if(tiporubroempleaAux.getId().equals(tiporubroemplea.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoRubroEmplea(TipoRubroEmplea tiporubroempleaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRubroEmplea tiporubroempleaAux:this.tiporubroempleaLogic.getTipoRubroEmpleas()) {
				if(tiporubroempleaAux.getTipoRubroEmpleaOriginal().getId().equals(tiporubroempleaOriginal.getId())) {
					existe=true;
					tiporubroempleaOriginal.setId(tiporubroempleaAux.getId());
					tiporubroempleaOriginal.setVersionRow(tiporubroempleaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRubroEmplea tiporubroempleaAux:this.tiporubroempleas) {
				if(tiporubroempleaAux.getTipoRubroEmpleaOriginal().getId().equals(tiporubroempleaOriginal.getId())) {
					existe=true;
					tiporubroempleaOriginal.setId(tiporubroempleaAux.getId());
					tiporubroempleaOriginal.setVersionRow(tiporubroempleaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoRubroEmplea(Boolean esParaCancelar) throws Exception {
		tiporubroempleasAux=new ArrayList<TipoRubroEmplea>();
		tiporubroempleaAux=new TipoRubroEmplea();
		
		if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRubroEmplea tiporubroempleaAux:this.tiporubroempleaLogic.getTipoRubroEmpleas()) {
					if(tiporubroempleaAux.getId()<0) {
						tiporubroempleasAux.add(tiporubroempleaAux);
					}		
				}
				this.iIdNuevoTipoRubroEmplea=0L;
				this.tiporubroempleaLogic.getTipoRubroEmpleas().removeAll(tiporubroempleasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRubroEmplea tiporubroempleaAux:this.tiporubroempleas) {
					if(tiporubroempleaAux.getId()<0) {
						tiporubroempleasAux.add(tiporubroempleaAux);
					}		
				}
				this.iIdNuevoTipoRubroEmplea=0L;
				this.tiporubroempleas.removeAll(tiporubroempleasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoRubroEmplea 
					&& this.tiporubroempleaLogic.getTipoRubroEmpleas().size()>0
					) {
					tiporubroempleaAux=this.tiporubroempleaLogic.getTipoRubroEmpleas().get(this.tiporubroempleaLogic.getTipoRubroEmpleas().size() - 1);
				
					if(tiporubroempleaAux.getId()<0) {
						this.tiporubroempleaLogic.getTipoRubroEmpleas().remove(tiporubroempleaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoRubroEmplea && this.tiporubroempleas.size()>0) {
					tiporubroempleaAux=this.tiporubroempleas.get(this.tiporubroempleas.size() - 1);
				
					if(tiporubroempleaAux.getId()<0) {
						this.tiporubroempleas.remove(tiporubroempleaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoRubroEmplea(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tiporubroemplea.getId()<0) {
				this.tiporubroempleaLogic.getTipoRubroEmpleas().remove(this.tiporubroemplea);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tiporubroemplea.getId()<0) {
				this.tiporubroempleas.remove(this.tiporubroemplea);
			}
		}			
	}
	
	public void setEstadosInicialesTipoRubroEmplea(List<TipoRubroEmplea> tiporubroempleasAux) throws Exception {
		TipoRubroEmpleaConstantesFunciones.setEstadosInicialesTipoRubroEmplea(tiporubroempleasAux);
	}
	
	public void setEstadosInicialesTipoRubroEmplea(TipoRubroEmplea tiporubroempleaAux) throws Exception {
		TipoRubroEmpleaConstantesFunciones.setEstadosInicialesTipoRubroEmplea(tiporubroempleaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoRubroEmpleaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoRubroEmplea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoRubroEmpleaActual()) {
				if(!this.isEsNuevoTipoRubroEmplea) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoRubroEmplea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoRubroEmplea=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoRubroEmpleaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Rubro ?", "MANTENIMIENTO DE Tipo Rubro", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoRubroEmplea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoRubroEmplea tiporubroemplea) throws Exception {
		TipoRubroEmpleaConstantesFunciones.seleccionarAsignar(this.tiporubroemplea,tiporubroemplea);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoRubroEmplea=this.isPermisoActualizarOriginalTipoRubroEmplea;
			
			
			this.seleccionarAsignar(tiporubroemplea);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoRubroEmpleaConstantesFunciones.quitarEspaciosTipoRubroEmplea(this.tiporubroemplea,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoRubroEmplea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tiporubroempleaSessionBean.setsFuncionBusquedaRapida(this.tiporubroempleaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoRubroEmplea) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoRubroEmplea(esParaCancelar);				
				this.cancelarNuevoTipoRubroEmplea(esParaCancelar);								
			}
			
			this.tiporubroemplea=new TipoRubroEmplea();
			
			this.inicializarTipoRubroEmplea();
			
			this.actualizarEstadoCeldasBotonesTipoRubroEmplea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoRubroEmplea() throws Exception {
		try {
			TipoRubroEmpleaConstantesFunciones.inicializarTipoRubroEmplea(this.tiporubroemplea);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tiporubroempleaLogic.getTipoRubroEmpleas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoRubroEmpleas(String sAccionBusqueda,List<TipoRubroEmplea> tiporubroempleasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoRubroEmplea"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoRubroEmpleaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoRubroEmpleaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoRubroEmplea"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Rubros");		
		parameters.put("busquedapor", TipoRubroEmpleaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(RubroEmplea.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoRubroEmpleaLogic tiporubroempleaLogicAuxiliar=new TipoRubroEmpleaLogic();
					tiporubroempleaLogicAuxiliar.setDatosCliente(tiporubroempleaLogic.getDatosCliente());				
					tiporubroempleaLogicAuxiliar.setTipoRubroEmpleas(tiporubroempleasParaReportes);
					
					tiporubroempleaLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoRubroEmpleaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tiporubroempleasParaReportes=tiporubroempleaLogicAuxiliar.getTipoRubroEmpleas();
					
					//tiporubroempleaLogic.getNewConnexionToDeep();
					
					//for (TipoRubroEmplea tiporubroemplea:tiporubroempleasParaReportes) {
					//	tiporubroempleaLogic.deepLoad(tiporubroemplea, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tiporubroempleaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tiporubroempleaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileRubroEmplea = AuxiliarReportes.class.getResourceAsStream("RubroEmpleaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_rubroemplea", reportFileRubroEmplea);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoRubroEmplea=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoRubroEmpleaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoRubroEmpleaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoRubroEmplea=new JRBeanArrayDataSource(TipoRubroEmpleaJInternalFrame.TraerTipoRubroEmpleaBeans(tiporubroempleasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoRubroEmplea);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoRubroEmpleaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoRubroEmpleaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoRubroEmpleaBean.TraerTipoRubroEmpleaBeans(tiporubroempleasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoRubroEmpleas(sAccionBusqueda,sTipoArchivoReporte,tiporubroempleasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoRubroEmpleas(sAccionBusqueda,sTipoArchivoReporte,tiporubroempleasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoRubroEmpleaActionPerformed(null);
					//this.generarExcelReporteTipoRubroEmpleas(sAccionBusqueda,sTipoArchivoReporte,tiporubroempleasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoRubroEmpleas(sAccionBusqueda,sTipoArchivoReporte,tiporubroempleasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoRubroEmpleas(sAccionBusqueda,sTipoArchivoReporte,tiporubroempleasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoRubroEmpleas(sAccionBusqueda,sTipoArchivoReporte,tiporubroempleasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoRubroEmpleas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRubroEmplea> tiporubroempleasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporubroemplea";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRubroEmpleas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRubroEmplea("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoRubroEmplea tiporubroemplea : tiporubroempleasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoRubroEmpleaConstantesFunciones.generarExcelReporteDataTipoRubroEmplea("NORMAL",row,workbook,tiporubroemplea,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rubro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoRubroEmplea(String sTipo,Row row,Workbook workbook) {
		
		TipoRubroEmpleaConstantesFunciones.generarExcelReporteHeaderTipoRubroEmplea(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoRubroEmpleas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRubroEmplea> tiporubroempleasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporubroemplea_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRubroEmpleas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoRubroEmplea tiporubroemplea : tiporubroempleasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoRubroEmpleaConstantesFunciones.getTipoRubroEmpleaDescripcion(tiporubroemplea));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRubroEmpleaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRubroEmpleaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporubroemplea.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRubroEmpleaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRubroEmpleaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporubroemplea.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rubro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoRubroEmpleas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRubroEmplea> tiporubroempleasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoRubroEmplea> tiporubroempleasRespaldo=null;
		
		classes=TipoRubroEmpleaConstantesFunciones.getClassesRelationshipsOfTipoRubroEmplea(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tiporubroempleaLogic.setDatosCliente(this.datosCliente);
		this.tiporubroempleaLogic.setDatosDeep(this.datosDeep);
		this.tiporubroempleaLogic.setIsConDeep(true);
		
		tiporubroempleasRespaldo=this.tiporubroempleaLogic.getTipoRubroEmpleas();
		
		this.tiporubroempleaLogic.setTipoRubroEmpleas(tiporubroempleasParaReportes);	
		this.tiporubroempleaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tiporubroempleasParaReportes=this.tiporubroempleaLogic.getTipoRubroEmpleas();
		this.tiporubroempleaLogic.setTipoRubroEmpleas(tiporubroempleasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporubroemplea_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRubroEmpleas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRubroEmplea("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoRubroEmplea tiporubroemplea : tiporubroempleasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoRubroEmplea("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoRubroEmpleaConstantesFunciones.generarExcelReporteDataTipoRubroEmplea("NORMAL",row,workbook,tiporubroemplea,cellStyleDataAux);
		
			
			


				//RubroEmplea
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(RubroEmpleaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tiporubroemplea.getRubroEmpleas()!=null && tiporubroemplea.getRubroEmpleas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(RubroEmpleaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					RubroEmpleaConstantesFunciones.generarExcelReporteHeaderRubroEmplea("RELACIONADO",row,workbook);
				}

				if(tiporubroemplea.getRubroEmpleas()!=null) {
					i2=0;
					for(RubroEmplea rubroemplea : tiporubroemplea.getRubroEmpleas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						RubroEmpleaConstantesFunciones.generarExcelReporteDataRubroEmplea("RELACIONADO",row,workbook,rubroemplea,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoRubroEmpleaConstantesFunciones.getTipoRubroEmpleaDescripcion(tiporubroemplea));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rubro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoRubroEmplea() throws Exception {		
		this.startProcessTipoRubroEmplea(true);
	}
	
	public void startProcessTipoRubroEmplea(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoRubroEmplea, this.jScrollPanelDatosTipoRubroEmplea,this.jPanelPaginacionTipoRubroEmplea, this.jScrollPanelDatosEdicionTipoRubroEmplea, this.jPanelAccionesTipoRubroEmplea,this.jPanelAccionesFormularioTipoRubroEmplea,this.jmenuBarTipoRubroEmplea,this.jmenuBarDetalleTipoRubroEmplea,this.jTtoolBarTipoRubroEmplea,this.jTtoolBarDetalleTipoRubroEmplea);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRubroEmplea=null; 
		
		final JPanel jPanelParametrosReportesTipoRubroEmplea=this.jPanelParametrosReportesTipoRubroEmplea;
		//final JScrollPane jScrollPanelDatosTipoRubroEmplea=this.jScrollPanelDatosTipoRubroEmplea;
		final JTable jTableDatosTipoRubroEmplea=this.jTableDatosTipoRubroEmplea;		
		final JPanel jPanelPaginacionTipoRubroEmplea=this.jPanelPaginacionTipoRubroEmplea;
		//final JScrollPane jScrollPanelDatosEdicionTipoRubroEmplea=this.jScrollPanelDatosEdicionTipoRubroEmplea;
		final JPanel jPanelAccionesTipoRubroEmplea=this.jPanelAccionesTipoRubroEmplea;
		
		JPanel jPanelCamposAuxiliarTipoRubroEmplea=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoRubroEmplea=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) {
			jPanelCamposAuxiliarTipoRubroEmplea=this.jInternalFrameDetalleFormTipoRubroEmplea.jPanelCamposTipoRubroEmplea;
			jPanelAccionesFormularioAuxiliarTipoRubroEmplea=this.jInternalFrameDetalleFormTipoRubroEmplea.jPanelAccionesFormularioTipoRubroEmplea;
		}
		
		final JPanel jPanelCamposTipoRubroEmplea=jPanelCamposAuxiliarTipoRubroEmplea;
		final JPanel jPanelAccionesFormularioTipoRubroEmplea=jPanelAccionesFormularioAuxiliarTipoRubroEmplea;
		
		
		final JMenuBar jmenuBarTipoRubroEmplea=this.jmenuBarTipoRubroEmplea;
		final JToolBar jTtoolBarTipoRubroEmplea=this.jTtoolBarTipoRubroEmplea;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoRubroEmplea=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRubroEmplea=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) {
			jmenuBarDetalleAuxiliarTipoRubroEmplea=this.jInternalFrameDetalleFormTipoRubroEmplea.jmenuBarDetalleTipoRubroEmplea;
			jTtoolBarDetalleAuxiliarTipoRubroEmplea=this.jInternalFrameDetalleFormTipoRubroEmplea.jTtoolBarDetalleTipoRubroEmplea;
		}
		
		final JMenuBar jmenuBarDetalleTipoRubroEmplea=jmenuBarDetalleAuxiliarTipoRubroEmplea;
		final JToolBar jTtoolBarDetalleTipoRubroEmplea=jTtoolBarDetalleAuxiliarTipoRubroEmplea;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRubroEmplea;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRubroEmplea;
			processRunnable.jTableDatos=jTableDatosTipoRubroEmplea;
			processRunnable.jPanelCampos=jPanelCamposTipoRubroEmplea;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRubroEmplea;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRubroEmplea;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRubroEmplea;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRubroEmplea;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRubroEmplea;
			processRunnable.jTtoolBar=jTtoolBarTipoRubroEmplea;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRubroEmplea;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoRubroEmplea ,jPanelParametrosReportesTipoRubroEmplea,jTableDatosTipoRubroEmplea, /*jScrollPanelDatosTipoRubroEmplea,*/jPanelCamposTipoRubroEmplea,jPanelPaginacionTipoRubroEmplea, /*jScrollPanelDatosEdicionTipoRubroEmplea,*/ jPanelAccionesTipoRubroEmplea,jPanelAccionesFormularioTipoRubroEmplea,jmenuBarTipoRubroEmplea,jmenuBarDetalleTipoRubroEmplea,jTtoolBarTipoRubroEmplea,jTtoolBarDetalleTipoRubroEmplea);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoRubroEmplea, jScrollPanelDatosTipoRubroEmplea,jPanelPaginacionTipoRubroEmplea, jScrollPanelDatosEdicionTipoRubroEmplea, jPanelAccionesTipoRubroEmplea,jPanelAccionesFormularioTipoRubroEmplea,jmenuBarTipoRubroEmplea,jmenuBarDetalleTipoRubroEmplea,jTtoolBarTipoRubroEmplea,jTtoolBarDetalleTipoRubroEmplea);
						
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
	
	public void finishProcessTipoRubroEmplea() {// throws Exception 
		this.finishProcessTipoRubroEmplea(true);
	}
	
	public void finishProcessTipoRubroEmplea(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoRubroEmplea, this.jScrollPanelDatosTipoRubroEmplea,this.jPanelPaginacionTipoRubroEmplea, this.jScrollPanelDatosEdicionTipoRubroEmplea, this.jPanelAccionesTipoRubroEmplea,this.jPanelAccionesFormularioTipoRubroEmplea,this.jmenuBarTipoRubroEmplea,this.jmenuBarDetalleTipoRubroEmplea,this.jTtoolBarTipoRubroEmplea,this.jTtoolBarDetalleTipoRubroEmplea);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRubroEmplea=null; 
		
		final JPanel jPanelParametrosReportesTipoRubroEmplea=this.jPanelParametrosReportesTipoRubroEmplea;
		//final JScrollPane jScrollPanelDatosTipoRubroEmplea=this.jScrollPanelDatosTipoRubroEmplea;
		final JTable jTableDatosTipoRubroEmplea=this.jTableDatosTipoRubroEmplea;		
		final JPanel jPanelPaginacionTipoRubroEmplea=this.jPanelPaginacionTipoRubroEmplea;
		//final JScrollPane jScrollPanelDatosEdicionTipoRubroEmplea=this.jScrollPanelDatosEdicionTipoRubroEmplea;
		final JPanel jPanelAccionesTipoRubroEmplea=this.jPanelAccionesTipoRubroEmplea;
		
		JPanel jPanelCamposAuxiliarTipoRubroEmplea=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoRubroEmplea=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) {
			jPanelCamposAuxiliarTipoRubroEmplea=this.jInternalFrameDetalleFormTipoRubroEmplea.jPanelCamposTipoRubroEmplea;
			jPanelAccionesFormularioAuxiliarTipoRubroEmplea=this.jInternalFrameDetalleFormTipoRubroEmplea.jPanelAccionesFormularioTipoRubroEmplea;
		}
		
		final JPanel jPanelCamposTipoRubroEmplea=jPanelCamposAuxiliarTipoRubroEmplea;
		final JPanel jPanelAccionesFormularioTipoRubroEmplea=jPanelAccionesFormularioAuxiliarTipoRubroEmplea;
		
		
		final JMenuBar jmenuBarTipoRubroEmplea=this.jmenuBarTipoRubroEmplea;		
		final JToolBar jTtoolBarTipoRubroEmplea=this.jTtoolBarTipoRubroEmplea;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoRubroEmplea=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRubroEmplea=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) {
			jmenuBarDetalleAuxiliarTipoRubroEmplea=this.jInternalFrameDetalleFormTipoRubroEmplea.jmenuBarDetalleTipoRubroEmplea;
			jTtoolBarDetalleAuxiliarTipoRubroEmplea=this.jInternalFrameDetalleFormTipoRubroEmplea.jTtoolBarDetalleTipoRubroEmplea;		
		}
		
		final JMenuBar jmenuBarDetalleTipoRubroEmplea=jmenuBarDetalleAuxiliarTipoRubroEmplea;
		final JToolBar jTtoolBarDetalleTipoRubroEmplea=jTtoolBarDetalleAuxiliarTipoRubroEmplea;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRubroEmplea;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRubroEmplea;
			processRunnable.jTableDatos=jTableDatosTipoRubroEmplea;
			processRunnable.jPanelCampos=jPanelCamposTipoRubroEmplea;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRubroEmplea;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRubroEmplea;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRubroEmplea;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRubroEmplea;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRubroEmplea;
			processRunnable.jTtoolBar=jTtoolBarTipoRubroEmplea;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRubroEmplea;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoRubroEmplea ,jPanelParametrosReportesTipoRubroEmplea, jTableDatosTipoRubroEmplea,/*jScrollPanelDatosTipoRubroEmplea,*/jPanelCamposTipoRubroEmplea,jPanelPaginacionTipoRubroEmplea, /*jScrollPanelDatosEdicionTipoRubroEmplea,*/ jPanelAccionesTipoRubroEmplea,jPanelAccionesFormularioTipoRubroEmplea,jmenuBarTipoRubroEmplea,jmenuBarDetalleTipoRubroEmplea,jTtoolBarTipoRubroEmplea,jTtoolBarDetalleTipoRubroEmplea));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoRubroEmplea(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoRubroEmplea(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoRubroEmplea(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoRubroEmplea(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoRubroEmplea,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoRubroEmplea,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoRubroEmplea(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoRubroEmplea,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoRubroEmplea,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tiporubroempleaConstantesFunciones.getsFinalQueryTipoRubroEmplea();
		String  finalQueryPaginacionTodos=this.tiporubroempleaConstantesFunciones.getsFinalQueryTipoRubroEmplea();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoRubroEmpleaConstantesFunciones.getArrayColumnasGlobalesNoTipoRubroEmplea(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoRubroEmpleaConstantesFunciones.getArrayColumnasGlobalesTipoRubroEmplea(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoRubroEmpleaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tiporubroempleasEliminados= new ArrayList<TipoRubroEmplea>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoRubroEmplea();
		
				///*TipoRubroEmpleaSessionBean*/this.tiporubroempleaSessionBean=new TipoRubroEmpleaSessionBean();
			
			if(this.tiporubroempleaSessionBean==null) {
				this.tiporubroempleaSessionBean=new TipoRubroEmpleaSessionBean();
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
					this.iNumeroPaginacion=TipoRubroEmpleaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoRubroEmpleaConstantesFunciones.getClassesForeignKeysOfTipoRubroEmplea(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tiporubroemplea."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tiporubroempleasAux= new ArrayList<TipoRubroEmplea>();
			
				
			tiporubroempleaLogic.setDatosCliente(this.datosCliente);
			tiporubroempleaLogic.setDatosDeep(this.datosDeep);
			tiporubroempleaLogic.setIsConDeep(true);
			
			
			tiporubroempleaLogic.getTipoRubroEmpleaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tiporubroempleaLogic.getTodosTipoRubroEmpleas(finalQueryGlobal,pagination);
					
					//tiporubroempleaLogic.getTodosTipoRubroEmpleasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tiporubroempleaLogic.getTipoRubroEmpleas()==null|| tiporubroempleaLogic.getTipoRubroEmpleas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporubroempleasAux= new ArrayList<TipoRubroEmplea>();
							tiporubroempleasAux.addAll(tiporubroempleaLogic.getTipoRubroEmpleas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporubroempleasAux= new ArrayList<TipoRubroEmplea>();
							tiporubroempleasAux.addAll(tiporubroempleas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporubroempleaLogic.getTodosTipoRubroEmpleas(finalQueryGlobal+"",this.pagination);												
							
							//tiporubroempleaLogic.getTodosTipoRubroEmpleasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoRubroEmpleas("Todos",tiporubroempleaLogic.getTipoRubroEmpleas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporubroempleaLogic.setTipoRubroEmpleas(new ArrayList<TipoRubroEmplea>());					
							tiporubroempleaLogic.getTipoRubroEmpleas().addAll(tiporubroempleasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporubroempleas=new ArrayList<TipoRubroEmplea>();
							tiporubroempleas.addAll(tiporubroempleasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoRubroEmplea=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoRubroEmplea=this.idActual;
				
				} else if(this.idTipoRubroEmpleaActual!=null && this.idTipoRubroEmpleaActual!=0L) {
					idTipoRubroEmplea=idTipoRubroEmpleaActual;
				}
				
					
				this.sDetalleReporte=TipoRubroEmpleaConstantesFunciones.getDetalleIndicePorId(idTipoRubroEmplea);
				
				this.tiporubroempleas=new ArrayList<TipoRubroEmplea>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tiporubroempleaLogic.getEntity(idTipoRubroEmplea);
					
					//tiporubroempleaLogic.getEntityWithConnection(idTipoRubroEmplea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporubroempleaLogic.setTipoRubroEmpleas(new ArrayList<TipoRubroEmplea>());
					tiporubroempleaLogic.getTipoRubroEmpleas().add(tiporubroempleaLogic.getTipoRubroEmplea());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporubroempleas=new ArrayList<TipoRubroEmplea>();
					this.tiporubroempleas.add(tiporubroemplea);
				}
				
				if(tiporubroempleaLogic.getTipoRubroEmplea()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoRubroEmplea();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoRubroEmplea();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporubroempleaLogic.getTipoRubroEmpleas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporubroempleas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporubroempleaLogic.getTipoRubroEmpleas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporubroempleas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoRubroEmplea tiporubroemplea) {
		Boolean permite=true;
		
		if(this.tiporubroemplea.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoRubroEmpleaConstantesFunciones.getOrderByListaTipoRubroEmplea();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoRubroEmpleaConstantesFunciones.getOrderByListaTipoRubroEmplea();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRubroEmplea tiporubroemplea:tiporubroempleaLogic.getTipoRubroEmpleas()) {
				if(tiporubroemplea.getsType().equals(Constantes2.S_TOTALES)) {
					tiporubroempleaTotales=tiporubroemplea;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRubroEmplea tiporubroemplea:this.tiporubroempleas) {
				if(tiporubroemplea.getsType().equals(Constantes2.S_TOTALES)) {
					tiporubroempleaTotales=tiporubroemplea;
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
			this.tiporubroempleaAux=new TipoRubroEmplea();
			this.tiporubroempleaAux.setsType(Constantes2.S_TOTALES);
			this.tiporubroempleaAux.setIsNew(false);
			this.tiporubroempleaAux.setIsChanged(false);
			this.tiporubroempleaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoRubroEmpleaConstantesFunciones.TotalizarValoresFilaTipoRubroEmplea(this.tiporubroempleaLogic.getTipoRubroEmpleas(),this.tiporubroempleaAux);
				
				this.tiporubroempleaLogic.getTipoRubroEmpleas().add(this.tiporubroempleaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoRubroEmpleaConstantesFunciones.TotalizarValoresFilaTipoRubroEmplea(this.tiporubroempleas,this.tiporubroempleaAux);
				
				this.tiporubroempleas.add(this.tiporubroempleaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tiporubroempleaTotales=new TipoRubroEmplea();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporubroempleaLogic.getTipoRubroEmpleas().remove(tiporubroempleaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporubroempleas.remove(tiporubroempleaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tiporubroempleaTotales=new TipoRubroEmplea();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRubroEmplea tiporubroemplea:tiporubroempleaLogic.getTipoRubroEmpleas()) {
				if(tiporubroemplea.getsType().equals(Constantes2.S_TOTALES)) {
					tiporubroempleaTotales=tiporubroemplea;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRubroEmpleaConstantesFunciones.TotalizarValoresFilaTipoRubroEmplea(this.tiporubroempleaLogic.getTipoRubroEmpleas(),tiporubroempleaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRubroEmplea tiporubroemplea:this.tiporubroempleas) {
				if(tiporubroemplea.getsType().equals(Constantes2.S_TOTALES)) {
					tiporubroempleaTotales=tiporubroemplea;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRubroEmpleaConstantesFunciones.TotalizarValoresFilaTipoRubroEmplea(this.tiporubroempleas,tiporubroempleaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoRubroEmplea() {
		this.isPermisoTodoTipoRubroEmplea=false;
		this.isPermisoNuevoTipoRubroEmplea=false;
		this.isPermisoActualizarTipoRubroEmplea=false;
		this.isPermisoActualizarOriginalTipoRubroEmplea=false;
		this.isPermisoEliminarTipoRubroEmplea=false;
		this.isPermisoGuardarCambiosTipoRubroEmplea=false;
		this.isPermisoConsultaTipoRubroEmplea=false;
		this.isPermisoBusquedaTipoRubroEmplea=false;
		this.isPermisoReporteTipoRubroEmplea=false;		
		this.isPermisoOrdenTipoRubroEmplea=false;		
		this.isPermisoPaginacionMedioTipoRubroEmplea=false;		
		this.isPermisoPaginacionAltoTipoRubroEmplea=false;
		this.isPermisoPaginacionTodoTipoRubroEmplea=false;
		this.isPermisoCopiarTipoRubroEmplea=false;		
		this.isPermisoVerFormTipoRubroEmplea=false;		
		this.isPermisoDuplicarTipoRubroEmplea=false;		
		this.isPermisoOrdenTipoRubroEmplea=false;		
	}
	
	public void setPermisosUsuarioTipoRubroEmplea(Boolean isPermiso) {
		this.isPermisoTodoTipoRubroEmplea=isPermiso;
		this.isPermisoNuevoTipoRubroEmplea=isPermiso;
		this.isPermisoActualizarTipoRubroEmplea=isPermiso;
		this.isPermisoActualizarOriginalTipoRubroEmplea=isPermiso;
		this.isPermisoEliminarTipoRubroEmplea=isPermiso;
		this.isPermisoGuardarCambiosTipoRubroEmplea=isPermiso;
		this.isPermisoConsultaTipoRubroEmplea=isPermiso;
		this.isPermisoBusquedaTipoRubroEmplea=isPermiso;
		this.isPermisoReporteTipoRubroEmplea=isPermiso;
		this.isPermisoOrdenTipoRubroEmplea=isPermiso;		
		this.isPermisoPaginacionMedioTipoRubroEmplea=isPermiso;		
		this.isPermisoPaginacionAltoTipoRubroEmplea=isPermiso;		
		this.isPermisoPaginacionTodoTipoRubroEmplea=isPermiso;		
		this.isPermisoCopiarTipoRubroEmplea=isPermiso;		
		this.isPermisoVerFormTipoRubroEmplea=isPermiso;		
		this.isPermisoDuplicarTipoRubroEmplea=isPermiso;
		this.isPermisoOrdenTipoRubroEmplea=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoRubroEmplea(Boolean isPermiso) {
		//this.isPermisoTodoTipoRubroEmplea=isPermiso;
		this.isPermisoNuevoTipoRubroEmplea=isPermiso;
		this.isPermisoActualizarTipoRubroEmplea=isPermiso;
		this.isPermisoActualizarOriginalTipoRubroEmplea=isPermiso;
		this.isPermisoEliminarTipoRubroEmplea=isPermiso;
		this.isPermisoGuardarCambiosTipoRubroEmplea=isPermiso;
		//this.isPermisoConsultaTipoRubroEmplea=isPermiso;
		//this.isPermisoBusquedaTipoRubroEmplea=isPermiso;
		//this.isPermisoReporteTipoRubroEmplea=isPermiso;
		//this.isPermisoOrdenTipoRubroEmplea=isPermiso;		
		//this.isPermisoPaginacionMedioTipoRubroEmplea=isPermiso;		
		//this.isPermisoPaginacionAltoTipoRubroEmplea=isPermiso;		
		//this.isPermisoPaginacionTodoTipoRubroEmplea=isPermiso;		
		//this.isPermisoCopiarTipoRubroEmplea=isPermiso;		
		//this.isPermisoDuplicarTipoRubroEmplea=isPermiso;
		//this.isPermisoOrdenTipoRubroEmplea=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoRubroEmpleaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(RubroEmpleaConstantesFunciones.SNOMBREOPCION);
		
		if(TipoRubroEmpleaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosRubroEmplea=false;
		this.isTienePermisosRubroEmplea=this.verificarGetPermisosUsuarioOpcionTipoRubroEmpleaClaseRelacionada(this.opcionsRelacionadas,RubroEmpleaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoRubroEmplea(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoRubroEmpleaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosRubroEmplea=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoRubroEmpleaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoRubroEmpleaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoRubroEmpleaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosRubroEmplea && this.jInternalFrameDetalleFormTipoRubroEmplea!=null && this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoRubroEmplea.jTabbedPaneRelacionesTipoRubroEmplea.remove(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoRubroEmplea() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoRubroEmpleaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoRubroEmpleaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoRubroEmplea=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoRubroEmplea=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoRubroEmplea=this.isPermisoActualizarTipoRubroEmplea;
			this.isPermisoEliminarTipoRubroEmplea=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoRubroEmplea=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoRubroEmplea=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoRubroEmplea=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoRubroEmplea=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoRubroEmplea=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRubroEmplea=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoRubroEmplea=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoRubroEmplea=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoRubroEmplea=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoRubroEmplea=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoRubroEmplea=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoRubroEmplea=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRubroEmplea=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoRubroEmplea.setToolTipText(this.jTableDatosTipoRubroEmplea.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoRubroEmplea(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoRubroEmplea(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoRubroEmpleaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoRubroEmpleaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoRubroEmplea() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosRubroEmplea && this.tiporubroempleaConstantesFunciones.mostrarRubroEmpleaTipoRubroEmplea && !TipoRubroEmpleaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Rubro Emplea");
			reporte.setsDescripcion("Rubro Emplea");
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
	
		
	public void inicializarCombosForeignKeyTipoRubroEmpleaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoRubroEmpleaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoRubroEmpleaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoRubroEmpleaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoRubroEmpleaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoRubroEmplea()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoRubroEmplea()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoRubroEmplea(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoRubroEmplea()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRubroEmplea();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoRubroEmplea(TipoRubroEmplea tiporubroemplea)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoRubroEmplea(TipoRubroEmplea tiporubroemplea,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoRubroEmplea()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRubroEmplea()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoRubroEmplea()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoRubroEmplea()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoRubroEmplea()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoRubroEmplea()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoRubroEmplea(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoRubroEmplea()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoRubroEmpleaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoRubroEmpleaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoRubroEmpleaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tiporubroempleaSessionBean=new TipoRubroEmpleaSessionBean(); 
		this.tiporubroempleaConstantesFunciones=new TipoRubroEmpleaConstantesFunciones(); 
		this.tiporubroempleaBean=new TipoRubroEmplea();//(this.tiporubroempleaConstantesFunciones); 		
		this.tiporubroempleaReturnGeneral=new TipoRubroEmpleaParameterReturnGeneral(); 
		
		this.tiporubroempleaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporubroempleaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoRubroEmpleaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoRubroEmpleaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoRubroEmpleaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoRubroEmplea(true);
			
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
			
			this.tiporubroempleaConstantesFunciones=new TipoRubroEmpleaConstantesFunciones(); 
			this.tiporubroempleaBean=new TipoRubroEmplea();//this.tiporubroempleaConstantesFunciones); 			
			this.tiporubroempleaReturnGeneral=new TipoRubroEmpleaParameterReturnGeneral(); 
		
			TipoRubroEmpleaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Rubro Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tiporubroemplea=new TipoRubroEmplea();
			this.tiporubroempleas = new ArrayList<TipoRubroEmplea>();
			this.tiporubroempleasAux = new ArrayList<TipoRubroEmplea>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic=new TipoRubroEmpleaLogic();
				this.tiporubroempleaLogic.getNewConnexionToDeep("");
			}
			
			//this.tiporubroempleaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tiporubroempleaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoRubroEmplea);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoRubroEmplea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRubroEmplea);	
					}
					
					if(this.jInternalFrameImportacionTipoRubroEmplea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRubroEmplea);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoRubroEmplea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoRubroEmplea);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRubroEmplea);
				this.jInternalFrameDetalleFormTipoRubroEmplea.setVisible(false);
				this.jInternalFrameDetalleFormTipoRubroEmplea.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoRubroEmplea!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRubroEmplea);
					this.jInternalFrameReporteDinamicoTipoRubroEmplea.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoRubroEmplea.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoRubroEmplea!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoRubroEmplea);
					this.jInternalFrameImportacionTipoRubroEmplea.setVisible(false);
					this.jInternalFrameImportacionTipoRubroEmplea.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoRubroEmplea!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoRubroEmplea);
					this.jInternalFrameOrderByTipoRubroEmplea.setVisible(false);
					this.jInternalFrameOrderByTipoRubroEmplea.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoRubroEmpleaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoRubroEmpleaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tiporubroempleaReturnGeneral=new TipoRubroEmpleaParameterReturnGeneral();
			
			this.tiporubroempleaParameterGeneral=new TipoRubroEmpleaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tiporubroempleaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoRubroEmpleaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(RubroEmpleaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRubroEmpleaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporubroempleaSessionBean.getEsGuardarRelacionado(),this.tiporubroempleaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRubroEmpleaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporubroempleaSessionBean.getEsGuardarRelacionado(),this.tiporubroempleaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoRubroEmplea=false;
			this.isVisibilidadCeldaDuplicarTipoRubroEmplea=true;
			this.isVisibilidadCeldaCopiarTipoRubroEmplea=true;
			this.isVisibilidadCeldaVerFormTipoRubroEmplea=true;
			this.isVisibilidadCeldaOrdenTipoRubroEmplea=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRubroEmplea=false;
			this.isVisibilidadCeldaModificarTipoRubroEmplea=false;
			this.isVisibilidadCeldaActualizarTipoRubroEmplea=false;
			this.isVisibilidadCeldaEliminarTipoRubroEmplea=false;
			this.isVisibilidadCeldaCancelarTipoRubroEmplea=false;
			this.isVisibilidadCeldaGuardarTipoRubroEmplea=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRubroEmplea=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoRubroEmplea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoRubroEmplea();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoRubroEmplea(false);
			
			this.setPermisosUsuarioTipoRubroEmplea();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado() 
				|| (this.tiporubroempleaSessionBean.getEsGuardarRelacionado() && this.tiporubroempleaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoRubroEmpleaClasesRelacionadas();
			}
			
			if(this.tiporubroempleaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoRubroEmpleaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoRubroEmplea();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoRubroEmplea();
			}
			
			if(!this.isPermisoBusquedaTipoRubroEmplea) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoRubroEmplea,this.isPermisoPaginacionMedioTipoRubroEmplea,this.isPermisoPaginacionTodoTipoRubroEmplea);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoRubroEmpleaConstantesFunciones.getTiposSeleccionarTipoRubroEmplea());
				
				this.tiposColumnasSelect=TipoRubroEmpleaConstantesFunciones.getTiposSeleccionarTipoRubroEmplea(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoRubroEmplea();				
				//this.tiposRelacionesSelect=TipoRubroEmpleaConstantesFunciones.getTiposRelacionesTipoRubroEmplea(true);
				
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
			//if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoRubroEmplea();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoRubroEmplea(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoRubroEmplea(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRubroEmplea() ;
			
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
			
			
			this.rubroempleaLogic=new RubroEmpleaLogic(); 
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
				tiporubroempleaImplementable= (TipoRubroEmpleaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRubroEmpleaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tiporubroempleaImplementableHome= (TipoRubroEmpleaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRubroEmpleaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tiporubroempleas= new ArrayList<TipoRubroEmplea>();
			this.tiporubroempleasEliminados= new ArrayList<TipoRubroEmplea>();
						
			this.isEsNuevoTipoRubroEmplea=false;
			this.esParaAccionDesdeFormularioTipoRubroEmplea=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoRubroEmplea(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoRubroEmplea();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoRubroEmpleaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoRubroEmpleaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoRubroEmplea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoRubroEmplea(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoRubroEmplea();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoRubroEmplea();
			}
			
			TipoRubroEmpleaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoRubroEmplea(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoRubroEmplea: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoRubroEmplea() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(RubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(RubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoRubroEmplea")) {
				iIndex=this.jInternalFrameDetalleFormTipoRubroEmplea.jTabbedPaneRelacionesTipoRubroEmplea.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoRubroEmplea.jTabbedPaneRelacionesTipoRubroEmplea.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoRubroEmplea.getSelectedRow();	
				
				

				if(sTitle.equals("Rubro Empleas")) {
					if(!RubroEmpleaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoRubroEmplea();

						this.cargarParteTabPanelRelacionadaRubroEmplea(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoRubroEmplea();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaRubroEmplea(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoRubroEmplea.cargarSessionConBeanSwingJInternalFrameRubroEmplea(false,true,iIndex);
		this.jButtonRubroEmpleaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaRubroEmplea();

		//this.jTabbedPaneRelacionesTipoRubroEmplea.updateUI();
		//this.jTabbedPaneRelacionesTipoRubroEmplea.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoRubroEmplea.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("RubroEmplea")) {
				int row=this.jTableDatosTipoRubroEmplea.getSelectedRow();
				jButtonRubroEmpleaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Rubro Emplea")) {

					if(this.isTienePermisosRubroEmplea && this.tiporubroempleaConstantesFunciones.mostrarRubroEmpleaTipoRubroEmplea && !TipoRubroEmpleaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Rubro Empleas"+"("+RubroEmpleaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Rubro Empleas");

						if(tiporubroempleaConstantesFunciones.resaltarRubroEmpleaTipoRubroEmplea!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tiporubroempleaConstantesFunciones.resaltarRubroEmpleaTipoRubroEmplea);
						}

						jmenuItem.setEnabled(this.tiporubroempleaConstantesFunciones.activarRubroEmpleaTipoRubroEmplea);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"RubroEmplea"));

						

						this.jInternalFrameDetalleFormTipoRubroEmplea.jmenuDetalleTipoRubroEmplea.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoRubroEmplea(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoRubroEmplea(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoRubroEmplea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoRubroEmpleaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoRubroEmplea();
		
		this.cargarCombosFrameForeignKeyTipoRubroEmplea();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoRubroEmplea();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoRubroEmplea();
		}
	}
	
	
	
	public void jButtonNuevoTipoRubroEmpleaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tiporubroempleaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
			
			
			if(jTableDatosTipoRubroEmplea.getRowCount()>=1) {
				jTableDatosTipoRubroEmplea.removeRowSelectionInterval(0, jTableDatosTipoRubroEmplea.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoRubroEmplea=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoRubroEmplea(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoRubroEmplea(true);			
			//this.tiporubroemplea=new TipoRubroEmplea();
			//this.tiporubroemplea.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRubroEmplea(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRubroEmplea() ;
			
			if(TipoRubroEmpleaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRubroEmplea(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tiporubroemplea);	
			this.actualizarInformacion("INFO_PADRE",false,this.tiporubroemplea);				
			
			TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
			
			if(this.tiporubroempleaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoRubroEmplea: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoRubroEmpleaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoRubroEmplea> tiporubroempleasSeleccionados=new ArrayList<TipoRubroEmplea>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoRubroEmplea.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoRubroEmplea.getSelectedRows().length;			
			}
			
			tiporubroempleasSeleccionados=this.getTipoRubroEmpleasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoRubroEmplea--;			
				//TipoRubroEmplea tiporubroempleaAux= new TipoRubroEmplea();			
				//tiporubroempleaAux.setId(this.iIdNuevoTipoRubroEmplea);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoRubroEmplea tiporubroempleaOrigen=new TipoRubroEmplea();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoRubroEmplea tiporubroempleaOrigen : tiporubroempleasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoRubroEmplea.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tiporubroempleaOrigen =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporubroempleaOrigen =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoRubroEmplea();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tiporubroemplea.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoRubroEmplea(tiporubroempleaOrigen,this.tiporubroemplea,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRubroEmplea(this.tiporubroemplea);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporubroempleaLogic.getTipoRubroEmpleas().add(this.tiporubroempleaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporubroempleas.add(this.tiporubroempleaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoRubroEmplea(false);
				
				this.jTableDatosTipoRubroEmplea.setRowSelectionInterval(this.getIndiceNuevoTipoRubroEmplea(), this.getIndiceNuevoTipoRubroEmplea());
				
				int iLastRow =  this.jTableDatosTipoRubroEmplea.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRubroEmplea.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRubroEmplea.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRubroEmplea(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoRubroEmplea> tiporubroempleasSeleccionados=new ArrayList<TipoRubroEmplea>();									
		
			TipoRubroEmplea tiporubroempleaOrigen=new TipoRubroEmplea();
			TipoRubroEmplea tiporubroempleaDestino=new TipoRubroEmplea();
				
			tiporubroempleasSeleccionados=this.getTipoRubroEmpleasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoRubroEmplea.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tiporubroempleasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoRubroEmplea.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporubroempleaOrigen =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporubroempleaOrigen =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporubroempleaDestino =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporubroempleaDestino =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tiporubroempleaOrigen =tiporubroempleasSeleccionados.get(0);
				tiporubroempleaDestino =tiporubroempleasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoRubroEmplea(tiporubroempleaOrigen,tiporubroempleaDestino,true,false);
				
				tiporubroempleaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporubroempleaDestino,tiporubroempleaLogic.getTipoRubroEmpleas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporubroempleaDestino,tiporubroempleas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoRubroEmplea(false);
				
				//this.jTableDatosTipoRubroEmplea.setRowSelectionInterval(this.getIndiceNuevoTipoRubroEmplea(), this.getIndiceNuevoTipoRubroEmplea());
				
				int iLastRow =  this.jTableDatosTipoRubroEmplea.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRubroEmplea.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRubroEmplea.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRubroEmplea(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoRubroEmplea.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoRubroEmplea.isVisible();
			
			
			this.jPanelParametrosReportesTipoRubroEmplea.setVisible(!isVisible);
			this.jPanelPaginacionTipoRubroEmplea.setVisible(!isVisible);
			this.jPanelAccionesTipoRubroEmplea.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoRubroEmplea();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoRubroEmplea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoRubroEmplea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoRubroEmplea();
			
			this.abrirFrameOrderByTipoRubroEmplea();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoRubroEmplea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoRubroEmplea(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRubroEmplea);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoRubroEmplea.isMaximum()) {
					this.jInternalFrameDetalleFormTipoRubroEmplea.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoRubroEmplea.setSize(this.jInternalFrameDetalleFormTipoRubroEmplea.iWidthFormulario,this.jInternalFrameDetalleFormTipoRubroEmplea.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoRubroEmplea.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoRubroEmplea.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoRubroEmplea.isMaximum()) {
						this.jInternalFrameDetalleFormTipoRubroEmplea.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoRubroEmplea.jContentPaneDetalleTipoRubroEmplea.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoRubroEmplea.jTabbedPaneRelacionesTipoRubroEmplea.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoRubroEmplea.jContentPaneDetalleTipoRubroEmplea.getWidth(),TipoRubroEmpleaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRubroEmplea.jTabbedPaneRelacionesTipoRubroEmplea.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoRubroEmplea.jContentPaneDetalleTipoRubroEmplea.getWidth(),TipoRubroEmpleaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRubroEmplea.jTabbedPaneRelacionesTipoRubroEmplea.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoRubroEmplea.jContentPaneDetalleTipoRubroEmplea.getWidth(),TipoRubroEmpleaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(RubroEmpleaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaRubroEmplea();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoRubroEmplea.setVisible(true);
	        this.jInternalFrameDetalleFormTipoRubroEmplea.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoRubroEmplea() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoRubroEmplea==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoRubroEmplea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRubroEmplea,false,this);
				} else {
					this.jInternalFrameOrderByTipoRubroEmplea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRubroEmplea,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoRubroEmplea);
				this.jInternalFrameOrderByTipoRubroEmplea.setVisible(false);
				this.jInternalFrameOrderByTipoRubroEmplea.setSelected(false);
				
				this.jInternalFrameOrderByTipoRubroEmplea.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRubroEmplea"));
				
				this.inicializarActualizarBindingTablaOrderByTipoRubroEmplea();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoRubroEmplea() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoRubroEmplea==null) {
				
				this.jInternalFrameImportacionTipoRubroEmplea=new ImportacionJInternalFrame(TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRubroEmplea);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoRubroEmplea);
				this.jInternalFrameImportacionTipoRubroEmplea.setVisible(false);
				this.jInternalFrameImportacionTipoRubroEmplea.setSelected(false);


				this.jInternalFrameImportacionTipoRubroEmplea.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRubroEmplea"));
				this.jInternalFrameImportacionTipoRubroEmplea.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRubroEmplea"));
				this.jInternalFrameImportacionTipoRubroEmplea.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRubroEmplea"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoRubroEmplea() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoRubroEmplea==null) {
				this.jInternalFrameReporteDinamicoTipoRubroEmplea=new ReporteDinamicoJInternalFrame(TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRubroEmplea);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRubroEmplea);
				this.jInternalFrameReporteDinamicoTipoRubroEmplea.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoRubroEmplea.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRubroEmplea"));
				this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRubroEmplea"));
				this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRubroEmplea"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRubroEmplea();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaRubroEmplea() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.jScrollPanelDatosRubroEmplea.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoRubroEmplea.jContentPaneDetalleTipoRubroEmplea.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.jScrollPanelDatosRubroEmplea.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.jScrollPanelDatosRubroEmplea.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.jScrollPanelDatosRubroEmplea.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoRubroEmplea() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRubroEmplea);
			
	       	this.jInternalFrameDetalleFormTipoRubroEmplea.setVisible(false);
	        this.jInternalFrameDetalleFormTipoRubroEmplea.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoRubroEmplea.dispose();
			//this.jInternalFrameDetalleFormTipoRubroEmplea=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoRubroEmplea() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoRubroEmplea.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoRubroEmplea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoRubroEmplea() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoRubroEmplea.setVisible(true);
	        this.jInternalFrameImportacionTipoRubroEmplea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoRubroEmplea() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoRubroEmplea.setVisible(true);
	        this.jInternalFrameOrderByTipoRubroEmplea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoRubroEmplea() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoRubroEmplea.setVisible(false);
	        this.jInternalFrameOrderByTipoRubroEmplea.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoRubroEmplea() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoRubroEmplea.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoRubroEmplea.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoRubroEmplea() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoRubroEmplea.setVisible(false);
	        this.jInternalFrameImportacionTipoRubroEmplea.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoRubroEmplea(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoRubroEmplea(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRubroEmplea.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoRubroEmplea(true);
			//this.isEsNuevoTipoRubroEmplea=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoRubroEmplea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRubroEmplea(false) ;
			
			if(tiporubroempleaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleaSessionBean.getEsGuardarRelacionado() && RubroEmpleaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRubroEmpleaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoRubroEmpleaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRubroEmplea(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRubroEmplea(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoRubroEmpleaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoRubroEmplea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoRubroEmplea(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRubroEmplea.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoRubroEmplea(true);
			//this.isEsNuevoTipoRubroEmplea=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tiporubroemplea.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoRubroEmplea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoRubroEmplea(false) ;
			
			if(TipoRubroEmpleaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRubroEmplea(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRubroEmplea(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoRubroEmplea(false);
			
			//if(!this.isEsNuevoTipoRubroEmplea) {								
				int intSelectedRow = this.jTableDatosTipoRubroEmplea.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoRubroEmplea(this.tiporubroemplea,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRubroEmplea(this.tiporubroemplea);
				
			}
			
			if(this.permiteMantenimiento(this.tiporubroemplea)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoRubroEmplea=true;
					this.inicializarActualizarBindingTablaTipoRubroEmplea(false);
					this.isEsNuevoTipoRubroEmplea=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoRubroEmplea=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoRubroEmplea=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRubroEmplea(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRubroEmplea(false);
				
				this.habilitarDeshabilitarControlesTipoRubroEmplea(false);
			
												
				
				if(TipoRubroEmpleaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoRubroEmplea();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoRubroEmpleaActionPerformed(evt,tiporubroempleaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoRubroEmplea(this.tiporubroemplea,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoRubroEmplea.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tiporubroempleaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tiporubroemplea.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoRubroEmplea.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRubroEmplea.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoRubroEmplea.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				this.tiporubroemplea.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				this.tiporubroemplea.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tiporubroemplea)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoRubroEmpleaModel) this.jTableDatosTipoRubroEmplea.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoRubroEmplea=true;
				this.inicializarActualizarBindingTablaTipoRubroEmplea(false);
				this.isEsNuevoTipoRubroEmplea=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRubroEmplea(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRubroEmplea(false);
				
				this.habilitarDeshabilitarControlesTipoRubroEmplea(false);
				
				
				
				if(TipoRubroEmpleaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoRubroEmplea();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoRubroEmplea.getRowCount()>=1) {
				jTableDatosTipoRubroEmplea.removeRowSelectionInterval(0, jTableDatosTipoRubroEmplea.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoRubroEmplea(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoRubroEmplea(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRubroEmplea(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRubroEmplea(false) ;
			
			this.isEsNuevoTipoRubroEmplea=false;
			
			if(TipoRubroEmpleaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoRubroEmplea();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoRubroEmplea(false);
				
				//SI ES MANUAL
				if(TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoRubroEmplea();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoRubroEmplea--;			
			//TipoRubroEmplea tiporubroempleaAux= new TipoRubroEmplea();			
			//tiporubroempleaAux.setId(this.iIdNuevoTipoRubroEmplea);
			
			if(this.jInternalFrameDetalleFormTipoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoRubroEmplea();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoRubroEmplea(this.tiporubroemplea);
			
			this.tiporubroemplea.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tiporubroempleaLogic.getTipoRubroEmpleas().add(this.tiporubroempleaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tiporubroempleas.add(this.tiporubroempleaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoRubroEmplea(false);
			
			this.jTableDatosTipoRubroEmplea.setRowSelectionInterval(this.getIndiceNuevoTipoRubroEmplea(), this.getIndiceNuevoTipoRubroEmplea());
			
			int iLastRow =  this.jTableDatosTipoRubroEmplea.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoRubroEmplea.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoRubroEmplea.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoRubroEmplea(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoRubroEmplea(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRubroEmplea(false);
			
			//SI ES MANUAL
			if(TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRubroEmplea();
			}
			
			//this.abrirFrameTreeTipoRubroEmplea();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo RubroS ?", "MANTENIMIENTO DE Tipo Rubro", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoRubroEmplea.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoRubroEmplea();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tiporubroempleaReturnGeneral=tiporubroempleaLogic.procesarImportacionTipoRubroEmpleasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tiporubroempleaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoRubroEmpleaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoRubroEmplea.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoRubroEmplea.setFileImportacion(this.jInternalFrameImportacionTipoRubroEmplea.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoRubroEmplea.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoRubroEmplea.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoRubroEmplea.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoRubroEmplea.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoRubroEmplea> tiporubroempleasSeleccionados=new ArrayList<TipoRubroEmplea>();		

		tiporubroempleasSeleccionados=this.getTipoRubroEmpleasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoRubroEmpleaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoRubroEmpleaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoRubroEmpleas("Todos",tiporubroempleasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rubro",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRubroEmpleaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRubroEmpleaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoRubroEmpleaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoRubroEmpleaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoRubroEmpleaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoRubroEmpleaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRubroEmpleaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoRubroEmpleaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoRubroEmplea> tiporubroempleasSeleccionados=new ArrayList<TipoRubroEmplea>();		
		
		tiporubroempleasSeleccionados=this.getTipoRubroEmpleasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporubroemplea";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoRubroEmpleas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoRubroEmpleaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRubroEmpleaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoRubroEmplea tiporubroemplea:tiporubroempleasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporubroemplea.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRubroEmpleaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRubroEmpleaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoRubroEmplea tiporubroemplea:tiporubroempleasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporubroemplea.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoRubroEmplea(row);				
			//	iRow++;
			//}				
			
			//for(TipoRubroEmplea tiporubroempleaAux:tiporubroempleasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoRubroEmplea(tiporubroempleaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rubro",JOptionPane.INFORMATION_MESSAGE);
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
				this.tiporubroempleaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRubroEmplea(false);
			
			//SI ES MANUAL
			if(TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRubroEmplea();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRubroEmplea(false);
			
			//SI ES MANUAL
			if(TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRubroEmplea();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoRubroEmpleaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRubroEmplea(false);
			
			//SI ES MANUAL
			if(TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRubroEmplea();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporubroempleaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoRubroEmplea() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoRubroEmplea.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoRubroEmplea.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoRubroEmplea.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoRubroEmplea.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoRubroEmplea.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoRubroEmplea.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoRubroEmplea.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoRubroEmplea(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoRubroEmplea(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoRubroEmplea(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoRubroEmplea(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoRubroEmplea(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoRubroEmplea(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRubroEmplea(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoRubroEmplea(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoRubroEmplea() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoRubroEmplea();
		
		this.inicializarActualizarBindingBotonesManualTipoRubroEmplea(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRubroEmplea();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRubroEmplea() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRubroEmplea(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRubroEmplea(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoRubroEmplea.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoRubroEmplea.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoRubroEmplea.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoRubroEmplea.jCheckBoxPostAccionNuevoTipoRubroEmplea.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoRubroEmplea.jCheckBoxPostAccionSinCerrarTipoRubroEmplea.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoRubroEmplea.jCheckBoxPostAccionSinMensajeTipoRubroEmplea.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoRubroEmplea.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoRubroEmplea.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoRubroEmplea.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) {
				this.jInternalFrameDetalleFormTipoRubroEmplea.jCheckBoxPostAccionNuevoTipoRubroEmplea.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoRubroEmplea.jCheckBoxPostAccionSinCerrarTipoRubroEmplea.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoRubroEmplea.jCheckBoxPostAccionSinMensajeTipoRubroEmplea.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoRubroEmplea.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoRubroEmplea.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoRubroEmplea.jComboBoxTiposAccionesFormularioTipoRubroEmplea.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoRubroEmplea.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoRubroEmplea!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoRubroEmplea.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoRubroEmplea.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoRubroEmplea.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoRubroEmplea.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoRubroEmplea!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoRubroEmplea.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoRubroEmplea.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoRubroEmplea(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRubroEmplea(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoRubroEmplea() throws Exception {
		try	{
			if(TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRubroEmplea();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRubroEmplea() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoRubroEmplea.jComboBoxTiposAccionesFormularioTipoRubroEmplea.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoRubroEmplea.jComboBoxTiposAccionesFormularioTipoRubroEmplea.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRubroEmplea() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoRubroEmplea.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoRubroEmplea.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoRubroEmplea.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoRubroEmplea.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoRubroEmplea.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoRubroEmplea.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoRubroEmplea.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoRubroEmplea.addItem(reporte);
			}
			
			
			if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoRubroEmplea.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoRubroEmplea.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoRubroEmplea.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoRubroEmplea.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoRubroEmplea.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoRubroEmplea.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoRubroEmplea.jComboBoxTiposAccionesFormularioTipoRubroEmplea.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoRubroEmplea.jComboBoxTiposAccionesFormularioTipoRubroEmplea.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoRubroEmplea.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoRubroEmplea.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoRubroEmplea.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRubroEmplea();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRubroEmplea() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRubroEmplea!=null) {
				this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRubroEmplea!=null) {
				this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoRubroEmplea!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoRubroEmplea()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoRubroEmplea(Boolean esInicializar) throws Exception {				
		if(TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRubroEmplea();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoRubroEmplea() throws Exception {
		this.inicializarActualizarBindingTablaTipoRubroEmplea(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoRubroEmplea() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoRubroEmplea.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoRubroEmplea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRubroEmplea.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoRubroEmpleaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoRubroEmplea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRubroEmplea.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoRubroEmpleaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoRubroEmpleaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRubroEmpleaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoRubroEmpleaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoRubroEmplea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRubroEmplea.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoRubroEmpleaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoRubroEmplea.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoRubroEmplea(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tiporubroempleaLogic.getTipoRubroEmpleas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tiporubroempleas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoRubroEmplea.setModel(new TipoRubroEmpleaModel(this.tiporubroempleaLogic.getTipoRubroEmpleas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoRubroEmplea.setModel(new TipoRubroEmpleaModel(this.tiporubroempleas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoRubroEmplea!=null && this.jInternalFrameOrderByTipoRubroEmplea.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoRubroEmplea();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoRubroEmplea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRubroEmplea,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoRubroEmpleaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO,tiporubroempleaConstantesFunciones.resaltarSeleccionarTipoRubroEmplea,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO,tiporubroempleaConstantesFunciones.resaltarSeleccionarTipoRubroEmplea,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoRubroEmplea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRubroEmplea,TipoRubroEmpleaConstantesFunciones.LABEL_ID));

		if(this.tiporubroempleaConstantesFunciones.mostraridTipoRubroEmplea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRubroEmpleaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiporubroempleaConstantesFunciones.resaltaridTipoRubroEmplea,this.tiporubroempleaConstantesFunciones.activaridTipoRubroEmplea,this,true,"idTipoRubroEmplea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporubroempleaConstantesFunciones.resaltaridTipoRubroEmplea,this.tiporubroempleaConstantesFunciones.activaridTipoRubroEmplea,this,true,"idTipoRubroEmplea","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRubroEmplea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRubroEmplea,TipoRubroEmpleaConstantesFunciones.LABEL_CODIGO));

		if(this.tiporubroempleaConstantesFunciones.mostrarcodigoTipoRubroEmplea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRubroEmpleaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiporubroempleaConstantesFunciones.resaltarcodigoTipoRubroEmplea,this.tiporubroempleaConstantesFunciones.activarcodigoTipoRubroEmplea,this,true,"codigoTipoRubroEmplea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporubroempleaConstantesFunciones.resaltarcodigoTipoRubroEmplea,this.tiporubroempleaConstantesFunciones.activarcodigoTipoRubroEmplea,this,true,"codigoTipoRubroEmplea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRubroEmpleaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRubroEmplea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRubroEmplea,TipoRubroEmpleaConstantesFunciones.LABEL_NOMBRE));

		if(this.tiporubroempleaConstantesFunciones.mostrarnombreTipoRubroEmplea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRubroEmpleaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiporubroempleaConstantesFunciones.resaltarnombreTipoRubroEmplea,this.tiporubroempleaConstantesFunciones.activarnombreTipoRubroEmplea,this,true,"nombreTipoRubroEmplea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporubroempleaConstantesFunciones.resaltarnombreTipoRubroEmplea,this.tiporubroempleaConstantesFunciones.activarnombreTipoRubroEmplea,this,true,"nombreTipoRubroEmplea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRubroEmpleaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosRubroEmplea && this.tiporubroempleaConstantesFunciones.mostrarRubroEmpleaTipoRubroEmplea && !TipoRubroEmpleaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Rubro Empleas");
				tableColumn.setHeaderValue("Rubro Empleas");
				tableColumn.setCellRenderer(new RubroEmpleaTableCell(tiporubroempleaConstantesFunciones.resaltarRubroEmpleaTipoRubroEmplea,this,this.tiporubroempleaConstantesFunciones.activarRubroEmpleaTipoRubroEmplea));
				tableColumn.setCellEditor(new RubroEmpleaTableCell(tiporubroempleaConstantesFunciones.resaltarRubroEmpleaTipoRubroEmplea,this,this.tiporubroempleaConstantesFunciones.activarRubroEmpleaTipoRubroEmplea));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoRubroEmplea.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporubroempleaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporubroempleaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRubroEmplea.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporubroempleaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporubroempleaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRubroEmplea.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoRubroEmplea && this.isPermisoGuardarCambiosTipoRubroEmplea) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tiporubroempleaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tiporubroempleaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoRubroEmplea.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tiporubroempleaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoRubroEmplea.addColumn(tableColumn);
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
			
			this.jTableDatosTipoRubroEmplea.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRubroEmplea && this.isPermisoGuardarCambiosTipoRubroEmplea) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiporubroempleaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRubroEmplea && this.isPermisoGuardarCambiosTipoRubroEmplea) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoRubroEmplea.moveColumn(this.jTableDatosTipoRubroEmplea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoRubroEmplea.moveColumn(this.jTableDatosTipoRubroEmplea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiporubroempleaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoRubroEmplea.moveColumn(this.jTableDatosTipoRubroEmplea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoRubroEmplea.moveColumn(this.jTableDatosTipoRubroEmplea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoRubroEmplea.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoRubroEmplea.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoRubroEmplea,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoRubroEmplea.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoRubroEmplea.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoRubroEmplea.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoRubroEmplea.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoRubroEmplea.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tiporubroempleaLogic.getTipoRubroEmpleas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tiporubroempleas.size()-1;
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
		//this.jTableDatosTipoRubroEmplea.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoRubroEmplea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoRubroEmplea();
			
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
				
				//this.isEsNuevoTipoRubroEmplea=false;
					
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
			
				if(this.tiporubroempleaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoRubroEmplea==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRubroEmplea.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRubroEmplea.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tiporubroemplea.getsType().equals("DUPLICADO")
				   || this.tiporubroemplea.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoRubroEmplea=true;
				
				} else {
					this.isEsNuevoTipoRubroEmplea=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
					if(this.tiporubroemplea.getId()>=0 && !this.tiporubroemplea.getIsNew()) {						
						this.isEsNuevoTipoRubroEmplea=false;
						
					} else {
						this.isEsNuevoTipoRubroEmplea=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoRubroEmplea(esRelaciones);						
				
				this.seleccionarTipoRubroEmplea(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tiporubroemplea.getId()<0) {
					this.isEsNuevoTipoRubroEmplea=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoRubroEmplea(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoRubroEmplea(evt,rowIndex);
				}	
				
				if(this.tiporubroempleaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoRubroEmplea: " + this.dDif); 
					}
				}								
				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoRubroEmplea(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tiporubroemplea)) {
					if(this.tiporubroemplea.getId()>0) {
						this.tiporubroemplea.setIsDeleted(true);
						
						this.tiporubroempleasEliminados.add(this.tiporubroemplea);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporubroempleaLogic.getTipoRubroEmpleas().remove(this.tiporubroemplea);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporubroempleas.remove(this.tiporubroemplea);				
					}
					
					
					((TipoRubroEmpleaModel) this.jTableDatosTipoRubroEmplea.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRubroEmplea(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoRubroEmplea(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoRubroEmplea) {
			
			if(this.jInternalFrameDetalleFormTipoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRubroEmplea.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRubroEmplea.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoRubroEmplea(this.tiporubroemplea);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoRubroEmplea("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoRubroEmplea(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRubroEmplea() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRubroEmplea(TipoRubroEmplea tiporubroemplea) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoRubroEmplea(tiporubroemplea,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRubroEmplea(TipoRubroEmplea tiporubroemplea,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoRubroEmplea(tiporubroemplea);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoRubroEmplea(tiporubroemplea,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoRubroEmplea(tiporubroemplea);
	}
	
	public void setVariablesObjetoActualToFormularioTipoRubroEmplea(TipoRubroEmplea tiporubroemplea) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldidTipoRubroEmplea.setText(tiporubroemplea.getId().toString());
			this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldcodigoTipoRubroEmplea.setText(tiporubroemplea.getcodigo());
			this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldnombreTipoRubroEmplea.setText(tiporubroemplea.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoRubroEmplea tiporubroempleaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tiporubroempleaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoRubroEmplea tiporubroempleaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tiporubroempleaLocal=this.tiporubroemplea;
			} else {
				tiporubroempleaLocal=this.tiporubroempleaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tiporubroempleaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoRubroEmplea(tiporubroempleaLocal,true);
					
					if(tiporubroempleaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tiporubroempleaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tiporubroempleaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoRubroEmplea(TipoRubroEmplea tiporubroemplea,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRubroEmplea(tiporubroemplea,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRubroEmplea(tiporubroemplea);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRubroEmplea(TipoRubroEmplea tiporubroemplea,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRubroEmplea(tiporubroemplea,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRubroEmplea(TipoRubroEmplea tiporubroemplea,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldidTipoRubroEmplea.getText()==null || this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldidTipoRubroEmplea.getText()=="" || this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldidTipoRubroEmplea.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldidTipoRubroEmplea.setText("0");
			}

			if(conColumnasBase) {tiporubroemplea.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldidTipoRubroEmplea.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRubroEmpleaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRubroEmplea.jLabelIdTipoRubroEmplea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporubroemplea.setcodigo(this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldcodigoTipoRubroEmplea.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRubroEmpleaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRubroEmplea.jLabelcodigoTipoRubroEmplea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporubroemplea.setnombre(this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldnombreTipoRubroEmplea.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRubroEmpleaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRubroEmplea.jLabelnombreTipoRubroEmplea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRubroEmplea(TipoRubroEmplea tiporubroempleaBean,TipoRubroEmplea tiporubroemplea,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoRubroEmplea(TipoRubroEmplea tiporubroempleaOrigen,TipoRubroEmplea tiporubroemplea,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporubroempleaOrigen.getId()!=null && !tiporubroempleaOrigen.getId().equals(0L))) {tiporubroemplea.setId(tiporubroempleaOrigen.getId());}}
			if(conDefault || (!conDefault && tiporubroempleaOrigen.getcodigo()!=null && !tiporubroempleaOrigen.getcodigo().equals(""))) {tiporubroemplea.setcodigo(tiporubroempleaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tiporubroempleaOrigen.getnombre()!=null && !tiporubroempleaOrigen.getnombre().equals(""))) {tiporubroemplea.setnombre(tiporubroempleaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRubroEmplea(TipoRubroEmplea tiporubroemplea) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldidTipoRubroEmplea.setText(tiporubroemplea.getId().toString());
			this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldcodigoTipoRubroEmplea.setText(tiporubroemplea.getcodigo());
			this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldnombreTipoRubroEmplea.setText(tiporubroemplea.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRubroEmplea(TipoRubroEmpleaBean tiporubroempleaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldidTipoRubroEmplea.setText(tiporubroempleaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldcodigoTipoRubroEmplea.setText(tiporubroempleaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldnombreTipoRubroEmplea.setText(tiporubroempleaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoRubroEmplea(TipoRubroEmpleaParameterReturnGeneral tiporubroempleaReturnGeneral,TipoRubroEmpleaBean tiporubroempleaBean,Boolean conDefault) throws Exception { 
		try {
			TipoRubroEmplea tiporubroempleaLocal=new TipoRubroEmplea();
			
			tiporubroempleaLocal=tiporubroempleaReturnGeneral.getTipoRubroEmplea();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporubroempleaLocal.getId()!=null && !tiporubroempleaLocal.getId().equals(0L))) {tiporubroempleaBean.setId(tiporubroempleaLocal.getId());}}
			if(conDefault || (!conDefault && tiporubroempleaLocal.getcodigo()!=null && !tiporubroempleaLocal.getcodigo().equals(""))) {tiporubroempleaBean.setcodigo(tiporubroempleaLocal.getcodigo());}
			if(conDefault || (!conDefault && tiporubroempleaLocal.getnombre()!=null && !tiporubroempleaLocal.getnombre().equals(""))) {tiporubroempleaBean.setnombre(tiporubroempleaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoRubroEmpleaGenerico(Long idTipoRubroEmpleaSeleccionado,JComboBox jComboBoxTipoRubroEmplea,List<TipoRubroEmplea> tiporubroempleasLocal)throws Exception {
		try {
			TipoRubroEmplea  tiporubroempleaTemp=null;

			for(TipoRubroEmplea tiporubroempleaAux:tiporubroempleasLocal) {
				if(tiporubroempleaAux.getId()!=null && tiporubroempleaAux.getId().equals(idTipoRubroEmpleaSeleccionado)) {
					tiporubroempleaTemp=tiporubroempleaAux;
					break;
				}
			}

			jComboBoxTipoRubroEmplea.setSelectedItem(tiporubroempleaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoRubroEmpleaGenerico(JComboBox jComboBoxTipoRubroEmplea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRubroEmplea.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoRubroEmplea.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRubroEmplea.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoRubroEmplea.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("RubroEmplea")) {
			jButtonRubroEmpleaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporubroemplea=(TipoRubroEmplea) tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporubroemplea =(TipoRubroEmplea) tiporubroempleas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoRubroEmplea tiporubroempleaRow=new TipoRubroEmplea();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporubroempleaRow=(TipoRubroEmplea) tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporubroempleaRow=(TipoRubroEmplea) tiporubroempleas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonRubroEmpleaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoRubroEmplea tiporubroemplea) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoRubroEmplea==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroempleaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporubroemplea = (TipoRubroEmplea)this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tiporubroemplea = (TipoRubroEmplea)this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tiporubroemplea!=null) {
						this.tiporubroemplea = tiporubroemplea;
					} else {
						this.tiporubroemplea = new TipoRubroEmplea();
					}
				}

				if(this.isTienePermisosRubroEmplea && this.permiteMantenimiento(this.tiporubroemplea)) {
					RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFramePopup=new RubroEmpleaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						rubroempleaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFramePopup;
					} else {
						rubroempleaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame;
					}

					List<TipoRubroEmplea> tiporubroempleas=new ArrayList<TipoRubroEmplea>();
					tiporubroempleas.add(this.tiporubroemplea);
					if(!esRelacionado) {
						//rubroempleaBeanSwingJInternalFrame.rubroempleaSessionBean.setConGuardarRelaciones(false);
						//rubroempleaBeanSwingJInternalFrame.rubroempleaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					rubroempleaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoRubroEmplea.cargarRubroEmpleaBeanSwingJInternalFrame(tiporubroempleas,this.tiporubroemplea,rubroempleaBeanSwingJInternalFrame,/*conInicializar,*/rubroempleaBeanSwingJInternalFrame.rubroempleaSessionBean.getConGuardarRelaciones(),rubroempleaBeanSwingJInternalFrame.rubroempleaSessionBean.getEsGuardarRelacionado());
					rubroempleaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						rubroempleaBeanSwingJInternalFrame.actualizarEstadoPanelsRubroEmplea("no_relacionado");

						rubroempleaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(RubroEmpleaConstantesFunciones.ITAMANIOFILATABLA + (RubroEmpleaConstantesFunciones.ITAMANIOFILATABLA/2));

						rubroempleaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoRubroEmplea=(TitledBorder)this.jScrollPanelDatosTipoRubroEmplea.getBorder();
						TitledBorder titledBorderRubroEmplea=(TitledBorder)rubroempleaBeanSwingJInternalFrame.jScrollPanelDatosRubroEmplea.getBorder();

						titledBorderRubroEmplea.setTitle(titledBorderTipoRubroEmplea.getTitle() + " -> Rubro Emplea");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,rubroempleaBeanSwingJInternalFrame);
						}

						rubroempleaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(rubroempleaBeanSwingJInternalFrame);

						rubroempleaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tiporubroempleaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Rubro Emplea",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroempleaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroempleaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroempleaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoRubroEmplea(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoRubroEmplea.setVisible((this.isVisibilidadCeldaNuevoTipoRubroEmplea && this.isPermisoNuevoTipoRubroEmplea));			
			this.jButtonDuplicarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaDuplicarTipoRubroEmplea && this.isPermisoDuplicarTipoRubroEmplea));			
			this.jButtonCopiarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaCopiarTipoRubroEmplea && this.isPermisoCopiarTipoRubroEmplea));
			this.jButtonVerFormTipoRubroEmplea.setVisible((this.isVisibilidadCeldaVerFormTipoRubroEmplea && this.isPermisoVerFormTipoRubroEmplea));
			
			this.jButtonAbrirOrderByTipoRubroEmplea.setVisible((this.isVisibilidadCeldaOrdenTipoRubroEmplea && this.isPermisoOrdenTipoRubroEmplea));			
			
			this.jButtonNuevoRelacionesTipoRubroEmplea.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRubroEmplea && this.isPermisoNuevoTipoRubroEmplea));			
			this.jButtonNuevoGuardarCambiosTipoRubroEmplea.setVisible((this.isVisibilidadCeldaNuevoTipoRubroEmplea && this.isPermisoNuevoTipoRubroEmplea && this.isPermisoGuardarCambiosTipoRubroEmplea));
			
			if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) {
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonModificarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaModificarTipoRubroEmplea && this.isPermisoActualizarTipoRubroEmplea));	
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonActualizarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaActualizarTipoRubroEmplea && this.isPermisoActualizarTipoRubroEmplea));	
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonEliminarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaEliminarTipoRubroEmplea && this.isPermisoEliminarTipoRubroEmplea));
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonCancelarTipoRubroEmplea.setVisible(this.isVisibilidadCeldaCancelarTipoRubroEmplea);							
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonGuardarCambiosTipoRubroEmplea.setVisible((this.isVisibilidadCeldaGuardarTipoRubroEmplea && this.isPermisoGuardarCambiosTipoRubroEmplea));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoRubroEmplea.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRubroEmplea && this.isPermisoGuardarCambiosTipoRubroEmplea));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaNuevoTipoRubroEmplea && this.isPermisoNuevoTipoRubroEmplea));						
			this.jButtonDuplicarToolBarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaDuplicarTipoRubroEmplea && this.isPermisoDuplicarTipoRubroEmplea));						
			this.jButtonCopiarToolBarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaCopiarTipoRubroEmplea && this.isPermisoCopiarTipoRubroEmplea));			
			this.jButtonVerFormToolBarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaVerFormTipoRubroEmplea && this.isPermisoVerFormTipoRubroEmplea));			
			this.jButtonAbrirOrderByToolBarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaOrdenTipoRubroEmplea && this.isPermisoOrdenTipoRubroEmplea));
			this.jButtonNuevoRelacionesToolBarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRubroEmplea && this.isPermisoNuevoTipoRubroEmplea));			
			this.jButtonNuevoGuardarCambiosToolBarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaNuevoTipoRubroEmplea && this.isPermisoNuevoTipoRubroEmplea && this.isPermisoGuardarCambiosTipoRubroEmplea));			
			
			if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) {
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonModificarToolBarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaModificarTipoRubroEmplea && this.isPermisoActualizarTipoRubroEmplea));	
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonActualizarToolBarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaActualizarTipoRubroEmplea  && this.isPermisoActualizarTipoRubroEmplea));	
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonEliminarToolBarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaEliminarTipoRubroEmplea && this.isPermisoEliminarTipoRubroEmplea));
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonCancelarToolBarTipoRubroEmplea.setVisible(this.isVisibilidadCeldaCancelarTipoRubroEmplea);				
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonGuardarCambiosToolBarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaGuardarTipoRubroEmplea && this.isPermisoGuardarCambiosTipoRubroEmplea));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRubroEmplea && this.isPermisoGuardarCambiosTipoRubroEmplea));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoRubroEmplea.setVisible((this.isVisibilidadCeldaNuevoTipoRubroEmplea && this.isPermisoNuevoTipoRubroEmplea));			
			this.jMenuItemDuplicarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaDuplicarTipoRubroEmplea && this.isPermisoDuplicarTipoRubroEmplea));			
			this.jMenuItemCopiarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaCopiarTipoRubroEmplea && this.isPermisoCopiarTipoRubroEmplea));			
			this.jMenuItemVerFormTipoRubroEmplea.setVisible((this.isVisibilidadCeldaVerFormTipoRubroEmplea && this.isPermisoVerFormTipoRubroEmplea));			
			this.jMenuItemAbrirOrderByTipoRubroEmplea.setVisible((this.isVisibilidadCeldaOrdenTipoRubroEmplea && this.isPermisoOrdenTipoRubroEmplea));			
			//this.jMenuItemMostrarOcultarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaOrdenTipoRubroEmplea && this.isPermisoOrdenTipoRubroEmplea));
			this.jMenuItemDetalleAbrirOrderByTipoRubroEmplea.setVisible((this.isVisibilidadCeldaOrdenTipoRubroEmplea && this.isPermisoOrdenTipoRubroEmplea));			
			//this.jMenuItemDetalleMostrarOcultarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaOrdenTipoRubroEmplea && this.isPermisoOrdenTipoRubroEmplea));			
			this.jMenuItemNuevoRelacionesTipoRubroEmplea.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRubroEmplea && this.isPermisoNuevoTipoRubroEmplea));			
			this.jMenuItemNuevoGuardarCambiosTipoRubroEmplea.setVisible((this.isVisibilidadCeldaNuevoTipoRubroEmplea && this.isPermisoNuevoTipoRubroEmplea && this.isPermisoGuardarCambiosTipoRubroEmplea));									
			
			if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) {
			this.jInternalFrameDetalleFormTipoRubroEmplea.jMenuItemModificarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaModificarTipoRubroEmplea && this.isPermisoActualizarTipoRubroEmplea));	
			this.jInternalFrameDetalleFormTipoRubroEmplea.jMenuItemActualizarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaActualizarTipoRubroEmplea && this.isPermisoActualizarTipoRubroEmplea));	
			this.jInternalFrameDetalleFormTipoRubroEmplea.jMenuItemEliminarTipoRubroEmplea.setVisible((this.isVisibilidadCeldaEliminarTipoRubroEmplea && this.isPermisoEliminarTipoRubroEmplea));
			this.jInternalFrameDetalleFormTipoRubroEmplea.jMenuItemCancelarTipoRubroEmplea.setVisible(this.isVisibilidadCeldaCancelarTipoRubroEmplea);				
			}
			
			this.jMenuItemGuardarCambiosTipoRubroEmplea.setVisible((this.isVisibilidadCeldaGuardarTipoRubroEmplea && this.isPermisoGuardarCambiosTipoRubroEmplea));						
			this.jMenuItemGuardarCambiosTablaTipoRubroEmplea.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRubroEmplea && this.isPermisoGuardarCambiosTipoRubroEmplea));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoRubroEmplea=this.jButtonNuevoTipoRubroEmplea.isVisible();
			this.isVisibilidadCeldaDuplicarTipoRubroEmplea=this.jButtonDuplicarTipoRubroEmplea.isVisible();
			this.isVisibilidadCeldaCopiarTipoRubroEmplea=this.jButtonCopiarTipoRubroEmplea.isVisible();
			this.isVisibilidadCeldaVerFormTipoRubroEmplea=this.jButtonVerFormTipoRubroEmplea.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoRubroEmplea=this.jButtonAbrirOrderByTipoRubroEmplea.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoRubroEmplea=this.jButtonNuevoRelacionesTipoRubroEmplea.isVisible();
			this.isVisibilidadCeldaModificarTipoRubroEmplea=this.jButtonModificarTipoRubroEmplea.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) {
			this.isVisibilidadCeldaActualizarTipoRubroEmplea=this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonActualizarTipoRubroEmplea.isVisible();
			this.isVisibilidadCeldaEliminarTipoRubroEmplea=this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonEliminarTipoRubroEmplea.isVisible();
			this.isVisibilidadCeldaCancelarTipoRubroEmplea=this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonCancelarTipoRubroEmplea.isVisible();
			this.isVisibilidadCeldaGuardarTipoRubroEmplea=this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonGuardarCambiosTipoRubroEmplea.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoRubroEmplea=this.jButtonGuardarCambiosTablaTipoRubroEmplea.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoRubroEmplea=this.jButtonNuevoToolBarTipoRubroEmplea.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRubroEmplea=this.jButtonNuevoRelacionesToolBarTipoRubroEmplea.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) {
			this.isVisibilidadCeldaModificarTipoRubroEmplea=this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonModificarToolBarTipoRubroEmplea.isVisible();
			this.isVisibilidadCeldaActualizarTipoRubroEmplea=this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonActualizarToolBarTipoRubroEmplea.isVisible();
			this.isVisibilidadCeldaEliminarTipoRubroEmplea=this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonEliminarToolBarTipoRubroEmplea.isVisible();
			this.isVisibilidadCeldaCancelarTipoRubroEmplea=this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonCancelarToolBarTipoRubroEmplea.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRubroEmplea=this.jButtonGuardarCambiosToolBarTipoRubroEmplea.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRubroEmplea=this.jButtonGuardarCambiosTablaToolBarTipoRubroEmplea.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoRubroEmplea=this.jMenuItemNuevoTipoRubroEmplea.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRubroEmplea=this.jMenuItemNuevoRelacionesTipoRubroEmplea.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) {
			this.isVisibilidadCeldaModificarTipoRubroEmplea=this.jInternalFrameDetalleFormTipoRubroEmplea.jMenuItemModificarTipoRubroEmplea.isVisible();
			this.isVisibilidadCeldaActualizarTipoRubroEmplea=this.jInternalFrameDetalleFormTipoRubroEmplea.jMenuItemActualizarTipoRubroEmplea.isVisible();
			this.isVisibilidadCeldaEliminarTipoRubroEmplea=this.jInternalFrameDetalleFormTipoRubroEmplea.jMenuItemEliminarTipoRubroEmplea.isVisible();
			this.isVisibilidadCeldaCancelarTipoRubroEmplea=this.jInternalFrameDetalleFormTipoRubroEmplea.jMenuItemCancelarTipoRubroEmplea.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRubroEmplea=this.jMenuItemGuardarCambiosTipoRubroEmplea.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRubroEmplea=this.jMenuItemGuardarCambiosTablaTipoRubroEmplea.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoRubroEmplea(Boolean esInicializar) {
		if(TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tiporubroempleaSessionBean.getConGuardarRelaciones()) {
				//if(this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRubroEmplea();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoRubroEmplea(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoRubroEmplea() {
		this.jButtonNuevoTipoRubroEmplea.setVisible(this.isPermisoNuevoTipoRubroEmplea);			
		this.jButtonDuplicarTipoRubroEmplea.setVisible(this.isPermisoDuplicarTipoRubroEmplea);			
		this.jButtonCopiarTipoRubroEmplea.setVisible(this.isPermisoCopiarTipoRubroEmplea);			
		this.jButtonVerFormTipoRubroEmplea.setVisible(this.isPermisoVerFormTipoRubroEmplea);			
		
		this.jButtonAbrirOrderByTipoRubroEmplea.setVisible(this.isPermisoOrdenTipoRubroEmplea);					
		
		this.jButtonNuevoRelacionesTipoRubroEmplea.setVisible(this.isPermisoNuevoTipoRubroEmplea);			
		
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonModificarTipoRubroEmplea.setVisible(this.isPermisoActualizarTipoRubroEmplea);	
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonActualizarTipoRubroEmplea.setVisible(this.isPermisoActualizarTipoRubroEmplea);	
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonEliminarTipoRubroEmplea.setVisible(this.isPermisoEliminarTipoRubroEmplea);
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonCancelarTipoRubroEmplea.setVisible(this.isVisibilidadCeldaCancelarTipoRubroEmplea);						
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonGuardarCambiosTipoRubroEmplea.setVisible(this.isPermisoGuardarCambiosTipoRubroEmplea);							
		}
		
		this.jButtonGuardarCambiosTablaTipoRubroEmplea.setVisible(this.isPermisoActualizarTipoRubroEmplea);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRubroEmplea() {
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonModificarTipoRubroEmplea.setVisible(this.isPermisoActualizarTipoRubroEmplea);	
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonActualizarTipoRubroEmplea.setVisible(this.isPermisoActualizarTipoRubroEmplea);	
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonEliminarTipoRubroEmplea.setVisible(this.isPermisoEliminarTipoRubroEmplea);
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonCancelarTipoRubroEmplea.setVisible(this.isVisibilidadCeldaCancelarTipoRubroEmplea);							
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonGuardarCambiosTipoRubroEmplea.setVisible((this.isVisibilidadCeldaGuardarTipoRubroEmplea && this.isPermisoGuardarCambiosTipoRubroEmplea));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoRubroEmplea() {
		if(TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoRubroEmplea();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoRubroEmplea() {
	}
	
	public void jTableDatosTipoRubroEmpleaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoRubroEmplea(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoRubroEmpleaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroempleaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRubroEmplea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRubroEmplea(this.gettiporubroemplea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRubroEmplea(this.tiporubroemplea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporubroemplea==null) {
						this.tiporubroemplea = new TipoRubroEmplea();
					}

					this.setVariablesFormularioToObjetoActualTipoRubroEmplea(this.tiporubroemplea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRubroEmplea(this.tiporubroemplea);
				}

				if(this.tiporubroemplea.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tiporubroemplea.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRubroEmplea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroempleaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroempleaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroempleaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoRubroEmpleaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroempleaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRubroEmplea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRubroEmplea(this.gettiporubroemplea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRubroEmplea(this.tiporubroemplea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporubroemplea==null) {
						this.tiporubroemplea = new TipoRubroEmplea();
					}

					this.setVariablesFormularioToObjetoActualTipoRubroEmplea(this.tiporubroemplea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRubroEmplea(this.tiporubroemplea);
				}

				if(this.tiporubroemplea.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tiporubroemplea.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRubroEmplea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroempleaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroempleaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroempleaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoRubroEmpleaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroempleaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRubroEmplea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRubroEmplea(this.gettiporubroemplea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRubroEmplea(this.tiporubroemplea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporubroemplea==null) {
						this.tiporubroemplea = new TipoRubroEmplea();
					}

					this.setVariablesFormularioToObjetoActualTipoRubroEmplea(this.tiporubroemplea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRubroEmplea(this.tiporubroemplea);
				}

				if(this.tiporubroemplea.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tiporubroemplea.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRubroEmplea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroempleaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroempleaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroempleaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoRubroEmplea() {
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) {
		

		if(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) {
			this.jInternalFrameDetalleFormTipoRubroEmplea.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoRubroEmplea.dispose();
			this.jInternalFrameDetalleFormTipoRubroEmplea=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoRubroEmplea!=null) {
			this.jInternalFrameReporteDinamicoTipoRubroEmplea.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoRubroEmplea.dispose();
			this.jInternalFrameReporteDinamicoTipoRubroEmplea=null;
		}
		
		if(this.jInternalFrameImportacionTipoRubroEmplea!=null) {
			this.jInternalFrameImportacionTipoRubroEmplea.setVisible(false);	    			
			this.jInternalFrameImportacionTipoRubroEmplea.dispose();
			this.jInternalFrameImportacionTipoRubroEmplea=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoRubroEmplea();
			
			TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoRubroEmplea")) {
				jButtonNuevoTipoRubroEmpleaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoRubroEmplea")) {
				jButtonDuplicarTipoRubroEmpleaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoRubroEmplea")) {
				jButtonCopiarTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoRubroEmplea")) {
				jButtonVerFormTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoRubroEmplea")) {
				jButtonNuevoTipoRubroEmpleaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoRubroEmplea")) {
				jButtonDuplicarTipoRubroEmpleaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoRubroEmplea")) {
				jButtonNuevoTipoRubroEmpleaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoRubroEmplea")) {
				jButtonDuplicarTipoRubroEmpleaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoRubroEmplea")) {
				jButtonNuevoTipoRubroEmpleaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoRubroEmplea")) {
				jButtonNuevoTipoRubroEmpleaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoRubroEmplea")) {
				jButtonNuevoTipoRubroEmpleaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoRubroEmplea")) {
				jButtonModificarTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoRubroEmplea")) {
				jButtonModificarTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoRubroEmplea")) {
				jButtonModificarTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoRubroEmplea")) {
				jButtonActualizarTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoRubroEmplea")) {
				jButtonActualizarTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoRubroEmplea")) {
				jButtonActualizarTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoRubroEmplea")) {
				jButtonEliminarTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoRubroEmplea")) {
				jButtonEliminarTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoRubroEmplea")) {
				jButtonEliminarTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoRubroEmplea")) {
				jButtonCancelarTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoRubroEmplea")) {
				jButtonCancelarTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoRubroEmplea")) {
				jButtonCancelarTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoRubroEmplea")) {
				jButtonCerrarTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoRubroEmplea")) {
				jButtonCerrarTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoRubroEmplea")) {
				jButtonCerrarTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoRubroEmplea")) {
				jButtonMostrarOcultarTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoRubroEmplea")) {
				jButtonCancelarTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoRubroEmplea")) {
				jButtonGuardarCambiosTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoRubroEmplea")) {
				jButtonGuardarCambiosTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoRubroEmplea")) {
				jButtonCopiarTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoRubroEmplea")) {
				jButtonVerFormTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoRubroEmplea")) {
				jButtonGuardarCambiosTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoRubroEmplea")) {
				jButtonCopiarTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoRubroEmplea")) {
				jButtonVerFormTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoRubroEmplea")) {
				jButtonGuardarCambiosTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoRubroEmplea")) {
				jButtonGuardarCambiosTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoRubroEmplea")) {
				jButtonGuardarCambiosTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoRubroEmplea")) {
				jButtonRecargarInformacionTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoRubroEmplea")) {
				jButtonRecargarInformacionTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoRubroEmplea")) {
				jButtonRecargarInformacionTipoRubroEmpleaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoRubroEmplea")) {
				jButtonAnterioresTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoRubroEmplea")) {
				jButtonAnterioresTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoRubroEmplea")) {
				jButtonAnterioresTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoRubroEmplea")) {
				jButtonSiguientesTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoRubroEmplea")) {
				jButtonSiguientesTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoRubroEmplea")) {
				jButtonSiguientesTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoRubroEmplea") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoRubroEmplea")) {
				jButtonAbrirOrderByTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoRubroEmplea") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoRubroEmplea")) {
				jButtonMostrarOcultarTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRubroEmplea")) {
				jButtonNuevoGuardarCambiosTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoRubroEmplea")) {
				jButtonNuevoGuardarCambiosTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoRubroEmplea")) {
				jButtonNuevoGuardarCambiosTipoRubroEmpleaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoRubroEmplea")) {
				jButtonCerrarReporteDinamicoTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoRubroEmplea")) {
				jButtonGenerarReporteDinamicoTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoRubroEmplea")) {
				
				jButtonGenerarExcelReporteDinamicoTipoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoRubroEmplea")) {
				jButtonCerrarImportacionTipoRubroEmpleaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoRubroEmplea")) {
				
				jButtonGenerarImportacionTipoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoRubroEmplea")) {
				
				jButtonAbrirImportacionTipoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoRubroEmplea")) {
				jComboBoxTiposAccionesTipoRubroEmpleaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoRubroEmplea")) {
				jComboBoxTiposRelacionesTipoRubroEmpleaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoRubroEmplea")) {
				jComboBoxTiposAccionesTipoRubroEmpleaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoRubroEmplea")) {
				
				jComboBoxTiposSeleccionarTipoRubroEmpleaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoRubroEmplea")) {
				jTextFieldValorCampoGeneralTipoRubroEmpleaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoRubroEmplea")) {
				jButtonAbrirOrderByTipoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoRubroEmplea")) {
				jButtonAbrirOrderByTipoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoRubroEmplea")) {
				jButtonCerrarOrderByTipoRubroEmpleaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRubroEmpleaBusqueda")) {
				this.jButtonidTipoRubroEmpleaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoRubroEmpleaBusqueda")) {
				this.jButtoncodigoTipoRubroEmpleaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRubroEmpleaBusqueda")) {
				this.jButtonnombreTipoRubroEmpleaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoRubroEmplea();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRubroEmpleaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporubroemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporubroemplea);
				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
				
				


				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRubroEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRubroEmplea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoRubroEmplea tiporubroempleaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tiporubroempleaLocal=this.tiporubroemplea;
			} else {
				tiporubroempleaLocal=this.tiporubroempleaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporubroemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporubroemplea);
				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
							
				
				


				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRubroEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRubroEmplea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRubroEmpleaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRubroEmplea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroempleaAnterior =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporubroempleaAnterior =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
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
			
			TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
			
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
			
			


			
			TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRubroEmpleaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporubroemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporubroemplea);
				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
								
						
				


				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRubroEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRubroEmplea.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporubroemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporubroemplea);
				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
								
				
				


				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRubroEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRubroEmplea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRubroEmpleaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRubroEmplea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroempleaAnterior =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporubroempleaAnterior =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporubroemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporubroemplea);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRubroEmpleaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRubroEmplea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroempleaAnterior =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporubroempleaAnterior =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRubroEmpleaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporubroemplea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporubroemplea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporubroemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporubroemplea);
				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
							
				
				


				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRubroEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRubroEmplea.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRubroEmpleaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRubroEmplea.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporubroempleaAnterior =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporubroempleaAnterior =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
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
			
			TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
			
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
			
			


			
			TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRubroEmpleaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporubroemplea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporubroemplea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporubroemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporubroemplea);
				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
								
				
				


				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRubroEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRubroEmplea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRubroEmpleaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRubroEmplea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroempleaAnterior =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporubroempleaAnterior =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRubroEmpleaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporubroemplea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporubroemplea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRubroEmpleaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporubroemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporubroemplea);
				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoRubroEmplea")) {
					jCheckBoxSeleccionarTodosTipoRubroEmpleaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoRubroEmplea")) {
					jCheckBoxSeleccionadosTipoRubroEmpleaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoRubroEmplea")) {
					
				}
				
				


				
				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRubroEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRubroEmplea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporubroemplea);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tiporubroemplea);
				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
												
				
				


				
				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRubroEmplea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRubroEmplea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRubroEmpleaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRubroEmplea.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporubroempleaAnterior =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporubroempleaAnterior =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRubroEmpleaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporubroemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporubroemplea);
				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
				
				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
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
			
			TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
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
			
			


			
			TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRubroEmpleaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporubroemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporubroemplea);
				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRubroEmplea.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRubroEmplea.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporubroemplea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporubroemplea);
				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
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
				
				


				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRubroEmplea.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRubroEmplea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRubroEmpleaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRubroEmplea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporubroempleaAnterior =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporubroempleaAnterior =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoRubroEmplea")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoRubroEmpleaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoRubroEmplea.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tiporubroemplea =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tiporubroemplea);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoRubroEmplea")) {
				
				}
				
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoRubroEmplea")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoRubroEmplea.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoRubroEmplea")) {
			
			}
			
			TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoRubroEmplea();
			
			TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoRubroEmplea")) {
				jButtonNuevoTipoRubroEmpleaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoRubroEmplea")) {
				jButtonDuplicarTipoRubroEmpleaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoRubroEmplea")) {
				jButtonCopiarTipoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoRubroEmplea")) {
				jButtonVerFormTipoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoRubroEmplea")) {
				jButtonNuevoTipoRubroEmpleaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoRubroEmplea")) {
				jButtonModificarTipoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoRubroEmplea")) {
				jButtonActualizarTipoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoRubroEmplea")) {
				jButtonEliminarTipoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoRubroEmplea")) {
				jButtonGuardarCambiosTipoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoRubroEmplea")) {
				jButtonCancelarTipoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoRubroEmplea")) {
				jButtonCerrarTipoRubroEmpleaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoRubroEmplea")) {
				jButtonGuardarCambiosTipoRubroEmpleaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRubroEmplea")) {
				jButtonNuevoGuardarCambiosTipoRubroEmpleaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoRubroEmplea")) {
				jButtonAbrirOrderByTipoRubroEmpleaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoRubroEmplea")) {
				jButtonRecargarInformacionTipoRubroEmpleaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoRubroEmplea")) {
				jButtonAnterioresTipoRubroEmpleaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoRubroEmplea")) {
				jButtonSiguientesTipoRubroEmpleaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRubroEmpleaBusqueda")) {
				this.jButtonidTipoRubroEmpleaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoRubroEmpleaBusqueda")) {
				this.jButtoncodigoTipoRubroEmpleaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRubroEmpleaBusqueda")) {
				this.jButtonnombreTipoRubroEmpleaBusquedaActionPerformed(evt);
			}
			
			TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoRubroEmplea();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoRubroEmplea")) {
				closingInternalFrameTipoRubroEmplea();
				
			} else if(sTipo.equals("jButtonCancelarTipoRubroEmplea")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoRubroEmplea = (JInternalFrameBase)evt.getSource();
	            	
	            TipoRubroEmpleaBeanSwingJInternalFrame jInternalFrameParent=(TipoRubroEmpleaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRubroEmplea.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoRubroEmpleaActionPerformed(null);
			}
			
			TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporubroemplea,new Object(),this.tiporubroempleaParameterGeneral,this.tiporubroempleaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoRubroEmplea(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoRubroEmplea(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoRubroEmplea(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tiporubroemplea)) {
			if(!esControlTabla) {
				if(TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoRubroEmplea(this.tiporubroemplea,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRubroEmplea(this.tiporubroemplea);			
				}
				
				if(this.tiporubroempleaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoRubroEmplea(this.tiporubroemplea,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporubroempleaReturnGeneral=tiporubroempleaLogic.procesarEventosTipoRubroEmpleasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporubroempleaLogic.getTipoRubroEmpleas(),this.tiporubroemplea,this.tiporubroempleaParameterGeneral,this.isEsNuevoTipoRubroEmplea,classes);//this.tiporubroempleaLogic.getTipoRubroEmplea()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoRubroEmplea(this.tiporubroempleaReturnGeneral,this.tiporubroempleaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tiporubroempleaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoRubroEmplea(classes,this.tiporubroempleaReturnGeneral,this.tiporubroempleaBean,false);
					}
						
					if(this.tiporubroempleaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoRubroEmplea(this.tiporubroempleaReturnGeneral.getTipoRubroEmplea());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoRubroEmplea(this.tiporubroempleaReturnGeneral.getTipoRubroEmplea());	
					}
						
					if(this.tiporubroempleaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoRubroEmplea(this.tiporubroempleaReturnGeneral.getTipoRubroEmplea(),classes);//this.tiporubroempleaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoRubroEmplea(this.tiporubroemplea,classes);//this.tiporubroempleaBean);									
				}
			
				if(TipoRubroEmpleaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoRubroEmplea(this.tiporubroemplea,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRubroEmplea(this.tiporubroemplea);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tiporubroempleaAnterior!=null) {
						this.tiporubroemplea=this.tiporubroempleaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporubroempleaReturnGeneral=tiporubroempleaLogic.procesarEventosTipoRubroEmpleasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporubroempleaLogic.getTipoRubroEmpleas(),this.tiporubroemplea,this.tiporubroempleaParameterGeneral,this.isEsNuevoTipoRubroEmplea,classes);//this.tiporubroempleaLogic.getTipoRubroEmplea()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporubroempleaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporubroempleaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tiporubroempleaReturnGeneral.getTipoRubroEmplea(),tiporubroempleaLogic.getTipoRubroEmpleas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tiporubroempleaReturnGeneral.getTipoRubroEmplea(),this.tiporubroempleas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoRubroEmplea.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoRubroEmplea.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoRubroEmplea();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoRubroEmplea() throws Exception {
		
		TipoRubroEmpleaModel tiporubroempleaModel=(TipoRubroEmpleaModel)this.jTableDatosTipoRubroEmplea.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporubroempleaModel.tiporubroempleas=this.tiporubroempleaLogic.getTipoRubroEmpleas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tiporubroempleaModel.tiporubroempleas=this.tiporubroempleas;
		}
		
		
		((TipoRubroEmpleaModel) this.jTableDatosTipoRubroEmplea.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoRubroEmplea() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettiporubroempleaAnterior(),this.tiporubroempleaLogic.getTipoRubroEmpleas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettiporubroempleaAnterior(),this.tiporubroempleas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoRubroEmplea();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoRubroEmplea(TipoRubroEmplea tiporubroemplea,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(RubroEmplea.class)) {
					this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleaLogic.setRubroEmpleas(tiporubroemplea.getRubroEmpleas());
					this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.inicializarActualizarBindingTablaRubroEmplea(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
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
										
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporubroemplea,new Object(),generalEntityParameterGeneral,this.tiporubroempleaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tiporubroempleaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoRubroEmpleaConstantesFunciones.getClassesRelationshipsOfTipoRubroEmplea(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoRubroEmpleaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoRubroEmplea(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoRubroEmplea(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoRubroEmpleaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporubroemplea,new Object(),generalEntityParameterGeneral,this.tiporubroempleaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoRubroEmplea(TipoRubroEmpleaBean tiporubroempleaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(RubroEmplea.class)) {
					this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleaLogic.setRubroEmpleas(tiporubroemplea.getRubroEmpleas());
					this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.inicializarActualizarBindingTablaRubroEmplea(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoRubroEmplea(ArrayList<Classe> classes,TipoRubroEmpleaReturnGeneral tiporubroempleaReturnGeneral,TipoRubroEmpleaBean tiporubroempleaBean,Boolean conDefault) throws Exception {
		
			this.tiporubroempleaBean.setRubroEmpleas(tiporubroempleaReturnGeneral.getTipoRubroEmplea().getRubroEmpleas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoRubroEmplea(TipoRubroEmplea tiporubroemplea,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(RubroEmplea.class)) {
					tiporubroemplea.setRubroEmpleas(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaBeanSwingJInternalFrame.rubroempleaLogic.getRubroEmpleas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tiporubroemplea)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoRubroEmplea = new TipoRubroEmpleaDetalleFormJInternalFrame(jDesktopPane,this.tiporubroempleaSessionBean.getConGuardarRelaciones(),this.tiporubroempleaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRubroEmplea);
		this.jInternalFrameDetalleFormTipoRubroEmplea.setVisible(false);
		this.jInternalFrameDetalleFormTipoRubroEmplea.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoRubroEmplea.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoRubroEmplea.tiporubroempleaLogic=this.tiporubroempleaLogic;
		
		this.cargarCombosFrameForeignKeyTipoRubroEmplea("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRubroEmplea();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRubroEmplea();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoRubroEmplea("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoRubroEmplea();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoRubroEmplea.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRubroEmplea"));
		
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonModificarTipoRubroEmplea.addActionListener(new ButtonActionListener(this,"ModificarTipoRubroEmplea"));

		
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonModificarToolBarTipoRubroEmplea.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRubroEmplea"));
					
		this.jInternalFrameDetalleFormTipoRubroEmplea.jMenuItemModificarTipoRubroEmplea.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRubroEmplea"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonActualizarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"ActualizarTipoRubroEmplea"));
		
		
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonActualizarToolBarTipoRubroEmplea.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRubroEmplea"));
						
		this.jInternalFrameDetalleFormTipoRubroEmplea.jMenuItemActualizarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRubroEmplea"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonEliminarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"EliminarTipoRubroEmplea"));
		
		
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonEliminarToolBarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRubroEmplea"));
								
		this.jInternalFrameDetalleFormTipoRubroEmplea.jMenuItemEliminarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRubroEmplea"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonCancelarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"CancelarTipoRubroEmplea"));
		
		
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonCancelarToolBarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRubroEmplea"));
					
		this.jInternalFrameDetalleFormTipoRubroEmplea.jMenuItemCancelarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRubroEmplea"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoRubroEmplea.jMenuItemDetalleCerrarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRubroEmplea"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonGuardarCambiosToolBarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRubroEmplea"));
		
		
		
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonGuardarCambiosToolBarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRubroEmplea"));
		
		
		
		this.jInternalFrameDetalleFormTipoRubroEmplea.jComboBoxTiposAccionesFormularioTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRubroEmplea"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonidTipoRubroEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRubroEmpleaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtoncodigoTipoRubroEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRubroEmpleaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonnombreTipoRubroEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRubroEmpleaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoRubroEmplea.jTabbedPaneRelacionesTipoRubroEmplea.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRubroEmplea"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoRubroEmplea"));
		
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRubroEmplea.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRubroEmplea"));
		}
		
		this.jTableDatosTipoRubroEmplea.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoRubroEmplea"));
		
		this.jTableDatosTipoRubroEmplea.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoRubroEmplea"));
		
		this.jButtonNuevoTipoRubroEmplea.addActionListener(new ButtonActionListener(this,"NuevoTipoRubroEmplea"));
		
		this.jButtonDuplicarTipoRubroEmplea.addActionListener(new ButtonActionListener(this,"DuplicarTipoRubroEmplea"));
		
		this.jButtonCopiarTipoRubroEmplea.addActionListener(new ButtonActionListener(this,"CopiarTipoRubroEmplea"));
		
		this.jButtonVerFormTipoRubroEmplea.addActionListener(new ButtonActionListener(this,"VerFormTipoRubroEmplea"));
		
		
		this.jButtonNuevoToolBarTipoRubroEmplea.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoRubroEmplea"));
			
		this.jButtonDuplicarToolBarTipoRubroEmplea.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoRubroEmplea"));
			
		this.jMenuItemNuevoTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoRubroEmplea"));
			
		this.jMenuItemDuplicarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoRubroEmplea"));		
		
		
		this.jButtonNuevoRelacionesTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoRubroEmplea"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoRubroEmplea.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoRubroEmplea"));
			
		this.jMenuItemNuevoRelacionesTipoRubroEmplea.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoRubroEmplea"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonModificarTipoRubroEmplea.addActionListener(new ButtonActionListener(this,"ModificarTipoRubroEmplea"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonModificarToolBarTipoRubroEmplea.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRubroEmplea"));
			
			this.jInternalFrameDetalleFormTipoRubroEmplea.jMenuItemModificarTipoRubroEmplea.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRubroEmplea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonActualizarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"ActualizarTipoRubroEmplea"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonActualizarToolBarTipoRubroEmplea.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRubroEmplea"));
				
			this.jInternalFrameDetalleFormTipoRubroEmplea.jMenuItemActualizarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRubroEmplea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonEliminarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"EliminarTipoRubroEmplea"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonEliminarToolBarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRubroEmplea"));
						
			this.jInternalFrameDetalleFormTipoRubroEmplea.jMenuItemEliminarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRubroEmplea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonCancelarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"CancelarTipoRubroEmplea"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonCancelarToolBarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRubroEmplea"));
			
			this.jInternalFrameDetalleFormTipoRubroEmplea.jMenuItemCancelarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRubroEmplea"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoRubroEmplea"));		
		
		
		this.jButtonCerrarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"CerrarTipoRubroEmplea"));
		
		
		this.jButtonCerrarToolBarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoRubroEmplea"));
			
		this.jMenuItemCerrarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoRubroEmplea"));
			
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRubroEmplea.jMenuItemDetalleCerrarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRubroEmplea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonGuardarCambiosTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoRubroEmplea"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonGuardarCambiosToolBarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRubroEmplea"));
		}
		
		this.jButtonCopiarToolBarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoRubroEmplea"));
			
		this.jButtonVerFormToolBarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoRubroEmplea"));
		
		this.jMenuItemGuardarCambiosTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoRubroEmplea"));
			
		this.jMenuItemCopiarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoRubroEmplea"));		
		
		this.jMenuItemVerFormTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoRubroEmplea"));		
		
		
		this.jButtonGuardarCambiosTablaTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRubroEmplea"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoRubroEmplea"));
			
		this.jMenuItemGuardarCambiosTablaTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRubroEmplea"));		
		
		
		
		this.jButtonRecargarInformacionTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoRubroEmplea"));
					
		this.jButtonRecargarInformacionToolBarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoRubroEmplea"));
		
		this.jMenuItemRecargarInformacionTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoRubroEmplea"));		
		
		
		
		this.jButtonAnterioresTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"AnterioresTipoRubroEmplea"));
		
		
		this.jButtonAnterioresToolBarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoRubroEmplea"));
		
		this.jMenuItemAnterioresTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoRubroEmplea"));		
		
		
		this.jButtonSiguientesTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"SiguientesTipoRubroEmplea"));
		
		
		this.jButtonSiguientesToolBarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoRubroEmplea"));
			
		this.jMenuItemSiguientesTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoRubroEmplea"));
			
		this.jMenuItemAbrirOrderByTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoRubroEmplea"));
			
		this.jMenuItemMostrarOcultarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoRubroEmplea"));
			
		this.jMenuItemDetalleAbrirOrderByTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoRubroEmplea"));
			
		this.jMenuItemDetalleMostarOcultarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoRubroEmplea"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoRubroEmplea"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoRubroEmplea"));
			
		this.jMenuItemNuevoGuardarCambiosTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoRubroEmplea"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoRubroEmplea.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoRubroEmplea"));

		this.jCheckBoxSeleccionadosTipoRubroEmplea.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoRubroEmplea"));
		
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRubroEmplea.jComboBoxTiposAccionesFormularioTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRubroEmplea"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoRubroEmplea"));
			
		this.jComboBoxTiposAccionesTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoRubroEmplea"));
					
		this.jComboBoxTiposSeleccionarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoRubroEmplea"));
			
		this.jTextFieldValorCampoGeneralTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoRubroEmplea"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonidTipoRubroEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRubroEmpleaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtoncodigoTipoRubroEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRubroEmpleaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonnombreTipoRubroEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRubroEmpleaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoRubroEmplea!=null) {
				this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRubroEmplea"));
				this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRubroEmplea"));
				this.jInternalFrameReporteDinamicoTipoRubroEmplea.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRubroEmplea"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRubroEmplea"));				
			//this.jButtonGenerarReporteDinamicoTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRubroEmplea"));
			//this.jButtonGenerarExcelReporteDinamicoTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRubroEmplea"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoRubroEmplea!=null) {
				this.jInternalFrameImportacionTipoRubroEmplea.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRubroEmplea"));
				this.jInternalFrameImportacionTipoRubroEmplea.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRubroEmplea"));
				this.jInternalFrameImportacionTipoRubroEmplea.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRubroEmplea"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoRubroEmplea"));
			
			this.jButtonAbrirOrderByToolBarTipoRubroEmplea.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoRubroEmplea"));			
			
			if(this.jInternalFrameOrderByTipoRubroEmplea!=null) {
				this.jInternalFrameOrderByTipoRubroEmplea.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRubroEmplea"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRubroEmplea.jTabbedPaneRelacionesTipoRubroEmplea.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRubroEmplea"));
		
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
            		closingInternalFrameTipoRubroEmplea();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoRubroEmplea.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoRubroEmplea = (JInternalFrameBase)event.getSource();
	            	
	            TipoRubroEmpleaBeanSwingJInternalFrame jInternalFrameParent=(TipoRubroEmpleaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRubroEmplea.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoRubroEmpleaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoRubroEmplea.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoRubroEmpleaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoRubroEmplea.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoRubroEmplea.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRubroEmpleaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRubroEmpleaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRubroEmpleaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoRubroEmplea";
		inputMap = this.jButtonNuevoTipoRubroEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoRubroEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRubroEmpleaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRubroEmpleaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRubroEmpleaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRubroEmpleaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoRubroEmplea";
		inputMap = this.jButtonNuevoRelacionesTipoRubroEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoRubroEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRubroEmpleaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoRubroEmplea";
		inputMap = this.jButtonModificarTipoRubroEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoRubroEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoRubroEmpleaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoRubroEmplea";
		inputMap = this.jButtonActualizarTipoRubroEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoRubroEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoRubroEmpleaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoRubroEmplea";
		inputMap = this.jButtonEliminarTipoRubroEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoRubroEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoRubroEmpleaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoRubroEmplea";
		inputMap = this.jButtonCancelarTipoRubroEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoRubroEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoRubroEmpleaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoRubroEmplea";
		inputMap = this.jButtonCerrarTipoRubroEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoRubroEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoRubroEmpleaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonGuardarCambiosTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoRubroEmplea";
		inputMap = this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonGuardarCambiosTipoRubroEmplea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonGuardarCambiosTipoRubroEmplea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoRubroEmpleaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoRubroEmplea.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoRubroEmpleaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoRubroEmplea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoRubroEmpleaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoRubroEmplea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoRubroEmpleaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoRubroEmplea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoRubroEmpleaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonidTipoRubroEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRubroEmpleaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtoncodigoTipoRubroEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRubroEmpleaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRubroEmplea.jButtonnombreTipoRubroEmpleaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRubroEmpleaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoRubroEmplea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoRubroEmpleaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoRubroEmpleaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoRubroEmplea.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoRubroEmplea(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoRubroEmplea tiporubroempleaAux:this.tiporubroempleaLogic.getTipoRubroEmpleas()) {
					tiporubroempleaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRubroEmplea tiporubroempleaAux:tiporubroempleas) {
					tiporubroempleaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoRubroEmpleaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRubroEmplea(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRubroEmplea tiporubroempleaAux:this.tiporubroempleaLogic.getTipoRubroEmpleas()) {
						tiporubroempleaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRubroEmplea tiporubroempleaAux:tiporubroempleas) {
						tiporubroempleaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoRubroEmplea tiporubroempleaAux:this.tiporubroempleaLogic.getTipoRubroEmpleas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRubroEmplea tiporubroempleaAux:tiporubroempleas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRubroEmplea(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRubroEmplea.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRubroEmplea.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRubroEmplea,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoRubroEmpleaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRubroEmplea(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoRubroEmplea.getSelectedRows();
			
			TipoRubroEmplea tiporubroempleaLocal=new TipoRubroEmplea();
			
			//this.seleccionarTodosTipoRubroEmplea(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporubroempleaLocal =(TipoRubroEmplea) this.tiporubroempleaLogic.getTipoRubroEmpleas().toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tiporubroempleaLocal =(TipoRubroEmplea) this.tiporubroempleas.toArray()[this.jTableDatosTipoRubroEmplea.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tiporubroempleaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRubroEmplea tiporubroempleaAux:this.tiporubroempleaLogic.getTipoRubroEmpleas()) {
						tiporubroempleaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRubroEmplea tiporubroempleaAux:tiporubroempleas) {
						tiporubroempleaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoRubroEmplea(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRubroEmplea.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRubroEmplea.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRubroEmplea,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoRubroEmpleaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoRubroEmpleaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoRubroEmpleaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoRubroEmplea(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoRubroEmplea.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRubroEmplea tiporubroempleaAux:this.tiporubroempleaLogic.getTipoRubroEmpleas()) {
				
						if(sTipoSeleccionar.equals(TipoRubroEmpleaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiporubroempleaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRubroEmpleaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporubroempleaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRubroEmplea tiporubroempleaAux:tiporubroempleas) {
					
						if(sTipoSeleccionar.equals(TipoRubroEmpleaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiporubroempleaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRubroEmpleaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporubroempleaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRubroEmplea(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoRubroEmpleaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoRubroEmplea(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoRubroEmplea=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoRubroEmplea.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoRubroEmplea.jComboBoxTiposAccionesFormularioTipoRubroEmplea.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoRubroEmplea) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoRubroEmplea(conSplash);
				
					this.generarReporteTipoRubroEmpleasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRubroEmplea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRubroEmplea.jComboBoxTiposAccionesFormularioTipoRubroEmplea.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoRubroEmpleasSeleccionados();
				//this.jComboBoxTiposAccionesTipoRubroEmplea.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRubroEmpleasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoRubroEmplea.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRubroEmpleasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoRubroEmplea.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRubroEmplea();
				
				this.exportarTipoRubroEmpleasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRubroEmplea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRubroEmplea.jComboBoxTiposAccionesFormularioTipoRubroEmplea.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoRubroEmpleas();
				//this.importarTipoRubroEmpleas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRubroEmplea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRubroEmplea.jComboBoxTiposAccionesFormularioTipoRubroEmplea.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRubroEmplea();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoRubroEmpleasSeleccionados();
				//this.jComboBoxTiposAccionesTipoRubroEmplea.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Rubro", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoRubroEmplea();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoRubroEmplea)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoRubroEmplea(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Rubro",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRubroEmplea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRubroEmplea.jComboBoxTiposAccionesFormularioTipoRubroEmplea.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoRubroEmpleaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoRubroEmplea) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoRubroEmplea(conSplash);
					
						//this.actualizarParametrosGeneralTipoRubroEmplea();
						
						this.generarReporteProcesoAccionTipoRubroEmpleasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoRubroEmplea.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoRubroEmplea.jComboBoxTiposAccionesFormularioTipoRubroEmplea.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoRubroEmpleaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo RubroS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Rubro", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoRubroEmplea();
				
						this.actualizarParametrosGeneralTipoRubroEmplea();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tiporubroempleaReturnGeneral=tiporubroempleaLogic.procesarAccionTipoRubroEmpleasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tiporubroempleaLogic.getTipoRubroEmpleas(),this.tiporubroempleaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoRubroEmpleaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoRubroEmplea.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoRubroEmplea.jComboBoxTiposAccionesFormularioTipoRubroEmplea.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoRubroEmplea();
					
					TipoRubroEmpleaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoRubroEmpleaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoRubroEmplea.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoRubroEmplea.jComboBoxTiposAccionesFormularioTipoRubroEmplea.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoRubroEmplea(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoRubroEmpleaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoRubroEmplea();
			
			if(this.jInternalFrameDetalleFormTipoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoRubroEmplea> tiporubroempleasSeleccionados=new ArrayList<TipoRubroEmplea>();		
			TipoRubroEmplea tiporubroemplea=new TipoRubroEmplea();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoRubroEmplea(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoRubroEmplea.getSelectedItem();
			
			
			
			
			tiporubroempleasSeleccionados=this.getTipoRubroEmpleasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tiporubroempleasSeleccionados.size()==1) {
				for(TipoRubroEmplea tiporubroempleaAux:tiporubroempleasSeleccionados) {
					tiporubroemplea=tiporubroempleaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Rubro Emplea")) {
					jButtonRubroEmpleaActionPerformed(null,rowIndex,true,false,tiporubroemplea);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoRubroEmplea();
			
      		//this.finishProcessTipoRubroEmplea(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoRubroEmpleaReturnGeneral() throws Exception {
		if(this.tiporubroempleaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tiporubroempleaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tiporubroempleaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tiporubroempleaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tiporubroempleaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tiporubroempleaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoRubroEmplea(false);
		}
		
		if(this.tiporubroempleaReturnGeneral.getConRetornoLista() || this.tiporubroempleaReturnGeneral.getConRetornoObjeto()) {
			if(this.tiporubroempleaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporubroempleaLogic.setTipoRubroEmpleas(this.tiporubroempleaReturnGeneral.getTipoRubroEmpleas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tiporubroempleaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporubroempleaLogic.setTipoRubroEmplea(this.tiporubroempleaReturnGeneral.getTipoRubroEmplea());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoRubroEmplea(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoRubroEmplea() throws Exception {
		
		
	}
	
	public ArrayList<TipoRubroEmplea> getTipoRubroEmpleasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoRubroEmplea> tiporubroempleasSeleccionados=new ArrayList<TipoRubroEmplea>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoRubroEmplea) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoRubroEmplea tiporubroempleaAux:tiporubroempleaLogic.getTipoRubroEmpleas()) {
					if(tiporubroempleaAux.getIsSelected()) {
						tiporubroempleasSeleccionados.add(tiporubroempleaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRubroEmplea tiporubroempleaAux:this.tiporubroempleas) {
					if(tiporubroempleaAux.getIsSelected()) {
						tiporubroempleasSeleccionados.add(tiporubroempleaAux);				
					}
				}
			}
			
			if(tiporubroempleasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tiporubroempleasSeleccionados.addAll(this.tiporubroempleaLogic.getTipoRubroEmpleas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tiporubroempleasSeleccionados.addAll(this.tiporubroempleas);				
					}
				}
			}
		} else {
			tiporubroempleasSeleccionados.add(this.tiporubroemplea);
		}
		
		return tiporubroempleasSeleccionados;
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
	
	public void generarReporteTipoRubroEmpleasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoRubroEmpleasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoRubroEmpleasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRubroEmpleasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRubroEmpleasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoRubroEmpleasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Rubro",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoRubroEmpleasSeleccionados() throws Exception {
		ArrayList<TipoRubroEmplea> tiporubroempleasSeleccionados=new ArrayList<TipoRubroEmplea>();		
		
		tiporubroempleasSeleccionados=this.getTipoRubroEmpleasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoRubroEmpleas("Todos",tiporubroempleasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoRubroEmpleasSeleccionados() throws Exception {
		ArrayList<TipoRubroEmplea> tiporubroempleasSeleccionados=new ArrayList<TipoRubroEmplea>();		
		
		tiporubroempleasSeleccionados=this.getTipoRubroEmpleasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoRubroEmpleas("Todos",tiporubroempleasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoRubroEmpleasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoRubroEmplea> tiporubroempleasSeleccionados=new ArrayList<TipoRubroEmplea>();
		
		tiporubroempleasSeleccionados=this.getTipoRubroEmpleasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoRubroEmpleas("Todos",tiporubroempleasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoRubroEmpleasSeleccionados() throws Exception {
		ArrayList<TipoRubroEmplea> tiporubroempleasSeleccionados=new ArrayList<TipoRubroEmplea>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoRubroEmplea();
		
		
		tiporubroempleasSeleccionados=this.getTipoRubroEmpleasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoRubroEmplea();
		
		
		//this.generarReporteTipoRubroEmpleas("Todos",tiporubroempleasSeleccionados ,tiporubroempleaImplementable,tiporubroempleaImplementableHome);
	}
	
	public void mostrarImportacionTipoRubroEmpleas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoRubroEmplea();
		
		this.abrirFrameImportacionTipoRubroEmplea();		
		
			
		//this.generarReporteTipoRubroEmpleas("Todos",tiporubroempleasSeleccionados ,tiporubroempleaImplementable,tiporubroempleaImplementableHome);
	}
	
	public void importarTipoRubroEmpleas() throws Exception {		
	
	}
	
	public void exportarTipoRubroEmpleasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoRubroEmpleasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoRubroEmpleasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoRubroEmpleasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Rubro",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoRubroEmpleasSeleccionados() throws Exception {
		ArrayList<TipoRubroEmplea> tiporubroempleasSeleccionados=new ArrayList<TipoRubroEmplea>();		
		
		tiporubroempleasSeleccionados=this.getTipoRubroEmpleasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporubroemplea."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoRubroEmplea(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoRubroEmplea tiporubroempleaAux:tiporubroempleasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoRubroEmplea(tiporubroempleaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tiporubroempleaAux.setsDetalleGeneralEntityReporte(tiporubroempleaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rubro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoRubroEmplea(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoRubroEmpleaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRubroEmpleaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRubroEmpleaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRubroEmpleaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoRubroEmplea(TipoRubroEmplea tiporubroemplea,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tiporubroemplea.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporubroemplea.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporubroemplea.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporubroemplea.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoRubroEmpleasSeleccionados() throws Exception {
		ArrayList<TipoRubroEmplea> tiporubroempleasSeleccionados=new ArrayList<TipoRubroEmplea>();		
		
		tiporubroempleasSeleccionados=this.getTipoRubroEmpleasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporubroemplea.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoRubroEmpleas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoRubroEmplea(row);				
				iRow++;
			}				
			
			for(TipoRubroEmplea tiporubroempleaAux:tiporubroempleasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoRubroEmplea(tiporubroempleaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rubro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoRubroEmpleasSeleccionados() throws Exception {
		ArrayList<TipoRubroEmplea> tiporubroempleasSeleccionados=new ArrayList<TipoRubroEmplea>();		
		
		tiporubroempleasSeleccionados=this.getTipoRubroEmpleasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporubroemplea.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tiporubroempleas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tiporubroemplea");
			//elementRoot.appendChild(element);
		
			for(TipoRubroEmplea tiporubroempleaAux:tiporubroempleasSeleccionados) {
				element = document.createElement("tiporubroemplea");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoRubroEmplea(tiporubroempleaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rubro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoRubroEmplea(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRubroEmpleaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRubroEmpleaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoRubroEmpleaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRubroEmpleaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoRubroEmplea(TipoRubroEmplea tiporubroemplea,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tiporubroemplea.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporubroemplea.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporubroemplea.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoRubroEmplea(TipoRubroEmplea tiporubroemplea,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoRubroEmpleaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tiporubroemplea.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoRubroEmpleaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tiporubroemplea.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoRubroEmpleaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tiporubroemplea.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoRubroEmpleaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tiporubroemplea.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoRubroEmpleasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoRubroEmplea> tiporubroempleasSeleccionados=new ArrayList<TipoRubroEmplea>();
		
		tiporubroempleasSeleccionados=this.getTipoRubroEmpleasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoRubroEmplea(tiporubroempleasSeleccionados);
		
		this.generarReporteTipoRubroEmpleas("Todos",tiporubroempleasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoRubroEmplea(ArrayList<TipoRubroEmplea> tiporubroempleasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoRubroEmplea tiporubroempleaAux:tiporubroempleasSeleccionados) {
				tiporubroempleaAux.setsDetalleGeneralEntityReporte(tiporubroempleaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoRubroEmpleaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tiporubroempleaAux.setsDescripcionGeneralEntityReporte1(tiporubroempleaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoRubroEmpleaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tiporubroempleaAux.setsDescripcionGeneralEntityReporte1(tiporubroempleaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRubroEmpleaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoRubroEmplea(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoRubroEmplea=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoRubroEmplea=true;
				this.isVisibilidadCeldaGuardarCambiosTipoRubroEmplea=true;
			}
			
			this.isVisibilidadCeldaModificarTipoRubroEmplea=false;
			this.isVisibilidadCeldaActualizarTipoRubroEmplea=false;
			this.isVisibilidadCeldaEliminarTipoRubroEmplea=false;
			this.isVisibilidadCeldaCancelarTipoRubroEmplea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRubroEmplea=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRubroEmplea=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoRubroEmplea=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRubroEmplea=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRubroEmplea=false;
			this.isVisibilidadCeldaModificarTipoRubroEmplea=false;
			this.isVisibilidadCeldaActualizarTipoRubroEmplea=true;
			this.isVisibilidadCeldaEliminarTipoRubroEmplea=false;
			this.isVisibilidadCeldaCancelarTipoRubroEmplea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRubroEmplea=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRubroEmplea=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoRubroEmplea=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRubroEmplea=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRubroEmplea=false;
			this.isVisibilidadCeldaModificarTipoRubroEmplea=false;
			this.isVisibilidadCeldaActualizarTipoRubroEmplea=true;
			this.isVisibilidadCeldaEliminarTipoRubroEmplea=true;
			this.isVisibilidadCeldaCancelarTipoRubroEmplea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRubroEmplea=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRubroEmplea=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoRubroEmplea=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRubroEmplea=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRubroEmplea=false;
			this.isVisibilidadCeldaModificarTipoRubroEmplea=false;
			this.isVisibilidadCeldaActualizarTipoRubroEmplea=true;
			this.isVisibilidadCeldaEliminarTipoRubroEmplea=false;
			this.isVisibilidadCeldaCancelarTipoRubroEmplea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRubroEmplea=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRubroEmplea=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoRubroEmplea=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRubroEmplea=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRubroEmplea=true;
			this.isVisibilidadCeldaModificarTipoRubroEmplea=false;
			this.isVisibilidadCeldaActualizarTipoRubroEmplea=false;
			this.isVisibilidadCeldaEliminarTipoRubroEmplea=false;
			this.isVisibilidadCeldaCancelarTipoRubroEmplea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRubroEmplea=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRubroEmplea=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoRubroEmplea=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRubroEmplea=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRubroEmplea=false;
			this.isVisibilidadCeldaActualizarTipoRubroEmplea=false;
			this.isVisibilidadCeldaEliminarTipoRubroEmplea=false;
			this.isVisibilidadCeldaCancelarTipoRubroEmplea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRubroEmplea=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRubroEmplea=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoRubroEmplea=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRubroEmplea=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRubroEmplea=false;
			this.isVisibilidadCeldaModificarTipoRubroEmplea=true;
			this.isVisibilidadCeldaActualizarTipoRubroEmplea=false;
			this.isVisibilidadCeldaEliminarTipoRubroEmplea=false;
			this.isVisibilidadCeldaCancelarTipoRubroEmplea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRubroEmplea=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRubroEmplea=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoRubroEmpleaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoRubroEmplea=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRubroEmplea=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRubroEmplea=true;
		} else {
			this.actualizarEstadoPanelsTipoRubroEmplea(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoRubroEmplea=false;
			//this.isVisibilidadCeldaVerFormTipoRubroEmplea=false;
			this.isVisibilidadCeldaDuplicarTipoRubroEmplea=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tiporubroempleaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRubroEmplea=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoRubroEmplea=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRubroEmplea=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
			if(!tiporubroempleaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoRubroEmplea=false;												
			}
			
			this.jButtonCerrarTipoRubroEmplea.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRubroEmplea=false;
		}
		
		if(!this.permiteMantenimiento(this.tiporubroemplea)) {
			this.isVisibilidadCeldaActualizarTipoRubroEmplea=false;
			this.isVisibilidadCeldaEliminarTipoRubroEmplea=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRubroEmplea() {
		this.isVisibilidadCeldaNuevoTipoRubroEmplea=false;
		this.isVisibilidadCeldaGuardarCambiosTipoRubroEmplea=false;
	}
	
	public void actualizarEstadoPanelsTipoRubroEmplea(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoRubroEmplea!=null) {
				this.jScrollPanelDatosEdicionTipoRubroEmplea.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRubroEmplea!=null) {
				this.jScrollPanelDatosTipoRubroEmplea.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRubroEmplea!=null) {
				this.jPanelPaginacionTipoRubroEmplea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRubroEmplea!=null) {
				this.jPanelParametrosReportesTipoRubroEmplea.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoRubroEmplea!=null) {
				this.jScrollPanelDatosEdicionTipoRubroEmplea.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoRubroEmplea!=null) {
				this.jScrollPanelDatosTipoRubroEmplea.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRubroEmplea!=null) {
				this.jPanelPaginacionTipoRubroEmplea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRubroEmplea!=null) {
				this.jPanelParametrosReportesTipoRubroEmplea.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoRubroEmplea!=null) {
				this.jScrollPanelDatosEdicionTipoRubroEmplea.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoRubroEmplea!=null) {
				this.jScrollPanelDatosTipoRubroEmplea.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRubroEmplea!=null) {
				this.jPanelPaginacionTipoRubroEmplea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRubroEmplea!=null) {
				this.jPanelParametrosReportesTipoRubroEmplea.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoRubroEmplea!=null) {
				this.jScrollPanelDatosEdicionTipoRubroEmplea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRubroEmplea!=null) {
				this.jScrollPanelDatosTipoRubroEmplea.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRubroEmplea!=null) {
				this.jPanelPaginacionTipoRubroEmplea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRubroEmplea!=null) {
				this.jPanelParametrosReportesTipoRubroEmplea.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoRubroEmplea!=null) {
				this.jScrollPanelDatosEdicionTipoRubroEmplea.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRubroEmplea!=null) {
				this.jScrollPanelDatosTipoRubroEmplea.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRubroEmplea!=null) {
				this.jPanelPaginacionTipoRubroEmplea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRubroEmplea!=null) {
				this.jPanelParametrosReportesTipoRubroEmplea.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoRubroEmplea!=null) {
				this.jScrollPanelDatosEdicionTipoRubroEmplea.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoRubroEmplea!=null) {
				this.jScrollPanelDatosTipoRubroEmplea.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRubroEmplea!=null) {
				this.jPanelPaginacionTipoRubroEmplea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRubroEmplea!=null) {
				this.jPanelParametrosReportesTipoRubroEmplea.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoRubroEmplea!=null) {
				this.jScrollPanelDatosEdicionTipoRubroEmplea.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoRubroEmplea!=null) {
				this.jScrollPanelDatosTipoRubroEmplea.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRubroEmplea!=null) {
				this.jPanelPaginacionTipoRubroEmplea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRubroEmplea!=null) {
				this.jPanelParametrosReportesTipoRubroEmplea.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoRubroEmpleaParaRubroEmpleas() throws Exception {
		Boolean isPaginaPopupRubroEmplea=false;

		try {

			if(this.tiporubroempleaSessionBean==null) {
				this.tiporubroempleaSessionBean=new TipoRubroEmpleaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaSessionBean=new RubroEmpleaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaSessionBean.setsPathNavegacionActual(tiporubroempleaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+RubroEmpleaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupRubroEmplea=this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeRubroEmplea(true);
			this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeRubroEmplea(TipoRubroEmpleaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaSessionBean.setisBusquedaDesdeForeignKeySesionTipoRubroEmplea(true);
			this.jInternalFrameDetalleFormTipoRubroEmplea.rubroempleaSessionBean.setlidTipoRubroEmpleaActual(this.idTipoRubroEmpleaActual);

			tiporubroempleaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoRubroEmplea(true);
			tiporubroempleaSessionBean.setlIdTipoRubroEmpleaActualForeignKey(this.idTipoRubroEmpleaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoRubroEmpleaSessionBean tiporubroempleaSessionBean=new TipoRubroEmpleaSessionBean();
		
		if(this.tiporubroempleaSessionBean==null) {
			this.tiporubroempleaSessionBean=new TipoRubroEmpleaSessionBean();
		}
		
		this.tiporubroempleaSessionBean.setsUltimaBusquedaTipoRubroEmplea(this.getsAccionBusqueda());
		this.tiporubroempleaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tiporubroempleaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoRubroEmpleaSessionBean tiporubroempleaSessionBean=new TipoRubroEmpleaSessionBean();
		
		if(this.tiporubroempleaSessionBean==null) {
			this.tiporubroempleaSessionBean=new TipoRubroEmpleaSessionBean();
		}
		
		if(this.tiporubroempleaSessionBean.getsUltimaBusquedaTipoRubroEmplea()!=null&&!this.tiporubroempleaSessionBean.getsUltimaBusquedaTipoRubroEmplea().equals("")) {
			this.setsAccionBusqueda(tiporubroempleaSessionBean.getsUltimaBusquedaTipoRubroEmplea());
			this.setiNumeroPaginacion(tiporubroempleaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tiporubroempleaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tiporubroempleaSessionBean.setsUltimaBusquedaTipoRubroEmplea("");
		this.tiporubroempleaSessionBean.setiNumeroPaginacion(TipoRubroEmpleaConstantesFunciones.INUMEROPAGINACION);
		this.tiporubroempleaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoRubroEmplea(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoRubroEmplea() {
		this.updateBorderResaltarBusquedasFormularioTipoRubroEmplea();
		this.updateVisibilidadBusquedasFormularioTipoRubroEmplea();
		this.updateHabilitarBusquedasFormularioTipoRubroEmplea();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoRubroEmplea() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoRubroEmplea() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoRubroEmplea() {
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
	
	public void updateControlesFormularioTipoRubroEmplea() throws Exception {

		if(this.jInternalFrameDetalleFormTipoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoRubroEmplea();
		this.updateVisibilidadResaltarControlesFormularioTipoRubroEmplea();
		this.updateHabilitarResaltarControlesFormularioTipoRubroEmplea();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoRubroEmplea() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tiporubroempleaConstantesFunciones.resaltaridTipoRubroEmplea!=null && this.jInternalFrameDetalleFormTipoRubroEmplea!=null) {this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldidTipoRubroEmplea.setBorder(this.tiporubroempleaConstantesFunciones.resaltaridTipoRubroEmplea);}
		if(this.tiporubroempleaConstantesFunciones.resaltarcodigoTipoRubroEmplea!=null && this.jInternalFrameDetalleFormTipoRubroEmplea!=null) {this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldcodigoTipoRubroEmplea.setBorder(this.tiporubroempleaConstantesFunciones.resaltarcodigoTipoRubroEmplea);}
		if(this.tiporubroempleaConstantesFunciones.resaltarnombreTipoRubroEmplea!=null && this.jInternalFrameDetalleFormTipoRubroEmplea!=null) {this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldnombreTipoRubroEmplea.setBorder(this.tiporubroempleaConstantesFunciones.resaltarnombreTipoRubroEmplea);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoRubroEmplea() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) {
	
		//this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldidTipoRubroEmplea.setVisible(this.tiporubroempleaConstantesFunciones.mostraridTipoRubroEmplea);
		this.jInternalFrameDetalleFormTipoRubroEmplea.jPanelidTipoRubroEmplea.setVisible(this.tiporubroempleaConstantesFunciones.mostraridTipoRubroEmplea);
		//this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldcodigoTipoRubroEmplea.setVisible(this.tiporubroempleaConstantesFunciones.mostrarcodigoTipoRubroEmplea);
		this.jInternalFrameDetalleFormTipoRubroEmplea.jPanelcodigoTipoRubroEmplea.setVisible(this.tiporubroempleaConstantesFunciones.mostrarcodigoTipoRubroEmplea);
		//this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldnombreTipoRubroEmplea.setVisible(this.tiporubroempleaConstantesFunciones.mostrarnombreTipoRubroEmplea);
		this.jInternalFrameDetalleFormTipoRubroEmplea.jPanelnombreTipoRubroEmplea.setVisible(this.tiporubroempleaConstantesFunciones.mostrarnombreTipoRubroEmplea);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoRubroEmplea() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRubroEmplea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRubroEmplea!=null) {
	
		this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldidTipoRubroEmplea.setEnabled(this.tiporubroempleaConstantesFunciones.activaridTipoRubroEmplea);
		this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldcodigoTipoRubroEmplea.setEnabled(this.tiporubroempleaConstantesFunciones.activarcodigoTipoRubroEmplea);
		this.jInternalFrameDetalleFormTipoRubroEmplea.jTextFieldnombreTipoRubroEmplea.setEnabled(this.tiporubroempleaConstantesFunciones.activarnombreTipoRubroEmplea);
		}
	}
	
		
}