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

import com.bydan.erp.contabilidad.util.FormularioIvaConstantesFunciones;
import com.bydan.erp.contabilidad.util.FormularioIvaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.FormularioIvaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.FormularioIvaBean;
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
public class FormularioIvaBeanSwingJInternalFrame extends FormularioIvaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(FormularioIvaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<FormularioIva> formularioivaValidator = new ClassValidator<FormularioIva>(FormularioIva.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public FormularioIva formularioiva;	
	public FormularioIva formularioivaAux;
	public FormularioIva formularioivaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public FormularioIva formularioivaTotales;
	public Long idFormularioIvaActual;
	public Long iIdNuevoFormularioIva=0L;
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

	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
	}

	public String sFinalQueryComboPeriodo="";

	public List<Periodo> periodosForeignKey;

	public List<Periodo> getperiodosForeignKey() {
		return periodosForeignKey;
	}

	public void setperiodosForeignKey(List<Periodo> periodosForeignKey) {
		this.periodosForeignKey = periodosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Periodo periodoForeignKey;

	public Periodo getperiodoForeignKey() {
		return periodoForeignKey;
	}

	public void setperiodoForeignKey(Periodo periodoForeignKey) {
		this.periodoForeignKey = periodoForeignKey;
	}

	public String sFinalQueryComboDatoFormularioIva="";

	public List<DatoFormularioIva> datoformularioivasForeignKey;

	public List<DatoFormularioIva> getdatoformularioivasForeignKey() {
		return datoformularioivasForeignKey;
	}

	public void setdatoformularioivasForeignKey(List<DatoFormularioIva> datoformularioivasForeignKey) {
		this.datoformularioivasForeignKey = datoformularioivasForeignKey;
	}

	//OBJETO FK ACTUAL
	public DatoFormularioIva datoformularioivaForeignKey;

	public DatoFormularioIva getdatoformularioivaForeignKey() {
		return datoformularioivaForeignKey;
	}

	public void setdatoformularioivaForeignKey(DatoFormularioIva datoformularioivaForeignKey) {
		this.datoformularioivaForeignKey = datoformularioivaForeignKey;
	}

	public String sFinalQueryComboGrupoParametroFormularioIva="";

	public List<GrupoParametroFormularioIva> grupoparametroformularioivasForeignKey;

	public List<GrupoParametroFormularioIva> getgrupoparametroformularioivasForeignKey() {
		return grupoparametroformularioivasForeignKey;
	}

	public void setgrupoparametroformularioivasForeignKey(List<GrupoParametroFormularioIva> grupoparametroformularioivasForeignKey) {
		this.grupoparametroformularioivasForeignKey = grupoparametroformularioivasForeignKey;
	}

	//OBJETO FK ACTUAL
	public GrupoParametroFormularioIva grupoparametroformularioivaForeignKey;

	public GrupoParametroFormularioIva getgrupoparametroformularioivaForeignKey() {
		return grupoparametroformularioivaForeignKey;
	}

	public void setgrupoparametroformularioivaForeignKey(GrupoParametroFormularioIva grupoparametroformularioivaForeignKey) {
		this.grupoparametroformularioivaForeignKey = grupoparametroformularioivaForeignKey;
	}

	public String sFinalQueryComboParametroFormularioIva="";

	public List<ParametroFormularioIva> parametroformularioivasForeignKey;

	public List<ParametroFormularioIva> getparametroformularioivasForeignKey() {
		return parametroformularioivasForeignKey;
	}

	public void setparametroformularioivasForeignKey(List<ParametroFormularioIva> parametroformularioivasForeignKey) {
		this.parametroformularioivasForeignKey = parametroformularioivasForeignKey;
	}

	//OBJETO FK ACTUAL
	public ParametroFormularioIva parametroformularioivaForeignKey;

	public ParametroFormularioIva getparametroformularioivaForeignKey() {
		return parametroformularioivaForeignKey;
	}

	public void setparametroformularioivaForeignKey(ParametroFormularioIva parametroformularioivaForeignKey) {
		this.parametroformularioivaForeignKey = parametroformularioivaForeignKey;
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
	
	public Boolean isPermisoTodoFormularioIva;
	public Boolean isPermisoNuevoFormularioIva;
	public Boolean isPermisoActualizarFormularioIva;
	public Boolean isPermisoActualizarOriginalFormularioIva;
	public Boolean isPermisoEliminarFormularioIva;
	public Boolean isPermisoGuardarCambiosFormularioIva;
	public Boolean isPermisoConsultaFormularioIva;
	public Boolean isPermisoBusquedaFormularioIva;
	public Boolean isPermisoReporteFormularioIva;
	public Boolean isPermisoPaginacionMedioFormularioIva;
	public Boolean isPermisoPaginacionAltoFormularioIva;
	public Boolean isPermisoPaginacionTodoFormularioIva;
	public Boolean isPermisoCopiarFormularioIva;
	public Boolean isPermisoVerFormFormularioIva;
	public Boolean isPermisoDuplicarFormularioIva;
	public Boolean isPermisoOrdenFormularioIva;
	
	
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
	
	public FormularioIvaParameterReturnGeneral formularioivaReturnGeneral;
	public FormularioIvaParameterReturnGeneral formularioivaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoFormularioIva=false;
	public Boolean esParaAccionDesdeFormularioFormularioIva=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected FormularioIvaSessionBeanAdditional formularioivaSessionBeanAdditional=null;
	
	public FormularioIvaSessionBeanAdditional getFormularioIvaSessionBeanAdditional() {
		return this.formularioivaSessionBeanAdditional;
	}
	
	public void setFormularioIvaSessionBeanAdditional(FormularioIvaSessionBeanAdditional formularioivaSessionBeanAdditional) {
		try {
			this.formularioivaSessionBeanAdditional=formularioivaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected FormularioIvaBeanSwingJInternalFrameAdditional formularioivaBeanSwingJInternalFrameAdditional=null;
	//public class FormularioIvaBeanSwingJInternalFrame
	
	public FormularioIvaBeanSwingJInternalFrameAdditional getFormularioIvaBeanSwingJInternalFrameAdditional() {
		return this.formularioivaBeanSwingJInternalFrameAdditional;
	}
	
	public void setFormularioIvaBeanSwingJInternalFrameAdditional(FormularioIvaBeanSwingJInternalFrameAdditional formularioivaBeanSwingJInternalFrameAdditional) {
		try {
			this.formularioivaBeanSwingJInternalFrameAdditional=formularioivaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public FormularioIvaLogic formularioivaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public FormularioIva formularioivaBean;
	public FormularioIvaConstantesFunciones formularioivaConstantesFunciones;
	//public FormularioIvaParameterReturnGeneral formularioivaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public DatoFormularioIvaLogic datoformularioivaLogic;
	public GrupoParametroFormularioIvaLogic grupoparametroformularioivaLogic;
	public ParametroFormularioIvaLogic parametroformularioivaLogic;
	
	//PARAMETROS
	
	
	//public List<FormularioIva> formularioivas;	
	//public List<FormularioIva> formularioivasEliminados;
	//public List<FormularioIva> formularioivasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoFormularioIva=false;
	public Boolean isVisibilidadCeldaDuplicarFormularioIva=true;
	public Boolean isVisibilidadCeldaCopiarFormularioIva=true;
	public Boolean isVisibilidadCeldaVerFormFormularioIva=true;
	public Boolean isVisibilidadCeldaOrdenFormularioIva=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesFormularioIva=false;
	public Boolean isVisibilidadCeldaModificarFormularioIva=false;
	public Boolean isVisibilidadCeldaActualizarFormularioIva=false;
	public Boolean isVisibilidadCeldaEliminarFormularioIva=false;
	public Boolean isVisibilidadCeldaCancelarFormularioIva=false;
	public Boolean isVisibilidadCeldaGuardarFormularioIva=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosFormularioIva=false;	
	
	
	public Boolean isVisibilidadBusquedaPorDatoFormularioPorGrupo=false;
	public Boolean isVisibilidadFK_IdDatoFormularioIva=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdGrupoParametroFormularioIva=false;
	public Boolean isVisibilidadFK_IdParametroFormularioIva=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	
	public Long getiIdNuevoFormularioIva() {
		return this.iIdNuevoFormularioIva;
	}

	public void setiIdNuevoFormularioIva(Long iIdNuevoFormularioIva) {
		this.iIdNuevoFormularioIva = iIdNuevoFormularioIva;
	}
	
	public Long getidFormularioIvaActual() {
		return this.idFormularioIvaActual;
	}

	public void setidFormularioIvaActual(Long idFormularioIvaActual) {
		this.idFormularioIvaActual = idFormularioIvaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public FormularioIva getformularioiva() {
		return this.formularioiva;
	}

	public void setformularioiva(FormularioIva formularioiva) {
		this.formularioiva = formularioiva;
	}
	
	public FormularioIva getformularioivaAux() {
		return this.formularioivaAux;
	}

	public void setformularioivaAux(FormularioIva formularioivaAux) {
		this.formularioivaAux = formularioivaAux;
	}				
	
	public FormularioIva getformularioivaAnterior() {
		return this.formularioivaAnterior;
	}

	public void setformularioivaAnterior(FormularioIva formularioivaAnterior) {
		this.formularioivaAnterior = formularioivaAnterior;
	}	
	
	public FormularioIva getformularioivaTotales() {
		return this.formularioivaTotales;
	}

	public void setformularioivaTotales(FormularioIva formularioivaTotales) {
		this.formularioivaTotales = formularioivaTotales;
	}	
	
	public FormularioIva getformularioivaBean() {
		return this.formularioivaBean;
	}

	public void setformularioivaBean(FormularioIva formularioivaBean) {
		this.formularioivaBean = formularioivaBean;
	}	
	
	public FormularioIvaParameterReturnGeneral getformularioivaReturnGeneral() {
		return this.formularioivaReturnGeneral;
	}

	public void setformularioivaReturnGeneral(FormularioIvaParameterReturnGeneral formularioivaReturnGeneral) {
		this.formularioivaReturnGeneral = formularioivaReturnGeneral;
	}	
	
	
	public Long id_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupo=-1L;

	public Long getid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupo() {
		return this.id_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupo;
	}

	public void setid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupo(Long id_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupo) {
		this.id_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupo = id_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupo;
	}

;
	public Long id_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupo=-1L;

	public Long getid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupo() {
		return this.id_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupo;
	}

	public void setid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupo(Long id_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupo) {
		this.id_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupo = id_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupo;
	}

	public Long id_dato_formulario_ivaFK_IdDatoFormularioIva=-1L;

	public Long getid_dato_formulario_ivaFK_IdDatoFormularioIva() {
		return this.id_dato_formulario_ivaFK_IdDatoFormularioIva;
	}

	public void setid_dato_formulario_ivaFK_IdDatoFormularioIva(Long id_dato_formulario_ivaFK_IdDatoFormularioIva) {
		this.id_dato_formulario_ivaFK_IdDatoFormularioIva = id_dato_formulario_ivaFK_IdDatoFormularioIva;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIva=-1L;

	public Long getid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIva() {
		return this.id_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIva;
	}

	public void setid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIva(Long id_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIva) {
		this.id_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIva = id_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIva;
	}

	public Long id_parametro_formulario_ivaFK_IdParametroFormularioIva=-1L;

	public Long getid_parametro_formulario_ivaFK_IdParametroFormularioIva() {
		return this.id_parametro_formulario_ivaFK_IdParametroFormularioIva;
	}

	public void setid_parametro_formulario_ivaFK_IdParametroFormularioIva(Long id_parametro_formulario_ivaFK_IdParametroFormularioIva) {
		this.id_parametro_formulario_ivaFK_IdParametroFormularioIva = id_parametro_formulario_ivaFK_IdParametroFormularioIva;
	}

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public FormularioIvaLogic getFormularioIvaLogic()	{		
		return formularioivaLogic;
	}

	public void setFormularioIvaLogic(FormularioIvaLogic formularioivaLogic) {
		this.formularioivaLogic = formularioivaLogic;
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
	
	public Boolean getIsEsNuevoFormularioIva() {
		return isEsNuevoFormularioIva;
	}

	public void setIsEsNuevoFormularioIva(Boolean isEsNuevoFormularioIva) {
		this.isEsNuevoFormularioIva = isEsNuevoFormularioIva;
	}

	public Boolean getEsParaAccionDesdeFormularioFormularioIva() {
		return esParaAccionDesdeFormularioFormularioIva;
	}
	
	public void setEsParaAccionDesdeFormularioFormularioIva(Boolean esParaAccionDesdeFormularioFormularioIva) {
		this.esParaAccionDesdeFormularioFormularioIva = esParaAccionDesdeFormularioFormularioIva;
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

			if(this.formularioivaSessionBean==null) {
				this.formularioivaSessionBean=new FormularioIvaSessionBean();
			}

			if(!this.formularioivaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(formularioivaSessionBean.getlidEmpresaActual());
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

	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.formularioivaSessionBean==null) {
				this.formularioivaSessionBean=new FormularioIvaSessionBean();
			}

			if(!this.formularioivaSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(formularioivaSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

	public void cargarCombosPeriodosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periodosForeignKey=new ArrayList<Periodo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoLogic periodoLogic=new PeriodoLogic();

			//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

			if(this.formularioivaSessionBean==null) {
				this.formularioivaSessionBean=new FormularioIvaSessionBean();
			}

			if(!this.formularioivaSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

					periodoLogic.getTodosPeriodosWithConnection(sFinalQuery,new Pagination());

					this.periodosForeignKey=periodoLogic.getPeriodos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getEntityWithConnection(formularioivaSessionBean.getlidPeriodoActual());
					this.periodosForeignKey.add(periodoLogic.getPeriodo());
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

	public void cargarCombosDatoFormularioIvasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.datoformularioivasForeignKey=new ArrayList<DatoFormularioIva>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			DatoFormularioIvaLogic datoformularioivaLogic=new DatoFormularioIvaLogic();

			//datoformularioivaLogic.getDatoFormularioIvaDataAccess().setIsForForeingKeyData(true);

			if(this.formularioivaSessionBean==null) {
				this.formularioivaSessionBean=new FormularioIvaSessionBean();
			}

			if(!this.formularioivaSessionBean.getisBusquedaDesdeForeignKeySesionDatoFormularioIva()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//datoformularioivaLogic.getDatoFormularioIvaDataAccess().setIsForForeingKeyData(true);

					datoformularioivaLogic.getTodosDatoFormularioIvasWithConnection(sFinalQuery,new Pagination());

					this.datoformularioivasForeignKey=datoformularioivaLogic.getDatoFormularioIvas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaDatoFormularioIva(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					datoformularioivaLogic.getEntityWithConnection(formularioivaSessionBean.getlidDatoFormularioIvaActual());
					this.datoformularioivasForeignKey.add(datoformularioivaLogic.getDatoFormularioIva());
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

	public void cargarCombosGrupoParametroFormularioIvasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.grupoparametroformularioivasForeignKey=new ArrayList<GrupoParametroFormularioIva>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			GrupoParametroFormularioIvaLogic grupoparametroformularioivaLogic=new GrupoParametroFormularioIvaLogic();

			//grupoparametroformularioivaLogic.getGrupoParametroFormularioIvaDataAccess().setIsForForeingKeyData(true);

			if(this.formularioivaSessionBean==null) {
				this.formularioivaSessionBean=new FormularioIvaSessionBean();
			}

			if(!this.formularioivaSessionBean.getisBusquedaDesdeForeignKeySesionGrupoParametroFormularioIva()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//grupoparametroformularioivaLogic.getGrupoParametroFormularioIvaDataAccess().setIsForForeingKeyData(true);

					grupoparametroformularioivaLogic.getTodosGrupoParametroFormularioIvasWithConnection(sFinalQuery,new Pagination());

					this.grupoparametroformularioivasForeignKey=grupoparametroformularioivaLogic.getGrupoParametroFormularioIvas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaGrupoParametroFormularioIva(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoparametroformularioivaLogic.getEntityWithConnection(formularioivaSessionBean.getlidGrupoParametroFormularioIvaActual());
					this.grupoparametroformularioivasForeignKey.add(grupoparametroformularioivaLogic.getGrupoParametroFormularioIva());
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

	public void cargarCombosParametroFormularioIvasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.parametroformularioivasForeignKey=new ArrayList<ParametroFormularioIva>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ParametroFormularioIvaLogic parametroformularioivaLogic=new ParametroFormularioIvaLogic();

			//parametroformularioivaLogic.getParametroFormularioIvaDataAccess().setIsForForeingKeyData(true);

			if(this.formularioivaSessionBean==null) {
				this.formularioivaSessionBean=new FormularioIvaSessionBean();
			}

			if(!this.formularioivaSessionBean.getisBusquedaDesdeForeignKeySesionParametroFormularioIva()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//parametroformularioivaLogic.getParametroFormularioIvaDataAccess().setIsForForeingKeyData(true);

					parametroformularioivaLogic.getTodosParametroFormularioIvasWithConnection(sFinalQuery,new Pagination());

					this.parametroformularioivasForeignKey=parametroformularioivaLogic.getParametroFormularioIvas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaParametroFormularioIva(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroformularioivaLogic.getEntityWithConnection(formularioivaSessionBean.getlidParametroFormularioIvaActual());
					this.parametroformularioivasForeignKey.add(parametroformularioivaLogic.getParametroFormularioIva());
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

					if(this.formularioiva!=null) {
						this.formularioiva.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormFormularioIva!=null) {
						this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_empresaFormularioIva.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaFormularioIva.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormFormularioIva!=null) {
						if(this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_empresaFormularioIva.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_empresaFormularioIva.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaFormularioIvaGenerico)throws Exception
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
				jComboBoxid_empresaFormularioIvaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaFormularioIvaGenerico!=null && jComboBoxid_empresaFormularioIvaGenerico.getItemCount()>0) {
					jComboBoxid_empresaFormularioIvaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.formularioiva!=null) {
						this.formularioiva.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormFormularioIva!=null) {
						this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_ejercicioFormularioIva.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioFormularioIva.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormFormularioIva!=null) {
						if(this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_ejercicioFormularioIva.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_ejercicioFormularioIva.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioFormularioIvaGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioFormularioIvaGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioFormularioIvaGenerico!=null && jComboBoxid_ejercicioFormularioIvaGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioFormularioIvaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPeriodoForeignKey(Long idPeriodoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periodoTemp!=null) {

					if(this.formularioiva!=null) {
						this.formularioiva.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormFormularioIva!=null) {
						this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_periodoFormularioIva.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoFormularioIva.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormFormularioIva!=null) {
						if(this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_periodoFormularioIva.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_periodoFormularioIva.setSelectedIndex(0);
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

	public String getActualPeriodoForeignKeyDescripcion(Long idPeriodoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}


			sDescripcion=PeriodoConstantesFunciones.getPeriodoDescripcion(periodoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoFormularioIvaGenerico)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(periodoTemp!=null) {
				jComboBoxid_periodoFormularioIvaGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoFormularioIvaGenerico!=null && jComboBoxid_periodoFormularioIvaGenerico.getItemCount()>0) {
					jComboBoxid_periodoFormularioIvaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualDatoFormularioIvaForeignKey(Long idDatoFormularioIvaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			DatoFormularioIva  datoformularioivaTemp=null;

			for(DatoFormularioIva datoformularioivaAux:datoformularioivasForeignKey) {
				if(datoformularioivaAux.getId()!=null && datoformularioivaAux.getId().equals(idDatoFormularioIvaSeleccionado)) {
					datoformularioivaTemp=datoformularioivaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(datoformularioivaTemp!=null) {

					if(this.formularioiva!=null) {
						this.formularioiva.setDatoFormularioIva(datoformularioivaTemp);
					}

					if(this.jInternalFrameDetalleFormFormularioIva!=null) {
						this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_dato_formulario_ivaFormularioIva.setSelectedItem(datoformularioivaTemp);
					}
				} else {
					//jComboBoxid_dato_formulario_ivaFormularioIva.setSelectedItem(datoformularioivaTemp);
					if(this.jInternalFrameDetalleFormFormularioIva!=null) {
						if(this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_dato_formulario_ivaFormularioIva.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_dato_formulario_ivaFormularioIva.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorDatoFormularioPorGrupo") || sFormularioTipoBusqueda.equals("Todos")){
					if(datoformularioivaTemp!=null && jComboBoxid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva!=null) {
						jComboBoxid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setSelectedItem(datoformularioivaTemp);
					} else {
						if(jComboBoxid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva!=null) {
							//jComboBoxid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setSelectedItem(datoformularioivaTemp);
							if(jComboBoxid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.getItemCount()>0) {
								jComboBoxid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdDatoFormularioIva") || sFormularioTipoBusqueda.equals("Todos")){
					if(datoformularioivaTemp!=null && jComboBoxid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva!=null) {
						jComboBoxid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva.setSelectedItem(datoformularioivaTemp);
					} else {
						if(jComboBoxid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva!=null) {
							//jComboBoxid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva.setSelectedItem(datoformularioivaTemp);
							if(jComboBoxid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva.getItemCount()>0) {
								jComboBoxid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva.setSelectedIndex(0);
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

	public String getActualDatoFormularioIvaForeignKeyDescripcion(Long idDatoFormularioIvaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			DatoFormularioIva  datoformularioivaTemp=null;

			for(DatoFormularioIva datoformularioivaAux:datoformularioivasForeignKey) {
				if(datoformularioivaAux.getId()!=null && datoformularioivaAux.getId().equals(idDatoFormularioIvaSeleccionado)) {
					datoformularioivaTemp=datoformularioivaAux;
					break;
				}
			}


			sDescripcion=DatoFormularioIvaConstantesFunciones.getDatoFormularioIvaDescripcion(datoformularioivaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualDatoFormularioIvaForeignKeyGenerico(Long idDatoFormularioIvaSeleccionado,JComboBox jComboBoxid_dato_formulario_ivaFormularioIvaGenerico)throws Exception
	{
		try
		{
			DatoFormularioIva  datoformularioivaTemp=null;

			for(DatoFormularioIva datoformularioivaAux:datoformularioivasForeignKey) {
				if(datoformularioivaAux.getId()!=null && datoformularioivaAux.getId().equals(idDatoFormularioIvaSeleccionado)) {
					datoformularioivaTemp=datoformularioivaAux;
					break;
				}
			}

			if(datoformularioivaTemp!=null) {
				jComboBoxid_dato_formulario_ivaFormularioIvaGenerico.setSelectedItem(datoformularioivaTemp);
			} else {
				if(jComboBoxid_dato_formulario_ivaFormularioIvaGenerico!=null && jComboBoxid_dato_formulario_ivaFormularioIvaGenerico.getItemCount()>0) {
					jComboBoxid_dato_formulario_ivaFormularioIvaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualGrupoParametroFormularioIvaForeignKey(Long idGrupoParametroFormularioIvaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			GrupoParametroFormularioIva  grupoparametroformularioivaTemp=null;

			for(GrupoParametroFormularioIva grupoparametroformularioivaAux:grupoparametroformularioivasForeignKey) {
				if(grupoparametroformularioivaAux.getId()!=null && grupoparametroformularioivaAux.getId().equals(idGrupoParametroFormularioIvaSeleccionado)) {
					grupoparametroformularioivaTemp=grupoparametroformularioivaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(grupoparametroformularioivaTemp!=null) {

					if(this.formularioiva!=null) {
						this.formularioiva.setGrupoParametroFormularioIva(grupoparametroformularioivaTemp);
					}

					if(this.jInternalFrameDetalleFormFormularioIva!=null) {
						this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.setSelectedItem(grupoparametroformularioivaTemp);
					}
				} else {
					//jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.setSelectedItem(grupoparametroformularioivaTemp);
					if(this.jInternalFrameDetalleFormFormularioIva!=null) {
						if(this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorDatoFormularioPorGrupo") || sFormularioTipoBusqueda.equals("Todos")){
					if(grupoparametroformularioivaTemp!=null && jComboBoxid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva!=null) {
						jComboBoxid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setSelectedItem(grupoparametroformularioivaTemp);
					} else {
						if(jComboBoxid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva!=null) {
							//jComboBoxid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setSelectedItem(grupoparametroformularioivaTemp);
							if(jComboBoxid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.getItemCount()>0) {
								jComboBoxid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdGrupoParametroFormularioIva") || sFormularioTipoBusqueda.equals("Todos")){
					if(grupoparametroformularioivaTemp!=null && jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva!=null) {
						jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva.setSelectedItem(grupoparametroformularioivaTemp);
					} else {
						if(jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva!=null) {
							//jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva.setSelectedItem(grupoparametroformularioivaTemp);
							if(jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva.getItemCount()>0) {
								jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva.setSelectedIndex(0);
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

	public String getActualGrupoParametroFormularioIvaForeignKeyDescripcion(Long idGrupoParametroFormularioIvaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			GrupoParametroFormularioIva  grupoparametroformularioivaTemp=null;

			for(GrupoParametroFormularioIva grupoparametroformularioivaAux:grupoparametroformularioivasForeignKey) {
				if(grupoparametroformularioivaAux.getId()!=null && grupoparametroformularioivaAux.getId().equals(idGrupoParametroFormularioIvaSeleccionado)) {
					grupoparametroformularioivaTemp=grupoparametroformularioivaAux;
					break;
				}
			}


			sDescripcion=GrupoParametroFormularioIvaConstantesFunciones.getGrupoParametroFormularioIvaDescripcion(grupoparametroformularioivaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualGrupoParametroFormularioIvaForeignKeyGenerico(Long idGrupoParametroFormularioIvaSeleccionado,JComboBox jComboBoxid_grupo_parametro_formulario_ivaFormularioIvaGenerico)throws Exception
	{
		try
		{
			GrupoParametroFormularioIva  grupoparametroformularioivaTemp=null;

			for(GrupoParametroFormularioIva grupoparametroformularioivaAux:grupoparametroformularioivasForeignKey) {
				if(grupoparametroformularioivaAux.getId()!=null && grupoparametroformularioivaAux.getId().equals(idGrupoParametroFormularioIvaSeleccionado)) {
					grupoparametroformularioivaTemp=grupoparametroformularioivaAux;
					break;
				}
			}

			if(grupoparametroformularioivaTemp!=null) {
				jComboBoxid_grupo_parametro_formulario_ivaFormularioIvaGenerico.setSelectedItem(grupoparametroformularioivaTemp);
			} else {
				if(jComboBoxid_grupo_parametro_formulario_ivaFormularioIvaGenerico!=null && jComboBoxid_grupo_parametro_formulario_ivaFormularioIvaGenerico.getItemCount()>0) {
					jComboBoxid_grupo_parametro_formulario_ivaFormularioIvaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualParametroFormularioIvaForeignKey(Long idParametroFormularioIvaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			ParametroFormularioIva  parametroformularioivaTemp=null;

			for(ParametroFormularioIva parametroformularioivaAux:parametroformularioivasForeignKey) {
				if(parametroformularioivaAux.getId()!=null && parametroformularioivaAux.getId().equals(idParametroFormularioIvaSeleccionado)) {
					parametroformularioivaTemp=parametroformularioivaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(parametroformularioivaTemp!=null) {

					if(this.formularioiva!=null) {
						this.formularioiva.setParametroFormularioIva(parametroformularioivaTemp);
					}

					if(this.jInternalFrameDetalleFormFormularioIva!=null) {
						this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_parametro_formulario_ivaFormularioIva.setSelectedItem(parametroformularioivaTemp);
					}
				} else {
					//jComboBoxid_parametro_formulario_ivaFormularioIva.setSelectedItem(parametroformularioivaTemp);
					if(this.jInternalFrameDetalleFormFormularioIva!=null) {
						if(this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_parametro_formulario_ivaFormularioIva.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_parametro_formulario_ivaFormularioIva.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdParametroFormularioIva") || sFormularioTipoBusqueda.equals("Todos")){
					if(parametroformularioivaTemp!=null && jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva!=null) {
						jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva.setSelectedItem(parametroformularioivaTemp);
					} else {
						if(jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva!=null) {
							//jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva.setSelectedItem(parametroformularioivaTemp);
							if(jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva.getItemCount()>0) {
								jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva.setSelectedIndex(0);
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

	public String getActualParametroFormularioIvaForeignKeyDescripcion(Long idParametroFormularioIvaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			ParametroFormularioIva  parametroformularioivaTemp=null;

			for(ParametroFormularioIva parametroformularioivaAux:parametroformularioivasForeignKey) {
				if(parametroformularioivaAux.getId()!=null && parametroformularioivaAux.getId().equals(idParametroFormularioIvaSeleccionado)) {
					parametroformularioivaTemp=parametroformularioivaAux;
					break;
				}
			}


			sDescripcion=ParametroFormularioIvaConstantesFunciones.getParametroFormularioIvaDescripcion(parametroformularioivaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualParametroFormularioIvaForeignKeyGenerico(Long idParametroFormularioIvaSeleccionado,JComboBox jComboBoxid_parametro_formulario_ivaFormularioIvaGenerico)throws Exception
	{
		try
		{
			ParametroFormularioIva  parametroformularioivaTemp=null;

			for(ParametroFormularioIva parametroformularioivaAux:parametroformularioivasForeignKey) {
				if(parametroformularioivaAux.getId()!=null && parametroformularioivaAux.getId().equals(idParametroFormularioIvaSeleccionado)) {
					parametroformularioivaTemp=parametroformularioivaAux;
					break;
				}
			}

			if(parametroformularioivaTemp!=null) {
				jComboBoxid_parametro_formulario_ivaFormularioIvaGenerico.setSelectedItem(parametroformularioivaTemp);
			} else {
				if(jComboBoxid_parametro_formulario_ivaFormularioIvaGenerico!=null && jComboBoxid_parametro_formulario_ivaFormularioIvaGenerico.getItemCount()>0) {
					jComboBoxid_parametro_formulario_ivaFormularioIvaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(FormularioIva formularioiva,JComboBox jComboBoxid_empresaFormularioIvaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaFormularioIvaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_empresaFormularioIva.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaFormularioIvaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				formularioiva.setid_empresa(empresaAux.getId());
				formularioiva.setempresa_descripcion(FormularioIvaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				formularioiva.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(FormularioIva formularioiva,JComboBox jComboBoxid_ejercicioFormularioIvaGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioFormularioIvaGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_ejercicioFormularioIva.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioFormularioIvaGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				formularioiva.setid_ejercicio(ejercicioAux.getId());
				formularioiva.setejercicio_descripcion(FormularioIvaConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				formularioiva.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(FormularioIva formularioiva,JComboBox jComboBoxid_periodoFormularioIvaGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoFormularioIvaGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_periodoFormularioIva.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoFormularioIvaGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				formularioiva.setid_periodo(periodoAux.getId());
				formularioiva.setperiodo_descripcion(FormularioIvaConstantesFunciones.getPeriodoDescripcion(periodoAux));
				formularioiva.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarDatoFormularioIvaForeignKey(FormularioIva formularioiva,JComboBox jComboBoxid_dato_formulario_ivaFormularioIvaGenerico)throws Exception
	{
		try
		{
			DatoFormularioIva  datoformularioivaAux=new DatoFormularioIva();

			if(jComboBoxid_dato_formulario_ivaFormularioIvaGenerico==null) {
				datoformularioivaAux=(DatoFormularioIva)this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_dato_formulario_ivaFormularioIva.getSelectedItem();
			} else {
				datoformularioivaAux=(DatoFormularioIva)jComboBoxid_dato_formulario_ivaFormularioIvaGenerico.getSelectedItem();
			}

			if(datoformularioivaAux!=null && datoformularioivaAux.getId()!=null) {
				formularioiva.setid_dato_formulario_iva(datoformularioivaAux.getId());
				formularioiva.setdatoformularioiva_descripcion(FormularioIvaConstantesFunciones.getDatoFormularioIvaDescripcion(datoformularioivaAux));
				formularioiva.setDatoFormularioIva(datoformularioivaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarGrupoParametroFormularioIvaForeignKey(FormularioIva formularioiva,JComboBox jComboBoxid_grupo_parametro_formulario_ivaFormularioIvaGenerico)throws Exception
	{
		try
		{
			GrupoParametroFormularioIva  grupoparametroformularioivaAux=new GrupoParametroFormularioIva();

			if(jComboBoxid_grupo_parametro_formulario_ivaFormularioIvaGenerico==null) {
				grupoparametroformularioivaAux=(GrupoParametroFormularioIva)this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.getSelectedItem();
			} else {
				grupoparametroformularioivaAux=(GrupoParametroFormularioIva)jComboBoxid_grupo_parametro_formulario_ivaFormularioIvaGenerico.getSelectedItem();
			}

			if(grupoparametroformularioivaAux!=null && grupoparametroformularioivaAux.getId()!=null) {
				formularioiva.setid_grupo_parametro_formulario_iva(grupoparametroformularioivaAux.getId());
				formularioiva.setgrupoparametroformularioiva_descripcion(FormularioIvaConstantesFunciones.getGrupoParametroFormularioIvaDescripcion(grupoparametroformularioivaAux));
				formularioiva.setGrupoParametroFormularioIva(grupoparametroformularioivaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarParametroFormularioIvaForeignKey(FormularioIva formularioiva,JComboBox jComboBoxid_parametro_formulario_ivaFormularioIvaGenerico)throws Exception
	{
		try
		{
			ParametroFormularioIva  parametroformularioivaAux=new ParametroFormularioIva();

			if(jComboBoxid_parametro_formulario_ivaFormularioIvaGenerico==null) {
				parametroformularioivaAux=(ParametroFormularioIva)this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_parametro_formulario_ivaFormularioIva.getSelectedItem();
			} else {
				parametroformularioivaAux=(ParametroFormularioIva)jComboBoxid_parametro_formulario_ivaFormularioIvaGenerico.getSelectedItem();
			}

			if(parametroformularioivaAux!=null && parametroformularioivaAux.getId()!=null) {
				formularioiva.setid_parametro_formulario_iva(parametroformularioivaAux.getId());
				formularioiva.setparametroformularioiva_descripcion(FormularioIvaConstantesFunciones.getParametroFormularioIvaDescripcion(parametroformularioivaAux));
				formularioiva.setParametroFormularioIva(parametroformularioivaAux);			}
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

					if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormularioIva!=null) { 
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_empresaFormularioIva.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_empresaFormularioIva.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormularioIva!=null) { 
					}

					if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormularioIva!=null) { 
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_ejercicioFormularioIva.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_ejercicioFormularioIva.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormularioIva!=null) { 
					}

					if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormularioIva!=null) { 
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_periodoFormularioIva.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_periodoFormularioIva.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormularioIva!=null) { 
					}

					if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameDatoFormularioIvasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingDatoFormularioIva=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormularioIva!=null) { 
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_dato_formulario_ivaFormularioIva.removeAllItems();

							for(DatoFormularioIva datoformularioiva:this.datoformularioivasForeignKey) {
								this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_dato_formulario_ivaFormularioIva.addItem(datoformularioiva);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormularioIva!=null) { 
					}

					if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorDatoFormularioPorGrupo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.removeAllItems();

							for(DatoFormularioIva datoformularioiva:this.datoformularioivasForeignKey) {
								this.jComboBoxid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.addItem(datoformularioiva);
							}
						}

						if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdDatoFormularioIva") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva.removeAllItems();

							for(DatoFormularioIva datoformularioiva:this.datoformularioivasForeignKey) {
								this.jComboBoxid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva.addItem(datoformularioiva);
							}
						}

						if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameGrupoParametroFormularioIvasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingGrupoParametroFormularioIva=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormularioIva!=null) { 
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.removeAllItems();

							for(GrupoParametroFormularioIva grupoparametroformularioiva:this.grupoparametroformularioivasForeignKey) {
								this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.addItem(grupoparametroformularioiva);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormularioIva!=null) { 
					}

					if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorDatoFormularioPorGrupo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.removeAllItems();

							for(GrupoParametroFormularioIva grupoparametroformularioiva:this.grupoparametroformularioivasForeignKey) {
								this.jComboBoxid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.addItem(grupoparametroformularioiva);
							}
						}

						if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdGrupoParametroFormularioIva") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva.removeAllItems();

							for(GrupoParametroFormularioIva grupoparametroformularioiva:this.grupoparametroformularioivasForeignKey) {
								this.jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva.addItem(grupoparametroformularioiva);
							}
						}

						if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameParametroFormularioIvasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingParametroFormularioIva=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormularioIva!=null) { 
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_parametro_formulario_ivaFormularioIva.removeAllItems();

							for(ParametroFormularioIva parametroformularioiva:this.parametroformularioivasForeignKey) {
								this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_parametro_formulario_ivaFormularioIva.addItem(parametroformularioiva);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormularioIva!=null) { 
					}

					if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdParametroFormularioIva") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva.removeAllItems();

							for(ParametroFormularioIva parametroformularioiva:this.parametroformularioivasForeignKey) {
								this.jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva.addItem(parametroformularioiva);
							}
						}

						if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormFormularioIva!=null) {
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_empresaFormularioIva.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormularioIva!=null) {
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_empresaFormularioIva.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormularioIva!=null) {
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_ejercicioFormularioIva.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormularioIva!=null) {
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_ejercicioFormularioIva.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormularioIva!=null) {
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_periodoFormularioIva.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormularioIva!=null) {
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_periodoFormularioIva.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameDatoFormularioIvaForeignKey(DatoFormularioIva datoformularioiva,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormularioIva!=null) {
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_dato_formulario_ivaFormularioIva.setSelectedItem(datoformularioiva);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormularioIva!=null) {
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_dato_formulario_ivaFormularioIva.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setSelectedItem(datoformularioiva);
						} else {
							this.jComboBoxid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva.setSelectedItem(datoformularioiva);
						} else {
							this.jComboBoxid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameGrupoParametroFormularioIvaForeignKey(GrupoParametroFormularioIva grupoparametroformularioiva,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormularioIva!=null) {
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.setSelectedItem(grupoparametroformularioiva);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormularioIva!=null) {
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setSelectedItem(grupoparametroformularioiva);
						} else {
							this.jComboBoxid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva.setSelectedItem(grupoparametroformularioiva);
						} else {
							this.jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameParametroFormularioIvaForeignKey(ParametroFormularioIva parametroformularioiva,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormularioIva!=null) {
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_parametro_formulario_ivaFormularioIva.setSelectedItem(parametroformularioiva);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormularioIva!=null) {
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_parametro_formulario_ivaFormularioIva.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva.setSelectedItem(parametroformularioiva);
						} else {
							this.jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesFormularioIva() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			FormularioIvaConstantesFunciones.refrescarForeignKeysDescripcionesFormularioIva(this.formularioivaLogic.getFormularioIvas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			FormularioIvaConstantesFunciones.refrescarForeignKeysDescripcionesFormularioIva(this.formularioivas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(DatoFormularioIva.class));
		classes.add(new Classe(GrupoParametroFormularioIva.class));
		classes.add(new Classe(ParametroFormularioIva.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//formularioivaLogic.setFormularioIvas(this.formularioivas);
			formularioivaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public FormularioIvaParameterReturnGeneral getFormularioIvaParameterGeneral() {
		return this.formularioivaParameterGeneral;
	}
	
	public void setFormularioIvaParameterGeneral(FormularioIvaParameterReturnGeneral formularioivaParameterGeneral) {
		this.formularioivaParameterGeneral = formularioivaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoFormularioIva() {
		return isPermisoTodoFormularioIva;
	}

	public void setIsPermisoTodoFormularioIva(Boolean isPermisoTodoFormularioIva) {
		this.isPermisoTodoFormularioIva = isPermisoTodoFormularioIva;
	}

	public Boolean getIsPermisoNuevoFormularioIva() {
		return isPermisoNuevoFormularioIva;
	}

	public void setIsPermisoNuevoFormularioIva(Boolean isPermisoNuevoFormularioIva) {
		this.isPermisoNuevoFormularioIva = isPermisoNuevoFormularioIva;
	}

	public Boolean getIsPermisoActualizarFormularioIva() {
		return isPermisoActualizarFormularioIva;
	}

	public void setIsPermisoActualizarFormularioIva(Boolean isPermisoActualizarFormularioIva) {
		this.isPermisoActualizarFormularioIva = isPermisoActualizarFormularioIva;
	}

	public Boolean getIsPermisoEliminarFormularioIva() {
		return isPermisoEliminarFormularioIva;
	}

	public void setIsPermisoEliminarFormularioIva(Boolean isPermisoEliminarFormularioIva) {
		this.isPermisoEliminarFormularioIva = isPermisoEliminarFormularioIva;
	}

	public Boolean getIsPermisoGuardarCambiosFormularioIva() {
		return isPermisoGuardarCambiosFormularioIva;
	}

	public void setIsPermisoGuardarCambiosFormularioIva(Boolean isPermisoGuardarCambiosFormularioIva) {
		this.isPermisoGuardarCambiosFormularioIva = isPermisoGuardarCambiosFormularioIva;
	}
	
	public Boolean getIsPermisoConsultaFormularioIva() {
		return isPermisoConsultaFormularioIva;
	}

	public void setIsPermisoConsultaFormularioIva(Boolean isPermisoConsultaFormularioIva) {
		this.isPermisoConsultaFormularioIva = isPermisoConsultaFormularioIva;
	}

	public Boolean getIsPermisoBusquedaFormularioIva() {
		return isPermisoBusquedaFormularioIva;
	}

	public void setIsPermisoBusquedaFormularioIva(Boolean isPermisoBusquedaFormularioIva) {
		this.isPermisoBusquedaFormularioIva = isPermisoBusquedaFormularioIva;
	}

	public Boolean getIsPermisoReporteFormularioIva() {
		return isPermisoReporteFormularioIva;
	}

	public void setIsPermisoReporteFormularioIva(Boolean isPermisoReporteFormularioIva) {
		this.isPermisoReporteFormularioIva = isPermisoReporteFormularioIva;
	}
	
	public Boolean getIsPermisoPaginacionMedioFormularioIva() {
		return isPermisoPaginacionMedioFormularioIva;
	}

	public void setIsPermisoPaginacionMedioFormularioIva(Boolean isPermisoPaginacionMedioFormularioIva) {
		this.isPermisoPaginacionMedioFormularioIva = isPermisoPaginacionMedioFormularioIva;
	}
	
	public Boolean getIsPermisoPaginacionTodoFormularioIva() {
		return isPermisoPaginacionTodoFormularioIva;
	}

	public void setIsPermisoPaginacionTodoFormularioIva(Boolean isPermisoPaginacionTodoFormularioIva) {
		this.isPermisoPaginacionTodoFormularioIva = isPermisoPaginacionTodoFormularioIva;
	}
	
	public Boolean getIsPermisoPaginacionAltoFormularioIva() {
		return isPermisoPaginacionAltoFormularioIva;
	}

	public void setIsPermisoPaginacionAltoFormularioIva(Boolean isPermisoPaginacionAltoFormularioIva) {
		this.isPermisoPaginacionAltoFormularioIva = isPermisoPaginacionAltoFormularioIva;
	}
	
	public Boolean getIsPermisoCopiarFormularioIva() {
		return isPermisoCopiarFormularioIva;
	}

	public void setIsPermisoCopiarFormularioIva(Boolean isPermisoCopiarFormularioIva) {
		this.isPermisoCopiarFormularioIva = isPermisoCopiarFormularioIva;
	}
	
	public Boolean getIsPermisoVerFormFormularioIva() {
		return isPermisoVerFormFormularioIva;
	}

	public void setIsPermisoVerFormFormularioIva(Boolean isPermisoVerFormFormularioIva) {
		this.isPermisoVerFormFormularioIva = isPermisoVerFormFormularioIva;
	}
	
	public Boolean getIsPermisoDuplicarFormularioIva() {
		return isPermisoDuplicarFormularioIva;
	}

	public void setIsPermisoDuplicarFormularioIva(Boolean isPermisoDuplicarFormularioIva) {
		this.isPermisoDuplicarFormularioIva = isPermisoDuplicarFormularioIva;
	}
	
	public Boolean getIsPermisoOrdenFormularioIva() {
		return isPermisoOrdenFormularioIva;
	}

	public void setIsPermisoOrdenFormularioIva(Boolean isPermisoOrdenFormularioIva) {
		this.isPermisoOrdenFormularioIva = isPermisoOrdenFormularioIva;
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
	
	public Boolean getIsVisibilidadCeldaNuevoFormularioIva() {
		return isVisibilidadCeldaNuevoFormularioIva;
	}

	public void setIsVisibilidadCeldaNuevoFormularioIva(Boolean isVisibilidadCeldaNuevoFormularioIva) {
		this.isVisibilidadCeldaNuevoFormularioIva = isVisibilidadCeldaNuevoFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarFormularioIva() {
		return isVisibilidadCeldaDuplicarFormularioIva;
	}

	public void setIsVisibilidadCeldaDuplicarFormularioIva(Boolean isVisibilidadCeldaDuplicarFormularioIva) {
		this.isVisibilidadCeldaDuplicarFormularioIva = isVisibilidadCeldaDuplicarFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarFormularioIva() {
		return isVisibilidadCeldaCopiarFormularioIva;
	}

	public void setIsVisibilidadCeldaCopiarFormularioIva(Boolean isVisibilidadCeldaCopiarFormularioIva) {
		this.isVisibilidadCeldaCopiarFormularioIva = isVisibilidadCeldaCopiarFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormFormularioIva() {
		return isVisibilidadCeldaVerFormFormularioIva;
	}

	public void setIsVisibilidadCeldaVerFormFormularioIva(Boolean isVisibilidadCeldaVerFormFormularioIva) {
		this.isVisibilidadCeldaVerFormFormularioIva = isVisibilidadCeldaVerFormFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenFormularioIva() {
		return isVisibilidadCeldaOrdenFormularioIva;
	}

	public void setIsVisibilidadCeldaOrdenFormularioIva(Boolean isVisibilidadCeldaOrdenFormularioIva) {
		this.isVisibilidadCeldaOrdenFormularioIva = isVisibilidadCeldaOrdenFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesFormularioIva() {
		return isVisibilidadCeldaNuevoRelacionesFormularioIva;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesFormularioIva(Boolean isVisibilidadCeldaNuevoRelacionesFormularioIva) {
		this.isVisibilidadCeldaNuevoRelacionesFormularioIva = isVisibilidadCeldaNuevoRelacionesFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaModificarFormularioIva() {
		return isVisibilidadCeldaModificarFormularioIva;
	}

	public void setIsVisibilidadCeldaModificarFormularioIva(Boolean isVisibilidadCeldaModificarFormularioIva) {
		this.isVisibilidadCeldaModificarFormularioIva = isVisibilidadCeldaModificarFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarFormularioIva() {
		return isVisibilidadCeldaActualizarFormularioIva;
	}

	public void setIsVisibilidadCeldaActualizarFormularioIva(Boolean isVisibilidadCeldaActualizarFormularioIva) {
		this.isVisibilidadCeldaActualizarFormularioIva = isVisibilidadCeldaActualizarFormularioIva;
	}

	public Boolean getIsVisibilidadCeldaEliminarFormularioIva() {
		return isVisibilidadCeldaEliminarFormularioIva;
	}

	public void setIsVisibilidadCeldaEliminarFormularioIva(Boolean isVisibilidadCeldaEliminarFormularioIva) {
		this.isVisibilidadCeldaEliminarFormularioIva = isVisibilidadCeldaEliminarFormularioIva;
	}

	public Boolean getIsVisibilidadCeldaCancelarFormularioIva() {
		return isVisibilidadCeldaCancelarFormularioIva;
	}

	public void setIsVisibilidadCeldaCancelarFormularioIva(Boolean isVisibilidadCeldaCancelarFormularioIva) {
		this.isVisibilidadCeldaCancelarFormularioIva = isVisibilidadCeldaCancelarFormularioIva;
	}

	public Boolean getIsVisibilidadCeldaGuardarFormularioIva() {
		return isVisibilidadCeldaGuardarFormularioIva;
	}

	public void setIsVisibilidadCeldaGuardarFormularioIva(Boolean isVisibilidadCeldaGuardarFormularioIva) {
		this.isVisibilidadCeldaGuardarFormularioIva = isVisibilidadCeldaGuardarFormularioIva;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosFormularioIva() {
		return isVisibilidadCeldaGuardarCambiosFormularioIva;
	}

	public void setIsVisibilidadCeldaGuardarCambiosFormularioIva(Boolean isVisibilidadCeldaGuardarCambiosFormularioIva) {
		this.isVisibilidadCeldaGuardarCambiosFormularioIva = isVisibilidadCeldaGuardarCambiosFormularioIva;
	}
		
	public FormularioIvaSessionBean getformularioivaSessionBean() {
		return this.formularioivaSessionBean;
	}
	
	public void setformularioivaSessionBean(FormularioIvaSessionBean formularioivaSessionBean) {
		this.formularioivaSessionBean=formularioivaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorDatoFormularioPorGrupo() {
		return this.isVisibilidadBusquedaPorDatoFormularioPorGrupo;
	}

	public void setisVisibilidadBusquedaPorDatoFormularioPorGrupo(Boolean isVisibilidadBusquedaPorDatoFormularioPorGrupo) {
		this.isVisibilidadBusquedaPorDatoFormularioPorGrupo=isVisibilidadBusquedaPorDatoFormularioPorGrupo;
	}

	public Boolean getisVisibilidadFK_IdDatoFormularioIva() {
		return this.isVisibilidadFK_IdDatoFormularioIva;
	}

	public void setisVisibilidadFK_IdDatoFormularioIva(Boolean isVisibilidadFK_IdDatoFormularioIva) {
		this.isVisibilidadFK_IdDatoFormularioIva=isVisibilidadFK_IdDatoFormularioIva;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdGrupoParametroFormularioIva() {
		return this.isVisibilidadFK_IdGrupoParametroFormularioIva;
	}

	public void setisVisibilidadFK_IdGrupoParametroFormularioIva(Boolean isVisibilidadFK_IdGrupoParametroFormularioIva) {
		this.isVisibilidadFK_IdGrupoParametroFormularioIva=isVisibilidadFK_IdGrupoParametroFormularioIva;
	}

	public Boolean getisVisibilidadFK_IdParametroFormularioIva() {
		return this.isVisibilidadFK_IdParametroFormularioIva;
	}

	public void setisVisibilidadFK_IdParametroFormularioIva(Boolean isVisibilidadFK_IdParametroFormularioIva) {
		this.isVisibilidadFK_IdParametroFormularioIva=isVisibilidadFK_IdParametroFormularioIva;
	}

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysFormularioIva(FormularioIva formularioiva)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(formularioiva,null);
				this.setActualParaGuardarEjercicioForeignKey(formularioiva,null);
				this.setActualParaGuardarPeriodoForeignKey(formularioiva,null);
				this.setActualParaGuardarDatoFormularioIvaForeignKey(formularioiva,null);
				this.setActualParaGuardarGrupoParametroFormularioIvaForeignKey(formularioiva,null);
				this.setActualParaGuardarParametroFormularioIvaForeignKey(formularioiva,null);
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
	
	public void bugActualizarReferenciaActual(FormularioIva formularioiva,FormularioIva formularioivaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalFormularioIva(formularioiva);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		formularioivaAux.setId(formularioiva.getId());
		formularioivaAux.setVersionRow(formularioiva.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessFormularioIva();
		
			int intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(FormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualFormularioIva(this.formularioiva,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = formularioivaValidator.getInvalidValues(this.formularioiva);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			formularioivaLogic.setDatosCliente(datosCliente);
			formularioivaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				formularioivaAux=new  FormularioIva();
				
				formularioivaAux.setIsNew(true);
				formularioivaAux.setIsChanged(true);
				
				formularioivaAux.setFormularioIvaOriginal(this.formularioiva);
				
				formularioivaAux.setId(this.formularioiva.getId());	
				formularioivaAux.setVersionRow(this.formularioiva.getVersionRow());	
				formularioivaAux.setid_empresa(this.formularioiva.getid_empresa());	
				formularioivaAux.setid_ejercicio(this.formularioiva.getid_ejercicio());	
				formularioivaAux.setid_periodo(this.formularioiva.getid_periodo());	
				formularioivaAux.setid_dato_formulario_iva(this.formularioiva.getid_dato_formulario_iva());	
				formularioivaAux.setid_grupo_parametro_formulario_iva(this.formularioiva.getid_grupo_parametro_formulario_iva());	
				formularioivaAux.setid_parametro_formulario_iva(this.formularioiva.getid_parametro_formulario_iva());	
				formularioivaAux.setvalor(this.formularioiva.getvalor());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.formularioivaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.formularioivaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(formularioivaAux,formularioivaLogic.getFormularioIvas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formularioivaAux,formularioivas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.formularioivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formularioivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formularioivaLogic.saveFormularioIvas();//WithConnection
						//formularioivaLogic.getSetVersionRowFormularioIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.formularioiva,formularioivaAux);
					
					this.refrescarForeignKeysDescripcionesFormularioIva();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formularioivaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.formularioivaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formularioivaLogic.saveFormularioIvaRelaciones(formularioivaAux);//WithConnection
								//formularioivaLogic.getSetVersionRowFormularioIvas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.formularioiva,formularioivaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.formularioivaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.formularioivaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(formularioivaAux,formularioivaLogic.getFormularioIvas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(formularioivaAux,formularioivas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.formularioiva,formularioivaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				formularioivaAux=new  FormularioIva();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.formularioivaSessionBean.getEsGuardarRelacionado() 
					|| (this.formularioivaSessionBean.getEsGuardarRelacionado() && this.formularioiva.getId()>=0)) {
						
					formularioivaAux.setIsNew(false);
				}
				
				formularioivaAux.setIsDeleted(false);
			
				formularioivaAux.setId(this.formularioiva.getId());	
				formularioivaAux.setVersionRow(this.formularioiva.getVersionRow());	
				formularioivaAux.setid_empresa(this.formularioiva.getid_empresa());	
				formularioivaAux.setid_ejercicio(this.formularioiva.getid_ejercicio());	
				formularioivaAux.setid_periodo(this.formularioiva.getid_periodo());	
				formularioivaAux.setid_dato_formulario_iva(this.formularioiva.getid_dato_formulario_iva());	
				formularioivaAux.setid_grupo_parametro_formulario_iva(this.formularioiva.getid_grupo_parametro_formulario_iva());	
				formularioivaAux.setid_parametro_formulario_iva(this.formularioiva.getid_parametro_formulario_iva());	
				formularioivaAux.setvalor(this.formularioiva.getvalor());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(formularioivaAux,formularioivaLogic.getFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formularioivaAux,formularioivas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.formularioivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formularioivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formularioivaLogic.saveFormularioIvas();//WithConnection
						//formularioivaLogic.getSetVersionRowFormularioIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.formularioiva,formularioivaAux);
					
					this.refrescarForeignKeysDescripcionesFormularioIva();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formularioivaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.formularioivaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formularioivaLogic.saveFormularioIvaRelaciones(formularioivaAux);//WithConnection
								//formularioivaLogic.getSetVersionRowFormularioIvas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.formularioiva,formularioivaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.formularioivaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.formularioivaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(formularioivaAux,formularioivaLogic.getFormularioIvas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(formularioivaAux,formularioivas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.formularioiva,formularioivaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				formularioivaAux=new  FormularioIva();
				
				formularioivaAux.setIsNew(false);
				formularioivaAux.setIsChanged(false);
				
				formularioivaAux.setIsDeleted(true);
				
				formularioivaAux.setId(this.formularioiva.getId());	
				formularioivaAux.setVersionRow(this.formularioiva.getVersionRow());	
				formularioivaAux.setid_empresa(this.formularioiva.getid_empresa());	
				formularioivaAux.setid_ejercicio(this.formularioiva.getid_ejercicio());	
				formularioivaAux.setid_periodo(this.formularioiva.getid_periodo());	
				formularioivaAux.setid_dato_formulario_iva(this.formularioiva.getid_dato_formulario_iva());	
				formularioivaAux.setid_grupo_parametro_formulario_iva(this.formularioiva.getid_grupo_parametro_formulario_iva());	
				formularioivaAux.setid_parametro_formulario_iva(this.formularioiva.getid_parametro_formulario_iva());	
				formularioivaAux.setvalor(this.formularioiva.getvalor());	
				
				if(this.formularioivaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.formularioivaAux.getId()>=0) {	
						this.formularioivasEliminados.add(formularioivaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(formularioivaAux,formularioivaLogic.getFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formularioivaAux,formularioivas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.formularioivaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formularioivaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formularioivaLogic.saveFormularioIvas();//WithConnection
						//formularioivaLogic.getSetVersionRowFormularioIvas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formularioivaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.formularioivaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formularioivaLogic.saveFormularioIvaRelaciones(formularioivaAux);//WithConnection
								//formularioivaLogic.getSetVersionRowFormularioIvas();//WithConnection
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
							if(this.formularioivaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.formularioivaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(formularioivaAux,formularioivaLogic.getFormularioIvas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(formularioivaAux,formularioivas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.getFormularioIvas().addAll(this.formularioivasEliminados);
					
					formularioivaLogic.saveFormularioIvas();//WithConnection
					//formularioivaLogic.getSetVersionRowFormularioIvas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesFormularioIva();
				
				this.formularioivasEliminados= new ArrayList<FormularioIva>();		
			}
			
			if(this.formularioivaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Formulario Iva GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.formularioiva=formularioivaAux;
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
      		//this.finishProcessFormularioIva();
      	}
		
	}	
	
	public void actualizarRelaciones(FormularioIva formularioivaLocal) throws Exception {
		
		if(this.formularioivaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(FormularioIva formularioivaLocal) throws Exception {	
		if(this.formularioivaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				formularioivaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				formularioivaLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				formularioivaLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(DatoFormularioIvaDetalleFormJInternalFrame.class)) {
				DatoFormularioIvaBeanSwingJInternalFrame datoformularioivaBeanSwingJInternalFrameLocal=(DatoFormularioIvaBeanSwingJInternalFrame) ((DatoFormularioIvaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				datoformularioivaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoDatoFormularioIva(datoformularioivaBeanSwingJInternalFrameLocal.getdatoformularioiva(),true);
				datoformularioivaBeanSwingJInternalFrameLocal.actualizarLista(datoformularioivaBeanSwingJInternalFrameLocal.datoformularioiva,this.datoformularioivasForeignKey);

				datoformularioivaBeanSwingJInternalFrameLocal.actualizarRelaciones(datoformularioivaBeanSwingJInternalFrameLocal.datoformularioiva);

				formularioivaLocal.setDatoFormularioIva(datoformularioivaBeanSwingJInternalFrameLocal.datoformularioiva);

				this.addItemDefectoCombosForeignKeyDatoFormularioIva();
				this.cargarCombosFrameDatoFormularioIvasForeignKey("Formulario");
				this.setActualDatoFormularioIvaForeignKey(datoformularioivaBeanSwingJInternalFrameLocal.datoformularioiva.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(GrupoParametroFormularioIvaDetalleFormJInternalFrame.class)) {
				GrupoParametroFormularioIvaBeanSwingJInternalFrame grupoparametroformularioivaBeanSwingJInternalFrameLocal=(GrupoParametroFormularioIvaBeanSwingJInternalFrame) ((GrupoParametroFormularioIvaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				grupoparametroformularioivaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoGrupoParametroFormularioIva(grupoparametroformularioivaBeanSwingJInternalFrameLocal.getgrupoparametroformularioiva(),true);
				grupoparametroformularioivaBeanSwingJInternalFrameLocal.actualizarLista(grupoparametroformularioivaBeanSwingJInternalFrameLocal.grupoparametroformularioiva,this.grupoparametroformularioivasForeignKey);

				grupoparametroformularioivaBeanSwingJInternalFrameLocal.actualizarRelaciones(grupoparametroformularioivaBeanSwingJInternalFrameLocal.grupoparametroformularioiva);

				formularioivaLocal.setGrupoParametroFormularioIva(grupoparametroformularioivaBeanSwingJInternalFrameLocal.grupoparametroformularioiva);

				this.addItemDefectoCombosForeignKeyGrupoParametroFormularioIva();
				this.cargarCombosFrameGrupoParametroFormularioIvasForeignKey("Formulario");
				this.setActualGrupoParametroFormularioIvaForeignKey(grupoparametroformularioivaBeanSwingJInternalFrameLocal.grupoparametroformularioiva.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ParametroFormularioIvaDetalleFormJInternalFrame.class)) {
				ParametroFormularioIvaBeanSwingJInternalFrame parametroformularioivaBeanSwingJInternalFrameLocal=(ParametroFormularioIvaBeanSwingJInternalFrame) ((ParametroFormularioIvaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				parametroformularioivaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoParametroFormularioIva(parametroformularioivaBeanSwingJInternalFrameLocal.getparametroformularioiva(),true);
				parametroformularioivaBeanSwingJInternalFrameLocal.actualizarLista(parametroformularioivaBeanSwingJInternalFrameLocal.parametroformularioiva,this.parametroformularioivasForeignKey);

				parametroformularioivaBeanSwingJInternalFrameLocal.actualizarRelaciones(parametroformularioivaBeanSwingJInternalFrameLocal.parametroformularioiva);

				formularioivaLocal.setParametroFormularioIva(parametroformularioivaBeanSwingJInternalFrameLocal.parametroformularioiva);

				this.addItemDefectoCombosForeignKeyParametroFormularioIva();
				this.cargarCombosFrameParametroFormularioIvasForeignKey("Formulario");
				this.setActualParametroFormularioIvaForeignKey(parametroformularioivaBeanSwingJInternalFrameLocal.parametroformularioiva.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarFormularioIvaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = formularioivaValidator.getInvalidValues(this.formularioiva);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(FormularioIva formularioiva,List<FormularioIva> formularioivas) throws Exception {
		try	{		
			FormularioIvaConstantesFunciones.actualizarLista(formularioiva,formularioivas,this.formularioivaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(FormularioIva formularioiva,List<FormularioIva> formularioivas) throws Exception {
		try	{			
			FormularioIvaConstantesFunciones.actualizarSelectedLista(formularioiva,formularioivas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<FormularioIva> formularioivasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				formularioivasLocal=this.formularioivaLogic.getFormularioIvas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				formularioivasLocal=this.formularioivas;
			}
			//ARCHITECTURE
		
			for(FormularioIva formularioivaLocal:formularioivasLocal) {
				if(this.permiteMantenimiento(formularioivaLocal) && formularioivaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+FormularioIvaConstantesFunciones.getFormularioIvaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(FormularioIvaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioIva.jLabelid_empresaFormularioIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormularioIvaConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioIva.jLabelid_ejercicioFormularioIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormularioIvaConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioIva.jLabelid_periodoFormularioIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormularioIvaConstantesFunciones.IDDATOFORMULARIOIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioIva.jLabelid_dato_formulario_ivaFormularioIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormularioIvaConstantesFunciones.IDGRUPOPARAMETROFORMULARIOIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioIva.jLabelid_grupo_parametro_formulario_ivaFormularioIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormularioIvaConstantesFunciones.IDPARAMETROFORMULARIOIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioIva.jLabelid_parametro_formulario_ivaFormularioIva,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormularioIvaConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioIva.jLabelvalorFormularioIva,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormFormularioIva!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioIva.jLabelid_empresaFormularioIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioIva.jLabelid_ejercicioFormularioIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioIva.jLabelid_periodoFormularioIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioIva.jLabelid_dato_formulario_ivaFormularioIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioIva.jLabelid_grupo_parametro_formulario_ivaFormularioIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioIva.jLabelid_parametro_formulario_ivaFormularioIva,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioIva.jLabelvalorFormularioIva,"");
		
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
		this.iIdNuevoFormularioIva--;	
		
		
		this.formularioivaAux=new FormularioIva();
		
		this.formularioivaAux.setId(this.iIdNuevoFormularioIva);
		this.formularioivaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.formularioivaLogic.getFormularioIvas().add(this.formularioivaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.formularioivas.add(this.formularioivaAux);
		}
		//ARCHITECTURE
		
		this.formularioiva=this.formularioivaAux;
		
		if(FormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioFormularioIva(this.formularioiva);
			this.setVariablesObjetoActualToFormularioForeignKeyFormularioIva(this.formularioiva);
		}
				
		//this.setDefaultControlesFormularioIva();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyFormularioIva();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyFormularioIva();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyFormularioIva();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFormularioIva(this.formularioivaBean,this.formularioiva,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(FormularioIvaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.formularioivaSessionBean.getConGuardarRelaciones()) {
			classes=FormularioIvaConstantesFunciones.getClassesRelationshipsOfFormularioIva(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.formularioivaReturnGeneral=formularioivaLogic.procesarEventosFormularioIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formularioivaLogic.getFormularioIvas(),this.formularioiva,this.formularioivaParameterGeneral,this.isEsNuevoFormularioIva,classes);//this.formularioivaLogic.getFormularioIva()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanFormularioIva(this.formularioivaReturnGeneral,this.formularioivaBean,false);
		
		if(this.formularioivaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyFormularioIva(this.formularioivaReturnGeneral.getFormularioIva());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioFormularioIva(this.formularioivaReturnGeneral.getFormularioIva());
		}
		
		if(this.formularioivaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioFormularioIva(this.formularioivaReturnGeneral.getFormularioIva(),classes);//this.formularioivaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualFormularioIva(this.formularioiva,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyFormularioIva();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyFormularioIva();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FormularioIvaBeanSwingJInternalFrameAdditional.RecargarFormFormularioIva(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingFormularioIva(false);
						
			if(formularioivaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormularioIva();
			}
			
			this.actualizarVisualTableDatosFormularioIva();
			
			this.jTableDatosFormularioIva.setRowSelectionInterval(this.getIndiceNuevoFormularioIva(), this.getIndiceNuevoFormularioIva());
			
			this.seleccionarFilaTablaFormularioIvaActual();
						
			this.actualizarEstadoCeldasBotonesFormularioIva("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesFormularioIva(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormFormularioIva.jTextFieldvalorFormularioIva.setEnabled(isHabilitar && this.formularioivaConstantesFunciones.activarvalorFormularioIva);	
		//
		this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_empresaFormularioIva.setEnabled(isHabilitar && this.formularioivaConstantesFunciones.activarid_empresaFormularioIva);//
		this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_ejercicioFormularioIva.setEnabled(isHabilitar && this.formularioivaConstantesFunciones.activarid_ejercicioFormularioIva);//
		this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_periodoFormularioIva.setEnabled(isHabilitar && this.formularioivaConstantesFunciones.activarid_periodoFormularioIva);
		this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_dato_formulario_ivaFormularioIva.setEnabled(isHabilitar && this.formularioivaConstantesFunciones.activarid_dato_formulario_ivaFormularioIva);
		this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.setEnabled(isHabilitar && this.formularioivaConstantesFunciones.activarid_grupo_parametro_formulario_ivaFormularioIva);
		this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_parametro_formulario_ivaFormularioIva.setEnabled(isHabilitar && this.formularioivaConstantesFunciones.activarid_parametro_formulario_ivaFormularioIva);
	};
	
	public void setDefaultControlesFormularioIva() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoFormularioIva(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.formularioivaSessionBean.setConGuardarRelaciones(true);			
			this.formularioivaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormFormularioIva.jTabbedPaneRelacionesFormularioIva.setVisible(true);
			
					
		} else {
			//this.formularioivaSessionBean.setConGuardarRelaciones(false);			
			this.formularioivaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormFormularioIva.jTabbedPaneRelacionesFormularioIva.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoFormularioIva() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormularioIva formularioivaAux:this.formularioivaLogic.getFormularioIvas()) {
				if(formularioivaAux.getId().equals(this.iIdNuevoFormularioIva)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormularioIva formularioivaAux:this.formularioivas) {
				if(formularioivaAux.getId().equals(this.iIdNuevoFormularioIva)) {
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
	
	public int getIndiceActualFormularioIva(FormularioIva formularioiva,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormularioIva formularioivaAux:this.formularioivaLogic.getFormularioIvas()) {
				if(formularioivaAux.getId().equals(formularioiva.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormularioIva formularioivaAux:this.formularioivas) {
				if(formularioivaAux.getId().equals(formularioiva.getId())) {
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
	
	public void setCamposBaseDesdeOriginalFormularioIva(FormularioIva formularioivaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormularioIva formularioivaAux:this.formularioivaLogic.getFormularioIvas()) {
				if(formularioivaAux.getFormularioIvaOriginal().getId().equals(formularioivaOriginal.getId())) {
					existe=true;
					formularioivaOriginal.setId(formularioivaAux.getId());
					formularioivaOriginal.setVersionRow(formularioivaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormularioIva formularioivaAux:this.formularioivas) {
				if(formularioivaAux.getFormularioIvaOriginal().getId().equals(formularioivaOriginal.getId())) {
					existe=true;
					formularioivaOriginal.setId(formularioivaAux.getId());
					formularioivaOriginal.setVersionRow(formularioivaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosFormularioIva(Boolean esParaCancelar) throws Exception {
		formularioivasAux=new ArrayList<FormularioIva>();
		formularioivaAux=new FormularioIva();
		
		if(!this.formularioivaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FormularioIva formularioivaAux:this.formularioivaLogic.getFormularioIvas()) {
					if(formularioivaAux.getId()<0) {
						formularioivasAux.add(formularioivaAux);
					}		
				}
				this.iIdNuevoFormularioIva=0L;
				this.formularioivaLogic.getFormularioIvas().removeAll(formularioivasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormularioIva formularioivaAux:this.formularioivas) {
					if(formularioivaAux.getId()<0) {
						formularioivasAux.add(formularioivaAux);
					}		
				}
				this.iIdNuevoFormularioIva=0L;
				this.formularioivas.removeAll(formularioivasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoFormularioIva 
					&& this.formularioivaLogic.getFormularioIvas().size()>0
					) {
					formularioivaAux=this.formularioivaLogic.getFormularioIvas().get(this.formularioivaLogic.getFormularioIvas().size() - 1);
				
					if(formularioivaAux.getId()<0) {
						this.formularioivaLogic.getFormularioIvas().remove(formularioivaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoFormularioIva && this.formularioivas.size()>0) {
					formularioivaAux=this.formularioivas.get(this.formularioivas.size() - 1);
				
					if(formularioivaAux.getId()<0) {
						this.formularioivas.remove(formularioivaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoFormularioIva(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(formularioiva.getId()<0) {
				this.formularioivaLogic.getFormularioIvas().remove(this.formularioiva);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(formularioiva.getId()<0) {
				this.formularioivas.remove(this.formularioiva);
			}
		}			
	}
	
	public void setEstadosInicialesFormularioIva(List<FormularioIva> formularioivasAux) throws Exception {
		FormularioIvaConstantesFunciones.setEstadosInicialesFormularioIva(formularioivasAux);
	}
	
	public void setEstadosInicialesFormularioIva(FormularioIva formularioivaAux) throws Exception {
		FormularioIvaConstantesFunciones.setEstadosInicialesFormularioIva(formularioivaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarFormularioIvaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarFormularioIvaActual()) {
				if(!this.isEsNuevoFormularioIva) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoFormularioIva=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarFormularioIvaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Formulario Iva ?", "MANTENIMIENTO DE Formulario Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(FormularioIva formularioiva) throws Exception {
		FormularioIvaConstantesFunciones.seleccionarAsignar(this.formularioiva,formularioiva);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarFormularioIva=this.isPermisoActualizarOriginalFormularioIva;
			
			
			this.seleccionarAsignar(formularioiva);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FormularioIvaConstantesFunciones.quitarEspaciosFormularioIva(this.formularioiva,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesFormularioIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.formularioivaSessionBean.setsFuncionBusquedaRapida(this.formularioivaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoFormularioIva) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosFormularioIva(esParaCancelar);				
				this.cancelarNuevoFormularioIva(esParaCancelar);								
			}
			
			this.formularioiva=new FormularioIva();
			
			this.inicializarFormularioIva();
			
			this.actualizarEstadoCeldasBotonesFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarFormularioIva() throws Exception {
		try {
			FormularioIvaConstantesFunciones.inicializarFormularioIva(this.formularioiva);
			
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
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.formularioivaLogic.getFormularioIvas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteFormularioIvas(String sAccionBusqueda,List<FormularioIva> formularioivasParaReportes) throws Exception {
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
					sPathReporteFinal="FormularioIva"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="FormularioIvaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("FormularioIvaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="FormularioIva"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Formulario Ivas");		
		parameters.put("busquedapor", FormularioIvaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceFormularioIva=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			FormularioIvaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			FormularioIvaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceFormularioIva=new JRBeanArrayDataSource(FormularioIvaJInternalFrame.TraerFormularioIvaBeans(formularioivasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceFormularioIva);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+FormularioIvaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+FormularioIvaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(FormularioIvaBean.TraerFormularioIvaBeans(formularioivasParaReportes).toArray()));
							
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
				this.generarExcelReporteFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,formularioivasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,formularioivasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoFormularioIvaActionPerformed(null);
					//this.generarExcelReporteFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,formularioivasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,formularioivasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,formularioivasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesFormularioIvas(sAccionBusqueda,sTipoArchivoReporte,formularioivasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteFormularioIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<FormularioIva> formularioivasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formularioiva";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormularioIvas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFormularioIva("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(FormularioIva formularioiva : formularioivasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			FormularioIvaConstantesFunciones.generarExcelReporteDataFormularioIva("NORMAL",row,workbook,formularioiva,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderFormularioIva(String sTipo,Row row,Workbook workbook) {
		
		FormularioIvaConstantesFunciones.generarExcelReporteHeaderFormularioIva(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalFormularioIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<FormularioIva> formularioivasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formularioiva_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormularioIvas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(FormularioIva formularioiva : formularioivasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(FormularioIvaConstantesFunciones.getFormularioIvaDescripcion(formularioiva));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioIvaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioIvaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formularioiva.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioIvaConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioIvaConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formularioiva.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioIvaConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioIvaConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formularioiva.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioIvaConstantesFunciones.LABEL_IDDATOFORMULARIOIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioIvaConstantesFunciones.LABEL_IDDATOFORMULARIOIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formularioiva.getdatoformularioiva_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioIvaConstantesFunciones.LABEL_IDGRUPOPARAMETROFORMULARIOIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioIvaConstantesFunciones.LABEL_IDGRUPOPARAMETROFORMULARIOIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formularioiva.getgrupoparametroformularioiva_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioIvaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioIvaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formularioiva.getparametroformularioiva_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioIvaConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioIvaConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formularioiva.getvalor());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesFormularioIvas(String sAccionBusqueda,String sTipoArchivoReporte,List<FormularioIva> formularioivasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<FormularioIva> formularioivasRespaldo=null;
		
		classes=FormularioIvaConstantesFunciones.getClassesRelationshipsOfFormularioIva(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.formularioivaLogic.setDatosCliente(this.datosCliente);
		this.formularioivaLogic.setDatosDeep(this.datosDeep);
		this.formularioivaLogic.setIsConDeep(true);
		
		formularioivasRespaldo=this.formularioivaLogic.getFormularioIvas();
		
		this.formularioivaLogic.setFormularioIvas(formularioivasParaReportes);	
		this.formularioivaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		formularioivasParaReportes=this.formularioivaLogic.getFormularioIvas();
		this.formularioivaLogic.setFormularioIvas(formularioivasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formularioiva_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormularioIvas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFormularioIva("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(FormularioIva formularioiva : formularioivasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderFormularioIva("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			FormularioIvaConstantesFunciones.generarExcelReporteDataFormularioIva("NORMAL",row,workbook,formularioiva,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(FormularioIvaConstantesFunciones.getFormularioIvaDescripcion(formularioiva));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoFormularioIva.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormularioIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoFormularioIva.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormularioIva.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessFormularioIva() throws Exception {		
		this.startProcessFormularioIva(true);
	}
	
	public void startProcessFormularioIva(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasFormularioIva ,this.jPanelParametrosReportesFormularioIva, this.jScrollPanelDatosFormularioIva,this.jPanelPaginacionFormularioIva, this.jScrollPanelDatosEdicionFormularioIva, this.jPanelAccionesFormularioIva,this.jPanelAccionesFormularioFormularioIva,this.jmenuBarFormularioIva,this.jmenuBarDetalleFormularioIva,this.jTtoolBarFormularioIva,this.jTtoolBarDetalleFormularioIva);		
		
		final JTabbedPane jTabbedPaneBusquedasFormularioIva=this.jTabbedPaneBusquedasFormularioIva; 
		
		final JPanel jPanelParametrosReportesFormularioIva=this.jPanelParametrosReportesFormularioIva;
		//final JScrollPane jScrollPanelDatosFormularioIva=this.jScrollPanelDatosFormularioIva;
		final JTable jTableDatosFormularioIva=this.jTableDatosFormularioIva;		
		final JPanel jPanelPaginacionFormularioIva=this.jPanelPaginacionFormularioIva;
		//final JScrollPane jScrollPanelDatosEdicionFormularioIva=this.jScrollPanelDatosEdicionFormularioIva;
		final JPanel jPanelAccionesFormularioIva=this.jPanelAccionesFormularioIva;
		
		JPanel jPanelCamposAuxiliarFormularioIva=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarFormularioIva=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormFormularioIva!=null) {
			jPanelCamposAuxiliarFormularioIva=this.jInternalFrameDetalleFormFormularioIva.jPanelCamposFormularioIva;
			jPanelAccionesFormularioAuxiliarFormularioIva=this.jInternalFrameDetalleFormFormularioIva.jPanelAccionesFormularioFormularioIva;
		}
		
		final JPanel jPanelCamposFormularioIva=jPanelCamposAuxiliarFormularioIva;
		final JPanel jPanelAccionesFormularioFormularioIva=jPanelAccionesFormularioAuxiliarFormularioIva;
		
		
		final JMenuBar jmenuBarFormularioIva=this.jmenuBarFormularioIva;
		final JToolBar jTtoolBarFormularioIva=this.jTtoolBarFormularioIva;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarFormularioIva=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFormularioIva=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormFormularioIva!=null) {
			jmenuBarDetalleAuxiliarFormularioIva=this.jInternalFrameDetalleFormFormularioIva.jmenuBarDetalleFormularioIva;
			jTtoolBarDetalleAuxiliarFormularioIva=this.jInternalFrameDetalleFormFormularioIva.jTtoolBarDetalleFormularioIva;
		}
		
		final JMenuBar jmenuBarDetalleFormularioIva=jmenuBarDetalleAuxiliarFormularioIva;
		final JToolBar jTtoolBarDetalleFormularioIva=jTtoolBarDetalleAuxiliarFormularioIva;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFormularioIva;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFormularioIva;
			processRunnable.jTableDatos=jTableDatosFormularioIva;
			processRunnable.jPanelCampos=jPanelCamposFormularioIva;
			processRunnable.jPanelPaginacion=jPanelPaginacionFormularioIva;
			processRunnable.jPanelAcciones=jPanelAccionesFormularioIva;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFormularioIva;
			
			
			processRunnable.jmenuBar=jmenuBarFormularioIva;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFormularioIva;
			processRunnable.jTtoolBar=jTtoolBarFormularioIva;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFormularioIva;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFormularioIva ,jPanelParametrosReportesFormularioIva,jTableDatosFormularioIva, /*jScrollPanelDatosFormularioIva,*/jPanelCamposFormularioIva,jPanelPaginacionFormularioIva, /*jScrollPanelDatosEdicionFormularioIva,*/ jPanelAccionesFormularioIva,jPanelAccionesFormularioFormularioIva,jmenuBarFormularioIva,jmenuBarDetalleFormularioIva,jTtoolBarFormularioIva,jTtoolBarDetalleFormularioIva);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFormularioIva ,jPanelParametrosReportesFormularioIva, jScrollPanelDatosFormularioIva,jPanelPaginacionFormularioIva, jScrollPanelDatosEdicionFormularioIva, jPanelAccionesFormularioIva,jPanelAccionesFormularioFormularioIva,jmenuBarFormularioIva,jmenuBarDetalleFormularioIva,jTtoolBarFormularioIva,jTtoolBarDetalleFormularioIva);
						
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
	
	public void finishProcessFormularioIva() {// throws Exception 
		this.finishProcessFormularioIva(true);
	}
	
	public void finishProcessFormularioIva(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasFormularioIva ,this.jPanelParametrosReportesFormularioIva, this.jScrollPanelDatosFormularioIva,this.jPanelPaginacionFormularioIva, this.jScrollPanelDatosEdicionFormularioIva, this.jPanelAccionesFormularioIva,this.jPanelAccionesFormularioFormularioIva,this.jmenuBarFormularioIva,this.jmenuBarDetalleFormularioIva,this.jTtoolBarFormularioIva,this.jTtoolBarDetalleFormularioIva);		
		
		final JTabbedPane jTabbedPaneBusquedasFormularioIva=this.jTabbedPaneBusquedasFormularioIva; 
		
		final JPanel jPanelParametrosReportesFormularioIva=this.jPanelParametrosReportesFormularioIva;
		//final JScrollPane jScrollPanelDatosFormularioIva=this.jScrollPanelDatosFormularioIva;
		final JTable jTableDatosFormularioIva=this.jTableDatosFormularioIva;		
		final JPanel jPanelPaginacionFormularioIva=this.jPanelPaginacionFormularioIva;
		//final JScrollPane jScrollPanelDatosEdicionFormularioIva=this.jScrollPanelDatosEdicionFormularioIva;
		final JPanel jPanelAccionesFormularioIva=this.jPanelAccionesFormularioIva;
		
		JPanel jPanelCamposAuxiliarFormularioIva=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarFormularioIva=new JPanel();
		
		if(this.jInternalFrameDetalleFormFormularioIva!=null) {
			jPanelCamposAuxiliarFormularioIva=this.jInternalFrameDetalleFormFormularioIva.jPanelCamposFormularioIva;
			jPanelAccionesFormularioAuxiliarFormularioIva=this.jInternalFrameDetalleFormFormularioIva.jPanelAccionesFormularioFormularioIva;
		}
		
		final JPanel jPanelCamposFormularioIva=jPanelCamposAuxiliarFormularioIva;
		final JPanel jPanelAccionesFormularioFormularioIva=jPanelAccionesFormularioAuxiliarFormularioIva;
		
		
		final JMenuBar jmenuBarFormularioIva=this.jmenuBarFormularioIva;		
		final JToolBar jTtoolBarFormularioIva=this.jTtoolBarFormularioIva;
				
		JMenuBar jmenuBarDetalleAuxiliarFormularioIva=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFormularioIva=new JToolBar();
		
		if(this.jInternalFrameDetalleFormFormularioIva!=null) {
			jmenuBarDetalleAuxiliarFormularioIva=this.jInternalFrameDetalleFormFormularioIva.jmenuBarDetalleFormularioIva;
			jTtoolBarDetalleAuxiliarFormularioIva=this.jInternalFrameDetalleFormFormularioIva.jTtoolBarDetalleFormularioIva;		
		}
		
		final JMenuBar jmenuBarDetalleFormularioIva=jmenuBarDetalleAuxiliarFormularioIva;
		final JToolBar jTtoolBarDetalleFormularioIva=jTtoolBarDetalleAuxiliarFormularioIva;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFormularioIva;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFormularioIva;
			processRunnable.jTableDatos=jTableDatosFormularioIva;
			processRunnable.jPanelCampos=jPanelCamposFormularioIva;
			processRunnable.jPanelPaginacion=jPanelPaginacionFormularioIva;
			processRunnable.jPanelAcciones=jPanelAccionesFormularioIva;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFormularioIva;
			
			
			processRunnable.jmenuBar=jmenuBarFormularioIva;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFormularioIva;
			processRunnable.jTtoolBar=jTtoolBarFormularioIva;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFormularioIva;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasFormularioIva ,jPanelParametrosReportesFormularioIva, jTableDatosFormularioIva,/*jScrollPanelDatosFormularioIva,*/jPanelCamposFormularioIva,jPanelPaginacionFormularioIva, /*jScrollPanelDatosEdicionFormularioIva,*/ jPanelAccionesFormularioIva,jPanelAccionesFormularioFormularioIva,jmenuBarFormularioIva,jmenuBarDetalleFormularioIva,jTtoolBarFormularioIva,jTtoolBarDetalleFormularioIva));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesFormularioIva(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarFormularioIva(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuFormularioIva(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarFormularioIva(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarFormularioIva,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFormularioIva,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuFormularioIva(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarFormularioIva,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFormularioIva,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.formularioivaConstantesFunciones.getsFinalQueryFormularioIva();
		String  finalQueryPaginacionTodos=this.formularioivaConstantesFunciones.getsFinalQueryFormularioIva();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=FormularioIvaConstantesFunciones.getArrayColumnasGlobalesNoFormularioIva(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=FormularioIvaConstantesFunciones.getArrayColumnasGlobalesFormularioIva(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,FormularioIvaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.formularioivasEliminados= new ArrayList<FormularioIva>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessFormularioIva();
		
				///*FormularioIvaSessionBean*/this.formularioivaSessionBean=new FormularioIvaSessionBean();
			
			if(this.formularioivaSessionBean==null) {
				this.formularioivaSessionBean=new FormularioIvaSessionBean();
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
					this.iNumeroPaginacion=FormularioIvaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=FormularioIvaConstantesFunciones.getClassesForeignKeysOfFormularioIva(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/formularioiva."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			formularioivasAux= new ArrayList<FormularioIva>();
			
				
			formularioivaLogic.setDatosCliente(this.datosCliente);
			formularioivaLogic.setDatosDeep(this.datosDeep);
			formularioivaLogic.setIsConDeep(true);
			
			
			formularioivaLogic.getFormularioIvaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					formularioivaLogic.getTodosFormularioIvas(finalQueryGlobal,pagination);
					
					//formularioivaLogic.getTodosFormularioIvasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(formularioivaLogic.getFormularioIvas()==null|| formularioivaLogic.getFormularioIvas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formularioivasAux= new ArrayList<FormularioIva>();
							formularioivasAux.addAll(formularioivaLogic.getFormularioIvas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formularioivasAux= new ArrayList<FormularioIva>();
							formularioivasAux.addAll(formularioivas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formularioivaLogic.getTodosFormularioIvas(finalQueryGlobal+"",this.pagination);												
							
							//formularioivaLogic.getTodosFormularioIvasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteFormularioIvas("Todos",formularioivaLogic.getFormularioIvas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formularioivaLogic.setFormularioIvas(new ArrayList<FormularioIva>());					
							formularioivaLogic.getFormularioIvas().addAll(formularioivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formularioivas=new ArrayList<FormularioIva>();
							formularioivas.addAll(formularioivasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idFormularioIva=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idFormularioIva=this.idActual;
				
				} else if(this.idFormularioIvaActual!=null && this.idFormularioIvaActual!=0L) {
					idFormularioIva=idFormularioIvaActual;
				}
				
					
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndicePorId(idFormularioIva);
				
				this.formularioivas=new ArrayList<FormularioIva>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					formularioivaLogic.getEntity(idFormularioIva);
					
					//formularioivaLogic.getEntityWithConnection(idFormularioIva);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formularioivaLogic.setFormularioIvas(new ArrayList<FormularioIva>());
					formularioivaLogic.getFormularioIvas().add(formularioivaLogic.getFormularioIva());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formularioivas=new ArrayList<FormularioIva>();
					this.formularioivas.add(formularioiva);
				}
				
				if(formularioivaLogic.getFormularioIva()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorDatoFormularioPorGrupo")) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorDatoFormularioPorGrupo(id_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupo,id_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formularioivaLogic.getFormularioIvasBusquedaPorDatoFormularioPorGrupo(finalQueryGlobal,pagination,id_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupo,id_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorDatoFormularioPorGrupo(id_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupo,id_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorDatoFormularioPorGrupo(id_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupo,id_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formularioivaLogic.getFormularioIvas()==null||formularioivaLogic.getFormularioIvas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formularioivas==null|| formularioivas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formularioivasAux=new ArrayList<FormularioIva>();
						formularioivasAux.addAll(formularioivaLogic.getFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formularioivasAux=new ArrayList<FormularioIva>();
							formularioivasAux.addAll(formularioivas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formularioivaLogic.getFormularioIvasBusquedaPorDatoFormularioPorGrupo(finalQueryGlobal,pagination,id_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupo,id_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorDatoFormularioPorGrupo(id_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupo,id_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceBusquedaPorDatoFormularioPorGrupo(id_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupo,id_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormularioIvas("BusquedaPorDatoFormularioPorGrupo",formularioivaLogic.getFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormularioIvas("BusquedaPorDatoFormularioPorGrupo",formularioivas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formularioivaLogic.setFormularioIvas(new ArrayList<FormularioIva>());
						formularioivaLogic.getFormularioIvas().addAll(formularioivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formularioivas=new ArrayList<FormularioIva>();
							formularioivas.addAll(formularioivasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdDatoFormularioIva")) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdDatoFormularioIva(id_dato_formulario_ivaFK_IdDatoFormularioIva);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formularioivaLogic.getFormularioIvasFK_IdDatoFormularioIva(finalQueryGlobal,pagination,id_dato_formulario_ivaFK_IdDatoFormularioIva);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdDatoFormularioIva(id_dato_formulario_ivaFK_IdDatoFormularioIva);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdDatoFormularioIva(id_dato_formulario_ivaFK_IdDatoFormularioIva);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formularioivaLogic.getFormularioIvas()==null||formularioivaLogic.getFormularioIvas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formularioivas==null|| formularioivas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formularioivasAux=new ArrayList<FormularioIva>();
						formularioivasAux.addAll(formularioivaLogic.getFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formularioivasAux=new ArrayList<FormularioIva>();
							formularioivasAux.addAll(formularioivas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formularioivaLogic.getFormularioIvasFK_IdDatoFormularioIva(finalQueryGlobal,pagination,id_dato_formulario_ivaFK_IdDatoFormularioIva);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdDatoFormularioIva(id_dato_formulario_ivaFK_IdDatoFormularioIva);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdDatoFormularioIva(id_dato_formulario_ivaFK_IdDatoFormularioIva);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormularioIvas("FK_IdDatoFormularioIva",formularioivaLogic.getFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormularioIvas("FK_IdDatoFormularioIva",formularioivas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formularioivaLogic.setFormularioIvas(new ArrayList<FormularioIva>());
						formularioivaLogic.getFormularioIvas().addAll(formularioivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formularioivas=new ArrayList<FormularioIva>();
							formularioivas.addAll(formularioivasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formularioivaLogic.getFormularioIvasFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formularioivaLogic.getFormularioIvas()==null||formularioivaLogic.getFormularioIvas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formularioivas==null|| formularioivas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formularioivasAux=new ArrayList<FormularioIva>();
						formularioivasAux.addAll(formularioivaLogic.getFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formularioivasAux=new ArrayList<FormularioIva>();
							formularioivasAux.addAll(formularioivas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formularioivaLogic.getFormularioIvasFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormularioIvas("FK_IdEjercicio",formularioivaLogic.getFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormularioIvas("FK_IdEjercicio",formularioivas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formularioivaLogic.setFormularioIvas(new ArrayList<FormularioIva>());
						formularioivaLogic.getFormularioIvas().addAll(formularioivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formularioivas=new ArrayList<FormularioIva>();
							formularioivas.addAll(formularioivasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formularioivaLogic.getFormularioIvasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formularioivaLogic.getFormularioIvas()==null||formularioivaLogic.getFormularioIvas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formularioivas==null|| formularioivas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formularioivasAux=new ArrayList<FormularioIva>();
						formularioivasAux.addAll(formularioivaLogic.getFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formularioivasAux=new ArrayList<FormularioIva>();
							formularioivasAux.addAll(formularioivas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formularioivaLogic.getFormularioIvasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormularioIvas("FK_IdEmpresa",formularioivaLogic.getFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormularioIvas("FK_IdEmpresa",formularioivas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formularioivaLogic.setFormularioIvas(new ArrayList<FormularioIva>());
						formularioivaLogic.getFormularioIvas().addAll(formularioivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formularioivas=new ArrayList<FormularioIva>();
							formularioivas.addAll(formularioivasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdGrupoParametroFormularioIva")) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdGrupoParametroFormularioIva(id_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIva);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formularioivaLogic.getFormularioIvasFK_IdGrupoParametroFormularioIva(finalQueryGlobal,pagination,id_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIva);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdGrupoParametroFormularioIva(id_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIva);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdGrupoParametroFormularioIva(id_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIva);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formularioivaLogic.getFormularioIvas()==null||formularioivaLogic.getFormularioIvas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formularioivas==null|| formularioivas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formularioivasAux=new ArrayList<FormularioIva>();
						formularioivasAux.addAll(formularioivaLogic.getFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formularioivasAux=new ArrayList<FormularioIva>();
							formularioivasAux.addAll(formularioivas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formularioivaLogic.getFormularioIvasFK_IdGrupoParametroFormularioIva(finalQueryGlobal,pagination,id_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIva);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdGrupoParametroFormularioIva(id_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIva);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdGrupoParametroFormularioIva(id_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIva);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormularioIvas("FK_IdGrupoParametroFormularioIva",formularioivaLogic.getFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormularioIvas("FK_IdGrupoParametroFormularioIva",formularioivas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formularioivaLogic.setFormularioIvas(new ArrayList<FormularioIva>());
						formularioivaLogic.getFormularioIvas().addAll(formularioivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formularioivas=new ArrayList<FormularioIva>();
							formularioivas.addAll(formularioivasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdParametroFormularioIva")) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdParametroFormularioIva(id_parametro_formulario_ivaFK_IdParametroFormularioIva);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formularioivaLogic.getFormularioIvasFK_IdParametroFormularioIva(finalQueryGlobal,pagination,id_parametro_formulario_ivaFK_IdParametroFormularioIva);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdParametroFormularioIva(id_parametro_formulario_ivaFK_IdParametroFormularioIva);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdParametroFormularioIva(id_parametro_formulario_ivaFK_IdParametroFormularioIva);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formularioivaLogic.getFormularioIvas()==null||formularioivaLogic.getFormularioIvas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formularioivas==null|| formularioivas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formularioivasAux=new ArrayList<FormularioIva>();
						formularioivasAux.addAll(formularioivaLogic.getFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formularioivasAux=new ArrayList<FormularioIva>();
							formularioivasAux.addAll(formularioivas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formularioivaLogic.getFormularioIvasFK_IdParametroFormularioIva(finalQueryGlobal,pagination,id_parametro_formulario_ivaFK_IdParametroFormularioIva);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdParametroFormularioIva(id_parametro_formulario_ivaFK_IdParametroFormularioIva);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdParametroFormularioIva(id_parametro_formulario_ivaFK_IdParametroFormularioIva);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormularioIvas("FK_IdParametroFormularioIva",formularioivaLogic.getFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormularioIvas("FK_IdParametroFormularioIva",formularioivas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formularioivaLogic.setFormularioIvas(new ArrayList<FormularioIva>());
						formularioivaLogic.getFormularioIvas().addAll(formularioivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formularioivas=new ArrayList<FormularioIva>();
							formularioivas.addAll(formularioivasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formularioivaLogic.getFormularioIvasFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formularioivaLogic.getFormularioIvas()==null||formularioivaLogic.getFormularioIvas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formularioivas==null|| formularioivas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formularioivasAux=new ArrayList<FormularioIva>();
						formularioivasAux.addAll(formularioivaLogic.getFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formularioivasAux=new ArrayList<FormularioIva>();
							formularioivasAux.addAll(formularioivas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formularioivaLogic.getFormularioIvasFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioIvaConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormularioIvas("FK_IdPeriodo",formularioivaLogic.getFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormularioIvas("FK_IdPeriodo",formularioivas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formularioivaLogic.setFormularioIvas(new ArrayList<FormularioIva>());
						formularioivaLogic.getFormularioIvas().addAll(formularioivasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formularioivas=new ArrayList<FormularioIva>();
							formularioivas.addAll(formularioivasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesFormularioIva();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessFormularioIva();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=formularioivaLogic.getFormularioIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formularioivas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=formularioivaLogic.getFormularioIvas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formularioivas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(FormularioIva formularioiva) {
		Boolean permite=true;
		
		if(this.formularioiva.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=FormularioIvaConstantesFunciones.getOrderByListaFormularioIva();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=FormularioIvaConstantesFunciones.getOrderByListaFormularioIva();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormularioIva formularioiva:formularioivaLogic.getFormularioIvas()) {
				if(formularioiva.getsType().equals(Constantes2.S_TOTALES)) {
					formularioivaTotales=formularioiva;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormularioIva formularioiva:this.formularioivas) {
				if(formularioiva.getsType().equals(Constantes2.S_TOTALES)) {
					formularioivaTotales=formularioiva;
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
			this.formularioivaAux=new FormularioIva();
			this.formularioivaAux.setsType(Constantes2.S_TOTALES);
			this.formularioivaAux.setIsNew(false);
			this.formularioivaAux.setIsChanged(false);
			this.formularioivaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				FormularioIvaConstantesFunciones.TotalizarValoresFilaFormularioIva(this.formularioivaLogic.getFormularioIvas(),this.formularioivaAux);
				
				this.formularioivaLogic.getFormularioIvas().add(this.formularioivaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				FormularioIvaConstantesFunciones.TotalizarValoresFilaFormularioIva(this.formularioivas,this.formularioivaAux);
				
				this.formularioivas.add(this.formularioivaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		formularioivaTotales=new FormularioIva();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.formularioivaLogic.getFormularioIvas().remove(formularioivaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.formularioivas.remove(formularioivaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		formularioivaTotales=new FormularioIva();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormularioIva formularioiva:formularioivaLogic.getFormularioIvas()) {
				if(formularioiva.getsType().equals(Constantes2.S_TOTALES)) {
					formularioivaTotales=formularioiva;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FormularioIvaConstantesFunciones.TotalizarValoresFilaFormularioIva(this.formularioivaLogic.getFormularioIvas(),formularioivaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormularioIva formularioiva:this.formularioivas) {
				if(formularioiva.getsType().equals(Constantes2.S_TOTALES)) {
					formularioivaTotales=formularioiva;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FormularioIvaConstantesFunciones.TotalizarValoresFilaFormularioIva(this.formularioivas,formularioivaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getFormularioIvasBusquedaPorDatoFormularioPorGrupo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorDatoFormularioPorGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormularioIvasFK_IdDatoFormularioIva()throws Exception {
		try {
			sAccionBusqueda="FK_IdDatoFormularioIva";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormularioIvasFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormularioIvasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormularioIvasFK_IdGrupoParametroFormularioIva()throws Exception {
		try {
			sAccionBusqueda="FK_IdGrupoParametroFormularioIva";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormularioIvasFK_IdParametroFormularioIva()throws Exception {
		try {
			sAccionBusqueda="FK_IdParametroFormularioIva";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormularioIvasFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getFormularioIvasBusquedaPorDatoFormularioPorGrupo(String sFinalQuery,Long id_dato_formulario_iva,Long id_grupo_parametro_formulario_iva)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formularioivaLogic.getFormularioIvasBusquedaPorDatoFormularioPorGrupo(sFinalQuery,this.pagination,id_dato_formulario_iva,id_grupo_parametro_formulario_iva);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormularioIvasFK_IdDatoFormularioIva(String sFinalQuery,Long id_dato_formulario_iva)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formularioivaLogic.getFormularioIvasFK_IdDatoFormularioIva(sFinalQuery,this.pagination,id_dato_formulario_iva);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormularioIvasFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formularioivaLogic.getFormularioIvasFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormularioIvasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formularioivaLogic.getFormularioIvasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormularioIvasFK_IdGrupoParametroFormularioIva(String sFinalQuery,Long id_grupo_parametro_formulario_iva)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formularioivaLogic.getFormularioIvasFK_IdGrupoParametroFormularioIva(sFinalQuery,this.pagination,id_grupo_parametro_formulario_iva);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormularioIvasFK_IdParametroFormularioIva(String sFinalQuery,Long id_parametro_formulario_iva)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formularioivaLogic.getFormularioIvasFK_IdParametroFormularioIva(sFinalQuery,this.pagination,id_parametro_formulario_iva);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormularioIvasFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formularioivaLogic.getFormularioIvasFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
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
	
	public void inicializarPermisosFormularioIva() {
		this.isPermisoTodoFormularioIva=false;
		this.isPermisoNuevoFormularioIva=false;
		this.isPermisoActualizarFormularioIva=false;
		this.isPermisoActualizarOriginalFormularioIva=false;
		this.isPermisoEliminarFormularioIva=false;
		this.isPermisoGuardarCambiosFormularioIva=false;
		this.isPermisoConsultaFormularioIva=false;
		this.isPermisoBusquedaFormularioIva=false;
		this.isPermisoReporteFormularioIva=false;		
		this.isPermisoOrdenFormularioIva=false;		
		this.isPermisoPaginacionMedioFormularioIva=false;		
		this.isPermisoPaginacionAltoFormularioIva=false;
		this.isPermisoPaginacionTodoFormularioIva=false;
		this.isPermisoCopiarFormularioIva=false;		
		this.isPermisoVerFormFormularioIva=false;		
		this.isPermisoDuplicarFormularioIva=false;		
		this.isPermisoOrdenFormularioIva=false;		
	}
	
	public void setPermisosUsuarioFormularioIva(Boolean isPermiso) {
		this.isPermisoTodoFormularioIva=isPermiso;
		this.isPermisoNuevoFormularioIva=isPermiso;
		this.isPermisoActualizarFormularioIva=isPermiso;
		this.isPermisoActualizarOriginalFormularioIva=isPermiso;
		this.isPermisoEliminarFormularioIva=isPermiso;
		this.isPermisoGuardarCambiosFormularioIva=isPermiso;
		this.isPermisoConsultaFormularioIva=isPermiso;
		this.isPermisoBusquedaFormularioIva=isPermiso;
		this.isPermisoReporteFormularioIva=isPermiso;
		this.isPermisoOrdenFormularioIva=isPermiso;		
		this.isPermisoPaginacionMedioFormularioIva=isPermiso;		
		this.isPermisoPaginacionAltoFormularioIva=isPermiso;		
		this.isPermisoPaginacionTodoFormularioIva=isPermiso;		
		this.isPermisoCopiarFormularioIva=isPermiso;		
		this.isPermisoVerFormFormularioIva=isPermiso;		
		this.isPermisoDuplicarFormularioIva=isPermiso;
		this.isPermisoOrdenFormularioIva=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioFormularioIva(Boolean isPermiso) {
		//this.isPermisoTodoFormularioIva=isPermiso;
		this.isPermisoNuevoFormularioIva=isPermiso;
		this.isPermisoActualizarFormularioIva=isPermiso;
		this.isPermisoActualizarOriginalFormularioIva=isPermiso;
		this.isPermisoEliminarFormularioIva=isPermiso;
		this.isPermisoGuardarCambiosFormularioIva=isPermiso;
		//this.isPermisoConsultaFormularioIva=isPermiso;
		//this.isPermisoBusquedaFormularioIva=isPermiso;
		//this.isPermisoReporteFormularioIva=isPermiso;
		//this.isPermisoOrdenFormularioIva=isPermiso;		
		//this.isPermisoPaginacionMedioFormularioIva=isPermiso;		
		//this.isPermisoPaginacionAltoFormularioIva=isPermiso;		
		//this.isPermisoPaginacionTodoFormularioIva=isPermiso;		
		//this.isPermisoCopiarFormularioIva=isPermiso;		
		//this.isPermisoDuplicarFormularioIva=isPermiso;
		//this.isPermisoOrdenFormularioIva=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioFormularioIvaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(FormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebFormularioIva(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioFormularioIvaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioFormularioIvaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionFormularioIvaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioFormularioIvaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioFormularioIva() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(FormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.formularioivaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, FormularioIvaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoFormularioIva=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarFormularioIva=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalFormularioIva=this.isPermisoActualizarFormularioIva;
			this.isPermisoEliminarFormularioIva=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosFormularioIva=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaFormularioIva=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaFormularioIva=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoFormularioIva=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteFormularioIva=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFormularioIva=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioFormularioIva=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoFormularioIva=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoFormularioIva=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarFormularioIva=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormFormularioIva=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarFormularioIva=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFormularioIva=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.formularioivaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosFormularioIva.setToolTipText(this.jTableDatosFormularioIva.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioFormularioIva(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioFormularioIva(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(FormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(FormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioFormularioIva() throws Exception {
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
	public void inicializarCombosForeignKeyFormularioIvaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.datoformularioivasForeignKey=new ArrayList();
				this.grupoparametroformularioivasForeignKey=new ArrayList();
				this.parametroformularioivasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyFormularioIvaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(FormularioIvaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyFormularioIvaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyDatoFormularioIvaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyGrupoParametroFormularioIvaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyParametroFormularioIvaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPeriodoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyDatoFormularioIvaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.datoformularioivasForeignKey==null||this.datoformularioivasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=DatoFormularioIvaConstantesFunciones.getArrayColumnasGlobalesDatoFormularioIva(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DatoFormularioIvaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=DatoFormularioIvaConstantesFunciones.SFINALQUERY;

				this.cargarCombosDatoFormularioIvasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyGrupoParametroFormularioIvaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.grupoparametroformularioivasForeignKey==null||this.grupoparametroformularioivasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=GrupoParametroFormularioIvaConstantesFunciones.getArrayColumnasGlobalesGrupoParametroFormularioIva(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,GrupoParametroFormularioIvaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=GrupoParametroFormularioIvaConstantesFunciones.SFINALQUERY;

				this.cargarCombosGrupoParametroFormularioIvasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyParametroFormularioIvaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.parametroformularioivasForeignKey==null||this.parametroformularioivasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ParametroFormularioIvaConstantesFunciones.getArrayColumnasGlobalesParametroFormularioIva(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ParametroFormularioIvaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ParametroFormularioIvaConstantesFunciones.SFINALQUERY;

				this.cargarCombosParametroFormularioIvasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyFormularioIvaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			FormularioIvaParameterReturnGeneral formularioivaReturnGeneral=new FormularioIvaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.formularioivaConstantesFunciones.cargarid_empresaFormularioIva)
					 || (this.esRecargarFks && this.formularioivaConstantesFunciones.cargarid_empresaFormularioIva)) {

					if(!this.formularioivaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+formularioivaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.formularioivaConstantesFunciones.cargarid_ejercicioFormularioIva)
					 || (this.esRecargarFks && this.formularioivaConstantesFunciones.cargarid_ejercicioFormularioIva)) {

					if(!this.formularioivaSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+formularioivaSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.formularioivaConstantesFunciones.cargarid_periodoFormularioIva)
					 || (this.esRecargarFks && this.formularioivaConstantesFunciones.cargarid_periodoFormularioIva)) {

					if(!this.formularioivaSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+formularioivaSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalDatoFormularioIva="";

				if(((this.datoformularioivasForeignKey==null||this.datoformularioivasForeignKey.size()<=0) && this.formularioivaConstantesFunciones.cargarid_dato_formulario_ivaFormularioIva)
					 || (this.esRecargarFks && this.formularioivaConstantesFunciones.cargarid_dato_formulario_ivaFormularioIva)) {

					if(!this.formularioivaSessionBean.getisBusquedaDesdeForeignKeySesionDatoFormularioIva()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=DatoFormularioIvaConstantesFunciones.getArrayColumnasGlobalesDatoFormularioIva(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalDatoFormularioIva=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DatoFormularioIvaConstantesFunciones.TABLENAME);

						finalQueryGlobalDatoFormularioIva=Funciones.GetFinalQueryAppend(finalQueryGlobalDatoFormularioIva, "");
						finalQueryGlobalDatoFormularioIva+=DatoFormularioIvaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosDatoFormularioIvasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalDatoFormularioIva=" WHERE " + ConstantesSql.ID + "="+formularioivaSessionBean.getlidDatoFormularioIvaActual();
					}
				} else {
					finalQueryGlobalDatoFormularioIva="NONE";
				}


				String finalQueryGlobalGrupoParametroFormularioIva="";

				if(((this.grupoparametroformularioivasForeignKey==null||this.grupoparametroformularioivasForeignKey.size()<=0) && this.formularioivaConstantesFunciones.cargarid_grupo_parametro_formulario_ivaFormularioIva)
					 || (this.esRecargarFks && this.formularioivaConstantesFunciones.cargarid_grupo_parametro_formulario_ivaFormularioIva)) {

					if(!this.formularioivaSessionBean.getisBusquedaDesdeForeignKeySesionGrupoParametroFormularioIva()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=GrupoParametroFormularioIvaConstantesFunciones.getArrayColumnasGlobalesGrupoParametroFormularioIva(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalGrupoParametroFormularioIva=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,GrupoParametroFormularioIvaConstantesFunciones.TABLENAME);

						finalQueryGlobalGrupoParametroFormularioIva=Funciones.GetFinalQueryAppend(finalQueryGlobalGrupoParametroFormularioIva, "");
						finalQueryGlobalGrupoParametroFormularioIva+=GrupoParametroFormularioIvaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosGrupoParametroFormularioIvasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalGrupoParametroFormularioIva=" WHERE " + ConstantesSql.ID + "="+formularioivaSessionBean.getlidGrupoParametroFormularioIvaActual();
					}
				} else {
					finalQueryGlobalGrupoParametroFormularioIva="NONE";
				}


				String finalQueryGlobalParametroFormularioIva="";

				if(((this.parametroformularioivasForeignKey==null||this.parametroformularioivasForeignKey.size()<=0) && this.formularioivaConstantesFunciones.cargarid_parametro_formulario_ivaFormularioIva)
					 || (this.esRecargarFks && this.formularioivaConstantesFunciones.cargarid_parametro_formulario_ivaFormularioIva)) {

					if(!this.formularioivaSessionBean.getisBusquedaDesdeForeignKeySesionParametroFormularioIva()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ParametroFormularioIvaConstantesFunciones.getArrayColumnasGlobalesParametroFormularioIva(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalParametroFormularioIva=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ParametroFormularioIvaConstantesFunciones.TABLENAME);

						finalQueryGlobalParametroFormularioIva=Funciones.GetFinalQueryAppend(finalQueryGlobalParametroFormularioIva, "");
						finalQueryGlobalParametroFormularioIva+=ParametroFormularioIvaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosParametroFormularioIvasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalParametroFormularioIva=" WHERE " + ConstantesSql.ID + "="+formularioivaSessionBean.getlidParametroFormularioIvaActual();
					}
				} else {
					finalQueryGlobalParametroFormularioIva="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				formularioivaReturnGeneral=formularioivaLogic.cargarCombosLoteForeignKeyFormularioIva(finalQueryGlobalEmpresa,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalDatoFormularioIva,finalQueryGlobalGrupoParametroFormularioIva,finalQueryGlobalParametroFormularioIva);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=formularioivaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=formularioivaReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=formularioivaReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalDatoFormularioIva.equals("NONE")) {
				this.datoformularioivasForeignKey=formularioivaReturnGeneral.getdatoformularioivasForeignKey();
			}

			if(!finalQueryGlobalGrupoParametroFormularioIva.equals("NONE")) {
				this.grupoparametroformularioivasForeignKey=formularioivaReturnGeneral.getgrupoparametroformularioivasForeignKey();
			}

			if(!finalQueryGlobalParametroFormularioIva.equals("NONE")) {
				this.parametroformularioivasForeignKey=formularioivaReturnGeneral.getparametroformularioivasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyFormularioIva()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyDatoFormularioIva();
			this.addItemDefectoCombosForeignKeyGrupoParametroFormularioIva();
			this.addItemDefectoCombosForeignKeyParametroFormularioIva();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.formularioivaSessionBean==null) {
				this.formularioivaSessionBean=new FormularioIvaSessionBean();
			}

			if(!this.formularioivaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.formularioivaSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPeriodo()throws Exception {
		try {

			if(!this.formularioivaSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				Periodo periodo=new Periodo();
				PeriodoConstantesFunciones.setPeriodoDescripcion(periodo,Constantes.SMENSAJE_ESCOJA_OPCION);
				periodo.setId(null);

				if(!PeriodoConstantesFunciones.ExisteEnLista(this.periodosForeignKey,periodo,true)) {

					this.periodosForeignKey.add(0,periodo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyDatoFormularioIva()throws Exception {
		try {

			if(!this.formularioivaSessionBean.getisBusquedaDesdeForeignKeySesionDatoFormularioIva()) {
				DatoFormularioIva datoformularioiva=new DatoFormularioIva();
				DatoFormularioIvaConstantesFunciones.setDatoFormularioIvaDescripcion(datoformularioiva,Constantes.SMENSAJE_ESCOJA_OPCION);
				datoformularioiva.setId(null);

				if(!DatoFormularioIvaConstantesFunciones.ExisteEnLista(this.datoformularioivasForeignKey,datoformularioiva,true)) {

					this.datoformularioivasForeignKey.add(0,datoformularioiva);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyGrupoParametroFormularioIva()throws Exception {
		try {

			if(!this.formularioivaSessionBean.getisBusquedaDesdeForeignKeySesionGrupoParametroFormularioIva()) {
				GrupoParametroFormularioIva grupoparametroformularioiva=new GrupoParametroFormularioIva();
				GrupoParametroFormularioIvaConstantesFunciones.setGrupoParametroFormularioIvaDescripcion(grupoparametroformularioiva,Constantes.SMENSAJE_ESCOJA_OPCION);
				grupoparametroformularioiva.setId(null);

				if(!GrupoParametroFormularioIvaConstantesFunciones.ExisteEnLista(this.grupoparametroformularioivasForeignKey,grupoparametroformularioiva,true)) {

					this.grupoparametroformularioivasForeignKey.add(0,grupoparametroformularioiva);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyParametroFormularioIva()throws Exception {
		try {

			if(!this.formularioivaSessionBean.getisBusquedaDesdeForeignKeySesionParametroFormularioIva()) {
				ParametroFormularioIva parametroformularioiva=new ParametroFormularioIva();
				ParametroFormularioIvaConstantesFunciones.setParametroFormularioIvaDescripcion(parametroformularioiva,Constantes.SMENSAJE_ESCOJA_OPCION);
				parametroformularioiva.setId(null);

				if(!ParametroFormularioIvaConstantesFunciones.ExisteEnLista(this.parametroformularioivasForeignKey,parametroformularioiva,true)) {

					this.parametroformularioivasForeignKey.add(0,parametroformularioiva);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyFormularioIva()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyFormularioIva(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyFormularioIva()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyFormularioIva();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyFormularioIva(FormularioIva formularioiva)throws Exception {	
		try {
			
			this.setActualDatoFormularioIvaForeignKey(formularioiva.getid_dato_formulario_iva(),false,"Formulario");
			this.setActualGrupoParametroFormularioIvaForeignKey(formularioiva.getid_grupo_parametro_formulario_iva(),false,"Formulario");
			this.setActualParametroFormularioIvaForeignKey(formularioiva.getid_parametro_formulario_iva(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyFormularioIva(FormularioIva formularioiva,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyFormularioIva()throws Exception {	
		try {
			
			this.setActualDatoFormularioIvaForeignKey(this.formularioivaConstantesFunciones.getid_dato_formulario_iva(),false,"Formulario");
			this.setActualGrupoParametroFormularioIvaForeignKey(this.formularioivaConstantesFunciones.getid_grupo_parametro_formulario_iva(),false,"Formulario");
			this.setActualParametroFormularioIvaForeignKey(this.formularioivaConstantesFunciones.getid_parametro_formulario_iva(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyFormularioIva()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormFormularioIva!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_ejercicioFormularioIva.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormFormularioIva!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_periodoFormularioIva.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyFormularioIva()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyFormularioIva()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroFormularioIva()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyFormularioIva()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameDatoFormularioIvasForeignKey("Todos");
			this.cargarCombosFrameGrupoParametroFormularioIvasForeignKey("Todos");
			this.cargarCombosFrameParametroFormularioIvasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyFormularioIva(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameDatoFormularioIvasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameGrupoParametroFormularioIvasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameParametroFormularioIvasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyFormularioIva()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_empresaFormularioIva!=null && this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_empresaFormularioIva.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_empresaFormularioIva.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_ejercicioFormularioIva!=null && this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_ejercicioFormularioIva.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_ejercicioFormularioIva.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_periodoFormularioIva!=null && this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_periodoFormularioIva.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_periodoFormularioIva.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_dato_formulario_ivaFormularioIva!=null && this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_dato_formulario_ivaFormularioIva.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_dato_formulario_ivaFormularioIva.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_grupo_parametro_formulario_ivaFormularioIva!=null && this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_parametro_formulario_ivaFormularioIva!=null && this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_parametro_formulario_ivaFormularioIva.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_parametro_formulario_ivaFormularioIva.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public FormularioIvaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public FormularioIvaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public FormularioIvaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.formularioivaSessionBean=new FormularioIvaSessionBean(); 
		this.formularioivaConstantesFunciones=new FormularioIvaConstantesFunciones(); 
		this.formularioivaBean=new FormularioIva();//(this.formularioivaConstantesFunciones); 		
		this.formularioivaReturnGeneral=new FormularioIvaParameterReturnGeneral(); 
		
		this.formularioivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formularioivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public FormularioIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public FormularioIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public FormularioIvaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessFormularioIva(true);
			
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
			
			this.formularioivaConstantesFunciones=new FormularioIvaConstantesFunciones(); 
			this.formularioivaBean=new FormularioIva();//this.formularioivaConstantesFunciones); 			
			this.formularioivaReturnGeneral=new FormularioIvaParameterReturnGeneral(); 
		
			FormularioIvaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Formulario Iva Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.formularioiva=new FormularioIva();
			this.formularioivas = new ArrayList<FormularioIva>();
			this.formularioivasAux = new ArrayList<FormularioIva>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic=new FormularioIvaLogic();
				this.formularioivaLogic.getNewConnexionToDeep("");
			}
			
			//this.formularioivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.formularioivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormFormularioIva);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoFormularioIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFormularioIva);	
					}
					
					if(this.jInternalFrameImportacionFormularioIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFormularioIva);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByFormularioIva!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByFormularioIva);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormFormularioIva!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormFormularioIva);
				this.jInternalFrameDetalleFormFormularioIva.setVisible(false);
				this.jInternalFrameDetalleFormFormularioIva.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoFormularioIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFormularioIva);
					this.jInternalFrameReporteDinamicoFormularioIva.setVisible(false);
					this.jInternalFrameReporteDinamicoFormularioIva.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionFormularioIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionFormularioIva);
					this.jInternalFrameImportacionFormularioIva.setVisible(false);
					this.jInternalFrameImportacionFormularioIva.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByFormularioIva!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByFormularioIva);
					this.jInternalFrameOrderByFormularioIva.setVisible(false);
					this.jInternalFrameOrderByFormularioIva.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idFormularioIvaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=FormularioIvaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.formularioivaReturnGeneral=new FormularioIvaParameterReturnGeneral();
			
			this.formularioivaParameterGeneral=new FormularioIvaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.formularioivaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.formularioivaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(FormularioIvaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.formularioivaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FormularioIvaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.formularioivaSessionBean.getEsGuardarRelacionado(),this.formularioivaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FormularioIvaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.formularioivaSessionBean.getEsGuardarRelacionado(),this.formularioivaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoFormularioIva=false;
			this.isVisibilidadCeldaDuplicarFormularioIva=true;
			this.isVisibilidadCeldaCopiarFormularioIva=true;
			this.isVisibilidadCeldaVerFormFormularioIva=true;
			this.isVisibilidadCeldaOrdenFormularioIva=true;
			this.isVisibilidadCeldaNuevoRelacionesFormularioIva=false;
			this.isVisibilidadCeldaModificarFormularioIva=false;
			this.isVisibilidadCeldaActualizarFormularioIva=false;
			this.isVisibilidadCeldaEliminarFormularioIva=false;
			this.isVisibilidadCeldaCancelarFormularioIva=false;
			this.isVisibilidadCeldaGuardarFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosFormularioIva=false;
			
			
			this.isVisibilidadBusquedaPorDatoFormularioPorGrupo=true;
			this.isVisibilidadFK_IdDatoFormularioIva=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdGrupoParametroFormularioIva=true;
			this.isVisibilidadFK_IdParametroFormularioIva=true;
			this.isVisibilidadFK_IdPeriodo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosFormularioIva();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioFormularioIva(false);
			
			this.setPermisosUsuarioFormularioIva();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formularioivaSessionBean.getEsGuardarRelacionado() 
				|| (this.formularioivaSessionBean.getEsGuardarRelacionado() && this.formularioivaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioFormularioIvaClasesRelacionadas();
			}
			
			if(this.formularioivaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioFormularioIvaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosFormularioIva();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualFormularioIva();
			}
			
			if(!this.isPermisoBusquedaFormularioIva) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasFormularioIva.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formularioivaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioFormularioIva,this.isPermisoPaginacionMedioFormularioIva,this.isPermisoPaginacionTodoFormularioIva);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(FormularioIvaConstantesFunciones.getTiposSeleccionarFormularioIva());
				
				this.tiposColumnasSelect=FormularioIvaConstantesFunciones.getTiposSeleccionarFormularioIva(true);
				
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
			//if(!this.formularioivaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioFormularioIva();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioFormularioIva(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioFormularioIva(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesFormularioIva() ;
			
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
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.datoformularioivaLogic=new DatoFormularioIvaLogic();
			this.grupoparametroformularioivaLogic=new GrupoParametroFormularioIvaLogic();
			this.parametroformularioivaLogic=new ParametroFormularioIvaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				formularioivaImplementable= (FormularioIvaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FormularioIvaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				formularioivaImplementableHome= (FormularioIvaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FormularioIvaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.formularioivas= new ArrayList<FormularioIva>();
			this.formularioivasEliminados= new ArrayList<FormularioIva>();
						
			this.isEsNuevoFormularioIva=false;
			this.esParaAccionDesdeFormularioFormularioIva=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.datoformularioivasForeignKey=new ArrayList<DatoFormularioIva>() ;
			this.grupoparametroformularioivasForeignKey=new ArrayList<GrupoParametroFormularioIva>() ;
			this.parametroformularioivasForeignKey=new ArrayList<ParametroFormularioIva>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyFormularioIva(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroFormularioIva();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formularioivaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			FormularioIvaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=FormularioIvaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesFormularioIva("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingFormularioIva(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormFormularioIva!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioFormularioIva();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioFormularioIva();
			}
			
			FormularioIvaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasFormularioIva.getTabCount(); i++) {
					this.jTabbedPaneBusquedasFormularioIva.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasFormularioIva.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessFormularioIva(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga FormularioIva: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectFormularioIva() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesFormularioIva")) {
				iIndex=this.jInternalFrameDetalleFormFormularioIva.jTabbedPaneRelacionesFormularioIva.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormFormularioIva.jTabbedPaneRelacionesFormularioIva.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessFormularioIva();	
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
	
	public void cargarCombosForeignKeyFormularioIva(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyFormularioIva(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyFormularioIva(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyFormularioIvaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyFormularioIva();
		
		this.cargarCombosFrameForeignKeyFormularioIva();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyFormularioIva();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyFormularioIva();
		}
	}
	
	

	public void cargarCombosForeignKeyDatoFormularioIva(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyDatoFormularioIvaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyDatoFormularioIva();
				this.cargarCombosFrameDatoFormularioIvasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaDatoFormularioIva(this.datoformularioivasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyGrupoParametroFormularioIva(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyGrupoParametroFormularioIvaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyGrupoParametroFormularioIva();
				this.cargarCombosFrameGrupoParametroFormularioIvasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaGrupoParametroFormularioIva(this.grupoparametroformularioivasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyParametroFormularioIva(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyParametroFormularioIvaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyParametroFormularioIva();
				this.cargarCombosFrameParametroFormularioIvasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaParametroFormularioIva(this.parametroformularioivasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoFormularioIvaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.formularioivaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
			
			
			if(jTableDatosFormularioIva.getRowCount()>=1) {
				jTableDatosFormularioIva.removeRowSelectionInterval(0, jTableDatosFormularioIva.getRowCount()-1);						
			}
			
			this.isEsNuevoFormularioIva=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoFormularioIva(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesFormularioIva(true);			
			//this.formularioiva=new FormularioIva();
			//this.formularioiva.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormularioIva(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormularioIva() ;
			
			if(FormularioIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormularioIva(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.formularioiva);	
			this.actualizarInformacion("INFO_PADRE",false,this.formularioiva);				
			
			FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
			
			if(this.formularioivaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar FormularioIva: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarFormularioIvaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<FormularioIva> formularioivasSeleccionados=new ArrayList<FormularioIva>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosFormularioIva.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosFormularioIva.getSelectedRows().length;			
			}
			
			formularioivasSeleccionados=this.getFormularioIvasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoFormularioIva--;			
				//FormularioIva formularioivaAux= new FormularioIva();			
				//formularioivaAux.setId(this.iIdNuevoFormularioIva);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//FormularioIva formularioivaOrigen=new FormularioIva();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(FormularioIva formularioivaOrigen : formularioivasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							formularioivaOrigen =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formularioivaOrigen =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaFormularioIva();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.formularioiva.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosFormularioIva(formularioivaOrigen,this.formularioiva,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.formularioivaLogic.getFormularioIvas().add(this.formularioivaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.formularioivas.add(this.formularioivaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaFormularioIva(false);
				
				this.jTableDatosFormularioIva.setRowSelectionInterval(this.getIndiceNuevoFormularioIva(), this.getIndiceNuevoFormularioIva());
				
				int iLastRow =  this.jTableDatosFormularioIva.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFormularioIva.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFormularioIva.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFormularioIva(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<FormularioIva> formularioivasSeleccionados=new ArrayList<FormularioIva>();									
		
			FormularioIva formularioivaOrigen=new FormularioIva();
			FormularioIva formularioivaDestino=new FormularioIva();
				
			formularioivasSeleccionados=this.getFormularioIvasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosFormularioIva.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || formularioivasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosFormularioIva.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formularioivaOrigen =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						formularioivaOrigen =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formularioivaDestino =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						formularioivaDestino =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				formularioivaOrigen =formularioivasSeleccionados.get(0);
				formularioivaDestino =formularioivasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosFormularioIva(formularioivaOrigen,formularioivaDestino,true,false);
				
				formularioivaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(formularioivaDestino,formularioivaLogic.getFormularioIvas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formularioivaDestino,formularioivas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaFormularioIva(false);
				
				//this.jTableDatosFormularioIva.setRowSelectionInterval(this.getIndiceNuevoFormularioIva(), this.getIndiceNuevoFormularioIva());
				
				int iLastRow =  this.jTableDatosFormularioIva.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFormularioIva.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFormularioIva.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFormularioIva(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormFormularioIva.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesFormularioIva.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasFormularioIva.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesFormularioIva.setVisible(!isVisible);
			this.jPanelPaginacionFormularioIva.setVisible(!isVisible);
			this.jPanelAccionesFormularioIva.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameFormularioIva();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoFormularioIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionFormularioIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByFormularioIva();
			
			this.abrirFrameOrderByFormularioIva();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByFormularioIva();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleFormularioIva(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormFormularioIva);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormFormularioIva.isMaximum()) {
					this.jInternalFrameDetalleFormFormularioIva.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormFormularioIva.setSize(this.jInternalFrameDetalleFormFormularioIva.iWidthFormulario,this.jInternalFrameDetalleFormFormularioIva.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormFormularioIva.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormFormularioIva.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormFormularioIva.isMaximum()) {
						this.jInternalFrameDetalleFormFormularioIva.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormFormularioIva.jContentPaneDetalleFormularioIva.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormFormularioIva.jTabbedPaneRelacionesFormularioIva.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormFormularioIva.jContentPaneDetalleFormularioIva.getWidth(),FormularioIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFormularioIva.jTabbedPaneRelacionesFormularioIva.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormFormularioIva.jContentPaneDetalleFormularioIva.getWidth(),FormularioIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFormularioIva.jTabbedPaneRelacionesFormularioIva.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormFormularioIva.jContentPaneDetalleFormularioIva.getWidth(),FormularioIvaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormFormularioIva.setVisible(true);
	        this.jInternalFrameDetalleFormFormularioIva.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByFormularioIva() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByFormularioIva==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByFormularioIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormularioIva,false,this);
				} else {
					this.jInternalFrameOrderByFormularioIva=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormularioIva,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByFormularioIva);
				this.jInternalFrameOrderByFormularioIva.setVisible(false);
				this.jInternalFrameOrderByFormularioIva.setSelected(false);
				
				this.jInternalFrameOrderByFormularioIva.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFormularioIva"));
				
				this.inicializarActualizarBindingTablaOrderByFormularioIva();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionFormularioIva() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionFormularioIva==null) {
				
				this.jInternalFrameImportacionFormularioIva=new ImportacionJInternalFrame(FormularioIvaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFormularioIva);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionFormularioIva);
				this.jInternalFrameImportacionFormularioIva.setVisible(false);
				this.jInternalFrameImportacionFormularioIva.setSelected(false);


				this.jInternalFrameImportacionFormularioIva.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFormularioIva"));
				this.jInternalFrameImportacionFormularioIva.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFormularioIva"));
				this.jInternalFrameImportacionFormularioIva.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFormularioIva"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoFormularioIva() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoFormularioIva==null) {
				this.jInternalFrameReporteDinamicoFormularioIva=new ReporteDinamicoJInternalFrame(FormularioIvaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFormularioIva);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFormularioIva);
				this.jInternalFrameReporteDinamicoFormularioIva.setVisible(false);
				this.jInternalFrameReporteDinamicoFormularioIva.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoFormularioIva.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormularioIva"));
				this.jInternalFrameReporteDinamicoFormularioIva.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormularioIva"));
				this.jInternalFrameReporteDinamicoFormularioIva.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormularioIva"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormularioIva();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleFormularioIva() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormFormularioIva);
			
	       	this.jInternalFrameDetalleFormFormularioIva.setVisible(false);
	        this.jInternalFrameDetalleFormFormularioIva.setSelected(false);
			
			//this.jInternalFrameDetalleFormFormularioIva.dispose();
			//this.jInternalFrameDetalleFormFormularioIva=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoFormularioIva() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoFormularioIva.setVisible(true);
	        this.jInternalFrameReporteDinamicoFormularioIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionFormularioIva() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionFormularioIva.setVisible(true);
	        this.jInternalFrameImportacionFormularioIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByFormularioIva() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByFormularioIva.setVisible(true);
	        this.jInternalFrameOrderByFormularioIva.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByFormularioIva() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByFormularioIva.setVisible(false);
	        this.jInternalFrameOrderByFormularioIva.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoFormularioIva() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoFormularioIva.setVisible(false);
	        this.jInternalFrameReporteDinamicoFormularioIva.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionFormularioIva() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionFormularioIva.setVisible(false);
	        this.jInternalFrameImportacionFormularioIva.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarFormularioIva(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarFormularioIva(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesFormularioIva(true);
			//this.isEsNuevoFormularioIva=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesFormularioIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormularioIva(false) ;
			
			if(formularioivaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(FormularioIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormularioIva(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormularioIva(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaFormularioIvaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarFormularioIva(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesFormularioIva(true);
			//this.isEsNuevoFormularioIva=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.formularioiva.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesFormularioIva("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesFormularioIva(false) ;
			
			if(FormularioIvaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormularioIva(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormularioIva(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	public void recargarComboTablaDatoFormularioIva(List<DatoFormularioIva> datoformularioivasForeignKey)throws Exception{
		TableColumn tableColumnDatoFormularioIva=this.jTableDatosFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioIva,FormularioIvaConstantesFunciones.LABEL_IDDATOFORMULARIOIVA));
		TableCellEditor tableCellEditorDatoFormularioIva =tableColumnDatoFormularioIva.getCellEditor();

		DatoFormularioIvaTableCell datoformularioivaTableCellFk=(DatoFormularioIvaTableCell)tableCellEditorDatoFormularioIva;

		if(datoformularioivaTableCellFk!=null) {
			datoformularioivaTableCellFk.setdatoformularioivasForeignKey(datoformularioivasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormularioIva.getSelectedRow();

		//if(intSelectedRow<=0) {
			//datoformularioivaTableCellFk.setRowActual(intSelectedRow);
			//datoformularioivaTableCellFk.setdatoformularioivasForeignKeyActual(datoformularioivasForeignKey);
		//}


		if(datoformularioivaTableCellFk!=null) {
			datoformularioivaTableCellFk.RecargarDatoFormularioIvasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaGrupoParametroFormularioIva(List<GrupoParametroFormularioIva> grupoparametroformularioivasForeignKey)throws Exception{
		TableColumn tableColumnGrupoParametroFormularioIva=this.jTableDatosFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioIva,FormularioIvaConstantesFunciones.LABEL_IDGRUPOPARAMETROFORMULARIOIVA));
		TableCellEditor tableCellEditorGrupoParametroFormularioIva =tableColumnGrupoParametroFormularioIva.getCellEditor();

		GrupoParametroFormularioIvaTableCell grupoparametroformularioivaTableCellFk=(GrupoParametroFormularioIvaTableCell)tableCellEditorGrupoParametroFormularioIva;

		if(grupoparametroformularioivaTableCellFk!=null) {
			grupoparametroformularioivaTableCellFk.setgrupoparametroformularioivasForeignKey(grupoparametroformularioivasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormularioIva.getSelectedRow();

		//if(intSelectedRow<=0) {
			//grupoparametroformularioivaTableCellFk.setRowActual(intSelectedRow);
			//grupoparametroformularioivaTableCellFk.setgrupoparametroformularioivasForeignKeyActual(grupoparametroformularioivasForeignKey);
		//}


		if(grupoparametroformularioivaTableCellFk!=null) {
			grupoparametroformularioivaTableCellFk.RecargarGrupoParametroFormularioIvasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaParametroFormularioIva(List<ParametroFormularioIva> parametroformularioivasForeignKey)throws Exception{
		TableColumn tableColumnParametroFormularioIva=this.jTableDatosFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioIva,FormularioIvaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA));
		TableCellEditor tableCellEditorParametroFormularioIva =tableColumnParametroFormularioIva.getCellEditor();

		ParametroFormularioIvaTableCell parametroformularioivaTableCellFk=(ParametroFormularioIvaTableCell)tableCellEditorParametroFormularioIva;

		if(parametroformularioivaTableCellFk!=null) {
			parametroformularioivaTableCellFk.setparametroformularioivasForeignKey(parametroformularioivasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormularioIva.getSelectedRow();

		//if(intSelectedRow<=0) {
			//parametroformularioivaTableCellFk.setRowActual(intSelectedRow);
			//parametroformularioivaTableCellFk.setparametroformularioivasForeignKeyActual(parametroformularioivasForeignKey);
		//}


		if(parametroformularioivaTableCellFk!=null) {
			parametroformularioivaTableCellFk.RecargarParametroFormularioIvasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesFormularioIva(false);
			
			//if(!this.isEsNuevoFormularioIva) {								
				int intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(FormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualFormularioIva(this.formularioiva,true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);
				
			}
			
			if(this.permiteMantenimiento(this.formularioiva)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.formularioivaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoFormularioIva=true;
					this.inicializarActualizarBindingTablaFormularioIva(false);
					this.isEsNuevoFormularioIva=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoFormularioIva=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoFormularioIva=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFormularioIva(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormularioIva(false);
				
				this.habilitarDeshabilitarControlesFormularioIva(false);
			
												
				
				if(FormularioIvaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleFormularioIva();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoFormularioIvaActionPerformed(evt,formularioivaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualFormularioIva(this.formularioiva,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosFormularioIva.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,formularioivaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.formularioiva.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(FormularioIva.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioIva.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarFormularioIvaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				this.formularioiva.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				this.formularioiva.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.formularioiva)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.formularioivaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((FormularioIvaModel) this.jTableDatosFormularioIva.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoFormularioIva=true;
				this.inicializarActualizarBindingTablaFormularioIva(false);
				this.isEsNuevoFormularioIva=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFormularioIva(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormularioIva(false);
				
				this.habilitarDeshabilitarControlesFormularioIva(false);
				
				
				
				if(FormularioIvaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleFormularioIva();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarFormularioIvaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosFormularioIva.getRowCount()>=1) {
				jTableDatosFormularioIva.removeRowSelectionInterval(0, jTableDatosFormularioIva.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesFormularioIva(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaFormularioIva(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormularioIva(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormularioIva(false) ;
			
			this.isEsNuevoFormularioIva=false;
			
			if(FormularioIvaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleFormularioIva();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingFormularioIva(false);
				
				//SI ES MANUAL
				if(FormularioIvaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualFormularioIva();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoFormularioIva--;			
			//FormularioIva formularioivaAux= new FormularioIva();			
			//formularioivaAux.setId(this.iIdNuevoFormularioIva);
			
			if(this.jInternalFrameDetalleFormFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaFormularioIva();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);
			
			this.formularioiva.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.formularioivaLogic.getFormularioIvas().add(this.formularioivaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.formularioivas.add(this.formularioivaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaFormularioIva(false);
			
			this.jTableDatosFormularioIva.setRowSelectionInterval(this.getIndiceNuevoFormularioIva(), this.getIndiceNuevoFormularioIva());
			
			int iLastRow =  this.jTableDatosFormularioIva.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosFormularioIva.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosFormularioIva.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaFormularioIva(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingFormularioIva(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormularioIva(false);
			
			//SI ES MANUAL
			if(FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormularioIva();
			}
			
			//this.abrirFrameTreeFormularioIva();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Formulario IvaS ?", "MANTENIMIENTO DE Formulario Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionFormularioIva.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralFormularioIva();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.formularioivaReturnGeneral=formularioivaLogic.procesarImportacionFormularioIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.formularioivaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarFormularioIvaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionFormularioIva.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionFormularioIva.setFileImportacion(this.jInternalFrameImportacionFormularioIva.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionFormularioIva.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionFormularioIva.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionFormularioIva.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionFormularioIva.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<FormularioIva> formularioivasSeleccionados=new ArrayList<FormularioIva>();		

		formularioivasSeleccionados=this.getFormularioIvasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormularioIva.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormularioIva.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("FormularioIvaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"FormularioIvaBaseDesign.jrxml";
			
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
			
			this.generarReporteFormularioIvas("Todos",formularioivasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoFormularioIva.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormularioIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FormularioIvaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormularioIvaConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormularioIvaConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormularioIvaConstantesFunciones.LABEL_IDDATOFORMULARIOIVA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_DatoFormularioIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_DatoFormularioIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_DatoFormularioIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_DatoFormularioIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormularioIvaConstantesFunciones.LABEL_IDGRUPOPARAMETROFORMULARIOIVA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_GrupoParametroFormularioIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_GrupoParametroFormularioIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_GrupoParametroFormularioIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_GrupoParametroFormularioIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormularioIvaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ParametroFormularioIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ParametroFormularioIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ParametroFormularioIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ParametroFormularioIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormularioIvaConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoFormularioIva.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoFormularioIva.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoFormularioIva.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case FormularioIvaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case FormularioIvaConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case FormularioIvaConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case FormularioIvaConstantesFunciones.LABEL_IDDATOFORMULARIOIVA:
					sNombreCampoCategoria="id_dato_formulario_iva";
					break;

				case FormularioIvaConstantesFunciones.LABEL_IDGRUPOPARAMETROFORMULARIOIVA:
					sNombreCampoCategoria="id_grupo_parametro_formulario_iva";
					break;

				case FormularioIvaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA:
					sNombreCampoCategoria="id_parametro_formulario_iva";
					break;

				case FormularioIvaConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoFormularioIva.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case FormularioIvaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case FormularioIvaConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case FormularioIvaConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case FormularioIvaConstantesFunciones.LABEL_IDDATOFORMULARIOIVA:
					sNombreCampoCategoriaValor="id_dato_formulario_iva";
					break;

				case FormularioIvaConstantesFunciones.LABEL_IDGRUPOPARAMETROFORMULARIOIVA:
					sNombreCampoCategoriaValor="id_grupo_parametro_formulario_iva";
					break;

				case FormularioIvaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA:
					sNombreCampoCategoriaValor="id_parametro_formulario_iva";
					break;

				case FormularioIvaConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoFormularioIva.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormularioIva.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FormularioIvaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case FormularioIvaConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case FormularioIvaConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case FormularioIvaConstantesFunciones.LABEL_IDDATOFORMULARIOIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dato Formulario Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_dato_formulario_iva");
					break;

				case FormularioIvaConstantesFunciones.LABEL_IDGRUPOPARAMETROFORMULARIOIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Grupo Parametro Formulario Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_grupo_parametro_formulario_iva");
					break;

				case FormularioIvaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Parametro Formulario Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_parametro_formulario_iva");
					break;

				case FormularioIvaConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
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
	
	public void jButtonGenerarExcelReporteDinamicoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<FormularioIva> formularioivasSeleccionados=new ArrayList<FormularioIva>();		
		
		formularioivasSeleccionados=this.getFormularioIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formularioiva";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("FormularioIvas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoFormularioIva.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoFormularioIva.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case FormularioIvaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioIvaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(FormularioIva formularioiva:formularioivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formularioiva.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormularioIvaConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioIvaConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(FormularioIva formularioiva:formularioivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formularioiva.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormularioIvaConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioIvaConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(FormularioIva formularioiva:formularioivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formularioiva.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormularioIvaConstantesFunciones.LABEL_IDDATOFORMULARIOIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioIvaConstantesFunciones.LABEL_IDDATOFORMULARIOIVA);
					iRow++;

					for(FormularioIva formularioiva:formularioivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formularioiva.getdatoformularioiva_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormularioIvaConstantesFunciones.LABEL_IDGRUPOPARAMETROFORMULARIOIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioIvaConstantesFunciones.LABEL_IDGRUPOPARAMETROFORMULARIOIVA);
					iRow++;

					for(FormularioIva formularioiva:formularioivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formularioiva.getgrupoparametroformularioiva_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormularioIvaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioIvaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA);
					iRow++;

					for(FormularioIva formularioiva:formularioivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formularioiva.getparametroformularioiva_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormularioIvaConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioIvaConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(FormularioIva formularioiva:formularioivasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formularioiva.getvalor());
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
			//	this.getFilaCabeceraExportarExcelFormularioIva(row);				
			//	iRow++;
			//}				
			
			//for(FormularioIva formularioivaAux:formularioivasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelFormularioIva(formularioivaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
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
				this.formularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormularioIva(false);
			
			//SI ES MANUAL
			if(FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormularioIva();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormularioIva(false);
			
			//SI ES MANUAL
			if(FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFormularioIva();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesFormularioIvaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormularioIva(false);
			
			//SI ES MANUAL
			if(FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFormularioIva();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaFormularioIva() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosFormularioIva.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosFormularioIva.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosFormularioIva.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosFormularioIva.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosFormularioIva.setMinimumSize(dimensionMinimum);
		this.jTableDatosFormularioIva.setMaximumSize(dimensionMaximum);
		this.jTableDatosFormularioIva.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingFormularioIva(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingFormularioIva(esInicializar,true);
	}
	
	public void inicializarActualizarBindingFormularioIva(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaFormularioIva(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesFormularioIva(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.formularioivaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasFormularioIva(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFormularioIva(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesFormularioIva(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !FormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualFormularioIva() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaFormularioIva();
		
		this.inicializarActualizarBindingBotonesManualFormularioIva(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.formularioivaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualFormularioIva();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFormularioIva() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualFormularioIva(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualFormularioIva(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosFormularioIva.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosFormularioIva.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteFormularioIva.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormFormularioIva!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormFormularioIva.jCheckBoxPostAccionNuevoFormularioIva.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormFormularioIva.jCheckBoxPostAccionSinCerrarFormularioIva.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormFormularioIva.jCheckBoxPostAccionSinMensajeFormularioIva.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosFormularioIva.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosFormularioIva.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteFormularioIva.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormFormularioIva!=null) {
				this.jInternalFrameDetalleFormFormularioIva.jCheckBoxPostAccionNuevoFormularioIva.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormFormularioIva.jCheckBoxPostAccionSinCerrarFormularioIva.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormFormularioIva.jCheckBoxPostAccionSinMensajeFormularioIva.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionFormularioIva.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionFormularioIva.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormFormularioIva!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormFormularioIva.jComboBoxTiposAccionesFormularioFormularioIva.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesFormularioIva.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoFormularioIva!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormularioIva.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesFormularioIva.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesFormularioIva.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarFormularioIva.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesFormularioIva.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoFormularioIva!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormularioIva.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesFormularioIva.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralFormularioIva.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesFormularioIva(Boolean esInicializar) throws Exception {
		try	{	
			if(FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualFormularioIva(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesFormularioIva() throws Exception {
		try	{
			if(FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormularioIva();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFormularioIva() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormFormularioIva.jComboBoxTiposAccionesFormularioFormularioIva.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormFormularioIva.jComboBoxTiposAccionesFormularioFormularioIva.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormularioIva() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesFormularioIva.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesFormularioIva.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesFormularioIva.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionFormularioIva.addItem(reporte);
			}
			
			
			if(!this.formularioivaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionFormularioIva.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionFormularioIva.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesFormularioIva.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesFormularioIva.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormFormularioIva!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormFormularioIva.jComboBoxTiposAccionesFormularioFormularioIva.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormFormularioIva.jComboBoxTiposAccionesFormularioFormularioIva.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarFormularioIva.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarFormularioIva.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarFormularioIva.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormularioIva();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormularioIva() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFormularioIva!=null) {
				this.jInternalFrameReporteDinamicoFormularioIva.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoFormularioIva.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFormularioIva!=null) {
				this.jInternalFrameReporteDinamicoFormularioIva.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoFormularioIva.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoFormularioIva!=null) {
				
				if(this.jInternalFrameReporteDinamicoFormularioIva.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFormularioIva.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormularioIva.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoFormularioIva.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFormularioIva.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormularioIva.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoFormularioIva.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFormularioIva.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=FormularioIvaConstantesFunciones.getTiposSeleccionarFormularioIva(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFormularioIva.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoFormularioIva.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoFormularioIva.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=FormularioIvaConstantesFunciones.getTiposSeleccionarFormularioIva(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFormularioIva.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoFormularioIva.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFormularioIva.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=FormularioIvaConstantesFunciones.getTiposSeleccionarFormularioIva(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormularioIva.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoFormularioIva.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoFormularioIva.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoFormularioIva.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualFormularioIva()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.getSelectedItem()!=null){this.id_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupo=((DatoFormularioIva)this.jComboBoxid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.getSelectedItem()).getId();}
		if(this.jComboBoxid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.getSelectedItem()!=null){this.id_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupo=((GrupoParametroFormularioIva)this.jComboBoxid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupoFormularioIva.getSelectedItem()).getId();}
		if(this.jComboBoxid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva.getSelectedItem()!=null){this.id_dato_formulario_ivaFK_IdDatoFormularioIva=((DatoFormularioIva)this.jComboBoxid_dato_formulario_ivaFK_IdDatoFormularioIvaFormularioIva.getSelectedItem()).getId();}
		if(this.jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva.getSelectedItem()!=null){this.id_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIva=((GrupoParametroFormularioIva)this.jComboBoxid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIvaFormularioIva.getSelectedItem()).getId();}
		if(this.jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva.getSelectedItem()!=null){this.id_parametro_formulario_ivaFK_IdParametroFormularioIva=((ParametroFormularioIva)this.jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioIva.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasFormularioIva(Boolean esInicializar) throws Exception {				
		if(FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualFormularioIva();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaFormularioIva() throws Exception {
		this.inicializarActualizarBindingTablaFormularioIva(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByFormularioIva() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByFormularioIva.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByFormularioIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormularioIva.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new FormularioIvaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByFormularioIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormularioIva.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new FormularioIvaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosFormularioIvaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioIvaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new FormularioIvaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByFormularioIva.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormularioIva.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new FormularioIvaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByFormularioIva.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaFormularioIva(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=formularioivaLogic.getFormularioIvas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=formularioivas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(FormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosFormularioIva.setModel(new FormularioIvaModel(this.formularioivaLogic.getFormularioIvas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosFormularioIva.setModel(new FormularioIvaModel(this.formularioivas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByFormularioIva!=null && this.jInternalFrameOrderByFormularioIva.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByFormularioIva();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioIva,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new FormularioIvaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO,formularioivaConstantesFunciones.resaltarSeleccionarFormularioIva,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+FormularioIvaConstantesFunciones.SCLASSWEBTITULO,formularioivaConstantesFunciones.resaltarSeleccionarFormularioIva,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioIva,FormularioIvaConstantesFunciones.LABEL_ID));

		if(this.formularioivaConstantesFunciones.mostraridFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioIvaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.formularioivaConstantesFunciones.resaltaridFormularioIva,this.formularioivaConstantesFunciones.activaridFormularioIva,iSizeTabla,this,true,"idFormularioIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formularioivaConstantesFunciones.resaltaridFormularioIva,this.formularioivaConstantesFunciones.activaridFormularioIva,this,true,"idFormularioIva","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioIva,FormularioIvaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.formularioivaConstantesFunciones.mostrarid_empresaFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioIvaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.formularioivaConstantesFunciones.resaltarid_empresaFormularioIva,this,this.formularioivaConstantesFunciones.activarid_empresaFormularioIva,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.formularioivaConstantesFunciones.resaltarid_empresaFormularioIva,this,this.formularioivaConstantesFunciones.activarid_empresaFormularioIva,false,"id_empresaFormularioIva","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormularioIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioIva,FormularioIvaConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.formularioivaConstantesFunciones.mostrarid_ejercicioFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioIvaConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.formularioivaConstantesFunciones.resaltarid_ejercicioFormularioIva,this,this.formularioivaConstantesFunciones.activarid_ejercicioFormularioIva,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.formularioivaConstantesFunciones.resaltarid_ejercicioFormularioIva,this,this.formularioivaConstantesFunciones.activarid_ejercicioFormularioIva,false,"id_ejercicioFormularioIva","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormularioIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioIva,FormularioIvaConstantesFunciones.LABEL_IDPERIODO));

		if(this.formularioivaConstantesFunciones.mostrarid_periodoFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioIvaConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.formularioivaConstantesFunciones.resaltarid_periodoFormularioIva,this,this.formularioivaConstantesFunciones.activarid_periodoFormularioIva,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.formularioivaConstantesFunciones.resaltarid_periodoFormularioIva,this,this.formularioivaConstantesFunciones.activarid_periodoFormularioIva,false,"id_periodoFormularioIva","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormularioIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioIva,FormularioIvaConstantesFunciones.LABEL_IDDATOFORMULARIOIVA));

		if(this.formularioivaConstantesFunciones.mostrarid_dato_formulario_ivaFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioIvaConstantesFunciones.LABEL_IDDATOFORMULARIOIVA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new DatoFormularioIvaTableCell(this.datoformularioivasForeignKey,this.formularioivaConstantesFunciones.resaltarid_dato_formulario_ivaFormularioIva,this,this.formularioivaConstantesFunciones.activarid_dato_formulario_ivaFormularioIva,iSizeTabla));
			tableColumn.setCellEditor(new DatoFormularioIvaTableCell(this.datoformularioivasForeignKey,this.formularioivaConstantesFunciones.resaltarid_dato_formulario_ivaFormularioIva,this,this.formularioivaConstantesFunciones.activarid_dato_formulario_ivaFormularioIva,true,"id_dato_formulario_ivaFormularioIva","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormularioIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioIva,FormularioIvaConstantesFunciones.LABEL_IDGRUPOPARAMETROFORMULARIOIVA));

		if(this.formularioivaConstantesFunciones.mostrarid_grupo_parametro_formulario_ivaFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioIvaConstantesFunciones.LABEL_IDGRUPOPARAMETROFORMULARIOIVA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new GrupoParametroFormularioIvaTableCell(this.grupoparametroformularioivasForeignKey,this.formularioivaConstantesFunciones.resaltarid_grupo_parametro_formulario_ivaFormularioIva,this,this.formularioivaConstantesFunciones.activarid_grupo_parametro_formulario_ivaFormularioIva,iSizeTabla));
			tableColumn.setCellEditor(new GrupoParametroFormularioIvaTableCell(this.grupoparametroformularioivasForeignKey,this.formularioivaConstantesFunciones.resaltarid_grupo_parametro_formulario_ivaFormularioIva,this,this.formularioivaConstantesFunciones.activarid_grupo_parametro_formulario_ivaFormularioIva,true,"id_grupo_parametro_formulario_ivaFormularioIva","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormularioIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioIva,FormularioIvaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA));

		if(this.formularioivaConstantesFunciones.mostrarid_parametro_formulario_ivaFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioIvaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ParametroFormularioIvaTableCell(this.parametroformularioivasForeignKey,this.formularioivaConstantesFunciones.resaltarid_parametro_formulario_ivaFormularioIva,this,this.formularioivaConstantesFunciones.activarid_parametro_formulario_ivaFormularioIva,iSizeTabla));
			tableColumn.setCellEditor(new ParametroFormularioIvaTableCell(this.parametroformularioivasForeignKey,this.formularioivaConstantesFunciones.resaltarid_parametro_formulario_ivaFormularioIva,this,this.formularioivaConstantesFunciones.activarid_parametro_formulario_ivaFormularioIva,true,"id_parametro_formulario_ivaFormularioIva","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormularioIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioIva,FormularioIvaConstantesFunciones.LABEL_VALOR));

		if(this.formularioivaConstantesFunciones.mostrarvalorFormularioIva && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioIvaConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.formularioivaConstantesFunciones.resaltarvalorFormularioIva,this.formularioivaConstantesFunciones.activarvalorFormularioIva,iSizeTabla,this,true,"valorFormularioIva","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formularioivaConstantesFunciones.resaltarvalorFormularioIva,this.formularioivaConstantesFunciones.activarvalorFormularioIva,this,true,"valorFormularioIva","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FormularioIvaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.formularioivaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.formularioivaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.formularioivaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFormularioIva.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.formularioivaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.formularioivaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFormularioIva.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarFormularioIva && this.isPermisoGuardarCambiosFormularioIva) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.formularioivaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.formularioivaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosFormularioIva.addColumn(tableColumn);
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
			
			this.jTableDatosFormularioIva.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFormularioIva && this.isPermisoGuardarCambiosFormularioIva) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFormularioIva && this.isPermisoGuardarCambiosFormularioIva) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosFormularioIva.moveColumn(this.jTableDatosFormularioIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosFormularioIva.moveColumn(this.jTableDatosFormularioIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosFormularioIva.moveColumn(this.jTableDatosFormularioIva.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosFormularioIva.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosFormularioIva.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosFormularioIva,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosFormularioIva.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosFormularioIva.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!FormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosFormularioIva.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosFormularioIva.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosFormularioIva.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=formularioivaLogic.getFormularioIvas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=formularioivas.size()-1;
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
		//this.jTableDatosFormularioIva.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosFormularioIva.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosFormularioIva();
			
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
				
				//this.isEsNuevoFormularioIva=false;
					
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
			
				if(this.formularioivaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormFormularioIva==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFormularioIva.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFormularioIva.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.formularioiva.getsType().equals("DUPLICADO")
				   || this.formularioiva.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoFormularioIva=true;
				
				} else {
					this.isEsNuevoFormularioIva=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.formularioivaSessionBean.getEsGuardarRelacionado()) {
					if(this.formularioiva.getId()>=0 && !this.formularioiva.getIsNew()) {						
						this.isEsNuevoFormularioIva=false;
						
					} else {
						this.isEsNuevoFormularioIva=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoFormularioIva(esRelaciones);						
				
				this.seleccionarFormularioIva(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.formularioiva.getId()<0) {
					this.isEsNuevoFormularioIva=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarFormularioIva(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarFormularioIva(evt,rowIndex);
				}	
				
				if(this.formularioivaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion FormularioIva: " + this.dDif); 
					}
				}								
				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarFormularioIva(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.formularioiva)) {
					if(this.formularioiva.getId()>0) {
						this.formularioiva.setIsDeleted(true);
						
						this.formularioivasEliminados.add(this.formularioiva);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.formularioivaLogic.getFormularioIvas().remove(this.formularioiva);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.formularioivas.remove(this.formularioiva);				
					}
					
					
					((FormularioIvaModel) this.jTableDatosFormularioIva.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaFormularioIva(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarFormularioIva(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoFormularioIva) {
			
			if(this.jInternalFrameDetalleFormFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFormularioIva.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFormularioIva.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(FormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioFormularioIva(this.formularioiva);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.formularioivaConstantesFunciones.cargarid_empresaFormularioIva || this.formularioivaConstantesFunciones.event_dependid_empresaFormularioIva) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.formularioiva.getid_empresa());
									//this.inicializarActualizarBindingFormularioIva(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(formularioiva.getEmpresa()!=null) {
							this.empresasForeignKey.add(formularioiva.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.formularioiva.getid_empresa(),false,"Formulario");

					//Ejercicio
					if(!this.formularioivaConstantesFunciones.cargarid_ejercicioFormularioIva || this.formularioivaConstantesFunciones.event_dependid_ejercicioFormularioIva) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.formularioiva.getid_ejercicio());
									//this.inicializarActualizarBindingFormularioIva(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(formularioiva.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(formularioiva.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.formularioiva.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.formularioivaConstantesFunciones.cargarid_periodoFormularioIva || this.formularioivaConstantesFunciones.event_dependid_periodoFormularioIva) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.formularioiva.getid_periodo());
									//this.inicializarActualizarBindingFormularioIva(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(formularioiva.getPeriodo()!=null) {
							this.periodosForeignKey.add(formularioiva.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.formularioiva.getid_periodo(),false,"Formulario");

					//DatoFormularioIva
					if(!this.formularioivaConstantesFunciones.cargarid_dato_formulario_ivaFormularioIva || this.formularioivaConstantesFunciones.event_dependid_dato_formulario_ivaFormularioIva) {
						//this.cargarCombosDatoFormularioIvasForeignKeyLista(" where id="+this.formularioiva.getid_dato_formulario_iva());
									//this.inicializarActualizarBindingFormularioIva(false,false);
						this.datoformularioivasForeignKey=new ArrayList<DatoFormularioIva>();

						if(formularioiva.getDatoFormularioIva()!=null) {
							this.datoformularioivasForeignKey.add(formularioiva.getDatoFormularioIva());
						}

						this.addItemDefectoCombosForeignKeyDatoFormularioIva();
						this.cargarCombosFrameDatoFormularioIvasForeignKey("Todos");
					}
					this.setActualDatoFormularioIvaForeignKey(this.formularioiva.getid_dato_formulario_iva(),false,"Formulario");

					//GrupoParametroFormularioIva
					if(!this.formularioivaConstantesFunciones.cargarid_grupo_parametro_formulario_ivaFormularioIva || this.formularioivaConstantesFunciones.event_dependid_grupo_parametro_formulario_ivaFormularioIva) {
						//this.cargarCombosGrupoParametroFormularioIvasForeignKeyLista(" where id="+this.formularioiva.getid_grupo_parametro_formulario_iva());
									//this.inicializarActualizarBindingFormularioIva(false,false);
						this.grupoparametroformularioivasForeignKey=new ArrayList<GrupoParametroFormularioIva>();

						if(formularioiva.getGrupoParametroFormularioIva()!=null) {
							this.grupoparametroformularioivasForeignKey.add(formularioiva.getGrupoParametroFormularioIva());
						}

						this.addItemDefectoCombosForeignKeyGrupoParametroFormularioIva();
						this.cargarCombosFrameGrupoParametroFormularioIvasForeignKey("Todos");
					}
					this.setActualGrupoParametroFormularioIvaForeignKey(this.formularioiva.getid_grupo_parametro_formulario_iva(),false,"Formulario");

					//ParametroFormularioIva
					if(!this.formularioivaConstantesFunciones.cargarid_parametro_formulario_ivaFormularioIva || this.formularioivaConstantesFunciones.event_dependid_parametro_formulario_ivaFormularioIva) {
						//this.cargarCombosParametroFormularioIvasForeignKeyLista(" where id="+this.formularioiva.getid_parametro_formulario_iva());
									//this.inicializarActualizarBindingFormularioIva(false,false);
						this.parametroformularioivasForeignKey=new ArrayList<ParametroFormularioIva>();

						if(formularioiva.getParametroFormularioIva()!=null) {
							this.parametroformularioivasForeignKey.add(formularioiva.getParametroFormularioIva());
						}

						this.addItemDefectoCombosForeignKeyParametroFormularioIva();
						this.cargarCombosFrameParametroFormularioIvasForeignKey("Todos");
					}
					this.setActualParametroFormularioIvaForeignKey(this.formularioiva.getid_parametro_formulario_iva(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesFormularioIva("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesFormularioIva(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormularioIva() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoFormularioIva(FormularioIva formularioiva) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoFormularioIva(formularioiva,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoFormularioIva(FormularioIva formularioiva,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioFormularioIva(formularioiva);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyFormularioIva(formularioiva,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyFormularioIva(formularioiva);
	}
	
	public void setVariablesObjetoActualToFormularioFormularioIva(FormularioIva formularioiva) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormFormularioIva.jLabelidFormularioIva.setText(formularioiva.getId().toString());
			this.jInternalFrameDetalleFormFormularioIva.jTextFieldvalorFormularioIva.setText(formularioiva.getvalor().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,FormularioIva formularioivaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,formularioivaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,FormularioIva formularioivaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				formularioivaLocal=this.formularioiva;
			} else {
				formularioivaLocal=this.formularioivaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(formularioivaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoFormularioIva(formularioivaLocal,true);
					
					if(formularioivaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(formularioivaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.formularioivaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(formularioivaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoFormularioIva(FormularioIva formularioiva,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFormularioIva(formularioiva,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(formularioiva);
	}
	
	public void setVariablesFormularioToObjetoActualFormularioIva(FormularioIva formularioiva,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFormularioIva(formularioiva,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualFormularioIva(FormularioIva formularioiva,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormFormularioIva==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormFormularioIva.jLabelidFormularioIva.getText()==null || this.jInternalFrameDetalleFormFormularioIva.jLabelidFormularioIva.getText()=="" || this.jInternalFrameDetalleFormFormularioIva.jLabelidFormularioIva.getText()=="Id") {
				this.jInternalFrameDetalleFormFormularioIva.jLabelidFormularioIva.setText("0");
			}

			if(conColumnasBase) {formularioiva.setId(Long.parseLong(this.jInternalFrameDetalleFormFormularioIva.jLabelidFormularioIva.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormularioIvaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioIva.jLabelIdFormularioIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formularioiva.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormFormularioIva.jTextFieldvalorFormularioIva.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormularioIvaConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioIva.jLabelvalorFormularioIva,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFormularioIva(FormularioIva formularioivaBean,FormularioIva formularioiva,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && formularioivaBean.getid_dato_formulario_iva()!=null && !formularioivaBean.getid_dato_formulario_iva().equals(-1L))) {formularioiva.setid_dato_formulario_iva(formularioivaBean.getid_dato_formulario_iva());}
			if(conDefault || (!conDefault && formularioivaBean.getid_grupo_parametro_formulario_iva()!=null && !formularioivaBean.getid_grupo_parametro_formulario_iva().equals(-1L))) {formularioiva.setid_grupo_parametro_formulario_iva(formularioivaBean.getid_grupo_parametro_formulario_iva());}
			if(conDefault || (!conDefault && formularioivaBean.getid_parametro_formulario_iva()!=null && !formularioivaBean.getid_parametro_formulario_iva().equals(-1L))) {formularioiva.setid_parametro_formulario_iva(formularioivaBean.getid_parametro_formulario_iva());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosFormularioIva(FormularioIva formularioivaOrigen,FormularioIva formularioiva,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && formularioivaOrigen.getId()!=null && !formularioivaOrigen.getId().equals(0L))) {formularioiva.setId(formularioivaOrigen.getId());}}
			if(conDefault || (!conDefault && formularioivaOrigen.getid_dato_formulario_iva()!=null && !formularioivaOrigen.getid_dato_formulario_iva().equals(-1L))) {formularioiva.setid_dato_formulario_iva(formularioivaOrigen.getid_dato_formulario_iva());}
			if(conDefault || (!conDefault && formularioivaOrigen.getid_grupo_parametro_formulario_iva()!=null && !formularioivaOrigen.getid_grupo_parametro_formulario_iva().equals(-1L))) {formularioiva.setid_grupo_parametro_formulario_iva(formularioivaOrigen.getid_grupo_parametro_formulario_iva());}
			if(conDefault || (!conDefault && formularioivaOrigen.getid_parametro_formulario_iva()!=null && !formularioivaOrigen.getid_parametro_formulario_iva().equals(-1L))) {formularioiva.setid_parametro_formulario_iva(formularioivaOrigen.getid_parametro_formulario_iva());}
			if(conDefault || (!conDefault && formularioivaOrigen.getvalor()!=null && !formularioivaOrigen.getvalor().equals(0.0))) {formularioiva.setvalor(formularioivaOrigen.getvalor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFormularioIva(FormularioIva formularioiva) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFormularioIva.jLabelidFormularioIva.setText(formularioiva.getId().toString());
			this.jInternalFrameDetalleFormFormularioIva.jTextFieldvalorFormularioIva.setText(formularioiva.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFormularioIva(FormularioIvaBean formularioivaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFormularioIva.jLabelidFormularioIva.setText(formularioivaBean.getId().toString());
			this.jInternalFrameDetalleFormFormularioIva.jTextFieldvalorFormularioIva.setText(formularioivaBean.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanFormularioIva(FormularioIvaParameterReturnGeneral formularioivaReturnGeneral,FormularioIvaBean formularioivaBean,Boolean conDefault) throws Exception { 
		try {
			FormularioIva formularioivaLocal=new FormularioIva();
			
			formularioivaLocal=formularioivaReturnGeneral.getFormularioIva();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && formularioivaLocal.getId()!=null && !formularioivaLocal.getId().equals(0L))) {formularioivaBean.setId(formularioivaLocal.getId());}}
			if(conDefault || (!conDefault && formularioivaLocal.getid_dato_formulario_iva()!=null && !formularioivaLocal.getid_dato_formulario_iva().equals(-1L))) {formularioivaBean.setid_dato_formulario_iva(formularioivaLocal.getid_dato_formulario_iva());}
			if(conDefault || (!conDefault && formularioivaLocal.getid_grupo_parametro_formulario_iva()!=null && !formularioivaLocal.getid_grupo_parametro_formulario_iva().equals(-1L))) {formularioivaBean.setid_grupo_parametro_formulario_iva(formularioivaLocal.getid_grupo_parametro_formulario_iva());}
			if(conDefault || (!conDefault && formularioivaLocal.getid_parametro_formulario_iva()!=null && !formularioivaLocal.getid_parametro_formulario_iva().equals(-1L))) {formularioivaBean.setid_parametro_formulario_iva(formularioivaLocal.getid_parametro_formulario_iva());}
			if(conDefault || (!conDefault && formularioivaLocal.getvalor()!=null && !formularioivaLocal.getvalor().equals(0.0))) {formularioivaBean.setvalor(formularioivaLocal.getvalor());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxFormularioIvaGenerico(Long idFormularioIvaSeleccionado,JComboBox jComboBoxFormularioIva,List<FormularioIva> formularioivasLocal)throws Exception {
		try {
			FormularioIva  formularioivaTemp=null;

			for(FormularioIva formularioivaAux:formularioivasLocal) {
				if(formularioivaAux.getId()!=null && formularioivaAux.getId().equals(idFormularioIvaSeleccionado)) {
					formularioivaTemp=formularioivaAux;
					break;
				}
			}

			jComboBoxFormularioIva.setSelectedItem(formularioivaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxFormularioIvaGenerico(JComboBox jComboBoxFormularioIva,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFormularioIva.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxFormularioIva.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFormularioIva.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxFormularioIva.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formularioiva=(FormularioIva) formularioivaLogic.getFormularioIvas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			formularioiva =(FormularioIva) formularioivas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!formularioiva.getIsNew() && !formularioiva.getIsChanged() && !formularioiva.getIsDeleted()) {
				sDescripcion=formularioiva.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=formularioiva.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!formularioiva.getIsNew() && !formularioiva.getIsChanged() && !formularioiva.getIsDeleted()) {
				sDescripcion=formularioiva.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=formularioiva.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!formularioiva.getIsNew() && !formularioiva.getIsChanged() && !formularioiva.getIsDeleted()) {
				sDescripcion=formularioiva.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=formularioiva.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("DatoFormularioIva")) {
			//sDescripcion=this.getActualDatoFormularioIvaForeignKeyDescripcion((Long)value);
			if(!formularioiva.getIsNew() && !formularioiva.getIsChanged() && !formularioiva.getIsDeleted()) {
				sDescripcion=formularioiva.getdatoformularioiva_descripcion();
			} else {
				//sDescripcion=this.getActualDatoFormularioIvaForeignKeyDescripcion((Long)value);
				sDescripcion=formularioiva.getdatoformularioiva_descripcion();
			}
		}

		if(sTipo.equals("GrupoParametroFormularioIva")) {
			//sDescripcion=this.getActualGrupoParametroFormularioIvaForeignKeyDescripcion((Long)value);
			if(!formularioiva.getIsNew() && !formularioiva.getIsChanged() && !formularioiva.getIsDeleted()) {
				sDescripcion=formularioiva.getgrupoparametroformularioiva_descripcion();
			} else {
				//sDescripcion=this.getActualGrupoParametroFormularioIvaForeignKeyDescripcion((Long)value);
				sDescripcion=formularioiva.getgrupoparametroformularioiva_descripcion();
			}
		}

		if(sTipo.equals("ParametroFormularioIva")) {
			//sDescripcion=this.getActualParametroFormularioIvaForeignKeyDescripcion((Long)value);
			if(!formularioiva.getIsNew() && !formularioiva.getIsChanged() && !formularioiva.getIsDeleted()) {
				sDescripcion=formularioiva.getparametroformularioiva_descripcion();
			} else {
				//sDescripcion=this.getActualParametroFormularioIvaForeignKeyDescripcion((Long)value);
				sDescripcion=formularioiva.getparametroformularioiva_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		FormularioIva formularioivaRow=new FormularioIva();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formularioivaRow=(FormularioIva) formularioivaLogic.getFormularioIvas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			formularioivaRow=(FormularioIva) formularioivas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualFormularioIva(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoFormularioIva.setVisible((this.isVisibilidadCeldaNuevoFormularioIva && this.isPermisoNuevoFormularioIva));			
			this.jButtonDuplicarFormularioIva.setVisible((this.isVisibilidadCeldaDuplicarFormularioIva && this.isPermisoDuplicarFormularioIva));			
			this.jButtonCopiarFormularioIva.setVisible((this.isVisibilidadCeldaCopiarFormularioIva && this.isPermisoCopiarFormularioIva));
			this.jButtonVerFormFormularioIva.setVisible((this.isVisibilidadCeldaVerFormFormularioIva && this.isPermisoVerFormFormularioIva));
			
			this.jButtonAbrirOrderByFormularioIva.setVisible((this.isVisibilidadCeldaOrdenFormularioIva && this.isPermisoOrdenFormularioIva));			
			
			this.jButtonNuevoRelacionesFormularioIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormularioIva && this.isPermisoNuevoFormularioIva));			
			this.jButtonNuevoGuardarCambiosFormularioIva.setVisible((this.isVisibilidadCeldaNuevoFormularioIva && this.isPermisoNuevoFormularioIva && this.isPermisoGuardarCambiosFormularioIva));
			
			if(this.jInternalFrameDetalleFormFormularioIva!=null) {
			this.jInternalFrameDetalleFormFormularioIva.jButtonModificarFormularioIva.setVisible((this.isVisibilidadCeldaModificarFormularioIva && this.isPermisoActualizarFormularioIva));	
			this.jInternalFrameDetalleFormFormularioIva.jButtonActualizarFormularioIva.setVisible((this.isVisibilidadCeldaActualizarFormularioIva && this.isPermisoActualizarFormularioIva));	
			this.jInternalFrameDetalleFormFormularioIva.jButtonEliminarFormularioIva.setVisible((this.isVisibilidadCeldaEliminarFormularioIva && this.isPermisoEliminarFormularioIva));
			this.jInternalFrameDetalleFormFormularioIva.jButtonCancelarFormularioIva.setVisible(this.isVisibilidadCeldaCancelarFormularioIva);							
			this.jInternalFrameDetalleFormFormularioIva.jButtonGuardarCambiosFormularioIva.setVisible((this.isVisibilidadCeldaGuardarFormularioIva && this.isPermisoGuardarCambiosFormularioIva));			
			
			}
						
			this.jButtonGuardarCambiosTablaFormularioIva.setVisible((this.isVisibilidadCeldaGuardarCambiosFormularioIva && this.isPermisoGuardarCambiosFormularioIva));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarFormularioIva.setVisible((this.isVisibilidadCeldaNuevoFormularioIva && this.isPermisoNuevoFormularioIva));						
			this.jButtonDuplicarToolBarFormularioIva.setVisible((this.isVisibilidadCeldaDuplicarFormularioIva && this.isPermisoDuplicarFormularioIva));						
			this.jButtonCopiarToolBarFormularioIva.setVisible((this.isVisibilidadCeldaCopiarFormularioIva && this.isPermisoCopiarFormularioIva));			
			this.jButtonVerFormToolBarFormularioIva.setVisible((this.isVisibilidadCeldaVerFormFormularioIva && this.isPermisoVerFormFormularioIva));			
			this.jButtonAbrirOrderByToolBarFormularioIva.setVisible((this.isVisibilidadCeldaOrdenFormularioIva && this.isPermisoOrdenFormularioIva));
			this.jButtonNuevoRelacionesToolBarFormularioIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormularioIva && this.isPermisoNuevoFormularioIva));			
			this.jButtonNuevoGuardarCambiosToolBarFormularioIva.setVisible((this.isVisibilidadCeldaNuevoFormularioIva && this.isPermisoNuevoFormularioIva && this.isPermisoGuardarCambiosFormularioIva));			
			
			if(this.jInternalFrameDetalleFormFormularioIva!=null) {
			this.jInternalFrameDetalleFormFormularioIva.jButtonModificarToolBarFormularioIva.setVisible((this.isVisibilidadCeldaModificarFormularioIva && this.isPermisoActualizarFormularioIva));	
			this.jInternalFrameDetalleFormFormularioIva.jButtonActualizarToolBarFormularioIva.setVisible((this.isVisibilidadCeldaActualizarFormularioIva  && this.isPermisoActualizarFormularioIva));	
			this.jInternalFrameDetalleFormFormularioIva.jButtonEliminarToolBarFormularioIva.setVisible((this.isVisibilidadCeldaEliminarFormularioIva && this.isPermisoEliminarFormularioIva));
			this.jInternalFrameDetalleFormFormularioIva.jButtonCancelarToolBarFormularioIva.setVisible(this.isVisibilidadCeldaCancelarFormularioIva);				
			this.jInternalFrameDetalleFormFormularioIva.jButtonGuardarCambiosToolBarFormularioIva.setVisible((this.isVisibilidadCeldaGuardarFormularioIva && this.isPermisoGuardarCambiosFormularioIva));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarFormularioIva.setVisible((this.isVisibilidadCeldaGuardarCambiosFormularioIva && this.isPermisoGuardarCambiosFormularioIva));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoFormularioIva.setVisible((this.isVisibilidadCeldaNuevoFormularioIva && this.isPermisoNuevoFormularioIva));			
			this.jMenuItemDuplicarFormularioIva.setVisible((this.isVisibilidadCeldaDuplicarFormularioIva && this.isPermisoDuplicarFormularioIva));			
			this.jMenuItemCopiarFormularioIva.setVisible((this.isVisibilidadCeldaCopiarFormularioIva && this.isPermisoCopiarFormularioIva));			
			this.jMenuItemVerFormFormularioIva.setVisible((this.isVisibilidadCeldaVerFormFormularioIva && this.isPermisoVerFormFormularioIva));			
			this.jMenuItemAbrirOrderByFormularioIva.setVisible((this.isVisibilidadCeldaOrdenFormularioIva && this.isPermisoOrdenFormularioIva));			
			//this.jMenuItemMostrarOcultarFormularioIva.setVisible((this.isVisibilidadCeldaOrdenFormularioIva && this.isPermisoOrdenFormularioIva));
			this.jMenuItemDetalleAbrirOrderByFormularioIva.setVisible((this.isVisibilidadCeldaOrdenFormularioIva && this.isPermisoOrdenFormularioIva));			
			//this.jMenuItemDetalleMostrarOcultarFormularioIva.setVisible((this.isVisibilidadCeldaOrdenFormularioIva && this.isPermisoOrdenFormularioIva));			
			this.jMenuItemNuevoRelacionesFormularioIva.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormularioIva && this.isPermisoNuevoFormularioIva));			
			this.jMenuItemNuevoGuardarCambiosFormularioIva.setVisible((this.isVisibilidadCeldaNuevoFormularioIva && this.isPermisoNuevoFormularioIva && this.isPermisoGuardarCambiosFormularioIva));									
			
			if(this.jInternalFrameDetalleFormFormularioIva!=null) {
			this.jInternalFrameDetalleFormFormularioIva.jMenuItemModificarFormularioIva.setVisible((this.isVisibilidadCeldaModificarFormularioIva && this.isPermisoActualizarFormularioIva));	
			this.jInternalFrameDetalleFormFormularioIva.jMenuItemActualizarFormularioIva.setVisible((this.isVisibilidadCeldaActualizarFormularioIva && this.isPermisoActualizarFormularioIva));	
			this.jInternalFrameDetalleFormFormularioIva.jMenuItemEliminarFormularioIva.setVisible((this.isVisibilidadCeldaEliminarFormularioIva && this.isPermisoEliminarFormularioIva));
			this.jInternalFrameDetalleFormFormularioIva.jMenuItemCancelarFormularioIva.setVisible(this.isVisibilidadCeldaCancelarFormularioIva);				
			}
			
			this.jMenuItemGuardarCambiosFormularioIva.setVisible((this.isVisibilidadCeldaGuardarFormularioIva && this.isPermisoGuardarCambiosFormularioIva));						
			this.jMenuItemGuardarCambiosTablaFormularioIva.setVisible((this.isVisibilidadCeldaGuardarCambiosFormularioIva && this.isPermisoGuardarCambiosFormularioIva));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoFormularioIva=this.jButtonNuevoFormularioIva.isVisible();
			this.isVisibilidadCeldaDuplicarFormularioIva=this.jButtonDuplicarFormularioIva.isVisible();
			this.isVisibilidadCeldaCopiarFormularioIva=this.jButtonCopiarFormularioIva.isVisible();
			this.isVisibilidadCeldaVerFormFormularioIva=this.jButtonVerFormFormularioIva.isVisible();
			
			this.isVisibilidadCeldaOrdenFormularioIva=this.jButtonAbrirOrderByFormularioIva.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesFormularioIva=this.jButtonNuevoRelacionesFormularioIva.isVisible();
			this.isVisibilidadCeldaModificarFormularioIva=this.jButtonModificarFormularioIva.isVisible();
			
			if(this.jInternalFrameDetalleFormFormularioIva!=null) {
			this.isVisibilidadCeldaActualizarFormularioIva=this.jInternalFrameDetalleFormFormularioIva.jButtonActualizarFormularioIva.isVisible();
			this.isVisibilidadCeldaEliminarFormularioIva=this.jInternalFrameDetalleFormFormularioIva.jButtonEliminarFormularioIva.isVisible();
			this.isVisibilidadCeldaCancelarFormularioIva=this.jInternalFrameDetalleFormFormularioIva.jButtonCancelarFormularioIva.isVisible();
			this.isVisibilidadCeldaGuardarFormularioIva=this.jInternalFrameDetalleFormFormularioIva.jButtonGuardarCambiosFormularioIva.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosFormularioIva=this.jButtonGuardarCambiosTablaFormularioIva.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoFormularioIva=this.jButtonNuevoToolBarFormularioIva.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFormularioIva=this.jButtonNuevoRelacionesToolBarFormularioIva.isVisible();
			
			if(this.jInternalFrameDetalleFormFormularioIva!=null) {
			this.isVisibilidadCeldaModificarFormularioIva=this.jInternalFrameDetalleFormFormularioIva.jButtonModificarToolBarFormularioIva.isVisible();
			this.isVisibilidadCeldaActualizarFormularioIva=this.jInternalFrameDetalleFormFormularioIva.jButtonActualizarToolBarFormularioIva.isVisible();
			this.isVisibilidadCeldaEliminarFormularioIva=this.jInternalFrameDetalleFormFormularioIva.jButtonEliminarToolBarFormularioIva.isVisible();
			this.isVisibilidadCeldaCancelarFormularioIva=this.jInternalFrameDetalleFormFormularioIva.jButtonCancelarToolBarFormularioIva.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFormularioIva=this.jButtonGuardarCambiosToolBarFormularioIva.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFormularioIva=this.jButtonGuardarCambiosTablaToolBarFormularioIva.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoFormularioIva=this.jMenuItemNuevoFormularioIva.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFormularioIva=this.jMenuItemNuevoRelacionesFormularioIva.isVisible();
			
			if(this.jInternalFrameDetalleFormFormularioIva!=null) {
			this.isVisibilidadCeldaModificarFormularioIva=this.jInternalFrameDetalleFormFormularioIva.jMenuItemModificarFormularioIva.isVisible();
			this.isVisibilidadCeldaActualizarFormularioIva=this.jInternalFrameDetalleFormFormularioIva.jMenuItemActualizarFormularioIva.isVisible();
			this.isVisibilidadCeldaEliminarFormularioIva=this.jInternalFrameDetalleFormFormularioIva.jMenuItemEliminarFormularioIva.isVisible();
			this.isVisibilidadCeldaCancelarFormularioIva=this.jInternalFrameDetalleFormFormularioIva.jMenuItemCancelarFormularioIva.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFormularioIva=this.jMenuItemGuardarCambiosFormularioIva.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFormularioIva=this.jMenuItemGuardarCambiosTablaFormularioIva.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesFormularioIva(Boolean esInicializar) {
		if(FormularioIvaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.formularioivaSessionBean.getConGuardarRelaciones()) {
				//if(this.formularioivaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesFormularioIva();
			}
			
			this.inicializarActualizarBindingBotonesManualFormularioIva(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualFormularioIva() {
		this.jButtonNuevoFormularioIva.setVisible(this.isPermisoNuevoFormularioIva);			
		this.jButtonDuplicarFormularioIva.setVisible(this.isPermisoDuplicarFormularioIva);			
		this.jButtonCopiarFormularioIva.setVisible(this.isPermisoCopiarFormularioIva);			
		this.jButtonVerFormFormularioIva.setVisible(this.isPermisoVerFormFormularioIva);			
		
		this.jButtonAbrirOrderByFormularioIva.setVisible(this.isPermisoOrdenFormularioIva);					
		
		this.jButtonNuevoRelacionesFormularioIva.setVisible(this.isPermisoNuevoFormularioIva);			
		
		if(this.jInternalFrameDetalleFormFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioIva.jButtonModificarFormularioIva.setVisible(this.isPermisoActualizarFormularioIva);	
			this.jInternalFrameDetalleFormFormularioIva.jButtonActualizarFormularioIva.setVisible(this.isPermisoActualizarFormularioIva);	
			this.jInternalFrameDetalleFormFormularioIva.jButtonEliminarFormularioIva.setVisible(this.isPermisoEliminarFormularioIva);
			this.jInternalFrameDetalleFormFormularioIva.jButtonCancelarFormularioIva.setVisible(this.isVisibilidadCeldaCancelarFormularioIva);						
			this.jInternalFrameDetalleFormFormularioIva.jButtonGuardarCambiosFormularioIva.setVisible(this.isPermisoGuardarCambiosFormularioIva);							
		}
		
		this.jButtonGuardarCambiosTablaFormularioIva.setVisible(this.isPermisoActualizarFormularioIva);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleFormularioIva() {
		this.jInternalFrameDetalleFormFormularioIva.jButtonModificarFormularioIva.setVisible(this.isPermisoActualizarFormularioIva);	
		this.jInternalFrameDetalleFormFormularioIva.jButtonActualizarFormularioIva.setVisible(this.isPermisoActualizarFormularioIva);	
		this.jInternalFrameDetalleFormFormularioIva.jButtonEliminarFormularioIva.setVisible(this.isPermisoEliminarFormularioIva);
		this.jInternalFrameDetalleFormFormularioIva.jButtonCancelarFormularioIva.setVisible(this.isVisibilidadCeldaCancelarFormularioIva);							
		this.jInternalFrameDetalleFormFormularioIva.jButtonGuardarCambiosFormularioIva.setVisible((this.isVisibilidadCeldaGuardarFormularioIva && this.isPermisoGuardarCambiosFormularioIva));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosFormularioIva() {
		if(FormularioIvaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualFormularioIva();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesFormularioIva() {
	}
	
	public void jTableDatosFormularioIvaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarFormularioIva(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioIva(this.getformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formularioiva==null) {
						this.formularioiva = new FormularioIva();
					}

					this.setVariablesFormularioToObjetoActualFormularioIva(this.formularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);
				}

				if(this.formularioiva.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.formularioiva.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaFormularioIvaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebFormularioIva(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormularioIva.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormularioIva.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormularioIva(this.getformularioiva(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.formularioivaLogic.getConnexion());

				if(this.formularioiva.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.formularioiva.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormularioIva=(TitledBorder)this.jScrollPanelDatosFormularioIva.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderFormularioIva.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioIva(this.getformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formularioiva==null) {
						this.formularioiva = new FormularioIva();
					}

					this.setVariablesFormularioToObjetoActualFormularioIva(this.formularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);
				}

				if(this.formularioiva.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.formularioiva.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioFormularioIvaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebFormularioIva(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormularioIva.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormularioIva.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormularioIva(this.getformularioiva(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.formularioivaLogic.getConnexion());

				if(this.formularioiva.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.formularioiva.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormularioIva=(TitledBorder)this.jScrollPanelDatosFormularioIva.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderFormularioIva.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioIva(this.getformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formularioiva==null) {
						this.formularioiva = new FormularioIva();
					}

					this.setVariablesFormularioToObjetoActualFormularioIva(this.formularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);
				}

				if(this.formularioiva.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.formularioiva.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoFormularioIvaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebFormularioIva(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormularioIva.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormularioIva.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormularioIva(this.getformularioiva(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.formularioivaLogic.getConnexion());

				if(this.formularioiva.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.formularioiva.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormularioIva=(TitledBorder)this.jScrollPanelDatosFormularioIva.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderFormularioIva.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioIva(this.getformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formularioiva==null) {
						this.formularioiva = new FormularioIva();
					}

					this.setVariablesFormularioToObjetoActualFormularioIva(this.formularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);
				}

				if(this.formularioiva.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.formularioiva.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_dato_formulario_ivaFormularioIvaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisodatoformularioiva=true;

			idTienePermisodatoformularioiva=this.tienePermisosUsuarioEnPaginaWebFormularioIva(DatoFormularioIvaConstantesFunciones.CLASSNAME);

			if(idTienePermisodatoformularioiva) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormularioIva.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormularioIva.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormularioIva(this.getformularioiva(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);

				this.datoformularioivaBeanSwingJInternalFrame=new DatoFormularioIvaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.datoformularioivaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.datoformularioivaBeanSwingJInternalFrame.getDatoFormularioIvaLogic().setConnexion(this.formularioivaLogic.getConnexion());

				if(this.formularioiva.getid_dato_formulario_iva()!=null) {
					this.datoformularioivaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.datoformularioivaBeanSwingJInternalFrame.setIdActual(this.formularioiva.getid_dato_formulario_iva());
					this.datoformularioivaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.datoformularioivaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.datoformularioivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoFormularioIva();
				}

				JInternalFrameBase jinternalFrame =this.datoformularioivaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormularioIva=(TitledBorder)this.jScrollPanelDatosFormularioIva.getBorder();
				TitledBorder titledBorderdatoformularioiva=(TitledBorder)this.datoformularioivaBeanSwingJInternalFrame.jScrollPanelDatosDatoFormularioIva.getBorder();

				titledBorderdatoformularioiva.setTitle(titledBorderFormularioIva.getTitle() + " -> Dato Formulario Iva");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_dato_formulario_ivaFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioIva(this.getformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formularioiva==null) {
						this.formularioiva = new FormularioIva();
					}

					this.setVariablesFormularioToObjetoActualFormularioIva(this.formularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);
				}

				if(this.formularioiva.getid_dato_formulario_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_dato_formulario_iva = "+this.formularioiva.getid_dato_formulario_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_grupo_parametro_formulario_ivaFormularioIvaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisogrupoparametroformularioiva=true;

			idTienePermisogrupoparametroformularioiva=this.tienePermisosUsuarioEnPaginaWebFormularioIva(GrupoParametroFormularioIvaConstantesFunciones.CLASSNAME);

			if(idTienePermisogrupoparametroformularioiva) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormularioIva.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormularioIva.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormularioIva(this.getformularioiva(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);

				this.grupoparametroformularioivaBeanSwingJInternalFrame=new GrupoParametroFormularioIvaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.grupoparametroformularioivaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.grupoparametroformularioivaBeanSwingJInternalFrame.getGrupoParametroFormularioIvaLogic().setConnexion(this.formularioivaLogic.getConnexion());

				if(this.formularioiva.getid_grupo_parametro_formulario_iva()!=null) {
					this.grupoparametroformularioivaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.grupoparametroformularioivaBeanSwingJInternalFrame.setIdActual(this.formularioiva.getid_grupo_parametro_formulario_iva());
					this.grupoparametroformularioivaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.grupoparametroformularioivaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.grupoparametroformularioivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaGrupoParametroFormularioIva();
				}

				JInternalFrameBase jinternalFrame =this.grupoparametroformularioivaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormularioIva=(TitledBorder)this.jScrollPanelDatosFormularioIva.getBorder();
				TitledBorder titledBordergrupoparametroformularioiva=(TitledBorder)this.grupoparametroformularioivaBeanSwingJInternalFrame.jScrollPanelDatosGrupoParametroFormularioIva.getBorder();

				titledBordergrupoparametroformularioiva.setTitle(titledBorderFormularioIva.getTitle() + " -> Grupo Parametro Formulario Iva");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_grupo_parametro_formulario_ivaFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioIva(this.getformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formularioiva==null) {
						this.formularioiva = new FormularioIva();
					}

					this.setVariablesFormularioToObjetoActualFormularioIva(this.formularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);
				}

				if(this.formularioiva.getid_grupo_parametro_formulario_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_grupo_parametro_formulario_iva = "+this.formularioiva.getid_grupo_parametro_formulario_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_parametro_formulario_ivaFormularioIvaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoparametroformularioiva=true;

			idTienePermisoparametroformularioiva=this.tienePermisosUsuarioEnPaginaWebFormularioIva(ParametroFormularioIvaConstantesFunciones.CLASSNAME);

			if(idTienePermisoparametroformularioiva) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormularioIva.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormularioIva.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormularioIva(this.getformularioiva(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);

				this.parametroformularioivaBeanSwingJInternalFrame=new ParametroFormularioIvaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.parametroformularioivaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.parametroformularioivaBeanSwingJInternalFrame.getParametroFormularioIvaLogic().setConnexion(this.formularioivaLogic.getConnexion());

				if(this.formularioiva.getid_parametro_formulario_iva()!=null) {
					this.parametroformularioivaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.parametroformularioivaBeanSwingJInternalFrame.setIdActual(this.formularioiva.getid_parametro_formulario_iva());
					this.parametroformularioivaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.parametroformularioivaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.parametroformularioivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroFormularioIva();
				}

				JInternalFrameBase jinternalFrame =this.parametroformularioivaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormularioIva=(TitledBorder)this.jScrollPanelDatosFormularioIva.getBorder();
				TitledBorder titledBorderparametroformularioiva=(TitledBorder)this.parametroformularioivaBeanSwingJInternalFrame.jScrollPanelDatosParametroFormularioIva.getBorder();

				titledBorderparametroformularioiva.setTitle(titledBorderFormularioIva.getTitle() + " -> Parametro Formulario Iva");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_parametro_formulario_ivaFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioIva(this.getformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formularioiva==null) {
						this.formularioiva = new FormularioIva();
					}

					this.setVariablesFormularioToObjetoActualFormularioIva(this.formularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);
				}

				if(this.formularioiva.getid_parametro_formulario_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_parametro_formulario_iva = "+this.formularioiva.getid_parametro_formulario_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorFormularioIvaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioIva(this.getformularioiva(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formularioiva==null) {
						this.formularioiva = new FormularioIva();
					}

					this.setVariablesFormularioToObjetoActualFormularioIva(this.formularioiva,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);
				}

				if(this.formularioiva.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.formularioiva.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioIva(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorDatoFormularioPorGrupoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormularioIva(false,false);

			this.getFormularioIvasBusquedaPorDatoFormularioPorGrupo();

			this.inicializarActualizarBindingFormularioIva(false);

			//if(FormularioIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormularioIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdDatoFormularioIvaFormularioIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormularioIva(false,false);

			this.getFormularioIvasFK_IdDatoFormularioIva();

			this.inicializarActualizarBindingFormularioIva(false);

			//if(FormularioIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormularioIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioFormularioIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormularioIva(false,false);

			this.getFormularioIvasFK_IdEjercicio();

			this.inicializarActualizarBindingFormularioIva(false);

			//if(FormularioIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormularioIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaFormularioIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormularioIva(false,false);

			this.getFormularioIvasFK_IdEmpresa();

			this.inicializarActualizarBindingFormularioIva(false);

			//if(FormularioIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormularioIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdGrupoParametroFormularioIvaFormularioIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormularioIva(false,false);

			this.getFormularioIvasFK_IdGrupoParametroFormularioIva();

			this.inicializarActualizarBindingFormularioIva(false);

			//if(FormularioIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormularioIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdParametroFormularioIvaFormularioIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormularioIva(false,false);

			this.getFormularioIvasFK_IdParametroFormularioIva();

			this.inicializarActualizarBindingFormularioIva(false);

			//if(FormularioIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormularioIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoFormularioIvaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormularioIva(false,false);

			this.getFormularioIvasFK_IdPeriodo();

			this.inicializarActualizarBindingFormularioIva(false);

			//if(FormularioIvaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormularioIva(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formularioivaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameFormularioIva() {
		if(this.jInternalFrameDetalleFormFormularioIva!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormFormularioIva!=null) {
			this.jInternalFrameDetalleFormFormularioIva.setVisible(false);	    			
			this.jInternalFrameDetalleFormFormularioIva.dispose();
			this.jInternalFrameDetalleFormFormularioIva=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoFormularioIva!=null) {
			this.jInternalFrameReporteDinamicoFormularioIva.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoFormularioIva.dispose();
			this.jInternalFrameReporteDinamicoFormularioIva=null;
		}
		
		if(this.jInternalFrameImportacionFormularioIva!=null) {
			this.jInternalFrameImportacionFormularioIva.setVisible(false);	    			
			this.jInternalFrameImportacionFormularioIva.dispose();
			this.jInternalFrameImportacionFormularioIva=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessFormularioIva();
			
			FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
			
			
			if(sTipo.equals("NuevoFormularioIva")) {
				jButtonNuevoFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarFormularioIva")) {
				jButtonDuplicarFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarFormularioIva")) {
				jButtonCopiarFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("VerFormFormularioIva")) {
				jButtonVerFormFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarFormularioIva")) {
				jButtonNuevoFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarFormularioIva")) {
				jButtonDuplicarFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoFormularioIva")) {
				jButtonNuevoFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarFormularioIva")) {
				jButtonDuplicarFormularioIvaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesFormularioIva")) {
				jButtonNuevoFormularioIvaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarFormularioIva")) {
				jButtonNuevoFormularioIvaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesFormularioIva")) {
				jButtonNuevoFormularioIvaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarFormularioIva")) {
				jButtonModificarFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarFormularioIva")) {
				jButtonModificarFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarFormularioIva")) {
				jButtonModificarFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarFormularioIva")) {
				jButtonActualizarFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarFormularioIva")) {
				jButtonActualizarFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarFormularioIva")) {
				jButtonActualizarFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("EliminarFormularioIva")) {
				jButtonEliminarFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarFormularioIva")) {
				jButtonEliminarFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarFormularioIva")) {
				jButtonEliminarFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CancelarFormularioIva")) {
				jButtonCancelarFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarFormularioIva")) {
				jButtonCancelarFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarFormularioIva")) {
				jButtonCancelarFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CerrarFormularioIva")) {
				jButtonCerrarFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarFormularioIva")) {
				jButtonCerrarFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarFormularioIva")) {
				jButtonCerrarFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarFormularioIva")) {
				jButtonMostrarOcultarFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarFormularioIva")) {
				jButtonCancelarFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosFormularioIva")) {
				jButtonGuardarCambiosFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarFormularioIva")) {
				jButtonGuardarCambiosFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarFormularioIva")) {
				jButtonCopiarFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarFormularioIva")) {
				jButtonVerFormFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosFormularioIva")) {
				jButtonGuardarCambiosFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarFormularioIva")) {
				jButtonCopiarFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormFormularioIva")) {
				jButtonVerFormFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaFormularioIva")) {
				jButtonGuardarCambiosFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarFormularioIva")) {
				jButtonGuardarCambiosFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaFormularioIva")) {
				jButtonGuardarCambiosFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionFormularioIva")) {
				jButtonRecargarInformacionFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarFormularioIva")) {
				jButtonRecargarInformacionFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionFormularioIva")) {
				jButtonRecargarInformacionFormularioIvaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresFormularioIva")) {
				jButtonAnterioresFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarFormularioIva")) {
				jButtonAnterioresFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreFormularioIva")) {
				jButtonAnterioresFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesFormularioIva")) {
				jButtonSiguientesFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarFormularioIva")) {
				jButtonSiguientesFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesFormularioIva")) {
				jButtonSiguientesFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByFormularioIva") || sTipo.equals("MenuItemDetalleAbrirOrderByFormularioIva")) {
				jButtonAbrirOrderByFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarFormularioIva") || sTipo.equals("MenuItemDetalleMostrarOcultarFormularioIva")) {
				jButtonMostrarOcultarFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosFormularioIva")) {
				jButtonNuevoGuardarCambiosFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarFormularioIva")) {
				jButtonNuevoGuardarCambiosFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosFormularioIva")) {
				jButtonNuevoGuardarCambiosFormularioIvaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoFormularioIva")) {
				jButtonCerrarReporteDinamicoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoFormularioIva")) {
				jButtonGenerarReporteDinamicoFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoFormularioIva")) {
				
				jButtonGenerarExcelReporteDinamicoFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionFormularioIva")) {
				jButtonCerrarImportacionFormularioIvaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionFormularioIva")) {
				
				jButtonGenerarImportacionFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionFormularioIva")) {
				
				jButtonAbrirImportacionFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesFormularioIva")) {
				jComboBoxTiposAccionesFormularioIvaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesFormularioIva")) {
				jComboBoxTiposRelacionesFormularioIvaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioFormularioIva")) {
				jComboBoxTiposAccionesFormularioIvaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarFormularioIva")) {
				
				jComboBoxTiposSeleccionarFormularioIvaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralFormularioIva")) {
				jTextFieldValorCampoGeneralFormularioIvaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByFormularioIva")) {
				jButtonAbrirOrderByFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarFormularioIva")) {
				jButtonAbrirOrderByFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByFormularioIva")) {
				jButtonCerrarOrderByFormularioIvaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFormularioIvaBusqueda")) {
				this.jButtonidFormularioIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFormularioIvaUpdate")) {
				this.jButtonid_empresaFormularioIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFormularioIvaBusqueda")) {
				this.jButtonid_empresaFormularioIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioFormularioIvaUpdate")) {
				this.jButtonid_ejercicioFormularioIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioFormularioIvaBusqueda")) {
				this.jButtonid_ejercicioFormularioIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoFormularioIvaUpdate")) {
				this.jButtonid_periodoFormularioIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoFormularioIvaBusqueda")) {
				this.jButtonid_periodoFormularioIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_dato_formulario_ivaFormularioIvaUpdate")) {
				this.jButtonid_dato_formulario_ivaFormularioIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_dato_formulario_ivaFormularioIvaBusqueda")) {
				this.jButtonid_dato_formulario_ivaFormularioIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_parametro_formulario_ivaFormularioIvaUpdate")) {
				this.jButtonid_grupo_parametro_formulario_ivaFormularioIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_parametro_formulario_ivaFormularioIvaBusqueda")) {
				this.jButtonid_grupo_parametro_formulario_ivaFormularioIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_parametro_formulario_ivaFormularioIvaUpdate")) {
				this.jButtonid_parametro_formulario_ivaFormularioIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_parametro_formulario_ivaFormularioIvaBusqueda")) {
				this.jButtonid_parametro_formulario_ivaFormularioIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorFormularioIvaBusqueda")) {
				this.jButtonvalorFormularioIvaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorDatoFormularioPorGrupoFormularioIva")) {
				this.jButtonBusquedaPorDatoFormularioPorGrupoFormularioIvaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdDatoFormularioIvaFormularioIva")) {
				this.jButtonFK_IdDatoFormularioIvaFormularioIvaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdGrupoParametroFormularioIvaFormularioIva")) {
				this.jButtonFK_IdGrupoParametroFormularioIvaFormularioIvaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdParametroFormularioIvaFormularioIva")) {
				this.jButtonFK_IdParametroFormularioIvaFormularioIvaActionPerformed(evt);
			}
			
			;
			
			
			FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessFormularioIva();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormularioIvaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formularioiva);
				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
				
				


				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			FormularioIva formularioivaLocal=null;
			
			if(!this.getEsControlTabla()) {
				formularioivaLocal=this.formularioiva;
			} else {
				formularioivaLocal=this.formularioivaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formularioiva);
				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
							
				
				


				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaAnterior =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formularioivaAnterior =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
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
			
			FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
			
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
			
			


			
			FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormularioIvaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formularioiva);
				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
								
						
				


				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioIva.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formularioiva);
				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
								
				
				


				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaAnterior =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formularioivaAnterior =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formularioiva);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaAnterior =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formularioivaAnterior =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioIvaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formularioiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formularioiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formularioiva);
				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
							
				
				


				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioIva.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormularioIvaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formularioivaAnterior =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.formularioivaAnterior =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
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
			
			FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
			
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
			
			


			
			FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioIvaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formularioiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formularioiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formularioiva);
				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
								
				
				


				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaAnterior =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formularioivaAnterior =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioIvaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formularioiva);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formularioiva);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormularioIvaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formularioiva);
				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosFormularioIva")) {
					jCheckBoxSeleccionarTodosFormularioIvaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosFormularioIva")) {
					jCheckBoxSeleccionadosFormularioIvaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarFormularioIva")) {
					
				}
				
				


				
				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.formularioiva);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.formularioiva);
				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
												
				
				


				
				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioIva.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormularioIvaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formularioivaAnterior =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.formularioivaAnterior =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormularioIvaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formularioiva);
				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
				
				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
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
			
			FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
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
			
			


			
			FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormularioIvaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formularioiva);
				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioIva.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioIva.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formularioiva);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formularioiva);
				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
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
				
				


				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioIva.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioIva.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioIvaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formularioivaAnterior =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formularioivaAnterior =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarFormularioIva")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosFormularioIvaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosFormularioIva.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.formularioiva =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.formularioiva =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.formularioiva);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarFormularioIva")) {
				
				}
				
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarFormularioIva")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosFormularioIva.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarFormularioIva")) {
			
			}
			
			FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessFormularioIva();
			
			FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
			
			if(sTipo.equals("NuevoFormularioIva")) {
				jButtonNuevoFormularioIvaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarFormularioIva")) {
				jButtonDuplicarFormularioIvaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarFormularioIva")) {
				jButtonCopiarFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormFormularioIva")) {
				jButtonVerFormFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesFormularioIva")) {
				jButtonNuevoFormularioIvaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarFormularioIva")) {
				jButtonModificarFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarFormularioIva")) {
				jButtonActualizarFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarFormularioIva")) {
				jButtonEliminarFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaFormularioIva")) {
				jButtonGuardarCambiosFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarFormularioIva")) {
				jButtonCancelarFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarFormularioIva")) {
				jButtonCerrarFormularioIvaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosFormularioIva")) {
				jButtonGuardarCambiosFormularioIvaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosFormularioIva")) {
				jButtonNuevoGuardarCambiosFormularioIvaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByFormularioIva")) {
				jButtonAbrirOrderByFormularioIvaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionFormularioIva")) {
				jButtonRecargarInformacionFormularioIvaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresFormularioIva")) {
				jButtonAnterioresFormularioIvaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesFormularioIva")) {
				jButtonSiguientesFormularioIvaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFormularioIvaBusqueda")) {
				this.jButtonidFormularioIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFormularioIvaUpdate")) {
				this.jButtonid_empresaFormularioIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFormularioIvaBusqueda")) {
				this.jButtonid_empresaFormularioIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioFormularioIvaUpdate")) {
				this.jButtonid_ejercicioFormularioIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioFormularioIvaBusqueda")) {
				this.jButtonid_ejercicioFormularioIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoFormularioIvaUpdate")) {
				this.jButtonid_periodoFormularioIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoFormularioIvaBusqueda")) {
				this.jButtonid_periodoFormularioIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_dato_formulario_ivaFormularioIvaUpdate")) {
				this.jButtonid_dato_formulario_ivaFormularioIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_dato_formulario_ivaFormularioIvaBusqueda")) {
				this.jButtonid_dato_formulario_ivaFormularioIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_parametro_formulario_ivaFormularioIvaUpdate")) {
				this.jButtonid_grupo_parametro_formulario_ivaFormularioIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_parametro_formulario_ivaFormularioIvaBusqueda")) {
				this.jButtonid_grupo_parametro_formulario_ivaFormularioIvaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_parametro_formulario_ivaFormularioIvaUpdate")) {
				this.jButtonid_parametro_formulario_ivaFormularioIvaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_parametro_formulario_ivaFormularioIvaBusqueda")) {
				this.jButtonid_parametro_formulario_ivaFormularioIvaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorFormularioIvaBusqueda")) {
				this.jButtonvalorFormularioIvaBusquedaActionPerformed(evt);
			}
			
			FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessFormularioIva();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameFormularioIva")) {
				closingInternalFrameFormularioIva();
				
			} else if(sTipo.equals("jButtonCancelarFormularioIva")) {
				JInternalFrameBase jInternalFrameDetalleFormFormularioIva = (JInternalFrameBase)evt.getSource();
	            	
	            FormularioIvaBeanSwingJInternalFrame jInternalFrameParent=(FormularioIvaBeanSwingJInternalFrame)jInternalFrameDetalleFormFormularioIva.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarFormularioIvaActionPerformed(null);
			}
			
			FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.formularioiva,new Object(),this.formularioivaParameterGeneral,this.formularioivaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormFormularioIva(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormFormularioIva(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormFormularioIva(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.formularioiva)) {
			if(!esControlTabla) {
				if(FormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualFormularioIva(this.formularioiva,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);			
				}
				
				if(this.formularioivaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualFormularioIva(this.formularioiva,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.formularioivaReturnGeneral=formularioivaLogic.procesarEventosFormularioIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formularioivaLogic.getFormularioIvas(),this.formularioiva,this.formularioivaParameterGeneral,this.isEsNuevoFormularioIva,classes);//this.formularioivaLogic.getFormularioIva()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanFormularioIva(this.formularioivaReturnGeneral,this.formularioivaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.formularioivaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanFormularioIva(classes,this.formularioivaReturnGeneral,this.formularioivaBean,false);
					}
						
					if(this.formularioivaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyFormularioIva(this.formularioivaReturnGeneral.getFormularioIva());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioFormularioIva(this.formularioivaReturnGeneral.getFormularioIva());	
					}
						
					if(this.formularioivaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioFormularioIva(this.formularioivaReturnGeneral.getFormularioIva(),classes);//this.formularioivaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioFormularioIva(this.formularioiva,classes);//this.formularioivaBean);									
				}
			
				if(FormularioIvaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualFormularioIva(this.formularioiva,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioIva(this.formularioiva);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.formularioivaAnterior!=null) {
						this.formularioiva=this.formularioivaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.formularioivaReturnGeneral=formularioivaLogic.procesarEventosFormularioIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formularioivaLogic.getFormularioIvas(),this.formularioiva,this.formularioivaParameterGeneral,this.isEsNuevoFormularioIva,classes);//this.formularioivaLogic.getFormularioIva()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.formularioivaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.formularioivaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.formularioivaReturnGeneral.getFormularioIva(),formularioivaLogic.getFormularioIvas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.formularioivaReturnGeneral.getFormularioIva(),this.formularioivas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosFormularioIva.repaint();
				
				//((AbstractTableModel) this.jTableDatosFormularioIva.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosFormularioIva();
			}
		}
	}
	
	public void actualizarVisualTableDatosFormularioIva() throws Exception {
		
		FormularioIvaModel formularioivaModel=(FormularioIvaModel)this.jTableDatosFormularioIva.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formularioivaModel.formularioivas=this.formularioivaLogic.getFormularioIvas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			formularioivaModel.formularioivas=this.formularioivas;
		}
		
		
		((FormularioIvaModel) this.jTableDatosFormularioIva.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaFormularioIva() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getformularioivaAnterior(),this.formularioivaLogic.getFormularioIvas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getformularioivaAnterior(),this.formularioivas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosFormularioIva();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioFormularioIva(FormularioIva formularioiva,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
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
										
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formularioiva,new Object(),generalEntityParameterGeneral,this.formularioivaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.formularioivaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=FormularioIvaConstantesFunciones.getClassesRelationshipsOfFormularioIva(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=FormularioIvaConstantesFunciones.getClassesRelationshipsFromStringsOfFormularioIva(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormFormularioIva(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				FormularioIvaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formularioiva,new Object(),generalEntityParameterGeneral,this.formularioivaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioFormularioIva(FormularioIvaBean formularioivaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanFormularioIva(ArrayList<Classe> classes,FormularioIvaReturnGeneral formularioivaReturnGeneral,FormularioIvaBean formularioivaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualFormularioIva(FormularioIva formularioiva,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.formularioiva)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormFormularioIva = new FormularioIvaDetalleFormJInternalFrame(jDesktopPane,this.formularioivaSessionBean.getConGuardarRelaciones(),this.formularioivaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormFormularioIva);
		this.jInternalFrameDetalleFormFormularioIva.setVisible(false);
		this.jInternalFrameDetalleFormFormularioIva.setSelected(false);						
		
		this.jInternalFrameDetalleFormFormularioIva.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormFormularioIva.formularioivaLogic=this.formularioivaLogic;
		
		this.cargarCombosFrameForeignKeyFormularioIva("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleFormularioIva();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFormularioIva();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyFormularioIva("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyFormularioIva();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormFormularioIva.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFormularioIva"));
		
		this.jInternalFrameDetalleFormFormularioIva.jButtonModificarFormularioIva.addActionListener(new ButtonActionListener(this,"ModificarFormularioIva"));

		
		this.jInternalFrameDetalleFormFormularioIva.jButtonModificarToolBarFormularioIva.addActionListener(new ButtonActionListener(this,"ModificarToolBarFormularioIva"));
					
		this.jInternalFrameDetalleFormFormularioIva.jMenuItemModificarFormularioIva.addActionListener(new ButtonActionListener(this,"MenuItemModificarFormularioIva"));		
		
		
		
		this.jInternalFrameDetalleFormFormularioIva.jButtonActualizarFormularioIva.addActionListener (new ButtonActionListener(this,"ActualizarFormularioIva"));
		
		
		this.jInternalFrameDetalleFormFormularioIva.jButtonActualizarToolBarFormularioIva.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFormularioIva"));
						
		this.jInternalFrameDetalleFormFormularioIva.jMenuItemActualizarFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFormularioIva"));		
		
		
		
		this.jInternalFrameDetalleFormFormularioIva.jButtonEliminarFormularioIva.addActionListener (new ButtonActionListener(this,"EliminarFormularioIva"));
		
		
		this.jInternalFrameDetalleFormFormularioIva.jButtonEliminarToolBarFormularioIva.addActionListener (new ButtonActionListener(this,"EliminarToolBarFormularioIva"));
								
		this.jInternalFrameDetalleFormFormularioIva.jMenuItemEliminarFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFormularioIva"));		
		
		
		
		this.jInternalFrameDetalleFormFormularioIva.jButtonCancelarFormularioIva.addActionListener (new ButtonActionListener(this,"CancelarFormularioIva"));
		
		
		this.jInternalFrameDetalleFormFormularioIva.jButtonCancelarToolBarFormularioIva.addActionListener (new ButtonActionListener(this,"CancelarToolBarFormularioIva"));
					
		this.jInternalFrameDetalleFormFormularioIva.jMenuItemCancelarFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFormularioIva"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormFormularioIva.jMenuItemDetalleCerrarFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFormularioIva"));		
		
		
		
		this.jInternalFrameDetalleFormFormularioIva.jButtonGuardarCambiosToolBarFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormularioIva"));
		
		
		
		this.jInternalFrameDetalleFormFormularioIva.jButtonGuardarCambiosToolBarFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormularioIva"));
		
		
		
		this.jInternalFrameDetalleFormFormularioIva.jComboBoxTiposAccionesFormularioFormularioIva.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFormularioIva"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonidFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"idFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_empresaFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_empresaFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_ejercicioFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_ejercicioFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_periodoFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_periodoFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_periodoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_dato_formulario_ivaFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_dato_formulario_ivaFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_dato_formulario_ivaFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_dato_formulario_ivaFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_grupo_parametro_formulario_ivaFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_parametro_formulario_ivaFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_grupo_parametro_formulario_ivaFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_parametro_formulario_ivaFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_parametro_formulario_ivaFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_parametro_formulario_ivaFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_parametro_formulario_ivaFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_parametro_formulario_ivaFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonvalorFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"valorFormularioIvaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormFormularioIva.jTabbedPaneRelacionesFormularioIva.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFormularioIva"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameFormularioIva"));
		
		if(this.jInternalFrameDetalleFormFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioIva.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFormularioIva"));
		}
		
		this.jTableDatosFormularioIva.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarFormularioIva"));
		
		this.jTableDatosFormularioIva.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarFormularioIva"));
		
		this.jButtonNuevoFormularioIva.addActionListener(new ButtonActionListener(this,"NuevoFormularioIva"));
		
		this.jButtonDuplicarFormularioIva.addActionListener(new ButtonActionListener(this,"DuplicarFormularioIva"));
		
		this.jButtonCopiarFormularioIva.addActionListener(new ButtonActionListener(this,"CopiarFormularioIva"));
		
		this.jButtonVerFormFormularioIva.addActionListener(new ButtonActionListener(this,"VerFormFormularioIva"));
		
		
		this.jButtonNuevoToolBarFormularioIva.addActionListener(new ButtonActionListener(this,"NuevoToolBarFormularioIva"));
			
		this.jButtonDuplicarToolBarFormularioIva.addActionListener(new ButtonActionListener(this,"DuplicarToolBarFormularioIva"));
			
		this.jMenuItemNuevoFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemNuevoFormularioIva"));
			
		this.jMenuItemDuplicarFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarFormularioIva"));		
		
		
		this.jButtonNuevoRelacionesFormularioIva.addActionListener (new ButtonActionListener(this,"NuevoRelacionesFormularioIva"));
		
		
		this.jButtonNuevoRelacionesToolBarFormularioIva.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarFormularioIva"));
			
		this.jMenuItemNuevoRelacionesFormularioIva.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesFormularioIva"));		
		
		
		if(this.jInternalFrameDetalleFormFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioIva.jButtonModificarFormularioIva.addActionListener(new ButtonActionListener(this,"ModificarFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioIva.jButtonModificarToolBarFormularioIva.addActionListener(new ButtonActionListener(this,"ModificarToolBarFormularioIva"));
			
			this.jInternalFrameDetalleFormFormularioIva.jMenuItemModificarFormularioIva.addActionListener(new ButtonActionListener(this,"MenuItemModificarFormularioIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioIva!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormFormularioIva.jButtonActualizarFormularioIva.addActionListener (new ButtonActionListener(this,"ActualizarFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioIva.jButtonActualizarToolBarFormularioIva.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFormularioIva"));
				
			this.jInternalFrameDetalleFormFormularioIva.jMenuItemActualizarFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFormularioIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioIva.jButtonEliminarFormularioIva.addActionListener (new ButtonActionListener(this,"EliminarFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioIva.jButtonEliminarToolBarFormularioIva.addActionListener (new ButtonActionListener(this,"EliminarToolBarFormularioIva"));
						
			this.jInternalFrameDetalleFormFormularioIva.jMenuItemEliminarFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFormularioIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioIva.jButtonCancelarFormularioIva.addActionListener (new ButtonActionListener(this,"CancelarFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioIva.jButtonCancelarToolBarFormularioIva.addActionListener (new ButtonActionListener(this,"CancelarToolBarFormularioIva"));
			
			this.jInternalFrameDetalleFormFormularioIva.jMenuItemCancelarFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFormularioIva"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarFormularioIva.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarFormularioIva"));		
		
		
		this.jButtonCerrarFormularioIva.addActionListener (new ButtonActionListener(this,"CerrarFormularioIva"));
		
		
		this.jButtonCerrarToolBarFormularioIva.addActionListener (new ButtonActionListener(this,"CerrarToolBarFormularioIva"));
			
		this.jMenuItemCerrarFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemCerrarFormularioIva"));
			
		if(this.jInternalFrameDetalleFormFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioIva.jMenuItemDetalleCerrarFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFormularioIva"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioIva.jButtonGuardarCambiosFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosFormularioIva"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioIva.jButtonGuardarCambiosToolBarFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormularioIva"));
		}
		
		this.jButtonCopiarToolBarFormularioIva.addActionListener (new ButtonActionListener(this,"CopiarToolBarFormularioIva"));
			
		this.jButtonVerFormToolBarFormularioIva.addActionListener (new ButtonActionListener(this,"VerFormToolBarFormularioIva"));
		
		this.jMenuItemGuardarCambiosFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosFormularioIva"));
			
		this.jMenuItemCopiarFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemCopiarFormularioIva"));		
		
		this.jMenuItemVerFormFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemVerFormFormularioIva"));		
		
		
		this.jButtonGuardarCambiosTablaFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFormularioIva"));
		
		
		this.jButtonGuardarCambiosTablaToolBarFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarFormularioIva"));
			
		this.jMenuItemGuardarCambiosTablaFormularioIva.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFormularioIva"));		
		
		
		
		this.jButtonRecargarInformacionFormularioIva.addActionListener (new ButtonActionListener(this,"RecargarInformacionFormularioIva"));
					
		this.jButtonRecargarInformacionToolBarFormularioIva.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarFormularioIva"));
		
		this.jMenuItemRecargarInformacionFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionFormularioIva"));		
		
		
		
		this.jButtonAnterioresFormularioIva.addActionListener (new ButtonActionListener(this,"AnterioresFormularioIva"));
		
		
		this.jButtonAnterioresToolBarFormularioIva.addActionListener (new ButtonActionListener(this,"AnterioresToolBarFormularioIva"));
		
		this.jMenuItemAnterioresFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresFormularioIva"));		
		
		
		this.jButtonSiguientesFormularioIva.addActionListener (new ButtonActionListener(this,"SiguientesFormularioIva"));
		
		
		this.jButtonSiguientesToolBarFormularioIva.addActionListener (new ButtonActionListener(this,"SiguientesToolBarFormularioIva"));
			
		this.jMenuItemSiguientesFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesFormularioIva"));
			
		this.jMenuItemAbrirOrderByFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByFormularioIva"));
			
		this.jMenuItemMostrarOcultarFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarFormularioIva"));
			
		this.jMenuItemDetalleAbrirOrderByFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByFormularioIva"));
			
		this.jMenuItemDetalleMostarOcultarFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarFormularioIva"));		
		
		
		this.jButtonNuevoGuardarCambiosFormularioIva.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosFormularioIva"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarFormularioIva.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarFormularioIva"));
			
		this.jMenuItemNuevoGuardarCambiosFormularioIva.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosFormularioIva"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosFormularioIva.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosFormularioIva"));

		this.jCheckBoxSeleccionadosFormularioIva.addItemListener(new CheckBoxItemListener(this,"SeleccionadosFormularioIva"));
		
		if(this.jInternalFrameDetalleFormFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioIva.jComboBoxTiposAccionesFormularioFormularioIva.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFormularioIva"));
		}
		
		
		this.jComboBoxTiposRelacionesFormularioIva.addActionListener (new ButtonActionListener(this,"TiposRelacionesFormularioIva"));
			
		this.jComboBoxTiposAccionesFormularioIva.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioIva"));
					
		this.jComboBoxTiposSeleccionarFormularioIva.addActionListener (new ButtonActionListener(this,"TiposSeleccionarFormularioIva"));
			
		this.jTextFieldValorCampoGeneralFormularioIva.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralFormularioIva"));		
		
		
		if(this.jInternalFrameDetalleFormFormularioIva!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonidFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"idFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_empresaFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_empresaFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_ejercicioFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_ejercicioFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_periodoFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_periodoFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_periodoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_dato_formulario_ivaFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_dato_formulario_ivaFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_dato_formulario_ivaFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_dato_formulario_ivaFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_grupo_parametro_formulario_ivaFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_parametro_formulario_ivaFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_grupo_parametro_formulario_ivaFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_parametro_formulario_ivaFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_parametro_formulario_ivaFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_parametro_formulario_ivaFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_parametro_formulario_ivaFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_parametro_formulario_ivaFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonvalorFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"valorFormularioIvaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorDatoFormularioPorGrupoFormularioIva.addActionListener(new ButtonActionListener(this,"BusquedaPorDatoFormularioPorGrupoFormularioIva"));

			this.jButtonFK_IdDatoFormularioIvaFormularioIva.addActionListener(new ButtonActionListener(this,"FK_IdDatoFormularioIvaFormularioIva"));

			this.jButtonFK_IdGrupoParametroFormularioIvaFormularioIva.addActionListener(new ButtonActionListener(this,"FK_IdGrupoParametroFormularioIvaFormularioIva"));

			this.jButtonFK_IdParametroFormularioIvaFormularioIva.addActionListener(new ButtonActionListener(this,"FK_IdParametroFormularioIvaFormularioIva"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoFormularioIva!=null) {
				this.jInternalFrameReporteDinamicoFormularioIva.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormularioIva"));
				this.jInternalFrameReporteDinamicoFormularioIva.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormularioIva"));
				this.jInternalFrameReporteDinamicoFormularioIva.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormularioIva"));
			}
			
			//this.jButtonCerrarReporteDinamicoFormularioIva.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormularioIva"));				
			//this.jButtonGenerarReporteDinamicoFormularioIva.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormularioIva"));
			//this.jButtonGenerarExcelReporteDinamicoFormularioIva.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormularioIva"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionFormularioIva!=null) {
				this.jInternalFrameImportacionFormularioIva.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFormularioIva"));
				this.jInternalFrameImportacionFormularioIva.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFormularioIva"));
				this.jInternalFrameImportacionFormularioIva.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFormularioIva"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByFormularioIva.addActionListener (new ButtonActionListener(this,"AbrirOrderByFormularioIva"));
			
			this.jButtonAbrirOrderByToolBarFormularioIva.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarFormularioIva"));			
			
			if(this.jInternalFrameOrderByFormularioIva!=null) {
				this.jInternalFrameOrderByFormularioIva.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFormularioIva"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormFormularioIva!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioIva.jTabbedPaneRelacionesFormularioIva.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFormularioIva"));
		
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
            		closingInternalFrameFormularioIva();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormFormularioIva.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormFormularioIva = (JInternalFrameBase)event.getSource();
	            	
	            FormularioIvaBeanSwingJInternalFrame jInternalFrameParent=(FormularioIvaBeanSwingJInternalFrame)jInternalFrameDetalleFormFormularioIva.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarFormularioIvaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosFormularioIva.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosFormularioIvaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosFormularioIva.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosFormularioIva.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormularioIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormularioIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormularioIvaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoFormularioIva";
		inputMap = this.jButtonNuevoFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFormularioIvaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormularioIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormularioIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormularioIvaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesFormularioIva";
		inputMap = this.jButtonNuevoRelacionesFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFormularioIvaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarFormularioIva";
		inputMap = this.jButtonModificarFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarFormularioIva";
		inputMap = this.jButtonActualizarFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarFormularioIva";
		inputMap = this.jButtonEliminarFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarFormularioIva";
		inputMap = this.jButtonCancelarFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarFormularioIva";
		inputMap = this.jButtonCerrarFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormFormularioIva.jButtonGuardarCambiosFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosFormularioIva";
		inputMap = this.jInternalFrameDetalleFormFormularioIva.jButtonGuardarCambiosFormularioIva.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormFormularioIva.jButtonGuardarCambiosFormularioIva.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosFormularioIvaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosFormularioIva.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosFormularioIvaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesFormularioIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesFormularioIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarFormularioIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarFormularioIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralFormularioIva.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralFormularioIvaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonidFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"idFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_empresaFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_empresaFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_ejercicioFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_ejercicioFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_periodoFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_periodoFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_periodoFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_dato_formulario_ivaFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_dato_formulario_ivaFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_dato_formulario_ivaFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_dato_formulario_ivaFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_grupo_parametro_formulario_ivaFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_parametro_formulario_ivaFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_grupo_parametro_formulario_ivaFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_parametro_formulario_ivaFormularioIvaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_parametro_formulario_ivaFormularioIvaUpdate.addActionListener(new ButtonActionListener(this,"id_parametro_formulario_ivaFormularioIvaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonid_parametro_formulario_ivaFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"id_parametro_formulario_ivaFormularioIvaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioIva.jButtonvalorFormularioIvaBusqueda.addActionListener(new ButtonActionListener(this,"valorFormularioIvaBusqueda"));
		
		
		this.jButtonBusquedaPorDatoFormularioPorGrupoFormularioIva.addActionListener(new ButtonActionListener(this,"BusquedaPorDatoFormularioPorGrupoFormularioIva"));

		this.jButtonFK_IdDatoFormularioIvaFormularioIva.addActionListener(new ButtonActionListener(this,"FK_IdDatoFormularioIvaFormularioIva"));

		this.jButtonFK_IdGrupoParametroFormularioIvaFormularioIva.addActionListener(new ButtonActionListener(this,"FK_IdGrupoParametroFormularioIvaFormularioIva"));

		this.jButtonFK_IdParametroFormularioIvaFormularioIva.addActionListener(new ButtonActionListener(this,"FK_IdParametroFormularioIvaFormularioIva"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionFormularioIva.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionFormularioIvaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarFormularioIvaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarFormularioIva.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosFormularioIva(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(FormularioIva formularioivaAux:this.formularioivaLogic.getFormularioIvas()) {
					formularioivaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormularioIva formularioivaAux:formularioivas) {
					formularioivaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosFormularioIvaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFormularioIva(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FormularioIva formularioivaAux:this.formularioivaLogic.getFormularioIvas()) {
						formularioivaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormularioIva formularioivaAux:formularioivas) {
						formularioivaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(FormularioIva formularioivaAux:this.formularioivaLogic.getFormularioIvas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormularioIva formularioivaAux:formularioivas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaFormularioIva(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFormularioIva.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFormularioIva.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFormularioIva,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosFormularioIvaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFormularioIva(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosFormularioIva.getSelectedRows();
			
			FormularioIva formularioivaLocal=new FormularioIva();
			
			//this.seleccionarTodosFormularioIva(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formularioivaLocal =(FormularioIva) this.formularioivaLogic.getFormularioIvas().toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					formularioivaLocal =(FormularioIva) this.formularioivas.toArray()[this.jTableDatosFormularioIva.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				formularioivaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FormularioIva formularioivaAux:this.formularioivaLogic.getFormularioIvas()) {
						formularioivaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormularioIva formularioivaAux:formularioivas) {
						formularioivaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaFormularioIva(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFormularioIva.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFormularioIva.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFormularioIva,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualFormularioIvaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarFormularioIvaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralFormularioIvaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingFormularioIva(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralFormularioIva.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FormularioIva formularioivaAux:this.formularioivaLogic.getFormularioIvas()) {
				
						if(sTipoSeleccionar.equals(FormularioIvaConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							formularioivaAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormularioIva formularioivaAux:formularioivas) {
					
						if(sTipoSeleccionar.equals(FormularioIvaConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							formularioivaAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaFormularioIva(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesFormularioIvaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingFormularioIva(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioFormularioIva=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesFormularioIva.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormFormularioIva.jComboBoxTiposAccionesFormularioFormularioIva.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteFormularioIva) {				
					conSplash=true;//false;										
					
					//this.startProcessFormularioIva(conSplash);
				
					this.generarReporteFormularioIvasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormularioIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormularioIva.jComboBoxTiposAccionesFormularioFormularioIva.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoFormularioIvasSeleccionados();
				//this.jComboBoxTiposAccionesFormularioIva.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFormularioIvasSeleccionados(false);
				//this.jComboBoxTiposAccionesFormularioIva.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFormularioIvasSeleccionados(true);
				//this.jComboBoxTiposAccionesFormularioIva.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFormularioIva();
				
				this.exportarFormularioIvasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormularioIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormularioIva.jComboBoxTiposAccionesFormularioFormularioIva.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionFormularioIvas();
				//this.importarFormularioIvas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormularioIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormularioIva.jComboBoxTiposAccionesFormularioFormularioIva.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFormularioIva();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelFormularioIvasSeleccionados();
				//this.jComboBoxTiposAccionesFormularioIva.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Formulario Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessFormularioIva();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoFormularioIva)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyFormularioIva(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormularioIva.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormularioIva.jComboBoxTiposAccionesFormularioFormularioIva.setSelectedIndex(0);					
				}	
			} 			
			else if(FormularioIvaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteFormularioIva) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessFormularioIva(conSplash);
					
						//this.actualizarParametrosGeneralFormularioIva();
						
						this.generarReporteProcesoAccionFormularioIvasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesFormularioIva.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormFormularioIva.jComboBoxTiposAccionesFormularioFormularioIva.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(FormularioIvaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Formulario IvaS SELECCIONADOS?", "MANTENIMIENTO DE Formulario Iva", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessFormularioIva();
				
						this.actualizarParametrosGeneralFormularioIva();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.formularioivaReturnGeneral=formularioivaLogic.procesarAccionFormularioIvasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.formularioivaLogic.getFormularioIvas(),this.formularioivaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarFormularioIvaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFormularioIva.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFormularioIva.jComboBoxTiposAccionesFormularioFormularioIva.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralFormularioIva();
					
					FormularioIvaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarFormularioIvaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFormularioIva.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFormularioIva.jComboBoxTiposAccionesFormularioFormularioIva.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessFormularioIva(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesFormularioIvaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessFormularioIva();
			
			if(this.jInternalFrameDetalleFormFormularioIva==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<FormularioIva> formularioivasSeleccionados=new ArrayList<FormularioIva>();		
			FormularioIva formularioiva=new FormularioIva();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingFormularioIva(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesFormularioIva.getSelectedItem();
			
			
			
			
			formularioivasSeleccionados=this.getFormularioIvasSeleccionados(true);
			//this.sTipoAccion;
			
			if(formularioivasSeleccionados.size()==1) {
				for(FormularioIva formularioivaAux:formularioivasSeleccionados) {
					formularioiva=formularioivaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessFormularioIva();
			
      		//this.finishProcessFormularioIva(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarFormularioIvaReturnGeneral() throws Exception {
		if(this.formularioivaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.formularioivaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.formularioivaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.formularioivaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.formularioivaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.formularioivaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingFormularioIva(false);
		}
		
		if(this.formularioivaReturnGeneral.getConRetornoLista() || this.formularioivaReturnGeneral.getConRetornoObjeto()) {
			if(this.formularioivaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.formularioivaLogic.setFormularioIvas(this.formularioivaReturnGeneral.getFormularioIvas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.formularioivaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.formularioivaLogic.setFormularioIva(this.formularioivaReturnGeneral.getFormularioIva());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingFormularioIva(false);
		}
	}
	
	public void actualizarParametrosGeneralFormularioIva() throws Exception {
		
		
	}
	
	public ArrayList<FormularioIva> getFormularioIvasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<FormularioIva> formularioivasSeleccionados=new ArrayList<FormularioIva>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioFormularioIva) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(FormularioIva formularioivaAux:formularioivaLogic.getFormularioIvas()) {
					if(formularioivaAux.getIsSelected()) {
						formularioivasSeleccionados.add(formularioivaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormularioIva formularioivaAux:this.formularioivas) {
					if(formularioivaAux.getIsSelected()) {
						formularioivasSeleccionados.add(formularioivaAux);				
					}
				}
			}
			
			if(formularioivasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						formularioivasSeleccionados.addAll(this.formularioivaLogic.getFormularioIvas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						formularioivasSeleccionados.addAll(this.formularioivas);				
					}
				}
			}
		} else {
			formularioivasSeleccionados.add(this.formularioiva);
		}
		
		return formularioivasSeleccionados;
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
	
	public void generarReporteFormularioIvasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalFormularioIvasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoFormularioIvasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFormularioIvasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFormularioIvasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Formulario Iva",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesFormularioIvasSeleccionados() throws Exception {
		ArrayList<FormularioIva> formularioivasSeleccionados=new ArrayList<FormularioIva>();		
		
		formularioivasSeleccionados=this.getFormularioIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteFormularioIvas("Todos",formularioivasSeleccionados);
		
	}	
	
	public void generarReporteNormalFormularioIvasSeleccionados() throws Exception {
		ArrayList<FormularioIva> formularioivasSeleccionados=new ArrayList<FormularioIva>();		
		
		formularioivasSeleccionados=this.getFormularioIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteFormularioIvas("Todos",formularioivasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionFormularioIvasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<FormularioIva> formularioivasSeleccionados=new ArrayList<FormularioIva>();
		
		formularioivasSeleccionados=this.getFormularioIvasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteFormularioIvas("Todos",formularioivasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoFormularioIvasSeleccionados() throws Exception {
		ArrayList<FormularioIva> formularioivasSeleccionados=new ArrayList<FormularioIva>();		
		
		
		this.abrirInicializarFrameReporteDinamicoFormularioIva();
		
		
		formularioivasSeleccionados=this.getFormularioIvasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoFormularioIva();
		
		
		//this.generarReporteFormularioIvas("Todos",formularioivasSeleccionados ,formularioivaImplementable,formularioivaImplementableHome);
	}
	
	public void mostrarImportacionFormularioIvas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionFormularioIva();
		
		this.abrirFrameImportacionFormularioIva();		
		
			
		//this.generarReporteFormularioIvas("Todos",formularioivasSeleccionados ,formularioivaImplementable,formularioivaImplementableHome);
	}
	
	public void importarFormularioIvas() throws Exception {		
	
	}
	
	public void exportarFormularioIvasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelFormularioIvasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoFormularioIvasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlFormularioIvasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Formulario Iva",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoFormularioIvasSeleccionados() throws Exception {
		ArrayList<FormularioIva> formularioivasSeleccionados=new ArrayList<FormularioIva>();		
		
		formularioivasSeleccionados=this.getFormularioIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formularioiva."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarFormularioIva(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(FormularioIva formularioivaAux:formularioivasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarFormularioIva(formularioivaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//formularioivaAux.setsDetalleGeneralEntityReporte(formularioivaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarFormularioIva(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=FormularioIvaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioIvaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioIvaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioIvaConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioIvaConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioIvaConstantesFunciones.LABEL_IDDATOFORMULARIOIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioIvaConstantesFunciones.LABEL_IDGRUPOPARAMETROFORMULARIOIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioIvaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioIvaConstantesFunciones.LABEL_VALOR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarFormularioIva(FormularioIva formularioiva,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=formularioiva.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=formularioiva.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=formularioiva.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formularioiva.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formularioiva.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formularioiva.getdatoformularioiva_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formularioiva.getgrupoparametroformularioiva_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formularioiva.getparametroformularioiva_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formularioiva.getvalor().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelFormularioIvasSeleccionados() throws Exception {
		ArrayList<FormularioIva> formularioivasSeleccionados=new ArrayList<FormularioIva>();		
		
		formularioivasSeleccionados=this.getFormularioIvasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formularioiva.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("FormularioIvas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelFormularioIva(row);				
				iRow++;
			}				
			
			for(FormularioIva formularioivaAux:formularioivasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelFormularioIva(formularioivaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlFormularioIvasSeleccionados() throws Exception {
		ArrayList<FormularioIva> formularioivasSeleccionados=new ArrayList<FormularioIva>();		
		
		formularioivasSeleccionados=this.getFormularioIvasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formularioiva.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("formularioivas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("formularioiva");
			//elementRoot.appendChild(element);
		
			for(FormularioIva formularioivaAux:formularioivasSeleccionados) {
				element = document.createElement("formularioiva");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlFormularioIva(formularioivaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formularioivaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Iva",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelFormularioIva(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioIvaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioIvaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(FormularioIvaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioIvaConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioIvaConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioIvaConstantesFunciones.LABEL_IDDATOFORMULARIOIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioIvaConstantesFunciones.LABEL_IDGRUPOPARAMETROFORMULARIOIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioIvaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioIvaConstantesFunciones.LABEL_VALOR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelFormularioIva(FormularioIva formularioiva,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(formularioiva.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(formularioiva.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formularioiva.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formularioiva.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formularioiva.getdatoformularioiva_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formularioiva.getgrupoparametroformularioiva_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formularioiva.getparametroformularioiva_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formularioiva.getvalor());				
	}
	
	public void setFilaDatosExportarXmlFormularioIva(FormularioIva formularioiva,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(FormularioIvaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(formularioiva.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(FormularioIvaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(formularioiva.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(FormularioIvaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(formularioiva.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementejercicio_descripcion = document.createElement(FormularioIvaConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(formularioiva.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(FormularioIvaConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(formularioiva.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementdatoformularioiva_descripcion = document.createElement(FormularioIvaConstantesFunciones.IDDATOFORMULARIOIVA);
		elementdatoformularioiva_descripcion.appendChild(document.createTextNode(formularioiva.getdatoformularioiva_descripcion()));
		element.appendChild(elementdatoformularioiva_descripcion);

		Element elementgrupoparametroformularioiva_descripcion = document.createElement(FormularioIvaConstantesFunciones.IDGRUPOPARAMETROFORMULARIOIVA);
		elementgrupoparametroformularioiva_descripcion.appendChild(document.createTextNode(formularioiva.getgrupoparametroformularioiva_descripcion()));
		element.appendChild(elementgrupoparametroformularioiva_descripcion);

		Element elementparametroformularioiva_descripcion = document.createElement(FormularioIvaConstantesFunciones.IDPARAMETROFORMULARIOIVA);
		elementparametroformularioiva_descripcion.appendChild(document.createTextNode(formularioiva.getparametroformularioiva_descripcion()));
		element.appendChild(elementparametroformularioiva_descripcion);

		Element elementvalor = document.createElement(FormularioIvaConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(formularioiva.getvalor().toString().trim()));
		element.appendChild(elementvalor);
	}
	
	public void generarReporteGroupGenericoFormularioIvasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<FormularioIva> formularioivasSeleccionados=new ArrayList<FormularioIva>();
		
		formularioivasSeleccionados=this.getFormularioIvasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoFormularioIva(formularioivasSeleccionados);
		
		this.generarReporteFormularioIvas("Todos",formularioivasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoFormularioIva(ArrayList<FormularioIva> formularioivasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(FormularioIva formularioivaAux:formularioivasSeleccionados) {
				formularioivaAux.setsDetalleGeneralEntityReporte(formularioivaAux.toString());
			
				if(sTipoSeleccionar.equals(FormularioIvaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					formularioivaAux.setsDescripcionGeneralEntityReporte1(formularioivaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormularioIvaConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					formularioivaAux.setsDescripcionGeneralEntityReporte1(formularioivaAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormularioIvaConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					formularioivaAux.setsDescripcionGeneralEntityReporte1(formularioivaAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormularioIvaConstantesFunciones.LABEL_IDDATOFORMULARIOIVA)) {
					existe=true;
					formularioivaAux.setsDescripcionGeneralEntityReporte1(formularioivaAux.getdatoformularioiva_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormularioIvaConstantesFunciones.LABEL_IDGRUPOPARAMETROFORMULARIOIVA)) {
					existe=true;
					formularioivaAux.setsDescripcionGeneralEntityReporte1(formularioivaAux.getgrupoparametroformularioiva_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormularioIvaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA)) {
					existe=true;
					formularioivaAux.setsDescripcionGeneralEntityReporte1(formularioivaAux.getparametroformularioiva_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioIvaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesFormularioIva(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoFormularioIva=true;
				this.isVisibilidadCeldaNuevoRelacionesFormularioIva=true;
				this.isVisibilidadCeldaGuardarCambiosFormularioIva=true;
			}
			
			this.isVisibilidadCeldaModificarFormularioIva=false;
			this.isVisibilidadCeldaActualizarFormularioIva=false;
			this.isVisibilidadCeldaEliminarFormularioIva=false;
			this.isVisibilidadCeldaCancelarFormularioIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormularioIva=true;
				} else {
					this.isVisibilidadCeldaGuardarFormularioIva=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosFormularioIva=false;
			this.isVisibilidadCeldaModificarFormularioIva=false;
			this.isVisibilidadCeldaActualizarFormularioIva=true;
			this.isVisibilidadCeldaEliminarFormularioIva=false;
			this.isVisibilidadCeldaCancelarFormularioIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormularioIva=true;
				} else {
					this.isVisibilidadCeldaGuardarFormularioIva=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosFormularioIva=false;
			this.isVisibilidadCeldaModificarFormularioIva=false;
			this.isVisibilidadCeldaActualizarFormularioIva=true;
			this.isVisibilidadCeldaEliminarFormularioIva=true;
			this.isVisibilidadCeldaCancelarFormularioIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormularioIva=true;
				} else {
					this.isVisibilidadCeldaGuardarFormularioIva=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosFormularioIva=false;
			this.isVisibilidadCeldaModificarFormularioIva=false;
			this.isVisibilidadCeldaActualizarFormularioIva=true;
			this.isVisibilidadCeldaEliminarFormularioIva=false;
			this.isVisibilidadCeldaCancelarFormularioIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormularioIva=false;
				} else {
					this.isVisibilidadCeldaGuardarFormularioIva=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoFormularioIva=true;
			this.isVisibilidadCeldaNuevoRelacionesFormularioIva=true;
			this.isVisibilidadCeldaGuardarCambiosFormularioIva=true;
			this.isVisibilidadCeldaModificarFormularioIva=false;
			this.isVisibilidadCeldaActualizarFormularioIva=false;
			this.isVisibilidadCeldaEliminarFormularioIva=false;
			this.isVisibilidadCeldaCancelarFormularioIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormularioIva=true;
				} else {
					this.isVisibilidadCeldaGuardarFormularioIva=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosFormularioIva=false;
			this.isVisibilidadCeldaActualizarFormularioIva=false;
			this.isVisibilidadCeldaEliminarFormularioIva=false;
			this.isVisibilidadCeldaCancelarFormularioIva=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormularioIva=false;
				} else {
					this.isVisibilidadCeldaGuardarFormularioIva=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoFormularioIva=false;
			this.isVisibilidadCeldaNuevoRelacionesFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosFormularioIva=false;
			this.isVisibilidadCeldaModificarFormularioIva=true;
			this.isVisibilidadCeldaActualizarFormularioIva=false;
			this.isVisibilidadCeldaEliminarFormularioIva=false;
			this.isVisibilidadCeldaCancelarFormularioIva=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormularioIva=false;
				} else {
					this.isVisibilidadCeldaGuardarFormularioIva=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(FormularioIvaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoFormularioIva=true;
			this.isVisibilidadCeldaNuevoRelacionesFormularioIva=true;
			this.isVisibilidadCeldaGuardarCambiosFormularioIva=true;
		} else {
			this.actualizarEstadoPanelsFormularioIva(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarFormularioIva=false;
			//this.isVisibilidadCeldaVerFormFormularioIva=false;
			this.isVisibilidadCeldaDuplicarFormularioIva=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!formularioivaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesFormularioIva=false;
		} else {
			this.isVisibilidadCeldaNuevoFormularioIva=false;
			this.isVisibilidadCeldaGuardarCambiosFormularioIva=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(formularioivaSessionBean.getEsGuardarRelacionado()) {
			if(!formularioivaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesFormularioIva=false;												
			}
			
			this.jButtonCerrarFormularioIva.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesFormularioIva=false;
		}
		
		if(!this.permiteMantenimiento(this.formularioiva)) {
			this.isVisibilidadCeldaActualizarFormularioIva=false;
			this.isVisibilidadCeldaEliminarFormularioIva=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesFormularioIva() {
	}
	
	public void actualizarEstadoPanelsFormularioIva(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionFormularioIva!=null) {
				this.jScrollPanelDatosEdicionFormularioIva.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioIva!=null) {
				this.jTabbedPaneBusquedasFormularioIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormularioIva!=null) {
				this.jScrollPanelDatosFormularioIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormularioIva!=null) {
				this.jPanelPaginacionFormularioIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormularioIva!=null) {
				this.jPanelParametrosReportesFormularioIva.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionFormularioIva!=null) {
				this.jScrollPanelDatosEdicionFormularioIva.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioIva!=null) {
				this.jTabbedPaneBusquedasFormularioIva.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosFormularioIva!=null) {
				this.jScrollPanelDatosFormularioIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormularioIva!=null) {
				this.jPanelPaginacionFormularioIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormularioIva!=null) {
				this.jPanelParametrosReportesFormularioIva.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionFormularioIva!=null) {
				this.jScrollPanelDatosEdicionFormularioIva.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioIva!=null) {
				this.jTabbedPaneBusquedasFormularioIva.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFormularioIva!=null) {
				this.jScrollPanelDatosFormularioIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormularioIva!=null) {
				this.jPanelPaginacionFormularioIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormularioIva!=null) {
				this.jPanelParametrosReportesFormularioIva.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionFormularioIva!=null) {
				this.jScrollPanelDatosEdicionFormularioIva.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioIva!=null) {
				this.jTabbedPaneBusquedasFormularioIva.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFormularioIva!=null) {
				this.jScrollPanelDatosFormularioIva.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormularioIva!=null) {
				this.jPanelPaginacionFormularioIva.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormularioIva!=null) {
				this.jPanelParametrosReportesFormularioIva.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionFormularioIva!=null) {
				this.jScrollPanelDatosEdicionFormularioIva.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioIva!=null) {
				this.jTabbedPaneBusquedasFormularioIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormularioIva!=null) {
				this.jScrollPanelDatosFormularioIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormularioIva!=null) {
				this.jPanelPaginacionFormularioIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormularioIva!=null) {
				this.jPanelParametrosReportesFormularioIva.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionFormularioIva!=null) {
				this.jScrollPanelDatosEdicionFormularioIva.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioIva!=null) {
				this.jTabbedPaneBusquedasFormularioIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormularioIva!=null) {
				this.jScrollPanelDatosFormularioIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormularioIva!=null) {
				this.jPanelPaginacionFormularioIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormularioIva!=null) {
				this.jPanelParametrosReportesFormularioIva.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionFormularioIva!=null) {
				this.jScrollPanelDatosEdicionFormularioIva.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioIva!=null) {
				this.jTabbedPaneBusquedasFormularioIva.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormularioIva!=null) {
				this.jScrollPanelDatosFormularioIva.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormularioIva!=null) {
				this.jPanelPaginacionFormularioIva.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormularioIva!=null) {
				this.jPanelParametrosReportesFormularioIva.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.formularioivaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasFormularioIva!=null) {
					this.jTabbedPaneBusquedasFormularioIva.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesFormularioIva!=null) {
				this.jPanelParametrosReportesFormularioIva.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.formularioivaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioIva!=null) {
				this.jTabbedPaneBusquedasFormularioIva.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesFormularioIva!=null) {
				this.jPanelParametrosReportesFormularioIva.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorDatoFormularioPorGrupo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorDatoFormularioPorGrupo) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelBusquedaPorDatoFormularioPorGrupoFormularioIva);}

			this.isVisibilidadFK_IdDatoFormularioIva=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdDatoFormularioIva) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelFK_IdDatoFormularioIvaFormularioIva);}

			this.isVisibilidadFK_IdGrupoParametroFormularioIva=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdGrupoParametroFormularioIva) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelFK_IdGrupoParametroFormularioIvaFormularioIva);}

			this.isVisibilidadFK_IdParametroFormularioIva=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdParametroFormularioIva) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelFK_IdParametroFormularioIvaFormularioIva);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaPorDatoFormularioPorGrupo=isParaEjercicioNegation;
			if(!this.isVisibilidadBusquedaPorDatoFormularioPorGrupo) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelBusquedaPorDatoFormularioPorGrupoFormularioIva);}

			this.isVisibilidadFK_IdDatoFormularioIva=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdDatoFormularioIva) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelFK_IdDatoFormularioIvaFormularioIva);}

			this.isVisibilidadFK_IdGrupoParametroFormularioIva=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdGrupoParametroFormularioIva) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelFK_IdGrupoParametroFormularioIvaFormularioIva);}

			this.isVisibilidadFK_IdParametroFormularioIva=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdParametroFormularioIva) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelFK_IdParametroFormularioIvaFormularioIva);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadBusquedaPorDatoFormularioPorGrupo=isParaPeriodoNegation;
			if(!this.isVisibilidadBusquedaPorDatoFormularioPorGrupo) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelBusquedaPorDatoFormularioPorGrupoFormularioIva);}

			this.isVisibilidadFK_IdDatoFormularioIva=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdDatoFormularioIva) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelFK_IdDatoFormularioIvaFormularioIva);}

			this.isVisibilidadFK_IdGrupoParametroFormularioIva=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdGrupoParametroFormularioIva) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelFK_IdGrupoParametroFormularioIvaFormularioIva);}

			this.isVisibilidadFK_IdParametroFormularioIva=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdParametroFormularioIva) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelFK_IdParametroFormularioIvaFormularioIva);}
		}
		
	}

	public void setVisibilidadBusquedasParaDatoFormularioIva(Boolean isParaDatoFormularioIva){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaDatoFormularioIvaNegation=!isParaDatoFormularioIva;

			this.isVisibilidadBusquedaPorDatoFormularioPorGrupo=isParaDatoFormularioIva;
			if(!this.isVisibilidadBusquedaPorDatoFormularioPorGrupo) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelBusquedaPorDatoFormularioPorGrupoFormularioIva);}

			this.isVisibilidadFK_IdDatoFormularioIva=isParaDatoFormularioIva;
			if(!this.isVisibilidadFK_IdDatoFormularioIva) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelFK_IdDatoFormularioIvaFormularioIva);}

			this.isVisibilidadFK_IdGrupoParametroFormularioIva=isParaDatoFormularioIvaNegation;
			if(!this.isVisibilidadFK_IdGrupoParametroFormularioIva) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelFK_IdGrupoParametroFormularioIvaFormularioIva);}

			this.isVisibilidadFK_IdParametroFormularioIva=isParaDatoFormularioIvaNegation;
			if(!this.isVisibilidadFK_IdParametroFormularioIva) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelFK_IdParametroFormularioIvaFormularioIva);}
		}
		
	}

	public void setVisibilidadBusquedasParaGrupoParametroFormularioIva(Boolean isParaGrupoParametroFormularioIva){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaGrupoParametroFormularioIvaNegation=!isParaGrupoParametroFormularioIva;

			this.isVisibilidadBusquedaPorDatoFormularioPorGrupo=isParaGrupoParametroFormularioIva;
			if(!this.isVisibilidadBusquedaPorDatoFormularioPorGrupo) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelBusquedaPorDatoFormularioPorGrupoFormularioIva);}

			this.isVisibilidadFK_IdDatoFormularioIva=isParaGrupoParametroFormularioIvaNegation;
			if(!this.isVisibilidadFK_IdDatoFormularioIva) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelFK_IdDatoFormularioIvaFormularioIva);}

			this.isVisibilidadFK_IdGrupoParametroFormularioIva=isParaGrupoParametroFormularioIva;
			if(!this.isVisibilidadFK_IdGrupoParametroFormularioIva) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelFK_IdGrupoParametroFormularioIvaFormularioIva);}

			this.isVisibilidadFK_IdParametroFormularioIva=isParaGrupoParametroFormularioIvaNegation;
			if(!this.isVisibilidadFK_IdParametroFormularioIva) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelFK_IdParametroFormularioIvaFormularioIva);}
		}
		
	}

	public void setVisibilidadBusquedasParaParametroFormularioIva(Boolean isParaParametroFormularioIva){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaParametroFormularioIvaNegation=!isParaParametroFormularioIva;

			this.isVisibilidadBusquedaPorDatoFormularioPorGrupo=isParaParametroFormularioIvaNegation;
			if(!this.isVisibilidadBusquedaPorDatoFormularioPorGrupo) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelBusquedaPorDatoFormularioPorGrupoFormularioIva);}

			this.isVisibilidadFK_IdDatoFormularioIva=isParaParametroFormularioIvaNegation;
			if(!this.isVisibilidadFK_IdDatoFormularioIva) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelFK_IdDatoFormularioIvaFormularioIva);}

			this.isVisibilidadFK_IdGrupoParametroFormularioIva=isParaParametroFormularioIvaNegation;
			if(!this.isVisibilidadFK_IdGrupoParametroFormularioIva) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelFK_IdGrupoParametroFormularioIvaFormularioIva);}

			this.isVisibilidadFK_IdParametroFormularioIva=isParaParametroFormularioIva;
			if(!this.isVisibilidadFK_IdParametroFormularioIva) {this.jTabbedPaneBusquedasFormularioIva.remove(jPanelFK_IdParametroFormularioIvaFormularioIva);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//FormularioIvaSessionBean formularioivaSessionBean=new FormularioIvaSessionBean();
		
		if(this.formularioivaSessionBean==null) {
			this.formularioivaSessionBean=new FormularioIvaSessionBean();
		}
		
		this.formularioivaSessionBean.setsUltimaBusquedaFormularioIva(this.getsAccionBusqueda());
		this.formularioivaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.formularioivaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorDatoFormularioPorGrupo")) {
			formularioivaSessionBean.setid_dato_formulario_iva(this.getid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupo());	
			formularioivaSessionBean.setid_grupo_parametro_formulario_iva(this.getid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdDatoFormularioIva")) {
			formularioivaSessionBean.setid_dato_formulario_iva(this.getid_dato_formulario_ivaFK_IdDatoFormularioIva());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			formularioivaSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			formularioivaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdGrupoParametroFormularioIva")) {
			formularioivaSessionBean.setid_grupo_parametro_formulario_iva(this.getid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIva());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdParametroFormularioIva")) {
			formularioivaSessionBean.setid_parametro_formulario_iva(this.getid_parametro_formulario_ivaFK_IdParametroFormularioIva());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			formularioivaSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//FormularioIvaSessionBean formularioivaSessionBean=new FormularioIvaSessionBean();
		
		if(this.formularioivaSessionBean==null) {
			this.formularioivaSessionBean=new FormularioIvaSessionBean();
		}
		
		if(this.formularioivaSessionBean.getsUltimaBusquedaFormularioIva()!=null&&!this.formularioivaSessionBean.getsUltimaBusquedaFormularioIva().equals("")) {
			this.setsAccionBusqueda(formularioivaSessionBean.getsUltimaBusquedaFormularioIva());
			this.setiNumeroPaginacion(formularioivaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(formularioivaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorDatoFormularioPorGrupo")) {
				this.setid_dato_formulario_ivaBusquedaPorDatoFormularioPorGrupo(formularioivaSessionBean.getid_dato_formulario_iva());
				formularioivaSessionBean.setid_dato_formulario_iva(-1L);
				this.setid_grupo_parametro_formulario_ivaBusquedaPorDatoFormularioPorGrupo(formularioivaSessionBean.getid_grupo_parametro_formulario_iva());
				formularioivaSessionBean.setid_grupo_parametro_formulario_iva(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdDatoFormularioIva")) {
				this.setid_dato_formulario_ivaFK_IdDatoFormularioIva(formularioivaSessionBean.getid_dato_formulario_iva());
				formularioivaSessionBean.setid_dato_formulario_iva(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(formularioivaSessionBean.getid_ejercicio());
				formularioivaSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(formularioivaSessionBean.getid_empresa());
				formularioivaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdGrupoParametroFormularioIva")) {
				this.setid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIva(formularioivaSessionBean.getid_grupo_parametro_formulario_iva());
				formularioivaSessionBean.setid_grupo_parametro_formulario_iva(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdParametroFormularioIva")) {
				this.setid_parametro_formulario_ivaFK_IdParametroFormularioIva(formularioivaSessionBean.getid_parametro_formulario_iva());
				formularioivaSessionBean.setid_parametro_formulario_iva(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(formularioivaSessionBean.getid_periodo());
				formularioivaSessionBean.setid_periodo(-1L);
			}
		}
		
		this.formularioivaSessionBean.setsUltimaBusquedaFormularioIva("");
		this.formularioivaSessionBean.setiNumeroPaginacion(FormularioIvaConstantesFunciones.INUMEROPAGINACION);
		this.formularioivaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaFormularioIva(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioFormularioIva() {
		this.updateBorderResaltarBusquedasFormularioFormularioIva();
		this.updateVisibilidadBusquedasFormularioFormularioIva();
		this.updateHabilitarBusquedasFormularioFormularioIva();
	}
	
	public void updateBorderResaltarBusquedasFormularioFormularioIva() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasFormularioIva.getComponents().length>0) {
	

		if(this.formularioivaConstantesFunciones.resaltarBusquedaPorDatoFormularioPorGrupoFormularioIva!=null) {
			index= this.jTabbedPaneBusquedasFormularioIva.indexOfComponent(this.jPanelBusquedaPorDatoFormularioPorGrupoFormularioIva);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioIva.getComponent(index);
				jPanel.setBorder(this.formularioivaConstantesFunciones.resaltarBusquedaPorDatoFormularioPorGrupoFormularioIva);
			}
		}

		if(this.formularioivaConstantesFunciones.resaltarFK_IdDatoFormularioIvaFormularioIva!=null) {
			index= this.jTabbedPaneBusquedasFormularioIva.indexOfComponent(this.jPanelFK_IdDatoFormularioIvaFormularioIva);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioIva.getComponent(index);
				jPanel.setBorder(this.formularioivaConstantesFunciones.resaltarFK_IdDatoFormularioIvaFormularioIva);
			}
		}

		if(this.formularioivaConstantesFunciones.resaltarFK_IdGrupoParametroFormularioIvaFormularioIva!=null) {
			index= this.jTabbedPaneBusquedasFormularioIva.indexOfComponent(this.jPanelFK_IdGrupoParametroFormularioIvaFormularioIva);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioIva.getComponent(index);
				jPanel.setBorder(this.formularioivaConstantesFunciones.resaltarFK_IdGrupoParametroFormularioIvaFormularioIva);
			}
		}

		if(this.formularioivaConstantesFunciones.resaltarFK_IdParametroFormularioIvaFormularioIva!=null) {
			index= this.jTabbedPaneBusquedasFormularioIva.indexOfComponent(this.jPanelFK_IdParametroFormularioIvaFormularioIva);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioIva.getComponent(index);
				jPanel.setBorder(this.formularioivaConstantesFunciones.resaltarFK_IdParametroFormularioIvaFormularioIva);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioFormularioIva() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasFormularioIva.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFormularioIva.indexOfComponent(this.jPanelBusquedaPorDatoFormularioPorGrupoFormularioIva);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioIva.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formularioivaConstantesFunciones.mostrarBusquedaPorDatoFormularioPorGrupoFormularioIva);
			if(!this.formularioivaConstantesFunciones.mostrarBusquedaPorDatoFormularioPorGrupoFormularioIva && index>-1) {
				this.jTabbedPaneBusquedasFormularioIva.remove(index);
			}

			index= this.jTabbedPaneBusquedasFormularioIva.indexOfComponent(this.jPanelFK_IdDatoFormularioIvaFormularioIva);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioIva.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formularioivaConstantesFunciones.mostrarFK_IdDatoFormularioIvaFormularioIva);
			if(!this.formularioivaConstantesFunciones.mostrarFK_IdDatoFormularioIvaFormularioIva && index>-1) {
				this.jTabbedPaneBusquedasFormularioIva.remove(index);
			}

			index= this.jTabbedPaneBusquedasFormularioIva.indexOfComponent(this.jPanelFK_IdGrupoParametroFormularioIvaFormularioIva);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioIva.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formularioivaConstantesFunciones.mostrarFK_IdGrupoParametroFormularioIvaFormularioIva);
			if(!this.formularioivaConstantesFunciones.mostrarFK_IdGrupoParametroFormularioIvaFormularioIva && index>-1) {
				this.jTabbedPaneBusquedasFormularioIva.remove(index);
			}

			index= this.jTabbedPaneBusquedasFormularioIva.indexOfComponent(this.jPanelFK_IdParametroFormularioIvaFormularioIva);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioIva.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formularioivaConstantesFunciones.mostrarFK_IdParametroFormularioIvaFormularioIva);
			if(!this.formularioivaConstantesFunciones.mostrarFK_IdParametroFormularioIvaFormularioIva && index>-1) {
				this.jTabbedPaneBusquedasFormularioIva.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioFormularioIva() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasFormularioIva.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFormularioIva.indexOfComponent(this.jPanelBusquedaPorDatoFormularioPorGrupoFormularioIva);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioIva.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formularioivaConstantesFunciones.activarBusquedaPorDatoFormularioPorGrupoFormularioIva);
				this.jTabbedPaneBusquedasFormularioIva.setEnabledAt(index,this.formularioivaConstantesFunciones.activarBusquedaPorDatoFormularioPorGrupoFormularioIva);
			}

			index= this.jTabbedPaneBusquedasFormularioIva.indexOfComponent(this.jPanelFK_IdDatoFormularioIvaFormularioIva);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioIva.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formularioivaConstantesFunciones.activarFK_IdDatoFormularioIvaFormularioIva);
				this.jTabbedPaneBusquedasFormularioIva.setEnabledAt(index,this.formularioivaConstantesFunciones.activarFK_IdDatoFormularioIvaFormularioIva);
			}

			index= this.jTabbedPaneBusquedasFormularioIva.indexOfComponent(this.jPanelFK_IdGrupoParametroFormularioIvaFormularioIva);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioIva.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formularioivaConstantesFunciones.activarFK_IdGrupoParametroFormularioIvaFormularioIva);
				this.jTabbedPaneBusquedasFormularioIva.setEnabledAt(index,this.formularioivaConstantesFunciones.activarFK_IdGrupoParametroFormularioIvaFormularioIva);
			}

			index= this.jTabbedPaneBusquedasFormularioIva.indexOfComponent(this.jPanelFK_IdParametroFormularioIvaFormularioIva);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioIva.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formularioivaConstantesFunciones.activarFK_IdParametroFormularioIvaFormularioIva);
				this.jTabbedPaneBusquedasFormularioIva.setEnabledAt(index,this.formularioivaConstantesFunciones.activarFK_IdParametroFormularioIvaFormularioIva);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaFormularioIva(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorDatoFormularioPorGrupo")) {
			index= this.jTabbedPaneBusquedasFormularioIva.indexOfComponent(this.jPanelBusquedaPorDatoFormularioPorGrupoFormularioIva);

			this.jTabbedPaneBusquedasFormularioIva.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioIva.getComponent(index);

			this.formularioivaConstantesFunciones.setResaltarBusquedaPorDatoFormularioPorGrupoFormularioIva(resaltar);

			jPanel.setBorder(this.formularioivaConstantesFunciones.resaltarBusquedaPorDatoFormularioPorGrupoFormularioIva);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdDatoFormularioIva")) {
			index= this.jTabbedPaneBusquedasFormularioIva.indexOfComponent(this.jPanelFK_IdDatoFormularioIvaFormularioIva);

			this.jTabbedPaneBusquedasFormularioIva.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioIva.getComponent(index);

			this.formularioivaConstantesFunciones.setResaltarFK_IdDatoFormularioIvaFormularioIva(resaltar);

			jPanel.setBorder(this.formularioivaConstantesFunciones.resaltarFK_IdDatoFormularioIvaFormularioIva);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdGrupoParametroFormularioIva")) {
			index= this.jTabbedPaneBusquedasFormularioIva.indexOfComponent(this.jPanelFK_IdGrupoParametroFormularioIvaFormularioIva);

			this.jTabbedPaneBusquedasFormularioIva.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioIva.getComponent(index);

			this.formularioivaConstantesFunciones.setResaltarFK_IdGrupoParametroFormularioIvaFormularioIva(resaltar);

			jPanel.setBorder(this.formularioivaConstantesFunciones.resaltarFK_IdGrupoParametroFormularioIvaFormularioIva);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdParametroFormularioIva")) {
			index= this.jTabbedPaneBusquedasFormularioIva.indexOfComponent(this.jPanelFK_IdParametroFormularioIvaFormularioIva);

			this.jTabbedPaneBusquedasFormularioIva.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioIva.getComponent(index);

			this.formularioivaConstantesFunciones.setResaltarFK_IdParametroFormularioIvaFormularioIva(resaltar);

			jPanel.setBorder(this.formularioivaConstantesFunciones.resaltarFK_IdParametroFormularioIvaFormularioIva);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarFormularioIva.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioFormularioIva() throws Exception {

		if(this.jInternalFrameDetalleFormFormularioIva==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioFormularioIva();
		this.updateVisibilidadResaltarControlesFormularioFormularioIva();
		this.updateHabilitarResaltarControlesFormularioFormularioIva();
		
	}
	
	public void updateBorderResaltarControlesFormularioFormularioIva() throws Exception {
		if(this.jInternalFrameDetalleFormFormularioIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.formularioivaConstantesFunciones.resaltaridFormularioIva!=null && this.jInternalFrameDetalleFormFormularioIva!=null) {this.jInternalFrameDetalleFormFormularioIva.jLabelidFormularioIva.setBorder(this.formularioivaConstantesFunciones.resaltaridFormularioIva);}
		if(this.formularioivaConstantesFunciones.resaltarid_empresaFormularioIva!=null && this.jInternalFrameDetalleFormFormularioIva!=null) {this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_empresaFormularioIva.setBorder(this.formularioivaConstantesFunciones.resaltarid_empresaFormularioIva);}
		if(this.formularioivaConstantesFunciones.resaltarid_ejercicioFormularioIva!=null && this.jInternalFrameDetalleFormFormularioIva!=null) {this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_ejercicioFormularioIva.setBorder(this.formularioivaConstantesFunciones.resaltarid_ejercicioFormularioIva);}
		if(this.formularioivaConstantesFunciones.resaltarid_periodoFormularioIva!=null && this.jInternalFrameDetalleFormFormularioIva!=null) {this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_periodoFormularioIva.setBorder(this.formularioivaConstantesFunciones.resaltarid_periodoFormularioIva);}
		if(this.formularioivaConstantesFunciones.resaltarid_dato_formulario_ivaFormularioIva!=null && this.jInternalFrameDetalleFormFormularioIva!=null) {this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_dato_formulario_ivaFormularioIva.setBorder(this.formularioivaConstantesFunciones.resaltarid_dato_formulario_ivaFormularioIva);}
		if(this.formularioivaConstantesFunciones.resaltarid_grupo_parametro_formulario_ivaFormularioIva!=null && this.jInternalFrameDetalleFormFormularioIva!=null) {this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.setBorder(this.formularioivaConstantesFunciones.resaltarid_grupo_parametro_formulario_ivaFormularioIva);}
		if(this.formularioivaConstantesFunciones.resaltarid_parametro_formulario_ivaFormularioIva!=null && this.jInternalFrameDetalleFormFormularioIva!=null) {this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_parametro_formulario_ivaFormularioIva.setBorder(this.formularioivaConstantesFunciones.resaltarid_parametro_formulario_ivaFormularioIva);}
		if(this.formularioivaConstantesFunciones.resaltarvalorFormularioIva!=null && this.jInternalFrameDetalleFormFormularioIva!=null) {this.jInternalFrameDetalleFormFormularioIva.jTextFieldvalorFormularioIva.setBorder(this.formularioivaConstantesFunciones.resaltarvalorFormularioIva);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioFormularioIva() throws Exception {		
		if(this.jInternalFrameDetalleFormFormularioIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFormularioIva!=null) {
	
		//this.jInternalFrameDetalleFormFormularioIva.jLabelidFormularioIva.setVisible(this.formularioivaConstantesFunciones.mostraridFormularioIva);
		this.jInternalFrameDetalleFormFormularioIva.jPanelidFormularioIva.setVisible(this.formularioivaConstantesFunciones.mostraridFormularioIva);
		//this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_empresaFormularioIva.setVisible(this.formularioivaConstantesFunciones.mostrarid_empresaFormularioIva);
		this.jInternalFrameDetalleFormFormularioIva.jPanelid_empresaFormularioIva.setVisible(this.formularioivaConstantesFunciones.mostrarid_empresaFormularioIva);
		//this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_ejercicioFormularioIva.setVisible(this.formularioivaConstantesFunciones.mostrarid_ejercicioFormularioIva);
		this.jInternalFrameDetalleFormFormularioIva.jPanelid_ejercicioFormularioIva.setVisible(this.formularioivaConstantesFunciones.mostrarid_ejercicioFormularioIva);
		//this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_periodoFormularioIva.setVisible(this.formularioivaConstantesFunciones.mostrarid_periodoFormularioIva);
		this.jInternalFrameDetalleFormFormularioIva.jPanelid_periodoFormularioIva.setVisible(this.formularioivaConstantesFunciones.mostrarid_periodoFormularioIva);
		//this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_dato_formulario_ivaFormularioIva.setVisible(this.formularioivaConstantesFunciones.mostrarid_dato_formulario_ivaFormularioIva);
		this.jInternalFrameDetalleFormFormularioIva.jPanelid_dato_formulario_ivaFormularioIva.setVisible(this.formularioivaConstantesFunciones.mostrarid_dato_formulario_ivaFormularioIva);
		//this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.setVisible(this.formularioivaConstantesFunciones.mostrarid_grupo_parametro_formulario_ivaFormularioIva);
		this.jInternalFrameDetalleFormFormularioIva.jPanelid_grupo_parametro_formulario_ivaFormularioIva.setVisible(this.formularioivaConstantesFunciones.mostrarid_grupo_parametro_formulario_ivaFormularioIva);
		//this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_parametro_formulario_ivaFormularioIva.setVisible(this.formularioivaConstantesFunciones.mostrarid_parametro_formulario_ivaFormularioIva);
		this.jInternalFrameDetalleFormFormularioIva.jPanelid_parametro_formulario_ivaFormularioIva.setVisible(this.formularioivaConstantesFunciones.mostrarid_parametro_formulario_ivaFormularioIva);
		//this.jInternalFrameDetalleFormFormularioIva.jTextFieldvalorFormularioIva.setVisible(this.formularioivaConstantesFunciones.mostrarvalorFormularioIva);
		this.jInternalFrameDetalleFormFormularioIva.jPanelvalorFormularioIva.setVisible(this.formularioivaConstantesFunciones.mostrarvalorFormularioIva);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioFormularioIva() throws Exception {
		if(this.jInternalFrameDetalleFormFormularioIva==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFormularioIva!=null) {
	
		this.jInternalFrameDetalleFormFormularioIva.jLabelidFormularioIva.setEnabled(this.formularioivaConstantesFunciones.activaridFormularioIva);
		this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_empresaFormularioIva.setEnabled(this.formularioivaConstantesFunciones.activarid_empresaFormularioIva);
		this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_ejercicioFormularioIva.setEnabled(this.formularioivaConstantesFunciones.activarid_ejercicioFormularioIva);
		this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_periodoFormularioIva.setEnabled(this.formularioivaConstantesFunciones.activarid_periodoFormularioIva);
		this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_dato_formulario_ivaFormularioIva.setEnabled(this.formularioivaConstantesFunciones.activarid_dato_formulario_ivaFormularioIva);
		this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_grupo_parametro_formulario_ivaFormularioIva.setEnabled(this.formularioivaConstantesFunciones.activarid_grupo_parametro_formulario_ivaFormularioIva);
		this.jInternalFrameDetalleFormFormularioIva.jComboBoxid_parametro_formulario_ivaFormularioIva.setEnabled(this.formularioivaConstantesFunciones.activarid_parametro_formulario_ivaFormularioIva);
		this.jInternalFrameDetalleFormFormularioIva.jTextFieldvalorFormularioIva.setEnabled(this.formularioivaConstantesFunciones.activarvalorFormularioIva);
		}
	}
	
		
}