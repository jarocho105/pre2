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

//import com.bydan.erp.nomina.util.RubrosVariablesConstantesFunciones;
import com.bydan.erp.nomina.util.report.RubrosVariablesParameterReturnGeneral;
//import com.bydan.erp.nomina.util.report.RubrosVariablesParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.report.RubrosVariablesBean;
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

import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class RubrosVariablesBeanSwingJInternalFrame extends RubrosVariablesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(RubrosVariablesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<RubrosVariables> rubrosvariablesValidator = new ClassValidator<RubrosVariables>(RubrosVariables.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public RubrosVariables rubrosvariables;	
	public RubrosVariables rubrosvariablesAux;
	public RubrosVariables rubrosvariablesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public RubrosVariables rubrosvariablesTotales;
	public Long idRubrosVariablesActual;
	public Long iIdNuevoRubrosVariables=0L;
	public int rowIndexActual=0;
	
	
	
	
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

	public String sFinalQueryComboRubroEmplea="";

	public List<RubroEmplea> rubroempleasForeignKey;

	public List<RubroEmplea> getrubroempleasForeignKey() {
		return rubroempleasForeignKey;
	}

	public void setrubroempleasForeignKey(List<RubroEmplea> rubroempleasForeignKey) {
		this.rubroempleasForeignKey = rubroempleasForeignKey;
	}

	//OBJETO FK ACTUAL
	public RubroEmplea rubroempleaForeignKey;

	public RubroEmplea getrubroempleaForeignKey() {
		return rubroempleaForeignKey;
	}

	public void setrubroempleaForeignKey(RubroEmplea rubroempleaForeignKey) {
		this.rubroempleaForeignKey = rubroempleaForeignKey;
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
	
	public Boolean isPermisoTodoRubrosVariables;
	public Boolean isPermisoNuevoRubrosVariables;
	public Boolean isPermisoActualizarRubrosVariables;
	public Boolean isPermisoActualizarOriginalRubrosVariables;
	public Boolean isPermisoEliminarRubrosVariables;
	public Boolean isPermisoGuardarCambiosRubrosVariables;
	public Boolean isPermisoConsultaRubrosVariables;
	public Boolean isPermisoBusquedaRubrosVariables;
	public Boolean isPermisoReporteRubrosVariables;
	public Boolean isPermisoPaginacionMedioRubrosVariables;
	public Boolean isPermisoPaginacionAltoRubrosVariables;
	public Boolean isPermisoPaginacionTodoRubrosVariables;
	public Boolean isPermisoCopiarRubrosVariables;
	public Boolean isPermisoVerFormRubrosVariables;
	public Boolean isPermisoDuplicarRubrosVariables;
	public Boolean isPermisoOrdenRubrosVariables;
	
	
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
	
	public RubrosVariablesParameterReturnGeneral rubrosvariablesReturnGeneral;
	public RubrosVariablesParameterReturnGeneral rubrosvariablesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoRubrosVariables=false;
	public Boolean esParaAccionDesdeFormularioRubrosVariables=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected RubrosVariablesSessionBeanAdditional rubrosvariablesSessionBeanAdditional=null;
	
	public RubrosVariablesSessionBeanAdditional getRubrosVariablesSessionBeanAdditional() {
		return this.rubrosvariablesSessionBeanAdditional;
	}
	
	public void setRubrosVariablesSessionBeanAdditional(RubrosVariablesSessionBeanAdditional rubrosvariablesSessionBeanAdditional) {
		try {
			this.rubrosvariablesSessionBeanAdditional=rubrosvariablesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected RubrosVariablesBeanSwingJInternalFrameAdditional rubrosvariablesBeanSwingJInternalFrameAdditional=null;
	//public class RubrosVariablesBeanSwingJInternalFrame
	
	public RubrosVariablesBeanSwingJInternalFrameAdditional getRubrosVariablesBeanSwingJInternalFrameAdditional() {
		return this.rubrosvariablesBeanSwingJInternalFrameAdditional;
	}
	
	public void setRubrosVariablesBeanSwingJInternalFrameAdditional(RubrosVariablesBeanSwingJInternalFrameAdditional rubrosvariablesBeanSwingJInternalFrameAdditional) {
		try {
			this.rubrosvariablesBeanSwingJInternalFrameAdditional=rubrosvariablesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public RubrosVariablesLogic rubrosvariablesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public RubrosVariables rubrosvariablesBean;
	public RubrosVariablesConstantesFunciones rubrosvariablesConstantesFunciones;
	//public RubrosVariablesParameterReturnGeneral rubrosvariablesReturnGeneral;
	
	//FK
	
	public TipoContratoLogic tipocontratoLogic;
	public EmpresaLogic empresaLogic;
	public RubroEmpleaLogic rubroempleaLogic;
	
	//PARAMETROS
	
	
	//public List<RubrosVariables> rubrosvariabless;	
	//public List<RubrosVariables> rubrosvariablessEliminados;
	//public List<RubrosVariables> rubrosvariablessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoRubrosVariables=false;
	public Boolean isVisibilidadCeldaDuplicarRubrosVariables=true;
	public Boolean isVisibilidadCeldaCopiarRubrosVariables=true;
	public Boolean isVisibilidadCeldaVerFormRubrosVariables=true;
	public Boolean isVisibilidadCeldaOrdenRubrosVariables=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesRubrosVariables=false;
	public Boolean isVisibilidadCeldaModificarRubrosVariables=false;
	public Boolean isVisibilidadCeldaActualizarRubrosVariables=false;
	public Boolean isVisibilidadCeldaEliminarRubrosVariables=false;
	public Boolean isVisibilidadCeldaCancelarRubrosVariables=false;
	public Boolean isVisibilidadCeldaGuardarRubrosVariables=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosRubrosVariables=false;	
	
	
	public Boolean isVisibilidadBusquedaRubrosVariables=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdRubroEmplea=false;
	public Boolean isVisibilidadFK_IdTipoContrato=false;
	
	public Long getiIdNuevoRubrosVariables() {
		return this.iIdNuevoRubrosVariables;
	}

	public void setiIdNuevoRubrosVariables(Long iIdNuevoRubrosVariables) {
		this.iIdNuevoRubrosVariables = iIdNuevoRubrosVariables;
	}
	
	public Long getidRubrosVariablesActual() {
		return this.idRubrosVariablesActual;
	}

	public void setidRubrosVariablesActual(Long idRubrosVariablesActual) {
		this.idRubrosVariablesActual = idRubrosVariablesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public RubrosVariables getrubrosvariables() {
		return this.rubrosvariables;
	}

	public void setrubrosvariables(RubrosVariables rubrosvariables) {
		this.rubrosvariables = rubrosvariables;
	}
	
	public RubrosVariables getrubrosvariablesAux() {
		return this.rubrosvariablesAux;
	}

	public void setrubrosvariablesAux(RubrosVariables rubrosvariablesAux) {
		this.rubrosvariablesAux = rubrosvariablesAux;
	}				
	
	public RubrosVariables getrubrosvariablesAnterior() {
		return this.rubrosvariablesAnterior;
	}

	public void setrubrosvariablesAnterior(RubrosVariables rubrosvariablesAnterior) {
		this.rubrosvariablesAnterior = rubrosvariablesAnterior;
	}	
	
	public RubrosVariables getrubrosvariablesTotales() {
		return this.rubrosvariablesTotales;
	}

	public void setrubrosvariablesTotales(RubrosVariables rubrosvariablesTotales) {
		this.rubrosvariablesTotales = rubrosvariablesTotales;
	}	
	
	public RubrosVariables getrubrosvariablesBean() {
		return this.rubrosvariablesBean;
	}

	public void setrubrosvariablesBean(RubrosVariables rubrosvariablesBean) {
		this.rubrosvariablesBean = rubrosvariablesBean;
	}	
	
	public RubrosVariablesParameterReturnGeneral getrubrosvariablesReturnGeneral() {
		return this.rubrosvariablesReturnGeneral;
	}

	public void setrubrosvariablesReturnGeneral(RubrosVariablesParameterReturnGeneral rubrosvariablesReturnGeneral) {
		this.rubrosvariablesReturnGeneral = rubrosvariablesReturnGeneral;
	}	
	
	
	public Long id_tipo_contratoBusquedaRubrosVariables=-1L;

	public Long getid_tipo_contratoBusquedaRubrosVariables() {
		return this.id_tipo_contratoBusquedaRubrosVariables;
	}

	public void setid_tipo_contratoBusquedaRubrosVariables(Long id_tipo_contratoBusquedaRubrosVariables) {
		this.id_tipo_contratoBusquedaRubrosVariables = id_tipo_contratoBusquedaRubrosVariables;
	}

;
	public Long id_rubro_empleaBusquedaRubrosVariables=-1L;

	public Long getid_rubro_empleaBusquedaRubrosVariables() {
		return this.id_rubro_empleaBusquedaRubrosVariables;
	}

	public void setid_rubro_empleaBusquedaRubrosVariables(Long id_rubro_empleaBusquedaRubrosVariables) {
		this.id_rubro_empleaBusquedaRubrosVariables = id_rubro_empleaBusquedaRubrosVariables;
	}

;
	public Date fecha_desdeBusquedaRubrosVariables=new Date();

	public Date getfecha_desdeBusquedaRubrosVariables() {
		return this.fecha_desdeBusquedaRubrosVariables;
	}

	public void setfecha_desdeBusquedaRubrosVariables(Date fecha_desdeBusquedaRubrosVariables) {
		this.fecha_desdeBusquedaRubrosVariables = fecha_desdeBusquedaRubrosVariables;
	}

;
	public Date fecha_hastaBusquedaRubrosVariables=new Date();

	public Date getfecha_hastaBusquedaRubrosVariables() {
		return this.fecha_hastaBusquedaRubrosVariables;
	}

	public void setfecha_hastaBusquedaRubrosVariables(Date fecha_hastaBusquedaRubrosVariables) {
		this.fecha_hastaBusquedaRubrosVariables = fecha_hastaBusquedaRubrosVariables;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_rubro_empleaFK_IdRubroEmplea=-1L;

	public Long getid_rubro_empleaFK_IdRubroEmplea() {
		return this.id_rubro_empleaFK_IdRubroEmplea;
	}

	public void setid_rubro_empleaFK_IdRubroEmplea(Long id_rubro_empleaFK_IdRubroEmplea) {
		this.id_rubro_empleaFK_IdRubroEmplea = id_rubro_empleaFK_IdRubroEmplea;
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
	
	
	public RubrosVariablesLogic getRubrosVariablesLogic()	{		
		return rubrosvariablesLogic;
	}

	public void setRubrosVariablesLogic(RubrosVariablesLogic rubrosvariablesLogic) {
		this.rubrosvariablesLogic = rubrosvariablesLogic;
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
	
	public Boolean getIsEsNuevoRubrosVariables() {
		return isEsNuevoRubrosVariables;
	}

	public void setIsEsNuevoRubrosVariables(Boolean isEsNuevoRubrosVariables) {
		this.isEsNuevoRubrosVariables = isEsNuevoRubrosVariables;
	}

	public Boolean getEsParaAccionDesdeFormularioRubrosVariables() {
		return esParaAccionDesdeFormularioRubrosVariables;
	}
	
	public void setEsParaAccionDesdeFormularioRubrosVariables(Boolean esParaAccionDesdeFormularioRubrosVariables) {
		this.esParaAccionDesdeFormularioRubrosVariables = esParaAccionDesdeFormularioRubrosVariables;
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

			if(this.rubrosvariablesSessionBean==null) {
				this.rubrosvariablesSessionBean=new RubrosVariablesSessionBean();
			}

			if(!this.rubrosvariablesSessionBean.getisBusquedaDesdeForeignKeySesionTipoContrato()) {
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
					tipocontratoLogic.getEntityWithConnection(rubrosvariablesSessionBean.getlidTipoContratoActual());
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

			if(this.rubrosvariablesSessionBean==null) {
				this.rubrosvariablesSessionBean=new RubrosVariablesSessionBean();
			}

			if(!this.rubrosvariablesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(rubrosvariablesSessionBean.getlidEmpresaActual());
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

	public void cargarCombosRubroEmpleasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.rubroempleasForeignKey=new ArrayList<RubroEmplea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			RubroEmpleaLogic rubroempleaLogic=new RubroEmpleaLogic();

			//rubroempleaLogic.getRubroEmpleaDataAccess().setIsForForeingKeyData(true);

			if(this.rubrosvariablesSessionBean==null) {
				this.rubrosvariablesSessionBean=new RubrosVariablesSessionBean();
			}

			if(!this.rubrosvariablesSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//rubroempleaLogic.getRubroEmpleaDataAccess().setIsForForeingKeyData(true);

					rubroempleaLogic.getTodosRubroEmpleasWithConnection(sFinalQuery,new Pagination());

					this.rubroempleasForeignKey=rubroempleaLogic.getRubroEmpleas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaRubroEmplea(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroempleaLogic.getEntityWithConnection(rubrosvariablesSessionBean.getlidRubroEmpleaActual());
					this.rubroempleasForeignKey.add(rubroempleaLogic.getRubroEmplea());
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

					if(this.rubrosvariables!=null) {
						this.rubrosvariables.setTipoContrato(tipocontratoTemp);
					}

					if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
						this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_tipo_contratoRubrosVariables.setSelectedItem(tipocontratoTemp);
					}
				} else {
					//jComboBoxid_tipo_contratoRubrosVariables.setSelectedItem(tipocontratoTemp);
					if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
						if(this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_tipo_contratoRubrosVariables.getItemCount()>0) {
							this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_tipo_contratoRubrosVariables.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaRubrosVariables") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocontratoTemp!=null && jComboBoxid_tipo_contratoBusquedaRubrosVariablesRubrosVariables!=null) {
						jComboBoxid_tipo_contratoBusquedaRubrosVariablesRubrosVariables.setSelectedItem(tipocontratoTemp);
					} else {
						if(jComboBoxid_tipo_contratoBusquedaRubrosVariablesRubrosVariables!=null) {
							//jComboBoxid_tipo_contratoBusquedaRubrosVariablesRubrosVariables.setSelectedItem(tipocontratoTemp);
							if(jComboBoxid_tipo_contratoBusquedaRubrosVariablesRubrosVariables.getItemCount()>0) {
								jComboBoxid_tipo_contratoBusquedaRubrosVariablesRubrosVariables.setSelectedIndex(0);
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
	public void setActualTipoContratoForeignKeyGenerico(Long idTipoContratoSeleccionado,JComboBox jComboBoxid_tipo_contratoRubrosVariablesGenerico)throws Exception
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
				jComboBoxid_tipo_contratoRubrosVariablesGenerico.setSelectedItem(tipocontratoTemp);
			} else {
				if(jComboBoxid_tipo_contratoRubrosVariablesGenerico!=null && jComboBoxid_tipo_contratoRubrosVariablesGenerico.getItemCount()>0) {
					jComboBoxid_tipo_contratoRubrosVariablesGenerico.setSelectedIndex(0);
				}
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

					if(this.rubrosvariables!=null) {
						this.rubrosvariables.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
						this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_empresaRubrosVariables.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaRubrosVariables.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
						if(this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_empresaRubrosVariables.getItemCount()>0) {
							this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_empresaRubrosVariables.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaRubrosVariablesGenerico)throws Exception
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
				jComboBoxid_empresaRubrosVariablesGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaRubrosVariablesGenerico!=null && jComboBoxid_empresaRubrosVariablesGenerico.getItemCount()>0) {
					jComboBoxid_empresaRubrosVariablesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualRubroEmpleaForeignKey(Long idRubroEmpleaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaTemp=null;

			for(RubroEmplea rubroempleaAux:rubroempleasForeignKey) {
				if(rubroempleaAux.getId()!=null && rubroempleaAux.getId().equals(idRubroEmpleaSeleccionado)) {
					rubroempleaTemp=rubroempleaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(rubroempleaTemp!=null) {

					if(this.rubrosvariables!=null) {
						this.rubrosvariables.setRubroEmplea(rubroempleaTemp);
					}

					if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
						this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_rubro_empleaRubrosVariables.setSelectedItem(rubroempleaTemp);
					}
				} else {
					//jComboBoxid_rubro_empleaRubrosVariables.setSelectedItem(rubroempleaTemp);
					if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
						if(this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_rubro_empleaRubrosVariables.getItemCount()>0) {
							this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_rubro_empleaRubrosVariables.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaRubrosVariables") || sFormularioTipoBusqueda.equals("Todos")){
					if(rubroempleaTemp!=null && jComboBoxid_rubro_empleaBusquedaRubrosVariablesRubrosVariables!=null) {
						jComboBoxid_rubro_empleaBusquedaRubrosVariablesRubrosVariables.setSelectedItem(rubroempleaTemp);
					} else {
						if(jComboBoxid_rubro_empleaBusquedaRubrosVariablesRubrosVariables!=null) {
							//jComboBoxid_rubro_empleaBusquedaRubrosVariablesRubrosVariables.setSelectedItem(rubroempleaTemp);
							if(jComboBoxid_rubro_empleaBusquedaRubrosVariablesRubrosVariables.getItemCount()>0) {
								jComboBoxid_rubro_empleaBusquedaRubrosVariablesRubrosVariables.setSelectedIndex(0);
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

	public String getActualRubroEmpleaForeignKeyDescripcion(Long idRubroEmpleaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			RubroEmplea  rubroempleaTemp=null;

			for(RubroEmplea rubroempleaAux:rubroempleasForeignKey) {
				if(rubroempleaAux.getId()!=null && rubroempleaAux.getId().equals(idRubroEmpleaSeleccionado)) {
					rubroempleaTemp=rubroempleaAux;
					break;
				}
			}


			sDescripcion=RubroEmpleaConstantesFunciones.getRubroEmpleaDescripcion(rubroempleaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualRubroEmpleaForeignKeyGenerico(Long idRubroEmpleaSeleccionado,JComboBox jComboBoxid_rubro_empleaRubrosVariablesGenerico)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaTemp=null;

			for(RubroEmplea rubroempleaAux:rubroempleasForeignKey) {
				if(rubroempleaAux.getId()!=null && rubroempleaAux.getId().equals(idRubroEmpleaSeleccionado)) {
					rubroempleaTemp=rubroempleaAux;
					break;
				}
			}

			if(rubroempleaTemp!=null) {
				jComboBoxid_rubro_empleaRubrosVariablesGenerico.setSelectedItem(rubroempleaTemp);
			} else {
				if(jComboBoxid_rubro_empleaRubrosVariablesGenerico!=null && jComboBoxid_rubro_empleaRubrosVariablesGenerico.getItemCount()>0) {
					jComboBoxid_rubro_empleaRubrosVariablesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoContratoForeignKey(RubrosVariables rubrosvariables,JComboBox jComboBoxid_tipo_contratoRubrosVariablesGenerico)throws Exception
	{
		try
		{
			TipoContrato  tipocontratoAux=new TipoContrato();

			if(jComboBoxid_tipo_contratoRubrosVariablesGenerico==null) {
				tipocontratoAux=(TipoContrato)this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_tipo_contratoRubrosVariables.getSelectedItem();
			} else {
				tipocontratoAux=(TipoContrato)jComboBoxid_tipo_contratoRubrosVariablesGenerico.getSelectedItem();
			}

			if(tipocontratoAux!=null && tipocontratoAux.getId()!=null) {
				rubrosvariables.setid_tipo_contrato(tipocontratoAux.getId());
				rubrosvariables.settipocontrato_descripcion(RubrosVariablesConstantesFunciones.getTipoContratoDescripcion(tipocontratoAux));
				rubrosvariables.setTipoContrato(tipocontratoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(RubrosVariables rubrosvariables,JComboBox jComboBoxid_empresaRubrosVariablesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaRubrosVariablesGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_empresaRubrosVariables.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaRubrosVariablesGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				rubrosvariables.setid_empresa(empresaAux.getId());
				rubrosvariables.setempresa_descripcion(RubrosVariablesConstantesFunciones.getEmpresaDescripcion(empresaAux));
				rubrosvariables.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarRubroEmpleaForeignKey(RubrosVariables rubrosvariables,JComboBox jComboBoxid_rubro_empleaRubrosVariablesGenerico)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaAux=new RubroEmplea();

			if(jComboBoxid_rubro_empleaRubrosVariablesGenerico==null) {
				rubroempleaAux=(RubroEmplea)this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_rubro_empleaRubrosVariables.getSelectedItem();
			} else {
				rubroempleaAux=(RubroEmplea)jComboBoxid_rubro_empleaRubrosVariablesGenerico.getSelectedItem();
			}

			if(rubroempleaAux!=null && rubroempleaAux.getId()!=null) {
				rubrosvariables.setid_rubro_emplea(rubroempleaAux.getId());
				rubrosvariables.setrubroemplea_descripcion(RubrosVariablesConstantesFunciones.getRubroEmpleaDescripcion(rubroempleaAux));
				rubrosvariables.setRubroEmplea(rubroempleaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoContratosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoContrato=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RubrosVariablesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRubrosVariables!=null) { 
							this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_tipo_contratoRubrosVariables.removeAllItems();

							for(TipoContrato tipocontrato:this.tipocontratosForeignKey) {
								this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_tipo_contratoRubrosVariables.addItem(tipocontrato);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRubrosVariables!=null) { 
					}

					if(!RubrosVariablesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaRubrosVariables") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RubrosVariablesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_contratoBusquedaRubrosVariablesRubrosVariables.removeAllItems();

							for(TipoContrato tipocontrato:this.tipocontratosForeignKey) {
								this.jComboBoxid_tipo_contratoBusquedaRubrosVariablesRubrosVariables.addItem(tipocontrato);
							}
						}

						if(!RubrosVariablesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RubrosVariablesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRubrosVariables!=null) { 
							this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_empresaRubrosVariables.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_empresaRubrosVariables.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRubrosVariables!=null) { 
					}

					if(!RubrosVariablesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameRubroEmpleasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingRubroEmplea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RubrosVariablesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRubrosVariables!=null) { 
							this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_rubro_empleaRubrosVariables.removeAllItems();

							for(RubroEmplea rubroemplea:this.rubroempleasForeignKey) {
								this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_rubro_empleaRubrosVariables.addItem(rubroemplea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRubrosVariables!=null) { 
					}

					if(!RubrosVariablesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaRubrosVariables") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RubrosVariablesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_rubro_empleaBusquedaRubrosVariablesRubrosVariables.removeAllItems();

							for(RubroEmplea rubroemplea:this.rubroempleasForeignKey) {
								this.jComboBoxid_rubro_empleaBusquedaRubrosVariablesRubrosVariables.addItem(rubroemplea);
							}
						}

						if(!RubrosVariablesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameTipoContratoForeignKey(TipoContrato tipocontrato,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
							this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_tipo_contratoRubrosVariables.setSelectedItem(tipocontrato);
						}
					} else {
						if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
							this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_tipo_contratoRubrosVariables.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_contratoBusquedaRubrosVariablesRubrosVariables.setSelectedItem(tipocontrato);
						} else {
							this.jComboBoxid_tipo_contratoBusquedaRubrosVariablesRubrosVariables.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
							this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_empresaRubrosVariables.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
							this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_empresaRubrosVariables.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameRubroEmpleaForeignKey(RubroEmplea rubroemplea,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
							this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_rubro_empleaRubrosVariables.setSelectedItem(rubroemplea);
						}
					} else {
						if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
							this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_rubro_empleaRubrosVariables.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_rubro_empleaBusquedaRubrosVariablesRubrosVariables.setSelectedItem(rubroemplea);
						} else {
							this.jComboBoxid_rubro_empleaBusquedaRubrosVariablesRubrosVariables.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesRubrosVariables() throws Exception {
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
		
	public RubrosVariablesParameterReturnGeneral getRubrosVariablesParameterGeneral() {
		return this.rubrosvariablesParameterGeneral;
	}
	
	public void setRubrosVariablesParameterGeneral(RubrosVariablesParameterReturnGeneral rubrosvariablesParameterGeneral) {
		this.rubrosvariablesParameterGeneral = rubrosvariablesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoRubrosVariables() {
		return isPermisoTodoRubrosVariables;
	}

	public void setIsPermisoTodoRubrosVariables(Boolean isPermisoTodoRubrosVariables) {
		this.isPermisoTodoRubrosVariables = isPermisoTodoRubrosVariables;
	}

	public Boolean getIsPermisoNuevoRubrosVariables() {
		return isPermisoNuevoRubrosVariables;
	}

	public void setIsPermisoNuevoRubrosVariables(Boolean isPermisoNuevoRubrosVariables) {
		this.isPermisoNuevoRubrosVariables = isPermisoNuevoRubrosVariables;
	}

	public Boolean getIsPermisoActualizarRubrosVariables() {
		return isPermisoActualizarRubrosVariables;
	}

	public void setIsPermisoActualizarRubrosVariables(Boolean isPermisoActualizarRubrosVariables) {
		this.isPermisoActualizarRubrosVariables = isPermisoActualizarRubrosVariables;
	}

	public Boolean getIsPermisoEliminarRubrosVariables() {
		return isPermisoEliminarRubrosVariables;
	}

	public void setIsPermisoEliminarRubrosVariables(Boolean isPermisoEliminarRubrosVariables) {
		this.isPermisoEliminarRubrosVariables = isPermisoEliminarRubrosVariables;
	}

	public Boolean getIsPermisoGuardarCambiosRubrosVariables() {
		return isPermisoGuardarCambiosRubrosVariables;
	}

	public void setIsPermisoGuardarCambiosRubrosVariables(Boolean isPermisoGuardarCambiosRubrosVariables) {
		this.isPermisoGuardarCambiosRubrosVariables = isPermisoGuardarCambiosRubrosVariables;
	}
	
	public Boolean getIsPermisoConsultaRubrosVariables() {
		return isPermisoConsultaRubrosVariables;
	}

	public void setIsPermisoConsultaRubrosVariables(Boolean isPermisoConsultaRubrosVariables) {
		this.isPermisoConsultaRubrosVariables = isPermisoConsultaRubrosVariables;
	}

	public Boolean getIsPermisoBusquedaRubrosVariables() {
		return isPermisoBusquedaRubrosVariables;
	}

	public void setIsPermisoBusquedaRubrosVariables(Boolean isPermisoBusquedaRubrosVariables) {
		this.isPermisoBusquedaRubrosVariables = isPermisoBusquedaRubrosVariables;
	}

	public Boolean getIsPermisoReporteRubrosVariables() {
		return isPermisoReporteRubrosVariables;
	}

	public void setIsPermisoReporteRubrosVariables(Boolean isPermisoReporteRubrosVariables) {
		this.isPermisoReporteRubrosVariables = isPermisoReporteRubrosVariables;
	}
	
	public Boolean getIsPermisoPaginacionMedioRubrosVariables() {
		return isPermisoPaginacionMedioRubrosVariables;
	}

	public void setIsPermisoPaginacionMedioRubrosVariables(Boolean isPermisoPaginacionMedioRubrosVariables) {
		this.isPermisoPaginacionMedioRubrosVariables = isPermisoPaginacionMedioRubrosVariables;
	}
	
	public Boolean getIsPermisoPaginacionTodoRubrosVariables() {
		return isPermisoPaginacionTodoRubrosVariables;
	}

	public void setIsPermisoPaginacionTodoRubrosVariables(Boolean isPermisoPaginacionTodoRubrosVariables) {
		this.isPermisoPaginacionTodoRubrosVariables = isPermisoPaginacionTodoRubrosVariables;
	}
	
	public Boolean getIsPermisoPaginacionAltoRubrosVariables() {
		return isPermisoPaginacionAltoRubrosVariables;
	}

	public void setIsPermisoPaginacionAltoRubrosVariables(Boolean isPermisoPaginacionAltoRubrosVariables) {
		this.isPermisoPaginacionAltoRubrosVariables = isPermisoPaginacionAltoRubrosVariables;
	}
	
	public Boolean getIsPermisoCopiarRubrosVariables() {
		return isPermisoCopiarRubrosVariables;
	}

	public void setIsPermisoCopiarRubrosVariables(Boolean isPermisoCopiarRubrosVariables) {
		this.isPermisoCopiarRubrosVariables = isPermisoCopiarRubrosVariables;
	}
	
	public Boolean getIsPermisoVerFormRubrosVariables() {
		return isPermisoVerFormRubrosVariables;
	}

	public void setIsPermisoVerFormRubrosVariables(Boolean isPermisoVerFormRubrosVariables) {
		this.isPermisoVerFormRubrosVariables = isPermisoVerFormRubrosVariables;
	}
	
	public Boolean getIsPermisoDuplicarRubrosVariables() {
		return isPermisoDuplicarRubrosVariables;
	}

	public void setIsPermisoDuplicarRubrosVariables(Boolean isPermisoDuplicarRubrosVariables) {
		this.isPermisoDuplicarRubrosVariables = isPermisoDuplicarRubrosVariables;
	}
	
	public Boolean getIsPermisoOrdenRubrosVariables() {
		return isPermisoOrdenRubrosVariables;
	}

	public void setIsPermisoOrdenRubrosVariables(Boolean isPermisoOrdenRubrosVariables) {
		this.isPermisoOrdenRubrosVariables = isPermisoOrdenRubrosVariables;
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
	
	public Boolean getIsVisibilidadCeldaNuevoRubrosVariables() {
		return isVisibilidadCeldaNuevoRubrosVariables;
	}

	public void setIsVisibilidadCeldaNuevoRubrosVariables(Boolean isVisibilidadCeldaNuevoRubrosVariables) {
		this.isVisibilidadCeldaNuevoRubrosVariables = isVisibilidadCeldaNuevoRubrosVariables;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarRubrosVariables() {
		return isVisibilidadCeldaDuplicarRubrosVariables;
	}

	public void setIsVisibilidadCeldaDuplicarRubrosVariables(Boolean isVisibilidadCeldaDuplicarRubrosVariables) {
		this.isVisibilidadCeldaDuplicarRubrosVariables = isVisibilidadCeldaDuplicarRubrosVariables;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarRubrosVariables() {
		return isVisibilidadCeldaCopiarRubrosVariables;
	}

	public void setIsVisibilidadCeldaCopiarRubrosVariables(Boolean isVisibilidadCeldaCopiarRubrosVariables) {
		this.isVisibilidadCeldaCopiarRubrosVariables = isVisibilidadCeldaCopiarRubrosVariables;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormRubrosVariables() {
		return isVisibilidadCeldaVerFormRubrosVariables;
	}

	public void setIsVisibilidadCeldaVerFormRubrosVariables(Boolean isVisibilidadCeldaVerFormRubrosVariables) {
		this.isVisibilidadCeldaVerFormRubrosVariables = isVisibilidadCeldaVerFormRubrosVariables;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenRubrosVariables() {
		return isVisibilidadCeldaOrdenRubrosVariables;
	}

	public void setIsVisibilidadCeldaOrdenRubrosVariables(Boolean isVisibilidadCeldaOrdenRubrosVariables) {
		this.isVisibilidadCeldaOrdenRubrosVariables = isVisibilidadCeldaOrdenRubrosVariables;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesRubrosVariables() {
		return isVisibilidadCeldaNuevoRelacionesRubrosVariables;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesRubrosVariables(Boolean isVisibilidadCeldaNuevoRelacionesRubrosVariables) {
		this.isVisibilidadCeldaNuevoRelacionesRubrosVariables = isVisibilidadCeldaNuevoRelacionesRubrosVariables;
	}
	
	public Boolean getIsVisibilidadCeldaModificarRubrosVariables() {
		return isVisibilidadCeldaModificarRubrosVariables;
	}

	public void setIsVisibilidadCeldaModificarRubrosVariables(Boolean isVisibilidadCeldaModificarRubrosVariables) {
		this.isVisibilidadCeldaModificarRubrosVariables = isVisibilidadCeldaModificarRubrosVariables;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarRubrosVariables() {
		return isVisibilidadCeldaActualizarRubrosVariables;
	}

	public void setIsVisibilidadCeldaActualizarRubrosVariables(Boolean isVisibilidadCeldaActualizarRubrosVariables) {
		this.isVisibilidadCeldaActualizarRubrosVariables = isVisibilidadCeldaActualizarRubrosVariables;
	}

	public Boolean getIsVisibilidadCeldaEliminarRubrosVariables() {
		return isVisibilidadCeldaEliminarRubrosVariables;
	}

	public void setIsVisibilidadCeldaEliminarRubrosVariables(Boolean isVisibilidadCeldaEliminarRubrosVariables) {
		this.isVisibilidadCeldaEliminarRubrosVariables = isVisibilidadCeldaEliminarRubrosVariables;
	}

	public Boolean getIsVisibilidadCeldaCancelarRubrosVariables() {
		return isVisibilidadCeldaCancelarRubrosVariables;
	}

	public void setIsVisibilidadCeldaCancelarRubrosVariables(Boolean isVisibilidadCeldaCancelarRubrosVariables) {
		this.isVisibilidadCeldaCancelarRubrosVariables = isVisibilidadCeldaCancelarRubrosVariables;
	}

	public Boolean getIsVisibilidadCeldaGuardarRubrosVariables() {
		return isVisibilidadCeldaGuardarRubrosVariables;
	}

	public void setIsVisibilidadCeldaGuardarRubrosVariables(Boolean isVisibilidadCeldaGuardarRubrosVariables) {
		this.isVisibilidadCeldaGuardarRubrosVariables = isVisibilidadCeldaGuardarRubrosVariables;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosRubrosVariables() {
		return isVisibilidadCeldaGuardarCambiosRubrosVariables;
	}

	public void setIsVisibilidadCeldaGuardarCambiosRubrosVariables(Boolean isVisibilidadCeldaGuardarCambiosRubrosVariables) {
		this.isVisibilidadCeldaGuardarCambiosRubrosVariables = isVisibilidadCeldaGuardarCambiosRubrosVariables;
	}
		
	public RubrosVariablesSessionBean getrubrosvariablesSessionBean() {
		return this.rubrosvariablesSessionBean;
	}
	
	public void setrubrosvariablesSessionBean(RubrosVariablesSessionBean rubrosvariablesSessionBean) {
		this.rubrosvariablesSessionBean=rubrosvariablesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaRubrosVariables() {
		return this.isVisibilidadBusquedaRubrosVariables;
	}

	public void setisVisibilidadBusquedaRubrosVariables(Boolean isVisibilidadBusquedaRubrosVariables) {
		this.isVisibilidadBusquedaRubrosVariables=isVisibilidadBusquedaRubrosVariables;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdRubroEmplea() {
		return this.isVisibilidadFK_IdRubroEmplea;
	}

	public void setisVisibilidadFK_IdRubroEmplea(Boolean isVisibilidadFK_IdRubroEmplea) {
		this.isVisibilidadFK_IdRubroEmplea=isVisibilidadFK_IdRubroEmplea;
	}

	public Boolean getisVisibilidadFK_IdTipoContrato() {
		return this.isVisibilidadFK_IdTipoContrato;
	}

	public void setisVisibilidadFK_IdTipoContrato(Boolean isVisibilidadFK_IdTipoContrato) {
		this.isVisibilidadFK_IdTipoContrato=isVisibilidadFK_IdTipoContrato;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(RubrosVariables rubrosvariables)throws Exception {
		try {
			
				this.setActualParaGuardarTipoContratoForeignKey(rubrosvariables,null);
				this.setActualParaGuardarEmpresaForeignKey(rubrosvariables,null);
				this.setActualParaGuardarRubroEmpleaForeignKey(rubrosvariables,null);
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
	
	public void bugActualizarReferenciaActual(RubrosVariables rubrosvariables,RubrosVariables rubrosvariablesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalRubrosVariables(rubrosvariables);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		rubrosvariablesAux.setId(rubrosvariables.getId());
		rubrosvariablesAux.setVersionRow(rubrosvariables.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(RubrosVariables rubrosvariablesLocal) throws Exception {
		
		if(this.rubrosvariablesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(RubrosVariables rubrosvariablesLocal) throws Exception {	
		if(this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(TipoContratoDetalleFormJInternalFrame.class)) {
				TipoContratoBeanSwingJInternalFrame tipocontratoBeanSwingJInternalFrameLocal=(TipoContratoBeanSwingJInternalFrame) ((TipoContratoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocontratoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoContrato(tipocontratoBeanSwingJInternalFrameLocal.gettipocontrato(),true);
				tipocontratoBeanSwingJInternalFrameLocal.actualizarLista(tipocontratoBeanSwingJInternalFrameLocal.tipocontrato,this.tipocontratosForeignKey);

				tipocontratoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocontratoBeanSwingJInternalFrameLocal.tipocontrato);

				rubrosvariablesLocal.setTipoContrato(tipocontratoBeanSwingJInternalFrameLocal.tipocontrato);

				this.addItemDefectoCombosForeignKeyTipoContrato();
				this.cargarCombosFrameTipoContratosForeignKey("Formulario");
				this.setActualTipoContratoForeignKey(tipocontratoBeanSwingJInternalFrameLocal.tipocontrato.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				rubrosvariablesLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(RubroEmpleaDetalleFormJInternalFrame.class)) {
				RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrameLocal=(RubroEmpleaBeanSwingJInternalFrame) ((RubroEmpleaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				rubroempleaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoRubroEmplea(rubroempleaBeanSwingJInternalFrameLocal.getrubroemplea(),true);
				rubroempleaBeanSwingJInternalFrameLocal.actualizarLista(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea,this.rubroempleasForeignKey);

				rubroempleaBeanSwingJInternalFrameLocal.actualizarRelaciones(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea);

				rubrosvariablesLocal.setRubroEmplea(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea);

				this.addItemDefectoCombosForeignKeyRubroEmplea();
				this.cargarCombosFrameRubroEmpleasForeignKey("Formulario");
				this.setActualRubroEmpleaForeignKey(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarRubrosVariablesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.rubrosvariables =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.rubrosvariables =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = rubrosvariablesValidator.getInvalidValues(this.rubrosvariables);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(RubrosVariables rubrosvariables,List<RubrosVariables> rubrosvariabless) throws Exception {
	}		
	
	public void actualizarSelectedLista(RubrosVariables rubrosvariables,List<RubrosVariables> rubrosvariabless) throws Exception {
		try	{			
			RubrosVariablesConstantesFunciones.actualizarSelectedLista(rubrosvariables,rubrosvariabless);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<RubrosVariables> rubrosvariablessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				rubrosvariablessLocal=this.rubrosvariablesLogic.getRubrosVariabless();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				rubrosvariablessLocal=this.rubrosvariabless;
			}
			//ARCHITECTURE
		
			for(RubrosVariables rubrosvariablesLocal:rubrosvariablessLocal) {
				if(this.permiteMantenimiento(rubrosvariablesLocal) && rubrosvariablesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+RubrosVariablesConstantesFunciones.getRubrosVariablesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(RubrosVariablesConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubrosVariables.jLabelcodigoRubrosVariables,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RubrosVariablesConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubrosVariables.jLabelnombreRubrosVariables,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RubrosVariablesConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubrosVariables.jLabelfechaRubrosVariables,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RubrosVariablesConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubrosVariables.jLabelvalorRubrosVariables,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RubrosVariablesConstantesFunciones.NOMBRERUBROEMPLEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubrosVariables.jLabelnombre_rubro_empleaRubrosVariables,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRubrosVariables.jLabelcodigoRubrosVariables,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRubrosVariables.jLabelnombreRubrosVariables,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRubrosVariables.jLabelfechaRubrosVariables,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRubrosVariables.jLabelvalorRubrosVariables,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRubrosVariables.jLabelnombre_rubro_empleaRubrosVariables,"");
		
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
		this.iIdNuevoRubrosVariables--;	
		
		
		this.rubrosvariablesAux=new RubrosVariables();
		
		this.rubrosvariablesAux.setId(this.iIdNuevoRubrosVariables);
		this.rubrosvariablesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.rubrosvariablesLogic.getRubrosVariabless().add(this.rubrosvariablesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.rubrosvariabless.add(this.rubrosvariablesAux);
		}
		//ARCHITECTURE
		
		this.rubrosvariables=this.rubrosvariablesAux;
		
		if(RubrosVariablesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioRubrosVariables(this.rubrosvariables);
			this.setVariablesObjetoActualToFormularioForeignKeyRubrosVariables(this.rubrosvariables);
		}
				
		//this.setDefaultControlesRubrosVariables();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyRubrosVariables();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyRubrosVariables();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyRubrosVariables();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRubrosVariables(this.rubrosvariablesBean,this.rubrosvariables,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanRubrosVariables(this.rubrosvariablesReturnGeneral,this.rubrosvariablesBean,false);
		
		if(this.rubrosvariablesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyRubrosVariables(this.rubrosvariablesReturnGeneral.getRubrosVariables());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioRubrosVariables(this.rubrosvariablesReturnGeneral.getRubrosVariables());
		}
		
		if(this.rubrosvariablesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioRubrosVariables(this.rubrosvariablesReturnGeneral.getRubrosVariables(),classes);//this.rubrosvariablesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualRubrosVariables(this.rubrosvariables,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyRubrosVariables();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyRubrosVariables();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RubrosVariablesBeanSwingJInternalFrameAdditional.RecargarFormRubrosVariables(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingRubrosVariables(false);
						
			if(rubrosvariablesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(RubrosVariablesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRubrosVariables();
			}
			
			this.actualizarVisualTableDatosRubrosVariables();
			
			this.jTableDatosRubrosVariables.setRowSelectionInterval(this.getIndiceNuevoRubrosVariables(), this.getIndiceNuevoRubrosVariables());
			
			this.seleccionarFilaTablaRubrosVariablesActual();
						
			this.actualizarEstadoCeldasBotonesRubrosVariables("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesRubrosVariables(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormRubrosVariables.jDateChooserfecha_desdeRubrosVariables.setEnabled(isHabilitar && this.rubrosvariablesConstantesFunciones.activarfecha_desdeRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jDateChooserfecha_hastaRubrosVariables.setEnabled(isHabilitar && this.rubrosvariablesConstantesFunciones.activarfecha_hastaRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jTextFieldcodigoRubrosVariables.setEnabled(isHabilitar && this.rubrosvariablesConstantesFunciones.activarcodigoRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jTextAreanombreRubrosVariables.setEnabled(isHabilitar && this.rubrosvariablesConstantesFunciones.activarnombreRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jDateChooserfechaRubrosVariables.setEnabled(isHabilitar && this.rubrosvariablesConstantesFunciones.activarfechaRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jTextFieldvalorRubrosVariables.setEnabled(isHabilitar && this.rubrosvariablesConstantesFunciones.activarvalorRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jTextAreanombre_rubro_empleaRubrosVariables.setEnabled(isHabilitar && this.rubrosvariablesConstantesFunciones.activarnombre_rubro_empleaRubrosVariables);	
		
		this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_tipo_contratoRubrosVariables.setEnabled(isHabilitar && this.rubrosvariablesConstantesFunciones.activarid_tipo_contratoRubrosVariables);//
		this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_empresaRubrosVariables.setEnabled(isHabilitar && this.rubrosvariablesConstantesFunciones.activarid_empresaRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_rubro_empleaRubrosVariables.setEnabled(isHabilitar && this.rubrosvariablesConstantesFunciones.activarid_rubro_empleaRubrosVariables);
	};
	
	public void setDefaultControlesRubrosVariables() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoRubrosVariables(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.rubrosvariablesSessionBean.setConGuardarRelaciones(true);			
			this.rubrosvariablesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormRubrosVariables.jTabbedPaneRelacionesRubrosVariables.setVisible(true);
			
					
		} else {
			//this.rubrosvariablesSessionBean.setConGuardarRelaciones(false);			
			this.rubrosvariablesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormRubrosVariables.jTabbedPaneRelacionesRubrosVariables.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoRubrosVariables() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RubrosVariables rubrosvariablesAux:this.rubrosvariablesLogic.getRubrosVariabless()) {
				if(rubrosvariablesAux.getId().equals(this.iIdNuevoRubrosVariables)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RubrosVariables rubrosvariablesAux:this.rubrosvariabless) {
				if(rubrosvariablesAux.getId().equals(this.iIdNuevoRubrosVariables)) {
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
	
	public int getIndiceActualRubrosVariables(RubrosVariables rubrosvariables,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RubrosVariables rubrosvariablesAux:this.rubrosvariablesLogic.getRubrosVariabless()) {
				if(rubrosvariablesAux.getId().equals(rubrosvariables.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RubrosVariables rubrosvariablesAux:this.rubrosvariabless) {
				if(rubrosvariablesAux.getId().equals(rubrosvariables.getId())) {
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
	
	public void setCamposBaseDesdeOriginalRubrosVariables(RubrosVariables rubrosvariablesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RubrosVariables rubrosvariablesAux:this.rubrosvariablesLogic.getRubrosVariabless()) {
				if(rubrosvariablesAux.getRubrosVariablesOriginal().getId().equals(rubrosvariablesOriginal.getId())) {
					existe=true;
					rubrosvariablesOriginal.setId(rubrosvariablesAux.getId());
					rubrosvariablesOriginal.setVersionRow(rubrosvariablesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RubrosVariables rubrosvariablesAux:this.rubrosvariabless) {
				if(rubrosvariablesAux.getRubrosVariablesOriginal().getId().equals(rubrosvariablesOriginal.getId())) {
					existe=true;
					rubrosvariablesOriginal.setId(rubrosvariablesAux.getId());
					rubrosvariablesOriginal.setVersionRow(rubrosvariablesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosRubrosVariables(Boolean esParaCancelar) throws Exception {
		rubrosvariablessAux=new ArrayList<RubrosVariables>();
		rubrosvariablesAux=new RubrosVariables();
		
		if(!this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RubrosVariables rubrosvariablesAux:this.rubrosvariablesLogic.getRubrosVariabless()) {
					if(rubrosvariablesAux.getId()<0) {
						rubrosvariablessAux.add(rubrosvariablesAux);
					}		
				}
				this.iIdNuevoRubrosVariables=0L;
				this.rubrosvariablesLogic.getRubrosVariabless().removeAll(rubrosvariablessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RubrosVariables rubrosvariablesAux:this.rubrosvariabless) {
					if(rubrosvariablesAux.getId()<0) {
						rubrosvariablessAux.add(rubrosvariablesAux);
					}		
				}
				this.iIdNuevoRubrosVariables=0L;
				this.rubrosvariabless.removeAll(rubrosvariablessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoRubrosVariables 
					&& this.rubrosvariablesLogic.getRubrosVariabless().size()>0
					) {
					rubrosvariablesAux=this.rubrosvariablesLogic.getRubrosVariabless().get(this.rubrosvariablesLogic.getRubrosVariabless().size() - 1);
				
					if(rubrosvariablesAux.getId()<0) {
						this.rubrosvariablesLogic.getRubrosVariabless().remove(rubrosvariablesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoRubrosVariables && this.rubrosvariabless.size()>0) {
					rubrosvariablesAux=this.rubrosvariabless.get(this.rubrosvariabless.size() - 1);
				
					if(rubrosvariablesAux.getId()<0) {
						this.rubrosvariabless.remove(rubrosvariablesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoRubrosVariables(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(rubrosvariables.getId()<0) {
				this.rubrosvariablesLogic.getRubrosVariabless().remove(this.rubrosvariables);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(rubrosvariables.getId()<0) {
				this.rubrosvariabless.remove(this.rubrosvariables);
			}
		}			
	}
	
	public void setEstadosInicialesRubrosVariables(List<RubrosVariables> rubrosvariablessAux) throws Exception {
		RubrosVariablesConstantesFunciones.setEstadosInicialesRubrosVariables(rubrosvariablessAux);
	}
	
	public void setEstadosInicialesRubrosVariables(RubrosVariables rubrosvariablesAux) throws Exception {
		RubrosVariablesConstantesFunciones.setEstadosInicialesRubrosVariables(rubrosvariablesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarRubrosVariablesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesRubrosVariables("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarRubrosVariablesActual()) {
				if(!this.isEsNuevoRubrosVariables) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesRubrosVariables("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoRubrosVariables=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarRubrosVariablesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Rubros Variables ?", "MANTENIMIENTO DE Rubros Variables", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesRubrosVariables("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(RubrosVariables rubrosvariables) throws Exception {
		RubrosVariablesConstantesFunciones.seleccionarAsignar(this.rubrosvariables,rubrosvariables);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarRubrosVariables=this.isPermisoActualizarOriginalRubrosVariables;
			
			
			this.seleccionarAsignar(rubrosvariables);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesRubrosVariables("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.rubrosvariablesSessionBean.setsFuncionBusquedaRapida(this.rubrosvariablesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoRubrosVariables) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosRubrosVariables(esParaCancelar);				
				this.cancelarNuevoRubrosVariables(esParaCancelar);								
			}
			
			this.rubrosvariables=new RubrosVariables();
			
			this.inicializarRubrosVariables();
			
			this.actualizarEstadoCeldasBotonesRubrosVariables("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarRubrosVariables() throws Exception {
		try {
			RubrosVariablesConstantesFunciones.inicializarRubrosVariables(this.rubrosvariables);
			
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
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.rubrosvariablesLogic.getRubrosVariabless().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteRubrosVariabless(String sAccionBusqueda,List<RubrosVariables> rubrosvariablessParaReportes) throws Exception {
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
					sPathReporteFinal="RubrosVariables"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="RubrosVariablesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("RubrosVariablesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="RubrosVariables"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Rubros Variableses");		
		parameters.put("busquedapor", RubrosVariablesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceRubrosVariables=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			RubrosVariablesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			RubrosVariablesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceRubrosVariables=new JRBeanArrayDataSource(RubrosVariablesJInternalFrame.TraerRubrosVariablesBeans(rubrosvariablessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceRubrosVariables);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+RubrosVariablesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+RubrosVariablesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(RubrosVariablesBean.TraerRubrosVariablesBeans(rubrosvariablessParaReportes).toArray()));
							
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
				this.generarExcelReporteRubrosVariabless(sAccionBusqueda,sTipoArchivoReporte,rubrosvariablessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalRubrosVariabless(sAccionBusqueda,sTipoArchivoReporte,rubrosvariablessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoRubrosVariablesActionPerformed(null);
					//this.generarExcelReporteRubrosVariabless(sAccionBusqueda,sTipoArchivoReporte,rubrosvariablessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalRubrosVariabless(sAccionBusqueda,sTipoArchivoReporte,rubrosvariablessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesRubrosVariabless(sAccionBusqueda,sTipoArchivoReporte,rubrosvariablessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesRubrosVariabless(sAccionBusqueda,sTipoArchivoReporte,rubrosvariablessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRubrosVariabless(String sAccionBusqueda,String sTipoArchivoReporte,List<RubrosVariables> rubrosvariablessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubrosvariables";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RubrosVariabless");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRubrosVariables("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(RubrosVariables rubrosvariables : rubrosvariablessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			RubrosVariablesConstantesFunciones.generarExcelReporteDataRubrosVariables("NORMAL",row,workbook,rubrosvariables,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubros Variables",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderRubrosVariables(String sTipo,Row row,Workbook workbook) {
		
		RubrosVariablesConstantesFunciones.generarExcelReporteHeaderRubrosVariables(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalRubrosVariabless(String sAccionBusqueda,String sTipoArchivoReporte,List<RubrosVariables> rubrosvariablessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubrosvariables_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RubrosVariabless");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(RubrosVariables rubrosvariables : rubrosvariablessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(RubrosVariablesConstantesFunciones.getRubrosVariablesDescripcion(rubrosvariables));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubrosVariablesConstantesFunciones.LABEL_IDTIPOCONTRATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_IDTIPOCONTRATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubrosvariables.gettipocontrato_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubrosVariablesConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubrosvariables.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubrosVariablesConstantesFunciones.LABEL_IDRUBROEMPLEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_IDRUBROEMPLEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubrosvariables.getrubroemplea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubrosVariablesConstantesFunciones.LABEL_FECHADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_FECHADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubrosvariables.getfecha_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubrosVariablesConstantesFunciones.LABEL_FECHAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_FECHAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubrosvariables.getfecha_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubrosVariablesConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubrosvariables.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubrosVariablesConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubrosvariables.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubrosVariablesConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubrosvariables.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubrosVariablesConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubrosvariables.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RubrosVariablesConstantesFunciones.LABEL_NOMBRERUBROEMPLEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_NOMBRERUBROEMPLEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rubrosvariables.getnombre_rubro_emplea());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubros Variables",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesRubrosVariabless(String sAccionBusqueda,String sTipoArchivoReporte,List<RubrosVariables> rubrosvariablessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<RubrosVariables> rubrosvariablessRespaldo=null;
		
		classes=RubrosVariablesConstantesFunciones.getClassesRelationshipsOfRubrosVariables(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.rubrosvariablesLogic.setDatosCliente(this.datosCliente);
		this.rubrosvariablesLogic.setDatosDeep(this.datosDeep);
		this.rubrosvariablesLogic.setIsConDeep(true);
		
		rubrosvariablessRespaldo=this.rubrosvariablesLogic.getRubrosVariabless();
		
		this.rubrosvariablesLogic.setRubrosVariabless(rubrosvariablessParaReportes);	
		this.rubrosvariablesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		rubrosvariablessParaReportes=this.rubrosvariablesLogic.getRubrosVariabless();
		this.rubrosvariablesLogic.setRubrosVariabless(rubrosvariablessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubrosvariables_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RubrosVariabless");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRubrosVariables("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(RubrosVariables rubrosvariables : rubrosvariablessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderRubrosVariables("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			RubrosVariablesConstantesFunciones.generarExcelReporteDataRubrosVariables("NORMAL",row,workbook,rubrosvariables,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(RubrosVariablesConstantesFunciones.getRubrosVariablesDescripcion(rubrosvariables));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubros Variables",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoRubrosVariables.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRubrosVariables.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoRubrosVariables.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRubrosVariables.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessRubrosVariables() throws Exception {		
		this.startProcessRubrosVariables(true);
	}
	
	public void startProcessRubrosVariables(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasRubrosVariables ,this.jPanelParametrosReportesRubrosVariables, this.jScrollPanelDatosRubrosVariables,this.jPanelPaginacionRubrosVariables, this.jScrollPanelDatosEdicionRubrosVariables, this.jPanelAccionesRubrosVariables,this.jPanelAccionesFormularioRubrosVariables,this.jmenuBarRubrosVariables,this.jmenuBarDetalleRubrosVariables,this.jTtoolBarRubrosVariables,this.jTtoolBarDetalleRubrosVariables);		
		
		final JTabbedPane jTabbedPaneBusquedasRubrosVariables=this.jTabbedPaneBusquedasRubrosVariables; 
		
		final JPanel jPanelParametrosReportesRubrosVariables=this.jPanelParametrosReportesRubrosVariables;
		//final JScrollPane jScrollPanelDatosRubrosVariables=this.jScrollPanelDatosRubrosVariables;
		final JTable jTableDatosRubrosVariables=this.jTableDatosRubrosVariables;		
		final JPanel jPanelPaginacionRubrosVariables=this.jPanelPaginacionRubrosVariables;
		//final JScrollPane jScrollPanelDatosEdicionRubrosVariables=this.jScrollPanelDatosEdicionRubrosVariables;
		final JPanel jPanelAccionesRubrosVariables=this.jPanelAccionesRubrosVariables;
		
		JPanel jPanelCamposAuxiliarRubrosVariables=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarRubrosVariables=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
			jPanelCamposAuxiliarRubrosVariables=this.jInternalFrameDetalleFormRubrosVariables.jPanelCamposRubrosVariables;
			jPanelAccionesFormularioAuxiliarRubrosVariables=this.jInternalFrameDetalleFormRubrosVariables.jPanelAccionesFormularioRubrosVariables;
		}
		
		final JPanel jPanelCamposRubrosVariables=jPanelCamposAuxiliarRubrosVariables;
		final JPanel jPanelAccionesFormularioRubrosVariables=jPanelAccionesFormularioAuxiliarRubrosVariables;
		
		
		final JMenuBar jmenuBarRubrosVariables=this.jmenuBarRubrosVariables;
		final JToolBar jTtoolBarRubrosVariables=this.jTtoolBarRubrosVariables;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarRubrosVariables=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRubrosVariables=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
			jmenuBarDetalleAuxiliarRubrosVariables=this.jInternalFrameDetalleFormRubrosVariables.jmenuBarDetalleRubrosVariables;
			jTtoolBarDetalleAuxiliarRubrosVariables=this.jInternalFrameDetalleFormRubrosVariables.jTtoolBarDetalleRubrosVariables;
		}
		
		final JMenuBar jmenuBarDetalleRubrosVariables=jmenuBarDetalleAuxiliarRubrosVariables;
		final JToolBar jTtoolBarDetalleRubrosVariables=jTtoolBarDetalleAuxiliarRubrosVariables;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRubrosVariables;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRubrosVariables;
			processRunnable.jTableDatos=jTableDatosRubrosVariables;
			processRunnable.jPanelCampos=jPanelCamposRubrosVariables;
			processRunnable.jPanelPaginacion=jPanelPaginacionRubrosVariables;
			processRunnable.jPanelAcciones=jPanelAccionesRubrosVariables;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRubrosVariables;
			
			
			processRunnable.jmenuBar=jmenuBarRubrosVariables;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRubrosVariables;
			processRunnable.jTtoolBar=jTtoolBarRubrosVariables;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRubrosVariables;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRubrosVariables ,jPanelParametrosReportesRubrosVariables,jTableDatosRubrosVariables, /*jScrollPanelDatosRubrosVariables,*/jPanelCamposRubrosVariables,jPanelPaginacionRubrosVariables, /*jScrollPanelDatosEdicionRubrosVariables,*/ jPanelAccionesRubrosVariables,jPanelAccionesFormularioRubrosVariables,jmenuBarRubrosVariables,jmenuBarDetalleRubrosVariables,jTtoolBarRubrosVariables,jTtoolBarDetalleRubrosVariables);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRubrosVariables ,jPanelParametrosReportesRubrosVariables, jScrollPanelDatosRubrosVariables,jPanelPaginacionRubrosVariables, jScrollPanelDatosEdicionRubrosVariables, jPanelAccionesRubrosVariables,jPanelAccionesFormularioRubrosVariables,jmenuBarRubrosVariables,jmenuBarDetalleRubrosVariables,jTtoolBarRubrosVariables,jTtoolBarDetalleRubrosVariables);
						
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
	
	public void finishProcessRubrosVariables() {// throws Exception 
		this.finishProcessRubrosVariables(true);
	}
	
	public void finishProcessRubrosVariables(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasRubrosVariables ,this.jPanelParametrosReportesRubrosVariables, this.jScrollPanelDatosRubrosVariables,this.jPanelPaginacionRubrosVariables, this.jScrollPanelDatosEdicionRubrosVariables, this.jPanelAccionesRubrosVariables,this.jPanelAccionesFormularioRubrosVariables,this.jmenuBarRubrosVariables,this.jmenuBarDetalleRubrosVariables,this.jTtoolBarRubrosVariables,this.jTtoolBarDetalleRubrosVariables);		
		
		final JTabbedPane jTabbedPaneBusquedasRubrosVariables=this.jTabbedPaneBusquedasRubrosVariables; 
		
		final JPanel jPanelParametrosReportesRubrosVariables=this.jPanelParametrosReportesRubrosVariables;
		//final JScrollPane jScrollPanelDatosRubrosVariables=this.jScrollPanelDatosRubrosVariables;
		final JTable jTableDatosRubrosVariables=this.jTableDatosRubrosVariables;		
		final JPanel jPanelPaginacionRubrosVariables=this.jPanelPaginacionRubrosVariables;
		//final JScrollPane jScrollPanelDatosEdicionRubrosVariables=this.jScrollPanelDatosEdicionRubrosVariables;
		final JPanel jPanelAccionesRubrosVariables=this.jPanelAccionesRubrosVariables;
		
		JPanel jPanelCamposAuxiliarRubrosVariables=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarRubrosVariables=new JPanel();
		
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
			jPanelCamposAuxiliarRubrosVariables=this.jInternalFrameDetalleFormRubrosVariables.jPanelCamposRubrosVariables;
			jPanelAccionesFormularioAuxiliarRubrosVariables=this.jInternalFrameDetalleFormRubrosVariables.jPanelAccionesFormularioRubrosVariables;
		}
		
		final JPanel jPanelCamposRubrosVariables=jPanelCamposAuxiliarRubrosVariables;
		final JPanel jPanelAccionesFormularioRubrosVariables=jPanelAccionesFormularioAuxiliarRubrosVariables;
		
		
		final JMenuBar jmenuBarRubrosVariables=this.jmenuBarRubrosVariables;		
		final JToolBar jTtoolBarRubrosVariables=this.jTtoolBarRubrosVariables;
				
		JMenuBar jmenuBarDetalleAuxiliarRubrosVariables=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRubrosVariables=new JToolBar();
		
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
			jmenuBarDetalleAuxiliarRubrosVariables=this.jInternalFrameDetalleFormRubrosVariables.jmenuBarDetalleRubrosVariables;
			jTtoolBarDetalleAuxiliarRubrosVariables=this.jInternalFrameDetalleFormRubrosVariables.jTtoolBarDetalleRubrosVariables;		
		}
		
		final JMenuBar jmenuBarDetalleRubrosVariables=jmenuBarDetalleAuxiliarRubrosVariables;
		final JToolBar jTtoolBarDetalleRubrosVariables=jTtoolBarDetalleAuxiliarRubrosVariables;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRubrosVariables;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRubrosVariables;
			processRunnable.jTableDatos=jTableDatosRubrosVariables;
			processRunnable.jPanelCampos=jPanelCamposRubrosVariables;
			processRunnable.jPanelPaginacion=jPanelPaginacionRubrosVariables;
			processRunnable.jPanelAcciones=jPanelAccionesRubrosVariables;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRubrosVariables;
			
			
			processRunnable.jmenuBar=jmenuBarRubrosVariables;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRubrosVariables;
			processRunnable.jTtoolBar=jTtoolBarRubrosVariables;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRubrosVariables;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasRubrosVariables ,jPanelParametrosReportesRubrosVariables, jTableDatosRubrosVariables,/*jScrollPanelDatosRubrosVariables,*/jPanelCamposRubrosVariables,jPanelPaginacionRubrosVariables, /*jScrollPanelDatosEdicionRubrosVariables,*/ jPanelAccionesRubrosVariables,jPanelAccionesFormularioRubrosVariables,jmenuBarRubrosVariables,jmenuBarDetalleRubrosVariables,jTtoolBarRubrosVariables,jTtoolBarDetalleRubrosVariables));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesRubrosVariables(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarRubrosVariables(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuRubrosVariables(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarRubrosVariables(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarRubrosVariables,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRubrosVariables,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuRubrosVariables(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarRubrosVariables,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRubrosVariables,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.rubrosvariablesConstantesFunciones.getsFinalQueryRubrosVariables();
		String  finalQueryPaginacionTodos=this.rubrosvariablesConstantesFunciones.getsFinalQueryRubrosVariables();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=RubrosVariablesConstantesFunciones.getArrayColumnasGlobalesNoRubrosVariables(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=RubrosVariablesConstantesFunciones.getArrayColumnasGlobalesRubrosVariables(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,RubrosVariablesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.rubrosvariablessEliminados= new ArrayList<RubrosVariables>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessRubrosVariables();
		
				///*RubrosVariablesSessionBean*/this.rubrosvariablesSessionBean=new RubrosVariablesSessionBean();
			
			if(this.rubrosvariablesSessionBean==null) {
				this.rubrosvariablesSessionBean=new RubrosVariablesSessionBean();
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
					this.iNumeroPaginacion=RubrosVariablesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=RubrosVariablesConstantesFunciones.getClassesForeignKeysOfRubrosVariables(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/rubrosvariables."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			rubrosvariablessAux= new ArrayList<RubrosVariables>();
			
				
			rubrosvariablesLogic.setDatosCliente(this.datosCliente);
			rubrosvariablesLogic.setDatosDeep(this.datosDeep);
			rubrosvariablesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaRubrosVariables")) {
				this.sDetalleReporte=RubrosVariablesConstantesFunciones.getDetalleIndiceBusquedaRubrosVariables(id_tipo_contratoBusquedaRubrosVariables,id_rubro_empleaBusquedaRubrosVariables,fecha_desdeBusquedaRubrosVariables,fecha_hastaBusquedaRubrosVariables);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rubrosvariablesLogic.getRubrosVariablessBusquedaRubrosVariables(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_tipo_contratoBusquedaRubrosVariables,id_rubro_empleaBusquedaRubrosVariables,fecha_desdeBusquedaRubrosVariables,fecha_hastaBusquedaRubrosVariables);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubrosVariablesConstantesFunciones.getDetalleIndiceBusquedaRubrosVariables(id_tipo_contratoBusquedaRubrosVariables,id_rubro_empleaBusquedaRubrosVariables,fecha_desdeBusquedaRubrosVariables,fecha_hastaBusquedaRubrosVariables);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubrosVariablesConstantesFunciones.getDetalleIndiceBusquedaRubrosVariables(id_tipo_contratoBusquedaRubrosVariables,id_rubro_empleaBusquedaRubrosVariables,fecha_desdeBusquedaRubrosVariables,fecha_hastaBusquedaRubrosVariables);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rubrosvariablesLogic.getRubrosVariabless()==null||rubrosvariablesLogic.getRubrosVariabless().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rubrosvariabless==null|| rubrosvariabless.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rubrosvariablessAux=new ArrayList<RubrosVariables>();
						rubrosvariablessAux.addAll(rubrosvariablesLogic.getRubrosVariabless());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubrosvariablessAux=new ArrayList<RubrosVariables>();
							rubrosvariablessAux.addAll(rubrosvariabless);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rubrosvariablesLogic.getRubrosVariablessBusquedaRubrosVariables(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_tipo_contratoBusquedaRubrosVariables,id_rubro_empleaBusquedaRubrosVariables,fecha_desdeBusquedaRubrosVariables,fecha_hastaBusquedaRubrosVariables);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RubrosVariablesConstantesFunciones.getDetalleIndiceBusquedaRubrosVariables(id_tipo_contratoBusquedaRubrosVariables,id_rubro_empleaBusquedaRubrosVariables,fecha_desdeBusquedaRubrosVariables,fecha_hastaBusquedaRubrosVariables);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RubrosVariablesConstantesFunciones.getDetalleIndiceBusquedaRubrosVariables(id_tipo_contratoBusquedaRubrosVariables,id_rubro_empleaBusquedaRubrosVariables,fecha_desdeBusquedaRubrosVariables,fecha_hastaBusquedaRubrosVariables);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRubrosVariabless("BusquedaRubrosVariables",rubrosvariablesLogic.getRubrosVariabless());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRubrosVariabless("BusquedaRubrosVariables",rubrosvariabless);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rubrosvariablesLogic.setRubrosVariabless(new ArrayList<RubrosVariables>());
						rubrosvariablesLogic.getRubrosVariabless().addAll(rubrosvariablessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubrosvariabless=new ArrayList<RubrosVariables>();
							rubrosvariabless.addAll(rubrosvariablessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesRubrosVariables();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessRubrosVariables();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=rubrosvariablesLogic.getRubrosVariabless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rubrosvariabless.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=rubrosvariablesLogic.getRubrosVariabless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rubrosvariabless.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(RubrosVariables rubrosvariables) {
		Boolean permite=true;
		
		if(this.rubrosvariables.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=RubrosVariablesConstantesFunciones.getOrderByListaRubrosVariables();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=RubrosVariablesConstantesFunciones.getOrderByListaRubrosVariables();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RubrosVariables rubrosvariables:rubrosvariablesLogic.getRubrosVariabless()) {
				if(rubrosvariables.getsType().equals(Constantes2.S_TOTALES)) {
					rubrosvariablesTotales=rubrosvariables;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RubrosVariables rubrosvariables:this.rubrosvariabless) {
				if(rubrosvariables.getsType().equals(Constantes2.S_TOTALES)) {
					rubrosvariablesTotales=rubrosvariables;
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
			this.rubrosvariablesAux=new RubrosVariables();
			this.rubrosvariablesAux.setsType(Constantes2.S_TOTALES);
			this.rubrosvariablesAux.setIsNew(false);
			this.rubrosvariablesAux.setIsChanged(false);
			this.rubrosvariablesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//RubrosVariablesConstantesFunciones.TotalizarValoresFilaRubrosVariables(this.rubrosvariablesLogic.getRubrosVariabless(),this.rubrosvariablesAux);
				
				//this.rubrosvariablesLogic.getRubrosVariabless().add(this.rubrosvariablesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				RubrosVariablesConstantesFunciones.TotalizarValoresFilaRubrosVariables(this.rubrosvariabless,this.rubrosvariablesAux);
				
				this.rubrosvariabless.add(this.rubrosvariablesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		rubrosvariablesTotales=new RubrosVariables();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.rubrosvariablesLogic.getRubrosVariabless().remove(rubrosvariablesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.rubrosvariabless.remove(rubrosvariablesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		rubrosvariablesTotales=new RubrosVariables();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RubrosVariables rubrosvariables:rubrosvariablesLogic.getRubrosVariabless()) {
				if(rubrosvariables.getsType().equals(Constantes2.S_TOTALES)) {
					rubrosvariablesTotales=rubrosvariables;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RubrosVariablesConstantesFunciones.TotalizarValoresFilaRubrosVariables(this.rubrosvariablesLogic.getRubrosVariabless(),rubrosvariablesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RubrosVariables rubrosvariables:this.rubrosvariabless) {
				if(rubrosvariables.getsType().equals(Constantes2.S_TOTALES)) {
					rubrosvariablesTotales=rubrosvariables;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RubrosVariablesConstantesFunciones.TotalizarValoresFilaRubrosVariables(this.rubrosvariabless,rubrosvariablesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getRubrosVariablessBusquedaRubrosVariables()throws Exception {
		try {
			sAccionBusqueda="BusquedaRubrosVariables";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRubrosVariablessFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRubrosVariablessFK_IdRubroEmplea()throws Exception {
		try {
			sAccionBusqueda="FK_IdRubroEmplea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRubrosVariablessFK_IdTipoContrato()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoContrato";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getRubrosVariablessBusquedaRubrosVariables(String sFinalQuery,Long id_tipo_contrato,Long id_rubro_emplea,Date fecha_desde,Date fecha_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//rubrosvariablesLogic.getRubrosVariablessBusquedaRubrosVariables(sFinalQuery,this.pagination,id_tipo_contrato,id_rubro_emplea,fecha_desde,fecha_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRubrosVariablessFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//rubrosvariablesLogic.getRubrosVariablessFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRubrosVariablessFK_IdRubroEmplea(String sFinalQuery,Long id_rubro_emplea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//rubrosvariablesLogic.getRubrosVariablessFK_IdRubroEmplea(sFinalQuery,this.pagination,id_rubro_emplea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRubrosVariablessFK_IdTipoContrato(String sFinalQuery,Long id_tipo_contrato)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//rubrosvariablesLogic.getRubrosVariablessFK_IdTipoContrato(sFinalQuery,this.pagination,id_tipo_contrato);
				
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
	
	public void inicializarPermisosRubrosVariables() {
		this.isPermisoTodoRubrosVariables=false;
		this.isPermisoNuevoRubrosVariables=false;
		this.isPermisoActualizarRubrosVariables=false;
		this.isPermisoActualizarOriginalRubrosVariables=false;
		this.isPermisoEliminarRubrosVariables=false;
		this.isPermisoGuardarCambiosRubrosVariables=false;
		this.isPermisoConsultaRubrosVariables=true;
		this.isPermisoBusquedaRubrosVariables=true;
		this.isPermisoReporteRubrosVariables=true;
		this.isPermisoOrdenRubrosVariables=false;		
		this.isPermisoPaginacionMedioRubrosVariables=false;		
		this.isPermisoPaginacionAltoRubrosVariables=false;		
		this.isPermisoPaginacionTodoRubrosVariables=false;		
		this.isPermisoCopiarRubrosVariables=false;		
		this.isPermisoVerFormRubrosVariables=false;		
		this.isPermisoDuplicarRubrosVariables=false;
		this.isPermisoOrdenRubrosVariables=false;
	}
	
	public void setPermisosUsuarioRubrosVariables(Boolean isPermiso) {
		this.isPermisoTodoRubrosVariables=isPermiso;
		this.isPermisoNuevoRubrosVariables=isPermiso;
		this.isPermisoActualizarRubrosVariables=isPermiso;
		this.isPermisoActualizarOriginalRubrosVariables=isPermiso;
		this.isPermisoEliminarRubrosVariables=isPermiso;
		this.isPermisoGuardarCambiosRubrosVariables=isPermiso;
		this.isPermisoConsultaRubrosVariables=isPermiso;
		this.isPermisoBusquedaRubrosVariables=isPermiso;
		this.isPermisoReporteRubrosVariables=isPermiso;
		this.isPermisoOrdenRubrosVariables=isPermiso;		
		this.isPermisoPaginacionMedioRubrosVariables=isPermiso;		
		this.isPermisoPaginacionAltoRubrosVariables=isPermiso;		
		this.isPermisoPaginacionTodoRubrosVariables=isPermiso;		
		this.isPermisoCopiarRubrosVariables=isPermiso;		
		this.isPermisoVerFormRubrosVariables=isPermiso;		
		this.isPermisoDuplicarRubrosVariables=isPermiso;
		this.isPermisoOrdenRubrosVariables=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioRubrosVariables(Boolean isPermiso) {
		//this.isPermisoTodoRubrosVariables=isPermiso;
		this.isPermisoNuevoRubrosVariables=isPermiso;
		this.isPermisoActualizarRubrosVariables=isPermiso;
		this.isPermisoActualizarOriginalRubrosVariables=isPermiso;
		this.isPermisoEliminarRubrosVariables=isPermiso;
		this.isPermisoGuardarCambiosRubrosVariables=isPermiso;
		//this.isPermisoConsultaRubrosVariables=isPermiso;
		//this.isPermisoBusquedaRubrosVariables=isPermiso;
		//this.isPermisoReporteRubrosVariables=isPermiso;
		//this.isPermisoOrdenRubrosVariables=isPermiso;		
		//this.isPermisoPaginacionMedioRubrosVariables=isPermiso;		
		//this.isPermisoPaginacionAltoRubrosVariables=isPermiso;		
		//this.isPermisoPaginacionTodoRubrosVariables=isPermiso;		
		//this.isPermisoCopiarRubrosVariables=isPermiso;		
		//this.isPermisoDuplicarRubrosVariables=isPermiso;
		//this.isPermisoOrdenRubrosVariables=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioRubrosVariablesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(RubrosVariablesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebRubrosVariables(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioRubrosVariablesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioRubrosVariablesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionRubrosVariablesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioRubrosVariablesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioRubrosVariables() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(RubrosVariablesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, RubrosVariablesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoRubrosVariables=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarRubrosVariables=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalRubrosVariables=this.isPermisoActualizarRubrosVariables;
			this.isPermisoEliminarRubrosVariables=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosRubrosVariables=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaRubrosVariables=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaRubrosVariables=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoRubrosVariables=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteRubrosVariables=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRubrosVariables=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioRubrosVariables=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoRubrosVariables=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoRubrosVariables=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarRubrosVariables=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormRubrosVariables=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarRubrosVariables=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRubrosVariables=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosRubrosVariables.setToolTipText(this.jTableDatosRubrosVariables.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioRubrosVariables(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioRubrosVariables(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(RubrosVariablesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(RubrosVariablesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioRubrosVariables() throws Exception {
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
	public void inicializarCombosForeignKeyRubrosVariablesListas()throws Exception {
		try	{						
			
				this.tipocontratosForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.rubroempleasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyRubrosVariablesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(RubrosVariablesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyTipoContratoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyRubroEmpleaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyRubroEmpleaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.rubroempleasForeignKey==null||this.rubroempleasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=RubroEmpleaConstantesFunciones.getArrayColumnasGlobalesRubroEmplea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RubroEmpleaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=RubroEmpleaConstantesFunciones.SFINALQUERY;

				this.cargarCombosRubroEmpleasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyRubrosVariables()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyTipoContrato();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyRubroEmplea();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyTipoContrato()throws Exception {
		try {
			if(this.rubrosvariablesSessionBean==null) {
				this.rubrosvariablesSessionBean=new RubrosVariablesSessionBean();
			}

			if(!this.rubrosvariablesSessionBean.getisBusquedaDesdeForeignKeySesionTipoContrato()) {
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

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.rubrosvariablesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyRubroEmplea()throws Exception {
		try {

			if(!this.rubrosvariablesSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {
				RubroEmplea rubroemplea=new RubroEmplea();
				RubroEmpleaConstantesFunciones.setRubroEmpleaDescripcion(rubroemplea,Constantes.SMENSAJE_ESCOJA_OPCION);
				rubroemplea.setId(null);

				if(!RubroEmpleaConstantesFunciones.ExisteEnLista(this.rubroempleasForeignKey,rubroemplea,true)) {

					this.rubroempleasForeignKey.add(0,rubroemplea);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyRubrosVariables()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyRubrosVariables(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyRubrosVariables()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyRubrosVariables();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyRubrosVariables(RubrosVariables rubrosvariables)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyRubrosVariables(RubrosVariables rubrosvariables,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyRubrosVariables()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyRubrosVariables()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyRubrosVariables()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyRubrosVariables()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroRubrosVariables()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyRubrosVariables()throws Exception {
		try {
			

			this.cargarCombosFrameTipoContratosForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameRubroEmpleasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyRubrosVariables(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameTipoContratosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameRubroEmpleasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyRubrosVariables()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_tipo_contratoRubrosVariables!=null && this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_tipo_contratoRubrosVariables.getItemCount()>0) {
				this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_tipo_contratoRubrosVariables.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_empresaRubrosVariables!=null && this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_empresaRubrosVariables.getItemCount()>0) {
				this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_empresaRubrosVariables.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_rubro_empleaRubrosVariables!=null && this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_rubro_empleaRubrosVariables.getItemCount()>0) {
				this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_rubro_empleaRubrosVariables.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public RubrosVariablesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public RubrosVariablesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public RubrosVariablesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.rubrosvariablesSessionBean=new RubrosVariablesSessionBean(); 
		this.rubrosvariablesConstantesFunciones=new RubrosVariablesConstantesFunciones(); 
		this.rubrosvariablesBean=new RubrosVariables();//(this.rubrosvariablesConstantesFunciones); 		
		this.rubrosvariablesReturnGeneral=new RubrosVariablesParameterReturnGeneral(); 
		
		this.rubrosvariablesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rubrosvariablesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public RubrosVariablesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public RubrosVariablesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public RubrosVariablesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessRubrosVariables(true);
			
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
			
			this.rubrosvariablesConstantesFunciones=new RubrosVariablesConstantesFunciones(); 
			this.rubrosvariablesBean=new RubrosVariables();//this.rubrosvariablesConstantesFunciones); 			
			this.rubrosvariablesReturnGeneral=new RubrosVariablesParameterReturnGeneral(); 
		
			RubrosVariablesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Rubros Variables Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.rubrosvariables=new RubrosVariables();
			this.rubrosvariabless = new ArrayList<RubrosVariables>();
			this.rubrosvariablessAux = new ArrayList<RubrosVariables>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic=new RubrosVariablesLogic();
				this.rubrosvariablesLogic.getNewConnexionToDeep("");
			}
			
			//this.rubrosvariablesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.rubrosvariablesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormRubrosVariables);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoRubrosVariables!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRubrosVariables);	
					}
					
					if(this.jInternalFrameImportacionRubrosVariables!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRubrosVariables);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByRubrosVariables!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByRubrosVariables);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormRubrosVariables!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormRubrosVariables);
				this.jInternalFrameDetalleFormRubrosVariables.setVisible(false);
				this.jInternalFrameDetalleFormRubrosVariables.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoRubrosVariables!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRubrosVariables);
					this.jInternalFrameReporteDinamicoRubrosVariables.setVisible(false);
					this.jInternalFrameReporteDinamicoRubrosVariables.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionRubrosVariables!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionRubrosVariables);
					this.jInternalFrameImportacionRubrosVariables.setVisible(false);
					this.jInternalFrameImportacionRubrosVariables.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByRubrosVariables!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByRubrosVariables);
					this.jInternalFrameOrderByRubrosVariables.setVisible(false);
					this.jInternalFrameOrderByRubrosVariables.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idRubrosVariablesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=RubrosVariablesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.rubrosvariablesReturnGeneral=new RubrosVariablesParameterReturnGeneral();
			
			this.rubrosvariablesParameterGeneral=new RubrosVariablesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.rubrosvariablesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(RubrosVariablesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RubrosVariablesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.rubrosvariablesSessionBean.getEsGuardarRelacionado(),this.rubrosvariablesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RubrosVariablesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.rubrosvariablesSessionBean.getEsGuardarRelacionado(),this.rubrosvariablesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoRubrosVariables=false;
			this.isVisibilidadCeldaDuplicarRubrosVariables=true;
			this.isVisibilidadCeldaCopiarRubrosVariables=true;
			this.isVisibilidadCeldaVerFormRubrosVariables=true;
			this.isVisibilidadCeldaOrdenRubrosVariables=true;
			this.isVisibilidadCeldaNuevoRelacionesRubrosVariables=false;
			this.isVisibilidadCeldaModificarRubrosVariables=false;
			this.isVisibilidadCeldaActualizarRubrosVariables=false;
			this.isVisibilidadCeldaEliminarRubrosVariables=false;
			this.isVisibilidadCeldaCancelarRubrosVariables=false;
			this.isVisibilidadCeldaGuardarRubrosVariables=false;
			this.isVisibilidadCeldaGuardarCambiosRubrosVariables=false;
			
			
			this.isVisibilidadBusquedaRubrosVariables=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdRubroEmplea=true;
			this.isVisibilidadFK_IdTipoContrato=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesRubrosVariables("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosRubrosVariables();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioRubrosVariables(false);
			
			this.setPermisosUsuarioRubrosVariables();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rubrosvariablesSessionBean.getEsGuardarRelacionado() 
				|| (this.rubrosvariablesSessionBean.getEsGuardarRelacionado() && this.rubrosvariablesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioRubrosVariablesClasesRelacionadas();
			}
			
			if(this.rubrosvariablesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioRubrosVariablesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!RubrosVariablesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosRubrosVariables();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualRubrosVariables();
			}
			
			if(!this.isPermisoBusquedaRubrosVariables) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasRubrosVariables.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(RubrosVariablesConstantesFunciones.getTiposSeleccionarRubrosVariables());
				
				this.tiposColumnasSelect=RubrosVariablesConstantesFunciones.getTiposSeleccionarRubrosVariables(true);
				
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
			//if(!this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioRubrosVariables();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioRubrosVariables(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioRubrosVariables(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesRubrosVariables() ;
			
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
			
			this.tipocontratoLogic=new TipoContratoLogic();
			this.empresaLogic=new EmpresaLogic();
			this.rubroempleaLogic=new RubroEmpleaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				rubrosvariablesImplementable= (RubrosVariablesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RubrosVariablesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				rubrosvariablesImplementableHome= (RubrosVariablesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RubrosVariablesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.rubrosvariabless= new ArrayList<RubrosVariables>();
			this.rubrosvariablessEliminados= new ArrayList<RubrosVariables>();
						
			this.isEsNuevoRubrosVariables=false;
			this.esParaAccionDesdeFormularioRubrosVariables=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.tipocontratosForeignKey=new ArrayList<TipoContrato>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.rubroempleasForeignKey=new ArrayList<RubroEmplea>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyRubrosVariables(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroRubrosVariables();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			RubrosVariablesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=RubrosVariablesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesRubrosVariables("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingRubrosVariables(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormRubrosVariables!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioRubrosVariables();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioRubrosVariables();
			}
			
			RubrosVariablesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasRubrosVariables.getTabCount(); i++) {
					this.jTabbedPaneBusquedasRubrosVariables.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasRubrosVariables.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessRubrosVariables(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga RubrosVariables: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectRubrosVariables() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesRubrosVariables")) {
				iIndex=this.jInternalFrameDetalleFormRubrosVariables.jTabbedPaneRelacionesRubrosVariables.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormRubrosVariables.jTabbedPaneRelacionesRubrosVariables.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessRubrosVariables();	
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
	
	public void cargarCombosForeignKeyRubrosVariables(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyRubrosVariables(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyRubrosVariables(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyRubrosVariablesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyRubrosVariables();
		
		this.cargarCombosFrameForeignKeyRubrosVariables();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyRubrosVariables();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyRubrosVariables();
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

	public void cargarCombosForeignKeyRubroEmplea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyRubroEmpleaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyRubroEmplea();
				this.cargarCombosFrameRubroEmpleasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaRubroEmplea(this.rubroempleasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoRubrosVariablesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.rubrosvariablesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormRubrosVariables==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
			
			
			if(jTableDatosRubrosVariables.getRowCount()>=1) {
				jTableDatosRubrosVariables.removeRowSelectionInterval(0, jTableDatosRubrosVariables.getRowCount()-1);						
			}
			
			this.isEsNuevoRubrosVariables=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoRubrosVariables(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesRubrosVariables(true);			
			//this.rubrosvariables=new RubrosVariables();
			//this.rubrosvariables.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRubrosVariables(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRubrosVariables() ;
			
			if(RubrosVariablesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRubrosVariables(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.rubrosvariables);	
			this.actualizarInformacion("INFO_PADRE",false,this.rubrosvariables);				
			
			RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
			
			if(this.rubrosvariablesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar RubrosVariables: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarRubrosVariablesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<RubrosVariables> rubrosvariablessSeleccionados=new ArrayList<RubrosVariables>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosRubrosVariables.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosRubrosVariables.getSelectedRows().length;			
			}
			
			rubrosvariablessSeleccionados=this.getRubrosVariablessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoRubrosVariables--;			
				//RubrosVariables rubrosvariablesAux= new RubrosVariables();			
				//rubrosvariablesAux.setId(this.iIdNuevoRubrosVariables);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//RubrosVariables rubrosvariablesOrigen=new RubrosVariables();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(RubrosVariables rubrosvariablesOrigen : rubrosvariablessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							rubrosvariablesOrigen =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rubrosvariablesOrigen =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaRubrosVariables();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.rubrosvariables.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosRubrosVariables(rubrosvariablesOrigen,this.rubrosvariables,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.rubrosvariablesLogic.getRubrosVariabless().add(this.rubrosvariablesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.rubrosvariabless.add(this.rubrosvariablesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaRubrosVariables(false);
				
				this.jTableDatosRubrosVariables.setRowSelectionInterval(this.getIndiceNuevoRubrosVariables(), this.getIndiceNuevoRubrosVariables());
				
				int iLastRow =  this.jTableDatosRubrosVariables.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRubrosVariables.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRubrosVariables.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRubrosVariables(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<RubrosVariables> rubrosvariablessSeleccionados=new ArrayList<RubrosVariables>();									
		
			RubrosVariables rubrosvariablesOrigen=new RubrosVariables();
			RubrosVariables rubrosvariablesDestino=new RubrosVariables();
				
			rubrosvariablessSeleccionados=this.getRubrosVariablessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosRubrosVariables.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || rubrosvariablessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosRubrosVariables.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rubrosvariablesOrigen =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						rubrosvariablesOrigen =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rubrosvariablesDestino =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						rubrosvariablesDestino =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				rubrosvariablesOrigen =rubrosvariablessSeleccionados.get(0);
				rubrosvariablesDestino =rubrosvariablessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosRubrosVariables(rubrosvariablesOrigen,rubrosvariablesDestino,true,false);
				
				rubrosvariablesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(rubrosvariablesDestino,rubrosvariablesLogic.getRubrosVariabless());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rubrosvariablesDestino,rubrosvariabless);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaRubrosVariables(false);
				
				//this.jTableDatosRubrosVariables.setRowSelectionInterval(this.getIndiceNuevoRubrosVariables(), this.getIndiceNuevoRubrosVariables());
				
				int iLastRow =  this.jTableDatosRubrosVariables.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRubrosVariables.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRubrosVariables.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRubrosVariables(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRubrosVariables==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormRubrosVariables.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesRubrosVariables.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasRubrosVariables.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesRubrosVariables.setVisible(!isVisible);
			this.jPanelPaginacionRubrosVariables.setVisible(!isVisible);
			this.jPanelAccionesRubrosVariables.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameRubrosVariables();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoRubrosVariables();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionRubrosVariables();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByRubrosVariables();
			
			this.abrirFrameOrderByRubrosVariables();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByRubrosVariables();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleRubrosVariables(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormRubrosVariables);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormRubrosVariables.isMaximum()) {
					this.jInternalFrameDetalleFormRubrosVariables.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormRubrosVariables.setSize(this.jInternalFrameDetalleFormRubrosVariables.iWidthFormulario,this.jInternalFrameDetalleFormRubrosVariables.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormRubrosVariables.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormRubrosVariables.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormRubrosVariables.isMaximum()) {
						this.jInternalFrameDetalleFormRubrosVariables.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormRubrosVariables.jContentPaneDetalleRubrosVariables.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormRubrosVariables.jTabbedPaneRelacionesRubrosVariables.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormRubrosVariables.jContentPaneDetalleRubrosVariables.getWidth(),RubrosVariablesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRubrosVariables.jTabbedPaneRelacionesRubrosVariables.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormRubrosVariables.jContentPaneDetalleRubrosVariables.getWidth(),RubrosVariablesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRubrosVariables.jTabbedPaneRelacionesRubrosVariables.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormRubrosVariables.jContentPaneDetalleRubrosVariables.getWidth(),RubrosVariablesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormRubrosVariables.setVisible(true);
	        this.jInternalFrameDetalleFormRubrosVariables.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByRubrosVariables() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByRubrosVariables==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByRubrosVariables=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRubrosVariables,false,this);
				} else {
					this.jInternalFrameOrderByRubrosVariables=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRubrosVariables,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByRubrosVariables);
				this.jInternalFrameOrderByRubrosVariables.setVisible(false);
				this.jInternalFrameOrderByRubrosVariables.setSelected(false);
				
				this.jInternalFrameOrderByRubrosVariables.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRubrosVariables"));
				
				this.inicializarActualizarBindingTablaOrderByRubrosVariables();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionRubrosVariables() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionRubrosVariables==null) {
				
				this.jInternalFrameImportacionRubrosVariables=new ImportacionJInternalFrame(RubrosVariablesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRubrosVariables);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionRubrosVariables);
				this.jInternalFrameImportacionRubrosVariables.setVisible(false);
				this.jInternalFrameImportacionRubrosVariables.setSelected(false);


				this.jInternalFrameImportacionRubrosVariables.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRubrosVariables"));
				this.jInternalFrameImportacionRubrosVariables.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRubrosVariables"));
				this.jInternalFrameImportacionRubrosVariables.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRubrosVariables"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoRubrosVariables() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoRubrosVariables==null) {
				this.jInternalFrameReporteDinamicoRubrosVariables=new ReporteDinamicoJInternalFrame(RubrosVariablesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRubrosVariables);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRubrosVariables);
				this.jInternalFrameReporteDinamicoRubrosVariables.setVisible(false);
				this.jInternalFrameReporteDinamicoRubrosVariables.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoRubrosVariables.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRubrosVariables"));
				this.jInternalFrameReporteDinamicoRubrosVariables.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRubrosVariables"));
				this.jInternalFrameReporteDinamicoRubrosVariables.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRubrosVariables"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRubrosVariables();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleRubrosVariables() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormRubrosVariables);
			
	       	this.jInternalFrameDetalleFormRubrosVariables.setVisible(false);
	        this.jInternalFrameDetalleFormRubrosVariables.setSelected(false);
			
			//this.jInternalFrameDetalleFormRubrosVariables.dispose();
			//this.jInternalFrameDetalleFormRubrosVariables=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoRubrosVariables() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoRubrosVariables.setVisible(true);
	        this.jInternalFrameReporteDinamicoRubrosVariables.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionRubrosVariables() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionRubrosVariables.setVisible(true);
	        this.jInternalFrameImportacionRubrosVariables.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByRubrosVariables() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByRubrosVariables.setVisible(true);
	        this.jInternalFrameOrderByRubrosVariables.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByRubrosVariables() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByRubrosVariables.setVisible(false);
	        this.jInternalFrameOrderByRubrosVariables.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoRubrosVariables() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoRubrosVariables.setVisible(false);
	        this.jInternalFrameReporteDinamicoRubrosVariables.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionRubrosVariables() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionRubrosVariables.setVisible(false);
	        this.jInternalFrameImportacionRubrosVariables.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarRubrosVariables(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarRubrosVariables(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesRubrosVariables(true);
			//this.isEsNuevoRubrosVariables=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariables =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rubrosvariables =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesRubrosVariables("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRubrosVariables(false) ;
			
			if(rubrosvariablesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(RubrosVariablesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRubrosVariables(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRubrosVariables(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaRubrosVariablesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariables =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubrosvariables =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarRubrosVariables(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRubrosVariables==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesRubrosVariables(true);
			//this.isEsNuevoRubrosVariables=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariables =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rubrosvariables =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.rubrosvariables.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesRubrosVariables("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesRubrosVariables(false) ;
			
			if(RubrosVariablesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRubrosVariables(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRubrosVariables(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaTipoContrato(List<TipoContrato> tipocontratosForeignKey)throws Exception{
		TableColumn tableColumnTipoContrato=this.jTableDatosRubrosVariables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubrosVariables,RubrosVariablesConstantesFunciones.LABEL_IDTIPOCONTRATO));
		TableCellEditor tableCellEditorTipoContrato =tableColumnTipoContrato.getCellEditor();

		TipoContratoTableCell tipocontratoTableCellFk=(TipoContratoTableCell)tableCellEditorTipoContrato;

		if(tipocontratoTableCellFk!=null) {
			tipocontratoTableCellFk.settipocontratosForeignKey(tipocontratosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRubrosVariables.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipocontratoTableCellFk.setRowActual(intSelectedRow);
			//tipocontratoTableCellFk.settipocontratosForeignKeyActual(tipocontratosForeignKey);
		//}


		if(tipocontratoTableCellFk!=null) {
			tipocontratoTableCellFk.RecargarTipoContratosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
		
	
	public void recargarComboTablaRubroEmplea(List<RubroEmplea> rubroempleasForeignKey)throws Exception{
		TableColumn tableColumnRubroEmplea=this.jTableDatosRubrosVariables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubrosVariables,RubrosVariablesConstantesFunciones.LABEL_IDRUBROEMPLEA));
		TableCellEditor tableCellEditorRubroEmplea =tableColumnRubroEmplea.getCellEditor();

		RubroEmpleaTableCell rubroempleaTableCellFk=(RubroEmpleaTableCell)tableCellEditorRubroEmplea;

		if(rubroempleaTableCellFk!=null) {
			rubroempleaTableCellFk.setrubroempleasForeignKey(rubroempleasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRubrosVariables.getSelectedRow();

		//if(intSelectedRow<=0) {
			//rubroempleaTableCellFk.setRowActual(intSelectedRow);
			//rubroempleaTableCellFk.setrubroempleasForeignKeyActual(rubroempleasForeignKey);
		//}


		if(rubroempleaTableCellFk!=null) {
			rubroempleaTableCellFk.RecargarRubroEmpleasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesRubrosVariables(false);
			
			//if(!this.isEsNuevoRubrosVariables) {								
				int intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariables =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rubrosvariables =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(RubrosVariablesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualRubrosVariables(this.rubrosvariables,true);
				this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
				
			}
			
			if(this.permiteMantenimiento(this.rubrosvariables)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoRubrosVariables=true;
					this.inicializarActualizarBindingTablaRubrosVariables(false);
					this.isEsNuevoRubrosVariables=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoRubrosVariables=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoRubrosVariables=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRubrosVariables(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRubrosVariables(false);
				
				this.habilitarDeshabilitarControlesRubrosVariables(false);
			
												
				
				if(RubrosVariablesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleRubrosVariables();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoRubrosVariablesActionPerformed(evt,rubrosvariablesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualRubrosVariables(this.rubrosvariables,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosRubrosVariables.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,rubrosvariablesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.rubrosvariables.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(RubrosVariables.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubrosVariables.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariables =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				this.rubrosvariables.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rubrosvariables =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				this.rubrosvariables.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.rubrosvariables)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((RubrosVariablesModel) this.jTableDatosRubrosVariables.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoRubrosVariables=true;
				this.inicializarActualizarBindingTablaRubrosVariables(false);
				this.isEsNuevoRubrosVariables=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRubrosVariables(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRubrosVariables(false);
				
				this.habilitarDeshabilitarControlesRubrosVariables(false);
				
				
				
				if(RubrosVariablesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleRubrosVariables();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosRubrosVariables.getRowCount()>=1) {
				jTableDatosRubrosVariables.removeRowSelectionInterval(0, jTableDatosRubrosVariables.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesRubrosVariables(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaRubrosVariables(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRubrosVariables(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRubrosVariables(false) ;
			
			this.isEsNuevoRubrosVariables=false;
			
			if(RubrosVariablesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleRubrosVariables();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingRubrosVariables(false);
				
				//SI ES MANUAL
				if(RubrosVariablesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualRubrosVariables();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoRubrosVariables--;			
			//RubrosVariables rubrosvariablesAux= new RubrosVariables();			
			//rubrosvariablesAux.setId(this.iIdNuevoRubrosVariables);
			
			if(this.jInternalFrameDetalleFormRubrosVariables==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaRubrosVariables();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
			
			this.rubrosvariables.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.rubrosvariablesLogic.getRubrosVariabless().add(this.rubrosvariablesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.rubrosvariabless.add(this.rubrosvariablesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaRubrosVariables(false);
			
			this.jTableDatosRubrosVariables.setRowSelectionInterval(this.getIndiceNuevoRubrosVariables(), this.getIndiceNuevoRubrosVariables());
			
			int iLastRow =  this.jTableDatosRubrosVariables.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosRubrosVariables.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosRubrosVariables.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaRubrosVariables(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingRubrosVariables(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRubrosVariables(false);
			
			//SI ES MANUAL
			if(RubrosVariablesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRubrosVariables();
			}
			
			//this.abrirFrameTreeRubrosVariables();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionRubrosVariables.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionRubrosVariables.setFileImportacion(this.jInternalFrameImportacionRubrosVariables.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionRubrosVariables.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionRubrosVariables.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionRubrosVariables.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionRubrosVariables.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<RubrosVariables> rubrosvariablessSeleccionados=new ArrayList<RubrosVariables>();		

		rubrosvariablessSeleccionados=this.getRubrosVariablessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRubrosVariables.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRubrosVariables.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("RubrosVariablesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"RubrosVariablesBaseDesign.jrxml";
			
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
			
			this.generarReporteRubrosVariabless("Todos",rubrosvariablessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubros Variables",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoRubrosVariables.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRubrosVariables.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RubrosVariablesConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RubrosVariablesConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RubrosVariablesConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RubrosVariablesConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RubrosVariablesConstantesFunciones.LABEL_NOMBRERUBROEMPLEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreRubroEmplea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreRubroEmplea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreRubroEmplea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreRubroEmplea_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoRubrosVariables.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoRubrosVariables.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoRubrosVariables.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case RubrosVariablesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case RubrosVariablesConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case RubrosVariablesConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case RubrosVariablesConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case RubrosVariablesConstantesFunciones.LABEL_NOMBRERUBROEMPLEA:
					sNombreCampoCategoria="nombre_rubro_emplea";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoRubrosVariables.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case RubrosVariablesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case RubrosVariablesConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case RubrosVariablesConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case RubrosVariablesConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case RubrosVariablesConstantesFunciones.LABEL_NOMBRERUBROEMPLEA:
					sNombreCampoCategoriaValor="nombre_rubro_emplea";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoRubrosVariables.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRubrosVariables.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RubrosVariablesConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case RubrosVariablesConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case RubrosVariablesConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case RubrosVariablesConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case RubrosVariablesConstantesFunciones.LABEL_NOMBRERUBROEMPLEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Rubro Emplea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_rubro_emplea");
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
	
	public void jButtonGenerarExcelReporteDinamicoRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<RubrosVariables> rubrosvariablessSeleccionados=new ArrayList<RubrosVariables>();		
		
		rubrosvariablessSeleccionados=this.getRubrosVariablessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubrosvariables";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("RubrosVariabless");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoRubrosVariables.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoRubrosVariables.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case RubrosVariablesConstantesFunciones.LABEL_IDTIPOCONTRATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_IDTIPOCONTRATO);
					iRow++;

					for(RubrosVariables rubrosvariables:rubrosvariablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubrosvariables.gettipocontrato_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RubrosVariablesConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(RubrosVariables rubrosvariables:rubrosvariablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubrosvariables.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RubrosVariablesConstantesFunciones.LABEL_IDRUBROEMPLEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_IDRUBROEMPLEA);
					iRow++;

					for(RubrosVariables rubrosvariables:rubrosvariablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubrosvariables.getrubroemplea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RubrosVariablesConstantesFunciones.LABEL_FECHADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_FECHADESDE);
					iRow++;

					for(RubrosVariables rubrosvariables:rubrosvariablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubrosvariables.getfecha_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RubrosVariablesConstantesFunciones.LABEL_FECHAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_FECHAHASTA);
					iRow++;

					for(RubrosVariables rubrosvariables:rubrosvariablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubrosvariables.getfecha_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RubrosVariablesConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(RubrosVariables rubrosvariables:rubrosvariablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubrosvariables.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RubrosVariablesConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(RubrosVariables rubrosvariables:rubrosvariablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubrosvariables.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RubrosVariablesConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(RubrosVariables rubrosvariables:rubrosvariablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubrosvariables.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RubrosVariablesConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(RubrosVariables rubrosvariables:rubrosvariablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubrosvariables.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RubrosVariablesConstantesFunciones.LABEL_NOMBRERUBROEMPLEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_NOMBRERUBROEMPLEA);
					iRow++;

					for(RubrosVariables rubrosvariables:rubrosvariablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rubrosvariables.getnombre_rubro_emplea());
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
			//	this.getFilaCabeceraExportarExcelRubrosVariables(row);				
			//	iRow++;
			//}				
			
			//for(RubrosVariables rubrosvariablesAux:rubrosvariablessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelRubrosVariables(rubrosvariablesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubros Variables",JOptionPane.INFORMATION_MESSAGE);
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
				this.rubrosvariablesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRubrosVariables(false);
			
			//SI ES MANUAL
			if(RubrosVariablesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRubrosVariables();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRubrosVariables(false);
			
			//SI ES MANUAL
			if(RubrosVariablesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRubrosVariables();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRubrosVariables(false);
			
			//SI ES MANUAL
			if(RubrosVariablesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRubrosVariables();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaRubrosVariables() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosRubrosVariables.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosRubrosVariables.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosRubrosVariables.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosRubrosVariables.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosRubrosVariables.setMinimumSize(dimensionMinimum);
		this.jTableDatosRubrosVariables.setMaximumSize(dimensionMaximum);
		this.jTableDatosRubrosVariables.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingRubrosVariables(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingRubrosVariables(esInicializar,true);
	}
	
	public void inicializarActualizarBindingRubrosVariables(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaRubrosVariables(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesRubrosVariables(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasRubrosVariables(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRubrosVariables(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesRubrosVariables(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !RubrosVariablesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!RubrosVariablesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualRubrosVariables() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaRubrosVariables();
		
		this.inicializarActualizarBindingBotonesManualRubrosVariables(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualRubrosVariables();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRubrosVariables() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualRubrosVariables(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualRubrosVariables(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosRubrosVariables.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosRubrosVariables.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteRubrosVariables.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormRubrosVariables.jCheckBoxPostAccionNuevoRubrosVariables.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormRubrosVariables.jCheckBoxPostAccionSinCerrarRubrosVariables.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormRubrosVariables.jCheckBoxPostAccionSinMensajeRubrosVariables.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosRubrosVariables.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosRubrosVariables.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteRubrosVariables.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
				this.jInternalFrameDetalleFormRubrosVariables.jCheckBoxPostAccionNuevoRubrosVariables.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormRubrosVariables.jCheckBoxPostAccionSinCerrarRubrosVariables.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormRubrosVariables.jCheckBoxPostAccionSinMensajeRubrosVariables.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionRubrosVariables.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionRubrosVariables.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormRubrosVariables.jComboBoxTiposAccionesFormularioRubrosVariables.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesRubrosVariables.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoRubrosVariables!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRubrosVariables.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesRubrosVariables.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesRubrosVariables.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarRubrosVariables.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesRubrosVariables.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoRubrosVariables!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRubrosVariables.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesRubrosVariables.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralRubrosVariables.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesRubrosVariables(Boolean esInicializar) throws Exception {
		try	{	
			if(RubrosVariablesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualRubrosVariables(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesRubrosVariables() throws Exception {
		try	{
			if(RubrosVariablesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualRubrosVariables();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRubrosVariables() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormRubrosVariables.jComboBoxTiposAccionesFormularioRubrosVariables.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormRubrosVariables.jComboBoxTiposAccionesFormularioRubrosVariables.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualRubrosVariables() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesRubrosVariables.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesRubrosVariables.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesRubrosVariables.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesRubrosVariables.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesRubrosVariables.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesRubrosVariables.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionRubrosVariables.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionRubrosVariables.addItem(reporte);
			}
			
			
			if(!this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionRubrosVariables.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionRubrosVariables.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesRubrosVariables.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesRubrosVariables.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesRubrosVariables.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesRubrosVariables.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormRubrosVariables!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormRubrosVariables.jComboBoxTiposAccionesFormularioRubrosVariables.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormRubrosVariables.jComboBoxTiposAccionesFormularioRubrosVariables.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarRubrosVariables.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarRubrosVariables.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarRubrosVariables.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRubrosVariables();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRubrosVariables() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRubrosVariables!=null) {
				this.jInternalFrameReporteDinamicoRubrosVariables.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoRubrosVariables.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRubrosVariables!=null) {
				this.jInternalFrameReporteDinamicoRubrosVariables.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoRubrosVariables.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoRubrosVariables!=null) {
				
				if(this.jInternalFrameReporteDinamicoRubrosVariables.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRubrosVariables.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRubrosVariables.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoRubrosVariables.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRubrosVariables.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRubrosVariables.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoRubrosVariables.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRubrosVariables.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=RubrosVariablesConstantesFunciones.getTiposSeleccionarRubrosVariables(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRubrosVariables.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoRubrosVariables.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoRubrosVariables.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=RubrosVariablesConstantesFunciones.getTiposSeleccionarRubrosVariables(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRubrosVariables.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoRubrosVariables.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRubrosVariables.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=RubrosVariablesConstantesFunciones.getTiposSeleccionarRubrosVariables(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRubrosVariables.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoRubrosVariables.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoRubrosVariables.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoRubrosVariables.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualRubrosVariables()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_contratoBusquedaRubrosVariablesRubrosVariables.getSelectedItem()!=null){this.id_tipo_contratoBusquedaRubrosVariables=((TipoContrato)this.jComboBoxid_tipo_contratoBusquedaRubrosVariablesRubrosVariables.getSelectedItem()).getId();}
		if(this.jComboBoxid_rubro_empleaBusquedaRubrosVariablesRubrosVariables.getSelectedItem()!=null){this.id_rubro_empleaBusquedaRubrosVariables=((RubroEmplea)this.jComboBoxid_rubro_empleaBusquedaRubrosVariablesRubrosVariables.getSelectedItem()).getId();}
		this.fecha_desdeBusquedaRubrosVariables=new Date(this.jDateChooserfecha_desdeBusquedaRubrosVariablesRubrosVariables.getDate().getTime());
		this.fecha_hastaBusquedaRubrosVariables=new Date(this.jDateChooserfecha_hastaBusquedaRubrosVariablesRubrosVariables.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasRubrosVariables(Boolean esInicializar) throws Exception {				
		if(RubrosVariablesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualRubrosVariables();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaRubrosVariables() throws Exception {
		this.inicializarActualizarBindingTablaRubrosVariables(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByRubrosVariables() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByRubrosVariables.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByRubrosVariables.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRubrosVariables.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new RubrosVariablesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByRubrosVariables.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRubrosVariables.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new RubrosVariablesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosRubrosVariablesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubrosVariablesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new RubrosVariablesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByRubrosVariables.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRubrosVariables.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new RubrosVariablesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByRubrosVariables.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaRubrosVariables(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=rubrosvariablesLogic.getRubrosVariabless().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=rubrosvariabless.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(RubrosVariablesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosRubrosVariables.setModel(new RubrosVariablesModel(this.rubrosvariablesLogic.getRubrosVariabless(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosRubrosVariables.setModel(new RubrosVariablesModel(this.rubrosvariabless,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByRubrosVariables!=null && this.jInternalFrameOrderByRubrosVariables.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByRubrosVariables();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosRubrosVariables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubrosVariables,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new RubrosVariablesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO,rubrosvariablesConstantesFunciones.resaltarSeleccionarRubrosVariables,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+RubrosVariablesConstantesFunciones.SCLASSWEBTITULO,rubrosvariablesConstantesFunciones.resaltarSeleccionarRubrosVariables,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosRubrosVariables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubrosVariables,RubrosVariablesConstantesFunciones.LABEL_ID));

		if(this.rubrosvariablesConstantesFunciones.mostraridRubrosVariables && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubrosVariablesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.rubrosvariablesConstantesFunciones.resaltaridRubrosVariables,this.rubrosvariablesConstantesFunciones.activaridRubrosVariables,iSizeTabla,this,true,"idRubrosVariables","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rubrosvariablesConstantesFunciones.resaltaridRubrosVariables,this.rubrosvariablesConstantesFunciones.activaridRubrosVariables,this,true,"idRubrosVariables","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRubrosVariables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubrosVariables,RubrosVariablesConstantesFunciones.LABEL_CODIGO));

		if(this.rubrosvariablesConstantesFunciones.mostrarcodigoRubrosVariables && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubrosVariablesConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.rubrosvariablesConstantesFunciones.resaltarcodigoRubrosVariables,this.rubrosvariablesConstantesFunciones.activarcodigoRubrosVariables,iSizeTabla,this,true,"codigoRubrosVariables","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rubrosvariablesConstantesFunciones.resaltarcodigoRubrosVariables,this.rubrosvariablesConstantesFunciones.activarcodigoRubrosVariables,this,true,"codigoRubrosVariables","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RubrosVariablesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRubrosVariables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubrosVariables,RubrosVariablesConstantesFunciones.LABEL_NOMBRE));

		if(this.rubrosvariablesConstantesFunciones.mostrarnombreRubrosVariables && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubrosVariablesConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.rubrosvariablesConstantesFunciones.resaltarnombreRubrosVariables,this.rubrosvariablesConstantesFunciones.activarnombreRubrosVariables,iSizeTabla,this,true,"nombreRubrosVariables","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rubrosvariablesConstantesFunciones.resaltarnombreRubrosVariables,this.rubrosvariablesConstantesFunciones.activarnombreRubrosVariables,this,true,"nombreRubrosVariables","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RubrosVariablesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRubrosVariables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubrosVariables,RubrosVariablesConstantesFunciones.LABEL_FECHA));

		if(this.rubrosvariablesConstantesFunciones.mostrarfechaRubrosVariables && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubrosVariablesConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.rubrosvariablesConstantesFunciones.resaltarfechaRubrosVariables,this.rubrosvariablesConstantesFunciones.activarfechaRubrosVariables,iSizeTabla,this,true,"fechaRubrosVariables","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.rubrosvariablesConstantesFunciones.resaltarfechaRubrosVariables,this.rubrosvariablesConstantesFunciones.activarfechaRubrosVariables,this,true,"fechaRubrosVariables","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new RubrosVariablesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRubrosVariables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubrosVariables,RubrosVariablesConstantesFunciones.LABEL_VALOR));

		if(this.rubrosvariablesConstantesFunciones.mostrarvalorRubrosVariables && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubrosVariablesConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.rubrosvariablesConstantesFunciones.resaltarvalorRubrosVariables,this.rubrosvariablesConstantesFunciones.activarvalorRubrosVariables,iSizeTabla,this,true,"valorRubrosVariables","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rubrosvariablesConstantesFunciones.resaltarvalorRubrosVariables,this.rubrosvariablesConstantesFunciones.activarvalorRubrosVariables,this,true,"valorRubrosVariables","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RubrosVariablesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRubrosVariables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRubrosVariables,RubrosVariablesConstantesFunciones.LABEL_NOMBRERUBROEMPLEA));

		if(this.rubrosvariablesConstantesFunciones.mostrarnombre_rubro_empleaRubrosVariables && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RubrosVariablesConstantesFunciones.LABEL_NOMBRERUBROEMPLEA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.rubrosvariablesConstantesFunciones.resaltarnombre_rubro_empleaRubrosVariables,this.rubrosvariablesConstantesFunciones.activarnombre_rubro_empleaRubrosVariables,iSizeTabla,this,true,"nombre_rubro_empleaRubrosVariables","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rubrosvariablesConstantesFunciones.resaltarnombre_rubro_empleaRubrosVariables,this.rubrosvariablesConstantesFunciones.activarnombre_rubro_empleaRubrosVariables,this,true,"nombre_rubro_empleaRubrosVariables","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RubrosVariablesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.rubrosvariablesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.rubrosvariablesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.rubrosvariablesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRubrosVariables.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.rubrosvariablesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.rubrosvariablesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRubrosVariables.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarRubrosVariables && this.isPermisoGuardarCambiosRubrosVariables) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.rubrosvariablesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.rubrosvariablesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosRubrosVariables.addColumn(tableColumn);
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
			
			this.jTableDatosRubrosVariables.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRubrosVariables && this.isPermisoGuardarCambiosRubrosVariables) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRubrosVariables && this.isPermisoGuardarCambiosRubrosVariables) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosRubrosVariables.moveColumn(this.jTableDatosRubrosVariables.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosRubrosVariables.moveColumn(this.jTableDatosRubrosVariables.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosRubrosVariables.moveColumn(this.jTableDatosRubrosVariables.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosRubrosVariables.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosRubrosVariables.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosRubrosVariables,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!RubrosVariablesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosRubrosVariables.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosRubrosVariables.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!RubrosVariablesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!RubrosVariablesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosRubrosVariables.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosRubrosVariables.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosRubrosVariables.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=rubrosvariablesLogic.getRubrosVariabless().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=rubrosvariabless.size()-1;
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
		//this.jTableDatosRubrosVariables.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosRubrosVariables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosRubrosVariables();
			
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
				
				//this.isEsNuevoRubrosVariables=false;
					
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
			
				if(this.rubrosvariablesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormRubrosVariables==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRubrosVariables.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRubrosVariables.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariables =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubrosvariables =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.rubrosvariables.getsType().equals("DUPLICADO")
				   || this.rubrosvariables.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoRubrosVariables=true;
				
				} else {
					this.isEsNuevoRubrosVariables=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
					if(this.rubrosvariables.getId()>=0 && !this.rubrosvariables.getIsNew()) {						
						this.isEsNuevoRubrosVariables=false;
						
					} else {
						this.isEsNuevoRubrosVariables=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoRubrosVariables(esRelaciones);						
				
				this.seleccionarRubrosVariables(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.rubrosvariables.getId()<0) {
					this.isEsNuevoRubrosVariables=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarRubrosVariables(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarRubrosVariables(evt,rowIndex);
				}	
				
				if(this.rubrosvariablesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion RubrosVariables: " + this.dDif); 
					}
				}								
				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarRubrosVariables(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.rubrosvariables)) {
					if(this.rubrosvariables.getId()>0) {
						this.rubrosvariables.setIsDeleted(true);
						
						this.rubrosvariablessEliminados.add(this.rubrosvariables);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.rubrosvariablesLogic.getRubrosVariabless().remove(this.rubrosvariables);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.rubrosvariabless.remove(this.rubrosvariables);				
					}
					
					
					((RubrosVariablesModel) this.jTableDatosRubrosVariables.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaRubrosVariables(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarRubrosVariables(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoRubrosVariables) {
			
			if(this.jInternalFrameDetalleFormRubrosVariables==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRubrosVariables.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRubrosVariables.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariables =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubrosvariables =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(RubrosVariablesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioRubrosVariables(this.rubrosvariables);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesRubrosVariables("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesRubrosVariables(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRubrosVariables() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoRubrosVariables(RubrosVariables rubrosvariables) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoRubrosVariables(rubrosvariables,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoRubrosVariables(RubrosVariables rubrosvariables,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioRubrosVariables(rubrosvariables);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyRubrosVariables(rubrosvariables,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyRubrosVariables(rubrosvariables);
	}
	
	public void setVariablesObjetoActualToFormularioRubrosVariables(RubrosVariables rubrosvariables) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormRubrosVariables==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormRubrosVariables.jLabelidRubrosVariables.setText(rubrosvariables.getId().toString());
			this.jInternalFrameDetalleFormRubrosVariables.jTextFieldcodigoRubrosVariables.setText(rubrosvariables.getcodigo());
			this.jInternalFrameDetalleFormRubrosVariables.jTextAreanombreRubrosVariables.setText(rubrosvariables.getnombre());
			this.jInternalFrameDetalleFormRubrosVariables.jDateChooserfechaRubrosVariables.setDate(rubrosvariables.getfecha());
			this.jInternalFrameDetalleFormRubrosVariables.jTextFieldvalorRubrosVariables.setText(rubrosvariables.getvalor().toString());
			this.jInternalFrameDetalleFormRubrosVariables.jTextAreanombre_rubro_empleaRubrosVariables.setText(rubrosvariables.getnombre_rubro_emplea());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,RubrosVariables rubrosvariablesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,rubrosvariablesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,RubrosVariables rubrosvariablesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				rubrosvariablesLocal=this.rubrosvariables;
			} else {
				rubrosvariablesLocal=this.rubrosvariablesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(rubrosvariablesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoRubrosVariables(rubrosvariablesLocal,true);
					
					if(rubrosvariablesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(rubrosvariablesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(rubrosvariablesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoRubrosVariables(RubrosVariables rubrosvariables,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRubrosVariables(rubrosvariables,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(rubrosvariables);
	}
	
	public void setVariablesFormularioToObjetoActualRubrosVariables(RubrosVariables rubrosvariables,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRubrosVariables(rubrosvariables,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualRubrosVariables(RubrosVariables rubrosvariables,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormRubrosVariables==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormRubrosVariables.jLabelidRubrosVariables.getText()==null || this.jInternalFrameDetalleFormRubrosVariables.jLabelidRubrosVariables.getText()=="" || this.jInternalFrameDetalleFormRubrosVariables.jLabelidRubrosVariables.getText()=="Id") {
				this.jInternalFrameDetalleFormRubrosVariables.jLabelidRubrosVariables.setText("0");
			}

			if(conColumnasBase) {rubrosvariables.setId(Long.parseLong(this.jInternalFrameDetalleFormRubrosVariables.jLabelidRubrosVariables.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RubrosVariablesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubrosVariables.jLabelIdRubrosVariables,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			rubrosvariables.setcodigo(this.jInternalFrameDetalleFormRubrosVariables.jTextFieldcodigoRubrosVariables.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RubrosVariablesConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubrosVariables.jLabelcodigoRubrosVariables,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			rubrosvariables.setnombre(this.jInternalFrameDetalleFormRubrosVariables.jTextAreanombreRubrosVariables.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RubrosVariablesConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubrosVariables.jLabelnombreRubrosVariables,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			rubrosvariables.setfecha(this.jInternalFrameDetalleFormRubrosVariables.jDateChooserfechaRubrosVariables.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RubrosVariablesConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubrosVariables.jLabelfechaRubrosVariables,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			rubrosvariables.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormRubrosVariables.jTextFieldvalorRubrosVariables.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RubrosVariablesConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubrosVariables.jLabelvalorRubrosVariables,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			rubrosvariables.setnombre_rubro_emplea(this.jInternalFrameDetalleFormRubrosVariables.jTextAreanombre_rubro_empleaRubrosVariables.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RubrosVariablesConstantesFunciones.LABEL_NOMBRERUBROEMPLEA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRubrosVariables.jLabelnombre_rubro_empleaRubrosVariables,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRubrosVariables(RubrosVariables rubrosvariablesBean,RubrosVariables rubrosvariables,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosRubrosVariables(RubrosVariables rubrosvariablesOrigen,RubrosVariables rubrosvariables,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && rubrosvariablesOrigen.getId()!=null && !rubrosvariablesOrigen.getId().equals(0L))) {rubrosvariables.setId(rubrosvariablesOrigen.getId());}}
			if(conDefault || (!conDefault && rubrosvariablesOrigen.getfecha_desde()!=null && !rubrosvariablesOrigen.getfecha_desde().equals(new Date()))) {rubrosvariables.setfecha_desde(rubrosvariablesOrigen.getfecha_desde());}
			if(conDefault || (!conDefault && rubrosvariablesOrigen.getfecha_hasta()!=null && !rubrosvariablesOrigen.getfecha_hasta().equals(new Date()))) {rubrosvariables.setfecha_hasta(rubrosvariablesOrigen.getfecha_hasta());}
			if(conDefault || (!conDefault && rubrosvariablesOrigen.getcodigo()!=null && !rubrosvariablesOrigen.getcodigo().equals(""))) {rubrosvariables.setcodigo(rubrosvariablesOrigen.getcodigo());}
			if(conDefault || (!conDefault && rubrosvariablesOrigen.getnombre()!=null && !rubrosvariablesOrigen.getnombre().equals(""))) {rubrosvariables.setnombre(rubrosvariablesOrigen.getnombre());}
			if(conDefault || (!conDefault && rubrosvariablesOrigen.getfecha()!=null && !rubrosvariablesOrigen.getfecha().equals(new Date()))) {rubrosvariables.setfecha(rubrosvariablesOrigen.getfecha());}
			if(conDefault || (!conDefault && rubrosvariablesOrigen.getvalor()!=null && !rubrosvariablesOrigen.getvalor().equals(0.0))) {rubrosvariables.setvalor(rubrosvariablesOrigen.getvalor());}
			if(conDefault || (!conDefault && rubrosvariablesOrigen.getnombre_rubro_emplea()!=null && !rubrosvariablesOrigen.getnombre_rubro_emplea().equals(""))) {rubrosvariables.setnombre_rubro_emplea(rubrosvariablesOrigen.getnombre_rubro_emplea());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRubrosVariables(RubrosVariables rubrosvariables) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRubrosVariables.jLabelidRubrosVariables.setText(rubrosvariables.getId().toString());
			this.jInternalFrameDetalleFormRubrosVariables.jTextFieldcodigoRubrosVariables.setText(rubrosvariables.getcodigo());
			this.jInternalFrameDetalleFormRubrosVariables.jTextAreanombreRubrosVariables.setText(rubrosvariables.getnombre());
			this.jInternalFrameDetalleFormRubrosVariables.jDateChooserfechaRubrosVariables.setDate(rubrosvariables.getfecha());
			this.jInternalFrameDetalleFormRubrosVariables.jTextFieldvalorRubrosVariables.setText(rubrosvariables.getvalor().toString());
			this.jInternalFrameDetalleFormRubrosVariables.jTextAreanombre_rubro_empleaRubrosVariables.setText(rubrosvariables.getnombre_rubro_emplea());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRubrosVariables(RubrosVariablesBean rubrosvariablesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRubrosVariables.jLabelidRubrosVariables.setText(rubrosvariablesBean.getId().toString());
			this.jInternalFrameDetalleFormRubrosVariables.jTextFieldcodigoRubrosVariables.setText(rubrosvariablesBean.getcodigo());
			this.jInternalFrameDetalleFormRubrosVariables.jTextAreanombreRubrosVariables.setText(rubrosvariablesBean.getnombre());
			this.jInternalFrameDetalleFormRubrosVariables.jDateChooserfechaRubrosVariables.setDate(rubrosvariablesBean.getfecha());
			this.jInternalFrameDetalleFormRubrosVariables.jTextFieldvalorRubrosVariables.setText(rubrosvariablesBean.getvalor().toString());
			this.jInternalFrameDetalleFormRubrosVariables.jTextAreanombre_rubro_empleaRubrosVariables.setText(rubrosvariablesBean.getnombre_rubro_emplea());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanRubrosVariables(RubrosVariablesParameterReturnGeneral rubrosvariablesReturnGeneral,RubrosVariablesBean rubrosvariablesBean,Boolean conDefault) throws Exception { 
		try {
			RubrosVariables rubrosvariablesLocal=new RubrosVariables();
			
			rubrosvariablesLocal=rubrosvariablesReturnGeneral.getRubrosVariables();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && rubrosvariablesLocal.getId()!=null && !rubrosvariablesLocal.getId().equals(0L))) {rubrosvariablesBean.setId(rubrosvariablesLocal.getId());}}
			if(conDefault || (!conDefault && rubrosvariablesLocal.getcodigo()!=null && !rubrosvariablesLocal.getcodigo().equals(""))) {rubrosvariablesBean.setcodigo(rubrosvariablesLocal.getcodigo());}
			if(conDefault || (!conDefault && rubrosvariablesLocal.getnombre()!=null && !rubrosvariablesLocal.getnombre().equals(""))) {rubrosvariablesBean.setnombre(rubrosvariablesLocal.getnombre());}
			if(conDefault || (!conDefault && rubrosvariablesLocal.getfecha()!=null && !rubrosvariablesLocal.getfecha().equals(new Date()))) {rubrosvariablesBean.setfecha(rubrosvariablesLocal.getfecha());}
			if(conDefault || (!conDefault && rubrosvariablesLocal.getvalor()!=null && !rubrosvariablesLocal.getvalor().equals(0.0))) {rubrosvariablesBean.setvalor(rubrosvariablesLocal.getvalor());}
			if(conDefault || (!conDefault && rubrosvariablesLocal.getnombre_rubro_emplea()!=null && !rubrosvariablesLocal.getnombre_rubro_emplea().equals(""))) {rubrosvariablesBean.setnombre_rubro_emplea(rubrosvariablesLocal.getnombre_rubro_emplea());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxRubrosVariablesGenerico(Long idRubrosVariablesSeleccionado,JComboBox jComboBoxRubrosVariables,List<RubrosVariables> rubrosvariablessLocal)throws Exception {
		try {
			RubrosVariables  rubrosvariablesTemp=null;

			for(RubrosVariables rubrosvariablesAux:rubrosvariablessLocal) {
				if(rubrosvariablesAux.getId()!=null && rubrosvariablesAux.getId().equals(idRubrosVariablesSeleccionado)) {
					rubrosvariablesTemp=rubrosvariablesAux;
					break;
				}
			}

			jComboBoxRubrosVariables.setSelectedItem(rubrosvariablesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxRubrosVariablesGenerico(JComboBox jComboBoxRubrosVariables,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxRubrosVariables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRubrosVariables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxRubrosVariables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRubrosVariables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRubrosVariables.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxRubrosVariables.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRubrosVariables.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxRubrosVariables.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxRubrosVariables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxRubrosVariables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rubrosvariables=(RubrosVariables) rubrosvariablesLogic.getRubrosVariabless().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			rubrosvariables =(RubrosVariables) rubrosvariabless.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("TipoContrato")) {
			//sDescripcion=this.getActualTipoContratoForeignKeyDescripcion((Long)value);
			if(!rubrosvariables.getIsNew() && !rubrosvariables.getIsChanged() && !rubrosvariables.getIsDeleted()) {
				sDescripcion=rubrosvariables.gettipocontrato_descripcion();
			} else {
				//sDescripcion=this.getActualTipoContratoForeignKeyDescripcion((Long)value);
				sDescripcion=rubrosvariables.gettipocontrato_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!rubrosvariables.getIsNew() && !rubrosvariables.getIsChanged() && !rubrosvariables.getIsDeleted()) {
				sDescripcion=rubrosvariables.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=rubrosvariables.getempresa_descripcion();
			}
		}

		if(sTipo.equals("RubroEmplea")) {
			//sDescripcion=this.getActualRubroEmpleaForeignKeyDescripcion((Long)value);
			if(!rubrosvariables.getIsNew() && !rubrosvariables.getIsChanged() && !rubrosvariables.getIsDeleted()) {
				sDescripcion=rubrosvariables.getrubroemplea_descripcion();
			} else {
				//sDescripcion=this.getActualRubroEmpleaForeignKeyDescripcion((Long)value);
				sDescripcion=rubrosvariables.getrubroemplea_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		RubrosVariables rubrosvariablesRow=new RubrosVariables();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rubrosvariablesRow=(RubrosVariables) rubrosvariablesLogic.getRubrosVariabless().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			rubrosvariablesRow=(RubrosVariables) rubrosvariabless.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualRubrosVariables(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoRubrosVariables.setVisible((this.isVisibilidadCeldaNuevoRubrosVariables && this.isPermisoNuevoRubrosVariables));			
			this.jButtonDuplicarRubrosVariables.setVisible((this.isVisibilidadCeldaDuplicarRubrosVariables && this.isPermisoDuplicarRubrosVariables));			
			this.jButtonCopiarRubrosVariables.setVisible((this.isVisibilidadCeldaCopiarRubrosVariables && this.isPermisoCopiarRubrosVariables));
			this.jButtonVerFormRubrosVariables.setVisible((this.isVisibilidadCeldaVerFormRubrosVariables && this.isPermisoVerFormRubrosVariables));
			
			this.jButtonAbrirOrderByRubrosVariables.setVisible((this.isVisibilidadCeldaOrdenRubrosVariables && this.isPermisoOrdenRubrosVariables));			
			
			this.jButtonNuevoRelacionesRubrosVariables.setVisible((this.isVisibilidadCeldaNuevoRelacionesRubrosVariables && this.isPermisoNuevoRubrosVariables));			
			this.jButtonNuevoGuardarCambiosRubrosVariables.setVisible((this.isVisibilidadCeldaNuevoRubrosVariables && this.isPermisoNuevoRubrosVariables && this.isPermisoGuardarCambiosRubrosVariables));
			
			if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
			this.jInternalFrameDetalleFormRubrosVariables.jButtonModificarRubrosVariables.setVisible((this.isVisibilidadCeldaModificarRubrosVariables && this.isPermisoActualizarRubrosVariables));	
			this.jInternalFrameDetalleFormRubrosVariables.jButtonActualizarRubrosVariables.setVisible((this.isVisibilidadCeldaActualizarRubrosVariables && this.isPermisoActualizarRubrosVariables));	
			this.jInternalFrameDetalleFormRubrosVariables.jButtonEliminarRubrosVariables.setVisible((this.isVisibilidadCeldaEliminarRubrosVariables && this.isPermisoEliminarRubrosVariables));
			this.jInternalFrameDetalleFormRubrosVariables.jButtonCancelarRubrosVariables.setVisible(this.isVisibilidadCeldaCancelarRubrosVariables);							
			this.jInternalFrameDetalleFormRubrosVariables.jButtonGuardarCambiosRubrosVariables.setVisible((this.isVisibilidadCeldaGuardarRubrosVariables && this.isPermisoGuardarCambiosRubrosVariables));			
			
			}
						
			this.jButtonGuardarCambiosTablaRubrosVariables.setVisible((this.isVisibilidadCeldaGuardarCambiosRubrosVariables && this.isPermisoGuardarCambiosRubrosVariables));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarRubrosVariables.setVisible((this.isVisibilidadCeldaNuevoRubrosVariables && this.isPermisoNuevoRubrosVariables));						
			this.jButtonDuplicarToolBarRubrosVariables.setVisible((this.isVisibilidadCeldaDuplicarRubrosVariables && this.isPermisoDuplicarRubrosVariables));						
			this.jButtonCopiarToolBarRubrosVariables.setVisible((this.isVisibilidadCeldaCopiarRubrosVariables && this.isPermisoCopiarRubrosVariables));			
			this.jButtonVerFormToolBarRubrosVariables.setVisible((this.isVisibilidadCeldaVerFormRubrosVariables && this.isPermisoVerFormRubrosVariables));			
			this.jButtonAbrirOrderByToolBarRubrosVariables.setVisible((this.isVisibilidadCeldaOrdenRubrosVariables && this.isPermisoOrdenRubrosVariables));
			this.jButtonNuevoRelacionesToolBarRubrosVariables.setVisible((this.isVisibilidadCeldaNuevoRelacionesRubrosVariables && this.isPermisoNuevoRubrosVariables));			
			this.jButtonNuevoGuardarCambiosToolBarRubrosVariables.setVisible((this.isVisibilidadCeldaNuevoRubrosVariables && this.isPermisoNuevoRubrosVariables && this.isPermisoGuardarCambiosRubrosVariables));			
			
			if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
			this.jInternalFrameDetalleFormRubrosVariables.jButtonModificarToolBarRubrosVariables.setVisible((this.isVisibilidadCeldaModificarRubrosVariables && this.isPermisoActualizarRubrosVariables));	
			this.jInternalFrameDetalleFormRubrosVariables.jButtonActualizarToolBarRubrosVariables.setVisible((this.isVisibilidadCeldaActualizarRubrosVariables  && this.isPermisoActualizarRubrosVariables));	
			this.jInternalFrameDetalleFormRubrosVariables.jButtonEliminarToolBarRubrosVariables.setVisible((this.isVisibilidadCeldaEliminarRubrosVariables && this.isPermisoEliminarRubrosVariables));
			this.jInternalFrameDetalleFormRubrosVariables.jButtonCancelarToolBarRubrosVariables.setVisible(this.isVisibilidadCeldaCancelarRubrosVariables);				
			this.jInternalFrameDetalleFormRubrosVariables.jButtonGuardarCambiosToolBarRubrosVariables.setVisible((this.isVisibilidadCeldaGuardarRubrosVariables && this.isPermisoGuardarCambiosRubrosVariables));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarRubrosVariables.setVisible((this.isVisibilidadCeldaGuardarCambiosRubrosVariables && this.isPermisoGuardarCambiosRubrosVariables));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoRubrosVariables.setVisible((this.isVisibilidadCeldaNuevoRubrosVariables && this.isPermisoNuevoRubrosVariables));			
			this.jMenuItemDuplicarRubrosVariables.setVisible((this.isVisibilidadCeldaDuplicarRubrosVariables && this.isPermisoDuplicarRubrosVariables));			
			this.jMenuItemCopiarRubrosVariables.setVisible((this.isVisibilidadCeldaCopiarRubrosVariables && this.isPermisoCopiarRubrosVariables));			
			this.jMenuItemVerFormRubrosVariables.setVisible((this.isVisibilidadCeldaVerFormRubrosVariables && this.isPermisoVerFormRubrosVariables));			
			this.jMenuItemAbrirOrderByRubrosVariables.setVisible((this.isVisibilidadCeldaOrdenRubrosVariables && this.isPermisoOrdenRubrosVariables));			
			//this.jMenuItemMostrarOcultarRubrosVariables.setVisible((this.isVisibilidadCeldaOrdenRubrosVariables && this.isPermisoOrdenRubrosVariables));
			this.jMenuItemDetalleAbrirOrderByRubrosVariables.setVisible((this.isVisibilidadCeldaOrdenRubrosVariables && this.isPermisoOrdenRubrosVariables));			
			//this.jMenuItemDetalleMostrarOcultarRubrosVariables.setVisible((this.isVisibilidadCeldaOrdenRubrosVariables && this.isPermisoOrdenRubrosVariables));			
			this.jMenuItemNuevoRelacionesRubrosVariables.setVisible((this.isVisibilidadCeldaNuevoRelacionesRubrosVariables && this.isPermisoNuevoRubrosVariables));			
			this.jMenuItemNuevoGuardarCambiosRubrosVariables.setVisible((this.isVisibilidadCeldaNuevoRubrosVariables && this.isPermisoNuevoRubrosVariables && this.isPermisoGuardarCambiosRubrosVariables));									
			
			if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
			this.jInternalFrameDetalleFormRubrosVariables.jMenuItemModificarRubrosVariables.setVisible((this.isVisibilidadCeldaModificarRubrosVariables && this.isPermisoActualizarRubrosVariables));	
			this.jInternalFrameDetalleFormRubrosVariables.jMenuItemActualizarRubrosVariables.setVisible((this.isVisibilidadCeldaActualizarRubrosVariables && this.isPermisoActualizarRubrosVariables));	
			this.jInternalFrameDetalleFormRubrosVariables.jMenuItemEliminarRubrosVariables.setVisible((this.isVisibilidadCeldaEliminarRubrosVariables && this.isPermisoEliminarRubrosVariables));
			this.jInternalFrameDetalleFormRubrosVariables.jMenuItemCancelarRubrosVariables.setVisible(this.isVisibilidadCeldaCancelarRubrosVariables);				
			}
			
			this.jMenuItemGuardarCambiosRubrosVariables.setVisible((this.isVisibilidadCeldaGuardarRubrosVariables && this.isPermisoGuardarCambiosRubrosVariables));						
			this.jMenuItemGuardarCambiosTablaRubrosVariables.setVisible((this.isVisibilidadCeldaGuardarCambiosRubrosVariables && this.isPermisoGuardarCambiosRubrosVariables));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoRubrosVariables=this.jButtonNuevoRubrosVariables.isVisible();
			this.isVisibilidadCeldaDuplicarRubrosVariables=this.jButtonDuplicarRubrosVariables.isVisible();
			this.isVisibilidadCeldaCopiarRubrosVariables=this.jButtonCopiarRubrosVariables.isVisible();
			this.isVisibilidadCeldaVerFormRubrosVariables=this.jButtonVerFormRubrosVariables.isVisible();
			
			this.isVisibilidadCeldaOrdenRubrosVariables=this.jButtonAbrirOrderByRubrosVariables.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesRubrosVariables=this.jButtonNuevoRelacionesRubrosVariables.isVisible();
			this.isVisibilidadCeldaModificarRubrosVariables=this.jButtonModificarRubrosVariables.isVisible();
			
			if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
			this.isVisibilidadCeldaActualizarRubrosVariables=this.jInternalFrameDetalleFormRubrosVariables.jButtonActualizarRubrosVariables.isVisible();
			this.isVisibilidadCeldaEliminarRubrosVariables=this.jInternalFrameDetalleFormRubrosVariables.jButtonEliminarRubrosVariables.isVisible();
			this.isVisibilidadCeldaCancelarRubrosVariables=this.jInternalFrameDetalleFormRubrosVariables.jButtonCancelarRubrosVariables.isVisible();
			this.isVisibilidadCeldaGuardarRubrosVariables=this.jInternalFrameDetalleFormRubrosVariables.jButtonGuardarCambiosRubrosVariables.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosRubrosVariables=this.jButtonGuardarCambiosTablaRubrosVariables.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoRubrosVariables=this.jButtonNuevoToolBarRubrosVariables.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRubrosVariables=this.jButtonNuevoRelacionesToolBarRubrosVariables.isVisible();
			
			if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
			this.isVisibilidadCeldaModificarRubrosVariables=this.jInternalFrameDetalleFormRubrosVariables.jButtonModificarToolBarRubrosVariables.isVisible();
			this.isVisibilidadCeldaActualizarRubrosVariables=this.jInternalFrameDetalleFormRubrosVariables.jButtonActualizarToolBarRubrosVariables.isVisible();
			this.isVisibilidadCeldaEliminarRubrosVariables=this.jInternalFrameDetalleFormRubrosVariables.jButtonEliminarToolBarRubrosVariables.isVisible();
			this.isVisibilidadCeldaCancelarRubrosVariables=this.jInternalFrameDetalleFormRubrosVariables.jButtonCancelarToolBarRubrosVariables.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRubrosVariables=this.jButtonGuardarCambiosToolBarRubrosVariables.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRubrosVariables=this.jButtonGuardarCambiosTablaToolBarRubrosVariables.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoRubrosVariables=this.jMenuItemNuevoRubrosVariables.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRubrosVariables=this.jMenuItemNuevoRelacionesRubrosVariables.isVisible();
			
			if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
			this.isVisibilidadCeldaModificarRubrosVariables=this.jInternalFrameDetalleFormRubrosVariables.jMenuItemModificarRubrosVariables.isVisible();
			this.isVisibilidadCeldaActualizarRubrosVariables=this.jInternalFrameDetalleFormRubrosVariables.jMenuItemActualizarRubrosVariables.isVisible();
			this.isVisibilidadCeldaEliminarRubrosVariables=this.jInternalFrameDetalleFormRubrosVariables.jMenuItemEliminarRubrosVariables.isVisible();
			this.isVisibilidadCeldaCancelarRubrosVariables=this.jInternalFrameDetalleFormRubrosVariables.jMenuItemCancelarRubrosVariables.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRubrosVariables=this.jMenuItemGuardarCambiosRubrosVariables.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRubrosVariables=this.jMenuItemGuardarCambiosTablaRubrosVariables.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesRubrosVariables(Boolean esInicializar) {
		if(RubrosVariablesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.rubrosvariablesSessionBean.getConGuardarRelaciones()) {
				//if(this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesRubrosVariables();
			}
			
			this.inicializarActualizarBindingBotonesManualRubrosVariables(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualRubrosVariables() {
		this.jButtonNuevoRubrosVariables.setVisible(this.isPermisoNuevoRubrosVariables);			
		this.jButtonDuplicarRubrosVariables.setVisible(this.isPermisoDuplicarRubrosVariables);			
		this.jButtonCopiarRubrosVariables.setVisible(this.isPermisoCopiarRubrosVariables);			
		this.jButtonVerFormRubrosVariables.setVisible(this.isPermisoVerFormRubrosVariables);			
		
		this.jButtonAbrirOrderByRubrosVariables.setVisible(this.isPermisoOrdenRubrosVariables);					
		
		this.jButtonNuevoRelacionesRubrosVariables.setVisible(this.isPermisoNuevoRubrosVariables);			
		
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubrosVariables.jButtonModificarRubrosVariables.setVisible(this.isPermisoActualizarRubrosVariables);	
			this.jInternalFrameDetalleFormRubrosVariables.jButtonActualizarRubrosVariables.setVisible(this.isPermisoActualizarRubrosVariables);	
			this.jInternalFrameDetalleFormRubrosVariables.jButtonEliminarRubrosVariables.setVisible(this.isPermisoEliminarRubrosVariables);
			this.jInternalFrameDetalleFormRubrosVariables.jButtonCancelarRubrosVariables.setVisible(this.isVisibilidadCeldaCancelarRubrosVariables);						
			this.jInternalFrameDetalleFormRubrosVariables.jButtonGuardarCambiosRubrosVariables.setVisible(this.isPermisoGuardarCambiosRubrosVariables);							
		}
		
		this.jButtonGuardarCambiosTablaRubrosVariables.setVisible(this.isPermisoActualizarRubrosVariables);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleRubrosVariables() {
		this.jInternalFrameDetalleFormRubrosVariables.jButtonModificarRubrosVariables.setVisible(this.isPermisoActualizarRubrosVariables);	
		this.jInternalFrameDetalleFormRubrosVariables.jButtonActualizarRubrosVariables.setVisible(this.isPermisoActualizarRubrosVariables);	
		this.jInternalFrameDetalleFormRubrosVariables.jButtonEliminarRubrosVariables.setVisible(this.isPermisoEliminarRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jButtonCancelarRubrosVariables.setVisible(this.isVisibilidadCeldaCancelarRubrosVariables);							
		this.jInternalFrameDetalleFormRubrosVariables.jButtonGuardarCambiosRubrosVariables.setVisible((this.isVisibilidadCeldaGuardarRubrosVariables && this.isPermisoGuardarCambiosRubrosVariables));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosRubrosVariables() {
		if(RubrosVariablesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualRubrosVariables();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesRubrosVariables() {
	}
	
	public void jTableDatosRubrosVariablesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarRubrosVariables(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidRubrosVariablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubrosVariables(this.getrubrosvariables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubrosvariables =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubrosvariables =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubrosvariables==null) {
						this.rubrosvariables = new RubrosVariables();
					}

					this.setVariablesFormularioToObjetoActualRubrosVariables(this.rubrosvariables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
				}

				if(this.rubrosvariables.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.rubrosvariables.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubrosVariables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_contratoRubrosVariablesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocontrato=true;

			idTienePermisotipocontrato=this.tienePermisosUsuarioEnPaginaWebRubrosVariables(TipoContratoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocontrato) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRubrosVariables.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRubrosVariables.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariables =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rubrosvariables =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRubrosVariables(this.getrubrosvariables(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);

				this.tipocontratoBeanSwingJInternalFrame=new TipoContratoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocontratoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocontratoBeanSwingJInternalFrame.getTipoContratoLogic().setConnexion(this.rubrosvariablesLogic.getConnexion());

				if(this.rubrosvariables.getid_tipo_contrato()!=null) {
					this.tipocontratoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocontratoBeanSwingJInternalFrame.setIdActual(this.rubrosvariables.getid_tipo_contrato());
					this.tipocontratoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocontratoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocontratoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoContrato();
				}

				JInternalFrameBase jinternalFrame =this.tipocontratoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRubrosVariables=(TitledBorder)this.jScrollPanelDatosRubrosVariables.getBorder();
				TitledBorder titledBordertipocontrato=(TitledBorder)this.tipocontratoBeanSwingJInternalFrame.jScrollPanelDatosTipoContrato.getBorder();

				titledBordertipocontrato.setTitle(titledBorderRubrosVariables.getTitle() + " -> Tipo Contrato");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_contratoRubrosVariablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubrosVariables(this.getrubrosvariables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubrosvariables =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubrosvariables =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubrosvariables==null) {
						this.rubrosvariables = new RubrosVariables();
					}

					this.setVariablesFormularioToObjetoActualRubrosVariables(this.rubrosvariables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
				}

				if(this.rubrosvariables.getid_tipo_contrato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_contrato = "+this.rubrosvariables.getid_tipo_contrato().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubrosVariables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaRubrosVariablesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebRubrosVariables(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRubrosVariables.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRubrosVariables.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariables =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rubrosvariables =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRubrosVariables(this.getrubrosvariables(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.rubrosvariablesLogic.getConnexion());

				if(this.rubrosvariables.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.rubrosvariables.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRubrosVariables=(TitledBorder)this.jScrollPanelDatosRubrosVariables.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderRubrosVariables.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaRubrosVariablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubrosVariables(this.getrubrosvariables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubrosvariables =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubrosvariables =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubrosvariables==null) {
						this.rubrosvariables = new RubrosVariables();
					}

					this.setVariablesFormularioToObjetoActualRubrosVariables(this.rubrosvariables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
				}

				if(this.rubrosvariables.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.rubrosvariables.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubrosVariables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_rubro_empleaRubrosVariablesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisorubroemplea=true;

			idTienePermisorubroemplea=this.tienePermisosUsuarioEnPaginaWebRubrosVariables(RubroEmpleaConstantesFunciones.CLASSNAME);

			if(idTienePermisorubroemplea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRubrosVariables.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRubrosVariables.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariables =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rubrosvariables =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRubrosVariables(this.getrubrosvariables(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);

				this.rubroempleaBeanSwingJInternalFrame=new RubroEmpleaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.rubroempleaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.rubroempleaBeanSwingJInternalFrame.getRubroEmpleaLogic().setConnexion(this.rubrosvariablesLogic.getConnexion());

				if(this.rubrosvariables.getid_rubro_emplea()!=null) {
					this.rubroempleaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.rubroempleaBeanSwingJInternalFrame.setIdActual(this.rubrosvariables.getid_rubro_emplea());
					this.rubroempleaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.rubroempleaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.rubroempleaBeanSwingJInternalFrame.inicializarActualizarBindingTablaRubroEmplea();
				}

				JInternalFrameBase jinternalFrame =this.rubroempleaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRubrosVariables=(TitledBorder)this.jScrollPanelDatosRubrosVariables.getBorder();
				TitledBorder titledBorderrubroemplea=(TitledBorder)this.rubroempleaBeanSwingJInternalFrame.jScrollPanelDatosRubroEmplea.getBorder();

				titledBorderrubroemplea.setTitle(titledBorderRubrosVariables.getTitle() + " -> Rubro Emplea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_rubro_empleaRubrosVariablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubrosVariables(this.getrubrosvariables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubrosvariables =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubrosvariables =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubrosvariables==null) {
						this.rubrosvariables = new RubrosVariables();
					}

					this.setVariablesFormularioToObjetoActualRubrosVariables(this.rubrosvariables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
				}

				if(this.rubrosvariables.getid_rubro_emplea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_rubro_emplea = "+this.rubrosvariables.getid_rubro_emplea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubrosVariables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_desdeRubrosVariablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubrosVariables(this.getrubrosvariables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubrosvariables =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubrosvariables =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubrosvariables==null) {
						this.rubrosvariables = new RubrosVariables();
					}

					this.setVariablesFormularioToObjetoActualRubrosVariables(this.rubrosvariables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
				}

				if(this.rubrosvariables.getfecha_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_desde = '"+Funciones2.getStringPostgresDate(this.rubrosvariables.getfecha_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubrosVariables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_hastaRubrosVariablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubrosVariables(this.getrubrosvariables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubrosvariables =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubrosvariables =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubrosvariables==null) {
						this.rubrosvariables = new RubrosVariables();
					}

					this.setVariablesFormularioToObjetoActualRubrosVariables(this.rubrosvariables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
				}

				if(this.rubrosvariables.getfecha_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hasta = '"+Funciones2.getStringPostgresDate(this.rubrosvariables.getfecha_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubrosVariables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoRubrosVariablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubrosVariables(this.getrubrosvariables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubrosvariables =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubrosvariables =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubrosvariables==null) {
						this.rubrosvariables = new RubrosVariables();
					}

					this.setVariablesFormularioToObjetoActualRubrosVariables(this.rubrosvariables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
				}

				if(this.rubrosvariables.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.rubrosvariables.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubrosVariables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreRubrosVariablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubrosVariables(this.getrubrosvariables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubrosvariables =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubrosvariables =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubrosvariables==null) {
						this.rubrosvariables = new RubrosVariables();
					}

					this.setVariablesFormularioToObjetoActualRubrosVariables(this.rubrosvariables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
				}

				if(this.rubrosvariables.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.rubrosvariables.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubrosVariables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaRubrosVariablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubrosVariables(this.getrubrosvariables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubrosvariables =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubrosvariables =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubrosvariables==null) {
						this.rubrosvariables = new RubrosVariables();
					}

					this.setVariablesFormularioToObjetoActualRubrosVariables(this.rubrosvariables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
				}

				if(this.rubrosvariables.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.rubrosvariables.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubrosVariables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorRubrosVariablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubrosVariables(this.getrubrosvariables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubrosvariables =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubrosvariables =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubrosvariables==null) {
						this.rubrosvariables = new RubrosVariables();
					}

					this.setVariablesFormularioToObjetoActualRubrosVariables(this.rubrosvariables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
				}

				if(this.rubrosvariables.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.rubrosvariables.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubrosVariables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_rubro_empleaRubrosVariablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRubrosVariables(this.getrubrosvariables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubrosvariables =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rubrosvariables =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rubrosvariables==null) {
						this.rubrosvariables = new RubrosVariables();
					}

					this.setVariablesFormularioToObjetoActualRubrosVariables(this.rubrosvariables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);
				}

				if(this.rubrosvariables.getnombre_rubro_emplea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_rubro_emplea like '%"+this.rubrosvariables.getnombre_rubro_emplea()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRubrosVariables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaRubrosVariablesRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRubrosVariables(false,false);

			this.getRubrosVariablessBusquedaRubrosVariables();

			this.inicializarActualizarBindingRubrosVariables(false);

			//if(RubrosVariablesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRubrosVariables(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRubrosVariables(false,false);

			this.getRubrosVariablessFK_IdEmpresa();

			this.inicializarActualizarBindingRubrosVariables(false);

			//if(RubrosVariablesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRubrosVariables(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdRubroEmpleaRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRubrosVariables(false,false);

			this.getRubrosVariablessFK_IdRubroEmplea();

			this.inicializarActualizarBindingRubrosVariables(false);

			//if(RubrosVariablesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRubrosVariables(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoContratoRubrosVariablesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRubrosVariables(false,false);

			this.getRubrosVariablessFK_IdTipoContrato();

			this.inicializarActualizarBindingRubrosVariables(false);

			//if(RubrosVariablesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRubrosVariables(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rubrosvariablesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameRubrosVariables() {
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
			this.jInternalFrameDetalleFormRubrosVariables.setVisible(false);	    			
			this.jInternalFrameDetalleFormRubrosVariables.dispose();
			this.jInternalFrameDetalleFormRubrosVariables=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoRubrosVariables!=null) {
			this.jInternalFrameReporteDinamicoRubrosVariables.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoRubrosVariables.dispose();
			this.jInternalFrameReporteDinamicoRubrosVariables=null;
		}
		
		if(this.jInternalFrameImportacionRubrosVariables!=null) {
			this.jInternalFrameImportacionRubrosVariables.setVisible(false);	    			
			this.jInternalFrameImportacionRubrosVariables.dispose();
			this.jInternalFrameImportacionRubrosVariables=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessRubrosVariables();
			
			RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
			
			
			if(sTipo.equals("NuevoRubrosVariables")) {
				jButtonNuevoRubrosVariablesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarRubrosVariables")) {
				jButtonDuplicarRubrosVariablesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarRubrosVariables")) {
				jButtonCopiarRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("VerFormRubrosVariables")) {
				jButtonVerFormRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarRubrosVariables")) {
				jButtonNuevoRubrosVariablesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarRubrosVariables")) {
				jButtonDuplicarRubrosVariablesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoRubrosVariables")) {
				jButtonNuevoRubrosVariablesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarRubrosVariables")) {
				jButtonDuplicarRubrosVariablesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesRubrosVariables")) {
				jButtonNuevoRubrosVariablesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarRubrosVariables")) {
				jButtonNuevoRubrosVariablesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesRubrosVariables")) {
				jButtonNuevoRubrosVariablesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarRubrosVariables")) {
				jButtonModificarRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarRubrosVariables")) {
				jButtonModificarRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarRubrosVariables")) {
				jButtonModificarRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarRubrosVariables")) {
				jButtonActualizarRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarRubrosVariables")) {
				jButtonActualizarRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarRubrosVariables")) {
				jButtonActualizarRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("EliminarRubrosVariables")) {
				jButtonEliminarRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarRubrosVariables")) {
				jButtonEliminarRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarRubrosVariables")) {
				jButtonEliminarRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("CancelarRubrosVariables")) {
				jButtonCancelarRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarRubrosVariables")) {
				jButtonCancelarRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarRubrosVariables")) {
				jButtonCancelarRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("CerrarRubrosVariables")) {
				jButtonCerrarRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarRubrosVariables")) {
				jButtonCerrarRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarRubrosVariables")) {
				jButtonCerrarRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarRubrosVariables")) {
				jButtonMostrarOcultarRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarRubrosVariables")) {
				jButtonCancelarRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosRubrosVariables")) {
				jButtonGuardarCambiosRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarRubrosVariables")) {
				jButtonGuardarCambiosRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarRubrosVariables")) {
				jButtonCopiarRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarRubrosVariables")) {
				jButtonVerFormRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosRubrosVariables")) {
				jButtonGuardarCambiosRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarRubrosVariables")) {
				jButtonCopiarRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormRubrosVariables")) {
				jButtonVerFormRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaRubrosVariables")) {
				jButtonGuardarCambiosRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarRubrosVariables")) {
				jButtonGuardarCambiosRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaRubrosVariables")) {
				jButtonGuardarCambiosRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionRubrosVariables")) {
				jButtonRecargarInformacionRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarRubrosVariables")) {
				jButtonRecargarInformacionRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionRubrosVariables")) {
				jButtonRecargarInformacionRubrosVariablesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresRubrosVariables")) {
				jButtonAnterioresRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarRubrosVariables")) {
				jButtonAnterioresRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreRubrosVariables")) {
				jButtonAnterioresRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesRubrosVariables")) {
				jButtonSiguientesRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarRubrosVariables")) {
				jButtonSiguientesRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesRubrosVariables")) {
				jButtonSiguientesRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByRubrosVariables") || sTipo.equals("MenuItemDetalleAbrirOrderByRubrosVariables")) {
				jButtonAbrirOrderByRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarRubrosVariables") || sTipo.equals("MenuItemDetalleMostrarOcultarRubrosVariables")) {
				jButtonMostrarOcultarRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosRubrosVariables")) {
				jButtonNuevoGuardarCambiosRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarRubrosVariables")) {
				jButtonNuevoGuardarCambiosRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosRubrosVariables")) {
				jButtonNuevoGuardarCambiosRubrosVariablesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoRubrosVariables")) {
				jButtonCerrarReporteDinamicoRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoRubrosVariables")) {
				jButtonGenerarReporteDinamicoRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoRubrosVariables")) {
				
				jButtonGenerarExcelReporteDinamicoRubrosVariablesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionRubrosVariables")) {
				jButtonCerrarImportacionRubrosVariablesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionRubrosVariables")) {
				
				jButtonGenerarImportacionRubrosVariablesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionRubrosVariables")) {
				
				jButtonAbrirImportacionRubrosVariablesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesRubrosVariables")) {
				jComboBoxTiposAccionesRubrosVariablesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesRubrosVariables")) {
				jComboBoxTiposRelacionesRubrosVariablesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioRubrosVariables")) {
				jComboBoxTiposAccionesRubrosVariablesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarRubrosVariables")) {
				
				jComboBoxTiposSeleccionarRubrosVariablesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralRubrosVariables")) {
				jTextFieldValorCampoGeneralRubrosVariablesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByRubrosVariables")) {
				jButtonAbrirOrderByRubrosVariablesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarRubrosVariables")) {
				jButtonAbrirOrderByRubrosVariablesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByRubrosVariables")) {
				jButtonCerrarOrderByRubrosVariablesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRubrosVariablesBusqueda")) {
				this.jButtonidRubrosVariablesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_contratoRubrosVariablesUpdate")) {
				this.jButtonid_tipo_contratoRubrosVariablesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_contratoRubrosVariablesBusqueda")) {
				this.jButtonid_tipo_contratoRubrosVariablesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRubrosVariablesUpdate")) {
				this.jButtonid_empresaRubrosVariablesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRubrosVariablesBusqueda")) {
				this.jButtonid_empresaRubrosVariablesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_rubro_empleaRubrosVariablesUpdate")) {
				this.jButtonid_rubro_empleaRubrosVariablesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_rubro_empleaRubrosVariablesBusqueda")) {
				this.jButtonid_rubro_empleaRubrosVariablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeRubrosVariablesBusqueda")) {
				this.jButtonfecha_desdeRubrosVariablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaRubrosVariablesBusqueda")) {
				this.jButtonfecha_hastaRubrosVariablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoRubrosVariablesBusqueda")) {
				this.jButtoncodigoRubrosVariablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreRubrosVariablesBusqueda")) {
				this.jButtonnombreRubrosVariablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaRubrosVariablesBusqueda")) {
				this.jButtonfechaRubrosVariablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorRubrosVariablesBusqueda")) {
				this.jButtonvalorRubrosVariablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_rubro_empleaRubrosVariablesBusqueda")) {
				this.jButtonnombre_rubro_empleaRubrosVariablesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaRubrosVariablesRubrosVariables")) {
				this.jButtonBusquedaRubrosVariablesRubrosVariablesActionPerformed(evt);
			}
			
			;
			
			
			RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessRubrosVariables();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubrosVariablesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubrosvariables);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubrosvariables);
				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
				
				


				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubrosVariables.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubrosVariables.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			RubrosVariables rubrosvariablesLocal=null;
			
			if(!this.getEsControlTabla()) {
				rubrosvariablesLocal=this.rubrosvariables;
			} else {
				rubrosvariablesLocal=this.rubrosvariablesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubrosvariables);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubrosvariables);
				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
							
				
				


				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubrosVariables.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubrosVariables.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubrosVariablesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesAnterior =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubrosvariablesAnterior =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
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
			
			RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
			
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
			
			


			
			RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubrosVariablesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubrosvariables);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubrosvariables);
				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
								
						
				


				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubrosVariables.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubrosVariables.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubrosvariables);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubrosvariables);
				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
								
				
				


				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubrosVariables.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubrosVariables.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubrosVariablesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesAnterior =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubrosvariablesAnterior =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubrosvariables);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubrosvariables);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubrosVariablesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesAnterior =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubrosvariablesAnterior =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubrosVariablesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rubrosvariables);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rubrosvariables);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubrosvariables);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubrosvariables);
				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
							
				
				


				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubrosVariables.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubrosVariables.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubrosVariablesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubrosvariablesAnterior =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.rubrosvariablesAnterior =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
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
			
			RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
			
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
			
			


			
			RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubrosVariablesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rubrosvariables);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rubrosvariables);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubrosvariables);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubrosvariables);
				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
								
				
				


				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubrosVariables.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubrosVariables.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubrosVariablesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesAnterior =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubrosvariablesAnterior =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubrosVariablesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rubrosvariables);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rubrosvariables);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubrosVariablesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubrosvariables);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubrosvariables);
				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosRubrosVariables")) {
					jCheckBoxSeleccionarTodosRubrosVariablesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosRubrosVariables")) {
					jCheckBoxSeleccionadosRubrosVariablesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarRubrosVariables")) {
					
				}
				
				


				
				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubrosVariables.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubrosVariables.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.rubrosvariables);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.rubrosvariables);
				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
												
				
				


				
				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubrosVariables.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubrosVariables.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubrosVariablesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rubrosvariablesAnterior =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.rubrosvariablesAnterior =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubrosVariablesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubrosvariables);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubrosvariables);
				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
				
				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
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
			
			RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
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
			
			


			
			RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRubrosVariablesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubrosvariables);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubrosvariables);
				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubrosVariables.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubrosVariables.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rubrosvariables);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rubrosvariables);
				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
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
				
				


				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RubrosVariables.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RubrosVariables.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRubrosVariablesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rubrosvariablesAnterior =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rubrosvariablesAnterior =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarRubrosVariables")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosRubrosVariablesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosRubrosVariables.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.rubrosvariables =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.rubrosvariables =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.rubrosvariables);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarRubrosVariables")) {
				
				}
				
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarRubrosVariables")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosRubrosVariables.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarRubrosVariables")) {
			
			}
			
			RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessRubrosVariables();
			
			RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
			
			if(sTipo.equals("NuevoRubrosVariables")) {
				jButtonNuevoRubrosVariablesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarRubrosVariables")) {
				jButtonDuplicarRubrosVariablesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarRubrosVariables")) {
				jButtonCopiarRubrosVariablesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormRubrosVariables")) {
				jButtonVerFormRubrosVariablesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesRubrosVariables")) {
				jButtonNuevoRubrosVariablesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarRubrosVariables")) {
				jButtonModificarRubrosVariablesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarRubrosVariables")) {
				jButtonActualizarRubrosVariablesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarRubrosVariables")) {
				jButtonEliminarRubrosVariablesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaRubrosVariables")) {
				jButtonGuardarCambiosRubrosVariablesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarRubrosVariables")) {
				jButtonCancelarRubrosVariablesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarRubrosVariables")) {
				jButtonCerrarRubrosVariablesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosRubrosVariables")) {
				jButtonGuardarCambiosRubrosVariablesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosRubrosVariables")) {
				jButtonNuevoGuardarCambiosRubrosVariablesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByRubrosVariables")) {
				jButtonAbrirOrderByRubrosVariablesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionRubrosVariables")) {
				jButtonRecargarInformacionRubrosVariablesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresRubrosVariables")) {
				jButtonAnterioresRubrosVariablesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesRubrosVariables")) {
				jButtonSiguientesRubrosVariablesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRubrosVariablesBusqueda")) {
				this.jButtonidRubrosVariablesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_contratoRubrosVariablesUpdate")) {
				this.jButtonid_tipo_contratoRubrosVariablesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_contratoRubrosVariablesBusqueda")) {
				this.jButtonid_tipo_contratoRubrosVariablesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRubrosVariablesUpdate")) {
				this.jButtonid_empresaRubrosVariablesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRubrosVariablesBusqueda")) {
				this.jButtonid_empresaRubrosVariablesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_rubro_empleaRubrosVariablesUpdate")) {
				this.jButtonid_rubro_empleaRubrosVariablesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_rubro_empleaRubrosVariablesBusqueda")) {
				this.jButtonid_rubro_empleaRubrosVariablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeRubrosVariablesBusqueda")) {
				this.jButtonfecha_desdeRubrosVariablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaRubrosVariablesBusqueda")) {
				this.jButtonfecha_hastaRubrosVariablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoRubrosVariablesBusqueda")) {
				this.jButtoncodigoRubrosVariablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreRubrosVariablesBusqueda")) {
				this.jButtonnombreRubrosVariablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaRubrosVariablesBusqueda")) {
				this.jButtonfechaRubrosVariablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorRubrosVariablesBusqueda")) {
				this.jButtonvalorRubrosVariablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_rubro_empleaRubrosVariablesBusqueda")) {
				this.jButtonnombre_rubro_empleaRubrosVariablesBusquedaActionPerformed(evt);
			}
			
			RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessRubrosVariables();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameRubrosVariables")) {
				closingInternalFrameRubrosVariables();
				
			} else if(sTipo.equals("jButtonCancelarRubrosVariables")) {
				JInternalFrameBase jInternalFrameDetalleFormRubrosVariables = (JInternalFrameBase)evt.getSource();
	            	
	            RubrosVariablesBeanSwingJInternalFrame jInternalFrameParent=(RubrosVariablesBeanSwingJInternalFrame)jInternalFrameDetalleFormRubrosVariables.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarRubrosVariablesActionPerformed(null);
			}
			
			RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.rubrosvariables,new Object(),this.rubrosvariablesParameterGeneral,this.rubrosvariablesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormRubrosVariables(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormRubrosVariables(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormRubrosVariables(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.rubrosvariables)) {
			if(!esControlTabla) {
				if(RubrosVariablesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualRubrosVariables(this.rubrosvariables,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);			
				}
				
				if(this.rubrosvariablesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualRubrosVariables(this.rubrosvariables,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanRubrosVariables(this.rubrosvariablesReturnGeneral,this.rubrosvariablesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.rubrosvariablesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanRubrosVariables(classes,this.rubrosvariablesReturnGeneral,this.rubrosvariablesBean,false);
					}
						
					if(this.rubrosvariablesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyRubrosVariables(this.rubrosvariablesReturnGeneral.getRubrosVariables());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioRubrosVariables(this.rubrosvariablesReturnGeneral.getRubrosVariables());	
					}
						
					if(this.rubrosvariablesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioRubrosVariables(this.rubrosvariablesReturnGeneral.getRubrosVariables(),classes);//this.rubrosvariablesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioRubrosVariables(this.rubrosvariables,classes);//this.rubrosvariablesBean);									
				}
			
				if(RubrosVariablesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualRubrosVariables(this.rubrosvariables,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRubrosVariables(this.rubrosvariables);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.rubrosvariablesAnterior!=null) {
						this.rubrosvariables=this.rubrosvariablesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.rubrosvariablesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.rubrosvariablesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.rubrosvariablesReturnGeneral.getRubrosVariables(),rubrosvariablesLogic.getRubrosVariabless());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.rubrosvariablesReturnGeneral.getRubrosVariables(),this.rubrosvariabless);
				}
				//ARCHITECTURE
				
				//this.jTableDatosRubrosVariables.repaint();
				
				//((AbstractTableModel) this.jTableDatosRubrosVariables.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosRubrosVariables();
			}
		}
	}
	
	public void actualizarVisualTableDatosRubrosVariables() throws Exception {
		
		RubrosVariablesModel rubrosvariablesModel=(RubrosVariablesModel)this.jTableDatosRubrosVariables.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rubrosvariablesModel.rubrosvariabless=this.rubrosvariablesLogic.getRubrosVariabless();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			rubrosvariablesModel.rubrosvariabless=this.rubrosvariabless;
		}
		
		
		((RubrosVariablesModel) this.jTableDatosRubrosVariables.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaRubrosVariables() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getrubrosvariablesAnterior(),this.rubrosvariablesLogic.getRubrosVariabless());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getrubrosvariablesAnterior(),this.rubrosvariabless);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosRubrosVariables();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioRubrosVariables(RubrosVariables rubrosvariables,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
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
										
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rubrosvariables,new Object(),generalEntityParameterGeneral,this.rubrosvariablesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.rubrosvariablesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=RubrosVariablesConstantesFunciones.getClassesRelationshipsOfRubrosVariables(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=RubrosVariablesConstantesFunciones.getClassesRelationshipsFromStringsOfRubrosVariables(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormRubrosVariables(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				RubrosVariablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rubrosvariables,new Object(),generalEntityParameterGeneral,this.rubrosvariablesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioRubrosVariables(RubrosVariablesBean rubrosvariablesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanRubrosVariables(ArrayList<Classe> classes,RubrosVariablesReturnGeneral rubrosvariablesReturnGeneral,RubrosVariablesBean rubrosvariablesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualRubrosVariables(RubrosVariables rubrosvariables,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.rubrosvariables)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormRubrosVariables = new RubrosVariablesDetalleFormJInternalFrame(jDesktopPane,this.rubrosvariablesSessionBean.getConGuardarRelaciones(),this.rubrosvariablesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.setVisible(false);
		this.jInternalFrameDetalleFormRubrosVariables.setSelected(false);						
		
		this.jInternalFrameDetalleFormRubrosVariables.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormRubrosVariables.rubrosvariablesLogic=this.rubrosvariablesLogic;
		
		this.cargarCombosFrameForeignKeyRubrosVariables("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleRubrosVariables();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRubrosVariables();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyRubrosVariables("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyRubrosVariables();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormRubrosVariables.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRubrosVariables"));
		
		this.jInternalFrameDetalleFormRubrosVariables.jButtonModificarRubrosVariables.addActionListener(new ButtonActionListener(this,"ModificarRubrosVariables"));

		
		this.jInternalFrameDetalleFormRubrosVariables.jButtonModificarToolBarRubrosVariables.addActionListener(new ButtonActionListener(this,"ModificarToolBarRubrosVariables"));
					
		this.jInternalFrameDetalleFormRubrosVariables.jMenuItemModificarRubrosVariables.addActionListener(new ButtonActionListener(this,"MenuItemModificarRubrosVariables"));		
		
		
		
		this.jInternalFrameDetalleFormRubrosVariables.jButtonActualizarRubrosVariables.addActionListener (new ButtonActionListener(this,"ActualizarRubrosVariables"));
		
		
		this.jInternalFrameDetalleFormRubrosVariables.jButtonActualizarToolBarRubrosVariables.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRubrosVariables"));
						
		this.jInternalFrameDetalleFormRubrosVariables.jMenuItemActualizarRubrosVariables.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRubrosVariables"));		
		
		
		
		this.jInternalFrameDetalleFormRubrosVariables.jButtonEliminarRubrosVariables.addActionListener (new ButtonActionListener(this,"EliminarRubrosVariables"));
		
		
		this.jInternalFrameDetalleFormRubrosVariables.jButtonEliminarToolBarRubrosVariables.addActionListener (new ButtonActionListener(this,"EliminarToolBarRubrosVariables"));
								
		this.jInternalFrameDetalleFormRubrosVariables.jMenuItemEliminarRubrosVariables.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRubrosVariables"));		
		
		
		
		this.jInternalFrameDetalleFormRubrosVariables.jButtonCancelarRubrosVariables.addActionListener (new ButtonActionListener(this,"CancelarRubrosVariables"));
		
		
		this.jInternalFrameDetalleFormRubrosVariables.jButtonCancelarToolBarRubrosVariables.addActionListener (new ButtonActionListener(this,"CancelarToolBarRubrosVariables"));
					
		this.jInternalFrameDetalleFormRubrosVariables.jMenuItemCancelarRubrosVariables.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRubrosVariables"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormRubrosVariables.jMenuItemDetalleCerrarRubrosVariables.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRubrosVariables"));		
		
		
		
		this.jInternalFrameDetalleFormRubrosVariables.jButtonGuardarCambiosToolBarRubrosVariables.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRubrosVariables"));
		
		
		
		this.jInternalFrameDetalleFormRubrosVariables.jButtonGuardarCambiosToolBarRubrosVariables.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRubrosVariables"));
		
		
		
		this.jInternalFrameDetalleFormRubrosVariables.jComboBoxTiposAccionesFormularioRubrosVariables.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRubrosVariables"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonidRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"idRubrosVariablesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubrosVariables.jButtonid_tipo_contratoRubrosVariablesUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_contratoRubrosVariablesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonid_tipo_contratoRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_contratoRubrosVariablesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubrosVariables.jButtonid_empresaRubrosVariablesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRubrosVariablesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonid_empresaRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRubrosVariablesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubrosVariables.jButtonid_rubro_empleaRubrosVariablesUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubrosVariablesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonid_rubro_empleaRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubrosVariablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonfecha_desdeRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeRubrosVariablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonfecha_hastaRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaRubrosVariablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtoncodigoRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"codigoRubrosVariablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonnombreRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"nombreRubrosVariablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonfechaRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"fechaRubrosVariablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonvalorRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"valorRubrosVariablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonnombre_rubro_empleaRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_rubro_empleaRubrosVariablesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormRubrosVariables.jTabbedPaneRelacionesRubrosVariables.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRubrosVariables"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameRubrosVariables"));
		
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubrosVariables.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRubrosVariables"));
		}
		
		this.jTableDatosRubrosVariables.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarRubrosVariables"));
		
		this.jTableDatosRubrosVariables.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarRubrosVariables"));
		
		this.jButtonNuevoRubrosVariables.addActionListener(new ButtonActionListener(this,"NuevoRubrosVariables"));
		
		this.jButtonDuplicarRubrosVariables.addActionListener(new ButtonActionListener(this,"DuplicarRubrosVariables"));
		
		this.jButtonCopiarRubrosVariables.addActionListener(new ButtonActionListener(this,"CopiarRubrosVariables"));
		
		this.jButtonVerFormRubrosVariables.addActionListener(new ButtonActionListener(this,"VerFormRubrosVariables"));
		
		
		this.jButtonNuevoToolBarRubrosVariables.addActionListener(new ButtonActionListener(this,"NuevoToolBarRubrosVariables"));
			
		this.jButtonDuplicarToolBarRubrosVariables.addActionListener(new ButtonActionListener(this,"DuplicarToolBarRubrosVariables"));
			
		this.jMenuItemNuevoRubrosVariables.addActionListener (new ButtonActionListener(this,"MenuItemNuevoRubrosVariables"));
			
		this.jMenuItemDuplicarRubrosVariables.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarRubrosVariables"));		
		
		
		this.jButtonNuevoRelacionesRubrosVariables.addActionListener (new ButtonActionListener(this,"NuevoRelacionesRubrosVariables"));
		
		
		this.jButtonNuevoRelacionesToolBarRubrosVariables.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarRubrosVariables"));
			
		this.jMenuItemNuevoRelacionesRubrosVariables.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesRubrosVariables"));		
		
		
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubrosVariables.jButtonModificarRubrosVariables.addActionListener(new ButtonActionListener(this,"ModificarRubrosVariables"));
		}
		
		
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubrosVariables.jButtonModificarToolBarRubrosVariables.addActionListener(new ButtonActionListener(this,"ModificarToolBarRubrosVariables"));
			
			this.jInternalFrameDetalleFormRubrosVariables.jMenuItemModificarRubrosVariables.addActionListener(new ButtonActionListener(this,"MenuItemModificarRubrosVariables"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormRubrosVariables.jButtonActualizarRubrosVariables.addActionListener (new ButtonActionListener(this,"ActualizarRubrosVariables"));
		}
		
		
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubrosVariables.jButtonActualizarToolBarRubrosVariables.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRubrosVariables"));
				
			this.jInternalFrameDetalleFormRubrosVariables.jMenuItemActualizarRubrosVariables.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRubrosVariables"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubrosVariables.jButtonEliminarRubrosVariables.addActionListener (new ButtonActionListener(this,"EliminarRubrosVariables"));
		}
		
		
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubrosVariables.jButtonEliminarToolBarRubrosVariables.addActionListener (new ButtonActionListener(this,"EliminarToolBarRubrosVariables"));
						
			this.jInternalFrameDetalleFormRubrosVariables.jMenuItemEliminarRubrosVariables.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRubrosVariables"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubrosVariables.jButtonCancelarRubrosVariables.addActionListener (new ButtonActionListener(this,"CancelarRubrosVariables"));
		}
		
		
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubrosVariables.jButtonCancelarToolBarRubrosVariables.addActionListener (new ButtonActionListener(this,"CancelarToolBarRubrosVariables"));
			
			this.jInternalFrameDetalleFormRubrosVariables.jMenuItemCancelarRubrosVariables.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRubrosVariables"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarRubrosVariables.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarRubrosVariables"));		
		
		
		this.jButtonCerrarRubrosVariables.addActionListener (new ButtonActionListener(this,"CerrarRubrosVariables"));
		
		
		this.jButtonCerrarToolBarRubrosVariables.addActionListener (new ButtonActionListener(this,"CerrarToolBarRubrosVariables"));
			
		this.jMenuItemCerrarRubrosVariables.addActionListener (new ButtonActionListener(this,"MenuItemCerrarRubrosVariables"));
			
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubrosVariables.jMenuItemDetalleCerrarRubrosVariables.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRubrosVariables"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubrosVariables.jButtonGuardarCambiosRubrosVariables.addActionListener (new ButtonActionListener(this,"GuardarCambiosRubrosVariables"));
		}
		
		
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubrosVariables.jButtonGuardarCambiosToolBarRubrosVariables.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRubrosVariables"));
		}
		
		this.jButtonCopiarToolBarRubrosVariables.addActionListener (new ButtonActionListener(this,"CopiarToolBarRubrosVariables"));
			
		this.jButtonVerFormToolBarRubrosVariables.addActionListener (new ButtonActionListener(this,"VerFormToolBarRubrosVariables"));
		
		this.jMenuItemGuardarCambiosRubrosVariables.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosRubrosVariables"));
			
		this.jMenuItemCopiarRubrosVariables.addActionListener (new ButtonActionListener(this,"MenuItemCopiarRubrosVariables"));		
		
		this.jMenuItemVerFormRubrosVariables.addActionListener (new ButtonActionListener(this,"MenuItemVerFormRubrosVariables"));		
		
		
		this.jButtonGuardarCambiosTablaRubrosVariables.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRubrosVariables"));
		
		
		this.jButtonGuardarCambiosTablaToolBarRubrosVariables.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarRubrosVariables"));
			
		this.jMenuItemGuardarCambiosTablaRubrosVariables.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRubrosVariables"));		
		
		
		
		this.jButtonRecargarInformacionRubrosVariables.addActionListener (new ButtonActionListener(this,"RecargarInformacionRubrosVariables"));
					
		this.jButtonRecargarInformacionToolBarRubrosVariables.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarRubrosVariables"));
		
		this.jMenuItemRecargarInformacionRubrosVariables.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionRubrosVariables"));		
		
		
		
		this.jButtonAnterioresRubrosVariables.addActionListener (new ButtonActionListener(this,"AnterioresRubrosVariables"));
		
		
		this.jButtonAnterioresToolBarRubrosVariables.addActionListener (new ButtonActionListener(this,"AnterioresToolBarRubrosVariables"));
		
		this.jMenuItemAnterioresRubrosVariables.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresRubrosVariables"));		
		
		
		this.jButtonSiguientesRubrosVariables.addActionListener (new ButtonActionListener(this,"SiguientesRubrosVariables"));
		
		
		this.jButtonSiguientesToolBarRubrosVariables.addActionListener (new ButtonActionListener(this,"SiguientesToolBarRubrosVariables"));
			
		this.jMenuItemSiguientesRubrosVariables.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesRubrosVariables"));
			
		this.jMenuItemAbrirOrderByRubrosVariables.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByRubrosVariables"));
			
		this.jMenuItemMostrarOcultarRubrosVariables.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarRubrosVariables"));
			
		this.jMenuItemDetalleAbrirOrderByRubrosVariables.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByRubrosVariables"));
			
		this.jMenuItemDetalleMostarOcultarRubrosVariables.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarRubrosVariables"));		
		
		
		this.jButtonNuevoGuardarCambiosRubrosVariables.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosRubrosVariables"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarRubrosVariables.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarRubrosVariables"));
			
		this.jMenuItemNuevoGuardarCambiosRubrosVariables.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosRubrosVariables"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosRubrosVariables.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosRubrosVariables"));

		this.jCheckBoxSeleccionadosRubrosVariables.addItemListener(new CheckBoxItemListener(this,"SeleccionadosRubrosVariables"));
		
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubrosVariables.jComboBoxTiposAccionesFormularioRubrosVariables.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRubrosVariables"));
		}
		
		
		this.jComboBoxTiposRelacionesRubrosVariables.addActionListener (new ButtonActionListener(this,"TiposRelacionesRubrosVariables"));
			
		this.jComboBoxTiposAccionesRubrosVariables.addActionListener (new ButtonActionListener(this,"TiposAccionesRubrosVariables"));
					
		this.jComboBoxTiposSeleccionarRubrosVariables.addActionListener (new ButtonActionListener(this,"TiposSeleccionarRubrosVariables"));
			
		this.jTextFieldValorCampoGeneralRubrosVariables.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralRubrosVariables"));		
		
		
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonidRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"idRubrosVariablesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubrosVariables.jButtonid_tipo_contratoRubrosVariablesUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_contratoRubrosVariablesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonid_tipo_contratoRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_contratoRubrosVariablesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubrosVariables.jButtonid_empresaRubrosVariablesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRubrosVariablesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonid_empresaRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRubrosVariablesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubrosVariables.jButtonid_rubro_empleaRubrosVariablesUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubrosVariablesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonid_rubro_empleaRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubrosVariablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonfecha_desdeRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeRubrosVariablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonfecha_hastaRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaRubrosVariablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtoncodigoRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"codigoRubrosVariablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonnombreRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"nombreRubrosVariablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonfechaRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"fechaRubrosVariablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonvalorRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"valorRubrosVariablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonnombre_rubro_empleaRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_rubro_empleaRubrosVariablesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaRubrosVariablesRubrosVariables.addActionListener(new ButtonActionListener(this,"BusquedaRubrosVariablesRubrosVariables"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoRubrosVariables!=null) {
				this.jInternalFrameReporteDinamicoRubrosVariables.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRubrosVariables"));
				this.jInternalFrameReporteDinamicoRubrosVariables.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRubrosVariables"));
				this.jInternalFrameReporteDinamicoRubrosVariables.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRubrosVariables"));
			}
			
			//this.jButtonCerrarReporteDinamicoRubrosVariables.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRubrosVariables"));				
			//this.jButtonGenerarReporteDinamicoRubrosVariables.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRubrosVariables"));
			//this.jButtonGenerarExcelReporteDinamicoRubrosVariables.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRubrosVariables"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionRubrosVariables!=null) {
				this.jInternalFrameImportacionRubrosVariables.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRubrosVariables"));
				this.jInternalFrameImportacionRubrosVariables.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRubrosVariables"));
				this.jInternalFrameImportacionRubrosVariables.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRubrosVariables"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByRubrosVariables.addActionListener (new ButtonActionListener(this,"AbrirOrderByRubrosVariables"));
			
			this.jButtonAbrirOrderByToolBarRubrosVariables.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarRubrosVariables"));			
			
			if(this.jInternalFrameOrderByRubrosVariables!=null) {
				this.jInternalFrameOrderByRubrosVariables.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRubrosVariables"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormRubrosVariables!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRubrosVariables.jTabbedPaneRelacionesRubrosVariables.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRubrosVariables"));
		
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
            		closingInternalFrameRubrosVariables();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormRubrosVariables.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormRubrosVariables = (JInternalFrameBase)event.getSource();
	            	
	            RubrosVariablesBeanSwingJInternalFrame jInternalFrameParent=(RubrosVariablesBeanSwingJInternalFrame)jInternalFrameDetalleFormRubrosVariables.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarRubrosVariablesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosRubrosVariables.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosRubrosVariablesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosRubrosVariables.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosRubrosVariables.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubrosVariablesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubrosVariablesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubrosVariablesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRubrosVariables";
		inputMap = this.jButtonNuevoRubrosVariables.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRubrosVariables.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRubrosVariablesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubrosVariablesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubrosVariablesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRubrosVariablesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesRubrosVariables";
		inputMap = this.jButtonNuevoRelacionesRubrosVariables.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesRubrosVariables.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRubrosVariablesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarRubrosVariables";
		inputMap = this.jButtonModificarRubrosVariables.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarRubrosVariables.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarRubrosVariablesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarRubrosVariables";
		inputMap = this.jButtonActualizarRubrosVariables.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarRubrosVariables.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarRubrosVariablesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarRubrosVariables";
		inputMap = this.jButtonEliminarRubrosVariables.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarRubrosVariables.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarRubrosVariablesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarRubrosVariables";
		inputMap = this.jButtonCancelarRubrosVariables.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarRubrosVariables.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarRubrosVariablesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarRubrosVariables";
		inputMap = this.jButtonCerrarRubrosVariables.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarRubrosVariables.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarRubrosVariablesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormRubrosVariables.jButtonGuardarCambiosRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosRubrosVariables";
		inputMap = this.jInternalFrameDetalleFormRubrosVariables.jButtonGuardarCambiosRubrosVariables.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormRubrosVariables.jButtonGuardarCambiosRubrosVariables.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosRubrosVariablesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosRubrosVariables.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosRubrosVariablesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesRubrosVariables.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesRubrosVariablesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarRubrosVariables.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarRubrosVariablesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralRubrosVariables.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralRubrosVariablesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonidRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"idRubrosVariablesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubrosVariables.jButtonid_tipo_contratoRubrosVariablesUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_contratoRubrosVariablesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonid_tipo_contratoRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_contratoRubrosVariablesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubrosVariables.jButtonid_empresaRubrosVariablesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRubrosVariablesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonid_empresaRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRubrosVariablesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRubrosVariables.jButtonid_rubro_empleaRubrosVariablesUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubrosVariablesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonid_rubro_empleaRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaRubrosVariablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonfecha_desdeRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeRubrosVariablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonfecha_hastaRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaRubrosVariablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtoncodigoRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"codigoRubrosVariablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonnombreRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"nombreRubrosVariablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonfechaRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"fechaRubrosVariablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonvalorRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"valorRubrosVariablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRubrosVariables.jButtonnombre_rubro_empleaRubrosVariablesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_rubro_empleaRubrosVariablesBusqueda"));
		
		
		this.jButtonBusquedaRubrosVariablesRubrosVariables.addActionListener(new ButtonActionListener(this,"BusquedaRubrosVariablesRubrosVariables"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionRubrosVariables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionRubrosVariablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarRubrosVariablesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarRubrosVariables.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosRubrosVariables(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(RubrosVariables rubrosvariablesAux:this.rubrosvariablesLogic.getRubrosVariabless()) {
					rubrosvariablesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RubrosVariables rubrosvariablesAux:rubrosvariabless) {
					rubrosvariablesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosRubrosVariablesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRubrosVariables(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RubrosVariables rubrosvariablesAux:this.rubrosvariablesLogic.getRubrosVariabless()) {
						rubrosvariablesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RubrosVariables rubrosvariablesAux:rubrosvariabless) {
						rubrosvariablesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(RubrosVariables rubrosvariablesAux:this.rubrosvariablesLogic.getRubrosVariabless()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RubrosVariables rubrosvariablesAux:rubrosvariabless) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaRubrosVariables(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRubrosVariables.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRubrosVariables.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRubrosVariables,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosRubrosVariablesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRubrosVariables(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosRubrosVariables.getSelectedRows();
			
			RubrosVariables rubrosvariablesLocal=new RubrosVariables();
			
			//this.seleccionarTodosRubrosVariables(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubrosvariablesLocal =(RubrosVariables) this.rubrosvariablesLogic.getRubrosVariabless().toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					rubrosvariablesLocal =(RubrosVariables) this.rubrosvariabless.toArray()[this.jTableDatosRubrosVariables.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				rubrosvariablesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RubrosVariables rubrosvariablesAux:this.rubrosvariablesLogic.getRubrosVariabless()) {
						rubrosvariablesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RubrosVariables rubrosvariablesAux:rubrosvariabless) {
						rubrosvariablesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaRubrosVariables(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRubrosVariables.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRubrosVariables.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRubrosVariables,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualRubrosVariablesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarRubrosVariablesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralRubrosVariablesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingRubrosVariables(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralRubrosVariables.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RubrosVariables rubrosvariablesAux:this.rubrosvariablesLogic.getRubrosVariabless()) {
				
						if(sTipoSeleccionar.equals(RubrosVariablesConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							rubrosvariablesAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RubrosVariablesConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							rubrosvariablesAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RubrosVariablesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							rubrosvariablesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RubrosVariablesConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							rubrosvariablesAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RubrosVariablesConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							rubrosvariablesAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RubrosVariablesConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							rubrosvariablesAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RubrosVariablesConstantesFunciones.LABEL_NOMBRERUBROEMPLEA)) {
							existe=true;
							rubrosvariablesAux.setnombre_rubro_emplea(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RubrosVariables rubrosvariablesAux:rubrosvariabless) {
					
						if(sTipoSeleccionar.equals(RubrosVariablesConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							rubrosvariablesAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RubrosVariablesConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							rubrosvariablesAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RubrosVariablesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							rubrosvariablesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RubrosVariablesConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							rubrosvariablesAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RubrosVariablesConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							rubrosvariablesAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RubrosVariablesConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							rubrosvariablesAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RubrosVariablesConstantesFunciones.LABEL_NOMBRERUBROEMPLEA)) {
							existe=true;
							rubrosvariablesAux.setnombre_rubro_emplea(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaRubrosVariables(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesRubrosVariablesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingRubrosVariables(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioRubrosVariables=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesRubrosVariables.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormRubrosVariables.jComboBoxTiposAccionesFormularioRubrosVariables.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteRubrosVariables) {				
					conSplash=true;//false;										
					
					//this.startProcessRubrosVariables(conSplash);
				
					this.generarReporteRubrosVariablessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRubrosVariables.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRubrosVariables.jComboBoxTiposAccionesFormularioRubrosVariables.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoRubrosVariablessSeleccionados();
				//this.jComboBoxTiposAccionesRubrosVariables.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRubrosVariablessSeleccionados(false);
				//this.jComboBoxTiposAccionesRubrosVariables.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRubrosVariablessSeleccionados(true);
				//this.jComboBoxTiposAccionesRubrosVariables.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRubrosVariables();
				
				this.exportarRubrosVariablessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRubrosVariables.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRubrosVariables.jComboBoxTiposAccionesFormularioRubrosVariables.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionRubrosVariabless();
				//this.importarRubrosVariabless();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRubrosVariables.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRubrosVariables.jComboBoxTiposAccionesFormularioRubrosVariables.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRubrosVariables();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelRubrosVariablessSeleccionados();
				//this.jComboBoxTiposAccionesRubrosVariables.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Rubros Variables", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessRubrosVariables();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoRubrosVariables)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyRubrosVariables(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Rubros Variables",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRubrosVariables.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRubrosVariables.jComboBoxTiposAccionesFormularioRubrosVariables.setSelectedIndex(0);					
				}	
			} 			
			else if(RubrosVariablesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteRubrosVariables) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessRubrosVariables(conSplash);
					
						//this.actualizarParametrosGeneralRubrosVariables();
						
						this.generarReporteProcesoAccionRubrosVariablessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesRubrosVariables.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormRubrosVariables.jComboBoxTiposAccionesFormularioRubrosVariables.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(RubrosVariablesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Rubros VariablesES SELECCIONADOS?", "MANTENIMIENTO DE Rubros Variables", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessRubrosVariables();
				
						this.actualizarParametrosGeneralRubrosVariables();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.rubrosvariablesReturnGeneral=rubrosvariablesLogic.procesarAccionRubrosVariablessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.rubrosvariablesLogic.getRubrosVariabless(),this.rubrosvariablesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarRubrosVariablesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRubrosVariables.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRubrosVariables.jComboBoxTiposAccionesFormularioRubrosVariables.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralRubrosVariables();
					
					RubrosVariablesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarRubrosVariablesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRubrosVariables.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRubrosVariables.jComboBoxTiposAccionesFormularioRubrosVariables.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessRubrosVariables(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesRubrosVariablesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessRubrosVariables();
			
			if(this.jInternalFrameDetalleFormRubrosVariables==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<RubrosVariables> rubrosvariablessSeleccionados=new ArrayList<RubrosVariables>();		
			RubrosVariables rubrosvariables=new RubrosVariables();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingRubrosVariables(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesRubrosVariables.getSelectedItem();
			
			
			
			
			rubrosvariablessSeleccionados=this.getRubrosVariablessSeleccionados(true);
			//this.sTipoAccion;
			
			if(rubrosvariablessSeleccionados.size()==1) {
				for(RubrosVariables rubrosvariablesAux:rubrosvariablessSeleccionados) {
					rubrosvariables=rubrosvariablesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessRubrosVariables();
			
      		//this.finishProcessRubrosVariables(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarRubrosVariablesReturnGeneral() throws Exception {
		if(this.rubrosvariablesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.rubrosvariablesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.rubrosvariablesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.rubrosvariablesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.rubrosvariablesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.rubrosvariablesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingRubrosVariables(false);
		}
		
		if(this.rubrosvariablesReturnGeneral.getConRetornoLista() || this.rubrosvariablesReturnGeneral.getConRetornoObjeto()) {
			if(this.rubrosvariablesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.rubrosvariablesLogic.setRubrosVariabless(this.rubrosvariablesReturnGeneral.getRubrosVariabless());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingRubrosVariables(false);
		}
	}
	
	public void actualizarParametrosGeneralRubrosVariables() throws Exception {
		
		
	}
	
	public ArrayList<RubrosVariables> getRubrosVariablessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<RubrosVariables> rubrosvariablessSeleccionados=new ArrayList<RubrosVariables>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioRubrosVariables) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(RubrosVariables rubrosvariablesAux:rubrosvariablesLogic.getRubrosVariabless()) {
					if(rubrosvariablesAux.getIsSelected()) {
						rubrosvariablessSeleccionados.add(rubrosvariablesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RubrosVariables rubrosvariablesAux:this.rubrosvariabless) {
					if(rubrosvariablesAux.getIsSelected()) {
						rubrosvariablessSeleccionados.add(rubrosvariablesAux);				
					}
				}
			}
			
			if(rubrosvariablessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						rubrosvariablessSeleccionados.addAll(this.rubrosvariablesLogic.getRubrosVariabless());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						rubrosvariablessSeleccionados.addAll(this.rubrosvariabless);				
					}
				}
			}
		} else {
			rubrosvariablessSeleccionados.add(this.rubrosvariables);
		}
		
		return rubrosvariablessSeleccionados;
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
	
	public void generarReporteRubrosVariablessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalRubrosVariablessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoRubrosVariablessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRubrosVariablessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRubrosVariablessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Rubros Variables",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesRubrosVariablessSeleccionados() throws Exception {
		ArrayList<RubrosVariables> rubrosvariablessSeleccionados=new ArrayList<RubrosVariables>();		
		
		rubrosvariablessSeleccionados=this.getRubrosVariablessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteRubrosVariabless("Todos",rubrosvariablessSeleccionados);
		
	}	
	
	public void generarReporteNormalRubrosVariablessSeleccionados() throws Exception {
		ArrayList<RubrosVariables> rubrosvariablessSeleccionados=new ArrayList<RubrosVariables>();		
		
		rubrosvariablessSeleccionados=this.getRubrosVariablessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteRubrosVariabless("Todos",rubrosvariablessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionRubrosVariablessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<RubrosVariables> rubrosvariablessSeleccionados=new ArrayList<RubrosVariables>();
		
		rubrosvariablessSeleccionados=this.getRubrosVariablessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteRubrosVariabless("Todos",rubrosvariablessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoRubrosVariablessSeleccionados() throws Exception {
		ArrayList<RubrosVariables> rubrosvariablessSeleccionados=new ArrayList<RubrosVariables>();		
		
		
		this.abrirInicializarFrameReporteDinamicoRubrosVariables();
		
		
		rubrosvariablessSeleccionados=this.getRubrosVariablessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoRubrosVariables();
		
		
		//this.generarReporteRubrosVariabless("Todos",rubrosvariablessSeleccionados ,rubrosvariablesImplementable,rubrosvariablesImplementableHome);
	}
	
	public void mostrarImportacionRubrosVariabless() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionRubrosVariables();
		
		this.abrirFrameImportacionRubrosVariables();		
		
			
		//this.generarReporteRubrosVariabless("Todos",rubrosvariablessSeleccionados ,rubrosvariablesImplementable,rubrosvariablesImplementableHome);
	}
	
	public void importarRubrosVariabless() throws Exception {		
	
	}
	
	public void exportarRubrosVariablessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelRubrosVariablessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoRubrosVariablessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlRubrosVariablessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Rubros Variables",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoRubrosVariablessSeleccionados() throws Exception {
		ArrayList<RubrosVariables> rubrosvariablessSeleccionados=new ArrayList<RubrosVariables>();		
		
		rubrosvariablessSeleccionados=this.getRubrosVariablessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubrosvariables."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarRubrosVariables(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(RubrosVariables rubrosvariablesAux:rubrosvariablessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarRubrosVariables(rubrosvariablesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//rubrosvariablesAux.setsDetalleGeneralEntityReporte(rubrosvariablesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubros Variables",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarRubrosVariables(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=RubrosVariablesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubrosVariablesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubrosVariablesConstantesFunciones.LABEL_IDTIPOCONTRATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubrosVariablesConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubrosVariablesConstantesFunciones.LABEL_IDRUBROEMPLEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubrosVariablesConstantesFunciones.LABEL_FECHADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubrosVariablesConstantesFunciones.LABEL_FECHAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubrosVariablesConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubrosVariablesConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubrosVariablesConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubrosVariablesConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RubrosVariablesConstantesFunciones.LABEL_NOMBRERUBROEMPLEA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarRubrosVariables(RubrosVariables rubrosvariables,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=rubrosvariables.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=rubrosvariables.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubrosvariables.gettipocontrato_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubrosvariables.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubrosvariables.getrubroemplea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubrosvariables.getfecha_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubrosvariables.getfecha_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubrosvariables.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubrosvariables.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubrosvariables.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubrosvariables.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rubrosvariables.getnombre_rubro_emplea();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelRubrosVariablessSeleccionados() throws Exception {
		ArrayList<RubrosVariables> rubrosvariablessSeleccionados=new ArrayList<RubrosVariables>();		
		
		rubrosvariablessSeleccionados=this.getRubrosVariablessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubrosvariables.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("RubrosVariabless");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelRubrosVariables(row);				
				iRow++;
			}				
			
			for(RubrosVariables rubrosvariablesAux:rubrosvariablessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelRubrosVariables(rubrosvariablesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubros Variables",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlRubrosVariablessSeleccionados() throws Exception {
		ArrayList<RubrosVariables> rubrosvariablessSeleccionados=new ArrayList<RubrosVariables>();		
		
		rubrosvariablessSeleccionados=this.getRubrosVariablessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rubrosvariables.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("rubrosvariabless");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("rubrosvariables");
			//elementRoot.appendChild(element);
		
			for(RubrosVariables rubrosvariablesAux:rubrosvariablessSeleccionados) {
				element = document.createElement("rubrosvariables");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlRubrosVariables(rubrosvariablesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rubros Variables",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelRubrosVariables(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_IDTIPOCONTRATO);
		cell = row.createCell(iColumn++);cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_IDRUBROEMPLEA);
		cell = row.createCell(iColumn++);cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_FECHADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_FECHAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(RubrosVariablesConstantesFunciones.LABEL_NOMBRERUBROEMPLEA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelRubrosVariables(RubrosVariables rubrosvariables,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(rubrosvariables.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(rubrosvariables.gettipocontrato_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(rubrosvariables.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(rubrosvariables.getrubroemplea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(rubrosvariables.getfecha_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(rubrosvariables.getfecha_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(rubrosvariables.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(rubrosvariables.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(rubrosvariables.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(rubrosvariables.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(rubrosvariables.getnombre_rubro_emplea());				
	}
	
	public void setFilaDatosExportarXmlRubrosVariables(RubrosVariables rubrosvariables,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(RubrosVariablesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(rubrosvariables.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(RubrosVariablesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(rubrosvariables.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementtipocontrato_descripcion = document.createElement(RubrosVariablesConstantesFunciones.IDTIPOCONTRATO);
		elementtipocontrato_descripcion.appendChild(document.createTextNode(rubrosvariables.gettipocontrato_descripcion()));
		element.appendChild(elementtipocontrato_descripcion);

		Element elementempresa_descripcion = document.createElement(RubrosVariablesConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(rubrosvariables.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementrubroemplea_descripcion = document.createElement(RubrosVariablesConstantesFunciones.IDRUBROEMPLEA);
		elementrubroemplea_descripcion.appendChild(document.createTextNode(rubrosvariables.getrubroemplea_descripcion()));
		element.appendChild(elementrubroemplea_descripcion);

		Element elementfecha_desde = document.createElement(RubrosVariablesConstantesFunciones.FECHADESDE);
		elementfecha_desde.appendChild(document.createTextNode(rubrosvariables.getfecha_desde().toString().trim()));
		element.appendChild(elementfecha_desde);

		Element elementfecha_hasta = document.createElement(RubrosVariablesConstantesFunciones.FECHAHASTA);
		elementfecha_hasta.appendChild(document.createTextNode(rubrosvariables.getfecha_hasta().toString().trim()));
		element.appendChild(elementfecha_hasta);

		Element elementcodigo = document.createElement(RubrosVariablesConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(rubrosvariables.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(RubrosVariablesConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(rubrosvariables.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementfecha = document.createElement(RubrosVariablesConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(rubrosvariables.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementvalor = document.createElement(RubrosVariablesConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(rubrosvariables.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementnombre_rubro_emplea = document.createElement(RubrosVariablesConstantesFunciones.NOMBRERUBROEMPLEA);
		elementnombre_rubro_emplea.appendChild(document.createTextNode(rubrosvariables.getnombre_rubro_emplea().trim()));
		element.appendChild(elementnombre_rubro_emplea);
	}
	
	public void generarReporteGroupGenericoRubrosVariablessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<RubrosVariables> rubrosvariablessSeleccionados=new ArrayList<RubrosVariables>();
		
		rubrosvariablessSeleccionados=this.getRubrosVariablessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoRubrosVariables(rubrosvariablessSeleccionados);
		
		this.generarReporteRubrosVariabless("Todos",rubrosvariablessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoRubrosVariables(ArrayList<RubrosVariables> rubrosvariablessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(RubrosVariables rubrosvariablesAux:rubrosvariablessSeleccionados) {
				rubrosvariablesAux.setsDetalleGeneralEntityReporte(rubrosvariablesAux.toString());
			
				if(sTipoSeleccionar.equals(RubrosVariablesConstantesFunciones.LABEL_IDTIPOCONTRATO)) {
					existe=true;
					rubrosvariablesAux.setsDescripcionGeneralEntityReporte1(rubrosvariablesAux.gettipocontrato_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RubrosVariablesConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					rubrosvariablesAux.setsDescripcionGeneralEntityReporte1(rubrosvariablesAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RubrosVariablesConstantesFunciones.LABEL_IDRUBROEMPLEA)) {
					existe=true;
					rubrosvariablesAux.setsDescripcionGeneralEntityReporte1(rubrosvariablesAux.getrubroemplea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RubrosVariablesConstantesFunciones.LABEL_FECHADESDE)) {
					existe=true;
					rubrosvariablesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(rubrosvariablesAux.getfecha_desde()));
				}
				 else if(sTipoSeleccionar.equals(RubrosVariablesConstantesFunciones.LABEL_FECHAHASTA)) {
					existe=true;
					rubrosvariablesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(rubrosvariablesAux.getfecha_hasta()));
				}
				 else if(sTipoSeleccionar.equals(RubrosVariablesConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					rubrosvariablesAux.setsDescripcionGeneralEntityReporte1(rubrosvariablesAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(RubrosVariablesConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					rubrosvariablesAux.setsDescripcionGeneralEntityReporte1(rubrosvariablesAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(RubrosVariablesConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					rubrosvariablesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(rubrosvariablesAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(RubrosVariablesConstantesFunciones.LABEL_NOMBRERUBROEMPLEA)) {
					existe=true;
					rubrosvariablesAux.setsDescripcionGeneralEntityReporte1(rubrosvariablesAux.getnombre_rubro_emplea());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RubrosVariablesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesRubrosVariables(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoRubrosVariables=true;
				this.isVisibilidadCeldaNuevoRelacionesRubrosVariables=true;
				this.isVisibilidadCeldaGuardarCambiosRubrosVariables=true;
			}
			
			this.isVisibilidadCeldaModificarRubrosVariables=false;
			this.isVisibilidadCeldaActualizarRubrosVariables=false;
			this.isVisibilidadCeldaEliminarRubrosVariables=false;
			this.isVisibilidadCeldaCancelarRubrosVariables=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubrosVariables=true;
				} else {
					this.isVisibilidadCeldaGuardarRubrosVariables=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoRubrosVariables=false;
			this.isVisibilidadCeldaNuevoRelacionesRubrosVariables=false;
			this.isVisibilidadCeldaGuardarCambiosRubrosVariables=false;
			this.isVisibilidadCeldaModificarRubrosVariables=false;
			this.isVisibilidadCeldaActualizarRubrosVariables=true;
			this.isVisibilidadCeldaEliminarRubrosVariables=false;
			this.isVisibilidadCeldaCancelarRubrosVariables=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubrosVariables=true;
				} else {
					this.isVisibilidadCeldaGuardarRubrosVariables=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoRubrosVariables=false;
			this.isVisibilidadCeldaNuevoRelacionesRubrosVariables=false;
			this.isVisibilidadCeldaGuardarCambiosRubrosVariables=false;
			this.isVisibilidadCeldaModificarRubrosVariables=false;
			this.isVisibilidadCeldaActualizarRubrosVariables=true;
			this.isVisibilidadCeldaEliminarRubrosVariables=true;
			this.isVisibilidadCeldaCancelarRubrosVariables=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubrosVariables=true;
				} else {
					this.isVisibilidadCeldaGuardarRubrosVariables=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoRubrosVariables=false;
			this.isVisibilidadCeldaNuevoRelacionesRubrosVariables=false;
			this.isVisibilidadCeldaGuardarCambiosRubrosVariables=false;
			this.isVisibilidadCeldaModificarRubrosVariables=false;
			this.isVisibilidadCeldaActualizarRubrosVariables=true;
			this.isVisibilidadCeldaEliminarRubrosVariables=false;
			this.isVisibilidadCeldaCancelarRubrosVariables=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubrosVariables=false;
				} else {
					this.isVisibilidadCeldaGuardarRubrosVariables=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoRubrosVariables=true;
			this.isVisibilidadCeldaNuevoRelacionesRubrosVariables=true;
			this.isVisibilidadCeldaGuardarCambiosRubrosVariables=true;
			this.isVisibilidadCeldaModificarRubrosVariables=false;
			this.isVisibilidadCeldaActualizarRubrosVariables=false;
			this.isVisibilidadCeldaEliminarRubrosVariables=false;
			this.isVisibilidadCeldaCancelarRubrosVariables=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubrosVariables=true;
				} else {
					this.isVisibilidadCeldaGuardarRubrosVariables=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoRubrosVariables=false;
			this.isVisibilidadCeldaNuevoRelacionesRubrosVariables=false;
			this.isVisibilidadCeldaGuardarCambiosRubrosVariables=false;
			this.isVisibilidadCeldaActualizarRubrosVariables=false;
			this.isVisibilidadCeldaEliminarRubrosVariables=false;
			this.isVisibilidadCeldaCancelarRubrosVariables=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubrosVariables=false;
				} else {
					this.isVisibilidadCeldaGuardarRubrosVariables=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoRubrosVariables=false;
			this.isVisibilidadCeldaNuevoRelacionesRubrosVariables=false;
			this.isVisibilidadCeldaGuardarCambiosRubrosVariables=false;
			this.isVisibilidadCeldaModificarRubrosVariables=true;
			this.isVisibilidadCeldaActualizarRubrosVariables=false;
			this.isVisibilidadCeldaEliminarRubrosVariables=false;
			this.isVisibilidadCeldaCancelarRubrosVariables=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRubrosVariables=false;
				} else {
					this.isVisibilidadCeldaGuardarRubrosVariables=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(RubrosVariablesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoRubrosVariables=true;
			this.isVisibilidadCeldaNuevoRelacionesRubrosVariables=true;
			this.isVisibilidadCeldaGuardarCambiosRubrosVariables=true;
		} else {
			this.actualizarEstadoPanelsRubrosVariables(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarRubrosVariables=false;
			//this.isVisibilidadCeldaVerFormRubrosVariables=false;
			this.isVisibilidadCeldaDuplicarRubrosVariables=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!rubrosvariablesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesRubrosVariables=false;
		} else {
			this.isVisibilidadCeldaNuevoRubrosVariables=false;
			this.isVisibilidadCeldaGuardarCambiosRubrosVariables=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
			if(!rubrosvariablesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesRubrosVariables=false;												
			}
			
			this.jButtonCerrarRubrosVariables.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesRubrosVariables=false;
		}
		
		if(!this.permiteMantenimiento(this.rubrosvariables)) {
			this.isVisibilidadCeldaActualizarRubrosVariables=false;
			this.isVisibilidadCeldaEliminarRubrosVariables=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoRubrosVariables=false;
		this.isVisibilidadCeldaNuevoRelacionesRubrosVariables=false;
		this.isVisibilidadCeldaGuardarCambiosRubrosVariables=false;
		//this.isVisibilidadCeldaModificarRubrosVariables=true;
		this.isVisibilidadCeldaActualizarRubrosVariables=false;
		this.isVisibilidadCeldaEliminarRubrosVariables=false;
		//this.isVisibilidadCeldaCancelarRubrosVariables=true;			
		this.isVisibilidadCeldaGuardarRubrosVariables=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesRubrosVariables() {
	}
	
	public void actualizarEstadoPanelsRubrosVariables(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionRubrosVariables!=null) {
				this.jScrollPanelDatosEdicionRubrosVariables.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubrosVariables!=null) {
				this.jTabbedPaneBusquedasRubrosVariables.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRubrosVariables!=null) {
				this.jScrollPanelDatosRubrosVariables.setVisible(true);
			}
			
			if(this.jPanelPaginacionRubrosVariables!=null) {
				this.jPanelPaginacionRubrosVariables.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRubrosVariables!=null) {
				this.jPanelParametrosReportesRubrosVariables.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionRubrosVariables!=null) {
				this.jScrollPanelDatosEdicionRubrosVariables.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubrosVariables!=null) {
				this.jTabbedPaneBusquedasRubrosVariables.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosRubrosVariables!=null) {
				this.jScrollPanelDatosRubrosVariables.setVisible(false);
			}
			
			if(this.jPanelPaginacionRubrosVariables!=null) {
				this.jPanelPaginacionRubrosVariables.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRubrosVariables!=null) {
				this.jPanelParametrosReportesRubrosVariables.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionRubrosVariables!=null) {
				this.jScrollPanelDatosEdicionRubrosVariables.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubrosVariables!=null) {
				this.jTabbedPaneBusquedasRubrosVariables.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRubrosVariables!=null) {
				this.jScrollPanelDatosRubrosVariables.setVisible(false);
			}
			
			if(this.jPanelPaginacionRubrosVariables!=null) {
				this.jPanelPaginacionRubrosVariables.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRubrosVariables!=null) {
				this.jPanelParametrosReportesRubrosVariables.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionRubrosVariables!=null) {
				this.jScrollPanelDatosEdicionRubrosVariables.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubrosVariables!=null) {
				this.jTabbedPaneBusquedasRubrosVariables.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRubrosVariables!=null) {
				this.jScrollPanelDatosRubrosVariables.setVisible(false);
			}
			
			if(this.jPanelPaginacionRubrosVariables!=null) {
				this.jPanelPaginacionRubrosVariables.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRubrosVariables!=null) {
				this.jPanelParametrosReportesRubrosVariables.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionRubrosVariables!=null) {
				this.jScrollPanelDatosEdicionRubrosVariables.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubrosVariables!=null) {
				this.jTabbedPaneBusquedasRubrosVariables.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRubrosVariables!=null) {
				this.jScrollPanelDatosRubrosVariables.setVisible(true);
			}
			
			if(this.jPanelPaginacionRubrosVariables!=null) {
				this.jPanelPaginacionRubrosVariables.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRubrosVariables!=null) {
				this.jPanelParametrosReportesRubrosVariables.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionRubrosVariables!=null) {
				this.jScrollPanelDatosEdicionRubrosVariables.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubrosVariables!=null) {
				this.jTabbedPaneBusquedasRubrosVariables.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRubrosVariables!=null) {
				this.jScrollPanelDatosRubrosVariables.setVisible(true);
			}
			
			if(this.jPanelPaginacionRubrosVariables!=null) {
				this.jPanelPaginacionRubrosVariables.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRubrosVariables!=null) {
				this.jPanelParametrosReportesRubrosVariables.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionRubrosVariables!=null) {
				this.jScrollPanelDatosEdicionRubrosVariables.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubrosVariables!=null) {
				this.jTabbedPaneBusquedasRubrosVariables.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRubrosVariables!=null) {
				this.jScrollPanelDatosRubrosVariables.setVisible(true);
			}
			
			if(this.jPanelPaginacionRubrosVariables!=null) {
				this.jPanelPaginacionRubrosVariables.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRubrosVariables!=null) {
				this.jPanelParametrosReportesRubrosVariables.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasRubrosVariables!=null) {
					this.jTabbedPaneBusquedasRubrosVariables.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesRubrosVariables!=null) {
				this.jPanelParametrosReportesRubrosVariables.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.rubrosvariablesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRubrosVariables!=null) {
				this.jTabbedPaneBusquedasRubrosVariables.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesRubrosVariables!=null) {
				this.jPanelParametrosReportesRubrosVariables.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaTipoContrato(Boolean isParaTipoContrato){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoContratoNegation=!isParaTipoContrato;

			this.isVisibilidadBusquedaRubrosVariables=isParaTipoContrato;
			if(!this.isVisibilidadBusquedaRubrosVariables) {this.jTabbedPaneBusquedasRubrosVariables.remove(jPanelBusquedaRubrosVariablesRubrosVariables);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaRubrosVariables=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaRubrosVariables) {this.jTabbedPaneBusquedasRubrosVariables.remove(jPanelBusquedaRubrosVariablesRubrosVariables);}
		}
		
	}

	public void setVisibilidadBusquedasParaRubroEmplea(Boolean isParaRubroEmplea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaRubroEmpleaNegation=!isParaRubroEmplea;

			this.isVisibilidadBusquedaRubrosVariables=isParaRubroEmplea;
			if(!this.isVisibilidadBusquedaRubrosVariables) {this.jTabbedPaneBusquedasRubrosVariables.remove(jPanelBusquedaRubrosVariablesRubrosVariables);}
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
			
			this.inicializarActualizarBindingTablaRubrosVariables(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioRubrosVariables() {
		this.updateBorderResaltarBusquedasFormularioRubrosVariables();
		this.updateVisibilidadBusquedasFormularioRubrosVariables();
		this.updateHabilitarBusquedasFormularioRubrosVariables();
	}
	
	public void updateBorderResaltarBusquedasFormularioRubrosVariables() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasRubrosVariables.getComponents().length>0) {
	

		if(this.rubrosvariablesConstantesFunciones.resaltarBusquedaRubrosVariablesRubrosVariables!=null) {
			index= this.jTabbedPaneBusquedasRubrosVariables.indexOfComponent(this.jPanelBusquedaRubrosVariablesRubrosVariables);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRubrosVariables.getComponent(index);
				jPanel.setBorder(this.rubrosvariablesConstantesFunciones.resaltarBusquedaRubrosVariablesRubrosVariables);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioRubrosVariables() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasRubrosVariables.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRubrosVariables.indexOfComponent(this.jPanelBusquedaRubrosVariablesRubrosVariables);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRubrosVariables.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.rubrosvariablesConstantesFunciones.mostrarBusquedaRubrosVariablesRubrosVariables);
			if(!this.rubrosvariablesConstantesFunciones.mostrarBusquedaRubrosVariablesRubrosVariables && index>-1) {
				this.jTabbedPaneBusquedasRubrosVariables.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioRubrosVariables() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasRubrosVariables.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRubrosVariables.indexOfComponent(this.jPanelBusquedaRubrosVariablesRubrosVariables);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRubrosVariables.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.rubrosvariablesConstantesFunciones.activarBusquedaRubrosVariablesRubrosVariables);
				this.jTabbedPaneBusquedasRubrosVariables.setEnabledAt(index,this.rubrosvariablesConstantesFunciones.activarBusquedaRubrosVariablesRubrosVariables);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaRubrosVariables(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaRubrosVariables")) {
			index= this.jTabbedPaneBusquedasRubrosVariables.indexOfComponent(this.jPanelBusquedaRubrosVariablesRubrosVariables);

			this.jTabbedPaneBusquedasRubrosVariables.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRubrosVariables.getComponent(index);

			this.rubrosvariablesConstantesFunciones.setResaltarBusquedaRubrosVariablesRubrosVariables(resaltar);

			jPanel.setBorder(this.rubrosvariablesConstantesFunciones.resaltarBusquedaRubrosVariablesRubrosVariables);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarRubrosVariables.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioRubrosVariables() throws Exception {

		if(this.jInternalFrameDetalleFormRubrosVariables==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioRubrosVariables();
		this.updateVisibilidadResaltarControlesFormularioRubrosVariables();
		this.updateHabilitarResaltarControlesFormularioRubrosVariables();
		
	}
	
	public void updateBorderResaltarControlesFormularioRubrosVariables() throws Exception {
		if(this.jInternalFrameDetalleFormRubrosVariables==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.rubrosvariablesConstantesFunciones.resaltaridRubrosVariables!=null && this.jInternalFrameDetalleFormRubrosVariables!=null) {this.jInternalFrameDetalleFormRubrosVariables.jLabelidRubrosVariables.setBorder(this.rubrosvariablesConstantesFunciones.resaltaridRubrosVariables);}
		if(this.rubrosvariablesConstantesFunciones.resaltarid_tipo_contratoRubrosVariables!=null && this.jInternalFrameDetalleFormRubrosVariables!=null) {this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_tipo_contratoRubrosVariables.setBorder(this.rubrosvariablesConstantesFunciones.resaltarid_tipo_contratoRubrosVariables);}
		if(this.rubrosvariablesConstantesFunciones.resaltarid_empresaRubrosVariables!=null && this.jInternalFrameDetalleFormRubrosVariables!=null) {this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_empresaRubrosVariables.setBorder(this.rubrosvariablesConstantesFunciones.resaltarid_empresaRubrosVariables);}
		if(this.rubrosvariablesConstantesFunciones.resaltarid_rubro_empleaRubrosVariables!=null && this.jInternalFrameDetalleFormRubrosVariables!=null) {this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_rubro_empleaRubrosVariables.setBorder(this.rubrosvariablesConstantesFunciones.resaltarid_rubro_empleaRubrosVariables);}
		if(this.rubrosvariablesConstantesFunciones.resaltarfecha_desdeRubrosVariables!=null && this.jInternalFrameDetalleFormRubrosVariables!=null) {this.jInternalFrameDetalleFormRubrosVariables.jDateChooserfecha_desdeRubrosVariables.setBorder(this.rubrosvariablesConstantesFunciones.resaltarfecha_desdeRubrosVariables);}
		if(this.rubrosvariablesConstantesFunciones.resaltarfecha_hastaRubrosVariables!=null && this.jInternalFrameDetalleFormRubrosVariables!=null) {this.jInternalFrameDetalleFormRubrosVariables.jDateChooserfecha_hastaRubrosVariables.setBorder(this.rubrosvariablesConstantesFunciones.resaltarfecha_hastaRubrosVariables);}
		if(this.rubrosvariablesConstantesFunciones.resaltarcodigoRubrosVariables!=null && this.jInternalFrameDetalleFormRubrosVariables!=null) {this.jInternalFrameDetalleFormRubrosVariables.jTextFieldcodigoRubrosVariables.setBorder(this.rubrosvariablesConstantesFunciones.resaltarcodigoRubrosVariables);}
		if(this.rubrosvariablesConstantesFunciones.resaltarnombreRubrosVariables!=null && this.jInternalFrameDetalleFormRubrosVariables!=null) {this.jInternalFrameDetalleFormRubrosVariables.jTextAreanombreRubrosVariables.setBorder(this.rubrosvariablesConstantesFunciones.resaltarnombreRubrosVariables);}
		if(this.rubrosvariablesConstantesFunciones.resaltarfechaRubrosVariables!=null && this.jInternalFrameDetalleFormRubrosVariables!=null) {this.jInternalFrameDetalleFormRubrosVariables.jDateChooserfechaRubrosVariables.setBorder(this.rubrosvariablesConstantesFunciones.resaltarfechaRubrosVariables);}
		if(this.rubrosvariablesConstantesFunciones.resaltarvalorRubrosVariables!=null && this.jInternalFrameDetalleFormRubrosVariables!=null) {this.jInternalFrameDetalleFormRubrosVariables.jTextFieldvalorRubrosVariables.setBorder(this.rubrosvariablesConstantesFunciones.resaltarvalorRubrosVariables);}
		if(this.rubrosvariablesConstantesFunciones.resaltarnombre_rubro_empleaRubrosVariables!=null && this.jInternalFrameDetalleFormRubrosVariables!=null) {this.jInternalFrameDetalleFormRubrosVariables.jTextAreanombre_rubro_empleaRubrosVariables.setBorder(this.rubrosvariablesConstantesFunciones.resaltarnombre_rubro_empleaRubrosVariables);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioRubrosVariables() throws Exception {		
		if(this.jInternalFrameDetalleFormRubrosVariables==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
	
		//this.jInternalFrameDetalleFormRubrosVariables.jLabelidRubrosVariables.setVisible(this.rubrosvariablesConstantesFunciones.mostraridRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jPanelidRubrosVariables.setVisible(this.rubrosvariablesConstantesFunciones.mostraridRubrosVariables);
		//this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_tipo_contratoRubrosVariables.setVisible(this.rubrosvariablesConstantesFunciones.mostrarid_tipo_contratoRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jPanelid_tipo_contratoRubrosVariables.setVisible(this.rubrosvariablesConstantesFunciones.mostrarid_tipo_contratoRubrosVariables);
		//this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_empresaRubrosVariables.setVisible(this.rubrosvariablesConstantesFunciones.mostrarid_empresaRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jPanelid_empresaRubrosVariables.setVisible(this.rubrosvariablesConstantesFunciones.mostrarid_empresaRubrosVariables);
		//this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_rubro_empleaRubrosVariables.setVisible(this.rubrosvariablesConstantesFunciones.mostrarid_rubro_empleaRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jPanelid_rubro_empleaRubrosVariables.setVisible(this.rubrosvariablesConstantesFunciones.mostrarid_rubro_empleaRubrosVariables);
		//this.jInternalFrameDetalleFormRubrosVariables.jDateChooserfecha_desdeRubrosVariables.setVisible(this.rubrosvariablesConstantesFunciones.mostrarfecha_desdeRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jPanelfecha_desdeRubrosVariables.setVisible(this.rubrosvariablesConstantesFunciones.mostrarfecha_desdeRubrosVariables);
		//this.jInternalFrameDetalleFormRubrosVariables.jDateChooserfecha_hastaRubrosVariables.setVisible(this.rubrosvariablesConstantesFunciones.mostrarfecha_hastaRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jPanelfecha_hastaRubrosVariables.setVisible(this.rubrosvariablesConstantesFunciones.mostrarfecha_hastaRubrosVariables);
		//this.jInternalFrameDetalleFormRubrosVariables.jTextFieldcodigoRubrosVariables.setVisible(this.rubrosvariablesConstantesFunciones.mostrarcodigoRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jPanelcodigoRubrosVariables.setVisible(this.rubrosvariablesConstantesFunciones.mostrarcodigoRubrosVariables);
		//this.jInternalFrameDetalleFormRubrosVariables.jTextAreanombreRubrosVariables.setVisible(this.rubrosvariablesConstantesFunciones.mostrarnombreRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jPanelnombreRubrosVariables.setVisible(this.rubrosvariablesConstantesFunciones.mostrarnombreRubrosVariables);
		//this.jInternalFrameDetalleFormRubrosVariables.jDateChooserfechaRubrosVariables.setVisible(this.rubrosvariablesConstantesFunciones.mostrarfechaRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jPanelfechaRubrosVariables.setVisible(this.rubrosvariablesConstantesFunciones.mostrarfechaRubrosVariables);
		//this.jInternalFrameDetalleFormRubrosVariables.jTextFieldvalorRubrosVariables.setVisible(this.rubrosvariablesConstantesFunciones.mostrarvalorRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jPanelvalorRubrosVariables.setVisible(this.rubrosvariablesConstantesFunciones.mostrarvalorRubrosVariables);
		//this.jInternalFrameDetalleFormRubrosVariables.jTextAreanombre_rubro_empleaRubrosVariables.setVisible(this.rubrosvariablesConstantesFunciones.mostrarnombre_rubro_empleaRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jPanelnombre_rubro_empleaRubrosVariables.setVisible(this.rubrosvariablesConstantesFunciones.mostrarnombre_rubro_empleaRubrosVariables);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioRubrosVariables() throws Exception {
		if(this.jInternalFrameDetalleFormRubrosVariables==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRubrosVariables!=null) {
	
		this.jInternalFrameDetalleFormRubrosVariables.jLabelidRubrosVariables.setEnabled(this.rubrosvariablesConstantesFunciones.activaridRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_tipo_contratoRubrosVariables.setEnabled(this.rubrosvariablesConstantesFunciones.activarid_tipo_contratoRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_empresaRubrosVariables.setEnabled(this.rubrosvariablesConstantesFunciones.activarid_empresaRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jComboBoxid_rubro_empleaRubrosVariables.setEnabled(this.rubrosvariablesConstantesFunciones.activarid_rubro_empleaRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jDateChooserfecha_desdeRubrosVariables.setEnabled(this.rubrosvariablesConstantesFunciones.activarfecha_desdeRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jDateChooserfecha_hastaRubrosVariables.setEnabled(this.rubrosvariablesConstantesFunciones.activarfecha_hastaRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jTextFieldcodigoRubrosVariables.setEnabled(this.rubrosvariablesConstantesFunciones.activarcodigoRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jTextAreanombreRubrosVariables.setEnabled(this.rubrosvariablesConstantesFunciones.activarnombreRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jDateChooserfechaRubrosVariables.setEnabled(this.rubrosvariablesConstantesFunciones.activarfechaRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jTextFieldvalorRubrosVariables.setEnabled(this.rubrosvariablesConstantesFunciones.activarvalorRubrosVariables);
		this.jInternalFrameDetalleFormRubrosVariables.jTextAreanombre_rubro_empleaRubrosVariables.setEnabled(this.rubrosvariablesConstantesFunciones.activarnombre_rubro_empleaRubrosVariables);
		}
	}
	
		
}