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

import com.bydan.erp.contabilidad.util.FormularioRentaConstantesFunciones;
import com.bydan.erp.contabilidad.util.FormularioRentaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.FormularioRentaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.FormularioRentaBean;
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
public class FormularioRentaBeanSwingJInternalFrame extends FormularioRentaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(FormularioRentaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<FormularioRenta> formulariorentaValidator = new ClassValidator<FormularioRenta>(FormularioRenta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public FormularioRenta formulariorenta;	
	public FormularioRenta formulariorentaAux;
	public FormularioRenta formulariorentaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public FormularioRenta formulariorentaTotales;
	public Long idFormularioRentaActual;
	public Long iIdNuevoFormularioRenta=0L;
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

	public String sFinalQueryComboDatoFormularioRenta="";

	public List<DatoFormularioRenta> datoformulariorentasForeignKey;

	public List<DatoFormularioRenta> getdatoformulariorentasForeignKey() {
		return datoformulariorentasForeignKey;
	}

	public void setdatoformulariorentasForeignKey(List<DatoFormularioRenta> datoformulariorentasForeignKey) {
		this.datoformulariorentasForeignKey = datoformulariorentasForeignKey;
	}

	//OBJETO FK ACTUAL
	public DatoFormularioRenta datoformulariorentaForeignKey;

	public DatoFormularioRenta getdatoformulariorentaForeignKey() {
		return datoformulariorentaForeignKey;
	}

	public void setdatoformulariorentaForeignKey(DatoFormularioRenta datoformulariorentaForeignKey) {
		this.datoformulariorentaForeignKey = datoformulariorentaForeignKey;
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

	public String sFinalQueryComboPais="";

	public List<Pais> paissForeignKey;

	public List<Pais> getpaissForeignKey() {
		return paissForeignKey;
	}

	public void setpaissForeignKey(List<Pais> paissForeignKey) {
		this.paissForeignKey = paissForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pais paisForeignKey;

	public Pais getpaisForeignKey() {
		return paisForeignKey;
	}

	public void setpaisForeignKey(Pais paisForeignKey) {
		this.paisForeignKey = paisForeignKey;
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
	
	public Boolean isPermisoTodoFormularioRenta;
	public Boolean isPermisoNuevoFormularioRenta;
	public Boolean isPermisoActualizarFormularioRenta;
	public Boolean isPermisoActualizarOriginalFormularioRenta;
	public Boolean isPermisoEliminarFormularioRenta;
	public Boolean isPermisoGuardarCambiosFormularioRenta;
	public Boolean isPermisoConsultaFormularioRenta;
	public Boolean isPermisoBusquedaFormularioRenta;
	public Boolean isPermisoReporteFormularioRenta;
	public Boolean isPermisoPaginacionMedioFormularioRenta;
	public Boolean isPermisoPaginacionAltoFormularioRenta;
	public Boolean isPermisoPaginacionTodoFormularioRenta;
	public Boolean isPermisoCopiarFormularioRenta;
	public Boolean isPermisoVerFormFormularioRenta;
	public Boolean isPermisoDuplicarFormularioRenta;
	public Boolean isPermisoOrdenFormularioRenta;
	
	
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
	
	public FormularioRentaParameterReturnGeneral formulariorentaReturnGeneral;
	public FormularioRentaParameterReturnGeneral formulariorentaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoFormularioRenta=false;
	public Boolean esParaAccionDesdeFormularioFormularioRenta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected FormularioRentaSessionBeanAdditional formulariorentaSessionBeanAdditional=null;
	
	public FormularioRentaSessionBeanAdditional getFormularioRentaSessionBeanAdditional() {
		return this.formulariorentaSessionBeanAdditional;
	}
	
	public void setFormularioRentaSessionBeanAdditional(FormularioRentaSessionBeanAdditional formulariorentaSessionBeanAdditional) {
		try {
			this.formulariorentaSessionBeanAdditional=formulariorentaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected FormularioRentaBeanSwingJInternalFrameAdditional formulariorentaBeanSwingJInternalFrameAdditional=null;
	//public class FormularioRentaBeanSwingJInternalFrame
	
	public FormularioRentaBeanSwingJInternalFrameAdditional getFormularioRentaBeanSwingJInternalFrameAdditional() {
		return this.formulariorentaBeanSwingJInternalFrameAdditional;
	}
	
	public void setFormularioRentaBeanSwingJInternalFrameAdditional(FormularioRentaBeanSwingJInternalFrameAdditional formulariorentaBeanSwingJInternalFrameAdditional) {
		try {
			this.formulariorentaBeanSwingJInternalFrameAdditional=formulariorentaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public FormularioRentaLogic formulariorentaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public FormularioRenta formulariorentaBean;
	public FormularioRentaConstantesFunciones formulariorentaConstantesFunciones;
	//public FormularioRentaParameterReturnGeneral formulariorentaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public DatoFormularioRentaLogic datoformulariorentaLogic;
	public CuentaContableLogic cuentacontableLogic;
	public TipoRetencionLogic tiporetencionLogic;
	public ParametroFormularioIvaLogic parametroformularioivaLogic;
	public PaisLogic paisLogic;
	
	//PARAMETROS
	
	
	//public List<FormularioRenta> formulariorentas;	
	//public List<FormularioRenta> formulariorentasEliminados;
	//public List<FormularioRenta> formulariorentasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoFormularioRenta=false;
	public Boolean isVisibilidadCeldaDuplicarFormularioRenta=true;
	public Boolean isVisibilidadCeldaCopiarFormularioRenta=true;
	public Boolean isVisibilidadCeldaVerFormFormularioRenta=true;
	public Boolean isVisibilidadCeldaOrdenFormularioRenta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesFormularioRenta=false;
	public Boolean isVisibilidadCeldaModificarFormularioRenta=false;
	public Boolean isVisibilidadCeldaActualizarFormularioRenta=false;
	public Boolean isVisibilidadCeldaEliminarFormularioRenta=false;
	public Boolean isVisibilidadCeldaCancelarFormularioRenta=false;
	public Boolean isVisibilidadCeldaGuardarFormularioRenta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosFormularioRenta=false;	
	
	
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdDatoFormularioRenta=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPais=false;
	public Boolean isVisibilidadFK_IdParametroFormularioIva=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdTipoRetencion=false;
	
	public Long getiIdNuevoFormularioRenta() {
		return this.iIdNuevoFormularioRenta;
	}

	public void setiIdNuevoFormularioRenta(Long iIdNuevoFormularioRenta) {
		this.iIdNuevoFormularioRenta = iIdNuevoFormularioRenta;
	}
	
	public Long getidFormularioRentaActual() {
		return this.idFormularioRentaActual;
	}

	public void setidFormularioRentaActual(Long idFormularioRentaActual) {
		this.idFormularioRentaActual = idFormularioRentaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public FormularioRenta getformulariorenta() {
		return this.formulariorenta;
	}

	public void setformulariorenta(FormularioRenta formulariorenta) {
		this.formulariorenta = formulariorenta;
	}
	
	public FormularioRenta getformulariorentaAux() {
		return this.formulariorentaAux;
	}

	public void setformulariorentaAux(FormularioRenta formulariorentaAux) {
		this.formulariorentaAux = formulariorentaAux;
	}				
	
	public FormularioRenta getformulariorentaAnterior() {
		return this.formulariorentaAnterior;
	}

	public void setformulariorentaAnterior(FormularioRenta formulariorentaAnterior) {
		this.formulariorentaAnterior = formulariorentaAnterior;
	}	
	
	public FormularioRenta getformulariorentaTotales() {
		return this.formulariorentaTotales;
	}

	public void setformulariorentaTotales(FormularioRenta formulariorentaTotales) {
		this.formulariorentaTotales = formulariorentaTotales;
	}	
	
	public FormularioRenta getformulariorentaBean() {
		return this.formulariorentaBean;
	}

	public void setformulariorentaBean(FormularioRenta formulariorentaBean) {
		this.formulariorentaBean = formulariorentaBean;
	}	
	
	public FormularioRentaParameterReturnGeneral getformulariorentaReturnGeneral() {
		return this.formulariorentaReturnGeneral;
	}

	public void setformulariorentaReturnGeneral(FormularioRentaParameterReturnGeneral formulariorentaReturnGeneral) {
		this.formulariorentaReturnGeneral = formulariorentaReturnGeneral;
	}	
	
	
	public Long id_cuenta_contableFK_IdCuentaContable=-1L;

	public Long getid_cuenta_contableFK_IdCuentaContable() {
		return this.id_cuenta_contableFK_IdCuentaContable;
	}

	public void setid_cuenta_contableFK_IdCuentaContable(Long id_cuenta_contableFK_IdCuentaContable) {
		this.id_cuenta_contableFK_IdCuentaContable = id_cuenta_contableFK_IdCuentaContable;
	}

	public Long id_dato_formulario_rentaFK_IdDatoFormularioRenta=-1L;

	public Long getid_dato_formulario_rentaFK_IdDatoFormularioRenta() {
		return this.id_dato_formulario_rentaFK_IdDatoFormularioRenta;
	}

	public void setid_dato_formulario_rentaFK_IdDatoFormularioRenta(Long id_dato_formulario_rentaFK_IdDatoFormularioRenta) {
		this.id_dato_formulario_rentaFK_IdDatoFormularioRenta = id_dato_formulario_rentaFK_IdDatoFormularioRenta;
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

	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
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

	public Long id_tipo_retencionFK_IdTipoRetencion=-1L;

	public Long getid_tipo_retencionFK_IdTipoRetencion() {
		return this.id_tipo_retencionFK_IdTipoRetencion;
	}

	public void setid_tipo_retencionFK_IdTipoRetencion(Long id_tipo_retencionFK_IdTipoRetencion) {
		this.id_tipo_retencionFK_IdTipoRetencion = id_tipo_retencionFK_IdTipoRetencion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public FormularioRentaLogic getFormularioRentaLogic()	{		
		return formulariorentaLogic;
	}

	public void setFormularioRentaLogic(FormularioRentaLogic formulariorentaLogic) {
		this.formulariorentaLogic = formulariorentaLogic;
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
	
	public Boolean getIsEsNuevoFormularioRenta() {
		return isEsNuevoFormularioRenta;
	}

	public void setIsEsNuevoFormularioRenta(Boolean isEsNuevoFormularioRenta) {
		this.isEsNuevoFormularioRenta = isEsNuevoFormularioRenta;
	}

	public Boolean getEsParaAccionDesdeFormularioFormularioRenta() {
		return esParaAccionDesdeFormularioFormularioRenta;
	}
	
	public void setEsParaAccionDesdeFormularioFormularioRenta(Boolean esParaAccionDesdeFormularioFormularioRenta) {
		this.esParaAccionDesdeFormularioFormularioRenta = esParaAccionDesdeFormularioFormularioRenta;
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

			if(this.formulariorentaSessionBean==null) {
				this.formulariorentaSessionBean=new FormularioRentaSessionBean();
			}

			if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(formulariorentaSessionBean.getlidEmpresaActual());
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

			if(this.formulariorentaSessionBean==null) {
				this.formulariorentaSessionBean=new FormularioRentaSessionBean();
			}

			if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(formulariorentaSessionBean.getlidEjercicioActual());
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

			if(this.formulariorentaSessionBean==null) {
				this.formulariorentaSessionBean=new FormularioRentaSessionBean();
			}

			if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(formulariorentaSessionBean.getlidPeriodoActual());
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

	public void cargarCombosDatoFormularioRentasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.datoformulariorentasForeignKey=new ArrayList<DatoFormularioRenta>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			DatoFormularioRentaLogic datoformulariorentaLogic=new DatoFormularioRentaLogic();

			//datoformulariorentaLogic.getDatoFormularioRentaDataAccess().setIsForForeingKeyData(true);

			if(this.formulariorentaSessionBean==null) {
				this.formulariorentaSessionBean=new FormularioRentaSessionBean();
			}

			if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionDatoFormularioRenta()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//datoformulariorentaLogic.getDatoFormularioRentaDataAccess().setIsForForeingKeyData(true);

					datoformulariorentaLogic.getTodosDatoFormularioRentasWithConnection(sFinalQuery,new Pagination());

					this.datoformulariorentasForeignKey=datoformulariorentaLogic.getDatoFormularioRentas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaDatoFormularioRenta(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					datoformulariorentaLogic.getEntityWithConnection(formulariorentaSessionBean.getlidDatoFormularioRentaActual());
					this.datoformulariorentasForeignKey.add(datoformulariorentaLogic.getDatoFormularioRenta());
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

			if(this.formulariorentaSessionBean==null) {
				this.formulariorentaSessionBean=new FormularioRentaSessionBean();
			}

			if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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
					cuentacontableLogic.getEntityWithConnection(formulariorentaSessionBean.getlidCuentaContableActual());
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

			if(this.formulariorentaSessionBean==null) {
				this.formulariorentaSessionBean=new FormularioRentaSessionBean();
			}

			if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencion()) {
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
					tiporetencionLogic.getEntityWithConnection(formulariorentaSessionBean.getlidTipoRetencionActual());
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

			if(this.formulariorentaSessionBean==null) {
				this.formulariorentaSessionBean=new FormularioRentaSessionBean();
			}

			if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionParametroFormularioIva()) {
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
					parametroformularioivaLogic.getEntityWithConnection(formulariorentaSessionBean.getlidParametroFormularioIvaActual());
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

	public void cargarCombosPaissForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paissForeignKey=new ArrayList<Pais>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaisLogic paisLogic=new PaisLogic();

			//paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.formulariorentaSessionBean==null) {
				this.formulariorentaSessionBean=new FormularioRentaSessionBean();
			}

			if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

					paisLogic.getTodosPaissWithConnection(sFinalQuery,new Pagination());

					this.paissForeignKey=paisLogic.getPaiss();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPais(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getEntityWithConnection(formulariorentaSessionBean.getlidPaisActual());
					this.paissForeignKey.add(paisLogic.getPais());
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

					if(this.formulariorenta!=null) {
						this.formulariorenta.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
						this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_empresaFormularioRenta.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaFormularioRenta.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
						if(this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_empresaFormularioRenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_empresaFormularioRenta.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaFormularioRentaGenerico)throws Exception
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
				jComboBoxid_empresaFormularioRentaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaFormularioRentaGenerico!=null && jComboBoxid_empresaFormularioRentaGenerico.getItemCount()>0) {
					jComboBoxid_empresaFormularioRentaGenerico.setSelectedIndex(0);
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

					if(this.formulariorenta!=null) {
						this.formulariorenta.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
						this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_ejercicioFormularioRenta.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioFormularioRenta.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
						if(this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_ejercicioFormularioRenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_ejercicioFormularioRenta.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioFormularioRentaGenerico)throws Exception
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
				jComboBoxid_ejercicioFormularioRentaGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioFormularioRentaGenerico!=null && jComboBoxid_ejercicioFormularioRentaGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioFormularioRentaGenerico.setSelectedIndex(0);
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

					if(this.formulariorenta!=null) {
						this.formulariorenta.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
						this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_periodoFormularioRenta.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoFormularioRenta.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
						if(this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_periodoFormularioRenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_periodoFormularioRenta.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoFormularioRentaGenerico)throws Exception
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
				jComboBoxid_periodoFormularioRentaGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoFormularioRentaGenerico!=null && jComboBoxid_periodoFormularioRentaGenerico.getItemCount()>0) {
					jComboBoxid_periodoFormularioRentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualDatoFormularioRentaForeignKey(Long idDatoFormularioRentaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			DatoFormularioRenta  datoformulariorentaTemp=null;

			for(DatoFormularioRenta datoformulariorentaAux:datoformulariorentasForeignKey) {
				if(datoformulariorentaAux.getId()!=null && datoformulariorentaAux.getId().equals(idDatoFormularioRentaSeleccionado)) {
					datoformulariorentaTemp=datoformulariorentaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(datoformulariorentaTemp!=null) {

					if(this.formulariorenta!=null) {
						this.formulariorenta.setDatoFormularioRenta(datoformulariorentaTemp);
					}

					if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
						this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_dato_formulario_rentaFormularioRenta.setSelectedItem(datoformulariorentaTemp);
					}
				} else {
					//jComboBoxid_dato_formulario_rentaFormularioRenta.setSelectedItem(datoformulariorentaTemp);
					if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
						if(this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_dato_formulario_rentaFormularioRenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_dato_formulario_rentaFormularioRenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdDatoFormularioRenta") || sFormularioTipoBusqueda.equals("Todos")){
					if(datoformulariorentaTemp!=null && jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta!=null) {
						jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta.setSelectedItem(datoformulariorentaTemp);
					} else {
						if(jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta!=null) {
							//jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta.setSelectedItem(datoformulariorentaTemp);
							if(jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta.getItemCount()>0) {
								jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta.setSelectedIndex(0);
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

	public String getActualDatoFormularioRentaForeignKeyDescripcion(Long idDatoFormularioRentaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			DatoFormularioRenta  datoformulariorentaTemp=null;

			for(DatoFormularioRenta datoformulariorentaAux:datoformulariorentasForeignKey) {
				if(datoformulariorentaAux.getId()!=null && datoformulariorentaAux.getId().equals(idDatoFormularioRentaSeleccionado)) {
					datoformulariorentaTemp=datoformulariorentaAux;
					break;
				}
			}


			sDescripcion=DatoFormularioRentaConstantesFunciones.getDatoFormularioRentaDescripcion(datoformulariorentaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualDatoFormularioRentaForeignKeyGenerico(Long idDatoFormularioRentaSeleccionado,JComboBox jComboBoxid_dato_formulario_rentaFormularioRentaGenerico)throws Exception
	{
		try
		{
			DatoFormularioRenta  datoformulariorentaTemp=null;

			for(DatoFormularioRenta datoformulariorentaAux:datoformulariorentasForeignKey) {
				if(datoformulariorentaAux.getId()!=null && datoformulariorentaAux.getId().equals(idDatoFormularioRentaSeleccionado)) {
					datoformulariorentaTemp=datoformulariorentaAux;
					break;
				}
			}

			if(datoformulariorentaTemp!=null) {
				jComboBoxid_dato_formulario_rentaFormularioRentaGenerico.setSelectedItem(datoformulariorentaTemp);
			} else {
				if(jComboBoxid_dato_formulario_rentaFormularioRentaGenerico!=null && jComboBoxid_dato_formulario_rentaFormularioRentaGenerico.getItemCount()>0) {
					jComboBoxid_dato_formulario_rentaFormularioRentaGenerico.setSelectedIndex(0);
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

					if(this.formulariorenta!=null) {
						this.formulariorenta.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
						this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_cuenta_contableFormularioRenta.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableFormularioRenta.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
						if(this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_cuenta_contableFormularioRenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_cuenta_contableFormularioRenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContableFormularioRenta!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContableFormularioRenta.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContableFormularioRenta!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContableFormularioRenta.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContableFormularioRenta.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContableFormularioRenta.setSelectedIndex(0);
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
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableFormularioRentaGenerico)throws Exception
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
				jComboBoxid_cuenta_contableFormularioRentaGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableFormularioRentaGenerico!=null && jComboBoxid_cuenta_contableFormularioRentaGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableFormularioRentaGenerico.setSelectedIndex(0);
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

					if(this.formulariorenta!=null) {
						this.formulariorenta.setTipoRetencion(tiporetencionTemp);
					}

					if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
						this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_tipo_retencionFormularioRenta.setSelectedItem(tiporetencionTemp);
					}
				} else {
					//jComboBoxid_tipo_retencionFormularioRenta.setSelectedItem(tiporetencionTemp);
					if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
						if(this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_tipo_retencionFormularioRenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_tipo_retencionFormularioRenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoRetencion") || sFormularioTipoBusqueda.equals("Todos")){
					if(tiporetencionTemp!=null && jComboBoxid_tipo_retencionFK_IdTipoRetencionFormularioRenta!=null) {
						jComboBoxid_tipo_retencionFK_IdTipoRetencionFormularioRenta.setSelectedItem(tiporetencionTemp);
					} else {
						if(jComboBoxid_tipo_retencionFK_IdTipoRetencionFormularioRenta!=null) {
							//jComboBoxid_tipo_retencionFK_IdTipoRetencionFormularioRenta.setSelectedItem(tiporetencionTemp);
							if(jComboBoxid_tipo_retencionFK_IdTipoRetencionFormularioRenta.getItemCount()>0) {
								jComboBoxid_tipo_retencionFK_IdTipoRetencionFormularioRenta.setSelectedIndex(0);
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
	public void setActualTipoRetencionForeignKeyGenerico(Long idTipoRetencionSeleccionado,JComboBox jComboBoxid_tipo_retencionFormularioRentaGenerico)throws Exception
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
				jComboBoxid_tipo_retencionFormularioRentaGenerico.setSelectedItem(tiporetencionTemp);
			} else {
				if(jComboBoxid_tipo_retencionFormularioRentaGenerico!=null && jComboBoxid_tipo_retencionFormularioRentaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_retencionFormularioRentaGenerico.setSelectedIndex(0);
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

					if(this.formulariorenta!=null) {
						this.formulariorenta.setParametroFormularioIva(parametroformularioivaTemp);
					}

					if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
						this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_parametro_formulario_ivaFormularioRenta.setSelectedItem(parametroformularioivaTemp);
					}
				} else {
					//jComboBoxid_parametro_formulario_ivaFormularioRenta.setSelectedItem(parametroformularioivaTemp);
					if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
						if(this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_parametro_formulario_ivaFormularioRenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_parametro_formulario_ivaFormularioRenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdParametroFormularioIva") || sFormularioTipoBusqueda.equals("Todos")){
					if(parametroformularioivaTemp!=null && jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta!=null) {
						jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta.setSelectedItem(parametroformularioivaTemp);
					} else {
						if(jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta!=null) {
							//jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta.setSelectedItem(parametroformularioivaTemp);
							if(jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta.getItemCount()>0) {
								jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta.setSelectedIndex(0);
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
	public void setActualParametroFormularioIvaForeignKeyGenerico(Long idParametroFormularioIvaSeleccionado,JComboBox jComboBoxid_parametro_formulario_ivaFormularioRentaGenerico)throws Exception
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
				jComboBoxid_parametro_formulario_ivaFormularioRentaGenerico.setSelectedItem(parametroformularioivaTemp);
			} else {
				if(jComboBoxid_parametro_formulario_ivaFormularioRentaGenerico!=null && jComboBoxid_parametro_formulario_ivaFormularioRentaGenerico.getItemCount()>0) {
					jComboBoxid_parametro_formulario_ivaFormularioRentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPaisForeignKey(Long idPaisSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paisTemp!=null) {

					if(this.formulariorenta!=null) {
						this.formulariorenta.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
						this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_paisFormularioRenta.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisFormularioRenta.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
						if(this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_paisFormularioRenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_paisFormularioRenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisFormularioRenta!=null) {
						jComboBoxid_paisFK_IdPaisFormularioRenta.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisFormularioRenta!=null) {
							//jComboBoxid_paisFK_IdPaisFormularioRenta.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisFormularioRenta.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisFormularioRenta.setSelectedIndex(0);
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

	public String getActualPaisForeignKeyDescripcion(Long idPaisSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}


			sDescripcion=PaisConstantesFunciones.getPaisDescripcion(paisTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisFormularioRentaGenerico)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(paisTemp!=null) {
				jComboBoxid_paisFormularioRentaGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisFormularioRentaGenerico!=null && jComboBoxid_paisFormularioRentaGenerico.getItemCount()>0) {
					jComboBoxid_paisFormularioRentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(FormularioRenta formulariorenta,JComboBox jComboBoxid_empresaFormularioRentaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaFormularioRentaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_empresaFormularioRenta.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaFormularioRentaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				formulariorenta.setid_empresa(empresaAux.getId());
				formulariorenta.setempresa_descripcion(FormularioRentaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				formulariorenta.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(FormularioRenta formulariorenta,JComboBox jComboBoxid_ejercicioFormularioRentaGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioFormularioRentaGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_ejercicioFormularioRenta.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioFormularioRentaGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				formulariorenta.setid_ejercicio(ejercicioAux.getId());
				formulariorenta.setejercicio_descripcion(FormularioRentaConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				formulariorenta.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(FormularioRenta formulariorenta,JComboBox jComboBoxid_periodoFormularioRentaGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoFormularioRentaGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_periodoFormularioRenta.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoFormularioRentaGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				formulariorenta.setid_periodo(periodoAux.getId());
				formulariorenta.setperiodo_descripcion(FormularioRentaConstantesFunciones.getPeriodoDescripcion(periodoAux));
				formulariorenta.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarDatoFormularioRentaForeignKey(FormularioRenta formulariorenta,JComboBox jComboBoxid_dato_formulario_rentaFormularioRentaGenerico)throws Exception
	{
		try
		{
			DatoFormularioRenta  datoformulariorentaAux=new DatoFormularioRenta();

			if(jComboBoxid_dato_formulario_rentaFormularioRentaGenerico==null) {
				datoformulariorentaAux=(DatoFormularioRenta)this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_dato_formulario_rentaFormularioRenta.getSelectedItem();
			} else {
				datoformulariorentaAux=(DatoFormularioRenta)jComboBoxid_dato_formulario_rentaFormularioRentaGenerico.getSelectedItem();
			}

			if(datoformulariorentaAux!=null && datoformulariorentaAux.getId()!=null) {
				formulariorenta.setid_dato_formulario_renta(datoformulariorentaAux.getId());
				formulariorenta.setdatoformulariorenta_descripcion(FormularioRentaConstantesFunciones.getDatoFormularioRentaDescripcion(datoformulariorentaAux));
				formulariorenta.setDatoFormularioRenta(datoformulariorentaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(FormularioRenta formulariorenta,JComboBox jComboBoxid_cuenta_contableFormularioRentaGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableFormularioRentaGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_cuenta_contableFormularioRenta.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableFormularioRentaGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				formulariorenta.setid_cuenta_contable(cuentacontableAux.getId());
				formulariorenta.setcuentacontable_descripcion(FormularioRentaConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				formulariorenta.setCuentaContable(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoRetencionForeignKey(FormularioRenta formulariorenta,JComboBox jComboBoxid_tipo_retencionFormularioRentaGenerico)throws Exception
	{
		try
		{
			TipoRetencion  tiporetencionAux=new TipoRetencion();

			if(jComboBoxid_tipo_retencionFormularioRentaGenerico==null) {
				tiporetencionAux=(TipoRetencion)this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_tipo_retencionFormularioRenta.getSelectedItem();
			} else {
				tiporetencionAux=(TipoRetencion)jComboBoxid_tipo_retencionFormularioRentaGenerico.getSelectedItem();
			}

			if(tiporetencionAux!=null && tiporetencionAux.getId()!=null) {
				formulariorenta.setid_tipo_retencion(tiporetencionAux.getId());
				formulariorenta.settiporetencion_descripcion(FormularioRentaConstantesFunciones.getTipoRetencionDescripcion(tiporetencionAux));
				formulariorenta.setTipoRetencion(tiporetencionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarParametroFormularioIvaForeignKey(FormularioRenta formulariorenta,JComboBox jComboBoxid_parametro_formulario_ivaFormularioRentaGenerico)throws Exception
	{
		try
		{
			ParametroFormularioIva  parametroformularioivaAux=new ParametroFormularioIva();

			if(jComboBoxid_parametro_formulario_ivaFormularioRentaGenerico==null) {
				parametroformularioivaAux=(ParametroFormularioIva)this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_parametro_formulario_ivaFormularioRenta.getSelectedItem();
			} else {
				parametroformularioivaAux=(ParametroFormularioIva)jComboBoxid_parametro_formulario_ivaFormularioRentaGenerico.getSelectedItem();
			}

			if(parametroformularioivaAux!=null && parametroformularioivaAux.getId()!=null) {
				formulariorenta.setid_parametro_formulario_iva(parametroformularioivaAux.getId());
				formulariorenta.setparametroformularioiva_descripcion(FormularioRentaConstantesFunciones.getParametroFormularioIvaDescripcion(parametroformularioivaAux));
				formulariorenta.setParametroFormularioIva(parametroformularioivaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(FormularioRenta formulariorenta,JComboBox jComboBoxid_paisFormularioRentaGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisFormularioRentaGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_paisFormularioRenta.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisFormularioRentaGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				formulariorenta.setid_pais(paisAux.getId());
				formulariorenta.setpais_descripcion(FormularioRentaConstantesFunciones.getPaisDescripcion(paisAux));
				formulariorenta.setPais(paisAux);			}
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

					if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) { 
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_empresaFormularioRenta.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_empresaFormularioRenta.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormularioRenta!=null) { 
					}

					if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) { 
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_ejercicioFormularioRenta.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_ejercicioFormularioRenta.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormularioRenta!=null) { 
					}

					if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) { 
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_periodoFormularioRenta.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_periodoFormularioRenta.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormularioRenta!=null) { 
					}

					if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameDatoFormularioRentasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingDatoFormularioRenta=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) { 
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_dato_formulario_rentaFormularioRenta.removeAllItems();

							for(DatoFormularioRenta datoformulariorenta:this.datoformulariorentasForeignKey) {
								this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_dato_formulario_rentaFormularioRenta.addItem(datoformulariorenta);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormularioRenta!=null) { 
					}

					if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdDatoFormularioRenta") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta.removeAllItems();

							for(DatoFormularioRenta datoformulariorenta:this.datoformulariorentasForeignKey) {
								this.jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta.addItem(datoformulariorenta);
							}
						}

						if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) { 
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_cuenta_contableFormularioRenta.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_cuenta_contableFormularioRenta.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormularioRenta!=null) { 
					}

					if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableFormularioRenta.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContableFormularioRenta.addItem(cuentacontable);
							}
						}

						if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) { 
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_tipo_retencionFormularioRenta.removeAllItems();

							for(TipoRetencion tiporetencion:this.tiporetencionsForeignKey) {
								this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_tipo_retencionFormularioRenta.addItem(tiporetencion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormularioRenta!=null) { 
					}

					if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoRetencion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_retencionFK_IdTipoRetencionFormularioRenta.removeAllItems();

							for(TipoRetencion tiporetencion:this.tiporetencionsForeignKey) {
								this.jComboBoxid_tipo_retencionFK_IdTipoRetencionFormularioRenta.addItem(tiporetencion);
							}
						}

						if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) { 
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_parametro_formulario_ivaFormularioRenta.removeAllItems();

							for(ParametroFormularioIva parametroformularioiva:this.parametroformularioivasForeignKey) {
								this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_parametro_formulario_ivaFormularioRenta.addItem(parametroformularioiva);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormularioRenta!=null) { 
					}

					if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdParametroFormularioIva") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta.removeAllItems();

							for(ParametroFormularioIva parametroformularioiva:this.parametroformularioivasForeignKey) {
								this.jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta.addItem(parametroformularioiva);
							}
						}

						if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) { 
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_paisFormularioRenta.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_paisFormularioRenta.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormularioRenta!=null) { 
					}

					if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisFormularioRenta.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisFormularioRenta.addItem(pais);
							}
						}

						if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_empresaFormularioRenta.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_empresaFormularioRenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_ejercicioFormularioRenta.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_ejercicioFormularioRenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_periodoFormularioRenta.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_periodoFormularioRenta.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameDatoFormularioRentaForeignKey(DatoFormularioRenta datoformulariorenta,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_dato_formulario_rentaFormularioRenta.setSelectedItem(datoformulariorenta);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_dato_formulario_rentaFormularioRenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta.setSelectedItem(datoformulariorenta);
						} else {
							this.jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_cuenta_contableFormularioRenta.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_cuenta_contableFormularioRenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableFormularioRenta.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableFormularioRenta.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_tipo_retencionFormularioRenta.setSelectedItem(tiporetencion);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_tipo_retencionFormularioRenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_retencionFK_IdTipoRetencionFormularioRenta.setSelectedItem(tiporetencion);
						} else {
							this.jComboBoxid_tipo_retencionFK_IdTipoRetencionFormularioRenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_parametro_formulario_ivaFormularioRenta.setSelectedItem(parametroformularioiva);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_parametro_formulario_ivaFormularioRenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta.setSelectedItem(parametroformularioiva);
						} else {
							this.jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_paisFormularioRenta.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_paisFormularioRenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisFormularioRenta.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisFormularioRenta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesFormularioRenta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			FormularioRentaConstantesFunciones.refrescarForeignKeysDescripcionesFormularioRenta(this.formulariorentaLogic.getFormularioRentas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			FormularioRentaConstantesFunciones.refrescarForeignKeysDescripcionesFormularioRenta(this.formulariorentas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(DatoFormularioRenta.class));
		classes.add(new Classe(CuentaContable.class));
		classes.add(new Classe(TipoRetencion.class));
		classes.add(new Classe(ParametroFormularioIva.class));
		classes.add(new Classe(Pais.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//formulariorentaLogic.setFormularioRentas(this.formulariorentas);
			formulariorentaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public FormularioRentaParameterReturnGeneral getFormularioRentaParameterGeneral() {
		return this.formulariorentaParameterGeneral;
	}
	
	public void setFormularioRentaParameterGeneral(FormularioRentaParameterReturnGeneral formulariorentaParameterGeneral) {
		this.formulariorentaParameterGeneral = formulariorentaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoFormularioRenta() {
		return isPermisoTodoFormularioRenta;
	}

	public void setIsPermisoTodoFormularioRenta(Boolean isPermisoTodoFormularioRenta) {
		this.isPermisoTodoFormularioRenta = isPermisoTodoFormularioRenta;
	}

	public Boolean getIsPermisoNuevoFormularioRenta() {
		return isPermisoNuevoFormularioRenta;
	}

	public void setIsPermisoNuevoFormularioRenta(Boolean isPermisoNuevoFormularioRenta) {
		this.isPermisoNuevoFormularioRenta = isPermisoNuevoFormularioRenta;
	}

	public Boolean getIsPermisoActualizarFormularioRenta() {
		return isPermisoActualizarFormularioRenta;
	}

	public void setIsPermisoActualizarFormularioRenta(Boolean isPermisoActualizarFormularioRenta) {
		this.isPermisoActualizarFormularioRenta = isPermisoActualizarFormularioRenta;
	}

	public Boolean getIsPermisoEliminarFormularioRenta() {
		return isPermisoEliminarFormularioRenta;
	}

	public void setIsPermisoEliminarFormularioRenta(Boolean isPermisoEliminarFormularioRenta) {
		this.isPermisoEliminarFormularioRenta = isPermisoEliminarFormularioRenta;
	}

	public Boolean getIsPermisoGuardarCambiosFormularioRenta() {
		return isPermisoGuardarCambiosFormularioRenta;
	}

	public void setIsPermisoGuardarCambiosFormularioRenta(Boolean isPermisoGuardarCambiosFormularioRenta) {
		this.isPermisoGuardarCambiosFormularioRenta = isPermisoGuardarCambiosFormularioRenta;
	}
	
	public Boolean getIsPermisoConsultaFormularioRenta() {
		return isPermisoConsultaFormularioRenta;
	}

	public void setIsPermisoConsultaFormularioRenta(Boolean isPermisoConsultaFormularioRenta) {
		this.isPermisoConsultaFormularioRenta = isPermisoConsultaFormularioRenta;
	}

	public Boolean getIsPermisoBusquedaFormularioRenta() {
		return isPermisoBusquedaFormularioRenta;
	}

	public void setIsPermisoBusquedaFormularioRenta(Boolean isPermisoBusquedaFormularioRenta) {
		this.isPermisoBusquedaFormularioRenta = isPermisoBusquedaFormularioRenta;
	}

	public Boolean getIsPermisoReporteFormularioRenta() {
		return isPermisoReporteFormularioRenta;
	}

	public void setIsPermisoReporteFormularioRenta(Boolean isPermisoReporteFormularioRenta) {
		this.isPermisoReporteFormularioRenta = isPermisoReporteFormularioRenta;
	}
	
	public Boolean getIsPermisoPaginacionMedioFormularioRenta() {
		return isPermisoPaginacionMedioFormularioRenta;
	}

	public void setIsPermisoPaginacionMedioFormularioRenta(Boolean isPermisoPaginacionMedioFormularioRenta) {
		this.isPermisoPaginacionMedioFormularioRenta = isPermisoPaginacionMedioFormularioRenta;
	}
	
	public Boolean getIsPermisoPaginacionTodoFormularioRenta() {
		return isPermisoPaginacionTodoFormularioRenta;
	}

	public void setIsPermisoPaginacionTodoFormularioRenta(Boolean isPermisoPaginacionTodoFormularioRenta) {
		this.isPermisoPaginacionTodoFormularioRenta = isPermisoPaginacionTodoFormularioRenta;
	}
	
	public Boolean getIsPermisoPaginacionAltoFormularioRenta() {
		return isPermisoPaginacionAltoFormularioRenta;
	}

	public void setIsPermisoPaginacionAltoFormularioRenta(Boolean isPermisoPaginacionAltoFormularioRenta) {
		this.isPermisoPaginacionAltoFormularioRenta = isPermisoPaginacionAltoFormularioRenta;
	}
	
	public Boolean getIsPermisoCopiarFormularioRenta() {
		return isPermisoCopiarFormularioRenta;
	}

	public void setIsPermisoCopiarFormularioRenta(Boolean isPermisoCopiarFormularioRenta) {
		this.isPermisoCopiarFormularioRenta = isPermisoCopiarFormularioRenta;
	}
	
	public Boolean getIsPermisoVerFormFormularioRenta() {
		return isPermisoVerFormFormularioRenta;
	}

	public void setIsPermisoVerFormFormularioRenta(Boolean isPermisoVerFormFormularioRenta) {
		this.isPermisoVerFormFormularioRenta = isPermisoVerFormFormularioRenta;
	}
	
	public Boolean getIsPermisoDuplicarFormularioRenta() {
		return isPermisoDuplicarFormularioRenta;
	}

	public void setIsPermisoDuplicarFormularioRenta(Boolean isPermisoDuplicarFormularioRenta) {
		this.isPermisoDuplicarFormularioRenta = isPermisoDuplicarFormularioRenta;
	}
	
	public Boolean getIsPermisoOrdenFormularioRenta() {
		return isPermisoOrdenFormularioRenta;
	}

	public void setIsPermisoOrdenFormularioRenta(Boolean isPermisoOrdenFormularioRenta) {
		this.isPermisoOrdenFormularioRenta = isPermisoOrdenFormularioRenta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoFormularioRenta() {
		return isVisibilidadCeldaNuevoFormularioRenta;
	}

	public void setIsVisibilidadCeldaNuevoFormularioRenta(Boolean isVisibilidadCeldaNuevoFormularioRenta) {
		this.isVisibilidadCeldaNuevoFormularioRenta = isVisibilidadCeldaNuevoFormularioRenta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarFormularioRenta() {
		return isVisibilidadCeldaDuplicarFormularioRenta;
	}

	public void setIsVisibilidadCeldaDuplicarFormularioRenta(Boolean isVisibilidadCeldaDuplicarFormularioRenta) {
		this.isVisibilidadCeldaDuplicarFormularioRenta = isVisibilidadCeldaDuplicarFormularioRenta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarFormularioRenta() {
		return isVisibilidadCeldaCopiarFormularioRenta;
	}

	public void setIsVisibilidadCeldaCopiarFormularioRenta(Boolean isVisibilidadCeldaCopiarFormularioRenta) {
		this.isVisibilidadCeldaCopiarFormularioRenta = isVisibilidadCeldaCopiarFormularioRenta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormFormularioRenta() {
		return isVisibilidadCeldaVerFormFormularioRenta;
	}

	public void setIsVisibilidadCeldaVerFormFormularioRenta(Boolean isVisibilidadCeldaVerFormFormularioRenta) {
		this.isVisibilidadCeldaVerFormFormularioRenta = isVisibilidadCeldaVerFormFormularioRenta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenFormularioRenta() {
		return isVisibilidadCeldaOrdenFormularioRenta;
	}

	public void setIsVisibilidadCeldaOrdenFormularioRenta(Boolean isVisibilidadCeldaOrdenFormularioRenta) {
		this.isVisibilidadCeldaOrdenFormularioRenta = isVisibilidadCeldaOrdenFormularioRenta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesFormularioRenta() {
		return isVisibilidadCeldaNuevoRelacionesFormularioRenta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesFormularioRenta(Boolean isVisibilidadCeldaNuevoRelacionesFormularioRenta) {
		this.isVisibilidadCeldaNuevoRelacionesFormularioRenta = isVisibilidadCeldaNuevoRelacionesFormularioRenta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarFormularioRenta() {
		return isVisibilidadCeldaModificarFormularioRenta;
	}

	public void setIsVisibilidadCeldaModificarFormularioRenta(Boolean isVisibilidadCeldaModificarFormularioRenta) {
		this.isVisibilidadCeldaModificarFormularioRenta = isVisibilidadCeldaModificarFormularioRenta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarFormularioRenta() {
		return isVisibilidadCeldaActualizarFormularioRenta;
	}

	public void setIsVisibilidadCeldaActualizarFormularioRenta(Boolean isVisibilidadCeldaActualizarFormularioRenta) {
		this.isVisibilidadCeldaActualizarFormularioRenta = isVisibilidadCeldaActualizarFormularioRenta;
	}

	public Boolean getIsVisibilidadCeldaEliminarFormularioRenta() {
		return isVisibilidadCeldaEliminarFormularioRenta;
	}

	public void setIsVisibilidadCeldaEliminarFormularioRenta(Boolean isVisibilidadCeldaEliminarFormularioRenta) {
		this.isVisibilidadCeldaEliminarFormularioRenta = isVisibilidadCeldaEliminarFormularioRenta;
	}

	public Boolean getIsVisibilidadCeldaCancelarFormularioRenta() {
		return isVisibilidadCeldaCancelarFormularioRenta;
	}

	public void setIsVisibilidadCeldaCancelarFormularioRenta(Boolean isVisibilidadCeldaCancelarFormularioRenta) {
		this.isVisibilidadCeldaCancelarFormularioRenta = isVisibilidadCeldaCancelarFormularioRenta;
	}

	public Boolean getIsVisibilidadCeldaGuardarFormularioRenta() {
		return isVisibilidadCeldaGuardarFormularioRenta;
	}

	public void setIsVisibilidadCeldaGuardarFormularioRenta(Boolean isVisibilidadCeldaGuardarFormularioRenta) {
		this.isVisibilidadCeldaGuardarFormularioRenta = isVisibilidadCeldaGuardarFormularioRenta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosFormularioRenta() {
		return isVisibilidadCeldaGuardarCambiosFormularioRenta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosFormularioRenta(Boolean isVisibilidadCeldaGuardarCambiosFormularioRenta) {
		this.isVisibilidadCeldaGuardarCambiosFormularioRenta = isVisibilidadCeldaGuardarCambiosFormularioRenta;
	}
		
	public FormularioRentaSessionBean getformulariorentaSessionBean() {
		return this.formulariorentaSessionBean;
	}
	
	public void setformulariorentaSessionBean(FormularioRentaSessionBean formulariorentaSessionBean) {
		this.formulariorentaSessionBean=formulariorentaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCuentaContable() {
		return this.isVisibilidadFK_IdCuentaContable;
	}

	public void setisVisibilidadFK_IdCuentaContable(Boolean isVisibilidadFK_IdCuentaContable) {
		this.isVisibilidadFK_IdCuentaContable=isVisibilidadFK_IdCuentaContable;
	}

	public Boolean getisVisibilidadFK_IdDatoFormularioRenta() {
		return this.isVisibilidadFK_IdDatoFormularioRenta;
	}

	public void setisVisibilidadFK_IdDatoFormularioRenta(Boolean isVisibilidadFK_IdDatoFormularioRenta) {
		this.isVisibilidadFK_IdDatoFormularioRenta=isVisibilidadFK_IdDatoFormularioRenta;
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

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
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

	public Boolean getisVisibilidadFK_IdTipoRetencion() {
		return this.isVisibilidadFK_IdTipoRetencion;
	}

	public void setisVisibilidadFK_IdTipoRetencion(Boolean isVisibilidadFK_IdTipoRetencion) {
		this.isVisibilidadFK_IdTipoRetencion=isVisibilidadFK_IdTipoRetencion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(FormularioRenta formulariorenta)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(formulariorenta,null);
				this.setActualParaGuardarEjercicioForeignKey(formulariorenta,null);
				this.setActualParaGuardarPeriodoForeignKey(formulariorenta,null);
				this.setActualParaGuardarDatoFormularioRentaForeignKey(formulariorenta,null);
				this.setActualParaGuardarCuentaContableForeignKey(formulariorenta,null);
				this.setActualParaGuardarTipoRetencionForeignKey(formulariorenta,null);
				this.setActualParaGuardarParametroFormularioIvaForeignKey(formulariorenta,null);
				this.setActualParaGuardarPaisForeignKey(formulariorenta,null);
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
	
	public void bugActualizarReferenciaActual(FormularioRenta formulariorenta,FormularioRenta formulariorentaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalFormularioRenta(formulariorenta);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		formulariorentaAux.setId(formulariorenta.getId());
		formulariorentaAux.setVersionRow(formulariorenta.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessFormularioRenta();
		
			int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(FormularioRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualFormularioRenta(this.formulariorenta,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = formulariorentaValidator.getInvalidValues(this.formulariorenta);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			formulariorentaLogic.setDatosCliente(datosCliente);
			formulariorentaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				formulariorentaAux=new  FormularioRenta();
				
				formulariorentaAux.setIsNew(true);
				formulariorentaAux.setIsChanged(true);
				
				formulariorentaAux.setFormularioRentaOriginal(this.formulariorenta);
				
				formulariorentaAux.setId(this.formulariorenta.getId());	
				formulariorentaAux.setVersionRow(this.formulariorenta.getVersionRow());	
				formulariorentaAux.setid_empresa(this.formulariorenta.getid_empresa());	
				formulariorentaAux.setid_ejercicio(this.formulariorenta.getid_ejercicio());	
				formulariorentaAux.setid_periodo(this.formulariorenta.getid_periodo());	
				formulariorentaAux.setid_dato_formulario_renta(this.formulariorenta.getid_dato_formulario_renta());	
				formulariorentaAux.setid_cuenta_contable(this.formulariorenta.getid_cuenta_contable());	
				formulariorentaAux.setid_tipo_retencion(this.formulariorenta.getid_tipo_retencion());	
				formulariorentaAux.setid_parametro_formulario_iva(this.formulariorenta.getid_parametro_formulario_iva());	
				formulariorentaAux.setid_pais(this.formulariorenta.getid_pais());	
				formulariorentaAux.setvalor_pagado(this.formulariorenta.getvalor_pagado());	
				formulariorentaAux.setimpuesto_retenido(this.formulariorenta.getimpuesto_retenido());	
				formulariorentaAux.setbase_impornible(this.formulariorenta.getbase_impornible());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.formulariorentaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.formulariorentaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(formulariorentaAux,formulariorentaLogic.getFormularioRentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formulariorentaAux,formulariorentas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.formulariorentaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formulariorentaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorentaLogic.saveFormularioRentas();//WithConnection
						//formulariorentaLogic.getSetVersionRowFormularioRentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.formulariorenta,formulariorentaAux);
					
					this.refrescarForeignKeysDescripcionesFormularioRenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formulariorentaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formulariorentaLogic.saveFormularioRentaRelaciones(formulariorentaAux);//WithConnection
								//formulariorentaLogic.getSetVersionRowFormularioRentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.formulariorenta,formulariorentaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.formulariorentaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.formulariorentaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(formulariorentaAux,formulariorentaLogic.getFormularioRentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(formulariorentaAux,formulariorentas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.formulariorenta,formulariorentaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				formulariorentaAux=new  FormularioRenta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.formulariorentaSessionBean.getEsGuardarRelacionado() 
					|| (this.formulariorentaSessionBean.getEsGuardarRelacionado() && this.formulariorenta.getId()>=0)) {
						
					formulariorentaAux.setIsNew(false);
				}
				
				formulariorentaAux.setIsDeleted(false);
			
				formulariorentaAux.setId(this.formulariorenta.getId());	
				formulariorentaAux.setVersionRow(this.formulariorenta.getVersionRow());	
				formulariorentaAux.setid_empresa(this.formulariorenta.getid_empresa());	
				formulariorentaAux.setid_ejercicio(this.formulariorenta.getid_ejercicio());	
				formulariorentaAux.setid_periodo(this.formulariorenta.getid_periodo());	
				formulariorentaAux.setid_dato_formulario_renta(this.formulariorenta.getid_dato_formulario_renta());	
				formulariorentaAux.setid_cuenta_contable(this.formulariorenta.getid_cuenta_contable());	
				formulariorentaAux.setid_tipo_retencion(this.formulariorenta.getid_tipo_retencion());	
				formulariorentaAux.setid_parametro_formulario_iva(this.formulariorenta.getid_parametro_formulario_iva());	
				formulariorentaAux.setid_pais(this.formulariorenta.getid_pais());	
				formulariorentaAux.setvalor_pagado(this.formulariorenta.getvalor_pagado());	
				formulariorentaAux.setimpuesto_retenido(this.formulariorenta.getimpuesto_retenido());	
				formulariorentaAux.setbase_impornible(this.formulariorenta.getbase_impornible());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(formulariorentaAux,formulariorentaLogic.getFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formulariorentaAux,formulariorentas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.formulariorentaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formulariorentaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorentaLogic.saveFormularioRentas();//WithConnection
						//formulariorentaLogic.getSetVersionRowFormularioRentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.formulariorenta,formulariorentaAux);
					
					this.refrescarForeignKeysDescripcionesFormularioRenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formulariorentaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formulariorentaLogic.saveFormularioRentaRelaciones(formulariorentaAux);//WithConnection
								//formulariorentaLogic.getSetVersionRowFormularioRentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.formulariorenta,formulariorentaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.formulariorentaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.formulariorentaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(formulariorentaAux,formulariorentaLogic.getFormularioRentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(formulariorentaAux,formulariorentas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.formulariorenta,formulariorentaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				formulariorentaAux=new  FormularioRenta();
				
				formulariorentaAux.setIsNew(false);
				formulariorentaAux.setIsChanged(false);
				
				formulariorentaAux.setIsDeleted(true);
				
				formulariorentaAux.setId(this.formulariorenta.getId());	
				formulariorentaAux.setVersionRow(this.formulariorenta.getVersionRow());	
				formulariorentaAux.setid_empresa(this.formulariorenta.getid_empresa());	
				formulariorentaAux.setid_ejercicio(this.formulariorenta.getid_ejercicio());	
				formulariorentaAux.setid_periodo(this.formulariorenta.getid_periodo());	
				formulariorentaAux.setid_dato_formulario_renta(this.formulariorenta.getid_dato_formulario_renta());	
				formulariorentaAux.setid_cuenta_contable(this.formulariorenta.getid_cuenta_contable());	
				formulariorentaAux.setid_tipo_retencion(this.formulariorenta.getid_tipo_retencion());	
				formulariorentaAux.setid_parametro_formulario_iva(this.formulariorenta.getid_parametro_formulario_iva());	
				formulariorentaAux.setid_pais(this.formulariorenta.getid_pais());	
				formulariorentaAux.setvalor_pagado(this.formulariorenta.getvalor_pagado());	
				formulariorentaAux.setimpuesto_retenido(this.formulariorenta.getimpuesto_retenido());	
				formulariorentaAux.setbase_impornible(this.formulariorenta.getbase_impornible());	
				
				if(this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.formulariorentaAux.getId()>=0) {	
						this.formulariorentasEliminados.add(formulariorentaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(formulariorentaAux,formulariorentaLogic.getFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formulariorentaAux,formulariorentas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.formulariorentaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formulariorentaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorentaLogic.saveFormularioRentas();//WithConnection
						//formulariorentaLogic.getSetVersionRowFormularioRentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formulariorentaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formulariorentaLogic.saveFormularioRentaRelaciones(formulariorentaAux);//WithConnection
								//formulariorentaLogic.getSetVersionRowFormularioRentas();//WithConnection
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
							if(this.formulariorentaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.formulariorentaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(formulariorentaAux,formulariorentaLogic.getFormularioRentas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(formulariorentaAux,formulariorentas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.getFormularioRentas().addAll(this.formulariorentasEliminados);
					
					formulariorentaLogic.saveFormularioRentas();//WithConnection
					//formulariorentaLogic.getSetVersionRowFormularioRentas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesFormularioRenta();
				
				this.formulariorentasEliminados= new ArrayList<FormularioRenta>();		
			}
			
			if(this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulariorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Formulario Renta GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Formulario Renta",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.formulariorenta=formulariorentaAux;
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
      		//this.finishProcessFormularioRenta();
      	}
		
	}	
	
	public void actualizarRelaciones(FormularioRenta formulariorentaLocal) throws Exception {
		
		if(this.formulariorentaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(FormularioRenta formulariorentaLocal) throws Exception {	
		if(this.formulariorentaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				formulariorentaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				formulariorentaLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				formulariorentaLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(DatoFormularioRentaDetalleFormJInternalFrame.class)) {
				DatoFormularioRentaBeanSwingJInternalFrame datoformulariorentaBeanSwingJInternalFrameLocal=(DatoFormularioRentaBeanSwingJInternalFrame) ((DatoFormularioRentaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				datoformulariorentaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoDatoFormularioRenta(datoformulariorentaBeanSwingJInternalFrameLocal.getdatoformulariorenta(),true);
				datoformulariorentaBeanSwingJInternalFrameLocal.actualizarLista(datoformulariorentaBeanSwingJInternalFrameLocal.datoformulariorenta,this.datoformulariorentasForeignKey);

				datoformulariorentaBeanSwingJInternalFrameLocal.actualizarRelaciones(datoformulariorentaBeanSwingJInternalFrameLocal.datoformulariorenta);

				formulariorentaLocal.setDatoFormularioRenta(datoformulariorentaBeanSwingJInternalFrameLocal.datoformulariorenta);

				this.addItemDefectoCombosForeignKeyDatoFormularioRenta();
				this.cargarCombosFrameDatoFormularioRentasForeignKey("Formulario");
				this.setActualDatoFormularioRentaForeignKey(datoformulariorentaBeanSwingJInternalFrameLocal.datoformulariorenta.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				formulariorentaLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoRetencionDetalleFormJInternalFrame.class)) {
				TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrameLocal=(TipoRetencionBeanSwingJInternalFrame) ((TipoRetencionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tiporetencionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoRetencion(tiporetencionBeanSwingJInternalFrameLocal.gettiporetencion(),true);
				tiporetencionBeanSwingJInternalFrameLocal.actualizarLista(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion,this.tiporetencionsForeignKey);

				tiporetencionBeanSwingJInternalFrameLocal.actualizarRelaciones(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion);

				formulariorentaLocal.setTipoRetencion(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion);

				this.addItemDefectoCombosForeignKeyTipoRetencion();
				this.cargarCombosFrameTipoRetencionsForeignKey("Formulario");
				this.setActualTipoRetencionForeignKey(tiporetencionBeanSwingJInternalFrameLocal.tiporetencion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ParametroFormularioIvaDetalleFormJInternalFrame.class)) {
				ParametroFormularioIvaBeanSwingJInternalFrame parametroformularioivaBeanSwingJInternalFrameLocal=(ParametroFormularioIvaBeanSwingJInternalFrame) ((ParametroFormularioIvaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				parametroformularioivaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoParametroFormularioIva(parametroformularioivaBeanSwingJInternalFrameLocal.getparametroformularioiva(),true);
				parametroformularioivaBeanSwingJInternalFrameLocal.actualizarLista(parametroformularioivaBeanSwingJInternalFrameLocal.parametroformularioiva,this.parametroformularioivasForeignKey);

				parametroformularioivaBeanSwingJInternalFrameLocal.actualizarRelaciones(parametroformularioivaBeanSwingJInternalFrameLocal.parametroformularioiva);

				formulariorentaLocal.setParametroFormularioIva(parametroformularioivaBeanSwingJInternalFrameLocal.parametroformularioiva);

				this.addItemDefectoCombosForeignKeyParametroFormularioIva();
				this.cargarCombosFrameParametroFormularioIvasForeignKey("Formulario");
				this.setActualParametroFormularioIvaForeignKey(parametroformularioivaBeanSwingJInternalFrameLocal.parametroformularioiva.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				formulariorentaLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarFormularioRentaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = formulariorentaValidator.getInvalidValues(this.formulariorenta);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(FormularioRenta formulariorenta,List<FormularioRenta> formulariorentas) throws Exception {
		try	{		
			FormularioRentaConstantesFunciones.actualizarLista(formulariorenta,formulariorentas,this.formulariorentaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(FormularioRenta formulariorenta,List<FormularioRenta> formulariorentas) throws Exception {
		try	{			
			FormularioRentaConstantesFunciones.actualizarSelectedLista(formulariorenta,formulariorentas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<FormularioRenta> formulariorentasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				formulariorentasLocal=this.formulariorentaLogic.getFormularioRentas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				formulariorentasLocal=this.formulariorentas;
			}
			//ARCHITECTURE
		
			for(FormularioRenta formulariorentaLocal:formulariorentasLocal) {
				if(this.permiteMantenimiento(formulariorentaLocal) && formulariorentaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+FormularioRentaConstantesFunciones.getFormularioRentaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(FormularioRentaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta.jLabelid_empresaFormularioRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormularioRentaConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta.jLabelid_ejercicioFormularioRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormularioRentaConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta.jLabelid_periodoFormularioRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormularioRentaConstantesFunciones.IDDATOFORMULARIORENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta.jLabelid_dato_formulario_rentaFormularioRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormularioRentaConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta.jLabelid_cuenta_contableFormularioRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormularioRentaConstantesFunciones.IDTIPORETENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta.jLabelid_tipo_retencionFormularioRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormularioRentaConstantesFunciones.IDPARAMETROFORMULARIOIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta.jLabelid_parametro_formulario_ivaFormularioRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormularioRentaConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta.jLabelid_paisFormularioRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormularioRentaConstantesFunciones.VALORPAGADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta.jLabelvalor_pagadoFormularioRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormularioRentaConstantesFunciones.IMPUESTORETENIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta.jLabelimpuesto_retenidoFormularioRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormularioRentaConstantesFunciones.BASEIMPORNIBLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta.jLabelbase_impornibleFormularioRenta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioRenta.jLabelid_empresaFormularioRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioRenta.jLabelid_ejercicioFormularioRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioRenta.jLabelid_periodoFormularioRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioRenta.jLabelid_dato_formulario_rentaFormularioRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioRenta.jLabelid_cuenta_contableFormularioRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioRenta.jLabelid_tipo_retencionFormularioRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioRenta.jLabelid_parametro_formulario_ivaFormularioRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioRenta.jLabelid_paisFormularioRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioRenta.jLabelvalor_pagadoFormularioRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioRenta.jLabelimpuesto_retenidoFormularioRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioRenta.jLabelbase_impornibleFormularioRenta,"");
		
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
		this.iIdNuevoFormularioRenta--;	
		
		
		this.formulariorentaAux=new FormularioRenta();
		
		this.formulariorentaAux.setId(this.iIdNuevoFormularioRenta);
		this.formulariorentaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.formulariorentaLogic.getFormularioRentas().add(this.formulariorentaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.formulariorentas.add(this.formulariorentaAux);
		}
		//ARCHITECTURE
		
		this.formulariorenta=this.formulariorentaAux;
		
		if(FormularioRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioFormularioRenta(this.formulariorenta);
			this.setVariablesObjetoActualToFormularioForeignKeyFormularioRenta(this.formulariorenta);
		}
				
		//this.setDefaultControlesFormularioRenta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyFormularioRenta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyFormularioRenta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyFormularioRenta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFormularioRenta(this.formulariorentaBean,this.formulariorenta,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(FormularioRentaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.formulariorentaSessionBean.getConGuardarRelaciones()) {
			classes=FormularioRentaConstantesFunciones.getClassesRelationshipsOfFormularioRenta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.formulariorentaReturnGeneral=formulariorentaLogic.procesarEventosFormularioRentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formulariorentaLogic.getFormularioRentas(),this.formulariorenta,this.formulariorentaParameterGeneral,this.isEsNuevoFormularioRenta,classes);//this.formulariorentaLogic.getFormularioRenta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanFormularioRenta(this.formulariorentaReturnGeneral,this.formulariorentaBean,false);
		
		if(this.formulariorentaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyFormularioRenta(this.formulariorentaReturnGeneral.getFormularioRenta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioFormularioRenta(this.formulariorentaReturnGeneral.getFormularioRenta());
		}
		
		if(this.formulariorentaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioFormularioRenta(this.formulariorentaReturnGeneral.getFormularioRenta(),classes);//this.formulariorentaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualFormularioRenta(this.formulariorenta,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyFormularioRenta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyFormularioRenta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FormularioRentaBeanSwingJInternalFrameAdditional.RecargarFormFormularioRenta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingFormularioRenta(false);
						
			if(formulariorentaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormularioRenta();
			}
			
			this.actualizarVisualTableDatosFormularioRenta();
			
			this.jTableDatosFormularioRenta.setRowSelectionInterval(this.getIndiceNuevoFormularioRenta(), this.getIndiceNuevoFormularioRenta());
			
			this.seleccionarFilaTablaFormularioRentaActual();
						
			this.actualizarEstadoCeldasBotonesFormularioRenta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesFormularioRenta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormFormularioRenta.jTextFieldvalor_pagadoFormularioRenta.setEnabled(isHabilitar && this.formulariorentaConstantesFunciones.activarvalor_pagadoFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jTextFieldimpuesto_retenidoFormularioRenta.setEnabled(isHabilitar && this.formulariorentaConstantesFunciones.activarimpuesto_retenidoFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jTextFieldbase_impornibleFormularioRenta.setEnabled(isHabilitar && this.formulariorentaConstantesFunciones.activarbase_impornibleFormularioRenta);	
		//
		this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_empresaFormularioRenta.setEnabled(isHabilitar && this.formulariorentaConstantesFunciones.activarid_empresaFormularioRenta);//
		this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_ejercicioFormularioRenta.setEnabled(isHabilitar && this.formulariorentaConstantesFunciones.activarid_ejercicioFormularioRenta);//
		this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_periodoFormularioRenta.setEnabled(isHabilitar && this.formulariorentaConstantesFunciones.activarid_periodoFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_dato_formulario_rentaFormularioRenta.setEnabled(isHabilitar && this.formulariorentaConstantesFunciones.activarid_dato_formulario_rentaFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_cuenta_contableFormularioRenta.setEnabled(isHabilitar && this.formulariorentaConstantesFunciones.activarid_cuenta_contableFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_tipo_retencionFormularioRenta.setEnabled(isHabilitar && this.formulariorentaConstantesFunciones.activarid_tipo_retencionFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_parametro_formulario_ivaFormularioRenta.setEnabled(isHabilitar && this.formulariorentaConstantesFunciones.activarid_parametro_formulario_ivaFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_paisFormularioRenta.setEnabled(isHabilitar && this.formulariorentaConstantesFunciones.activarid_paisFormularioRenta);
	};
	
	public void setDefaultControlesFormularioRenta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoFormularioRenta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.formulariorentaSessionBean.setConGuardarRelaciones(true);			
			this.formulariorentaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormFormularioRenta.jTabbedPaneRelacionesFormularioRenta.setVisible(true);
			
					
		} else {
			//this.formulariorentaSessionBean.setConGuardarRelaciones(false);			
			this.formulariorentaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormFormularioRenta.jTabbedPaneRelacionesFormularioRenta.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoFormularioRenta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormularioRenta formulariorentaAux:this.formulariorentaLogic.getFormularioRentas()) {
				if(formulariorentaAux.getId().equals(this.iIdNuevoFormularioRenta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormularioRenta formulariorentaAux:this.formulariorentas) {
				if(formulariorentaAux.getId().equals(this.iIdNuevoFormularioRenta)) {
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
	
	public int getIndiceActualFormularioRenta(FormularioRenta formulariorenta,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormularioRenta formulariorentaAux:this.formulariorentaLogic.getFormularioRentas()) {
				if(formulariorentaAux.getId().equals(formulariorenta.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormularioRenta formulariorentaAux:this.formulariorentas) {
				if(formulariorentaAux.getId().equals(formulariorenta.getId())) {
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
	
	public void setCamposBaseDesdeOriginalFormularioRenta(FormularioRenta formulariorentaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormularioRenta formulariorentaAux:this.formulariorentaLogic.getFormularioRentas()) {
				if(formulariorentaAux.getFormularioRentaOriginal().getId().equals(formulariorentaOriginal.getId())) {
					existe=true;
					formulariorentaOriginal.setId(formulariorentaAux.getId());
					formulariorentaOriginal.setVersionRow(formulariorentaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormularioRenta formulariorentaAux:this.formulariorentas) {
				if(formulariorentaAux.getFormularioRentaOriginal().getId().equals(formulariorentaOriginal.getId())) {
					existe=true;
					formulariorentaOriginal.setId(formulariorentaAux.getId());
					formulariorentaOriginal.setVersionRow(formulariorentaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosFormularioRenta(Boolean esParaCancelar) throws Exception {
		formulariorentasAux=new ArrayList<FormularioRenta>();
		formulariorentaAux=new FormularioRenta();
		
		if(!this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FormularioRenta formulariorentaAux:this.formulariorentaLogic.getFormularioRentas()) {
					if(formulariorentaAux.getId()<0) {
						formulariorentasAux.add(formulariorentaAux);
					}		
				}
				this.iIdNuevoFormularioRenta=0L;
				this.formulariorentaLogic.getFormularioRentas().removeAll(formulariorentasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormularioRenta formulariorentaAux:this.formulariorentas) {
					if(formulariorentaAux.getId()<0) {
						formulariorentasAux.add(formulariorentaAux);
					}		
				}
				this.iIdNuevoFormularioRenta=0L;
				this.formulariorentas.removeAll(formulariorentasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoFormularioRenta 
					&& this.formulariorentaLogic.getFormularioRentas().size()>0
					) {
					formulariorentaAux=this.formulariorentaLogic.getFormularioRentas().get(this.formulariorentaLogic.getFormularioRentas().size() - 1);
				
					if(formulariorentaAux.getId()<0) {
						this.formulariorentaLogic.getFormularioRentas().remove(formulariorentaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoFormularioRenta && this.formulariorentas.size()>0) {
					formulariorentaAux=this.formulariorentas.get(this.formulariorentas.size() - 1);
				
					if(formulariorentaAux.getId()<0) {
						this.formulariorentas.remove(formulariorentaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoFormularioRenta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(formulariorenta.getId()<0) {
				this.formulariorentaLogic.getFormularioRentas().remove(this.formulariorenta);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(formulariorenta.getId()<0) {
				this.formulariorentas.remove(this.formulariorenta);
			}
		}			
	}
	
	public void setEstadosInicialesFormularioRenta(List<FormularioRenta> formulariorentasAux) throws Exception {
		FormularioRentaConstantesFunciones.setEstadosInicialesFormularioRenta(formulariorentasAux);
	}
	
	public void setEstadosInicialesFormularioRenta(FormularioRenta formulariorentaAux) throws Exception {
		FormularioRentaConstantesFunciones.setEstadosInicialesFormularioRenta(formulariorentaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarFormularioRentaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesFormularioRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarFormularioRentaActual()) {
				if(!this.isEsNuevoFormularioRenta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesFormularioRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoFormularioRenta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarFormularioRentaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Formulario Renta ?", "MANTENIMIENTO DE Formulario Renta", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesFormularioRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(FormularioRenta formulariorenta) throws Exception {
		FormularioRentaConstantesFunciones.seleccionarAsignar(this.formulariorenta,formulariorenta);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarFormularioRenta=this.isPermisoActualizarOriginalFormularioRenta;
			
			
			this.seleccionarAsignar(formulariorenta);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FormularioRentaConstantesFunciones.quitarEspaciosFormularioRenta(this.formulariorenta,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesFormularioRenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.formulariorentaSessionBean.setsFuncionBusquedaRapida(this.formulariorentaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoFormularioRenta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosFormularioRenta(esParaCancelar);				
				this.cancelarNuevoFormularioRenta(esParaCancelar);								
			}
			
			this.formulariorenta=new FormularioRenta();
			
			this.inicializarFormularioRenta();
			
			this.actualizarEstadoCeldasBotonesFormularioRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarFormularioRenta() throws Exception {
		try {
			FormularioRentaConstantesFunciones.inicializarFormularioRenta(this.formulariorenta);
			
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
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.formulariorentaLogic.getFormularioRentas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteFormularioRentas(String sAccionBusqueda,List<FormularioRenta> formulariorentasParaReportes) throws Exception {
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
					sPathReporteFinal="FormularioRenta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="FormularioRentaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("FormularioRentaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="FormularioRenta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Formulario Rentas");		
		parameters.put("busquedapor", FormularioRentaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceFormularioRenta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			FormularioRentaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			FormularioRentaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceFormularioRenta=new JRBeanArrayDataSource(FormularioRentaJInternalFrame.TraerFormularioRentaBeans(formulariorentasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceFormularioRenta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+FormularioRentaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+FormularioRentaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(FormularioRentaBean.TraerFormularioRentaBeans(formulariorentasParaReportes).toArray()));
							
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
				this.generarExcelReporteFormularioRentas(sAccionBusqueda,sTipoArchivoReporte,formulariorentasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalFormularioRentas(sAccionBusqueda,sTipoArchivoReporte,formulariorentasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoFormularioRentaActionPerformed(null);
					//this.generarExcelReporteFormularioRentas(sAccionBusqueda,sTipoArchivoReporte,formulariorentasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalFormularioRentas(sAccionBusqueda,sTipoArchivoReporte,formulariorentasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesFormularioRentas(sAccionBusqueda,sTipoArchivoReporte,formulariorentasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesFormularioRentas(sAccionBusqueda,sTipoArchivoReporte,formulariorentasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteFormularioRentas(String sAccionBusqueda,String sTipoArchivoReporte,List<FormularioRenta> formulariorentasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formulariorenta";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormularioRentas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFormularioRenta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(FormularioRenta formulariorenta : formulariorentasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			FormularioRentaConstantesFunciones.generarExcelReporteDataFormularioRenta("NORMAL",row,workbook,formulariorenta,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulariorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Renta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderFormularioRenta(String sTipo,Row row,Workbook workbook) {
		
		FormularioRentaConstantesFunciones.generarExcelReporteHeaderFormularioRenta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalFormularioRentas(String sAccionBusqueda,String sTipoArchivoReporte,List<FormularioRenta> formulariorentasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formulariorenta_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormularioRentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(FormularioRenta formulariorenta : formulariorentasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(FormularioRentaConstantesFunciones.getFormularioRentaDescripcion(formulariorenta));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioRentaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formulariorenta.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioRentaConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formulariorenta.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioRentaConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formulariorenta.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioRentaConstantesFunciones.LABEL_IDDATOFORMULARIORENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDDATOFORMULARIORENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formulariorenta.getdatoformulariorenta_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioRentaConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formulariorenta.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioRentaConstantesFunciones.LABEL_IDTIPORETENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDTIPORETENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formulariorenta.gettiporetencion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioRentaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formulariorenta.getparametroformularioiva_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioRentaConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formulariorenta.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioRentaConstantesFunciones.LABEL_VALORPAGADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_VALORPAGADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formulariorenta.getvalor_pagado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioRentaConstantesFunciones.LABEL_IMPUESTORETENIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IMPUESTORETENIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formulariorenta.getimpuesto_retenido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioRentaConstantesFunciones.LABEL_BASEIMPORNIBLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_BASEIMPORNIBLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formulariorenta.getbase_impornible());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulariorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Renta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesFormularioRentas(String sAccionBusqueda,String sTipoArchivoReporte,List<FormularioRenta> formulariorentasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<FormularioRenta> formulariorentasRespaldo=null;
		
		classes=FormularioRentaConstantesFunciones.getClassesRelationshipsOfFormularioRenta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.formulariorentaLogic.setDatosCliente(this.datosCliente);
		this.formulariorentaLogic.setDatosDeep(this.datosDeep);
		this.formulariorentaLogic.setIsConDeep(true);
		
		formulariorentasRespaldo=this.formulariorentaLogic.getFormularioRentas();
		
		this.formulariorentaLogic.setFormularioRentas(formulariorentasParaReportes);	
		this.formulariorentaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		formulariorentasParaReportes=this.formulariorentaLogic.getFormularioRentas();
		this.formulariorentaLogic.setFormularioRentas(formulariorentasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formulariorenta_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormularioRentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFormularioRenta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(FormularioRenta formulariorenta : formulariorentasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderFormularioRenta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			FormularioRentaConstantesFunciones.generarExcelReporteDataFormularioRenta("NORMAL",row,workbook,formulariorenta,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(FormularioRentaConstantesFunciones.getFormularioRentaDescripcion(formulariorenta));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulariorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Renta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoFormularioRenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormularioRenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoFormularioRenta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormularioRenta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessFormularioRenta() throws Exception {		
		this.startProcessFormularioRenta(true);
	}
	
	public void startProcessFormularioRenta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasFormularioRenta ,this.jPanelParametrosReportesFormularioRenta, this.jScrollPanelDatosFormularioRenta,this.jPanelPaginacionFormularioRenta, this.jScrollPanelDatosEdicionFormularioRenta, this.jPanelAccionesFormularioRenta,this.jPanelAccionesFormularioFormularioRenta,this.jmenuBarFormularioRenta,this.jmenuBarDetalleFormularioRenta,this.jTtoolBarFormularioRenta,this.jTtoolBarDetalleFormularioRenta);		
		
		final JTabbedPane jTabbedPaneBusquedasFormularioRenta=this.jTabbedPaneBusquedasFormularioRenta; 
		
		final JPanel jPanelParametrosReportesFormularioRenta=this.jPanelParametrosReportesFormularioRenta;
		//final JScrollPane jScrollPanelDatosFormularioRenta=this.jScrollPanelDatosFormularioRenta;
		final JTable jTableDatosFormularioRenta=this.jTableDatosFormularioRenta;		
		final JPanel jPanelPaginacionFormularioRenta=this.jPanelPaginacionFormularioRenta;
		//final JScrollPane jScrollPanelDatosEdicionFormularioRenta=this.jScrollPanelDatosEdicionFormularioRenta;
		final JPanel jPanelAccionesFormularioRenta=this.jPanelAccionesFormularioRenta;
		
		JPanel jPanelCamposAuxiliarFormularioRenta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarFormularioRenta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
			jPanelCamposAuxiliarFormularioRenta=this.jInternalFrameDetalleFormFormularioRenta.jPanelCamposFormularioRenta;
			jPanelAccionesFormularioAuxiliarFormularioRenta=this.jInternalFrameDetalleFormFormularioRenta.jPanelAccionesFormularioFormularioRenta;
		}
		
		final JPanel jPanelCamposFormularioRenta=jPanelCamposAuxiliarFormularioRenta;
		final JPanel jPanelAccionesFormularioFormularioRenta=jPanelAccionesFormularioAuxiliarFormularioRenta;
		
		
		final JMenuBar jmenuBarFormularioRenta=this.jmenuBarFormularioRenta;
		final JToolBar jTtoolBarFormularioRenta=this.jTtoolBarFormularioRenta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarFormularioRenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFormularioRenta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
			jmenuBarDetalleAuxiliarFormularioRenta=this.jInternalFrameDetalleFormFormularioRenta.jmenuBarDetalleFormularioRenta;
			jTtoolBarDetalleAuxiliarFormularioRenta=this.jInternalFrameDetalleFormFormularioRenta.jTtoolBarDetalleFormularioRenta;
		}
		
		final JMenuBar jmenuBarDetalleFormularioRenta=jmenuBarDetalleAuxiliarFormularioRenta;
		final JToolBar jTtoolBarDetalleFormularioRenta=jTtoolBarDetalleAuxiliarFormularioRenta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFormularioRenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFormularioRenta;
			processRunnable.jTableDatos=jTableDatosFormularioRenta;
			processRunnable.jPanelCampos=jPanelCamposFormularioRenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionFormularioRenta;
			processRunnable.jPanelAcciones=jPanelAccionesFormularioRenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFormularioRenta;
			
			
			processRunnable.jmenuBar=jmenuBarFormularioRenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFormularioRenta;
			processRunnable.jTtoolBar=jTtoolBarFormularioRenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFormularioRenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFormularioRenta ,jPanelParametrosReportesFormularioRenta,jTableDatosFormularioRenta, /*jScrollPanelDatosFormularioRenta,*/jPanelCamposFormularioRenta,jPanelPaginacionFormularioRenta, /*jScrollPanelDatosEdicionFormularioRenta,*/ jPanelAccionesFormularioRenta,jPanelAccionesFormularioFormularioRenta,jmenuBarFormularioRenta,jmenuBarDetalleFormularioRenta,jTtoolBarFormularioRenta,jTtoolBarDetalleFormularioRenta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFormularioRenta ,jPanelParametrosReportesFormularioRenta, jScrollPanelDatosFormularioRenta,jPanelPaginacionFormularioRenta, jScrollPanelDatosEdicionFormularioRenta, jPanelAccionesFormularioRenta,jPanelAccionesFormularioFormularioRenta,jmenuBarFormularioRenta,jmenuBarDetalleFormularioRenta,jTtoolBarFormularioRenta,jTtoolBarDetalleFormularioRenta);
						
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
	
	public void finishProcessFormularioRenta() {// throws Exception 
		this.finishProcessFormularioRenta(true);
	}
	
	public void finishProcessFormularioRenta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasFormularioRenta ,this.jPanelParametrosReportesFormularioRenta, this.jScrollPanelDatosFormularioRenta,this.jPanelPaginacionFormularioRenta, this.jScrollPanelDatosEdicionFormularioRenta, this.jPanelAccionesFormularioRenta,this.jPanelAccionesFormularioFormularioRenta,this.jmenuBarFormularioRenta,this.jmenuBarDetalleFormularioRenta,this.jTtoolBarFormularioRenta,this.jTtoolBarDetalleFormularioRenta);		
		
		final JTabbedPane jTabbedPaneBusquedasFormularioRenta=this.jTabbedPaneBusquedasFormularioRenta; 
		
		final JPanel jPanelParametrosReportesFormularioRenta=this.jPanelParametrosReportesFormularioRenta;
		//final JScrollPane jScrollPanelDatosFormularioRenta=this.jScrollPanelDatosFormularioRenta;
		final JTable jTableDatosFormularioRenta=this.jTableDatosFormularioRenta;		
		final JPanel jPanelPaginacionFormularioRenta=this.jPanelPaginacionFormularioRenta;
		//final JScrollPane jScrollPanelDatosEdicionFormularioRenta=this.jScrollPanelDatosEdicionFormularioRenta;
		final JPanel jPanelAccionesFormularioRenta=this.jPanelAccionesFormularioRenta;
		
		JPanel jPanelCamposAuxiliarFormularioRenta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarFormularioRenta=new JPanel();
		
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
			jPanelCamposAuxiliarFormularioRenta=this.jInternalFrameDetalleFormFormularioRenta.jPanelCamposFormularioRenta;
			jPanelAccionesFormularioAuxiliarFormularioRenta=this.jInternalFrameDetalleFormFormularioRenta.jPanelAccionesFormularioFormularioRenta;
		}
		
		final JPanel jPanelCamposFormularioRenta=jPanelCamposAuxiliarFormularioRenta;
		final JPanel jPanelAccionesFormularioFormularioRenta=jPanelAccionesFormularioAuxiliarFormularioRenta;
		
		
		final JMenuBar jmenuBarFormularioRenta=this.jmenuBarFormularioRenta;		
		final JToolBar jTtoolBarFormularioRenta=this.jTtoolBarFormularioRenta;
				
		JMenuBar jmenuBarDetalleAuxiliarFormularioRenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFormularioRenta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
			jmenuBarDetalleAuxiliarFormularioRenta=this.jInternalFrameDetalleFormFormularioRenta.jmenuBarDetalleFormularioRenta;
			jTtoolBarDetalleAuxiliarFormularioRenta=this.jInternalFrameDetalleFormFormularioRenta.jTtoolBarDetalleFormularioRenta;		
		}
		
		final JMenuBar jmenuBarDetalleFormularioRenta=jmenuBarDetalleAuxiliarFormularioRenta;
		final JToolBar jTtoolBarDetalleFormularioRenta=jTtoolBarDetalleAuxiliarFormularioRenta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFormularioRenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFormularioRenta;
			processRunnable.jTableDatos=jTableDatosFormularioRenta;
			processRunnable.jPanelCampos=jPanelCamposFormularioRenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionFormularioRenta;
			processRunnable.jPanelAcciones=jPanelAccionesFormularioRenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFormularioRenta;
			
			
			processRunnable.jmenuBar=jmenuBarFormularioRenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFormularioRenta;
			processRunnable.jTtoolBar=jTtoolBarFormularioRenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFormularioRenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasFormularioRenta ,jPanelParametrosReportesFormularioRenta, jTableDatosFormularioRenta,/*jScrollPanelDatosFormularioRenta,*/jPanelCamposFormularioRenta,jPanelPaginacionFormularioRenta, /*jScrollPanelDatosEdicionFormularioRenta,*/ jPanelAccionesFormularioRenta,jPanelAccionesFormularioFormularioRenta,jmenuBarFormularioRenta,jmenuBarDetalleFormularioRenta,jTtoolBarFormularioRenta,jTtoolBarDetalleFormularioRenta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesFormularioRenta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarFormularioRenta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuFormularioRenta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarFormularioRenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarFormularioRenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFormularioRenta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuFormularioRenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarFormularioRenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFormularioRenta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.formulariorentaConstantesFunciones.getsFinalQueryFormularioRenta();
		String  finalQueryPaginacionTodos=this.formulariorentaConstantesFunciones.getsFinalQueryFormularioRenta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=FormularioRentaConstantesFunciones.getArrayColumnasGlobalesNoFormularioRenta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=FormularioRentaConstantesFunciones.getArrayColumnasGlobalesFormularioRenta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,FormularioRentaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.formulariorentasEliminados= new ArrayList<FormularioRenta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessFormularioRenta();
		
				///*FormularioRentaSessionBean*/this.formulariorentaSessionBean=new FormularioRentaSessionBean();
			
			if(this.formulariorentaSessionBean==null) {
				this.formulariorentaSessionBean=new FormularioRentaSessionBean();
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
					this.iNumeroPaginacion=FormularioRentaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=FormularioRentaConstantesFunciones.getClassesForeignKeysOfFormularioRenta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/formulariorenta."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			formulariorentasAux= new ArrayList<FormularioRenta>();
			
				
			formulariorentaLogic.setDatosCliente(this.datosCliente);
			formulariorentaLogic.setDatosDeep(this.datosDeep);
			formulariorentaLogic.setIsConDeep(true);
			
			
			formulariorentaLogic.getFormularioRentaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					formulariorentaLogic.getTodosFormularioRentas(finalQueryGlobal,pagination);
					
					//formulariorentaLogic.getTodosFormularioRentasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(formulariorentaLogic.getFormularioRentas()==null|| formulariorentaLogic.getFormularioRentas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formulariorentasAux= new ArrayList<FormularioRenta>();
							formulariorentasAux.addAll(formulariorentaLogic.getFormularioRentas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorentasAux= new ArrayList<FormularioRenta>();
							formulariorentasAux.addAll(formulariorentas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formulariorentaLogic.getTodosFormularioRentas(finalQueryGlobal+"",this.pagination);												
							
							//formulariorentaLogic.getTodosFormularioRentasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteFormularioRentas("Todos",formulariorentaLogic.getFormularioRentas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formulariorentaLogic.setFormularioRentas(new ArrayList<FormularioRenta>());					
							formulariorentaLogic.getFormularioRentas().addAll(formulariorentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorentas=new ArrayList<FormularioRenta>();
							formulariorentas.addAll(formulariorentasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idFormularioRenta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idFormularioRenta=this.idActual;
				
				} else if(this.idFormularioRentaActual!=null && this.idFormularioRentaActual!=0L) {
					idFormularioRenta=idFormularioRentaActual;
				}
				
					
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndicePorId(idFormularioRenta);
				
				this.formulariorentas=new ArrayList<FormularioRenta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					formulariorentaLogic.getEntity(idFormularioRenta);
					
					//formulariorentaLogic.getEntityWithConnection(idFormularioRenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formulariorentaLogic.setFormularioRentas(new ArrayList<FormularioRenta>());
					formulariorentaLogic.getFormularioRentas().add(formulariorentaLogic.getFormularioRenta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formulariorentas=new ArrayList<FormularioRenta>();
					this.formulariorentas.add(formulariorenta);
				}
				
				if(formulariorentaLogic.getFormularioRenta()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formulariorentaLogic.getFormularioRentasFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formulariorentaLogic.getFormularioRentas()==null||formulariorentaLogic.getFormularioRentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formulariorentas==null|| formulariorentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorentasAux=new ArrayList<FormularioRenta>();
						formulariorentasAux.addAll(formulariorentaLogic.getFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorentasAux=new ArrayList<FormularioRenta>();
							formulariorentasAux.addAll(formulariorentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formulariorentaLogic.getFormularioRentasFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormularioRentas("FK_IdCuentaContable",formulariorentaLogic.getFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormularioRentas("FK_IdCuentaContable",formulariorentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorentaLogic.setFormularioRentas(new ArrayList<FormularioRenta>());
						formulariorentaLogic.getFormularioRentas().addAll(formulariorentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorentas=new ArrayList<FormularioRenta>();
							formulariorentas.addAll(formulariorentasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdDatoFormularioRenta")) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdDatoFormularioRenta(id_dato_formulario_rentaFK_IdDatoFormularioRenta);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formulariorentaLogic.getFormularioRentasFK_IdDatoFormularioRenta(finalQueryGlobal,pagination,id_dato_formulario_rentaFK_IdDatoFormularioRenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdDatoFormularioRenta(id_dato_formulario_rentaFK_IdDatoFormularioRenta);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdDatoFormularioRenta(id_dato_formulario_rentaFK_IdDatoFormularioRenta);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formulariorentaLogic.getFormularioRentas()==null||formulariorentaLogic.getFormularioRentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formulariorentas==null|| formulariorentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorentasAux=new ArrayList<FormularioRenta>();
						formulariorentasAux.addAll(formulariorentaLogic.getFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorentasAux=new ArrayList<FormularioRenta>();
							formulariorentasAux.addAll(formulariorentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formulariorentaLogic.getFormularioRentasFK_IdDatoFormularioRenta(finalQueryGlobal,pagination,id_dato_formulario_rentaFK_IdDatoFormularioRenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdDatoFormularioRenta(id_dato_formulario_rentaFK_IdDatoFormularioRenta);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdDatoFormularioRenta(id_dato_formulario_rentaFK_IdDatoFormularioRenta);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormularioRentas("FK_IdDatoFormularioRenta",formulariorentaLogic.getFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormularioRentas("FK_IdDatoFormularioRenta",formulariorentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorentaLogic.setFormularioRentas(new ArrayList<FormularioRenta>());
						formulariorentaLogic.getFormularioRentas().addAll(formulariorentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorentas=new ArrayList<FormularioRenta>();
							formulariorentas.addAll(formulariorentasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formulariorentaLogic.getFormularioRentasFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formulariorentaLogic.getFormularioRentas()==null||formulariorentaLogic.getFormularioRentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formulariorentas==null|| formulariorentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorentasAux=new ArrayList<FormularioRenta>();
						formulariorentasAux.addAll(formulariorentaLogic.getFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorentasAux=new ArrayList<FormularioRenta>();
							formulariorentasAux.addAll(formulariorentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formulariorentaLogic.getFormularioRentasFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormularioRentas("FK_IdEjercicio",formulariorentaLogic.getFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormularioRentas("FK_IdEjercicio",formulariorentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorentaLogic.setFormularioRentas(new ArrayList<FormularioRenta>());
						formulariorentaLogic.getFormularioRentas().addAll(formulariorentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorentas=new ArrayList<FormularioRenta>();
							formulariorentas.addAll(formulariorentasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formulariorentaLogic.getFormularioRentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formulariorentaLogic.getFormularioRentas()==null||formulariorentaLogic.getFormularioRentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formulariorentas==null|| formulariorentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorentasAux=new ArrayList<FormularioRenta>();
						formulariorentasAux.addAll(formulariorentaLogic.getFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorentasAux=new ArrayList<FormularioRenta>();
							formulariorentasAux.addAll(formulariorentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formulariorentaLogic.getFormularioRentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormularioRentas("FK_IdEmpresa",formulariorentaLogic.getFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormularioRentas("FK_IdEmpresa",formulariorentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorentaLogic.setFormularioRentas(new ArrayList<FormularioRenta>());
						formulariorentaLogic.getFormularioRentas().addAll(formulariorentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorentas=new ArrayList<FormularioRenta>();
							formulariorentas.addAll(formulariorentasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formulariorentaLogic.getFormularioRentasFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formulariorentaLogic.getFormularioRentas()==null||formulariorentaLogic.getFormularioRentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formulariorentas==null|| formulariorentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorentasAux=new ArrayList<FormularioRenta>();
						formulariorentasAux.addAll(formulariorentaLogic.getFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorentasAux=new ArrayList<FormularioRenta>();
							formulariorentasAux.addAll(formulariorentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formulariorentaLogic.getFormularioRentasFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormularioRentas("FK_IdPais",formulariorentaLogic.getFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormularioRentas("FK_IdPais",formulariorentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorentaLogic.setFormularioRentas(new ArrayList<FormularioRenta>());
						formulariorentaLogic.getFormularioRentas().addAll(formulariorentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorentas=new ArrayList<FormularioRenta>();
							formulariorentas.addAll(formulariorentasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdParametroFormularioIva")) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdParametroFormularioIva(id_parametro_formulario_ivaFK_IdParametroFormularioIva);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formulariorentaLogic.getFormularioRentasFK_IdParametroFormularioIva(finalQueryGlobal,pagination,id_parametro_formulario_ivaFK_IdParametroFormularioIva);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdParametroFormularioIva(id_parametro_formulario_ivaFK_IdParametroFormularioIva);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdParametroFormularioIva(id_parametro_formulario_ivaFK_IdParametroFormularioIva);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formulariorentaLogic.getFormularioRentas()==null||formulariorentaLogic.getFormularioRentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formulariorentas==null|| formulariorentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorentasAux=new ArrayList<FormularioRenta>();
						formulariorentasAux.addAll(formulariorentaLogic.getFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorentasAux=new ArrayList<FormularioRenta>();
							formulariorentasAux.addAll(formulariorentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formulariorentaLogic.getFormularioRentasFK_IdParametroFormularioIva(finalQueryGlobal,pagination,id_parametro_formulario_ivaFK_IdParametroFormularioIva);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdParametroFormularioIva(id_parametro_formulario_ivaFK_IdParametroFormularioIva);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdParametroFormularioIva(id_parametro_formulario_ivaFK_IdParametroFormularioIva);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormularioRentas("FK_IdParametroFormularioIva",formulariorentaLogic.getFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormularioRentas("FK_IdParametroFormularioIva",formulariorentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorentaLogic.setFormularioRentas(new ArrayList<FormularioRenta>());
						formulariorentaLogic.getFormularioRentas().addAll(formulariorentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorentas=new ArrayList<FormularioRenta>();
							formulariorentas.addAll(formulariorentasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formulariorentaLogic.getFormularioRentasFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formulariorentaLogic.getFormularioRentas()==null||formulariorentaLogic.getFormularioRentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formulariorentas==null|| formulariorentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorentasAux=new ArrayList<FormularioRenta>();
						formulariorentasAux.addAll(formulariorentaLogic.getFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorentasAux=new ArrayList<FormularioRenta>();
							formulariorentasAux.addAll(formulariorentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formulariorentaLogic.getFormularioRentasFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormularioRentas("FK_IdPeriodo",formulariorentaLogic.getFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormularioRentas("FK_IdPeriodo",formulariorentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorentaLogic.setFormularioRentas(new ArrayList<FormularioRenta>());
						formulariorentaLogic.getFormularioRentas().addAll(formulariorentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorentas=new ArrayList<FormularioRenta>();
							formulariorentas.addAll(formulariorentasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoRetencion")) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formulariorentaLogic.getFormularioRentasFK_IdTipoRetencion(finalQueryGlobal,pagination,id_tipo_retencionFK_IdTipoRetencion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formulariorentaLogic.getFormularioRentas()==null||formulariorentaLogic.getFormularioRentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formulariorentas==null|| formulariorentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorentasAux=new ArrayList<FormularioRenta>();
						formulariorentasAux.addAll(formulariorentaLogic.getFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorentasAux=new ArrayList<FormularioRenta>();
							formulariorentasAux.addAll(formulariorentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formulariorentaLogic.getFormularioRentasFK_IdTipoRetencion(finalQueryGlobal,pagination,id_tipo_retencionFK_IdTipoRetencion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioRentaConstantesFunciones.getDetalleIndiceFK_IdTipoRetencion(id_tipo_retencionFK_IdTipoRetencion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormularioRentas("FK_IdTipoRetencion",formulariorentaLogic.getFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormularioRentas("FK_IdTipoRetencion",formulariorentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorentaLogic.setFormularioRentas(new ArrayList<FormularioRenta>());
						formulariorentaLogic.getFormularioRentas().addAll(formulariorentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorentas=new ArrayList<FormularioRenta>();
							formulariorentas.addAll(formulariorentasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesFormularioRenta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessFormularioRenta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=formulariorentaLogic.getFormularioRentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formulariorentas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=formulariorentaLogic.getFormularioRentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formulariorentas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(FormularioRenta formulariorenta) {
		Boolean permite=true;
		
		if(this.formulariorenta.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=FormularioRentaConstantesFunciones.getOrderByListaFormularioRenta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=FormularioRentaConstantesFunciones.getOrderByListaFormularioRenta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormularioRenta formulariorenta:formulariorentaLogic.getFormularioRentas()) {
				if(formulariorenta.getsType().equals(Constantes2.S_TOTALES)) {
					formulariorentaTotales=formulariorenta;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormularioRenta formulariorenta:this.formulariorentas) {
				if(formulariorenta.getsType().equals(Constantes2.S_TOTALES)) {
					formulariorentaTotales=formulariorenta;
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
			this.formulariorentaAux=new FormularioRenta();
			this.formulariorentaAux.setsType(Constantes2.S_TOTALES);
			this.formulariorentaAux.setIsNew(false);
			this.formulariorentaAux.setIsChanged(false);
			this.formulariorentaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				FormularioRentaConstantesFunciones.TotalizarValoresFilaFormularioRenta(this.formulariorentaLogic.getFormularioRentas(),this.formulariorentaAux);
				
				this.formulariorentaLogic.getFormularioRentas().add(this.formulariorentaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				FormularioRentaConstantesFunciones.TotalizarValoresFilaFormularioRenta(this.formulariorentas,this.formulariorentaAux);
				
				this.formulariorentas.add(this.formulariorentaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		formulariorentaTotales=new FormularioRenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.formulariorentaLogic.getFormularioRentas().remove(formulariorentaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.formulariorentas.remove(formulariorentaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		formulariorentaTotales=new FormularioRenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormularioRenta formulariorenta:formulariorentaLogic.getFormularioRentas()) {
				if(formulariorenta.getsType().equals(Constantes2.S_TOTALES)) {
					formulariorentaTotales=formulariorenta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FormularioRentaConstantesFunciones.TotalizarValoresFilaFormularioRenta(this.formulariorentaLogic.getFormularioRentas(),formulariorentaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormularioRenta formulariorenta:this.formulariorentas) {
				if(formulariorenta.getsType().equals(Constantes2.S_TOTALES)) {
					formulariorentaTotales=formulariorenta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FormularioRentaConstantesFunciones.TotalizarValoresFilaFormularioRenta(this.formulariorentas,formulariorentaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getFormularioRentasFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormularioRentasFK_IdDatoFormularioRenta()throws Exception {
		try {
			sAccionBusqueda="FK_IdDatoFormularioRenta";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormularioRentasFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormularioRentasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormularioRentasFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormularioRentasFK_IdParametroFormularioIva()throws Exception {
		try {
			sAccionBusqueda="FK_IdParametroFormularioIva";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormularioRentasFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormularioRentasFK_IdTipoRetencion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoRetencion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getFormularioRentasFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formulariorentaLogic.getFormularioRentasFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormularioRentasFK_IdDatoFormularioRenta(String sFinalQuery,Long id_dato_formulario_renta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formulariorentaLogic.getFormularioRentasFK_IdDatoFormularioRenta(sFinalQuery,this.pagination,id_dato_formulario_renta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormularioRentasFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formulariorentaLogic.getFormularioRentasFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormularioRentasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formulariorentaLogic.getFormularioRentasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormularioRentasFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formulariorentaLogic.getFormularioRentasFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormularioRentasFK_IdParametroFormularioIva(String sFinalQuery,Long id_parametro_formulario_iva)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formulariorentaLogic.getFormularioRentasFK_IdParametroFormularioIva(sFinalQuery,this.pagination,id_parametro_formulario_iva);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormularioRentasFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formulariorentaLogic.getFormularioRentasFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormularioRentasFK_IdTipoRetencion(String sFinalQuery,Long id_tipo_retencion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formulariorentaLogic.getFormularioRentasFK_IdTipoRetencion(sFinalQuery,this.pagination,id_tipo_retencion);
				
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
	
	public void inicializarPermisosFormularioRenta() {
		this.isPermisoTodoFormularioRenta=false;
		this.isPermisoNuevoFormularioRenta=false;
		this.isPermisoActualizarFormularioRenta=false;
		this.isPermisoActualizarOriginalFormularioRenta=false;
		this.isPermisoEliminarFormularioRenta=false;
		this.isPermisoGuardarCambiosFormularioRenta=false;
		this.isPermisoConsultaFormularioRenta=false;
		this.isPermisoBusquedaFormularioRenta=false;
		this.isPermisoReporteFormularioRenta=false;		
		this.isPermisoOrdenFormularioRenta=false;		
		this.isPermisoPaginacionMedioFormularioRenta=false;		
		this.isPermisoPaginacionAltoFormularioRenta=false;
		this.isPermisoPaginacionTodoFormularioRenta=false;
		this.isPermisoCopiarFormularioRenta=false;		
		this.isPermisoVerFormFormularioRenta=false;		
		this.isPermisoDuplicarFormularioRenta=false;		
		this.isPermisoOrdenFormularioRenta=false;		
	}
	
	public void setPermisosUsuarioFormularioRenta(Boolean isPermiso) {
		this.isPermisoTodoFormularioRenta=isPermiso;
		this.isPermisoNuevoFormularioRenta=isPermiso;
		this.isPermisoActualizarFormularioRenta=isPermiso;
		this.isPermisoActualizarOriginalFormularioRenta=isPermiso;
		this.isPermisoEliminarFormularioRenta=isPermiso;
		this.isPermisoGuardarCambiosFormularioRenta=isPermiso;
		this.isPermisoConsultaFormularioRenta=isPermiso;
		this.isPermisoBusquedaFormularioRenta=isPermiso;
		this.isPermisoReporteFormularioRenta=isPermiso;
		this.isPermisoOrdenFormularioRenta=isPermiso;		
		this.isPermisoPaginacionMedioFormularioRenta=isPermiso;		
		this.isPermisoPaginacionAltoFormularioRenta=isPermiso;		
		this.isPermisoPaginacionTodoFormularioRenta=isPermiso;		
		this.isPermisoCopiarFormularioRenta=isPermiso;		
		this.isPermisoVerFormFormularioRenta=isPermiso;		
		this.isPermisoDuplicarFormularioRenta=isPermiso;
		this.isPermisoOrdenFormularioRenta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioFormularioRenta(Boolean isPermiso) {
		//this.isPermisoTodoFormularioRenta=isPermiso;
		this.isPermisoNuevoFormularioRenta=isPermiso;
		this.isPermisoActualizarFormularioRenta=isPermiso;
		this.isPermisoActualizarOriginalFormularioRenta=isPermiso;
		this.isPermisoEliminarFormularioRenta=isPermiso;
		this.isPermisoGuardarCambiosFormularioRenta=isPermiso;
		//this.isPermisoConsultaFormularioRenta=isPermiso;
		//this.isPermisoBusquedaFormularioRenta=isPermiso;
		//this.isPermisoReporteFormularioRenta=isPermiso;
		//this.isPermisoOrdenFormularioRenta=isPermiso;		
		//this.isPermisoPaginacionMedioFormularioRenta=isPermiso;		
		//this.isPermisoPaginacionAltoFormularioRenta=isPermiso;		
		//this.isPermisoPaginacionTodoFormularioRenta=isPermiso;		
		//this.isPermisoCopiarFormularioRenta=isPermiso;		
		//this.isPermisoDuplicarFormularioRenta=isPermiso;
		//this.isPermisoOrdenFormularioRenta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioFormularioRentaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(FormularioRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebFormularioRenta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioFormularioRentaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioFormularioRentaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionFormularioRentaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioFormularioRentaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioFormularioRenta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(FormularioRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, FormularioRentaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoFormularioRenta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarFormularioRenta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalFormularioRenta=this.isPermisoActualizarFormularioRenta;
			this.isPermisoEliminarFormularioRenta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosFormularioRenta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaFormularioRenta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaFormularioRenta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoFormularioRenta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteFormularioRenta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFormularioRenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioFormularioRenta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoFormularioRenta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoFormularioRenta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarFormularioRenta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormFormularioRenta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarFormularioRenta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFormularioRenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosFormularioRenta.setToolTipText(this.jTableDatosFormularioRenta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioFormularioRenta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioFormularioRenta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(FormularioRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(FormularioRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioFormularioRenta() throws Exception {
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
	public void inicializarCombosForeignKeyFormularioRentaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.datoformulariorentasForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
				this.tiporetencionsForeignKey=new ArrayList();
				this.parametroformularioivasForeignKey=new ArrayList();
				this.paissForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyFormularioRentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(FormularioRentaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyFormularioRentaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyDatoFormularioRentaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoRetencionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyParametroFormularioIvaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyDatoFormularioRentaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.datoformulariorentasForeignKey==null||this.datoformulariorentasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=DatoFormularioRentaConstantesFunciones.getArrayColumnasGlobalesDatoFormularioRenta(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DatoFormularioRentaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=DatoFormularioRentaConstantesFunciones.SFINALQUERY;

				this.cargarCombosDatoFormularioRentasForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissForeignKey==null||this.paissForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaisConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyFormularioRentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			FormularioRentaParameterReturnGeneral formulariorentaReturnGeneral=new FormularioRentaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.formulariorentaConstantesFunciones.cargarid_empresaFormularioRenta)
					 || (this.esRecargarFks && this.formulariorentaConstantesFunciones.cargarid_empresaFormularioRenta)) {

					if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+formulariorentaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.formulariorentaConstantesFunciones.cargarid_ejercicioFormularioRenta)
					 || (this.esRecargarFks && this.formulariorentaConstantesFunciones.cargarid_ejercicioFormularioRenta)) {

					if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+formulariorentaSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.formulariorentaConstantesFunciones.cargarid_periodoFormularioRenta)
					 || (this.esRecargarFks && this.formulariorentaConstantesFunciones.cargarid_periodoFormularioRenta)) {

					if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+formulariorentaSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalDatoFormularioRenta="";

				if(((this.datoformulariorentasForeignKey==null||this.datoformulariorentasForeignKey.size()<=0) && this.formulariorentaConstantesFunciones.cargarid_dato_formulario_rentaFormularioRenta)
					 || (this.esRecargarFks && this.formulariorentaConstantesFunciones.cargarid_dato_formulario_rentaFormularioRenta)) {

					if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionDatoFormularioRenta()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=DatoFormularioRentaConstantesFunciones.getArrayColumnasGlobalesDatoFormularioRenta(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalDatoFormularioRenta=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DatoFormularioRentaConstantesFunciones.TABLENAME);

						finalQueryGlobalDatoFormularioRenta=Funciones.GetFinalQueryAppend(finalQueryGlobalDatoFormularioRenta, "");
						finalQueryGlobalDatoFormularioRenta+=DatoFormularioRentaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosDatoFormularioRentasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalDatoFormularioRenta=" WHERE " + ConstantesSql.ID + "="+formulariorentaSessionBean.getlidDatoFormularioRentaActual();
					}
				} else {
					finalQueryGlobalDatoFormularioRenta="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.formulariorentaConstantesFunciones.cargarid_cuenta_contableFormularioRenta)
					 || (this.esRecargarFks && this.formulariorentaConstantesFunciones.cargarid_cuenta_contableFormularioRenta)) {

					if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+formulariorentaSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}


				String finalQueryGlobalTipoRetencion="";

				if(((this.tiporetencionsForeignKey==null||this.tiporetencionsForeignKey.size()<=0) && this.formulariorentaConstantesFunciones.cargarid_tipo_retencionFormularioRenta)
					 || (this.esRecargarFks && this.formulariorentaConstantesFunciones.cargarid_tipo_retencionFormularioRenta)) {

					if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoRetencionConstantesFunciones.getArrayColumnasGlobalesTipoRetencion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoRetencion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRetencionConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoRetencion=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoRetencion, "");
						finalQueryGlobalTipoRetencion+=TipoRetencionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoRetencionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoRetencion=" WHERE " + ConstantesSql.ID + "="+formulariorentaSessionBean.getlidTipoRetencionActual();
					}
				} else {
					finalQueryGlobalTipoRetencion="NONE";
				}


				String finalQueryGlobalParametroFormularioIva="";

				if(((this.parametroformularioivasForeignKey==null||this.parametroformularioivasForeignKey.size()<=0) && this.formulariorentaConstantesFunciones.cargarid_parametro_formulario_ivaFormularioRenta)
					 || (this.esRecargarFks && this.formulariorentaConstantesFunciones.cargarid_parametro_formulario_ivaFormularioRenta)) {

					if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionParametroFormularioIva()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ParametroFormularioIvaConstantesFunciones.getArrayColumnasGlobalesParametroFormularioIva(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalParametroFormularioIva=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ParametroFormularioIvaConstantesFunciones.TABLENAME);

						finalQueryGlobalParametroFormularioIva=Funciones.GetFinalQueryAppend(finalQueryGlobalParametroFormularioIva, "");
						finalQueryGlobalParametroFormularioIva+=ParametroFormularioIvaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosParametroFormularioIvasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalParametroFormularioIva=" WHERE " + ConstantesSql.ID + "="+formulariorentaSessionBean.getlidParametroFormularioIvaActual();
					}
				} else {
					finalQueryGlobalParametroFormularioIva="NONE";
				}


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.formulariorentaConstantesFunciones.cargarid_paisFormularioRenta)
					 || (this.esRecargarFks && this.formulariorentaConstantesFunciones.cargarid_paisFormularioRenta)) {

					if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+formulariorentaSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				formulariorentaReturnGeneral=formulariorentaLogic.cargarCombosLoteForeignKeyFormularioRenta(finalQueryGlobalEmpresa,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalDatoFormularioRenta,finalQueryGlobalCuentaContable,finalQueryGlobalTipoRetencion,finalQueryGlobalParametroFormularioIva,finalQueryGlobalPais);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=formulariorentaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=formulariorentaReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=formulariorentaReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalDatoFormularioRenta.equals("NONE")) {
				this.datoformulariorentasForeignKey=formulariorentaReturnGeneral.getdatoformulariorentasForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=formulariorentaReturnGeneral.getcuentacontablesForeignKey();
			}

			if(!finalQueryGlobalTipoRetencion.equals("NONE")) {
				this.tiporetencionsForeignKey=formulariorentaReturnGeneral.gettiporetencionsForeignKey();
			}

			if(!finalQueryGlobalParametroFormularioIva.equals("NONE")) {
				this.parametroformularioivasForeignKey=formulariorentaReturnGeneral.getparametroformularioivasForeignKey();
			}

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=formulariorentaReturnGeneral.getpaissForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyFormularioRenta()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyDatoFormularioRenta();
			this.addItemDefectoCombosForeignKeyCuentaContable();
			this.addItemDefectoCombosForeignKeyTipoRetencion();
			this.addItemDefectoCombosForeignKeyParametroFormularioIva();
			this.addItemDefectoCombosForeignKeyPais();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.formulariorentaSessionBean==null) {
				this.formulariorentaSessionBean=new FormularioRentaSessionBean();
			}

			if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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

	public void addItemDefectoCombosForeignKeyDatoFormularioRenta()throws Exception {
		try {

			if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionDatoFormularioRenta()) {
				DatoFormularioRenta datoformulariorenta=new DatoFormularioRenta();
				DatoFormularioRentaConstantesFunciones.setDatoFormularioRentaDescripcion(datoformulariorenta,Constantes.SMENSAJE_ESCOJA_OPCION);
				datoformulariorenta.setId(null);

				if(!DatoFormularioRentaConstantesFunciones.ExisteEnLista(this.datoformulariorentasForeignKey,datoformulariorenta,true)) {

					this.datoformulariorentasForeignKey.add(0,datoformulariorenta);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
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

	public void addItemDefectoCombosForeignKeyTipoRetencion()throws Exception {
		try {

			if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionTipoRetencion()) {
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

	public void addItemDefectoCombosForeignKeyParametroFormularioIva()throws Exception {
		try {

			if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionParametroFormularioIva()) {
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

	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {

			if(!this.formulariorentaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				Pais pais=new Pais();
				PaisConstantesFunciones.setPaisDescripcion(pais,Constantes.SMENSAJE_ESCOJA_OPCION);
				pais.setId(null);

				if(!PaisConstantesFunciones.ExisteEnLista(this.paissForeignKey,pais,true)) {

					this.paissForeignKey.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyFormularioRenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyFormularioRenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyFormularioRenta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyFormularioRenta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyFormularioRenta(FormularioRenta formulariorenta)throws Exception {	
		try {
			
			this.setActualDatoFormularioRentaForeignKey(formulariorenta.getid_dato_formulario_renta(),false,"Formulario");
			this.setActualCuentaContableForeignKey(formulariorenta.getid_cuenta_contable(),false,"Formulario");
			this.setActualTipoRetencionForeignKey(formulariorenta.getid_tipo_retencion(),false,"Formulario");
			this.setActualParametroFormularioIvaForeignKey(formulariorenta.getid_parametro_formulario_iva(),false,"Formulario");
			this.setActualPaisForeignKey(formulariorenta.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyFormularioRenta(FormularioRenta formulariorenta,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyFormularioRenta()throws Exception {	
		try {
			
			this.setActualDatoFormularioRentaForeignKey(this.formulariorentaConstantesFunciones.getid_dato_formulario_renta(),false,"Formulario");
			this.setActualCuentaContableForeignKey(this.formulariorentaConstantesFunciones.getid_cuenta_contable(),false,"Formulario");
			this.setActualTipoRetencionForeignKey(this.formulariorentaConstantesFunciones.getid_tipo_retencion(),false,"Formulario");
			this.setActualParametroFormularioIvaForeignKey(this.formulariorentaConstantesFunciones.getid_parametro_formulario_iva(),false,"Formulario");
			this.setActualPaisForeignKey(this.formulariorentaConstantesFunciones.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyFormularioRenta()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_ejercicioFormularioRenta.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_periodoFormularioRenta.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyFormularioRenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyFormularioRenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroFormularioRenta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyFormularioRenta()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameDatoFormularioRentasForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");
			this.cargarCombosFrameTipoRetencionsForeignKey("Todos");
			this.cargarCombosFrameParametroFormularioIvasForeignKey("Todos");
			this.cargarCombosFramePaissForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyFormularioRenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameDatoFormularioRentasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoRetencionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameParametroFormularioIvasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyFormularioRenta()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_empresaFormularioRenta!=null && this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_empresaFormularioRenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_empresaFormularioRenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_ejercicioFormularioRenta!=null && this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_ejercicioFormularioRenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_ejercicioFormularioRenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_periodoFormularioRenta!=null && this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_periodoFormularioRenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_periodoFormularioRenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_dato_formulario_rentaFormularioRenta!=null && this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_dato_formulario_rentaFormularioRenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_dato_formulario_rentaFormularioRenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_cuenta_contableFormularioRenta!=null && this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_cuenta_contableFormularioRenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_cuenta_contableFormularioRenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_tipo_retencionFormularioRenta!=null && this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_tipo_retencionFormularioRenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_tipo_retencionFormularioRenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_parametro_formulario_ivaFormularioRenta!=null && this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_parametro_formulario_ivaFormularioRenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_parametro_formulario_ivaFormularioRenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_paisFormularioRenta!=null && this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_paisFormularioRenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_paisFormularioRenta.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
















	
	

	public FormularioRentaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public FormularioRentaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public FormularioRentaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.formulariorentaSessionBean=new FormularioRentaSessionBean(); 
		this.formulariorentaConstantesFunciones=new FormularioRentaConstantesFunciones(); 
		this.formulariorentaBean=new FormularioRenta();//(this.formulariorentaConstantesFunciones); 		
		this.formulariorentaReturnGeneral=new FormularioRentaParameterReturnGeneral(); 
		
		this.formulariorentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formulariorentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public FormularioRentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public FormularioRentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public FormularioRentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessFormularioRenta(true);
			
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
			
			this.formulariorentaConstantesFunciones=new FormularioRentaConstantesFunciones(); 
			this.formulariorentaBean=new FormularioRenta();//this.formulariorentaConstantesFunciones); 			
			this.formulariorentaReturnGeneral=new FormularioRentaParameterReturnGeneral(); 
		
			FormularioRentaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Formulario Renta Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.formulariorenta=new FormularioRenta();
			this.formulariorentas = new ArrayList<FormularioRenta>();
			this.formulariorentasAux = new ArrayList<FormularioRenta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic=new FormularioRentaLogic();
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}
			
			//this.formulariorentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.formulariorentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormFormularioRenta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoFormularioRenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFormularioRenta);	
					}
					
					if(this.jInternalFrameImportacionFormularioRenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFormularioRenta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByFormularioRenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByFormularioRenta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormFormularioRenta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormFormularioRenta);
				this.jInternalFrameDetalleFormFormularioRenta.setVisible(false);
				this.jInternalFrameDetalleFormFormularioRenta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoFormularioRenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFormularioRenta);
					this.jInternalFrameReporteDinamicoFormularioRenta.setVisible(false);
					this.jInternalFrameReporteDinamicoFormularioRenta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionFormularioRenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionFormularioRenta);
					this.jInternalFrameImportacionFormularioRenta.setVisible(false);
					this.jInternalFrameImportacionFormularioRenta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByFormularioRenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByFormularioRenta);
					this.jInternalFrameOrderByFormularioRenta.setVisible(false);
					this.jInternalFrameOrderByFormularioRenta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idFormularioRentaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=FormularioRentaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.formulariorentaReturnGeneral=new FormularioRentaParameterReturnGeneral();
			
			this.formulariorentaParameterGeneral=new FormularioRentaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.formulariorentaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(FormularioRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FormularioRentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.formulariorentaSessionBean.getEsGuardarRelacionado(),this.formulariorentaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FormularioRentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.formulariorentaSessionBean.getEsGuardarRelacionado(),this.formulariorentaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoFormularioRenta=false;
			this.isVisibilidadCeldaDuplicarFormularioRenta=true;
			this.isVisibilidadCeldaCopiarFormularioRenta=true;
			this.isVisibilidadCeldaVerFormFormularioRenta=true;
			this.isVisibilidadCeldaOrdenFormularioRenta=true;
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta=false;
			this.isVisibilidadCeldaModificarFormularioRenta=false;
			this.isVisibilidadCeldaActualizarFormularioRenta=false;
			this.isVisibilidadCeldaEliminarFormularioRenta=false;
			this.isVisibilidadCeldaCancelarFormularioRenta=false;
			this.isVisibilidadCeldaGuardarFormularioRenta=false;
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta=false;
			
			
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdDatoFormularioRenta=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPais=true;
			this.isVisibilidadFK_IdParametroFormularioIva=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdTipoRetencion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesFormularioRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosFormularioRenta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioFormularioRenta(false);
			
			this.setPermisosUsuarioFormularioRenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formulariorentaSessionBean.getEsGuardarRelacionado() 
				|| (this.formulariorentaSessionBean.getEsGuardarRelacionado() && this.formulariorentaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioFormularioRentaClasesRelacionadas();
			}
			
			if(this.formulariorentaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioFormularioRentaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosFormularioRenta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualFormularioRenta();
			}
			
			if(!this.isPermisoBusquedaFormularioRenta) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasFormularioRenta.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formulariorentaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioFormularioRenta,this.isPermisoPaginacionMedioFormularioRenta,this.isPermisoPaginacionTodoFormularioRenta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(FormularioRentaConstantesFunciones.getTiposSeleccionarFormularioRenta());
				
				this.tiposColumnasSelect=FormularioRentaConstantesFunciones.getTiposSeleccionarFormularioRenta(true);
				
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
			//if(!this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioFormularioRenta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioFormularioRenta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioFormularioRenta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesFormularioRenta() ;
			
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
			this.datoformulariorentaLogic=new DatoFormularioRentaLogic();
			this.cuentacontableLogic=new CuentaContableLogic();
			this.tiporetencionLogic=new TipoRetencionLogic();
			this.parametroformularioivaLogic=new ParametroFormularioIvaLogic();
			this.paisLogic=new PaisLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				formulariorentaImplementable= (FormularioRentaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FormularioRentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				formulariorentaImplementableHome= (FormularioRentaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FormularioRentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.formulariorentas= new ArrayList<FormularioRenta>();
			this.formulariorentasEliminados= new ArrayList<FormularioRenta>();
						
			this.isEsNuevoFormularioRenta=false;
			this.esParaAccionDesdeFormularioFormularioRenta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.datoformulariorentasForeignKey=new ArrayList<DatoFormularioRenta>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			this.tiporetencionsForeignKey=new ArrayList<TipoRetencion>() ;
			this.parametroformularioivasForeignKey=new ArrayList<ParametroFormularioIva>() ;
			this.paissForeignKey=new ArrayList<Pais>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyFormularioRenta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroFormularioRenta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			FormularioRentaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=FormularioRentaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesFormularioRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingFormularioRenta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormFormularioRenta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioFormularioRenta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioFormularioRenta();
			}
			
			FormularioRentaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasFormularioRenta.getTabCount(); i++) {
					this.jTabbedPaneBusquedasFormularioRenta.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasFormularioRenta.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessFormularioRenta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga FormularioRenta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectFormularioRenta() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesFormularioRenta")) {
				iIndex=this.jInternalFrameDetalleFormFormularioRenta.jTabbedPaneRelacionesFormularioRenta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormFormularioRenta.jTabbedPaneRelacionesFormularioRenta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessFormularioRenta();	
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
	
	public void cargarCombosForeignKeyFormularioRenta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyFormularioRenta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyFormularioRenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyFormularioRentaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyFormularioRenta();
		
		this.cargarCombosFrameForeignKeyFormularioRenta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyFormularioRenta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyFormularioRenta();
		}
	}
	
	

	public void cargarCombosForeignKeyDatoFormularioRenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyDatoFormularioRentaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyDatoFormularioRenta();
				this.cargarCombosFrameDatoFormularioRentasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaDatoFormularioRenta(this.datoformulariorentasForeignKey);

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

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPais(this.paissForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoFormularioRentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.formulariorentaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormFormularioRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
			
			
			if(jTableDatosFormularioRenta.getRowCount()>=1) {
				jTableDatosFormularioRenta.removeRowSelectionInterval(0, jTableDatosFormularioRenta.getRowCount()-1);						
			}
			
			this.isEsNuevoFormularioRenta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoFormularioRenta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesFormularioRenta(true);			
			//this.formulariorenta=new FormularioRenta();
			//this.formulariorenta.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormularioRenta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormularioRenta() ;
			
			if(FormularioRentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormularioRenta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.formulariorenta);	
			this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta);				
			
			FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
			
			if(this.formulariorentaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar FormularioRenta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarFormularioRentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<FormularioRenta> formulariorentasSeleccionados=new ArrayList<FormularioRenta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosFormularioRenta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosFormularioRenta.getSelectedRows().length;			
			}
			
			formulariorentasSeleccionados=this.getFormularioRentasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoFormularioRenta--;			
				//FormularioRenta formulariorentaAux= new FormularioRenta();			
				//formulariorentaAux.setId(this.iIdNuevoFormularioRenta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//FormularioRenta formulariorentaOrigen=new FormularioRenta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(FormularioRenta formulariorentaOrigen : formulariorentasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							formulariorentaOrigen =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorentaOrigen =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaFormularioRenta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.formulariorenta.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosFormularioRenta(formulariorentaOrigen,this.formulariorenta,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.formulariorentaLogic.getFormularioRentas().add(this.formulariorentaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.formulariorentas.add(this.formulariorentaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaFormularioRenta(false);
				
				this.jTableDatosFormularioRenta.setRowSelectionInterval(this.getIndiceNuevoFormularioRenta(), this.getIndiceNuevoFormularioRenta());
				
				int iLastRow =  this.jTableDatosFormularioRenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFormularioRenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFormularioRenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFormularioRenta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarFormularioRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<FormularioRenta> formulariorentasSeleccionados=new ArrayList<FormularioRenta>();									
		
			FormularioRenta formulariorentaOrigen=new FormularioRenta();
			FormularioRenta formulariorentaDestino=new FormularioRenta();
				
			formulariorentasSeleccionados=this.getFormularioRentasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosFormularioRenta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || formulariorentasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosFormularioRenta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorentaOrigen =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						formulariorentaOrigen =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorentaDestino =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						formulariorentaDestino =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				formulariorentaOrigen =formulariorentasSeleccionados.get(0);
				formulariorentaDestino =formulariorentasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosFormularioRenta(formulariorentaOrigen,formulariorentaDestino,true,false);
				
				formulariorentaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(formulariorentaDestino,formulariorentaLogic.getFormularioRentas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formulariorentaDestino,formulariorentas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaFormularioRenta(false);
				
				//this.jTableDatosFormularioRenta.setRowSelectionInterval(this.getIndiceNuevoFormularioRenta(), this.getIndiceNuevoFormularioRenta());
				
				int iLastRow =  this.jTableDatosFormularioRenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFormularioRenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFormularioRenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFormularioRenta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormFormularioRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFormularioRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormFormularioRenta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarFormularioRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesFormularioRenta.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasFormularioRenta.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesFormularioRenta.setVisible(!isVisible);
			this.jPanelPaginacionFormularioRenta.setVisible(!isVisible);
			this.jPanelAccionesFormularioRenta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarFormularioRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameFormularioRenta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoFormularioRenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionFormularioRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionFormularioRenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByFormularioRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByFormularioRenta();
			
			this.abrirFrameOrderByFormularioRenta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByFormularioRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByFormularioRenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleFormularioRenta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormFormularioRenta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormFormularioRenta.isMaximum()) {
					this.jInternalFrameDetalleFormFormularioRenta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormFormularioRenta.setSize(this.jInternalFrameDetalleFormFormularioRenta.iWidthFormulario,this.jInternalFrameDetalleFormFormularioRenta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormFormularioRenta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormFormularioRenta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormFormularioRenta.isMaximum()) {
						this.jInternalFrameDetalleFormFormularioRenta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormFormularioRenta.jContentPaneDetalleFormularioRenta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormFormularioRenta.jTabbedPaneRelacionesFormularioRenta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormFormularioRenta.jContentPaneDetalleFormularioRenta.getWidth(),FormularioRentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFormularioRenta.jTabbedPaneRelacionesFormularioRenta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormFormularioRenta.jContentPaneDetalleFormularioRenta.getWidth(),FormularioRentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFormularioRenta.jTabbedPaneRelacionesFormularioRenta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormFormularioRenta.jContentPaneDetalleFormularioRenta.getWidth(),FormularioRentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormFormularioRenta.setVisible(true);
	        this.jInternalFrameDetalleFormFormularioRenta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByFormularioRenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByFormularioRenta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByFormularioRenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormularioRenta,false,this);
				} else {
					this.jInternalFrameOrderByFormularioRenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormularioRenta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByFormularioRenta);
				this.jInternalFrameOrderByFormularioRenta.setVisible(false);
				this.jInternalFrameOrderByFormularioRenta.setSelected(false);
				
				this.jInternalFrameOrderByFormularioRenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFormularioRenta"));
				
				this.inicializarActualizarBindingTablaOrderByFormularioRenta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionFormularioRenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionFormularioRenta==null) {
				
				this.jInternalFrameImportacionFormularioRenta=new ImportacionJInternalFrame(FormularioRentaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFormularioRenta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionFormularioRenta);
				this.jInternalFrameImportacionFormularioRenta.setVisible(false);
				this.jInternalFrameImportacionFormularioRenta.setSelected(false);


				this.jInternalFrameImportacionFormularioRenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFormularioRenta"));
				this.jInternalFrameImportacionFormularioRenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFormularioRenta"));
				this.jInternalFrameImportacionFormularioRenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFormularioRenta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoFormularioRenta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoFormularioRenta==null) {
				this.jInternalFrameReporteDinamicoFormularioRenta=new ReporteDinamicoJInternalFrame(FormularioRentaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFormularioRenta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFormularioRenta);
				this.jInternalFrameReporteDinamicoFormularioRenta.setVisible(false);
				this.jInternalFrameReporteDinamicoFormularioRenta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoFormularioRenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormularioRenta"));
				this.jInternalFrameReporteDinamicoFormularioRenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormularioRenta"));
				this.jInternalFrameReporteDinamicoFormularioRenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormularioRenta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormularioRenta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleFormularioRenta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormFormularioRenta);
			
	       	this.jInternalFrameDetalleFormFormularioRenta.setVisible(false);
	        this.jInternalFrameDetalleFormFormularioRenta.setSelected(false);
			
			//this.jInternalFrameDetalleFormFormularioRenta.dispose();
			//this.jInternalFrameDetalleFormFormularioRenta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoFormularioRenta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoFormularioRenta.setVisible(true);
	        this.jInternalFrameReporteDinamicoFormularioRenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionFormularioRenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionFormularioRenta.setVisible(true);
	        this.jInternalFrameImportacionFormularioRenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByFormularioRenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByFormularioRenta.setVisible(true);
	        this.jInternalFrameOrderByFormularioRenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByFormularioRenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByFormularioRenta.setVisible(false);
	        this.jInternalFrameOrderByFormularioRenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoFormularioRenta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoFormularioRenta.setVisible(false);
	        this.jInternalFrameReporteDinamicoFormularioRenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionFormularioRenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionFormularioRenta.setVisible(false);
	        this.jInternalFrameImportacionFormularioRenta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderFormularioRenta=(TitledBorder)this.jScrollPanelDatosFormularioRenta.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderFormularioRenta.getTitle() + " -> Cuenta Contable");


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
	
	public void jButtonModificarFormularioRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarFormularioRenta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarFormularioRenta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesFormularioRenta(true);
			//this.isEsNuevoFormularioRenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesFormularioRenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormularioRenta(false) ;
			
			if(formulariorentaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(FormularioRentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormularioRenta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormularioRenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaFormularioRentaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarFormularioRenta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFormularioRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesFormularioRenta(true);
			//this.isEsNuevoFormularioRenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.formulariorenta.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesFormularioRenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesFormularioRenta(false) ;
			
			if(FormularioRentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormularioRenta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormularioRenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	public void recargarComboTablaDatoFormularioRenta(List<DatoFormularioRenta> datoformulariorentasForeignKey)throws Exception{
		TableColumn tableColumnDatoFormularioRenta=this.jTableDatosFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta,FormularioRentaConstantesFunciones.LABEL_IDDATOFORMULARIORENTA));
		TableCellEditor tableCellEditorDatoFormularioRenta =tableColumnDatoFormularioRenta.getCellEditor();

		DatoFormularioRentaTableCell datoformulariorentaTableCellFk=(DatoFormularioRentaTableCell)tableCellEditorDatoFormularioRenta;

		if(datoformulariorentaTableCellFk!=null) {
			datoformulariorentaTableCellFk.setdatoformulariorentasForeignKey(datoformulariorentasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormularioRenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//datoformulariorentaTableCellFk.setRowActual(intSelectedRow);
			//datoformulariorentaTableCellFk.setdatoformulariorentasForeignKeyActual(datoformulariorentasForeignKey);
		//}


		if(datoformulariorentaTableCellFk!=null) {
			datoformulariorentaTableCellFk.RecargarDatoFormularioRentasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta,FormularioRentaConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormularioRenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoRetencion(List<TipoRetencion> tiporetencionsForeignKey)throws Exception{
		TableColumn tableColumnTipoRetencion=this.jTableDatosFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta,FormularioRentaConstantesFunciones.LABEL_IDTIPORETENCION));
		TableCellEditor tableCellEditorTipoRetencion =tableColumnTipoRetencion.getCellEditor();

		TipoRetencionTableCell tiporetencionTableCellFk=(TipoRetencionTableCell)tableCellEditorTipoRetencion;

		if(tiporetencionTableCellFk!=null) {
			tiporetencionTableCellFk.settiporetencionsForeignKey(tiporetencionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormularioRenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tiporetencionTableCellFk.setRowActual(intSelectedRow);
			//tiporetencionTableCellFk.settiporetencionsForeignKeyActual(tiporetencionsForeignKey);
		//}


		if(tiporetencionTableCellFk!=null) {
			tiporetencionTableCellFk.RecargarTipoRetencionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaParametroFormularioIva(List<ParametroFormularioIva> parametroformularioivasForeignKey)throws Exception{
		TableColumn tableColumnParametroFormularioIva=this.jTableDatosFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta,FormularioRentaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA));
		TableCellEditor tableCellEditorParametroFormularioIva =tableColumnParametroFormularioIva.getCellEditor();

		ParametroFormularioIvaTableCell parametroformularioivaTableCellFk=(ParametroFormularioIvaTableCell)tableCellEditorParametroFormularioIva;

		if(parametroformularioivaTableCellFk!=null) {
			parametroformularioivaTableCellFk.setparametroformularioivasForeignKey(parametroformularioivasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormularioRenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//parametroformularioivaTableCellFk.setRowActual(intSelectedRow);
			//parametroformularioivaTableCellFk.setparametroformularioivasForeignKeyActual(parametroformularioivasForeignKey);
		//}


		if(parametroformularioivaTableCellFk!=null) {
			parametroformularioivaTableCellFk.RecargarParametroFormularioIvasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta,FormularioRentaConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormularioRenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarFormularioRentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesFormularioRenta(false);
			
			//if(!this.isEsNuevoFormularioRenta) {								
				int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(FormularioRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualFormularioRenta(this.formulariorenta,true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
				
			}
			
			if(this.permiteMantenimiento(this.formulariorenta)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoFormularioRenta=true;
					this.inicializarActualizarBindingTablaFormularioRenta(false);
					this.isEsNuevoFormularioRenta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoFormularioRenta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoFormularioRenta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFormularioRenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormularioRenta(false);
				
				this.habilitarDeshabilitarControlesFormularioRenta(false);
			
												
				
				if(FormularioRentaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleFormularioRenta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoFormularioRentaActionPerformed(evt,formulariorentaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualFormularioRenta(this.formulariorenta,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosFormularioRenta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,formulariorentaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.formulariorenta.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(FormularioRenta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioRenta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarFormularioRentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				this.formulariorenta.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				this.formulariorenta.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.formulariorenta)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((FormularioRentaModel) this.jTableDatosFormularioRenta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoFormularioRenta=true;
				this.inicializarActualizarBindingTablaFormularioRenta(false);
				this.isEsNuevoFormularioRenta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFormularioRenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormularioRenta(false);
				
				this.habilitarDeshabilitarControlesFormularioRenta(false);
				
				
				
				if(FormularioRentaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleFormularioRenta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarFormularioRentaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosFormularioRenta.getRowCount()>=1) {
				jTableDatosFormularioRenta.removeRowSelectionInterval(0, jTableDatosFormularioRenta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesFormularioRenta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaFormularioRenta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormularioRenta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormularioRenta(false) ;
			
			this.isEsNuevoFormularioRenta=false;
			
			if(FormularioRentaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleFormularioRenta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosFormularioRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingFormularioRenta(false);
				
				//SI ES MANUAL
				if(FormularioRentaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualFormularioRenta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosFormularioRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoFormularioRenta--;			
			//FormularioRenta formulariorentaAux= new FormularioRenta();			
			//formulariorentaAux.setId(this.iIdNuevoFormularioRenta);
			
			if(this.jInternalFrameDetalleFormFormularioRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaFormularioRenta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
			
			this.formulariorenta.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.formulariorentaLogic.getFormularioRentas().add(this.formulariorentaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.formulariorentas.add(this.formulariorentaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaFormularioRenta(false);
			
			this.jTableDatosFormularioRenta.setRowSelectionInterval(this.getIndiceNuevoFormularioRenta(), this.getIndiceNuevoFormularioRenta());
			
			int iLastRow =  this.jTableDatosFormularioRenta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosFormularioRenta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosFormularioRenta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaFormularioRenta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionFormularioRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingFormularioRenta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormularioRenta(false);
			
			//SI ES MANUAL
			if(FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormularioRenta();
			}
			
			//this.abrirFrameTreeFormularioRenta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionFormularioRentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Formulario RentaS ?", "MANTENIMIENTO DE Formulario Renta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionFormularioRenta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralFormularioRenta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.formulariorentaReturnGeneral=formulariorentaLogic.procesarImportacionFormularioRentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.formulariorentaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarFormularioRentaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionFormularioRentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionFormularioRenta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionFormularioRenta.setFileImportacion(this.jInternalFrameImportacionFormularioRenta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionFormularioRenta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionFormularioRenta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionFormularioRenta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionFormularioRenta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<FormularioRenta> formulariorentasSeleccionados=new ArrayList<FormularioRenta>();		

		formulariorentasSeleccionados=this.getFormularioRentasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormularioRenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormularioRenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("FormularioRentaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"FormularioRentaBaseDesign.jrxml";
			
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
			
			this.generarReporteFormularioRentas("Todos",formulariorentasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulariorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Renta",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoFormularioRenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormularioRenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FormularioRentaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormularioRentaConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormularioRentaConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormularioRentaConstantesFunciones.LABEL_IDDATOFORMULARIORENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_DatoFormularioRenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_DatoFormularioRenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_DatoFormularioRenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_DatoFormularioRenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormularioRentaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormularioRentaConstantesFunciones.LABEL_IDTIPORETENCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoRetencion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoRetencion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoRetencion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoRetencion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormularioRentaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ParametroFormularioIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ParametroFormularioIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ParametroFormularioIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ParametroFormularioIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormularioRentaConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormularioRentaConstantesFunciones.LABEL_VALORPAGADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorPagado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorPagado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorPagado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorPagado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormularioRentaConstantesFunciones.LABEL_IMPUESTORETENIDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_puestoRetenido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_puestoRetenido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_puestoRetenido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_puestoRetenido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormularioRentaConstantesFunciones.LABEL_BASEIMPORNIBLE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_seImpornible_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_seImpornible_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_seImpornible_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_seImpornible_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoFormularioRenta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoFormularioRenta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoFormularioRenta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case FormularioRentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDDATOFORMULARIORENTA:
					sNombreCampoCategoria="id_dato_formulario_renta";
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDTIPORETENCION:
					sNombreCampoCategoria="id_tipo_retencion";
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA:
					sNombreCampoCategoria="id_parametro_formulario_iva";
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case FormularioRentaConstantesFunciones.LABEL_VALORPAGADO:
					sNombreCampoCategoria="valor_pagado";
					break;

				case FormularioRentaConstantesFunciones.LABEL_IMPUESTORETENIDO:
					sNombreCampoCategoria="impuesto_retenido";
					break;

				case FormularioRentaConstantesFunciones.LABEL_BASEIMPORNIBLE:
					sNombreCampoCategoria="base_impornible";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoFormularioRenta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case FormularioRentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDDATOFORMULARIORENTA:
					sNombreCampoCategoriaValor="id_dato_formulario_renta";
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDTIPORETENCION:
					sNombreCampoCategoriaValor="id_tipo_retencion";
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA:
					sNombreCampoCategoriaValor="id_parametro_formulario_iva";
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case FormularioRentaConstantesFunciones.LABEL_VALORPAGADO:
					sNombreCampoCategoriaValor="valor_pagado";
					break;

				case FormularioRentaConstantesFunciones.LABEL_IMPUESTORETENIDO:
					sNombreCampoCategoriaValor="impuesto_retenido";
					break;

				case FormularioRentaConstantesFunciones.LABEL_BASEIMPORNIBLE:
					sNombreCampoCategoriaValor="base_impornible";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoFormularioRenta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormularioRenta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FormularioRentaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDDATOFORMULARIORENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dato Formulario Renta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_dato_formulario_renta");
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDTIPORETENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Retencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_retencion");
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Parametro Formulario Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_parametro_formulario_iva");
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case FormularioRentaConstantesFunciones.LABEL_VALORPAGADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Pagado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_pagado");
					break;

				case FormularioRentaConstantesFunciones.LABEL_IMPUESTORETENIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Impuesto Retenido",sNombreCampoCategoria,sNombreCampoCategoriaValor,"impuesto_retenido");
					break;

				case FormularioRentaConstantesFunciones.LABEL_BASEIMPORNIBLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Base Impornible",sNombreCampoCategoria,sNombreCampoCategoriaValor,"base_impornible");
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
	
	public void jButtonGenerarExcelReporteDinamicoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<FormularioRenta> formulariorentasSeleccionados=new ArrayList<FormularioRenta>();		
		
		formulariorentasSeleccionados=this.getFormularioRentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formulariorenta";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("FormularioRentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoFormularioRenta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoFormularioRenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case FormularioRentaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(FormularioRenta formulariorenta:formulariorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formulariorenta.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(FormularioRenta formulariorenta:formulariorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formulariorenta.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(FormularioRenta formulariorenta:formulariorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formulariorenta.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDDATOFORMULARIORENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDDATOFORMULARIORENTA);
					iRow++;

					for(FormularioRenta formulariorenta:formulariorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formulariorenta.getdatoformulariorenta_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(FormularioRenta formulariorenta:formulariorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formulariorenta.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDTIPORETENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDTIPORETENCION);
					iRow++;

					for(FormularioRenta formulariorenta:formulariorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formulariorenta.gettiporetencion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA);
					iRow++;

					for(FormularioRenta formulariorenta:formulariorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formulariorenta.getparametroformularioiva_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormularioRentaConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(FormularioRenta formulariorenta:formulariorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formulariorenta.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormularioRentaConstantesFunciones.LABEL_VALORPAGADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_VALORPAGADO);
					iRow++;

					for(FormularioRenta formulariorenta:formulariorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formulariorenta.getvalor_pagado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormularioRentaConstantesFunciones.LABEL_IMPUESTORETENIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IMPUESTORETENIDO);
					iRow++;

					for(FormularioRenta formulariorenta:formulariorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formulariorenta.getimpuesto_retenido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormularioRentaConstantesFunciones.LABEL_BASEIMPORNIBLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_BASEIMPORNIBLE);
					iRow++;

					for(FormularioRenta formulariorenta:formulariorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formulariorenta.getbase_impornible());
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
			//	this.getFilaCabeceraExportarExcelFormularioRenta(row);				
			//	iRow++;
			//}				
			
			//for(FormularioRenta formulariorentaAux:formulariorentasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelFormularioRenta(formulariorentaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulariorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Renta",JOptionPane.INFORMATION_MESSAGE);
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
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormularioRenta(false);
			
			//SI ES MANUAL
			if(FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormularioRenta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresFormularioRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormularioRenta(false);
			
			//SI ES MANUAL
			if(FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFormularioRenta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesFormularioRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormularioRenta(false);
			
			//SI ES MANUAL
			if(FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFormularioRenta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaFormularioRenta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosFormularioRenta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosFormularioRenta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosFormularioRenta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosFormularioRenta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosFormularioRenta.setMinimumSize(dimensionMinimum);
		this.jTableDatosFormularioRenta.setMaximumSize(dimensionMaximum);
		this.jTableDatosFormularioRenta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingFormularioRenta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingFormularioRenta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingFormularioRenta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaFormularioRenta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesFormularioRenta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasFormularioRenta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFormularioRenta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesFormularioRenta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !FormularioRentaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualFormularioRenta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaFormularioRenta();
		
		this.inicializarActualizarBindingBotonesManualFormularioRenta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualFormularioRenta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFormularioRenta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualFormularioRenta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualFormularioRenta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosFormularioRenta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosFormularioRenta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteFormularioRenta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormFormularioRenta.jCheckBoxPostAccionNuevoFormularioRenta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormFormularioRenta.jCheckBoxPostAccionSinCerrarFormularioRenta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormFormularioRenta.jCheckBoxPostAccionSinMensajeFormularioRenta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosFormularioRenta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosFormularioRenta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteFormularioRenta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
				this.jInternalFrameDetalleFormFormularioRenta.jCheckBoxPostAccionNuevoFormularioRenta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormFormularioRenta.jCheckBoxPostAccionSinCerrarFormularioRenta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormFormularioRenta.jCheckBoxPostAccionSinMensajeFormularioRenta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionFormularioRenta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionFormularioRenta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormFormularioRenta.jComboBoxTiposAccionesFormularioFormularioRenta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesFormularioRenta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoFormularioRenta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormularioRenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesFormularioRenta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesFormularioRenta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarFormularioRenta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesFormularioRenta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoFormularioRenta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormularioRenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesFormularioRenta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralFormularioRenta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesFormularioRenta(Boolean esInicializar) throws Exception {
		try	{	
			if(FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualFormularioRenta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesFormularioRenta() throws Exception {
		try	{
			if(FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormularioRenta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFormularioRenta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormFormularioRenta.jComboBoxTiposAccionesFormularioFormularioRenta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormFormularioRenta.jComboBoxTiposAccionesFormularioFormularioRenta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormularioRenta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesFormularioRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesFormularioRenta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesFormularioRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesFormularioRenta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesFormularioRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesFormularioRenta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionFormularioRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionFormularioRenta.addItem(reporte);
			}
			
			
			if(!this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionFormularioRenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionFormularioRenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesFormularioRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesFormularioRenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesFormularioRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesFormularioRenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormFormularioRenta.jComboBoxTiposAccionesFormularioFormularioRenta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormFormularioRenta.jComboBoxTiposAccionesFormularioFormularioRenta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarFormularioRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarFormularioRenta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarFormularioRenta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormularioRenta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormularioRenta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFormularioRenta!=null) {
				this.jInternalFrameReporteDinamicoFormularioRenta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoFormularioRenta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFormularioRenta!=null) {
				this.jInternalFrameReporteDinamicoFormularioRenta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoFormularioRenta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoFormularioRenta!=null) {
				
				if(this.jInternalFrameReporteDinamicoFormularioRenta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFormularioRenta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormularioRenta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoFormularioRenta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFormularioRenta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormularioRenta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoFormularioRenta.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFormularioRenta.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=FormularioRentaConstantesFunciones.getTiposSeleccionarFormularioRenta(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFormularioRenta.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoFormularioRenta.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoFormularioRenta.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=FormularioRentaConstantesFunciones.getTiposSeleccionarFormularioRenta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoFormularioRenta.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoFormularioRenta.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoFormularioRenta.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=FormularioRentaConstantesFunciones.getTiposSeleccionarFormularioRenta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormularioRenta.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoFormularioRenta.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoFormularioRenta.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoFormularioRenta.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualFormularioRenta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContableFormularioRenta.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContableFormularioRenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta.getSelectedItem()!=null){this.id_dato_formulario_rentaFK_IdDatoFormularioRenta=((DatoFormularioRenta)this.jComboBoxid_dato_formulario_rentaFK_IdDatoFormularioRentaFormularioRenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_paisFK_IdPaisFormularioRenta.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisFormularioRenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta.getSelectedItem()!=null){this.id_parametro_formulario_ivaFK_IdParametroFormularioIva=((ParametroFormularioIva)this.jComboBoxid_parametro_formulario_ivaFK_IdParametroFormularioIvaFormularioRenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_retencionFK_IdTipoRetencionFormularioRenta.getSelectedItem()!=null){this.id_tipo_retencionFK_IdTipoRetencion=((TipoRetencion)this.jComboBoxid_tipo_retencionFK_IdTipoRetencionFormularioRenta.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasFormularioRenta(Boolean esInicializar) throws Exception {				
		if(FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualFormularioRenta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaFormularioRenta() throws Exception {
		this.inicializarActualizarBindingTablaFormularioRenta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByFormularioRenta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByFormularioRenta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByFormularioRenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormularioRenta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new FormularioRentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByFormularioRenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormularioRenta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new FormularioRentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosFormularioRentaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRentaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new FormularioRentaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByFormularioRenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormularioRenta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new FormularioRentaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByFormularioRenta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaFormularioRenta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=formulariorentaLogic.getFormularioRentas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=formulariorentas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(FormularioRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosFormularioRenta.setModel(new FormularioRentaModel(this.formulariorentaLogic.getFormularioRentas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosFormularioRenta.setModel(new FormularioRentaModel(this.formulariorentas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByFormularioRenta!=null && this.jInternalFrameOrderByFormularioRenta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByFormularioRenta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new FormularioRentaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO,formulariorentaConstantesFunciones.resaltarSeleccionarFormularioRenta,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+FormularioRentaConstantesFunciones.SCLASSWEBTITULO,formulariorentaConstantesFunciones.resaltarSeleccionarFormularioRenta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta,FormularioRentaConstantesFunciones.LABEL_ID));

		if(this.formulariorentaConstantesFunciones.mostraridFormularioRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioRentaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.formulariorentaConstantesFunciones.resaltaridFormularioRenta,this.formulariorentaConstantesFunciones.activaridFormularioRenta,iSizeTabla,this,true,"idFormularioRenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formulariorentaConstantesFunciones.resaltaridFormularioRenta,this.formulariorentaConstantesFunciones.activaridFormularioRenta,this,true,"idFormularioRenta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta,FormularioRentaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.formulariorentaConstantesFunciones.mostrarid_empresaFormularioRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioRentaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.formulariorentaConstantesFunciones.resaltarid_empresaFormularioRenta,this,this.formulariorentaConstantesFunciones.activarid_empresaFormularioRenta,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.formulariorentaConstantesFunciones.resaltarid_empresaFormularioRenta,this,this.formulariorentaConstantesFunciones.activarid_empresaFormularioRenta,false,"id_empresaFormularioRenta","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormularioRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta,FormularioRentaConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.formulariorentaConstantesFunciones.mostrarid_ejercicioFormularioRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioRentaConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.formulariorentaConstantesFunciones.resaltarid_ejercicioFormularioRenta,this,this.formulariorentaConstantesFunciones.activarid_ejercicioFormularioRenta,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.formulariorentaConstantesFunciones.resaltarid_ejercicioFormularioRenta,this,this.formulariorentaConstantesFunciones.activarid_ejercicioFormularioRenta,false,"id_ejercicioFormularioRenta","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormularioRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta,FormularioRentaConstantesFunciones.LABEL_IDPERIODO));

		if(this.formulariorentaConstantesFunciones.mostrarid_periodoFormularioRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioRentaConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.formulariorentaConstantesFunciones.resaltarid_periodoFormularioRenta,this,this.formulariorentaConstantesFunciones.activarid_periodoFormularioRenta,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.formulariorentaConstantesFunciones.resaltarid_periodoFormularioRenta,this,this.formulariorentaConstantesFunciones.activarid_periodoFormularioRenta,false,"id_periodoFormularioRenta","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormularioRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta,FormularioRentaConstantesFunciones.LABEL_IDDATOFORMULARIORENTA));

		if(this.formulariorentaConstantesFunciones.mostrarid_dato_formulario_rentaFormularioRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioRentaConstantesFunciones.LABEL_IDDATOFORMULARIORENTA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new DatoFormularioRentaTableCell(this.datoformulariorentasForeignKey,this.formulariorentaConstantesFunciones.resaltarid_dato_formulario_rentaFormularioRenta,this,this.formulariorentaConstantesFunciones.activarid_dato_formulario_rentaFormularioRenta,iSizeTabla));
			tableColumn.setCellEditor(new DatoFormularioRentaTableCell(this.datoformulariorentasForeignKey,this.formulariorentaConstantesFunciones.resaltarid_dato_formulario_rentaFormularioRenta,this,this.formulariorentaConstantesFunciones.activarid_dato_formulario_rentaFormularioRenta,true,"id_dato_formulario_rentaFormularioRenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormularioRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta,FormularioRentaConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.formulariorentaConstantesFunciones.mostrarid_cuenta_contableFormularioRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioRentaConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.formulariorentaConstantesFunciones.resaltarid_cuenta_contableFormularioRenta,this,this.formulariorentaConstantesFunciones.activarid_cuenta_contableFormularioRenta,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.formulariorentaConstantesFunciones.resaltarid_cuenta_contableFormularioRenta,this,this.formulariorentaConstantesFunciones.activarid_cuenta_contableFormularioRenta,true,"id_cuenta_contableFormularioRenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new FormularioRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta,FormularioRentaConstantesFunciones.LABEL_IDTIPORETENCION));

		if(this.formulariorentaConstantesFunciones.mostrarid_tipo_retencionFormularioRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioRentaConstantesFunciones.LABEL_IDTIPORETENCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoRetencionTableCell(this.tiporetencionsForeignKey,this.formulariorentaConstantesFunciones.resaltarid_tipo_retencionFormularioRenta,this,this.formulariorentaConstantesFunciones.activarid_tipo_retencionFormularioRenta,iSizeTabla));
			tableColumn.setCellEditor(new TipoRetencionTableCell(this.tiporetencionsForeignKey,this.formulariorentaConstantesFunciones.resaltarid_tipo_retencionFormularioRenta,this,this.formulariorentaConstantesFunciones.activarid_tipo_retencionFormularioRenta,true,"id_tipo_retencionFormularioRenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormularioRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta,FormularioRentaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA));

		if(this.formulariorentaConstantesFunciones.mostrarid_parametro_formulario_ivaFormularioRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioRentaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ParametroFormularioIvaTableCell(this.parametroformularioivasForeignKey,this.formulariorentaConstantesFunciones.resaltarid_parametro_formulario_ivaFormularioRenta,this,this.formulariorentaConstantesFunciones.activarid_parametro_formulario_ivaFormularioRenta,iSizeTabla));
			tableColumn.setCellEditor(new ParametroFormularioIvaTableCell(this.parametroformularioivasForeignKey,this.formulariorentaConstantesFunciones.resaltarid_parametro_formulario_ivaFormularioRenta,this,this.formulariorentaConstantesFunciones.activarid_parametro_formulario_ivaFormularioRenta,true,"id_parametro_formulario_ivaFormularioRenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormularioRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta,FormularioRentaConstantesFunciones.LABEL_IDPAIS));

		if(this.formulariorentaConstantesFunciones.mostrarid_paisFormularioRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioRentaConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.formulariorentaConstantesFunciones.resaltarid_paisFormularioRenta,this,this.formulariorentaConstantesFunciones.activarid_paisFormularioRenta,iSizeTabla));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.formulariorentaConstantesFunciones.resaltarid_paisFormularioRenta,this,this.formulariorentaConstantesFunciones.activarid_paisFormularioRenta,true,"id_paisFormularioRenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormularioRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta,FormularioRentaConstantesFunciones.LABEL_VALORPAGADO));

		if(this.formulariorentaConstantesFunciones.mostrarvalor_pagadoFormularioRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioRentaConstantesFunciones.LABEL_VALORPAGADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.formulariorentaConstantesFunciones.resaltarvalor_pagadoFormularioRenta,this.formulariorentaConstantesFunciones.activarvalor_pagadoFormularioRenta,iSizeTabla,this,true,"valor_pagadoFormularioRenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formulariorentaConstantesFunciones.resaltarvalor_pagadoFormularioRenta,this.formulariorentaConstantesFunciones.activarvalor_pagadoFormularioRenta,this,true,"valor_pagadoFormularioRenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FormularioRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta,FormularioRentaConstantesFunciones.LABEL_IMPUESTORETENIDO));

		if(this.formulariorentaConstantesFunciones.mostrarimpuesto_retenidoFormularioRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioRentaConstantesFunciones.LABEL_IMPUESTORETENIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.formulariorentaConstantesFunciones.resaltarimpuesto_retenidoFormularioRenta,this.formulariorentaConstantesFunciones.activarimpuesto_retenidoFormularioRenta,iSizeTabla,this,true,"impuesto_retenidoFormularioRenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formulariorentaConstantesFunciones.resaltarimpuesto_retenidoFormularioRenta,this.formulariorentaConstantesFunciones.activarimpuesto_retenidoFormularioRenta,this,true,"impuesto_retenidoFormularioRenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FormularioRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta,FormularioRentaConstantesFunciones.LABEL_BASEIMPORNIBLE));

		if(this.formulariorentaConstantesFunciones.mostrarbase_impornibleFormularioRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioRentaConstantesFunciones.LABEL_BASEIMPORNIBLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.formulariorentaConstantesFunciones.resaltarbase_impornibleFormularioRenta,this.formulariorentaConstantesFunciones.activarbase_impornibleFormularioRenta,iSizeTabla,this,true,"base_impornibleFormularioRenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formulariorentaConstantesFunciones.resaltarbase_impornibleFormularioRenta,this.formulariorentaConstantesFunciones.activarbase_impornibleFormularioRenta,this,true,"base_impornibleFormularioRenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new FormularioRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.formulariorentaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.formulariorentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.formulariorentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFormularioRenta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.formulariorentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.formulariorentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFormularioRenta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarFormularioRenta && this.isPermisoGuardarCambiosFormularioRenta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.formulariorentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.formulariorentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosFormularioRenta.addColumn(tableColumn);
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
			
			this.jTableDatosFormularioRenta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFormularioRenta && this.isPermisoGuardarCambiosFormularioRenta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFormularioRenta && this.isPermisoGuardarCambiosFormularioRenta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosFormularioRenta.moveColumn(this.jTableDatosFormularioRenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosFormularioRenta.moveColumn(this.jTableDatosFormularioRenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosFormularioRenta.moveColumn(this.jTableDatosFormularioRenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosFormularioRenta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosFormularioRenta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosFormularioRenta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosFormularioRenta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosFormularioRenta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!FormularioRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosFormularioRenta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosFormularioRenta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosFormularioRenta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=formulariorentaLogic.getFormularioRentas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=formulariorentas.size()-1;
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
		//this.jTableDatosFormularioRenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosFormularioRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosFormularioRenta();
			
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
				
				//this.isEsNuevoFormularioRenta=false;
					
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
			
				if(this.formulariorentaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormFormularioRenta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFormularioRenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFormularioRenta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.formulariorenta.getsType().equals("DUPLICADO")
				   || this.formulariorenta.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoFormularioRenta=true;
				
				} else {
					this.isEsNuevoFormularioRenta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
					if(this.formulariorenta.getId()>=0 && !this.formulariorenta.getIsNew()) {						
						this.isEsNuevoFormularioRenta=false;
						
					} else {
						this.isEsNuevoFormularioRenta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoFormularioRenta(esRelaciones);						
				
				this.seleccionarFormularioRenta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.formulariorenta.getId()<0) {
					this.isEsNuevoFormularioRenta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarFormularioRenta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarFormularioRenta(evt,rowIndex);
				}	
				
				if(this.formulariorentaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion FormularioRenta: " + this.dDif); 
					}
				}								
				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarFormularioRenta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.formulariorenta)) {
					if(this.formulariorenta.getId()>0) {
						this.formulariorenta.setIsDeleted(true);
						
						this.formulariorentasEliminados.add(this.formulariorenta);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.formulariorentaLogic.getFormularioRentas().remove(this.formulariorenta);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.formulariorentas.remove(this.formulariorenta);				
					}
					
					
					((FormularioRentaModel) this.jTableDatosFormularioRenta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaFormularioRenta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarFormularioRenta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoFormularioRenta) {
			
			if(this.jInternalFrameDetalleFormFormularioRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFormularioRenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFormularioRenta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(FormularioRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioFormularioRenta(this.formulariorenta);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.formulariorentaConstantesFunciones.cargarid_empresaFormularioRenta || this.formulariorentaConstantesFunciones.event_dependid_empresaFormularioRenta) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.formulariorenta.getid_empresa());
									//this.inicializarActualizarBindingFormularioRenta(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(formulariorenta.getEmpresa()!=null) {
							this.empresasForeignKey.add(formulariorenta.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.formulariorenta.getid_empresa(),false,"Formulario");

					//Ejercicio
					if(!this.formulariorentaConstantesFunciones.cargarid_ejercicioFormularioRenta || this.formulariorentaConstantesFunciones.event_dependid_ejercicioFormularioRenta) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.formulariorenta.getid_ejercicio());
									//this.inicializarActualizarBindingFormularioRenta(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(formulariorenta.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(formulariorenta.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.formulariorenta.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.formulariorentaConstantesFunciones.cargarid_periodoFormularioRenta || this.formulariorentaConstantesFunciones.event_dependid_periodoFormularioRenta) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.formulariorenta.getid_periodo());
									//this.inicializarActualizarBindingFormularioRenta(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(formulariorenta.getPeriodo()!=null) {
							this.periodosForeignKey.add(formulariorenta.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.formulariorenta.getid_periodo(),false,"Formulario");

					//DatoFormularioRenta
					if(!this.formulariorentaConstantesFunciones.cargarid_dato_formulario_rentaFormularioRenta || this.formulariorentaConstantesFunciones.event_dependid_dato_formulario_rentaFormularioRenta) {
						//this.cargarCombosDatoFormularioRentasForeignKeyLista(" where id="+this.formulariorenta.getid_dato_formulario_renta());
									//this.inicializarActualizarBindingFormularioRenta(false,false);
						this.datoformulariorentasForeignKey=new ArrayList<DatoFormularioRenta>();

						if(formulariorenta.getDatoFormularioRenta()!=null) {
							this.datoformulariorentasForeignKey.add(formulariorenta.getDatoFormularioRenta());
						}

						this.addItemDefectoCombosForeignKeyDatoFormularioRenta();
						this.cargarCombosFrameDatoFormularioRentasForeignKey("Todos");
					}
					this.setActualDatoFormularioRentaForeignKey(this.formulariorenta.getid_dato_formulario_renta(),false,"Formulario");

					//CuentaContable
					if(!this.formulariorentaConstantesFunciones.cargarid_cuenta_contableFormularioRenta || this.formulariorentaConstantesFunciones.event_dependid_cuenta_contableFormularioRenta) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.formulariorenta.getid_cuenta_contable());
									//this.inicializarActualizarBindingFormularioRenta(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(formulariorenta.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(formulariorenta.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.formulariorenta.getid_cuenta_contable(),false,"Formulario");

					//TipoRetencion
					if(!this.formulariorentaConstantesFunciones.cargarid_tipo_retencionFormularioRenta || this.formulariorentaConstantesFunciones.event_dependid_tipo_retencionFormularioRenta) {
						//this.cargarCombosTipoRetencionsForeignKeyLista(" where id="+this.formulariorenta.getid_tipo_retencion());
									//this.inicializarActualizarBindingFormularioRenta(false,false);
						this.tiporetencionsForeignKey=new ArrayList<TipoRetencion>();

						if(formulariorenta.getTipoRetencion()!=null) {
							this.tiporetencionsForeignKey.add(formulariorenta.getTipoRetencion());
						}

						this.addItemDefectoCombosForeignKeyTipoRetencion();
						this.cargarCombosFrameTipoRetencionsForeignKey("Todos");
					}
					this.setActualTipoRetencionForeignKey(this.formulariorenta.getid_tipo_retencion(),false,"Formulario");

					//ParametroFormularioIva
					if(!this.formulariorentaConstantesFunciones.cargarid_parametro_formulario_ivaFormularioRenta || this.formulariorentaConstantesFunciones.event_dependid_parametro_formulario_ivaFormularioRenta) {
						//this.cargarCombosParametroFormularioIvasForeignKeyLista(" where id="+this.formulariorenta.getid_parametro_formulario_iva());
									//this.inicializarActualizarBindingFormularioRenta(false,false);
						this.parametroformularioivasForeignKey=new ArrayList<ParametroFormularioIva>();

						if(formulariorenta.getParametroFormularioIva()!=null) {
							this.parametroformularioivasForeignKey.add(formulariorenta.getParametroFormularioIva());
						}

						this.addItemDefectoCombosForeignKeyParametroFormularioIva();
						this.cargarCombosFrameParametroFormularioIvasForeignKey("Todos");
					}
					this.setActualParametroFormularioIvaForeignKey(this.formulariorenta.getid_parametro_formulario_iva(),false,"Formulario");

					//Pais
					if(!this.formulariorentaConstantesFunciones.cargarid_paisFormularioRenta || this.formulariorentaConstantesFunciones.event_dependid_paisFormularioRenta) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.formulariorenta.getid_pais());
									//this.inicializarActualizarBindingFormularioRenta(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(formulariorenta.getPais()!=null) {
							this.paissForeignKey.add(formulariorenta.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.formulariorenta.getid_pais(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesFormularioRenta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesFormularioRenta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormularioRenta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoFormularioRenta(FormularioRenta formulariorenta) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoFormularioRenta(formulariorenta,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoFormularioRenta(FormularioRenta formulariorenta,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioFormularioRenta(formulariorenta);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyFormularioRenta(formulariorenta,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyFormularioRenta(formulariorenta);
	}
	
	public void setVariablesObjetoActualToFormularioFormularioRenta(FormularioRenta formulariorenta) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormFormularioRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormFormularioRenta.jLabelidFormularioRenta.setText(formulariorenta.getId().toString());
			this.jInternalFrameDetalleFormFormularioRenta.jTextFieldvalor_pagadoFormularioRenta.setText(formulariorenta.getvalor_pagado().toString());
			this.jInternalFrameDetalleFormFormularioRenta.jTextFieldimpuesto_retenidoFormularioRenta.setText(formulariorenta.getimpuesto_retenido().toString());
			this.jInternalFrameDetalleFormFormularioRenta.jTextFieldbase_impornibleFormularioRenta.setText(formulariorenta.getbase_impornible().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,FormularioRenta formulariorentaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,formulariorentaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,FormularioRenta formulariorentaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				formulariorentaLocal=this.formulariorenta;
			} else {
				formulariorentaLocal=this.formulariorentaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(formulariorentaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoFormularioRenta(formulariorentaLocal,true);
					
					if(formulariorentaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(formulariorentaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(formulariorentaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoFormularioRenta(FormularioRenta formulariorenta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFormularioRenta(formulariorenta,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(formulariorenta);
	}
	
	public void setVariablesFormularioToObjetoActualFormularioRenta(FormularioRenta formulariorenta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFormularioRenta(formulariorenta,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualFormularioRenta(FormularioRenta formulariorenta,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormFormularioRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormFormularioRenta.jLabelidFormularioRenta.getText()==null || this.jInternalFrameDetalleFormFormularioRenta.jLabelidFormularioRenta.getText()=="" || this.jInternalFrameDetalleFormFormularioRenta.jLabelidFormularioRenta.getText()=="Id") {
				this.jInternalFrameDetalleFormFormularioRenta.jLabelidFormularioRenta.setText("0");
			}

			if(conColumnasBase) {formulariorenta.setId(Long.parseLong(this.jInternalFrameDetalleFormFormularioRenta.jLabelidFormularioRenta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormularioRentaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta.jLabelIdFormularioRenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formulariorenta.setvalor_pagado(Double.parseDouble(this.jInternalFrameDetalleFormFormularioRenta.jTextFieldvalor_pagadoFormularioRenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormularioRentaConstantesFunciones.LABEL_VALORPAGADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta.jLabelvalor_pagadoFormularioRenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formulariorenta.setimpuesto_retenido(Double.parseDouble(this.jInternalFrameDetalleFormFormularioRenta.jTextFieldimpuesto_retenidoFormularioRenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormularioRentaConstantesFunciones.LABEL_IMPUESTORETENIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta.jLabelimpuesto_retenidoFormularioRenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formulariorenta.setbase_impornible(Double.parseDouble(this.jInternalFrameDetalleFormFormularioRenta.jTextFieldbase_impornibleFormularioRenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormularioRentaConstantesFunciones.LABEL_BASEIMPORNIBLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta.jLabelbase_impornibleFormularioRenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFormularioRenta(FormularioRenta formulariorentaBean,FormularioRenta formulariorenta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && formulariorentaBean.getid_dato_formulario_renta()!=null && !formulariorentaBean.getid_dato_formulario_renta().equals(-1L))) {formulariorenta.setid_dato_formulario_renta(formulariorentaBean.getid_dato_formulario_renta());}
			if(conDefault || (!conDefault && formulariorentaBean.getid_cuenta_contable()!=null && !formulariorentaBean.getid_cuenta_contable().equals(-1L))) {formulariorenta.setid_cuenta_contable(formulariorentaBean.getid_cuenta_contable());}
			if(conDefault || (!conDefault && formulariorentaBean.getid_tipo_retencion()!=null && !formulariorentaBean.getid_tipo_retencion().equals(-1L))) {formulariorenta.setid_tipo_retencion(formulariorentaBean.getid_tipo_retencion());}
			if(conDefault || (!conDefault && formulariorentaBean.getid_parametro_formulario_iva()!=null && !formulariorentaBean.getid_parametro_formulario_iva().equals(-1L))) {formulariorenta.setid_parametro_formulario_iva(formulariorentaBean.getid_parametro_formulario_iva());}
			if(conDefault || (!conDefault && formulariorentaBean.getid_pais()!=null && !formulariorentaBean.getid_pais().equals(-1L))) {formulariorenta.setid_pais(formulariorentaBean.getid_pais());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosFormularioRenta(FormularioRenta formulariorentaOrigen,FormularioRenta formulariorenta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && formulariorentaOrigen.getId()!=null && !formulariorentaOrigen.getId().equals(0L))) {formulariorenta.setId(formulariorentaOrigen.getId());}}
			if(conDefault || (!conDefault && formulariorentaOrigen.getid_dato_formulario_renta()!=null && !formulariorentaOrigen.getid_dato_formulario_renta().equals(-1L))) {formulariorenta.setid_dato_formulario_renta(formulariorentaOrigen.getid_dato_formulario_renta());}
			if(conDefault || (!conDefault && formulariorentaOrigen.getid_cuenta_contable()!=null && !formulariorentaOrigen.getid_cuenta_contable().equals(-1L))) {formulariorenta.setid_cuenta_contable(formulariorentaOrigen.getid_cuenta_contable());}
			if(conDefault || (!conDefault && formulariorentaOrigen.getid_tipo_retencion()!=null && !formulariorentaOrigen.getid_tipo_retencion().equals(-1L))) {formulariorenta.setid_tipo_retencion(formulariorentaOrigen.getid_tipo_retencion());}
			if(conDefault || (!conDefault && formulariorentaOrigen.getid_parametro_formulario_iva()!=null && !formulariorentaOrigen.getid_parametro_formulario_iva().equals(-1L))) {formulariorenta.setid_parametro_formulario_iva(formulariorentaOrigen.getid_parametro_formulario_iva());}
			if(conDefault || (!conDefault && formulariorentaOrigen.getid_pais()!=null && !formulariorentaOrigen.getid_pais().equals(-1L))) {formulariorenta.setid_pais(formulariorentaOrigen.getid_pais());}
			if(conDefault || (!conDefault && formulariorentaOrigen.getvalor_pagado()!=null && !formulariorentaOrigen.getvalor_pagado().equals(0.0))) {formulariorenta.setvalor_pagado(formulariorentaOrigen.getvalor_pagado());}
			if(conDefault || (!conDefault && formulariorentaOrigen.getimpuesto_retenido()!=null && !formulariorentaOrigen.getimpuesto_retenido().equals(0.0))) {formulariorenta.setimpuesto_retenido(formulariorentaOrigen.getimpuesto_retenido());}
			if(conDefault || (!conDefault && formulariorentaOrigen.getbase_impornible()!=null && !formulariorentaOrigen.getbase_impornible().equals(0.0))) {formulariorenta.setbase_impornible(formulariorentaOrigen.getbase_impornible());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFormularioRenta(FormularioRenta formulariorenta) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFormularioRenta.jLabelidFormularioRenta.setText(formulariorenta.getId().toString());
			this.jInternalFrameDetalleFormFormularioRenta.jTextFieldvalor_pagadoFormularioRenta.setText(formulariorenta.getvalor_pagado().toString());
			this.jInternalFrameDetalleFormFormularioRenta.jTextFieldimpuesto_retenidoFormularioRenta.setText(formulariorenta.getimpuesto_retenido().toString());
			this.jInternalFrameDetalleFormFormularioRenta.jTextFieldbase_impornibleFormularioRenta.setText(formulariorenta.getbase_impornible().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFormularioRenta(FormularioRentaBean formulariorentaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFormularioRenta.jLabelidFormularioRenta.setText(formulariorentaBean.getId().toString());
			this.jInternalFrameDetalleFormFormularioRenta.jTextFieldvalor_pagadoFormularioRenta.setText(formulariorentaBean.getvalor_pagado().toString());
			this.jInternalFrameDetalleFormFormularioRenta.jTextFieldimpuesto_retenidoFormularioRenta.setText(formulariorentaBean.getimpuesto_retenido().toString());
			this.jInternalFrameDetalleFormFormularioRenta.jTextFieldbase_impornibleFormularioRenta.setText(formulariorentaBean.getbase_impornible().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanFormularioRenta(FormularioRentaParameterReturnGeneral formulariorentaReturnGeneral,FormularioRentaBean formulariorentaBean,Boolean conDefault) throws Exception { 
		try {
			FormularioRenta formulariorentaLocal=new FormularioRenta();
			
			formulariorentaLocal=formulariorentaReturnGeneral.getFormularioRenta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && formulariorentaLocal.getId()!=null && !formulariorentaLocal.getId().equals(0L))) {formulariorentaBean.setId(formulariorentaLocal.getId());}}
			if(conDefault || (!conDefault && formulariorentaLocal.getid_dato_formulario_renta()!=null && !formulariorentaLocal.getid_dato_formulario_renta().equals(-1L))) {formulariorentaBean.setid_dato_formulario_renta(formulariorentaLocal.getid_dato_formulario_renta());}
			if(conDefault || (!conDefault && formulariorentaLocal.getid_cuenta_contable()!=null && !formulariorentaLocal.getid_cuenta_contable().equals(-1L))) {formulariorentaBean.setid_cuenta_contable(formulariorentaLocal.getid_cuenta_contable());}
			if(conDefault || (!conDefault && formulariorentaLocal.getid_tipo_retencion()!=null && !formulariorentaLocal.getid_tipo_retencion().equals(-1L))) {formulariorentaBean.setid_tipo_retencion(formulariorentaLocal.getid_tipo_retencion());}
			if(conDefault || (!conDefault && formulariorentaLocal.getid_parametro_formulario_iva()!=null && !formulariorentaLocal.getid_parametro_formulario_iva().equals(-1L))) {formulariorentaBean.setid_parametro_formulario_iva(formulariorentaLocal.getid_parametro_formulario_iva());}
			if(conDefault || (!conDefault && formulariorentaLocal.getid_pais()!=null && !formulariorentaLocal.getid_pais().equals(-1L))) {formulariorentaBean.setid_pais(formulariorentaLocal.getid_pais());}
			if(conDefault || (!conDefault && formulariorentaLocal.getvalor_pagado()!=null && !formulariorentaLocal.getvalor_pagado().equals(0.0))) {formulariorentaBean.setvalor_pagado(formulariorentaLocal.getvalor_pagado());}
			if(conDefault || (!conDefault && formulariorentaLocal.getimpuesto_retenido()!=null && !formulariorentaLocal.getimpuesto_retenido().equals(0.0))) {formulariorentaBean.setimpuesto_retenido(formulariorentaLocal.getimpuesto_retenido());}
			if(conDefault || (!conDefault && formulariorentaLocal.getbase_impornible()!=null && !formulariorentaLocal.getbase_impornible().equals(0.0))) {formulariorentaBean.setbase_impornible(formulariorentaLocal.getbase_impornible());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxFormularioRentaGenerico(Long idFormularioRentaSeleccionado,JComboBox jComboBoxFormularioRenta,List<FormularioRenta> formulariorentasLocal)throws Exception {
		try {
			FormularioRenta  formulariorentaTemp=null;

			for(FormularioRenta formulariorentaAux:formulariorentasLocal) {
				if(formulariorentaAux.getId()!=null && formulariorentaAux.getId().equals(idFormularioRentaSeleccionado)) {
					formulariorentaTemp=formulariorentaAux;
					break;
				}
			}

			jComboBoxFormularioRenta.setSelectedItem(formulariorentaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxFormularioRentaGenerico(JComboBox jComboBoxFormularioRenta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFormularioRenta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxFormularioRenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFormularioRenta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxFormularioRenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formulariorenta=(FormularioRenta) formulariorentaLogic.getFormularioRentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			formulariorenta =(FormularioRenta) formulariorentas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!formulariorenta.getIsNew() && !formulariorenta.getIsChanged() && !formulariorenta.getIsDeleted()) {
				sDescripcion=formulariorenta.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=formulariorenta.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!formulariorenta.getIsNew() && !formulariorenta.getIsChanged() && !formulariorenta.getIsDeleted()) {
				sDescripcion=formulariorenta.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=formulariorenta.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!formulariorenta.getIsNew() && !formulariorenta.getIsChanged() && !formulariorenta.getIsDeleted()) {
				sDescripcion=formulariorenta.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=formulariorenta.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("DatoFormularioRenta")) {
			//sDescripcion=this.getActualDatoFormularioRentaForeignKeyDescripcion((Long)value);
			if(!formulariorenta.getIsNew() && !formulariorenta.getIsChanged() && !formulariorenta.getIsDeleted()) {
				sDescripcion=formulariorenta.getdatoformulariorenta_descripcion();
			} else {
				//sDescripcion=this.getActualDatoFormularioRentaForeignKeyDescripcion((Long)value);
				sDescripcion=formulariorenta.getdatoformulariorenta_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!formulariorenta.getIsNew() && !formulariorenta.getIsChanged() && !formulariorenta.getIsDeleted()) {
				sDescripcion=formulariorenta.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=formulariorenta.getcuentacontable_descripcion();
			}
		}

		if(sTipo.equals("TipoRetencion")) {
			//sDescripcion=this.getActualTipoRetencionForeignKeyDescripcion((Long)value);
			if(!formulariorenta.getIsNew() && !formulariorenta.getIsChanged() && !formulariorenta.getIsDeleted()) {
				sDescripcion=formulariorenta.gettiporetencion_descripcion();
			} else {
				//sDescripcion=this.getActualTipoRetencionForeignKeyDescripcion((Long)value);
				sDescripcion=formulariorenta.gettiporetencion_descripcion();
			}
		}

		if(sTipo.equals("ParametroFormularioIva")) {
			//sDescripcion=this.getActualParametroFormularioIvaForeignKeyDescripcion((Long)value);
			if(!formulariorenta.getIsNew() && !formulariorenta.getIsChanged() && !formulariorenta.getIsDeleted()) {
				sDescripcion=formulariorenta.getparametroformularioiva_descripcion();
			} else {
				//sDescripcion=this.getActualParametroFormularioIvaForeignKeyDescripcion((Long)value);
				sDescripcion=formulariorenta.getparametroformularioiva_descripcion();
			}
		}

		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!formulariorenta.getIsNew() && !formulariorenta.getIsChanged() && !formulariorenta.getIsDeleted()) {
				sDescripcion=formulariorenta.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=formulariorenta.getpais_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		FormularioRenta formulariorentaRow=new FormularioRenta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formulariorentaRow=(FormularioRenta) formulariorentaLogic.getFormularioRentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			formulariorentaRow=(FormularioRenta) formulariorentas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualFormularioRenta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoFormularioRenta.setVisible((this.isVisibilidadCeldaNuevoFormularioRenta && this.isPermisoNuevoFormularioRenta));			
			this.jButtonDuplicarFormularioRenta.setVisible((this.isVisibilidadCeldaDuplicarFormularioRenta && this.isPermisoDuplicarFormularioRenta));			
			this.jButtonCopiarFormularioRenta.setVisible((this.isVisibilidadCeldaCopiarFormularioRenta && this.isPermisoCopiarFormularioRenta));
			this.jButtonVerFormFormularioRenta.setVisible((this.isVisibilidadCeldaVerFormFormularioRenta && this.isPermisoVerFormFormularioRenta));
			
			this.jButtonAbrirOrderByFormularioRenta.setVisible((this.isVisibilidadCeldaOrdenFormularioRenta && this.isPermisoOrdenFormularioRenta));			
			
			this.jButtonNuevoRelacionesFormularioRenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormularioRenta && this.isPermisoNuevoFormularioRenta));			
			this.jButtonNuevoGuardarCambiosFormularioRenta.setVisible((this.isVisibilidadCeldaNuevoFormularioRenta && this.isPermisoNuevoFormularioRenta && this.isPermisoGuardarCambiosFormularioRenta));
			
			if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
			this.jInternalFrameDetalleFormFormularioRenta.jButtonModificarFormularioRenta.setVisible((this.isVisibilidadCeldaModificarFormularioRenta && this.isPermisoActualizarFormularioRenta));	
			this.jInternalFrameDetalleFormFormularioRenta.jButtonActualizarFormularioRenta.setVisible((this.isVisibilidadCeldaActualizarFormularioRenta && this.isPermisoActualizarFormularioRenta));	
			this.jInternalFrameDetalleFormFormularioRenta.jButtonEliminarFormularioRenta.setVisible((this.isVisibilidadCeldaEliminarFormularioRenta && this.isPermisoEliminarFormularioRenta));
			this.jInternalFrameDetalleFormFormularioRenta.jButtonCancelarFormularioRenta.setVisible(this.isVisibilidadCeldaCancelarFormularioRenta);							
			this.jInternalFrameDetalleFormFormularioRenta.jButtonGuardarCambiosFormularioRenta.setVisible((this.isVisibilidadCeldaGuardarFormularioRenta && this.isPermisoGuardarCambiosFormularioRenta));			
			
			}
						
			this.jButtonGuardarCambiosTablaFormularioRenta.setVisible((this.isVisibilidadCeldaGuardarCambiosFormularioRenta && this.isPermisoGuardarCambiosFormularioRenta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarFormularioRenta.setVisible((this.isVisibilidadCeldaNuevoFormularioRenta && this.isPermisoNuevoFormularioRenta));						
			this.jButtonDuplicarToolBarFormularioRenta.setVisible((this.isVisibilidadCeldaDuplicarFormularioRenta && this.isPermisoDuplicarFormularioRenta));						
			this.jButtonCopiarToolBarFormularioRenta.setVisible((this.isVisibilidadCeldaCopiarFormularioRenta && this.isPermisoCopiarFormularioRenta));			
			this.jButtonVerFormToolBarFormularioRenta.setVisible((this.isVisibilidadCeldaVerFormFormularioRenta && this.isPermisoVerFormFormularioRenta));			
			this.jButtonAbrirOrderByToolBarFormularioRenta.setVisible((this.isVisibilidadCeldaOrdenFormularioRenta && this.isPermisoOrdenFormularioRenta));
			this.jButtonNuevoRelacionesToolBarFormularioRenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormularioRenta && this.isPermisoNuevoFormularioRenta));			
			this.jButtonNuevoGuardarCambiosToolBarFormularioRenta.setVisible((this.isVisibilidadCeldaNuevoFormularioRenta && this.isPermisoNuevoFormularioRenta && this.isPermisoGuardarCambiosFormularioRenta));			
			
			if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
			this.jInternalFrameDetalleFormFormularioRenta.jButtonModificarToolBarFormularioRenta.setVisible((this.isVisibilidadCeldaModificarFormularioRenta && this.isPermisoActualizarFormularioRenta));	
			this.jInternalFrameDetalleFormFormularioRenta.jButtonActualizarToolBarFormularioRenta.setVisible((this.isVisibilidadCeldaActualizarFormularioRenta  && this.isPermisoActualizarFormularioRenta));	
			this.jInternalFrameDetalleFormFormularioRenta.jButtonEliminarToolBarFormularioRenta.setVisible((this.isVisibilidadCeldaEliminarFormularioRenta && this.isPermisoEliminarFormularioRenta));
			this.jInternalFrameDetalleFormFormularioRenta.jButtonCancelarToolBarFormularioRenta.setVisible(this.isVisibilidadCeldaCancelarFormularioRenta);				
			this.jInternalFrameDetalleFormFormularioRenta.jButtonGuardarCambiosToolBarFormularioRenta.setVisible((this.isVisibilidadCeldaGuardarFormularioRenta && this.isPermisoGuardarCambiosFormularioRenta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarFormularioRenta.setVisible((this.isVisibilidadCeldaGuardarCambiosFormularioRenta && this.isPermisoGuardarCambiosFormularioRenta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoFormularioRenta.setVisible((this.isVisibilidadCeldaNuevoFormularioRenta && this.isPermisoNuevoFormularioRenta));			
			this.jMenuItemDuplicarFormularioRenta.setVisible((this.isVisibilidadCeldaDuplicarFormularioRenta && this.isPermisoDuplicarFormularioRenta));			
			this.jMenuItemCopiarFormularioRenta.setVisible((this.isVisibilidadCeldaCopiarFormularioRenta && this.isPermisoCopiarFormularioRenta));			
			this.jMenuItemVerFormFormularioRenta.setVisible((this.isVisibilidadCeldaVerFormFormularioRenta && this.isPermisoVerFormFormularioRenta));			
			this.jMenuItemAbrirOrderByFormularioRenta.setVisible((this.isVisibilidadCeldaOrdenFormularioRenta && this.isPermisoOrdenFormularioRenta));			
			//this.jMenuItemMostrarOcultarFormularioRenta.setVisible((this.isVisibilidadCeldaOrdenFormularioRenta && this.isPermisoOrdenFormularioRenta));
			this.jMenuItemDetalleAbrirOrderByFormularioRenta.setVisible((this.isVisibilidadCeldaOrdenFormularioRenta && this.isPermisoOrdenFormularioRenta));			
			//this.jMenuItemDetalleMostrarOcultarFormularioRenta.setVisible((this.isVisibilidadCeldaOrdenFormularioRenta && this.isPermisoOrdenFormularioRenta));			
			this.jMenuItemNuevoRelacionesFormularioRenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormularioRenta && this.isPermisoNuevoFormularioRenta));			
			this.jMenuItemNuevoGuardarCambiosFormularioRenta.setVisible((this.isVisibilidadCeldaNuevoFormularioRenta && this.isPermisoNuevoFormularioRenta && this.isPermisoGuardarCambiosFormularioRenta));									
			
			if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
			this.jInternalFrameDetalleFormFormularioRenta.jMenuItemModificarFormularioRenta.setVisible((this.isVisibilidadCeldaModificarFormularioRenta && this.isPermisoActualizarFormularioRenta));	
			this.jInternalFrameDetalleFormFormularioRenta.jMenuItemActualizarFormularioRenta.setVisible((this.isVisibilidadCeldaActualizarFormularioRenta && this.isPermisoActualizarFormularioRenta));	
			this.jInternalFrameDetalleFormFormularioRenta.jMenuItemEliminarFormularioRenta.setVisible((this.isVisibilidadCeldaEliminarFormularioRenta && this.isPermisoEliminarFormularioRenta));
			this.jInternalFrameDetalleFormFormularioRenta.jMenuItemCancelarFormularioRenta.setVisible(this.isVisibilidadCeldaCancelarFormularioRenta);				
			}
			
			this.jMenuItemGuardarCambiosFormularioRenta.setVisible((this.isVisibilidadCeldaGuardarFormularioRenta && this.isPermisoGuardarCambiosFormularioRenta));						
			this.jMenuItemGuardarCambiosTablaFormularioRenta.setVisible((this.isVisibilidadCeldaGuardarCambiosFormularioRenta && this.isPermisoGuardarCambiosFormularioRenta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoFormularioRenta=this.jButtonNuevoFormularioRenta.isVisible();
			this.isVisibilidadCeldaDuplicarFormularioRenta=this.jButtonDuplicarFormularioRenta.isVisible();
			this.isVisibilidadCeldaCopiarFormularioRenta=this.jButtonCopiarFormularioRenta.isVisible();
			this.isVisibilidadCeldaVerFormFormularioRenta=this.jButtonVerFormFormularioRenta.isVisible();
			
			this.isVisibilidadCeldaOrdenFormularioRenta=this.jButtonAbrirOrderByFormularioRenta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta=this.jButtonNuevoRelacionesFormularioRenta.isVisible();
			this.isVisibilidadCeldaModificarFormularioRenta=this.jButtonModificarFormularioRenta.isVisible();
			
			if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
			this.isVisibilidadCeldaActualizarFormularioRenta=this.jInternalFrameDetalleFormFormularioRenta.jButtonActualizarFormularioRenta.isVisible();
			this.isVisibilidadCeldaEliminarFormularioRenta=this.jInternalFrameDetalleFormFormularioRenta.jButtonEliminarFormularioRenta.isVisible();
			this.isVisibilidadCeldaCancelarFormularioRenta=this.jInternalFrameDetalleFormFormularioRenta.jButtonCancelarFormularioRenta.isVisible();
			this.isVisibilidadCeldaGuardarFormularioRenta=this.jInternalFrameDetalleFormFormularioRenta.jButtonGuardarCambiosFormularioRenta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta=this.jButtonGuardarCambiosTablaFormularioRenta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoFormularioRenta=this.jButtonNuevoToolBarFormularioRenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta=this.jButtonNuevoRelacionesToolBarFormularioRenta.isVisible();
			
			if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
			this.isVisibilidadCeldaModificarFormularioRenta=this.jInternalFrameDetalleFormFormularioRenta.jButtonModificarToolBarFormularioRenta.isVisible();
			this.isVisibilidadCeldaActualizarFormularioRenta=this.jInternalFrameDetalleFormFormularioRenta.jButtonActualizarToolBarFormularioRenta.isVisible();
			this.isVisibilidadCeldaEliminarFormularioRenta=this.jInternalFrameDetalleFormFormularioRenta.jButtonEliminarToolBarFormularioRenta.isVisible();
			this.isVisibilidadCeldaCancelarFormularioRenta=this.jInternalFrameDetalleFormFormularioRenta.jButtonCancelarToolBarFormularioRenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFormularioRenta=this.jButtonGuardarCambiosToolBarFormularioRenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta=this.jButtonGuardarCambiosTablaToolBarFormularioRenta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoFormularioRenta=this.jMenuItemNuevoFormularioRenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta=this.jMenuItemNuevoRelacionesFormularioRenta.isVisible();
			
			if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
			this.isVisibilidadCeldaModificarFormularioRenta=this.jInternalFrameDetalleFormFormularioRenta.jMenuItemModificarFormularioRenta.isVisible();
			this.isVisibilidadCeldaActualizarFormularioRenta=this.jInternalFrameDetalleFormFormularioRenta.jMenuItemActualizarFormularioRenta.isVisible();
			this.isVisibilidadCeldaEliminarFormularioRenta=this.jInternalFrameDetalleFormFormularioRenta.jMenuItemEliminarFormularioRenta.isVisible();
			this.isVisibilidadCeldaCancelarFormularioRenta=this.jInternalFrameDetalleFormFormularioRenta.jMenuItemCancelarFormularioRenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFormularioRenta=this.jMenuItemGuardarCambiosFormularioRenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta=this.jMenuItemGuardarCambiosTablaFormularioRenta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesFormularioRenta(Boolean esInicializar) {
		if(FormularioRentaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.formulariorentaSessionBean.getConGuardarRelaciones()) {
				//if(this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesFormularioRenta();
			}
			
			this.inicializarActualizarBindingBotonesManualFormularioRenta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualFormularioRenta() {
		this.jButtonNuevoFormularioRenta.setVisible(this.isPermisoNuevoFormularioRenta);			
		this.jButtonDuplicarFormularioRenta.setVisible(this.isPermisoDuplicarFormularioRenta);			
		this.jButtonCopiarFormularioRenta.setVisible(this.isPermisoCopiarFormularioRenta);			
		this.jButtonVerFormFormularioRenta.setVisible(this.isPermisoVerFormFormularioRenta);			
		
		this.jButtonAbrirOrderByFormularioRenta.setVisible(this.isPermisoOrdenFormularioRenta);					
		
		this.jButtonNuevoRelacionesFormularioRenta.setVisible(this.isPermisoNuevoFormularioRenta);			
		
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta.jButtonModificarFormularioRenta.setVisible(this.isPermisoActualizarFormularioRenta);	
			this.jInternalFrameDetalleFormFormularioRenta.jButtonActualizarFormularioRenta.setVisible(this.isPermisoActualizarFormularioRenta);	
			this.jInternalFrameDetalleFormFormularioRenta.jButtonEliminarFormularioRenta.setVisible(this.isPermisoEliminarFormularioRenta);
			this.jInternalFrameDetalleFormFormularioRenta.jButtonCancelarFormularioRenta.setVisible(this.isVisibilidadCeldaCancelarFormularioRenta);						
			this.jInternalFrameDetalleFormFormularioRenta.jButtonGuardarCambiosFormularioRenta.setVisible(this.isPermisoGuardarCambiosFormularioRenta);							
		}
		
		this.jButtonGuardarCambiosTablaFormularioRenta.setVisible(this.isPermisoActualizarFormularioRenta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleFormularioRenta() {
		this.jInternalFrameDetalleFormFormularioRenta.jButtonModificarFormularioRenta.setVisible(this.isPermisoActualizarFormularioRenta);	
		this.jInternalFrameDetalleFormFormularioRenta.jButtonActualizarFormularioRenta.setVisible(this.isPermisoActualizarFormularioRenta);	
		this.jInternalFrameDetalleFormFormularioRenta.jButtonEliminarFormularioRenta.setVisible(this.isPermisoEliminarFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jButtonCancelarFormularioRenta.setVisible(this.isVisibilidadCeldaCancelarFormularioRenta);							
		this.jInternalFrameDetalleFormFormularioRenta.jButtonGuardarCambiosFormularioRenta.setVisible((this.isVisibilidadCeldaGuardarFormularioRenta && this.isPermisoGuardarCambiosFormularioRenta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosFormularioRenta() {
		if(FormularioRentaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualFormularioRenta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesFormularioRenta() {
	}
	
	public void jTableDatosFormularioRentaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarFormularioRenta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidFormularioRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioRenta(this.getformulariorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formulariorenta==null) {
						this.formulariorenta = new FormularioRenta();
					}

					this.setVariablesFormularioToObjetoActualFormularioRenta(this.formulariorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
				}

				if(this.formulariorenta.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.formulariorenta.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaFormularioRentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebFormularioRenta(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormularioRenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormularioRenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormularioRenta(this.getformulariorenta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.formulariorentaLogic.getConnexion());

				if(this.formulariorenta.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.formulariorenta.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormularioRenta=(TitledBorder)this.jScrollPanelDatosFormularioRenta.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderFormularioRenta.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaFormularioRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioRenta(this.getformulariorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formulariorenta==null) {
						this.formulariorenta = new FormularioRenta();
					}

					this.setVariablesFormularioToObjetoActualFormularioRenta(this.formulariorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
				}

				if(this.formulariorenta.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.formulariorenta.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioFormularioRentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebFormularioRenta(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormularioRenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormularioRenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormularioRenta(this.getformulariorenta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.formulariorentaLogic.getConnexion());

				if(this.formulariorenta.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.formulariorenta.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormularioRenta=(TitledBorder)this.jScrollPanelDatosFormularioRenta.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderFormularioRenta.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioFormularioRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioRenta(this.getformulariorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formulariorenta==null) {
						this.formulariorenta = new FormularioRenta();
					}

					this.setVariablesFormularioToObjetoActualFormularioRenta(this.formulariorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
				}

				if(this.formulariorenta.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.formulariorenta.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoFormularioRentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebFormularioRenta(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormularioRenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormularioRenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormularioRenta(this.getformulariorenta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.formulariorentaLogic.getConnexion());

				if(this.formulariorenta.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.formulariorenta.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormularioRenta=(TitledBorder)this.jScrollPanelDatosFormularioRenta.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderFormularioRenta.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoFormularioRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioRenta(this.getformulariorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formulariorenta==null) {
						this.formulariorenta = new FormularioRenta();
					}

					this.setVariablesFormularioToObjetoActualFormularioRenta(this.formulariorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
				}

				if(this.formulariorenta.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.formulariorenta.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_dato_formulario_rentaFormularioRentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisodatoformulariorenta=true;

			idTienePermisodatoformulariorenta=this.tienePermisosUsuarioEnPaginaWebFormularioRenta(DatoFormularioRentaConstantesFunciones.CLASSNAME);

			if(idTienePermisodatoformulariorenta) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormularioRenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormularioRenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormularioRenta(this.getformulariorenta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);

				this.datoformulariorentaBeanSwingJInternalFrame=new DatoFormularioRentaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.datoformulariorentaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.datoformulariorentaBeanSwingJInternalFrame.getDatoFormularioRentaLogic().setConnexion(this.formulariorentaLogic.getConnexion());

				if(this.formulariorenta.getid_dato_formulario_renta()!=null) {
					this.datoformulariorentaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.datoformulariorentaBeanSwingJInternalFrame.setIdActual(this.formulariorenta.getid_dato_formulario_renta());
					this.datoformulariorentaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.datoformulariorentaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.datoformulariorentaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoFormularioRenta();
				}

				JInternalFrameBase jinternalFrame =this.datoformulariorentaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormularioRenta=(TitledBorder)this.jScrollPanelDatosFormularioRenta.getBorder();
				TitledBorder titledBorderdatoformulariorenta=(TitledBorder)this.datoformulariorentaBeanSwingJInternalFrame.jScrollPanelDatosDatoFormularioRenta.getBorder();

				titledBorderdatoformulariorenta.setTitle(titledBorderFormularioRenta.getTitle() + " -> Dato Formulario Renta");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_dato_formulario_rentaFormularioRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioRenta(this.getformulariorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formulariorenta==null) {
						this.formulariorenta = new FormularioRenta();
					}

					this.setVariablesFormularioToObjetoActualFormularioRenta(this.formulariorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
				}

				if(this.formulariorenta.getid_dato_formulario_renta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_dato_formulario_renta = "+this.formulariorenta.getid_dato_formulario_renta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableFormularioRentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebFormularioRenta(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormularioRenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormularioRenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormularioRenta(this.getformulariorenta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.formulariorentaLogic.getConnexion());

				if(this.formulariorenta.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.formulariorenta.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormularioRenta=(TitledBorder)this.jScrollPanelDatosFormularioRenta.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderFormularioRenta.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableFormularioRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioRenta(this.getformulariorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formulariorenta==null) {
						this.formulariorenta = new FormularioRenta();
					}

					this.setVariablesFormularioToObjetoActualFormularioRenta(this.formulariorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
				}

				if(this.formulariorenta.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.formulariorenta.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_retencionFormularioRentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotiporetencion=true;

			idTienePermisotiporetencion=this.tienePermisosUsuarioEnPaginaWebFormularioRenta(TipoRetencionConstantesFunciones.CLASSNAME);

			if(idTienePermisotiporetencion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormularioRenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormularioRenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormularioRenta(this.getformulariorenta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);

				this.tiporetencionBeanSwingJInternalFrame=new TipoRetencionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tiporetencionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tiporetencionBeanSwingJInternalFrame.getTipoRetencionLogic().setConnexion(this.formulariorentaLogic.getConnexion());

				if(this.formulariorenta.getid_tipo_retencion()!=null) {
					this.tiporetencionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tiporetencionBeanSwingJInternalFrame.setIdActual(this.formulariorenta.getid_tipo_retencion());
					this.tiporetencionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tiporetencionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tiporetencionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoRetencion();
				}

				JInternalFrameBase jinternalFrame =this.tiporetencionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormularioRenta=(TitledBorder)this.jScrollPanelDatosFormularioRenta.getBorder();
				TitledBorder titledBordertiporetencion=(TitledBorder)this.tiporetencionBeanSwingJInternalFrame.jScrollPanelDatosTipoRetencion.getBorder();

				titledBordertiporetencion.setTitle(titledBorderFormularioRenta.getTitle() + " -> Tipo Retencion ");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_retencionFormularioRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioRenta(this.getformulariorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formulariorenta==null) {
						this.formulariorenta = new FormularioRenta();
					}

					this.setVariablesFormularioToObjetoActualFormularioRenta(this.formulariorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
				}

				if(this.formulariorenta.getid_tipo_retencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_retencion = "+this.formulariorenta.getid_tipo_retencion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_parametro_formulario_ivaFormularioRentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoparametroformularioiva=true;

			idTienePermisoparametroformularioiva=this.tienePermisosUsuarioEnPaginaWebFormularioRenta(ParametroFormularioIvaConstantesFunciones.CLASSNAME);

			if(idTienePermisoparametroformularioiva) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormularioRenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormularioRenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormularioRenta(this.getformulariorenta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);

				this.parametroformularioivaBeanSwingJInternalFrame=new ParametroFormularioIvaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.parametroformularioivaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.parametroformularioivaBeanSwingJInternalFrame.getParametroFormularioIvaLogic().setConnexion(this.formulariorentaLogic.getConnexion());

				if(this.formulariorenta.getid_parametro_formulario_iva()!=null) {
					this.parametroformularioivaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.parametroformularioivaBeanSwingJInternalFrame.setIdActual(this.formulariorenta.getid_parametro_formulario_iva());
					this.parametroformularioivaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.parametroformularioivaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.parametroformularioivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroFormularioIva();
				}

				JInternalFrameBase jinternalFrame =this.parametroformularioivaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormularioRenta=(TitledBorder)this.jScrollPanelDatosFormularioRenta.getBorder();
				TitledBorder titledBorderparametroformularioiva=(TitledBorder)this.parametroformularioivaBeanSwingJInternalFrame.jScrollPanelDatosParametroFormularioIva.getBorder();

				titledBorderparametroformularioiva.setTitle(titledBorderFormularioRenta.getTitle() + " -> Parametro Formulario Iva");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_parametro_formulario_ivaFormularioRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioRenta(this.getformulariorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formulariorenta==null) {
						this.formulariorenta = new FormularioRenta();
					}

					this.setVariablesFormularioToObjetoActualFormularioRenta(this.formulariorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
				}

				if(this.formulariorenta.getid_parametro_formulario_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_parametro_formulario_iva = "+this.formulariorenta.getid_parametro_formulario_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisFormularioRentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebFormularioRenta(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormularioRenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormularioRenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormularioRenta(this.getformulariorenta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.formulariorentaLogic.getConnexion());

				if(this.formulariorenta.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.formulariorenta.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormularioRenta=(TitledBorder)this.jScrollPanelDatosFormularioRenta.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderFormularioRenta.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisFormularioRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioRenta(this.getformulariorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formulariorenta==null) {
						this.formulariorenta = new FormularioRenta();
					}

					this.setVariablesFormularioToObjetoActualFormularioRenta(this.formulariorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
				}

				if(this.formulariorenta.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.formulariorenta.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_pagadoFormularioRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioRenta(this.getformulariorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formulariorenta==null) {
						this.formulariorenta = new FormularioRenta();
					}

					this.setVariablesFormularioToObjetoActualFormularioRenta(this.formulariorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
				}

				if(this.formulariorenta.getvalor_pagado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_pagado = "+this.formulariorenta.getvalor_pagado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonimpuesto_retenidoFormularioRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioRenta(this.getformulariorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formulariorenta==null) {
						this.formulariorenta = new FormularioRenta();
					}

					this.setVariablesFormularioToObjetoActualFormularioRenta(this.formulariorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
				}

				if(this.formulariorenta.getimpuesto_retenido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where impuesto_retenido = "+this.formulariorenta.getimpuesto_retenido().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbase_impornibleFormularioRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioRenta(this.getformulariorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formulariorenta==null) {
						this.formulariorenta = new FormularioRenta();
					}

					this.setVariablesFormularioToObjetoActualFormularioRenta(this.formulariorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);
				}

				if(this.formulariorenta.getbase_impornible()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where base_impornible = "+this.formulariorenta.getbase_impornible().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCuentaContableFormularioRentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormularioRenta(false,false);

			this.getFormularioRentasFK_IdCuentaContable();

			this.inicializarActualizarBindingFormularioRenta(false);

			//if(FormularioRentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormularioRenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdDatoFormularioRentaFormularioRentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormularioRenta(false,false);

			this.getFormularioRentasFK_IdDatoFormularioRenta();

			this.inicializarActualizarBindingFormularioRenta(false);

			//if(FormularioRentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormularioRenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioFormularioRentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormularioRenta(false,false);

			this.getFormularioRentasFK_IdEjercicio();

			this.inicializarActualizarBindingFormularioRenta(false);

			//if(FormularioRentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormularioRenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaFormularioRentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormularioRenta(false,false);

			this.getFormularioRentasFK_IdEmpresa();

			this.inicializarActualizarBindingFormularioRenta(false);

			//if(FormularioRentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormularioRenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisFormularioRentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormularioRenta(false,false);

			this.getFormularioRentasFK_IdPais();

			this.inicializarActualizarBindingFormularioRenta(false);

			//if(FormularioRentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormularioRenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdParametroFormularioIvaFormularioRentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormularioRenta(false,false);

			this.getFormularioRentasFK_IdParametroFormularioIva();

			this.inicializarActualizarBindingFormularioRenta(false);

			//if(FormularioRentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormularioRenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoFormularioRentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormularioRenta(false,false);

			this.getFormularioRentasFK_IdPeriodo();

			this.inicializarActualizarBindingFormularioRenta(false);

			//if(FormularioRentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormularioRenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoRetencionFormularioRentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormularioRenta(false,false);

			this.getFormularioRentasFK_IdTipoRetencion();

			this.inicializarActualizarBindingFormularioRenta(false);

			//if(FormularioRentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormularioRenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameFormularioRenta() {
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
			this.jInternalFrameDetalleFormFormularioRenta.setVisible(false);	    			
			this.jInternalFrameDetalleFormFormularioRenta.dispose();
			this.jInternalFrameDetalleFormFormularioRenta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoFormularioRenta!=null) {
			this.jInternalFrameReporteDinamicoFormularioRenta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoFormularioRenta.dispose();
			this.jInternalFrameReporteDinamicoFormularioRenta=null;
		}
		
		if(this.jInternalFrameImportacionFormularioRenta!=null) {
			this.jInternalFrameImportacionFormularioRenta.setVisible(false);	    			
			this.jInternalFrameImportacionFormularioRenta.dispose();
			this.jInternalFrameImportacionFormularioRenta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessFormularioRenta();
			
			FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
			
			
			if(sTipo.equals("NuevoFormularioRenta")) {
				jButtonNuevoFormularioRentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarFormularioRenta")) {
				jButtonDuplicarFormularioRentaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarFormularioRenta")) {
				jButtonCopiarFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormFormularioRenta")) {
				jButtonVerFormFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarFormularioRenta")) {
				jButtonNuevoFormularioRentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarFormularioRenta")) {
				jButtonDuplicarFormularioRentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoFormularioRenta")) {
				jButtonNuevoFormularioRentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarFormularioRenta")) {
				jButtonDuplicarFormularioRentaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesFormularioRenta")) {
				jButtonNuevoFormularioRentaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarFormularioRenta")) {
				jButtonNuevoFormularioRentaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesFormularioRenta")) {
				jButtonNuevoFormularioRentaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarFormularioRenta")) {
				jButtonModificarFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarFormularioRenta")) {
				jButtonModificarFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarFormularioRenta")) {
				jButtonModificarFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarFormularioRenta")) {
				jButtonActualizarFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarFormularioRenta")) {
				jButtonActualizarFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarFormularioRenta")) {
				jButtonActualizarFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarFormularioRenta")) {
				jButtonEliminarFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarFormularioRenta")) {
				jButtonEliminarFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarFormularioRenta")) {
				jButtonEliminarFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarFormularioRenta")) {
				jButtonCancelarFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarFormularioRenta")) {
				jButtonCancelarFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarFormularioRenta")) {
				jButtonCancelarFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarFormularioRenta")) {
				jButtonCerrarFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarFormularioRenta")) {
				jButtonCerrarFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarFormularioRenta")) {
				jButtonCerrarFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarFormularioRenta")) {
				jButtonMostrarOcultarFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarFormularioRenta")) {
				jButtonCancelarFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosFormularioRenta")) {
				jButtonGuardarCambiosFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarFormularioRenta")) {
				jButtonGuardarCambiosFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarFormularioRenta")) {
				jButtonCopiarFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarFormularioRenta")) {
				jButtonVerFormFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosFormularioRenta")) {
				jButtonGuardarCambiosFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarFormularioRenta")) {
				jButtonCopiarFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormFormularioRenta")) {
				jButtonVerFormFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaFormularioRenta")) {
				jButtonGuardarCambiosFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarFormularioRenta")) {
				jButtonGuardarCambiosFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaFormularioRenta")) {
				jButtonGuardarCambiosFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionFormularioRenta")) {
				jButtonRecargarInformacionFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarFormularioRenta")) {
				jButtonRecargarInformacionFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionFormularioRenta")) {
				jButtonRecargarInformacionFormularioRentaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresFormularioRenta")) {
				jButtonAnterioresFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarFormularioRenta")) {
				jButtonAnterioresFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreFormularioRenta")) {
				jButtonAnterioresFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesFormularioRenta")) {
				jButtonSiguientesFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarFormularioRenta")) {
				jButtonSiguientesFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesFormularioRenta")) {
				jButtonSiguientesFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByFormularioRenta") || sTipo.equals("MenuItemDetalleAbrirOrderByFormularioRenta")) {
				jButtonAbrirOrderByFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarFormularioRenta") || sTipo.equals("MenuItemDetalleMostrarOcultarFormularioRenta")) {
				jButtonMostrarOcultarFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosFormularioRenta")) {
				jButtonNuevoGuardarCambiosFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarFormularioRenta")) {
				jButtonNuevoGuardarCambiosFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosFormularioRenta")) {
				jButtonNuevoGuardarCambiosFormularioRentaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoFormularioRenta")) {
				jButtonCerrarReporteDinamicoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoFormularioRenta")) {
				jButtonGenerarReporteDinamicoFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoFormularioRenta")) {
				
				jButtonGenerarExcelReporteDinamicoFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionFormularioRenta")) {
				jButtonCerrarImportacionFormularioRentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionFormularioRenta")) {
				
				jButtonGenerarImportacionFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionFormularioRenta")) {
				
				jButtonAbrirImportacionFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesFormularioRenta")) {
				jComboBoxTiposAccionesFormularioRentaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesFormularioRenta")) {
				jComboBoxTiposRelacionesFormularioRentaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioFormularioRenta")) {
				jComboBoxTiposAccionesFormularioRentaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarFormularioRenta")) {
				
				jComboBoxTiposSeleccionarFormularioRentaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralFormularioRenta")) {
				jTextFieldValorCampoGeneralFormularioRentaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByFormularioRenta")) {
				jButtonAbrirOrderByFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarFormularioRenta")) {
				jButtonAbrirOrderByFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByFormularioRenta")) {
				jButtonCerrarOrderByFormularioRentaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFormularioRentaBusqueda")) {
				this.jButtonidFormularioRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFormularioRentaUpdate")) {
				this.jButtonid_empresaFormularioRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFormularioRentaBusqueda")) {
				this.jButtonid_empresaFormularioRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioFormularioRentaUpdate")) {
				this.jButtonid_ejercicioFormularioRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioFormularioRentaBusqueda")) {
				this.jButtonid_ejercicioFormularioRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoFormularioRentaUpdate")) {
				this.jButtonid_periodoFormularioRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoFormularioRentaBusqueda")) {
				this.jButtonid_periodoFormularioRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_dato_formulario_rentaFormularioRentaUpdate")) {
				this.jButtonid_dato_formulario_rentaFormularioRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_dato_formulario_rentaFormularioRentaBusqueda")) {
				this.jButtonid_dato_formulario_rentaFormularioRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableFormularioRentaUpdate")) {
				this.jButtonid_cuenta_contableFormularioRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableFormularioRentaBusqueda")) {
				this.jButtonid_cuenta_contableFormularioRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_retencionFormularioRentaUpdate")) {
				this.jButtonid_tipo_retencionFormularioRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_retencionFormularioRentaBusqueda")) {
				this.jButtonid_tipo_retencionFormularioRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_parametro_formulario_ivaFormularioRentaUpdate")) {
				this.jButtonid_parametro_formulario_ivaFormularioRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_parametro_formulario_ivaFormularioRentaBusqueda")) {
				this.jButtonid_parametro_formulario_ivaFormularioRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisFormularioRentaUpdate")) {
				this.jButtonid_paisFormularioRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisFormularioRentaBusqueda")) {
				this.jButtonid_paisFormularioRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_pagadoFormularioRentaBusqueda")) {
				this.jButtonvalor_pagadoFormularioRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("impuesto_retenidoFormularioRentaBusqueda")) {
				this.jButtonimpuesto_retenidoFormularioRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("base_impornibleFormularioRentaBusqueda")) {
				this.jButtonbase_impornibleFormularioRentaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCuentaContableFormularioRenta")) {
				this.jButtonFK_IdCuentaContableFormularioRentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdDatoFormularioRentaFormularioRenta")) {
				this.jButtonFK_IdDatoFormularioRentaFormularioRentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisFormularioRenta")) {
				this.jButtonFK_IdPaisFormularioRentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdParametroFormularioIvaFormularioRenta")) {
				this.jButtonFK_IdParametroFormularioIvaFormularioRentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoRetencionFormularioRenta")) {
				this.jButtonFK_IdTipoRetencionFormularioRentaActionPerformed(evt);
			}
			
			;
			
			
			FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessFormularioRenta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormularioRentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta);
				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
				
				


				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			FormularioRenta formulariorentaLocal=null;
			
			if(!this.getEsControlTabla()) {
				formulariorentaLocal=this.formulariorenta;
			} else {
				formulariorentaLocal=this.formulariorentaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta);
				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
							
				
				


				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaAnterior =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formulariorentaAnterior =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
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
			
			FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
			
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
			
			


			
			FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormularioRentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta);
				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
								
						
				


				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioRenta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta);
				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
								
				
				


				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaAnterior =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formulariorentaAnterior =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaAnterior =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formulariorentaAnterior =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioRentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta);
				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
							
				
				


				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioRenta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormularioRentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorentaAnterior =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.formulariorentaAnterior =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
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
			
			FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
			
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
			
			


			
			FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioRentaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta);
				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
								
				
				


				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaAnterior =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formulariorentaAnterior =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioRentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormularioRentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta);
				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosFormularioRenta")) {
					jCheckBoxSeleccionarTodosFormularioRentaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosFormularioRenta")) {
					jCheckBoxSeleccionadosFormularioRentaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarFormularioRenta")) {
					
				}
				
				


				
				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta);
				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
												
				
				


				
				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormularioRentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorentaAnterior =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.formulariorentaAnterior =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormularioRentaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta);
				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
				
				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
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
			
			FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
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
			
			


			
			FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormularioRentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta);
				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioRenta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioRenta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta);
				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
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
				
				


				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioRenta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorentaAnterior =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formulariorentaAnterior =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarFormularioRenta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosFormularioRentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosFormularioRenta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.formulariorenta =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.formulariorenta =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.formulariorenta);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarFormularioRenta")) {
				
				}
				
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarFormularioRenta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosFormularioRenta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarFormularioRenta")) {
			
			}
			
			FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessFormularioRenta();
			
			FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
			
			if(sTipo.equals("NuevoFormularioRenta")) {
				jButtonNuevoFormularioRentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarFormularioRenta")) {
				jButtonDuplicarFormularioRentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarFormularioRenta")) {
				jButtonCopiarFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormFormularioRenta")) {
				jButtonVerFormFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesFormularioRenta")) {
				jButtonNuevoFormularioRentaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarFormularioRenta")) {
				jButtonModificarFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarFormularioRenta")) {
				jButtonActualizarFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarFormularioRenta")) {
				jButtonEliminarFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaFormularioRenta")) {
				jButtonGuardarCambiosFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarFormularioRenta")) {
				jButtonCancelarFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarFormularioRenta")) {
				jButtonCerrarFormularioRentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosFormularioRenta")) {
				jButtonGuardarCambiosFormularioRentaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosFormularioRenta")) {
				jButtonNuevoGuardarCambiosFormularioRentaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByFormularioRenta")) {
				jButtonAbrirOrderByFormularioRentaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionFormularioRenta")) {
				jButtonRecargarInformacionFormularioRentaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresFormularioRenta")) {
				jButtonAnterioresFormularioRentaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesFormularioRenta")) {
				jButtonSiguientesFormularioRentaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFormularioRentaBusqueda")) {
				this.jButtonidFormularioRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFormularioRentaUpdate")) {
				this.jButtonid_empresaFormularioRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFormularioRentaBusqueda")) {
				this.jButtonid_empresaFormularioRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioFormularioRentaUpdate")) {
				this.jButtonid_ejercicioFormularioRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioFormularioRentaBusqueda")) {
				this.jButtonid_ejercicioFormularioRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoFormularioRentaUpdate")) {
				this.jButtonid_periodoFormularioRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoFormularioRentaBusqueda")) {
				this.jButtonid_periodoFormularioRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_dato_formulario_rentaFormularioRentaUpdate")) {
				this.jButtonid_dato_formulario_rentaFormularioRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_dato_formulario_rentaFormularioRentaBusqueda")) {
				this.jButtonid_dato_formulario_rentaFormularioRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableFormularioRentaUpdate")) {
				this.jButtonid_cuenta_contableFormularioRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableFormularioRentaBusqueda")) {
				this.jButtonid_cuenta_contableFormularioRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_retencionFormularioRentaUpdate")) {
				this.jButtonid_tipo_retencionFormularioRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_retencionFormularioRentaBusqueda")) {
				this.jButtonid_tipo_retencionFormularioRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_parametro_formulario_ivaFormularioRentaUpdate")) {
				this.jButtonid_parametro_formulario_ivaFormularioRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_parametro_formulario_ivaFormularioRentaBusqueda")) {
				this.jButtonid_parametro_formulario_ivaFormularioRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisFormularioRentaUpdate")) {
				this.jButtonid_paisFormularioRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisFormularioRentaBusqueda")) {
				this.jButtonid_paisFormularioRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_pagadoFormularioRentaBusqueda")) {
				this.jButtonvalor_pagadoFormularioRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("impuesto_retenidoFormularioRentaBusqueda")) {
				this.jButtonimpuesto_retenidoFormularioRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("base_impornibleFormularioRentaBusqueda")) {
				this.jButtonbase_impornibleFormularioRentaBusquedaActionPerformed(evt);
			}
			
			FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessFormularioRenta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameFormularioRenta")) {
				closingInternalFrameFormularioRenta();
				
			} else if(sTipo.equals("jButtonCancelarFormularioRenta")) {
				JInternalFrameBase jInternalFrameDetalleFormFormularioRenta = (JInternalFrameBase)evt.getSource();
	            	
	            FormularioRentaBeanSwingJInternalFrame jInternalFrameParent=(FormularioRentaBeanSwingJInternalFrame)jInternalFrameDetalleFormFormularioRenta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarFormularioRentaActionPerformed(null);
			}
			
			FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.formulariorenta,new Object(),this.formulariorentaParameterGeneral,this.formulariorentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormFormularioRenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormFormularioRenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormFormularioRenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.formulariorenta)) {
			if(!esControlTabla) {
				if(FormularioRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualFormularioRenta(this.formulariorenta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);			
				}
				
				if(this.formulariorentaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualFormularioRenta(this.formulariorenta,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.formulariorentaReturnGeneral=formulariorentaLogic.procesarEventosFormularioRentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formulariorentaLogic.getFormularioRentas(),this.formulariorenta,this.formulariorentaParameterGeneral,this.isEsNuevoFormularioRenta,classes);//this.formulariorentaLogic.getFormularioRenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanFormularioRenta(this.formulariorentaReturnGeneral,this.formulariorentaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.formulariorentaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanFormularioRenta(classes,this.formulariorentaReturnGeneral,this.formulariorentaBean,false);
					}
						
					if(this.formulariorentaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyFormularioRenta(this.formulariorentaReturnGeneral.getFormularioRenta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioFormularioRenta(this.formulariorentaReturnGeneral.getFormularioRenta());	
					}
						
					if(this.formulariorentaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioFormularioRenta(this.formulariorentaReturnGeneral.getFormularioRenta(),classes);//this.formulariorentaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioFormularioRenta(this.formulariorenta,classes);//this.formulariorentaBean);									
				}
			
				if(FormularioRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualFormularioRenta(this.formulariorenta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta(this.formulariorenta);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.formulariorentaAnterior!=null) {
						this.formulariorenta=this.formulariorentaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.formulariorentaReturnGeneral=formulariorentaLogic.procesarEventosFormularioRentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formulariorentaLogic.getFormularioRentas(),this.formulariorenta,this.formulariorentaParameterGeneral,this.isEsNuevoFormularioRenta,classes);//this.formulariorentaLogic.getFormularioRenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.formulariorentaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.formulariorentaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.formulariorentaReturnGeneral.getFormularioRenta(),formulariorentaLogic.getFormularioRentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.formulariorentaReturnGeneral.getFormularioRenta(),this.formulariorentas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosFormularioRenta.repaint();
				
				//((AbstractTableModel) this.jTableDatosFormularioRenta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosFormularioRenta();
			}
		}
	}
	
	public void actualizarVisualTableDatosFormularioRenta() throws Exception {
		
		FormularioRentaModel formulariorentaModel=(FormularioRentaModel)this.jTableDatosFormularioRenta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formulariorentaModel.formulariorentas=this.formulariorentaLogic.getFormularioRentas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			formulariorentaModel.formulariorentas=this.formulariorentas;
		}
		
		
		((FormularioRentaModel) this.jTableDatosFormularioRenta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaFormularioRenta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getformulariorentaAnterior(),this.formulariorentaLogic.getFormularioRentas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getformulariorentaAnterior(),this.formulariorentas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosFormularioRenta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioFormularioRenta(FormularioRenta formulariorenta,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
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
										
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formulariorenta,new Object(),generalEntityParameterGeneral,this.formulariorentaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.formulariorentaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=FormularioRentaConstantesFunciones.getClassesRelationshipsOfFormularioRenta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=FormularioRentaConstantesFunciones.getClassesRelationshipsFromStringsOfFormularioRenta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormFormularioRenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				FormularioRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formulariorenta,new Object(),generalEntityParameterGeneral,this.formulariorentaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioFormularioRenta(FormularioRentaBean formulariorentaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanFormularioRenta(ArrayList<Classe> classes,FormularioRentaReturnGeneral formulariorentaReturnGeneral,FormularioRentaBean formulariorentaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualFormularioRenta(FormularioRenta formulariorenta,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.formulariorenta)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormFormularioRenta = new FormularioRentaDetalleFormJInternalFrame(jDesktopPane,this.formulariorentaSessionBean.getConGuardarRelaciones(),this.formulariorentaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.setVisible(false);
		this.jInternalFrameDetalleFormFormularioRenta.setSelected(false);						
		
		this.jInternalFrameDetalleFormFormularioRenta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormFormularioRenta.formulariorentaLogic=this.formulariorentaLogic;
		
		this.cargarCombosFrameForeignKeyFormularioRenta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleFormularioRenta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFormularioRenta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyFormularioRenta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyFormularioRenta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormFormularioRenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFormularioRenta"));
		
		this.jInternalFrameDetalleFormFormularioRenta.jButtonModificarFormularioRenta.addActionListener(new ButtonActionListener(this,"ModificarFormularioRenta"));

		
		this.jInternalFrameDetalleFormFormularioRenta.jButtonModificarToolBarFormularioRenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarFormularioRenta"));
					
		this.jInternalFrameDetalleFormFormularioRenta.jMenuItemModificarFormularioRenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarFormularioRenta"));		
		
		
		
		this.jInternalFrameDetalleFormFormularioRenta.jButtonActualizarFormularioRenta.addActionListener (new ButtonActionListener(this,"ActualizarFormularioRenta"));
		
		
		this.jInternalFrameDetalleFormFormularioRenta.jButtonActualizarToolBarFormularioRenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFormularioRenta"));
						
		this.jInternalFrameDetalleFormFormularioRenta.jMenuItemActualizarFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFormularioRenta"));		
		
		
		
		this.jInternalFrameDetalleFormFormularioRenta.jButtonEliminarFormularioRenta.addActionListener (new ButtonActionListener(this,"EliminarFormularioRenta"));
		
		
		this.jInternalFrameDetalleFormFormularioRenta.jButtonEliminarToolBarFormularioRenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarFormularioRenta"));
								
		this.jInternalFrameDetalleFormFormularioRenta.jMenuItemEliminarFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFormularioRenta"));		
		
		
		
		this.jInternalFrameDetalleFormFormularioRenta.jButtonCancelarFormularioRenta.addActionListener (new ButtonActionListener(this,"CancelarFormularioRenta"));
		
		
		this.jInternalFrameDetalleFormFormularioRenta.jButtonCancelarToolBarFormularioRenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarFormularioRenta"));
					
		this.jInternalFrameDetalleFormFormularioRenta.jMenuItemCancelarFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFormularioRenta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormFormularioRenta.jMenuItemDetalleCerrarFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFormularioRenta"));		
		
		
		
		this.jInternalFrameDetalleFormFormularioRenta.jButtonGuardarCambiosToolBarFormularioRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormularioRenta"));
		
		
		
		this.jInternalFrameDetalleFormFormularioRenta.jButtonGuardarCambiosToolBarFormularioRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormularioRenta"));
		
		
		
		this.jInternalFrameDetalleFormFormularioRenta.jComboBoxTiposAccionesFormularioFormularioRenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFormularioRenta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonidFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"idFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_empresaFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_empresaFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_ejercicioFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_ejercicioFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_periodoFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_periodoFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_periodoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_dato_formulario_rentaFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_dato_formulario_rentaFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_dato_formulario_rentaFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_dato_formulario_rentaFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_cuenta_contableFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_cuenta_contableFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_tipo_retencionFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencionFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_tipo_retencionFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencionFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_parametro_formulario_ivaFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_parametro_formulario_ivaFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_parametro_formulario_ivaFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_parametro_formulario_ivaFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_paisFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_paisFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_paisFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisFormularioRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonvalor_pagadoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"valor_pagadoFormularioRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonimpuesto_retenidoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"impuesto_retenidoFormularioRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonbase_impornibleFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"base_impornibleFormularioRentaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormFormularioRenta.jTabbedPaneRelacionesFormularioRenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFormularioRenta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameFormularioRenta"));
		
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFormularioRenta"));
		}
		
		this.jTableDatosFormularioRenta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarFormularioRenta"));
		
		this.jTableDatosFormularioRenta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarFormularioRenta"));
		
		this.jButtonNuevoFormularioRenta.addActionListener(new ButtonActionListener(this,"NuevoFormularioRenta"));
		
		this.jButtonDuplicarFormularioRenta.addActionListener(new ButtonActionListener(this,"DuplicarFormularioRenta"));
		
		this.jButtonCopiarFormularioRenta.addActionListener(new ButtonActionListener(this,"CopiarFormularioRenta"));
		
		this.jButtonVerFormFormularioRenta.addActionListener(new ButtonActionListener(this,"VerFormFormularioRenta"));
		
		
		this.jButtonNuevoToolBarFormularioRenta.addActionListener(new ButtonActionListener(this,"NuevoToolBarFormularioRenta"));
			
		this.jButtonDuplicarToolBarFormularioRenta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarFormularioRenta"));
			
		this.jMenuItemNuevoFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoFormularioRenta"));
			
		this.jMenuItemDuplicarFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarFormularioRenta"));		
		
		
		this.jButtonNuevoRelacionesFormularioRenta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesFormularioRenta"));
		
		
		this.jButtonNuevoRelacionesToolBarFormularioRenta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarFormularioRenta"));
			
		this.jMenuItemNuevoRelacionesFormularioRenta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesFormularioRenta"));		
		
		
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta.jButtonModificarFormularioRenta.addActionListener(new ButtonActionListener(this,"ModificarFormularioRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta.jButtonModificarToolBarFormularioRenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarFormularioRenta"));
			
			this.jInternalFrameDetalleFormFormularioRenta.jMenuItemModificarFormularioRenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarFormularioRenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormFormularioRenta.jButtonActualizarFormularioRenta.addActionListener (new ButtonActionListener(this,"ActualizarFormularioRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta.jButtonActualizarToolBarFormularioRenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFormularioRenta"));
				
			this.jInternalFrameDetalleFormFormularioRenta.jMenuItemActualizarFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFormularioRenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta.jButtonEliminarFormularioRenta.addActionListener (new ButtonActionListener(this,"EliminarFormularioRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta.jButtonEliminarToolBarFormularioRenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarFormularioRenta"));
						
			this.jInternalFrameDetalleFormFormularioRenta.jMenuItemEliminarFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFormularioRenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta.jButtonCancelarFormularioRenta.addActionListener (new ButtonActionListener(this,"CancelarFormularioRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta.jButtonCancelarToolBarFormularioRenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarFormularioRenta"));
			
			this.jInternalFrameDetalleFormFormularioRenta.jMenuItemCancelarFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFormularioRenta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarFormularioRenta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarFormularioRenta"));		
		
		
		this.jButtonCerrarFormularioRenta.addActionListener (new ButtonActionListener(this,"CerrarFormularioRenta"));
		
		
		this.jButtonCerrarToolBarFormularioRenta.addActionListener (new ButtonActionListener(this,"CerrarToolBarFormularioRenta"));
			
		this.jMenuItemCerrarFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarFormularioRenta"));
			
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta.jMenuItemDetalleCerrarFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFormularioRenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta.jButtonGuardarCambiosFormularioRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosFormularioRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta.jButtonGuardarCambiosToolBarFormularioRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormularioRenta"));
		}
		
		this.jButtonCopiarToolBarFormularioRenta.addActionListener (new ButtonActionListener(this,"CopiarToolBarFormularioRenta"));
			
		this.jButtonVerFormToolBarFormularioRenta.addActionListener (new ButtonActionListener(this,"VerFormToolBarFormularioRenta"));
		
		this.jMenuItemGuardarCambiosFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosFormularioRenta"));
			
		this.jMenuItemCopiarFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarFormularioRenta"));		
		
		this.jMenuItemVerFormFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormFormularioRenta"));		
		
		
		this.jButtonGuardarCambiosTablaFormularioRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFormularioRenta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarFormularioRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarFormularioRenta"));
			
		this.jMenuItemGuardarCambiosTablaFormularioRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFormularioRenta"));		
		
		
		
		this.jButtonRecargarInformacionFormularioRenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionFormularioRenta"));
					
		this.jButtonRecargarInformacionToolBarFormularioRenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarFormularioRenta"));
		
		this.jMenuItemRecargarInformacionFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionFormularioRenta"));		
		
		
		
		this.jButtonAnterioresFormularioRenta.addActionListener (new ButtonActionListener(this,"AnterioresFormularioRenta"));
		
		
		this.jButtonAnterioresToolBarFormularioRenta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarFormularioRenta"));
		
		this.jMenuItemAnterioresFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresFormularioRenta"));		
		
		
		this.jButtonSiguientesFormularioRenta.addActionListener (new ButtonActionListener(this,"SiguientesFormularioRenta"));
		
		
		this.jButtonSiguientesToolBarFormularioRenta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarFormularioRenta"));
			
		this.jMenuItemSiguientesFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesFormularioRenta"));
			
		this.jMenuItemAbrirOrderByFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByFormularioRenta"));
			
		this.jMenuItemMostrarOcultarFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarFormularioRenta"));
			
		this.jMenuItemDetalleAbrirOrderByFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByFormularioRenta"));
			
		this.jMenuItemDetalleMostarOcultarFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarFormularioRenta"));		
		
		
		this.jButtonNuevoGuardarCambiosFormularioRenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosFormularioRenta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarFormularioRenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarFormularioRenta"));
			
		this.jMenuItemNuevoGuardarCambiosFormularioRenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosFormularioRenta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosFormularioRenta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosFormularioRenta"));

		this.jCheckBoxSeleccionadosFormularioRenta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosFormularioRenta"));
		
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta.jComboBoxTiposAccionesFormularioFormularioRenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFormularioRenta"));
		}
		
		
		this.jComboBoxTiposRelacionesFormularioRenta.addActionListener (new ButtonActionListener(this,"TiposRelacionesFormularioRenta"));
			
		this.jComboBoxTiposAccionesFormularioRenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRenta"));
					
		this.jComboBoxTiposSeleccionarFormularioRenta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarFormularioRenta"));
			
		this.jTextFieldValorCampoGeneralFormularioRenta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralFormularioRenta"));		
		
		
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonidFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"idFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_empresaFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_empresaFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_ejercicioFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_ejercicioFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_periodoFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_periodoFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_periodoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_dato_formulario_rentaFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_dato_formulario_rentaFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_dato_formulario_rentaFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_dato_formulario_rentaFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_cuenta_contableFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_cuenta_contableFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_tipo_retencionFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencionFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_tipo_retencionFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencionFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_parametro_formulario_ivaFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_parametro_formulario_ivaFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_parametro_formulario_ivaFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_parametro_formulario_ivaFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_paisFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_paisFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_paisFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisFormularioRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonvalor_pagadoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"valor_pagadoFormularioRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonimpuesto_retenidoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"impuesto_retenidoFormularioRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonbase_impornibleFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"base_impornibleFormularioRentaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCuentaContableFormularioRenta.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableFormularioRenta"));

			this.jButtonFK_IdDatoFormularioRentaFormularioRenta.addActionListener(new ButtonActionListener(this,"FK_IdDatoFormularioRentaFormularioRenta"));

			this.jButtonFK_IdPaisFormularioRenta.addActionListener(new ButtonActionListener(this,"FK_IdPaisFormularioRenta"));

			this.jButtonFK_IdParametroFormularioIvaFormularioRenta.addActionListener(new ButtonActionListener(this,"FK_IdParametroFormularioIvaFormularioRenta"));

			this.jButtonFK_IdTipoRetencionFormularioRenta.addActionListener(new ButtonActionListener(this,"FK_IdTipoRetencionFormularioRenta"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoFormularioRenta!=null) {
				this.jInternalFrameReporteDinamicoFormularioRenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormularioRenta"));
				this.jInternalFrameReporteDinamicoFormularioRenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormularioRenta"));
				this.jInternalFrameReporteDinamicoFormularioRenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormularioRenta"));
			}
			
			//this.jButtonCerrarReporteDinamicoFormularioRenta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormularioRenta"));				
			//this.jButtonGenerarReporteDinamicoFormularioRenta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormularioRenta"));
			//this.jButtonGenerarExcelReporteDinamicoFormularioRenta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormularioRenta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionFormularioRenta!=null) {
				this.jInternalFrameImportacionFormularioRenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFormularioRenta"));
				this.jInternalFrameImportacionFormularioRenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFormularioRenta"));
				this.jInternalFrameImportacionFormularioRenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFormularioRenta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByFormularioRenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByFormularioRenta"));
			
			this.jButtonAbrirOrderByToolBarFormularioRenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarFormularioRenta"));			
			
			if(this.jInternalFrameOrderByFormularioRenta!=null) {
				this.jInternalFrameOrderByFormularioRenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFormularioRenta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta.jTabbedPaneRelacionesFormularioRenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFormularioRenta"));
		
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
            		closingInternalFrameFormularioRenta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormFormularioRenta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormFormularioRenta = (JInternalFrameBase)event.getSource();
	            	
	            FormularioRentaBeanSwingJInternalFrame jInternalFrameParent=(FormularioRentaBeanSwingJInternalFrame)jInternalFrameDetalleFormFormularioRenta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarFormularioRentaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosFormularioRenta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosFormularioRentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosFormularioRenta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosFormularioRenta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormularioRentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormularioRentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormularioRentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoFormularioRenta";
		inputMap = this.jButtonNuevoFormularioRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoFormularioRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFormularioRentaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormularioRentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormularioRentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormularioRentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesFormularioRenta";
		inputMap = this.jButtonNuevoRelacionesFormularioRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesFormularioRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFormularioRentaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarFormularioRenta";
		inputMap = this.jButtonModificarFormularioRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarFormularioRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarFormularioRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarFormularioRenta";
		inputMap = this.jButtonActualizarFormularioRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarFormularioRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarFormularioRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarFormularioRenta";
		inputMap = this.jButtonEliminarFormularioRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarFormularioRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarFormularioRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarFormularioRenta";
		inputMap = this.jButtonCancelarFormularioRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarFormularioRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarFormularioRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarFormularioRenta";
		inputMap = this.jButtonCerrarFormularioRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarFormularioRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarFormularioRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormFormularioRenta.jButtonGuardarCambiosFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosFormularioRenta";
		inputMap = this.jInternalFrameDetalleFormFormularioRenta.jButtonGuardarCambiosFormularioRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormFormularioRenta.jButtonGuardarCambiosFormularioRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosFormularioRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosFormularioRenta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosFormularioRentaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesFormularioRenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesFormularioRentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarFormularioRenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarFormularioRentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralFormularioRenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralFormularioRentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonidFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"idFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_empresaFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_empresaFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_ejercicioFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_ejercicioFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_periodoFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_periodoFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_periodoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_dato_formulario_rentaFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_dato_formulario_rentaFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_dato_formulario_rentaFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_dato_formulario_rentaFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_cuenta_contableFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_cuenta_contableFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_tipo_retencionFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_retencionFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_tipo_retencionFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_retencionFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_parametro_formulario_ivaFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_parametro_formulario_ivaFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_parametro_formulario_ivaFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_parametro_formulario_ivaFormularioRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_paisFormularioRentaUpdate.addActionListener(new ButtonActionListener(this,"id_paisFormularioRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonid_paisFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisFormularioRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonvalor_pagadoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"valor_pagadoFormularioRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonimpuesto_retenidoFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"impuesto_retenidoFormularioRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta.jButtonbase_impornibleFormularioRentaBusqueda.addActionListener(new ButtonActionListener(this,"base_impornibleFormularioRentaBusqueda"));
		
		
		this.jButtonFK_IdCuentaContableFormularioRenta.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableFormularioRenta"));

		this.jButtonFK_IdDatoFormularioRentaFormularioRenta.addActionListener(new ButtonActionListener(this,"FK_IdDatoFormularioRentaFormularioRenta"));

		this.jButtonFK_IdPaisFormularioRenta.addActionListener(new ButtonActionListener(this,"FK_IdPaisFormularioRenta"));

		this.jButtonFK_IdParametroFormularioIvaFormularioRenta.addActionListener(new ButtonActionListener(this,"FK_IdParametroFormularioIvaFormularioRenta"));

		this.jButtonFK_IdTipoRetencionFormularioRenta.addActionListener(new ButtonActionListener(this,"FK_IdTipoRetencionFormularioRenta"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionFormularioRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionFormularioRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarFormularioRentaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarFormularioRenta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosFormularioRenta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(FormularioRenta formulariorentaAux:this.formulariorentaLogic.getFormularioRentas()) {
					formulariorentaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormularioRenta formulariorentaAux:formulariorentas) {
					formulariorentaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosFormularioRentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFormularioRenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FormularioRenta formulariorentaAux:this.formulariorentaLogic.getFormularioRentas()) {
						formulariorentaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormularioRenta formulariorentaAux:formulariorentas) {
						formulariorentaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(FormularioRenta formulariorentaAux:this.formulariorentaLogic.getFormularioRentas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormularioRenta formulariorentaAux:formulariorentas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaFormularioRenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFormularioRenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFormularioRenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosFormularioRentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFormularioRenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosFormularioRenta.getSelectedRows();
			
			FormularioRenta formulariorentaLocal=new FormularioRenta();
			
			//this.seleccionarTodosFormularioRenta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formulariorentaLocal =(FormularioRenta) this.formulariorentaLogic.getFormularioRentas().toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					formulariorentaLocal =(FormularioRenta) this.formulariorentas.toArray()[this.jTableDatosFormularioRenta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				formulariorentaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FormularioRenta formulariorentaAux:this.formulariorentaLogic.getFormularioRentas()) {
						formulariorentaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormularioRenta formulariorentaAux:formulariorentas) {
						formulariorentaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaFormularioRenta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFormularioRenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFormularioRenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualFormularioRentaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarFormularioRentaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralFormularioRentaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingFormularioRenta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralFormularioRenta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FormularioRenta formulariorentaAux:this.formulariorentaLogic.getFormularioRentas()) {
				
						if(sTipoSeleccionar.equals(FormularioRentaConstantesFunciones.LABEL_VALORPAGADO)) {
							existe=true;
							formulariorentaAux.setvalor_pagado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FormularioRentaConstantesFunciones.LABEL_IMPUESTORETENIDO)) {
							existe=true;
							formulariorentaAux.setimpuesto_retenido(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FormularioRentaConstantesFunciones.LABEL_BASEIMPORNIBLE)) {
							existe=true;
							formulariorentaAux.setbase_impornible(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormularioRenta formulariorentaAux:formulariorentas) {
					
						if(sTipoSeleccionar.equals(FormularioRentaConstantesFunciones.LABEL_VALORPAGADO)) {
							existe=true;
							formulariorentaAux.setvalor_pagado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FormularioRentaConstantesFunciones.LABEL_IMPUESTORETENIDO)) {
							existe=true;
							formulariorentaAux.setimpuesto_retenido(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FormularioRentaConstantesFunciones.LABEL_BASEIMPORNIBLE)) {
							existe=true;
							formulariorentaAux.setbase_impornible(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaFormularioRenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesFormularioRentaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingFormularioRenta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioFormularioRenta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesFormularioRenta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormFormularioRenta.jComboBoxTiposAccionesFormularioFormularioRenta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteFormularioRenta) {				
					conSplash=true;//false;										
					
					//this.startProcessFormularioRenta(conSplash);
				
					this.generarReporteFormularioRentasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormularioRenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormularioRenta.jComboBoxTiposAccionesFormularioFormularioRenta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoFormularioRentasSeleccionados();
				//this.jComboBoxTiposAccionesFormularioRenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFormularioRentasSeleccionados(false);
				//this.jComboBoxTiposAccionesFormularioRenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFormularioRentasSeleccionados(true);
				//this.jComboBoxTiposAccionesFormularioRenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFormularioRenta();
				
				this.exportarFormularioRentasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormularioRenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormularioRenta.jComboBoxTiposAccionesFormularioFormularioRenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionFormularioRentas();
				//this.importarFormularioRentas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormularioRenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormularioRenta.jComboBoxTiposAccionesFormularioFormularioRenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFormularioRenta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelFormularioRentasSeleccionados();
				//this.jComboBoxTiposAccionesFormularioRenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Formulario Renta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessFormularioRenta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoFormularioRenta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyFormularioRenta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Formulario Renta",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormularioRenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormularioRenta.jComboBoxTiposAccionesFormularioFormularioRenta.setSelectedIndex(0);					
				}	
			} 			
			else if(FormularioRentaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteFormularioRenta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessFormularioRenta(conSplash);
					
						//this.actualizarParametrosGeneralFormularioRenta();
						
						this.generarReporteProcesoAccionFormularioRentasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesFormularioRenta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormFormularioRenta.jComboBoxTiposAccionesFormularioFormularioRenta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(FormularioRentaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Formulario RentaS SELECCIONADOS?", "MANTENIMIENTO DE Formulario Renta", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessFormularioRenta();
				
						this.actualizarParametrosGeneralFormularioRenta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.formulariorentaReturnGeneral=formulariorentaLogic.procesarAccionFormularioRentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.formulariorentaLogic.getFormularioRentas(),this.formulariorentaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarFormularioRentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFormularioRenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFormularioRenta.jComboBoxTiposAccionesFormularioFormularioRenta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralFormularioRenta();
					
					FormularioRentaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarFormularioRentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFormularioRenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFormularioRenta.jComboBoxTiposAccionesFormularioFormularioRenta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessFormularioRenta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesFormularioRentaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessFormularioRenta();
			
			if(this.jInternalFrameDetalleFormFormularioRenta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<FormularioRenta> formulariorentasSeleccionados=new ArrayList<FormularioRenta>();		
			FormularioRenta formulariorenta=new FormularioRenta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingFormularioRenta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesFormularioRenta.getSelectedItem();
			
			
			
			
			formulariorentasSeleccionados=this.getFormularioRentasSeleccionados(true);
			//this.sTipoAccion;
			
			if(formulariorentasSeleccionados.size()==1) {
				for(FormularioRenta formulariorentaAux:formulariorentasSeleccionados) {
					formulariorenta=formulariorentaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessFormularioRenta();
			
      		//this.finishProcessFormularioRenta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarFormularioRentaReturnGeneral() throws Exception {
		if(this.formulariorentaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.formulariorentaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.formulariorentaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.formulariorentaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.formulariorentaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.formulariorentaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingFormularioRenta(false);
		}
		
		if(this.formulariorentaReturnGeneral.getConRetornoLista() || this.formulariorentaReturnGeneral.getConRetornoObjeto()) {
			if(this.formulariorentaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.formulariorentaLogic.setFormularioRentas(this.formulariorentaReturnGeneral.getFormularioRentas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.formulariorentaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.formulariorentaLogic.setFormularioRenta(this.formulariorentaReturnGeneral.getFormularioRenta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingFormularioRenta(false);
		}
	}
	
	public void actualizarParametrosGeneralFormularioRenta() throws Exception {
		
		
	}
	
	public ArrayList<FormularioRenta> getFormularioRentasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<FormularioRenta> formulariorentasSeleccionados=new ArrayList<FormularioRenta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioFormularioRenta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(FormularioRenta formulariorentaAux:formulariorentaLogic.getFormularioRentas()) {
					if(formulariorentaAux.getIsSelected()) {
						formulariorentasSeleccionados.add(formulariorentaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormularioRenta formulariorentaAux:this.formulariorentas) {
					if(formulariorentaAux.getIsSelected()) {
						formulariorentasSeleccionados.add(formulariorentaAux);				
					}
				}
			}
			
			if(formulariorentasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						formulariorentasSeleccionados.addAll(this.formulariorentaLogic.getFormularioRentas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						formulariorentasSeleccionados.addAll(this.formulariorentas);				
					}
				}
			}
		} else {
			formulariorentasSeleccionados.add(this.formulariorenta);
		}
		
		return formulariorentasSeleccionados;
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
	
	public void generarReporteFormularioRentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalFormularioRentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoFormularioRentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFormularioRentasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFormularioRentasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Formulario Renta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesFormularioRentasSeleccionados() throws Exception {
		ArrayList<FormularioRenta> formulariorentasSeleccionados=new ArrayList<FormularioRenta>();		
		
		formulariorentasSeleccionados=this.getFormularioRentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteFormularioRentas("Todos",formulariorentasSeleccionados);
		
	}	
	
	public void generarReporteNormalFormularioRentasSeleccionados() throws Exception {
		ArrayList<FormularioRenta> formulariorentasSeleccionados=new ArrayList<FormularioRenta>();		
		
		formulariorentasSeleccionados=this.getFormularioRentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteFormularioRentas("Todos",formulariorentasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionFormularioRentasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<FormularioRenta> formulariorentasSeleccionados=new ArrayList<FormularioRenta>();
		
		formulariorentasSeleccionados=this.getFormularioRentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteFormularioRentas("Todos",formulariorentasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoFormularioRentasSeleccionados() throws Exception {
		ArrayList<FormularioRenta> formulariorentasSeleccionados=new ArrayList<FormularioRenta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoFormularioRenta();
		
		
		formulariorentasSeleccionados=this.getFormularioRentasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoFormularioRenta();
		
		
		//this.generarReporteFormularioRentas("Todos",formulariorentasSeleccionados ,formulariorentaImplementable,formulariorentaImplementableHome);
	}
	
	public void mostrarImportacionFormularioRentas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionFormularioRenta();
		
		this.abrirFrameImportacionFormularioRenta();		
		
			
		//this.generarReporteFormularioRentas("Todos",formulariorentasSeleccionados ,formulariorentaImplementable,formulariorentaImplementableHome);
	}
	
	public void importarFormularioRentas() throws Exception {		
	
	}
	
	public void exportarFormularioRentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelFormularioRentasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoFormularioRentasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlFormularioRentasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Formulario Renta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoFormularioRentasSeleccionados() throws Exception {
		ArrayList<FormularioRenta> formulariorentasSeleccionados=new ArrayList<FormularioRenta>();		
		
		formulariorentasSeleccionados=this.getFormularioRentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formulariorenta."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarFormularioRenta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(FormularioRenta formulariorentaAux:formulariorentasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarFormularioRenta(formulariorentaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//formulariorentaAux.setsDetalleGeneralEntityReporte(formulariorentaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulariorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Renta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarFormularioRenta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=FormularioRentaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioRentaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioRentaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioRentaConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioRentaConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioRentaConstantesFunciones.LABEL_IDDATOFORMULARIORENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioRentaConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioRentaConstantesFunciones.LABEL_IDTIPORETENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioRentaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioRentaConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioRentaConstantesFunciones.LABEL_VALORPAGADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioRentaConstantesFunciones.LABEL_IMPUESTORETENIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioRentaConstantesFunciones.LABEL_BASEIMPORNIBLE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarFormularioRenta(FormularioRenta formulariorenta,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=formulariorenta.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=formulariorenta.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=formulariorenta.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formulariorenta.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formulariorenta.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formulariorenta.getdatoformulariorenta_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formulariorenta.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formulariorenta.gettiporetencion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formulariorenta.getparametroformularioiva_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formulariorenta.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formulariorenta.getvalor_pagado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formulariorenta.getimpuesto_retenido().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formulariorenta.getbase_impornible().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelFormularioRentasSeleccionados() throws Exception {
		ArrayList<FormularioRenta> formulariorentasSeleccionados=new ArrayList<FormularioRenta>();		
		
		formulariorentasSeleccionados=this.getFormularioRentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formulariorenta.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("FormularioRentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelFormularioRenta(row);				
				iRow++;
			}				
			
			for(FormularioRenta formulariorentaAux:formulariorentasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelFormularioRenta(formulariorentaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulariorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Renta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlFormularioRentasSeleccionados() throws Exception {
		ArrayList<FormularioRenta> formulariorentasSeleccionados=new ArrayList<FormularioRenta>();		
		
		formulariorentasSeleccionados=this.getFormularioRentasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formulariorenta.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("formulariorentas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("formulariorenta");
			//elementRoot.appendChild(element);
		
			for(FormularioRenta formulariorentaAux:formulariorentasSeleccionados) {
				element = document.createElement("formulariorenta");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlFormularioRenta(formulariorentaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulariorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Renta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelFormularioRenta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDDATOFORMULARIORENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDTIPORETENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_VALORPAGADO);
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_IMPUESTORETENIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioRentaConstantesFunciones.LABEL_BASEIMPORNIBLE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelFormularioRenta(FormularioRenta formulariorenta,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(formulariorenta.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(formulariorenta.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formulariorenta.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formulariorenta.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formulariorenta.getdatoformulariorenta_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formulariorenta.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formulariorenta.gettiporetencion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formulariorenta.getparametroformularioiva_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formulariorenta.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formulariorenta.getvalor_pagado());
		cell = row.createCell(iColumn++);cell.setCellValue(formulariorenta.getimpuesto_retenido());
		cell = row.createCell(iColumn++);cell.setCellValue(formulariorenta.getbase_impornible());				
	}
	
	public void setFilaDatosExportarXmlFormularioRenta(FormularioRenta formulariorenta,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(FormularioRentaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(formulariorenta.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(FormularioRentaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(formulariorenta.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(FormularioRentaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(formulariorenta.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementejercicio_descripcion = document.createElement(FormularioRentaConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(formulariorenta.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(FormularioRentaConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(formulariorenta.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementdatoformulariorenta_descripcion = document.createElement(FormularioRentaConstantesFunciones.IDDATOFORMULARIORENTA);
		elementdatoformulariorenta_descripcion.appendChild(document.createTextNode(formulariorenta.getdatoformulariorenta_descripcion()));
		element.appendChild(elementdatoformulariorenta_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(FormularioRentaConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(formulariorenta.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementtiporetencion_descripcion = document.createElement(FormularioRentaConstantesFunciones.IDTIPORETENCION);
		elementtiporetencion_descripcion.appendChild(document.createTextNode(formulariorenta.gettiporetencion_descripcion()));
		element.appendChild(elementtiporetencion_descripcion);

		Element elementparametroformularioiva_descripcion = document.createElement(FormularioRentaConstantesFunciones.IDPARAMETROFORMULARIOIVA);
		elementparametroformularioiva_descripcion.appendChild(document.createTextNode(formulariorenta.getparametroformularioiva_descripcion()));
		element.appendChild(elementparametroformularioiva_descripcion);

		Element elementpais_descripcion = document.createElement(FormularioRentaConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(formulariorenta.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementvalor_pagado = document.createElement(FormularioRentaConstantesFunciones.VALORPAGADO);
		elementvalor_pagado.appendChild(document.createTextNode(formulariorenta.getvalor_pagado().toString().trim()));
		element.appendChild(elementvalor_pagado);

		Element elementimpuesto_retenido = document.createElement(FormularioRentaConstantesFunciones.IMPUESTORETENIDO);
		elementimpuesto_retenido.appendChild(document.createTextNode(formulariorenta.getimpuesto_retenido().toString().trim()));
		element.appendChild(elementimpuesto_retenido);

		Element elementbase_impornible = document.createElement(FormularioRentaConstantesFunciones.BASEIMPORNIBLE);
		elementbase_impornible.appendChild(document.createTextNode(formulariorenta.getbase_impornible().toString().trim()));
		element.appendChild(elementbase_impornible);
	}
	
	public void generarReporteGroupGenericoFormularioRentasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<FormularioRenta> formulariorentasSeleccionados=new ArrayList<FormularioRenta>();
		
		formulariorentasSeleccionados=this.getFormularioRentasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoFormularioRenta(formulariorentasSeleccionados);
		
		this.generarReporteFormularioRentas("Todos",formulariorentasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoFormularioRenta(ArrayList<FormularioRenta> formulariorentasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(FormularioRenta formulariorentaAux:formulariorentasSeleccionados) {
				formulariorentaAux.setsDetalleGeneralEntityReporte(formulariorentaAux.toString());
			
				if(sTipoSeleccionar.equals(FormularioRentaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					formulariorentaAux.setsDescripcionGeneralEntityReporte1(formulariorentaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormularioRentaConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					formulariorentaAux.setsDescripcionGeneralEntityReporte1(formulariorentaAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormularioRentaConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					formulariorentaAux.setsDescripcionGeneralEntityReporte1(formulariorentaAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormularioRentaConstantesFunciones.LABEL_IDDATOFORMULARIORENTA)) {
					existe=true;
					formulariorentaAux.setsDescripcionGeneralEntityReporte1(formulariorentaAux.getdatoformulariorenta_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormularioRentaConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					formulariorentaAux.setsDescripcionGeneralEntityReporte1(formulariorentaAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormularioRentaConstantesFunciones.LABEL_IDTIPORETENCION)) {
					existe=true;
					formulariorentaAux.setsDescripcionGeneralEntityReporte1(formulariorentaAux.gettiporetencion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormularioRentaConstantesFunciones.LABEL_IDPARAMETROFORMULARIOIVA)) {
					existe=true;
					formulariorentaAux.setsDescripcionGeneralEntityReporte1(formulariorentaAux.getparametroformularioiva_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormularioRentaConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					formulariorentaAux.setsDescripcionGeneralEntityReporte1(formulariorentaAux.getpais_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesFormularioRenta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoFormularioRenta=true;
				this.isVisibilidadCeldaNuevoRelacionesFormularioRenta=true;
				this.isVisibilidadCeldaGuardarCambiosFormularioRenta=true;
			}
			
			this.isVisibilidadCeldaModificarFormularioRenta=false;
			this.isVisibilidadCeldaActualizarFormularioRenta=false;
			this.isVisibilidadCeldaEliminarFormularioRenta=false;
			this.isVisibilidadCeldaCancelarFormularioRenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormularioRenta=true;
				} else {
					this.isVisibilidadCeldaGuardarFormularioRenta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoFormularioRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta=false;
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta=false;
			this.isVisibilidadCeldaModificarFormularioRenta=false;
			this.isVisibilidadCeldaActualizarFormularioRenta=true;
			this.isVisibilidadCeldaEliminarFormularioRenta=false;
			this.isVisibilidadCeldaCancelarFormularioRenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormularioRenta=true;
				} else {
					this.isVisibilidadCeldaGuardarFormularioRenta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoFormularioRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta=false;
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta=false;
			this.isVisibilidadCeldaModificarFormularioRenta=false;
			this.isVisibilidadCeldaActualizarFormularioRenta=true;
			this.isVisibilidadCeldaEliminarFormularioRenta=true;
			this.isVisibilidadCeldaCancelarFormularioRenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormularioRenta=true;
				} else {
					this.isVisibilidadCeldaGuardarFormularioRenta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoFormularioRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta=false;
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta=false;
			this.isVisibilidadCeldaModificarFormularioRenta=false;
			this.isVisibilidadCeldaActualizarFormularioRenta=true;
			this.isVisibilidadCeldaEliminarFormularioRenta=false;
			this.isVisibilidadCeldaCancelarFormularioRenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormularioRenta=false;
				} else {
					this.isVisibilidadCeldaGuardarFormularioRenta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoFormularioRenta=true;
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta=true;
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta=true;
			this.isVisibilidadCeldaModificarFormularioRenta=false;
			this.isVisibilidadCeldaActualizarFormularioRenta=false;
			this.isVisibilidadCeldaEliminarFormularioRenta=false;
			this.isVisibilidadCeldaCancelarFormularioRenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormularioRenta=true;
				} else {
					this.isVisibilidadCeldaGuardarFormularioRenta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoFormularioRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta=false;
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta=false;
			this.isVisibilidadCeldaActualizarFormularioRenta=false;
			this.isVisibilidadCeldaEliminarFormularioRenta=false;
			this.isVisibilidadCeldaCancelarFormularioRenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormularioRenta=false;
				} else {
					this.isVisibilidadCeldaGuardarFormularioRenta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoFormularioRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta=false;
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta=false;
			this.isVisibilidadCeldaModificarFormularioRenta=true;
			this.isVisibilidadCeldaActualizarFormularioRenta=false;
			this.isVisibilidadCeldaEliminarFormularioRenta=false;
			this.isVisibilidadCeldaCancelarFormularioRenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormularioRenta=false;
				} else {
					this.isVisibilidadCeldaGuardarFormularioRenta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(FormularioRentaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoFormularioRenta=true;
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta=true;
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta=true;
		} else {
			this.actualizarEstadoPanelsFormularioRenta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarFormularioRenta=false;
			//this.isVisibilidadCeldaVerFormFormularioRenta=false;
			this.isVisibilidadCeldaDuplicarFormularioRenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!formulariorentaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta=false;
		} else {
			this.isVisibilidadCeldaNuevoFormularioRenta=false;
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(formulariorentaSessionBean.getEsGuardarRelacionado()) {
			if(!formulariorentaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesFormularioRenta=false;												
			}
			
			this.jButtonCerrarFormularioRenta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta=false;
		}
		
		if(!this.permiteMantenimiento(this.formulariorenta)) {
			this.isVisibilidadCeldaActualizarFormularioRenta=false;
			this.isVisibilidadCeldaEliminarFormularioRenta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesFormularioRenta() {
	}
	
	public void actualizarEstadoPanelsFormularioRenta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionFormularioRenta!=null) {
				this.jScrollPanelDatosEdicionFormularioRenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioRenta!=null) {
				this.jTabbedPaneBusquedasFormularioRenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormularioRenta!=null) {
				this.jScrollPanelDatosFormularioRenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormularioRenta!=null) {
				this.jPanelPaginacionFormularioRenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormularioRenta!=null) {
				this.jPanelParametrosReportesFormularioRenta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionFormularioRenta!=null) {
				this.jScrollPanelDatosEdicionFormularioRenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioRenta!=null) {
				this.jTabbedPaneBusquedasFormularioRenta.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosFormularioRenta!=null) {
				this.jScrollPanelDatosFormularioRenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormularioRenta!=null) {
				this.jPanelPaginacionFormularioRenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormularioRenta!=null) {
				this.jPanelParametrosReportesFormularioRenta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionFormularioRenta!=null) {
				this.jScrollPanelDatosEdicionFormularioRenta.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioRenta!=null) {
				this.jTabbedPaneBusquedasFormularioRenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFormularioRenta!=null) {
				this.jScrollPanelDatosFormularioRenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormularioRenta!=null) {
				this.jPanelPaginacionFormularioRenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormularioRenta!=null) {
				this.jPanelParametrosReportesFormularioRenta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionFormularioRenta!=null) {
				this.jScrollPanelDatosEdicionFormularioRenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioRenta!=null) {
				this.jTabbedPaneBusquedasFormularioRenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFormularioRenta!=null) {
				this.jScrollPanelDatosFormularioRenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormularioRenta!=null) {
				this.jPanelPaginacionFormularioRenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormularioRenta!=null) {
				this.jPanelParametrosReportesFormularioRenta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionFormularioRenta!=null) {
				this.jScrollPanelDatosEdicionFormularioRenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioRenta!=null) {
				this.jTabbedPaneBusquedasFormularioRenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormularioRenta!=null) {
				this.jScrollPanelDatosFormularioRenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormularioRenta!=null) {
				this.jPanelPaginacionFormularioRenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormularioRenta!=null) {
				this.jPanelParametrosReportesFormularioRenta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionFormularioRenta!=null) {
				this.jScrollPanelDatosEdicionFormularioRenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioRenta!=null) {
				this.jTabbedPaneBusquedasFormularioRenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormularioRenta!=null) {
				this.jScrollPanelDatosFormularioRenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormularioRenta!=null) {
				this.jPanelPaginacionFormularioRenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormularioRenta!=null) {
				this.jPanelParametrosReportesFormularioRenta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionFormularioRenta!=null) {
				this.jScrollPanelDatosEdicionFormularioRenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioRenta!=null) {
				this.jTabbedPaneBusquedasFormularioRenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormularioRenta!=null) {
				this.jScrollPanelDatosFormularioRenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormularioRenta!=null) {
				this.jPanelPaginacionFormularioRenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormularioRenta!=null) {
				this.jPanelParametrosReportesFormularioRenta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasFormularioRenta!=null) {
					this.jTabbedPaneBusquedasFormularioRenta.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesFormularioRenta!=null) {
				this.jPanelParametrosReportesFormularioRenta.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioRenta!=null) {
				this.jTabbedPaneBusquedasFormularioRenta.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesFormularioRenta!=null) {
				this.jPanelParametrosReportesFormularioRenta.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCuentaContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdCuentaContableFormularioRenta);}

			this.isVisibilidadFK_IdDatoFormularioRenta=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdDatoFormularioRenta) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdDatoFormularioRentaFormularioRenta);}

			this.isVisibilidadFK_IdPais=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdPaisFormularioRenta);}

			this.isVisibilidadFK_IdParametroFormularioIva=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdParametroFormularioIva) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdParametroFormularioIvaFormularioRenta);}

			this.isVisibilidadFK_IdTipoRetencion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdTipoRetencionFormularioRenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdCuentaContable=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdCuentaContableFormularioRenta);}

			this.isVisibilidadFK_IdDatoFormularioRenta=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdDatoFormularioRenta) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdDatoFormularioRentaFormularioRenta);}

			this.isVisibilidadFK_IdPais=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdPaisFormularioRenta);}

			this.isVisibilidadFK_IdParametroFormularioIva=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdParametroFormularioIva) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdParametroFormularioIvaFormularioRenta);}

			this.isVisibilidadFK_IdTipoRetencion=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdTipoRetencionFormularioRenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdCuentaContable=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdCuentaContableFormularioRenta);}

			this.isVisibilidadFK_IdDatoFormularioRenta=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdDatoFormularioRenta) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdDatoFormularioRentaFormularioRenta);}

			this.isVisibilidadFK_IdPais=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdPaisFormularioRenta);}

			this.isVisibilidadFK_IdParametroFormularioIva=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdParametroFormularioIva) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdParametroFormularioIvaFormularioRenta);}

			this.isVisibilidadFK_IdTipoRetencion=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdTipoRetencionFormularioRenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaDatoFormularioRenta(Boolean isParaDatoFormularioRenta){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaDatoFormularioRentaNegation=!isParaDatoFormularioRenta;

			this.isVisibilidadFK_IdCuentaContable=isParaDatoFormularioRentaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdCuentaContableFormularioRenta);}

			this.isVisibilidadFK_IdDatoFormularioRenta=isParaDatoFormularioRenta;
			if(!this.isVisibilidadFK_IdDatoFormularioRenta) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdDatoFormularioRentaFormularioRenta);}

			this.isVisibilidadFK_IdPais=isParaDatoFormularioRentaNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdPaisFormularioRenta);}

			this.isVisibilidadFK_IdParametroFormularioIva=isParaDatoFormularioRentaNegation;
			if(!this.isVisibilidadFK_IdParametroFormularioIva) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdParametroFormularioIvaFormularioRenta);}

			this.isVisibilidadFK_IdTipoRetencion=isParaDatoFormularioRentaNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdTipoRetencionFormularioRenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdCuentaContableFormularioRenta);}

			this.isVisibilidadFK_IdDatoFormularioRenta=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdDatoFormularioRenta) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdDatoFormularioRentaFormularioRenta);}

			this.isVisibilidadFK_IdPais=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdPaisFormularioRenta);}

			this.isVisibilidadFK_IdParametroFormularioIva=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdParametroFormularioIva) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdParametroFormularioIvaFormularioRenta);}

			this.isVisibilidadFK_IdTipoRetencion=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdTipoRetencionFormularioRenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoRetencion(Boolean isParaTipoRetencion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoRetencionNegation=!isParaTipoRetencion;

			this.isVisibilidadFK_IdCuentaContable=isParaTipoRetencionNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdCuentaContableFormularioRenta);}

			this.isVisibilidadFK_IdDatoFormularioRenta=isParaTipoRetencionNegation;
			if(!this.isVisibilidadFK_IdDatoFormularioRenta) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdDatoFormularioRentaFormularioRenta);}

			this.isVisibilidadFK_IdPais=isParaTipoRetencionNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdPaisFormularioRenta);}

			this.isVisibilidadFK_IdParametroFormularioIva=isParaTipoRetencionNegation;
			if(!this.isVisibilidadFK_IdParametroFormularioIva) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdParametroFormularioIvaFormularioRenta);}

			this.isVisibilidadFK_IdTipoRetencion=isParaTipoRetencion;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdTipoRetencionFormularioRenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaParametroFormularioIva(Boolean isParaParametroFormularioIva){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaParametroFormularioIvaNegation=!isParaParametroFormularioIva;

			this.isVisibilidadFK_IdCuentaContable=isParaParametroFormularioIvaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdCuentaContableFormularioRenta);}

			this.isVisibilidadFK_IdDatoFormularioRenta=isParaParametroFormularioIvaNegation;
			if(!this.isVisibilidadFK_IdDatoFormularioRenta) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdDatoFormularioRentaFormularioRenta);}

			this.isVisibilidadFK_IdPais=isParaParametroFormularioIvaNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdPaisFormularioRenta);}

			this.isVisibilidadFK_IdParametroFormularioIva=isParaParametroFormularioIva;
			if(!this.isVisibilidadFK_IdParametroFormularioIva) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdParametroFormularioIvaFormularioRenta);}

			this.isVisibilidadFK_IdTipoRetencion=isParaParametroFormularioIvaNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdTipoRetencionFormularioRenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadFK_IdCuentaContable=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdCuentaContableFormularioRenta);}

			this.isVisibilidadFK_IdDatoFormularioRenta=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdDatoFormularioRenta) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdDatoFormularioRentaFormularioRenta);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdPaisFormularioRenta);}

			this.isVisibilidadFK_IdParametroFormularioIva=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdParametroFormularioIva) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdParametroFormularioIvaFormularioRenta);}

			this.isVisibilidadFK_IdTipoRetencion=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdTipoRetencion) {this.jTabbedPaneBusquedasFormularioRenta.remove(jPanelFK_IdTipoRetencionFormularioRenta);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//FormularioRentaSessionBean formulariorentaSessionBean=new FormularioRentaSessionBean();
		
		if(this.formulariorentaSessionBean==null) {
			this.formulariorentaSessionBean=new FormularioRentaSessionBean();
		}
		
		this.formulariorentaSessionBean.setsUltimaBusquedaFormularioRenta(this.getsAccionBusqueda());
		this.formulariorentaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.formulariorentaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			formulariorentaSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdDatoFormularioRenta")) {
			formulariorentaSessionBean.setid_dato_formulario_renta(this.getid_dato_formulario_rentaFK_IdDatoFormularioRenta());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			formulariorentaSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			formulariorentaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			formulariorentaSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdParametroFormularioIva")) {
			formulariorentaSessionBean.setid_parametro_formulario_iva(this.getid_parametro_formulario_ivaFK_IdParametroFormularioIva());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			formulariorentaSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoRetencion")) {
			formulariorentaSessionBean.setid_tipo_retencion(this.getid_tipo_retencionFK_IdTipoRetencion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//FormularioRentaSessionBean formulariorentaSessionBean=new FormularioRentaSessionBean();
		
		if(this.formulariorentaSessionBean==null) {
			this.formulariorentaSessionBean=new FormularioRentaSessionBean();
		}
		
		if(this.formulariorentaSessionBean.getsUltimaBusquedaFormularioRenta()!=null&&!this.formulariorentaSessionBean.getsUltimaBusquedaFormularioRenta().equals("")) {
			this.setsAccionBusqueda(formulariorentaSessionBean.getsUltimaBusquedaFormularioRenta());
			this.setiNumeroPaginacion(formulariorentaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(formulariorentaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(formulariorentaSessionBean.getid_cuenta_contable());
				formulariorentaSessionBean.setid_cuenta_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdDatoFormularioRenta")) {
				this.setid_dato_formulario_rentaFK_IdDatoFormularioRenta(formulariorentaSessionBean.getid_dato_formulario_renta());
				formulariorentaSessionBean.setid_dato_formulario_renta(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(formulariorentaSessionBean.getid_ejercicio());
				formulariorentaSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(formulariorentaSessionBean.getid_empresa());
				formulariorentaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(formulariorentaSessionBean.getid_pais());
				formulariorentaSessionBean.setid_pais(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdParametroFormularioIva")) {
				this.setid_parametro_formulario_ivaFK_IdParametroFormularioIva(formulariorentaSessionBean.getid_parametro_formulario_iva());
				formulariorentaSessionBean.setid_parametro_formulario_iva(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(formulariorentaSessionBean.getid_periodo());
				formulariorentaSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoRetencion")) {
				this.setid_tipo_retencionFK_IdTipoRetencion(formulariorentaSessionBean.getid_tipo_retencion());
				formulariorentaSessionBean.setid_tipo_retencion(-1L);
			}
		}
		
		this.formulariorentaSessionBean.setsUltimaBusquedaFormularioRenta("");
		this.formulariorentaSessionBean.setiNumeroPaginacion(FormularioRentaConstantesFunciones.INUMEROPAGINACION);
		this.formulariorentaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaFormularioRenta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioFormularioRenta() {
		this.updateBorderResaltarBusquedasFormularioFormularioRenta();
		this.updateVisibilidadBusquedasFormularioFormularioRenta();
		this.updateHabilitarBusquedasFormularioFormularioRenta();
	}
	
	public void updateBorderResaltarBusquedasFormularioFormularioRenta() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasFormularioRenta.getComponents().length>0) {
	

		if(this.formulariorentaConstantesFunciones.resaltarFK_IdCuentaContableFormularioRenta!=null) {
			index= this.jTabbedPaneBusquedasFormularioRenta.indexOfComponent(this.jPanelFK_IdCuentaContableFormularioRenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta.getComponent(index);
				jPanel.setBorder(this.formulariorentaConstantesFunciones.resaltarFK_IdCuentaContableFormularioRenta);
			}
		}

		if(this.formulariorentaConstantesFunciones.resaltarFK_IdDatoFormularioRentaFormularioRenta!=null) {
			index= this.jTabbedPaneBusquedasFormularioRenta.indexOfComponent(this.jPanelFK_IdDatoFormularioRentaFormularioRenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta.getComponent(index);
				jPanel.setBorder(this.formulariorentaConstantesFunciones.resaltarFK_IdDatoFormularioRentaFormularioRenta);
			}
		}

		if(this.formulariorentaConstantesFunciones.resaltarFK_IdPaisFormularioRenta!=null) {
			index= this.jTabbedPaneBusquedasFormularioRenta.indexOfComponent(this.jPanelFK_IdPaisFormularioRenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta.getComponent(index);
				jPanel.setBorder(this.formulariorentaConstantesFunciones.resaltarFK_IdPaisFormularioRenta);
			}
		}

		if(this.formulariorentaConstantesFunciones.resaltarFK_IdParametroFormularioIvaFormularioRenta!=null) {
			index= this.jTabbedPaneBusquedasFormularioRenta.indexOfComponent(this.jPanelFK_IdParametroFormularioIvaFormularioRenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta.getComponent(index);
				jPanel.setBorder(this.formulariorentaConstantesFunciones.resaltarFK_IdParametroFormularioIvaFormularioRenta);
			}
		}

		if(this.formulariorentaConstantesFunciones.resaltarFK_IdTipoRetencionFormularioRenta!=null) {
			index= this.jTabbedPaneBusquedasFormularioRenta.indexOfComponent(this.jPanelFK_IdTipoRetencionFormularioRenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta.getComponent(index);
				jPanel.setBorder(this.formulariorentaConstantesFunciones.resaltarFK_IdTipoRetencionFormularioRenta);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioFormularioRenta() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasFormularioRenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFormularioRenta.indexOfComponent(this.jPanelFK_IdCuentaContableFormularioRenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formulariorentaConstantesFunciones.mostrarFK_IdCuentaContableFormularioRenta);
			if(!this.formulariorentaConstantesFunciones.mostrarFK_IdCuentaContableFormularioRenta && index>-1) {
				this.jTabbedPaneBusquedasFormularioRenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasFormularioRenta.indexOfComponent(this.jPanelFK_IdDatoFormularioRentaFormularioRenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formulariorentaConstantesFunciones.mostrarFK_IdDatoFormularioRentaFormularioRenta);
			if(!this.formulariorentaConstantesFunciones.mostrarFK_IdDatoFormularioRentaFormularioRenta && index>-1) {
				this.jTabbedPaneBusquedasFormularioRenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasFormularioRenta.indexOfComponent(this.jPanelFK_IdPaisFormularioRenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formulariorentaConstantesFunciones.mostrarFK_IdPaisFormularioRenta);
			if(!this.formulariorentaConstantesFunciones.mostrarFK_IdPaisFormularioRenta && index>-1) {
				this.jTabbedPaneBusquedasFormularioRenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasFormularioRenta.indexOfComponent(this.jPanelFK_IdParametroFormularioIvaFormularioRenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formulariorentaConstantesFunciones.mostrarFK_IdParametroFormularioIvaFormularioRenta);
			if(!this.formulariorentaConstantesFunciones.mostrarFK_IdParametroFormularioIvaFormularioRenta && index>-1) {
				this.jTabbedPaneBusquedasFormularioRenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasFormularioRenta.indexOfComponent(this.jPanelFK_IdTipoRetencionFormularioRenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formulariorentaConstantesFunciones.mostrarFK_IdTipoRetencionFormularioRenta);
			if(!this.formulariorentaConstantesFunciones.mostrarFK_IdTipoRetencionFormularioRenta && index>-1) {
				this.jTabbedPaneBusquedasFormularioRenta.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioFormularioRenta() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasFormularioRenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFormularioRenta.indexOfComponent(this.jPanelFK_IdCuentaContableFormularioRenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formulariorentaConstantesFunciones.activarFK_IdCuentaContableFormularioRenta);
				this.jTabbedPaneBusquedasFormularioRenta.setEnabledAt(index,this.formulariorentaConstantesFunciones.activarFK_IdCuentaContableFormularioRenta);
			}

			index= this.jTabbedPaneBusquedasFormularioRenta.indexOfComponent(this.jPanelFK_IdDatoFormularioRentaFormularioRenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formulariorentaConstantesFunciones.activarFK_IdDatoFormularioRentaFormularioRenta);
				this.jTabbedPaneBusquedasFormularioRenta.setEnabledAt(index,this.formulariorentaConstantesFunciones.activarFK_IdDatoFormularioRentaFormularioRenta);
			}

			index= this.jTabbedPaneBusquedasFormularioRenta.indexOfComponent(this.jPanelFK_IdPaisFormularioRenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formulariorentaConstantesFunciones.activarFK_IdPaisFormularioRenta);
				this.jTabbedPaneBusquedasFormularioRenta.setEnabledAt(index,this.formulariorentaConstantesFunciones.activarFK_IdPaisFormularioRenta);
			}

			index= this.jTabbedPaneBusquedasFormularioRenta.indexOfComponent(this.jPanelFK_IdParametroFormularioIvaFormularioRenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formulariorentaConstantesFunciones.activarFK_IdParametroFormularioIvaFormularioRenta);
				this.jTabbedPaneBusquedasFormularioRenta.setEnabledAt(index,this.formulariorentaConstantesFunciones.activarFK_IdParametroFormularioIvaFormularioRenta);
			}

			index= this.jTabbedPaneBusquedasFormularioRenta.indexOfComponent(this.jPanelFK_IdTipoRetencionFormularioRenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formulariorentaConstantesFunciones.activarFK_IdTipoRetencionFormularioRenta);
				this.jTabbedPaneBusquedasFormularioRenta.setEnabledAt(index,this.formulariorentaConstantesFunciones.activarFK_IdTipoRetencionFormularioRenta);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaFormularioRenta(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasFormularioRenta.indexOfComponent(this.jPanelFK_IdCuentaContableFormularioRenta);

			this.jTabbedPaneBusquedasFormularioRenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta.getComponent(index);

			this.formulariorentaConstantesFunciones.setResaltarFK_IdCuentaContableFormularioRenta(resaltar);

			jPanel.setBorder(this.formulariorentaConstantesFunciones.resaltarFK_IdCuentaContableFormularioRenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdDatoFormularioRenta")) {
			index= this.jTabbedPaneBusquedasFormularioRenta.indexOfComponent(this.jPanelFK_IdDatoFormularioRentaFormularioRenta);

			this.jTabbedPaneBusquedasFormularioRenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta.getComponent(index);

			this.formulariorentaConstantesFunciones.setResaltarFK_IdDatoFormularioRentaFormularioRenta(resaltar);

			jPanel.setBorder(this.formulariorentaConstantesFunciones.resaltarFK_IdDatoFormularioRentaFormularioRenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasFormularioRenta.indexOfComponent(this.jPanelFK_IdPaisFormularioRenta);

			this.jTabbedPaneBusquedasFormularioRenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta.getComponent(index);

			this.formulariorentaConstantesFunciones.setResaltarFK_IdPaisFormularioRenta(resaltar);

			jPanel.setBorder(this.formulariorentaConstantesFunciones.resaltarFK_IdPaisFormularioRenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdParametroFormularioIva")) {
			index= this.jTabbedPaneBusquedasFormularioRenta.indexOfComponent(this.jPanelFK_IdParametroFormularioIvaFormularioRenta);

			this.jTabbedPaneBusquedasFormularioRenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta.getComponent(index);

			this.formulariorentaConstantesFunciones.setResaltarFK_IdParametroFormularioIvaFormularioRenta(resaltar);

			jPanel.setBorder(this.formulariorentaConstantesFunciones.resaltarFK_IdParametroFormularioIvaFormularioRenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoRetencion")) {
			index= this.jTabbedPaneBusquedasFormularioRenta.indexOfComponent(this.jPanelFK_IdTipoRetencionFormularioRenta);

			this.jTabbedPaneBusquedasFormularioRenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta.getComponent(index);

			this.formulariorentaConstantesFunciones.setResaltarFK_IdTipoRetencionFormularioRenta(resaltar);

			jPanel.setBorder(this.formulariorentaConstantesFunciones.resaltarFK_IdTipoRetencionFormularioRenta);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarFormularioRenta.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioFormularioRenta() throws Exception {

		if(this.jInternalFrameDetalleFormFormularioRenta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioFormularioRenta();
		this.updateVisibilidadResaltarControlesFormularioFormularioRenta();
		this.updateHabilitarResaltarControlesFormularioFormularioRenta();
		
	}
	
	public void updateBorderResaltarControlesFormularioFormularioRenta() throws Exception {
		if(this.jInternalFrameDetalleFormFormularioRenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.formulariorentaConstantesFunciones.resaltaridFormularioRenta!=null && this.jInternalFrameDetalleFormFormularioRenta!=null) {this.jInternalFrameDetalleFormFormularioRenta.jLabelidFormularioRenta.setBorder(this.formulariorentaConstantesFunciones.resaltaridFormularioRenta);}
		if(this.formulariorentaConstantesFunciones.resaltarid_empresaFormularioRenta!=null && this.jInternalFrameDetalleFormFormularioRenta!=null) {this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_empresaFormularioRenta.setBorder(this.formulariorentaConstantesFunciones.resaltarid_empresaFormularioRenta);}
		if(this.formulariorentaConstantesFunciones.resaltarid_ejercicioFormularioRenta!=null && this.jInternalFrameDetalleFormFormularioRenta!=null) {this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_ejercicioFormularioRenta.setBorder(this.formulariorentaConstantesFunciones.resaltarid_ejercicioFormularioRenta);}
		if(this.formulariorentaConstantesFunciones.resaltarid_periodoFormularioRenta!=null && this.jInternalFrameDetalleFormFormularioRenta!=null) {this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_periodoFormularioRenta.setBorder(this.formulariorentaConstantesFunciones.resaltarid_periodoFormularioRenta);}
		if(this.formulariorentaConstantesFunciones.resaltarid_dato_formulario_rentaFormularioRenta!=null && this.jInternalFrameDetalleFormFormularioRenta!=null) {this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_dato_formulario_rentaFormularioRenta.setBorder(this.formulariorentaConstantesFunciones.resaltarid_dato_formulario_rentaFormularioRenta);}
		if(this.formulariorentaConstantesFunciones.resaltarid_cuenta_contableFormularioRenta!=null && this.jInternalFrameDetalleFormFormularioRenta!=null) {this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_cuenta_contableFormularioRenta.setBorder(this.formulariorentaConstantesFunciones.resaltarid_cuenta_contableFormularioRenta);}
		if(this.formulariorentaConstantesFunciones.resaltarid_tipo_retencionFormularioRenta!=null && this.jInternalFrameDetalleFormFormularioRenta!=null) {this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_tipo_retencionFormularioRenta.setBorder(this.formulariorentaConstantesFunciones.resaltarid_tipo_retencionFormularioRenta);}
		if(this.formulariorentaConstantesFunciones.resaltarid_parametro_formulario_ivaFormularioRenta!=null && this.jInternalFrameDetalleFormFormularioRenta!=null) {this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_parametro_formulario_ivaFormularioRenta.setBorder(this.formulariorentaConstantesFunciones.resaltarid_parametro_formulario_ivaFormularioRenta);}
		if(this.formulariorentaConstantesFunciones.resaltarid_paisFormularioRenta!=null && this.jInternalFrameDetalleFormFormularioRenta!=null) {this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_paisFormularioRenta.setBorder(this.formulariorentaConstantesFunciones.resaltarid_paisFormularioRenta);}
		if(this.formulariorentaConstantesFunciones.resaltarvalor_pagadoFormularioRenta!=null && this.jInternalFrameDetalleFormFormularioRenta!=null) {this.jInternalFrameDetalleFormFormularioRenta.jTextFieldvalor_pagadoFormularioRenta.setBorder(this.formulariorentaConstantesFunciones.resaltarvalor_pagadoFormularioRenta);}
		if(this.formulariorentaConstantesFunciones.resaltarimpuesto_retenidoFormularioRenta!=null && this.jInternalFrameDetalleFormFormularioRenta!=null) {this.jInternalFrameDetalleFormFormularioRenta.jTextFieldimpuesto_retenidoFormularioRenta.setBorder(this.formulariorentaConstantesFunciones.resaltarimpuesto_retenidoFormularioRenta);}
		if(this.formulariorentaConstantesFunciones.resaltarbase_impornibleFormularioRenta!=null && this.jInternalFrameDetalleFormFormularioRenta!=null) {this.jInternalFrameDetalleFormFormularioRenta.jTextFieldbase_impornibleFormularioRenta.setBorder(this.formulariorentaConstantesFunciones.resaltarbase_impornibleFormularioRenta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioFormularioRenta() throws Exception {		
		if(this.jInternalFrameDetalleFormFormularioRenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
	
		//this.jInternalFrameDetalleFormFormularioRenta.jLabelidFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostraridFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jPanelidFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostraridFormularioRenta);
		//this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_empresaFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostrarid_empresaFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jPanelid_empresaFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostrarid_empresaFormularioRenta);
		//this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_ejercicioFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostrarid_ejercicioFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jPanelid_ejercicioFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostrarid_ejercicioFormularioRenta);
		//this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_periodoFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostrarid_periodoFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jPanelid_periodoFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostrarid_periodoFormularioRenta);
		//this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_dato_formulario_rentaFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostrarid_dato_formulario_rentaFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jPanelid_dato_formulario_rentaFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostrarid_dato_formulario_rentaFormularioRenta);
		//this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_cuenta_contableFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostrarid_cuenta_contableFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jPanelid_cuenta_contableFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostrarid_cuenta_contableFormularioRenta);
		//this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_tipo_retencionFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostrarid_tipo_retencionFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jPanelid_tipo_retencionFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostrarid_tipo_retencionFormularioRenta);
		//this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_parametro_formulario_ivaFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostrarid_parametro_formulario_ivaFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jPanelid_parametro_formulario_ivaFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostrarid_parametro_formulario_ivaFormularioRenta);
		//this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_paisFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostrarid_paisFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jPanelid_paisFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostrarid_paisFormularioRenta);
		//this.jInternalFrameDetalleFormFormularioRenta.jTextFieldvalor_pagadoFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostrarvalor_pagadoFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jPanelvalor_pagadoFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostrarvalor_pagadoFormularioRenta);
		//this.jInternalFrameDetalleFormFormularioRenta.jTextFieldimpuesto_retenidoFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostrarimpuesto_retenidoFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jPanelimpuesto_retenidoFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostrarimpuesto_retenidoFormularioRenta);
		//this.jInternalFrameDetalleFormFormularioRenta.jTextFieldbase_impornibleFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostrarbase_impornibleFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jPanelbase_impornibleFormularioRenta.setVisible(this.formulariorentaConstantesFunciones.mostrarbase_impornibleFormularioRenta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioFormularioRenta() throws Exception {
		if(this.jInternalFrameDetalleFormFormularioRenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFormularioRenta!=null) {
	
		this.jInternalFrameDetalleFormFormularioRenta.jLabelidFormularioRenta.setEnabled(this.formulariorentaConstantesFunciones.activaridFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_empresaFormularioRenta.setEnabled(this.formulariorentaConstantesFunciones.activarid_empresaFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_ejercicioFormularioRenta.setEnabled(this.formulariorentaConstantesFunciones.activarid_ejercicioFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_periodoFormularioRenta.setEnabled(this.formulariorentaConstantesFunciones.activarid_periodoFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_dato_formulario_rentaFormularioRenta.setEnabled(this.formulariorentaConstantesFunciones.activarid_dato_formulario_rentaFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_cuenta_contableFormularioRenta.setEnabled(this.formulariorentaConstantesFunciones.activarid_cuenta_contableFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_tipo_retencionFormularioRenta.setEnabled(this.formulariorentaConstantesFunciones.activarid_tipo_retencionFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_parametro_formulario_ivaFormularioRenta.setEnabled(this.formulariorentaConstantesFunciones.activarid_parametro_formulario_ivaFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jComboBoxid_paisFormularioRenta.setEnabled(this.formulariorentaConstantesFunciones.activarid_paisFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jTextFieldvalor_pagadoFormularioRenta.setEnabled(this.formulariorentaConstantesFunciones.activarvalor_pagadoFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jTextFieldimpuesto_retenidoFormularioRenta.setEnabled(this.formulariorentaConstantesFunciones.activarimpuesto_retenidoFormularioRenta);
		this.jInternalFrameDetalleFormFormularioRenta.jTextFieldbase_impornibleFormularioRenta.setEnabled(this.formulariorentaConstantesFunciones.activarbase_impornibleFormularioRenta);
		}
	}
	
		
}