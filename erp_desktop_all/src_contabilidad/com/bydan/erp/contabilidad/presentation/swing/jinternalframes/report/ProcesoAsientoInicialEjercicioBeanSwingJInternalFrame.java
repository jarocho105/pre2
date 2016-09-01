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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.contabilidad.util.ProcesoAsientoInicialEjercicioConstantesFunciones;
import com.bydan.erp.contabilidad.util.report.ProcesoAsientoInicialEjercicioParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.report.ProcesoAsientoInicialEjercicioParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.report.ProcesoAsientoInicialEjercicioBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.contabilidad.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.contabilidad.util.*;

import com.bydan.erp.contabilidad.util.report.*;
import com.bydan.erp.contabilidad.business.logic.report.*;

import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;

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


import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProcesoAsientoInicialEjercicioBeanSwingJInternalFrame extends ProcesoAsientoInicialEjercicioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoAsientoInicialEjercicioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoAsientoInicialEjercicio> procesoasientoinicialejercicioValidator = new ClassValidator<ProcesoAsientoInicialEjercicio>(ProcesoAsientoInicialEjercicio.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio;	
	public ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux;
	public ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioTotales;
	public Long idProcesoAsientoInicialEjercicioActual;
	public Long iIdNuevoProcesoAsientoInicialEjercicio=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboTipoDocumento="";

	public List<TipoDocumento> tipodocumentosForeignKey;

	public List<TipoDocumento> gettipodocumentosForeignKey() {
		return tipodocumentosForeignKey;
	}

	public void settipodocumentosForeignKey(List<TipoDocumento> tipodocumentosForeignKey) {
		this.tipodocumentosForeignKey = tipodocumentosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoDocumento tipodocumentoForeignKey;

	public TipoDocumento gettipodocumentoForeignKey() {
		return tipodocumentoForeignKey;
	}

	public void settipodocumentoForeignKey(TipoDocumento tipodocumentoForeignKey) {
		this.tipodocumentoForeignKey = tipodocumentoForeignKey;
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
	
	public Boolean isPermisoTodoProcesoAsientoInicialEjercicio;
	public Boolean isPermisoNuevoProcesoAsientoInicialEjercicio;
	public Boolean isPermisoActualizarProcesoAsientoInicialEjercicio;
	public Boolean isPermisoActualizarOriginalProcesoAsientoInicialEjercicio;
	public Boolean isPermisoEliminarProcesoAsientoInicialEjercicio;
	public Boolean isPermisoGuardarCambiosProcesoAsientoInicialEjercicio;
	public Boolean isPermisoConsultaProcesoAsientoInicialEjercicio;
	public Boolean isPermisoBusquedaProcesoAsientoInicialEjercicio;
	public Boolean isPermisoReporteProcesoAsientoInicialEjercicio;
	public Boolean isPermisoPaginacionMedioProcesoAsientoInicialEjercicio;
	public Boolean isPermisoPaginacionAltoProcesoAsientoInicialEjercicio;
	public Boolean isPermisoPaginacionTodoProcesoAsientoInicialEjercicio;
	public Boolean isPermisoCopiarProcesoAsientoInicialEjercicio;
	public Boolean isPermisoVerFormProcesoAsientoInicialEjercicio;
	public Boolean isPermisoDuplicarProcesoAsientoInicialEjercicio;
	public Boolean isPermisoOrdenProcesoAsientoInicialEjercicio;
	
	
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
	
	public ProcesoAsientoInicialEjercicioParameterReturnGeneral procesoasientoinicialejercicioReturnGeneral;
	public ProcesoAsientoInicialEjercicioParameterReturnGeneral procesoasientoinicialejercicioParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoAsientoInicialEjercicio=false;
	public Boolean esParaAccionDesdeFormularioProcesoAsientoInicialEjercicio=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoAsientoInicialEjercicioSessionBeanAdditional procesoasientoinicialejercicioSessionBeanAdditional=null;
	
	public ProcesoAsientoInicialEjercicioSessionBeanAdditional getProcesoAsientoInicialEjercicioSessionBeanAdditional() {
		return this.procesoasientoinicialejercicioSessionBeanAdditional;
	}
	
	public void setProcesoAsientoInicialEjercicioSessionBeanAdditional(ProcesoAsientoInicialEjercicioSessionBeanAdditional procesoasientoinicialejercicioSessionBeanAdditional) {
		try {
			this.procesoasientoinicialejercicioSessionBeanAdditional=procesoasientoinicialejercicioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional procesoasientoinicialejercicioBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoAsientoInicialEjercicioBeanSwingJInternalFrame
	
	public ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional getProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional() {
		return this.procesoasientoinicialejercicioBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional(ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional procesoasientoinicialejercicioBeanSwingJInternalFrameAdditional) {
		try {
			this.procesoasientoinicialejercicioBeanSwingJInternalFrameAdditional=procesoasientoinicialejercicioBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoAsientoInicialEjercicioLogic procesoasientoinicialejercicioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioBean;
	public ProcesoAsientoInicialEjercicioConstantesFunciones procesoasientoinicialejercicioConstantesFunciones;
	//public ProcesoAsientoInicialEjercicioParameterReturnGeneral procesoasientoinicialejercicioReturnGeneral;
	
	//FK
	
	public TipoDocumentoLogic tipodocumentoLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoAsientoInicialEjercicio> procesoasientoinicialejercicios;	
	//public List<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosEliminados;
	//public List<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoAsientoInicialEjercicio=true;
	public Boolean isVisibilidadCeldaCopiarProcesoAsientoInicialEjercicio=true;
	public Boolean isVisibilidadCeldaVerFormProcesoAsientoInicialEjercicio=true;
	public Boolean isVisibilidadCeldaOrdenProcesoAsientoInicialEjercicio=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio=false;
	public Boolean isVisibilidadCeldaModificarProcesoAsientoInicialEjercicio=false;
	public Boolean isVisibilidadCeldaActualizarProcesoAsientoInicialEjercicio=false;
	public Boolean isVisibilidadCeldaEliminarProcesoAsientoInicialEjercicio=false;
	public Boolean isVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio=false;
	public Boolean isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoAsientoInicialEjercicio=false;
	public Boolean isVisibilidadFK_IdTipoDocumento=false;
	
	public Long getiIdNuevoProcesoAsientoInicialEjercicio() {
		return this.iIdNuevoProcesoAsientoInicialEjercicio;
	}

	public void setiIdNuevoProcesoAsientoInicialEjercicio(Long iIdNuevoProcesoAsientoInicialEjercicio) {
		this.iIdNuevoProcesoAsientoInicialEjercicio = iIdNuevoProcesoAsientoInicialEjercicio;
	}
	
	public Long getidProcesoAsientoInicialEjercicioActual() {
		return this.idProcesoAsientoInicialEjercicioActual;
	}

	public void setidProcesoAsientoInicialEjercicioActual(Long idProcesoAsientoInicialEjercicioActual) {
		this.idProcesoAsientoInicialEjercicioActual = idProcesoAsientoInicialEjercicioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoAsientoInicialEjercicio getprocesoasientoinicialejercicio() {
		return this.procesoasientoinicialejercicio;
	}

	public void setprocesoasientoinicialejercicio(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio) {
		this.procesoasientoinicialejercicio = procesoasientoinicialejercicio;
	}
	
	public ProcesoAsientoInicialEjercicio getprocesoasientoinicialejercicioAux() {
		return this.procesoasientoinicialejercicioAux;
	}

	public void setprocesoasientoinicialejercicioAux(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux) {
		this.procesoasientoinicialejercicioAux = procesoasientoinicialejercicioAux;
	}				
	
	public ProcesoAsientoInicialEjercicio getprocesoasientoinicialejercicioAnterior() {
		return this.procesoasientoinicialejercicioAnterior;
	}

	public void setprocesoasientoinicialejercicioAnterior(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAnterior) {
		this.procesoasientoinicialejercicioAnterior = procesoasientoinicialejercicioAnterior;
	}	
	
	public ProcesoAsientoInicialEjercicio getprocesoasientoinicialejercicioTotales() {
		return this.procesoasientoinicialejercicioTotales;
	}

	public void setprocesoasientoinicialejercicioTotales(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioTotales) {
		this.procesoasientoinicialejercicioTotales = procesoasientoinicialejercicioTotales;
	}	
	
	public ProcesoAsientoInicialEjercicio getprocesoasientoinicialejercicioBean() {
		return this.procesoasientoinicialejercicioBean;
	}

	public void setprocesoasientoinicialejercicioBean(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioBean) {
		this.procesoasientoinicialejercicioBean = procesoasientoinicialejercicioBean;
	}	
	
	public ProcesoAsientoInicialEjercicioParameterReturnGeneral getprocesoasientoinicialejercicioReturnGeneral() {
		return this.procesoasientoinicialejercicioReturnGeneral;
	}

	public void setprocesoasientoinicialejercicioReturnGeneral(ProcesoAsientoInicialEjercicioParameterReturnGeneral procesoasientoinicialejercicioReturnGeneral) {
		this.procesoasientoinicialejercicioReturnGeneral = procesoasientoinicialejercicioReturnGeneral;
	}	
	
	
	public Long id_tipo_documentoBusquedaProcesoAsientoInicialEjercicio=-1L;

	public Long getid_tipo_documentoBusquedaProcesoAsientoInicialEjercicio() {
		return this.id_tipo_documentoBusquedaProcesoAsientoInicialEjercicio;
	}

	public void setid_tipo_documentoBusquedaProcesoAsientoInicialEjercicio(Long id_tipo_documentoBusquedaProcesoAsientoInicialEjercicio) {
		this.id_tipo_documentoBusquedaProcesoAsientoInicialEjercicio = id_tipo_documentoBusquedaProcesoAsientoInicialEjercicio;
	}

;
	public Date fecha_inicioBusquedaProcesoAsientoInicialEjercicio=new Date();

	public Date getfecha_inicioBusquedaProcesoAsientoInicialEjercicio() {
		return this.fecha_inicioBusquedaProcesoAsientoInicialEjercicio;
	}

	public void setfecha_inicioBusquedaProcesoAsientoInicialEjercicio(Date fecha_inicioBusquedaProcesoAsientoInicialEjercicio) {
		this.fecha_inicioBusquedaProcesoAsientoInicialEjercicio = fecha_inicioBusquedaProcesoAsientoInicialEjercicio;
	}

;
	public Date fecha_finBusquedaProcesoAsientoInicialEjercicio=new Date();

	public Date getfecha_finBusquedaProcesoAsientoInicialEjercicio() {
		return this.fecha_finBusquedaProcesoAsientoInicialEjercicio;
	}

	public void setfecha_finBusquedaProcesoAsientoInicialEjercicio(Date fecha_finBusquedaProcesoAsientoInicialEjercicio) {
		this.fecha_finBusquedaProcesoAsientoInicialEjercicio = fecha_finBusquedaProcesoAsientoInicialEjercicio;
	}

	public Long id_tipo_documentoFK_IdTipoDocumento=-1L;

	public Long getid_tipo_documentoFK_IdTipoDocumento() {
		return this.id_tipo_documentoFK_IdTipoDocumento;
	}

	public void setid_tipo_documentoFK_IdTipoDocumento(Long id_tipo_documentoFK_IdTipoDocumento) {
		this.id_tipo_documentoFK_IdTipoDocumento = id_tipo_documentoFK_IdTipoDocumento;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesoAsientoInicialEjercicioLogic getProcesoAsientoInicialEjercicioLogic()	{		
		return procesoasientoinicialejercicioLogic;
	}

	public void setProcesoAsientoInicialEjercicioLogic(ProcesoAsientoInicialEjercicioLogic procesoasientoinicialejercicioLogic) {
		this.procesoasientoinicialejercicioLogic = procesoasientoinicialejercicioLogic;
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
	
	public Boolean getIsEsNuevoProcesoAsientoInicialEjercicio() {
		return isEsNuevoProcesoAsientoInicialEjercicio;
	}

	public void setIsEsNuevoProcesoAsientoInicialEjercicio(Boolean isEsNuevoProcesoAsientoInicialEjercicio) {
		this.isEsNuevoProcesoAsientoInicialEjercicio = isEsNuevoProcesoAsientoInicialEjercicio;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoAsientoInicialEjercicio() {
		return esParaAccionDesdeFormularioProcesoAsientoInicialEjercicio;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoAsientoInicialEjercicio(Boolean esParaAccionDesdeFormularioProcesoAsientoInicialEjercicio) {
		this.esParaAccionDesdeFormularioProcesoAsientoInicialEjercicio = esParaAccionDesdeFormularioProcesoAsientoInicialEjercicio;
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
	
	
	public void cargarCombosTipoDocumentosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipodocumentosForeignKey=new ArrayList<TipoDocumento>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoDocumentoLogic tipodocumentoLogic=new TipoDocumentoLogic();

			tipodocumentoLogic.getTipoDocumentoDataAccess().setIsForForeingKeyData(true);

			if(this.procesoasientoinicialejercicioSessionBean==null) {
				this.procesoasientoinicialejercicioSessionBean=new ProcesoAsientoInicialEjercicioSessionBean();
			}

			if(!this.procesoasientoinicialejercicioSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumento()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentoLogic.getTipoDocumentoDataAccess().setIsForForeingKeyData(true);

					tipodocumentoLogic.getTodosTipoDocumentosWithConnection(sFinalQuery,new Pagination());

					this.tipodocumentosForeignKey=tipodocumentoLogic.getTipoDocumentos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoDocumento(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentoLogic.getEntityWithConnection(procesoasientoinicialejercicioSessionBean.getlidTipoDocumentoActual());
					this.tipodocumentosForeignKey.add(tipodocumentoLogic.getTipoDocumento());
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

	
	
	public void setActualTipoDocumentoForeignKey(Long idTipoDocumentoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoDocumento  tipodocumentoTemp=null;

			for(TipoDocumento tipodocumentoAux:tipodocumentosForeignKey) {
				if(tipodocumentoAux.getId()!=null && tipodocumentoAux.getId().equals(idTipoDocumentoSeleccionado)) {
					tipodocumentoTemp=tipodocumentoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipodocumentoTemp!=null) {

					if(this.procesoasientoinicialejercicio!=null) {
						this.procesoasientoinicialejercicio.setTipoDocumento(tipodocumentoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {
						this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.setSelectedItem(tipodocumentoTemp);
					}
				} else {
					//jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.setSelectedItem(tipodocumentoTemp);
					if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {
						if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoAsientoInicialEjercicio") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipodocumentoTemp!=null && jComboBoxid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio!=null) {
						jComboBoxid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setSelectedItem(tipodocumentoTemp);
					} else {
						if(jComboBoxid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio!=null) {
							//jComboBoxid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setSelectedItem(tipodocumentoTemp);
							if(jComboBoxid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.getItemCount()>0) {
								jComboBoxid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setSelectedIndex(0);
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

	public String getActualTipoDocumentoForeignKeyDescripcion(Long idTipoDocumentoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoDocumento  tipodocumentoTemp=null;

			for(TipoDocumento tipodocumentoAux:tipodocumentosForeignKey) {
				if(tipodocumentoAux.getId()!=null && tipodocumentoAux.getId().equals(idTipoDocumentoSeleccionado)) {
					tipodocumentoTemp=tipodocumentoAux;
					break;
				}
			}


			sDescripcion=TipoDocumentoConstantesFunciones.getTipoDocumentoDescripcion(tipodocumentoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoDocumentoForeignKeyGenerico(Long idTipoDocumentoSeleccionado,JComboBox jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicioGenerico)throws Exception
	{
		try
		{
			TipoDocumento  tipodocumentoTemp=null;

			for(TipoDocumento tipodocumentoAux:tipodocumentosForeignKey) {
				if(tipodocumentoAux.getId()!=null && tipodocumentoAux.getId().equals(idTipoDocumentoSeleccionado)) {
					tipodocumentoTemp=tipodocumentoAux;
					break;
				}
			}

			if(tipodocumentoTemp!=null) {
				jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicioGenerico.setSelectedItem(tipodocumentoTemp);
			} else {
				if(jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicioGenerico!=null && jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicioGenerico.getItemCount()>0) {
					jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoDocumentoForeignKey(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio,JComboBox jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicioGenerico)throws Exception
	{
		try
		{
			TipoDocumento  tipodocumentoAux=new TipoDocumento();

			if(jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicioGenerico==null) {
				tipodocumentoAux=(TipoDocumento)this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.getSelectedItem();
			} else {
				tipodocumentoAux=(TipoDocumento)jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicioGenerico.getSelectedItem();
			}

			if(tipodocumentoAux!=null && tipodocumentoAux.getId()!=null) {
				procesoasientoinicialejercicio.setid_tipo_documento(tipodocumentoAux.getId());
				procesoasientoinicialejercicio.settipodocumento_descripcion(ProcesoAsientoInicialEjercicioConstantesFunciones.getTipoDocumentoDescripcion(tipodocumentoAux));
				procesoasientoinicialejercicio.setTipoDocumento(tipodocumentoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoDocumentosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoDocumento=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) { 
							this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.removeAllItems();

							for(TipoDocumento tipodocumento:this.tipodocumentosForeignKey) {
								this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.addItem(tipodocumento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) { 
					}

					if(!ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoAsientoInicialEjercicio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.removeAllItems();

							for(TipoDocumento tipodocumento:this.tipodocumentosForeignKey) {
								this.jComboBoxid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.addItem(tipodocumento);
							}
						}

						if(!ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameTipoDocumentoForeignKey(TipoDocumento tipodocumento,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {
							this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.setSelectedItem(tipodocumento);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {
							this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setSelectedItem(tipodocumento);
						} else {
							this.jComboBoxid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoAsientoInicialEjercicio() throws Exception {
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
		
	public ProcesoAsientoInicialEjercicioParameterReturnGeneral getProcesoAsientoInicialEjercicioParameterGeneral() {
		return this.procesoasientoinicialejercicioParameterGeneral;
	}
	
	public void setProcesoAsientoInicialEjercicioParameterGeneral(ProcesoAsientoInicialEjercicioParameterReturnGeneral procesoasientoinicialejercicioParameterGeneral) {
		this.procesoasientoinicialejercicioParameterGeneral = procesoasientoinicialejercicioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoAsientoInicialEjercicio() {
		return isPermisoTodoProcesoAsientoInicialEjercicio;
	}

	public void setIsPermisoTodoProcesoAsientoInicialEjercicio(Boolean isPermisoTodoProcesoAsientoInicialEjercicio) {
		this.isPermisoTodoProcesoAsientoInicialEjercicio = isPermisoTodoProcesoAsientoInicialEjercicio;
	}

	public Boolean getIsPermisoNuevoProcesoAsientoInicialEjercicio() {
		return isPermisoNuevoProcesoAsientoInicialEjercicio;
	}

	public void setIsPermisoNuevoProcesoAsientoInicialEjercicio(Boolean isPermisoNuevoProcesoAsientoInicialEjercicio) {
		this.isPermisoNuevoProcesoAsientoInicialEjercicio = isPermisoNuevoProcesoAsientoInicialEjercicio;
	}

	public Boolean getIsPermisoActualizarProcesoAsientoInicialEjercicio() {
		return isPermisoActualizarProcesoAsientoInicialEjercicio;
	}

	public void setIsPermisoActualizarProcesoAsientoInicialEjercicio(Boolean isPermisoActualizarProcesoAsientoInicialEjercicio) {
		this.isPermisoActualizarProcesoAsientoInicialEjercicio = isPermisoActualizarProcesoAsientoInicialEjercicio;
	}

	public Boolean getIsPermisoEliminarProcesoAsientoInicialEjercicio() {
		return isPermisoEliminarProcesoAsientoInicialEjercicio;
	}

	public void setIsPermisoEliminarProcesoAsientoInicialEjercicio(Boolean isPermisoEliminarProcesoAsientoInicialEjercicio) {
		this.isPermisoEliminarProcesoAsientoInicialEjercicio = isPermisoEliminarProcesoAsientoInicialEjercicio;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoAsientoInicialEjercicio() {
		return isPermisoGuardarCambiosProcesoAsientoInicialEjercicio;
	}

	public void setIsPermisoGuardarCambiosProcesoAsientoInicialEjercicio(Boolean isPermisoGuardarCambiosProcesoAsientoInicialEjercicio) {
		this.isPermisoGuardarCambiosProcesoAsientoInicialEjercicio = isPermisoGuardarCambiosProcesoAsientoInicialEjercicio;
	}
	
	public Boolean getIsPermisoConsultaProcesoAsientoInicialEjercicio() {
		return isPermisoConsultaProcesoAsientoInicialEjercicio;
	}

	public void setIsPermisoConsultaProcesoAsientoInicialEjercicio(Boolean isPermisoConsultaProcesoAsientoInicialEjercicio) {
		this.isPermisoConsultaProcesoAsientoInicialEjercicio = isPermisoConsultaProcesoAsientoInicialEjercicio;
	}

	public Boolean getIsPermisoBusquedaProcesoAsientoInicialEjercicio() {
		return isPermisoBusquedaProcesoAsientoInicialEjercicio;
	}

	public void setIsPermisoBusquedaProcesoAsientoInicialEjercicio(Boolean isPermisoBusquedaProcesoAsientoInicialEjercicio) {
		this.isPermisoBusquedaProcesoAsientoInicialEjercicio = isPermisoBusquedaProcesoAsientoInicialEjercicio;
	}

	public Boolean getIsPermisoReporteProcesoAsientoInicialEjercicio() {
		return isPermisoReporteProcesoAsientoInicialEjercicio;
	}

	public void setIsPermisoReporteProcesoAsientoInicialEjercicio(Boolean isPermisoReporteProcesoAsientoInicialEjercicio) {
		this.isPermisoReporteProcesoAsientoInicialEjercicio = isPermisoReporteProcesoAsientoInicialEjercicio;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoAsientoInicialEjercicio() {
		return isPermisoPaginacionMedioProcesoAsientoInicialEjercicio;
	}

	public void setIsPermisoPaginacionMedioProcesoAsientoInicialEjercicio(Boolean isPermisoPaginacionMedioProcesoAsientoInicialEjercicio) {
		this.isPermisoPaginacionMedioProcesoAsientoInicialEjercicio = isPermisoPaginacionMedioProcesoAsientoInicialEjercicio;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoAsientoInicialEjercicio() {
		return isPermisoPaginacionTodoProcesoAsientoInicialEjercicio;
	}

	public void setIsPermisoPaginacionTodoProcesoAsientoInicialEjercicio(Boolean isPermisoPaginacionTodoProcesoAsientoInicialEjercicio) {
		this.isPermisoPaginacionTodoProcesoAsientoInicialEjercicio = isPermisoPaginacionTodoProcesoAsientoInicialEjercicio;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoAsientoInicialEjercicio() {
		return isPermisoPaginacionAltoProcesoAsientoInicialEjercicio;
	}

	public void setIsPermisoPaginacionAltoProcesoAsientoInicialEjercicio(Boolean isPermisoPaginacionAltoProcesoAsientoInicialEjercicio) {
		this.isPermisoPaginacionAltoProcesoAsientoInicialEjercicio = isPermisoPaginacionAltoProcesoAsientoInicialEjercicio;
	}
	
	public Boolean getIsPermisoCopiarProcesoAsientoInicialEjercicio() {
		return isPermisoCopiarProcesoAsientoInicialEjercicio;
	}

	public void setIsPermisoCopiarProcesoAsientoInicialEjercicio(Boolean isPermisoCopiarProcesoAsientoInicialEjercicio) {
		this.isPermisoCopiarProcesoAsientoInicialEjercicio = isPermisoCopiarProcesoAsientoInicialEjercicio;
	}
	
	public Boolean getIsPermisoVerFormProcesoAsientoInicialEjercicio() {
		return isPermisoVerFormProcesoAsientoInicialEjercicio;
	}

	public void setIsPermisoVerFormProcesoAsientoInicialEjercicio(Boolean isPermisoVerFormProcesoAsientoInicialEjercicio) {
		this.isPermisoVerFormProcesoAsientoInicialEjercicio = isPermisoVerFormProcesoAsientoInicialEjercicio;
	}
	
	public Boolean getIsPermisoDuplicarProcesoAsientoInicialEjercicio() {
		return isPermisoDuplicarProcesoAsientoInicialEjercicio;
	}

	public void setIsPermisoDuplicarProcesoAsientoInicialEjercicio(Boolean isPermisoDuplicarProcesoAsientoInicialEjercicio) {
		this.isPermisoDuplicarProcesoAsientoInicialEjercicio = isPermisoDuplicarProcesoAsientoInicialEjercicio;
	}
	
	public Boolean getIsPermisoOrdenProcesoAsientoInicialEjercicio() {
		return isPermisoOrdenProcesoAsientoInicialEjercicio;
	}

	public void setIsPermisoOrdenProcesoAsientoInicialEjercicio(Boolean isPermisoOrdenProcesoAsientoInicialEjercicio) {
		this.isPermisoOrdenProcesoAsientoInicialEjercicio = isPermisoOrdenProcesoAsientoInicialEjercicio;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio() {
		return isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio;
	}

	public void setIsVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio(Boolean isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio) {
		this.isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio = isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoAsientoInicialEjercicio() {
		return isVisibilidadCeldaDuplicarProcesoAsientoInicialEjercicio;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoAsientoInicialEjercicio(Boolean isVisibilidadCeldaDuplicarProcesoAsientoInicialEjercicio) {
		this.isVisibilidadCeldaDuplicarProcesoAsientoInicialEjercicio = isVisibilidadCeldaDuplicarProcesoAsientoInicialEjercicio;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoAsientoInicialEjercicio() {
		return isVisibilidadCeldaCopiarProcesoAsientoInicialEjercicio;
	}

	public void setIsVisibilidadCeldaCopiarProcesoAsientoInicialEjercicio(Boolean isVisibilidadCeldaCopiarProcesoAsientoInicialEjercicio) {
		this.isVisibilidadCeldaCopiarProcesoAsientoInicialEjercicio = isVisibilidadCeldaCopiarProcesoAsientoInicialEjercicio;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoAsientoInicialEjercicio() {
		return isVisibilidadCeldaVerFormProcesoAsientoInicialEjercicio;
	}

	public void setIsVisibilidadCeldaVerFormProcesoAsientoInicialEjercicio(Boolean isVisibilidadCeldaVerFormProcesoAsientoInicialEjercicio) {
		this.isVisibilidadCeldaVerFormProcesoAsientoInicialEjercicio = isVisibilidadCeldaVerFormProcesoAsientoInicialEjercicio;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoAsientoInicialEjercicio() {
		return isVisibilidadCeldaOrdenProcesoAsientoInicialEjercicio;
	}

	public void setIsVisibilidadCeldaOrdenProcesoAsientoInicialEjercicio(Boolean isVisibilidadCeldaOrdenProcesoAsientoInicialEjercicio) {
		this.isVisibilidadCeldaOrdenProcesoAsientoInicialEjercicio = isVisibilidadCeldaOrdenProcesoAsientoInicialEjercicio;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio() {
		return isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio(Boolean isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio = isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoAsientoInicialEjercicio() {
		return isVisibilidadCeldaModificarProcesoAsientoInicialEjercicio;
	}

	public void setIsVisibilidadCeldaModificarProcesoAsientoInicialEjercicio(Boolean isVisibilidadCeldaModificarProcesoAsientoInicialEjercicio) {
		this.isVisibilidadCeldaModificarProcesoAsientoInicialEjercicio = isVisibilidadCeldaModificarProcesoAsientoInicialEjercicio;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoAsientoInicialEjercicio() {
		return isVisibilidadCeldaActualizarProcesoAsientoInicialEjercicio;
	}

	public void setIsVisibilidadCeldaActualizarProcesoAsientoInicialEjercicio(Boolean isVisibilidadCeldaActualizarProcesoAsientoInicialEjercicio) {
		this.isVisibilidadCeldaActualizarProcesoAsientoInicialEjercicio = isVisibilidadCeldaActualizarProcesoAsientoInicialEjercicio;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoAsientoInicialEjercicio() {
		return isVisibilidadCeldaEliminarProcesoAsientoInicialEjercicio;
	}

	public void setIsVisibilidadCeldaEliminarProcesoAsientoInicialEjercicio(Boolean isVisibilidadCeldaEliminarProcesoAsientoInicialEjercicio) {
		this.isVisibilidadCeldaEliminarProcesoAsientoInicialEjercicio = isVisibilidadCeldaEliminarProcesoAsientoInicialEjercicio;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio() {
		return isVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio;
	}

	public void setIsVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio(Boolean isVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio) {
		this.isVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio = isVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio() {
		return isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio;
	}

	public void setIsVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio(Boolean isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio) {
		this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio = isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio() {
		return isVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio(Boolean isVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio) {
		this.isVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio = isVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio;
	}
		
	public ProcesoAsientoInicialEjercicioSessionBean getprocesoasientoinicialejercicioSessionBean() {
		return this.procesoasientoinicialejercicioSessionBean;
	}
	
	public void setprocesoasientoinicialejercicioSessionBean(ProcesoAsientoInicialEjercicioSessionBean procesoasientoinicialejercicioSessionBean) {
		this.procesoasientoinicialejercicioSessionBean=procesoasientoinicialejercicioSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoAsientoInicialEjercicio() {
		return this.isVisibilidadBusquedaProcesoAsientoInicialEjercicio;
	}

	public void setisVisibilidadBusquedaProcesoAsientoInicialEjercicio(Boolean isVisibilidadBusquedaProcesoAsientoInicialEjercicio) {
		this.isVisibilidadBusquedaProcesoAsientoInicialEjercicio=isVisibilidadBusquedaProcesoAsientoInicialEjercicio;
	}

	public Boolean getisVisibilidadFK_IdTipoDocumento() {
		return this.isVisibilidadFK_IdTipoDocumento;
	}

	public void setisVisibilidadFK_IdTipoDocumento(Boolean isVisibilidadFK_IdTipoDocumento) {
		this.isVisibilidadFK_IdTipoDocumento=isVisibilidadFK_IdTipoDocumento;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoAsientoInicialEjercicio(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio)throws Exception {
		try {
			
				this.setActualParaGuardarTipoDocumentoForeignKey(procesoasientoinicialejercicio,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio,ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoAsientoInicialEjercicio(procesoasientoinicialejercicio);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesoasientoinicialejercicioAux.setId(procesoasientoinicialejercicio.getId());
		procesoasientoinicialejercicioAux.setVersionRow(procesoasientoinicialejercicio.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioLocal) throws Exception {
		
		if(this.procesoasientoinicialejercicioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioLocal) throws Exception {	
		if(this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(TipoDocumentoDetalleFormJInternalFrame.class)) {
				TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrameLocal=(TipoDocumentoBeanSwingJInternalFrame) ((TipoDocumentoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipodocumentoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoDocumento(tipodocumentoBeanSwingJInternalFrameLocal.gettipodocumento(),true);
				tipodocumentoBeanSwingJInternalFrameLocal.actualizarLista(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento,this.tipodocumentosForeignKey);

				tipodocumentoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento);

				procesoasientoinicialejercicioLocal.setTipoDocumento(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento);

				this.addItemDefectoCombosForeignKeyTipoDocumento();
				this.cargarCombosFrameTipoDocumentosForeignKey("Formulario");
				this.setActualTipoDocumentoForeignKey(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoAsientoInicialEjercicioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesoasientoinicialejercicioValidator.getInvalidValues(this.procesoasientoinicialejercicio);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio,List<ProcesoAsientoInicialEjercicio> procesoasientoinicialejercicios) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio,List<ProcesoAsientoInicialEjercicio> procesoasientoinicialejercicios) throws Exception {
		try	{			
			ProcesoAsientoInicialEjercicioConstantesFunciones.actualizarSelectedLista(procesoasientoinicialejercicio,procesoasientoinicialejercicios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesoasientoinicialejerciciosLocal=this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesoasientoinicialejerciciosLocal=this.procesoasientoinicialejercicios;
			}
			//ARCHITECTURE
		
			for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioLocal:procesoasientoinicialejerciciosLocal) {
				if(this.permiteMantenimiento(procesoasientoinicialejercicioLocal) && procesoasientoinicialejercicioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoAsientoInicialEjercicioConstantesFunciones.getProcesoAsientoInicialEjercicioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoAsientoInicialEjercicioConstantesFunciones.IDTIPODOCUMENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jLabelid_tipo_documentoProcesoAsientoInicialEjercicio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoAsientoInicialEjercicioConstantesFunciones.FECHAINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jLabelfecha_inicioProcesoAsientoInicialEjercicio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoAsientoInicialEjercicioConstantesFunciones.FECHAFIN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jLabelfecha_finProcesoAsientoInicialEjercicio,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jLabelid_tipo_documentoProcesoAsientoInicialEjercicio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jLabelfecha_inicioProcesoAsientoInicialEjercicio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jLabelfecha_finProcesoAsientoInicialEjercicio,"");
		
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
		this.iIdNuevoProcesoAsientoInicialEjercicio--;	
		
		
		this.procesoasientoinicialejercicioAux=new ProcesoAsientoInicialEjercicio();
		
		this.procesoasientoinicialejercicioAux.setId(this.iIdNuevoProcesoAsientoInicialEjercicio);
		this.procesoasientoinicialejercicioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().add(this.procesoasientoinicialejercicioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesoasientoinicialejercicios.add(this.procesoasientoinicialejercicioAux);
		}
		//ARCHITECTURE
		
		this.procesoasientoinicialejercicio=this.procesoasientoinicialejercicioAux;
		
		if(ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio);
		}
				
		//this.setDefaultControlesProcesoAsientoInicialEjercicio();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoAsientoInicialEjercicio();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoAsientoInicialEjercicio();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoAsientoInicialEjercicio();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicioBean,this.procesoasientoinicialejercicio,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicioReturnGeneral,this.procesoasientoinicialejercicioBean,false);
		
		if(this.procesoasientoinicialejercicioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicioReturnGeneral.getProcesoAsientoInicialEjercicio());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicioReturnGeneral.getProcesoAsientoInicialEjercicio());
		}
		
		if(this.procesoasientoinicialejercicioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicioReturnGeneral.getProcesoAsientoInicialEjercicio(),classes);//this.procesoasientoinicialejercicioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoAsientoInicialEjercicio();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoAsientoInicialEjercicio();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.RecargarFormProcesoAsientoInicialEjercicio(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false);
						
			if(procesoasientoinicialejercicioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoAsientoInicialEjercicio();
			}
			
			this.actualizarVisualTableDatosProcesoAsientoInicialEjercicio();
			
			this.jTableDatosProcesoAsientoInicialEjercicio.setRowSelectionInterval(this.getIndiceNuevoProcesoAsientoInicialEjercicio(), this.getIndiceNuevoProcesoAsientoInicialEjercicio());
			
			this.seleccionarFilaTablaProcesoAsientoInicialEjercicioActual();
						
			this.actualizarEstadoCeldasBotonesProcesoAsientoInicialEjercicio("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoAsientoInicialEjercicio(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jDateChooserfecha_inicioProcesoAsientoInicialEjercicio.setEnabled(isHabilitar && this.procesoasientoinicialejercicioConstantesFunciones.activarfecha_inicioProcesoAsientoInicialEjercicio);
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jDateChooserfecha_finProcesoAsientoInicialEjercicio.setEnabled(isHabilitar && this.procesoasientoinicialejercicioConstantesFunciones.activarfecha_finProcesoAsientoInicialEjercicio);	
		
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.setEnabled(isHabilitar && this.procesoasientoinicialejercicioConstantesFunciones.activarid_tipo_documentoProcesoAsientoInicialEjercicio);
	};
	
	public void setDefaultControlesProcesoAsientoInicialEjercicio() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoAsientoInicialEjercicio(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesoasientoinicialejercicioSessionBean.setConGuardarRelaciones(true);			
			this.procesoasientoinicialejercicioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jTabbedPaneRelacionesProcesoAsientoInicialEjercicio.setVisible(true);
			
					
		} else {
			//this.procesoasientoinicialejercicioSessionBean.setConGuardarRelaciones(false);			
			this.procesoasientoinicialejercicioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jTabbedPaneRelacionesProcesoAsientoInicialEjercicio.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoAsientoInicialEjercicio() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios()) {
				if(procesoasientoinicialejercicioAux.getId().equals(this.iIdNuevoProcesoAsientoInicialEjercicio)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:this.procesoasientoinicialejercicios) {
				if(procesoasientoinicialejercicioAux.getId().equals(this.iIdNuevoProcesoAsientoInicialEjercicio)) {
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
	
	public int getIndiceActualProcesoAsientoInicialEjercicio(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios()) {
				if(procesoasientoinicialejercicioAux.getId().equals(procesoasientoinicialejercicio.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:this.procesoasientoinicialejercicios) {
				if(procesoasientoinicialejercicioAux.getId().equals(procesoasientoinicialejercicio.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoAsientoInicialEjercicio(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios()) {
				if(procesoasientoinicialejercicioAux.getProcesoAsientoInicialEjercicioOriginal().getId().equals(procesoasientoinicialejercicioOriginal.getId())) {
					existe=true;
					procesoasientoinicialejercicioOriginal.setId(procesoasientoinicialejercicioAux.getId());
					procesoasientoinicialejercicioOriginal.setVersionRow(procesoasientoinicialejercicioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:this.procesoasientoinicialejercicios) {
				if(procesoasientoinicialejercicioAux.getProcesoAsientoInicialEjercicioOriginal().getId().equals(procesoasientoinicialejercicioOriginal.getId())) {
					existe=true;
					procesoasientoinicialejercicioOriginal.setId(procesoasientoinicialejercicioAux.getId());
					procesoasientoinicialejercicioOriginal.setVersionRow(procesoasientoinicialejercicioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoAsientoInicialEjercicio(Boolean esParaCancelar) throws Exception {
		procesoasientoinicialejerciciosAux=new ArrayList<ProcesoAsientoInicialEjercicio>();
		procesoasientoinicialejercicioAux=new ProcesoAsientoInicialEjercicio();
		
		if(!this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios()) {
					if(procesoasientoinicialejercicioAux.getId()<0) {
						procesoasientoinicialejerciciosAux.add(procesoasientoinicialejercicioAux);
					}		
				}
				this.iIdNuevoProcesoAsientoInicialEjercicio=0L;
				this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().removeAll(procesoasientoinicialejerciciosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:this.procesoasientoinicialejercicios) {
					if(procesoasientoinicialejercicioAux.getId()<0) {
						procesoasientoinicialejerciciosAux.add(procesoasientoinicialejercicioAux);
					}		
				}
				this.iIdNuevoProcesoAsientoInicialEjercicio=0L;
				this.procesoasientoinicialejercicios.removeAll(procesoasientoinicialejerciciosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoAsientoInicialEjercicio 
					&& this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().size()>0
					) {
					procesoasientoinicialejercicioAux=this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().get(this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().size() - 1);
				
					if(procesoasientoinicialejercicioAux.getId()<0) {
						this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().remove(procesoasientoinicialejercicioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoAsientoInicialEjercicio && this.procesoasientoinicialejercicios.size()>0) {
					procesoasientoinicialejercicioAux=this.procesoasientoinicialejercicios.get(this.procesoasientoinicialejercicios.size() - 1);
				
					if(procesoasientoinicialejercicioAux.getId()<0) {
						this.procesoasientoinicialejercicios.remove(procesoasientoinicialejercicioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoAsientoInicialEjercicio(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesoasientoinicialejercicio.getId()<0) {
				this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().remove(this.procesoasientoinicialejercicio);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesoasientoinicialejercicio.getId()<0) {
				this.procesoasientoinicialejercicios.remove(this.procesoasientoinicialejercicio);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoAsientoInicialEjercicio(List<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosAux) throws Exception {
		ProcesoAsientoInicialEjercicioConstantesFunciones.setEstadosInicialesProcesoAsientoInicialEjercicio(procesoasientoinicialejerciciosAux);
	}
	
	public void setEstadosInicialesProcesoAsientoInicialEjercicio(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux) throws Exception {
		ProcesoAsientoInicialEjercicioConstantesFunciones.setEstadosInicialesProcesoAsientoInicialEjercicio(procesoasientoinicialejercicioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoAsientoInicialEjercicioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoAsientoInicialEjercicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoAsientoInicialEjercicioActual()) {
				if(!this.isEsNuevoProcesoAsientoInicialEjercicio) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoAsientoInicialEjercicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoAsientoInicialEjercicio=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoAsientoInicialEjercicioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Asiento Inicial Ejercicio ?", "MANTENIMIENTO DE Proceso Asiento Inicial Ejercicio", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoAsientoInicialEjercicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio) throws Exception {
		ProcesoAsientoInicialEjercicioConstantesFunciones.seleccionarAsignar(this.procesoasientoinicialejercicio,procesoasientoinicialejercicio);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoAsientoInicialEjercicio=this.isPermisoActualizarOriginalProcesoAsientoInicialEjercicio;
			
			
			this.seleccionarAsignar(procesoasientoinicialejercicio);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoAsientoInicialEjercicio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesoasientoinicialejercicioSessionBean.setsFuncionBusquedaRapida(this.procesoasientoinicialejercicioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoAsientoInicialEjercicio) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoAsientoInicialEjercicio(esParaCancelar);				
				this.cancelarNuevoProcesoAsientoInicialEjercicio(esParaCancelar);								
			}
			
			this.procesoasientoinicialejercicio=new ProcesoAsientoInicialEjercicio();
			
			this.inicializarProcesoAsientoInicialEjercicio();
			
			this.actualizarEstadoCeldasBotonesProcesoAsientoInicialEjercicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoAsientoInicialEjercicio() throws Exception {
		try {
			ProcesoAsientoInicialEjercicioConstantesFunciones.inicializarProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoAsientoInicialEjercicios(String sAccionBusqueda,List<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoAsientoInicialEjercicio"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoAsientoInicialEjercicioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoAsientoInicialEjercicioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoAsientoInicialEjercicio"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Asiento Inicial Ejercicios");		
		parameters.put("busquedapor", ProcesoAsientoInicialEjercicioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoAsientoInicialEjercicio=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
		} else {
		}
		
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoAsientoInicialEjercicio);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoAsientoInicialEjercicioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoAsientoInicialEjercicioBean.TraerProcesoAsientoInicialEjercicioBeans(procesoasientoinicialejerciciosParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoAsientoInicialEjercicios(sAccionBusqueda,sTipoArchivoReporte,procesoasientoinicialejerciciosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoAsientoInicialEjercicios(sAccionBusqueda,sTipoArchivoReporte,procesoasientoinicialejerciciosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoAsientoInicialEjercicioActionPerformed(null);
					//this.generarExcelReporteProcesoAsientoInicialEjercicios(sAccionBusqueda,sTipoArchivoReporte,procesoasientoinicialejerciciosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoAsientoInicialEjercicios(sAccionBusqueda,sTipoArchivoReporte,procesoasientoinicialejerciciosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoAsientoInicialEjercicios(sAccionBusqueda,sTipoArchivoReporte,procesoasientoinicialejerciciosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoAsientoInicialEjercicios(sAccionBusqueda,sTipoArchivoReporte,procesoasientoinicialejerciciosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoAsientoInicialEjercicios(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoasientoinicialejercicio";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoAsientoInicialEjercicios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoAsientoInicialEjercicio("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio : procesoasientoinicialejerciciosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoAsientoInicialEjercicioConstantesFunciones.generarExcelReporteDataProcesoAsientoInicialEjercicio("NORMAL",row,workbook,procesoasientoinicialejercicio,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Asiento Inicial Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoAsientoInicialEjercicio(String sTipo,Row row,Workbook workbook) {
		
		ProcesoAsientoInicialEjercicioConstantesFunciones.generarExcelReporteHeaderProcesoAsientoInicialEjercicio(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoAsientoInicialEjercicios(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoasientoinicialejercicio_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoAsientoInicialEjercicios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio : procesoasientoinicialejerciciosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoAsientoInicialEjercicioConstantesFunciones.getProcesoAsientoInicialEjercicioDescripcion(procesoasientoinicialejercicio));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_IDTIPODOCUMENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_IDTIPODOCUMENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesoasientoinicialejercicio.gettipodocumento_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesoasientoinicialejercicio.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesoasientoinicialejercicio.getfecha_fin());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Asiento Inicial Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoAsientoInicialEjercicios(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosRespaldo=null;
		
		classes=ProcesoAsientoInicialEjercicioConstantesFunciones.getClassesRelationshipsOfProcesoAsientoInicialEjercicio(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesoasientoinicialejercicioLogic.setDatosCliente(this.datosCliente);
		this.procesoasientoinicialejercicioLogic.setDatosDeep(this.datosDeep);
		this.procesoasientoinicialejercicioLogic.setIsConDeep(true);
		
		procesoasientoinicialejerciciosRespaldo=this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios();
		
		this.procesoasientoinicialejercicioLogic.setProcesoAsientoInicialEjercicios(procesoasientoinicialejerciciosParaReportes);	
		this.procesoasientoinicialejercicioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesoasientoinicialejerciciosParaReportes=this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios();
		this.procesoasientoinicialejercicioLogic.setProcesoAsientoInicialEjercicios(procesoasientoinicialejerciciosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoasientoinicialejercicio_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoAsientoInicialEjercicios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoAsientoInicialEjercicio("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio : procesoasientoinicialejerciciosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoAsientoInicialEjercicio("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoAsientoInicialEjercicioConstantesFunciones.generarExcelReporteDataProcesoAsientoInicialEjercicio("NORMAL",row,workbook,procesoasientoinicialejercicio,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoAsientoInicialEjercicioConstantesFunciones.getProcesoAsientoInicialEjercicioDescripcion(procesoasientoinicialejercicio));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Asiento Inicial Ejercicio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoAsientoInicialEjercicio() throws Exception {		
		this.startProcessProcesoAsientoInicialEjercicio(true);
	}
	
	public void startProcessProcesoAsientoInicialEjercicio(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio ,this.jPanelParametrosReportesProcesoAsientoInicialEjercicio, this.jScrollPanelDatosProcesoAsientoInicialEjercicio,this.jPanelPaginacionProcesoAsientoInicialEjercicio, this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio, this.jPanelAccionesProcesoAsientoInicialEjercicio,this.jPanelAccionesFormularioProcesoAsientoInicialEjercicio,this.jmenuBarProcesoAsientoInicialEjercicio,this.jmenuBarDetalleProcesoAsientoInicialEjercicio,this.jTtoolBarProcesoAsientoInicialEjercicio,this.jTtoolBarDetalleProcesoAsientoInicialEjercicio);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoAsientoInicialEjercicio=this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio; 
		
		final JPanel jPanelParametrosReportesProcesoAsientoInicialEjercicio=this.jPanelParametrosReportesProcesoAsientoInicialEjercicio;
		//final JScrollPane jScrollPanelDatosProcesoAsientoInicialEjercicio=this.jScrollPanelDatosProcesoAsientoInicialEjercicio;
		final JTable jTableDatosProcesoAsientoInicialEjercicio=this.jTableDatosProcesoAsientoInicialEjercicio;		
		final JPanel jPanelPaginacionProcesoAsientoInicialEjercicio=this.jPanelPaginacionProcesoAsientoInicialEjercicio;
		//final JScrollPane jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio=this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio;
		final JPanel jPanelAccionesProcesoAsientoInicialEjercicio=this.jPanelAccionesProcesoAsientoInicialEjercicio;
		
		JPanel jPanelCamposAuxiliarProcesoAsientoInicialEjercicio=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoAsientoInicialEjercicio=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {
			jPanelCamposAuxiliarProcesoAsientoInicialEjercicio=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jPanelCamposProcesoAsientoInicialEjercicio;
			jPanelAccionesFormularioAuxiliarProcesoAsientoInicialEjercicio=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jPanelAccionesFormularioProcesoAsientoInicialEjercicio;
		}
		
		final JPanel jPanelCamposProcesoAsientoInicialEjercicio=jPanelCamposAuxiliarProcesoAsientoInicialEjercicio;
		final JPanel jPanelAccionesFormularioProcesoAsientoInicialEjercicio=jPanelAccionesFormularioAuxiliarProcesoAsientoInicialEjercicio;
		
		
		final JMenuBar jmenuBarProcesoAsientoInicialEjercicio=this.jmenuBarProcesoAsientoInicialEjercicio;
		final JToolBar jTtoolBarProcesoAsientoInicialEjercicio=this.jTtoolBarProcesoAsientoInicialEjercicio;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoAsientoInicialEjercicio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoAsientoInicialEjercicio=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {
			jmenuBarDetalleAuxiliarProcesoAsientoInicialEjercicio=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jmenuBarDetalleProcesoAsientoInicialEjercicio;
			jTtoolBarDetalleAuxiliarProcesoAsientoInicialEjercicio=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jTtoolBarDetalleProcesoAsientoInicialEjercicio;
		}
		
		final JMenuBar jmenuBarDetalleProcesoAsientoInicialEjercicio=jmenuBarDetalleAuxiliarProcesoAsientoInicialEjercicio;
		final JToolBar jTtoolBarDetalleProcesoAsientoInicialEjercicio=jTtoolBarDetalleAuxiliarProcesoAsientoInicialEjercicio;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoAsientoInicialEjercicio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoAsientoInicialEjercicio;
			processRunnable.jTableDatos=jTableDatosProcesoAsientoInicialEjercicio;
			processRunnable.jPanelCampos=jPanelCamposProcesoAsientoInicialEjercicio;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoAsientoInicialEjercicio;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoAsientoInicialEjercicio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoAsientoInicialEjercicio;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoAsientoInicialEjercicio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoAsientoInicialEjercicio;
			processRunnable.jTtoolBar=jTtoolBarProcesoAsientoInicialEjercicio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoAsientoInicialEjercicio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoAsientoInicialEjercicio ,jPanelParametrosReportesProcesoAsientoInicialEjercicio,jTableDatosProcesoAsientoInicialEjercicio, /*jScrollPanelDatosProcesoAsientoInicialEjercicio,*/jPanelCamposProcesoAsientoInicialEjercicio,jPanelPaginacionProcesoAsientoInicialEjercicio, /*jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio,*/ jPanelAccionesProcesoAsientoInicialEjercicio,jPanelAccionesFormularioProcesoAsientoInicialEjercicio,jmenuBarProcesoAsientoInicialEjercicio,jmenuBarDetalleProcesoAsientoInicialEjercicio,jTtoolBarProcesoAsientoInicialEjercicio,jTtoolBarDetalleProcesoAsientoInicialEjercicio);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoAsientoInicialEjercicio ,jPanelParametrosReportesProcesoAsientoInicialEjercicio, jScrollPanelDatosProcesoAsientoInicialEjercicio,jPanelPaginacionProcesoAsientoInicialEjercicio, jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio, jPanelAccionesProcesoAsientoInicialEjercicio,jPanelAccionesFormularioProcesoAsientoInicialEjercicio,jmenuBarProcesoAsientoInicialEjercicio,jmenuBarDetalleProcesoAsientoInicialEjercicio,jTtoolBarProcesoAsientoInicialEjercicio,jTtoolBarDetalleProcesoAsientoInicialEjercicio);
						
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
	
	public void finishProcessProcesoAsientoInicialEjercicio() {// throws Exception 
		this.finishProcessProcesoAsientoInicialEjercicio(true);
	}
	
	public void finishProcessProcesoAsientoInicialEjercicio(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio ,this.jPanelParametrosReportesProcesoAsientoInicialEjercicio, this.jScrollPanelDatosProcesoAsientoInicialEjercicio,this.jPanelPaginacionProcesoAsientoInicialEjercicio, this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio, this.jPanelAccionesProcesoAsientoInicialEjercicio,this.jPanelAccionesFormularioProcesoAsientoInicialEjercicio,this.jmenuBarProcesoAsientoInicialEjercicio,this.jmenuBarDetalleProcesoAsientoInicialEjercicio,this.jTtoolBarProcesoAsientoInicialEjercicio,this.jTtoolBarDetalleProcesoAsientoInicialEjercicio);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoAsientoInicialEjercicio=this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio; 
		
		final JPanel jPanelParametrosReportesProcesoAsientoInicialEjercicio=this.jPanelParametrosReportesProcesoAsientoInicialEjercicio;
		//final JScrollPane jScrollPanelDatosProcesoAsientoInicialEjercicio=this.jScrollPanelDatosProcesoAsientoInicialEjercicio;
		final JTable jTableDatosProcesoAsientoInicialEjercicio=this.jTableDatosProcesoAsientoInicialEjercicio;		
		final JPanel jPanelPaginacionProcesoAsientoInicialEjercicio=this.jPanelPaginacionProcesoAsientoInicialEjercicio;
		//final JScrollPane jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio=this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio;
		final JPanel jPanelAccionesProcesoAsientoInicialEjercicio=this.jPanelAccionesProcesoAsientoInicialEjercicio;
		
		JPanel jPanelCamposAuxiliarProcesoAsientoInicialEjercicio=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoAsientoInicialEjercicio=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {
			jPanelCamposAuxiliarProcesoAsientoInicialEjercicio=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jPanelCamposProcesoAsientoInicialEjercicio;
			jPanelAccionesFormularioAuxiliarProcesoAsientoInicialEjercicio=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jPanelAccionesFormularioProcesoAsientoInicialEjercicio;
		}
		
		final JPanel jPanelCamposProcesoAsientoInicialEjercicio=jPanelCamposAuxiliarProcesoAsientoInicialEjercicio;
		final JPanel jPanelAccionesFormularioProcesoAsientoInicialEjercicio=jPanelAccionesFormularioAuxiliarProcesoAsientoInicialEjercicio;
		
		
		final JMenuBar jmenuBarProcesoAsientoInicialEjercicio=this.jmenuBarProcesoAsientoInicialEjercicio;		
		final JToolBar jTtoolBarProcesoAsientoInicialEjercicio=this.jTtoolBarProcesoAsientoInicialEjercicio;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoAsientoInicialEjercicio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoAsientoInicialEjercicio=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {
			jmenuBarDetalleAuxiliarProcesoAsientoInicialEjercicio=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jmenuBarDetalleProcesoAsientoInicialEjercicio;
			jTtoolBarDetalleAuxiliarProcesoAsientoInicialEjercicio=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jTtoolBarDetalleProcesoAsientoInicialEjercicio;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoAsientoInicialEjercicio=jmenuBarDetalleAuxiliarProcesoAsientoInicialEjercicio;
		final JToolBar jTtoolBarDetalleProcesoAsientoInicialEjercicio=jTtoolBarDetalleAuxiliarProcesoAsientoInicialEjercicio;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoAsientoInicialEjercicio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoAsientoInicialEjercicio;
			processRunnable.jTableDatos=jTableDatosProcesoAsientoInicialEjercicio;
			processRunnable.jPanelCampos=jPanelCamposProcesoAsientoInicialEjercicio;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoAsientoInicialEjercicio;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoAsientoInicialEjercicio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoAsientoInicialEjercicio;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoAsientoInicialEjercicio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoAsientoInicialEjercicio;
			processRunnable.jTtoolBar=jTtoolBarProcesoAsientoInicialEjercicio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoAsientoInicialEjercicio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoAsientoInicialEjercicio ,jPanelParametrosReportesProcesoAsientoInicialEjercicio, jTableDatosProcesoAsientoInicialEjercicio,/*jScrollPanelDatosProcesoAsientoInicialEjercicio,*/jPanelCamposProcesoAsientoInicialEjercicio,jPanelPaginacionProcesoAsientoInicialEjercicio, /*jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio,*/ jPanelAccionesProcesoAsientoInicialEjercicio,jPanelAccionesFormularioProcesoAsientoInicialEjercicio,jmenuBarProcesoAsientoInicialEjercicio,jmenuBarDetalleProcesoAsientoInicialEjercicio,jTtoolBarProcesoAsientoInicialEjercicio,jTtoolBarDetalleProcesoAsientoInicialEjercicio));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoAsientoInicialEjercicio(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoAsientoInicialEjercicio(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoAsientoInicialEjercicio(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoAsientoInicialEjercicio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoAsientoInicialEjercicio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoAsientoInicialEjercicio,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoAsientoInicialEjercicio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoAsientoInicialEjercicio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoAsientoInicialEjercicio,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesoasientoinicialejercicioConstantesFunciones.getsFinalQueryProcesoAsientoInicialEjercicio();
		String  finalQueryPaginacionTodos=this.procesoasientoinicialejercicioConstantesFunciones.getsFinalQueryProcesoAsientoInicialEjercicio();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoAsientoInicialEjercicioConstantesFunciones.getArrayColumnasGlobalesNoProcesoAsientoInicialEjercicio(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoAsientoInicialEjercicioConstantesFunciones.getArrayColumnasGlobalesProcesoAsientoInicialEjercicio(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoAsientoInicialEjercicioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesoasientoinicialejerciciosEliminados= new ArrayList<ProcesoAsientoInicialEjercicio>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoAsientoInicialEjercicio();
		
				///*ProcesoAsientoInicialEjercicioSessionBean*/this.procesoasientoinicialejercicioSessionBean=new ProcesoAsientoInicialEjercicioSessionBean();
			
			if(this.procesoasientoinicialejercicioSessionBean==null) {
				this.procesoasientoinicialejercicioSessionBean=new ProcesoAsientoInicialEjercicioSessionBean();
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
					this.iNumeroPaginacion=ProcesoAsientoInicialEjercicioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoAsientoInicialEjercicioConstantesFunciones.getClassesForeignKeysOfProcesoAsientoInicialEjercicio(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesoasientoinicialejercicio."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesoasientoinicialejerciciosAux= new ArrayList<ProcesoAsientoInicialEjercicio>();
			
				
			procesoasientoinicialejercicioLogic.setDatosCliente(this.datosCliente);
			procesoasientoinicialejercicioLogic.setDatosDeep(this.datosDeep);
			procesoasientoinicialejercicioLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoAsientoInicialEjercicio")) {
				this.sDetalleReporte=ProcesoAsientoInicialEjercicioConstantesFunciones.getDetalleIndiceBusquedaProcesoAsientoInicialEjercicio(id_tipo_documentoBusquedaProcesoAsientoInicialEjercicio,fecha_inicioBusquedaProcesoAsientoInicialEjercicio,fecha_finBusquedaProcesoAsientoInicialEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjerciciosBusquedaProcesoAsientoInicialEjercicio(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_tipo_documentoBusquedaProcesoAsientoInicialEjercicio,fecha_inicioBusquedaProcesoAsientoInicialEjercicio,fecha_finBusquedaProcesoAsientoInicialEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoAsientoInicialEjercicioConstantesFunciones.getDetalleIndiceBusquedaProcesoAsientoInicialEjercicio(id_tipo_documentoBusquedaProcesoAsientoInicialEjercicio,fecha_inicioBusquedaProcesoAsientoInicialEjercicio,fecha_finBusquedaProcesoAsientoInicialEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoAsientoInicialEjercicioConstantesFunciones.getDetalleIndiceBusquedaProcesoAsientoInicialEjercicio(id_tipo_documentoBusquedaProcesoAsientoInicialEjercicio,fecha_inicioBusquedaProcesoAsientoInicialEjercicio,fecha_finBusquedaProcesoAsientoInicialEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios()==null||procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesoasientoinicialejercicios==null|| procesoasientoinicialejercicios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoasientoinicialejerciciosAux=new ArrayList<ProcesoAsientoInicialEjercicio>();
						procesoasientoinicialejerciciosAux.addAll(procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesoasientoinicialejerciciosAux=new ArrayList<ProcesoAsientoInicialEjercicio>();
							procesoasientoinicialejerciciosAux.addAll(procesoasientoinicialejercicios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjerciciosBusquedaProcesoAsientoInicialEjercicio(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_tipo_documentoBusquedaProcesoAsientoInicialEjercicio,fecha_inicioBusquedaProcesoAsientoInicialEjercicio,fecha_finBusquedaProcesoAsientoInicialEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoAsientoInicialEjercicioConstantesFunciones.getDetalleIndiceBusquedaProcesoAsientoInicialEjercicio(id_tipo_documentoBusquedaProcesoAsientoInicialEjercicio,fecha_inicioBusquedaProcesoAsientoInicialEjercicio,fecha_finBusquedaProcesoAsientoInicialEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoAsientoInicialEjercicioConstantesFunciones.getDetalleIndiceBusquedaProcesoAsientoInicialEjercicio(id_tipo_documentoBusquedaProcesoAsientoInicialEjercicio,fecha_inicioBusquedaProcesoAsientoInicialEjercicio,fecha_finBusquedaProcesoAsientoInicialEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoAsientoInicialEjercicios("BusquedaProcesoAsientoInicialEjercicio",procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoAsientoInicialEjercicios("BusquedaProcesoAsientoInicialEjercicio",procesoasientoinicialejercicios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoasientoinicialejercicioLogic.setProcesoAsientoInicialEjercicios(new ArrayList<ProcesoAsientoInicialEjercicio>());
						procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().addAll(procesoasientoinicialejerciciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesoasientoinicialejercicios=new ArrayList<ProcesoAsientoInicialEjercicio>();
							procesoasientoinicialejercicios.addAll(procesoasientoinicialejerciciosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoAsientoInicialEjercicio();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","PROCESOS",JOptionPane.INFORMATION_MESSAGE);
		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoAsientoInicialEjercicio();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoasientoinicialejercicios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesoasientoinicialejercicios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio) {
		Boolean permite=true;
		
		if(this.procesoasientoinicialejercicio.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoAsientoInicialEjercicioConstantesFunciones.getOrderByListaProcesoAsientoInicialEjercicio();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoAsientoInicialEjercicioConstantesFunciones.getOrderByListaProcesoAsientoInicialEjercicio();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio:procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios()) {
				if(procesoasientoinicialejercicio.getsType().equals(Constantes2.S_TOTALES)) {
					procesoasientoinicialejercicioTotales=procesoasientoinicialejercicio;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio:this.procesoasientoinicialejercicios) {
				if(procesoasientoinicialejercicio.getsType().equals(Constantes2.S_TOTALES)) {
					procesoasientoinicialejercicioTotales=procesoasientoinicialejercicio;
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
			this.procesoasientoinicialejercicioAux=new ProcesoAsientoInicialEjercicio();
			this.procesoasientoinicialejercicioAux.setsType(Constantes2.S_TOTALES);
			this.procesoasientoinicialejercicioAux.setIsNew(false);
			this.procesoasientoinicialejercicioAux.setIsChanged(false);
			this.procesoasientoinicialejercicioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoAsientoInicialEjercicioConstantesFunciones.TotalizarValoresFilaProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios(),this.procesoasientoinicialejercicioAux);
				
				//this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().add(this.procesoasientoinicialejercicioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoAsientoInicialEjercicioConstantesFunciones.TotalizarValoresFilaProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicios,this.procesoasientoinicialejercicioAux);
				
				this.procesoasientoinicialejercicios.add(this.procesoasientoinicialejercicioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesoasientoinicialejercicioTotales=new ProcesoAsientoInicialEjercicio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().remove(procesoasientoinicialejercicioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesoasientoinicialejercicios.remove(procesoasientoinicialejercicioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesoasientoinicialejercicioTotales=new ProcesoAsientoInicialEjercicio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio:procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios()) {
				if(procesoasientoinicialejercicio.getsType().equals(Constantes2.S_TOTALES)) {
					procesoasientoinicialejercicioTotales=procesoasientoinicialejercicio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoAsientoInicialEjercicioConstantesFunciones.TotalizarValoresFilaProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios(),procesoasientoinicialejercicioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio:this.procesoasientoinicialejercicios) {
				if(procesoasientoinicialejercicio.getsType().equals(Constantes2.S_TOTALES)) {
					procesoasientoinicialejercicioTotales=procesoasientoinicialejercicio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoAsientoInicialEjercicioConstantesFunciones.TotalizarValoresFilaProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicios,procesoasientoinicialejercicioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoAsientoInicialEjerciciosBusquedaProcesoAsientoInicialEjercicio()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoAsientoInicialEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoAsientoInicialEjerciciosFK_IdTipoDocumento()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoDocumento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoAsientoInicialEjerciciosBusquedaProcesoAsientoInicialEjercicio(String sFinalQuery,Long id_tipo_documento,Date fecha_inicio,Date fecha_fin)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjerciciosBusquedaProcesoAsientoInicialEjercicio(sFinalQuery,this.pagination,id_tipo_documento,fecha_inicio,fecha_fin);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoAsientoInicialEjerciciosFK_IdTipoDocumento(String sFinalQuery,Long id_tipo_documento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjerciciosFK_IdTipoDocumento(sFinalQuery,this.pagination,id_tipo_documento);
				
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
	
	public void inicializarPermisosProcesoAsientoInicialEjercicio() {
		this.isPermisoTodoProcesoAsientoInicialEjercicio=false;
		this.isPermisoNuevoProcesoAsientoInicialEjercicio=false;
		this.isPermisoActualizarProcesoAsientoInicialEjercicio=false;
		this.isPermisoActualizarOriginalProcesoAsientoInicialEjercicio=false;
		this.isPermisoEliminarProcesoAsientoInicialEjercicio=false;
		this.isPermisoGuardarCambiosProcesoAsientoInicialEjercicio=false;
		this.isPermisoConsultaProcesoAsientoInicialEjercicio=true;
		this.isPermisoBusquedaProcesoAsientoInicialEjercicio=true;
		this.isPermisoReporteProcesoAsientoInicialEjercicio=true;
		this.isPermisoOrdenProcesoAsientoInicialEjercicio=false;		
		this.isPermisoPaginacionMedioProcesoAsientoInicialEjercicio=false;		
		this.isPermisoPaginacionAltoProcesoAsientoInicialEjercicio=false;		
		this.isPermisoPaginacionTodoProcesoAsientoInicialEjercicio=false;		
		this.isPermisoCopiarProcesoAsientoInicialEjercicio=false;		
		this.isPermisoVerFormProcesoAsientoInicialEjercicio=false;		
		this.isPermisoDuplicarProcesoAsientoInicialEjercicio=false;
		this.isPermisoOrdenProcesoAsientoInicialEjercicio=false;
	}
	
	public void setPermisosUsuarioProcesoAsientoInicialEjercicio(Boolean isPermiso) {
		this.isPermisoTodoProcesoAsientoInicialEjercicio=isPermiso;
		this.isPermisoNuevoProcesoAsientoInicialEjercicio=isPermiso;
		this.isPermisoActualizarProcesoAsientoInicialEjercicio=isPermiso;
		this.isPermisoActualizarOriginalProcesoAsientoInicialEjercicio=isPermiso;
		this.isPermisoEliminarProcesoAsientoInicialEjercicio=isPermiso;
		this.isPermisoGuardarCambiosProcesoAsientoInicialEjercicio=isPermiso;
		this.isPermisoConsultaProcesoAsientoInicialEjercicio=isPermiso;
		this.isPermisoBusquedaProcesoAsientoInicialEjercicio=isPermiso;
		this.isPermisoReporteProcesoAsientoInicialEjercicio=isPermiso;
		this.isPermisoOrdenProcesoAsientoInicialEjercicio=isPermiso;		
		this.isPermisoPaginacionMedioProcesoAsientoInicialEjercicio=isPermiso;		
		this.isPermisoPaginacionAltoProcesoAsientoInicialEjercicio=isPermiso;		
		this.isPermisoPaginacionTodoProcesoAsientoInicialEjercicio=isPermiso;		
		this.isPermisoCopiarProcesoAsientoInicialEjercicio=isPermiso;		
		this.isPermisoVerFormProcesoAsientoInicialEjercicio=isPermiso;		
		this.isPermisoDuplicarProcesoAsientoInicialEjercicio=isPermiso;
		this.isPermisoOrdenProcesoAsientoInicialEjercicio=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoAsientoInicialEjercicio(Boolean isPermiso) {
		//this.isPermisoTodoProcesoAsientoInicialEjercicio=isPermiso;
		this.isPermisoNuevoProcesoAsientoInicialEjercicio=isPermiso;
		this.isPermisoActualizarProcesoAsientoInicialEjercicio=isPermiso;
		this.isPermisoActualizarOriginalProcesoAsientoInicialEjercicio=isPermiso;
		this.isPermisoEliminarProcesoAsientoInicialEjercicio=isPermiso;
		this.isPermisoGuardarCambiosProcesoAsientoInicialEjercicio=isPermiso;
		//this.isPermisoConsultaProcesoAsientoInicialEjercicio=isPermiso;
		//this.isPermisoBusquedaProcesoAsientoInicialEjercicio=isPermiso;
		//this.isPermisoReporteProcesoAsientoInicialEjercicio=isPermiso;
		//this.isPermisoOrdenProcesoAsientoInicialEjercicio=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoAsientoInicialEjercicio=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoAsientoInicialEjercicio=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoAsientoInicialEjercicio=isPermiso;		
		//this.isPermisoCopiarProcesoAsientoInicialEjercicio=isPermiso;		
		//this.isPermisoDuplicarProcesoAsientoInicialEjercicio=isPermiso;
		//this.isPermisoOrdenProcesoAsientoInicialEjercicio=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoAsientoInicialEjercicioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoAsientoInicialEjercicioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoAsientoInicialEjercicio(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoAsientoInicialEjercicioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoAsientoInicialEjercicioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoAsientoInicialEjercicioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoAsientoInicialEjercicioClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoAsientoInicialEjercicio() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoAsientoInicialEjercicioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoAsientoInicialEjercicioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoAsientoInicialEjercicio=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoAsientoInicialEjercicio=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoAsientoInicialEjercicio=this.isPermisoActualizarProcesoAsientoInicialEjercicio;
			this.isPermisoEliminarProcesoAsientoInicialEjercicio=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoAsientoInicialEjercicio=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoAsientoInicialEjercicio=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoAsientoInicialEjercicio=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoAsientoInicialEjercicio=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoAsientoInicialEjercicio=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoAsientoInicialEjercicio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoAsientoInicialEjercicio=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoAsientoInicialEjercicio=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoAsientoInicialEjercicio=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoAsientoInicialEjercicio=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoAsientoInicialEjercicio=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoAsientoInicialEjercicio=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoAsientoInicialEjercicio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoAsientoInicialEjercicio.setToolTipText(this.jTableDatosProcesoAsientoInicialEjercicio.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoAsientoInicialEjercicio(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoAsientoInicialEjercicio(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoAsientoInicialEjercicioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoAsientoInicialEjercicioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoAsientoInicialEjercicio() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoAsientoInicialEjercicioListas()throws Exception {
		try	{						
			
				this.tipodocumentosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoAsientoInicialEjercicioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoAsientoInicialEjercicioJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyTipoDocumentoListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyTipoDocumentoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipodocumentosForeignKey==null||this.tipodocumentosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoDocumentoConstantesFunciones.getArrayColumnasGlobalesTipoDocumento(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoDocumentoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoDocumentoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoDocumentosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoAsientoInicialEjercicio()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyTipoDocumento();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyTipoDocumento()throws Exception {
		try {
			if(this.procesoasientoinicialejercicioSessionBean==null) {
				this.procesoasientoinicialejercicioSessionBean=new ProcesoAsientoInicialEjercicioSessionBean();
			}

			if(!this.procesoasientoinicialejercicioSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumento()) {
				TipoDocumento tipodocumento=new TipoDocumento();
				TipoDocumentoConstantesFunciones.setTipoDocumentoDescripcion(tipodocumento,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipodocumento.setId(null);

				if(!TipoDocumentoConstantesFunciones.ExisteEnLista(this.tipodocumentosForeignKey,tipodocumento,true)) {

					this.tipodocumentosForeignKey.add(0,tipodocumento);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProcesoAsientoInicialEjercicio()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoAsientoInicialEjercicio(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoAsientoInicialEjercicio()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoAsientoInicialEjercicio();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoAsientoInicialEjercicio(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio)throws Exception {	
		try {
			
			this.setActualTipoDocumentoForeignKey(procesoasientoinicialejercicio.getid_tipo_documento(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoAsientoInicialEjercicio(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoAsientoInicialEjercicio()throws Exception {	
		try {
			
			this.setActualTipoDocumentoForeignKey(this.procesoasientoinicialejercicioConstantesFunciones.getid_tipo_documento(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoAsientoInicialEjercicio()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoAsientoInicialEjercicio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoAsientoInicialEjercicio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoAsientoInicialEjercicio()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoAsientoInicialEjercicio()throws Exception {
		try {
			

			this.cargarCombosFrameTipoDocumentosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoAsientoInicialEjercicio(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameTipoDocumentosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoAsientoInicialEjercicio()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio!=null && this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ProcesoAsientoInicialEjercicioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoAsientoInicialEjercicioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoAsientoInicialEjercicioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesoasientoinicialejercicioSessionBean=new ProcesoAsientoInicialEjercicioSessionBean(); 
		this.procesoasientoinicialejercicioConstantesFunciones=new ProcesoAsientoInicialEjercicioConstantesFunciones(); 
		this.procesoasientoinicialejercicioBean=new ProcesoAsientoInicialEjercicio();//(this.procesoasientoinicialejercicioConstantesFunciones); 		
		this.procesoasientoinicialejercicioReturnGeneral=new ProcesoAsientoInicialEjercicioParameterReturnGeneral(); 
		
		this.procesoasientoinicialejercicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesoasientoinicialejercicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoAsientoInicialEjercicioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoAsientoInicialEjercicioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoAsientoInicialEjercicioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoAsientoInicialEjercicio(true);
			
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
			
			this.procesoasientoinicialejercicioConstantesFunciones=new ProcesoAsientoInicialEjercicioConstantesFunciones(); 
			this.procesoasientoinicialejercicioBean=new ProcesoAsientoInicialEjercicio();//this.procesoasientoinicialejercicioConstantesFunciones); 			
			this.procesoasientoinicialejercicioReturnGeneral=new ProcesoAsientoInicialEjercicioParameterReturnGeneral(); 
		
			ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Asiento Inicial Ejercicio Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.procesoasientoinicialejercicio=new ProcesoAsientoInicialEjercicio();
			this.procesoasientoinicialejercicios = new ArrayList<ProcesoAsientoInicialEjercicio>();
			this.procesoasientoinicialejerciciosAux = new ArrayList<ProcesoAsientoInicialEjercicio>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic=new ProcesoAsientoInicialEjercicioLogic();
				this.procesoasientoinicialejercicioLogic.getNewConnexionToDeep("");
			}
			
			//this.procesoasientoinicialejercicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesoasientoinicialejercicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio);	
					}
					
					if(this.jInternalFrameImportacionProcesoAsientoInicialEjercicio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoAsientoInicialEjercicio);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoAsientoInicialEjercicio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoAsientoInicialEjercicio);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio);
				this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.setVisible(false);
				this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio);
					this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoAsientoInicialEjercicio!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoAsientoInicialEjercicio);
					this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setVisible(false);
					this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoAsientoInicialEjercicio!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoAsientoInicialEjercicio);
					this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.setVisible(false);
					this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoAsientoInicialEjercicioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoAsientoInicialEjercicioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesoasientoinicialejercicioReturnGeneral=new ProcesoAsientoInicialEjercicioParameterReturnGeneral();
			
			this.procesoasientoinicialejercicioParameterGeneral=new ProcesoAsientoInicialEjercicioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesoasientoinicialejercicioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoAsientoInicialEjercicioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoAsientoInicialEjercicioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado(),this.procesoasientoinicialejercicioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoAsientoInicialEjercicioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado(),this.procesoasientoinicialejercicioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaDuplicarProcesoAsientoInicialEjercicio=true;
			this.isVisibilidadCeldaCopiarProcesoAsientoInicialEjercicio=true;
			this.isVisibilidadCeldaVerFormProcesoAsientoInicialEjercicio=true;
			this.isVisibilidadCeldaOrdenProcesoAsientoInicialEjercicio=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaModificarProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaActualizarProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaEliminarProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio=false;
			
			
			this.isVisibilidadBusquedaProcesoAsientoInicialEjercicio=true;
			this.isVisibilidadFK_IdTipoDocumento=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoAsientoInicialEjercicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoAsientoInicialEjercicio();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoAsientoInicialEjercicio(false);
			
			this.setPermisosUsuarioProcesoAsientoInicialEjercicio();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado() 
				|| (this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado() && this.procesoasientoinicialejercicioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoAsientoInicialEjercicioClasesRelacionadas();
			}
			
			if(this.procesoasientoinicialejercicioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoAsientoInicialEjercicioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoAsientoInicialEjercicio();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoAsientoInicialEjercicio();
			}
			
			if(!this.isPermisoBusquedaProcesoAsientoInicialEjercicio) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoAsientoInicialEjercicioConstantesFunciones.getTiposSeleccionarProcesoAsientoInicialEjercicio());
				
				this.tiposColumnasSelect=ProcesoAsientoInicialEjercicioConstantesFunciones.getTiposSeleccionarProcesoAsientoInicialEjercicio(true);
				
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
			//if(!this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoAsientoInicialEjercicio();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioProcesoAsientoInicialEjercicio(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioProcesoAsientoInicialEjercicio(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoAsientoInicialEjercicio() ;
			
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
			
			this.tipodocumentoLogic=new TipoDocumentoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesoasientoinicialejercicioImplementable= (ProcesoAsientoInicialEjercicioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoAsientoInicialEjercicioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesoasientoinicialejercicioImplementableHome= (ProcesoAsientoInicialEjercicioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoAsientoInicialEjercicioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesoasientoinicialejercicios= new ArrayList<ProcesoAsientoInicialEjercicio>();
			this.procesoasientoinicialejerciciosEliminados= new ArrayList<ProcesoAsientoInicialEjercicio>();
						
			this.isEsNuevoProcesoAsientoInicialEjercicio=false;
			this.esParaAccionDesdeFormularioProcesoAsientoInicialEjercicio=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.tipodocumentosForeignKey=new ArrayList<TipoDocumento>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoAsientoInicialEjercicio(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoAsientoInicialEjercicio();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoAsientoInicialEjercicioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoAsientoInicialEjercicio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoAsientoInicialEjercicio();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoAsientoInicialEjercicio();
			}
			
			ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoAsientoInicialEjercicio(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoAsientoInicialEjercicio: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoAsientoInicialEjercicio() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoAsientoInicialEjercicio")) {
				iIndex=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jTabbedPaneRelacionesProcesoAsientoInicialEjercicio.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jTabbedPaneRelacionesProcesoAsientoInicialEjercicio.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoAsientoInicialEjercicio();	
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
	
	public void cargarCombosForeignKeyProcesoAsientoInicialEjercicio(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoAsientoInicialEjercicio(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoAsientoInicialEjercicio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoAsientoInicialEjercicioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoAsientoInicialEjercicio();
		
		this.cargarCombosFrameForeignKeyProcesoAsientoInicialEjercicio();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoAsientoInicialEjercicio();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoAsientoInicialEjercicio();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoDocumento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoDocumentoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoDocumento();
				this.cargarCombosFrameTipoDocumentosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoDocumento(this.tipodocumentosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesoasientoinicialejercicioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
			
			
			if(jTableDatosProcesoAsientoInicialEjercicio.getRowCount()>=1) {
				jTableDatosProcesoAsientoInicialEjercicio.removeRowSelectionInterval(0, jTableDatosProcesoAsientoInicialEjercicio.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoAsientoInicialEjercicio=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoAsientoInicialEjercicio(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoAsientoInicialEjercicio(true);			
			//this.procesoasientoinicialejercicio=new ProcesoAsientoInicialEjercicio();
			//this.procesoasientoinicialejercicio.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoAsientoInicialEjercicio(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoAsientoInicialEjercicio() ;
			
			if(ProcesoAsientoInicialEjercicioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoAsientoInicialEjercicio(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesoasientoinicialejercicio);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesoasientoinicialejercicio);				
			
			ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
			
			if(this.procesoasientoinicialejercicioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoAsientoInicialEjercicio: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosSeleccionados=new ArrayList<ProcesoAsientoInicialEjercicio>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRows().length;			
			}
			
			procesoasientoinicialejerciciosSeleccionados=this.getProcesoAsientoInicialEjerciciosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoAsientoInicialEjercicio--;			
				//ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux= new ProcesoAsientoInicialEjercicio();			
				//procesoasientoinicialejercicioAux.setId(this.iIdNuevoProcesoAsientoInicialEjercicio);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioOrigen=new ProcesoAsientoInicialEjercicio();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioOrigen : procesoasientoinicialejerciciosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesoasientoinicialejercicioOrigen =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesoasientoinicialejercicioOrigen =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoAsientoInicialEjercicio();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesoasientoinicialejercicio.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoAsientoInicialEjercicio(procesoasientoinicialejercicioOrigen,this.procesoasientoinicialejercicio,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().add(this.procesoasientoinicialejercicioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesoasientoinicialejercicios.add(this.procesoasientoinicialejercicioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoAsientoInicialEjercicio(false);
				
				this.jTableDatosProcesoAsientoInicialEjercicio.setRowSelectionInterval(this.getIndiceNuevoProcesoAsientoInicialEjercicio(), this.getIndiceNuevoProcesoAsientoInicialEjercicio());
				
				int iLastRow =  this.jTableDatosProcesoAsientoInicialEjercicio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoAsientoInicialEjercicio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoAsientoInicialEjercicio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoAsientoInicialEjercicio(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosSeleccionados=new ArrayList<ProcesoAsientoInicialEjercicio>();									
		
			ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioOrigen=new ProcesoAsientoInicialEjercicio();
			ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioDestino=new ProcesoAsientoInicialEjercicio();
				
			procesoasientoinicialejerciciosSeleccionados=this.getProcesoAsientoInicialEjerciciosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesoasientoinicialejerciciosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoasientoinicialejercicioOrigen =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesoasientoinicialejercicioOrigen =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesoasientoinicialejercicioDestino =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesoasientoinicialejercicioDestino =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesoasientoinicialejercicioOrigen =procesoasientoinicialejerciciosSeleccionados.get(0);
				procesoasientoinicialejercicioDestino =procesoasientoinicialejerciciosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoAsientoInicialEjercicio(procesoasientoinicialejercicioOrigen,procesoasientoinicialejercicioDestino,true,false);
				
				procesoasientoinicialejercicioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesoasientoinicialejercicioDestino,procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesoasientoinicialejercicioDestino,procesoasientoinicialejercicios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoAsientoInicialEjercicio(false);
				
				//this.jTableDatosProcesoAsientoInicialEjercicio.setRowSelectionInterval(this.getIndiceNuevoProcesoAsientoInicialEjercicio(), this.getIndiceNuevoProcesoAsientoInicialEjercicio());
				
				int iLastRow =  this.jTableDatosProcesoAsientoInicialEjercicio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoAsientoInicialEjercicio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoAsientoInicialEjercicio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoAsientoInicialEjercicio(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.setVisible(!isVisible);
			this.jPanelPaginacionProcesoAsientoInicialEjercicio.setVisible(!isVisible);
			this.jPanelAccionesProcesoAsientoInicialEjercicio.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoAsientoInicialEjercicio();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoAsientoInicialEjercicio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoAsientoInicialEjercicio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoAsientoInicialEjercicio();
			
			this.abrirFrameOrderByProcesoAsientoInicialEjercicio();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoAsientoInicialEjercicio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoAsientoInicialEjercicio(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoAsientoInicialEjercicio);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.setSize(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.iWidthFormulario,this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jContentPaneDetalleProcesoAsientoInicialEjercicio.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jTabbedPaneRelacionesProcesoAsientoInicialEjercicio.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jContentPaneDetalleProcesoAsientoInicialEjercicio.getWidth(),ProcesoAsientoInicialEjercicioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jTabbedPaneRelacionesProcesoAsientoInicialEjercicio.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jContentPaneDetalleProcesoAsientoInicialEjercicio.getWidth(),ProcesoAsientoInicialEjercicioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jTabbedPaneRelacionesProcesoAsientoInicialEjercicio.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jContentPaneDetalleProcesoAsientoInicialEjercicio.getWidth(),ProcesoAsientoInicialEjercicioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoAsientoInicialEjercicio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoAsientoInicialEjercicio==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoAsientoInicialEjercicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoAsientoInicialEjercicio,false,this);
				} else {
					this.jInternalFrameOrderByProcesoAsientoInicialEjercicio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoAsientoInicialEjercicio,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoAsientoInicialEjercicio);
				this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.setVisible(false);
				this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.setSelected(false);
				
				this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoAsientoInicialEjercicio"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoAsientoInicialEjercicio();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoAsientoInicialEjercicio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoAsientoInicialEjercicio==null) {
				
				this.jInternalFrameImportacionProcesoAsientoInicialEjercicio=new ImportacionJInternalFrame(ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoAsientoInicialEjercicio);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoAsientoInicialEjercicio);
				this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setVisible(false);
				this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setSelected(false);


				this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoAsientoInicialEjercicio"));
				this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoAsientoInicialEjercicio"));
				this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoAsientoInicialEjercicio"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoAsientoInicialEjercicio() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio==null) {
				this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio=new ReporteDinamicoJInternalFrame(ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio);
				this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoAsientoInicialEjercicio"));
				this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoAsientoInicialEjercicio"));
				this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoAsientoInicialEjercicio"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoAsientoInicialEjercicio();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoAsientoInicialEjercicio() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoAsientoInicialEjercicio);
			
	       	this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.dispose();
			//this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoAsientoInicialEjercicio() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoAsientoInicialEjercicio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setVisible(true);
	        this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoAsientoInicialEjercicio() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.setVisible(true);
	        this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoAsientoInicialEjercicio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.setVisible(false);
	        this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoAsientoInicialEjercicio() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoAsientoInicialEjercicio() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setVisible(false);
	        this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoAsientoInicialEjercicio(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoAsientoInicialEjercicio(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoAsientoInicialEjercicio(true);
			//this.isEsNuevoProcesoAsientoInicialEjercicio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoAsientoInicialEjercicio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoAsientoInicialEjercicio(false) ;
			
			if(procesoasientoinicialejercicioSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoAsientoInicialEjercicioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoAsientoInicialEjercicio(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoAsientoInicialEjercicio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoAsientoInicialEjercicioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoAsientoInicialEjercicio(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoAsientoInicialEjercicio(true);
			//this.isEsNuevoProcesoAsientoInicialEjercicio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesoasientoinicialejercicio.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoAsientoInicialEjercicio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoAsientoInicialEjercicio(false) ;
			
			if(ProcesoAsientoInicialEjercicioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoAsientoInicialEjercicio(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoAsientoInicialEjercicio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaTipoDocumento(List<TipoDocumento> tipodocumentosForeignKey)throws Exception{
		TableColumn tableColumnTipoDocumento=this.jTableDatosProcesoAsientoInicialEjercicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoAsientoInicialEjercicio,ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_IDTIPODOCUMENTO));
		TableCellEditor tableCellEditorTipoDocumento =tableColumnTipoDocumento.getCellEditor();

		TipoDocumentoTableCell tipodocumentoTableCellFk=(TipoDocumentoTableCell)tableCellEditorTipoDocumento;

		if(tipodocumentoTableCellFk!=null) {
			tipodocumentoTableCellFk.settipodocumentosForeignKey(tipodocumentosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipodocumentoTableCellFk.setRowActual(intSelectedRow);
			//tipodocumentoTableCellFk.settipodocumentosForeignKeyActual(tipodocumentosForeignKey);
		//}


		if(tipodocumentoTableCellFk!=null) {
			tipodocumentoTableCellFk.RecargarTipoDocumentosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoAsientoInicialEjercicio(false);
			
			//if(!this.isEsNuevoProcesoAsientoInicialEjercicio) {								
				int intSelectedRow = this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio);
				
			}
			
			if(this.permiteMantenimiento(this.procesoasientoinicialejercicio)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoAsientoInicialEjercicio=true;
					this.inicializarActualizarBindingTablaProcesoAsientoInicialEjercicio(false);
					this.isEsNuevoProcesoAsientoInicialEjercicio=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoAsientoInicialEjercicio=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoAsientoInicialEjercicio=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoAsientoInicialEjercicio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoAsientoInicialEjercicio(false);
				
				this.habilitarDeshabilitarControlesProcesoAsientoInicialEjercicio(false);
			
												
				
				if(ProcesoAsientoInicialEjercicioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoAsientoInicialEjercicio();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoAsientoInicialEjercicioActionPerformed(evt,procesoasientoinicialejercicioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoAsientoInicialEjercicio.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesoasientoinicialejercicioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesoasientoinicialejercicio.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoAsientoInicialEjercicio.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoAsientoInicialEjercicio.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
				this.procesoasientoinicialejercicio.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
				this.procesoasientoinicialejercicio.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesoasientoinicialejercicio)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoAsientoInicialEjercicioModel) this.jTableDatosProcesoAsientoInicialEjercicio.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoAsientoInicialEjercicio=true;
				this.inicializarActualizarBindingTablaProcesoAsientoInicialEjercicio(false);
				this.isEsNuevoProcesoAsientoInicialEjercicio=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoAsientoInicialEjercicio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoAsientoInicialEjercicio(false);
				
				this.habilitarDeshabilitarControlesProcesoAsientoInicialEjercicio(false);
				
				
				
				if(ProcesoAsientoInicialEjercicioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoAsientoInicialEjercicio();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoAsientoInicialEjercicio.getRowCount()>=1) {
				jTableDatosProcesoAsientoInicialEjercicio.removeRowSelectionInterval(0, jTableDatosProcesoAsientoInicialEjercicio.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoAsientoInicialEjercicio(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoAsientoInicialEjercicio(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoAsientoInicialEjercicio(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoAsientoInicialEjercicio(false) ;
			
			this.isEsNuevoProcesoAsientoInicialEjercicio=false;
			
			if(ProcesoAsientoInicialEjercicioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoAsientoInicialEjercicio();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false);
				
				//SI ES MANUAL
				if(ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoAsientoInicialEjercicio();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoAsientoInicialEjercicio--;			
			//ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux= new ProcesoAsientoInicialEjercicio();			
			//procesoasientoinicialejercicioAux.setId(this.iIdNuevoProcesoAsientoInicialEjercicio);
			
			if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoAsientoInicialEjercicio();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio);
			
			this.procesoasientoinicialejercicio.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().add(this.procesoasientoinicialejercicioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesoasientoinicialejercicios.add(this.procesoasientoinicialejercicioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoAsientoInicialEjercicio(false);
			
			this.jTableDatosProcesoAsientoInicialEjercicio.setRowSelectionInterval(this.getIndiceNuevoProcesoAsientoInicialEjercicio(), this.getIndiceNuevoProcesoAsientoInicialEjercicio());
			
			int iLastRow =  this.jTableDatosProcesoAsientoInicialEjercicio.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoAsientoInicialEjercicio.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoAsientoInicialEjercicio.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoAsientoInicialEjercicio(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false);
			
			//SI ES MANUAL
			if(ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoAsientoInicialEjercicio();
			}
			
			//this.abrirFrameTreeProcesoAsientoInicialEjercicio();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setFileImportacion(this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoAsientoInicialEjercicio.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosSeleccionados=new ArrayList<ProcesoAsientoInicialEjercicio>();		

		procesoasientoinicialejerciciosSeleccionados=this.getProcesoAsientoInicialEjerciciosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoAsientoInicialEjercicioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoAsientoInicialEjercicioBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoAsientoInicialEjercicios("Todos",procesoasientoinicialejerciciosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Asiento Inicial Ejercicio",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_IDTIPODOCUMENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoDocumento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoDocumento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoDocumento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoDocumento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAINICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAFIN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaFin_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaFin_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaFin_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaFin_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_IDTIPODOCUMENTO:
					sNombreCampoCategoria="id_tipo_documento";
					break;

				case ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoria="fecha_inicio";
					break;

				case ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoria="fecha_fin";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_IDTIPODOCUMENTO:
					sNombreCampoCategoriaValor="id_tipo_documento";
					break;

				case ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoriaValor="fecha_inicio";
					break;

				case ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoriaValor="fecha_fin";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_IDTIPODOCUMENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Documento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_documento");
					break;

				case ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_inicio");
					break;

				case ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAFIN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Fin",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_fin");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosSeleccionados=new ArrayList<ProcesoAsientoInicialEjercicio>();		
		
		procesoasientoinicialejerciciosSeleccionados=this.getProcesoAsientoInicialEjerciciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoasientoinicialejercicio";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoAsientoInicialEjercicios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_IDTIPODOCUMENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_IDTIPODOCUMENTO);
					iRow++;

					for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio:procesoasientoinicialejerciciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesoasientoinicialejercicio.gettipodocumento_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio:procesoasientoinicialejerciciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesoasientoinicialejercicio.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio:procesoasientoinicialejerciciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesoasientoinicialejercicio.getfecha_fin());
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
			//	this.getFilaCabeceraExportarExcelProcesoAsientoInicialEjercicio(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:procesoasientoinicialejerciciosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoAsientoInicialEjercicio(procesoasientoinicialejercicioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Asiento Inicial Ejercicio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoAsientoInicialEjercicio(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false);
			
			//SI ES MANUAL
			if(ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoAsientoInicialEjercicio();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false);
			
			//SI ES MANUAL
			if(ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoAsientoInicialEjercicio();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false);
			
			//SI ES MANUAL
			if(ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoAsientoInicialEjercicio();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoAsientoInicialEjercicio() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoAsientoInicialEjercicio.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoAsientoInicialEjercicio.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoAsientoInicialEjercicio.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoAsientoInicialEjercicio.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoAsientoInicialEjercicio.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoAsientoInicialEjercicio.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoAsientoInicialEjercicio.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoAsientoInicialEjercicio(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoAsientoInicialEjercicio(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoAsientoInicialEjercicio(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoAsientoInicialEjercicio(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoAsientoInicialEjercicio(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoAsientoInicialEjercicio(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoAsientoInicialEjercicio(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoAsientoInicialEjercicio() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoAsientoInicialEjercicio();
		
		this.inicializarActualizarBindingBotonesManualProcesoAsientoInicialEjercicio(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoAsientoInicialEjercicio();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoAsientoInicialEjercicio() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoAsientoInicialEjercicio(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoAsientoInicialEjercicio(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicio.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoAsientoInicialEjercicio.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoAsientoInicialEjercicio.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jCheckBoxPostAccionNuevoProcesoAsientoInicialEjercicio.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jCheckBoxPostAccionSinCerrarProcesoAsientoInicialEjercicio.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jCheckBoxPostAccionSinMensajeProcesoAsientoInicialEjercicio.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicio.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoAsientoInicialEjercicio.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoAsientoInicialEjercicio.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {
				this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jCheckBoxPostAccionNuevoProcesoAsientoInicialEjercicio.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jCheckBoxPostAccionSinCerrarProcesoAsientoInicialEjercicio.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jCheckBoxPostAccionSinMensajeProcesoAsientoInicialEjercicio.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoAsientoInicialEjercicio.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoAsientoInicialEjercicio.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoAsientoInicialEjercicio.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoAsientoInicialEjercicio.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoAsientoInicialEjercicio.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoAsientoInicialEjercicio.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoAsientoInicialEjercicio.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoAsientoInicialEjercicio(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoAsientoInicialEjercicio(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoAsientoInicialEjercicio() throws Exception {
		try	{
			if(ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoAsientoInicialEjercicio();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoAsientoInicialEjercicio() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoAsientoInicialEjercicio() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoAsientoInicialEjercicio.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoAsientoInicialEjercicio.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoAsientoInicialEjercicio.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoAsientoInicialEjercicio.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoAsientoInicialEjercicio.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoAsientoInicialEjercicio.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoAsientoInicialEjercicio.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoAsientoInicialEjercicio.addItem(reporte);
			}
			
			
			if(!this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoAsientoInicialEjercicio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoAsientoInicialEjercicio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoAsientoInicialEjercicio.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoAsientoInicialEjercicio.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoAsientoInicialEjercicio();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoAsientoInicialEjercicio() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio!=null) {
				this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio!=null) {
				this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoAsientoInicialEjercicio()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.getSelectedItem()!=null){this.id_tipo_documentoBusquedaProcesoAsientoInicialEjercicio=((TipoDocumento)this.jComboBoxid_tipo_documentoBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.getSelectedItem()).getId();}
		this.fecha_inicioBusquedaProcesoAsientoInicialEjercicio=new Date(this.jDateChooserfecha_inicioBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.getDate().getTime());
		this.fecha_finBusquedaProcesoAsientoInicialEjercicio=new Date(this.jDateChooserfecha_finBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoAsientoInicialEjercicio(Boolean esInicializar) throws Exception {				
		if(ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoAsientoInicialEjercicio();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoAsientoInicialEjercicio() throws Exception {
		this.inicializarActualizarBindingTablaProcesoAsientoInicialEjercicio(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoAsientoInicialEjercicio() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoAsientoInicialEjercicioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoAsientoInicialEjercicioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoAsientoInicialEjercicioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoAsientoInicialEjercicioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoAsientoInicialEjercicioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoAsientoInicialEjercicioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoAsientoInicialEjercicio(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesoasientoinicialejercicios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoAsientoInicialEjercicio.setModel(new ProcesoAsientoInicialEjercicioModel(this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoAsientoInicialEjercicio.setModel(new ProcesoAsientoInicialEjercicioModel(this.procesoasientoinicialejercicios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoAsientoInicialEjercicio!=null && this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoAsientoInicialEjercicio();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoAsientoInicialEjercicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoAsientoInicialEjercicio,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoAsientoInicialEjercicioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO,procesoasientoinicialejercicioConstantesFunciones.resaltarSeleccionarProcesoAsientoInicialEjercicio,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoAsientoInicialEjercicioConstantesFunciones.SCLASSWEBTITULO,procesoasientoinicialejercicioConstantesFunciones.resaltarSeleccionarProcesoAsientoInicialEjercicio,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoAsientoInicialEjercicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoAsientoInicialEjercicio,ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_ID));

		if(this.procesoasientoinicialejercicioConstantesFunciones.mostraridProcesoAsientoInicialEjercicio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesoasientoinicialejercicioConstantesFunciones.resaltaridProcesoAsientoInicialEjercicio,this.procesoasientoinicialejercicioConstantesFunciones.activaridProcesoAsientoInicialEjercicio,this,true,"idProcesoAsientoInicialEjercicio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesoasientoinicialejercicioConstantesFunciones.resaltaridProcesoAsientoInicialEjercicio,this.procesoasientoinicialejercicioConstantesFunciones.activaridProcesoAsientoInicialEjercicio,this,true,"idProcesoAsientoInicialEjercicio","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoAsientoInicialEjercicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoAsientoInicialEjercicio,ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_IDTIPODOCUMENTO));

		if(this.procesoasientoinicialejercicioConstantesFunciones.mostrarid_tipo_documentoProcesoAsientoInicialEjercicio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_IDTIPODOCUMENTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoDocumentoTableCell(this.tipodocumentosForeignKey,this.procesoasientoinicialejercicioConstantesFunciones.resaltarid_tipo_documentoProcesoAsientoInicialEjercicio,this,this.procesoasientoinicialejercicioConstantesFunciones.activarid_tipo_documentoProcesoAsientoInicialEjercicio));
			tableColumn.setCellEditor(new TipoDocumentoTableCell(this.tipodocumentosForeignKey,this.procesoasientoinicialejercicioConstantesFunciones.resaltarid_tipo_documentoProcesoAsientoInicialEjercicio,this,this.procesoasientoinicialejercicioConstantesFunciones.activarid_tipo_documentoProcesoAsientoInicialEjercicio,true,"id_tipo_documentoProcesoAsientoInicialEjercicio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoAsientoInicialEjercicioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoAsientoInicialEjercicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoAsientoInicialEjercicio,ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAINICIO));

		if(this.procesoasientoinicialejercicioConstantesFunciones.mostrarfecha_inicioProcesoAsientoInicialEjercicio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAINICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.procesoasientoinicialejercicioConstantesFunciones.resaltarfecha_inicioProcesoAsientoInicialEjercicio,this.procesoasientoinicialejercicioConstantesFunciones.activarfecha_inicioProcesoAsientoInicialEjercicio,this,true,"fecha_inicioProcesoAsientoInicialEjercicio","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.procesoasientoinicialejercicioConstantesFunciones.resaltarfecha_inicioProcesoAsientoInicialEjercicio,this.procesoasientoinicialejercicioConstantesFunciones.activarfecha_inicioProcesoAsientoInicialEjercicio,this,true,"fecha_inicioProcesoAsientoInicialEjercicio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ProcesoAsientoInicialEjercicioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoAsientoInicialEjercicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoAsientoInicialEjercicio,ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAFIN));

		if(this.procesoasientoinicialejercicioConstantesFunciones.mostrarfecha_finProcesoAsientoInicialEjercicio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAFIN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.procesoasientoinicialejercicioConstantesFunciones.resaltarfecha_finProcesoAsientoInicialEjercicio,this.procesoasientoinicialejercicioConstantesFunciones.activarfecha_finProcesoAsientoInicialEjercicio,this,true,"fecha_finProcesoAsientoInicialEjercicio","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.procesoasientoinicialejercicioConstantesFunciones.resaltarfecha_finProcesoAsientoInicialEjercicio,this.procesoasientoinicialejercicioConstantesFunciones.activarfecha_finProcesoAsientoInicialEjercicio,this,true,"fecha_finProcesoAsientoInicialEjercicio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ProcesoAsientoInicialEjercicioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoAsientoInicialEjercicio.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoAsientoInicialEjercicio.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoAsientoInicialEjercicio && this.isPermisoGuardarCambiosProcesoAsientoInicialEjercicio) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoAsientoInicialEjercicio.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoAsientoInicialEjercicio.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoAsientoInicialEjercicio && this.isPermisoGuardarCambiosProcesoAsientoInicialEjercicio) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoAsientoInicialEjercicio && this.isPermisoGuardarCambiosProcesoAsientoInicialEjercicio) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoAsientoInicialEjercicio.moveColumn(this.jTableDatosProcesoAsientoInicialEjercicio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoAsientoInicialEjercicio.moveColumn(this.jTableDatosProcesoAsientoInicialEjercicio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoAsientoInicialEjercicio.moveColumn(this.jTableDatosProcesoAsientoInicialEjercicio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoAsientoInicialEjercicio.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoAsientoInicialEjercicio.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoAsientoInicialEjercicio,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoAsientoInicialEjercicio.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoAsientoInicialEjercicio.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoAsientoInicialEjercicio.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoAsientoInicialEjercicio.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoAsientoInicialEjercicio.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesoasientoinicialejercicios.size()-1;
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
		//this.jTableDatosProcesoAsientoInicialEjercicio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoAsientoInicialEjercicio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoAsientoInicialEjercicio();
			
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
				
				//this.isEsNuevoProcesoAsientoInicialEjercicio=false;
					
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
			
				if(this.procesoasientoinicialejercicioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoAsientoInicialEjercicio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesoasientoinicialejercicio.getsType().equals("DUPLICADO")
				   || this.procesoasientoinicialejercicio.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoAsientoInicialEjercicio=true;
				
				} else {
					this.isEsNuevoProcesoAsientoInicialEjercicio=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
					if(this.procesoasientoinicialejercicio.getId()>=0 && !this.procesoasientoinicialejercicio.getIsNew()) {						
						this.isEsNuevoProcesoAsientoInicialEjercicio=false;
						
					} else {
						this.isEsNuevoProcesoAsientoInicialEjercicio=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoAsientoInicialEjercicio(esRelaciones);						
				
				this.seleccionarProcesoAsientoInicialEjercicio(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesoasientoinicialejercicio.getId()<0) {
					this.isEsNuevoProcesoAsientoInicialEjercicio=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoAsientoInicialEjercicio(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoAsientoInicialEjercicio(evt,rowIndex);
				}	
				
				if(this.procesoasientoinicialejercicioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoAsientoInicialEjercicio: " + this.dDif); 
					}
				}								
				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoAsientoInicialEjercicio(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesoasientoinicialejercicio)) {
					if(this.procesoasientoinicialejercicio.getId()>0) {
						this.procesoasientoinicialejercicio.setIsDeleted(true);
						
						this.procesoasientoinicialejerciciosEliminados.add(this.procesoasientoinicialejercicio);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().remove(this.procesoasientoinicialejercicio);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesoasientoinicialejercicios.remove(this.procesoasientoinicialejercicio);				
					}
					
					
					((ProcesoAsientoInicialEjercicioModel) this.jTableDatosProcesoAsientoInicialEjercicio.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoAsientoInicialEjercicio(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoAsientoInicialEjercicio(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoAsientoInicialEjercicio) {
			
			if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoAsientoInicialEjercicio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio);
				}
				
				//ARCHITECTURE
				try {
					

					//TipoDocumento
					if(!this.procesoasientoinicialejercicioConstantesFunciones.cargarid_tipo_documentoProcesoAsientoInicialEjercicio || this.procesoasientoinicialejercicioConstantesFunciones.event_dependid_tipo_documentoProcesoAsientoInicialEjercicio) {
						//this.cargarCombosTipoDocumentosForeignKeyLista(" where id="+this.procesoasientoinicialejercicio.getid_tipo_documento());
									//this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false,false);
						this.tipodocumentosForeignKey=new ArrayList<TipoDocumento>();

						if(procesoasientoinicialejercicio.getTipoDocumento()!=null) {
							this.tipodocumentosForeignKey.add(procesoasientoinicialejercicio.getTipoDocumento());
						}

						this.addItemDefectoCombosForeignKeyTipoDocumento();
						this.cargarCombosFrameTipoDocumentosForeignKey("Todos");
					}
					this.setActualTipoDocumentoForeignKey(this.procesoasientoinicialejercicio.getid_tipo_documento(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoAsientoInicialEjercicio("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoAsientoInicialEjercicio(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoAsientoInicialEjercicio() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoAsientoInicialEjercicio(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoAsientoInicialEjercicio(procesoasientoinicialejercicio,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoAsientoInicialEjercicio(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoAsientoInicialEjercicio(procesoasientoinicialejercicio);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoAsientoInicialEjercicio(procesoasientoinicialejercicio,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoAsientoInicialEjercicio(procesoasientoinicialejercicio);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoAsientoInicialEjercicio(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jLabelidProcesoAsientoInicialEjercicio.setText(procesoasientoinicialejercicio.getId().toString());
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jDateChooserfecha_inicioProcesoAsientoInicialEjercicio.setDate(procesoasientoinicialejercicio.getfecha_inicio());
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jDateChooserfecha_finProcesoAsientoInicialEjercicio.setDate(procesoasientoinicialejercicio.getfecha_fin());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesoasientoinicialejercicioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesoasientoinicialejercicioLocal=this.procesoasientoinicialejercicio;
			} else {
				procesoasientoinicialejercicioLocal=this.procesoasientoinicialejercicioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesoasientoinicialejercicioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoAsientoInicialEjercicio(procesoasientoinicialejercicioLocal,true);
					
					if(procesoasientoinicialejercicioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesoasientoinicialejercicioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesoasientoinicialejercicioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoAsientoInicialEjercicio(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoAsientoInicialEjercicio(procesoasientoinicialejercicio,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoAsientoInicialEjercicio(procesoasientoinicialejercicio);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoAsientoInicialEjercicio(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoAsientoInicialEjercicio(procesoasientoinicialejercicio,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoAsientoInicialEjercicio(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jLabelidProcesoAsientoInicialEjercicio.getText()==null || this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jLabelidProcesoAsientoInicialEjercicio.getText()=="" || this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jLabelidProcesoAsientoInicialEjercicio.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jLabelidProcesoAsientoInicialEjercicio.setText("0");
			}

			if(conColumnasBase) {procesoasientoinicialejercicio.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jLabelidProcesoAsientoInicialEjercicio.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jLabelIdProcesoAsientoInicialEjercicio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesoasientoinicialejercicio.setfecha_inicio(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jDateChooserfecha_inicioProcesoAsientoInicialEjercicio.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAINICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jLabelfecha_inicioProcesoAsientoInicialEjercicio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesoasientoinicialejercicio.setfecha_fin(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jDateChooserfecha_finProcesoAsientoInicialEjercicio.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAFIN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jLabelfecha_finProcesoAsientoInicialEjercicio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoAsientoInicialEjercicio(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioBean,ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && procesoasientoinicialejercicioBean.getid_tipo_documento()!=null && !procesoasientoinicialejercicioBean.getid_tipo_documento().equals(-1L))) {procesoasientoinicialejercicio.setid_tipo_documento(procesoasientoinicialejercicioBean.getid_tipo_documento());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoAsientoInicialEjercicio(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioOrigen,ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesoasientoinicialejercicioOrigen.getId()!=null && !procesoasientoinicialejercicioOrigen.getId().equals(0L))) {procesoasientoinicialejercicio.setId(procesoasientoinicialejercicioOrigen.getId());}}
			if(conDefault || (!conDefault && procesoasientoinicialejercicioOrigen.getid_tipo_documento()!=null && !procesoasientoinicialejercicioOrigen.getid_tipo_documento().equals(-1L))) {procesoasientoinicialejercicio.setid_tipo_documento(procesoasientoinicialejercicioOrigen.getid_tipo_documento());}
			if(conDefault || (!conDefault && procesoasientoinicialejercicioOrigen.getfecha_inicio()!=null && !procesoasientoinicialejercicioOrigen.getfecha_inicio().equals(new Date()))) {procesoasientoinicialejercicio.setfecha_inicio(procesoasientoinicialejercicioOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && procesoasientoinicialejercicioOrigen.getfecha_fin()!=null && !procesoasientoinicialejercicioOrigen.getfecha_fin().equals(new Date()))) {procesoasientoinicialejercicio.setfecha_fin(procesoasientoinicialejercicioOrigen.getfecha_fin());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoAsientoInicialEjercicio(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jLabelidProcesoAsientoInicialEjercicio.setText(procesoasientoinicialejercicio.getId().toString());
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jDateChooserfecha_inicioProcesoAsientoInicialEjercicio.setDate(procesoasientoinicialejercicio.getfecha_inicio());
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jDateChooserfecha_finProcesoAsientoInicialEjercicio.setDate(procesoasientoinicialejercicio.getfecha_fin());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoAsientoInicialEjercicio(ProcesoAsientoInicialEjercicioBean procesoasientoinicialejercicioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jLabelidProcesoAsientoInicialEjercicio.setText(procesoasientoinicialejercicioBean.getId().toString());
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jDateChooserfecha_inicioProcesoAsientoInicialEjercicio.setDate(procesoasientoinicialejercicioBean.getfecha_inicio());
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jDateChooserfecha_finProcesoAsientoInicialEjercicio.setDate(procesoasientoinicialejercicioBean.getfecha_fin());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoAsientoInicialEjercicio(ProcesoAsientoInicialEjercicioParameterReturnGeneral procesoasientoinicialejercicioReturnGeneral,ProcesoAsientoInicialEjercicioBean procesoasientoinicialejercicioBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioLocal=new ProcesoAsientoInicialEjercicio();
			
			procesoasientoinicialejercicioLocal=procesoasientoinicialejercicioReturnGeneral.getProcesoAsientoInicialEjercicio();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesoasientoinicialejercicioLocal.getId()!=null && !procesoasientoinicialejercicioLocal.getId().equals(0L))) {procesoasientoinicialejercicioBean.setId(procesoasientoinicialejercicioLocal.getId());}}
			if(conDefault || (!conDefault && procesoasientoinicialejercicioLocal.getid_tipo_documento()!=null && !procesoasientoinicialejercicioLocal.getid_tipo_documento().equals(-1L))) {procesoasientoinicialejercicioBean.setid_tipo_documento(procesoasientoinicialejercicioLocal.getid_tipo_documento());}
			if(conDefault || (!conDefault && procesoasientoinicialejercicioLocal.getfecha_inicio()!=null && !procesoasientoinicialejercicioLocal.getfecha_inicio().equals(new Date()))) {procesoasientoinicialejercicioBean.setfecha_inicio(procesoasientoinicialejercicioLocal.getfecha_inicio());}
			if(conDefault || (!conDefault && procesoasientoinicialejercicioLocal.getfecha_fin()!=null && !procesoasientoinicialejercicioLocal.getfecha_fin().equals(new Date()))) {procesoasientoinicialejercicioBean.setfecha_fin(procesoasientoinicialejercicioLocal.getfecha_fin());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoAsientoInicialEjercicioGenerico(Long idProcesoAsientoInicialEjercicioSeleccionado,JComboBox jComboBoxProcesoAsientoInicialEjercicio,List<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosLocal)throws Exception {
		try {
			ProcesoAsientoInicialEjercicio  procesoasientoinicialejercicioTemp=null;

			for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:procesoasientoinicialejerciciosLocal) {
				if(procesoasientoinicialejercicioAux.getId()!=null && procesoasientoinicialejercicioAux.getId().equals(idProcesoAsientoInicialEjercicioSeleccionado)) {
					procesoasientoinicialejercicioTemp=procesoasientoinicialejercicioAux;
					break;
				}
			}

			jComboBoxProcesoAsientoInicialEjercicio.setSelectedItem(procesoasientoinicialejercicioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoAsientoInicialEjercicioGenerico(JComboBox jComboBoxProcesoAsientoInicialEjercicio,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoAsientoInicialEjercicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoAsientoInicialEjercicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoAsientoInicialEjercicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoAsientoInicialEjercicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoAsientoInicialEjercicio.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoAsientoInicialEjercicio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoAsientoInicialEjercicio.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoAsientoInicialEjercicio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoAsientoInicialEjercicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoAsientoInicialEjercicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesoasientoinicialejercicio=(ProcesoAsientoInicialEjercicio) procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) procesoasientoinicialejercicios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("TipoDocumento")) {
			//sDescripcion=this.getActualTipoDocumentoForeignKeyDescripcion((Long)value);
			if(!procesoasientoinicialejercicio.getIsNew() && !procesoasientoinicialejercicio.getIsChanged() && !procesoasientoinicialejercicio.getIsDeleted()) {
				sDescripcion=procesoasientoinicialejercicio.gettipodocumento_descripcion();
			} else {
				//sDescripcion=this.getActualTipoDocumentoForeignKeyDescripcion((Long)value);
				sDescripcion=procesoasientoinicialejercicio.gettipodocumento_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioRow=new ProcesoAsientoInicialEjercicio();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesoasientoinicialejercicioRow=(ProcesoAsientoInicialEjercicio) procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesoasientoinicialejercicioRow=(ProcesoAsientoInicialEjercicio) procesoasientoinicialejercicios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoAsientoInicialEjercicio(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio && this.isPermisoNuevoProcesoAsientoInicialEjercicio));			
			this.jButtonDuplicarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaDuplicarProcesoAsientoInicialEjercicio && this.isPermisoDuplicarProcesoAsientoInicialEjercicio));			
			this.jButtonCopiarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaCopiarProcesoAsientoInicialEjercicio && this.isPermisoCopiarProcesoAsientoInicialEjercicio));
			this.jButtonVerFormProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaVerFormProcesoAsientoInicialEjercicio && this.isPermisoVerFormProcesoAsientoInicialEjercicio));
			
			this.jButtonAbrirOrderByProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaOrdenProcesoAsientoInicialEjercicio && this.isPermisoOrdenProcesoAsientoInicialEjercicio));			
			
			this.jButtonNuevoRelacionesProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio && this.isPermisoNuevoProcesoAsientoInicialEjercicio));			
			this.jButtonNuevoGuardarCambiosProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio && this.isPermisoNuevoProcesoAsientoInicialEjercicio && this.isPermisoGuardarCambiosProcesoAsientoInicialEjercicio));
			
			if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonModificarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaModificarProcesoAsientoInicialEjercicio && this.isPermisoActualizarProcesoAsientoInicialEjercicio));	
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonActualizarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaActualizarProcesoAsientoInicialEjercicio && this.isPermisoActualizarProcesoAsientoInicialEjercicio));	
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonEliminarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaEliminarProcesoAsientoInicialEjercicio && this.isPermisoEliminarProcesoAsientoInicialEjercicio));
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonCancelarProcesoAsientoInicialEjercicio.setVisible(this.isVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio);							
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonGuardarCambiosProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio && this.isPermisoGuardarCambiosProcesoAsientoInicialEjercicio));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio && this.isPermisoGuardarCambiosProcesoAsientoInicialEjercicio));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio && this.isPermisoNuevoProcesoAsientoInicialEjercicio));						
			this.jButtonDuplicarToolBarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaDuplicarProcesoAsientoInicialEjercicio && this.isPermisoDuplicarProcesoAsientoInicialEjercicio));						
			this.jButtonCopiarToolBarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaCopiarProcesoAsientoInicialEjercicio && this.isPermisoCopiarProcesoAsientoInicialEjercicio));			
			this.jButtonVerFormToolBarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaVerFormProcesoAsientoInicialEjercicio && this.isPermisoVerFormProcesoAsientoInicialEjercicio));			
			this.jButtonAbrirOrderByToolBarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaOrdenProcesoAsientoInicialEjercicio && this.isPermisoOrdenProcesoAsientoInicialEjercicio));
			this.jButtonNuevoRelacionesToolBarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio && this.isPermisoNuevoProcesoAsientoInicialEjercicio));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio && this.isPermisoNuevoProcesoAsientoInicialEjercicio && this.isPermisoGuardarCambiosProcesoAsientoInicialEjercicio));			
			
			if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonModificarToolBarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaModificarProcesoAsientoInicialEjercicio && this.isPermisoActualizarProcesoAsientoInicialEjercicio));	
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonActualizarToolBarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaActualizarProcesoAsientoInicialEjercicio  && this.isPermisoActualizarProcesoAsientoInicialEjercicio));	
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonEliminarToolBarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaEliminarProcesoAsientoInicialEjercicio && this.isPermisoEliminarProcesoAsientoInicialEjercicio));
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonCancelarToolBarProcesoAsientoInicialEjercicio.setVisible(this.isVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio);				
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonGuardarCambiosToolBarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio && this.isPermisoGuardarCambiosProcesoAsientoInicialEjercicio));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio && this.isPermisoGuardarCambiosProcesoAsientoInicialEjercicio));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio && this.isPermisoNuevoProcesoAsientoInicialEjercicio));			
			this.jMenuItemDuplicarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaDuplicarProcesoAsientoInicialEjercicio && this.isPermisoDuplicarProcesoAsientoInicialEjercicio));			
			this.jMenuItemCopiarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaCopiarProcesoAsientoInicialEjercicio && this.isPermisoCopiarProcesoAsientoInicialEjercicio));			
			this.jMenuItemVerFormProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaVerFormProcesoAsientoInicialEjercicio && this.isPermisoVerFormProcesoAsientoInicialEjercicio));			
			this.jMenuItemAbrirOrderByProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaOrdenProcesoAsientoInicialEjercicio && this.isPermisoOrdenProcesoAsientoInicialEjercicio));			
			//this.jMenuItemMostrarOcultarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaOrdenProcesoAsientoInicialEjercicio && this.isPermisoOrdenProcesoAsientoInicialEjercicio));
			this.jMenuItemDetalleAbrirOrderByProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaOrdenProcesoAsientoInicialEjercicio && this.isPermisoOrdenProcesoAsientoInicialEjercicio));			
			//this.jMenuItemDetalleMostrarOcultarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaOrdenProcesoAsientoInicialEjercicio && this.isPermisoOrdenProcesoAsientoInicialEjercicio));			
			this.jMenuItemNuevoRelacionesProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio && this.isPermisoNuevoProcesoAsientoInicialEjercicio));			
			this.jMenuItemNuevoGuardarCambiosProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio && this.isPermisoNuevoProcesoAsientoInicialEjercicio && this.isPermisoGuardarCambiosProcesoAsientoInicialEjercicio));									
			
			if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jMenuItemModificarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaModificarProcesoAsientoInicialEjercicio && this.isPermisoActualizarProcesoAsientoInicialEjercicio));	
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jMenuItemActualizarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaActualizarProcesoAsientoInicialEjercicio && this.isPermisoActualizarProcesoAsientoInicialEjercicio));	
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jMenuItemEliminarProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaEliminarProcesoAsientoInicialEjercicio && this.isPermisoEliminarProcesoAsientoInicialEjercicio));
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jMenuItemCancelarProcesoAsientoInicialEjercicio.setVisible(this.isVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio);				
			}
			
			this.jMenuItemGuardarCambiosProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio && this.isPermisoGuardarCambiosProcesoAsientoInicialEjercicio));						
			this.jMenuItemGuardarCambiosTablaProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio && this.isPermisoGuardarCambiosProcesoAsientoInicialEjercicio));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio=this.jButtonNuevoProcesoAsientoInicialEjercicio.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoAsientoInicialEjercicio=this.jButtonDuplicarProcesoAsientoInicialEjercicio.isVisible();
			this.isVisibilidadCeldaCopiarProcesoAsientoInicialEjercicio=this.jButtonCopiarProcesoAsientoInicialEjercicio.isVisible();
			this.isVisibilidadCeldaVerFormProcesoAsientoInicialEjercicio=this.jButtonVerFormProcesoAsientoInicialEjercicio.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoAsientoInicialEjercicio=this.jButtonAbrirOrderByProcesoAsientoInicialEjercicio.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio=this.jButtonNuevoRelacionesProcesoAsientoInicialEjercicio.isVisible();
			this.isVisibilidadCeldaModificarProcesoAsientoInicialEjercicio=this.jButtonModificarProcesoAsientoInicialEjercicio.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {
			this.isVisibilidadCeldaActualizarProcesoAsientoInicialEjercicio=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonActualizarProcesoAsientoInicialEjercicio.isVisible();
			this.isVisibilidadCeldaEliminarProcesoAsientoInicialEjercicio=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonEliminarProcesoAsientoInicialEjercicio.isVisible();
			this.isVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonCancelarProcesoAsientoInicialEjercicio.isVisible();
			this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonGuardarCambiosProcesoAsientoInicialEjercicio.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio=this.jButtonGuardarCambiosTablaProcesoAsientoInicialEjercicio.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio=this.jButtonNuevoToolBarProcesoAsientoInicialEjercicio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio=this.jButtonNuevoRelacionesToolBarProcesoAsientoInicialEjercicio.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {
			this.isVisibilidadCeldaModificarProcesoAsientoInicialEjercicio=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonModificarToolBarProcesoAsientoInicialEjercicio.isVisible();
			this.isVisibilidadCeldaActualizarProcesoAsientoInicialEjercicio=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonActualizarToolBarProcesoAsientoInicialEjercicio.isVisible();
			this.isVisibilidadCeldaEliminarProcesoAsientoInicialEjercicio=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonEliminarToolBarProcesoAsientoInicialEjercicio.isVisible();
			this.isVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonCancelarToolBarProcesoAsientoInicialEjercicio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio=this.jButtonGuardarCambiosToolBarProcesoAsientoInicialEjercicio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio=this.jButtonGuardarCambiosTablaToolBarProcesoAsientoInicialEjercicio.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio=this.jMenuItemNuevoProcesoAsientoInicialEjercicio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio=this.jMenuItemNuevoRelacionesProcesoAsientoInicialEjercicio.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {
			this.isVisibilidadCeldaModificarProcesoAsientoInicialEjercicio=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jMenuItemModificarProcesoAsientoInicialEjercicio.isVisible();
			this.isVisibilidadCeldaActualizarProcesoAsientoInicialEjercicio=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jMenuItemActualizarProcesoAsientoInicialEjercicio.isVisible();
			this.isVisibilidadCeldaEliminarProcesoAsientoInicialEjercicio=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jMenuItemEliminarProcesoAsientoInicialEjercicio.isVisible();
			this.isVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio=this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jMenuItemCancelarProcesoAsientoInicialEjercicio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio=this.jMenuItemGuardarCambiosProcesoAsientoInicialEjercicio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio=this.jMenuItemGuardarCambiosTablaProcesoAsientoInicialEjercicio.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoAsientoInicialEjercicio(Boolean esInicializar) {
		if(ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesoasientoinicialejercicioSessionBean.getConGuardarRelaciones()) {
				//if(this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoAsientoInicialEjercicio();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoAsientoInicialEjercicio(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoAsientoInicialEjercicio() {
		this.jButtonNuevoProcesoAsientoInicialEjercicio.setVisible(this.isPermisoNuevoProcesoAsientoInicialEjercicio);			
		this.jButtonDuplicarProcesoAsientoInicialEjercicio.setVisible(this.isPermisoDuplicarProcesoAsientoInicialEjercicio);			
		this.jButtonCopiarProcesoAsientoInicialEjercicio.setVisible(this.isPermisoCopiarProcesoAsientoInicialEjercicio);			
		this.jButtonVerFormProcesoAsientoInicialEjercicio.setVisible(this.isPermisoVerFormProcesoAsientoInicialEjercicio);			
		
		this.jButtonAbrirOrderByProcesoAsientoInicialEjercicio.setVisible(this.isPermisoOrdenProcesoAsientoInicialEjercicio);					
		
		this.jButtonNuevoRelacionesProcesoAsientoInicialEjercicio.setVisible(this.isPermisoNuevoProcesoAsientoInicialEjercicio);			
		
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonModificarProcesoAsientoInicialEjercicio.setVisible(this.isPermisoActualizarProcesoAsientoInicialEjercicio);	
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonActualizarProcesoAsientoInicialEjercicio.setVisible(this.isPermisoActualizarProcesoAsientoInicialEjercicio);	
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonEliminarProcesoAsientoInicialEjercicio.setVisible(this.isPermisoEliminarProcesoAsientoInicialEjercicio);
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonCancelarProcesoAsientoInicialEjercicio.setVisible(this.isVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio);						
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonGuardarCambiosProcesoAsientoInicialEjercicio.setVisible(this.isPermisoGuardarCambiosProcesoAsientoInicialEjercicio);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoAsientoInicialEjercicio.setVisible(this.isPermisoActualizarProcesoAsientoInicialEjercicio);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoAsientoInicialEjercicio() {
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonModificarProcesoAsientoInicialEjercicio.setVisible(this.isPermisoActualizarProcesoAsientoInicialEjercicio);	
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonActualizarProcesoAsientoInicialEjercicio.setVisible(this.isPermisoActualizarProcesoAsientoInicialEjercicio);	
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonEliminarProcesoAsientoInicialEjercicio.setVisible(this.isPermisoEliminarProcesoAsientoInicialEjercicio);
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonCancelarProcesoAsientoInicialEjercicio.setVisible(this.isVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio);							
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonGuardarCambiosProcesoAsientoInicialEjercicio.setVisible((this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio && this.isPermisoGuardarCambiosProcesoAsientoInicialEjercicio));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoAsientoInicialEjercicio() {
		if(ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoAsientoInicialEjercicio();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoAsientoInicialEjercicio() {
	}
	
	public void jTableDatosProcesoAsientoInicialEjercicioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoAsientoInicialEjercicio(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoAsientoInicialEjercicioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoAsientoInicialEjercicio(this.getprocesoasientoinicialejercicio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoasientoinicialejercicio==null) {
						this.procesoasientoinicialejercicio = new ProcesoAsientoInicialEjercicio();
					}

					this.setVariablesFormularioToObjetoActualProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio);
				}

				if(this.procesoasientoinicialejercicio.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesoasientoinicialejercicio.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_documentoProcesoAsientoInicialEjercicioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipodocumento=true;

			idTienePermisotipodocumento=this.tienePermisosUsuarioEnPaginaWebProcesoAsientoInicialEjercicio(TipoDocumentoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipodocumento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoAsientoInicialEjercicio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoAsientoInicialEjercicio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoAsientoInicialEjercicio(this.getprocesoasientoinicialejercicio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio);

				this.tipodocumentoBeanSwingJInternalFrame=new TipoDocumentoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipodocumentoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipodocumentoBeanSwingJInternalFrame.getTipoDocumentoLogic().setConnexion(this.procesoasientoinicialejercicioLogic.getConnexion());

				if(this.procesoasientoinicialejercicio.getid_tipo_documento()!=null) {
					this.tipodocumentoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipodocumentoBeanSwingJInternalFrame.setIdActual(this.procesoasientoinicialejercicio.getid_tipo_documento());
					this.tipodocumentoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipodocumentoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipodocumentoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoDocumento();
				}

				JInternalFrameBase jinternalFrame =this.tipodocumentoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoAsientoInicialEjercicio=(TitledBorder)this.jScrollPanelDatosProcesoAsientoInicialEjercicio.getBorder();
				TitledBorder titledBordertipodocumento=(TitledBorder)this.tipodocumentoBeanSwingJInternalFrame.jScrollPanelDatosTipoDocumento.getBorder();

				titledBordertipodocumento.setTitle(titledBorderProcesoAsientoInicialEjercicio.getTitle() + " -> Tipo Documento");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_documentoProcesoAsientoInicialEjercicioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoAsientoInicialEjercicio(this.getprocesoasientoinicialejercicio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoasientoinicialejercicio==null) {
						this.procesoasientoinicialejercicio = new ProcesoAsientoInicialEjercicio();
					}

					this.setVariablesFormularioToObjetoActualProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio);
				}

				if(this.procesoasientoinicialejercicio.getid_tipo_documento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_documento = "+this.procesoasientoinicialejercicio.getid_tipo_documento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioProcesoAsientoInicialEjercicioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoAsientoInicialEjercicio(this.getprocesoasientoinicialejercicio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoasientoinicialejercicio==null) {
						this.procesoasientoinicialejercicio = new ProcesoAsientoInicialEjercicio();
					}

					this.setVariablesFormularioToObjetoActualProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio);
				}

				if(this.procesoasientoinicialejercicio.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.procesoasientoinicialejercicio.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finProcesoAsientoInicialEjercicioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoAsientoInicialEjercicio(this.getprocesoasientoinicialejercicio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesoasientoinicialejercicio==null) {
						this.procesoasientoinicialejercicio = new ProcesoAsientoInicialEjercicio();
					}

					this.setVariablesFormularioToObjetoActualProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio);
				}

				if(this.procesoasientoinicialejercicio.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.procesoasientoinicialejercicio.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false,false);

			this.getProcesoAsientoInicialEjerciciosBusquedaProcesoAsientoInicialEjercicio();

			this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false);

			//if(ProcesoAsientoInicialEjercicioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoDocumentoProcesoAsientoInicialEjercicioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false,false);

			this.getProcesoAsientoInicialEjerciciosFK_IdTipoDocumento();

			this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false);

			//if(ProcesoAsientoInicialEjercicioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesoasientoinicialejercicioLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoAsientoInicialEjercicio() {
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.dispose();
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio!=null) {
			this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.dispose();
			this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio=null;
		}
		
		if(this.jInternalFrameImportacionProcesoAsientoInicialEjercicio!=null) {
			this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.dispose();
			this.jInternalFrameImportacionProcesoAsientoInicialEjercicio=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoAsientoInicialEjercicio();
			
			ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoAsientoInicialEjercicio")) {
				jButtonNuevoProcesoAsientoInicialEjercicioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoAsientoInicialEjercicio")) {
				jButtonDuplicarProcesoAsientoInicialEjercicioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoAsientoInicialEjercicio")) {
				jButtonCopiarProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoAsientoInicialEjercicio")) {
				jButtonVerFormProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoAsientoInicialEjercicio")) {
				jButtonNuevoProcesoAsientoInicialEjercicioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoAsientoInicialEjercicio")) {
				jButtonDuplicarProcesoAsientoInicialEjercicioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoAsientoInicialEjercicio")) {
				jButtonNuevoProcesoAsientoInicialEjercicioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoAsientoInicialEjercicio")) {
				jButtonDuplicarProcesoAsientoInicialEjercicioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoAsientoInicialEjercicio")) {
				jButtonNuevoProcesoAsientoInicialEjercicioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoAsientoInicialEjercicio")) {
				jButtonNuevoProcesoAsientoInicialEjercicioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoAsientoInicialEjercicio")) {
				jButtonNuevoProcesoAsientoInicialEjercicioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoAsientoInicialEjercicio")) {
				jButtonModificarProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoAsientoInicialEjercicio")) {
				jButtonModificarProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoAsientoInicialEjercicio")) {
				jButtonModificarProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoAsientoInicialEjercicio")) {
				jButtonActualizarProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoAsientoInicialEjercicio")) {
				jButtonActualizarProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoAsientoInicialEjercicio")) {
				jButtonActualizarProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoAsientoInicialEjercicio")) {
				jButtonEliminarProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoAsientoInicialEjercicio")) {
				jButtonEliminarProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoAsientoInicialEjercicio")) {
				jButtonEliminarProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoAsientoInicialEjercicio")) {
				jButtonCancelarProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoAsientoInicialEjercicio")) {
				jButtonCancelarProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoAsientoInicialEjercicio")) {
				jButtonCancelarProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoAsientoInicialEjercicio")) {
				jButtonCerrarProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoAsientoInicialEjercicio")) {
				jButtonCerrarProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoAsientoInicialEjercicio")) {
				jButtonCerrarProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoAsientoInicialEjercicio")) {
				jButtonMostrarOcultarProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoAsientoInicialEjercicio")) {
				jButtonCancelarProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoAsientoInicialEjercicio")) {
				jButtonGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoAsientoInicialEjercicio")) {
				jButtonGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoAsientoInicialEjercicio")) {
				jButtonCopiarProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoAsientoInicialEjercicio")) {
				jButtonVerFormProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoAsientoInicialEjercicio")) {
				jButtonGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoAsientoInicialEjercicio")) {
				jButtonCopiarProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoAsientoInicialEjercicio")) {
				jButtonVerFormProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoAsientoInicialEjercicio")) {
				jButtonGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoAsientoInicialEjercicio")) {
				jButtonGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoAsientoInicialEjercicio")) {
				jButtonGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoAsientoInicialEjercicio")) {
				jButtonRecargarInformacionProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoAsientoInicialEjercicio")) {
				jButtonRecargarInformacionProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoAsientoInicialEjercicio")) {
				jButtonRecargarInformacionProcesoAsientoInicialEjercicioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoAsientoInicialEjercicio")) {
				jButtonAnterioresProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoAsientoInicialEjercicio")) {
				jButtonAnterioresProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoAsientoInicialEjercicio")) {
				jButtonAnterioresProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoAsientoInicialEjercicio")) {
				jButtonSiguientesProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoAsientoInicialEjercicio")) {
				jButtonSiguientesProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoAsientoInicialEjercicio")) {
				jButtonSiguientesProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoAsientoInicialEjercicio") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoAsientoInicialEjercicio")) {
				jButtonAbrirOrderByProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoAsientoInicialEjercicio") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoAsientoInicialEjercicio")) {
				jButtonMostrarOcultarProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoAsientoInicialEjercicio")) {
				jButtonNuevoGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoAsientoInicialEjercicio")) {
				jButtonNuevoGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoAsientoInicialEjercicio")) {
				jButtonNuevoGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoAsientoInicialEjercicio")) {
				jButtonProcesarInformacionProcesoAsientoInicialEjercicioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoAsientoInicialEjercicio")) {
				jButtonCerrarReporteDinamicoProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoAsientoInicialEjercicio")) {
				jButtonGenerarReporteDinamicoProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoAsientoInicialEjercicio")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoAsientoInicialEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoAsientoInicialEjercicio")) {
				jButtonCerrarImportacionProcesoAsientoInicialEjercicioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoAsientoInicialEjercicio")) {
				
				jButtonGenerarImportacionProcesoAsientoInicialEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoAsientoInicialEjercicio")) {
				
				jButtonAbrirImportacionProcesoAsientoInicialEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoAsientoInicialEjercicio")) {
				jComboBoxTiposAccionesProcesoAsientoInicialEjercicioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoAsientoInicialEjercicio")) {
				jComboBoxTiposRelacionesProcesoAsientoInicialEjercicioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoAsientoInicialEjercicio")) {
				jComboBoxTiposAccionesProcesoAsientoInicialEjercicioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoAsientoInicialEjercicio")) {
				
				jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoAsientoInicialEjercicio")) {
				jTextFieldValorCampoGeneralProcesoAsientoInicialEjercicioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoAsientoInicialEjercicio")) {
				jButtonAbrirOrderByProcesoAsientoInicialEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoAsientoInicialEjercicio")) {
				jButtonAbrirOrderByProcesoAsientoInicialEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoAsientoInicialEjercicio")) {
				jButtonCerrarOrderByProcesoAsientoInicialEjercicioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoAsientoInicialEjercicioBusqueda")) {
				this.jButtonidProcesoAsientoInicialEjercicioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_documentoProcesoAsientoInicialEjercicioUpdate")) {
				this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_documentoProcesoAsientoInicialEjercicioBusqueda")) {
				this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioProcesoAsientoInicialEjercicioBusqueda")) {
				this.jButtonfecha_inicioProcesoAsientoInicialEjercicioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finProcesoAsientoInicialEjercicioBusqueda")) {
				this.jButtonfecha_finProcesoAsientoInicialEjercicioBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio")) {
				this.jButtonBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicioActionPerformed(evt);
			}
			
			;
			
			
			ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoAsientoInicialEjercicio();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoAsientoInicialEjercicioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoasientoinicialejercicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoasientoinicialejercicio);
				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
				
				


				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoAsientoInicialEjercicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoAsientoInicialEjercicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesoasientoinicialejercicioLocal=this.procesoasientoinicialejercicio;
			} else {
				procesoasientoinicialejercicioLocal=this.procesoasientoinicialejercicioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoasientoinicialejercicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoasientoinicialejercicio);
				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
							
				
				


				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoAsientoInicialEjercicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoAsientoInicialEjercicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoAsientoInicialEjercicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicioAnterior =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoasientoinicialejercicioAnterior =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
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
			
			ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
			
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
			
			


			
			ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoAsientoInicialEjercicioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoasientoinicialejercicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoasientoinicialejercicio);
				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
								
						
				


				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoAsientoInicialEjercicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoAsientoInicialEjercicio.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoasientoinicialejercicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoasientoinicialejercicio);
				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
								
				
				


				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoAsientoInicialEjercicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoAsientoInicialEjercicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoAsientoInicialEjercicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicioAnterior =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoasientoinicialejercicioAnterior =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoasientoinicialejercicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoasientoinicialejercicio);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoAsientoInicialEjercicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicioAnterior =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoasientoinicialejercicioAnterior =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoAsientoInicialEjercicioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoasientoinicialejercicio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesoasientoinicialejercicio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoasientoinicialejercicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoasientoinicialejercicio);
				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
							
				
				


				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoAsientoInicialEjercicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoAsientoInicialEjercicio.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoAsientoInicialEjercicioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoasientoinicialejercicioAnterior =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesoasientoinicialejercicioAnterior =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
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
			
			ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
			
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
			
			


			
			ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoAsientoInicialEjercicioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoasientoinicialejercicio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesoasientoinicialejercicio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoasientoinicialejercicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoasientoinicialejercicio);
				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
								
				
				


				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoAsientoInicialEjercicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoAsientoInicialEjercicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoAsientoInicialEjercicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicioAnterior =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoasientoinicialejercicioAnterior =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoAsientoInicialEjercicioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoasientoinicialejercicio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesoasientoinicialejercicio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoAsientoInicialEjercicioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoasientoinicialejercicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoasientoinicialejercicio);
				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoAsientoInicialEjercicio")) {
					jCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoAsientoInicialEjercicio")) {
					jCheckBoxSeleccionadosProcesoAsientoInicialEjercicioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoAsientoInicialEjercicio")) {
					
				}
				
				


				
				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoAsientoInicialEjercicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoAsientoInicialEjercicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoasientoinicialejercicio);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesoasientoinicialejercicio);
				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
												
				
				


				
				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoAsientoInicialEjercicio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoAsientoInicialEjercicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoAsientoInicialEjercicioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesoasientoinicialejercicioAnterior =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesoasientoinicialejercicioAnterior =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoAsientoInicialEjercicioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoasientoinicialejercicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoasientoinicialejercicio);
				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
				
				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
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
			
			ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
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
			
			


			
			ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoAsientoInicialEjercicioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoasientoinicialejercicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoasientoinicialejercicio);
				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoAsientoInicialEjercicio.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoAsientoInicialEjercicio.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesoasientoinicialejercicio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesoasientoinicialejercicio);
				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
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
				
				


				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoAsientoInicialEjercicio.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoAsientoInicialEjercicio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoAsientoInicialEjercicioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesoasientoinicialejercicioAnterior =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesoasientoinicialejercicioAnterior =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoAsientoInicialEjercicio")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoAsientoInicialEjercicioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesoasientoinicialejercicio =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesoasientoinicialejercicio);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoAsientoInicialEjercicio")) {
				
				}
				
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoAsientoInicialEjercicio")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoAsientoInicialEjercicio")) {
			
			}
			
			ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoAsientoInicialEjercicio();
			
			ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoAsientoInicialEjercicio")) {
				jButtonNuevoProcesoAsientoInicialEjercicioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoAsientoInicialEjercicio")) {
				jButtonDuplicarProcesoAsientoInicialEjercicioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoAsientoInicialEjercicio")) {
				jButtonCopiarProcesoAsientoInicialEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoAsientoInicialEjercicio")) {
				jButtonVerFormProcesoAsientoInicialEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoAsientoInicialEjercicio")) {
				jButtonNuevoProcesoAsientoInicialEjercicioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoAsientoInicialEjercicio")) {
				jButtonModificarProcesoAsientoInicialEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoAsientoInicialEjercicio")) {
				jButtonActualizarProcesoAsientoInicialEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoAsientoInicialEjercicio")) {
				jButtonEliminarProcesoAsientoInicialEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoAsientoInicialEjercicio")) {
				jButtonGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoAsientoInicialEjercicio")) {
				jButtonCancelarProcesoAsientoInicialEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoAsientoInicialEjercicio")) {
				jButtonCerrarProcesoAsientoInicialEjercicioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoAsientoInicialEjercicio")) {
				jButtonGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoAsientoInicialEjercicio")) {
				jButtonNuevoGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoAsientoInicialEjercicio")) {
				jButtonAbrirOrderByProcesoAsientoInicialEjercicioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoAsientoInicialEjercicio")) {
				jButtonRecargarInformacionProcesoAsientoInicialEjercicioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoAsientoInicialEjercicio")) {
				jButtonAnterioresProcesoAsientoInicialEjercicioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoAsientoInicialEjercicio")) {
				jButtonSiguientesProcesoAsientoInicialEjercicioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoAsientoInicialEjercicioBusqueda")) {
				this.jButtonidProcesoAsientoInicialEjercicioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_documentoProcesoAsientoInicialEjercicioUpdate")) {
				this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_documentoProcesoAsientoInicialEjercicioBusqueda")) {
				this.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioProcesoAsientoInicialEjercicioBusqueda")) {
				this.jButtonfecha_inicioProcesoAsientoInicialEjercicioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finProcesoAsientoInicialEjercicioBusqueda")) {
				this.jButtonfecha_finProcesoAsientoInicialEjercicioBusquedaActionPerformed(evt);
			}
			
			ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoAsientoInicialEjercicio();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoAsientoInicialEjercicio")) {
				closingInternalFrameProcesoAsientoInicialEjercicio();
				
			} else if(sTipo.equals("jButtonCancelarProcesoAsientoInicialEjercicio")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoAsientoInicialEjercicio = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoAsientoInicialEjercicioBeanSwingJInternalFrame jInternalFrameParent=(ProcesoAsientoInicialEjercicioBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoAsientoInicialEjercicioActionPerformed(null);
			}
			
			ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesoasientoinicialejercicio,new Object(),this.procesoasientoinicialejercicioParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoAsientoInicialEjercicio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoAsientoInicialEjercicio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoAsientoInicialEjercicio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesoasientoinicialejercicio)) {
			if(!esControlTabla) {
				if(ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio);			
				}
				
				if(this.procesoasientoinicialejercicioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicioReturnGeneral,this.procesoasientoinicialejercicioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesoasientoinicialejercicioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoAsientoInicialEjercicio(classes,this.procesoasientoinicialejercicioReturnGeneral,this.procesoasientoinicialejercicioBean,false);
					}
						
					if(this.procesoasientoinicialejercicioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicioReturnGeneral.getProcesoAsientoInicialEjercicio());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicioReturnGeneral.getProcesoAsientoInicialEjercicio());	
					}
						
					if(this.procesoasientoinicialejercicioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicioReturnGeneral.getProcesoAsientoInicialEjercicio(),classes);//this.procesoasientoinicialejercicioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio,classes);//this.procesoasientoinicialejercicioBean);									
				}
			
				if(ProcesoAsientoInicialEjercicioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoAsientoInicialEjercicio(this.procesoasientoinicialejercicio);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesoasientoinicialejercicioAnterior!=null) {
						this.procesoasientoinicialejercicio=this.procesoasientoinicialejercicioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesoasientoinicialejercicioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesoasientoinicialejercicioReturnGeneral.getProcesoAsientoInicialEjercicio(),procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesoasientoinicialejercicioReturnGeneral.getProcesoAsientoInicialEjercicio(),this.procesoasientoinicialejercicios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoAsientoInicialEjercicio.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoAsientoInicialEjercicio.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoAsientoInicialEjercicio();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoAsientoInicialEjercicio() throws Exception {
		
		ProcesoAsientoInicialEjercicioModel procesoasientoinicialejercicioModel=(ProcesoAsientoInicialEjercicioModel)this.jTableDatosProcesoAsientoInicialEjercicio.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesoasientoinicialejercicioModel.procesoasientoinicialejercicios=this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesoasientoinicialejercicioModel.procesoasientoinicialejercicios=this.procesoasientoinicialejercicios;
		}
		
		
		((ProcesoAsientoInicialEjercicioModel) this.jTableDatosProcesoAsientoInicialEjercicio.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoAsientoInicialEjercicio() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesoasientoinicialejercicioAnterior(),this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesoasientoinicialejercicioAnterior(),this.procesoasientoinicialejercicios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoAsientoInicialEjercicio();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoAsientoInicialEjercicio(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
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
										
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesoasientoinicialejercicio,new Object(),generalEntityParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesoasientoinicialejercicioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoAsientoInicialEjercicioConstantesFunciones.getClassesRelationshipsOfProcesoAsientoInicialEjercicio(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoAsientoInicialEjercicioConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoAsientoInicialEjercicio(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoAsientoInicialEjercicio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesoasientoinicialejercicio,new Object(),generalEntityParameterGeneral,this.procesoasientoinicialejercicioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoAsientoInicialEjercicio(ProcesoAsientoInicialEjercicioBean procesoasientoinicialejercicioBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoAsientoInicialEjercicio(ArrayList<Classe> classes,ProcesoAsientoInicialEjercicioReturnGeneral procesoasientoinicialejercicioReturnGeneral,ProcesoAsientoInicialEjercicioBean procesoasientoinicialejercicioBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoAsientoInicialEjercicio(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesoasientoinicialejercicio)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio = new ProcesoAsientoInicialEjercicioDetalleFormJInternalFrame(jDesktopPane,this.procesoasientoinicialejercicioSessionBean.getConGuardarRelaciones(),this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio);
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.setVisible(false);
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.procesoasientoinicialejercicioLogic=this.procesoasientoinicialejercicioLogic;
		
		this.cargarCombosFrameForeignKeyProcesoAsientoInicialEjercicio("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoAsientoInicialEjercicio();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoAsientoInicialEjercicio();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoAsientoInicialEjercicio("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoAsientoInicialEjercicio();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoAsientoInicialEjercicio"));
		
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonModificarProcesoAsientoInicialEjercicio.addActionListener(new ButtonActionListener(this,"ModificarProcesoAsientoInicialEjercicio"));

		
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonModificarToolBarProcesoAsientoInicialEjercicio.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoAsientoInicialEjercicio"));
					
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jMenuItemModificarProcesoAsientoInicialEjercicio.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoAsientoInicialEjercicio"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonActualizarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"ActualizarProcesoAsientoInicialEjercicio"));
		
		
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonActualizarToolBarProcesoAsientoInicialEjercicio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoAsientoInicialEjercicio"));
						
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jMenuItemActualizarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoAsientoInicialEjercicio"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonEliminarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"EliminarProcesoAsientoInicialEjercicio"));
		
		
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonEliminarToolBarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoAsientoInicialEjercicio"));
								
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jMenuItemEliminarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoAsientoInicialEjercicio"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonCancelarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"CancelarProcesoAsientoInicialEjercicio"));
		
		
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonCancelarToolBarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoAsientoInicialEjercicio"));
					
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jMenuItemCancelarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoAsientoInicialEjercicio"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jMenuItemDetalleCerrarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoAsientoInicialEjercicio"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonGuardarCambiosToolBarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoAsientoInicialEjercicio"));
		
		
		
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonGuardarCambiosToolBarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoAsientoInicialEjercicio"));
		
		
		
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoAsientoInicialEjercicio"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonidProcesoAsientoInicialEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoAsientoInicialEjercicioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documentoProcesoAsientoInicialEjercicioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documentoProcesoAsientoInicialEjercicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonfecha_inicioProcesoAsientoInicialEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioProcesoAsientoInicialEjercicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonfecha_finProcesoAsientoInicialEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finProcesoAsientoInicialEjercicioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jTabbedPaneRelacionesProcesoAsientoInicialEjercicio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoAsientoInicialEjercicio"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoAsientoInicialEjercicio"));
		
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoAsientoInicialEjercicio"));
		}
		
		this.jTableDatosProcesoAsientoInicialEjercicio.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoAsientoInicialEjercicio"));
		
		this.jTableDatosProcesoAsientoInicialEjercicio.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoAsientoInicialEjercicio"));
		
		this.jButtonNuevoProcesoAsientoInicialEjercicio.addActionListener(new ButtonActionListener(this,"NuevoProcesoAsientoInicialEjercicio"));
		
		this.jButtonDuplicarProcesoAsientoInicialEjercicio.addActionListener(new ButtonActionListener(this,"DuplicarProcesoAsientoInicialEjercicio"));
		
		this.jButtonCopiarProcesoAsientoInicialEjercicio.addActionListener(new ButtonActionListener(this,"CopiarProcesoAsientoInicialEjercicio"));
		
		this.jButtonVerFormProcesoAsientoInicialEjercicio.addActionListener(new ButtonActionListener(this,"VerFormProcesoAsientoInicialEjercicio"));
		
		
		this.jButtonNuevoToolBarProcesoAsientoInicialEjercicio.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoAsientoInicialEjercicio"));
			
		this.jButtonDuplicarToolBarProcesoAsientoInicialEjercicio.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoAsientoInicialEjercicio"));
			
		this.jMenuItemNuevoProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoAsientoInicialEjercicio"));
			
		this.jMenuItemDuplicarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoAsientoInicialEjercicio"));		
		
		
		this.jButtonNuevoRelacionesProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoAsientoInicialEjercicio"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoAsientoInicialEjercicio.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoAsientoInicialEjercicio"));
			
		this.jMenuItemNuevoRelacionesProcesoAsientoInicialEjercicio.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoAsientoInicialEjercicio"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonModificarProcesoAsientoInicialEjercicio.addActionListener(new ButtonActionListener(this,"ModificarProcesoAsientoInicialEjercicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonModificarToolBarProcesoAsientoInicialEjercicio.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoAsientoInicialEjercicio"));
			
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jMenuItemModificarProcesoAsientoInicialEjercicio.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoAsientoInicialEjercicio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonActualizarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"ActualizarProcesoAsientoInicialEjercicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonActualizarToolBarProcesoAsientoInicialEjercicio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoAsientoInicialEjercicio"));
				
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jMenuItemActualizarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoAsientoInicialEjercicio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonEliminarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"EliminarProcesoAsientoInicialEjercicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonEliminarToolBarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoAsientoInicialEjercicio"));
						
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jMenuItemEliminarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoAsientoInicialEjercicio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonCancelarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"CancelarProcesoAsientoInicialEjercicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonCancelarToolBarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoAsientoInicialEjercicio"));
			
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jMenuItemCancelarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoAsientoInicialEjercicio"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoAsientoInicialEjercicio"));		
		
		
		this.jButtonCerrarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"CerrarProcesoAsientoInicialEjercicio"));
		
		
		this.jButtonCerrarToolBarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoAsientoInicialEjercicio"));
			
		this.jMenuItemCerrarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoAsientoInicialEjercicio"));
			
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jMenuItemDetalleCerrarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoAsientoInicialEjercicio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonGuardarCambiosProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoAsientoInicialEjercicio"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonGuardarCambiosToolBarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoAsientoInicialEjercicio"));
		}
		
		this.jButtonCopiarToolBarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoAsientoInicialEjercicio"));
			
		this.jButtonVerFormToolBarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoAsientoInicialEjercicio"));
		
		this.jMenuItemGuardarCambiosProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoAsientoInicialEjercicio"));
			
		this.jMenuItemCopiarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoAsientoInicialEjercicio"));		
		
		this.jMenuItemVerFormProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoAsientoInicialEjercicio"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoAsientoInicialEjercicio"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoAsientoInicialEjercicio"));
			
		this.jMenuItemGuardarCambiosTablaProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoAsientoInicialEjercicio"));		
		
		
		
		this.jButtonRecargarInformacionProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoAsientoInicialEjercicio"));
					
		this.jButtonRecargarInformacionToolBarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoAsientoInicialEjercicio"));
		
		this.jMenuItemRecargarInformacionProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoAsientoInicialEjercicio"));		
		
		
		
		this.jButtonAnterioresProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"AnterioresProcesoAsientoInicialEjercicio"));
		
		
		this.jButtonAnterioresToolBarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoAsientoInicialEjercicio"));
		
		this.jMenuItemAnterioresProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoAsientoInicialEjercicio"));		
		
		
		this.jButtonSiguientesProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"SiguientesProcesoAsientoInicialEjercicio"));
		
		
		this.jButtonSiguientesToolBarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoAsientoInicialEjercicio"));
			
		this.jMenuItemSiguientesProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoAsientoInicialEjercicio"));
			
		this.jMenuItemAbrirOrderByProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoAsientoInicialEjercicio"));
			
		this.jMenuItemMostrarOcultarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoAsientoInicialEjercicio"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoAsientoInicialEjercicio"));
			
		this.jMenuItemDetalleMostarOcultarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoAsientoInicialEjercicio"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoAsientoInicialEjercicio"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoAsientoInicialEjercicio"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoAsientoInicialEjercicio"));		
		
		
		this.jButtonProcesarInformacionProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoAsientoInicialEjercicio"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicio.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoAsientoInicialEjercicio"));

		this.jCheckBoxSeleccionadosProcesoAsientoInicialEjercicio.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoAsientoInicialEjercicio"));
		
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoAsientoInicialEjercicio"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoAsientoInicialEjercicio"));
			
		this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoAsientoInicialEjercicio"));
					
		this.jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoAsientoInicialEjercicio"));
			
		this.jTextFieldValorCampoGeneralProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoAsientoInicialEjercicio"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonidProcesoAsientoInicialEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoAsientoInicialEjercicioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documentoProcesoAsientoInicialEjercicioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documentoProcesoAsientoInicialEjercicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonfecha_inicioProcesoAsientoInicialEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioProcesoAsientoInicialEjercicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonfecha_finProcesoAsientoInicialEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finProcesoAsientoInicialEjercicioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.addActionListener(new ButtonActionListener(this,"BusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio!=null) {
				this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoAsientoInicialEjercicio"));
				this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoAsientoInicialEjercicio"));
				this.jInternalFrameReporteDinamicoProcesoAsientoInicialEjercicio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoAsientoInicialEjercicio"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoAsientoInicialEjercicio"));				
			//this.jButtonGenerarReporteDinamicoProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoAsientoInicialEjercicio"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoAsientoInicialEjercicio"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoAsientoInicialEjercicio!=null) {
				this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoAsientoInicialEjercicio"));
				this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoAsientoInicialEjercicio"));
				this.jInternalFrameImportacionProcesoAsientoInicialEjercicio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoAsientoInicialEjercicio"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoAsientoInicialEjercicio"));
			
			this.jButtonAbrirOrderByToolBarProcesoAsientoInicialEjercicio.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoAsientoInicialEjercicio"));			
			
			if(this.jInternalFrameOrderByProcesoAsientoInicialEjercicio!=null) {
				this.jInternalFrameOrderByProcesoAsientoInicialEjercicio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoAsientoInicialEjercicio"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jTabbedPaneRelacionesProcesoAsientoInicialEjercicio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoAsientoInicialEjercicio"));
		
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
            		closingInternalFrameProcesoAsientoInicialEjercicio();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoAsientoInicialEjercicio = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoAsientoInicialEjercicioBeanSwingJInternalFrame jInternalFrameParent=(ProcesoAsientoInicialEjercicioBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoAsientoInicialEjercicioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoAsientoInicialEjercicio.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoAsientoInicialEjercicioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoAsientoInicialEjercicio.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoAsientoInicialEjercicio.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoAsientoInicialEjercicioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoAsientoInicialEjercicioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoAsientoInicialEjercicioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonNuevoProcesoAsientoInicialEjercicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoAsientoInicialEjercicioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoAsientoInicialEjercicioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoAsientoInicialEjercicioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoAsientoInicialEjercicioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonNuevoRelacionesProcesoAsientoInicialEjercicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoAsientoInicialEjercicioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonModificarProcesoAsientoInicialEjercicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoAsientoInicialEjercicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonActualizarProcesoAsientoInicialEjercicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoAsientoInicialEjercicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonEliminarProcesoAsientoInicialEjercicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoAsientoInicialEjercicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonCancelarProcesoAsientoInicialEjercicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoAsientoInicialEjercicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoAsientoInicialEjercicio";
		inputMap = this.jButtonCerrarProcesoAsientoInicialEjercicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoAsientoInicialEjercicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonGuardarCambiosProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoAsientoInicialEjercicio";
		inputMap = this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonGuardarCambiosProcesoAsientoInicialEjercicio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonGuardarCambiosProcesoAsientoInicialEjercicio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicio.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoAsientoInicialEjercicioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoAsientoInicialEjercicio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoAsientoInicialEjercicioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonidProcesoAsientoInicialEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoAsientoInicialEjercicioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documentoProcesoAsientoInicialEjercicioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonid_tipo_documentoProcesoAsientoInicialEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documentoProcesoAsientoInicialEjercicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonfecha_inicioProcesoAsientoInicialEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioProcesoAsientoInicialEjercicioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jButtonfecha_finProcesoAsientoInicialEjercicioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finProcesoAsientoInicialEjercicioBusqueda"));
		
		
		this.jButtonBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio.addActionListener(new ButtonActionListener(this,"BusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoAsientoInicialEjercicio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoAsientoInicialEjercicioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoAsientoInicialEjercicio.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoAsientoInicialEjercicio(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios()) {
					procesoasientoinicialejercicioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:procesoasientoinicialejercicios) {
					procesoasientoinicialejercicioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoAsientoInicialEjercicioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios()) {
						procesoasientoinicialejercicioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:procesoasientoinicialejercicios) {
						procesoasientoinicialejercicioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:procesoasientoinicialejercicios) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoAsientoInicialEjercicio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoAsientoInicialEjercicio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoAsientoInicialEjercicio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoAsientoInicialEjercicio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoAsientoInicialEjercicioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoAsientoInicialEjercicio.getSelectedRows();
			
			ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioLocal=new ProcesoAsientoInicialEjercicio();
			
			//this.seleccionarTodosProcesoAsientoInicialEjercicio(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesoasientoinicialejercicioLocal =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios().toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesoasientoinicialejercicioLocal =(ProcesoAsientoInicialEjercicio) this.procesoasientoinicialejercicios.toArray()[this.jTableDatosProcesoAsientoInicialEjercicio.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesoasientoinicialejercicioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios()) {
						procesoasientoinicialejercicioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:procesoasientoinicialejercicios) {
						procesoasientoinicialejercicioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoAsientoInicialEjercicio(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoAsientoInicialEjercicio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoAsientoInicialEjercicio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoAsientoInicialEjercicio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoAsientoInicialEjercicioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoAsientoInicialEjercicioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoAsientoInicialEjercicioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoAsientoInicialEjercicio.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios()) {
				
						if(sTipoSeleccionar.equals(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							procesoasientoinicialejercicioAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							procesoasientoinicialejercicioAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:procesoasientoinicialejercicios) {
					
						if(sTipoSeleccionar.equals(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							procesoasientoinicialejercicioAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							procesoasientoinicialejercicioAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoAsientoInicialEjercicio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoAsientoInicialEjercicioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoAsientoInicialEjercicio=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoAsientoInicialEjercicio) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoAsientoInicialEjercicio(conSplash);
				
					this.generarReporteProcesoAsientoInicialEjerciciosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoAsientoInicialEjerciciosSeleccionados();
				//this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoAsientoInicialEjerciciosSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoAsientoInicialEjerciciosSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoAsientoInicialEjercicio();
				
				this.exportarProcesoAsientoInicialEjerciciosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoAsientoInicialEjercicios();
				//this.importarProcesoAsientoInicialEjercicios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoAsientoInicialEjercicio();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoAsientoInicialEjerciciosSeleccionados();
				//this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Asiento Inicial Ejercicio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoAsientoInicialEjercicio();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoAsientoInicialEjercicio)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoAsientoInicialEjercicio(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Asiento Inicial Ejercicio",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoAsientoInicialEjercicioBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoAsientoInicialEjercicio) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoAsientoInicialEjercicio(conSplash);
					
						//this.actualizarParametrosGeneralProcesoAsientoInicialEjercicio();
						
						this.generarReporteProcesoAccionProcesoAsientoInicialEjerciciosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Asiento Inicial EjercicioS SELECCIONADOS?", "MANTENIMIENTO DE Proceso Asiento Inicial Ejercicio", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoAsientoInicialEjercicio();
				
						this.actualizarParametrosGeneralProcesoAsientoInicialEjercicio();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesoasientoinicialejercicioReturnGeneral=procesoasientoinicialejercicioLogic.procesarAccionProcesoAsientoInicialEjerciciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios(),this.procesoasientoinicialejercicioParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoAsientoInicialEjercicioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoAsientoInicialEjercicio();
					
					ProcesoAsientoInicialEjercicioBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoAsientoInicialEjercicioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoAsientoInicialEjercicio.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxTiposAccionesFormularioProcesoAsientoInicialEjercicio.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoAsientoInicialEjercicio(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoAsientoInicialEjercicioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoAsientoInicialEjercicio();
			
			if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosSeleccionados=new ArrayList<ProcesoAsientoInicialEjercicio>();		
			ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio=new ProcesoAsientoInicialEjercicio();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoAsientoInicialEjercicio.getSelectedItem();
			
			
			
			
			procesoasientoinicialejerciciosSeleccionados=this.getProcesoAsientoInicialEjerciciosSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesoasientoinicialejerciciosSeleccionados.size()==1) {
				for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:procesoasientoinicialejerciciosSeleccionados) {
					procesoasientoinicialejercicio=procesoasientoinicialejercicioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoAsientoInicialEjercicio();
			
      		//this.finishProcessProcesoAsientoInicialEjercicio(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoAsientoInicialEjercicioReturnGeneral() throws Exception {
		if(this.procesoasientoinicialejercicioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesoasientoinicialejercicioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesoasientoinicialejercicioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesoasientoinicialejercicioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesoasientoinicialejercicioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesoasientoinicialejercicioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false);
		}
		
		if(this.procesoasientoinicialejercicioReturnGeneral.getConRetornoLista() || this.procesoasientoinicialejercicioReturnGeneral.getConRetornoObjeto()) {
			if(this.procesoasientoinicialejercicioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesoasientoinicialejercicioLogic.setProcesoAsientoInicialEjercicios(this.procesoasientoinicialejercicioReturnGeneral.getProcesoAsientoInicialEjercicios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoAsientoInicialEjercicio(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoAsientoInicialEjercicio() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoAsientoInicialEjercicio> getProcesoAsientoInicialEjerciciosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosSeleccionados=new ArrayList<ProcesoAsientoInicialEjercicio>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoAsientoInicialEjercicio) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios()) {
					if(procesoasientoinicialejercicioAux.getIsSelected()) {
						procesoasientoinicialejerciciosSeleccionados.add(procesoasientoinicialejercicioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:this.procesoasientoinicialejercicios) {
					if(procesoasientoinicialejercicioAux.getIsSelected()) {
						procesoasientoinicialejerciciosSeleccionados.add(procesoasientoinicialejercicioAux);				
					}
				}
			}
			
			if(procesoasientoinicialejerciciosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesoasientoinicialejerciciosSeleccionados.addAll(this.procesoasientoinicialejercicioLogic.getProcesoAsientoInicialEjercicios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesoasientoinicialejerciciosSeleccionados.addAll(this.procesoasientoinicialejercicios);				
					}
				}
			}
		} else {
			procesoasientoinicialejerciciosSeleccionados.add(this.procesoasientoinicialejercicio);
		}
		
		return procesoasientoinicialejerciciosSeleccionados;
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
	
	public void generarReporteProcesoAsientoInicialEjerciciosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoAsientoInicialEjerciciosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoAsientoInicialEjerciciosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoAsientoInicialEjerciciosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoAsientoInicialEjerciciosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Asiento Inicial Ejercicio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoAsientoInicialEjerciciosSeleccionados() throws Exception {
		ArrayList<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosSeleccionados=new ArrayList<ProcesoAsientoInicialEjercicio>();		
		
		procesoasientoinicialejerciciosSeleccionados=this.getProcesoAsientoInicialEjerciciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoAsientoInicialEjercicios("Todos",procesoasientoinicialejerciciosSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoAsientoInicialEjerciciosSeleccionados() throws Exception {
		ArrayList<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosSeleccionados=new ArrayList<ProcesoAsientoInicialEjercicio>();		
		
		procesoasientoinicialejerciciosSeleccionados=this.getProcesoAsientoInicialEjerciciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoAsientoInicialEjercicios("Todos",procesoasientoinicialejerciciosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoAsientoInicialEjerciciosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosSeleccionados=new ArrayList<ProcesoAsientoInicialEjercicio>();
		
		procesoasientoinicialejerciciosSeleccionados=this.getProcesoAsientoInicialEjerciciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoAsientoInicialEjercicios("Todos",procesoasientoinicialejerciciosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoAsientoInicialEjerciciosSeleccionados() throws Exception {
		ArrayList<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosSeleccionados=new ArrayList<ProcesoAsientoInicialEjercicio>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoAsientoInicialEjercicio();
		
		
		procesoasientoinicialejerciciosSeleccionados=this.getProcesoAsientoInicialEjerciciosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoAsientoInicialEjercicio();
		
		
		//this.generarReporteProcesoAsientoInicialEjercicios("Todos",procesoasientoinicialejerciciosSeleccionados ,procesoasientoinicialejercicioImplementable,procesoasientoinicialejercicioImplementableHome);
	}
	
	public void mostrarImportacionProcesoAsientoInicialEjercicios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoAsientoInicialEjercicio();
		
		this.abrirFrameImportacionProcesoAsientoInicialEjercicio();		
		
			
		//this.generarReporteProcesoAsientoInicialEjercicios("Todos",procesoasientoinicialejerciciosSeleccionados ,procesoasientoinicialejercicioImplementable,procesoasientoinicialejercicioImplementableHome);
	}
	
	public void importarProcesoAsientoInicialEjercicios() throws Exception {		
	
	}
	
	public void exportarProcesoAsientoInicialEjerciciosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoAsientoInicialEjerciciosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoAsientoInicialEjerciciosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoAsientoInicialEjerciciosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Asiento Inicial Ejercicio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoAsientoInicialEjerciciosSeleccionados() throws Exception {
		ArrayList<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosSeleccionados=new ArrayList<ProcesoAsientoInicialEjercicio>();		
		
		procesoasientoinicialejerciciosSeleccionados=this.getProcesoAsientoInicialEjerciciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoasientoinicialejercicio."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoAsientoInicialEjercicio(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:procesoasientoinicialejerciciosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoAsientoInicialEjercicio(procesoasientoinicialejercicioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesoasientoinicialejercicioAux.setsDetalleGeneralEntityReporte(procesoasientoinicialejercicioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Asiento Inicial Ejercicio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoAsientoInicialEjercicio(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_IDTIPODOCUMENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAFIN;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoAsientoInicialEjercicio(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesoasientoinicialejercicio.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoasientoinicialejercicio.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoasientoinicialejercicio.gettipodocumento_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoasientoinicialejercicio.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesoasientoinicialejercicio.getfecha_fin().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoAsientoInicialEjerciciosSeleccionados() throws Exception {
		ArrayList<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosSeleccionados=new ArrayList<ProcesoAsientoInicialEjercicio>();		
		
		procesoasientoinicialejerciciosSeleccionados=this.getProcesoAsientoInicialEjerciciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoasientoinicialejercicio.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoAsientoInicialEjercicios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoAsientoInicialEjercicio(row);				
				iRow++;
			}				
			
			for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:procesoasientoinicialejerciciosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoAsientoInicialEjercicio(procesoasientoinicialejercicioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Asiento Inicial Ejercicio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoAsientoInicialEjerciciosSeleccionados() throws Exception {
		ArrayList<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosSeleccionados=new ArrayList<ProcesoAsientoInicialEjercicio>();		
		
		procesoasientoinicialejerciciosSeleccionados=this.getProcesoAsientoInicialEjerciciosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesoasientoinicialejercicio.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesoasientoinicialejercicios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesoasientoinicialejercicio");
			//elementRoot.appendChild(element);
		
			for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:procesoasientoinicialejerciciosSeleccionados) {
				element = document.createElement("procesoasientoinicialejercicio");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoAsientoInicialEjercicio(procesoasientoinicialejercicioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Asiento Inicial Ejercicio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoAsientoInicialEjercicio(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_IDTIPODOCUMENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAFIN);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoAsientoInicialEjercicio(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesoasientoinicialejercicio.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesoasientoinicialejercicio.gettipodocumento_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesoasientoinicialejercicio.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(procesoasientoinicialejercicio.getfecha_fin());				
	}
	
	public void setFilaDatosExportarXmlProcesoAsientoInicialEjercicio(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicio,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoAsientoInicialEjercicioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesoasientoinicialejercicio.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoAsientoInicialEjercicioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesoasientoinicialejercicio.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementtipodocumento_descripcion = document.createElement(ProcesoAsientoInicialEjercicioConstantesFunciones.IDTIPODOCUMENTO);
		elementtipodocumento_descripcion.appendChild(document.createTextNode(procesoasientoinicialejercicio.gettipodocumento_descripcion()));
		element.appendChild(elementtipodocumento_descripcion);

		Element elementfecha_inicio = document.createElement(ProcesoAsientoInicialEjercicioConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(procesoasientoinicialejercicio.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(ProcesoAsientoInicialEjercicioConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(procesoasientoinicialejercicio.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);
	}
	
	public void generarReporteGroupGenericoProcesoAsientoInicialEjerciciosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosSeleccionados=new ArrayList<ProcesoAsientoInicialEjercicio>();
		
		procesoasientoinicialejerciciosSeleccionados=this.getProcesoAsientoInicialEjerciciosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoAsientoInicialEjercicio(procesoasientoinicialejerciciosSeleccionados);
		
		this.generarReporteProcesoAsientoInicialEjercicios("Todos",procesoasientoinicialejerciciosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoAsientoInicialEjercicio(ArrayList<ProcesoAsientoInicialEjercicio> procesoasientoinicialejerciciosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoAsientoInicialEjercicio procesoasientoinicialejercicioAux:procesoasientoinicialejerciciosSeleccionados) {
				procesoasientoinicialejercicioAux.setsDetalleGeneralEntityReporte(procesoasientoinicialejercicioAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_IDTIPODOCUMENTO)) {
					existe=true;
					procesoasientoinicialejercicioAux.setsDescripcionGeneralEntityReporte1(procesoasientoinicialejercicioAux.gettipodocumento_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					procesoasientoinicialejercicioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(procesoasientoinicialejercicioAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(ProcesoAsientoInicialEjercicioConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					procesoasientoinicialejercicioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(procesoasientoinicialejercicioAux.getfecha_fin()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoAsientoInicialEjercicioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoAsientoInicialEjercicio(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaActualizarProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaEliminarProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaModificarProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaActualizarProcesoAsientoInicialEjercicio=true;
			this.isVisibilidadCeldaEliminarProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaModificarProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaActualizarProcesoAsientoInicialEjercicio=true;
			this.isVisibilidadCeldaEliminarProcesoAsientoInicialEjercicio=true;
			this.isVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaModificarProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaActualizarProcesoAsientoInicialEjercicio=true;
			this.isVisibilidadCeldaEliminarProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio=true;
			this.isVisibilidadCeldaModificarProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaActualizarProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaEliminarProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaActualizarProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaEliminarProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaModificarProcesoAsientoInicialEjercicio=true;
			this.isVisibilidadCeldaActualizarProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaEliminarProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoAsientoInicialEjercicioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio=true;
		} else {
			this.actualizarEstadoPanelsProcesoAsientoInicialEjercicio(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoAsientoInicialEjercicio=false;
			//this.isVisibilidadCeldaVerFormProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaDuplicarProcesoAsientoInicialEjercicio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesoasientoinicialejercicioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
			if(!procesoasientoinicialejercicioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio=false;												
			}
			
			this.jButtonCerrarProcesoAsientoInicialEjercicio.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio=false;
		}
		
		if(!this.permiteMantenimiento(this.procesoasientoinicialejercicio)) {
			this.isVisibilidadCeldaActualizarProcesoAsientoInicialEjercicio=false;
			this.isVisibilidadCeldaEliminarProcesoAsientoInicialEjercicio=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoAsientoInicialEjercicio=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoAsientoInicialEjercicio=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoAsientoInicialEjercicio=false;
		//this.isVisibilidadCeldaModificarProcesoAsientoInicialEjercicio=true;
		this.isVisibilidadCeldaActualizarProcesoAsientoInicialEjercicio=false;
		this.isVisibilidadCeldaEliminarProcesoAsientoInicialEjercicio=false;
		//this.isVisibilidadCeldaCancelarProcesoAsientoInicialEjercicio=true;			
		this.isVisibilidadCeldaGuardarProcesoAsientoInicialEjercicio=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoAsientoInicialEjercicio() {
	}
	
	public void actualizarEstadoPanelsProcesoAsientoInicialEjercicio(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio!=null) {
				this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio!=null) {
				this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoAsientoInicialEjercicio!=null) {
				this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoAsientoInicialEjercicio!=null) {
				this.jPanelPaginacionProcesoAsientoInicialEjercicio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoAsientoInicialEjercicio!=null) {
				this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio!=null) {
				this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio!=null) {
				this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoAsientoInicialEjercicio!=null) {
				this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoAsientoInicialEjercicio!=null) {
				this.jPanelPaginacionProcesoAsientoInicialEjercicio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoAsientoInicialEjercicio!=null) {
				this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio!=null) {
				this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio!=null) {
				this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoAsientoInicialEjercicio!=null) {
				this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoAsientoInicialEjercicio!=null) {
				this.jPanelPaginacionProcesoAsientoInicialEjercicio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoAsientoInicialEjercicio!=null) {
				this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio!=null) {
				this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio!=null) {
				this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoAsientoInicialEjercicio!=null) {
				this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoAsientoInicialEjercicio!=null) {
				this.jPanelPaginacionProcesoAsientoInicialEjercicio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoAsientoInicialEjercicio!=null) {
				this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio!=null) {
				this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio!=null) {
				this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoAsientoInicialEjercicio!=null) {
				this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoAsientoInicialEjercicio!=null) {
				this.jPanelPaginacionProcesoAsientoInicialEjercicio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoAsientoInicialEjercicio!=null) {
				this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio!=null) {
				this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio!=null) {
				this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoAsientoInicialEjercicio!=null) {
				this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoAsientoInicialEjercicio!=null) {
				this.jPanelPaginacionProcesoAsientoInicialEjercicio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoAsientoInicialEjercicio!=null) {
				this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio!=null) {
				this.jScrollPanelDatosEdicionProcesoAsientoInicialEjercicio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio!=null) {
				this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoAsientoInicialEjercicio!=null) {
				this.jScrollPanelDatosProcesoAsientoInicialEjercicio.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoAsientoInicialEjercicio!=null) {
				this.jPanelPaginacionProcesoAsientoInicialEjercicio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoAsientoInicialEjercicio!=null) {
				this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio!=null) {
					this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoAsientoInicialEjercicio!=null) {
				this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesoasientoinicialejercicioSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio!=null) {
				this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoAsientoInicialEjercicio!=null) {
				this.jPanelParametrosReportesProcesoAsientoInicialEjercicio.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaTipoDocumento(Boolean isParaTipoDocumento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoDocumentoNegation=!isParaTipoDocumento;

			this.isVisibilidadBusquedaProcesoAsientoInicialEjercicio=isParaTipoDocumento;
			if(!this.isVisibilidadBusquedaProcesoAsientoInicialEjercicio) {this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.remove(jPanelBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio);}
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
			
			this.inicializarActualizarBindingTablaProcesoAsientoInicialEjercicio(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoAsientoInicialEjercicio() {
		this.updateBorderResaltarBusquedasFormularioProcesoAsientoInicialEjercicio();
		this.updateVisibilidadBusquedasFormularioProcesoAsientoInicialEjercicio();
		this.updateHabilitarBusquedasFormularioProcesoAsientoInicialEjercicio();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoAsientoInicialEjercicio() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.getComponents().length>0) {
	

		if(this.procesoasientoinicialejercicioConstantesFunciones.resaltarBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio!=null) {
			index= this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.indexOfComponent(this.jPanelBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.getComponent(index);
				jPanel.setBorder(this.procesoasientoinicialejercicioConstantesFunciones.resaltarBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoAsientoInicialEjercicio() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.indexOfComponent(this.jPanelBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesoasientoinicialejercicioConstantesFunciones.mostrarBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio);
			if(!this.procesoasientoinicialejercicioConstantesFunciones.mostrarBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio && index>-1) {
				this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoAsientoInicialEjercicio() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.indexOfComponent(this.jPanelBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesoasientoinicialejercicioConstantesFunciones.activarBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio);
				this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.setEnabledAt(index,this.procesoasientoinicialejercicioConstantesFunciones.activarBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoAsientoInicialEjercicio(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoAsientoInicialEjercicio")) {
			index= this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.indexOfComponent(this.jPanelBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio);

			this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoAsientoInicialEjercicio.getComponent(index);

			this.procesoasientoinicialejercicioConstantesFunciones.setResaltarBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio(resaltar);

			jPanel.setBorder(this.procesoasientoinicialejercicioConstantesFunciones.resaltarBusquedaProcesoAsientoInicialEjercicioProcesoAsientoInicialEjercicio);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoAsientoInicialEjercicio.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoAsientoInicialEjercicio() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoAsientoInicialEjercicio();
		this.updateVisibilidadResaltarControlesFormularioProcesoAsientoInicialEjercicio();
		this.updateHabilitarResaltarControlesFormularioProcesoAsientoInicialEjercicio();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoAsientoInicialEjercicio() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesoasientoinicialejercicioConstantesFunciones.resaltaridProcesoAsientoInicialEjercicio!=null && this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jLabelidProcesoAsientoInicialEjercicio.setBorder(this.procesoasientoinicialejercicioConstantesFunciones.resaltaridProcesoAsientoInicialEjercicio);}
		if(this.procesoasientoinicialejercicioConstantesFunciones.resaltarid_tipo_documentoProcesoAsientoInicialEjercicio!=null && this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.setBorder(this.procesoasientoinicialejercicioConstantesFunciones.resaltarid_tipo_documentoProcesoAsientoInicialEjercicio);}
		if(this.procesoasientoinicialejercicioConstantesFunciones.resaltarfecha_inicioProcesoAsientoInicialEjercicio!=null && this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jDateChooserfecha_inicioProcesoAsientoInicialEjercicio.setBorder(this.procesoasientoinicialejercicioConstantesFunciones.resaltarfecha_inicioProcesoAsientoInicialEjercicio);}
		if(this.procesoasientoinicialejercicioConstantesFunciones.resaltarfecha_finProcesoAsientoInicialEjercicio!=null && this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jDateChooserfecha_finProcesoAsientoInicialEjercicio.setBorder(this.procesoasientoinicialejercicioConstantesFunciones.resaltarfecha_finProcesoAsientoInicialEjercicio);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoAsientoInicialEjercicio() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {
	
		//this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jLabelidProcesoAsientoInicialEjercicio.setVisible(this.procesoasientoinicialejercicioConstantesFunciones.mostraridProcesoAsientoInicialEjercicio);
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jPanelidProcesoAsientoInicialEjercicio.setVisible(this.procesoasientoinicialejercicioConstantesFunciones.mostraridProcesoAsientoInicialEjercicio);
		//this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.setVisible(this.procesoasientoinicialejercicioConstantesFunciones.mostrarid_tipo_documentoProcesoAsientoInicialEjercicio);
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jPanelid_tipo_documentoProcesoAsientoInicialEjercicio.setVisible(this.procesoasientoinicialejercicioConstantesFunciones.mostrarid_tipo_documentoProcesoAsientoInicialEjercicio);
		//this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jDateChooserfecha_inicioProcesoAsientoInicialEjercicio.setVisible(this.procesoasientoinicialejercicioConstantesFunciones.mostrarfecha_inicioProcesoAsientoInicialEjercicio);
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jPanelfecha_inicioProcesoAsientoInicialEjercicio.setVisible(this.procesoasientoinicialejercicioConstantesFunciones.mostrarfecha_inicioProcesoAsientoInicialEjercicio);
		//this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jDateChooserfecha_finProcesoAsientoInicialEjercicio.setVisible(this.procesoasientoinicialejercicioConstantesFunciones.mostrarfecha_finProcesoAsientoInicialEjercicio);
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jPanelfecha_finProcesoAsientoInicialEjercicio.setVisible(this.procesoasientoinicialejercicioConstantesFunciones.mostrarfecha_finProcesoAsientoInicialEjercicio);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoAsientoInicialEjercicio() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio!=null) {
	
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jLabelidProcesoAsientoInicialEjercicio.setEnabled(this.procesoasientoinicialejercicioConstantesFunciones.activaridProcesoAsientoInicialEjercicio);
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jComboBoxid_tipo_documentoProcesoAsientoInicialEjercicio.setEnabled(this.procesoasientoinicialejercicioConstantesFunciones.activarid_tipo_documentoProcesoAsientoInicialEjercicio);
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jDateChooserfecha_inicioProcesoAsientoInicialEjercicio.setEnabled(this.procesoasientoinicialejercicioConstantesFunciones.activarfecha_inicioProcesoAsientoInicialEjercicio);
		this.jInternalFrameDetalleFormProcesoAsientoInicialEjercicio.jDateChooserfecha_finProcesoAsientoInicialEjercicio.setEnabled(this.procesoasientoinicialejercicioConstantesFunciones.activarfecha_finProcesoAsientoInicialEjercicio);
		}
	}
	
		
}