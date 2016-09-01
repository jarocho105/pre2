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

import com.bydan.erp.nomina.util.AsistenciaPorCentroCostoConstantesFunciones;
import com.bydan.erp.nomina.util.AsistenciaPorCentroCostoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.AsistenciaPorCentroCostoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.AsistenciaPorCentroCostoBean;
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
public class AsistenciaPorCentroCostoBeanSwingJInternalFrame extends AsistenciaPorCentroCostoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(AsistenciaPorCentroCostoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<AsistenciaPorCentroCosto> asistenciaporcentrocostoValidator = new ClassValidator<AsistenciaPorCentroCosto>(AsistenciaPorCentroCosto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public AsistenciaPorCentroCosto asistenciaporcentrocosto;	
	public AsistenciaPorCentroCosto asistenciaporcentrocostoAux;
	public AsistenciaPorCentroCosto asistenciaporcentrocostoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public AsistenciaPorCentroCosto asistenciaporcentrocostoTotales;
	public Long idAsistenciaPorCentroCostoActual;
	public Long iIdNuevoAsistenciaPorCentroCosto=0L;
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

	public String sFinalQueryComboCentroCosto="";

	public List<CentroCosto> centrocostosForeignKey;

	public List<CentroCosto> getcentrocostosForeignKey() {
		return centrocostosForeignKey;
	}

	public void setcentrocostosForeignKey(List<CentroCosto> centrocostosForeignKey) {
		this.centrocostosForeignKey = centrocostosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CentroCosto centrocostoForeignKey;

	public CentroCosto getcentrocostoForeignKey() {
		return centrocostoForeignKey;
	}

	public void setcentrocostoForeignKey(CentroCosto centrocostoForeignKey) {
		this.centrocostoForeignKey = centrocostoForeignKey;
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
	
	public Boolean isPermisoTodoAsistenciaPorCentroCosto;
	public Boolean isPermisoNuevoAsistenciaPorCentroCosto;
	public Boolean isPermisoActualizarAsistenciaPorCentroCosto;
	public Boolean isPermisoActualizarOriginalAsistenciaPorCentroCosto;
	public Boolean isPermisoEliminarAsistenciaPorCentroCosto;
	public Boolean isPermisoGuardarCambiosAsistenciaPorCentroCosto;
	public Boolean isPermisoConsultaAsistenciaPorCentroCosto;
	public Boolean isPermisoBusquedaAsistenciaPorCentroCosto;
	public Boolean isPermisoReporteAsistenciaPorCentroCosto;
	public Boolean isPermisoPaginacionMedioAsistenciaPorCentroCosto;
	public Boolean isPermisoPaginacionAltoAsistenciaPorCentroCosto;
	public Boolean isPermisoPaginacionTodoAsistenciaPorCentroCosto;
	public Boolean isPermisoCopiarAsistenciaPorCentroCosto;
	public Boolean isPermisoVerFormAsistenciaPorCentroCosto;
	public Boolean isPermisoDuplicarAsistenciaPorCentroCosto;
	public Boolean isPermisoOrdenAsistenciaPorCentroCosto;
	
	
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
	
	public AsistenciaPorCentroCostoParameterReturnGeneral asistenciaporcentrocostoReturnGeneral;
	public AsistenciaPorCentroCostoParameterReturnGeneral asistenciaporcentrocostoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoAsistenciaPorCentroCosto=false;
	public Boolean esParaAccionDesdeFormularioAsistenciaPorCentroCosto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected AsistenciaPorCentroCostoSessionBeanAdditional asistenciaporcentrocostoSessionBeanAdditional=null;
	
	public AsistenciaPorCentroCostoSessionBeanAdditional getAsistenciaPorCentroCostoSessionBeanAdditional() {
		return this.asistenciaporcentrocostoSessionBeanAdditional;
	}
	
	public void setAsistenciaPorCentroCostoSessionBeanAdditional(AsistenciaPorCentroCostoSessionBeanAdditional asistenciaporcentrocostoSessionBeanAdditional) {
		try {
			this.asistenciaporcentrocostoSessionBeanAdditional=asistenciaporcentrocostoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional asistenciaporcentrocostoBeanSwingJInternalFrameAdditional=null;
	//public class AsistenciaPorCentroCostoBeanSwingJInternalFrame
	
	public AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional getAsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional() {
		return this.asistenciaporcentrocostoBeanSwingJInternalFrameAdditional;
	}
	
	public void setAsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional(AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional asistenciaporcentrocostoBeanSwingJInternalFrameAdditional) {
		try {
			this.asistenciaporcentrocostoBeanSwingJInternalFrameAdditional=asistenciaporcentrocostoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public AsistenciaPorCentroCostoLogic asistenciaporcentrocostoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public AsistenciaPorCentroCosto asistenciaporcentrocostoBean;
	public AsistenciaPorCentroCostoConstantesFunciones asistenciaporcentrocostoConstantesFunciones;
	//public AsistenciaPorCentroCostoParameterReturnGeneral asistenciaporcentrocostoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public CentroCostoLogic centrocostoLogic;
	public EmpleadoLogic empleadoLogic;
	
	//PARAMETROS
	
	
	//public List<AsistenciaPorCentroCosto> asistenciaporcentrocostos;	
	//public List<AsistenciaPorCentroCosto> asistenciaporcentrocostosEliminados;
	//public List<AsistenciaPorCentroCosto> asistenciaporcentrocostosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoAsistenciaPorCentroCosto=false;
	public Boolean isVisibilidadCeldaDuplicarAsistenciaPorCentroCosto=true;
	public Boolean isVisibilidadCeldaCopiarAsistenciaPorCentroCosto=true;
	public Boolean isVisibilidadCeldaVerFormAsistenciaPorCentroCosto=true;
	public Boolean isVisibilidadCeldaOrdenAsistenciaPorCentroCosto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto=false;
	public Boolean isVisibilidadCeldaModificarAsistenciaPorCentroCosto=false;
	public Boolean isVisibilidadCeldaActualizarAsistenciaPorCentroCosto=false;
	public Boolean isVisibilidadCeldaEliminarAsistenciaPorCentroCosto=false;
	public Boolean isVisibilidadCeldaCancelarAsistenciaPorCentroCosto=false;
	public Boolean isVisibilidadCeldaGuardarAsistenciaPorCentroCosto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosAsistenciaPorCentroCosto=false;	
	
	
	public Boolean isVisibilidadFK_IdCentroCosto=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoAsistenciaPorCentroCosto() {
		return this.iIdNuevoAsistenciaPorCentroCosto;
	}

	public void setiIdNuevoAsistenciaPorCentroCosto(Long iIdNuevoAsistenciaPorCentroCosto) {
		this.iIdNuevoAsistenciaPorCentroCosto = iIdNuevoAsistenciaPorCentroCosto;
	}
	
	public Long getidAsistenciaPorCentroCostoActual() {
		return this.idAsistenciaPorCentroCostoActual;
	}

	public void setidAsistenciaPorCentroCostoActual(Long idAsistenciaPorCentroCostoActual) {
		this.idAsistenciaPorCentroCostoActual = idAsistenciaPorCentroCostoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public AsistenciaPorCentroCosto getasistenciaporcentrocosto() {
		return this.asistenciaporcentrocosto;
	}

	public void setasistenciaporcentrocosto(AsistenciaPorCentroCosto asistenciaporcentrocosto) {
		this.asistenciaporcentrocosto = asistenciaporcentrocosto;
	}
	
	public AsistenciaPorCentroCosto getasistenciaporcentrocostoAux() {
		return this.asistenciaporcentrocostoAux;
	}

	public void setasistenciaporcentrocostoAux(AsistenciaPorCentroCosto asistenciaporcentrocostoAux) {
		this.asistenciaporcentrocostoAux = asistenciaporcentrocostoAux;
	}				
	
	public AsistenciaPorCentroCosto getasistenciaporcentrocostoAnterior() {
		return this.asistenciaporcentrocostoAnterior;
	}

	public void setasistenciaporcentrocostoAnterior(AsistenciaPorCentroCosto asistenciaporcentrocostoAnterior) {
		this.asistenciaporcentrocostoAnterior = asistenciaporcentrocostoAnterior;
	}	
	
	public AsistenciaPorCentroCosto getasistenciaporcentrocostoTotales() {
		return this.asistenciaporcentrocostoTotales;
	}

	public void setasistenciaporcentrocostoTotales(AsistenciaPorCentroCosto asistenciaporcentrocostoTotales) {
		this.asistenciaporcentrocostoTotales = asistenciaporcentrocostoTotales;
	}	
	
	public AsistenciaPorCentroCosto getasistenciaporcentrocostoBean() {
		return this.asistenciaporcentrocostoBean;
	}

	public void setasistenciaporcentrocostoBean(AsistenciaPorCentroCosto asistenciaporcentrocostoBean) {
		this.asistenciaporcentrocostoBean = asistenciaporcentrocostoBean;
	}	
	
	public AsistenciaPorCentroCostoParameterReturnGeneral getasistenciaporcentrocostoReturnGeneral() {
		return this.asistenciaporcentrocostoReturnGeneral;
	}

	public void setasistenciaporcentrocostoReturnGeneral(AsistenciaPorCentroCostoParameterReturnGeneral asistenciaporcentrocostoReturnGeneral) {
		this.asistenciaporcentrocostoReturnGeneral = asistenciaporcentrocostoReturnGeneral;
	}	
	
	
	public Long id_centro_costoFK_IdCentroCosto=null;

	public Long getid_centro_costoFK_IdCentroCosto() {
		return this.id_centro_costoFK_IdCentroCosto;
	}

	public void setid_centro_costoFK_IdCentroCosto(Long id_centro_costoFK_IdCentroCosto) {
		this.id_centro_costoFK_IdCentroCosto = id_centro_costoFK_IdCentroCosto;
	}

	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public AsistenciaPorCentroCostoLogic getAsistenciaPorCentroCostoLogic()	{		
		return asistenciaporcentrocostoLogic;
	}

	public void setAsistenciaPorCentroCostoLogic(AsistenciaPorCentroCostoLogic asistenciaporcentrocostoLogic) {
		this.asistenciaporcentrocostoLogic = asistenciaporcentrocostoLogic;
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
	
	public Boolean getIsEsNuevoAsistenciaPorCentroCosto() {
		return isEsNuevoAsistenciaPorCentroCosto;
	}

	public void setIsEsNuevoAsistenciaPorCentroCosto(Boolean isEsNuevoAsistenciaPorCentroCosto) {
		this.isEsNuevoAsistenciaPorCentroCosto = isEsNuevoAsistenciaPorCentroCosto;
	}

	public Boolean getEsParaAccionDesdeFormularioAsistenciaPorCentroCosto() {
		return esParaAccionDesdeFormularioAsistenciaPorCentroCosto;
	}
	
	public void setEsParaAccionDesdeFormularioAsistenciaPorCentroCosto(Boolean esParaAccionDesdeFormularioAsistenciaPorCentroCosto) {
		this.esParaAccionDesdeFormularioAsistenciaPorCentroCosto = esParaAccionDesdeFormularioAsistenciaPorCentroCosto;
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

			if(this.asistenciaporcentrocostoSessionBean==null) {
				this.asistenciaporcentrocostoSessionBean=new AsistenciaPorCentroCostoSessionBean();
			}

			if(!this.asistenciaporcentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(asistenciaporcentrocostoSessionBean.getlidEmpresaActual());
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

	public void cargarCombosCentroCostosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.centrocostosForeignKey=new ArrayList<CentroCosto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CentroCostoLogic centrocostoLogic=new CentroCostoLogic();

			//centrocostoLogic.getCentroCostoDataAccess().setIsForForeingKeyData(true);

			if(this.asistenciaporcentrocostoSessionBean==null) {
				this.asistenciaporcentrocostoSessionBean=new AsistenciaPorCentroCostoSessionBean();
			}

			if(!this.asistenciaporcentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//centrocostoLogic.getCentroCostoDataAccess().setIsForForeingKeyData(true);

					centrocostoLogic.getTodosCentroCostosWithConnection(sFinalQuery,new Pagination());

					this.centrocostosForeignKey=centrocostoLogic.getCentroCostos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCentroCosto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoLogic.getEntityWithConnection(asistenciaporcentrocostoSessionBean.getlidCentroCostoActual());
					this.centrocostosForeignKey.add(centrocostoLogic.getCentroCosto());
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

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.asistenciaporcentrocostoSessionBean==null) {
				this.asistenciaporcentrocostoSessionBean=new AsistenciaPorCentroCostoSessionBean();
			}

			if(!this.asistenciaporcentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

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
					empleadoLogic.getEntityWithConnection(asistenciaporcentrocostoSessionBean.getlidEmpleadoActual());
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

					if(this.asistenciaporcentrocosto!=null) {
						this.asistenciaporcentrocosto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
						this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empresaAsistenciaPorCentroCosto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaAsistenciaPorCentroCosto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
						if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empresaAsistenciaPorCentroCosto.getItemCount()>0) {
							this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empresaAsistenciaPorCentroCosto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaAsistenciaPorCentroCostoGenerico)throws Exception
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
				jComboBoxid_empresaAsistenciaPorCentroCostoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaAsistenciaPorCentroCostoGenerico!=null && jComboBoxid_empresaAsistenciaPorCentroCostoGenerico.getItemCount()>0) {
					jComboBoxid_empresaAsistenciaPorCentroCostoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCentroCostoForeignKey(Long idCentroCostoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(centrocostoTemp!=null) {

					if(this.asistenciaporcentrocosto!=null) {
						this.asistenciaporcentrocosto.setCentroCosto(centrocostoTemp);
					}

					if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
						this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_centro_costoAsistenciaPorCentroCosto.setSelectedItem(centrocostoTemp);
					}
				} else {
					//jComboBoxid_centro_costoAsistenciaPorCentroCosto.setSelectedItem(centrocostoTemp);
					if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
						if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_centro_costoAsistenciaPorCentroCosto.getItemCount()>0) {
							this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_centro_costoAsistenciaPorCentroCosto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCentroCosto") || sFormularioTipoBusqueda.equals("Todos")){
					if(centrocostoTemp!=null && jComboBoxid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto!=null) {
						jComboBoxid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto.setSelectedItem(centrocostoTemp);
					} else {
						if(jComboBoxid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto!=null) {
							//jComboBoxid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto.setSelectedItem(centrocostoTemp);
							if(jComboBoxid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto.getItemCount()>0) {
								jComboBoxid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto.setSelectedIndex(0);
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

	public String getActualCentroCostoForeignKeyDescripcion(Long idCentroCostoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}


			sDescripcion=CentroCostoConstantesFunciones.getCentroCostoDescripcion(centrocostoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCentroCostoForeignKeyGenerico(Long idCentroCostoSeleccionado,JComboBox jComboBoxid_centro_costoAsistenciaPorCentroCostoGenerico)throws Exception
	{
		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}

			if(centrocostoTemp!=null) {
				jComboBoxid_centro_costoAsistenciaPorCentroCostoGenerico.setSelectedItem(centrocostoTemp);
			} else {
				if(jComboBoxid_centro_costoAsistenciaPorCentroCostoGenerico!=null && jComboBoxid_centro_costoAsistenciaPorCentroCostoGenerico.getItemCount()>0) {
					jComboBoxid_centro_costoAsistenciaPorCentroCostoGenerico.setSelectedIndex(0);
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

					if(this.asistenciaporcentrocosto!=null) {
						this.asistenciaporcentrocosto.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
						this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empleadoAsistenciaPorCentroCosto.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoAsistenciaPorCentroCosto.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
						if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empleadoAsistenciaPorCentroCosto.getItemCount()>0) {
							this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empleadoAsistenciaPorCentroCosto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoAsistenciaPorCentroCostoGenerico)throws Exception
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
				jComboBoxid_empleadoAsistenciaPorCentroCostoGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoAsistenciaPorCentroCostoGenerico!=null && jComboBoxid_empleadoAsistenciaPorCentroCostoGenerico.getItemCount()>0) {
					jComboBoxid_empleadoAsistenciaPorCentroCostoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(AsistenciaPorCentroCosto asistenciaporcentrocosto,JComboBox jComboBoxid_empresaAsistenciaPorCentroCostoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaAsistenciaPorCentroCostoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empresaAsistenciaPorCentroCosto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaAsistenciaPorCentroCostoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				asistenciaporcentrocosto.setid_empresa(empresaAux.getId());
				asistenciaporcentrocosto.setempresa_descripcion(AsistenciaPorCentroCostoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				asistenciaporcentrocosto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCentroCostoForeignKey(AsistenciaPorCentroCosto asistenciaporcentrocosto,JComboBox jComboBoxid_centro_costoAsistenciaPorCentroCostoGenerico)throws Exception
	{
		try
		{
			CentroCosto  centrocostoAux=new CentroCosto();

			if(jComboBoxid_centro_costoAsistenciaPorCentroCostoGenerico==null) {
				centrocostoAux=(CentroCosto)this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_centro_costoAsistenciaPorCentroCosto.getSelectedItem();
			} else {
				centrocostoAux=(CentroCosto)jComboBoxid_centro_costoAsistenciaPorCentroCostoGenerico.getSelectedItem();
			}

			if(centrocostoAux!=null) {
				asistenciaporcentrocosto.setid_centro_costo(centrocostoAux.getId());
				asistenciaporcentrocosto.setcentrocosto_descripcion(AsistenciaPorCentroCostoConstantesFunciones.getCentroCostoDescripcion(centrocostoAux));
				asistenciaporcentrocosto.setCentroCosto(centrocostoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(AsistenciaPorCentroCosto asistenciaporcentrocosto,JComboBox jComboBoxid_empleadoAsistenciaPorCentroCostoGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoAsistenciaPorCentroCostoGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empleadoAsistenciaPorCentroCosto.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoAsistenciaPorCentroCostoGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				asistenciaporcentrocosto.setid_empleado(empleadoAux.getId());
				asistenciaporcentrocosto.setempleado_descripcion(AsistenciaPorCentroCostoConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				asistenciaporcentrocosto.setEmpleado(empleadoAux);			}
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

					if(!AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { 
							this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empresaAsistenciaPorCentroCosto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empresaAsistenciaPorCentroCosto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { 
					}

					if(!AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCentroCostosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCentroCosto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { 
							this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_centro_costoAsistenciaPorCentroCosto.removeAllItems();

							for(CentroCosto centrocosto:this.centrocostosForeignKey) {
								this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_centro_costoAsistenciaPorCentroCosto.addItem(centrocosto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { 
					}

					if(!AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCentroCosto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto.removeAllItems();

							for(CentroCosto centrocosto:this.centrocostosForeignKey) {
								this.jComboBoxid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto.addItem(centrocosto);
							}
						}

						if(!AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { 
							this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empleadoAsistenciaPorCentroCosto.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empleadoAsistenciaPorCentroCosto.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { 
					}

					if(!AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto.addItem(empleado);
							}
						}

						if(!AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
							this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empresaAsistenciaPorCentroCosto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
							this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empresaAsistenciaPorCentroCosto.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCentroCostoForeignKey(CentroCosto centrocosto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
							this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_centro_costoAsistenciaPorCentroCosto.setSelectedItem(centrocosto);
						}
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
							this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_centro_costoAsistenciaPorCentroCosto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto.setSelectedItem(centrocosto);
						} else {
							this.jComboBoxid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
							this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empleadoAsistenciaPorCentroCosto.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
							this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empleadoAsistenciaPorCentroCosto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesAsistenciaPorCentroCosto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			AsistenciaPorCentroCostoConstantesFunciones.refrescarForeignKeysDescripcionesAsistenciaPorCentroCosto(this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			AsistenciaPorCentroCostoConstantesFunciones.refrescarForeignKeysDescripcionesAsistenciaPorCentroCosto(this.asistenciaporcentrocostos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(CentroCosto.class));
		classes.add(new Classe(Empleado.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//asistenciaporcentrocostoLogic.setAsistenciaPorCentroCostos(this.asistenciaporcentrocostos);
			asistenciaporcentrocostoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public AsistenciaPorCentroCostoParameterReturnGeneral getAsistenciaPorCentroCostoParameterGeneral() {
		return this.asistenciaporcentrocostoParameterGeneral;
	}
	
	public void setAsistenciaPorCentroCostoParameterGeneral(AsistenciaPorCentroCostoParameterReturnGeneral asistenciaporcentrocostoParameterGeneral) {
		this.asistenciaporcentrocostoParameterGeneral = asistenciaporcentrocostoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoAsistenciaPorCentroCosto() {
		return isPermisoTodoAsistenciaPorCentroCosto;
	}

	public void setIsPermisoTodoAsistenciaPorCentroCosto(Boolean isPermisoTodoAsistenciaPorCentroCosto) {
		this.isPermisoTodoAsistenciaPorCentroCosto = isPermisoTodoAsistenciaPorCentroCosto;
	}

	public Boolean getIsPermisoNuevoAsistenciaPorCentroCosto() {
		return isPermisoNuevoAsistenciaPorCentroCosto;
	}

	public void setIsPermisoNuevoAsistenciaPorCentroCosto(Boolean isPermisoNuevoAsistenciaPorCentroCosto) {
		this.isPermisoNuevoAsistenciaPorCentroCosto = isPermisoNuevoAsistenciaPorCentroCosto;
	}

	public Boolean getIsPermisoActualizarAsistenciaPorCentroCosto() {
		return isPermisoActualizarAsistenciaPorCentroCosto;
	}

	public void setIsPermisoActualizarAsistenciaPorCentroCosto(Boolean isPermisoActualizarAsistenciaPorCentroCosto) {
		this.isPermisoActualizarAsistenciaPorCentroCosto = isPermisoActualizarAsistenciaPorCentroCosto;
	}

	public Boolean getIsPermisoEliminarAsistenciaPorCentroCosto() {
		return isPermisoEliminarAsistenciaPorCentroCosto;
	}

	public void setIsPermisoEliminarAsistenciaPorCentroCosto(Boolean isPermisoEliminarAsistenciaPorCentroCosto) {
		this.isPermisoEliminarAsistenciaPorCentroCosto = isPermisoEliminarAsistenciaPorCentroCosto;
	}

	public Boolean getIsPermisoGuardarCambiosAsistenciaPorCentroCosto() {
		return isPermisoGuardarCambiosAsistenciaPorCentroCosto;
	}

	public void setIsPermisoGuardarCambiosAsistenciaPorCentroCosto(Boolean isPermisoGuardarCambiosAsistenciaPorCentroCosto) {
		this.isPermisoGuardarCambiosAsistenciaPorCentroCosto = isPermisoGuardarCambiosAsistenciaPorCentroCosto;
	}
	
	public Boolean getIsPermisoConsultaAsistenciaPorCentroCosto() {
		return isPermisoConsultaAsistenciaPorCentroCosto;
	}

	public void setIsPermisoConsultaAsistenciaPorCentroCosto(Boolean isPermisoConsultaAsistenciaPorCentroCosto) {
		this.isPermisoConsultaAsistenciaPorCentroCosto = isPermisoConsultaAsistenciaPorCentroCosto;
	}

	public Boolean getIsPermisoBusquedaAsistenciaPorCentroCosto() {
		return isPermisoBusquedaAsistenciaPorCentroCosto;
	}

	public void setIsPermisoBusquedaAsistenciaPorCentroCosto(Boolean isPermisoBusquedaAsistenciaPorCentroCosto) {
		this.isPermisoBusquedaAsistenciaPorCentroCosto = isPermisoBusquedaAsistenciaPorCentroCosto;
	}

	public Boolean getIsPermisoReporteAsistenciaPorCentroCosto() {
		return isPermisoReporteAsistenciaPorCentroCosto;
	}

	public void setIsPermisoReporteAsistenciaPorCentroCosto(Boolean isPermisoReporteAsistenciaPorCentroCosto) {
		this.isPermisoReporteAsistenciaPorCentroCosto = isPermisoReporteAsistenciaPorCentroCosto;
	}
	
	public Boolean getIsPermisoPaginacionMedioAsistenciaPorCentroCosto() {
		return isPermisoPaginacionMedioAsistenciaPorCentroCosto;
	}

	public void setIsPermisoPaginacionMedioAsistenciaPorCentroCosto(Boolean isPermisoPaginacionMedioAsistenciaPorCentroCosto) {
		this.isPermisoPaginacionMedioAsistenciaPorCentroCosto = isPermisoPaginacionMedioAsistenciaPorCentroCosto;
	}
	
	public Boolean getIsPermisoPaginacionTodoAsistenciaPorCentroCosto() {
		return isPermisoPaginacionTodoAsistenciaPorCentroCosto;
	}

	public void setIsPermisoPaginacionTodoAsistenciaPorCentroCosto(Boolean isPermisoPaginacionTodoAsistenciaPorCentroCosto) {
		this.isPermisoPaginacionTodoAsistenciaPorCentroCosto = isPermisoPaginacionTodoAsistenciaPorCentroCosto;
	}
	
	public Boolean getIsPermisoPaginacionAltoAsistenciaPorCentroCosto() {
		return isPermisoPaginacionAltoAsistenciaPorCentroCosto;
	}

	public void setIsPermisoPaginacionAltoAsistenciaPorCentroCosto(Boolean isPermisoPaginacionAltoAsistenciaPorCentroCosto) {
		this.isPermisoPaginacionAltoAsistenciaPorCentroCosto = isPermisoPaginacionAltoAsistenciaPorCentroCosto;
	}
	
	public Boolean getIsPermisoCopiarAsistenciaPorCentroCosto() {
		return isPermisoCopiarAsistenciaPorCentroCosto;
	}

	public void setIsPermisoCopiarAsistenciaPorCentroCosto(Boolean isPermisoCopiarAsistenciaPorCentroCosto) {
		this.isPermisoCopiarAsistenciaPorCentroCosto = isPermisoCopiarAsistenciaPorCentroCosto;
	}
	
	public Boolean getIsPermisoVerFormAsistenciaPorCentroCosto() {
		return isPermisoVerFormAsistenciaPorCentroCosto;
	}

	public void setIsPermisoVerFormAsistenciaPorCentroCosto(Boolean isPermisoVerFormAsistenciaPorCentroCosto) {
		this.isPermisoVerFormAsistenciaPorCentroCosto = isPermisoVerFormAsistenciaPorCentroCosto;
	}
	
	public Boolean getIsPermisoDuplicarAsistenciaPorCentroCosto() {
		return isPermisoDuplicarAsistenciaPorCentroCosto;
	}

	public void setIsPermisoDuplicarAsistenciaPorCentroCosto(Boolean isPermisoDuplicarAsistenciaPorCentroCosto) {
		this.isPermisoDuplicarAsistenciaPorCentroCosto = isPermisoDuplicarAsistenciaPorCentroCosto;
	}
	
	public Boolean getIsPermisoOrdenAsistenciaPorCentroCosto() {
		return isPermisoOrdenAsistenciaPorCentroCosto;
	}

	public void setIsPermisoOrdenAsistenciaPorCentroCosto(Boolean isPermisoOrdenAsistenciaPorCentroCosto) {
		this.isPermisoOrdenAsistenciaPorCentroCosto = isPermisoOrdenAsistenciaPorCentroCosto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoAsistenciaPorCentroCosto() {
		return isVisibilidadCeldaNuevoAsistenciaPorCentroCosto;
	}

	public void setIsVisibilidadCeldaNuevoAsistenciaPorCentroCosto(Boolean isVisibilidadCeldaNuevoAsistenciaPorCentroCosto) {
		this.isVisibilidadCeldaNuevoAsistenciaPorCentroCosto = isVisibilidadCeldaNuevoAsistenciaPorCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarAsistenciaPorCentroCosto() {
		return isVisibilidadCeldaDuplicarAsistenciaPorCentroCosto;
	}

	public void setIsVisibilidadCeldaDuplicarAsistenciaPorCentroCosto(Boolean isVisibilidadCeldaDuplicarAsistenciaPorCentroCosto) {
		this.isVisibilidadCeldaDuplicarAsistenciaPorCentroCosto = isVisibilidadCeldaDuplicarAsistenciaPorCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarAsistenciaPorCentroCosto() {
		return isVisibilidadCeldaCopiarAsistenciaPorCentroCosto;
	}

	public void setIsVisibilidadCeldaCopiarAsistenciaPorCentroCosto(Boolean isVisibilidadCeldaCopiarAsistenciaPorCentroCosto) {
		this.isVisibilidadCeldaCopiarAsistenciaPorCentroCosto = isVisibilidadCeldaCopiarAsistenciaPorCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormAsistenciaPorCentroCosto() {
		return isVisibilidadCeldaVerFormAsistenciaPorCentroCosto;
	}

	public void setIsVisibilidadCeldaVerFormAsistenciaPorCentroCosto(Boolean isVisibilidadCeldaVerFormAsistenciaPorCentroCosto) {
		this.isVisibilidadCeldaVerFormAsistenciaPorCentroCosto = isVisibilidadCeldaVerFormAsistenciaPorCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenAsistenciaPorCentroCosto() {
		return isVisibilidadCeldaOrdenAsistenciaPorCentroCosto;
	}

	public void setIsVisibilidadCeldaOrdenAsistenciaPorCentroCosto(Boolean isVisibilidadCeldaOrdenAsistenciaPorCentroCosto) {
		this.isVisibilidadCeldaOrdenAsistenciaPorCentroCosto = isVisibilidadCeldaOrdenAsistenciaPorCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto() {
		return isVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto(Boolean isVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto) {
		this.isVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto = isVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarAsistenciaPorCentroCosto() {
		return isVisibilidadCeldaModificarAsistenciaPorCentroCosto;
	}

	public void setIsVisibilidadCeldaModificarAsistenciaPorCentroCosto(Boolean isVisibilidadCeldaModificarAsistenciaPorCentroCosto) {
		this.isVisibilidadCeldaModificarAsistenciaPorCentroCosto = isVisibilidadCeldaModificarAsistenciaPorCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarAsistenciaPorCentroCosto() {
		return isVisibilidadCeldaActualizarAsistenciaPorCentroCosto;
	}

	public void setIsVisibilidadCeldaActualizarAsistenciaPorCentroCosto(Boolean isVisibilidadCeldaActualizarAsistenciaPorCentroCosto) {
		this.isVisibilidadCeldaActualizarAsistenciaPorCentroCosto = isVisibilidadCeldaActualizarAsistenciaPorCentroCosto;
	}

	public Boolean getIsVisibilidadCeldaEliminarAsistenciaPorCentroCosto() {
		return isVisibilidadCeldaEliminarAsistenciaPorCentroCosto;
	}

	public void setIsVisibilidadCeldaEliminarAsistenciaPorCentroCosto(Boolean isVisibilidadCeldaEliminarAsistenciaPorCentroCosto) {
		this.isVisibilidadCeldaEliminarAsistenciaPorCentroCosto = isVisibilidadCeldaEliminarAsistenciaPorCentroCosto;
	}

	public Boolean getIsVisibilidadCeldaCancelarAsistenciaPorCentroCosto() {
		return isVisibilidadCeldaCancelarAsistenciaPorCentroCosto;
	}

	public void setIsVisibilidadCeldaCancelarAsistenciaPorCentroCosto(Boolean isVisibilidadCeldaCancelarAsistenciaPorCentroCosto) {
		this.isVisibilidadCeldaCancelarAsistenciaPorCentroCosto = isVisibilidadCeldaCancelarAsistenciaPorCentroCosto;
	}

	public Boolean getIsVisibilidadCeldaGuardarAsistenciaPorCentroCosto() {
		return isVisibilidadCeldaGuardarAsistenciaPorCentroCosto;
	}

	public void setIsVisibilidadCeldaGuardarAsistenciaPorCentroCosto(Boolean isVisibilidadCeldaGuardarAsistenciaPorCentroCosto) {
		this.isVisibilidadCeldaGuardarAsistenciaPorCentroCosto = isVisibilidadCeldaGuardarAsistenciaPorCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosAsistenciaPorCentroCosto() {
		return isVisibilidadCeldaGuardarCambiosAsistenciaPorCentroCosto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosAsistenciaPorCentroCosto(Boolean isVisibilidadCeldaGuardarCambiosAsistenciaPorCentroCosto) {
		this.isVisibilidadCeldaGuardarCambiosAsistenciaPorCentroCosto = isVisibilidadCeldaGuardarCambiosAsistenciaPorCentroCosto;
	}
		
	public AsistenciaPorCentroCostoSessionBean getasistenciaporcentrocostoSessionBean() {
		return this.asistenciaporcentrocostoSessionBean;
	}
	
	public void setasistenciaporcentrocostoSessionBean(AsistenciaPorCentroCostoSessionBean asistenciaporcentrocostoSessionBean) {
		this.asistenciaporcentrocostoSessionBean=asistenciaporcentrocostoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCentroCosto() {
		return this.isVisibilidadFK_IdCentroCosto;
	}

	public void setisVisibilidadFK_IdCentroCosto(Boolean isVisibilidadFK_IdCentroCosto) {
		this.isVisibilidadFK_IdCentroCosto=isVisibilidadFK_IdCentroCosto;
	}

	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(AsistenciaPorCentroCosto asistenciaporcentrocosto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(asistenciaporcentrocosto,null);
				this.setActualParaGuardarCentroCostoForeignKey(asistenciaporcentrocosto,null);
				this.setActualParaGuardarEmpleadoForeignKey(asistenciaporcentrocosto,null);
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
	
	public void bugActualizarReferenciaActual(AsistenciaPorCentroCosto asistenciaporcentrocosto,AsistenciaPorCentroCosto asistenciaporcentrocostoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalAsistenciaPorCentroCosto(asistenciaporcentrocosto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		asistenciaporcentrocostoAux.setId(asistenciaporcentrocosto.getId());
		asistenciaporcentrocostoAux.setVersionRow(asistenciaporcentrocosto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessAsistenciaPorCentroCosto();
		
			int intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.asistenciaporcentrocosto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = asistenciaporcentrocostoValidator.getInvalidValues(this.asistenciaporcentrocosto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			asistenciaporcentrocostoLogic.setDatosCliente(datosCliente);
			asistenciaporcentrocostoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				asistenciaporcentrocostoAux=new  AsistenciaPorCentroCosto();
				
				asistenciaporcentrocostoAux.setIsNew(true);
				asistenciaporcentrocostoAux.setIsChanged(true);
				
				asistenciaporcentrocostoAux.setAsistenciaPorCentroCostoOriginal(this.asistenciaporcentrocosto);
				
				asistenciaporcentrocostoAux.setId(this.asistenciaporcentrocosto.getId());	
				asistenciaporcentrocostoAux.setVersionRow(this.asistenciaporcentrocosto.getVersionRow());	
				asistenciaporcentrocostoAux.setid_empresa(this.asistenciaporcentrocosto.getid_empresa());	
				asistenciaporcentrocostoAux.setid_centro_costo(this.asistenciaporcentrocosto.getid_centro_costo());	
				asistenciaporcentrocostoAux.setid_empleado(this.asistenciaporcentrocosto.getid_empleado());	
				asistenciaporcentrocostoAux.setfecha(this.asistenciaporcentrocosto.getfecha());	
				asistenciaporcentrocostoAux.setporcentaje(this.asistenciaporcentrocosto.getporcentaje());	
				asistenciaporcentrocostoAux.setvalor_hora(this.asistenciaporcentrocosto.getvalor_hora());	
				asistenciaporcentrocostoAux.setpermiso(this.asistenciaporcentrocosto.getpermiso());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.asistenciaporcentrocostoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(asistenciaporcentrocostoAux,asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(asistenciaporcentrocostoAux,asistenciaporcentrocostos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.asistenciaporcentrocostoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciaporcentrocostoLogic.saveAsistenciaPorCentroCostos();//WithConnection
						//asistenciaporcentrocostoLogic.getSetVersionRowAsistenciaPorCentroCostos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.asistenciaporcentrocosto,asistenciaporcentrocostoAux);
					
					this.refrescarForeignKeysDescripcionesAsistenciaPorCentroCosto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.asistenciaporcentrocostoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								asistenciaporcentrocostoLogic.saveAsistenciaPorCentroCostoRelaciones(asistenciaporcentrocostoAux);//WithConnection
								//asistenciaporcentrocostoLogic.getSetVersionRowAsistenciaPorCentroCostos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.asistenciaporcentrocosto,asistenciaporcentrocostoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.asistenciaporcentrocostoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(asistenciaporcentrocostoAux,asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(asistenciaporcentrocostoAux,asistenciaporcentrocostos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.asistenciaporcentrocosto,asistenciaporcentrocostoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				asistenciaporcentrocostoAux=new  AsistenciaPorCentroCosto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado() 
					|| (this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado() && this.asistenciaporcentrocosto.getId()>=0)) {
						
					asistenciaporcentrocostoAux.setIsNew(false);
				}
				
				asistenciaporcentrocostoAux.setIsDeleted(false);
			
				asistenciaporcentrocostoAux.setId(this.asistenciaporcentrocosto.getId());	
				asistenciaporcentrocostoAux.setVersionRow(this.asistenciaporcentrocosto.getVersionRow());	
				asistenciaporcentrocostoAux.setid_empresa(this.asistenciaporcentrocosto.getid_empresa());	
				asistenciaporcentrocostoAux.setid_centro_costo(this.asistenciaporcentrocosto.getid_centro_costo());	
				asistenciaporcentrocostoAux.setid_empleado(this.asistenciaporcentrocosto.getid_empleado());	
				asistenciaporcentrocostoAux.setfecha(this.asistenciaporcentrocosto.getfecha());	
				asistenciaporcentrocostoAux.setporcentaje(this.asistenciaporcentrocosto.getporcentaje());	
				asistenciaporcentrocostoAux.setvalor_hora(this.asistenciaporcentrocosto.getvalor_hora());	
				asistenciaporcentrocostoAux.setpermiso(this.asistenciaporcentrocosto.getpermiso());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(asistenciaporcentrocostoAux,asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(asistenciaporcentrocostoAux,asistenciaporcentrocostos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.asistenciaporcentrocostoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciaporcentrocostoLogic.saveAsistenciaPorCentroCostos();//WithConnection
						//asistenciaporcentrocostoLogic.getSetVersionRowAsistenciaPorCentroCostos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.asistenciaporcentrocosto,asistenciaporcentrocostoAux);
					
					this.refrescarForeignKeysDescripcionesAsistenciaPorCentroCosto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.asistenciaporcentrocostoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								asistenciaporcentrocostoLogic.saveAsistenciaPorCentroCostoRelaciones(asistenciaporcentrocostoAux);//WithConnection
								//asistenciaporcentrocostoLogic.getSetVersionRowAsistenciaPorCentroCostos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.asistenciaporcentrocosto,asistenciaporcentrocostoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.asistenciaporcentrocostoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(asistenciaporcentrocostoAux,asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(asistenciaporcentrocostoAux,asistenciaporcentrocostos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.asistenciaporcentrocosto,asistenciaporcentrocostoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				asistenciaporcentrocostoAux=new  AsistenciaPorCentroCosto();
				
				asistenciaporcentrocostoAux.setIsNew(false);
				asistenciaporcentrocostoAux.setIsChanged(false);
				
				asistenciaporcentrocostoAux.setIsDeleted(true);
				
				asistenciaporcentrocostoAux.setId(this.asistenciaporcentrocosto.getId());	
				asistenciaporcentrocostoAux.setVersionRow(this.asistenciaporcentrocosto.getVersionRow());	
				asistenciaporcentrocostoAux.setid_empresa(this.asistenciaporcentrocosto.getid_empresa());	
				asistenciaporcentrocostoAux.setid_centro_costo(this.asistenciaporcentrocosto.getid_centro_costo());	
				asistenciaporcentrocostoAux.setid_empleado(this.asistenciaporcentrocosto.getid_empleado());	
				asistenciaporcentrocostoAux.setfecha(this.asistenciaporcentrocosto.getfecha());	
				asistenciaporcentrocostoAux.setporcentaje(this.asistenciaporcentrocosto.getporcentaje());	
				asistenciaporcentrocostoAux.setvalor_hora(this.asistenciaporcentrocosto.getvalor_hora());	
				asistenciaporcentrocostoAux.setpermiso(this.asistenciaporcentrocosto.getpermiso());	
				
				if(this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.asistenciaporcentrocostoAux.getId()>=0) {	
						this.asistenciaporcentrocostosEliminados.add(asistenciaporcentrocostoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(asistenciaporcentrocostoAux,asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(asistenciaporcentrocostoAux,asistenciaporcentrocostos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.asistenciaporcentrocostoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciaporcentrocostoLogic.saveAsistenciaPorCentroCostos();//WithConnection
						//asistenciaporcentrocostoLogic.getSetVersionRowAsistenciaPorCentroCostos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.asistenciaporcentrocostoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								asistenciaporcentrocostoLogic.saveAsistenciaPorCentroCostoRelaciones(asistenciaporcentrocostoAux);//WithConnection
								//asistenciaporcentrocostoLogic.getSetVersionRowAsistenciaPorCentroCostos();//WithConnection
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
							if(this.asistenciaporcentrocostoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(asistenciaporcentrocostoAux,asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(asistenciaporcentrocostoAux,asistenciaporcentrocostos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().addAll(this.asistenciaporcentrocostosEliminados);
					
					asistenciaporcentrocostoLogic.saveAsistenciaPorCentroCostos();//WithConnection
					//asistenciaporcentrocostoLogic.getSetVersionRowAsistenciaPorCentroCostos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesAsistenciaPorCentroCosto();
				
				this.asistenciaporcentrocostosEliminados= new ArrayList<AsistenciaPorCentroCosto>();		
			}
			
			if(this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Asistencia Por Centro Costo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Asistencia Por Centro Costo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.asistenciaporcentrocosto=asistenciaporcentrocostoAux;
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
      		//this.finishProcessAsistenciaPorCentroCosto();
      	}
		
	}	
	
	public void actualizarRelaciones(AsistenciaPorCentroCosto asistenciaporcentrocostoLocal) throws Exception {
		
		if(this.asistenciaporcentrocostoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(AsistenciaPorCentroCosto asistenciaporcentrocostoLocal) throws Exception {	
		if(this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				asistenciaporcentrocostoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CentroCostoDetalleFormJInternalFrame.class)) {
				CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrameLocal=(CentroCostoBeanSwingJInternalFrame) ((CentroCostoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				centrocostoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCentroCosto(centrocostoBeanSwingJInternalFrameLocal.getcentrocosto(),true);
				centrocostoBeanSwingJInternalFrameLocal.actualizarLista(centrocostoBeanSwingJInternalFrameLocal.centrocosto,this.centrocostosForeignKey);

				centrocostoBeanSwingJInternalFrameLocal.actualizarRelaciones(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				asistenciaporcentrocostoLocal.setCentroCosto(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				this.addItemDefectoCombosForeignKeyCentroCosto();
				this.cargarCombosFrameCentroCostosForeignKey("Formulario");
				this.setActualCentroCostoForeignKey(centrocostoBeanSwingJInternalFrameLocal.centrocosto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				asistenciaporcentrocostoLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarAsistenciaPorCentroCostoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = asistenciaporcentrocostoValidator.getInvalidValues(this.asistenciaporcentrocosto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(AsistenciaPorCentroCosto asistenciaporcentrocosto,List<AsistenciaPorCentroCosto> asistenciaporcentrocostos) throws Exception {
		try	{		
			AsistenciaPorCentroCostoConstantesFunciones.actualizarLista(asistenciaporcentrocosto,asistenciaporcentrocostos,this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(AsistenciaPorCentroCosto asistenciaporcentrocosto,List<AsistenciaPorCentroCosto> asistenciaporcentrocostos) throws Exception {
		try	{			
			AsistenciaPorCentroCostoConstantesFunciones.actualizarSelectedLista(asistenciaporcentrocosto,asistenciaporcentrocostos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<AsistenciaPorCentroCosto> asistenciaporcentrocostosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				asistenciaporcentrocostosLocal=this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				asistenciaporcentrocostosLocal=this.asistenciaporcentrocostos;
			}
			//ARCHITECTURE
		
			for(AsistenciaPorCentroCosto asistenciaporcentrocostoLocal:asistenciaporcentrocostosLocal) {
				if(this.permiteMantenimiento(asistenciaporcentrocostoLocal) && asistenciaporcentrocostoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+AsistenciaPorCentroCostoConstantesFunciones.getAsistenciaPorCentroCostoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(AsistenciaPorCentroCostoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelid_empresaAsistenciaPorCentroCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaPorCentroCostoConstantesFunciones.IDCENTROCOSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelid_centro_costoAsistenciaPorCentroCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaPorCentroCostoConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelid_empleadoAsistenciaPorCentroCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaPorCentroCostoConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelfechaAsistenciaPorCentroCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaPorCentroCostoConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelporcentajeAsistenciaPorCentroCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaPorCentroCostoConstantesFunciones.VALORHORA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelvalor_horaAsistenciaPorCentroCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AsistenciaPorCentroCostoConstantesFunciones.PERMISO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelpermisoAsistenciaPorCentroCosto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelid_empresaAsistenciaPorCentroCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelid_centro_costoAsistenciaPorCentroCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelid_empleadoAsistenciaPorCentroCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelfechaAsistenciaPorCentroCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelporcentajeAsistenciaPorCentroCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelvalor_horaAsistenciaPorCentroCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelpermisoAsistenciaPorCentroCosto,"");
		
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
		this.iIdNuevoAsistenciaPorCentroCosto--;	
		
		
		this.asistenciaporcentrocostoAux=new AsistenciaPorCentroCosto();
		
		this.asistenciaporcentrocostoAux.setId(this.iIdNuevoAsistenciaPorCentroCosto);
		this.asistenciaporcentrocostoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().add(this.asistenciaporcentrocostoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.asistenciaporcentrocostos.add(this.asistenciaporcentrocostoAux);
		}
		//ARCHITECTURE
		
		this.asistenciaporcentrocosto=this.asistenciaporcentrocostoAux;
		
		if(AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
			this.setVariablesObjetoActualToFormularioForeignKeyAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
		}
				
		//this.setDefaultControlesAsistenciaPorCentroCosto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyAsistenciaPorCentroCosto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyAsistenciaPorCentroCosto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyAsistenciaPorCentroCosto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAsistenciaPorCentroCosto(this.asistenciaporcentrocostoBean,this.asistenciaporcentrocosto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.asistenciaporcentrocostoSessionBean.getConGuardarRelaciones()) {
			classes=AsistenciaPorCentroCostoConstantesFunciones.getClassesRelationshipsOfAsistenciaPorCentroCosto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.asistenciaporcentrocostoReturnGeneral=asistenciaporcentrocostoLogic.procesarEventosAsistenciaPorCentroCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos(),this.asistenciaporcentrocosto,this.asistenciaporcentrocostoParameterGeneral,this.isEsNuevoAsistenciaPorCentroCosto,classes);//this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCosto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanAsistenciaPorCentroCosto(this.asistenciaporcentrocostoReturnGeneral,this.asistenciaporcentrocostoBean,false);
		
		if(this.asistenciaporcentrocostoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyAsistenciaPorCentroCosto(this.asistenciaporcentrocostoReturnGeneral.getAsistenciaPorCentroCosto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioAsistenciaPorCentroCosto(this.asistenciaporcentrocostoReturnGeneral.getAsistenciaPorCentroCosto());
		}
		
		if(this.asistenciaporcentrocostoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioAsistenciaPorCentroCosto(this.asistenciaporcentrocostoReturnGeneral.getAsistenciaPorCentroCosto(),classes);//this.asistenciaporcentrocostoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.asistenciaporcentrocosto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyAsistenciaPorCentroCosto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyAsistenciaPorCentroCosto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.RecargarFormAsistenciaPorCentroCosto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingAsistenciaPorCentroCosto(false);
						
			if(asistenciaporcentrocostoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAsistenciaPorCentroCosto();
			}
			
			this.actualizarVisualTableDatosAsistenciaPorCentroCosto();
			
			this.jTableDatosAsistenciaPorCentroCosto.setRowSelectionInterval(this.getIndiceNuevoAsistenciaPorCentroCosto(), this.getIndiceNuevoAsistenciaPorCentroCosto());
			
			this.seleccionarFilaTablaAsistenciaPorCentroCostoActual();
						
			this.actualizarEstadoCeldasBotonesAsistenciaPorCentroCosto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesAsistenciaPorCentroCosto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jDateChooserfechaAsistenciaPorCentroCosto.setEnabled(isHabilitar && this.asistenciaporcentrocostoConstantesFunciones.activarfechaAsistenciaPorCentroCosto);
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldporcentajeAsistenciaPorCentroCosto.setEnabled(isHabilitar && this.asistenciaporcentrocostoConstantesFunciones.activarporcentajeAsistenciaPorCentroCosto);
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldvalor_horaAsistenciaPorCentroCosto.setEnabled(isHabilitar && this.asistenciaporcentrocostoConstantesFunciones.activarvalor_horaAsistenciaPorCentroCosto);
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldpermisoAsistenciaPorCentroCosto.setEnabled(isHabilitar && this.asistenciaporcentrocostoConstantesFunciones.activarpermisoAsistenciaPorCentroCosto);	
		//
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empresaAsistenciaPorCentroCosto.setEnabled(isHabilitar && this.asistenciaporcentrocostoConstantesFunciones.activarid_empresaAsistenciaPorCentroCosto);
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_centro_costoAsistenciaPorCentroCosto.setEnabled(isHabilitar && this.asistenciaporcentrocostoConstantesFunciones.activarid_centro_costoAsistenciaPorCentroCosto);
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empleadoAsistenciaPorCentroCosto.setEnabled(isHabilitar && this.asistenciaporcentrocostoConstantesFunciones.activarid_empleadoAsistenciaPorCentroCosto);
	};
	
	public void setDefaultControlesAsistenciaPorCentroCosto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoAsistenciaPorCentroCosto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.asistenciaporcentrocostoSessionBean.setConGuardarRelaciones(true);			
			this.asistenciaporcentrocostoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTabbedPaneRelacionesAsistenciaPorCentroCosto.setVisible(true);
			
					
		} else {
			//this.asistenciaporcentrocostoSessionBean.setConGuardarRelaciones(false);			
			this.asistenciaporcentrocostoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTabbedPaneRelacionesAsistenciaPorCentroCosto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoAsistenciaPorCentroCosto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos()) {
				if(asistenciaporcentrocostoAux.getId().equals(this.iIdNuevoAsistenciaPorCentroCosto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:this.asistenciaporcentrocostos) {
				if(asistenciaporcentrocostoAux.getId().equals(this.iIdNuevoAsistenciaPorCentroCosto)) {
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
	
	public int getIndiceActualAsistenciaPorCentroCosto(AsistenciaPorCentroCosto asistenciaporcentrocosto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos()) {
				if(asistenciaporcentrocostoAux.getId().equals(asistenciaporcentrocosto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:this.asistenciaporcentrocostos) {
				if(asistenciaporcentrocostoAux.getId().equals(asistenciaporcentrocosto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalAsistenciaPorCentroCosto(AsistenciaPorCentroCosto asistenciaporcentrocostoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos()) {
				if(asistenciaporcentrocostoAux.getAsistenciaPorCentroCostoOriginal().getId().equals(asistenciaporcentrocostoOriginal.getId())) {
					existe=true;
					asistenciaporcentrocostoOriginal.setId(asistenciaporcentrocostoAux.getId());
					asistenciaporcentrocostoOriginal.setVersionRow(asistenciaporcentrocostoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:this.asistenciaporcentrocostos) {
				if(asistenciaporcentrocostoAux.getAsistenciaPorCentroCostoOriginal().getId().equals(asistenciaporcentrocostoOriginal.getId())) {
					existe=true;
					asistenciaporcentrocostoOriginal.setId(asistenciaporcentrocostoAux.getId());
					asistenciaporcentrocostoOriginal.setVersionRow(asistenciaporcentrocostoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosAsistenciaPorCentroCosto(Boolean esParaCancelar) throws Exception {
		asistenciaporcentrocostosAux=new ArrayList<AsistenciaPorCentroCosto>();
		asistenciaporcentrocostoAux=new AsistenciaPorCentroCosto();
		
		if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos()) {
					if(asistenciaporcentrocostoAux.getId()<0) {
						asistenciaporcentrocostosAux.add(asistenciaporcentrocostoAux);
					}		
				}
				this.iIdNuevoAsistenciaPorCentroCosto=0L;
				this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().removeAll(asistenciaporcentrocostosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:this.asistenciaporcentrocostos) {
					if(asistenciaporcentrocostoAux.getId()<0) {
						asistenciaporcentrocostosAux.add(asistenciaporcentrocostoAux);
					}		
				}
				this.iIdNuevoAsistenciaPorCentroCosto=0L;
				this.asistenciaporcentrocostos.removeAll(asistenciaporcentrocostosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoAsistenciaPorCentroCosto 
					&& this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().size()>0
					) {
					asistenciaporcentrocostoAux=this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().get(this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().size() - 1);
				
					if(asistenciaporcentrocostoAux.getId()<0) {
						this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().remove(asistenciaporcentrocostoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoAsistenciaPorCentroCosto && this.asistenciaporcentrocostos.size()>0) {
					asistenciaporcentrocostoAux=this.asistenciaporcentrocostos.get(this.asistenciaporcentrocostos.size() - 1);
				
					if(asistenciaporcentrocostoAux.getId()<0) {
						this.asistenciaporcentrocostos.remove(asistenciaporcentrocostoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoAsistenciaPorCentroCosto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(asistenciaporcentrocosto.getId()<0) {
				this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().remove(this.asistenciaporcentrocosto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(asistenciaporcentrocosto.getId()<0) {
				this.asistenciaporcentrocostos.remove(this.asistenciaporcentrocosto);
			}
		}			
	}
	
	public void setEstadosInicialesAsistenciaPorCentroCosto(List<AsistenciaPorCentroCosto> asistenciaporcentrocostosAux) throws Exception {
		AsistenciaPorCentroCostoConstantesFunciones.setEstadosInicialesAsistenciaPorCentroCosto(asistenciaporcentrocostosAux);
	}
	
	public void setEstadosInicialesAsistenciaPorCentroCosto(AsistenciaPorCentroCosto asistenciaporcentrocostoAux) throws Exception {
		AsistenciaPorCentroCostoConstantesFunciones.setEstadosInicialesAsistenciaPorCentroCosto(asistenciaporcentrocostoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarAsistenciaPorCentroCostoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesAsistenciaPorCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarAsistenciaPorCentroCostoActual()) {
				if(!this.isEsNuevoAsistenciaPorCentroCosto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesAsistenciaPorCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoAsistenciaPorCentroCosto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarAsistenciaPorCentroCostoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Asistencia Por Centro Costo ?", "MANTENIMIENTO DE Asistencia Por Centro Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesAsistenciaPorCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(AsistenciaPorCentroCosto asistenciaporcentrocosto) throws Exception {
		AsistenciaPorCentroCostoConstantesFunciones.seleccionarAsignar(this.asistenciaporcentrocosto,asistenciaporcentrocosto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarAsistenciaPorCentroCosto=this.isPermisoActualizarOriginalAsistenciaPorCentroCosto;
			
			
			this.seleccionarAsignar(asistenciaporcentrocosto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AsistenciaPorCentroCostoConstantesFunciones.quitarEspaciosAsistenciaPorCentroCosto(this.asistenciaporcentrocosto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesAsistenciaPorCentroCosto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.asistenciaporcentrocostoSessionBean.setsFuncionBusquedaRapida(this.asistenciaporcentrocostoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoAsistenciaPorCentroCosto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosAsistenciaPorCentroCosto(esParaCancelar);				
				this.cancelarNuevoAsistenciaPorCentroCosto(esParaCancelar);								
			}
			
			this.asistenciaporcentrocosto=new AsistenciaPorCentroCosto();
			
			this.inicializarAsistenciaPorCentroCosto();
			
			this.actualizarEstadoCeldasBotonesAsistenciaPorCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarAsistenciaPorCentroCosto() throws Exception {
		try {
			AsistenciaPorCentroCostoConstantesFunciones.inicializarAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
			
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
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteAsistenciaPorCentroCostos(String sAccionBusqueda,List<AsistenciaPorCentroCosto> asistenciaporcentrocostosParaReportes) throws Exception {
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
					sPathReporteFinal="AsistenciaPorCentroCosto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="AsistenciaPorCentroCostoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("AsistenciaPorCentroCostoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="AsistenciaPorCentroCosto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Asistencia Por Centro Costos");		
		parameters.put("busquedapor", AsistenciaPorCentroCostoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceAsistenciaPorCentroCosto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			AsistenciaPorCentroCostoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			AsistenciaPorCentroCostoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceAsistenciaPorCentroCosto=new JRBeanArrayDataSource(AsistenciaPorCentroCostoJInternalFrame.TraerAsistenciaPorCentroCostoBeans(asistenciaporcentrocostosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceAsistenciaPorCentroCosto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+AsistenciaPorCentroCostoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(AsistenciaPorCentroCostoBean.TraerAsistenciaPorCentroCostoBeans(asistenciaporcentrocostosParaReportes).toArray()));
							
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
				this.generarExcelReporteAsistenciaPorCentroCostos(sAccionBusqueda,sTipoArchivoReporte,asistenciaporcentrocostosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalAsistenciaPorCentroCostos(sAccionBusqueda,sTipoArchivoReporte,asistenciaporcentrocostosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoAsistenciaPorCentroCostoActionPerformed(null);
					//this.generarExcelReporteAsistenciaPorCentroCostos(sAccionBusqueda,sTipoArchivoReporte,asistenciaporcentrocostosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalAsistenciaPorCentroCostos(sAccionBusqueda,sTipoArchivoReporte,asistenciaporcentrocostosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesAsistenciaPorCentroCostos(sAccionBusqueda,sTipoArchivoReporte,asistenciaporcentrocostosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesAsistenciaPorCentroCostos(sAccionBusqueda,sTipoArchivoReporte,asistenciaporcentrocostosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteAsistenciaPorCentroCostos(String sAccionBusqueda,String sTipoArchivoReporte,List<AsistenciaPorCentroCosto> asistenciaporcentrocostosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"asistenciaporcentrocosto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AsistenciaPorCentroCostos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAsistenciaPorCentroCosto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(AsistenciaPorCentroCosto asistenciaporcentrocosto : asistenciaporcentrocostosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			AsistenciaPorCentroCostoConstantesFunciones.generarExcelReporteDataAsistenciaPorCentroCosto("NORMAL",row,workbook,asistenciaporcentrocosto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Por Centro Costo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderAsistenciaPorCentroCosto(String sTipo,Row row,Workbook workbook) {
		
		AsistenciaPorCentroCostoConstantesFunciones.generarExcelReporteHeaderAsistenciaPorCentroCosto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalAsistenciaPorCentroCostos(String sAccionBusqueda,String sTipoArchivoReporte,List<AsistenciaPorCentroCosto> asistenciaporcentrocostosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"asistenciaporcentrocosto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AsistenciaPorCentroCostos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(AsistenciaPorCentroCosto asistenciaporcentrocosto : asistenciaporcentrocostosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.getAsistenciaPorCentroCostoDescripcion(asistenciaporcentrocosto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciaporcentrocosto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciaporcentrocosto.getcentrocosto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciaporcentrocosto.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaPorCentroCostoConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciaporcentrocosto.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaPorCentroCostoConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciaporcentrocosto.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaPorCentroCostoConstantesFunciones.LABEL_VALORHORA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.LABEL_VALORHORA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciaporcentrocosto.getvalor_hora());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AsistenciaPorCentroCostoConstantesFunciones.LABEL_PERMISO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.LABEL_PERMISO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(asistenciaporcentrocosto.getpermiso());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Por Centro Costo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesAsistenciaPorCentroCostos(String sAccionBusqueda,String sTipoArchivoReporte,List<AsistenciaPorCentroCosto> asistenciaporcentrocostosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<AsistenciaPorCentroCosto> asistenciaporcentrocostosRespaldo=null;
		
		classes=AsistenciaPorCentroCostoConstantesFunciones.getClassesRelationshipsOfAsistenciaPorCentroCosto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.asistenciaporcentrocostoLogic.setDatosCliente(this.datosCliente);
		this.asistenciaporcentrocostoLogic.setDatosDeep(this.datosDeep);
		this.asistenciaporcentrocostoLogic.setIsConDeep(true);
		
		asistenciaporcentrocostosRespaldo=this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos();
		
		this.asistenciaporcentrocostoLogic.setAsistenciaPorCentroCostos(asistenciaporcentrocostosParaReportes);	
		this.asistenciaporcentrocostoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		asistenciaporcentrocostosParaReportes=this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos();
		this.asistenciaporcentrocostoLogic.setAsistenciaPorCentroCostos(asistenciaporcentrocostosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"asistenciaporcentrocosto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AsistenciaPorCentroCostos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAsistenciaPorCentroCosto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(AsistenciaPorCentroCosto asistenciaporcentrocosto : asistenciaporcentrocostosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderAsistenciaPorCentroCosto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			AsistenciaPorCentroCostoConstantesFunciones.generarExcelReporteDataAsistenciaPorCentroCosto("NORMAL",row,workbook,asistenciaporcentrocosto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.getAsistenciaPorCentroCostoDescripcion(asistenciaporcentrocosto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Por Centro Costo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessAsistenciaPorCentroCosto() throws Exception {		
		this.startProcessAsistenciaPorCentroCosto(true);
	}
	
	public void startProcessAsistenciaPorCentroCosto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasAsistenciaPorCentroCosto ,this.jPanelParametrosReportesAsistenciaPorCentroCosto, this.jScrollPanelDatosAsistenciaPorCentroCosto,this.jPanelPaginacionAsistenciaPorCentroCosto, this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto, this.jPanelAccionesAsistenciaPorCentroCosto,this.jPanelAccionesFormularioAsistenciaPorCentroCosto,this.jmenuBarAsistenciaPorCentroCosto,this.jmenuBarDetalleAsistenciaPorCentroCosto,this.jTtoolBarAsistenciaPorCentroCosto,this.jTtoolBarDetalleAsistenciaPorCentroCosto);		
		
		final JTabbedPane jTabbedPaneBusquedasAsistenciaPorCentroCosto=this.jTabbedPaneBusquedasAsistenciaPorCentroCosto; 
		
		final JPanel jPanelParametrosReportesAsistenciaPorCentroCosto=this.jPanelParametrosReportesAsistenciaPorCentroCosto;
		//final JScrollPane jScrollPanelDatosAsistenciaPorCentroCosto=this.jScrollPanelDatosAsistenciaPorCentroCosto;
		final JTable jTableDatosAsistenciaPorCentroCosto=this.jTableDatosAsistenciaPorCentroCosto;		
		final JPanel jPanelPaginacionAsistenciaPorCentroCosto=this.jPanelPaginacionAsistenciaPorCentroCosto;
		//final JScrollPane jScrollPanelDatosEdicionAsistenciaPorCentroCosto=this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto;
		final JPanel jPanelAccionesAsistenciaPorCentroCosto=this.jPanelAccionesAsistenciaPorCentroCosto;
		
		JPanel jPanelCamposAuxiliarAsistenciaPorCentroCosto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarAsistenciaPorCentroCosto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
			jPanelCamposAuxiliarAsistenciaPorCentroCosto=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jPanelCamposAsistenciaPorCentroCosto;
			jPanelAccionesFormularioAuxiliarAsistenciaPorCentroCosto=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jPanelAccionesFormularioAsistenciaPorCentroCosto;
		}
		
		final JPanel jPanelCamposAsistenciaPorCentroCosto=jPanelCamposAuxiliarAsistenciaPorCentroCosto;
		final JPanel jPanelAccionesFormularioAsistenciaPorCentroCosto=jPanelAccionesFormularioAuxiliarAsistenciaPorCentroCosto;
		
		
		final JMenuBar jmenuBarAsistenciaPorCentroCosto=this.jmenuBarAsistenciaPorCentroCosto;
		final JToolBar jTtoolBarAsistenciaPorCentroCosto=this.jTtoolBarAsistenciaPorCentroCosto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarAsistenciaPorCentroCosto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAsistenciaPorCentroCosto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
			jmenuBarDetalleAuxiliarAsistenciaPorCentroCosto=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jmenuBarDetalleAsistenciaPorCentroCosto;
			jTtoolBarDetalleAuxiliarAsistenciaPorCentroCosto=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTtoolBarDetalleAsistenciaPorCentroCosto;
		}
		
		final JMenuBar jmenuBarDetalleAsistenciaPorCentroCosto=jmenuBarDetalleAuxiliarAsistenciaPorCentroCosto;
		final JToolBar jTtoolBarDetalleAsistenciaPorCentroCosto=jTtoolBarDetalleAuxiliarAsistenciaPorCentroCosto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAsistenciaPorCentroCosto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAsistenciaPorCentroCosto;
			processRunnable.jTableDatos=jTableDatosAsistenciaPorCentroCosto;
			processRunnable.jPanelCampos=jPanelCamposAsistenciaPorCentroCosto;
			processRunnable.jPanelPaginacion=jPanelPaginacionAsistenciaPorCentroCosto;
			processRunnable.jPanelAcciones=jPanelAccionesAsistenciaPorCentroCosto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAsistenciaPorCentroCosto;
			
			
			processRunnable.jmenuBar=jmenuBarAsistenciaPorCentroCosto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAsistenciaPorCentroCosto;
			processRunnable.jTtoolBar=jTtoolBarAsistenciaPorCentroCosto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAsistenciaPorCentroCosto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAsistenciaPorCentroCosto ,jPanelParametrosReportesAsistenciaPorCentroCosto,jTableDatosAsistenciaPorCentroCosto, /*jScrollPanelDatosAsistenciaPorCentroCosto,*/jPanelCamposAsistenciaPorCentroCosto,jPanelPaginacionAsistenciaPorCentroCosto, /*jScrollPanelDatosEdicionAsistenciaPorCentroCosto,*/ jPanelAccionesAsistenciaPorCentroCosto,jPanelAccionesFormularioAsistenciaPorCentroCosto,jmenuBarAsistenciaPorCentroCosto,jmenuBarDetalleAsistenciaPorCentroCosto,jTtoolBarAsistenciaPorCentroCosto,jTtoolBarDetalleAsistenciaPorCentroCosto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAsistenciaPorCentroCosto ,jPanelParametrosReportesAsistenciaPorCentroCosto, jScrollPanelDatosAsistenciaPorCentroCosto,jPanelPaginacionAsistenciaPorCentroCosto, jScrollPanelDatosEdicionAsistenciaPorCentroCosto, jPanelAccionesAsistenciaPorCentroCosto,jPanelAccionesFormularioAsistenciaPorCentroCosto,jmenuBarAsistenciaPorCentroCosto,jmenuBarDetalleAsistenciaPorCentroCosto,jTtoolBarAsistenciaPorCentroCosto,jTtoolBarDetalleAsistenciaPorCentroCosto);
						
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
	
	public void finishProcessAsistenciaPorCentroCosto() {// throws Exception 
		this.finishProcessAsistenciaPorCentroCosto(true);
	}
	
	public void finishProcessAsistenciaPorCentroCosto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasAsistenciaPorCentroCosto ,this.jPanelParametrosReportesAsistenciaPorCentroCosto, this.jScrollPanelDatosAsistenciaPorCentroCosto,this.jPanelPaginacionAsistenciaPorCentroCosto, this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto, this.jPanelAccionesAsistenciaPorCentroCosto,this.jPanelAccionesFormularioAsistenciaPorCentroCosto,this.jmenuBarAsistenciaPorCentroCosto,this.jmenuBarDetalleAsistenciaPorCentroCosto,this.jTtoolBarAsistenciaPorCentroCosto,this.jTtoolBarDetalleAsistenciaPorCentroCosto);		
		
		final JTabbedPane jTabbedPaneBusquedasAsistenciaPorCentroCosto=this.jTabbedPaneBusquedasAsistenciaPorCentroCosto; 
		
		final JPanel jPanelParametrosReportesAsistenciaPorCentroCosto=this.jPanelParametrosReportesAsistenciaPorCentroCosto;
		//final JScrollPane jScrollPanelDatosAsistenciaPorCentroCosto=this.jScrollPanelDatosAsistenciaPorCentroCosto;
		final JTable jTableDatosAsistenciaPorCentroCosto=this.jTableDatosAsistenciaPorCentroCosto;		
		final JPanel jPanelPaginacionAsistenciaPorCentroCosto=this.jPanelPaginacionAsistenciaPorCentroCosto;
		//final JScrollPane jScrollPanelDatosEdicionAsistenciaPorCentroCosto=this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto;
		final JPanel jPanelAccionesAsistenciaPorCentroCosto=this.jPanelAccionesAsistenciaPorCentroCosto;
		
		JPanel jPanelCamposAuxiliarAsistenciaPorCentroCosto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarAsistenciaPorCentroCosto=new JPanel();
		
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
			jPanelCamposAuxiliarAsistenciaPorCentroCosto=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jPanelCamposAsistenciaPorCentroCosto;
			jPanelAccionesFormularioAuxiliarAsistenciaPorCentroCosto=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jPanelAccionesFormularioAsistenciaPorCentroCosto;
		}
		
		final JPanel jPanelCamposAsistenciaPorCentroCosto=jPanelCamposAuxiliarAsistenciaPorCentroCosto;
		final JPanel jPanelAccionesFormularioAsistenciaPorCentroCosto=jPanelAccionesFormularioAuxiliarAsistenciaPorCentroCosto;
		
		
		final JMenuBar jmenuBarAsistenciaPorCentroCosto=this.jmenuBarAsistenciaPorCentroCosto;		
		final JToolBar jTtoolBarAsistenciaPorCentroCosto=this.jTtoolBarAsistenciaPorCentroCosto;
				
		JMenuBar jmenuBarDetalleAuxiliarAsistenciaPorCentroCosto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAsistenciaPorCentroCosto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
			jmenuBarDetalleAuxiliarAsistenciaPorCentroCosto=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jmenuBarDetalleAsistenciaPorCentroCosto;
			jTtoolBarDetalleAuxiliarAsistenciaPorCentroCosto=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTtoolBarDetalleAsistenciaPorCentroCosto;		
		}
		
		final JMenuBar jmenuBarDetalleAsistenciaPorCentroCosto=jmenuBarDetalleAuxiliarAsistenciaPorCentroCosto;
		final JToolBar jTtoolBarDetalleAsistenciaPorCentroCosto=jTtoolBarDetalleAuxiliarAsistenciaPorCentroCosto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAsistenciaPorCentroCosto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAsistenciaPorCentroCosto;
			processRunnable.jTableDatos=jTableDatosAsistenciaPorCentroCosto;
			processRunnable.jPanelCampos=jPanelCamposAsistenciaPorCentroCosto;
			processRunnable.jPanelPaginacion=jPanelPaginacionAsistenciaPorCentroCosto;
			processRunnable.jPanelAcciones=jPanelAccionesAsistenciaPorCentroCosto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAsistenciaPorCentroCosto;
			
			
			processRunnable.jmenuBar=jmenuBarAsistenciaPorCentroCosto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAsistenciaPorCentroCosto;
			processRunnable.jTtoolBar=jTtoolBarAsistenciaPorCentroCosto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAsistenciaPorCentroCosto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasAsistenciaPorCentroCosto ,jPanelParametrosReportesAsistenciaPorCentroCosto, jTableDatosAsistenciaPorCentroCosto,/*jScrollPanelDatosAsistenciaPorCentroCosto,*/jPanelCamposAsistenciaPorCentroCosto,jPanelPaginacionAsistenciaPorCentroCosto, /*jScrollPanelDatosEdicionAsistenciaPorCentroCosto,*/ jPanelAccionesAsistenciaPorCentroCosto,jPanelAccionesFormularioAsistenciaPorCentroCosto,jmenuBarAsistenciaPorCentroCosto,jmenuBarDetalleAsistenciaPorCentroCosto,jTtoolBarAsistenciaPorCentroCosto,jTtoolBarDetalleAsistenciaPorCentroCosto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesAsistenciaPorCentroCosto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarAsistenciaPorCentroCosto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuAsistenciaPorCentroCosto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarAsistenciaPorCentroCosto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarAsistenciaPorCentroCosto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleAsistenciaPorCentroCosto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuAsistenciaPorCentroCosto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarAsistenciaPorCentroCosto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleAsistenciaPorCentroCosto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.asistenciaporcentrocostoConstantesFunciones.getsFinalQueryAsistenciaPorCentroCosto();
		String  finalQueryPaginacionTodos=this.asistenciaporcentrocostoConstantesFunciones.getsFinalQueryAsistenciaPorCentroCosto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=AsistenciaPorCentroCostoConstantesFunciones.getArrayColumnasGlobalesNoAsistenciaPorCentroCosto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=AsistenciaPorCentroCostoConstantesFunciones.getArrayColumnasGlobalesAsistenciaPorCentroCosto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,AsistenciaPorCentroCostoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.asistenciaporcentrocostosEliminados= new ArrayList<AsistenciaPorCentroCosto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessAsistenciaPorCentroCosto();
		
				///*AsistenciaPorCentroCostoSessionBean*/this.asistenciaporcentrocostoSessionBean=new AsistenciaPorCentroCostoSessionBean();
			
			if(this.asistenciaporcentrocostoSessionBean==null) {
				this.asistenciaporcentrocostoSessionBean=new AsistenciaPorCentroCostoSessionBean();
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
					this.iNumeroPaginacion=AsistenciaPorCentroCostoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=AsistenciaPorCentroCostoConstantesFunciones.getClassesForeignKeysOfAsistenciaPorCentroCosto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/asistenciaporcentrocosto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			asistenciaporcentrocostosAux= new ArrayList<AsistenciaPorCentroCosto>();
			
				
			asistenciaporcentrocostoLogic.setDatosCliente(this.datosCliente);
			asistenciaporcentrocostoLogic.setDatosDeep(this.datosDeep);
			asistenciaporcentrocostoLogic.setIsConDeep(true);
			
			
			asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					asistenciaporcentrocostoLogic.getTodosAsistenciaPorCentroCostos(finalQueryGlobal,pagination);
					
					//asistenciaporcentrocostoLogic.getTodosAsistenciaPorCentroCostosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos()==null|| asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							asistenciaporcentrocostosAux= new ArrayList<AsistenciaPorCentroCosto>();
							asistenciaporcentrocostosAux.addAll(asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciaporcentrocostosAux= new ArrayList<AsistenciaPorCentroCosto>();
							asistenciaporcentrocostosAux.addAll(asistenciaporcentrocostos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							asistenciaporcentrocostoLogic.getTodosAsistenciaPorCentroCostos(finalQueryGlobal+"",this.pagination);												
							
							//asistenciaporcentrocostoLogic.getTodosAsistenciaPorCentroCostosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteAsistenciaPorCentroCostos("Todos",asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							asistenciaporcentrocostoLogic.setAsistenciaPorCentroCostos(new ArrayList<AsistenciaPorCentroCosto>());					
							asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().addAll(asistenciaporcentrocostosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciaporcentrocostos=new ArrayList<AsistenciaPorCentroCosto>();
							asistenciaporcentrocostos.addAll(asistenciaporcentrocostosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idAsistenciaPorCentroCosto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idAsistenciaPorCentroCosto=this.idActual;
				
				} else if(this.idAsistenciaPorCentroCostoActual!=null && this.idAsistenciaPorCentroCostoActual!=0L) {
					idAsistenciaPorCentroCosto=idAsistenciaPorCentroCostoActual;
				}
				
					
				this.sDetalleReporte=AsistenciaPorCentroCostoConstantesFunciones.getDetalleIndicePorId(idAsistenciaPorCentroCosto);
				
				this.asistenciaporcentrocostos=new ArrayList<AsistenciaPorCentroCosto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					asistenciaporcentrocostoLogic.getEntity(idAsistenciaPorCentroCosto);
					
					//asistenciaporcentrocostoLogic.getEntityWithConnection(idAsistenciaPorCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asistenciaporcentrocostoLogic.setAsistenciaPorCentroCostos(new ArrayList<AsistenciaPorCentroCosto>());
					asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().add(asistenciaporcentrocostoLogic.getAsistenciaPorCentroCosto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.asistenciaporcentrocostos=new ArrayList<AsistenciaPorCentroCosto>();
					this.asistenciaporcentrocostos.add(asistenciaporcentrocosto);
				}
				
				if(asistenciaporcentrocostoLogic.getAsistenciaPorCentroCosto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCentroCosto")) {
				this.sDetalleReporte=AsistenciaPorCentroCostoConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostosFK_IdCentroCosto(finalQueryGlobal,pagination,id_centro_costoFK_IdCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaPorCentroCostoConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaPorCentroCostoConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos()==null||asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=asistenciaporcentrocostos==null|| asistenciaporcentrocostos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciaporcentrocostosAux=new ArrayList<AsistenciaPorCentroCosto>();
						asistenciaporcentrocostosAux.addAll(asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciaporcentrocostosAux=new ArrayList<AsistenciaPorCentroCosto>();
							asistenciaporcentrocostosAux.addAll(asistenciaporcentrocostos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostosFK_IdCentroCosto(finalQueryGlobal,pagination,id_centro_costoFK_IdCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaPorCentroCostoConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaPorCentroCostoConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAsistenciaPorCentroCostos("FK_IdCentroCosto",asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAsistenciaPorCentroCostos("FK_IdCentroCosto",asistenciaporcentrocostos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciaporcentrocostoLogic.setAsistenciaPorCentroCostos(new ArrayList<AsistenciaPorCentroCosto>());
						asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().addAll(asistenciaporcentrocostosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciaporcentrocostos=new ArrayList<AsistenciaPorCentroCosto>();
							asistenciaporcentrocostos.addAll(asistenciaporcentrocostosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=AsistenciaPorCentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaPorCentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaPorCentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos()==null||asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=asistenciaporcentrocostos==null|| asistenciaporcentrocostos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciaporcentrocostosAux=new ArrayList<AsistenciaPorCentroCosto>();
						asistenciaporcentrocostosAux.addAll(asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciaporcentrocostosAux=new ArrayList<AsistenciaPorCentroCosto>();
							asistenciaporcentrocostosAux.addAll(asistenciaporcentrocostos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaPorCentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaPorCentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAsistenciaPorCentroCostos("FK_IdEmpleado",asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAsistenciaPorCentroCostos("FK_IdEmpleado",asistenciaporcentrocostos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciaporcentrocostoLogic.setAsistenciaPorCentroCostos(new ArrayList<AsistenciaPorCentroCosto>());
						asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().addAll(asistenciaporcentrocostosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciaporcentrocostos=new ArrayList<AsistenciaPorCentroCosto>();
							asistenciaporcentrocostos.addAll(asistenciaporcentrocostosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=AsistenciaPorCentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaPorCentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaPorCentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos()==null||asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=asistenciaporcentrocostos==null|| asistenciaporcentrocostos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciaporcentrocostosAux=new ArrayList<AsistenciaPorCentroCosto>();
						asistenciaporcentrocostosAux.addAll(asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciaporcentrocostosAux=new ArrayList<AsistenciaPorCentroCosto>();
							asistenciaporcentrocostosAux.addAll(asistenciaporcentrocostos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AsistenciaPorCentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AsistenciaPorCentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAsistenciaPorCentroCostos("FK_IdEmpresa",asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAsistenciaPorCentroCostos("FK_IdEmpresa",asistenciaporcentrocostos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciaporcentrocostoLogic.setAsistenciaPorCentroCostos(new ArrayList<AsistenciaPorCentroCosto>());
						asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().addAll(asistenciaporcentrocostosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciaporcentrocostos=new ArrayList<AsistenciaPorCentroCosto>();
							asistenciaporcentrocostos.addAll(asistenciaporcentrocostosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesAsistenciaPorCentroCosto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessAsistenciaPorCentroCosto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=asistenciaporcentrocostos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=asistenciaporcentrocostos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(AsistenciaPorCentroCosto asistenciaporcentrocosto) {
		Boolean permite=true;
		
		if(this.asistenciaporcentrocosto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=AsistenciaPorCentroCostoConstantesFunciones.getOrderByListaAsistenciaPorCentroCosto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=AsistenciaPorCentroCostoConstantesFunciones.getOrderByListaAsistenciaPorCentroCosto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AsistenciaPorCentroCosto asistenciaporcentrocosto:asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos()) {
				if(asistenciaporcentrocosto.getsType().equals(Constantes2.S_TOTALES)) {
					asistenciaporcentrocostoTotales=asistenciaporcentrocosto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AsistenciaPorCentroCosto asistenciaporcentrocosto:this.asistenciaporcentrocostos) {
				if(asistenciaporcentrocosto.getsType().equals(Constantes2.S_TOTALES)) {
					asistenciaporcentrocostoTotales=asistenciaporcentrocosto;
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
			this.asistenciaporcentrocostoAux=new AsistenciaPorCentroCosto();
			this.asistenciaporcentrocostoAux.setsType(Constantes2.S_TOTALES);
			this.asistenciaporcentrocostoAux.setIsNew(false);
			this.asistenciaporcentrocostoAux.setIsChanged(false);
			this.asistenciaporcentrocostoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				AsistenciaPorCentroCostoConstantesFunciones.TotalizarValoresFilaAsistenciaPorCentroCosto(this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos(),this.asistenciaporcentrocostoAux);
				
				this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().add(this.asistenciaporcentrocostoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				AsistenciaPorCentroCostoConstantesFunciones.TotalizarValoresFilaAsistenciaPorCentroCosto(this.asistenciaporcentrocostos,this.asistenciaporcentrocostoAux);
				
				this.asistenciaporcentrocostos.add(this.asistenciaporcentrocostoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		asistenciaporcentrocostoTotales=new AsistenciaPorCentroCosto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().remove(asistenciaporcentrocostoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.asistenciaporcentrocostos.remove(asistenciaporcentrocostoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		asistenciaporcentrocostoTotales=new AsistenciaPorCentroCosto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AsistenciaPorCentroCosto asistenciaporcentrocosto:asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos()) {
				if(asistenciaporcentrocosto.getsType().equals(Constantes2.S_TOTALES)) {
					asistenciaporcentrocostoTotales=asistenciaporcentrocosto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AsistenciaPorCentroCostoConstantesFunciones.TotalizarValoresFilaAsistenciaPorCentroCosto(this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos(),asistenciaporcentrocostoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AsistenciaPorCentroCosto asistenciaporcentrocosto:this.asistenciaporcentrocostos) {
				if(asistenciaporcentrocosto.getsType().equals(Constantes2.S_TOTALES)) {
					asistenciaporcentrocostoTotales=asistenciaporcentrocosto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AsistenciaPorCentroCostoConstantesFunciones.TotalizarValoresFilaAsistenciaPorCentroCosto(this.asistenciaporcentrocostos,asistenciaporcentrocostoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getAsistenciaPorCentroCostosFK_IdCentroCosto()throws Exception {
		try {
			sAccionBusqueda="FK_IdCentroCosto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAsistenciaPorCentroCostosFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAsistenciaPorCentroCostosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getAsistenciaPorCentroCostosFK_IdCentroCosto(String sFinalQuery,Long id_centro_costo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostosFK_IdCentroCosto(sFinalQuery,this.pagination,id_centro_costo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAsistenciaPorCentroCostosFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostosFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAsistenciaPorCentroCostosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosAsistenciaPorCentroCosto() {
		this.isPermisoTodoAsistenciaPorCentroCosto=false;
		this.isPermisoNuevoAsistenciaPorCentroCosto=false;
		this.isPermisoActualizarAsistenciaPorCentroCosto=false;
		this.isPermisoActualizarOriginalAsistenciaPorCentroCosto=false;
		this.isPermisoEliminarAsistenciaPorCentroCosto=false;
		this.isPermisoGuardarCambiosAsistenciaPorCentroCosto=false;
		this.isPermisoConsultaAsistenciaPorCentroCosto=false;
		this.isPermisoBusquedaAsistenciaPorCentroCosto=false;
		this.isPermisoReporteAsistenciaPorCentroCosto=false;		
		this.isPermisoOrdenAsistenciaPorCentroCosto=false;		
		this.isPermisoPaginacionMedioAsistenciaPorCentroCosto=false;		
		this.isPermisoPaginacionAltoAsistenciaPorCentroCosto=false;
		this.isPermisoPaginacionTodoAsistenciaPorCentroCosto=false;
		this.isPermisoCopiarAsistenciaPorCentroCosto=false;		
		this.isPermisoVerFormAsistenciaPorCentroCosto=false;		
		this.isPermisoDuplicarAsistenciaPorCentroCosto=false;		
		this.isPermisoOrdenAsistenciaPorCentroCosto=false;		
	}
	
	public void setPermisosUsuarioAsistenciaPorCentroCosto(Boolean isPermiso) {
		this.isPermisoTodoAsistenciaPorCentroCosto=isPermiso;
		this.isPermisoNuevoAsistenciaPorCentroCosto=isPermiso;
		this.isPermisoActualizarAsistenciaPorCentroCosto=isPermiso;
		this.isPermisoActualizarOriginalAsistenciaPorCentroCosto=isPermiso;
		this.isPermisoEliminarAsistenciaPorCentroCosto=isPermiso;
		this.isPermisoGuardarCambiosAsistenciaPorCentroCosto=isPermiso;
		this.isPermisoConsultaAsistenciaPorCentroCosto=isPermiso;
		this.isPermisoBusquedaAsistenciaPorCentroCosto=isPermiso;
		this.isPermisoReporteAsistenciaPorCentroCosto=isPermiso;
		this.isPermisoOrdenAsistenciaPorCentroCosto=isPermiso;		
		this.isPermisoPaginacionMedioAsistenciaPorCentroCosto=isPermiso;		
		this.isPermisoPaginacionAltoAsistenciaPorCentroCosto=isPermiso;		
		this.isPermisoPaginacionTodoAsistenciaPorCentroCosto=isPermiso;		
		this.isPermisoCopiarAsistenciaPorCentroCosto=isPermiso;		
		this.isPermisoVerFormAsistenciaPorCentroCosto=isPermiso;		
		this.isPermisoDuplicarAsistenciaPorCentroCosto=isPermiso;
		this.isPermisoOrdenAsistenciaPorCentroCosto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioAsistenciaPorCentroCosto(Boolean isPermiso) {
		//this.isPermisoTodoAsistenciaPorCentroCosto=isPermiso;
		this.isPermisoNuevoAsistenciaPorCentroCosto=isPermiso;
		this.isPermisoActualizarAsistenciaPorCentroCosto=isPermiso;
		this.isPermisoActualizarOriginalAsistenciaPorCentroCosto=isPermiso;
		this.isPermisoEliminarAsistenciaPorCentroCosto=isPermiso;
		this.isPermisoGuardarCambiosAsistenciaPorCentroCosto=isPermiso;
		//this.isPermisoConsultaAsistenciaPorCentroCosto=isPermiso;
		//this.isPermisoBusquedaAsistenciaPorCentroCosto=isPermiso;
		//this.isPermisoReporteAsistenciaPorCentroCosto=isPermiso;
		//this.isPermisoOrdenAsistenciaPorCentroCosto=isPermiso;		
		//this.isPermisoPaginacionMedioAsistenciaPorCentroCosto=isPermiso;		
		//this.isPermisoPaginacionAltoAsistenciaPorCentroCosto=isPermiso;		
		//this.isPermisoPaginacionTodoAsistenciaPorCentroCosto=isPermiso;		
		//this.isPermisoCopiarAsistenciaPorCentroCosto=isPermiso;		
		//this.isPermisoDuplicarAsistenciaPorCentroCosto=isPermiso;
		//this.isPermisoOrdenAsistenciaPorCentroCosto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioAsistenciaPorCentroCostoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(AsistenciaPorCentroCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebAsistenciaPorCentroCosto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioAsistenciaPorCentroCostoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioAsistenciaPorCentroCostoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionAsistenciaPorCentroCostoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioAsistenciaPorCentroCostoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioAsistenciaPorCentroCosto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(AsistenciaPorCentroCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, AsistenciaPorCentroCostoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoAsistenciaPorCentroCosto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarAsistenciaPorCentroCosto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalAsistenciaPorCentroCosto=this.isPermisoActualizarAsistenciaPorCentroCosto;
			this.isPermisoEliminarAsistenciaPorCentroCosto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosAsistenciaPorCentroCosto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaAsistenciaPorCentroCosto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaAsistenciaPorCentroCosto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoAsistenciaPorCentroCosto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteAsistenciaPorCentroCosto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAsistenciaPorCentroCosto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioAsistenciaPorCentroCosto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoAsistenciaPorCentroCosto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoAsistenciaPorCentroCosto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarAsistenciaPorCentroCosto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormAsistenciaPorCentroCosto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarAsistenciaPorCentroCosto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAsistenciaPorCentroCosto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosAsistenciaPorCentroCosto.setToolTipText(this.jTableDatosAsistenciaPorCentroCosto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioAsistenciaPorCentroCosto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioAsistenciaPorCentroCosto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(AsistenciaPorCentroCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(AsistenciaPorCentroCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioAsistenciaPorCentroCosto() throws Exception {
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
	public void inicializarCombosForeignKeyAsistenciaPorCentroCostoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.centrocostosForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyAsistenciaPorCentroCostoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(AsistenciaPorCentroCostoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyAsistenciaPorCentroCostoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCentroCostoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyCentroCostoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.centrocostosForeignKey==null||this.centrocostosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CentroCostoConstantesFunciones.SFINALQUERY;

				this.cargarCombosCentroCostosForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyAsistenciaPorCentroCostoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			AsistenciaPorCentroCostoParameterReturnGeneral asistenciaporcentrocostoReturnGeneral=new AsistenciaPorCentroCostoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.asistenciaporcentrocostoConstantesFunciones.cargarid_empresaAsistenciaPorCentroCosto)
					 || (this.esRecargarFks && this.asistenciaporcentrocostoConstantesFunciones.cargarid_empresaAsistenciaPorCentroCosto)) {

					if(!this.asistenciaporcentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+asistenciaporcentrocostoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCentroCosto="";

				if(((this.centrocostosForeignKey==null||this.centrocostosForeignKey.size()<=0) && this.asistenciaporcentrocostoConstantesFunciones.cargarid_centro_costoAsistenciaPorCentroCosto)
					 || (this.esRecargarFks && this.asistenciaporcentrocostoConstantesFunciones.cargarid_centro_costoAsistenciaPorCentroCosto)) {

					if(!this.asistenciaporcentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCentroCosto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);

						finalQueryGlobalCentroCosto=Funciones.GetFinalQueryAppend(finalQueryGlobalCentroCosto, "");
						finalQueryGlobalCentroCosto+=CentroCostoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCentroCostosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCentroCosto=" WHERE " + ConstantesSql.ID + "="+asistenciaporcentrocostoSessionBean.getlidCentroCostoActual();
					}
				} else {
					finalQueryGlobalCentroCosto="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.asistenciaporcentrocostoConstantesFunciones.cargarid_empleadoAsistenciaPorCentroCosto)
					 || (this.esRecargarFks && this.asistenciaporcentrocostoConstantesFunciones.cargarid_empleadoAsistenciaPorCentroCosto)) {

					if(!this.asistenciaporcentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+asistenciaporcentrocostoSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				asistenciaporcentrocostoReturnGeneral=asistenciaporcentrocostoLogic.cargarCombosLoteForeignKeyAsistenciaPorCentroCosto(finalQueryGlobalEmpresa,finalQueryGlobalCentroCosto,finalQueryGlobalEmpleado);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=asistenciaporcentrocostoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCentroCosto.equals("NONE")) {
				this.centrocostosForeignKey=asistenciaporcentrocostoReturnGeneral.getcentrocostosForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=asistenciaporcentrocostoReturnGeneral.getempleadosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyAsistenciaPorCentroCosto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCentroCosto();
			this.addItemDefectoCombosForeignKeyEmpleado();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.asistenciaporcentrocostoSessionBean==null) {
				this.asistenciaporcentrocostoSessionBean=new AsistenciaPorCentroCostoSessionBean();
			}

			if(!this.asistenciaporcentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyCentroCosto()throws Exception {
		try {

			if(!this.asistenciaporcentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
				CentroCosto centrocosto=new CentroCosto();
				CentroCostoConstantesFunciones.setCentroCostoDescripcion(centrocosto,Constantes.SMENSAJE_ESCOJA_OPCION);
				centrocosto.setId(null);

				if(!CentroCostoConstantesFunciones.ExisteEnLista(this.centrocostosForeignKey,centrocosto,true)) {

					this.centrocostosForeignKey.add(0,centrocosto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.asistenciaporcentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
	
	public void initActionsCombosTodosForeignKeyAsistenciaPorCentroCosto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyAsistenciaPorCentroCosto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyAsistenciaPorCentroCosto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.asistenciaporcentrocosto.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyAsistenciaPorCentroCosto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyAsistenciaPorCentroCosto(AsistenciaPorCentroCosto asistenciaporcentrocosto)throws Exception {	
		try {
			
			this.setActualCentroCostoForeignKey(asistenciaporcentrocosto.getid_centro_costo(),false,"Formulario");
			this.setActualEmpleadoForeignKey(asistenciaporcentrocosto.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyAsistenciaPorCentroCosto(AsistenciaPorCentroCosto asistenciaporcentrocosto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyAsistenciaPorCentroCosto()throws Exception {	
		try {
			
			this.setActualCentroCostoForeignKey(this.asistenciaporcentrocostoConstantesFunciones.getid_centro_costo(),false,"Formulario");
			this.setActualEmpleadoForeignKey(this.asistenciaporcentrocostoConstantesFunciones.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyAsistenciaPorCentroCosto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyAsistenciaPorCentroCosto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyAsistenciaPorCentroCosto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroAsistenciaPorCentroCosto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyAsistenciaPorCentroCosto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameCentroCostosForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyAsistenciaPorCentroCosto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCentroCostosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyAsistenciaPorCentroCosto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empresaAsistenciaPorCentroCosto!=null && this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empresaAsistenciaPorCentroCosto.getItemCount()>0) {
				this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empresaAsistenciaPorCentroCosto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_centro_costoAsistenciaPorCentroCosto!=null && this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_centro_costoAsistenciaPorCentroCosto.getItemCount()>0) {
				this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_centro_costoAsistenciaPorCentroCosto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empleadoAsistenciaPorCentroCosto!=null && this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empleadoAsistenciaPorCentroCosto.getItemCount()>0) {
				this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empleadoAsistenciaPorCentroCosto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public AsistenciaPorCentroCostoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public AsistenciaPorCentroCostoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public AsistenciaPorCentroCostoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.asistenciaporcentrocostoSessionBean=new AsistenciaPorCentroCostoSessionBean(); 
		this.asistenciaporcentrocostoConstantesFunciones=new AsistenciaPorCentroCostoConstantesFunciones(); 
		this.asistenciaporcentrocostoBean=new AsistenciaPorCentroCosto();//(this.asistenciaporcentrocostoConstantesFunciones); 		
		this.asistenciaporcentrocostoReturnGeneral=new AsistenciaPorCentroCostoParameterReturnGeneral(); 
		
		this.asistenciaporcentrocostoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.asistenciaporcentrocostoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public AsistenciaPorCentroCostoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public AsistenciaPorCentroCostoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public AsistenciaPorCentroCostoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessAsistenciaPorCentroCosto(true);
			
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
			
			this.asistenciaporcentrocostoConstantesFunciones=new AsistenciaPorCentroCostoConstantesFunciones(); 
			this.asistenciaporcentrocostoBean=new AsistenciaPorCentroCosto();//this.asistenciaporcentrocostoConstantesFunciones); 			
			this.asistenciaporcentrocostoReturnGeneral=new AsistenciaPorCentroCostoParameterReturnGeneral(); 
		
			AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Asistencia Por Centro Costo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.asistenciaporcentrocosto=new AsistenciaPorCentroCosto();
			this.asistenciaporcentrocostos = new ArrayList<AsistenciaPorCentroCosto>();
			this.asistenciaporcentrocostosAux = new ArrayList<AsistenciaPorCentroCosto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic=new AsistenciaPorCentroCostoLogic();
				this.asistenciaporcentrocostoLogic.getNewConnexionToDeep("");
			}
			
			//this.asistenciaporcentrocostoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.asistenciaporcentrocostoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormAsistenciaPorCentroCosto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto);	
					}
					
					if(this.jInternalFrameImportacionAsistenciaPorCentroCosto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAsistenciaPorCentroCosto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByAsistenciaPorCentroCosto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByAsistenciaPorCentroCosto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto);
				this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.setVisible(false);
				this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto);
					this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.setVisible(false);
					this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionAsistenciaPorCentroCosto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionAsistenciaPorCentroCosto);
					this.jInternalFrameImportacionAsistenciaPorCentroCosto.setVisible(false);
					this.jInternalFrameImportacionAsistenciaPorCentroCosto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByAsistenciaPorCentroCosto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByAsistenciaPorCentroCosto);
					this.jInternalFrameOrderByAsistenciaPorCentroCosto.setVisible(false);
					this.jInternalFrameOrderByAsistenciaPorCentroCosto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idAsistenciaPorCentroCostoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=AsistenciaPorCentroCostoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.asistenciaporcentrocostoReturnGeneral=new AsistenciaPorCentroCostoParameterReturnGeneral();
			
			this.asistenciaporcentrocostoParameterGeneral=new AsistenciaPorCentroCostoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.asistenciaporcentrocostoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(AsistenciaPorCentroCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AsistenciaPorCentroCostoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado(),this.asistenciaporcentrocostoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AsistenciaPorCentroCostoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado(),this.asistenciaporcentrocostoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaDuplicarAsistenciaPorCentroCosto=true;
			this.isVisibilidadCeldaCopiarAsistenciaPorCentroCosto=true;
			this.isVisibilidadCeldaVerFormAsistenciaPorCentroCosto=true;
			this.isVisibilidadCeldaOrdenAsistenciaPorCentroCosto=true;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaModificarAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaActualizarAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaEliminarAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaCancelarAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaGuardarAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaPorCentroCosto=false;
			
			
			this.isVisibilidadFK_IdCentroCosto=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesAsistenciaPorCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosAsistenciaPorCentroCosto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioAsistenciaPorCentroCosto(false);
			
			this.setPermisosUsuarioAsistenciaPorCentroCosto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado() 
				|| (this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado() && this.asistenciaporcentrocostoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioAsistenciaPorCentroCostoClasesRelacionadas();
			}
			
			if(this.asistenciaporcentrocostoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioAsistenciaPorCentroCostoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosAsistenciaPorCentroCosto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualAsistenciaPorCentroCosto();
			}
			
			if(!this.isPermisoBusquedaAsistenciaPorCentroCosto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioAsistenciaPorCentroCosto,this.isPermisoPaginacionMedioAsistenciaPorCentroCosto,this.isPermisoPaginacionTodoAsistenciaPorCentroCosto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(AsistenciaPorCentroCostoConstantesFunciones.getTiposSeleccionarAsistenciaPorCentroCosto());
				
				this.tiposColumnasSelect=AsistenciaPorCentroCostoConstantesFunciones.getTiposSeleccionarAsistenciaPorCentroCosto(true);
				
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
			//if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioAsistenciaPorCentroCosto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioAsistenciaPorCentroCosto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioAsistenciaPorCentroCosto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesAsistenciaPorCentroCosto() ;
			
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
			this.centrocostoLogic=new CentroCostoLogic();
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
				asistenciaporcentrocostoImplementable= (AsistenciaPorCentroCostoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AsistenciaPorCentroCostoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				asistenciaporcentrocostoImplementableHome= (AsistenciaPorCentroCostoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AsistenciaPorCentroCostoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.asistenciaporcentrocostos= new ArrayList<AsistenciaPorCentroCosto>();
			this.asistenciaporcentrocostosEliminados= new ArrayList<AsistenciaPorCentroCosto>();
						
			this.isEsNuevoAsistenciaPorCentroCosto=false;
			this.esParaAccionDesdeFormularioAsistenciaPorCentroCosto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.centrocostosForeignKey=new ArrayList<CentroCosto>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyAsistenciaPorCentroCosto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroAsistenciaPorCentroCosto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=AsistenciaPorCentroCostoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesAsistenciaPorCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingAsistenciaPorCentroCosto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioAsistenciaPorCentroCosto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioAsistenciaPorCentroCosto();
			}
			
			AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessAsistenciaPorCentroCosto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga AsistenciaPorCentroCosto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectAsistenciaPorCentroCosto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesAsistenciaPorCentroCosto")) {
				iIndex=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTabbedPaneRelacionesAsistenciaPorCentroCosto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTabbedPaneRelacionesAsistenciaPorCentroCosto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessAsistenciaPorCentroCosto();	
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
	
	public void cargarCombosForeignKeyAsistenciaPorCentroCosto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyAsistenciaPorCentroCosto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyAsistenciaPorCentroCosto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyAsistenciaPorCentroCostoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyAsistenciaPorCentroCosto();
		
		this.cargarCombosFrameForeignKeyAsistenciaPorCentroCosto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyAsistenciaPorCentroCosto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyAsistenciaPorCentroCosto();
		}
	}
	
	

	public void cargarCombosForeignKeyCentroCosto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCentroCostoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCentroCosto();
				this.cargarCombosFrameCentroCostosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCentroCosto(this.centrocostosForeignKey);

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
	
	public void jButtonNuevoAsistenciaPorCentroCostoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.asistenciaporcentrocostoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
			
			
			if(jTableDatosAsistenciaPorCentroCosto.getRowCount()>=1) {
				jTableDatosAsistenciaPorCentroCosto.removeRowSelectionInterval(0, jTableDatosAsistenciaPorCentroCosto.getRowCount()-1);						
			}
			
			this.isEsNuevoAsistenciaPorCentroCosto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoAsistenciaPorCentroCosto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesAsistenciaPorCentroCosto(true);			
			//this.asistenciaporcentrocosto=new AsistenciaPorCentroCosto();
			//this.asistenciaporcentrocosto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAsistenciaPorCentroCosto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAsistenciaPorCentroCosto() ;
			
			if(AsistenciaPorCentroCostoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAsistenciaPorCentroCosto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.asistenciaporcentrocosto);	
			this.actualizarInformacion("INFO_PADRE",false,this.asistenciaporcentrocosto);				
			
			AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
			
			if(this.asistenciaporcentrocostoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar AsistenciaPorCentroCosto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarAsistenciaPorCentroCostoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<AsistenciaPorCentroCosto> asistenciaporcentrocostosSeleccionados=new ArrayList<AsistenciaPorCentroCosto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosAsistenciaPorCentroCosto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosAsistenciaPorCentroCosto.getSelectedRows().length;			
			}
			
			asistenciaporcentrocostosSeleccionados=this.getAsistenciaPorCentroCostosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoAsistenciaPorCentroCosto--;			
				//AsistenciaPorCentroCosto asistenciaporcentrocostoAux= new AsistenciaPorCentroCosto();			
				//asistenciaporcentrocostoAux.setId(this.iIdNuevoAsistenciaPorCentroCosto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//AsistenciaPorCentroCosto asistenciaporcentrocostoOrigen=new AsistenciaPorCentroCosto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(AsistenciaPorCentroCosto asistenciaporcentrocostoOrigen : asistenciaporcentrocostosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							asistenciaporcentrocostoOrigen =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							asistenciaporcentrocostoOrigen =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaAsistenciaPorCentroCosto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.asistenciaporcentrocosto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosAsistenciaPorCentroCosto(asistenciaporcentrocostoOrigen,this.asistenciaporcentrocosto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().add(this.asistenciaporcentrocostoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.asistenciaporcentrocostos.add(this.asistenciaporcentrocostoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaAsistenciaPorCentroCosto(false);
				
				this.jTableDatosAsistenciaPorCentroCosto.setRowSelectionInterval(this.getIndiceNuevoAsistenciaPorCentroCosto(), this.getIndiceNuevoAsistenciaPorCentroCosto());
				
				int iLastRow =  this.jTableDatosAsistenciaPorCentroCosto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAsistenciaPorCentroCosto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAsistenciaPorCentroCosto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAsistenciaPorCentroCosto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<AsistenciaPorCentroCosto> asistenciaporcentrocostosSeleccionados=new ArrayList<AsistenciaPorCentroCosto>();									
		
			AsistenciaPorCentroCosto asistenciaporcentrocostoOrigen=new AsistenciaPorCentroCosto();
			AsistenciaPorCentroCosto asistenciaporcentrocostoDestino=new AsistenciaPorCentroCosto();
				
			asistenciaporcentrocostosSeleccionados=this.getAsistenciaPorCentroCostosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosAsistenciaPorCentroCosto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || asistenciaporcentrocostosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosAsistenciaPorCentroCosto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciaporcentrocostoOrigen =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						asistenciaporcentrocostoOrigen =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						asistenciaporcentrocostoDestino =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						asistenciaporcentrocostoDestino =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				asistenciaporcentrocostoOrigen =asistenciaporcentrocostosSeleccionados.get(0);
				asistenciaporcentrocostoDestino =asistenciaporcentrocostosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosAsistenciaPorCentroCosto(asistenciaporcentrocostoOrigen,asistenciaporcentrocostoDestino,true,false);
				
				asistenciaporcentrocostoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(asistenciaporcentrocostoDestino,asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(asistenciaporcentrocostoDestino,asistenciaporcentrocostos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaAsistenciaPorCentroCosto(false);
				
				//this.jTableDatosAsistenciaPorCentroCosto.setRowSelectionInterval(this.getIndiceNuevoAsistenciaPorCentroCosto(), this.getIndiceNuevoAsistenciaPorCentroCosto());
				
				int iLastRow =  this.jTableDatosAsistenciaPorCentroCosto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAsistenciaPorCentroCosto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAsistenciaPorCentroCosto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAsistenciaPorCentroCosto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesAsistenciaPorCentroCosto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesAsistenciaPorCentroCosto.setVisible(!isVisible);
			this.jPanelPaginacionAsistenciaPorCentroCosto.setVisible(!isVisible);
			this.jPanelAccionesAsistenciaPorCentroCosto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameAsistenciaPorCentroCosto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoAsistenciaPorCentroCosto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionAsistenciaPorCentroCosto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByAsistenciaPorCentroCosto();
			
			this.abrirFrameOrderByAsistenciaPorCentroCosto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByAsistenciaPorCentroCosto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleAsistenciaPorCentroCosto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormAsistenciaPorCentroCosto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.isMaximum()) {
					this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.setSize(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.iWidthFormulario,this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.isMaximum()) {
						this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jContentPaneDetalleAsistenciaPorCentroCosto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTabbedPaneRelacionesAsistenciaPorCentroCosto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jContentPaneDetalleAsistenciaPorCentroCosto.getWidth(),AsistenciaPorCentroCostoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTabbedPaneRelacionesAsistenciaPorCentroCosto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jContentPaneDetalleAsistenciaPorCentroCosto.getWidth(),AsistenciaPorCentroCostoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTabbedPaneRelacionesAsistenciaPorCentroCosto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jContentPaneDetalleAsistenciaPorCentroCosto.getWidth(),AsistenciaPorCentroCostoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.setVisible(true);
	        this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByAsistenciaPorCentroCosto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByAsistenciaPorCentroCosto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByAsistenciaPorCentroCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAsistenciaPorCentroCosto,false,this);
				} else {
					this.jInternalFrameOrderByAsistenciaPorCentroCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAsistenciaPorCentroCosto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByAsistenciaPorCentroCosto);
				this.jInternalFrameOrderByAsistenciaPorCentroCosto.setVisible(false);
				this.jInternalFrameOrderByAsistenciaPorCentroCosto.setSelected(false);
				
				this.jInternalFrameOrderByAsistenciaPorCentroCosto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAsistenciaPorCentroCosto"));
				
				this.inicializarActualizarBindingTablaOrderByAsistenciaPorCentroCosto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionAsistenciaPorCentroCosto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionAsistenciaPorCentroCosto==null) {
				
				this.jInternalFrameImportacionAsistenciaPorCentroCosto=new ImportacionJInternalFrame(AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAsistenciaPorCentroCosto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionAsistenciaPorCentroCosto);
				this.jInternalFrameImportacionAsistenciaPorCentroCosto.setVisible(false);
				this.jInternalFrameImportacionAsistenciaPorCentroCosto.setSelected(false);


				this.jInternalFrameImportacionAsistenciaPorCentroCosto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAsistenciaPorCentroCosto"));
				this.jInternalFrameImportacionAsistenciaPorCentroCosto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAsistenciaPorCentroCosto"));
				this.jInternalFrameImportacionAsistenciaPorCentroCosto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAsistenciaPorCentroCosto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoAsistenciaPorCentroCosto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto==null) {
				this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto=new ReporteDinamicoJInternalFrame(AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto);
				this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.setVisible(false);
				this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAsistenciaPorCentroCosto"));
				this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAsistenciaPorCentroCosto"));
				this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAsistenciaPorCentroCosto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAsistenciaPorCentroCosto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleAsistenciaPorCentroCosto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormAsistenciaPorCentroCosto);
			
	       	this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.setVisible(false);
	        this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.setSelected(false);
			
			//this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.dispose();
			//this.jInternalFrameDetalleFormAsistenciaPorCentroCosto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoAsistenciaPorCentroCosto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.setVisible(true);
	        this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionAsistenciaPorCentroCosto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionAsistenciaPorCentroCosto.setVisible(true);
	        this.jInternalFrameImportacionAsistenciaPorCentroCosto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByAsistenciaPorCentroCosto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByAsistenciaPorCentroCosto.setVisible(true);
	        this.jInternalFrameOrderByAsistenciaPorCentroCosto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByAsistenciaPorCentroCosto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByAsistenciaPorCentroCosto.setVisible(false);
	        this.jInternalFrameOrderByAsistenciaPorCentroCosto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoAsistenciaPorCentroCosto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.setVisible(false);
	        this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionAsistenciaPorCentroCosto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionAsistenciaPorCentroCosto.setVisible(false);
	        this.jInternalFrameImportacionAsistenciaPorCentroCosto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeCentroCosto(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCentroCosto);
						CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.sTipoBusqueda="CentroCosto";
						}

						centrocostoBeanSwingJInternalFrame.getTodosCentroCostoArbol();
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setCentroCostos(centrocostoBeanSwingJInternalFrame.centrocostosArbol);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.CargarTreeCentroCosto();
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setVisible(true);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.jInternalFrameParent=this;
						TitledBorder titledBorderAsistenciaPorCentroCosto=(TitledBorder)this.jScrollPanelDatosAsistenciaPorCentroCosto.getBorder();
						TitledBorder titledBorderCentroCosto=(TitledBorder)centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

						titledBorderCentroCosto.setTitle(titledBorderAsistenciaPorCentroCosto.getTitle() + " -> Centro Costo");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,centrocostoBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(centrocostoBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCentroCosto(CentroCostoBeanSwingJInternalFrame jInternalFrameTreeCentroCosto) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCentroCosto);
						jInternalFrameTreeCentroCosto.setVisible(false);
						jInternalFrameTreeCentroCosto.setSelected(false);
						//jInternalFrameTreeCentroCosto.dispose();
						//jInternalFrameTreeCentroCosto=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarAsistenciaPorCentroCosto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarAsistenciaPorCentroCosto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesAsistenciaPorCentroCosto(true);
			//this.isEsNuevoAsistenciaPorCentroCosto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesAsistenciaPorCentroCosto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAsistenciaPorCentroCosto(false) ;
			
			if(asistenciaporcentrocostoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(AsistenciaPorCentroCostoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAsistenciaPorCentroCosto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAsistenciaPorCentroCosto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaAsistenciaPorCentroCostoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarAsistenciaPorCentroCosto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesAsistenciaPorCentroCosto(true);
			//this.isEsNuevoAsistenciaPorCentroCosto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.asistenciaporcentrocosto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesAsistenciaPorCentroCosto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesAsistenciaPorCentroCosto(false) ;
			
			if(AsistenciaPorCentroCostoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAsistenciaPorCentroCosto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAsistenciaPorCentroCosto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCentroCosto(List<CentroCosto> centrocostosForeignKey)throws Exception{
		TableColumn tableColumnCentroCosto=this.jTableDatosAsistenciaPorCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaPorCentroCosto,AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO));
		TableCellEditor tableCellEditorCentroCosto =tableColumnCentroCosto.getCellEditor();

		CentroCostoTableCell centrocostoTableCellFk=(CentroCostoTableCell)tableCellEditorCentroCosto;

		if(centrocostoTableCellFk!=null) {
			centrocostoTableCellFk.setcentrocostosForeignKey(centrocostosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//centrocostoTableCellFk.setRowActual(intSelectedRow);
			//centrocostoTableCellFk.setcentrocostosForeignKeyActual(centrocostosForeignKey);
		//}


		if(centrocostoTableCellFk!=null) {
			centrocostoTableCellFk.RecargarCentroCostosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosAsistenciaPorCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaPorCentroCosto,AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesAsistenciaPorCentroCosto(false);
			
			//if(!this.isEsNuevoAsistenciaPorCentroCosto) {								
				int intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.asistenciaporcentrocosto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
				
			}
			
			if(this.permiteMantenimiento(this.asistenciaporcentrocosto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoAsistenciaPorCentroCosto=true;
					this.inicializarActualizarBindingTablaAsistenciaPorCentroCosto(false);
					this.isEsNuevoAsistenciaPorCentroCosto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoAsistenciaPorCentroCosto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoAsistenciaPorCentroCosto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAsistenciaPorCentroCosto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAsistenciaPorCentroCosto(false);
				
				this.habilitarDeshabilitarControlesAsistenciaPorCentroCosto(false);
			
												
				
				if(AsistenciaPorCentroCostoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleAsistenciaPorCentroCosto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoAsistenciaPorCentroCostoActionPerformed(evt,asistenciaporcentrocostoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualAsistenciaPorCentroCosto(this.asistenciaporcentrocosto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosAsistenciaPorCentroCosto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,asistenciaporcentrocostoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.asistenciaporcentrocosto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(AsistenciaPorCentroCosto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaPorCentroCosto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				this.asistenciaporcentrocosto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				this.asistenciaporcentrocosto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.asistenciaporcentrocosto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((AsistenciaPorCentroCostoModel) this.jTableDatosAsistenciaPorCentroCosto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoAsistenciaPorCentroCosto=true;
				this.inicializarActualizarBindingTablaAsistenciaPorCentroCosto(false);
				this.isEsNuevoAsistenciaPorCentroCosto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAsistenciaPorCentroCosto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAsistenciaPorCentroCosto(false);
				
				this.habilitarDeshabilitarControlesAsistenciaPorCentroCosto(false);
				
				
				
				if(AsistenciaPorCentroCostoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleAsistenciaPorCentroCosto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosAsistenciaPorCentroCosto.getRowCount()>=1) {
				jTableDatosAsistenciaPorCentroCosto.removeRowSelectionInterval(0, jTableDatosAsistenciaPorCentroCosto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesAsistenciaPorCentroCosto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaAsistenciaPorCentroCosto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAsistenciaPorCentroCosto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAsistenciaPorCentroCosto(false) ;
			
			this.isEsNuevoAsistenciaPorCentroCosto=false;
			
			if(AsistenciaPorCentroCostoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleAsistenciaPorCentroCosto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingAsistenciaPorCentroCosto(false);
				
				//SI ES MANUAL
				if(AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualAsistenciaPorCentroCosto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoAsistenciaPorCentroCosto--;			
			//AsistenciaPorCentroCosto asistenciaporcentrocostoAux= new AsistenciaPorCentroCosto();			
			//asistenciaporcentrocostoAux.setId(this.iIdNuevoAsistenciaPorCentroCosto);
			
			if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaAsistenciaPorCentroCosto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
			
			this.asistenciaporcentrocosto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().add(this.asistenciaporcentrocostoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.asistenciaporcentrocostos.add(this.asistenciaporcentrocostoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaAsistenciaPorCentroCosto(false);
			
			this.jTableDatosAsistenciaPorCentroCosto.setRowSelectionInterval(this.getIndiceNuevoAsistenciaPorCentroCosto(), this.getIndiceNuevoAsistenciaPorCentroCosto());
			
			int iLastRow =  this.jTableDatosAsistenciaPorCentroCosto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosAsistenciaPorCentroCosto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosAsistenciaPorCentroCosto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaAsistenciaPorCentroCosto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingAsistenciaPorCentroCosto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAsistenciaPorCentroCosto(false);
			
			//SI ES MANUAL
			if(AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAsistenciaPorCentroCosto();
			}
			
			//this.abrirFrameTreeAsistenciaPorCentroCosto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Asistencia Por Centro CostoS ?", "MANTENIMIENTO DE Asistencia Por Centro Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionAsistenciaPorCentroCosto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralAsistenciaPorCentroCosto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.asistenciaporcentrocostoReturnGeneral=asistenciaporcentrocostoLogic.procesarImportacionAsistenciaPorCentroCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.asistenciaporcentrocostoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarAsistenciaPorCentroCostoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionAsistenciaPorCentroCosto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionAsistenciaPorCentroCosto.setFileImportacion(this.jInternalFrameImportacionAsistenciaPorCentroCosto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionAsistenciaPorCentroCosto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionAsistenciaPorCentroCosto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionAsistenciaPorCentroCosto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionAsistenciaPorCentroCosto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<AsistenciaPorCentroCosto> asistenciaporcentrocostosSeleccionados=new ArrayList<AsistenciaPorCentroCosto>();		

		asistenciaporcentrocostosSeleccionados=this.getAsistenciaPorCentroCostosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("AsistenciaPorCentroCostoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"AsistenciaPorCentroCostoBaseDesign.jrxml";
			
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
			
			this.generarReporteAsistenciaPorCentroCostos("Todos",asistenciaporcentrocostosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Por Centro Costo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CentroCosto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CentroCosto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CentroCosto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CentroCosto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_VALORHORA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorHora_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorHora_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorHora_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorHora_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_PERMISO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rmiso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rmiso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rmiso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rmiso_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoria="id_centro_costo";
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_VALORHORA:
					sNombreCampoCategoria="valor_hora";
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_PERMISO:
					sNombreCampoCategoria="permiso";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoriaValor="id_centro_costo";
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_VALORHORA:
					sNombreCampoCategoriaValor="valor_hora";
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_PERMISO:
					sNombreCampoCategoriaValor="permiso";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Centro Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_centro_costo");
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_VALORHORA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Hora",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_hora");
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_PERMISO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Permiso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"permiso");
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
	
	public void jButtonGenerarExcelReporteDinamicoAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<AsistenciaPorCentroCosto> asistenciaporcentrocostosSeleccionados=new ArrayList<AsistenciaPorCentroCosto>();		
		
		asistenciaporcentrocostosSeleccionados=this.getAsistenciaPorCentroCostosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"asistenciaporcentrocosto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("AsistenciaPorCentroCostos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(AsistenciaPorCentroCosto asistenciaporcentrocosto:asistenciaporcentrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciaporcentrocosto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO);
					iRow++;

					for(AsistenciaPorCentroCosto asistenciaporcentrocosto:asistenciaporcentrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciaporcentrocosto.getcentrocosto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(AsistenciaPorCentroCosto asistenciaporcentrocosto:asistenciaporcentrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciaporcentrocosto.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(AsistenciaPorCentroCosto asistenciaporcentrocosto:asistenciaporcentrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciaporcentrocosto.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(AsistenciaPorCentroCosto asistenciaporcentrocosto:asistenciaporcentrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciaporcentrocosto.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_VALORHORA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.LABEL_VALORHORA);
					iRow++;

					for(AsistenciaPorCentroCosto asistenciaporcentrocosto:asistenciaporcentrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciaporcentrocosto.getvalor_hora());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AsistenciaPorCentroCostoConstantesFunciones.LABEL_PERMISO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.LABEL_PERMISO);
					iRow++;

					for(AsistenciaPorCentroCosto asistenciaporcentrocosto:asistenciaporcentrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(asistenciaporcentrocosto.getpermiso());
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
			//	this.getFilaCabeceraExportarExcelAsistenciaPorCentroCosto(row);				
			//	iRow++;
			//}				
			
			//for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:asistenciaporcentrocostosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelAsistenciaPorCentroCosto(asistenciaporcentrocostoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Por Centro Costo",JOptionPane.INFORMATION_MESSAGE);
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
				this.asistenciaporcentrocostoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAsistenciaPorCentroCosto(false);
			
			//SI ES MANUAL
			if(AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAsistenciaPorCentroCosto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAsistenciaPorCentroCosto(false);
			
			//SI ES MANUAL
			if(AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAsistenciaPorCentroCosto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAsistenciaPorCentroCosto(false);
			
			//SI ES MANUAL
			if(AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAsistenciaPorCentroCosto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaAsistenciaPorCentroCosto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosAsistenciaPorCentroCosto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosAsistenciaPorCentroCosto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosAsistenciaPorCentroCosto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosAsistenciaPorCentroCosto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosAsistenciaPorCentroCosto.setMinimumSize(dimensionMinimum);
		this.jTableDatosAsistenciaPorCentroCosto.setMaximumSize(dimensionMaximum);
		this.jTableDatosAsistenciaPorCentroCosto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingAsistenciaPorCentroCosto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingAsistenciaPorCentroCosto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingAsistenciaPorCentroCosto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaAsistenciaPorCentroCosto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesAsistenciaPorCentroCosto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasAsistenciaPorCentroCosto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAsistenciaPorCentroCosto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesAsistenciaPorCentroCosto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualAsistenciaPorCentroCosto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaAsistenciaPorCentroCosto();
		
		this.inicializarActualizarBindingBotonesManualAsistenciaPorCentroCosto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualAsistenciaPorCentroCosto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAsistenciaPorCentroCosto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualAsistenciaPorCentroCosto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualAsistenciaPorCentroCosto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosAsistenciaPorCentroCosto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosAsistenciaPorCentroCosto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteAsistenciaPorCentroCosto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jCheckBoxPostAccionNuevoAsistenciaPorCentroCosto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jCheckBoxPostAccionSinCerrarAsistenciaPorCentroCosto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jCheckBoxPostAccionSinMensajeAsistenciaPorCentroCosto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosAsistenciaPorCentroCosto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosAsistenciaPorCentroCosto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteAsistenciaPorCentroCosto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
				this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jCheckBoxPostAccionNuevoAsistenciaPorCentroCosto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jCheckBoxPostAccionSinCerrarAsistenciaPorCentroCosto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jCheckBoxPostAccionSinMensajeAsistenciaPorCentroCosto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionAsistenciaPorCentroCosto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionAsistenciaPorCentroCosto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesAsistenciaPorCentroCosto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesAsistenciaPorCentroCosto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarAsistenciaPorCentroCosto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesAsistenciaPorCentroCosto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesAsistenciaPorCentroCosto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralAsistenciaPorCentroCosto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesAsistenciaPorCentroCosto(Boolean esInicializar) throws Exception {
		try	{	
			if(AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualAsistenciaPorCentroCosto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesAsistenciaPorCentroCosto() throws Exception {
		try	{
			if(AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualAsistenciaPorCentroCosto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAsistenciaPorCentroCosto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualAsistenciaPorCentroCosto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesAsistenciaPorCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesAsistenciaPorCentroCosto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesAsistenciaPorCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesAsistenciaPorCentroCosto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesAsistenciaPorCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesAsistenciaPorCentroCosto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionAsistenciaPorCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionAsistenciaPorCentroCosto.addItem(reporte);
			}
			
			
			if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionAsistenciaPorCentroCosto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionAsistenciaPorCentroCosto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesAsistenciaPorCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesAsistenciaPorCentroCosto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarAsistenciaPorCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarAsistenciaPorCentroCosto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarAsistenciaPorCentroCosto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAsistenciaPorCentroCosto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAsistenciaPorCentroCosto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto!=null) {
				this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto!=null) {
				this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto!=null) {
				
				if(this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=AsistenciaPorCentroCostoConstantesFunciones.getTiposSeleccionarAsistenciaPorCentroCosto(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=AsistenciaPorCentroCostoConstantesFunciones.getTiposSeleccionarAsistenciaPorCentroCosto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=AsistenciaPorCentroCostoConstantesFunciones.getTiposSeleccionarAsistenciaPorCentroCosto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualAsistenciaPorCentroCosto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto.getSelectedItem()!=null){this.id_centro_costoFK_IdCentroCosto=((CentroCosto)this.jComboBoxid_centro_costoFK_IdCentroCostoAsistenciaPorCentroCosto.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoAsistenciaPorCentroCosto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasAsistenciaPorCentroCosto(Boolean esInicializar) throws Exception {				
		if(AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualAsistenciaPorCentroCosto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaAsistenciaPorCentroCosto() throws Exception {
		this.inicializarActualizarBindingTablaAsistenciaPorCentroCosto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByAsistenciaPorCentroCosto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByAsistenciaPorCentroCosto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByAsistenciaPorCentroCosto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAsistenciaPorCentroCosto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new AsistenciaPorCentroCostoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByAsistenciaPorCentroCosto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAsistenciaPorCentroCosto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new AsistenciaPorCentroCostoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosAsistenciaPorCentroCostoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaPorCentroCostoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new AsistenciaPorCentroCostoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByAsistenciaPorCentroCosto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAsistenciaPorCentroCosto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new AsistenciaPorCentroCostoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByAsistenciaPorCentroCosto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaAsistenciaPorCentroCosto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=asistenciaporcentrocostos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosAsistenciaPorCentroCosto.setModel(new AsistenciaPorCentroCostoModel(this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosAsistenciaPorCentroCosto.setModel(new AsistenciaPorCentroCostoModel(this.asistenciaporcentrocostos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByAsistenciaPorCentroCosto!=null && this.jInternalFrameOrderByAsistenciaPorCentroCosto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByAsistenciaPorCentroCosto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosAsistenciaPorCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaPorCentroCosto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new AsistenciaPorCentroCostoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO,asistenciaporcentrocostoConstantesFunciones.resaltarSeleccionarAsistenciaPorCentroCosto,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+AsistenciaPorCentroCostoConstantesFunciones.SCLASSWEBTITULO,asistenciaporcentrocostoConstantesFunciones.resaltarSeleccionarAsistenciaPorCentroCosto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosAsistenciaPorCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaPorCentroCosto,AsistenciaPorCentroCostoConstantesFunciones.LABEL_ID));

		if(this.asistenciaporcentrocostoConstantesFunciones.mostraridAsistenciaPorCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaPorCentroCostoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciaporcentrocostoConstantesFunciones.resaltaridAsistenciaPorCentroCosto,this.asistenciaporcentrocostoConstantesFunciones.activaridAsistenciaPorCentroCosto,iSizeTabla,this,true,"idAsistenciaPorCentroCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciaporcentrocostoConstantesFunciones.resaltaridAsistenciaPorCentroCosto,this.asistenciaporcentrocostoConstantesFunciones.activaridAsistenciaPorCentroCosto,this,true,"idAsistenciaPorCentroCosto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaPorCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaPorCentroCosto,AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.asistenciaporcentrocostoConstantesFunciones.mostrarid_empresaAsistenciaPorCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.asistenciaporcentrocostoConstantesFunciones.resaltarid_empresaAsistenciaPorCentroCosto,this,this.asistenciaporcentrocostoConstantesFunciones.activarid_empresaAsistenciaPorCentroCosto,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.asistenciaporcentrocostoConstantesFunciones.resaltarid_empresaAsistenciaPorCentroCosto,this,this.asistenciaporcentrocostoConstantesFunciones.activarid_empresaAsistenciaPorCentroCosto,false,"id_empresaAsistenciaPorCentroCosto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AsistenciaPorCentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaPorCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaPorCentroCosto,AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO));

		if(this.asistenciaporcentrocostoConstantesFunciones.mostrarid_centro_costoAsistenciaPorCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CentroCostoTableCell(this.centrocostosForeignKey,this.asistenciaporcentrocostoConstantesFunciones.resaltarid_centro_costoAsistenciaPorCentroCosto,this,this.asistenciaporcentrocostoConstantesFunciones.activarid_centro_costoAsistenciaPorCentroCosto,iSizeTabla));
			tableColumn.setCellEditor(new CentroCostoTableCell(this.centrocostosForeignKey,this.asistenciaporcentrocostoConstantesFunciones.resaltarid_centro_costoAsistenciaPorCentroCosto,this,this.asistenciaporcentrocostoConstantesFunciones.activarid_centro_costoAsistenciaPorCentroCosto,true,"id_centro_costoAsistenciaPorCentroCosto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AsistenciaPorCentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaPorCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaPorCentroCosto,AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.asistenciaporcentrocostoConstantesFunciones.mostrarid_empleadoAsistenciaPorCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.asistenciaporcentrocostoConstantesFunciones.resaltarid_empleadoAsistenciaPorCentroCosto,this,this.asistenciaporcentrocostoConstantesFunciones.activarid_empleadoAsistenciaPorCentroCosto,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.asistenciaporcentrocostoConstantesFunciones.resaltarid_empleadoAsistenciaPorCentroCosto,this,this.asistenciaporcentrocostoConstantesFunciones.activarid_empleadoAsistenciaPorCentroCosto,true,"id_empleadoAsistenciaPorCentroCosto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new AsistenciaPorCentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaPorCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaPorCentroCosto,AsistenciaPorCentroCostoConstantesFunciones.LABEL_FECHA));

		if(this.asistenciaporcentrocostoConstantesFunciones.mostrarfechaAsistenciaPorCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaPorCentroCostoConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.asistenciaporcentrocostoConstantesFunciones.resaltarfechaAsistenciaPorCentroCosto,this.asistenciaporcentrocostoConstantesFunciones.activarfechaAsistenciaPorCentroCosto,iSizeTabla,this,true,"fechaAsistenciaPorCentroCosto","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.asistenciaporcentrocostoConstantesFunciones.resaltarfechaAsistenciaPorCentroCosto,this.asistenciaporcentrocostoConstantesFunciones.activarfechaAsistenciaPorCentroCosto,this,true,"fechaAsistenciaPorCentroCosto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new AsistenciaPorCentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaPorCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaPorCentroCosto,AsistenciaPorCentroCostoConstantesFunciones.LABEL_PORCENTAJE));

		if(this.asistenciaporcentrocostoConstantesFunciones.mostrarporcentajeAsistenciaPorCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaPorCentroCostoConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciaporcentrocostoConstantesFunciones.resaltarporcentajeAsistenciaPorCentroCosto,this.asistenciaporcentrocostoConstantesFunciones.activarporcentajeAsistenciaPorCentroCosto,iSizeTabla,this,true,"porcentajeAsistenciaPorCentroCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciaporcentrocostoConstantesFunciones.resaltarporcentajeAsistenciaPorCentroCosto,this.asistenciaporcentrocostoConstantesFunciones.activarporcentajeAsistenciaPorCentroCosto,this,true,"porcentajeAsistenciaPorCentroCosto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaPorCentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaPorCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaPorCentroCosto,AsistenciaPorCentroCostoConstantesFunciones.LABEL_VALORHORA));

		if(this.asistenciaporcentrocostoConstantesFunciones.mostrarvalor_horaAsistenciaPorCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaPorCentroCostoConstantesFunciones.LABEL_VALORHORA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciaporcentrocostoConstantesFunciones.resaltarvalor_horaAsistenciaPorCentroCosto,this.asistenciaporcentrocostoConstantesFunciones.activarvalor_horaAsistenciaPorCentroCosto,iSizeTabla,this,true,"valor_horaAsistenciaPorCentroCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciaporcentrocostoConstantesFunciones.resaltarvalor_horaAsistenciaPorCentroCosto,this.asistenciaporcentrocostoConstantesFunciones.activarvalor_horaAsistenciaPorCentroCosto,this,true,"valor_horaAsistenciaPorCentroCosto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaPorCentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAsistenciaPorCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaPorCentroCosto,AsistenciaPorCentroCostoConstantesFunciones.LABEL_PERMISO));

		if(this.asistenciaporcentrocostoConstantesFunciones.mostrarpermisoAsistenciaPorCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AsistenciaPorCentroCostoConstantesFunciones.LABEL_PERMISO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.asistenciaporcentrocostoConstantesFunciones.resaltarpermisoAsistenciaPorCentroCosto,this.asistenciaporcentrocostoConstantesFunciones.activarpermisoAsistenciaPorCentroCosto,iSizeTabla,this,true,"permisoAsistenciaPorCentroCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.asistenciaporcentrocostoConstantesFunciones.resaltarpermisoAsistenciaPorCentroCosto,this.asistenciaporcentrocostoConstantesFunciones.activarpermisoAsistenciaPorCentroCosto,this,true,"permisoAsistenciaPorCentroCosto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AsistenciaPorCentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAsistenciaPorCentroCosto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAsistenciaPorCentroCosto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarAsistenciaPorCentroCosto && this.isPermisoGuardarCambiosAsistenciaPorCentroCosto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosAsistenciaPorCentroCosto.addColumn(tableColumn);
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
			
			this.jTableDatosAsistenciaPorCentroCosto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAsistenciaPorCentroCosto && this.isPermisoGuardarCambiosAsistenciaPorCentroCosto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAsistenciaPorCentroCosto && this.isPermisoGuardarCambiosAsistenciaPorCentroCosto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosAsistenciaPorCentroCosto.moveColumn(this.jTableDatosAsistenciaPorCentroCosto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosAsistenciaPorCentroCosto.moveColumn(this.jTableDatosAsistenciaPorCentroCosto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosAsistenciaPorCentroCosto.moveColumn(this.jTableDatosAsistenciaPorCentroCosto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosAsistenciaPorCentroCosto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosAsistenciaPorCentroCosto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosAsistenciaPorCentroCosto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosAsistenciaPorCentroCosto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosAsistenciaPorCentroCosto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosAsistenciaPorCentroCosto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosAsistenciaPorCentroCosto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosAsistenciaPorCentroCosto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=asistenciaporcentrocostos.size()-1;
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
		//this.jTableDatosAsistenciaPorCentroCosto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosAsistenciaPorCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosAsistenciaPorCentroCosto();
			
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
				
				//this.isEsNuevoAsistenciaPorCentroCosto=false;
					
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
			
				if(this.asistenciaporcentrocostoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAsistenciaPorCentroCosto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.asistenciaporcentrocosto.getsType().equals("DUPLICADO")
				   || this.asistenciaporcentrocosto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoAsistenciaPorCentroCosto=true;
				
				} else {
					this.isEsNuevoAsistenciaPorCentroCosto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
					if(this.asistenciaporcentrocosto.getId()>=0 && !this.asistenciaporcentrocosto.getIsNew()) {						
						this.isEsNuevoAsistenciaPorCentroCosto=false;
						
					} else {
						this.isEsNuevoAsistenciaPorCentroCosto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoAsistenciaPorCentroCosto(esRelaciones);						
				
				this.seleccionarAsistenciaPorCentroCosto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.asistenciaporcentrocosto.getId()<0) {
					this.isEsNuevoAsistenciaPorCentroCosto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarAsistenciaPorCentroCosto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarAsistenciaPorCentroCosto(evt,rowIndex);
				}	
				
				if(this.asistenciaporcentrocostoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion AsistenciaPorCentroCosto: " + this.dDif); 
					}
				}								
				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarAsistenciaPorCentroCosto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.asistenciaporcentrocosto)) {
					if(this.asistenciaporcentrocosto.getId()>0) {
						this.asistenciaporcentrocosto.setIsDeleted(true);
						
						this.asistenciaporcentrocostosEliminados.add(this.asistenciaporcentrocosto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().remove(this.asistenciaporcentrocosto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.asistenciaporcentrocostos.remove(this.asistenciaporcentrocosto);				
					}
					
					
					((AsistenciaPorCentroCostoModel) this.jTableDatosAsistenciaPorCentroCosto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaAsistenciaPorCentroCosto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarAsistenciaPorCentroCosto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoAsistenciaPorCentroCosto) {
			
			if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAsistenciaPorCentroCosto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.asistenciaporcentrocostoConstantesFunciones.cargarid_empresaAsistenciaPorCentroCosto || this.asistenciaporcentrocostoConstantesFunciones.event_dependid_empresaAsistenciaPorCentroCosto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.asistenciaporcentrocosto.getid_empresa());
									//this.inicializarActualizarBindingAsistenciaPorCentroCosto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(asistenciaporcentrocosto.getEmpresa()!=null) {
							this.empresasForeignKey.add(asistenciaporcentrocosto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.asistenciaporcentrocosto.getid_empresa(),false,"Formulario");

					//CentroCosto
					if(!this.asistenciaporcentrocostoConstantesFunciones.cargarid_centro_costoAsistenciaPorCentroCosto || this.asistenciaporcentrocostoConstantesFunciones.event_dependid_centro_costoAsistenciaPorCentroCosto) {
						//this.cargarCombosCentroCostosForeignKeyLista(" where id="+this.asistenciaporcentrocosto.getid_centro_costo());
									//this.inicializarActualizarBindingAsistenciaPorCentroCosto(false,false);
						this.centrocostosForeignKey=new ArrayList<CentroCosto>();

						if(asistenciaporcentrocosto.getCentroCosto()!=null) {
							this.centrocostosForeignKey.add(asistenciaporcentrocosto.getCentroCosto());
						}

						this.addItemDefectoCombosForeignKeyCentroCosto();
						this.cargarCombosFrameCentroCostosForeignKey("Todos");
					}
					this.setActualCentroCostoForeignKey(this.asistenciaporcentrocosto.getid_centro_costo(),false,"Formulario");

					//Empleado
					if(!this.asistenciaporcentrocostoConstantesFunciones.cargarid_empleadoAsistenciaPorCentroCosto || this.asistenciaporcentrocostoConstantesFunciones.event_dependid_empleadoAsistenciaPorCentroCosto) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.asistenciaporcentrocosto.getid_empleado());
									//this.inicializarActualizarBindingAsistenciaPorCentroCosto(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(asistenciaporcentrocosto.getEmpleado()!=null) {
							this.empleadosForeignKey.add(asistenciaporcentrocosto.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.asistenciaporcentrocosto.getid_empleado(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesAsistenciaPorCentroCosto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesAsistenciaPorCentroCosto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAsistenciaPorCentroCosto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoAsistenciaPorCentroCosto(AsistenciaPorCentroCosto asistenciaporcentrocosto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoAsistenciaPorCentroCosto(asistenciaporcentrocosto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoAsistenciaPorCentroCosto(AsistenciaPorCentroCosto asistenciaporcentrocosto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioAsistenciaPorCentroCosto(asistenciaporcentrocosto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyAsistenciaPorCentroCosto(asistenciaporcentrocosto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyAsistenciaPorCentroCosto(asistenciaporcentrocosto);
	}
	
	public void setVariablesObjetoActualToFormularioAsistenciaPorCentroCosto(AsistenciaPorCentroCosto asistenciaporcentrocosto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelidAsistenciaPorCentroCosto.setText(asistenciaporcentrocosto.getId().toString());
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jDateChooserfechaAsistenciaPorCentroCosto.setDate(asistenciaporcentrocosto.getfecha());
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldporcentajeAsistenciaPorCentroCosto.setText(asistenciaporcentrocosto.getporcentaje().toString());
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldvalor_horaAsistenciaPorCentroCosto.setText(asistenciaporcentrocosto.getvalor_hora().toString());
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldpermisoAsistenciaPorCentroCosto.setText(asistenciaporcentrocosto.getpermiso().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,AsistenciaPorCentroCosto asistenciaporcentrocostoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,asistenciaporcentrocostoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,AsistenciaPorCentroCosto asistenciaporcentrocostoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				asistenciaporcentrocostoLocal=this.asistenciaporcentrocosto;
			} else {
				asistenciaporcentrocostoLocal=this.asistenciaporcentrocostoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(asistenciaporcentrocostoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoAsistenciaPorCentroCosto(asistenciaporcentrocostoLocal,true);
					
					if(asistenciaporcentrocostoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(asistenciaporcentrocostoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(asistenciaporcentrocostoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoAsistenciaPorCentroCosto(AsistenciaPorCentroCosto asistenciaporcentrocosto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(asistenciaporcentrocosto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(asistenciaporcentrocosto);
	}
	
	public void setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(AsistenciaPorCentroCosto asistenciaporcentrocosto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(asistenciaporcentrocosto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(AsistenciaPorCentroCosto asistenciaporcentrocosto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelidAsistenciaPorCentroCosto.getText()==null || this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelidAsistenciaPorCentroCosto.getText()=="" || this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelidAsistenciaPorCentroCosto.getText()=="Id") {
				this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelidAsistenciaPorCentroCosto.setText("0");
			}

			if(conColumnasBase) {asistenciaporcentrocosto.setId(Long.parseLong(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelidAsistenciaPorCentroCosto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaPorCentroCostoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelIdAsistenciaPorCentroCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciaporcentrocosto.setfecha(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jDateChooserfechaAsistenciaPorCentroCosto.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaPorCentroCostoConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelfechaAsistenciaPorCentroCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciaporcentrocosto.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldporcentajeAsistenciaPorCentroCosto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaPorCentroCostoConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelporcentajeAsistenciaPorCentroCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciaporcentrocosto.setvalor_hora(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldvalor_horaAsistenciaPorCentroCosto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaPorCentroCostoConstantesFunciones.LABEL_VALORHORA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelvalor_horaAsistenciaPorCentroCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			asistenciaporcentrocosto.setpermiso(Double.parseDouble(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldpermisoAsistenciaPorCentroCosto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AsistenciaPorCentroCostoConstantesFunciones.LABEL_PERMISO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelpermisoAsistenciaPorCentroCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAsistenciaPorCentroCosto(AsistenciaPorCentroCosto asistenciaporcentrocostoBean,AsistenciaPorCentroCosto asistenciaporcentrocosto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && asistenciaporcentrocostoBean.getid_centro_costo()!=null && !asistenciaporcentrocostoBean.getid_centro_costo().equals(null))) {asistenciaporcentrocosto.setid_centro_costo(asistenciaporcentrocostoBean.getid_centro_costo());}
			if(conDefault || (!conDefault && asistenciaporcentrocostoBean.getid_empleado()!=null && !asistenciaporcentrocostoBean.getid_empleado().equals(-1L))) {asistenciaporcentrocosto.setid_empleado(asistenciaporcentrocostoBean.getid_empleado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosAsistenciaPorCentroCosto(AsistenciaPorCentroCosto asistenciaporcentrocostoOrigen,AsistenciaPorCentroCosto asistenciaporcentrocosto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && asistenciaporcentrocostoOrigen.getId()!=null && !asistenciaporcentrocostoOrigen.getId().equals(0L))) {asistenciaporcentrocosto.setId(asistenciaporcentrocostoOrigen.getId());}}
			if(conDefault || (!conDefault && asistenciaporcentrocostoOrigen.getid_centro_costo()!=null && !asistenciaporcentrocostoOrigen.getid_centro_costo().equals(null))) {asistenciaporcentrocosto.setid_centro_costo(asistenciaporcentrocostoOrigen.getid_centro_costo());}
			if(conDefault || (!conDefault && asistenciaporcentrocostoOrigen.getid_empleado()!=null && !asistenciaporcentrocostoOrigen.getid_empleado().equals(-1L))) {asistenciaporcentrocosto.setid_empleado(asistenciaporcentrocostoOrigen.getid_empleado());}
			if(conDefault || (!conDefault && asistenciaporcentrocostoOrigen.getfecha()!=null && !asistenciaporcentrocostoOrigen.getfecha().equals(new Date()))) {asistenciaporcentrocosto.setfecha(asistenciaporcentrocostoOrigen.getfecha());}
			if(conDefault || (!conDefault && asistenciaporcentrocostoOrigen.getporcentaje()!=null && !asistenciaporcentrocostoOrigen.getporcentaje().equals(0.0))) {asistenciaporcentrocosto.setporcentaje(asistenciaporcentrocostoOrigen.getporcentaje());}
			if(conDefault || (!conDefault && asistenciaporcentrocostoOrigen.getvalor_hora()!=null && !asistenciaporcentrocostoOrigen.getvalor_hora().equals(0.0))) {asistenciaporcentrocosto.setvalor_hora(asistenciaporcentrocostoOrigen.getvalor_hora());}
			if(conDefault || (!conDefault && asistenciaporcentrocostoOrigen.getpermiso()!=null && !asistenciaporcentrocostoOrigen.getpermiso().equals(0.0))) {asistenciaporcentrocosto.setpermiso(asistenciaporcentrocostoOrigen.getpermiso());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAsistenciaPorCentroCosto(AsistenciaPorCentroCosto asistenciaporcentrocosto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelidAsistenciaPorCentroCosto.setText(asistenciaporcentrocosto.getId().toString());
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jDateChooserfechaAsistenciaPorCentroCosto.setDate(asistenciaporcentrocosto.getfecha());
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldporcentajeAsistenciaPorCentroCosto.setText(asistenciaporcentrocosto.getporcentaje().toString());
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldvalor_horaAsistenciaPorCentroCosto.setText(asistenciaporcentrocosto.getvalor_hora().toString());
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldpermisoAsistenciaPorCentroCosto.setText(asistenciaporcentrocosto.getpermiso().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAsistenciaPorCentroCosto(AsistenciaPorCentroCostoBean asistenciaporcentrocostoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelidAsistenciaPorCentroCosto.setText(asistenciaporcentrocostoBean.getId().toString());
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jDateChooserfechaAsistenciaPorCentroCosto.setDate(asistenciaporcentrocostoBean.getfecha());
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldporcentajeAsistenciaPorCentroCosto.setText(asistenciaporcentrocostoBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldvalor_horaAsistenciaPorCentroCosto.setText(asistenciaporcentrocostoBean.getvalor_hora().toString());
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldpermisoAsistenciaPorCentroCosto.setText(asistenciaporcentrocostoBean.getpermiso().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanAsistenciaPorCentroCosto(AsistenciaPorCentroCostoParameterReturnGeneral asistenciaporcentrocostoReturnGeneral,AsistenciaPorCentroCostoBean asistenciaporcentrocostoBean,Boolean conDefault) throws Exception { 
		try {
			AsistenciaPorCentroCosto asistenciaporcentrocostoLocal=new AsistenciaPorCentroCosto();
			
			asistenciaporcentrocostoLocal=asistenciaporcentrocostoReturnGeneral.getAsistenciaPorCentroCosto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && asistenciaporcentrocostoLocal.getId()!=null && !asistenciaporcentrocostoLocal.getId().equals(0L))) {asistenciaporcentrocostoBean.setId(asistenciaporcentrocostoLocal.getId());}}
			if(conDefault || (!conDefault && asistenciaporcentrocostoLocal.getid_centro_costo()!=null && !asistenciaporcentrocostoLocal.getid_centro_costo().equals(null))) {asistenciaporcentrocostoBean.setid_centro_costo(asistenciaporcentrocostoLocal.getid_centro_costo());}
			if(conDefault || (!conDefault && asistenciaporcentrocostoLocal.getid_empleado()!=null && !asistenciaporcentrocostoLocal.getid_empleado().equals(-1L))) {asistenciaporcentrocostoBean.setid_empleado(asistenciaporcentrocostoLocal.getid_empleado());}
			if(conDefault || (!conDefault && asistenciaporcentrocostoLocal.getfecha()!=null && !asistenciaporcentrocostoLocal.getfecha().equals(new Date()))) {asistenciaporcentrocostoBean.setfecha(asistenciaporcentrocostoLocal.getfecha());}
			if(conDefault || (!conDefault && asistenciaporcentrocostoLocal.getporcentaje()!=null && !asistenciaporcentrocostoLocal.getporcentaje().equals(0.0))) {asistenciaporcentrocostoBean.setporcentaje(asistenciaporcentrocostoLocal.getporcentaje());}
			if(conDefault || (!conDefault && asistenciaporcentrocostoLocal.getvalor_hora()!=null && !asistenciaporcentrocostoLocal.getvalor_hora().equals(0.0))) {asistenciaporcentrocostoBean.setvalor_hora(asistenciaporcentrocostoLocal.getvalor_hora());}
			if(conDefault || (!conDefault && asistenciaporcentrocostoLocal.getpermiso()!=null && !asistenciaporcentrocostoLocal.getpermiso().equals(0.0))) {asistenciaporcentrocostoBean.setpermiso(asistenciaporcentrocostoLocal.getpermiso());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxAsistenciaPorCentroCostoGenerico(Long idAsistenciaPorCentroCostoSeleccionado,JComboBox jComboBoxAsistenciaPorCentroCosto,List<AsistenciaPorCentroCosto> asistenciaporcentrocostosLocal)throws Exception {
		try {
			AsistenciaPorCentroCosto  asistenciaporcentrocostoTemp=null;

			for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:asistenciaporcentrocostosLocal) {
				if(asistenciaporcentrocostoAux.getId()!=null && asistenciaporcentrocostoAux.getId().equals(idAsistenciaPorCentroCostoSeleccionado)) {
					asistenciaporcentrocostoTemp=asistenciaporcentrocostoAux;
					break;
				}
			}

			jComboBoxAsistenciaPorCentroCosto.setSelectedItem(asistenciaporcentrocostoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxAsistenciaPorCentroCostoGenerico(JComboBox jComboBoxAsistenciaPorCentroCosto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxAsistenciaPorCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAsistenciaPorCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxAsistenciaPorCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAsistenciaPorCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAsistenciaPorCentroCosto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxAsistenciaPorCentroCosto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAsistenciaPorCentroCosto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxAsistenciaPorCentroCosto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxAsistenciaPorCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxAsistenciaPorCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			asistenciaporcentrocosto=(AsistenciaPorCentroCosto) asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			asistenciaporcentrocosto =(AsistenciaPorCentroCosto) asistenciaporcentrocostos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!asistenciaporcentrocosto.getIsNew() && !asistenciaporcentrocosto.getIsChanged() && !asistenciaporcentrocosto.getIsDeleted()) {
				sDescripcion=asistenciaporcentrocosto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=asistenciaporcentrocosto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("CentroCosto")) {
			//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
			if(!asistenciaporcentrocosto.getIsNew() && !asistenciaporcentrocosto.getIsChanged() && !asistenciaporcentrocosto.getIsDeleted()) {
				sDescripcion=asistenciaporcentrocosto.getcentrocosto_descripcion();
			} else {
				//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
				sDescripcion=asistenciaporcentrocosto.getcentrocosto_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!asistenciaporcentrocosto.getIsNew() && !asistenciaporcentrocosto.getIsChanged() && !asistenciaporcentrocosto.getIsDeleted()) {
				sDescripcion=asistenciaporcentrocosto.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=asistenciaporcentrocosto.getempleado_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		AsistenciaPorCentroCosto asistenciaporcentrocostoRow=new AsistenciaPorCentroCosto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			asistenciaporcentrocostoRow=(AsistenciaPorCentroCosto) asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			asistenciaporcentrocostoRow=(AsistenciaPorCentroCosto) asistenciaporcentrocostos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualAsistenciaPorCentroCosto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaNuevoAsistenciaPorCentroCosto && this.isPermisoNuevoAsistenciaPorCentroCosto));			
			this.jButtonDuplicarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaDuplicarAsistenciaPorCentroCosto && this.isPermisoDuplicarAsistenciaPorCentroCosto));			
			this.jButtonCopiarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaCopiarAsistenciaPorCentroCosto && this.isPermisoCopiarAsistenciaPorCentroCosto));
			this.jButtonVerFormAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaVerFormAsistenciaPorCentroCosto && this.isPermisoVerFormAsistenciaPorCentroCosto));
			
			this.jButtonAbrirOrderByAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaOrdenAsistenciaPorCentroCosto && this.isPermisoOrdenAsistenciaPorCentroCosto));			
			
			this.jButtonNuevoRelacionesAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto && this.isPermisoNuevoAsistenciaPorCentroCosto));			
			this.jButtonNuevoGuardarCambiosAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaNuevoAsistenciaPorCentroCosto && this.isPermisoNuevoAsistenciaPorCentroCosto && this.isPermisoGuardarCambiosAsistenciaPorCentroCosto));
			
			if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonModificarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaModificarAsistenciaPorCentroCosto && this.isPermisoActualizarAsistenciaPorCentroCosto));	
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonActualizarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaActualizarAsistenciaPorCentroCosto && this.isPermisoActualizarAsistenciaPorCentroCosto));	
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonEliminarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaEliminarAsistenciaPorCentroCosto && this.isPermisoEliminarAsistenciaPorCentroCosto));
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonCancelarAsistenciaPorCentroCosto.setVisible(this.isVisibilidadCeldaCancelarAsistenciaPorCentroCosto);							
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonGuardarCambiosAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaGuardarAsistenciaPorCentroCosto && this.isPermisoGuardarCambiosAsistenciaPorCentroCosto));			
			
			}
						
			this.jButtonGuardarCambiosTablaAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaGuardarCambiosAsistenciaPorCentroCosto && this.isPermisoGuardarCambiosAsistenciaPorCentroCosto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaNuevoAsistenciaPorCentroCosto && this.isPermisoNuevoAsistenciaPorCentroCosto));						
			this.jButtonDuplicarToolBarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaDuplicarAsistenciaPorCentroCosto && this.isPermisoDuplicarAsistenciaPorCentroCosto));						
			this.jButtonCopiarToolBarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaCopiarAsistenciaPorCentroCosto && this.isPermisoCopiarAsistenciaPorCentroCosto));			
			this.jButtonVerFormToolBarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaVerFormAsistenciaPorCentroCosto && this.isPermisoVerFormAsistenciaPorCentroCosto));			
			this.jButtonAbrirOrderByToolBarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaOrdenAsistenciaPorCentroCosto && this.isPermisoOrdenAsistenciaPorCentroCosto));
			this.jButtonNuevoRelacionesToolBarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto && this.isPermisoNuevoAsistenciaPorCentroCosto));			
			this.jButtonNuevoGuardarCambiosToolBarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaNuevoAsistenciaPorCentroCosto && this.isPermisoNuevoAsistenciaPorCentroCosto && this.isPermisoGuardarCambiosAsistenciaPorCentroCosto));			
			
			if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonModificarToolBarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaModificarAsistenciaPorCentroCosto && this.isPermisoActualizarAsistenciaPorCentroCosto));	
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonActualizarToolBarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaActualizarAsistenciaPorCentroCosto  && this.isPermisoActualizarAsistenciaPorCentroCosto));	
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonEliminarToolBarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaEliminarAsistenciaPorCentroCosto && this.isPermisoEliminarAsistenciaPorCentroCosto));
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonCancelarToolBarAsistenciaPorCentroCosto.setVisible(this.isVisibilidadCeldaCancelarAsistenciaPorCentroCosto);				
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonGuardarCambiosToolBarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaGuardarAsistenciaPorCentroCosto && this.isPermisoGuardarCambiosAsistenciaPorCentroCosto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaGuardarCambiosAsistenciaPorCentroCosto && this.isPermisoGuardarCambiosAsistenciaPorCentroCosto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaNuevoAsistenciaPorCentroCosto && this.isPermisoNuevoAsistenciaPorCentroCosto));			
			this.jMenuItemDuplicarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaDuplicarAsistenciaPorCentroCosto && this.isPermisoDuplicarAsistenciaPorCentroCosto));			
			this.jMenuItemCopiarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaCopiarAsistenciaPorCentroCosto && this.isPermisoCopiarAsistenciaPorCentroCosto));			
			this.jMenuItemVerFormAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaVerFormAsistenciaPorCentroCosto && this.isPermisoVerFormAsistenciaPorCentroCosto));			
			this.jMenuItemAbrirOrderByAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaOrdenAsistenciaPorCentroCosto && this.isPermisoOrdenAsistenciaPorCentroCosto));			
			//this.jMenuItemMostrarOcultarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaOrdenAsistenciaPorCentroCosto && this.isPermisoOrdenAsistenciaPorCentroCosto));
			this.jMenuItemDetalleAbrirOrderByAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaOrdenAsistenciaPorCentroCosto && this.isPermisoOrdenAsistenciaPorCentroCosto));			
			//this.jMenuItemDetalleMostrarOcultarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaOrdenAsistenciaPorCentroCosto && this.isPermisoOrdenAsistenciaPorCentroCosto));			
			this.jMenuItemNuevoRelacionesAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto && this.isPermisoNuevoAsistenciaPorCentroCosto));			
			this.jMenuItemNuevoGuardarCambiosAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaNuevoAsistenciaPorCentroCosto && this.isPermisoNuevoAsistenciaPorCentroCosto && this.isPermisoGuardarCambiosAsistenciaPorCentroCosto));									
			
			if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jMenuItemModificarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaModificarAsistenciaPorCentroCosto && this.isPermisoActualizarAsistenciaPorCentroCosto));	
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jMenuItemActualizarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaActualizarAsistenciaPorCentroCosto && this.isPermisoActualizarAsistenciaPorCentroCosto));	
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jMenuItemEliminarAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaEliminarAsistenciaPorCentroCosto && this.isPermisoEliminarAsistenciaPorCentroCosto));
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jMenuItemCancelarAsistenciaPorCentroCosto.setVisible(this.isVisibilidadCeldaCancelarAsistenciaPorCentroCosto);				
			}
			
			this.jMenuItemGuardarCambiosAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaGuardarAsistenciaPorCentroCosto && this.isPermisoGuardarCambiosAsistenciaPorCentroCosto));						
			this.jMenuItemGuardarCambiosTablaAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaGuardarCambiosAsistenciaPorCentroCosto && this.isPermisoGuardarCambiosAsistenciaPorCentroCosto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoAsistenciaPorCentroCosto=this.jButtonNuevoAsistenciaPorCentroCosto.isVisible();
			this.isVisibilidadCeldaDuplicarAsistenciaPorCentroCosto=this.jButtonDuplicarAsistenciaPorCentroCosto.isVisible();
			this.isVisibilidadCeldaCopiarAsistenciaPorCentroCosto=this.jButtonCopiarAsistenciaPorCentroCosto.isVisible();
			this.isVisibilidadCeldaVerFormAsistenciaPorCentroCosto=this.jButtonVerFormAsistenciaPorCentroCosto.isVisible();
			
			this.isVisibilidadCeldaOrdenAsistenciaPorCentroCosto=this.jButtonAbrirOrderByAsistenciaPorCentroCosto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto=this.jButtonNuevoRelacionesAsistenciaPorCentroCosto.isVisible();
			this.isVisibilidadCeldaModificarAsistenciaPorCentroCosto=this.jButtonModificarAsistenciaPorCentroCosto.isVisible();
			
			if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
			this.isVisibilidadCeldaActualizarAsistenciaPorCentroCosto=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonActualizarAsistenciaPorCentroCosto.isVisible();
			this.isVisibilidadCeldaEliminarAsistenciaPorCentroCosto=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonEliminarAsistenciaPorCentroCosto.isVisible();
			this.isVisibilidadCeldaCancelarAsistenciaPorCentroCosto=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonCancelarAsistenciaPorCentroCosto.isVisible();
			this.isVisibilidadCeldaGuardarAsistenciaPorCentroCosto=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonGuardarCambiosAsistenciaPorCentroCosto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosAsistenciaPorCentroCosto=this.jButtonGuardarCambiosTablaAsistenciaPorCentroCosto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoAsistenciaPorCentroCosto=this.jButtonNuevoToolBarAsistenciaPorCentroCosto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto=this.jButtonNuevoRelacionesToolBarAsistenciaPorCentroCosto.isVisible();
			
			if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
			this.isVisibilidadCeldaModificarAsistenciaPorCentroCosto=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonModificarToolBarAsistenciaPorCentroCosto.isVisible();
			this.isVisibilidadCeldaActualizarAsistenciaPorCentroCosto=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonActualizarToolBarAsistenciaPorCentroCosto.isVisible();
			this.isVisibilidadCeldaEliminarAsistenciaPorCentroCosto=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonEliminarToolBarAsistenciaPorCentroCosto.isVisible();
			this.isVisibilidadCeldaCancelarAsistenciaPorCentroCosto=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonCancelarToolBarAsistenciaPorCentroCosto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAsistenciaPorCentroCosto=this.jButtonGuardarCambiosToolBarAsistenciaPorCentroCosto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAsistenciaPorCentroCosto=this.jButtonGuardarCambiosTablaToolBarAsistenciaPorCentroCosto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoAsistenciaPorCentroCosto=this.jMenuItemNuevoAsistenciaPorCentroCosto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto=this.jMenuItemNuevoRelacionesAsistenciaPorCentroCosto.isVisible();
			
			if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
			this.isVisibilidadCeldaModificarAsistenciaPorCentroCosto=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jMenuItemModificarAsistenciaPorCentroCosto.isVisible();
			this.isVisibilidadCeldaActualizarAsistenciaPorCentroCosto=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jMenuItemActualizarAsistenciaPorCentroCosto.isVisible();
			this.isVisibilidadCeldaEliminarAsistenciaPorCentroCosto=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jMenuItemEliminarAsistenciaPorCentroCosto.isVisible();
			this.isVisibilidadCeldaCancelarAsistenciaPorCentroCosto=this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jMenuItemCancelarAsistenciaPorCentroCosto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAsistenciaPorCentroCosto=this.jMenuItemGuardarCambiosAsistenciaPorCentroCosto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAsistenciaPorCentroCosto=this.jMenuItemGuardarCambiosTablaAsistenciaPorCentroCosto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesAsistenciaPorCentroCosto(Boolean esInicializar) {
		if(AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.asistenciaporcentrocostoSessionBean.getConGuardarRelaciones()) {
				//if(this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesAsistenciaPorCentroCosto();
			}
			
			this.inicializarActualizarBindingBotonesManualAsistenciaPorCentroCosto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualAsistenciaPorCentroCosto() {
		this.jButtonNuevoAsistenciaPorCentroCosto.setVisible(this.isPermisoNuevoAsistenciaPorCentroCosto);			
		this.jButtonDuplicarAsistenciaPorCentroCosto.setVisible(this.isPermisoDuplicarAsistenciaPorCentroCosto);			
		this.jButtonCopiarAsistenciaPorCentroCosto.setVisible(this.isPermisoCopiarAsistenciaPorCentroCosto);			
		this.jButtonVerFormAsistenciaPorCentroCosto.setVisible(this.isPermisoVerFormAsistenciaPorCentroCosto);			
		
		this.jButtonAbrirOrderByAsistenciaPorCentroCosto.setVisible(this.isPermisoOrdenAsistenciaPorCentroCosto);					
		
		this.jButtonNuevoRelacionesAsistenciaPorCentroCosto.setVisible(this.isPermisoNuevoAsistenciaPorCentroCosto);			
		
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonModificarAsistenciaPorCentroCosto.setVisible(this.isPermisoActualizarAsistenciaPorCentroCosto);	
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonActualizarAsistenciaPorCentroCosto.setVisible(this.isPermisoActualizarAsistenciaPorCentroCosto);	
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonEliminarAsistenciaPorCentroCosto.setVisible(this.isPermisoEliminarAsistenciaPorCentroCosto);
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonCancelarAsistenciaPorCentroCosto.setVisible(this.isVisibilidadCeldaCancelarAsistenciaPorCentroCosto);						
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonGuardarCambiosAsistenciaPorCentroCosto.setVisible(this.isPermisoGuardarCambiosAsistenciaPorCentroCosto);							
		}
		
		this.jButtonGuardarCambiosTablaAsistenciaPorCentroCosto.setVisible(this.isPermisoActualizarAsistenciaPorCentroCosto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleAsistenciaPorCentroCosto() {
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonModificarAsistenciaPorCentroCosto.setVisible(this.isPermisoActualizarAsistenciaPorCentroCosto);	
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonActualizarAsistenciaPorCentroCosto.setVisible(this.isPermisoActualizarAsistenciaPorCentroCosto);	
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonEliminarAsistenciaPorCentroCosto.setVisible(this.isPermisoEliminarAsistenciaPorCentroCosto);
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonCancelarAsistenciaPorCentroCosto.setVisible(this.isVisibilidadCeldaCancelarAsistenciaPorCentroCosto);							
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonGuardarCambiosAsistenciaPorCentroCosto.setVisible((this.isVisibilidadCeldaGuardarAsistenciaPorCentroCosto && this.isPermisoGuardarCambiosAsistenciaPorCentroCosto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosAsistenciaPorCentroCosto() {
		if(AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualAsistenciaPorCentroCosto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesAsistenciaPorCentroCosto() {
	}
	
	public void jTableDatosAsistenciaPorCentroCostoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarAsistenciaPorCentroCosto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidAsistenciaPorCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.getasistenciaporcentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciaporcentrocosto==null) {
						this.asistenciaporcentrocosto = new AsistenciaPorCentroCosto();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.asistenciaporcentrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
				}

				if(this.asistenciaporcentrocosto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.asistenciaporcentrocosto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaPorCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaAsistenciaPorCentroCostoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebAsistenciaPorCentroCosto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAsistenciaPorCentroCosto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAsistenciaPorCentroCosto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.getasistenciaporcentrocosto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.asistenciaporcentrocostoLogic.getConnexion());

				if(this.asistenciaporcentrocosto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.asistenciaporcentrocosto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAsistenciaPorCentroCosto=(TitledBorder)this.jScrollPanelDatosAsistenciaPorCentroCosto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderAsistenciaPorCentroCosto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaAsistenciaPorCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.getasistenciaporcentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciaporcentrocosto==null) {
						this.asistenciaporcentrocosto = new AsistenciaPorCentroCosto();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.asistenciaporcentrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
				}

				if(this.asistenciaporcentrocosto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.asistenciaporcentrocosto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaPorCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_centro_costoAsistenciaPorCentroCostoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocentrocosto=true;

			idTienePermisocentrocosto=this.tienePermisosUsuarioEnPaginaWebAsistenciaPorCentroCosto(CentroCostoConstantesFunciones.CLASSNAME);

			if(idTienePermisocentrocosto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAsistenciaPorCentroCosto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAsistenciaPorCentroCosto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.getasistenciaporcentrocosto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);

				this.centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.centrocostoBeanSwingJInternalFrame.getCentroCostoLogic().setConnexion(this.asistenciaporcentrocostoLogic.getConnexion());

				if(this.asistenciaporcentrocosto.getid_centro_costo()!=null) {
					this.centrocostoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.centrocostoBeanSwingJInternalFrame.setIdActual(this.asistenciaporcentrocosto.getid_centro_costo());
					this.centrocostoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCentroCosto();
				}

				JInternalFrameBase jinternalFrame =this.centrocostoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAsistenciaPorCentroCosto=(TitledBorder)this.jScrollPanelDatosAsistenciaPorCentroCosto.getBorder();
				TitledBorder titledBordercentrocosto=(TitledBorder)this.centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

				titledBordercentrocosto.setTitle(titledBorderAsistenciaPorCentroCosto.getTitle() + " -> Centro Costo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_centro_costoAsistenciaPorCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.getasistenciaporcentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciaporcentrocosto==null) {
						this.asistenciaporcentrocosto = new AsistenciaPorCentroCosto();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.asistenciaporcentrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
				}

				if(this.asistenciaporcentrocosto.getid_centro_costo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_centro_costo = "+this.asistenciaporcentrocosto.getid_centro_costo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaPorCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoAsistenciaPorCentroCostoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebAsistenciaPorCentroCosto(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAsistenciaPorCentroCosto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAsistenciaPorCentroCosto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.getasistenciaporcentrocosto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.asistenciaporcentrocostoLogic.getConnexion());

				if(this.asistenciaporcentrocosto.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.asistenciaporcentrocosto.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAsistenciaPorCentroCosto=(TitledBorder)this.jScrollPanelDatosAsistenciaPorCentroCosto.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderAsistenciaPorCentroCosto.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoAsistenciaPorCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.getasistenciaporcentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciaporcentrocosto==null) {
						this.asistenciaporcentrocosto = new AsistenciaPorCentroCosto();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.asistenciaporcentrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
				}

				if(this.asistenciaporcentrocosto.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.asistenciaporcentrocosto.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaPorCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaAsistenciaPorCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.getasistenciaporcentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciaporcentrocosto==null) {
						this.asistenciaporcentrocosto = new AsistenciaPorCentroCosto();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.asistenciaporcentrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
				}

				if(this.asistenciaporcentrocosto.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.asistenciaporcentrocosto.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaPorCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeAsistenciaPorCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.getasistenciaporcentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciaporcentrocosto==null) {
						this.asistenciaporcentrocosto = new AsistenciaPorCentroCosto();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.asistenciaporcentrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
				}

				if(this.asistenciaporcentrocosto.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.asistenciaporcentrocosto.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaPorCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_horaAsistenciaPorCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.getasistenciaporcentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciaporcentrocosto==null) {
						this.asistenciaporcentrocosto = new AsistenciaPorCentroCosto();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.asistenciaporcentrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
				}

				if(this.asistenciaporcentrocosto.getvalor_hora()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_hora = "+this.asistenciaporcentrocosto.getvalor_hora().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaPorCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonpermisoAsistenciaPorCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.getasistenciaporcentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.asistenciaporcentrocosto==null) {
						this.asistenciaporcentrocosto = new AsistenciaPorCentroCosto();
					}

					this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.asistenciaporcentrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);
				}

				if(this.asistenciaporcentrocosto.getpermiso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where permiso = "+this.asistenciaporcentrocosto.getpermiso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAsistenciaPorCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCentroCostoAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAsistenciaPorCentroCosto(false,false);

			this.getAsistenciaPorCentroCostosFK_IdCentroCosto();

			this.inicializarActualizarBindingAsistenciaPorCentroCosto(false);

			//if(AsistenciaPorCentroCostoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAsistenciaPorCentroCosto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAsistenciaPorCentroCosto(false,false);

			this.getAsistenciaPorCentroCostosFK_IdEmpleado();

			this.inicializarActualizarBindingAsistenciaPorCentroCosto(false);

			//if(AsistenciaPorCentroCostoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAsistenciaPorCentroCosto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaAsistenciaPorCentroCostoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAsistenciaPorCentroCosto(false,false);

			this.getAsistenciaPorCentroCostosFK_IdEmpresa();

			this.inicializarActualizarBindingAsistenciaPorCentroCosto(false);

			//if(AsistenciaPorCentroCostoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAsistenciaPorCentroCosto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.asistenciaporcentrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameAsistenciaPorCentroCosto() {
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.setVisible(false);	    			
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.dispose();
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto!=null) {
			this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.dispose();
			this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto=null;
		}
		
		if(this.jInternalFrameImportacionAsistenciaPorCentroCosto!=null) {
			this.jInternalFrameImportacionAsistenciaPorCentroCosto.setVisible(false);	    			
			this.jInternalFrameImportacionAsistenciaPorCentroCosto.dispose();
			this.jInternalFrameImportacionAsistenciaPorCentroCosto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessAsistenciaPorCentroCosto();
			
			AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
			
			
			if(sTipo.equals("NuevoAsistenciaPorCentroCosto")) {
				jButtonNuevoAsistenciaPorCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarAsistenciaPorCentroCosto")) {
				jButtonDuplicarAsistenciaPorCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarAsistenciaPorCentroCosto")) {
				jButtonCopiarAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("VerFormAsistenciaPorCentroCosto")) {
				jButtonVerFormAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarAsistenciaPorCentroCosto")) {
				jButtonNuevoAsistenciaPorCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarAsistenciaPorCentroCosto")) {
				jButtonDuplicarAsistenciaPorCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoAsistenciaPorCentroCosto")) {
				jButtonNuevoAsistenciaPorCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarAsistenciaPorCentroCosto")) {
				jButtonDuplicarAsistenciaPorCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesAsistenciaPorCentroCosto")) {
				jButtonNuevoAsistenciaPorCentroCostoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarAsistenciaPorCentroCosto")) {
				jButtonNuevoAsistenciaPorCentroCostoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesAsistenciaPorCentroCosto")) {
				jButtonNuevoAsistenciaPorCentroCostoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarAsistenciaPorCentroCosto")) {
				jButtonModificarAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarAsistenciaPorCentroCosto")) {
				jButtonModificarAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarAsistenciaPorCentroCosto")) {
				jButtonModificarAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarAsistenciaPorCentroCosto")) {
				jButtonActualizarAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarAsistenciaPorCentroCosto")) {
				jButtonActualizarAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarAsistenciaPorCentroCosto")) {
				jButtonActualizarAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("EliminarAsistenciaPorCentroCosto")) {
				jButtonEliminarAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarAsistenciaPorCentroCosto")) {
				jButtonEliminarAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarAsistenciaPorCentroCosto")) {
				jButtonEliminarAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("CancelarAsistenciaPorCentroCosto")) {
				jButtonCancelarAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarAsistenciaPorCentroCosto")) {
				jButtonCancelarAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarAsistenciaPorCentroCosto")) {
				jButtonCancelarAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("CerrarAsistenciaPorCentroCosto")) {
				jButtonCerrarAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarAsistenciaPorCentroCosto")) {
				jButtonCerrarAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarAsistenciaPorCentroCosto")) {
				jButtonCerrarAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarAsistenciaPorCentroCosto")) {
				jButtonMostrarOcultarAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarAsistenciaPorCentroCosto")) {
				jButtonCancelarAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosAsistenciaPorCentroCosto")) {
				jButtonGuardarCambiosAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarAsistenciaPorCentroCosto")) {
				jButtonGuardarCambiosAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarAsistenciaPorCentroCosto")) {
				jButtonCopiarAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarAsistenciaPorCentroCosto")) {
				jButtonVerFormAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosAsistenciaPorCentroCosto")) {
				jButtonGuardarCambiosAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarAsistenciaPorCentroCosto")) {
				jButtonCopiarAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormAsistenciaPorCentroCosto")) {
				jButtonVerFormAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaAsistenciaPorCentroCosto")) {
				jButtonGuardarCambiosAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarAsistenciaPorCentroCosto")) {
				jButtonGuardarCambiosAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaAsistenciaPorCentroCosto")) {
				jButtonGuardarCambiosAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionAsistenciaPorCentroCosto")) {
				jButtonRecargarInformacionAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarAsistenciaPorCentroCosto")) {
				jButtonRecargarInformacionAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionAsistenciaPorCentroCosto")) {
				jButtonRecargarInformacionAsistenciaPorCentroCostoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresAsistenciaPorCentroCosto")) {
				jButtonAnterioresAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarAsistenciaPorCentroCosto")) {
				jButtonAnterioresAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreAsistenciaPorCentroCosto")) {
				jButtonAnterioresAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesAsistenciaPorCentroCosto")) {
				jButtonSiguientesAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarAsistenciaPorCentroCosto")) {
				jButtonSiguientesAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesAsistenciaPorCentroCosto")) {
				jButtonSiguientesAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByAsistenciaPorCentroCosto") || sTipo.equals("MenuItemDetalleAbrirOrderByAsistenciaPorCentroCosto")) {
				jButtonAbrirOrderByAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarAsistenciaPorCentroCosto") || sTipo.equals("MenuItemDetalleMostrarOcultarAsistenciaPorCentroCosto")) {
				jButtonMostrarOcultarAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosAsistenciaPorCentroCosto")) {
				jButtonNuevoGuardarCambiosAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarAsistenciaPorCentroCosto")) {
				jButtonNuevoGuardarCambiosAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosAsistenciaPorCentroCosto")) {
				jButtonNuevoGuardarCambiosAsistenciaPorCentroCostoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoAsistenciaPorCentroCosto")) {
				jButtonCerrarReporteDinamicoAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoAsistenciaPorCentroCosto")) {
				jButtonGenerarReporteDinamicoAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoAsistenciaPorCentroCosto")) {
				
				jButtonGenerarExcelReporteDinamicoAsistenciaPorCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionAsistenciaPorCentroCosto")) {
				jButtonCerrarImportacionAsistenciaPorCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionAsistenciaPorCentroCosto")) {
				
				jButtonGenerarImportacionAsistenciaPorCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionAsistenciaPorCentroCosto")) {
				
				jButtonAbrirImportacionAsistenciaPorCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesAsistenciaPorCentroCosto")) {
				jComboBoxTiposAccionesAsistenciaPorCentroCostoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesAsistenciaPorCentroCosto")) {
				jComboBoxTiposRelacionesAsistenciaPorCentroCostoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioAsistenciaPorCentroCosto")) {
				jComboBoxTiposAccionesAsistenciaPorCentroCostoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarAsistenciaPorCentroCosto")) {
				
				jComboBoxTiposSeleccionarAsistenciaPorCentroCostoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralAsistenciaPorCentroCosto")) {
				jTextFieldValorCampoGeneralAsistenciaPorCentroCostoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByAsistenciaPorCentroCosto")) {
				jButtonAbrirOrderByAsistenciaPorCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarAsistenciaPorCentroCosto")) {
				jButtonAbrirOrderByAsistenciaPorCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByAsistenciaPorCentroCosto")) {
				jButtonCerrarOrderByAsistenciaPorCentroCostoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAsistenciaPorCentroCostoBusqueda")) {
				this.jButtonidAsistenciaPorCentroCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAsistenciaPorCentroCostoUpdate")) {
				this.jButtonid_empresaAsistenciaPorCentroCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAsistenciaPorCentroCostoBusqueda")) {
				this.jButtonid_empresaAsistenciaPorCentroCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoAsistenciaPorCentroCostoUpdate")) {
				this.jButtonid_centro_costoAsistenciaPorCentroCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoAsistenciaPorCentroCostoBusqueda")) {
				this.jButtonid_centro_costoAsistenciaPorCentroCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoAsistenciaPorCentroCostoUpdate")) {
				this.jButtonid_empleadoAsistenciaPorCentroCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoAsistenciaPorCentroCostoBusqueda")) {
				this.jButtonid_empleadoAsistenciaPorCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaAsistenciaPorCentroCostoBusqueda")) {
				this.jButtonfechaAsistenciaPorCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeAsistenciaPorCentroCostoBusqueda")) {
				this.jButtonporcentajeAsistenciaPorCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_horaAsistenciaPorCentroCostoBusqueda")) {
				this.jButtonvalor_horaAsistenciaPorCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("permisoAsistenciaPorCentroCostoBusqueda")) {
				this.jButtonpermisoAsistenciaPorCentroCostoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCentroCostoAsistenciaPorCentroCosto")) {
				this.jButtonFK_IdCentroCostoAsistenciaPorCentroCostoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoAsistenciaPorCentroCosto")) {
				this.jButtonFK_IdEmpleadoAsistenciaPorCentroCostoActionPerformed(evt);
			}
			
			;
			
			
			AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessAsistenciaPorCentroCosto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAsistenciaPorCentroCostoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciaporcentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciaporcentrocosto);
				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
				
				


				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaPorCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaPorCentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			AsistenciaPorCentroCosto asistenciaporcentrocostoLocal=null;
			
			if(!this.getEsControlTabla()) {
				asistenciaporcentrocostoLocal=this.asistenciaporcentrocosto;
			} else {
				asistenciaporcentrocostoLocal=this.asistenciaporcentrocostoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciaporcentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciaporcentrocosto);
				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
							
				
				


				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaPorCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaPorCentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaPorCentroCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoAnterior =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciaporcentrocostoAnterior =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
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
			
			AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
			
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
			
			


			
			AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAsistenciaPorCentroCostoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciaporcentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciaporcentrocosto);
				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
								
						
				


				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaPorCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaPorCentroCosto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciaporcentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciaporcentrocosto);
				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
								
				
				


				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaPorCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaPorCentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaPorCentroCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoAnterior =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciaporcentrocostoAnterior =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciaporcentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciaporcentrocosto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaPorCentroCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoAnterior =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciaporcentrocostoAnterior =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaPorCentroCostoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciaporcentrocosto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.asistenciaporcentrocosto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciaporcentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciaporcentrocosto);
				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
							
				
				


				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaPorCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaPorCentroCosto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAsistenciaPorCentroCostoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciaporcentrocostoAnterior =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.asistenciaporcentrocostoAnterior =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
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
			
			AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
			
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
			
			


			
			AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaPorCentroCostoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciaporcentrocosto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.asistenciaporcentrocosto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciaporcentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciaporcentrocosto);
				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
								
				
				


				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaPorCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaPorCentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaPorCentroCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoAnterior =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciaporcentrocostoAnterior =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaPorCentroCostoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciaporcentrocosto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.asistenciaporcentrocosto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAsistenciaPorCentroCostoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciaporcentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciaporcentrocosto);
				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosAsistenciaPorCentroCosto")) {
					jCheckBoxSeleccionarTodosAsistenciaPorCentroCostoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosAsistenciaPorCentroCosto")) {
					jCheckBoxSeleccionadosAsistenciaPorCentroCostoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarAsistenciaPorCentroCosto")) {
					
				}
				
				


				
				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaPorCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaPorCentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciaporcentrocosto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.asistenciaporcentrocosto);
				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
												
				
				


				
				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaPorCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaPorCentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAsistenciaPorCentroCostoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.asistenciaporcentrocostoAnterior =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.asistenciaporcentrocostoAnterior =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAsistenciaPorCentroCostoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciaporcentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciaporcentrocosto);
				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
				
				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
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
			
			AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
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
			
			


			
			AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAsistenciaPorCentroCostoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciaporcentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciaporcentrocosto);
				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaPorCentroCosto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaPorCentroCosto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.asistenciaporcentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.asistenciaporcentrocosto);
				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
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
				
				


				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AsistenciaPorCentroCosto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AsistenciaPorCentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAsistenciaPorCentroCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.asistenciaporcentrocostoAnterior =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.asistenciaporcentrocostoAnterior =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarAsistenciaPorCentroCosto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosAsistenciaPorCentroCostoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosAsistenciaPorCentroCosto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.asistenciaporcentrocosto =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.asistenciaporcentrocosto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarAsistenciaPorCentroCosto")) {
				
				}
				
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarAsistenciaPorCentroCosto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosAsistenciaPorCentroCosto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarAsistenciaPorCentroCosto")) {
			
			}
			
			AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessAsistenciaPorCentroCosto();
			
			AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
			
			if(sTipo.equals("NuevoAsistenciaPorCentroCosto")) {
				jButtonNuevoAsistenciaPorCentroCostoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarAsistenciaPorCentroCosto")) {
				jButtonDuplicarAsistenciaPorCentroCostoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarAsistenciaPorCentroCosto")) {
				jButtonCopiarAsistenciaPorCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormAsistenciaPorCentroCosto")) {
				jButtonVerFormAsistenciaPorCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesAsistenciaPorCentroCosto")) {
				jButtonNuevoAsistenciaPorCentroCostoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarAsistenciaPorCentroCosto")) {
				jButtonModificarAsistenciaPorCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarAsistenciaPorCentroCosto")) {
				jButtonActualizarAsistenciaPorCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarAsistenciaPorCentroCosto")) {
				jButtonEliminarAsistenciaPorCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaAsistenciaPorCentroCosto")) {
				jButtonGuardarCambiosAsistenciaPorCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarAsistenciaPorCentroCosto")) {
				jButtonCancelarAsistenciaPorCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarAsistenciaPorCentroCosto")) {
				jButtonCerrarAsistenciaPorCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosAsistenciaPorCentroCosto")) {
				jButtonGuardarCambiosAsistenciaPorCentroCostoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosAsistenciaPorCentroCosto")) {
				jButtonNuevoGuardarCambiosAsistenciaPorCentroCostoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByAsistenciaPorCentroCosto")) {
				jButtonAbrirOrderByAsistenciaPorCentroCostoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionAsistenciaPorCentroCosto")) {
				jButtonRecargarInformacionAsistenciaPorCentroCostoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresAsistenciaPorCentroCosto")) {
				jButtonAnterioresAsistenciaPorCentroCostoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesAsistenciaPorCentroCosto")) {
				jButtonSiguientesAsistenciaPorCentroCostoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAsistenciaPorCentroCostoBusqueda")) {
				this.jButtonidAsistenciaPorCentroCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAsistenciaPorCentroCostoUpdate")) {
				this.jButtonid_empresaAsistenciaPorCentroCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAsistenciaPorCentroCostoBusqueda")) {
				this.jButtonid_empresaAsistenciaPorCentroCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoAsistenciaPorCentroCostoUpdate")) {
				this.jButtonid_centro_costoAsistenciaPorCentroCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoAsistenciaPorCentroCostoBusqueda")) {
				this.jButtonid_centro_costoAsistenciaPorCentroCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoAsistenciaPorCentroCostoUpdate")) {
				this.jButtonid_empleadoAsistenciaPorCentroCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoAsistenciaPorCentroCostoBusqueda")) {
				this.jButtonid_empleadoAsistenciaPorCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaAsistenciaPorCentroCostoBusqueda")) {
				this.jButtonfechaAsistenciaPorCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeAsistenciaPorCentroCostoBusqueda")) {
				this.jButtonporcentajeAsistenciaPorCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_horaAsistenciaPorCentroCostoBusqueda")) {
				this.jButtonvalor_horaAsistenciaPorCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("permisoAsistenciaPorCentroCostoBusqueda")) {
				this.jButtonpermisoAsistenciaPorCentroCostoBusquedaActionPerformed(evt);
			}
			
			AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessAsistenciaPorCentroCosto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameAsistenciaPorCentroCosto")) {
				closingInternalFrameAsistenciaPorCentroCosto();
				
			} else if(sTipo.equals("jButtonCancelarAsistenciaPorCentroCosto")) {
				JInternalFrameBase jInternalFrameDetalleFormAsistenciaPorCentroCosto = (JInternalFrameBase)evt.getSource();
	            	
	            AsistenciaPorCentroCostoBeanSwingJInternalFrame jInternalFrameParent=(AsistenciaPorCentroCostoBeanSwingJInternalFrame)jInternalFrameDetalleFormAsistenciaPorCentroCosto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarAsistenciaPorCentroCostoActionPerformed(null);
			}
			
			AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.asistenciaporcentrocosto,new Object(),this.asistenciaporcentrocostoParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormAsistenciaPorCentroCosto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormAsistenciaPorCentroCosto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormAsistenciaPorCentroCosto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.asistenciaporcentrocosto)) {
			if(!esControlTabla) {
				if(AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.asistenciaporcentrocosto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);			
				}
				
				if(this.asistenciaporcentrocostoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualAsistenciaPorCentroCosto(this.asistenciaporcentrocosto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.asistenciaporcentrocostoReturnGeneral=asistenciaporcentrocostoLogic.procesarEventosAsistenciaPorCentroCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos(),this.asistenciaporcentrocosto,this.asistenciaporcentrocostoParameterGeneral,this.isEsNuevoAsistenciaPorCentroCosto,classes);//this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCosto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanAsistenciaPorCentroCosto(this.asistenciaporcentrocostoReturnGeneral,this.asistenciaporcentrocostoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.asistenciaporcentrocostoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanAsistenciaPorCentroCosto(classes,this.asistenciaporcentrocostoReturnGeneral,this.asistenciaporcentrocostoBean,false);
					}
						
					if(this.asistenciaporcentrocostoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyAsistenciaPorCentroCosto(this.asistenciaporcentrocostoReturnGeneral.getAsistenciaPorCentroCosto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioAsistenciaPorCentroCosto(this.asistenciaporcentrocostoReturnGeneral.getAsistenciaPorCentroCosto());	
					}
						
					if(this.asistenciaporcentrocostoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioAsistenciaPorCentroCosto(this.asistenciaporcentrocostoReturnGeneral.getAsistenciaPorCentroCosto(),classes);//this.asistenciaporcentrocostoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioAsistenciaPorCentroCosto(this.asistenciaporcentrocosto,classes);//this.asistenciaporcentrocostoBean);									
				}
			
				if(AsistenciaPorCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualAsistenciaPorCentroCosto(this.asistenciaporcentrocosto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAsistenciaPorCentroCosto(this.asistenciaporcentrocosto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.asistenciaporcentrocostoAnterior!=null) {
						this.asistenciaporcentrocosto=this.asistenciaporcentrocostoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.asistenciaporcentrocostoReturnGeneral=asistenciaporcentrocostoLogic.procesarEventosAsistenciaPorCentroCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos(),this.asistenciaporcentrocosto,this.asistenciaporcentrocostoParameterGeneral,this.isEsNuevoAsistenciaPorCentroCosto,classes);//this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCosto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.asistenciaporcentrocostoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.asistenciaporcentrocostoReturnGeneral.getAsistenciaPorCentroCosto(),asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.asistenciaporcentrocostoReturnGeneral.getAsistenciaPorCentroCosto(),this.asistenciaporcentrocostos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosAsistenciaPorCentroCosto.repaint();
				
				//((AbstractTableModel) this.jTableDatosAsistenciaPorCentroCosto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosAsistenciaPorCentroCosto();
			}
		}
	}
	
	public void actualizarVisualTableDatosAsistenciaPorCentroCosto() throws Exception {
		
		AsistenciaPorCentroCostoModel asistenciaporcentrocostoModel=(AsistenciaPorCentroCostoModel)this.jTableDatosAsistenciaPorCentroCosto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			asistenciaporcentrocostoModel.asistenciaporcentrocostos=this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			asistenciaporcentrocostoModel.asistenciaporcentrocostos=this.asistenciaporcentrocostos;
		}
		
		
		((AsistenciaPorCentroCostoModel) this.jTableDatosAsistenciaPorCentroCosto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaAsistenciaPorCentroCosto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getasistenciaporcentrocostoAnterior(),this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getasistenciaporcentrocostoAnterior(),this.asistenciaporcentrocostos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosAsistenciaPorCentroCosto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioAsistenciaPorCentroCosto(AsistenciaPorCentroCosto asistenciaporcentrocosto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
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
										
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.asistenciaporcentrocosto,new Object(),generalEntityParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.asistenciaporcentrocostoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=AsistenciaPorCentroCostoConstantesFunciones.getClassesRelationshipsOfAsistenciaPorCentroCosto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=AsistenciaPorCentroCostoConstantesFunciones.getClassesRelationshipsFromStringsOfAsistenciaPorCentroCosto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormAsistenciaPorCentroCosto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.asistenciaporcentrocosto,new Object(),generalEntityParameterGeneral,this.asistenciaporcentrocostoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioAsistenciaPorCentroCosto(AsistenciaPorCentroCostoBean asistenciaporcentrocostoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanAsistenciaPorCentroCosto(ArrayList<Classe> classes,AsistenciaPorCentroCostoReturnGeneral asistenciaporcentrocostoReturnGeneral,AsistenciaPorCentroCostoBean asistenciaporcentrocostoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualAsistenciaPorCentroCosto(AsistenciaPorCentroCosto asistenciaporcentrocosto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.asistenciaporcentrocosto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto = new AsistenciaPorCentroCostoDetalleFormJInternalFrame(jDesktopPane,this.asistenciaporcentrocostoSessionBean.getConGuardarRelaciones(),this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto);
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.setVisible(false);
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.setSelected(false);						
		
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.asistenciaporcentrocostoLogic=this.asistenciaporcentrocostoLogic;
		
		this.cargarCombosFrameForeignKeyAsistenciaPorCentroCosto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleAsistenciaPorCentroCosto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAsistenciaPorCentroCosto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyAsistenciaPorCentroCosto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyAsistenciaPorCentroCosto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAsistenciaPorCentroCosto"));
		
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonModificarAsistenciaPorCentroCosto.addActionListener(new ButtonActionListener(this,"ModificarAsistenciaPorCentroCosto"));

		
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonModificarToolBarAsistenciaPorCentroCosto.addActionListener(new ButtonActionListener(this,"ModificarToolBarAsistenciaPorCentroCosto"));
					
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jMenuItemModificarAsistenciaPorCentroCosto.addActionListener(new ButtonActionListener(this,"MenuItemModificarAsistenciaPorCentroCosto"));		
		
		
		
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonActualizarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"ActualizarAsistenciaPorCentroCosto"));
		
		
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonActualizarToolBarAsistenciaPorCentroCosto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAsistenciaPorCentroCosto"));
						
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jMenuItemActualizarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAsistenciaPorCentroCosto"));		
		
		
		
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonEliminarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"EliminarAsistenciaPorCentroCosto"));
		
		
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonEliminarToolBarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"EliminarToolBarAsistenciaPorCentroCosto"));
								
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jMenuItemEliminarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAsistenciaPorCentroCosto"));		
		
		
		
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonCancelarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"CancelarAsistenciaPorCentroCosto"));
		
		
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonCancelarToolBarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"CancelarToolBarAsistenciaPorCentroCosto"));
					
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jMenuItemCancelarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAsistenciaPorCentroCosto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jMenuItemDetalleCerrarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAsistenciaPorCentroCosto"));		
		
		
		
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonGuardarCambiosToolBarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAsistenciaPorCentroCosto"));
		
		
		
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonGuardarCambiosToolBarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAsistenciaPorCentroCosto"));
		
		
		
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAsistenciaPorCentroCosto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonidAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"idAsistenciaPorCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonid_empresaAsistenciaPorCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAsistenciaPorCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonid_empresaAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAsistenciaPorCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonid_centro_costoAsistenciaPorCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoAsistenciaPorCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonid_centro_costoAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoAsistenciaPorCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonid_empleadoAsistenciaPorCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaPorCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonid_empleadoAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaPorCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonfechaAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"fechaAsistenciaPorCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonporcentajeAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeAsistenciaPorCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonvalor_horaAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"valor_horaAsistenciaPorCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonpermisoAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"permisoAsistenciaPorCentroCostoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTabbedPaneRelacionesAsistenciaPorCentroCosto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAsistenciaPorCentroCosto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameAsistenciaPorCentroCosto"));
		
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAsistenciaPorCentroCosto"));
		}
		
		this.jTableDatosAsistenciaPorCentroCosto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarAsistenciaPorCentroCosto"));
		
		this.jTableDatosAsistenciaPorCentroCosto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarAsistenciaPorCentroCosto"));
		
		this.jButtonNuevoAsistenciaPorCentroCosto.addActionListener(new ButtonActionListener(this,"NuevoAsistenciaPorCentroCosto"));
		
		this.jButtonDuplicarAsistenciaPorCentroCosto.addActionListener(new ButtonActionListener(this,"DuplicarAsistenciaPorCentroCosto"));
		
		this.jButtonCopiarAsistenciaPorCentroCosto.addActionListener(new ButtonActionListener(this,"CopiarAsistenciaPorCentroCosto"));
		
		this.jButtonVerFormAsistenciaPorCentroCosto.addActionListener(new ButtonActionListener(this,"VerFormAsistenciaPorCentroCosto"));
		
		
		this.jButtonNuevoToolBarAsistenciaPorCentroCosto.addActionListener(new ButtonActionListener(this,"NuevoToolBarAsistenciaPorCentroCosto"));
			
		this.jButtonDuplicarToolBarAsistenciaPorCentroCosto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarAsistenciaPorCentroCosto"));
			
		this.jMenuItemNuevoAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoAsistenciaPorCentroCosto"));
			
		this.jMenuItemDuplicarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarAsistenciaPorCentroCosto"));		
		
		
		this.jButtonNuevoRelacionesAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesAsistenciaPorCentroCosto"));
		
		
		this.jButtonNuevoRelacionesToolBarAsistenciaPorCentroCosto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarAsistenciaPorCentroCosto"));
			
		this.jMenuItemNuevoRelacionesAsistenciaPorCentroCosto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesAsistenciaPorCentroCosto"));		
		
		
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonModificarAsistenciaPorCentroCosto.addActionListener(new ButtonActionListener(this,"ModificarAsistenciaPorCentroCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonModificarToolBarAsistenciaPorCentroCosto.addActionListener(new ButtonActionListener(this,"ModificarToolBarAsistenciaPorCentroCosto"));
			
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jMenuItemModificarAsistenciaPorCentroCosto.addActionListener(new ButtonActionListener(this,"MenuItemModificarAsistenciaPorCentroCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonActualizarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"ActualizarAsistenciaPorCentroCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonActualizarToolBarAsistenciaPorCentroCosto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAsistenciaPorCentroCosto"));
				
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jMenuItemActualizarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAsistenciaPorCentroCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonEliminarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"EliminarAsistenciaPorCentroCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonEliminarToolBarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"EliminarToolBarAsistenciaPorCentroCosto"));
						
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jMenuItemEliminarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAsistenciaPorCentroCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonCancelarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"CancelarAsistenciaPorCentroCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonCancelarToolBarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"CancelarToolBarAsistenciaPorCentroCosto"));
			
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jMenuItemCancelarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAsistenciaPorCentroCosto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarAsistenciaPorCentroCosto"));		
		
		
		this.jButtonCerrarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"CerrarAsistenciaPorCentroCosto"));
		
		
		this.jButtonCerrarToolBarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"CerrarToolBarAsistenciaPorCentroCosto"));
			
		this.jMenuItemCerrarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarAsistenciaPorCentroCosto"));
			
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jMenuItemDetalleCerrarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAsistenciaPorCentroCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonGuardarCambiosAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosAsistenciaPorCentroCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonGuardarCambiosToolBarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAsistenciaPorCentroCosto"));
		}
		
		this.jButtonCopiarToolBarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"CopiarToolBarAsistenciaPorCentroCosto"));
			
		this.jButtonVerFormToolBarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"VerFormToolBarAsistenciaPorCentroCosto"));
		
		this.jMenuItemGuardarCambiosAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosAsistenciaPorCentroCosto"));
			
		this.jMenuItemCopiarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarAsistenciaPorCentroCosto"));		
		
		this.jMenuItemVerFormAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormAsistenciaPorCentroCosto"));		
		
		
		this.jButtonGuardarCambiosTablaAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAsistenciaPorCentroCosto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarAsistenciaPorCentroCosto"));
			
		this.jMenuItemGuardarCambiosTablaAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAsistenciaPorCentroCosto"));		
		
		
		
		this.jButtonRecargarInformacionAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"RecargarInformacionAsistenciaPorCentroCosto"));
					
		this.jButtonRecargarInformacionToolBarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarAsistenciaPorCentroCosto"));
		
		this.jMenuItemRecargarInformacionAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionAsistenciaPorCentroCosto"));		
		
		
		
		this.jButtonAnterioresAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"AnterioresAsistenciaPorCentroCosto"));
		
		
		this.jButtonAnterioresToolBarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarAsistenciaPorCentroCosto"));
		
		this.jMenuItemAnterioresAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresAsistenciaPorCentroCosto"));		
		
		
		this.jButtonSiguientesAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"SiguientesAsistenciaPorCentroCosto"));
		
		
		this.jButtonSiguientesToolBarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarAsistenciaPorCentroCosto"));
			
		this.jMenuItemSiguientesAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesAsistenciaPorCentroCosto"));
			
		this.jMenuItemAbrirOrderByAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByAsistenciaPorCentroCosto"));
			
		this.jMenuItemMostrarOcultarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarAsistenciaPorCentroCosto"));
			
		this.jMenuItemDetalleAbrirOrderByAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByAsistenciaPorCentroCosto"));
			
		this.jMenuItemDetalleMostarOcultarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarAsistenciaPorCentroCosto"));		
		
		
		this.jButtonNuevoGuardarCambiosAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosAsistenciaPorCentroCosto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarAsistenciaPorCentroCosto"));
			
		this.jMenuItemNuevoGuardarCambiosAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosAsistenciaPorCentroCosto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosAsistenciaPorCentroCosto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosAsistenciaPorCentroCosto"));

		this.jCheckBoxSeleccionadosAsistenciaPorCentroCosto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosAsistenciaPorCentroCosto"));
		
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAsistenciaPorCentroCosto"));
		}
		
		
		this.jComboBoxTiposRelacionesAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"TiposRelacionesAsistenciaPorCentroCosto"));
			
		this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"TiposAccionesAsistenciaPorCentroCosto"));
					
		this.jComboBoxTiposSeleccionarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarAsistenciaPorCentroCosto"));
			
		this.jTextFieldValorCampoGeneralAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralAsistenciaPorCentroCosto"));		
		
		
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonidAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"idAsistenciaPorCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonid_empresaAsistenciaPorCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAsistenciaPorCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonid_empresaAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAsistenciaPorCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonid_centro_costoAsistenciaPorCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoAsistenciaPorCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonid_centro_costoAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoAsistenciaPorCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonid_empleadoAsistenciaPorCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaPorCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonid_empleadoAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaPorCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonfechaAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"fechaAsistenciaPorCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonporcentajeAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeAsistenciaPorCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonvalor_horaAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"valor_horaAsistenciaPorCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonpermisoAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"permisoAsistenciaPorCentroCostoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCentroCostoAsistenciaPorCentroCosto.addActionListener(new ButtonActionListener(this,"FK_IdCentroCostoAsistenciaPorCentroCosto"));

			this.jButtonFK_IdEmpleadoAsistenciaPorCentroCosto.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoAsistenciaPorCentroCosto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto!=null) {
				this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAsistenciaPorCentroCosto"));
				this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAsistenciaPorCentroCosto"));
				this.jInternalFrameReporteDinamicoAsistenciaPorCentroCosto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAsistenciaPorCentroCosto"));
			}
			
			//this.jButtonCerrarReporteDinamicoAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAsistenciaPorCentroCosto"));				
			//this.jButtonGenerarReporteDinamicoAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAsistenciaPorCentroCosto"));
			//this.jButtonGenerarExcelReporteDinamicoAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAsistenciaPorCentroCosto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionAsistenciaPorCentroCosto!=null) {
				this.jInternalFrameImportacionAsistenciaPorCentroCosto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAsistenciaPorCentroCosto"));
				this.jInternalFrameImportacionAsistenciaPorCentroCosto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAsistenciaPorCentroCosto"));
				this.jInternalFrameImportacionAsistenciaPorCentroCosto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAsistenciaPorCentroCosto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"AbrirOrderByAsistenciaPorCentroCosto"));
			
			this.jButtonAbrirOrderByToolBarAsistenciaPorCentroCosto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarAsistenciaPorCentroCosto"));			
			
			if(this.jInternalFrameOrderByAsistenciaPorCentroCosto!=null) {
				this.jInternalFrameOrderByAsistenciaPorCentroCosto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAsistenciaPorCentroCosto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTabbedPaneRelacionesAsistenciaPorCentroCosto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAsistenciaPorCentroCosto"));
		
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
            		closingInternalFrameAsistenciaPorCentroCosto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormAsistenciaPorCentroCosto = (JInternalFrameBase)event.getSource();
	            	
	            AsistenciaPorCentroCostoBeanSwingJInternalFrame jInternalFrameParent=(AsistenciaPorCentroCostoBeanSwingJInternalFrame)jInternalFrameDetalleFormAsistenciaPorCentroCosto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarAsistenciaPorCentroCostoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosAsistenciaPorCentroCosto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosAsistenciaPorCentroCostoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosAsistenciaPorCentroCosto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosAsistenciaPorCentroCosto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAsistenciaPorCentroCostoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAsistenciaPorCentroCostoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAsistenciaPorCentroCostoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoAsistenciaPorCentroCosto";
		inputMap = this.jButtonNuevoAsistenciaPorCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoAsistenciaPorCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAsistenciaPorCentroCostoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAsistenciaPorCentroCostoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAsistenciaPorCentroCostoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAsistenciaPorCentroCostoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesAsistenciaPorCentroCosto";
		inputMap = this.jButtonNuevoRelacionesAsistenciaPorCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesAsistenciaPorCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAsistenciaPorCentroCostoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarAsistenciaPorCentroCosto";
		inputMap = this.jButtonModificarAsistenciaPorCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarAsistenciaPorCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarAsistenciaPorCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarAsistenciaPorCentroCosto";
		inputMap = this.jButtonActualizarAsistenciaPorCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarAsistenciaPorCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarAsistenciaPorCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarAsistenciaPorCentroCosto";
		inputMap = this.jButtonEliminarAsistenciaPorCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarAsistenciaPorCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarAsistenciaPorCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarAsistenciaPorCentroCosto";
		inputMap = this.jButtonCancelarAsistenciaPorCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarAsistenciaPorCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarAsistenciaPorCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarAsistenciaPorCentroCosto";
		inputMap = this.jButtonCerrarAsistenciaPorCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarAsistenciaPorCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarAsistenciaPorCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonGuardarCambiosAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosAsistenciaPorCentroCosto";
		inputMap = this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonGuardarCambiosAsistenciaPorCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonGuardarCambiosAsistenciaPorCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosAsistenciaPorCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosAsistenciaPorCentroCosto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosAsistenciaPorCentroCostoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesAsistenciaPorCentroCostoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarAsistenciaPorCentroCosto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarAsistenciaPorCentroCostoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralAsistenciaPorCentroCosto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralAsistenciaPorCentroCostoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonidAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"idAsistenciaPorCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonid_empresaAsistenciaPorCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAsistenciaPorCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonid_empresaAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAsistenciaPorCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonid_centro_costoAsistenciaPorCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoAsistenciaPorCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonid_centro_costoAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoAsistenciaPorCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonid_empleadoAsistenciaPorCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaPorCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonid_empleadoAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoAsistenciaPorCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonfechaAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"fechaAsistenciaPorCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonporcentajeAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeAsistenciaPorCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonvalor_horaAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"valor_horaAsistenciaPorCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jButtonpermisoAsistenciaPorCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"permisoAsistenciaPorCentroCostoBusqueda"));
		
		
		this.jButtonFK_IdCentroCostoAsistenciaPorCentroCosto.addActionListener(new ButtonActionListener(this,"FK_IdCentroCostoAsistenciaPorCentroCosto"));

		this.jButtonFK_IdEmpleadoAsistenciaPorCentroCosto.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoAsistenciaPorCentroCosto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionAsistenciaPorCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionAsistenciaPorCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarAsistenciaPorCentroCostoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarAsistenciaPorCentroCosto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosAsistenciaPorCentroCosto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos()) {
					asistenciaporcentrocostoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:asistenciaporcentrocostos) {
					asistenciaporcentrocostoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosAsistenciaPorCentroCostoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAsistenciaPorCentroCosto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos()) {
						asistenciaporcentrocostoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:asistenciaporcentrocostos) {
						asistenciaporcentrocostoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:asistenciaporcentrocostos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaAsistenciaPorCentroCosto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAsistenciaPorCentroCosto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAsistenciaPorCentroCosto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaPorCentroCosto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosAsistenciaPorCentroCostoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAsistenciaPorCentroCosto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosAsistenciaPorCentroCosto.getSelectedRows();
			
			AsistenciaPorCentroCosto asistenciaporcentrocostoLocal=new AsistenciaPorCentroCosto();
			
			//this.seleccionarTodosAsistenciaPorCentroCosto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					asistenciaporcentrocostoLocal =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos().toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					asistenciaporcentrocostoLocal =(AsistenciaPorCentroCosto) this.asistenciaporcentrocostos.toArray()[this.jTableDatosAsistenciaPorCentroCosto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				asistenciaporcentrocostoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos()) {
						asistenciaporcentrocostoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:asistenciaporcentrocostos) {
						asistenciaporcentrocostoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaAsistenciaPorCentroCosto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAsistenciaPorCentroCosto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAsistenciaPorCentroCosto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAsistenciaPorCentroCosto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualAsistenciaPorCentroCostoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarAsistenciaPorCentroCostoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralAsistenciaPorCentroCostoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingAsistenciaPorCentroCosto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralAsistenciaPorCentroCosto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos()) {
				
						if(sTipoSeleccionar.equals(AsistenciaPorCentroCostoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							asistenciaporcentrocostoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaPorCentroCostoConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							asistenciaporcentrocostoAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaPorCentroCostoConstantesFunciones.LABEL_VALORHORA)) {
							existe=true;
							asistenciaporcentrocostoAux.setvalor_hora(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaPorCentroCostoConstantesFunciones.LABEL_PERMISO)) {
							existe=true;
							asistenciaporcentrocostoAux.setpermiso(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:asistenciaporcentrocostos) {
					
						if(sTipoSeleccionar.equals(AsistenciaPorCentroCostoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							asistenciaporcentrocostoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaPorCentroCostoConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							asistenciaporcentrocostoAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaPorCentroCostoConstantesFunciones.LABEL_VALORHORA)) {
							existe=true;
							asistenciaporcentrocostoAux.setvalor_hora(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AsistenciaPorCentroCostoConstantesFunciones.LABEL_PERMISO)) {
							existe=true;
							asistenciaporcentrocostoAux.setpermiso(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaAsistenciaPorCentroCosto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesAsistenciaPorCentroCostoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingAsistenciaPorCentroCosto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioAsistenciaPorCentroCosto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteAsistenciaPorCentroCosto) {				
					conSplash=true;//false;										
					
					//this.startProcessAsistenciaPorCentroCosto(conSplash);
				
					this.generarReporteAsistenciaPorCentroCostosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoAsistenciaPorCentroCostosSeleccionados();
				//this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAsistenciaPorCentroCostosSeleccionados(false);
				//this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAsistenciaPorCentroCostosSeleccionados(true);
				//this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAsistenciaPorCentroCosto();
				
				this.exportarAsistenciaPorCentroCostosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionAsistenciaPorCentroCostos();
				//this.importarAsistenciaPorCentroCostos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAsistenciaPorCentroCosto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelAsistenciaPorCentroCostosSeleccionados();
				//this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Asistencia Por Centro Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessAsistenciaPorCentroCosto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoAsistenciaPorCentroCosto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyAsistenciaPorCentroCosto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Asistencia Por Centro Costo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto.setSelectedIndex(0);					
				}	
			} 			
			else if(AsistenciaPorCentroCostoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteAsistenciaPorCentroCosto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessAsistenciaPorCentroCosto(conSplash);
					
						//this.actualizarParametrosGeneralAsistenciaPorCentroCosto();
						
						this.generarReporteProcesoAccionAsistenciaPorCentroCostosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Asistencia Por Centro CostoS SELECCIONADOS?", "MANTENIMIENTO DE Asistencia Por Centro Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessAsistenciaPorCentroCosto();
				
						this.actualizarParametrosGeneralAsistenciaPorCentroCosto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.asistenciaporcentrocostoReturnGeneral=asistenciaporcentrocostoLogic.procesarAccionAsistenciaPorCentroCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos(),this.asistenciaporcentrocostoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarAsistenciaPorCentroCostoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralAsistenciaPorCentroCosto();
					
					AsistenciaPorCentroCostoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarAsistenciaPorCentroCostoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAsistenciaPorCentroCosto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxTiposAccionesFormularioAsistenciaPorCentroCosto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessAsistenciaPorCentroCosto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesAsistenciaPorCentroCostoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessAsistenciaPorCentroCosto();
			
			if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<AsistenciaPorCentroCosto> asistenciaporcentrocostosSeleccionados=new ArrayList<AsistenciaPorCentroCosto>();		
			AsistenciaPorCentroCosto asistenciaporcentrocosto=new AsistenciaPorCentroCosto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingAsistenciaPorCentroCosto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesAsistenciaPorCentroCosto.getSelectedItem();
			
			
			
			
			asistenciaporcentrocostosSeleccionados=this.getAsistenciaPorCentroCostosSeleccionados(true);
			//this.sTipoAccion;
			
			if(asistenciaporcentrocostosSeleccionados.size()==1) {
				for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:asistenciaporcentrocostosSeleccionados) {
					asistenciaporcentrocosto=asistenciaporcentrocostoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessAsistenciaPorCentroCosto();
			
      		//this.finishProcessAsistenciaPorCentroCosto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarAsistenciaPorCentroCostoReturnGeneral() throws Exception {
		if(this.asistenciaporcentrocostoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.asistenciaporcentrocostoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.asistenciaporcentrocostoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.asistenciaporcentrocostoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.asistenciaporcentrocostoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.asistenciaporcentrocostoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingAsistenciaPorCentroCosto(false);
		}
		
		if(this.asistenciaporcentrocostoReturnGeneral.getConRetornoLista() || this.asistenciaporcentrocostoReturnGeneral.getConRetornoObjeto()) {
			if(this.asistenciaporcentrocostoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.asistenciaporcentrocostoLogic.setAsistenciaPorCentroCostos(this.asistenciaporcentrocostoReturnGeneral.getAsistenciaPorCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.asistenciaporcentrocostoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.asistenciaporcentrocostoLogic.setAsistenciaPorCentroCosto(this.asistenciaporcentrocostoReturnGeneral.getAsistenciaPorCentroCosto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingAsistenciaPorCentroCosto(false);
		}
	}
	
	public void actualizarParametrosGeneralAsistenciaPorCentroCosto() throws Exception {
		
		
	}
	
	public ArrayList<AsistenciaPorCentroCosto> getAsistenciaPorCentroCostosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<AsistenciaPorCentroCosto> asistenciaporcentrocostosSeleccionados=new ArrayList<AsistenciaPorCentroCosto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioAsistenciaPorCentroCosto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos()) {
					if(asistenciaporcentrocostoAux.getIsSelected()) {
						asistenciaporcentrocostosSeleccionados.add(asistenciaporcentrocostoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:this.asistenciaporcentrocostos) {
					if(asistenciaporcentrocostoAux.getIsSelected()) {
						asistenciaporcentrocostosSeleccionados.add(asistenciaporcentrocostoAux);				
					}
				}
			}
			
			if(asistenciaporcentrocostosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						asistenciaporcentrocostosSeleccionados.addAll(this.asistenciaporcentrocostoLogic.getAsistenciaPorCentroCostos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						asistenciaporcentrocostosSeleccionados.addAll(this.asistenciaporcentrocostos);				
					}
				}
			}
		} else {
			asistenciaporcentrocostosSeleccionados.add(this.asistenciaporcentrocosto);
		}
		
		return asistenciaporcentrocostosSeleccionados;
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
	
	public void generarReporteAsistenciaPorCentroCostosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalAsistenciaPorCentroCostosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoAsistenciaPorCentroCostosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAsistenciaPorCentroCostosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAsistenciaPorCentroCostosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Asistencia Por Centro Costo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesAsistenciaPorCentroCostosSeleccionados() throws Exception {
		ArrayList<AsistenciaPorCentroCosto> asistenciaporcentrocostosSeleccionados=new ArrayList<AsistenciaPorCentroCosto>();		
		
		asistenciaporcentrocostosSeleccionados=this.getAsistenciaPorCentroCostosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteAsistenciaPorCentroCostos("Todos",asistenciaporcentrocostosSeleccionados);
		
	}	
	
	public void generarReporteNormalAsistenciaPorCentroCostosSeleccionados() throws Exception {
		ArrayList<AsistenciaPorCentroCosto> asistenciaporcentrocostosSeleccionados=new ArrayList<AsistenciaPorCentroCosto>();		
		
		asistenciaporcentrocostosSeleccionados=this.getAsistenciaPorCentroCostosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteAsistenciaPorCentroCostos("Todos",asistenciaporcentrocostosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionAsistenciaPorCentroCostosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<AsistenciaPorCentroCosto> asistenciaporcentrocostosSeleccionados=new ArrayList<AsistenciaPorCentroCosto>();
		
		asistenciaporcentrocostosSeleccionados=this.getAsistenciaPorCentroCostosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteAsistenciaPorCentroCostos("Todos",asistenciaporcentrocostosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoAsistenciaPorCentroCostosSeleccionados() throws Exception {
		ArrayList<AsistenciaPorCentroCosto> asistenciaporcentrocostosSeleccionados=new ArrayList<AsistenciaPorCentroCosto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoAsistenciaPorCentroCosto();
		
		
		asistenciaporcentrocostosSeleccionados=this.getAsistenciaPorCentroCostosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoAsistenciaPorCentroCosto();
		
		
		//this.generarReporteAsistenciaPorCentroCostos("Todos",asistenciaporcentrocostosSeleccionados ,asistenciaporcentrocostoImplementable,asistenciaporcentrocostoImplementableHome);
	}
	
	public void mostrarImportacionAsistenciaPorCentroCostos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionAsistenciaPorCentroCosto();
		
		this.abrirFrameImportacionAsistenciaPorCentroCosto();		
		
			
		//this.generarReporteAsistenciaPorCentroCostos("Todos",asistenciaporcentrocostosSeleccionados ,asistenciaporcentrocostoImplementable,asistenciaporcentrocostoImplementableHome);
	}
	
	public void importarAsistenciaPorCentroCostos() throws Exception {		
	
	}
	
	public void exportarAsistenciaPorCentroCostosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelAsistenciaPorCentroCostosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoAsistenciaPorCentroCostosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlAsistenciaPorCentroCostosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Asistencia Por Centro Costo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoAsistenciaPorCentroCostosSeleccionados() throws Exception {
		ArrayList<AsistenciaPorCentroCosto> asistenciaporcentrocostosSeleccionados=new ArrayList<AsistenciaPorCentroCosto>();		
		
		asistenciaporcentrocostosSeleccionados=this.getAsistenciaPorCentroCostosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"asistenciaporcentrocosto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarAsistenciaPorCentroCosto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:asistenciaporcentrocostosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarAsistenciaPorCentroCosto(asistenciaporcentrocostoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//asistenciaporcentrocostoAux.setsDetalleGeneralEntityReporte(asistenciaporcentrocostoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Por Centro Costo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarAsistenciaPorCentroCosto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=AsistenciaPorCentroCostoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaPorCentroCostoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaPorCentroCostoConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaPorCentroCostoConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaPorCentroCostoConstantesFunciones.LABEL_VALORHORA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AsistenciaPorCentroCostoConstantesFunciones.LABEL_PERMISO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarAsistenciaPorCentroCosto(AsistenciaPorCentroCosto asistenciaporcentrocosto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=asistenciaporcentrocosto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciaporcentrocosto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciaporcentrocosto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciaporcentrocosto.getcentrocosto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciaporcentrocosto.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciaporcentrocosto.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciaporcentrocosto.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciaporcentrocosto.getvalor_hora().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=asistenciaporcentrocosto.getpermiso().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelAsistenciaPorCentroCostosSeleccionados() throws Exception {
		ArrayList<AsistenciaPorCentroCosto> asistenciaporcentrocostosSeleccionados=new ArrayList<AsistenciaPorCentroCosto>();		
		
		asistenciaporcentrocostosSeleccionados=this.getAsistenciaPorCentroCostosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"asistenciaporcentrocosto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("AsistenciaPorCentroCostos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelAsistenciaPorCentroCosto(row);				
				iRow++;
			}				
			
			for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:asistenciaporcentrocostosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelAsistenciaPorCentroCosto(asistenciaporcentrocostoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Por Centro Costo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlAsistenciaPorCentroCostosSeleccionados() throws Exception {
		ArrayList<AsistenciaPorCentroCosto> asistenciaporcentrocostosSeleccionados=new ArrayList<AsistenciaPorCentroCosto>();		
		
		asistenciaporcentrocostosSeleccionados=this.getAsistenciaPorCentroCostosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"asistenciaporcentrocosto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("asistenciaporcentrocostos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("asistenciaporcentrocosto");
			//elementRoot.appendChild(element);
		
			for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:asistenciaporcentrocostosSeleccionados) {
				element = document.createElement("asistenciaporcentrocosto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlAsistenciaPorCentroCosto(asistenciaporcentrocostoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Asistencia Por Centro Costo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelAsistenciaPorCentroCosto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.LABEL_VALORHORA);
		cell = row.createCell(iColumn++);cell.setCellValue(AsistenciaPorCentroCostoConstantesFunciones.LABEL_PERMISO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelAsistenciaPorCentroCosto(AsistenciaPorCentroCosto asistenciaporcentrocosto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciaporcentrocosto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciaporcentrocosto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciaporcentrocosto.getcentrocosto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciaporcentrocosto.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciaporcentrocosto.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciaporcentrocosto.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciaporcentrocosto.getvalor_hora());
		cell = row.createCell(iColumn++);cell.setCellValue(asistenciaporcentrocosto.getpermiso());				
	}
	
	public void setFilaDatosExportarXmlAsistenciaPorCentroCosto(AsistenciaPorCentroCosto asistenciaporcentrocosto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(AsistenciaPorCentroCostoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(asistenciaporcentrocosto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(AsistenciaPorCentroCostoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(asistenciaporcentrocosto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(AsistenciaPorCentroCostoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(asistenciaporcentrocosto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcentrocosto_descripcion = document.createElement(AsistenciaPorCentroCostoConstantesFunciones.IDCENTROCOSTO);
		elementcentrocosto_descripcion.appendChild(document.createTextNode(asistenciaporcentrocosto.getcentrocosto_descripcion()));
		element.appendChild(elementcentrocosto_descripcion);

		Element elementempleado_descripcion = document.createElement(AsistenciaPorCentroCostoConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(asistenciaporcentrocosto.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementfecha = document.createElement(AsistenciaPorCentroCostoConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(asistenciaporcentrocosto.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementporcentaje = document.createElement(AsistenciaPorCentroCostoConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(asistenciaporcentrocosto.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementvalor_hora = document.createElement(AsistenciaPorCentroCostoConstantesFunciones.VALORHORA);
		elementvalor_hora.appendChild(document.createTextNode(asistenciaporcentrocosto.getvalor_hora().toString().trim()));
		element.appendChild(elementvalor_hora);

		Element elementpermiso = document.createElement(AsistenciaPorCentroCostoConstantesFunciones.PERMISO);
		elementpermiso.appendChild(document.createTextNode(asistenciaporcentrocosto.getpermiso().toString().trim()));
		element.appendChild(elementpermiso);
	}
	
	public void generarReporteGroupGenericoAsistenciaPorCentroCostosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<AsistenciaPorCentroCosto> asistenciaporcentrocostosSeleccionados=new ArrayList<AsistenciaPorCentroCosto>();
		
		asistenciaporcentrocostosSeleccionados=this.getAsistenciaPorCentroCostosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoAsistenciaPorCentroCosto(asistenciaporcentrocostosSeleccionados);
		
		this.generarReporteAsistenciaPorCentroCostos("Todos",asistenciaporcentrocostosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoAsistenciaPorCentroCosto(ArrayList<AsistenciaPorCentroCosto> asistenciaporcentrocostosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(AsistenciaPorCentroCosto asistenciaporcentrocostoAux:asistenciaporcentrocostosSeleccionados) {
				asistenciaporcentrocostoAux.setsDetalleGeneralEntityReporte(asistenciaporcentrocostoAux.toString());
			
				if(sTipoSeleccionar.equals(AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					asistenciaporcentrocostoAux.setsDescripcionGeneralEntityReporte1(asistenciaporcentrocostoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDCENTROCOSTO)) {
					existe=true;
					asistenciaporcentrocostoAux.setsDescripcionGeneralEntityReporte1(asistenciaporcentrocostoAux.getcentrocosto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AsistenciaPorCentroCostoConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					asistenciaporcentrocostoAux.setsDescripcionGeneralEntityReporte1(asistenciaporcentrocostoAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AsistenciaPorCentroCostoConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					asistenciaporcentrocostoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(asistenciaporcentrocostoAux.getfecha()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AsistenciaPorCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesAsistenciaPorCentroCosto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoAsistenciaPorCentroCosto=true;
				this.isVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto=true;
				this.isVisibilidadCeldaGuardarCambiosAsistenciaPorCentroCosto=true;
			}
			
			this.isVisibilidadCeldaModificarAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaActualizarAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaEliminarAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaCancelarAsistenciaPorCentroCosto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAsistenciaPorCentroCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarAsistenciaPorCentroCosto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaModificarAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaActualizarAsistenciaPorCentroCosto=true;
			this.isVisibilidadCeldaEliminarAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaCancelarAsistenciaPorCentroCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAsistenciaPorCentroCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarAsistenciaPorCentroCosto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaModificarAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaActualizarAsistenciaPorCentroCosto=true;
			this.isVisibilidadCeldaEliminarAsistenciaPorCentroCosto=true;
			this.isVisibilidadCeldaCancelarAsistenciaPorCentroCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAsistenciaPorCentroCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarAsistenciaPorCentroCosto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaModificarAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaActualizarAsistenciaPorCentroCosto=true;
			this.isVisibilidadCeldaEliminarAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaCancelarAsistenciaPorCentroCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAsistenciaPorCentroCosto=false;
				} else {
					this.isVisibilidadCeldaGuardarAsistenciaPorCentroCosto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoAsistenciaPorCentroCosto=true;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto=true;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaPorCentroCosto=true;
			this.isVisibilidadCeldaModificarAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaActualizarAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaEliminarAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaCancelarAsistenciaPorCentroCosto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAsistenciaPorCentroCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarAsistenciaPorCentroCosto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaActualizarAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaEliminarAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaCancelarAsistenciaPorCentroCosto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAsistenciaPorCentroCosto=false;
				} else {
					this.isVisibilidadCeldaGuardarAsistenciaPorCentroCosto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaModificarAsistenciaPorCentroCosto=true;
			this.isVisibilidadCeldaActualizarAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaEliminarAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaCancelarAsistenciaPorCentroCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAsistenciaPorCentroCosto=false;
				} else {
					this.isVisibilidadCeldaGuardarAsistenciaPorCentroCosto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(AsistenciaPorCentroCostoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoAsistenciaPorCentroCosto=true;
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto=true;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaPorCentroCosto=true;
		} else {
			this.actualizarEstadoPanelsAsistenciaPorCentroCosto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarAsistenciaPorCentroCosto=false;
			//this.isVisibilidadCeldaVerFormAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaDuplicarAsistenciaPorCentroCosto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!asistenciaporcentrocostoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto=false;
		} else {
			this.isVisibilidadCeldaNuevoAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosAsistenciaPorCentroCosto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
			if(!asistenciaporcentrocostoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto=false;												
			}
			
			this.jButtonCerrarAsistenciaPorCentroCosto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesAsistenciaPorCentroCosto=false;
		}
		
		if(!this.permiteMantenimiento(this.asistenciaporcentrocosto)) {
			this.isVisibilidadCeldaActualizarAsistenciaPorCentroCosto=false;
			this.isVisibilidadCeldaEliminarAsistenciaPorCentroCosto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesAsistenciaPorCentroCosto() {
	}
	
	public void actualizarEstadoPanelsAsistenciaPorCentroCosto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto!=null) {
				this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaPorCentroCosto!=null) {
				this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAsistenciaPorCentroCosto!=null) {
				this.jScrollPanelDatosAsistenciaPorCentroCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionAsistenciaPorCentroCosto!=null) {
				this.jPanelPaginacionAsistenciaPorCentroCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAsistenciaPorCentroCosto!=null) {
				this.jPanelParametrosReportesAsistenciaPorCentroCosto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto!=null) {
				this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaPorCentroCosto!=null) {
				this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosAsistenciaPorCentroCosto!=null) {
				this.jScrollPanelDatosAsistenciaPorCentroCosto.setVisible(false);
			}
			
			if(this.jPanelPaginacionAsistenciaPorCentroCosto!=null) {
				this.jPanelPaginacionAsistenciaPorCentroCosto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAsistenciaPorCentroCosto!=null) {
				this.jPanelParametrosReportesAsistenciaPorCentroCosto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto!=null) {
				this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaPorCentroCosto!=null) {
				this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAsistenciaPorCentroCosto!=null) {
				this.jScrollPanelDatosAsistenciaPorCentroCosto.setVisible(false);
			}
			
			if(this.jPanelPaginacionAsistenciaPorCentroCosto!=null) {
				this.jPanelPaginacionAsistenciaPorCentroCosto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAsistenciaPorCentroCosto!=null) {
				this.jPanelParametrosReportesAsistenciaPorCentroCosto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto!=null) {
				this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaPorCentroCosto!=null) {
				this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAsistenciaPorCentroCosto!=null) {
				this.jScrollPanelDatosAsistenciaPorCentroCosto.setVisible(false);
			}
			
			if(this.jPanelPaginacionAsistenciaPorCentroCosto!=null) {
				this.jPanelPaginacionAsistenciaPorCentroCosto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAsistenciaPorCentroCosto!=null) {
				this.jPanelParametrosReportesAsistenciaPorCentroCosto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto!=null) {
				this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaPorCentroCosto!=null) {
				this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAsistenciaPorCentroCosto!=null) {
				this.jScrollPanelDatosAsistenciaPorCentroCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionAsistenciaPorCentroCosto!=null) {
				this.jPanelPaginacionAsistenciaPorCentroCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAsistenciaPorCentroCosto!=null) {
				this.jPanelParametrosReportesAsistenciaPorCentroCosto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto!=null) {
				this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaPorCentroCosto!=null) {
				this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAsistenciaPorCentroCosto!=null) {
				this.jScrollPanelDatosAsistenciaPorCentroCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionAsistenciaPorCentroCosto!=null) {
				this.jPanelPaginacionAsistenciaPorCentroCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAsistenciaPorCentroCosto!=null) {
				this.jPanelParametrosReportesAsistenciaPorCentroCosto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto!=null) {
				this.jScrollPanelDatosEdicionAsistenciaPorCentroCosto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaPorCentroCosto!=null) {
				this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAsistenciaPorCentroCosto!=null) {
				this.jScrollPanelDatosAsistenciaPorCentroCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionAsistenciaPorCentroCosto!=null) {
				this.jPanelPaginacionAsistenciaPorCentroCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAsistenciaPorCentroCosto!=null) {
				this.jPanelParametrosReportesAsistenciaPorCentroCosto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasAsistenciaPorCentroCosto!=null) {
					this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesAsistenciaPorCentroCosto!=null) {
				this.jPanelParametrosReportesAsistenciaPorCentroCosto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.asistenciaporcentrocostoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAsistenciaPorCentroCosto!=null) {
				this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesAsistenciaPorCentroCosto!=null) {
				this.jPanelParametrosReportesAsistenciaPorCentroCosto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCentroCosto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.remove(jPanelFK_IdCentroCostoAsistenciaPorCentroCosto);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.remove(jPanelFK_IdEmpleadoAsistenciaPorCentroCosto);}
		}
		
	}

	public void setVisibilidadBusquedasParaCentroCosto(Boolean isParaCentroCosto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCentroCostoNegation=!isParaCentroCosto;

			this.isVisibilidadFK_IdCentroCosto=isParaCentroCosto;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.remove(jPanelFK_IdCentroCostoAsistenciaPorCentroCosto);}

			this.isVisibilidadFK_IdEmpleado=isParaCentroCostoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.remove(jPanelFK_IdEmpleadoAsistenciaPorCentroCosto);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdCentroCosto=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.remove(jPanelFK_IdCentroCostoAsistenciaPorCentroCosto);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.remove(jPanelFK_IdEmpleadoAsistenciaPorCentroCosto);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//AsistenciaPorCentroCostoSessionBean asistenciaporcentrocostoSessionBean=new AsistenciaPorCentroCostoSessionBean();
		
		if(this.asistenciaporcentrocostoSessionBean==null) {
			this.asistenciaporcentrocostoSessionBean=new AsistenciaPorCentroCostoSessionBean();
		}
		
		this.asistenciaporcentrocostoSessionBean.setsUltimaBusquedaAsistenciaPorCentroCosto(this.getsAccionBusqueda());
		this.asistenciaporcentrocostoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.asistenciaporcentrocostoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCentroCosto")) {
			asistenciaporcentrocostoSessionBean.setid_centro_costo(this.getid_centro_costoFK_IdCentroCosto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			asistenciaporcentrocostoSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			asistenciaporcentrocostoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//AsistenciaPorCentroCostoSessionBean asistenciaporcentrocostoSessionBean=new AsistenciaPorCentroCostoSessionBean();
		
		if(this.asistenciaporcentrocostoSessionBean==null) {
			this.asistenciaporcentrocostoSessionBean=new AsistenciaPorCentroCostoSessionBean();
		}
		
		if(this.asistenciaporcentrocostoSessionBean.getsUltimaBusquedaAsistenciaPorCentroCosto()!=null&&!this.asistenciaporcentrocostoSessionBean.getsUltimaBusquedaAsistenciaPorCentroCosto().equals("")) {
			this.setsAccionBusqueda(asistenciaporcentrocostoSessionBean.getsUltimaBusquedaAsistenciaPorCentroCosto());
			this.setiNumeroPaginacion(asistenciaporcentrocostoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(asistenciaporcentrocostoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCentroCosto")) {
				this.setid_centro_costoFK_IdCentroCosto(asistenciaporcentrocostoSessionBean.getid_centro_costo());
				asistenciaporcentrocostoSessionBean.setid_centro_costo(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(asistenciaporcentrocostoSessionBean.getid_empleado());
				asistenciaporcentrocostoSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(asistenciaporcentrocostoSessionBean.getid_empresa());
				asistenciaporcentrocostoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.asistenciaporcentrocostoSessionBean.setsUltimaBusquedaAsistenciaPorCentroCosto("");
		this.asistenciaporcentrocostoSessionBean.setiNumeroPaginacion(AsistenciaPorCentroCostoConstantesFunciones.INUMEROPAGINACION);
		this.asistenciaporcentrocostoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaAsistenciaPorCentroCosto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioAsistenciaPorCentroCosto() {
		this.updateBorderResaltarBusquedasFormularioAsistenciaPorCentroCosto();
		this.updateVisibilidadBusquedasFormularioAsistenciaPorCentroCosto();
		this.updateHabilitarBusquedasFormularioAsistenciaPorCentroCosto();
	}
	
	public void updateBorderResaltarBusquedasFormularioAsistenciaPorCentroCosto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.getComponents().length>0) {
	

		if(this.asistenciaporcentrocostoConstantesFunciones.resaltarFK_IdCentroCostoAsistenciaPorCentroCosto!=null) {
			index= this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.indexOfComponent(this.jPanelFK_IdCentroCostoAsistenciaPorCentroCosto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.getComponent(index);
				jPanel.setBorder(this.asistenciaporcentrocostoConstantesFunciones.resaltarFK_IdCentroCostoAsistenciaPorCentroCosto);
			}
		}

		if(this.asistenciaporcentrocostoConstantesFunciones.resaltarFK_IdEmpleadoAsistenciaPorCentroCosto!=null) {
			index= this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.indexOfComponent(this.jPanelFK_IdEmpleadoAsistenciaPorCentroCosto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.getComponent(index);
				jPanel.setBorder(this.asistenciaporcentrocostoConstantesFunciones.resaltarFK_IdEmpleadoAsistenciaPorCentroCosto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioAsistenciaPorCentroCosto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.indexOfComponent(this.jPanelFK_IdCentroCostoAsistenciaPorCentroCosto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.asistenciaporcentrocostoConstantesFunciones.mostrarFK_IdCentroCostoAsistenciaPorCentroCosto);
			if(!this.asistenciaporcentrocostoConstantesFunciones.mostrarFK_IdCentroCostoAsistenciaPorCentroCosto && index>-1) {
				this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.remove(index);
			}

			index= this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.indexOfComponent(this.jPanelFK_IdEmpleadoAsistenciaPorCentroCosto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.asistenciaporcentrocostoConstantesFunciones.mostrarFK_IdEmpleadoAsistenciaPorCentroCosto);
			if(!this.asistenciaporcentrocostoConstantesFunciones.mostrarFK_IdEmpleadoAsistenciaPorCentroCosto && index>-1) {
				this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioAsistenciaPorCentroCosto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.indexOfComponent(this.jPanelFK_IdCentroCostoAsistenciaPorCentroCosto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.asistenciaporcentrocostoConstantesFunciones.activarFK_IdCentroCostoAsistenciaPorCentroCosto);
				this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.setEnabledAt(index,this.asistenciaporcentrocostoConstantesFunciones.activarFK_IdCentroCostoAsistenciaPorCentroCosto);
			}

			index= this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.indexOfComponent(this.jPanelFK_IdEmpleadoAsistenciaPorCentroCosto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.asistenciaporcentrocostoConstantesFunciones.activarFK_IdEmpleadoAsistenciaPorCentroCosto);
				this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.setEnabledAt(index,this.asistenciaporcentrocostoConstantesFunciones.activarFK_IdEmpleadoAsistenciaPorCentroCosto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaAsistenciaPorCentroCosto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCentroCosto")) {
			index= this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.indexOfComponent(this.jPanelFK_IdCentroCostoAsistenciaPorCentroCosto);

			this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.getComponent(index);

			this.asistenciaporcentrocostoConstantesFunciones.setResaltarFK_IdCentroCostoAsistenciaPorCentroCosto(resaltar);

			jPanel.setBorder(this.asistenciaporcentrocostoConstantesFunciones.resaltarFK_IdCentroCostoAsistenciaPorCentroCosto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.indexOfComponent(this.jPanelFK_IdEmpleadoAsistenciaPorCentroCosto);

			this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAsistenciaPorCentroCosto.getComponent(index);

			this.asistenciaporcentrocostoConstantesFunciones.setResaltarFK_IdEmpleadoAsistenciaPorCentroCosto(resaltar);

			jPanel.setBorder(this.asistenciaporcentrocostoConstantesFunciones.resaltarFK_IdEmpleadoAsistenciaPorCentroCosto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarAsistenciaPorCentroCosto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioAsistenciaPorCentroCosto() throws Exception {

		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioAsistenciaPorCentroCosto();
		this.updateVisibilidadResaltarControlesFormularioAsistenciaPorCentroCosto();
		this.updateHabilitarResaltarControlesFormularioAsistenciaPorCentroCosto();
		
	}
	
	public void updateBorderResaltarControlesFormularioAsistenciaPorCentroCosto() throws Exception {
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.asistenciaporcentrocostoConstantesFunciones.resaltaridAsistenciaPorCentroCosto!=null && this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelidAsistenciaPorCentroCosto.setBorder(this.asistenciaporcentrocostoConstantesFunciones.resaltaridAsistenciaPorCentroCosto);}
		if(this.asistenciaporcentrocostoConstantesFunciones.resaltarid_empresaAsistenciaPorCentroCosto!=null && this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empresaAsistenciaPorCentroCosto.setBorder(this.asistenciaporcentrocostoConstantesFunciones.resaltarid_empresaAsistenciaPorCentroCosto);}
		if(this.asistenciaporcentrocostoConstantesFunciones.resaltarid_centro_costoAsistenciaPorCentroCosto!=null && this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_centro_costoAsistenciaPorCentroCosto.setBorder(this.asistenciaporcentrocostoConstantesFunciones.resaltarid_centro_costoAsistenciaPorCentroCosto);}
		if(this.asistenciaporcentrocostoConstantesFunciones.resaltarid_empleadoAsistenciaPorCentroCosto!=null && this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empleadoAsistenciaPorCentroCosto.setBorder(this.asistenciaporcentrocostoConstantesFunciones.resaltarid_empleadoAsistenciaPorCentroCosto);}
		if(this.asistenciaporcentrocostoConstantesFunciones.resaltarfechaAsistenciaPorCentroCosto!=null && this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jDateChooserfechaAsistenciaPorCentroCosto.setBorder(this.asistenciaporcentrocostoConstantesFunciones.resaltarfechaAsistenciaPorCentroCosto);}
		if(this.asistenciaporcentrocostoConstantesFunciones.resaltarporcentajeAsistenciaPorCentroCosto!=null && this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldporcentajeAsistenciaPorCentroCosto.setBorder(this.asistenciaporcentrocostoConstantesFunciones.resaltarporcentajeAsistenciaPorCentroCosto);}
		if(this.asistenciaporcentrocostoConstantesFunciones.resaltarvalor_horaAsistenciaPorCentroCosto!=null && this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldvalor_horaAsistenciaPorCentroCosto.setBorder(this.asistenciaporcentrocostoConstantesFunciones.resaltarvalor_horaAsistenciaPorCentroCosto);}
		if(this.asistenciaporcentrocostoConstantesFunciones.resaltarpermisoAsistenciaPorCentroCosto!=null && this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldpermisoAsistenciaPorCentroCosto.setBorder(this.asistenciaporcentrocostoConstantesFunciones.resaltarpermisoAsistenciaPorCentroCosto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioAsistenciaPorCentroCosto() throws Exception {		
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
	
		//this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelidAsistenciaPorCentroCosto.setVisible(this.asistenciaporcentrocostoConstantesFunciones.mostraridAsistenciaPorCentroCosto);
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jPanelidAsistenciaPorCentroCosto.setVisible(this.asistenciaporcentrocostoConstantesFunciones.mostraridAsistenciaPorCentroCosto);
		//this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empresaAsistenciaPorCentroCosto.setVisible(this.asistenciaporcentrocostoConstantesFunciones.mostrarid_empresaAsistenciaPorCentroCosto);
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jPanelid_empresaAsistenciaPorCentroCosto.setVisible(this.asistenciaporcentrocostoConstantesFunciones.mostrarid_empresaAsistenciaPorCentroCosto);
		//this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_centro_costoAsistenciaPorCentroCosto.setVisible(this.asistenciaporcentrocostoConstantesFunciones.mostrarid_centro_costoAsistenciaPorCentroCosto);
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jPanelid_centro_costoAsistenciaPorCentroCosto.setVisible(this.asistenciaporcentrocostoConstantesFunciones.mostrarid_centro_costoAsistenciaPorCentroCosto);
		//this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empleadoAsistenciaPorCentroCosto.setVisible(this.asistenciaporcentrocostoConstantesFunciones.mostrarid_empleadoAsistenciaPorCentroCosto);
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jPanelid_empleadoAsistenciaPorCentroCosto.setVisible(this.asistenciaporcentrocostoConstantesFunciones.mostrarid_empleadoAsistenciaPorCentroCosto);
		//this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jDateChooserfechaAsistenciaPorCentroCosto.setVisible(this.asistenciaporcentrocostoConstantesFunciones.mostrarfechaAsistenciaPorCentroCosto);
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jPanelfechaAsistenciaPorCentroCosto.setVisible(this.asistenciaporcentrocostoConstantesFunciones.mostrarfechaAsistenciaPorCentroCosto);
		//this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldporcentajeAsistenciaPorCentroCosto.setVisible(this.asistenciaporcentrocostoConstantesFunciones.mostrarporcentajeAsistenciaPorCentroCosto);
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jPanelporcentajeAsistenciaPorCentroCosto.setVisible(this.asistenciaporcentrocostoConstantesFunciones.mostrarporcentajeAsistenciaPorCentroCosto);
		//this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldvalor_horaAsistenciaPorCentroCosto.setVisible(this.asistenciaporcentrocostoConstantesFunciones.mostrarvalor_horaAsistenciaPorCentroCosto);
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jPanelvalor_horaAsistenciaPorCentroCosto.setVisible(this.asistenciaporcentrocostoConstantesFunciones.mostrarvalor_horaAsistenciaPorCentroCosto);
		//this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldpermisoAsistenciaPorCentroCosto.setVisible(this.asistenciaporcentrocostoConstantesFunciones.mostrarpermisoAsistenciaPorCentroCosto);
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jPanelpermisoAsistenciaPorCentroCosto.setVisible(this.asistenciaporcentrocostoConstantesFunciones.mostrarpermisoAsistenciaPorCentroCosto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioAsistenciaPorCentroCosto() throws Exception {
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAsistenciaPorCentroCosto!=null) {
	
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jLabelidAsistenciaPorCentroCosto.setEnabled(this.asistenciaporcentrocostoConstantesFunciones.activaridAsistenciaPorCentroCosto);
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empresaAsistenciaPorCentroCosto.setEnabled(this.asistenciaporcentrocostoConstantesFunciones.activarid_empresaAsistenciaPorCentroCosto);
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_centro_costoAsistenciaPorCentroCosto.setEnabled(this.asistenciaporcentrocostoConstantesFunciones.activarid_centro_costoAsistenciaPorCentroCosto);
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jComboBoxid_empleadoAsistenciaPorCentroCosto.setEnabled(this.asistenciaporcentrocostoConstantesFunciones.activarid_empleadoAsistenciaPorCentroCosto);
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jDateChooserfechaAsistenciaPorCentroCosto.setEnabled(this.asistenciaporcentrocostoConstantesFunciones.activarfechaAsistenciaPorCentroCosto);
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldporcentajeAsistenciaPorCentroCosto.setEnabled(this.asistenciaporcentrocostoConstantesFunciones.activarporcentajeAsistenciaPorCentroCosto);
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldvalor_horaAsistenciaPorCentroCosto.setEnabled(this.asistenciaporcentrocostoConstantesFunciones.activarvalor_horaAsistenciaPorCentroCosto);
		this.jInternalFrameDetalleFormAsistenciaPorCentroCosto.jTextFieldpermisoAsistenciaPorCentroCosto.setEnabled(this.asistenciaporcentrocostoConstantesFunciones.activarpermisoAsistenciaPorCentroCosto);
		}
	}
	
		
}