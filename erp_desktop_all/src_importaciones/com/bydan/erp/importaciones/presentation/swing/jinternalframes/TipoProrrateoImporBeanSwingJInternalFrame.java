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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;




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

import com.bydan.erp.importaciones.util.TipoProrrateoImporConstantesFunciones;
import com.bydan.erp.importaciones.util.TipoProrrateoImporParameterReturnGeneral;
//import com.bydan.erp.importaciones.util.TipoProrrateoImporParameterGeneral;
//import com.bydan.erp.importaciones.presentation.report.source.TipoProrrateoImporBean;
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

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.importaciones.resources.reportes.AuxiliarReportes;


import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.importaciones.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.importaciones.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoProrrateoImporBeanSwingJInternalFrame extends TipoProrrateoImporJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoProrrateoImporBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoProrrateoImpor> tipoprorrateoimporValidator = new ClassValidator<TipoProrrateoImpor>(TipoProrrateoImpor.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoProrrateoImpor tipoprorrateoimpor;	
	public TipoProrrateoImpor tipoprorrateoimporAux;
	public TipoProrrateoImpor tipoprorrateoimporAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoProrrateoImpor tipoprorrateoimporTotales;
	public Long idTipoProrrateoImporActual;
	public Long iIdNuevoTipoProrrateoImpor=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
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
	
	public Boolean isPermisoTodoTipoProrrateoImpor;
	public Boolean isPermisoNuevoTipoProrrateoImpor;
	public Boolean isPermisoActualizarTipoProrrateoImpor;
	public Boolean isPermisoActualizarOriginalTipoProrrateoImpor;
	public Boolean isPermisoEliminarTipoProrrateoImpor;
	public Boolean isPermisoGuardarCambiosTipoProrrateoImpor;
	public Boolean isPermisoConsultaTipoProrrateoImpor;
	public Boolean isPermisoBusquedaTipoProrrateoImpor;
	public Boolean isPermisoReporteTipoProrrateoImpor;
	public Boolean isPermisoPaginacionMedioTipoProrrateoImpor;
	public Boolean isPermisoPaginacionAltoTipoProrrateoImpor;
	public Boolean isPermisoPaginacionTodoTipoProrrateoImpor;
	public Boolean isPermisoCopiarTipoProrrateoImpor;
	public Boolean isPermisoVerFormTipoProrrateoImpor;
	public Boolean isPermisoDuplicarTipoProrrateoImpor;
	public Boolean isPermisoOrdenTipoProrrateoImpor;
	
	
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
	
	public TipoProrrateoImporParameterReturnGeneral tipoprorrateoimporReturnGeneral;
	public TipoProrrateoImporParameterReturnGeneral tipoprorrateoimporParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoProrrateoImpor=false;
	public Boolean esParaAccionDesdeFormularioTipoProrrateoImpor=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoProrrateoImporLogic tipoprorrateoimporLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoProrrateoImpor tipoprorrateoimporBean;
	public TipoProrrateoImporConstantesFunciones tipoprorrateoimporConstantesFunciones;
	//public TipoProrrateoImporParameterReturnGeneral tipoprorrateoimporReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoProrrateoImpor> tipoprorrateoimpors;	
	//public List<TipoProrrateoImpor> tipoprorrateoimporsEliminados;
	//public List<TipoProrrateoImpor> tipoprorrateoimporsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoProrrateoImpor=false;
	public Boolean isVisibilidadCeldaDuplicarTipoProrrateoImpor=true;
	public Boolean isVisibilidadCeldaCopiarTipoProrrateoImpor=true;
	public Boolean isVisibilidadCeldaVerFormTipoProrrateoImpor=true;
	public Boolean isVisibilidadCeldaOrdenTipoProrrateoImpor=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor=false;
	public Boolean isVisibilidadCeldaModificarTipoProrrateoImpor=false;
	public Boolean isVisibilidadCeldaActualizarTipoProrrateoImpor=false;
	public Boolean isVisibilidadCeldaEliminarTipoProrrateoImpor=false;
	public Boolean isVisibilidadCeldaCancelarTipoProrrateoImpor=false;
	public Boolean isVisibilidadCeldaGuardarTipoProrrateoImpor=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoProrrateoImpor=false;	
	
	
	
	public Long getiIdNuevoTipoProrrateoImpor() {
		return this.iIdNuevoTipoProrrateoImpor;
	}

	public void setiIdNuevoTipoProrrateoImpor(Long iIdNuevoTipoProrrateoImpor) {
		this.iIdNuevoTipoProrrateoImpor = iIdNuevoTipoProrrateoImpor;
	}
	
	public Long getidTipoProrrateoImporActual() {
		return this.idTipoProrrateoImporActual;
	}

	public void setidTipoProrrateoImporActual(Long idTipoProrrateoImporActual) {
		this.idTipoProrrateoImporActual = idTipoProrrateoImporActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoProrrateoImpor gettipoprorrateoimpor() {
		return this.tipoprorrateoimpor;
	}

	public void settipoprorrateoimpor(TipoProrrateoImpor tipoprorrateoimpor) {
		this.tipoprorrateoimpor = tipoprorrateoimpor;
	}
	
	public TipoProrrateoImpor gettipoprorrateoimporAux() {
		return this.tipoprorrateoimporAux;
	}

	public void settipoprorrateoimporAux(TipoProrrateoImpor tipoprorrateoimporAux) {
		this.tipoprorrateoimporAux = tipoprorrateoimporAux;
	}				
	
	public TipoProrrateoImpor gettipoprorrateoimporAnterior() {
		return this.tipoprorrateoimporAnterior;
	}

	public void settipoprorrateoimporAnterior(TipoProrrateoImpor tipoprorrateoimporAnterior) {
		this.tipoprorrateoimporAnterior = tipoprorrateoimporAnterior;
	}	
	
	public TipoProrrateoImpor gettipoprorrateoimporTotales() {
		return this.tipoprorrateoimporTotales;
	}

	public void settipoprorrateoimporTotales(TipoProrrateoImpor tipoprorrateoimporTotales) {
		this.tipoprorrateoimporTotales = tipoprorrateoimporTotales;
	}	
	
	public TipoProrrateoImpor gettipoprorrateoimporBean() {
		return this.tipoprorrateoimporBean;
	}

	public void settipoprorrateoimporBean(TipoProrrateoImpor tipoprorrateoimporBean) {
		this.tipoprorrateoimporBean = tipoprorrateoimporBean;
	}	
	
	public TipoProrrateoImporParameterReturnGeneral gettipoprorrateoimporReturnGeneral() {
		return this.tipoprorrateoimporReturnGeneral;
	}

	public void settipoprorrateoimporReturnGeneral(TipoProrrateoImporParameterReturnGeneral tipoprorrateoimporReturnGeneral) {
		this.tipoprorrateoimporReturnGeneral = tipoprorrateoimporReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoProrrateoImporLogic getTipoProrrateoImporLogic()	{		
		return tipoprorrateoimporLogic;
	}

	public void setTipoProrrateoImporLogic(TipoProrrateoImporLogic tipoprorrateoimporLogic) {
		this.tipoprorrateoimporLogic = tipoprorrateoimporLogic;
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
	
	public Boolean getIsEsNuevoTipoProrrateoImpor() {
		return isEsNuevoTipoProrrateoImpor;
	}

	public void setIsEsNuevoTipoProrrateoImpor(Boolean isEsNuevoTipoProrrateoImpor) {
		this.isEsNuevoTipoProrrateoImpor = isEsNuevoTipoProrrateoImpor;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoProrrateoImpor() {
		return esParaAccionDesdeFormularioTipoProrrateoImpor;
	}
	
	public void setEsParaAccionDesdeFormularioTipoProrrateoImpor(Boolean esParaAccionDesdeFormularioTipoProrrateoImpor) {
		this.esParaAccionDesdeFormularioTipoProrrateoImpor = esParaAccionDesdeFormularioTipoProrrateoImpor;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoProrrateoImpor() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoProrrateoImporConstantesFunciones.refrescarForeignKeysDescripcionesTipoProrrateoImpor(this.tipoprorrateoimporLogic.getTipoProrrateoImpors());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoProrrateoImporConstantesFunciones.refrescarForeignKeysDescripcionesTipoProrrateoImpor(this.tipoprorrateoimpors);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoprorrateoimporLogic.setTipoProrrateoImpors(this.tipoprorrateoimpors);
			tipoprorrateoimporLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoProrrateoImporParameterReturnGeneral getTipoProrrateoImporParameterGeneral() {
		return this.tipoprorrateoimporParameterGeneral;
	}
	
	public void setTipoProrrateoImporParameterGeneral(TipoProrrateoImporParameterReturnGeneral tipoprorrateoimporParameterGeneral) {
		this.tipoprorrateoimporParameterGeneral = tipoprorrateoimporParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoProrrateoImpor() {
		return isPermisoTodoTipoProrrateoImpor;
	}

	public void setIsPermisoTodoTipoProrrateoImpor(Boolean isPermisoTodoTipoProrrateoImpor) {
		this.isPermisoTodoTipoProrrateoImpor = isPermisoTodoTipoProrrateoImpor;
	}

	public Boolean getIsPermisoNuevoTipoProrrateoImpor() {
		return isPermisoNuevoTipoProrrateoImpor;
	}

	public void setIsPermisoNuevoTipoProrrateoImpor(Boolean isPermisoNuevoTipoProrrateoImpor) {
		this.isPermisoNuevoTipoProrrateoImpor = isPermisoNuevoTipoProrrateoImpor;
	}

	public Boolean getIsPermisoActualizarTipoProrrateoImpor() {
		return isPermisoActualizarTipoProrrateoImpor;
	}

	public void setIsPermisoActualizarTipoProrrateoImpor(Boolean isPermisoActualizarTipoProrrateoImpor) {
		this.isPermisoActualizarTipoProrrateoImpor = isPermisoActualizarTipoProrrateoImpor;
	}

	public Boolean getIsPermisoEliminarTipoProrrateoImpor() {
		return isPermisoEliminarTipoProrrateoImpor;
	}

	public void setIsPermisoEliminarTipoProrrateoImpor(Boolean isPermisoEliminarTipoProrrateoImpor) {
		this.isPermisoEliminarTipoProrrateoImpor = isPermisoEliminarTipoProrrateoImpor;
	}

	public Boolean getIsPermisoGuardarCambiosTipoProrrateoImpor() {
		return isPermisoGuardarCambiosTipoProrrateoImpor;
	}

	public void setIsPermisoGuardarCambiosTipoProrrateoImpor(Boolean isPermisoGuardarCambiosTipoProrrateoImpor) {
		this.isPermisoGuardarCambiosTipoProrrateoImpor = isPermisoGuardarCambiosTipoProrrateoImpor;
	}
	
	public Boolean getIsPermisoConsultaTipoProrrateoImpor() {
		return isPermisoConsultaTipoProrrateoImpor;
	}

	public void setIsPermisoConsultaTipoProrrateoImpor(Boolean isPermisoConsultaTipoProrrateoImpor) {
		this.isPermisoConsultaTipoProrrateoImpor = isPermisoConsultaTipoProrrateoImpor;
	}

	public Boolean getIsPermisoBusquedaTipoProrrateoImpor() {
		return isPermisoBusquedaTipoProrrateoImpor;
	}

	public void setIsPermisoBusquedaTipoProrrateoImpor(Boolean isPermisoBusquedaTipoProrrateoImpor) {
		this.isPermisoBusquedaTipoProrrateoImpor = isPermisoBusquedaTipoProrrateoImpor;
	}

	public Boolean getIsPermisoReporteTipoProrrateoImpor() {
		return isPermisoReporteTipoProrrateoImpor;
	}

	public void setIsPermisoReporteTipoProrrateoImpor(Boolean isPermisoReporteTipoProrrateoImpor) {
		this.isPermisoReporteTipoProrrateoImpor = isPermisoReporteTipoProrrateoImpor;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoProrrateoImpor() {
		return isPermisoPaginacionMedioTipoProrrateoImpor;
	}

	public void setIsPermisoPaginacionMedioTipoProrrateoImpor(Boolean isPermisoPaginacionMedioTipoProrrateoImpor) {
		this.isPermisoPaginacionMedioTipoProrrateoImpor = isPermisoPaginacionMedioTipoProrrateoImpor;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoProrrateoImpor() {
		return isPermisoPaginacionTodoTipoProrrateoImpor;
	}

	public void setIsPermisoPaginacionTodoTipoProrrateoImpor(Boolean isPermisoPaginacionTodoTipoProrrateoImpor) {
		this.isPermisoPaginacionTodoTipoProrrateoImpor = isPermisoPaginacionTodoTipoProrrateoImpor;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoProrrateoImpor() {
		return isPermisoPaginacionAltoTipoProrrateoImpor;
	}

	public void setIsPermisoPaginacionAltoTipoProrrateoImpor(Boolean isPermisoPaginacionAltoTipoProrrateoImpor) {
		this.isPermisoPaginacionAltoTipoProrrateoImpor = isPermisoPaginacionAltoTipoProrrateoImpor;
	}
	
	public Boolean getIsPermisoCopiarTipoProrrateoImpor() {
		return isPermisoCopiarTipoProrrateoImpor;
	}

	public void setIsPermisoCopiarTipoProrrateoImpor(Boolean isPermisoCopiarTipoProrrateoImpor) {
		this.isPermisoCopiarTipoProrrateoImpor = isPermisoCopiarTipoProrrateoImpor;
	}
	
	public Boolean getIsPermisoVerFormTipoProrrateoImpor() {
		return isPermisoVerFormTipoProrrateoImpor;
	}

	public void setIsPermisoVerFormTipoProrrateoImpor(Boolean isPermisoVerFormTipoProrrateoImpor) {
		this.isPermisoVerFormTipoProrrateoImpor = isPermisoVerFormTipoProrrateoImpor;
	}
	
	public Boolean getIsPermisoDuplicarTipoProrrateoImpor() {
		return isPermisoDuplicarTipoProrrateoImpor;
	}

	public void setIsPermisoDuplicarTipoProrrateoImpor(Boolean isPermisoDuplicarTipoProrrateoImpor) {
		this.isPermisoDuplicarTipoProrrateoImpor = isPermisoDuplicarTipoProrrateoImpor;
	}
	
	public Boolean getIsPermisoOrdenTipoProrrateoImpor() {
		return isPermisoOrdenTipoProrrateoImpor;
	}

	public void setIsPermisoOrdenTipoProrrateoImpor(Boolean isPermisoOrdenTipoProrrateoImpor) {
		this.isPermisoOrdenTipoProrrateoImpor = isPermisoOrdenTipoProrrateoImpor;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoProrrateoImpor() {
		return isVisibilidadCeldaNuevoTipoProrrateoImpor;
	}

	public void setIsVisibilidadCeldaNuevoTipoProrrateoImpor(Boolean isVisibilidadCeldaNuevoTipoProrrateoImpor) {
		this.isVisibilidadCeldaNuevoTipoProrrateoImpor = isVisibilidadCeldaNuevoTipoProrrateoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoProrrateoImpor() {
		return isVisibilidadCeldaDuplicarTipoProrrateoImpor;
	}

	public void setIsVisibilidadCeldaDuplicarTipoProrrateoImpor(Boolean isVisibilidadCeldaDuplicarTipoProrrateoImpor) {
		this.isVisibilidadCeldaDuplicarTipoProrrateoImpor = isVisibilidadCeldaDuplicarTipoProrrateoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoProrrateoImpor() {
		return isVisibilidadCeldaCopiarTipoProrrateoImpor;
	}

	public void setIsVisibilidadCeldaCopiarTipoProrrateoImpor(Boolean isVisibilidadCeldaCopiarTipoProrrateoImpor) {
		this.isVisibilidadCeldaCopiarTipoProrrateoImpor = isVisibilidadCeldaCopiarTipoProrrateoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoProrrateoImpor() {
		return isVisibilidadCeldaVerFormTipoProrrateoImpor;
	}

	public void setIsVisibilidadCeldaVerFormTipoProrrateoImpor(Boolean isVisibilidadCeldaVerFormTipoProrrateoImpor) {
		this.isVisibilidadCeldaVerFormTipoProrrateoImpor = isVisibilidadCeldaVerFormTipoProrrateoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoProrrateoImpor() {
		return isVisibilidadCeldaOrdenTipoProrrateoImpor;
	}

	public void setIsVisibilidadCeldaOrdenTipoProrrateoImpor(Boolean isVisibilidadCeldaOrdenTipoProrrateoImpor) {
		this.isVisibilidadCeldaOrdenTipoProrrateoImpor = isVisibilidadCeldaOrdenTipoProrrateoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor() {
		return isVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor(Boolean isVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor) {
		this.isVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor = isVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoProrrateoImpor() {
		return isVisibilidadCeldaModificarTipoProrrateoImpor;
	}

	public void setIsVisibilidadCeldaModificarTipoProrrateoImpor(Boolean isVisibilidadCeldaModificarTipoProrrateoImpor) {
		this.isVisibilidadCeldaModificarTipoProrrateoImpor = isVisibilidadCeldaModificarTipoProrrateoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoProrrateoImpor() {
		return isVisibilidadCeldaActualizarTipoProrrateoImpor;
	}

	public void setIsVisibilidadCeldaActualizarTipoProrrateoImpor(Boolean isVisibilidadCeldaActualizarTipoProrrateoImpor) {
		this.isVisibilidadCeldaActualizarTipoProrrateoImpor = isVisibilidadCeldaActualizarTipoProrrateoImpor;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoProrrateoImpor() {
		return isVisibilidadCeldaEliminarTipoProrrateoImpor;
	}

	public void setIsVisibilidadCeldaEliminarTipoProrrateoImpor(Boolean isVisibilidadCeldaEliminarTipoProrrateoImpor) {
		this.isVisibilidadCeldaEliminarTipoProrrateoImpor = isVisibilidadCeldaEliminarTipoProrrateoImpor;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoProrrateoImpor() {
		return isVisibilidadCeldaCancelarTipoProrrateoImpor;
	}

	public void setIsVisibilidadCeldaCancelarTipoProrrateoImpor(Boolean isVisibilidadCeldaCancelarTipoProrrateoImpor) {
		this.isVisibilidadCeldaCancelarTipoProrrateoImpor = isVisibilidadCeldaCancelarTipoProrrateoImpor;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoProrrateoImpor() {
		return isVisibilidadCeldaGuardarTipoProrrateoImpor;
	}

	public void setIsVisibilidadCeldaGuardarTipoProrrateoImpor(Boolean isVisibilidadCeldaGuardarTipoProrrateoImpor) {
		this.isVisibilidadCeldaGuardarTipoProrrateoImpor = isVisibilidadCeldaGuardarTipoProrrateoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoProrrateoImpor() {
		return isVisibilidadCeldaGuardarCambiosTipoProrrateoImpor;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoProrrateoImpor(Boolean isVisibilidadCeldaGuardarCambiosTipoProrrateoImpor) {
		this.isVisibilidadCeldaGuardarCambiosTipoProrrateoImpor = isVisibilidadCeldaGuardarCambiosTipoProrrateoImpor;
	}
		
	public TipoProrrateoImporSessionBean gettipoprorrateoimporSessionBean() {
		return this.tipoprorrateoimporSessionBean;
	}
	
	public void settipoprorrateoimporSessionBean(TipoProrrateoImporSessionBean tipoprorrateoimporSessionBean) {
		this.tipoprorrateoimporSessionBean=tipoprorrateoimporSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoProrrateoImpor(TipoProrrateoImpor tipoprorrateoimpor)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoProrrateoImpor tipoprorrateoimpor,TipoProrrateoImpor tipoprorrateoimporAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoProrrateoImpor(tipoprorrateoimpor);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoprorrateoimporAux.setId(tipoprorrateoimpor.getId());
		tipoprorrateoimporAux.setVersionRow(tipoprorrateoimpor.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoProrrateoImpor();
		
			int intSelectedRow = this.jTableDatosTipoProrrateoImpor.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoProrrateoImpor(this.tipoprorrateoimpor,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProrrateoImpor(this.tipoprorrateoimpor);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoprorrateoimporValidator.getInvalidValues(this.tipoprorrateoimpor);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoprorrateoimporLogic.setDatosCliente(datosCliente);
			tipoprorrateoimporLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoprorrateoimporAux=new  TipoProrrateoImpor();
				
				tipoprorrateoimporAux.setIsNew(true);
				tipoprorrateoimporAux.setIsChanged(true);
				
				tipoprorrateoimporAux.setTipoProrrateoImporOriginal(this.tipoprorrateoimpor);
				
				tipoprorrateoimporAux.setId(this.tipoprorrateoimpor.getId());	
				tipoprorrateoimporAux.setVersionRow(this.tipoprorrateoimpor.getVersionRow());	
				tipoprorrateoimporAux.setcodigo(this.tipoprorrateoimpor.getcodigo());	
				tipoprorrateoimporAux.setnombre(this.tipoprorrateoimpor.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoprorrateoimporSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoprorrateoimporAux,tipoprorrateoimporLogic.getTipoProrrateoImpors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprorrateoimporAux,tipoprorrateoimpors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoprorrateoimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprorrateoimporLogic.saveTipoProrrateoImpors();//WithConnection
						//tipoprorrateoimporLogic.getSetVersionRowTipoProrrateoImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoprorrateoimpor,tipoprorrateoimporAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoprorrateoimporAux=new  TipoProrrateoImpor();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado() && this.tipoprorrateoimpor.getId()>=0)) {
						
					tipoprorrateoimporAux.setIsNew(false);
				}
				
				tipoprorrateoimporAux.setIsDeleted(false);
			
				tipoprorrateoimporAux.setId(this.tipoprorrateoimpor.getId());	
				tipoprorrateoimporAux.setVersionRow(this.tipoprorrateoimpor.getVersionRow());	
				tipoprorrateoimporAux.setcodigo(this.tipoprorrateoimpor.getcodigo());	
				tipoprorrateoimporAux.setnombre(this.tipoprorrateoimpor.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoprorrateoimporAux,tipoprorrateoimporLogic.getTipoProrrateoImpors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprorrateoimporAux,tipoprorrateoimpors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoprorrateoimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprorrateoimporLogic.saveTipoProrrateoImpors();//WithConnection
						//tipoprorrateoimporLogic.getSetVersionRowTipoProrrateoImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoprorrateoimpor,tipoprorrateoimporAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoprorrateoimporAux=new  TipoProrrateoImpor();
				
				tipoprorrateoimporAux.setIsNew(false);
				tipoprorrateoimporAux.setIsChanged(false);
				
				tipoprorrateoimporAux.setIsDeleted(true);
				
				tipoprorrateoimporAux.setId(this.tipoprorrateoimpor.getId());	
				tipoprorrateoimporAux.setVersionRow(this.tipoprorrateoimpor.getVersionRow());	
				tipoprorrateoimporAux.setcodigo(this.tipoprorrateoimpor.getcodigo());	
				tipoprorrateoimporAux.setnombre(this.tipoprorrateoimpor.getnombre());	
				
				if(this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoprorrateoimporAux.getId()>=0) {	
						this.tipoprorrateoimporsEliminados.add(tipoprorrateoimporAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoprorrateoimporAux,tipoprorrateoimporLogic.getTipoProrrateoImpors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprorrateoimporAux,tipoprorrateoimpors);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoprorrateoimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprorrateoimporLogic.saveTipoProrrateoImpors();//WithConnection
						//tipoprorrateoimporLogic.getSetVersionRowTipoProrrateoImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprorrateoimporLogic.getTipoProrrateoImpors().addAll(this.tipoprorrateoimporsEliminados);
					
					tipoprorrateoimporLogic.saveTipoProrrateoImpors();//WithConnection
					//tipoprorrateoimporLogic.getSetVersionRowTipoProrrateoImpors();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoprorrateoimporsEliminados= new ArrayList<TipoProrrateoImpor>();		
			}
			
			if(this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Prorrateo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Prorrateo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoprorrateoimpor=tipoprorrateoimporAux;
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
      		//this.finishProcessTipoProrrateoImpor();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoProrrateoImpor tipoprorrateoimporLocal) throws Exception {
		
		if(this.tipoprorrateoimporSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoProrrateoImpor tipoprorrateoimporLocal) throws Exception {	
		if(this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoProrrateoImporActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoProrrateoImpor.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoprorrateoimporValidator.getInvalidValues(this.tipoprorrateoimpor);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoProrrateoImpor tipoprorrateoimpor,List<TipoProrrateoImpor> tipoprorrateoimpors) throws Exception {
		try	{		
			TipoProrrateoImporConstantesFunciones.actualizarLista(tipoprorrateoimpor,tipoprorrateoimpors,this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoProrrateoImpor tipoprorrateoimpor,List<TipoProrrateoImpor> tipoprorrateoimpors) throws Exception {
		try	{			
			TipoProrrateoImporConstantesFunciones.actualizarSelectedLista(tipoprorrateoimpor,tipoprorrateoimpors);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoProrrateoImpor> tipoprorrateoimporsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoprorrateoimporsLocal=this.tipoprorrateoimporLogic.getTipoProrrateoImpors();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoprorrateoimporsLocal=this.tipoprorrateoimpors;
			}
			//ARCHITECTURE
		
			for(TipoProrrateoImpor tipoprorrateoimporLocal:tipoprorrateoimporsLocal) {
				if(this.permiteMantenimiento(tipoprorrateoimporLocal) && tipoprorrateoimporLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoProrrateoImporConstantesFunciones.getTipoProrrateoImporLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoProrrateoImporConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProrrateoImpor.jLabelcodigoTipoProrrateoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoProrrateoImporConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProrrateoImpor.jLabelnombreTipoProrrateoImpor,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoProrrateoImpor.jLabelcodigoTipoProrrateoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoProrrateoImpor.jLabelnombreTipoProrrateoImpor,"");
		
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
		this.iIdNuevoTipoProrrateoImpor--;	
		
		
		this.tipoprorrateoimporAux=new TipoProrrateoImpor();
		
		this.tipoprorrateoimporAux.setId(this.iIdNuevoTipoProrrateoImpor);
		this.tipoprorrateoimporAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoprorrateoimporLogic.getTipoProrrateoImpors().add(this.tipoprorrateoimporAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoprorrateoimpors.add(this.tipoprorrateoimporAux);
		}
		//ARCHITECTURE
		
		this.tipoprorrateoimpor=this.tipoprorrateoimporAux;
		
		if(TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoProrrateoImpor(this.tipoprorrateoimpor);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoProrrateoImpor(this.tipoprorrateoimpor);
		}
				
		//this.setDefaultControlesTipoProrrateoImpor();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoProrrateoImpor();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoProrrateoImpor();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProrrateoImpor();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoProrrateoImpor(this.tipoprorrateoimporBean,this.tipoprorrateoimpor,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoProrrateoImpor(this.tipoprorrateoimpor);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoprorrateoimporSessionBean.getConGuardarRelaciones()) {
			classes=TipoProrrateoImporConstantesFunciones.getClassesRelationshipsOfTipoProrrateoImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoprorrateoimporReturnGeneral=tipoprorrateoimporLogic.procesarEventosTipoProrrateoImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprorrateoimporLogic.getTipoProrrateoImpors(),this.tipoprorrateoimpor,this.tipoprorrateoimporParameterGeneral,this.isEsNuevoTipoProrrateoImpor,classes);//this.tipoprorrateoimporLogic.getTipoProrrateoImpor()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoProrrateoImpor(this.tipoprorrateoimporReturnGeneral,this.tipoprorrateoimporBean,false);
		
		if(this.tipoprorrateoimporReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoProrrateoImpor(this.tipoprorrateoimporReturnGeneral.getTipoProrrateoImpor());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoProrrateoImpor(this.tipoprorrateoimporReturnGeneral.getTipoProrrateoImpor());
		}
		
		if(this.tipoprorrateoimporReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoProrrateoImpor(this.tipoprorrateoimporReturnGeneral.getTipoProrrateoImpor(),classes);//this.tipoprorrateoimporBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoProrrateoImpor(this.tipoprorrateoimpor,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoProrrateoImpor();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoProrrateoImpor();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoProrrateoImpor(false);
						
			if(tipoprorrateoimporSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProrrateoImpor();
			}
			
			this.actualizarVisualTableDatosTipoProrrateoImpor();
			
			this.jTableDatosTipoProrrateoImpor.setRowSelectionInterval(this.getIndiceNuevoTipoProrrateoImpor(), this.getIndiceNuevoTipoProrrateoImpor());
			
			this.seleccionarFilaTablaTipoProrrateoImporActual();
						
			this.actualizarEstadoCeldasBotonesTipoProrrateoImpor("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoProrrateoImpor(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextFieldcodigoTipoProrrateoImpor.setEnabled(isHabilitar && this.tipoprorrateoimporConstantesFunciones.activarcodigoTipoProrrateoImpor);
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextAreanombreTipoProrrateoImpor.setEnabled(isHabilitar && this.tipoprorrateoimporConstantesFunciones.activarnombreTipoProrrateoImpor);	
		
	};
	
	public void setDefaultControlesTipoProrrateoImpor() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoProrrateoImpor(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoprorrateoimporSessionBean.setConGuardarRelaciones(true);			
			this.tipoprorrateoimporSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jTabbedPaneRelacionesTipoProrrateoImpor.setVisible(true);
			
					
		} else {
			//this.tipoprorrateoimporSessionBean.setConGuardarRelaciones(false);			
			this.tipoprorrateoimporSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jTabbedPaneRelacionesTipoProrrateoImpor.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoProrrateoImpor() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProrrateoImpor tipoprorrateoimporAux:this.tipoprorrateoimporLogic.getTipoProrrateoImpors()) {
				if(tipoprorrateoimporAux.getId().equals(this.iIdNuevoTipoProrrateoImpor)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProrrateoImpor tipoprorrateoimporAux:this.tipoprorrateoimpors) {
				if(tipoprorrateoimporAux.getId().equals(this.iIdNuevoTipoProrrateoImpor)) {
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
	
	public int getIndiceActualTipoProrrateoImpor(TipoProrrateoImpor tipoprorrateoimpor,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProrrateoImpor tipoprorrateoimporAux:this.tipoprorrateoimporLogic.getTipoProrrateoImpors()) {
				if(tipoprorrateoimporAux.getId().equals(tipoprorrateoimpor.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProrrateoImpor tipoprorrateoimporAux:this.tipoprorrateoimpors) {
				if(tipoprorrateoimporAux.getId().equals(tipoprorrateoimpor.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoProrrateoImpor(TipoProrrateoImpor tipoprorrateoimporOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProrrateoImpor tipoprorrateoimporAux:this.tipoprorrateoimporLogic.getTipoProrrateoImpors()) {
				if(tipoprorrateoimporAux.getTipoProrrateoImporOriginal().getId().equals(tipoprorrateoimporOriginal.getId())) {
					existe=true;
					tipoprorrateoimporOriginal.setId(tipoprorrateoimporAux.getId());
					tipoprorrateoimporOriginal.setVersionRow(tipoprorrateoimporAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProrrateoImpor tipoprorrateoimporAux:this.tipoprorrateoimpors) {
				if(tipoprorrateoimporAux.getTipoProrrateoImporOriginal().getId().equals(tipoprorrateoimporOriginal.getId())) {
					existe=true;
					tipoprorrateoimporOriginal.setId(tipoprorrateoimporAux.getId());
					tipoprorrateoimporOriginal.setVersionRow(tipoprorrateoimporAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoProrrateoImpor(Boolean esParaCancelar) throws Exception {
		tipoprorrateoimporsAux=new ArrayList<TipoProrrateoImpor>();
		tipoprorrateoimporAux=new TipoProrrateoImpor();
		
		if(!this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoProrrateoImpor tipoprorrateoimporAux:this.tipoprorrateoimporLogic.getTipoProrrateoImpors()) {
					if(tipoprorrateoimporAux.getId()<0) {
						tipoprorrateoimporsAux.add(tipoprorrateoimporAux);
					}		
				}
				this.iIdNuevoTipoProrrateoImpor=0L;
				this.tipoprorrateoimporLogic.getTipoProrrateoImpors().removeAll(tipoprorrateoimporsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProrrateoImpor tipoprorrateoimporAux:this.tipoprorrateoimpors) {
					if(tipoprorrateoimporAux.getId()<0) {
						tipoprorrateoimporsAux.add(tipoprorrateoimporAux);
					}		
				}
				this.iIdNuevoTipoProrrateoImpor=0L;
				this.tipoprorrateoimpors.removeAll(tipoprorrateoimporsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoProrrateoImpor 
					&& this.tipoprorrateoimporLogic.getTipoProrrateoImpors().size()>0
					) {
					tipoprorrateoimporAux=this.tipoprorrateoimporLogic.getTipoProrrateoImpors().get(this.tipoprorrateoimporLogic.getTipoProrrateoImpors().size() - 1);
				
					if(tipoprorrateoimporAux.getId()<0) {
						this.tipoprorrateoimporLogic.getTipoProrrateoImpors().remove(tipoprorrateoimporAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoProrrateoImpor && this.tipoprorrateoimpors.size()>0) {
					tipoprorrateoimporAux=this.tipoprorrateoimpors.get(this.tipoprorrateoimpors.size() - 1);
				
					if(tipoprorrateoimporAux.getId()<0) {
						this.tipoprorrateoimpors.remove(tipoprorrateoimporAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoProrrateoImpor(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoprorrateoimpor.getId()<0) {
				this.tipoprorrateoimporLogic.getTipoProrrateoImpors().remove(this.tipoprorrateoimpor);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoprorrateoimpor.getId()<0) {
				this.tipoprorrateoimpors.remove(this.tipoprorrateoimpor);
			}
		}			
	}
	
	public void setEstadosInicialesTipoProrrateoImpor(List<TipoProrrateoImpor> tipoprorrateoimporsAux) throws Exception {
		TipoProrrateoImporConstantesFunciones.setEstadosInicialesTipoProrrateoImpor(tipoprorrateoimporsAux);
	}
	
	public void setEstadosInicialesTipoProrrateoImpor(TipoProrrateoImpor tipoprorrateoimporAux) throws Exception {
		TipoProrrateoImporConstantesFunciones.setEstadosInicialesTipoProrrateoImpor(tipoprorrateoimporAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoProrrateoImporActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoProrrateoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoProrrateoImporActual()) {
				if(!this.isEsNuevoTipoProrrateoImpor) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoProrrateoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoProrrateoImpor=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoProrrateoImporActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Prorrateo ?", "MANTENIMIENTO DE Tipo Prorrateo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoProrrateoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoProrrateoImpor tipoprorrateoimpor) throws Exception {
		TipoProrrateoImporConstantesFunciones.seleccionarAsignar(this.tipoprorrateoimpor,tipoprorrateoimpor);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoProrrateoImpor=this.isPermisoActualizarOriginalTipoProrrateoImpor;
			
			
			this.seleccionarAsignar(tipoprorrateoimpor);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoProrrateoImporConstantesFunciones.quitarEspaciosTipoProrrateoImpor(this.tipoprorrateoimpor,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoProrrateoImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoprorrateoimporSessionBean.setsFuncionBusquedaRapida(this.tipoprorrateoimporSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoProrrateoImpor) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoProrrateoImpor(esParaCancelar);				
				this.cancelarNuevoTipoProrrateoImpor(esParaCancelar);								
			}
			
			this.tipoprorrateoimpor=new TipoProrrateoImpor();
			
			this.inicializarTipoProrrateoImpor();
			
			this.actualizarEstadoCeldasBotonesTipoProrrateoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoProrrateoImpor() throws Exception {
		try {
			TipoProrrateoImporConstantesFunciones.inicializarTipoProrrateoImpor(this.tipoprorrateoimpor);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoprorrateoimporLogic.getTipoProrrateoImpors().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoProrrateoImpors(String sAccionBusqueda,List<TipoProrrateoImpor> tipoprorrateoimporsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoProrrateoImpor"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoProrrateoImporMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoProrrateoImporMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoProrrateoImpor"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Prorrateos");		
		parameters.put("busquedapor", TipoProrrateoImporConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoProrrateoImpor=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoProrrateoImporConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoProrrateoImporConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoProrrateoImpor=new JRBeanArrayDataSource(TipoProrrateoImporJInternalFrame.TraerTipoProrrateoImporBeans(tipoprorrateoimporsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoProrrateoImpor);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoProrrateoImporConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoProrrateoImporConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoProrrateoImporBean.TraerTipoProrrateoImporBeans(tipoprorrateoimporsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoProrrateoImpors(sAccionBusqueda,sTipoArchivoReporte,tipoprorrateoimporsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoProrrateoImpors(sAccionBusqueda,sTipoArchivoReporte,tipoprorrateoimporsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoProrrateoImporActionPerformed(null);
					//this.generarExcelReporteTipoProrrateoImpors(sAccionBusqueda,sTipoArchivoReporte,tipoprorrateoimporsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoProrrateoImpors(sAccionBusqueda,sTipoArchivoReporte,tipoprorrateoimporsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoProrrateoImpors(sAccionBusqueda,sTipoArchivoReporte,tipoprorrateoimporsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoProrrateoImpors(sAccionBusqueda,sTipoArchivoReporte,tipoprorrateoimporsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoProrrateoImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProrrateoImpor> tipoprorrateoimporsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprorrateoimpor";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProrrateoImpors");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoProrrateoImpor("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoProrrateoImpor tipoprorrateoimpor : tipoprorrateoimporsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoProrrateoImporConstantesFunciones.generarExcelReporteDataTipoProrrateoImpor("NORMAL",row,workbook,tipoprorrateoimpor,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prorrateo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoProrrateoImpor(String sTipo,Row row,Workbook workbook) {
		
		TipoProrrateoImporConstantesFunciones.generarExcelReporteHeaderTipoProrrateoImpor(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoProrrateoImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProrrateoImpor> tipoprorrateoimporsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprorrateoimpor_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProrrateoImpors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoProrrateoImpor tipoprorrateoimpor : tipoprorrateoimporsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoProrrateoImporConstantesFunciones.getTipoProrrateoImporDescripcion(tipoprorrateoimpor));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoProrrateoImporConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoProrrateoImporConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprorrateoimpor.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoProrrateoImporConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoProrrateoImporConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprorrateoimpor.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prorrateo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoProrrateoImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProrrateoImpor> tipoprorrateoimporsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoProrrateoImpor> tipoprorrateoimporsRespaldo=null;
		
		classes=TipoProrrateoImporConstantesFunciones.getClassesRelationshipsOfTipoProrrateoImpor(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoprorrateoimporLogic.setDatosCliente(this.datosCliente);
		this.tipoprorrateoimporLogic.setDatosDeep(this.datosDeep);
		this.tipoprorrateoimporLogic.setIsConDeep(true);
		
		tipoprorrateoimporsRespaldo=this.tipoprorrateoimporLogic.getTipoProrrateoImpors();
		
		this.tipoprorrateoimporLogic.setTipoProrrateoImpors(tipoprorrateoimporsParaReportes);	
		this.tipoprorrateoimporLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoprorrateoimporsParaReportes=this.tipoprorrateoimporLogic.getTipoProrrateoImpors();
		this.tipoprorrateoimporLogic.setTipoProrrateoImpors(tipoprorrateoimporsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprorrateoimpor_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProrrateoImpors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoProrrateoImpor("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoProrrateoImpor tipoprorrateoimpor : tipoprorrateoimporsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoProrrateoImpor("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoProrrateoImporConstantesFunciones.generarExcelReporteDataTipoProrrateoImpor("NORMAL",row,workbook,tipoprorrateoimpor,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoProrrateoImporConstantesFunciones.getTipoProrrateoImporDescripcion(tipoprorrateoimpor));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prorrateo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoProrrateoImpor() throws Exception {		
		this.startProcessTipoProrrateoImpor(true);
	}
	
	public void startProcessTipoProrrateoImpor(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoProrrateoImpor, this.jScrollPanelDatosTipoProrrateoImpor,this.jPanelPaginacionTipoProrrateoImpor, this.jScrollPanelDatosEdicionTipoProrrateoImpor, this.jPanelAccionesTipoProrrateoImpor,this.jPanelAccionesFormularioTipoProrrateoImpor,this.jmenuBarTipoProrrateoImpor,this.jmenuBarDetalleTipoProrrateoImpor,this.jTtoolBarTipoProrrateoImpor,this.jTtoolBarDetalleTipoProrrateoImpor);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoProrrateoImpor=null; 
		
		final JPanel jPanelParametrosReportesTipoProrrateoImpor=this.jPanelParametrosReportesTipoProrrateoImpor;
		//final JScrollPane jScrollPanelDatosTipoProrrateoImpor=this.jScrollPanelDatosTipoProrrateoImpor;
		final JTable jTableDatosTipoProrrateoImpor=this.jTableDatosTipoProrrateoImpor;		
		final JPanel jPanelPaginacionTipoProrrateoImpor=this.jPanelPaginacionTipoProrrateoImpor;
		//final JScrollPane jScrollPanelDatosEdicionTipoProrrateoImpor=this.jScrollPanelDatosEdicionTipoProrrateoImpor;
		final JPanel jPanelAccionesTipoProrrateoImpor=this.jPanelAccionesTipoProrrateoImpor;
		
		JPanel jPanelCamposAuxiliarTipoProrrateoImpor=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoProrrateoImpor=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) {
			jPanelCamposAuxiliarTipoProrrateoImpor=this.jInternalFrameDetalleFormTipoProrrateoImpor.jPanelCamposTipoProrrateoImpor;
			jPanelAccionesFormularioAuxiliarTipoProrrateoImpor=this.jInternalFrameDetalleFormTipoProrrateoImpor.jPanelAccionesFormularioTipoProrrateoImpor;
		}
		
		final JPanel jPanelCamposTipoProrrateoImpor=jPanelCamposAuxiliarTipoProrrateoImpor;
		final JPanel jPanelAccionesFormularioTipoProrrateoImpor=jPanelAccionesFormularioAuxiliarTipoProrrateoImpor;
		
		
		final JMenuBar jmenuBarTipoProrrateoImpor=this.jmenuBarTipoProrrateoImpor;
		final JToolBar jTtoolBarTipoProrrateoImpor=this.jTtoolBarTipoProrrateoImpor;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoProrrateoImpor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoProrrateoImpor=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) {
			jmenuBarDetalleAuxiliarTipoProrrateoImpor=this.jInternalFrameDetalleFormTipoProrrateoImpor.jmenuBarDetalleTipoProrrateoImpor;
			jTtoolBarDetalleAuxiliarTipoProrrateoImpor=this.jInternalFrameDetalleFormTipoProrrateoImpor.jTtoolBarDetalleTipoProrrateoImpor;
		}
		
		final JMenuBar jmenuBarDetalleTipoProrrateoImpor=jmenuBarDetalleAuxiliarTipoProrrateoImpor;
		final JToolBar jTtoolBarDetalleTipoProrrateoImpor=jTtoolBarDetalleAuxiliarTipoProrrateoImpor;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoProrrateoImpor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoProrrateoImpor;
			processRunnable.jTableDatos=jTableDatosTipoProrrateoImpor;
			processRunnable.jPanelCampos=jPanelCamposTipoProrrateoImpor;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoProrrateoImpor;
			processRunnable.jPanelAcciones=jPanelAccionesTipoProrrateoImpor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoProrrateoImpor;
			
			
			processRunnable.jmenuBar=jmenuBarTipoProrrateoImpor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoProrrateoImpor;
			processRunnable.jTtoolBar=jTtoolBarTipoProrrateoImpor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoProrrateoImpor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoProrrateoImpor ,jPanelParametrosReportesTipoProrrateoImpor,jTableDatosTipoProrrateoImpor, /*jScrollPanelDatosTipoProrrateoImpor,*/jPanelCamposTipoProrrateoImpor,jPanelPaginacionTipoProrrateoImpor, /*jScrollPanelDatosEdicionTipoProrrateoImpor,*/ jPanelAccionesTipoProrrateoImpor,jPanelAccionesFormularioTipoProrrateoImpor,jmenuBarTipoProrrateoImpor,jmenuBarDetalleTipoProrrateoImpor,jTtoolBarTipoProrrateoImpor,jTtoolBarDetalleTipoProrrateoImpor);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoProrrateoImpor, jScrollPanelDatosTipoProrrateoImpor,jPanelPaginacionTipoProrrateoImpor, jScrollPanelDatosEdicionTipoProrrateoImpor, jPanelAccionesTipoProrrateoImpor,jPanelAccionesFormularioTipoProrrateoImpor,jmenuBarTipoProrrateoImpor,jmenuBarDetalleTipoProrrateoImpor,jTtoolBarTipoProrrateoImpor,jTtoolBarDetalleTipoProrrateoImpor);
						
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
	
	public void finishProcessTipoProrrateoImpor() {// throws Exception 
		this.finishProcessTipoProrrateoImpor(true);
	}
	
	public void finishProcessTipoProrrateoImpor(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoProrrateoImpor, this.jScrollPanelDatosTipoProrrateoImpor,this.jPanelPaginacionTipoProrrateoImpor, this.jScrollPanelDatosEdicionTipoProrrateoImpor, this.jPanelAccionesTipoProrrateoImpor,this.jPanelAccionesFormularioTipoProrrateoImpor,this.jmenuBarTipoProrrateoImpor,this.jmenuBarDetalleTipoProrrateoImpor,this.jTtoolBarTipoProrrateoImpor,this.jTtoolBarDetalleTipoProrrateoImpor);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoProrrateoImpor=null; 
		
		final JPanel jPanelParametrosReportesTipoProrrateoImpor=this.jPanelParametrosReportesTipoProrrateoImpor;
		//final JScrollPane jScrollPanelDatosTipoProrrateoImpor=this.jScrollPanelDatosTipoProrrateoImpor;
		final JTable jTableDatosTipoProrrateoImpor=this.jTableDatosTipoProrrateoImpor;		
		final JPanel jPanelPaginacionTipoProrrateoImpor=this.jPanelPaginacionTipoProrrateoImpor;
		//final JScrollPane jScrollPanelDatosEdicionTipoProrrateoImpor=this.jScrollPanelDatosEdicionTipoProrrateoImpor;
		final JPanel jPanelAccionesTipoProrrateoImpor=this.jPanelAccionesTipoProrrateoImpor;
		
		JPanel jPanelCamposAuxiliarTipoProrrateoImpor=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoProrrateoImpor=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) {
			jPanelCamposAuxiliarTipoProrrateoImpor=this.jInternalFrameDetalleFormTipoProrrateoImpor.jPanelCamposTipoProrrateoImpor;
			jPanelAccionesFormularioAuxiliarTipoProrrateoImpor=this.jInternalFrameDetalleFormTipoProrrateoImpor.jPanelAccionesFormularioTipoProrrateoImpor;
		}
		
		final JPanel jPanelCamposTipoProrrateoImpor=jPanelCamposAuxiliarTipoProrrateoImpor;
		final JPanel jPanelAccionesFormularioTipoProrrateoImpor=jPanelAccionesFormularioAuxiliarTipoProrrateoImpor;
		
		
		final JMenuBar jmenuBarTipoProrrateoImpor=this.jmenuBarTipoProrrateoImpor;		
		final JToolBar jTtoolBarTipoProrrateoImpor=this.jTtoolBarTipoProrrateoImpor;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoProrrateoImpor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoProrrateoImpor=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) {
			jmenuBarDetalleAuxiliarTipoProrrateoImpor=this.jInternalFrameDetalleFormTipoProrrateoImpor.jmenuBarDetalleTipoProrrateoImpor;
			jTtoolBarDetalleAuxiliarTipoProrrateoImpor=this.jInternalFrameDetalleFormTipoProrrateoImpor.jTtoolBarDetalleTipoProrrateoImpor;		
		}
		
		final JMenuBar jmenuBarDetalleTipoProrrateoImpor=jmenuBarDetalleAuxiliarTipoProrrateoImpor;
		final JToolBar jTtoolBarDetalleTipoProrrateoImpor=jTtoolBarDetalleAuxiliarTipoProrrateoImpor;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoProrrateoImpor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoProrrateoImpor;
			processRunnable.jTableDatos=jTableDatosTipoProrrateoImpor;
			processRunnable.jPanelCampos=jPanelCamposTipoProrrateoImpor;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoProrrateoImpor;
			processRunnable.jPanelAcciones=jPanelAccionesTipoProrrateoImpor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoProrrateoImpor;
			
			
			processRunnable.jmenuBar=jmenuBarTipoProrrateoImpor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoProrrateoImpor;
			processRunnable.jTtoolBar=jTtoolBarTipoProrrateoImpor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoProrrateoImpor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoProrrateoImpor ,jPanelParametrosReportesTipoProrrateoImpor, jTableDatosTipoProrrateoImpor,/*jScrollPanelDatosTipoProrrateoImpor,*/jPanelCamposTipoProrrateoImpor,jPanelPaginacionTipoProrrateoImpor, /*jScrollPanelDatosEdicionTipoProrrateoImpor,*/ jPanelAccionesTipoProrrateoImpor,jPanelAccionesFormularioTipoProrrateoImpor,jmenuBarTipoProrrateoImpor,jmenuBarDetalleTipoProrrateoImpor,jTtoolBarTipoProrrateoImpor,jTtoolBarDetalleTipoProrrateoImpor));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoProrrateoImpor(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoProrrateoImpor(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoProrrateoImpor(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoProrrateoImpor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoProrrateoImpor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoProrrateoImpor,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoProrrateoImpor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoProrrateoImpor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoProrrateoImpor,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoprorrateoimporConstantesFunciones.getsFinalQueryTipoProrrateoImpor();
		String  finalQueryPaginacionTodos=this.tipoprorrateoimporConstantesFunciones.getsFinalQueryTipoProrrateoImpor();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoProrrateoImporConstantesFunciones.getArrayColumnasGlobalesNoTipoProrrateoImpor(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoProrrateoImporConstantesFunciones.getArrayColumnasGlobalesTipoProrrateoImpor(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoProrrateoImporConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoprorrateoimporsEliminados= new ArrayList<TipoProrrateoImpor>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoProrrateoImpor();
		
				///*TipoProrrateoImporSessionBean*/this.tipoprorrateoimporSessionBean=new TipoProrrateoImporSessionBean();
			
			if(this.tipoprorrateoimporSessionBean==null) {
				this.tipoprorrateoimporSessionBean=new TipoProrrateoImporSessionBean();
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
					this.iNumeroPaginacion=TipoProrrateoImporConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoProrrateoImporConstantesFunciones.getClassesForeignKeysOfTipoProrrateoImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoprorrateoimpor."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoprorrateoimporsAux= new ArrayList<TipoProrrateoImpor>();
			
				
			tipoprorrateoimporLogic.setDatosCliente(this.datosCliente);
			tipoprorrateoimporLogic.setDatosDeep(this.datosDeep);
			tipoprorrateoimporLogic.setIsConDeep(true);
			
			
			tipoprorrateoimporLogic.getTipoProrrateoImporDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoprorrateoimporLogic.getTodosTipoProrrateoImpors(finalQueryGlobal,pagination);
					
					//tipoprorrateoimporLogic.getTodosTipoProrrateoImporsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoprorrateoimporLogic.getTipoProrrateoImpors()==null|| tipoprorrateoimporLogic.getTipoProrrateoImpors().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprorrateoimporsAux= new ArrayList<TipoProrrateoImpor>();
							tipoprorrateoimporsAux.addAll(tipoprorrateoimporLogic.getTipoProrrateoImpors());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprorrateoimporsAux= new ArrayList<TipoProrrateoImpor>();
							tipoprorrateoimporsAux.addAll(tipoprorrateoimpors);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprorrateoimporLogic.getTodosTipoProrrateoImpors(finalQueryGlobal+"",this.pagination);												
							
							//tipoprorrateoimporLogic.getTodosTipoProrrateoImporsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoProrrateoImpors("Todos",tipoprorrateoimporLogic.getTipoProrrateoImpors() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprorrateoimporLogic.setTipoProrrateoImpors(new ArrayList<TipoProrrateoImpor>());					
							tipoprorrateoimporLogic.getTipoProrrateoImpors().addAll(tipoprorrateoimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprorrateoimpors=new ArrayList<TipoProrrateoImpor>();
							tipoprorrateoimpors.addAll(tipoprorrateoimporsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoProrrateoImpor=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoProrrateoImpor=this.idActual;
				
				} else if(this.idTipoProrrateoImporActual!=null && this.idTipoProrrateoImporActual!=0L) {
					idTipoProrrateoImpor=idTipoProrrateoImporActual;
				}
				
					
				this.sDetalleReporte=TipoProrrateoImporConstantesFunciones.getDetalleIndicePorId(idTipoProrrateoImpor);
				
				this.tipoprorrateoimpors=new ArrayList<TipoProrrateoImpor>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoprorrateoimporLogic.getEntity(idTipoProrrateoImpor);
					
					//tipoprorrateoimporLogic.getEntityWithConnection(idTipoProrrateoImpor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprorrateoimporLogic.setTipoProrrateoImpors(new ArrayList<TipoProrrateoImpor>());
					tipoprorrateoimporLogic.getTipoProrrateoImpors().add(tipoprorrateoimporLogic.getTipoProrrateoImpor());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprorrateoimpors=new ArrayList<TipoProrrateoImpor>();
					this.tipoprorrateoimpors.add(tipoprorrateoimpor);
				}
				
				if(tipoprorrateoimporLogic.getTipoProrrateoImpor()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoProrrateoImpor();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoProrrateoImpor();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoprorrateoimporLogic.getTipoProrrateoImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprorrateoimpors.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoprorrateoimporLogic.getTipoProrrateoImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprorrateoimpors.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoProrrateoImpor tipoprorrateoimpor) {
		Boolean permite=true;
		
		if(this.tipoprorrateoimpor.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoProrrateoImporConstantesFunciones.getOrderByListaTipoProrrateoImpor();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoProrrateoImporConstantesFunciones.getOrderByListaTipoProrrateoImpor();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProrrateoImpor tipoprorrateoimpor:tipoprorrateoimporLogic.getTipoProrrateoImpors()) {
				if(tipoprorrateoimpor.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprorrateoimporTotales=tipoprorrateoimpor;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProrrateoImpor tipoprorrateoimpor:this.tipoprorrateoimpors) {
				if(tipoprorrateoimpor.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprorrateoimporTotales=tipoprorrateoimpor;
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
			this.tipoprorrateoimporAux=new TipoProrrateoImpor();
			this.tipoprorrateoimporAux.setsType(Constantes2.S_TOTALES);
			this.tipoprorrateoimporAux.setIsNew(false);
			this.tipoprorrateoimporAux.setIsChanged(false);
			this.tipoprorrateoimporAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoProrrateoImporConstantesFunciones.TotalizarValoresFilaTipoProrrateoImpor(this.tipoprorrateoimporLogic.getTipoProrrateoImpors(),this.tipoprorrateoimporAux);
				
				this.tipoprorrateoimporLogic.getTipoProrrateoImpors().add(this.tipoprorrateoimporAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoProrrateoImporConstantesFunciones.TotalizarValoresFilaTipoProrrateoImpor(this.tipoprorrateoimpors,this.tipoprorrateoimporAux);
				
				this.tipoprorrateoimpors.add(this.tipoprorrateoimporAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoprorrateoimporTotales=new TipoProrrateoImpor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoprorrateoimporLogic.getTipoProrrateoImpors().remove(tipoprorrateoimporTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoprorrateoimpors.remove(tipoprorrateoimporTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoprorrateoimporTotales=new TipoProrrateoImpor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProrrateoImpor tipoprorrateoimpor:tipoprorrateoimporLogic.getTipoProrrateoImpors()) {
				if(tipoprorrateoimpor.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprorrateoimporTotales=tipoprorrateoimpor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoProrrateoImporConstantesFunciones.TotalizarValoresFilaTipoProrrateoImpor(this.tipoprorrateoimporLogic.getTipoProrrateoImpors(),tipoprorrateoimporTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProrrateoImpor tipoprorrateoimpor:this.tipoprorrateoimpors) {
				if(tipoprorrateoimpor.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprorrateoimporTotales=tipoprorrateoimpor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoProrrateoImporConstantesFunciones.TotalizarValoresFilaTipoProrrateoImpor(this.tipoprorrateoimpors,tipoprorrateoimporTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoProrrateoImpor() {
		this.isPermisoTodoTipoProrrateoImpor=false;
		this.isPermisoNuevoTipoProrrateoImpor=false;
		this.isPermisoActualizarTipoProrrateoImpor=false;
		this.isPermisoActualizarOriginalTipoProrrateoImpor=false;
		this.isPermisoEliminarTipoProrrateoImpor=false;
		this.isPermisoGuardarCambiosTipoProrrateoImpor=false;
		this.isPermisoConsultaTipoProrrateoImpor=false;
		this.isPermisoBusquedaTipoProrrateoImpor=false;
		this.isPermisoReporteTipoProrrateoImpor=false;		
		this.isPermisoOrdenTipoProrrateoImpor=false;		
		this.isPermisoPaginacionMedioTipoProrrateoImpor=false;		
		this.isPermisoPaginacionAltoTipoProrrateoImpor=false;
		this.isPermisoPaginacionTodoTipoProrrateoImpor=false;
		this.isPermisoCopiarTipoProrrateoImpor=false;		
		this.isPermisoVerFormTipoProrrateoImpor=false;		
		this.isPermisoDuplicarTipoProrrateoImpor=false;		
		this.isPermisoOrdenTipoProrrateoImpor=false;		
	}
	
	public void setPermisosUsuarioTipoProrrateoImpor(Boolean isPermiso) {
		this.isPermisoTodoTipoProrrateoImpor=isPermiso;
		this.isPermisoNuevoTipoProrrateoImpor=isPermiso;
		this.isPermisoActualizarTipoProrrateoImpor=isPermiso;
		this.isPermisoActualizarOriginalTipoProrrateoImpor=isPermiso;
		this.isPermisoEliminarTipoProrrateoImpor=isPermiso;
		this.isPermisoGuardarCambiosTipoProrrateoImpor=isPermiso;
		this.isPermisoConsultaTipoProrrateoImpor=isPermiso;
		this.isPermisoBusquedaTipoProrrateoImpor=isPermiso;
		this.isPermisoReporteTipoProrrateoImpor=isPermiso;
		this.isPermisoOrdenTipoProrrateoImpor=isPermiso;		
		this.isPermisoPaginacionMedioTipoProrrateoImpor=isPermiso;		
		this.isPermisoPaginacionAltoTipoProrrateoImpor=isPermiso;		
		this.isPermisoPaginacionTodoTipoProrrateoImpor=isPermiso;		
		this.isPermisoCopiarTipoProrrateoImpor=isPermiso;		
		this.isPermisoVerFormTipoProrrateoImpor=isPermiso;		
		this.isPermisoDuplicarTipoProrrateoImpor=isPermiso;
		this.isPermisoOrdenTipoProrrateoImpor=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoProrrateoImpor(Boolean isPermiso) {
		//this.isPermisoTodoTipoProrrateoImpor=isPermiso;
		this.isPermisoNuevoTipoProrrateoImpor=isPermiso;
		this.isPermisoActualizarTipoProrrateoImpor=isPermiso;
		this.isPermisoActualizarOriginalTipoProrrateoImpor=isPermiso;
		this.isPermisoEliminarTipoProrrateoImpor=isPermiso;
		this.isPermisoGuardarCambiosTipoProrrateoImpor=isPermiso;
		//this.isPermisoConsultaTipoProrrateoImpor=isPermiso;
		//this.isPermisoBusquedaTipoProrrateoImpor=isPermiso;
		//this.isPermisoReporteTipoProrrateoImpor=isPermiso;
		//this.isPermisoOrdenTipoProrrateoImpor=isPermiso;		
		//this.isPermisoPaginacionMedioTipoProrrateoImpor=isPermiso;		
		//this.isPermisoPaginacionAltoTipoProrrateoImpor=isPermiso;		
		//this.isPermisoPaginacionTodoTipoProrrateoImpor=isPermiso;		
		//this.isPermisoCopiarTipoProrrateoImpor=isPermiso;		
		//this.isPermisoDuplicarTipoProrrateoImpor=isPermiso;
		//this.isPermisoOrdenTipoProrrateoImpor=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoProrrateoImporClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoProrrateoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoProrrateoImpor(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoProrrateoImporClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoProrrateoImporClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoProrrateoImporClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoProrrateoImporClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoProrrateoImpor() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoProrrateoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoProrrateoImporConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoProrrateoImpor=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoProrrateoImpor=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoProrrateoImpor=this.isPermisoActualizarTipoProrrateoImpor;
			this.isPermisoEliminarTipoProrrateoImpor=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoProrrateoImpor=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoProrrateoImpor=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoProrrateoImpor=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoProrrateoImpor=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoProrrateoImpor=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoProrrateoImpor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoProrrateoImpor=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoProrrateoImpor=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoProrrateoImpor=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoProrrateoImpor=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoProrrateoImpor=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoProrrateoImpor=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoProrrateoImpor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoProrrateoImpor.setToolTipText(this.jTableDatosTipoProrrateoImpor.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoProrrateoImpor(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoProrrateoImpor(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoProrrateoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoProrrateoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoProrrateoImpor() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoProrrateoImporListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoProrrateoImporListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoProrrateoImporJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoProrrateoImporListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoProrrateoImporListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoProrrateoImpor()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoProrrateoImpor()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoProrrateoImpor(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoProrrateoImpor()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProrrateoImpor();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoProrrateoImpor(TipoProrrateoImpor tipoprorrateoimpor)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoProrrateoImpor(TipoProrrateoImpor tipoprorrateoimpor,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoProrrateoImpor()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProrrateoImpor()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoProrrateoImpor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoProrrateoImpor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoProrrateoImpor()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoProrrateoImpor()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoProrrateoImpor(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoProrrateoImpor()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoProrrateoImporBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoProrrateoImporBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoProrrateoImporBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoprorrateoimporSessionBean=new TipoProrrateoImporSessionBean(); 
		this.tipoprorrateoimporConstantesFunciones=new TipoProrrateoImporConstantesFunciones(); 
		this.tipoprorrateoimporBean=new TipoProrrateoImpor();//(this.tipoprorrateoimporConstantesFunciones); 		
		this.tipoprorrateoimporReturnGeneral=new TipoProrrateoImporParameterReturnGeneral(); 
		
		this.tipoprorrateoimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprorrateoimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoProrrateoImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoProrrateoImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoProrrateoImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoProrrateoImpor(true);
			
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
			
			this.tipoprorrateoimporConstantesFunciones=new TipoProrrateoImporConstantesFunciones(); 
			this.tipoprorrateoimporBean=new TipoProrrateoImpor();//this.tipoprorrateoimporConstantesFunciones); 			
			this.tipoprorrateoimporReturnGeneral=new TipoProrrateoImporParameterReturnGeneral(); 
		
			TipoProrrateoImporBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Prorrateo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoprorrateoimpor=new TipoProrrateoImpor();
			this.tipoprorrateoimpors = new ArrayList<TipoProrrateoImpor>();
			this.tipoprorrateoimporsAux = new ArrayList<TipoProrrateoImpor>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic=new TipoProrrateoImporLogic();
				this.tipoprorrateoimporLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoprorrateoimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoprorrateoimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoProrrateoImpor);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoProrrateoImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoProrrateoImpor);	
					}
					
					if(this.jInternalFrameImportacionTipoProrrateoImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoProrrateoImpor);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoProrrateoImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoProrrateoImpor);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoProrrateoImpor);
				this.jInternalFrameDetalleFormTipoProrrateoImpor.setVisible(false);
				this.jInternalFrameDetalleFormTipoProrrateoImpor.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoProrrateoImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoProrrateoImpor);
					this.jInternalFrameReporteDinamicoTipoProrrateoImpor.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoProrrateoImpor.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoProrrateoImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoProrrateoImpor);
					this.jInternalFrameImportacionTipoProrrateoImpor.setVisible(false);
					this.jInternalFrameImportacionTipoProrrateoImpor.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoProrrateoImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoProrrateoImpor);
					this.jInternalFrameOrderByTipoProrrateoImpor.setVisible(false);
					this.jInternalFrameOrderByTipoProrrateoImpor.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoProrrateoImporActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoProrrateoImporConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoprorrateoimporReturnGeneral=new TipoProrrateoImporParameterReturnGeneral();
			
			this.tipoprorrateoimporParameterGeneral=new TipoProrrateoImporParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoprorrateoimporLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoProrrateoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoProrrateoImporConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado(),this.tipoprorrateoimporSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoProrrateoImporConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado(),this.tipoprorrateoimporSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoProrrateoImpor=false;
			this.isVisibilidadCeldaDuplicarTipoProrrateoImpor=true;
			this.isVisibilidadCeldaCopiarTipoProrrateoImpor=true;
			this.isVisibilidadCeldaVerFormTipoProrrateoImpor=true;
			this.isVisibilidadCeldaOrdenTipoProrrateoImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor=false;
			this.isVisibilidadCeldaModificarTipoProrrateoImpor=false;
			this.isVisibilidadCeldaActualizarTipoProrrateoImpor=false;
			this.isVisibilidadCeldaEliminarTipoProrrateoImpor=false;
			this.isVisibilidadCeldaCancelarTipoProrrateoImpor=false;
			this.isVisibilidadCeldaGuardarTipoProrrateoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProrrateoImpor=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoProrrateoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoProrrateoImpor();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoProrrateoImpor(false);
			
			this.setPermisosUsuarioTipoProrrateoImpor();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado() && this.tipoprorrateoimporSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoProrrateoImporClasesRelacionadas();
			}
			
			if(this.tipoprorrateoimporSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoProrrateoImporClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoProrrateoImpor();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoProrrateoImpor();
			}
			
			if(!this.isPermisoBusquedaTipoProrrateoImpor) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoProrrateoImpor,this.isPermisoPaginacionMedioTipoProrrateoImpor,this.isPermisoPaginacionTodoTipoProrrateoImpor);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoProrrateoImporConstantesFunciones.getTiposSeleccionarTipoProrrateoImpor());
				
				this.tiposColumnasSelect=TipoProrrateoImporConstantesFunciones.getTiposSeleccionarTipoProrrateoImpor(true);
				
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
			//if(!this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoProrrateoImpor();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoProrrateoImpor(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoProrrateoImpor(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProrrateoImpor() ;
			
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
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipoprorrateoimporImplementable= (TipoProrrateoImporImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoProrrateoImporConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoprorrateoimporImplementableHome= (TipoProrrateoImporImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoProrrateoImporConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoprorrateoimpors= new ArrayList<TipoProrrateoImpor>();
			this.tipoprorrateoimporsEliminados= new ArrayList<TipoProrrateoImpor>();
						
			this.isEsNuevoTipoProrrateoImpor=false;
			this.esParaAccionDesdeFormularioTipoProrrateoImpor=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoProrrateoImpor(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoProrrateoImpor();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoProrrateoImporConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoProrrateoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoProrrateoImpor(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoProrrateoImpor();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoProrrateoImpor();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoProrrateoImpor(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoProrrateoImpor: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoProrrateoImpor() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoProrrateoImpor")) {
				iIndex=this.jInternalFrameDetalleFormTipoProrrateoImpor.jTabbedPaneRelacionesTipoProrrateoImpor.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoProrrateoImpor.jTabbedPaneRelacionesTipoProrrateoImpor.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoProrrateoImpor.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoProrrateoImpor();	
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
	
	public void cargarCombosForeignKeyTipoProrrateoImpor(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoProrrateoImpor(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoProrrateoImpor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoProrrateoImporListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoProrrateoImpor();
		
		this.cargarCombosFrameForeignKeyTipoProrrateoImpor();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoProrrateoImpor();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoProrrateoImpor();
		}
	}
	
	
	
	public void jButtonNuevoTipoProrrateoImporActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoprorrateoimporSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoProrrateoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
			
			
			if(jTableDatosTipoProrrateoImpor.getRowCount()>=1) {
				jTableDatosTipoProrrateoImpor.removeRowSelectionInterval(0, jTableDatosTipoProrrateoImpor.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoProrrateoImpor=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoProrrateoImpor(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoProrrateoImpor(true);			
			//this.tipoprorrateoimpor=new TipoProrrateoImpor();
			//this.tipoprorrateoimpor.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProrrateoImpor(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProrrateoImpor() ;
			
			if(TipoProrrateoImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProrrateoImpor(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoprorrateoimpor);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprorrateoimpor);				
			
			TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
			
			if(this.tipoprorrateoimporSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoProrrateoImpor: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoProrrateoImporActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoProrrateoImpor> tipoprorrateoimporsSeleccionados=new ArrayList<TipoProrrateoImpor>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoProrrateoImpor.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoProrrateoImpor.getSelectedRows().length;			
			}
			
			tipoprorrateoimporsSeleccionados=this.getTipoProrrateoImporsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoProrrateoImpor--;			
				//TipoProrrateoImpor tipoprorrateoimporAux= new TipoProrrateoImpor();			
				//tipoprorrateoimporAux.setId(this.iIdNuevoTipoProrrateoImpor);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoProrrateoImpor tipoprorrateoimporOrigen=new TipoProrrateoImpor();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoProrrateoImpor tipoprorrateoimporOrigen : tipoprorrateoimporsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoProrrateoImpor.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoprorrateoimporOrigen =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprorrateoimporOrigen =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoProrrateoImpor();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoprorrateoimpor.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoProrrateoImpor(tipoprorrateoimporOrigen,this.tipoprorrateoimpor,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProrrateoImpor(this.tipoprorrateoimpor);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoprorrateoimporLogic.getTipoProrrateoImpors().add(this.tipoprorrateoimporAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoprorrateoimpors.add(this.tipoprorrateoimporAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoProrrateoImpor(false);
				
				this.jTableDatosTipoProrrateoImpor.setRowSelectionInterval(this.getIndiceNuevoTipoProrrateoImpor(), this.getIndiceNuevoTipoProrrateoImpor());
				
				int iLastRow =  this.jTableDatosTipoProrrateoImpor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoProrrateoImpor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoProrrateoImpor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProrrateoImpor(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoProrrateoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoProrrateoImpor> tipoprorrateoimporsSeleccionados=new ArrayList<TipoProrrateoImpor>();									
		
			TipoProrrateoImpor tipoprorrateoimporOrigen=new TipoProrrateoImpor();
			TipoProrrateoImpor tipoprorrateoimporDestino=new TipoProrrateoImpor();
				
			tipoprorrateoimporsSeleccionados=this.getTipoProrrateoImporsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoProrrateoImpor.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoprorrateoimporsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoProrrateoImpor.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprorrateoimporOrigen =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoprorrateoimporOrigen =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprorrateoimporDestino =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoprorrateoimporDestino =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoprorrateoimporOrigen =tipoprorrateoimporsSeleccionados.get(0);
				tipoprorrateoimporDestino =tipoprorrateoimporsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoProrrateoImpor(tipoprorrateoimporOrigen,tipoprorrateoimporDestino,true,false);
				
				tipoprorrateoimporDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoprorrateoimporDestino,tipoprorrateoimporLogic.getTipoProrrateoImpors());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprorrateoimporDestino,tipoprorrateoimpors);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoProrrateoImpor(false);
				
				//this.jTableDatosTipoProrrateoImpor.setRowSelectionInterval(this.getIndiceNuevoTipoProrrateoImpor(), this.getIndiceNuevoTipoProrrateoImpor());
				
				int iLastRow =  this.jTableDatosTipoProrrateoImpor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoProrrateoImpor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoProrrateoImpor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProrrateoImpor(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoProrrateoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoProrrateoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoProrrateoImpor.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoProrrateoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoProrrateoImpor.isVisible();
			
			
			this.jPanelParametrosReportesTipoProrrateoImpor.setVisible(!isVisible);
			this.jPanelPaginacionTipoProrrateoImpor.setVisible(!isVisible);
			this.jPanelAccionesTipoProrrateoImpor.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoProrrateoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoProrrateoImpor();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoProrrateoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoProrrateoImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoProrrateoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoProrrateoImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoProrrateoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoProrrateoImpor();
			
			this.abrirFrameOrderByTipoProrrateoImpor();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoProrrateoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoProrrateoImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoProrrateoImpor(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoProrrateoImpor);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoProrrateoImpor.isMaximum()) {
					this.jInternalFrameDetalleFormTipoProrrateoImpor.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoProrrateoImpor.setSize(this.jInternalFrameDetalleFormTipoProrrateoImpor.iWidthFormulario,this.jInternalFrameDetalleFormTipoProrrateoImpor.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoProrrateoImpor.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoProrrateoImpor.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoProrrateoImpor.isMaximum()) {
						this.jInternalFrameDetalleFormTipoProrrateoImpor.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoProrrateoImpor.jContentPaneDetalleTipoProrrateoImpor.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoProrrateoImpor.jTabbedPaneRelacionesTipoProrrateoImpor.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoProrrateoImpor.jContentPaneDetalleTipoProrrateoImpor.getWidth(),TipoProrrateoImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoProrrateoImpor.jTabbedPaneRelacionesTipoProrrateoImpor.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoProrrateoImpor.jContentPaneDetalleTipoProrrateoImpor.getWidth(),TipoProrrateoImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoProrrateoImpor.jTabbedPaneRelacionesTipoProrrateoImpor.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoProrrateoImpor.jContentPaneDetalleTipoProrrateoImpor.getWidth(),TipoProrrateoImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoProrrateoImpor.setVisible(true);
	        this.jInternalFrameDetalleFormTipoProrrateoImpor.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoProrrateoImpor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoProrrateoImpor==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoProrrateoImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProrrateoImpor,false,this);
				} else {
					this.jInternalFrameOrderByTipoProrrateoImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProrrateoImpor,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoProrrateoImpor);
				this.jInternalFrameOrderByTipoProrrateoImpor.setVisible(false);
				this.jInternalFrameOrderByTipoProrrateoImpor.setSelected(false);
				
				this.jInternalFrameOrderByTipoProrrateoImpor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoProrrateoImpor"));
				
				this.inicializarActualizarBindingTablaOrderByTipoProrrateoImpor();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoProrrateoImpor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoProrrateoImpor==null) {
				
				this.jInternalFrameImportacionTipoProrrateoImpor=new ImportacionJInternalFrame(TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoProrrateoImpor);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoProrrateoImpor);
				this.jInternalFrameImportacionTipoProrrateoImpor.setVisible(false);
				this.jInternalFrameImportacionTipoProrrateoImpor.setSelected(false);


				this.jInternalFrameImportacionTipoProrrateoImpor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoProrrateoImpor"));
				this.jInternalFrameImportacionTipoProrrateoImpor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoProrrateoImpor"));
				this.jInternalFrameImportacionTipoProrrateoImpor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoProrrateoImpor"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoProrrateoImpor() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoProrrateoImpor==null) {
				this.jInternalFrameReporteDinamicoTipoProrrateoImpor=new ReporteDinamicoJInternalFrame(TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoProrrateoImpor);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoProrrateoImpor);
				this.jInternalFrameReporteDinamicoTipoProrrateoImpor.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoProrrateoImpor.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProrrateoImpor"));
				this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProrrateoImpor"));
				this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProrrateoImpor"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProrrateoImpor();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoProrrateoImpor() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoProrrateoImpor);
			
	       	this.jInternalFrameDetalleFormTipoProrrateoImpor.setVisible(false);
	        this.jInternalFrameDetalleFormTipoProrrateoImpor.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoProrrateoImpor.dispose();
			//this.jInternalFrameDetalleFormTipoProrrateoImpor=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoProrrateoImpor() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoProrrateoImpor.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoProrrateoImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoProrrateoImpor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoProrrateoImpor.setVisible(true);
	        this.jInternalFrameImportacionTipoProrrateoImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoProrrateoImpor() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoProrrateoImpor.setVisible(true);
	        this.jInternalFrameOrderByTipoProrrateoImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoProrrateoImpor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoProrrateoImpor.setVisible(false);
	        this.jInternalFrameOrderByTipoProrrateoImpor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoProrrateoImpor() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoProrrateoImpor.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoProrrateoImpor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoProrrateoImpor() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoProrrateoImpor.setVisible(false);
	        this.jInternalFrameImportacionTipoProrrateoImpor.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoProrrateoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoProrrateoImpor(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoProrrateoImpor(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoProrrateoImpor.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoProrrateoImpor(true);
			//this.isEsNuevoTipoProrrateoImpor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoProrrateoImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProrrateoImpor(false) ;
			
			if(tipoprorrateoimporSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoProrrateoImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProrrateoImpor(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProrrateoImpor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoProrrateoImporActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoProrrateoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoProrrateoImpor(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoProrrateoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoProrrateoImpor.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoProrrateoImpor(true);
			//this.isEsNuevoTipoProrrateoImpor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoprorrateoimpor.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoProrrateoImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoProrrateoImpor(false) ;
			
			if(TipoProrrateoImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProrrateoImpor(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProrrateoImpor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoProrrateoImporActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoProrrateoImpor(false);
			
			//if(!this.isEsNuevoTipoProrrateoImpor) {								
				int intSelectedRow = this.jTableDatosTipoProrrateoImpor.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoProrrateoImpor(this.tipoprorrateoimpor,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProrrateoImpor(this.tipoprorrateoimpor);
				
			}
			
			if(this.permiteMantenimiento(this.tipoprorrateoimpor)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoProrrateoImpor=true;
					this.inicializarActualizarBindingTablaTipoProrrateoImpor(false);
					this.isEsNuevoTipoProrrateoImpor=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoProrrateoImpor=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoProrrateoImpor=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoProrrateoImpor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProrrateoImpor(false);
				
				this.habilitarDeshabilitarControlesTipoProrrateoImpor(false);
			
												
				
				if(TipoProrrateoImporJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoProrrateoImpor();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoProrrateoImporActionPerformed(evt,tipoprorrateoimporSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoProrrateoImpor(this.tipoprorrateoimpor,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoProrrateoImpor.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoprorrateoimporSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoprorrateoimpor.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoProrrateoImpor.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProrrateoImpor.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoProrrateoImporActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoProrrateoImpor.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
				this.tipoprorrateoimpor.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
				this.tipoprorrateoimpor.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoprorrateoimpor)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoProrrateoImporModel) this.jTableDatosTipoProrrateoImpor.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoProrrateoImpor=true;
				this.inicializarActualizarBindingTablaTipoProrrateoImpor(false);
				this.isEsNuevoTipoProrrateoImpor=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoProrrateoImpor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProrrateoImpor(false);
				
				this.habilitarDeshabilitarControlesTipoProrrateoImpor(false);
				
				
				
				if(TipoProrrateoImporJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoProrrateoImpor();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoProrrateoImporActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoProrrateoImpor.getRowCount()>=1) {
				jTableDatosTipoProrrateoImpor.removeRowSelectionInterval(0, jTableDatosTipoProrrateoImpor.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoProrrateoImpor(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoProrrateoImpor(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProrrateoImpor(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProrrateoImpor(false) ;
			
			this.isEsNuevoTipoProrrateoImpor=false;
			
			if(TipoProrrateoImporJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoProrrateoImpor();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoProrrateoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoProrrateoImpor(false);
				
				//SI ES MANUAL
				if(TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoProrrateoImpor();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoProrrateoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoProrrateoImpor--;			
			//TipoProrrateoImpor tipoprorrateoimporAux= new TipoProrrateoImpor();			
			//tipoprorrateoimporAux.setId(this.iIdNuevoTipoProrrateoImpor);
			
			if(this.jInternalFrameDetalleFormTipoProrrateoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoProrrateoImpor();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoProrrateoImpor(this.tipoprorrateoimpor);
			
			this.tipoprorrateoimpor.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoprorrateoimporLogic.getTipoProrrateoImpors().add(this.tipoprorrateoimporAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoprorrateoimpors.add(this.tipoprorrateoimporAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoProrrateoImpor(false);
			
			this.jTableDatosTipoProrrateoImpor.setRowSelectionInterval(this.getIndiceNuevoTipoProrrateoImpor(), this.getIndiceNuevoTipoProrrateoImpor());
			
			int iLastRow =  this.jTableDatosTipoProrrateoImpor.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoProrrateoImpor.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoProrrateoImpor.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoProrrateoImpor(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoProrrateoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoProrrateoImpor(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProrrateoImpor(false);
			
			//SI ES MANUAL
			if(TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProrrateoImpor();
			}
			
			//this.abrirFrameTreeTipoProrrateoImpor();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoProrrateoImporActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo ProrrateoS ?", "MANTENIMIENTO DE Tipo Prorrateo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoProrrateoImpor.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoProrrateoImpor();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoprorrateoimporReturnGeneral=tipoprorrateoimporLogic.procesarImportacionTipoProrrateoImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoprorrateoimporParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoProrrateoImporReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoProrrateoImporActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoProrrateoImpor.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoProrrateoImpor.setFileImportacion(this.jInternalFrameImportacionTipoProrrateoImpor.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoProrrateoImpor.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoProrrateoImpor.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoProrrateoImpor.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoProrrateoImpor.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoProrrateoImporActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoProrrateoImpor> tipoprorrateoimporsSeleccionados=new ArrayList<TipoProrrateoImpor>();		

		tipoprorrateoimporsSeleccionados=this.getTipoProrrateoImporsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoProrrateoImporBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoProrrateoImporBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoProrrateoImpors("Todos",tipoprorrateoimporsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prorrateo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoProrrateoImporConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoProrrateoImporConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoProrrateoImporConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoProrrateoImporConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoProrrateoImporConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoProrrateoImporConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoProrrateoImporConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoProrrateoImporConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoProrrateoImporActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoProrrateoImpor> tipoprorrateoimporsSeleccionados=new ArrayList<TipoProrrateoImpor>();		
		
		tipoprorrateoimporsSeleccionados=this.getTipoProrrateoImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprorrateoimpor";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoProrrateoImpors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoProrrateoImporConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoProrrateoImporConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoProrrateoImpor tipoprorrateoimpor:tipoprorrateoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprorrateoimpor.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoProrrateoImporConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoProrrateoImporConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoProrrateoImpor tipoprorrateoimpor:tipoprorrateoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprorrateoimpor.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoProrrateoImpor(row);				
			//	iRow++;
			//}				
			
			//for(TipoProrrateoImpor tipoprorrateoimporAux:tipoprorrateoimporsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoProrrateoImpor(tipoprorrateoimporAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prorrateo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoprorrateoimporLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProrrateoImpor(false);
			
			//SI ES MANUAL
			if(TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProrrateoImpor();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoProrrateoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProrrateoImpor(false);
			
			//SI ES MANUAL
			if(TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoProrrateoImpor();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoProrrateoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProrrateoImpor(false);
			
			//SI ES MANUAL
			if(TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoProrrateoImpor();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprorrateoimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoProrrateoImpor() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoProrrateoImpor.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoProrrateoImpor.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoProrrateoImpor.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoProrrateoImpor.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoProrrateoImpor.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoProrrateoImpor.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoProrrateoImpor.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoProrrateoImpor(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoProrrateoImpor(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoProrrateoImpor(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoProrrateoImpor(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoProrrateoImpor(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoProrrateoImpor(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProrrateoImpor(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoProrrateoImpor(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoProrrateoImpor() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoProrrateoImpor();
		
		this.inicializarActualizarBindingBotonesManualTipoProrrateoImpor(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoProrrateoImpor();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProrrateoImpor() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProrrateoImpor(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProrrateoImpor(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoProrrateoImpor.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoProrrateoImpor.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoProrrateoImpor.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoProrrateoImpor.jCheckBoxPostAccionNuevoTipoProrrateoImpor.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoProrrateoImpor.jCheckBoxPostAccionSinCerrarTipoProrrateoImpor.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoProrrateoImpor.jCheckBoxPostAccionSinMensajeTipoProrrateoImpor.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoProrrateoImpor.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoProrrateoImpor.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoProrrateoImpor.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) {
				this.jInternalFrameDetalleFormTipoProrrateoImpor.jCheckBoxPostAccionNuevoTipoProrrateoImpor.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoProrrateoImpor.jCheckBoxPostAccionSinCerrarTipoProrrateoImpor.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoProrrateoImpor.jCheckBoxPostAccionSinMensajeTipoProrrateoImpor.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoProrrateoImpor.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoProrrateoImpor.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoProrrateoImpor.jComboBoxTiposAccionesFormularioTipoProrrateoImpor.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoProrrateoImpor.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoProrrateoImpor!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoProrrateoImpor.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoProrrateoImpor.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoProrrateoImpor.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoProrrateoImpor.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoProrrateoImpor!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoProrrateoImpor.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoProrrateoImpor.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoProrrateoImpor(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProrrateoImpor(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoProrrateoImpor() throws Exception {
		try	{
			if(TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoProrrateoImpor();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoProrrateoImpor() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jComboBoxTiposAccionesFormularioTipoProrrateoImpor.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jComboBoxTiposAccionesFormularioTipoProrrateoImpor.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoProrrateoImpor() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoProrrateoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoProrrateoImpor.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoProrrateoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoProrrateoImpor.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoProrrateoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoProrrateoImpor.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoProrrateoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoProrrateoImpor.addItem(reporte);
			}
			
			
			if(!this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoProrrateoImpor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoProrrateoImpor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoProrrateoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoProrrateoImpor.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoProrrateoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoProrrateoImpor.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoProrrateoImpor.jComboBoxTiposAccionesFormularioTipoProrrateoImpor.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoProrrateoImpor.jComboBoxTiposAccionesFormularioTipoProrrateoImpor.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoProrrateoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoProrrateoImpor.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoProrrateoImpor.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProrrateoImpor();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProrrateoImpor() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoProrrateoImpor!=null) {
				this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoProrrateoImpor!=null) {
				this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoProrrateoImpor!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoProrrateoImpor()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoProrrateoImpor(Boolean esInicializar) throws Exception {				
		if(TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoProrrateoImpor();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoProrrateoImpor() throws Exception {
		this.inicializarActualizarBindingTablaTipoProrrateoImpor(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoProrrateoImpor() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoProrrateoImpor.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoProrrateoImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProrrateoImpor.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoProrrateoImporPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoProrrateoImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProrrateoImpor.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoProrrateoImporPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoProrrateoImporOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProrrateoImporOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoProrrateoImporPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoProrrateoImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProrrateoImpor.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoProrrateoImporPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoProrrateoImpor.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoProrrateoImpor(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoprorrateoimporLogic.getTipoProrrateoImpors().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoprorrateoimpors.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoProrrateoImpor.setModel(new TipoProrrateoImporModel(this.tipoprorrateoimporLogic.getTipoProrrateoImpors(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoProrrateoImpor.setModel(new TipoProrrateoImporModel(this.tipoprorrateoimpors,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoProrrateoImpor!=null && this.jInternalFrameOrderByTipoProrrateoImpor.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoProrrateoImpor();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoProrrateoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProrrateoImpor,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoProrrateoImporPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO,tipoprorrateoimporConstantesFunciones.resaltarSeleccionarTipoProrrateoImpor,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO,tipoprorrateoimporConstantesFunciones.resaltarSeleccionarTipoProrrateoImpor,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoProrrateoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProrrateoImpor,TipoProrrateoImporConstantesFunciones.LABEL_ID));

		if(this.tipoprorrateoimporConstantesFunciones.mostraridTipoProrrateoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProrrateoImporConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoprorrateoimporConstantesFunciones.resaltaridTipoProrrateoImpor,this.tipoprorrateoimporConstantesFunciones.activaridTipoProrrateoImpor,this,true,"idTipoProrrateoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprorrateoimporConstantesFunciones.resaltaridTipoProrrateoImpor,this.tipoprorrateoimporConstantesFunciones.activaridTipoProrrateoImpor,this,true,"idTipoProrrateoImpor","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoProrrateoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProrrateoImpor,TipoProrrateoImporConstantesFunciones.LABEL_CODIGO));

		if(this.tipoprorrateoimporConstantesFunciones.mostrarcodigoTipoProrrateoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProrrateoImporConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoprorrateoimporConstantesFunciones.resaltarcodigoTipoProrrateoImpor,this.tipoprorrateoimporConstantesFunciones.activarcodigoTipoProrrateoImpor,this,true,"codigoTipoProrrateoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprorrateoimporConstantesFunciones.resaltarcodigoTipoProrrateoImpor,this.tipoprorrateoimporConstantesFunciones.activarcodigoTipoProrrateoImpor,this,true,"codigoTipoProrrateoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoProrrateoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoProrrateoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProrrateoImpor,TipoProrrateoImporConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoprorrateoimporConstantesFunciones.mostrarnombreTipoProrrateoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProrrateoImporConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoprorrateoimporConstantesFunciones.resaltarnombreTipoProrrateoImpor,this.tipoprorrateoimporConstantesFunciones.activarnombreTipoProrrateoImpor,this,true,"nombreTipoProrrateoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprorrateoimporConstantesFunciones.resaltarnombreTipoProrrateoImpor,this.tipoprorrateoimporConstantesFunciones.activarnombreTipoProrrateoImpor,this,true,"nombreTipoProrrateoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoProrrateoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoProrrateoImpor.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoProrrateoImpor.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoProrrateoImpor && this.isPermisoGuardarCambiosTipoProrrateoImpor) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoProrrateoImpor.addColumn(tableColumn);
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
			
			this.jTableDatosTipoProrrateoImpor.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoProrrateoImpor && this.isPermisoGuardarCambiosTipoProrrateoImpor) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoProrrateoImpor && this.isPermisoGuardarCambiosTipoProrrateoImpor) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoProrrateoImpor.moveColumn(this.jTableDatosTipoProrrateoImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoProrrateoImpor.moveColumn(this.jTableDatosTipoProrrateoImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoProrrateoImpor.moveColumn(this.jTableDatosTipoProrrateoImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoProrrateoImpor.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoProrrateoImpor.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoProrrateoImpor,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoProrrateoImpor.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoProrrateoImpor.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoProrrateoImpor.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoProrrateoImpor.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoProrrateoImpor.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoprorrateoimporLogic.getTipoProrrateoImpors().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoprorrateoimpors.size()-1;
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
		//this.jTableDatosTipoProrrateoImpor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoProrrateoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoProrrateoImpor();
			
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
				
				//this.isEsNuevoTipoProrrateoImpor=false;
					
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
			
				if(this.tipoprorrateoimporSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoProrrateoImpor==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoProrrateoImpor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoProrrateoImpor.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoprorrateoimpor.getsType().equals("DUPLICADO")
				   || this.tipoprorrateoimpor.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoProrrateoImpor=true;
				
				} else {
					this.isEsNuevoTipoProrrateoImpor=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoprorrateoimpor.getId()>=0 && !this.tipoprorrateoimpor.getIsNew()) {						
						this.isEsNuevoTipoProrrateoImpor=false;
						
					} else {
						this.isEsNuevoTipoProrrateoImpor=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoProrrateoImpor(esRelaciones);						
				
				this.seleccionarTipoProrrateoImpor(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoprorrateoimpor.getId()<0) {
					this.isEsNuevoTipoProrrateoImpor=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoProrrateoImpor(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoProrrateoImpor(evt,rowIndex);
				}	
				
				if(this.tipoprorrateoimporSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoProrrateoImpor: " + this.dDif); 
					}
				}								
				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoProrrateoImpor(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoprorrateoimpor)) {
					if(this.tipoprorrateoimpor.getId()>0) {
						this.tipoprorrateoimpor.setIsDeleted(true);
						
						this.tipoprorrateoimporsEliminados.add(this.tipoprorrateoimpor);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoprorrateoimporLogic.getTipoProrrateoImpors().remove(this.tipoprorrateoimpor);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoprorrateoimpors.remove(this.tipoprorrateoimpor);				
					}
					
					
					((TipoProrrateoImporModel) this.jTableDatosTipoProrrateoImpor.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProrrateoImpor(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoProrrateoImpor(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoProrrateoImpor) {
			
			if(this.jInternalFrameDetalleFormTipoProrrateoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoProrrateoImpor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoProrrateoImpor.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoProrrateoImpor(this.tipoprorrateoimpor);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoProrrateoImpor("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoProrrateoImpor(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProrrateoImpor() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoProrrateoImpor(TipoProrrateoImpor tipoprorrateoimpor) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoProrrateoImpor(tipoprorrateoimpor,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoProrrateoImpor(TipoProrrateoImpor tipoprorrateoimpor,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoProrrateoImpor(tipoprorrateoimpor);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoProrrateoImpor(tipoprorrateoimpor,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoProrrateoImpor(tipoprorrateoimpor);
	}
	
	public void setVariablesObjetoActualToFormularioTipoProrrateoImpor(TipoProrrateoImpor tipoprorrateoimpor) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoProrrateoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextFieldidTipoProrrateoImpor.setText(tipoprorrateoimpor.getId().toString());
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextFieldcodigoTipoProrrateoImpor.setText(tipoprorrateoimpor.getcodigo());
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextAreanombreTipoProrrateoImpor.setText(tipoprorrateoimpor.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoProrrateoImpor tipoprorrateoimporLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoprorrateoimporLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoProrrateoImpor tipoprorrateoimporLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoprorrateoimporLocal=this.tipoprorrateoimpor;
			} else {
				tipoprorrateoimporLocal=this.tipoprorrateoimporAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoprorrateoimporLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoProrrateoImpor(tipoprorrateoimporLocal,true);
					
					if(tipoprorrateoimporSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoprorrateoimporLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoprorrateoimporLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoProrrateoImpor(TipoProrrateoImpor tipoprorrateoimpor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoProrrateoImpor(tipoprorrateoimpor,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoProrrateoImpor(tipoprorrateoimpor);
	}
	
	public void setVariablesFormularioToObjetoActualTipoProrrateoImpor(TipoProrrateoImpor tipoprorrateoimpor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoProrrateoImpor(tipoprorrateoimpor,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoProrrateoImpor(TipoProrrateoImpor tipoprorrateoimpor,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoProrrateoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextFieldidTipoProrrateoImpor.getText()==null || this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextFieldidTipoProrrateoImpor.getText()=="" || this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextFieldidTipoProrrateoImpor.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextFieldidTipoProrrateoImpor.setText("0");
			}

			if(conColumnasBase) {tipoprorrateoimpor.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextFieldidTipoProrrateoImpor.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProrrateoImporConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProrrateoImpor.jLabelIdTipoProrrateoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoprorrateoimpor.setcodigo(this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextFieldcodigoTipoProrrateoImpor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProrrateoImporConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProrrateoImpor.jLabelcodigoTipoProrrateoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoprorrateoimpor.setnombre(this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextAreanombreTipoProrrateoImpor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProrrateoImporConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProrrateoImpor.jLabelnombreTipoProrrateoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoProrrateoImpor(TipoProrrateoImpor tipoprorrateoimporBean,TipoProrrateoImpor tipoprorrateoimpor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoProrrateoImpor(TipoProrrateoImpor tipoprorrateoimporOrigen,TipoProrrateoImpor tipoprorrateoimpor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoprorrateoimporOrigen.getId()!=null && !tipoprorrateoimporOrigen.getId().equals(0L))) {tipoprorrateoimpor.setId(tipoprorrateoimporOrigen.getId());}}
			if(conDefault || (!conDefault && tipoprorrateoimporOrigen.getcodigo()!=null && !tipoprorrateoimporOrigen.getcodigo().equals(""))) {tipoprorrateoimpor.setcodigo(tipoprorrateoimporOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoprorrateoimporOrigen.getnombre()!=null && !tipoprorrateoimporOrigen.getnombre().equals(""))) {tipoprorrateoimpor.setnombre(tipoprorrateoimporOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoProrrateoImpor(TipoProrrateoImpor tipoprorrateoimpor) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextFieldidTipoProrrateoImpor.setText(tipoprorrateoimpor.getId().toString());
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextFieldcodigoTipoProrrateoImpor.setText(tipoprorrateoimpor.getcodigo());
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextAreanombreTipoProrrateoImpor.setText(tipoprorrateoimpor.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoProrrateoImpor(TipoProrrateoImporBean tipoprorrateoimporBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextFieldidTipoProrrateoImpor.setText(tipoprorrateoimporBean.getId().toString());
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextFieldcodigoTipoProrrateoImpor.setText(tipoprorrateoimporBean.getcodigo());
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextAreanombreTipoProrrateoImpor.setText(tipoprorrateoimporBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoProrrateoImpor(TipoProrrateoImporParameterReturnGeneral tipoprorrateoimporReturnGeneral,TipoProrrateoImporBean tipoprorrateoimporBean,Boolean conDefault) throws Exception { 
		try {
			TipoProrrateoImpor tipoprorrateoimporLocal=new TipoProrrateoImpor();
			
			tipoprorrateoimporLocal=tipoprorrateoimporReturnGeneral.getTipoProrrateoImpor();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoprorrateoimporLocal.getId()!=null && !tipoprorrateoimporLocal.getId().equals(0L))) {tipoprorrateoimporBean.setId(tipoprorrateoimporLocal.getId());}}
			if(conDefault || (!conDefault && tipoprorrateoimporLocal.getcodigo()!=null && !tipoprorrateoimporLocal.getcodigo().equals(""))) {tipoprorrateoimporBean.setcodigo(tipoprorrateoimporLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoprorrateoimporLocal.getnombre()!=null && !tipoprorrateoimporLocal.getnombre().equals(""))) {tipoprorrateoimporBean.setnombre(tipoprorrateoimporLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoProrrateoImporGenerico(Long idTipoProrrateoImporSeleccionado,JComboBox jComboBoxTipoProrrateoImpor,List<TipoProrrateoImpor> tipoprorrateoimporsLocal)throws Exception {
		try {
			TipoProrrateoImpor  tipoprorrateoimporTemp=null;

			for(TipoProrrateoImpor tipoprorrateoimporAux:tipoprorrateoimporsLocal) {
				if(tipoprorrateoimporAux.getId()!=null && tipoprorrateoimporAux.getId().equals(idTipoProrrateoImporSeleccionado)) {
					tipoprorrateoimporTemp=tipoprorrateoimporAux;
					break;
				}
			}

			jComboBoxTipoProrrateoImpor.setSelectedItem(tipoprorrateoimporTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoProrrateoImporGenerico(JComboBox jComboBoxTipoProrrateoImpor,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoProrrateoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoProrrateoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoProrrateoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoProrrateoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoProrrateoImpor.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoProrrateoImpor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoProrrateoImpor.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoProrrateoImpor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoProrrateoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoProrrateoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprorrateoimpor=(TipoProrrateoImpor) tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoprorrateoimpor =(TipoProrrateoImpor) tipoprorrateoimpors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoProrrateoImpor tipoprorrateoimporRow=new TipoProrrateoImpor();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprorrateoimporRow=(TipoProrrateoImpor) tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoprorrateoimporRow=(TipoProrrateoImpor) tipoprorrateoimpors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoProrrateoImpor(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaNuevoTipoProrrateoImpor && this.isPermisoNuevoTipoProrrateoImpor));			
			this.jButtonDuplicarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaDuplicarTipoProrrateoImpor && this.isPermisoDuplicarTipoProrrateoImpor));			
			this.jButtonCopiarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaCopiarTipoProrrateoImpor && this.isPermisoCopiarTipoProrrateoImpor));
			this.jButtonVerFormTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaVerFormTipoProrrateoImpor && this.isPermisoVerFormTipoProrrateoImpor));
			
			this.jButtonAbrirOrderByTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaOrdenTipoProrrateoImpor && this.isPermisoOrdenTipoProrrateoImpor));			
			
			this.jButtonNuevoRelacionesTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor && this.isPermisoNuevoTipoProrrateoImpor));			
			this.jButtonNuevoGuardarCambiosTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaNuevoTipoProrrateoImpor && this.isPermisoNuevoTipoProrrateoImpor && this.isPermisoGuardarCambiosTipoProrrateoImpor));
			
			if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) {
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonModificarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaModificarTipoProrrateoImpor && this.isPermisoActualizarTipoProrrateoImpor));	
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonActualizarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaActualizarTipoProrrateoImpor && this.isPermisoActualizarTipoProrrateoImpor));	
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonEliminarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaEliminarTipoProrrateoImpor && this.isPermisoEliminarTipoProrrateoImpor));
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonCancelarTipoProrrateoImpor.setVisible(this.isVisibilidadCeldaCancelarTipoProrrateoImpor);							
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonGuardarCambiosTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaGuardarTipoProrrateoImpor && this.isPermisoGuardarCambiosTipoProrrateoImpor));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProrrateoImpor && this.isPermisoGuardarCambiosTipoProrrateoImpor));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaNuevoTipoProrrateoImpor && this.isPermisoNuevoTipoProrrateoImpor));						
			this.jButtonDuplicarToolBarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaDuplicarTipoProrrateoImpor && this.isPermisoDuplicarTipoProrrateoImpor));						
			this.jButtonCopiarToolBarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaCopiarTipoProrrateoImpor && this.isPermisoCopiarTipoProrrateoImpor));			
			this.jButtonVerFormToolBarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaVerFormTipoProrrateoImpor && this.isPermisoVerFormTipoProrrateoImpor));			
			this.jButtonAbrirOrderByToolBarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaOrdenTipoProrrateoImpor && this.isPermisoOrdenTipoProrrateoImpor));
			this.jButtonNuevoRelacionesToolBarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor && this.isPermisoNuevoTipoProrrateoImpor));			
			this.jButtonNuevoGuardarCambiosToolBarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaNuevoTipoProrrateoImpor && this.isPermisoNuevoTipoProrrateoImpor && this.isPermisoGuardarCambiosTipoProrrateoImpor));			
			
			if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) {
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonModificarToolBarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaModificarTipoProrrateoImpor && this.isPermisoActualizarTipoProrrateoImpor));	
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonActualizarToolBarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaActualizarTipoProrrateoImpor  && this.isPermisoActualizarTipoProrrateoImpor));	
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonEliminarToolBarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaEliminarTipoProrrateoImpor && this.isPermisoEliminarTipoProrrateoImpor));
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonCancelarToolBarTipoProrrateoImpor.setVisible(this.isVisibilidadCeldaCancelarTipoProrrateoImpor);				
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonGuardarCambiosToolBarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaGuardarTipoProrrateoImpor && this.isPermisoGuardarCambiosTipoProrrateoImpor));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProrrateoImpor && this.isPermisoGuardarCambiosTipoProrrateoImpor));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaNuevoTipoProrrateoImpor && this.isPermisoNuevoTipoProrrateoImpor));			
			this.jMenuItemDuplicarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaDuplicarTipoProrrateoImpor && this.isPermisoDuplicarTipoProrrateoImpor));			
			this.jMenuItemCopiarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaCopiarTipoProrrateoImpor && this.isPermisoCopiarTipoProrrateoImpor));			
			this.jMenuItemVerFormTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaVerFormTipoProrrateoImpor && this.isPermisoVerFormTipoProrrateoImpor));			
			this.jMenuItemAbrirOrderByTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaOrdenTipoProrrateoImpor && this.isPermisoOrdenTipoProrrateoImpor));			
			//this.jMenuItemMostrarOcultarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaOrdenTipoProrrateoImpor && this.isPermisoOrdenTipoProrrateoImpor));
			this.jMenuItemDetalleAbrirOrderByTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaOrdenTipoProrrateoImpor && this.isPermisoOrdenTipoProrrateoImpor));			
			//this.jMenuItemDetalleMostrarOcultarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaOrdenTipoProrrateoImpor && this.isPermisoOrdenTipoProrrateoImpor));			
			this.jMenuItemNuevoRelacionesTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor && this.isPermisoNuevoTipoProrrateoImpor));			
			this.jMenuItemNuevoGuardarCambiosTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaNuevoTipoProrrateoImpor && this.isPermisoNuevoTipoProrrateoImpor && this.isPermisoGuardarCambiosTipoProrrateoImpor));									
			
			if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) {
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jMenuItemModificarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaModificarTipoProrrateoImpor && this.isPermisoActualizarTipoProrrateoImpor));	
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jMenuItemActualizarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaActualizarTipoProrrateoImpor && this.isPermisoActualizarTipoProrrateoImpor));	
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jMenuItemEliminarTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaEliminarTipoProrrateoImpor && this.isPermisoEliminarTipoProrrateoImpor));
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jMenuItemCancelarTipoProrrateoImpor.setVisible(this.isVisibilidadCeldaCancelarTipoProrrateoImpor);				
			}
			
			this.jMenuItemGuardarCambiosTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaGuardarTipoProrrateoImpor && this.isPermisoGuardarCambiosTipoProrrateoImpor));						
			this.jMenuItemGuardarCambiosTablaTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProrrateoImpor && this.isPermisoGuardarCambiosTipoProrrateoImpor));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoProrrateoImpor=this.jButtonNuevoTipoProrrateoImpor.isVisible();
			this.isVisibilidadCeldaDuplicarTipoProrrateoImpor=this.jButtonDuplicarTipoProrrateoImpor.isVisible();
			this.isVisibilidadCeldaCopiarTipoProrrateoImpor=this.jButtonCopiarTipoProrrateoImpor.isVisible();
			this.isVisibilidadCeldaVerFormTipoProrrateoImpor=this.jButtonVerFormTipoProrrateoImpor.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoProrrateoImpor=this.jButtonAbrirOrderByTipoProrrateoImpor.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor=this.jButtonNuevoRelacionesTipoProrrateoImpor.isVisible();
			this.isVisibilidadCeldaModificarTipoProrrateoImpor=this.jButtonModificarTipoProrrateoImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) {
			this.isVisibilidadCeldaActualizarTipoProrrateoImpor=this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonActualizarTipoProrrateoImpor.isVisible();
			this.isVisibilidadCeldaEliminarTipoProrrateoImpor=this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonEliminarTipoProrrateoImpor.isVisible();
			this.isVisibilidadCeldaCancelarTipoProrrateoImpor=this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonCancelarTipoProrrateoImpor.isVisible();
			this.isVisibilidadCeldaGuardarTipoProrrateoImpor=this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonGuardarCambiosTipoProrrateoImpor.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoProrrateoImpor=this.jButtonGuardarCambiosTablaTipoProrrateoImpor.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoProrrateoImpor=this.jButtonNuevoToolBarTipoProrrateoImpor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor=this.jButtonNuevoRelacionesToolBarTipoProrrateoImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) {
			this.isVisibilidadCeldaModificarTipoProrrateoImpor=this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonModificarToolBarTipoProrrateoImpor.isVisible();
			this.isVisibilidadCeldaActualizarTipoProrrateoImpor=this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonActualizarToolBarTipoProrrateoImpor.isVisible();
			this.isVisibilidadCeldaEliminarTipoProrrateoImpor=this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonEliminarToolBarTipoProrrateoImpor.isVisible();
			this.isVisibilidadCeldaCancelarTipoProrrateoImpor=this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonCancelarToolBarTipoProrrateoImpor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoProrrateoImpor=this.jButtonGuardarCambiosToolBarTipoProrrateoImpor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoProrrateoImpor=this.jButtonGuardarCambiosTablaToolBarTipoProrrateoImpor.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoProrrateoImpor=this.jMenuItemNuevoTipoProrrateoImpor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor=this.jMenuItemNuevoRelacionesTipoProrrateoImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) {
			this.isVisibilidadCeldaModificarTipoProrrateoImpor=this.jInternalFrameDetalleFormTipoProrrateoImpor.jMenuItemModificarTipoProrrateoImpor.isVisible();
			this.isVisibilidadCeldaActualizarTipoProrrateoImpor=this.jInternalFrameDetalleFormTipoProrrateoImpor.jMenuItemActualizarTipoProrrateoImpor.isVisible();
			this.isVisibilidadCeldaEliminarTipoProrrateoImpor=this.jInternalFrameDetalleFormTipoProrrateoImpor.jMenuItemEliminarTipoProrrateoImpor.isVisible();
			this.isVisibilidadCeldaCancelarTipoProrrateoImpor=this.jInternalFrameDetalleFormTipoProrrateoImpor.jMenuItemCancelarTipoProrrateoImpor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoProrrateoImpor=this.jMenuItemGuardarCambiosTipoProrrateoImpor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoProrrateoImpor=this.jMenuItemGuardarCambiosTablaTipoProrrateoImpor.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoProrrateoImpor(Boolean esInicializar) {
		if(TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoprorrateoimporSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoProrrateoImpor();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoProrrateoImpor(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoProrrateoImpor() {
		this.jButtonNuevoTipoProrrateoImpor.setVisible(this.isPermisoNuevoTipoProrrateoImpor);			
		this.jButtonDuplicarTipoProrrateoImpor.setVisible(this.isPermisoDuplicarTipoProrrateoImpor);			
		this.jButtonCopiarTipoProrrateoImpor.setVisible(this.isPermisoCopiarTipoProrrateoImpor);			
		this.jButtonVerFormTipoProrrateoImpor.setVisible(this.isPermisoVerFormTipoProrrateoImpor);			
		
		this.jButtonAbrirOrderByTipoProrrateoImpor.setVisible(this.isPermisoOrdenTipoProrrateoImpor);					
		
		this.jButtonNuevoRelacionesTipoProrrateoImpor.setVisible(this.isPermisoNuevoTipoProrrateoImpor);			
		
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonModificarTipoProrrateoImpor.setVisible(this.isPermisoActualizarTipoProrrateoImpor);	
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonActualizarTipoProrrateoImpor.setVisible(this.isPermisoActualizarTipoProrrateoImpor);	
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonEliminarTipoProrrateoImpor.setVisible(this.isPermisoEliminarTipoProrrateoImpor);
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonCancelarTipoProrrateoImpor.setVisible(this.isVisibilidadCeldaCancelarTipoProrrateoImpor);						
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonGuardarCambiosTipoProrrateoImpor.setVisible(this.isPermisoGuardarCambiosTipoProrrateoImpor);							
		}
		
		this.jButtonGuardarCambiosTablaTipoProrrateoImpor.setVisible(this.isPermisoActualizarTipoProrrateoImpor);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoProrrateoImpor() {
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonModificarTipoProrrateoImpor.setVisible(this.isPermisoActualizarTipoProrrateoImpor);	
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonActualizarTipoProrrateoImpor.setVisible(this.isPermisoActualizarTipoProrrateoImpor);	
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonEliminarTipoProrrateoImpor.setVisible(this.isPermisoEliminarTipoProrrateoImpor);
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonCancelarTipoProrrateoImpor.setVisible(this.isVisibilidadCeldaCancelarTipoProrrateoImpor);							
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonGuardarCambiosTipoProrrateoImpor.setVisible((this.isVisibilidadCeldaGuardarTipoProrrateoImpor && this.isPermisoGuardarCambiosTipoProrrateoImpor));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoProrrateoImpor() {
		if(TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoProrrateoImpor();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoProrrateoImpor() {
	}
	
	public void jTableDatosTipoProrrateoImporListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoProrrateoImpor(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoProrrateoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprorrateoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProrrateoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProrrateoImpor(this.gettipoprorrateoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProrrateoImpor(this.tipoprorrateoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprorrateoimpor==null) {
						this.tipoprorrateoimpor = new TipoProrrateoImpor();
					}

					this.setVariablesFormularioToObjetoActualTipoProrrateoImpor(this.tipoprorrateoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProrrateoImpor(this.tipoprorrateoimpor);
				}

				if(this.tipoprorrateoimpor.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoprorrateoimpor.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProrrateoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprorrateoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprorrateoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprorrateoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoProrrateoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprorrateoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProrrateoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProrrateoImpor(this.gettipoprorrateoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProrrateoImpor(this.tipoprorrateoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprorrateoimpor==null) {
						this.tipoprorrateoimpor = new TipoProrrateoImpor();
					}

					this.setVariablesFormularioToObjetoActualTipoProrrateoImpor(this.tipoprorrateoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProrrateoImpor(this.tipoprorrateoimpor);
				}

				if(this.tipoprorrateoimpor.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoprorrateoimpor.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProrrateoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprorrateoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprorrateoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprorrateoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoProrrateoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprorrateoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProrrateoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProrrateoImpor(this.gettipoprorrateoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProrrateoImpor(this.tipoprorrateoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprorrateoimpor==null) {
						this.tipoprorrateoimpor = new TipoProrrateoImpor();
					}

					this.setVariablesFormularioToObjetoActualTipoProrrateoImpor(this.tipoprorrateoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProrrateoImpor(this.tipoprorrateoimpor);
				}

				if(this.tipoprorrateoimpor.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoprorrateoimpor.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProrrateoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprorrateoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprorrateoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprorrateoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoProrrateoImpor() {
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) {
			this.jInternalFrameDetalleFormTipoProrrateoImpor.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoProrrateoImpor.dispose();
			this.jInternalFrameDetalleFormTipoProrrateoImpor=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoProrrateoImpor!=null) {
			this.jInternalFrameReporteDinamicoTipoProrrateoImpor.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoProrrateoImpor.dispose();
			this.jInternalFrameReporteDinamicoTipoProrrateoImpor=null;
		}
		
		if(this.jInternalFrameImportacionTipoProrrateoImpor!=null) {
			this.jInternalFrameImportacionTipoProrrateoImpor.setVisible(false);	    			
			this.jInternalFrameImportacionTipoProrrateoImpor.dispose();
			this.jInternalFrameImportacionTipoProrrateoImpor=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoProrrateoImpor();
			
			TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoProrrateoImpor")) {
				jButtonNuevoTipoProrrateoImporActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoProrrateoImpor")) {
				jButtonDuplicarTipoProrrateoImporActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoProrrateoImpor")) {
				jButtonCopiarTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoProrrateoImpor")) {
				jButtonVerFormTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoProrrateoImpor")) {
				jButtonNuevoTipoProrrateoImporActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoProrrateoImpor")) {
				jButtonDuplicarTipoProrrateoImporActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoProrrateoImpor")) {
				jButtonNuevoTipoProrrateoImporActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoProrrateoImpor")) {
				jButtonDuplicarTipoProrrateoImporActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoProrrateoImpor")) {
				jButtonNuevoTipoProrrateoImporActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoProrrateoImpor")) {
				jButtonNuevoTipoProrrateoImporActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoProrrateoImpor")) {
				jButtonNuevoTipoProrrateoImporActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoProrrateoImpor")) {
				jButtonModificarTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoProrrateoImpor")) {
				jButtonModificarTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoProrrateoImpor")) {
				jButtonModificarTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoProrrateoImpor")) {
				jButtonActualizarTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoProrrateoImpor")) {
				jButtonActualizarTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoProrrateoImpor")) {
				jButtonActualizarTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoProrrateoImpor")) {
				jButtonEliminarTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoProrrateoImpor")) {
				jButtonEliminarTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoProrrateoImpor")) {
				jButtonEliminarTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoProrrateoImpor")) {
				jButtonCancelarTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoProrrateoImpor")) {
				jButtonCancelarTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoProrrateoImpor")) {
				jButtonCancelarTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoProrrateoImpor")) {
				jButtonCerrarTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoProrrateoImpor")) {
				jButtonCerrarTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoProrrateoImpor")) {
				jButtonCerrarTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoProrrateoImpor")) {
				jButtonMostrarOcultarTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoProrrateoImpor")) {
				jButtonCancelarTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoProrrateoImpor")) {
				jButtonGuardarCambiosTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoProrrateoImpor")) {
				jButtonGuardarCambiosTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoProrrateoImpor")) {
				jButtonCopiarTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoProrrateoImpor")) {
				jButtonVerFormTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoProrrateoImpor")) {
				jButtonGuardarCambiosTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoProrrateoImpor")) {
				jButtonCopiarTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoProrrateoImpor")) {
				jButtonVerFormTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoProrrateoImpor")) {
				jButtonGuardarCambiosTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoProrrateoImpor")) {
				jButtonGuardarCambiosTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoProrrateoImpor")) {
				jButtonGuardarCambiosTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoProrrateoImpor")) {
				jButtonRecargarInformacionTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoProrrateoImpor")) {
				jButtonRecargarInformacionTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoProrrateoImpor")) {
				jButtonRecargarInformacionTipoProrrateoImporActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoProrrateoImpor")) {
				jButtonAnterioresTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoProrrateoImpor")) {
				jButtonAnterioresTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoProrrateoImpor")) {
				jButtonAnterioresTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoProrrateoImpor")) {
				jButtonSiguientesTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoProrrateoImpor")) {
				jButtonSiguientesTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoProrrateoImpor")) {
				jButtonSiguientesTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoProrrateoImpor") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoProrrateoImpor")) {
				jButtonAbrirOrderByTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoProrrateoImpor") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoProrrateoImpor")) {
				jButtonMostrarOcultarTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoProrrateoImpor")) {
				jButtonNuevoGuardarCambiosTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoProrrateoImpor")) {
				jButtonNuevoGuardarCambiosTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoProrrateoImpor")) {
				jButtonNuevoGuardarCambiosTipoProrrateoImporActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoProrrateoImpor")) {
				jButtonCerrarReporteDinamicoTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoProrrateoImpor")) {
				jButtonGenerarReporteDinamicoTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoProrrateoImpor")) {
				
				jButtonGenerarExcelReporteDinamicoTipoProrrateoImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoProrrateoImpor")) {
				jButtonCerrarImportacionTipoProrrateoImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoProrrateoImpor")) {
				
				jButtonGenerarImportacionTipoProrrateoImporActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoProrrateoImpor")) {
				
				jButtonAbrirImportacionTipoProrrateoImporActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoProrrateoImpor")) {
				jComboBoxTiposAccionesTipoProrrateoImporActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoProrrateoImpor")) {
				jComboBoxTiposRelacionesTipoProrrateoImporActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoProrrateoImpor")) {
				jComboBoxTiposAccionesTipoProrrateoImporActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoProrrateoImpor")) {
				
				jComboBoxTiposSeleccionarTipoProrrateoImporActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoProrrateoImpor")) {
				jTextFieldValorCampoGeneralTipoProrrateoImporActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoProrrateoImpor")) {
				jButtonAbrirOrderByTipoProrrateoImporActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoProrrateoImpor")) {
				jButtonAbrirOrderByTipoProrrateoImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoProrrateoImpor")) {
				jButtonCerrarOrderByTipoProrrateoImporActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoProrrateoImporBusqueda")) {
				this.jButtonidTipoProrrateoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoProrrateoImporBusqueda")) {
				this.jButtoncodigoTipoProrrateoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoProrrateoImporBusqueda")) {
				this.jButtonnombreTipoProrrateoImporBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoProrrateoImpor();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProrrateoImporActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprorrateoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprorrateoimpor);
				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
				
				


				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProrrateoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProrrateoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoProrrateoImpor tipoprorrateoimporLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoprorrateoimporLocal=this.tipoprorrateoimpor;
			} else {
				tipoprorrateoimporLocal=this.tipoprorrateoimporAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprorrateoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprorrateoimpor);
				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
							
				
				


				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProrrateoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProrrateoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProrrateoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProrrateoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprorrateoimporAnterior =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprorrateoimporAnterior =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
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
			
			TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
			
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
			
			


			
			TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProrrateoImporActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprorrateoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprorrateoimpor);
				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
								
						
				


				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProrrateoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProrrateoImpor.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprorrateoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprorrateoimpor);
				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
								
				
				


				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProrrateoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProrrateoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProrrateoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProrrateoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprorrateoimporAnterior =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprorrateoimporAnterior =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprorrateoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprorrateoimpor);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProrrateoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProrrateoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprorrateoimporAnterior =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprorrateoimporAnterior =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProrrateoImporActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprorrateoimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprorrateoimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprorrateoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprorrateoimpor);
				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
							
				
				


				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProrrateoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProrrateoImpor.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProrrateoImporActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoProrrateoImpor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprorrateoimporAnterior =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoprorrateoimporAnterior =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
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
			
			TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
			
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
			
			


			
			TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProrrateoImporActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprorrateoimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprorrateoimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprorrateoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprorrateoimpor);
				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
								
				
				


				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProrrateoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProrrateoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProrrateoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProrrateoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprorrateoimporAnterior =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprorrateoimporAnterior =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProrrateoImporActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprorrateoimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprorrateoimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProrrateoImporActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprorrateoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprorrateoimpor);
				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoProrrateoImpor")) {
					jCheckBoxSeleccionarTodosTipoProrrateoImporItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoProrrateoImpor")) {
					jCheckBoxSeleccionadosTipoProrrateoImporItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoProrrateoImpor")) {
					
				}
				
				


				
				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProrrateoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProrrateoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprorrateoimpor);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoprorrateoimpor);
				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
												
				
				


				
				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProrrateoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProrrateoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProrrateoImporActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoProrrateoImpor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprorrateoimporAnterior =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoprorrateoimporAnterior =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProrrateoImporActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprorrateoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprorrateoimpor);
				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
				
				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
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
			
			TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
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
			
			


			
			TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProrrateoImporActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprorrateoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprorrateoimpor);
				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProrrateoImpor.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProrrateoImpor.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprorrateoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprorrateoimpor);
				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
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
				
				


				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProrrateoImpor.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProrrateoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProrrateoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProrrateoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprorrateoimporAnterior =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprorrateoimporAnterior =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoProrrateoImpor")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoProrrateoImporListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoProrrateoImpor.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoprorrateoimpor =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoprorrateoimpor);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoProrrateoImpor")) {
				
				}
				
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoProrrateoImpor")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoProrrateoImpor.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoProrrateoImpor")) {
			
			}
			
			TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoProrrateoImpor();
			
			TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
			
			if(sTipo.equals("NuevoTipoProrrateoImpor")) {
				jButtonNuevoTipoProrrateoImporActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoProrrateoImpor")) {
				jButtonDuplicarTipoProrrateoImporActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoProrrateoImpor")) {
				jButtonCopiarTipoProrrateoImporActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoProrrateoImpor")) {
				jButtonVerFormTipoProrrateoImporActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoProrrateoImpor")) {
				jButtonNuevoTipoProrrateoImporActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoProrrateoImpor")) {
				jButtonModificarTipoProrrateoImporActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoProrrateoImpor")) {
				jButtonActualizarTipoProrrateoImporActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoProrrateoImpor")) {
				jButtonEliminarTipoProrrateoImporActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoProrrateoImpor")) {
				jButtonGuardarCambiosTipoProrrateoImporActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoProrrateoImpor")) {
				jButtonCancelarTipoProrrateoImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoProrrateoImpor")) {
				jButtonCerrarTipoProrrateoImporActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoProrrateoImpor")) {
				jButtonGuardarCambiosTipoProrrateoImporActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoProrrateoImpor")) {
				jButtonNuevoGuardarCambiosTipoProrrateoImporActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoProrrateoImpor")) {
				jButtonAbrirOrderByTipoProrrateoImporActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoProrrateoImpor")) {
				jButtonRecargarInformacionTipoProrrateoImporActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoProrrateoImpor")) {
				jButtonAnterioresTipoProrrateoImporActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoProrrateoImpor")) {
				jButtonSiguientesTipoProrrateoImporActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoProrrateoImporBusqueda")) {
				this.jButtonidTipoProrrateoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoProrrateoImporBusqueda")) {
				this.jButtoncodigoTipoProrrateoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoProrrateoImporBusqueda")) {
				this.jButtonnombreTipoProrrateoImporBusquedaActionPerformed(evt);
			}
			
			TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoProrrateoImpor();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoProrrateoImpor")) {
				closingInternalFrameTipoProrrateoImpor();
				
			} else if(sTipo.equals("jButtonCancelarTipoProrrateoImpor")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoProrrateoImpor = (JInternalFrameBase)evt.getSource();
	            	
	            TipoProrrateoImporBeanSwingJInternalFrame jInternalFrameParent=(TipoProrrateoImporBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoProrrateoImpor.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoProrrateoImporActionPerformed(null);
			}
			
			TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoprorrateoimpor,new Object(),this.tipoprorrateoimporParameterGeneral,this.tipoprorrateoimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoProrrateoImpor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoProrrateoImpor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoProrrateoImpor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoprorrateoimpor)) {
			if(!esControlTabla) {
				if(TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoProrrateoImpor(this.tipoprorrateoimpor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProrrateoImpor(this.tipoprorrateoimpor);			
				}
				
				if(this.tipoprorrateoimporSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoProrrateoImpor(this.tipoprorrateoimpor,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoprorrateoimporReturnGeneral=tipoprorrateoimporLogic.procesarEventosTipoProrrateoImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprorrateoimporLogic.getTipoProrrateoImpors(),this.tipoprorrateoimpor,this.tipoprorrateoimporParameterGeneral,this.isEsNuevoTipoProrrateoImpor,classes);//this.tipoprorrateoimporLogic.getTipoProrrateoImpor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoProrrateoImpor(this.tipoprorrateoimporReturnGeneral,this.tipoprorrateoimporBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoprorrateoimporSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoProrrateoImpor(classes,this.tipoprorrateoimporReturnGeneral,this.tipoprorrateoimporBean,false);
					}
						
					if(this.tipoprorrateoimporReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoProrrateoImpor(this.tipoprorrateoimporReturnGeneral.getTipoProrrateoImpor());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoProrrateoImpor(this.tipoprorrateoimporReturnGeneral.getTipoProrrateoImpor());	
					}
						
					if(this.tipoprorrateoimporReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoProrrateoImpor(this.tipoprorrateoimporReturnGeneral.getTipoProrrateoImpor(),classes);//this.tipoprorrateoimporBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoProrrateoImpor(this.tipoprorrateoimpor,classes);//this.tipoprorrateoimporBean);									
				}
			
				if(TipoProrrateoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoProrrateoImpor(this.tipoprorrateoimpor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProrrateoImpor(this.tipoprorrateoimpor);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoprorrateoimporAnterior!=null) {
						this.tipoprorrateoimpor=this.tipoprorrateoimporAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoprorrateoimporReturnGeneral=tipoprorrateoimporLogic.procesarEventosTipoProrrateoImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprorrateoimporLogic.getTipoProrrateoImpors(),this.tipoprorrateoimpor,this.tipoprorrateoimporParameterGeneral,this.isEsNuevoTipoProrrateoImpor,classes);//this.tipoprorrateoimporLogic.getTipoProrrateoImpor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoprorrateoimporSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoprorrateoimporReturnGeneral.getTipoProrrateoImpor(),tipoprorrateoimporLogic.getTipoProrrateoImpors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoprorrateoimporReturnGeneral.getTipoProrrateoImpor(),this.tipoprorrateoimpors);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoProrrateoImpor.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoProrrateoImpor.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoProrrateoImpor();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoProrrateoImpor() throws Exception {
		
		TipoProrrateoImporModel tipoprorrateoimporModel=(TipoProrrateoImporModel)this.jTableDatosTipoProrrateoImpor.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprorrateoimporModel.tipoprorrateoimpors=this.tipoprorrateoimporLogic.getTipoProrrateoImpors();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoprorrateoimporModel.tipoprorrateoimpors=this.tipoprorrateoimpors;
		}
		
		
		((TipoProrrateoImporModel) this.jTableDatosTipoProrrateoImpor.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoProrrateoImpor() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoprorrateoimporAnterior(),this.tipoprorrateoimporLogic.getTipoProrrateoImpors());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoprorrateoimporAnterior(),this.tipoprorrateoimpors);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoProrrateoImpor();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoProrrateoImpor(TipoProrrateoImpor tipoprorrateoimpor,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
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
										
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprorrateoimpor,new Object(),generalEntityParameterGeneral,this.tipoprorrateoimporReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoprorrateoimporSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoProrrateoImporConstantesFunciones.getClassesRelationshipsOfTipoProrrateoImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoProrrateoImporConstantesFunciones.getClassesRelationshipsFromStringsOfTipoProrrateoImpor(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoProrrateoImpor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoProrrateoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprorrateoimpor,new Object(),generalEntityParameterGeneral,this.tipoprorrateoimporReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoProrrateoImpor(TipoProrrateoImporBean tipoprorrateoimporBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoProrrateoImpor(ArrayList<Classe> classes,TipoProrrateoImporReturnGeneral tipoprorrateoimporReturnGeneral,TipoProrrateoImporBean tipoprorrateoimporBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoProrrateoImpor(TipoProrrateoImpor tipoprorrateoimpor,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoprorrateoimpor)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoProrrateoImpor = new TipoProrrateoImporDetalleFormJInternalFrame(jDesktopPane,this.tipoprorrateoimporSessionBean.getConGuardarRelaciones(),this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoProrrateoImpor);
		this.jInternalFrameDetalleFormTipoProrrateoImpor.setVisible(false);
		this.jInternalFrameDetalleFormTipoProrrateoImpor.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoProrrateoImpor.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoProrrateoImpor.tipoprorrateoimporLogic=this.tipoprorrateoimporLogic;
		
		this.cargarCombosFrameForeignKeyTipoProrrateoImpor("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoProrrateoImpor();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoProrrateoImpor();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoProrrateoImpor("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoProrrateoImpor();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoProrrateoImpor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoProrrateoImpor"));
		
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonModificarTipoProrrateoImpor.addActionListener(new ButtonActionListener(this,"ModificarTipoProrrateoImpor"));

		
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonModificarToolBarTipoProrrateoImpor.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoProrrateoImpor"));
					
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jMenuItemModificarTipoProrrateoImpor.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoProrrateoImpor"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonActualizarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"ActualizarTipoProrrateoImpor"));
		
		
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonActualizarToolBarTipoProrrateoImpor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoProrrateoImpor"));
						
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jMenuItemActualizarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoProrrateoImpor"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonEliminarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"EliminarTipoProrrateoImpor"));
		
		
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonEliminarToolBarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoProrrateoImpor"));
								
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jMenuItemEliminarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoProrrateoImpor"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonCancelarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"CancelarTipoProrrateoImpor"));
		
		
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonCancelarToolBarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoProrrateoImpor"));
					
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jMenuItemCancelarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoProrrateoImpor"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jMenuItemDetalleCerrarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoProrrateoImpor"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonGuardarCambiosToolBarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProrrateoImpor"));
		
		
		
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonGuardarCambiosToolBarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProrrateoImpor"));
		
		
		
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jComboBoxTiposAccionesFormularioTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoProrrateoImpor"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonidTipoProrrateoImporBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProrrateoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtoncodigoTipoProrrateoImporBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoProrrateoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonnombreTipoProrrateoImporBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProrrateoImporBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jTabbedPaneRelacionesTipoProrrateoImpor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoProrrateoImpor"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoProrrateoImpor"));
		
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProrrateoImpor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoProrrateoImpor"));
		}
		
		this.jTableDatosTipoProrrateoImpor.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoProrrateoImpor"));
		
		this.jTableDatosTipoProrrateoImpor.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoProrrateoImpor"));
		
		this.jButtonNuevoTipoProrrateoImpor.addActionListener(new ButtonActionListener(this,"NuevoTipoProrrateoImpor"));
		
		this.jButtonDuplicarTipoProrrateoImpor.addActionListener(new ButtonActionListener(this,"DuplicarTipoProrrateoImpor"));
		
		this.jButtonCopiarTipoProrrateoImpor.addActionListener(new ButtonActionListener(this,"CopiarTipoProrrateoImpor"));
		
		this.jButtonVerFormTipoProrrateoImpor.addActionListener(new ButtonActionListener(this,"VerFormTipoProrrateoImpor"));
		
		
		this.jButtonNuevoToolBarTipoProrrateoImpor.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoProrrateoImpor"));
			
		this.jButtonDuplicarToolBarTipoProrrateoImpor.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoProrrateoImpor"));
			
		this.jMenuItemNuevoTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoProrrateoImpor"));
			
		this.jMenuItemDuplicarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoProrrateoImpor"));		
		
		
		this.jButtonNuevoRelacionesTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoProrrateoImpor"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoProrrateoImpor.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoProrrateoImpor"));
			
		this.jMenuItemNuevoRelacionesTipoProrrateoImpor.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoProrrateoImpor"));		
		
		
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonModificarTipoProrrateoImpor.addActionListener(new ButtonActionListener(this,"ModificarTipoProrrateoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonModificarToolBarTipoProrrateoImpor.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoProrrateoImpor"));
			
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jMenuItemModificarTipoProrrateoImpor.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoProrrateoImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonActualizarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"ActualizarTipoProrrateoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonActualizarToolBarTipoProrrateoImpor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoProrrateoImpor"));
				
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jMenuItemActualizarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoProrrateoImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonEliminarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"EliminarTipoProrrateoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonEliminarToolBarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoProrrateoImpor"));
						
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jMenuItemEliminarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoProrrateoImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonCancelarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"CancelarTipoProrrateoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonCancelarToolBarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoProrrateoImpor"));
			
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jMenuItemCancelarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoProrrateoImpor"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoProrrateoImpor"));		
		
		
		this.jButtonCerrarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"CerrarTipoProrrateoImpor"));
		
		
		this.jButtonCerrarToolBarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoProrrateoImpor"));
			
		this.jMenuItemCerrarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoProrrateoImpor"));
			
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jMenuItemDetalleCerrarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoProrrateoImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonGuardarCambiosTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoProrrateoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonGuardarCambiosToolBarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProrrateoImpor"));
		}
		
		this.jButtonCopiarToolBarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoProrrateoImpor"));
			
		this.jButtonVerFormToolBarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoProrrateoImpor"));
		
		this.jMenuItemGuardarCambiosTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoProrrateoImpor"));
			
		this.jMenuItemCopiarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoProrrateoImpor"));		
		
		this.jMenuItemVerFormTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoProrrateoImpor"));		
		
		
		this.jButtonGuardarCambiosTablaTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoProrrateoImpor"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoProrrateoImpor"));
			
		this.jMenuItemGuardarCambiosTablaTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoProrrateoImpor"));		
		
		
		
		this.jButtonRecargarInformacionTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoProrrateoImpor"));
					
		this.jButtonRecargarInformacionToolBarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoProrrateoImpor"));
		
		this.jMenuItemRecargarInformacionTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoProrrateoImpor"));		
		
		
		
		this.jButtonAnterioresTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"AnterioresTipoProrrateoImpor"));
		
		
		this.jButtonAnterioresToolBarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoProrrateoImpor"));
		
		this.jMenuItemAnterioresTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoProrrateoImpor"));		
		
		
		this.jButtonSiguientesTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"SiguientesTipoProrrateoImpor"));
		
		
		this.jButtonSiguientesToolBarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoProrrateoImpor"));
			
		this.jMenuItemSiguientesTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoProrrateoImpor"));
			
		this.jMenuItemAbrirOrderByTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoProrrateoImpor"));
			
		this.jMenuItemMostrarOcultarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoProrrateoImpor"));
			
		this.jMenuItemDetalleAbrirOrderByTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoProrrateoImpor"));
			
		this.jMenuItemDetalleMostarOcultarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoProrrateoImpor"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoProrrateoImpor"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoProrrateoImpor"));
			
		this.jMenuItemNuevoGuardarCambiosTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoProrrateoImpor"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoProrrateoImpor.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoProrrateoImpor"));

		this.jCheckBoxSeleccionadosTipoProrrateoImpor.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoProrrateoImpor"));
		
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jComboBoxTiposAccionesFormularioTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoProrrateoImpor"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoProrrateoImpor"));
			
		this.jComboBoxTiposAccionesTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoProrrateoImpor"));
					
		this.jComboBoxTiposSeleccionarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoProrrateoImpor"));
			
		this.jTextFieldValorCampoGeneralTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoProrrateoImpor"));		
		
		
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonidTipoProrrateoImporBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProrrateoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtoncodigoTipoProrrateoImporBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoProrrateoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonnombreTipoProrrateoImporBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProrrateoImporBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoProrrateoImpor!=null) {
				this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProrrateoImpor"));
				this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProrrateoImpor"));
				this.jInternalFrameReporteDinamicoTipoProrrateoImpor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProrrateoImpor"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProrrateoImpor"));				
			//this.jButtonGenerarReporteDinamicoTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProrrateoImpor"));
			//this.jButtonGenerarExcelReporteDinamicoTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProrrateoImpor"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoProrrateoImpor!=null) {
				this.jInternalFrameImportacionTipoProrrateoImpor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoProrrateoImpor"));
				this.jInternalFrameImportacionTipoProrrateoImpor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoProrrateoImpor"));
				this.jInternalFrameImportacionTipoProrrateoImpor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoProrrateoImpor"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoProrrateoImpor"));
			
			this.jButtonAbrirOrderByToolBarTipoProrrateoImpor.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoProrrateoImpor"));			
			
			if(this.jInternalFrameOrderByTipoProrrateoImpor!=null) {
				this.jInternalFrameOrderByTipoProrrateoImpor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoProrrateoImpor"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProrrateoImpor.jTabbedPaneRelacionesTipoProrrateoImpor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoProrrateoImpor"));
		
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
            		closingInternalFrameTipoProrrateoImpor();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoProrrateoImpor.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoProrrateoImpor = (JInternalFrameBase)event.getSource();
	            	
	            TipoProrrateoImporBeanSwingJInternalFrame jInternalFrameParent=(TipoProrrateoImporBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoProrrateoImpor.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoProrrateoImporActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoProrrateoImpor.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoProrrateoImporListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoProrrateoImpor.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoProrrateoImpor.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProrrateoImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProrrateoImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProrrateoImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoProrrateoImpor";
		inputMap = this.jButtonNuevoTipoProrrateoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoProrrateoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoProrrateoImporActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProrrateoImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProrrateoImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProrrateoImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoProrrateoImpor";
		inputMap = this.jButtonNuevoRelacionesTipoProrrateoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoProrrateoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoProrrateoImporActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoProrrateoImpor";
		inputMap = this.jButtonModificarTipoProrrateoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoProrrateoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoProrrateoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoProrrateoImpor";
		inputMap = this.jButtonActualizarTipoProrrateoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoProrrateoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoProrrateoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoProrrateoImpor";
		inputMap = this.jButtonEliminarTipoProrrateoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoProrrateoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoProrrateoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoProrrateoImpor";
		inputMap = this.jButtonCancelarTipoProrrateoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoProrrateoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoProrrateoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoProrrateoImpor";
		inputMap = this.jButtonCerrarTipoProrrateoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoProrrateoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoProrrateoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonGuardarCambiosTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoProrrateoImpor";
		inputMap = this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonGuardarCambiosTipoProrrateoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonGuardarCambiosTipoProrrateoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoProrrateoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoProrrateoImpor.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoProrrateoImporItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoProrrateoImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoProrrateoImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoProrrateoImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoProrrateoImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoProrrateoImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoProrrateoImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonidTipoProrrateoImporBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProrrateoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtoncodigoTipoProrrateoImporBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoProrrateoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jButtonnombreTipoProrrateoImporBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProrrateoImporBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoProrrateoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoProrrateoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoProrrateoImporActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoProrrateoImpor.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoProrrateoImpor(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoProrrateoImpor tipoprorrateoimporAux:this.tipoprorrateoimporLogic.getTipoProrrateoImpors()) {
					tipoprorrateoimporAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProrrateoImpor tipoprorrateoimporAux:tipoprorrateoimpors) {
					tipoprorrateoimporAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoProrrateoImporItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoProrrateoImpor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoProrrateoImpor tipoprorrateoimporAux:this.tipoprorrateoimporLogic.getTipoProrrateoImpors()) {
						tipoprorrateoimporAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProrrateoImpor tipoprorrateoimporAux:tipoprorrateoimpors) {
						tipoprorrateoimporAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoProrrateoImpor tipoprorrateoimporAux:this.tipoprorrateoimporLogic.getTipoProrrateoImpors()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProrrateoImpor tipoprorrateoimporAux:tipoprorrateoimpors) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoProrrateoImpor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoProrrateoImpor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoProrrateoImpor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoProrrateoImpor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoProrrateoImporItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoProrrateoImpor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoProrrateoImpor.getSelectedRows();
			
			TipoProrrateoImpor tipoprorrateoimporLocal=new TipoProrrateoImpor();
			
			//this.seleccionarTodosTipoProrrateoImpor(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprorrateoimporLocal =(TipoProrrateoImpor) this.tipoprorrateoimporLogic.getTipoProrrateoImpors().toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoprorrateoimporLocal =(TipoProrrateoImpor) this.tipoprorrateoimpors.toArray()[this.jTableDatosTipoProrrateoImpor.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoprorrateoimporLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoProrrateoImpor tipoprorrateoimporAux:this.tipoprorrateoimporLogic.getTipoProrrateoImpors()) {
						tipoprorrateoimporAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProrrateoImpor tipoprorrateoimporAux:tipoprorrateoimpors) {
						tipoprorrateoimporAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoProrrateoImpor(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoProrrateoImpor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoProrrateoImpor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoProrrateoImpor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoProrrateoImporItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoProrrateoImporParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoProrrateoImporActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoProrrateoImpor(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoProrrateoImpor.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoProrrateoImpor tipoprorrateoimporAux:this.tipoprorrateoimporLogic.getTipoProrrateoImpors()) {
				
						if(sTipoSeleccionar.equals(TipoProrrateoImporConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoprorrateoimporAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoProrrateoImporConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoprorrateoimporAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProrrateoImpor tipoprorrateoimporAux:tipoprorrateoimpors) {
					
						if(sTipoSeleccionar.equals(TipoProrrateoImporConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoprorrateoimporAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoProrrateoImporConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoprorrateoimporAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoProrrateoImpor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoProrrateoImporActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoProrrateoImpor(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoProrrateoImpor=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoProrrateoImpor.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoProrrateoImpor.jComboBoxTiposAccionesFormularioTipoProrrateoImpor.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoProrrateoImpor) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoProrrateoImpor(conSplash);
				
					this.generarReporteTipoProrrateoImporsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProrrateoImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProrrateoImpor.jComboBoxTiposAccionesFormularioTipoProrrateoImpor.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoProrrateoImporsSeleccionados();
				//this.jComboBoxTiposAccionesTipoProrrateoImpor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoProrrateoImporsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoProrrateoImpor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoProrrateoImporsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoProrrateoImpor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoProrrateoImpor();
				
				this.exportarTipoProrrateoImporsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProrrateoImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProrrateoImpor.jComboBoxTiposAccionesFormularioTipoProrrateoImpor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoProrrateoImpors();
				//this.importarTipoProrrateoImpors();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProrrateoImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProrrateoImpor.jComboBoxTiposAccionesFormularioTipoProrrateoImpor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoProrrateoImpor();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoProrrateoImporsSeleccionados();
				//this.jComboBoxTiposAccionesTipoProrrateoImpor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Prorrateo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoProrrateoImpor();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoProrrateoImpor)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoProrrateoImpor(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Prorrateo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProrrateoImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProrrateoImpor.jComboBoxTiposAccionesFormularioTipoProrrateoImpor.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoProrrateoImpor();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoProrrateoImpor(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoProrrateoImporActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoProrrateoImpor();
			
			if(this.jInternalFrameDetalleFormTipoProrrateoImpor==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoProrrateoImpor> tipoprorrateoimporsSeleccionados=new ArrayList<TipoProrrateoImpor>();		
			TipoProrrateoImpor tipoprorrateoimpor=new TipoProrrateoImpor();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoProrrateoImpor(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoProrrateoImpor.getSelectedItem();
			
			
			
			
			tipoprorrateoimporsSeleccionados=this.getTipoProrrateoImporsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoprorrateoimporsSeleccionados.size()==1) {
				for(TipoProrrateoImpor tipoprorrateoimporAux:tipoprorrateoimporsSeleccionados) {
					tipoprorrateoimpor=tipoprorrateoimporAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoProrrateoImpor();
			
      		//this.finishProcessTipoProrrateoImpor(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoProrrateoImporReturnGeneral() throws Exception {
		if(this.tipoprorrateoimporReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoprorrateoimporReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoprorrateoimporReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoprorrateoimporReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoprorrateoimporReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoprorrateoimporReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoProrrateoImpor(false);
		}
		
		if(this.tipoprorrateoimporReturnGeneral.getConRetornoLista() || this.tipoprorrateoimporReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoprorrateoimporReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoprorrateoimporLogic.setTipoProrrateoImpors(this.tipoprorrateoimporReturnGeneral.getTipoProrrateoImpors());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoprorrateoimporReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoprorrateoimporLogic.setTipoProrrateoImpor(this.tipoprorrateoimporReturnGeneral.getTipoProrrateoImpor());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoProrrateoImpor(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoProrrateoImpor() throws Exception {
		
		
	}
	
	public ArrayList<TipoProrrateoImpor> getTipoProrrateoImporsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoProrrateoImpor> tipoprorrateoimporsSeleccionados=new ArrayList<TipoProrrateoImpor>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoProrrateoImpor) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoProrrateoImpor tipoprorrateoimporAux:tipoprorrateoimporLogic.getTipoProrrateoImpors()) {
					if(tipoprorrateoimporAux.getIsSelected()) {
						tipoprorrateoimporsSeleccionados.add(tipoprorrateoimporAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProrrateoImpor tipoprorrateoimporAux:this.tipoprorrateoimpors) {
					if(tipoprorrateoimporAux.getIsSelected()) {
						tipoprorrateoimporsSeleccionados.add(tipoprorrateoimporAux);				
					}
				}
			}
			
			if(tipoprorrateoimporsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoprorrateoimporsSeleccionados.addAll(this.tipoprorrateoimporLogic.getTipoProrrateoImpors());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoprorrateoimporsSeleccionados.addAll(this.tipoprorrateoimpors);				
					}
				}
			}
		} else {
			tipoprorrateoimporsSeleccionados.add(this.tipoprorrateoimpor);
		}
		
		return tipoprorrateoimporsSeleccionados;
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
	
	public void generarReporteTipoProrrateoImporsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoProrrateoImporsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoProrrateoImporsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoProrrateoImporsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoProrrateoImporsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Prorrateo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoProrrateoImporsSeleccionados() throws Exception {
		ArrayList<TipoProrrateoImpor> tipoprorrateoimporsSeleccionados=new ArrayList<TipoProrrateoImpor>();		
		
		tipoprorrateoimporsSeleccionados=this.getTipoProrrateoImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoProrrateoImpors("Todos",tipoprorrateoimporsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoProrrateoImporsSeleccionados() throws Exception {
		ArrayList<TipoProrrateoImpor> tipoprorrateoimporsSeleccionados=new ArrayList<TipoProrrateoImpor>();		
		
		tipoprorrateoimporsSeleccionados=this.getTipoProrrateoImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoProrrateoImpors("Todos",tipoprorrateoimporsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoProrrateoImporsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoProrrateoImpor> tipoprorrateoimporsSeleccionados=new ArrayList<TipoProrrateoImpor>();
		
		tipoprorrateoimporsSeleccionados=this.getTipoProrrateoImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoProrrateoImpors("Todos",tipoprorrateoimporsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoProrrateoImporsSeleccionados() throws Exception {
		ArrayList<TipoProrrateoImpor> tipoprorrateoimporsSeleccionados=new ArrayList<TipoProrrateoImpor>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoProrrateoImpor();
		
		
		tipoprorrateoimporsSeleccionados=this.getTipoProrrateoImporsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoProrrateoImpor();
		
		
		//this.generarReporteTipoProrrateoImpors("Todos",tipoprorrateoimporsSeleccionados ,tipoprorrateoimporImplementable,tipoprorrateoimporImplementableHome);
	}
	
	public void mostrarImportacionTipoProrrateoImpors() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoProrrateoImpor();
		
		this.abrirFrameImportacionTipoProrrateoImpor();		
		
			
		//this.generarReporteTipoProrrateoImpors("Todos",tipoprorrateoimporsSeleccionados ,tipoprorrateoimporImplementable,tipoprorrateoimporImplementableHome);
	}
	
	public void importarTipoProrrateoImpors() throws Exception {		
	
	}
	
	public void exportarTipoProrrateoImporsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoProrrateoImporsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoProrrateoImporsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoProrrateoImporsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Prorrateo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoProrrateoImporsSeleccionados() throws Exception {
		ArrayList<TipoProrrateoImpor> tipoprorrateoimporsSeleccionados=new ArrayList<TipoProrrateoImpor>();		
		
		tipoprorrateoimporsSeleccionados=this.getTipoProrrateoImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprorrateoimpor."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoProrrateoImpor(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoProrrateoImpor tipoprorrateoimporAux:tipoprorrateoimporsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoProrrateoImpor(tipoprorrateoimporAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoprorrateoimporAux.setsDetalleGeneralEntityReporte(tipoprorrateoimporAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prorrateo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoProrrateoImpor(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoProrrateoImporConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProrrateoImporConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProrrateoImporConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProrrateoImporConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoProrrateoImpor(TipoProrrateoImpor tipoprorrateoimpor,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoprorrateoimpor.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprorrateoimpor.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprorrateoimpor.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprorrateoimpor.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoProrrateoImporsSeleccionados() throws Exception {
		ArrayList<TipoProrrateoImpor> tipoprorrateoimporsSeleccionados=new ArrayList<TipoProrrateoImpor>();		
		
		tipoprorrateoimporsSeleccionados=this.getTipoProrrateoImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprorrateoimpor.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoProrrateoImpors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoProrrateoImpor(row);				
				iRow++;
			}				
			
			for(TipoProrrateoImpor tipoprorrateoimporAux:tipoprorrateoimporsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoProrrateoImpor(tipoprorrateoimporAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prorrateo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoProrrateoImporsSeleccionados() throws Exception {
		ArrayList<TipoProrrateoImpor> tipoprorrateoimporsSeleccionados=new ArrayList<TipoProrrateoImpor>();		
		
		tipoprorrateoimporsSeleccionados=this.getTipoProrrateoImporsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprorrateoimpor.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoprorrateoimpors");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoprorrateoimpor");
			//elementRoot.appendChild(element);
		
			for(TipoProrrateoImpor tipoprorrateoimporAux:tipoprorrateoimporsSeleccionados) {
				element = document.createElement("tipoprorrateoimpor");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoProrrateoImpor(tipoprorrateoimporAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prorrateo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoProrrateoImpor(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProrrateoImporConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProrrateoImporConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoProrrateoImporConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProrrateoImporConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoProrrateoImpor(TipoProrrateoImpor tipoprorrateoimpor,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprorrateoimpor.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprorrateoimpor.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprorrateoimpor.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoProrrateoImpor(TipoProrrateoImpor tipoprorrateoimpor,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoProrrateoImporConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoprorrateoimpor.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoProrrateoImporConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoprorrateoimpor.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoProrrateoImporConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoprorrateoimpor.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoProrrateoImporConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoprorrateoimpor.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoProrrateoImporsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoProrrateoImpor> tipoprorrateoimporsSeleccionados=new ArrayList<TipoProrrateoImpor>();
		
		tipoprorrateoimporsSeleccionados=this.getTipoProrrateoImporsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoProrrateoImpor(tipoprorrateoimporsSeleccionados);
		
		this.generarReporteTipoProrrateoImpors("Todos",tipoprorrateoimporsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoProrrateoImpor(ArrayList<TipoProrrateoImpor> tipoprorrateoimporsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoProrrateoImpor tipoprorrateoimporAux:tipoprorrateoimporsSeleccionados) {
				tipoprorrateoimporAux.setsDetalleGeneralEntityReporte(tipoprorrateoimporAux.toString());
			
				if(sTipoSeleccionar.equals(TipoProrrateoImporConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoprorrateoimporAux.setsDescripcionGeneralEntityReporte1(tipoprorrateoimporAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoProrrateoImporConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoprorrateoimporAux.setsDescripcionGeneralEntityReporte1(tipoprorrateoimporAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProrrateoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoProrrateoImpor(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoProrrateoImpor=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor=true;
				this.isVisibilidadCeldaGuardarCambiosTipoProrrateoImpor=true;
			}
			
			this.isVisibilidadCeldaModificarTipoProrrateoImpor=false;
			this.isVisibilidadCeldaActualizarTipoProrrateoImpor=false;
			this.isVisibilidadCeldaEliminarTipoProrrateoImpor=false;
			this.isVisibilidadCeldaCancelarTipoProrrateoImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProrrateoImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProrrateoImpor=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoProrrateoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProrrateoImpor=false;
			this.isVisibilidadCeldaModificarTipoProrrateoImpor=false;
			this.isVisibilidadCeldaActualizarTipoProrrateoImpor=true;
			this.isVisibilidadCeldaEliminarTipoProrrateoImpor=false;
			this.isVisibilidadCeldaCancelarTipoProrrateoImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProrrateoImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProrrateoImpor=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoProrrateoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProrrateoImpor=false;
			this.isVisibilidadCeldaModificarTipoProrrateoImpor=false;
			this.isVisibilidadCeldaActualizarTipoProrrateoImpor=true;
			this.isVisibilidadCeldaEliminarTipoProrrateoImpor=true;
			this.isVisibilidadCeldaCancelarTipoProrrateoImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProrrateoImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProrrateoImpor=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoProrrateoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProrrateoImpor=false;
			this.isVisibilidadCeldaModificarTipoProrrateoImpor=false;
			this.isVisibilidadCeldaActualizarTipoProrrateoImpor=true;
			this.isVisibilidadCeldaEliminarTipoProrrateoImpor=false;
			this.isVisibilidadCeldaCancelarTipoProrrateoImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProrrateoImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProrrateoImpor=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoProrrateoImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor=true;
			this.isVisibilidadCeldaGuardarCambiosTipoProrrateoImpor=true;
			this.isVisibilidadCeldaModificarTipoProrrateoImpor=false;
			this.isVisibilidadCeldaActualizarTipoProrrateoImpor=false;
			this.isVisibilidadCeldaEliminarTipoProrrateoImpor=false;
			this.isVisibilidadCeldaCancelarTipoProrrateoImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProrrateoImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProrrateoImpor=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoProrrateoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProrrateoImpor=false;
			this.isVisibilidadCeldaActualizarTipoProrrateoImpor=false;
			this.isVisibilidadCeldaEliminarTipoProrrateoImpor=false;
			this.isVisibilidadCeldaCancelarTipoProrrateoImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProrrateoImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProrrateoImpor=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoProrrateoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProrrateoImpor=false;
			this.isVisibilidadCeldaModificarTipoProrrateoImpor=true;
			this.isVisibilidadCeldaActualizarTipoProrrateoImpor=false;
			this.isVisibilidadCeldaEliminarTipoProrrateoImpor=false;
			this.isVisibilidadCeldaCancelarTipoProrrateoImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProrrateoImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProrrateoImpor=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoProrrateoImporJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoProrrateoImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor=true;
			this.isVisibilidadCeldaGuardarCambiosTipoProrrateoImpor=true;
		} else {
			this.actualizarEstadoPanelsTipoProrrateoImpor(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoProrrateoImpor=false;
			//this.isVisibilidadCeldaVerFormTipoProrrateoImpor=false;
			this.isVisibilidadCeldaDuplicarTipoProrrateoImpor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoprorrateoimporSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoProrrateoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProrrateoImpor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
			if(!tipoprorrateoimporSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor=false;												
			}
			
			this.jButtonCerrarTipoProrrateoImpor.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoProrrateoImpor=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoprorrateoimpor)) {
			this.isVisibilidadCeldaActualizarTipoProrrateoImpor=false;
			this.isVisibilidadCeldaEliminarTipoProrrateoImpor=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoProrrateoImpor() {
	}
	
	public void actualizarEstadoPanelsTipoProrrateoImpor(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoProrrateoImpor!=null) {
				this.jScrollPanelDatosEdicionTipoProrrateoImpor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoProrrateoImpor!=null) {
				this.jScrollPanelDatosTipoProrrateoImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProrrateoImpor!=null) {
				this.jPanelPaginacionTipoProrrateoImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProrrateoImpor!=null) {
				this.jPanelParametrosReportesTipoProrrateoImpor.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoProrrateoImpor!=null) {
				this.jScrollPanelDatosEdicionTipoProrrateoImpor.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoProrrateoImpor!=null) {
				this.jScrollPanelDatosTipoProrrateoImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProrrateoImpor!=null) {
				this.jPanelPaginacionTipoProrrateoImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProrrateoImpor!=null) {
				this.jPanelParametrosReportesTipoProrrateoImpor.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoProrrateoImpor!=null) {
				this.jScrollPanelDatosEdicionTipoProrrateoImpor.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoProrrateoImpor!=null) {
				this.jScrollPanelDatosTipoProrrateoImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProrrateoImpor!=null) {
				this.jPanelPaginacionTipoProrrateoImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProrrateoImpor!=null) {
				this.jPanelParametrosReportesTipoProrrateoImpor.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoProrrateoImpor!=null) {
				this.jScrollPanelDatosEdicionTipoProrrateoImpor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProrrateoImpor!=null) {
				this.jScrollPanelDatosTipoProrrateoImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProrrateoImpor!=null) {
				this.jPanelPaginacionTipoProrrateoImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProrrateoImpor!=null) {
				this.jPanelParametrosReportesTipoProrrateoImpor.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoProrrateoImpor!=null) {
				this.jScrollPanelDatosEdicionTipoProrrateoImpor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoProrrateoImpor!=null) {
				this.jScrollPanelDatosTipoProrrateoImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProrrateoImpor!=null) {
				this.jPanelPaginacionTipoProrrateoImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProrrateoImpor!=null) {
				this.jPanelParametrosReportesTipoProrrateoImpor.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoProrrateoImpor!=null) {
				this.jScrollPanelDatosEdicionTipoProrrateoImpor.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoProrrateoImpor!=null) {
				this.jScrollPanelDatosTipoProrrateoImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProrrateoImpor!=null) {
				this.jPanelPaginacionTipoProrrateoImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProrrateoImpor!=null) {
				this.jPanelParametrosReportesTipoProrrateoImpor.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoProrrateoImpor!=null) {
				this.jScrollPanelDatosEdicionTipoProrrateoImpor.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoProrrateoImpor!=null) {
				this.jScrollPanelDatosTipoProrrateoImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProrrateoImpor!=null) {
				this.jPanelPaginacionTipoProrrateoImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProrrateoImpor!=null) {
				this.jPanelParametrosReportesTipoProrrateoImpor.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoProrrateoImporSessionBean tipoprorrateoimporSessionBean=new TipoProrrateoImporSessionBean();
		
		if(this.tipoprorrateoimporSessionBean==null) {
			this.tipoprorrateoimporSessionBean=new TipoProrrateoImporSessionBean();
		}
		
		this.tipoprorrateoimporSessionBean.setsUltimaBusquedaTipoProrrateoImpor(this.getsAccionBusqueda());
		this.tipoprorrateoimporSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoprorrateoimporSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoProrrateoImporSessionBean tipoprorrateoimporSessionBean=new TipoProrrateoImporSessionBean();
		
		if(this.tipoprorrateoimporSessionBean==null) {
			this.tipoprorrateoimporSessionBean=new TipoProrrateoImporSessionBean();
		}
		
		if(this.tipoprorrateoimporSessionBean.getsUltimaBusquedaTipoProrrateoImpor()!=null&&!this.tipoprorrateoimporSessionBean.getsUltimaBusquedaTipoProrrateoImpor().equals("")) {
			this.setsAccionBusqueda(tipoprorrateoimporSessionBean.getsUltimaBusquedaTipoProrrateoImpor());
			this.setiNumeroPaginacion(tipoprorrateoimporSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoprorrateoimporSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoprorrateoimporSessionBean.setsUltimaBusquedaTipoProrrateoImpor("");
		this.tipoprorrateoimporSessionBean.setiNumeroPaginacion(TipoProrrateoImporConstantesFunciones.INUMEROPAGINACION);
		this.tipoprorrateoimporSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoProrrateoImpor(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoProrrateoImpor() {
		this.updateBorderResaltarBusquedasFormularioTipoProrrateoImpor();
		this.updateVisibilidadBusquedasFormularioTipoProrrateoImpor();
		this.updateHabilitarBusquedasFormularioTipoProrrateoImpor();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoProrrateoImpor() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoProrrateoImpor() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoProrrateoImpor() {
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
	
	public void updateControlesFormularioTipoProrrateoImpor() throws Exception {

		if(this.jInternalFrameDetalleFormTipoProrrateoImpor==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoProrrateoImpor();
		this.updateVisibilidadResaltarControlesFormularioTipoProrrateoImpor();
		this.updateHabilitarResaltarControlesFormularioTipoProrrateoImpor();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoProrrateoImpor() throws Exception {
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoprorrateoimporConstantesFunciones.resaltaridTipoProrrateoImpor!=null && this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) {this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextFieldidTipoProrrateoImpor.setBorder(this.tipoprorrateoimporConstantesFunciones.resaltaridTipoProrrateoImpor);}
		if(this.tipoprorrateoimporConstantesFunciones.resaltarcodigoTipoProrrateoImpor!=null && this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) {this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextFieldcodigoTipoProrrateoImpor.setBorder(this.tipoprorrateoimporConstantesFunciones.resaltarcodigoTipoProrrateoImpor);}
		if(this.tipoprorrateoimporConstantesFunciones.resaltarnombreTipoProrrateoImpor!=null && this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) {this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextAreanombreTipoProrrateoImpor.setBorder(this.tipoprorrateoimporConstantesFunciones.resaltarnombreTipoProrrateoImpor);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoProrrateoImpor() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) {
	
		//this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextFieldidTipoProrrateoImpor.setVisible(this.tipoprorrateoimporConstantesFunciones.mostraridTipoProrrateoImpor);
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jPanelidTipoProrrateoImpor.setVisible(this.tipoprorrateoimporConstantesFunciones.mostraridTipoProrrateoImpor);
		//this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextFieldcodigoTipoProrrateoImpor.setVisible(this.tipoprorrateoimporConstantesFunciones.mostrarcodigoTipoProrrateoImpor);
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jPanelcodigoTipoProrrateoImpor.setVisible(this.tipoprorrateoimporConstantesFunciones.mostrarcodigoTipoProrrateoImpor);
		//this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextAreanombreTipoProrrateoImpor.setVisible(this.tipoprorrateoimporConstantesFunciones.mostrarnombreTipoProrrateoImpor);
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jPanelnombreTipoProrrateoImpor.setVisible(this.tipoprorrateoimporConstantesFunciones.mostrarnombreTipoProrrateoImpor);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoProrrateoImpor() throws Exception {
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoProrrateoImpor!=null) {
	
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextFieldidTipoProrrateoImpor.setEnabled(this.tipoprorrateoimporConstantesFunciones.activaridTipoProrrateoImpor);
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextFieldcodigoTipoProrrateoImpor.setEnabled(this.tipoprorrateoimporConstantesFunciones.activarcodigoTipoProrrateoImpor);
		this.jInternalFrameDetalleFormTipoProrrateoImpor.jTextAreanombreTipoProrrateoImpor.setEnabled(this.tipoprorrateoimporConstantesFunciones.activarnombreTipoProrrateoImpor);
		}
	}
	
		
}